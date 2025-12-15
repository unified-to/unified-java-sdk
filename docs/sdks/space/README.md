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

Create a space

### Example Usage

<!-- UsageSnippet language="java" operationID="createKmsSpace" method="post" path="/kms/{connection_id}/space" -->
```java
package hello.world;

import java.lang.Exception;
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
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateKmsSpaceResponse res = sdk.space().createKmsSpace()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            // handle response
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

Retrieve a space

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
            // handle response
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

List all spaces

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
            // handle response
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

Update a space

### Example Usage

<!-- UsageSnippet language="java" operationID="patchKmsSpace" method="patch" path="/kms/{connection_id}/space/{id}" -->
```java
package hello.world;

import java.lang.Exception;
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
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchKmsSpaceResponse res = sdk.space().patchKmsSpace()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            // handle response
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

Remove a space

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

Update a space

### Example Usage

<!-- UsageSnippet language="java" operationID="updateKmsSpace" method="put" path="/kms/{connection_id}/space/{id}" -->
```java
package hello.world;

import java.lang.Exception;
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
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateKmsSpaceResponse res = sdk.space().updateKmsSpace()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            // handle response
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