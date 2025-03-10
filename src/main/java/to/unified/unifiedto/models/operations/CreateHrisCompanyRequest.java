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
import to.unified.unifiedto.models.shared.HrisCompany;
import to.unified.unifiedto.utils.SpeakeasyMetadata;
import to.unified.unifiedto.utils.Utils;

public class CreateHrisCompanyRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private HrisCompany hrisCompany;

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

    @JsonCreator
    public CreateHrisCompanyRequest(
            HrisCompany hrisCompany,
            String connectionId,
            Optional<? extends List<String>> fields) {
        Utils.checkNotNull(hrisCompany, "hrisCompany");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        this.hrisCompany = hrisCompany;
        this.connectionId = connectionId;
        this.fields = fields;
    }
    
    public CreateHrisCompanyRequest(
            HrisCompany hrisCompany,
            String connectionId) {
        this(hrisCompany, connectionId, Optional.empty());
    }

    @JsonIgnore
    public HrisCompany hrisCompany() {
        return hrisCompany;
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

    public final static Builder builder() {
        return new Builder();
    }

    public CreateHrisCompanyRequest withHrisCompany(HrisCompany hrisCompany) {
        Utils.checkNotNull(hrisCompany, "hrisCompany");
        this.hrisCompany = hrisCompany;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateHrisCompanyRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateHrisCompanyRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateHrisCompanyRequest withFields(Optional<? extends List<String>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
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
        CreateHrisCompanyRequest other = (CreateHrisCompanyRequest) o;
        return 
            Objects.deepEquals(this.hrisCompany, other.hrisCompany) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            hrisCompany,
            connectionId,
            fields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateHrisCompanyRequest.class,
                "hrisCompany", hrisCompany,
                "connectionId", connectionId,
                "fields", fields);
    }
    
    public final static class Builder {
 
        private HrisCompany hrisCompany;
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder hrisCompany(HrisCompany hrisCompany) {
            Utils.checkNotNull(hrisCompany, "hrisCompany");
            this.hrisCompany = hrisCompany;
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
        
        public CreateHrisCompanyRequest build() {
            return new CreateHrisCompanyRequest(
                hrisCompany,
                connectionId,
                fields);
        }
    }
}

