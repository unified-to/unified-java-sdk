# Inventory

## Overview

### Available Operations

* [createCommerceInventory2](#createcommerceinventory2) - Create an inventory
* [getCommerceInventory2](#getcommerceinventory2) - Retrieve an inventory
* [listCommerceInventories2](#listcommerceinventories2) - List all inventories
* [patchCommerceInventory2](#patchcommerceinventory2) - Update an inventory
* [removeCommerceInventory2](#removecommerceinventory2) - Remove an inventory
* [updateCommerceInventory2](#updatecommerceinventory2) - Update an inventory

## createCommerceInventory2

Create an inventory

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceInventory2" method="post" path="/commerce/{connection_id}/inventory" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceInventory2Request;
import to.unified.unified_java_sdk.models.operations.CreateCommerceInventory2Response;
import to.unified.unified_java_sdk.models.shared.CommerceInventory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceInventory2Request req = CreateCommerceInventory2Request.builder()
                .commerceInventory(CommerceInventory.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceInventory2Response res = sdk.inventory().createCommerceInventory2()
                .request(req)
                .call();

        if (res.commerceInventory().isPresent()) {
            System.out.println(res.commerceInventory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateCommerceInventory2Request](../../models/operations/CreateCommerceInventory2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateCommerceInventory2Response](../../models/operations/CreateCommerceInventory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceInventory2

Retrieve an inventory

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceInventory2" method="get" path="/commerce/{connection_id}/inventory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceInventory2Request;
import to.unified.unified_java_sdk.models.operations.GetCommerceInventory2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceInventory2Request req = GetCommerceInventory2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceInventory2Response res = sdk.inventory().getCommerceInventory2()
                .request(req)
                .call();

        if (res.commerceInventory().isPresent()) {
            System.out.println(res.commerceInventory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetCommerceInventory2Request](../../models/operations/GetCommerceInventory2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetCommerceInventory2Response](../../models/operations/GetCommerceInventory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceInventories2

List all inventories

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceInventories2" method="get" path="/commerce/{connection_id}/inventory" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceInventories2Request;
import to.unified.unified_java_sdk.models.operations.ListCommerceInventories2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceInventories2Request req = ListCommerceInventories2Request.builder()
                .connectionId("<id>")
                .build();

        ListCommerceInventories2Response res = sdk.inventory().listCommerceInventories2()
                .request(req)
                .call();

        if (res.commerceInventories().isPresent()) {
            System.out.println(res.commerceInventories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListCommerceInventories2Request](../../models/operations/ListCommerceInventories2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListCommerceInventories2Response](../../models/operations/ListCommerceInventories2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceInventory2

Update an inventory

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceInventory2" method="patch" path="/commerce/{connection_id}/inventory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceInventory2Request;
import to.unified.unified_java_sdk.models.operations.PatchCommerceInventory2Response;
import to.unified.unified_java_sdk.models.shared.CommerceInventory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceInventory2Request req = PatchCommerceInventory2Request.builder()
                .commerceInventory(CommerceInventory.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceInventory2Response res = sdk.inventory().patchCommerceInventory2()
                .request(req)
                .call();

        if (res.commerceInventory().isPresent()) {
            System.out.println(res.commerceInventory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchCommerceInventory2Request](../../models/operations/PatchCommerceInventory2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchCommerceInventory2Response](../../models/operations/PatchCommerceInventory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceInventory2

Remove an inventory

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceInventory2" method="delete" path="/commerce/{connection_id}/inventory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceInventory2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceInventory2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceInventory2Request req = RemoveCommerceInventory2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceInventory2Response res = sdk.inventory().removeCommerceInventory2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveCommerceInventory2Request](../../models/operations/RemoveCommerceInventory2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveCommerceInventory2Response](../../models/operations/RemoveCommerceInventory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceInventory2

Update an inventory

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceInventory2" method="put" path="/commerce/{connection_id}/inventory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceInventory2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceInventory2Response;
import to.unified.unified_java_sdk.models.shared.CommerceInventory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceInventory2Request req = UpdateCommerceInventory2Request.builder()
                .commerceInventory(CommerceInventory.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceInventory2Response res = sdk.inventory().updateCommerceInventory2()
                .request(req)
                .call();

        if (res.commerceInventory().isPresent()) {
            System.out.println(res.commerceInventory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateCommerceInventory2Request](../../models/operations/UpdateCommerceInventory2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateCommerceInventory2Response](../../models/operations/UpdateCommerceInventory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |