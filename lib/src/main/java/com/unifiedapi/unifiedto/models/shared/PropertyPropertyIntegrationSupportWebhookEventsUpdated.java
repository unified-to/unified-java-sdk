/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PropertyPropertyIntegrationSupportWebhookEventsUpdated {
    VIRTUAL("virtual"),
    NATIVE_("native");

    @JsonValue
    public final String value;

    private PropertyPropertyIntegrationSupportWebhookEventsUpdated(String value) {
        this.value = value;
    }
}