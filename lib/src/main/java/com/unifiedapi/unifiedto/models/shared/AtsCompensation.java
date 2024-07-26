/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AtsCompensation {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    public String currency;

    public AtsCompensation withCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("frequency")
    public Frequency frequency;

    public AtsCompensation withFrequency(Frequency frequency) {
        this.frequency = frequency;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max")
    public Double max;

    public AtsCompensation withMax(Double max) {
        this.max = max;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("min")
    public Double min;

    public AtsCompensation withMin(Double min) {
        this.min = min;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public AtsCompensationType type;

    public AtsCompensation withType(AtsCompensationType type) {
        this.type = type;
        return this;
    }
    
    public AtsCompensation(){}
}
