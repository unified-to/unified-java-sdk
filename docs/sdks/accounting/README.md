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
                    .description("Voluptatibus valde spoliatio.")
                    .id("4fbde124-a614-4098-a367-dcad459c0699")
                    .isPayable(false)
                    .metadata(List.of())
                    .name("Auto Loan Account")
                    .status(Status.ARCHIVED)
                    .taxonomy(List.of(
                        AccountingAccountTaxonomy.builder()
                            .type(AccountingAccountTaxonomyType.SUBGROUP)
                            .value("comedo")
                            .originalType("vilitas")
                            .build()))
                    .type(Type.ACCOUNTS_RECEIVABLE)
                    .updatedAt(OffsetDateTime.parse("2023-08-07T04:01:46.193Z"))
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
                    .accountNumber("30369722")
                    .accountNumberLast4("9722")
                    .accountType(AccountType.LOAN)
                    .balance(49437d)
                    .bankName("Wells Fargo")
                    .createdAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .currency("AUD")
                    .feedStartAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .id("031a9c67-e116-4543-ac01-28fe73ea668b")
                    .metadata(List.of())
                    .name("Corwin, Donnelly and Connelly Checking")
                    .routingNumber("694667752")
                    .status(AccountingBankfeedaccountStatus.ACTIVE)
                    .updatedAt(OffsetDateTime.parse("2024-04-24T05:14:23.189Z"))
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
                    .bankCategory("Clothing")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-03-24T23:41:08.374Z"))
                    .currency("CAD")
                    .description("Payment of SRD 92.72 for withdrawal at Halvorson - Ziemann, processed with card ending ****3731 linked to account ***7781.")
                    .id("f8352f66-ab52-44f7-8951-8439ccf0a999")
                    .isPending(true)
                    .merchantName("Buckridge - Feest")
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2025-04-15T12:39:25.138Z"))
                    .reference("79574105")
                    .transactionAt(OffsetDateTime.parse("2022-07-30T10:04:23.612Z"))
                    .type(AccountingBankfeedtransactionType.CREDIT)
                    .updatedAt(OffsetDateTime.parse("2022-05-25T02:39:25.360Z"))
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
                            .downloadUrl("https://puny-foodstuffs.name")
                            .id("55974ccd-ac14-401c-b948-487fcef3a1c4")
                            .mimeType("application/pdf")
                            .name("BILL-2466.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://grimy-characterization.net")
                            .id("5f26f813-19f3-4a14-8297-1c3ee1378b60")
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
                    .id("75b6f5cd-7c51-41d5-a6ef-4271aa6e39d8")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Admiratio deporto tutamen cilicium infit amissio ante demulceo.")
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
                    .updatedAt(OffsetDateTime.parse("2020-06-01T08:34:06.490Z"))
                    .url("https://cluttered-importance.org/bills/BILL-2466")
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
                    .description("Textus ab thymum labore basium.")
                    .id("0f4f6482-65df-4d47-be62-3fa0dd566ecd")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Beauty")
                    .updatedAt(OffsetDateTime.parse("2025-09-12T05:00:23.905Z"))
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
                        .address1("4091 Tromp Coves")
                        .city("Lake Emmybury")
                        .countryCode("US")
                        .postalCode("50764-5226")
                        .region("Washington")
                        .regionCode("CA")
                        .build())
                    .companyName("Kertzmann Group")
                    .createdAt(OffsetDateTime.parse("2021-08-15T14:56:50.258Z"))
                    .currency("AUD")
                    .emails(List.of(
                        AccountingEmail.builder()
                            .email("delores.reynolds@kertzmanngroup.com")
                            .type(AccountingEmailType.WORK)
                            .build(),
                        AccountingEmail.builder()
                            .email("accounts@kertzmanngroup.com")
                            .type(AccountingEmailType.OTHER)
                            .build()))
                    .firstName("Delores")
                    .id("e5c7b8c1-5066-4f6c-b121-4759fbfcf47a")
                    .identification("531850872")
                    .isActive(true)
                    .isCustomer(true)
                    .lastName("Reynolds")
                    .metadata(List.of())
                    .name("Kertzmann Group")
                    .notes("Et videlicet pauci.")
                    .paymentMethods(List.of(
                        AccountingContactPaymentMethod.builder()
                            .type(AccountingContactPaymentMethodType.CARD)
                            .default_(true)
                            .id("59055010-f36d-45e1-af7e-f32210706a89")
                            .name("Visa 7844")
                            .build()))
                    .portalUrl("https://kertzmanngroup.com/billing")
                    .shippingAddress(PropertyAccountingContactShippingAddress.builder()
                        .address1("23129 Rebekah Mews")
                        .city("Mortimerhaven")
                        .countryCode("US")
                        .postalCode("55878-6806")
                        .region("Florida")
                        .regionCode("OK")
                        .build())
                    .taxExemption(TaxExemption.FOREIGN)
                    .taxNumber("867556410")
                    .telephones(List.of(
                        AccountingTelephone.builder()
                            .telephone("(432) 760-1716")
                            .type(AccountingTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2023-12-20T08:09:21.889Z"))
                    .website("https://kertzmanngroup.com")
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
                    .id("166d437e-4cd7-4c65-82fa-50fd5fdd711d")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Hic vorax dedecor amo adfero torqueo quas victoria.")
                    .postedAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .send(true)
                    .status(AccountingCreditmemoStatus.AUTHORIZED)
                    .taxAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2025-09-11T23:57:40.031Z"))
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
                            .downloadUrl("https://rubbery-couch.biz/")
                            .id("f515ff69-9c02-45f7-89b1-74007228cb69")
                            .mimeType("application/pdf")
                            .name("receipt-9696.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://appropriate-smog.biz/")
                            .id("aeede0b5-2b8d-41d9-bd85-813073355552")
                            .mimeType("application/pdf")
                            .name("receipt-9696-1.pdf")
                            .build()))
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .currency("GBP")
                    .externalNumber("EXP-38303")
                    .id("a3f4e533-b569-4939-b246-3d9663d1a7b7")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("947dc21a-0b5c-4bc2-8164-bd18beaa2667")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(364.74)
                            .unitAmount(364.74)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("e5c1f775-c40e-4892-b089-8ee1af7942c1")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(258.35)
                            .unitAmount(258.35)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("34eca38e-bc2e-4af8-b835-9664188515c9")
                            .itemName("Conference ticket")
                            .notes("Casus umquam conicio cinis demitto sint.")
                            .taxAmount(0d)
                            .totalAmount(28.14)
                            .unitAmount(28.14)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("9fa9c199-2335-48bc-be1e-2cac606537fe")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(157.04)
                            .unitAmount(157.04)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("231ae283-9730-4c42-8338-6f0070ac9011")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(164.02)
                            .unitAmount(164.02)
                            .unitQuantity(1d)
                            .build()))
                    .metadata(List.of())
                    .name("A payment of XPF 714.84 occurred at Bins, Barrows and Koch using a card ending in ****8422 for account ***4614.")
                    .paymentMethod("CASH")
                    .postedAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .status(AccountingExpenseStatus.SUBMITTED)
                    .taxAmount(0d)
                    .totalAmount(972.29)
                    .type(AccountingExpenseType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2020-09-02T08:10:50.236Z"))
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
                    .approvedAt(OffsetDateTime.parse("2021-04-19T14:57:56.607Z"))
                    .attachments(List.of())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .currency("GBP")
                    .externalNumber("ER-31240")
                    .id("073ebf50-daf4-416e-bb1a-7f52c8aef73c")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("da3aa992-b207-4bc0-8773-66db39350a2e")
                            .itemName("Conference ticket")
                            .taxAmount(0d)
                            .totalAmount(39.9)
                            .unitAmount(39.9)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("207aa92e-5f36-4947-bbeb-0b47523b1d2d")
                            .itemName("Flight")
                            .notes("Soluta omnis dolor.")
                            .taxAmount(0d)
                            .totalAmount(193.17)
                            .unitAmount(193.17)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("0136fa9f-dba7-43d8-a98c-5218dc133f15")
                            .itemName("Client dinner")
                            .notes("Altus caveo capio.")
                            .taxAmount(0d)
                            .totalAmount(230.12)
                            .unitAmount(230.12)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("818b5c18-3c3f-4394-8b04-deaecbc6cb25")
                            .itemName("Flight")
                            .taxAmount(0d)
                            .totalAmount(445.27)
                            .unitAmount(445.27)
                            .unitQuantity(1d)
                            .build()))
                    .metadata(List.of())
                    .name("Lolita Kunde - October expenses")
                    .postedAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .reimbursedAmount(908.46)
                    .reimbursedAt(OffsetDateTime.parse("2021-04-19T14:57:56.607Z"))
                    .status(AccountingExpensereportStatus.PAID)
                    .taxAmount(0d)
                    .totalAmount(908.46)
                    .updatedAt(OffsetDateTime.parse("2021-04-19T14:57:56.607Z"))
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
                            .downloadUrl("https://glossy-markup.net/")
                            .id("091a6129-6e50-4926-a8ce-4397da5d0b14")
                            .mimeType("application/pdf")
                            .name("INV-77705.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://earnest-giggle.net")
                            .id("3059c8c3-711d-4da6-8380-13ac54e89ff1")
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
                    .id("9962c2b4-a9ec-45dd-8027-f824fcf8abe8")
                    .invoiceNumber("INV-77705")
                    .isInclusiveOfTax(false)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Adinventitias sursum temptatio auctus comburo clarus ubi deprimo.")
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
                    .updatedAt(OffsetDateTime.parse("2026-04-24T10:54:42.329Z"))
                    .url("https://gifted-yarmulke.info/invoices/INV-77705")
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
                    .description("Cilicium minima calco constans adipisci.")
                    .id("dad1275b-1711-48d0-97b2-403b99d0fab0")
                    .isInclusiveOfTax(true)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2023-11-07T00:34:44.455Z"))
                    .reference("JE-78884")
                    .source("crustulum")
                    .status(AccountingJournalStatus.VOID)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2022-01-11T02:47:39.939Z"))
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
                        .address1("7654 Treutel Square")
                        .city("Forrestport")
                        .countryCode("US")
                        .postalCode("42190-3694")
                        .region("Maine")
                        .regionCode("OR")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .currency("GBP")
                    .id("737f31c8-0aaa-451f-a595-ef740b6d1938")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .shippingAddress(PropertyAccountingOrderShippingAddress.builder()
                        .address1("4974 Beatty Corners")
                        .city("Alizeport")
                        .countryCode("US")
                        .postalCode("56252")
                        .region("Alaska")
                        .regionCode("VT")
                        .build())
                    .status(AccountingOrderStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .type(AccountingOrderType.SALES)
                    .updatedAt(OffsetDateTime.parse("2022-02-08T12:27:32.445Z"))
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
                    .description("Cogito pecco eos cultura.")
                    .discountDayOfMonth(13d)
                    .discountDays(4d)
                    .discountPercent(5d)
                    .dueDays(57d)
                    .dueNextMonthDays(9d)
                    .id("1402e492-3f4d-4aed-acc9-575eb4555969")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Net 30")
                    .type(AccountingPaymenttermType.NET15)
                    .updatedAt(OffsetDateTime.parse("2026-01-09T08:24:07.608Z"))
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
                        .address1("72142 Willow Street")
                        .address2("Apt. 967")
                        .city("South Annabelleton")
                        .countryCode("US")
                        .postalCode("30337")
                        .region("Nevada")
                        .regionCode("FL")
                        .build())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .currency("EUR")
                    .id("6c281087-fb53-4446-a303-7198d131dfd2")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .shippingAddress(PropertyAccountingPurchaseorderShippingAddress.builder()
                        .address1("76494 Medhurst Club")
                        .city("Kshlerinfurt")
                        .countryCode("US")
                        .postalCode("92116-5474")
                        .region("Oregon")
                        .regionCode("WY")
                        .build())
                    .status(AccountingPurchaseorderStatus.SUBMITTED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2021-08-11T08:49:53.934Z"))
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
                        .address1("26530 Stroman Rest")
                        .address2("Suite 801")
                        .city("Pocatello")
                        .countryCode("US")
                        .postalCode("05015-8546")
                        .region("Louisiana")
                        .regionCode("MO")
                        .build())
                    .categoryIds(List.of())
                    .closedAt(OffsetDateTime.parse("2023-03-25T19:09:50.191Z"))
                    .createdAt(OffsetDateTime.parse("2022-01-17T16:11:50.310Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .fees(List.of())
                    .fulfillmentType(FulfillmentType.OTHER)
                    .id("a7e62007-a4c6-4328-9f88-a8db8753098a")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .orderNumber("832663")
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2022-01-17T16:11:50.310Z"))
                    .refundedAmount(0d)
                    .salesChannel("Wholesale")
                    .serviceChargeAmount(0d)
                    .shippingAddress(PropertyAccountingSalesorderShippingAddress.builder()
                        .address1("69878 Bradley Mill")
                        .city("Port Matildestad")
                        .countryCode("US")
                        .postalCode("07989-2148")
                        .region("Arkansas")
                        .regionCode("AK")
                        .build())
                    .status(AccountingSalesorderStatus.PAID)
                    .subtotalAmount(0d)
                    .taxAmount(0d)
                    .tipAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-03-25T19:09:50.191Z"))
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
                    .id("aff121fa-9169-4220-83a0-077c82eb636d")
                    .isActive(false)
                    .isCompound(false)
                    .metadata(List.of())
                    .name("Exempt")
                    .rate(0d)
                    .region("KS")
                    .totalRate(0d)
                    .type(AccountingTaxrateType.SALES)
                    .updatedAt(OffsetDateTime.parse("2020-02-13T05:33:51.984Z"))
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
                    .id("7d84db37-d5b9-4098-adac-7dd406208d43")
                    .lineitems(List.of(
                        AccountingTransactionLineItem.builder()
                            .categoryIds(List.of())
                            .description("The turquoise Hat combines Wallis and Futuna aesthetics with Potassium-based durability")
                            .id("e572460b-57c9-45bd-bfcc-4c6e92e11c57")
                            .name("Shirt")
                            .totalAmount(10184d)
                            .unitAmount(536d)
                            .unitQuantity(19d)
                            .build()))
                    .memo("deposit of ISK 792.81 at Fritsch - Dooley charged to account ending in 7879 using card ending in ****3230.")
                    .status(AccountingTransactionStatus.PENDING)
                    .taxAmount(0d)
                    .totalAmount(10184d)
                    .transactionAt(OffsetDateTime.parse("2019-09-25T11:40:42.574Z"))
                    .updatedAt(OffsetDateTime.parse("2019-10-14T06:19:22.778Z"))
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
                    .id("1af7da47-7158-4a03-abbc-199abddb9345")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Volup conatus cruciamentum decor avaritia.")
                    .postedAt(OffsetDateTime.parse("2023-04-15T21:14:08.197Z"))
                    .status(AccountingVendorcreditStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-10-03T05:00:46.877Z"))
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
                    .description("Voluptatibus valde spoliatio.")
                    .id("02f84203-c567-4992-ad19-ab7dd8adc4b9")
                    .isPayable(false)
                    .metadata(List.of())
                    .name("Auto Loan Account")
                    .status(Status.ARCHIVED)
                    .taxonomy(List.of(
                        AccountingAccountTaxonomy.builder()
                            .type(AccountingAccountTaxonomyType.SUBGROUP)
                            .value("comedo")
                            .originalType("vilitas")
                            .build()))
                    .type(Type.ACCOUNTS_RECEIVABLE)
                    .updatedAt(OffsetDateTime.parse("2023-08-07T04:01:46.197Z"))
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
                    .accountNumber("30369722")
                    .accountNumberLast4("9722")
                    .accountType(AccountType.LOAN)
                    .balance(49437d)
                    .bankName("Wells Fargo")
                    .createdAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .currency("AUD")
                    .feedStartAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .id("481943e1-31c5-4e42-821b-6f9c7d4ac246")
                    .metadata(List.of())
                    .name("Corwin, Donnelly and Connelly Checking")
                    .routingNumber("694667752")
                    .status(AccountingBankfeedaccountStatus.ACTIVE)
                    .updatedAt(OffsetDateTime.parse("2024-04-24T05:14:23.195Z"))
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
                    .bankCategory("Clothing")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-03-24T23:41:08.374Z"))
                    .currency("CAD")
                    .description("Payment of SRD 92.72 for withdrawal at Halvorson - Ziemann, processed with card ending ****3731 linked to account ***7781.")
                    .id("55c21f72-7386-4b73-ae17-a72d26e3a1be")
                    .isPending(true)
                    .merchantName("Buckridge - Feest")
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2025-04-15T12:39:25.157Z"))
                    .reference("79574105")
                    .transactionAt(OffsetDateTime.parse("2022-07-30T10:04:23.615Z"))
                    .type(AccountingBankfeedtransactionType.CREDIT)
                    .updatedAt(OffsetDateTime.parse("2022-05-25T02:39:25.361Z"))
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
                            .downloadUrl("https://puny-foodstuffs.name")
                            .id("d77fdfb3-fd28-49b0-ab7e-a688cb81da0f")
                            .mimeType("application/pdf")
                            .name("BILL-2466.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://grimy-characterization.net")
                            .id("af6e1baa-6bce-4e63-bf40-ecb99e3b7a0b")
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
                    .id("28bdc4c8-433d-46bd-a48d-99e8f98350ac")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Admiratio deporto tutamen cilicium infit amissio ante demulceo.")
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
                    .updatedAt(OffsetDateTime.parse("2020-06-01T08:34:06.496Z"))
                    .url("https://cluttered-importance.org/bills/BILL-2466")
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
                    .description("Textus ab thymum labore basium.")
                    .id("47b3740b-ffb2-41e6-8a8f-267dbacbee54")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Beauty")
                    .updatedAt(OffsetDateTime.parse("2025-09-12T05:00:23.915Z"))
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
                        .address1("4091 Tromp Coves")
                        .city("Lake Emmybury")
                        .countryCode("US")
                        .postalCode("50764-5226")
                        .region("Washington")
                        .regionCode("CA")
                        .build())
                    .companyName("Kertzmann Group")
                    .createdAt(OffsetDateTime.parse("2021-08-15T14:56:50.258Z"))
                    .currency("AUD")
                    .emails(List.of(
                        AccountingEmail.builder()
                            .email("delores.reynolds@kertzmanngroup.com")
                            .type(AccountingEmailType.WORK)
                            .build(),
                        AccountingEmail.builder()
                            .email("accounts@kertzmanngroup.com")
                            .type(AccountingEmailType.OTHER)
                            .build()))
                    .firstName("Delores")
                    .id("6c321c70-45ca-4c35-a684-446b116b7802")
                    .identification("531850872")
                    .isActive(true)
                    .isCustomer(true)
                    .lastName("Reynolds")
                    .metadata(List.of())
                    .name("Kertzmann Group")
                    .notes("Et videlicet pauci.")
                    .paymentMethods(List.of(
                        AccountingContactPaymentMethod.builder()
                            .type(AccountingContactPaymentMethodType.CARD)
                            .default_(true)
                            .id("36c24e0e-c359-4847-8010-5f26727ed716")
                            .name("Visa 7844")
                            .build()))
                    .portalUrl("https://kertzmanngroup.com/billing")
                    .shippingAddress(PropertyAccountingContactShippingAddress.builder()
                        .address1("23129 Rebekah Mews")
                        .city("Mortimerhaven")
                        .countryCode("US")
                        .postalCode("55878-6806")
                        .region("Florida")
                        .regionCode("OK")
                        .build())
                    .taxExemption(TaxExemption.FOREIGN)
                    .taxNumber("867556410")
                    .telephones(List.of(
                        AccountingTelephone.builder()
                            .telephone("(432) 760-1716")
                            .type(AccountingTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2023-12-20T08:09:21.913Z"))
                    .website("https://kertzmanngroup.com")
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
                    .id("fca13d53-2bed-4438-ba2d-5943bb9ea5f4")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Hic vorax dedecor amo adfero torqueo quas victoria.")
                    .postedAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .send(true)
                    .status(AccountingCreditmemoStatus.AUTHORIZED)
                    .taxAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2025-09-11T23:57:40.055Z"))
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
                            .downloadUrl("https://rubbery-couch.biz/")
                            .id("38787df5-7d1e-4012-8f30-33a53be9591b")
                            .mimeType("application/pdf")
                            .name("receipt-9696.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://appropriate-smog.biz/")
                            .id("2c816ee4-bcf8-47b8-99a7-8491f962bfb7")
                            .mimeType("application/pdf")
                            .name("receipt-9696-1.pdf")
                            .build()))
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .currency("GBP")
                    .externalNumber("EXP-38303")
                    .id("03d8d504-c36d-43b8-a7c8-4160e543fc7a")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("d1ce435f-521b-4434-a782-12753bb24d6e")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(364.74)
                            .unitAmount(364.74)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("a57827d4-c90c-449e-bcd7-cfb55dd4d424")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(258.35)
                            .unitAmount(258.35)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("9aa820ab-f47c-4621-8227-20c31d816895")
                            .itemName("Conference ticket")
                            .notes("Casus umquam conicio cinis demitto sint.")
                            .taxAmount(0d)
                            .totalAmount(28.14)
                            .unitAmount(28.14)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("d9fb1392-9cc3-47b9-88b5-e5546515ffe1")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(157.04)
                            .unitAmount(157.04)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("508be7e8-a025-4e80-8042-ed47866315c2")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(164.02)
                            .unitAmount(164.02)
                            .unitQuantity(1d)
                            .build()))
                    .metadata(List.of())
                    .name("A payment of XPF 714.84 occurred at Bins, Barrows and Koch using a card ending in ****8422 for account ***4614.")
                    .paymentMethod("CASH")
                    .postedAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .status(AccountingExpenseStatus.SUBMITTED)
                    .taxAmount(0d)
                    .totalAmount(972.29)
                    .type(AccountingExpenseType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2020-09-02T08:10:50.238Z"))
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
                    .approvedAt(OffsetDateTime.parse("2021-04-19T14:57:56.613Z"))
                    .attachments(List.of())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .currency("GBP")
                    .externalNumber("ER-31240")
                    .id("b9104d06-3de4-4edf-89d8-bd74a6032d0e")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("3c3bbc5a-d839-4f48-a3f5-0a2a5802f99c")
                            .itemName("Conference ticket")
                            .taxAmount(0d)
                            .totalAmount(39.9)
                            .unitAmount(39.9)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("6130b795-0660-49e1-961d-304f65a23bab")
                            .itemName("Flight")
                            .notes("Soluta omnis dolor.")
                            .taxAmount(0d)
                            .totalAmount(193.17)
                            .unitAmount(193.17)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("8c8ea052-9a74-4874-b44e-4e9e697aaf2e")
                            .itemName("Client dinner")
                            .notes("Altus caveo capio.")
                            .taxAmount(0d)
                            .totalAmount(230.12)
                            .unitAmount(230.12)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("f3e85a62-f1e3-4491-a7d8-b4739ac7d5a8")
                            .itemName("Flight")
                            .taxAmount(0d)
                            .totalAmount(445.27)
                            .unitAmount(445.27)
                            .unitQuantity(1d)
                            .build()))
                    .metadata(List.of())
                    .name("Lolita Kunde - October expenses")
                    .postedAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .reimbursedAmount(908.46)
                    .reimbursedAt(OffsetDateTime.parse("2021-04-19T14:57:56.613Z"))
                    .status(AccountingExpensereportStatus.PAID)
                    .taxAmount(0d)
                    .totalAmount(908.46)
                    .updatedAt(OffsetDateTime.parse("2021-04-19T14:57:56.613Z"))
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
                            .downloadUrl("https://glossy-markup.net/")
                            .id("e02e1031-a00e-462f-8876-f5b6a58e3f2f")
                            .mimeType("application/pdf")
                            .name("INV-77705.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://earnest-giggle.net")
                            .id("3015ebdf-a757-45be-8f3b-d81530a501c1")
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
                    .id("b2c369bb-8bb8-45ff-bf89-39a93004a343")
                    .invoiceNumber("INV-77705")
                    .isInclusiveOfTax(false)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Adinventitias sursum temptatio auctus comburo clarus ubi deprimo.")
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
                    .updatedAt(OffsetDateTime.parse("2026-04-24T10:54:42.387Z"))
                    .url("https://gifted-yarmulke.info/invoices/INV-77705")
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
                    .description("Cilicium minima calco constans adipisci.")
                    .id("5d500c8d-494a-41d6-b89e-392cb3a3ba06")
                    .isInclusiveOfTax(true)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2023-11-07T00:34:44.472Z"))
                    .reference("JE-78884")
                    .source("crustulum")
                    .status(AccountingJournalStatus.VOID)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2022-01-11T02:47:39.947Z"))
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
                        .address1("7654 Treutel Square")
                        .city("Forrestport")
                        .countryCode("US")
                        .postalCode("42190-3694")
                        .region("Maine")
                        .regionCode("OR")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .currency("GBP")
                    .id("e84e250a-5370-4900-a123-c6e66a3bb787")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .shippingAddress(PropertyAccountingOrderShippingAddress.builder()
                        .address1("4974 Beatty Corners")
                        .city("Alizeport")
                        .countryCode("US")
                        .postalCode("56252")
                        .region("Alaska")
                        .regionCode("VT")
                        .build())
                    .status(AccountingOrderStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .type(AccountingOrderType.SALES)
                    .updatedAt(OffsetDateTime.parse("2022-02-08T12:27:32.454Z"))
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
                    .description("Cogito pecco eos cultura.")
                    .discountDayOfMonth(13d)
                    .discountDays(4d)
                    .discountPercent(5d)
                    .dueDays(57d)
                    .dueNextMonthDays(9d)
                    .id("2f1e3728-7b60-425b-b433-6039408d7c37")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Net 30")
                    .type(AccountingPaymenttermType.NET15)
                    .updatedAt(OffsetDateTime.parse("2026-01-09T08:24:07.620Z"))
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
                        .address1("72142 Willow Street")
                        .address2("Apt. 967")
                        .city("South Annabelleton")
                        .countryCode("US")
                        .postalCode("30337")
                        .region("Nevada")
                        .regionCode("FL")
                        .build())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .currency("EUR")
                    .id("23260f1f-6417-4b6b-9e91-8abb05d470fc")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .shippingAddress(PropertyAccountingPurchaseorderShippingAddress.builder()
                        .address1("76494 Medhurst Club")
                        .city("Kshlerinfurt")
                        .countryCode("US")
                        .postalCode("92116-5474")
                        .region("Oregon")
                        .regionCode("WY")
                        .build())
                    .status(AccountingPurchaseorderStatus.SUBMITTED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2021-08-11T08:49:53.939Z"))
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
                        .address1("26530 Stroman Rest")
                        .address2("Suite 801")
                        .city("Pocatello")
                        .countryCode("US")
                        .postalCode("05015-8546")
                        .region("Louisiana")
                        .regionCode("MO")
                        .build())
                    .categoryIds(List.of())
                    .closedAt(OffsetDateTime.parse("2023-03-25T19:09:50.206Z"))
                    .createdAt(OffsetDateTime.parse("2022-01-17T16:11:50.310Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .fees(List.of())
                    .fulfillmentType(FulfillmentType.OTHER)
                    .id("c398d393-3647-4d70-a7a0-d6e5da942c54")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .orderNumber("832663")
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2022-01-17T16:11:50.310Z"))
                    .refundedAmount(0d)
                    .salesChannel("Wholesale")
                    .serviceChargeAmount(0d)
                    .shippingAddress(PropertyAccountingSalesorderShippingAddress.builder()
                        .address1("69878 Bradley Mill")
                        .city("Port Matildestad")
                        .countryCode("US")
                        .postalCode("07989-2148")
                        .region("Arkansas")
                        .regionCode("AK")
                        .build())
                    .status(AccountingSalesorderStatus.PAID)
                    .subtotalAmount(0d)
                    .taxAmount(0d)
                    .tipAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-03-25T19:09:50.206Z"))
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
                    .id("02027e6a-ff36-4ae7-acb8-c6d5a33f1cb1")
                    .isActive(false)
                    .isCompound(false)
                    .metadata(List.of())
                    .name("Exempt")
                    .rate(0d)
                    .region("KS")
                    .totalRate(0d)
                    .type(AccountingTaxrateType.SALES)
                    .updatedAt(OffsetDateTime.parse("2020-02-13T05:33:51.984Z"))
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
                    .id("0f076efa-8474-42d3-81a8-571670229456")
                    .lineitems(List.of(
                        AccountingTransactionLineItem.builder()
                            .categoryIds(List.of())
                            .description("The turquoise Hat combines Wallis and Futuna aesthetics with Potassium-based durability")
                            .id("4610f9a3-2400-442d-85a9-4067c82998c8")
                            .name("Shirt")
                            .totalAmount(10184d)
                            .unitAmount(536d)
                            .unitQuantity(19d)
                            .build()))
                    .memo("deposit of ISK 792.81 at Fritsch - Dooley charged to account ending in 7879 using card ending in ****3230.")
                    .status(AccountingTransactionStatus.PENDING)
                    .taxAmount(0d)
                    .totalAmount(10184d)
                    .transactionAt(OffsetDateTime.parse("2019-09-25T11:40:42.574Z"))
                    .updatedAt(OffsetDateTime.parse("2019-10-14T06:19:22.778Z"))
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
                    .id("092d8e7a-d188-42eb-8a10-1999a0803f81")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Volup conatus cruciamentum decor avaritia.")
                    .postedAt(OffsetDateTime.parse("2023-04-15T21:14:08.197Z"))
                    .status(AccountingVendorcreditStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-10-03T05:00:46.881Z"))
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
                    .description("Voluptatibus valde spoliatio.")
                    .id("02f84203-c567-4992-ad19-ab7dd8adc4b9")
                    .isPayable(false)
                    .metadata(List.of())
                    .name("Auto Loan Account")
                    .status(Status.ARCHIVED)
                    .taxonomy(List.of(
                        AccountingAccountTaxonomy.builder()
                            .type(AccountingAccountTaxonomyType.SUBGROUP)
                            .value("comedo")
                            .originalType("vilitas")
                            .build()))
                    .type(Type.ACCOUNTS_RECEIVABLE)
                    .updatedAt(OffsetDateTime.parse("2023-08-07T04:01:46.197Z"))
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
                    .accountNumber("30369722")
                    .accountNumberLast4("9722")
                    .accountType(AccountType.LOAN)
                    .balance(49437d)
                    .bankName("Wells Fargo")
                    .createdAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .currency("AUD")
                    .feedStartAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .id("481943e1-31c5-4e42-821b-6f9c7d4ac246")
                    .metadata(List.of())
                    .name("Corwin, Donnelly and Connelly Checking")
                    .routingNumber("694667752")
                    .status(AccountingBankfeedaccountStatus.ACTIVE)
                    .updatedAt(OffsetDateTime.parse("2024-04-24T05:14:23.195Z"))
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
                    .bankCategory("Clothing")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-03-24T23:41:08.374Z"))
                    .currency("CAD")
                    .description("Payment of SRD 92.72 for withdrawal at Halvorson - Ziemann, processed with card ending ****3731 linked to account ***7781.")
                    .id("55c21f72-7386-4b73-ae17-a72d26e3a1be")
                    .isPending(true)
                    .merchantName("Buckridge - Feest")
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2025-04-15T12:39:25.157Z"))
                    .reference("79574105")
                    .transactionAt(OffsetDateTime.parse("2022-07-30T10:04:23.615Z"))
                    .type(AccountingBankfeedtransactionType.CREDIT)
                    .updatedAt(OffsetDateTime.parse("2022-05-25T02:39:25.361Z"))
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
                            .downloadUrl("https://puny-foodstuffs.name")
                            .id("d77fdfb3-fd28-49b0-ab7e-a688cb81da0f")
                            .mimeType("application/pdf")
                            .name("BILL-2466.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://grimy-characterization.net")
                            .id("af6e1baa-6bce-4e63-bf40-ecb99e3b7a0b")
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
                    .id("28bdc4c8-433d-46bd-a48d-99e8f98350ac")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Admiratio deporto tutamen cilicium infit amissio ante demulceo.")
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
                    .updatedAt(OffsetDateTime.parse("2020-06-01T08:34:06.496Z"))
                    .url("https://cluttered-importance.org/bills/BILL-2466")
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
                    .description("Textus ab thymum labore basium.")
                    .id("47b3740b-ffb2-41e6-8a8f-267dbacbee54")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Beauty")
                    .updatedAt(OffsetDateTime.parse("2025-09-12T05:00:23.915Z"))
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
                        .address1("4091 Tromp Coves")
                        .city("Lake Emmybury")
                        .countryCode("US")
                        .postalCode("50764-5226")
                        .region("Washington")
                        .regionCode("CA")
                        .build())
                    .companyName("Kertzmann Group")
                    .createdAt(OffsetDateTime.parse("2021-08-15T14:56:50.258Z"))
                    .currency("AUD")
                    .emails(List.of(
                        AccountingEmail.builder()
                            .email("delores.reynolds@kertzmanngroup.com")
                            .type(AccountingEmailType.WORK)
                            .build(),
                        AccountingEmail.builder()
                            .email("accounts@kertzmanngroup.com")
                            .type(AccountingEmailType.OTHER)
                            .build()))
                    .firstName("Delores")
                    .id("6c321c70-45ca-4c35-a684-446b116b7802")
                    .identification("531850872")
                    .isActive(true)
                    .isCustomer(true)
                    .lastName("Reynolds")
                    .metadata(List.of())
                    .name("Kertzmann Group")
                    .notes("Et videlicet pauci.")
                    .paymentMethods(List.of(
                        AccountingContactPaymentMethod.builder()
                            .type(AccountingContactPaymentMethodType.CARD)
                            .default_(true)
                            .id("36c24e0e-c359-4847-8010-5f26727ed716")
                            .name("Visa 7844")
                            .build()))
                    .portalUrl("https://kertzmanngroup.com/billing")
                    .shippingAddress(PropertyAccountingContactShippingAddress.builder()
                        .address1("23129 Rebekah Mews")
                        .city("Mortimerhaven")
                        .countryCode("US")
                        .postalCode("55878-6806")
                        .region("Florida")
                        .regionCode("OK")
                        .build())
                    .taxExemption(TaxExemption.FOREIGN)
                    .taxNumber("867556410")
                    .telephones(List.of(
                        AccountingTelephone.builder()
                            .telephone("(432) 760-1716")
                            .type(AccountingTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2023-12-20T08:09:21.913Z"))
                    .website("https://kertzmanngroup.com")
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
                    .id("fca13d53-2bed-4438-ba2d-5943bb9ea5f4")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Hic vorax dedecor amo adfero torqueo quas victoria.")
                    .postedAt(OffsetDateTime.parse("2023-09-20T01:47:01.571Z"))
                    .send(true)
                    .status(AccountingCreditmemoStatus.AUTHORIZED)
                    .taxAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2025-09-11T23:57:40.055Z"))
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
                            .downloadUrl("https://rubbery-couch.biz/")
                            .id("38787df5-7d1e-4012-8f30-33a53be9591b")
                            .mimeType("application/pdf")
                            .name("receipt-9696.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://appropriate-smog.biz/")
                            .id("2c816ee4-bcf8-47b8-99a7-8491f962bfb7")
                            .mimeType("application/pdf")
                            .name("receipt-9696-1.pdf")
                            .build()))
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .currency("GBP")
                    .externalNumber("EXP-38303")
                    .id("03d8d504-c36d-43b8-a7c8-4160e543fc7a")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("d1ce435f-521b-4434-a782-12753bb24d6e")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(364.74)
                            .unitAmount(364.74)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("a57827d4-c90c-449e-bcd7-cfb55dd4d424")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(258.35)
                            .unitAmount(258.35)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("9aa820ab-f47c-4621-8227-20c31d816895")
                            .itemName("Conference ticket")
                            .notes("Casus umquam conicio cinis demitto sint.")
                            .taxAmount(0d)
                            .totalAmount(28.14)
                            .unitAmount(28.14)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("d9fb1392-9cc3-47b9-88b5-e5546515ffe1")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(157.04)
                            .unitAmount(157.04)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("508be7e8-a025-4e80-8042-ed47866315c2")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(164.02)
                            .unitAmount(164.02)
                            .unitQuantity(1d)
                            .build()))
                    .metadata(List.of())
                    .name("A payment of XPF 714.84 occurred at Bins, Barrows and Koch using a card ending in ****8422 for account ***4614.")
                    .paymentMethod("CASH")
                    .postedAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .status(AccountingExpenseStatus.SUBMITTED)
                    .taxAmount(0d)
                    .totalAmount(972.29)
                    .type(AccountingExpenseType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2020-09-02T08:10:50.238Z"))
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
                    .approvedAt(OffsetDateTime.parse("2021-04-19T14:57:56.613Z"))
                    .attachments(List.of())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .currency("GBP")
                    .externalNumber("ER-31240")
                    .id("b9104d06-3de4-4edf-89d8-bd74a6032d0e")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("3c3bbc5a-d839-4f48-a3f5-0a2a5802f99c")
                            .itemName("Conference ticket")
                            .taxAmount(0d)
                            .totalAmount(39.9)
                            .unitAmount(39.9)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("6130b795-0660-49e1-961d-304f65a23bab")
                            .itemName("Flight")
                            .notes("Soluta omnis dolor.")
                            .taxAmount(0d)
                            .totalAmount(193.17)
                            .unitAmount(193.17)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("8c8ea052-9a74-4874-b44e-4e9e697aaf2e")
                            .itemName("Client dinner")
                            .notes("Altus caveo capio.")
                            .taxAmount(0d)
                            .totalAmount(230.12)
                            .unitAmount(230.12)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("f3e85a62-f1e3-4491-a7d8-b4739ac7d5a8")
                            .itemName("Flight")
                            .taxAmount(0d)
                            .totalAmount(445.27)
                            .unitAmount(445.27)
                            .unitQuantity(1d)
                            .build()))
                    .metadata(List.of())
                    .name("Lolita Kunde - October expenses")
                    .postedAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .reimbursedAmount(908.46)
                    .reimbursedAt(OffsetDateTime.parse("2021-04-19T14:57:56.613Z"))
                    .status(AccountingExpensereportStatus.PAID)
                    .taxAmount(0d)
                    .totalAmount(908.46)
                    .updatedAt(OffsetDateTime.parse("2021-04-19T14:57:56.613Z"))
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
                            .downloadUrl("https://glossy-markup.net/")
                            .id("e02e1031-a00e-462f-8876-f5b6a58e3f2f")
                            .mimeType("application/pdf")
                            .name("INV-77705.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://earnest-giggle.net")
                            .id("3015ebdf-a757-45be-8f3b-d81530a501c1")
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
                    .id("b2c369bb-8bb8-45ff-bf89-39a93004a343")
                    .invoiceNumber("INV-77705")
                    .isInclusiveOfTax(false)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Adinventitias sursum temptatio auctus comburo clarus ubi deprimo.")
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
                    .updatedAt(OffsetDateTime.parse("2026-04-24T10:54:42.387Z"))
                    .url("https://gifted-yarmulke.info/invoices/INV-77705")
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
                    .description("Cilicium minima calco constans adipisci.")
                    .id("5d500c8d-494a-41d6-b89e-392cb3a3ba06")
                    .isInclusiveOfTax(true)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2023-11-07T00:34:44.472Z"))
                    .reference("JE-78884")
                    .source("crustulum")
                    .status(AccountingJournalStatus.VOID)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2022-01-11T02:47:39.947Z"))
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
                        .address1("7654 Treutel Square")
                        .city("Forrestport")
                        .countryCode("US")
                        .postalCode("42190-3694")
                        .region("Maine")
                        .regionCode("OR")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .currency("GBP")
                    .id("e84e250a-5370-4900-a123-c6e66a3bb787")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .shippingAddress(PropertyAccountingOrderShippingAddress.builder()
                        .address1("4974 Beatty Corners")
                        .city("Alizeport")
                        .countryCode("US")
                        .postalCode("56252")
                        .region("Alaska")
                        .regionCode("VT")
                        .build())
                    .status(AccountingOrderStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .type(AccountingOrderType.SALES)
                    .updatedAt(OffsetDateTime.parse("2022-02-08T12:27:32.454Z"))
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
                    .description("Cogito pecco eos cultura.")
                    .discountDayOfMonth(13d)
                    .discountDays(4d)
                    .discountPercent(5d)
                    .dueDays(57d)
                    .dueNextMonthDays(9d)
                    .id("2f1e3728-7b60-425b-b433-6039408d7c37")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Net 30")
                    .type(AccountingPaymenttermType.NET15)
                    .updatedAt(OffsetDateTime.parse("2026-01-09T08:24:07.620Z"))
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
                        .address1("72142 Willow Street")
                        .address2("Apt. 967")
                        .city("South Annabelleton")
                        .countryCode("US")
                        .postalCode("30337")
                        .region("Nevada")
                        .regionCode("FL")
                        .build())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .currency("EUR")
                    .id("23260f1f-6417-4b6b-9e91-8abb05d470fc")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-12-12T07:17:47.021Z"))
                    .shippingAddress(PropertyAccountingPurchaseorderShippingAddress.builder()
                        .address1("76494 Medhurst Club")
                        .city("Kshlerinfurt")
                        .countryCode("US")
                        .postalCode("92116-5474")
                        .region("Oregon")
                        .regionCode("WY")
                        .build())
                    .status(AccountingPurchaseorderStatus.SUBMITTED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2021-08-11T08:49:53.939Z"))
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
                        .address1("26530 Stroman Rest")
                        .address2("Suite 801")
                        .city("Pocatello")
                        .countryCode("US")
                        .postalCode("05015-8546")
                        .region("Louisiana")
                        .regionCode("MO")
                        .build())
                    .categoryIds(List.of())
                    .closedAt(OffsetDateTime.parse("2023-03-25T19:09:50.206Z"))
                    .createdAt(OffsetDateTime.parse("2022-01-17T16:11:50.310Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .fees(List.of())
                    .fulfillmentType(FulfillmentType.OTHER)
                    .id("c398d393-3647-4d70-a7a0-d6e5da942c54")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .orderNumber("832663")
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2022-01-17T16:11:50.310Z"))
                    .refundedAmount(0d)
                    .salesChannel("Wholesale")
                    .serviceChargeAmount(0d)
                    .shippingAddress(PropertyAccountingSalesorderShippingAddress.builder()
                        .address1("69878 Bradley Mill")
                        .city("Port Matildestad")
                        .countryCode("US")
                        .postalCode("07989-2148")
                        .region("Arkansas")
                        .regionCode("AK")
                        .build())
                    .status(AccountingSalesorderStatus.PAID)
                    .subtotalAmount(0d)
                    .taxAmount(0d)
                    .tipAmount(0d)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-03-25T19:09:50.206Z"))
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
                    .id("02027e6a-ff36-4ae7-acb8-c6d5a33f1cb1")
                    .isActive(false)
                    .isCompound(false)
                    .metadata(List.of())
                    .name("Exempt")
                    .rate(0d)
                    .region("KS")
                    .totalRate(0d)
                    .type(AccountingTaxrateType.SALES)
                    .updatedAt(OffsetDateTime.parse("2020-02-13T05:33:51.984Z"))
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
                    .id("0f076efa-8474-42d3-81a8-571670229456")
                    .lineitems(List.of(
                        AccountingTransactionLineItem.builder()
                            .categoryIds(List.of())
                            .description("The turquoise Hat combines Wallis and Futuna aesthetics with Potassium-based durability")
                            .id("4610f9a3-2400-442d-85a9-4067c82998c8")
                            .name("Shirt")
                            .totalAmount(10184d)
                            .unitAmount(536d)
                            .unitQuantity(19d)
                            .build()))
                    .memo("deposit of ISK 792.81 at Fritsch - Dooley charged to account ending in 7879 using card ending in ****3230.")
                    .status(AccountingTransactionStatus.PENDING)
                    .taxAmount(0d)
                    .totalAmount(10184d)
                    .transactionAt(OffsetDateTime.parse("2019-09-25T11:40:42.574Z"))
                    .updatedAt(OffsetDateTime.parse("2019-10-14T06:19:22.778Z"))
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
                    .id("092d8e7a-d188-42eb-8a10-1999a0803f81")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Volup conatus cruciamentum decor avaritia.")
                    .postedAt(OffsetDateTime.parse("2023-04-15T21:14:08.197Z"))
                    .status(AccountingVendorcreditStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-10-03T05:00:46.881Z"))
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