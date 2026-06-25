# Busy

## Overview

### Available Operations

* [listCalendarBusies2](#listcalendarbusies2) - List all busies

## listCalendarBusies2

List all busies

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarBusies2" method="get" path="/calendar/{connection_id}/busy" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarBusies2Request;
import to.unified.unified_java_sdk.models.operations.ListCalendarBusies2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarBusies2Request req = ListCalendarBusies2Request.builder()
                .connectionId("<id>")
                .build();

        ListCalendarBusies2Response res = sdk.busy().listCalendarBusies2()
                .request(req)
                .call();

        if (res.calendarBusies().isPresent()) {
            System.out.println(res.calendarBusies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListCalendarBusies2Request](../../models/operations/ListCalendarBusies2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListCalendarBusies2Response](../../models/operations/ListCalendarBusies2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |