# Embedding

## Overview

### Available Operations

* [createGenaiEmbedding](#creategenaiembedding) - Create an embedding

## createGenaiEmbedding

Create an embedding

### Example Usage

<!-- UsageSnippet language="java" operationID="createGenaiEmbedding" method="post" path="/genai/{connection_id}/embedding" example="genai_embedding" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateGenaiEmbeddingRequest;
import to.unified.unified_java_sdk.models.operations.CreateGenaiEmbeddingResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateGenaiEmbeddingRequest req = CreateGenaiEmbeddingRequest.builder()
                .genaiEmbedding(GenaiEmbedding.builder()
                    .content(List.of(
                        GenaiEmbeddingContent.builder()
                            .text("Utrimque temptatio pecco demulceo.")
                            .build()))
                    .dimension(423d)
                    .embeddings("Est.")
                    .encondingFormat(EncondingFormat.FLOAT)
                    .id("7fd5d308-20f8-4679-bdfa-0da51e707b1c")
                    .maxTokens(223d)
                    .tokensUsed(836d)
                    .type("classification")
                    .build())
                .connectionId("<id>")
                .build();

        CreateGenaiEmbeddingResponse res = sdk.embedding().createGenaiEmbedding()
                .request(req)
                .call();

        if (res.genaiEmbedding().isPresent()) {
            System.out.println(res.genaiEmbedding().get());
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