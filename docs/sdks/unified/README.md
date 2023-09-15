# Unified

### Available Operations

* [deleteUnifiedConnectionId](#deleteunifiedconnectionid) - Remove connection
* [deleteUnifiedUser](#deleteunifieduser) - Delete your user object
* [deleteUnifiedWebhookId](#deleteunifiedwebhookid) - Remove webhook subscription
* [getUnifiedApicall](#getunifiedapicall) - Returns API Calls
* [getUnifiedApicallId](#getunifiedapicallid) - Retrieve specific API Call by its ID
* [getUnifiedConnection](#getunifiedconnection) - List all connections
* [getUnifiedConnectionId](#getunifiedconnectionid) - Retrieve connection
* [getUnifiedIntegration](#getunifiedintegration) - Returns all integrations
* [getUnifiedIntegrationAuthWorkspaceIdIntegrationType](#getunifiedintegrationauthworkspaceidintegrationtype) - Create connection indirectly
* [getUnifiedIntegrationIntegrationType](#getunifiedintegrationintegrationtype) - Retrieve an integration
* [getUnifiedIntegrationWorkspaceWorkspaceId](#getunifiedintegrationworkspaceworkspaceid) - Returns all activated integrations in a workspace
* [getUnifiedUser](#getunifieduser) - Retrieve your user object
* [getUnifiedUserToken](#getunifiedusertoken) - Retrieve your user token
* [getUnifiedWebhook](#getunifiedwebhook) - Returns all registered webhooks
* [getUnifiedWebhookId](#getunifiedwebhookid) - Retrieve webhook by its ID
* [patchUnifiedConnectionId](#patchunifiedconnectionid) - Update connection
* [patchUnifiedUser](#patchunifieduser) - Updates your user object
* [postUnifiedConnection](#postunifiedconnection) - Create connection
* [postUnifiedWebhookConnectionIdObject](#postunifiedwebhookconnectionidobject) - Create webhook subscription
* [putUnifiedConnectionId](#putunifiedconnectionid) - Update connection
* [putUnifiedUser](#putunifieduser) - Updates your user object

## deleteUnifiedConnectionId

Remove connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedConnectionIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedConnectionIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedConnectionIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteUnifiedConnectionIdRequest req = new DeleteUnifiedConnectionIdRequest("natus");            

            DeleteUnifiedConnectionIdResponse res = sdk.unified.deleteUnifiedConnectionId(req, new DeleteUnifiedConnectionIdSecurity("ad") {{
                jwt = "";
            }});

            if (res.statusCode == 200) {
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
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.DeleteUnifiedConnectionIdRequest](../../models/operations/DeleteUnifiedConnectionIdRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.DeleteUnifiedConnectionIdSecurity](../../models/operations/DeleteUnifiedConnectionIdSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteUnifiedConnectionIdResponse](../../models/operations/DeleteUnifiedConnectionIdResponse.md)**


## deleteUnifiedUser

Delete your user object

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedUserResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedUserSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteUnifiedUserResponse res = sdk.unified.deleteUnifiedUser(new DeleteUnifiedUserSecurity("cum") {{
                jwt = "";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.DeleteUnifiedUserSecurity](../../models/operations/DeleteUnifiedUserSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteUnifiedUserResponse](../../models/operations/DeleteUnifiedUserResponse.md)**


## deleteUnifiedWebhookId

Remove webhook subscription

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedWebhookIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedWebhookIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedWebhookIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteUnifiedWebhookIdRequest req = new DeleteUnifiedWebhookIdRequest("dolorum");            

            DeleteUnifiedWebhookIdResponse res = sdk.unified.deleteUnifiedWebhookId(req, new DeleteUnifiedWebhookIdSecurity("quod") {{
                jwt = "";
            }});

            if (res.statusCode == 200) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.DeleteUnifiedWebhookIdRequest](../../models/operations/DeleteUnifiedWebhookIdRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.DeleteUnifiedWebhookIdSecurity](../../models/operations/DeleteUnifiedWebhookIdSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteUnifiedWebhookIdResponse](../../models/operations/DeleteUnifiedWebhookIdResponse.md)**


## getUnifiedApicall

Returns API Calls

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallResponse;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedApicallRequest req = new GetUnifiedApicallRequest() {{
                connectionId = "nihil";
                createdLte = OffsetDateTime.parse("2022-07-03T21:15:21.218Z");
                env = "tenetur";
                error = false;
                externalXref = "eaque";
                integrationType = "ex";
                limit = 6996.06d;
                offset = 1700.97d;
                order = "laudantium";
                sort = "repudiandae";
                updatedGte = OffsetDateTime.parse("2020-08-25T12:42:19.724Z");
            }};            

            GetUnifiedApicallResponse res = sdk.unified.getUnifiedApicall(req, new GetUnifiedApicallSecurity("atque") {{
                jwt = "";
            }});

            if (res.apiCalls != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallRequest](../../models/operations/GetUnifiedApicallRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallSecurity](../../models/operations/GetUnifiedApicallSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallResponse](../../models/operations/GetUnifiedApicallResponse.md)**


## getUnifiedApicallId

Retrieve specific API Call by its ID

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedApicallIdRequest req = new GetUnifiedApicallIdRequest("autem");            

            GetUnifiedApicallIdResponse res = sdk.unified.getUnifiedApicallId(req, new GetUnifiedApicallIdSecurity("eius") {{
                jwt = "";
            }});

            if (res.apiCall != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallIdRequest](../../models/operations/GetUnifiedApicallIdRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallIdSecurity](../../models/operations/GetUnifiedApicallIdSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallIdResponse](../../models/operations/GetUnifiedApicallIdResponse.md)**


## getUnifiedConnection

List all connections

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionCategories;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionResponse;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedConnectionRequest req = new GetUnifiedConnectionRequest() {{
                categories = new com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionCategories[]{{
                    add(GetUnifiedConnectionCategories.ENRICH),
                }};
                env = "sunt";
                externalXref = "amet";
                limit = 5118.79d;
                offset = 4131.3d;
                order = "a";
                sort = "aliquid";
                updatedGte = OffsetDateTime.parse("2022-03-31T18:36:20.568Z");
            }};            

            GetUnifiedConnectionResponse res = sdk.unified.getUnifiedConnection(req, new GetUnifiedConnectionSecurity("perspiciatis") {{
                jwt = "";
            }});

            if (res.connections != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionRequest](../../models/operations/GetUnifiedConnectionRequest.md)   | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionSecurity](../../models/operations/GetUnifiedConnectionSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionResponse](../../models/operations/GetUnifiedConnectionResponse.md)**


## getUnifiedConnectionId

Retrieve connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedConnectionIdRequest req = new GetUnifiedConnectionIdRequest("eum");            

            GetUnifiedConnectionIdResponse res = sdk.unified.getUnifiedConnectionId(req, new GetUnifiedConnectionIdSecurity("sint") {{
                jwt = "";
            }});

            if (res.connection != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionIdRequest](../../models/operations/GetUnifiedConnectionIdRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionIdSecurity](../../models/operations/GetUnifiedConnectionIdSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionIdResponse](../../models/operations/GetUnifiedConnectionIdResponse.md)**


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
                limit = 2765.07d;
                offset = 7900.8d;
                order = "quod";
                sort = "laboriosam";
                summary = false;
                updatedGte = OffsetDateTime.parse("2022-02-13T18:05:25.054Z");
            }};            

            GetUnifiedIntegrationResponse res = sdk.unified.getUnifiedIntegration(req, new GetUnifiedIntegrationSecurity("praesentium") {{
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

            GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeRequest req = new GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeRequest("totam", "error") {{
                env = "alias";
                externalXref = "deserunt";
                failureRedirect = "sequi";
                lang = "sapiente";
                redirect = false;
                scopes = new com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeScopes[]{{
                    add(GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeScopes.HRIS_GROUP_WRITE),
                }};
                state = "nesciunt";
                subdomain = "optio";
                successRedirect = "corrupti";
            }};            

            GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeResponse res = sdk.unified.getUnifiedIntegrationAuthWorkspaceIdIntegrationType(req);

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

            GetUnifiedIntegrationIntegrationTypeRequest req = new GetUnifiedIntegrationIntegrationTypeRequest("inventore");            

            GetUnifiedIntegrationIntegrationTypeResponse res = sdk.unified.getUnifiedIntegrationIntegrationType(req, new GetUnifiedIntegrationIntegrationTypeSecurity("quibusdam") {{
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

            GetUnifiedIntegrationWorkspaceWorkspaceIdRequest req = new GetUnifiedIntegrationWorkspaceWorkspaceIdRequest("culpa") {{
                active = false;
                categories = new com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationWorkspaceWorkspaceIdCategories[]{{
                    add(GetUnifiedIntegrationWorkspaceWorkspaceIdCategories.HRIS),
                }};
                env = "perferendis";
                summary = false;
            }};            

            GetUnifiedIntegrationWorkspaceWorkspaceIdResponse res = sdk.unified.getUnifiedIntegrationWorkspaceWorkspaceId(req);

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


## getUnifiedUser

Retrieve your user object

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedUserResponse;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedUserSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedUserResponse res = sdk.unified.getUnifiedUser(new GetUnifiedUserSecurity("asperiores") {{
                jwt = "";
            }});

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetUnifiedUserSecurity](../../models/operations/GetUnifiedUserSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedUserResponse](../../models/operations/GetUnifiedUserResponse.md)**


## getUnifiedUserToken

Retrieve your user token

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedUserTokenResponse;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedUserTokenSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedUserTokenResponse res = sdk.unified.getUnifiedUserToken(new GetUnifiedUserTokenSecurity("deleniti") {{
                jwt = "";
            }});

            if (res.getUnifiedUserToken200ApplicationJSONString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetUnifiedUserTokenSecurity](../../models/operations/GetUnifiedUserTokenSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedUserTokenResponse](../../models/operations/GetUnifiedUserTokenResponse.md)**


## getUnifiedWebhook

Returns all registered webhooks

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookResponse;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedWebhookRequest req = new GetUnifiedWebhookRequest() {{
                env = "optio";
                limit = 1614.81d;
                object = "non";
                offset = 8534.53d;
                order = "voluptatibus";
                sort = "iste";
                updatedGte = OffsetDateTime.parse("2022-12-08T15:30:54.485Z");
            }};            

            GetUnifiedWebhookResponse res = sdk.unified.getUnifiedWebhook(req, new GetUnifiedWebhookSecurity("pariatur") {{
                jwt = "";
            }});

            if (res.webhooks != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookRequest](../../models/operations/GetUnifiedWebhookRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookSecurity](../../models/operations/GetUnifiedWebhookSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookResponse](../../models/operations/GetUnifiedWebhookResponse.md)**


## getUnifiedWebhookId

Retrieve webhook by its ID

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedWebhookIdRequest req = new GetUnifiedWebhookIdRequest("officia");            

            GetUnifiedWebhookIdResponse res = sdk.unified.getUnifiedWebhookId(req, new GetUnifiedWebhookIdSecurity("velit") {{
                jwt = "";
            }});

            if (res.webhook != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookIdRequest](../../models/operations/GetUnifiedWebhookIdRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookIdSecurity](../../models/operations/GetUnifiedWebhookIdSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookIdResponse](../../models/operations/GetUnifiedWebhookIdResponse.md)**


## patchUnifiedConnectionId

Update connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionIdSecurity;
import com.unifiedapi.unifiedto.models.shared.Connection;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionAuth;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions;
import com.unifiedapi.unifiedto.models.shared.PropertyPropertyConnectionAuthMeta;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchUnifiedConnectionIdRequest req = new PatchUnifiedConnectionIdRequest("debitis") {{
                connection = new Connection(                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                                    add(PropertyConnectionCategories.TICKETING),
                                }}, "tempore",                 new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                                    add(PropertyConnectionPermissions.CRM_LEAD_READ),
                                }}) {{
                    auth = new PropertyConnectionAuth() {{
                        accessToken = "vitae";
                        apiUrl = "repellat";
                        appId = "est";
                        authorizeUrl = "facere";
                        clientId = "iste";
                        clientSecret = "numquam";
                        consumerKey = "similique";
                        consumerSecret = "optio";
                        emails = new String[]{{
                            add("minus"),
                        }};
                        expiresIn = 5737.28d;
                        expiryDate = OffsetDateTime.parse("2022-10-08T03:33:36.166Z");
                        key = "ullam";
                        meta = new PropertyPropertyConnectionAuthMeta();;
                        name = "Peggy Kilback";
                        otherAuthInfo = new String[]{{
                            add("ea"),
                        }};
                        pem = "quibusdam";
                        refreshToken = "veritatis";
                        state = "ad";
                        token = "velit";
                        tokenUrl = "quia";
                    }};;
                    authAwsArn = "dicta";
                    createdAt = OffsetDateTime.parse("2021-11-22T05:00:45.946Z");
                    environment = "velit";
                    externalXref = "ratione";
                    id = "a56d6918-0ff6-40eb-9a66-58e69a4b843d";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2022-06-25T06:33:30.748Z");
                    workspaceId = "explicabo";
                }};;
            }};            

            PatchUnifiedConnectionIdResponse res = sdk.unified.patchUnifiedConnectionId(req, new PatchUnifiedConnectionIdSecurity("quibusdam") {{
                jwt = "";
            }});

            if (res.connection != null) {
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
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionIdRequest](../../models/operations/PatchUnifiedConnectionIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionIdSecurity](../../models/operations/PatchUnifiedConnectionIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionIdResponse](../../models/operations/PatchUnifiedConnectionIdResponse.md)**


## patchUnifiedUser

Only the name field is updated.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedUserResponse;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedUserSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyUserMeta;
import com.unifiedapi.unifiedto.models.shared.User;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            com.unifiedapi.unifiedto.models.shared.User req = new User("harum", "itaque",                 new String[]{{
                                add("porro"),
                            }}) {{
                createdAt = OffsetDateTime.parse("2022-09-04T21:09:32.258Z");
                email = "Haleigh.Lockman1@hotmail.com";
                environment = "nisi";
                id = "59468ce3-04d8-4849-bf82-14c337f96bb0";
                meta = new PropertyUserMeta();;
                updatedAt = OffsetDateTime.parse("2021-09-21T09:19:07.430Z");
            }};            

            PatchUnifiedUserResponse res = sdk.unified.patchUnifiedUser(req, new PatchUnifiedUserSecurity("omnis") {{
                jwt = "";
            }});

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.shared.User](../../models/shared/User.md)                                                 | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PatchUnifiedUserSecurity](../../models/operations/PatchUnifiedUserSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchUnifiedUserResponse](../../models/operations/PatchUnifiedUserResponse.md)**


## postUnifiedConnection

Create connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostUnifiedConnectionResponse;
import com.unifiedapi.unifiedto.models.operations.PostUnifiedConnectionSecurity;
import com.unifiedapi.unifiedto.models.shared.Connection;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionAuth;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions;
import com.unifiedapi.unifiedto.models.shared.PropertyPropertyConnectionAuthMeta;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            com.unifiedapi.unifiedto.models.shared.Connection req = new Connection(                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                                add(PropertyConnectionCategories.UC),
                            }}, "adipisci",                 new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                                add(PropertyConnectionPermissions.CRM_TEAM_READ),
                            }}) {{
                auth = new PropertyConnectionAuth() {{
                    accessToken = "fugit";
                    apiUrl = "facere";
                    appId = "libero";
                    authorizeUrl = "vitae";
                    clientId = "non";
                    clientSecret = "labore";
                    consumerKey = "incidunt";
                    consumerSecret = "tempore";
                    emails = new String[]{{
                        add("deserunt"),
                    }};
                    expiresIn = 6213.54d;
                    expiryDate = OffsetDateTime.parse("2021-09-02T17:56:52.098Z");
                    key = "rem";
                    meta = new PropertyPropertyConnectionAuthMeta();;
                    name = "Dr. Wesley Russel";
                    otherAuthInfo = new String[]{{
                        add("reprehenderit"),
                    }};
                    pem = "laborum";
                    refreshToken = "officia";
                    state = "soluta";
                    token = "suscipit";
                    tokenUrl = "explicabo";
                }};;
                authAwsArn = "recusandae";
                createdAt = OffsetDateTime.parse("2022-01-15T02:25:17.319Z");
                environment = "aspernatur";
                externalXref = "ea";
                id = "1fb0c58d-27b5-4199-ab5b-4b50eef712b7";
                isPaused = false;
                updatedAt = OffsetDateTime.parse("2022-01-03T08:18:14.300Z");
                workspaceId = "similique";
            }};            

            PostUnifiedConnectionResponse res = sdk.unified.postUnifiedConnection(req, new PostUnifiedConnectionSecurity("expedita") {{
                jwt = "";
            }});

            if (res.connection != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.shared.Connection](../../models/shared/Connection.md)                                               | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PostUnifiedConnectionSecurity](../../models/operations/PostUnifiedConnectionSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostUnifiedConnectionResponse](../../models/operations/PostUnifiedConnectionResponse.md)**


## postUnifiedWebhookConnectionIdObject

To maintain compatibility with the webhooks specification and Zapier webhooks, only the hook_url field is required in the payload when creating a Webhook.  When updated/new objects are found, the array of objects will be POSTed to the hook_url with the paramater hookId=<hookId>.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectEvents;
import com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectRequest;
import com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectResponse;
import com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyWebhookEvents;
import com.unifiedapi.unifiedto.models.shared.Webhook;
import com.unifiedapi.unifiedto.models.shared.WebhookObjectType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostUnifiedWebhookConnectionIdObjectRequest req = new PostUnifiedWebhookConnectionIdObjectRequest("voluptatem", "adipisci") {{
                webhook = new Webhook("tempora",                 new com.unifiedapi.unifiedto.models.shared.PropertyWebhookEvents[]{{
                                    add(PropertyWebhookEvents.UPDATED),
                                }}, "soluta", "inventore", 4958.07d, WebhookObjectType.ATS_INTERVIEW, "sit") {{
                    checkedAt = OffsetDateTime.parse("2022-06-22T19:43:24.907Z");
                    createdAt = OffsetDateTime.parse("2021-04-22T02:27:30.544Z");
                    environment = "necessitatibus";
                    id = "ebef897f-3dd0-4ccd-b3f1-1b3e4e080aa1";
                    includeRaw = false;
                    subscriptions = new String[]{{
                        add("ipsa"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-11-25T00:50:44.199Z");
                }};;
                events = new com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectEvents[]{{
                    add(PostUnifiedWebhookConnectionIdObjectEvents.CREATED),
                }};
            }};            

            PostUnifiedWebhookConnectionIdObjectResponse res = sdk.unified.postUnifiedWebhookConnectionIdObject(req, new PostUnifiedWebhookConnectionIdObjectSecurity("eum") {{
                jwt = "";
            }});

            if (res.webhook != null) {
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
| `request`                                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectRequest](../../models/operations/PostUnifiedWebhookConnectionIdObjectRequest.md)   | :heavy_check_mark:                                                                                                                                                 | The request object to use for the request.                                                                                                                         |
| `security`                                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectSecurity](../../models/operations/PostUnifiedWebhookConnectionIdObjectSecurity.md) | :heavy_check_mark:                                                                                                                                                 | The security requirements to use for the request.                                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectResponse](../../models/operations/PostUnifiedWebhookConnectionIdObjectResponse.md)**


## putUnifiedConnectionId

Update connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutUnifiedConnectionIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutUnifiedConnectionIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutUnifiedConnectionIdSecurity;
import com.unifiedapi.unifiedto.models.shared.Connection;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionAuth;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions;
import com.unifiedapi.unifiedto.models.shared.PropertyPropertyConnectionAuthMeta;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutUnifiedConnectionIdRequest req = new PutUnifiedConnectionIdRequest("accusamus") {{
                connection = new Connection(                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                                    add(PropertyConnectionCategories.MARTECH),
                                }}, "odio",                 new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                                    add(PropertyConnectionPermissions.CRM_LEAD_WRITE),
                                }}) {{
                    auth = new PropertyConnectionAuth() {{
                        accessToken = "provident";
                        apiUrl = "officiis";
                        appId = "ipsa";
                        authorizeUrl = "eos";
                        clientId = "delectus";
                        clientSecret = "dolor";
                        consumerKey = "dignissimos";
                        consumerSecret = "doloremque";
                        emails = new String[]{{
                            add("consequuntur"),
                        }};
                        expiresIn = 8062.61d;
                        expiryDate = OffsetDateTime.parse("2022-03-26T22:18:03.848Z");
                        key = "laudantium";
                        meta = new PropertyPropertyConnectionAuthMeta();;
                        name = "Harry Stiedemann DVM";
                        otherAuthInfo = new String[]{{
                            add("culpa"),
                        }};
                        pem = "at";
                        refreshToken = "dolorem";
                        state = "sunt";
                        token = "ipsa";
                        tokenUrl = "incidunt";
                    }};;
                    authAwsArn = "maiores";
                    createdAt = OffsetDateTime.parse("2022-05-30T02:37:49.056Z");
                    environment = "eius";
                    externalXref = "iure";
                    id = "07bf375b-4428-4282-9fdb-2f69e59267c7";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2022-03-23T05:21:51.303Z");
                    workspaceId = "optio";
                }};;
            }};            

            PutUnifiedConnectionIdResponse res = sdk.unified.putUnifiedConnectionId(req, new PutUnifiedConnectionIdSecurity("voluptatum") {{
                jwt = "";
            }});

            if (res.connection != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PutUnifiedConnectionIdRequest](../../models/operations/PutUnifiedConnectionIdRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PutUnifiedConnectionIdSecurity](../../models/operations/PutUnifiedConnectionIdSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutUnifiedConnectionIdResponse](../../models/operations/PutUnifiedConnectionIdResponse.md)**


## putUnifiedUser

Only the name field is updated.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutUnifiedUserResponse;
import com.unifiedapi.unifiedto.models.operations.PutUnifiedUserSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyUserMeta;
import com.unifiedapi.unifiedto.models.shared.User;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            com.unifiedapi.unifiedto.models.shared.User req = new User("pariatur", "sequi",                 new String[]{{
                                add("quo"),
                            }}) {{
                createdAt = OffsetDateTime.parse("2022-02-21T08:11:19.907Z");
                email = "Eusebio.Lehner22@gmail.com";
                environment = "ipsam";
                id = "8a82c808-fe27-451a-a047-c0449e143f96";
                meta = new PropertyUserMeta();;
                updatedAt = OffsetDateTime.parse("2022-06-07T18:23:59.146Z");
            }};            

            PutUnifiedUserResponse res = sdk.unified.putUnifiedUser(req, new PutUnifiedUserSecurity("distinctio") {{
                jwt = "";
            }});

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.shared.User](../../models/shared/User.md)                                             | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PutUnifiedUserSecurity](../../models/operations/PutUnifiedUserSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutUnifiedUserResponse](../../models/operations/PutUnifiedUserResponse.md)**

