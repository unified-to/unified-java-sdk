/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import to.unified.unified_java_sdk.utils.SpeakeasyMetadata;
import to.unified.unified_java_sdk.utils.Utils;


public class RemoveUnifiedWebhookRequest {
    /**
     * ID of the Webhook
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public RemoveUnifiedWebhookRequest(
            String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
    }

    /**
     * ID of the Webhook
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * ID of the Webhook
     */
    public RemoveUnifiedWebhookRequest withId(String id) {
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
        RemoveUnifiedWebhookRequest other = (RemoveUnifiedWebhookRequest) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RemoveUnifiedWebhookRequest.class,
                "id", id);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String id;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * ID of the Webhook
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public RemoveUnifiedWebhookRequest build() {

            return new RemoveUnifiedWebhookRequest(
                id);
        }

    }
}
