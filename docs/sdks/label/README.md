# Label

## Overview

### Available Operations

* [createShippingLabel2](#createshippinglabel2) - Create a label
* [getShippingLabel2](#getshippinglabel2) - Retrieve a label
* [listShippingLabels2](#listshippinglabels2) - List all labels
* [patchShippingLabel2](#patchshippinglabel2) - Update a label
* [removeShippingLabel2](#removeshippinglabel2) - Remove a label
* [updateShippingLabel2](#updateshippinglabel2) - Update a label

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

        CreateShippingLabel2Response res = sdk.label().createShippingLabel2()
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

        GetShippingLabel2Response res = sdk.label().getShippingLabel2()
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

        ListShippingLabels2Response res = sdk.label().listShippingLabels2()
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

        PatchShippingLabel2Response res = sdk.label().patchShippingLabel2()
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

        RemoveShippingLabel2Response res = sdk.label().removeShippingLabel2()
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

        UpdateShippingLabel2Response res = sdk.label().updateShippingLabel2()
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