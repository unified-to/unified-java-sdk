# Promoted

## Overview

### Available Operations

* [listAdsPromoteds](#listadspromoteds) - List all promoteds

## listAdsPromoteds

List all promoteds

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