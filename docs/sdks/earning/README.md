# Earning

## Overview

### Available Operations

* [createHrisEarning](#createhrisearning) - Create an earning
* [getHrisEarning](#gethrisearning) - Retrieve an earning
* [listHrisEarnings](#listhrisearnings) - List all earnings
* [patchHrisEarning](#patchhrisearning) - Update an earning
* [removeHrisEarning](#removehrisearning) - Remove an earning
* [updateHrisEarning](#updatehrisearning) - Update an earning

## createHrisEarning

Create an earning

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisEarning" method="post" path="/hris/{connection_id}/earning" example="hris_earning" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisEarningRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisEarningResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisEarningRequest req = CreateHrisEarningRequest.builder()
                .hrisEarning(HrisEarning.builder()
                    .amount(4026d)
                    .createdAt(OffsetDateTime.parse("2019-01-26T12:44:52.326Z"))
                    .currency("PKR")
                    .frequency(HrisEarningFrequency.BIWEEKLY)
                    .id("0e597460-d93d-4c94-a4f5-8b113a9e47db")
                    .notes("Truculenter vinum beatae.")
                    .startAt(OffsetDateTime.parse("2022-07-20T23:26:45.466Z"))
                    .status(HrisEarningStatus.PROCESSED)
                    .updatedAt(OffsetDateTime.parse("2020-02-07T12:25:00.115Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisEarningResponse res = sdk.earning().createHrisEarning()
                .request(req)
                .call();

        if (res.hrisEarning().isPresent()) {
            System.out.println(res.hrisEarning().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateHrisEarningRequest](../../models/operations/CreateHrisEarningRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateHrisEarningResponse](../../models/operations/CreateHrisEarningResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisEarning

Retrieve an earning

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisEarning" method="get" path="/hris/{connection_id}/earning/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisEarningRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisEarningResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisEarningRequest req = GetHrisEarningRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisEarningResponse res = sdk.earning().getHrisEarning()
                .request(req)
                .call();

        if (res.hrisEarning().isPresent()) {
            System.out.println(res.hrisEarning().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHrisEarningRequest](../../models/operations/GetHrisEarningRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHrisEarningResponse](../../models/operations/GetHrisEarningResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisEarnings

List all earnings

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisEarnings" method="get" path="/hris/{connection_id}/earning" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisEarningsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisEarningsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisEarningsRequest req = ListHrisEarningsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisEarningsResponse res = sdk.earning().listHrisEarnings()
                .request(req)
                .call();

        if (res.hrisEarnings().isPresent()) {
            System.out.println(res.hrisEarnings().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListHrisEarningsRequest](../../models/operations/ListHrisEarningsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListHrisEarningsResponse](../../models/operations/ListHrisEarningsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisEarning

Update an earning

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisEarning" method="patch" path="/hris/{connection_id}/earning/{id}" example="hris_earning" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisEarningRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisEarningResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisEarningRequest req = PatchHrisEarningRequest.builder()
                .hrisEarning(HrisEarning.builder()
                    .amount(4026d)
                    .createdAt(OffsetDateTime.parse("2019-01-26T12:44:52.326Z"))
                    .currency("PKR")
                    .frequency(HrisEarningFrequency.BIWEEKLY)
                    .id("e984a056-9298-45ea-9ffa-6479de095a1c")
                    .notes("Truculenter vinum beatae.")
                    .startAt(OffsetDateTime.parse("2022-07-20T23:26:45.470Z"))
                    .status(HrisEarningStatus.PROCESSED)
                    .updatedAt(OffsetDateTime.parse("2020-02-07T12:25:00.116Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisEarningResponse res = sdk.earning().patchHrisEarning()
                .request(req)
                .call();

        if (res.hrisEarning().isPresent()) {
            System.out.println(res.hrisEarning().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchHrisEarningRequest](../../models/operations/PatchHrisEarningRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchHrisEarningResponse](../../models/operations/PatchHrisEarningResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisEarning

Remove an earning

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisEarning" method="delete" path="/hris/{connection_id}/earning/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisEarningRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisEarningResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisEarningRequest req = RemoveHrisEarningRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisEarningResponse res = sdk.earning().removeHrisEarning()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveHrisEarningRequest](../../models/operations/RemoveHrisEarningRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveHrisEarningResponse](../../models/operations/RemoveHrisEarningResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisEarning

Update an earning

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisEarning" method="put" path="/hris/{connection_id}/earning/{id}" example="hris_earning" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisEarningRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisEarningResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisEarningRequest req = UpdateHrisEarningRequest.builder()
                .hrisEarning(HrisEarning.builder()
                    .amount(4026d)
                    .createdAt(OffsetDateTime.parse("2019-01-26T12:44:52.326Z"))
                    .currency("PKR")
                    .frequency(HrisEarningFrequency.BIWEEKLY)
                    .id("e984a056-9298-45ea-9ffa-6479de095a1c")
                    .notes("Truculenter vinum beatae.")
                    .startAt(OffsetDateTime.parse("2022-07-20T23:26:45.470Z"))
                    .status(HrisEarningStatus.PROCESSED)
                    .updatedAt(OffsetDateTime.parse("2020-02-07T12:25:00.116Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisEarningResponse res = sdk.earning().updateHrisEarning()
                .request(req)
                .call();

        if (res.hrisEarning().isPresent()) {
            System.out.println(res.hrisEarning().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateHrisEarningRequest](../../models/operations/UpdateHrisEarningRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateHrisEarningResponse](../../models/operations/UpdateHrisEarningResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |