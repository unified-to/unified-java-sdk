# Payout

## Overview

### Available Operations

* [getPaymentPayout2](#getpaymentpayout2) - Retrieve a payout
* [listPaymentPayouts2](#listpaymentpayouts2) - List all payouts

## getPaymentPayout2

Retrieve a payout

### Example Usage

<!-- UsageSnippet language="java" operationID="getPaymentPayout2" method="get" path="/payment/{connection_id}/payout/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPaymentPayout2Request;
import to.unified.unified_java_sdk.models.operations.GetPaymentPayout2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPaymentPayout2Request req = GetPaymentPayout2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPaymentPayout2Response res = sdk.payout().getPaymentPayout2()
                .request(req)
                .call();

        if (res.paymentPayout().isPresent()) {
            System.out.println(res.paymentPayout().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetPaymentPayout2Request](../../models/operations/GetPaymentPayout2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetPaymentPayout2Response](../../models/operations/GetPaymentPayout2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPaymentPayouts2

List all payouts

### Example Usage

<!-- UsageSnippet language="java" operationID="listPaymentPayouts2" method="get" path="/payment/{connection_id}/payout" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPaymentPayouts2Request;
import to.unified.unified_java_sdk.models.operations.ListPaymentPayouts2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPaymentPayouts2Request req = ListPaymentPayouts2Request.builder()
                .connectionId("<id>")
                .build();

        ListPaymentPayouts2Response res = sdk.payout().listPaymentPayouts2()
                .request(req)
                .call();

        if (res.paymentPayouts().isPresent()) {
            System.out.println(res.paymentPayouts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListPaymentPayouts2Request](../../models/operations/ListPaymentPayouts2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListPaymentPayouts2Response](../../models/operations/ListPaymentPayouts2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |