/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class Group {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("displayName")
    private Optional<String> displayName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("externalId")
    private Optional<String> externalId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("groupType")
    private Optional<String> groupType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("members")
    private Optional<? extends List<Undefined>> members;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta")
    private Optional<? extends PropertyGroupMeta> meta;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schemas")
    private Optional<? extends List<PropertyGroupSchemas>> schemas;

    @JsonCreator
    public Group(
            @JsonProperty("displayName") Optional<String> displayName,
            @JsonProperty("externalId") Optional<String> externalId,
            @JsonProperty("groupType") Optional<String> groupType,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("members") Optional<? extends List<Undefined>> members,
            @JsonProperty("meta") Optional<? extends PropertyGroupMeta> meta,
            @JsonProperty("schemas") Optional<? extends List<PropertyGroupSchemas>> schemas) {
        Utils.checkNotNull(displayName, "displayName");
        Utils.checkNotNull(externalId, "externalId");
        Utils.checkNotNull(groupType, "groupType");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(members, "members");
        Utils.checkNotNull(meta, "meta");
        Utils.checkNotNull(schemas, "schemas");
        this.displayName = displayName;
        this.externalId = externalId;
        this.groupType = groupType;
        this.id = id;
        this.members = members;
        this.meta = meta;
        this.schemas = schemas;
    }
    
    public Group() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> displayName() {
        return displayName;
    }

    @JsonIgnore
    public Optional<String> externalId() {
        return externalId;
    }

    @JsonIgnore
    public Optional<String> groupType() {
        return groupType;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Undefined>> members() {
        return (Optional<List<Undefined>>) members;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PropertyGroupMeta> meta() {
        return (Optional<PropertyGroupMeta>) meta;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<PropertyGroupSchemas>> schemas() {
        return (Optional<List<PropertyGroupSchemas>>) schemas;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Group withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = Optional.ofNullable(displayName);
        return this;
    }

    public Group withDisplayName(Optional<String> displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = displayName;
        return this;
    }

    public Group withExternalId(String externalId) {
        Utils.checkNotNull(externalId, "externalId");
        this.externalId = Optional.ofNullable(externalId);
        return this;
    }

    public Group withExternalId(Optional<String> externalId) {
        Utils.checkNotNull(externalId, "externalId");
        this.externalId = externalId;
        return this;
    }

    public Group withGroupType(String groupType) {
        Utils.checkNotNull(groupType, "groupType");
        this.groupType = Optional.ofNullable(groupType);
        return this;
    }

    public Group withGroupType(Optional<String> groupType) {
        Utils.checkNotNull(groupType, "groupType");
        this.groupType = groupType;
        return this;
    }

    public Group withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public Group withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Group withMembers(List<Undefined> members) {
        Utils.checkNotNull(members, "members");
        this.members = Optional.ofNullable(members);
        return this;
    }

    public Group withMembers(Optional<? extends List<Undefined>> members) {
        Utils.checkNotNull(members, "members");
        this.members = members;
        return this;
    }

    public Group withMeta(PropertyGroupMeta meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = Optional.ofNullable(meta);
        return this;
    }

    public Group withMeta(Optional<? extends PropertyGroupMeta> meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = meta;
        return this;
    }

    public Group withSchemas(List<PropertyGroupSchemas> schemas) {
        Utils.checkNotNull(schemas, "schemas");
        this.schemas = Optional.ofNullable(schemas);
        return this;
    }

    public Group withSchemas(Optional<? extends List<PropertyGroupSchemas>> schemas) {
        Utils.checkNotNull(schemas, "schemas");
        this.schemas = schemas;
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
        Group other = (Group) o;
        return 
            Objects.deepEquals(this.displayName, other.displayName) &&
            Objects.deepEquals(this.externalId, other.externalId) &&
            Objects.deepEquals(this.groupType, other.groupType) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.members, other.members) &&
            Objects.deepEquals(this.meta, other.meta) &&
            Objects.deepEquals(this.schemas, other.schemas);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            displayName,
            externalId,
            groupType,
            id,
            members,
            meta,
            schemas);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Group.class,
                "displayName", displayName,
                "externalId", externalId,
                "groupType", groupType,
                "id", id,
                "members", members,
                "meta", meta,
                "schemas", schemas);
    }
    
    public final static class Builder {
 
        private Optional<String> displayName = Optional.empty();
 
        private Optional<String> externalId = Optional.empty();
 
        private Optional<String> groupType = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends List<Undefined>> members = Optional.empty();
 
        private Optional<? extends PropertyGroupMeta> meta = Optional.empty();
 
        private Optional<? extends List<PropertyGroupSchemas>> schemas = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = Optional.ofNullable(displayName);
            return this;
        }

        public Builder displayName(Optional<String> displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
            return this;
        }

        public Builder externalId(String externalId) {
            Utils.checkNotNull(externalId, "externalId");
            this.externalId = Optional.ofNullable(externalId);
            return this;
        }

        public Builder externalId(Optional<String> externalId) {
            Utils.checkNotNull(externalId, "externalId");
            this.externalId = externalId;
            return this;
        }

        public Builder groupType(String groupType) {
            Utils.checkNotNull(groupType, "groupType");
            this.groupType = Optional.ofNullable(groupType);
            return this;
        }

        public Builder groupType(Optional<String> groupType) {
            Utils.checkNotNull(groupType, "groupType");
            this.groupType = groupType;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder members(List<Undefined> members) {
            Utils.checkNotNull(members, "members");
            this.members = Optional.ofNullable(members);
            return this;
        }

        public Builder members(Optional<? extends List<Undefined>> members) {
            Utils.checkNotNull(members, "members");
            this.members = members;
            return this;
        }

        public Builder meta(PropertyGroupMeta meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = Optional.ofNullable(meta);
            return this;
        }

        public Builder meta(Optional<? extends PropertyGroupMeta> meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = meta;
            return this;
        }

        public Builder schemas(List<PropertyGroupSchemas> schemas) {
            Utils.checkNotNull(schemas, "schemas");
            this.schemas = Optional.ofNullable(schemas);
            return this;
        }

        public Builder schemas(Optional<? extends List<PropertyGroupSchemas>> schemas) {
            Utils.checkNotNull(schemas, "schemas");
            this.schemas = schemas;
            return this;
        }
        
        public Group build() {
            return new Group(
                displayName,
                externalId,
                groupType,
                id,
                members,
                meta,
                schemas);
        }
    }
}

