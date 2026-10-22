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
                    .id("93e890d8-e66f-479d-9ec6-fb53d2430682")
                    .incurredAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .isBilled(false)
                    .metadata(List.of())
                    .priceAmount(100d)
                    .quantity(3d)
                    .totalAmount(300d)
                    .type(LegalExpenseType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2024-03-31T13:35:29.919Z"))
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
                    .id("2803c4a2-1772-42cf-aa26-81ee298b9f1a")
                    .incurredAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .isBilled(false)
                    .metadata(List.of())
                    .priceAmount(100d)
                    .quantity(3d)
                    .totalAmount(300d)
                    .type(LegalExpenseType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2024-03-31T13:35:29.928Z"))
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
                    .id("2803c4a2-1772-42cf-aa26-81ee298b9f1a")
                    .incurredAt(OffsetDateTime.parse("2020-11-08T00:41:42.356Z"))
                    .isBilled(false)
                    .metadata(List.of())
                    .priceAmount(100d)
                    .quantity(3d)
                    .totalAmount(300d)
                    .type(LegalExpenseType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2024-03-31T13:35:29.928Z"))
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