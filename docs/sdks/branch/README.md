# Branch
(*branch()*)

## Overview

### Available Operations

* [createRepoBranch](#createrepobranch) - Create a branch
* [getRepoBranch](#getrepobranch) - Retrieve a branch
* [listRepoBranches](#listrepobranches) - List all branches
* [patchRepoBranch](#patchrepobranch) - Update a branch
* [removeRepoBranch](#removerepobranch) - Remove a branch
* [updateRepoBranch](#updaterepobranch) - Update a branch

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

        CreateRepoBranchResponse res = sdk.branch().createRepoBranch()
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

        GetRepoBranchResponse res = sdk.branch().getRepoBranch()
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

        ListRepoBranchesResponse res = sdk.branch().listRepoBranches()
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

        PatchRepoBranchResponse res = sdk.branch().patchRepoBranch()
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

        RemoveRepoBranchResponse res = sdk.branch().removeRepoBranch()
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

        UpdateRepoBranchResponse res = sdk.branch().updateRepoBranch()
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