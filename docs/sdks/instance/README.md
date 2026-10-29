# Instance

## Overview

### Available Operations

* [createComputeInstance](#createcomputeinstance) - Create an instance
* [getComputeInstance](#getcomputeinstance) - Retrieve an instance
* [listComputeInstances](#listcomputeinstances) - List all instances
* [patchComputeInstance](#patchcomputeinstance) - Update an instance
* [removeComputeInstance](#removecomputeinstance) - Remove an instance
* [updateComputeInstance](#updatecomputeinstance) - Update an instance

## createComputeInstance

Creates a ComputeInstance. Provide the unified ComputeInstance fields in the request body; they are mapped to the provider's API. Returns the created ComputeInstance.

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeInstance" method="post" path="/compute/{connection_id}/instance" example="compute_instance" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeInstanceRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeInstanceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeInstanceRequest req = CreateComputeInstanceRequest.builder()
                .computeInstance(ComputeInstance.builder()
                    .allowedActions(List.of(
                        PropertyComputeInstanceAllowedActions.TERMINATE))
                    .architecture(ComputeInstanceArchitecture.OTHER)
                    .cpuCount(8d)
                    .createdAt(OffsetDateTime.parse("2022-10-07T14:18:53.874Z"))
                    .currency("USD")
                    .diskMb(1024000d)
                    .endpoints(List.of(
                        ComputeEndpoint.builder()
                            .isAuthRequired(true)
                            .port(8080d)
                            .protocol(Protocol.HTTPS)
                            .url("https://serene-shark.biz/")
                            .build()))
                    .gpuCount(0d)
                    .hasInternetAccess(true)
                    .id("3ddb0d62-7c99-4893-a034-aa57cc43c4ac")
                    .image("ubuntu:24.04")
                    .market(Market.SPOT)
                    .memoryMb(2048d)
                    .metadata(List.of())
                    .name("digital-panel")
                    .onIdle(OnIdle.TERMINATE)
                    .priceAmount(24.90336107776966)
                    .priceUnit(PriceUnit.PER_INSTANCE_HOUR)
                    .projectIdentifier("g547KrivqY")
                    .ssh(PropertyComputeInstanceSsh.builder()
                        .host("116.42.165.89")
                        .port(22d)
                        .username("root")
                        .build())
                    .startedAt(OffsetDateTime.parse("2025-03-28T15:20:00.872Z"))
                    .status(ComputeInstanceStatus.ERROR)
                    .statusReason("Sponte quasi adversus alioqui reiciendis arca carmen canis.")
                    .type(ComputeInstanceType.BAREMETAL)
                    .updatedAt(OffsetDateTime.parse("2025-06-21T07:22:48.566Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeInstanceResponse res = sdk.instance().createComputeInstance()
                .request(req)
                .call();

        if (res.computeInstance().isPresent()) {
            System.out.println(res.computeInstance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateComputeInstanceRequest](../../models/operations/CreateComputeInstanceRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateComputeInstanceResponse](../../models/operations/CreateComputeInstanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeInstance

Retrieves a single ComputeInstance by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeInstance" method="get" path="/compute/{connection_id}/instance/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeInstanceRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeInstanceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeInstanceRequest req = GetComputeInstanceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeInstanceResponse res = sdk.instance().getComputeInstance()
                .request(req)
                .call();

        if (res.computeInstance().isPresent()) {
            System.out.println(res.computeInstance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetComputeInstanceRequest](../../models/operations/GetComputeInstanceRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetComputeInstanceResponse](../../models/operations/GetComputeInstanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeInstances

Returns a list of ComputeInstances. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeInstances" method="get" path="/compute/{connection_id}/instance" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeInstancesRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeInstancesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeInstancesRequest req = ListComputeInstancesRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeInstancesResponse res = sdk.instance().listComputeInstances()
                .request(req)
                .call();

        if (res.computeInstances().isPresent()) {
            System.out.println(res.computeInstances().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListComputeInstancesRequest](../../models/operations/ListComputeInstancesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListComputeInstancesResponse](../../models/operations/ListComputeInstancesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchComputeInstance

Updates the ComputeInstance identified by `id`. Provide the unified ComputeInstance fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchComputeInstance" method="patch" path="/compute/{connection_id}/instance/{id}" example="compute_instance" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchComputeInstanceRequest;
import to.unified.unified_java_sdk.models.operations.PatchComputeInstanceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchComputeInstanceRequest req = PatchComputeInstanceRequest.builder()
                .computeInstance(ComputeInstance.builder()
                    .allowedActions(List.of(
                        PropertyComputeInstanceAllowedActions.TERMINATE))
                    .architecture(ComputeInstanceArchitecture.OTHER)
                    .cpuCount(8d)
                    .createdAt(OffsetDateTime.parse("2022-10-07T14:18:53.874Z"))
                    .currency("USD")
                    .diskMb(1024000d)
                    .endpoints(List.of(
                        ComputeEndpoint.builder()
                            .isAuthRequired(true)
                            .port(8080d)
                            .protocol(Protocol.HTTPS)
                            .url("https://serene-shark.biz/")
                            .build()))
                    .gpuCount(0d)
                    .hasInternetAccess(true)
                    .id("273f5b3e-a31a-46c4-b857-c4a8ba182e20")
                    .image("ubuntu:24.04")
                    .market(Market.SPOT)
                    .memoryMb(2048d)
                    .metadata(List.of())
                    .name("digital-panel")
                    .onIdle(OnIdle.TERMINATE)
                    .priceAmount(24.90336107776966)
                    .priceUnit(PriceUnit.PER_INSTANCE_HOUR)
                    .projectIdentifier("g547KrivqY")
                    .ssh(PropertyComputeInstanceSsh.builder()
                        .host("116.42.165.89")
                        .port(22d)
                        .username("root")
                        .build())
                    .startedAt(OffsetDateTime.parse("2025-03-28T15:20:00.903Z"))
                    .status(ComputeInstanceStatus.ERROR)
                    .statusReason("Sponte quasi adversus alioqui reiciendis arca carmen canis.")
                    .type(ComputeInstanceType.BAREMETAL)
                    .updatedAt(OffsetDateTime.parse("2025-06-21T07:22:48.600Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchComputeInstanceResponse res = sdk.instance().patchComputeInstance()
                .request(req)
                .call();

        if (res.computeInstance().isPresent()) {
            System.out.println(res.computeInstance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchComputeInstanceRequest](../../models/operations/PatchComputeInstanceRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchComputeInstanceResponse](../../models/operations/PatchComputeInstanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeInstance

Deletes the ComputeInstance identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeInstance" method="delete" path="/compute/{connection_id}/instance/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeInstanceRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeInstanceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeInstanceRequest req = RemoveComputeInstanceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeInstanceResponse res = sdk.instance().removeComputeInstance()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveComputeInstanceRequest](../../models/operations/RemoveComputeInstanceRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveComputeInstanceResponse](../../models/operations/RemoveComputeInstanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateComputeInstance

Updates the ComputeInstance identified by `id`. Provide the unified ComputeInstance fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateComputeInstance" method="put" path="/compute/{connection_id}/instance/{id}" example="compute_instance" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateComputeInstanceRequest;
import to.unified.unified_java_sdk.models.operations.UpdateComputeInstanceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateComputeInstanceRequest req = UpdateComputeInstanceRequest.builder()
                .computeInstance(ComputeInstance.builder()
                    .allowedActions(List.of(
                        PropertyComputeInstanceAllowedActions.TERMINATE))
                    .architecture(ComputeInstanceArchitecture.OTHER)
                    .cpuCount(8d)
                    .createdAt(OffsetDateTime.parse("2022-10-07T14:18:53.874Z"))
                    .currency("USD")
                    .diskMb(1024000d)
                    .endpoints(List.of(
                        ComputeEndpoint.builder()
                            .isAuthRequired(true)
                            .port(8080d)
                            .protocol(Protocol.HTTPS)
                            .url("https://serene-shark.biz/")
                            .build()))
                    .gpuCount(0d)
                    .hasInternetAccess(true)
                    .id("273f5b3e-a31a-46c4-b857-c4a8ba182e20")
                    .image("ubuntu:24.04")
                    .market(Market.SPOT)
                    .memoryMb(2048d)
                    .metadata(List.of())
                    .name("digital-panel")
                    .onIdle(OnIdle.TERMINATE)
                    .priceAmount(24.90336107776966)
                    .priceUnit(PriceUnit.PER_INSTANCE_HOUR)
                    .projectIdentifier("g547KrivqY")
                    .ssh(PropertyComputeInstanceSsh.builder()
                        .host("116.42.165.89")
                        .port(22d)
                        .username("root")
                        .build())
                    .startedAt(OffsetDateTime.parse("2025-03-28T15:20:00.903Z"))
                    .status(ComputeInstanceStatus.ERROR)
                    .statusReason("Sponte quasi adversus alioqui reiciendis arca carmen canis.")
                    .type(ComputeInstanceType.BAREMETAL)
                    .updatedAt(OffsetDateTime.parse("2025-06-21T07:22:48.600Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateComputeInstanceResponse res = sdk.instance().updateComputeInstance()
                .request(req)
                .call();

        if (res.computeInstance().isPresent()) {
            System.out.println(res.computeInstance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateComputeInstanceRequest](../../models/operations/UpdateComputeInstanceRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateComputeInstanceResponse](../../models/operations/UpdateComputeInstanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |