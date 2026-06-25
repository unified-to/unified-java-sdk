# Database

## Overview

### Available Operations

* [createDatastoreDatabase2](#createdatastoredatabase2) - Create a database
* [getDatastoreDatabase2](#getdatastoredatabase2) - Retrieve a database
* [listDatastoreDatabases2](#listdatastoredatabases2) - List all databases
* [patchDatastoreDatabase2](#patchdatastoredatabase2) - Update a database
* [removeDatastoreDatabase2](#removedatastoredatabase2) - Remove a database
* [updateDatastoreDatabase2](#updatedatastoredatabase2) - Update a database

## createDatastoreDatabase2

Create a database

### Example Usage

<!-- UsageSnippet language="java" operationID="createDatastoreDatabase2" method="post" path="/datastore/{connection_id}/database" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreDatabase2Request;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreDatabase2Response;
import to.unified.unified_java_sdk.models.shared.DatastoreDatabase;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDatastoreDatabase2Request req = CreateDatastoreDatabase2Request.builder()
                .datastoreDatabase(DatastoreDatabase.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateDatastoreDatabase2Response res = sdk.database().createDatastoreDatabase2()
                .request(req)
                .call();

        if (res.datastoreDatabase().isPresent()) {
            System.out.println(res.datastoreDatabase().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateDatastoreDatabase2Request](../../models/operations/CreateDatastoreDatabase2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateDatastoreDatabase2Response](../../models/operations/CreateDatastoreDatabase2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDatastoreDatabase2

Retrieve a database

### Example Usage

<!-- UsageSnippet language="java" operationID="getDatastoreDatabase2" method="get" path="/datastore/{connection_id}/database/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetDatastoreDatabase2Request;
import to.unified.unified_java_sdk.models.operations.GetDatastoreDatabase2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetDatastoreDatabase2Request req = GetDatastoreDatabase2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetDatastoreDatabase2Response res = sdk.database().getDatastoreDatabase2()
                .request(req)
                .call();

        if (res.datastoreDatabase().isPresent()) {
            System.out.println(res.datastoreDatabase().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetDatastoreDatabase2Request](../../models/operations/GetDatastoreDatabase2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetDatastoreDatabase2Response](../../models/operations/GetDatastoreDatabase2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listDatastoreDatabases2

List all databases

### Example Usage

<!-- UsageSnippet language="java" operationID="listDatastoreDatabases2" method="get" path="/datastore/{connection_id}/database" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListDatastoreDatabases2Request;
import to.unified.unified_java_sdk.models.operations.ListDatastoreDatabases2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListDatastoreDatabases2Request req = ListDatastoreDatabases2Request.builder()
                .connectionId("<id>")
                .build();

        ListDatastoreDatabases2Response res = sdk.database().listDatastoreDatabases2()
                .request(req)
                .call();

        if (res.datastoreDatabases().isPresent()) {
            System.out.println(res.datastoreDatabases().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListDatastoreDatabases2Request](../../models/operations/ListDatastoreDatabases2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListDatastoreDatabases2Response](../../models/operations/ListDatastoreDatabases2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchDatastoreDatabase2

Update a database

### Example Usage

<!-- UsageSnippet language="java" operationID="patchDatastoreDatabase2" method="patch" path="/datastore/{connection_id}/database/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchDatastoreDatabase2Request;
import to.unified.unified_java_sdk.models.operations.PatchDatastoreDatabase2Response;
import to.unified.unified_java_sdk.models.shared.DatastoreDatabase;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchDatastoreDatabase2Request req = PatchDatastoreDatabase2Request.builder()
                .datastoreDatabase(DatastoreDatabase.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDatastoreDatabase2Response res = sdk.database().patchDatastoreDatabase2()
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
| `request`                                                                                   | [PatchDatastoreDatabase2Request](../../models/operations/PatchDatastoreDatabase2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchDatastoreDatabase2Response](../../models/operations/PatchDatastoreDatabase2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeDatastoreDatabase2

Remove a database

### Example Usage

<!-- UsageSnippet language="java" operationID="removeDatastoreDatabase2" method="delete" path="/datastore/{connection_id}/database/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveDatastoreDatabase2Request;
import to.unified.unified_java_sdk.models.operations.RemoveDatastoreDatabase2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveDatastoreDatabase2Request req = RemoveDatastoreDatabase2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveDatastoreDatabase2Response res = sdk.database().removeDatastoreDatabase2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveDatastoreDatabase2Request](../../models/operations/RemoveDatastoreDatabase2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveDatastoreDatabase2Response](../../models/operations/RemoveDatastoreDatabase2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateDatastoreDatabase2

Update a database

### Example Usage

<!-- UsageSnippet language="java" operationID="updateDatastoreDatabase2" method="put" path="/datastore/{connection_id}/database/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateDatastoreDatabase2Request;
import to.unified.unified_java_sdk.models.operations.UpdateDatastoreDatabase2Response;
import to.unified.unified_java_sdk.models.shared.DatastoreDatabase;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateDatastoreDatabase2Request req = UpdateDatastoreDatabase2Request.builder()
                .datastoreDatabase(DatastoreDatabase.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDatastoreDatabase2Response res = sdk.database().updateDatastoreDatabase2()
                .request(req)
                .call();

        if (res.datastoreDatabase().isPresent()) {
            System.out.println(res.datastoreDatabase().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateDatastoreDatabase2Request](../../models/operations/UpdateDatastoreDatabase2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateDatastoreDatabase2Response](../../models/operations/UpdateDatastoreDatabase2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |