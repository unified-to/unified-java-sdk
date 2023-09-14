/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PropertyCrmEventEmail - The email object, when type = email
 */

public class PropertyCrmEventEmail {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("body")
    public String body;

    public PropertyCrmEventEmail withBody(String body) {
        this.body = body;
        return this;
    }
    
    /**
     * The event email's cc name &amp; email (name &lt;test@test.com&gt;)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cc")
    public String[] cc;

    public PropertyCrmEventEmail withCc(String[] cc) {
        this.cc = cc;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from")
    public String from;

    public PropertyCrmEventEmail withFrom(String from) {
        this.from = from;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subject")
    public String subject;

    public PropertyCrmEventEmail withSubject(String subject) {
        this.subject = subject;
        return this;
    }
    
    /**
     * The event email's to name &amp; email (name &lt;test@test.com&gt;)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("to")
    public String[] to;

    public PropertyCrmEventEmail withTo(String[] to) {
        this.to = to;
        return this;
    }
    
    public PropertyCrmEventEmail(){}
}