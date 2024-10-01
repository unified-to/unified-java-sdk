# Prompt
(*prompt()*)

## Overview

### Available Operations

* [createGenaiPrompt](#creategenaiprompt) - Create a prompt

## createGenaiPrompt

Create a prompt

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateGenaiPromptRequest;
import com.unifiedapi.unifiedto.models.operations.CreateGenaiPromptResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateGenaiPromptRequest req = CreateGenaiPromptRequest.builder()
                .connectionId("<id>")
                .build();

        CreateGenaiPromptResponse res = sdk.prompt().createGenaiPrompt()
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