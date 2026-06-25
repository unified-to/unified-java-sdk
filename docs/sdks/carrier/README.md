# Carrier

## Overview

### Available Operations

* [getShippingCarrier2](#getshippingcarrier2) - Retrieve a carrier
* [listShippingCarriers2](#listshippingcarriers2) - List all carriers

## getShippingCarrier2

Retrieve a carrier

### Example Usage

<!-- UsageSnippet language="java" operationID="getShippingCarrier2" method="get" path="/shipping/{connection_id}/carrier/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetShippingCarrier2Request;
import to.unified.unified_java_sdk.models.operations.GetShippingCarrier2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetShippingCarrier2Request req = GetShippingCarrier2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetShippingCarrier2Response res = sdk.carrier().getShippingCarrier2()
                .request(req)
                .call();

        if (res.shippingCarrier().isPresent()) {
            System.out.println(res.shippingCarrier().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetShippingCarrier2Request](../../models/operations/GetShippingCarrier2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetShippingCarrier2Response](../../models/operations/GetShippingCarrier2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listShippingCarriers2

List all carriers

### Example Usage

<!-- UsageSnippet language="java" operationID="listShippingCarriers2" method="get" path="/shipping/{connection_id}/carrier" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListShippingCarriers2Request;
import to.unified.unified_java_sdk.models.operations.ListShippingCarriers2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListShippingCarriers2Request req = ListShippingCarriers2Request.builder()
                .connectionId("<id>")
                .build();

        ListShippingCarriers2Response res = sdk.carrier().listShippingCarriers2()
                .request(req)
                .call();

        if (res.shippingCarriers().isPresent()) {
            System.out.println(res.shippingCarriers().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListShippingCarriers2Request](../../models/operations/ListShippingCarriers2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListShippingCarriers2Response](../../models/operations/ListShippingCarriers2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |