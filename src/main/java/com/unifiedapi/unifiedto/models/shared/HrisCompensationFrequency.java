/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum HrisCompensationFrequency {
    ONE_TIME("ONE_TIME"),
    DAY("DAY"),
    QUARTER("QUARTER"),
    YEAR("YEAR"),
    HOUR("HOUR"),
    MONTH("MONTH"),
    WEEK("WEEK");

    @JsonValue
    private final String value;

    private HrisCompensationFrequency(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
