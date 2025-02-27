/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifiedapi.unifiedto.models.shared.TicketingTicket;
import com.unifiedapi.unifiedto.utils.Response;
import com.unifiedapi.unifiedto.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;

public class CreateTicketingTicketResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Successful
     */
    private Optional<? extends TicketingTicket> ticketingTicket;

    @JsonCreator
    public CreateTicketingTicketResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends TicketingTicket> ticketingTicket) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(ticketingTicket, "ticketingTicket");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.ticketingTicket = ticketingTicket;
    }
    
    public CreateTicketingTicketResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
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

    /**
     * Successful
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TicketingTicket> ticketingTicket() {
        return (Optional<TicketingTicket>) ticketingTicket;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateTicketingTicketResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateTicketingTicketResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateTicketingTicketResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Successful
     */
    public CreateTicketingTicketResponse withTicketingTicket(TicketingTicket ticketingTicket) {
        Utils.checkNotNull(ticketingTicket, "ticketingTicket");
        this.ticketingTicket = Optional.ofNullable(ticketingTicket);
        return this;
    }

    /**
     * Successful
     */
    public CreateTicketingTicketResponse withTicketingTicket(Optional<? extends TicketingTicket> ticketingTicket) {
        Utils.checkNotNull(ticketingTicket, "ticketingTicket");
        this.ticketingTicket = ticketingTicket;
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
        CreateTicketingTicketResponse other = (CreateTicketingTicketResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.ticketingTicket, other.ticketingTicket);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            ticketingTicket);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTicketingTicketResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "ticketingTicket", ticketingTicket);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends TicketingTicket> ticketingTicket = Optional.empty();  
        
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

        /**
         * Successful
         */
        public Builder ticketingTicket(TicketingTicket ticketingTicket) {
            Utils.checkNotNull(ticketingTicket, "ticketingTicket");
            this.ticketingTicket = Optional.ofNullable(ticketingTicket);
            return this;
        }

        /**
         * Successful
         */
        public Builder ticketingTicket(Optional<? extends TicketingTicket> ticketingTicket) {
            Utils.checkNotNull(ticketingTicket, "ticketingTicket");
            this.ticketingTicket = ticketingTicket;
            return this;
        }
        
        public CreateTicketingTicketResponse build() {
            return new CreateTicketingTicketResponse(
                contentType,
                statusCode,
                rawResponse,
                ticketingTicket);
        }
    }
}

