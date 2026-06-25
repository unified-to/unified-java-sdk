# Member

## Overview

### Available Operations

* [createMartechMember2](#createmartechmember2) - Create a member
* [getClubsMember2](#getclubsmember2) - Retrieve a member
* [getMartechMember2](#getmartechmember2) - Retrieve a member
* [listClubsMembers2](#listclubsmembers2) - List all members
* [listMartechMembers2](#listmartechmembers2) - List all members
* [patchMartechMember2](#patchmartechmember2) - Update a member
* [removeMartechMember2](#removemartechmember2) - Remove a member
* [updateMartechMember2](#updatemartechmember2) - Update a member

## createMartechMember2

Create a member

### Example Usage

<!-- UsageSnippet language="java" operationID="createMartechMember2" method="post" path="/martech/{connection_id}/member" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateMartechMember2Request;
import to.unified.unified_java_sdk.models.operations.CreateMartechMember2Response;
import to.unified.unified_java_sdk.models.shared.MarketingMember;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateMartechMember2Request req = CreateMartechMember2Request.builder()
                .marketingMember(MarketingMember.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateMartechMember2Response res = sdk.member().createMartechMember2()
                .request(req)
                .call();

        if (res.marketingMember().isPresent()) {
            System.out.println(res.marketingMember().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateMartechMember2Request](../../models/operations/CreateMartechMember2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateMartechMember2Response](../../models/operations/CreateMartechMember2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getClubsMember2

Retrieve a member

### Example Usage

<!-- UsageSnippet language="java" operationID="getClubsMember2" method="get" path="/clubs/{connection_id}/member/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetClubsMember2Request;
import to.unified.unified_java_sdk.models.operations.GetClubsMember2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetClubsMember2Request req = GetClubsMember2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetClubsMember2Response res = sdk.member().getClubsMember2()
                .request(req)
                .call();

        if (res.clubsMember().isPresent()) {
            System.out.println(res.clubsMember().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetClubsMember2Request](../../models/operations/GetClubsMember2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetClubsMember2Response](../../models/operations/GetClubsMember2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMartechMember2

Retrieve a member

### Example Usage

<!-- UsageSnippet language="java" operationID="getMartechMember2" method="get" path="/martech/{connection_id}/member/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetMartechMember2Request;
import to.unified.unified_java_sdk.models.operations.GetMartechMember2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetMartechMember2Request req = GetMartechMember2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetMartechMember2Response res = sdk.member().getMartechMember2()
                .request(req)
                .call();

        if (res.marketingMember().isPresent()) {
            System.out.println(res.marketingMember().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetMartechMember2Request](../../models/operations/GetMartechMember2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetMartechMember2Response](../../models/operations/GetMartechMember2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listClubsMembers2

List all members

### Example Usage

<!-- UsageSnippet language="java" operationID="listClubsMembers2" method="get" path="/clubs/{connection_id}/member" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListClubsMembers2Request;
import to.unified.unified_java_sdk.models.operations.ListClubsMembers2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListClubsMembers2Request req = ListClubsMembers2Request.builder()
                .connectionId("<id>")
                .build();

        ListClubsMembers2Response res = sdk.member().listClubsMembers2()
                .request(req)
                .call();

        if (res.clubsMembers().isPresent()) {
            System.out.println(res.clubsMembers().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListClubsMembers2Request](../../models/operations/ListClubsMembers2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListClubsMembers2Response](../../models/operations/ListClubsMembers2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMartechMembers2

List all members

### Example Usage

<!-- UsageSnippet language="java" operationID="listMartechMembers2" method="get" path="/martech/{connection_id}/member" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMartechMembers2Request;
import to.unified.unified_java_sdk.models.operations.ListMartechMembers2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMartechMembers2Request req = ListMartechMembers2Request.builder()
                .connectionId("<id>")
                .build();

        ListMartechMembers2Response res = sdk.member().listMartechMembers2()
                .request(req)
                .call();

        if (res.marketingMembers().isPresent()) {
            System.out.println(res.marketingMembers().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListMartechMembers2Request](../../models/operations/ListMartechMembers2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListMartechMembers2Response](../../models/operations/ListMartechMembers2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMartechMember2

Update a member

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMartechMember2" method="patch" path="/martech/{connection_id}/member/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMartechMember2Request;
import to.unified.unified_java_sdk.models.operations.PatchMartechMember2Response;
import to.unified.unified_java_sdk.models.shared.MarketingMember;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMartechMember2Request req = PatchMartechMember2Request.builder()
                .marketingMember(MarketingMember.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMartechMember2Response res = sdk.member().patchMartechMember2()
                .request(req)
                .call();

        if (res.marketingMember().isPresent()) {
            System.out.println(res.marketingMember().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchMartechMember2Request](../../models/operations/PatchMartechMember2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchMartechMember2Response](../../models/operations/PatchMartechMember2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeMartechMember2

Remove a member

### Example Usage

<!-- UsageSnippet language="java" operationID="removeMartechMember2" method="delete" path="/martech/{connection_id}/member/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveMartechMember2Request;
import to.unified.unified_java_sdk.models.operations.RemoveMartechMember2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveMartechMember2Request req = RemoveMartechMember2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveMartechMember2Response res = sdk.member().removeMartechMember2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveMartechMember2Request](../../models/operations/RemoveMartechMember2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveMartechMember2Response](../../models/operations/RemoveMartechMember2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMartechMember2

Update a member

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMartechMember2" method="put" path="/martech/{connection_id}/member/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMartechMember2Request;
import to.unified.unified_java_sdk.models.operations.UpdateMartechMember2Response;
import to.unified.unified_java_sdk.models.shared.MarketingMember;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMartechMember2Request req = UpdateMartechMember2Request.builder()
                .marketingMember(MarketingMember.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMartechMember2Response res = sdk.member().updateMartechMember2()
                .request(req)
                .call();

        if (res.marketingMember().isPresent()) {
            System.out.println(res.marketingMember().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateMartechMember2Request](../../models/operations/UpdateMartechMember2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateMartechMember2Response](../../models/operations/UpdateMartechMember2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |