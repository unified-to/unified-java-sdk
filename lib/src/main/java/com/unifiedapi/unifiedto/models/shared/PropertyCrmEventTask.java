/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PropertyCrmEventTask - The task object, when type = task
 */

public class PropertyCrmEventTask {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public PropertyCrmEventTask withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public PropertyCrmEventTask withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public String status;

    public PropertyCrmEventTask withStatus(String status) {
        this.status = status;
        return this;
    }
    
    public PropertyCrmEventTask(){}
}