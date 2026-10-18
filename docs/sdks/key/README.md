# Key

## Overview

### Available Operations

* [createComputeKey](#createcomputekey) - Create a key
* [getComputeKey](#getcomputekey) - Retrieve a key
* [listComputeKeys](#listcomputekeys) - List all keys
* [patchComputeKey](#patchcomputekey) - Update a key
* [removeComputeKey](#removecomputekey) - Remove a key
* [updateComputeKey](#updatecomputekey) - Update a key

## createComputeKey

Create a key

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeKey" method="post" path="/compute/{connection_id}/key" example="compute_key" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeKeyRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeKeyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeKeyRequest req = CreateComputeKeyRequest.builder()
                .computeKey(ComputeKey.builder()
                    .createdAt(OffsetDateTime.parse("2023-08-19T14:31:46.492Z"))
                    .id("74f8e73f-035d-4bf1-a174-7bc27d1727a9")
                    .name("nienow-secret")
                    .type(ComputeKeyType.SECRET)
                    .updatedAt(OffsetDateTime.parse("2024-10-05T21:05:17.446Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeKeyResponse res = sdk.key().createComputeKey()
                .request(req)
                .call();

        if (res.computeKey().isPresent()) {
            System.out.println(res.computeKey().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateComputeKeyRequest](../../models/operations/CreateComputeKeyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateComputeKeyResponse](../../models/operations/CreateComputeKeyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeKey

Retrieve a key

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeKey" method="get" path="/compute/{connection_id}/key/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeKeyRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeKeyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeKeyRequest req = GetComputeKeyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeKeyResponse res = sdk.key().getComputeKey()
                .request(req)
                .call();

        if (res.computeKey().isPresent()) {
            System.out.println(res.computeKey().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetComputeKeyRequest](../../models/operations/GetComputeKeyRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetComputeKeyResponse](../../models/operations/GetComputeKeyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeKeys

List all keys

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeKeys" method="get" path="/compute/{connection_id}/key" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeKeysRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeKeysResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeKeysRequest req = ListComputeKeysRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeKeysResponse res = sdk.key().listComputeKeys()
                .request(req)
                .call();

        if (res.computeKeys().isPresent()) {
            System.out.println(res.computeKeys().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListComputeKeysRequest](../../models/operations/ListComputeKeysRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListComputeKeysResponse](../../models/operations/ListComputeKeysResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchComputeKey

Update a key

### Example Usage

<!-- UsageSnippet language="java" operationID="patchComputeKey" method="patch" path="/compute/{connection_id}/key/{id}" example="compute_key" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchComputeKeyRequest;
import to.unified.unified_java_sdk.models.operations.PatchComputeKeyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchComputeKeyRequest req = PatchComputeKeyRequest.builder()
                .computeKey(ComputeKey.builder()
                    .createdAt(OffsetDateTime.parse("2023-08-19T14:31:46.492Z"))
                    .id("c582a0f4-1f40-4524-bc55-c6b145c29eca")
                    .name("nienow-secret")
                    .type(ComputeKeyType.SECRET)
                    .updatedAt(OffsetDateTime.parse("2024-10-05T21:05:17.450Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchComputeKeyResponse res = sdk.key().patchComputeKey()
                .request(req)
                .call();

        if (res.computeKey().isPresent()) {
            System.out.println(res.computeKey().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchComputeKeyRequest](../../models/operations/PatchComputeKeyRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchComputeKeyResponse](../../models/operations/PatchComputeKeyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeKey

Remove a key

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeKey" method="delete" path="/compute/{connection_id}/key/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeKeyRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeKeyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeKeyRequest req = RemoveComputeKeyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeKeyResponse res = sdk.key().removeComputeKey()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveComputeKeyRequest](../../models/operations/RemoveComputeKeyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveComputeKeyResponse](../../models/operations/RemoveComputeKeyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateComputeKey

Update a key

### Example Usage

<!-- UsageSnippet language="java" operationID="updateComputeKey" method="put" path="/compute/{connection_id}/key/{id}" example="compute_key" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateComputeKeyRequest;
import to.unified.unified_java_sdk.models.operations.UpdateComputeKeyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateComputeKeyRequest req = UpdateComputeKeyRequest.builder()
                .computeKey(ComputeKey.builder()
                    .createdAt(OffsetDateTime.parse("2023-08-19T14:31:46.492Z"))
                    .id("c582a0f4-1f40-4524-bc55-c6b145c29eca")
                    .name("nienow-secret")
                    .type(ComputeKeyType.SECRET)
                    .updatedAt(OffsetDateTime.parse("2024-10-05T21:05:17.450Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateComputeKeyResponse res = sdk.key().updateComputeKey()
                .request(req)
                .call();

        if (res.computeKey().isPresent()) {
            System.out.println(res.computeKey().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateComputeKeyRequest](../../models/operations/UpdateComputeKeyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateComputeKeyResponse](../../models/operations/UpdateComputeKeyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |