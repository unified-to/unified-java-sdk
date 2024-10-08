/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum AtsInterviewStatus {
    SCHEDULED("SCHEDULED"),
    AWAITING_FEEDBACK("AWAITING_FEEDBACK"),
    COMPLETE("COMPLETE"),
    CANCELED("CANCELED"),
    NEEDS_SCHEDULING("NEEDS_SCHEDULING");

    @JsonValue
    private final String value;

    private AtsInterviewStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
