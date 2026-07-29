# Saml

## Overview

### Available Operations

* [getUnifiedIntegrationSaml](#getunifiedintegrationsaml) - Sign in a user via SAML

## getUnifiedIntegrationSaml

Returns a SAML authentication URL for the specified integration.  Once a successful authentication occurs, the name and email are returned inside a jwt parameter, which is a JSON web token that is base-64 encoded.

### Example Usage

<!-- UsageSnippet language="java" operationID="getUnifiedIntegrationSaml" method="get" path="/unified/integration/saml/{workspace_id}/{integration_type}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUnifiedIntegrationSamlRequest;
import to.unified.unified_java_sdk.models.operations.GetUnifiedIntegrationSamlResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUnifiedIntegrationSamlRequest req = GetUnifiedIntegrationSamlRequest.builder()
                .integrationType("<value>")
                .workspaceId("<id>")
                .build();

        GetUnifiedIntegrationSamlResponse res = sdk.saml().getUnifiedIntegrationSaml()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            System.out.println(res.res().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetUnifiedIntegrationSamlRequest](../../models/operations/GetUnifiedIntegrationSamlRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetUnifiedIntegrationSamlResponse](../../models/operations/GetUnifiedIntegrationSamlResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |