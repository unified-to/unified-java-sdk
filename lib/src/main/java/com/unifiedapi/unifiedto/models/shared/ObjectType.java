/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ObjectType {
    ACCOUNTING_ACCOUNT("accounting_account"),
    ACCOUNTING_TRANSACTION("accounting_transaction"),
    ACCOUNTING_CONTACT("accounting_contact"),
    ACCOUNTING_INVOICE("accounting_invoice"),
    ACCOUNTING_TAXRATE("accounting_taxrate"),
    ACCOUNTING_ORGANIZATION("accounting_organization"),
    PAYMENT_PAYMENT("payment_payment"),
    PAYMENT_LINK("payment_link"),
    PAYMENT_PAYOUT("payment_payout"),
    PAYMENT_REFUND("payment_refund"),
    COMMERCE_ITEM("commerce_item"),
    COMMERCE_COLLECTION("commerce_collection"),
    COMMERCE_INVENTORY("commerce_inventory"),
    COMMERCE_LOCATION("commerce_location"),
    ATS_ACTIVITY("ats_activity"),
    ATS_APPLICATION("ats_application"),
    ATS_APPLICATIONSTATUS("ats_applicationstatus"),
    ATS_CANDIDATE("ats_candidate"),
    ATS_DOCUMENT("ats_document"),
    ATS_INTERVIEW("ats_interview"),
    ATS_JOB("ats_job"),
    ATS_SCORECARD("ats_scorecard"),
    ATS_COMPANY("ats_company"),
    CRM_COMPANY("crm_company"),
    CRM_CONTACT("crm_contact"),
    CRM_DEAL("crm_deal"),
    CRM_EVENT("crm_event"),
    CRM_LEAD("crm_lead"),
    CRM_PIPELINE("crm_pipeline"),
    HRIS_EMPLOYEE("hris_employee"),
    HRIS_GROUP("hris_group"),
    HRIS_PAYSLIP("hris_payslip"),
    HRIS_TIMEOFF("hris_timeoff"),
    MARTECH_LIST("martech_list"),
    MARTECH_MEMBER("martech_member"),
    PASSTHROUGH("passthrough"),
    TICKETING_NOTE("ticketing_note"),
    TICKETING_TICKET("ticketing_ticket"),
    TICKETING_CUSTOMER("ticketing_customer"),
    UC_CONTACT("uc_contact"),
    UC_CALL("uc_call"),
    ENRICH_PERSON("enrich_person"),
    ENRICH_COMPANY("enrich_company"),
    STORAGE_FILE("storage_file"),
    GENAI_MODEL("genai_model"),
    GENAI_PROMPT("genai_prompt"),
    MESSAGING_MESSAGE("messaging_message"),
    MESSAGING_CHANNEL("messaging_channel"),
    KMS_SPACE("kms_space"),
    KMS_PAGE("kms_page");

    @JsonValue
    public final String value;

    private ObjectType(String value) {
        this.value = value;
    }
}
