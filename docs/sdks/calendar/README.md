# Calendar

## Overview

### Available Operations

* [createCalendarCalendar2](#createcalendarcalendar2) - Create a calendar
* [createCalendarEvent2](#createcalendarevent2) - Create an event
* [createCalendarLink2](#createcalendarlink2) - Create a link
* [createCalendarWebinar2](#createcalendarwebinar2) - Create a webinar
* [getCalendarCalendar2](#getcalendarcalendar2) - Retrieve a calendar
* [getCalendarEvent2](#getcalendarevent2) - Retrieve an event
* [getCalendarLink2](#getcalendarlink2) - Retrieve a link
* [getCalendarRecording2](#getcalendarrecording2) - Retrieve a recording
* [getCalendarWebinar2](#getcalendarwebinar2) - Retrieve a webinar
* [listCalendarBusies2](#listcalendarbusies2) - List all busies
* [listCalendarCalendars2](#listcalendarcalendars2) - List all calendars
* [listCalendarEvents2](#listcalendarevents2) - List all events
* [listCalendarLinks2](#listcalendarlinks2) - List all links
* [listCalendarRecordings2](#listcalendarrecordings2) - List all recordings
* [listCalendarWebinars2](#listcalendarwebinars2) - List all webinars
* [patchCalendarCalendar2](#patchcalendarcalendar2) - Update a calendar
* [patchCalendarEvent2](#patchcalendarevent2) - Update an event
* [patchCalendarLink2](#patchcalendarlink2) - Update a link
* [patchCalendarWebinar2](#patchcalendarwebinar2) - Update a webinar
* [removeCalendarCalendar2](#removecalendarcalendar2) - Remove a calendar
* [removeCalendarEvent2](#removecalendarevent2) - Remove an event
* [removeCalendarLink2](#removecalendarlink2) - Remove a link
* [removeCalendarWebinar2](#removecalendarwebinar2) - Remove a webinar
* [updateCalendarCalendar2](#updatecalendarcalendar2) - Update a calendar
* [updateCalendarEvent2](#updatecalendarevent2) - Update an event
* [updateCalendarLink2](#updatecalendarlink2) - Update a link
* [updateCalendarWebinar2](#updatecalendarwebinar2) - Update a webinar

## createCalendarCalendar2

Create a calendar

### Example Usage

<!-- UsageSnippet language="java" operationID="createCalendarCalendar2" method="post" path="/calendar/{connection_id}/calendar" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCalendarCalendar2Request;
import to.unified.unified_java_sdk.models.operations.CreateCalendarCalendar2Response;
import to.unified.unified_java_sdk.models.shared.CalendarCalendar;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCalendarCalendar2Request req = CreateCalendarCalendar2Request.builder()
                .calendarCalendar(CalendarCalendar.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCalendarCalendar2Response res = sdk.calendar().createCalendarCalendar2()
                .request(req)
                .call();

        if (res.calendarCalendar().isPresent()) {
            System.out.println(res.calendarCalendar().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateCalendarCalendar2Request](../../models/operations/CreateCalendarCalendar2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateCalendarCalendar2Response](../../models/operations/CreateCalendarCalendar2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCalendarEvent2

Create an event

### Example Usage

<!-- UsageSnippet language="java" operationID="createCalendarEvent2" method="post" path="/calendar/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCalendarEvent2Request;
import to.unified.unified_java_sdk.models.operations.CreateCalendarEvent2Response;
import to.unified.unified_java_sdk.models.shared.CalendarEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCalendarEvent2Request req = CreateCalendarEvent2Request.builder()
                .calendarEvent(CalendarEvent.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCalendarEvent2Response res = sdk.calendar().createCalendarEvent2()
                .request(req)
                .call();

        if (res.calendarEvent().isPresent()) {
            System.out.println(res.calendarEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateCalendarEvent2Request](../../models/operations/CreateCalendarEvent2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateCalendarEvent2Response](../../models/operations/CreateCalendarEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCalendarLink2

Create a link

### Example Usage

<!-- UsageSnippet language="java" operationID="createCalendarLink2" method="post" path="/calendar/{connection_id}/link" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCalendarLink2Request;
import to.unified.unified_java_sdk.models.operations.CreateCalendarLink2Response;
import to.unified.unified_java_sdk.models.shared.CalendarLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCalendarLink2Request req = CreateCalendarLink2Request.builder()
                .calendarLink(CalendarLink.builder()
                    .url("https://prestigious-fort.name/")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCalendarLink2Response res = sdk.calendar().createCalendarLink2()
                .request(req)
                .call();

        if (res.calendarLink().isPresent()) {
            System.out.println(res.calendarLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateCalendarLink2Request](../../models/operations/CreateCalendarLink2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateCalendarLink2Response](../../models/operations/CreateCalendarLink2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateCalendarWebinar2Response res = sdk.calendar().createCalendarWebinar2()
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

## getCalendarCalendar2

Retrieve a calendar

### Example Usage

<!-- UsageSnippet language="java" operationID="getCalendarCalendar2" method="get" path="/calendar/{connection_id}/calendar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCalendarCalendar2Request;
import to.unified.unified_java_sdk.models.operations.GetCalendarCalendar2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCalendarCalendar2Request req = GetCalendarCalendar2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCalendarCalendar2Response res = sdk.calendar().getCalendarCalendar2()
                .request(req)
                .call();

        if (res.calendarCalendar().isPresent()) {
            System.out.println(res.calendarCalendar().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetCalendarCalendar2Request](../../models/operations/GetCalendarCalendar2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetCalendarCalendar2Response](../../models/operations/GetCalendarCalendar2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCalendarEvent2

Retrieve an event

### Example Usage

<!-- UsageSnippet language="java" operationID="getCalendarEvent2" method="get" path="/calendar/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCalendarEvent2Request;
import to.unified.unified_java_sdk.models.operations.GetCalendarEvent2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCalendarEvent2Request req = GetCalendarEvent2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCalendarEvent2Response res = sdk.calendar().getCalendarEvent2()
                .request(req)
                .call();

        if (res.calendarEvent().isPresent()) {
            System.out.println(res.calendarEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetCalendarEvent2Request](../../models/operations/GetCalendarEvent2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetCalendarEvent2Response](../../models/operations/GetCalendarEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCalendarLink2

Retrieve a link

### Example Usage

<!-- UsageSnippet language="java" operationID="getCalendarLink2" method="get" path="/calendar/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCalendarLink2Request;
import to.unified.unified_java_sdk.models.operations.GetCalendarLink2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCalendarLink2Request req = GetCalendarLink2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCalendarLink2Response res = sdk.calendar().getCalendarLink2()
                .request(req)
                .call();

        if (res.calendarLink().isPresent()) {
            System.out.println(res.calendarLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetCalendarLink2Request](../../models/operations/GetCalendarLink2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetCalendarLink2Response](../../models/operations/GetCalendarLink2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCalendarRecording2

Retrieve a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="getCalendarRecording2" method="get" path="/calendar/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCalendarRecording2Request;
import to.unified.unified_java_sdk.models.operations.GetCalendarRecording2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCalendarRecording2Request req = GetCalendarRecording2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCalendarRecording2Response res = sdk.calendar().getCalendarRecording2()
                .request(req)
                .call();

        if (res.calendarRecording().isPresent()) {
            System.out.println(res.calendarRecording().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetCalendarRecording2Request](../../models/operations/GetCalendarRecording2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetCalendarRecording2Response](../../models/operations/GetCalendarRecording2Response.md)**

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

        GetCalendarWebinar2Response res = sdk.calendar().getCalendarWebinar2()
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

        ListCalendarBusies2Response res = sdk.calendar().listCalendarBusies2()
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

## listCalendarCalendars2

List all calendars

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarCalendars2" method="get" path="/calendar/{connection_id}/calendar" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarCalendars2Request;
import to.unified.unified_java_sdk.models.operations.ListCalendarCalendars2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarCalendars2Request req = ListCalendarCalendars2Request.builder()
                .connectionId("<id>")
                .build();

        ListCalendarCalendars2Response res = sdk.calendar().listCalendarCalendars2()
                .request(req)
                .call();

        if (res.calendarCalendars().isPresent()) {
            System.out.println(res.calendarCalendars().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListCalendarCalendars2Request](../../models/operations/ListCalendarCalendars2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListCalendarCalendars2Response](../../models/operations/ListCalendarCalendars2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCalendarEvents2

List all events

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarEvents2" method="get" path="/calendar/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarEvents2Request;
import to.unified.unified_java_sdk.models.operations.ListCalendarEvents2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarEvents2Request req = ListCalendarEvents2Request.builder()
                .connectionId("<id>")
                .build();

        ListCalendarEvents2Response res = sdk.calendar().listCalendarEvents2()
                .request(req)
                .call();

        if (res.calendarEvents().isPresent()) {
            System.out.println(res.calendarEvents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListCalendarEvents2Request](../../models/operations/ListCalendarEvents2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListCalendarEvents2Response](../../models/operations/ListCalendarEvents2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCalendarLinks2

List all links

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarLinks2" method="get" path="/calendar/{connection_id}/link" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarLinks2Request;
import to.unified.unified_java_sdk.models.operations.ListCalendarLinks2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarLinks2Request req = ListCalendarLinks2Request.builder()
                .connectionId("<id>")
                .build();

        ListCalendarLinks2Response res = sdk.calendar().listCalendarLinks2()
                .request(req)
                .call();

        if (res.calendarLinks().isPresent()) {
            System.out.println(res.calendarLinks().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListCalendarLinks2Request](../../models/operations/ListCalendarLinks2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListCalendarLinks2Response](../../models/operations/ListCalendarLinks2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCalendarRecordings2

List all recordings

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarRecordings2" method="get" path="/calendar/{connection_id}/recording" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarRecordings2Request;
import to.unified.unified_java_sdk.models.operations.ListCalendarRecordings2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarRecordings2Request req = ListCalendarRecordings2Request.builder()
                .connectionId("<id>")
                .build();

        ListCalendarRecordings2Response res = sdk.calendar().listCalendarRecordings2()
                .request(req)
                .call();

        if (res.calendarRecordings().isPresent()) {
            System.out.println(res.calendarRecordings().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListCalendarRecordings2Request](../../models/operations/ListCalendarRecordings2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListCalendarRecordings2Response](../../models/operations/ListCalendarRecordings2Response.md)**

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

        ListCalendarWebinars2Response res = sdk.calendar().listCalendarWebinars2()
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

## patchCalendarCalendar2

Update a calendar

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarCalendar2" method="patch" path="/calendar/{connection_id}/calendar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCalendarCalendar2Request;
import to.unified.unified_java_sdk.models.operations.PatchCalendarCalendar2Response;
import to.unified.unified_java_sdk.models.shared.CalendarCalendar;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCalendarCalendar2Request req = PatchCalendarCalendar2Request.builder()
                .calendarCalendar(CalendarCalendar.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCalendarCalendar2Response res = sdk.calendar().patchCalendarCalendar2()
                .request(req)
                .call();

        if (res.calendarCalendar().isPresent()) {
            System.out.println(res.calendarCalendar().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchCalendarCalendar2Request](../../models/operations/PatchCalendarCalendar2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchCalendarCalendar2Response](../../models/operations/PatchCalendarCalendar2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCalendarEvent2

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarEvent2" method="patch" path="/calendar/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCalendarEvent2Request;
import to.unified.unified_java_sdk.models.operations.PatchCalendarEvent2Response;
import to.unified.unified_java_sdk.models.shared.CalendarEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCalendarEvent2Request req = PatchCalendarEvent2Request.builder()
                .calendarEvent(CalendarEvent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCalendarEvent2Response res = sdk.calendar().patchCalendarEvent2()
                .request(req)
                .call();

        if (res.calendarEvent().isPresent()) {
            System.out.println(res.calendarEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchCalendarEvent2Request](../../models/operations/PatchCalendarEvent2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchCalendarEvent2Response](../../models/operations/PatchCalendarEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCalendarLink2

Update a link

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarLink2" method="patch" path="/calendar/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCalendarLink2Request;
import to.unified.unified_java_sdk.models.operations.PatchCalendarLink2Response;
import to.unified.unified_java_sdk.models.shared.CalendarLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCalendarLink2Request req = PatchCalendarLink2Request.builder()
                .calendarLink(CalendarLink.builder()
                    .url("https://probable-accelerator.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCalendarLink2Response res = sdk.calendar().patchCalendarLink2()
                .request(req)
                .call();

        if (res.calendarLink().isPresent()) {
            System.out.println(res.calendarLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchCalendarLink2Request](../../models/operations/PatchCalendarLink2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchCalendarLink2Response](../../models/operations/PatchCalendarLink2Response.md)**

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

        PatchCalendarWebinar2Response res = sdk.calendar().patchCalendarWebinar2()
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

## removeCalendarCalendar2

Remove a calendar

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCalendarCalendar2" method="delete" path="/calendar/{connection_id}/calendar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarCalendar2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarCalendar2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCalendarCalendar2Request req = RemoveCalendarCalendar2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCalendarCalendar2Response res = sdk.calendar().removeCalendarCalendar2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveCalendarCalendar2Request](../../models/operations/RemoveCalendarCalendar2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveCalendarCalendar2Response](../../models/operations/RemoveCalendarCalendar2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCalendarEvent2

Remove an event

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCalendarEvent2" method="delete" path="/calendar/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarEvent2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarEvent2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCalendarEvent2Request req = RemoveCalendarEvent2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCalendarEvent2Response res = sdk.calendar().removeCalendarEvent2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveCalendarEvent2Request](../../models/operations/RemoveCalendarEvent2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveCalendarEvent2Response](../../models/operations/RemoveCalendarEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCalendarLink2

Remove a link

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCalendarLink2" method="delete" path="/calendar/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarLink2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarLink2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCalendarLink2Request req = RemoveCalendarLink2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCalendarLink2Response res = sdk.calendar().removeCalendarLink2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveCalendarLink2Request](../../models/operations/RemoveCalendarLink2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveCalendarLink2Response](../../models/operations/RemoveCalendarLink2Response.md)**

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

        RemoveCalendarWebinar2Response res = sdk.calendar().removeCalendarWebinar2()
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

## updateCalendarCalendar2

Update a calendar

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCalendarCalendar2" method="put" path="/calendar/{connection_id}/calendar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarCalendar2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarCalendar2Response;
import to.unified.unified_java_sdk.models.shared.CalendarCalendar;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCalendarCalendar2Request req = UpdateCalendarCalendar2Request.builder()
                .calendarCalendar(CalendarCalendar.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCalendarCalendar2Response res = sdk.calendar().updateCalendarCalendar2()
                .request(req)
                .call();

        if (res.calendarCalendar().isPresent()) {
            System.out.println(res.calendarCalendar().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateCalendarCalendar2Request](../../models/operations/UpdateCalendarCalendar2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateCalendarCalendar2Response](../../models/operations/UpdateCalendarCalendar2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCalendarEvent2

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCalendarEvent2" method="put" path="/calendar/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarEvent2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarEvent2Response;
import to.unified.unified_java_sdk.models.shared.CalendarEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCalendarEvent2Request req = UpdateCalendarEvent2Request.builder()
                .calendarEvent(CalendarEvent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCalendarEvent2Response res = sdk.calendar().updateCalendarEvent2()
                .request(req)
                .call();

        if (res.calendarEvent().isPresent()) {
            System.out.println(res.calendarEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateCalendarEvent2Request](../../models/operations/UpdateCalendarEvent2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateCalendarEvent2Response](../../models/operations/UpdateCalendarEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCalendarLink2

Update a link

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCalendarLink2" method="put" path="/calendar/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarLink2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarLink2Response;
import to.unified.unified_java_sdk.models.shared.CalendarLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCalendarLink2Request req = UpdateCalendarLink2Request.builder()
                .calendarLink(CalendarLink.builder()
                    .url("https://soupy-extension.net/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCalendarLink2Response res = sdk.calendar().updateCalendarLink2()
                .request(req)
                .call();

        if (res.calendarLink().isPresent()) {
            System.out.println(res.calendarLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateCalendarLink2Request](../../models/operations/UpdateCalendarLink2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateCalendarLink2Response](../../models/operations/UpdateCalendarLink2Response.md)**

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

        UpdateCalendarWebinar2Response res = sdk.calendar().updateCalendarWebinar2()
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