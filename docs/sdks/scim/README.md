# Scim
(*scim()*)

## Overview

### Available Operations

* [createScimGroups](#createscimgroups) - Create group
* [createScimUsers](#createscimusers) - Create user
* [getScimGroups](#getscimgroups) - Get group
* [getScimUsers](#getscimusers) - Get user
* [listScimGroups](#listscimgroups) - List groups
* [listScimUsers](#listscimusers) - List users
* [patchScimGroups](#patchscimgroups) - Update group
* [patchScimUsers](#patchscimusers) - Update user
* [removeScimGroups](#removescimgroups) - Delete group
* [removeScimUsers](#removescimusers) - Delete user
* [updateScimGroups](#updatescimgroups) - Update group
* [updateScimUsers](#updatescimusers) - Update user

## createScimGroups

Create group

### Example Usage

<!-- UsageSnippet language="java" operationID="createScimGroups" method="post" path="/scim/{connection_id}/groups" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateScimGroupsRequest;
import to.unified.unified_java_sdk.models.operations.CreateScimGroupsResponse;
import to.unified.unified_java_sdk.models.shared.ScimGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateScimGroupsRequest req = CreateScimGroupsRequest.builder()
                .scimGroup(ScimGroup.builder()
                    .displayName("Nina.Tremblay")
                    .build())
                .connectionId("<id>")
                .build();

        CreateScimGroupsResponse res = sdk.scim().createScimGroups()
                .request(req)
                .call();

        if (res.scimGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateScimGroupsRequest](../../models/operations/CreateScimGroupsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateScimGroupsResponse](../../models/operations/CreateScimGroupsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createScimUsers

Create user

### Example Usage

<!-- UsageSnippet language="java" operationID="createScimUsers" method="post" path="/scim/{connection_id}/users" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateScimUsersRequest;
import to.unified.unified_java_sdk.models.operations.CreateScimUsersResponse;
import to.unified.unified_java_sdk.models.shared.ScimUser;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateScimUsersRequest req = CreateScimUsersRequest.builder()
                .scimUser(ScimUser.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateScimUsersResponse res = sdk.scim().createScimUsers()
                .request(req)
                .call();

        if (res.scimUser().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateScimUsersRequest](../../models/operations/CreateScimUsersRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateScimUsersResponse](../../models/operations/CreateScimUsersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getScimGroups

Get group

### Example Usage

<!-- UsageSnippet language="java" operationID="getScimGroups" method="get" path="/scim/{connection_id}/groups/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetScimGroupsRequest;
import to.unified.unified_java_sdk.models.operations.GetScimGroupsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetScimGroupsRequest req = GetScimGroupsRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetScimGroupsResponse res = sdk.scim().getScimGroups()
                .request(req)
                .call();

        if (res.scimGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetScimGroupsRequest](../../models/operations/GetScimGroupsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetScimGroupsResponse](../../models/operations/GetScimGroupsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getScimUsers

Get user

### Example Usage

<!-- UsageSnippet language="java" operationID="getScimUsers" method="get" path="/scim/{connection_id}/users/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetScimUsersRequest;
import to.unified.unified_java_sdk.models.operations.GetScimUsersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetScimUsersRequest req = GetScimUsersRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetScimUsersResponse res = sdk.scim().getScimUsers()
                .request(req)
                .call();

        if (res.scimUser().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetScimUsersRequest](../../models/operations/GetScimUsersRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetScimUsersResponse](../../models/operations/GetScimUsersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listScimGroups

List groups

### Example Usage

<!-- UsageSnippet language="java" operationID="listScimGroups" method="get" path="/scim/{connection_id}/groups" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListScimGroupsRequest;
import to.unified.unified_java_sdk.models.operations.ListScimGroupsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListScimGroupsRequest req = ListScimGroupsRequest.builder()
                .connectionId("<id>")
                .build();

        ListScimGroupsResponse res = sdk.scim().listScimGroups()
                .request(req)
                .call();

        if (res.scimGroups().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListScimGroupsRequest](../../models/operations/ListScimGroupsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListScimGroupsResponse](../../models/operations/ListScimGroupsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listScimUsers

List users

### Example Usage

<!-- UsageSnippet language="java" operationID="listScimUsers" method="get" path="/scim/{connection_id}/users" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListScimUsersRequest;
import to.unified.unified_java_sdk.models.operations.ListScimUsersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListScimUsersRequest req = ListScimUsersRequest.builder()
                .connectionId("<id>")
                .build();

        ListScimUsersResponse res = sdk.scim().listScimUsers()
                .request(req)
                .call();

        if (res.scimUsers().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListScimUsersRequest](../../models/operations/ListScimUsersRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListScimUsersResponse](../../models/operations/ListScimUsersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchScimGroups

Update group

### Example Usage

<!-- UsageSnippet language="java" operationID="patchScimGroups" method="patch" path="/scim/{connection_id}/groups/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchScimGroupsRequest;
import to.unified.unified_java_sdk.models.operations.PatchScimGroupsResponse;
import to.unified.unified_java_sdk.models.shared.ScimGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchScimGroupsRequest req = PatchScimGroupsRequest.builder()
                .scimGroup(ScimGroup.builder()
                    .displayName("Newell.Hoeger")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchScimGroupsResponse res = sdk.scim().patchScimGroups()
                .request(req)
                .call();

        if (res.scimGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchScimGroupsRequest](../../models/operations/PatchScimGroupsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchScimGroupsResponse](../../models/operations/PatchScimGroupsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchScimUsers

Update user

### Example Usage

<!-- UsageSnippet language="java" operationID="patchScimUsers" method="patch" path="/scim/{connection_id}/users/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchScimUsersRequest;
import to.unified.unified_java_sdk.models.operations.PatchScimUsersResponse;
import to.unified.unified_java_sdk.models.shared.ScimUser;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchScimUsersRequest req = PatchScimUsersRequest.builder()
                .scimUser(ScimUser.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchScimUsersResponse res = sdk.scim().patchScimUsers()
                .request(req)
                .call();

        if (res.scimUser().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchScimUsersRequest](../../models/operations/PatchScimUsersRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchScimUsersResponse](../../models/operations/PatchScimUsersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeScimGroups

Delete group

### Example Usage

<!-- UsageSnippet language="java" operationID="removeScimGroups" method="delete" path="/scim/{connection_id}/groups/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveScimGroupsRequest;
import to.unified.unified_java_sdk.models.operations.RemoveScimGroupsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveScimGroupsRequest req = RemoveScimGroupsRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveScimGroupsResponse res = sdk.scim().removeScimGroups()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveScimGroupsRequest](../../models/operations/RemoveScimGroupsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveScimGroupsResponse](../../models/operations/RemoveScimGroupsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeScimUsers

Delete user

### Example Usage

<!-- UsageSnippet language="java" operationID="removeScimUsers" method="delete" path="/scim/{connection_id}/users/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveScimUsersRequest;
import to.unified.unified_java_sdk.models.operations.RemoveScimUsersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveScimUsersRequest req = RemoveScimUsersRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveScimUsersResponse res = sdk.scim().removeScimUsers()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveScimUsersRequest](../../models/operations/RemoveScimUsersRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveScimUsersResponse](../../models/operations/RemoveScimUsersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateScimGroups

Update group

### Example Usage

<!-- UsageSnippet language="java" operationID="updateScimGroups" method="put" path="/scim/{connection_id}/groups/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateScimGroupsRequest;
import to.unified.unified_java_sdk.models.operations.UpdateScimGroupsResponse;
import to.unified.unified_java_sdk.models.shared.ScimGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateScimGroupsRequest req = UpdateScimGroupsRequest.builder()
                .scimGroup(ScimGroup.builder()
                    .displayName("Reynold90")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateScimGroupsResponse res = sdk.scim().updateScimGroups()
                .request(req)
                .call();

        if (res.scimGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateScimGroupsRequest](../../models/operations/UpdateScimGroupsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateScimGroupsResponse](../../models/operations/UpdateScimGroupsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateScimUsers

Update user

### Example Usage

<!-- UsageSnippet language="java" operationID="updateScimUsers" method="put" path="/scim/{connection_id}/users/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateScimUsersRequest;
import to.unified.unified_java_sdk.models.operations.UpdateScimUsersResponse;
import to.unified.unified_java_sdk.models.shared.ScimUser;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateScimUsersRequest req = UpdateScimUsersRequest.builder()
                .scimUser(ScimUser.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateScimUsersResponse res = sdk.scim().updateScimUsers()
                .request(req)
                .call();

        if (res.scimUser().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateScimUsersRequest](../../models/operations/UpdateScimUsersRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateScimUsersResponse](../../models/operations/UpdateScimUsersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |