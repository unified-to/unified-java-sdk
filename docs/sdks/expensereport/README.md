# Expensereport

## Overview

### Available Operations

* [createAccountingExpensereport](#createaccountingexpensereport) - Create an expensereport
* [getAccountingExpensereport](#getaccountingexpensereport) - Retrieve an expensereport
* [listAccountingExpensereports](#listaccountingexpensereports) - List all expensereports
* [patchAccountingExpensereport](#patchaccountingexpensereport) - Update an expensereport
* [removeAccountingExpensereport](#removeaccountingexpensereport) - Remove an expensereport
* [updateAccountingExpensereport](#updateaccountingexpensereport) - Update an expensereport

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
                    .approvedAt(OffsetDateTime.parse("2021-04-19T18:07:58.454Z"))
                    .attachments(List.of())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .currency("GBP")
                    .externalNumber("ER-31240")
                    .id("4be569ca-786f-449c-8c99-bc43cec66023")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("8ee45ef6-397f-4012-bb92-2d7d8c171270")
                            .itemName("Conference ticket")
                            .taxAmount(0d)
                            .totalAmount(39.9)
                            .unitAmount(39.9)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("4cc49924-5d51-42f8-8105-4f926ecd9c16")
                            .itemName("Flight")
                            .notes("Soluta omnis dolor.")
                            .taxAmount(0d)
                            .totalAmount(193.17)
                            .unitAmount(193.17)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("be915552-c01e-487c-9bf3-d1ba1968e30a")
                            .itemName("Client dinner")
                            .notes("Altus caveo capio.")
                            .taxAmount(0d)
                            .totalAmount(230.12)
                            .unitAmount(230.12)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("680569b3-3cf9-47e7-b3b2-27a78187c8bb")
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
                    .reimbursedAt(OffsetDateTime.parse("2021-04-19T18:07:58.454Z"))
                    .status(AccountingExpensereportStatus.PAID)
                    .taxAmount(0d)
                    .totalAmount(908.46)
                    .updatedAt(OffsetDateTime.parse("2021-04-19T18:07:58.454Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingExpensereportResponse res = sdk.expensereport().createAccountingExpensereport()
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

        GetAccountingExpensereportResponse res = sdk.expensereport().getAccountingExpensereport()
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

        ListAccountingExpensereportsResponse res = sdk.expensereport().listAccountingExpensereports()
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
                    .approvedAt(OffsetDateTime.parse("2021-04-19T18:07:58.459Z"))
                    .attachments(List.of())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .currency("GBP")
                    .externalNumber("ER-31240")
                    .id("031e49e3-0ea4-46b7-8f05-d06b571ed3a1")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("818f9043-f32e-4515-8816-9ef6d6b6b38f")
                            .itemName("Conference ticket")
                            .taxAmount(0d)
                            .totalAmount(39.9)
                            .unitAmount(39.9)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("e354da47-1415-437d-a863-8c6d6be2b669")
                            .itemName("Flight")
                            .notes("Soluta omnis dolor.")
                            .taxAmount(0d)
                            .totalAmount(193.17)
                            .unitAmount(193.17)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("40dc8c51-8a1f-44ac-990c-92b41ce4374c")
                            .itemName("Client dinner")
                            .notes("Altus caveo capio.")
                            .taxAmount(0d)
                            .totalAmount(230.12)
                            .unitAmount(230.12)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("f8cf29c4-53ed-408e-8b0b-a0a3ce30df0e")
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
                    .reimbursedAt(OffsetDateTime.parse("2021-04-19T18:07:58.459Z"))
                    .status(AccountingExpensereportStatus.PAID)
                    .taxAmount(0d)
                    .totalAmount(908.46)
                    .updatedAt(OffsetDateTime.parse("2021-04-19T18:07:58.459Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingExpensereportResponse res = sdk.expensereport().patchAccountingExpensereport()
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

        RemoveAccountingExpensereportResponse res = sdk.expensereport().removeAccountingExpensereport()
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
                    .approvedAt(OffsetDateTime.parse("2021-04-19T18:07:58.459Z"))
                    .attachments(List.of())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .currency("GBP")
                    .externalNumber("ER-31240")
                    .id("031e49e3-0ea4-46b7-8f05-d06b571ed3a1")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("818f9043-f32e-4515-8816-9ef6d6b6b38f")
                            .itemName("Conference ticket")
                            .taxAmount(0d)
                            .totalAmount(39.9)
                            .unitAmount(39.9)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("e354da47-1415-437d-a863-8c6d6be2b669")
                            .itemName("Flight")
                            .notes("Soluta omnis dolor.")
                            .taxAmount(0d)
                            .totalAmount(193.17)
                            .unitAmount(193.17)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("40dc8c51-8a1f-44ac-990c-92b41ce4374c")
                            .itemName("Client dinner")
                            .notes("Altus caveo capio.")
                            .taxAmount(0d)
                            .totalAmount(230.12)
                            .unitAmount(230.12)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("f8cf29c4-53ed-408e-8b0b-a0a3ce30df0e")
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
                    .reimbursedAt(OffsetDateTime.parse("2021-04-19T18:07:58.459Z"))
                    .status(AccountingExpensereportStatus.PAID)
                    .taxAmount(0d)
                    .totalAmount(908.46)
                    .updatedAt(OffsetDateTime.parse("2021-04-19T18:07:58.459Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingExpensereportResponse res = sdk.expensereport().updateAccountingExpensereport()
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