/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class DeleteUnifiedWebhookIdRequest {
    /**
     * ID of the Webhook
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public DeleteUnifiedWebhookIdRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public DeleteUnifiedWebhookIdRequest(@JsonProperty("id") String id) {
        this.id = id;
  }
}
