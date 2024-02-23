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
* [listUnifiedIssues](#listunifiedissues) - List support issues
* [listUnifiedWebhooks](#listunifiedwebhooks) - Returns all registered webhooks
* [patchUnifiedConnection](#patchunifiedconnection) - Update connection
* [patchUnifiedWebhookTrigger](#patchunifiedwebhooktrigger) - Trigger webhook
* [removeUnifiedConnection](#removeunifiedconnection) - Remove connection
* [removeUnifiedWebhook](#removeunifiedwebhook) - Remove webhook subscription
* [updateUnifiedConnection](#updateunifiedconnection) - Update connection
* [updateUnifiedWebhookTrigger](#updateunifiedwebhooktrigger) - Trigger webhook

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

            com.unifiedapi.unifiedto.models.shared.Connection req = new Connection(
                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                    add(PropertyConnectionCategories.COMMERCE),
                }},
                "<value>",
                new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                    add(PropertyConnectionPermissions.ATS_CANDIDATE_READ),
                }}){{
                auth = new PropertyConnectionAuth(
){{
                    accessToken = "<value>";
                    apiUrl = "<value>";
                    appId = "<value>";
                    authorizeUrl = "<value>";
                    clientId = "<value>";
                    clientSecret = "<value>";
                    consumerKey = "<value>";
                    consumerSecret = "<value>";
                    devApiKey = "<value>";
                    emails = new String[]{{
                        add("<value>"),
                    }};
                    expiresIn = 4311.07d;
                    expiryDate = OffsetDateTime.parse("2024-01-24T16:22:59.867Z");
                    key = "<key>";
                    meta = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    name = "<value>";
                    otherAuthInfo = new String[]{{
                        add("<value>"),
                    }};
                    pem = "<value>";
                    refreshToken = "<value>";
                    refreshTokenExpiresDate = OffsetDateTime.parse("2022-12-09T09:37:28.071Z");
                    refreshTokenExpiresIn = 5012.48d;
                    state = "Kansas";
                    token = "<value>";
                    tokenUrl = "<value>";

                }};
                authAwsArn = "<value>";
                createdAt = OffsetDateTime.parse("2024-06-28T23:40:51.869Z");
                cursorsCache = new java.util.HashMap<String, java.lang.Object>[]{{
                    add(new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }}),
                }};
                environment = "<value>";
                externalXref = "<value>";
                id = "<id>";
                isPaused = false;
                lastHealthyAt = OffsetDateTime.parse("2023-11-01T09:09:15.633Z");
                lastUnhealthyAt = OffsetDateTime.parse("2023-02-05T07:37:37.431Z");
                updatedAt = OffsetDateTime.parse("2024-07-21T18:48:43.528Z");
                workspaceId = "<value>";

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
                    "<value>",
                    Event.CREATED,
                    "<value>",
                    ObjectType.ACCOUNTING_ACCOUNT){{
                    checkedAt = OffsetDateTime.parse("2023-05-18T07:32:59.218Z");
                    createdAt = OffsetDateTime.parse("2023-11-05T05:21:48.024Z");
                    environment = "<value>";
                    fields = "<value>";
                    id = "<id>";
                    integrationType = "<value>";
                    interval = 738.04d;
                    isHealthy = false;
                    meta = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    pageMaxLimit = 5349.08d;
                    runs = new String[]{{
                        add("<value>"),
                    }};
                    updatedAt = OffsetDateTime.parse("2024-01-16T23:55:52.787Z");
                    webhookType = WebhookWebhookType.NATIVE_;
                    workspaceId = "<value>";

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
                "<value>");

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
                "<value>");

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
                "<value>");

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
                connectionId = "<value>";
                createdLte = OffsetDateTime.parse("2024-08-09T17:47:53.304Z");
                env = "<value>";
                error = false;
                externalXref = "<value>";
                integrationType = "<value>";
                limit = 494.66d;
                offset = 5267.27d;
                order = "<value>";
                sort = "<value>";
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
                    add(Categories.MARTECH),
                }};
                env = "<value>";
                externalXref = "<value>";
                limit = 9638.08d;
                offset = 15.12d;
                order = "<value>";
                sort = "<value>";
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


## listUnifiedIssues

List support issues

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedIssuesRequest;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedIssuesResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListUnifiedIssuesRequest req = new ListUnifiedIssuesRequest(
){{
                limit = 7069.08d;
                offset = 7461.37d;
                order = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-01-21T01:55:24.746Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListUnifiedIssuesResponse res = sdk.unified.listUnifiedIssues(req);

            if (res.issues != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.ListUnifiedIssuesRequest](../../models/operations/ListUnifiedIssuesRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListUnifiedIssuesResponse](../../models/operations/ListUnifiedIssuesResponse.md)**


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
                env = "<value>";
                limit = 1162.24d;
                object = "<value>";
                offset = 5094.7d;
                order = "<value>";
                sort = "<value>";
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

            com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionRequest req = new PatchUnifiedConnectionRequest(
                "<value>"){{
                connection = new Connection(
                    new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                        add(PropertyConnectionCategories.TICKETING),
                    }},
                    "<value>",
                    new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                        add(PropertyConnectionPermissions.CRM_LEAD_WRITE),
                    }}){{
                    auth = new PropertyConnectionAuth(
){{
                        accessToken = "<value>";
                        apiUrl = "<value>";
                        appId = "<value>";
                        authorizeUrl = "<value>";
                        clientId = "<value>";
                        clientSecret = "<value>";
                        consumerKey = "<value>";
                        consumerSecret = "<value>";
                        devApiKey = "<value>";
                        emails = new String[]{{
                            add("<value>"),
                        }};
                        expiresIn = 9973.13d;
                        expiryDate = OffsetDateTime.parse("2024-07-15T18:53:52.079Z");
                        key = "<key>";
                        meta = new java.util.HashMap<String, java.lang.Object>(
                        ){{
                            put("key", "<value>");
                        }};
                        name = "<value>";
                        otherAuthInfo = new String[]{{
                            add("<value>"),
                        }};
                        pem = "<value>";
                        refreshToken = "<value>";
                        refreshTokenExpiresDate = OffsetDateTime.parse("2022-09-17T17:15:40.563Z");
                        refreshTokenExpiresIn = 1170.66d;
                        state = "Connecticut";
                        token = "<value>";
                        tokenUrl = "<value>";

                    }};
                    authAwsArn = "<value>";
                    createdAt = OffsetDateTime.parse("2023-07-09T12:43:50.814Z");
                    cursorsCache = new java.util.HashMap<String, java.lang.Object>[]{{
                        add(new java.util.HashMap<String, java.lang.Object>(
                        ){{
                            put("key", "<value>");
                        }}),
                    }};
                    environment = "<value>";
                    externalXref = "<value>";
                    id = "<id>";
                    isPaused = false;
                    lastHealthyAt = OffsetDateTime.parse("2023-02-14T05:49:12.923Z");
                    lastUnhealthyAt = OffsetDateTime.parse("2024-06-03T13:20:07.463Z");
                    updatedAt = OffsetDateTime.parse("2024-03-09T11:43:14.112Z");
                    workspaceId = "<value>";

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


## patchUnifiedWebhookTrigger

Trigger webhook

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedWebhookTriggerRequest;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedWebhookTriggerResponse;
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

            com.unifiedapi.unifiedto.models.operations.PatchUnifiedWebhookTriggerRequest req = new PatchUnifiedWebhookTriggerRequest(
                "<value>");

            com.unifiedapi.unifiedto.models.operations.PatchUnifiedWebhookTriggerResponse res = sdk.unified.patchUnifiedWebhookTrigger(req);

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
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchUnifiedWebhookTriggerRequest](../../models/operations/PatchUnifiedWebhookTriggerRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchUnifiedWebhookTriggerResponse](../../models/operations/PatchUnifiedWebhookTriggerResponse.md)**


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
                "<value>");

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
                "<value>");

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

            com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionRequest req = new UpdateUnifiedConnectionRequest(
                "<value>"){{
                connection = new Connection(
                    new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                        add(PropertyConnectionCategories.ACCOUNTING),
                    }},
                    "<value>",
                    new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                        add(PropertyConnectionPermissions.ATS_COMPANY_READ),
                    }}){{
                    auth = new PropertyConnectionAuth(
){{
                        accessToken = "<value>";
                        apiUrl = "<value>";
                        appId = "<value>";
                        authorizeUrl = "<value>";
                        clientId = "<value>";
                        clientSecret = "<value>";
                        consumerKey = "<value>";
                        consumerSecret = "<value>";
                        devApiKey = "<value>";
                        emails = new String[]{{
                            add("<value>"),
                        }};
                        expiresIn = 9842.07d;
                        expiryDate = OffsetDateTime.parse("2024-03-25T02:21:40.431Z");
                        key = "<key>";
                        meta = new java.util.HashMap<String, java.lang.Object>(
                        ){{
                            put("key", "<value>");
                        }};
                        name = "<value>";
                        otherAuthInfo = new String[]{{
                            add("<value>"),
                        }};
                        pem = "<value>";
                        refreshToken = "<value>";
                        refreshTokenExpiresDate = OffsetDateTime.parse("2023-05-18T23:31:20.256Z");
                        refreshTokenExpiresIn = 618.81d;
                        state = "Wisconsin";
                        token = "<value>";
                        tokenUrl = "<value>";

                    }};
                    authAwsArn = "<value>";
                    createdAt = OffsetDateTime.parse("2023-06-09T16:09:54.412Z");
                    cursorsCache = new java.util.HashMap<String, java.lang.Object>[]{{
                        add(new java.util.HashMap<String, java.lang.Object>(
                        ){{
                            put("key", "<value>");
                        }}),
                    }};
                    environment = "<value>";
                    externalXref = "<value>";
                    id = "<id>";
                    isPaused = false;
                    lastHealthyAt = OffsetDateTime.parse("2022-03-08T19:30:51.046Z");
                    lastUnhealthyAt = OffsetDateTime.parse("2023-01-09T16:11:04.721Z");
                    updatedAt = OffsetDateTime.parse("2023-03-20T19:30:15.010Z");
                    workspaceId = "<value>";

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


## updateUnifiedWebhookTrigger

Trigger webhook

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateUnifiedWebhookTriggerRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateUnifiedWebhookTriggerResponse;
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

            com.unifiedapi.unifiedto.models.operations.UpdateUnifiedWebhookTriggerRequest req = new UpdateUnifiedWebhookTriggerRequest(
                "<value>");

            com.unifiedapi.unifiedto.models.operations.UpdateUnifiedWebhookTriggerResponse res = sdk.unified.updateUnifiedWebhookTrigger(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.UpdateUnifiedWebhookTriggerRequest](../../models/operations/UpdateUnifiedWebhookTriggerRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateUnifiedWebhookTriggerResponse](../../models/operations/UpdateUnifiedWebhookTriggerResponse.md)**

