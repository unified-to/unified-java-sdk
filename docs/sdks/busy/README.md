# Busy
(*busy()*)

## Overview

### Available Operations

* [listCalendarBusies](#listcalendarbusies) - List all busies

## listCalendarBusies

List all busies

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCalendarBusiesRequest;
import com.unifiedapi.unifiedto.models.operations.ListCalendarBusiesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListCalendarBusiesRequest req = ListCalendarBusiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListCalendarBusiesResponse res = sdk.busy().listCalendarBusies()
                .request(req)
                .call();

        if (res.calendarBusies().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListCalendarBusiesRequest](../../models/operations/ListCalendarBusiesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListCalendarBusiesResponse](../../models/operations/ListCalendarBusiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |