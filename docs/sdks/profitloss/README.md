# Profitloss

## Overview

### Available Operations

* [getAccountingProfitloss2](#getaccountingprofitloss2) - Retrieve a profitloss
* [listAccountingProfitlosses2](#listaccountingprofitlosses2) - List all profitlosses

## getAccountingProfitloss2

Retrieve a profitloss

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingProfitloss2" method="get" path="/accounting/{connection_id}/profitloss/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingProfitloss2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingProfitloss2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingProfitloss2Request req = GetAccountingProfitloss2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingProfitloss2Response res = sdk.profitloss().getAccountingProfitloss2()
                .request(req)
                .call();

        if (res.accountingProfitloss().isPresent()) {
            System.out.println(res.accountingProfitloss().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetAccountingProfitloss2Request](../../models/operations/GetAccountingProfitloss2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetAccountingProfitloss2Response](../../models/operations/GetAccountingProfitloss2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingProfitlosses2

List all profitlosses

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingProfitlosses2" method="get" path="/accounting/{connection_id}/profitloss" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingProfitlosses2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingProfitlosses2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingProfitlosses2Request req = ListAccountingProfitlosses2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingProfitlosses2Response res = sdk.profitloss().listAccountingProfitlosses2()
                .request(req)
                .call();

        if (res.accountingProfitlosses().isPresent()) {
            System.out.println(res.accountingProfitlosses().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListAccountingProfitlosses2Request](../../models/operations/ListAccountingProfitlosses2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListAccountingProfitlosses2Response](../../models/operations/ListAccountingProfitlosses2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |