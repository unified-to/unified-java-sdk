# Memory

## Overview

### Available Operations

* [createGenaiMemory](#creategenaimemory) - Create a memory
* [getGenaiMemory](#getgenaimemory) - Retrieve a memory
* [listGenaiMemories](#listgenaimemories) - List all memories
* [patchGenaiMemory](#patchgenaimemory) - Update a memory
* [removeGenaiMemory](#removegenaimemory) - Remove a memory
* [updateGenaiMemory](#updategenaimemory) - Update a memory

## createGenaiMemory

Creates a GenaiMemory. Provide the unified GenaiMemory fields in the request body; they are mapped to the provider's API. Returns the created GenaiMemory.

### Example Usage

<!-- UsageSnippet language="java" operationID="createGenaiMemory" method="post" path="/genai/{connection_id}/memory" example="genai_memory" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateGenaiMemoryRequest;
import to.unified.unified_java_sdk.models.operations.CreateGenaiMemoryResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateGenaiMemoryRequest req = CreateGenaiMemoryRequest.builder()
                .genaiMemory(GenaiMemory.builder()
                    .content("Tabella rem approbo spiculum deserunt comitatus despecto. Aveho utroque accedo vinitor repellendus tam curis corona eos vobis. Ullus ager degero deporto cicuta vulgivagus.")
                    .createdAt(OffsetDateTime.parse("2021-10-22T04:14:41.668Z"))
                    .id("8c210fef-5535-453d-b1a8-ea0dbd6e1339")
                    .metadata(List.of(
                        GenaiMetadata.builder()
                            .extraData(GenaiMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(GenaiMetadataFormat.TEXT)
                            .id("7a8ad62d-ba0e-4ce3-8330-56a2647b5b3e")
                            .namespace("memory")
                            .slug("cribro")
                            .value(GenaiMetadataValue.of("aiunt"))
                            .build()))
                    .name("sponte.md")
                    .type(GenaiMemoryType.MEMORY)
                    .updatedAt(OffsetDateTime.parse("2023-04-26T05:01:08.195Z"))
                    .userIdentifier("9d170613-4338-447d-bdb6-8ea96a2d7513")
                    .build())
                .connectionId("<id>")
                .build();

        CreateGenaiMemoryResponse res = sdk.memory().createGenaiMemory()
                .request(req)
                .call();

        if (res.genaiMemory().isPresent()) {
            System.out.println(res.genaiMemory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateGenaiMemoryRequest](../../models/operations/CreateGenaiMemoryRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateGenaiMemoryResponse](../../models/operations/CreateGenaiMemoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getGenaiMemory

Retrieves a single GenaiMemory by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getGenaiMemory" method="get" path="/genai/{connection_id}/memory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetGenaiMemoryRequest;
import to.unified.unified_java_sdk.models.operations.GetGenaiMemoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetGenaiMemoryRequest req = GetGenaiMemoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetGenaiMemoryResponse res = sdk.memory().getGenaiMemory()
                .request(req)
                .call();

        if (res.genaiMemory().isPresent()) {
            System.out.println(res.genaiMemory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetGenaiMemoryRequest](../../models/operations/GetGenaiMemoryRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetGenaiMemoryResponse](../../models/operations/GetGenaiMemoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listGenaiMemories

Returns a list of GenaiMemories. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listGenaiMemories" method="get" path="/genai/{connection_id}/memory" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListGenaiMemoriesRequest;
import to.unified.unified_java_sdk.models.operations.ListGenaiMemoriesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListGenaiMemoriesRequest req = ListGenaiMemoriesRequest.builder()
                .connectionId("<id>")
                .build();

        ListGenaiMemoriesResponse res = sdk.memory().listGenaiMemories()
                .request(req)
                .call();

        if (res.genaiMemories().isPresent()) {
            System.out.println(res.genaiMemories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListGenaiMemoriesRequest](../../models/operations/ListGenaiMemoriesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListGenaiMemoriesResponse](../../models/operations/ListGenaiMemoriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchGenaiMemory

Updates the GenaiMemory identified by `id`. Provide the unified GenaiMemory fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchGenaiMemory" method="patch" path="/genai/{connection_id}/memory/{id}" example="genai_memory" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchGenaiMemoryRequest;
import to.unified.unified_java_sdk.models.operations.PatchGenaiMemoryResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchGenaiMemoryRequest req = PatchGenaiMemoryRequest.builder()
                .genaiMemory(GenaiMemory.builder()
                    .content("Tabella rem approbo spiculum deserunt comitatus despecto. Aveho utroque accedo vinitor repellendus tam curis corona eos vobis. Ullus ager degero deporto cicuta vulgivagus.")
                    .createdAt(OffsetDateTime.parse("2021-10-22T04:14:41.668Z"))
                    .id("183202d5-6a79-4378-aa9d-c1a0aa1c4ff8")
                    .metadata(List.of(
                        GenaiMetadata.builder()
                            .extraData(GenaiMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(GenaiMetadataFormat.TEXT)
                            .id("7a8ad62d-ba0e-4ce3-8330-56a2647b5b3e")
                            .namespace("memory")
                            .slug("cribro")
                            .value(GenaiMetadataValue.of("aiunt"))
                            .build()))
                    .name("sponte.md")
                    .type(GenaiMemoryType.MEMORY)
                    .updatedAt(OffsetDateTime.parse("2023-04-26T05:01:08.199Z"))
                    .userIdentifier("9d170613-4338-447d-bdb6-8ea96a2d7513")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchGenaiMemoryResponse res = sdk.memory().patchGenaiMemory()
                .request(req)
                .call();

        if (res.genaiMemory().isPresent()) {
            System.out.println(res.genaiMemory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchGenaiMemoryRequest](../../models/operations/PatchGenaiMemoryRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchGenaiMemoryResponse](../../models/operations/PatchGenaiMemoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeGenaiMemory

Deletes the GenaiMemory identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeGenaiMemory" method="delete" path="/genai/{connection_id}/memory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveGenaiMemoryRequest;
import to.unified.unified_java_sdk.models.operations.RemoveGenaiMemoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveGenaiMemoryRequest req = RemoveGenaiMemoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveGenaiMemoryResponse res = sdk.memory().removeGenaiMemory()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveGenaiMemoryRequest](../../models/operations/RemoveGenaiMemoryRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveGenaiMemoryResponse](../../models/operations/RemoveGenaiMemoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateGenaiMemory

Updates the GenaiMemory identified by `id`. Provide the unified GenaiMemory fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateGenaiMemory" method="put" path="/genai/{connection_id}/memory/{id}" example="genai_memory" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateGenaiMemoryRequest;
import to.unified.unified_java_sdk.models.operations.UpdateGenaiMemoryResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateGenaiMemoryRequest req = UpdateGenaiMemoryRequest.builder()
                .genaiMemory(GenaiMemory.builder()
                    .content("Tabella rem approbo spiculum deserunt comitatus despecto. Aveho utroque accedo vinitor repellendus tam curis corona eos vobis. Ullus ager degero deporto cicuta vulgivagus.")
                    .createdAt(OffsetDateTime.parse("2021-10-22T04:14:41.668Z"))
                    .id("183202d5-6a79-4378-aa9d-c1a0aa1c4ff8")
                    .metadata(List.of(
                        GenaiMetadata.builder()
                            .extraData(GenaiMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(GenaiMetadataFormat.TEXT)
                            .id("7a8ad62d-ba0e-4ce3-8330-56a2647b5b3e")
                            .namespace("memory")
                            .slug("cribro")
                            .value(GenaiMetadataValue.of("aiunt"))
                            .build()))
                    .name("sponte.md")
                    .type(GenaiMemoryType.MEMORY)
                    .updatedAt(OffsetDateTime.parse("2023-04-26T05:01:08.199Z"))
                    .userIdentifier("9d170613-4338-447d-bdb6-8ea96a2d7513")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateGenaiMemoryResponse res = sdk.memory().updateGenaiMemory()
                .request(req)
                .call();

        if (res.genaiMemory().isPresent()) {
            System.out.println(res.genaiMemory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateGenaiMemoryRequest](../../models/operations/UpdateGenaiMemoryRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateGenaiMemoryResponse](../../models/operations/UpdateGenaiMemoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |