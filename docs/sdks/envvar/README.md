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

Create an envvar

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
                    .id("99c995cb-eeb5-4bd0-80c9-2e3084572418")
                    .isSecret(true)
                    .metadata(List.of())
                    .name("AEGER_SUBSTANTIA")
                    .updatedAt(OffsetDateTime.parse("2025-07-02T16:37:34.479Z"))
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

Retrieve an envvar

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

List all envvars

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

Update an envvar

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
                    .id("227f7e08-afd4-4788-9b0b-75dc8c88e8d3")
                    .isSecret(true)
                    .metadata(List.of())
                    .name("AEGER_SUBSTANTIA")
                    .updatedAt(OffsetDateTime.parse("2025-07-02T16:37:34.492Z"))
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

Remove an envvar

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

Update an envvar

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
                    .id("227f7e08-afd4-4788-9b0b-75dc8c88e8d3")
                    .isSecret(true)
                    .metadata(List.of())
                    .name("AEGER_SUBSTANTIA")
                    .updatedAt(OffsetDateTime.parse("2025-07-02T16:37:34.492Z"))
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