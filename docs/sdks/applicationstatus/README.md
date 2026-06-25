# Applicationstatus

## Overview

### Available Operations

* [listAtsApplicationstatuses2](#listatsapplicationstatuses2) - List all applicationstatuses

## listAtsApplicationstatuses2

List all applicationstatuses

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsApplicationstatuses2" method="get" path="/ats/{connection_id}/applicationstatus" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsApplicationstatuses2Request;
import to.unified.unified_java_sdk.models.operations.ListAtsApplicationstatuses2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsApplicationstatuses2Request req = ListAtsApplicationstatuses2Request.builder()
                .connectionId("<id>")
                .build();

        ListAtsApplicationstatuses2Response res = sdk.applicationstatus().listAtsApplicationstatuses2()
                .request(req)
                .call();

        if (res.atsStatuses().isPresent()) {
            System.out.println(res.atsStatuses().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListAtsApplicationstatuses2Request](../../models/operations/ListAtsApplicationstatuses2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListAtsApplicationstatuses2Response](../../models/operations/ListAtsApplicationstatuses2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |