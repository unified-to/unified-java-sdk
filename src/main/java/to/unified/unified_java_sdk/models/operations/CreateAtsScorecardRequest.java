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
import to.unified.unified_java_sdk.models.shared.AtsScorecard;
import to.unified.unified_java_sdk.utils.SpeakeasyMetadata;
import to.unified.unified_java_sdk.utils.Utils;


public class CreateAtsScorecardRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private AtsScorecard atsScorecard;

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
    public CreateAtsScorecardRequest(
            AtsScorecard atsScorecard,
            String connectionId,
            Optional<? extends List<String>> fields,
            Optional<String> raw) {
        Utils.checkNotNull(atsScorecard, "atsScorecard");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(raw, "raw");
        this.atsScorecard = atsScorecard;
        this.connectionId = connectionId;
        this.fields = fields;
        this.raw = raw;
    }
    
    public CreateAtsScorecardRequest(
            AtsScorecard atsScorecard,
            String connectionId) {
        this(atsScorecard, connectionId, Optional.empty(),
            Optional.empty());
    }

    @JsonIgnore
    public AtsScorecard atsScorecard() {
        return atsScorecard;
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


    public CreateAtsScorecardRequest withAtsScorecard(AtsScorecard atsScorecard) {
        Utils.checkNotNull(atsScorecard, "atsScorecard");
        this.atsScorecard = atsScorecard;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateAtsScorecardRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateAtsScorecardRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }


    /**
     * Comma-delimited fields to return
     */
    public CreateAtsScorecardRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    public CreateAtsScorecardRequest withRaw(String raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }


    /**
     * Raw parameters to include in the 3rd-party request. Encoded as a URL component. eg. raw parameters: foo=bar&amp;zoo=bar -&gt; raw=foo%3Dbar%26zoo%3Dbar
     */
    public CreateAtsScorecardRequest withRaw(Optional<String> raw) {
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
        CreateAtsScorecardRequest other = (CreateAtsScorecardRequest) o;
        return 
            Utils.enhancedDeepEquals(this.atsScorecard, other.atsScorecard) &&
            Utils.enhancedDeepEquals(this.connectionId, other.connectionId) &&
            Utils.enhancedDeepEquals(this.fields, other.fields) &&
            Utils.enhancedDeepEquals(this.raw, other.raw);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            atsScorecard, connectionId, fields,
            raw);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateAtsScorecardRequest.class,
                "atsScorecard", atsScorecard,
                "connectionId", connectionId,
                "fields", fields,
                "raw", raw);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private AtsScorecard atsScorecard;

        private String connectionId;

        private Optional<? extends List<String>> fields = Optional.empty();

        private Optional<String> raw = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder atsScorecard(AtsScorecard atsScorecard) {
            Utils.checkNotNull(atsScorecard, "atsScorecard");
            this.atsScorecard = atsScorecard;
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

        public CreateAtsScorecardRequest build() {

            return new CreateAtsScorecardRequest(
                atsScorecard, connectionId, fields,
                raw);
        }

    }
}
