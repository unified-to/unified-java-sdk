# Unified
(*unified*)

### Available Operations

* [createUnifiedConnection](#createunifiedconnection) - Create connection
* [createUnifiedWebhook](#createunifiedwebhook) - Create webhook subscription
* [getUnifiedApicall](#getunifiedapicall) - Retrieve specific API Call by its ID
* [getUnifiedConnection](#getunifiedconnection) - Retrieve connection
* [getUnifiedIntegrationAuth](#getunifiedintegrationauth) - Create connection indirectly
* [getUnifiedWebhook](#getunifiedwebhook) - Retrieve webhook by its ID
* [listUnifiedApicalls](#listunifiedapicalls) - Returns API Calls
* [listUnifiedConnections](#listunifiedconnections) - List all connections
* [listUnifiedIntegrationWorkspaces](#listunifiedintegrationworkspaces) - Returns all activated integrations in a workspace
* [listUnifiedIntegrations](#listunifiedintegrations) - Returns all integrations
* [listUnifiedWebhooks](#listunifiedwebhooks) - Returns all registered webhooks
* [patchUnifiedConnection](#patchunifiedconnection) - Update connection
* [removeUnifiedConnection](#removeunifiedconnection) - Remove connection
* [removeUnifiedWebhook](#removeunifiedwebhook) - Remove webhook subscription
* [updateUnifiedConnection](#updateunifiedconnection) - Update connection

## createUnifiedConnection

Create connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateUnifiedConnectionResponse;
import com.unifiedapi.unifiedto.models.shared.Connection;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionAuth;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions;
import com.unifiedapi.unifiedto.models.shared.PropertyPropertyConnectionAuthMeta;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Undefined;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.shared.Connection req = new Connection(
                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                    add(PropertyConnectionCategories.STORAGE),
                }},
                "string",
                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                    add(PropertyConnectionPermissions.ATS_JOB_WRITE),
                }}){{
                auth = new PropertyConnectionAuth(
){{
                    accessToken = "string";
                    apiUrl = "string";
                    appId = "string";
                    authorizeUrl = "string";
                    clientId = "string";
                    clientSecret = "string";
                    consumerKey = "string";
                    consumerSecret = "string";
                    emails = new String[]{{
                        add("string"),
                    }};
                    expiresIn = 4311.07d;
                    expiryDate = OffsetDateTime.parse("2024-01-24T16:22:59.867Z");
                    key = "<key>";
                    meta = new PropertyPropertyConnectionAuthMeta(
);
                    name = "string";
                    otherAuthInfo = new String[]{{
                        add("string"),
                    }};
                    pem = "string";
                    refreshToken = "string";
                    refreshTokenExpiresDate = OffsetDateTime.parse("2022-12-09T09:37:28.071Z");
                    refreshTokenExpiresIn = 5012.48d;
                    state = "string";
                    token = "string";
                    tokenUrl = "string";

                }};
                authAwsArn = "string";
                createdAt = OffsetDateTime.parse("2022-12-11T17:06:37.254Z");
                cursorsCache = new com.unifiedapi.unifiedto.models.shared.Undefined[]{{
                    add(new Undefined(
                    ){{}}),
                }};
                environment = "string";
                externalXref = "string";
                id = "<ID>";
                isPaused = false;
                lastHealthyAt = OffsetDateTime.parse("2024-06-28T23:40:51.869Z");
                lastUnhealthyAt = OffsetDateTime.parse("2023-11-01T09:09:15.633Z");
                updatedAt = OffsetDateTime.parse("2023-02-05T07:37:37.431Z");
                workspaceId = "string";

            }};

            com.unifiedapi.unifiedto.models.operations.CreateUnifiedConnectionResponse res = sdk.unified.createUnifiedConnection(req);

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

**[com.unifiedapi.unifiedto.models.operations.CreateUnifiedConnectionResponse](../../models/operations/CreateUnifiedConnectionResponse.md)**


## createUnifiedWebhook

The data payload received by your server is described at https://docs.unified.to/unified/overview.  The `interval` field can be set as low as 15 minutes for paid accounts, and 60 minutes for free accounts.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookRequest;
import com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookResponse;
import com.unifiedapi.unifiedto.models.shared.Event;
import com.unifiedapi.unifiedto.models.shared.ObjectType;
import com.unifiedapi.unifiedto.models.shared.PropertyWebhookMeta;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Webhook;
import com.unifiedapi.unifiedto.models.shared.WebhookWebhookType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookRequest req = new CreateUnifiedWebhookRequest(
){{
                webhook = new Webhook(
                    "string",
                    Event.CREATED,
                    "string",
                    188.12d,
                    ObjectType.CRM_CONTACT){{
                    checkedAt = OffsetDateTime.parse("2023-11-05T05:21:48.024Z");
                    createdAt = OffsetDateTime.parse("2022-03-22T21:20:43.128Z");
                    environment = "string";
                    fields = "string";
                    id = "<ID>";
                    integrationType = "string";
                    isHealthy = false;
                    meta = new PropertyWebhookMeta(
);
                    runs = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-08-10T06:13:44.297Z");
                    webhookType = WebhookWebhookType.NATIVE_;
                    workspaceId = "string";

                }};
                includeAll = false;

            }};

            com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookResponse res = sdk.unified.createUnifiedWebhook(req);

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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookRequest](../../models/operations/CreateUnifiedWebhookRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookResponse](../../models/operations/CreateUnifiedWebhookResponse.md)**


## getUnifiedApicall

Retrieve specific API Call by its ID

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallRequest req = new GetUnifiedApicallRequest(
                "string");

            com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallResponse res = sdk.unified.getUnifiedApicall(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallRequest](../../models/operations/GetUnifiedApicallRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallResponse](../../models/operations/GetUnifiedApicallResponse.md)**


## getUnifiedConnection

Retrieve connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionRequest req = new GetUnifiedConnectionRequest(
                "string");

            com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionResponse res = sdk.unified.getUnifiedConnection(req);

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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionRequest](../../models/operations/GetUnifiedConnectionRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionResponse](../../models/operations/GetUnifiedConnectionResponse.md)**


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

            com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthResponse res = sdk.unified.getUnifiedIntegrationAuth(req);

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


## getUnifiedWebhook

Retrieve webhook by its ID

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookRequest req = new GetUnifiedWebhookRequest(
                "string");

            com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookResponse res = sdk.unified.getUnifiedWebhook(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookRequest](../../models/operations/GetUnifiedWebhookRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookResponse](../../models/operations/GetUnifiedWebhookResponse.md)**


## listUnifiedApicalls

Returns API Calls

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedApicallsRequest;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedApicallsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListUnifiedApicallsRequest req = new ListUnifiedApicallsRequest(
){{
                connectionId = "string";
                createdLte = OffsetDateTime.parse("2024-08-09T17:47:53.304Z");
                env = "string";
                error = false;
                externalXref = "string";
                integrationType = "string";
                limit = 494.66d;
                offset = 5267.27d;
                order = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2024-01-10T02:33:44.403Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListUnifiedApicallsResponse res = sdk.unified.listUnifiedApicalls(req);

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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListUnifiedApicallsRequest](../../models/operations/ListUnifiedApicallsRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListUnifiedApicallsResponse](../../models/operations/ListUnifiedApicallsResponse.md)**


## listUnifiedConnections

List all connections

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.Categories;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsRequest;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsRequest req = new ListUnifiedConnectionsRequest(
){{
                categories = new com.unifiedapi.unifiedto.models.operations.Categories[]{{
                    add(Categories.ENRICH),
                }};
                env = "string";
                externalXref = "string";
                limit = 9638.08d;
                offset = 15.12d;
                order = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2022-06-20T13:59:12.388Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsResponse res = sdk.unified.listUnifiedConnections(req);

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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsRequest](../../models/operations/ListUnifiedConnectionsRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsResponse](../../models/operations/ListUnifiedConnectionsResponse.md)**


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

            com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationWorkspacesResponse res = sdk.unified.listUnifiedIntegrationWorkspaces(req);

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

            com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsResponse res = sdk.unified.listUnifiedIntegrations(req);

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


## listUnifiedWebhooks

Returns all registered webhooks

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedWebhooksRequest;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedWebhooksResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListUnifiedWebhooksRequest req = new ListUnifiedWebhooksRequest(
){{
                env = "string";
                limit = 1162.24d;
                object = "string";
                offset = 5094.7d;
                order = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2022-04-20T17:03:56.207Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListUnifiedWebhooksResponse res = sdk.unified.listUnifiedWebhooks(req);

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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListUnifiedWebhooksRequest](../../models/operations/ListUnifiedWebhooksRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListUnifiedWebhooksResponse](../../models/operations/ListUnifiedWebhooksResponse.md)**


## patchUnifiedConnection

Update connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionRequest;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionResponse;
import com.unifiedapi.unifiedto.models.shared.Connection;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionAuth;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions;
import com.unifiedapi.unifiedto.models.shared.PropertyPropertyConnectionAuthMeta;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Undefined;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionRequest req = new PatchUnifiedConnectionRequest(
                "string"){{
                connection = new Connection(
                    new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                        add(PropertyConnectionCategories.TICKETING),
                    }},
                    "string",
                    new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                        add(PropertyConnectionPermissions.MARTECH_LIST_READ),
                    }}){{
                    auth = new PropertyConnectionAuth(
){{
                        accessToken = "string";
                        apiUrl = "string";
                        appId = "string";
                        authorizeUrl = "string";
                        clientId = "string";
                        clientSecret = "string";
                        consumerKey = "string";
                        consumerSecret = "string";
                        emails = new String[]{{
                            add("string"),
                        }};
                        expiresIn = 9973.13d;
                        expiryDate = OffsetDateTime.parse("2024-07-15T18:53:52.079Z");
                        key = "<key>";
                        meta = new PropertyPropertyConnectionAuthMeta(
);
                        name = "string";
                        otherAuthInfo = new String[]{{
                            add("string"),
                        }};
                        pem = "string";
                        refreshToken = "string";
                        refreshTokenExpiresDate = OffsetDateTime.parse("2022-09-17T17:15:40.563Z");
                        refreshTokenExpiresIn = 1170.66d;
                        state = "string";
                        token = "string";
                        tokenUrl = "string";

                    }};
                    authAwsArn = "string";
                    createdAt = OffsetDateTime.parse("2022-05-14T12:46:18.750Z");
                    cursorsCache = new com.unifiedapi.unifiedto.models.shared.Undefined[]{{
                        add(new Undefined(
                        ){{}}),
                    }};
                    environment = "string";
                    externalXref = "string";
                    id = "<ID>";
                    isPaused = false;
                    lastHealthyAt = OffsetDateTime.parse("2023-07-09T12:43:50.814Z");
                    lastUnhealthyAt = OffsetDateTime.parse("2023-02-14T05:49:12.923Z");
                    updatedAt = OffsetDateTime.parse("2024-06-03T13:20:07.463Z");
                    workspaceId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionResponse res = sdk.unified.patchUnifiedConnection(req);

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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionRequest](../../models/operations/PatchUnifiedConnectionRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionResponse](../../models/operations/PatchUnifiedConnectionResponse.md)**


## removeUnifiedConnection

Remove connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionRequest req = new RemoveUnifiedConnectionRequest(
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionResponse res = sdk.unified.removeUnifiedConnection(req);

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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionRequest](../../models/operations/RemoveUnifiedConnectionRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionResponse](../../models/operations/RemoveUnifiedConnectionResponse.md)**


## removeUnifiedWebhook

Remove webhook subscription

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveUnifiedWebhookRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveUnifiedWebhookResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveUnifiedWebhookRequest req = new RemoveUnifiedWebhookRequest(
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveUnifiedWebhookResponse res = sdk.unified.removeUnifiedWebhook(req);

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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.RemoveUnifiedWebhookRequest](../../models/operations/RemoveUnifiedWebhookRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveUnifiedWebhookResponse](../../models/operations/RemoveUnifiedWebhookResponse.md)**


## updateUnifiedConnection

Update connection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionResponse;
import com.unifiedapi.unifiedto.models.shared.Connection;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionAuth;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories;
import com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions;
import com.unifiedapi.unifiedto.models.shared.PropertyPropertyConnectionAuthMeta;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Undefined;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionRequest req = new UpdateUnifiedConnectionRequest(
                "string"){{
                connection = new Connection(
                    new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                        add(PropertyConnectionCategories.UC),
                    }},
                    "string",
                    new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                        add(PropertyConnectionPermissions.CRM_CONTACT_READ),
                    }}){{
                    auth = new PropertyConnectionAuth(
){{
                        accessToken = "string";
                        apiUrl = "string";
                        appId = "string";
                        authorizeUrl = "string";
                        clientId = "string";
                        clientSecret = "string";
                        consumerKey = "string";
                        consumerSecret = "string";
                        emails = new String[]{{
                            add("string"),
                        }};
                        expiresIn = 9842.07d;
                        expiryDate = OffsetDateTime.parse("2024-03-25T02:21:40.431Z");
                        key = "<key>";
                        meta = new PropertyPropertyConnectionAuthMeta(
);
                        name = "string";
                        otherAuthInfo = new String[]{{
                            add("string"),
                        }};
                        pem = "string";
                        refreshToken = "string";
                        refreshTokenExpiresDate = OffsetDateTime.parse("2023-05-18T23:31:20.256Z");
                        refreshTokenExpiresIn = 618.81d;
                        state = "string";
                        token = "string";
                        tokenUrl = "string";

                    }};
                    authAwsArn = "string";
                    createdAt = OffsetDateTime.parse("2024-11-26T11:11:59.157Z");
                    cursorsCache = new com.unifiedapi.unifiedto.models.shared.Undefined[]{{
                        add(new Undefined(
                        ){{}}),
                    }};
                    environment = "string";
                    externalXref = "string";
                    id = "<ID>";
                    isPaused = false;
                    lastHealthyAt = OffsetDateTime.parse("2023-06-09T16:09:54.412Z");
                    lastUnhealthyAt = OffsetDateTime.parse("2022-03-08T19:30:51.046Z");
                    updatedAt = OffsetDateTime.parse("2023-01-09T16:11:04.721Z");
                    workspaceId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionResponse res = sdk.unified.updateUnifiedConnection(req);

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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionRequest](../../models/operations/UpdateUnifiedConnectionRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionResponse](../../models/operations/UpdateUnifiedConnectionResponse.md)**

