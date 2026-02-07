# Webinar

## Overview

### Available Operations

* [createCalendarWebinar](#createcalendarwebinar) - Create a webinar
* [getCalendarWebinar](#getcalendarwebinar) - Retrieve a webinar
* [listCalendarWebinars](#listcalendarwebinars) - List all webinars
* [patchCalendarWebinar](#patchcalendarwebinar) - Update a webinar
* [removeCalendarWebinar](#removecalendarwebinar) - Remove a webinar
* [updateCalendarWebinar](#updatecalendarwebinar) - Update a webinar

## createCalendarWebinar

Create a webinar

### Example Usage

<!-- UsageSnippet language="java" operationID="createCalendarWebinar" method="post" path="/calendar/{connection_id}/webinar" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCalendarWebinarRequest;
import to.unified.unified_java_sdk.models.operations.CreateCalendarWebinarResponse;
import to.unified.unified_java_sdk.models.shared.CalendarWebinar;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCalendarWebinarRequest req = CreateCalendarWebinarRequest.builder()
                .calendarWebinar(CalendarWebinar.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCalendarWebinarResponse res = sdk.webinar().createCalendarWebinar()
                .request(req)
                .call();

        if (res.calendarWebinar().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateCalendarWebinarRequest](../../models/operations/CreateCalendarWebinarRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateCalendarWebinarResponse](../../models/operations/CreateCalendarWebinarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCalendarWebinar

Retrieve a webinar

### Example Usage

<!-- UsageSnippet language="java" operationID="getCalendarWebinar" method="get" path="/calendar/{connection_id}/webinar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCalendarWebinarRequest;
import to.unified.unified_java_sdk.models.operations.GetCalendarWebinarResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCalendarWebinarRequest req = GetCalendarWebinarRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCalendarWebinarResponse res = sdk.webinar().getCalendarWebinar()
                .request(req)
                .call();

        if (res.calendarWebinar().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetCalendarWebinarRequest](../../models/operations/GetCalendarWebinarRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetCalendarWebinarResponse](../../models/operations/GetCalendarWebinarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCalendarWebinars

List all webinars

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarWebinars" method="get" path="/calendar/{connection_id}/webinar" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarWebinarsRequest;
import to.unified.unified_java_sdk.models.operations.ListCalendarWebinarsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarWebinarsRequest req = ListCalendarWebinarsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCalendarWebinarsResponse res = sdk.webinar().listCalendarWebinars()
                .request(req)
                .call();

        if (res.calendarWebinars().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListCalendarWebinarsRequest](../../models/operations/ListCalendarWebinarsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListCalendarWebinarsResponse](../../models/operations/ListCalendarWebinarsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCalendarWebinar

Update a webinar

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarWebinar" method="patch" path="/calendar/{connection_id}/webinar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCalendarWebinarRequest;
import to.unified.unified_java_sdk.models.operations.PatchCalendarWebinarResponse;
import to.unified.unified_java_sdk.models.shared.CalendarWebinar;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCalendarWebinarRequest req = PatchCalendarWebinarRequest.builder()
                .calendarWebinar(CalendarWebinar.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCalendarWebinarResponse res = sdk.webinar().patchCalendarWebinar()
                .request(req)
                .call();

        if (res.calendarWebinar().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchCalendarWebinarRequest](../../models/operations/PatchCalendarWebinarRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchCalendarWebinarResponse](../../models/operations/PatchCalendarWebinarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCalendarWebinar

Remove a webinar

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCalendarWebinar" method="delete" path="/calendar/{connection_id}/webinar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarWebinarRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarWebinarResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCalendarWebinarRequest req = RemoveCalendarWebinarRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCalendarWebinarResponse res = sdk.webinar().removeCalendarWebinar()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveCalendarWebinarRequest](../../models/operations/RemoveCalendarWebinarRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveCalendarWebinarResponse](../../models/operations/RemoveCalendarWebinarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCalendarWebinar

Update a webinar

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCalendarWebinar" method="put" path="/calendar/{connection_id}/webinar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarWebinarRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarWebinarResponse;
import to.unified.unified_java_sdk.models.shared.CalendarWebinar;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCalendarWebinarRequest req = UpdateCalendarWebinarRequest.builder()
                .calendarWebinar(CalendarWebinar.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCalendarWebinarResponse res = sdk.webinar().updateCalendarWebinar()
                .request(req)
                .call();

        if (res.calendarWebinar().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateCalendarWebinarRequest](../../models/operations/UpdateCalendarWebinarRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateCalendarWebinarResponse](../../models/operations/UpdateCalendarWebinarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |