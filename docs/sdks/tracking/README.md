# Tracking

## Overview

### Available Operations

* [getShippingTracking](#getshippingtracking) - Retrieve a tracking
* [listShippingTrackings](#listshippingtrackings) - List all trackings

## getShippingTracking

Retrieves a single ShippingTracking by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getShippingTracking" method="get" path="/shipping/{connection_id}/tracking/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetShippingTrackingRequest;
import to.unified.unified_java_sdk.models.operations.GetShippingTrackingResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetShippingTrackingRequest req = GetShippingTrackingRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetShippingTrackingResponse res = sdk.tracking().getShippingTracking()
                .request(req)
                .call();

        if (res.shippingTracking().isPresent()) {
            System.out.println(res.shippingTracking().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetShippingTrackingRequest](../../models/operations/GetShippingTrackingRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetShippingTrackingResponse](../../models/operations/GetShippingTrackingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listShippingTrackings

Returns a list of ShippingTrackings. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listShippingTrackings" method="get" path="/shipping/{connection_id}/tracking" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListShippingTrackingsRequest;
import to.unified.unified_java_sdk.models.operations.ListShippingTrackingsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListShippingTrackingsRequest req = ListShippingTrackingsRequest.builder()
                .connectionId("<id>")
                .build();

        ListShippingTrackingsResponse res = sdk.tracking().listShippingTrackings()
                .request(req)
                .call();

        if (res.shippingTrackings().isPresent()) {
            System.out.println(res.shippingTrackings().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListShippingTrackingsRequest](../../models/operations/ListShippingTrackingsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListShippingTrackingsResponse](../../models/operations/ListShippingTrackingsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |