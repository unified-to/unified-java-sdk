# Datastore

## Overview

### Available Operations

* [createDatastoreDatabase2](#createdatastoredatabase2) - Create a database
* [createDatastoreQuery2](#createdatastorequery2) - Create a query
* [createDatastoreRecord2](#createdatastorerecord2) - Create a record
* [createDatastoreTable2](#createdatastoretable2) - Create a table
* [getDatastoreDatabase2](#getdatastoredatabase2) - Retrieve a database
* [getDatastoreRecord2](#getdatastorerecord2) - Retrieve a record
* [getDatastoreTable2](#getdatastoretable2) - Retrieve a table
* [listDatastoreDatabases2](#listdatastoredatabases2) - List all databases
* [listDatastoreRecords2](#listdatastorerecords2) - List all records
* [listDatastoreTables2](#listdatastoretables2) - List all tables
* [patchDatastoreDatabase2](#patchdatastoredatabase2) - Update a database
* [patchDatastoreRecord2](#patchdatastorerecord2) - Update a record
* [patchDatastoreTable2](#patchdatastoretable2) - Update a table
* [removeDatastoreDatabase2](#removedatastoredatabase2) - Remove a database
* [removeDatastoreRecord2](#removedatastorerecord2) - Remove a record
* [removeDatastoreTable2](#removedatastoretable2) - Remove a table
* [updateDatastoreDatabase2](#updatedatastoredatabase2) - Update a database
* [updateDatastoreRecord2](#updatedatastorerecord2) - Update a record
* [updateDatastoreTable2](#updatedatastoretable2) - Update a table

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

        CreateDatastoreDatabase2Response res = sdk.datastore().createDatastoreDatabase2()
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

## createDatastoreQuery2

Create a query

### Example Usage

<!-- UsageSnippet language="java" operationID="createDatastoreQuery2" method="post" path="/datastore/{connection_id}/query" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreQuery2Request;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreQuery2Response;
import to.unified.unified_java_sdk.models.shared.DatastoreQuery;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDatastoreQuery2Request req = CreateDatastoreQuery2Request.builder()
                .datastoreQuery(DatastoreQuery.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateDatastoreQuery2Response res = sdk.datastore().createDatastoreQuery2()
                .request(req)
                .call();

        if (res.datastoreQuery().isPresent()) {
            System.out.println(res.datastoreQuery().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateDatastoreQuery2Request](../../models/operations/CreateDatastoreQuery2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateDatastoreQuery2Response](../../models/operations/CreateDatastoreQuery2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateDatastoreRecord2Response res = sdk.datastore().createDatastoreRecord2()
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

        CreateDatastoreTable2Response res = sdk.datastore().createDatastoreTable2()
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

        GetDatastoreDatabase2Response res = sdk.datastore().getDatastoreDatabase2()
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

        GetDatastoreRecord2Response res = sdk.datastore().getDatastoreRecord2()
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

        GetDatastoreTable2Response res = sdk.datastore().getDatastoreTable2()
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

        ListDatastoreDatabases2Response res = sdk.datastore().listDatastoreDatabases2()
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

        ListDatastoreRecords2Response res = sdk.datastore().listDatastoreRecords2()
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

        ListDatastoreTables2Response res = sdk.datastore().listDatastoreTables2()
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

        PatchDatastoreDatabase2Response res = sdk.datastore().patchDatastoreDatabase2()
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

        PatchDatastoreRecord2Response res = sdk.datastore().patchDatastoreRecord2()
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

        PatchDatastoreTable2Response res = sdk.datastore().patchDatastoreTable2()
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

        RemoveDatastoreDatabase2Response res = sdk.datastore().removeDatastoreDatabase2()
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

        RemoveDatastoreRecord2Response res = sdk.datastore().removeDatastoreRecord2()
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

        RemoveDatastoreTable2Response res = sdk.datastore().removeDatastoreTable2()
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

        UpdateDatastoreDatabase2Response res = sdk.datastore().updateDatastoreDatabase2()
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

        UpdateDatastoreRecord2Response res = sdk.datastore().updateDatastoreRecord2()
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

        UpdateDatastoreTable2Response res = sdk.datastore().updateDatastoreTable2()
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