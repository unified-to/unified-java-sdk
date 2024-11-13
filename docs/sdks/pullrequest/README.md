# Pullrequest
(*pullrequest()*)

## Overview

### Available Operations

* [createRepoPullrequest](#createrepopullrequest) - Create a pullrequest
* [getRepoPullrequest](#getrepopullrequest) - Retrieve a pullrequest
* [listRepoPullrequests](#listrepopullrequests) - List all pullrequests
* [patchRepoPullrequest](#patchrepopullrequest) - Update a pullrequest
* [removeRepoPullrequest](#removerepopullrequest) - Remove a pullrequest
* [updateRepoPullrequest](#updaterepopullrequest) - Update a pullrequest

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

        CreateRepoPullrequestResponse res = sdk.pullrequest().createRepoPullrequest()
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

        GetRepoPullrequestResponse res = sdk.pullrequest().getRepoPullrequest()
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

        ListRepoPullrequestsResponse res = sdk.pullrequest().listRepoPullrequests()
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

        PatchRepoPullrequestResponse res = sdk.pullrequest().patchRepoPullrequest()
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

        RemoveRepoPullrequestResponse res = sdk.pullrequest().removeRepoPullrequest()
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

        UpdateRepoPullrequestResponse res = sdk.pullrequest().updateRepoPullrequest()
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