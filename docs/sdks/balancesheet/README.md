# Balancesheet

## Overview

### Available Operations

* [getAccountingBalancesheet2](#getaccountingbalancesheet2) - Retrieve a balancesheet
* [listAccountingBalancesheets2](#listaccountingbalancesheets2) - List all balancesheets

## getAccountingBalancesheet2

Retrieve a balancesheet

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingBalancesheet2" method="get" path="/accounting/{connection_id}/balancesheet/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingBalancesheet2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingBalancesheet2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingBalancesheet2Request req = GetAccountingBalancesheet2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingBalancesheet2Response res = sdk.balancesheet().getAccountingBalancesheet2()
                .request(req)
                .call();

        if (res.accountingBalancesheet().isPresent()) {
            System.out.println(res.accountingBalancesheet().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetAccountingBalancesheet2Request](../../models/operations/GetAccountingBalancesheet2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetAccountingBalancesheet2Response](../../models/operations/GetAccountingBalancesheet2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingBalancesheets2

List all balancesheets

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingBalancesheets2" method="get" path="/accounting/{connection_id}/balancesheet" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingBalancesheets2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingBalancesheets2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingBalancesheets2Request req = ListAccountingBalancesheets2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingBalancesheets2Response res = sdk.balancesheet().listAccountingBalancesheets2()
                .request(req)
                .call();

        if (res.accountingBalancesheets().isPresent()) {
            System.out.println(res.accountingBalancesheets().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [ListAccountingBalancesheets2Request](../../models/operations/ListAccountingBalancesheets2Request.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[ListAccountingBalancesheets2Response](../../models/operations/ListAccountingBalancesheets2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |