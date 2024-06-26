/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateKmsPageRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.KmsPage kmsPage;

    public CreateKmsPageRequest withKmsPage(com.unifiedapi.unifiedto.models.shared.KmsPage kmsPage) {
        this.kmsPage = kmsPage;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateKmsPageRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public CreateKmsPageRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
