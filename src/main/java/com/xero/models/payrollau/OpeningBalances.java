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
import com.xero.models.payrollau.DeductionLine;
import com.xero.models.payrollau.EarningsLine;
import com.xero.models.payrollau.LeaveLine;
import com.xero.models.payrollau.ReimbursementLine;
import com.xero.models.payrollau.SuperLine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * OpeningBalances
 */

public class OpeningBalances {
  
  @JsonProperty("OpeningBalanceDate")
  private String openingBalanceDate;

  
  @JsonProperty("Tax")
  private String tax;

  
  @JsonProperty("EarningsLines")
  private List<EarningsLine> earningsLines = new ArrayList<EarningsLine>();

  
  @JsonProperty("DeductionLines")
  private List<DeductionLine> deductionLines = new ArrayList<DeductionLine>();

  
  @JsonProperty("SuperLines")
  private List<SuperLine> superLines = new ArrayList<SuperLine>();

  
  @JsonProperty("ReimbursementLines")
  private List<ReimbursementLine> reimbursementLines = new ArrayList<ReimbursementLine>();

  
  @JsonProperty("LeaveLines")
  private List<LeaveLine> leaveLines = new ArrayList<LeaveLine>();

  public OpeningBalances openingBalanceDate(String openingBalanceDate) {
    this.openingBalanceDate = openingBalanceDate;
    return this;
  }

   /**
   * Opening Balance Date. (YYYY-MM-DD)
   * @return openingBalanceDate
  **/
  @ApiModelProperty(value = "Opening Balance Date. (YYYY-MM-DD)")
  public String getOpeningBalanceDate() {
    return openingBalanceDate;
  }

  public void setOpeningBalanceDate(String openingBalanceDate) {
    this.openingBalanceDate = openingBalanceDate;
  }

  public OpeningBalances tax(String tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Opening Balance tax
   * @return tax
  **/
  @ApiModelProperty(example = "4333d5cd-53a5-4c31-98e5-a8b4e5676b0b", value = "Opening Balance tax")
  public String getTax() {
    return tax;
  }

  public void setTax(String tax) {
    this.tax = tax;
  }

  public OpeningBalances earningsLines(List<EarningsLine> earningsLines) {
    this.earningsLines = earningsLines;
    return this;
  }

  public OpeningBalances addEarningsLinesItem(EarningsLine earningsLinesItem) {
    if (this.earningsLines == null) {
      this.earningsLines = new ArrayList<EarningsLine>();
    }
    this.earningsLines.add(earningsLinesItem);
    return this;
  }

   /**
   * Get earningsLines
   * @return earningsLines
  **/
  @ApiModelProperty(value = "")
  public List<EarningsLine> getEarningsLines() {
    return earningsLines;
  }

  public void setEarningsLines(List<EarningsLine> earningsLines) {
    this.earningsLines = earningsLines;
  }

  public OpeningBalances deductionLines(List<DeductionLine> deductionLines) {
    this.deductionLines = deductionLines;
    return this;
  }

  public OpeningBalances addDeductionLinesItem(DeductionLine deductionLinesItem) {
    if (this.deductionLines == null) {
      this.deductionLines = new ArrayList<DeductionLine>();
    }
    this.deductionLines.add(deductionLinesItem);
    return this;
  }

   /**
   * Get deductionLines
   * @return deductionLines
  **/
  @ApiModelProperty(value = "")
  public List<DeductionLine> getDeductionLines() {
    return deductionLines;
  }

  public void setDeductionLines(List<DeductionLine> deductionLines) {
    this.deductionLines = deductionLines;
  }

  public OpeningBalances superLines(List<SuperLine> superLines) {
    this.superLines = superLines;
    return this;
  }

  public OpeningBalances addSuperLinesItem(SuperLine superLinesItem) {
    if (this.superLines == null) {
      this.superLines = new ArrayList<SuperLine>();
    }
    this.superLines.add(superLinesItem);
    return this;
  }

   /**
   * Get superLines
   * @return superLines
  **/
  @ApiModelProperty(value = "")
  public List<SuperLine> getSuperLines() {
    return superLines;
  }

  public void setSuperLines(List<SuperLine> superLines) {
    this.superLines = superLines;
  }

  public OpeningBalances reimbursementLines(List<ReimbursementLine> reimbursementLines) {
    this.reimbursementLines = reimbursementLines;
    return this;
  }

  public OpeningBalances addReimbursementLinesItem(ReimbursementLine reimbursementLinesItem) {
    if (this.reimbursementLines == null) {
      this.reimbursementLines = new ArrayList<ReimbursementLine>();
    }
    this.reimbursementLines.add(reimbursementLinesItem);
    return this;
  }

   /**
   * Get reimbursementLines
   * @return reimbursementLines
  **/
  @ApiModelProperty(value = "")
  public List<ReimbursementLine> getReimbursementLines() {
    return reimbursementLines;
  }

  public void setReimbursementLines(List<ReimbursementLine> reimbursementLines) {
    this.reimbursementLines = reimbursementLines;
  }

  public OpeningBalances leaveLines(List<LeaveLine> leaveLines) {
    this.leaveLines = leaveLines;
    return this;
  }

  public OpeningBalances addLeaveLinesItem(LeaveLine leaveLinesItem) {
    if (this.leaveLines == null) {
      this.leaveLines = new ArrayList<LeaveLine>();
    }
    this.leaveLines.add(leaveLinesItem);
    return this;
  }

   /**
   * Get leaveLines
   * @return leaveLines
  **/
  @ApiModelProperty(value = "")
  public List<LeaveLine> getLeaveLines() {
    return leaveLines;
  }

  public void setLeaveLines(List<LeaveLine> leaveLines) {
    this.leaveLines = leaveLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpeningBalances openingBalances = (OpeningBalances) o;
    return Objects.equals(this.openingBalanceDate, openingBalances.openingBalanceDate) &&
        Objects.equals(this.tax, openingBalances.tax) &&
        Objects.equals(this.earningsLines, openingBalances.earningsLines) &&
        Objects.equals(this.deductionLines, openingBalances.deductionLines) &&
        Objects.equals(this.superLines, openingBalances.superLines) &&
        Objects.equals(this.reimbursementLines, openingBalances.reimbursementLines) &&
        Objects.equals(this.leaveLines, openingBalances.leaveLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openingBalanceDate, tax, earningsLines, deductionLines, superLines, reimbursementLines, leaveLines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpeningBalances {\n");
    sb.append("    openingBalanceDate: ").append(toIndentedString(openingBalanceDate)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    earningsLines: ").append(toIndentedString(earningsLines)).append("\n");
    sb.append("    deductionLines: ").append(toIndentedString(deductionLines)).append("\n");
    sb.append("    superLines: ").append(toIndentedString(superLines)).append("\n");
    sb.append("    reimbursementLines: ").append(toIndentedString(reimbursementLines)).append("\n");
    sb.append("    leaveLines: ").append(toIndentedString(leaveLines)).append("\n");
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

