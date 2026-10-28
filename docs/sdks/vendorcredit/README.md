# Vendorcredit

## Overview

### Available Operations

* [createAccountingVendorcredit](#createaccountingvendorcredit) - Create a vendorcredit
* [getAccountingVendorcredit](#getaccountingvendorcredit) - Retrieve a vendorcredit
* [listAccountingVendorcredits](#listaccountingvendorcredits) - List all vendorcredits
* [patchAccountingVendorcredit](#patchaccountingvendorcredit) - Update a vendorcredit
* [removeAccountingVendorcredit](#removeaccountingvendorcredit) - Remove a vendorcredit
* [updateAccountingVendorcredit](#updateaccountingvendorcredit) - Update a vendorcredit

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
                    .id("54b2d908-5ff4-4ef7-ab8a-be7d724ef7cd")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Volup conatus cruciamentum decor avaritia.")
                    .postedAt(OffsetDateTime.parse("2023-04-15T21:14:08.197Z"))
                    .status(AccountingVendorcreditStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-10-04T00:04:24.946Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingVendorcreditResponse res = sdk.vendorcredit().createAccountingVendorcredit()
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

        GetAccountingVendorcreditResponse res = sdk.vendorcredit().getAccountingVendorcredit()
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

        ListAccountingVendorcreditsResponse res = sdk.vendorcredit().listAccountingVendorcredits()
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
                    .id("c5093983-8d7d-43b8-b982-2a2c2536dc07")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Volup conatus cruciamentum decor avaritia.")
                    .postedAt(OffsetDateTime.parse("2023-04-15T21:14:08.197Z"))
                    .status(AccountingVendorcreditStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-10-04T00:04:24.952Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingVendorcreditResponse res = sdk.vendorcredit().patchAccountingVendorcredit()
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

        RemoveAccountingVendorcreditResponse res = sdk.vendorcredit().removeAccountingVendorcredit()
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
                    .id("c5093983-8d7d-43b8-b982-2a2c2536dc07")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Volup conatus cruciamentum decor avaritia.")
                    .postedAt(OffsetDateTime.parse("2023-04-15T21:14:08.197Z"))
                    .status(AccountingVendorcreditStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-10-04T00:04:24.952Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingVendorcreditResponse res = sdk.vendorcredit().updateAccountingVendorcredit()
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