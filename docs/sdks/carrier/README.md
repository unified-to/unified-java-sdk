# Carrier

## Overview

### Available Operations

* [getShippingCarrier](#getshippingcarrier) - Retrieve a carrier
* [listShippingCarriers](#listshippingcarriers) - List all carriers

## getShippingCarrier

Retrieves a single ShippingCarrier by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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
            System.out.println(res.shippingCarrier().get());
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

Returns a list of ShippingCarriers. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
            System.out.println(res.shippingCarriers().get());
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