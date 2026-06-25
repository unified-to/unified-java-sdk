# Commit

## Overview

### Available Operations

* [createRepoCommit2](#createrepocommit2) - Create a commit
* [getRepoCommit2](#getrepocommit2) - Retrieve a commit
* [listRepoCommits2](#listrepocommits2) - List all commits
* [patchRepoCommit2](#patchrepocommit2) - Update a commit
* [removeRepoCommit2](#removerepocommit2) - Remove a commit
* [updateRepoCommit2](#updaterepocommit2) - Update a commit

## createRepoCommit2

Create a commit

### Example Usage

<!-- UsageSnippet language="java" operationID="createRepoCommit2" method="post" path="/repo/{connection_id}/commit" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateRepoCommit2Request;
import to.unified.unified_java_sdk.models.operations.CreateRepoCommit2Response;
import to.unified.unified_java_sdk.models.shared.RepoCommit;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateRepoCommit2Request req = CreateRepoCommit2Request.builder()
                .repoCommit(RepoCommit.builder()
                    .repoId("<id>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateRepoCommit2Response res = sdk.commit().createRepoCommit2()
                .request(req)
                .call();

        if (res.repoCommit().isPresent()) {
            System.out.println(res.repoCommit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateRepoCommit2Request](../../models/operations/CreateRepoCommit2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateRepoCommit2Response](../../models/operations/CreateRepoCommit2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRepoCommit2

Retrieve a commit

### Example Usage

<!-- UsageSnippet language="java" operationID="getRepoCommit2" method="get" path="/repo/{connection_id}/commit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetRepoCommit2Request;
import to.unified.unified_java_sdk.models.operations.GetRepoCommit2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetRepoCommit2Request req = GetRepoCommit2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetRepoCommit2Response res = sdk.commit().getRepoCommit2()
                .request(req)
                .call();

        if (res.repoCommit().isPresent()) {
            System.out.println(res.repoCommit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetRepoCommit2Request](../../models/operations/GetRepoCommit2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetRepoCommit2Response](../../models/operations/GetRepoCommit2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listRepoCommits2

List all commits

### Example Usage

<!-- UsageSnippet language="java" operationID="listRepoCommits2" method="get" path="/repo/{connection_id}/commit" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListRepoCommits2Request;
import to.unified.unified_java_sdk.models.operations.ListRepoCommits2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListRepoCommits2Request req = ListRepoCommits2Request.builder()
                .connectionId("<id>")
                .build();

        ListRepoCommits2Response res = sdk.commit().listRepoCommits2()
                .request(req)
                .call();

        if (res.repoCommits().isPresent()) {
            System.out.println(res.repoCommits().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListRepoCommits2Request](../../models/operations/ListRepoCommits2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListRepoCommits2Response](../../models/operations/ListRepoCommits2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchRepoCommit2

Update a commit

### Example Usage

<!-- UsageSnippet language="java" operationID="patchRepoCommit2" method="patch" path="/repo/{connection_id}/commit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchRepoCommit2Request;
import to.unified.unified_java_sdk.models.operations.PatchRepoCommit2Response;
import to.unified.unified_java_sdk.models.shared.RepoCommit;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchRepoCommit2Request req = PatchRepoCommit2Request.builder()
                .repoCommit(RepoCommit.builder()
                    .repoId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoCommit2Response res = sdk.commit().patchRepoCommit2()
                .request(req)
                .call();

        if (res.repoCommit().isPresent()) {
            System.out.println(res.repoCommit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchRepoCommit2Request](../../models/operations/PatchRepoCommit2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchRepoCommit2Response](../../models/operations/PatchRepoCommit2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeRepoCommit2

Remove a commit

### Example Usage

<!-- UsageSnippet language="java" operationID="removeRepoCommit2" method="delete" path="/repo/{connection_id}/commit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveRepoCommit2Request;
import to.unified.unified_java_sdk.models.operations.RemoveRepoCommit2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveRepoCommit2Request req = RemoveRepoCommit2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveRepoCommit2Response res = sdk.commit().removeRepoCommit2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveRepoCommit2Request](../../models/operations/RemoveRepoCommit2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveRepoCommit2Response](../../models/operations/RemoveRepoCommit2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateRepoCommit2

Update a commit

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRepoCommit2" method="put" path="/repo/{connection_id}/commit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateRepoCommit2Request;
import to.unified.unified_java_sdk.models.operations.UpdateRepoCommit2Response;
import to.unified.unified_java_sdk.models.shared.RepoCommit;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateRepoCommit2Request req = UpdateRepoCommit2Request.builder()
                .repoCommit(RepoCommit.builder()
                    .repoId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoCommit2Response res = sdk.commit().updateRepoCommit2()
                .request(req)
                .call();

        if (res.repoCommit().isPresent()) {
            System.out.println(res.repoCommit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateRepoCommit2Request](../../models/operations/UpdateRepoCommit2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateRepoCommit2Response](../../models/operations/UpdateRepoCommit2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |