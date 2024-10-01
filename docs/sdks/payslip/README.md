# Payslip
(*payslip()*)

## Overview

### Available Operations

* [getHrisPayslip](#gethrispayslip) - Retrieve a payslip
* [listHrisPayslips](#listhrispayslips) - List all payslips

## getHrisPayslip

Retrieve a payslip

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetHrisPayslipRequest;
import com.unifiedapi.unifiedto.models.operations.GetHrisPayslipResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetHrisPayslipRequest req = GetHrisPayslipRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisPayslipResponse res = sdk.payslip().getHrisPayslip()
                .request(req)
                .call();

        if (res.hrisPayslip().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHrisPayslipRequest](../../models/operations/GetHrisPayslipRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHrisPayslipResponse](../../models/operations/GetHrisPayslipResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisPayslips

List all payslips

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListHrisPayslipsRequest;
import com.unifiedapi.unifiedto.models.operations.ListHrisPayslipsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListHrisPayslipsRequest req = ListHrisPayslipsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisPayslipsResponse res = sdk.payslip().listHrisPayslips()
                .request(req)
                .call();

        if (res.hrisPayslips().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListHrisPayslipsRequest](../../models/operations/ListHrisPayslipsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListHrisPayslipsResponse](../../models/operations/ListHrisPayslipsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |