/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateKmsSpaceRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.KmsSpace kmsSpace;

    public CreateKmsSpaceRequest withKmsSpace(com.unifiedapi.unifiedto.models.shared.KmsSpace kmsSpace) {
        this.kmsSpace = kmsSpace;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateKmsSpaceRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public CreateKmsSpaceRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
