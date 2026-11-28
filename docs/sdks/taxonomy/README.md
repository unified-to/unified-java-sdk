# Taxonomy

## Overview

### Available Operations

* [createHrisTaxonomy](#createhristaxonomy) - Create a taxonomy
* [getHrisTaxonomy](#gethristaxonomy) - Retrieve a taxonomy
* [listCrmTaxonomies](#listcrmtaxonomies) - List all taxonomies
* [listHrisTaxonomies](#listhristaxonomies) - List all taxonomies
* [patchHrisTaxonomy](#patchhristaxonomy) - Update a taxonomy
* [removeHrisTaxonomy](#removehristaxonomy) - Remove a taxonomy
* [updateHrisTaxonomy](#updatehristaxonomy) - Update a taxonomy

## createHrisTaxonomy

Creates a HrisTaxonomy. Provide the unified HrisTaxonomy fields in the request body; they are mapped to the provider's API. Returns the created HrisTaxonomy.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisTaxonomy" method="post" path="/hris/{connection_id}/taxonomy" example="hris_taxonomy" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisTaxonomyRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisTaxonomyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisTaxonomyRequest req = CreateHrisTaxonomyRequest.builder()
                .hrisTaxonomy(HrisTaxonomy.builder()
                    .alternativeNames(List.of(
                        "Supervisor",
                        "Customer"))
                    .createdAt(OffsetDateTime.parse("2022-06-23T02:10:00.789Z"))
                    .description("Ea commodo turbo.")
                    .domain("Music")
                    .id("c7dbda23-6cd9-4d26-b7a2-a1787237e3a8")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Chief Accountability Representative")
                    .subcategory("Granite")
                    .type(HrisTaxonomyType.KNOWLEDGE)
                    .updatedAt(OffsetDateTime.parse("2023-06-06T11:41:28.126Z"))
                    .url("https://happy-go-lucky-devastation.com")
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisTaxonomyResponse res = sdk.taxonomy().createHrisTaxonomy()
                .request(req)
                .call();

        if (res.hrisTaxonomy().isPresent()) {
            System.out.println(res.hrisTaxonomy().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateHrisTaxonomyRequest](../../models/operations/CreateHrisTaxonomyRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateHrisTaxonomyResponse](../../models/operations/CreateHrisTaxonomyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisTaxonomy

Retrieves a single HrisTaxonomy by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisTaxonomy" method="get" path="/hris/{connection_id}/taxonomy/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisTaxonomyRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisTaxonomyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisTaxonomyRequest req = GetHrisTaxonomyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisTaxonomyResponse res = sdk.taxonomy().getHrisTaxonomy()
                .request(req)
                .call();

        if (res.hrisTaxonomy().isPresent()) {
            System.out.println(res.hrisTaxonomy().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetHrisTaxonomyRequest](../../models/operations/GetHrisTaxonomyRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetHrisTaxonomyResponse](../../models/operations/GetHrisTaxonomyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmTaxonomies

Returns a list of CrmTaxonomies. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmTaxonomies" method="get" path="/crm/{connection_id}/taxonomy" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmTaxonomiesRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmTaxonomiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmTaxonomiesRequest req = ListCrmTaxonomiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmTaxonomiesResponse res = sdk.taxonomy().listCrmTaxonomies()
                .request(req)
                .call();

        if (res.crmTaxonomies().isPresent()) {
            System.out.println(res.crmTaxonomies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListCrmTaxonomiesRequest](../../models/operations/ListCrmTaxonomiesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListCrmTaxonomiesResponse](../../models/operations/ListCrmTaxonomiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisTaxonomies

Returns a list of HrisTaxonomies. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisTaxonomies" method="get" path="/hris/{connection_id}/taxonomy" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisTaxonomiesRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisTaxonomiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisTaxonomiesRequest req = ListHrisTaxonomiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisTaxonomiesResponse res = sdk.taxonomy().listHrisTaxonomies()
                .request(req)
                .call();

        if (res.hrisTaxonomies().isPresent()) {
            System.out.println(res.hrisTaxonomies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListHrisTaxonomiesRequest](../../models/operations/ListHrisTaxonomiesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListHrisTaxonomiesResponse](../../models/operations/ListHrisTaxonomiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisTaxonomy

Updates the HrisTaxonomy identified by `id`. Provide the unified HrisTaxonomy fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisTaxonomy" method="patch" path="/hris/{connection_id}/taxonomy/{id}" example="hris_taxonomy" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisTaxonomyRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisTaxonomyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisTaxonomyRequest req = PatchHrisTaxonomyRequest.builder()
                .hrisTaxonomy(HrisTaxonomy.builder()
                    .alternativeNames(List.of(
                        "Supervisor",
                        "Customer"))
                    .createdAt(OffsetDateTime.parse("2022-06-23T02:10:00.789Z"))
                    .description("Ea commodo turbo.")
                    .domain("Music")
                    .id("21f4eed2-d858-43ea-a084-a6450dc4bf75")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Chief Accountability Representative")
                    .subcategory("Granite")
                    .type(HrisTaxonomyType.KNOWLEDGE)
                    .updatedAt(OffsetDateTime.parse("2023-06-06T11:41:28.128Z"))
                    .url("https://happy-go-lucky-devastation.com")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisTaxonomyResponse res = sdk.taxonomy().patchHrisTaxonomy()
                .request(req)
                .call();

        if (res.hrisTaxonomy().isPresent()) {
            System.out.println(res.hrisTaxonomy().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchHrisTaxonomyRequest](../../models/operations/PatchHrisTaxonomyRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchHrisTaxonomyResponse](../../models/operations/PatchHrisTaxonomyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisTaxonomy

Deletes the HrisTaxonomy identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisTaxonomy" method="delete" path="/hris/{connection_id}/taxonomy/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTaxonomyRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTaxonomyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisTaxonomyRequest req = RemoveHrisTaxonomyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisTaxonomyResponse res = sdk.taxonomy().removeHrisTaxonomy()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveHrisTaxonomyRequest](../../models/operations/RemoveHrisTaxonomyRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveHrisTaxonomyResponse](../../models/operations/RemoveHrisTaxonomyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisTaxonomy

Updates the HrisTaxonomy identified by `id`. Provide the unified HrisTaxonomy fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisTaxonomy" method="put" path="/hris/{connection_id}/taxonomy/{id}" example="hris_taxonomy" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTaxonomyRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTaxonomyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisTaxonomyRequest req = UpdateHrisTaxonomyRequest.builder()
                .hrisTaxonomy(HrisTaxonomy.builder()
                    .alternativeNames(List.of(
                        "Supervisor",
                        "Customer"))
                    .createdAt(OffsetDateTime.parse("2022-06-23T02:10:00.789Z"))
                    .description("Ea commodo turbo.")
                    .domain("Music")
                    .id("21f4eed2-d858-43ea-a084-a6450dc4bf75")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Chief Accountability Representative")
                    .subcategory("Granite")
                    .type(HrisTaxonomyType.KNOWLEDGE)
                    .updatedAt(OffsetDateTime.parse("2023-06-06T11:41:28.128Z"))
                    .url("https://happy-go-lucky-devastation.com")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisTaxonomyResponse res = sdk.taxonomy().updateHrisTaxonomy()
                .request(req)
                .call();

        if (res.hrisTaxonomy().isPresent()) {
            System.out.println(res.hrisTaxonomy().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateHrisTaxonomyRequest](../../models/operations/UpdateHrisTaxonomyRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateHrisTaxonomyResponse](../../models/operations/UpdateHrisTaxonomyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |