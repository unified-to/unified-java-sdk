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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateScimUsersRequest;
import com.unifiedapi.unifiedto.models.operations.CreateScimUsersResponse;
import com.unifiedapi.unifiedto.models.shared.ScimUser;
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchScimUsersRequest;
import com.unifiedapi.unifiedto.models.operations.PatchScimUsersResponse;
import com.unifiedapi.unifiedto.models.shared.ScimUser;
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateScimUsersRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateScimUsersResponse;
import com.unifiedapi.unifiedto.models.shared.ScimUser;
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