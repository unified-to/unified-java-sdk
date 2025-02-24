/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.MarketingList;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class UpdateMartechListRequest {

    /**
     * Mailing List
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private MarketingList marketingList;

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

    /**
     * ID of the List
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public UpdateMartechListRequest(
            MarketingList marketingList,
            String connectionId,
            Optional<? extends List<String>> fields,
            String id) {
        Utils.checkNotNull(marketingList, "marketingList");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(id, "id");
        this.marketingList = marketingList;
        this.connectionId = connectionId;
        this.fields = fields;
        this.id = id;
    }
    
    public UpdateMartechListRequest(
            MarketingList marketingList,
            String connectionId,
            String id) {
        this(marketingList, connectionId, Optional.empty(), id);
    }

    /**
     * Mailing List
     */
    @JsonIgnore
    public MarketingList marketingList() {
        return marketingList;
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

    /**
     * ID of the List
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Mailing List
     */
    public UpdateMartechListRequest withMarketingList(MarketingList marketingList) {
        Utils.checkNotNull(marketingList, "marketingList");
        this.marketingList = marketingList;
        return this;
    }

    /**
     * ID of the connection
     */
    public UpdateMartechListRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public UpdateMartechListRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public UpdateMartechListRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * ID of the List
     */
    public UpdateMartechListRequest withId(String id) {
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
        UpdateMartechListRequest other = (UpdateMartechListRequest) o;
        return 
            Objects.deepEquals(this.marketingList, other.marketingList) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            marketingList,
            connectionId,
            fields,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateMartechListRequest.class,
                "marketingList", marketingList,
                "connectionId", connectionId,
                "fields", fields,
                "id", id);
    }
    
    public final static class Builder {
 
        private MarketingList marketingList;
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Mailing List
         */
        public Builder marketingList(MarketingList marketingList) {
            Utils.checkNotNull(marketingList, "marketingList");
            this.marketingList = marketingList;
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

        /**
         * ID of the List
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public UpdateMartechListRequest build() {
            return new UpdateMartechListRequest(
                marketingList,
                connectionId,
                fields,
                id);
        }
    }
}

