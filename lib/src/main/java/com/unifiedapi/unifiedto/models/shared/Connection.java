/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.unifiedapi.unifiedto.utils.DateTimeDeserializer;
import com.unifiedapi.unifiedto.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

/**
 * Connection - A connection represents a specific authentication of an integration.
 */

public class Connection {
    /**
     * An authentication object that represents a specific authorized user's connection to an integration.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth")
    public PropertyConnectionAuth auth;

    public Connection withAuth(PropertyConnectionAuth auth) {
        this.auth = auth;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_aws_arn")
    public String authAwsArn;

    public Connection withAuthAwsArn(String authAwsArn) {
        this.authAwsArn = authAwsArn;
        return this;
    }
    
    /**
     * The Integration categories that this connection supports
     */
    @JsonProperty("categories")
    public PropertyConnectionCategories[] categories;

    public Connection withCategories(PropertyConnectionCategories[] categories) {
        this.categories = categories;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public Connection withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("environment")
    public String environment;

    public Connection withEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_xref")
    public String externalXref;

    public Connection withExternalXref(String externalXref) {
        this.externalXref = externalXref;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public Connection withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("integration_type")
    public String integrationType;

    public Connection withIntegrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_paused")
    public Boolean isPaused;

    public Connection withIsPaused(Boolean isPaused) {
        this.isPaused = isPaused;
        return this;
    }
    
    @JsonProperty("permissions")
    public PropertyConnectionPermissions[] permissions;

    public Connection withPermissions(PropertyConnectionPermissions[] permissions) {
        this.permissions = permissions;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public Connection withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("workspace_id")
    public String workspaceId;

    public Connection withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
    public Connection(@JsonProperty("categories") PropertyConnectionCategories[] categories, @JsonProperty("integration_type") String integrationType, @JsonProperty("permissions") PropertyConnectionPermissions[] permissions) {
        this.categories = categories;
        this.integrationType = integrationType;
        this.permissions = permissions;
  }
}