/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum WeightUnit {
    G("g"),
    KG("kg"),
    OZ("oz"),
    LB("lb");

    @JsonValue
    public final String value;

    private WeightUnit(String value) {
        this.value = value;
    }
}
