# Payout
(*payout*)

### Available Operations

* [getPaymentPayout](#getpaymentpayout) - Retrieve a payout
* [listPaymentPayouts](#listpaymentpayouts) - List all payouts

## getPaymentPayout

Retrieve a payout

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetPaymentPayoutRequest;
import com.unifiedapi.unifiedto.models.operations.GetPaymentPayoutResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetPaymentPayoutRequest req = new GetPaymentPayoutRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetPaymentPayoutResponse res = sdk.payout.getPaymentPayout(req);

            if (res.paymentPayout != null) {
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
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetPaymentPayoutRequest](../../models/operations/GetPaymentPayoutRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetPaymentPayoutResponse](../../models/operations/GetPaymentPayoutResponse.md)**


## listPaymentPayouts

List all payouts

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListPaymentPayoutsRequest;
import com.unifiedapi.unifiedto.models.operations.ListPaymentPayoutsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListPaymentPayoutsRequest req = new ListPaymentPayoutsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 5474.75d;
                offset = 586.95d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2023-12-05T08:15:58.034Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListPaymentPayoutsResponse res = sdk.payout.listPaymentPayouts(req);

            if (res.paymentPayouts != null) {
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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.ListPaymentPayoutsRequest](../../models/operations/ListPaymentPayoutsRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListPaymentPayoutsResponse](../../models/operations/ListPaymentPayoutsResponse.md)**

