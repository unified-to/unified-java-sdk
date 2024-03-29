/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PropertyCrmEventNote - The note object, when type = note
 */

public class PropertyCrmEventNote {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public PropertyCrmEventNote withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public PropertyCrmEventNote withTitle(String title) {
        this.title = title;
        return this;
    }
    
    public PropertyCrmEventNote(){}
}
