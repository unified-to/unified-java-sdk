# Region

## Overview

### Available Operations

* [getComputeRegion](#getcomputeregion) - Retrieve a region
* [listComputeRegions](#listcomputeregions) - List all regions

## getComputeRegion

Retrieves a single ComputeRegion by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeRegion" method="get" path="/compute/{connection_id}/region/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeRegionRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeRegionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeRegionRequest req = GetComputeRegionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeRegionResponse res = sdk.region().getComputeRegion()
                .request(req)
                .call();

        if (res.computeRegion().isPresent()) {
            System.out.println(res.computeRegion().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetComputeRegionRequest](../../models/operations/GetComputeRegionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetComputeRegionResponse](../../models/operations/GetComputeRegionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeRegions

Returns a list of ComputeRegions. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeRegions" method="get" path="/compute/{connection_id}/region" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeRegionsRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeRegionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeRegionsRequest req = ListComputeRegionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeRegionsResponse res = sdk.region().listComputeRegions()
                .request(req)
                .call();

        if (res.computeRegions().isPresent()) {
            System.out.println(res.computeRegions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListComputeRegionsRequest](../../models/operations/ListComputeRegionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListComputeRegionsResponse](../../models/operations/ListComputeRegionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |