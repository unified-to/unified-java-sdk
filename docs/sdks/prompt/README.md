# Prompt
(*prompt*)

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
import com.unifiedapi.unifiedto.models.shared.GenaiContent;
import com.unifiedapi.unifiedto.models.shared.GenaiPrompt;
import com.unifiedapi.unifiedto.models.shared.Role;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateGenaiPromptRequest req = new CreateGenaiPromptRequest(
                "<value>"){{
                genaiPrompt = new GenaiPrompt(
){{
                    maxTokens = 5880.19d;
                    messages = new com.unifiedapi.unifiedto.models.shared.GenaiContent[]{{
                        add(new GenaiContent(
                        "<value>"){{
                            content = "<value>";
                        }}),
                    }};
                    modelId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    responses = new String[]{{
                        add("<value>"),
                    }};
                    temperature = 9244.45d;

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateGenaiPromptResponse res = sdk.prompt.createGenaiPrompt(req);

            if (res.genaiPrompt != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.CreateGenaiPromptRequest](../../models/operations/CreateGenaiPromptRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateGenaiPromptResponse](../../models/operations/CreateGenaiPromptResponse.md)**

