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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class EnrichPersonWorkHistory {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_domain")
    private Optional<String> companyDomain;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_id")
    private Optional<String> companyId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_name")
    private Optional<String> companyName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_at")
    private Optional<OffsetDateTime> endAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location")
    private Optional<String> location;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_at")
    private Optional<OffsetDateTime> startAt;

    @JsonProperty("title")
    private String title;

    @JsonCreator
    public EnrichPersonWorkHistory(
            @JsonProperty("company_domain") Optional<String> companyDomain,
            @JsonProperty("company_id") Optional<String> companyId,
            @JsonProperty("company_name") Optional<String> companyName,
            @JsonProperty("end_at") Optional<OffsetDateTime> endAt,
            @JsonProperty("location") Optional<String> location,
            @JsonProperty("start_at") Optional<OffsetDateTime> startAt,
            @JsonProperty("title") String title) {
        Utils.checkNotNull(companyDomain, "companyDomain");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(companyName, "companyName");
        Utils.checkNotNull(endAt, "endAt");
        Utils.checkNotNull(location, "location");
        Utils.checkNotNull(startAt, "startAt");
        Utils.checkNotNull(title, "title");
        this.companyDomain = companyDomain;
        this.companyId = companyId;
        this.companyName = companyName;
        this.endAt = endAt;
        this.location = location;
        this.startAt = startAt;
        this.title = title;
    }
    
    public EnrichPersonWorkHistory(
            String title) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), title);
    }

    @JsonIgnore
    public Optional<String> companyDomain() {
        return companyDomain;
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
    public Optional<OffsetDateTime> endAt() {
        return endAt;
    }

    @JsonIgnore
    public Optional<String> location() {
        return location;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> startAt() {
        return startAt;
    }

    @JsonIgnore
    public String title() {
        return title;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public EnrichPersonWorkHistory withCompanyDomain(String companyDomain) {
        Utils.checkNotNull(companyDomain, "companyDomain");
        this.companyDomain = Optional.ofNullable(companyDomain);
        return this;
    }

    public EnrichPersonWorkHistory withCompanyDomain(Optional<String> companyDomain) {
        Utils.checkNotNull(companyDomain, "companyDomain");
        this.companyDomain = companyDomain;
        return this;
    }

    public EnrichPersonWorkHistory withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = Optional.ofNullable(companyId);
        return this;
    }

    public EnrichPersonWorkHistory withCompanyId(Optional<String> companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    public EnrichPersonWorkHistory withCompanyName(String companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = Optional.ofNullable(companyName);
        return this;
    }

    public EnrichPersonWorkHistory withCompanyName(Optional<String> companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = companyName;
        return this;
    }

    public EnrichPersonWorkHistory withEndAt(OffsetDateTime endAt) {
        Utils.checkNotNull(endAt, "endAt");
        this.endAt = Optional.ofNullable(endAt);
        return this;
    }

    public EnrichPersonWorkHistory withEndAt(Optional<OffsetDateTime> endAt) {
        Utils.checkNotNull(endAt, "endAt");
        this.endAt = endAt;
        return this;
    }

    public EnrichPersonWorkHistory withLocation(String location) {
        Utils.checkNotNull(location, "location");
        this.location = Optional.ofNullable(location);
        return this;
    }

    public EnrichPersonWorkHistory withLocation(Optional<String> location) {
        Utils.checkNotNull(location, "location");
        this.location = location;
        return this;
    }

    public EnrichPersonWorkHistory withStartAt(OffsetDateTime startAt) {
        Utils.checkNotNull(startAt, "startAt");
        this.startAt = Optional.ofNullable(startAt);
        return this;
    }

    public EnrichPersonWorkHistory withStartAt(Optional<OffsetDateTime> startAt) {
        Utils.checkNotNull(startAt, "startAt");
        this.startAt = startAt;
        return this;
    }

    public EnrichPersonWorkHistory withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
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
        EnrichPersonWorkHistory other = (EnrichPersonWorkHistory) o;
        return 
            Objects.deepEquals(this.companyDomain, other.companyDomain) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.companyName, other.companyName) &&
            Objects.deepEquals(this.endAt, other.endAt) &&
            Objects.deepEquals(this.location, other.location) &&
            Objects.deepEquals(this.startAt, other.startAt) &&
            Objects.deepEquals(this.title, other.title);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyDomain,
            companyId,
            companyName,
            endAt,
            location,
            startAt,
            title);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EnrichPersonWorkHistory.class,
                "companyDomain", companyDomain,
                "companyId", companyId,
                "companyName", companyName,
                "endAt", endAt,
                "location", location,
                "startAt", startAt,
                "title", title);
    }
    
    public final static class Builder {
 
        private Optional<String> companyDomain = Optional.empty();
 
        private Optional<String> companyId = Optional.empty();
 
        private Optional<String> companyName = Optional.empty();
 
        private Optional<OffsetDateTime> endAt = Optional.empty();
 
        private Optional<String> location = Optional.empty();
 
        private Optional<OffsetDateTime> startAt = Optional.empty();
 
        private String title;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder companyDomain(String companyDomain) {
            Utils.checkNotNull(companyDomain, "companyDomain");
            this.companyDomain = Optional.ofNullable(companyDomain);
            return this;
        }

        public Builder companyDomain(Optional<String> companyDomain) {
            Utils.checkNotNull(companyDomain, "companyDomain");
            this.companyDomain = companyDomain;
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

        public Builder endAt(OffsetDateTime endAt) {
            Utils.checkNotNull(endAt, "endAt");
            this.endAt = Optional.ofNullable(endAt);
            return this;
        }

        public Builder endAt(Optional<OffsetDateTime> endAt) {
            Utils.checkNotNull(endAt, "endAt");
            this.endAt = endAt;
            return this;
        }

        public Builder location(String location) {
            Utils.checkNotNull(location, "location");
            this.location = Optional.ofNullable(location);
            return this;
        }

        public Builder location(Optional<String> location) {
            Utils.checkNotNull(location, "location");
            this.location = location;
            return this;
        }

        public Builder startAt(OffsetDateTime startAt) {
            Utils.checkNotNull(startAt, "startAt");
            this.startAt = Optional.ofNullable(startAt);
            return this;
        }

        public Builder startAt(Optional<OffsetDateTime> startAt) {
            Utils.checkNotNull(startAt, "startAt");
            this.startAt = startAt;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }
        
        public EnrichPersonWorkHistory build() {
            return new EnrichPersonWorkHistory(
                companyDomain,
                companyId,
                companyName,
                endAt,
                location,
                startAt,
                title);
        }
    }
}

