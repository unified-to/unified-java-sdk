# Trialbalance

## Overview

### Available Operations

* [getAccountingTrialbalance](#getaccountingtrialbalance) - Retrieve a trialbalance
* [listAccountingTrialbalances](#listaccountingtrialbalances) - List all trialbalances

## getAccountingTrialbalance

Retrieves a single AccountingTrialbalance by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingTrialbalance" method="get" path="/accounting/{connection_id}/trialbalance/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingTrialbalanceRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingTrialbalanceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingTrialbalanceRequest req = GetAccountingTrialbalanceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingTrialbalanceResponse res = sdk.trialbalance().getAccountingTrialbalance()
                .request(req)
                .call();

        if (res.accountingTrialbalance().isPresent()) {
            System.out.println(res.accountingTrialbalance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetAccountingTrialbalanceRequest](../../models/operations/GetAccountingTrialbalanceRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetAccountingTrialbalanceResponse](../../models/operations/GetAccountingTrialbalanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingTrialbalances

Returns a list of AccountingTrialbalances. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingTrialbalances" method="get" path="/accounting/{connection_id}/trialbalance" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingTrialbalancesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingTrialbalancesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingTrialbalancesRequest req = ListAccountingTrialbalancesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingTrialbalancesResponse res = sdk.trialbalance().listAccountingTrialbalances()
                .request(req)
                .call();

        if (res.accountingTrialbalances().isPresent()) {
            System.out.println(res.accountingTrialbalances().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListAccountingTrialbalancesRequest](../../models/operations/ListAccountingTrialbalancesRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListAccountingTrialbalancesResponse](../../models/operations/ListAccountingTrialbalancesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |