# Rate

## Overview

### Available Operations

* [createShippingRate](#createshippingrate) - Create a rate

## createShippingRate

Creates a ShippingRate. Provide the unified ShippingRate fields in the request body; they are mapped to the provider's API. Returns the created ShippingRate.

### Example Usage

<!-- UsageSnippet language="java" operationID="createShippingRate" method="post" path="/shipping/{connection_id}/rate" example="shipping_rate" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateShippingRateRequest;
import to.unified.unified_java_sdk.models.operations.CreateShippingRateResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateShippingRateRequest req = CreateShippingRateRequest.builder()
                .shippingRate(ShippingRate.builder()
                    .currency("USD")
                    .id("fd1ff8fe-8991-4765-a0c8-d3c0e8cff60c")
                    .metadata(List.of())
                    .rates(List.of(
                        ShippingRateRate.builder()
                            .title("Express")
                            .amount(44.72)
                            .baseAmount(46.01)
                            .currency("USD")
                            .deliveryDays(2d)
                            .description("Veniam denego vulgo bos turpis pax.")
                            .discountAmount(4.6)
                            .estimatedDays(2d)
                            .estimatedDeliveryEndAt(OffsetDateTime.parse("2021-09-03T01:03:36.021Z"))
                            .isNegotiatedRate(true)
                            .taxAmount(3.31)
                            .build()))
                    .build())
                .connectionId("<id>")
                .build();

        CreateShippingRateResponse res = sdk.rate().createShippingRate()
                .request(req)
                .call();

        if (res.shippingRate().isPresent()) {
            System.out.println(res.shippingRate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateShippingRateRequest](../../models/operations/CreateShippingRateRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateShippingRateResponse](../../models/operations/CreateShippingRateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |