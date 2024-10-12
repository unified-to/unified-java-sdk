/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

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
    COMMERCE("commerce"),
    PAYMENT("payment"),
    GENAI("genai"),
    MESSAGING("messaging"),
    KMS("kms"),
    TASK("task"),
    SCIM("scim");

    @JsonValue
    private final String value;

    private PropertyIntegrationCategories(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
