# Group

## Overview

### Available Operations

* [createAdsGroup](#createadsgroup) - Create a group
* [createHrisGroup](#createhrisgroup) - Create a group
* [createScimGroups](#createscimgroups) - Create group
* [getAdsGroup](#getadsgroup) - Retrieve a group
* [getHrisGroup](#gethrisgroup) - Retrieve a group
* [getScimGroups](#getscimgroups) - Get group
* [listAdsGroups](#listadsgroups) - List all groups
* [listHrisGroups](#listhrisgroups) - List all groups
* [listScimGroups](#listscimgroups) - List groups
* [patchAdsGroup](#patchadsgroup) - Update a group
* [patchHrisGroup](#patchhrisgroup) - Update a group
* [patchScimGroups](#patchscimgroups) - Update group
* [removeAdsGroup](#removeadsgroup) - Remove a group
* [removeHrisGroup](#removehrisgroup) - Remove a group
* [removeScimGroups](#removescimgroups) - Delete group
* [updateAdsGroup](#updateadsgroup) - Update a group
* [updateHrisGroup](#updatehrisgroup) - Update a group
* [updateScimGroups](#updatescimgroups) - Update group

## createAdsGroup

Create a group

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsGroup" method="post" path="/ads/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsGroupRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsGroupResponse;
import to.unified.unified_java_sdk.models.shared.AdsGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsGroupRequest req = CreateAdsGroupRequest.builder()
                .adsGroup(AdsGroup.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsGroupResponse res = sdk.group().createAdsGroup()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateAdsGroupRequest](../../models/operations/CreateAdsGroupRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateAdsGroupResponse](../../models/operations/CreateAdsGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisGroup

Create a group

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisGroup" method="post" path="/hris/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisGroupRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisGroupResponse;
import to.unified.unified_java_sdk.models.shared.HrisGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisGroupRequest req = CreateHrisGroupRequest.builder()
                .hrisGroup(HrisGroup.builder()
                    .build())
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

        CreateScimGroupsResponse res = sdk.group().createScimGroups()
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

## getAdsGroup

Retrieve a group

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsGroup" method="get" path="/ads/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsGroupRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsGroupResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsGroupRequest req = GetAdsGroupRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsGroupResponse res = sdk.group().getAdsGroup()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetAdsGroupRequest](../../models/operations/GetAdsGroupRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetAdsGroupResponse](../../models/operations/GetAdsGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisGroup

Retrieve a group

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisGroup" method="get" path="/hris/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisGroupRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisGroupResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
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

        GetScimGroupsResponse res = sdk.group().getScimGroups()
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

## listAdsGroups

List all groups

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsGroups" method="get" path="/ads/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsGroupsRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsGroupsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsGroupsRequest req = ListAdsGroupsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsGroupsResponse res = sdk.group().listAdsGroups()
                .request(req)
                .call();

        if (res.adsGroups().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListAdsGroupsRequest](../../models/operations/ListAdsGroupsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListAdsGroupsResponse](../../models/operations/ListAdsGroupsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisGroups

List all groups

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisGroups" method="get" path="/hris/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisGroupsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisGroupsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
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

        ListScimGroupsResponse res = sdk.group().listScimGroups()
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

## patchAdsGroup

Update a group

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsGroup" method="patch" path="/ads/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsGroupRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsGroupResponse;
import to.unified.unified_java_sdk.models.shared.AdsGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsGroupRequest req = PatchAdsGroupRequest.builder()
                .adsGroup(AdsGroup.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsGroupResponse res = sdk.group().patchAdsGroup()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchAdsGroupRequest](../../models/operations/PatchAdsGroupRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchAdsGroupResponse](../../models/operations/PatchAdsGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisGroup

Update a group

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisGroup" method="patch" path="/hris/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisGroupRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisGroupResponse;
import to.unified.unified_java_sdk.models.shared.HrisGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisGroupRequest req = PatchHrisGroupRequest.builder()
                .hrisGroup(HrisGroup.builder()
                    .build())
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

        PatchScimGroupsResponse res = sdk.group().patchScimGroups()
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

## removeAdsGroup

Remove a group

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsGroup" method="delete" path="/ads/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsGroupRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAdsGroupResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsGroupRequest req = RemoveAdsGroupRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsGroupResponse res = sdk.group().removeAdsGroup()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveAdsGroupRequest](../../models/operations/RemoveAdsGroupRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveAdsGroupResponse](../../models/operations/RemoveAdsGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisGroup

Remove a group

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisGroup" method="delete" path="/hris/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisGroupRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisGroupResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
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

## updateAdsGroup

Update a group

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsGroup" method="put" path="/ads/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsGroupRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsGroupResponse;
import to.unified.unified_java_sdk.models.shared.AdsGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsGroupRequest req = UpdateAdsGroupRequest.builder()
                .adsGroup(AdsGroup.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsGroupResponse res = sdk.group().updateAdsGroup()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateAdsGroupRequest](../../models/operations/UpdateAdsGroupRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateAdsGroupResponse](../../models/operations/UpdateAdsGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisGroup

Update a group

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisGroup" method="put" path="/hris/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisGroupRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisGroupResponse;
import to.unified.unified_java_sdk.models.shared.HrisGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisGroupRequest req = UpdateHrisGroupRequest.builder()
                .hrisGroup(HrisGroup.builder()
                    .build())
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

        UpdateScimGroupsResponse res = sdk.group().updateScimGroups()
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