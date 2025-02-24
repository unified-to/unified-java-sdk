/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.Webhook;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class CreateUnifiedWebhookRequest {

    /**
     * A webhook is used to POST new/updated information to your server.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private Webhook webhook;

    /**
     * When set, all of the existing data will sent back to your server.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=include_all")
    private Optional<Boolean> includeAll;

    @JsonCreator
    public CreateUnifiedWebhookRequest(
            Webhook webhook,
            Optional<Boolean> includeAll) {
        Utils.checkNotNull(webhook, "webhook");
        Utils.checkNotNull(includeAll, "includeAll");
        this.webhook = webhook;
        this.includeAll = includeAll;
    }
    
    public CreateUnifiedWebhookRequest(
            Webhook webhook) {
        this(webhook, Optional.empty());
    }

    /**
     * A webhook is used to POST new/updated information to your server.
     */
    @JsonIgnore
    public Webhook webhook() {
        return webhook;
    }

    /**
     * When set, all of the existing data will sent back to your server.
     */
    @JsonIgnore
    public Optional<Boolean> includeAll() {
        return includeAll;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A webhook is used to POST new/updated information to your server.
     */
    public CreateUnifiedWebhookRequest withWebhook(Webhook webhook) {
        Utils.checkNotNull(webhook, "webhook");
        this.webhook = webhook;
        return this;
    }

    /**
     * When set, all of the existing data will sent back to your server.
     */
    public CreateUnifiedWebhookRequest withIncludeAll(boolean includeAll) {
        Utils.checkNotNull(includeAll, "includeAll");
        this.includeAll = Optional.ofNullable(includeAll);
        return this;
    }

    /**
     * When set, all of the existing data will sent back to your server.
     */
    public CreateUnifiedWebhookRequest withIncludeAll(Optional<Boolean> includeAll) {
        Utils.checkNotNull(includeAll, "includeAll");
        this.includeAll = includeAll;
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
        CreateUnifiedWebhookRequest other = (CreateUnifiedWebhookRequest) o;
        return 
            Objects.deepEquals(this.webhook, other.webhook) &&
            Objects.deepEquals(this.includeAll, other.includeAll);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            webhook,
            includeAll);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateUnifiedWebhookRequest.class,
                "webhook", webhook,
                "includeAll", includeAll);
    }
    
    public final static class Builder {
 
        private Webhook webhook;
 
        private Optional<Boolean> includeAll = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A webhook is used to POST new/updated information to your server.
         */
        public Builder webhook(Webhook webhook) {
            Utils.checkNotNull(webhook, "webhook");
            this.webhook = webhook;
            return this;
        }

        /**
         * When set, all of the existing data will sent back to your server.
         */
        public Builder includeAll(boolean includeAll) {
            Utils.checkNotNull(includeAll, "includeAll");
            this.includeAll = Optional.ofNullable(includeAll);
            return this;
        }

        /**
         * When set, all of the existing data will sent back to your server.
         */
        public Builder includeAll(Optional<Boolean> includeAll) {
            Utils.checkNotNull(includeAll, "includeAll");
            this.includeAll = includeAll;
            return this;
        }
        
        public CreateUnifiedWebhookRequest build() {
            return new CreateUnifiedWebhookRequest(
                webhook,
                includeAll);
        }
    }
}

