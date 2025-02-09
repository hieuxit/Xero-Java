/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.TrackingCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * TrackingCategories
 */

public class TrackingCategories {
  
  @JsonProperty("TrackingCategories")
  private List<TrackingCategory> trackingCategories = new ArrayList<TrackingCategory>();

  public TrackingCategories trackingCategories(List<TrackingCategory> trackingCategories) {
    this.trackingCategories = trackingCategories;
    return this;
  }

  public TrackingCategories addTrackingCategoriesItem(TrackingCategory trackingCategoriesItem) {
    if (this.trackingCategories == null) {
      this.trackingCategories = new ArrayList<TrackingCategory>();
    }
    this.trackingCategories.add(trackingCategoriesItem);
    return this;
  }

   /**
   * Get trackingCategories
   * @return trackingCategories
  **/
  @ApiModelProperty(value = "")
  public List<TrackingCategory> getTrackingCategories() {
    return trackingCategories;
  }

  public void setTrackingCategories(List<TrackingCategory> trackingCategories) {
    this.trackingCategories = trackingCategories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingCategories trackingCategories = (TrackingCategories) o;
    return Objects.equals(this.trackingCategories, trackingCategories.trackingCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingCategories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingCategories {\n");
    sb.append("    trackingCategories: ").append(toIndentedString(trackingCategories)).append("\n");
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

