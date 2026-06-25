# Group

## Overview

### Available Operations

* [createAdsGroup2](#createadsgroup2) - Create a group
* [createHrisGroup2](#createhrisgroup2) - Create a group
* [createScimGroups](#createscimgroups) - Create group
* [getAdsGroup2](#getadsgroup2) - Retrieve a group
* [getClubsGroup2](#getclubsgroup2) - Retrieve a group
* [getHrisGroup2](#gethrisgroup2) - Retrieve a group
* [getScimGroups](#getscimgroups) - Get group
* [listAdsGroups2](#listadsgroups2) - List all groups
* [listClubsGroups2](#listclubsgroups2) - List all groups
* [listHrisGroups2](#listhrisgroups2) - List all groups
* [listScimGroups](#listscimgroups) - List groups
* [patchAdsGroup2](#patchadsgroup2) - Update a group
* [patchHrisGroup2](#patchhrisgroup2) - Update a group
* [patchScimGroups](#patchscimgroups) - Update group
* [removeAdsGroup2](#removeadsgroup2) - Remove a group
* [removeHrisGroup2](#removehrisgroup2) - Remove a group
* [removeScimGroups](#removescimgroups) - Delete group
* [updateAdsGroup2](#updateadsgroup2) - Update a group
* [updateHrisGroup2](#updatehrisgroup2) - Update a group
* [updateScimGroups](#updatescimgroups) - Update group

## createAdsGroup2

Create a group

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsGroup2" method="post" path="/ads/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsGroup2Request;
import to.unified.unified_java_sdk.models.operations.CreateAdsGroup2Response;
import to.unified.unified_java_sdk.models.shared.AdsGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsGroup2Request req = CreateAdsGroup2Request.builder()
                .adsGroup(AdsGroup.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsGroup2Response res = sdk.group().createAdsGroup2()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            System.out.println(res.adsGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateAdsGroup2Request](../../models/operations/CreateAdsGroup2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateAdsGroup2Response](../../models/operations/CreateAdsGroup2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisGroup2

Create a group

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisGroup2" method="post" path="/hris/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisGroup2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisGroup2Response;
import to.unified.unified_java_sdk.models.shared.HrisGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisGroup2Request req = CreateHrisGroup2Request.builder()
                .hrisGroup(HrisGroup.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisGroup2Response res = sdk.group().createHrisGroup2()
                .request(req)
                .call();

        if (res.hrisGroup().isPresent()) {
            System.out.println(res.hrisGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateHrisGroup2Request](../../models/operations/CreateHrisGroup2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateHrisGroup2Response](../../models/operations/CreateHrisGroup2Response.md)**

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
            System.out.println(res.scimGroup().get());
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

## getAdsGroup2

Retrieve a group

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsGroup2" method="get" path="/ads/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsGroup2Request;
import to.unified.unified_java_sdk.models.operations.GetAdsGroup2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsGroup2Request req = GetAdsGroup2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsGroup2Response res = sdk.group().getAdsGroup2()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            System.out.println(res.adsGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetAdsGroup2Request](../../models/operations/GetAdsGroup2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetAdsGroup2Response](../../models/operations/GetAdsGroup2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getClubsGroup2

Retrieve a group

### Example Usage

<!-- UsageSnippet language="java" operationID="getClubsGroup2" method="get" path="/clubs/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetClubsGroup2Request;
import to.unified.unified_java_sdk.models.operations.GetClubsGroup2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetClubsGroup2Request req = GetClubsGroup2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetClubsGroup2Response res = sdk.group().getClubsGroup2()
                .request(req)
                .call();

        if (res.clubsGroup().isPresent()) {
            System.out.println(res.clubsGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetClubsGroup2Request](../../models/operations/GetClubsGroup2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetClubsGroup2Response](../../models/operations/GetClubsGroup2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisGroup2

Retrieve a group

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisGroup2" method="get" path="/hris/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisGroup2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisGroup2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisGroup2Request req = GetHrisGroup2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisGroup2Response res = sdk.group().getHrisGroup2()
                .request(req)
                .call();

        if (res.hrisGroup().isPresent()) {
            System.out.println(res.hrisGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetHrisGroup2Request](../../models/operations/GetHrisGroup2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetHrisGroup2Response](../../models/operations/GetHrisGroup2Response.md)**

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
            System.out.println(res.scimGroup().get());
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

## listAdsGroups2

List all groups

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsGroups2" method="get" path="/ads/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsGroups2Request;
import to.unified.unified_java_sdk.models.operations.ListAdsGroups2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsGroups2Request req = ListAdsGroups2Request.builder()
                .connectionId("<id>")
                .build();

        ListAdsGroups2Response res = sdk.group().listAdsGroups2()
                .request(req)
                .call();

        if (res.adsGroups().isPresent()) {
            System.out.println(res.adsGroups().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListAdsGroups2Request](../../models/operations/ListAdsGroups2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListAdsGroups2Response](../../models/operations/ListAdsGroups2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listClubsGroups2

List all groups

### Example Usage

<!-- UsageSnippet language="java" operationID="listClubsGroups2" method="get" path="/clubs/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListClubsGroups2Request;
import to.unified.unified_java_sdk.models.operations.ListClubsGroups2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListClubsGroups2Request req = ListClubsGroups2Request.builder()
                .connectionId("<id>")
                .build();

        ListClubsGroups2Response res = sdk.group().listClubsGroups2()
                .request(req)
                .call();

        if (res.clubsGroups().isPresent()) {
            System.out.println(res.clubsGroups().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListClubsGroups2Request](../../models/operations/ListClubsGroups2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListClubsGroups2Response](../../models/operations/ListClubsGroups2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisGroups2

List all groups

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisGroups2" method="get" path="/hris/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisGroups2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisGroups2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisGroups2Request req = ListHrisGroups2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisGroups2Response res = sdk.group().listHrisGroups2()
                .request(req)
                .call();

        if (res.hrisGroups().isPresent()) {
            System.out.println(res.hrisGroups().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListHrisGroups2Request](../../models/operations/ListHrisGroups2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListHrisGroups2Response](../../models/operations/ListHrisGroups2Response.md)**

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
            System.out.println(res.scimGroups().get());
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

## patchAdsGroup2

Update a group

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsGroup2" method="patch" path="/ads/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsGroup2Request;
import to.unified.unified_java_sdk.models.operations.PatchAdsGroup2Response;
import to.unified.unified_java_sdk.models.shared.AdsGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsGroup2Request req = PatchAdsGroup2Request.builder()
                .adsGroup(AdsGroup.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsGroup2Response res = sdk.group().patchAdsGroup2()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            System.out.println(res.adsGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchAdsGroup2Request](../../models/operations/PatchAdsGroup2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchAdsGroup2Response](../../models/operations/PatchAdsGroup2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisGroup2

Update a group

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisGroup2" method="patch" path="/hris/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisGroup2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisGroup2Response;
import to.unified.unified_java_sdk.models.shared.HrisGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisGroup2Request req = PatchHrisGroup2Request.builder()
                .hrisGroup(HrisGroup.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisGroup2Response res = sdk.group().patchHrisGroup2()
                .request(req)
                .call();

        if (res.hrisGroup().isPresent()) {
            System.out.println(res.hrisGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchHrisGroup2Request](../../models/operations/PatchHrisGroup2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchHrisGroup2Response](../../models/operations/PatchHrisGroup2Response.md)**

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
            System.out.println(res.scimGroup().get());
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

## removeAdsGroup2

Remove a group

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsGroup2" method="delete" path="/ads/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsGroup2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAdsGroup2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsGroup2Request req = RemoveAdsGroup2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsGroup2Response res = sdk.group().removeAdsGroup2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveAdsGroup2Request](../../models/operations/RemoveAdsGroup2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveAdsGroup2Response](../../models/operations/RemoveAdsGroup2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisGroup2

Remove a group

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisGroup2" method="delete" path="/hris/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisGroup2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisGroup2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisGroup2Request req = RemoveHrisGroup2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisGroup2Response res = sdk.group().removeHrisGroup2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveHrisGroup2Request](../../models/operations/RemoveHrisGroup2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveHrisGroup2Response](../../models/operations/RemoveHrisGroup2Response.md)**

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

## updateAdsGroup2

Update a group

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsGroup2" method="put" path="/ads/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsGroup2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAdsGroup2Response;
import to.unified.unified_java_sdk.models.shared.AdsGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsGroup2Request req = UpdateAdsGroup2Request.builder()
                .adsGroup(AdsGroup.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsGroup2Response res = sdk.group().updateAdsGroup2()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            System.out.println(res.adsGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateAdsGroup2Request](../../models/operations/UpdateAdsGroup2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateAdsGroup2Response](../../models/operations/UpdateAdsGroup2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisGroup2

Update a group

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisGroup2" method="put" path="/hris/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisGroup2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisGroup2Response;
import to.unified.unified_java_sdk.models.shared.HrisGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisGroup2Request req = UpdateHrisGroup2Request.builder()
                .hrisGroup(HrisGroup.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisGroup2Response res = sdk.group().updateHrisGroup2()
                .request(req)
                .call();

        if (res.hrisGroup().isPresent()) {
            System.out.println(res.hrisGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateHrisGroup2Request](../../models/operations/UpdateHrisGroup2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateHrisGroup2Response](../../models/operations/UpdateHrisGroup2Response.md)**

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
            System.out.println(res.scimGroup().get());
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