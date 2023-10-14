# Call
(*call*)

### Available Operations

* [listUcCalls](#listuccalls) - List all calls

## listUcCalls

List all calls

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListUcCallsRequest;
import com.unifiedapi.unifiedto.models.operations.ListUcCallsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Liberia"){{
                    jwt = "";
                }})
                .build();

            ListUcCallsRequest req = new ListUcCallsRequest("Cargo"){{
                agentId = "playfully";
                contactId = "AGP";
                fields = new String[]{{
                    add("Health"),
                }};
                limit = 8985.18d;
                offset = 2975.86d;
                order = "error denationalise Mauritania";
                query = "female Tools Mouse";
                sort = "Country";
                updatedGte = OffsetDateTime.parse("2021-02-06T20:10:12.947Z");
            }};            

            ListUcCallsResponse res = sdk.call.listUcCalls(req);

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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListUcCallsRequest](../../models/operations/ListUcCallsRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListUcCallsResponse](../../models/operations/ListUcCallsResponse.md)**

