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

        CreateShippingShipmentResponse res = sdk.shipment().createShippingShipment()
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

        GetShippingShipmentResponse res = sdk.shipment().getShippingShipment()
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

        ListShippingShipmentsResponse res = sdk.shipment().listShippingShipments()
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

        PatchShippingShipmentResponse res = sdk.shipment().patchShippingShipment()
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

        UpdateShippingShipmentResponse res = sdk.shipment().updateShippingShipment()
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