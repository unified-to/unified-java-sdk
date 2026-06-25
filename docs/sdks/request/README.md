# Request

## Overview

### Available Operations

* [createVerificationRequest2](#createverificationrequest2) - Create a request
* [getVerificationRequest2](#getverificationrequest2) - Retrieve a request
* [listVerificationRequests2](#listverificationrequests2) - List all requests
* [patchVerificationRequest2](#patchverificationrequest2) - Update a request
* [removeVerificationRequest2](#removeverificationrequest2) - Remove a request
* [updateVerificationRequest2](#updateverificationrequest2) - Update a request

## createVerificationRequest2

Create a request

### Example Usage

<!-- UsageSnippet language="java" operationID="createVerificationRequest2" method="post" path="/verification/{connection_id}/request" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateVerificationRequest2Request;
import to.unified.unified_java_sdk.models.operations.CreateVerificationRequest2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.VerificationRequest;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateVerificationRequest2Request req = CreateVerificationRequest2Request.builder()
                .verificationRequest(VerificationRequest.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateVerificationRequest2Response res = sdk.request().createVerificationRequest2()
                .request(req)
                .call();

        if (res.verificationRequest().isPresent()) {
            System.out.println(res.verificationRequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [CreateVerificationRequest2Request](../../models/operations/CreateVerificationRequest2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[CreateVerificationRequest2Response](../../models/operations/CreateVerificationRequest2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getVerificationRequest2

Retrieve a request

### Example Usage

<!-- UsageSnippet language="java" operationID="getVerificationRequest2" method="get" path="/verification/{connection_id}/request/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetVerificationRequest2Request;
import to.unified.unified_java_sdk.models.operations.GetVerificationRequest2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetVerificationRequest2Request req = GetVerificationRequest2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetVerificationRequest2Response res = sdk.request().getVerificationRequest2()
                .request(req)
                .call();

        if (res.verificationRequest().isPresent()) {
            System.out.println(res.verificationRequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetVerificationRequest2Request](../../models/operations/GetVerificationRequest2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetVerificationRequest2Response](../../models/operations/GetVerificationRequest2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listVerificationRequests2

List all requests

### Example Usage

<!-- UsageSnippet language="java" operationID="listVerificationRequests2" method="get" path="/verification/{connection_id}/request" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListVerificationRequests2Request;
import to.unified.unified_java_sdk.models.operations.ListVerificationRequests2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListVerificationRequests2Request req = ListVerificationRequests2Request.builder()
                .connectionId("<id>")
                .build();

        ListVerificationRequests2Response res = sdk.request().listVerificationRequests2()
                .request(req)
                .call();

        if (res.verificationRequests().isPresent()) {
            System.out.println(res.verificationRequests().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListVerificationRequests2Request](../../models/operations/ListVerificationRequests2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListVerificationRequests2Response](../../models/operations/ListVerificationRequests2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchVerificationRequest2

Update a request

### Example Usage

<!-- UsageSnippet language="java" operationID="patchVerificationRequest2" method="patch" path="/verification/{connection_id}/request/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchVerificationRequest2Request;
import to.unified.unified_java_sdk.models.operations.PatchVerificationRequest2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.VerificationRequest;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchVerificationRequest2Request req = PatchVerificationRequest2Request.builder()
                .verificationRequest(VerificationRequest.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchVerificationRequest2Response res = sdk.request().patchVerificationRequest2()
                .request(req)
                .call();

        if (res.verificationRequest().isPresent()) {
            System.out.println(res.verificationRequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [PatchVerificationRequest2Request](../../models/operations/PatchVerificationRequest2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[PatchVerificationRequest2Response](../../models/operations/PatchVerificationRequest2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeVerificationRequest2

Remove a request

### Example Usage

<!-- UsageSnippet language="java" operationID="removeVerificationRequest2" method="delete" path="/verification/{connection_id}/request/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveVerificationRequest2Request;
import to.unified.unified_java_sdk.models.operations.RemoveVerificationRequest2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveVerificationRequest2Request req = RemoveVerificationRequest2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveVerificationRequest2Response res = sdk.request().removeVerificationRequest2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [RemoveVerificationRequest2Request](../../models/operations/RemoveVerificationRequest2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[RemoveVerificationRequest2Response](../../models/operations/RemoveVerificationRequest2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateVerificationRequest2

Update a request

### Example Usage

<!-- UsageSnippet language="java" operationID="updateVerificationRequest2" method="put" path="/verification/{connection_id}/request/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateVerificationRequest2Request;
import to.unified.unified_java_sdk.models.operations.UpdateVerificationRequest2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.VerificationRequest;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateVerificationRequest2Request req = UpdateVerificationRequest2Request.builder()
                .verificationRequest(VerificationRequest.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateVerificationRequest2Response res = sdk.request().updateVerificationRequest2()
                .request(req)
                .call();

        if (res.verificationRequest().isPresent()) {
            System.out.println(res.verificationRequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [UpdateVerificationRequest2Request](../../models/operations/UpdateVerificationRequest2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[UpdateVerificationRequest2Response](../../models/operations/UpdateVerificationRequest2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |