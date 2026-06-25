# Record

## Overview

### Available Operations

* [createDatastoreRecord2](#createdatastorerecord2) - Create a record
* [getDatastoreRecord2](#getdatastorerecord2) - Retrieve a record
* [listDatastoreRecords2](#listdatastorerecords2) - List all records
* [patchDatastoreRecord2](#patchdatastorerecord2) - Update a record
* [removeDatastoreRecord2](#removedatastorerecord2) - Remove a record
* [updateDatastoreRecord2](#updatedatastorerecord2) - Update a record

## createDatastoreRecord2

Create a record

### Example Usage

<!-- UsageSnippet language="java" operationID="createDatastoreRecord2" method="post" path="/datastore/{connection_id}/record" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreRecord2Request;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreRecord2Response;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDatastoreRecord2Request req = CreateDatastoreRecord2Request.builder()
                .datastoreRecord(DatastoreRecord.builder()
                    .fields(Map.ofEntries(
                        Map.entry("key", DatastoreFieldValue.builder()
                            .build())))
                    .build())
                .connectionId("<id>")
                .build();

        CreateDatastoreRecord2Response res = sdk.record().createDatastoreRecord2()
                .request(req)
                .call();

        if (res.datastoreRecord().isPresent()) {
            System.out.println(res.datastoreRecord().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateDatastoreRecord2Request](../../models/operations/CreateDatastoreRecord2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateDatastoreRecord2Response](../../models/operations/CreateDatastoreRecord2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDatastoreRecord2

Retrieve a record

### Example Usage

<!-- UsageSnippet language="java" operationID="getDatastoreRecord2" method="get" path="/datastore/{connection_id}/record/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetDatastoreRecord2Request;
import to.unified.unified_java_sdk.models.operations.GetDatastoreRecord2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetDatastoreRecord2Request req = GetDatastoreRecord2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetDatastoreRecord2Response res = sdk.record().getDatastoreRecord2()
                .request(req)
                .call();

        if (res.datastoreRecord().isPresent()) {
            System.out.println(res.datastoreRecord().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetDatastoreRecord2Request](../../models/operations/GetDatastoreRecord2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetDatastoreRecord2Response](../../models/operations/GetDatastoreRecord2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listDatastoreRecords2

List all records

### Example Usage

<!-- UsageSnippet language="java" operationID="listDatastoreRecords2" method="get" path="/datastore/{connection_id}/record" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListDatastoreRecords2Request;
import to.unified.unified_java_sdk.models.operations.ListDatastoreRecords2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListDatastoreRecords2Request req = ListDatastoreRecords2Request.builder()
                .connectionId("<id>")
                .build();

        ListDatastoreRecords2Response res = sdk.record().listDatastoreRecords2()
                .request(req)
                .call();

        if (res.datastoreRecords().isPresent()) {
            System.out.println(res.datastoreRecords().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListDatastoreRecords2Request](../../models/operations/ListDatastoreRecords2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListDatastoreRecords2Response](../../models/operations/ListDatastoreRecords2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchDatastoreRecord2

Update a record

### Example Usage

<!-- UsageSnippet language="java" operationID="patchDatastoreRecord2" method="patch" path="/datastore/{connection_id}/record/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchDatastoreRecord2Request;
import to.unified.unified_java_sdk.models.operations.PatchDatastoreRecord2Response;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchDatastoreRecord2Request req = PatchDatastoreRecord2Request.builder()
                .datastoreRecord(DatastoreRecord.builder()
                    .fields(Map.ofEntries(
                        Map.entry("key", DatastoreFieldValue.builder()
                            .build())))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDatastoreRecord2Response res = sdk.record().patchDatastoreRecord2()
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
| `request`                                                                               | [PatchDatastoreRecord2Request](../../models/operations/PatchDatastoreRecord2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchDatastoreRecord2Response](../../models/operations/PatchDatastoreRecord2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeDatastoreRecord2

Remove a record

### Example Usage

<!-- UsageSnippet language="java" operationID="removeDatastoreRecord2" method="delete" path="/datastore/{connection_id}/record/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveDatastoreRecord2Request;
import to.unified.unified_java_sdk.models.operations.RemoveDatastoreRecord2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveDatastoreRecord2Request req = RemoveDatastoreRecord2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveDatastoreRecord2Response res = sdk.record().removeDatastoreRecord2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveDatastoreRecord2Request](../../models/operations/RemoveDatastoreRecord2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveDatastoreRecord2Response](../../models/operations/RemoveDatastoreRecord2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateDatastoreRecord2

Update a record

### Example Usage

<!-- UsageSnippet language="java" operationID="updateDatastoreRecord2" method="put" path="/datastore/{connection_id}/record/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateDatastoreRecord2Request;
import to.unified.unified_java_sdk.models.operations.UpdateDatastoreRecord2Response;
import to.unified.unified_java_sdk.models.shared.DatastoreRecord;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateDatastoreRecord2Request req = UpdateDatastoreRecord2Request.builder()
                .datastoreRecord(DatastoreRecord.builder()
                    .fields(Map.ofEntries(
                    ))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDatastoreRecord2Response res = sdk.record().updateDatastoreRecord2()
                .request(req)
                .call();

        if (res.datastoreRecord().isPresent()) {
            System.out.println(res.datastoreRecord().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateDatastoreRecord2Request](../../models/operations/UpdateDatastoreRecord2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateDatastoreRecord2Response](../../models/operations/UpdateDatastoreRecord2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |