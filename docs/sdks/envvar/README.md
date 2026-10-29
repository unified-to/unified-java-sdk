# Envvar

## Overview

### Available Operations

* [createComputeEnvvar](#createcomputeenvvar) - Create an envvar
* [getComputeEnvvar](#getcomputeenvvar) - Retrieve an envvar
* [listComputeEnvvars](#listcomputeenvvars) - List all envvars
* [patchComputeEnvvar](#patchcomputeenvvar) - Update an envvar
* [removeComputeEnvvar](#removecomputeenvvar) - Remove an envvar
* [updateComputeEnvvar](#updatecomputeenvvar) - Update an envvar

## createComputeEnvvar

Creates a ComputeEnvvar. Provide the unified ComputeEnvvar fields in the request body; they are mapped to the provider's API. Returns the created ComputeEnvvar.

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeEnvvar" method="post" path="/compute/{connection_id}/envvar" example="compute_envvar" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeEnvvarRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeEnvvarResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeEnvvarRequest req = CreateComputeEnvvarRequest.builder()
                .computeEnvvar(ComputeEnvvar.builder()
                    .createdAt(OffsetDateTime.parse("2021-08-16T07:52:27.306Z"))
                    .environments(List.of(
                        PropertyComputeEnvvarEnvironments.PREVIEW))
                    .id("5aaeaf64-f06b-459e-92c7-60fe7527a45d")
                    .isSecret(true)
                    .metadata(List.of())
                    .name("AEGER_SUBSTANTIA")
                    .updatedAt(OffsetDateTime.parse("2025-07-09T08:07:18.282Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeEnvvarResponse res = sdk.envvar().createComputeEnvvar()
                .request(req)
                .call();

        if (res.computeEnvvar().isPresent()) {
            System.out.println(res.computeEnvvar().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateComputeEnvvarRequest](../../models/operations/CreateComputeEnvvarRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateComputeEnvvarResponse](../../models/operations/CreateComputeEnvvarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeEnvvar

Retrieves a single ComputeEnvvar by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeEnvvar" method="get" path="/compute/{connection_id}/envvar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeEnvvarRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeEnvvarResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeEnvvarRequest req = GetComputeEnvvarRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeEnvvarResponse res = sdk.envvar().getComputeEnvvar()
                .request(req)
                .call();

        if (res.computeEnvvar().isPresent()) {
            System.out.println(res.computeEnvvar().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetComputeEnvvarRequest](../../models/operations/GetComputeEnvvarRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetComputeEnvvarResponse](../../models/operations/GetComputeEnvvarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeEnvvars

Returns a list of ComputeEnvvars. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeEnvvars" method="get" path="/compute/{connection_id}/envvar" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeEnvvarsRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeEnvvarsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeEnvvarsRequest req = ListComputeEnvvarsRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeEnvvarsResponse res = sdk.envvar().listComputeEnvvars()
                .request(req)
                .call();

        if (res.computeEnvvars().isPresent()) {
            System.out.println(res.computeEnvvars().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListComputeEnvvarsRequest](../../models/operations/ListComputeEnvvarsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListComputeEnvvarsResponse](../../models/operations/ListComputeEnvvarsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchComputeEnvvar

Updates the ComputeEnvvar identified by `id`. Provide the unified ComputeEnvvar fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchComputeEnvvar" method="patch" path="/compute/{connection_id}/envvar/{id}" example="compute_envvar" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchComputeEnvvarRequest;
import to.unified.unified_java_sdk.models.operations.PatchComputeEnvvarResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchComputeEnvvarRequest req = PatchComputeEnvvarRequest.builder()
                .computeEnvvar(ComputeEnvvar.builder()
                    .createdAt(OffsetDateTime.parse("2021-08-16T07:52:27.306Z"))
                    .environments(List.of(
                        PropertyComputeEnvvarEnvironments.PREVIEW))
                    .id("7fcad3d4-16ac-47e3-9789-09b7c9cdc0fa")
                    .isSecret(true)
                    .metadata(List.of())
                    .name("AEGER_SUBSTANTIA")
                    .updatedAt(OffsetDateTime.parse("2025-07-09T08:07:18.293Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchComputeEnvvarResponse res = sdk.envvar().patchComputeEnvvar()
                .request(req)
                .call();

        if (res.computeEnvvar().isPresent()) {
            System.out.println(res.computeEnvvar().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchComputeEnvvarRequest](../../models/operations/PatchComputeEnvvarRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchComputeEnvvarResponse](../../models/operations/PatchComputeEnvvarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeEnvvar

Deletes the ComputeEnvvar identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeEnvvar" method="delete" path="/compute/{connection_id}/envvar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeEnvvarRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeEnvvarResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeEnvvarRequest req = RemoveComputeEnvvarRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeEnvvarResponse res = sdk.envvar().removeComputeEnvvar()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveComputeEnvvarRequest](../../models/operations/RemoveComputeEnvvarRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveComputeEnvvarResponse](../../models/operations/RemoveComputeEnvvarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateComputeEnvvar

Updates the ComputeEnvvar identified by `id`. Provide the unified ComputeEnvvar fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateComputeEnvvar" method="put" path="/compute/{connection_id}/envvar/{id}" example="compute_envvar" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateComputeEnvvarRequest;
import to.unified.unified_java_sdk.models.operations.UpdateComputeEnvvarResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateComputeEnvvarRequest req = UpdateComputeEnvvarRequest.builder()
                .computeEnvvar(ComputeEnvvar.builder()
                    .createdAt(OffsetDateTime.parse("2021-08-16T07:52:27.306Z"))
                    .environments(List.of(
                        PropertyComputeEnvvarEnvironments.PREVIEW))
                    .id("7fcad3d4-16ac-47e3-9789-09b7c9cdc0fa")
                    .isSecret(true)
                    .metadata(List.of())
                    .name("AEGER_SUBSTANTIA")
                    .updatedAt(OffsetDateTime.parse("2025-07-09T08:07:18.293Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateComputeEnvvarResponse res = sdk.envvar().updateComputeEnvvar()
                .request(req)
                .call();

        if (res.computeEnvvar().isPresent()) {
            System.out.println(res.computeEnvvar().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateComputeEnvvarRequest](../../models/operations/UpdateComputeEnvvarRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateComputeEnvvarResponse](../../models/operations/UpdateComputeEnvvarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |