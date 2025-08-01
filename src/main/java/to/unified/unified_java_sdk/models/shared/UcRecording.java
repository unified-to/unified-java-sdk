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


public class UcRecording {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("call_id")
    private Optional<String> callId;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contact_id")
    private Optional<String> contactId;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contact_name")
    private Optional<String> contactName;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contact_phone")
    private Optional<String> contactPhone;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_at")
    private Optional<OffsetDateTime> endAt;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expires_at")
    private Optional<OffsetDateTime> expiresAt;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("media")
    private Optional<? extends List<UcRecordingMedia>> media;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_at")
    private Optional<OffsetDateTime> startAt;


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
    public UcRecording(
            @JsonProperty("call_id") Optional<String> callId,
            @JsonProperty("contact_id") Optional<String> contactId,
            @JsonProperty("contact_name") Optional<String> contactName,
            @JsonProperty("contact_phone") Optional<String> contactPhone,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("end_at") Optional<OffsetDateTime> endAt,
            @JsonProperty("expires_at") Optional<OffsetDateTime> expiresAt,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("media") Optional<? extends List<UcRecordingMedia>> media,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("start_at") Optional<OffsetDateTime> startAt,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt,
            @JsonProperty("user_id") Optional<String> userId,
            @JsonProperty("web_url") Optional<String> webUrl) {
        Utils.checkNotNull(callId, "callId");
        Utils.checkNotNull(contactId, "contactId");
        Utils.checkNotNull(contactName, "contactName");
        Utils.checkNotNull(contactPhone, "contactPhone");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(endAt, "endAt");
        Utils.checkNotNull(expiresAt, "expiresAt");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(media, "media");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(startAt, "startAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(webUrl, "webUrl");
        this.callId = callId;
        this.contactId = contactId;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.createdAt = createdAt;
        this.endAt = endAt;
        this.expiresAt = expiresAt;
        this.id = id;
        this.media = media;
        this.raw = raw;
        this.startAt = startAt;
        this.updatedAt = updatedAt;
        this.userId = userId;
        this.webUrl = webUrl;
    }
    
    public UcRecording() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> callId() {
        return callId;
    }

    @JsonIgnore
    public Optional<String> contactId() {
        return contactId;
    }

    @JsonIgnore
    public Optional<String> contactName() {
        return contactName;
    }

    @JsonIgnore
    public Optional<String> contactPhone() {
        return contactPhone;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> endAt() {
        return endAt;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> expiresAt() {
        return expiresAt;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<UcRecordingMedia>> media() {
        return (Optional<List<UcRecordingMedia>>) media;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> startAt() {
        return startAt;
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

    public static Builder builder() {
        return new Builder();
    }


    public UcRecording withCallId(String callId) {
        Utils.checkNotNull(callId, "callId");
        this.callId = Optional.ofNullable(callId);
        return this;
    }


    public UcRecording withCallId(Optional<String> callId) {
        Utils.checkNotNull(callId, "callId");
        this.callId = callId;
        return this;
    }

    public UcRecording withContactId(String contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = Optional.ofNullable(contactId);
        return this;
    }


    public UcRecording withContactId(Optional<String> contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = contactId;
        return this;
    }

    public UcRecording withContactName(String contactName) {
        Utils.checkNotNull(contactName, "contactName");
        this.contactName = Optional.ofNullable(contactName);
        return this;
    }


    public UcRecording withContactName(Optional<String> contactName) {
        Utils.checkNotNull(contactName, "contactName");
        this.contactName = contactName;
        return this;
    }

    public UcRecording withContactPhone(String contactPhone) {
        Utils.checkNotNull(contactPhone, "contactPhone");
        this.contactPhone = Optional.ofNullable(contactPhone);
        return this;
    }


    public UcRecording withContactPhone(Optional<String> contactPhone) {
        Utils.checkNotNull(contactPhone, "contactPhone");
        this.contactPhone = contactPhone;
        return this;
    }

    public UcRecording withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }


    public UcRecording withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public UcRecording withEndAt(OffsetDateTime endAt) {
        Utils.checkNotNull(endAt, "endAt");
        this.endAt = Optional.ofNullable(endAt);
        return this;
    }


    public UcRecording withEndAt(Optional<OffsetDateTime> endAt) {
        Utils.checkNotNull(endAt, "endAt");
        this.endAt = endAt;
        return this;
    }

    public UcRecording withExpiresAt(OffsetDateTime expiresAt) {
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.expiresAt = Optional.ofNullable(expiresAt);
        return this;
    }


    public UcRecording withExpiresAt(Optional<OffsetDateTime> expiresAt) {
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.expiresAt = expiresAt;
        return this;
    }

    public UcRecording withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    public UcRecording withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public UcRecording withMedia(List<UcRecordingMedia> media) {
        Utils.checkNotNull(media, "media");
        this.media = Optional.ofNullable(media);
        return this;
    }


    public UcRecording withMedia(Optional<? extends List<UcRecordingMedia>> media) {
        Utils.checkNotNull(media, "media");
        this.media = media;
        return this;
    }

    public UcRecording withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }


    public UcRecording withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public UcRecording withStartAt(OffsetDateTime startAt) {
        Utils.checkNotNull(startAt, "startAt");
        this.startAt = Optional.ofNullable(startAt);
        return this;
    }


    public UcRecording withStartAt(Optional<OffsetDateTime> startAt) {
        Utils.checkNotNull(startAt, "startAt");
        this.startAt = startAt;
        return this;
    }

    public UcRecording withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }


    public UcRecording withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public UcRecording withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }


    public UcRecording withUserId(Optional<String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public UcRecording withWebUrl(String webUrl) {
        Utils.checkNotNull(webUrl, "webUrl");
        this.webUrl = Optional.ofNullable(webUrl);
        return this;
    }


    public UcRecording withWebUrl(Optional<String> webUrl) {
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
        UcRecording other = (UcRecording) o;
        return 
            Utils.enhancedDeepEquals(this.callId, other.callId) &&
            Utils.enhancedDeepEquals(this.contactId, other.contactId) &&
            Utils.enhancedDeepEquals(this.contactName, other.contactName) &&
            Utils.enhancedDeepEquals(this.contactPhone, other.contactPhone) &&
            Utils.enhancedDeepEquals(this.createdAt, other.createdAt) &&
            Utils.enhancedDeepEquals(this.endAt, other.endAt) &&
            Utils.enhancedDeepEquals(this.expiresAt, other.expiresAt) &&
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.media, other.media) &&
            Utils.enhancedDeepEquals(this.raw, other.raw) &&
            Utils.enhancedDeepEquals(this.startAt, other.startAt) &&
            Utils.enhancedDeepEquals(this.updatedAt, other.updatedAt) &&
            Utils.enhancedDeepEquals(this.userId, other.userId) &&
            Utils.enhancedDeepEquals(this.webUrl, other.webUrl);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            callId, contactId, contactName,
            contactPhone, createdAt, endAt,
            expiresAt, id, media,
            raw, startAt, updatedAt,
            userId, webUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UcRecording.class,
                "callId", callId,
                "contactId", contactId,
                "contactName", contactName,
                "contactPhone", contactPhone,
                "createdAt", createdAt,
                "endAt", endAt,
                "expiresAt", expiresAt,
                "id", id,
                "media", media,
                "raw", raw,
                "startAt", startAt,
                "updatedAt", updatedAt,
                "userId", userId,
                "webUrl", webUrl);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> callId = Optional.empty();

        private Optional<String> contactId = Optional.empty();

        private Optional<String> contactName = Optional.empty();

        private Optional<String> contactPhone = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<OffsetDateTime> endAt = Optional.empty();

        private Optional<OffsetDateTime> expiresAt = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<? extends List<UcRecordingMedia>> media = Optional.empty();

        private Optional<? extends Map<String, Object>> raw = Optional.empty();

        private Optional<OffsetDateTime> startAt = Optional.empty();

        private Optional<OffsetDateTime> updatedAt = Optional.empty();

        private Optional<String> userId = Optional.empty();

        private Optional<String> webUrl = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder callId(String callId) {
            Utils.checkNotNull(callId, "callId");
            this.callId = Optional.ofNullable(callId);
            return this;
        }

        public Builder callId(Optional<String> callId) {
            Utils.checkNotNull(callId, "callId");
            this.callId = callId;
            return this;
        }


        public Builder contactId(String contactId) {
            Utils.checkNotNull(contactId, "contactId");
            this.contactId = Optional.ofNullable(contactId);
            return this;
        }

        public Builder contactId(Optional<String> contactId) {
            Utils.checkNotNull(contactId, "contactId");
            this.contactId = contactId;
            return this;
        }


        public Builder contactName(String contactName) {
            Utils.checkNotNull(contactName, "contactName");
            this.contactName = Optional.ofNullable(contactName);
            return this;
        }

        public Builder contactName(Optional<String> contactName) {
            Utils.checkNotNull(contactName, "contactName");
            this.contactName = contactName;
            return this;
        }


        public Builder contactPhone(String contactPhone) {
            Utils.checkNotNull(contactPhone, "contactPhone");
            this.contactPhone = Optional.ofNullable(contactPhone);
            return this;
        }

        public Builder contactPhone(Optional<String> contactPhone) {
            Utils.checkNotNull(contactPhone, "contactPhone");
            this.contactPhone = contactPhone;
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


        public Builder expiresAt(OffsetDateTime expiresAt) {
            Utils.checkNotNull(expiresAt, "expiresAt");
            this.expiresAt = Optional.ofNullable(expiresAt);
            return this;
        }

        public Builder expiresAt(Optional<OffsetDateTime> expiresAt) {
            Utils.checkNotNull(expiresAt, "expiresAt");
            this.expiresAt = expiresAt;
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


        public Builder media(List<UcRecordingMedia> media) {
            Utils.checkNotNull(media, "media");
            this.media = Optional.ofNullable(media);
            return this;
        }

        public Builder media(Optional<? extends List<UcRecordingMedia>> media) {
            Utils.checkNotNull(media, "media");
            this.media = media;
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

        public UcRecording build() {

            return new UcRecording(
                callId, contactId, contactName,
                contactPhone, createdAt, endAt,
                expiresAt, id, media,
                raw, startAt, updatedAt,
                userId, webUrl);
        }

    }
}
