# Connection

## Overview

### Available Operations

* [createUnifiedConnection](#createunifiedconnection) - Create connection
* [createUnifiedConnectionReauth](#createunifiedconnectionreauth) - Create a re-authorization token for a connection
* [getUnifiedConnection](#getunifiedconnection) - Retrieve connection
* [listUnifiedConnections](#listunifiedconnections) - List all connections
* [patchUnifiedConnection](#patchunifiedconnection) - Update connection
* [removeUnifiedConnection](#removeunifiedconnection) - Remove connection
* [updateUnifiedConnection](#updateunifiedconnection) - Update connection

## createUnifiedConnection

Used only to import existing customer credentials. To connect a new account, use the "Authorize or re-authorize a connection" auth URL instead. To change credentials on an existing connection, use "Update connection".

### Example Usage

<!-- UsageSnippet language="java" operationID="createUnifiedConnection" method="post" path="/unified/connection" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUnifiedConnectionResponse;
import to.unified.unified_java_sdk.models.shared.Connection;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        Connection req = Connection.builder()
                .categories(List.of())
                .integrationType("<value>")
                .permissions(List.of())
                .build();

        CreateUnifiedConnectionResponse res = sdk.connection().createUnifiedConnection()
                .request(req)
                .call();

        if (res.connection().isPresent()) {
            System.out.println(res.connection().get());
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

## createUnifiedConnectionReauth

Returns a short-lived, single-use token that lets your end-user re-authorize this existing connection in place via the "Authorize or re-authorize a connection" URL with connection_id and reauth_token.

### Example Usage

<!-- UsageSnippet language="java" operationID="createUnifiedConnectionReauth" method="post" path="/unified/connection/{id}/reauth" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUnifiedConnectionReauthRequest;
import to.unified.unified_java_sdk.models.operations.CreateUnifiedConnectionReauthResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateUnifiedConnectionReauthRequest req = CreateUnifiedConnectionReauthRequest.builder()
                .id("<id>")
                .build();

        CreateUnifiedConnectionReauthResponse res = sdk.connection().createUnifiedConnectionReauth()
                .request(req)
                .call();

        if (res.connectionReauth().isPresent()) {
            System.out.println(res.connectionReauth().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [CreateUnifiedConnectionReauthRequest](../../models/operations/CreateUnifiedConnectionReauthRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[CreateUnifiedConnectionReauthResponse](../../models/operations/CreateUnifiedConnectionReauthResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUnifiedConnection

Retrieve connection

### Example Usage

<!-- UsageSnippet language="java" operationID="getUnifiedConnection" method="get" path="/unified/connection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUnifiedConnectionRequest;
import to.unified.unified_java_sdk.models.operations.GetUnifiedConnectionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUnifiedConnectionRequest req = GetUnifiedConnectionRequest.builder()
                .id("<id>")
                .build();

        GetUnifiedConnectionResponse res = sdk.connection().getUnifiedConnection()
                .request(req)
                .call();

        if (res.connection().isPresent()) {
            System.out.println(res.connection().get());
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

## listUnifiedConnections

List all connections

### Example Usage

<!-- UsageSnippet language="java" operationID="listUnifiedConnections" method="get" path="/unified/connection" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUnifiedConnectionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUnifiedConnectionsResponse res = sdk.connection().listUnifiedConnections()
                .call();

        if (res.connections().isPresent()) {
            System.out.println(res.connections().get());
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

## patchUnifiedConnection

Update connection

### Example Usage

<!-- UsageSnippet language="java" operationID="patchUnifiedConnection" method="patch" path="/unified/connection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUnifiedConnectionRequest;
import to.unified.unified_java_sdk.models.operations.PatchUnifiedConnectionResponse;
import to.unified.unified_java_sdk.models.shared.Connection;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUnifiedConnectionRequest req = PatchUnifiedConnectionRequest.builder()
                .connection(Connection.builder()
                    .categories(List.of())
                    .integrationType("<value>")
                    .permissions(List.of())
                    .build())
                .id("<id>")
                .build();

        PatchUnifiedConnectionResponse res = sdk.connection().patchUnifiedConnection()
                .request(req)
                .call();

        if (res.connection().isPresent()) {
            System.out.println(res.connection().get());
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

## removeUnifiedConnection

Remove connection

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUnifiedConnection" method="delete" path="/unified/connection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUnifiedConnectionRequest;
import to.unified.unified_java_sdk.models.operations.RemoveUnifiedConnectionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUnifiedConnectionRequest req = RemoveUnifiedConnectionRequest.builder()
                .id("<id>")
                .build();

        RemoveUnifiedConnectionResponse res = sdk.connection().removeUnifiedConnection()
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

## updateUnifiedConnection

Update connection

### Example Usage

<!-- UsageSnippet language="java" operationID="updateUnifiedConnection" method="put" path="/unified/connection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUnifiedConnectionRequest;
import to.unified.unified_java_sdk.models.operations.UpdateUnifiedConnectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUnifiedConnectionRequest req = UpdateUnifiedConnectionRequest.builder()
                .connection(Connection.builder()
                    .categories(List.of())
                    .integrationType("<value>")
                    .permissions(List.of(
                        PropertyConnectionPermissions.COMMERCE_REVIEW_WRITE))
                    .build())
                .id("<id>")
                .build();

        UpdateUnifiedConnectionResponse res = sdk.connection().updateUnifiedConnection()
                .request(req)
                .call();

        if (res.connection().isPresent()) {
            System.out.println(res.connection().get());
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