/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class PatchUnifiedWebhookTriggerRequest {
    /**
     * ID of the Webhook
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public PatchUnifiedWebhookTriggerRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public PatchUnifiedWebhookTriggerRequest(@JsonProperty("id") String id) {
        this.id = id;
  }
}
