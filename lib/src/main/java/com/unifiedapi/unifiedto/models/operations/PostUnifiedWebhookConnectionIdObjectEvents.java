/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PostUnifiedWebhookConnectionIdObjectEvents {
    UPDATED("updated"),
    CREATED("created");

    @JsonValue
    public final String value;

    private PostUnifiedWebhookConnectionIdObjectEvents(String value) {
        this.value = value;
    }
}
