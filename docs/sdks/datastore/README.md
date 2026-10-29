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
                    .id("28620b4e-b554-49d2-900f-699f80df170b")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Rau - O'Reilly")
                    .password("iYLhYwOHm0NLDvI")
                    .region("France")
                    .updatedAt(OffsetDateTime.parse("2023-07-05T03:57:09.511Z"))
                    .webUrl("https://optimal-signature.name")
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

Creates a DatastoreQuery. Provide the unified DatastoreQuery fields in the request body; they are mapped to the provider's API. Returns the created DatastoreQuery.

### Example Usage

<!-- UsageSnippet language="java" operationID="createDatastoreQuery" method="post" path="/datastore/{connection_id}/query" example="datastore_query" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreQueryRequest;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreQueryResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDatastoreQueryRequest req = CreateDatastoreQueryRequest.builder()
                .datastoreQuery(DatastoreQuery.builder()
                    .metadata(List.of())
                    .query(PropertyDatastoreQueryQuery.builder()
                        .filter(PropertyDatastoreQueryQueryFilter.builder()
                            .type(PropertyDatastoreQueryQueryFilterType.OR)
                            .build())
                        .select(List.of(
                            "*"))
                        .sql("")
                        .build())
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
                    .id("40512bfb-a1a5-4019-b7d8-0cb0d317a51f")
                    .metadata(List.of())
                    .rowNumber(33d)
                    .updatedAt(OffsetDateTime.parse("2025-03-09T21:05:45.822Z"))
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

Creates a DatastoreTable. Provide the unified DatastoreTable fields in the request body; they are mapped to the provider's API. Returns the created DatastoreTable.

### Example Usage

<!-- UsageSnippet language="java" operationID="createDatastoreTable" method="post" path="/datastore/{connection_id}/table" example="datastore_table" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreTableRequest;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreTableResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDatastoreTableRequest req = CreateDatastoreTableRequest.builder()
                .datastoreTable(DatastoreTable.builder()
                    .createdAt(OffsetDateTime.parse("2022-05-22T04:49:00.762Z"))
                    .description("Quasi adhuc paulatim ducimus carpo vomito magni tantum tubineus corona.")
                    .fields(List.of(
                        DatastoreField.builder()
                            .name("Ferry LLC")
                            .originalType("conservo")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Antea soluta itaque clamo despecto basium accendo.")
                            .id("7af63e36-97e5-49ce-95f9-cad41c41dfc4")
                            .isIndexed(true)
                            .isUnique(true)
                            .scale(64d)
                            .build(),
                        DatastoreField.builder()
                            .name("Hand - Nader")
                            .originalType("conservo")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Nulla cattus aequus sumo neque alter cauda subseco.")
                            .id("759598a5-cd56-46ad-be9c-bdb80ac66f00")
                            .isNullable(true)
                            .isUnique(true)
                            .precision(57d)
                            .build(),
                        DatastoreField.builder()
                            .name("Toy - Kiehn")
                            .originalType("sursum")
                            .type(DatastoreFieldType.NUMBER)
                            .description("Utilis callide adhuc verumtamen doloremque ceno sui sint.")
                            .id("e0f864bd-863e-4b51-8231-4efcee34749b")
                            .isIndexed(true)
                            .isNullable(true)
                            .isUnique(true)
                            .maxLength(62d)
                            .precision(47d)
                            .build(),
                        DatastoreField.builder()
                            .name("Gislason, Gorczany and Hegmann")
                            .originalType("tego")
                            .type(DatastoreFieldType.RELATION)
                            .description("Audax articulus triumphus tametsi cura tenetur colligo arcesso bestia.")
                            .id("2eabefed-e95d-4da5-aa7b-954f340f10e2")
                            .precision(94d)
                            .scale(24d)
                            .build(),
                        DatastoreField.builder()
                            .name("Graham, Steuber and Kshlerin")
                            .originalType("defessus")
                            .type(DatastoreFieldType.EMAIL)
                            .description("Communis coma cura audio aduro acer canis expedita.")
                            .id("6f478c9a-2abf-4bfa-ba59-b015af1bd52b")
                            .isIndexed(true)
                            .isPrimaryKey(true)
                            .isRequired(true)
                            .scale(68d)
                            .build()))
                    .id("fc52183e-4b8b-43da-aec1-aac45ed7fc13")
                    .metadata(List.of())
                    .name("Rogahn, Lowe and Heller")
                    .relationships(List.of(
                        DatastoreRelationship.builder()
                            .field("Macejkovic - Shields")
                            .name("Hyatt, Ryan and Nienow")
                            .tableId("fc52183e-4b8b-43da-aec1-aac45ed7fc13")
                            .type(DatastoreRelationshipType.MANY)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-08-13T05:51:10.458Z"))
                    .webUrl("https://nervous-deck.com")
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

Retrieves a single DatastoreTable by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Returns a list of DatastoreTables. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
                    .id("558bcd2c-195a-44e1-9f99-72fc15b09ea5")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Rau - O'Reilly")
                    .password("iYLhYwOHm0NLDvI")
                    .region("France")
                    .updatedAt(OffsetDateTime.parse("2023-07-05T03:57:09.519Z"))
                    .webUrl("https://optimal-signature.name")
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
                    .id("17d9b4d9-0ec4-47fd-a943-2caf51147698")
                    .metadata(List.of())
                    .rowNumber(33d)
                    .updatedAt(OffsetDateTime.parse("2025-03-09T21:05:45.832Z"))
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

Updates the DatastoreTable identified by `id`. Provide the unified DatastoreTable fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchDatastoreTable" method="patch" path="/datastore/{connection_id}/table/{id}" example="datastore_table" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchDatastoreTableRequest;
import to.unified.unified_java_sdk.models.operations.PatchDatastoreTableResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchDatastoreTableRequest req = PatchDatastoreTableRequest.builder()
                .datastoreTable(DatastoreTable.builder()
                    .createdAt(OffsetDateTime.parse("2022-05-22T04:49:00.762Z"))
                    .description("Quasi adhuc paulatim ducimus carpo vomito magni tantum tubineus corona.")
                    .fields(List.of(
                        DatastoreField.builder()
                            .name("Ferry LLC")
                            .originalType("conservo")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Antea soluta itaque clamo despecto basium accendo.")
                            .id("2d0d8cd7-67b6-4b37-99e5-ca1d46fb773d")
                            .isIndexed(true)
                            .isUnique(true)
                            .scale(64d)
                            .build(),
                        DatastoreField.builder()
                            .name("Hand - Nader")
                            .originalType("conservo")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Nulla cattus aequus sumo neque alter cauda subseco.")
                            .id("39288ca3-bc2b-4a95-8cc9-30fba2207c46")
                            .isNullable(true)
                            .isUnique(true)
                            .precision(57d)
                            .build(),
                        DatastoreField.builder()
                            .name("Toy - Kiehn")
                            .originalType("sursum")
                            .type(DatastoreFieldType.NUMBER)
                            .description("Utilis callide adhuc verumtamen doloremque ceno sui sint.")
                            .id("4283ef2e-2109-483e-a6b6-f92920b2610f")
                            .isIndexed(true)
                            .isNullable(true)
                            .isUnique(true)
                            .maxLength(62d)
                            .precision(47d)
                            .build(),
                        DatastoreField.builder()
                            .name("Gislason, Gorczany and Hegmann")
                            .originalType("tego")
                            .type(DatastoreFieldType.RELATION)
                            .description("Audax articulus triumphus tametsi cura tenetur colligo arcesso bestia.")
                            .id("858ee55d-cc04-4813-a2ec-7b18d298a720")
                            .precision(94d)
                            .scale(24d)
                            .build(),
                        DatastoreField.builder()
                            .name("Graham, Steuber and Kshlerin")
                            .originalType("defessus")
                            .type(DatastoreFieldType.EMAIL)
                            .description("Communis coma cura audio aduro acer canis expedita.")
                            .id("25f05289-8522-457c-b967-26a180d51fd2")
                            .isIndexed(true)
                            .isPrimaryKey(true)
                            .isRequired(true)
                            .scale(68d)
                            .build()))
                    .id("a3ed0b49-d7d5-46f1-bc7b-d4acb41958f7")
                    .metadata(List.of())
                    .name("Rogahn, Lowe and Heller")
                    .relationships(List.of(
                        DatastoreRelationship.builder()
                            .field("Macejkovic - Shields")
                            .name("Hyatt, Ryan and Nienow")
                            .tableId("a3ed0b49-d7d5-46f1-bc7b-d4acb41958f7")
                            .type(DatastoreRelationshipType.MANY)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-08-13T05:51:10.460Z"))
                    .webUrl("https://nervous-deck.com")
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

Deletes the DatastoreTable identified by `id`.

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
                    .id("558bcd2c-195a-44e1-9f99-72fc15b09ea5")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Rau - O'Reilly")
                    .password("iYLhYwOHm0NLDvI")
                    .region("France")
                    .updatedAt(OffsetDateTime.parse("2023-07-05T03:57:09.519Z"))
                    .webUrl("https://optimal-signature.name")
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
                    .id("17d9b4d9-0ec4-47fd-a943-2caf51147698")
                    .metadata(List.of())
                    .rowNumber(33d)
                    .updatedAt(OffsetDateTime.parse("2025-03-09T21:05:45.832Z"))
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

Updates the DatastoreTable identified by `id`. Provide the unified DatastoreTable fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateDatastoreTable" method="put" path="/datastore/{connection_id}/table/{id}" example="datastore_table" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateDatastoreTableRequest;
import to.unified.unified_java_sdk.models.operations.UpdateDatastoreTableResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateDatastoreTableRequest req = UpdateDatastoreTableRequest.builder()
                .datastoreTable(DatastoreTable.builder()
                    .createdAt(OffsetDateTime.parse("2022-05-22T04:49:00.762Z"))
                    .description("Quasi adhuc paulatim ducimus carpo vomito magni tantum tubineus corona.")
                    .fields(List.of(
                        DatastoreField.builder()
                            .name("Ferry LLC")
                            .originalType("conservo")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Antea soluta itaque clamo despecto basium accendo.")
                            .id("2d0d8cd7-67b6-4b37-99e5-ca1d46fb773d")
                            .isIndexed(true)
                            .isUnique(true)
                            .scale(64d)
                            .build(),
                        DatastoreField.builder()
                            .name("Hand - Nader")
                            .originalType("conservo")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Nulla cattus aequus sumo neque alter cauda subseco.")
                            .id("39288ca3-bc2b-4a95-8cc9-30fba2207c46")
                            .isNullable(true)
                            .isUnique(true)
                            .precision(57d)
                            .build(),
                        DatastoreField.builder()
                            .name("Toy - Kiehn")
                            .originalType("sursum")
                            .type(DatastoreFieldType.NUMBER)
                            .description("Utilis callide adhuc verumtamen doloremque ceno sui sint.")
                            .id("4283ef2e-2109-483e-a6b6-f92920b2610f")
                            .isIndexed(true)
                            .isNullable(true)
                            .isUnique(true)
                            .maxLength(62d)
                            .precision(47d)
                            .build(),
                        DatastoreField.builder()
                            .name("Gislason, Gorczany and Hegmann")
                            .originalType("tego")
                            .type(DatastoreFieldType.RELATION)
                            .description("Audax articulus triumphus tametsi cura tenetur colligo arcesso bestia.")
                            .id("858ee55d-cc04-4813-a2ec-7b18d298a720")
                            .precision(94d)
                            .scale(24d)
                            .build(),
                        DatastoreField.builder()
                            .name("Graham, Steuber and Kshlerin")
                            .originalType("defessus")
                            .type(DatastoreFieldType.EMAIL)
                            .description("Communis coma cura audio aduro acer canis expedita.")
                            .id("25f05289-8522-457c-b967-26a180d51fd2")
                            .isIndexed(true)
                            .isPrimaryKey(true)
                            .isRequired(true)
                            .scale(68d)
                            .build()))
                    .id("a3ed0b49-d7d5-46f1-bc7b-d4acb41958f7")
                    .metadata(List.of())
                    .name("Rogahn, Lowe and Heller")
                    .relationships(List.of(
                        DatastoreRelationship.builder()
                            .field("Macejkovic - Shields")
                            .name("Hyatt, Ryan and Nienow")
                            .tableId("a3ed0b49-d7d5-46f1-bc7b-d4acb41958f7")
                            .type(DatastoreRelationshipType.MANY)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-08-13T05:51:10.460Z"))
                    .webUrl("https://nervous-deck.com")
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