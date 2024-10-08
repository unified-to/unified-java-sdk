/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum AtsJobStatus {
    ARCHIVED("ARCHIVED"),
    PENDING("PENDING"),
    DRAFT("DRAFT"),
    OPEN("OPEN"),
    CLOSED("CLOSED");

    @JsonValue
    private final String value;

    private AtsJobStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
