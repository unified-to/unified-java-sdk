# Login
(*login*)

### Available Operations

* [getUnifiedIntegrationLoginWorkspaceIdIntegrationType](#getunifiedintegrationloginworkspaceidintegrationtype) - Sign in a user

## getUnifiedIntegrationLoginWorkspaceIdIntegrationType

Returns an authentication URL for the specified integration.  Once a successful authentication occurs, the name and emails are returned.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationLoginWorkspaceIdIntegrationTypeRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationLoginWorkspaceIdIntegrationTypeResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("East"){{
                    jwt = "";
                }})
                .build();

            GetUnifiedIntegrationLoginWorkspaceIdIntegrationTypeRequest req = new GetUnifiedIntegrationLoginWorkspaceIdIntegrationTypeRequest("Fresh", "gold"){{
                env = "Volkswagen";
                failureRedirect = "official";
                redirect = false;
                state = "Multigender Volkswagen";
                successRedirect = "Magnesium utterly";
            }};            

            GetUnifiedIntegrationLoginWorkspaceIdIntegrationTypeResponse res = sdk.login.getUnifiedIntegrationLoginWorkspaceIdIntegrationType(req);

            if (res.getUnifiedIntegrationLoginWorkspaceIdIntegrationType200ApplicationJSONString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                        | Type                                                                                                                                                                                             | Required                                                                                                                                                                                         | Description                                                                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationLoginWorkspaceIdIntegrationTypeRequest](../../models/operations/GetUnifiedIntegrationLoginWorkspaceIdIntegrationTypeRequest.md) | :heavy_check_mark:                                                                                                                                                                               | The request object to use for the request.                                                                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationLoginWorkspaceIdIntegrationTypeResponse](../../models/operations/GetUnifiedIntegrationLoginWorkspaceIdIntegrationTypeResponse.md)**

