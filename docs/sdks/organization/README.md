# Organization
(*organization()*)

## Overview

### Available Operations

* [createRepoOrganization](#createrepoorganization) - Create an organization
* [getAccountingOrganization](#getaccountingorganization) - Retrieve an organization
* [getRepoOrganization](#getrepoorganization) - Retrieve an organization
* [listAccountingOrganizations](#listaccountingorganizations) - List all organizations
* [listRepoOrganizations](#listrepoorganizations) - List all organizations
* [patchRepoOrganization](#patchrepoorganization) - Update an organization
* [removeRepoOrganization](#removerepoorganization) - Remove an organization
* [updateRepoOrganization](#updaterepoorganization) - Update an organization

## createRepoOrganization

Create an organization

### Example Usage

```java
package hello.world;

import java.lang.Exception;
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
                    .build())
                .connectionId("<id>")
                .build();

        CreateRepoOrganizationResponse res = sdk.organization().createRepoOrganization()
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

## getAccountingOrganization

Retrieve an organization

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingOrganizationRequest req = GetAccountingOrganizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingOrganizationResponse res = sdk.organization().getAccountingOrganization()
                .request(req)
                .call();

        if (res.accountingOrganization().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetAccountingOrganizationRequest](../../models/operations/GetAccountingOrganizationRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetAccountingOrganizationResponse](../../models/operations/GetAccountingOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRepoOrganization

Retrieve an organization

### Example Usage

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

        GetRepoOrganizationResponse res = sdk.organization().getRepoOrganization()
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

## listAccountingOrganizations

List all organizations

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingOrganizationsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingOrganizationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingOrganizationsRequest req = ListAccountingOrganizationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingOrganizationsResponse res = sdk.organization().listAccountingOrganizations()
                .request(req)
                .call();

        if (res.accountingOrganizations().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListAccountingOrganizationsRequest](../../models/operations/ListAccountingOrganizationsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListAccountingOrganizationsResponse](../../models/operations/ListAccountingOrganizationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listRepoOrganizations

List all organizations

### Example Usage

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

        ListRepoOrganizationsResponse res = sdk.organization().listRepoOrganizations()
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

## patchRepoOrganization

Update an organization

### Example Usage

```java
package hello.world;

import java.lang.Exception;
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
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoOrganizationResponse res = sdk.organization().patchRepoOrganization()
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

## removeRepoOrganization

Remove an organization

### Example Usage

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

        RemoveRepoOrganizationResponse res = sdk.organization().removeRepoOrganization()
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

## updateRepoOrganization

Update an organization

### Example Usage

```java
package hello.world;

import java.lang.Exception;
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
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoOrganizationResponse res = sdk.organization().updateRepoOrganization()
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