/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Optional;
import to.unified.unified_java_sdk.models.shared.MessagingMessage;
import to.unified.unified_java_sdk.utils.Response;
import to.unified.unified_java_sdk.utils.Utils;


public class UpdateMessagingMessageResponse implements Response {
    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Successful
     */
    private Optional<? extends MessagingMessage> messagingMessage;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public UpdateMessagingMessageResponse(
            String contentType,
            Optional<? extends MessagingMessage> messagingMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(messagingMessage, "messagingMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.messagingMessage = messagingMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public UpdateMessagingMessageResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode,
            rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * Successful
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MessagingMessage> messagingMessage() {
        return (Optional<MessagingMessage>) messagingMessage;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * HTTP response content type for this operation
     */
    public UpdateMessagingMessageResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Successful
     */
    public UpdateMessagingMessageResponse withMessagingMessage(MessagingMessage messagingMessage) {
        Utils.checkNotNull(messagingMessage, "messagingMessage");
        this.messagingMessage = Optional.ofNullable(messagingMessage);
        return this;
    }


    /**
     * Successful
     */
    public UpdateMessagingMessageResponse withMessagingMessage(Optional<? extends MessagingMessage> messagingMessage) {
        Utils.checkNotNull(messagingMessage, "messagingMessage");
        this.messagingMessage = messagingMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public UpdateMessagingMessageResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UpdateMessagingMessageResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
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
        UpdateMessagingMessageResponse other = (UpdateMessagingMessageResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.messagingMessage, other.messagingMessage) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, messagingMessage, statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateMessagingMessageResponse.class,
                "contentType", contentType,
                "messagingMessage", messagingMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Optional<? extends MessagingMessage> messagingMessage = Optional.empty();

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }


        /**
         * Successful
         */
        public Builder messagingMessage(MessagingMessage messagingMessage) {
            Utils.checkNotNull(messagingMessage, "messagingMessage");
            this.messagingMessage = Optional.ofNullable(messagingMessage);
            return this;
        }

        /**
         * Successful
         */
        public Builder messagingMessage(Optional<? extends MessagingMessage> messagingMessage) {
            Utils.checkNotNull(messagingMessage, "messagingMessage");
            this.messagingMessage = messagingMessage;
            return this;
        }


        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }


        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        public UpdateMessagingMessageResponse build() {

            return new UpdateMessagingMessageResponse(
                contentType, messagingMessage, statusCode,
                rawResponse);
        }

    }
}
