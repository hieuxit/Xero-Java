/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrollau;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.payrollau.Timesheet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Timesheets
 */

public class Timesheets {
  
  @JsonProperty("Timesheets")
  private List<Timesheet> timesheets = new ArrayList<Timesheet>();

  public Timesheets timesheets(List<Timesheet> timesheets) {
    this.timesheets = timesheets;
    return this;
  }

  public Timesheets addTimesheetsItem(Timesheet timesheetsItem) {
    if (this.timesheets == null) {
      this.timesheets = new ArrayList<Timesheet>();
    }
    this.timesheets.add(timesheetsItem);
    return this;
  }

   /**
   * Get timesheets
   * @return timesheets
  **/
  @ApiModelProperty(value = "")
  public List<Timesheet> getTimesheets() {
    return timesheets;
  }

  public void setTimesheets(List<Timesheet> timesheets) {
    this.timesheets = timesheets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timesheets timesheets = (Timesheets) o;
    return Objects.equals(this.timesheets, timesheets.timesheets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timesheets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timesheets {\n");
    sb.append("    timesheets: ").append(toIndentedString(timesheets)).append("\n");
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

