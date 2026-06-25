# Refund

## Overview

### Available Operations

* [getPaymentRefund2](#getpaymentrefund2) - Retrieve a refund
* [listPaymentRefunds2](#listpaymentrefunds2) - List all refunds

## getPaymentRefund2

Retrieve a refund

### Example Usage

<!-- UsageSnippet language="java" operationID="getPaymentRefund2" method="get" path="/payment/{connection_id}/refund/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPaymentRefund2Request;
import to.unified.unified_java_sdk.models.operations.GetPaymentRefund2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPaymentRefund2Request req = GetPaymentRefund2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPaymentRefund2Response res = sdk.refund().getPaymentRefund2()
                .request(req)
                .call();

        if (res.paymentRefund().isPresent()) {
            System.out.println(res.paymentRefund().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetPaymentRefund2Request](../../models/operations/GetPaymentRefund2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetPaymentRefund2Response](../../models/operations/GetPaymentRefund2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPaymentRefunds2

List all refunds

### Example Usage

<!-- UsageSnippet language="java" operationID="listPaymentRefunds2" method="get" path="/payment/{connection_id}/refund" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPaymentRefunds2Request;
import to.unified.unified_java_sdk.models.operations.ListPaymentRefunds2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPaymentRefunds2Request req = ListPaymentRefunds2Request.builder()
                .connectionId("<id>")
                .build();

        ListPaymentRefunds2Response res = sdk.refund().listPaymentRefunds2()
                .request(req)
                .call();

        if (res.paymentRefunds().isPresent()) {
            System.out.println(res.paymentRefunds().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListPaymentRefunds2Request](../../models/operations/ListPaymentRefunds2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListPaymentRefunds2Response](../../models/operations/ListPaymentRefunds2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |