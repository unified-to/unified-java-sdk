# Call

### Available Operations

* [getUcConnectionIdCall](#getucconnectionidcall) - List all calls

## getUcConnectionIdCall

List all calls

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdCallRequest;
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdCallResponse;
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdCallSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUcConnectionIdCallRequest req = new GetUcConnectionIdCallRequest("consectetur") {{
                agentId = "aliquid";
                contactId = "ipsa";
                limit = 6713.84d;
                offset = 1238.44d;
                order = "nostrum";
                query = "fugiat";
                sort = "expedita";
                updatedGte = OffsetDateTime.parse("2022-05-12T16:43:21.506Z");
            }};            

            GetUcConnectionIdCallResponse res = sdk.call.getUcConnectionIdCall(req, new GetUcConnectionIdCallSecurity("suscipit") {{
                jwt = "";
            }});

            if (res.ucCalls != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdCallRequest](../../models/operations/GetUcConnectionIdCallRequest.md)   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdCallSecurity](../../models/operations/GetUcConnectionIdCallSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdCallResponse](../../models/operations/GetUcConnectionIdCallResponse.md)**

