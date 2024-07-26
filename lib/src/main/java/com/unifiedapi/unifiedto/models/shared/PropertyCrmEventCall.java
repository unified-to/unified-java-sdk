/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.unifiedapi.unifiedto.utils.DateTimeDeserializer;
import com.unifiedapi.unifiedto.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

/**
 * PropertyCrmEventCall - The call object, when type = call
 */

public class PropertyCrmEventCall {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public PropertyCrmEventCall withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public Double duration;

    public PropertyCrmEventCall withDuration(Double duration) {
        this.duration = duration;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_at")
    public OffsetDateTime startAt;

    public PropertyCrmEventCall withStartAt(OffsetDateTime startAt) {
        this.startAt = startAt;
        return this;
    }
    
    public PropertyCrmEventCall(){}
}
