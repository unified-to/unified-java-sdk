# Repo
(*repo()*)

## Overview

### Available Operations

* [createRepoBranch](#createrepobranch) - Create a branch
* [createRepoCommit](#createrepocommit) - Create a commit
* [createRepoOrganization](#createrepoorganization) - Create an organization
* [createRepoPullrequest](#createrepopullrequest) - Create a pullrequest
* [createRepoRepository](#createreporepository) - Create a repository
* [getRepoBranch](#getrepobranch) - Retrieve a branch
* [getRepoCommit](#getrepocommit) - Retrieve a commit
* [getRepoOrganization](#getrepoorganization) - Retrieve an organization
* [getRepoPullrequest](#getrepopullrequest) - Retrieve a pullrequest
* [getRepoRepository](#getreporepository) - Retrieve a repository
* [listRepoBranches](#listrepobranches) - List all branches
* [listRepoCommits](#listrepocommits) - List all commits
* [listRepoOrganizations](#listrepoorganizations) - List all organizations
* [listRepoPullrequests](#listrepopullrequests) - List all pullrequests
* [listRepoRepositories](#listreporepositories) - List all repositories
* [patchRepoBranch](#patchrepobranch) - Update a branch
* [patchRepoCommit](#patchrepocommit) - Update a commit
* [patchRepoOrganization](#patchrepoorganization) - Update an organization
* [patchRepoPullrequest](#patchrepopullrequest) - Update a pullrequest
* [patchRepoRepository](#patchreporepository) - Update a repository
* [removeRepoBranch](#removerepobranch) - Remove a branch
* [removeRepoCommit](#removerepocommit) - Remove a commit
* [removeRepoOrganization](#removerepoorganization) - Remove an organization
* [removeRepoPullrequest](#removerepopullrequest) - Remove a pullrequest
* [removeRepoRepository](#removereporepository) - Remove a repository
* [updateRepoBranch](#updaterepobranch) - Update a branch
* [updateRepoCommit](#updaterepocommit) - Update a commit
* [updateRepoOrganization](#updaterepoorganization) - Update an organization
* [updateRepoPullrequest](#updaterepopullrequest) - Update a pullrequest
* [updateRepoRepository](#updatereporepository) - Update a repository

## createRepoBranch

Create a branch

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateRepoBranchRequest;
import com.unifiedapi.unifiedto.models.operations.CreateRepoBranchResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateRepoBranchRequest req = CreateRepoBranchRequest.builder()
                .connectionId("<id>")
                .build();

        CreateRepoBranchResponse res = sdk.repo().createRepoBranch()
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

## createRepoCommit

Create a commit

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateRepoCommitRequest;
import com.unifiedapi.unifiedto.models.operations.CreateRepoCommitResponse;
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
                .connectionId("<id>")
                .build();

        CreateRepoCommitResponse res = sdk.repo().createRepoCommit()
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

## createRepoOrganization

Create an organization

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateRepoOrganizationRequest;
import com.unifiedapi.unifiedto.models.operations.CreateRepoOrganizationResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateRepoOrganizationRequest req = CreateRepoOrganizationRequest.builder()
                .connectionId("<id>")
                .build();

        CreateRepoOrganizationResponse res = sdk.repo().createRepoOrganization()
                .request(req)
                .call();

        if (res.repoOrganization().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateRepoOrganizationRequest](../../models/operations/CreateRepoOrganizationRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateRepoOrganizationResponse](../../models/operations/CreateRepoOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createRepoPullrequest

Create a pullrequest

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateRepoPullrequestRequest;
import com.unifiedapi.unifiedto.models.operations.CreateRepoPullrequestResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateRepoPullrequestRequest req = CreateRepoPullrequestRequest.builder()
                .connectionId("<id>")
                .build();

        CreateRepoPullrequestResponse res = sdk.repo().createRepoPullrequest()
                .request(req)
                .call();

        if (res.repoPullrequest().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateRepoPullrequestRequest](../../models/operations/CreateRepoPullrequestRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateRepoPullrequestResponse](../../models/operations/CreateRepoPullrequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateRepoRepositoryResponse res = sdk.repo().createRepoRepository()
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

## getRepoBranch

Retrieve a branch

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetRepoBranchRequest;
import com.unifiedapi.unifiedto.models.operations.GetRepoBranchResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetRepoBranchRequest req = GetRepoBranchRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetRepoBranchResponse res = sdk.repo().getRepoBranch()
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

        GetRepoCommitResponse res = sdk.repo().getRepoCommit()
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

## getRepoOrganization

Retrieve an organization

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetRepoOrganizationRequest;
import com.unifiedapi.unifiedto.models.operations.GetRepoOrganizationResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetRepoOrganizationRequest req = GetRepoOrganizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetRepoOrganizationResponse res = sdk.repo().getRepoOrganization()
                .request(req)
                .call();

        if (res.repoOrganization().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetRepoOrganizationRequest](../../models/operations/GetRepoOrganizationRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetRepoOrganizationResponse](../../models/operations/GetRepoOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRepoPullrequest

Retrieve a pullrequest

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetRepoPullrequestRequest;
import com.unifiedapi.unifiedto.models.operations.GetRepoPullrequestResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetRepoPullrequestRequest req = GetRepoPullrequestRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetRepoPullrequestResponse res = sdk.repo().getRepoPullrequest()
                .request(req)
                .call();

        if (res.repoPullrequest().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetRepoPullrequestRequest](../../models/operations/GetRepoPullrequestRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetRepoPullrequestResponse](../../models/operations/GetRepoPullrequestResponse.md)**

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

        GetRepoRepositoryResponse res = sdk.repo().getRepoRepository()
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

## listRepoBranches

List all branches

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListRepoBranchesRequest;
import com.unifiedapi.unifiedto.models.operations.ListRepoBranchesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListRepoBranchesRequest req = ListRepoBranchesRequest.builder()
                .connectionId("<id>")
                .build();

        ListRepoBranchesResponse res = sdk.repo().listRepoBranches()
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

        ListRepoCommitsResponse res = sdk.repo().listRepoCommits()
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

## listRepoOrganizations

List all organizations

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListRepoOrganizationsRequest;
import com.unifiedapi.unifiedto.models.operations.ListRepoOrganizationsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListRepoOrganizationsRequest req = ListRepoOrganizationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListRepoOrganizationsResponse res = sdk.repo().listRepoOrganizations()
                .request(req)
                .call();

        if (res.repoOrganizations().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListRepoOrganizationsRequest](../../models/operations/ListRepoOrganizationsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListRepoOrganizationsResponse](../../models/operations/ListRepoOrganizationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listRepoPullrequests

List all pullrequests

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListRepoPullrequestsRequest;
import com.unifiedapi.unifiedto.models.operations.ListRepoPullrequestsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListRepoPullrequestsRequest req = ListRepoPullrequestsRequest.builder()
                .connectionId("<id>")
                .build();

        ListRepoPullrequestsResponse res = sdk.repo().listRepoPullrequests()
                .request(req)
                .call();

        if (res.repoPullrequests().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListRepoPullrequestsRequest](../../models/operations/ListRepoPullrequestsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListRepoPullrequestsResponse](../../models/operations/ListRepoPullrequestsResponse.md)**

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

        ListRepoRepositoriesResponse res = sdk.repo().listRepoRepositories()
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

## patchRepoBranch

Update a branch

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchRepoBranchRequest;
import com.unifiedapi.unifiedto.models.operations.PatchRepoBranchResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchRepoBranchRequest req = PatchRepoBranchRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoBranchResponse res = sdk.repo().patchRepoBranch()
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

## patchRepoCommit

Update a commit

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchRepoCommitRequest;
import com.unifiedapi.unifiedto.models.operations.PatchRepoCommitResponse;
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
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoCommitResponse res = sdk.repo().patchRepoCommit()
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

## patchRepoOrganization

Update an organization

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchRepoOrganizationRequest;
import com.unifiedapi.unifiedto.models.operations.PatchRepoOrganizationResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchRepoOrganizationRequest req = PatchRepoOrganizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoOrganizationResponse res = sdk.repo().patchRepoOrganization()
                .request(req)
                .call();

        if (res.repoOrganization().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchRepoOrganizationRequest](../../models/operations/PatchRepoOrganizationRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchRepoOrganizationResponse](../../models/operations/PatchRepoOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchRepoPullrequest

Update a pullrequest

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchRepoPullrequestRequest;
import com.unifiedapi.unifiedto.models.operations.PatchRepoPullrequestResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchRepoPullrequestRequest req = PatchRepoPullrequestRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoPullrequestResponse res = sdk.repo().patchRepoPullrequest()
                .request(req)
                .call();

        if (res.repoPullrequest().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchRepoPullrequestRequest](../../models/operations/PatchRepoPullrequestRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchRepoPullrequestResponse](../../models/operations/PatchRepoPullrequestResponse.md)**

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

        PatchRepoRepositoryResponse res = sdk.repo().patchRepoRepository()
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

## removeRepoBranch

Remove a branch

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveRepoBranchRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveRepoBranchResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveRepoBranchRequest req = RemoveRepoBranchRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveRepoBranchResponse res = sdk.repo().removeRepoBranch()
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

        RemoveRepoCommitResponse res = sdk.repo().removeRepoCommit()
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

## removeRepoOrganization

Remove an organization

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveRepoOrganizationRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveRepoOrganizationResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveRepoOrganizationRequest req = RemoveRepoOrganizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveRepoOrganizationResponse res = sdk.repo().removeRepoOrganization()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveRepoOrganizationRequest](../../models/operations/RemoveRepoOrganizationRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveRepoOrganizationResponse](../../models/operations/RemoveRepoOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeRepoPullrequest

Remove a pullrequest

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveRepoPullrequestRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveRepoPullrequestResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveRepoPullrequestRequest req = RemoveRepoPullrequestRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveRepoPullrequestResponse res = sdk.repo().removeRepoPullrequest()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveRepoPullrequestRequest](../../models/operations/RemoveRepoPullrequestRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveRepoPullrequestResponse](../../models/operations/RemoveRepoPullrequestResponse.md)**

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

        RemoveRepoRepositoryResponse res = sdk.repo().removeRepoRepository()
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

## updateRepoBranch

Update a branch

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateRepoBranchRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateRepoBranchResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateRepoBranchRequest req = UpdateRepoBranchRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoBranchResponse res = sdk.repo().updateRepoBranch()
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

## updateRepoCommit

Update a commit

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateRepoCommitRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateRepoCommitResponse;
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
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoCommitResponse res = sdk.repo().updateRepoCommit()
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

## updateRepoOrganization

Update an organization

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateRepoOrganizationRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateRepoOrganizationResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateRepoOrganizationRequest req = UpdateRepoOrganizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoOrganizationResponse res = sdk.repo().updateRepoOrganization()
                .request(req)
                .call();

        if (res.repoOrganization().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateRepoOrganizationRequest](../../models/operations/UpdateRepoOrganizationRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateRepoOrganizationResponse](../../models/operations/UpdateRepoOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateRepoPullrequest

Update a pullrequest

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateRepoPullrequestRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateRepoPullrequestResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateRepoPullrequestRequest req = UpdateRepoPullrequestRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoPullrequestResponse res = sdk.repo().updateRepoPullrequest()
                .request(req)
                .call();

        if (res.repoPullrequest().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateRepoPullrequestRequest](../../models/operations/UpdateRepoPullrequestRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateRepoPullrequestResponse](../../models/operations/UpdateRepoPullrequestResponse.md)**

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

        UpdateRepoRepositoryResponse res = sdk.repo().updateRepoRepository()
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