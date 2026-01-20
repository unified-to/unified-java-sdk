# Shipping

## Overview

### Available Operations

* [createShippingLabel](#createshippinglabel) - Create a label
* [createShippingRate](#createshippingrate) - Create a rate
* [createShippingShipment](#createshippingshipment) - Create a shipment
* [createShippingTracking](#createshippingtracking) - Create a tracking
* [getShippingCarrier](#getshippingcarrier) - Retrieve a carrier
* [getShippingLabel](#getshippinglabel) - Retrieve a label
* [getShippingRate](#getshippingrate) - Retrieve a rate
* [getShippingShipment](#getshippingshipment) - Retrieve a shipment
* [getShippingTracking](#getshippingtracking) - Retrieve a tracking
* [listShippingCarriers](#listshippingcarriers) - List all carriers
* [listShippingLabels](#listshippinglabels) - List all labels
* [listShippingShipments](#listshippingshipments) - List all shipments
* [listShippingTrackings](#listshippingtrackings) - List all trackings
* [patchShippingShipment](#patchshippingshipment) - Update a shipment
* [removeShippingLabel](#removeshippinglabel) - Remove a label
* [removeShippingShipment](#removeshippingshipment) - Remove a shipment
* [updateShippingShipment](#updateshippingshipment) - Update a shipment

## createShippingLabel

Create a label

### Example Usage

<!-- UsageSnippet language="java" operationID="createShippingLabel" method="post" path="/shipping/{connection_id}/label" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateShippingLabelRequest;
import to.unified.unified_java_sdk.models.operations.CreateShippingLabelResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.ShippingLabel;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateShippingLabelRequest req = CreateShippingLabelRequest.builder()
                .shippingLabel(ShippingLabel.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateShippingLabelResponse res = sdk.shipping().createShippingLabel()
                .request(req)
                .call();

        if (res.shippingLabel().isPresent()) {
            // handle response
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

Create a rate

### Example Usage

<!-- UsageSnippet language="java" operationID="createShippingRate" method="post" path="/shipping/{connection_id}/rate" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateShippingRateRequest;
import to.unified.unified_java_sdk.models.operations.CreateShippingRateResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.ShippingRate;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateShippingRateRequest req = CreateShippingRateRequest.builder()
                .shippingRate(ShippingRate.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateShippingRateResponse res = sdk.shipping().createShippingRate()
                .request(req)
                .call();

        if (res.shippingRate().isPresent()) {
            // handle response
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

Create a shipment

### Example Usage

<!-- UsageSnippet language="java" operationID="createShippingShipment" method="post" path="/shipping/{connection_id}/shipment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateShippingShipmentRequest;
import to.unified.unified_java_sdk.models.operations.CreateShippingShipmentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.ShippingShipment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateShippingShipmentRequest req = CreateShippingShipmentRequest.builder()
                .shippingShipment(ShippingShipment.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateShippingShipmentResponse res = sdk.shipping().createShippingShipment()
                .request(req)
                .call();

        if (res.shippingShipment().isPresent()) {
            // handle response
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

        CreateShippingTrackingResponse res = sdk.shipping().createShippingTracking()
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

        GetShippingCarrierResponse res = sdk.shipping().getShippingCarrier()
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

## getShippingLabel

Retrieve a label

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
            // handle response
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

## getShippingRate

Retrieve a rate

### Example Usage

<!-- UsageSnippet language="java" operationID="getShippingRate" method="get" path="/shipping/{connection_id}/rate/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetShippingRateRequest;
import to.unified.unified_java_sdk.models.operations.GetShippingRateResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetShippingRateRequest req = GetShippingRateRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetShippingRateResponse res = sdk.shipping().getShippingRate()
                .request(req)
                .call();

        if (res.shippingRate().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetShippingRateRequest](../../models/operations/GetShippingRateRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetShippingRateResponse](../../models/operations/GetShippingRateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getShippingShipment

Retrieve a shipment

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
            // handle response
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

        GetShippingTrackingResponse res = sdk.shipping().getShippingTracking()
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

        ListShippingCarriersResponse res = sdk.shipping().listShippingCarriers()
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

## listShippingLabels

List all labels

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
            // handle response
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

List all shipments

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
            // handle response
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

        ListShippingTrackingsResponse res = sdk.shipping().listShippingTrackings()
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

## patchShippingShipment

Update a shipment

### Example Usage

<!-- UsageSnippet language="java" operationID="patchShippingShipment" method="patch" path="/shipping/{connection_id}/shipment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchShippingShipmentRequest;
import to.unified.unified_java_sdk.models.operations.PatchShippingShipmentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.ShippingShipment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchShippingShipmentRequest req = PatchShippingShipmentRequest.builder()
                .shippingShipment(ShippingShipment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchShippingShipmentResponse res = sdk.shipping().patchShippingShipment()
                .request(req)
                .call();

        if (res.shippingShipment().isPresent()) {
            // handle response
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

Remove a label

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

Remove a shipment

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

## updateShippingShipment

Update a shipment

### Example Usage

<!-- UsageSnippet language="java" operationID="updateShippingShipment" method="put" path="/shipping/{connection_id}/shipment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateShippingShipmentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateShippingShipmentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.ShippingShipment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateShippingShipmentRequest req = UpdateShippingShipmentRequest.builder()
                .shippingShipment(ShippingShipment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateShippingShipmentResponse res = sdk.shipping().updateShippingShipment()
                .request(req)
                .call();

        if (res.shippingShipment().isPresent()) {
            // handle response
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