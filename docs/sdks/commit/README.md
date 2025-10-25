# Commit
(*commit()*)

## Overview

### Available Operations

* [createRepoCommit](#createrepocommit) - Create a commit
* [getRepoCommit](#getrepocommit) - Retrieve a commit
* [listRepoCommits](#listrepocommits) - List all commits
* [patchRepoCommit](#patchrepocommit) - Update a commit
* [removeRepoCommit](#removerepocommit) - Remove a commit
* [updateRepoCommit](#updaterepocommit) - Update a commit

## createRepoCommit

Create a commit

### Example Usage

<!-- UsageSnippet language="java" operationID="createRepoCommit" method="post" path="/repo/{connection_id}/commit" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateRepoCommitRequest;
import to.unified.unified_java_sdk.models.operations.CreateRepoCommitResponse;
import to.unified.unified_java_sdk.models.shared.RepoCommit;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateRepoCommitRequest req = CreateRepoCommitRequest.builder()
                .repoCommit(RepoCommit.builder()
                    .repoId("<id>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateRepoCommitResponse res = sdk.commit().createRepoCommit()
                .request(req)
                .call();

        if (res.repoCommit().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateRepoCommitRequest](../../models/operations/CreateRepoCommitRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateRepoCommitResponse](../../models/operations/CreateRepoCommitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRepoCommit

Retrieve a commit

### Example Usage

<!-- UsageSnippet language="java" operationID="getRepoCommit" method="get" path="/repo/{connection_id}/commit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetRepoCommitRequest;
import to.unified.unified_java_sdk.models.operations.GetRepoCommitResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetRepoCommitRequest req = GetRepoCommitRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetRepoCommitResponse res = sdk.commit().getRepoCommit()
                .request(req)
                .call();

        if (res.repoCommit().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetRepoCommitRequest](../../models/operations/GetRepoCommitRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetRepoCommitResponse](../../models/operations/GetRepoCommitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listRepoCommits

List all commits

### Example Usage

<!-- UsageSnippet language="java" operationID="listRepoCommits" method="get" path="/repo/{connection_id}/commit" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListRepoCommitsRequest;
import to.unified.unified_java_sdk.models.operations.ListRepoCommitsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListRepoCommitsRequest req = ListRepoCommitsRequest.builder()
                .connectionId("<id>")
                .build();

        ListRepoCommitsResponse res = sdk.commit().listRepoCommits()
                .request(req)
                .call();

        if (res.repoCommits().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListRepoCommitsRequest](../../models/operations/ListRepoCommitsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListRepoCommitsResponse](../../models/operations/ListRepoCommitsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchRepoCommit

Update a commit

### Example Usage

<!-- UsageSnippet language="java" operationID="patchRepoCommit" method="patch" path="/repo/{connection_id}/commit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchRepoCommitRequest;
import to.unified.unified_java_sdk.models.operations.PatchRepoCommitResponse;
import to.unified.unified_java_sdk.models.shared.RepoCommit;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchRepoCommitRequest req = PatchRepoCommitRequest.builder()
                .repoCommit(RepoCommit.builder()
                    .repoId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoCommitResponse res = sdk.commit().patchRepoCommit()
                .request(req)
                .call();

        if (res.repoCommit().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchRepoCommitRequest](../../models/operations/PatchRepoCommitRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchRepoCommitResponse](../../models/operations/PatchRepoCommitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeRepoCommit

Remove a commit

### Example Usage

<!-- UsageSnippet language="java" operationID="removeRepoCommit" method="delete" path="/repo/{connection_id}/commit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveRepoCommitRequest;
import to.unified.unified_java_sdk.models.operations.RemoveRepoCommitResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveRepoCommitRequest req = RemoveRepoCommitRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveRepoCommitResponse res = sdk.commit().removeRepoCommit()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveRepoCommitRequest](../../models/operations/RemoveRepoCommitRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveRepoCommitResponse](../../models/operations/RemoveRepoCommitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateRepoCommit

Update a commit

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRepoCommit" method="put" path="/repo/{connection_id}/commit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateRepoCommitRequest;
import to.unified.unified_java_sdk.models.operations.UpdateRepoCommitResponse;
import to.unified.unified_java_sdk.models.shared.RepoCommit;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateRepoCommitRequest req = UpdateRepoCommitRequest.builder()
                .repoCommit(RepoCommit.builder()
                    .repoId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoCommitResponse res = sdk.commit().updateRepoCommit()
                .request(req)
                .call();

        if (res.repoCommit().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateRepoCommitRequest](../../models/operations/UpdateRepoCommitRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateRepoCommitResponse](../../models/operations/UpdateRepoCommitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |