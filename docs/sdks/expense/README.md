# Expense

## Overview

### Available Operations

* [createAccountingExpense](#createaccountingexpense) - Create an expense
* [createLegalExpense](#createlegalexpense) - Create an expense
* [getAccountingExpense](#getaccountingexpense) - Retrieve an expense
* [getLegalExpense](#getlegalexpense) - Retrieve an expense
* [listAccountingExpenses](#listaccountingexpenses) - List all expenses
* [listLegalExpenses](#listlegalexpenses) - List all expenses
* [patchAccountingExpense](#patchaccountingexpense) - Update an expense
* [patchLegalExpense](#patchlegalexpense) - Update an expense
* [removeAccountingExpense](#removeaccountingexpense) - Remove an expense
* [removeLegalExpense](#removelegalexpense) - Remove an expense
* [updateAccountingExpense](#updateaccountingexpense) - Update an expense
* [updateLegalExpense](#updatelegalexpense) - Update an expense

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
                            .id("31cb9f04-cf4d-4369-91ad-84741d9f3b04")
                            .mimeType("application/pdf")
                            .name("receipt-9696.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://appropriate-smog.biz/")
                            .id("35daf970-c14a-4d3b-ba5e-66e02160afb5")
                            .mimeType("application/pdf")
                            .name("receipt-9696-1.pdf")
                            .build()))
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .currency("GBP")
                    .externalNumber("EXP-38303")
                    .id("2547c8f7-8e83-40a7-8fba-5080349cb328")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("7d599b32-fa5d-4e0a-a29d-a74a806d79c5")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(364.74)
                            .unitAmount(364.74)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("0bab8c82-7561-4987-bc71-4c12dec6514b")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(258.35)
                            .unitAmount(258.35)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("a951ed43-9180-4981-96c7-92bef7d20e4e")
                            .itemName("Conference ticket")
                            .notes("Casus umquam conicio cinis demitto sint.")
                            .taxAmount(0d)
                            .totalAmount(28.14)
                            .unitAmount(28.14)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("7a344c52-94f1-4a4b-901c-121c0ca535b7")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(157.04)
                            .unitAmount(157.04)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("2f4c333a-e146-42b6-b34e-81b80614c332")
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
                    .updatedAt(OffsetDateTime.parse("2020-09-02T08:59:40.270Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingExpenseResponse res = sdk.expense().createAccountingExpense()
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

## createLegalExpense

Creates a LegalExpense. Provide the unified LegalExpense fields in the request body; they are mapped to the provider's API. Returns the created LegalExpense.

### Example Usage

<!-- UsageSnippet language="java" operationID="createLegalExpense" method="post" path="/legal/{connection_id}/expense" example="legal_expense" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLegalExpenseRequest;
import to.unified.unified_java_sdk.models.operations.CreateLegalExpenseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLegalExpenseRequest req = CreateLegalExpenseRequest.builder()
                .legalExpense(LegalExpense.builder()
                    .category("Kids")
                    .createdAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .currency("MVR")
                    .description("Temporibus agnitio sui.")
                    .id("e18450f9-5b54-405d-a64f-965d6e62fa75")
                    .incurredAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .isBilled(false)
                    .metadata(List.of())
                    .priceAmount(100d)
                    .quantity(3d)
                    .totalAmount(300d)
                    .type(LegalExpenseType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2024-04-01T02:33:18.056Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLegalExpenseResponse res = sdk.expense().createLegalExpense()
                .request(req)
                .call();

        if (res.legalExpense().isPresent()) {
            System.out.println(res.legalExpense().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateLegalExpenseRequest](../../models/operations/CreateLegalExpenseRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateLegalExpenseResponse](../../models/operations/CreateLegalExpenseResponse.md)**

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

        GetAccountingExpenseResponse res = sdk.expense().getAccountingExpense()
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

## getLegalExpense

Retrieves a single LegalExpense by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getLegalExpense" method="get" path="/legal/{connection_id}/expense/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLegalExpenseRequest;
import to.unified.unified_java_sdk.models.operations.GetLegalExpenseResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLegalExpenseRequest req = GetLegalExpenseRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLegalExpenseResponse res = sdk.expense().getLegalExpense()
                .request(req)
                .call();

        if (res.legalExpense().isPresent()) {
            System.out.println(res.legalExpense().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetLegalExpenseRequest](../../models/operations/GetLegalExpenseRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetLegalExpenseResponse](../../models/operations/GetLegalExpenseResponse.md)**

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

        ListAccountingExpensesResponse res = sdk.expense().listAccountingExpenses()
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

## listLegalExpenses

Returns a list of LegalExpenses. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listLegalExpenses" method="get" path="/legal/{connection_id}/expense" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLegalExpensesRequest;
import to.unified.unified_java_sdk.models.operations.ListLegalExpensesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLegalExpensesRequest req = ListLegalExpensesRequest.builder()
                .connectionId("<id>")
                .build();

        ListLegalExpensesResponse res = sdk.expense().listLegalExpenses()
                .request(req)
                .call();

        if (res.legalExpenses().isPresent()) {
            System.out.println(res.legalExpenses().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListLegalExpensesRequest](../../models/operations/ListLegalExpensesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListLegalExpensesResponse](../../models/operations/ListLegalExpensesResponse.md)**

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
                            .id("98e0d1be-baf4-4d76-bc9c-b00d47df4876")
                            .mimeType("application/pdf")
                            .name("receipt-9696.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://appropriate-smog.biz/")
                            .id("925cc6a7-448f-48b5-a349-8181cd9a6959")
                            .mimeType("application/pdf")
                            .name("receipt-9696-1.pdf")
                            .build()))
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .currency("GBP")
                    .externalNumber("EXP-38303")
                    .id("0eb3c9d8-84f8-49d7-9a39-ca0a113ad5a3")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("d221e34c-d475-4600-a3bb-bb0c0499d64f")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(364.74)
                            .unitAmount(364.74)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("e9c64174-42b9-4bb6-9d06-4e79c1f29035")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(258.35)
                            .unitAmount(258.35)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("9513f94c-d15e-47d6-923a-288c5949c674")
                            .itemName("Conference ticket")
                            .notes("Casus umquam conicio cinis demitto sint.")
                            .taxAmount(0d)
                            .totalAmount(28.14)
                            .unitAmount(28.14)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("fd1b860a-1ae1-4406-ae8d-08e32bab1dd4")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(157.04)
                            .unitAmount(157.04)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("9c6ee147-a418-4339-be6d-a5b868c9944d")
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
                    .updatedAt(OffsetDateTime.parse("2020-09-02T08:59:40.271Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingExpenseResponse res = sdk.expense().patchAccountingExpense()
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

## patchLegalExpense

Updates the LegalExpense identified by `id`. Provide the unified LegalExpense fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLegalExpense" method="patch" path="/legal/{connection_id}/expense/{id}" example="legal_expense" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLegalExpenseRequest;
import to.unified.unified_java_sdk.models.operations.PatchLegalExpenseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLegalExpenseRequest req = PatchLegalExpenseRequest.builder()
                .legalExpense(LegalExpense.builder()
                    .category("Kids")
                    .createdAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .currency("MVR")
                    .description("Temporibus agnitio sui.")
                    .id("d7007f79-1ee1-482c-8c32-86ec3f5da1ee")
                    .incurredAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .isBilled(false)
                    .metadata(List.of())
                    .priceAmount(100d)
                    .quantity(3d)
                    .totalAmount(300d)
                    .type(LegalExpenseType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2024-04-01T02:33:18.062Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLegalExpenseResponse res = sdk.expense().patchLegalExpense()
                .request(req)
                .call();

        if (res.legalExpense().isPresent()) {
            System.out.println(res.legalExpense().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchLegalExpenseRequest](../../models/operations/PatchLegalExpenseRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchLegalExpenseResponse](../../models/operations/PatchLegalExpenseResponse.md)**

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

        RemoveAccountingExpenseResponse res = sdk.expense().removeAccountingExpense()
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

## removeLegalExpense

Deletes the LegalExpense identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLegalExpense" method="delete" path="/legal/{connection_id}/expense/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLegalExpenseRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLegalExpenseResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLegalExpenseRequest req = RemoveLegalExpenseRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLegalExpenseResponse res = sdk.expense().removeLegalExpense()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveLegalExpenseRequest](../../models/operations/RemoveLegalExpenseRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveLegalExpenseResponse](../../models/operations/RemoveLegalExpenseResponse.md)**

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
                            .id("98e0d1be-baf4-4d76-bc9c-b00d47df4876")
                            .mimeType("application/pdf")
                            .name("receipt-9696.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://appropriate-smog.biz/")
                            .id("925cc6a7-448f-48b5-a349-8181cd9a6959")
                            .mimeType("application/pdf")
                            .name("receipt-9696-1.pdf")
                            .build()))
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .currency("GBP")
                    .externalNumber("EXP-38303")
                    .id("0eb3c9d8-84f8-49d7-9a39-ca0a113ad5a3")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("d221e34c-d475-4600-a3bb-bb0c0499d64f")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(364.74)
                            .unitAmount(364.74)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("e9c64174-42b9-4bb6-9d06-4e79c1f29035")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(258.35)
                            .unitAmount(258.35)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("9513f94c-d15e-47d6-923a-288c5949c674")
                            .itemName("Conference ticket")
                            .notes("Casus umquam conicio cinis demitto sint.")
                            .taxAmount(0d)
                            .totalAmount(28.14)
                            .unitAmount(28.14)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("fd1b860a-1ae1-4406-ae8d-08e32bab1dd4")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(157.04)
                            .unitAmount(157.04)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("9c6ee147-a418-4339-be6d-a5b868c9944d")
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
                    .updatedAt(OffsetDateTime.parse("2020-09-02T08:59:40.271Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingExpenseResponse res = sdk.expense().updateAccountingExpense()
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

## updateLegalExpense

Updates the LegalExpense identified by `id`. Provide the unified LegalExpense fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLegalExpense" method="put" path="/legal/{connection_id}/expense/{id}" example="legal_expense" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLegalExpenseRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLegalExpenseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLegalExpenseRequest req = UpdateLegalExpenseRequest.builder()
                .legalExpense(LegalExpense.builder()
                    .category("Kids")
                    .createdAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .currency("MVR")
                    .description("Temporibus agnitio sui.")
                    .id("d7007f79-1ee1-482c-8c32-86ec3f5da1ee")
                    .incurredAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .isBilled(false)
                    .metadata(List.of())
                    .priceAmount(100d)
                    .quantity(3d)
                    .totalAmount(300d)
                    .type(LegalExpenseType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2024-04-01T02:33:18.062Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLegalExpenseResponse res = sdk.expense().updateLegalExpense()
                .request(req)
                .call();

        if (res.legalExpense().isPresent()) {
            System.out.println(res.legalExpense().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateLegalExpenseRequest](../../models/operations/UpdateLegalExpenseRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateLegalExpenseResponse](../../models/operations/UpdateLegalExpenseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |