/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class ListEnrichPeopleRequest {
    /**
     * The name of the company the person is associated with.  Not valid by itself.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=company_name")
    public String companyName;

    public ListEnrichPeopleRequest withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public ListEnrichPeopleRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * The email of the person to search
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=email")
    public String email;

    public ListEnrichPeopleRequest withEmail(String email) {
        this.email = email;
        return this;
    }
    
    /**
     * The LinkedIn URL of the person to search
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=linkedin_url")
    public String linkedinUrl;

    public ListEnrichPeopleRequest withLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
        return this;
    }
    
    /**
     * The name of the person to search
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=name")
    public String name;

    public ListEnrichPeopleRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The twitter handle of the person to search
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=twitter")
    public String twitter;

    public ListEnrichPeopleRequest withTwitter(String twitter) {
        this.twitter = twitter;
        return this;
    }
    
    public ListEnrichPeopleRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
