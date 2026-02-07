# Calendar

## Overview

### Available Operations

* [createCalendarCalendar](#createcalendarcalendar) - Create a calendar
* [createCalendarEvent](#createcalendarevent) - Create an event
* [createCalendarLink](#createcalendarlink) - Create a link
* [createCalendarWebinar](#createcalendarwebinar) - Create a webinar
* [getCalendarCalendar](#getcalendarcalendar) - Retrieve a calendar
* [getCalendarEvent](#getcalendarevent) - Retrieve an event
* [getCalendarLink](#getcalendarlink) - Retrieve a link
* [getCalendarRecording](#getcalendarrecording) - Retrieve a recording
* [getCalendarWebinar](#getcalendarwebinar) - Retrieve a webinar
* [listCalendarBusies](#listcalendarbusies) - List all busies
* [listCalendarCalendars](#listcalendarcalendars) - List all calendars
* [listCalendarEvents](#listcalendarevents) - List all events
* [listCalendarLinks](#listcalendarlinks) - List all links
* [listCalendarRecordings](#listcalendarrecordings) - List all recordings
* [listCalendarWebinars](#listcalendarwebinars) - List all webinars
* [patchCalendarCalendar](#patchcalendarcalendar) - Update a calendar
* [patchCalendarEvent](#patchcalendarevent) - Update an event
* [patchCalendarLink](#patchcalendarlink) - Update a link
* [patchCalendarWebinar](#patchcalendarwebinar) - Update a webinar
* [removeCalendarCalendar](#removecalendarcalendar) - Remove a calendar
* [removeCalendarEvent](#removecalendarevent) - Remove an event
* [removeCalendarLink](#removecalendarlink) - Remove a link
* [removeCalendarWebinar](#removecalendarwebinar) - Remove a webinar
* [updateCalendarCalendar](#updatecalendarcalendar) - Update a calendar
* [updateCalendarEvent](#updatecalendarevent) - Update an event
* [updateCalendarLink](#updatecalendarlink) - Update a link
* [updateCalendarWebinar](#updatecalendarwebinar) - Update a webinar

## createCalendarCalendar

Create a calendar

### Example Usage

<!-- UsageSnippet language="java" operationID="createCalendarCalendar" method="post" path="/calendar/{connection_id}/calendar" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCalendarCalendarRequest;
import to.unified.unified_java_sdk.models.operations.CreateCalendarCalendarResponse;
import to.unified.unified_java_sdk.models.shared.CalendarCalendar;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCalendarCalendarRequest req = CreateCalendarCalendarRequest.builder()
                .calendarCalendar(CalendarCalendar.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCalendarCalendarResponse res = sdk.calendar().createCalendarCalendar()
                .request(req)
                .call();

        if (res.calendarCalendar().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateCalendarCalendarRequest](../../models/operations/CreateCalendarCalendarRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateCalendarCalendarResponse](../../models/operations/CreateCalendarCalendarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCalendarEvent

Create an event

### Example Usage

<!-- UsageSnippet language="java" operationID="createCalendarEvent" method="post" path="/calendar/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCalendarEventRequest;
import to.unified.unified_java_sdk.models.operations.CreateCalendarEventResponse;
import to.unified.unified_java_sdk.models.shared.CalendarEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCalendarEventRequest req = CreateCalendarEventRequest.builder()
                .calendarEvent(CalendarEvent.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCalendarEventResponse res = sdk.calendar().createCalendarEvent()
                .request(req)
                .call();

        if (res.calendarEvent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateCalendarEventRequest](../../models/operations/CreateCalendarEventRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateCalendarEventResponse](../../models/operations/CreateCalendarEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCalendarLink

Create a link

### Example Usage

<!-- UsageSnippet language="java" operationID="createCalendarLink" method="post" path="/calendar/{connection_id}/link" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCalendarLinkRequest;
import to.unified.unified_java_sdk.models.operations.CreateCalendarLinkResponse;
import to.unified.unified_java_sdk.models.shared.CalendarLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCalendarLinkRequest req = CreateCalendarLinkRequest.builder()
                .calendarLink(CalendarLink.builder()
                    .url("https://misguided-thongs.info")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCalendarLinkResponse res = sdk.calendar().createCalendarLink()
                .request(req)
                .call();

        if (res.calendarLink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateCalendarLinkRequest](../../models/operations/CreateCalendarLinkRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateCalendarLinkResponse](../../models/operations/CreateCalendarLinkResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateCalendarWebinarResponse res = sdk.calendar().createCalendarWebinar()
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

## getCalendarCalendar

Retrieve a calendar

### Example Usage

<!-- UsageSnippet language="java" operationID="getCalendarCalendar" method="get" path="/calendar/{connection_id}/calendar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCalendarCalendarRequest;
import to.unified.unified_java_sdk.models.operations.GetCalendarCalendarResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCalendarCalendarRequest req = GetCalendarCalendarRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCalendarCalendarResponse res = sdk.calendar().getCalendarCalendar()
                .request(req)
                .call();

        if (res.calendarCalendar().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetCalendarCalendarRequest](../../models/operations/GetCalendarCalendarRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetCalendarCalendarResponse](../../models/operations/GetCalendarCalendarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCalendarEvent

Retrieve an event

### Example Usage

<!-- UsageSnippet language="java" operationID="getCalendarEvent" method="get" path="/calendar/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCalendarEventRequest;
import to.unified.unified_java_sdk.models.operations.GetCalendarEventResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCalendarEventRequest req = GetCalendarEventRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCalendarEventResponse res = sdk.calendar().getCalendarEvent()
                .request(req)
                .call();

        if (res.calendarEvent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetCalendarEventRequest](../../models/operations/GetCalendarEventRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetCalendarEventResponse](../../models/operations/GetCalendarEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCalendarLink

Retrieve a link

### Example Usage

<!-- UsageSnippet language="java" operationID="getCalendarLink" method="get" path="/calendar/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCalendarLinkRequest;
import to.unified.unified_java_sdk.models.operations.GetCalendarLinkResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCalendarLinkRequest req = GetCalendarLinkRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCalendarLinkResponse res = sdk.calendar().getCalendarLink()
                .request(req)
                .call();

        if (res.calendarLink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetCalendarLinkRequest](../../models/operations/GetCalendarLinkRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetCalendarLinkResponse](../../models/operations/GetCalendarLinkResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCalendarRecording

Retrieve a recording

### Example Usage

<!-- UsageSnippet language="java" operationID="getCalendarRecording" method="get" path="/calendar/{connection_id}/recording/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCalendarRecordingRequest;
import to.unified.unified_java_sdk.models.operations.GetCalendarRecordingResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCalendarRecordingRequest req = GetCalendarRecordingRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCalendarRecordingResponse res = sdk.calendar().getCalendarRecording()
                .request(req)
                .call();

        if (res.calendarRecording().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetCalendarRecordingRequest](../../models/operations/GetCalendarRecordingRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetCalendarRecordingResponse](../../models/operations/GetCalendarRecordingResponse.md)**

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

        GetCalendarWebinarResponse res = sdk.calendar().getCalendarWebinar()
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

## listCalendarBusies

List all busies

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarBusies" method="get" path="/calendar/{connection_id}/busy" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarBusiesRequest;
import to.unified.unified_java_sdk.models.operations.ListCalendarBusiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarBusiesRequest req = ListCalendarBusiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListCalendarBusiesResponse res = sdk.calendar().listCalendarBusies()
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

## listCalendarCalendars

List all calendars

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarCalendars" method="get" path="/calendar/{connection_id}/calendar" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarCalendarsRequest;
import to.unified.unified_java_sdk.models.operations.ListCalendarCalendarsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarCalendarsRequest req = ListCalendarCalendarsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCalendarCalendarsResponse res = sdk.calendar().listCalendarCalendars()
                .request(req)
                .call();

        if (res.calendarCalendars().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListCalendarCalendarsRequest](../../models/operations/ListCalendarCalendarsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListCalendarCalendarsResponse](../../models/operations/ListCalendarCalendarsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCalendarEvents

List all events

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarEvents" method="get" path="/calendar/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarEventsRequest;
import to.unified.unified_java_sdk.models.operations.ListCalendarEventsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarEventsRequest req = ListCalendarEventsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCalendarEventsResponse res = sdk.calendar().listCalendarEvents()
                .request(req)
                .call();

        if (res.calendarEvents().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListCalendarEventsRequest](../../models/operations/ListCalendarEventsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListCalendarEventsResponse](../../models/operations/ListCalendarEventsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCalendarLinks

List all links

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarLinks" method="get" path="/calendar/{connection_id}/link" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarLinksRequest;
import to.unified.unified_java_sdk.models.operations.ListCalendarLinksResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarLinksRequest req = ListCalendarLinksRequest.builder()
                .connectionId("<id>")
                .build();

        ListCalendarLinksResponse res = sdk.calendar().listCalendarLinks()
                .request(req)
                .call();

        if (res.calendarLinks().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListCalendarLinksRequest](../../models/operations/ListCalendarLinksRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListCalendarLinksResponse](../../models/operations/ListCalendarLinksResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCalendarRecordings

List all recordings

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarRecordings" method="get" path="/calendar/{connection_id}/recording" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarRecordingsRequest;
import to.unified.unified_java_sdk.models.operations.ListCalendarRecordingsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarRecordingsRequest req = ListCalendarRecordingsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCalendarRecordingsResponse res = sdk.calendar().listCalendarRecordings()
                .request(req)
                .call();

        if (res.calendarRecordings().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListCalendarRecordingsRequest](../../models/operations/ListCalendarRecordingsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListCalendarRecordingsResponse](../../models/operations/ListCalendarRecordingsResponse.md)**

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

        ListCalendarWebinarsResponse res = sdk.calendar().listCalendarWebinars()
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

## patchCalendarCalendar

Update a calendar

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarCalendar" method="patch" path="/calendar/{connection_id}/calendar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCalendarCalendarRequest;
import to.unified.unified_java_sdk.models.operations.PatchCalendarCalendarResponse;
import to.unified.unified_java_sdk.models.shared.CalendarCalendar;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCalendarCalendarRequest req = PatchCalendarCalendarRequest.builder()
                .calendarCalendar(CalendarCalendar.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCalendarCalendarResponse res = sdk.calendar().patchCalendarCalendar()
                .request(req)
                .call();

        if (res.calendarCalendar().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchCalendarCalendarRequest](../../models/operations/PatchCalendarCalendarRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchCalendarCalendarResponse](../../models/operations/PatchCalendarCalendarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCalendarEvent

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarEvent" method="patch" path="/calendar/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCalendarEventRequest;
import to.unified.unified_java_sdk.models.operations.PatchCalendarEventResponse;
import to.unified.unified_java_sdk.models.shared.CalendarEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCalendarEventRequest req = PatchCalendarEventRequest.builder()
                .calendarEvent(CalendarEvent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCalendarEventResponse res = sdk.calendar().patchCalendarEvent()
                .request(req)
                .call();

        if (res.calendarEvent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchCalendarEventRequest](../../models/operations/PatchCalendarEventRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchCalendarEventResponse](../../models/operations/PatchCalendarEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCalendarLink

Update a link

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarLink" method="patch" path="/calendar/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCalendarLinkRequest;
import to.unified.unified_java_sdk.models.operations.PatchCalendarLinkResponse;
import to.unified.unified_java_sdk.models.shared.CalendarLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCalendarLinkRequest req = PatchCalendarLinkRequest.builder()
                .calendarLink(CalendarLink.builder()
                    .url("https://warm-hexagon.name/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCalendarLinkResponse res = sdk.calendar().patchCalendarLink()
                .request(req)
                .call();

        if (res.calendarLink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchCalendarLinkRequest](../../models/operations/PatchCalendarLinkRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchCalendarLinkResponse](../../models/operations/PatchCalendarLinkResponse.md)**

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

        PatchCalendarWebinarResponse res = sdk.calendar().patchCalendarWebinar()
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

## removeCalendarCalendar

Remove a calendar

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCalendarCalendar" method="delete" path="/calendar/{connection_id}/calendar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarCalendarRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarCalendarResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCalendarCalendarRequest req = RemoveCalendarCalendarRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCalendarCalendarResponse res = sdk.calendar().removeCalendarCalendar()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveCalendarCalendarRequest](../../models/operations/RemoveCalendarCalendarRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveCalendarCalendarResponse](../../models/operations/RemoveCalendarCalendarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCalendarEvent

Remove an event

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCalendarEvent" method="delete" path="/calendar/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarEventRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarEventResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCalendarEventRequest req = RemoveCalendarEventRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCalendarEventResponse res = sdk.calendar().removeCalendarEvent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveCalendarEventRequest](../../models/operations/RemoveCalendarEventRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveCalendarEventResponse](../../models/operations/RemoveCalendarEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCalendarLink

Remove a link

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCalendarLink" method="delete" path="/calendar/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarLinkRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarLinkResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCalendarLinkRequest req = RemoveCalendarLinkRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCalendarLinkResponse res = sdk.calendar().removeCalendarLink()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveCalendarLinkRequest](../../models/operations/RemoveCalendarLinkRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveCalendarLinkResponse](../../models/operations/RemoveCalendarLinkResponse.md)**

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

        RemoveCalendarWebinarResponse res = sdk.calendar().removeCalendarWebinar()
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

## updateCalendarCalendar

Update a calendar

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCalendarCalendar" method="put" path="/calendar/{connection_id}/calendar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarCalendarRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarCalendarResponse;
import to.unified.unified_java_sdk.models.shared.CalendarCalendar;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCalendarCalendarRequest req = UpdateCalendarCalendarRequest.builder()
                .calendarCalendar(CalendarCalendar.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCalendarCalendarResponse res = sdk.calendar().updateCalendarCalendar()
                .request(req)
                .call();

        if (res.calendarCalendar().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateCalendarCalendarRequest](../../models/operations/UpdateCalendarCalendarRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateCalendarCalendarResponse](../../models/operations/UpdateCalendarCalendarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCalendarEvent

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCalendarEvent" method="put" path="/calendar/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarEventRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarEventResponse;
import to.unified.unified_java_sdk.models.shared.CalendarEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCalendarEventRequest req = UpdateCalendarEventRequest.builder()
                .calendarEvent(CalendarEvent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCalendarEventResponse res = sdk.calendar().updateCalendarEvent()
                .request(req)
                .call();

        if (res.calendarEvent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateCalendarEventRequest](../../models/operations/UpdateCalendarEventRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateCalendarEventResponse](../../models/operations/UpdateCalendarEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCalendarLink

Update a link

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCalendarLink" method="put" path="/calendar/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarLinkRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarLinkResponse;
import to.unified.unified_java_sdk.models.shared.CalendarLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCalendarLinkRequest req = UpdateCalendarLinkRequest.builder()
                .calendarLink(CalendarLink.builder()
                    .url("https://partial-hydrocarbon.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCalendarLinkResponse res = sdk.calendar().updateCalendarLink()
                .request(req)
                .call();

        if (res.calendarLink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateCalendarLinkRequest](../../models/operations/UpdateCalendarLinkRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateCalendarLinkResponse](../../models/operations/UpdateCalendarLinkResponse.md)**

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

        UpdateCalendarWebinarResponse res = sdk.calendar().updateCalendarWebinar()
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