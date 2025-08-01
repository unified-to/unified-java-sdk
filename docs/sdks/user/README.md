# User
(*user()*)

## Overview

### Available Operations

* [createScimUsers](#createscimusers) - Create user
* [getScimUsers](#getscimusers) - Get user
* [listScimUsers](#listscimusers) - List users
* [patchScimUsers](#patchscimusers) - Update user
* [removeScimUsers](#removescimusers) - Delete user
* [updateScimUsers](#updatescimusers) - Update user

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

        CreateScimUsersResponse res = sdk.user().createScimUsers()
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

        GetScimUsersResponse res = sdk.user().getScimUsers()
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

        ListScimUsersResponse res = sdk.user().listScimUsers()
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

        PatchScimUsersResponse res = sdk.user().patchScimUsers()
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

        RemoveScimUsersResponse res = sdk.user().removeScimUsers()
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

        UpdateScimUsersResponse res = sdk.user().updateScimUsers()
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