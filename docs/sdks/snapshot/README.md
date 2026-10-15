# Snapshot

## Overview

### Available Operations

* [createComputeSnapshot](#createcomputesnapshot) - Create a snapshot
* [getComputeSnapshot](#getcomputesnapshot) - Retrieve a snapshot
* [listComputeSnapshots](#listcomputesnapshots) - List all snapshots
* [removeComputeSnapshot](#removecomputesnapshot) - Remove a snapshot

## createComputeSnapshot

Create a snapshot

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
                    .id("651f3290-6710-4f0d-bbe2-fb569b0897e9")
                    .metadata(List.of())
                    .name("snap-alius")
                    .sizeMb(169984d)
                    .status(ComputeSnapshotStatus.DELETING)
                    .type(ComputeSnapshotType.DISK)
                    .updatedAt(OffsetDateTime.parse("2026-03-25T14:03:08.777Z"))
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

Retrieve a snapshot

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

List all snapshots

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

Remove a snapshot

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