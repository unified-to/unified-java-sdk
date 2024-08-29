/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.MarketingMember;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class PatchMartechMemberRequest {

    /**
     * A member represents a person
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends MarketingMember> marketingMember;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * ID of the Member
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public PatchMartechMemberRequest(
            Optional<? extends MarketingMember> marketingMember,
            String connectionId,
            String id) {
        Utils.checkNotNull(marketingMember, "marketingMember");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(id, "id");
        this.marketingMember = marketingMember;
        this.connectionId = connectionId;
        this.id = id;
    }
    
    public PatchMartechMemberRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, id);
    }

    /**
     * A member represents a person
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MarketingMember> marketingMember() {
        return (Optional<MarketingMember>) marketingMember;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * ID of the Member
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A member represents a person
     */
    public PatchMartechMemberRequest withMarketingMember(MarketingMember marketingMember) {
        Utils.checkNotNull(marketingMember, "marketingMember");
        this.marketingMember = Optional.ofNullable(marketingMember);
        return this;
    }

    /**
     * A member represents a person
     */
    public PatchMartechMemberRequest withMarketingMember(Optional<? extends MarketingMember> marketingMember) {
        Utils.checkNotNull(marketingMember, "marketingMember");
        this.marketingMember = marketingMember;
        return this;
    }

    /**
     * ID of the connection
     */
    public PatchMartechMemberRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * ID of the Member
     */
    public PatchMartechMemberRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        PatchMartechMemberRequest other = (PatchMartechMemberRequest) o;
        return 
            Objects.deepEquals(this.marketingMember, other.marketingMember) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            marketingMember,
            connectionId,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchMartechMemberRequest.class,
                "marketingMember", marketingMember,
                "connectionId", connectionId,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends MarketingMember> marketingMember = Optional.empty();
 
        private String connectionId;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A member represents a person
         */
        public Builder marketingMember(MarketingMember marketingMember) {
            Utils.checkNotNull(marketingMember, "marketingMember");
            this.marketingMember = Optional.ofNullable(marketingMember);
            return this;
        }

        /**
         * A member represents a person
         */
        public Builder marketingMember(Optional<? extends MarketingMember> marketingMember) {
            Utils.checkNotNull(marketingMember, "marketingMember");
            this.marketingMember = marketingMember;
            return this;
        }

        /**
         * ID of the connection
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        /**
         * ID of the Member
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PatchMartechMemberRequest build() {
            return new PatchMartechMemberRequest(
                marketingMember,
                connectionId,
                id);
        }
    }
}
