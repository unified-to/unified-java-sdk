/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class Security {
    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header,name=authorization")
    public String jwt;

    public Security withJwt(String jwt) {
        this.jwt = jwt;
        return this;
    }
    
    public Security(@JsonProperty("jwt") String jwt) {
        this.jwt = jwt;
  }
}