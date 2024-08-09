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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class AtsJobQuestion {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    private Optional<? extends List<String>> options;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prompt")
    private Optional<String> prompt;

    @JsonProperty("question")
    private String question;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    private Optional<Boolean> required;

    @JsonProperty("type")
    private AtsJobQuestionType type;

    @JsonCreator
    public AtsJobQuestion(
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("options") Optional<? extends List<String>> options,
            @JsonProperty("prompt") Optional<String> prompt,
            @JsonProperty("question") String question,
            @JsonProperty("required") Optional<Boolean> required,
            @JsonProperty("type") AtsJobQuestionType type) {
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(options, "options");
        Utils.checkNotNull(prompt, "prompt");
        Utils.checkNotNull(question, "question");
        Utils.checkNotNull(required, "required");
        Utils.checkNotNull(type, "type");
        this.description = description;
        this.id = id;
        this.options = options;
        this.prompt = prompt;
        this.question = question;
        this.required = required;
        this.type = type;
    }
    
    public AtsJobQuestion(
            String question,
            AtsJobQuestionType type) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), question, Optional.empty(), type);
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
    public Optional<List<String>> options() {
        return (Optional<List<String>>) options;
    }

    @JsonIgnore
    public Optional<String> prompt() {
        return prompt;
    }

    @JsonIgnore
    public String question() {
        return question;
    }

    @JsonIgnore
    public Optional<Boolean> required() {
        return required;
    }

    @JsonIgnore
    public AtsJobQuestionType type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AtsJobQuestion withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public AtsJobQuestion withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public AtsJobQuestion withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public AtsJobQuestion withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AtsJobQuestion withOptions(List<String> options) {
        Utils.checkNotNull(options, "options");
        this.options = Optional.ofNullable(options);
        return this;
    }

    public AtsJobQuestion withOptions(Optional<? extends List<String>> options) {
        Utils.checkNotNull(options, "options");
        this.options = options;
        return this;
    }

    public AtsJobQuestion withPrompt(String prompt) {
        Utils.checkNotNull(prompt, "prompt");
        this.prompt = Optional.ofNullable(prompt);
        return this;
    }

    public AtsJobQuestion withPrompt(Optional<String> prompt) {
        Utils.checkNotNull(prompt, "prompt");
        this.prompt = prompt;
        return this;
    }

    public AtsJobQuestion withQuestion(String question) {
        Utils.checkNotNull(question, "question");
        this.question = question;
        return this;
    }

    public AtsJobQuestion withRequired(boolean required) {
        Utils.checkNotNull(required, "required");
        this.required = Optional.ofNullable(required);
        return this;
    }

    public AtsJobQuestion withRequired(Optional<Boolean> required) {
        Utils.checkNotNull(required, "required");
        this.required = required;
        return this;
    }

    public AtsJobQuestion withType(AtsJobQuestionType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        AtsJobQuestion other = (AtsJobQuestion) o;
        return 
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.options, other.options) &&
            Objects.deepEquals(this.prompt, other.prompt) &&
            Objects.deepEquals(this.question, other.question) &&
            Objects.deepEquals(this.required, other.required) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            description,
            id,
            options,
            prompt,
            question,
            required,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsJobQuestion.class,
                "description", description,
                "id", id,
                "options", options,
                "prompt", prompt,
                "question", question,
                "required", required,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> description = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends List<String>> options = Optional.empty();
 
        private Optional<String> prompt = Optional.empty();
 
        private String question;
 
        private Optional<Boolean> required = Optional.empty();
 
        private AtsJobQuestionType type;  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder prompt(String prompt) {
            Utils.checkNotNull(prompt, "prompt");
            this.prompt = Optional.ofNullable(prompt);
            return this;
        }

        public Builder prompt(Optional<String> prompt) {
            Utils.checkNotNull(prompt, "prompt");
            this.prompt = prompt;
            return this;
        }

        public Builder question(String question) {
            Utils.checkNotNull(question, "question");
            this.question = question;
            return this;
        }

        public Builder required(boolean required) {
            Utils.checkNotNull(required, "required");
            this.required = Optional.ofNullable(required);
            return this;
        }

        public Builder required(Optional<Boolean> required) {
            Utils.checkNotNull(required, "required");
            this.required = required;
            return this;
        }

        public Builder type(AtsJobQuestionType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public AtsJobQuestion build() {
            return new AtsJobQuestion(
                description,
                id,
                options,
                prompt,
                question,
                required,
                type);
        }
    }
}

