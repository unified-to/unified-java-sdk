# Tracking

## Overview

### Available Operations

* [createShippingTracking](#createshippingtracking) - Create a tracking
* [getShippingTracking](#getshippingtracking) - Retrieve a tracking
* [listShippingTrackings](#listshippingtrackings) - List all trackings

## createShippingTracking

Create a tracking

### Example Usage

<!-- UsageSnippet language="java" operationID="createShippingTracking" method="post" path="/shipping/{connection_id}/tracking" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateShippingTrackingRequest;
import to.unified.unified_java_sdk.models.operations.CreateShippingTrackingResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.ShippingTracking;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateShippingTrackingRequest req = CreateShippingTrackingRequest.builder()
                .shippingTracking(ShippingTracking.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateShippingTrackingResponse res = sdk.tracking().createShippingTracking()
                .request(req)
                .call();

        if (res.shippingTracking().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateShippingTrackingRequest](../../models/operations/CreateShippingTrackingRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateShippingTrackingResponse](../../models/operations/CreateShippingTrackingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getShippingTracking

Retrieve a tracking

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
            // handle response
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

List all trackings

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
            // handle response
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