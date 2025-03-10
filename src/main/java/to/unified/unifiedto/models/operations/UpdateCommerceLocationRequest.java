/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package to.unified.unifiedto.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import to.unified.unifiedto.models.shared.CommerceLocation;
import to.unified.unifiedto.utils.SpeakeasyMetadata;
import to.unified.unifiedto.utils.Utils;

public class UpdateCommerceLocationRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CommerceLocation commerceLocation;

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
     * ID of the Location
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public UpdateCommerceLocationRequest(
            CommerceLocation commerceLocation,
            String connectionId,
            Optional<? extends List<String>> fields,
            String id) {
        Utils.checkNotNull(commerceLocation, "commerceLocation");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(id, "id");
        this.commerceLocation = commerceLocation;
        this.connectionId = connectionId;
        this.fields = fields;
        this.id = id;
    }
    
    public UpdateCommerceLocationRequest(
            CommerceLocation commerceLocation,
            String connectionId,
            String id) {
        this(commerceLocation, connectionId, Optional.empty(), id);
    }

    @JsonIgnore
    public CommerceLocation commerceLocation() {
        return commerceLocation;
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
     * ID of the Location
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateCommerceLocationRequest withCommerceLocation(CommerceLocation commerceLocation) {
        Utils.checkNotNull(commerceLocation, "commerceLocation");
        this.commerceLocation = commerceLocation;
        return this;
    }

    /**
     * ID of the connection
     */
    public UpdateCommerceLocationRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public UpdateCommerceLocationRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public UpdateCommerceLocationRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * ID of the Location
     */
    public UpdateCommerceLocationRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        UpdateCommerceLocationRequest other = (UpdateCommerceLocationRequest) o;
        return 
            Objects.deepEquals(this.commerceLocation, other.commerceLocation) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            commerceLocation,
            connectionId,
            fields,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateCommerceLocationRequest.class,
                "commerceLocation", commerceLocation,
                "connectionId", connectionId,
                "fields", fields,
                "id", id);
    }
    
    public final static class Builder {
 
        private CommerceLocation commerceLocation;
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder commerceLocation(CommerceLocation commerceLocation) {
            Utils.checkNotNull(commerceLocation, "commerceLocation");
            this.commerceLocation = commerceLocation;
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
         * ID of the Location
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public UpdateCommerceLocationRequest build() {
            return new UpdateCommerceLocationRequest(
                commerceLocation,
                connectionId,
                fields,
                id);
        }
    }
}

