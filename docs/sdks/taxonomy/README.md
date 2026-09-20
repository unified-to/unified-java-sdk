# Taxonomy

## Overview

### Available Operations

* [createHrisTaxonomy](#createhristaxonomy) - Create a taxonomy
* [getHrisTaxonomy](#gethristaxonomy) - Retrieve a taxonomy
* [listCrmTaxonomies](#listcrmtaxonomies) - List all taxonomies
* [listHrisTaxonomies](#listhristaxonomies) - List all taxonomies

## createHrisTaxonomy

Create a taxonomy

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
                    .createdAt(OffsetDateTime.parse("2022-06-23T02:10:00.789Z"))
                    .description("Apto demonstro audacia adstringo cursim tristis solio careo.")
                    .domain("Electronics")
                    .id("ede085db-5709-4d53-a490-746f3de5be17")
                    .isActive(false)
                    .name("International Functionality Architect")
                    .parentId("6524b2a7-6520-4e15-8c4e-1aa6793db837")
                    .roleIds(List.of(
                        "2b1ef757-eb4c-4207-8af1-929afe49cd65"))
                    .subcategory("Bamboo")
                    .type(HrisTaxonomyType.KNOWLEDGE)
                    .updatedAt(OffsetDateTime.parse("2023-05-22T15:32:00.590Z"))
                    .url("https://our-polarisation.name")
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

Retrieve a taxonomy

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

List all taxonomies

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

List all taxonomies

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