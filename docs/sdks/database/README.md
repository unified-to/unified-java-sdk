# Database

## Overview

### Available Operations

* [createDatastoreDatabase](#createdatastoredatabase) - Create a database
* [getDatastoreDatabase](#getdatastoredatabase) - Retrieve a database
* [listDatastoreDatabases](#listdatastoredatabases) - List all databases
* [patchDatastoreDatabase](#patchdatastoredatabase) - Update a database
* [removeDatastoreDatabase](#removedatastoredatabase) - Remove a database
* [updateDatastoreDatabase](#updatedatastoredatabase) - Update a database

## createDatastoreDatabase

Creates a DatastoreDatabase. Provide the unified DatastoreDatabase fields in the request body; they are mapped to the provider's API. Returns the created DatastoreDatabase.

### Example Usage

<!-- UsageSnippet language="java" operationID="createDatastoreDatabase" method="post" path="/datastore/{connection_id}/database" example="datastore_database" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreDatabaseRequest;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreDatabaseResponse;
import to.unified.unified_java_sdk.models.shared.DatastoreDatabase;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDatastoreDatabaseRequest req = CreateDatastoreDatabaseRequest.builder()
                .datastoreDatabase(DatastoreDatabase.builder()
                    .createdAt(OffsetDateTime.parse("2019-03-05T14:31:00.223Z"))
                    .description("Substantia tantillus coniuratio repellat coerceo amet vito vorago.")
                    .id("66104cef-86f9-4b64-9551-666f77ecc1a1")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Rau - O'Reilly")
                    .password("iYLhYwOHm0NLDvI")
                    .region("France")
                    .updatedAt(OffsetDateTime.parse("2023-07-04T19:24:55.896Z"))
                    .webUrl("https://optimal-signature.name")
                    .build())
                .connectionId("<id>")
                .build();

        CreateDatastoreDatabaseResponse res = sdk.database().createDatastoreDatabase()
                .request(req)
                .call();

        if (res.datastoreDatabase().isPresent()) {
            System.out.println(res.datastoreDatabase().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateDatastoreDatabaseRequest](../../models/operations/CreateDatastoreDatabaseRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateDatastoreDatabaseResponse](../../models/operations/CreateDatastoreDatabaseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDatastoreDatabase

Retrieves a single DatastoreDatabase by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getDatastoreDatabase" method="get" path="/datastore/{connection_id}/database/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetDatastoreDatabaseRequest;
import to.unified.unified_java_sdk.models.operations.GetDatastoreDatabaseResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetDatastoreDatabaseRequest req = GetDatastoreDatabaseRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetDatastoreDatabaseResponse res = sdk.database().getDatastoreDatabase()
                .request(req)
                .call();

        if (res.datastoreDatabase().isPresent()) {
            System.out.println(res.datastoreDatabase().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetDatastoreDatabaseRequest](../../models/operations/GetDatastoreDatabaseRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetDatastoreDatabaseResponse](../../models/operations/GetDatastoreDatabaseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listDatastoreDatabases

Returns a list of DatastoreDatabases. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listDatastoreDatabases" method="get" path="/datastore/{connection_id}/database" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListDatastoreDatabasesRequest;
import to.unified.unified_java_sdk.models.operations.ListDatastoreDatabasesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListDatastoreDatabasesRequest req = ListDatastoreDatabasesRequest.builder()
                .connectionId("<id>")
                .build();

        ListDatastoreDatabasesResponse res = sdk.database().listDatastoreDatabases()
                .request(req)
                .call();

        if (res.datastoreDatabases().isPresent()) {
            System.out.println(res.datastoreDatabases().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListDatastoreDatabasesRequest](../../models/operations/ListDatastoreDatabasesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListDatastoreDatabasesResponse](../../models/operations/ListDatastoreDatabasesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchDatastoreDatabase

Updates the DatastoreDatabase identified by `id`. Provide the unified DatastoreDatabase fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchDatastoreDatabase" method="patch" path="/datastore/{connection_id}/database/{id}" example="datastore_database" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchDatastoreDatabaseRequest;
import to.unified.unified_java_sdk.models.operations.PatchDatastoreDatabaseResponse;
import to.unified.unified_java_sdk.models.shared.DatastoreDatabase;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchDatastoreDatabaseRequest req = PatchDatastoreDatabaseRequest.builder()
                .datastoreDatabase(DatastoreDatabase.builder()
                    .createdAt(OffsetDateTime.parse("2019-03-05T14:31:00.223Z"))
                    .description("Substantia tantillus coniuratio repellat coerceo amet vito vorago.")
                    .id("0e21be44-0694-49cb-95b3-ee8f76f4260e")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Rau - O'Reilly")
                    .password("iYLhYwOHm0NLDvI")
                    .region("France")
                    .updatedAt(OffsetDateTime.parse("2023-07-04T19:24:55.904Z"))
                    .webUrl("https://optimal-signature.name")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDatastoreDatabaseResponse res = sdk.database().patchDatastoreDatabase()
                .request(req)
                .call();

        if (res.datastoreDatabase().isPresent()) {
            System.out.println(res.datastoreDatabase().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchDatastoreDatabaseRequest](../../models/operations/PatchDatastoreDatabaseRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchDatastoreDatabaseResponse](../../models/operations/PatchDatastoreDatabaseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeDatastoreDatabase

Deletes the DatastoreDatabase identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeDatastoreDatabase" method="delete" path="/datastore/{connection_id}/database/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveDatastoreDatabaseRequest;
import to.unified.unified_java_sdk.models.operations.RemoveDatastoreDatabaseResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveDatastoreDatabaseRequest req = RemoveDatastoreDatabaseRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveDatastoreDatabaseResponse res = sdk.database().removeDatastoreDatabase()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveDatastoreDatabaseRequest](../../models/operations/RemoveDatastoreDatabaseRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveDatastoreDatabaseResponse](../../models/operations/RemoveDatastoreDatabaseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateDatastoreDatabase

Updates the DatastoreDatabase identified by `id`. Provide the unified DatastoreDatabase fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateDatastoreDatabase" method="put" path="/datastore/{connection_id}/database/{id}" example="datastore_database" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateDatastoreDatabaseRequest;
import to.unified.unified_java_sdk.models.operations.UpdateDatastoreDatabaseResponse;
import to.unified.unified_java_sdk.models.shared.DatastoreDatabase;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateDatastoreDatabaseRequest req = UpdateDatastoreDatabaseRequest.builder()
                .datastoreDatabase(DatastoreDatabase.builder()
                    .createdAt(OffsetDateTime.parse("2019-03-05T14:31:00.223Z"))
                    .description("Substantia tantillus coniuratio repellat coerceo amet vito vorago.")
                    .id("0e21be44-0694-49cb-95b3-ee8f76f4260e")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Rau - O'Reilly")
                    .password("iYLhYwOHm0NLDvI")
                    .region("France")
                    .updatedAt(OffsetDateTime.parse("2023-07-04T19:24:55.904Z"))
                    .webUrl("https://optimal-signature.name")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDatastoreDatabaseResponse res = sdk.database().updateDatastoreDatabase()
                .request(req)
                .call();

        if (res.datastoreDatabase().isPresent()) {
            System.out.println(res.datastoreDatabase().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateDatastoreDatabaseRequest](../../models/operations/UpdateDatastoreDatabaseRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateDatastoreDatabaseResponse](../../models/operations/UpdateDatastoreDatabaseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |