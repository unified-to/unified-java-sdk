# Branch

## Overview

### Available Operations

* [createRepoBranch](#createrepobranch) - Create a branch
* [getRepoBranch](#getrepobranch) - Retrieve a branch
* [listRepoBranches](#listrepobranches) - List all branches
* [patchRepoBranch](#patchrepobranch) - Update a branch
* [removeRepoBranch](#removerepobranch) - Remove a branch
* [updateRepoBranch](#updaterepobranch) - Update a branch

## createRepoBranch

Create a branch

### Example Usage

<!-- UsageSnippet language="java" operationID="createRepoBranch" method="post" path="/repo/{connection_id}/branch" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateRepoBranchRequest;
import to.unified.unified_java_sdk.models.operations.CreateRepoBranchResponse;
import to.unified.unified_java_sdk.models.shared.RepoBranch;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateRepoBranchRequest req = CreateRepoBranchRequest.builder()
                .repoBranch(RepoBranch.builder()
                    .name("<value>")
                    .repoId("<id>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateRepoBranchResponse res = sdk.branch().createRepoBranch()
                .request(req)
                .call();

        if (res.repoBranch().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateRepoBranchRequest](../../models/operations/CreateRepoBranchRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateRepoBranchResponse](../../models/operations/CreateRepoBranchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRepoBranch

Retrieve a branch

### Example Usage

<!-- UsageSnippet language="java" operationID="getRepoBranch" method="get" path="/repo/{connection_id}/branch/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetRepoBranchRequest;
import to.unified.unified_java_sdk.models.operations.GetRepoBranchResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetRepoBranchRequest req = GetRepoBranchRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetRepoBranchResponse res = sdk.branch().getRepoBranch()
                .request(req)
                .call();

        if (res.repoBranch().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetRepoBranchRequest](../../models/operations/GetRepoBranchRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetRepoBranchResponse](../../models/operations/GetRepoBranchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listRepoBranches

List all branches

### Example Usage

<!-- UsageSnippet language="java" operationID="listRepoBranches" method="get" path="/repo/{connection_id}/branch" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListRepoBranchesRequest;
import to.unified.unified_java_sdk.models.operations.ListRepoBranchesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListRepoBranchesRequest req = ListRepoBranchesRequest.builder()
                .connectionId("<id>")
                .build();

        ListRepoBranchesResponse res = sdk.branch().listRepoBranches()
                .request(req)
                .call();

        if (res.repoBranches().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListRepoBranchesRequest](../../models/operations/ListRepoBranchesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListRepoBranchesResponse](../../models/operations/ListRepoBranchesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchRepoBranch

Update a branch

### Example Usage

<!-- UsageSnippet language="java" operationID="patchRepoBranch" method="patch" path="/repo/{connection_id}/branch/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchRepoBranchRequest;
import to.unified.unified_java_sdk.models.operations.PatchRepoBranchResponse;
import to.unified.unified_java_sdk.models.shared.RepoBranch;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchRepoBranchRequest req = PatchRepoBranchRequest.builder()
                .repoBranch(RepoBranch.builder()
                    .name("<value>")
                    .repoId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoBranchResponse res = sdk.branch().patchRepoBranch()
                .request(req)
                .call();

        if (res.repoBranch().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchRepoBranchRequest](../../models/operations/PatchRepoBranchRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchRepoBranchResponse](../../models/operations/PatchRepoBranchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeRepoBranch

Remove a branch

### Example Usage

<!-- UsageSnippet language="java" operationID="removeRepoBranch" method="delete" path="/repo/{connection_id}/branch/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveRepoBranchRequest;
import to.unified.unified_java_sdk.models.operations.RemoveRepoBranchResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveRepoBranchRequest req = RemoveRepoBranchRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveRepoBranchResponse res = sdk.branch().removeRepoBranch()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveRepoBranchRequest](../../models/operations/RemoveRepoBranchRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveRepoBranchResponse](../../models/operations/RemoveRepoBranchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateRepoBranch

Update a branch

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRepoBranch" method="put" path="/repo/{connection_id}/branch/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateRepoBranchRequest;
import to.unified.unified_java_sdk.models.operations.UpdateRepoBranchResponse;
import to.unified.unified_java_sdk.models.shared.RepoBranch;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateRepoBranchRequest req = UpdateRepoBranchRequest.builder()
                .repoBranch(RepoBranch.builder()
                    .name("<value>")
                    .repoId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoBranchResponse res = sdk.branch().updateRepoBranch()
                .request(req)
                .call();

        if (res.repoBranch().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateRepoBranchRequest](../../models/operations/UpdateRepoBranchRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateRepoBranchResponse](../../models/operations/UpdateRepoBranchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |