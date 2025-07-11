/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import to.unified.unified_java_sdk.utils.Utils;


public class MetadataMetadata {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<OffsetDateTime> createdAt;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("format")
    private Optional<? extends MetadataMetadataFormat> format;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;


    @JsonProperty("name")
    private String name;


    @JsonProperty("object_type")
    private String objectType;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("objects")
    private Optional<? extends Map<String, Object>> objects;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    private Optional<? extends List<String>> options;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("original_format")
    private Optional<String> originalFormat;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends Map<String, Object>> raw;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("slug")
    private Optional<String> slug;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<OffsetDateTime> updatedAt;

    @JsonCreator
    public MetadataMetadata(
            @JsonProperty("created_at") Optional<OffsetDateTime> createdAt,
            @JsonProperty("format") Optional<? extends MetadataMetadataFormat> format,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") String name,
            @JsonProperty("object_type") String objectType,
            @JsonProperty("objects") Optional<? extends Map<String, Object>> objects,
            @JsonProperty("options") Optional<? extends List<String>> options,
            @JsonProperty("original_format") Optional<String> originalFormat,
            @JsonProperty("raw") Optional<? extends Map<String, Object>> raw,
            @JsonProperty("slug") Optional<String> slug,
            @JsonProperty("updated_at") Optional<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(format, "format");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(objectType, "objectType");
        Utils.checkNotNull(objects, "objects");
        Utils.checkNotNull(options, "options");
        Utils.checkNotNull(originalFormat, "originalFormat");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(slug, "slug");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.createdAt = createdAt;
        this.format = format;
        this.id = id;
        this.name = name;
        this.objectType = objectType;
        this.objects = objects;
        this.options = options;
        this.originalFormat = originalFormat;
        this.raw = raw;
        this.slug = slug;
        this.updatedAt = updatedAt;
    }
    
    public MetadataMetadata(
            String name,
            String objectType) {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            name, objectType, Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<OffsetDateTime> createdAt() {
        return createdAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MetadataMetadataFormat> format() {
        return (Optional<MetadataMetadataFormat>) format;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public String objectType() {
        return objectType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> objects() {
        return (Optional<Map<String, Object>>) objects;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> options() {
        return (Optional<List<String>>) options;
    }

    @JsonIgnore
    public Optional<String> originalFormat() {
        return originalFormat;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> raw() {
        return (Optional<Map<String, Object>>) raw;
    }

    @JsonIgnore
    public Optional<String> slug() {
        return slug;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }


    public MetadataMetadata withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }


    public MetadataMetadata withCreatedAt(Optional<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public MetadataMetadata withFormat(MetadataMetadataFormat format) {
        Utils.checkNotNull(format, "format");
        this.format = Optional.ofNullable(format);
        return this;
    }


    public MetadataMetadata withFormat(Optional<? extends MetadataMetadataFormat> format) {
        Utils.checkNotNull(format, "format");
        this.format = format;
        return this;
    }

    public MetadataMetadata withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    public MetadataMetadata withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public MetadataMetadata withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public MetadataMetadata withObjectType(String objectType) {
        Utils.checkNotNull(objectType, "objectType");
        this.objectType = objectType;
        return this;
    }

    public MetadataMetadata withObjects(Map<String, Object> objects) {
        Utils.checkNotNull(objects, "objects");
        this.objects = Optional.ofNullable(objects);
        return this;
    }


    public MetadataMetadata withObjects(Optional<? extends Map<String, Object>> objects) {
        Utils.checkNotNull(objects, "objects");
        this.objects = objects;
        return this;
    }

    public MetadataMetadata withOptions(List<String> options) {
        Utils.checkNotNull(options, "options");
        this.options = Optional.ofNullable(options);
        return this;
    }


    public MetadataMetadata withOptions(Optional<? extends List<String>> options) {
        Utils.checkNotNull(options, "options");
        this.options = options;
        return this;
    }

    public MetadataMetadata withOriginalFormat(String originalFormat) {
        Utils.checkNotNull(originalFormat, "originalFormat");
        this.originalFormat = Optional.ofNullable(originalFormat);
        return this;
    }


    public MetadataMetadata withOriginalFormat(Optional<String> originalFormat) {
        Utils.checkNotNull(originalFormat, "originalFormat");
        this.originalFormat = originalFormat;
        return this;
    }

    public MetadataMetadata withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }


    public MetadataMetadata withRaw(Optional<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public MetadataMetadata withSlug(String slug) {
        Utils.checkNotNull(slug, "slug");
        this.slug = Optional.ofNullable(slug);
        return this;
    }


    public MetadataMetadata withSlug(Optional<String> slug) {
        Utils.checkNotNull(slug, "slug");
        this.slug = slug;
        return this;
    }

    public MetadataMetadata withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }


    public MetadataMetadata withUpdatedAt(Optional<OffsetDateTime> updatedAt) {
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
        MetadataMetadata other = (MetadataMetadata) o;
        return 
            Utils.enhancedDeepEquals(this.createdAt, other.createdAt) &&
            Utils.enhancedDeepEquals(this.format, other.format) &&
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.objectType, other.objectType) &&
            Utils.enhancedDeepEquals(this.objects, other.objects) &&
            Utils.enhancedDeepEquals(this.options, other.options) &&
            Utils.enhancedDeepEquals(this.originalFormat, other.originalFormat) &&
            Utils.enhancedDeepEquals(this.raw, other.raw) &&
            Utils.enhancedDeepEquals(this.slug, other.slug) &&
            Utils.enhancedDeepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            createdAt, format, id,
            name, objectType, objects,
            options, originalFormat, raw,
            slug, updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MetadataMetadata.class,
                "createdAt", createdAt,
                "format", format,
                "id", id,
                "name", name,
                "objectType", objectType,
                "objects", objects,
                "options", options,
                "originalFormat", originalFormat,
                "raw", raw,
                "slug", slug,
                "updatedAt", updatedAt);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<? extends MetadataMetadataFormat> format = Optional.empty();

        private Optional<String> id = Optional.empty();

        private String name;

        private String objectType;

        private Optional<? extends Map<String, Object>> objects = Optional.empty();

        private Optional<? extends List<String>> options = Optional.empty();

        private Optional<String> originalFormat = Optional.empty();

        private Optional<? extends Map<String, Object>> raw = Optional.empty();

        private Optional<String> slug = Optional.empty();

        private Optional<OffsetDateTime> updatedAt = Optional.empty();

        private Builder() {
          // force use of static builder() method
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


        public Builder format(MetadataMetadataFormat format) {
            Utils.checkNotNull(format, "format");
            this.format = Optional.ofNullable(format);
            return this;
        }

        public Builder format(Optional<? extends MetadataMetadataFormat> format) {
            Utils.checkNotNull(format, "format");
            this.format = format;
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


        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }


        public Builder objectType(String objectType) {
            Utils.checkNotNull(objectType, "objectType");
            this.objectType = objectType;
            return this;
        }


        public Builder objects(Map<String, Object> objects) {
            Utils.checkNotNull(objects, "objects");
            this.objects = Optional.ofNullable(objects);
            return this;
        }

        public Builder objects(Optional<? extends Map<String, Object>> objects) {
            Utils.checkNotNull(objects, "objects");
            this.objects = objects;
            return this;
        }


        public Builder options(List<String> options) {
            Utils.checkNotNull(options, "options");
            this.options = Optional.ofNullable(options);
            return this;
        }

        public Builder options(Optional<? extends List<String>> options) {
            Utils.checkNotNull(options, "options");
            this.options = options;
            return this;
        }


        public Builder originalFormat(String originalFormat) {
            Utils.checkNotNull(originalFormat, "originalFormat");
            this.originalFormat = Optional.ofNullable(originalFormat);
            return this;
        }

        public Builder originalFormat(Optional<String> originalFormat) {
            Utils.checkNotNull(originalFormat, "originalFormat");
            this.originalFormat = originalFormat;
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


        public Builder slug(String slug) {
            Utils.checkNotNull(slug, "slug");
            this.slug = Optional.ofNullable(slug);
            return this;
        }

        public Builder slug(Optional<String> slug) {
            Utils.checkNotNull(slug, "slug");
            this.slug = slug;
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

        public MetadataMetadata build() {

            return new MetadataMetadata(
                createdAt, format, id,
                name, objectType, objects,
                options, originalFormat, raw,
                slug, updatedAt);
        }

    }
}
