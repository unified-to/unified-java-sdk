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

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingOrganizationRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingOrganizationResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetAccountingOrganizationRequest req = GetAccountingOrganizationRequest.builder()
                .connectionId("<value>")
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

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingOrganizationsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingOrganizationsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListAccountingOrganizationsRequest req = ListAccountingOrganizationsRequest.builder()
                .connectionId("<value>")
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