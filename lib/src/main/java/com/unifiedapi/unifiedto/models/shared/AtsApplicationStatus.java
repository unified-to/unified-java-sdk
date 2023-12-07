/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AtsApplicationStatus {
    NEW_("NEW"),
    REVIEWING("REVIEWING"),
    SCREENING("SCREENING"),
    SUBMITTED("SUBMITTED"),
    FIRST_INTERVIEW("FIRST_INTERVIEW"),
    SECOND_INTERVIEW("SECOND_INTERVIEW"),
    THIRD_INTERVIEW("THIRD_INTERVIEW"),
    BACKGROUND_CHECK("BACKGROUND_CHECK"),
    OFFERED("OFFERED"),
    ACCEPTED("ACCEPTED"),
    HIRED("HIRED"),
    REJECTED("REJECTED"),
    WITHDRAWN("WITHDRAWN");

    @JsonValue
    public final String value;

    private AtsApplicationStatus(String value) {
        this.value = value;
    }
}
