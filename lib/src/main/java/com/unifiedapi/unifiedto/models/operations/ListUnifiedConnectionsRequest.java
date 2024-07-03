/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;


public class ListUnifiedConnectionsRequest {
    /**
     * Filter the results on these categories
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=categories")
    public Categories[] categories;

    public ListUnifiedConnectionsRequest withCategories(Categories[] categories) {
        this.categories = categories;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=env")
    public String env;

    public ListUnifiedConnectionsRequest withEnv(String env) {
        this.env = env;
        return this;
    }
    
    /**
     * Filter the results to only those integrations for your user referenced by this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=external_xref")
    public String externalXref;

    public ListUnifiedConnectionsRequest withExternalXref(String externalXref) {
        this.externalXref = externalXref;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Double limit;

    public ListUnifiedConnectionsRequest withLimit(Double limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Double offset;

    public ListUnifiedConnectionsRequest withOffset(Double offset) {
        this.offset = offset;
        return this;
    }
    
    /**
     * Return only results whose updated date is equal or greater to this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_gte")
    public OffsetDateTime updatedGte;

    public ListUnifiedConnectionsRequest withUpdatedGte(OffsetDateTime updatedGte) {
        this.updatedGte = updatedGte;
        return this;
    }
    
    public ListUnifiedConnectionsRequest(){}
}
