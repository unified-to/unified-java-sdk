# Target

## Overview

### Available Operations

* [getAdsTarget](#getadstarget) - Retrieve a target
* [listAdsTargets](#listadstargets) - List all targets

## getAdsTarget

Retrieves a single AdsTarget by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsTarget" method="get" path="/ads/{connection_id}/target/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsTargetRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsTargetResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsTargetRequest req = GetAdsTargetRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsTargetResponse res = sdk.target().getAdsTarget()
                .request(req)
                .call();

        if (res.adsTarget().isPresent()) {
            System.out.println(res.adsTarget().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetAdsTargetRequest](../../models/operations/GetAdsTargetRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetAdsTargetResponse](../../models/operations/GetAdsTargetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsTargets

Returns a list of AdsTargets. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsTargets" method="get" path="/ads/{connection_id}/target" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsTargetsRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsTargetsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsTargetsRequest req = ListAdsTargetsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsTargetsResponse res = sdk.target().listAdsTargets()
                .request(req)
                .call();

        if (res.adsTargets().isPresent()) {
            System.out.println(res.adsTargets().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListAdsTargetsRequest](../../models/operations/ListAdsTargetsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListAdsTargetsResponse](../../models/operations/ListAdsTargetsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |