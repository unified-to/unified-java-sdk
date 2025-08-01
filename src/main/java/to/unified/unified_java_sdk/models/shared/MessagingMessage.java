/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import to.unified.unified_java_sdk.utils.Utils;


public class MessagingMessage {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attachments")
    private Optional<? extends List<MessagingAttachment>> attachments;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("author_member")
    private Optional<? extends PropertyMessagingMessageAuthorMember> authorMember;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channel_id")
    private Optional<String> channelId;

    /**
     * Represents the IDs of all channels to which the message is sent. Identifies the channels where the message is posted.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channel_ids")
    private Optional<? extends List<String>> channelIds;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("destination_members")
    private Optional<? extends List<MessagingMember>> destinationMembers;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has_children")
    private Optional<Boolean> hasChildren;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden_members")
    private Optional<? extends List<MessagingMember>> hiddenMembers;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mentioned_members")
    private Optional<? extends List<MessagingMember>> mentionedMembers;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<String> message;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message_html")
    private Optional<String> messageHtml;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message_markdown")
    private Optional<String> messageMarkdown;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent_message_id")
    private Optional<String> parentMessageId;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reactions")
    private Optional<? extends List<MessagingReaction>> reactions;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private Optional<String> reference;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("root_message_id")
    private Optional<String> rootMessageId;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subject")
    private Optional<String> subject;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("web_url")
    private Optional<String> webUrl;

    @JsonCreator
    public MessagingMessage(
            @JsonProperty("attachments") Optional<? extends List<MessagingAttachment>> attachments,
            @JsonProperty("author_member") Optional<? extends PropertyMessagingMessageAuthorMember> authorMember,
            @JsonProperty("channel_id") Optional<String> channelId,
            @JsonProperty("channel_ids") Optional<? extends List<String>> channelIds,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("destination_members") Optional<? extends List<MessagingMember>> destinationMembers,
            @JsonProperty("has_children") Optional<Boolean> hasChildren,
            @JsonProperty("hidden_members") Optional<? extends List<MessagingMember>> hiddenMembers,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("mentioned_members") Optional<? extends List<MessagingMember>> mentionedMembers,
            @JsonProperty("message") Optional<String> message,
            @JsonProperty("message_html") Optional<String> messageHtml,
            @JsonProperty("message_markdown") Optional<String> messageMarkdown,
            @JsonProperty("parent_message_id") Optional<String> parentMessageId,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("reactions") Optional<? extends List<MessagingReaction>> reactions,
            @JsonProperty("reference") Optional<String> reference,
            @JsonProperty("root_message_id") Optional<String> rootMessageId,
            @JsonProperty("subject") Optional<String> subject,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt,
            @JsonProperty("web_url") Optional<String> webUrl) {
        Utils.checkNotNull(attachments, "attachments");
        Utils.checkNotNull(authorMember, "authorMember");
        Utils.checkNotNull(channelId, "channelId");
        Utils.checkNotNull(channelIds, "channelIds");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(destinationMembers, "destinationMembers");
        Utils.checkNotNull(hasChildren, "hasChildren");
        Utils.checkNotNull(hiddenMembers, "hiddenMembers");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(mentionedMembers, "mentionedMembers");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(messageHtml, "messageHtml");
        Utils.checkNotNull(messageMarkdown, "messageMarkdown");
        Utils.checkNotNull(parentMessageId, "parentMessageId");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(reactions, "reactions");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(rootMessageId, "rootMessageId");
        Utils.checkNotNull(subject, "subject");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(webUrl, "webUrl");
        this.attachments = attachments;
        this.authorMember = authorMember;
        this.channelId = channelId;
        this.channelIds = channelIds;
        this.createdAt = createdAt;
        this.destinationMembers = destinationMembers;
        this.hasChildren = hasChildren;
        this.hiddenMembers = hiddenMembers;
        this.id = id;
        this.mentionedMembers = mentionedMembers;
        this.message = message;
        this.messageHtml = messageHtml;
        this.messageMarkdown = messageMarkdown;
        this.parentMessageId = parentMessageId;
        this.raw = raw;
        this.reactions = reactions;
        this.reference = reference;
        this.rootMessageId = rootMessageId;
        this.subject = subject;
        this.updatedAt = updatedAt;
        this.webUrl = webUrl;
    }
    
    public MessagingMessage() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MessagingAttachment>> attachments() {
        return (Optional<List<MessagingAttachment>>) attachments;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PropertyMessagingMessageAuthorMember> authorMember() {
        return (Optional<PropertyMessagingMessageAuthorMember>) authorMember;
    }

    @JsonIgnore
    public Optional<String> channelId() {
        return channelId;
    }

    /**
     * Represents the IDs of all channels to which the message is sent. Identifies the channels where the message is posted.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> channelIds() {
        return (Optional<List<String>>) channelIds;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MessagingMember>> destinationMembers() {
        return (Optional<List<MessagingMember>>) destinationMembers;
    }

    @JsonIgnore
    public Optional<Boolean> hasChildren() {
        return hasChildren;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MessagingMember>> hiddenMembers() {
        return (Optional<List<MessagingMember>>) hiddenMembers;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MessagingMember>> mentionedMembers() {
        return (Optional<List<MessagingMember>>) mentionedMembers;
    }

    @JsonIgnore
    public Optional<String> message() {
        return message;
    }

    @JsonIgnore
    public Optional<String> messageHtml() {
        return messageHtml;
    }

    @JsonIgnore
    public Optional<String> messageMarkdown() {
        return messageMarkdown;
    }

    @JsonIgnore
    public Optional<String> parentMessageId() {
        return parentMessageId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MessagingReaction>> reactions() {
        return (Optional<List<MessagingReaction>>) reactions;
    }

    @JsonIgnore
    public Optional<String> reference() {
        return reference;
    }

    @JsonIgnore
    public Optional<String> rootMessageId() {
        return rootMessageId;
    }

    @JsonIgnore
    public Optional<String> subject() {
        return subject;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    @JsonIgnore
    public Optional<String> webUrl() {
        return webUrl;
    }

    public static Builder builder() {
        return new Builder();
    }


    public MessagingMessage withAttachments(List<MessagingAttachment> attachments) {
        Utils.checkNotNull(attachments, "attachments");
        this.attachments = Optional.ofNullable(attachments);
        return this;
    }


    public MessagingMessage withAttachments(Optional<? extends List<MessagingAttachment>> attachments) {
        Utils.checkNotNull(attachments, "attachments");
        this.attachments = attachments;
        return this;
    }

    public MessagingMessage withAuthorMember(PropertyMessagingMessageAuthorMember authorMember) {
        Utils.checkNotNull(authorMember, "authorMember");
        this.authorMember = Optional.ofNullable(authorMember);
        return this;
    }


    public MessagingMessage withAuthorMember(Optional<? extends PropertyMessagingMessageAuthorMember> authorMember) {
        Utils.checkNotNull(authorMember, "authorMember");
        this.authorMember = authorMember;
        return this;
    }

    public MessagingMessage withChannelId(String channelId) {
        Utils.checkNotNull(channelId, "channelId");
        this.channelId = Optional.ofNullable(channelId);
        return this;
    }


    public MessagingMessage withChannelId(Optional<String> channelId) {
        Utils.checkNotNull(channelId, "channelId");
        this.channelId = channelId;
        return this;
    }

    /**
     * Represents the IDs of all channels to which the message is sent. Identifies the channels where the message is posted.
     */
    public MessagingMessage withChannelIds(List<String> channelIds) {
        Utils.checkNotNull(channelIds, "channelIds");
        this.channelIds = Optional.ofNullable(channelIds);
        return this;
    }


    /**
     * Represents the IDs of all channels to which the message is sent. Identifies the channels where the message is posted.
     */
    public MessagingMessage withChannelIds(Optional<? extends List<String>> channelIds) {
        Utils.checkNotNull(channelIds, "channelIds");
        this.channelIds = channelIds;
        return this;
    }

    public MessagingMessage withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }


    public MessagingMessage withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public MessagingMessage withDestinationMembers(List<MessagingMember> destinationMembers) {
        Utils.checkNotNull(destinationMembers, "destinationMembers");
        this.destinationMembers = Optional.ofNullable(destinationMembers);
        return this;
    }


    public MessagingMessage withDestinationMembers(Optional<? extends List<MessagingMember>> destinationMembers) {
        Utils.checkNotNull(destinationMembers, "destinationMembers");
        this.destinationMembers = destinationMembers;
        return this;
    }

    public MessagingMessage withHasChildren(boolean hasChildren) {
        Utils.checkNotNull(hasChildren, "hasChildren");
        this.hasChildren = Optional.ofNullable(hasChildren);
        return this;
    }


    public MessagingMessage withHasChildren(Optional<Boolean> hasChildren) {
        Utils.checkNotNull(hasChildren, "hasChildren");
        this.hasChildren = hasChildren;
        return this;
    }

    public MessagingMessage withHiddenMembers(List<MessagingMember> hiddenMembers) {
        Utils.checkNotNull(hiddenMembers, "hiddenMembers");
        this.hiddenMembers = Optional.ofNullable(hiddenMembers);
        return this;
    }


    public MessagingMessage withHiddenMembers(Optional<? extends List<MessagingMember>> hiddenMembers) {
        Utils.checkNotNull(hiddenMembers, "hiddenMembers");
        this.hiddenMembers = hiddenMembers;
        return this;
    }

    public MessagingMessage withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    public MessagingMessage withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public MessagingMessage withMentionedMembers(List<MessagingMember> mentionedMembers) {
        Utils.checkNotNull(mentionedMembers, "mentionedMembers");
        this.mentionedMembers = Optional.ofNullable(mentionedMembers);
        return this;
    }


    public MessagingMessage withMentionedMembers(Optional<? extends List<MessagingMember>> mentionedMembers) {
        Utils.checkNotNull(mentionedMembers, "mentionedMembers");
        this.mentionedMembers = mentionedMembers;
        return this;
    }

    public MessagingMessage withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }


    public MessagingMessage withMessage(Optional<String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    public MessagingMessage withMessageHtml(String messageHtml) {
        Utils.checkNotNull(messageHtml, "messageHtml");
        this.messageHtml = Optional.ofNullable(messageHtml);
        return this;
    }


    public MessagingMessage withMessageHtml(Optional<String> messageHtml) {
        Utils.checkNotNull(messageHtml, "messageHtml");
        this.messageHtml = messageHtml;
        return this;
    }

    public MessagingMessage withMessageMarkdown(String messageMarkdown) {
        Utils.checkNotNull(messageMarkdown, "messageMarkdown");
        this.messageMarkdown = Optional.ofNullable(messageMarkdown);
        return this;
    }


    public MessagingMessage withMessageMarkdown(Optional<String> messageMarkdown) {
        Utils.checkNotNull(messageMarkdown, "messageMarkdown");
        this.messageMarkdown = messageMarkdown;
        return this;
    }

    public MessagingMessage withParentMessageId(String parentMessageId) {
        Utils.checkNotNull(parentMessageId, "parentMessageId");
        this.parentMessageId = Optional.ofNullable(parentMessageId);
        return this;
    }


    public MessagingMessage withParentMessageId(Optional<String> parentMessageId) {
        Utils.checkNotNull(parentMessageId, "parentMessageId");
        this.parentMessageId = parentMessageId;
        return this;
    }

    public MessagingMessage withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }


    public MessagingMessage withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public MessagingMessage withReactions(List<MessagingReaction> reactions) {
        Utils.checkNotNull(reactions, "reactions");
        this.reactions = Optional.ofNullable(reactions);
        return this;
    }


    public MessagingMessage withReactions(Optional<? extends List<MessagingReaction>> reactions) {
        Utils.checkNotNull(reactions, "reactions");
        this.reactions = reactions;
        return this;
    }

    public MessagingMessage withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }


    public MessagingMessage withReference(Optional<String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public MessagingMessage withRootMessageId(String rootMessageId) {
        Utils.checkNotNull(rootMessageId, "rootMessageId");
        this.rootMessageId = Optional.ofNullable(rootMessageId);
        return this;
    }


    public MessagingMessage withRootMessageId(Optional<String> rootMessageId) {
        Utils.checkNotNull(rootMessageId, "rootMessageId");
        this.rootMessageId = rootMessageId;
        return this;
    }

    public MessagingMessage withSubject(String subject) {
        Utils.checkNotNull(subject, "subject");
        this.subject = Optional.ofNullable(subject);
        return this;
    }


    public MessagingMessage withSubject(Optional<String> subject) {
        Utils.checkNotNull(subject, "subject");
        this.subject = subject;
        return this;
    }

    public MessagingMessage withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }


    public MessagingMessage withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public MessagingMessage withWebUrl(String webUrl) {
        Utils.checkNotNull(webUrl, "webUrl");
        this.webUrl = Optional.ofNullable(webUrl);
        return this;
    }


    public MessagingMessage withWebUrl(Optional<String> webUrl) {
        Utils.checkNotNull(webUrl, "webUrl");
        this.webUrl = webUrl;
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
        MessagingMessage other = (MessagingMessage) o;
        return 
            Utils.enhancedDeepEquals(this.attachments, other.attachments) &&
            Utils.enhancedDeepEquals(this.authorMember, other.authorMember) &&
            Utils.enhancedDeepEquals(this.channelId, other.channelId) &&
            Utils.enhancedDeepEquals(this.channelIds, other.channelIds) &&
            Utils.enhancedDeepEquals(this.createdAt, other.createdAt) &&
            Utils.enhancedDeepEquals(this.destinationMembers, other.destinationMembers) &&
            Utils.enhancedDeepEquals(this.hasChildren, other.hasChildren) &&
            Utils.enhancedDeepEquals(this.hiddenMembers, other.hiddenMembers) &&
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.mentionedMembers, other.mentionedMembers) &&
            Utils.enhancedDeepEquals(this.message, other.message) &&
            Utils.enhancedDeepEquals(this.messageHtml, other.messageHtml) &&
            Utils.enhancedDeepEquals(this.messageMarkdown, other.messageMarkdown) &&
            Utils.enhancedDeepEquals(this.parentMessageId, other.parentMessageId) &&
            Utils.enhancedDeepEquals(this.raw, other.raw) &&
            Utils.enhancedDeepEquals(this.reactions, other.reactions) &&
            Utils.enhancedDeepEquals(this.reference, other.reference) &&
            Utils.enhancedDeepEquals(this.rootMessageId, other.rootMessageId) &&
            Utils.enhancedDeepEquals(this.subject, other.subject) &&
            Utils.enhancedDeepEquals(this.updatedAt, other.updatedAt) &&
            Utils.enhancedDeepEquals(this.webUrl, other.webUrl);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            attachments, authorMember, channelId,
            channelIds, createdAt, destinationMembers,
            hasChildren, hiddenMembers, id,
            mentionedMembers, message, messageHtml,
            messageMarkdown, parentMessageId, raw,
            reactions, reference, rootMessageId,
            subject, updatedAt, webUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MessagingMessage.class,
                "attachments", attachments,
                "authorMember", authorMember,
                "channelId", channelId,
                "channelIds", channelIds,
                "createdAt", createdAt,
                "destinationMembers", destinationMembers,
                "hasChildren", hasChildren,
                "hiddenMembers", hiddenMembers,
                "id", id,
                "mentionedMembers", mentionedMembers,
                "message", message,
                "messageHtml", messageHtml,
                "messageMarkdown", messageMarkdown,
                "parentMessageId", parentMessageId,
                "raw", raw,
                "reactions", reactions,
                "reference", reference,
                "rootMessageId", rootMessageId,
                "subject", subject,
                "updatedAt", updatedAt,
                "webUrl", webUrl);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<? extends List<MessagingAttachment>> attachments = Optional.empty();

        private Optional<? extends PropertyMessagingMessageAuthorMember> authorMember = Optional.empty();

        private Optional<String> channelId = Optional.empty();

        private Optional<? extends List<String>> channelIds = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<? extends List<MessagingMember>> destinationMembers = Optional.empty();

        private Optional<Boolean> hasChildren = Optional.empty();

        private Optional<? extends List<MessagingMember>> hiddenMembers = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<? extends List<MessagingMember>> mentionedMembers = Optional.empty();

        private Optional<String> message = Optional.empty();

        private Optional<String> messageHtml = Optional.empty();

        private Optional<String> messageMarkdown = Optional.empty();

        private Optional<String> parentMessageId = Optional.empty();

        private Optional<? extends Map<String, Object>> raw = Optional.empty();

        private Optional<? extends List<MessagingReaction>> reactions = Optional.empty();

        private Optional<String> reference = Optional.empty();

        private Optional<String> rootMessageId = Optional.empty();

        private Optional<String> subject = Optional.empty();

        private Optional<OffsetDateTime> updatedAt = Optional.empty();

        private Optional<String> webUrl = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder attachments(List<MessagingAttachment> attachments) {
            Utils.checkNotNull(attachments, "attachments");
            this.attachments = Optional.ofNullable(attachments);
            return this;
        }

        public Builder attachments(Optional<? extends List<MessagingAttachment>> attachments) {
            Utils.checkNotNull(attachments, "attachments");
            this.attachments = attachments;
            return this;
        }


        public Builder authorMember(PropertyMessagingMessageAuthorMember authorMember) {
            Utils.checkNotNull(authorMember, "authorMember");
            this.authorMember = Optional.ofNullable(authorMember);
            return this;
        }

        public Builder authorMember(Optional<? extends PropertyMessagingMessageAuthorMember> authorMember) {
            Utils.checkNotNull(authorMember, "authorMember");
            this.authorMember = authorMember;
            return this;
        }


        public Builder channelId(String channelId) {
            Utils.checkNotNull(channelId, "channelId");
            this.channelId = Optional.ofNullable(channelId);
            return this;
        }

        public Builder channelId(Optional<String> channelId) {
            Utils.checkNotNull(channelId, "channelId");
            this.channelId = channelId;
            return this;
        }


        /**
         * Represents the IDs of all channels to which the message is sent. Identifies the channels where the message is posted.
         */
        public Builder channelIds(List<String> channelIds) {
            Utils.checkNotNull(channelIds, "channelIds");
            this.channelIds = Optional.ofNullable(channelIds);
            return this;
        }

        /**
         * Represents the IDs of all channels to which the message is sent. Identifies the channels where the message is posted.
         */
        public Builder channelIds(Optional<? extends List<String>> channelIds) {
            Utils.checkNotNull(channelIds, "channelIds");
            this.channelIds = channelIds;
            return this;
        }


        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        public Builder createdAt(Optional<OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }


        public Builder destinationMembers(List<MessagingMember> destinationMembers) {
            Utils.checkNotNull(destinationMembers, "destinationMembers");
            this.destinationMembers = Optional.ofNullable(destinationMembers);
            return this;
        }

        public Builder destinationMembers(Optional<? extends List<MessagingMember>> destinationMembers) {
            Utils.checkNotNull(destinationMembers, "destinationMembers");
            this.destinationMembers = destinationMembers;
            return this;
        }


        public Builder hasChildren(boolean hasChildren) {
            Utils.checkNotNull(hasChildren, "hasChildren");
            this.hasChildren = Optional.ofNullable(hasChildren);
            return this;
        }

        public Builder hasChildren(Optional<Boolean> hasChildren) {
            Utils.checkNotNull(hasChildren, "hasChildren");
            this.hasChildren = hasChildren;
            return this;
        }


        public Builder hiddenMembers(List<MessagingMember> hiddenMembers) {
            Utils.checkNotNull(hiddenMembers, "hiddenMembers");
            this.hiddenMembers = Optional.ofNullable(hiddenMembers);
            return this;
        }

        public Builder hiddenMembers(Optional<? extends List<MessagingMember>> hiddenMembers) {
            Utils.checkNotNull(hiddenMembers, "hiddenMembers");
            this.hiddenMembers = hiddenMembers;
            return this;
        }


        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }


        public Builder mentionedMembers(List<MessagingMember> mentionedMembers) {
            Utils.checkNotNull(mentionedMembers, "mentionedMembers");
            this.mentionedMembers = Optional.ofNullable(mentionedMembers);
            return this;
        }

        public Builder mentionedMembers(Optional<? extends List<MessagingMember>> mentionedMembers) {
            Utils.checkNotNull(mentionedMembers, "mentionedMembers");
            this.mentionedMembers = mentionedMembers;
            return this;
        }


        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = Optional.ofNullable(message);
            return this;
        }

        public Builder message(Optional<String> message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }


        public Builder messageHtml(String messageHtml) {
            Utils.checkNotNull(messageHtml, "messageHtml");
            this.messageHtml = Optional.ofNullable(messageHtml);
            return this;
        }

        public Builder messageHtml(Optional<String> messageHtml) {
            Utils.checkNotNull(messageHtml, "messageHtml");
            this.messageHtml = messageHtml;
            return this;
        }


        public Builder messageMarkdown(String messageMarkdown) {
            Utils.checkNotNull(messageMarkdown, "messageMarkdown");
            this.messageMarkdown = Optional.ofNullable(messageMarkdown);
            return this;
        }

        public Builder messageMarkdown(Optional<String> messageMarkdown) {
            Utils.checkNotNull(messageMarkdown, "messageMarkdown");
            this.messageMarkdown = messageMarkdown;
            return this;
        }


        public Builder parentMessageId(String parentMessageId) {
            Utils.checkNotNull(parentMessageId, "parentMessageId");
            this.parentMessageId = Optional.ofNullable(parentMessageId);
            return this;
        }

        public Builder parentMessageId(Optional<String> parentMessageId) {
            Utils.checkNotNull(parentMessageId, "parentMessageId");
            this.parentMessageId = parentMessageId;
            return this;
        }


        public Builder raw(Map<String, Object> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        public Builder raw(Optional<? extends Map<String, Object>> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }


        public Builder reactions(List<MessagingReaction> reactions) {
            Utils.checkNotNull(reactions, "reactions");
            this.reactions = Optional.ofNullable(reactions);
            return this;
        }

        public Builder reactions(Optional<? extends List<MessagingReaction>> reactions) {
            Utils.checkNotNull(reactions, "reactions");
            this.reactions = reactions;
            return this;
        }


        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = Optional.ofNullable(reference);
            return this;
        }

        public Builder reference(Optional<String> reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }


        public Builder rootMessageId(String rootMessageId) {
            Utils.checkNotNull(rootMessageId, "rootMessageId");
            this.rootMessageId = Optional.ofNullable(rootMessageId);
            return this;
        }

        public Builder rootMessageId(Optional<String> rootMessageId) {
            Utils.checkNotNull(rootMessageId, "rootMessageId");
            this.rootMessageId = rootMessageId;
            return this;
        }


        public Builder subject(String subject) {
            Utils.checkNotNull(subject, "subject");
            this.subject = Optional.ofNullable(subject);
            return this;
        }

        public Builder subject(Optional<String> subject) {
            Utils.checkNotNull(subject, "subject");
            this.subject = subject;
            return this;
        }


        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        public Builder updatedAt(Optional<OffsetDateTime> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }


        public Builder webUrl(String webUrl) {
            Utils.checkNotNull(webUrl, "webUrl");
            this.webUrl = Optional.ofNullable(webUrl);
            return this;
        }

        public Builder webUrl(Optional<String> webUrl) {
            Utils.checkNotNull(webUrl, "webUrl");
            this.webUrl = webUrl;
            return this;
        }

        public MessagingMessage build() {

            return new MessagingMessage(
                attachments, authorMember, channelId,
                channelIds, createdAt, destinationMembers,
                hasChildren, hiddenMembers, id,
                mentionedMembers, message, messageHtml,
                messageMarkdown, parentMessageId, raw,
                reactions, reference, rootMessageId,
                subject, updatedAt, webUrl);
        }

    }
}
