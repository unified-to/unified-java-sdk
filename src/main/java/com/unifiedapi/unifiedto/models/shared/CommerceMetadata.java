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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class CommerceMetadata {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("extra_data")
    private Optional<? extends Map<String, Object>> extraData;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonProperty("key")
    private String key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("namespace")
    private Optional<String> namespace;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private Optional<? extends Map<String, Object>> value;

    @JsonCreator
    public CommerceMetadata(
            @JsonProperty("extra_data") Optional<? extends Map<String, Object>> extraData,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("key") String key,
            @JsonProperty("namespace") Optional<String> namespace,
            @JsonProperty("type") Optional<String> type,
            @JsonProperty("value") Optional<? extends Map<String, Object>> value) {
        Utils.checkNotNull(extraData, "extraData");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(namespace, "namespace");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(value, "value");
        this.extraData = extraData;
        this.id = id;
        this.key = key;
        this.namespace = namespace;
        this.type = type;
        this.value = value;
    }
    
    public CommerceMetadata(
            String key) {
        this(Optional.empty(), Optional.empty(), key, Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> extraData() {
        return (Optional<Map<String, Object>>) extraData;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public String key() {
        return key;
    }

    @JsonIgnore
    public Optional<String> namespace() {
        return namespace;
    }

    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> value() {
        return (Optional<Map<String, Object>>) value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CommerceMetadata withExtraData(Map<String, Object> extraData) {
        Utils.checkNotNull(extraData, "extraData");
        this.extraData = Optional.ofNullable(extraData);
        return this;
    }

    public CommerceMetadata withExtraData(Optional<? extends Map<String, Object>> extraData) {
        Utils.checkNotNull(extraData, "extraData");
        this.extraData = extraData;
        return this;
    }

    public CommerceMetadata withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public CommerceMetadata withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public CommerceMetadata withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public CommerceMetadata withNamespace(String namespace) {
        Utils.checkNotNull(namespace, "namespace");
        this.namespace = Optional.ofNullable(namespace);
        return this;
    }

    public CommerceMetadata withNamespace(Optional<String> namespace) {
        Utils.checkNotNull(namespace, "namespace");
        this.namespace = namespace;
        return this;
    }

    public CommerceMetadata withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public CommerceMetadata withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public CommerceMetadata withValue(Map<String, Object> value) {
        Utils.checkNotNull(value, "value");
        this.value = Optional.ofNullable(value);
        return this;
    }

    public CommerceMetadata withValue(Optional<? extends Map<String, Object>> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        CommerceMetadata other = (CommerceMetadata) o;
        return 
            Objects.deepEquals(this.extraData, other.extraData) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.namespace, other.namespace) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            extraData,
            id,
            key,
            namespace,
            type,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CommerceMetadata.class,
                "extraData", extraData,
                "id", id,
                "key", key,
                "namespace", namespace,
                "type", type,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<? extends Map<String, Object>> extraData = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private String key;
 
        private Optional<String> namespace = Optional.empty();
 
        private Optional<String> type = Optional.empty();
 
        private Optional<? extends Map<String, Object>> value = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder extraData(Map<String, Object> extraData) {
            Utils.checkNotNull(extraData, "extraData");
            this.extraData = Optional.ofNullable(extraData);
            return this;
        }

        public Builder extraData(Optional<? extends Map<String, Object>> extraData) {
            Utils.checkNotNull(extraData, "extraData");
            this.extraData = extraData;
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

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder namespace(String namespace) {
            Utils.checkNotNull(namespace, "namespace");
            this.namespace = Optional.ofNullable(namespace);
            return this;
        }

        public Builder namespace(Optional<String> namespace) {
            Utils.checkNotNull(namespace, "namespace");
            this.namespace = namespace;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder value(Map<String, Object> value) {
            Utils.checkNotNull(value, "value");
            this.value = Optional.ofNullable(value);
            return this;
        }

        public Builder value(Optional<? extends Map<String, Object>> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public CommerceMetadata build() {
            return new CommerceMetadata(
                extraData,
                id,
                key,
                namespace,
                type,
                value);
        }
    }
}
