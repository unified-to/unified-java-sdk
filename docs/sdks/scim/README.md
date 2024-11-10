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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateScimGroupsRequest;
import com.unifiedapi.unifiedto.models.operations.CreateScimGroupsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateScimGroupsRequest req = CreateScimGroupsRequest.builder()
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateScimUsersRequest;
import com.unifiedapi.unifiedto.models.operations.CreateScimUsersResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateScimUsersRequest req = CreateScimUsersRequest.builder()
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetScimGroupsRequest;
import com.unifiedapi.unifiedto.models.operations.GetScimGroupsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetScimUsersRequest;
import com.unifiedapi.unifiedto.models.operations.GetScimUsersResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListScimGroupsRequest;
import com.unifiedapi.unifiedto.models.operations.ListScimGroupsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListScimUsersRequest;
import com.unifiedapi.unifiedto.models.operations.ListScimUsersResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchScimGroupsRequest;
import com.unifiedapi.unifiedto.models.operations.PatchScimGroupsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchScimGroupsRequest req = PatchScimGroupsRequest.builder()
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchScimUsersRequest;
import com.unifiedapi.unifiedto.models.operations.PatchScimUsersResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchScimUsersRequest req = PatchScimUsersRequest.builder()
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveScimGroupsRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveScimGroupsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveScimUsersRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveScimUsersResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateScimGroupsRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateScimGroupsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateScimGroupsRequest req = UpdateScimGroupsRequest.builder()
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateScimUsersRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateScimUsersResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateScimUsersRequest req = UpdateScimUsersRequest.builder()
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