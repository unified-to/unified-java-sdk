# Pullrequest

## Overview

### Available Operations

* [createRepoPullrequest2](#createrepopullrequest2) - Create a pullrequest
* [getRepoPullrequest2](#getrepopullrequest2) - Retrieve a pullrequest
* [listRepoPullrequests2](#listrepopullrequests2) - List all pullrequests
* [patchRepoPullrequest2](#patchrepopullrequest2) - Update a pullrequest
* [removeRepoPullrequest2](#removerepopullrequest2) - Remove a pullrequest
* [updateRepoPullrequest2](#updaterepopullrequest2) - Update a pullrequest

## createRepoPullrequest2

Create a pullrequest

### Example Usage

<!-- UsageSnippet language="java" operationID="createRepoPullrequest2" method="post" path="/repo/{connection_id}/pullrequest" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateRepoPullrequest2Request;
import to.unified.unified_java_sdk.models.operations.CreateRepoPullrequest2Response;
import to.unified.unified_java_sdk.models.shared.RepoPullrequest;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateRepoPullrequest2Request req = CreateRepoPullrequest2Request.builder()
                .repoPullrequest(RepoPullrequest.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateRepoPullrequest2Response res = sdk.pullrequest().createRepoPullrequest2()
                .request(req)
                .call();

        if (res.repoPullrequest().isPresent()) {
            System.out.println(res.repoPullrequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateRepoPullrequest2Request](../../models/operations/CreateRepoPullrequest2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateRepoPullrequest2Response](../../models/operations/CreateRepoPullrequest2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRepoPullrequest2

Retrieve a pullrequest

### Example Usage

<!-- UsageSnippet language="java" operationID="getRepoPullrequest2" method="get" path="/repo/{connection_id}/pullrequest/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetRepoPullrequest2Request;
import to.unified.unified_java_sdk.models.operations.GetRepoPullrequest2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetRepoPullrequest2Request req = GetRepoPullrequest2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetRepoPullrequest2Response res = sdk.pullrequest().getRepoPullrequest2()
                .request(req)
                .call();

        if (res.repoPullrequest().isPresent()) {
            System.out.println(res.repoPullrequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetRepoPullrequest2Request](../../models/operations/GetRepoPullrequest2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetRepoPullrequest2Response](../../models/operations/GetRepoPullrequest2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listRepoPullrequests2

List all pullrequests

### Example Usage

<!-- UsageSnippet language="java" operationID="listRepoPullrequests2" method="get" path="/repo/{connection_id}/pullrequest" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListRepoPullrequests2Request;
import to.unified.unified_java_sdk.models.operations.ListRepoPullrequests2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListRepoPullrequests2Request req = ListRepoPullrequests2Request.builder()
                .connectionId("<id>")
                .build();

        ListRepoPullrequests2Response res = sdk.pullrequest().listRepoPullrequests2()
                .request(req)
                .call();

        if (res.repoPullrequests().isPresent()) {
            System.out.println(res.repoPullrequests().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListRepoPullrequests2Request](../../models/operations/ListRepoPullrequests2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListRepoPullrequests2Response](../../models/operations/ListRepoPullrequests2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchRepoPullrequest2

Update a pullrequest

### Example Usage

<!-- UsageSnippet language="java" operationID="patchRepoPullrequest2" method="patch" path="/repo/{connection_id}/pullrequest/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchRepoPullrequest2Request;
import to.unified.unified_java_sdk.models.operations.PatchRepoPullrequest2Response;
import to.unified.unified_java_sdk.models.shared.RepoPullrequest;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchRepoPullrequest2Request req = PatchRepoPullrequest2Request.builder()
                .repoPullrequest(RepoPullrequest.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoPullrequest2Response res = sdk.pullrequest().patchRepoPullrequest2()
                .request(req)
                .call();

        if (res.repoPullrequest().isPresent()) {
            System.out.println(res.repoPullrequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchRepoPullrequest2Request](../../models/operations/PatchRepoPullrequest2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchRepoPullrequest2Response](../../models/operations/PatchRepoPullrequest2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeRepoPullrequest2

Remove a pullrequest

### Example Usage

<!-- UsageSnippet language="java" operationID="removeRepoPullrequest2" method="delete" path="/repo/{connection_id}/pullrequest/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveRepoPullrequest2Request;
import to.unified.unified_java_sdk.models.operations.RemoveRepoPullrequest2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveRepoPullrequest2Request req = RemoveRepoPullrequest2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveRepoPullrequest2Response res = sdk.pullrequest().removeRepoPullrequest2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveRepoPullrequest2Request](../../models/operations/RemoveRepoPullrequest2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveRepoPullrequest2Response](../../models/operations/RemoveRepoPullrequest2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateRepoPullrequest2

Update a pullrequest

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRepoPullrequest2" method="put" path="/repo/{connection_id}/pullrequest/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateRepoPullrequest2Request;
import to.unified.unified_java_sdk.models.operations.UpdateRepoPullrequest2Response;
import to.unified.unified_java_sdk.models.shared.RepoPullrequest;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateRepoPullrequest2Request req = UpdateRepoPullrequest2Request.builder()
                .repoPullrequest(RepoPullrequest.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoPullrequest2Response res = sdk.pullrequest().updateRepoPullrequest2()
                .request(req)
                .call();

        if (res.repoPullrequest().isPresent()) {
            System.out.println(res.repoPullrequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateRepoPullrequest2Request](../../models/operations/UpdateRepoPullrequest2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateRepoPullrequest2Response](../../models/operations/UpdateRepoPullrequest2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |