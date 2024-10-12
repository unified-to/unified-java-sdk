# Group
(*group()*)

## Overview

### Available Operations

* [createHrisGroup](#createhrisgroup) - Create a group
* [createScimGroups](#createscimgroups) - Create group
* [getHrisGroup](#gethrisgroup) - Retrieve a group
* [listHrisGroups](#listhrisgroups) - List all groups
* [listScimGroups](#listscimgroups) - List groups
* [patchHrisGroup](#patchhrisgroup) - Update a group
* [patchScimGroups](#patchscimgroups) - Update group
* [removeHrisGroup](#removehrisgroup) - Remove a group
* [removeScimGroups](#removescimgroups) - Delete group
* [updateHrisGroup](#updatehrisgroup) - Update a group
* [updateScimGroups](#updatescimgroups) - Update group

## createHrisGroup

Create a group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateHrisGroupRequest;
import com.unifiedapi.unifiedto.models.operations.CreateHrisGroupResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateHrisGroupRequest req = CreateHrisGroupRequest.builder()
                .connectionId("<id>")
                .build();

        CreateHrisGroupResponse res = sdk.group().createHrisGroup()
                .request(req)
                .call();

        if (res.hrisGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateHrisGroupRequest](../../models/operations/CreateHrisGroupRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateHrisGroupResponse](../../models/operations/CreateHrisGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateScimGroupsResponse res = sdk.group().createScimGroups()
                .request(req)
                .call();

        if (res.group().isPresent()) {
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

## getHrisGroup

Retrieve a group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetHrisGroupRequest;
import com.unifiedapi.unifiedto.models.operations.GetHrisGroupResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetHrisGroupRequest req = GetHrisGroupRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisGroupResponse res = sdk.group().getHrisGroup()
                .request(req)
                .call();

        if (res.hrisGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetHrisGroupRequest](../../models/operations/GetHrisGroupRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetHrisGroupResponse](../../models/operations/GetHrisGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisGroups

List all groups

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListHrisGroupsRequest;
import com.unifiedapi.unifiedto.models.operations.ListHrisGroupsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListHrisGroupsRequest req = ListHrisGroupsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisGroupsResponse res = sdk.group().listHrisGroups()
                .request(req)
                .call();

        if (res.hrisGroups().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListHrisGroupsRequest](../../models/operations/ListHrisGroupsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListHrisGroupsResponse](../../models/operations/ListHrisGroupsResponse.md)**

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

        ListScimGroupsResponse res = sdk.group().listScimGroups()
                .request(req)
                .call();

        if (res.groups().isPresent()) {
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

## patchHrisGroup

Update a group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchHrisGroupRequest;
import com.unifiedapi.unifiedto.models.operations.PatchHrisGroupResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchHrisGroupRequest req = PatchHrisGroupRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisGroupResponse res = sdk.group().patchHrisGroup()
                .request(req)
                .call();

        if (res.hrisGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchHrisGroupRequest](../../models/operations/PatchHrisGroupRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchHrisGroupResponse](../../models/operations/PatchHrisGroupResponse.md)**

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

        PatchScimGroupsResponse res = sdk.group().patchScimGroups()
                .request(req)
                .call();

        if (res.group().isPresent()) {
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

## removeHrisGroup

Remove a group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveHrisGroupRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveHrisGroupResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveHrisGroupRequest req = RemoveHrisGroupRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisGroupResponse res = sdk.group().removeHrisGroup()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveHrisGroupRequest](../../models/operations/RemoveHrisGroupRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveHrisGroupResponse](../../models/operations/RemoveHrisGroupResponse.md)**

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

        RemoveScimGroupsResponse res = sdk.group().removeScimGroups()
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

## updateHrisGroup

Update a group

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateHrisGroupRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateHrisGroupResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateHrisGroupRequest req = UpdateHrisGroupRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisGroupResponse res = sdk.group().updateHrisGroup()
                .request(req)
                .call();

        if (res.hrisGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateHrisGroupRequest](../../models/operations/UpdateHrisGroupRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateHrisGroupResponse](../../models/operations/UpdateHrisGroupResponse.md)**

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

        UpdateScimGroupsResponse res = sdk.group().updateScimGroups()
                .request(req)
                .call();

        if (res.group().isPresent()) {
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