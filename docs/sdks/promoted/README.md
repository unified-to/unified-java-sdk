# Promoted

## Overview

### Available Operations

* [getAdsPromoted2](#getadspromoted2) - Retrieve a promoted
* [listAdsPromoteds2](#listadspromoteds2) - List all promoteds

## getAdsPromoted2

Retrieve a promoted

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsPromoted2" method="get" path="/ads/{connection_id}/promoted/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsPromoted2Request;
import to.unified.unified_java_sdk.models.operations.GetAdsPromoted2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsPromoted2Request req = GetAdsPromoted2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsPromoted2Response res = sdk.promoted().getAdsPromoted2()
                .request(req)
                .call();

        if (res.adsPromoted().isPresent()) {
            System.out.println(res.adsPromoted().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetAdsPromoted2Request](../../models/operations/GetAdsPromoted2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetAdsPromoted2Response](../../models/operations/GetAdsPromoted2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsPromoteds2

List all promoteds

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsPromoteds2" method="get" path="/ads/{connection_id}/promoted" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsPromoteds2Request;
import to.unified.unified_java_sdk.models.operations.ListAdsPromoteds2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsPromoteds2Request req = ListAdsPromoteds2Request.builder()
                .connectionId("<id>")
                .build();

        ListAdsPromoteds2Response res = sdk.promoted().listAdsPromoteds2()
                .request(req)
                .call();

        if (res.adsPromoteds().isPresent()) {
            System.out.println(res.adsPromoteds().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAdsPromoteds2Request](../../models/operations/ListAdsPromoteds2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAdsPromoteds2Response](../../models/operations/ListAdsPromoteds2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |