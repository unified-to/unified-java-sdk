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
  * [Jackson Configuration](#jackson-configuration)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'to.unified:unified-java-sdk:0.47.32'
```

Maven:
```xml
<dependency>
    <groupId>to.unified</groupId>
    <artifactId>unified-java-sdk</artifactId>
    <version>0.47.32</version>
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
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccount2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccount2Response;
import to.unified.unified_java_sdk.models.shared.AccountingAccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingAccount2Request req = CreateAccountingAccount2Request.builder()
                .accountingAccount(AccountingAccount.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingAccount2Response res = sdk.accounting().createAccountingAccount2()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            System.out.println(res.accountingAccount().get());
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
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccount2Request;
import to.unified.unified_java_sdk.models.operations.async.CreateAccountingAccount2Response;
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

        CreateAccountingAccount2Request req = CreateAccountingAccount2Request.builder()
                .accountingAccount(AccountingAccount.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CompletableFuture<CreateAccountingAccount2Response> resFut = sdk.accounting().createAccountingAccount2()
                .request(req)
                .call();

        resFut.thenAccept(res -> {
            if (res.accountingAccount().isPresent()) {
                System.out.println(res.accountingAccount().get());
            }
        });
    }
}
```

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html

#### Union Consumption Patterns

When a response field is a union model:

- Discriminated unions: branch on the discriminator (`switch`) and then narrow to the concrete type.
- Non-discriminated unions: use generated accessors (for example `string()`, `asLong()`, `simpleObject()`) to determine the active variant.

For full model-specific examples (including Java 11/16/21 variants), see each union model's **Supported Types** section in the generated model docs.
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [Account](docs/sdks/account/README.md)

* [createAccountingAccount2](docs/sdks/account/README.md#createaccountingaccount2) - Create an account
* [getAccountingAccount2](docs/sdks/account/README.md#getaccountingaccount2) - Retrieve an account
* [listAccountingAccounts2](docs/sdks/account/README.md#listaccountingaccounts2) - List all accounts
* [patchAccountingAccount2](docs/sdks/account/README.md#patchaccountingaccount2) - Update an account
* [removeAccountingAccount2](docs/sdks/account/README.md#removeaccountingaccount2) - Remove an account
* [updateAccountingAccount2](docs/sdks/account/README.md#updateaccountingaccount2) - Update an account

### [Accounting](docs/sdks/accounting/README.md)

* [createAccountingAccount2](docs/sdks/accounting/README.md#createaccountingaccount2) - Create an account
* [createAccountingBill2](docs/sdks/accounting/README.md#createaccountingbill2) - Create a bill
* [createAccountingCategory2](docs/sdks/accounting/README.md#createaccountingcategory2) - Create a category
* [createAccountingContact2](docs/sdks/accounting/README.md#createaccountingcontact2) - Create a contact
* [createAccountingCreditmemo2](docs/sdks/accounting/README.md#createaccountingcreditmemo2) - Create a creditmemo
* [createAccountingExpense2](docs/sdks/accounting/README.md#createaccountingexpense2) - Create an expense
* [createAccountingInvoice2](docs/sdks/accounting/README.md#createaccountinginvoice2) - Create an invoice
* [createAccountingJournal2](docs/sdks/accounting/README.md#createaccountingjournal2) - Create a journal
* [createAccountingOrder2](docs/sdks/accounting/README.md#createaccountingorder2) - Create an order
* [createAccountingPurchaseorder2](docs/sdks/accounting/README.md#createaccountingpurchaseorder2) - Create a purchaseorder
* [createAccountingSalesorder2](docs/sdks/accounting/README.md#createaccountingsalesorder2) - Create a salesorder
* [createAccountingTaxrate2](docs/sdks/accounting/README.md#createaccountingtaxrate2) - Create a taxrate
* [createAccountingTransaction2](docs/sdks/accounting/README.md#createaccountingtransaction2) - Create a transaction
* [getAccountingAccount2](docs/sdks/accounting/README.md#getaccountingaccount2) - Retrieve an account
* [getAccountingBalancesheet2](docs/sdks/accounting/README.md#getaccountingbalancesheet2) - Retrieve a balancesheet
* [getAccountingBill2](docs/sdks/accounting/README.md#getaccountingbill2) - Retrieve a bill
* [getAccountingCashflow2](docs/sdks/accounting/README.md#getaccountingcashflow2) - Retrieve a cashflow
* [getAccountingCategory2](docs/sdks/accounting/README.md#getaccountingcategory2) - Retrieve a category
* [getAccountingContact2](docs/sdks/accounting/README.md#getaccountingcontact2) - Retrieve a contact
* [getAccountingCreditmemo2](docs/sdks/accounting/README.md#getaccountingcreditmemo2) - Retrieve a creditmemo
* [getAccountingExpense2](docs/sdks/accounting/README.md#getaccountingexpense2) - Retrieve an expense
* [getAccountingInvoice2](docs/sdks/accounting/README.md#getaccountinginvoice2) - Retrieve an invoice
* [getAccountingJournal2](docs/sdks/accounting/README.md#getaccountingjournal2) - Retrieve a journal
* [getAccountingOrder2](docs/sdks/accounting/README.md#getaccountingorder2) - Retrieve an order
* [getAccountingOrganization2](docs/sdks/accounting/README.md#getaccountingorganization2) - Retrieve an organization
* [getAccountingProfitloss2](docs/sdks/accounting/README.md#getaccountingprofitloss2) - Retrieve a profitloss
* [getAccountingPurchaseorder2](docs/sdks/accounting/README.md#getaccountingpurchaseorder2) - Retrieve a purchaseorder
* [getAccountingReport2](docs/sdks/accounting/README.md#getaccountingreport2) - Retrieve a report
* [getAccountingSalesorder2](docs/sdks/accounting/README.md#getaccountingsalesorder2) - Retrieve a salesorder
* [getAccountingTaxrate2](docs/sdks/accounting/README.md#getaccountingtaxrate2) - Retrieve a taxrate
* [getAccountingTransaction2](docs/sdks/accounting/README.md#getaccountingtransaction2) - Retrieve a transaction
* [getAccountingTrialbalance2](docs/sdks/accounting/README.md#getaccountingtrialbalance2) - Retrieve a trialbalance
* [listAccountingAccounts2](docs/sdks/accounting/README.md#listaccountingaccounts2) - List all accounts
* [listAccountingBalancesheets2](docs/sdks/accounting/README.md#listaccountingbalancesheets2) - List all balancesheets
* [listAccountingBills2](docs/sdks/accounting/README.md#listaccountingbills2) - List all bills
* [listAccountingCashflows2](docs/sdks/accounting/README.md#listaccountingcashflows2) - List all cashflows
* [listAccountingCategories2](docs/sdks/accounting/README.md#listaccountingcategories2) - List all categories
* [listAccountingContacts2](docs/sdks/accounting/README.md#listaccountingcontacts2) - List all contacts
* [listAccountingCreditmemoes2](docs/sdks/accounting/README.md#listaccountingcreditmemoes2) - List all creditmemoes
* [listAccountingExpenses2](docs/sdks/accounting/README.md#listaccountingexpenses2) - List all expenses
* [listAccountingInvoices2](docs/sdks/accounting/README.md#listaccountinginvoices2) - List all invoices
* [listAccountingJournals2](docs/sdks/accounting/README.md#listaccountingjournals2) - List all journals
* [listAccountingOrders2](docs/sdks/accounting/README.md#listaccountingorders2) - List all orders
* [listAccountingOrganizations2](docs/sdks/accounting/README.md#listaccountingorganizations2) - List all organizations
* [listAccountingProfitlosses2](docs/sdks/accounting/README.md#listaccountingprofitlosses2) - List all profitlosses
* [listAccountingPurchaseorders2](docs/sdks/accounting/README.md#listaccountingpurchaseorders2) - List all purchaseorders
* [listAccountingReports2](docs/sdks/accounting/README.md#listaccountingreports2) - List all reports
* [listAccountingSalesorders2](docs/sdks/accounting/README.md#listaccountingsalesorders2) - List all salesorders
* [listAccountingTaxrates2](docs/sdks/accounting/README.md#listaccountingtaxrates2) - List all taxrates
* [listAccountingTransactions2](docs/sdks/accounting/README.md#listaccountingtransactions2) - List all transactions
* [listAccountingTrialbalances2](docs/sdks/accounting/README.md#listaccountingtrialbalances2) - List all trialbalances
* [patchAccountingAccount2](docs/sdks/accounting/README.md#patchaccountingaccount2) - Update an account
* [patchAccountingBill2](docs/sdks/accounting/README.md#patchaccountingbill2) - Update a bill
* [patchAccountingCategory2](docs/sdks/accounting/README.md#patchaccountingcategory2) - Update a category
* [patchAccountingContact2](docs/sdks/accounting/README.md#patchaccountingcontact2) - Update a contact
* [patchAccountingCreditmemo2](docs/sdks/accounting/README.md#patchaccountingcreditmemo2) - Update a creditmemo
* [patchAccountingExpense2](docs/sdks/accounting/README.md#patchaccountingexpense2) - Update an expense
* [patchAccountingInvoice2](docs/sdks/accounting/README.md#patchaccountinginvoice2) - Update an invoice
* [patchAccountingJournal2](docs/sdks/accounting/README.md#patchaccountingjournal2) - Update a journal
* [patchAccountingOrder2](docs/sdks/accounting/README.md#patchaccountingorder2) - Update an order
* [patchAccountingPurchaseorder2](docs/sdks/accounting/README.md#patchaccountingpurchaseorder2) - Update a purchaseorder
* [patchAccountingSalesorder2](docs/sdks/accounting/README.md#patchaccountingsalesorder2) - Update a salesorder
* [patchAccountingTaxrate2](docs/sdks/accounting/README.md#patchaccountingtaxrate2) - Update a taxrate
* [patchAccountingTransaction2](docs/sdks/accounting/README.md#patchaccountingtransaction2) - Update a transaction
* [removeAccountingAccount2](docs/sdks/accounting/README.md#removeaccountingaccount2) - Remove an account
* [removeAccountingBill2](docs/sdks/accounting/README.md#removeaccountingbill2) - Remove a bill
* [removeAccountingCategory2](docs/sdks/accounting/README.md#removeaccountingcategory2) - Remove a category
* [removeAccountingContact2](docs/sdks/accounting/README.md#removeaccountingcontact2) - Remove a contact
* [removeAccountingCreditmemo2](docs/sdks/accounting/README.md#removeaccountingcreditmemo2) - Remove a creditmemo
* [removeAccountingExpense2](docs/sdks/accounting/README.md#removeaccountingexpense2) - Remove an expense
* [removeAccountingInvoice2](docs/sdks/accounting/README.md#removeaccountinginvoice2) - Remove an invoice
* [removeAccountingJournal2](docs/sdks/accounting/README.md#removeaccountingjournal2) - Remove a journal
* [removeAccountingOrder2](docs/sdks/accounting/README.md#removeaccountingorder2) - Remove an order
* [removeAccountingPurchaseorder2](docs/sdks/accounting/README.md#removeaccountingpurchaseorder2) - Remove a purchaseorder
* [removeAccountingSalesorder2](docs/sdks/accounting/README.md#removeaccountingsalesorder2) - Remove a salesorder
* [removeAccountingTaxrate2](docs/sdks/accounting/README.md#removeaccountingtaxrate2) - Remove a taxrate
* [removeAccountingTransaction2](docs/sdks/accounting/README.md#removeaccountingtransaction2) - Remove a transaction
* [updateAccountingAccount2](docs/sdks/accounting/README.md#updateaccountingaccount2) - Update an account
* [updateAccountingBill2](docs/sdks/accounting/README.md#updateaccountingbill2) - Update a bill
* [updateAccountingCategory2](docs/sdks/accounting/README.md#updateaccountingcategory2) - Update a category
* [updateAccountingContact2](docs/sdks/accounting/README.md#updateaccountingcontact2) - Update a contact
* [updateAccountingCreditmemo2](docs/sdks/accounting/README.md#updateaccountingcreditmemo2) - Update a creditmemo
* [updateAccountingExpense2](docs/sdks/accounting/README.md#updateaccountingexpense2) - Update an expense
* [updateAccountingInvoice2](docs/sdks/accounting/README.md#updateaccountinginvoice2) - Update an invoice
* [updateAccountingJournal2](docs/sdks/accounting/README.md#updateaccountingjournal2) - Update a journal
* [updateAccountingOrder2](docs/sdks/accounting/README.md#updateaccountingorder2) - Update an order
* [updateAccountingPurchaseorder2](docs/sdks/accounting/README.md#updateaccountingpurchaseorder2) - Update a purchaseorder
* [updateAccountingSalesorder2](docs/sdks/accounting/README.md#updateaccountingsalesorder2) - Update a salesorder
* [updateAccountingTaxrate2](docs/sdks/accounting/README.md#updateaccountingtaxrate2) - Update a taxrate
* [updateAccountingTransaction2](docs/sdks/accounting/README.md#updateaccountingtransaction2) - Update a transaction

### [Activity](docs/sdks/activity/README.md)

* [createAtsActivity2](docs/sdks/activity/README.md#createatsactivity2) - Create an activity
* [createLmsActivity2](docs/sdks/activity/README.md#createlmsactivity2) - Create an activity
* [getAtsActivity2](docs/sdks/activity/README.md#getatsactivity2) - Retrieve an activity
* [getClubsActivity2](docs/sdks/activity/README.md#getclubsactivity2) - Retrieve an activity
* [getLmsActivity2](docs/sdks/activity/README.md#getlmsactivity2) - Retrieve an activity
* [listAtsActivities2](docs/sdks/activity/README.md#listatsactivities2) - List all activities
* [listClubsActivities2](docs/sdks/activity/README.md#listclubsactivities2) - List all activities
* [listLmsActivities2](docs/sdks/activity/README.md#listlmsactivities2) - List all activities
* [patchAtsActivity2](docs/sdks/activity/README.md#patchatsactivity2) - Update an activity
* [patchLmsActivity2](docs/sdks/activity/README.md#patchlmsactivity2) - Update an activity
* [removeAtsActivity2](docs/sdks/activity/README.md#removeatsactivity2) - Remove an activity
* [removeLmsActivity2](docs/sdks/activity/README.md#removelmsactivity2) - Remove an activity
* [updateAtsActivity2](docs/sdks/activity/README.md#updateatsactivity2) - Update an activity
* [updateLmsActivity2](docs/sdks/activity/README.md#updatelmsactivity2) - Update an activity

### [Ad](docs/sdks/ad/README.md)

* [createAdsAd2](docs/sdks/ad/README.md#createadsad2) - Create an ad
* [getAdsAd2](docs/sdks/ad/README.md#getadsad2) - Retrieve an ad
* [listAdsAds2](docs/sdks/ad/README.md#listadsads2) - List all ads
* [patchAdsAd2](docs/sdks/ad/README.md#patchadsad2) - Update an ad
* [removeAdsAd2](docs/sdks/ad/README.md#removeadsad2) - Remove an ad
* [updateAdsAd2](docs/sdks/ad/README.md#updateadsad2) - Update an ad

### [Ads](docs/sdks/ads/README.md)

* [createAdsAd2](docs/sdks/ads/README.md#createadsad2) - Create an ad
* [createAdsCampaign2](docs/sdks/ads/README.md#createadscampaign2) - Create a campaign
* [createAdsCreative2](docs/sdks/ads/README.md#createadscreative2) - Create a creative
* [createAdsGroup2](docs/sdks/ads/README.md#createadsgroup2) - Create a group
* [createAdsInsertionorder2](docs/sdks/ads/README.md#createadsinsertionorder2) - Create an insertionorder
* [createAdsOrganization2](docs/sdks/ads/README.md#createadsorganization2) - Create an organization
* [getAdsAd2](docs/sdks/ads/README.md#getadsad2) - Retrieve an ad
* [getAdsCampaign2](docs/sdks/ads/README.md#getadscampaign2) - Retrieve a campaign
* [getAdsCreative2](docs/sdks/ads/README.md#getadscreative2) - Retrieve a creative
* [getAdsGroup2](docs/sdks/ads/README.md#getadsgroup2) - Retrieve a group
* [getAdsInsertionorder2](docs/sdks/ads/README.md#getadsinsertionorder2) - Retrieve an insertionorder
* [getAdsOrganization2](docs/sdks/ads/README.md#getadsorganization2) - Retrieve an organization
* [getAdsPromoted2](docs/sdks/ads/README.md#getadspromoted2) - Retrieve a promoted
* [getAdsTarget2](docs/sdks/ads/README.md#getadstarget2) - Retrieve a target
* [listAdsAds2](docs/sdks/ads/README.md#listadsads2) - List all ads
* [listAdsCampaigns2](docs/sdks/ads/README.md#listadscampaigns2) - List all campaigns
* [listAdsCreatives2](docs/sdks/ads/README.md#listadscreatives2) - List all creatives
* [listAdsGroups2](docs/sdks/ads/README.md#listadsgroups2) - List all groups
* [listAdsInsertionorders2](docs/sdks/ads/README.md#listadsinsertionorders2) - List all insertionorders
* [listAdsOrganizations2](docs/sdks/ads/README.md#listadsorganizations2) - List all organizations
* [listAdsPromoteds2](docs/sdks/ads/README.md#listadspromoteds2) - List all promoteds
* [listAdsReports2](docs/sdks/ads/README.md#listadsreports2) - List all reports
* [listAdsTargets2](docs/sdks/ads/README.md#listadstargets2) - List all targets
* [patchAdsAd2](docs/sdks/ads/README.md#patchadsad2) - Update an ad
* [patchAdsCampaign2](docs/sdks/ads/README.md#patchadscampaign2) - Update a campaign
* [patchAdsCreative2](docs/sdks/ads/README.md#patchadscreative2) - Update a creative
* [patchAdsGroup2](docs/sdks/ads/README.md#patchadsgroup2) - Update a group
* [patchAdsInsertionorder2](docs/sdks/ads/README.md#patchadsinsertionorder2) - Update an insertionorder
* [patchAdsOrganization2](docs/sdks/ads/README.md#patchadsorganization2) - Update an organization
* [removeAdsAd2](docs/sdks/ads/README.md#removeadsad2) - Remove an ad
* [removeAdsCampaign2](docs/sdks/ads/README.md#removeadscampaign2) - Remove a campaign
* [removeAdsCreative2](docs/sdks/ads/README.md#removeadscreative2) - Remove a creative
* [removeAdsGroup2](docs/sdks/ads/README.md#removeadsgroup2) - Remove a group
* [removeAdsInsertionorder2](docs/sdks/ads/README.md#removeadsinsertionorder2) - Remove an insertionorder
* [removeAdsOrganization2](docs/sdks/ads/README.md#removeadsorganization2) - Remove an organization
* [updateAdsAd2](docs/sdks/ads/README.md#updateadsad2) - Update an ad
* [updateAdsCampaign2](docs/sdks/ads/README.md#updateadscampaign2) - Update a campaign
* [updateAdsCreative2](docs/sdks/ads/README.md#updateadscreative2) - Update a creative
* [updateAdsGroup2](docs/sdks/ads/README.md#updateadsgroup2) - Update a group
* [updateAdsInsertionorder2](docs/sdks/ads/README.md#updateadsinsertionorder2) - Update an insertionorder
* [updateAdsOrganization2](docs/sdks/ads/README.md#updateadsorganization2) - Update an organization

### [Analytics](docs/sdks/analytics/README.md)

* [createAnalyticsEvent2](docs/sdks/analytics/README.md#createanalyticsevent2) - Create an event
* [createAnalyticsProperty2](docs/sdks/analytics/README.md#createanalyticsproperty2) - Create a property
* [createAnalyticsVisitor2](docs/sdks/analytics/README.md#createanalyticsvisitor2) - Create a visitor
* [getAnalyticsEvent2](docs/sdks/analytics/README.md#getanalyticsevent2) - Retrieve an event
* [getAnalyticsProperty2](docs/sdks/analytics/README.md#getanalyticsproperty2) - Retrieve a property
* [getAnalyticsSession2](docs/sdks/analytics/README.md#getanalyticssession2) - Retrieve a session
* [getAnalyticsVisitor2](docs/sdks/analytics/README.md#getanalyticsvisitor2) - Retrieve a visitor
* [listAnalyticsEvents2](docs/sdks/analytics/README.md#listanalyticsevents2) - List all events
* [listAnalyticsProperties2](docs/sdks/analytics/README.md#listanalyticsproperties2) - List all properties
* [listAnalyticsReports2](docs/sdks/analytics/README.md#listanalyticsreports2) - List all reports
* [listAnalyticsSessions2](docs/sdks/analytics/README.md#listanalyticssessions2) - List all sessions
* [listAnalyticsVisitors2](docs/sdks/analytics/README.md#listanalyticsvisitors2) - List all visitors
* [patchAnalyticsProperty2](docs/sdks/analytics/README.md#patchanalyticsproperty2) - Update a property
* [patchAnalyticsVisitor2](docs/sdks/analytics/README.md#patchanalyticsvisitor2) - Update a visitor
* [removeAnalyticsProperty2](docs/sdks/analytics/README.md#removeanalyticsproperty2) - Remove a property
* [removeAnalyticsVisitor2](docs/sdks/analytics/README.md#removeanalyticsvisitor2) - Remove a visitor
* [updateAnalyticsProperty2](docs/sdks/analytics/README.md#updateanalyticsproperty2) - Update a property
* [updateAnalyticsVisitor2](docs/sdks/analytics/README.md#updateanalyticsvisitor2) - Update a visitor

### [Apicall](docs/sdks/apicall/README.md)

* [getUnifiedApicall](docs/sdks/apicall/README.md#getunifiedapicall) - Retrieve specific API Call by its ID
* [listUnifiedApicalls](docs/sdks/apicall/README.md#listunifiedapicalls) - Returns API Calls

### [Application](docs/sdks/application/README.md)

* [createAtsApplication2](docs/sdks/application/README.md#createatsapplication2) - Create an application
* [getAtsApplication2](docs/sdks/application/README.md#getatsapplication2) - Retrieve an application
* [listAtsApplications2](docs/sdks/application/README.md#listatsapplications2) - List all applications
* [patchAtsApplication2](docs/sdks/application/README.md#patchatsapplication2) - Update an application
* [removeAtsApplication2](docs/sdks/application/README.md#removeatsapplication2) - Remove an application
* [updateAtsApplication2](docs/sdks/application/README.md#updateatsapplication2) - Update an application

### [Applicationstatus](docs/sdks/applicationstatus/README.md)

* [listAtsApplicationstatuses2](docs/sdks/applicationstatus/README.md#listatsapplicationstatuses2) - List all applicationstatuses

### [Assessment](docs/sdks/assessment/README.md)

* [createAssessmentPackage2](docs/sdks/assessment/README.md#createassessmentpackage2) - Create an assessment package
* [getAssessmentPackage2](docs/sdks/assessment/README.md#getassessmentpackage2) - Get an assessment package
* [listAssessmentPackages2](docs/sdks/assessment/README.md#listassessmentpackages2) - List assessment packages
* [patchAssessmentOrder2](docs/sdks/assessment/README.md#patchassessmentorder2) - Update an order
* [patchAssessmentPackage2](docs/sdks/assessment/README.md#patchassessmentpackage2) - Update an assessment package
* [removeAssessmentPackage2](docs/sdks/assessment/README.md#removeassessmentpackage2) - Delete an assessment package
* [updateAssessmentOrder2](docs/sdks/assessment/README.md#updateassessmentorder2) - Update an order
* [updateAssessmentPackage2](docs/sdks/assessment/README.md#updateassessmentpackage2) - Update an assessment package

### [Ats](docs/sdks/ats/README.md)

* [createAtsActivity2](docs/sdks/ats/README.md#createatsactivity2) - Create an activity
* [createAtsApplication2](docs/sdks/ats/README.md#createatsapplication2) - Create an application
* [createAtsCandidate2](docs/sdks/ats/README.md#createatscandidate2) - Create a candidate
* [createAtsCompany2](docs/sdks/ats/README.md#createatscompany2) - Create a company
* [createAtsDocument2](docs/sdks/ats/README.md#createatsdocument2) - Create a document
* [createAtsInterview2](docs/sdks/ats/README.md#createatsinterview2) - Create an interview
* [createAtsJob2](docs/sdks/ats/README.md#createatsjob2) - Create a job
* [createAtsScorecard2](docs/sdks/ats/README.md#createatsscorecard2) - Create a scorecard
* [getAtsActivity2](docs/sdks/ats/README.md#getatsactivity2) - Retrieve an activity
* [getAtsApplication2](docs/sdks/ats/README.md#getatsapplication2) - Retrieve an application
* [getAtsCandidate2](docs/sdks/ats/README.md#getatscandidate2) - Retrieve a candidate
* [getAtsCompany2](docs/sdks/ats/README.md#getatscompany2) - Retrieve a company
* [getAtsDocument2](docs/sdks/ats/README.md#getatsdocument2) - Retrieve a document
* [getAtsInterview2](docs/sdks/ats/README.md#getatsinterview2) - Retrieve an interview
* [getAtsJob2](docs/sdks/ats/README.md#getatsjob2) - Retrieve a job
* [getAtsScorecard2](docs/sdks/ats/README.md#getatsscorecard2) - Retrieve a scorecard
* [listAtsActivities2](docs/sdks/ats/README.md#listatsactivities2) - List all activities
* [listAtsApplications2](docs/sdks/ats/README.md#listatsapplications2) - List all applications
* [listAtsApplicationstatuses2](docs/sdks/ats/README.md#listatsapplicationstatuses2) - List all applicationstatuses
* [listAtsCandidates2](docs/sdks/ats/README.md#listatscandidates2) - List all candidates
* [listAtsCompanies2](docs/sdks/ats/README.md#listatscompanies2) - List all companies
* [listAtsDocuments2](docs/sdks/ats/README.md#listatsdocuments2) - List all documents
* [listAtsInterviews2](docs/sdks/ats/README.md#listatsinterviews2) - List all interviews
* [listAtsJobs2](docs/sdks/ats/README.md#listatsjobs2) - List all jobs
* [listAtsScorecards2](docs/sdks/ats/README.md#listatsscorecards2) - List all scorecards
* [patchAtsActivity2](docs/sdks/ats/README.md#patchatsactivity2) - Update an activity
* [patchAtsApplication2](docs/sdks/ats/README.md#patchatsapplication2) - Update an application
* [patchAtsCandidate2](docs/sdks/ats/README.md#patchatscandidate2) - Update a candidate
* [patchAtsCompany2](docs/sdks/ats/README.md#patchatscompany2) - Update a company
* [patchAtsDocument2](docs/sdks/ats/README.md#patchatsdocument2) - Update a document
* [patchAtsInterview2](docs/sdks/ats/README.md#patchatsinterview2) - Update an interview
* [patchAtsJob2](docs/sdks/ats/README.md#patchatsjob2) - Update a job
* [patchAtsScorecard2](docs/sdks/ats/README.md#patchatsscorecard2) - Update a scorecard
* [removeAtsActivity2](docs/sdks/ats/README.md#removeatsactivity2) - Remove an activity
* [removeAtsApplication2](docs/sdks/ats/README.md#removeatsapplication2) - Remove an application
* [removeAtsCandidate2](docs/sdks/ats/README.md#removeatscandidate2) - Remove a candidate
* [removeAtsCompany2](docs/sdks/ats/README.md#removeatscompany2) - Remove a company
* [removeAtsDocument2](docs/sdks/ats/README.md#removeatsdocument2) - Remove a document
* [removeAtsInterview2](docs/sdks/ats/README.md#removeatsinterview2) - Remove an interview
* [removeAtsJob2](docs/sdks/ats/README.md#removeatsjob2) - Remove a job
* [removeAtsScorecard2](docs/sdks/ats/README.md#removeatsscorecard2) - Remove a scorecard
* [updateAtsActivity2](docs/sdks/ats/README.md#updateatsactivity2) - Update an activity
* [updateAtsApplication2](docs/sdks/ats/README.md#updateatsapplication2) - Update an application
* [updateAtsCandidate2](docs/sdks/ats/README.md#updateatscandidate2) - Update a candidate
* [updateAtsCompany2](docs/sdks/ats/README.md#updateatscompany2) - Update a company
* [updateAtsDocument2](docs/sdks/ats/README.md#updateatsdocument2) - Update a document
* [updateAtsInterview2](docs/sdks/ats/README.md#updateatsinterview2) - Update an interview
* [updateAtsJob2](docs/sdks/ats/README.md#updateatsjob2) - Update a job
* [updateAtsScorecard2](docs/sdks/ats/README.md#updateatsscorecard2) - Update a scorecard

### [Auth](docs/sdks/auth/README.md)

* [getUnifiedIntegrationAuth](docs/sdks/auth/README.md#getunifiedintegrationauth) - Authorize new connection
* [getUnifiedIntegrationLogin](docs/sdks/auth/README.md#getunifiedintegrationlogin) - Sign in a user

### [Availability](docs/sdks/availability/README.md)

* [listCommerceAvailabilities2](docs/sdks/availability/README.md#listcommerceavailabilities2) - List all availabilities

### [Balancesheet](docs/sdks/balancesheet/README.md)

* [getAccountingBalancesheet2](docs/sdks/balancesheet/README.md#getaccountingbalancesheet2) - Retrieve a balancesheet
* [listAccountingBalancesheets2](docs/sdks/balancesheet/README.md#listaccountingbalancesheets2) - List all balancesheets

### [Bankaccount](docs/sdks/bankaccount/README.md)

* [createHrisBankaccount2](docs/sdks/bankaccount/README.md#createhrisbankaccount2) - Create a bankaccount
* [getHrisBankaccount2](docs/sdks/bankaccount/README.md#gethrisbankaccount2) - Retrieve a bankaccount
* [listHrisBankaccounts2](docs/sdks/bankaccount/README.md#listhrisbankaccounts2) - List all bankaccounts
* [patchHrisBankaccount2](docs/sdks/bankaccount/README.md#patchhrisbankaccount2) - Update a bankaccount
* [removeHrisBankaccount2](docs/sdks/bankaccount/README.md#removehrisbankaccount2) - Remove a bankaccount
* [updateHrisBankaccount2](docs/sdks/bankaccount/README.md#updatehrisbankaccount2) - Update a bankaccount

### [Benefit](docs/sdks/benefit/README.md)

* [createHrisBenefit2](docs/sdks/benefit/README.md#createhrisbenefit2) - Create a benefit
* [getHrisBenefit2](docs/sdks/benefit/README.md#gethrisbenefit2) - Retrieve a benefit
* [listHrisBenefits2](docs/sdks/benefit/README.md#listhrisbenefits2) - List all benefits
* [patchHrisBenefit2](docs/sdks/benefit/README.md#patchhrisbenefit2) - Update a benefit
* [removeHrisBenefit2](docs/sdks/benefit/README.md#removehrisbenefit2) - Remove a benefit
* [updateHrisBenefit2](docs/sdks/benefit/README.md#updatehrisbenefit2) - Update a benefit

### [Bill](docs/sdks/bill/README.md)

* [createAccountingBill2](docs/sdks/bill/README.md#createaccountingbill2) - Create a bill
* [getAccountingBill2](docs/sdks/bill/README.md#getaccountingbill2) - Retrieve a bill
* [listAccountingBills2](docs/sdks/bill/README.md#listaccountingbills2) - List all bills
* [patchAccountingBill2](docs/sdks/bill/README.md#patchaccountingbill2) - Update a bill
* [removeAccountingBill2](docs/sdks/bill/README.md#removeaccountingbill2) - Remove a bill
* [updateAccountingBill2](docs/sdks/bill/README.md#updateaccountingbill2) - Update a bill

### [Branch](docs/sdks/branch/README.md)

* [createRepoBranch2](docs/sdks/branch/README.md#createrepobranch2) - Create a branch
* [getRepoBranch2](docs/sdks/branch/README.md#getrepobranch2) - Retrieve a branch
* [listRepoBranches2](docs/sdks/branch/README.md#listrepobranches2) - List all branches
* [patchRepoBranch2](docs/sdks/branch/README.md#patchrepobranch2) - Update a branch
* [removeRepoBranch2](docs/sdks/branch/README.md#removerepobranch2) - Remove a branch
* [updateRepoBranch2](docs/sdks/branch/README.md#updaterepobranch2) - Update a branch

### [Busy](docs/sdks/busy/README.md)

* [listCalendarBusies2](docs/sdks/busy/README.md#listcalendarbusies2) - List all busies

### [Calendar](docs/sdks/calendar/README.md)

* [createCalendarCalendar2](docs/sdks/calendar/README.md#createcalendarcalendar2) - Create a calendar
* [createCalendarEvent2](docs/sdks/calendar/README.md#createcalendarevent2) - Create an event
* [createCalendarLink2](docs/sdks/calendar/README.md#createcalendarlink2) - Create a link
* [createCalendarWebinar2](docs/sdks/calendar/README.md#createcalendarwebinar2) - Create a webinar
* [getCalendarCalendar2](docs/sdks/calendar/README.md#getcalendarcalendar2) - Retrieve a calendar
* [getCalendarEvent2](docs/sdks/calendar/README.md#getcalendarevent2) - Retrieve an event
* [getCalendarLink2](docs/sdks/calendar/README.md#getcalendarlink2) - Retrieve a link
* [getCalendarRecording2](docs/sdks/calendar/README.md#getcalendarrecording2) - Retrieve a recording
* [getCalendarWebinar2](docs/sdks/calendar/README.md#getcalendarwebinar2) - Retrieve a webinar
* [listCalendarBusies2](docs/sdks/calendar/README.md#listcalendarbusies2) - List all busies
* [listCalendarCalendars2](docs/sdks/calendar/README.md#listcalendarcalendars2) - List all calendars
* [listCalendarEvents2](docs/sdks/calendar/README.md#listcalendarevents2) - List all events
* [listCalendarLinks2](docs/sdks/calendar/README.md#listcalendarlinks2) - List all links
* [listCalendarRecordings2](docs/sdks/calendar/README.md#listcalendarrecordings2) - List all recordings
* [listCalendarWebinars2](docs/sdks/calendar/README.md#listcalendarwebinars2) - List all webinars
* [patchCalendarCalendar2](docs/sdks/calendar/README.md#patchcalendarcalendar2) - Update a calendar
* [patchCalendarEvent2](docs/sdks/calendar/README.md#patchcalendarevent2) - Update an event
* [patchCalendarLink2](docs/sdks/calendar/README.md#patchcalendarlink2) - Update a link
* [patchCalendarWebinar2](docs/sdks/calendar/README.md#patchcalendarwebinar2) - Update a webinar
* [removeCalendarCalendar2](docs/sdks/calendar/README.md#removecalendarcalendar2) - Remove a calendar
* [removeCalendarEvent2](docs/sdks/calendar/README.md#removecalendarevent2) - Remove an event
* [removeCalendarLink2](docs/sdks/calendar/README.md#removecalendarlink2) - Remove a link
* [removeCalendarWebinar2](docs/sdks/calendar/README.md#removecalendarwebinar2) - Remove a webinar
* [updateCalendarCalendar2](docs/sdks/calendar/README.md#updatecalendarcalendar2) - Update a calendar
* [updateCalendarEvent2](docs/sdks/calendar/README.md#updatecalendarevent2) - Update an event
* [updateCalendarLink2](docs/sdks/calendar/README.md#updatecalendarlink2) - Update a link
* [updateCalendarWebinar2](docs/sdks/calendar/README.md#updatecalendarwebinar2) - Update a webinar

### [Call](docs/sdks/call/README.md)

* [getUcCall2](docs/sdks/call/README.md#getuccall2) - Retrieve a call
* [listUcCalls2](docs/sdks/call/README.md#listuccalls2) - List all calls

### [Campaign](docs/sdks/campaign/README.md)

* [createAdsCampaign2](docs/sdks/campaign/README.md#createadscampaign2) - Create a campaign
* [createMartechCampaign2](docs/sdks/campaign/README.md#createmartechcampaign2) - Create a campaign
* [getAdsCampaign2](docs/sdks/campaign/README.md#getadscampaign2) - Retrieve a campaign
* [getMartechCampaign2](docs/sdks/campaign/README.md#getmartechcampaign2) - Retrieve a campaign
* [listAdsCampaigns2](docs/sdks/campaign/README.md#listadscampaigns2) - List all campaigns
* [listMartechCampaigns2](docs/sdks/campaign/README.md#listmartechcampaigns2) - List all campaigns
* [patchAdsCampaign2](docs/sdks/campaign/README.md#patchadscampaign2) - Update a campaign
* [patchMartechCampaign2](docs/sdks/campaign/README.md#patchmartechcampaign2) - Update a campaign
* [removeAdsCampaign2](docs/sdks/campaign/README.md#removeadscampaign2) - Remove a campaign
* [removeMartechCampaign2](docs/sdks/campaign/README.md#removemartechcampaign2) - Remove a campaign
* [updateAdsCampaign2](docs/sdks/campaign/README.md#updateadscampaign2) - Update a campaign
* [updateMartechCampaign2](docs/sdks/campaign/README.md#updatemartechcampaign2) - Update a campaign

### [Candidate](docs/sdks/candidate/README.md)

* [createAtsCandidate2](docs/sdks/candidate/README.md#createatscandidate2) - Create a candidate
* [getAtsCandidate2](docs/sdks/candidate/README.md#getatscandidate2) - Retrieve a candidate
* [listAtsCandidates2](docs/sdks/candidate/README.md#listatscandidates2) - List all candidates
* [patchAtsCandidate2](docs/sdks/candidate/README.md#patchatscandidate2) - Update a candidate
* [removeAtsCandidate2](docs/sdks/candidate/README.md#removeatscandidate2) - Remove a candidate
* [updateAtsCandidate2](docs/sdks/candidate/README.md#updateatscandidate2) - Update a candidate

### [Carrier](docs/sdks/carrier/README.md)

* [getShippingCarrier2](docs/sdks/carrier/README.md#getshippingcarrier2) - Retrieve a carrier
* [listShippingCarriers2](docs/sdks/carrier/README.md#listshippingcarriers2) - List all carriers

### [Cashflow](docs/sdks/cashflow/README.md)

* [getAccountingCashflow2](docs/sdks/cashflow/README.md#getaccountingcashflow2) - Retrieve a cashflow
* [listAccountingCashflows2](docs/sdks/cashflow/README.md#listaccountingcashflows2) - List all cashflows

### [Category](docs/sdks/category/README.md)

* [createAccountingCategory2](docs/sdks/category/README.md#createaccountingcategory2) - Create a category
* [createTicketingCategory2](docs/sdks/category/README.md#createticketingcategory2) - Create a category
* [getAccountingCategory2](docs/sdks/category/README.md#getaccountingcategory2) - Retrieve a category
* [getTicketingCategory2](docs/sdks/category/README.md#getticketingcategory2) - Retrieve a category
* [listAccountingCategories2](docs/sdks/category/README.md#listaccountingcategories2) - List all categories
* [listTicketingCategories2](docs/sdks/category/README.md#listticketingcategories2) - List all categories
* [patchAccountingCategory2](docs/sdks/category/README.md#patchaccountingcategory2) - Update a category
* [patchTicketingCategory2](docs/sdks/category/README.md#patchticketingcategory2) - Update a category
* [removeAccountingCategory2](docs/sdks/category/README.md#removeaccountingcategory2) - Remove a category
* [removeTicketingCategory2](docs/sdks/category/README.md#removeticketingcategory2) - Remove a category
* [updateAccountingCategory2](docs/sdks/category/README.md#updateaccountingcategory2) - Update a category
* [updateTicketingCategory2](docs/sdks/category/README.md#updateticketingcategory2) - Update a category

### [Change](docs/sdks/change/README.md)

* [getTaskChange2](docs/sdks/change/README.md#gettaskchange2) - Retrieve a change
* [listTaskChanges2](docs/sdks/change/README.md#listtaskchanges2) - List all changes

### [Channel](docs/sdks/channel/README.md)

* [getMessagingChannel2](docs/sdks/channel/README.md#getmessagingchannel2) - Retrieve a channel
* [listMessagingChannels2](docs/sdks/channel/README.md#listmessagingchannels2) - List all channels

### [Class](docs/sdks/class/README.md)

* [createLmsClass2](docs/sdks/class/README.md#createlmsclass2) - Create a class
* [getLmsClass2](docs/sdks/class/README.md#getlmsclass2) - Retrieve a class
* [listLmsClasses2](docs/sdks/class/README.md#listlmsclasses2) - List all classes
* [patchLmsClass2](docs/sdks/class/README.md#patchlmsclass2) - Update a class
* [removeLmsClass2](docs/sdks/class/README.md#removelmsclass2) - Remove a class
* [updateLmsClass2](docs/sdks/class/README.md#updatelmsclass2) - Update a class

### [Clubs](docs/sdks/clubs/README.md)

* [getClubsActivity2](docs/sdks/clubs/README.md#getclubsactivity2) - Retrieve an activity
* [getClubsEvent2](docs/sdks/clubs/README.md#getclubsevent2) - Retrieve an event
* [getClubsGroup2](docs/sdks/clubs/README.md#getclubsgroup2) - Retrieve a group
* [getClubsLocation2](docs/sdks/clubs/README.md#getclubslocation2) - Retrieve a location
* [getClubsMember2](docs/sdks/clubs/README.md#getclubsmember2) - Retrieve a member
* [listClubsActivities2](docs/sdks/clubs/README.md#listclubsactivities2) - List all activities
* [listClubsEvents2](docs/sdks/clubs/README.md#listclubsevents2) - List all events
* [listClubsGroups2](docs/sdks/clubs/README.md#listclubsgroups2) - List all groups
* [listClubsLocations2](docs/sdks/clubs/README.md#listclubslocations2) - List all locations
* [listClubsMembers2](docs/sdks/clubs/README.md#listclubsmembers2) - List all members

### [Collection](docs/sdks/collection/README.md)

* [createCommerceCollection2](docs/sdks/collection/README.md#createcommercecollection2) - Create a collection
* [createLmsCollection2](docs/sdks/collection/README.md#createlmscollection2) - Create a collection
* [getCommerceCollection2](docs/sdks/collection/README.md#getcommercecollection2) - Retrieve a collection
* [getLmsCollection2](docs/sdks/collection/README.md#getlmscollection2) - Retrieve a collection
* [listCommerceCollections2](docs/sdks/collection/README.md#listcommercecollections2) - List all collections
* [listLmsCollections2](docs/sdks/collection/README.md#listlmscollections2) - List all collections
* [patchCommerceCollection2](docs/sdks/collection/README.md#patchcommercecollection2) - Update a collection
* [patchLmsCollection2](docs/sdks/collection/README.md#patchlmscollection2) - Update a collection
* [removeCommerceCollection2](docs/sdks/collection/README.md#removecommercecollection2) - Remove a collection
* [removeLmsCollection2](docs/sdks/collection/README.md#removelmscollection2) - Remove a collection
* [updateCommerceCollection2](docs/sdks/collection/README.md#updatecommercecollection2) - Update a collection
* [updateLmsCollection2](docs/sdks/collection/README.md#updatelmscollection2) - Update a collection

### [Comment](docs/sdks/comment/README.md)

* [createKmsComment2](docs/sdks/comment/README.md#createkmscomment2) - Create a comment
* [createTaskComment2](docs/sdks/comment/README.md#createtaskcomment2) - Create a comment
* [createUcComment2](docs/sdks/comment/README.md#createuccomment2) - Create a comment
* [getKmsComment2](docs/sdks/comment/README.md#getkmscomment2) - Retrieve a comment
* [getTaskComment2](docs/sdks/comment/README.md#gettaskcomment2) - Retrieve a comment
* [getUcComment2](docs/sdks/comment/README.md#getuccomment2) - Retrieve a comment
* [listKmsComments2](docs/sdks/comment/README.md#listkmscomments2) - List all comments
* [listTaskComments2](docs/sdks/comment/README.md#listtaskcomments2) - List all comments
* [listUcComments2](docs/sdks/comment/README.md#listuccomments2) - List all comments
* [patchKmsComment2](docs/sdks/comment/README.md#patchkmscomment2) - Update a comment
* [patchTaskComment2](docs/sdks/comment/README.md#patchtaskcomment2) - Update a comment
* [patchUcComment2](docs/sdks/comment/README.md#patchuccomment2) - Update a comment
* [removeKmsComment2](docs/sdks/comment/README.md#removekmscomment2) - Remove a comment
* [removeTaskComment2](docs/sdks/comment/README.md#removetaskcomment2) - Remove a comment
* [removeUcComment2](docs/sdks/comment/README.md#removeuccomment2) - Remove a comment
* [updateKmsComment2](docs/sdks/comment/README.md#updatekmscomment2) - Update a comment
* [updateTaskComment2](docs/sdks/comment/README.md#updatetaskcomment2) - Update a comment
* [updateUcComment2](docs/sdks/comment/README.md#updateuccomment2) - Update a comment

### [Commerce](docs/sdks/commerce/README.md)

* [createCommerceCollection2](docs/sdks/commerce/README.md#createcommercecollection2) - Create a collection
* [createCommerceInventory2](docs/sdks/commerce/README.md#createcommerceinventory2) - Create an inventory
* [createCommerceItem2](docs/sdks/commerce/README.md#createcommerceitem2) - Create an item
* [createCommerceItemvariant2](docs/sdks/commerce/README.md#createcommerceitemvariant2) - Create an itemvariant
* [createCommerceLocation2](docs/sdks/commerce/README.md#createcommercelocation2) - Create a location
* [createCommerceReservation2](docs/sdks/commerce/README.md#createcommercereservation2) - Create a reservation
* [createCommerceReview2](docs/sdks/commerce/README.md#createcommercereview2) - Create a review
* [createCommerceSaleschannel2](docs/sdks/commerce/README.md#createcommercesaleschannel2) - Create a saleschannel
* [getCommerceCollection2](docs/sdks/commerce/README.md#getcommercecollection2) - Retrieve a collection
* [getCommerceInventory2](docs/sdks/commerce/README.md#getcommerceinventory2) - Retrieve an inventory
* [getCommerceItem2](docs/sdks/commerce/README.md#getcommerceitem2) - Retrieve an item
* [getCommerceItemvariant2](docs/sdks/commerce/README.md#getcommerceitemvariant2) - Retrieve an itemvariant
* [getCommerceLocation2](docs/sdks/commerce/README.md#getcommercelocation2) - Retrieve a location
* [getCommerceReservation2](docs/sdks/commerce/README.md#getcommercereservation2) - Retrieve a reservation
* [getCommerceReview2](docs/sdks/commerce/README.md#getcommercereview2) - Retrieve a review
* [getCommerceSaleschannel2](docs/sdks/commerce/README.md#getcommercesaleschannel2) - Retrieve a saleschannel
* [listCommerceAvailabilities2](docs/sdks/commerce/README.md#listcommerceavailabilities2) - List all availabilities
* [listCommerceCollections2](docs/sdks/commerce/README.md#listcommercecollections2) - List all collections
* [listCommerceInventories2](docs/sdks/commerce/README.md#listcommerceinventories2) - List all inventories
* [listCommerceItems2](docs/sdks/commerce/README.md#listcommerceitems2) - List all items
* [listCommerceItemvariants2](docs/sdks/commerce/README.md#listcommerceitemvariants2) - List all itemvariants
* [listCommerceLocations2](docs/sdks/commerce/README.md#listcommercelocations2) - List all locations
* [listCommerceReservations2](docs/sdks/commerce/README.md#listcommercereservations2) - List all reservations
* [listCommerceReviews2](docs/sdks/commerce/README.md#listcommercereviews2) - List all reviews
* [listCommerceSaleschannels2](docs/sdks/commerce/README.md#listcommercesaleschannels2) - List all saleschannels
* [patchCommerceCollection2](docs/sdks/commerce/README.md#patchcommercecollection2) - Update a collection
* [patchCommerceInventory2](docs/sdks/commerce/README.md#patchcommerceinventory2) - Update an inventory
* [patchCommerceItem2](docs/sdks/commerce/README.md#patchcommerceitem2) - Update an item
* [patchCommerceItemvariant2](docs/sdks/commerce/README.md#patchcommerceitemvariant2) - Update an itemvariant
* [patchCommerceLocation2](docs/sdks/commerce/README.md#patchcommercelocation2) - Update a location
* [patchCommerceReservation2](docs/sdks/commerce/README.md#patchcommercereservation2) - Update a reservation
* [patchCommerceReview2](docs/sdks/commerce/README.md#patchcommercereview2) - Update a review
* [patchCommerceSaleschannel2](docs/sdks/commerce/README.md#patchcommercesaleschannel2) - Update a saleschannel
* [removeCommerceCollection2](docs/sdks/commerce/README.md#removecommercecollection2) - Remove a collection
* [removeCommerceInventory2](docs/sdks/commerce/README.md#removecommerceinventory2) - Remove an inventory
* [removeCommerceItem2](docs/sdks/commerce/README.md#removecommerceitem2) - Remove an item
* [removeCommerceItemvariant2](docs/sdks/commerce/README.md#removecommerceitemvariant2) - Remove an itemvariant
* [removeCommerceLocation2](docs/sdks/commerce/README.md#removecommercelocation2) - Remove a location
* [removeCommerceReservation2](docs/sdks/commerce/README.md#removecommercereservation2) - Remove a reservation
* [removeCommerceReview2](docs/sdks/commerce/README.md#removecommercereview2) - Remove a review
* [removeCommerceSaleschannel2](docs/sdks/commerce/README.md#removecommercesaleschannel2) - Remove a saleschannel
* [updateCommerceCollection2](docs/sdks/commerce/README.md#updatecommercecollection2) - Update a collection
* [updateCommerceInventory2](docs/sdks/commerce/README.md#updatecommerceinventory2) - Update an inventory
* [updateCommerceItem2](docs/sdks/commerce/README.md#updatecommerceitem2) - Update an item
* [updateCommerceItemvariant2](docs/sdks/commerce/README.md#updatecommerceitemvariant2) - Update an itemvariant
* [updateCommerceLocation2](docs/sdks/commerce/README.md#updatecommercelocation2) - Update a location
* [updateCommerceReservation2](docs/sdks/commerce/README.md#updatecommercereservation2) - Update a reservation
* [updateCommerceReview2](docs/sdks/commerce/README.md#updatecommercereview2) - Update a review
* [updateCommerceSaleschannel2](docs/sdks/commerce/README.md#updatecommercesaleschannel2) - Update a saleschannel

### [Commit](docs/sdks/commit/README.md)

* [createRepoCommit2](docs/sdks/commit/README.md#createrepocommit2) - Create a commit
* [getRepoCommit2](docs/sdks/commit/README.md#getrepocommit2) - Retrieve a commit
* [listRepoCommits2](docs/sdks/commit/README.md#listrepocommits2) - List all commits
* [patchRepoCommit2](docs/sdks/commit/README.md#patchrepocommit2) - Update a commit
* [removeRepoCommit2](docs/sdks/commit/README.md#removerepocommit2) - Remove a commit
* [updateRepoCommit2](docs/sdks/commit/README.md#updaterepocommit2) - Update a commit

### [Company](docs/sdks/company/README.md)

* [createAtsCompany2](docs/sdks/company/README.md#createatscompany2) - Create a company
* [createCrmCompany2](docs/sdks/company/README.md#createcrmcompany2) - Create a company
* [createHrisCompany2](docs/sdks/company/README.md#createhriscompany2) - Create a company
* [getAtsCompany2](docs/sdks/company/README.md#getatscompany2) - Retrieve a company
* [getCrmCompany2](docs/sdks/company/README.md#getcrmcompany2) - Retrieve a company
* [getHrisCompany2](docs/sdks/company/README.md#gethriscompany2) - Retrieve a company
* [listAtsCompanies2](docs/sdks/company/README.md#listatscompanies2) - List all companies
* [listCrmCompanies2](docs/sdks/company/README.md#listcrmcompanies2) - List all companies
* [listEnrichCompanies2](docs/sdks/company/README.md#listenrichcompanies2) - Retrieve enrichment information for a company
* [listHrisCompanies2](docs/sdks/company/README.md#listhriscompanies2) - List all companies
* [patchAtsCompany2](docs/sdks/company/README.md#patchatscompany2) - Update a company
* [patchCrmCompany2](docs/sdks/company/README.md#patchcrmcompany2) - Update a company
* [patchHrisCompany2](docs/sdks/company/README.md#patchhriscompany2) - Update a company
* [removeAtsCompany2](docs/sdks/company/README.md#removeatscompany2) - Remove a company
* [removeCrmCompany2](docs/sdks/company/README.md#removecrmcompany2) - Remove a company
* [removeHrisCompany2](docs/sdks/company/README.md#removehriscompany2) - Remove a company
* [updateAtsCompany2](docs/sdks/company/README.md#updateatscompany2) - Update a company
* [updateCrmCompany2](docs/sdks/company/README.md#updatecrmcompany2) - Update a company
* [updateHrisCompany2](docs/sdks/company/README.md#updatehriscompany2) - Update a company

### [Connection](docs/sdks/connection/README.md)

* [createUnifiedConnection](docs/sdks/connection/README.md#createunifiedconnection) - Create connection
* [getUnifiedConnection](docs/sdks/connection/README.md#getunifiedconnection) - Retrieve connection
* [listUnifiedConnections](docs/sdks/connection/README.md#listunifiedconnections) - List all connections
* [patchUnifiedConnection](docs/sdks/connection/README.md#patchunifiedconnection) - Update connection
* [removeUnifiedConnection](docs/sdks/connection/README.md#removeunifiedconnection) - Remove connection
* [updateUnifiedConnection](docs/sdks/connection/README.md#updateunifiedconnection) - Update connection

### [Contact](docs/sdks/contact/README.md)

* [createAccountingContact2](docs/sdks/contact/README.md#createaccountingcontact2) - Create a contact
* [createCrmContact2](docs/sdks/contact/README.md#createcrmcontact2) - Create a contact
* [createUcContact2](docs/sdks/contact/README.md#createuccontact2) - Create a contact
* [getAccountingContact2](docs/sdks/contact/README.md#getaccountingcontact2) - Retrieve a contact
* [getCrmContact2](docs/sdks/contact/README.md#getcrmcontact2) - Retrieve a contact
* [getUcContact2](docs/sdks/contact/README.md#getuccontact2) - Retrieve a contact
* [listAccountingContacts2](docs/sdks/contact/README.md#listaccountingcontacts2) - List all contacts
* [listCrmContacts2](docs/sdks/contact/README.md#listcrmcontacts2) - List all contacts
* [listUcContacts2](docs/sdks/contact/README.md#listuccontacts2) - List all contacts
* [patchAccountingContact2](docs/sdks/contact/README.md#patchaccountingcontact2) - Update a contact
* [patchCrmContact2](docs/sdks/contact/README.md#patchcrmcontact2) - Update a contact
* [patchUcContact2](docs/sdks/contact/README.md#patchuccontact2) - Update a contact
* [removeAccountingContact2](docs/sdks/contact/README.md#removeaccountingcontact2) - Remove a contact
* [removeCrmContact2](docs/sdks/contact/README.md#removecrmcontact2) - Remove a contact
* [removeUcContact2](docs/sdks/contact/README.md#removeuccontact2) - Remove a contact
* [updateAccountingContact2](docs/sdks/contact/README.md#updateaccountingcontact2) - Update a contact
* [updateCrmContact2](docs/sdks/contact/README.md#updatecrmcontact2) - Update a contact
* [updateUcContact2](docs/sdks/contact/README.md#updateuccontact2) - Update a contact

### [Content](docs/sdks/content/README.md)

* [createLmsContent2](docs/sdks/content/README.md#createlmscontent2) - Create a content
* [getLmsContent2](docs/sdks/content/README.md#getlmscontent2) - Retrieve a content
* [listLmsContents2](docs/sdks/content/README.md#listlmscontents2) - List all contents
* [patchLmsContent2](docs/sdks/content/README.md#patchlmscontent2) - Update a content
* [removeLmsContent2](docs/sdks/content/README.md#removelmscontent2) - Remove a content
* [updateLmsContent2](docs/sdks/content/README.md#updatelmscontent2) - Update a content

### [Course](docs/sdks/course/README.md)

* [createLmsCourse2](docs/sdks/course/README.md#createlmscourse2) - Create a course
* [getLmsCourse2](docs/sdks/course/README.md#getlmscourse2) - Retrieve a course
* [listLmsCourses2](docs/sdks/course/README.md#listlmscourses2) - List all courses
* [patchLmsCourse2](docs/sdks/course/README.md#patchlmscourse2) - Update a course
* [removeLmsCourse2](docs/sdks/course/README.md#removelmscourse2) - Remove a course
* [updateLmsCourse2](docs/sdks/course/README.md#updatelmscourse2) - Update a course

### [Creative](docs/sdks/creative/README.md)

* [createAdsCreative2](docs/sdks/creative/README.md#createadscreative2) - Create a creative
* [getAdsCreative2](docs/sdks/creative/README.md#getadscreative2) - Retrieve a creative
* [listAdsCreatives2](docs/sdks/creative/README.md#listadscreatives2) - List all creatives
* [patchAdsCreative2](docs/sdks/creative/README.md#patchadscreative2) - Update a creative
* [removeAdsCreative2](docs/sdks/creative/README.md#removeadscreative2) - Remove a creative
* [updateAdsCreative2](docs/sdks/creative/README.md#updateadscreative2) - Update a creative

### [Creditmemo](docs/sdks/creditmemo/README.md)

* [createAccountingCreditmemo2](docs/sdks/creditmemo/README.md#createaccountingcreditmemo2) - Create a creditmemo
* [getAccountingCreditmemo2](docs/sdks/creditmemo/README.md#getaccountingcreditmemo2) - Retrieve a creditmemo
* [listAccountingCreditmemoes2](docs/sdks/creditmemo/README.md#listaccountingcreditmemoes2) - List all creditmemoes
* [patchAccountingCreditmemo2](docs/sdks/creditmemo/README.md#patchaccountingcreditmemo2) - Update a creditmemo
* [removeAccountingCreditmemo2](docs/sdks/creditmemo/README.md#removeaccountingcreditmemo2) - Remove a creditmemo
* [updateAccountingCreditmemo2](docs/sdks/creditmemo/README.md#updateaccountingcreditmemo2) - Update a creditmemo

### [Crm](docs/sdks/crm/README.md)

* [createCrmCompany2](docs/sdks/crm/README.md#createcrmcompany2) - Create a company
* [createCrmContact2](docs/sdks/crm/README.md#createcrmcontact2) - Create a contact
* [createCrmDeal2](docs/sdks/crm/README.md#createcrmdeal2) - Create a deal
* [createCrmEvent2](docs/sdks/crm/README.md#createcrmevent2) - Create an event
* [createCrmLead2](docs/sdks/crm/README.md#createcrmlead2) - Create a lead
* [createCrmPipeline2](docs/sdks/crm/README.md#createcrmpipeline2) - Create a pipeline
* [getCrmCompany2](docs/sdks/crm/README.md#getcrmcompany2) - Retrieve a company
* [getCrmContact2](docs/sdks/crm/README.md#getcrmcontact2) - Retrieve a contact
* [getCrmDeal2](docs/sdks/crm/README.md#getcrmdeal2) - Retrieve a deal
* [getCrmEvent2](docs/sdks/crm/README.md#getcrmevent2) - Retrieve an event
* [getCrmLead2](docs/sdks/crm/README.md#getcrmlead2) - Retrieve a lead
* [getCrmPipeline2](docs/sdks/crm/README.md#getcrmpipeline2) - Retrieve a pipeline
* [listCrmCompanies2](docs/sdks/crm/README.md#listcrmcompanies2) - List all companies
* [listCrmContacts2](docs/sdks/crm/README.md#listcrmcontacts2) - List all contacts
* [listCrmDeals2](docs/sdks/crm/README.md#listcrmdeals2) - List all deals
* [listCrmEvents2](docs/sdks/crm/README.md#listcrmevents2) - List all events
* [listCrmLeads2](docs/sdks/crm/README.md#listcrmleads2) - List all leads
* [listCrmPipelines2](docs/sdks/crm/README.md#listcrmpipelines2) - List all pipelines
* [patchCrmCompany2](docs/sdks/crm/README.md#patchcrmcompany2) - Update a company
* [patchCrmContact2](docs/sdks/crm/README.md#patchcrmcontact2) - Update a contact
* [patchCrmDeal2](docs/sdks/crm/README.md#patchcrmdeal2) - Update a deal
* [patchCrmEvent2](docs/sdks/crm/README.md#patchcrmevent2) - Update an event
* [patchCrmLead2](docs/sdks/crm/README.md#patchcrmlead2) - Update a lead
* [patchCrmPipeline2](docs/sdks/crm/README.md#patchcrmpipeline2) - Update a pipeline
* [removeCrmCompany2](docs/sdks/crm/README.md#removecrmcompany2) - Remove a company
* [removeCrmContact2](docs/sdks/crm/README.md#removecrmcontact2) - Remove a contact
* [removeCrmDeal2](docs/sdks/crm/README.md#removecrmdeal2) - Remove a deal
* [removeCrmEvent2](docs/sdks/crm/README.md#removecrmevent2) - Remove an event
* [removeCrmLead2](docs/sdks/crm/README.md#removecrmlead2) - Remove a lead
* [removeCrmPipeline2](docs/sdks/crm/README.md#removecrmpipeline2) - Remove a pipeline
* [updateCrmCompany2](docs/sdks/crm/README.md#updatecrmcompany2) - Update a company
* [updateCrmContact2](docs/sdks/crm/README.md#updatecrmcontact2) - Update a contact
* [updateCrmDeal2](docs/sdks/crm/README.md#updatecrmdeal2) - Update a deal
* [updateCrmEvent2](docs/sdks/crm/README.md#updatecrmevent2) - Update an event
* [updateCrmLead2](docs/sdks/crm/README.md#updatecrmlead2) - Update a lead
* [updateCrmPipeline2](docs/sdks/crm/README.md#updatecrmpipeline2) - Update a pipeline

### [Customer](docs/sdks/customer/README.md)

* [createTicketingCustomer2](docs/sdks/customer/README.md#createticketingcustomer2) - Create a customer
* [getTicketingCustomer2](docs/sdks/customer/README.md#getticketingcustomer2) - Retrieve a customer
* [listTicketingCustomers2](docs/sdks/customer/README.md#listticketingcustomers2) - List all customers
* [patchTicketingCustomer2](docs/sdks/customer/README.md#patchticketingcustomer2) - Update a customer
* [removeTicketingCustomer2](docs/sdks/customer/README.md#removeticketingcustomer2) - Remove a customer
* [updateTicketingCustomer2](docs/sdks/customer/README.md#updateticketingcustomer2) - Update a customer

### [Database](docs/sdks/database/README.md)

* [createDatastoreDatabase2](docs/sdks/database/README.md#createdatastoredatabase2) - Create a database
* [getDatastoreDatabase2](docs/sdks/database/README.md#getdatastoredatabase2) - Retrieve a database
* [listDatastoreDatabases2](docs/sdks/database/README.md#listdatastoredatabases2) - List all databases
* [patchDatastoreDatabase2](docs/sdks/database/README.md#patchdatastoredatabase2) - Update a database
* [removeDatastoreDatabase2](docs/sdks/database/README.md#removedatastoredatabase2) - Remove a database
* [updateDatastoreDatabase2](docs/sdks/database/README.md#updatedatastoredatabase2) - Update a database

### [Datastore](docs/sdks/datastore/README.md)

* [createDatastoreDatabase2](docs/sdks/datastore/README.md#createdatastoredatabase2) - Create a database
* [createDatastoreQuery2](docs/sdks/datastore/README.md#createdatastorequery2) - Create a query
* [createDatastoreRecord2](docs/sdks/datastore/README.md#createdatastorerecord2) - Create a record
* [createDatastoreTable2](docs/sdks/datastore/README.md#createdatastoretable2) - Create a table
* [getDatastoreDatabase2](docs/sdks/datastore/README.md#getdatastoredatabase2) - Retrieve a database
* [getDatastoreRecord2](docs/sdks/datastore/README.md#getdatastorerecord2) - Retrieve a record
* [getDatastoreTable2](docs/sdks/datastore/README.md#getdatastoretable2) - Retrieve a table
* [listDatastoreDatabases2](docs/sdks/datastore/README.md#listdatastoredatabases2) - List all databases
* [listDatastoreRecords2](docs/sdks/datastore/README.md#listdatastorerecords2) - List all records
* [listDatastoreTables2](docs/sdks/datastore/README.md#listdatastoretables2) - List all tables
* [patchDatastoreDatabase2](docs/sdks/datastore/README.md#patchdatastoredatabase2) - Update a database
* [patchDatastoreRecord2](docs/sdks/datastore/README.md#patchdatastorerecord2) - Update a record
* [patchDatastoreTable2](docs/sdks/datastore/README.md#patchdatastoretable2) - Update a table
* [removeDatastoreDatabase2](docs/sdks/datastore/README.md#removedatastoredatabase2) - Remove a database
* [removeDatastoreRecord2](docs/sdks/datastore/README.md#removedatastorerecord2) - Remove a record
* [removeDatastoreTable2](docs/sdks/datastore/README.md#removedatastoretable2) - Remove a table
* [updateDatastoreDatabase2](docs/sdks/datastore/README.md#updatedatastoredatabase2) - Update a database
* [updateDatastoreRecord2](docs/sdks/datastore/README.md#updatedatastorerecord2) - Update a record
* [updateDatastoreTable2](docs/sdks/datastore/README.md#updatedatastoretable2) - Update a table

### [Deal](docs/sdks/deal/README.md)

* [createCrmDeal2](docs/sdks/deal/README.md#createcrmdeal2) - Create a deal
* [getCrmDeal2](docs/sdks/deal/README.md#getcrmdeal2) - Retrieve a deal
* [listCrmDeals2](docs/sdks/deal/README.md#listcrmdeals2) - List all deals
* [patchCrmDeal2](docs/sdks/deal/README.md#patchcrmdeal2) - Update a deal
* [removeCrmDeal2](docs/sdks/deal/README.md#removecrmdeal2) - Remove a deal
* [updateCrmDeal2](docs/sdks/deal/README.md#updatecrmdeal2) - Update a deal

### [Deduction](docs/sdks/deduction/README.md)

* [createHrisDeduction2](docs/sdks/deduction/README.md#createhrisdeduction2) - Create a deduction
* [getHrisDeduction2](docs/sdks/deduction/README.md#gethrisdeduction2) - Retrieve a deduction
* [listHrisDeductions2](docs/sdks/deduction/README.md#listhrisdeductions2) - List all deductions
* [patchHrisDeduction2](docs/sdks/deduction/README.md#patchhrisdeduction2) - Update a deduction
* [removeHrisDeduction2](docs/sdks/deduction/README.md#removehrisdeduction2) - Remove a deduction
* [updateHrisDeduction2](docs/sdks/deduction/README.md#updatehrisdeduction2) - Update a deduction

### [Device](docs/sdks/device/README.md)

* [createHrisDevice2](docs/sdks/device/README.md#createhrisdevice2) - Create a device
* [getHrisDevice2](docs/sdks/device/README.md#gethrisdevice2) - Retrieve a device
* [listHrisDevices2](docs/sdks/device/README.md#listhrisdevices2) - List all devices
* [patchHrisDevice2](docs/sdks/device/README.md#patchhrisdevice2) - Update a device
* [removeHrisDevice2](docs/sdks/device/README.md#removehrisdevice2) - Remove a device
* [updateHrisDevice2](docs/sdks/device/README.md#updatehrisdevice2) - Update a device

### [Document](docs/sdks/document/README.md)

* [createAtsDocument2](docs/sdks/document/README.md#createatsdocument2) - Create a document
* [createSigningDocument2](docs/sdks/document/README.md#createsigningdocument2) - Create a document
* [getAtsDocument2](docs/sdks/document/README.md#getatsdocument2) - Retrieve a document
* [getSigningDocument2](docs/sdks/document/README.md#getsigningdocument2) - Retrieve a document
* [listAtsDocuments2](docs/sdks/document/README.md#listatsdocuments2) - List all documents
* [listSigningDocuments2](docs/sdks/document/README.md#listsigningdocuments2) - List all documents
* [patchAtsDocument2](docs/sdks/document/README.md#patchatsdocument2) - Update a document
* [patchSigningDocument2](docs/sdks/document/README.md#patchsigningdocument2) - Update a document
* [removeAtsDocument2](docs/sdks/document/README.md#removeatsdocument2) - Remove a document
* [removeSigningDocument2](docs/sdks/document/README.md#removesigningdocument2) - Remove a document
* [updateAtsDocument2](docs/sdks/document/README.md#updateatsdocument2) - Update a document
* [updateSigningDocument2](docs/sdks/document/README.md#updatesigningdocument2) - Update a document

### [Embedding](docs/sdks/embedding/README.md)

* [createGenaiEmbedding2](docs/sdks/embedding/README.md#creategenaiembedding2) - Create an embedding

### [Employee](docs/sdks/employee/README.md)

* [createHrisEmployee2](docs/sdks/employee/README.md#createhrisemployee2) - Create an employee
* [getHrisEmployee2](docs/sdks/employee/README.md#gethrisemployee2) - Retrieve an employee
* [listHrisEmployees2](docs/sdks/employee/README.md#listhrisemployees2) - List all employees
* [patchHrisEmployee2](docs/sdks/employee/README.md#patchhrisemployee2) - Update an employee
* [removeHrisEmployee2](docs/sdks/employee/README.md#removehrisemployee2) - Remove an employee
* [updateHrisEmployee2](docs/sdks/employee/README.md#updatehrisemployee2) - Update an employee

### [Enrich](docs/sdks/enrich/README.md)

* [listEnrichCompanies2](docs/sdks/enrich/README.md#listenrichcompanies2) - Retrieve enrichment information for a company
* [listEnrichPeople2](docs/sdks/enrich/README.md#listenrichpeople2) - Retrieve enrichment information for a person

### [Environment](docs/sdks/environment/README.md)

* [createUnifiedEnvironment](docs/sdks/environment/README.md#createunifiedenvironment) - Create new environments
* [listUnifiedEnvironments](docs/sdks/environment/README.md#listunifiedenvironments) - Returns all environments
* [removeUnifiedEnvironment](docs/sdks/environment/README.md#removeunifiedenvironment) - Remove an environment

### [Event](docs/sdks/event/README.md)

* [createAnalyticsEvent2](docs/sdks/event/README.md#createanalyticsevent2) - Create an event
* [createCalendarEvent2](docs/sdks/event/README.md#createcalendarevent2) - Create an event
* [createCrmEvent2](docs/sdks/event/README.md#createcrmevent2) - Create an event
* [getAnalyticsEvent2](docs/sdks/event/README.md#getanalyticsevent2) - Retrieve an event
* [getCalendarEvent2](docs/sdks/event/README.md#getcalendarevent2) - Retrieve an event
* [getClubsEvent2](docs/sdks/event/README.md#getclubsevent2) - Retrieve an event
* [getCrmEvent2](docs/sdks/event/README.md#getcrmevent2) - Retrieve an event
* [listAnalyticsEvents2](docs/sdks/event/README.md#listanalyticsevents2) - List all events
* [listCalendarEvents2](docs/sdks/event/README.md#listcalendarevents2) - List all events
* [listClubsEvents2](docs/sdks/event/README.md#listclubsevents2) - List all events
* [listCrmEvents2](docs/sdks/event/README.md#listcrmevents2) - List all events
* [patchCalendarEvent2](docs/sdks/event/README.md#patchcalendarevent2) - Update an event
* [patchCrmEvent2](docs/sdks/event/README.md#patchcrmevent2) - Update an event
* [patchMessagingEvent2](docs/sdks/event/README.md#patchmessagingevent2) - Update an event
* [removeCalendarEvent2](docs/sdks/event/README.md#removecalendarevent2) - Remove an event
* [removeCrmEvent2](docs/sdks/event/README.md#removecrmevent2) - Remove an event
* [updateCalendarEvent2](docs/sdks/event/README.md#updatecalendarevent2) - Update an event
* [updateCrmEvent2](docs/sdks/event/README.md#updatecrmevent2) - Update an event
* [updateMessagingEvent2](docs/sdks/event/README.md#updatemessagingevent2) - Update an event

### [Expense](docs/sdks/expense/README.md)

* [createAccountingExpense2](docs/sdks/expense/README.md#createaccountingexpense2) - Create an expense
* [getAccountingExpense2](docs/sdks/expense/README.md#getaccountingexpense2) - Retrieve an expense
* [listAccountingExpenses2](docs/sdks/expense/README.md#listaccountingexpenses2) - List all expenses
* [patchAccountingExpense2](docs/sdks/expense/README.md#patchaccountingexpense2) - Update an expense
* [removeAccountingExpense2](docs/sdks/expense/README.md#removeaccountingexpense2) - Remove an expense
* [updateAccountingExpense2](docs/sdks/expense/README.md#updateaccountingexpense2) - Update an expense

### [File](docs/sdks/file/README.md)

* [createStorageFile2](docs/sdks/file/README.md#createstoragefile2) - Create a file
* [getStorageFile2](docs/sdks/file/README.md#getstoragefile2) - Retrieve a file
* [listStorageFiles2](docs/sdks/file/README.md#liststoragefiles2) - List all files
* [patchStorageFile2](docs/sdks/file/README.md#patchstoragefile2) - Update a file
* [removeStorageFile2](docs/sdks/file/README.md#removestoragefile2) - Remove a file
* [updateStorageFile2](docs/sdks/file/README.md#updatestoragefile2) - Update a file

### [Form](docs/sdks/form/README.md)

* [createFormsForm2](docs/sdks/form/README.md#createformsform2) - Create a form
* [getFormsForm2](docs/sdks/form/README.md#getformsform2) - Retrieve a form
* [listFormsForms2](docs/sdks/form/README.md#listformsforms2) - List all forms
* [patchFormsForm2](docs/sdks/form/README.md#patchformsform2) - Update a form
* [removeFormsForm2](docs/sdks/form/README.md#removeformsform2) - Remove a form
* [updateFormsForm2](docs/sdks/form/README.md#updateformsform2) - Update a form

### [Forms](docs/sdks/forms/README.md)

* [createFormsForm2](docs/sdks/forms/README.md#createformsform2) - Create a form
* [getFormsForm2](docs/sdks/forms/README.md#getformsform2) - Retrieve a form
* [getFormsSubmission2](docs/sdks/forms/README.md#getformssubmission2) - Retrieve a submission
* [listFormsForms2](docs/sdks/forms/README.md#listformsforms2) - List all forms
* [listFormsSubmissions2](docs/sdks/forms/README.md#listformssubmissions2) - List all submissions
* [patchFormsForm2](docs/sdks/forms/README.md#patchformsform2) - Update a form
* [removeFormsForm2](docs/sdks/forms/README.md#removeformsform2) - Remove a form
* [updateFormsForm2](docs/sdks/forms/README.md#updateformsform2) - Update a form

### [Genai](docs/sdks/genai/README.md)

* [createGenaiEmbedding2](docs/sdks/genai/README.md#creategenaiembedding2) - Create an embedding
* [createGenaiPrompt2](docs/sdks/genai/README.md#creategenaiprompt2) - Create a prompt
* [getGenaiModel2](docs/sdks/genai/README.md#getgenaimodel2) - Retrieve a model
* [listGenaiModels2](docs/sdks/genai/README.md#listgenaimodels2) - List all models

### [Group](docs/sdks/group/README.md)

* [createAdsGroup2](docs/sdks/group/README.md#createadsgroup2) - Create a group
* [createHrisGroup2](docs/sdks/group/README.md#createhrisgroup2) - Create a group
* [createScimGroups](docs/sdks/group/README.md#createscimgroups) - Create group
* [getAdsGroup2](docs/sdks/group/README.md#getadsgroup2) - Retrieve a group
* [getClubsGroup2](docs/sdks/group/README.md#getclubsgroup2) - Retrieve a group
* [getHrisGroup2](docs/sdks/group/README.md#gethrisgroup2) - Retrieve a group
* [getScimGroups](docs/sdks/group/README.md#getscimgroups) - Get group
* [listAdsGroups2](docs/sdks/group/README.md#listadsgroups2) - List all groups
* [listClubsGroups2](docs/sdks/group/README.md#listclubsgroups2) - List all groups
* [listHrisGroups2](docs/sdks/group/README.md#listhrisgroups2) - List all groups
* [listScimGroups](docs/sdks/group/README.md#listscimgroups) - List groups
* [patchAdsGroup2](docs/sdks/group/README.md#patchadsgroup2) - Update a group
* [patchHrisGroup2](docs/sdks/group/README.md#patchhrisgroup2) - Update a group
* [patchScimGroups](docs/sdks/group/README.md#patchscimgroups) - Update group
* [removeAdsGroup2](docs/sdks/group/README.md#removeadsgroup2) - Remove a group
* [removeHrisGroup2](docs/sdks/group/README.md#removehrisgroup2) - Remove a group
* [removeScimGroups](docs/sdks/group/README.md#removescimgroups) - Delete group
* [updateAdsGroup2](docs/sdks/group/README.md#updateadsgroup2) - Update a group
* [updateHrisGroup2](docs/sdks/group/README.md#updatehrisgroup2) - Update a group
* [updateScimGroups](docs/sdks/group/README.md#updatescimgroups) - Update group

### [Hris](docs/sdks/hris/README.md)

* [createHrisBankaccount2](docs/sdks/hris/README.md#createhrisbankaccount2) - Create a bankaccount
* [createHrisBenefit2](docs/sdks/hris/README.md#createhrisbenefit2) - Create a benefit
* [createHrisCompany2](docs/sdks/hris/README.md#createhriscompany2) - Create a company
* [createHrisDeduction2](docs/sdks/hris/README.md#createhrisdeduction2) - Create a deduction
* [createHrisDevice2](docs/sdks/hris/README.md#createhrisdevice2) - Create a device
* [createHrisEmployee2](docs/sdks/hris/README.md#createhrisemployee2) - Create an employee
* [createHrisGroup2](docs/sdks/hris/README.md#createhrisgroup2) - Create a group
* [createHrisLocation2](docs/sdks/hris/README.md#createhrislocation2) - Create a location
* [createHrisTimeoff2](docs/sdks/hris/README.md#createhristimeoff2) - Create a timeoff
* [createHrisTimeshift2](docs/sdks/hris/README.md#createhristimeshift2) - Create a timeshift
* [getHrisBankaccount2](docs/sdks/hris/README.md#gethrisbankaccount2) - Retrieve a bankaccount
* [getHrisBenefit2](docs/sdks/hris/README.md#gethrisbenefit2) - Retrieve a benefit
* [getHrisCompany2](docs/sdks/hris/README.md#gethriscompany2) - Retrieve a company
* [getHrisDeduction2](docs/sdks/hris/README.md#gethrisdeduction2) - Retrieve a deduction
* [getHrisDevice2](docs/sdks/hris/README.md#gethrisdevice2) - Retrieve a device
* [getHrisEmployee2](docs/sdks/hris/README.md#gethrisemployee2) - Retrieve an employee
* [getHrisGroup2](docs/sdks/hris/README.md#gethrisgroup2) - Retrieve a group
* [getHrisLocation2](docs/sdks/hris/README.md#gethrislocation2) - Retrieve a location
* [getHrisPayslip2](docs/sdks/hris/README.md#gethrispayslip2) - Retrieve a payslip
* [getHrisTimeoff2](docs/sdks/hris/README.md#gethristimeoff2) - Retrieve a timeoff
* [getHrisTimeshift2](docs/sdks/hris/README.md#gethristimeshift2) - Retrieve a timeshift
* [listHrisBankaccounts2](docs/sdks/hris/README.md#listhrisbankaccounts2) - List all bankaccounts
* [listHrisBenefits2](docs/sdks/hris/README.md#listhrisbenefits2) - List all benefits
* [listHrisCompanies2](docs/sdks/hris/README.md#listhriscompanies2) - List all companies
* [listHrisDeductions2](docs/sdks/hris/README.md#listhrisdeductions2) - List all deductions
* [listHrisDevices2](docs/sdks/hris/README.md#listhrisdevices2) - List all devices
* [listHrisEmployees2](docs/sdks/hris/README.md#listhrisemployees2) - List all employees
* [listHrisGroups2](docs/sdks/hris/README.md#listhrisgroups2) - List all groups
* [listHrisLocations2](docs/sdks/hris/README.md#listhrislocations2) - List all locations
* [listHrisPayslips2](docs/sdks/hris/README.md#listhrispayslips2) - List all payslips
* [listHrisTimeoffs2](docs/sdks/hris/README.md#listhristimeoffs2) - List all timeoffs
* [listHrisTimeshifts2](docs/sdks/hris/README.md#listhristimeshifts2) - List all timeshifts
* [patchHrisBankaccount2](docs/sdks/hris/README.md#patchhrisbankaccount2) - Update a bankaccount
* [patchHrisBenefit2](docs/sdks/hris/README.md#patchhrisbenefit2) - Update a benefit
* [patchHrisCompany2](docs/sdks/hris/README.md#patchhriscompany2) - Update a company
* [patchHrisDeduction2](docs/sdks/hris/README.md#patchhrisdeduction2) - Update a deduction
* [patchHrisDevice2](docs/sdks/hris/README.md#patchhrisdevice2) - Update a device
* [patchHrisEmployee2](docs/sdks/hris/README.md#patchhrisemployee2) - Update an employee
* [patchHrisGroup2](docs/sdks/hris/README.md#patchhrisgroup2) - Update a group
* [patchHrisLocation2](docs/sdks/hris/README.md#patchhrislocation2) - Update a location
* [patchHrisTimeoff2](docs/sdks/hris/README.md#patchhristimeoff2) - Update a timeoff
* [patchHrisTimeshift2](docs/sdks/hris/README.md#patchhristimeshift2) - Update a timeshift
* [removeHrisBankaccount2](docs/sdks/hris/README.md#removehrisbankaccount2) - Remove a bankaccount
* [removeHrisBenefit2](docs/sdks/hris/README.md#removehrisbenefit2) - Remove a benefit
* [removeHrisCompany2](docs/sdks/hris/README.md#removehriscompany2) - Remove a company
* [removeHrisDeduction2](docs/sdks/hris/README.md#removehrisdeduction2) - Remove a deduction
* [removeHrisDevice2](docs/sdks/hris/README.md#removehrisdevice2) - Remove a device
* [removeHrisEmployee2](docs/sdks/hris/README.md#removehrisemployee2) - Remove an employee
* [removeHrisGroup2](docs/sdks/hris/README.md#removehrisgroup2) - Remove a group
* [removeHrisLocation2](docs/sdks/hris/README.md#removehrislocation2) - Remove a location
* [removeHrisTimeoff2](docs/sdks/hris/README.md#removehristimeoff2) - Remove a timeoff
* [removeHrisTimeshift2](docs/sdks/hris/README.md#removehristimeshift2) - Remove a timeshift
* [updateHrisBankaccount2](docs/sdks/hris/README.md#updatehrisbankaccount2) - Update a bankaccount
* [updateHrisBenefit2](docs/sdks/hris/README.md#updatehrisbenefit2) - Update a benefit
* [updateHrisCompany2](docs/sdks/hris/README.md#updatehriscompany2) - Update a company
* [updateHrisDeduction2](docs/sdks/hris/README.md#updatehrisdeduction2) - Update a deduction
* [updateHrisDevice2](docs/sdks/hris/README.md#updatehrisdevice2) - Update a device
* [updateHrisEmployee2](docs/sdks/hris/README.md#updatehrisemployee2) - Update an employee
* [updateHrisGroup2](docs/sdks/hris/README.md#updatehrisgroup2) - Update a group
* [updateHrisLocation2](docs/sdks/hris/README.md#updatehrislocation2) - Update a location
* [updateHrisTimeoff2](docs/sdks/hris/README.md#updatehristimeoff2) - Update a timeoff
* [updateHrisTimeshift2](docs/sdks/hris/README.md#updatehristimeshift2) - Update a timeshift

### [Insertionorder](docs/sdks/insertionorder/README.md)

* [createAdsInsertionorder2](docs/sdks/insertionorder/README.md#createadsinsertionorder2) - Create an insertionorder
* [getAdsInsertionorder2](docs/sdks/insertionorder/README.md#getadsinsertionorder2) - Retrieve an insertionorder
* [listAdsInsertionorders2](docs/sdks/insertionorder/README.md#listadsinsertionorders2) - List all insertionorders
* [patchAdsInsertionorder2](docs/sdks/insertionorder/README.md#patchadsinsertionorder2) - Update an insertionorder
* [removeAdsInsertionorder2](docs/sdks/insertionorder/README.md#removeadsinsertionorder2) - Remove an insertionorder
* [updateAdsInsertionorder2](docs/sdks/insertionorder/README.md#updateadsinsertionorder2) - Update an insertionorder

### [Instructor](docs/sdks/instructor/README.md)

* [createLmsInstructor2](docs/sdks/instructor/README.md#createlmsinstructor2) - Create an instructor
* [getLmsInstructor2](docs/sdks/instructor/README.md#getlmsinstructor2) - Retrieve an instructor
* [listLmsInstructors2](docs/sdks/instructor/README.md#listlmsinstructors2) - List all instructors
* [patchLmsInstructor2](docs/sdks/instructor/README.md#patchlmsinstructor2) - Update an instructor
* [removeLmsInstructor2](docs/sdks/instructor/README.md#removelmsinstructor2) - Remove an instructor
* [updateLmsInstructor2](docs/sdks/instructor/README.md#updatelmsinstructor2) - Update an instructor

### [Integration](docs/sdks/integration/README.md)

* [getUnifiedIntegrationAuth](docs/sdks/integration/README.md#getunifiedintegrationauth) - Authorize new connection
* [listUnifiedIntegrationWorkspaces](docs/sdks/integration/README.md#listunifiedintegrationworkspaces) - Returns all activated integrations in a workspace
* [listUnifiedIntegrations](docs/sdks/integration/README.md#listunifiedintegrations) - Returns all integrations

### [Interview](docs/sdks/interview/README.md)

* [createAtsInterview2](docs/sdks/interview/README.md#createatsinterview2) - Create an interview
* [getAtsInterview2](docs/sdks/interview/README.md#getatsinterview2) - Retrieve an interview
* [listAtsInterviews2](docs/sdks/interview/README.md#listatsinterviews2) - List all interviews
* [patchAtsInterview2](docs/sdks/interview/README.md#patchatsinterview2) - Update an interview
* [removeAtsInterview2](docs/sdks/interview/README.md#removeatsinterview2) - Remove an interview
* [updateAtsInterview2](docs/sdks/interview/README.md#updateatsinterview2) - Update an interview

### [Inventory](docs/sdks/inventory/README.md)

* [createCommerceInventory2](docs/sdks/inventory/README.md#createcommerceinventory2) - Create an inventory
* [getCommerceInventory2](docs/sdks/inventory/README.md#getcommerceinventory2) - Retrieve an inventory
* [listCommerceInventories2](docs/sdks/inventory/README.md#listcommerceinventories2) - List all inventories
* [patchCommerceInventory2](docs/sdks/inventory/README.md#patchcommerceinventory2) - Update an inventory
* [removeCommerceInventory2](docs/sdks/inventory/README.md#removecommerceinventory2) - Remove an inventory
* [updateCommerceInventory2](docs/sdks/inventory/README.md#updatecommerceinventory2) - Update an inventory

### [Invoice](docs/sdks/invoice/README.md)

* [createAccountingInvoice2](docs/sdks/invoice/README.md#createaccountinginvoice2) - Create an invoice
* [getAccountingInvoice2](docs/sdks/invoice/README.md#getaccountinginvoice2) - Retrieve an invoice
* [listAccountingInvoices2](docs/sdks/invoice/README.md#listaccountinginvoices2) - List all invoices
* [patchAccountingInvoice2](docs/sdks/invoice/README.md#patchaccountinginvoice2) - Update an invoice
* [removeAccountingInvoice2](docs/sdks/invoice/README.md#removeaccountinginvoice2) - Remove an invoice
* [updateAccountingInvoice2](docs/sdks/invoice/README.md#updateaccountinginvoice2) - Update an invoice

### [Issue](docs/sdks/issue/README.md)

* [getUnifiedIssue](docs/sdks/issue/README.md#getunifiedissue) - Retrieve support issue
* [listUnifiedIssues](docs/sdks/issue/README.md#listunifiedissues) - List support issues

### [Item](docs/sdks/item/README.md)

* [createCommerceItem2](docs/sdks/item/README.md#createcommerceitem2) - Create an item
* [getCommerceItem2](docs/sdks/item/README.md#getcommerceitem2) - Retrieve an item
* [listCommerceItems2](docs/sdks/item/README.md#listcommerceitems2) - List all items
* [patchCommerceItem2](docs/sdks/item/README.md#patchcommerceitem2) - Update an item
* [removeCommerceItem2](docs/sdks/item/README.md#removecommerceitem2) - Remove an item
* [updateCommerceItem2](docs/sdks/item/README.md#updatecommerceitem2) - Update an item

### [Itemvariant](docs/sdks/itemvariant/README.md)

* [createCommerceItemvariant2](docs/sdks/itemvariant/README.md#createcommerceitemvariant2) - Create an itemvariant
* [getCommerceItemvariant2](docs/sdks/itemvariant/README.md#getcommerceitemvariant2) - Retrieve an itemvariant
* [listCommerceItemvariants2](docs/sdks/itemvariant/README.md#listcommerceitemvariants2) - List all itemvariants
* [patchCommerceItemvariant2](docs/sdks/itemvariant/README.md#patchcommerceitemvariant2) - Update an itemvariant
* [removeCommerceItemvariant2](docs/sdks/itemvariant/README.md#removecommerceitemvariant2) - Remove an itemvariant
* [updateCommerceItemvariant2](docs/sdks/itemvariant/README.md#updatecommerceitemvariant2) - Update an itemvariant

### [Job](docs/sdks/job/README.md)

* [createAtsJob2](docs/sdks/job/README.md#createatsjob2) - Create a job
* [getAtsJob2](docs/sdks/job/README.md#getatsjob2) - Retrieve a job
* [listAtsJobs2](docs/sdks/job/README.md#listatsjobs2) - List all jobs
* [patchAtsJob2](docs/sdks/job/README.md#patchatsjob2) - Update a job
* [removeAtsJob2](docs/sdks/job/README.md#removeatsjob2) - Remove a job
* [updateAtsJob2](docs/sdks/job/README.md#updateatsjob2) - Update a job

### [Journal](docs/sdks/journal/README.md)

* [createAccountingJournal2](docs/sdks/journal/README.md#createaccountingjournal2) - Create a journal
* [getAccountingJournal2](docs/sdks/journal/README.md#getaccountingjournal2) - Retrieve a journal
* [listAccountingJournals2](docs/sdks/journal/README.md#listaccountingjournals2) - List all journals
* [patchAccountingJournal2](docs/sdks/journal/README.md#patchaccountingjournal2) - Update a journal
* [removeAccountingJournal2](docs/sdks/journal/README.md#removeaccountingjournal2) - Remove a journal
* [updateAccountingJournal2](docs/sdks/journal/README.md#updateaccountingjournal2) - Update a journal

### [Kms](docs/sdks/kms/README.md)

* [createKmsComment2](docs/sdks/kms/README.md#createkmscomment2) - Create a comment
* [createKmsPage2](docs/sdks/kms/README.md#createkmspage2) - Create a page
* [createKmsSpace2](docs/sdks/kms/README.md#createkmsspace2) - Create a space
* [getKmsComment2](docs/sdks/kms/README.md#getkmscomment2) - Retrieve a comment
* [getKmsPage2](docs/sdks/kms/README.md#getkmspage2) - Retrieve a page
* [getKmsSpace2](docs/sdks/kms/README.md#getkmsspace2) - Retrieve a space
* [listKmsComments2](docs/sdks/kms/README.md#listkmscomments2) - List all comments
* [listKmsPages2](docs/sdks/kms/README.md#listkmspages2) - List all pages
* [listKmsSpaces2](docs/sdks/kms/README.md#listkmsspaces2) - List all spaces
* [patchKmsComment2](docs/sdks/kms/README.md#patchkmscomment2) - Update a comment
* [patchKmsPage2](docs/sdks/kms/README.md#patchkmspage2) - Update a page
* [patchKmsSpace2](docs/sdks/kms/README.md#patchkmsspace2) - Update a space
* [removeKmsComment2](docs/sdks/kms/README.md#removekmscomment2) - Remove a comment
* [removeKmsPage2](docs/sdks/kms/README.md#removekmspage2) - Remove a page
* [removeKmsSpace2](docs/sdks/kms/README.md#removekmsspace2) - Remove a space
* [updateKmsComment2](docs/sdks/kms/README.md#updatekmscomment2) - Update a comment
* [updateKmsPage2](docs/sdks/kms/README.md#updatekmspage2) - Update a page
* [updateKmsSpace2](docs/sdks/kms/README.md#updatekmsspace2) - Update a space

### [Label](docs/sdks/label/README.md)

* [createShippingLabel2](docs/sdks/label/README.md#createshippinglabel2) - Create a label
* [getShippingLabel2](docs/sdks/label/README.md#getshippinglabel2) - Retrieve a label
* [listShippingLabels2](docs/sdks/label/README.md#listshippinglabels2) - List all labels
* [patchShippingLabel2](docs/sdks/label/README.md#patchshippinglabel2) - Update a label
* [removeShippingLabel2](docs/sdks/label/README.md#removeshippinglabel2) - Remove a label
* [updateShippingLabel2](docs/sdks/label/README.md#updateshippinglabel2) - Update a label

### [Lead](docs/sdks/lead/README.md)

* [createCrmLead2](docs/sdks/lead/README.md#createcrmlead2) - Create a lead
* [getCrmLead2](docs/sdks/lead/README.md#getcrmlead2) - Retrieve a lead
* [listCrmLeads2](docs/sdks/lead/README.md#listcrmleads2) - List all leads
* [patchCrmLead2](docs/sdks/lead/README.md#patchcrmlead2) - Update a lead
* [removeCrmLead2](docs/sdks/lead/README.md#removecrmlead2) - Remove a lead
* [updateCrmLead2](docs/sdks/lead/README.md#updatecrmlead2) - Update a lead

### [Link](docs/sdks/link/README.md)

* [createCalendarLink2](docs/sdks/link/README.md#createcalendarlink2) - Create a link
* [createPaymentLink2](docs/sdks/link/README.md#createpaymentlink2) - Create a link
* [getCalendarLink2](docs/sdks/link/README.md#getcalendarlink2) - Retrieve a link
* [getPaymentLink2](docs/sdks/link/README.md#getpaymentlink2) - Retrieve a link
* [listCalendarLinks2](docs/sdks/link/README.md#listcalendarlinks2) - List all links
* [listPaymentLinks2](docs/sdks/link/README.md#listpaymentlinks2) - List all links
* [patchCalendarLink2](docs/sdks/link/README.md#patchcalendarlink2) - Update a link
* [patchPaymentLink2](docs/sdks/link/README.md#patchpaymentlink2) - Update a link
* [removeCalendarLink2](docs/sdks/link/README.md#removecalendarlink2) - Remove a link
* [removePaymentLink2](docs/sdks/link/README.md#removepaymentlink2) - Remove a link
* [updateCalendarLink2](docs/sdks/link/README.md#updatecalendarlink2) - Update a link
* [updatePaymentLink2](docs/sdks/link/README.md#updatepaymentlink2) - Update a link

### [List](docs/sdks/list/README.md)

* [createMartechList2](docs/sdks/list/README.md#createmartechlist2) - Create a list
* [getMartechList2](docs/sdks/list/README.md#getmartechlist2) - Retrieve a list
* [listMartechLists2](docs/sdks/list/README.md#listmartechlists2) - List all lists
* [patchMartechList2](docs/sdks/list/README.md#patchmartechlist2) - Update a list
* [removeMartechList2](docs/sdks/list/README.md#removemartechlist2) - Remove a list
* [updateMartechList2](docs/sdks/list/README.md#updatemartechlist2) - Update a list

### [Lms](docs/sdks/lms/README.md)

* [createLmsActivity2](docs/sdks/lms/README.md#createlmsactivity2) - Create an activity
* [createLmsClass2](docs/sdks/lms/README.md#createlmsclass2) - Create a class
* [createLmsCollection2](docs/sdks/lms/README.md#createlmscollection2) - Create a collection
* [createLmsContent2](docs/sdks/lms/README.md#createlmscontent2) - Create a content
* [createLmsCourse2](docs/sdks/lms/README.md#createlmscourse2) - Create a course
* [createLmsInstructor2](docs/sdks/lms/README.md#createlmsinstructor2) - Create an instructor
* [createLmsStudent2](docs/sdks/lms/README.md#createlmsstudent2) - Create a student
* [getLmsActivity2](docs/sdks/lms/README.md#getlmsactivity2) - Retrieve an activity
* [getLmsClass2](docs/sdks/lms/README.md#getlmsclass2) - Retrieve a class
* [getLmsCollection2](docs/sdks/lms/README.md#getlmscollection2) - Retrieve a collection
* [getLmsContent2](docs/sdks/lms/README.md#getlmscontent2) - Retrieve a content
* [getLmsCourse2](docs/sdks/lms/README.md#getlmscourse2) - Retrieve a course
* [getLmsInstructor2](docs/sdks/lms/README.md#getlmsinstructor2) - Retrieve an instructor
* [getLmsStudent2](docs/sdks/lms/README.md#getlmsstudent2) - Retrieve a student
* [listLmsActivities2](docs/sdks/lms/README.md#listlmsactivities2) - List all activities
* [listLmsClasses2](docs/sdks/lms/README.md#listlmsclasses2) - List all classes
* [listLmsCollections2](docs/sdks/lms/README.md#listlmscollections2) - List all collections
* [listLmsContents2](docs/sdks/lms/README.md#listlmscontents2) - List all contents
* [listLmsCourses2](docs/sdks/lms/README.md#listlmscourses2) - List all courses
* [listLmsInstructors2](docs/sdks/lms/README.md#listlmsinstructors2) - List all instructors
* [listLmsStudents2](docs/sdks/lms/README.md#listlmsstudents2) - List all students
* [patchLmsActivity2](docs/sdks/lms/README.md#patchlmsactivity2) - Update an activity
* [patchLmsClass2](docs/sdks/lms/README.md#patchlmsclass2) - Update a class
* [patchLmsCollection2](docs/sdks/lms/README.md#patchlmscollection2) - Update a collection
* [patchLmsContent2](docs/sdks/lms/README.md#patchlmscontent2) - Update a content
* [patchLmsCourse2](docs/sdks/lms/README.md#patchlmscourse2) - Update a course
* [patchLmsInstructor2](docs/sdks/lms/README.md#patchlmsinstructor2) - Update an instructor
* [patchLmsStudent2](docs/sdks/lms/README.md#patchlmsstudent2) - Update a student
* [removeLmsActivity2](docs/sdks/lms/README.md#removelmsactivity2) - Remove an activity
* [removeLmsClass2](docs/sdks/lms/README.md#removelmsclass2) - Remove a class
* [removeLmsCollection2](docs/sdks/lms/README.md#removelmscollection2) - Remove a collection
* [removeLmsContent2](docs/sdks/lms/README.md#removelmscontent2) - Remove a content
* [removeLmsCourse2](docs/sdks/lms/README.md#removelmscourse2) - Remove a course
* [removeLmsInstructor2](docs/sdks/lms/README.md#removelmsinstructor2) - Remove an instructor
* [removeLmsStudent2](docs/sdks/lms/README.md#removelmsstudent2) - Remove a student
* [updateLmsActivity2](docs/sdks/lms/README.md#updatelmsactivity2) - Update an activity
* [updateLmsClass2](docs/sdks/lms/README.md#updatelmsclass2) - Update a class
* [updateLmsCollection2](docs/sdks/lms/README.md#updatelmscollection2) - Update a collection
* [updateLmsContent2](docs/sdks/lms/README.md#updatelmscontent2) - Update a content
* [updateLmsCourse2](docs/sdks/lms/README.md#updatelmscourse2) - Update a course
* [updateLmsInstructor2](docs/sdks/lms/README.md#updatelmsinstructor2) - Update an instructor
* [updateLmsStudent2](docs/sdks/lms/README.md#updatelmsstudent2) - Update a student

### [Location](docs/sdks/location/README.md)

* [createCommerceLocation2](docs/sdks/location/README.md#createcommercelocation2) - Create a location
* [createHrisLocation2](docs/sdks/location/README.md#createhrislocation2) - Create a location
* [getClubsLocation2](docs/sdks/location/README.md#getclubslocation2) - Retrieve a location
* [getCommerceLocation2](docs/sdks/location/README.md#getcommercelocation2) - Retrieve a location
* [getHrisLocation2](docs/sdks/location/README.md#gethrislocation2) - Retrieve a location
* [listClubsLocations2](docs/sdks/location/README.md#listclubslocations2) - List all locations
* [listCommerceLocations2](docs/sdks/location/README.md#listcommercelocations2) - List all locations
* [listHrisLocations2](docs/sdks/location/README.md#listhrislocations2) - List all locations
* [patchCommerceLocation2](docs/sdks/location/README.md#patchcommercelocation2) - Update a location
* [patchHrisLocation2](docs/sdks/location/README.md#patchhrislocation2) - Update a location
* [removeCommerceLocation2](docs/sdks/location/README.md#removecommercelocation2) - Remove a location
* [removeHrisLocation2](docs/sdks/location/README.md#removehrislocation2) - Remove a location
* [updateCommerceLocation2](docs/sdks/location/README.md#updatecommercelocation2) - Update a location
* [updateHrisLocation2](docs/sdks/location/README.md#updatehrislocation2) - Update a location

### [Login](docs/sdks/login/README.md)

* [getUnifiedIntegrationLogin](docs/sdks/login/README.md#getunifiedintegrationlogin) - Sign in a user

### [Martech](docs/sdks/martech/README.md)

* [createMartechCampaign2](docs/sdks/martech/README.md#createmartechcampaign2) - Create a campaign
* [createMartechList2](docs/sdks/martech/README.md#createmartechlist2) - Create a list
* [createMartechMember2](docs/sdks/martech/README.md#createmartechmember2) - Create a member
* [getMartechCampaign2](docs/sdks/martech/README.md#getmartechcampaign2) - Retrieve a campaign
* [getMartechList2](docs/sdks/martech/README.md#getmartechlist2) - Retrieve a list
* [getMartechMember2](docs/sdks/martech/README.md#getmartechmember2) - Retrieve a member
* [listMartechCampaigns2](docs/sdks/martech/README.md#listmartechcampaigns2) - List all campaigns
* [listMartechLists2](docs/sdks/martech/README.md#listmartechlists2) - List all lists
* [listMartechMembers2](docs/sdks/martech/README.md#listmartechmembers2) - List all members
* [listMartechReports2](docs/sdks/martech/README.md#listmartechreports2) - List all reports
* [patchMartechCampaign2](docs/sdks/martech/README.md#patchmartechcampaign2) - Update a campaign
* [patchMartechList2](docs/sdks/martech/README.md#patchmartechlist2) - Update a list
* [patchMartechMember2](docs/sdks/martech/README.md#patchmartechmember2) - Update a member
* [removeMartechCampaign2](docs/sdks/martech/README.md#removemartechcampaign2) - Remove a campaign
* [removeMartechList2](docs/sdks/martech/README.md#removemartechlist2) - Remove a list
* [removeMartechMember2](docs/sdks/martech/README.md#removemartechmember2) - Remove a member
* [updateMartechCampaign2](docs/sdks/martech/README.md#updatemartechcampaign2) - Update a campaign
* [updateMartechList2](docs/sdks/martech/README.md#updatemartechlist2) - Update a list
* [updateMartechMember2](docs/sdks/martech/README.md#updatemartechmember2) - Update a member

### [Member](docs/sdks/member/README.md)

* [createMartechMember2](docs/sdks/member/README.md#createmartechmember2) - Create a member
* [getClubsMember2](docs/sdks/member/README.md#getclubsmember2) - Retrieve a member
* [getMartechMember2](docs/sdks/member/README.md#getmartechmember2) - Retrieve a member
* [listClubsMembers2](docs/sdks/member/README.md#listclubsmembers2) - List all members
* [listMartechMembers2](docs/sdks/member/README.md#listmartechmembers2) - List all members
* [patchMartechMember2](docs/sdks/member/README.md#patchmartechmember2) - Update a member
* [removeMartechMember2](docs/sdks/member/README.md#removemartechmember2) - Remove a member
* [updateMartechMember2](docs/sdks/member/README.md#updatemartechmember2) - Update a member

### [Message](docs/sdks/message/README.md)

* [createMessagingMessage2](docs/sdks/message/README.md#createmessagingmessage2) - Create a message
* [getMessagingMessage2](docs/sdks/message/README.md#getmessagingmessage2) - Retrieve a message
* [listMessagingMessages2](docs/sdks/message/README.md#listmessagingmessages2) - List all messages
* [patchMessagingMessage2](docs/sdks/message/README.md#patchmessagingmessage2) - Update a message
* [removeMessagingMessage2](docs/sdks/message/README.md#removemessagingmessage2) - Remove a message
* [updateMessagingMessage2](docs/sdks/message/README.md#updatemessagingmessage2) - Update a message

### [Messaging](docs/sdks/messaging/README.md)

* [createMessagingMessage2](docs/sdks/messaging/README.md#createmessagingmessage2) - Create a message
* [getMessagingChannel2](docs/sdks/messaging/README.md#getmessagingchannel2) - Retrieve a channel
* [getMessagingMessage2](docs/sdks/messaging/README.md#getmessagingmessage2) - Retrieve a message
* [listMessagingChannels2](docs/sdks/messaging/README.md#listmessagingchannels2) - List all channels
* [listMessagingMessages2](docs/sdks/messaging/README.md#listmessagingmessages2) - List all messages
* [patchMessagingEvent2](docs/sdks/messaging/README.md#patchmessagingevent2) - Update an event
* [patchMessagingMessage2](docs/sdks/messaging/README.md#patchmessagingmessage2) - Update a message
* [removeMessagingMessage2](docs/sdks/messaging/README.md#removemessagingmessage2) - Remove a message
* [updateMessagingEvent2](docs/sdks/messaging/README.md#updatemessagingevent2) - Update an event
* [updateMessagingMessage2](docs/sdks/messaging/README.md#updatemessagingmessage2) - Update a message

### [Metadata](docs/sdks/metadata/README.md)

* [createMetadataMetadata2](docs/sdks/metadata/README.md#createmetadatametadata2) - Create a metadata
* [getMetadataMetadata2](docs/sdks/metadata/README.md#getmetadatametadata2) - Retrieve a metadata
* [listMetadataMetadatas2](docs/sdks/metadata/README.md#listmetadatametadatas2) - List all metadatas
* [patchMetadataMetadata2](docs/sdks/metadata/README.md#patchmetadatametadata2) - Update a metadata
* [removeMetadataMetadata2](docs/sdks/metadata/README.md#removemetadatametadata2) - Remove a metadata
* [updateMetadataMetadata2](docs/sdks/metadata/README.md#updatemetadatametadata2) - Update a metadata

### [Model](docs/sdks/model/README.md)

* [getGenaiModel2](docs/sdks/model/README.md#getgenaimodel2) - Retrieve a model
* [listGenaiModels2](docs/sdks/model/README.md#listgenaimodels2) - List all models

### [Note](docs/sdks/note/README.md)

* [createTicketingNote2](docs/sdks/note/README.md#createticketingnote2) - Create a note
* [getTicketingNote2](docs/sdks/note/README.md#getticketingnote2) - Retrieve a note
* [listTicketingNotes2](docs/sdks/note/README.md#listticketingnotes2) - List all notes
* [patchTicketingNote2](docs/sdks/note/README.md#patchticketingnote2) - Update a note
* [removeTicketingNote2](docs/sdks/note/README.md#removeticketingnote2) - Remove a note
* [updateTicketingNote2](docs/sdks/note/README.md#updateticketingnote2) - Update a note

### [Order](docs/sdks/order/README.md)

* [createAccountingOrder2](docs/sdks/order/README.md#createaccountingorder2) - Create an order
* [getAccountingOrder2](docs/sdks/order/README.md#getaccountingorder2) - Retrieve an order
* [listAccountingOrders2](docs/sdks/order/README.md#listaccountingorders2) - List all orders
* [patchAccountingOrder2](docs/sdks/order/README.md#patchaccountingorder2) - Update an order
* [patchAssessmentOrder2](docs/sdks/order/README.md#patchassessmentorder2) - Update an order
* [removeAccountingOrder2](docs/sdks/order/README.md#removeaccountingorder2) - Remove an order
* [updateAccountingOrder2](docs/sdks/order/README.md#updateaccountingorder2) - Update an order
* [updateAssessmentOrder2](docs/sdks/order/README.md#updateassessmentorder2) - Update an order

### [Organization](docs/sdks/organization/README.md)

* [createAdsOrganization2](docs/sdks/organization/README.md#createadsorganization2) - Create an organization
* [createRepoOrganization2](docs/sdks/organization/README.md#createrepoorganization2) - Create an organization
* [getAccountingOrganization2](docs/sdks/organization/README.md#getaccountingorganization2) - Retrieve an organization
* [getAdsOrganization2](docs/sdks/organization/README.md#getadsorganization2) - Retrieve an organization
* [getRepoOrganization2](docs/sdks/organization/README.md#getrepoorganization2) - Retrieve an organization
* [listAccountingOrganizations2](docs/sdks/organization/README.md#listaccountingorganizations2) - List all organizations
* [listAdsOrganizations2](docs/sdks/organization/README.md#listadsorganizations2) - List all organizations
* [listRepoOrganizations2](docs/sdks/organization/README.md#listrepoorganizations2) - List all organizations
* [patchAdsOrganization2](docs/sdks/organization/README.md#patchadsorganization2) - Update an organization
* [patchRepoOrganization2](docs/sdks/organization/README.md#patchrepoorganization2) - Update an organization
* [removeAdsOrganization2](docs/sdks/organization/README.md#removeadsorganization2) - Remove an organization
* [removeRepoOrganization2](docs/sdks/organization/README.md#removerepoorganization2) - Remove an organization
* [updateAdsOrganization2](docs/sdks/organization/README.md#updateadsorganization2) - Update an organization
* [updateRepoOrganization2](docs/sdks/organization/README.md#updaterepoorganization2) - Update an organization

### [Package](docs/sdks/package/README.md)

* [createAssessmentPackage2](docs/sdks/package/README.md#createassessmentpackage2) - Create an assessment package
* [getAssessmentPackage2](docs/sdks/package/README.md#getassessmentpackage2) - Get an assessment package
* [getVerificationPackage2](docs/sdks/package/README.md#getverificationpackage2) - Retrieve a package
* [listAssessmentPackages2](docs/sdks/package/README.md#listassessmentpackages2) - List assessment packages
* [listVerificationPackages2](docs/sdks/package/README.md#listverificationpackages2) - List all packages
* [patchAssessmentPackage2](docs/sdks/package/README.md#patchassessmentpackage2) - Update an assessment package
* [removeAssessmentPackage2](docs/sdks/package/README.md#removeassessmentpackage2) - Delete an assessment package
* [updateAssessmentPackage2](docs/sdks/package/README.md#updateassessmentpackage2) - Update an assessment package

### [Page](docs/sdks/page/README.md)

* [createKmsPage2](docs/sdks/page/README.md#createkmspage2) - Create a page
* [getKmsPage2](docs/sdks/page/README.md#getkmspage2) - Retrieve a page
* [listKmsPages2](docs/sdks/page/README.md#listkmspages2) - List all pages
* [patchKmsPage2](docs/sdks/page/README.md#patchkmspage2) - Update a page
* [removeKmsPage2](docs/sdks/page/README.md#removekmspage2) - Remove a page
* [updateKmsPage2](docs/sdks/page/README.md#updatekmspage2) - Update a page

### [Passthrough](docs/sdks/passthrough/README.md)

* [createPassthrough2Json](docs/sdks/passthrough/README.md#createpassthrough2json) - Passthrough POST
* [createPassthrough2Raw](docs/sdks/passthrough/README.md#createpassthrough2raw) - Passthrough POST
* [listPassthroughs2](docs/sdks/passthrough/README.md#listpassthroughs2) - Passthrough GET
* [patchPassthrough2Json](docs/sdks/passthrough/README.md#patchpassthrough2json) - Passthrough PUT
* [patchPassthrough2Raw](docs/sdks/passthrough/README.md#patchpassthrough2raw) - Passthrough PUT
* [removePassthrough2](docs/sdks/passthrough/README.md#removepassthrough2) - Passthrough DELETE
* [updatePassthrough2Json](docs/sdks/passthrough/README.md#updatepassthrough2json) - Passthrough PUT
* [updatePassthrough2Raw](docs/sdks/passthrough/README.md#updatepassthrough2raw) - Passthrough PUT

### [Payment](docs/sdks/payment/README.md)

* [createPaymentLink2](docs/sdks/payment/README.md#createpaymentlink2) - Create a link
* [createPaymentPayment2](docs/sdks/payment/README.md#createpaymentpayment2) - Create a payment
* [createPaymentSubscription2](docs/sdks/payment/README.md#createpaymentsubscription2) - Create a subscription
* [getPaymentLink2](docs/sdks/payment/README.md#getpaymentlink2) - Retrieve a link
* [getPaymentPayment2](docs/sdks/payment/README.md#getpaymentpayment2) - Retrieve a payment
* [getPaymentPayout2](docs/sdks/payment/README.md#getpaymentpayout2) - Retrieve a payout
* [getPaymentRefund2](docs/sdks/payment/README.md#getpaymentrefund2) - Retrieve a refund
* [getPaymentSubscription2](docs/sdks/payment/README.md#getpaymentsubscription2) - Retrieve a subscription
* [listPaymentLinks2](docs/sdks/payment/README.md#listpaymentlinks2) - List all links
* [listPaymentPayments2](docs/sdks/payment/README.md#listpaymentpayments2) - List all payments
* [listPaymentPayouts2](docs/sdks/payment/README.md#listpaymentpayouts2) - List all payouts
* [listPaymentRefunds2](docs/sdks/payment/README.md#listpaymentrefunds2) - List all refunds
* [listPaymentSubscriptions2](docs/sdks/payment/README.md#listpaymentsubscriptions2) - List all subscriptions
* [patchPaymentLink2](docs/sdks/payment/README.md#patchpaymentlink2) - Update a link
* [patchPaymentPayment2](docs/sdks/payment/README.md#patchpaymentpayment2) - Update a payment
* [patchPaymentSubscription2](docs/sdks/payment/README.md#patchpaymentsubscription2) - Update a subscription
* [removePaymentLink2](docs/sdks/payment/README.md#removepaymentlink2) - Remove a link
* [removePaymentPayment2](docs/sdks/payment/README.md#removepaymentpayment2) - Remove a payment
* [removePaymentSubscription2](docs/sdks/payment/README.md#removepaymentsubscription2) - Remove a subscription
* [updatePaymentLink2](docs/sdks/payment/README.md#updatepaymentlink2) - Update a link
* [updatePaymentPayment2](docs/sdks/payment/README.md#updatepaymentpayment2) - Update a payment
* [updatePaymentSubscription2](docs/sdks/payment/README.md#updatepaymentsubscription2) - Update a subscription

### [Payout](docs/sdks/payout/README.md)

* [getPaymentPayout2](docs/sdks/payout/README.md#getpaymentpayout2) - Retrieve a payout
* [listPaymentPayouts2](docs/sdks/payout/README.md#listpaymentpayouts2) - List all payouts

### [Payslip](docs/sdks/payslip/README.md)

* [getHrisPayslip2](docs/sdks/payslip/README.md#gethrispayslip2) - Retrieve a payslip
* [listHrisPayslips2](docs/sdks/payslip/README.md#listhrispayslips2) - List all payslips

### [Person](docs/sdks/person/README.md)

* [listEnrichPeople2](docs/sdks/person/README.md#listenrichpeople2) - Retrieve enrichment information for a person

### [Pipeline](docs/sdks/pipeline/README.md)

* [createCrmPipeline2](docs/sdks/pipeline/README.md#createcrmpipeline2) - Create a pipeline
* [getCrmPipeline2](docs/sdks/pipeline/README.md#getcrmpipeline2) - Retrieve a pipeline
* [listCrmPipelines2](docs/sdks/pipeline/README.md#listcrmpipelines2) - List all pipelines
* [patchCrmPipeline2](docs/sdks/pipeline/README.md#patchcrmpipeline2) - Update a pipeline
* [removeCrmPipeline2](docs/sdks/pipeline/README.md#removecrmpipeline2) - Remove a pipeline
* [updateCrmPipeline2](docs/sdks/pipeline/README.md#updatecrmpipeline2) - Update a pipeline

### [Profitloss](docs/sdks/profitloss/README.md)

* [getAccountingProfitloss2](docs/sdks/profitloss/README.md#getaccountingprofitloss2) - Retrieve a profitloss
* [listAccountingProfitlosses2](docs/sdks/profitloss/README.md#listaccountingprofitlosses2) - List all profitlosses

### [Project](docs/sdks/project/README.md)

* [createTaskProject2](docs/sdks/project/README.md#createtaskproject2) - Create a project
* [getTaskProject2](docs/sdks/project/README.md#gettaskproject2) - Retrieve a project
* [listTaskProjects2](docs/sdks/project/README.md#listtaskprojects2) - List all projects
* [patchTaskProject2](docs/sdks/project/README.md#patchtaskproject2) - Update a project
* [removeTaskProject2](docs/sdks/project/README.md#removetaskproject2) - Remove a project
* [updateTaskProject2](docs/sdks/project/README.md#updatetaskproject2) - Update a project

### [Promoted](docs/sdks/promoted/README.md)

* [getAdsPromoted2](docs/sdks/promoted/README.md#getadspromoted2) - Retrieve a promoted
* [listAdsPromoteds2](docs/sdks/promoted/README.md#listadspromoteds2) - List all promoteds

### [Prompt](docs/sdks/prompt/README.md)

* [createGenaiPrompt2](docs/sdks/prompt/README.md#creategenaiprompt2) - Create a prompt

### [Property](docs/sdks/property/README.md)

* [createAnalyticsProperty2](docs/sdks/property/README.md#createanalyticsproperty2) - Create a property
* [getAnalyticsProperty2](docs/sdks/property/README.md#getanalyticsproperty2) - Retrieve a property
* [listAnalyticsProperties2](docs/sdks/property/README.md#listanalyticsproperties2) - List all properties
* [patchAnalyticsProperty2](docs/sdks/property/README.md#patchanalyticsproperty2) - Update a property
* [removeAnalyticsProperty2](docs/sdks/property/README.md#removeanalyticsproperty2) - Remove a property
* [updateAnalyticsProperty2](docs/sdks/property/README.md#updateanalyticsproperty2) - Update a property

### [Pullrequest](docs/sdks/pullrequest/README.md)

* [createRepoPullrequest2](docs/sdks/pullrequest/README.md#createrepopullrequest2) - Create a pullrequest
* [getRepoPullrequest2](docs/sdks/pullrequest/README.md#getrepopullrequest2) - Retrieve a pullrequest
* [listRepoPullrequests2](docs/sdks/pullrequest/README.md#listrepopullrequests2) - List all pullrequests
* [patchRepoPullrequest2](docs/sdks/pullrequest/README.md#patchrepopullrequest2) - Update a pullrequest
* [removeRepoPullrequest2](docs/sdks/pullrequest/README.md#removerepopullrequest2) - Remove a pullrequest
* [updateRepoPullrequest2](docs/sdks/pullrequest/README.md#updaterepopullrequest2) - Update a pullrequest

### [Purchaseorder](docs/sdks/purchaseorder/README.md)

* [createAccountingPurchaseorder2](docs/sdks/purchaseorder/README.md#createaccountingpurchaseorder2) - Create a purchaseorder
* [getAccountingPurchaseorder2](docs/sdks/purchaseorder/README.md#getaccountingpurchaseorder2) - Retrieve a purchaseorder
* [listAccountingPurchaseorders2](docs/sdks/purchaseorder/README.md#listaccountingpurchaseorders2) - List all purchaseorders
* [patchAccountingPurchaseorder2](docs/sdks/purchaseorder/README.md#patchaccountingpurchaseorder2) - Update a purchaseorder
* [removeAccountingPurchaseorder2](docs/sdks/purchaseorder/README.md#removeaccountingpurchaseorder2) - Remove a purchaseorder
* [updateAccountingPurchaseorder2](docs/sdks/purchaseorder/README.md#updateaccountingpurchaseorder2) - Update a purchaseorder

### [Query](docs/sdks/query/README.md)

* [createDatastoreQuery2](docs/sdks/query/README.md#createdatastorequery2) - Create a query

### [Rate](docs/sdks/rate/README.md)

* [createShippingRate2](docs/sdks/rate/README.md#createshippingrate2) - Create a rate

### [Record](docs/sdks/record/README.md)

* [createDatastoreRecord2](docs/sdks/record/README.md#createdatastorerecord2) - Create a record
* [getDatastoreRecord2](docs/sdks/record/README.md#getdatastorerecord2) - Retrieve a record
* [listDatastoreRecords2](docs/sdks/record/README.md#listdatastorerecords2) - List all records
* [patchDatastoreRecord2](docs/sdks/record/README.md#patchdatastorerecord2) - Update a record
* [removeDatastoreRecord2](docs/sdks/record/README.md#removedatastorerecord2) - Remove a record
* [updateDatastoreRecord2](docs/sdks/record/README.md#updatedatastorerecord2) - Update a record

### [Recording](docs/sdks/recording/README.md)

* [createUcRecording2](docs/sdks/recording/README.md#createucrecording2) - Create a recording
* [getCalendarRecording2](docs/sdks/recording/README.md#getcalendarrecording2) - Retrieve a recording
* [getUcRecording2](docs/sdks/recording/README.md#getucrecording2) - Retrieve a recording
* [listCalendarRecordings2](docs/sdks/recording/README.md#listcalendarrecordings2) - List all recordings
* [listUcRecordings2](docs/sdks/recording/README.md#listucrecordings2) - List all recordings
* [patchUcRecording2](docs/sdks/recording/README.md#patchucrecording2) - Update a recording
* [removeUcRecording2](docs/sdks/recording/README.md#removeucrecording2) - Remove a recording
* [updateUcRecording2](docs/sdks/recording/README.md#updateucrecording2) - Update a recording

### [Refund](docs/sdks/refund/README.md)

* [getPaymentRefund2](docs/sdks/refund/README.md#getpaymentrefund2) - Retrieve a refund
* [listPaymentRefunds2](docs/sdks/refund/README.md#listpaymentrefunds2) - List all refunds

### [Repo](docs/sdks/repo/README.md)

* [createRepoBranch2](docs/sdks/repo/README.md#createrepobranch2) - Create a branch
* [createRepoCommit2](docs/sdks/repo/README.md#createrepocommit2) - Create a commit
* [createRepoOrganization2](docs/sdks/repo/README.md#createrepoorganization2) - Create an organization
* [createRepoPullrequest2](docs/sdks/repo/README.md#createrepopullrequest2) - Create a pullrequest
* [createRepoRepository2](docs/sdks/repo/README.md#createreporepository2) - Create a repository
* [getRepoBranch2](docs/sdks/repo/README.md#getrepobranch2) - Retrieve a branch
* [getRepoCommit2](docs/sdks/repo/README.md#getrepocommit2) - Retrieve a commit
* [getRepoOrganization2](docs/sdks/repo/README.md#getrepoorganization2) - Retrieve an organization
* [getRepoPullrequest2](docs/sdks/repo/README.md#getrepopullrequest2) - Retrieve a pullrequest
* [getRepoRepository2](docs/sdks/repo/README.md#getreporepository2) - Retrieve a repository
* [listRepoBranches2](docs/sdks/repo/README.md#listrepobranches2) - List all branches
* [listRepoCommits2](docs/sdks/repo/README.md#listrepocommits2) - List all commits
* [listRepoOrganizations2](docs/sdks/repo/README.md#listrepoorganizations2) - List all organizations
* [listRepoPullrequests2](docs/sdks/repo/README.md#listrepopullrequests2) - List all pullrequests
* [listRepoRepositories2](docs/sdks/repo/README.md#listreporepositories2) - List all repositories
* [patchRepoBranch2](docs/sdks/repo/README.md#patchrepobranch2) - Update a branch
* [patchRepoCommit2](docs/sdks/repo/README.md#patchrepocommit2) - Update a commit
* [patchRepoOrganization2](docs/sdks/repo/README.md#patchrepoorganization2) - Update an organization
* [patchRepoPullrequest2](docs/sdks/repo/README.md#patchrepopullrequest2) - Update a pullrequest
* [patchRepoRepository2](docs/sdks/repo/README.md#patchreporepository2) - Update a repository
* [removeRepoBranch2](docs/sdks/repo/README.md#removerepobranch2) - Remove a branch
* [removeRepoCommit2](docs/sdks/repo/README.md#removerepocommit2) - Remove a commit
* [removeRepoOrganization2](docs/sdks/repo/README.md#removerepoorganization2) - Remove an organization
* [removeRepoPullrequest2](docs/sdks/repo/README.md#removerepopullrequest2) - Remove a pullrequest
* [removeRepoRepository2](docs/sdks/repo/README.md#removereporepository2) - Remove a repository
* [updateRepoBranch2](docs/sdks/repo/README.md#updaterepobranch2) - Update a branch
* [updateRepoCommit2](docs/sdks/repo/README.md#updaterepocommit2) - Update a commit
* [updateRepoOrganization2](docs/sdks/repo/README.md#updaterepoorganization2) - Update an organization
* [updateRepoPullrequest2](docs/sdks/repo/README.md#updaterepopullrequest2) - Update a pullrequest
* [updateRepoRepository2](docs/sdks/repo/README.md#updatereporepository2) - Update a repository

### [Report](docs/sdks/report/README.md)

* [getAccountingReport2](docs/sdks/report/README.md#getaccountingreport2) - Retrieve a report
* [listAccountingReports2](docs/sdks/report/README.md#listaccountingreports2) - List all reports
* [listAdsReports2](docs/sdks/report/README.md#listadsreports2) - List all reports
* [listAnalyticsReports2](docs/sdks/report/README.md#listanalyticsreports2) - List all reports
* [listMartechReports2](docs/sdks/report/README.md#listmartechreports2) - List all reports

### [Repository](docs/sdks/repository/README.md)

* [createRepoRepository2](docs/sdks/repository/README.md#createreporepository2) - Create a repository
* [getRepoRepository2](docs/sdks/repository/README.md#getreporepository2) - Retrieve a repository
* [listRepoRepositories2](docs/sdks/repository/README.md#listreporepositories2) - List all repositories
* [patchRepoRepository2](docs/sdks/repository/README.md#patchreporepository2) - Update a repository
* [removeRepoRepository2](docs/sdks/repository/README.md#removereporepository2) - Remove a repository
* [updateRepoRepository2](docs/sdks/repository/README.md#updatereporepository2) - Update a repository

### [Request](docs/sdks/request/README.md)

* [createVerificationRequest2](docs/sdks/request/README.md#createverificationrequest2) - Create a request
* [getVerificationRequest2](docs/sdks/request/README.md#getverificationrequest2) - Retrieve a request
* [listVerificationRequests2](docs/sdks/request/README.md#listverificationrequests2) - List all requests
* [patchVerificationRequest2](docs/sdks/request/README.md#patchverificationrequest2) - Update a request
* [removeVerificationRequest2](docs/sdks/request/README.md#removeverificationrequest2) - Remove a request
* [updateVerificationRequest2](docs/sdks/request/README.md#updateverificationrequest2) - Update a request

### [Reservation](docs/sdks/reservation/README.md)

* [createCommerceReservation2](docs/sdks/reservation/README.md#createcommercereservation2) - Create a reservation
* [getCommerceReservation2](docs/sdks/reservation/README.md#getcommercereservation2) - Retrieve a reservation
* [listCommerceReservations2](docs/sdks/reservation/README.md#listcommercereservations2) - List all reservations
* [patchCommerceReservation2](docs/sdks/reservation/README.md#patchcommercereservation2) - Update a reservation
* [removeCommerceReservation2](docs/sdks/reservation/README.md#removecommercereservation2) - Remove a reservation
* [updateCommerceReservation2](docs/sdks/reservation/README.md#updatecommercereservation2) - Update a reservation

### [Review](docs/sdks/review/README.md)

* [createCommerceReview2](docs/sdks/review/README.md#createcommercereview2) - Create a review
* [getCommerceReview2](docs/sdks/review/README.md#getcommercereview2) - Retrieve a review
* [listCommerceReviews2](docs/sdks/review/README.md#listcommercereviews2) - List all reviews
* [patchCommerceReview2](docs/sdks/review/README.md#patchcommercereview2) - Update a review
* [removeCommerceReview2](docs/sdks/review/README.md#removecommercereview2) - Remove a review
* [updateCommerceReview2](docs/sdks/review/README.md#updatecommercereview2) - Update a review

### [Saleschannel](docs/sdks/saleschannel/README.md)

* [createCommerceSaleschannel2](docs/sdks/saleschannel/README.md#createcommercesaleschannel2) - Create a saleschannel
* [getCommerceSaleschannel2](docs/sdks/saleschannel/README.md#getcommercesaleschannel2) - Retrieve a saleschannel
* [listCommerceSaleschannels2](docs/sdks/saleschannel/README.md#listcommercesaleschannels2) - List all saleschannels
* [patchCommerceSaleschannel2](docs/sdks/saleschannel/README.md#patchcommercesaleschannel2) - Update a saleschannel
* [removeCommerceSaleschannel2](docs/sdks/saleschannel/README.md#removecommercesaleschannel2) - Remove a saleschannel
* [updateCommerceSaleschannel2](docs/sdks/saleschannel/README.md#updatecommercesaleschannel2) - Update a saleschannel

### [Salesorder](docs/sdks/salesorder/README.md)

* [createAccountingSalesorder2](docs/sdks/salesorder/README.md#createaccountingsalesorder2) - Create a salesorder
* [getAccountingSalesorder2](docs/sdks/salesorder/README.md#getaccountingsalesorder2) - Retrieve a salesorder
* [listAccountingSalesorders2](docs/sdks/salesorder/README.md#listaccountingsalesorders2) - List all salesorders
* [patchAccountingSalesorder2](docs/sdks/salesorder/README.md#patchaccountingsalesorder2) - Update a salesorder
* [removeAccountingSalesorder2](docs/sdks/salesorder/README.md#removeaccountingsalesorder2) - Remove a salesorder
* [updateAccountingSalesorder2](docs/sdks/salesorder/README.md#updateaccountingsalesorder2) - Update a salesorder

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

* [createAtsScorecard2](docs/sdks/scorecard/README.md#createatsscorecard2) - Create a scorecard
* [getAtsScorecard2](docs/sdks/scorecard/README.md#getatsscorecard2) - Retrieve a scorecard
* [listAtsScorecards2](docs/sdks/scorecard/README.md#listatsscorecards2) - List all scorecards
* [patchAtsScorecard2](docs/sdks/scorecard/README.md#patchatsscorecard2) - Update a scorecard
* [removeAtsScorecard2](docs/sdks/scorecard/README.md#removeatsscorecard2) - Remove a scorecard
* [updateAtsScorecard2](docs/sdks/scorecard/README.md#updateatsscorecard2) - Update a scorecard

### [Secretsmanager](docs/sdks/secretsmanager/README.md)

* [createUnifiedWorkspaceSecretsmanager](docs/sdks/secretsmanager/README.md#createunifiedworkspacesecretsmanager) - Create secrets manager
* [getUnifiedWorkspaceSecretsmanager](docs/sdks/secretsmanager/README.md#getunifiedworkspacesecretsmanager) - Retrieve secrets manager
* [listUnifiedWorkspaceSecretsmanagers](docs/sdks/secretsmanager/README.md#listunifiedworkspacesecretsmanagers) - List secrets managers
* [removeUnifiedWorkspaceSecretsmanager](docs/sdks/secretsmanager/README.md#removeunifiedworkspacesecretsmanager) - Remove secrets manager

### [Session](docs/sdks/session/README.md)

* [getAnalyticsSession2](docs/sdks/session/README.md#getanalyticssession2) - Retrieve a session
* [listAnalyticsSessions2](docs/sdks/session/README.md#listanalyticssessions2) - List all sessions

### [Shipment](docs/sdks/shipment/README.md)

* [createShippingShipment2](docs/sdks/shipment/README.md#createshippingshipment2) - Create a shipment
* [getShippingShipment2](docs/sdks/shipment/README.md#getshippingshipment2) - Retrieve a shipment
* [listShippingShipments2](docs/sdks/shipment/README.md#listshippingshipments2) - List all shipments
* [patchShippingShipment2](docs/sdks/shipment/README.md#patchshippingshipment2) - Update a shipment
* [removeShippingShipment2](docs/sdks/shipment/README.md#removeshippingshipment2) - Remove a shipment
* [updateShippingShipment2](docs/sdks/shipment/README.md#updateshippingshipment2) - Update a shipment

### [Shipping](docs/sdks/shipping/README.md)

* [createShippingLabel2](docs/sdks/shipping/README.md#createshippinglabel2) - Create a label
* [createShippingRate2](docs/sdks/shipping/README.md#createshippingrate2) - Create a rate
* [createShippingShipment2](docs/sdks/shipping/README.md#createshippingshipment2) - Create a shipment
* [getShippingCarrier2](docs/sdks/shipping/README.md#getshippingcarrier2) - Retrieve a carrier
* [getShippingLabel2](docs/sdks/shipping/README.md#getshippinglabel2) - Retrieve a label
* [getShippingShipment2](docs/sdks/shipping/README.md#getshippingshipment2) - Retrieve a shipment
* [getShippingTracking2](docs/sdks/shipping/README.md#getshippingtracking2) - Retrieve a tracking
* [listShippingCarriers2](docs/sdks/shipping/README.md#listshippingcarriers2) - List all carriers
* [listShippingLabels2](docs/sdks/shipping/README.md#listshippinglabels2) - List all labels
* [listShippingShipments2](docs/sdks/shipping/README.md#listshippingshipments2) - List all shipments
* [listShippingTrackings2](docs/sdks/shipping/README.md#listshippingtrackings2) - List all trackings
* [patchShippingLabel2](docs/sdks/shipping/README.md#patchshippinglabel2) - Update a label
* [patchShippingShipment2](docs/sdks/shipping/README.md#patchshippingshipment2) - Update a shipment
* [removeShippingLabel2](docs/sdks/shipping/README.md#removeshippinglabel2) - Remove a label
* [removeShippingShipment2](docs/sdks/shipping/README.md#removeshippingshipment2) - Remove a shipment
* [updateShippingLabel2](docs/sdks/shipping/README.md#updateshippinglabel2) - Update a label
* [updateShippingShipment2](docs/sdks/shipping/README.md#updateshippingshipment2) - Update a shipment

### [Signatory](docs/sdks/signatory/README.md)

* [createSigningSignatory2](docs/sdks/signatory/README.md#createsigningsignatory2) - Create a signatory
* [getSigningSignatory2](docs/sdks/signatory/README.md#getsigningsignatory2) - Retrieve a signatory
* [listSigningSignatories2](docs/sdks/signatory/README.md#listsigningsignatories2) - List all signatories
* [patchSigningSignatory2](docs/sdks/signatory/README.md#patchsigningsignatory2) - Update a signatory
* [removeSigningSignatory2](docs/sdks/signatory/README.md#removesigningsignatory2) - Remove a signatory
* [updateSigningSignatory2](docs/sdks/signatory/README.md#updatesigningsignatory2) - Update a signatory

### [Signing](docs/sdks/signing/README.md)

* [createSigningDocument2](docs/sdks/signing/README.md#createsigningdocument2) - Create a document
* [createSigningSignatory2](docs/sdks/signing/README.md#createsigningsignatory2) - Create a signatory
* [getSigningDocument2](docs/sdks/signing/README.md#getsigningdocument2) - Retrieve a document
* [getSigningSignatory2](docs/sdks/signing/README.md#getsigningsignatory2) - Retrieve a signatory
* [getSigningTemplate2](docs/sdks/signing/README.md#getsigningtemplate2) - Retrieve a template
* [listSigningDocuments2](docs/sdks/signing/README.md#listsigningdocuments2) - List all documents
* [listSigningSignatories2](docs/sdks/signing/README.md#listsigningsignatories2) - List all signatories
* [listSigningTemplates2](docs/sdks/signing/README.md#listsigningtemplates2) - List all templates
* [patchSigningDocument2](docs/sdks/signing/README.md#patchsigningdocument2) - Update a document
* [patchSigningSignatory2](docs/sdks/signing/README.md#patchsigningsignatory2) - Update a signatory
* [removeSigningDocument2](docs/sdks/signing/README.md#removesigningdocument2) - Remove a document
* [removeSigningSignatory2](docs/sdks/signing/README.md#removesigningsignatory2) - Remove a signatory
* [updateSigningDocument2](docs/sdks/signing/README.md#updatesigningdocument2) - Update a document
* [updateSigningSignatory2](docs/sdks/signing/README.md#updatesigningsignatory2) - Update a signatory

### [Space](docs/sdks/space/README.md)

* [createKmsSpace2](docs/sdks/space/README.md#createkmsspace2) - Create a space
* [getKmsSpace2](docs/sdks/space/README.md#getkmsspace2) - Retrieve a space
* [listKmsSpaces2](docs/sdks/space/README.md#listkmsspaces2) - List all spaces
* [patchKmsSpace2](docs/sdks/space/README.md#patchkmsspace2) - Update a space
* [removeKmsSpace2](docs/sdks/space/README.md#removekmsspace2) - Remove a space
* [updateKmsSpace2](docs/sdks/space/README.md#updatekmsspace2) - Update a space

### [Storage](docs/sdks/storage/README.md)

* [createStorageFile2](docs/sdks/storage/README.md#createstoragefile2) - Create a file
* [getStorageFile2](docs/sdks/storage/README.md#getstoragefile2) - Retrieve a file
* [listStorageFiles2](docs/sdks/storage/README.md#liststoragefiles2) - List all files
* [patchStorageFile2](docs/sdks/storage/README.md#patchstoragefile2) - Update a file
* [removeStorageFile2](docs/sdks/storage/README.md#removestoragefile2) - Remove a file
* [updateStorageFile2](docs/sdks/storage/README.md#updatestoragefile2) - Update a file

### [Student](docs/sdks/student/README.md)

* [createLmsStudent2](docs/sdks/student/README.md#createlmsstudent2) - Create a student
* [getLmsStudent2](docs/sdks/student/README.md#getlmsstudent2) - Retrieve a student
* [listLmsStudents2](docs/sdks/student/README.md#listlmsstudents2) - List all students
* [patchLmsStudent2](docs/sdks/student/README.md#patchlmsstudent2) - Update a student
* [removeLmsStudent2](docs/sdks/student/README.md#removelmsstudent2) - Remove a student
* [updateLmsStudent2](docs/sdks/student/README.md#updatelmsstudent2) - Update a student

### [Submission](docs/sdks/submission/README.md)

* [getFormsSubmission2](docs/sdks/submission/README.md#getformssubmission2) - Retrieve a submission
* [listFormsSubmissions2](docs/sdks/submission/README.md#listformssubmissions2) - List all submissions

### [Subscription](docs/sdks/subscription/README.md)

* [createPaymentSubscription2](docs/sdks/subscription/README.md#createpaymentsubscription2) - Create a subscription
* [getPaymentSubscription2](docs/sdks/subscription/README.md#getpaymentsubscription2) - Retrieve a subscription
* [listPaymentSubscriptions2](docs/sdks/subscription/README.md#listpaymentsubscriptions2) - List all subscriptions
* [patchPaymentSubscription2](docs/sdks/subscription/README.md#patchpaymentsubscription2) - Update a subscription
* [removePaymentSubscription2](docs/sdks/subscription/README.md#removepaymentsubscription2) - Remove a subscription
* [updatePaymentSubscription2](docs/sdks/subscription/README.md#updatepaymentsubscription2) - Update a subscription

### [Table](docs/sdks/table/README.md)

* [createDatastoreTable2](docs/sdks/table/README.md#createdatastoretable2) - Create a table
* [getDatastoreTable2](docs/sdks/table/README.md#getdatastoretable2) - Retrieve a table
* [listDatastoreTables2](docs/sdks/table/README.md#listdatastoretables2) - List all tables
* [patchDatastoreTable2](docs/sdks/table/README.md#patchdatastoretable2) - Update a table
* [removeDatastoreTable2](docs/sdks/table/README.md#removedatastoretable2) - Remove a table
* [updateDatastoreTable2](docs/sdks/table/README.md#updatedatastoretable2) - Update a table

### [Target](docs/sdks/target/README.md)

* [getAdsTarget2](docs/sdks/target/README.md#getadstarget2) - Retrieve a target
* [listAdsTargets2](docs/sdks/target/README.md#listadstargets2) - List all targets

### [Task](docs/sdks/task/README.md)

* [createTaskComment2](docs/sdks/task/README.md#createtaskcomment2) - Create a comment
* [createTaskProject2](docs/sdks/task/README.md#createtaskproject2) - Create a project
* [createTaskTask2](docs/sdks/task/README.md#createtasktask2) - Create a task
* [getTaskChange2](docs/sdks/task/README.md#gettaskchange2) - Retrieve a change
* [getTaskComment2](docs/sdks/task/README.md#gettaskcomment2) - Retrieve a comment
* [getTaskProject2](docs/sdks/task/README.md#gettaskproject2) - Retrieve a project
* [getTaskTask2](docs/sdks/task/README.md#gettasktask2) - Retrieve a task
* [listTaskChanges2](docs/sdks/task/README.md#listtaskchanges2) - List all changes
* [listTaskComments2](docs/sdks/task/README.md#listtaskcomments2) - List all comments
* [listTaskProjects2](docs/sdks/task/README.md#listtaskprojects2) - List all projects
* [listTaskTasks2](docs/sdks/task/README.md#listtasktasks2) - List all tasks
* [patchTaskComment2](docs/sdks/task/README.md#patchtaskcomment2) - Update a comment
* [patchTaskProject2](docs/sdks/task/README.md#patchtaskproject2) - Update a project
* [patchTaskTask2](docs/sdks/task/README.md#patchtasktask2) - Update a task
* [removeTaskComment2](docs/sdks/task/README.md#removetaskcomment2) - Remove a comment
* [removeTaskProject2](docs/sdks/task/README.md#removetaskproject2) - Remove a project
* [removeTaskTask2](docs/sdks/task/README.md#removetasktask2) - Remove a task
* [updateTaskComment2](docs/sdks/task/README.md#updatetaskcomment2) - Update a comment
* [updateTaskProject2](docs/sdks/task/README.md#updatetaskproject2) - Update a project
* [updateTaskTask2](docs/sdks/task/README.md#updatetasktask2) - Update a task

### [Taxrate](docs/sdks/taxrate/README.md)

* [createAccountingTaxrate2](docs/sdks/taxrate/README.md#createaccountingtaxrate2) - Create a taxrate
* [getAccountingTaxrate2](docs/sdks/taxrate/README.md#getaccountingtaxrate2) - Retrieve a taxrate
* [listAccountingTaxrates2](docs/sdks/taxrate/README.md#listaccountingtaxrates2) - List all taxrates
* [patchAccountingTaxrate2](docs/sdks/taxrate/README.md#patchaccountingtaxrate2) - Update a taxrate
* [removeAccountingTaxrate2](docs/sdks/taxrate/README.md#removeaccountingtaxrate2) - Remove a taxrate
* [updateAccountingTaxrate2](docs/sdks/taxrate/README.md#updateaccountingtaxrate2) - Update a taxrate

### [Template](docs/sdks/template/README.md)

* [getSigningTemplate2](docs/sdks/template/README.md#getsigningtemplate2) - Retrieve a template
* [listSigningTemplates2](docs/sdks/template/README.md#listsigningtemplates2) - List all templates

### [Ticket](docs/sdks/ticket/README.md)

* [createTicketingTicket2](docs/sdks/ticket/README.md#createticketingticket2) - Create a ticket
* [getTicketingTicket2](docs/sdks/ticket/README.md#getticketingticket2) - Retrieve a ticket
* [listTicketingTickets2](docs/sdks/ticket/README.md#listticketingtickets2) - List all tickets
* [patchTicketingTicket2](docs/sdks/ticket/README.md#patchticketingticket2) - Update a ticket
* [removeTicketingTicket2](docs/sdks/ticket/README.md#removeticketingticket2) - Remove a ticket
* [updateTicketingTicket2](docs/sdks/ticket/README.md#updateticketingticket2) - Update a ticket

### [Ticketing](docs/sdks/ticketing/README.md)

* [createTicketingCategory2](docs/sdks/ticketing/README.md#createticketingcategory2) - Create a category
* [createTicketingCustomer2](docs/sdks/ticketing/README.md#createticketingcustomer2) - Create a customer
* [createTicketingNote2](docs/sdks/ticketing/README.md#createticketingnote2) - Create a note
* [createTicketingTicket2](docs/sdks/ticketing/README.md#createticketingticket2) - Create a ticket
* [getTicketingCategory2](docs/sdks/ticketing/README.md#getticketingcategory2) - Retrieve a category
* [getTicketingCustomer2](docs/sdks/ticketing/README.md#getticketingcustomer2) - Retrieve a customer
* [getTicketingNote2](docs/sdks/ticketing/README.md#getticketingnote2) - Retrieve a note
* [getTicketingTicket2](docs/sdks/ticketing/README.md#getticketingticket2) - Retrieve a ticket
* [listTicketingCategories2](docs/sdks/ticketing/README.md#listticketingcategories2) - List all categories
* [listTicketingCustomers2](docs/sdks/ticketing/README.md#listticketingcustomers2) - List all customers
* [listTicketingNotes2](docs/sdks/ticketing/README.md#listticketingnotes2) - List all notes
* [listTicketingTickets2](docs/sdks/ticketing/README.md#listticketingtickets2) - List all tickets
* [patchTicketingCategory2](docs/sdks/ticketing/README.md#patchticketingcategory2) - Update a category
* [patchTicketingCustomer2](docs/sdks/ticketing/README.md#patchticketingcustomer2) - Update a customer
* [patchTicketingNote2](docs/sdks/ticketing/README.md#patchticketingnote2) - Update a note
* [patchTicketingTicket2](docs/sdks/ticketing/README.md#patchticketingticket2) - Update a ticket
* [removeTicketingCategory2](docs/sdks/ticketing/README.md#removeticketingcategory2) - Remove a category
* [removeTicketingCustomer2](docs/sdks/ticketing/README.md#removeticketingcustomer2) - Remove a customer
* [removeTicketingNote2](docs/sdks/ticketing/README.md#removeticketingnote2) - Remove a note
* [removeTicketingTicket2](docs/sdks/ticketing/README.md#removeticketingticket2) - Remove a ticket
* [updateTicketingCategory2](docs/sdks/ticketing/README.md#updateticketingcategory2) - Update a category
* [updateTicketingCustomer2](docs/sdks/ticketing/README.md#updateticketingcustomer2) - Update a customer
* [updateTicketingNote2](docs/sdks/ticketing/README.md#updateticketingnote2) - Update a note
* [updateTicketingTicket2](docs/sdks/ticketing/README.md#updateticketingticket2) - Update a ticket

### [Timeoff](docs/sdks/timeoff/README.md)

* [createHrisTimeoff2](docs/sdks/timeoff/README.md#createhristimeoff2) - Create a timeoff
* [getHrisTimeoff2](docs/sdks/timeoff/README.md#gethristimeoff2) - Retrieve a timeoff
* [listHrisTimeoffs2](docs/sdks/timeoff/README.md#listhristimeoffs2) - List all timeoffs
* [patchHrisTimeoff2](docs/sdks/timeoff/README.md#patchhristimeoff2) - Update a timeoff
* [removeHrisTimeoff2](docs/sdks/timeoff/README.md#removehristimeoff2) - Remove a timeoff
* [updateHrisTimeoff2](docs/sdks/timeoff/README.md#updatehristimeoff2) - Update a timeoff

### [Timeshift](docs/sdks/timeshift/README.md)

* [createHrisTimeshift2](docs/sdks/timeshift/README.md#createhristimeshift2) - Create a timeshift
* [getHrisTimeshift2](docs/sdks/timeshift/README.md#gethristimeshift2) - Retrieve a timeshift
* [listHrisTimeshifts2](docs/sdks/timeshift/README.md#listhristimeshifts2) - List all timeshifts
* [patchHrisTimeshift2](docs/sdks/timeshift/README.md#patchhristimeshift2) - Update a timeshift
* [removeHrisTimeshift2](docs/sdks/timeshift/README.md#removehristimeshift2) - Remove a timeshift
* [updateHrisTimeshift2](docs/sdks/timeshift/README.md#updatehristimeshift2) - Update a timeshift

### [Tracking](docs/sdks/tracking/README.md)

* [getShippingTracking2](docs/sdks/tracking/README.md#getshippingtracking2) - Retrieve a tracking
* [listShippingTrackings2](docs/sdks/tracking/README.md#listshippingtrackings2) - List all trackings

### [Transaction](docs/sdks/transaction/README.md)

* [createAccountingTransaction2](docs/sdks/transaction/README.md#createaccountingtransaction2) - Create a transaction
* [getAccountingTransaction2](docs/sdks/transaction/README.md#getaccountingtransaction2) - Retrieve a transaction
* [listAccountingTransactions2](docs/sdks/transaction/README.md#listaccountingtransactions2) - List all transactions
* [patchAccountingTransaction2](docs/sdks/transaction/README.md#patchaccountingtransaction2) - Update a transaction
* [removeAccountingTransaction2](docs/sdks/transaction/README.md#removeaccountingtransaction2) - Remove a transaction
* [updateAccountingTransaction2](docs/sdks/transaction/README.md#updateaccountingtransaction2) - Update a transaction

### [Trialbalance](docs/sdks/trialbalance/README.md)

* [getAccountingTrialbalance2](docs/sdks/trialbalance/README.md#getaccountingtrialbalance2) - Retrieve a trialbalance
* [listAccountingTrialbalances2](docs/sdks/trialbalance/README.md#listaccountingtrialbalances2) - List all trialbalances

### [Uc](docs/sdks/uc/README.md)

* [createUcComment2](docs/sdks/uc/README.md#createuccomment2) - Create a comment
* [createUcContact2](docs/sdks/uc/README.md#createuccontact2) - Create a contact
* [createUcRecording2](docs/sdks/uc/README.md#createucrecording2) - Create a recording
* [getUcCall2](docs/sdks/uc/README.md#getuccall2) - Retrieve a call
* [getUcComment2](docs/sdks/uc/README.md#getuccomment2) - Retrieve a comment
* [getUcContact2](docs/sdks/uc/README.md#getuccontact2) - Retrieve a contact
* [getUcRecording2](docs/sdks/uc/README.md#getucrecording2) - Retrieve a recording
* [listUcCalls2](docs/sdks/uc/README.md#listuccalls2) - List all calls
* [listUcComments2](docs/sdks/uc/README.md#listuccomments2) - List all comments
* [listUcContacts2](docs/sdks/uc/README.md#listuccontacts2) - List all contacts
* [listUcRecordings2](docs/sdks/uc/README.md#listucrecordings2) - List all recordings
* [patchUcComment2](docs/sdks/uc/README.md#patchuccomment2) - Update a comment
* [patchUcContact2](docs/sdks/uc/README.md#patchuccontact2) - Update a contact
* [patchUcRecording2](docs/sdks/uc/README.md#patchucrecording2) - Update a recording
* [removeUcComment2](docs/sdks/uc/README.md#removeuccomment2) - Remove a comment
* [removeUcContact2](docs/sdks/uc/README.md#removeuccontact2) - Remove a contact
* [removeUcRecording2](docs/sdks/uc/README.md#removeucrecording2) - Remove a recording
* [updateUcComment2](docs/sdks/uc/README.md#updateuccomment2) - Update a comment
* [updateUcContact2](docs/sdks/uc/README.md#updateuccontact2) - Update a contact
* [updateUcRecording2](docs/sdks/uc/README.md#updateucrecording2) - Update a recording

### [Unified](docs/sdks/unified/README.md)

* [createUnifiedConnection](docs/sdks/unified/README.md#createunifiedconnection) - Create connection
* [createUnifiedEnvironment](docs/sdks/unified/README.md#createunifiedenvironment) - Create new environments
* [createUnifiedWebhook](docs/sdks/unified/README.md#createunifiedwebhook) - Create webhook subscription
* [createUnifiedWorkspaceSecretsmanager](docs/sdks/unified/README.md#createunifiedworkspacesecretsmanager) - Create secrets manager
* [getUnifiedApicall](docs/sdks/unified/README.md#getunifiedapicall) - Retrieve specific API Call by its ID
* [getUnifiedConnection](docs/sdks/unified/README.md#getunifiedconnection) - Retrieve connection
* [getUnifiedIntegrationAuth](docs/sdks/unified/README.md#getunifiedintegrationauth) - Authorize new connection
* [getUnifiedIssue](docs/sdks/unified/README.md#getunifiedissue) - Retrieve support issue
* [getUnifiedWebhook](docs/sdks/unified/README.md#getunifiedwebhook) - Retrieve webhook by its ID
* [getUnifiedWorkspaceSecretsmanager](docs/sdks/unified/README.md#getunifiedworkspacesecretsmanager) - Retrieve secrets manager
* [listUnifiedApicalls](docs/sdks/unified/README.md#listunifiedapicalls) - Returns API Calls
* [listUnifiedConnections](docs/sdks/unified/README.md#listunifiedconnections) - List all connections
* [listUnifiedEnvironments](docs/sdks/unified/README.md#listunifiedenvironments) - Returns all environments
* [listUnifiedIntegrationWorkspaces](docs/sdks/unified/README.md#listunifiedintegrationworkspaces) - Returns all activated integrations in a workspace
* [listUnifiedIntegrations](docs/sdks/unified/README.md#listunifiedintegrations) - Returns all integrations
* [listUnifiedIssues](docs/sdks/unified/README.md#listunifiedissues) - List support issues
* [listUnifiedWebhooks](docs/sdks/unified/README.md#listunifiedwebhooks) - Returns all registered webhooks
* [listUnifiedWorkspaceSecretsmanagers](docs/sdks/unified/README.md#listunifiedworkspacesecretsmanagers) - List secrets managers
* [patchUnifiedConnection](docs/sdks/unified/README.md#patchunifiedconnection) - Update connection
* [patchUnifiedWebhook](docs/sdks/unified/README.md#patchunifiedwebhook) - Update webhook subscription
* [patchUnifiedWebhookTrigger](docs/sdks/unified/README.md#patchunifiedwebhooktrigger) - Trigger webhook
* [removeUnifiedConnection](docs/sdks/unified/README.md#removeunifiedconnection) - Remove connection
* [removeUnifiedEnvironment](docs/sdks/unified/README.md#removeunifiedenvironment) - Remove an environment
* [removeUnifiedWebhook](docs/sdks/unified/README.md#removeunifiedwebhook) - Remove webhook subscription
* [removeUnifiedWorkspaceSecretsmanager](docs/sdks/unified/README.md#removeunifiedworkspacesecretsmanager) - Remove secrets manager
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

* [createVerificationRequest2](docs/sdks/verification/README.md#createverificationrequest2) - Create a request
* [getVerificationPackage2](docs/sdks/verification/README.md#getverificationpackage2) - Retrieve a package
* [getVerificationRequest2](docs/sdks/verification/README.md#getverificationrequest2) - Retrieve a request
* [listVerificationPackages2](docs/sdks/verification/README.md#listverificationpackages2) - List all packages
* [listVerificationRequests2](docs/sdks/verification/README.md#listverificationrequests2) - List all requests
* [patchVerificationRequest2](docs/sdks/verification/README.md#patchverificationrequest2) - Update a request
* [removeVerificationRequest2](docs/sdks/verification/README.md#removeverificationrequest2) - Remove a request
* [updateVerificationRequest2](docs/sdks/verification/README.md#updateverificationrequest2) - Update a request

### [Visitor](docs/sdks/visitor/README.md)

* [createAnalyticsVisitor2](docs/sdks/visitor/README.md#createanalyticsvisitor2) - Create a visitor
* [getAnalyticsVisitor2](docs/sdks/visitor/README.md#getanalyticsvisitor2) - Retrieve a visitor
* [listAnalyticsVisitors2](docs/sdks/visitor/README.md#listanalyticsvisitors2) - List all visitors
* [patchAnalyticsVisitor2](docs/sdks/visitor/README.md#patchanalyticsvisitor2) - Update a visitor
* [removeAnalyticsVisitor2](docs/sdks/visitor/README.md#removeanalyticsvisitor2) - Remove a visitor
* [updateAnalyticsVisitor2](docs/sdks/visitor/README.md#updateanalyticsvisitor2) - Update a visitor

### [Webhook](docs/sdks/webhook/README.md)

* [createUnifiedWebhook](docs/sdks/webhook/README.md#createunifiedwebhook) - Create webhook subscription
* [getUnifiedWebhook](docs/sdks/webhook/README.md#getunifiedwebhook) - Retrieve webhook by its ID
* [listUnifiedWebhooks](docs/sdks/webhook/README.md#listunifiedwebhooks) - Returns all registered webhooks
* [patchUnifiedWebhook](docs/sdks/webhook/README.md#patchunifiedwebhook) - Update webhook subscription
* [patchUnifiedWebhookTrigger](docs/sdks/webhook/README.md#patchunifiedwebhooktrigger) - Trigger webhook
* [removeUnifiedWebhook](docs/sdks/webhook/README.md#removeunifiedwebhook) - Remove webhook subscription
* [updateUnifiedWebhook](docs/sdks/webhook/README.md#updateunifiedwebhook) - Update webhook subscription
* [updateUnifiedWebhookTrigger](docs/sdks/webhook/README.md#updateunifiedwebhooktrigger) - Trigger webhook

### [Webinar](docs/sdks/webinar/README.md)

* [createCalendarWebinar2](docs/sdks/webinar/README.md#createcalendarwebinar2) - Create a webinar
* [getCalendarWebinar2](docs/sdks/webinar/README.md#getcalendarwebinar2) - Retrieve a webinar
* [listCalendarWebinars2](docs/sdks/webinar/README.md#listcalendarwebinars2) - List all webinars
* [patchCalendarWebinar2](docs/sdks/webinar/README.md#patchcalendarwebinar2) - Update a webinar
* [removeCalendarWebinar2](docs/sdks/webinar/README.md#removecalendarwebinar2) - Remove a webinar
* [updateCalendarWebinar2](docs/sdks/webinar/README.md#updatecalendarwebinar2) - Update a webinar

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
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccount2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccount2Response;
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

        CreateAccountingAccount2Request req = CreateAccountingAccount2Request.builder()
                .accountingAccount(AccountingAccount.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingAccount2Response res = sdk.accounting().createAccountingAccount2()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            System.out.println(res.accountingAccount().get());
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
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccount2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccount2Response;
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

        CreateAccountingAccount2Request req = CreateAccountingAccount2Request.builder()
                .accountingAccount(AccountingAccount.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingAccount2Response res = sdk.accounting().createAccountingAccount2()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            System.out.println(res.accountingAccount().get());
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
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccount2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccount2Response;
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

            CreateAccountingAccount2Request req = CreateAccountingAccount2Request.builder()
                    .accountingAccount(AccountingAccount.builder()
                        .build())
                    .connectionId("<id>")
                    .build();

            CreateAccountingAccount2Response res = sdk.accounting().createAccountingAccount2()
                    .request(req)
                    .call();

            if (res.accountingAccount().isPresent()) {
                System.out.println(res.accountingAccount().get());
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
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccount2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccount2Response;
import to.unified.unified_java_sdk.models.shared.AccountingAccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingAccount2Request req = CreateAccountingAccount2Request.builder()
                .accountingAccount(AccountingAccount.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingAccount2Response res = sdk.accounting().createAccountingAccount2()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            System.out.println(res.accountingAccount().get());
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

<!-- Start Jackson Configuration [jackson] -->
## Jackson Configuration

The SDK ships with a pre-configured Jackson [`ObjectMapper`][jackson-databind] accessible via
`JSON.getMapper()`. It is set up with type modules, strict deserializers, and the feature flags
needed for full SDK compatibility (including ISO-8601 `OffsetDateTime` serialization):

```java
import to.unified.unified_java_sdk.utils.JSON;

String json = JSON.getMapper().writeValueAsString(response);
```

To compose with your own `ObjectMapper`, register the provided `UnifiedJavaSDKJacksonModule`, which
bundles all the same modules and feature flags as a single plug-and-play module:

```java
import to.unified.unified_java_sdk.utils.UnifiedJavaSDKJacksonModule;
import com.fasterxml.jackson.databind.ObjectMapper;

ObjectMapper myMapper = new ObjectMapper()
    .registerModule(new UnifiedJavaSDKJacksonModule());

String json = myMapper.writeValueAsString(response);
```

[jackson-databind]: https://github.com/FasterXML/jackson-databind
[jackson-jsr310]: https://github.com/FasterXML/jackson-modules-java8/tree/master/datetime
<!-- End Jackson Configuration [jackson] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
