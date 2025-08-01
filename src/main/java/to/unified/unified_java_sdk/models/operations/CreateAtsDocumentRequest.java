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
import to.unified.unified_java_sdk.models.shared.AtsDocument;
import to.unified.unified_java_sdk.utils.SpeakeasyMetadata;
import to.unified.unified_java_sdk.utils.Utils;


public class CreateAtsDocumentRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private AtsDocument atsDocument;

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
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=raw")
    private Optional<String> raw;

    @JsonCreator
    public CreateAtsDocumentRequest(
            AtsDocument atsDocument,
            String connectionId,
            Optional<? extends List<String>> fields,
            Optional<String> raw) {
        Utils.checkNotNull(atsDocument, "atsDocument");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(raw, "raw");
        this.atsDocument = atsDocument;
        this.connectionId = connectionId;
        this.fields = fields;
        this.raw = raw;
    }
    
    public CreateAtsDocumentRequest(
            AtsDocument atsDocument,
            String connectionId) {
        this(atsDocument, connectionId, Optional.empty(),
            Optional.empty());
    }

    @JsonIgnore
    public AtsDocument atsDocument() {
        return atsDocument;
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
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    @JsonIgnore
    public Optional<String> raw() {
        return raw;
    }

    public static Builder builder() {
        return new Builder();
    }


    public CreateAtsDocumentRequest withAtsDocument(AtsDocument atsDocument) {
        Utils.checkNotNull(atsDocument, "atsDocument");
        this.atsDocument = atsDocument;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateAtsDocumentRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateAtsDocumentRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }


    /**
     * Comma-delimited fields to return
     */
    public CreateAtsDocumentRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    public CreateAtsDocumentRequest withRaw(String raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }


    /**
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    public CreateAtsDocumentRequest withRaw(Optional<String> raw) {
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
        CreateAtsDocumentRequest other = (CreateAtsDocumentRequest) o;
        return 
            Utils.enhancedDeepEquals(this.atsDocument, other.atsDocument) &&
            Utils.enhancedDeepEquals(this.connectionId, other.connectionId) &&
            Utils.enhancedDeepEquals(this.fields, other.fields) &&
            Utils.enhancedDeepEquals(this.raw, other.raw);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            atsDocument, connectionId, fields,
            raw);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateAtsDocumentRequest.class,
                "atsDocument", atsDocument,
                "connectionId", connectionId,
                "fields", fields,
                "raw", raw);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private AtsDocument atsDocument;

        private String connectionId;

        private Optional<? extends List<String>> fields = Optional.empty();

        private Optional<String> raw = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder atsDocument(AtsDocument atsDocument) {
            Utils.checkNotNull(atsDocument, "atsDocument");
            this.atsDocument = atsDocument;
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

        public CreateAtsDocumentRequest build() {

            return new CreateAtsDocumentRequest(
                atsDocument, connectionId, fields,
                raw);
        }

    }
}
