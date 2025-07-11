# Login
(*login()*)

## Overview

### Available Operations

* [getUnifiedIntegrationLogin](#getunifiedintegrationlogin) - Sign in a user

## getUnifiedIntegrationLogin

Returns an authentication URL for the specified integration.  Once a successful authentication occurs, the name and email are returned inside a jwt parameter, which is a JSON web token that is base-64 encoded.

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUnifiedIntegrationLoginRequest;
import to.unified.unified_java_sdk.models.operations.GetUnifiedIntegrationLoginResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUnifiedIntegrationLoginRequest req = GetUnifiedIntegrationLoginRequest.builder()
                .integrationType("<value>")
                .workspaceId("<id>")
                .build();

        GetUnifiedIntegrationLoginResponse res = sdk.login().getUnifiedIntegrationLogin()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |