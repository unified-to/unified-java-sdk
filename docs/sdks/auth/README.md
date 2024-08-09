# Auth
(*auth()*)

### Available Operations

* [getUnifiedIntegrationAuth](#getunifiedintegrationauth) - Create connection indirectly
* [getUnifiedIntegrationLogin](#getunifiedintegrationlogin) - Sign in a user

## getUnifiedIntegrationAuth

Returns an authorization URL for the specified integration.  Once a successful authorization occurs, a new connection is created.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthResponse;
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

            GetUnifiedIntegrationAuthRequest req = GetUnifiedIntegrationAuthRequest.builder()
                .integrationType("<value>")
                .workspaceId("<value>")
                .build();

            GetUnifiedIntegrationAuthResponse res = sdk.auth().getUnifiedIntegrationAuth()
                .request(req)
                .call();

            if (res.res().isPresent()) {
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

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetUnifiedIntegrationAuthRequest](../../models/operations/GetUnifiedIntegrationAuthRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |


### Response

**[GetUnifiedIntegrationAuthResponse](../../models/operations/GetUnifiedIntegrationAuthResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## getUnifiedIntegrationLogin

Returns an authentication URL for the specified integration.  Once a successful authentication occurs, the name and email are returned inside a jwt parameter, which is a JSON web token that is base-64 encoded.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationLoginRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationLoginResponse;
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

            GetUnifiedIntegrationLoginRequest req = GetUnifiedIntegrationLoginRequest.builder()
                .integrationType("<value>")
                .workspaceId("<value>")
                .build();

            GetUnifiedIntegrationLoginResponse res = sdk.auth().getUnifiedIntegrationLogin()
                .request(req)
                .call();

            if (res.res().isPresent()) {
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

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetUnifiedIntegrationLoginRequest](../../models/operations/GetUnifiedIntegrationLoginRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[GetUnifiedIntegrationLoginResponse](../../models/operations/GetUnifiedIntegrationLoginResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
