# Accounting

## Overview

### Available Operations

* [createAccountingAccount](#createaccountingaccount) - Create an account
* [createAccountingBankfeedaccount](#createaccountingbankfeedaccount) - Create a bankfeedaccount
* [createAccountingBankfeedtransaction](#createaccountingbankfeedtransaction) - Create a bankfeedtransaction
* [createAccountingBill](#createaccountingbill) - Create a bill
* [createAccountingCategory](#createaccountingcategory) - Create a category
* [createAccountingContact](#createaccountingcontact) - Create a contact
* [createAccountingCreditmemo](#createaccountingcreditmemo) - Create a creditmemo
* [createAccountingExpense](#createaccountingexpense) - Create an expense
* [createAccountingExpensereport](#createaccountingexpensereport) - Create an expensereport
* [createAccountingInvoice](#createaccountinginvoice) - Create an invoice
* [createAccountingJournal](#createaccountingjournal) - Create a journal
* [~~createAccountingOrder~~](#createaccountingorder) - Create an order :warning: **Deprecated**
* [createAccountingPaymentterm](#createaccountingpaymentterm) - Create a paymentterm
* [createAccountingProject](#createaccountingproject) - Create a project
* [createAccountingPurchaseorder](#createaccountingpurchaseorder) - Create a purchaseorder
* [createAccountingQuote](#createaccountingquote) - Create a quote
* [createAccountingSalesorder](#createaccountingsalesorder) - Create a salesorder
* [createAccountingTaxrate](#createaccountingtaxrate) - Create a taxrate
* [createAccountingTransaction](#createaccountingtransaction) - Create a transaction
* [createAccountingVendorcredit](#createaccountingvendorcredit) - Create a vendorcredit
* [getAccountingAccount](#getaccountingaccount) - Retrieve an account
* [getAccountingAgedpayable](#getaccountingagedpayable) - Retrieve an agedpayable
* [getAccountingAgedreceivable](#getaccountingagedreceivable) - Retrieve an agedreceivable
* [getAccountingBalancesheet](#getaccountingbalancesheet) - Retrieve a balancesheet
* [getAccountingBankfeedaccount](#getaccountingbankfeedaccount) - Retrieve a bankfeedaccount
* [getAccountingBankfeedtransaction](#getaccountingbankfeedtransaction) - Retrieve a bankfeedtransaction
* [getAccountingBill](#getaccountingbill) - Retrieve a bill
* [getAccountingCashflow](#getaccountingcashflow) - Retrieve a cashflow
* [getAccountingCategory](#getaccountingcategory) - Retrieve a category
* [getAccountingContact](#getaccountingcontact) - Retrieve a contact
* [getAccountingCreditmemo](#getaccountingcreditmemo) - Retrieve a creditmemo
* [getAccountingExpense](#getaccountingexpense) - Retrieve an expense
* [getAccountingExpensereport](#getaccountingexpensereport) - Retrieve an expensereport
* [getAccountingInvoice](#getaccountinginvoice) - Retrieve an invoice
* [getAccountingJournal](#getaccountingjournal) - Retrieve a journal
* [~~getAccountingOrder~~](#getaccountingorder) - Retrieve an order :warning: **Deprecated**
* [getAccountingOrganization](#getaccountingorganization) - Retrieve an organization
* [getAccountingPaymentterm](#getaccountingpaymentterm) - Retrieve a paymentterm
* [getAccountingProfitloss](#getaccountingprofitloss) - Retrieve a profitloss
* [getAccountingProject](#getaccountingproject) - Retrieve a project
* [getAccountingPurchaseorder](#getaccountingpurchaseorder) - Retrieve a purchaseorder
* [getAccountingPurchasereceipt](#getaccountingpurchasereceipt) - Retrieve a purchasereceipt
* [getAccountingQuote](#getaccountingquote) - Retrieve a quote
* [getAccountingSalesorder](#getaccountingsalesorder) - Retrieve a salesorder
* [getAccountingSalesreceipt](#getaccountingsalesreceipt) - Retrieve a salesreceipt
* [getAccountingTaxrate](#getaccountingtaxrate) - Retrieve a taxrate
* [getAccountingTransaction](#getaccountingtransaction) - Retrieve a transaction
* [getAccountingTrialbalance](#getaccountingtrialbalance) - Retrieve a trialbalance
* [getAccountingVendorcredit](#getaccountingvendorcredit) - Retrieve a vendorcredit
* [listAccountingAccounts](#listaccountingaccounts) - List all accounts
* [listAccountingAgedpayables](#listaccountingagedpayables) - List all agedpayables
* [listAccountingAgedreceivables](#listaccountingagedreceivables) - List all agedreceivables
* [listAccountingBalancesheets](#listaccountingbalancesheets) - List all balancesheets
* [listAccountingBankfeedaccounts](#listaccountingbankfeedaccounts) - List all bankfeedaccounts
* [listAccountingBankfeedtransactions](#listaccountingbankfeedtransactions) - List all bankfeedtransactions
* [listAccountingBills](#listaccountingbills) - List all bills
* [listAccountingCashflows](#listaccountingcashflows) - List all cashflows
* [listAccountingCategories](#listaccountingcategories) - List all categories
* [listAccountingContacts](#listaccountingcontacts) - List all contacts
* [listAccountingCreditmemoes](#listaccountingcreditmemoes) - List all creditmemoes
* [listAccountingExpensereports](#listaccountingexpensereports) - List all expensereports
* [listAccountingExpenses](#listaccountingexpenses) - List all expenses
* [listAccountingInvoices](#listaccountinginvoices) - List all invoices
* [listAccountingJournals](#listaccountingjournals) - List all journals
* [~~listAccountingOrders~~](#listaccountingorders) - List all orders :warning: **Deprecated**
* [listAccountingOrganizations](#listaccountingorganizations) - List all organizations
* [listAccountingPaymentterms](#listaccountingpaymentterms) - List all paymentterms
* [listAccountingProfitlosses](#listaccountingprofitlosses) - List all profitlosses
* [listAccountingProjects](#listaccountingprojects) - List all projects
* [listAccountingPurchaseorders](#listaccountingpurchaseorders) - List all purchaseorders
* [listAccountingPurchasereceipts](#listaccountingpurchasereceipts) - List all purchasereceipts
* [listAccountingQuotes](#listaccountingquotes) - List all quotes
* [listAccountingSalesorders](#listaccountingsalesorders) - List all salesorders
* [listAccountingSalesreceipts](#listaccountingsalesreceipts) - List all salesreceipts
* [listAccountingTaxrates](#listaccountingtaxrates) - List all taxrates
* [listAccountingTransactions](#listaccountingtransactions) - List all transactions
* [listAccountingTrialbalances](#listaccountingtrialbalances) - List all trialbalances
* [listAccountingVendorcredits](#listaccountingvendorcredits) - List all vendorcredits
* [patchAccountingAccount](#patchaccountingaccount) - Update an account
* [patchAccountingBankfeedaccount](#patchaccountingbankfeedaccount) - Update a bankfeedaccount
* [patchAccountingBankfeedtransaction](#patchaccountingbankfeedtransaction) - Update a bankfeedtransaction
* [patchAccountingBill](#patchaccountingbill) - Update a bill
* [patchAccountingCategory](#patchaccountingcategory) - Update a category
* [patchAccountingContact](#patchaccountingcontact) - Update a contact
* [patchAccountingCreditmemo](#patchaccountingcreditmemo) - Update a creditmemo
* [patchAccountingExpense](#patchaccountingexpense) - Update an expense
* [patchAccountingExpensereport](#patchaccountingexpensereport) - Update an expensereport
* [patchAccountingInvoice](#patchaccountinginvoice) - Update an invoice
* [patchAccountingJournal](#patchaccountingjournal) - Update a journal
* [~~patchAccountingOrder~~](#patchaccountingorder) - Update an order :warning: **Deprecated**
* [patchAccountingPaymentterm](#patchaccountingpaymentterm) - Update a paymentterm
* [patchAccountingProject](#patchaccountingproject) - Update a project
* [patchAccountingPurchaseorder](#patchaccountingpurchaseorder) - Update a purchaseorder
* [patchAccountingQuote](#patchaccountingquote) - Update a quote
* [patchAccountingSalesorder](#patchaccountingsalesorder) - Update a salesorder
* [patchAccountingTaxrate](#patchaccountingtaxrate) - Update a taxrate
* [patchAccountingTransaction](#patchaccountingtransaction) - Update a transaction
* [patchAccountingVendorcredit](#patchaccountingvendorcredit) - Update a vendorcredit
* [removeAccountingAccount](#removeaccountingaccount) - Remove an account
* [removeAccountingBankfeedaccount](#removeaccountingbankfeedaccount) - Remove a bankfeedaccount
* [removeAccountingBankfeedtransaction](#removeaccountingbankfeedtransaction) - Remove a bankfeedtransaction
* [removeAccountingBill](#removeaccountingbill) - Remove a bill
* [removeAccountingCategory](#removeaccountingcategory) - Remove a category
* [removeAccountingContact](#removeaccountingcontact) - Remove a contact
* [removeAccountingCreditmemo](#removeaccountingcreditmemo) - Remove a creditmemo
* [removeAccountingExpense](#removeaccountingexpense) - Remove an expense
* [removeAccountingExpensereport](#removeaccountingexpensereport) - Remove an expensereport
* [removeAccountingInvoice](#removeaccountinginvoice) - Remove an invoice
* [removeAccountingJournal](#removeaccountingjournal) - Remove a journal
* [~~removeAccountingOrder~~](#removeaccountingorder) - Remove an order :warning: **Deprecated**
* [removeAccountingPaymentterm](#removeaccountingpaymentterm) - Remove a paymentterm
* [removeAccountingProject](#removeaccountingproject) - Remove a project
* [removeAccountingPurchaseorder](#removeaccountingpurchaseorder) - Remove a purchaseorder
* [removeAccountingQuote](#removeaccountingquote) - Remove a quote
* [removeAccountingSalesorder](#removeaccountingsalesorder) - Remove a salesorder
* [removeAccountingTaxrate](#removeaccountingtaxrate) - Remove a taxrate
* [removeAccountingTransaction](#removeaccountingtransaction) - Remove a transaction
* [removeAccountingVendorcredit](#removeaccountingvendorcredit) - Remove a vendorcredit
* [updateAccountingAccount](#updateaccountingaccount) - Update an account
* [updateAccountingBankfeedaccount](#updateaccountingbankfeedaccount) - Update a bankfeedaccount
* [updateAccountingBankfeedtransaction](#updateaccountingbankfeedtransaction) - Update a bankfeedtransaction
* [updateAccountingBill](#updateaccountingbill) - Update a bill
* [updateAccountingCategory](#updateaccountingcategory) - Update a category
* [updateAccountingContact](#updateaccountingcontact) - Update a contact
* [updateAccountingCreditmemo](#updateaccountingcreditmemo) - Update a creditmemo
* [updateAccountingExpense](#updateaccountingexpense) - Update an expense
* [updateAccountingExpensereport](#updateaccountingexpensereport) - Update an expensereport
* [updateAccountingInvoice](#updateaccountinginvoice) - Update an invoice
* [updateAccountingJournal](#updateaccountingjournal) - Update a journal
* [~~updateAccountingOrder~~](#updateaccountingorder) - Update an order :warning: **Deprecated**
* [updateAccountingPaymentterm](#updateaccountingpaymentterm) - Update a paymentterm
* [updateAccountingProject](#updateaccountingproject) - Update a project
* [updateAccountingPurchaseorder](#updateaccountingpurchaseorder) - Update a purchaseorder
* [updateAccountingQuote](#updateaccountingquote) - Update a quote
* [updateAccountingSalesorder](#updateaccountingsalesorder) - Update a salesorder
* [updateAccountingTaxrate](#updateaccountingtaxrate) - Update a taxrate
* [updateAccountingTransaction](#updateaccountingtransaction) - Update a transaction
* [updateAccountingVendorcredit](#updateaccountingvendorcredit) - Update a vendorcredit

## createAccountingAccount

Creates a AccountingAccount. Provide the unified AccountingAccount fields in the request body; they are mapped to the provider's API. Returns the created AccountingAccount.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingAccount" method="post" path="/accounting/{connection_id}/account" example="accounting_account" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccountRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccountResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingAccountRequest req = CreateAccountingAccountRequest.builder()
                .accountingAccount(AccountingAccount.builder()
                    .balance(12092d)
                    .createdAt(OffsetDateTime.parse("2022-07-03T17:57:07.391Z"))
                    .currency("CAD")
                    .customerDefinedCode("6170")
                    .description("Comedo vilitas harum cupiditate animus quo iste.")
                    .id("926fabf4-6cc0-44df-a63c-7b44d67d1db4")
                    .isPayable(false)
                    .metadata(List.of())
                    .name("Savings Account")
                    .status(Status.ARCHIVED)
                    .taxonomy(List.of(
                        AccountingAccountTaxonomy.builder()
                            .type(AccountingAccountTaxonomyType.SUBGROUP)
                            .value("vesper")
                            .originalType("peccatus")
                            .build()))
                    .type(Type.ACCOUNTS_RECEIVABLE)
                    .updatedAt(OffsetDateTime.parse("2023-08-16T01:01:05.981Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingAccountResponse res = sdk.accounting().createAccountingAccount()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            System.out.println(res.accountingAccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAccountingAccountRequest](../../models/operations/CreateAccountingAccountRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAccountingAccountResponse](../../models/operations/CreateAccountingAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingBankfeedaccount

Creates a AccountingBankfeedaccount. Provide the unified AccountingBankfeedaccount fields in the request body; they are mapped to the provider's API. Returns the created AccountingBankfeedaccount.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingBankfeedaccount" method="post" path="/accounting/{connection_id}/bankfeedaccount" example="accounting_bankfeedaccount" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingBankfeedaccountRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingBankfeedaccountResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingBankfeedaccountRequest req = CreateAccountingBankfeedaccountRequest.builder()
                .accountingBankfeedaccount(AccountingBankfeedaccount.builder()
                    .accountNumber("69722811")
                    .accountNumberLast4("2811")
                    .accountType(AccountType.LOAN)
                    .balance(49437d)
                    .bankName("Wells Fargo")
                    .createdAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .currency("AUD")
                    .feedStartAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .id("396062ef-0902-495e-9bb9-31bf5b22c5af")
                    .metadata(List.of())
                    .name("Kirlin - Rowe Checking")
                    .routingNumber("104153154")
                    .status(AccountingBankfeedaccountStatus.ACTIVE)
                    .updatedAt(OffsetDateTime.parse("2024-05-07T05:17:31.894Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingBankfeedaccountResponse res = sdk.accounting().createAccountingBankfeedaccount()
                .request(req)
                .call();

        if (res.accountingBankfeedaccount().isPresent()) {
            System.out.println(res.accountingBankfeedaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [CreateAccountingBankfeedaccountRequest](../../models/operations/CreateAccountingBankfeedaccountRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[CreateAccountingBankfeedaccountResponse](../../models/operations/CreateAccountingBankfeedaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingBankfeedtransaction

Creates a AccountingBankfeedtransaction. Provide the unified AccountingBankfeedtransaction fields in the request body; they are mapped to the provider's API. Returns the created AccountingBankfeedtransaction.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingBankfeedtransaction" method="post" path="/accounting/{connection_id}/bankfeedtransaction" example="accounting_bankfeedtransaction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingBankfeedtransactionRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingBankfeedtransactionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingBankfeedtransactionRequest req = CreateAccountingBankfeedtransactionRequest.builder()
                .accountingBankfeedtransaction(AccountingBankfeedtransaction.builder()
                    .amount(60889d)
                    .bankCategory("Beauty")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-03-24T23:41:08.374Z"))
                    .currency("CAD")
                    .description("deposit processed at Renner - Quigley for SSP 824.35, using card ending ****1112. Account: ***7957.")
                    .id("764256cd-367e-4ac9-b2fe-9548fad96cf8")
                    .isPending(true)
                    .merchantName("McKenzie Inc")
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2025-05-08T20:40:06.669Z"))
                    .reference("09339705")
                    .transactionAt(OffsetDateTime.parse("2022-08-02T01:55:52.242Z"))
                    .type(AccountingBankfeedtransactionType.CREDIT)
                    .updatedAt(OffsetDateTime.parse("2022-05-26T09:17:12.628Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingBankfeedtransactionResponse res = sdk.accounting().createAccountingBankfeedtransaction()
                .request(req)
                .call();

        if (res.accountingBankfeedtransaction().isPresent()) {
            System.out.println(res.accountingBankfeedtransaction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [CreateAccountingBankfeedtransactionRequest](../../models/operations/CreateAccountingBankfeedtransactionRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[CreateAccountingBankfeedtransactionResponse](../../models/operations/CreateAccountingBankfeedtransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingBill

Creates a AccountingBill. Provide the unified AccountingBill fields in the request body; they are mapped to the provider's API. Returns the created AccountingBill.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingBill" method="post" path="/accounting/{connection_id}/bill" example="accounting_bill" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingBillRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingBillResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingBillRequest req = CreateAccountingBillRequest.builder()
                .accountingBill(AccountingBill.builder()
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://mixed-flame.biz")
                            .id("73fd745b-8b74-4211-8759-d1855780a4f1")
                            .mimeType("application/pdf")
                            .name("BILL-2466.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://minor-testimonial.biz")
                            .id("e9335bc6-a74b-44d4-9f68-727f3997fea1")
                            .mimeType("application/pdf")
                            .name("BILL-2466-1.pdf")
                            .build()))
                    .balanceAmount(0d)
                    .billNumber("BILL-2466")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2019-08-08T23:03:14.104Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .dueAt(OffsetDateTime.parse("2019-09-07T23:03:14.104Z"))
                    .extendedNotes(List.of())
                    .id("29d3e153-06db-43ad-ba1c-4e289fbf88d6")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Cilicium infit amissio ante demulceo annus defluo tumultus.")
                    .paidAmount(0d)
                    .paidAt(OffsetDateTime.parse("2019-08-15T17:24:28.313Z"))
                    .paymentCollectionMethod(PaymentCollectionMethod.CHARGE_AUTOMATICALLY)
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2019-08-08T23:03:14.104Z"))
                    .purchaseorderIds(List.of())
                    .send(true)
                    .status(AccountingBillStatus.PARTIALLY_PAID)
                    .subTotalAmount(0d)
                    .taxAmount(0d)
                    .term(Term.NET90)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2020-06-05T05:21:36.968Z"))
                    .url("https://utilized-partridge.info/bills/BILL-2466")
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingBillResponse res = sdk.accounting().createAccountingBill()
                .request(req)
                .call();

        if (res.accountingBill().isPresent()) {
            System.out.println(res.accountingBill().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateAccountingBillRequest](../../models/operations/CreateAccountingBillRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateAccountingBillResponse](../../models/operations/CreateAccountingBillResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingCategory

Creates a AccountingCategory. Provide the unified AccountingCategory fields in the request body; they are mapped to the provider's API. Returns the created AccountingCategory.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingCategory" method="post" path="/accounting/{connection_id}/category" example="accounting_category" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.AccountingCategory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingCategoryRequest req = CreateAccountingCategoryRequest.builder()
                .accountingCategory(AccountingCategory.builder()
                    .createdAt(OffsetDateTime.parse("2023-05-30T12:29:04.257Z"))
                    .description("Labore basium corrumpo crinis ars subito pecto.")
                    .id("53e250f9-ecc7-4dc9-9171-f3a3da15c53f")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Automotive")
                    .updatedAt(OffsetDateTime.parse("2025-10-05T17:27:24.837Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingCategoryResponse res = sdk.accounting().createAccountingCategory()
                .request(req)
                .call();

        if (res.accountingCategory().isPresent()) {
            System.out.println(res.accountingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateAccountingCategoryRequest](../../models/operations/CreateAccountingCategoryRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateAccountingCategoryResponse](../../models/operations/CreateAccountingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingContact

Creates a AccountingContact. Provide the unified AccountingContact fields in the request body; they are mapped to the provider's API. Returns the created AccountingContact.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingContact" method="post" path="/accounting/{connection_id}/contact" example="accounting_contact" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingContactRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingContactResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingContactRequest req = CreateAccountingContactRequest.builder()
                .accountingContact(AccountingContact.builder()
                    .associatedContacts(List.of())
                    .balanceAmount(55574d)
                    .billingAddress(PropertyAccountingContactBillingAddress.builder()
                        .address1("9171 Parisian Gateway")
                        .city("Lake Keltonboro")
                        .countryCode("US")
                        .postalCode("70131-2908")
                        .region("Illinois")
                        .regionCode("CO")
                        .build())
                    .companyName("Rice LLC")
                    .createdAt(OffsetDateTime.parse("2021-08-15T14:56:50.258Z"))
                    .currency("AUD")
                    .emails(List.of(
                        AccountingEmail.builder()
                            .email("michele.breitenberg@ricellc.com")
                            .type(AccountingEmailType.WORK)
                            .build(),
                        AccountingEmail.builder()
                            .email("accounts@ricellc.com")
                            .type(AccountingEmailType.OTHER)
                            .build()))
                    .firstName("Michele")
                    .id("7a9c7597-22ec-4b78-88c1-591711536e92")
                    .identification("508720595")
                    .isActive(true)
                    .isCustomer(true)
                    .lastName("Breitenberg")
                    .metadata(List.of())
                    .name("Rice LLC")
                    .notes("Tabella reprehenderit sono corrupti approbo crastinus sopor ultra.")
                    .paymentMethods(List.of(
                        AccountingContactPaymentMethod.builder()
                            .type(AccountingContactPaymentMethodType.CARD)
                            .default_(true)
                            .id("5083ab59-41c3-4731-a289-2da5673d47b6")
                            .name("Visa 5318")
                            .build()))
                    .portalUrl("https://ricellc.com/billing")
                    .shippingAddress(PropertyAccountingContactShippingAddress.builder()
                        .address1("786 Dare Meadows")
                        .city("Phoenix")
                        .countryCode("US")
                        .postalCode("68675")
                        .region("Tennessee")
                        .regionCode("NE")
                        .build())
                    .taxExemption(TaxExemption.FOREIGN)
                    .taxNumber("564107844")
                    .telephones(List.of(
                        AccountingTelephone.builder()
                            .telephone("(217) 260-4409")
                            .type(AccountingTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2024-01-05T03:16:26.931Z"))
                    .website("https://ricellc.com")
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingContactResponse res = sdk.accounting().createAccountingContact()
                .request(req)
                .call();

        if (res.accountingContact().isPresent()) {
            System.out.println(res.accountingContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAccountingContactRequest](../../models/operations/CreateAccountingContactRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAccountingContactResponse](../../models/operations/CreateAccountingContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingCreditmemo

Creates a AccountingCreditmemo. Provide the unified AccountingCreditmemo fields in the request body; they are mapped to the provider's API. Returns the created AccountingCreditmemo.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingCreditmemo" method="post" path="/accounting/{connection_id}/creditmemo" example="accounting_creditmemo" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingCreditmemoRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingCreditmemoResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingCreditmemoRequest req = CreateAccountingCreditmemoRequest.builder()
                .accountingCreditmemo(AccountingCreditmemo.builder()
                    .applications(List.of())
                    .attachments(List.of())
                    .balanceAmount(0d)
                    .createdAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .creditmemoNumber("CM-99537")
                    .currency("AUD")
                    .discountAmount(0d)
                    .id("16bca90d-2631-4d93-9e04-0846b865c9d4")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Amo adfero torqueo quas victoria.")
                    .postedAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .send(true)
                    .status(AccountingCreditmemoStatus.AUTHORIZED)
                    .taxAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2025-10-04T08:58:15.527Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingCreditmemoResponse res = sdk.accounting().createAccountingCreditmemo()
                .request(req)
                .call();

        if (res.accountingCreditmemo().isPresent()) {
            System.out.println(res.accountingCreditmemo().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [CreateAccountingCreditmemoRequest](../../models/operations/CreateAccountingCreditmemoRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[CreateAccountingCreditmemoResponse](../../models/operations/CreateAccountingCreditmemoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingExpense

Creates a AccountingExpense. Provide the unified AccountingExpense fields in the request body; they are mapped to the provider's API. Returns the created AccountingExpense.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingExpense" method="post" path="/accounting/{connection_id}/expense" example="accounting_expense" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingExpenseRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingExpenseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingExpenseRequest req = CreateAccountingExpenseRequest.builder()
                .accountingExpense(AccountingExpense.builder()
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://avaricious-larva.biz")
                            .id("0cc1bed7-cd15-497f-9e4d-13023a13cb8e")
                            .mimeType("application/pdf")
                            .name("receipt-9696.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://precious-comparison.net/")
                            .id("ae005702-43a4-487e-9a04-29e93bccb2ce")
                            .mimeType("application/pdf")
                            .name("receipt-9696-1.pdf")
                            .build()))
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .currency("GBP")
                    .externalNumber("EXP-38303")
                    .id("018e297c-ec7d-4300-b4c6-b5e6c4052ab9")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("0995be22-2323-457c-bf13-5a4c217e6b73")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(364.74)
                            .unitAmount(364.74)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("49da9838-84fa-4ccc-8988-d0f776bcb71b")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(258.35)
                            .unitAmount(258.35)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("77853870-67d2-4e02-ad0c-9f178b122bd5")
                            .itemName("Conference ticket")
                            .notes("Sint spiculum carcer ago charisma.")
                            .taxAmount(0d)
                            .totalAmount(28.14)
                            .unitAmount(28.14)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("3d50d4fd-a739-4684-aa3f-fe5f38f89e14")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(157.04)
                            .unitAmount(157.04)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("9ace35e0-6bf2-44ed-96f0-fbb5d50ffc86")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(164.02)
                            .unitAmount(164.02)
                            .unitQuantity(1d)
                            .build()))
                    .metadata(List.of())
                    .name("A deposit for KPW 867.85 was made at Kohler LLC via card ending ****1416 on account ***1040.")
                    .paymentMethod("CASH")
                    .postedAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .status(AccountingExpenseStatus.SUBMITTED)
                    .taxAmount(0d)
                    .totalAmount(972.29)
                    .type(AccountingExpenseType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2020-09-03T14:10:27.595Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingExpenseResponse res = sdk.accounting().createAccountingExpense()
                .request(req)
                .call();

        if (res.accountingExpense().isPresent()) {
            System.out.println(res.accountingExpense().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAccountingExpenseRequest](../../models/operations/CreateAccountingExpenseRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAccountingExpenseResponse](../../models/operations/CreateAccountingExpenseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingExpensereport

Creates a AccountingExpensereport. Provide the unified AccountingExpensereport fields in the request body; they are mapped to the provider's API. Returns the created AccountingExpensereport.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingExpensereport" method="post" path="/accounting/{connection_id}/expensereport" example="accounting_expensereport" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingExpensereportRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingExpensereportResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingExpensereportRequest req = CreateAccountingExpensereportRequest.builder()
                .accountingExpensereport(AccountingExpensereport.builder()
                    .approvedAt(OffsetDateTime.parse("2021-04-24T11:40:56.577Z"))
                    .attachments(List.of())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .currency("GBP")
                    .externalNumber("ER-31240")
                    .id("8bfa683c-c58a-41ee-885f-2ad2c5be3781")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("7ccb3e4d-9297-4c78-b60d-9221c6afe543")
                            .itemName("Conference ticket")
                            .taxAmount(0d)
                            .totalAmount(39.9)
                            .unitAmount(39.9)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("222f779d-f2c0-43f1-a457-90d1256e6aa2")
                            .itemName("Flight")
                            .notes("Aliquam soluta omnis dolor.")
                            .taxAmount(0d)
                            .totalAmount(193.17)
                            .unitAmount(193.17)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("c4e17364-e6ea-4a5a-b2ef-703c6f01cb3a")
                            .itemName("Client dinner")
                            .notes("Altus caveo capio.")
                            .taxAmount(0d)
                            .totalAmount(230.12)
                            .unitAmount(230.12)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("879fa863-7969-4a50-bdd3-f7075d297ea5")
                            .itemName("Flight")
                            .taxAmount(0d)
                            .totalAmount(445.27)
                            .unitAmount(445.27)
                            .unitQuantity(1d)
                            .build()))
                    .metadata(List.of())
                    .name("Jamil Christiansen - October expenses")
                    .postedAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .reimbursedAmount(908.46)
                    .reimbursedAt(OffsetDateTime.parse("2021-04-24T11:40:56.577Z"))
                    .status(AccountingExpensereportStatus.PAID)
                    .taxAmount(0d)
                    .totalAmount(908.46)
                    .updatedAt(OffsetDateTime.parse("2021-04-24T11:40:56.577Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingExpensereportResponse res = sdk.accounting().createAccountingExpensereport()
                .request(req)
                .call();

        if (res.accountingExpensereport().isPresent()) {
            System.out.println(res.accountingExpensereport().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [CreateAccountingExpensereportRequest](../../models/operations/CreateAccountingExpensereportRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[CreateAccountingExpensereportResponse](../../models/operations/CreateAccountingExpensereportResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingInvoice

Creates a AccountingInvoice. Provide the unified AccountingInvoice fields in the request body; they are mapped to the provider's API. Returns the created AccountingInvoice.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingInvoice" method="post" path="/accounting/{connection_id}/invoice" example="accounting_invoice" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingInvoiceRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingInvoiceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingInvoiceRequest req = CreateAccountingInvoiceRequest.builder()
                .accountingInvoice(AccountingInvoice.builder()
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://simplistic-translation.com")
                            .id("0d0db461-78cd-4ed9-9a31-d54c6a6bf707")
                            .mimeType("application/pdf")
                            .name("INV-77705.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://squiggly-amnesty.name/")
                            .id("1a8af191-8827-412d-abec-d25d696e004a")
                            .mimeType("application/pdf")
                            .name("INV-77705-1.pdf")
                            .build()))
                    .balanceAmount(0d)
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-11-07T14:17:29.587Z"))
                    .currency("GBP")
                    .discountAmount(0d)
                    .dueAt(OffsetDateTime.parse("2022-12-07T14:17:29.587Z"))
                    .extendedNotes(List.of())
                    .id("fc4cf1ee-e9cd-460d-b2e4-9b11e37a731c")
                    .invoiceNumber("INV-77705")
                    .isInclusiveOfTax(false)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Auctus comburo clarus ubi deprimo comburo vulgus.")
                    .paymentCollectionMethod(AccountingInvoicePaymentCollectionMethod.CHARGE_AUTOMATICALLY)
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2022-11-07T14:17:29.587Z"))
                    .reference("PO-2331")
                    .salesorderIds(List.of())
                    .send(true)
                    .status(AccountingInvoiceStatus.OVERDUE)
                    .subTotalAmount(0d)
                    .taxAmount(0d)
                    .term(AccountingInvoiceTerm.NET25)
                    .totalAmount(0d)
                    .type(AccountingInvoiceType.INVOICE)
                    .updatedAt(OffsetDateTime.parse("2026-05-25T00:02:37.465Z"))
                    .url("https://helpful-exterior.com/invoices/INV-77705")
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingInvoiceResponse res = sdk.accounting().createAccountingInvoice()
                .request(req)
                .call();

        if (res.accountingInvoice().isPresent()) {
            System.out.println(res.accountingInvoice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAccountingInvoiceRequest](../../models/operations/CreateAccountingInvoiceRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAccountingInvoiceResponse](../../models/operations/CreateAccountingInvoiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingJournal

Creates a AccountingJournal. Provide the unified AccountingJournal fields in the request body; they are mapped to the provider's API. Returns the created AccountingJournal.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingJournal" method="post" path="/accounting/{connection_id}/journal" example="accounting_journal" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingJournalRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingJournalResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingJournalRequest req = CreateAccountingJournalRequest.builder()
                .accountingJournal(AccountingJournal.builder()
                    .attachments(List.of())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-02-20T15:14:55.881Z"))
                    .currency("CAD")
                    .description("Constans adipisci.")
                    .id("fa2626fa-18e0-481b-8a33-c3f7bf8597be")
                    .isInclusiveOfTax(true)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2023-11-26T10:53:23.329Z"))
                    .reference("JE-78884")
                    .source("crustulum")
                    .status(AccountingJournalStatus.VOID)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2022-01-21T00:20:56.347Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingJournalResponse res = sdk.accounting().createAccountingJournal()
                .request(req)
                .call();

        if (res.accountingJournal().isPresent()) {
            System.out.println(res.accountingJournal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAccountingJournalRequest](../../models/operations/CreateAccountingJournalRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAccountingJournalResponse](../../models/operations/CreateAccountingJournalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~createAccountingOrder~~

Creates a AccountingOrder. Provide the unified AccountingOrder fields in the request body; they are mapped to the provider's API. Returns the created AccountingOrder.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingOrder" method="post" path="/accounting/{connection_id}/order" example="accounting_order" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingOrderRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingOrderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingOrderRequest req = CreateAccountingOrderRequest.builder()
                .accountingOrder(AccountingOrder.builder()
                    .billingAddress(PropertyAccountingOrderBillingAddress.builder()
                        .address1("125 Hayden Highway")
                        .city("Altoona")
                        .countryCode("US")
                        .postalCode("94706-7691")
                        .region("Louisiana")
                        .regionCode("VT")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .currency("GBP")
                    .id("384e438f-8690-4b9c-8f75-d4ae960e168a")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .shippingAddress(PropertyAccountingOrderShippingAddress.builder()
                        .address1("450 Garett Mall")
                        .city("New Kamronburgh")
                        .countryCode("US")
                        .postalCode("76546")
                        .region("Oregon")
                        .regionCode("VA")
                        .build())
                    .status(AccountingOrderStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .type(AccountingOrderType.SALES)
                    .updatedAt(OffsetDateTime.parse("2022-02-15T17:04:05.234Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingOrderResponse res = sdk.accounting().createAccountingOrder()
                .request(req)
                .call();

        if (res.accountingOrder().isPresent()) {
            System.out.println(res.accountingOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateAccountingOrderRequest](../../models/operations/CreateAccountingOrderRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateAccountingOrderResponse](../../models/operations/CreateAccountingOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingPaymentterm

Creates a AccountingPaymentterm. Provide the unified AccountingPaymentterm fields in the request body; they are mapped to the provider's API. Returns the created AccountingPaymentterm.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingPaymentterm" method="post" path="/accounting/{connection_id}/paymentterm" example="accounting_paymentterm" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingPaymenttermRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingPaymenttermResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingPaymenttermRequest req = CreateAccountingPaymenttermRequest.builder()
                .accountingPaymentterm(AccountingPaymentterm.builder()
                    .category(Category.STANDARD)
                    .createdAt(OffsetDateTime.parse("2021-08-22T22:42:42.265Z"))
                    .dayOfMonthDue(4d)
                    .description("Cultura cena claustrum.")
                    .discountDayOfMonth(13d)
                    .discountDays(4d)
                    .discountPercent(5d)
                    .dueDays(57d)
                    .dueNextMonthDays(9d)
                    .id("5ec1501a-4cdf-431f-8608-3772a3e99f84")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Net 30")
                    .type(AccountingPaymenttermType.NET15)
                    .updatedAt(OffsetDateTime.parse("2026-02-07T23:22:10.424Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingPaymenttermResponse res = sdk.accounting().createAccountingPaymentterm()
                .request(req)
                .call();

        if (res.accountingPaymentterm().isPresent()) {
            System.out.println(res.accountingPaymentterm().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [CreateAccountingPaymenttermRequest](../../models/operations/CreateAccountingPaymenttermRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[CreateAccountingPaymenttermResponse](../../models/operations/CreateAccountingPaymenttermResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingProject

Creates a AccountingProject. Provide the unified AccountingProject fields in the request body; they are mapped to the provider's API. Returns the created AccountingProject.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingProject" method="post" path="/accounting/{connection_id}/project" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingProjectRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingProjectResponse;
import to.unified.unified_java_sdk.models.shared.AccountingProject;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingProjectRequest req = CreateAccountingProjectRequest.builder()
                .accountingProject(AccountingProject.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingProjectResponse res = sdk.accounting().createAccountingProject()
                .request(req)
                .call();

        if (res.accountingProject().isPresent()) {
            System.out.println(res.accountingProject().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAccountingProjectRequest](../../models/operations/CreateAccountingProjectRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAccountingProjectResponse](../../models/operations/CreateAccountingProjectResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingPurchaseorder

Creates a AccountingPurchaseorder. Provide the unified AccountingPurchaseorder fields in the request body; they are mapped to the provider's API. Returns the created AccountingPurchaseorder.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingPurchaseorder" method="post" path="/accounting/{connection_id}/purchaseorder" example="accounting_purchaseorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingPurchaseorderRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingPurchaseorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingPurchaseorderRequest req = CreateAccountingPurchaseorderRequest.builder()
                .accountingPurchaseorder(AccountingPurchaseorder.builder()
                    .attachments(List.of())
                    .billingAddress(PropertyAccountingPurchaseorderBillingAddress.builder()
                        .address1("37214 Golden Via")
                        .address2("Suite 713")
                        .city("North Eltontown")
                        .countryCode("US")
                        .postalCode("75366")
                        .region("Kentucky")
                        .regionCode("MA")
                        .build())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .currency("EUR")
                    .id("eb22989a-3b64-48dd-b740-1c46847ac2ff")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .shippingAddress(PropertyAccountingPurchaseorderShippingAddress.builder()
                        .address1("9455 Brad Forks")
                        .city("Washington")
                        .countryCode("US")
                        .postalCode("16547")
                        .region("Idaho")
                        .regionCode("NY")
                        .build())
                    .status(AccountingPurchaseorderStatus.SUBMITTED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2021-08-15T07:37:10.453Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingPurchaseorderResponse res = sdk.accounting().createAccountingPurchaseorder()
                .request(req)
                .call();

        if (res.accountingPurchaseorder().isPresent()) {
            System.out.println(res.accountingPurchaseorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [CreateAccountingPurchaseorderRequest](../../models/operations/CreateAccountingPurchaseorderRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[CreateAccountingPurchaseorderResponse](../../models/operations/CreateAccountingPurchaseorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingQuote

Creates a AccountingQuote. Provide the unified AccountingQuote fields in the request body; they are mapped to the provider's API. Returns the created AccountingQuote.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingQuote" method="post" path="/accounting/{connection_id}/quote" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingQuoteRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingQuoteResponse;
import to.unified.unified_java_sdk.models.shared.AccountingQuote;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingQuoteRequest req = CreateAccountingQuoteRequest.builder()
                .accountingQuote(AccountingQuote.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingQuoteResponse res = sdk.accounting().createAccountingQuote()
                .request(req)
                .call();

        if (res.accountingQuote().isPresent()) {
            System.out.println(res.accountingQuote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateAccountingQuoteRequest](../../models/operations/CreateAccountingQuoteRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateAccountingQuoteResponse](../../models/operations/CreateAccountingQuoteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingSalesorder

Creates a AccountingSalesorder. Provide the unified AccountingSalesorder fields in the request body; they are mapped to the provider's API. Returns the created AccountingSalesorder.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingSalesorder" method="post" path="/accounting/{connection_id}/salesorder" example="accounting_salesorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingSalesorderRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingSalesorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingSalesorderRequest req = CreateAccountingSalesorderRequest.builder()
                .accountingSalesorder(AccountingSalesorder.builder()
                    .billingAddress(PropertyAccountingSalesorderBillingAddress.builder()
                        .address1("1487 Valley Road")
                        .address2("Apt. 287")
                        .city("Lake Angelina")
                        .countryCode("US")
                        .postalCode("85469-3199")
                        .region("Georgia")
                        .regionCode("MT")
                        .build())
                    .categoryIds(List.of())
                    .closedAt(OffsetDateTime.parse("2023-04-03T11:26:43.536Z"))
                    .createdAt(OffsetDateTime.parse("2022-01-17T16:11:50.310Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .fees(List.of())
                    .fulfillmentType(FulfillmentType.OTHER)
                    .id("25c7d22e-b4e8-4f8c-9a76-a7518796240f")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .orderNumber("832663")
                    .paidAmount(0d)
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2022-01-17T16:11:50.310Z"))
                    .refundedAmount(0d)
                    .salesChannel("Wholesale")
                    .serviceChargeAmount(0d)
                    .shippingAddress(PropertyAccountingSalesorderShippingAddress.builder()
                        .address1("781 Darrell Coves")
                        .city("Annabelfield")
                        .countryCode("US")
                        .postalCode("92148-4116")
                        .region("Virginia")
                        .regionCode("WI")
                        .build())
                    .status(AccountingSalesorderStatus.PAID)
                    .subtotalAmount(0d)
                    .taxAmount(0d)
                    .tipAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-04-03T11:26:43.536Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingSalesorderResponse res = sdk.accounting().createAccountingSalesorder()
                .request(req)
                .call();

        if (res.accountingSalesorder().isPresent()) {
            System.out.println(res.accountingSalesorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [CreateAccountingSalesorderRequest](../../models/operations/CreateAccountingSalesorderRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[CreateAccountingSalesorderResponse](../../models/operations/CreateAccountingSalesorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingTaxrate

Creates a AccountingTaxrate. Provide the unified AccountingTaxrate fields in the request body; they are mapped to the provider's API. Returns the created AccountingTaxrate.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingTaxrate" method="post" path="/accounting/{connection_id}/taxrate" example="accounting_taxrate" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingTaxrateRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingTaxrateResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingTaxrateRequest req = CreateAccountingTaxrateRequest.builder()
                .accountingTaxrate(AccountingTaxrate.builder()
                    .components(List.of(
                        AccountingTaxrateComponent.builder()
                            .isCompound(false)
                            .name("Exempt")
                            .rate(0d)
                            .build()))
                    .country("US")
                    .createdAt(OffsetDateTime.parse("2020-01-04T10:37:56.894Z"))
                    .description("Exempt (0%)")
                    .effectiveRate(0d)
                    .id("059ef12c-7f65-44ea-9483-fa63bf12d690")
                    .isActive(false)
                    .isCompound(false)
                    .metadata(List.of())
                    .name("Exempt")
                    .rate(0d)
                    .region("FL")
                    .totalRate(0d)
                    .type(AccountingTaxrateType.SALES)
                    .updatedAt(OffsetDateTime.parse("2020-02-13T18:59:35.712Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingTaxrateResponse res = sdk.accounting().createAccountingTaxrate()
                .request(req)
                .call();

        if (res.accountingTaxrate().isPresent()) {
            System.out.println(res.accountingTaxrate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAccountingTaxrateRequest](../../models/operations/CreateAccountingTaxrateRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAccountingTaxrateResponse](../../models/operations/CreateAccountingTaxrateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingTransaction

Creates a AccountingTransaction. Provide the unified AccountingTransaction fields in the request body; they are mapped to the provider's API. Returns the created AccountingTransaction.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingTransaction" method="post" path="/accounting/{connection_id}/transaction" example="accounting_transaction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingTransactionRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingTransactionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingTransactionRequest req = CreateAccountingTransactionRequest.builder()
                .accountingTransaction(AccountingTransaction.builder()
                    .createdAt(OffsetDateTime.parse("2019-09-25T11:40:42.574Z"))
                    .id("4485cf1f-362a-4275-96cc-4605b24958e2")
                    .lineitems(List.of(
                        AccountingTransactionLineItem.builder()
                            .categoryIds(List.of())
                            .description("The Wilma Car is the latest in a series of beneficial products from Fritsch Group")
                            .id("333e4c74-2ff6-47bd-9ae2-cd96582c0728")
                            .name("Table")
                            .totalAmount(10184d)
                            .unitAmount(536d)
                            .unitQuantity(19d)
                            .build()))
                    .memo("withdrawal confirmed at Doyle, White and Conroy for FJD 391.94, card ending in ****0497 associated with account ***6676.")
                    .status(AccountingTransactionStatus.PENDING)
                    .taxAmount(0d)
                    .totalAmount(10184d)
                    .transactionAt(OffsetDateTime.parse("2019-09-25T11:40:42.574Z"))
                    .updatedAt(OffsetDateTime.parse("2019-10-14T12:24:45.298Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingTransactionResponse res = sdk.accounting().createAccountingTransaction()
                .request(req)
                .call();

        if (res.accountingTransaction().isPresent()) {
            System.out.println(res.accountingTransaction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [CreateAccountingTransactionRequest](../../models/operations/CreateAccountingTransactionRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[CreateAccountingTransactionResponse](../../models/operations/CreateAccountingTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAccountingVendorcredit

Creates a AccountingVendorcredit. Provide the unified AccountingVendorcredit fields in the request body; they are mapped to the provider's API. Returns the created AccountingVendorcredit.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingVendorcredit" method="post" path="/accounting/{connection_id}/vendorcredit" example="accounting_vendorcredit" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingVendorcreditRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingVendorcreditResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingVendorcreditRequest req = CreateAccountingVendorcreditRequest.builder()
                .accountingVendorcredit(AccountingVendorcredit.builder()
                    .applications(List.of())
                    .balanceAmount(0d)
                    .createdAt(OffsetDateTime.parse("2023-04-15T21:14:08.197Z"))
                    .currency("USD")
                    .id("6b9ee7dd-0e97-4583-8642-31937524a943")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Avaritia tantum campana comitatus atrox.")
                    .postedAt(OffsetDateTime.parse("2023-04-15T21:14:08.197Z"))
                    .status(AccountingVendorcreditStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-10-07T20:03:34.638Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingVendorcreditResponse res = sdk.accounting().createAccountingVendorcredit()
                .request(req)
                .call();

        if (res.accountingVendorcredit().isPresent()) {
            System.out.println(res.accountingVendorcredit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [CreateAccountingVendorcreditRequest](../../models/operations/CreateAccountingVendorcreditRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[CreateAccountingVendorcreditResponse](../../models/operations/CreateAccountingVendorcreditResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingAccount

Retrieves a single AccountingAccount by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingAccount" method="get" path="/accounting/{connection_id}/account/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingAccountRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingAccountResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingAccountRequest req = GetAccountingAccountRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingAccountResponse res = sdk.accounting().getAccountingAccount()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            System.out.println(res.accountingAccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAccountingAccountRequest](../../models/operations/GetAccountingAccountRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAccountingAccountResponse](../../models/operations/GetAccountingAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingAgedpayable

Retrieves a single AccountingAgedpayable by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingAgedpayable" method="get" path="/accounting/{connection_id}/agedpayable/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingAgedpayableRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingAgedpayableResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingAgedpayableRequest req = GetAccountingAgedpayableRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingAgedpayableResponse res = sdk.accounting().getAccountingAgedpayable()
                .request(req)
                .call();

        if (res.accountingAgedpayable().isPresent()) {
            System.out.println(res.accountingAgedpayable().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetAccountingAgedpayableRequest](../../models/operations/GetAccountingAgedpayableRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetAccountingAgedpayableResponse](../../models/operations/GetAccountingAgedpayableResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingAgedreceivable

Retrieves a single AccountingAgedreceivable by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingAgedreceivable" method="get" path="/accounting/{connection_id}/agedreceivable/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingAgedreceivableRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingAgedreceivableResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingAgedreceivableRequest req = GetAccountingAgedreceivableRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingAgedreceivableResponse res = sdk.accounting().getAccountingAgedreceivable()
                .request(req)
                .call();

        if (res.accountingAgedreceivable().isPresent()) {
            System.out.println(res.accountingAgedreceivable().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [GetAccountingAgedreceivableRequest](../../models/operations/GetAccountingAgedreceivableRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[GetAccountingAgedreceivableResponse](../../models/operations/GetAccountingAgedreceivableResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingBalancesheet

Retrieves a single AccountingBalancesheet by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingBalancesheet" method="get" path="/accounting/{connection_id}/balancesheet/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingBalancesheetRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingBalancesheetResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingBalancesheetRequest req = GetAccountingBalancesheetRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingBalancesheetResponse res = sdk.accounting().getAccountingBalancesheet()
                .request(req)
                .call();

        if (res.accountingBalancesheet().isPresent()) {
            System.out.println(res.accountingBalancesheet().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetAccountingBalancesheetRequest](../../models/operations/GetAccountingBalancesheetRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetAccountingBalancesheetResponse](../../models/operations/GetAccountingBalancesheetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingBankfeedaccount

Retrieves a single AccountingBankfeedaccount by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingBankfeedaccount" method="get" path="/accounting/{connection_id}/bankfeedaccount/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingBankfeedaccountRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingBankfeedaccountResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingBankfeedaccountRequest req = GetAccountingBankfeedaccountRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingBankfeedaccountResponse res = sdk.accounting().getAccountingBankfeedaccount()
                .request(req)
                .call();

        if (res.accountingBankfeedaccount().isPresent()) {
            System.out.println(res.accountingBankfeedaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [GetAccountingBankfeedaccountRequest](../../models/operations/GetAccountingBankfeedaccountRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[GetAccountingBankfeedaccountResponse](../../models/operations/GetAccountingBankfeedaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingBankfeedtransaction

Retrieves a single AccountingBankfeedtransaction by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingBankfeedtransaction" method="get" path="/accounting/{connection_id}/bankfeedtransaction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingBankfeedtransactionRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingBankfeedtransactionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingBankfeedtransactionRequest req = GetAccountingBankfeedtransactionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingBankfeedtransactionResponse res = sdk.accounting().getAccountingBankfeedtransaction()
                .request(req)
                .call();

        if (res.accountingBankfeedtransaction().isPresent()) {
            System.out.println(res.accountingBankfeedtransaction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [GetAccountingBankfeedtransactionRequest](../../models/operations/GetAccountingBankfeedtransactionRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[GetAccountingBankfeedtransactionResponse](../../models/operations/GetAccountingBankfeedtransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingBill

Retrieves a single AccountingBill by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingBill" method="get" path="/accounting/{connection_id}/bill/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingBillRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingBillResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingBillRequest req = GetAccountingBillRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingBillResponse res = sdk.accounting().getAccountingBill()
                .request(req)
                .call();

        if (res.accountingBill().isPresent()) {
            System.out.println(res.accountingBill().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetAccountingBillRequest](../../models/operations/GetAccountingBillRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetAccountingBillResponse](../../models/operations/GetAccountingBillResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingCashflow

Retrieves a single AccountingCashflow by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingCashflow" method="get" path="/accounting/{connection_id}/cashflow/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingCashflowRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingCashflowResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingCashflowRequest req = GetAccountingCashflowRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingCashflowResponse res = sdk.accounting().getAccountingCashflow()
                .request(req)
                .call();

        if (res.accountingCashflow().isPresent()) {
            System.out.println(res.accountingCashflow().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAccountingCashflowRequest](../../models/operations/GetAccountingCashflowRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAccountingCashflowResponse](../../models/operations/GetAccountingCashflowResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingCategory

Retrieves a single AccountingCategory by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingCategory" method="get" path="/accounting/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingCategoryRequest req = GetAccountingCategoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingCategoryResponse res = sdk.accounting().getAccountingCategory()
                .request(req)
                .call();

        if (res.accountingCategory().isPresent()) {
            System.out.println(res.accountingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAccountingCategoryRequest](../../models/operations/GetAccountingCategoryRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAccountingCategoryResponse](../../models/operations/GetAccountingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingContact

Retrieves a single AccountingContact by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingContact" method="get" path="/accounting/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingContactRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingContactResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingContactRequest req = GetAccountingContactRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingContactResponse res = sdk.accounting().getAccountingContact()
                .request(req)
                .call();

        if (res.accountingContact().isPresent()) {
            System.out.println(res.accountingContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAccountingContactRequest](../../models/operations/GetAccountingContactRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAccountingContactResponse](../../models/operations/GetAccountingContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingCreditmemo

Retrieves a single AccountingCreditmemo by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingCreditmemo" method="get" path="/accounting/{connection_id}/creditmemo/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingCreditmemoRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingCreditmemoResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingCreditmemoRequest req = GetAccountingCreditmemoRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingCreditmemoResponse res = sdk.accounting().getAccountingCreditmemo()
                .request(req)
                .call();

        if (res.accountingCreditmemo().isPresent()) {
            System.out.println(res.accountingCreditmemo().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetAccountingCreditmemoRequest](../../models/operations/GetAccountingCreditmemoRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetAccountingCreditmemoResponse](../../models/operations/GetAccountingCreditmemoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingExpense

Retrieves a single AccountingExpense by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingExpense" method="get" path="/accounting/{connection_id}/expense/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingExpenseRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingExpenseResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingExpenseRequest req = GetAccountingExpenseRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingExpenseResponse res = sdk.accounting().getAccountingExpense()
                .request(req)
                .call();

        if (res.accountingExpense().isPresent()) {
            System.out.println(res.accountingExpense().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAccountingExpenseRequest](../../models/operations/GetAccountingExpenseRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAccountingExpenseResponse](../../models/operations/GetAccountingExpenseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingExpensereport

Retrieves a single AccountingExpensereport by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingExpensereport" method="get" path="/accounting/{connection_id}/expensereport/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingExpensereportRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingExpensereportResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingExpensereportRequest req = GetAccountingExpensereportRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingExpensereportResponse res = sdk.accounting().getAccountingExpensereport()
                .request(req)
                .call();

        if (res.accountingExpensereport().isPresent()) {
            System.out.println(res.accountingExpensereport().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetAccountingExpensereportRequest](../../models/operations/GetAccountingExpensereportRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetAccountingExpensereportResponse](../../models/operations/GetAccountingExpensereportResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingInvoice

Retrieves a single AccountingInvoice by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingInvoice" method="get" path="/accounting/{connection_id}/invoice/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingInvoiceRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingInvoiceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingInvoiceRequest req = GetAccountingInvoiceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingInvoiceResponse res = sdk.accounting().getAccountingInvoice()
                .request(req)
                .call();

        if (res.accountingInvoice().isPresent()) {
            System.out.println(res.accountingInvoice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAccountingInvoiceRequest](../../models/operations/GetAccountingInvoiceRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAccountingInvoiceResponse](../../models/operations/GetAccountingInvoiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingJournal

Retrieves a single AccountingJournal by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingJournal" method="get" path="/accounting/{connection_id}/journal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingJournalRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingJournalResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingJournalRequest req = GetAccountingJournalRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingJournalResponse res = sdk.accounting().getAccountingJournal()
                .request(req)
                .call();

        if (res.accountingJournal().isPresent()) {
            System.out.println(res.accountingJournal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAccountingJournalRequest](../../models/operations/GetAccountingJournalRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAccountingJournalResponse](../../models/operations/GetAccountingJournalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~getAccountingOrder~~

Retrieves a single AccountingOrder by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingOrder" method="get" path="/accounting/{connection_id}/order/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingOrderRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingOrderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingOrderRequest req = GetAccountingOrderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingOrderResponse res = sdk.accounting().getAccountingOrder()
                .request(req)
                .call();

        if (res.accountingOrder().isPresent()) {
            System.out.println(res.accountingOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAccountingOrderRequest](../../models/operations/GetAccountingOrderRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAccountingOrderResponse](../../models/operations/GetAccountingOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingOrganization

Retrieves a single AccountingOrganization by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingOrganization" method="get" path="/accounting/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingOrganizationRequest req = GetAccountingOrganizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingOrganizationResponse res = sdk.accounting().getAccountingOrganization()
                .request(req)
                .call();

        if (res.accountingOrganization().isPresent()) {
            System.out.println(res.accountingOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetAccountingOrganizationRequest](../../models/operations/GetAccountingOrganizationRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetAccountingOrganizationResponse](../../models/operations/GetAccountingOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingPaymentterm

Retrieves a single AccountingPaymentterm by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingPaymentterm" method="get" path="/accounting/{connection_id}/paymentterm/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingPaymenttermRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingPaymenttermResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingPaymenttermRequest req = GetAccountingPaymenttermRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingPaymenttermResponse res = sdk.accounting().getAccountingPaymentterm()
                .request(req)
                .call();

        if (res.accountingPaymentterm().isPresent()) {
            System.out.println(res.accountingPaymentterm().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetAccountingPaymenttermRequest](../../models/operations/GetAccountingPaymenttermRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetAccountingPaymenttermResponse](../../models/operations/GetAccountingPaymenttermResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingProfitloss

Retrieves a single AccountingProfitloss by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingProfitloss" method="get" path="/accounting/{connection_id}/profitloss/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingProfitlossRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingProfitlossResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingProfitlossRequest req = GetAccountingProfitlossRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingProfitlossResponse res = sdk.accounting().getAccountingProfitloss()
                .request(req)
                .call();

        if (res.accountingProfitloss().isPresent()) {
            System.out.println(res.accountingProfitloss().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetAccountingProfitlossRequest](../../models/operations/GetAccountingProfitlossRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetAccountingProfitlossResponse](../../models/operations/GetAccountingProfitlossResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingProject

Retrieves a single AccountingProject by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingProject" method="get" path="/accounting/{connection_id}/project/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingProjectRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingProjectResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingProjectRequest req = GetAccountingProjectRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingProjectResponse res = sdk.accounting().getAccountingProject()
                .request(req)
                .call();

        if (res.accountingProject().isPresent()) {
            System.out.println(res.accountingProject().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAccountingProjectRequest](../../models/operations/GetAccountingProjectRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAccountingProjectResponse](../../models/operations/GetAccountingProjectResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingPurchaseorder

Retrieves a single AccountingPurchaseorder by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingPurchaseorder" method="get" path="/accounting/{connection_id}/purchaseorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingPurchaseorderRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingPurchaseorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingPurchaseorderRequest req = GetAccountingPurchaseorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingPurchaseorderResponse res = sdk.accounting().getAccountingPurchaseorder()
                .request(req)
                .call();

        if (res.accountingPurchaseorder().isPresent()) {
            System.out.println(res.accountingPurchaseorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetAccountingPurchaseorderRequest](../../models/operations/GetAccountingPurchaseorderRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetAccountingPurchaseorderResponse](../../models/operations/GetAccountingPurchaseorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingPurchasereceipt

Retrieves a single AccountingPurchasereceipt by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingPurchasereceipt" method="get" path="/accounting/{connection_id}/purchasereceipt/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingPurchasereceiptRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingPurchasereceiptResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingPurchasereceiptRequest req = GetAccountingPurchasereceiptRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingPurchasereceiptResponse res = sdk.accounting().getAccountingPurchasereceipt()
                .request(req)
                .call();

        if (res.accountingPurchasereceipt().isPresent()) {
            System.out.println(res.accountingPurchasereceipt().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [GetAccountingPurchasereceiptRequest](../../models/operations/GetAccountingPurchasereceiptRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[GetAccountingPurchasereceiptResponse](../../models/operations/GetAccountingPurchasereceiptResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingQuote

Retrieves a single AccountingQuote by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingQuote" method="get" path="/accounting/{connection_id}/quote/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingQuoteRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingQuoteResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingQuoteRequest req = GetAccountingQuoteRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingQuoteResponse res = sdk.accounting().getAccountingQuote()
                .request(req)
                .call();

        if (res.accountingQuote().isPresent()) {
            System.out.println(res.accountingQuote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAccountingQuoteRequest](../../models/operations/GetAccountingQuoteRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAccountingQuoteResponse](../../models/operations/GetAccountingQuoteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingSalesorder

Retrieves a single AccountingSalesorder by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingSalesorder" method="get" path="/accounting/{connection_id}/salesorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingSalesorderRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingSalesorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingSalesorderRequest req = GetAccountingSalesorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingSalesorderResponse res = sdk.accounting().getAccountingSalesorder()
                .request(req)
                .call();

        if (res.accountingSalesorder().isPresent()) {
            System.out.println(res.accountingSalesorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetAccountingSalesorderRequest](../../models/operations/GetAccountingSalesorderRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetAccountingSalesorderResponse](../../models/operations/GetAccountingSalesorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingSalesreceipt

Retrieves a single AccountingSalesreceipt by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingSalesreceipt" method="get" path="/accounting/{connection_id}/salesreceipt/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingSalesreceiptRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingSalesreceiptResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingSalesreceiptRequest req = GetAccountingSalesreceiptRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingSalesreceiptResponse res = sdk.accounting().getAccountingSalesreceipt()
                .request(req)
                .call();

        if (res.accountingSalesreceipt().isPresent()) {
            System.out.println(res.accountingSalesreceipt().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetAccountingSalesreceiptRequest](../../models/operations/GetAccountingSalesreceiptRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetAccountingSalesreceiptResponse](../../models/operations/GetAccountingSalesreceiptResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingTaxrate

Retrieves a single AccountingTaxrate by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingTaxrate" method="get" path="/accounting/{connection_id}/taxrate/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingTaxrateRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingTaxrateResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingTaxrateRequest req = GetAccountingTaxrateRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingTaxrateResponse res = sdk.accounting().getAccountingTaxrate()
                .request(req)
                .call();

        if (res.accountingTaxrate().isPresent()) {
            System.out.println(res.accountingTaxrate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAccountingTaxrateRequest](../../models/operations/GetAccountingTaxrateRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAccountingTaxrateResponse](../../models/operations/GetAccountingTaxrateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingTransaction

Retrieves a single AccountingTransaction by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingTransaction" method="get" path="/accounting/{connection_id}/transaction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingTransactionRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingTransactionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingTransactionRequest req = GetAccountingTransactionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingTransactionResponse res = sdk.accounting().getAccountingTransaction()
                .request(req)
                .call();

        if (res.accountingTransaction().isPresent()) {
            System.out.println(res.accountingTransaction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetAccountingTransactionRequest](../../models/operations/GetAccountingTransactionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetAccountingTransactionResponse](../../models/operations/GetAccountingTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingTrialbalance

Retrieves a single AccountingTrialbalance by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingTrialbalance" method="get" path="/accounting/{connection_id}/trialbalance/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingTrialbalanceRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingTrialbalanceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingTrialbalanceRequest req = GetAccountingTrialbalanceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingTrialbalanceResponse res = sdk.accounting().getAccountingTrialbalance()
                .request(req)
                .call();

        if (res.accountingTrialbalance().isPresent()) {
            System.out.println(res.accountingTrialbalance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetAccountingTrialbalanceRequest](../../models/operations/GetAccountingTrialbalanceRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetAccountingTrialbalanceResponse](../../models/operations/GetAccountingTrialbalanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingVendorcredit

Retrieves a single AccountingVendorcredit by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingVendorcredit" method="get" path="/accounting/{connection_id}/vendorcredit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingVendorcreditRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingVendorcreditResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingVendorcreditRequest req = GetAccountingVendorcreditRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingVendorcreditResponse res = sdk.accounting().getAccountingVendorcredit()
                .request(req)
                .call();

        if (res.accountingVendorcredit().isPresent()) {
            System.out.println(res.accountingVendorcredit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetAccountingVendorcreditRequest](../../models/operations/GetAccountingVendorcreditRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetAccountingVendorcreditResponse](../../models/operations/GetAccountingVendorcreditResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingAccounts

Returns a list of AccountingAccounts. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingAccounts" method="get" path="/accounting/{connection_id}/account" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingAccountsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingAccountsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingAccountsRequest req = ListAccountingAccountsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingAccountsResponse res = sdk.accounting().listAccountingAccounts()
                .request(req)
                .call();

        if (res.accountingAccounts().isPresent()) {
            System.out.println(res.accountingAccounts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAccountingAccountsRequest](../../models/operations/ListAccountingAccountsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAccountingAccountsResponse](../../models/operations/ListAccountingAccountsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingAgedpayables

Returns a list of AccountingAgedpayables. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingAgedpayables" method="get" path="/accounting/{connection_id}/agedpayable" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingAgedpayablesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingAgedpayablesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingAgedpayablesRequest req = ListAccountingAgedpayablesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingAgedpayablesResponse res = sdk.accounting().listAccountingAgedpayables()
                .request(req)
                .call();

        if (res.accountingAgedpayables().isPresent()) {
            System.out.println(res.accountingAgedpayables().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListAccountingAgedpayablesRequest](../../models/operations/ListAccountingAgedpayablesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListAccountingAgedpayablesResponse](../../models/operations/ListAccountingAgedpayablesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingAgedreceivables

Returns a list of AccountingAgedreceivables. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingAgedreceivables" method="get" path="/accounting/{connection_id}/agedreceivable" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingAgedreceivablesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingAgedreceivablesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingAgedreceivablesRequest req = ListAccountingAgedreceivablesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingAgedreceivablesResponse res = sdk.accounting().listAccountingAgedreceivables()
                .request(req)
                .call();

        if (res.accountingAgedreceivables().isPresent()) {
            System.out.println(res.accountingAgedreceivables().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [ListAccountingAgedreceivablesRequest](../../models/operations/ListAccountingAgedreceivablesRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[ListAccountingAgedreceivablesResponse](../../models/operations/ListAccountingAgedreceivablesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingBalancesheets

Returns a list of AccountingBalancesheets. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingBalancesheets" method="get" path="/accounting/{connection_id}/balancesheet" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingBalancesheetsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingBalancesheetsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingBalancesheetsRequest req = ListAccountingBalancesheetsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingBalancesheetsResponse res = sdk.accounting().listAccountingBalancesheets()
                .request(req)
                .call();

        if (res.accountingBalancesheets().isPresent()) {
            System.out.println(res.accountingBalancesheets().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListAccountingBalancesheetsRequest](../../models/operations/ListAccountingBalancesheetsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListAccountingBalancesheetsResponse](../../models/operations/ListAccountingBalancesheetsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingBankfeedaccounts

Returns a list of AccountingBankfeedaccounts. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingBankfeedaccounts" method="get" path="/accounting/{connection_id}/bankfeedaccount" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingBankfeedaccountsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingBankfeedaccountsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingBankfeedaccountsRequest req = ListAccountingBankfeedaccountsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingBankfeedaccountsResponse res = sdk.accounting().listAccountingBankfeedaccounts()
                .request(req)
                .call();

        if (res.accountingBankfeedaccounts().isPresent()) {
            System.out.println(res.accountingBankfeedaccounts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [ListAccountingBankfeedaccountsRequest](../../models/operations/ListAccountingBankfeedaccountsRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[ListAccountingBankfeedaccountsResponse](../../models/operations/ListAccountingBankfeedaccountsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingBankfeedtransactions

Returns a list of AccountingBankfeedtransactions. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingBankfeedtransactions" method="get" path="/accounting/{connection_id}/bankfeedtransaction" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingBankfeedtransactionsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingBankfeedtransactionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingBankfeedtransactionsRequest req = ListAccountingBankfeedtransactionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingBankfeedtransactionsResponse res = sdk.accounting().listAccountingBankfeedtransactions()
                .request(req)
                .call();

        if (res.accountingBankfeedtransactions().isPresent()) {
            System.out.println(res.accountingBankfeedtransactions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [ListAccountingBankfeedtransactionsRequest](../../models/operations/ListAccountingBankfeedtransactionsRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |

### Response

**[ListAccountingBankfeedtransactionsResponse](../../models/operations/ListAccountingBankfeedtransactionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingBills

Returns a list of AccountingBills. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingBills" method="get" path="/accounting/{connection_id}/bill" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingBillsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingBillsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingBillsRequest req = ListAccountingBillsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingBillsResponse res = sdk.accounting().listAccountingBills()
                .request(req)
                .call();

        if (res.accountingBills().isPresent()) {
            System.out.println(res.accountingBills().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListAccountingBillsRequest](../../models/operations/ListAccountingBillsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListAccountingBillsResponse](../../models/operations/ListAccountingBillsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingCashflows

Returns a list of AccountingCashflows. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingCashflows" method="get" path="/accounting/{connection_id}/cashflow" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingCashflowsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingCashflowsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingCashflowsRequest req = ListAccountingCashflowsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingCashflowsResponse res = sdk.accounting().listAccountingCashflows()
                .request(req)
                .call();

        if (res.accountingCashflows().isPresent()) {
            System.out.println(res.accountingCashflows().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListAccountingCashflowsRequest](../../models/operations/ListAccountingCashflowsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListAccountingCashflowsResponse](../../models/operations/ListAccountingCashflowsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingCategories

Returns a list of AccountingCategories. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingCategories" method="get" path="/accounting/{connection_id}/category" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingCategoriesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingCategoriesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingCategoriesRequest req = ListAccountingCategoriesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingCategoriesResponse res = sdk.accounting().listAccountingCategories()
                .request(req)
                .call();

        if (res.accountingCategories().isPresent()) {
            System.out.println(res.accountingCategories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListAccountingCategoriesRequest](../../models/operations/ListAccountingCategoriesRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListAccountingCategoriesResponse](../../models/operations/ListAccountingCategoriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingContacts

Returns a list of AccountingContacts. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingContacts" method="get" path="/accounting/{connection_id}/contact" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingContactsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingContactsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingContactsRequest req = ListAccountingContactsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingContactsResponse res = sdk.accounting().listAccountingContacts()
                .request(req)
                .call();

        if (res.accountingContacts().isPresent()) {
            System.out.println(res.accountingContacts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAccountingContactsRequest](../../models/operations/ListAccountingContactsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAccountingContactsResponse](../../models/operations/ListAccountingContactsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingCreditmemoes

Returns a list of AccountingCreditmemoes. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingCreditmemoes" method="get" path="/accounting/{connection_id}/creditmemo" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingCreditmemoesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingCreditmemoesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingCreditmemoesRequest req = ListAccountingCreditmemoesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingCreditmemoesResponse res = sdk.accounting().listAccountingCreditmemoes()
                .request(req)
                .call();

        if (res.accountingCreditmemoes().isPresent()) {
            System.out.println(res.accountingCreditmemoes().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListAccountingCreditmemoesRequest](../../models/operations/ListAccountingCreditmemoesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListAccountingCreditmemoesResponse](../../models/operations/ListAccountingCreditmemoesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingExpensereports

Returns a list of AccountingExpensereports. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingExpensereports" method="get" path="/accounting/{connection_id}/expensereport" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingExpensereportsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingExpensereportsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingExpensereportsRequest req = ListAccountingExpensereportsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingExpensereportsResponse res = sdk.accounting().listAccountingExpensereports()
                .request(req)
                .call();

        if (res.accountingExpensereports().isPresent()) {
            System.out.println(res.accountingExpensereports().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [ListAccountingExpensereportsRequest](../../models/operations/ListAccountingExpensereportsRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[ListAccountingExpensereportsResponse](../../models/operations/ListAccountingExpensereportsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingExpenses

Returns a list of AccountingExpenses. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingExpenses" method="get" path="/accounting/{connection_id}/expense" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingExpensesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingExpensesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingExpensesRequest req = ListAccountingExpensesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingExpensesResponse res = sdk.accounting().listAccountingExpenses()
                .request(req)
                .call();

        if (res.accountingExpenses().isPresent()) {
            System.out.println(res.accountingExpenses().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAccountingExpensesRequest](../../models/operations/ListAccountingExpensesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAccountingExpensesResponse](../../models/operations/ListAccountingExpensesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingInvoices

Returns a list of AccountingInvoices. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingInvoices" method="get" path="/accounting/{connection_id}/invoice" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingInvoicesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingInvoicesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingInvoicesRequest req = ListAccountingInvoicesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingInvoicesResponse res = sdk.accounting().listAccountingInvoices()
                .request(req)
                .call();

        if (res.accountingInvoices().isPresent()) {
            System.out.println(res.accountingInvoices().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAccountingInvoicesRequest](../../models/operations/ListAccountingInvoicesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAccountingInvoicesResponse](../../models/operations/ListAccountingInvoicesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingJournals

Returns a list of AccountingJournals. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingJournals" method="get" path="/accounting/{connection_id}/journal" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingJournalsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingJournalsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingJournalsRequest req = ListAccountingJournalsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingJournalsResponse res = sdk.accounting().listAccountingJournals()
                .request(req)
                .call();

        if (res.accountingJournals().isPresent()) {
            System.out.println(res.accountingJournals().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAccountingJournalsRequest](../../models/operations/ListAccountingJournalsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAccountingJournalsResponse](../../models/operations/ListAccountingJournalsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~listAccountingOrders~~

Returns a list of AccountingOrders. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingOrders" method="get" path="/accounting/{connection_id}/order" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingOrdersRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingOrdersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingOrdersRequest req = ListAccountingOrdersRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingOrdersResponse res = sdk.accounting().listAccountingOrders()
                .request(req)
                .call();

        if (res.accountingOrders().isPresent()) {
            System.out.println(res.accountingOrders().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListAccountingOrdersRequest](../../models/operations/ListAccountingOrdersRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListAccountingOrdersResponse](../../models/operations/ListAccountingOrdersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingOrganizations

Returns a list of AccountingOrganizations. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingOrganizations" method="get" path="/accounting/{connection_id}/organization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingOrganizationsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingOrganizationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingOrganizationsRequest req = ListAccountingOrganizationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingOrganizationsResponse res = sdk.accounting().listAccountingOrganizations()
                .request(req)
                .call();

        if (res.accountingOrganizations().isPresent()) {
            System.out.println(res.accountingOrganizations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListAccountingOrganizationsRequest](../../models/operations/ListAccountingOrganizationsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListAccountingOrganizationsResponse](../../models/operations/ListAccountingOrganizationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingPaymentterms

Returns a list of AccountingPaymentterms. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingPaymentterms" method="get" path="/accounting/{connection_id}/paymentterm" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingPaymenttermsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingPaymenttermsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingPaymenttermsRequest req = ListAccountingPaymenttermsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingPaymenttermsResponse res = sdk.accounting().listAccountingPaymentterms()
                .request(req)
                .call();

        if (res.accountingPaymentterms().isPresent()) {
            System.out.println(res.accountingPaymentterms().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListAccountingPaymenttermsRequest](../../models/operations/ListAccountingPaymenttermsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListAccountingPaymenttermsResponse](../../models/operations/ListAccountingPaymenttermsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingProfitlosses

Returns a list of AccountingProfitlosses. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingProfitlosses" method="get" path="/accounting/{connection_id}/profitloss" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingProfitlossesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingProfitlossesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingProfitlossesRequest req = ListAccountingProfitlossesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingProfitlossesResponse res = sdk.accounting().listAccountingProfitlosses()
                .request(req)
                .call();

        if (res.accountingProfitlosses().isPresent()) {
            System.out.println(res.accountingProfitlosses().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListAccountingProfitlossesRequest](../../models/operations/ListAccountingProfitlossesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListAccountingProfitlossesResponse](../../models/operations/ListAccountingProfitlossesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingProjects

Returns a list of AccountingProjects. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingProjects" method="get" path="/accounting/{connection_id}/project" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingProjectsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingProjectsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingProjectsRequest req = ListAccountingProjectsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingProjectsResponse res = sdk.accounting().listAccountingProjects()
                .request(req)
                .call();

        if (res.accountingProjects().isPresent()) {
            System.out.println(res.accountingProjects().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAccountingProjectsRequest](../../models/operations/ListAccountingProjectsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAccountingProjectsResponse](../../models/operations/ListAccountingProjectsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingPurchaseorders

Returns a list of AccountingPurchaseorders. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingPurchaseorders" method="get" path="/accounting/{connection_id}/purchaseorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingPurchaseordersRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingPurchaseordersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingPurchaseordersRequest req = ListAccountingPurchaseordersRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingPurchaseordersResponse res = sdk.accounting().listAccountingPurchaseorders()
                .request(req)
                .call();

        if (res.accountingPurchaseorders().isPresent()) {
            System.out.println(res.accountingPurchaseorders().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [ListAccountingPurchaseordersRequest](../../models/operations/ListAccountingPurchaseordersRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[ListAccountingPurchaseordersResponse](../../models/operations/ListAccountingPurchaseordersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingPurchasereceipts

Returns a list of AccountingPurchasereceipts. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingPurchasereceipts" method="get" path="/accounting/{connection_id}/purchasereceipt" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingPurchasereceiptsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingPurchasereceiptsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingPurchasereceiptsRequest req = ListAccountingPurchasereceiptsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingPurchasereceiptsResponse res = sdk.accounting().listAccountingPurchasereceipts()
                .request(req)
                .call();

        if (res.accountingPurchasereceipts().isPresent()) {
            System.out.println(res.accountingPurchasereceipts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [ListAccountingPurchasereceiptsRequest](../../models/operations/ListAccountingPurchasereceiptsRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[ListAccountingPurchasereceiptsResponse](../../models/operations/ListAccountingPurchasereceiptsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingQuotes

Returns a list of AccountingQuotes. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingQuotes" method="get" path="/accounting/{connection_id}/quote" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingQuotesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingQuotesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingQuotesRequest req = ListAccountingQuotesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingQuotesResponse res = sdk.accounting().listAccountingQuotes()
                .request(req)
                .call();

        if (res.accountingQuotes().isPresent()) {
            System.out.println(res.accountingQuotes().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListAccountingQuotesRequest](../../models/operations/ListAccountingQuotesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListAccountingQuotesResponse](../../models/operations/ListAccountingQuotesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingSalesorders

Returns a list of AccountingSalesorders. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingSalesorders" method="get" path="/accounting/{connection_id}/salesorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingSalesordersRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingSalesordersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingSalesordersRequest req = ListAccountingSalesordersRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingSalesordersResponse res = sdk.accounting().listAccountingSalesorders()
                .request(req)
                .call();

        if (res.accountingSalesorders().isPresent()) {
            System.out.println(res.accountingSalesorders().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListAccountingSalesordersRequest](../../models/operations/ListAccountingSalesordersRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListAccountingSalesordersResponse](../../models/operations/ListAccountingSalesordersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingSalesreceipts

Returns a list of AccountingSalesreceipts. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingSalesreceipts" method="get" path="/accounting/{connection_id}/salesreceipt" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingSalesreceiptsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingSalesreceiptsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingSalesreceiptsRequest req = ListAccountingSalesreceiptsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingSalesreceiptsResponse res = sdk.accounting().listAccountingSalesreceipts()
                .request(req)
                .call();

        if (res.accountingSalesreceipts().isPresent()) {
            System.out.println(res.accountingSalesreceipts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListAccountingSalesreceiptsRequest](../../models/operations/ListAccountingSalesreceiptsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListAccountingSalesreceiptsResponse](../../models/operations/ListAccountingSalesreceiptsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingTaxrates

Returns a list of AccountingTaxrates. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingTaxrates" method="get" path="/accounting/{connection_id}/taxrate" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingTaxratesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingTaxratesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingTaxratesRequest req = ListAccountingTaxratesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingTaxratesResponse res = sdk.accounting().listAccountingTaxrates()
                .request(req)
                .call();

        if (res.accountingTaxrates().isPresent()) {
            System.out.println(res.accountingTaxrates().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAccountingTaxratesRequest](../../models/operations/ListAccountingTaxratesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAccountingTaxratesResponse](../../models/operations/ListAccountingTaxratesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingTransactions

Returns a list of AccountingTransactions. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingTransactions" method="get" path="/accounting/{connection_id}/transaction" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingTransactionsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingTransactionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingTransactionsRequest req = ListAccountingTransactionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingTransactionsResponse res = sdk.accounting().listAccountingTransactions()
                .request(req)
                .call();

        if (res.accountingTransactions().isPresent()) {
            System.out.println(res.accountingTransactions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListAccountingTransactionsRequest](../../models/operations/ListAccountingTransactionsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListAccountingTransactionsResponse](../../models/operations/ListAccountingTransactionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingTrialbalances

Returns a list of AccountingTrialbalances. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingTrialbalances" method="get" path="/accounting/{connection_id}/trialbalance" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingTrialbalancesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingTrialbalancesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingTrialbalancesRequest req = ListAccountingTrialbalancesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingTrialbalancesResponse res = sdk.accounting().listAccountingTrialbalances()
                .request(req)
                .call();

        if (res.accountingTrialbalances().isPresent()) {
            System.out.println(res.accountingTrialbalances().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListAccountingTrialbalancesRequest](../../models/operations/ListAccountingTrialbalancesRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListAccountingTrialbalancesResponse](../../models/operations/ListAccountingTrialbalancesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingVendorcredits

Returns a list of AccountingVendorcredits. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingVendorcredits" method="get" path="/accounting/{connection_id}/vendorcredit" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingVendorcreditsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingVendorcreditsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingVendorcreditsRequest req = ListAccountingVendorcreditsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingVendorcreditsResponse res = sdk.accounting().listAccountingVendorcredits()
                .request(req)
                .call();

        if (res.accountingVendorcredits().isPresent()) {
            System.out.println(res.accountingVendorcredits().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListAccountingVendorcreditsRequest](../../models/operations/ListAccountingVendorcreditsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListAccountingVendorcreditsResponse](../../models/operations/ListAccountingVendorcreditsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingAccount

Updates the AccountingAccount identified by `id`. Provide the unified AccountingAccount fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingAccount" method="patch" path="/accounting/{connection_id}/account/{id}" example="accounting_account" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingAccountRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingAccountResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingAccountRequest req = PatchAccountingAccountRequest.builder()
                .accountingAccount(AccountingAccount.builder()
                    .balance(12092d)
                    .createdAt(OffsetDateTime.parse("2022-07-03T17:57:07.391Z"))
                    .currency("CAD")
                    .customerDefinedCode("6170")
                    .description("Comedo vilitas harum cupiditate animus quo iste.")
                    .id("0e5bc595-fba2-48d9-85ec-973de8abe164")
                    .isPayable(false)
                    .metadata(List.of())
                    .name("Savings Account")
                    .status(Status.ARCHIVED)
                    .taxonomy(List.of(
                        AccountingAccountTaxonomy.builder()
                            .type(AccountingAccountTaxonomyType.SUBGROUP)
                            .value("vesper")
                            .originalType("peccatus")
                            .build()))
                    .type(Type.ACCOUNTS_RECEIVABLE)
                    .updatedAt(OffsetDateTime.parse("2023-08-16T01:01:05.983Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingAccountResponse res = sdk.accounting().patchAccountingAccount()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            System.out.println(res.accountingAccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAccountingAccountRequest](../../models/operations/PatchAccountingAccountRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAccountingAccountResponse](../../models/operations/PatchAccountingAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingBankfeedaccount

Updates the AccountingBankfeedaccount identified by `id`. Provide the unified AccountingBankfeedaccount fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingBankfeedaccount" method="patch" path="/accounting/{connection_id}/bankfeedaccount/{id}" example="accounting_bankfeedaccount" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingBankfeedaccountRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingBankfeedaccountResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingBankfeedaccountRequest req = PatchAccountingBankfeedaccountRequest.builder()
                .accountingBankfeedaccount(AccountingBankfeedaccount.builder()
                    .accountNumber("69722811")
                    .accountNumberLast4("2811")
                    .accountType(AccountType.LOAN)
                    .balance(49437d)
                    .bankName("Wells Fargo")
                    .createdAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .currency("AUD")
                    .feedStartAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .id("b120f54c-834b-4746-82e3-f7864087ad95")
                    .metadata(List.of())
                    .name("Kirlin - Rowe Checking")
                    .routingNumber("104153154")
                    .status(AccountingBankfeedaccountStatus.ACTIVE)
                    .updatedAt(OffsetDateTime.parse("2024-05-07T05:17:31.897Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingBankfeedaccountResponse res = sdk.accounting().patchAccountingBankfeedaccount()
                .request(req)
                .call();

        if (res.accountingBankfeedaccount().isPresent()) {
            System.out.println(res.accountingBankfeedaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [PatchAccountingBankfeedaccountRequest](../../models/operations/PatchAccountingBankfeedaccountRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[PatchAccountingBankfeedaccountResponse](../../models/operations/PatchAccountingBankfeedaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingBankfeedtransaction

Updates the AccountingBankfeedtransaction identified by `id`. Provide the unified AccountingBankfeedtransaction fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingBankfeedtransaction" method="patch" path="/accounting/{connection_id}/bankfeedtransaction/{id}" example="accounting_bankfeedtransaction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingBankfeedtransactionRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingBankfeedtransactionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingBankfeedtransactionRequest req = PatchAccountingBankfeedtransactionRequest.builder()
                .accountingBankfeedtransaction(AccountingBankfeedtransaction.builder()
                    .amount(60889d)
                    .bankCategory("Beauty")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-03-24T23:41:08.374Z"))
                    .currency("CAD")
                    .description("deposit processed at Renner - Quigley for SSP 824.35, using card ending ****1112. Account: ***7957.")
                    .id("f4144bcf-aee7-48f9-b87c-af4ca367c113")
                    .isPending(true)
                    .merchantName("McKenzie Inc")
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2025-05-08T20:40:06.678Z"))
                    .reference("09339705")
                    .transactionAt(OffsetDateTime.parse("2022-08-02T01:55:52.244Z"))
                    .type(AccountingBankfeedtransactionType.CREDIT)
                    .updatedAt(OffsetDateTime.parse("2022-05-26T09:17:12.629Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingBankfeedtransactionResponse res = sdk.accounting().patchAccountingBankfeedtransaction()
                .request(req)
                .call();

        if (res.accountingBankfeedtransaction().isPresent()) {
            System.out.println(res.accountingBankfeedtransaction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [PatchAccountingBankfeedtransactionRequest](../../models/operations/PatchAccountingBankfeedtransactionRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |

### Response

**[PatchAccountingBankfeedtransactionResponse](../../models/operations/PatchAccountingBankfeedtransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingBill

Updates the AccountingBill identified by `id`. Provide the unified AccountingBill fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingBill" method="patch" path="/accounting/{connection_id}/bill/{id}" example="accounting_bill" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingBillRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingBillResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingBillRequest req = PatchAccountingBillRequest.builder()
                .accountingBill(AccountingBill.builder()
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://mixed-flame.biz")
                            .id("8549d583-c47b-4f96-aef6-cd2b8057e0f8")
                            .mimeType("application/pdf")
                            .name("BILL-2466.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://minor-testimonial.biz")
                            .id("8b63ecba-a7a0-4e9e-bbd9-06ff15a86410")
                            .mimeType("application/pdf")
                            .name("BILL-2466-1.pdf")
                            .build()))
                    .balanceAmount(0d)
                    .billNumber("BILL-2466")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2019-08-08T23:03:14.104Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .dueAt(OffsetDateTime.parse("2019-09-07T23:03:14.104Z"))
                    .extendedNotes(List.of())
                    .id("b9b03095-503c-4bff-8aa6-c1e72585e4c4")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Cilicium infit amissio ante demulceo annus defluo tumultus.")
                    .paidAmount(0d)
                    .paidAt(OffsetDateTime.parse("2019-08-15T17:24:28.313Z"))
                    .paymentCollectionMethod(PaymentCollectionMethod.CHARGE_AUTOMATICALLY)
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2019-08-08T23:03:14.104Z"))
                    .purchaseorderIds(List.of())
                    .send(true)
                    .status(AccountingBillStatus.PARTIALLY_PAID)
                    .subTotalAmount(0d)
                    .taxAmount(0d)
                    .term(Term.NET90)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2020-06-05T05:21:36.975Z"))
                    .url("https://utilized-partridge.info/bills/BILL-2466")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingBillResponse res = sdk.accounting().patchAccountingBill()
                .request(req)
                .call();

        if (res.accountingBill().isPresent()) {
            System.out.println(res.accountingBill().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchAccountingBillRequest](../../models/operations/PatchAccountingBillRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchAccountingBillResponse](../../models/operations/PatchAccountingBillResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingCategory

Updates the AccountingCategory identified by `id`. Provide the unified AccountingCategory fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingCategory" method="patch" path="/accounting/{connection_id}/category/{id}" example="accounting_category" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.AccountingCategory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingCategoryRequest req = PatchAccountingCategoryRequest.builder()
                .accountingCategory(AccountingCategory.builder()
                    .createdAt(OffsetDateTime.parse("2023-05-30T12:29:04.257Z"))
                    .description("Labore basium corrumpo crinis ars subito pecto.")
                    .id("25b79a64-61e3-470d-8b0c-02ed74e04cc4")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Automotive")
                    .updatedAt(OffsetDateTime.parse("2025-10-05T17:27:24.844Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingCategoryResponse res = sdk.accounting().patchAccountingCategory()
                .request(req)
                .call();

        if (res.accountingCategory().isPresent()) {
            System.out.println(res.accountingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchAccountingCategoryRequest](../../models/operations/PatchAccountingCategoryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchAccountingCategoryResponse](../../models/operations/PatchAccountingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingContact

Updates the AccountingContact identified by `id`. Provide the unified AccountingContact fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingContact" method="patch" path="/accounting/{connection_id}/contact/{id}" example="accounting_contact" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingContactRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingContactResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingContactRequest req = PatchAccountingContactRequest.builder()
                .accountingContact(AccountingContact.builder()
                    .associatedContacts(List.of())
                    .balanceAmount(55574d)
                    .billingAddress(PropertyAccountingContactBillingAddress.builder()
                        .address1("9171 Parisian Gateway")
                        .city("Lake Keltonboro")
                        .countryCode("US")
                        .postalCode("70131-2908")
                        .region("Illinois")
                        .regionCode("CO")
                        .build())
                    .companyName("Rice LLC")
                    .createdAt(OffsetDateTime.parse("2021-08-15T14:56:50.258Z"))
                    .currency("AUD")
                    .emails(List.of(
                        AccountingEmail.builder()
                            .email("michele.breitenberg@ricellc.com")
                            .type(AccountingEmailType.WORK)
                            .build(),
                        AccountingEmail.builder()
                            .email("accounts@ricellc.com")
                            .type(AccountingEmailType.OTHER)
                            .build()))
                    .firstName("Michele")
                    .id("015b342d-d86b-496f-bd92-bd55149dd188")
                    .identification("508720595")
                    .isActive(true)
                    .isCustomer(true)
                    .lastName("Breitenberg")
                    .metadata(List.of())
                    .name("Rice LLC")
                    .notes("Tabella reprehenderit sono corrupti approbo crastinus sopor ultra.")
                    .paymentMethods(List.of(
                        AccountingContactPaymentMethod.builder()
                            .type(AccountingContactPaymentMethodType.CARD)
                            .default_(true)
                            .id("b4735bb5-63b6-4315-bb72-8a093f3ec50d")
                            .name("Visa 5318")
                            .build()))
                    .portalUrl("https://ricellc.com/billing")
                    .shippingAddress(PropertyAccountingContactShippingAddress.builder()
                        .address1("786 Dare Meadows")
                        .city("Phoenix")
                        .countryCode("US")
                        .postalCode("68675")
                        .region("Tennessee")
                        .regionCode("NE")
                        .build())
                    .taxExemption(TaxExemption.FOREIGN)
                    .taxNumber("564107844")
                    .telephones(List.of(
                        AccountingTelephone.builder()
                            .telephone("(217) 260-4409")
                            .type(AccountingTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2024-01-05T03:16:26.959Z"))
                    .website("https://ricellc.com")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingContactResponse res = sdk.accounting().patchAccountingContact()
                .request(req)
                .call();

        if (res.accountingContact().isPresent()) {
            System.out.println(res.accountingContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAccountingContactRequest](../../models/operations/PatchAccountingContactRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAccountingContactResponse](../../models/operations/PatchAccountingContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingCreditmemo

Updates the AccountingCreditmemo identified by `id`. Provide the unified AccountingCreditmemo fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingCreditmemo" method="patch" path="/accounting/{connection_id}/creditmemo/{id}" example="accounting_creditmemo" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingCreditmemoRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingCreditmemoResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingCreditmemoRequest req = PatchAccountingCreditmemoRequest.builder()
                .accountingCreditmemo(AccountingCreditmemo.builder()
                    .applications(List.of())
                    .attachments(List.of())
                    .balanceAmount(0d)
                    .createdAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .creditmemoNumber("CM-99537")
                    .currency("AUD")
                    .discountAmount(0d)
                    .id("26853a17-74f3-4271-9fda-5dc7fe57ffe3")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Amo adfero torqueo quas victoria.")
                    .postedAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .send(true)
                    .status(AccountingCreditmemoStatus.AUTHORIZED)
                    .taxAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2025-10-04T08:58:15.558Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingCreditmemoResponse res = sdk.accounting().patchAccountingCreditmemo()
                .request(req)
                .call();

        if (res.accountingCreditmemo().isPresent()) {
            System.out.println(res.accountingCreditmemo().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [PatchAccountingCreditmemoRequest](../../models/operations/PatchAccountingCreditmemoRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[PatchAccountingCreditmemoResponse](../../models/operations/PatchAccountingCreditmemoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingExpense

Updates the AccountingExpense identified by `id`. Provide the unified AccountingExpense fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingExpense" method="patch" path="/accounting/{connection_id}/expense/{id}" example="accounting_expense" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingExpenseRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingExpenseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingExpenseRequest req = PatchAccountingExpenseRequest.builder()
                .accountingExpense(AccountingExpense.builder()
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://avaricious-larva.biz")
                            .id("97a2f9b3-4d01-42bd-b14d-057cf8cc5d47")
                            .mimeType("application/pdf")
                            .name("receipt-9696.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://precious-comparison.net/")
                            .id("a4305d3e-0ca8-4bb6-b48e-6c9f781876db")
                            .mimeType("application/pdf")
                            .name("receipt-9696-1.pdf")
                            .build()))
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .currency("GBP")
                    .externalNumber("EXP-38303")
                    .id("184aa182-b050-445e-bdb1-31e56f4ce175")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("f26b1e1e-415d-4faa-b7f5-17d78415571a")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(364.74)
                            .unitAmount(364.74)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("7a7f4b13-793e-4ce6-8560-d6bf1eb43b87")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(258.35)
                            .unitAmount(258.35)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("375ad897-4aa0-4a5b-92dd-6befa0d7e08f")
                            .itemName("Conference ticket")
                            .notes("Sint spiculum carcer ago charisma.")
                            .taxAmount(0d)
                            .totalAmount(28.14)
                            .unitAmount(28.14)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("a70281cd-b741-4226-bdf7-ce036c3b9810")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(157.04)
                            .unitAmount(157.04)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("d1330690-2a86-4ced-9136-73676e6448e3")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(164.02)
                            .unitAmount(164.02)
                            .unitQuantity(1d)
                            .build()))
                    .metadata(List.of())
                    .name("A deposit for KPW 867.85 was made at Kohler LLC via card ending ****1416 on account ***1040.")
                    .paymentMethod("CASH")
                    .postedAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .status(AccountingExpenseStatus.SUBMITTED)
                    .taxAmount(0d)
                    .totalAmount(972.29)
                    .type(AccountingExpenseType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2020-09-03T14:10:27.597Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingExpenseResponse res = sdk.accounting().patchAccountingExpense()
                .request(req)
                .call();

        if (res.accountingExpense().isPresent()) {
            System.out.println(res.accountingExpense().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAccountingExpenseRequest](../../models/operations/PatchAccountingExpenseRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAccountingExpenseResponse](../../models/operations/PatchAccountingExpenseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingExpensereport

Updates the AccountingExpensereport identified by `id`. Provide the unified AccountingExpensereport fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingExpensereport" method="patch" path="/accounting/{connection_id}/expensereport/{id}" example="accounting_expensereport" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingExpensereportRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingExpensereportResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingExpensereportRequest req = PatchAccountingExpensereportRequest.builder()
                .accountingExpensereport(AccountingExpensereport.builder()
                    .approvedAt(OffsetDateTime.parse("2021-04-24T11:40:56.582Z"))
                    .attachments(List.of())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .currency("GBP")
                    .externalNumber("ER-31240")
                    .id("bba58861-7823-4838-bacb-4b41b1b0967a")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("6b7145c0-9575-4401-8543-a0731a3c72df")
                            .itemName("Conference ticket")
                            .taxAmount(0d)
                            .totalAmount(39.9)
                            .unitAmount(39.9)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("d648abcb-1a7f-4bf6-9309-ee367dc958d0")
                            .itemName("Flight")
                            .notes("Aliquam soluta omnis dolor.")
                            .taxAmount(0d)
                            .totalAmount(193.17)
                            .unitAmount(193.17)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("f09f632f-dcff-4d1f-b809-0f18df07b5b2")
                            .itemName("Client dinner")
                            .notes("Altus caveo capio.")
                            .taxAmount(0d)
                            .totalAmount(230.12)
                            .unitAmount(230.12)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("df70ab04-8856-4628-bf11-53c9f9750437")
                            .itemName("Flight")
                            .taxAmount(0d)
                            .totalAmount(445.27)
                            .unitAmount(445.27)
                            .unitQuantity(1d)
                            .build()))
                    .metadata(List.of())
                    .name("Jamil Christiansen - October expenses")
                    .postedAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .reimbursedAmount(908.46)
                    .reimbursedAt(OffsetDateTime.parse("2021-04-24T11:40:56.582Z"))
                    .status(AccountingExpensereportStatus.PAID)
                    .taxAmount(0d)
                    .totalAmount(908.46)
                    .updatedAt(OffsetDateTime.parse("2021-04-24T11:40:56.582Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingExpensereportResponse res = sdk.accounting().patchAccountingExpensereport()
                .request(req)
                .call();

        if (res.accountingExpensereport().isPresent()) {
            System.out.println(res.accountingExpensereport().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [PatchAccountingExpensereportRequest](../../models/operations/PatchAccountingExpensereportRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[PatchAccountingExpensereportResponse](../../models/operations/PatchAccountingExpensereportResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingInvoice

Updates the AccountingInvoice identified by `id`. Provide the unified AccountingInvoice fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingInvoice" method="patch" path="/accounting/{connection_id}/invoice/{id}" example="accounting_invoice" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingInvoiceRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingInvoiceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingInvoiceRequest req = PatchAccountingInvoiceRequest.builder()
                .accountingInvoice(AccountingInvoice.builder()
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://simplistic-translation.com")
                            .id("d1139cf3-7d39-4849-8e1f-4603ae5b6de5")
                            .mimeType("application/pdf")
                            .name("INV-77705.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://squiggly-amnesty.name/")
                            .id("49f264d9-2f61-4c0d-ae69-52fbf3f7086e")
                            .mimeType("application/pdf")
                            .name("INV-77705-1.pdf")
                            .build()))
                    .balanceAmount(0d)
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-11-07T14:17:29.587Z"))
                    .currency("GBP")
                    .discountAmount(0d)
                    .dueAt(OffsetDateTime.parse("2022-12-07T14:17:29.587Z"))
                    .extendedNotes(List.of())
                    .id("baba8ed5-c51f-47a1-9b34-db13edaf7003")
                    .invoiceNumber("INV-77705")
                    .isInclusiveOfTax(false)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Auctus comburo clarus ubi deprimo comburo vulgus.")
                    .paymentCollectionMethod(AccountingInvoicePaymentCollectionMethod.CHARGE_AUTOMATICALLY)
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2022-11-07T14:17:29.587Z"))
                    .reference("PO-2331")
                    .salesorderIds(List.of())
                    .send(true)
                    .status(AccountingInvoiceStatus.OVERDUE)
                    .subTotalAmount(0d)
                    .taxAmount(0d)
                    .term(AccountingInvoiceTerm.NET25)
                    .totalAmount(0d)
                    .type(AccountingInvoiceType.INVOICE)
                    .updatedAt(OffsetDateTime.parse("2026-05-25T00:02:37.512Z"))
                    .url("https://helpful-exterior.com/invoices/INV-77705")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingInvoiceResponse res = sdk.accounting().patchAccountingInvoice()
                .request(req)
                .call();

        if (res.accountingInvoice().isPresent()) {
            System.out.println(res.accountingInvoice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAccountingInvoiceRequest](../../models/operations/PatchAccountingInvoiceRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAccountingInvoiceResponse](../../models/operations/PatchAccountingInvoiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingJournal

Updates the AccountingJournal identified by `id`. Provide the unified AccountingJournal fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingJournal" method="patch" path="/accounting/{connection_id}/journal/{id}" example="accounting_journal" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingJournalRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingJournalResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingJournalRequest req = PatchAccountingJournalRequest.builder()
                .accountingJournal(AccountingJournal.builder()
                    .attachments(List.of())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-02-20T15:14:55.881Z"))
                    .currency("CAD")
                    .description("Constans adipisci.")
                    .id("e4865423-ba1a-4d53-aed2-4e56b4a058f0")
                    .isInclusiveOfTax(true)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2023-11-26T10:53:23.346Z"))
                    .reference("JE-78884")
                    .source("crustulum")
                    .status(AccountingJournalStatus.VOID)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2022-01-21T00:20:56.356Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingJournalResponse res = sdk.accounting().patchAccountingJournal()
                .request(req)
                .call();

        if (res.accountingJournal().isPresent()) {
            System.out.println(res.accountingJournal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAccountingJournalRequest](../../models/operations/PatchAccountingJournalRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAccountingJournalResponse](../../models/operations/PatchAccountingJournalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~patchAccountingOrder~~

Updates the AccountingOrder identified by `id`. Provide the unified AccountingOrder fields to change in the request body.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingOrder" method="patch" path="/accounting/{connection_id}/order/{id}" example="accounting_order" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingOrderRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingOrderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingOrderRequest req = PatchAccountingOrderRequest.builder()
                .accountingOrder(AccountingOrder.builder()
                    .billingAddress(PropertyAccountingOrderBillingAddress.builder()
                        .address1("125 Hayden Highway")
                        .city("Altoona")
                        .countryCode("US")
                        .postalCode("94706-7691")
                        .region("Louisiana")
                        .regionCode("VT")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .currency("GBP")
                    .id("cf1ec589-f955-4d90-82e6-fb12de603bf0")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .shippingAddress(PropertyAccountingOrderShippingAddress.builder()
                        .address1("450 Garett Mall")
                        .city("New Kamronburgh")
                        .countryCode("US")
                        .postalCode("76546")
                        .region("Oregon")
                        .regionCode("VA")
                        .build())
                    .status(AccountingOrderStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .type(AccountingOrderType.SALES)
                    .updatedAt(OffsetDateTime.parse("2022-02-15T17:04:05.241Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingOrderResponse res = sdk.accounting().patchAccountingOrder()
                .request(req)
                .call();

        if (res.accountingOrder().isPresent()) {
            System.out.println(res.accountingOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchAccountingOrderRequest](../../models/operations/PatchAccountingOrderRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchAccountingOrderResponse](../../models/operations/PatchAccountingOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingPaymentterm

Updates the AccountingPaymentterm identified by `id`. Provide the unified AccountingPaymentterm fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingPaymentterm" method="patch" path="/accounting/{connection_id}/paymentterm/{id}" example="accounting_paymentterm" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingPaymenttermRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingPaymenttermResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingPaymenttermRequest req = PatchAccountingPaymenttermRequest.builder()
                .accountingPaymentterm(AccountingPaymentterm.builder()
                    .category(Category.STANDARD)
                    .createdAt(OffsetDateTime.parse("2021-08-22T22:42:42.265Z"))
                    .dayOfMonthDue(4d)
                    .description("Cultura cena claustrum.")
                    .discountDayOfMonth(13d)
                    .discountDays(4d)
                    .discountPercent(5d)
                    .dueDays(57d)
                    .dueNextMonthDays(9d)
                    .id("be6121ab-c8da-4926-80e9-7b1bf9fb45eb")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Net 30")
                    .type(AccountingPaymenttermType.NET15)
                    .updatedAt(OffsetDateTime.parse("2026-02-07T23:22:10.435Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingPaymenttermResponse res = sdk.accounting().patchAccountingPaymentterm()
                .request(req)
                .call();

        if (res.accountingPaymentterm().isPresent()) {
            System.out.println(res.accountingPaymentterm().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [PatchAccountingPaymenttermRequest](../../models/operations/PatchAccountingPaymenttermRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[PatchAccountingPaymenttermResponse](../../models/operations/PatchAccountingPaymenttermResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingProject

Updates the AccountingProject identified by `id`. Provide the unified AccountingProject fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingProject" method="patch" path="/accounting/{connection_id}/project/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingProjectRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingProjectResponse;
import to.unified.unified_java_sdk.models.shared.AccountingProject;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingProjectRequest req = PatchAccountingProjectRequest.builder()
                .accountingProject(AccountingProject.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingProjectResponse res = sdk.accounting().patchAccountingProject()
                .request(req)
                .call();

        if (res.accountingProject().isPresent()) {
            System.out.println(res.accountingProject().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAccountingProjectRequest](../../models/operations/PatchAccountingProjectRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAccountingProjectResponse](../../models/operations/PatchAccountingProjectResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingPurchaseorder

Updates the AccountingPurchaseorder identified by `id`. Provide the unified AccountingPurchaseorder fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingPurchaseorder" method="patch" path="/accounting/{connection_id}/purchaseorder/{id}" example="accounting_purchaseorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingPurchaseorderRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingPurchaseorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingPurchaseorderRequest req = PatchAccountingPurchaseorderRequest.builder()
                .accountingPurchaseorder(AccountingPurchaseorder.builder()
                    .attachments(List.of())
                    .billingAddress(PropertyAccountingPurchaseorderBillingAddress.builder()
                        .address1("37214 Golden Via")
                        .address2("Suite 713")
                        .city("North Eltontown")
                        .countryCode("US")
                        .postalCode("75366")
                        .region("Kentucky")
                        .regionCode("MA")
                        .build())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .currency("EUR")
                    .id("ba91e052-2a44-4f7e-ad55-2e2940df155d")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .shippingAddress(PropertyAccountingPurchaseorderShippingAddress.builder()
                        .address1("9455 Brad Forks")
                        .city("Washington")
                        .countryCode("US")
                        .postalCode("16547")
                        .region("Idaho")
                        .regionCode("NY")
                        .build())
                    .status(AccountingPurchaseorderStatus.SUBMITTED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2021-08-15T07:37:10.457Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingPurchaseorderResponse res = sdk.accounting().patchAccountingPurchaseorder()
                .request(req)
                .call();

        if (res.accountingPurchaseorder().isPresent()) {
            System.out.println(res.accountingPurchaseorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [PatchAccountingPurchaseorderRequest](../../models/operations/PatchAccountingPurchaseorderRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[PatchAccountingPurchaseorderResponse](../../models/operations/PatchAccountingPurchaseorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingQuote

Updates the AccountingQuote identified by `id`. Provide the unified AccountingQuote fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingQuote" method="patch" path="/accounting/{connection_id}/quote/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingQuoteRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingQuoteResponse;
import to.unified.unified_java_sdk.models.shared.AccountingQuote;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingQuoteRequest req = PatchAccountingQuoteRequest.builder()
                .accountingQuote(AccountingQuote.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingQuoteResponse res = sdk.accounting().patchAccountingQuote()
                .request(req)
                .call();

        if (res.accountingQuote().isPresent()) {
            System.out.println(res.accountingQuote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchAccountingQuoteRequest](../../models/operations/PatchAccountingQuoteRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchAccountingQuoteResponse](../../models/operations/PatchAccountingQuoteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingSalesorder

Updates the AccountingSalesorder identified by `id`. Provide the unified AccountingSalesorder fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingSalesorder" method="patch" path="/accounting/{connection_id}/salesorder/{id}" example="accounting_salesorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingSalesorderRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingSalesorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingSalesorderRequest req = PatchAccountingSalesorderRequest.builder()
                .accountingSalesorder(AccountingSalesorder.builder()
                    .billingAddress(PropertyAccountingSalesorderBillingAddress.builder()
                        .address1("1487 Valley Road")
                        .address2("Apt. 287")
                        .city("Lake Angelina")
                        .countryCode("US")
                        .postalCode("85469-3199")
                        .region("Georgia")
                        .regionCode("MT")
                        .build())
                    .categoryIds(List.of())
                    .closedAt(OffsetDateTime.parse("2023-04-03T11:26:43.546Z"))
                    .createdAt(OffsetDateTime.parse("2022-01-17T16:11:50.310Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .fees(List.of())
                    .fulfillmentType(FulfillmentType.OTHER)
                    .id("72af749f-3e30-4b15-85ae-f4f58c2d19fc")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .orderNumber("832663")
                    .paidAmount(0d)
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2022-01-17T16:11:50.310Z"))
                    .refundedAmount(0d)
                    .salesChannel("Wholesale")
                    .serviceChargeAmount(0d)
                    .shippingAddress(PropertyAccountingSalesorderShippingAddress.builder()
                        .address1("781 Darrell Coves")
                        .city("Annabelfield")
                        .countryCode("US")
                        .postalCode("92148-4116")
                        .region("Virginia")
                        .regionCode("WI")
                        .build())
                    .status(AccountingSalesorderStatus.PAID)
                    .subtotalAmount(0d)
                    .taxAmount(0d)
                    .tipAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-04-03T11:26:43.546Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingSalesorderResponse res = sdk.accounting().patchAccountingSalesorder()
                .request(req)
                .call();

        if (res.accountingSalesorder().isPresent()) {
            System.out.println(res.accountingSalesorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [PatchAccountingSalesorderRequest](../../models/operations/PatchAccountingSalesorderRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[PatchAccountingSalesorderResponse](../../models/operations/PatchAccountingSalesorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingTaxrate

Updates the AccountingTaxrate identified by `id`. Provide the unified AccountingTaxrate fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingTaxrate" method="patch" path="/accounting/{connection_id}/taxrate/{id}" example="accounting_taxrate" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingTaxrateRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingTaxrateResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingTaxrateRequest req = PatchAccountingTaxrateRequest.builder()
                .accountingTaxrate(AccountingTaxrate.builder()
                    .components(List.of(
                        AccountingTaxrateComponent.builder()
                            .isCompound(false)
                            .name("Exempt")
                            .rate(0d)
                            .build()))
                    .country("US")
                    .createdAt(OffsetDateTime.parse("2020-01-04T10:37:56.894Z"))
                    .description("Exempt (0%)")
                    .effectiveRate(0d)
                    .id("0f7d9c39-f16c-4dfe-8d34-4a0bb7cd22a0")
                    .isActive(false)
                    .isCompound(false)
                    .metadata(List.of())
                    .name("Exempt")
                    .rate(0d)
                    .region("FL")
                    .totalRate(0d)
                    .type(AccountingTaxrateType.SALES)
                    .updatedAt(OffsetDateTime.parse("2020-02-13T18:59:35.713Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingTaxrateResponse res = sdk.accounting().patchAccountingTaxrate()
                .request(req)
                .call();

        if (res.accountingTaxrate().isPresent()) {
            System.out.println(res.accountingTaxrate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAccountingTaxrateRequest](../../models/operations/PatchAccountingTaxrateRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAccountingTaxrateResponse](../../models/operations/PatchAccountingTaxrateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingTransaction

Updates the AccountingTransaction identified by `id`. Provide the unified AccountingTransaction fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingTransaction" method="patch" path="/accounting/{connection_id}/transaction/{id}" example="accounting_transaction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingTransactionRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingTransactionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingTransactionRequest req = PatchAccountingTransactionRequest.builder()
                .accountingTransaction(AccountingTransaction.builder()
                    .createdAt(OffsetDateTime.parse("2019-09-25T11:40:42.574Z"))
                    .id("c779d79e-74a4-49cf-a253-39c8387899f5")
                    .lineitems(List.of(
                        AccountingTransactionLineItem.builder()
                            .categoryIds(List.of())
                            .description("The Wilma Car is the latest in a series of beneficial products from Fritsch Group")
                            .id("06749af5-17d8-496d-ae3d-15ceb8b40c78")
                            .name("Table")
                            .totalAmount(10184d)
                            .unitAmount(536d)
                            .unitQuantity(19d)
                            .build()))
                    .memo("withdrawal confirmed at Doyle, White and Conroy for FJD 391.94, card ending in ****0497 associated with account ***6676.")
                    .status(AccountingTransactionStatus.PENDING)
                    .taxAmount(0d)
                    .totalAmount(10184d)
                    .transactionAt(OffsetDateTime.parse("2019-09-25T11:40:42.574Z"))
                    .updatedAt(OffsetDateTime.parse("2019-10-14T12:24:45.298Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingTransactionResponse res = sdk.accounting().patchAccountingTransaction()
                .request(req)
                .call();

        if (res.accountingTransaction().isPresent()) {
            System.out.println(res.accountingTransaction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [PatchAccountingTransactionRequest](../../models/operations/PatchAccountingTransactionRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[PatchAccountingTransactionResponse](../../models/operations/PatchAccountingTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingVendorcredit

Updates the AccountingVendorcredit identified by `id`. Provide the unified AccountingVendorcredit fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingVendorcredit" method="patch" path="/accounting/{connection_id}/vendorcredit/{id}" example="accounting_vendorcredit" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingVendorcreditRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingVendorcreditResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingVendorcreditRequest req = PatchAccountingVendorcreditRequest.builder()
                .accountingVendorcredit(AccountingVendorcredit.builder()
                    .applications(List.of())
                    .balanceAmount(0d)
                    .createdAt(OffsetDateTime.parse("2023-04-15T21:14:08.197Z"))
                    .currency("USD")
                    .id("14e4845c-f28d-4811-a93a-515c93d347f7")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Avaritia tantum campana comitatus atrox.")
                    .postedAt(OffsetDateTime.parse("2023-04-15T21:14:08.197Z"))
                    .status(AccountingVendorcreditStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-10-07T20:03:34.644Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingVendorcreditResponse res = sdk.accounting().patchAccountingVendorcredit()
                .request(req)
                .call();

        if (res.accountingVendorcredit().isPresent()) {
            System.out.println(res.accountingVendorcredit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [PatchAccountingVendorcreditRequest](../../models/operations/PatchAccountingVendorcreditRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[PatchAccountingVendorcreditResponse](../../models/operations/PatchAccountingVendorcreditResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingAccount

Deletes the AccountingAccount identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingAccount" method="delete" path="/accounting/{connection_id}/account/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingAccountRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingAccountResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingAccountRequest req = RemoveAccountingAccountRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingAccountResponse res = sdk.accounting().removeAccountingAccount()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAccountingAccountRequest](../../models/operations/RemoveAccountingAccountRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAccountingAccountResponse](../../models/operations/RemoveAccountingAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingBankfeedaccount

Deletes the AccountingBankfeedaccount identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingBankfeedaccount" method="delete" path="/accounting/{connection_id}/bankfeedaccount/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingBankfeedaccountRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingBankfeedaccountResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingBankfeedaccountRequest req = RemoveAccountingBankfeedaccountRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingBankfeedaccountResponse res = sdk.accounting().removeAccountingBankfeedaccount()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [RemoveAccountingBankfeedaccountRequest](../../models/operations/RemoveAccountingBankfeedaccountRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[RemoveAccountingBankfeedaccountResponse](../../models/operations/RemoveAccountingBankfeedaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingBankfeedtransaction

Deletes the AccountingBankfeedtransaction identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingBankfeedtransaction" method="delete" path="/accounting/{connection_id}/bankfeedtransaction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingBankfeedtransactionRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingBankfeedtransactionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingBankfeedtransactionRequest req = RemoveAccountingBankfeedtransactionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingBankfeedtransactionResponse res = sdk.accounting().removeAccountingBankfeedtransaction()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [RemoveAccountingBankfeedtransactionRequest](../../models/operations/RemoveAccountingBankfeedtransactionRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[RemoveAccountingBankfeedtransactionResponse](../../models/operations/RemoveAccountingBankfeedtransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingBill

Deletes the AccountingBill identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingBill" method="delete" path="/accounting/{connection_id}/bill/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingBillRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingBillResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingBillRequest req = RemoveAccountingBillRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingBillResponse res = sdk.accounting().removeAccountingBill()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveAccountingBillRequest](../../models/operations/RemoveAccountingBillRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveAccountingBillResponse](../../models/operations/RemoveAccountingBillResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingCategory

Deletes the AccountingCategory identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingCategory" method="delete" path="/accounting/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingCategoryRequest req = RemoveAccountingCategoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingCategoryResponse res = sdk.accounting().removeAccountingCategory()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveAccountingCategoryRequest](../../models/operations/RemoveAccountingCategoryRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveAccountingCategoryResponse](../../models/operations/RemoveAccountingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingContact

Deletes the AccountingContact identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingContact" method="delete" path="/accounting/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingContactRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingContactResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingContactRequest req = RemoveAccountingContactRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingContactResponse res = sdk.accounting().removeAccountingContact()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAccountingContactRequest](../../models/operations/RemoveAccountingContactRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAccountingContactResponse](../../models/operations/RemoveAccountingContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingCreditmemo

Deletes the AccountingCreditmemo identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingCreditmemo" method="delete" path="/accounting/{connection_id}/creditmemo/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingCreditmemoRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingCreditmemoResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingCreditmemoRequest req = RemoveAccountingCreditmemoRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingCreditmemoResponse res = sdk.accounting().removeAccountingCreditmemo()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [RemoveAccountingCreditmemoRequest](../../models/operations/RemoveAccountingCreditmemoRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[RemoveAccountingCreditmemoResponse](../../models/operations/RemoveAccountingCreditmemoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingExpense

Deletes the AccountingExpense identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingExpense" method="delete" path="/accounting/{connection_id}/expense/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingExpenseRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingExpenseResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingExpenseRequest req = RemoveAccountingExpenseRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingExpenseResponse res = sdk.accounting().removeAccountingExpense()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAccountingExpenseRequest](../../models/operations/RemoveAccountingExpenseRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAccountingExpenseResponse](../../models/operations/RemoveAccountingExpenseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingExpensereport

Deletes the AccountingExpensereport identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingExpensereport" method="delete" path="/accounting/{connection_id}/expensereport/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingExpensereportRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingExpensereportResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingExpensereportRequest req = RemoveAccountingExpensereportRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingExpensereportResponse res = sdk.accounting().removeAccountingExpensereport()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [RemoveAccountingExpensereportRequest](../../models/operations/RemoveAccountingExpensereportRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[RemoveAccountingExpensereportResponse](../../models/operations/RemoveAccountingExpensereportResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingInvoice

Deletes the AccountingInvoice identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingInvoice" method="delete" path="/accounting/{connection_id}/invoice/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingInvoiceRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingInvoiceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingInvoiceRequest req = RemoveAccountingInvoiceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingInvoiceResponse res = sdk.accounting().removeAccountingInvoice()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAccountingInvoiceRequest](../../models/operations/RemoveAccountingInvoiceRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAccountingInvoiceResponse](../../models/operations/RemoveAccountingInvoiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingJournal

Deletes the AccountingJournal identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingJournal" method="delete" path="/accounting/{connection_id}/journal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingJournalRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingJournalResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingJournalRequest req = RemoveAccountingJournalRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingJournalResponse res = sdk.accounting().removeAccountingJournal()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAccountingJournalRequest](../../models/operations/RemoveAccountingJournalRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAccountingJournalResponse](../../models/operations/RemoveAccountingJournalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~removeAccountingOrder~~

Deletes the AccountingOrder identified by `id`.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingOrder" method="delete" path="/accounting/{connection_id}/order/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingOrderRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingOrderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingOrderRequest req = RemoveAccountingOrderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingOrderResponse res = sdk.accounting().removeAccountingOrder()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveAccountingOrderRequest](../../models/operations/RemoveAccountingOrderRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveAccountingOrderResponse](../../models/operations/RemoveAccountingOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingPaymentterm

Deletes the AccountingPaymentterm identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingPaymentterm" method="delete" path="/accounting/{connection_id}/paymentterm/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingPaymenttermRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingPaymenttermResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingPaymenttermRequest req = RemoveAccountingPaymenttermRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingPaymenttermResponse res = sdk.accounting().removeAccountingPaymentterm()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [RemoveAccountingPaymenttermRequest](../../models/operations/RemoveAccountingPaymenttermRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[RemoveAccountingPaymenttermResponse](../../models/operations/RemoveAccountingPaymenttermResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingProject

Deletes the AccountingProject identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingProject" method="delete" path="/accounting/{connection_id}/project/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingProjectRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingProjectResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingProjectRequest req = RemoveAccountingProjectRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingProjectResponse res = sdk.accounting().removeAccountingProject()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAccountingProjectRequest](../../models/operations/RemoveAccountingProjectRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAccountingProjectResponse](../../models/operations/RemoveAccountingProjectResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingPurchaseorder

Deletes the AccountingPurchaseorder identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingPurchaseorder" method="delete" path="/accounting/{connection_id}/purchaseorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingPurchaseorderRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingPurchaseorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingPurchaseorderRequest req = RemoveAccountingPurchaseorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingPurchaseorderResponse res = sdk.accounting().removeAccountingPurchaseorder()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [RemoveAccountingPurchaseorderRequest](../../models/operations/RemoveAccountingPurchaseorderRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[RemoveAccountingPurchaseorderResponse](../../models/operations/RemoveAccountingPurchaseorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingQuote

Deletes the AccountingQuote identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingQuote" method="delete" path="/accounting/{connection_id}/quote/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingQuoteRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingQuoteResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingQuoteRequest req = RemoveAccountingQuoteRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingQuoteResponse res = sdk.accounting().removeAccountingQuote()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveAccountingQuoteRequest](../../models/operations/RemoveAccountingQuoteRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveAccountingQuoteResponse](../../models/operations/RemoveAccountingQuoteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingSalesorder

Deletes the AccountingSalesorder identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingSalesorder" method="delete" path="/accounting/{connection_id}/salesorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingSalesorderRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingSalesorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingSalesorderRequest req = RemoveAccountingSalesorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingSalesorderResponse res = sdk.accounting().removeAccountingSalesorder()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [RemoveAccountingSalesorderRequest](../../models/operations/RemoveAccountingSalesorderRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[RemoveAccountingSalesorderResponse](../../models/operations/RemoveAccountingSalesorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingTaxrate

Deletes the AccountingTaxrate identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingTaxrate" method="delete" path="/accounting/{connection_id}/taxrate/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingTaxrateRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingTaxrateResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingTaxrateRequest req = RemoveAccountingTaxrateRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingTaxrateResponse res = sdk.accounting().removeAccountingTaxrate()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAccountingTaxrateRequest](../../models/operations/RemoveAccountingTaxrateRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAccountingTaxrateResponse](../../models/operations/RemoveAccountingTaxrateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingTransaction

Deletes the AccountingTransaction identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingTransaction" method="delete" path="/accounting/{connection_id}/transaction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingTransactionRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingTransactionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingTransactionRequest req = RemoveAccountingTransactionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingTransactionResponse res = sdk.accounting().removeAccountingTransaction()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [RemoveAccountingTransactionRequest](../../models/operations/RemoveAccountingTransactionRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[RemoveAccountingTransactionResponse](../../models/operations/RemoveAccountingTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingVendorcredit

Deletes the AccountingVendorcredit identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingVendorcredit" method="delete" path="/accounting/{connection_id}/vendorcredit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingVendorcreditRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingVendorcreditResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingVendorcreditRequest req = RemoveAccountingVendorcreditRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingVendorcreditResponse res = sdk.accounting().removeAccountingVendorcredit()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [RemoveAccountingVendorcreditRequest](../../models/operations/RemoveAccountingVendorcreditRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[RemoveAccountingVendorcreditResponse](../../models/operations/RemoveAccountingVendorcreditResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingAccount

Updates the AccountingAccount identified by `id`. Provide the unified AccountingAccount fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingAccount" method="put" path="/accounting/{connection_id}/account/{id}" example="accounting_account" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingAccountRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingAccountResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingAccountRequest req = UpdateAccountingAccountRequest.builder()
                .accountingAccount(AccountingAccount.builder()
                    .balance(12092d)
                    .createdAt(OffsetDateTime.parse("2022-07-03T17:57:07.391Z"))
                    .currency("CAD")
                    .customerDefinedCode("6170")
                    .description("Comedo vilitas harum cupiditate animus quo iste.")
                    .id("0e5bc595-fba2-48d9-85ec-973de8abe164")
                    .isPayable(false)
                    .metadata(List.of())
                    .name("Savings Account")
                    .status(Status.ARCHIVED)
                    .taxonomy(List.of(
                        AccountingAccountTaxonomy.builder()
                            .type(AccountingAccountTaxonomyType.SUBGROUP)
                            .value("vesper")
                            .originalType("peccatus")
                            .build()))
                    .type(Type.ACCOUNTS_RECEIVABLE)
                    .updatedAt(OffsetDateTime.parse("2023-08-16T01:01:05.983Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingAccountResponse res = sdk.accounting().updateAccountingAccount()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            System.out.println(res.accountingAccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAccountingAccountRequest](../../models/operations/UpdateAccountingAccountRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAccountingAccountResponse](../../models/operations/UpdateAccountingAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingBankfeedaccount

Updates the AccountingBankfeedaccount identified by `id`. Provide the unified AccountingBankfeedaccount fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingBankfeedaccount" method="put" path="/accounting/{connection_id}/bankfeedaccount/{id}" example="accounting_bankfeedaccount" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingBankfeedaccountRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingBankfeedaccountResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingBankfeedaccountRequest req = UpdateAccountingBankfeedaccountRequest.builder()
                .accountingBankfeedaccount(AccountingBankfeedaccount.builder()
                    .accountNumber("69722811")
                    .accountNumberLast4("2811")
                    .accountType(AccountType.LOAN)
                    .balance(49437d)
                    .bankName("Wells Fargo")
                    .createdAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .currency("AUD")
                    .feedStartAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .id("b120f54c-834b-4746-82e3-f7864087ad95")
                    .metadata(List.of())
                    .name("Kirlin - Rowe Checking")
                    .routingNumber("104153154")
                    .status(AccountingBankfeedaccountStatus.ACTIVE)
                    .updatedAt(OffsetDateTime.parse("2024-05-07T05:17:31.897Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingBankfeedaccountResponse res = sdk.accounting().updateAccountingBankfeedaccount()
                .request(req)
                .call();

        if (res.accountingBankfeedaccount().isPresent()) {
            System.out.println(res.accountingBankfeedaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [UpdateAccountingBankfeedaccountRequest](../../models/operations/UpdateAccountingBankfeedaccountRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[UpdateAccountingBankfeedaccountResponse](../../models/operations/UpdateAccountingBankfeedaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingBankfeedtransaction

Updates the AccountingBankfeedtransaction identified by `id`. Provide the unified AccountingBankfeedtransaction fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingBankfeedtransaction" method="put" path="/accounting/{connection_id}/bankfeedtransaction/{id}" example="accounting_bankfeedtransaction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingBankfeedtransactionRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingBankfeedtransactionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingBankfeedtransactionRequest req = UpdateAccountingBankfeedtransactionRequest.builder()
                .accountingBankfeedtransaction(AccountingBankfeedtransaction.builder()
                    .amount(60889d)
                    .bankCategory("Beauty")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-03-24T23:41:08.374Z"))
                    .currency("CAD")
                    .description("deposit processed at Renner - Quigley for SSP 824.35, using card ending ****1112. Account: ***7957.")
                    .id("f4144bcf-aee7-48f9-b87c-af4ca367c113")
                    .isPending(true)
                    .merchantName("McKenzie Inc")
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2025-05-08T20:40:06.678Z"))
                    .reference("09339705")
                    .transactionAt(OffsetDateTime.parse("2022-08-02T01:55:52.244Z"))
                    .type(AccountingBankfeedtransactionType.CREDIT)
                    .updatedAt(OffsetDateTime.parse("2022-05-26T09:17:12.629Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingBankfeedtransactionResponse res = sdk.accounting().updateAccountingBankfeedtransaction()
                .request(req)
                .call();

        if (res.accountingBankfeedtransaction().isPresent()) {
            System.out.println(res.accountingBankfeedtransaction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [UpdateAccountingBankfeedtransactionRequest](../../models/operations/UpdateAccountingBankfeedtransactionRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[UpdateAccountingBankfeedtransactionResponse](../../models/operations/UpdateAccountingBankfeedtransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingBill

Updates the AccountingBill identified by `id`. Provide the unified AccountingBill fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingBill" method="put" path="/accounting/{connection_id}/bill/{id}" example="accounting_bill" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingBillRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingBillResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingBillRequest req = UpdateAccountingBillRequest.builder()
                .accountingBill(AccountingBill.builder()
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://mixed-flame.biz")
                            .id("8549d583-c47b-4f96-aef6-cd2b8057e0f8")
                            .mimeType("application/pdf")
                            .name("BILL-2466.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://minor-testimonial.biz")
                            .id("8b63ecba-a7a0-4e9e-bbd9-06ff15a86410")
                            .mimeType("application/pdf")
                            .name("BILL-2466-1.pdf")
                            .build()))
                    .balanceAmount(0d)
                    .billNumber("BILL-2466")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2019-08-08T23:03:14.104Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .dueAt(OffsetDateTime.parse("2019-09-07T23:03:14.104Z"))
                    .extendedNotes(List.of())
                    .id("b9b03095-503c-4bff-8aa6-c1e72585e4c4")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Cilicium infit amissio ante demulceo annus defluo tumultus.")
                    .paidAmount(0d)
                    .paidAt(OffsetDateTime.parse("2019-08-15T17:24:28.313Z"))
                    .paymentCollectionMethod(PaymentCollectionMethod.CHARGE_AUTOMATICALLY)
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2019-08-08T23:03:14.104Z"))
                    .purchaseorderIds(List.of())
                    .send(true)
                    .status(AccountingBillStatus.PARTIALLY_PAID)
                    .subTotalAmount(0d)
                    .taxAmount(0d)
                    .term(Term.NET90)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2020-06-05T05:21:36.975Z"))
                    .url("https://utilized-partridge.info/bills/BILL-2466")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingBillResponse res = sdk.accounting().updateAccountingBill()
                .request(req)
                .call();

        if (res.accountingBill().isPresent()) {
            System.out.println(res.accountingBill().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateAccountingBillRequest](../../models/operations/UpdateAccountingBillRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateAccountingBillResponse](../../models/operations/UpdateAccountingBillResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingCategory

Updates the AccountingCategory identified by `id`. Provide the unified AccountingCategory fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingCategory" method="put" path="/accounting/{connection_id}/category/{id}" example="accounting_category" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.AccountingCategory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingCategoryRequest req = UpdateAccountingCategoryRequest.builder()
                .accountingCategory(AccountingCategory.builder()
                    .createdAt(OffsetDateTime.parse("2023-05-30T12:29:04.257Z"))
                    .description("Labore basium corrumpo crinis ars subito pecto.")
                    .id("25b79a64-61e3-470d-8b0c-02ed74e04cc4")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Automotive")
                    .updatedAt(OffsetDateTime.parse("2025-10-05T17:27:24.844Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingCategoryResponse res = sdk.accounting().updateAccountingCategory()
                .request(req)
                .call();

        if (res.accountingCategory().isPresent()) {
            System.out.println(res.accountingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateAccountingCategoryRequest](../../models/operations/UpdateAccountingCategoryRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateAccountingCategoryResponse](../../models/operations/UpdateAccountingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingContact

Updates the AccountingContact identified by `id`. Provide the unified AccountingContact fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingContact" method="put" path="/accounting/{connection_id}/contact/{id}" example="accounting_contact" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingContactRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingContactResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingContactRequest req = UpdateAccountingContactRequest.builder()
                .accountingContact(AccountingContact.builder()
                    .associatedContacts(List.of())
                    .balanceAmount(55574d)
                    .billingAddress(PropertyAccountingContactBillingAddress.builder()
                        .address1("9171 Parisian Gateway")
                        .city("Lake Keltonboro")
                        .countryCode("US")
                        .postalCode("70131-2908")
                        .region("Illinois")
                        .regionCode("CO")
                        .build())
                    .companyName("Rice LLC")
                    .createdAt(OffsetDateTime.parse("2021-08-15T14:56:50.258Z"))
                    .currency("AUD")
                    .emails(List.of(
                        AccountingEmail.builder()
                            .email("michele.breitenberg@ricellc.com")
                            .type(AccountingEmailType.WORK)
                            .build(),
                        AccountingEmail.builder()
                            .email("accounts@ricellc.com")
                            .type(AccountingEmailType.OTHER)
                            .build()))
                    .firstName("Michele")
                    .id("015b342d-d86b-496f-bd92-bd55149dd188")
                    .identification("508720595")
                    .isActive(true)
                    .isCustomer(true)
                    .lastName("Breitenberg")
                    .metadata(List.of())
                    .name("Rice LLC")
                    .notes("Tabella reprehenderit sono corrupti approbo crastinus sopor ultra.")
                    .paymentMethods(List.of(
                        AccountingContactPaymentMethod.builder()
                            .type(AccountingContactPaymentMethodType.CARD)
                            .default_(true)
                            .id("b4735bb5-63b6-4315-bb72-8a093f3ec50d")
                            .name("Visa 5318")
                            .build()))
                    .portalUrl("https://ricellc.com/billing")
                    .shippingAddress(PropertyAccountingContactShippingAddress.builder()
                        .address1("786 Dare Meadows")
                        .city("Phoenix")
                        .countryCode("US")
                        .postalCode("68675")
                        .region("Tennessee")
                        .regionCode("NE")
                        .build())
                    .taxExemption(TaxExemption.FOREIGN)
                    .taxNumber("564107844")
                    .telephones(List.of(
                        AccountingTelephone.builder()
                            .telephone("(217) 260-4409")
                            .type(AccountingTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2024-01-05T03:16:26.959Z"))
                    .website("https://ricellc.com")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingContactResponse res = sdk.accounting().updateAccountingContact()
                .request(req)
                .call();

        if (res.accountingContact().isPresent()) {
            System.out.println(res.accountingContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAccountingContactRequest](../../models/operations/UpdateAccountingContactRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAccountingContactResponse](../../models/operations/UpdateAccountingContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingCreditmemo

Updates the AccountingCreditmemo identified by `id`. Provide the unified AccountingCreditmemo fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingCreditmemo" method="put" path="/accounting/{connection_id}/creditmemo/{id}" example="accounting_creditmemo" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingCreditmemoRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingCreditmemoResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingCreditmemoRequest req = UpdateAccountingCreditmemoRequest.builder()
                .accountingCreditmemo(AccountingCreditmemo.builder()
                    .applications(List.of())
                    .attachments(List.of())
                    .balanceAmount(0d)
                    .createdAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .creditmemoNumber("CM-99537")
                    .currency("AUD")
                    .discountAmount(0d)
                    .id("26853a17-74f3-4271-9fda-5dc7fe57ffe3")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Amo adfero torqueo quas victoria.")
                    .postedAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .send(true)
                    .status(AccountingCreditmemoStatus.AUTHORIZED)
                    .taxAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2025-10-04T08:58:15.558Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingCreditmemoResponse res = sdk.accounting().updateAccountingCreditmemo()
                .request(req)
                .call();

        if (res.accountingCreditmemo().isPresent()) {
            System.out.println(res.accountingCreditmemo().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [UpdateAccountingCreditmemoRequest](../../models/operations/UpdateAccountingCreditmemoRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[UpdateAccountingCreditmemoResponse](../../models/operations/UpdateAccountingCreditmemoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingExpense

Updates the AccountingExpense identified by `id`. Provide the unified AccountingExpense fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingExpense" method="put" path="/accounting/{connection_id}/expense/{id}" example="accounting_expense" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingExpenseRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingExpenseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingExpenseRequest req = UpdateAccountingExpenseRequest.builder()
                .accountingExpense(AccountingExpense.builder()
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://avaricious-larva.biz")
                            .id("97a2f9b3-4d01-42bd-b14d-057cf8cc5d47")
                            .mimeType("application/pdf")
                            .name("receipt-9696.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://precious-comparison.net/")
                            .id("a4305d3e-0ca8-4bb6-b48e-6c9f781876db")
                            .mimeType("application/pdf")
                            .name("receipt-9696-1.pdf")
                            .build()))
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .currency("GBP")
                    .externalNumber("EXP-38303")
                    .id("184aa182-b050-445e-bdb1-31e56f4ce175")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("f26b1e1e-415d-4faa-b7f5-17d78415571a")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(364.74)
                            .unitAmount(364.74)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("7a7f4b13-793e-4ce6-8560-d6bf1eb43b87")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(258.35)
                            .unitAmount(258.35)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("375ad897-4aa0-4a5b-92dd-6befa0d7e08f")
                            .itemName("Conference ticket")
                            .notes("Sint spiculum carcer ago charisma.")
                            .taxAmount(0d)
                            .totalAmount(28.14)
                            .unitAmount(28.14)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("a70281cd-b741-4226-bdf7-ce036c3b9810")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(157.04)
                            .unitAmount(157.04)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("d1330690-2a86-4ced-9136-73676e6448e3")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(164.02)
                            .unitAmount(164.02)
                            .unitQuantity(1d)
                            .build()))
                    .metadata(List.of())
                    .name("A deposit for KPW 867.85 was made at Kohler LLC via card ending ****1416 on account ***1040.")
                    .paymentMethod("CASH")
                    .postedAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .status(AccountingExpenseStatus.SUBMITTED)
                    .taxAmount(0d)
                    .totalAmount(972.29)
                    .type(AccountingExpenseType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2020-09-03T14:10:27.597Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingExpenseResponse res = sdk.accounting().updateAccountingExpense()
                .request(req)
                .call();

        if (res.accountingExpense().isPresent()) {
            System.out.println(res.accountingExpense().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAccountingExpenseRequest](../../models/operations/UpdateAccountingExpenseRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAccountingExpenseResponse](../../models/operations/UpdateAccountingExpenseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingExpensereport

Updates the AccountingExpensereport identified by `id`. Provide the unified AccountingExpensereport fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingExpensereport" method="put" path="/accounting/{connection_id}/expensereport/{id}" example="accounting_expensereport" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingExpensereportRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingExpensereportResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingExpensereportRequest req = UpdateAccountingExpensereportRequest.builder()
                .accountingExpensereport(AccountingExpensereport.builder()
                    .approvedAt(OffsetDateTime.parse("2021-04-24T11:40:56.582Z"))
                    .attachments(List.of())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .currency("GBP")
                    .externalNumber("ER-31240")
                    .id("bba58861-7823-4838-bacb-4b41b1b0967a")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("6b7145c0-9575-4401-8543-a0731a3c72df")
                            .itemName("Conference ticket")
                            .taxAmount(0d)
                            .totalAmount(39.9)
                            .unitAmount(39.9)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("d648abcb-1a7f-4bf6-9309-ee367dc958d0")
                            .itemName("Flight")
                            .notes("Aliquam soluta omnis dolor.")
                            .taxAmount(0d)
                            .totalAmount(193.17)
                            .unitAmount(193.17)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("f09f632f-dcff-4d1f-b809-0f18df07b5b2")
                            .itemName("Client dinner")
                            .notes("Altus caveo capio.")
                            .taxAmount(0d)
                            .totalAmount(230.12)
                            .unitAmount(230.12)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("df70ab04-8856-4628-bf11-53c9f9750437")
                            .itemName("Flight")
                            .taxAmount(0d)
                            .totalAmount(445.27)
                            .unitAmount(445.27)
                            .unitQuantity(1d)
                            .build()))
                    .metadata(List.of())
                    .name("Jamil Christiansen - October expenses")
                    .postedAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .reimbursedAmount(908.46)
                    .reimbursedAt(OffsetDateTime.parse("2021-04-24T11:40:56.582Z"))
                    .status(AccountingExpensereportStatus.PAID)
                    .taxAmount(0d)
                    .totalAmount(908.46)
                    .updatedAt(OffsetDateTime.parse("2021-04-24T11:40:56.582Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingExpensereportResponse res = sdk.accounting().updateAccountingExpensereport()
                .request(req)
                .call();

        if (res.accountingExpensereport().isPresent()) {
            System.out.println(res.accountingExpensereport().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [UpdateAccountingExpensereportRequest](../../models/operations/UpdateAccountingExpensereportRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[UpdateAccountingExpensereportResponse](../../models/operations/UpdateAccountingExpensereportResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingInvoice

Updates the AccountingInvoice identified by `id`. Provide the unified AccountingInvoice fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingInvoice" method="put" path="/accounting/{connection_id}/invoice/{id}" example="accounting_invoice" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingInvoiceRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingInvoiceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingInvoiceRequest req = UpdateAccountingInvoiceRequest.builder()
                .accountingInvoice(AccountingInvoice.builder()
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://simplistic-translation.com")
                            .id("d1139cf3-7d39-4849-8e1f-4603ae5b6de5")
                            .mimeType("application/pdf")
                            .name("INV-77705.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://squiggly-amnesty.name/")
                            .id("49f264d9-2f61-4c0d-ae69-52fbf3f7086e")
                            .mimeType("application/pdf")
                            .name("INV-77705-1.pdf")
                            .build()))
                    .balanceAmount(0d)
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-11-07T14:17:29.587Z"))
                    .currency("GBP")
                    .discountAmount(0d)
                    .dueAt(OffsetDateTime.parse("2022-12-07T14:17:29.587Z"))
                    .extendedNotes(List.of())
                    .id("baba8ed5-c51f-47a1-9b34-db13edaf7003")
                    .invoiceNumber("INV-77705")
                    .isInclusiveOfTax(false)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Auctus comburo clarus ubi deprimo comburo vulgus.")
                    .paymentCollectionMethod(AccountingInvoicePaymentCollectionMethod.CHARGE_AUTOMATICALLY)
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2022-11-07T14:17:29.587Z"))
                    .reference("PO-2331")
                    .salesorderIds(List.of())
                    .send(true)
                    .status(AccountingInvoiceStatus.OVERDUE)
                    .subTotalAmount(0d)
                    .taxAmount(0d)
                    .term(AccountingInvoiceTerm.NET25)
                    .totalAmount(0d)
                    .type(AccountingInvoiceType.INVOICE)
                    .updatedAt(OffsetDateTime.parse("2026-05-25T00:02:37.512Z"))
                    .url("https://helpful-exterior.com/invoices/INV-77705")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingInvoiceResponse res = sdk.accounting().updateAccountingInvoice()
                .request(req)
                .call();

        if (res.accountingInvoice().isPresent()) {
            System.out.println(res.accountingInvoice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAccountingInvoiceRequest](../../models/operations/UpdateAccountingInvoiceRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAccountingInvoiceResponse](../../models/operations/UpdateAccountingInvoiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingJournal

Updates the AccountingJournal identified by `id`. Provide the unified AccountingJournal fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingJournal" method="put" path="/accounting/{connection_id}/journal/{id}" example="accounting_journal" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingJournalRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingJournalResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingJournalRequest req = UpdateAccountingJournalRequest.builder()
                .accountingJournal(AccountingJournal.builder()
                    .attachments(List.of())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-02-20T15:14:55.881Z"))
                    .currency("CAD")
                    .description("Constans adipisci.")
                    .id("e4865423-ba1a-4d53-aed2-4e56b4a058f0")
                    .isInclusiveOfTax(true)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2023-11-26T10:53:23.346Z"))
                    .reference("JE-78884")
                    .source("crustulum")
                    .status(AccountingJournalStatus.VOID)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2022-01-21T00:20:56.356Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingJournalResponse res = sdk.accounting().updateAccountingJournal()
                .request(req)
                .call();

        if (res.accountingJournal().isPresent()) {
            System.out.println(res.accountingJournal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAccountingJournalRequest](../../models/operations/UpdateAccountingJournalRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAccountingJournalResponse](../../models/operations/UpdateAccountingJournalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~updateAccountingOrder~~

Updates the AccountingOrder identified by `id`. Provide the unified AccountingOrder fields to change in the request body.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingOrder" method="put" path="/accounting/{connection_id}/order/{id}" example="accounting_order" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingOrderRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingOrderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingOrderRequest req = UpdateAccountingOrderRequest.builder()
                .accountingOrder(AccountingOrder.builder()
                    .billingAddress(PropertyAccountingOrderBillingAddress.builder()
                        .address1("125 Hayden Highway")
                        .city("Altoona")
                        .countryCode("US")
                        .postalCode("94706-7691")
                        .region("Louisiana")
                        .regionCode("VT")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .currency("GBP")
                    .id("cf1ec589-f955-4d90-82e6-fb12de603bf0")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .shippingAddress(PropertyAccountingOrderShippingAddress.builder()
                        .address1("450 Garett Mall")
                        .city("New Kamronburgh")
                        .countryCode("US")
                        .postalCode("76546")
                        .region("Oregon")
                        .regionCode("VA")
                        .build())
                    .status(AccountingOrderStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .type(AccountingOrderType.SALES)
                    .updatedAt(OffsetDateTime.parse("2022-02-15T17:04:05.241Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingOrderResponse res = sdk.accounting().updateAccountingOrder()
                .request(req)
                .call();

        if (res.accountingOrder().isPresent()) {
            System.out.println(res.accountingOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateAccountingOrderRequest](../../models/operations/UpdateAccountingOrderRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateAccountingOrderResponse](../../models/operations/UpdateAccountingOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingPaymentterm

Updates the AccountingPaymentterm identified by `id`. Provide the unified AccountingPaymentterm fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingPaymentterm" method="put" path="/accounting/{connection_id}/paymentterm/{id}" example="accounting_paymentterm" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingPaymenttermRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingPaymenttermResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingPaymenttermRequest req = UpdateAccountingPaymenttermRequest.builder()
                .accountingPaymentterm(AccountingPaymentterm.builder()
                    .category(Category.STANDARD)
                    .createdAt(OffsetDateTime.parse("2021-08-22T22:42:42.265Z"))
                    .dayOfMonthDue(4d)
                    .description("Cultura cena claustrum.")
                    .discountDayOfMonth(13d)
                    .discountDays(4d)
                    .discountPercent(5d)
                    .dueDays(57d)
                    .dueNextMonthDays(9d)
                    .id("be6121ab-c8da-4926-80e9-7b1bf9fb45eb")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Net 30")
                    .type(AccountingPaymenttermType.NET15)
                    .updatedAt(OffsetDateTime.parse("2026-02-07T23:22:10.435Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingPaymenttermResponse res = sdk.accounting().updateAccountingPaymentterm()
                .request(req)
                .call();

        if (res.accountingPaymentterm().isPresent()) {
            System.out.println(res.accountingPaymentterm().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UpdateAccountingPaymenttermRequest](../../models/operations/UpdateAccountingPaymenttermRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateAccountingPaymenttermResponse](../../models/operations/UpdateAccountingPaymenttermResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingProject

Updates the AccountingProject identified by `id`. Provide the unified AccountingProject fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingProject" method="put" path="/accounting/{connection_id}/project/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingProjectRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingProjectResponse;
import to.unified.unified_java_sdk.models.shared.AccountingProject;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingProjectRequest req = UpdateAccountingProjectRequest.builder()
                .accountingProject(AccountingProject.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingProjectResponse res = sdk.accounting().updateAccountingProject()
                .request(req)
                .call();

        if (res.accountingProject().isPresent()) {
            System.out.println(res.accountingProject().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAccountingProjectRequest](../../models/operations/UpdateAccountingProjectRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAccountingProjectResponse](../../models/operations/UpdateAccountingProjectResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingPurchaseorder

Updates the AccountingPurchaseorder identified by `id`. Provide the unified AccountingPurchaseorder fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingPurchaseorder" method="put" path="/accounting/{connection_id}/purchaseorder/{id}" example="accounting_purchaseorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingPurchaseorderRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingPurchaseorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingPurchaseorderRequest req = UpdateAccountingPurchaseorderRequest.builder()
                .accountingPurchaseorder(AccountingPurchaseorder.builder()
                    .attachments(List.of())
                    .billingAddress(PropertyAccountingPurchaseorderBillingAddress.builder()
                        .address1("37214 Golden Via")
                        .address2("Suite 713")
                        .city("North Eltontown")
                        .countryCode("US")
                        .postalCode("75366")
                        .region("Kentucky")
                        .regionCode("MA")
                        .build())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .currency("EUR")
                    .id("ba91e052-2a44-4f7e-ad55-2e2940df155d")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .shippingAddress(PropertyAccountingPurchaseorderShippingAddress.builder()
                        .address1("9455 Brad Forks")
                        .city("Washington")
                        .countryCode("US")
                        .postalCode("16547")
                        .region("Idaho")
                        .regionCode("NY")
                        .build())
                    .status(AccountingPurchaseorderStatus.SUBMITTED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2021-08-15T07:37:10.457Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingPurchaseorderResponse res = sdk.accounting().updateAccountingPurchaseorder()
                .request(req)
                .call();

        if (res.accountingPurchaseorder().isPresent()) {
            System.out.println(res.accountingPurchaseorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [UpdateAccountingPurchaseorderRequest](../../models/operations/UpdateAccountingPurchaseorderRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[UpdateAccountingPurchaseorderResponse](../../models/operations/UpdateAccountingPurchaseorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingQuote

Updates the AccountingQuote identified by `id`. Provide the unified AccountingQuote fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingQuote" method="put" path="/accounting/{connection_id}/quote/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingQuoteRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingQuoteResponse;
import to.unified.unified_java_sdk.models.shared.AccountingQuote;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingQuoteRequest req = UpdateAccountingQuoteRequest.builder()
                .accountingQuote(AccountingQuote.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingQuoteResponse res = sdk.accounting().updateAccountingQuote()
                .request(req)
                .call();

        if (res.accountingQuote().isPresent()) {
            System.out.println(res.accountingQuote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateAccountingQuoteRequest](../../models/operations/UpdateAccountingQuoteRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateAccountingQuoteResponse](../../models/operations/UpdateAccountingQuoteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingSalesorder

Updates the AccountingSalesorder identified by `id`. Provide the unified AccountingSalesorder fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingSalesorder" method="put" path="/accounting/{connection_id}/salesorder/{id}" example="accounting_salesorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingSalesorderRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingSalesorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingSalesorderRequest req = UpdateAccountingSalesorderRequest.builder()
                .accountingSalesorder(AccountingSalesorder.builder()
                    .billingAddress(PropertyAccountingSalesorderBillingAddress.builder()
                        .address1("1487 Valley Road")
                        .address2("Apt. 287")
                        .city("Lake Angelina")
                        .countryCode("US")
                        .postalCode("85469-3199")
                        .region("Georgia")
                        .regionCode("MT")
                        .build())
                    .categoryIds(List.of())
                    .closedAt(OffsetDateTime.parse("2023-04-03T11:26:43.546Z"))
                    .createdAt(OffsetDateTime.parse("2022-01-17T16:11:50.310Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .fees(List.of())
                    .fulfillmentType(FulfillmentType.OTHER)
                    .id("72af749f-3e30-4b15-85ae-f4f58c2d19fc")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .orderNumber("832663")
                    .paidAmount(0d)
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2022-01-17T16:11:50.310Z"))
                    .refundedAmount(0d)
                    .salesChannel("Wholesale")
                    .serviceChargeAmount(0d)
                    .shippingAddress(PropertyAccountingSalesorderShippingAddress.builder()
                        .address1("781 Darrell Coves")
                        .city("Annabelfield")
                        .countryCode("US")
                        .postalCode("92148-4116")
                        .region("Virginia")
                        .regionCode("WI")
                        .build())
                    .status(AccountingSalesorderStatus.PAID)
                    .subtotalAmount(0d)
                    .taxAmount(0d)
                    .tipAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-04-03T11:26:43.546Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingSalesorderResponse res = sdk.accounting().updateAccountingSalesorder()
                .request(req)
                .call();

        if (res.accountingSalesorder().isPresent()) {
            System.out.println(res.accountingSalesorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [UpdateAccountingSalesorderRequest](../../models/operations/UpdateAccountingSalesorderRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[UpdateAccountingSalesorderResponse](../../models/operations/UpdateAccountingSalesorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingTaxrate

Updates the AccountingTaxrate identified by `id`. Provide the unified AccountingTaxrate fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingTaxrate" method="put" path="/accounting/{connection_id}/taxrate/{id}" example="accounting_taxrate" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingTaxrateRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingTaxrateResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingTaxrateRequest req = UpdateAccountingTaxrateRequest.builder()
                .accountingTaxrate(AccountingTaxrate.builder()
                    .components(List.of(
                        AccountingTaxrateComponent.builder()
                            .isCompound(false)
                            .name("Exempt")
                            .rate(0d)
                            .build()))
                    .country("US")
                    .createdAt(OffsetDateTime.parse("2020-01-04T10:37:56.894Z"))
                    .description("Exempt (0%)")
                    .effectiveRate(0d)
                    .id("0f7d9c39-f16c-4dfe-8d34-4a0bb7cd22a0")
                    .isActive(false)
                    .isCompound(false)
                    .metadata(List.of())
                    .name("Exempt")
                    .rate(0d)
                    .region("FL")
                    .totalRate(0d)
                    .type(AccountingTaxrateType.SALES)
                    .updatedAt(OffsetDateTime.parse("2020-02-13T18:59:35.713Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingTaxrateResponse res = sdk.accounting().updateAccountingTaxrate()
                .request(req)
                .call();

        if (res.accountingTaxrate().isPresent()) {
            System.out.println(res.accountingTaxrate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAccountingTaxrateRequest](../../models/operations/UpdateAccountingTaxrateRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAccountingTaxrateResponse](../../models/operations/UpdateAccountingTaxrateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingTransaction

Updates the AccountingTransaction identified by `id`. Provide the unified AccountingTransaction fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingTransaction" method="put" path="/accounting/{connection_id}/transaction/{id}" example="accounting_transaction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingTransactionRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingTransactionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingTransactionRequest req = UpdateAccountingTransactionRequest.builder()
                .accountingTransaction(AccountingTransaction.builder()
                    .createdAt(OffsetDateTime.parse("2019-09-25T11:40:42.574Z"))
                    .id("c779d79e-74a4-49cf-a253-39c8387899f5")
                    .lineitems(List.of(
                        AccountingTransactionLineItem.builder()
                            .categoryIds(List.of())
                            .description("The Wilma Car is the latest in a series of beneficial products from Fritsch Group")
                            .id("06749af5-17d8-496d-ae3d-15ceb8b40c78")
                            .name("Table")
                            .totalAmount(10184d)
                            .unitAmount(536d)
                            .unitQuantity(19d)
                            .build()))
                    .memo("withdrawal confirmed at Doyle, White and Conroy for FJD 391.94, card ending in ****0497 associated with account ***6676.")
                    .status(AccountingTransactionStatus.PENDING)
                    .taxAmount(0d)
                    .totalAmount(10184d)
                    .transactionAt(OffsetDateTime.parse("2019-09-25T11:40:42.574Z"))
                    .updatedAt(OffsetDateTime.parse("2019-10-14T12:24:45.298Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingTransactionResponse res = sdk.accounting().updateAccountingTransaction()
                .request(req)
                .call();

        if (res.accountingTransaction().isPresent()) {
            System.out.println(res.accountingTransaction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UpdateAccountingTransactionRequest](../../models/operations/UpdateAccountingTransactionRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateAccountingTransactionResponse](../../models/operations/UpdateAccountingTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingVendorcredit

Updates the AccountingVendorcredit identified by `id`. Provide the unified AccountingVendorcredit fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingVendorcredit" method="put" path="/accounting/{connection_id}/vendorcredit/{id}" example="accounting_vendorcredit" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingVendorcreditRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingVendorcreditResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingVendorcreditRequest req = UpdateAccountingVendorcreditRequest.builder()
                .accountingVendorcredit(AccountingVendorcredit.builder()
                    .applications(List.of())
                    .balanceAmount(0d)
                    .createdAt(OffsetDateTime.parse("2023-04-15T21:14:08.197Z"))
                    .currency("USD")
                    .id("14e4845c-f28d-4811-a93a-515c93d347f7")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Avaritia tantum campana comitatus atrox.")
                    .postedAt(OffsetDateTime.parse("2023-04-15T21:14:08.197Z"))
                    .status(AccountingVendorcreditStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-10-07T20:03:34.644Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingVendorcreditResponse res = sdk.accounting().updateAccountingVendorcredit()
                .request(req)
                .call();

        if (res.accountingVendorcredit().isPresent()) {
            System.out.println(res.accountingVendorcredit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [UpdateAccountingVendorcreditRequest](../../models/operations/UpdateAccountingVendorcreditRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[UpdateAccountingVendorcreditResponse](../../models/operations/UpdateAccountingVendorcreditResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |