# Call
(*call*)

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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Southeast"){{
                    jwt = "";
                }})
                .build();

            GetUcConnectionIdCallRequest req = new GetUcConnectionIdCallRequest("blue"){{
                agentId = "than";
                contactId = "reintermediate Enid Applications";
                limit = 1980.39d;
                offset = 3478d;
                order = "white Oklahoma Functionality";
                query = "pricing whether Hillsboro";
                sort = "Wooden desensitize SCSI";
                updatedGte = OffsetDateTime.parse("2021-11-03T12:40:46.997Z");
            }};            

            GetUcConnectionIdCallResponse res = sdk.call.getUcConnectionIdCall(req);

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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdCallRequest](../../models/operations/GetUcConnectionIdCallRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdCallResponse](../../models/operations/GetUcConnectionIdCallResponse.md)**

