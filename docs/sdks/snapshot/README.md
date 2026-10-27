# Snapshot

## Overview

### Available Operations

* [createComputeSnapshot](#createcomputesnapshot) - Create a snapshot
* [getComputeSnapshot](#getcomputesnapshot) - Retrieve a snapshot
* [listComputeSnapshots](#listcomputesnapshots) - List all snapshots
* [removeComputeSnapshot](#removecomputesnapshot) - Remove a snapshot

## createComputeSnapshot

Creates a ComputeSnapshot. Provide the unified ComputeSnapshot fields in the request body; they are mapped to the provider's API. Returns the created ComputeSnapshot.

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeSnapshot" method="post" path="/compute/{connection_id}/snapshot" example="compute_snapshot" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeSnapshotRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeSnapshotResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeSnapshotRequest req = CreateComputeSnapshotRequest.builder()
                .computeSnapshot(ComputeSnapshot.builder()
                    .createdAt(OffsetDateTime.parse("2021-09-24T14:40:06.110Z"))
                    .id("b9ca2944-9abc-4493-aad4-c2c4a187bb27")
                    .metadata(List.of())
                    .name("snap-alius")
                    .sizeMb(169984d)
                    .status(ComputeSnapshotStatus.DELETING)
                    .type(ComputeSnapshotType.DISK)
                    .updatedAt(OffsetDateTime.parse("2026-04-05T03:51:08.509Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeSnapshotResponse res = sdk.snapshot().createComputeSnapshot()
                .request(req)
                .call();

        if (res.computeSnapshot().isPresent()) {
            System.out.println(res.computeSnapshot().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateComputeSnapshotRequest](../../models/operations/CreateComputeSnapshotRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateComputeSnapshotResponse](../../models/operations/CreateComputeSnapshotResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeSnapshot

Retrieves a single ComputeSnapshot by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeSnapshot" method="get" path="/compute/{connection_id}/snapshot/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeSnapshotRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeSnapshotResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeSnapshotRequest req = GetComputeSnapshotRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeSnapshotResponse res = sdk.snapshot().getComputeSnapshot()
                .request(req)
                .call();

        if (res.computeSnapshot().isPresent()) {
            System.out.println(res.computeSnapshot().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetComputeSnapshotRequest](../../models/operations/GetComputeSnapshotRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetComputeSnapshotResponse](../../models/operations/GetComputeSnapshotResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeSnapshots

Returns a list of ComputeSnapshots. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeSnapshots" method="get" path="/compute/{connection_id}/snapshot" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeSnapshotsRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeSnapshotsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeSnapshotsRequest req = ListComputeSnapshotsRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeSnapshotsResponse res = sdk.snapshot().listComputeSnapshots()
                .request(req)
                .call();

        if (res.computeSnapshots().isPresent()) {
            System.out.println(res.computeSnapshots().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListComputeSnapshotsRequest](../../models/operations/ListComputeSnapshotsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListComputeSnapshotsResponse](../../models/operations/ListComputeSnapshotsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeSnapshot

Deletes the ComputeSnapshot identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeSnapshot" method="delete" path="/compute/{connection_id}/snapshot/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeSnapshotRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeSnapshotResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeSnapshotRequest req = RemoveComputeSnapshotRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeSnapshotResponse res = sdk.snapshot().removeComputeSnapshot()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveComputeSnapshotRequest](../../models/operations/RemoveComputeSnapshotRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveComputeSnapshotResponse](../../models/operations/RemoveComputeSnapshotResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |