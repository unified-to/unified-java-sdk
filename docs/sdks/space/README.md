# Space

## Overview

### Available Operations

* [createKmsSpace](#createkmsspace) - Create a space
* [getKmsSpace](#getkmsspace) - Retrieve a space
* [listKmsSpaces](#listkmsspaces) - List all spaces
* [patchKmsSpace](#patchkmsspace) - Update a space
* [removeKmsSpace](#removekmsspace) - Remove a space
* [updateKmsSpace](#updatekmsspace) - Update a space

## createKmsSpace

Creates a KmsSpace. Provide the unified KmsSpace fields in the request body; they are mapped to the provider's API. Returns the created KmsSpace.

### Example Usage

<!-- UsageSnippet language="java" operationID="createKmsSpace" method="post" path="/kms/{connection_id}/space" example="kms_space" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateKmsSpaceRequest;
import to.unified.unified_java_sdk.models.operations.CreateKmsSpaceResponse;
import to.unified.unified_java_sdk.models.shared.KmsSpace;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateKmsSpaceRequest req = CreateKmsSpaceRequest.builder()
                .kmsSpace(KmsSpace.builder()
                    .createdAt(OffsetDateTime.parse("2022-10-31T00:56:54.246Z"))
                    .description("Acer.")
                    .id("c2a31335-8e3e-4c05-a42a-8c5d2f5159cd")
                    .isActive(false)
                    .metadata(List.of())
                    .name("into nor afore")
                    .updatedAt(OffsetDateTime.parse("2026-01-06T00:28:37.514Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateKmsSpaceResponse res = sdk.space().createKmsSpace()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            System.out.println(res.kmsSpace().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateKmsSpaceRequest](../../models/operations/CreateKmsSpaceRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateKmsSpaceResponse](../../models/operations/CreateKmsSpaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getKmsSpace

Retrieves a single KmsSpace by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getKmsSpace" method="get" path="/kms/{connection_id}/space/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetKmsSpaceRequest;
import to.unified.unified_java_sdk.models.operations.GetKmsSpaceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetKmsSpaceRequest req = GetKmsSpaceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetKmsSpaceResponse res = sdk.space().getKmsSpace()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            System.out.println(res.kmsSpace().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetKmsSpaceRequest](../../models/operations/GetKmsSpaceRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetKmsSpaceResponse](../../models/operations/GetKmsSpaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listKmsSpaces

Returns a list of KmsSpaces. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listKmsSpaces" method="get" path="/kms/{connection_id}/space" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListKmsSpacesRequest;
import to.unified.unified_java_sdk.models.operations.ListKmsSpacesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListKmsSpacesRequest req = ListKmsSpacesRequest.builder()
                .connectionId("<id>")
                .build();

        ListKmsSpacesResponse res = sdk.space().listKmsSpaces()
                .request(req)
                .call();

        if (res.kmsSpaces().isPresent()) {
            System.out.println(res.kmsSpaces().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListKmsSpacesRequest](../../models/operations/ListKmsSpacesRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListKmsSpacesResponse](../../models/operations/ListKmsSpacesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchKmsSpace

Updates the KmsSpace identified by `id`. Provide the unified KmsSpace fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchKmsSpace" method="patch" path="/kms/{connection_id}/space/{id}" example="kms_space" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchKmsSpaceRequest;
import to.unified.unified_java_sdk.models.operations.PatchKmsSpaceResponse;
import to.unified.unified_java_sdk.models.shared.KmsSpace;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchKmsSpaceRequest req = PatchKmsSpaceRequest.builder()
                .kmsSpace(KmsSpace.builder()
                    .createdAt(OffsetDateTime.parse("2022-10-31T00:56:54.246Z"))
                    .description("Acer.")
                    .id("ee80e155-fee2-4a30-b389-2c89014972c0")
                    .isActive(false)
                    .metadata(List.of())
                    .name("into nor afore")
                    .updatedAt(OffsetDateTime.parse("2026-01-06T00:28:37.527Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchKmsSpaceResponse res = sdk.space().patchKmsSpace()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            System.out.println(res.kmsSpace().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchKmsSpaceRequest](../../models/operations/PatchKmsSpaceRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchKmsSpaceResponse](../../models/operations/PatchKmsSpaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeKmsSpace

Deletes the KmsSpace identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeKmsSpace" method="delete" path="/kms/{connection_id}/space/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveKmsSpaceRequest;
import to.unified.unified_java_sdk.models.operations.RemoveKmsSpaceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveKmsSpaceRequest req = RemoveKmsSpaceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveKmsSpaceResponse res = sdk.space().removeKmsSpace()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveKmsSpaceRequest](../../models/operations/RemoveKmsSpaceRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveKmsSpaceResponse](../../models/operations/RemoveKmsSpaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateKmsSpace

Updates the KmsSpace identified by `id`. Provide the unified KmsSpace fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateKmsSpace" method="put" path="/kms/{connection_id}/space/{id}" example="kms_space" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateKmsSpaceRequest;
import to.unified.unified_java_sdk.models.operations.UpdateKmsSpaceResponse;
import to.unified.unified_java_sdk.models.shared.KmsSpace;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateKmsSpaceRequest req = UpdateKmsSpaceRequest.builder()
                .kmsSpace(KmsSpace.builder()
                    .createdAt(OffsetDateTime.parse("2022-10-31T00:56:54.246Z"))
                    .description("Acer.")
                    .id("ee80e155-fee2-4a30-b389-2c89014972c0")
                    .isActive(false)
                    .metadata(List.of())
                    .name("into nor afore")
                    .updatedAt(OffsetDateTime.parse("2026-01-06T00:28:37.527Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateKmsSpaceResponse res = sdk.space().updateKmsSpace()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            System.out.println(res.kmsSpace().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateKmsSpaceRequest](../../models/operations/UpdateKmsSpaceRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateKmsSpaceResponse](../../models/operations/UpdateKmsSpaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |