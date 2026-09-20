# Repo

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

<!-- UsageSnippet language="java" operationID="createRepoBranch" method="post" path="/repo/{connection_id}/branch" example="repo_branch" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .name("voluptas")
                    .repoId("<id>")
                    .createdAt(OffsetDateTime.parse("2019-02-24T09:33:48.540Z"))
                    .id("b153a666-476d-417a-a60d-47775f1b1dea")
                    .updatedAt(OffsetDateTime.parse("2020-01-03T19:49:19.639Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateRepoBranchResponse res = sdk.repo().createRepoBranch()
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

<!-- UsageSnippet language="java" operationID="createRepoCommit" method="post" path="/repo/{connection_id}/commit" example="repo_commit" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .createdAt(OffsetDateTime.parse("2020-07-12T16:20:42.520Z"))
                    .id("5482d8f5-5f47-4608-9752-d4df3a4debb7")
                    .linesAdded(313d)
                    .linesChanged(659d)
                    .linesDeleted(482d)
                    .message("Auctus ascisco esse attollo clarus odio tum bis rerum.")
                    .updatedAt(OffsetDateTime.parse("2023-05-17T01:33:37.705Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateRepoCommitResponse res = sdk.repo().createRepoCommit()
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

<!-- UsageSnippet language="java" operationID="createRepoOrganization" method="post" path="/repo/{connection_id}/organization" example="repo_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateRepoOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.CreateRepoOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.RepoOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateRepoOrganizationRequest req = CreateRepoOrganizationRequest.builder()
                .repoOrganization(RepoOrganization.builder()
                    .avatarUrl("https://picsum.photos/seed/fGl6Lb/3157/3173")
                    .createdAt(OffsetDateTime.parse("2022-07-07T00:18:40.748Z"))
                    .description("Trepide defendo supra testimonium ager.")
                    .id("54c37b65-80d8-4d9b-943b-4639182e5416")
                    .name("Denesik - Lemke")
                    .updatedAt(OffsetDateTime.parse("2023-08-13T12:27:22.579Z"))
                    .webUrl("https://turbulent-overheard.biz")
                    .build())
                .connectionId("<id>")
                .build();

        CreateRepoOrganizationResponse res = sdk.repo().createRepoOrganization()
                .request(req)
                .call();

        if (res.repoOrganization().isPresent()) {
            System.out.println(res.repoOrganization().get());
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

<!-- UsageSnippet language="java" operationID="createRepoPullrequest" method="post" path="/repo/{connection_id}/pullrequest" example="repo_pullrequest" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateRepoPullrequestRequest;
import to.unified.unified_java_sdk.models.operations.CreateRepoPullrequestResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateRepoPullrequestRequest req = CreateRepoPullrequestRequest.builder()
                .repoPullrequest(RepoPullrequest.builder()
                    .closedAt(OffsetDateTime.parse("2025-04-13T02:47:06.452Z"))
                    .createdAt(OffsetDateTime.parse("2023-02-27T09:37:13.663Z"))
                    .id("1d05ff03-6a0a-487e-b893-5cbc820c89e0")
                    .labels(List.of(
                        "adhuc",
                        "quaerat"))
                    .notes("Coadunatio turbo curtus ceno consuasor aggero. Suggero adeo creptio tutamen vulnus aqua delicate adopto derelinquo caritas. Maiores vulgivagus succurro temporibus.")
                    .sourceBranchId("microchip-navigate")
                    .status(RepoPullrequestStatus.REJECTED)
                    .targetBranchId("feed-reboot")
                    .title("Cunae aegrus averto texo advoco bibo amet asporto.")
                    .updatedAt(OffsetDateTime.parse("2025-01-01T01:09:49.523Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateRepoPullrequestResponse res = sdk.repo().createRepoPullrequest()
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

<!-- UsageSnippet language="java" operationID="createRepoRepository" method="post" path="/repo/{connection_id}/repository" example="repo_repository" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .name("suggero")
                    .createdAt(OffsetDateTime.parse("2023-06-12T09:42:00.080Z"))
                    .description("Tribuo torqueo aetas ustulo illum.")
                    .id("2006f683-7b30-4ff5-833b-fb49426f7838")
                    .isPrivate(false)
                    .owner("Marcella Kuhic")
                    .updatedAt(OffsetDateTime.parse("2024-02-23T10:58:45.879Z"))
                    .webUrl("https://brown-phrase.info")
                    .build())
                .connectionId("<id>")
                .build();

        CreateRepoRepositoryResponse res = sdk.repo().createRepoRepository()
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

        GetRepoBranchResponse res = sdk.repo().getRepoBranch()
                .request(req)
                .call();

        if (res.repoBranch().isPresent()) {
            System.out.println(res.repoBranch().get());
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

        GetRepoCommitResponse res = sdk.repo().getRepoCommit()
                .request(req)
                .call();

        if (res.repoCommit().isPresent()) {
            System.out.println(res.repoCommit().get());
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

<!-- UsageSnippet language="java" operationID="getRepoOrganization" method="get" path="/repo/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetRepoOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.GetRepoOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
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
            System.out.println(res.repoOrganization().get());
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

<!-- UsageSnippet language="java" operationID="getRepoPullrequest" method="get" path="/repo/{connection_id}/pullrequest/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetRepoPullrequestRequest;
import to.unified.unified_java_sdk.models.operations.GetRepoPullrequestResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
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
            System.out.println(res.repoPullrequest().get());
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

        GetRepoRepositoryResponse res = sdk.repo().getRepoRepository()
                .request(req)
                .call();

        if (res.repoRepository().isPresent()) {
            System.out.println(res.repoRepository().get());
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

        ListRepoBranchesResponse res = sdk.repo().listRepoBranches()
                .request(req)
                .call();

        if (res.repoBranches().isPresent()) {
            System.out.println(res.repoBranches().get());
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

        ListRepoCommitsResponse res = sdk.repo().listRepoCommits()
                .request(req)
                .call();

        if (res.repoCommits().isPresent()) {
            System.out.println(res.repoCommits().get());
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

<!-- UsageSnippet language="java" operationID="listRepoOrganizations" method="get" path="/repo/{connection_id}/organization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListRepoOrganizationsRequest;
import to.unified.unified_java_sdk.models.operations.ListRepoOrganizationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListRepoOrganizationsRequest req = ListRepoOrganizationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListRepoOrganizationsResponse res = sdk.repo().listRepoOrganizations()
                .request(req)
                .call();

        if (res.repoOrganizations().isPresent()) {
            System.out.println(res.repoOrganizations().get());
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

<!-- UsageSnippet language="java" operationID="listRepoPullrequests" method="get" path="/repo/{connection_id}/pullrequest" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListRepoPullrequestsRequest;
import to.unified.unified_java_sdk.models.operations.ListRepoPullrequestsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListRepoPullrequestsRequest req = ListRepoPullrequestsRequest.builder()
                .connectionId("<id>")
                .build();

        ListRepoPullrequestsResponse res = sdk.repo().listRepoPullrequests()
                .request(req)
                .call();

        if (res.repoPullrequests().isPresent()) {
            System.out.println(res.repoPullrequests().get());
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

        ListRepoRepositoriesResponse res = sdk.repo().listRepoRepositories()
                .request(req)
                .call();

        if (res.repoRepositories().isPresent()) {
            System.out.println(res.repoRepositories().get());
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

<!-- UsageSnippet language="java" operationID="patchRepoBranch" method="patch" path="/repo/{connection_id}/branch/{id}" example="repo_branch" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .name("voluptas")
                    .repoId("<id>")
                    .createdAt(OffsetDateTime.parse("2019-02-24T09:33:48.540Z"))
                    .id("07ea9390-fb26-4abd-b5cf-634dcd716ba6")
                    .updatedAt(OffsetDateTime.parse("2020-01-03T19:49:19.639Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoBranchResponse res = sdk.repo().patchRepoBranch()
                .request(req)
                .call();

        if (res.repoBranch().isPresent()) {
            System.out.println(res.repoBranch().get());
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

<!-- UsageSnippet language="java" operationID="patchRepoCommit" method="patch" path="/repo/{connection_id}/commit/{id}" example="repo_commit" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .createdAt(OffsetDateTime.parse("2020-07-12T16:20:42.520Z"))
                    .id("21dd7992-4c6d-4f3c-adf4-fba7fe46757c")
                    .linesAdded(313d)
                    .linesChanged(659d)
                    .linesDeleted(482d)
                    .message("Auctus ascisco esse attollo clarus odio tum bis rerum.")
                    .updatedAt(OffsetDateTime.parse("2023-05-17T01:33:37.708Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoCommitResponse res = sdk.repo().patchRepoCommit()
                .request(req)
                .call();

        if (res.repoCommit().isPresent()) {
            System.out.println(res.repoCommit().get());
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

<!-- UsageSnippet language="java" operationID="patchRepoOrganization" method="patch" path="/repo/{connection_id}/organization/{id}" example="repo_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchRepoOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.PatchRepoOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.RepoOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchRepoOrganizationRequest req = PatchRepoOrganizationRequest.builder()
                .repoOrganization(RepoOrganization.builder()
                    .avatarUrl("https://picsum.photos/seed/fGl6Lb/3157/3173")
                    .createdAt(OffsetDateTime.parse("2022-07-07T00:18:40.748Z"))
                    .description("Trepide defendo supra testimonium ager.")
                    .id("dc6893ce-b82b-4691-9396-48ebed52d6f0")
                    .name("Denesik - Lemke")
                    .updatedAt(OffsetDateTime.parse("2023-08-13T12:27:22.581Z"))
                    .webUrl("https://turbulent-overheard.biz")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoOrganizationResponse res = sdk.repo().patchRepoOrganization()
                .request(req)
                .call();

        if (res.repoOrganization().isPresent()) {
            System.out.println(res.repoOrganization().get());
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

<!-- UsageSnippet language="java" operationID="patchRepoPullrequest" method="patch" path="/repo/{connection_id}/pullrequest/{id}" example="repo_pullrequest" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchRepoPullrequestRequest;
import to.unified.unified_java_sdk.models.operations.PatchRepoPullrequestResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchRepoPullrequestRequest req = PatchRepoPullrequestRequest.builder()
                .repoPullrequest(RepoPullrequest.builder()
                    .closedAt(OffsetDateTime.parse("2025-04-13T02:47:06.456Z"))
                    .createdAt(OffsetDateTime.parse("2023-02-27T09:37:13.663Z"))
                    .id("bceaef18-faa8-48f0-aab4-8ef726149b87")
                    .labels(List.of(
                        "adhuc",
                        "quaerat"))
                    .notes("Coadunatio turbo curtus ceno consuasor aggero. Suggero adeo creptio tutamen vulnus aqua delicate adopto derelinquo caritas. Maiores vulgivagus succurro temporibus.")
                    .sourceBranchId("microchip-navigate")
                    .status(RepoPullrequestStatus.REJECTED)
                    .targetBranchId("feed-reboot")
                    .title("Cunae aegrus averto texo advoco bibo amet asporto.")
                    .updatedAt(OffsetDateTime.parse("2025-01-01T01:09:49.526Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoPullrequestResponse res = sdk.repo().patchRepoPullrequest()
                .request(req)
                .call();

        if (res.repoPullrequest().isPresent()) {
            System.out.println(res.repoPullrequest().get());
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

<!-- UsageSnippet language="java" operationID="patchRepoRepository" method="patch" path="/repo/{connection_id}/repository/{id}" example="repo_repository" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .name("suggero")
                    .createdAt(OffsetDateTime.parse("2023-06-12T09:42:00.080Z"))
                    .description("Tribuo torqueo aetas ustulo illum.")
                    .id("f09f87bb-e4c9-49a7-a21d-8b41181d278e")
                    .isPrivate(false)
                    .owner("Marcella Kuhic")
                    .updatedAt(OffsetDateTime.parse("2024-02-23T10:58:45.881Z"))
                    .webUrl("https://brown-phrase.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoRepositoryResponse res = sdk.repo().patchRepoRepository()
                .request(req)
                .call();

        if (res.repoRepository().isPresent()) {
            System.out.println(res.repoRepository().get());
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

<!-- UsageSnippet language="java" operationID="removeRepoOrganization" method="delete" path="/repo/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveRepoOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.RemoveRepoOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
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

<!-- UsageSnippet language="java" operationID="removeRepoPullrequest" method="delete" path="/repo/{connection_id}/pullrequest/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveRepoPullrequestRequest;
import to.unified.unified_java_sdk.models.operations.RemoveRepoPullrequestResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
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

<!-- UsageSnippet language="java" operationID="updateRepoBranch" method="put" path="/repo/{connection_id}/branch/{id}" example="repo_branch" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .name("voluptas")
                    .repoId("<id>")
                    .createdAt(OffsetDateTime.parse("2019-02-24T09:33:48.540Z"))
                    .id("07ea9390-fb26-4abd-b5cf-634dcd716ba6")
                    .updatedAt(OffsetDateTime.parse("2020-01-03T19:49:19.639Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoBranchResponse res = sdk.repo().updateRepoBranch()
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

<!-- UsageSnippet language="java" operationID="updateRepoCommit" method="put" path="/repo/{connection_id}/commit/{id}" example="repo_commit" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .createdAt(OffsetDateTime.parse("2020-07-12T16:20:42.520Z"))
                    .id("21dd7992-4c6d-4f3c-adf4-fba7fe46757c")
                    .linesAdded(313d)
                    .linesChanged(659d)
                    .linesDeleted(482d)
                    .message("Auctus ascisco esse attollo clarus odio tum bis rerum.")
                    .updatedAt(OffsetDateTime.parse("2023-05-17T01:33:37.708Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoCommitResponse res = sdk.repo().updateRepoCommit()
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

<!-- UsageSnippet language="java" operationID="updateRepoOrganization" method="put" path="/repo/{connection_id}/organization/{id}" example="repo_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateRepoOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.UpdateRepoOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.RepoOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateRepoOrganizationRequest req = UpdateRepoOrganizationRequest.builder()
                .repoOrganization(RepoOrganization.builder()
                    .avatarUrl("https://picsum.photos/seed/fGl6Lb/3157/3173")
                    .createdAt(OffsetDateTime.parse("2022-07-07T00:18:40.748Z"))
                    .description("Trepide defendo supra testimonium ager.")
                    .id("dc6893ce-b82b-4691-9396-48ebed52d6f0")
                    .name("Denesik - Lemke")
                    .updatedAt(OffsetDateTime.parse("2023-08-13T12:27:22.581Z"))
                    .webUrl("https://turbulent-overheard.biz")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoOrganizationResponse res = sdk.repo().updateRepoOrganization()
                .request(req)
                .call();

        if (res.repoOrganization().isPresent()) {
            System.out.println(res.repoOrganization().get());
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

<!-- UsageSnippet language="java" operationID="updateRepoPullrequest" method="put" path="/repo/{connection_id}/pullrequest/{id}" example="repo_pullrequest" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateRepoPullrequestRequest;
import to.unified.unified_java_sdk.models.operations.UpdateRepoPullrequestResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateRepoPullrequestRequest req = UpdateRepoPullrequestRequest.builder()
                .repoPullrequest(RepoPullrequest.builder()
                    .closedAt(OffsetDateTime.parse("2025-04-13T02:47:06.456Z"))
                    .createdAt(OffsetDateTime.parse("2023-02-27T09:37:13.663Z"))
                    .id("bceaef18-faa8-48f0-aab4-8ef726149b87")
                    .labels(List.of(
                        "adhuc",
                        "quaerat"))
                    .notes("Coadunatio turbo curtus ceno consuasor aggero. Suggero adeo creptio tutamen vulnus aqua delicate adopto derelinquo caritas. Maiores vulgivagus succurro temporibus.")
                    .sourceBranchId("microchip-navigate")
                    .status(RepoPullrequestStatus.REJECTED)
                    .targetBranchId("feed-reboot")
                    .title("Cunae aegrus averto texo advoco bibo amet asporto.")
                    .updatedAt(OffsetDateTime.parse("2025-01-01T01:09:49.526Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoPullrequestResponse res = sdk.repo().updateRepoPullrequest()
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

<!-- UsageSnippet language="java" operationID="updateRepoRepository" method="put" path="/repo/{connection_id}/repository/{id}" example="repo_repository" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .name("suggero")
                    .createdAt(OffsetDateTime.parse("2023-06-12T09:42:00.080Z"))
                    .description("Tribuo torqueo aetas ustulo illum.")
                    .id("f09f87bb-e4c9-49a7-a21d-8b41181d278e")
                    .isPrivate(false)
                    .owner("Marcella Kuhic")
                    .updatedAt(OffsetDateTime.parse("2024-02-23T10:58:45.881Z"))
                    .webUrl("https://brown-phrase.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoRepositoryResponse res = sdk.repo().updateRepoRepository()
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
| `request`                                                                             | [UpdateRepoRepositoryRequest](../../models/operations/UpdateRepoRepositoryRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateRepoRepositoryResponse](../../models/operations/UpdateRepoRepositoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |