/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class ListUnifiedIntegrationWorkspacesRequest {
    /**
     * Filter the results for only the workspace's active integrations
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=active")
    public Boolean active;

    public ListUnifiedIntegrationWorkspacesRequest withActive(Boolean active) {
        this.active = active;
        return this;
    }
    
    /**
     * Filter the results on these categories
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=categories")
    public QueryParamCategories[] categories;

    public ListUnifiedIntegrationWorkspacesRequest withCategories(QueryParamCategories[] categories) {
        this.categories = categories;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=env")
    public String env;

    public ListUnifiedIntegrationWorkspacesRequest withEnv(String env) {
        this.env = env;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Double limit;

    public ListUnifiedIntegrationWorkspacesRequest withLimit(Double limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Double offset;

    public ListUnifiedIntegrationWorkspacesRequest withOffset(Double offset) {
        this.offset = offset;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=summary")
    public Boolean summary;

    public ListUnifiedIntegrationWorkspacesRequest withSummary(Boolean summary) {
        this.summary = summary;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_gte")
    public String updatedGte;

    public ListUnifiedIntegrationWorkspacesRequest withUpdatedGte(String updatedGte) {
        this.updatedGte = updatedGte;
        return this;
    }
    
    /**
     * The ID of the workspace
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspace_id")
    public String workspaceId;

    public ListUnifiedIntegrationWorkspacesRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
    public ListUnifiedIntegrationWorkspacesRequest(@JsonProperty("workspace_id") String workspaceId) {
        this.workspaceId = workspaceId;
  }
}
