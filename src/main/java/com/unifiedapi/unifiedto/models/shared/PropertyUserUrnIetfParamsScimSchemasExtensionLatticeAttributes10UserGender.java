/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum PropertyUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10UserGender {
    FEMALE("female"),
    MALE("male");

    @JsonValue
    private final String value;

    private PropertyUserUrnIetfParamsScimSchemasExtensionLatticeAttributes10UserGender(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}