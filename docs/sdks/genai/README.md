# Genai

## Overview

### Available Operations

* [createGenaiEmbedding2](#creategenaiembedding2) - Create an embedding
* [createGenaiPrompt2](#creategenaiprompt2) - Create a prompt
* [getGenaiModel2](#getgenaimodel2) - Retrieve a model
* [listGenaiModels2](#listgenaimodels2) - List all models

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

        CreateGenaiEmbedding2Response res = sdk.genai().createGenaiEmbedding2()
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

## createGenaiPrompt2

Create a prompt

### Example Usage

<!-- UsageSnippet language="java" operationID="createGenaiPrompt2" method="post" path="/genai/{connection_id}/prompt" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateGenaiPrompt2Request;
import to.unified.unified_java_sdk.models.operations.CreateGenaiPrompt2Response;
import to.unified.unified_java_sdk.models.shared.GenaiPrompt;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateGenaiPrompt2Request req = CreateGenaiPrompt2Request.builder()
                .genaiPrompt(GenaiPrompt.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateGenaiPrompt2Response res = sdk.genai().createGenaiPrompt2()
                .request(req)
                .call();

        if (res.genaiPrompt().isPresent()) {
            System.out.println(res.genaiPrompt().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateGenaiPrompt2Request](../../models/operations/CreateGenaiPrompt2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateGenaiPrompt2Response](../../models/operations/CreateGenaiPrompt2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getGenaiModel2

Retrieve a model

### Example Usage

<!-- UsageSnippet language="java" operationID="getGenaiModel2" method="get" path="/genai/{connection_id}/model/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetGenaiModel2Request;
import to.unified.unified_java_sdk.models.operations.GetGenaiModel2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetGenaiModel2Request req = GetGenaiModel2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetGenaiModel2Response res = sdk.genai().getGenaiModel2()
                .request(req)
                .call();

        if (res.genaiModel().isPresent()) {
            System.out.println(res.genaiModel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetGenaiModel2Request](../../models/operations/GetGenaiModel2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetGenaiModel2Response](../../models/operations/GetGenaiModel2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listGenaiModels2

List all models

### Example Usage

<!-- UsageSnippet language="java" operationID="listGenaiModels2" method="get" path="/genai/{connection_id}/model" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListGenaiModels2Request;
import to.unified.unified_java_sdk.models.operations.ListGenaiModels2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListGenaiModels2Request req = ListGenaiModels2Request.builder()
                .connectionId("<id>")
                .build();

        ListGenaiModels2Response res = sdk.genai().listGenaiModels2()
                .request(req)
                .call();

        if (res.genaiModels().isPresent()) {
            System.out.println(res.genaiModels().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListGenaiModels2Request](../../models/operations/ListGenaiModels2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListGenaiModels2Response](../../models/operations/ListGenaiModels2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |