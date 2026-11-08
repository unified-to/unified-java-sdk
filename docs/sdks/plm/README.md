# Plm

## Overview

### Available Operations

* [createPlmBomline](#createplmbomline) - Create a bomline
* [createPlmChange](#createplmchange) - Create a change
* [createPlmDocument](#createplmdocument) - Create a document
* [createPlmPart](#createplmpart) - Create a part
* [getPlmBomline](#getplmbomline) - Retrieve a bomline
* [getPlmCategory](#getplmcategory) - Retrieve a category
* [getPlmChange](#getplmchange) - Retrieve a change
* [getPlmDocument](#getplmdocument) - Retrieve a document
* [getPlmPart](#getplmpart) - Retrieve a part
* [listPlmBomlines](#listplmbomlines) - List all bomlines
* [listPlmCategories](#listplmcategories) - List all categories
* [listPlmChanges](#listplmchanges) - List all changes
* [listPlmDocuments](#listplmdocuments) - List all documents
* [listPlmParts](#listplmparts) - List all parts
* [patchPlmBomline](#patchplmbomline) - Update a bomline
* [patchPlmChange](#patchplmchange) - Update a change
* [patchPlmDocument](#patchplmdocument) - Update a document
* [patchPlmPart](#patchplmpart) - Update a part
* [removePlmBomline](#removeplmbomline) - Remove a bomline
* [updatePlmBomline](#updateplmbomline) - Update a bomline
* [updatePlmChange](#updateplmchange) - Update a change
* [updatePlmDocument](#updateplmdocument) - Update a document
* [updatePlmPart](#updateplmpart) - Update a part

## createPlmBomline

Creates a PlmBomline. Provide the unified PlmBomline fields in the request body; they are mapped to the provider's API. Returns the created PlmBomline.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPlmBomline" method="post" path="/plm/{connection_id}/bomline" example="plm_bomline" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePlmBomlineRequest;
import to.unified.unified_java_sdk.models.operations.CreatePlmBomlineResponse;
import to.unified.unified_java_sdk.models.shared.PlmBomline;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePlmBomlineRequest req = CreatePlmBomlineRequest.builder()
                .plmBomline(PlmBomline.builder()
                    .createdAt(OffsetDateTime.parse("2022-04-02T07:09:29.598Z"))
                    .effectiveAt(OffsetDateTime.parse("2022-04-02T07:09:29.598Z"))
                    .id("f9230063-9747-474a-b697-73f76afdf9a5")
                    .quantity(7d)
                    .referenceDesignators(List.of())
                    .unitOfMeasure("EA")
                    .updatedAt(OffsetDateTime.parse("2023-04-18T14:43:48.854Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreatePlmBomlineResponse res = sdk.plm().createPlmBomline()
                .request(req)
                .call();

        if (res.plmBomline().isPresent()) {
            System.out.println(res.plmBomline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreatePlmBomlineRequest](../../models/operations/CreatePlmBomlineRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreatePlmBomlineResponse](../../models/operations/CreatePlmBomlineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createPlmChange

Creates a PlmChange. Provide the unified PlmChange fields in the request body; they are mapped to the provider's API. Returns the created PlmChange.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPlmChange" method="post" path="/plm/{connection_id}/change" example="plm_change" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePlmChangeRequest;
import to.unified.unified_java_sdk.models.operations.CreatePlmChangeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePlmChangeRequest req = CreatePlmChangeRequest.builder()
                .plmChange(PlmChange.builder()
                    .affectedItems(List.of())
                    .createdAt(OffsetDateTime.parse("2021-08-02T05:58:32.287Z"))
                    .description("Vorago spiculum avaritia adipiscor callide.")
                    .id("67a09e5b-058b-4523-84a2-587e50fdb352")
                    .metadata(List.of())
                    .name("Update goodwill")
                    .number("ECO-6591")
                    .priority("Medium")
                    .status(PlmChangeStatus.IN_REVIEW)
                    .type(PlmChangeType.ORDER)
                    .updatedAt(OffsetDateTime.parse("2026-09-21T13:53:27.448Z"))
                    .url("https://warmhearted-fraudster.biz/")
                    .build())
                .connectionId("<id>")
                .build();

        CreatePlmChangeResponse res = sdk.plm().createPlmChange()
                .request(req)
                .call();

        if (res.plmChange().isPresent()) {
            System.out.println(res.plmChange().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreatePlmChangeRequest](../../models/operations/CreatePlmChangeRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreatePlmChangeResponse](../../models/operations/CreatePlmChangeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createPlmDocument

Creates a PlmDocument. Provide the unified PlmDocument fields in the request body; they are mapped to the provider's API. Returns the created PlmDocument.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPlmDocument" method="post" path="/plm/{connection_id}/document" example="plm_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePlmDocumentRequest;
import to.unified.unified_java_sdk.models.operations.CreatePlmDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePlmDocumentRequest req = CreatePlmDocumentRequest.builder()
                .plmDocument(PlmDocument.builder()
                    .createdAt(OffsetDateTime.parse("2020-10-16T01:44:30.293Z"))
                    .fileIds(List.of())
                    .id("8d4b5d14-7a03-4efb-8224-503bb104c4e5")
                    .lifecycleState("Under Review")
                    .masterIdentifier("babbe371-7e44-4a90-83f1-e3def240109c")
                    .metadata(List.of())
                    .name("Procedure taxicab")
                    .number("DOC-086886")
                    .originalType("Procedure")
                    .revision("C")
                    .status(PlmDocumentStatus.IN_REVIEW)
                    .type(PlmDocumentType.PROCEDURE)
                    .updatedAt(OffsetDateTime.parse("2026-09-02T08:06:40.957Z"))
                    .url("https://uncommon-guide.info/")
                    .build())
                .connectionId("<id>")
                .build();

        CreatePlmDocumentResponse res = sdk.plm().createPlmDocument()
                .request(req)
                .call();

        if (res.plmDocument().isPresent()) {
            System.out.println(res.plmDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreatePlmDocumentRequest](../../models/operations/CreatePlmDocumentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreatePlmDocumentResponse](../../models/operations/CreatePlmDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createPlmPart

Creates a PlmPart. Provide the unified PlmPart fields in the request body; they are mapped to the provider's API. Returns the created PlmPart.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPlmPart" method="post" path="/plm/{connection_id}/part" example="plm_part" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePlmPartRequest;
import to.unified.unified_java_sdk.models.operations.CreatePlmPartResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePlmPartRequest req = CreatePlmPartRequest.builder()
                .plmPart(PlmPart.builder()
                    .createdAt(OffsetDateTime.parse("2019-04-13T06:25:34.770Z"))
                    .description("Pectus tero ulterius aestivus talis tero ullam cruciamentum.")
                    .documentIds(List.of())
                    .fileIds(List.of())
                    .id("5421e0f1-dcc3-476c-825b-37f4ffe68a95")
                    .isAssembly(false)
                    .lifecycleState("Design")
                    .masterIdentifier("4a283340-97c5-4fc6-818b-06248e1bce1b")
                    .metadata(List.of())
                    .name("grumpy PCB")
                    .number("PRT-009154")
                    .originalType("Software")
                    .revision("B")
                    .source(Source.MAKE)
                    .status(PlmPartStatus.IN_WORK)
                    .type(PlmPartType.SOFTWARE)
                    .unitOfMeasure("EA")
                    .updatedAt(OffsetDateTime.parse("2021-04-10T20:24:27.671Z"))
                    .url("https://inborn-independence.info")
                    .build())
                .connectionId("<id>")
                .build();

        CreatePlmPartResponse res = sdk.plm().createPlmPart()
                .request(req)
                .call();

        if (res.plmPart().isPresent()) {
            System.out.println(res.plmPart().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreatePlmPartRequest](../../models/operations/CreatePlmPartRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreatePlmPartResponse](../../models/operations/CreatePlmPartResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPlmBomline

Retrieves a single PlmBomline by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPlmBomline" method="get" path="/plm/{connection_id}/bomline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPlmBomlineRequest;
import to.unified.unified_java_sdk.models.operations.GetPlmBomlineResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPlmBomlineRequest req = GetPlmBomlineRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPlmBomlineResponse res = sdk.plm().getPlmBomline()
                .request(req)
                .call();

        if (res.plmBomline().isPresent()) {
            System.out.println(res.plmBomline().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetPlmBomlineRequest](../../models/operations/GetPlmBomlineRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetPlmBomlineResponse](../../models/operations/GetPlmBomlineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPlmCategory

Retrieves a single PlmCategory by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPlmCategory" method="get" path="/plm/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPlmCategoryRequest;
import to.unified.unified_java_sdk.models.operations.GetPlmCategoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPlmCategoryRequest req = GetPlmCategoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPlmCategoryResponse res = sdk.plm().getPlmCategory()
                .request(req)
                .call();

        if (res.plmCategory().isPresent()) {
            System.out.println(res.plmCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetPlmCategoryRequest](../../models/operations/GetPlmCategoryRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetPlmCategoryResponse](../../models/operations/GetPlmCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPlmChange

Retrieves a single PlmChange by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPlmChange" method="get" path="/plm/{connection_id}/change/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPlmChangeRequest;
import to.unified.unified_java_sdk.models.operations.GetPlmChangeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPlmChangeRequest req = GetPlmChangeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPlmChangeResponse res = sdk.plm().getPlmChange()
                .request(req)
                .call();

        if (res.plmChange().isPresent()) {
            System.out.println(res.plmChange().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetPlmChangeRequest](../../models/operations/GetPlmChangeRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetPlmChangeResponse](../../models/operations/GetPlmChangeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPlmDocument

Retrieves a single PlmDocument by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPlmDocument" method="get" path="/plm/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPlmDocumentRequest;
import to.unified.unified_java_sdk.models.operations.GetPlmDocumentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPlmDocumentRequest req = GetPlmDocumentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPlmDocumentResponse res = sdk.plm().getPlmDocument()
                .request(req)
                .call();

        if (res.plmDocument().isPresent()) {
            System.out.println(res.plmDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetPlmDocumentRequest](../../models/operations/GetPlmDocumentRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetPlmDocumentResponse](../../models/operations/GetPlmDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPlmPart

Retrieves a single PlmPart by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPlmPart" method="get" path="/plm/{connection_id}/part/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPlmPartRequest;
import to.unified.unified_java_sdk.models.operations.GetPlmPartResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPlmPartRequest req = GetPlmPartRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPlmPartResponse res = sdk.plm().getPlmPart()
                .request(req)
                .call();

        if (res.plmPart().isPresent()) {
            System.out.println(res.plmPart().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetPlmPartRequest](../../models/operations/GetPlmPartRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetPlmPartResponse](../../models/operations/GetPlmPartResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPlmBomlines

Returns a list of PlmBomlines. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPlmBomlines" method="get" path="/plm/{connection_id}/bomline" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPlmBomlinesRequest;
import to.unified.unified_java_sdk.models.operations.ListPlmBomlinesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPlmBomlinesRequest req = ListPlmBomlinesRequest.builder()
                .connectionId("<id>")
                .build();

        ListPlmBomlinesResponse res = sdk.plm().listPlmBomlines()
                .request(req)
                .call();

        if (res.plmBomlines().isPresent()) {
            System.out.println(res.plmBomlines().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListPlmBomlinesRequest](../../models/operations/ListPlmBomlinesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListPlmBomlinesResponse](../../models/operations/ListPlmBomlinesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPlmCategories

Returns a list of PlmCategories. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPlmCategories" method="get" path="/plm/{connection_id}/category" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPlmCategoriesRequest;
import to.unified.unified_java_sdk.models.operations.ListPlmCategoriesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPlmCategoriesRequest req = ListPlmCategoriesRequest.builder()
                .connectionId("<id>")
                .build();

        ListPlmCategoriesResponse res = sdk.plm().listPlmCategories()
                .request(req)
                .call();

        if (res.plmCategories().isPresent()) {
            System.out.println(res.plmCategories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListPlmCategoriesRequest](../../models/operations/ListPlmCategoriesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListPlmCategoriesResponse](../../models/operations/ListPlmCategoriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPlmChanges

Returns a list of PlmChanges. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPlmChanges" method="get" path="/plm/{connection_id}/change" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPlmChangesRequest;
import to.unified.unified_java_sdk.models.operations.ListPlmChangesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPlmChangesRequest req = ListPlmChangesRequest.builder()
                .connectionId("<id>")
                .build();

        ListPlmChangesResponse res = sdk.plm().listPlmChanges()
                .request(req)
                .call();

        if (res.plmChanges().isPresent()) {
            System.out.println(res.plmChanges().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListPlmChangesRequest](../../models/operations/ListPlmChangesRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListPlmChangesResponse](../../models/operations/ListPlmChangesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPlmDocuments

Returns a list of PlmDocuments. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPlmDocuments" method="get" path="/plm/{connection_id}/document" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPlmDocumentsRequest;
import to.unified.unified_java_sdk.models.operations.ListPlmDocumentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPlmDocumentsRequest req = ListPlmDocumentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPlmDocumentsResponse res = sdk.plm().listPlmDocuments()
                .request(req)
                .call();

        if (res.plmDocuments().isPresent()) {
            System.out.println(res.plmDocuments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListPlmDocumentsRequest](../../models/operations/ListPlmDocumentsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListPlmDocumentsResponse](../../models/operations/ListPlmDocumentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPlmParts

Returns a list of PlmParts. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPlmParts" method="get" path="/plm/{connection_id}/part" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPlmPartsRequest;
import to.unified.unified_java_sdk.models.operations.ListPlmPartsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPlmPartsRequest req = ListPlmPartsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPlmPartsResponse res = sdk.plm().listPlmParts()
                .request(req)
                .call();

        if (res.plmParts().isPresent()) {
            System.out.println(res.plmParts().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListPlmPartsRequest](../../models/operations/ListPlmPartsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListPlmPartsResponse](../../models/operations/ListPlmPartsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPlmBomline

Updates the PlmBomline identified by `id`. Provide the unified PlmBomline fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPlmBomline" method="patch" path="/plm/{connection_id}/bomline/{id}" example="plm_bomline" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPlmBomlineRequest;
import to.unified.unified_java_sdk.models.operations.PatchPlmBomlineResponse;
import to.unified.unified_java_sdk.models.shared.PlmBomline;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPlmBomlineRequest req = PatchPlmBomlineRequest.builder()
                .plmBomline(PlmBomline.builder()
                    .createdAt(OffsetDateTime.parse("2022-04-02T07:09:29.598Z"))
                    .effectiveAt(OffsetDateTime.parse("2022-04-02T07:09:29.598Z"))
                    .id("feb697ae-ed4a-4b95-a4a2-90b29e0de3ea")
                    .quantity(7d)
                    .referenceDesignators(List.of())
                    .unitOfMeasure("EA")
                    .updatedAt(OffsetDateTime.parse("2023-04-18T14:43:48.857Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPlmBomlineResponse res = sdk.plm().patchPlmBomline()
                .request(req)
                .call();

        if (res.plmBomline().isPresent()) {
            System.out.println(res.plmBomline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchPlmBomlineRequest](../../models/operations/PatchPlmBomlineRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchPlmBomlineResponse](../../models/operations/PatchPlmBomlineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPlmChange

Updates the PlmChange identified by `id`. Provide the unified PlmChange fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPlmChange" method="patch" path="/plm/{connection_id}/change/{id}" example="plm_change" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPlmChangeRequest;
import to.unified.unified_java_sdk.models.operations.PatchPlmChangeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPlmChangeRequest req = PatchPlmChangeRequest.builder()
                .plmChange(PlmChange.builder()
                    .affectedItems(List.of())
                    .createdAt(OffsetDateTime.parse("2021-08-02T05:58:32.287Z"))
                    .description("Vorago spiculum avaritia adipiscor callide.")
                    .id("69097370-e981-4198-8f57-51f773d19678")
                    .metadata(List.of())
                    .name("Update goodwill")
                    .number("ECO-6591")
                    .priority("Medium")
                    .status(PlmChangeStatus.IN_REVIEW)
                    .type(PlmChangeType.ORDER)
                    .updatedAt(OffsetDateTime.parse("2026-09-21T13:53:27.471Z"))
                    .url("https://warmhearted-fraudster.biz/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPlmChangeResponse res = sdk.plm().patchPlmChange()
                .request(req)
                .call();

        if (res.plmChange().isPresent()) {
            System.out.println(res.plmChange().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchPlmChangeRequest](../../models/operations/PatchPlmChangeRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchPlmChangeResponse](../../models/operations/PatchPlmChangeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPlmDocument

Updates the PlmDocument identified by `id`. Provide the unified PlmDocument fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPlmDocument" method="patch" path="/plm/{connection_id}/document/{id}" example="plm_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPlmDocumentRequest;
import to.unified.unified_java_sdk.models.operations.PatchPlmDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPlmDocumentRequest req = PatchPlmDocumentRequest.builder()
                .plmDocument(PlmDocument.builder()
                    .createdAt(OffsetDateTime.parse("2020-10-16T01:44:30.293Z"))
                    .fileIds(List.of())
                    .id("6c1e8d40-aff5-4393-a61b-90e0dbcdfc2e")
                    .lifecycleState("Under Review")
                    .masterIdentifier("e4b894b7-b89d-47ea-a13e-1bd0c32af368")
                    .metadata(List.of())
                    .name("Procedure taxicab")
                    .number("DOC-086886")
                    .originalType("Procedure")
                    .revision("C")
                    .status(PlmDocumentStatus.IN_REVIEW)
                    .type(PlmDocumentType.PROCEDURE)
                    .updatedAt(OffsetDateTime.parse("2026-09-02T08:06:40.984Z"))
                    .url("https://uncommon-guide.info/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPlmDocumentResponse res = sdk.plm().patchPlmDocument()
                .request(req)
                .call();

        if (res.plmDocument().isPresent()) {
            System.out.println(res.plmDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchPlmDocumentRequest](../../models/operations/PatchPlmDocumentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchPlmDocumentResponse](../../models/operations/PatchPlmDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPlmPart

Updates the PlmPart identified by `id`. Provide the unified PlmPart fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPlmPart" method="patch" path="/plm/{connection_id}/part/{id}" example="plm_part" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPlmPartRequest;
import to.unified.unified_java_sdk.models.operations.PatchPlmPartResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPlmPartRequest req = PatchPlmPartRequest.builder()
                .plmPart(PlmPart.builder()
                    .createdAt(OffsetDateTime.parse("2019-04-13T06:25:34.770Z"))
                    .description("Pectus tero ulterius aestivus talis tero ullam cruciamentum.")
                    .documentIds(List.of())
                    .fileIds(List.of())
                    .id("20db72a8-a851-48c6-aed2-6668fd46cad9")
                    .isAssembly(false)
                    .lifecycleState("Design")
                    .masterIdentifier("c07301af-12f5-401b-be0e-049798e8ec2c")
                    .metadata(List.of())
                    .name("grumpy PCB")
                    .number("PRT-009154")
                    .originalType("Software")
                    .revision("B")
                    .source(Source.MAKE)
                    .status(PlmPartStatus.IN_WORK)
                    .type(PlmPartType.SOFTWARE)
                    .unitOfMeasure("EA")
                    .updatedAt(OffsetDateTime.parse("2021-04-10T20:24:27.678Z"))
                    .url("https://inborn-independence.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPlmPartResponse res = sdk.plm().patchPlmPart()
                .request(req)
                .call();

        if (res.plmPart().isPresent()) {
            System.out.println(res.plmPart().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [PatchPlmPartRequest](../../models/operations/PatchPlmPartRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PatchPlmPartResponse](../../models/operations/PatchPlmPartResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removePlmBomline

Deletes the PlmBomline identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removePlmBomline" method="delete" path="/plm/{connection_id}/bomline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemovePlmBomlineRequest;
import to.unified.unified_java_sdk.models.operations.RemovePlmBomlineResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemovePlmBomlineRequest req = RemovePlmBomlineRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemovePlmBomlineResponse res = sdk.plm().removePlmBomline()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemovePlmBomlineRequest](../../models/operations/RemovePlmBomlineRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemovePlmBomlineResponse](../../models/operations/RemovePlmBomlineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePlmBomline

Updates the PlmBomline identified by `id`. Provide the unified PlmBomline fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePlmBomline" method="put" path="/plm/{connection_id}/bomline/{id}" example="plm_bomline" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePlmBomlineRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePlmBomlineResponse;
import to.unified.unified_java_sdk.models.shared.PlmBomline;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePlmBomlineRequest req = UpdatePlmBomlineRequest.builder()
                .plmBomline(PlmBomline.builder()
                    .createdAt(OffsetDateTime.parse("2022-04-02T07:09:29.598Z"))
                    .effectiveAt(OffsetDateTime.parse("2022-04-02T07:09:29.598Z"))
                    .id("feb697ae-ed4a-4b95-a4a2-90b29e0de3ea")
                    .quantity(7d)
                    .referenceDesignators(List.of())
                    .unitOfMeasure("EA")
                    .updatedAt(OffsetDateTime.parse("2023-04-18T14:43:48.857Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePlmBomlineResponse res = sdk.plm().updatePlmBomline()
                .request(req)
                .call();

        if (res.plmBomline().isPresent()) {
            System.out.println(res.plmBomline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdatePlmBomlineRequest](../../models/operations/UpdatePlmBomlineRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdatePlmBomlineResponse](../../models/operations/UpdatePlmBomlineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePlmChange

Updates the PlmChange identified by `id`. Provide the unified PlmChange fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePlmChange" method="put" path="/plm/{connection_id}/change/{id}" example="plm_change" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePlmChangeRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePlmChangeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePlmChangeRequest req = UpdatePlmChangeRequest.builder()
                .plmChange(PlmChange.builder()
                    .affectedItems(List.of())
                    .createdAt(OffsetDateTime.parse("2021-08-02T05:58:32.287Z"))
                    .description("Vorago spiculum avaritia adipiscor callide.")
                    .id("69097370-e981-4198-8f57-51f773d19678")
                    .metadata(List.of())
                    .name("Update goodwill")
                    .number("ECO-6591")
                    .priority("Medium")
                    .status(PlmChangeStatus.IN_REVIEW)
                    .type(PlmChangeType.ORDER)
                    .updatedAt(OffsetDateTime.parse("2026-09-21T13:53:27.471Z"))
                    .url("https://warmhearted-fraudster.biz/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePlmChangeResponse res = sdk.plm().updatePlmChange()
                .request(req)
                .call();

        if (res.plmChange().isPresent()) {
            System.out.println(res.plmChange().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdatePlmChangeRequest](../../models/operations/UpdatePlmChangeRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdatePlmChangeResponse](../../models/operations/UpdatePlmChangeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePlmDocument

Updates the PlmDocument identified by `id`. Provide the unified PlmDocument fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePlmDocument" method="put" path="/plm/{connection_id}/document/{id}" example="plm_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePlmDocumentRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePlmDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePlmDocumentRequest req = UpdatePlmDocumentRequest.builder()
                .plmDocument(PlmDocument.builder()
                    .createdAt(OffsetDateTime.parse("2020-10-16T01:44:30.293Z"))
                    .fileIds(List.of())
                    .id("6c1e8d40-aff5-4393-a61b-90e0dbcdfc2e")
                    .lifecycleState("Under Review")
                    .masterIdentifier("e4b894b7-b89d-47ea-a13e-1bd0c32af368")
                    .metadata(List.of())
                    .name("Procedure taxicab")
                    .number("DOC-086886")
                    .originalType("Procedure")
                    .revision("C")
                    .status(PlmDocumentStatus.IN_REVIEW)
                    .type(PlmDocumentType.PROCEDURE)
                    .updatedAt(OffsetDateTime.parse("2026-09-02T08:06:40.984Z"))
                    .url("https://uncommon-guide.info/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePlmDocumentResponse res = sdk.plm().updatePlmDocument()
                .request(req)
                .call();

        if (res.plmDocument().isPresent()) {
            System.out.println(res.plmDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdatePlmDocumentRequest](../../models/operations/UpdatePlmDocumentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdatePlmDocumentResponse](../../models/operations/UpdatePlmDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePlmPart

Updates the PlmPart identified by `id`. Provide the unified PlmPart fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePlmPart" method="put" path="/plm/{connection_id}/part/{id}" example="plm_part" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePlmPartRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePlmPartResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePlmPartRequest req = UpdatePlmPartRequest.builder()
                .plmPart(PlmPart.builder()
                    .createdAt(OffsetDateTime.parse("2019-04-13T06:25:34.770Z"))
                    .description("Pectus tero ulterius aestivus talis tero ullam cruciamentum.")
                    .documentIds(List.of())
                    .fileIds(List.of())
                    .id("20db72a8-a851-48c6-aed2-6668fd46cad9")
                    .isAssembly(false)
                    .lifecycleState("Design")
                    .masterIdentifier("c07301af-12f5-401b-be0e-049798e8ec2c")
                    .metadata(List.of())
                    .name("grumpy PCB")
                    .number("PRT-009154")
                    .originalType("Software")
                    .revision("B")
                    .source(Source.MAKE)
                    .status(PlmPartStatus.IN_WORK)
                    .type(PlmPartType.SOFTWARE)
                    .unitOfMeasure("EA")
                    .updatedAt(OffsetDateTime.parse("2021-04-10T20:24:27.678Z"))
                    .url("https://inborn-independence.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePlmPartResponse res = sdk.plm().updatePlmPart()
                .request(req)
                .call();

        if (res.plmPart().isPresent()) {
            System.out.println(res.plmPart().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdatePlmPartRequest](../../models/operations/UpdatePlmPartRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdatePlmPartResponse](../../models/operations/UpdatePlmPartResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |