# Model
(*model()*)

### Available Operations

* [listGenaiModels](#listgenaimodels) - List all models

## listGenaiModels

List all models

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.ListGenaiModelsRequest;
import com.unifiedapi.unifiedto.models.operations.ListGenaiModelsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            ListGenaiModelsRequest req = ListGenaiModelsRequest.builder()
                .connectionId("<value>")
                .build();

            ListGenaiModelsResponse res = sdk.model().listGenaiModels()
                .request(req)
                .call();

            if (res.genaiModels().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
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

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
