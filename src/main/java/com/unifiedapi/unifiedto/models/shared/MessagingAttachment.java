/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class MessagingAttachment {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("content_type")
    private Optional<String> contentType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("download_url")
    private Optional<String> downloadUrl;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filename")
    private Optional<String> filename;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message_id")
    private Optional<String> messageId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<Double> size;

    @JsonCreator
    public MessagingAttachment(
            @JsonProperty("content_type") Optional<String> contentType,
            @JsonProperty("download_url") Optional<String> downloadUrl,
            @JsonProperty("filename") Optional<String> filename,
            @JsonProperty("message_id") Optional<String> messageId,
            @JsonProperty("size") Optional<Double> size) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(downloadUrl, "downloadUrl");
        Utils.checkNotNull(filename, "filename");
        Utils.checkNotNull(messageId, "messageId");
        Utils.checkNotNull(size, "size");
        this.contentType = contentType;
        this.downloadUrl = downloadUrl;
        this.filename = filename;
        this.messageId = messageId;
        this.size = size;
    }
    
    public MessagingAttachment() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> contentType() {
        return contentType;
    }

    @JsonIgnore
    public Optional<String> downloadUrl() {
        return downloadUrl;
    }

    @JsonIgnore
    public Optional<String> filename() {
        return filename;
    }

    @JsonIgnore
    public Optional<String> messageId() {
        return messageId;
    }

    @JsonIgnore
    public Optional<Double> size() {
        return size;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public MessagingAttachment withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = Optional.ofNullable(contentType);
        return this;
    }

    public MessagingAttachment withContentType(Optional<String> contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    public MessagingAttachment withDownloadUrl(String downloadUrl) {
        Utils.checkNotNull(downloadUrl, "downloadUrl");
        this.downloadUrl = Optional.ofNullable(downloadUrl);
        return this;
    }

    public MessagingAttachment withDownloadUrl(Optional<String> downloadUrl) {
        Utils.checkNotNull(downloadUrl, "downloadUrl");
        this.downloadUrl = downloadUrl;
        return this;
    }

    public MessagingAttachment withFilename(String filename) {
        Utils.checkNotNull(filename, "filename");
        this.filename = Optional.ofNullable(filename);
        return this;
    }

    public MessagingAttachment withFilename(Optional<String> filename) {
        Utils.checkNotNull(filename, "filename");
        this.filename = filename;
        return this;
    }

    public MessagingAttachment withMessageId(String messageId) {
        Utils.checkNotNull(messageId, "messageId");
        this.messageId = Optional.ofNullable(messageId);
        return this;
    }

    public MessagingAttachment withMessageId(Optional<String> messageId) {
        Utils.checkNotNull(messageId, "messageId");
        this.messageId = messageId;
        return this;
    }

    public MessagingAttachment withSize(double size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public MessagingAttachment withSize(Optional<Double> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
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
        MessagingAttachment other = (MessagingAttachment) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.downloadUrl, other.downloadUrl) &&
            Objects.deepEquals(this.filename, other.filename) &&
            Objects.deepEquals(this.messageId, other.messageId) &&
            Objects.deepEquals(this.size, other.size);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            downloadUrl,
            filename,
            messageId,
            size);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MessagingAttachment.class,
                "contentType", contentType,
                "downloadUrl", downloadUrl,
                "filename", filename,
                "messageId", messageId,
                "size", size);
    }
    
    public final static class Builder {
 
        private Optional<String> contentType = Optional.empty();
 
        private Optional<String> downloadUrl = Optional.empty();
 
        private Optional<String> filename = Optional.empty();
 
        private Optional<String> messageId = Optional.empty();
 
        private Optional<Double> size = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = Optional.ofNullable(contentType);
            return this;
        }

        public Builder contentType(Optional<String> contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        public Builder downloadUrl(String downloadUrl) {
            Utils.checkNotNull(downloadUrl, "downloadUrl");
            this.downloadUrl = Optional.ofNullable(downloadUrl);
            return this;
        }

        public Builder downloadUrl(Optional<String> downloadUrl) {
            Utils.checkNotNull(downloadUrl, "downloadUrl");
            this.downloadUrl = downloadUrl;
            return this;
        }

        public Builder filename(String filename) {
            Utils.checkNotNull(filename, "filename");
            this.filename = Optional.ofNullable(filename);
            return this;
        }

        public Builder filename(Optional<String> filename) {
            Utils.checkNotNull(filename, "filename");
            this.filename = filename;
            return this;
        }

        public Builder messageId(String messageId) {
            Utils.checkNotNull(messageId, "messageId");
            this.messageId = Optional.ofNullable(messageId);
            return this;
        }

        public Builder messageId(Optional<String> messageId) {
            Utils.checkNotNull(messageId, "messageId");
            this.messageId = messageId;
            return this;
        }

        public Builder size(double size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        public Builder size(Optional<Double> size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }
        
        public MessagingAttachment build() {
            return new MessagingAttachment(
                contentType,
                downloadUrl,
                filename,
                messageId,
                size);
        }
    }
}
