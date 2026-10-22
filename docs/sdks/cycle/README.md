# Cycle

## Overview

### Available Operations

* [getPerformanceCycle](#getperformancecycle) - Retrieve a cycle
* [listPerformanceCycles](#listperformancecycles) - List all cycles

## getPerformanceCycle

Retrieves a single PerformanceCycle by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPerformanceCycle" method="get" path="/performance/{connection_id}/cycle/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPerformanceCycleRequest;
import to.unified.unified_java_sdk.models.operations.GetPerformanceCycleResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPerformanceCycleRequest req = GetPerformanceCycleRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPerformanceCycleResponse res = sdk.cycle().getPerformanceCycle()
                .request(req)
                .call();

        if (res.performanceCycle().isPresent()) {
            System.out.println(res.performanceCycle().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetPerformanceCycleRequest](../../models/operations/GetPerformanceCycleRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetPerformanceCycleResponse](../../models/operations/GetPerformanceCycleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPerformanceCycles

Returns a list of PerformanceCycles. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPerformanceCycles" method="get" path="/performance/{connection_id}/cycle" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPerformanceCyclesRequest;
import to.unified.unified_java_sdk.models.operations.ListPerformanceCyclesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPerformanceCyclesRequest req = ListPerformanceCyclesRequest.builder()
                .connectionId("<id>")
                .build();

        ListPerformanceCyclesResponse res = sdk.cycle().listPerformanceCycles()
                .request(req)
                .call();

        if (res.performanceCycles().isPresent()) {
            System.out.println(res.performanceCycles().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListPerformanceCyclesRequest](../../models/operations/ListPerformanceCyclesRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListPerformanceCyclesResponse](../../models/operations/ListPerformanceCyclesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |