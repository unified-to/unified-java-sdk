# Paycode

## Overview

### Available Operations

* [getHrisPaycode](#gethrispaycode) - Retrieve a paycode
* [listHrisPaycodes](#listhrispaycodes) - List all paycodes

## getHrisPaycode

Retrieves a single HrisPaycode by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisPaycode" method="get" path="/hris/{connection_id}/paycode/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisPaycodeRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisPaycodeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisPaycodeRequest req = GetHrisPaycodeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisPaycodeResponse res = sdk.paycode().getHrisPaycode()
                .request(req)
                .call();

        if (res.hrisPaycode().isPresent()) {
            System.out.println(res.hrisPaycode().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHrisPaycodeRequest](../../models/operations/GetHrisPaycodeRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHrisPaycodeResponse](../../models/operations/GetHrisPaycodeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisPaycodes

Returns a list of HrisPaycodes. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisPaycodes" method="get" path="/hris/{connection_id}/paycode" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisPaycodesRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisPaycodesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisPaycodesRequest req = ListHrisPaycodesRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisPaycodesResponse res = sdk.paycode().listHrisPaycodes()
                .request(req)
                .call();

        if (res.hrisPaycodes().isPresent()) {
            System.out.println(res.hrisPaycodes().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListHrisPaycodesRequest](../../models/operations/ListHrisPaycodesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListHrisPaycodesResponse](../../models/operations/ListHrisPaycodesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |