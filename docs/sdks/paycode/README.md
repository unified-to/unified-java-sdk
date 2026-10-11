# Paycode

## Overview

### Available Operations

* [getHrisPaycode](#gethrispaycode) - Retrieve a paycode
* [listHrisPaycodes](#listhrispaycodes) - List all paycodes

## getHrisPaycode

Retrieve a paycode

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

List all paycodes

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