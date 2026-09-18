# Taxrate

## Overview

### Available Operations

* [createAccountingTaxrate](#createaccountingtaxrate) - Create a taxrate
* [getAccountingTaxrate](#getaccountingtaxrate) - Retrieve a taxrate
* [listAccountingTaxrates](#listaccountingtaxrates) - List all taxrates
* [patchAccountingTaxrate](#patchaccountingtaxrate) - Update a taxrate
* [removeAccountingTaxrate](#removeaccountingtaxrate) - Remove a taxrate
* [updateAccountingTaxrate](#updateaccountingtaxrate) - Update a taxrate

## createAccountingTaxrate

Create a taxrate

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
import to.unified.unified_java_sdk.models.shared.AccountingTaxrate;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingTaxrateRequest req = CreateAccountingTaxrateRequest.builder()
                .accountingTaxrate(AccountingTaxrate.builder()
                    .createdAt(OffsetDateTime.parse("2020-01-04T10:37:56.894Z"))
                    .description("Nemo atrox tricesimus creator aranea.")
                    .id("4e784882-93ea-4586-bc43-026743ba6449")
                    .isActive(false)
                    .metadata(List.of())
                    .name("cogo")
                    .rate(1d)
                    .updatedAt(OffsetDateTime.parse("2025-11-04T07:54:19.715Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingTaxrateResponse res = sdk.taxrate().createAccountingTaxrate()
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

## getAccountingTaxrate

Retrieve a taxrate

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

        GetAccountingTaxrateResponse res = sdk.taxrate().getAccountingTaxrate()
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

## listAccountingTaxrates

List all taxrates

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

        ListAccountingTaxratesResponse res = sdk.taxrate().listAccountingTaxrates()
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

## patchAccountingTaxrate

Update a taxrate

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
import to.unified.unified_java_sdk.models.shared.AccountingTaxrate;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingTaxrateRequest req = PatchAccountingTaxrateRequest.builder()
                .accountingTaxrate(AccountingTaxrate.builder()
                    .createdAt(OffsetDateTime.parse("2020-01-04T10:37:56.894Z"))
                    .description("Nemo atrox tricesimus creator aranea.")
                    .id("3a12088f-0124-4720-a4fc-8205f0fb1a05")
                    .isActive(false)
                    .metadata(List.of())
                    .name("cogo")
                    .rate(1d)
                    .updatedAt(OffsetDateTime.parse("2025-11-04T07:54:19.725Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingTaxrateResponse res = sdk.taxrate().patchAccountingTaxrate()
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

## removeAccountingTaxrate

Remove a taxrate

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

        RemoveAccountingTaxrateResponse res = sdk.taxrate().removeAccountingTaxrate()
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

## updateAccountingTaxrate

Update a taxrate

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
import to.unified.unified_java_sdk.models.shared.AccountingTaxrate;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingTaxrateRequest req = UpdateAccountingTaxrateRequest.builder()
                .accountingTaxrate(AccountingTaxrate.builder()
                    .createdAt(OffsetDateTime.parse("2020-01-04T10:37:56.894Z"))
                    .description("Nemo atrox tricesimus creator aranea.")
                    .id("3a12088f-0124-4720-a4fc-8205f0fb1a05")
                    .isActive(false)
                    .metadata(List.of())
                    .name("cogo")
                    .rate(1d)
                    .updatedAt(OffsetDateTime.parse("2025-11-04T07:54:19.725Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingTaxrateResponse res = sdk.taxrate().updateAccountingTaxrate()
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