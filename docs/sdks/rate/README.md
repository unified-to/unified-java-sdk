# Rate

## Overview

### Available Operations

* [createShippingRate](#createshippingrate) - Create a rate

## createShippingRate

Create a rate

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
                    .id("92e94617-be54-4f3a-a54e-cb9f9ce2dfcc")
                    .rates(List.of(
                        ShippingRateRate.builder()
                            .title("Turcotte Inc")
                            .amount(54.679719475097954)
                            .baseAmount(76.45537888631225)
                            .currency("USD")
                            .deliveryDays(8d)
                            .description("Bos turpis pax amet dolorem sufficio demonstro complectus benevolentia rerum.")
                            .estimatedDays(10d)
                            .estimatedDeliveryEndAt(OffsetDateTime.parse("2024-02-01T22:42:52.727Z"))
                            .isGuaranteed(true)
                            .isNegotiatedRate(true)
                            .taxAmount(2.2701712837442756)
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