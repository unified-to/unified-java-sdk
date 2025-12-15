# Balancesheet

## Overview

### Available Operations

* [getAccountingBalancesheet](#getaccountingbalancesheet) - Retrieve a balancesheet
* [listAccountingBalancesheets](#listaccountingbalancesheets) - List all balancesheets

## getAccountingBalancesheet

Retrieve a balancesheet

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingBalancesheet" method="get" path="/accounting/{connection_id}/balancesheet/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingBalancesheetRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingBalancesheetResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingBalancesheetRequest req = GetAccountingBalancesheetRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingBalancesheetResponse res = sdk.balancesheet().getAccountingBalancesheet()
                .request(req)
                .call();

        if (res.accountingBalancesheet().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetAccountingBalancesheetRequest](../../models/operations/GetAccountingBalancesheetRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetAccountingBalancesheetResponse](../../models/operations/GetAccountingBalancesheetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingBalancesheets

List all balancesheets

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingBalancesheets" method="get" path="/accounting/{connection_id}/balancesheet" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingBalancesheetsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingBalancesheetsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingBalancesheetsRequest req = ListAccountingBalancesheetsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingBalancesheetsResponse res = sdk.balancesheet().listAccountingBalancesheets()
                .request(req)
                .call();

        if (res.accountingBalancesheets().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListAccountingBalancesheetsRequest](../../models/operations/ListAccountingBalancesheetsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListAccountingBalancesheetsResponse](../../models/operations/ListAccountingBalancesheetsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |