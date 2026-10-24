# Volume

## Overview

### Available Operations

* [createComputeVolume](#createcomputevolume) - Create a volume
* [getComputeVolume](#getcomputevolume) - Retrieve a volume
* [listComputeVolumes](#listcomputevolumes) - List all volumes
* [patchComputeVolume](#patchcomputevolume) - Update a volume
* [removeComputeVolume](#removecomputevolume) - Remove a volume
* [updateComputeVolume](#updatecomputevolume) - Update a volume

## createComputeVolume

Creates a ComputeVolume. Provide the unified ComputeVolume fields in the request body; they are mapped to the provider's API. Returns the created ComputeVolume.

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeVolume" method="post" path="/compute/{connection_id}/volume" example="compute_volume" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeVolumeRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeVolumeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeVolumeRequest req = CreateComputeVolumeRequest.builder()
                .computeVolume(ComputeVolume.builder()
                    .createdAt(OffsetDateTime.parse("2022-11-15T15:12:48.055Z"))
                    .id("d9ba7dd2-a276-4650-81c4-4f017de70a28")
                    .instanceIds(List.of())
                    .metadata(List.of())
                    .name("vol-solum")
                    .sizeMb(1024000d)
                    .status(ComputeVolumeStatus.OTHER)
                    .type(ComputeVolumeType.HIGH_PERFORMANCE)
                    .updatedAt(OffsetDateTime.parse("2024-02-10T20:43:06.781Z"))
                    .usedMb(524986d)
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeVolumeResponse res = sdk.volume().createComputeVolume()
                .request(req)
                .call();

        if (res.computeVolume().isPresent()) {
            System.out.println(res.computeVolume().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateComputeVolumeRequest](../../models/operations/CreateComputeVolumeRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateComputeVolumeResponse](../../models/operations/CreateComputeVolumeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeVolume

Retrieves a single ComputeVolume by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeVolume" method="get" path="/compute/{connection_id}/volume/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeVolumeRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeVolumeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeVolumeRequest req = GetComputeVolumeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeVolumeResponse res = sdk.volume().getComputeVolume()
                .request(req)
                .call();

        if (res.computeVolume().isPresent()) {
            System.out.println(res.computeVolume().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetComputeVolumeRequest](../../models/operations/GetComputeVolumeRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetComputeVolumeResponse](../../models/operations/GetComputeVolumeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeVolumes

Returns a list of ComputeVolumes. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeVolumes" method="get" path="/compute/{connection_id}/volume" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeVolumesRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeVolumesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeVolumesRequest req = ListComputeVolumesRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeVolumesResponse res = sdk.volume().listComputeVolumes()
                .request(req)
                .call();

        if (res.computeVolumes().isPresent()) {
            System.out.println(res.computeVolumes().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListComputeVolumesRequest](../../models/operations/ListComputeVolumesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListComputeVolumesResponse](../../models/operations/ListComputeVolumesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchComputeVolume

Updates the ComputeVolume identified by `id`. Provide the unified ComputeVolume fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchComputeVolume" method="patch" path="/compute/{connection_id}/volume/{id}" example="compute_volume" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchComputeVolumeRequest;
import to.unified.unified_java_sdk.models.operations.PatchComputeVolumeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchComputeVolumeRequest req = PatchComputeVolumeRequest.builder()
                .computeVolume(ComputeVolume.builder()
                    .createdAt(OffsetDateTime.parse("2022-11-15T15:12:48.055Z"))
                    .id("1bcf2b87-bebe-408d-9ca5-58b850763940")
                    .instanceIds(List.of())
                    .metadata(List.of())
                    .name("vol-solum")
                    .sizeMb(1024000d)
                    .status(ComputeVolumeStatus.OTHER)
                    .type(ComputeVolumeType.HIGH_PERFORMANCE)
                    .updatedAt(OffsetDateTime.parse("2024-02-10T20:43:06.793Z"))
                    .usedMb(524986d)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchComputeVolumeResponse res = sdk.volume().patchComputeVolume()
                .request(req)
                .call();

        if (res.computeVolume().isPresent()) {
            System.out.println(res.computeVolume().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchComputeVolumeRequest](../../models/operations/PatchComputeVolumeRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchComputeVolumeResponse](../../models/operations/PatchComputeVolumeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeVolume

Deletes the ComputeVolume identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeVolume" method="delete" path="/compute/{connection_id}/volume/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeVolumeRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeVolumeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeVolumeRequest req = RemoveComputeVolumeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeVolumeResponse res = sdk.volume().removeComputeVolume()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveComputeVolumeRequest](../../models/operations/RemoveComputeVolumeRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveComputeVolumeResponse](../../models/operations/RemoveComputeVolumeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateComputeVolume

Updates the ComputeVolume identified by `id`. Provide the unified ComputeVolume fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateComputeVolume" method="put" path="/compute/{connection_id}/volume/{id}" example="compute_volume" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateComputeVolumeRequest;
import to.unified.unified_java_sdk.models.operations.UpdateComputeVolumeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateComputeVolumeRequest req = UpdateComputeVolumeRequest.builder()
                .computeVolume(ComputeVolume.builder()
                    .createdAt(OffsetDateTime.parse("2022-11-15T15:12:48.055Z"))
                    .id("1bcf2b87-bebe-408d-9ca5-58b850763940")
                    .instanceIds(List.of())
                    .metadata(List.of())
                    .name("vol-solum")
                    .sizeMb(1024000d)
                    .status(ComputeVolumeStatus.OTHER)
                    .type(ComputeVolumeType.HIGH_PERFORMANCE)
                    .updatedAt(OffsetDateTime.parse("2024-02-10T20:43:06.793Z"))
                    .usedMb(524986d)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateComputeVolumeResponse res = sdk.volume().updateComputeVolume()
                .request(req)
                .call();

        if (res.computeVolume().isPresent()) {
            System.out.println(res.computeVolume().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateComputeVolumeRequest](../../models/operations/UpdateComputeVolumeRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateComputeVolumeResponse](../../models/operations/UpdateComputeVolumeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |