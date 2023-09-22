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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("laudantium") {{
                    jwt = "";
                }})
                .build();

            DeleteUnifiedConnectionIdRequest req = new DeleteUnifiedConnectionIdRequest("commodi");            

            DeleteUnifiedConnectionIdResponse res = sdk.unified.deleteUnifiedConnectionId(req);

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.DeleteUnifiedConnectionIdRequest](../../models/operations/DeleteUnifiedConnectionIdRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteUnifiedConnectionIdResponse](../../models/operations/DeleteUnifiedConnectionIdResponse.md)**


## deleteUnifiedUser

Delete your user object

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedUserResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("a") {{
                    jwt = "";
                }})
                .build();

            DeleteUnifiedUserResponse res = sdk.unified.deleteUnifiedUser();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("aliquid") {{
                    jwt = "";
                }})
                .build();

            DeleteUnifiedWebhookIdRequest req = new DeleteUnifiedWebhookIdRequest("qui");            

            DeleteUnifiedWebhookIdResponse res = sdk.unified.deleteUnifiedWebhookId(req);

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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.DeleteUnifiedWebhookIdRequest](../../models/operations/DeleteUnifiedWebhookIdRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("eligendi") {{
                    jwt = "";
                }})
                .build();

            GetUnifiedApicallRequest req = new GetUnifiedApicallRequest() {{
                connectionId = "perspiciatis";
                createdLte = OffsetDateTime.parse("2022-06-04T16:12:34.148Z");
                env = "eligendi";
                error = false;
                externalXref = "incidunt";
                integrationType = "quisquam";
                limit = 7977.92d;
                offset = 3856.2d;
                order = "quidem";
                sort = "reprehenderit";
                updatedGte = OffsetDateTime.parse("2021-12-16T21:03:20.387Z");
            }};            

            GetUnifiedApicallResponse res = sdk.unified.getUnifiedApicall(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallRequest](../../models/operations/GetUnifiedApicallRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("error") {{
                    jwt = "";
                }})
                .build();

            GetUnifiedApicallIdRequest req = new GetUnifiedApicallIdRequest("alias");            

            GetUnifiedApicallIdResponse res = sdk.unified.getUnifiedApicallId(req);

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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallIdRequest](../../models/operations/GetUnifiedApicallIdRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("deserunt") {{
                    jwt = "";
                }})
                .build();

            GetUnifiedConnectionRequest req = new GetUnifiedConnectionRequest() {{
                categories = new com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionCategories[]{{
                    add(GetUnifiedConnectionCategories.HRIS),
                }};
                env = "sapiente";
                externalXref = "illum";
                limit = 2026.93d;
                offset = 7609.41d;
                order = "corrupti";
                sort = "inventore";
                updatedGte = OffsetDateTime.parse("2021-02-04T18:53:21.003Z");
            }};            

            GetUnifiedConnectionResponse res = sdk.unified.getUnifiedConnection(req);

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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionRequest](../../models/operations/GetUnifiedConnectionRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("dicta") {{
                    jwt = "";
                }})
                .build();

            GetUnifiedConnectionIdRequest req = new GetUnifiedConnectionIdRequest("perferendis");            

            GetUnifiedConnectionIdResponse res = sdk.unified.getUnifiedConnectionId(req);

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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionIdRequest](../../models/operations/GetUnifiedConnectionIdRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("asperiores") {{
                    jwt = "";
                }})
                .build();

            GetUnifiedIntegrationRequest req = new GetUnifiedIntegrationRequest() {{
                active = false;
                categories = new com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationCategories[]{{
                    add(GetUnifiedIntegrationCategories.CRM),
                }};
                limit = 7596.13d;
                offset = 1614.81d;
                order = "non";
                sort = "fugiat";
                summary = false;
                updatedGte = OffsetDateTime.parse("2021-02-26T18:39:20.796Z");
            }};            

            GetUnifiedIntegrationResponse res = sdk.unified.getUnifiedIntegration(req);

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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationRequest](../../models/operations/GetUnifiedIntegrationRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("amet") {{
                    jwt = "";
                }})
                .build();

            GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeRequest req = new GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeRequest("quae", "pariatur") {{
                env = "officia";
                externalXref = "velit";
                failureRedirect = "debitis";
                lang = "facere";
                redirect = false;
                scopes = new com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeScopes[]{{
                    add(GetUnifiedIntegrationAuthWorkspaceIdIntegrationTypeScopes.TICKETING_NOTE_READ),
                }};
                state = "minima";
                subdomain = "vitae";
                successRedirect = "repellat";
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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("est") {{
                    jwt = "";
                }})
                .build();

            GetUnifiedIntegrationIntegrationTypeRequest req = new GetUnifiedIntegrationIntegrationTypeRequest("facere");            

            GetUnifiedIntegrationIntegrationTypeResponse res = sdk.unified.getUnifiedIntegrationIntegrationType(req);

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

| Parameter                                                                                                                                                        | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationIntegrationTypeRequest](../../models/operations/GetUnifiedIntegrationIntegrationTypeRequest.md) | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("iste") {{
                    jwt = "";
                }})
                .build();

            GetUnifiedIntegrationWorkspaceWorkspaceIdRequest req = new GetUnifiedIntegrationWorkspaceWorkspaceIdRequest("numquam") {{
                active = false;
                categories = new com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationWorkspaceWorkspaceIdCategories[]{{
                    add(GetUnifiedIntegrationWorkspaceWorkspaceIdCategories.ENRICH),
                }};
                env = "optio";
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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("minus") {{
                    jwt = "";
                }})
                .build();

            GetUnifiedUserResponse res = sdk.unified.getUnifiedUser();

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedUserResponse](../../models/operations/GetUnifiedUserResponse.md)**


## getUnifiedUserToken

Retrieve your user token

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedUserTokenResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("sint") {{
                    jwt = "";
                }})
                .build();

            GetUnifiedUserTokenResponse res = sdk.unified.getUnifiedUserToken();

            if (res.getUnifiedUserToken200ApplicationJSONString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("aliquam") {{
                    jwt = "";
                }})
                .build();

            GetUnifiedWebhookRequest req = new GetUnifiedWebhookRequest() {{
                env = "consectetur";
                limit = 3554.68d;
                object = "dicta";
                offset = 2018.16d;
                order = "reprehenderit";
                sort = "esse";
                updatedGte = OffsetDateTime.parse("2022-08-04T09:46:19.317Z");
            }};            

            GetUnifiedWebhookResponse res = sdk.unified.getUnifiedWebhook(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookRequest](../../models/operations/GetUnifiedWebhookRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("quibusdam") {{
                    jwt = "";
                }})
                .build();

            GetUnifiedWebhookIdRequest req = new GetUnifiedWebhookIdRequest("veritatis");            

            GetUnifiedWebhookIdResponse res = sdk.unified.getUnifiedWebhookId(req);

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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookIdRequest](../../models/operations/GetUnifiedWebhookIdRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


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
import com.unifiedapi.unifiedto.models.shared.Connection;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionAuth;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions;
import com.unifiedapi.unifiedto.models.shared.PropertyPropertyConnectionAuthMeta;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("ad") {{
                    jwt = "";
                }})
                .build();

            PatchUnifiedConnectionIdRequest req = new PatchUnifiedConnectionIdRequest("velit") {{
                connection = new Connection(                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                                    add(PropertyConnectionCategories.HRIS),
                                }}, "dicta",                 new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                                    add(PropertyConnectionPermissions.TICKETING_NOTE_READ),
                                }}) {{
                    auth = new PropertyConnectionAuth() {{
                        accessToken = "quos";
                        apiUrl = "velit";
                        appId = "ratione";
                        authorizeUrl = "fuga";
                        clientId = "minima";
                        clientSecret = "aliquid";
                        consumerKey = "facere";
                        consumerSecret = "laboriosam";
                        emails = new String[]{{
                            add("sint"),
                        }};
                        expiresIn = 1038.74d;
                        expiryDate = OffsetDateTime.parse("2022-12-31T00:52:18.100Z");
                        key = "hic";
                        meta = new PropertyPropertyConnectionAuthMeta();;
                        name = "Brad Altenwerth";
                        otherAuthInfo = new String[]{{
                            add("occaecati"),
                        }};
                        pem = "fuga";
                        refreshToken = "ex";
                        state = "autem";
                        token = "nostrum";
                        tokenUrl = "atque";
                    }};;
                    authAwsArn = "saepe";
                    createdAt = OffsetDateTime.parse("2022-06-08T16:27:02.035Z");
                    environment = "fuga";
                    externalXref = "non";
                    id = "b843d382-dbec-475c-a8c6-0659468ce304";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2021-05-21T22:29:01.030Z");
                    workspaceId = "quas";
                }};;
            }};            

            PatchUnifiedConnectionIdResponse res = sdk.unified.patchUnifiedConnectionId(req);

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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionIdRequest](../../models/operations/PatchUnifiedConnectionIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionIdResponse](../../models/operations/PatchUnifiedConnectionIdResponse.md)**


## patchUnifiedUser

Only the name field is updated.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedUserResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyUserMeta;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.User;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("magnam") {{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.shared.User req = new User("cupiditate", "expedita",                 new String[]{{
                                add("sapiente"),
                            }}) {{
                createdAt = OffsetDateTime.parse("2022-09-29T08:28:46.977Z");
                email = "Dovie21@gmail.com";
                environment = "nihil";
                id = "f96bb0c6-9e37-42db-9344-ba9f78a5c0ed";
                meta = new PropertyUserMeta();;
                updatedAt = OffsetDateTime.parse("2022-04-29T13:00:48.899Z");
            }};            

            PatchUnifiedUserResponse res = sdk.unified.patchUnifiedUser(req);

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

| Parameter                                                                  | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `request`                                                                  | [com.unifiedapi.unifiedto.models.shared.User](../../models/shared/User.md) | :heavy_check_mark:                                                         | The request object to use for the request.                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchUnifiedUserResponse](../../models/operations/PatchUnifiedUserResponse.md)**


## postUnifiedConnection

Create connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostUnifiedConnectionResponse;
import com.unifiedapi.unifiedto.models.shared.Connection;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionAuth;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions;
import com.unifiedapi.unifiedto.models.shared.PropertyPropertyConnectionAuthMeta;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("officia") {{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.shared.Connection req = new Connection(                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                                add(PropertyConnectionCategories.MARTECH),
                            }}, "suscipit",                 new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                                add(PropertyConnectionPermissions.CRM_COMPANY_READ),
                            }}) {{
                auth = new PropertyConnectionAuth() {{
                    accessToken = "recusandae";
                    apiUrl = "unde";
                    appId = "iusto";
                    authorizeUrl = "aspernatur";
                    clientId = "ea";
                    clientSecret = "architecto";
                    consumerKey = "earum";
                    consumerSecret = "cum";
                    emails = new String[]{{
                        add("alias"),
                    }};
                    expiresIn = 8016.71d;
                    expiryDate = OffsetDateTime.parse("2022-06-15T02:12:07.821Z");
                    key = "temporibus";
                    meta = new PropertyPropertyConnectionAuthMeta();;
                    name = "Maureen Rohan V";
                    otherAuthInfo = new String[]{{
                        add("cupiditate"),
                    }};
                    pem = "ex";
                    refreshToken = "tempore";
                    state = "minima";
                    token = "expedita";
                    tokenUrl = "modi";
                }};;
                authAwsArn = "expedita";
                createdAt = OffsetDateTime.parse("2022-12-18T06:58:16.772Z");
                environment = "recusandae";
                externalXref = "saepe";
                id = "f712b7a7-ab03-444b-9710-688deebef897";
                isPaused = false;
                updatedAt = OffsetDateTime.parse("2022-04-08T10:37:22.639Z");
                workspaceId = "fugiat";
            }};            

            PostUnifiedConnectionResponse res = sdk.unified.postUnifiedConnection(req);

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

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `request`                                                                              | [com.unifiedapi.unifiedto.models.shared.Connection](../../models/shared/Connection.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


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
import com.unifiedapi.unifiedto.models.shared.PropertyWebhookEvents;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Webhook;
import com.unifiedapi.unifiedto.models.shared.WebhookObjectType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("pariatur") {{
                    jwt = "";
                }})
                .build();

            PostUnifiedWebhookConnectionIdObjectRequest req = new PostUnifiedWebhookConnectionIdObjectRequest("voluptatem", "quod") {{
                webhook = new Webhook("minus",                 new com.unifiedapi.unifiedto.models.shared.PropertyWebhookEvents[]{{
                                    add(PropertyWebhookEvents.CREATED),
                                }}, "dolor", "amet", 9483.01d, WebhookObjectType.ATS_DOCUMENT, "dicta") {{
                    checkedAt = OffsetDateTime.parse("2022-08-04T00:06:02.333Z");
                    createdAt = OffsetDateTime.parse("2022-02-02T19:33:56.131Z");
                    environment = "voluptates";
                    id = "080aa104-186e-4c75-9e02-f3702c5c8e2d";
                    includeRaw = false;
                    subscriptions = new String[]{{
                        add("sequi"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-01-31T16:44:35.094Z");
                }};;
                events = new com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectEvents[]{{
                    add(PostUnifiedWebhookConnectionIdObjectEvents.CREATED),
                }};
            }};            

            PostUnifiedWebhookConnectionIdObjectResponse res = sdk.unified.postUnifiedWebhookConnectionIdObject(req);

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

| Parameter                                                                                                                                                        | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectRequest](../../models/operations/PostUnifiedWebhookConnectionIdObjectRequest.md) | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.Connection;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionAuth;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions;
import com.unifiedapi.unifiedto.models.shared.PropertyPropertyConnectionAuthMeta;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("at") {{
                    jwt = "";
                }})
                .build();

            PutUnifiedConnectionIdRequest req = new PutUnifiedConnectionIdRequest("dolorem") {{
                connection = new Connection(                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                                    add(PropertyConnectionCategories.HRIS),
                                }}, "ipsa",                 new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                                    add(PropertyConnectionPermissions.CRM_EVENT_WRITE),
                                }}) {{
                    auth = new PropertyConnectionAuth() {{
                        accessToken = "maiores";
                        apiUrl = "culpa";
                        appId = "dolore";
                        authorizeUrl = "eius";
                        clientId = "iure";
                        clientSecret = "alias";
                        consumerKey = "molestiae";
                        consumerSecret = "rerum";
                        emails = new String[]{{
                            add("voluptatibus"),
                        }};
                        expiresIn = 1930.78d;
                        expiryDate = OffsetDateTime.parse("2022-09-04T09:23:21.254Z");
                        key = "libero";
                        meta = new PropertyPropertyConnectionAuthMeta();;
                        name = "Anita Cremin";
                        otherAuthInfo = new String[]{{
                            add("laudantium"),
                        }};
                        pem = "fugit";
                        refreshToken = "et";
                        state = "reiciendis";
                        token = "nulla";
                        tokenUrl = "libero";
                    }};;
                    authAwsArn = "sed";
                    createdAt = OffsetDateTime.parse("2021-09-13T03:45:37.385Z");
                    environment = "sint";
                    externalXref = "eveniet";
                    id = "59267c71-cc8d-43cd-8258-d0358a82c808";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2020-04-10T06:08:51.506Z");
                    workspaceId = "odit";
                }};;
            }};            

            PutUnifiedConnectionIdResponse res = sdk.unified.putUnifiedConnectionId(req);

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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PutUnifiedConnectionIdRequest](../../models/operations/PutUnifiedConnectionIdRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutUnifiedConnectionIdResponse](../../models/operations/PutUnifiedConnectionIdResponse.md)**


## putUnifiedUser

Only the name field is updated.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutUnifiedUserResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyUserMeta;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.User;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("quam") {{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.shared.User req = new User("ullam", "inventore",                 new String[]{{
                                add("laborum"),
                            }}) {{
                createdAt = OffsetDateTime.parse("2022-12-24T21:17:10.090Z");
                email = "Jerome25@gmail.com";
                environment = "numquam";
                id = "9e143f96-19bb-47d4-8d5a-11fa436e6259";
                meta = new PropertyUserMeta();;
                updatedAt = OffsetDateTime.parse("2022-10-04T12:31:07.556Z");
            }};            

            PutUnifiedUserResponse res = sdk.unified.putUnifiedUser(req);

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

| Parameter                                                                  | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `request`                                                                  | [com.unifiedapi.unifiedto.models.shared.User](../../models/shared/User.md) | :heavy_check_mark:                                                         | The request object to use for the request.                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutUnifiedUserResponse](../../models/operations/PutUnifiedUserResponse.md)**

