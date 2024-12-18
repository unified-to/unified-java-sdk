/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum AccountingContactPaymentMethodType {
    ACH("ACH"),
    ALIPAY("ALIPAY"),
    CARD("CARD"),
    GIROPAY("GIROPAY"),
    IDEAL("IDEAL"),
    OTHER("OTHER"),
    PAYPAL("PAYPAL");

    @JsonValue
    private final String value;

    private AccountingContactPaymentMethodType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<AccountingContactPaymentMethodType> fromValue(String value) {
        for (AccountingContactPaymentMethodType o: AccountingContactPaymentMethodType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
