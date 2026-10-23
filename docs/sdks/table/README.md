# Table

## Overview

### Available Operations

* [createDatastoreTable](#createdatastoretable) - Create a table
* [getDatastoreTable](#getdatastoretable) - Retrieve a table
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
                    .description("Quasi adhuc paulatim ducimus carpo vomito magni tantum tubineus corona.")
                    .fields(List.of(
                        DatastoreField.builder()
                            .name("Ferry LLC")
                            .originalType("conservo")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Antea soluta itaque clamo despecto basium accendo.")
                            .id("ec054df8-4e2e-46f0-81f3-d435179324ab")
                            .isIndexed(true)
                            .isUnique(true)
                            .scale(64d)
                            .build(),
                        DatastoreField.builder()
                            .name("Hand - Nader")
                            .originalType("conservo")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Nulla cattus aequus sumo neque alter cauda subseco.")
                            .id("729faeaf-c3dc-4e77-8dc3-479cad34d44f")
                            .isNullable(true)
                            .isUnique(true)
                            .precision(57d)
                            .build(),
                        DatastoreField.builder()
                            .name("Toy - Kiehn")
                            .originalType("sursum")
                            .type(DatastoreFieldType.NUMBER)
                            .description("Utilis callide adhuc verumtamen doloremque ceno sui sint.")
                            .id("e151446c-0bdf-4baa-8968-51913f06200b")
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
                            .id("3906b868-036d-4a60-97f2-084d118fddb4")
                            .precision(94d)
                            .scale(24d)
                            .build(),
                        DatastoreField.builder()
                            .name("Graham, Steuber and Kshlerin")
                            .originalType("defessus")
                            .type(DatastoreFieldType.EMAIL)
                            .description("Communis coma cura audio aduro acer canis expedita.")
                            .id("03117641-a4b5-4e0a-9545-469d55e22d49")
                            .isIndexed(true)
                            .isPrimaryKey(true)
                            .isRequired(true)
                            .scale(68d)
                            .build()))
                    .id("e71e0468-16a5-4ab6-89d5-3b55d8fae769")
                    .metadata(List.of())
                    .name("Rogahn, Lowe and Heller")
                    .relationships(List.of(
                        DatastoreRelationship.builder()
                            .field("Macejkovic - Shields")
                            .name("Hyatt, Ryan and Nienow")
                            .tableId("e71e0468-16a5-4ab6-89d5-3b55d8fae769")
                            .type(DatastoreRelationshipType.MANY)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-08-12T22:52:31.533Z"))
                    .webUrl("https://nervous-deck.com")
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
                    .description("Quasi adhuc paulatim ducimus carpo vomito magni tantum tubineus corona.")
                    .fields(List.of(
                        DatastoreField.builder()
                            .name("Ferry LLC")
                            .originalType("conservo")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Antea soluta itaque clamo despecto basium accendo.")
                            .id("77b69327-f93e-4fb3-9da2-2b95dd7db52d")
                            .isIndexed(true)
                            .isUnique(true)
                            .scale(64d)
                            .build(),
                        DatastoreField.builder()
                            .name("Hand - Nader")
                            .originalType("conservo")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Nulla cattus aequus sumo neque alter cauda subseco.")
                            .id("7731b42d-5a1f-4a6e-b988-1fe713569ad3")
                            .isNullable(true)
                            .isUnique(true)
                            .precision(57d)
                            .build(),
                        DatastoreField.builder()
                            .name("Toy - Kiehn")
                            .originalType("sursum")
                            .type(DatastoreFieldType.NUMBER)
                            .description("Utilis callide adhuc verumtamen doloremque ceno sui sint.")
                            .id("addb293e-59df-491e-9dca-0227d846ae66")
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
                            .id("211e1685-2b58-4bf4-a450-1a8d2b564037")
                            .precision(94d)
                            .scale(24d)
                            .build(),
                        DatastoreField.builder()
                            .name("Graham, Steuber and Kshlerin")
                            .originalType("defessus")
                            .type(DatastoreFieldType.EMAIL)
                            .description("Communis coma cura audio aduro acer canis expedita.")
                            .id("3593c569-8247-4940-9949-a221a5660705")
                            .isIndexed(true)
                            .isPrimaryKey(true)
                            .isRequired(true)
                            .scale(68d)
                            .build()))
                    .id("405eca69-b61f-4076-967e-725f0983cc69")
                    .metadata(List.of())
                    .name("Rogahn, Lowe and Heller")
                    .relationships(List.of(
                        DatastoreRelationship.builder()
                            .field("Macejkovic - Shields")
                            .name("Hyatt, Ryan and Nienow")
                            .tableId("405eca69-b61f-4076-967e-725f0983cc69")
                            .type(DatastoreRelationshipType.MANY)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-08-12T22:52:31.534Z"))
                    .webUrl("https://nervous-deck.com")
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
                    .description("Quasi adhuc paulatim ducimus carpo vomito magni tantum tubineus corona.")
                    .fields(List.of(
                        DatastoreField.builder()
                            .name("Ferry LLC")
                            .originalType("conservo")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Antea soluta itaque clamo despecto basium accendo.")
                            .id("77b69327-f93e-4fb3-9da2-2b95dd7db52d")
                            .isIndexed(true)
                            .isUnique(true)
                            .scale(64d)
                            .build(),
                        DatastoreField.builder()
                            .name("Hand - Nader")
                            .originalType("conservo")
                            .type(DatastoreFieldType.SINGLE_SELECT)
                            .description("Nulla cattus aequus sumo neque alter cauda subseco.")
                            .id("7731b42d-5a1f-4a6e-b988-1fe713569ad3")
                            .isNullable(true)
                            .isUnique(true)
                            .precision(57d)
                            .build(),
                        DatastoreField.builder()
                            .name("Toy - Kiehn")
                            .originalType("sursum")
                            .type(DatastoreFieldType.NUMBER)
                            .description("Utilis callide adhuc verumtamen doloremque ceno sui sint.")
                            .id("addb293e-59df-491e-9dca-0227d846ae66")
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
                            .id("211e1685-2b58-4bf4-a450-1a8d2b564037")
                            .precision(94d)
                            .scale(24d)
                            .build(),
                        DatastoreField.builder()
                            .name("Graham, Steuber and Kshlerin")
                            .originalType("defessus")
                            .type(DatastoreFieldType.EMAIL)
                            .description("Communis coma cura audio aduro acer canis expedita.")
                            .id("3593c569-8247-4940-9949-a221a5660705")
                            .isIndexed(true)
                            .isPrimaryKey(true)
                            .isRequired(true)
                            .scale(68d)
                            .build()))
                    .id("405eca69-b61f-4076-967e-725f0983cc69")
                    .metadata(List.of())
                    .name("Rogahn, Lowe and Heller")
                    .relationships(List.of(
                        DatastoreRelationship.builder()
                            .field("Macejkovic - Shields")
                            .name("Hyatt, Ryan and Nienow")
                            .tableId("405eca69-b61f-4076-967e-725f0983cc69")
                            .type(DatastoreRelationshipType.MANY)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-08-12T22:52:31.534Z"))
                    .webUrl("https://nervous-deck.com")
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