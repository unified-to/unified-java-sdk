/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.KmsPage;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class PatchKmsPageRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends KmsPage> kmsPage;

    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    private String connectionId;

    /**
     * ID of the Page
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public PatchKmsPageRequest(
            Optional<? extends KmsPage> kmsPage,
            String connectionId,
            String id) {
        Utils.checkNotNull(kmsPage, "kmsPage");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(id, "id");
        this.kmsPage = kmsPage;
        this.connectionId = connectionId;
        this.id = id;
    }
    
    public PatchKmsPageRequest(
            String connectionId,
            String id) {
        this(Optional.empty(), connectionId, id);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<KmsPage> kmsPage() {
        return (Optional<KmsPage>) kmsPage;
    }

    /**
     * ID of the connection
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * ID of the Page
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchKmsPageRequest withKmsPage(KmsPage kmsPage) {
        Utils.checkNotNull(kmsPage, "kmsPage");
        this.kmsPage = Optional.ofNullable(kmsPage);
        return this;
    }

    public PatchKmsPageRequest withKmsPage(Optional<? extends KmsPage> kmsPage) {
        Utils.checkNotNull(kmsPage, "kmsPage");
        this.kmsPage = kmsPage;
        return this;
    }

    /**
     * ID of the connection
     */
    public PatchKmsPageRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * ID of the Page
     */
    public PatchKmsPageRequest withId(String id) {
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
        PatchKmsPageRequest other = (PatchKmsPageRequest) o;
        return 
            Objects.deepEquals(this.kmsPage, other.kmsPage) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            kmsPage,
            connectionId,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchKmsPageRequest.class,
                "kmsPage", kmsPage,
                "connectionId", connectionId,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends KmsPage> kmsPage = Optional.empty();
 
        private String connectionId;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder kmsPage(KmsPage kmsPage) {
            Utils.checkNotNull(kmsPage, "kmsPage");
            this.kmsPage = Optional.ofNullable(kmsPage);
            return this;
        }

        public Builder kmsPage(Optional<? extends KmsPage> kmsPage) {
            Utils.checkNotNull(kmsPage, "kmsPage");
            this.kmsPage = kmsPage;
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
         * ID of the Page
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PatchKmsPageRequest build() {
            return new PatchKmsPageRequest(
                kmsPage,
                connectionId,
                id);
        }
    }
}

