/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ListProjectId {
    SUPPORTED_REQUIRED("supported-required"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");

    @JsonValue
    public final String value;

    private ListProjectId(String value) {
        this.value = value;
    }
}
