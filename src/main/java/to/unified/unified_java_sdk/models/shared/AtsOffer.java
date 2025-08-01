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


public class AtsOffer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accepted_at")
    private Optional<OffsetDateTime> acceptedAt;

    /**
     * compensation details for the offer
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compensation")
    private Optional<? extends List<AtsCompensation>> compensation;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("creator_user_id")
    private Optional<String> creatorUserId;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_user_id")
    private Optional<String> employeeUserId;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rejected_at")
    private Optional<OffsetDateTime> rejectedAt;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sent_at")
    private Optional<OffsetDateTime> sentAt;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_at")
    private Optional<OffsetDateTime> startAt;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends AtsOfferStatus> status;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonCreator
    public AtsOffer(
            @JsonProperty("accepted_at") Optional<OffsetDateTime> acceptedAt,
            @JsonProperty("compensation") Optional<? extends List<AtsCompensation>> compensation,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("creator_user_id") Optional<String> creatorUserId,
            @JsonProperty("employee_user_id") Optional<String> employeeUserId,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("rejected_at") Optional<OffsetDateTime> rejectedAt,
            @JsonProperty("sent_at") Optional<OffsetDateTime> sentAt,
            @JsonProperty("start_at") Optional<OffsetDateTime> startAt,
            @JsonProperty("status") Optional<? extends AtsOfferStatus> status,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(acceptedAt, "acceptedAt");
        Utils.checkNotNull(compensation, "compensation");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(creatorUserId, "creatorUserId");
        Utils.checkNotNull(employeeUserId, "employeeUserId");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(rejectedAt, "rejectedAt");
        Utils.checkNotNull(sentAt, "sentAt");
        Utils.checkNotNull(startAt, "startAt");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.acceptedAt = acceptedAt;
        this.compensation = compensation;
        this.createdAt = createdAt;
        this.creatorUserId = creatorUserId;
        this.employeeUserId = employeeUserId;
        this.id = id;
        this.raw = raw;
        this.rejectedAt = rejectedAt;
        this.sentAt = sentAt;
        this.startAt = startAt;
        this.status = status;
        this.updatedAt = updatedAt;
    }
    
    public AtsOffer() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<OffsetDateTime> acceptedAt() {
        return acceptedAt;
    }

    /**
     * compensation details for the offer
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AtsCompensation>> compensation() {
        return (Optional<List<AtsCompensation>>) compensation;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<String> creatorUserId() {
        return creatorUserId;
    }

    @JsonIgnore
    public Optional<String> employeeUserId() {
        return employeeUserId;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> rejectedAt() {
        return rejectedAt;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> sentAt() {
        return sentAt;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> startAt() {
        return startAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AtsOfferStatus> status() {
        return (Optional<AtsOfferStatus>) status;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }


    public AtsOffer withAcceptedAt(OffsetDateTime acceptedAt) {
        Utils.checkNotNull(acceptedAt, "acceptedAt");
        this.acceptedAt = Optional.ofNullable(acceptedAt);
        return this;
    }


    public AtsOffer withAcceptedAt(Optional<OffsetDateTime> acceptedAt) {
        Utils.checkNotNull(acceptedAt, "acceptedAt");
        this.acceptedAt = acceptedAt;
        return this;
    }

    /**
     * compensation details for the offer
     */
    public AtsOffer withCompensation(List<AtsCompensation> compensation) {
        Utils.checkNotNull(compensation, "compensation");
        this.compensation = Optional.ofNullable(compensation);
        return this;
    }


    /**
     * compensation details for the offer
     */
    public AtsOffer withCompensation(Optional<? extends List<AtsCompensation>> compensation) {
        Utils.checkNotNull(compensation, "compensation");
        this.compensation = compensation;
        return this;
    }

    public AtsOffer withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }


    public AtsOffer withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public AtsOffer withCreatorUserId(String creatorUserId) {
        Utils.checkNotNull(creatorUserId, "creatorUserId");
        this.creatorUserId = Optional.ofNullable(creatorUserId);
        return this;
    }


    public AtsOffer withCreatorUserId(Optional<String> creatorUserId) {
        Utils.checkNotNull(creatorUserId, "creatorUserId");
        this.creatorUserId = creatorUserId;
        return this;
    }

    public AtsOffer withEmployeeUserId(String employeeUserId) {
        Utils.checkNotNull(employeeUserId, "employeeUserId");
        this.employeeUserId = Optional.ofNullable(employeeUserId);
        return this;
    }


    public AtsOffer withEmployeeUserId(Optional<String> employeeUserId) {
        Utils.checkNotNull(employeeUserId, "employeeUserId");
        this.employeeUserId = employeeUserId;
        return this;
    }

    public AtsOffer withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    public AtsOffer withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AtsOffer withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }


    public AtsOffer withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public AtsOffer withRejectedAt(OffsetDateTime rejectedAt) {
        Utils.checkNotNull(rejectedAt, "rejectedAt");
        this.rejectedAt = Optional.ofNullable(rejectedAt);
        return this;
    }


    public AtsOffer withRejectedAt(Optional<OffsetDateTime> rejectedAt) {
        Utils.checkNotNull(rejectedAt, "rejectedAt");
        this.rejectedAt = rejectedAt;
        return this;
    }

    public AtsOffer withSentAt(OffsetDateTime sentAt) {
        Utils.checkNotNull(sentAt, "sentAt");
        this.sentAt = Optional.ofNullable(sentAt);
        return this;
    }


    public AtsOffer withSentAt(Optional<OffsetDateTime> sentAt) {
        Utils.checkNotNull(sentAt, "sentAt");
        this.sentAt = sentAt;
        return this;
    }

    public AtsOffer withStartAt(OffsetDateTime startAt) {
        Utils.checkNotNull(startAt, "startAt");
        this.startAt = Optional.ofNullable(startAt);
        return this;
    }


    public AtsOffer withStartAt(Optional<OffsetDateTime> startAt) {
        Utils.checkNotNull(startAt, "startAt");
        this.startAt = startAt;
        return this;
    }

    public AtsOffer withStatus(AtsOfferStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }


    public AtsOffer withStatus(Optional<? extends AtsOfferStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public AtsOffer withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }


    public AtsOffer withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        AtsOffer other = (AtsOffer) o;
        return 
            Utils.enhancedDeepEquals(this.acceptedAt, other.acceptedAt) &&
            Utils.enhancedDeepEquals(this.compensation, other.compensation) &&
            Utils.enhancedDeepEquals(this.createdAt, other.createdAt) &&
            Utils.enhancedDeepEquals(this.creatorUserId, other.creatorUserId) &&
            Utils.enhancedDeepEquals(this.employeeUserId, other.employeeUserId) &&
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.raw, other.raw) &&
            Utils.enhancedDeepEquals(this.rejectedAt, other.rejectedAt) &&
            Utils.enhancedDeepEquals(this.sentAt, other.sentAt) &&
            Utils.enhancedDeepEquals(this.startAt, other.startAt) &&
            Utils.enhancedDeepEquals(this.status, other.status) &&
            Utils.enhancedDeepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            acceptedAt, compensation, createdAt,
            creatorUserId, employeeUserId, id,
            raw, rejectedAt, sentAt,
            startAt, status, updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsOffer.class,
                "acceptedAt", acceptedAt,
                "compensation", compensation,
                "createdAt", createdAt,
                "creatorUserId", creatorUserId,
                "employeeUserId", employeeUserId,
                "id", id,
                "raw", raw,
                "rejectedAt", rejectedAt,
                "sentAt", sentAt,
                "startAt", startAt,
                "status", status,
                "updatedAt", updatedAt);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<OffsetDateTime> acceptedAt = Optional.empty();

        private Optional<? extends List<AtsCompensation>> compensation = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<String> creatorUserId = Optional.empty();

        private Optional<String> employeeUserId = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<? extends Map<String, Object>> raw = Optional.empty();

        private Optional<OffsetDateTime> rejectedAt = Optional.empty();

        private Optional<OffsetDateTime> sentAt = Optional.empty();

        private Optional<OffsetDateTime> startAt = Optional.empty();

        private Optional<? extends AtsOfferStatus> status = Optional.empty();

        private Optional<OffsetDateTime> updatedAt = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder acceptedAt(OffsetDateTime acceptedAt) {
            Utils.checkNotNull(acceptedAt, "acceptedAt");
            this.acceptedAt = Optional.ofNullable(acceptedAt);
            return this;
        }

        public Builder acceptedAt(Optional<OffsetDateTime> acceptedAt) {
            Utils.checkNotNull(acceptedAt, "acceptedAt");
            this.acceptedAt = acceptedAt;
            return this;
        }


        /**
         * compensation details for the offer
         */
        public Builder compensation(List<AtsCompensation> compensation) {
            Utils.checkNotNull(compensation, "compensation");
            this.compensation = Optional.ofNullable(compensation);
            return this;
        }

        /**
         * compensation details for the offer
         */
        public Builder compensation(Optional<? extends List<AtsCompensation>> compensation) {
            Utils.checkNotNull(compensation, "compensation");
            this.compensation = compensation;
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


        public Builder creatorUserId(String creatorUserId) {
            Utils.checkNotNull(creatorUserId, "creatorUserId");
            this.creatorUserId = Optional.ofNullable(creatorUserId);
            return this;
        }

        public Builder creatorUserId(Optional<String> creatorUserId) {
            Utils.checkNotNull(creatorUserId, "creatorUserId");
            this.creatorUserId = creatorUserId;
            return this;
        }


        public Builder employeeUserId(String employeeUserId) {
            Utils.checkNotNull(employeeUserId, "employeeUserId");
            this.employeeUserId = Optional.ofNullable(employeeUserId);
            return this;
        }

        public Builder employeeUserId(Optional<String> employeeUserId) {
            Utils.checkNotNull(employeeUserId, "employeeUserId");
            this.employeeUserId = employeeUserId;
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


        public Builder rejectedAt(OffsetDateTime rejectedAt) {
            Utils.checkNotNull(rejectedAt, "rejectedAt");
            this.rejectedAt = Optional.ofNullable(rejectedAt);
            return this;
        }

        public Builder rejectedAt(Optional<OffsetDateTime> rejectedAt) {
            Utils.checkNotNull(rejectedAt, "rejectedAt");
            this.rejectedAt = rejectedAt;
            return this;
        }


        public Builder sentAt(OffsetDateTime sentAt) {
            Utils.checkNotNull(sentAt, "sentAt");
            this.sentAt = Optional.ofNullable(sentAt);
            return this;
        }

        public Builder sentAt(Optional<OffsetDateTime> sentAt) {
            Utils.checkNotNull(sentAt, "sentAt");
            this.sentAt = sentAt;
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


        public Builder status(AtsOfferStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<? extends AtsOfferStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
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

        public AtsOffer build() {

            return new AtsOffer(
                acceptedAt, compensation, createdAt,
                creatorUserId, employeeUserId, id,
                raw, rejectedAt, sentAt,
                startAt, status, updatedAt);
        }

    }
}
