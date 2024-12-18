/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum PaymentCollectionMethod {
    SEND_INVOICE("send_invoice"),
    CHARGE_AUTOMATICALLY("charge_automatically");

    @JsonValue
    private final String value;

    private PaymentCollectionMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PaymentCollectionMethod> fromValue(String value) {
        for (PaymentCollectionMethod o: PaymentCollectionMethod.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
