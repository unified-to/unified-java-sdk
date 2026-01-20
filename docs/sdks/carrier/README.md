# Carrier

## Overview

### Available Operations

* [getShippingCarrier](#getshippingcarrier) - Retrieve a carrier
* [listShippingCarriers](#listshippingcarriers) - List all carriers

## getShippingCarrier

Retrieve a carrier

### Example Usage

<!-- UsageSnippet language="java" operationID="getShippingCarrier" method="get" path="/shipping/{connection_id}/carrier/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetShippingCarrierRequest;
import to.unified.unified_java_sdk.models.operations.GetShippingCarrierResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetShippingCarrierRequest req = GetShippingCarrierRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetShippingCarrierResponse res = sdk.carrier().getShippingCarrier()
                .request(req)
                .call();

        if (res.shippingCarrier().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetShippingCarrierRequest](../../models/operations/GetShippingCarrierRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetShippingCarrierResponse](../../models/operations/GetShippingCarrierResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listShippingCarriers

List all carriers

### Example Usage

<!-- UsageSnippet language="java" operationID="listShippingCarriers" method="get" path="/shipping/{connection_id}/carrier" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListShippingCarriersRequest;
import to.unified.unified_java_sdk.models.operations.ListShippingCarriersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListShippingCarriersRequest req = ListShippingCarriersRequest.builder()
                .connectionId("<id>")
                .build();

        ListShippingCarriersResponse res = sdk.carrier().listShippingCarriers()
                .request(req)
                .call();

        if (res.shippingCarriers().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListShippingCarriersRequest](../../models/operations/ListShippingCarriersRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListShippingCarriersResponse](../../models/operations/ListShippingCarriersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |