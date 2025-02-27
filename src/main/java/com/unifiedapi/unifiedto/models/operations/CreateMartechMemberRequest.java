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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CreateMartechMemberRequest {

    /**
     * A member represents a person
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private MarketingMember marketingMember;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * Comma-delimited fields to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private Optional<? extends List<String>> fields;

    @JsonCreator
    public CreateMartechMemberRequest(
            MarketingMember marketingMember,
            String connectionId,
            Optional<? extends List<String>> fields) {
        Utils.checkNotNull(marketingMember, "marketingMember");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        this.marketingMember = marketingMember;
        this.connectionId = connectionId;
        this.fields = fields;
    }
    
    public CreateMartechMemberRequest(
            MarketingMember marketingMember,
            String connectionId) {
        this(marketingMember, connectionId, Optional.empty());
    }

    /**
     * A member represents a person
     */
    @JsonIgnore
    public MarketingMember marketingMember() {
        return marketingMember;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * Comma-delimited fields to return
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> fields() {
        return (Optional<List<String>>) fields;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A member represents a person
     */
    public CreateMartechMemberRequest withMarketingMember(MarketingMember marketingMember) {
        Utils.checkNotNull(marketingMember, "marketingMember");
        this.marketingMember = marketingMember;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateMartechMemberRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateMartechMemberRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateMartechMemberRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
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
        CreateMartechMemberRequest other = (CreateMartechMemberRequest) o;
        return 
            Objects.deepEquals(this.marketingMember, other.marketingMember) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            marketingMember,
            connectionId,
            fields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateMartechMemberRequest.class,
                "marketingMember", marketingMember,
                "connectionId", connectionId,
                "fields", fields);
    }
    
    public final static class Builder {
 
        private MarketingMember marketingMember;
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A member represents a person
         */
        public Builder marketingMember(MarketingMember marketingMember) {
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
         * Comma-delimited fields to return
         */
        public Builder fields(List<String> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = Optional.ofNullable(fields);
            return this;
        }

        /**
         * Comma-delimited fields to return
         */
        public Builder fields(Optional<? extends List<String>> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = fields;
            return this;
        }
        
        public CreateMartechMemberRequest build() {
            return new CreateMartechMemberRequest(
                marketingMember,
                connectionId,
                fields);
        }
    }
}

