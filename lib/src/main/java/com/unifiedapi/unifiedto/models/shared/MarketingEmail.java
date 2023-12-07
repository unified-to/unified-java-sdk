/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MarketingEmail {
    @JsonProperty("email")
    public String email;

    public MarketingEmail withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public MarketingEmailType type;

    public MarketingEmail withType(MarketingEmailType type) {
        this.type = type;
        return this;
    }
    
    public MarketingEmail(@JsonProperty("email") String email) {
        this.email = email;
  }
}
