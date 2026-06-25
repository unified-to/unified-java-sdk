# Branch

## Overview

### Available Operations

* [createRepoBranch2](#createrepobranch2) - Create a branch
* [getRepoBranch2](#getrepobranch2) - Retrieve a branch
* [listRepoBranches2](#listrepobranches2) - List all branches
* [patchRepoBranch2](#patchrepobranch2) - Update a branch
* [removeRepoBranch2](#removerepobranch2) - Remove a branch
* [updateRepoBranch2](#updaterepobranch2) - Update a branch

## createRepoBranch2

Create a branch

### Example Usage

<!-- UsageSnippet language="java" operationID="createRepoBranch2" method="post" path="/repo/{connection_id}/branch" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateRepoBranch2Request;
import to.unified.unified_java_sdk.models.operations.CreateRepoBranch2Response;
import to.unified.unified_java_sdk.models.shared.RepoBranch;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateRepoBranch2Request req = CreateRepoBranch2Request.builder()
                .repoBranch(RepoBranch.builder()
                    .name("<value>")
                    .repoId("<id>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateRepoBranch2Response res = sdk.branch().createRepoBranch2()
                .request(req)
                .call();

        if (res.repoBranch().isPresent()) {
            System.out.println(res.repoBranch().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateRepoBranch2Request](../../models/operations/CreateRepoBranch2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateRepoBranch2Response](../../models/operations/CreateRepoBranch2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRepoBranch2

Retrieve a branch

### Example Usage

<!-- UsageSnippet language="java" operationID="getRepoBranch2" method="get" path="/repo/{connection_id}/branch/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetRepoBranch2Request;
import to.unified.unified_java_sdk.models.operations.GetRepoBranch2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetRepoBranch2Request req = GetRepoBranch2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetRepoBranch2Response res = sdk.branch().getRepoBranch2()
                .request(req)
                .call();

        if (res.repoBranch().isPresent()) {
            System.out.println(res.repoBranch().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetRepoBranch2Request](../../models/operations/GetRepoBranch2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetRepoBranch2Response](../../models/operations/GetRepoBranch2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listRepoBranches2

List all branches

### Example Usage

<!-- UsageSnippet language="java" operationID="listRepoBranches2" method="get" path="/repo/{connection_id}/branch" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListRepoBranches2Request;
import to.unified.unified_java_sdk.models.operations.ListRepoBranches2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListRepoBranches2Request req = ListRepoBranches2Request.builder()
                .connectionId("<id>")
                .build();

        ListRepoBranches2Response res = sdk.branch().listRepoBranches2()
                .request(req)
                .call();

        if (res.repoBranches().isPresent()) {
            System.out.println(res.repoBranches().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListRepoBranches2Request](../../models/operations/ListRepoBranches2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListRepoBranches2Response](../../models/operations/ListRepoBranches2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchRepoBranch2

Update a branch

### Example Usage

<!-- UsageSnippet language="java" operationID="patchRepoBranch2" method="patch" path="/repo/{connection_id}/branch/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchRepoBranch2Request;
import to.unified.unified_java_sdk.models.operations.PatchRepoBranch2Response;
import to.unified.unified_java_sdk.models.shared.RepoBranch;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchRepoBranch2Request req = PatchRepoBranch2Request.builder()
                .repoBranch(RepoBranch.builder()
                    .name("<value>")
                    .repoId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoBranch2Response res = sdk.branch().patchRepoBranch2()
                .request(req)
                .call();

        if (res.repoBranch().isPresent()) {
            System.out.println(res.repoBranch().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchRepoBranch2Request](../../models/operations/PatchRepoBranch2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchRepoBranch2Response](../../models/operations/PatchRepoBranch2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeRepoBranch2

Remove a branch

### Example Usage

<!-- UsageSnippet language="java" operationID="removeRepoBranch2" method="delete" path="/repo/{connection_id}/branch/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveRepoBranch2Request;
import to.unified.unified_java_sdk.models.operations.RemoveRepoBranch2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveRepoBranch2Request req = RemoveRepoBranch2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveRepoBranch2Response res = sdk.branch().removeRepoBranch2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveRepoBranch2Request](../../models/operations/RemoveRepoBranch2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveRepoBranch2Response](../../models/operations/RemoveRepoBranch2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateRepoBranch2

Update a branch

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRepoBranch2" method="put" path="/repo/{connection_id}/branch/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateRepoBranch2Request;
import to.unified.unified_java_sdk.models.operations.UpdateRepoBranch2Response;
import to.unified.unified_java_sdk.models.shared.RepoBranch;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateRepoBranch2Request req = UpdateRepoBranch2Request.builder()
                .repoBranch(RepoBranch.builder()
                    .name("<value>")
                    .repoId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoBranch2Response res = sdk.branch().updateRepoBranch2()
                .request(req)
                .call();

        if (res.repoBranch().isPresent()) {
            System.out.println(res.repoBranch().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateRepoBranch2Request](../../models/operations/UpdateRepoBranch2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateRepoBranch2Response](../../models/operations/UpdateRepoBranch2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |