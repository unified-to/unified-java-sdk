/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20UserGender {
    FEMALE("Female"),
    MALE("Male");

    @JsonValue
    private final String value;

    private PropertyUserUrnIetfParamsScimSchemasExtensionPeakon20UserGender(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
