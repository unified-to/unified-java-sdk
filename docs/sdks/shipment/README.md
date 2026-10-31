# Shipment

## Overview

### Available Operations

* [createShippingShipment](#createshippingshipment) - Create a shipment
* [getShippingShipment](#getshippingshipment) - Retrieve a shipment
* [listShippingShipments](#listshippingshipments) - List all shipments
* [patchShippingShipment](#patchshippingshipment) - Update a shipment
* [removeShippingShipment](#removeshippingshipment) - Remove a shipment
* [updateShippingShipment](#updateshippingshipment) - Update a shipment

## createShippingShipment

Creates a ShippingShipment. Provide the unified ShippingShipment fields in the request body; they are mapped to the provider's API. Returns the created ShippingShipment.

### Example Usage

<!-- UsageSnippet language="java" operationID="createShippingShipment" method="post" path="/shipping/{connection_id}/shipment" example="shipping_shipment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateShippingShipmentRequest;
import to.unified.unified_java_sdk.models.operations.CreateShippingShipmentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateShippingShipmentRequest req = CreateShippingShipmentRequest.builder()
                .shippingShipment(ShippingShipment.builder()
                    .createdAt(OffsetDateTime.parse("2022-09-12T03:11:28.960Z"))
                    .id("e44207f3-1dd8-4f59-a8ec-346ffbe5f7e7")
                    .isReturn(false)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .rateCurrency("USD")
                    .rateEstimatedDays(4d)
                    .rateServiceName("2nd Day Air")
                    .serviceCode("OVERNIGHT")
                    .shippedAt(OffsetDateTime.parse("2022-09-12T07:26:48.479Z"))
                    .status(ShippingShipmentStatus.DELIVERED)
                    .updatedAt(OffsetDateTime.parse("2022-11-15T16:56:06.088Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateShippingShipmentResponse res = sdk.shipment().createShippingShipment()
                .request(req)
                .call();

        if (res.shippingShipment().isPresent()) {
            System.out.println(res.shippingShipment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateShippingShipmentRequest](../../models/operations/CreateShippingShipmentRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateShippingShipmentResponse](../../models/operations/CreateShippingShipmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getShippingShipment

Retrieves a single ShippingShipment by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getShippingShipment" method="get" path="/shipping/{connection_id}/shipment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetShippingShipmentRequest;
import to.unified.unified_java_sdk.models.operations.GetShippingShipmentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetShippingShipmentRequest req = GetShippingShipmentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetShippingShipmentResponse res = sdk.shipment().getShippingShipment()
                .request(req)
                .call();

        if (res.shippingShipment().isPresent()) {
            System.out.println(res.shippingShipment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetShippingShipmentRequest](../../models/operations/GetShippingShipmentRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetShippingShipmentResponse](../../models/operations/GetShippingShipmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listShippingShipments

Returns a list of ShippingShipments. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listShippingShipments" method="get" path="/shipping/{connection_id}/shipment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListShippingShipmentsRequest;
import to.unified.unified_java_sdk.models.operations.ListShippingShipmentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListShippingShipmentsRequest req = ListShippingShipmentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListShippingShipmentsResponse res = sdk.shipment().listShippingShipments()
                .request(req)
                .call();

        if (res.shippingShipments().isPresent()) {
            System.out.println(res.shippingShipments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListShippingShipmentsRequest](../../models/operations/ListShippingShipmentsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListShippingShipmentsResponse](../../models/operations/ListShippingShipmentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchShippingShipment

Updates the ShippingShipment identified by `id`. Provide the unified ShippingShipment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchShippingShipment" method="patch" path="/shipping/{connection_id}/shipment/{id}" example="shipping_shipment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchShippingShipmentRequest;
import to.unified.unified_java_sdk.models.operations.PatchShippingShipmentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchShippingShipmentRequest req = PatchShippingShipmentRequest.builder()
                .shippingShipment(ShippingShipment.builder()
                    .createdAt(OffsetDateTime.parse("2022-09-12T03:11:28.960Z"))
                    .id("c6c61c42-88a3-4717-a7ad-7c262fde2272")
                    .isReturn(false)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .rateCurrency("USD")
                    .rateEstimatedDays(4d)
                    .rateServiceName("2nd Day Air")
                    .serviceCode("OVERNIGHT")
                    .shippedAt(OffsetDateTime.parse("2022-09-12T07:26:48.479Z"))
                    .status(ShippingShipmentStatus.DELIVERED)
                    .updatedAt(OffsetDateTime.parse("2022-11-15T16:56:06.091Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchShippingShipmentResponse res = sdk.shipment().patchShippingShipment()
                .request(req)
                .call();

        if (res.shippingShipment().isPresent()) {
            System.out.println(res.shippingShipment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchShippingShipmentRequest](../../models/operations/PatchShippingShipmentRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchShippingShipmentResponse](../../models/operations/PatchShippingShipmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeShippingShipment

Deletes the ShippingShipment identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeShippingShipment" method="delete" path="/shipping/{connection_id}/shipment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveShippingShipmentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveShippingShipmentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveShippingShipmentRequest req = RemoveShippingShipmentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveShippingShipmentResponse res = sdk.shipment().removeShippingShipment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveShippingShipmentRequest](../../models/operations/RemoveShippingShipmentRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveShippingShipmentResponse](../../models/operations/RemoveShippingShipmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateShippingShipment

Updates the ShippingShipment identified by `id`. Provide the unified ShippingShipment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateShippingShipment" method="put" path="/shipping/{connection_id}/shipment/{id}" example="shipping_shipment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateShippingShipmentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateShippingShipmentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateShippingShipmentRequest req = UpdateShippingShipmentRequest.builder()
                .shippingShipment(ShippingShipment.builder()
                    .createdAt(OffsetDateTime.parse("2022-09-12T03:11:28.960Z"))
                    .id("c6c61c42-88a3-4717-a7ad-7c262fde2272")
                    .isReturn(false)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .rateCurrency("USD")
                    .rateEstimatedDays(4d)
                    .rateServiceName("2nd Day Air")
                    .serviceCode("OVERNIGHT")
                    .shippedAt(OffsetDateTime.parse("2022-09-12T07:26:48.479Z"))
                    .status(ShippingShipmentStatus.DELIVERED)
                    .updatedAt(OffsetDateTime.parse("2022-11-15T16:56:06.091Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateShippingShipmentResponse res = sdk.shipment().updateShippingShipment()
                .request(req)
                .call();

        if (res.shippingShipment().isPresent()) {
            System.out.println(res.shippingShipment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateShippingShipmentRequest](../../models/operations/UpdateShippingShipmentRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateShippingShipmentResponse](../../models/operations/UpdateShippingShipmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |