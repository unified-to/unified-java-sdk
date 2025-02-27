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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class LmsClass {

    @JsonProperty("course_id")
    private String courseId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("instructor_ids")
    private Optional<? extends List<String>> instructorIds;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("languages")
    private Optional<? extends List<String>> languages;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("media")
    private Optional<? extends List<LmsMedia>> media;

    @JsonProperty("name")
    private String name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("student_ids")
    private Optional<? extends List<String>> studentIds;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonCreator
    public LmsClass(
            @JsonProperty("course_id") String courseId,
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("instructor_ids") Optional<? extends List<String>> instructorIds,
            @JsonProperty("languages") Optional<? extends List<String>> languages,
            @JsonProperty("media") Optional<? extends List<LmsMedia>> media,
            @JsonProperty("name") String name,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("student_ids") Optional<? extends List<String>> studentIds,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(courseId, "courseId");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(instructorIds, "instructorIds");
        Utils.checkNotNull(languages, "languages");
        Utils.checkNotNull(media, "media");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(studentIds, "studentIds");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.courseId = courseId;
        this.createdAt = createdAt;
        this.description = description;
        this.id = id;
        this.instructorIds = instructorIds;
        this.languages = languages;
        this.media = media;
        this.name = name;
        this.raw = raw;
        this.studentIds = studentIds;
        this.updatedAt = updatedAt;
    }
    
    public LmsClass(
            String courseId,
            String name) {
        this(courseId, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), name, Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String courseId() {
        return courseId;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> instructorIds() {
        return (Optional<List<String>>) instructorIds;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> languages() {
        return (Optional<List<String>>) languages;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<LmsMedia>> media() {
        return (Optional<List<LmsMedia>>) media;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> studentIds() {
        return (Optional<List<String>>) studentIds;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public LmsClass withCourseId(String courseId) {
        Utils.checkNotNull(courseId, "courseId");
        this.courseId = courseId;
        return this;
    }

    public LmsClass withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public LmsClass withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public LmsClass withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public LmsClass withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public LmsClass withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public LmsClass withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public LmsClass withInstructorIds(List<String> instructorIds) {
        Utils.checkNotNull(instructorIds, "instructorIds");
        this.instructorIds = Optional.ofNullable(instructorIds);
        return this;
    }

    public LmsClass withInstructorIds(Optional<? extends List<String>> instructorIds) {
        Utils.checkNotNull(instructorIds, "instructorIds");
        this.instructorIds = instructorIds;
        return this;
    }

    public LmsClass withLanguages(List<String> languages) {
        Utils.checkNotNull(languages, "languages");
        this.languages = Optional.ofNullable(languages);
        return this;
    }

    public LmsClass withLanguages(Optional<? extends List<String>> languages) {
        Utils.checkNotNull(languages, "languages");
        this.languages = languages;
        return this;
    }

    public LmsClass withMedia(List<LmsMedia> media) {
        Utils.checkNotNull(media, "media");
        this.media = Optional.ofNullable(media);
        return this;
    }

    public LmsClass withMedia(Optional<? extends List<LmsMedia>> media) {
        Utils.checkNotNull(media, "media");
        this.media = media;
        return this;
    }

    public LmsClass withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public LmsClass withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public LmsClass withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public LmsClass withStudentIds(List<String> studentIds) {
        Utils.checkNotNull(studentIds, "studentIds");
        this.studentIds = Optional.ofNullable(studentIds);
        return this;
    }

    public LmsClass withStudentIds(Optional<? extends List<String>> studentIds) {
        Utils.checkNotNull(studentIds, "studentIds");
        this.studentIds = studentIds;
        return this;
    }

    public LmsClass withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public LmsClass withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        LmsClass other = (LmsClass) o;
        return 
            Objects.deepEquals(this.courseId, other.courseId) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.instructorIds, other.instructorIds) &&
            Objects.deepEquals(this.languages, other.languages) &&
            Objects.deepEquals(this.media, other.media) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.studentIds, other.studentIds) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            courseId,
            createdAt,
            description,
            id,
            instructorIds,
            languages,
            media,
            name,
            raw,
            studentIds,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LmsClass.class,
                "courseId", courseId,
                "createdAt", createdAt,
                "description", description,
                "id", id,
                "instructorIds", instructorIds,
                "languages", languages,
                "media", media,
                "name", name,
                "raw", raw,
                "studentIds", studentIds,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private String courseId;
 
        private Optional<OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends List<String>> instructorIds = Optional.empty();
 
        private Optional<? extends List<String>> languages = Optional.empty();
 
        private Optional<? extends List<LmsMedia>> media = Optional.empty();
 
        private String name;
 
        private Optional<? extends Map<String, Object>> raw = Optional.empty();
 
        private Optional<? extends List<String>> studentIds = Optional.empty();
 
        private Optional<OffsetDateTime> updatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder courseId(String courseId) {
            Utils.checkNotNull(courseId, "courseId");
            this.courseId = courseId;
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

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
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

        public Builder instructorIds(List<String> instructorIds) {
            Utils.checkNotNull(instructorIds, "instructorIds");
            this.instructorIds = Optional.ofNullable(instructorIds);
            return this;
        }

        public Builder instructorIds(Optional<? extends List<String>> instructorIds) {
            Utils.checkNotNull(instructorIds, "instructorIds");
            this.instructorIds = instructorIds;
            return this;
        }

        public Builder languages(List<String> languages) {
            Utils.checkNotNull(languages, "languages");
            this.languages = Optional.ofNullable(languages);
            return this;
        }

        public Builder languages(Optional<? extends List<String>> languages) {
            Utils.checkNotNull(languages, "languages");
            this.languages = languages;
            return this;
        }

        public Builder media(List<LmsMedia> media) {
            Utils.checkNotNull(media, "media");
            this.media = Optional.ofNullable(media);
            return this;
        }

        public Builder media(Optional<? extends List<LmsMedia>> media) {
            Utils.checkNotNull(media, "media");
            this.media = media;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
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

        public Builder studentIds(List<String> studentIds) {
            Utils.checkNotNull(studentIds, "studentIds");
            this.studentIds = Optional.ofNullable(studentIds);
            return this;
        }

        public Builder studentIds(Optional<? extends List<String>> studentIds) {
            Utils.checkNotNull(studentIds, "studentIds");
            this.studentIds = studentIds;
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
        
        public LmsClass build() {
            return new LmsClass(
                courseId,
                createdAt,
                description,
                id,
                instructorIds,
                languages,
                media,
                name,
                raw,
                studentIds,
                updatedAt);
        }
    }
}

