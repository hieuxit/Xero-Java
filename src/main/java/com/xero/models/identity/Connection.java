/*
 * Xero oAuth 2 identity service
 * This specifing endpoints related to managing authentication tokens and identity for Xero API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.identity;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Connection
 */

public class Connection {
  
  @JsonProperty("id")
  private UUID id;

  
  @JsonProperty("tenantId")
  private UUID tenantId;

  
  @JsonProperty("tenantType")
  private String tenantType;

  public Connection id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Xero identifier
   * @return id
  **/
  @ApiModelProperty(value = "Xero identifier")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Connection tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Xero identifier of organisation
   * @return tenantId
  **/
  @ApiModelProperty(value = "Xero identifier of organisation")
  public UUID getTenantId() {
    return tenantId;
  }

  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  public Connection tenantType(String tenantType) {
    this.tenantType = tenantType;
    return this;
  }

   /**
   * Xero tenant type (i.e. ORGANISATION, PRACTICE)
   * @return tenantType
  **/
  @ApiModelProperty(value = "Xero tenant type (i.e. ORGANISATION, PRACTICE)")
  public String getTenantType() {
    return tenantType;
  }

  public void setTenantType(String tenantType) {
    this.tenantType = tenantType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connection connection = (Connection) o;
    return Objects.equals(this.id, connection.id) &&
        Objects.equals(this.tenantId, connection.tenantId) &&
        Objects.equals(this.tenantType, connection.tenantType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, tenantType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connection {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantType: ").append(toIndentedString(tenantType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

