/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentRefundStatus {
    SUCCEEDED("SUCCEEDED"),
    PENDING("PENDING"),
    FAILED("FAILED"),
    CANCELED("CANCELED");

    @JsonValue
    public final String value;

    private PaymentRefundStatus(String value) {
        this.value = value;
    }
}
