/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EmploymentStatus {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE");

    @JsonValue
    public final String value;

    private EmploymentStatus(String value) {
        this.value = value;
    }
}
