/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum PropertyPropertyIntegrationSupportWebhookEventsDeleted {
    VIRTUAL("virtual"),
    NATIVE("native");

    @JsonValue
    private final String value;

    private PropertyPropertyIntegrationSupportWebhookEventsDeleted(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
