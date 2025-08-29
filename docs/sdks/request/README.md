# Request
(*request()*)

## Overview

### Available Operations

* [createVerificationRequest](#createverificationrequest) - Create a request
* [getVerificationRequest](#getverificationrequest) - Retrieve a request
* [listVerificationRequests](#listverificationrequests) - List all requests
* [patchVerificationRequest](#patchverificationrequest) - Update a request
* [removeVerificationRequest](#removeverificationrequest) - Remove a request
* [updateVerificationRequest](#updateverificationrequest) - Update a request

## createVerificationRequest

Create a request

### Example Usage

<!-- UsageSnippet language="java" operationID="createVerificationRequest" method="post" path="/verification/{connection_id}/request" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateVerificationRequestRequest;
import to.unified.unified_java_sdk.models.operations.CreateVerificationRequestResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.VerificationRequest;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateVerificationRequestRequest req = CreateVerificationRequestRequest.builder()
                .verificationRequest(VerificationRequest.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateVerificationRequestResponse res = sdk.request().createVerificationRequest()
                .request(req)
                .call();

        if (res.verificationRequest().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [CreateVerificationRequestRequest](../../models/operations/CreateVerificationRequestRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[CreateVerificationRequestResponse](../../models/operations/CreateVerificationRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getVerificationRequest

Retrieve a request

### Example Usage

<!-- UsageSnippet language="java" operationID="getVerificationRequest" method="get" path="/verification/{connection_id}/request/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetVerificationRequestRequest;
import to.unified.unified_java_sdk.models.operations.GetVerificationRequestResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetVerificationRequestRequest req = GetVerificationRequestRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetVerificationRequestResponse res = sdk.request().getVerificationRequest()
                .request(req)
                .call();

        if (res.verificationRequest().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetVerificationRequestRequest](../../models/operations/GetVerificationRequestRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetVerificationRequestResponse](../../models/operations/GetVerificationRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listVerificationRequests

List all requests

### Example Usage

<!-- UsageSnippet language="java" operationID="listVerificationRequests" method="get" path="/verification/{connection_id}/request" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListVerificationRequestsRequest;
import to.unified.unified_java_sdk.models.operations.ListVerificationRequestsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListVerificationRequestsRequest req = ListVerificationRequestsRequest.builder()
                .connectionId("<id>")
                .build();

        ListVerificationRequestsResponse res = sdk.request().listVerificationRequests()
                .request(req)
                .call();

        if (res.verificationRequests().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListVerificationRequestsRequest](../../models/operations/ListVerificationRequestsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListVerificationRequestsResponse](../../models/operations/ListVerificationRequestsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchVerificationRequest

Update a request

### Example Usage

<!-- UsageSnippet language="java" operationID="patchVerificationRequest" method="patch" path="/verification/{connection_id}/request/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchVerificationRequestRequest;
import to.unified.unified_java_sdk.models.operations.PatchVerificationRequestResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.VerificationRequest;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchVerificationRequestRequest req = PatchVerificationRequestRequest.builder()
                .verificationRequest(VerificationRequest.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchVerificationRequestResponse res = sdk.request().patchVerificationRequest()
                .request(req)
                .call();

        if (res.verificationRequest().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [PatchVerificationRequestRequest](../../models/operations/PatchVerificationRequestRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[PatchVerificationRequestResponse](../../models/operations/PatchVerificationRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeVerificationRequest

Remove a request

### Example Usage

<!-- UsageSnippet language="java" operationID="removeVerificationRequest" method="delete" path="/verification/{connection_id}/request/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveVerificationRequestRequest;
import to.unified.unified_java_sdk.models.operations.RemoveVerificationRequestResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveVerificationRequestRequest req = RemoveVerificationRequestRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveVerificationRequestResponse res = sdk.request().removeVerificationRequest()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [RemoveVerificationRequestRequest](../../models/operations/RemoveVerificationRequestRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[RemoveVerificationRequestResponse](../../models/operations/RemoveVerificationRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateVerificationRequest

Update a request

### Example Usage

<!-- UsageSnippet language="java" operationID="updateVerificationRequest" method="put" path="/verification/{connection_id}/request/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateVerificationRequestRequest;
import to.unified.unified_java_sdk.models.operations.UpdateVerificationRequestResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.VerificationRequest;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateVerificationRequestRequest req = UpdateVerificationRequestRequest.builder()
                .verificationRequest(VerificationRequest.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateVerificationRequestResponse res = sdk.request().updateVerificationRequest()
                .request(req)
                .call();

        if (res.verificationRequest().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [UpdateVerificationRequestRequest](../../models/operations/UpdateVerificationRequestRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[UpdateVerificationRequestResponse](../../models/operations/UpdateVerificationRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |