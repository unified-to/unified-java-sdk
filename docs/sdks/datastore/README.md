# Datastore

## Overview

### Available Operations

* [createDatastoreDatabase](#createdatastoredatabase) - Create a database
* [createDatastoreQuery](#createdatastorequery) - Create a query
* [createDatastoreRecord](#createdatastorerecord) - Create a record
* [createDatastoreTable](#createdatastoretable) - Create a table
* [getDatastoreDatabase](#getdatastoredatabase) - Retrieve a database
* [getDatastoreRecord](#getdatastorerecord) - Retrieve a record
* [getDatastoreTable](#getdatastoretable) - Retrieve a table
* [listDatastoreDatabases](#listdatastoredatabases) - List all databases
* [listDatastoreRecords](#listdatastorerecords) - List all records
* [listDatastoreTables](#listdatastoretables) - List all tables
* [patchDatastoreDatabase](#patchdatastoredatabase) - Update a database
* [patchDatastoreRecord](#patchdatastorerecord) - Update a record
* [patchDatastoreTable](#patchdatastoretable) - Update a table
* [removeDatastoreDatabase](#removedatastoredatabase) - Remove a database
* [removeDatastoreRecord](#removedatastorerecord) - Remove a record
* [removeDatastoreTable](#removedatastoretable) - Remove a table
* [updateDatastoreDatabase](#updatedatastoredatabase) - Update a database
* [updateDatastoreRecord](#updatedatastorerecord) - Update a record
* [updateDatastoreTable](#updatedatastoretable) - Update a table

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

        CreateDatastoreDatabaseResponse res = sdk.datastore().createDatastoreDatabase()
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

## createDatastoreQuery

Create a query

### Example Usage

<!-- UsageSnippet language="java" operationID="createDatastoreQuery" method="post" path="/datastore/{connection_id}/query" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreQueryRequest;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreQueryResponse;
import to.unified.unified_java_sdk.models.shared.DatastoreQuery;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDatastoreQueryRequest req = CreateDatastoreQueryRequest.builder()
                .datastoreQuery(DatastoreQuery.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateDatastoreQueryResponse res = sdk.datastore().createDatastoreQuery()
                .request(req)
                .call();

        if (res.datastoreQuery().isPresent()) {
            System.out.println(res.datastoreQuery().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateDatastoreQueryRequest](../../models/operations/CreateDatastoreQueryRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateDatastoreQueryResponse](../../models/operations/CreateDatastoreQueryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createDatastoreRecord

Create a record

### Example Usage

<!-- UsageSnippet language="java" operationID="createDatastoreRecord" method="post" path="/datastore/{connection_id}/record" -->
```java
package hello.world;

import java.lang.Exception;
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
                    .build())
                .connectionId("<id>")
                .build();

        CreateDatastoreRecordResponse res = sdk.datastore().createDatastoreRecord()
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

## createDatastoreTable

Create a table

### Example Usage

<!-- UsageSnippet language="java" operationID="createDatastoreTable" method="post" path="/datastore/{connection_id}/table" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreTableRequest;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreTableResponse;
import to.unified.unified_java_sdk.models.shared.DatastoreTable;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDatastoreTableRequest req = CreateDatastoreTableRequest.builder()
                .datastoreTable(DatastoreTable.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateDatastoreTableResponse res = sdk.datastore().createDatastoreTable()
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
| `request`                                                                             | [CreateDatastoreTableRequest](../../models/operations/CreateDatastoreTableRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateDatastoreTableResponse](../../models/operations/CreateDatastoreTableResponse.md)**

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

        GetDatastoreDatabaseResponse res = sdk.datastore().getDatastoreDatabase()
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

## getDatastoreRecord

Retrieve a record

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

        GetDatastoreRecordResponse res = sdk.datastore().getDatastoreRecord()
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

## getDatastoreTable

Retrieve a table

### Example Usage

<!-- UsageSnippet language="java" operationID="getDatastoreTable" method="get" path="/datastore/{connection_id}/table/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetDatastoreTableRequest;
import to.unified.unified_java_sdk.models.operations.GetDatastoreTableResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetDatastoreTableRequest req = GetDatastoreTableRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetDatastoreTableResponse res = sdk.datastore().getDatastoreTable()
                .request(req)
                .call();

        if (res.datastoreTable().isPresent()) {
            System.out.println(res.datastoreTable().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetDatastoreTableRequest](../../models/operations/GetDatastoreTableRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetDatastoreTableResponse](../../models/operations/GetDatastoreTableResponse.md)**

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

        ListDatastoreDatabasesResponse res = sdk.datastore().listDatastoreDatabases()
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

## listDatastoreRecords

List all records

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

        ListDatastoreRecordsResponse res = sdk.datastore().listDatastoreRecords()
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

## listDatastoreTables

List all tables

### Example Usage

<!-- UsageSnippet language="java" operationID="listDatastoreTables" method="get" path="/datastore/{connection_id}/table" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListDatastoreTablesRequest;
import to.unified.unified_java_sdk.models.operations.ListDatastoreTablesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListDatastoreTablesRequest req = ListDatastoreTablesRequest.builder()
                .connectionId("<id>")
                .build();

        ListDatastoreTablesResponse res = sdk.datastore().listDatastoreTables()
                .request(req)
                .call();

        if (res.datastoreTables().isPresent()) {
            System.out.println(res.datastoreTables().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListDatastoreTablesRequest](../../models/operations/ListDatastoreTablesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListDatastoreTablesResponse](../../models/operations/ListDatastoreTablesResponse.md)**

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

        PatchDatastoreDatabaseResponse res = sdk.datastore().patchDatastoreDatabase()
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

## patchDatastoreRecord

Update a record

### Example Usage

<!-- UsageSnippet language="java" operationID="patchDatastoreRecord" method="patch" path="/datastore/{connection_id}/record/{id}" -->
```java
package hello.world;

import java.lang.Exception;
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
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDatastoreRecordResponse res = sdk.datastore().patchDatastoreRecord()
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

## patchDatastoreTable

Update a table

### Example Usage

<!-- UsageSnippet language="java" operationID="patchDatastoreTable" method="patch" path="/datastore/{connection_id}/table/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchDatastoreTableRequest;
import to.unified.unified_java_sdk.models.operations.PatchDatastoreTableResponse;
import to.unified.unified_java_sdk.models.shared.DatastoreTable;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchDatastoreTableRequest req = PatchDatastoreTableRequest.builder()
                .datastoreTable(DatastoreTable.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDatastoreTableResponse res = sdk.datastore().patchDatastoreTable()
                .request(req)
                .call();

        if (res.datastoreTable().isPresent()) {
            System.out.println(res.datastoreTable().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchDatastoreTableRequest](../../models/operations/PatchDatastoreTableRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchDatastoreTableResponse](../../models/operations/PatchDatastoreTableResponse.md)**

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

        RemoveDatastoreDatabaseResponse res = sdk.datastore().removeDatastoreDatabase()
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

## removeDatastoreRecord

Remove a record

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

        RemoveDatastoreRecordResponse res = sdk.datastore().removeDatastoreRecord()
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

## removeDatastoreTable

Remove a table

### Example Usage

<!-- UsageSnippet language="java" operationID="removeDatastoreTable" method="delete" path="/datastore/{connection_id}/table/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveDatastoreTableRequest;
import to.unified.unified_java_sdk.models.operations.RemoveDatastoreTableResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveDatastoreTableRequest req = RemoveDatastoreTableRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveDatastoreTableResponse res = sdk.datastore().removeDatastoreTable()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveDatastoreTableRequest](../../models/operations/RemoveDatastoreTableRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveDatastoreTableResponse](../../models/operations/RemoveDatastoreTableResponse.md)**

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

        UpdateDatastoreDatabaseResponse res = sdk.datastore().updateDatastoreDatabase()
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

## updateDatastoreRecord

Update a record

### Example Usage

<!-- UsageSnippet language="java" operationID="updateDatastoreRecord" method="put" path="/datastore/{connection_id}/record/{id}" -->
```java
package hello.world;

import java.lang.Exception;
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
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDatastoreRecordResponse res = sdk.datastore().updateDatastoreRecord()
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

## updateDatastoreTable

Update a table

### Example Usage

<!-- UsageSnippet language="java" operationID="updateDatastoreTable" method="put" path="/datastore/{connection_id}/table/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateDatastoreTableRequest;
import to.unified.unified_java_sdk.models.operations.UpdateDatastoreTableResponse;
import to.unified.unified_java_sdk.models.shared.DatastoreTable;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateDatastoreTableRequest req = UpdateDatastoreTableRequest.builder()
                .datastoreTable(DatastoreTable.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDatastoreTableResponse res = sdk.datastore().updateDatastoreTable()
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
| `request`                                                                             | [UpdateDatastoreTableRequest](../../models/operations/UpdateDatastoreTableRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateDatastoreTableResponse](../../models/operations/UpdateDatastoreTableResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |