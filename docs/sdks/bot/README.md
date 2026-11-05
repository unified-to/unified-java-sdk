# Bot

## Overview

### Available Operations

* [createCalendarBot](#createcalendarbot) - Create a bot
* [getCalendarBot](#getcalendarbot) - Retrieve a bot
* [listCalendarBots](#listcalendarbots) - List all bots
* [patchCalendarBot](#patchcalendarbot) - Update a bot
* [removeCalendarBot](#removecalendarbot) - Remove a bot
* [updateCalendarBot](#updatecalendarbot) - Update a bot

## createCalendarBot

Creates a CalendarBot. Provide the unified CalendarBot fields in the request body; they are mapped to the provider's API. Returns the created CalendarBot.

### Example Usage

<!-- UsageSnippet language="java" operationID="createCalendarBot" method="post" path="/calendar/{connection_id}/bot" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCalendarBotRequest;
import to.unified.unified_java_sdk.models.operations.CreateCalendarBotResponse;
import to.unified.unified_java_sdk.models.shared.CalendarBot;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCalendarBotRequest req = CreateCalendarBotRequest.builder()
                .calendarBot(CalendarBot.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCalendarBotResponse res = sdk.bot().createCalendarBot()
                .request(req)
                .call();

        if (res.calendarBot().isPresent()) {
            System.out.println(res.calendarBot().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateCalendarBotRequest](../../models/operations/CreateCalendarBotRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateCalendarBotResponse](../../models/operations/CreateCalendarBotResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCalendarBot

Retrieves a single CalendarBot by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getCalendarBot" method="get" path="/calendar/{connection_id}/bot/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCalendarBotRequest;
import to.unified.unified_java_sdk.models.operations.GetCalendarBotResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCalendarBotRequest req = GetCalendarBotRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCalendarBotResponse res = sdk.bot().getCalendarBot()
                .request(req)
                .call();

        if (res.calendarBot().isPresent()) {
            System.out.println(res.calendarBot().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetCalendarBotRequest](../../models/operations/GetCalendarBotRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetCalendarBotResponse](../../models/operations/GetCalendarBotResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCalendarBots

Returns a list of CalendarBots. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarBots" method="get" path="/calendar/{connection_id}/bot" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarBotsRequest;
import to.unified.unified_java_sdk.models.operations.ListCalendarBotsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarBotsRequest req = ListCalendarBotsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCalendarBotsResponse res = sdk.bot().listCalendarBots()
                .request(req)
                .call();

        if (res.calendarBots().isPresent()) {
            System.out.println(res.calendarBots().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListCalendarBotsRequest](../../models/operations/ListCalendarBotsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListCalendarBotsResponse](../../models/operations/ListCalendarBotsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCalendarBot

Updates the CalendarBot identified by `id`. Provide the unified CalendarBot fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarBot" method="patch" path="/calendar/{connection_id}/bot/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCalendarBotRequest;
import to.unified.unified_java_sdk.models.operations.PatchCalendarBotResponse;
import to.unified.unified_java_sdk.models.shared.CalendarBot;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCalendarBotRequest req = PatchCalendarBotRequest.builder()
                .calendarBot(CalendarBot.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCalendarBotResponse res = sdk.bot().patchCalendarBot()
                .request(req)
                .call();

        if (res.calendarBot().isPresent()) {
            System.out.println(res.calendarBot().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchCalendarBotRequest](../../models/operations/PatchCalendarBotRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchCalendarBotResponse](../../models/operations/PatchCalendarBotResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCalendarBot

Deletes the CalendarBot identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCalendarBot" method="delete" path="/calendar/{connection_id}/bot/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarBotRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarBotResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCalendarBotRequest req = RemoveCalendarBotRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCalendarBotResponse res = sdk.bot().removeCalendarBot()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveCalendarBotRequest](../../models/operations/RemoveCalendarBotRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveCalendarBotResponse](../../models/operations/RemoveCalendarBotResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCalendarBot

Updates the CalendarBot identified by `id`. Provide the unified CalendarBot fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCalendarBot" method="put" path="/calendar/{connection_id}/bot/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarBotRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarBotResponse;
import to.unified.unified_java_sdk.models.shared.CalendarBot;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCalendarBotRequest req = UpdateCalendarBotRequest.builder()
                .calendarBot(CalendarBot.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCalendarBotResponse res = sdk.bot().updateCalendarBot()
                .request(req)
                .call();

        if (res.calendarBot().isPresent()) {
            System.out.println(res.calendarBot().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateCalendarBotRequest](../../models/operations/UpdateCalendarBotRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateCalendarBotResponse](../../models/operations/UpdateCalendarBotResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |