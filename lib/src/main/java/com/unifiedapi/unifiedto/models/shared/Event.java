/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Event {
    UPDATED("updated"),
    CREATED("created"),
    DELETED("deleted");

    @JsonValue
    public final String value;

    private Event(String value) {
        this.value = value;
    }
}
