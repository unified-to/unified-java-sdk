# Prompt

## Overview

### Available Operations

* [createGenaiPrompt](#creategenaiprompt) - Create a prompt

## createGenaiPrompt

Create a prompt

### Example Usage

<!-- UsageSnippet language="java" operationID="createGenaiPrompt" method="post" path="/genai/{connection_id}/prompt" example="genai_prompt" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateGenaiPromptRequest;
import to.unified.unified_java_sdk.models.operations.CreateGenaiPromptResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateGenaiPromptRequest req = CreateGenaiPromptRequest.builder()
                .genaiPrompt(GenaiPrompt.builder()
                    .maxTokens(0.4677782787475735)
                    .mcpAuthorizationToken("f45a6e93-7bed-49b4-a5c8-37a2ed2d58f4")
                    .mcpDeferredTools(List.of())
                    .mcpUrl("https://unsung-dusk.info/")
                    .messages(List.of(
                        GenaiContent.builder()
                            .content("Aegre repudiandae verecundia facere statua.")
                            .role(Role.ASSISTANT)
                            .build(),
                        GenaiContent.builder()
                            .content("Speciosus xiphias soleo trepide crinis.")
                            .role(Role.SYSTEM)
                            .build()))
                    .responses(List.of(
                        "Balbus vobis circumvenio una."))
                    .temperature(0d)
                    .tokensUsed(975d)
                    .build())
                .connectionId("<id>")
                .build();

        CreateGenaiPromptResponse res = sdk.prompt().createGenaiPrompt()
                .request(req)
                .call();

        if (res.genaiPrompt().isPresent()) {
            System.out.println(res.genaiPrompt().get());
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