# Integration
(*integration*)

### Available Operations

* [getUnifiedIntegrationAuth](#getunifiedintegrationauth) - Create connection indirectly
* [listUnifiedIntegrationWorkspaces](#listunifiedintegrationworkspaces) - Returns all activated integrations in a workspace
* [listUnifiedIntegrations](#listunifiedintegrations) - Returns all integrations

## getUnifiedIntegrationAuth

Returns an authorization URL for the specified integration.  Once a successful authorization occurs, a new connection is created.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthResponse;
import com.unifiedapi.unifiedto.models.operations.Scopes;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthRequest req = new GetUnifiedIntegrationAuthRequest(
                "string",
                "string"){{
                env = "string";
                externalXref = "string";
                failureRedirect = "string";
                lang = "string";
                redirect = false;
                scopes = new com.unifiedapi.unifiedto.models.operations.Scopes[]{{
                    add(Scopes.HRIS_GROUP_READ),
                }};
                state = "string";
                subdomain = "string";
                successRedirect = "string";

            }};

            com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthResponse res = sdk.integration.getUnifiedIntegrationAuth(req);

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthRequest](../../models/operations/GetUnifiedIntegrationAuthRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthResponse](../../models/operations/GetUnifiedIntegrationAuthResponse.md)**


## listUnifiedIntegrationWorkspaces

No authentication required as this is to be used by front-end interface

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationWorkspacesRequest;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationWorkspacesResponse;
import com.unifiedapi.unifiedto.models.operations.QueryParamCategories;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationWorkspacesRequest req = new ListUnifiedIntegrationWorkspacesRequest(
                "string"){{
                active = false;
                categories = new com.unifiedapi.unifiedto.models.operations.QueryParamCategories[]{{
                    add(QueryParamCategories.UC),
                }};
                env = "string";
                limit = 9072.99d;
                offset = 5948.93d;
                summary = false;
                updatedGte = "string";

            }};

            com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationWorkspacesResponse res = sdk.integration.listUnifiedIntegrationWorkspaces(req);

            if (res.integrations != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationWorkspacesRequest](../../models/operations/ListUnifiedIntegrationWorkspacesRequest.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationWorkspacesResponse](../../models/operations/ListUnifiedIntegrationWorkspacesResponse.md)**


## listUnifiedIntegrations

Returns all integrations

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsQueryParamCategories;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsRequest;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsRequest req = new ListUnifiedIntegrationsRequest(
){{
                active = false;
                categories = new com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsQueryParamCategories[]{{
                    add(ListUnifiedIntegrationsQueryParamCategories.AUTH),
                }};
                env = "string";
                limit = 7382.58d;
                offset = 353.99d;
                order = "string";
                sort = "string";
                summary = false;
                type = "string";
                updatedGte = "string";

            }};

            com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsResponse res = sdk.integration.listUnifiedIntegrations(req);

            if (res.integrations != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsRequest](../../models/operations/ListUnifiedIntegrationsRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsResponse](../../models/operations/ListUnifiedIntegrationsResponse.md)**

