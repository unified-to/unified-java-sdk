# Collection

## Overview

### Available Operations

* [createCommerceCollection2](#createcommercecollection2) - Create a collection
* [createLmsCollection2](#createlmscollection2) - Create a collection
* [getCommerceCollection2](#getcommercecollection2) - Retrieve a collection
* [getLmsCollection2](#getlmscollection2) - Retrieve a collection
* [listCommerceCollections2](#listcommercecollections2) - List all collections
* [listLmsCollections2](#listlmscollections2) - List all collections
* [patchCommerceCollection2](#patchcommercecollection2) - Update a collection
* [patchLmsCollection2](#patchlmscollection2) - Update a collection
* [removeCommerceCollection2](#removecommercecollection2) - Remove a collection
* [removeLmsCollection2](#removelmscollection2) - Remove a collection
* [updateCommerceCollection2](#updatecommercecollection2) - Update a collection
* [updateLmsCollection2](#updatelmscollection2) - Update a collection

## createCommerceCollection2

Create a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceCollection2" method="post" path="/commerce/{connection_id}/collection" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceCollection2Request;
import to.unified.unified_java_sdk.models.operations.CreateCommerceCollection2Response;
import to.unified.unified_java_sdk.models.shared.CommerceCollection;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceCollection2Request req = CreateCommerceCollection2Request.builder()
                .commerceCollection(CommerceCollection.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceCollection2Response res = sdk.collection().createCommerceCollection2()
                .request(req)
                .call();

        if (res.commerceCollection().isPresent()) {
            System.out.println(res.commerceCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [CreateCommerceCollection2Request](../../models/operations/CreateCommerceCollection2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[CreateCommerceCollection2Response](../../models/operations/CreateCommerceCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsCollection2

Create a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsCollection2" method="post" path="/lms/{connection_id}/collection" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsCollection2Request;
import to.unified.unified_java_sdk.models.operations.CreateLmsCollection2Response;
import to.unified.unified_java_sdk.models.shared.LmsCollection;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsCollection2Request req = CreateLmsCollection2Request.builder()
                .lmsCollection(LmsCollection.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsCollection2Response res = sdk.collection().createLmsCollection2()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateLmsCollection2Request](../../models/operations/CreateLmsCollection2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateLmsCollection2Response](../../models/operations/CreateLmsCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceCollection2

Retrieve a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceCollection2" method="get" path="/commerce/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceCollection2Request;
import to.unified.unified_java_sdk.models.operations.GetCommerceCollection2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceCollection2Request req = GetCommerceCollection2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceCollection2Response res = sdk.collection().getCommerceCollection2()
                .request(req)
                .call();

        if (res.commerceCollection().isPresent()) {
            System.out.println(res.commerceCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetCommerceCollection2Request](../../models/operations/GetCommerceCollection2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetCommerceCollection2Response](../../models/operations/GetCommerceCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsCollection2

Retrieve a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsCollection2" method="get" path="/lms/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsCollection2Request;
import to.unified.unified_java_sdk.models.operations.GetLmsCollection2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsCollection2Request req = GetLmsCollection2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsCollection2Response res = sdk.collection().getLmsCollection2()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetLmsCollection2Request](../../models/operations/GetLmsCollection2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetLmsCollection2Response](../../models/operations/GetLmsCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceCollections2

List all collections

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceCollections2" method="get" path="/commerce/{connection_id}/collection" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceCollections2Request;
import to.unified.unified_java_sdk.models.operations.ListCommerceCollections2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceCollections2Request req = ListCommerceCollections2Request.builder()
                .connectionId("<id>")
                .build();

        ListCommerceCollections2Response res = sdk.collection().listCommerceCollections2()
                .request(req)
                .call();

        if (res.commerceCollections().isPresent()) {
            System.out.println(res.commerceCollections().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListCommerceCollections2Request](../../models/operations/ListCommerceCollections2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListCommerceCollections2Response](../../models/operations/ListCommerceCollections2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsCollections2

List all collections

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsCollections2" method="get" path="/lms/{connection_id}/collection" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsCollections2Request;
import to.unified.unified_java_sdk.models.operations.ListLmsCollections2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsCollections2Request req = ListLmsCollections2Request.builder()
                .connectionId("<id>")
                .build();

        ListLmsCollections2Response res = sdk.collection().listLmsCollections2()
                .request(req)
                .call();

        if (res.lmsCollections().isPresent()) {
            System.out.println(res.lmsCollections().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListLmsCollections2Request](../../models/operations/ListLmsCollections2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListLmsCollections2Response](../../models/operations/ListLmsCollections2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceCollection2

Update a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceCollection2" method="patch" path="/commerce/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceCollection2Request;
import to.unified.unified_java_sdk.models.operations.PatchCommerceCollection2Response;
import to.unified.unified_java_sdk.models.shared.CommerceCollection;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceCollection2Request req = PatchCommerceCollection2Request.builder()
                .commerceCollection(CommerceCollection.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceCollection2Response res = sdk.collection().patchCommerceCollection2()
                .request(req)
                .call();

        if (res.commerceCollection().isPresent()) {
            System.out.println(res.commerceCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [PatchCommerceCollection2Request](../../models/operations/PatchCommerceCollection2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[PatchCommerceCollection2Response](../../models/operations/PatchCommerceCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsCollection2

Update a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsCollection2" method="patch" path="/lms/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsCollection2Request;
import to.unified.unified_java_sdk.models.operations.PatchLmsCollection2Response;
import to.unified.unified_java_sdk.models.shared.LmsCollection;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsCollection2Request req = PatchLmsCollection2Request.builder()
                .lmsCollection(LmsCollection.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsCollection2Response res = sdk.collection().patchLmsCollection2()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchLmsCollection2Request](../../models/operations/PatchLmsCollection2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchLmsCollection2Response](../../models/operations/PatchLmsCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceCollection2

Remove a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceCollection2" method="delete" path="/commerce/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceCollection2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceCollection2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceCollection2Request req = RemoveCommerceCollection2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceCollection2Response res = sdk.collection().removeCommerceCollection2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [RemoveCommerceCollection2Request](../../models/operations/RemoveCommerceCollection2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[RemoveCommerceCollection2Response](../../models/operations/RemoveCommerceCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsCollection2

Remove a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsCollection2" method="delete" path="/lms/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCollection2Request;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCollection2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsCollection2Request req = RemoveLmsCollection2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsCollection2Response res = sdk.collection().removeLmsCollection2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveLmsCollection2Request](../../models/operations/RemoveLmsCollection2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveLmsCollection2Response](../../models/operations/RemoveLmsCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceCollection2

Update a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceCollection2" method="put" path="/commerce/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceCollection2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceCollection2Response;
import to.unified.unified_java_sdk.models.shared.CommerceCollection;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceCollection2Request req = UpdateCommerceCollection2Request.builder()
                .commerceCollection(CommerceCollection.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceCollection2Response res = sdk.collection().updateCommerceCollection2()
                .request(req)
                .call();

        if (res.commerceCollection().isPresent()) {
            System.out.println(res.commerceCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [UpdateCommerceCollection2Request](../../models/operations/UpdateCommerceCollection2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[UpdateCommerceCollection2Response](../../models/operations/UpdateCommerceCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsCollection2

Update a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsCollection2" method="put" path="/lms/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCollection2Request;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCollection2Response;
import to.unified.unified_java_sdk.models.shared.LmsCollection;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsCollection2Request req = UpdateLmsCollection2Request.builder()
                .lmsCollection(LmsCollection.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsCollection2Response res = sdk.collection().updateLmsCollection2()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateLmsCollection2Request](../../models/operations/UpdateLmsCollection2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateLmsCollection2Response](../../models/operations/UpdateLmsCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |