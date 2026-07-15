# Taxonomy

## Overview

### Available Operations

* [getHrisTaxonomy](#gethristaxonomy) - Retrieve a taxonomy
* [listHrisTaxonomies](#listhristaxonomies) - List all taxonomies

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