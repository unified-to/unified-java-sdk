# Genai

## Overview

### Available Operations

* [createGenaiEmbedding](#creategenaiembedding) - Create an embedding
* [createGenaiPrompt](#creategenaiprompt) - Create a prompt
* [getGenaiModel](#getgenaimodel) - Retrieve a model
* [listGenaiModels](#listgenaimodels) - List all models

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

        CreateGenaiEmbeddingResponse res = sdk.genai().createGenaiEmbedding()
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

## createGenaiPrompt

Create a prompt

### Example Usage

<!-- UsageSnippet language="java" operationID="createGenaiPrompt" method="post" path="/genai/{connection_id}/prompt" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateGenaiPromptRequest;
import to.unified.unified_java_sdk.models.operations.CreateGenaiPromptResponse;
import to.unified.unified_java_sdk.models.shared.GenaiPrompt;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateGenaiPromptRequest req = CreateGenaiPromptRequest.builder()
                .genaiPrompt(GenaiPrompt.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateGenaiPromptResponse res = sdk.genai().createGenaiPrompt()
                .request(req)
                .call();

        if (res.genaiPrompt().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateGenaiPromptRequest](../../models/operations/CreateGenaiPromptRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateGenaiPromptResponse](../../models/operations/CreateGenaiPromptResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getGenaiModel

Retrieve a model

### Example Usage

<!-- UsageSnippet language="java" operationID="getGenaiModel" method="get" path="/genai/{connection_id}/model/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetGenaiModelRequest;
import to.unified.unified_java_sdk.models.operations.GetGenaiModelResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetGenaiModelRequest req = GetGenaiModelRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetGenaiModelResponse res = sdk.genai().getGenaiModel()
                .request(req)
                .call();

        if (res.genaiModel().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetGenaiModelRequest](../../models/operations/GetGenaiModelRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetGenaiModelResponse](../../models/operations/GetGenaiModelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listGenaiModels

List all models

### Example Usage

<!-- UsageSnippet language="java" operationID="listGenaiModels" method="get" path="/genai/{connection_id}/model" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListGenaiModelsRequest;
import to.unified.unified_java_sdk.models.operations.ListGenaiModelsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListGenaiModelsRequest req = ListGenaiModelsRequest.builder()
                .connectionId("<id>")
                .build();

        ListGenaiModelsResponse res = sdk.genai().listGenaiModels()
                .request(req)
                .call();

        if (res.genaiModels().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListGenaiModelsRequest](../../models/operations/ListGenaiModelsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListGenaiModelsResponse](../../models/operations/ListGenaiModelsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |