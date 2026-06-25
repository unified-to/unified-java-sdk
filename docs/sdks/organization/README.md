# Organization

## Overview

### Available Operations

* [createAdsOrganization2](#createadsorganization2) - Create an organization
* [createRepoOrganization2](#createrepoorganization2) - Create an organization
* [getAccountingOrganization2](#getaccountingorganization2) - Retrieve an organization
* [getAdsOrganization2](#getadsorganization2) - Retrieve an organization
* [getRepoOrganization2](#getrepoorganization2) - Retrieve an organization
* [listAccountingOrganizations2](#listaccountingorganizations2) - List all organizations
* [listAdsOrganizations2](#listadsorganizations2) - List all organizations
* [listRepoOrganizations2](#listrepoorganizations2) - List all organizations
* [patchAdsOrganization2](#patchadsorganization2) - Update an organization
* [patchRepoOrganization2](#patchrepoorganization2) - Update an organization
* [removeAdsOrganization2](#removeadsorganization2) - Remove an organization
* [removeRepoOrganization2](#removerepoorganization2) - Remove an organization
* [updateAdsOrganization2](#updateadsorganization2) - Update an organization
* [updateRepoOrganization2](#updaterepoorganization2) - Update an organization

## createAdsOrganization2

Create an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsOrganization2" method="post" path="/ads/{connection_id}/organization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsOrganization2Request;
import to.unified.unified_java_sdk.models.operations.CreateAdsOrganization2Response;
import to.unified.unified_java_sdk.models.shared.AdsOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsOrganization2Request req = CreateAdsOrganization2Request.builder()
                .adsOrganization(AdsOrganization.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsOrganization2Response res = sdk.organization().createAdsOrganization2()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            System.out.println(res.adsOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateAdsOrganization2Request](../../models/operations/CreateAdsOrganization2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateAdsOrganization2Response](../../models/operations/CreateAdsOrganization2Response.md)**

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

        CreateRepoOrganization2Response res = sdk.organization().createRepoOrganization2()
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

## getAccountingOrganization2

Retrieve an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingOrganization2" method="get" path="/accounting/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingOrganization2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingOrganization2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingOrganization2Request req = GetAccountingOrganization2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingOrganization2Response res = sdk.organization().getAccountingOrganization2()
                .request(req)
                .call();

        if (res.accountingOrganization().isPresent()) {
            System.out.println(res.accountingOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetAccountingOrganization2Request](../../models/operations/GetAccountingOrganization2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetAccountingOrganization2Response](../../models/operations/GetAccountingOrganization2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsOrganization2

Retrieve an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsOrganization2" method="get" path="/ads/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsOrganization2Request;
import to.unified.unified_java_sdk.models.operations.GetAdsOrganization2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsOrganization2Request req = GetAdsOrganization2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsOrganization2Response res = sdk.organization().getAdsOrganization2()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            System.out.println(res.adsOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetAdsOrganization2Request](../../models/operations/GetAdsOrganization2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetAdsOrganization2Response](../../models/operations/GetAdsOrganization2Response.md)**

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

        GetRepoOrganization2Response res = sdk.organization().getRepoOrganization2()
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

## listAccountingOrganizations2

List all organizations

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingOrganizations2" method="get" path="/accounting/{connection_id}/organization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingOrganizations2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingOrganizations2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingOrganizations2Request req = ListAccountingOrganizations2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingOrganizations2Response res = sdk.organization().listAccountingOrganizations2()
                .request(req)
                .call();

        if (res.accountingOrganizations().isPresent()) {
            System.out.println(res.accountingOrganizations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [ListAccountingOrganizations2Request](../../models/operations/ListAccountingOrganizations2Request.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[ListAccountingOrganizations2Response](../../models/operations/ListAccountingOrganizations2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsOrganizations2

List all organizations

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsOrganizations2" method="get" path="/ads/{connection_id}/organization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsOrganizations2Request;
import to.unified.unified_java_sdk.models.operations.ListAdsOrganizations2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsOrganizations2Request req = ListAdsOrganizations2Request.builder()
                .connectionId("<id>")
                .build();

        ListAdsOrganizations2Response res = sdk.organization().listAdsOrganizations2()
                .request(req)
                .call();

        if (res.adsOrganizations().isPresent()) {
            System.out.println(res.adsOrganizations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListAdsOrganizations2Request](../../models/operations/ListAdsOrganizations2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListAdsOrganizations2Response](../../models/operations/ListAdsOrganizations2Response.md)**

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

        ListRepoOrganizations2Response res = sdk.organization().listRepoOrganizations2()
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

## patchAdsOrganization2

Update an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsOrganization2" method="patch" path="/ads/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsOrganization2Request;
import to.unified.unified_java_sdk.models.operations.PatchAdsOrganization2Response;
import to.unified.unified_java_sdk.models.shared.AdsOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsOrganization2Request req = PatchAdsOrganization2Request.builder()
                .adsOrganization(AdsOrganization.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsOrganization2Response res = sdk.organization().patchAdsOrganization2()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            System.out.println(res.adsOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchAdsOrganization2Request](../../models/operations/PatchAdsOrganization2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchAdsOrganization2Response](../../models/operations/PatchAdsOrganization2Response.md)**

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

        PatchRepoOrganization2Response res = sdk.organization().patchRepoOrganization2()
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

## removeAdsOrganization2

Remove an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsOrganization2" method="delete" path="/ads/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsOrganization2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAdsOrganization2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsOrganization2Request req = RemoveAdsOrganization2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsOrganization2Response res = sdk.organization().removeAdsOrganization2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveAdsOrganization2Request](../../models/operations/RemoveAdsOrganization2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveAdsOrganization2Response](../../models/operations/RemoveAdsOrganization2Response.md)**

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

        RemoveRepoOrganization2Response res = sdk.organization().removeRepoOrganization2()
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

## updateAdsOrganization2

Update an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsOrganization2" method="put" path="/ads/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsOrganization2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAdsOrganization2Response;
import to.unified.unified_java_sdk.models.shared.AdsOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsOrganization2Request req = UpdateAdsOrganization2Request.builder()
                .adsOrganization(AdsOrganization.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsOrganization2Response res = sdk.organization().updateAdsOrganization2()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            System.out.println(res.adsOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateAdsOrganization2Request](../../models/operations/UpdateAdsOrganization2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateAdsOrganization2Response](../../models/operations/UpdateAdsOrganization2Response.md)**

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

        UpdateRepoOrganization2Response res = sdk.organization().updateRepoOrganization2()
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