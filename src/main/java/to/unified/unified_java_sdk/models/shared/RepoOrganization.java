/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import to.unified.unified_java_sdk.utils.Utils;


public class RepoOrganization {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("avatar_url")
    private Optional<String> avatarUrl;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    /**
     * id values of the users/employees associated with this organization
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_ids")
    private Optional<? extends List<String>> userIds;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("web_url")
    private Optional<String> webUrl;

    @JsonCreator
    public RepoOrganization(
            @JsonProperty("avatar_url") Optional<String> avatarUrl,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt,
            @JsonProperty("user_ids") Optional<? extends List<String>> userIds,
            @JsonProperty("web_url") Optional<String> webUrl) {
        Utils.checkNotNull(avatarUrl, "avatarUrl");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(userIds, "userIds");
        Utils.checkNotNull(webUrl, "webUrl");
        this.avatarUrl = avatarUrl;
        this.createdAt = createdAt;
        this.description = description;
        this.id = id;
        this.name = name;
        this.raw = raw;
        this.updatedAt = updatedAt;
        this.userIds = userIds;
        this.webUrl = webUrl;
    }
    
    public RepoOrganization() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> avatarUrl() {
        return avatarUrl;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    /**
     * id values of the users/employees associated with this organization
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> userIds() {
        return (Optional<List<String>>) userIds;
    }

    @JsonIgnore
    public Optional<String> webUrl() {
        return webUrl;
    }

    public static Builder builder() {
        return new Builder();
    }


    public RepoOrganization withAvatarUrl(String avatarUrl) {
        Utils.checkNotNull(avatarUrl, "avatarUrl");
        this.avatarUrl = Optional.ofNullable(avatarUrl);
        return this;
    }


    public RepoOrganization withAvatarUrl(Optional<String> avatarUrl) {
        Utils.checkNotNull(avatarUrl, "avatarUrl");
        this.avatarUrl = avatarUrl;
        return this;
    }

    public RepoOrganization withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }


    public RepoOrganization withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public RepoOrganization withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }


    public RepoOrganization withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public RepoOrganization withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    public RepoOrganization withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public RepoOrganization withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }


    public RepoOrganization withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public RepoOrganization withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }


    public RepoOrganization withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public RepoOrganization withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }


    public RepoOrganization withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * id values of the users/employees associated with this organization
     */
    public RepoOrganization withUserIds(List<String> userIds) {
        Utils.checkNotNull(userIds, "userIds");
        this.userIds = Optional.ofNullable(userIds);
        return this;
    }


    /**
     * id values of the users/employees associated with this organization
     */
    public RepoOrganization withUserIds(Optional<? extends List<String>> userIds) {
        Utils.checkNotNull(userIds, "userIds");
        this.userIds = userIds;
        return this;
    }

    public RepoOrganization withWebUrl(String webUrl) {
        Utils.checkNotNull(webUrl, "webUrl");
        this.webUrl = Optional.ofNullable(webUrl);
        return this;
    }


    public RepoOrganization withWebUrl(Optional<String> webUrl) {
        Utils.checkNotNull(webUrl, "webUrl");
        this.webUrl = webUrl;
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
        RepoOrganization other = (RepoOrganization) o;
        return 
            Utils.enhancedDeepEquals(this.avatarUrl, other.avatarUrl) &&
            Utils.enhancedDeepEquals(this.createdAt, other.createdAt) &&
            Utils.enhancedDeepEquals(this.description, other.description) &&
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.raw, other.raw) &&
            Utils.enhancedDeepEquals(this.updatedAt, other.updatedAt) &&
            Utils.enhancedDeepEquals(this.userIds, other.userIds) &&
            Utils.enhancedDeepEquals(this.webUrl, other.webUrl);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            avatarUrl, createdAt, description,
            id, name, raw,
            updatedAt, userIds, webUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RepoOrganization.class,
                "avatarUrl", avatarUrl,
                "createdAt", createdAt,
                "description", description,
                "id", id,
                "name", name,
                "raw", raw,
                "updatedAt", updatedAt,
                "userIds", userIds,
                "webUrl", webUrl);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> avatarUrl = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<? extends Map<String, Object>> raw = Optional.empty();

        private Optional<OffsetDateTime> updatedAt = Optional.empty();

        private Optional<? extends List<String>> userIds = Optional.empty();

        private Optional<String> webUrl = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder avatarUrl(String avatarUrl) {
            Utils.checkNotNull(avatarUrl, "avatarUrl");
            this.avatarUrl = Optional.ofNullable(avatarUrl);
            return this;
        }

        public Builder avatarUrl(Optional<String> avatarUrl) {
            Utils.checkNotNull(avatarUrl, "avatarUrl");
            this.avatarUrl = avatarUrl;
            return this;
        }


        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        public Builder createdAt(Optional<OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }


        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
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


        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }


        public Builder raw(Map<String, Object> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        public Builder raw(Optional<? extends Map<String, Object>> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }


        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        public Builder updatedAt(Optional<OffsetDateTime> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }


        /**
         * id values of the users/employees associated with this organization
         */
        public Builder userIds(List<String> userIds) {
            Utils.checkNotNull(userIds, "userIds");
            this.userIds = Optional.ofNullable(userIds);
            return this;
        }

        /**
         * id values of the users/employees associated with this organization
         */
        public Builder userIds(Optional<? extends List<String>> userIds) {
            Utils.checkNotNull(userIds, "userIds");
            this.userIds = userIds;
            return this;
        }


        public Builder webUrl(String webUrl) {
            Utils.checkNotNull(webUrl, "webUrl");
            this.webUrl = Optional.ofNullable(webUrl);
            return this;
        }

        public Builder webUrl(Optional<String> webUrl) {
            Utils.checkNotNull(webUrl, "webUrl");
            this.webUrl = webUrl;
            return this;
        }

        public RepoOrganization build() {

            return new RepoOrganization(
                avatarUrl, createdAt, description,
                id, name, raw,
                updatedAt, userIds, webUrl);
        }

    }
}
