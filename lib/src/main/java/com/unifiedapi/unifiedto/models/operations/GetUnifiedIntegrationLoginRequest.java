/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class GetUnifiedIntegrationLoginRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=env")
    public String env;

    public GetUnifiedIntegrationLoginRequest withEnv(String env) {
        this.env = env;
        return this;
    }
    
    /**
     * The URL where you want the user to be redirect to after an unsuccessful authentication. An "error" variable will be appended.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=failure_redirect")
    public String failureRedirect;

    public GetUnifiedIntegrationLoginRequest withFailureRedirect(String failureRedirect) {
        this.failureRedirect = failureRedirect;
        return this;
    }
    
    /**
     * Type of the supported integration
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=integration_type")
    public String integrationType;

    public GetUnifiedIntegrationLoginRequest withIntegrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=redirect")
    public Boolean redirect;

    public GetUnifiedIntegrationLoginRequest withRedirect(Boolean redirect) {
        this.redirect = redirect;
        return this;
    }
    
    /**
     * Extra state to send back to your success URL
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=state")
    public String state;

    public GetUnifiedIntegrationLoginRequest withState(String state) {
        this.state = state;
        return this;
    }
    
    /**
     * The URL where you want the user to be redirect to after a successful authentication/sign-in.  A "jwt" parameter will be appended to the URL which will contain a name and email of the user who just signed-in.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=success_redirect")
    public String successRedirect;

    public GetUnifiedIntegrationLoginRequest withSuccessRedirect(String successRedirect) {
        this.successRedirect = successRedirect;
        return this;
    }
    
    /**
     * The ID of the workspace
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspace_id")
    public String workspaceId;

    public GetUnifiedIntegrationLoginRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
    public GetUnifiedIntegrationLoginRequest(@JsonProperty("integration_type") String integrationType, @JsonProperty("workspace_id") String workspaceId) {
        this.integrationType = integrationType;
        this.workspaceId = workspaceId;
  }
}
