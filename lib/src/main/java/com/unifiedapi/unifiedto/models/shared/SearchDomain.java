/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SearchDomain {
    SUPPORTED_REQUIRED("supported-required"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");

    @JsonValue
    public final String value;

    private SearchDomain(String value) {
        this.value = value;
    }
}
