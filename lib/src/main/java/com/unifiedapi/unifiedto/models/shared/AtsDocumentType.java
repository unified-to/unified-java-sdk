/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AtsDocumentType {
    RESUME("RESUME"),
    COVER_LETTER("COVER_LETTER"),
    OFFER_PACKET("OFFER_PACKET"),
    OFFER_LETTER("OFFER_LETTER"),
    TAKE_HOME_TEST("TAKE_HOME_TEST"),
    OTHER("OTHER");

    @JsonValue
    public final String value;

    private AtsDocumentType(String value) {
        this.value = value;
    }
}
