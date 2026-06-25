# Tracking

## Overview

### Available Operations

* [getShippingTracking2](#getshippingtracking2) - Retrieve a tracking
* [listShippingTrackings2](#listshippingtrackings2) - List all trackings

## getShippingTracking2

Retrieve a tracking

### Example Usage

<!-- UsageSnippet language="java" operationID="getShippingTracking2" method="get" path="/shipping/{connection_id}/tracking/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetShippingTracking2Request;
import to.unified.unified_java_sdk.models.operations.GetShippingTracking2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetShippingTracking2Request req = GetShippingTracking2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetShippingTracking2Response res = sdk.tracking().getShippingTracking2()
                .request(req)
                .call();

        if (res.shippingTracking().isPresent()) {
            System.out.println(res.shippingTracking().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetShippingTracking2Request](../../models/operations/GetShippingTracking2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetShippingTracking2Response](../../models/operations/GetShippingTracking2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listShippingTrackings2

List all trackings

### Example Usage

<!-- UsageSnippet language="java" operationID="listShippingTrackings2" method="get" path="/shipping/{connection_id}/tracking" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListShippingTrackings2Request;
import to.unified.unified_java_sdk.models.operations.ListShippingTrackings2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListShippingTrackings2Request req = ListShippingTrackings2Request.builder()
                .connectionId("<id>")
                .build();

        ListShippingTrackings2Response res = sdk.tracking().listShippingTrackings2()
                .request(req)
                .call();

        if (res.shippingTrackings().isPresent()) {
            System.out.println(res.shippingTrackings().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListShippingTrackings2Request](../../models/operations/ListShippingTrackings2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListShippingTrackings2Response](../../models/operations/ListShippingTrackings2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |