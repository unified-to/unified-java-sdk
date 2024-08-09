/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetUnifiedIntegrationLoginRequest {

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=env")
    private Optional<String> env;

    /**
     * The URL where you want the user to be redirect to after an unsuccessful authentication. An "error" variable will be appended.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=failure_redirect")
    private Optional<String> failureRedirect;

    /**
     * Type of the supported integration
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=integration_type")
    private String integrationType;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=redirect")
    private Optional<Boolean> redirect;

    /**
     * Extra state to send back to your success URL
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=state")
    private Optional<String> state;

    /**
     * The URL where you want the user to be redirect to after a successful authentication/sign-in.  A "jwt" parameter will be appended to the URL which will contain a name and email of the user who just signed-in.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=success_redirect")
    private Optional<String> successRedirect;

    /**
     * The ID of the workspace
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspace_id")
    private String workspaceId;

    @JsonCreator
    public GetUnifiedIntegrationLoginRequest(
            Optional<String> env,
            Optional<String> failureRedirect,
            String integrationType,
            Optional<Boolean> redirect,
            Optional<String> state,
            Optional<String> successRedirect,
            String workspaceId) {
        Utils.checkNotNull(env, "env");
        Utils.checkNotNull(failureRedirect, "failureRedirect");
        Utils.checkNotNull(integrationType, "integrationType");
        Utils.checkNotNull(redirect, "redirect");
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(successRedirect, "successRedirect");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.env = env;
        this.failureRedirect = failureRedirect;
        this.integrationType = integrationType;
        this.redirect = redirect;
        this.state = state;
        this.successRedirect = successRedirect;
        this.workspaceId = workspaceId;
    }
    
    public GetUnifiedIntegrationLoginRequest(
            String integrationType,
            String workspaceId) {
        this(Optional.empty(), Optional.empty(), integrationType, Optional.empty(), Optional.empty(), Optional.empty(), workspaceId);
    }

    @JsonIgnore
    public Optional<String> env() {
        return env;
    }

    /**
     * The URL where you want the user to be redirect to after an unsuccessful authentication. An "error" variable will be appended.
     */
    @JsonIgnore
    public Optional<String> failureRedirect() {
        return failureRedirect;
    }

    /**
     * Type of the supported integration
     */
    @JsonIgnore
    public String integrationType() {
        return integrationType;
    }

    @JsonIgnore
    public Optional<Boolean> redirect() {
        return redirect;
    }

    /**
     * Extra state to send back to your success URL
     */
    @JsonIgnore
    public Optional<String> state() {
        return state;
    }

    /**
     * The URL where you want the user to be redirect to after a successful authentication/sign-in.  A "jwt" parameter will be appended to the URL which will contain a name and email of the user who just signed-in.
     */
    @JsonIgnore
    public Optional<String> successRedirect() {
        return successRedirect;
    }

    /**
     * The ID of the workspace
     */
    @JsonIgnore
    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetUnifiedIntegrationLoginRequest withEnv(String env) {
        Utils.checkNotNull(env, "env");
        this.env = Optional.ofNullable(env);
        return this;
    }

    public GetUnifiedIntegrationLoginRequest withEnv(Optional<String> env) {
        Utils.checkNotNull(env, "env");
        this.env = env;
        return this;
    }

    /**
     * The URL where you want the user to be redirect to after an unsuccessful authentication. An "error" variable will be appended.
     */
    public GetUnifiedIntegrationLoginRequest withFailureRedirect(String failureRedirect) {
        Utils.checkNotNull(failureRedirect, "failureRedirect");
        this.failureRedirect = Optional.ofNullable(failureRedirect);
        return this;
    }

    /**
     * The URL where you want the user to be redirect to after an unsuccessful authentication. An "error" variable will be appended.
     */
    public GetUnifiedIntegrationLoginRequest withFailureRedirect(Optional<String> failureRedirect) {
        Utils.checkNotNull(failureRedirect, "failureRedirect");
        this.failureRedirect = failureRedirect;
        return this;
    }

    /**
     * Type of the supported integration
     */
    public GetUnifiedIntegrationLoginRequest withIntegrationType(String integrationType) {
        Utils.checkNotNull(integrationType, "integrationType");
        this.integrationType = integrationType;
        return this;
    }

    public GetUnifiedIntegrationLoginRequest withRedirect(boolean redirect) {
        Utils.checkNotNull(redirect, "redirect");
        this.redirect = Optional.ofNullable(redirect);
        return this;
    }

    public GetUnifiedIntegrationLoginRequest withRedirect(Optional<Boolean> redirect) {
        Utils.checkNotNull(redirect, "redirect");
        this.redirect = redirect;
        return this;
    }

    /**
     * Extra state to send back to your success URL
     */
    public GetUnifiedIntegrationLoginRequest withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * Extra state to send back to your success URL
     */
    public GetUnifiedIntegrationLoginRequest withState(Optional<String> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    /**
     * The URL where you want the user to be redirect to after a successful authentication/sign-in.  A "jwt" parameter will be appended to the URL which will contain a name and email of the user who just signed-in.
     */
    public GetUnifiedIntegrationLoginRequest withSuccessRedirect(String successRedirect) {
        Utils.checkNotNull(successRedirect, "successRedirect");
        this.successRedirect = Optional.ofNullable(successRedirect);
        return this;
    }

    /**
     * The URL where you want the user to be redirect to after a successful authentication/sign-in.  A "jwt" parameter will be appended to the URL which will contain a name and email of the user who just signed-in.
     */
    public GetUnifiedIntegrationLoginRequest withSuccessRedirect(Optional<String> successRedirect) {
        Utils.checkNotNull(successRedirect, "successRedirect");
        this.successRedirect = successRedirect;
        return this;
    }

    /**
     * The ID of the workspace
     */
    public GetUnifiedIntegrationLoginRequest withWorkspaceId(String workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = workspaceId;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetUnifiedIntegrationLoginRequest other = (GetUnifiedIntegrationLoginRequest) o;
        return 
            Objects.deepEquals(this.env, other.env) &&
            Objects.deepEquals(this.failureRedirect, other.failureRedirect) &&
            Objects.deepEquals(this.integrationType, other.integrationType) &&
            Objects.deepEquals(this.redirect, other.redirect) &&
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.successRedirect, other.successRedirect) &&
            Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            env,
            failureRedirect,
            integrationType,
            redirect,
            state,
            successRedirect,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetUnifiedIntegrationLoginRequest.class,
                "env", env,
                "failureRedirect", failureRedirect,
                "integrationType", integrationType,
                "redirect", redirect,
                "state", state,
                "successRedirect", successRedirect,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private Optional<String> env = Optional.empty();
 
        private Optional<String> failureRedirect = Optional.empty();
 
        private String integrationType;
 
        private Optional<Boolean> redirect = Optional.empty();
 
        private Optional<String> state = Optional.empty();
 
        private Optional<String> successRedirect = Optional.empty();
 
        private String workspaceId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder env(String env) {
            Utils.checkNotNull(env, "env");
            this.env = Optional.ofNullable(env);
            return this;
        }

        public Builder env(Optional<String> env) {
            Utils.checkNotNull(env, "env");
            this.env = env;
            return this;
        }

        /**
         * The URL where you want the user to be redirect to after an unsuccessful authentication. An "error" variable will be appended.
         */
        public Builder failureRedirect(String failureRedirect) {
            Utils.checkNotNull(failureRedirect, "failureRedirect");
            this.failureRedirect = Optional.ofNullable(failureRedirect);
            return this;
        }

        /**
         * The URL where you want the user to be redirect to after an unsuccessful authentication. An "error" variable will be appended.
         */
        public Builder failureRedirect(Optional<String> failureRedirect) {
            Utils.checkNotNull(failureRedirect, "failureRedirect");
            this.failureRedirect = failureRedirect;
            return this;
        }

        /**
         * Type of the supported integration
         */
        public Builder integrationType(String integrationType) {
            Utils.checkNotNull(integrationType, "integrationType");
            this.integrationType = integrationType;
            return this;
        }

        public Builder redirect(boolean redirect) {
            Utils.checkNotNull(redirect, "redirect");
            this.redirect = Optional.ofNullable(redirect);
            return this;
        }

        public Builder redirect(Optional<Boolean> redirect) {
            Utils.checkNotNull(redirect, "redirect");
            this.redirect = redirect;
            return this;
        }

        /**
         * Extra state to send back to your success URL
         */
        public Builder state(String state) {
            Utils.checkNotNull(state, "state");
            this.state = Optional.ofNullable(state);
            return this;
        }

        /**
         * Extra state to send back to your success URL
         */
        public Builder state(Optional<String> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        /**
         * The URL where you want the user to be redirect to after a successful authentication/sign-in.  A "jwt" parameter will be appended to the URL which will contain a name and email of the user who just signed-in.
         */
        public Builder successRedirect(String successRedirect) {
            Utils.checkNotNull(successRedirect, "successRedirect");
            this.successRedirect = Optional.ofNullable(successRedirect);
            return this;
        }

        /**
         * The URL where you want the user to be redirect to after a successful authentication/sign-in.  A "jwt" parameter will be appended to the URL which will contain a name and email of the user who just signed-in.
         */
        public Builder successRedirect(Optional<String> successRedirect) {
            Utils.checkNotNull(successRedirect, "successRedirect");
            this.successRedirect = successRedirect;
            return this;
        }

        /**
         * The ID of the workspace
         */
        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public GetUnifiedIntegrationLoginRequest build() {
            return new GetUnifiedIntegrationLoginRequest(
                env,
                failureRedirect,
                integrationType,
                redirect,
                state,
                successRedirect,
                workspaceId);
        }
    }
}

