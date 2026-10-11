# Salesreceipt

## Overview

### Available Operations

* [getAccountingSalesreceipt](#getaccountingsalesreceipt) - Retrieve a salesreceipt
* [listAccountingSalesreceipts](#listaccountingsalesreceipts) - List all salesreceipts

## getAccountingSalesreceipt

Retrieve a salesreceipt

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingSalesreceipt" method="get" path="/accounting/{connection_id}/salesreceipt/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingSalesreceiptRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingSalesreceiptResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingSalesreceiptRequest req = GetAccountingSalesreceiptRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingSalesreceiptResponse res = sdk.salesreceipt().getAccountingSalesreceipt()
                .request(req)
                .call();

        if (res.accountingSalesreceipt().isPresent()) {
            System.out.println(res.accountingSalesreceipt().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetAccountingSalesreceiptRequest](../../models/operations/GetAccountingSalesreceiptRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetAccountingSalesreceiptResponse](../../models/operations/GetAccountingSalesreceiptResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingSalesreceipts

List all salesreceipts

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingSalesreceipts" method="get" path="/accounting/{connection_id}/salesreceipt" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingSalesreceiptsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingSalesreceiptsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingSalesreceiptsRequest req = ListAccountingSalesreceiptsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingSalesreceiptsResponse res = sdk.salesreceipt().listAccountingSalesreceipts()
                .request(req)
                .call();

        if (res.accountingSalesreceipts().isPresent()) {
            System.out.println(res.accountingSalesreceipts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListAccountingSalesreceiptsRequest](../../models/operations/ListAccountingSalesreceiptsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListAccountingSalesreceiptsResponse](../../models/operations/ListAccountingSalesreceiptsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |