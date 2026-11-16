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
                            .id("1807b8fe-1635-46a0-963e-3a076e559571")
                            .mimeType("application/pdf")
                            .name("receipt-9696.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://appropriate-smog.biz/")
                            .id("3d522a63-74b6-4ac3-b26e-15140cac54b1")
                            .mimeType("application/pdf")
                            .name("receipt-9696-1.pdf")
                            .build()))
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .currency("GBP")
                    .externalNumber("EXP-38303")
                    .id("75de9269-67e6-4095-8a94-17ddbb409ae5")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("eecc4041-d6b2-4501-bf3b-1f4faeea891a")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(364.74)
                            .unitAmount(364.74)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("9df0817d-d031-4fcd-bdca-9439fb25fcc3")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(258.35)
                            .unitAmount(258.35)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("b057af39-60dd-4d06-b8d7-56b779476342")
                            .itemName("Conference ticket")
                            .notes("Casus umquam conicio cinis demitto sint.")
                            .taxAmount(0d)
                            .totalAmount(28.14)
                            .unitAmount(28.14)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("3bc75b11-e1c4-4ec3-9078-db9ea7a2d9af")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(157.04)
                            .unitAmount(157.04)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("006fa89c-2a72-4158-9828-eb4d2a472550")
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
                    .updatedAt(OffsetDateTime.parse("2020-09-03T05:37:01.425Z"))
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
                    .id("77ba3eff-b346-4090-a5b6-9ad2d64bb9d8")
                    .incurredAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .isBilled(false)
                    .metadata(List.of())
                    .priceAmount(100d)
                    .quantity(3d)
                    .totalAmount(300d)
                    .type(LegalExpenseType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2024-04-14T19:01:21.512Z"))
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
                            .id("d9ce7e85-6711-4364-8986-81e507c5a97c")
                            .mimeType("application/pdf")
                            .name("receipt-9696.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://appropriate-smog.biz/")
                            .id("e4b8a84c-472d-4cd1-99ea-bea7b8d7921e")
                            .mimeType("application/pdf")
                            .name("receipt-9696-1.pdf")
                            .build()))
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .currency("GBP")
                    .externalNumber("EXP-38303")
                    .id("3e967e8c-9b0d-486a-a135-a3ce84df19b9")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("a7ff977b-c837-411f-9178-4e78fe4c177e")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(364.74)
                            .unitAmount(364.74)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("e65bc9b2-0a35-431b-91d9-d68f142af01e")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(258.35)
                            .unitAmount(258.35)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("9c2164c0-5e86-4f66-aa27-b12501e74909")
                            .itemName("Conference ticket")
                            .notes("Casus umquam conicio cinis demitto sint.")
                            .taxAmount(0d)
                            .totalAmount(28.14)
                            .unitAmount(28.14)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("02a89a5a-fdc4-495e-bdff-f8431e7aecc8")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(157.04)
                            .unitAmount(157.04)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("80b15162-4213-401a-bc55-841671c913c2")
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
                    .updatedAt(OffsetDateTime.parse("2020-09-03T05:37:01.426Z"))
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
                    .id("e9634d18-e6b4-4e31-bd7a-14eafee9c2a8")
                    .incurredAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .isBilled(false)
                    .metadata(List.of())
                    .priceAmount(100d)
                    .quantity(3d)
                    .totalAmount(300d)
                    .type(LegalExpenseType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2024-04-14T19:01:21.517Z"))
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
                            .id("d9ce7e85-6711-4364-8986-81e507c5a97c")
                            .mimeType("application/pdf")
                            .name("receipt-9696.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://appropriate-smog.biz/")
                            .id("e4b8a84c-472d-4cd1-99ea-bea7b8d7921e")
                            .mimeType("application/pdf")
                            .name("receipt-9696-1.pdf")
                            .build()))
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-06-11T03:39:37.305Z"))
                    .currency("GBP")
                    .externalNumber("EXP-38303")
                    .id("3e967e8c-9b0d-486a-a135-a3ce84df19b9")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("a7ff977b-c837-411f-9178-4e78fe4c177e")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(364.74)
                            .unitAmount(364.74)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("e65bc9b2-0a35-431b-91d9-d68f142af01e")
                            .itemName("Client dinner")
                            .taxAmount(0d)
                            .totalAmount(258.35)
                            .unitAmount(258.35)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("9c2164c0-5e86-4f66-aa27-b12501e74909")
                            .itemName("Conference ticket")
                            .notes("Casus umquam conicio cinis demitto sint.")
                            .taxAmount(0d)
                            .totalAmount(28.14)
                            .unitAmount(28.14)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("02a89a5a-fdc4-495e-bdff-f8431e7aecc8")
                            .itemName("Hotel")
                            .taxAmount(0d)
                            .totalAmount(157.04)
                            .unitAmount(157.04)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("80b15162-4213-401a-bc55-841671c913c2")
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
                    .updatedAt(OffsetDateTime.parse("2020-09-03T05:37:01.426Z"))
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
                    .id("e9634d18-e6b4-4e31-bd7a-14eafee9c2a8")
                    .incurredAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .isBilled(false)
                    .metadata(List.of())
                    .priceAmount(100d)
                    .quantity(3d)
                    .totalAmount(300d)
                    .type(LegalExpenseType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2024-04-14T19:01:21.517Z"))
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