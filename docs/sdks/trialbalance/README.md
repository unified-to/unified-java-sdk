# Trialbalance

## Overview

### Available Operations

* [getAccountingTrialbalance2](#getaccountingtrialbalance2) - Retrieve a trialbalance
* [listAccountingTrialbalances2](#listaccountingtrialbalances2) - List all trialbalances

## getAccountingTrialbalance2

Retrieve a trialbalance

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingTrialbalance2" method="get" path="/accounting/{connection_id}/trialbalance/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingTrialbalance2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingTrialbalance2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingTrialbalance2Request req = GetAccountingTrialbalance2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingTrialbalance2Response res = sdk.trialbalance().getAccountingTrialbalance2()
                .request(req)
                .call();

        if (res.accountingTrialbalance().isPresent()) {
            System.out.println(res.accountingTrialbalance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetAccountingTrialbalance2Request](../../models/operations/GetAccountingTrialbalance2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetAccountingTrialbalance2Response](../../models/operations/GetAccountingTrialbalance2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingTrialbalances2

List all trialbalances

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingTrialbalances2" method="get" path="/accounting/{connection_id}/trialbalance" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingTrialbalances2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingTrialbalances2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingTrialbalances2Request req = ListAccountingTrialbalances2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingTrialbalances2Response res = sdk.trialbalance().listAccountingTrialbalances2()
                .request(req)
                .call();

        if (res.accountingTrialbalances().isPresent()) {
            System.out.println(res.accountingTrialbalances().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [ListAccountingTrialbalances2Request](../../models/operations/ListAccountingTrialbalances2Request.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[ListAccountingTrialbalances2Response](../../models/operations/ListAccountingTrialbalances2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |