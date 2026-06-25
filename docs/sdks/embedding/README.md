# Embedding

## Overview

### Available Operations

* [createGenaiEmbedding2](#creategenaiembedding2) - Create an embedding

## createGenaiEmbedding2

Create an embedding

### Example Usage

<!-- UsageSnippet language="java" operationID="createGenaiEmbedding2" method="post" path="/genai/{connection_id}/embedding" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateGenaiEmbedding2Request;
import to.unified.unified_java_sdk.models.operations.CreateGenaiEmbedding2Response;
import to.unified.unified_java_sdk.models.shared.GenaiEmbedding;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateGenaiEmbedding2Request req = CreateGenaiEmbedding2Request.builder()
                .genaiEmbedding(GenaiEmbedding.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateGenaiEmbedding2Response res = sdk.embedding().createGenaiEmbedding2()
                .request(req)
                .call();

        if (res.genaiEmbedding().isPresent()) {
            System.out.println(res.genaiEmbedding().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateGenaiEmbedding2Request](../../models/operations/CreateGenaiEmbedding2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateGenaiEmbedding2Response](../../models/operations/CreateGenaiEmbedding2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |