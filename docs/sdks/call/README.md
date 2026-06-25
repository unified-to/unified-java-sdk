# Call

## Overview

### Available Operations

* [getUcCall2](#getuccall2) - Retrieve a call
* [listUcCalls2](#listuccalls2) - List all calls

## getUcCall2

Retrieve a call

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcCall2" method="get" path="/uc/{connection_id}/call/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcCall2Request;
import to.unified.unified_java_sdk.models.operations.GetUcCall2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcCall2Request req = GetUcCall2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcCall2Response res = sdk.call().getUcCall2()
                .request(req)
                .call();

        if (res.ucCall().isPresent()) {
            System.out.println(res.ucCall().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetUcCall2Request](../../models/operations/GetUcCall2Request.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetUcCall2Response](../../models/operations/GetUcCall2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUcCalls2

List all calls

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcCalls2" method="get" path="/uc/{connection_id}/call" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcCalls2Request;
import to.unified.unified_java_sdk.models.operations.ListUcCalls2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcCalls2Request req = ListUcCalls2Request.builder()
                .connectionId("<id>")
                .build();

        ListUcCalls2Response res = sdk.call().listUcCalls2()
                .request(req)
                .call();

        if (res.ucCalls().isPresent()) {
            System.out.println(res.ucCalls().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListUcCalls2Request](../../models/operations/ListUcCalls2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListUcCalls2Response](../../models/operations/ListUcCalls2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |