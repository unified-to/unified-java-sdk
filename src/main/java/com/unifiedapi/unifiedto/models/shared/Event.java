/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum Event {
    UPDATED("updated"),
    CREATED("created"),
    DELETED("deleted");

    @JsonValue
    private final String value;

    private Event(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}