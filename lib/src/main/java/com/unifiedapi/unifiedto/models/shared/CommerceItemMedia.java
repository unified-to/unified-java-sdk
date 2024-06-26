/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CommerceItemMedia {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("alt")
    public String alt;

    public CommerceItemMedia withAlt(String alt) {
        this.alt = alt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("height")
    public Double height;

    public CommerceItemMedia withHeight(Double height) {
        this.height = height;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public CommerceItemMedia withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("position")
    public Double position;

    public CommerceItemMedia withPosition(Double position) {
        this.position = position;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public CommerceItemMediaType type;

    public CommerceItemMedia withType(CommerceItemMediaType type) {
        this.type = type;
        return this;
    }
    
    @JsonProperty("url")
    public String url;

    public CommerceItemMedia withUrl(String url) {
        this.url = url;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("width")
    public Double width;

    public CommerceItemMedia withWidth(Double width) {
        this.width = width;
        return this;
    }
    
    public CommerceItemMedia(@JsonProperty("url") String url) {
        this.url = url;
  }
}
