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