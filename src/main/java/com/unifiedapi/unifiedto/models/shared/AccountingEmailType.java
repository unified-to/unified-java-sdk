/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum AccountingEmailType {
    WORK("WORK"),
    HOME("HOME"),
    OTHER("OTHER");

    @JsonValue
    private final String value;

    private AccountingEmailType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<AccountingEmailType> fromValue(String value) {
        for (AccountingEmailType o: AccountingEmailType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
