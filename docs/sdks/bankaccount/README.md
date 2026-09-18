# Bankaccount

## Overview

### Available Operations

* [createHrisBankaccount](#createhrisbankaccount) - Create a bankaccount
* [getHrisBankaccount](#gethrisbankaccount) - Retrieve a bankaccount
* [listHrisBankaccounts](#listhrisbankaccounts) - List all bankaccounts
* [patchHrisBankaccount](#patchhrisbankaccount) - Update a bankaccount
* [removeHrisBankaccount](#removehrisbankaccount) - Remove a bankaccount
* [updateHrisBankaccount](#updatehrisbankaccount) - Update a bankaccount

## createHrisBankaccount

Create a bankaccount

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisBankaccount" method="post" path="/hris/{connection_id}/bankaccount" example="hris_bankaccount" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisBankaccountRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisBankaccountResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisBankaccountRequest req = CreateHrisBankaccountRequest.builder()
                .hrisBankaccount(HrisBankaccount.builder()
                    .accountNumber("****3777")
                    .accountNumberLast4("3777")
                    .accountType(HrisBankaccountAccountType.CHECKING)
                    .bankName("Huel Group")
                    .createdAt(OffsetDateTime.parse("2019-11-16T16:43:45.976Z"))
                    .id("0ba01940-59d2-4fcb-a5b2-8633146c7a07")
                    .isPrimary(false)
                    .name("Checking Account")
                    .routingNumber("448650724")
                    .updatedAt(OffsetDateTime.parse("2025-06-04T11:31:37.518Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisBankaccountResponse res = sdk.bankaccount().createHrisBankaccount()
                .request(req)
                .call();

        if (res.hrisBankaccount().isPresent()) {
            System.out.println(res.hrisBankaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateHrisBankaccountRequest](../../models/operations/CreateHrisBankaccountRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateHrisBankaccountResponse](../../models/operations/CreateHrisBankaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisBankaccount

Retrieve a bankaccount

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisBankaccount" method="get" path="/hris/{connection_id}/bankaccount/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisBankaccountRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisBankaccountResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisBankaccountRequest req = GetHrisBankaccountRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisBankaccountResponse res = sdk.bankaccount().getHrisBankaccount()
                .request(req)
                .call();

        if (res.hrisBankaccount().isPresent()) {
            System.out.println(res.hrisBankaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetHrisBankaccountRequest](../../models/operations/GetHrisBankaccountRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetHrisBankaccountResponse](../../models/operations/GetHrisBankaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisBankaccounts

List all bankaccounts

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisBankaccounts" method="get" path="/hris/{connection_id}/bankaccount" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisBankaccountsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisBankaccountsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisBankaccountsRequest req = ListHrisBankaccountsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisBankaccountsResponse res = sdk.bankaccount().listHrisBankaccounts()
                .request(req)
                .call();

        if (res.hrisBankaccounts().isPresent()) {
            System.out.println(res.hrisBankaccounts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListHrisBankaccountsRequest](../../models/operations/ListHrisBankaccountsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListHrisBankaccountsResponse](../../models/operations/ListHrisBankaccountsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisBankaccount

Update a bankaccount

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisBankaccount" method="patch" path="/hris/{connection_id}/bankaccount/{id}" example="hris_bankaccount" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisBankaccountRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisBankaccountResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisBankaccountRequest req = PatchHrisBankaccountRequest.builder()
                .hrisBankaccount(HrisBankaccount.builder()
                    .accountNumber("****3777")
                    .accountNumberLast4("3777")
                    .accountType(HrisBankaccountAccountType.CHECKING)
                    .bankName("Huel Group")
                    .createdAt(OffsetDateTime.parse("2019-11-16T16:43:45.976Z"))
                    .id("48efbe5b-f668-403e-9979-a07b0ec0a98a")
                    .isPrimary(false)
                    .name("Checking Account")
                    .routingNumber("448650724")
                    .updatedAt(OffsetDateTime.parse("2025-06-04T11:31:37.525Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisBankaccountResponse res = sdk.bankaccount().patchHrisBankaccount()
                .request(req)
                .call();

        if (res.hrisBankaccount().isPresent()) {
            System.out.println(res.hrisBankaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchHrisBankaccountRequest](../../models/operations/PatchHrisBankaccountRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchHrisBankaccountResponse](../../models/operations/PatchHrisBankaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisBankaccount

Remove a bankaccount

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisBankaccount" method="delete" path="/hris/{connection_id}/bankaccount/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBankaccountRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBankaccountResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisBankaccountRequest req = RemoveHrisBankaccountRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisBankaccountResponse res = sdk.bankaccount().removeHrisBankaccount()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveHrisBankaccountRequest](../../models/operations/RemoveHrisBankaccountRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveHrisBankaccountResponse](../../models/operations/RemoveHrisBankaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisBankaccount

Update a bankaccount

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisBankaccount" method="put" path="/hris/{connection_id}/bankaccount/{id}" example="hris_bankaccount" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBankaccountRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBankaccountResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisBankaccountRequest req = UpdateHrisBankaccountRequest.builder()
                .hrisBankaccount(HrisBankaccount.builder()
                    .accountNumber("****3777")
                    .accountNumberLast4("3777")
                    .accountType(HrisBankaccountAccountType.CHECKING)
                    .bankName("Huel Group")
                    .createdAt(OffsetDateTime.parse("2019-11-16T16:43:45.976Z"))
                    .id("48efbe5b-f668-403e-9979-a07b0ec0a98a")
                    .isPrimary(false)
                    .name("Checking Account")
                    .routingNumber("448650724")
                    .updatedAt(OffsetDateTime.parse("2025-06-04T11:31:37.525Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisBankaccountResponse res = sdk.bankaccount().updateHrisBankaccount()
                .request(req)
                .call();

        if (res.hrisBankaccount().isPresent()) {
            System.out.println(res.hrisBankaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateHrisBankaccountRequest](../../models/operations/UpdateHrisBankaccountRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateHrisBankaccountResponse](../../models/operations/UpdateHrisBankaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |