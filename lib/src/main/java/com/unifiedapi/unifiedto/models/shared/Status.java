/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Status {
    ACTIVE("ACTIVE"),
    ARCHIVED("ARCHIVED");

    @JsonValue
    public final String value;

    private Status(String value) {
        this.value = value;
    }
}
