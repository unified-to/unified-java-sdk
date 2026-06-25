# Event

## Overview

### Available Operations

* [createAnalyticsEvent2](#createanalyticsevent2) - Create an event
* [createCalendarEvent2](#createcalendarevent2) - Create an event
* [createCrmEvent2](#createcrmevent2) - Create an event
* [getAnalyticsEvent2](#getanalyticsevent2) - Retrieve an event
* [getCalendarEvent2](#getcalendarevent2) - Retrieve an event
* [getClubsEvent2](#getclubsevent2) - Retrieve an event
* [getCrmEvent2](#getcrmevent2) - Retrieve an event
* [listAnalyticsEvents2](#listanalyticsevents2) - List all events
* [listCalendarEvents2](#listcalendarevents2) - List all events
* [listClubsEvents2](#listclubsevents2) - List all events
* [listCrmEvents2](#listcrmevents2) - List all events
* [patchCalendarEvent2](#patchcalendarevent2) - Update an event
* [patchCrmEvent2](#patchcrmevent2) - Update an event
* [patchMessagingEvent2](#patchmessagingevent2) - Update an event
* [removeCalendarEvent2](#removecalendarevent2) - Remove an event
* [removeCrmEvent2](#removecrmevent2) - Remove an event
* [updateCalendarEvent2](#updatecalendarevent2) - Update an event
* [updateCrmEvent2](#updatecrmevent2) - Update an event
* [updateMessagingEvent2](#updatemessagingevent2) - Update an event

## createAnalyticsEvent2

Create an event

### Example Usage

<!-- UsageSnippet language="java" operationID="createAnalyticsEvent2" method="post" path="/analytics/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsEvent2Request;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsEvent2Response;
import to.unified.unified_java_sdk.models.shared.AnalyticsEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAnalyticsEvent2Request req = CreateAnalyticsEvent2Request.builder()
                .analyticsEvent(AnalyticsEvent.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAnalyticsEvent2Response res = sdk.event().createAnalyticsEvent2()
                .request(req)
                .call();

        if (res.analyticsEvent().isPresent()) {
            System.out.println(res.analyticsEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateAnalyticsEvent2Request](../../models/operations/CreateAnalyticsEvent2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateAnalyticsEvent2Response](../../models/operations/CreateAnalyticsEvent2Response.md)**

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

        CreateCalendarEvent2Response res = sdk.event().createCalendarEvent2()
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

## createCrmEvent2

Create an event

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmEvent2" method="post" path="/crm/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmEvent2Request;
import to.unified.unified_java_sdk.models.operations.CreateCrmEvent2Response;
import to.unified.unified_java_sdk.models.shared.CrmEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmEvent2Request req = CreateCrmEvent2Request.builder()
                .crmEvent(CrmEvent.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmEvent2Response res = sdk.event().createCrmEvent2()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateCrmEvent2Request](../../models/operations/CreateCrmEvent2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateCrmEvent2Response](../../models/operations/CreateCrmEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAnalyticsEvent2

Retrieve an event

### Example Usage

<!-- UsageSnippet language="java" operationID="getAnalyticsEvent2" method="get" path="/analytics/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsEvent2Request;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsEvent2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAnalyticsEvent2Request req = GetAnalyticsEvent2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAnalyticsEvent2Response res = sdk.event().getAnalyticsEvent2()
                .request(req)
                .call();

        if (res.analyticsEvent().isPresent()) {
            System.out.println(res.analyticsEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAnalyticsEvent2Request](../../models/operations/GetAnalyticsEvent2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAnalyticsEvent2Response](../../models/operations/GetAnalyticsEvent2Response.md)**

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

        GetCalendarEvent2Response res = sdk.event().getCalendarEvent2()
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

## getClubsEvent2

Retrieve an event

### Example Usage

<!-- UsageSnippet language="java" operationID="getClubsEvent2" method="get" path="/clubs/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetClubsEvent2Request;
import to.unified.unified_java_sdk.models.operations.GetClubsEvent2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetClubsEvent2Request req = GetClubsEvent2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetClubsEvent2Response res = sdk.event().getClubsEvent2()
                .request(req)
                .call();

        if (res.clubsEvent().isPresent()) {
            System.out.println(res.clubsEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetClubsEvent2Request](../../models/operations/GetClubsEvent2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetClubsEvent2Response](../../models/operations/GetClubsEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmEvent2

Retrieve an event

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmEvent2" method="get" path="/crm/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmEvent2Request;
import to.unified.unified_java_sdk.models.operations.GetCrmEvent2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmEvent2Request req = GetCrmEvent2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmEvent2Response res = sdk.event().getCrmEvent2()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetCrmEvent2Request](../../models/operations/GetCrmEvent2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetCrmEvent2Response](../../models/operations/GetCrmEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAnalyticsEvents2

List all events

### Example Usage

<!-- UsageSnippet language="java" operationID="listAnalyticsEvents2" method="get" path="/analytics/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsEvents2Request;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsEvents2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAnalyticsEvents2Request req = ListAnalyticsEvents2Request.builder()
                .connectionId("<id>")
                .build();

        ListAnalyticsEvents2Response res = sdk.event().listAnalyticsEvents2()
                .request(req)
                .call();

        if (res.analyticsEvents().isPresent()) {
            System.out.println(res.analyticsEvents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListAnalyticsEvents2Request](../../models/operations/ListAnalyticsEvents2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListAnalyticsEvents2Response](../../models/operations/ListAnalyticsEvents2Response.md)**

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

        ListCalendarEvents2Response res = sdk.event().listCalendarEvents2()
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

## listClubsEvents2

List all events

### Example Usage

<!-- UsageSnippet language="java" operationID="listClubsEvents2" method="get" path="/clubs/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListClubsEvents2Request;
import to.unified.unified_java_sdk.models.operations.ListClubsEvents2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListClubsEvents2Request req = ListClubsEvents2Request.builder()
                .connectionId("<id>")
                .build();

        ListClubsEvents2Response res = sdk.event().listClubsEvents2()
                .request(req)
                .call();

        if (res.clubsEvents().isPresent()) {
            System.out.println(res.clubsEvents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListClubsEvents2Request](../../models/operations/ListClubsEvents2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListClubsEvents2Response](../../models/operations/ListClubsEvents2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmEvents2

List all events

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmEvents2" method="get" path="/crm/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmEvents2Request;
import to.unified.unified_java_sdk.models.operations.ListCrmEvents2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmEvents2Request req = ListCrmEvents2Request.builder()
                .connectionId("<id>")
                .build();

        ListCrmEvents2Response res = sdk.event().listCrmEvents2()
                .request(req)
                .call();

        if (res.crmEvents().isPresent()) {
            System.out.println(res.crmEvents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListCrmEvents2Request](../../models/operations/ListCrmEvents2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListCrmEvents2Response](../../models/operations/ListCrmEvents2Response.md)**

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

        PatchCalendarEvent2Response res = sdk.event().patchCalendarEvent2()
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

## patchCrmEvent2

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmEvent2" method="patch" path="/crm/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmEvent2Request;
import to.unified.unified_java_sdk.models.operations.PatchCrmEvent2Response;
import to.unified.unified_java_sdk.models.shared.CrmEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmEvent2Request req = PatchCrmEvent2Request.builder()
                .crmEvent(CrmEvent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmEvent2Response res = sdk.event().patchCrmEvent2()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchCrmEvent2Request](../../models/operations/PatchCrmEvent2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchCrmEvent2Response](../../models/operations/PatchCrmEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMessagingEvent2

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMessagingEvent2" method="patch" path="/messaging/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMessagingEvent2Request;
import to.unified.unified_java_sdk.models.operations.PatchMessagingEvent2Response;
import to.unified.unified_java_sdk.models.shared.MessagingEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMessagingEvent2Request req = PatchMessagingEvent2Request.builder()
                .messagingEvent(MessagingEvent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMessagingEvent2Response res = sdk.event().patchMessagingEvent2()
                .request(req)
                .call();

        if (res.messagingEvent().isPresent()) {
            System.out.println(res.messagingEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchMessagingEvent2Request](../../models/operations/PatchMessagingEvent2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchMessagingEvent2Response](../../models/operations/PatchMessagingEvent2Response.md)**

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

        RemoveCalendarEvent2Response res = sdk.event().removeCalendarEvent2()
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

## removeCrmEvent2

Remove an event

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmEvent2" method="delete" path="/crm/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmEvent2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCrmEvent2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmEvent2Request req = RemoveCrmEvent2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmEvent2Response res = sdk.event().removeCrmEvent2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveCrmEvent2Request](../../models/operations/RemoveCrmEvent2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveCrmEvent2Response](../../models/operations/RemoveCrmEvent2Response.md)**

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

        UpdateCalendarEvent2Response res = sdk.event().updateCalendarEvent2()
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

## updateCrmEvent2

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmEvent2" method="put" path="/crm/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmEvent2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCrmEvent2Response;
import to.unified.unified_java_sdk.models.shared.CrmEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmEvent2Request req = UpdateCrmEvent2Request.builder()
                .crmEvent(CrmEvent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmEvent2Response res = sdk.event().updateCrmEvent2()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateCrmEvent2Request](../../models/operations/UpdateCrmEvent2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateCrmEvent2Response](../../models/operations/UpdateCrmEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMessagingEvent2

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMessagingEvent2" method="put" path="/messaging/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMessagingEvent2Request;
import to.unified.unified_java_sdk.models.operations.UpdateMessagingEvent2Response;
import to.unified.unified_java_sdk.models.shared.MessagingEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMessagingEvent2Request req = UpdateMessagingEvent2Request.builder()
                .messagingEvent(MessagingEvent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMessagingEvent2Response res = sdk.event().updateMessagingEvent2()
                .request(req)
                .call();

        if (res.messagingEvent().isPresent()) {
            System.out.println(res.messagingEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateMessagingEvent2Request](../../models/operations/UpdateMessagingEvent2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateMessagingEvent2Response](../../models/operations/UpdateMessagingEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |