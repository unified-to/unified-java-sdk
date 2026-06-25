# Item

## Overview

### Available Operations

* [createCommerceItem2](#createcommerceitem2) - Create an item
* [getCommerceItem2](#getcommerceitem2) - Retrieve an item
* [listCommerceItems2](#listcommerceitems2) - List all items
* [patchCommerceItem2](#patchcommerceitem2) - Update an item
* [removeCommerceItem2](#removecommerceitem2) - Remove an item
* [updateCommerceItem2](#updatecommerceitem2) - Update an item

## createCommerceItem2

Create an item

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceItem2" method="post" path="/commerce/{connection_id}/item" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceItem2Request;
import to.unified.unified_java_sdk.models.operations.CreateCommerceItem2Response;
import to.unified.unified_java_sdk.models.shared.CommerceItem;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceItem2Request req = CreateCommerceItem2Request.builder()
                .commerceItem(CommerceItem.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceItem2Response res = sdk.item().createCommerceItem2()
                .request(req)
                .call();

        if (res.commerceItem().isPresent()) {
            System.out.println(res.commerceItem().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateCommerceItem2Request](../../models/operations/CreateCommerceItem2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateCommerceItem2Response](../../models/operations/CreateCommerceItem2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceItem2

Retrieve an item

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceItem2" method="get" path="/commerce/{connection_id}/item/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceItem2Request;
import to.unified.unified_java_sdk.models.operations.GetCommerceItem2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceItem2Request req = GetCommerceItem2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceItem2Response res = sdk.item().getCommerceItem2()
                .request(req)
                .call();

        if (res.commerceItem().isPresent()) {
            System.out.println(res.commerceItem().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetCommerceItem2Request](../../models/operations/GetCommerceItem2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetCommerceItem2Response](../../models/operations/GetCommerceItem2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceItems2

List all items

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceItems2" method="get" path="/commerce/{connection_id}/item" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceItems2Request;
import to.unified.unified_java_sdk.models.operations.ListCommerceItems2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceItems2Request req = ListCommerceItems2Request.builder()
                .connectionId("<id>")
                .build();

        ListCommerceItems2Response res = sdk.item().listCommerceItems2()
                .request(req)
                .call();

        if (res.commerceItems().isPresent()) {
            System.out.println(res.commerceItems().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListCommerceItems2Request](../../models/operations/ListCommerceItems2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListCommerceItems2Response](../../models/operations/ListCommerceItems2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceItem2

Update an item

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceItem2" method="patch" path="/commerce/{connection_id}/item/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceItem2Request;
import to.unified.unified_java_sdk.models.operations.PatchCommerceItem2Response;
import to.unified.unified_java_sdk.models.shared.CommerceItem;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceItem2Request req = PatchCommerceItem2Request.builder()
                .commerceItem(CommerceItem.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceItem2Response res = sdk.item().patchCommerceItem2()
                .request(req)
                .call();

        if (res.commerceItem().isPresent()) {
            System.out.println(res.commerceItem().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchCommerceItem2Request](../../models/operations/PatchCommerceItem2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchCommerceItem2Response](../../models/operations/PatchCommerceItem2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceItem2

Remove an item

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceItem2" method="delete" path="/commerce/{connection_id}/item/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceItem2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceItem2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceItem2Request req = RemoveCommerceItem2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceItem2Response res = sdk.item().removeCommerceItem2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveCommerceItem2Request](../../models/operations/RemoveCommerceItem2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveCommerceItem2Response](../../models/operations/RemoveCommerceItem2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceItem2

Update an item

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceItem2" method="put" path="/commerce/{connection_id}/item/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceItem2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceItem2Response;
import to.unified.unified_java_sdk.models.shared.CommerceItem;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceItem2Request req = UpdateCommerceItem2Request.builder()
                .commerceItem(CommerceItem.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceItem2Response res = sdk.item().updateCommerceItem2()
                .request(req)
                .call();

        if (res.commerceItem().isPresent()) {
            System.out.println(res.commerceItem().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateCommerceItem2Request](../../models/operations/UpdateCommerceItem2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateCommerceItem2Response](../../models/operations/UpdateCommerceItem2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |