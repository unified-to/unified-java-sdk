/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

public enum QueryParamCategories {
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
    COMMERCE("commerce"),
    PAYMENT("payment"),
    GENAI("genai"),
    MESSAGING("messaging"),
    KMS("kms"),
    TASK("task");

    @JsonValue
    public final String value;

    private QueryParamCategories(String value) {
        this.value = value;
    }
}
