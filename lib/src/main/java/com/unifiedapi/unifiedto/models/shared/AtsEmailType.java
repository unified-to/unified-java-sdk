/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AtsEmailType {
    WORK("WORK"),
    HOME("HOME"),
    OTHER("OTHER");

    @JsonValue
    public final String value;

    private AtsEmailType(String value) {
        this.value = value;
    }
}
