/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AtsStatus {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public AtsStatus withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public AtsStatus withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("original_status")
    public String originalStatus;

    public AtsStatus withOriginalStatus(String originalStatus) {
        this.originalStatus = originalStatus;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public PropertyAtsStatusRaw raw;

    public AtsStatus withRaw(PropertyAtsStatusRaw raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public AtsStatusStatus status;

    public AtsStatus withStatus(AtsStatusStatus status) {
        this.status = status;
        return this;
    }
    
    public AtsStatus(@JsonProperty("original_status") String originalStatus) {
        this.originalStatus = originalStatus;
  }
}
