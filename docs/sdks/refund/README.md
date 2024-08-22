# Refund
(*refund()*)

## Overview

### Available Operations

* [getPaymentRefund](#getpaymentrefund) - Retrieve a refund
* [listPaymentRefunds](#listpaymentrefunds) - List all refunds

## getPaymentRefund

Retrieve a refund

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.GetPaymentRefundRequest;
import com.unifiedapi.unifiedto.models.operations.GetPaymentRefundResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GetPaymentRefundRequest req = GetPaymentRefundRequest.builder()
                .connectionId("<value>")
                .id("<value>")
                .build();

            GetPaymentRefundResponse res = sdk.refund().getPaymentRefund()
                .request(req)
                .call();

            if (res.paymentRefund().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
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

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## listPaymentRefunds

List all refunds

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.ListPaymentRefundsRequest;
import com.unifiedapi.unifiedto.models.operations.ListPaymentRefundsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            ListPaymentRefundsRequest req = ListPaymentRefundsRequest.builder()
                .connectionId("<value>")
                .build();

            ListPaymentRefundsResponse res = sdk.refund().listPaymentRefunds()
                .request(req)
                .call();

            if (res.paymentRefunds().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
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

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
