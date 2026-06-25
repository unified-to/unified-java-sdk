# Metadata

## Overview

### Available Operations

* [createMetadataMetadata2](#createmetadatametadata2) - Create a metadata
* [getMetadataMetadata2](#getmetadatametadata2) - Retrieve a metadata
* [listMetadataMetadatas2](#listmetadatametadatas2) - List all metadatas
* [patchMetadataMetadata2](#patchmetadatametadata2) - Update a metadata
* [removeMetadataMetadata2](#removemetadatametadata2) - Remove a metadata
* [updateMetadataMetadata2](#updatemetadatametadata2) - Update a metadata

## createMetadataMetadata2

Create a metadata

### Example Usage

<!-- UsageSnippet language="java" operationID="createMetadataMetadata2" method="post" path="/metadata/{connection_id}/metadata" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateMetadataMetadata2Request;
import to.unified.unified_java_sdk.models.operations.CreateMetadataMetadata2Response;
import to.unified.unified_java_sdk.models.shared.MetadataMetadata;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateMetadataMetadata2Request req = CreateMetadataMetadata2Request.builder()
                .metadataMetadata(MetadataMetadata.builder()
                    .name("<value>")
                    .objectType("<value>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateMetadataMetadata2Response res = sdk.metadata().createMetadataMetadata2()
                .request(req)
                .call();

        if (res.metadataMetadata().isPresent()) {
            System.out.println(res.metadataMetadata().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateMetadataMetadata2Request](../../models/operations/CreateMetadataMetadata2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateMetadataMetadata2Response](../../models/operations/CreateMetadataMetadata2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMetadataMetadata2

Retrieve a metadata

### Example Usage

<!-- UsageSnippet language="java" operationID="getMetadataMetadata2" method="get" path="/metadata/{connection_id}/metadata/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetMetadataMetadata2Request;
import to.unified.unified_java_sdk.models.operations.GetMetadataMetadata2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetMetadataMetadata2Request req = GetMetadataMetadata2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetMetadataMetadata2Response res = sdk.metadata().getMetadataMetadata2()
                .request(req)
                .call();

        if (res.metadataMetadata().isPresent()) {
            System.out.println(res.metadataMetadata().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetMetadataMetadata2Request](../../models/operations/GetMetadataMetadata2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetMetadataMetadata2Response](../../models/operations/GetMetadataMetadata2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMetadataMetadatas2

List all metadatas

### Example Usage

<!-- UsageSnippet language="java" operationID="listMetadataMetadatas2" method="get" path="/metadata/{connection_id}/metadata" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMetadataMetadatas2Request;
import to.unified.unified_java_sdk.models.operations.ListMetadataMetadatas2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMetadataMetadatas2Request req = ListMetadataMetadatas2Request.builder()
                .connectionId("<id>")
                .build();

        ListMetadataMetadatas2Response res = sdk.metadata().listMetadataMetadatas2()
                .request(req)
                .call();

        if (res.metadataMetadatas().isPresent()) {
            System.out.println(res.metadataMetadatas().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListMetadataMetadatas2Request](../../models/operations/ListMetadataMetadatas2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListMetadataMetadatas2Response](../../models/operations/ListMetadataMetadatas2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMetadataMetadata2

Update a metadata

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMetadataMetadata2" method="patch" path="/metadata/{connection_id}/metadata/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMetadataMetadata2Request;
import to.unified.unified_java_sdk.models.operations.PatchMetadataMetadata2Response;
import to.unified.unified_java_sdk.models.shared.MetadataMetadata;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMetadataMetadata2Request req = PatchMetadataMetadata2Request.builder()
                .metadataMetadata(MetadataMetadata.builder()
                    .name("<value>")
                    .objectType("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMetadataMetadata2Response res = sdk.metadata().patchMetadataMetadata2()
                .request(req)
                .call();

        if (res.metadataMetadata().isPresent()) {
            System.out.println(res.metadataMetadata().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchMetadataMetadata2Request](../../models/operations/PatchMetadataMetadata2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchMetadataMetadata2Response](../../models/operations/PatchMetadataMetadata2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeMetadataMetadata2

Remove a metadata

### Example Usage

<!-- UsageSnippet language="java" operationID="removeMetadataMetadata2" method="delete" path="/metadata/{connection_id}/metadata/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveMetadataMetadata2Request;
import to.unified.unified_java_sdk.models.operations.RemoveMetadataMetadata2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveMetadataMetadata2Request req = RemoveMetadataMetadata2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveMetadataMetadata2Response res = sdk.metadata().removeMetadataMetadata2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveMetadataMetadata2Request](../../models/operations/RemoveMetadataMetadata2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveMetadataMetadata2Response](../../models/operations/RemoveMetadataMetadata2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMetadataMetadata2

Update a metadata

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMetadataMetadata2" method="put" path="/metadata/{connection_id}/metadata/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMetadataMetadata2Request;
import to.unified.unified_java_sdk.models.operations.UpdateMetadataMetadata2Response;
import to.unified.unified_java_sdk.models.shared.MetadataMetadata;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMetadataMetadata2Request req = UpdateMetadataMetadata2Request.builder()
                .metadataMetadata(MetadataMetadata.builder()
                    .name("<value>")
                    .objectType("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMetadataMetadata2Response res = sdk.metadata().updateMetadataMetadata2()
                .request(req)
                .call();

        if (res.metadataMetadata().isPresent()) {
            System.out.println(res.metadataMetadata().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateMetadataMetadata2Request](../../models/operations/UpdateMetadataMetadata2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateMetadataMetadata2Response](../../models/operations/UpdateMetadataMetadata2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |