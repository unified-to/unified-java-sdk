/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AtsJobQuestion {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public AtsJobQuestion withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public AtsJobQuestion withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public String[] options;

    public AtsJobQuestion withOptions(String[] options) {
        this.options = options;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prompt")
    public String prompt;

    public AtsJobQuestion withPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    
    @JsonProperty("question")
    public String question;

    public AtsJobQuestion withQuestion(String question) {
        this.question = question;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    public Boolean required;

    public AtsJobQuestion withRequired(Boolean required) {
        this.required = required;
        return this;
    }
    
    @JsonProperty("type")
    public AtsJobQuestionType type;

    public AtsJobQuestion withType(AtsJobQuestionType type) {
        this.type = type;
        return this;
    }
    
    public AtsJobQuestion(@JsonProperty("question") String question, @JsonProperty("type") AtsJobQuestionType type) {
        this.question = question;
        this.type = type;
  }
}
