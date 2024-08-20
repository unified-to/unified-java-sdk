/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum PropertyCrmEventTaskStatus {
    COMPLETED("COMPLETED"),
    NOT_STARTED("NOT_STARTED"),
    WORK_IN_PROGRESS("WORK_IN_PROGRESS"),
    DEFERRED("DEFERRED");

    @JsonValue
    private final String value;

    private PropertyCrmEventTaskStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
