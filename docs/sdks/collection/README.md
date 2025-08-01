# Collection
(*collection()*)

## Overview

### Available Operations

* [createCommerceCollection](#createcommercecollection) - Create a collection
* [getCommerceCollection](#getcommercecollection) - Retrieve a collection
* [listCommerceCollections](#listcommercecollections) - List all collections
* [patchCommerceCollection](#patchcommercecollection) - Update a collection
* [removeCommerceCollection](#removecommercecollection) - Remove a collection
* [updateCommerceCollection](#updatecommercecollection) - Update a collection

## createCommerceCollection

Create a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceCollection" method="post" path="/commerce/{connection_id}/collection" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceCollectionRequest;
import to.unified.unified_java_sdk.models.operations.CreateCommerceCollectionResponse;
import to.unified.unified_java_sdk.models.shared.CommerceCollection;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceCollectionRequest req = CreateCommerceCollectionRequest.builder()
                .commerceCollection(CommerceCollection.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceCollectionResponse res = sdk.collection().createCommerceCollection()
                .request(req)
                .call();

        if (res.commerceCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateCommerceCollectionRequest](../../models/operations/CreateCommerceCollectionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateCommerceCollectionResponse](../../models/operations/CreateCommerceCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceCollection

Retrieve a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceCollection" method="get" path="/commerce/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceCollectionRequest;
import to.unified.unified_java_sdk.models.operations.GetCommerceCollectionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceCollectionRequest req = GetCommerceCollectionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceCollectionResponse res = sdk.collection().getCommerceCollection()
                .request(req)
                .call();

        if (res.commerceCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetCommerceCollectionRequest](../../models/operations/GetCommerceCollectionRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetCommerceCollectionResponse](../../models/operations/GetCommerceCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceCollections

List all collections

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceCollections" method="get" path="/commerce/{connection_id}/collection" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceCollectionsRequest;
import to.unified.unified_java_sdk.models.operations.ListCommerceCollectionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceCollectionsRequest req = ListCommerceCollectionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCommerceCollectionsResponse res = sdk.collection().listCommerceCollections()
                .request(req)
                .call();

        if (res.commerceCollections().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListCommerceCollectionsRequest](../../models/operations/ListCommerceCollectionsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListCommerceCollectionsResponse](../../models/operations/ListCommerceCollectionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceCollection

Update a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceCollection" method="patch" path="/commerce/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceCollectionRequest;
import to.unified.unified_java_sdk.models.operations.PatchCommerceCollectionResponse;
import to.unified.unified_java_sdk.models.shared.CommerceCollection;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceCollectionRequest req = PatchCommerceCollectionRequest.builder()
                .commerceCollection(CommerceCollection.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceCollectionResponse res = sdk.collection().patchCommerceCollection()
                .request(req)
                .call();

        if (res.commerceCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchCommerceCollectionRequest](../../models/operations/PatchCommerceCollectionRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchCommerceCollectionResponse](../../models/operations/PatchCommerceCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceCollection

Remove a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceCollection" method="delete" path="/commerce/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceCollectionRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceCollectionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceCollectionRequest req = RemoveCommerceCollectionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceCollectionResponse res = sdk.collection().removeCommerceCollection()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveCommerceCollectionRequest](../../models/operations/RemoveCommerceCollectionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveCommerceCollectionResponse](../../models/operations/RemoveCommerceCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceCollection

Update a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceCollection" method="put" path="/commerce/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceCollectionRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceCollectionResponse;
import to.unified.unified_java_sdk.models.shared.CommerceCollection;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceCollectionRequest req = UpdateCommerceCollectionRequest.builder()
                .commerceCollection(CommerceCollection.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceCollectionResponse res = sdk.collection().updateCommerceCollection()
                .request(req)
                .call();

        if (res.commerceCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateCommerceCollectionRequest](../../models/operations/UpdateCommerceCollectionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateCommerceCollectionResponse](../../models/operations/UpdateCommerceCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |