# Webinar

## Overview

### Available Operations

* [createCalendarWebinar2](#createcalendarwebinar2) - Create a webinar
* [getCalendarWebinar2](#getcalendarwebinar2) - Retrieve a webinar
* [listCalendarWebinars2](#listcalendarwebinars2) - List all webinars
* [patchCalendarWebinar2](#patchcalendarwebinar2) - Update a webinar
* [removeCalendarWebinar2](#removecalendarwebinar2) - Remove a webinar
* [updateCalendarWebinar2](#updatecalendarwebinar2) - Update a webinar

## createCalendarWebinar2

Create a webinar

### Example Usage

<!-- UsageSnippet language="java" operationID="createCalendarWebinar2" method="post" path="/calendar/{connection_id}/webinar" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCalendarWebinar2Request;
import to.unified.unified_java_sdk.models.operations.CreateCalendarWebinar2Response;
import to.unified.unified_java_sdk.models.shared.CalendarWebinar;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCalendarWebinar2Request req = CreateCalendarWebinar2Request.builder()
                .calendarWebinar(CalendarWebinar.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCalendarWebinar2Response res = sdk.webinar().createCalendarWebinar2()
                .request(req)
                .call();

        if (res.calendarWebinar().isPresent()) {
            System.out.println(res.calendarWebinar().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateCalendarWebinar2Request](../../models/operations/CreateCalendarWebinar2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateCalendarWebinar2Response](../../models/operations/CreateCalendarWebinar2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCalendarWebinar2

Retrieve a webinar

### Example Usage

<!-- UsageSnippet language="java" operationID="getCalendarWebinar2" method="get" path="/calendar/{connection_id}/webinar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCalendarWebinar2Request;
import to.unified.unified_java_sdk.models.operations.GetCalendarWebinar2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCalendarWebinar2Request req = GetCalendarWebinar2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCalendarWebinar2Response res = sdk.webinar().getCalendarWebinar2()
                .request(req)
                .call();

        if (res.calendarWebinar().isPresent()) {
            System.out.println(res.calendarWebinar().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetCalendarWebinar2Request](../../models/operations/GetCalendarWebinar2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetCalendarWebinar2Response](../../models/operations/GetCalendarWebinar2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCalendarWebinars2

List all webinars

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarWebinars2" method="get" path="/calendar/{connection_id}/webinar" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarWebinars2Request;
import to.unified.unified_java_sdk.models.operations.ListCalendarWebinars2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarWebinars2Request req = ListCalendarWebinars2Request.builder()
                .connectionId("<id>")
                .build();

        ListCalendarWebinars2Response res = sdk.webinar().listCalendarWebinars2()
                .request(req)
                .call();

        if (res.calendarWebinars().isPresent()) {
            System.out.println(res.calendarWebinars().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListCalendarWebinars2Request](../../models/operations/ListCalendarWebinars2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListCalendarWebinars2Response](../../models/operations/ListCalendarWebinars2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCalendarWebinar2

Update a webinar

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarWebinar2" method="patch" path="/calendar/{connection_id}/webinar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCalendarWebinar2Request;
import to.unified.unified_java_sdk.models.operations.PatchCalendarWebinar2Response;
import to.unified.unified_java_sdk.models.shared.CalendarWebinar;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCalendarWebinar2Request req = PatchCalendarWebinar2Request.builder()
                .calendarWebinar(CalendarWebinar.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCalendarWebinar2Response res = sdk.webinar().patchCalendarWebinar2()
                .request(req)
                .call();

        if (res.calendarWebinar().isPresent()) {
            System.out.println(res.calendarWebinar().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchCalendarWebinar2Request](../../models/operations/PatchCalendarWebinar2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchCalendarWebinar2Response](../../models/operations/PatchCalendarWebinar2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCalendarWebinar2

Remove a webinar

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCalendarWebinar2" method="delete" path="/calendar/{connection_id}/webinar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarWebinar2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarWebinar2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCalendarWebinar2Request req = RemoveCalendarWebinar2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCalendarWebinar2Response res = sdk.webinar().removeCalendarWebinar2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveCalendarWebinar2Request](../../models/operations/RemoveCalendarWebinar2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveCalendarWebinar2Response](../../models/operations/RemoveCalendarWebinar2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCalendarWebinar2

Update a webinar

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCalendarWebinar2" method="put" path="/calendar/{connection_id}/webinar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarWebinar2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarWebinar2Response;
import to.unified.unified_java_sdk.models.shared.CalendarWebinar;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCalendarWebinar2Request req = UpdateCalendarWebinar2Request.builder()
                .calendarWebinar(CalendarWebinar.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCalendarWebinar2Response res = sdk.webinar().updateCalendarWebinar2()
                .request(req)
                .call();

        if (res.calendarWebinar().isPresent()) {
            System.out.println(res.calendarWebinar().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateCalendarWebinar2Request](../../models/operations/UpdateCalendarWebinar2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateCalendarWebinar2Response](../../models/operations/UpdateCalendarWebinar2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |