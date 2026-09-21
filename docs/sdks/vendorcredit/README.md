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

Create a vendorcredit

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
                    .applyAmount(1d)
                    .balanceAmount(0d)
                    .createdAt(OffsetDateTime.parse("2023-04-15T21:14:08.197Z"))
                    .currency("KGS")
                    .dueAt(OffsetDateTime.parse("2023-05-06T20:38:46.775Z"))
                    .id("b338c9bb-4b83-4be5-9fbc-b6460c8258a0")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Conatus cruciamentum decor avaritia tantum.")
                    .postedAt(OffsetDateTime.parse("2023-09-29T02:22:24.982Z"))
                    .status(AccountingVendorcreditStatus.SUBMITTED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-11-27T03:40:07.005Z"))
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

Retrieve a vendorcredit

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

List all vendorcredits

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

Update a vendorcredit

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
                    .applyAmount(1d)
                    .balanceAmount(0d)
                    .createdAt(OffsetDateTime.parse("2023-04-15T21:14:08.197Z"))
                    .currency("KGS")
                    .dueAt(OffsetDateTime.parse("2023-05-06T20:38:46.775Z"))
                    .id("f037c8ee-fc51-466e-b5c7-85bfcaec147f")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Conatus cruciamentum decor avaritia tantum.")
                    .postedAt(OffsetDateTime.parse("2023-09-29T02:22:24.987Z"))
                    .status(AccountingVendorcreditStatus.SUBMITTED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-11-27T03:40:07.012Z"))
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

Remove a vendorcredit

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

Update a vendorcredit

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
                    .applyAmount(1d)
                    .balanceAmount(0d)
                    .createdAt(OffsetDateTime.parse("2023-04-15T21:14:08.197Z"))
                    .currency("KGS")
                    .dueAt(OffsetDateTime.parse("2023-05-06T20:38:46.775Z"))
                    .id("f037c8ee-fc51-466e-b5c7-85bfcaec147f")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Conatus cruciamentum decor avaritia tantum.")
                    .postedAt(OffsetDateTime.parse("2023-09-29T02:22:24.987Z"))
                    .status(AccountingVendorcreditStatus.SUBMITTED)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2023-11-27T03:40:07.012Z"))
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