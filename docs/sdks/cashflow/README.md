# Cashflow

## Overview

### Available Operations

* [getAccountingCashflow2](#getaccountingcashflow2) - Retrieve a cashflow
* [listAccountingCashflows2](#listaccountingcashflows2) - List all cashflows

## getAccountingCashflow2

Retrieve a cashflow

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingCashflow2" method="get" path="/accounting/{connection_id}/cashflow/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingCashflow2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingCashflow2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingCashflow2Request req = GetAccountingCashflow2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingCashflow2Response res = sdk.cashflow().getAccountingCashflow2()
                .request(req)
                .call();

        if (res.accountingCashflow().isPresent()) {
            System.out.println(res.accountingCashflow().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetAccountingCashflow2Request](../../models/operations/GetAccountingCashflow2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetAccountingCashflow2Response](../../models/operations/GetAccountingCashflow2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingCashflows2

List all cashflows

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingCashflows2" method="get" path="/accounting/{connection_id}/cashflow" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingCashflows2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingCashflows2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingCashflows2Request req = ListAccountingCashflows2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingCashflows2Response res = sdk.cashflow().listAccountingCashflows2()
                .request(req)
                .call();

        if (res.accountingCashflows().isPresent()) {
            System.out.println(res.accountingCashflows().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListAccountingCashflows2Request](../../models/operations/ListAccountingCashflows2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListAccountingCashflows2Response](../../models/operations/ListAccountingCashflows2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |