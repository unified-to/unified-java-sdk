# Rate

## Overview

### Available Operations

* [createShippingRate2](#createshippingrate2) - Create a rate

## createShippingRate2

Create a rate

### Example Usage

<!-- UsageSnippet language="java" operationID="createShippingRate2" method="post" path="/shipping/{connection_id}/rate" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateShippingRate2Request;
import to.unified.unified_java_sdk.models.operations.CreateShippingRate2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.ShippingRate;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateShippingRate2Request req = CreateShippingRate2Request.builder()
                .shippingRate(ShippingRate.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateShippingRate2Response res = sdk.rate().createShippingRate2()
                .request(req)
                .call();

        if (res.shippingRate().isPresent()) {
            System.out.println(res.shippingRate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateShippingRate2Request](../../models/operations/CreateShippingRate2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateShippingRate2Response](../../models/operations/CreateShippingRate2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |