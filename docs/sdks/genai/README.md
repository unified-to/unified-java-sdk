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

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListGenaiModelsRequest;
import com.unifiedapi.unifiedto.models.operations.ListGenaiModelsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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