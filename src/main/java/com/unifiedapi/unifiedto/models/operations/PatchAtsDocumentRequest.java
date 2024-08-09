/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.AtsDocument;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class PatchAtsDocumentRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends AtsDocument> atsDocument;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * ID of the Document
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public PatchAtsDocumentRequest(
            Optional<? extends AtsDocument> atsDocument,
            String connectionId,
            String id) {
        Utils.checkNotNull(atsDocument, "atsDocument");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(id, "id");
        this.atsDocument = atsDocument;
        this.connectionId = connectionId;
        this.id = id;
    }
    
    public PatchAtsDocumentRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, id);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AtsDocument> atsDocument() {
        return (Optional<AtsDocument>) atsDocument;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * ID of the Document
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchAtsDocumentRequest withAtsDocument(AtsDocument atsDocument) {
        Utils.checkNotNull(atsDocument, "atsDocument");
        this.atsDocument = Optional.ofNullable(atsDocument);
        return this;
    }

    public PatchAtsDocumentRequest withAtsDocument(Optional<? extends AtsDocument> atsDocument) {
        Utils.checkNotNull(atsDocument, "atsDocument");
        this.atsDocument = atsDocument;
        return this;
    }

    /**
     * ID of the connection
     */
    public PatchAtsDocumentRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * ID of the Document
     */
    public PatchAtsDocumentRequest withId(String id) {
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
        PatchAtsDocumentRequest other = (PatchAtsDocumentRequest) o;
        return 
            Objects.deepEquals(this.atsDocument, other.atsDocument) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            atsDocument,
            connectionId,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchAtsDocumentRequest.class,
                "atsDocument", atsDocument,
                "connectionId", connectionId,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends AtsDocument> atsDocument = Optional.empty();
 
        private String connectionId;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder atsDocument(AtsDocument atsDocument) {
            Utils.checkNotNull(atsDocument, "atsDocument");
            this.atsDocument = Optional.ofNullable(atsDocument);
            return this;
        }

        public Builder atsDocument(Optional<? extends AtsDocument> atsDocument) {
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
         * ID of the Document
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PatchAtsDocumentRequest build() {
            return new PatchAtsDocumentRequest(
                atsDocument,
                connectionId,
                id);
        }
    }
}

