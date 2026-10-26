# Room

## Overview

### Available Operations

* [getCalendarRoom](#getcalendarroom) - Retrieve a room
* [listCalendarRooms](#listcalendarrooms) - List all rooms

## getCalendarRoom

Retrieves a single CalendarRoom by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getCalendarRoom" method="get" path="/calendar/{connection_id}/room/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCalendarRoomRequest;
import to.unified.unified_java_sdk.models.operations.GetCalendarRoomResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCalendarRoomRequest req = GetCalendarRoomRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCalendarRoomResponse res = sdk.room().getCalendarRoom()
                .request(req)
                .call();

        if (res.calendarRoom().isPresent()) {
            System.out.println(res.calendarRoom().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetCalendarRoomRequest](../../models/operations/GetCalendarRoomRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetCalendarRoomResponse](../../models/operations/GetCalendarRoomResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCalendarRooms

Returns a list of CalendarRooms. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarRooms" method="get" path="/calendar/{connection_id}/room" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarRoomsRequest;
import to.unified.unified_java_sdk.models.operations.ListCalendarRoomsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarRoomsRequest req = ListCalendarRoomsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCalendarRoomsResponse res = sdk.room().listCalendarRooms()
                .request(req)
                .call();

        if (res.calendarRooms().isPresent()) {
            System.out.println(res.calendarRooms().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListCalendarRoomsRequest](../../models/operations/ListCalendarRoomsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListCalendarRoomsResponse](../../models/operations/ListCalendarRoomsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |