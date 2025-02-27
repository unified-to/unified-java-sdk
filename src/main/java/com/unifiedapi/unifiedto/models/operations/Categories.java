/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.operations;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum Categories {
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
    SCIM("scim"),
    LMS("lms"),
    REPO("repo"),
    METADATA("metadata");

    @JsonValue
    private final String value;

    private Categories(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Categories> fromValue(String value) {
        for (Categories o: Categories.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
