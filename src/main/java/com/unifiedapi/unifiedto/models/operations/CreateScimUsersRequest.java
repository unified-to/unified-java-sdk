/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.ScimUser;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateScimUsersRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends ScimUser> scimUser;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=count")
    private Optional<Double> count;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=filter")
    private Optional<String> filter;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sortBy")
    private Optional<String> sortBy;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sortOrder")
    private Optional<String> sortOrder;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=startIndex")
    private Optional<Double> startIndex;

    @JsonCreator
    public CreateScimUsersRequest(
            Optional<? extends ScimUser> scimUser,
            String connectionId,
            Optional<Double> count,
            Optional<String> filter,
            Optional<String> sortBy,
            Optional<String> sortOrder,
            Optional<Double> startIndex) {
        Utils.checkNotNull(scimUser, "scimUser");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(count, "count");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(sortBy, "sortBy");
        Utils.checkNotNull(sortOrder, "sortOrder");
        Utils.checkNotNull(startIndex, "startIndex");
        this.scimUser = scimUser;
        this.connectionId = connectionId;
        this.count = count;
        this.filter = filter;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
        this.startIndex = startIndex;
    }
    
    public CreateScimUsersRequest(
            String connectionId) {
        this(Optional.empty(), connectionId, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ScimUser> scimUser() {
        return (Optional<ScimUser>) scimUser;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    @JsonIgnore
    public Optional<Double> count() {
        return count;
    }

    @JsonIgnore
    public Optional<String> filter() {
        return filter;
    }

    @JsonIgnore
    public Optional<String> sortBy() {
        return sortBy;
    }

    @JsonIgnore
    public Optional<String> sortOrder() {
        return sortOrder;
    }

    @JsonIgnore
    public Optional<Double> startIndex() {
        return startIndex;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateScimUsersRequest withScimUser(ScimUser scimUser) {
        Utils.checkNotNull(scimUser, "scimUser");
        this.scimUser = Optional.ofNullable(scimUser);
        return this;
    }

    public CreateScimUsersRequest withScimUser(Optional<? extends ScimUser> scimUser) {
        Utils.checkNotNull(scimUser, "scimUser");
        this.scimUser = scimUser;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateScimUsersRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    public CreateScimUsersRequest withCount(double count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.ofNullable(count);
        return this;
    }

    public CreateScimUsersRequest withCount(Optional<Double> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
        return this;
    }

    public CreateScimUsersRequest withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    public CreateScimUsersRequest withFilter(Optional<String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    public CreateScimUsersRequest withSortBy(String sortBy) {
        Utils.checkNotNull(sortBy, "sortBy");
        this.sortBy = Optional.ofNullable(sortBy);
        return this;
    }

    public CreateScimUsersRequest withSortBy(Optional<String> sortBy) {
        Utils.checkNotNull(sortBy, "sortBy");
        this.sortBy = sortBy;
        return this;
    }

    public CreateScimUsersRequest withSortOrder(String sortOrder) {
        Utils.checkNotNull(sortOrder, "sortOrder");
        this.sortOrder = Optional.ofNullable(sortOrder);
        return this;
    }

    public CreateScimUsersRequest withSortOrder(Optional<String> sortOrder) {
        Utils.checkNotNull(sortOrder, "sortOrder");
        this.sortOrder = sortOrder;
        return this;
    }

    public CreateScimUsersRequest withStartIndex(double startIndex) {
        Utils.checkNotNull(startIndex, "startIndex");
        this.startIndex = Optional.ofNullable(startIndex);
        return this;
    }

    public CreateScimUsersRequest withStartIndex(Optional<Double> startIndex) {
        Utils.checkNotNull(startIndex, "startIndex");
        this.startIndex = startIndex;
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
        CreateScimUsersRequest other = (CreateScimUsersRequest) o;
        return 
            Objects.deepEquals(this.scimUser, other.scimUser) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.count, other.count) &&
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.sortBy, other.sortBy) &&
            Objects.deepEquals(this.sortOrder, other.sortOrder) &&
            Objects.deepEquals(this.startIndex, other.startIndex);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            scimUser,
            connectionId,
            count,
            filter,
            sortBy,
            sortOrder,
            startIndex);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateScimUsersRequest.class,
                "scimUser", scimUser,
                "connectionId", connectionId,
                "count", count,
                "filter", filter,
                "sortBy", sortBy,
                "sortOrder", sortOrder,
                "startIndex", startIndex);
    }
    
    public final static class Builder {
 
        private Optional<? extends ScimUser> scimUser = Optional.empty();
 
        private String connectionId;
 
        private Optional<Double> count = Optional.empty();
 
        private Optional<String> filter = Optional.empty();
 
        private Optional<String> sortBy = Optional.empty();
 
        private Optional<String> sortOrder = Optional.empty();
 
        private Optional<Double> startIndex = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder scimUser(ScimUser scimUser) {
            Utils.checkNotNull(scimUser, "scimUser");
            this.scimUser = Optional.ofNullable(scimUser);
            return this;
        }

        public Builder scimUser(Optional<? extends ScimUser> scimUser) {
            Utils.checkNotNull(scimUser, "scimUser");
            this.scimUser = scimUser;
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

        public Builder count(double count) {
            Utils.checkNotNull(count, "count");
            this.count = Optional.ofNullable(count);
            return this;
        }

        public Builder count(Optional<Double> count) {
            Utils.checkNotNull(count, "count");
            this.count = count;
            return this;
        }

        public Builder filter(String filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        public Builder filter(Optional<String> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        public Builder sortBy(String sortBy) {
            Utils.checkNotNull(sortBy, "sortBy");
            this.sortBy = Optional.ofNullable(sortBy);
            return this;
        }

        public Builder sortBy(Optional<String> sortBy) {
            Utils.checkNotNull(sortBy, "sortBy");
            this.sortBy = sortBy;
            return this;
        }

        public Builder sortOrder(String sortOrder) {
            Utils.checkNotNull(sortOrder, "sortOrder");
            this.sortOrder = Optional.ofNullable(sortOrder);
            return this;
        }

        public Builder sortOrder(Optional<String> sortOrder) {
            Utils.checkNotNull(sortOrder, "sortOrder");
            this.sortOrder = sortOrder;
            return this;
        }

        public Builder startIndex(double startIndex) {
            Utils.checkNotNull(startIndex, "startIndex");
            this.startIndex = Optional.ofNullable(startIndex);
            return this;
        }

        public Builder startIndex(Optional<Double> startIndex) {
            Utils.checkNotNull(startIndex, "startIndex");
            this.startIndex = startIndex;
            return this;
        }
        
        public CreateScimUsersRequest build() {
            return new CreateScimUsersRequest(
                scimUser,
                connectionId,
                count,
                filter,
                sortBy,
                sortOrder,
                startIndex);
        }
    }
}

