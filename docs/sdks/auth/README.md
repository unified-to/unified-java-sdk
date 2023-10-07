# Auth
(*auth*)

### Available Operations

* [getUnifiedIntegrationAuthWorkspaceIdIntegrationType](#getunifiedintegrationauthworkspaceidintegrationtype) - Create connection indirectly
* [getUnifiedIntegrationLoginWorkspaceIdIntegrationType](#getunifiedintegrationloginworkspaceidintegrationtype) - Sign in a user

## getUnifiedIntegrationAuthWorkspaceIdIntegrationType

Returns an authorization URL for the specified integration.  Once a successful authorization occurs, a new connection is created.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeResponse;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeScopes;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Ireland"){{
                    jwt = "";
                }})
                .build();

            GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeRequest req = new GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeRequest("Ergonomic", "quae"){{
                env = "Surinam national Security";
                externalXref = "purple positively";
                failureRedirect = "Bicycle";
                lang = "Home";
                redirect = false;
                scopes = new com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeScopes[]{{
                    add(GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeScopes.CRM_PIPELINE_READ),
                }};
                state = "architectures";
                subdomain = "Functionality";
                successRedirect = "innovate payment";
            }};            

            GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeResponse res = sdk.auth.getUnifiedIntegrationAuthWorkspaceIdIntegrationType(req);

            if (res.getUnifiedIntegrationAuthWorkspaceIdIntegrationType200ApplicationJSONString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                      | Type                                                                                                                                                                                           | Required                                                                                                                                                                                       | Description                                                                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeRequest](../../models/operations/GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeRequest.md) | :heavy_check_mark:                                                                                                                                                                             | The request object to use for the request.                                                                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeResponse](../../models/operations/GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeResponse.md)**


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

            GetUnifiedIntegrationLoginWorkspaceIdIntegrationTypeResponse res = sdk.auth.getUnifiedIntegrationLoginWorkspaceIdIntegrationType(req);

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

