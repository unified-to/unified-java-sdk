/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum PropertyIntegrationSupportWebhookEventsUpdated {
    VIRTUAL("virtual"),
    NATIVE("native");

    @JsonValue
    private final String value;

    private PropertyIntegrationSupportWebhookEventsUpdated(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PropertyIntegrationSupportWebhookEventsUpdated> fromValue(String value) {
        for (PropertyIntegrationSupportWebhookEventsUpdated o: PropertyIntegrationSupportWebhookEventsUpdated.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
