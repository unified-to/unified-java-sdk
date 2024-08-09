/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetUnifiedApicallRequest {

    /**
     * ID of the Apicall
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public GetUnifiedApicallRequest(
            String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
    }

    /**
     * ID of the Apicall
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the Apicall
     */
    public GetUnifiedApicallRequest withId(String id) {
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
        GetUnifiedApicallRequest other = (GetUnifiedApicallRequest) o;
        return 
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetUnifiedApicallRequest.class,
                "id", id);
    }
    
    public final static class Builder {
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the Apicall
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public GetUnifiedApicallRequest build() {
            return new GetUnifiedApicallRequest(
                id);
        }
    }
}

