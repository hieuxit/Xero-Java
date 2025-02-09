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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * LeaveEarningsLine
 */

public class LeaveEarningsLine {
  
  @JsonProperty("EarningsRateID")
  private UUID earningsRateID;

  
  @JsonProperty("RatePerUnit")
  private Float ratePerUnit;

  
  @JsonProperty("NumberOfUnits")
  private Float numberOfUnits;

  public LeaveEarningsLine earningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
    return this;
  }

   /**
   * Xero identifier
   * @return earningsRateID
  **/
  @ApiModelProperty(example = "e0eb6747-7c17-4075-b804-989f8d4e5d39", value = "Xero identifier")
  public UUID getEarningsRateID() {
    return earningsRateID;
  }

  public void setEarningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
  }

  public LeaveEarningsLine ratePerUnit(Float ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
    return this;
  }

   /**
   * Rate per unit of the EarningsLine.
   * @return ratePerUnit
  **/
  @ApiModelProperty(example = "38.0", value = "Rate per unit of the EarningsLine.")
  public Float getRatePerUnit() {
    return ratePerUnit;
  }

  public void setRatePerUnit(Float ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
  }

  public LeaveEarningsLine numberOfUnits(Float numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

   /**
   * Earnings rate number of units.
   * @return numberOfUnits
  **/
  @ApiModelProperty(example = "2.5", value = "Earnings rate number of units.")
  public Float getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(Float numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveEarningsLine leaveEarningsLine = (LeaveEarningsLine) o;
    return Objects.equals(this.earningsRateID, leaveEarningsLine.earningsRateID) &&
        Objects.equals(this.ratePerUnit, leaveEarningsLine.ratePerUnit) &&
        Objects.equals(this.numberOfUnits, leaveEarningsLine.numberOfUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earningsRateID, ratePerUnit, numberOfUnits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveEarningsLine {\n");
    sb.append("    earningsRateID: ").append(toIndentedString(earningsRateID)).append("\n");
    sb.append("    ratePerUnit: ").append(toIndentedString(ratePerUnit)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
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

