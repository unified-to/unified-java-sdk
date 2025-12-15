# Cashflow

## Overview

### Available Operations

* [getAccountingCashflow](#getaccountingcashflow) - Retrieve a cashflow
* [listAccountingCashflows](#listaccountingcashflows) - List all cashflows

## getAccountingCashflow

Retrieve a cashflow

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingCashflow" method="get" path="/accounting/{connection_id}/cashflow/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingCashflowRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingCashflowResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingCashflowRequest req = GetAccountingCashflowRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingCashflowResponse res = sdk.cashflow().getAccountingCashflow()
                .request(req)
                .call();

        if (res.accountingCashflow().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAccountingCashflowRequest](../../models/operations/GetAccountingCashflowRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAccountingCashflowResponse](../../models/operations/GetAccountingCashflowResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingCashflows

List all cashflows

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingCashflows" method="get" path="/accounting/{connection_id}/cashflow" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingCashflowsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingCashflowsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingCashflowsRequest req = ListAccountingCashflowsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingCashflowsResponse res = sdk.cashflow().listAccountingCashflows()
                .request(req)
                .call();

        if (res.accountingCashflows().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListAccountingCashflowsRequest](../../models/operations/ListAccountingCashflowsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListAccountingCashflowsResponse](../../models/operations/ListAccountingCashflowsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |