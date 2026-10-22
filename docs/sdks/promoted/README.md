# Promoted

## Overview

### Available Operations

* [getAdsPromoted](#getadspromoted) - Retrieve a promoted
* [listAdsPromoteds](#listadspromoteds) - List all promoteds

## getAdsPromoted

Retrieves a single AdsPromoted by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsPromoted" method="get" path="/ads/{connection_id}/promoted/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsPromotedRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsPromotedResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsPromotedRequest req = GetAdsPromotedRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsPromotedResponse res = sdk.promoted().getAdsPromoted()
                .request(req)
                .call();

        if (res.adsPromoted().isPresent()) {
            System.out.println(res.adsPromoted().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetAdsPromotedRequest](../../models/operations/GetAdsPromotedRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetAdsPromotedResponse](../../models/operations/GetAdsPromotedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsPromoteds

Returns a list of AdsPromoteds. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsPromoteds" method="get" path="/ads/{connection_id}/promoted" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsPromotedsRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsPromotedsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsPromotedsRequest req = ListAdsPromotedsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsPromotedsResponse res = sdk.promoted().listAdsPromoteds()
                .request(req)
                .call();

        if (res.adsPromoteds().isPresent()) {
            System.out.println(res.adsPromoteds().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListAdsPromotedsRequest](../../models/operations/ListAdsPromotedsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListAdsPromotedsResponse](../../models/operations/ListAdsPromotedsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |