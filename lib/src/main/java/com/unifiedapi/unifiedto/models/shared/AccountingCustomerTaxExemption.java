/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountingCustomerTaxExemption {
    FEDERAL_GOV("FEDERAL_GOV"),
    REGION_GOV("REGION_GOV"),
    LOCAL_GOV("LOCAL_GOV"),
    TRIBAL_GOV("TRIBAL_GOV"),
    CHARITABLE_ORG("CHARITABLE_ORG"),
    RELIGIOUS_ORG("RELIGIOUS_ORG"),
    EDUCATIONAL_ORG("EDUCATIONAL_ORG"),
    MEDICAL_ORG("MEDICAL_ORG"),
    RESALE("RESALE"),
    FOREIGN("FOREIGN"),
    OTHER("OTHER");

    @JsonValue
    public final String value;

    private AccountingCustomerTaxExemption(String value) {
        this.value = value;
    }
}
