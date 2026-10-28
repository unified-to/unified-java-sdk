# Shipping

## Overview

### Available Operations

* [createShippingLabel](#createshippinglabel) - Create a label
* [createShippingRate](#createshippingrate) - Create a rate
* [createShippingShipment](#createshippingshipment) - Create a shipment
* [getShippingCarrier](#getshippingcarrier) - Retrieve a carrier
* [getShippingLabel](#getshippinglabel) - Retrieve a label
* [getShippingShipment](#getshippingshipment) - Retrieve a shipment
* [getShippingTracking](#getshippingtracking) - Retrieve a tracking
* [listShippingCarriers](#listshippingcarriers) - List all carriers
* [listShippingLabels](#listshippinglabels) - List all labels
* [listShippingShipments](#listshippingshipments) - List all shipments
* [listShippingTrackings](#listshippingtrackings) - List all trackings
* [patchShippingLabel](#patchshippinglabel) - Update a label
* [patchShippingShipment](#patchshippingshipment) - Update a shipment
* [removeShippingLabel](#removeshippinglabel) - Remove a label
* [removeShippingShipment](#removeshippingshipment) - Remove a shipment
* [updateShippingLabel](#updateshippinglabel) - Update a label
* [updateShippingShipment](#updateshippingshipment) - Update a shipment

## createShippingLabel

Creates a ShippingLabel. Provide the unified ShippingLabel fields in the request body; they are mapped to the provider's API. Returns the created ShippingLabel.

### Example Usage

<!-- UsageSnippet language="java" operationID="createShippingLabel" method="post" path="/shipping/{connection_id}/label" example="shipping_label" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateShippingLabelRequest;
import to.unified.unified_java_sdk.models.operations.CreateShippingLabelResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateShippingLabelRequest req = CreateShippingLabelRequest.builder()
                .shippingLabel(ShippingLabel.builder()
                    .createdAt(OffsetDateTime.parse("2022-11-18T16:45:38.067Z"))
                    .id("d9d17a17-ab36-4259-a2e3-0a702bd2afc4")
                    .isVoided(false)
                    .labelCost(40.83653403213248)
                    .labelCostCurrency("USD")
                    .labelFormat(LabelFormat.PNG)
                    .labelUrl("https://labels.example.com/d9d17a17-ab36-4259-a2e3-0a702bd2afc4.pdf")
                    .metadata(List.of())
                    .serviceCode("Dzy")
                    .status(ShippingLabelStatus.EXCEPTION)
                    .trackingNumber("ZYV60FOIBUJ6")
                    .updatedAt(OffsetDateTime.parse("2024-05-01T12:01:38.781Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateShippingLabelResponse res = sdk.shipping().createShippingLabel()
                .request(req)
                .call();

        if (res.shippingLabel().isPresent()) {
            System.out.println(res.shippingLabel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateShippingLabelRequest](../../models/operations/CreateShippingLabelRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateShippingLabelResponse](../../models/operations/CreateShippingLabelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createShippingRate

Creates a ShippingRate. Provide the unified ShippingRate fields in the request body; they are mapped to the provider's API. Returns the created ShippingRate.

### Example Usage

<!-- UsageSnippet language="java" operationID="createShippingRate" method="post" path="/shipping/{connection_id}/rate" example="shipping_rate" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateShippingRateRequest;
import to.unified.unified_java_sdk.models.operations.CreateShippingRateResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateShippingRateRequest req = CreateShippingRateRequest.builder()
                .shippingRate(ShippingRate.builder()
                    .currency("USD")
                    .id("fd1ff8fe-8991-4765-a0c8-d3c0e8cff60c")
                    .metadata(List.of())
                    .rates(List.of(
                        ShippingRateRate.builder()
                            .title("Express")
                            .amount(44.72)
                            .baseAmount(46.01)
                            .currency("USD")
                            .deliveryDays(2d)
                            .description("Veniam denego vulgo bos turpis pax.")
                            .discountAmount(4.6)
                            .estimatedDays(2d)
                            .estimatedDeliveryEndAt(OffsetDateTime.parse("2021-09-03T01:03:36.021Z"))
                            .isNegotiatedRate(true)
                            .taxAmount(3.31)
                            .build()))
                    .build())
                .connectionId("<id>")
                .build();

        CreateShippingRateResponse res = sdk.shipping().createShippingRate()
                .request(req)
                .call();

        if (res.shippingRate().isPresent()) {
            System.out.println(res.shippingRate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateShippingRateRequest](../../models/operations/CreateShippingRateRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateShippingRateResponse](../../models/operations/CreateShippingRateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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
                    .id("1132a66b-da2e-4b3e-a92b-d3c2e115bc19")
                    .isReturn(false)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .rateCurrency("USD")
                    .rateEstimatedDays(4d)
                    .rateServiceName("2nd Day Air")
                    .serviceCode("OVERNIGHT")
                    .shippedAt(OffsetDateTime.parse("2022-09-12T07:26:48.479Z"))
                    .status(ShippingShipmentStatus.DELIVERED)
                    .updatedAt(OffsetDateTime.parse("2022-11-15T13:59:29.884Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateShippingShipmentResponse res = sdk.shipping().createShippingShipment()
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

        GetShippingCarrierResponse res = sdk.shipping().getShippingCarrier()
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

## getShippingLabel

Retrieves a single ShippingLabel by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getShippingLabel" method="get" path="/shipping/{connection_id}/label/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetShippingLabelRequest;
import to.unified.unified_java_sdk.models.operations.GetShippingLabelResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetShippingLabelRequest req = GetShippingLabelRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetShippingLabelResponse res = sdk.shipping().getShippingLabel()
                .request(req)
                .call();

        if (res.shippingLabel().isPresent()) {
            System.out.println(res.shippingLabel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetShippingLabelRequest](../../models/operations/GetShippingLabelRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetShippingLabelResponse](../../models/operations/GetShippingLabelResponse.md)**

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

        GetShippingShipmentResponse res = sdk.shipping().getShippingShipment()
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

        GetShippingTrackingResponse res = sdk.shipping().getShippingTracking()
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

        ListShippingCarriersResponse res = sdk.shipping().listShippingCarriers()
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

## listShippingLabels

Returns a list of ShippingLabels. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listShippingLabels" method="get" path="/shipping/{connection_id}/label" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListShippingLabelsRequest;
import to.unified.unified_java_sdk.models.operations.ListShippingLabelsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListShippingLabelsRequest req = ListShippingLabelsRequest.builder()
                .connectionId("<id>")
                .build();

        ListShippingLabelsResponse res = sdk.shipping().listShippingLabels()
                .request(req)
                .call();

        if (res.shippingLabels().isPresent()) {
            System.out.println(res.shippingLabels().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListShippingLabelsRequest](../../models/operations/ListShippingLabelsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListShippingLabelsResponse](../../models/operations/ListShippingLabelsResponse.md)**

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

        ListShippingShipmentsResponse res = sdk.shipping().listShippingShipments()
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

        ListShippingTrackingsResponse res = sdk.shipping().listShippingTrackings()
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

## patchShippingLabel

Updates the ShippingLabel identified by `id`. Provide the unified ShippingLabel fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchShippingLabel" method="patch" path="/shipping/{connection_id}/label/{id}" example="shipping_label" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchShippingLabelRequest;
import to.unified.unified_java_sdk.models.operations.PatchShippingLabelResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchShippingLabelRequest req = PatchShippingLabelRequest.builder()
                .shippingLabel(ShippingLabel.builder()
                    .createdAt(OffsetDateTime.parse("2022-11-18T16:45:38.067Z"))
                    .id("aa947560-00cf-4ae8-8321-043a25792b46")
                    .isVoided(false)
                    .labelCost(40.83653403213248)
                    .labelCostCurrency("USD")
                    .labelFormat(LabelFormat.PNG)
                    .labelUrl("https://labels.example.com/aa947560-00cf-4ae8-8321-043a25792b46.pdf")
                    .metadata(List.of())
                    .serviceCode("Dzy")
                    .status(ShippingLabelStatus.EXCEPTION)
                    .trackingNumber("ZYV60FOIBUJ6")
                    .updatedAt(OffsetDateTime.parse("2024-05-01T12:01:38.788Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchShippingLabelResponse res = sdk.shipping().patchShippingLabel()
                .request(req)
                .call();

        if (res.shippingLabel().isPresent()) {
            System.out.println(res.shippingLabel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchShippingLabelRequest](../../models/operations/PatchShippingLabelRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchShippingLabelResponse](../../models/operations/PatchShippingLabelResponse.md)**

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
                    .id("ba074c01-f7cf-4922-8e85-bc3526cd3b01")
                    .isReturn(false)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .rateCurrency("USD")
                    .rateEstimatedDays(4d)
                    .rateServiceName("2nd Day Air")
                    .serviceCode("OVERNIGHT")
                    .shippedAt(OffsetDateTime.parse("2022-09-12T07:26:48.479Z"))
                    .status(ShippingShipmentStatus.DELIVERED)
                    .updatedAt(OffsetDateTime.parse("2022-11-15T13:59:29.889Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchShippingShipmentResponse res = sdk.shipping().patchShippingShipment()
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

## removeShippingLabel

Deletes the ShippingLabel identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeShippingLabel" method="delete" path="/shipping/{connection_id}/label/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveShippingLabelRequest;
import to.unified.unified_java_sdk.models.operations.RemoveShippingLabelResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveShippingLabelRequest req = RemoveShippingLabelRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveShippingLabelResponse res = sdk.shipping().removeShippingLabel()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveShippingLabelRequest](../../models/operations/RemoveShippingLabelRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveShippingLabelResponse](../../models/operations/RemoveShippingLabelResponse.md)**

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

        RemoveShippingShipmentResponse res = sdk.shipping().removeShippingShipment()
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

## updateShippingLabel

Updates the ShippingLabel identified by `id`. Provide the unified ShippingLabel fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateShippingLabel" method="put" path="/shipping/{connection_id}/label/{id}" example="shipping_label" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateShippingLabelRequest;
import to.unified.unified_java_sdk.models.operations.UpdateShippingLabelResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateShippingLabelRequest req = UpdateShippingLabelRequest.builder()
                .shippingLabel(ShippingLabel.builder()
                    .createdAt(OffsetDateTime.parse("2022-11-18T16:45:38.067Z"))
                    .id("aa947560-00cf-4ae8-8321-043a25792b46")
                    .isVoided(false)
                    .labelCost(40.83653403213248)
                    .labelCostCurrency("USD")
                    .labelFormat(LabelFormat.PNG)
                    .labelUrl("https://labels.example.com/aa947560-00cf-4ae8-8321-043a25792b46.pdf")
                    .metadata(List.of())
                    .serviceCode("Dzy")
                    .status(ShippingLabelStatus.EXCEPTION)
                    .trackingNumber("ZYV60FOIBUJ6")
                    .updatedAt(OffsetDateTime.parse("2024-05-01T12:01:38.788Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateShippingLabelResponse res = sdk.shipping().updateShippingLabel()
                .request(req)
                .call();

        if (res.shippingLabel().isPresent()) {
            System.out.println(res.shippingLabel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateShippingLabelRequest](../../models/operations/UpdateShippingLabelRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateShippingLabelResponse](../../models/operations/UpdateShippingLabelResponse.md)**

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
                    .id("ba074c01-f7cf-4922-8e85-bc3526cd3b01")
                    .isReturn(false)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .rateCurrency("USD")
                    .rateEstimatedDays(4d)
                    .rateServiceName("2nd Day Air")
                    .serviceCode("OVERNIGHT")
                    .shippedAt(OffsetDateTime.parse("2022-09-12T07:26:48.479Z"))
                    .status(ShippingShipmentStatus.DELIVERED)
                    .updatedAt(OffsetDateTime.parse("2022-11-15T13:59:29.889Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateShippingShipmentResponse res = sdk.shipping().updateShippingShipment()
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