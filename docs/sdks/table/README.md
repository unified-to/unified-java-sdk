# Table

## Overview

### Available Operations

* [createDatastoreTable2](#createdatastoretable2) - Create a table
* [getDatastoreTable2](#getdatastoretable2) - Retrieve a table
* [listDatastoreTables2](#listdatastoretables2) - List all tables
* [patchDatastoreTable2](#patchdatastoretable2) - Update a table
* [removeDatastoreTable2](#removedatastoretable2) - Remove a table
* [updateDatastoreTable2](#updatedatastoretable2) - Update a table

## createDatastoreTable2

Create a table

### Example Usage

<!-- UsageSnippet language="java" operationID="createDatastoreTable2" method="post" path="/datastore/{connection_id}/table" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreTable2Request;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreTable2Response;
import to.unified.unified_java_sdk.models.shared.DatastoreTable;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDatastoreTable2Request req = CreateDatastoreTable2Request.builder()
                .datastoreTable(DatastoreTable.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateDatastoreTable2Response res = sdk.table().createDatastoreTable2()
                .request(req)
                .call();

        if (res.datastoreTable().isPresent()) {
            System.out.println(res.datastoreTable().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateDatastoreTable2Request](../../models/operations/CreateDatastoreTable2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateDatastoreTable2Response](../../models/operations/CreateDatastoreTable2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDatastoreTable2

Retrieve a table

### Example Usage

<!-- UsageSnippet language="java" operationID="getDatastoreTable2" method="get" path="/datastore/{connection_id}/table/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetDatastoreTable2Request;
import to.unified.unified_java_sdk.models.operations.GetDatastoreTable2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetDatastoreTable2Request req = GetDatastoreTable2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetDatastoreTable2Response res = sdk.table().getDatastoreTable2()
                .request(req)
                .call();

        if (res.datastoreTable().isPresent()) {
            System.out.println(res.datastoreTable().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetDatastoreTable2Request](../../models/operations/GetDatastoreTable2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetDatastoreTable2Response](../../models/operations/GetDatastoreTable2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listDatastoreTables2

List all tables

### Example Usage

<!-- UsageSnippet language="java" operationID="listDatastoreTables2" method="get" path="/datastore/{connection_id}/table" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListDatastoreTables2Request;
import to.unified.unified_java_sdk.models.operations.ListDatastoreTables2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListDatastoreTables2Request req = ListDatastoreTables2Request.builder()
                .connectionId("<id>")
                .build();

        ListDatastoreTables2Response res = sdk.table().listDatastoreTables2()
                .request(req)
                .call();

        if (res.datastoreTables().isPresent()) {
            System.out.println(res.datastoreTables().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListDatastoreTables2Request](../../models/operations/ListDatastoreTables2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListDatastoreTables2Response](../../models/operations/ListDatastoreTables2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchDatastoreTable2

Update a table

### Example Usage

<!-- UsageSnippet language="java" operationID="patchDatastoreTable2" method="patch" path="/datastore/{connection_id}/table/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchDatastoreTable2Request;
import to.unified.unified_java_sdk.models.operations.PatchDatastoreTable2Response;
import to.unified.unified_java_sdk.models.shared.DatastoreTable;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchDatastoreTable2Request req = PatchDatastoreTable2Request.builder()
                .datastoreTable(DatastoreTable.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDatastoreTable2Response res = sdk.table().patchDatastoreTable2()
                .request(req)
                .call();

        if (res.datastoreTable().isPresent()) {
            System.out.println(res.datastoreTable().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchDatastoreTable2Request](../../models/operations/PatchDatastoreTable2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchDatastoreTable2Response](../../models/operations/PatchDatastoreTable2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeDatastoreTable2

Remove a table

### Example Usage

<!-- UsageSnippet language="java" operationID="removeDatastoreTable2" method="delete" path="/datastore/{connection_id}/table/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveDatastoreTable2Request;
import to.unified.unified_java_sdk.models.operations.RemoveDatastoreTable2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveDatastoreTable2Request req = RemoveDatastoreTable2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveDatastoreTable2Response res = sdk.table().removeDatastoreTable2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveDatastoreTable2Request](../../models/operations/RemoveDatastoreTable2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveDatastoreTable2Response](../../models/operations/RemoveDatastoreTable2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateDatastoreTable2

Update a table

### Example Usage

<!-- UsageSnippet language="java" operationID="updateDatastoreTable2" method="put" path="/datastore/{connection_id}/table/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateDatastoreTable2Request;
import to.unified.unified_java_sdk.models.operations.UpdateDatastoreTable2Response;
import to.unified.unified_java_sdk.models.shared.DatastoreTable;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateDatastoreTable2Request req = UpdateDatastoreTable2Request.builder()
                .datastoreTable(DatastoreTable.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDatastoreTable2Response res = sdk.table().updateDatastoreTable2()
                .request(req)
                .call();

        if (res.datastoreTable().isPresent()) {
            System.out.println(res.datastoreTable().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateDatastoreTable2Request](../../models/operations/UpdateDatastoreTable2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateDatastoreTable2Response](../../models/operations/UpdateDatastoreTable2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |