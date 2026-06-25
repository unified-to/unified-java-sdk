# Space

## Overview

### Available Operations

* [createKmsSpace2](#createkmsspace2) - Create a space
* [getKmsSpace2](#getkmsspace2) - Retrieve a space
* [listKmsSpaces2](#listkmsspaces2) - List all spaces
* [patchKmsSpace2](#patchkmsspace2) - Update a space
* [removeKmsSpace2](#removekmsspace2) - Remove a space
* [updateKmsSpace2](#updatekmsspace2) - Update a space

## createKmsSpace2

Create a space

### Example Usage

<!-- UsageSnippet language="java" operationID="createKmsSpace2" method="post" path="/kms/{connection_id}/space" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateKmsSpace2Request;
import to.unified.unified_java_sdk.models.operations.CreateKmsSpace2Response;
import to.unified.unified_java_sdk.models.shared.KmsSpace;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateKmsSpace2Request req = CreateKmsSpace2Request.builder()
                .kmsSpace(KmsSpace.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateKmsSpace2Response res = sdk.space().createKmsSpace2()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            System.out.println(res.kmsSpace().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateKmsSpace2Request](../../models/operations/CreateKmsSpace2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateKmsSpace2Response](../../models/operations/CreateKmsSpace2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getKmsSpace2

Retrieve a space

### Example Usage

<!-- UsageSnippet language="java" operationID="getKmsSpace2" method="get" path="/kms/{connection_id}/space/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetKmsSpace2Request;
import to.unified.unified_java_sdk.models.operations.GetKmsSpace2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetKmsSpace2Request req = GetKmsSpace2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetKmsSpace2Response res = sdk.space().getKmsSpace2()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            System.out.println(res.kmsSpace().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetKmsSpace2Request](../../models/operations/GetKmsSpace2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetKmsSpace2Response](../../models/operations/GetKmsSpace2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listKmsSpaces2

List all spaces

### Example Usage

<!-- UsageSnippet language="java" operationID="listKmsSpaces2" method="get" path="/kms/{connection_id}/space" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListKmsSpaces2Request;
import to.unified.unified_java_sdk.models.operations.ListKmsSpaces2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListKmsSpaces2Request req = ListKmsSpaces2Request.builder()
                .connectionId("<id>")
                .build();

        ListKmsSpaces2Response res = sdk.space().listKmsSpaces2()
                .request(req)
                .call();

        if (res.kmsSpaces().isPresent()) {
            System.out.println(res.kmsSpaces().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListKmsSpaces2Request](../../models/operations/ListKmsSpaces2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListKmsSpaces2Response](../../models/operations/ListKmsSpaces2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchKmsSpace2

Update a space

### Example Usage

<!-- UsageSnippet language="java" operationID="patchKmsSpace2" method="patch" path="/kms/{connection_id}/space/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchKmsSpace2Request;
import to.unified.unified_java_sdk.models.operations.PatchKmsSpace2Response;
import to.unified.unified_java_sdk.models.shared.KmsSpace;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchKmsSpace2Request req = PatchKmsSpace2Request.builder()
                .kmsSpace(KmsSpace.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchKmsSpace2Response res = sdk.space().patchKmsSpace2()
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
| `request`                                                                 | [PatchKmsSpace2Request](../../models/operations/PatchKmsSpace2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchKmsSpace2Response](../../models/operations/PatchKmsSpace2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeKmsSpace2

Remove a space

### Example Usage

<!-- UsageSnippet language="java" operationID="removeKmsSpace2" method="delete" path="/kms/{connection_id}/space/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveKmsSpace2Request;
import to.unified.unified_java_sdk.models.operations.RemoveKmsSpace2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveKmsSpace2Request req = RemoveKmsSpace2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveKmsSpace2Response res = sdk.space().removeKmsSpace2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveKmsSpace2Request](../../models/operations/RemoveKmsSpace2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveKmsSpace2Response](../../models/operations/RemoveKmsSpace2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateKmsSpace2

Update a space

### Example Usage

<!-- UsageSnippet language="java" operationID="updateKmsSpace2" method="put" path="/kms/{connection_id}/space/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateKmsSpace2Request;
import to.unified.unified_java_sdk.models.operations.UpdateKmsSpace2Response;
import to.unified.unified_java_sdk.models.shared.KmsSpace;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateKmsSpace2Request req = UpdateKmsSpace2Request.builder()
                .kmsSpace(KmsSpace.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateKmsSpace2Response res = sdk.space().updateKmsSpace2()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            System.out.println(res.kmsSpace().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateKmsSpace2Request](../../models/operations/UpdateKmsSpace2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateKmsSpace2Response](../../models/operations/UpdateKmsSpace2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |