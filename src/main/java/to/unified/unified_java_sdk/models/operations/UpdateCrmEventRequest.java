/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Optional;
import to.unified.unified_java_sdk.models.shared.CrmEvent;
import to.unified.unified_java_sdk.utils.SpeakeasyMetadata;
import to.unified.unified_java_sdk.utils.Utils;


public class UpdateCrmEventRequest {
    /**
     * An event represents an event, activity, or engagement and is always associated with a deal, contact, or company
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private CrmEvent crmEvent;

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
     * ID of the Event
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=raw")
    private Optional<String> raw;

    @JsonCreator
    public UpdateCrmEventRequest(
            CrmEvent crmEvent,
            String connectionId,
            Optional<? extends List<String>> fields,
            String id,
            Optional<String> raw) {
        Utils.checkNotNull(crmEvent, "crmEvent");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(raw, "raw");
        this.crmEvent = crmEvent;
        this.connectionId = connectionId;
        this.fields = fields;
        this.id = id;
        this.raw = raw;
    }
    
    public UpdateCrmEventRequest(
            CrmEvent crmEvent,
            String connectionId,
            String id) {
        this(crmEvent, connectionId, Optional.empty(),
            id, Optional.empty());
    }

    /**
     * An event represents an event, activity, or engagement and is always associated with a deal, contact, or company
     */
    @JsonIgnore
    public CrmEvent crmEvent() {
        return crmEvent;
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
     * ID of the Event
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    @JsonIgnore
    public Optional<String> raw() {
        return raw;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * An event represents an event, activity, or engagement and is always associated with a deal, contact, or company
     */
    public UpdateCrmEventRequest withCrmEvent(CrmEvent crmEvent) {
        Utils.checkNotNull(crmEvent, "crmEvent");
        this.crmEvent = crmEvent;
        return this;
    }

    /**
     * ID of the connection
     */
    public UpdateCrmEventRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public UpdateCrmEventRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }


    /**
     * Comma-delimited fields to return
     */
    public UpdateCrmEventRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * ID of the Event
     */
    public UpdateCrmEventRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    public UpdateCrmEventRequest withRaw(String raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }


    /**
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    public UpdateCrmEventRequest withRaw(Optional<String> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
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
        UpdateCrmEventRequest other = (UpdateCrmEventRequest) o;
        return 
            Utils.enhancedDeepEquals(this.crmEvent, other.crmEvent) &&
            Utils.enhancedDeepEquals(this.connectionId, other.connectionId) &&
            Utils.enhancedDeepEquals(this.fields, other.fields) &&
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.raw, other.raw);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            crmEvent, connectionId, fields,
            id, raw);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateCrmEventRequest.class,
                "crmEvent", crmEvent,
                "connectionId", connectionId,
                "fields", fields,
                "id", id,
                "raw", raw);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private CrmEvent crmEvent;

        private String connectionId;

        private Optional<? extends List<String>> fields = Optional.empty();

        private String id;

        private Optional<String> raw = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * An event represents an event, activity, or engagement and is always associated with a deal, contact, or company
         */
        public Builder crmEvent(CrmEvent crmEvent) {
            Utils.checkNotNull(crmEvent, "crmEvent");
            this.crmEvent = crmEvent;
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
         * ID of the Event
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }


        /**
         * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
         */
        public Builder raw(String raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        /**
         * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
         */
        public Builder raw(Optional<String> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        public UpdateCrmEventRequest build() {

            return new UpdateCrmEventRequest(
                crmEvent, connectionId, fields,
                id, raw);
        }

    }
}
