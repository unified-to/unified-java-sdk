/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class HrisPayslipDetail {
    @JsonProperty("amount")
    public Double amount;

    public HrisPayslipDetail withAmount(Double amount) {
        this.amount = amount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_amount")
    public Double companyAmount;

    public HrisPayslipDetail withCompanyAmount(Double companyAmount) {
        this.companyAmount = companyAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public HrisPayslipDetail withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_amount")
    public Double employeeAmount;

    public HrisPayslipDetail withEmployeeAmount(Double employeeAmount) {
        this.employeeAmount = employeeAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public HrisPayslipDetail withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public HrisPayslipDetailType type;

    public HrisPayslipDetail withType(HrisPayslipDetailType type) {
        this.type = type;
        return this;
    }
    
    public HrisPayslipDetail(@JsonProperty("amount") Double amount) {
        this.amount = amount;
  }
}
