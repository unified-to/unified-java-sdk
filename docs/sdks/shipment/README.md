# Shipment

## Overview

### Available Operations

* [createShippingShipment2](#createshippingshipment2) - Create a shipment
* [getShippingShipment2](#getshippingshipment2) - Retrieve a shipment
* [listShippingShipments2](#listshippingshipments2) - List all shipments
* [patchShippingShipment2](#patchshippingshipment2) - Update a shipment
* [removeShippingShipment2](#removeshippingshipment2) - Remove a shipment
* [updateShippingShipment2](#updateshippingshipment2) - Update a shipment

## createShippingShipment2

Create a shipment

### Example Usage

<!-- UsageSnippet language="java" operationID="createShippingShipment2" method="post" path="/shipping/{connection_id}/shipment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateShippingShipment2Request;
import to.unified.unified_java_sdk.models.operations.CreateShippingShipment2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.ShippingShipment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateShippingShipment2Request req = CreateShippingShipment2Request.builder()
                .shippingShipment(ShippingShipment.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateShippingShipment2Response res = sdk.shipment().createShippingShipment2()
                .request(req)
                .call();

        if (res.shippingShipment().isPresent()) {
            System.out.println(res.shippingShipment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateShippingShipment2Request](../../models/operations/CreateShippingShipment2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateShippingShipment2Response](../../models/operations/CreateShippingShipment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getShippingShipment2

Retrieve a shipment

### Example Usage

<!-- UsageSnippet language="java" operationID="getShippingShipment2" method="get" path="/shipping/{connection_id}/shipment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetShippingShipment2Request;
import to.unified.unified_java_sdk.models.operations.GetShippingShipment2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetShippingShipment2Request req = GetShippingShipment2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetShippingShipment2Response res = sdk.shipment().getShippingShipment2()
                .request(req)
                .call();

        if (res.shippingShipment().isPresent()) {
            System.out.println(res.shippingShipment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetShippingShipment2Request](../../models/operations/GetShippingShipment2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetShippingShipment2Response](../../models/operations/GetShippingShipment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listShippingShipments2

List all shipments

### Example Usage

<!-- UsageSnippet language="java" operationID="listShippingShipments2" method="get" path="/shipping/{connection_id}/shipment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListShippingShipments2Request;
import to.unified.unified_java_sdk.models.operations.ListShippingShipments2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListShippingShipments2Request req = ListShippingShipments2Request.builder()
                .connectionId("<id>")
                .build();

        ListShippingShipments2Response res = sdk.shipment().listShippingShipments2()
                .request(req)
                .call();

        if (res.shippingShipments().isPresent()) {
            System.out.println(res.shippingShipments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListShippingShipments2Request](../../models/operations/ListShippingShipments2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListShippingShipments2Response](../../models/operations/ListShippingShipments2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchShippingShipment2

Update a shipment

### Example Usage

<!-- UsageSnippet language="java" operationID="patchShippingShipment2" method="patch" path="/shipping/{connection_id}/shipment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchShippingShipment2Request;
import to.unified.unified_java_sdk.models.operations.PatchShippingShipment2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.ShippingShipment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchShippingShipment2Request req = PatchShippingShipment2Request.builder()
                .shippingShipment(ShippingShipment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchShippingShipment2Response res = sdk.shipment().patchShippingShipment2()
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
| `request`                                                                                 | [PatchShippingShipment2Request](../../models/operations/PatchShippingShipment2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchShippingShipment2Response](../../models/operations/PatchShippingShipment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeShippingShipment2

Remove a shipment

### Example Usage

<!-- UsageSnippet language="java" operationID="removeShippingShipment2" method="delete" path="/shipping/{connection_id}/shipment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveShippingShipment2Request;
import to.unified.unified_java_sdk.models.operations.RemoveShippingShipment2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveShippingShipment2Request req = RemoveShippingShipment2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveShippingShipment2Response res = sdk.shipment().removeShippingShipment2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveShippingShipment2Request](../../models/operations/RemoveShippingShipment2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveShippingShipment2Response](../../models/operations/RemoveShippingShipment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateShippingShipment2

Update a shipment

### Example Usage

<!-- UsageSnippet language="java" operationID="updateShippingShipment2" method="put" path="/shipping/{connection_id}/shipment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateShippingShipment2Request;
import to.unified.unified_java_sdk.models.operations.UpdateShippingShipment2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.ShippingShipment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateShippingShipment2Request req = UpdateShippingShipment2Request.builder()
                .shippingShipment(ShippingShipment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateShippingShipment2Response res = sdk.shipment().updateShippingShipment2()
                .request(req)
                .call();

        if (res.shippingShipment().isPresent()) {
            System.out.println(res.shippingShipment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateShippingShipment2Request](../../models/operations/UpdateShippingShipment2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateShippingShipment2Response](../../models/operations/UpdateShippingShipment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |