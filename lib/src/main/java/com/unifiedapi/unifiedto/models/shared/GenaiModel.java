/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GenaiModel {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public GenaiModel withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has_temperature")
    public Boolean hasTemperature;

    public GenaiModel withHasTemperature(Boolean hasTemperature) {
        this.hasTemperature = hasTemperature;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public GenaiModel withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_tokens")
    public Double maxTokens;

    public GenaiModel withMaxTokens(Double maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public GenaiModel withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public java.util.Map<String, java.lang.Object> raw;

    public GenaiModel withRaw(java.util.Map<String, java.lang.Object> raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("web_url")
    public String webUrl;

    public GenaiModel withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    
    public GenaiModel(){}
}
