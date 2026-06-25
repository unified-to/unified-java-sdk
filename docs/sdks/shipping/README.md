# Shipping

## Overview

### Available Operations

* [createShippingLabel2](#createshippinglabel2) - Create a label
* [createShippingRate2](#createshippingrate2) - Create a rate
* [createShippingShipment2](#createshippingshipment2) - Create a shipment
* [getShippingCarrier2](#getshippingcarrier2) - Retrieve a carrier
* [getShippingLabel2](#getshippinglabel2) - Retrieve a label
* [getShippingShipment2](#getshippingshipment2) - Retrieve a shipment
* [getShippingTracking2](#getshippingtracking2) - Retrieve a tracking
* [listShippingCarriers2](#listshippingcarriers2) - List all carriers
* [listShippingLabels2](#listshippinglabels2) - List all labels
* [listShippingShipments2](#listshippingshipments2) - List all shipments
* [listShippingTrackings2](#listshippingtrackings2) - List all trackings
* [patchShippingLabel2](#patchshippinglabel2) - Update a label
* [patchShippingShipment2](#patchshippingshipment2) - Update a shipment
* [removeShippingLabel2](#removeshippinglabel2) - Remove a label
* [removeShippingShipment2](#removeshippingshipment2) - Remove a shipment
* [updateShippingLabel2](#updateshippinglabel2) - Update a label
* [updateShippingShipment2](#updateshippingshipment2) - Update a shipment

## createShippingLabel2

Create a label

### Example Usage

<!-- UsageSnippet language="java" operationID="createShippingLabel2" method="post" path="/shipping/{connection_id}/label" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateShippingLabel2Request;
import to.unified.unified_java_sdk.models.operations.CreateShippingLabel2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.ShippingLabel;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateShippingLabel2Request req = CreateShippingLabel2Request.builder()
                .shippingLabel(ShippingLabel.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateShippingLabel2Response res = sdk.shipping().createShippingLabel2()
                .request(req)
                .call();

        if (res.shippingLabel().isPresent()) {
            System.out.println(res.shippingLabel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateShippingLabel2Request](../../models/operations/CreateShippingLabel2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateShippingLabel2Response](../../models/operations/CreateShippingLabel2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createShippingRate2

Create a rate

### Example Usage

<!-- UsageSnippet language="java" operationID="createShippingRate2" method="post" path="/shipping/{connection_id}/rate" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateShippingRate2Request;
import to.unified.unified_java_sdk.models.operations.CreateShippingRate2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.ShippingRate;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateShippingRate2Request req = CreateShippingRate2Request.builder()
                .shippingRate(ShippingRate.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateShippingRate2Response res = sdk.shipping().createShippingRate2()
                .request(req)
                .call();

        if (res.shippingRate().isPresent()) {
            System.out.println(res.shippingRate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateShippingRate2Request](../../models/operations/CreateShippingRate2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateShippingRate2Response](../../models/operations/CreateShippingRate2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateShippingShipment2Response res = sdk.shipping().createShippingShipment2()
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

        GetShippingCarrier2Response res = sdk.shipping().getShippingCarrier2()
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

## getShippingLabel2

Retrieve a label

### Example Usage

<!-- UsageSnippet language="java" operationID="getShippingLabel2" method="get" path="/shipping/{connection_id}/label/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetShippingLabel2Request;
import to.unified.unified_java_sdk.models.operations.GetShippingLabel2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetShippingLabel2Request req = GetShippingLabel2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetShippingLabel2Response res = sdk.shipping().getShippingLabel2()
                .request(req)
                .call();

        if (res.shippingLabel().isPresent()) {
            System.out.println(res.shippingLabel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetShippingLabel2Request](../../models/operations/GetShippingLabel2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetShippingLabel2Response](../../models/operations/GetShippingLabel2Response.md)**

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

        GetShippingShipment2Response res = sdk.shipping().getShippingShipment2()
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

        GetShippingTracking2Response res = sdk.shipping().getShippingTracking2()
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

        ListShippingCarriers2Response res = sdk.shipping().listShippingCarriers2()
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

## listShippingLabels2

List all labels

### Example Usage

<!-- UsageSnippet language="java" operationID="listShippingLabels2" method="get" path="/shipping/{connection_id}/label" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListShippingLabels2Request;
import to.unified.unified_java_sdk.models.operations.ListShippingLabels2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListShippingLabels2Request req = ListShippingLabels2Request.builder()
                .connectionId("<id>")
                .build();

        ListShippingLabels2Response res = sdk.shipping().listShippingLabels2()
                .request(req)
                .call();

        if (res.shippingLabels().isPresent()) {
            System.out.println(res.shippingLabels().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListShippingLabels2Request](../../models/operations/ListShippingLabels2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListShippingLabels2Response](../../models/operations/ListShippingLabels2Response.md)**

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

        ListShippingShipments2Response res = sdk.shipping().listShippingShipments2()
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

        ListShippingTrackings2Response res = sdk.shipping().listShippingTrackings2()
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

## patchShippingLabel2

Update a label

### Example Usage

<!-- UsageSnippet language="java" operationID="patchShippingLabel2" method="patch" path="/shipping/{connection_id}/label/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchShippingLabel2Request;
import to.unified.unified_java_sdk.models.operations.PatchShippingLabel2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.ShippingLabel;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchShippingLabel2Request req = PatchShippingLabel2Request.builder()
                .shippingLabel(ShippingLabel.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchShippingLabel2Response res = sdk.shipping().patchShippingLabel2()
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
| `request`                                                                           | [PatchShippingLabel2Request](../../models/operations/PatchShippingLabel2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchShippingLabel2Response](../../models/operations/PatchShippingLabel2Response.md)**

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

        PatchShippingShipment2Response res = sdk.shipping().patchShippingShipment2()
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

## removeShippingLabel2

Remove a label

### Example Usage

<!-- UsageSnippet language="java" operationID="removeShippingLabel2" method="delete" path="/shipping/{connection_id}/label/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveShippingLabel2Request;
import to.unified.unified_java_sdk.models.operations.RemoveShippingLabel2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveShippingLabel2Request req = RemoveShippingLabel2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveShippingLabel2Response res = sdk.shipping().removeShippingLabel2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveShippingLabel2Request](../../models/operations/RemoveShippingLabel2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveShippingLabel2Response](../../models/operations/RemoveShippingLabel2Response.md)**

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

        RemoveShippingShipment2Response res = sdk.shipping().removeShippingShipment2()
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

## updateShippingLabel2

Update a label

### Example Usage

<!-- UsageSnippet language="java" operationID="updateShippingLabel2" method="put" path="/shipping/{connection_id}/label/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateShippingLabel2Request;
import to.unified.unified_java_sdk.models.operations.UpdateShippingLabel2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.ShippingLabel;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateShippingLabel2Request req = UpdateShippingLabel2Request.builder()
                .shippingLabel(ShippingLabel.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateShippingLabel2Response res = sdk.shipping().updateShippingLabel2()
                .request(req)
                .call();

        if (res.shippingLabel().isPresent()) {
            System.out.println(res.shippingLabel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateShippingLabel2Request](../../models/operations/UpdateShippingLabel2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateShippingLabel2Response](../../models/operations/UpdateShippingLabel2Response.md)**

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

        UpdateShippingShipment2Response res = sdk.shipping().updateShippingShipment2()
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