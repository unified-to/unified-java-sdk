# Refund
(*refund*)

### Available Operations

* [getAccountingRefund](#getaccountingrefund) - Retrieve a refund
* [listAccountingRefunds](#listaccountingrefunds) - List all refunds

## getAccountingRefund

Retrieve a refund

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingRefundRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingRefundResponse;
import com.unifiedapi.unifiedto.models.operations.GetAccountingRefundSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetAccountingRefundRequest req = new GetAccountingRefundRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingRefundResponse res = sdk.refund.getAccountingRefund(req, new GetAccountingRefundSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.accountingRefund != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetAccountingRefundRequest](../../models/operations/GetAccountingRefundRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetAccountingRefundSecurity](../../models/operations/GetAccountingRefundSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingRefundResponse](../../models/operations/GetAccountingRefundResponse.md)**


## listAccountingRefunds

List all refunds

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingRefundsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingRefundsResponse;
import com.unifiedapi.unifiedto.models.operations.ListAccountingRefundsSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListAccountingRefundsRequest req = new ListAccountingRefundsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 8743.36d;
                offset = 6995.02d;
                order = "<value>";
                paymentId = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2024-09-01T03:28:05.895Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingRefundsResponse res = sdk.refund.listAccountingRefunds(req, new ListAccountingRefundsSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.accountingRefunds != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListAccountingRefundsRequest](../../models/operations/ListAccountingRefundsRequest.md)   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.ListAccountingRefundsSecurity](../../models/operations/ListAccountingRefundsSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingRefundsResponse](../../models/operations/ListAccountingRefundsResponse.md)**

