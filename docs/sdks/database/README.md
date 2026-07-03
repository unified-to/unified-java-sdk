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

Create a database

### Example Usage

<!-- UsageSnippet language="java" operationID="createDatastoreDatabase" method="post" path="/datastore/{connection_id}/database" -->
```java
package hello.world;

import java.lang.Exception;
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

Retrieve a database

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

List all databases

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

Update a database

### Example Usage

<!-- UsageSnippet language="java" operationID="patchDatastoreDatabase" method="patch" path="/datastore/{connection_id}/database/{id}" -->
```java
package hello.world;

import java.lang.Exception;
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

Remove a database

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

Update a database

### Example Usage

<!-- UsageSnippet language="java" operationID="updateDatastoreDatabase" method="put" path="/datastore/{connection_id}/database/{id}" -->
```java
package hello.world;

import java.lang.Exception;
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