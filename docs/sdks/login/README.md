# Login
(*login*)

### Available Operations

* [getUnifiedIntegrationLogin](#getunifiedintegrationlogin) - Sign in a user

## getUnifiedIntegrationLogin

Returns an authentication URL for the specified integration.  Once a successful authentication occurs, the name and email are returned inside a jwt parameter, which is a JSON web token that is base-64 encoded.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationLoginRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationLoginResponse;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationLoginRequest req = new GetUnifiedIntegrationLoginRequest(
                "<value>",
                "<value>"){{
                env = "<value>";
                failureRedirect = "<value>";
                redirect = false;
                state = "Virginia";
                successRedirect = "<value>";

            }};

            com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationLoginResponse res = sdk.login.getUnifiedIntegrationLogin(req);

            if (res.res != null) {
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
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationLoginRequest](../../models/operations/GetUnifiedIntegrationLoginRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationLoginResponse](../../models/operations/GetUnifiedIntegrationLoginResponse.md)**

