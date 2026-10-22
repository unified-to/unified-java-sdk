# Agedpayable

## Overview

### Available Operations

* [getAccountingAgedpayable](#getaccountingagedpayable) - Retrieve an agedpayable
* [listAccountingAgedpayables](#listaccountingagedpayables) - List all agedpayables

## getAccountingAgedpayable

Retrieves a single AccountingAgedpayable by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingAgedpayable" method="get" path="/accounting/{connection_id}/agedpayable/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingAgedpayableRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingAgedpayableResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingAgedpayableRequest req = GetAccountingAgedpayableRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingAgedpayableResponse res = sdk.agedpayable().getAccountingAgedpayable()
                .request(req)
                .call();

        if (res.accountingAgedpayable().isPresent()) {
            System.out.println(res.accountingAgedpayable().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetAccountingAgedpayableRequest](../../models/operations/GetAccountingAgedpayableRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetAccountingAgedpayableResponse](../../models/operations/GetAccountingAgedpayableResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingAgedpayables

Returns a list of AccountingAgedpayables. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingAgedpayables" method="get" path="/accounting/{connection_id}/agedpayable" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingAgedpayablesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingAgedpayablesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingAgedpayablesRequest req = ListAccountingAgedpayablesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingAgedpayablesResponse res = sdk.agedpayable().listAccountingAgedpayables()
                .request(req)
                .call();

        if (res.accountingAgedpayables().isPresent()) {
            System.out.println(res.accountingAgedpayables().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListAccountingAgedpayablesRequest](../../models/operations/ListAccountingAgedpayablesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListAccountingAgedpayablesResponse](../../models/operations/ListAccountingAgedpayablesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |