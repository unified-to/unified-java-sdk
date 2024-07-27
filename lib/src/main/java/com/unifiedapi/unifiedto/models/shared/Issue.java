/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Issue {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    public String createdAt;

    public Issue withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public Issue withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("resolution_time")
    public Double resolutionTime;

    public Issue withResolutionTime(Double resolutionTime) {
        this.resolutionTime = resolutionTime;
        return this;
    }
    
    @JsonProperty("status")
    public IssueStatus status;

    public Issue withStatus(IssueStatus status) {
        this.status = status;
        return this;
    }
    
    @JsonProperty("ticket_ref")
    public String ticketRef;

    public Issue withTicketRef(String ticketRef) {
        this.ticketRef = ticketRef;
        return this;
    }
    
    @JsonProperty("title")
    public String title;

    public Issue withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String[] type;

    public Issue withType(String[] type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    public String updatedAt;

    public Issue withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    public String url;

    public Issue withUrl(String url) {
        this.url = url;
        return this;
    }
    
    @JsonProperty("workspace_id")
    public String workspaceId;

    public Issue withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
    public Issue(@JsonProperty("status") IssueStatus status, @JsonProperty("ticket_ref") String ticketRef, @JsonProperty("title") String title, @JsonProperty("workspace_id") String workspaceId) {
        this.status = status;
        this.ticketRef = ticketRef;
        this.title = title;
        this.workspaceId = workspaceId;
  }
}
