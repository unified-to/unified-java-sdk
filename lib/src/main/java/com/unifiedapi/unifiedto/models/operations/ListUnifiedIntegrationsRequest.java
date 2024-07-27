/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class ListUnifiedIntegrationsRequest {
    /**
     * Filter the results for only the workspace's active integrations
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=active")
    public Boolean active;

    public ListUnifiedIntegrationsRequest withActive(Boolean active) {
        this.active = active;
        return this;
    }
    
    /**
     * Filter the results on these categories
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=categories")
    public ListUnifiedIntegrationsQueryParamCategories[] categories;

    public ListUnifiedIntegrationsRequest withCategories(ListUnifiedIntegrationsQueryParamCategories[] categories) {
        this.categories = categories;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=env")
    public String env;

    public ListUnifiedIntegrationsRequest withEnv(String env) {
        this.env = env;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Double limit;

    public ListUnifiedIntegrationsRequest withLimit(Double limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Double offset;

    public ListUnifiedIntegrationsRequest withOffset(Double offset) {
        this.offset = offset;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=order")
    public String order;

    public ListUnifiedIntegrationsRequest withOrder(String order) {
        this.order = order;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    public String sort;

    public ListUnifiedIntegrationsRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=summary")
    public Boolean summary;

    public ListUnifiedIntegrationsRequest withSummary(Boolean summary) {
        this.summary = summary;
        return this;
    }
    
    /**
     * Filter the results for only this integration type
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=type")
    public String type;

    public ListUnifiedIntegrationsRequest withType(String type) {
        this.type = type;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_gte")
    public String updatedGte;

    public ListUnifiedIntegrationsRequest withUpdatedGte(String updatedGte) {
        this.updatedGte = updatedGte;
        return this;
    }
    
    public ListUnifiedIntegrationsRequest(){}
}
