# List

## Overview

### Available Operations

* [createMartechList2](#createmartechlist2) - Create a list
* [getMartechList2](#getmartechlist2) - Retrieve a list
* [listMartechLists2](#listmartechlists2) - List all lists
* [patchMartechList2](#patchmartechlist2) - Update a list
* [removeMartechList2](#removemartechlist2) - Remove a list
* [updateMartechList2](#updatemartechlist2) - Update a list

## createMartechList2

Create a list

### Example Usage

<!-- UsageSnippet language="java" operationID="createMartechList2" method="post" path="/martech/{connection_id}/list" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateMartechList2Request;
import to.unified.unified_java_sdk.models.operations.CreateMartechList2Response;
import to.unified.unified_java_sdk.models.shared.MarketingList;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateMartechList2Request req = CreateMartechList2Request.builder()
                .marketingList(MarketingList.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateMartechList2Response res = sdk.list().createMartechList2()
                .request(req)
                .call();

        if (res.marketingList().isPresent()) {
            System.out.println(res.marketingList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateMartechList2Request](../../models/operations/CreateMartechList2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateMartechList2Response](../../models/operations/CreateMartechList2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMartechList2

Retrieve a list

### Example Usage

<!-- UsageSnippet language="java" operationID="getMartechList2" method="get" path="/martech/{connection_id}/list/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetMartechList2Request;
import to.unified.unified_java_sdk.models.operations.GetMartechList2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetMartechList2Request req = GetMartechList2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetMartechList2Response res = sdk.list().getMartechList2()
                .request(req)
                .call();

        if (res.marketingList().isPresent()) {
            System.out.println(res.marketingList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetMartechList2Request](../../models/operations/GetMartechList2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetMartechList2Response](../../models/operations/GetMartechList2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMartechLists2

List all lists

### Example Usage

<!-- UsageSnippet language="java" operationID="listMartechLists2" method="get" path="/martech/{connection_id}/list" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMartechLists2Request;
import to.unified.unified_java_sdk.models.operations.ListMartechLists2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMartechLists2Request req = ListMartechLists2Request.builder()
                .connectionId("<id>")
                .build();

        ListMartechLists2Response res = sdk.list().listMartechLists2()
                .request(req)
                .call();

        if (res.marketingLists().isPresent()) {
            System.out.println(res.marketingLists().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListMartechLists2Request](../../models/operations/ListMartechLists2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListMartechLists2Response](../../models/operations/ListMartechLists2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMartechList2

Update a list

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMartechList2" method="patch" path="/martech/{connection_id}/list/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMartechList2Request;
import to.unified.unified_java_sdk.models.operations.PatchMartechList2Response;
import to.unified.unified_java_sdk.models.shared.MarketingList;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMartechList2Request req = PatchMartechList2Request.builder()
                .marketingList(MarketingList.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMartechList2Response res = sdk.list().patchMartechList2()
                .request(req)
                .call();

        if (res.marketingList().isPresent()) {
            System.out.println(res.marketingList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchMartechList2Request](../../models/operations/PatchMartechList2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchMartechList2Response](../../models/operations/PatchMartechList2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeMartechList2

Remove a list

### Example Usage

<!-- UsageSnippet language="java" operationID="removeMartechList2" method="delete" path="/martech/{connection_id}/list/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveMartechList2Request;
import to.unified.unified_java_sdk.models.operations.RemoveMartechList2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveMartechList2Request req = RemoveMartechList2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveMartechList2Response res = sdk.list().removeMartechList2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveMartechList2Request](../../models/operations/RemoveMartechList2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveMartechList2Response](../../models/operations/RemoveMartechList2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMartechList2

Update a list

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMartechList2" method="put" path="/martech/{connection_id}/list/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMartechList2Request;
import to.unified.unified_java_sdk.models.operations.UpdateMartechList2Response;
import to.unified.unified_java_sdk.models.shared.MarketingList;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMartechList2Request req = UpdateMartechList2Request.builder()
                .marketingList(MarketingList.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMartechList2Response res = sdk.list().updateMartechList2()
                .request(req)
                .call();

        if (res.marketingList().isPresent()) {
            System.out.println(res.marketingList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateMartechList2Request](../../models/operations/UpdateMartechList2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateMartechList2Response](../../models/operations/UpdateMartechList2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |