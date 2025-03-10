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
import to.unified.unifiedto.models.shared.CrmDeal;
import to.unified.unifiedto.utils.SpeakeasyMetadata;
import to.unified.unifiedto.utils.Utils;

public class CreateCrmDealRequest {

    /**
     * A deal represents an opportunity with companies and/or contacts
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private CrmDeal crmDeal;

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
    public CreateCrmDealRequest(
            CrmDeal crmDeal,
            String connectionId,
            Optional<? extends List<String>> fields) {
        Utils.checkNotNull(crmDeal, "crmDeal");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(fields, "fields");
        this.crmDeal = crmDeal;
        this.connectionId = connectionId;
        this.fields = fields;
    }
    
    public CreateCrmDealRequest(
            CrmDeal crmDeal,
            String connectionId) {
        this(crmDeal, connectionId, Optional.empty());
    }

    /**
     * A deal represents an opportunity with companies and/or contacts
     */
    @JsonIgnore
    public CrmDeal crmDeal() {
        return crmDeal;
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

    /**
     * A deal represents an opportunity with companies and/or contacts
     */
    public CreateCrmDealRequest withCrmDeal(CrmDeal crmDeal) {
        Utils.checkNotNull(crmDeal, "crmDeal");
        this.crmDeal = crmDeal;
        return this;
    }

    /**
     * ID of the connection
     */
    public CreateCrmDealRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateCrmDealRequest withFields(List<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Comma-delimited fields to return
     */
    public CreateCrmDealRequest withFields(Optional<? extends List<String>> fields) {
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
        CreateCrmDealRequest other = (CreateCrmDealRequest) o;
        return 
            Objects.deepEquals(this.crmDeal, other.crmDeal) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.fields, other.fields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            crmDeal,
            connectionId,
            fields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCrmDealRequest.class,
                "crmDeal", crmDeal,
                "connectionId", connectionId,
                "fields", fields);
    }
    
    public final static class Builder {
 
        private CrmDeal crmDeal;
 
        private String connectionId;
 
        private Optional<? extends List<String>> fields = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A deal represents an opportunity with companies and/or contacts
         */
        public Builder crmDeal(CrmDeal crmDeal) {
            Utils.checkNotNull(crmDeal, "crmDeal");
            this.crmDeal = crmDeal;
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
        
        public CreateCrmDealRequest build() {
            return new CreateCrmDealRequest(
                crmDeal,
                connectionId,
                fields);
        }
    }
}

