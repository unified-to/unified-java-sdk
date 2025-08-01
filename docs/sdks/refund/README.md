# Refund
(*refund()*)

## Overview

### Available Operations

* [getPaymentRefund](#getpaymentrefund) - Retrieve a refund
* [listPaymentRefunds](#listpaymentrefunds) - List all refunds

## getPaymentRefund

Retrieve a refund

### Example Usage

<!-- UsageSnippet language="java" operationID="getPaymentRefund" method="get" path="/payment/{connection_id}/refund/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPaymentRefundRequest;
import to.unified.unified_java_sdk.models.operations.GetPaymentRefundResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPaymentRefundRequest req = GetPaymentRefundRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPaymentRefundResponse res = sdk.refund().getPaymentRefund()
                .request(req)
                .call();

        if (res.paymentRefund().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetPaymentRefundRequest](../../models/operations/GetPaymentRefundRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetPaymentRefundResponse](../../models/operations/GetPaymentRefundResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPaymentRefunds

List all refunds

### Example Usage

<!-- UsageSnippet language="java" operationID="listPaymentRefunds" method="get" path="/payment/{connection_id}/refund" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPaymentRefundsRequest;
import to.unified.unified_java_sdk.models.operations.ListPaymentRefundsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPaymentRefundsRequest req = ListPaymentRefundsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPaymentRefundsResponse res = sdk.refund().listPaymentRefunds()
                .request(req)
                .call();

        if (res.paymentRefunds().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListPaymentRefundsRequest](../../models/operations/ListPaymentRefundsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListPaymentRefundsResponse](../../models/operations/ListPaymentRefundsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |