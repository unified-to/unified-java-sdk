/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MaritalStatus {
    MARRIED("MARRIED"),
    SINGLE("SINGLE");

    @JsonValue
    public final String value;

    private MaritalStatus(String value) {
        this.value = value;
    }
}