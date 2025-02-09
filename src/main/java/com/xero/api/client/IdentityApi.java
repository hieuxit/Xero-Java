package com.xero.api.client;

import com.xero.api.ApiClient;

import com.xero.models.identity.Connection;
import com.xero.api.XeroApiException;
import com.xero.api.XeroApiExceptionHandler;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.FileContent;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.io.ByteArrayInputStream;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class IdentityApi {
    private ApiClient apiClient;
    private static IdentityApi instance = null;
    private String userAgent = "Default";
    private String version = "3.1.3";

    public IdentityApi() {
        this(new ApiClient());
    }

    public static IdentityApi getInstance(ApiClient apiClient) {
      if (instance == null) {
        instance = new IdentityApi(apiClient);
      }
      return instance;
    }

    public IdentityApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
    
    public String getUserAgent() {
        return this.userAgent +  "[Xero-Java-" + this.version + "]";
    }

  /**
    * Allows you to retrieve the connections for this users
    * Override the base server url that include version
    * <p><b>200</b> - Success - return response of type Connections array with 0 to n Connection
    * @param accessToken Authorization token for user set in header of each request
    * @return List&lt;Connection&gt;
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public List<Connection>  getConnections(String accessToken) throws IOException {
        try {
            TypeReference<List<Connection>> typeRef = new TypeReference<List<Connection>>() {};
            HttpResponse response = getConnectionsForHttpResponse(accessToken);
            return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
        } catch (HttpResponseException e) {
            XeroApiExceptionHandler handler = new XeroApiExceptionHandler();
            handler.execute(e,apiClient);
        } catch (IOException ioe) {
            throw ioe;
        }
        return null;
    }

    public HttpResponse getConnectionsForHttpResponse(String accessToken) throws IOException {
        
        if (accessToken == null) {
            throw new IllegalArgumentException("Missing the required parameter 'accessToken' when calling getConnections");
        }
        HttpHeaders headers = new HttpHeaders();
        
        headers.setAccept("application/json"); 
        headers.setUserAgent(this.getUserAgent());
        
        String correctPath = "/connections";
        UriBuilder uriBuilder = UriBuilder.fromUri("https://api.xero.com" + correctPath);
        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        
        HttpContent content = null;
        Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod()).setAccessToken(accessToken);
        HttpTransport transport = apiClient.getHttpTransport();       
        HttpRequestFactory requestFactory = transport.createRequestFactory(credential);
        
        return requestFactory.buildRequest(HttpMethods.GET, genericUrl, content).setHeaders(headers).execute();
    }


    public ByteArrayInputStream convertInputToByteArray(InputStream is) throws IOException {
        byte[] bytes = IOUtils.toByteArray(is);
        try {
            // Process the input stream..
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            return byteArrayInputStream;
        } finally {
            is.close();
        }
        
    }
}
