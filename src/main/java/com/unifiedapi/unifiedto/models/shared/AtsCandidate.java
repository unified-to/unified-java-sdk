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
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class AtsCandidate {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends PropertyAtsCandidateAddress> address;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_id")
    private Optional<String> companyId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_name")
    private Optional<String> companyName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("date_of_birth")
    private Optional<OffsetDateTime> dateOfBirth;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emails")
    private Optional<? extends List<AtsEmail>> emails;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_identifier")
    private Optional<String> externalIdentifier;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image_url")
    private Optional<String> imageUrl;

    /**
     * URLs for web pages containing additional material about the candidate (LinkedIn, other social media, articles, etc.)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_urls")
    private Optional<? extends List<String>> linkUrls;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("origin")
    private Optional<? extends Origin> origin;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sources")
    private Optional<? extends List<String>> sources;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private Optional<? extends List<String>> tags;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("telephones")
    private Optional<? extends List<AtsTelephone>> telephones;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    private Optional<String> userId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("web_url")
    private Optional<String> webUrl;

    @JsonCreator
    public AtsCandidate(
            @JsonProperty("address") Optional<? extends PropertyAtsCandidateAddress> address,
            @JsonProperty("company_id") Optional<String> companyId,
            @JsonProperty("company_name") Optional<String> companyName,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("date_of_birth") Optional<OffsetDateTime> dateOfBirth,
            @JsonProperty("emails") Optional<? extends List<AtsEmail>> emails,
            @JsonProperty("external_identifier") Optional<String> externalIdentifier,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("image_url") Optional<String> imageUrl,
            @JsonProperty("link_urls") Optional<? extends List<String>> linkUrls,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("origin") Optional<? extends Origin> origin,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("sources") Optional<? extends List<String>> sources,
            @JsonProperty("tags") Optional<? extends List<String>> tags,
            @JsonProperty("telephones") Optional<? extends List<AtsTelephone>> telephones,
            @JsonProperty("title") Optional<String> title,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt,
            @JsonProperty("user_id") Optional<String> userId,
            @JsonProperty("web_url") Optional<String> webUrl) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(companyName, "companyName");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(dateOfBirth, "dateOfBirth");
        Utils.checkNotNull(emails, "emails");
        Utils.checkNotNull(externalIdentifier, "externalIdentifier");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(imageUrl, "imageUrl");
        Utils.checkNotNull(linkUrls, "linkUrls");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(origin, "origin");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(sources, "sources");
        Utils.checkNotNull(tags, "tags");
        Utils.checkNotNull(telephones, "telephones");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(webUrl, "webUrl");
        this.address = address;
        this.companyId = companyId;
        this.companyName = companyName;
        this.createdAt = createdAt;
        this.dateOfBirth = dateOfBirth;
        this.emails = emails;
        this.externalIdentifier = externalIdentifier;
        this.id = id;
        this.imageUrl = imageUrl;
        this.linkUrls = linkUrls;
        this.name = name;
        this.origin = origin;
        this.raw = raw;
        this.sources = sources;
        this.tags = tags;
        this.telephones = telephones;
        this.title = title;
        this.updatedAt = updatedAt;
        this.userId = userId;
        this.webUrl = webUrl;
    }
    
    public AtsCandidate() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PropertyAtsCandidateAddress> address() {
        return (Optional<PropertyAtsCandidateAddress>) address;
    }

    @JsonIgnore
    public Optional<String> companyId() {
        return companyId;
    }

    @JsonIgnore
    public Optional<String> companyName() {
        return companyName;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> dateOfBirth() {
        return dateOfBirth;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AtsEmail>> emails() {
        return (Optional<List<AtsEmail>>) emails;
    }

    @JsonIgnore
    public Optional<String> externalIdentifier() {
        return externalIdentifier;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> imageUrl() {
        return imageUrl;
    }

    /**
     * URLs for web pages containing additional material about the candidate (LinkedIn, other social media, articles, etc.)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> linkUrls() {
        return (Optional<List<String>>) linkUrls;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Origin> origin() {
        return (Optional<Origin>) origin;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> sources() {
        return (Optional<List<String>>) sources;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> tags() {
        return (Optional<List<String>>) tags;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AtsTelephone>> telephones() {
        return (Optional<List<AtsTelephone>>) telephones;
    }

    @JsonIgnore
    public Optional<String> title() {
        return title;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    @JsonIgnore
    public Optional<String> userId() {
        return userId;
    }

    @JsonIgnore
    public Optional<String> webUrl() {
        return webUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AtsCandidate withAddress(PropertyAtsCandidateAddress address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    public AtsCandidate withAddress(Optional<? extends PropertyAtsCandidateAddress> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public AtsCandidate withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = Optional.ofNullable(companyId);
        return this;
    }

    public AtsCandidate withCompanyId(Optional<String> companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    public AtsCandidate withCompanyName(String companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = Optional.ofNullable(companyName);
        return this;
    }

    public AtsCandidate withCompanyName(Optional<String> companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = companyName;
        return this;
    }

    public AtsCandidate withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public AtsCandidate withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public AtsCandidate withDateOfBirth(OffsetDateTime dateOfBirth) {
        Utils.checkNotNull(dateOfBirth, "dateOfBirth");
        this.dateOfBirth = Optional.ofNullable(dateOfBirth);
        return this;
    }

    public AtsCandidate withDateOfBirth(Optional<OffsetDateTime> dateOfBirth) {
        Utils.checkNotNull(dateOfBirth, "dateOfBirth");
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public AtsCandidate withEmails(List<AtsEmail> emails) {
        Utils.checkNotNull(emails, "emails");
        this.emails = Optional.ofNullable(emails);
        return this;
    }

    public AtsCandidate withEmails(Optional<? extends List<AtsEmail>> emails) {
        Utils.checkNotNull(emails, "emails");
        this.emails = emails;
        return this;
    }

    public AtsCandidate withExternalIdentifier(String externalIdentifier) {
        Utils.checkNotNull(externalIdentifier, "externalIdentifier");
        this.externalIdentifier = Optional.ofNullable(externalIdentifier);
        return this;
    }

    public AtsCandidate withExternalIdentifier(Optional<String> externalIdentifier) {
        Utils.checkNotNull(externalIdentifier, "externalIdentifier");
        this.externalIdentifier = externalIdentifier;
        return this;
    }

    public AtsCandidate withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public AtsCandidate withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AtsCandidate withImageUrl(String imageUrl) {
        Utils.checkNotNull(imageUrl, "imageUrl");
        this.imageUrl = Optional.ofNullable(imageUrl);
        return this;
    }

    public AtsCandidate withImageUrl(Optional<String> imageUrl) {
        Utils.checkNotNull(imageUrl, "imageUrl");
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * URLs for web pages containing additional material about the candidate (LinkedIn, other social media, articles, etc.)
     */
    public AtsCandidate withLinkUrls(List<String> linkUrls) {
        Utils.checkNotNull(linkUrls, "linkUrls");
        this.linkUrls = Optional.ofNullable(linkUrls);
        return this;
    }

    /**
     * URLs for web pages containing additional material about the candidate (LinkedIn, other social media, articles, etc.)
     */
    public AtsCandidate withLinkUrls(Optional<? extends List<String>> linkUrls) {
        Utils.checkNotNull(linkUrls, "linkUrls");
        this.linkUrls = linkUrls;
        return this;
    }

    public AtsCandidate withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public AtsCandidate withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public AtsCandidate withOrigin(Origin origin) {
        Utils.checkNotNull(origin, "origin");
        this.origin = Optional.ofNullable(origin);
        return this;
    }

    public AtsCandidate withOrigin(Optional<? extends Origin> origin) {
        Utils.checkNotNull(origin, "origin");
        this.origin = origin;
        return this;
    }

    public AtsCandidate withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public AtsCandidate withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public AtsCandidate withSources(List<String> sources) {
        Utils.checkNotNull(sources, "sources");
        this.sources = Optional.ofNullable(sources);
        return this;
    }

    public AtsCandidate withSources(Optional<? extends List<String>> sources) {
        Utils.checkNotNull(sources, "sources");
        this.sources = sources;
        return this;
    }

    public AtsCandidate withTags(List<String> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }

    public AtsCandidate withTags(Optional<? extends List<String>> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
        return this;
    }

    public AtsCandidate withTelephones(List<AtsTelephone> telephones) {
        Utils.checkNotNull(telephones, "telephones");
        this.telephones = Optional.ofNullable(telephones);
        return this;
    }

    public AtsCandidate withTelephones(Optional<? extends List<AtsTelephone>> telephones) {
        Utils.checkNotNull(telephones, "telephones");
        this.telephones = telephones;
        return this;
    }

    public AtsCandidate withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public AtsCandidate withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public AtsCandidate withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public AtsCandidate withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public AtsCandidate withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    public AtsCandidate withUserId(Optional<String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public AtsCandidate withWebUrl(String webUrl) {
        Utils.checkNotNull(webUrl, "webUrl");
        this.webUrl = Optional.ofNullable(webUrl);
        return this;
    }

    public AtsCandidate withWebUrl(Optional<String> webUrl) {
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
        AtsCandidate other = (AtsCandidate) o;
        return 
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.companyName, other.companyName) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.dateOfBirth, other.dateOfBirth) &&
            Objects.deepEquals(this.emails, other.emails) &&
            Objects.deepEquals(this.externalIdentifier, other.externalIdentifier) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.imageUrl, other.imageUrl) &&
            Objects.deepEquals(this.linkUrls, other.linkUrls) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.origin, other.origin) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.sources, other.sources) &&
            Objects.deepEquals(this.tags, other.tags) &&
            Objects.deepEquals(this.telephones, other.telephones) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.userId, other.userId) &&
            Objects.deepEquals(this.webUrl, other.webUrl);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            address,
            companyId,
            companyName,
            createdAt,
            dateOfBirth,
            emails,
            externalIdentifier,
            id,
            imageUrl,
            linkUrls,
            name,
            origin,
            raw,
            sources,
            tags,
            telephones,
            title,
            updatedAt,
            userId,
            webUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsCandidate.class,
                "address", address,
                "companyId", companyId,
                "companyName", companyName,
                "createdAt", createdAt,
                "dateOfBirth", dateOfBirth,
                "emails", emails,
                "externalIdentifier", externalIdentifier,
                "id", id,
                "imageUrl", imageUrl,
                "linkUrls", linkUrls,
                "name", name,
                "origin", origin,
                "raw", raw,
                "sources", sources,
                "tags", tags,
                "telephones", telephones,
                "title", title,
                "updatedAt", updatedAt,
                "userId", userId,
                "webUrl", webUrl);
    }
    
    public final static class Builder {
 
        private Optional<? extends PropertyAtsCandidateAddress> address = Optional.empty();
 
        private Optional<String> companyId = Optional.empty();
 
        private Optional<String> companyName = Optional.empty();
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<OffsetDateTime> dateOfBirth = Optional.empty();
 
        private Optional<? extends List<AtsEmail>> emails = Optional.empty();
 
        private Optional<String> externalIdentifier = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> imageUrl = Optional.empty();
 
        private Optional<? extends List<String>> linkUrls = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends Origin> origin = Optional.empty();
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private Optional<? extends List<String>> sources = Optional.empty();
 
        private Optional<? extends List<String>> tags = Optional.empty();
 
        private Optional<? extends List<AtsTelephone>> telephones = Optional.empty();
 
        private Optional<String> title = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();
 
        private Optional<String> userId = Optional.empty();
 
        private Optional<String> webUrl = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder address(PropertyAtsCandidateAddress address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        public Builder address(Optional<? extends PropertyAtsCandidateAddress> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = Optional.ofNullable(companyId);
            return this;
        }

        public Builder companyId(Optional<String> companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        public Builder companyName(String companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = Optional.ofNullable(companyName);
            return this;
        }

        public Builder companyName(Optional<String> companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = companyName;
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

        public Builder dateOfBirth(OffsetDateTime dateOfBirth) {
            Utils.checkNotNull(dateOfBirth, "dateOfBirth");
            this.dateOfBirth = Optional.ofNullable(dateOfBirth);
            return this;
        }

        public Builder dateOfBirth(Optional<OffsetDateTime> dateOfBirth) {
            Utils.checkNotNull(dateOfBirth, "dateOfBirth");
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder emails(List<AtsEmail> emails) {
            Utils.checkNotNull(emails, "emails");
            this.emails = Optional.ofNullable(emails);
            return this;
        }

        public Builder emails(Optional<? extends List<AtsEmail>> emails) {
            Utils.checkNotNull(emails, "emails");
            this.emails = emails;
            return this;
        }

        public Builder externalIdentifier(String externalIdentifier) {
            Utils.checkNotNull(externalIdentifier, "externalIdentifier");
            this.externalIdentifier = Optional.ofNullable(externalIdentifier);
            return this;
        }

        public Builder externalIdentifier(Optional<String> externalIdentifier) {
            Utils.checkNotNull(externalIdentifier, "externalIdentifier");
            this.externalIdentifier = externalIdentifier;
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

        public Builder imageUrl(String imageUrl) {
            Utils.checkNotNull(imageUrl, "imageUrl");
            this.imageUrl = Optional.ofNullable(imageUrl);
            return this;
        }

        public Builder imageUrl(Optional<String> imageUrl) {
            Utils.checkNotNull(imageUrl, "imageUrl");
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * URLs for web pages containing additional material about the candidate (LinkedIn, other social media, articles, etc.)
         */
        public Builder linkUrls(List<String> linkUrls) {
            Utils.checkNotNull(linkUrls, "linkUrls");
            this.linkUrls = Optional.ofNullable(linkUrls);
            return this;
        }

        /**
         * URLs for web pages containing additional material about the candidate (LinkedIn, other social media, articles, etc.)
         */
        public Builder linkUrls(Optional<? extends List<String>> linkUrls) {
            Utils.checkNotNull(linkUrls, "linkUrls");
            this.linkUrls = linkUrls;
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

        public Builder origin(Origin origin) {
            Utils.checkNotNull(origin, "origin");
            this.origin = Optional.ofNullable(origin);
            return this;
        }

        public Builder origin(Optional<? extends Origin> origin) {
            Utils.checkNotNull(origin, "origin");
            this.origin = origin;
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

        public Builder sources(List<String> sources) {
            Utils.checkNotNull(sources, "sources");
            this.sources = Optional.ofNullable(sources);
            return this;
        }

        public Builder sources(Optional<? extends List<String>> sources) {
            Utils.checkNotNull(sources, "sources");
            this.sources = sources;
            return this;
        }

        public Builder tags(List<String> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        public Builder tags(Optional<? extends List<String>> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
            return this;
        }

        public Builder telephones(List<AtsTelephone> telephones) {
            Utils.checkNotNull(telephones, "telephones");
            this.telephones = Optional.ofNullable(telephones);
            return this;
        }

        public Builder telephones(Optional<? extends List<AtsTelephone>> telephones) {
            Utils.checkNotNull(telephones, "telephones");
            this.telephones = telephones;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Builder title(Optional<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
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

        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        public Builder userId(Optional<String> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
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
        
        public AtsCandidate build() {
            return new AtsCandidate(
                address,
                companyId,
                companyName,
                createdAt,
                dateOfBirth,
                emails,
                externalIdentifier,
                id,
                imageUrl,
                linkUrls,
                name,
                origin,
                raw,
                sources,
                tags,
                telephones,
                title,
                updatedAt,
                userId,
                webUrl);
        }
    }
}

