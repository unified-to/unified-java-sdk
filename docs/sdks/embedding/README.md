# Embedding

## Overview

### Available Operations

* [createGenaiEmbedding](#creategenaiembedding) - Create an embedding

## createGenaiEmbedding

Create an embedding

### Example Usage

<!-- UsageSnippet language="java" operationID="createGenaiEmbedding" method="post" path="/genai/{connection_id}/embedding" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateGenaiEmbeddingRequest;
import to.unified.unified_java_sdk.models.operations.CreateGenaiEmbeddingResponse;
import to.unified.unified_java_sdk.models.shared.GenaiEmbedding;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateGenaiEmbeddingRequest req = CreateGenaiEmbeddingRequest.builder()
                .genaiEmbedding(GenaiEmbedding.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateGenaiEmbeddingResponse res = sdk.embedding().createGenaiEmbedding()
                .request(req)
                .call();

        if (res.genaiEmbedding().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateGenaiEmbeddingRequest](../../models/operations/CreateGenaiEmbeddingRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateGenaiEmbeddingResponse](../../models/operations/CreateGenaiEmbeddingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |