# Taxonomy

## Overview

### Available Operations

* [createHrisTaxonomy](#createhristaxonomy) - Create a taxonomy
* [getHrisTaxonomy](#gethristaxonomy) - Retrieve a taxonomy
* [listCrmTaxonomies](#listcrmtaxonomies) - List all taxonomies
* [listHrisTaxonomies](#listhristaxonomies) - List all taxonomies

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
                        "Facilitator",
                        "National"))
                    .createdAt(OffsetDateTime.parse("2022-06-23T02:10:00.789Z"))
                    .description("Uterque vespillo adnuo ea commodo turbo suscipio condico.")
                    .domain("Health")
                    .id("d8d8817c-c339-40ed-ad66-da729299d828")
                    .isActive(false)
                    .metadata(List.of())
                    .name("International Functionality Architect")
                    .subcategory("Marble")
                    .type(HrisTaxonomyType.KNOWLEDGE)
                    .updatedAt(OffsetDateTime.parse("2023-05-29T23:04:06.629Z"))
                    .url("https://fixed-membership.biz/")
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