# Record

## Overview

### Available Operations

* [createDatastoreRecord](#createdatastorerecord) - Create a record
* [getDatastoreRecord](#getdatastorerecord) - Retrieve a record
* [listDatastoreRecords](#listdatastorerecords) - List all records
* [patchDatastoreRecord](#patchdatastorerecord) - Update a record
* [removeDatastoreRecord](#removedatastorerecord) - Remove a record
* [updateDatastoreRecord](#updatedatastorerecord) - Update a record

## createDatastoreRecord

Creates a DatastoreRecord. Provide the unified DatastoreRecord fields in the request body; they are mapped to the provider's API. Returns the created DatastoreRecord.

### Example Usage

<!-- UsageSnippet language="java" operationID="createDatastoreRecord" method="post" path="/datastore/{connection_id}/record" example="datastore_record" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreRecordRequest;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreRecordResponse;
import to.unified.unified_java_sdk.models.shared.DatastoreRecord;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDatastoreRecordRequest req = CreateDatastoreRecordRequest.builder()
                .datastoreRecord(DatastoreRecord.builder()
                    .fields(Map.ofEntries(
                    ))
                    .createdAt(OffsetDateTime.parse("2022-07-10T04:42:03.076Z"))
                    .id("eea52470-58eb-4f57-8dc1-3604777e55ba")
                    .metadata(List.of())
                    .rowNumber(33d)
                    .updatedAt(OffsetDateTime.parse("2025-03-11T06:23:51.151Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateDatastoreRecordResponse res = sdk.record().createDatastoreRecord()
                .request(req)
                .call();

        if (res.datastoreRecord().isPresent()) {
            System.out.println(res.datastoreRecord().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateDatastoreRecordRequest](../../models/operations/CreateDatastoreRecordRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateDatastoreRecordResponse](../../models/operations/CreateDatastoreRecordResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDatastoreRecord

Retrieves a single DatastoreRecord by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getDatastoreRecord" method="get" path="/datastore/{connection_id}/record/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetDatastoreRecordRequest;
import to.unified.unified_java_sdk.models.operations.GetDatastoreRecordResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetDatastoreRecordRequest req = GetDatastoreRecordRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetDatastoreRecordResponse res = sdk.record().getDatastoreRecord()
                .request(req)
                .call();

        if (res.datastoreRecord().isPresent()) {
            System.out.println(res.datastoreRecord().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetDatastoreRecordRequest](../../models/operations/GetDatastoreRecordRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetDatastoreRecordResponse](../../models/operations/GetDatastoreRecordResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listDatastoreRecords

Returns a list of DatastoreRecords. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listDatastoreRecords" method="get" path="/datastore/{connection_id}/record" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListDatastoreRecordsRequest;
import to.unified.unified_java_sdk.models.operations.ListDatastoreRecordsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListDatastoreRecordsRequest req = ListDatastoreRecordsRequest.builder()
                .connectionId("<id>")
                .build();

        ListDatastoreRecordsResponse res = sdk.record().listDatastoreRecords()
                .request(req)
                .call();

        if (res.datastoreRecords().isPresent()) {
            System.out.println(res.datastoreRecords().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListDatastoreRecordsRequest](../../models/operations/ListDatastoreRecordsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListDatastoreRecordsResponse](../../models/operations/ListDatastoreRecordsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchDatastoreRecord

Updates the DatastoreRecord identified by `id`. Provide the unified DatastoreRecord fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchDatastoreRecord" method="patch" path="/datastore/{connection_id}/record/{id}" example="datastore_record" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchDatastoreRecordRequest;
import to.unified.unified_java_sdk.models.operations.PatchDatastoreRecordResponse;
import to.unified.unified_java_sdk.models.shared.DatastoreRecord;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchDatastoreRecordRequest req = PatchDatastoreRecordRequest.builder()
                .datastoreRecord(DatastoreRecord.builder()
                    .fields(Map.ofEntries(
                    ))
                    .createdAt(OffsetDateTime.parse("2022-07-10T04:42:03.076Z"))
                    .id("3ca424da-ca61-4de8-920c-2ce0e5e0777c")
                    .metadata(List.of())
                    .rowNumber(33d)
                    .updatedAt(OffsetDateTime.parse("2025-03-11T06:23:51.156Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDatastoreRecordResponse res = sdk.record().patchDatastoreRecord()
                .request(req)
                .call();

        if (res.datastoreRecord().isPresent()) {
            System.out.println(res.datastoreRecord().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchDatastoreRecordRequest](../../models/operations/PatchDatastoreRecordRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchDatastoreRecordResponse](../../models/operations/PatchDatastoreRecordResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeDatastoreRecord

Deletes the DatastoreRecord identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeDatastoreRecord" method="delete" path="/datastore/{connection_id}/record/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveDatastoreRecordRequest;
import to.unified.unified_java_sdk.models.operations.RemoveDatastoreRecordResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveDatastoreRecordRequest req = RemoveDatastoreRecordRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveDatastoreRecordResponse res = sdk.record().removeDatastoreRecord()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveDatastoreRecordRequest](../../models/operations/RemoveDatastoreRecordRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveDatastoreRecordResponse](../../models/operations/RemoveDatastoreRecordResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateDatastoreRecord

Updates the DatastoreRecord identified by `id`. Provide the unified DatastoreRecord fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateDatastoreRecord" method="put" path="/datastore/{connection_id}/record/{id}" example="datastore_record" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateDatastoreRecordRequest;
import to.unified.unified_java_sdk.models.operations.UpdateDatastoreRecordResponse;
import to.unified.unified_java_sdk.models.shared.DatastoreRecord;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateDatastoreRecordRequest req = UpdateDatastoreRecordRequest.builder()
                .datastoreRecord(DatastoreRecord.builder()
                    .fields(Map.ofEntries(
                    ))
                    .createdAt(OffsetDateTime.parse("2022-07-10T04:42:03.076Z"))
                    .id("3ca424da-ca61-4de8-920c-2ce0e5e0777c")
                    .metadata(List.of())
                    .rowNumber(33d)
                    .updatedAt(OffsetDateTime.parse("2025-03-11T06:23:51.156Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDatastoreRecordResponse res = sdk.record().updateDatastoreRecord()
                .request(req)
                .call();

        if (res.datastoreRecord().isPresent()) {
            System.out.println(res.datastoreRecord().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateDatastoreRecordRequest](../../models/operations/UpdateDatastoreRecordRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateDatastoreRecordResponse](../../models/operations/UpdateDatastoreRecordResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |