# Table

## Overview

### Available Operations

* [createDatastoreTable](#createdatastoretable) - Create a table
* [getCommerceTable](#getcommercetable) - Retrieve a table
* [getDatastoreTable](#getdatastoretable) - Retrieve a table
* [listCommerceTables](#listcommercetables) - List all tables
* [listDatastoreTables](#listdatastoretables) - List all tables
* [patchDatastoreTable](#patchdatastoretable) - Update a table
* [removeDatastoreTable](#removedatastoretable) - Remove a table
* [updateDatastoreTable](#updatedatastoretable) - Update a table

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
                    .description("Carpo vomito magni tantum tubineus corona deputo.")
                    .fields(List.of(
                        DatastoreField.builder()
                            .name("Cassin - Greenfelder")
                            .originalType("tenus")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Basium accendo conservo curto thesis amet supellex.")
                            .id("8c7c4d8a-06e3-4dcc-8051-04426e16d495")
                            .isIndexed(true)
                            .isUnique(true)
                            .scale(64d)
                            .build(),
                        DatastoreField.builder()
                            .name("Gerhold, Hermiston and Schmidt")
                            .originalType("doloremque")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Alo admiratio vallum decet tamquam utilis callide adhuc verumtamen.")
                            .id("e9a06e55-0d26-4d13-b52c-35f768bdaa14")
                            .isNullable(true)
                            .isUnique(true)
                            .precision(57d)
                            .build(),
                        DatastoreField.builder()
                            .name("McDermott LLC")
                            .originalType("tenetur")
                            .type(DatastoreFieldType.NUMBER)
                            .description("Celer charisma coniuratio usus audax articulus triumphus tametsi cura.")
                            .id("824d6d90-db78-4894-8622-96b9bd7c6779")
                            .isIndexed(true)
                            .isNullable(true)
                            .isUnique(true)
                            .maxLength(62d)
                            .precision(47d)
                            .build(),
                        DatastoreField.builder()
                            .name("Koch - Krajcik")
                            .originalType("umbra")
                            .type(DatastoreFieldType.RELATION)
                            .description("Adficio voluptatibus ciminatio.")
                            .id("ca62cd21-1feb-4f6b-b4fc-c22c8165cd27")
                            .precision(94d)
                            .scale(24d)
                            .build(),
                        DatastoreField.builder()
                            .name("Kling - Bosco")
                            .originalType("venustas")
                            .type(DatastoreFieldType.EMAIL)
                            .description("Demitto ullam solium bellicus urbs concedo.")
                            .id("1281e024-48de-488a-a3b8-1089c994ce15")
                            .isIndexed(true)
                            .isPrimaryKey(true)
                            .isRequired(true)
                            .scale(68d)
                            .build()))
                    .id("3dfef1c7-384b-405e-9857-7567a37d2082")
                    .metadata(List.of())
                    .name("Bauch LLC")
                    .relationships(List.of(
                        DatastoreRelationship.builder()
                            .field("Nikolaus - Kub")
                            .name("Brakus and Sons")
                            .tableId("3dfef1c7-384b-405e-9857-7567a37d2082")
                            .type(DatastoreRelationshipType.MANY)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-08-14T16:38:56.474Z"))
                    .webUrl("https://torn-bench.biz/")
                    .build())
                .connectionId("<id>")
                .build();

        CreateDatastoreTableResponse res = sdk.table().createDatastoreTable()
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

## getCommerceTable

Retrieves a single CommerceTable by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceTable" method="get" path="/commerce/{connection_id}/table/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceTableRequest;
import to.unified.unified_java_sdk.models.operations.GetCommerceTableResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceTableRequest req = GetCommerceTableRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceTableResponse res = sdk.table().getCommerceTable()
                .request(req)
                .call();

        if (res.commerceTable().isPresent()) {
            System.out.println(res.commerceTable().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetCommerceTableRequest](../../models/operations/GetCommerceTableRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetCommerceTableResponse](../../models/operations/GetCommerceTableResponse.md)**

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

        GetDatastoreTableResponse res = sdk.table().getDatastoreTable()
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

## listCommerceTables

Returns a list of CommerceTables. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceTables" method="get" path="/commerce/{connection_id}/table" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceTablesRequest;
import to.unified.unified_java_sdk.models.operations.ListCommerceTablesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceTablesRequest req = ListCommerceTablesRequest.builder()
                .connectionId("<id>")
                .build();

        ListCommerceTablesResponse res = sdk.table().listCommerceTables()
                .request(req)
                .call();

        if (res.commerceTables().isPresent()) {
            System.out.println(res.commerceTables().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListCommerceTablesRequest](../../models/operations/ListCommerceTablesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListCommerceTablesResponse](../../models/operations/ListCommerceTablesResponse.md)**

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

        ListDatastoreTablesResponse res = sdk.table().listDatastoreTables()
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
                    .description("Carpo vomito magni tantum tubineus corona deputo.")
                    .fields(List.of(
                        DatastoreField.builder()
                            .name("Cassin - Greenfelder")
                            .originalType("tenus")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Basium accendo conservo curto thesis amet supellex.")
                            .id("dfdcdb85-1a8d-455a-aed3-b1db98e96ad3")
                            .isIndexed(true)
                            .isUnique(true)
                            .scale(64d)
                            .build(),
                        DatastoreField.builder()
                            .name("Gerhold, Hermiston and Schmidt")
                            .originalType("doloremque")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Alo admiratio vallum decet tamquam utilis callide adhuc verumtamen.")
                            .id("d352ee37-441b-4f43-a84e-84e9940c1346")
                            .isNullable(true)
                            .isUnique(true)
                            .precision(57d)
                            .build(),
                        DatastoreField.builder()
                            .name("McDermott LLC")
                            .originalType("tenetur")
                            .type(DatastoreFieldType.NUMBER)
                            .description("Celer charisma coniuratio usus audax articulus triumphus tametsi cura.")
                            .id("16efca7e-0d08-4034-8ce2-2a3157551b53")
                            .isIndexed(true)
                            .isNullable(true)
                            .isUnique(true)
                            .maxLength(62d)
                            .precision(47d)
                            .build(),
                        DatastoreField.builder()
                            .name("Koch - Krajcik")
                            .originalType("umbra")
                            .type(DatastoreFieldType.RELATION)
                            .description("Adficio voluptatibus ciminatio.")
                            .id("54afb300-4765-45d3-a48a-30af563b53aa")
                            .precision(94d)
                            .scale(24d)
                            .build(),
                        DatastoreField.builder()
                            .name("Kling - Bosco")
                            .originalType("venustas")
                            .type(DatastoreFieldType.EMAIL)
                            .description("Demitto ullam solium bellicus urbs concedo.")
                            .id("625029aa-a1de-4366-9b84-fe80baaaf62e")
                            .isIndexed(true)
                            .isPrimaryKey(true)
                            .isRequired(true)
                            .scale(68d)
                            .build()))
                    .id("8a18c8a1-1726-4cf5-a2ef-aa5a8686395b")
                    .metadata(List.of())
                    .name("Bauch LLC")
                    .relationships(List.of(
                        DatastoreRelationship.builder()
                            .field("Nikolaus - Kub")
                            .name("Brakus and Sons")
                            .tableId("8a18c8a1-1726-4cf5-a2ef-aa5a8686395b")
                            .type(DatastoreRelationshipType.MANY)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-08-14T16:38:56.476Z"))
                    .webUrl("https://torn-bench.biz/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDatastoreTableResponse res = sdk.table().patchDatastoreTable()
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

        RemoveDatastoreTableResponse res = sdk.table().removeDatastoreTable()
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
                    .description("Carpo vomito magni tantum tubineus corona deputo.")
                    .fields(List.of(
                        DatastoreField.builder()
                            .name("Cassin - Greenfelder")
                            .originalType("tenus")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Basium accendo conservo curto thesis amet supellex.")
                            .id("dfdcdb85-1a8d-455a-aed3-b1db98e96ad3")
                            .isIndexed(true)
                            .isUnique(true)
                            .scale(64d)
                            .build(),
                        DatastoreField.builder()
                            .name("Gerhold, Hermiston and Schmidt")
                            .originalType("doloremque")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Alo admiratio vallum decet tamquam utilis callide adhuc verumtamen.")
                            .id("d352ee37-441b-4f43-a84e-84e9940c1346")
                            .isNullable(true)
                            .isUnique(true)
                            .precision(57d)
                            .build(),
                        DatastoreField.builder()
                            .name("McDermott LLC")
                            .originalType("tenetur")
                            .type(DatastoreFieldType.NUMBER)
                            .description("Celer charisma coniuratio usus audax articulus triumphus tametsi cura.")
                            .id("16efca7e-0d08-4034-8ce2-2a3157551b53")
                            .isIndexed(true)
                            .isNullable(true)
                            .isUnique(true)
                            .maxLength(62d)
                            .precision(47d)
                            .build(),
                        DatastoreField.builder()
                            .name("Koch - Krajcik")
                            .originalType("umbra")
                            .type(DatastoreFieldType.RELATION)
                            .description("Adficio voluptatibus ciminatio.")
                            .id("54afb300-4765-45d3-a48a-30af563b53aa")
                            .precision(94d)
                            .scale(24d)
                            .build(),
                        DatastoreField.builder()
                            .name("Kling - Bosco")
                            .originalType("venustas")
                            .type(DatastoreFieldType.EMAIL)
                            .description("Demitto ullam solium bellicus urbs concedo.")
                            .id("625029aa-a1de-4366-9b84-fe80baaaf62e")
                            .isIndexed(true)
                            .isPrimaryKey(true)
                            .isRequired(true)
                            .scale(68d)
                            .build()))
                    .id("8a18c8a1-1726-4cf5-a2ef-aa5a8686395b")
                    .metadata(List.of())
                    .name("Bauch LLC")
                    .relationships(List.of(
                        DatastoreRelationship.builder()
                            .field("Nikolaus - Kub")
                            .name("Brakus and Sons")
                            .tableId("8a18c8a1-1726-4cf5-a2ef-aa5a8686395b")
                            .type(DatastoreRelationshipType.MANY)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-08-14T16:38:56.476Z"))
                    .webUrl("https://torn-bench.biz/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDatastoreTableResponse res = sdk.table().updateDatastoreTable()
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