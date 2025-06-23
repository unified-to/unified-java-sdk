# Unified
(*unified()*)

## Overview

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
* [patchUnifiedWebhook](#patchunifiedwebhook) - Update webhook subscription
* [patchUnifiedWebhookTrigger](#patchunifiedwebhooktrigger) - Trigger webhook
* [removeUnifiedConnection](#removeunifiedconnection) - Remove connection
* [removeUnifiedWebhook](#removeunifiedwebhook) - Remove webhook subscription
* [updateUnifiedConnection](#updateunifiedconnection) - Update connection
* [updateUnifiedWebhook](#updateunifiedwebhook) - Update webhook subscription
* [updateUnifiedWebhookTrigger](#updateunifiedwebhooktrigger) - Trigger webhook

## createUnifiedConnection

Used only to import existing customer credentials; use "Create connection indirectly" instead

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.CreateUnifiedConnectionResponse;
import to.unified.unifiedto.models.shared.Connection;
import to.unified.unifiedto.models.shared.PropertyConnectionCategories;
import to.unified.unifiedto.models.shared.PropertyConnectionPermissions;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        Connection req = Connection.builder()
                .categories(List.of(
                    PropertyConnectionCategories.ACCOUNTING,
                    PropertyConnectionCategories.MARTECH,
                    PropertyConnectionCategories.MARTECH))
                .integrationType("<value>")
                .permissions(List.of(
                    PropertyConnectionPermissions.LMS_COURSE_READ,
                    PropertyConnectionPermissions.SCIM_USERS_READ))
                .build();

        CreateUnifiedConnectionResponse res = sdk.unified().createUnifiedConnection()
                .request(req)
                .call();

        if (res.connection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `request`                                       | [Connection](../../models/shared/Connection.md) | :heavy_check_mark:                              | The request object to use for the request.      |

### Response

**[CreateUnifiedConnectionResponse](../../models/operations/CreateUnifiedConnectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createUnifiedWebhook

The data payload received by your server is described at https://docs.unified.to/unified/overview. The `interval` field can be set as low as 1 minute for paid accounts, and 60 minutes for free accounts.

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.CreateUnifiedWebhookRequest;
import to.unified.unifiedto.models.operations.CreateUnifiedWebhookResponse;
import to.unified.unifiedto.models.shared.Event;
import to.unified.unifiedto.models.shared.ObjectType;
import to.unified.unifiedto.models.shared.Security;
import to.unified.unifiedto.models.shared.Webhook;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateUnifiedWebhookRequest req = CreateUnifiedWebhookRequest.builder()
                .webhook(Webhook.builder()
                    .connectionId("<id>")
                    .event(Event.CREATED)
                    .objectType(ObjectType.HRIS_EMPLOYEE)
                    .build())
                .build();

        CreateUnifiedWebhookResponse res = sdk.unified().createUnifiedWebhook()
                .request(req)
                .call();

        if (res.webhook().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateUnifiedWebhookRequest](../../models/operations/CreateUnifiedWebhookRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateUnifiedWebhookResponse](../../models/operations/CreateUnifiedWebhookResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUnifiedApicall

Retrieve specific API Call by its ID

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.GetUnifiedApicallRequest;
import to.unified.unifiedto.models.operations.GetUnifiedApicallResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetUnifiedApicallRequest req = GetUnifiedApicallRequest.builder()
                .id("<id>")
                .build();

        GetUnifiedApicallResponse res = sdk.unified().getUnifiedApicall()
                .request(req)
                .call();

        if (res.apiCall().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetUnifiedApicallRequest](../../models/operations/GetUnifiedApicallRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetUnifiedApicallResponse](../../models/operations/GetUnifiedApicallResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUnifiedConnection

Retrieve connection

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.GetUnifiedConnectionRequest;
import to.unified.unifiedto.models.operations.GetUnifiedConnectionResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetUnifiedConnectionRequest req = GetUnifiedConnectionRequest.builder()
                .id("<id>")
                .build();

        GetUnifiedConnectionResponse res = sdk.unified().getUnifiedConnection()
                .request(req)
                .call();

        if (res.connection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetUnifiedConnectionRequest](../../models/operations/GetUnifiedConnectionRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetUnifiedConnectionResponse](../../models/operations/GetUnifiedConnectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUnifiedIntegrationAuth

Returns an authorization URL for the specified integration.  Once a successful authorization occurs, a new connection is created.

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.GetUnifiedIntegrationAuthRequest;
import to.unified.unifiedto.models.operations.GetUnifiedIntegrationAuthResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetUnifiedIntegrationAuthRequest req = GetUnifiedIntegrationAuthRequest.builder()
                .integrationType("<value>")
                .workspaceId("<id>")
                .build();

        GetUnifiedIntegrationAuthResponse res = sdk.unified().getUnifiedIntegrationAuth()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetUnifiedIntegrationAuthRequest](../../models/operations/GetUnifiedIntegrationAuthRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetUnifiedIntegrationAuthResponse](../../models/operations/GetUnifiedIntegrationAuthResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUnifiedWebhook

Retrieve webhook by its ID

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.GetUnifiedWebhookRequest;
import to.unified.unifiedto.models.operations.GetUnifiedWebhookResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetUnifiedWebhookRequest req = GetUnifiedWebhookRequest.builder()
                .id("<id>")
                .build();

        GetUnifiedWebhookResponse res = sdk.unified().getUnifiedWebhook()
                .request(req)
                .call();

        if (res.webhook().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetUnifiedWebhookRequest](../../models/operations/GetUnifiedWebhookRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetUnifiedWebhookResponse](../../models/operations/GetUnifiedWebhookResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUnifiedApicalls

Returns API Calls

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListUnifiedApicallsRequest;
import to.unified.unifiedto.models.operations.ListUnifiedApicallsResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListUnifiedApicallsRequest req = ListUnifiedApicallsRequest.builder()
                .build();

        ListUnifiedApicallsResponse res = sdk.unified().listUnifiedApicalls()
                .request(req)
                .call();

        if (res.apiCalls().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListUnifiedApicallsRequest](../../models/operations/ListUnifiedApicallsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListUnifiedApicallsResponse](../../models/operations/ListUnifiedApicallsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUnifiedConnections

List all connections

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListUnifiedConnectionsRequest;
import to.unified.unifiedto.models.operations.ListUnifiedConnectionsResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListUnifiedConnectionsRequest req = ListUnifiedConnectionsRequest.builder()
                .build();

        ListUnifiedConnectionsResponse res = sdk.unified().listUnifiedConnections()
                .request(req)
                .call();

        if (res.connections().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListUnifiedConnectionsRequest](../../models/operations/ListUnifiedConnectionsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListUnifiedConnectionsResponse](../../models/operations/ListUnifiedConnectionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUnifiedIntegrationWorkspaces

No authentication required as this is to be used by front-end interface

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListUnifiedIntegrationWorkspacesRequest;
import to.unified.unifiedto.models.operations.ListUnifiedIntegrationWorkspacesResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListUnifiedIntegrationWorkspacesRequest req = ListUnifiedIntegrationWorkspacesRequest.builder()
                .workspaceId("<id>")
                .build();

        ListUnifiedIntegrationWorkspacesResponse res = sdk.unified().listUnifiedIntegrationWorkspaces()
                .request(req)
                .call();

        if (res.integrations().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [ListUnifiedIntegrationWorkspacesRequest](../../models/operations/ListUnifiedIntegrationWorkspacesRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[ListUnifiedIntegrationWorkspacesResponse](../../models/operations/ListUnifiedIntegrationWorkspacesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUnifiedIntegrations

Returns all integrations

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListUnifiedIntegrationsRequest;
import to.unified.unifiedto.models.operations.ListUnifiedIntegrationsResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListUnifiedIntegrationsRequest req = ListUnifiedIntegrationsRequest.builder()
                .build();

        ListUnifiedIntegrationsResponse res = sdk.unified().listUnifiedIntegrations()
                .request(req)
                .call();

        if (res.integrations().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListUnifiedIntegrationsRequest](../../models/operations/ListUnifiedIntegrationsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListUnifiedIntegrationsResponse](../../models/operations/ListUnifiedIntegrationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUnifiedIssues

List support issues

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListUnifiedIssuesRequest;
import to.unified.unifiedto.models.operations.ListUnifiedIssuesResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListUnifiedIssuesRequest req = ListUnifiedIssuesRequest.builder()
                .build();

        ListUnifiedIssuesResponse res = sdk.unified().listUnifiedIssues()
                .request(req)
                .call();

        if (res.issues().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListUnifiedIssuesRequest](../../models/operations/ListUnifiedIssuesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListUnifiedIssuesResponse](../../models/operations/ListUnifiedIssuesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUnifiedWebhooks

Returns all registered webhooks

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListUnifiedWebhooksRequest;
import to.unified.unifiedto.models.operations.ListUnifiedWebhooksResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListUnifiedWebhooksRequest req = ListUnifiedWebhooksRequest.builder()
                .build();

        ListUnifiedWebhooksResponse res = sdk.unified().listUnifiedWebhooks()
                .request(req)
                .call();

        if (res.webhooks().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListUnifiedWebhooksRequest](../../models/operations/ListUnifiedWebhooksRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListUnifiedWebhooksResponse](../../models/operations/ListUnifiedWebhooksResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchUnifiedConnection

Update connection

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.PatchUnifiedConnectionRequest;
import to.unified.unifiedto.models.operations.PatchUnifiedConnectionResponse;
import to.unified.unifiedto.models.shared.Connection;
import to.unified.unifiedto.models.shared.PropertyConnectionCategories;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchUnifiedConnectionRequest req = PatchUnifiedConnectionRequest.builder()
                .connection(Connection.builder()
                    .categories(List.of(
                        PropertyConnectionCategories.METADATA,
                        PropertyConnectionCategories.CRM))
                    .integrationType("<value>")
                    .permissions(List.of(
                    ))
                    .build())
                .id("<id>")
                .build();

        PatchUnifiedConnectionResponse res = sdk.unified().patchUnifiedConnection()
                .request(req)
                .call();

        if (res.connection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchUnifiedConnectionRequest](../../models/operations/PatchUnifiedConnectionRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchUnifiedConnectionResponse](../../models/operations/PatchUnifiedConnectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchUnifiedWebhook

Update webhook subscription

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.PatchUnifiedWebhookRequest;
import to.unified.unifiedto.models.operations.PatchUnifiedWebhookResponse;
import to.unified.unifiedto.models.shared.Event;
import to.unified.unifiedto.models.shared.ObjectType;
import to.unified.unifiedto.models.shared.Security;
import to.unified.unifiedto.models.shared.Webhook;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchUnifiedWebhookRequest req = PatchUnifiedWebhookRequest.builder()
                .webhook(Webhook.builder()
                    .connectionId("<id>")
                    .event(Event.DELETED)
                    .objectType(ObjectType.CRM_DEAL)
                    .build())
                .id("<id>")
                .build();

        PatchUnifiedWebhookResponse res = sdk.unified().patchUnifiedWebhook()
                .request(req)
                .call();

        if (res.webhook().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchUnifiedWebhookRequest](../../models/operations/PatchUnifiedWebhookRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchUnifiedWebhookResponse](../../models/operations/PatchUnifiedWebhookResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchUnifiedWebhookTrigger

Trigger webhook

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.PatchUnifiedWebhookTriggerRequest;
import to.unified.unifiedto.models.operations.PatchUnifiedWebhookTriggerResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchUnifiedWebhookTriggerRequest req = PatchUnifiedWebhookTriggerRequest.builder()
                .id("<id>")
                .build();

        PatchUnifiedWebhookTriggerResponse res = sdk.unified().patchUnifiedWebhookTrigger()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [PatchUnifiedWebhookTriggerRequest](../../models/operations/PatchUnifiedWebhookTriggerRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[PatchUnifiedWebhookTriggerResponse](../../models/operations/PatchUnifiedWebhookTriggerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeUnifiedConnection

Remove connection

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.RemoveUnifiedConnectionRequest;
import to.unified.unifiedto.models.operations.RemoveUnifiedConnectionResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveUnifiedConnectionRequest req = RemoveUnifiedConnectionRequest.builder()
                .id("<id>")
                .build();

        RemoveUnifiedConnectionResponse res = sdk.unified().removeUnifiedConnection()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveUnifiedConnectionRequest](../../models/operations/RemoveUnifiedConnectionRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveUnifiedConnectionResponse](../../models/operations/RemoveUnifiedConnectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeUnifiedWebhook

Remove webhook subscription

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.RemoveUnifiedWebhookRequest;
import to.unified.unifiedto.models.operations.RemoveUnifiedWebhookResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveUnifiedWebhookRequest req = RemoveUnifiedWebhookRequest.builder()
                .id("<id>")
                .build();

        RemoveUnifiedWebhookResponse res = sdk.unified().removeUnifiedWebhook()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveUnifiedWebhookRequest](../../models/operations/RemoveUnifiedWebhookRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveUnifiedWebhookResponse](../../models/operations/RemoveUnifiedWebhookResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateUnifiedConnection

Update connection

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.UpdateUnifiedConnectionRequest;
import to.unified.unifiedto.models.operations.UpdateUnifiedConnectionResponse;
import to.unified.unifiedto.models.shared.Connection;
import to.unified.unifiedto.models.shared.PropertyConnectionCategories;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateUnifiedConnectionRequest req = UpdateUnifiedConnectionRequest.builder()
                .connection(Connection.builder()
                    .categories(List.of(
                        PropertyConnectionCategories.METADATA,
                        PropertyConnectionCategories.ACCOUNTING,
                        PropertyConnectionCategories.METADATA))
                    .integrationType("<value>")
                    .permissions(List.of(
                    ))
                    .build())
                .id("<id>")
                .build();

        UpdateUnifiedConnectionResponse res = sdk.unified().updateUnifiedConnection()
                .request(req)
                .call();

        if (res.connection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateUnifiedConnectionRequest](../../models/operations/UpdateUnifiedConnectionRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateUnifiedConnectionResponse](../../models/operations/UpdateUnifiedConnectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateUnifiedWebhook

Update webhook subscription

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.UpdateUnifiedWebhookRequest;
import to.unified.unifiedto.models.operations.UpdateUnifiedWebhookResponse;
import to.unified.unifiedto.models.shared.Event;
import to.unified.unifiedto.models.shared.ObjectType;
import to.unified.unifiedto.models.shared.Security;
import to.unified.unifiedto.models.shared.Webhook;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateUnifiedWebhookRequest req = UpdateUnifiedWebhookRequest.builder()
                .webhook(Webhook.builder()
                    .connectionId("<id>")
                    .event(Event.CREATED)
                    .objectType(ObjectType.PAYMENT_LINK)
                    .build())
                .id("<id>")
                .build();

        UpdateUnifiedWebhookResponse res = sdk.unified().updateUnifiedWebhook()
                .request(req)
                .call();

        if (res.webhook().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateUnifiedWebhookRequest](../../models/operations/UpdateUnifiedWebhookRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateUnifiedWebhookResponse](../../models/operations/UpdateUnifiedWebhookResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateUnifiedWebhookTrigger

Trigger webhook

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.UpdateUnifiedWebhookTriggerRequest;
import to.unified.unifiedto.models.operations.UpdateUnifiedWebhookTriggerResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateUnifiedWebhookTriggerRequest req = UpdateUnifiedWebhookTriggerRequest.builder()
                .id("<id>")
                .build();

        UpdateUnifiedWebhookTriggerResponse res = sdk.unified().updateUnifiedWebhookTrigger()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UpdateUnifiedWebhookTriggerRequest](../../models/operations/UpdateUnifiedWebhookTriggerRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateUnifiedWebhookTriggerResponse](../../models/operations/UpdateUnifiedWebhookTriggerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |