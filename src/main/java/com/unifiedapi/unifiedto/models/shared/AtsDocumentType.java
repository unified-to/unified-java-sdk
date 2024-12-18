/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum AtsDocumentType {
    RESUME("RESUME"),
    COVER_LETTER("COVER_LETTER"),
    OFFER_PACKET("OFFER_PACKET"),
    OFFER_LETTER("OFFER_LETTER"),
    TAKE_HOME_TEST("TAKE_HOME_TEST"),
    OTHER("OTHER");

    @JsonValue
    private final String value;

    private AtsDocumentType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<AtsDocumentType> fromValue(String value) {
        for (AtsDocumentType o: AtsDocumentType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
