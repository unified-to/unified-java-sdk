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
                agentId = "West";
                contactId = "Pop";
                fields = new String[]{{
                    add("AGP"),
                }};
                limit = 1965.31d;
                offset = 4663.16d;
                order = "gracefully";
                query = "so";
                sort = "Paradigm";
                updatedGte = OffsetDateTime.parse("2022-08-04T07:33:45.520Z");
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

