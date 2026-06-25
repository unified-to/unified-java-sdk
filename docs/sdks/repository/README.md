# Repository

## Overview

### Available Operations

* [createRepoRepository2](#createreporepository2) - Create a repository
* [getRepoRepository2](#getreporepository2) - Retrieve a repository
* [listRepoRepositories2](#listreporepositories2) - List all repositories
* [patchRepoRepository2](#patchreporepository2) - Update a repository
* [removeRepoRepository2](#removereporepository2) - Remove a repository
* [updateRepoRepository2](#updatereporepository2) - Update a repository

## createRepoRepository2

Create a repository

### Example Usage

<!-- UsageSnippet language="java" operationID="createRepoRepository2" method="post" path="/repo/{connection_id}/repository" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateRepoRepository2Request;
import to.unified.unified_java_sdk.models.operations.CreateRepoRepository2Response;
import to.unified.unified_java_sdk.models.shared.RepoRepository;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateRepoRepository2Request req = CreateRepoRepository2Request.builder()
                .repoRepository(RepoRepository.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateRepoRepository2Response res = sdk.repository().createRepoRepository2()
                .request(req)
                .call();

        if (res.repoRepository().isPresent()) {
            System.out.println(res.repoRepository().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateRepoRepository2Request](../../models/operations/CreateRepoRepository2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateRepoRepository2Response](../../models/operations/CreateRepoRepository2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRepoRepository2

Retrieve a repository

### Example Usage

<!-- UsageSnippet language="java" operationID="getRepoRepository2" method="get" path="/repo/{connection_id}/repository/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetRepoRepository2Request;
import to.unified.unified_java_sdk.models.operations.GetRepoRepository2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetRepoRepository2Request req = GetRepoRepository2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetRepoRepository2Response res = sdk.repository().getRepoRepository2()
                .request(req)
                .call();

        if (res.repoRepository().isPresent()) {
            System.out.println(res.repoRepository().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetRepoRepository2Request](../../models/operations/GetRepoRepository2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetRepoRepository2Response](../../models/operations/GetRepoRepository2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listRepoRepositories2

List all repositories

### Example Usage

<!-- UsageSnippet language="java" operationID="listRepoRepositories2" method="get" path="/repo/{connection_id}/repository" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListRepoRepositories2Request;
import to.unified.unified_java_sdk.models.operations.ListRepoRepositories2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListRepoRepositories2Request req = ListRepoRepositories2Request.builder()
                .connectionId("<id>")
                .build();

        ListRepoRepositories2Response res = sdk.repository().listRepoRepositories2()
                .request(req)
                .call();

        if (res.repoRepositories().isPresent()) {
            System.out.println(res.repoRepositories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListRepoRepositories2Request](../../models/operations/ListRepoRepositories2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListRepoRepositories2Response](../../models/operations/ListRepoRepositories2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchRepoRepository2

Update a repository

### Example Usage

<!-- UsageSnippet language="java" operationID="patchRepoRepository2" method="patch" path="/repo/{connection_id}/repository/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchRepoRepository2Request;
import to.unified.unified_java_sdk.models.operations.PatchRepoRepository2Response;
import to.unified.unified_java_sdk.models.shared.RepoRepository;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchRepoRepository2Request req = PatchRepoRepository2Request.builder()
                .repoRepository(RepoRepository.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoRepository2Response res = sdk.repository().patchRepoRepository2()
                .request(req)
                .call();

        if (res.repoRepository().isPresent()) {
            System.out.println(res.repoRepository().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchRepoRepository2Request](../../models/operations/PatchRepoRepository2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchRepoRepository2Response](../../models/operations/PatchRepoRepository2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeRepoRepository2

Remove a repository

### Example Usage

<!-- UsageSnippet language="java" operationID="removeRepoRepository2" method="delete" path="/repo/{connection_id}/repository/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveRepoRepository2Request;
import to.unified.unified_java_sdk.models.operations.RemoveRepoRepository2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveRepoRepository2Request req = RemoveRepoRepository2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveRepoRepository2Response res = sdk.repository().removeRepoRepository2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveRepoRepository2Request](../../models/operations/RemoveRepoRepository2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveRepoRepository2Response](../../models/operations/RemoveRepoRepository2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateRepoRepository2

Update a repository

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRepoRepository2" method="put" path="/repo/{connection_id}/repository/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateRepoRepository2Request;
import to.unified.unified_java_sdk.models.operations.UpdateRepoRepository2Response;
import to.unified.unified_java_sdk.models.shared.RepoRepository;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateRepoRepository2Request req = UpdateRepoRepository2Request.builder()
                .repoRepository(RepoRepository.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoRepository2Response res = sdk.repository().updateRepoRepository2()
                .request(req)
                .call();

        if (res.repoRepository().isPresent()) {
            System.out.println(res.repoRepository().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateRepoRepository2Request](../../models/operations/UpdateRepoRepository2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateRepoRepository2Response](../../models/operations/UpdateRepoRepository2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |