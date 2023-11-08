/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Frequency {
    ONE_TIME("ONE_TIME"),
    DAY("DAY"),
    QUARTER("QUARTER"),
    YEAR("YEAR"),
    HOUR("HOUR"),
    MONTH("MONTH"),
    WEEK("WEEK");

    @JsonValue
    public final String value;

    private Frequency(String value) {
        this.value = value;
    }
}