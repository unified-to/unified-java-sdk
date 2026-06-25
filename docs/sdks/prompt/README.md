# Prompt

## Overview

### Available Operations

* [createGenaiPrompt2](#creategenaiprompt2) - Create a prompt

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

        CreateGenaiPrompt2Response res = sdk.prompt().createGenaiPrompt2()
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