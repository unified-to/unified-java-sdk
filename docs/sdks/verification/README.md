# Verification

## Overview

### Available Operations

* [createVerificationRequest](#createverificationrequest) - Create a request
* [getVerificationPackage](#getverificationpackage) - Retrieve a package
* [getVerificationRequest](#getverificationrequest) - Retrieve a request
* [listVerificationPackages](#listverificationpackages) - List all packages
* [listVerificationRequests](#listverificationrequests) - List all requests
* [patchVerificationRequest](#patchverificationrequest) - Update a request
* [removeVerificationRequest](#removeverificationrequest) - Remove a request
* [updateVerificationRequest](#updateverificationrequest) - Update a request

## createVerificationRequest

Creates a VerificationRequest. Provide the unified VerificationRequest fields in the request body; they are mapped to the provider's API. Returns the created VerificationRequest.

### Example Usage

<!-- UsageSnippet language="java" operationID="createVerificationRequest" method="post" path="/verification/{connection_id}/request" example="verification_request" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateVerificationRequestRequest;
import to.unified.unified_java_sdk.models.operations.CreateVerificationRequestResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateVerificationRequestRequest req = CreateVerificationRequestRequest.builder()
                .verificationRequest(VerificationRequest.builder()
                    .createdAt(OffsetDateTime.parse("2023-11-20T08:17:29.950Z"))
                    .id("f8e8020a-1e91-4733-84cd-a43bd59f28bd")
                    .metadata(List.of())
                    .parameters(List.of())
                    .profileAddresses(List.of())
                    .profileEmails(List.of())
                    .profileTelephones(List.of())
                    .responseDetails(List.of())
                    .responseDownloadUrls(List.of())
                    .responseSource("Implemented regional protocol")
                    .responseStatus(VerificationRequestResponseStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2023-12-27T11:56:44.803Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateVerificationRequestResponse res = sdk.verification().createVerificationRequest()
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
| `request`                                                                                       | [CreateVerificationRequestRequest](../../models/operations/CreateVerificationRequestRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[CreateVerificationRequestResponse](../../models/operations/CreateVerificationRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getVerificationPackage

Retrieves a single VerificationPackage by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getVerificationPackage" method="get" path="/verification/{connection_id}/package/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetVerificationPackageRequest;
import to.unified.unified_java_sdk.models.operations.GetVerificationPackageResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetVerificationPackageRequest req = GetVerificationPackageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetVerificationPackageResponse res = sdk.verification().getVerificationPackage()
                .request(req)
                .call();

        if (res.verificationPackage().isPresent()) {
            System.out.println(res.verificationPackage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetVerificationPackageRequest](../../models/operations/GetVerificationPackageRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetVerificationPackageResponse](../../models/operations/GetVerificationPackageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getVerificationRequest

Retrieves a single VerificationRequest by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

        GetVerificationRequestResponse res = sdk.verification().getVerificationRequest()
                .request(req)
                .call();

        if (res.verificationRequest().isPresent()) {
            System.out.println(res.verificationRequest().get());
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

## listVerificationPackages

Returns a list of VerificationPackages. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listVerificationPackages" method="get" path="/verification/{connection_id}/package" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListVerificationPackagesRequest;
import to.unified.unified_java_sdk.models.operations.ListVerificationPackagesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListVerificationPackagesRequest req = ListVerificationPackagesRequest.builder()
                .connectionId("<id>")
                .build();

        ListVerificationPackagesResponse res = sdk.verification().listVerificationPackages()
                .request(req)
                .call();

        if (res.verificationPackages().isPresent()) {
            System.out.println(res.verificationPackages().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListVerificationPackagesRequest](../../models/operations/ListVerificationPackagesRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListVerificationPackagesResponse](../../models/operations/ListVerificationPackagesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listVerificationRequests

Returns a list of VerificationRequests. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

        ListVerificationRequestsResponse res = sdk.verification().listVerificationRequests()
                .request(req)
                .call();

        if (res.verificationRequests().isPresent()) {
            System.out.println(res.verificationRequests().get());
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

Updates the VerificationRequest identified by `id`. Provide the unified VerificationRequest fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchVerificationRequest" method="patch" path="/verification/{connection_id}/request/{id}" example="verification_request" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchVerificationRequestRequest;
import to.unified.unified_java_sdk.models.operations.PatchVerificationRequestResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchVerificationRequestRequest req = PatchVerificationRequestRequest.builder()
                .verificationRequest(VerificationRequest.builder()
                    .createdAt(OffsetDateTime.parse("2023-11-20T08:17:29.950Z"))
                    .id("f7244d68-b43c-44a7-a62a-96f11734521d")
                    .metadata(List.of())
                    .parameters(List.of())
                    .profileAddresses(List.of())
                    .profileEmails(List.of())
                    .profileTelephones(List.of())
                    .responseDetails(List.of())
                    .responseDownloadUrls(List.of())
                    .responseSource("Implemented regional protocol")
                    .responseStatus(VerificationRequestResponseStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2023-12-27T11:56:44.804Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchVerificationRequestResponse res = sdk.verification().patchVerificationRequest()
                .request(req)
                .call();

        if (res.verificationRequest().isPresent()) {
            System.out.println(res.verificationRequest().get());
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

Deletes the VerificationRequest identified by `id`.

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

        RemoveVerificationRequestResponse res = sdk.verification().removeVerificationRequest()
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

Updates the VerificationRequest identified by `id`. Provide the unified VerificationRequest fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateVerificationRequest" method="put" path="/verification/{connection_id}/request/{id}" example="verification_request" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateVerificationRequestRequest;
import to.unified.unified_java_sdk.models.operations.UpdateVerificationRequestResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateVerificationRequestRequest req = UpdateVerificationRequestRequest.builder()
                .verificationRequest(VerificationRequest.builder()
                    .createdAt(OffsetDateTime.parse("2023-11-20T08:17:29.950Z"))
                    .id("f7244d68-b43c-44a7-a62a-96f11734521d")
                    .metadata(List.of())
                    .parameters(List.of())
                    .profileAddresses(List.of())
                    .profileEmails(List.of())
                    .profileTelephones(List.of())
                    .responseDetails(List.of())
                    .responseDownloadUrls(List.of())
                    .responseSource("Implemented regional protocol")
                    .responseStatus(VerificationRequestResponseStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2023-12-27T11:56:44.804Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateVerificationRequestResponse res = sdk.verification().updateVerificationRequest()
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
| `request`                                                                                       | [UpdateVerificationRequestRequest](../../models/operations/UpdateVerificationRequestRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[UpdateVerificationRequestResponse](../../models/operations/UpdateVerificationRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |