# Repository
(*repository()*)

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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateRepoRepositoryRequest;
import com.unifiedapi.unifiedto.models.operations.CreateRepoRepositoryResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateRepoRepositoryRequest req = CreateRepoRepositoryRequest.builder()
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetRepoRepositoryRequest;
import com.unifiedapi.unifiedto.models.operations.GetRepoRepositoryResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListRepoRepositoriesRequest;
import com.unifiedapi.unifiedto.models.operations.ListRepoRepositoriesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchRepoRepositoryRequest;
import com.unifiedapi.unifiedto.models.operations.PatchRepoRepositoryResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchRepoRepositoryRequest req = PatchRepoRepositoryRequest.builder()
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveRepoRepositoryRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveRepoRepositoryResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateRepoRepositoryRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateRepoRepositoryResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateRepoRepositoryRequest req = UpdateRepoRepositoryRequest.builder()
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