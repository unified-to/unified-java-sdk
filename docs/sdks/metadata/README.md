# Metadata

## Overview

### Available Operations

* [createMetadataMetadata](#createmetadatametadata) - Create a metadata
* [getMetadataMetadata](#getmetadatametadata) - Retrieve a metadata
* [listMetadataMetadatas](#listmetadatametadatas) - List all metadatas
* [patchMetadataMetadata](#patchmetadatametadata) - Update a metadata
* [removeMetadataMetadata](#removemetadatametadata) - Remove a metadata
* [updateMetadataMetadata](#updatemetadatametadata) - Update a metadata

## createMetadataMetadata

Creates a MetadataMetadata. Provide the unified MetadataMetadata fields in the request body; they are mapped to the provider's API. Returns the created MetadataMetadata.

### Example Usage

<!-- UsageSnippet language="java" operationID="createMetadataMetadata" method="post" path="/metadata/{connection_id}/metadata" example="metadata_metadata" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateMetadataMetadataRequest;
import to.unified.unified_java_sdk.models.operations.CreateMetadataMetadataResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateMetadataMetadataRequest req = CreateMetadataMetadataRequest.builder()
                .metadataMetadata(MetadataMetadata.builder()
                    .name("autem")
                    .objectType("legal_expense")
                    .createdAt(OffsetDateTime.parse("2021-03-25T03:02:17.656Z"))
                    .format(MetadataMetadataFormat.PRICE)
                    .id("c6fb4d06-7260-414e-9e54-cdfe0799ff44")
                    .isRequired(false)
                    .objects(Map.ofEntries(
                    ))
                    .options(List.of())
                    .originalFormat("advoco")
                    .slug("arbustum")
                    .updatedAt(OffsetDateTime.parse("2025-03-27T00:03:37.867Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateMetadataMetadataResponse res = sdk.metadata().createMetadataMetadata()
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
| `request`                                                                                 | [CreateMetadataMetadataRequest](../../models/operations/CreateMetadataMetadataRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateMetadataMetadataResponse](../../models/operations/CreateMetadataMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMetadataMetadata

Retrieves a single MetadataMetadata by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getMetadataMetadata" method="get" path="/metadata/{connection_id}/metadata/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetMetadataMetadataRequest;
import to.unified.unified_java_sdk.models.operations.GetMetadataMetadataResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetMetadataMetadataRequest req = GetMetadataMetadataRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetMetadataMetadataResponse res = sdk.metadata().getMetadataMetadata()
                .request(req)
                .call();

        if (res.metadataMetadata().isPresent()) {
            System.out.println(res.metadataMetadata().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetMetadataMetadataRequest](../../models/operations/GetMetadataMetadataRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetMetadataMetadataResponse](../../models/operations/GetMetadataMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMetadataMetadatas

Returns a list of MetadataMetadatas. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listMetadataMetadatas" method="get" path="/metadata/{connection_id}/metadata" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMetadataMetadatasRequest;
import to.unified.unified_java_sdk.models.operations.ListMetadataMetadatasResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMetadataMetadatasRequest req = ListMetadataMetadatasRequest.builder()
                .connectionId("<id>")
                .build();

        ListMetadataMetadatasResponse res = sdk.metadata().listMetadataMetadatas()
                .request(req)
                .call();

        if (res.metadataMetadatas().isPresent()) {
            System.out.println(res.metadataMetadatas().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListMetadataMetadatasRequest](../../models/operations/ListMetadataMetadatasRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListMetadataMetadatasResponse](../../models/operations/ListMetadataMetadatasResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMetadataMetadata

Updates the MetadataMetadata identified by `id`. Provide the unified MetadataMetadata fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMetadataMetadata" method="patch" path="/metadata/{connection_id}/metadata/{id}" example="metadata_metadata" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMetadataMetadataRequest;
import to.unified.unified_java_sdk.models.operations.PatchMetadataMetadataResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMetadataMetadataRequest req = PatchMetadataMetadataRequest.builder()
                .metadataMetadata(MetadataMetadata.builder()
                    .name("autem")
                    .objectType("legal_expense")
                    .createdAt(OffsetDateTime.parse("2021-03-25T03:02:17.656Z"))
                    .format(MetadataMetadataFormat.PRICE)
                    .id("3d65bc5f-b173-438d-a53c-0452035d3eb2")
                    .isRequired(false)
                    .objects(Map.ofEntries(
                    ))
                    .options(List.of())
                    .originalFormat("advoco")
                    .slug("arbustum")
                    .updatedAt(OffsetDateTime.parse("2025-03-27T00:03:37.877Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMetadataMetadataResponse res = sdk.metadata().patchMetadataMetadata()
                .request(req)
                .call();

        if (res.metadataMetadata().isPresent()) {
            System.out.println(res.metadataMetadata().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchMetadataMetadataRequest](../../models/operations/PatchMetadataMetadataRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchMetadataMetadataResponse](../../models/operations/PatchMetadataMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeMetadataMetadata

Deletes the MetadataMetadata identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeMetadataMetadata" method="delete" path="/metadata/{connection_id}/metadata/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveMetadataMetadataRequest;
import to.unified.unified_java_sdk.models.operations.RemoveMetadataMetadataResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveMetadataMetadataRequest req = RemoveMetadataMetadataRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveMetadataMetadataResponse res = sdk.metadata().removeMetadataMetadata()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveMetadataMetadataRequest](../../models/operations/RemoveMetadataMetadataRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveMetadataMetadataResponse](../../models/operations/RemoveMetadataMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMetadataMetadata

Updates the MetadataMetadata identified by `id`. Provide the unified MetadataMetadata fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMetadataMetadata" method="put" path="/metadata/{connection_id}/metadata/{id}" example="metadata_metadata" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMetadataMetadataRequest;
import to.unified.unified_java_sdk.models.operations.UpdateMetadataMetadataResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMetadataMetadataRequest req = UpdateMetadataMetadataRequest.builder()
                .metadataMetadata(MetadataMetadata.builder()
                    .name("autem")
                    .objectType("legal_expense")
                    .createdAt(OffsetDateTime.parse("2021-03-25T03:02:17.656Z"))
                    .format(MetadataMetadataFormat.PRICE)
                    .id("3d65bc5f-b173-438d-a53c-0452035d3eb2")
                    .isRequired(false)
                    .objects(Map.ofEntries(
                    ))
                    .options(List.of())
                    .originalFormat("advoco")
                    .slug("arbustum")
                    .updatedAt(OffsetDateTime.parse("2025-03-27T00:03:37.877Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMetadataMetadataResponse res = sdk.metadata().updateMetadataMetadata()
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
| `request`                                                                                 | [UpdateMetadataMetadataRequest](../../models/operations/UpdateMetadataMetadataRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateMetadataMetadataResponse](../../models/operations/UpdateMetadataMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |