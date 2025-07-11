# Genai
(*genai()*)

## Overview

### Available Operations

* [createGenaiPrompt](#creategenaiprompt) - Create a prompt
* [listGenaiModels](#listgenaimodels) - List all models

## createGenaiPrompt

Create a prompt

### Example Usage

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

## listGenaiModels

List all models

### Example Usage

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