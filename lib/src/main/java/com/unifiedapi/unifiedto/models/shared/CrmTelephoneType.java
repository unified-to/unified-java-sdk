/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CrmTelephoneType {
    WORK("WORK"),
    HOME("HOME"),
    OTHER("OTHER"),
    FAX("FAX"),
    MOBILE("MOBILE");

    @JsonValue
    public final String value;

    private CrmTelephoneType(String value) {
        this.value = value;
    }
}
