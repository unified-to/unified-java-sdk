# Repository

## Overview

### Available Operations

* [createRepoRepository](#createreporepository) - Create a repository
* [getRepoRepository](#getreporepository) - Retrieve a repository
* [listRepoRepositories](#listreporepositories) - List all repositories
* [patchRepoRepository](#patchreporepository) - Update a repository
* [removeRepoRepository](#removereporepository) - Remove a repository
* [updateRepoRepository](#updatereporepository) - Update a repository

## createRepoRepository

Create a repository

### Example Usage

<!-- UsageSnippet language="java" operationID="createRepoRepository" method="post" path="/repo/{connection_id}/repository" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateRepoRepositoryRequest;
import to.unified.unified_java_sdk.models.operations.CreateRepoRepositoryResponse;
import to.unified.unified_java_sdk.models.shared.RepoRepository;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateRepoRepositoryRequest req = CreateRepoRepositoryRequest.builder()
                .repoRepository(RepoRepository.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateRepoRepositoryResponse res = sdk.repository().createRepoRepository()
                .request(req)
                .call();

        if (res.repoRepository().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateRepoRepositoryRequest](../../models/operations/CreateRepoRepositoryRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateRepoRepositoryResponse](../../models/operations/CreateRepoRepositoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRepoRepository

Retrieve a repository

### Example Usage

<!-- UsageSnippet language="java" operationID="getRepoRepository" method="get" path="/repo/{connection_id}/repository/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetRepoRepositoryRequest;
import to.unified.unified_java_sdk.models.operations.GetRepoRepositoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetRepoRepositoryRequest req = GetRepoRepositoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetRepoRepositoryResponse res = sdk.repository().getRepoRepository()
                .request(req)
                .call();

        if (res.repoRepository().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetRepoRepositoryRequest](../../models/operations/GetRepoRepositoryRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetRepoRepositoryResponse](../../models/operations/GetRepoRepositoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listRepoRepositories

List all repositories

### Example Usage

<!-- UsageSnippet language="java" operationID="listRepoRepositories" method="get" path="/repo/{connection_id}/repository" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListRepoRepositoriesRequest;
import to.unified.unified_java_sdk.models.operations.ListRepoRepositoriesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListRepoRepositoriesRequest req = ListRepoRepositoriesRequest.builder()
                .connectionId("<id>")
                .build();

        ListRepoRepositoriesResponse res = sdk.repository().listRepoRepositories()
                .request(req)
                .call();

        if (res.repoRepositories().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListRepoRepositoriesRequest](../../models/operations/ListRepoRepositoriesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListRepoRepositoriesResponse](../../models/operations/ListRepoRepositoriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchRepoRepository

Update a repository

### Example Usage

<!-- UsageSnippet language="java" operationID="patchRepoRepository" method="patch" path="/repo/{connection_id}/repository/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchRepoRepositoryRequest;
import to.unified.unified_java_sdk.models.operations.PatchRepoRepositoryResponse;
import to.unified.unified_java_sdk.models.shared.RepoRepository;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchRepoRepositoryRequest req = PatchRepoRepositoryRequest.builder()
                .repoRepository(RepoRepository.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoRepositoryResponse res = sdk.repository().patchRepoRepository()
                .request(req)
                .call();

        if (res.repoRepository().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchRepoRepositoryRequest](../../models/operations/PatchRepoRepositoryRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchRepoRepositoryResponse](../../models/operations/PatchRepoRepositoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeRepoRepository

Remove a repository

### Example Usage

<!-- UsageSnippet language="java" operationID="removeRepoRepository" method="delete" path="/repo/{connection_id}/repository/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveRepoRepositoryRequest;
import to.unified.unified_java_sdk.models.operations.RemoveRepoRepositoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveRepoRepositoryRequest req = RemoveRepoRepositoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveRepoRepositoryResponse res = sdk.repository().removeRepoRepository()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveRepoRepositoryRequest](../../models/operations/RemoveRepoRepositoryRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveRepoRepositoryResponse](../../models/operations/RemoveRepoRepositoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateRepoRepository

Update a repository

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRepoRepository" method="put" path="/repo/{connection_id}/repository/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateRepoRepositoryRequest;
import to.unified.unified_java_sdk.models.operations.UpdateRepoRepositoryResponse;
import to.unified.unified_java_sdk.models.shared.RepoRepository;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateRepoRepositoryRequest req = UpdateRepoRepositoryRequest.builder()
                .repoRepository(RepoRepository.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoRepositoryResponse res = sdk.repository().updateRepoRepository()
                .request(req)
                .call();

        if (res.repoRepository().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateRepoRepositoryRequest](../../models/operations/UpdateRepoRepositoryRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateRepoRepositoryResponse](../../models/operations/UpdateRepoRepositoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |