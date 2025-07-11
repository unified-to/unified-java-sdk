# Trialbalance
(*trialbalance()*)

## Overview

### Available Operations

* [getAccountingTrialbalance](#getaccountingtrialbalance) - Retrieve a trialbalance
* [listAccountingTrialbalances](#listaccountingtrialbalances) - List all trialbalances

## getAccountingTrialbalance

Retrieve a trialbalance

### Example Usage

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
            // handle response
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

List all trialbalances

### Example Usage

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
            // handle response
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