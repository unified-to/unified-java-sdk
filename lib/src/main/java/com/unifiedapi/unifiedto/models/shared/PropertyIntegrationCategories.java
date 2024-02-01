/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PropertyIntegrationCategories {
    PASSTHROUGH("passthrough"),
    HRIS("hris"),
    ATS("ats"),
    AUTH("auth"),
    CRM("crm"),
    ENRICH("enrich"),
    MARTECH("martech"),
    TICKETING("ticketing"),
    UC("uc"),
    ACCOUNTING("accounting"),
    STORAGE("storage"),
    COMMERCE("commerce");

    @JsonValue
    public final String value;

    private PropertyIntegrationCategories(String value) {
        this.value = value;
    }
}
