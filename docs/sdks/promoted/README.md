# Promoted

## Overview

### Available Operations

* [listAdsPromotedes](#listadspromotedes) - List all promotedes

## listAdsPromotedes

List all promotedes

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsPromotedes" method="get" path="/ads/{connection_id}/promoted" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsPromotedesRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsPromotedesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsPromotedesRequest req = ListAdsPromotedesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsPromotedesResponse res = sdk.promoted().listAdsPromotedes()
                .request(req)
                .call();

        if (res.adsPromotedes().isPresent()) {
            System.out.println(res.adsPromotedes().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAdsPromotedesRequest](../../models/operations/ListAdsPromotedesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAdsPromotedesResponse](../../models/operations/ListAdsPromotedesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |