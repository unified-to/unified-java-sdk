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

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthRequest req = new GetUnifiedIntegrationAuthRequest(
                "<value>",
                "<value>"){{
                env = "<value>";
                externalXref = "<value>";
                failureRedirect = "<value>";
                lang = "<value>";
                redirect = false;
                scopes = new com.unifiedapi.unifiedto.models.operations.Scopes[]{{
                    add(Scopes.HRIS_EMPLOYEE_WRITE),
                }};
                state = "New Jersey";
                subdomain = "<value>";
                successRedirect = "<value>";

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

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationWorkspacesRequest req = new ListUnifiedIntegrationWorkspacesRequest(
                "<value>"){{
                active = false;
                categories = new com.unifiedapi.unifiedto.models.operations.QueryParamCategories[]{{
                    add(QueryParamCategories.ACCOUNTING),
                }};
                env = "<value>";
                limit = 9072.99d;
                offset = 5948.93d;
                summary = false;
                updatedGte = "<value>";

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
import com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsRequest req = new ListUnifiedIntegrationsRequest(
){{
                active = false;
                categories = new com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsQueryParamCategories[]{{
                    add(ListUnifiedIntegrationsQueryParamCategories.CRM),
                }};
                env = "<value>";
                limit = 7382.58d;
                offset = 353.99d;
                order = "<value>";
                sort = "<value>";
                summary = false;
                type = "<value>";
                updatedGte = "<value>";

            }};

            com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsResponse res = sdk.integration.listUnifiedIntegrations(req, new ListUnifiedIntegrationsSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsRequest](../../models/operations/ListUnifiedIntegrationsRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsSecurity](../../models/operations/ListUnifiedIntegrationsSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsResponse](../../models/operations/ListUnifiedIntegrationsResponse.md)**

