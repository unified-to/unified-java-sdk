/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum WebhookType {
    VIRTUAL("virtual"),
    NATIVE_("native");

    @JsonValue
    public final String value;

    private WebhookType(String value) {
        this.value = value;
    }
}
