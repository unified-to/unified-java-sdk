/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PropertyConnectionCategories {
    PASSTHROUGH("passthrough"),
    HRIS("hris"),
    ATS("ats"),
    AUTH("auth"),
    CRM("crm"),
    ENRICH("enrich"),
    MARTECH("martech"),
    TICKETING("ticketing"),
    UC("uc");

    @JsonValue
    public final String value;

    private PropertyConnectionCategories(String value) {
        this.value = value;
    }
}
