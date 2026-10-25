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

Creates a HrisEarning. Provide the unified HrisEarning fields in the request body; they are mapped to the provider's API. Returns the created HrisEarning.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisEarning" method="post" path="/hris/{connection_id}/earning" example="hris_earning" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .currency("USD")
                    .frequency(HrisEarningFrequency.SEMIMONTHLY)
                    .id("5d0eae50-ce1b-4ea6-a5b7-ef3fafeb8211")
                    .metadata(List.of())
                    .notes("Deporto truculenter vinum beatae.")
                    .startAt(OffsetDateTime.parse("2022-07-27T05:41:10.861Z"))
                    .status(HrisEarningStatus.ENDED)
                    .updatedAt(OffsetDateTime.parse("2020-02-09T08:57:47.783Z"))
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

Retrieves a single HrisEarning by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Returns a list of HrisEarnings. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Updates the HrisEarning identified by `id`. Provide the unified HrisEarning fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisEarning" method="patch" path="/hris/{connection_id}/earning/{id}" example="hris_earning" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .currency("USD")
                    .frequency(HrisEarningFrequency.SEMIMONTHLY)
                    .id("42df7af8-85f7-45c7-859c-3be964808dc9")
                    .metadata(List.of())
                    .notes("Deporto truculenter vinum beatae.")
                    .startAt(OffsetDateTime.parse("2022-07-27T05:41:10.866Z"))
                    .status(HrisEarningStatus.ENDED)
                    .updatedAt(OffsetDateTime.parse("2020-02-09T08:57:47.785Z"))
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

Deletes the HrisEarning identified by `id`.

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

Updates the HrisEarning identified by `id`. Provide the unified HrisEarning fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisEarning" method="put" path="/hris/{connection_id}/earning/{id}" example="hris_earning" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .currency("USD")
                    .frequency(HrisEarningFrequency.SEMIMONTHLY)
                    .id("42df7af8-85f7-45c7-859c-3be964808dc9")
                    .metadata(List.of())
                    .notes("Deporto truculenter vinum beatae.")
                    .startAt(OffsetDateTime.parse("2022-07-27T05:41:10.866Z"))
                    .status(HrisEarningStatus.ENDED)
                    .updatedAt(OffsetDateTime.parse("2020-02-09T08:57:47.785Z"))
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