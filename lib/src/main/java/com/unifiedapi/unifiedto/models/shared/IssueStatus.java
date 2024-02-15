/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum IssueStatus {
    ON_HOLD("ON_HOLD"),
    NEW_("NEW"),
    IN_PROGRESS("IN_PROGRESS"),
    VALIDATING("VALIDATING"),
    COMPLETE("COMPLETE"),
    REJECTED("REJECTED");

    @JsonValue
    public final String value;

    private IssueStatus(String value) {
        this.value = value;
    }
}