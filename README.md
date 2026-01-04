<div align="left">
    <a href="https://speakeasyapi.dev/"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://github.com/unified-to/unified-java-sdk/actions"><img src="https://img.shields.io/github/actions/workflow/status/unified-to/unified-java-sdk/sdk_generation.yaml?style=for-the-badge" /></a>
    
</div>

<!-- Start Summary [summary] -->
## Summary

Unified.to  API: One API to Rule Them All

For more information about the API: [API Documentation](https://docs.unified.to)
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Server Selection](#server-selection)
  * [Error Handling](#error-handling)
  * [Asynchronous Support](#asynchronous-support)
  * [Authentication](#authentication)
  * [Custom HTTP Client](#custom-http-client)
  * [Debugging](#debugging)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'to.unified:unified-java-sdk:0.47.3'
```

Maven:
```xml
<dependency>
    <groupId>to.unified</groupId>
    <artifactId>unified-java-sdk</artifactId>
    <version>0.47.3</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccountRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccountResponse;
import to.unified.unified_java_sdk.models.shared.AccountingAccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingAccountRequest req = CreateAccountingAccountRequest.builder()
                .accountingAccount(AccountingAccount.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingAccountResponse res = sdk.accounting().createAccountingAccount()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            // handle response
        }
    }
}
```
#### Asynchronous Call
An asynchronous SDK client is also available that returns a [`CompletableFuture<T>`][comp-fut]. See [Asynchronous Support](#asynchronous-support) for more details on async benefits and reactive library integration.
```java
package hello.world;

import java.util.concurrent.CompletableFuture;
import to.unified.unified_java_sdk.AsyncUnifiedTo;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccountRequest;
import to.unified.unified_java_sdk.models.operations.async.CreateAccountingAccountResponse;
import to.unified.unified_java_sdk.models.shared.AccountingAccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) {

        AsyncUnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build()
            .async();

        CreateAccountingAccountRequest req = CreateAccountingAccountRequest.builder()
                .accountingAccount(AccountingAccount.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CompletableFuture<CreateAccountingAccountResponse> resFut = sdk.accounting().createAccountingAccount()
                .request(req)
                .call();

        resFut.thenAccept(res -> {
            if (res.accountingAccount().isPresent()) {
            // handle response
            }
        });
    }
}
```

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [Account](docs/sdks/account/README.md)

* [createAccountingAccount](docs/sdks/account/README.md#createaccountingaccount) - Create an account
* [getAccountingAccount](docs/sdks/account/README.md#getaccountingaccount) - Retrieve an account
* [listAccountingAccounts](docs/sdks/account/README.md#listaccountingaccounts) - List all accounts
* [patchAccountingAccount](docs/sdks/account/README.md#patchaccountingaccount) - Update an account
* [removeAccountingAccount](docs/sdks/account/README.md#removeaccountingaccount) - Remove an account
* [updateAccountingAccount](docs/sdks/account/README.md#updateaccountingaccount) - Update an account

### [Accounting](docs/sdks/accounting/README.md)

* [createAccountingAccount](docs/sdks/accounting/README.md#createaccountingaccount) - Create an account
* [createAccountingBill](docs/sdks/accounting/README.md#createaccountingbill) - Create a bill
* [createAccountingCategory](docs/sdks/accounting/README.md#createaccountingcategory) - Create a category
* [createAccountingContact](docs/sdks/accounting/README.md#createaccountingcontact) - Create a contact
* [createAccountingCreditmemo](docs/sdks/accounting/README.md#createaccountingcreditmemo) - Create a creditmemo
* [createAccountingExpense](docs/sdks/accounting/README.md#createaccountingexpense) - Create an expense
* [createAccountingInvoice](docs/sdks/accounting/README.md#createaccountinginvoice) - Create an invoice
* [createAccountingJournal](docs/sdks/accounting/README.md#createaccountingjournal) - Create a journal
* [createAccountingOrder](docs/sdks/accounting/README.md#createaccountingorder) - Create an order
* [createAccountingPurchaseorder](docs/sdks/accounting/README.md#createaccountingpurchaseorder) - Create a purchaseorder
* [createAccountingSalesorder](docs/sdks/accounting/README.md#createaccountingsalesorder) - Create a salesorder
* [createAccountingTaxrate](docs/sdks/accounting/README.md#createaccountingtaxrate) - Create a taxrate
* [createAccountingTransaction](docs/sdks/accounting/README.md#createaccountingtransaction) - Create a transaction
* [getAccountingAccount](docs/sdks/accounting/README.md#getaccountingaccount) - Retrieve an account
* [getAccountingBalancesheet](docs/sdks/accounting/README.md#getaccountingbalancesheet) - Retrieve a balancesheet
* [getAccountingBill](docs/sdks/accounting/README.md#getaccountingbill) - Retrieve a bill
* [getAccountingCashflow](docs/sdks/accounting/README.md#getaccountingcashflow) - Retrieve a cashflow
* [getAccountingCategory](docs/sdks/accounting/README.md#getaccountingcategory) - Retrieve a category
* [getAccountingContact](docs/sdks/accounting/README.md#getaccountingcontact) - Retrieve a contact
* [getAccountingCreditmemo](docs/sdks/accounting/README.md#getaccountingcreditmemo) - Retrieve a creditmemo
* [getAccountingExpense](docs/sdks/accounting/README.md#getaccountingexpense) - Retrieve an expense
* [getAccountingInvoice](docs/sdks/accounting/README.md#getaccountinginvoice) - Retrieve an invoice
* [getAccountingJournal](docs/sdks/accounting/README.md#getaccountingjournal) - Retrieve a journal
* [getAccountingOrder](docs/sdks/accounting/README.md#getaccountingorder) - Retrieve an order
* [getAccountingOrganization](docs/sdks/accounting/README.md#getaccountingorganization) - Retrieve an organization
* [getAccountingProfitloss](docs/sdks/accounting/README.md#getaccountingprofitloss) - Retrieve a profitloss
* [getAccountingPurchaseorder](docs/sdks/accounting/README.md#getaccountingpurchaseorder) - Retrieve a purchaseorder
* [getAccountingReport](docs/sdks/accounting/README.md#getaccountingreport) - Retrieve a report
* [getAccountingSalesorder](docs/sdks/accounting/README.md#getaccountingsalesorder) - Retrieve a salesorder
* [getAccountingTaxrate](docs/sdks/accounting/README.md#getaccountingtaxrate) - Retrieve a taxrate
* [getAccountingTransaction](docs/sdks/accounting/README.md#getaccountingtransaction) - Retrieve a transaction
* [getAccountingTrialbalance](docs/sdks/accounting/README.md#getaccountingtrialbalance) - Retrieve a trialbalance
* [listAccountingAccounts](docs/sdks/accounting/README.md#listaccountingaccounts) - List all accounts
* [listAccountingBalancesheets](docs/sdks/accounting/README.md#listaccountingbalancesheets) - List all balancesheets
* [listAccountingBills](docs/sdks/accounting/README.md#listaccountingbills) - List all bills
* [listAccountingCashflows](docs/sdks/accounting/README.md#listaccountingcashflows) - List all cashflows
* [listAccountingCategories](docs/sdks/accounting/README.md#listaccountingcategories) - List all categories
* [listAccountingContacts](docs/sdks/accounting/README.md#listaccountingcontacts) - List all contacts
* [listAccountingCreditmemoes](docs/sdks/accounting/README.md#listaccountingcreditmemoes) - List all creditmemoes
* [listAccountingExpenses](docs/sdks/accounting/README.md#listaccountingexpenses) - List all expenses
* [listAccountingInvoices](docs/sdks/accounting/README.md#listaccountinginvoices) - List all invoices
* [listAccountingJournals](docs/sdks/accounting/README.md#listaccountingjournals) - List all journals
* [listAccountingOrders](docs/sdks/accounting/README.md#listaccountingorders) - List all orders
* [listAccountingOrganizations](docs/sdks/accounting/README.md#listaccountingorganizations) - List all organizations
* [listAccountingProfitlosses](docs/sdks/accounting/README.md#listaccountingprofitlosses) - List all profitlosses
* [listAccountingPurchaseorders](docs/sdks/accounting/README.md#listaccountingpurchaseorders) - List all purchaseorders
* [listAccountingReports](docs/sdks/accounting/README.md#listaccountingreports) - List all reports
* [listAccountingSalesorders](docs/sdks/accounting/README.md#listaccountingsalesorders) - List all salesorders
* [listAccountingTaxrates](docs/sdks/accounting/README.md#listaccountingtaxrates) - List all taxrates
* [listAccountingTransactions](docs/sdks/accounting/README.md#listaccountingtransactions) - List all transactions
* [listAccountingTrialbalances](docs/sdks/accounting/README.md#listaccountingtrialbalances) - List all trialbalances
* [patchAccountingAccount](docs/sdks/accounting/README.md#patchaccountingaccount) - Update an account
* [patchAccountingBill](docs/sdks/accounting/README.md#patchaccountingbill) - Update a bill
* [patchAccountingCategory](docs/sdks/accounting/README.md#patchaccountingcategory) - Update a category
* [patchAccountingContact](docs/sdks/accounting/README.md#patchaccountingcontact) - Update a contact
* [patchAccountingCreditmemo](docs/sdks/accounting/README.md#patchaccountingcreditmemo) - Update a creditmemo
* [patchAccountingExpense](docs/sdks/accounting/README.md#patchaccountingexpense) - Update an expense
* [patchAccountingInvoice](docs/sdks/accounting/README.md#patchaccountinginvoice) - Update an invoice
* [patchAccountingJournal](docs/sdks/accounting/README.md#patchaccountingjournal) - Update a journal
* [patchAccountingOrder](docs/sdks/accounting/README.md#patchaccountingorder) - Update an order
* [patchAccountingPurchaseorder](docs/sdks/accounting/README.md#patchaccountingpurchaseorder) - Update a purchaseorder
* [patchAccountingSalesorder](docs/sdks/accounting/README.md#patchaccountingsalesorder) - Update a salesorder
* [patchAccountingTaxrate](docs/sdks/accounting/README.md#patchaccountingtaxrate) - Update a taxrate
* [patchAccountingTransaction](docs/sdks/accounting/README.md#patchaccountingtransaction) - Update a transaction
* [removeAccountingAccount](docs/sdks/accounting/README.md#removeaccountingaccount) - Remove an account
* [removeAccountingBill](docs/sdks/accounting/README.md#removeaccountingbill) - Remove a bill
* [removeAccountingCategory](docs/sdks/accounting/README.md#removeaccountingcategory) - Remove a category
* [removeAccountingContact](docs/sdks/accounting/README.md#removeaccountingcontact) - Remove a contact
* [removeAccountingCreditmemo](docs/sdks/accounting/README.md#removeaccountingcreditmemo) - Remove a creditmemo
* [removeAccountingExpense](docs/sdks/accounting/README.md#removeaccountingexpense) - Remove an expense
* [removeAccountingInvoice](docs/sdks/accounting/README.md#removeaccountinginvoice) - Remove an invoice
* [removeAccountingJournal](docs/sdks/accounting/README.md#removeaccountingjournal) - Remove a journal
* [removeAccountingOrder](docs/sdks/accounting/README.md#removeaccountingorder) - Remove an order
* [removeAccountingPurchaseorder](docs/sdks/accounting/README.md#removeaccountingpurchaseorder) - Remove a purchaseorder
* [removeAccountingSalesorder](docs/sdks/accounting/README.md#removeaccountingsalesorder) - Remove a salesorder
* [removeAccountingTaxrate](docs/sdks/accounting/README.md#removeaccountingtaxrate) - Remove a taxrate
* [removeAccountingTransaction](docs/sdks/accounting/README.md#removeaccountingtransaction) - Remove a transaction
* [updateAccountingAccount](docs/sdks/accounting/README.md#updateaccountingaccount) - Update an account
* [updateAccountingBill](docs/sdks/accounting/README.md#updateaccountingbill) - Update a bill
* [updateAccountingCategory](docs/sdks/accounting/README.md#updateaccountingcategory) - Update a category
* [updateAccountingContact](docs/sdks/accounting/README.md#updateaccountingcontact) - Update a contact
* [updateAccountingCreditmemo](docs/sdks/accounting/README.md#updateaccountingcreditmemo) - Update a creditmemo
* [updateAccountingExpense](docs/sdks/accounting/README.md#updateaccountingexpense) - Update an expense
* [updateAccountingInvoice](docs/sdks/accounting/README.md#updateaccountinginvoice) - Update an invoice
* [updateAccountingJournal](docs/sdks/accounting/README.md#updateaccountingjournal) - Update a journal
* [updateAccountingOrder](docs/sdks/accounting/README.md#updateaccountingorder) - Update an order
* [updateAccountingPurchaseorder](docs/sdks/accounting/README.md#updateaccountingpurchaseorder) - Update a purchaseorder
* [updateAccountingSalesorder](docs/sdks/accounting/README.md#updateaccountingsalesorder) - Update a salesorder
* [updateAccountingTaxrate](docs/sdks/accounting/README.md#updateaccountingtaxrate) - Update a taxrate
* [updateAccountingTransaction](docs/sdks/accounting/README.md#updateaccountingtransaction) - Update a transaction

### [Activity](docs/sdks/activity/README.md)

* [createAtsActivity](docs/sdks/activity/README.md#createatsactivity) - Create an activity
* [getAtsActivity](docs/sdks/activity/README.md#getatsactivity) - Retrieve an activity
* [listAtsActivities](docs/sdks/activity/README.md#listatsactivities) - List all activities
* [patchAtsActivity](docs/sdks/activity/README.md#patchatsactivity) - Update an activity
* [removeAtsActivity](docs/sdks/activity/README.md#removeatsactivity) - Remove an activity
* [updateAtsActivity](docs/sdks/activity/README.md#updateatsactivity) - Update an activity

### [Ad](docs/sdks/ad/README.md)

* [createAdsAd](docs/sdks/ad/README.md#createadsad) - Create an ad
* [getAdsAd](docs/sdks/ad/README.md#getadsad) - Retrieve an ad
* [listAdsAds](docs/sdks/ad/README.md#listadsads) - List all ads
* [patchAdsAd](docs/sdks/ad/README.md#patchadsad) - Update an ad
* [removeAdsAd](docs/sdks/ad/README.md#removeadsad) - Remove an ad
* [updateAdsAd](docs/sdks/ad/README.md#updateadsad) - Update an ad

### [Ads](docs/sdks/ads/README.md)

* [createAdsAd](docs/sdks/ads/README.md#createadsad) - Create an ad
* [createAdsCampaign](docs/sdks/ads/README.md#createadscampaign) - Create a campaign
* [createAdsGroup](docs/sdks/ads/README.md#createadsgroup) - Create a group
* [createAdsOrganization](docs/sdks/ads/README.md#createadsorganization) - Create an organization
* [getAdsAd](docs/sdks/ads/README.md#getadsad) - Retrieve an ad
* [getAdsCampaign](docs/sdks/ads/README.md#getadscampaign) - Retrieve a campaign
* [getAdsGroup](docs/sdks/ads/README.md#getadsgroup) - Retrieve a group
* [getAdsOrganization](docs/sdks/ads/README.md#getadsorganization) - Retrieve an organization
* [listAdsAds](docs/sdks/ads/README.md#listadsads) - List all ads
* [listAdsCampaigns](docs/sdks/ads/README.md#listadscampaigns) - List all campaigns
* [listAdsGroups](docs/sdks/ads/README.md#listadsgroups) - List all groups
* [listAdsOrganizations](docs/sdks/ads/README.md#listadsorganizations) - List all organizations
* [listAdsReports](docs/sdks/ads/README.md#listadsreports) - List all reports
* [patchAdsAd](docs/sdks/ads/README.md#patchadsad) - Update an ad
* [patchAdsCampaign](docs/sdks/ads/README.md#patchadscampaign) - Update a campaign
* [patchAdsGroup](docs/sdks/ads/README.md#patchadsgroup) - Update a group
* [patchAdsOrganization](docs/sdks/ads/README.md#patchadsorganization) - Update an organization
* [removeAdsAd](docs/sdks/ads/README.md#removeadsad) - Remove an ad
* [removeAdsCampaign](docs/sdks/ads/README.md#removeadscampaign) - Remove a campaign
* [removeAdsGroup](docs/sdks/ads/README.md#removeadsgroup) - Remove a group
* [removeAdsOrganization](docs/sdks/ads/README.md#removeadsorganization) - Remove an organization
* [updateAdsAd](docs/sdks/ads/README.md#updateadsad) - Update an ad
* [updateAdsCampaign](docs/sdks/ads/README.md#updateadscampaign) - Update a campaign
* [updateAdsGroup](docs/sdks/ads/README.md#updateadsgroup) - Update a group
* [updateAdsOrganization](docs/sdks/ads/README.md#updateadsorganization) - Update an organization

### [Apicall](docs/sdks/apicall/README.md)

* [getUnifiedApicall](docs/sdks/apicall/README.md#getunifiedapicall) - Retrieve specific API Call by its ID
* [listUnifiedApicalls](docs/sdks/apicall/README.md#listunifiedapicalls) - Returns API Calls

### [Application](docs/sdks/application/README.md)

* [createAtsApplication](docs/sdks/application/README.md#createatsapplication) - Create an application
* [getAtsApplication](docs/sdks/application/README.md#getatsapplication) - Retrieve an application
* [listAtsApplications](docs/sdks/application/README.md#listatsapplications) - List all applications
* [patchAtsApplication](docs/sdks/application/README.md#patchatsapplication) - Update an application
* [removeAtsApplication](docs/sdks/application/README.md#removeatsapplication) - Remove an application
* [updateAtsApplication](docs/sdks/application/README.md#updateatsapplication) - Update an application

### [Applicationstatus](docs/sdks/applicationstatus/README.md)

* [listAtsApplicationstatuses](docs/sdks/applicationstatus/README.md#listatsapplicationstatuses) - List all applicationstatuses

### [Ats](docs/sdks/ats/README.md)

* [createAtsActivity](docs/sdks/ats/README.md#createatsactivity) - Create an activity
* [createAtsApplication](docs/sdks/ats/README.md#createatsapplication) - Create an application
* [createAtsCandidate](docs/sdks/ats/README.md#createatscandidate) - Create a candidate
* [createAtsCompany](docs/sdks/ats/README.md#createatscompany) - Create a company
* [createAtsDocument](docs/sdks/ats/README.md#createatsdocument) - Create a document
* [createAtsInterview](docs/sdks/ats/README.md#createatsinterview) - Create an interview
* [createAtsJob](docs/sdks/ats/README.md#createatsjob) - Create a job
* [createAtsScorecard](docs/sdks/ats/README.md#createatsscorecard) - Create a scorecard
* [getAtsActivity](docs/sdks/ats/README.md#getatsactivity) - Retrieve an activity
* [getAtsApplication](docs/sdks/ats/README.md#getatsapplication) - Retrieve an application
* [getAtsCandidate](docs/sdks/ats/README.md#getatscandidate) - Retrieve a candidate
* [getAtsCompany](docs/sdks/ats/README.md#getatscompany) - Retrieve a company
* [getAtsDocument](docs/sdks/ats/README.md#getatsdocument) - Retrieve a document
* [getAtsInterview](docs/sdks/ats/README.md#getatsinterview) - Retrieve an interview
* [getAtsJob](docs/sdks/ats/README.md#getatsjob) - Retrieve a job
* [getAtsScorecard](docs/sdks/ats/README.md#getatsscorecard) - Retrieve a scorecard
* [listAtsActivities](docs/sdks/ats/README.md#listatsactivities) - List all activities
* [listAtsApplications](docs/sdks/ats/README.md#listatsapplications) - List all applications
* [listAtsApplicationstatuses](docs/sdks/ats/README.md#listatsapplicationstatuses) - List all applicationstatuses
* [listAtsCandidates](docs/sdks/ats/README.md#listatscandidates) - List all candidates
* [listAtsCompanies](docs/sdks/ats/README.md#listatscompanies) - List all companies
* [listAtsDocuments](docs/sdks/ats/README.md#listatsdocuments) - List all documents
* [listAtsInterviews](docs/sdks/ats/README.md#listatsinterviews) - List all interviews
* [listAtsJobs](docs/sdks/ats/README.md#listatsjobs) - List all jobs
* [listAtsScorecards](docs/sdks/ats/README.md#listatsscorecards) - List all scorecards
* [patchAtsActivity](docs/sdks/ats/README.md#patchatsactivity) - Update an activity
* [patchAtsApplication](docs/sdks/ats/README.md#patchatsapplication) - Update an application
* [patchAtsCandidate](docs/sdks/ats/README.md#patchatscandidate) - Update a candidate
* [patchAtsCompany](docs/sdks/ats/README.md#patchatscompany) - Update a company
* [patchAtsDocument](docs/sdks/ats/README.md#patchatsdocument) - Update a document
* [patchAtsInterview](docs/sdks/ats/README.md#patchatsinterview) - Update an interview
* [patchAtsJob](docs/sdks/ats/README.md#patchatsjob) - Update a job
* [patchAtsScorecard](docs/sdks/ats/README.md#patchatsscorecard) - Update a scorecard
* [removeAtsActivity](docs/sdks/ats/README.md#removeatsactivity) - Remove an activity
* [removeAtsApplication](docs/sdks/ats/README.md#removeatsapplication) - Remove an application
* [removeAtsCandidate](docs/sdks/ats/README.md#removeatscandidate) - Remove a candidate
* [removeAtsCompany](docs/sdks/ats/README.md#removeatscompany) - Remove a company
* [removeAtsDocument](docs/sdks/ats/README.md#removeatsdocument) - Remove a document
* [removeAtsInterview](docs/sdks/ats/README.md#removeatsinterview) - Remove an interview
* [removeAtsJob](docs/sdks/ats/README.md#removeatsjob) - Remove a job
* [removeAtsScorecard](docs/sdks/ats/README.md#removeatsscorecard) - Remove a scorecard
* [updateAtsActivity](docs/sdks/ats/README.md#updateatsactivity) - Update an activity
* [updateAtsApplication](docs/sdks/ats/README.md#updateatsapplication) - Update an application
* [updateAtsCandidate](docs/sdks/ats/README.md#updateatscandidate) - Update a candidate
* [updateAtsCompany](docs/sdks/ats/README.md#updateatscompany) - Update a company
* [updateAtsDocument](docs/sdks/ats/README.md#updateatsdocument) - Update a document
* [updateAtsInterview](docs/sdks/ats/README.md#updateatsinterview) - Update an interview
* [updateAtsJob](docs/sdks/ats/README.md#updateatsjob) - Update a job
* [updateAtsScorecard](docs/sdks/ats/README.md#updateatsscorecard) - Update a scorecard

### [Auth](docs/sdks/auth/README.md)

* [getUnifiedIntegrationAuth](docs/sdks/auth/README.md#getunifiedintegrationauth) - Authorize new connection
* [getUnifiedIntegrationLogin](docs/sdks/auth/README.md#getunifiedintegrationlogin) - Sign in a user

### [Balancesheet](docs/sdks/balancesheet/README.md)

* [getAccountingBalancesheet](docs/sdks/balancesheet/README.md#getaccountingbalancesheet) - Retrieve a balancesheet
* [listAccountingBalancesheets](docs/sdks/balancesheet/README.md#listaccountingbalancesheets) - List all balancesheets

### [Benefit](docs/sdks/benefit/README.md)

* [createHrisBenefit](docs/sdks/benefit/README.md#createhrisbenefit) - Create a benefit
* [getHrisBenefit](docs/sdks/benefit/README.md#gethrisbenefit) - Retrieve a benefit
* [listHrisBenefits](docs/sdks/benefit/README.md#listhrisbenefits) - List all benefits
* [patchHrisBenefit](docs/sdks/benefit/README.md#patchhrisbenefit) - Update a benefit
* [removeHrisBenefit](docs/sdks/benefit/README.md#removehrisbenefit) - Remove a benefit
* [updateHrisBenefit](docs/sdks/benefit/README.md#updatehrisbenefit) - Update a benefit

### [Bill](docs/sdks/bill/README.md)

* [createAccountingBill](docs/sdks/bill/README.md#createaccountingbill) - Create a bill
* [getAccountingBill](docs/sdks/bill/README.md#getaccountingbill) - Retrieve a bill
* [listAccountingBills](docs/sdks/bill/README.md#listaccountingbills) - List all bills
* [patchAccountingBill](docs/sdks/bill/README.md#patchaccountingbill) - Update a bill
* [removeAccountingBill](docs/sdks/bill/README.md#removeaccountingbill) - Remove a bill
* [updateAccountingBill](docs/sdks/bill/README.md#updateaccountingbill) - Update a bill

### [Branch](docs/sdks/branch/README.md)

* [createRepoBranch](docs/sdks/branch/README.md#createrepobranch) - Create a branch
* [getRepoBranch](docs/sdks/branch/README.md#getrepobranch) - Retrieve a branch
* [listRepoBranches](docs/sdks/branch/README.md#listrepobranches) - List all branches
* [patchRepoBranch](docs/sdks/branch/README.md#patchrepobranch) - Update a branch
* [removeRepoBranch](docs/sdks/branch/README.md#removerepobranch) - Remove a branch
* [updateRepoBranch](docs/sdks/branch/README.md#updaterepobranch) - Update a branch

### [Busy](docs/sdks/busy/README.md)

* [listCalendarBusies](docs/sdks/busy/README.md#listcalendarbusies) - List all busies

### [Calendar](docs/sdks/calendar/README.md)

* [createCalendarCalendar](docs/sdks/calendar/README.md#createcalendarcalendar) - Create a calendar
* [createCalendarEvent](docs/sdks/calendar/README.md#createcalendarevent) - Create an event
* [createCalendarLink](docs/sdks/calendar/README.md#createcalendarlink) - Create a link
* [getCalendarCalendar](docs/sdks/calendar/README.md#getcalendarcalendar) - Retrieve a calendar
* [getCalendarEvent](docs/sdks/calendar/README.md#getcalendarevent) - Retrieve an event
* [getCalendarLink](docs/sdks/calendar/README.md#getcalendarlink) - Retrieve a link
* [getCalendarRecording](docs/sdks/calendar/README.md#getcalendarrecording) - Retrieve a recording
* [listCalendarBusies](docs/sdks/calendar/README.md#listcalendarbusies) - List all busies
* [listCalendarCalendars](docs/sdks/calendar/README.md#listcalendarcalendars) - List all calendars
* [listCalendarEvents](docs/sdks/calendar/README.md#listcalendarevents) - List all events
* [listCalendarLinks](docs/sdks/calendar/README.md#listcalendarlinks) - List all links
* [listCalendarRecordings](docs/sdks/calendar/README.md#listcalendarrecordings) - List all recordings
* [patchCalendarCalendar](docs/sdks/calendar/README.md#patchcalendarcalendar) - Update a calendar
* [patchCalendarEvent](docs/sdks/calendar/README.md#patchcalendarevent) - Update an event
* [patchCalendarLink](docs/sdks/calendar/README.md#patchcalendarlink) - Update a link
* [removeCalendarCalendar](docs/sdks/calendar/README.md#removecalendarcalendar) - Remove a calendar
* [removeCalendarEvent](docs/sdks/calendar/README.md#removecalendarevent) - Remove an event
* [removeCalendarLink](docs/sdks/calendar/README.md#removecalendarlink) - Remove a link
* [updateCalendarCalendar](docs/sdks/calendar/README.md#updatecalendarcalendar) - Update a calendar
* [updateCalendarEvent](docs/sdks/calendar/README.md#updatecalendarevent) - Update an event
* [updateCalendarLink](docs/sdks/calendar/README.md#updatecalendarlink) - Update a link

### [Call](docs/sdks/call/README.md)

* [getUcCall](docs/sdks/call/README.md#getuccall) - Retrieve a call
* [listUcCalls](docs/sdks/call/README.md#listuccalls) - List all calls

### [Campaign](docs/sdks/campaign/README.md)

* [createAdsCampaign](docs/sdks/campaign/README.md#createadscampaign) - Create a campaign
* [getAdsCampaign](docs/sdks/campaign/README.md#getadscampaign) - Retrieve a campaign
* [listAdsCampaigns](docs/sdks/campaign/README.md#listadscampaigns) - List all campaigns
* [patchAdsCampaign](docs/sdks/campaign/README.md#patchadscampaign) - Update a campaign
* [removeAdsCampaign](docs/sdks/campaign/README.md#removeadscampaign) - Remove a campaign
* [updateAdsCampaign](docs/sdks/campaign/README.md#updateadscampaign) - Update a campaign

### [Candidate](docs/sdks/candidate/README.md)

* [createAtsCandidate](docs/sdks/candidate/README.md#createatscandidate) - Create a candidate
* [getAtsCandidate](docs/sdks/candidate/README.md#getatscandidate) - Retrieve a candidate
* [listAtsCandidates](docs/sdks/candidate/README.md#listatscandidates) - List all candidates
* [patchAtsCandidate](docs/sdks/candidate/README.md#patchatscandidate) - Update a candidate
* [removeAtsCandidate](docs/sdks/candidate/README.md#removeatscandidate) - Remove a candidate
* [updateAtsCandidate](docs/sdks/candidate/README.md#updateatscandidate) - Update a candidate

### [Cashflow](docs/sdks/cashflow/README.md)

* [getAccountingCashflow](docs/sdks/cashflow/README.md#getaccountingcashflow) - Retrieve a cashflow
* [listAccountingCashflows](docs/sdks/cashflow/README.md#listaccountingcashflows) - List all cashflows

### [Category](docs/sdks/category/README.md)

* [createAccountingCategory](docs/sdks/category/README.md#createaccountingcategory) - Create a category
* [createTicketingCategory](docs/sdks/category/README.md#createticketingcategory) - Create a category
* [getAccountingCategory](docs/sdks/category/README.md#getaccountingcategory) - Retrieve a category
* [getTicketingCategory](docs/sdks/category/README.md#getticketingcategory) - Retrieve a category
* [listAccountingCategories](docs/sdks/category/README.md#listaccountingcategories) - List all categories
* [listTicketingCategories](docs/sdks/category/README.md#listticketingcategories) - List all categories
* [patchAccountingCategory](docs/sdks/category/README.md#patchaccountingcategory) - Update a category
* [patchTicketingCategory](docs/sdks/category/README.md#patchticketingcategory) - Update a category
* [removeAccountingCategory](docs/sdks/category/README.md#removeaccountingcategory) - Remove a category
* [removeTicketingCategory](docs/sdks/category/README.md#removeticketingcategory) - Remove a category
* [updateAccountingCategory](docs/sdks/category/README.md#updateaccountingcategory) - Update a category
* [updateTicketingCategory](docs/sdks/category/README.md#updateticketingcategory) - Update a category

### [Change](docs/sdks/change/README.md)

* [getTaskChange](docs/sdks/change/README.md#gettaskchange) - Retrieve a change
* [listTaskChanges](docs/sdks/change/README.md#listtaskchanges) - List all changes

### [Channel](docs/sdks/channel/README.md)

* [getMessagingChannel](docs/sdks/channel/README.md#getmessagingchannel) - Retrieve a channel
* [listMessagingChannels](docs/sdks/channel/README.md#listmessagingchannels) - List all channels

### [Class](docs/sdks/class/README.md)

* [createLmsClass](docs/sdks/class/README.md#createlmsclass) - Create a class
* [getLmsClass](docs/sdks/class/README.md#getlmsclass) - Retrieve a class
* [listLmsClasses](docs/sdks/class/README.md#listlmsclasses) - List all classes
* [patchLmsClass](docs/sdks/class/README.md#patchlmsclass) - Update a class
* [removeLmsClass](docs/sdks/class/README.md#removelmsclass) - Remove a class
* [updateLmsClass](docs/sdks/class/README.md#updatelmsclass) - Update a class

### [Collection](docs/sdks/collection/README.md)

* [createCommerceCollection](docs/sdks/collection/README.md#createcommercecollection) - Create a collection
* [getCommerceCollection](docs/sdks/collection/README.md#getcommercecollection) - Retrieve a collection
* [listCommerceCollections](docs/sdks/collection/README.md#listcommercecollections) - List all collections
* [patchCommerceCollection](docs/sdks/collection/README.md#patchcommercecollection) - Update a collection
* [removeCommerceCollection](docs/sdks/collection/README.md#removecommercecollection) - Remove a collection
* [updateCommerceCollection](docs/sdks/collection/README.md#updatecommercecollection) - Update a collection

### [Comment](docs/sdks/comment/README.md)

* [createKmsComment](docs/sdks/comment/README.md#createkmscomment) - Create a comment
* [createTaskComment](docs/sdks/comment/README.md#createtaskcomment) - Create a comment
* [createUcComment](docs/sdks/comment/README.md#createuccomment) - Create a comment
* [getKmsComment](docs/sdks/comment/README.md#getkmscomment) - Retrieve a comment
* [getTaskComment](docs/sdks/comment/README.md#gettaskcomment) - Retrieve a comment
* [getUcComment](docs/sdks/comment/README.md#getuccomment) - Retrieve a comment
* [listKmsComments](docs/sdks/comment/README.md#listkmscomments) - List all comments
* [listTaskComments](docs/sdks/comment/README.md#listtaskcomments) - List all comments
* [listUcComments](docs/sdks/comment/README.md#listuccomments) - List all comments
* [patchKmsComment](docs/sdks/comment/README.md#patchkmscomment) - Update a comment
* [patchTaskComment](docs/sdks/comment/README.md#patchtaskcomment) - Update a comment
* [patchUcComment](docs/sdks/comment/README.md#patchuccomment) - Update a comment
* [removeKmsComment](docs/sdks/comment/README.md#removekmscomment) - Remove a comment
* [removeTaskComment](docs/sdks/comment/README.md#removetaskcomment) - Remove a comment
* [removeUcComment](docs/sdks/comment/README.md#removeuccomment) - Remove a comment
* [updateKmsComment](docs/sdks/comment/README.md#updatekmscomment) - Update a comment
* [updateTaskComment](docs/sdks/comment/README.md#updatetaskcomment) - Update a comment
* [updateUcComment](docs/sdks/comment/README.md#updateuccomment) - Update a comment

### [Commerce](docs/sdks/commerce/README.md)

* [createCommerceCollection](docs/sdks/commerce/README.md#createcommercecollection) - Create a collection
* [createCommerceInventory](docs/sdks/commerce/README.md#createcommerceinventory) - Create an inventory
* [createCommerceItem](docs/sdks/commerce/README.md#createcommerceitem) - Create an item
* [createCommerceLocation](docs/sdks/commerce/README.md#createcommercelocation) - Create a location
* [createCommerceReview](docs/sdks/commerce/README.md#createcommercereview) - Create a review
* [createCommerceSaleschannel](docs/sdks/commerce/README.md#createcommercesaleschannel) - Create a saleschannel
* [getCommerceCollection](docs/sdks/commerce/README.md#getcommercecollection) - Retrieve a collection
* [getCommerceInventory](docs/sdks/commerce/README.md#getcommerceinventory) - Retrieve an inventory
* [getCommerceItem](docs/sdks/commerce/README.md#getcommerceitem) - Retrieve an item
* [getCommerceLocation](docs/sdks/commerce/README.md#getcommercelocation) - Retrieve a location
* [getCommerceReview](docs/sdks/commerce/README.md#getcommercereview) - Retrieve a review
* [getCommerceSaleschannel](docs/sdks/commerce/README.md#getcommercesaleschannel) - Retrieve a saleschannel
* [listCommerceCollections](docs/sdks/commerce/README.md#listcommercecollections) - List all collections
* [listCommerceInventories](docs/sdks/commerce/README.md#listcommerceinventories) - List all inventories
* [listCommerceItems](docs/sdks/commerce/README.md#listcommerceitems) - List all items
* [listCommerceLocations](docs/sdks/commerce/README.md#listcommercelocations) - List all locations
* [listCommerceReviews](docs/sdks/commerce/README.md#listcommercereviews) - List all reviews
* [listCommerceSaleschannels](docs/sdks/commerce/README.md#listcommercesaleschannels) - List all saleschannels
* [patchCommerceCollection](docs/sdks/commerce/README.md#patchcommercecollection) - Update a collection
* [patchCommerceInventory](docs/sdks/commerce/README.md#patchcommerceinventory) - Update an inventory
* [patchCommerceItem](docs/sdks/commerce/README.md#patchcommerceitem) - Update an item
* [patchCommerceLocation](docs/sdks/commerce/README.md#patchcommercelocation) - Update a location
* [patchCommerceReview](docs/sdks/commerce/README.md#patchcommercereview) - Update a review
* [patchCommerceSaleschannel](docs/sdks/commerce/README.md#patchcommercesaleschannel) - Update a saleschannel
* [removeCommerceCollection](docs/sdks/commerce/README.md#removecommercecollection) - Remove a collection
* [removeCommerceInventory](docs/sdks/commerce/README.md#removecommerceinventory) - Remove an inventory
* [removeCommerceItem](docs/sdks/commerce/README.md#removecommerceitem) - Remove an item
* [removeCommerceLocation](docs/sdks/commerce/README.md#removecommercelocation) - Remove a location
* [removeCommerceReview](docs/sdks/commerce/README.md#removecommercereview) - Remove a review
* [removeCommerceSaleschannel](docs/sdks/commerce/README.md#removecommercesaleschannel) - Remove a saleschannel
* [updateCommerceCollection](docs/sdks/commerce/README.md#updatecommercecollection) - Update a collection
* [updateCommerceInventory](docs/sdks/commerce/README.md#updatecommerceinventory) - Update an inventory
* [updateCommerceItem](docs/sdks/commerce/README.md#updatecommerceitem) - Update an item
* [updateCommerceLocation](docs/sdks/commerce/README.md#updatecommercelocation) - Update a location
* [updateCommerceReview](docs/sdks/commerce/README.md#updatecommercereview) - Update a review
* [updateCommerceSaleschannel](docs/sdks/commerce/README.md#updatecommercesaleschannel) - Update a saleschannel

### [Commit](docs/sdks/commit/README.md)

* [createRepoCommit](docs/sdks/commit/README.md#createrepocommit) - Create a commit
* [getRepoCommit](docs/sdks/commit/README.md#getrepocommit) - Retrieve a commit
* [listRepoCommits](docs/sdks/commit/README.md#listrepocommits) - List all commits
* [patchRepoCommit](docs/sdks/commit/README.md#patchrepocommit) - Update a commit
* [removeRepoCommit](docs/sdks/commit/README.md#removerepocommit) - Remove a commit
* [updateRepoCommit](docs/sdks/commit/README.md#updaterepocommit) - Update a commit

### [Company](docs/sdks/company/README.md)

* [createAtsCompany](docs/sdks/company/README.md#createatscompany) - Create a company
* [createCrmCompany](docs/sdks/company/README.md#createcrmcompany) - Create a company
* [createHrisCompany](docs/sdks/company/README.md#createhriscompany) - Create a company
* [getAtsCompany](docs/sdks/company/README.md#getatscompany) - Retrieve a company
* [getCrmCompany](docs/sdks/company/README.md#getcrmcompany) - Retrieve a company
* [getHrisCompany](docs/sdks/company/README.md#gethriscompany) - Retrieve a company
* [listAtsCompanies](docs/sdks/company/README.md#listatscompanies) - List all companies
* [listCrmCompanies](docs/sdks/company/README.md#listcrmcompanies) - List all companies
* [listEnrichCompanies](docs/sdks/company/README.md#listenrichcompanies) - Retrieve enrichment information for a company
* [listHrisCompanies](docs/sdks/company/README.md#listhriscompanies) - List all companies
* [patchAtsCompany](docs/sdks/company/README.md#patchatscompany) - Update a company
* [patchCrmCompany](docs/sdks/company/README.md#patchcrmcompany) - Update a company
* [patchHrisCompany](docs/sdks/company/README.md#patchhriscompany) - Update a company
* [removeAtsCompany](docs/sdks/company/README.md#removeatscompany) - Remove a company
* [removeCrmCompany](docs/sdks/company/README.md#removecrmcompany) - Remove a company
* [removeHrisCompany](docs/sdks/company/README.md#removehriscompany) - Remove a company
* [updateAtsCompany](docs/sdks/company/README.md#updateatscompany) - Update a company
* [updateCrmCompany](docs/sdks/company/README.md#updatecrmcompany) - Update a company
* [updateHrisCompany](docs/sdks/company/README.md#updatehriscompany) - Update a company

### [Connection](docs/sdks/connection/README.md)

* [createUnifiedConnection](docs/sdks/connection/README.md#createunifiedconnection) - Create connection
* [getUnifiedConnection](docs/sdks/connection/README.md#getunifiedconnection) - Retrieve connection
* [listUnifiedConnections](docs/sdks/connection/README.md#listunifiedconnections) - List all connections
* [patchUnifiedConnection](docs/sdks/connection/README.md#patchunifiedconnection) - Update connection
* [removeUnifiedConnection](docs/sdks/connection/README.md#removeunifiedconnection) - Remove connection
* [updateUnifiedConnection](docs/sdks/connection/README.md#updateunifiedconnection) - Update connection

### [Contact](docs/sdks/contact/README.md)

* [createAccountingContact](docs/sdks/contact/README.md#createaccountingcontact) - Create a contact
* [createCrmContact](docs/sdks/contact/README.md#createcrmcontact) - Create a contact
* [createUcContact](docs/sdks/contact/README.md#createuccontact) - Create a contact
* [getAccountingContact](docs/sdks/contact/README.md#getaccountingcontact) - Retrieve a contact
* [getCrmContact](docs/sdks/contact/README.md#getcrmcontact) - Retrieve a contact
* [getUcContact](docs/sdks/contact/README.md#getuccontact) - Retrieve a contact
* [listAccountingContacts](docs/sdks/contact/README.md#listaccountingcontacts) - List all contacts
* [listCrmContacts](docs/sdks/contact/README.md#listcrmcontacts) - List all contacts
* [listUcContacts](docs/sdks/contact/README.md#listuccontacts) - List all contacts
* [patchAccountingContact](docs/sdks/contact/README.md#patchaccountingcontact) - Update a contact
* [patchCrmContact](docs/sdks/contact/README.md#patchcrmcontact) - Update a contact
* [patchUcContact](docs/sdks/contact/README.md#patchuccontact) - Update a contact
* [removeAccountingContact](docs/sdks/contact/README.md#removeaccountingcontact) - Remove a contact
* [removeCrmContact](docs/sdks/contact/README.md#removecrmcontact) - Remove a contact
* [removeUcContact](docs/sdks/contact/README.md#removeuccontact) - Remove a contact
* [updateAccountingContact](docs/sdks/contact/README.md#updateaccountingcontact) - Update a contact
* [updateCrmContact](docs/sdks/contact/README.md#updatecrmcontact) - Update a contact
* [updateUcContact](docs/sdks/contact/README.md#updateuccontact) - Update a contact

### [Course](docs/sdks/course/README.md)

* [createLmsCourse](docs/sdks/course/README.md#createlmscourse) - Create a course
* [getLmsCourse](docs/sdks/course/README.md#getlmscourse) - Retrieve a course
* [listLmsCourses](docs/sdks/course/README.md#listlmscourses) - List all courses
* [patchLmsCourse](docs/sdks/course/README.md#patchlmscourse) - Update a course
* [removeLmsCourse](docs/sdks/course/README.md#removelmscourse) - Remove a course
* [updateLmsCourse](docs/sdks/course/README.md#updatelmscourse) - Update a course

### [Creditmemo](docs/sdks/creditmemo/README.md)

* [createAccountingCreditmemo](docs/sdks/creditmemo/README.md#createaccountingcreditmemo) - Create a creditmemo
* [getAccountingCreditmemo](docs/sdks/creditmemo/README.md#getaccountingcreditmemo) - Retrieve a creditmemo
* [listAccountingCreditmemoes](docs/sdks/creditmemo/README.md#listaccountingcreditmemoes) - List all creditmemoes
* [patchAccountingCreditmemo](docs/sdks/creditmemo/README.md#patchaccountingcreditmemo) - Update a creditmemo
* [removeAccountingCreditmemo](docs/sdks/creditmemo/README.md#removeaccountingcreditmemo) - Remove a creditmemo
* [updateAccountingCreditmemo](docs/sdks/creditmemo/README.md#updateaccountingcreditmemo) - Update a creditmemo

### [Crm](docs/sdks/crm/README.md)

* [createCrmCompany](docs/sdks/crm/README.md#createcrmcompany) - Create a company
* [createCrmContact](docs/sdks/crm/README.md#createcrmcontact) - Create a contact
* [createCrmDeal](docs/sdks/crm/README.md#createcrmdeal) - Create a deal
* [createCrmEvent](docs/sdks/crm/README.md#createcrmevent) - Create an event
* [createCrmLead](docs/sdks/crm/README.md#createcrmlead) - Create a lead
* [createCrmPipeline](docs/sdks/crm/README.md#createcrmpipeline) - Create a pipeline
* [getCrmCompany](docs/sdks/crm/README.md#getcrmcompany) - Retrieve a company
* [getCrmContact](docs/sdks/crm/README.md#getcrmcontact) - Retrieve a contact
* [getCrmDeal](docs/sdks/crm/README.md#getcrmdeal) - Retrieve a deal
* [getCrmEvent](docs/sdks/crm/README.md#getcrmevent) - Retrieve an event
* [getCrmLead](docs/sdks/crm/README.md#getcrmlead) - Retrieve a lead
* [getCrmPipeline](docs/sdks/crm/README.md#getcrmpipeline) - Retrieve a pipeline
* [listCrmCompanies](docs/sdks/crm/README.md#listcrmcompanies) - List all companies
* [listCrmContacts](docs/sdks/crm/README.md#listcrmcontacts) - List all contacts
* [listCrmDeals](docs/sdks/crm/README.md#listcrmdeals) - List all deals
* [listCrmEvents](docs/sdks/crm/README.md#listcrmevents) - List all events
* [listCrmLeads](docs/sdks/crm/README.md#listcrmleads) - List all leads
* [listCrmPipelines](docs/sdks/crm/README.md#listcrmpipelines) - List all pipelines
* [patchCrmCompany](docs/sdks/crm/README.md#patchcrmcompany) - Update a company
* [patchCrmContact](docs/sdks/crm/README.md#patchcrmcontact) - Update a contact
* [patchCrmDeal](docs/sdks/crm/README.md#patchcrmdeal) - Update a deal
* [patchCrmEvent](docs/sdks/crm/README.md#patchcrmevent) - Update an event
* [patchCrmLead](docs/sdks/crm/README.md#patchcrmlead) - Update a lead
* [patchCrmPipeline](docs/sdks/crm/README.md#patchcrmpipeline) - Update a pipeline
* [removeCrmCompany](docs/sdks/crm/README.md#removecrmcompany) - Remove a company
* [removeCrmContact](docs/sdks/crm/README.md#removecrmcontact) - Remove a contact
* [removeCrmDeal](docs/sdks/crm/README.md#removecrmdeal) - Remove a deal
* [removeCrmEvent](docs/sdks/crm/README.md#removecrmevent) - Remove an event
* [removeCrmLead](docs/sdks/crm/README.md#removecrmlead) - Remove a lead
* [removeCrmPipeline](docs/sdks/crm/README.md#removecrmpipeline) - Remove a pipeline
* [updateCrmCompany](docs/sdks/crm/README.md#updatecrmcompany) - Update a company
* [updateCrmContact](docs/sdks/crm/README.md#updatecrmcontact) - Update a contact
* [updateCrmDeal](docs/sdks/crm/README.md#updatecrmdeal) - Update a deal
* [updateCrmEvent](docs/sdks/crm/README.md#updatecrmevent) - Update an event
* [updateCrmLead](docs/sdks/crm/README.md#updatecrmlead) - Update a lead
* [updateCrmPipeline](docs/sdks/crm/README.md#updatecrmpipeline) - Update a pipeline

### [Customer](docs/sdks/customer/README.md)

* [createTicketingCustomer](docs/sdks/customer/README.md#createticketingcustomer) - Create a customer
* [getTicketingCustomer](docs/sdks/customer/README.md#getticketingcustomer) - Retrieve a customer
* [listTicketingCustomers](docs/sdks/customer/README.md#listticketingcustomers) - List all customers
* [patchTicketingCustomer](docs/sdks/customer/README.md#patchticketingcustomer) - Update a customer
* [removeTicketingCustomer](docs/sdks/customer/README.md#removeticketingcustomer) - Remove a customer
* [updateTicketingCustomer](docs/sdks/customer/README.md#updateticketingcustomer) - Update a customer

### [Deal](docs/sdks/deal/README.md)

* [createCrmDeal](docs/sdks/deal/README.md#createcrmdeal) - Create a deal
* [getCrmDeal](docs/sdks/deal/README.md#getcrmdeal) - Retrieve a deal
* [listCrmDeals](docs/sdks/deal/README.md#listcrmdeals) - List all deals
* [patchCrmDeal](docs/sdks/deal/README.md#patchcrmdeal) - Update a deal
* [removeCrmDeal](docs/sdks/deal/README.md#removecrmdeal) - Remove a deal
* [updateCrmDeal](docs/sdks/deal/README.md#updatecrmdeal) - Update a deal

### [Deduction](docs/sdks/deduction/README.md)

* [createHrisDeduction](docs/sdks/deduction/README.md#createhrisdeduction) - Create a deduction
* [getHrisDeduction](docs/sdks/deduction/README.md#gethrisdeduction) - Retrieve a deduction
* [listHrisDeductions](docs/sdks/deduction/README.md#listhrisdeductions) - List all deductions
* [patchHrisDeduction](docs/sdks/deduction/README.md#patchhrisdeduction) - Update a deduction
* [removeHrisDeduction](docs/sdks/deduction/README.md#removehrisdeduction) - Remove a deduction
* [updateHrisDeduction](docs/sdks/deduction/README.md#updatehrisdeduction) - Update a deduction

### [Device](docs/sdks/device/README.md)

* [createHrisDevice](docs/sdks/device/README.md#createhrisdevice) - Create a device
* [getHrisDevice](docs/sdks/device/README.md#gethrisdevice) - Retrieve a device
* [listHrisDevices](docs/sdks/device/README.md#listhrisdevices) - List all devices
* [patchHrisDevice](docs/sdks/device/README.md#patchhrisdevice) - Update a device
* [removeHrisDevice](docs/sdks/device/README.md#removehrisdevice) - Remove a device
* [updateHrisDevice](docs/sdks/device/README.md#updatehrisdevice) - Update a device

### [Document](docs/sdks/document/README.md)

* [createAtsDocument](docs/sdks/document/README.md#createatsdocument) - Create a document
* [getAtsDocument](docs/sdks/document/README.md#getatsdocument) - Retrieve a document
* [listAtsDocuments](docs/sdks/document/README.md#listatsdocuments) - List all documents
* [patchAtsDocument](docs/sdks/document/README.md#patchatsdocument) - Update a document
* [removeAtsDocument](docs/sdks/document/README.md#removeatsdocument) - Remove a document
* [updateAtsDocument](docs/sdks/document/README.md#updateatsdocument) - Update a document

### [Embedding](docs/sdks/embedding/README.md)

* [createGenaiEmbedding](docs/sdks/embedding/README.md#creategenaiembedding) - Create an embedding

### [Employee](docs/sdks/employee/README.md)

* [createHrisEmployee](docs/sdks/employee/README.md#createhrisemployee) - Create an employee
* [getHrisEmployee](docs/sdks/employee/README.md#gethrisemployee) - Retrieve an employee
* [listHrisEmployees](docs/sdks/employee/README.md#listhrisemployees) - List all employees
* [patchHrisEmployee](docs/sdks/employee/README.md#patchhrisemployee) - Update an employee
* [removeHrisEmployee](docs/sdks/employee/README.md#removehrisemployee) - Remove an employee
* [updateHrisEmployee](docs/sdks/employee/README.md#updatehrisemployee) - Update an employee

### [Enrich](docs/sdks/enrich/README.md)

* [listEnrichCompanies](docs/sdks/enrich/README.md#listenrichcompanies) - Retrieve enrichment information for a company
* [listEnrichPeople](docs/sdks/enrich/README.md#listenrichpeople) - Retrieve enrichment information for a person

### [Environment](docs/sdks/environment/README.md)

* [createUnifiedEnvironment](docs/sdks/environment/README.md#createunifiedenvironment)
* [listUnifiedEnvironments](docs/sdks/environment/README.md#listunifiedenvironments)
* [removeUnifiedEnvironment](docs/sdks/environment/README.md#removeunifiedenvironment)

### [Event](docs/sdks/event/README.md)

* [createCalendarEvent](docs/sdks/event/README.md#createcalendarevent) - Create an event
* [createCrmEvent](docs/sdks/event/README.md#createcrmevent) - Create an event
* [getCalendarEvent](docs/sdks/event/README.md#getcalendarevent) - Retrieve an event
* [getCrmEvent](docs/sdks/event/README.md#getcrmevent) - Retrieve an event
* [listCalendarEvents](docs/sdks/event/README.md#listcalendarevents) - List all events
* [listCrmEvents](docs/sdks/event/README.md#listcrmevents) - List all events
* [patchCalendarEvent](docs/sdks/event/README.md#patchcalendarevent) - Update an event
* [patchCrmEvent](docs/sdks/event/README.md#patchcrmevent) - Update an event
* [patchMessagingEvent](docs/sdks/event/README.md#patchmessagingevent) - Update an event
* [removeCalendarEvent](docs/sdks/event/README.md#removecalendarevent) - Remove an event
* [removeCrmEvent](docs/sdks/event/README.md#removecrmevent) - Remove an event
* [updateCalendarEvent](docs/sdks/event/README.md#updatecalendarevent) - Update an event
* [updateCrmEvent](docs/sdks/event/README.md#updatecrmevent) - Update an event
* [updateMessagingEvent](docs/sdks/event/README.md#updatemessagingevent) - Update an event

### [Expense](docs/sdks/expense/README.md)

* [createAccountingExpense](docs/sdks/expense/README.md#createaccountingexpense) - Create an expense
* [getAccountingExpense](docs/sdks/expense/README.md#getaccountingexpense) - Retrieve an expense
* [listAccountingExpenses](docs/sdks/expense/README.md#listaccountingexpenses) - List all expenses
* [patchAccountingExpense](docs/sdks/expense/README.md#patchaccountingexpense) - Update an expense
* [removeAccountingExpense](docs/sdks/expense/README.md#removeaccountingexpense) - Remove an expense
* [updateAccountingExpense](docs/sdks/expense/README.md#updateaccountingexpense) - Update an expense

### [File](docs/sdks/file/README.md)

* [createStorageFile](docs/sdks/file/README.md#createstoragefile) - Create a file
* [getStorageFile](docs/sdks/file/README.md#getstoragefile) - Retrieve a file
* [listStorageFiles](docs/sdks/file/README.md#liststoragefiles) - List all files
* [patchStorageFile](docs/sdks/file/README.md#patchstoragefile) - Update a file
* [removeStorageFile](docs/sdks/file/README.md#removestoragefile) - Remove a file
* [updateStorageFile](docs/sdks/file/README.md#updatestoragefile) - Update a file

### [Genai](docs/sdks/genai/README.md)

* [createGenaiEmbedding](docs/sdks/genai/README.md#creategenaiembedding) - Create an embedding
* [createGenaiPrompt](docs/sdks/genai/README.md#creategenaiprompt) - Create a prompt
* [getGenaiModel](docs/sdks/genai/README.md#getgenaimodel) - Retrieve a model
* [listGenaiModels](docs/sdks/genai/README.md#listgenaimodels) - List all models

### [Group](docs/sdks/group/README.md)

* [createAdsGroup](docs/sdks/group/README.md#createadsgroup) - Create a group
* [createHrisGroup](docs/sdks/group/README.md#createhrisgroup) - Create a group
* [createScimGroups](docs/sdks/group/README.md#createscimgroups) - Create group
* [getAdsGroup](docs/sdks/group/README.md#getadsgroup) - Retrieve a group
* [getHrisGroup](docs/sdks/group/README.md#gethrisgroup) - Retrieve a group
* [getScimGroups](docs/sdks/group/README.md#getscimgroups) - Get group
* [listAdsGroups](docs/sdks/group/README.md#listadsgroups) - List all groups
* [listHrisGroups](docs/sdks/group/README.md#listhrisgroups) - List all groups
* [listScimGroups](docs/sdks/group/README.md#listscimgroups) - List groups
* [patchAdsGroup](docs/sdks/group/README.md#patchadsgroup) - Update a group
* [patchHrisGroup](docs/sdks/group/README.md#patchhrisgroup) - Update a group
* [patchScimGroups](docs/sdks/group/README.md#patchscimgroups) - Update group
* [removeAdsGroup](docs/sdks/group/README.md#removeadsgroup) - Remove a group
* [removeHrisGroup](docs/sdks/group/README.md#removehrisgroup) - Remove a group
* [removeScimGroups](docs/sdks/group/README.md#removescimgroups) - Delete group
* [updateAdsGroup](docs/sdks/group/README.md#updateadsgroup) - Update a group
* [updateHrisGroup](docs/sdks/group/README.md#updatehrisgroup) - Update a group
* [updateScimGroups](docs/sdks/group/README.md#updatescimgroups) - Update group

### [Hris](docs/sdks/hris/README.md)

* [createHrisBenefit](docs/sdks/hris/README.md#createhrisbenefit) - Create a benefit
* [createHrisCompany](docs/sdks/hris/README.md#createhriscompany) - Create a company
* [createHrisDeduction](docs/sdks/hris/README.md#createhrisdeduction) - Create a deduction
* [createHrisDevice](docs/sdks/hris/README.md#createhrisdevice) - Create a device
* [createHrisEmployee](docs/sdks/hris/README.md#createhrisemployee) - Create an employee
* [createHrisGroup](docs/sdks/hris/README.md#createhrisgroup) - Create a group
* [createHrisLocation](docs/sdks/hris/README.md#createhrislocation) - Create a location
* [createHrisTimeshift](docs/sdks/hris/README.md#createhristimeshift) - Create a timeshift
* [getHrisBenefit](docs/sdks/hris/README.md#gethrisbenefit) - Retrieve a benefit
* [getHrisCompany](docs/sdks/hris/README.md#gethriscompany) - Retrieve a company
* [getHrisDeduction](docs/sdks/hris/README.md#gethrisdeduction) - Retrieve a deduction
* [getHrisDevice](docs/sdks/hris/README.md#gethrisdevice) - Retrieve a device
* [getHrisEmployee](docs/sdks/hris/README.md#gethrisemployee) - Retrieve an employee
* [getHrisGroup](docs/sdks/hris/README.md#gethrisgroup) - Retrieve a group
* [getHrisLocation](docs/sdks/hris/README.md#gethrislocation) - Retrieve a location
* [getHrisPayslip](docs/sdks/hris/README.md#gethrispayslip) - Retrieve a payslip
* [getHrisTimeoff](docs/sdks/hris/README.md#gethristimeoff) - Retrieve a timeoff
* [getHrisTimeshift](docs/sdks/hris/README.md#gethristimeshift) - Retrieve a timeshift
* [listHrisBenefits](docs/sdks/hris/README.md#listhrisbenefits) - List all benefits
* [listHrisCompanies](docs/sdks/hris/README.md#listhriscompanies) - List all companies
* [listHrisDeductions](docs/sdks/hris/README.md#listhrisdeductions) - List all deductions
* [listHrisDevices](docs/sdks/hris/README.md#listhrisdevices) - List all devices
* [listHrisEmployees](docs/sdks/hris/README.md#listhrisemployees) - List all employees
* [listHrisGroups](docs/sdks/hris/README.md#listhrisgroups) - List all groups
* [listHrisLocations](docs/sdks/hris/README.md#listhrislocations) - List all locations
* [listHrisPayslips](docs/sdks/hris/README.md#listhrispayslips) - List all payslips
* [listHrisTimeoffs](docs/sdks/hris/README.md#listhristimeoffs) - List all timeoffs
* [listHrisTimeshifts](docs/sdks/hris/README.md#listhristimeshifts) - List all timeshifts
* [patchHrisBenefit](docs/sdks/hris/README.md#patchhrisbenefit) - Update a benefit
* [patchHrisCompany](docs/sdks/hris/README.md#patchhriscompany) - Update a company
* [patchHrisDeduction](docs/sdks/hris/README.md#patchhrisdeduction) - Update a deduction
* [patchHrisDevice](docs/sdks/hris/README.md#patchhrisdevice) - Update a device
* [patchHrisEmployee](docs/sdks/hris/README.md#patchhrisemployee) - Update an employee
* [patchHrisGroup](docs/sdks/hris/README.md#patchhrisgroup) - Update a group
* [patchHrisLocation](docs/sdks/hris/README.md#patchhrislocation) - Update a location
* [patchHrisTimeshift](docs/sdks/hris/README.md#patchhristimeshift) - Update a timeshift
* [removeHrisBenefit](docs/sdks/hris/README.md#removehrisbenefit) - Remove a benefit
* [removeHrisCompany](docs/sdks/hris/README.md#removehriscompany) - Remove a company
* [removeHrisDeduction](docs/sdks/hris/README.md#removehrisdeduction) - Remove a deduction
* [removeHrisDevice](docs/sdks/hris/README.md#removehrisdevice) - Remove a device
* [removeHrisEmployee](docs/sdks/hris/README.md#removehrisemployee) - Remove an employee
* [removeHrisGroup](docs/sdks/hris/README.md#removehrisgroup) - Remove a group
* [removeHrisLocation](docs/sdks/hris/README.md#removehrislocation) - Remove a location
* [removeHrisTimeshift](docs/sdks/hris/README.md#removehristimeshift) - Remove a timeshift
* [updateHrisBenefit](docs/sdks/hris/README.md#updatehrisbenefit) - Update a benefit
* [updateHrisCompany](docs/sdks/hris/README.md#updatehriscompany) - Update a company
* [updateHrisDeduction](docs/sdks/hris/README.md#updatehrisdeduction) - Update a deduction
* [updateHrisDevice](docs/sdks/hris/README.md#updatehrisdevice) - Update a device
* [updateHrisEmployee](docs/sdks/hris/README.md#updatehrisemployee) - Update an employee
* [updateHrisGroup](docs/sdks/hris/README.md#updatehrisgroup) - Update a group
* [updateHrisLocation](docs/sdks/hris/README.md#updatehrislocation) - Update a location
* [updateHrisTimeshift](docs/sdks/hris/README.md#updatehristimeshift) - Update a timeshift

### [Instructor](docs/sdks/instructor/README.md)

* [createLmsInstructor](docs/sdks/instructor/README.md#createlmsinstructor) - Create an instructor
* [getLmsInstructor](docs/sdks/instructor/README.md#getlmsinstructor) - Retrieve an instructor
* [listLmsInstructors](docs/sdks/instructor/README.md#listlmsinstructors) - List all instructors
* [patchLmsInstructor](docs/sdks/instructor/README.md#patchlmsinstructor) - Update an instructor
* [removeLmsInstructor](docs/sdks/instructor/README.md#removelmsinstructor) - Remove an instructor
* [updateLmsInstructor](docs/sdks/instructor/README.md#updatelmsinstructor) - Update an instructor

### [Integration](docs/sdks/integration/README.md)

* [getUnifiedIntegrationAuth](docs/sdks/integration/README.md#getunifiedintegrationauth) - Authorize new connection
* [listUnifiedIntegrationWorkspaces](docs/sdks/integration/README.md#listunifiedintegrationworkspaces) - Returns all activated integrations in a workspace
* [listUnifiedIntegrations](docs/sdks/integration/README.md#listunifiedintegrations) - Returns all integrations

### [Interview](docs/sdks/interview/README.md)

* [createAtsInterview](docs/sdks/interview/README.md#createatsinterview) - Create an interview
* [getAtsInterview](docs/sdks/interview/README.md#getatsinterview) - Retrieve an interview
* [listAtsInterviews](docs/sdks/interview/README.md#listatsinterviews) - List all interviews
* [patchAtsInterview](docs/sdks/interview/README.md#patchatsinterview) - Update an interview
* [removeAtsInterview](docs/sdks/interview/README.md#removeatsinterview) - Remove an interview
* [updateAtsInterview](docs/sdks/interview/README.md#updateatsinterview) - Update an interview

### [Inventory](docs/sdks/inventory/README.md)

* [createCommerceInventory](docs/sdks/inventory/README.md#createcommerceinventory) - Create an inventory
* [getCommerceInventory](docs/sdks/inventory/README.md#getcommerceinventory) - Retrieve an inventory
* [listCommerceInventories](docs/sdks/inventory/README.md#listcommerceinventories) - List all inventories
* [patchCommerceInventory](docs/sdks/inventory/README.md#patchcommerceinventory) - Update an inventory
* [removeCommerceInventory](docs/sdks/inventory/README.md#removecommerceinventory) - Remove an inventory
* [updateCommerceInventory](docs/sdks/inventory/README.md#updatecommerceinventory) - Update an inventory

### [Invoice](docs/sdks/invoice/README.md)

* [createAccountingInvoice](docs/sdks/invoice/README.md#createaccountinginvoice) - Create an invoice
* [getAccountingInvoice](docs/sdks/invoice/README.md#getaccountinginvoice) - Retrieve an invoice
* [listAccountingInvoices](docs/sdks/invoice/README.md#listaccountinginvoices) - List all invoices
* [patchAccountingInvoice](docs/sdks/invoice/README.md#patchaccountinginvoice) - Update an invoice
* [removeAccountingInvoice](docs/sdks/invoice/README.md#removeaccountinginvoice) - Remove an invoice
* [updateAccountingInvoice](docs/sdks/invoice/README.md#updateaccountinginvoice) - Update an invoice

### [Issue](docs/sdks/issue/README.md)

* [getUnifiedIssue](docs/sdks/issue/README.md#getunifiedissue) - Retrieve support issue
* [listUnifiedIssues](docs/sdks/issue/README.md#listunifiedissues) - List support issues

### [Item](docs/sdks/item/README.md)

* [createCommerceItem](docs/sdks/item/README.md#createcommerceitem) - Create an item
* [getCommerceItem](docs/sdks/item/README.md#getcommerceitem) - Retrieve an item
* [listCommerceItems](docs/sdks/item/README.md#listcommerceitems) - List all items
* [patchCommerceItem](docs/sdks/item/README.md#patchcommerceitem) - Update an item
* [removeCommerceItem](docs/sdks/item/README.md#removecommerceitem) - Remove an item
* [updateCommerceItem](docs/sdks/item/README.md#updatecommerceitem) - Update an item

### [Job](docs/sdks/job/README.md)

* [createAtsJob](docs/sdks/job/README.md#createatsjob) - Create a job
* [getAtsJob](docs/sdks/job/README.md#getatsjob) - Retrieve a job
* [listAtsJobs](docs/sdks/job/README.md#listatsjobs) - List all jobs
* [patchAtsJob](docs/sdks/job/README.md#patchatsjob) - Update a job
* [removeAtsJob](docs/sdks/job/README.md#removeatsjob) - Remove a job
* [updateAtsJob](docs/sdks/job/README.md#updateatsjob) - Update a job

### [Journal](docs/sdks/journal/README.md)

* [createAccountingJournal](docs/sdks/journal/README.md#createaccountingjournal) - Create a journal
* [getAccountingJournal](docs/sdks/journal/README.md#getaccountingjournal) - Retrieve a journal
* [listAccountingJournals](docs/sdks/journal/README.md#listaccountingjournals) - List all journals
* [patchAccountingJournal](docs/sdks/journal/README.md#patchaccountingjournal) - Update a journal
* [removeAccountingJournal](docs/sdks/journal/README.md#removeaccountingjournal) - Remove a journal
* [updateAccountingJournal](docs/sdks/journal/README.md#updateaccountingjournal) - Update a journal

### [Kms](docs/sdks/kms/README.md)

* [createKmsComment](docs/sdks/kms/README.md#createkmscomment) - Create a comment
* [createKmsPage](docs/sdks/kms/README.md#createkmspage) - Create a page
* [createKmsSpace](docs/sdks/kms/README.md#createkmsspace) - Create a space
* [getKmsComment](docs/sdks/kms/README.md#getkmscomment) - Retrieve a comment
* [getKmsPage](docs/sdks/kms/README.md#getkmspage) - Retrieve a page
* [getKmsSpace](docs/sdks/kms/README.md#getkmsspace) - Retrieve a space
* [listKmsComments](docs/sdks/kms/README.md#listkmscomments) - List all comments
* [listKmsPages](docs/sdks/kms/README.md#listkmspages) - List all pages
* [listKmsSpaces](docs/sdks/kms/README.md#listkmsspaces) - List all spaces
* [patchKmsComment](docs/sdks/kms/README.md#patchkmscomment) - Update a comment
* [patchKmsPage](docs/sdks/kms/README.md#patchkmspage) - Update a page
* [patchKmsSpace](docs/sdks/kms/README.md#patchkmsspace) - Update a space
* [removeKmsComment](docs/sdks/kms/README.md#removekmscomment) - Remove a comment
* [removeKmsPage](docs/sdks/kms/README.md#removekmspage) - Remove a page
* [removeKmsSpace](docs/sdks/kms/README.md#removekmsspace) - Remove a space
* [updateKmsComment](docs/sdks/kms/README.md#updatekmscomment) - Update a comment
* [updateKmsPage](docs/sdks/kms/README.md#updatekmspage) - Update a page
* [updateKmsSpace](docs/sdks/kms/README.md#updatekmsspace) - Update a space

### [Lead](docs/sdks/lead/README.md)

* [createCrmLead](docs/sdks/lead/README.md#createcrmlead) - Create a lead
* [getCrmLead](docs/sdks/lead/README.md#getcrmlead) - Retrieve a lead
* [listCrmLeads](docs/sdks/lead/README.md#listcrmleads) - List all leads
* [patchCrmLead](docs/sdks/lead/README.md#patchcrmlead) - Update a lead
* [removeCrmLead](docs/sdks/lead/README.md#removecrmlead) - Remove a lead
* [updateCrmLead](docs/sdks/lead/README.md#updatecrmlead) - Update a lead

### [Link](docs/sdks/link/README.md)

* [createCalendarLink](docs/sdks/link/README.md#createcalendarlink) - Create a link
* [createPaymentLink](docs/sdks/link/README.md#createpaymentlink) - Create a link
* [getCalendarLink](docs/sdks/link/README.md#getcalendarlink) - Retrieve a link
* [getPaymentLink](docs/sdks/link/README.md#getpaymentlink) - Retrieve a link
* [listCalendarLinks](docs/sdks/link/README.md#listcalendarlinks) - List all links
* [listPaymentLinks](docs/sdks/link/README.md#listpaymentlinks) - List all links
* [patchCalendarLink](docs/sdks/link/README.md#patchcalendarlink) - Update a link
* [patchPaymentLink](docs/sdks/link/README.md#patchpaymentlink) - Update a link
* [removeCalendarLink](docs/sdks/link/README.md#removecalendarlink) - Remove a link
* [removePaymentLink](docs/sdks/link/README.md#removepaymentlink) - Remove a link
* [updateCalendarLink](docs/sdks/link/README.md#updatecalendarlink) - Update a link
* [updatePaymentLink](docs/sdks/link/README.md#updatepaymentlink) - Update a link

### [List](docs/sdks/list/README.md)

* [createMartechList](docs/sdks/list/README.md#createmartechlist) - Create a list
* [getMartechList](docs/sdks/list/README.md#getmartechlist) - Retrieve a list
* [listMartechLists](docs/sdks/list/README.md#listmartechlists) - List all lists
* [patchMartechList](docs/sdks/list/README.md#patchmartechlist) - Update a list
* [removeMartechList](docs/sdks/list/README.md#removemartechlist) - Remove a list
* [updateMartechList](docs/sdks/list/README.md#updatemartechlist) - Update a list

### [Lms](docs/sdks/lms/README.md)

* [createLmsClass](docs/sdks/lms/README.md#createlmsclass) - Create a class
* [createLmsCourse](docs/sdks/lms/README.md#createlmscourse) - Create a course
* [createLmsInstructor](docs/sdks/lms/README.md#createlmsinstructor) - Create an instructor
* [createLmsStudent](docs/sdks/lms/README.md#createlmsstudent) - Create a student
* [getLmsClass](docs/sdks/lms/README.md#getlmsclass) - Retrieve a class
* [getLmsCourse](docs/sdks/lms/README.md#getlmscourse) - Retrieve a course
* [getLmsInstructor](docs/sdks/lms/README.md#getlmsinstructor) - Retrieve an instructor
* [getLmsStudent](docs/sdks/lms/README.md#getlmsstudent) - Retrieve a student
* [listLmsClasses](docs/sdks/lms/README.md#listlmsclasses) - List all classes
* [listLmsCourses](docs/sdks/lms/README.md#listlmscourses) - List all courses
* [listLmsInstructors](docs/sdks/lms/README.md#listlmsinstructors) - List all instructors
* [listLmsStudents](docs/sdks/lms/README.md#listlmsstudents) - List all students
* [patchLmsClass](docs/sdks/lms/README.md#patchlmsclass) - Update a class
* [patchLmsCourse](docs/sdks/lms/README.md#patchlmscourse) - Update a course
* [patchLmsInstructor](docs/sdks/lms/README.md#patchlmsinstructor) - Update an instructor
* [patchLmsStudent](docs/sdks/lms/README.md#patchlmsstudent) - Update a student
* [removeLmsClass](docs/sdks/lms/README.md#removelmsclass) - Remove a class
* [removeLmsCourse](docs/sdks/lms/README.md#removelmscourse) - Remove a course
* [removeLmsInstructor](docs/sdks/lms/README.md#removelmsinstructor) - Remove an instructor
* [removeLmsStudent](docs/sdks/lms/README.md#removelmsstudent) - Remove a student
* [updateLmsClass](docs/sdks/lms/README.md#updatelmsclass) - Update a class
* [updateLmsCourse](docs/sdks/lms/README.md#updatelmscourse) - Update a course
* [updateLmsInstructor](docs/sdks/lms/README.md#updatelmsinstructor) - Update an instructor
* [updateLmsStudent](docs/sdks/lms/README.md#updatelmsstudent) - Update a student

### [Location](docs/sdks/location/README.md)

* [createCommerceLocation](docs/sdks/location/README.md#createcommercelocation) - Create a location
* [createHrisLocation](docs/sdks/location/README.md#createhrislocation) - Create a location
* [getCommerceLocation](docs/sdks/location/README.md#getcommercelocation) - Retrieve a location
* [getHrisLocation](docs/sdks/location/README.md#gethrislocation) - Retrieve a location
* [listCommerceLocations](docs/sdks/location/README.md#listcommercelocations) - List all locations
* [listHrisLocations](docs/sdks/location/README.md#listhrislocations) - List all locations
* [patchCommerceLocation](docs/sdks/location/README.md#patchcommercelocation) - Update a location
* [patchHrisLocation](docs/sdks/location/README.md#patchhrislocation) - Update a location
* [removeCommerceLocation](docs/sdks/location/README.md#removecommercelocation) - Remove a location
* [removeHrisLocation](docs/sdks/location/README.md#removehrislocation) - Remove a location
* [updateCommerceLocation](docs/sdks/location/README.md#updatecommercelocation) - Update a location
* [updateHrisLocation](docs/sdks/location/README.md#updatehrislocation) - Update a location

### [Login](docs/sdks/login/README.md)

* [getUnifiedIntegrationLogin](docs/sdks/login/README.md#getunifiedintegrationlogin) - Sign in a user

### [Martech](docs/sdks/martech/README.md)

* [createMartechList](docs/sdks/martech/README.md#createmartechlist) - Create a list
* [createMartechMember](docs/sdks/martech/README.md#createmartechmember) - Create a member
* [getMartechList](docs/sdks/martech/README.md#getmartechlist) - Retrieve a list
* [getMartechMember](docs/sdks/martech/README.md#getmartechmember) - Retrieve a member
* [listMartechLists](docs/sdks/martech/README.md#listmartechlists) - List all lists
* [listMartechMembers](docs/sdks/martech/README.md#listmartechmembers) - List all members
* [patchMartechList](docs/sdks/martech/README.md#patchmartechlist) - Update a list
* [patchMartechMember](docs/sdks/martech/README.md#patchmartechmember) - Update a member
* [removeMartechList](docs/sdks/martech/README.md#removemartechlist) - Remove a list
* [removeMartechMember](docs/sdks/martech/README.md#removemartechmember) - Remove a member
* [updateMartechList](docs/sdks/martech/README.md#updatemartechlist) - Update a list
* [updateMartechMember](docs/sdks/martech/README.md#updatemartechmember) - Update a member

### [Member](docs/sdks/member/README.md)

* [createMartechMember](docs/sdks/member/README.md#createmartechmember) - Create a member
* [getMartechMember](docs/sdks/member/README.md#getmartechmember) - Retrieve a member
* [listMartechMembers](docs/sdks/member/README.md#listmartechmembers) - List all members
* [patchMartechMember](docs/sdks/member/README.md#patchmartechmember) - Update a member
* [removeMartechMember](docs/sdks/member/README.md#removemartechmember) - Remove a member
* [updateMartechMember](docs/sdks/member/README.md#updatemartechmember) - Update a member

### [Message](docs/sdks/message/README.md)

* [createMessagingMessage](docs/sdks/message/README.md#createmessagingmessage) - Create a message
* [getMessagingMessage](docs/sdks/message/README.md#getmessagingmessage) - Retrieve a message
* [listMessagingMessages](docs/sdks/message/README.md#listmessagingmessages) - List all messages
* [patchMessagingMessage](docs/sdks/message/README.md#patchmessagingmessage) - Update a message
* [removeMessagingMessage](docs/sdks/message/README.md#removemessagingmessage) - Remove a message
* [updateMessagingMessage](docs/sdks/message/README.md#updatemessagingmessage) - Update a message

### [Messaging](docs/sdks/messaging/README.md)

* [createMessagingMessage](docs/sdks/messaging/README.md#createmessagingmessage) - Create a message
* [getMessagingChannel](docs/sdks/messaging/README.md#getmessagingchannel) - Retrieve a channel
* [getMessagingMessage](docs/sdks/messaging/README.md#getmessagingmessage) - Retrieve a message
* [listMessagingChannels](docs/sdks/messaging/README.md#listmessagingchannels) - List all channels
* [listMessagingMessages](docs/sdks/messaging/README.md#listmessagingmessages) - List all messages
* [patchMessagingEvent](docs/sdks/messaging/README.md#patchmessagingevent) - Update an event
* [patchMessagingMessage](docs/sdks/messaging/README.md#patchmessagingmessage) - Update a message
* [removeMessagingMessage](docs/sdks/messaging/README.md#removemessagingmessage) - Remove a message
* [updateMessagingEvent](docs/sdks/messaging/README.md#updatemessagingevent) - Update an event
* [updateMessagingMessage](docs/sdks/messaging/README.md#updatemessagingmessage) - Update a message

### [Metadata](docs/sdks/metadata/README.md)

* [createMetadataMetadata](docs/sdks/metadata/README.md#createmetadatametadata) - Create a metadata
* [getMetadataMetadata](docs/sdks/metadata/README.md#getmetadatametadata) - Retrieve a metadata
* [listMetadataMetadatas](docs/sdks/metadata/README.md#listmetadatametadatas) - List all metadatas
* [patchMetadataMetadata](docs/sdks/metadata/README.md#patchmetadatametadata) - Update a metadata
* [removeMetadataMetadata](docs/sdks/metadata/README.md#removemetadatametadata) - Remove a metadata
* [updateMetadataMetadata](docs/sdks/metadata/README.md#updatemetadatametadata) - Update a metadata

### [Model](docs/sdks/model/README.md)

* [getGenaiModel](docs/sdks/model/README.md#getgenaimodel) - Retrieve a model
* [listGenaiModels](docs/sdks/model/README.md#listgenaimodels) - List all models

### [Note](docs/sdks/note/README.md)

* [createTicketingNote](docs/sdks/note/README.md#createticketingnote) - Create a note
* [getTicketingNote](docs/sdks/note/README.md#getticketingnote) - Retrieve a note
* [listTicketingNotes](docs/sdks/note/README.md#listticketingnotes) - List all notes
* [patchTicketingNote](docs/sdks/note/README.md#patchticketingnote) - Update a note
* [removeTicketingNote](docs/sdks/note/README.md#removeticketingnote) - Remove a note
* [updateTicketingNote](docs/sdks/note/README.md#updateticketingnote) - Update a note

### [Order](docs/sdks/order/README.md)

* [createAccountingOrder](docs/sdks/order/README.md#createaccountingorder) - Create an order
* [getAccountingOrder](docs/sdks/order/README.md#getaccountingorder) - Retrieve an order
* [listAccountingOrders](docs/sdks/order/README.md#listaccountingorders) - List all orders
* [patchAccountingOrder](docs/sdks/order/README.md#patchaccountingorder) - Update an order
* [removeAccountingOrder](docs/sdks/order/README.md#removeaccountingorder) - Remove an order
* [updateAccountingOrder](docs/sdks/order/README.md#updateaccountingorder) - Update an order

### [Organization](docs/sdks/organization/README.md)

* [createAdsOrganization](docs/sdks/organization/README.md#createadsorganization) - Create an organization
* [createRepoOrganization](docs/sdks/organization/README.md#createrepoorganization) - Create an organization
* [getAccountingOrganization](docs/sdks/organization/README.md#getaccountingorganization) - Retrieve an organization
* [getAdsOrganization](docs/sdks/organization/README.md#getadsorganization) - Retrieve an organization
* [getRepoOrganization](docs/sdks/organization/README.md#getrepoorganization) - Retrieve an organization
* [listAccountingOrganizations](docs/sdks/organization/README.md#listaccountingorganizations) - List all organizations
* [listAdsOrganizations](docs/sdks/organization/README.md#listadsorganizations) - List all organizations
* [listRepoOrganizations](docs/sdks/organization/README.md#listrepoorganizations) - List all organizations
* [patchAdsOrganization](docs/sdks/organization/README.md#patchadsorganization) - Update an organization
* [patchRepoOrganization](docs/sdks/organization/README.md#patchrepoorganization) - Update an organization
* [removeAdsOrganization](docs/sdks/organization/README.md#removeadsorganization) - Remove an organization
* [removeRepoOrganization](docs/sdks/organization/README.md#removerepoorganization) - Remove an organization
* [updateAdsOrganization](docs/sdks/organization/README.md#updateadsorganization) - Update an organization
* [updateRepoOrganization](docs/sdks/organization/README.md#updaterepoorganization) - Update an organization

### [Package](docs/sdks/package/README.md)

* [getVerificationPackage](docs/sdks/package/README.md#getverificationpackage) - Retrieve a package
* [listVerificationPackages](docs/sdks/package/README.md#listverificationpackages) - List all packages

### [Page](docs/sdks/page/README.md)

* [createKmsPage](docs/sdks/page/README.md#createkmspage) - Create a page
* [getKmsPage](docs/sdks/page/README.md#getkmspage) - Retrieve a page
* [listKmsPages](docs/sdks/page/README.md#listkmspages) - List all pages
* [patchKmsPage](docs/sdks/page/README.md#patchkmspage) - Update a page
* [removeKmsPage](docs/sdks/page/README.md#removekmspage) - Remove a page
* [updateKmsPage](docs/sdks/page/README.md#updatekmspage) - Update a page

### [Passthrough](docs/sdks/passthrough/README.md)

* [createPassthroughJson](docs/sdks/passthrough/README.md#createpassthroughjson) - Passthrough POST
* [createPassthroughRaw](docs/sdks/passthrough/README.md#createpassthroughraw) - Passthrough POST
* [listPassthroughs](docs/sdks/passthrough/README.md#listpassthroughs) - Passthrough GET
* [patchPassthroughJson](docs/sdks/passthrough/README.md#patchpassthroughjson) - Passthrough PUT
* [patchPassthroughRaw](docs/sdks/passthrough/README.md#patchpassthroughraw) - Passthrough PUT
* [removePassthrough](docs/sdks/passthrough/README.md#removepassthrough) - Passthrough DELETE
* [updatePassthroughJson](docs/sdks/passthrough/README.md#updatepassthroughjson) - Passthrough PUT
* [updatePassthroughRaw](docs/sdks/passthrough/README.md#updatepassthroughraw) - Passthrough PUT

### [Payment](docs/sdks/payment/README.md)

* [createPaymentLink](docs/sdks/payment/README.md#createpaymentlink) - Create a link
* [createPaymentPayment](docs/sdks/payment/README.md#createpaymentpayment) - Create a payment
* [createPaymentSubscription](docs/sdks/payment/README.md#createpaymentsubscription) - Create a subscription
* [getPaymentLink](docs/sdks/payment/README.md#getpaymentlink) - Retrieve a link
* [getPaymentPayment](docs/sdks/payment/README.md#getpaymentpayment) - Retrieve a payment
* [getPaymentPayout](docs/sdks/payment/README.md#getpaymentpayout) - Retrieve a payout
* [getPaymentRefund](docs/sdks/payment/README.md#getpaymentrefund) - Retrieve a refund
* [getPaymentSubscription](docs/sdks/payment/README.md#getpaymentsubscription) - Retrieve a subscription
* [listPaymentLinks](docs/sdks/payment/README.md#listpaymentlinks) - List all links
* [listPaymentPayments](docs/sdks/payment/README.md#listpaymentpayments) - List all payments
* [listPaymentPayouts](docs/sdks/payment/README.md#listpaymentpayouts) - List all payouts
* [listPaymentRefunds](docs/sdks/payment/README.md#listpaymentrefunds) - List all refunds
* [listPaymentSubscriptions](docs/sdks/payment/README.md#listpaymentsubscriptions) - List all subscriptions
* [patchPaymentLink](docs/sdks/payment/README.md#patchpaymentlink) - Update a link
* [patchPaymentPayment](docs/sdks/payment/README.md#patchpaymentpayment) - Update a payment
* [patchPaymentSubscription](docs/sdks/payment/README.md#patchpaymentsubscription) - Update a subscription
* [removePaymentLink](docs/sdks/payment/README.md#removepaymentlink) - Remove a link
* [removePaymentPayment](docs/sdks/payment/README.md#removepaymentpayment) - Remove a payment
* [removePaymentSubscription](docs/sdks/payment/README.md#removepaymentsubscription) - Remove a subscription
* [updatePaymentLink](docs/sdks/payment/README.md#updatepaymentlink) - Update a link
* [updatePaymentPayment](docs/sdks/payment/README.md#updatepaymentpayment) - Update a payment
* [updatePaymentSubscription](docs/sdks/payment/README.md#updatepaymentsubscription) - Update a subscription

### [Payout](docs/sdks/payout/README.md)

* [getPaymentPayout](docs/sdks/payout/README.md#getpaymentpayout) - Retrieve a payout
* [listPaymentPayouts](docs/sdks/payout/README.md#listpaymentpayouts) - List all payouts

### [Payslip](docs/sdks/payslip/README.md)

* [getHrisPayslip](docs/sdks/payslip/README.md#gethrispayslip) - Retrieve a payslip
* [listHrisPayslips](docs/sdks/payslip/README.md#listhrispayslips) - List all payslips

### [Person](docs/sdks/person/README.md)

* [listEnrichPeople](docs/sdks/person/README.md#listenrichpeople) - Retrieve enrichment information for a person

### [Pipeline](docs/sdks/pipeline/README.md)

* [createCrmPipeline](docs/sdks/pipeline/README.md#createcrmpipeline) - Create a pipeline
* [getCrmPipeline](docs/sdks/pipeline/README.md#getcrmpipeline) - Retrieve a pipeline
* [listCrmPipelines](docs/sdks/pipeline/README.md#listcrmpipelines) - List all pipelines
* [patchCrmPipeline](docs/sdks/pipeline/README.md#patchcrmpipeline) - Update a pipeline
* [removeCrmPipeline](docs/sdks/pipeline/README.md#removecrmpipeline) - Remove a pipeline
* [updateCrmPipeline](docs/sdks/pipeline/README.md#updatecrmpipeline) - Update a pipeline

### [Profitloss](docs/sdks/profitloss/README.md)

* [getAccountingProfitloss](docs/sdks/profitloss/README.md#getaccountingprofitloss) - Retrieve a profitloss
* [listAccountingProfitlosses](docs/sdks/profitloss/README.md#listaccountingprofitlosses) - List all profitlosses

### [Project](docs/sdks/project/README.md)

* [createTaskProject](docs/sdks/project/README.md#createtaskproject) - Create a project
* [getTaskProject](docs/sdks/project/README.md#gettaskproject) - Retrieve a project
* [listTaskProjects](docs/sdks/project/README.md#listtaskprojects) - List all projects
* [patchTaskProject](docs/sdks/project/README.md#patchtaskproject) - Update a project
* [removeTaskProject](docs/sdks/project/README.md#removetaskproject) - Remove a project
* [updateTaskProject](docs/sdks/project/README.md#updatetaskproject) - Update a project

### [Prompt](docs/sdks/prompt/README.md)

* [createGenaiPrompt](docs/sdks/prompt/README.md#creategenaiprompt) - Create a prompt

### [Pullrequest](docs/sdks/pullrequest/README.md)

* [createRepoPullrequest](docs/sdks/pullrequest/README.md#createrepopullrequest) - Create a pullrequest
* [getRepoPullrequest](docs/sdks/pullrequest/README.md#getrepopullrequest) - Retrieve a pullrequest
* [listRepoPullrequests](docs/sdks/pullrequest/README.md#listrepopullrequests) - List all pullrequests
* [patchRepoPullrequest](docs/sdks/pullrequest/README.md#patchrepopullrequest) - Update a pullrequest
* [removeRepoPullrequest](docs/sdks/pullrequest/README.md#removerepopullrequest) - Remove a pullrequest
* [updateRepoPullrequest](docs/sdks/pullrequest/README.md#updaterepopullrequest) - Update a pullrequest

### [Purchaseorder](docs/sdks/purchaseorder/README.md)

* [createAccountingPurchaseorder](docs/sdks/purchaseorder/README.md#createaccountingpurchaseorder) - Create a purchaseorder
* [getAccountingPurchaseorder](docs/sdks/purchaseorder/README.md#getaccountingpurchaseorder) - Retrieve a purchaseorder
* [listAccountingPurchaseorders](docs/sdks/purchaseorder/README.md#listaccountingpurchaseorders) - List all purchaseorders
* [patchAccountingPurchaseorder](docs/sdks/purchaseorder/README.md#patchaccountingpurchaseorder) - Update a purchaseorder
* [removeAccountingPurchaseorder](docs/sdks/purchaseorder/README.md#removeaccountingpurchaseorder) - Remove a purchaseorder
* [updateAccountingPurchaseorder](docs/sdks/purchaseorder/README.md#updateaccountingpurchaseorder) - Update a purchaseorder

### [Recording](docs/sdks/recording/README.md)

* [createUcRecording](docs/sdks/recording/README.md#createucrecording) - Create a recording
* [getCalendarRecording](docs/sdks/recording/README.md#getcalendarrecording) - Retrieve a recording
* [getUcRecording](docs/sdks/recording/README.md#getucrecording) - Retrieve a recording
* [listCalendarRecordings](docs/sdks/recording/README.md#listcalendarrecordings) - List all recordings
* [listUcRecordings](docs/sdks/recording/README.md#listucrecordings) - List all recordings
* [patchUcRecording](docs/sdks/recording/README.md#patchucrecording) - Update a recording
* [removeUcRecording](docs/sdks/recording/README.md#removeucrecording) - Remove a recording
* [updateUcRecording](docs/sdks/recording/README.md#updateucrecording) - Update a recording

### [Refund](docs/sdks/refund/README.md)

* [getPaymentRefund](docs/sdks/refund/README.md#getpaymentrefund) - Retrieve a refund
* [listPaymentRefunds](docs/sdks/refund/README.md#listpaymentrefunds) - List all refunds

### [Repo](docs/sdks/repo/README.md)

* [createRepoBranch](docs/sdks/repo/README.md#createrepobranch) - Create a branch
* [createRepoCommit](docs/sdks/repo/README.md#createrepocommit) - Create a commit
* [createRepoOrganization](docs/sdks/repo/README.md#createrepoorganization) - Create an organization
* [createRepoPullrequest](docs/sdks/repo/README.md#createrepopullrequest) - Create a pullrequest
* [createRepoRepository](docs/sdks/repo/README.md#createreporepository) - Create a repository
* [getRepoBranch](docs/sdks/repo/README.md#getrepobranch) - Retrieve a branch
* [getRepoCommit](docs/sdks/repo/README.md#getrepocommit) - Retrieve a commit
* [getRepoOrganization](docs/sdks/repo/README.md#getrepoorganization) - Retrieve an organization
* [getRepoPullrequest](docs/sdks/repo/README.md#getrepopullrequest) - Retrieve a pullrequest
* [getRepoRepository](docs/sdks/repo/README.md#getreporepository) - Retrieve a repository
* [listRepoBranches](docs/sdks/repo/README.md#listrepobranches) - List all branches
* [listRepoCommits](docs/sdks/repo/README.md#listrepocommits) - List all commits
* [listRepoOrganizations](docs/sdks/repo/README.md#listrepoorganizations) - List all organizations
* [listRepoPullrequests](docs/sdks/repo/README.md#listrepopullrequests) - List all pullrequests
* [listRepoRepositories](docs/sdks/repo/README.md#listreporepositories) - List all repositories
* [patchRepoBranch](docs/sdks/repo/README.md#patchrepobranch) - Update a branch
* [patchRepoCommit](docs/sdks/repo/README.md#patchrepocommit) - Update a commit
* [patchRepoOrganization](docs/sdks/repo/README.md#patchrepoorganization) - Update an organization
* [patchRepoPullrequest](docs/sdks/repo/README.md#patchrepopullrequest) - Update a pullrequest
* [patchRepoRepository](docs/sdks/repo/README.md#patchreporepository) - Update a repository
* [removeRepoBranch](docs/sdks/repo/README.md#removerepobranch) - Remove a branch
* [removeRepoCommit](docs/sdks/repo/README.md#removerepocommit) - Remove a commit
* [removeRepoOrganization](docs/sdks/repo/README.md#removerepoorganization) - Remove an organization
* [removeRepoPullrequest](docs/sdks/repo/README.md#removerepopullrequest) - Remove a pullrequest
* [removeRepoRepository](docs/sdks/repo/README.md#removereporepository) - Remove a repository
* [updateRepoBranch](docs/sdks/repo/README.md#updaterepobranch) - Update a branch
* [updateRepoCommit](docs/sdks/repo/README.md#updaterepocommit) - Update a commit
* [updateRepoOrganization](docs/sdks/repo/README.md#updaterepoorganization) - Update an organization
* [updateRepoPullrequest](docs/sdks/repo/README.md#updaterepopullrequest) - Update a pullrequest
* [updateRepoRepository](docs/sdks/repo/README.md#updatereporepository) - Update a repository

### [Report](docs/sdks/report/README.md)

* [getAccountingReport](docs/sdks/report/README.md#getaccountingreport) - Retrieve a report
* [listAccountingReports](docs/sdks/report/README.md#listaccountingreports) - List all reports
* [listAdsReports](docs/sdks/report/README.md#listadsreports) - List all reports

### [Repository](docs/sdks/repository/README.md)

* [createRepoRepository](docs/sdks/repository/README.md#createreporepository) - Create a repository
* [getRepoRepository](docs/sdks/repository/README.md#getreporepository) - Retrieve a repository
* [listRepoRepositories](docs/sdks/repository/README.md#listreporepositories) - List all repositories
* [patchRepoRepository](docs/sdks/repository/README.md#patchreporepository) - Update a repository
* [removeRepoRepository](docs/sdks/repository/README.md#removereporepository) - Remove a repository
* [updateRepoRepository](docs/sdks/repository/README.md#updatereporepository) - Update a repository

### [Request](docs/sdks/request/README.md)

* [createVerificationRequest](docs/sdks/request/README.md#createverificationrequest) - Create a request
* [getVerificationRequest](docs/sdks/request/README.md#getverificationrequest) - Retrieve a request
* [listVerificationRequests](docs/sdks/request/README.md#listverificationrequests) - List all requests
* [patchVerificationRequest](docs/sdks/request/README.md#patchverificationrequest) - Update a request
* [removeVerificationRequest](docs/sdks/request/README.md#removeverificationrequest) - Remove a request
* [updateVerificationRequest](docs/sdks/request/README.md#updateverificationrequest) - Update a request

### [Review](docs/sdks/review/README.md)

* [createCommerceReview](docs/sdks/review/README.md#createcommercereview) - Create a review
* [getCommerceReview](docs/sdks/review/README.md#getcommercereview) - Retrieve a review
* [listCommerceReviews](docs/sdks/review/README.md#listcommercereviews) - List all reviews
* [patchCommerceReview](docs/sdks/review/README.md#patchcommercereview) - Update a review
* [removeCommerceReview](docs/sdks/review/README.md#removecommercereview) - Remove a review
* [updateCommerceReview](docs/sdks/review/README.md#updatecommercereview) - Update a review

### [Saleschannel](docs/sdks/saleschannel/README.md)

* [createCommerceSaleschannel](docs/sdks/saleschannel/README.md#createcommercesaleschannel) - Create a saleschannel
* [getCommerceSaleschannel](docs/sdks/saleschannel/README.md#getcommercesaleschannel) - Retrieve a saleschannel
* [listCommerceSaleschannels](docs/sdks/saleschannel/README.md#listcommercesaleschannels) - List all saleschannels
* [patchCommerceSaleschannel](docs/sdks/saleschannel/README.md#patchcommercesaleschannel) - Update a saleschannel
* [removeCommerceSaleschannel](docs/sdks/saleschannel/README.md#removecommercesaleschannel) - Remove a saleschannel
* [updateCommerceSaleschannel](docs/sdks/saleschannel/README.md#updatecommercesaleschannel) - Update a saleschannel

### [Salesorder](docs/sdks/salesorder/README.md)

* [createAccountingSalesorder](docs/sdks/salesorder/README.md#createaccountingsalesorder) - Create a salesorder
* [getAccountingSalesorder](docs/sdks/salesorder/README.md#getaccountingsalesorder) - Retrieve a salesorder
* [listAccountingSalesorders](docs/sdks/salesorder/README.md#listaccountingsalesorders) - List all salesorders
* [patchAccountingSalesorder](docs/sdks/salesorder/README.md#patchaccountingsalesorder) - Update a salesorder
* [removeAccountingSalesorder](docs/sdks/salesorder/README.md#removeaccountingsalesorder) - Remove a salesorder
* [updateAccountingSalesorder](docs/sdks/salesorder/README.md#updateaccountingsalesorder) - Update a salesorder

### [Scim](docs/sdks/scim/README.md)

* [createScimGroups](docs/sdks/scim/README.md#createscimgroups) - Create group
* [createScimUsers](docs/sdks/scim/README.md#createscimusers) - Create user
* [getScimGroups](docs/sdks/scim/README.md#getscimgroups) - Get group
* [getScimUsers](docs/sdks/scim/README.md#getscimusers) - Get user
* [listScimGroups](docs/sdks/scim/README.md#listscimgroups) - List groups
* [listScimUsers](docs/sdks/scim/README.md#listscimusers) - List users
* [patchScimGroups](docs/sdks/scim/README.md#patchscimgroups) - Update group
* [patchScimUsers](docs/sdks/scim/README.md#patchscimusers) - Update user
* [removeScimGroups](docs/sdks/scim/README.md#removescimgroups) - Delete group
* [removeScimUsers](docs/sdks/scim/README.md#removescimusers) - Delete user
* [updateScimGroups](docs/sdks/scim/README.md#updatescimgroups) - Update group
* [updateScimUsers](docs/sdks/scim/README.md#updatescimusers) - Update user

### [Scorecard](docs/sdks/scorecard/README.md)

* [createAtsScorecard](docs/sdks/scorecard/README.md#createatsscorecard) - Create a scorecard
* [getAtsScorecard](docs/sdks/scorecard/README.md#getatsscorecard) - Retrieve a scorecard
* [listAtsScorecards](docs/sdks/scorecard/README.md#listatsscorecards) - List all scorecards
* [patchAtsScorecard](docs/sdks/scorecard/README.md#patchatsscorecard) - Update a scorecard
* [removeAtsScorecard](docs/sdks/scorecard/README.md#removeatsscorecard) - Remove a scorecard
* [updateAtsScorecard](docs/sdks/scorecard/README.md#updateatsscorecard) - Update a scorecard

### [Space](docs/sdks/space/README.md)

* [createKmsSpace](docs/sdks/space/README.md#createkmsspace) - Create a space
* [getKmsSpace](docs/sdks/space/README.md#getkmsspace) - Retrieve a space
* [listKmsSpaces](docs/sdks/space/README.md#listkmsspaces) - List all spaces
* [patchKmsSpace](docs/sdks/space/README.md#patchkmsspace) - Update a space
* [removeKmsSpace](docs/sdks/space/README.md#removekmsspace) - Remove a space
* [updateKmsSpace](docs/sdks/space/README.md#updatekmsspace) - Update a space

### [Storage](docs/sdks/storage/README.md)

* [createStorageFile](docs/sdks/storage/README.md#createstoragefile) - Create a file
* [getStorageFile](docs/sdks/storage/README.md#getstoragefile) - Retrieve a file
* [listStorageFiles](docs/sdks/storage/README.md#liststoragefiles) - List all files
* [patchStorageFile](docs/sdks/storage/README.md#patchstoragefile) - Update a file
* [removeStorageFile](docs/sdks/storage/README.md#removestoragefile) - Remove a file
* [updateStorageFile](docs/sdks/storage/README.md#updatestoragefile) - Update a file

### [Student](docs/sdks/student/README.md)

* [createLmsStudent](docs/sdks/student/README.md#createlmsstudent) - Create a student
* [getLmsStudent](docs/sdks/student/README.md#getlmsstudent) - Retrieve a student
* [listLmsStudents](docs/sdks/student/README.md#listlmsstudents) - List all students
* [patchLmsStudent](docs/sdks/student/README.md#patchlmsstudent) - Update a student
* [removeLmsStudent](docs/sdks/student/README.md#removelmsstudent) - Remove a student
* [updateLmsStudent](docs/sdks/student/README.md#updatelmsstudent) - Update a student

### [Subscription](docs/sdks/subscription/README.md)

* [createPaymentSubscription](docs/sdks/subscription/README.md#createpaymentsubscription) - Create a subscription
* [getPaymentSubscription](docs/sdks/subscription/README.md#getpaymentsubscription) - Retrieve a subscription
* [listPaymentSubscriptions](docs/sdks/subscription/README.md#listpaymentsubscriptions) - List all subscriptions
* [patchPaymentSubscription](docs/sdks/subscription/README.md#patchpaymentsubscription) - Update a subscription
* [removePaymentSubscription](docs/sdks/subscription/README.md#removepaymentsubscription) - Remove a subscription
* [updatePaymentSubscription](docs/sdks/subscription/README.md#updatepaymentsubscription) - Update a subscription

### [Task](docs/sdks/task/README.md)

* [createTaskComment](docs/sdks/task/README.md#createtaskcomment) - Create a comment
* [createTaskProject](docs/sdks/task/README.md#createtaskproject) - Create a project
* [createTaskTask](docs/sdks/task/README.md#createtasktask) - Create a task
* [getTaskChange](docs/sdks/task/README.md#gettaskchange) - Retrieve a change
* [getTaskComment](docs/sdks/task/README.md#gettaskcomment) - Retrieve a comment
* [getTaskProject](docs/sdks/task/README.md#gettaskproject) - Retrieve a project
* [getTaskTask](docs/sdks/task/README.md#gettasktask) - Retrieve a task
* [listTaskChanges](docs/sdks/task/README.md#listtaskchanges) - List all changes
* [listTaskComments](docs/sdks/task/README.md#listtaskcomments) - List all comments
* [listTaskProjects](docs/sdks/task/README.md#listtaskprojects) - List all projects
* [listTaskTasks](docs/sdks/task/README.md#listtasktasks) - List all tasks
* [patchTaskComment](docs/sdks/task/README.md#patchtaskcomment) - Update a comment
* [patchTaskProject](docs/sdks/task/README.md#patchtaskproject) - Update a project
* [patchTaskTask](docs/sdks/task/README.md#patchtasktask) - Update a task
* [removeTaskComment](docs/sdks/task/README.md#removetaskcomment) - Remove a comment
* [removeTaskProject](docs/sdks/task/README.md#removetaskproject) - Remove a project
* [removeTaskTask](docs/sdks/task/README.md#removetasktask) - Remove a task
* [updateTaskComment](docs/sdks/task/README.md#updatetaskcomment) - Update a comment
* [updateTaskProject](docs/sdks/task/README.md#updatetaskproject) - Update a project
* [updateTaskTask](docs/sdks/task/README.md#updatetasktask) - Update a task

### [Taxrate](docs/sdks/taxrate/README.md)

* [createAccountingTaxrate](docs/sdks/taxrate/README.md#createaccountingtaxrate) - Create a taxrate
* [getAccountingTaxrate](docs/sdks/taxrate/README.md#getaccountingtaxrate) - Retrieve a taxrate
* [listAccountingTaxrates](docs/sdks/taxrate/README.md#listaccountingtaxrates) - List all taxrates
* [patchAccountingTaxrate](docs/sdks/taxrate/README.md#patchaccountingtaxrate) - Update a taxrate
* [removeAccountingTaxrate](docs/sdks/taxrate/README.md#removeaccountingtaxrate) - Remove a taxrate
* [updateAccountingTaxrate](docs/sdks/taxrate/README.md#updateaccountingtaxrate) - Update a taxrate

### [Ticket](docs/sdks/ticket/README.md)

* [createTicketingTicket](docs/sdks/ticket/README.md#createticketingticket) - Create a ticket
* [getTicketingTicket](docs/sdks/ticket/README.md#getticketingticket) - Retrieve a ticket
* [listTicketingTickets](docs/sdks/ticket/README.md#listticketingtickets) - List all tickets
* [patchTicketingTicket](docs/sdks/ticket/README.md#patchticketingticket) - Update a ticket
* [removeTicketingTicket](docs/sdks/ticket/README.md#removeticketingticket) - Remove a ticket
* [updateTicketingTicket](docs/sdks/ticket/README.md#updateticketingticket) - Update a ticket

### [Ticketing](docs/sdks/ticketing/README.md)

* [createTicketingCategory](docs/sdks/ticketing/README.md#createticketingcategory) - Create a category
* [createTicketingCustomer](docs/sdks/ticketing/README.md#createticketingcustomer) - Create a customer
* [createTicketingNote](docs/sdks/ticketing/README.md#createticketingnote) - Create a note
* [createTicketingTicket](docs/sdks/ticketing/README.md#createticketingticket) - Create a ticket
* [getTicketingCategory](docs/sdks/ticketing/README.md#getticketingcategory) - Retrieve a category
* [getTicketingCustomer](docs/sdks/ticketing/README.md#getticketingcustomer) - Retrieve a customer
* [getTicketingNote](docs/sdks/ticketing/README.md#getticketingnote) - Retrieve a note
* [getTicketingTicket](docs/sdks/ticketing/README.md#getticketingticket) - Retrieve a ticket
* [listTicketingCategories](docs/sdks/ticketing/README.md#listticketingcategories) - List all categories
* [listTicketingCustomers](docs/sdks/ticketing/README.md#listticketingcustomers) - List all customers
* [listTicketingNotes](docs/sdks/ticketing/README.md#listticketingnotes) - List all notes
* [listTicketingTickets](docs/sdks/ticketing/README.md#listticketingtickets) - List all tickets
* [patchTicketingCategory](docs/sdks/ticketing/README.md#patchticketingcategory) - Update a category
* [patchTicketingCustomer](docs/sdks/ticketing/README.md#patchticketingcustomer) - Update a customer
* [patchTicketingNote](docs/sdks/ticketing/README.md#patchticketingnote) - Update a note
* [patchTicketingTicket](docs/sdks/ticketing/README.md#patchticketingticket) - Update a ticket
* [removeTicketingCategory](docs/sdks/ticketing/README.md#removeticketingcategory) - Remove a category
* [removeTicketingCustomer](docs/sdks/ticketing/README.md#removeticketingcustomer) - Remove a customer
* [removeTicketingNote](docs/sdks/ticketing/README.md#removeticketingnote) - Remove a note
* [removeTicketingTicket](docs/sdks/ticketing/README.md#removeticketingticket) - Remove a ticket
* [updateTicketingCategory](docs/sdks/ticketing/README.md#updateticketingcategory) - Update a category
* [updateTicketingCustomer](docs/sdks/ticketing/README.md#updateticketingcustomer) - Update a customer
* [updateTicketingNote](docs/sdks/ticketing/README.md#updateticketingnote) - Update a note
* [updateTicketingTicket](docs/sdks/ticketing/README.md#updateticketingticket) - Update a ticket

### [Timeoff](docs/sdks/timeoff/README.md)

* [getHrisTimeoff](docs/sdks/timeoff/README.md#gethristimeoff) - Retrieve a timeoff
* [listHrisTimeoffs](docs/sdks/timeoff/README.md#listhristimeoffs) - List all timeoffs

### [Timeshift](docs/sdks/timeshift/README.md)

* [createHrisTimeshift](docs/sdks/timeshift/README.md#createhristimeshift) - Create a timeshift
* [getHrisTimeshift](docs/sdks/timeshift/README.md#gethristimeshift) - Retrieve a timeshift
* [listHrisTimeshifts](docs/sdks/timeshift/README.md#listhristimeshifts) - List all timeshifts
* [patchHrisTimeshift](docs/sdks/timeshift/README.md#patchhristimeshift) - Update a timeshift
* [removeHrisTimeshift](docs/sdks/timeshift/README.md#removehristimeshift) - Remove a timeshift
* [updateHrisTimeshift](docs/sdks/timeshift/README.md#updatehristimeshift) - Update a timeshift

### [Transaction](docs/sdks/transaction/README.md)

* [createAccountingTransaction](docs/sdks/transaction/README.md#createaccountingtransaction) - Create a transaction
* [getAccountingTransaction](docs/sdks/transaction/README.md#getaccountingtransaction) - Retrieve a transaction
* [listAccountingTransactions](docs/sdks/transaction/README.md#listaccountingtransactions) - List all transactions
* [patchAccountingTransaction](docs/sdks/transaction/README.md#patchaccountingtransaction) - Update a transaction
* [removeAccountingTransaction](docs/sdks/transaction/README.md#removeaccountingtransaction) - Remove a transaction
* [updateAccountingTransaction](docs/sdks/transaction/README.md#updateaccountingtransaction) - Update a transaction

### [Trialbalance](docs/sdks/trialbalance/README.md)

* [getAccountingTrialbalance](docs/sdks/trialbalance/README.md#getaccountingtrialbalance) - Retrieve a trialbalance
* [listAccountingTrialbalances](docs/sdks/trialbalance/README.md#listaccountingtrialbalances) - List all trialbalances

### [Uc](docs/sdks/uc/README.md)

* [createUcComment](docs/sdks/uc/README.md#createuccomment) - Create a comment
* [createUcContact](docs/sdks/uc/README.md#createuccontact) - Create a contact
* [createUcRecording](docs/sdks/uc/README.md#createucrecording) - Create a recording
* [getUcCall](docs/sdks/uc/README.md#getuccall) - Retrieve a call
* [getUcComment](docs/sdks/uc/README.md#getuccomment) - Retrieve a comment
* [getUcContact](docs/sdks/uc/README.md#getuccontact) - Retrieve a contact
* [getUcRecording](docs/sdks/uc/README.md#getucrecording) - Retrieve a recording
* [listUcCalls](docs/sdks/uc/README.md#listuccalls) - List all calls
* [listUcComments](docs/sdks/uc/README.md#listuccomments) - List all comments
* [listUcContacts](docs/sdks/uc/README.md#listuccontacts) - List all contacts
* [listUcRecordings](docs/sdks/uc/README.md#listucrecordings) - List all recordings
* [patchUcComment](docs/sdks/uc/README.md#patchuccomment) - Update a comment
* [patchUcContact](docs/sdks/uc/README.md#patchuccontact) - Update a contact
* [patchUcRecording](docs/sdks/uc/README.md#patchucrecording) - Update a recording
* [removeUcComment](docs/sdks/uc/README.md#removeuccomment) - Remove a comment
* [removeUcContact](docs/sdks/uc/README.md#removeuccontact) - Remove a contact
* [removeUcRecording](docs/sdks/uc/README.md#removeucrecording) - Remove a recording
* [updateUcComment](docs/sdks/uc/README.md#updateuccomment) - Update a comment
* [updateUcContact](docs/sdks/uc/README.md#updateuccontact) - Update a contact
* [updateUcRecording](docs/sdks/uc/README.md#updateucrecording) - Update a recording

### [Unified](docs/sdks/unified/README.md)

* [createUnifiedConnection](docs/sdks/unified/README.md#createunifiedconnection) - Create connection
* [createUnifiedEnvironment](docs/sdks/unified/README.md#createunifiedenvironment)
* [createUnifiedWebhook](docs/sdks/unified/README.md#createunifiedwebhook) - Create webhook subscription
* [getUnifiedApicall](docs/sdks/unified/README.md#getunifiedapicall) - Retrieve specific API Call by its ID
* [getUnifiedConnection](docs/sdks/unified/README.md#getunifiedconnection) - Retrieve connection
* [getUnifiedIntegrationAuth](docs/sdks/unified/README.md#getunifiedintegrationauth) - Authorize new connection
* [getUnifiedIssue](docs/sdks/unified/README.md#getunifiedissue) - Retrieve support issue
* [getUnifiedWebhook](docs/sdks/unified/README.md#getunifiedwebhook) - Retrieve webhook by its ID
* [listUnifiedApicalls](docs/sdks/unified/README.md#listunifiedapicalls) - Returns API Calls
* [listUnifiedConnections](docs/sdks/unified/README.md#listunifiedconnections) - List all connections
* [listUnifiedEnvironments](docs/sdks/unified/README.md#listunifiedenvironments)
* [listUnifiedIntegrationWorkspaces](docs/sdks/unified/README.md#listunifiedintegrationworkspaces) - Returns all activated integrations in a workspace
* [listUnifiedIntegrations](docs/sdks/unified/README.md#listunifiedintegrations) - Returns all integrations
* [listUnifiedIssues](docs/sdks/unified/README.md#listunifiedissues) - List support issues
* [listUnifiedWebhooks](docs/sdks/unified/README.md#listunifiedwebhooks) - Returns all registered webhooks
* [patchUnifiedConnection](docs/sdks/unified/README.md#patchunifiedconnection) - Update connection
* [patchUnifiedWebhook](docs/sdks/unified/README.md#patchunifiedwebhook) - Update webhook subscription
* [patchUnifiedWebhookTrigger](docs/sdks/unified/README.md#patchunifiedwebhooktrigger) - Trigger webhook
* [removeUnifiedConnection](docs/sdks/unified/README.md#removeunifiedconnection) - Remove connection
* [removeUnifiedEnvironment](docs/sdks/unified/README.md#removeunifiedenvironment)
* [removeUnifiedWebhook](docs/sdks/unified/README.md#removeunifiedwebhook) - Remove webhook subscription
* [updateUnifiedConnection](docs/sdks/unified/README.md#updateunifiedconnection) - Update connection
* [updateUnifiedWebhook](docs/sdks/unified/README.md#updateunifiedwebhook) - Update webhook subscription
* [updateUnifiedWebhookTrigger](docs/sdks/unified/README.md#updateunifiedwebhooktrigger) - Trigger webhook

### [User](docs/sdks/user/README.md)

* [createScimUsers](docs/sdks/user/README.md#createscimusers) - Create user
* [getScimUsers](docs/sdks/user/README.md#getscimusers) - Get user
* [listScimUsers](docs/sdks/user/README.md#listscimusers) - List users
* [patchScimUsers](docs/sdks/user/README.md#patchscimusers) - Update user
* [removeScimUsers](docs/sdks/user/README.md#removescimusers) - Delete user
* [updateScimUsers](docs/sdks/user/README.md#updatescimusers) - Update user

### [Verification](docs/sdks/verification/README.md)

* [createVerificationRequest](docs/sdks/verification/README.md#createverificationrequest) - Create a request
* [getVerificationPackage](docs/sdks/verification/README.md#getverificationpackage) - Retrieve a package
* [getVerificationRequest](docs/sdks/verification/README.md#getverificationrequest) - Retrieve a request
* [listVerificationPackages](docs/sdks/verification/README.md#listverificationpackages) - List all packages
* [listVerificationRequests](docs/sdks/verification/README.md#listverificationrequests) - List all requests
* [patchVerificationRequest](docs/sdks/verification/README.md#patchverificationrequest) - Update a request
* [removeVerificationRequest](docs/sdks/verification/README.md#removeverificationrequest) - Remove a request
* [updateVerificationRequest](docs/sdks/verification/README.md#updateverificationrequest) - Update a request

### [Webhook](docs/sdks/webhook/README.md)

* [createUnifiedWebhook](docs/sdks/webhook/README.md#createunifiedwebhook) - Create webhook subscription
* [getUnifiedWebhook](docs/sdks/webhook/README.md#getunifiedwebhook) - Retrieve webhook by its ID
* [listUnifiedWebhooks](docs/sdks/webhook/README.md#listunifiedwebhooks) - Returns all registered webhooks
* [patchUnifiedWebhook](docs/sdks/webhook/README.md#patchunifiedwebhook) - Update webhook subscription
* [patchUnifiedWebhookTrigger](docs/sdks/webhook/README.md#patchunifiedwebhooktrigger) - Trigger webhook
* [removeUnifiedWebhook](docs/sdks/webhook/README.md#removeunifiedwebhook) - Remove webhook subscription
* [updateUnifiedWebhook](docs/sdks/webhook/README.md#updateunifiedwebhook) - Update webhook subscription
* [updateUnifiedWebhookTrigger](docs/sdks/webhook/README.md#updateunifiedwebhooktrigger) - Trigger webhook

</details>
<!-- End Available Resources and Operations [operations] -->



<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally using the `.serverIndex(int serverIdx)` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| #   | Server                      | Description                |
| --- | --------------------------- | -------------------------- |
| 0   | `https://api.unified.to`    | North American data region |
| 1   | `https://api-eu.unified.to` | European data region       |
| 2   | `https://api-au.unified.to` | Australian data region     |

#### Example

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccountRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccountResponse;
import to.unified.unified_java_sdk.models.shared.AccountingAccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .serverIndex(0)
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingAccountRequest req = CreateAccountingAccountRequest.builder()
                .accountingAccount(AccountingAccount.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingAccountResponse res = sdk.accounting().createAccountingAccount()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccountRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccountResponse;
import to.unified.unified_java_sdk.models.shared.AccountingAccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .serverURL("https://api-au.unified.to")
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingAccountRequest req = CreateAccountingAccountRequest.builder()
                .accountingAccount(AccountingAccount.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingAccountResponse res = sdk.accounting().createAccountingAccount()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.


[`UnifiedToError`](./src/main/java/models/errors/UnifiedToError.java) is the base class for all HTTP error responses. It has the following properties:

| Method           | Type                        | Description                                                              |
| ---------------- | --------------------------- | ------------------------------------------------------------------------ |
| `message()`      | `String`                    | Error message                                                            |
| `code()`         | `int`                       | HTTP response status code eg `404`                                       |
| `headers`        | `Map<String, List<String>>` | HTTP response headers                                                    |
| `body()`         | `byte[]`                    | HTTP body as a byte array. Can be empty array if no body is returned.    |
| `bodyAsString()` | `String`                    | HTTP body as a UTF-8 string. Can be empty string if no body is returned. |
| `rawResponse()`  | `HttpResponse<?>`           | Raw HTTP response (body already read and not available for re-read)      |

### Example
```java
package hello.world;

import java.io.UncheckedIOException;
import java.lang.Exception;
import java.util.Optional;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.errors.UnifiedToError;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccountRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccountResponse;
import to.unified.unified_java_sdk.models.shared.AccountingAccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();
        try {

            CreateAccountingAccountRequest req = CreateAccountingAccountRequest.builder()
                    .accountingAccount(AccountingAccount.builder()
                        .build())
                    .connectionId("<id>")
                    .build();

            CreateAccountingAccountResponse res = sdk.accounting().createAccountingAccount()
                    .request(req)
                    .call();

            if (res.accountingAccount().isPresent()) {
                // handle response
            }
        } catch (UnifiedToError ex) { // all SDK exceptions inherit from UnifiedToError

            // ex.ToString() provides a detailed error message including
            // HTTP status code, headers, and error payload (if any)
            System.out.println(ex);

            // Base exception fields
            var rawResponse = ex.rawResponse();
            var headers = ex.headers();
            var contentType = headers.first("Content-Type");
            int statusCode = ex.code();
            Optional<byte[]> responseBody = ex.body();
        } catch (UncheckedIOException ex) {
            // handle IO error (connection, timeout, etc)
        }    }
}
```

### Error Classes
**Primary error:**
* [`UnifiedToError`](./src/main/java/models/errors/UnifiedToError.java): The base class for HTTP error responses.

<details><summary>Less common errors (6)</summary>

<br />

**Network errors:**
* `java.io.IOException` (always wrapped by `java.io.UncheckedIOException`). Commonly encountered subclasses of
`IOException` include `java.net.ConnectException`, `java.net.SocketTimeoutException`, `EOFException` (there are
many more subclasses in the JDK platform).

**Inherit from [`UnifiedToError`](./src/main/java/models/errors/UnifiedToError.java)**:


</details>
<!-- End Error Handling [errors] -->

<!-- Start Asynchronous Support [async-support] -->
## Asynchronous Support

The SDK provides comprehensive asynchronous support using Java's [`CompletableFuture<T>`][comp-fut] and [Reactive Streams `Publisher<T>`][reactive-streams] APIs. This design makes no assumptions about your choice of reactive toolkit, allowing seamless integration with any reactive library.

<details>
<summary>Why Use Async?</summary>

Asynchronous operations provide several key benefits:

- **Non-blocking I/O**: Your threads stay free for other work while operations are in flight
- **Better resource utilization**: Handle more concurrent operations with fewer threads
- **Improved scalability**: Build highly responsive applications that can handle thousands of concurrent requests
- **Reactive integration**: Works seamlessly with reactive streams and backpressure handling

</details>

<details>
<summary>Reactive Library Integration</summary>

The SDK returns [Reactive Streams `Publisher<T>`][reactive-streams] instances for operations dealing with streams involving multiple I/O interactions. We use Reactive Streams instead of JDK Flow API to provide broader compatibility with the reactive ecosystem, as most reactive libraries natively support Reactive Streams.

**Why Reactive Streams over JDK Flow?**
- **Broader ecosystem compatibility**: Most reactive libraries (Project Reactor, RxJava, Akka Streams, etc.) natively support Reactive Streams
- **Industry standard**: Reactive Streams is the de facto standard for reactive programming in Java
- **Better interoperability**: Seamless integration without additional adapters for most use cases

**Integration with Popular Libraries:**
- **Project Reactor**: Use `Flux.from(publisher)` to convert to Reactor types
- **RxJava**: Use `Flowable.fromPublisher(publisher)` for RxJava integration
- **Akka Streams**: Use `Source.fromPublisher(publisher)` for Akka Streams integration
- **Vert.x**: Use `ReadStream.fromPublisher(vertx, publisher)` for Vert.x reactive streams
- **Mutiny**: Use `Multi.createFrom().publisher(publisher)` for Quarkus Mutiny integration

**For JDK Flow API Integration:**
If you need JDK Flow API compatibility (e.g., for Quarkus/Mutiny 2), you can use adapters:
```java
// Convert Reactive Streams Publisher to Flow Publisher
Flow.Publisher<T> flowPublisher = FlowAdapters.toFlowPublisher(reactiveStreamsPublisher);

// Convert Flow Publisher to Reactive Streams Publisher
Publisher<T> reactiveStreamsPublisher = FlowAdapters.toPublisher(flowPublisher);
```

For standard single-response operations, the SDK returns `CompletableFuture<T>` for straightforward async execution.

</details>

<details>
<summary>Supported Operations</summary>

Async support is available for:

- **[Server-sent Events](#server-sent-event-streaming)**: Stream real-time events with Reactive Streams `Publisher<T>`
- **[JSONL Streaming](#jsonl-streaming)**: Process streaming JSON lines asynchronously
- **[Pagination](#pagination)**: Iterate through paginated results using `callAsPublisher()` and `callAsPublisherUnwrapped()`
- **[File Uploads](#file-uploads)**: Upload files asynchronously with progress tracking
- **[File Downloads](#file-downloads)**: Download files asynchronously with streaming support
- **[Standard Operations](#example)**: All regular API calls return `CompletableFuture<T>` for async execution

</details>

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html
[reactive-streams]: https://www.reactive-streams.org/
<!-- End Asynchronous Support [async-support] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name  | Type   | Scheme  |
| ----- | ------ | ------- |
| `jwt` | apiKey | API key |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccountRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccountResponse;
import to.unified.unified_java_sdk.models.shared.AccountingAccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingAccountRequest req = CreateAccountingAccountRequest.builder()
                .accountingAccount(AccountingAccount.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingAccountResponse res = sdk.accounting().createAccountingAccount()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Authentication [security] -->

<!-- Start Custom HTTP Client [http-client] -->
## Custom HTTP Client

The Java SDK makes API calls using an `HTTPClient` that wraps the native
[HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html). This
client provides the ability to attach hooks around the request lifecycle that can be used to modify the request or handle
errors and response.

The `HTTPClient` interface allows you to either use the default `SpeakeasyHTTPClient` that comes with the SDK,
or provide your own custom implementation with customized configuration such as custom executors, SSL context,
connection pools, and other HTTP client settings.

The interface provides synchronous (`send`) methods and asynchronous (`sendAsync`) methods. The `sendAsync` method
is used to power the async SDK methods and returns a `CompletableFuture<HttpResponse<Blob>>` for non-blocking operations.

The following example shows how to add a custom header and handle errors:

```java
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.utils.HTTPClient;
import to.unified.unified_java_sdk.utils.SpeakeasyHTTPClient;
import to.unified.unified_java_sdk.utils.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;

public class Application {
    public static void main(String[] args) {
        // Create a custom HTTP client with hooks
        HTTPClient httpClient = new HTTPClient() {
            private final HTTPClient defaultClient = new SpeakeasyHTTPClient();
            
            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                // Add custom header and timeout using Utils.copy()
                HttpRequest modifiedRequest = Utils.copy(request)
                    .header("x-custom-header", "custom value")
                    .timeout(Duration.ofSeconds(30))
                    .build();
                    
                try {
                    HttpResponse<InputStream> response = defaultClient.send(modifiedRequest);
                    // Log successful response
                    System.out.println("Request successful: " + response.statusCode());
                    return response;
                } catch (Exception error) {
                    // Log error
                    System.err.println("Request failed: " + error.getMessage());
                    throw error;
                }
            }
        };

        UnifiedTo sdk = UnifiedTo.builder()
            .client(httpClient)
            .build();
    }
}
```

<details>
<summary>Custom HTTP Client Configuration</summary>

You can also provide a completely custom HTTP client with your own configuration:

```java
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.utils.HTTPClient;
import to.unified.unified_java_sdk.utils.Blob;
import to.unified.unified_java_sdk.utils.ResponseWithBody;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.CompletableFuture;

public class Application {
    public static void main(String[] args) {
        // Custom HTTP client with custom configuration
        HTTPClient customHttpClient = new HTTPClient() {
            private final HttpClient client = HttpClient.newBuilder()
                .executor(Executors.newFixedThreadPool(10))
                .connectTimeout(Duration.ofSeconds(30))
                // .sslContext(customSslContext) // Add custom SSL context if needed
                .build();

            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                return client.send(request, HttpResponse.BodyHandlers.ofInputStream());
            }

            @Override
            public CompletableFuture<HttpResponse<Blob>> sendAsync(HttpRequest request) {
                // Convert response to HttpResponse<Blob> for async operations
                return client.sendAsync(request, HttpResponse.BodyHandlers.ofPublisher())
                    .thenApply(resp -> new ResponseWithBody<>(resp, Blob::from));
            }
        };

        UnifiedTo sdk = UnifiedTo.builder()
            .client(customHttpClient)
            .build();
    }
}
```

</details>

You can also enable debug logging on the default `SpeakeasyHTTPClient`:

```java
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.utils.SpeakeasyHTTPClient;

public class Application {
    public static void main(String[] args) {
        SpeakeasyHTTPClient httpClient = new SpeakeasyHTTPClient();
        httpClient.enableDebugLogging(true);

        UnifiedTo sdk = UnifiedTo.builder()
            .client(httpClient)
            .build();
    }
}
```
<!-- End Custom HTTP Client [http-client] -->

<!-- Start Debugging [debug] -->
## Debugging

### Debug

You can setup your SDK to emit debug logs for SDK requests and responses.

For request and response logging (especially json bodies), call `enableHTTPDebugLogging(boolean)` on the SDK builder like so:

```java
SDK.builder()
    .enableHTTPDebugLogging(true)
    .build();
```
Example output:
```
Sending request: http://localhost:35123/bearer#global GET
Request headers: {Accept=[application/json], Authorization=[******], Client-Level-Header=[added by client], Idempotency-Key=[some-key], x-speakeasy-user-agent=[speakeasy-sdk/java 0.0.1 internal 0.1.0 org.openapis.openapi]}
Received response: (GET http://localhost:35123/bearer#global) 200
Response headers: {access-control-allow-credentials=[true], access-control-allow-origin=[*], connection=[keep-alive], content-length=[50], content-type=[application/json], date=[Wed, 09 Apr 2025 01:43:29 GMT], server=[gunicorn/19.9.0]}
Response body:
{
  "authenticated": true, 
  "token": "global"
}
```
__WARNING__: This logging should only be used for temporary debugging purposes. Leaving this option on in a production system could expose credentials/secrets in logs. <i>Authorization</i> headers are redacted by default and there is the ability to specify redacted header names via `SpeakeasyHTTPClient.setRedactedHeaders`.

__NOTE__: This is a convenience method that calls `HTTPClient.enableDebugLogging()`. The `SpeakeasyHTTPClient` honors this setting. If you are using a custom HTTP client, it is up to the custom client to honor this setting.


Another option is to set the System property `-Djdk.httpclient.HttpClient.log=all`. However, this second option does not log bodies.
<!-- End Debugging [debug] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
