/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AtsInterviewStatus {
    SCHEDULED("SCHEDULED"),
    AWAITING_FEEDBACK("AWAITING_FEEDBACK"),
    COMPLETE("COMPLETE"),
    CANCELED("CANCELED"),
    NEEDS_SCHEDULING("NEEDS_SCHEDULING");

    @JsonValue
    public final String value;

    private AtsInterviewStatus(String value) {
        this.value = value;
    }
}
