# Repo

## Overview

### Available Operations

* [createRepoBranch2](#createrepobranch2) - Create a branch
* [createRepoCommit2](#createrepocommit2) - Create a commit
* [createRepoOrganization2](#createrepoorganization2) - Create an organization
* [createRepoPullrequest2](#createrepopullrequest2) - Create a pullrequest
* [createRepoRepository2](#createreporepository2) - Create a repository
* [getRepoBranch2](#getrepobranch2) - Retrieve a branch
* [getRepoCommit2](#getrepocommit2) - Retrieve a commit
* [getRepoOrganization2](#getrepoorganization2) - Retrieve an organization
* [getRepoPullrequest2](#getrepopullrequest2) - Retrieve a pullrequest
* [getRepoRepository2](#getreporepository2) - Retrieve a repository
* [listRepoBranches2](#listrepobranches2) - List all branches
* [listRepoCommits2](#listrepocommits2) - List all commits
* [listRepoOrganizations2](#listrepoorganizations2) - List all organizations
* [listRepoPullrequests2](#listrepopullrequests2) - List all pullrequests
* [listRepoRepositories2](#listreporepositories2) - List all repositories
* [patchRepoBranch2](#patchrepobranch2) - Update a branch
* [patchRepoCommit2](#patchrepocommit2) - Update a commit
* [patchRepoOrganization2](#patchrepoorganization2) - Update an organization
* [patchRepoPullrequest2](#patchrepopullrequest2) - Update a pullrequest
* [patchRepoRepository2](#patchreporepository2) - Update a repository
* [removeRepoBranch2](#removerepobranch2) - Remove a branch
* [removeRepoCommit2](#removerepocommit2) - Remove a commit
* [removeRepoOrganization2](#removerepoorganization2) - Remove an organization
* [removeRepoPullrequest2](#removerepopullrequest2) - Remove a pullrequest
* [removeRepoRepository2](#removereporepository2) - Remove a repository
* [updateRepoBranch2](#updaterepobranch2) - Update a branch
* [updateRepoCommit2](#updaterepocommit2) - Update a commit
* [updateRepoOrganization2](#updaterepoorganization2) - Update an organization
* [updateRepoPullrequest2](#updaterepopullrequest2) - Update a pullrequest
* [updateRepoRepository2](#updatereporepository2) - Update a repository

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

        CreateRepoBranch2Response res = sdk.repo().createRepoBranch2()
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

        CreateRepoCommit2Response res = sdk.repo().createRepoCommit2()
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

## createRepoOrganization2

Create an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="createRepoOrganization2" method="post" path="/repo/{connection_id}/organization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateRepoOrganization2Request;
import to.unified.unified_java_sdk.models.operations.CreateRepoOrganization2Response;
import to.unified.unified_java_sdk.models.shared.RepoOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateRepoOrganization2Request req = CreateRepoOrganization2Request.builder()
                .repoOrganization(RepoOrganization.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateRepoOrganization2Response res = sdk.repo().createRepoOrganization2()
                .request(req)
                .call();

        if (res.repoOrganization().isPresent()) {
            System.out.println(res.repoOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateRepoOrganization2Request](../../models/operations/CreateRepoOrganization2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateRepoOrganization2Response](../../models/operations/CreateRepoOrganization2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createRepoPullrequest2

Create a pullrequest

### Example Usage

<!-- UsageSnippet language="java" operationID="createRepoPullrequest2" method="post" path="/repo/{connection_id}/pullrequest" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateRepoPullrequest2Request;
import to.unified.unified_java_sdk.models.operations.CreateRepoPullrequest2Response;
import to.unified.unified_java_sdk.models.shared.RepoPullrequest;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateRepoPullrequest2Request req = CreateRepoPullrequest2Request.builder()
                .repoPullrequest(RepoPullrequest.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateRepoPullrequest2Response res = sdk.repo().createRepoPullrequest2()
                .request(req)
                .call();

        if (res.repoPullrequest().isPresent()) {
            System.out.println(res.repoPullrequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateRepoPullrequest2Request](../../models/operations/CreateRepoPullrequest2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateRepoPullrequest2Response](../../models/operations/CreateRepoPullrequest2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateRepoRepository2Response res = sdk.repo().createRepoRepository2()
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

        GetRepoBranch2Response res = sdk.repo().getRepoBranch2()
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

        GetRepoCommit2Response res = sdk.repo().getRepoCommit2()
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

## getRepoOrganization2

Retrieve an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="getRepoOrganization2" method="get" path="/repo/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetRepoOrganization2Request;
import to.unified.unified_java_sdk.models.operations.GetRepoOrganization2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetRepoOrganization2Request req = GetRepoOrganization2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetRepoOrganization2Response res = sdk.repo().getRepoOrganization2()
                .request(req)
                .call();

        if (res.repoOrganization().isPresent()) {
            System.out.println(res.repoOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetRepoOrganization2Request](../../models/operations/GetRepoOrganization2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetRepoOrganization2Response](../../models/operations/GetRepoOrganization2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRepoPullrequest2

Retrieve a pullrequest

### Example Usage

<!-- UsageSnippet language="java" operationID="getRepoPullrequest2" method="get" path="/repo/{connection_id}/pullrequest/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetRepoPullrequest2Request;
import to.unified.unified_java_sdk.models.operations.GetRepoPullrequest2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetRepoPullrequest2Request req = GetRepoPullrequest2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetRepoPullrequest2Response res = sdk.repo().getRepoPullrequest2()
                .request(req)
                .call();

        if (res.repoPullrequest().isPresent()) {
            System.out.println(res.repoPullrequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetRepoPullrequest2Request](../../models/operations/GetRepoPullrequest2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetRepoPullrequest2Response](../../models/operations/GetRepoPullrequest2Response.md)**

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

        GetRepoRepository2Response res = sdk.repo().getRepoRepository2()
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

        ListRepoBranches2Response res = sdk.repo().listRepoBranches2()
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

        ListRepoCommits2Response res = sdk.repo().listRepoCommits2()
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

## listRepoOrganizations2

List all organizations

### Example Usage

<!-- UsageSnippet language="java" operationID="listRepoOrganizations2" method="get" path="/repo/{connection_id}/organization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListRepoOrganizations2Request;
import to.unified.unified_java_sdk.models.operations.ListRepoOrganizations2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListRepoOrganizations2Request req = ListRepoOrganizations2Request.builder()
                .connectionId("<id>")
                .build();

        ListRepoOrganizations2Response res = sdk.repo().listRepoOrganizations2()
                .request(req)
                .call();

        if (res.repoOrganizations().isPresent()) {
            System.out.println(res.repoOrganizations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListRepoOrganizations2Request](../../models/operations/ListRepoOrganizations2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListRepoOrganizations2Response](../../models/operations/ListRepoOrganizations2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listRepoPullrequests2

List all pullrequests

### Example Usage

<!-- UsageSnippet language="java" operationID="listRepoPullrequests2" method="get" path="/repo/{connection_id}/pullrequest" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListRepoPullrequests2Request;
import to.unified.unified_java_sdk.models.operations.ListRepoPullrequests2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListRepoPullrequests2Request req = ListRepoPullrequests2Request.builder()
                .connectionId("<id>")
                .build();

        ListRepoPullrequests2Response res = sdk.repo().listRepoPullrequests2()
                .request(req)
                .call();

        if (res.repoPullrequests().isPresent()) {
            System.out.println(res.repoPullrequests().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListRepoPullrequests2Request](../../models/operations/ListRepoPullrequests2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListRepoPullrequests2Response](../../models/operations/ListRepoPullrequests2Response.md)**

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

        ListRepoRepositories2Response res = sdk.repo().listRepoRepositories2()
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

        PatchRepoBranch2Response res = sdk.repo().patchRepoBranch2()
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

        PatchRepoCommit2Response res = sdk.repo().patchRepoCommit2()
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

## patchRepoOrganization2

Update an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="patchRepoOrganization2" method="patch" path="/repo/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchRepoOrganization2Request;
import to.unified.unified_java_sdk.models.operations.PatchRepoOrganization2Response;
import to.unified.unified_java_sdk.models.shared.RepoOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchRepoOrganization2Request req = PatchRepoOrganization2Request.builder()
                .repoOrganization(RepoOrganization.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoOrganization2Response res = sdk.repo().patchRepoOrganization2()
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
| `request`                                                                                 | [PatchRepoOrganization2Request](../../models/operations/PatchRepoOrganization2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchRepoOrganization2Response](../../models/operations/PatchRepoOrganization2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchRepoPullrequest2

Update a pullrequest

### Example Usage

<!-- UsageSnippet language="java" operationID="patchRepoPullrequest2" method="patch" path="/repo/{connection_id}/pullrequest/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchRepoPullrequest2Request;
import to.unified.unified_java_sdk.models.operations.PatchRepoPullrequest2Response;
import to.unified.unified_java_sdk.models.shared.RepoPullrequest;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchRepoPullrequest2Request req = PatchRepoPullrequest2Request.builder()
                .repoPullrequest(RepoPullrequest.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoPullrequest2Response res = sdk.repo().patchRepoPullrequest2()
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
| `request`                                                                               | [PatchRepoPullrequest2Request](../../models/operations/PatchRepoPullrequest2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchRepoPullrequest2Response](../../models/operations/PatchRepoPullrequest2Response.md)**

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

        PatchRepoRepository2Response res = sdk.repo().patchRepoRepository2()
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

        RemoveRepoBranch2Response res = sdk.repo().removeRepoBranch2()
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

        RemoveRepoCommit2Response res = sdk.repo().removeRepoCommit2()
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

## removeRepoOrganization2

Remove an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="removeRepoOrganization2" method="delete" path="/repo/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveRepoOrganization2Request;
import to.unified.unified_java_sdk.models.operations.RemoveRepoOrganization2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveRepoOrganization2Request req = RemoveRepoOrganization2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveRepoOrganization2Response res = sdk.repo().removeRepoOrganization2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveRepoOrganization2Request](../../models/operations/RemoveRepoOrganization2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveRepoOrganization2Response](../../models/operations/RemoveRepoOrganization2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeRepoPullrequest2

Remove a pullrequest

### Example Usage

<!-- UsageSnippet language="java" operationID="removeRepoPullrequest2" method="delete" path="/repo/{connection_id}/pullrequest/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveRepoPullrequest2Request;
import to.unified.unified_java_sdk.models.operations.RemoveRepoPullrequest2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveRepoPullrequest2Request req = RemoveRepoPullrequest2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveRepoPullrequest2Response res = sdk.repo().removeRepoPullrequest2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveRepoPullrequest2Request](../../models/operations/RemoveRepoPullrequest2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveRepoPullrequest2Response](../../models/operations/RemoveRepoPullrequest2Response.md)**

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

        RemoveRepoRepository2Response res = sdk.repo().removeRepoRepository2()
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

        UpdateRepoBranch2Response res = sdk.repo().updateRepoBranch2()
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

        UpdateRepoCommit2Response res = sdk.repo().updateRepoCommit2()
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

## updateRepoOrganization2

Update an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRepoOrganization2" method="put" path="/repo/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateRepoOrganization2Request;
import to.unified.unified_java_sdk.models.operations.UpdateRepoOrganization2Response;
import to.unified.unified_java_sdk.models.shared.RepoOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateRepoOrganization2Request req = UpdateRepoOrganization2Request.builder()
                .repoOrganization(RepoOrganization.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoOrganization2Response res = sdk.repo().updateRepoOrganization2()
                .request(req)
                .call();

        if (res.repoOrganization().isPresent()) {
            System.out.println(res.repoOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateRepoOrganization2Request](../../models/operations/UpdateRepoOrganization2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateRepoOrganization2Response](../../models/operations/UpdateRepoOrganization2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateRepoPullrequest2

Update a pullrequest

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRepoPullrequest2" method="put" path="/repo/{connection_id}/pullrequest/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateRepoPullrequest2Request;
import to.unified.unified_java_sdk.models.operations.UpdateRepoPullrequest2Response;
import to.unified.unified_java_sdk.models.shared.RepoPullrequest;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateRepoPullrequest2Request req = UpdateRepoPullrequest2Request.builder()
                .repoPullrequest(RepoPullrequest.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoPullrequest2Response res = sdk.repo().updateRepoPullrequest2()
                .request(req)
                .call();

        if (res.repoPullrequest().isPresent()) {
            System.out.println(res.repoPullrequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateRepoPullrequest2Request](../../models/operations/UpdateRepoPullrequest2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateRepoPullrequest2Response](../../models/operations/UpdateRepoPullrequest2Response.md)**

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

        UpdateRepoRepository2Response res = sdk.repo().updateRepoRepository2()
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