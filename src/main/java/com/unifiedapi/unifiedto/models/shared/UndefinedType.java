/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum UndefinedType {
    USER("User"),
    GROUP("Group");

    @JsonValue
    private final String value;

    private UndefinedType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
