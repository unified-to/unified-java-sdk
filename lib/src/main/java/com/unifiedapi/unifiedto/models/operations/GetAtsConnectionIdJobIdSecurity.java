/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class GetAtsConnectionIdJobIdSecurity {
    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header,name=authorization")
    public String jwt;

    public GetAtsConnectionIdJobIdSecurity withJwt(String jwt) {
        this.jwt = jwt;
        return this;
    }
    
    public GetAtsConnectionIdJobIdSecurity(@JsonProperty("jwt") String jwt) {
        this.jwt = jwt;
  }
}