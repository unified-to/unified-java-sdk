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
                    .approvedAt(OffsetDateTime.parse("2021-04-22T19:26:41.245Z"))
                    .attachments(List.of())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .currency("GBP")
                    .externalNumber("ER-31240")
                    .id("8164f725-3e3f-41f3-8724-a1bc14e2b590")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("239c423b-8a6d-4aec-adac-ffab89a075b8")
                            .itemName("Conference ticket")
                            .taxAmount(0d)
                            .totalAmount(39.9)
                            .unitAmount(39.9)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("80725e6d-754c-4e0b-999a-ac5189026502")
                            .itemName("Flight")
                            .notes("Soluta omnis dolor.")
                            .taxAmount(0d)
                            .totalAmount(193.17)
                            .unitAmount(193.17)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("6ed5d1a6-4390-41fc-a34a-486551386ce4")
                            .itemName("Client dinner")
                            .notes("Altus caveo capio.")
                            .taxAmount(0d)
                            .totalAmount(230.12)
                            .unitAmount(230.12)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("5a268a80-c3c7-4926-9121-7ece8f9fc481")
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
                    .reimbursedAt(OffsetDateTime.parse("2021-04-22T19:26:41.245Z"))
                    .status(AccountingExpensereportStatus.PAID)
                    .taxAmount(0d)
                    .totalAmount(908.46)
                    .updatedAt(OffsetDateTime.parse("2021-04-22T19:26:41.245Z"))
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
                    .approvedAt(OffsetDateTime.parse("2021-04-22T19:26:41.250Z"))
                    .attachments(List.of())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .currency("GBP")
                    .externalNumber("ER-31240")
                    .id("bb519410-7be5-44cb-8901-559514269be3")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("a2d2dd64-eda8-42a1-9c6e-95213bacfc0f")
                            .itemName("Conference ticket")
                            .taxAmount(0d)
                            .totalAmount(39.9)
                            .unitAmount(39.9)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("195d07ad-0ace-47bb-94d0-187fcc129110")
                            .itemName("Flight")
                            .notes("Soluta omnis dolor.")
                            .taxAmount(0d)
                            .totalAmount(193.17)
                            .unitAmount(193.17)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("9ccf312f-8b8d-4ec3-8a7b-7002c28b6bf5")
                            .itemName("Client dinner")
                            .notes("Altus caveo capio.")
                            .taxAmount(0d)
                            .totalAmount(230.12)
                            .unitAmount(230.12)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("59924af3-5e2b-489b-93ec-3ce255c67f31")
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
                    .reimbursedAt(OffsetDateTime.parse("2021-04-22T19:26:41.250Z"))
                    .status(AccountingExpensereportStatus.PAID)
                    .taxAmount(0d)
                    .totalAmount(908.46)
                    .updatedAt(OffsetDateTime.parse("2021-04-22T19:26:41.250Z"))
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
                    .approvedAt(OffsetDateTime.parse("2021-04-22T19:26:41.250Z"))
                    .attachments(List.of())
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-05-29T02:04:59.078Z"))
                    .currency("GBP")
                    .externalNumber("ER-31240")
                    .id("bb519410-7be5-44cb-8901-559514269be3")
                    .lineitems(List.of(
                        AccountingLineitem.builder()
                            .id("a2d2dd64-eda8-42a1-9c6e-95213bacfc0f")
                            .itemName("Conference ticket")
                            .taxAmount(0d)
                            .totalAmount(39.9)
                            .unitAmount(39.9)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("195d07ad-0ace-47bb-94d0-187fcc129110")
                            .itemName("Flight")
                            .notes("Soluta omnis dolor.")
                            .taxAmount(0d)
                            .totalAmount(193.17)
                            .unitAmount(193.17)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("9ccf312f-8b8d-4ec3-8a7b-7002c28b6bf5")
                            .itemName("Client dinner")
                            .notes("Altus caveo capio.")
                            .taxAmount(0d)
                            .totalAmount(230.12)
                            .unitAmount(230.12)
                            .unitQuantity(1d)
                            .build(),
                        AccountingLineitem.builder()
                            .id("59924af3-5e2b-489b-93ec-3ce255c67f31")
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
                    .reimbursedAt(OffsetDateTime.parse("2021-04-22T19:26:41.250Z"))
                    .status(AccountingExpensereportStatus.PAID)
                    .taxAmount(0d)
                    .totalAmount(908.46)
                    .updatedAt(OffsetDateTime.parse("2021-04-22T19:26:41.250Z"))
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