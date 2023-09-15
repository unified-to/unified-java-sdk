# Integration

### Available Operations

* [getUnifiedIntegration](#getunifiedintegration) - Returns all integrations
* [getUnifiedIntegrationAuthWorkspaceIdIntegrationType](#getunifiedintegrationauthworkspaceidintegrationtype) - Create connection indirectly
* [getUnifiedIntegrationIntegrationType](#getunifiedintegrationintegrationtype) - Retrieve an integration
* [getUnifiedIntegrationWorkspaceWorkspaceId](#getunifiedintegrationworkspaceworkspaceid) - Returns all activated integrations in a workspace

## getUnifiedIntegration

Returns all integrations

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationCategories;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationResponse;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedIntegrationRequest req = new GetUnifiedIntegrationRequest() {{
                active = false;
                categories = new com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationCategories[]{{
                    add(GetUnifiedIntegrationCategories.MARTECH),
                }};
                limit = 5010.76d;
                offset = 9233.42d;
                order = "deleniti";
                sort = "dignissimos";
                summary = false;
                updatedGte = OffsetDateTime.parse("2022-02-26T21:44:20.533Z");
            }};            

            GetUnifiedIntegrationResponse res = sdk.integration.getUnifiedIntegration(req, new GetUnifiedIntegrationSecurity("adipisci") {{
                jwt = "";
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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationRequest](../../models/operations/GetUnifiedIntegrationRequest.md)   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationSecurity](../../models/operations/GetUnifiedIntegrationSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationResponse](../../models/operations/GetUnifiedIntegrationResponse.md)**


## getUnifiedIntegrationAuthWorkspaceIdIntegrationType

Returns an authorization URL for the specified integration.  Once a successful authorization occurs, a new connection is created.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeResponse;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeScopes;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeRequest req = new GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeRequest("minus", "veniam") {{
                env = "id";
                externalXref = "architecto";
                failureRedirect = "maiores";
                lang = "perspiciatis";
                redirect = false;
                scopes = new com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeScopes[]{{
                    add(GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeScopes.HRIS_EMPLOYEE_WRITE),
                }};
                state = "magni";
                subdomain = "incidunt";
                successRedirect = "fugit";
            }};            

            GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeResponse res = sdk.integration.getUnifiedIntegrationAuthWorkspaceIdIntegrationType(req);

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


## getUnifiedIntegrationIntegrationType

Retrieve an integration

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationIntegrationTypeRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationIntegrationTypeResponse;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationIntegrationTypeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedIntegrationIntegrationTypeRequest req = new GetUnifiedIntegrationIntegrationTypeRequest("quisquam");            

            GetUnifiedIntegrationIntegrationTypeResponse res = sdk.integration.getUnifiedIntegrationIntegrationType(req, new GetUnifiedIntegrationIntegrationTypeSecurity("odio") {{
                jwt = "";
            }});

            if (res.integration != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationIntegrationTypeRequest](../../models/operations/GetUnifiedIntegrationIntegrationTypeRequest.md)   | :heavy_check_mark:                                                                                                                                                 | The request object to use for the request.                                                                                                                         |
| `security`                                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationIntegrationTypeSecurity](../../models/operations/GetUnifiedIntegrationIntegrationTypeSecurity.md) | :heavy_check_mark:                                                                                                                                                 | The security requirements to use for the request.                                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationIntegrationTypeResponse](../../models/operations/GetUnifiedIntegrationIntegrationTypeResponse.md)**


## getUnifiedIntegrationWorkspaceWorkspaceId

No authentication required as this is to be used by front-end interface

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationWorkspaceWorkspaceIdCategories;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationWorkspaceWorkspaceIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationWorkspaceWorkspaceIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedIntegrationWorkspaceWorkspaceIdRequest req = new GetUnifiedIntegrationWorkspaceWorkspaceIdRequest("quidem") {{
                active = false;
                categories = new com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationWorkspaceWorkspaceIdCategories[]{{
                    add(GetUnifiedIntegrationWorkspaceWorkspaceIdCategories.AUTH),
                }};
                env = "aliquid";
                summary = false;
            }};            

            GetUnifiedIntegrationWorkspaceWorkspaceIdResponse res = sdk.integration.getUnifiedIntegrationWorkspaceWorkspaceId(req);

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

| Parameter                                                                                                                                                                  | Type                                                                                                                                                                       | Required                                                                                                                                                                   | Description                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationWorkspaceWorkspaceIdRequest](../../models/operations/GetUnifiedIntegrationWorkspaceWorkspaceIdRequest.md) | :heavy_check_mark:                                                                                                                                                         | The request object to use for the request.                                                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationWorkspaceWorkspaceIdResponse](../../models/operations/GetUnifiedIntegrationWorkspaceWorkspaceIdResponse.md)**

