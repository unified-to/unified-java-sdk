# Unified
(*unified*)

### Available Operations

* [createUnifiedConnection](#createunifiedconnection) - Create connection
* [createUnifiedWebhook](#createunifiedwebhook) - Create webhook subscription
* [getUnifiedApicall](#getunifiedapicall) - Retrieve specific API Call by its ID
* [getUnifiedConnection](#getunifiedconnection) - Retrieve connection
* [getUnifiedIntegration](#getunifiedintegration) - Retrieve an integration
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
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("likewise"){{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.shared.Connection req = new Connection(new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
    add(PropertyConnectionCategories.AUTH),
}}, "Specialist", new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
    add(PropertyConnectionPermissions.CRM_LEAD_READ),
}}){{
                auth = new PropertyConnectionAuth(){{
                    accessToken = "revolutionize";
                    apiUrl = "neutral";
                    appId = "Engineer";
                    authorizeUrl = "Lilangeni";
                    clientId = "Rubber";
                    clientSecret = "sticky";
                    consumerKey = "towards";
                    consumerSecret = "fit";
                    emails = new String[]{{
                        add("Designer"),
                    }};
                    expiresIn = 5649.9d;
                    expiryDate = OffsetDateTime.parse("2023-03-20T08:57:28.874Z");
                    key = "<key>";
                    meta = new PropertyPropertyConnectionAuthMeta();
                    name = "maroon";
                    otherAuthInfo = new String[]{{
                        add("Group"),
                    }};
                    pem = "Rap";
                    refreshToken = "female";
                    state = "Wagon";
                    token = "intensely";
                    tokenUrl = "Buckinghamshire";
                }};
                authAwsArn = "inquisitively";
                createdAt = OffsetDateTime.parse("2023-05-19T12:51:51.899Z");
                environment = "Music";
                externalXref = "coulomb";
                id = "<ID>";
                isPaused = false;
                updatedAt = OffsetDateTime.parse("2023-12-15T00:36:00.880Z");
                workspaceId = "PCI";
            }};            

            CreateUnifiedConnectionResponse res = sdk.unified.createUnifiedConnection(req);

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

To maintain compatibility with the webhooks specification and Zapier webhooks, only the hook_url field is required in the payload when creating a Webhook.  When updated/new objects are found, the array of objects will be POSTed to the hook_url with the paramater hookId=<hookId>.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookEvents;
import com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookRequest;
import com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyWebhookEvents;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Webhook;
import com.unifiedapi.unifiedto.models.shared.WebhookObjectType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Lead"){{
                    jwt = "";
                }})
                .build();

            CreateUnifiedWebhookRequest req = new CreateUnifiedWebhookRequest("payment", "Borders"){{
                webhook = new Webhook("Representative", new com.unifiedapi.unifiedto.models.shared.PropertyWebhookEvents[]{{
                    add(PropertyWebhookEvents.CREATED),
                }}, "cyan", "Bedfordshire", 3.51d, WebhookObjectType.CRM_FILE, "withdrawal"){{
                    checkedAt = OffsetDateTime.parse("2023-02-22T14:23:57.210Z");
                    createdAt = OffsetDateTime.parse("2023-09-03T17:40:00.994Z");
                    environment = "turquoise";
                    id = "<ID>";
                    includeRaw = false;
                    subscriptions = new String[]{{
                        add("up"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-04-24T02:01:08.617Z");
                }};
                events = new com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookEvents[]{{
                    add(CreateUnifiedWebhookEvents.CREATED),
                }};
            }};            

            CreateUnifiedWebhookResponse res = sdk.unified.createUnifiedWebhook(req);

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
                .setSecurity(new Security("tesla"){{
                    jwt = "";
                }})
                .build();

            GetUnifiedApicallRequest req = new GetUnifiedApicallRequest("anenst");            

            GetUnifiedApicallResponse res = sdk.unified.getUnifiedApicall(req);

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
                .setSecurity(new Security("Granite"){{
                    jwt = "";
                }})
                .build();

            GetUnifiedConnectionRequest req = new GetUnifiedConnectionRequest("Gasoline");            

            GetUnifiedConnectionResponse res = sdk.unified.getUnifiedConnection(req);

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


## getUnifiedIntegration

Retrieve an integration

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Mobility"){{
                    jwt = "";
                }})
                .build();

            GetUnifiedIntegrationRequest req = new GetUnifiedIntegrationRequest("Kia");            

            GetUnifiedIntegrationResponse res = sdk.unified.getUnifiedIntegration(req);

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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationRequest](../../models/operations/GetUnifiedIntegrationRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationResponse](../../models/operations/GetUnifiedIntegrationResponse.md)**


## getUnifiedIntegrationAuth

Returns an authorization URL for the specified integration.  Once a successful authorization occurs, a new connection is created.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthResponse;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthScopes;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("supposing"){{
                    jwt = "";
                }})
                .build();

            GetUnifiedIntegrationAuthRequest req = new GetUnifiedIntegrationAuthRequest("Nobelium", "Branding"){{
                env = "pascal";
                externalXref = "West";
                failureRedirect = "Xenogender";
                lang = "North";
                redirect = false;
                scopes = new com.unifiedapi.unifiedto.models.operations.GetUnifiedIntegrationAuthScopes[]{{
                    add(GetUnifiedIntegrationAuthScopes.CRM_CONTACT_WRITE),
                }};
                state = "Investment";
                subdomain = "spirit";
                successRedirect = "East";
            }};            

            GetUnifiedIntegrationAuthResponse res = sdk.unified.getUnifiedIntegrationAuth(req);

            if (res.getUnifiedIntegrationAuth200ApplicationJSONString != null) {
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
                .setSecurity(new Security("proud"){{
                    jwt = "";
                }})
                .build();

            GetUnifiedWebhookRequest req = new GetUnifiedWebhookRequest("National");            

            GetUnifiedWebhookResponse res = sdk.unified.getUnifiedWebhook(req);

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
                .setSecurity(new Security("attentive"){{
                    jwt = "";
                }})
                .build();

            ListUnifiedApicallsRequest req = new ListUnifiedApicallsRequest(){{
                connectionId = "feed";
                createdLte = OffsetDateTime.parse("2021-01-15T05:06:05.218Z");
                env = "flail";
                error = false;
                externalXref = "Trail";
                integrationType = "male";
                limit = 9674.36d;
                offset = 8869.99d;
                order = "Lights";
                sort = "Hop";
                updatedGte = OffsetDateTime.parse("2022-08-25T10:35:13.567Z");
            }};            

            ListUnifiedApicallsResponse res = sdk.unified.listUnifiedApicalls(req);

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
import com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsCategories;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsRequest;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("parsing"){{
                    jwt = "";
                }})
                .build();

            ListUnifiedConnectionsRequest req = new ListUnifiedConnectionsRequest(){{
                categories = new com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsCategories[]{{
                    add(ListUnifiedConnectionsCategories.PASSTHROUGH),
                }};
                env = "Schamberger";
                externalXref = "Tellurium";
                limit = 4785.07d;
                offset = 2709.69d;
                order = "orange";
                sort = "aha";
                updatedGte = OffsetDateTime.parse("2022-03-28T17:39:35.590Z");
            }};            

            ListUnifiedConnectionsResponse res = sdk.unified.listUnifiedConnections(req);

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
import com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationWorkspacesCategories;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationWorkspacesRequest;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationWorkspacesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Trial"){{
                    jwt = "";
                }})
                .build();

            ListUnifiedIntegrationWorkspacesRequest req = new ListUnifiedIntegrationWorkspacesRequest("Intuitive"){{
                active = false;
                categories = new com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationWorkspacesCategories[]{{
                    add(ListUnifiedIntegrationWorkspacesCategories.ATS),
                }};
                env = "quidem";
                limit = 9499.08d;
                offset = 9586.14d;
                summary = false;
                updatedGte = "gosh";
            }};            

            ListUnifiedIntegrationWorkspacesResponse res = sdk.unified.listUnifiedIntegrationWorkspaces(req);

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
import com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsCategories;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsRequest;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Park"){{
                    jwt = "";
                }})
                .build();

            ListUnifiedIntegrationsRequest req = new ListUnifiedIntegrationsRequest(){{
                active = false;
                categories = new com.unifiedapi.unifiedto.models.operations.ListUnifiedIntegrationsCategories[]{{
                    add(ListUnifiedIntegrationsCategories.HRIS),
                }};
                env = "Volkswagen";
                limit = 2371.74d;
                offset = 558.38d;
                order = "implement";
                sort = "Card";
                summary = false;
                updatedGte = "Global";
            }};            

            ListUnifiedIntegrationsResponse res = sdk.unified.listUnifiedIntegrations(req);

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
                .setSecurity(new Security("Southeast"){{
                    jwt = "";
                }})
                .build();

            ListUnifiedWebhooksRequest req = new ListUnifiedWebhooksRequest(){{
                env = "Southeast";
                limit = 5051.74d;
                object = "indigo";
                offset = 4478.86d;
                order = "optimize";
                sort = "Polestar";
                updatedGte = OffsetDateTime.parse("2022-01-21T13:12:54.296Z");
            }};            

            ListUnifiedWebhooksResponse res = sdk.unified.listUnifiedWebhooks(req);

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
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("International"){{
                    jwt = "";
                }})
                .build();

            PatchUnifiedConnectionRequest req = new PatchUnifiedConnectionRequest("square"){{
                connection = new Connection(new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                    add(PropertyConnectionCategories.ATS),
                }}, "Northeast", new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                    add(PropertyConnectionPermissions.CRM_LEAD_READ),
                }}){{
                    auth = new PropertyConnectionAuth(){{
                        accessToken = "scalable";
                        apiUrl = "Flerovium";
                        appId = "online";
                        authorizeUrl = "Chair";
                        clientId = "customized";
                        clientSecret = "Classical";
                        consumerKey = "repeatedly";
                        consumerSecret = "Grocery";
                        emails = new String[]{{
                            add("Direct"),
                        }};
                        expiresIn = 867.16d;
                        expiryDate = OffsetDateTime.parse("2022-10-16T13:14:14.900Z");
                        key = "<key>";
                        meta = new PropertyPropertyConnectionAuthMeta();
                        name = "Causeway";
                        otherAuthInfo = new String[]{{
                            add("hic"),
                        }};
                        pem = "Chair";
                        refreshToken = "Silver";
                        state = "payment";
                        token = "schemas";
                        tokenUrl = "Loti";
                    }};
                    authAwsArn = "buckwheat";
                    createdAt = OffsetDateTime.parse("2023-08-07T03:19:45.101Z");
                    environment = "constrict";
                    externalXref = "magenta";
                    id = "<ID>";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2022-10-13T10:42:23.688Z");
                    workspaceId = "synergies";
                }};
            }};            

            PatchUnifiedConnectionResponse res = sdk.unified.patchUnifiedConnection(req);

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
                .setSecurity(new Security("Infrastructure"){{
                    jwt = "";
                }})
                .build();

            RemoveUnifiedConnectionRequest req = new RemoveUnifiedConnectionRequest("Coupe");            

            RemoveUnifiedConnectionResponse res = sdk.unified.removeUnifiedConnection(req);

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
                .setSecurity(new Security("API"){{
                    jwt = "";
                }})
                .build();

            RemoveUnifiedWebhookRequest req = new RemoveUnifiedWebhookRequest("Architect");            

            RemoveUnifiedWebhookResponse res = sdk.unified.removeUnifiedWebhook(req);

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
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("tan"){{
                    jwt = "";
                }})
                .build();

            UpdateUnifiedConnectionRequest req = new UpdateUnifiedConnectionRequest("revitalize"){{
                connection = new Connection(new com.unifiedapi.unifiedto.models.shared.PropertyConnectionCategories[]{{
                    add(PropertyConnectionCategories.CRM),
                }}, "Cambridgeshire", new com.unifiedapi.unifiedto.models.shared.PropertyConnectionPermissions[]{{
                    add(PropertyConnectionPermissions.CRM_EVENT_WRITE),
                }}){{
                    auth = new PropertyConnectionAuth(){{
                        accessToken = "Berkshire";
                        apiUrl = "Account";
                        appId = "Recycled";
                        authorizeUrl = "Pizza";
                        clientId = "Accounts";
                        clientSecret = "contest";
                        consumerKey = "Fish";
                        consumerSecret = "Books";
                        emails = new String[]{{
                            add("ampere"),
                        }};
                        expiresIn = 9854.22d;
                        expiryDate = OffsetDateTime.parse("2023-12-23T03:55:24.236Z");
                        key = "<key>";
                        meta = new PropertyPropertyConnectionAuthMeta();
                        name = "Wagon";
                        otherAuthInfo = new String[]{{
                            add("Shoals"),
                        }};
                        pem = "invoice";
                        refreshToken = "Grocery";
                        state = "Bacon";
                        token = "deposit";
                        tokenUrl = "Martinique";
                    }};
                    authAwsArn = "North";
                    createdAt = OffsetDateTime.parse("2022-04-13T10:14:02.294Z");
                    environment = "Tala";
                    externalXref = "groupware";
                    id = "<ID>";
                    isPaused = false;
                    updatedAt = OffsetDateTime.parse("2023-07-20T13:56:27.665Z");
                    workspaceId = "Tricycle";
                }};
            }};            

            UpdateUnifiedConnectionResponse res = sdk.unified.updateUnifiedConnection(req);

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

