/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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


public class HrisEmployee {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    public PropertyHrisEmployeeAddress address;

    public HrisEmployee withAddress(PropertyHrisEmployeeAddress address) {
        this.address = address;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public HrisEmployee withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    public String currency;

    public HrisEmployee withCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("date_of_birth")
    public OffsetDateTime dateOfBirth;

    public HrisEmployee withDateOfBirth(OffsetDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("department")
    public String department;

    public HrisEmployee withDepartment(String department) {
        this.department = department;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("division")
    public String division;

    public HrisEmployee withDivision(String division) {
        this.division = division;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emails")
    public HrisEmail[] emails;

    public HrisEmployee withEmails(HrisEmail[] emails) {
        this.emails = emails;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_number")
    public String employeeNumber;

    public HrisEmployee withEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employment_status")
    public HrisEmployeeEmploymentStatus employmentStatus;

    public HrisEmployee withEmploymentStatus(HrisEmployeeEmploymentStatus employmentStatus) {
        this.employmentStatus = employmentStatus;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employment_type")
    public HrisEmployeeEmploymentType employmentType;

    public HrisEmployee withEmploymentType(HrisEmployeeEmploymentType employmentType) {
        this.employmentType = employmentType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("gender")
    public HrisEmployeeGender gender;

    public HrisEmployee withGender(HrisEmployeeGender gender) {
        this.gender = gender;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("hired_at")
    public OffsetDateTime hiredAt;

    public HrisEmployee withHiredAt(OffsetDateTime hiredAt) {
        this.hiredAt = hiredAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public HrisEmployee withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image_url")
    public String imageUrl;

    public HrisEmployee withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("language_locale")
    public String languageLocale;

    public HrisEmployee withLanguageLocale(String languageLocale) {
        this.languageLocale = languageLocale;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location")
    public String location;

    public HrisEmployee withLocation(String location) {
        this.location = location;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("manager_id")
    public String managerId;

    public HrisEmployee withManagerId(String managerId) {
        this.managerId = managerId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("marital_status")
    public HrisEmployeeMaritalStatus maritalStatus;

    public HrisEmployee withMaritalStatus(HrisEmployeeMaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public HrisEmployee withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    public PropertyHrisEmployeeRaw raw;

    public HrisEmployee withRaw(PropertyHrisEmployeeRaw raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("telephones")
    public HrisTelephone[] telephones;

    public HrisEmployee withTelephones(HrisTelephone[] telephones) {
        this.telephones = telephones;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("terminated_at")
    public OffsetDateTime terminatedAt;

    public HrisEmployee withTerminatedAt(OffsetDateTime terminatedAt) {
        this.terminatedAt = terminatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timezone")
    public String timezone;

    public HrisEmployee withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public HrisEmployee withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public HrisEmployee withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public HrisEmployee(){}
}
