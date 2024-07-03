# Refund
(*refund*)

### Available Operations

* [getPaymentRefund](#getpaymentrefund) - Retrieve a refund
* [listPaymentRefunds](#listpaymentrefunds) - List all refunds

## getPaymentRefund

Retrieve a refund

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetPaymentRefundRequest;
import com.unifiedapi.unifiedto.models.operations.GetPaymentRefundResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetPaymentRefundRequest req = new GetPaymentRefundRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetPaymentRefundResponse res = sdk.refund.getPaymentRefund(req);

            if (res.paymentRefund != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetPaymentRefundRequest](../../models/operations/GetPaymentRefundRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetPaymentRefundResponse](../../models/operations/GetPaymentRefundResponse.md)**


## listPaymentRefunds

List all refunds

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListPaymentRefundsRequest;
import com.unifiedapi.unifiedto.models.operations.ListPaymentRefundsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListPaymentRefundsRequest req = new ListPaymentRefundsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 5820.28d;
                offset = 6141.19d;
                paymentId = "<value>";
                query = "<value>";
                updatedGte = OffsetDateTime.parse("2022-08-03T22:54:27.299Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListPaymentRefundsResponse res = sdk.refund.listPaymentRefunds(req);

            if (res.paymentRefunds != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.ListPaymentRefundsRequest](../../models/operations/ListPaymentRefundsRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListPaymentRefundsResponse](../../models/operations/ListPaymentRefundsResponse.md)**

