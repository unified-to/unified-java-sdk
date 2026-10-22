# Gputype

## Overview

### Available Operations

* [getComputeGputype](#getcomputegputype) - Retrieve a gputype
* [listComputeGputypes](#listcomputegputypes) - List all gputypes

## getComputeGputype

Retrieves a single ComputeGputype by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeGputype" method="get" path="/compute/{connection_id}/gputype/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeGputypeRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeGputypeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeGputypeRequest req = GetComputeGputypeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeGputypeResponse res = sdk.gputype().getComputeGputype()
                .request(req)
                .call();

        if (res.computeGputype().isPresent()) {
            System.out.println(res.computeGputype().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetComputeGputypeRequest](../../models/operations/GetComputeGputypeRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetComputeGputypeResponse](../../models/operations/GetComputeGputypeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeGputypes

Returns a list of ComputeGputypes. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeGputypes" method="get" path="/compute/{connection_id}/gputype" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeGputypesRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeGputypesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeGputypesRequest req = ListComputeGputypesRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeGputypesResponse res = sdk.gputype().listComputeGputypes()
                .request(req)
                .call();

        if (res.computeGputypes().isPresent()) {
            System.out.println(res.computeGputypes().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListComputeGputypesRequest](../../models/operations/ListComputeGputypesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListComputeGputypesResponse](../../models/operations/ListComputeGputypesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |