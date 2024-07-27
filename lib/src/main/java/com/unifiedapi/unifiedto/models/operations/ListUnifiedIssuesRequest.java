/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;


public class ListUnifiedIssuesRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Double limit;

    public ListUnifiedIssuesRequest withLimit(Double limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Double offset;

    public ListUnifiedIssuesRequest withOffset(Double offset) {
        this.offset = offset;
        return this;
    }
    
    /**
     * Return only results whose updated date is equal or greater to this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_gte")
    public OffsetDateTime updatedGte;

    public ListUnifiedIssuesRequest withUpdatedGte(OffsetDateTime updatedGte) {
        this.updatedGte = updatedGte;
        return this;
    }
    
    public ListUnifiedIssuesRequest(){}
}
