/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AtsJobStatus {
    ARCHIVED("ARCHIVED"),
    PENDING("PENDING"),
    DRAFT("DRAFT"),
    OPEN("OPEN"),
    CLOSED("CLOSED");

    @JsonValue
    public final String value;

    private AtsJobStatus(String value) {
        this.value = value;
    }
}
