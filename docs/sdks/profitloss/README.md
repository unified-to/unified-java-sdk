# Profitloss
(*profitloss()*)

## Overview

### Available Operations

* [getAccountingProfitloss](#getaccountingprofitloss) - Retrieve a profitloss
* [listAccountingProfitlosses](#listaccountingprofitlosses) - List all profitlosses

## getAccountingProfitloss

Retrieve a profitloss

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingProfitlossRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingProfitlossResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingProfitlossRequest req = GetAccountingProfitlossRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingProfitlossResponse res = sdk.profitloss().getAccountingProfitloss()
                .request(req)
                .call();

        if (res.accountingProfitloss().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetAccountingProfitlossRequest](../../models/operations/GetAccountingProfitlossRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetAccountingProfitlossResponse](../../models/operations/GetAccountingProfitlossResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingProfitlosses

List all profitlosses

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingProfitlossesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingProfitlossesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingProfitlossesRequest req = ListAccountingProfitlossesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingProfitlossesResponse res = sdk.profitloss().listAccountingProfitlosses()
                .request(req)
                .call();

        if (res.accountingProfitlosses().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListAccountingProfitlossesRequest](../../models/operations/ListAccountingProfitlossesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListAccountingProfitlossesResponse](../../models/operations/ListAccountingProfitlossesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |