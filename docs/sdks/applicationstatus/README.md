# Applicationstatus
(*applicationstatus*)

### Available Operations

* [listAtsApplicationstatuses](#listatsapplicationstatuses) - List all application statuses

## listAtsApplicationstatuses

List all application statuses

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesRequest req = new ListAtsApplicationstatusesRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 5199.96d;
                offset = 7673.65d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2024-03-25T18:11:33.180Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesResponse res = sdk.applicationstatus.listAtsApplicationstatuses(req);

            if (res.atsStatuses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesRequest](../../models/operations/ListAtsApplicationstatusesRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesResponse](../../models/operations/ListAtsApplicationstatusesResponse.md)**

