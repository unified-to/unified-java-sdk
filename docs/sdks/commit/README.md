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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateRepoCommitRequest;
import com.unifiedapi.unifiedto.models.operations.CreateRepoCommitResponse;
import com.unifiedapi.unifiedto.models.shared.RepoCommit;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateRepoCommitRequest req = CreateRepoCommitRequest.builder()
                .repoCommit(RepoCommit.builder()
                    .repoId("<id>")
                    .userId("<id>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetRepoCommitRequest;
import com.unifiedapi.unifiedto.models.operations.GetRepoCommitResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListRepoCommitsRequest;
import com.unifiedapi.unifiedto.models.operations.ListRepoCommitsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchRepoCommitRequest;
import com.unifiedapi.unifiedto.models.operations.PatchRepoCommitResponse;
import com.unifiedapi.unifiedto.models.shared.RepoCommit;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchRepoCommitRequest req = PatchRepoCommitRequest.builder()
                .repoCommit(RepoCommit.builder()
                    .repoId("<id>")
                    .userId("<id>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveRepoCommitRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveRepoCommitResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateRepoCommitRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateRepoCommitResponse;
import com.unifiedapi.unifiedto.models.shared.RepoCommit;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateRepoCommitRequest req = UpdateRepoCommitRequest.builder()
                .repoCommit(RepoCommit.builder()
                    .repoId("<id>")
                    .userId("<id>")
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