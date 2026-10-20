# Event

## Overview

### Available Operations

* [createAnalyticsEvent](#createanalyticsevent) - Create an event
* [createCalendarEvent](#createcalendarevent) - Create an event
* [createCdpEvent](#createcdpevent) - Create an event
* [createCrmEvent](#createcrmevent) - Create an event
* [getAnalyticsEvent](#getanalyticsevent) - Retrieve an event
* [getCalendarEvent](#getcalendarevent) - Retrieve an event
* [getCdpEvent](#getcdpevent) - Retrieve an event
* [getClubsEvent](#getclubsevent) - Retrieve an event
* [getCrmEvent](#getcrmevent) - Retrieve an event
* [listAnalyticsEvents](#listanalyticsevents) - List all events
* [listCalendarEvents](#listcalendarevents) - List all events
* [listCdpEvents](#listcdpevents) - List all events
* [listClubsEvents](#listclubsevents) - List all events
* [listCrmEvents](#listcrmevents) - List all events
* [patchCalendarEvent](#patchcalendarevent) - Update an event
* [patchCdpEvent](#patchcdpevent) - Update an event
* [patchCrmEvent](#patchcrmevent) - Update an event
* [patchMessagingEvent](#patchmessagingevent) - Update an event
* [removeCalendarEvent](#removecalendarevent) - Remove an event
* [removeCdpEvent](#removecdpevent) - Remove an event
* [removeCrmEvent](#removecrmevent) - Remove an event
* [updateCalendarEvent](#updatecalendarevent) - Update an event
* [updateCdpEvent](#updatecdpevent) - Update an event
* [updateCrmEvent](#updatecrmevent) - Update an event
* [updateMessagingEvent](#updatemessagingevent) - Update an event

## createAnalyticsEvent

Create an event

### Example Usage

<!-- UsageSnippet language="java" operationID="createAnalyticsEvent" method="post" path="/analytics/{connection_id}/event" example="analytics_event" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsEventRequest;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsEventResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAnalyticsEventRequest req = CreateAnalyticsEventRequest.builder()
                .analyticsEvent(AnalyticsEvent.builder()
                    .createdAt(OffsetDateTime.parse("2023-06-21T03:13:22.954Z"))
                    .eventType(EventType.SCREEN_VIEW)
                    .id("fb6f5a69-e1f9-45c6-9fc8-24592d669597")
                    .metadata(Map.ofEntries(
                        Map.entry("key", PropertyAnalyticsEventMetadata.builder()
                            .build())))
                    .name("page_view")
                    .pageUrl("https://golden-carboxyl.biz")
                    .updatedAt(OffsetDateTime.parse("2023-09-24T14:06:27.235Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAnalyticsEventResponse res = sdk.event().createAnalyticsEvent()
                .request(req)
                .call();

        if (res.analyticsEvent().isPresent()) {
            System.out.println(res.analyticsEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateAnalyticsEventRequest](../../models/operations/CreateAnalyticsEventRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateAnalyticsEventResponse](../../models/operations/CreateAnalyticsEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCalendarEvent

Create an event

### Example Usage

<!-- UsageSnippet language="java" operationID="createCalendarEvent" method="post" path="/calendar/{connection_id}/event" example="calendar_event" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCalendarEventRequest;
import to.unified.unified_java_sdk.models.operations.CreateCalendarEventResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCalendarEventRequest req = CreateCalendarEventRequest.builder()
                .calendarEvent(CalendarEvent.builder()
                    .attachments(List.of())
                    .conference(List.of())
                    .createdAt("2019-08-04T14:33:51.814Z")
                    .endAt("2020-05-24T03:47:02.479Z")
                    .hasConference(false)
                    .id("4e3d114e-ba2b-441a-b39c-5c3f08d82d63")
                    .isAllDay(false)
                    .isFree(false)
                    .isPrivate(false)
                    .location("621 Boehm Prairie")
                    .metadata(List.of())
                    .notes("Aegre traho.")
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(4d)
                            .endAt(OffsetDateTime.parse("2025-03-23T17:00:09.005Z"))
                            .excludedDates(List.of(
                                "2024-02-02T00:39:33.498Z"))
                            .frequency(CalendarEventRecurrenceFrequency.YEARLY)
                            .includedDates(List.of(
                                "2023-07-06T09:41:22.743Z",
                                "2025-01-22T23:38:59.276Z",
                                "2024-04-01T04:56:01.383Z"))
                            .interval(7d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.TU,
                                PropertyCalendarEventRecurrenceOnDays.TH,
                                PropertyCalendarEventRecurrenceOnDays.MO,
                                PropertyCalendarEventRecurrenceOnDays.TH,
                                PropertyCalendarEventRecurrenceOnDays.SA,
                                PropertyCalendarEventRecurrenceOnDays.SA,
                                PropertyCalendarEventRecurrenceOnDays.SA))
                            .onMonthDays(List.of(
                                -3d))
                            .onMonths(List.of(
                                0d,
                                1d,
                                6d,
                                -10d,
                                9d,
                                0d))
                            .onWeeks(List.of(
                                -8d,
                                3d,
                                -7d,
                                51d,
                                -3d,
                                -41d,
                                15d,
                                46d,
                                -1d,
                                46d,
                                42d,
                                11d,
                                12d,
                                -35d,
                                -15d,
                                -3d,
                                -42d,
                                50d,
                                3d,
                                -15d,
                                -10d,
                                6d,
                                -53d,
                                5d,
                                -32d,
                                -22d,
                                43d,
                                -44d,
                                -23d,
                                -21d,
                                -18d,
                                13d,
                                -5d,
                                2d,
                                -49d))
                            .onYearDays(List.of(
                                -87d,
                                339d,
                                341d,
                                287d,
                                -17d,
                                319d,
                                -3d,
                                238d,
                                -115d,
                                -116d,
                                283d,
                                -61d,
                                -254d,
                                86d,
                                -163d,
                                5d,
                                -171d,
                                -99d,
                                279d,
                                19d,
                                303d,
                                -106d,
                                90d,
                                109d,
                                -185d,
                                -285d,
                                -83d,
                                -236d,
                                66d,
                                -215d,
                                178d,
                                64d,
                                78d,
                                5d,
                                -251d,
                                -79d,
                                -271d,
                                33d,
                                320d,
                                67d,
                                -84d,
                                -355d,
                                -364d,
                                348d,
                                271d,
                                -304d,
                                -199d,
                                106d,
                                -345d,
                                24d,
                                -89d,
                                -109d,
                                -314d,
                                365d,
                                38d,
                                -42d,
                                123d,
                                56d,
                                -3d,
                                31d,
                                101d,
                                326d,
                                -160d,
                                -101d,
                                -267d,
                                -309d,
                                -363d,
                                125d,
                                -182d,
                                363d,
                                324d,
                                36d,
                                -269d,
                                -79d,
                                -60d,
                                272d,
                                -254d,
                                -160d,
                                -82d,
                                19d,
                                42d,
                                69d,
                                -104d,
                                333d,
                                236d,
                                -287d,
                                296d,
                                261d,
                                241d,
                                348d,
                                -72d,
                                159d,
                                -127d,
                                229d,
                                -158d,
                                190d,
                                -173d,
                                -84d,
                                -96d,
                                176d,
                                339d,
                                -48d,
                                287d,
                                -46d,
                                -101d,
                                246d,
                                -8d,
                                -74d,
                                338d,
                                -51d,
                                -42d,
                                -128d,
                                -169d,
                                -174d,
                                168d,
                                -85d,
                                37d,
                                169d,
                                -105d,
                                231d,
                                -250d,
                                -286d,
                                -7d,
                                -121d,
                                321d,
                                278d,
                                -120d,
                                -96d,
                                360d,
                                337d,
                                -258d,
                                -179d,
                                324d,
                                -204d,
                                327d,
                                15d,
                                365d,
                                191d,
                                -345d,
                                -345d,
                                56d,
                                217d,
                                60d,
                                -264d,
                                -248d,
                                -316d,
                                191d,
                                -189d,
                                -152d,
                                -296d,
                                194d,
                                -42d,
                                -21d,
                                -218d,
                                171d,
                                -15d,
                                301d,
                                37d,
                                -167d,
                                18d,
                                248d,
                                -263d,
                                27d,
                                14d,
                                59d,
                                219d,
                                -284d,
                                221d,
                                -76d,
                                277d,
                                183d,
                                200d,
                                -12d,
                                -28d,
                                -79d,
                                150d,
                                320d,
                                -152d,
                                -15d,
                                -42d,
                                -125d,
                                -4d,
                                269d,
                                290d,
                                52d,
                                320d,
                                344d,
                                13d,
                                -69d,
                                255d,
                                -154d,
                                -281d,
                                158d,
                                25d,
                                240d,
                                -339d,
                                96d,
                                204d,
                                324d,
                                221d,
                                37d,
                                -333d,
                                87d,
                                354d,
                                -365d,
                                -203d,
                                -341d,
                                -79d,
                                -208d,
                                135d,
                                132d,
                                -351d,
                                39d,
                                -87d,
                                -297d,
                                -66d,
                                346d,
                                69d,
                                -177d,
                                235d,
                                295d,
                                -366d,
                                -55d,
                                -297d,
                                -308d,
                                -294d,
                                -208d,
                                141d,
                                267d,
                                64d,
                                100d,
                                -355d,
                                -335d,
                                280d,
                                224d,
                                259d,
                                1d,
                                -146d,
                                48d,
                                335d,
                                363d,
                                308d,
                                -224d,
                                109d,
                                -10d,
                                -89d,
                                -211d,
                                -47d,
                                -130d,
                                341d,
                                -250d,
                                295d,
                                -329d,
                                -205d,
                                231d,
                                247d,
                                -228d,
                                166d,
                                -28d,
                                36d,
                                277d,
                                -115d,
                                100d,
                                2d,
                                81d,
                                -66d,
                                31d,
                                -39d,
                                -319d,
                                -251d,
                                -254d))
                            .timezone("Asia/Ho_Chi_Minh")
                            .weekStart(WeekStart.TU)
                            .build()))
                    .startAt("2020-05-23T18:33:40.498Z")
                    .status(CalendarEventStatus.CONFIRMED)
                    .subject("Sunt spargo tepidus bestia vigor credo coadunatio appello.")
                    .timezone("Asia/Bangkok")
                    .updatedAt("2020-06-30T01:45:14.348Z")
                    .webUrl("https://another-pinstripe.com")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCalendarEventResponse res = sdk.event().createCalendarEvent()
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
| `request`                                                                           | [CreateCalendarEventRequest](../../models/operations/CreateCalendarEventRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateCalendarEventResponse](../../models/operations/CreateCalendarEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCdpEvent

Create an event

### Example Usage

<!-- UsageSnippet language="java" operationID="createCdpEvent" method="post" path="/cdp/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCdpEventRequest;
import to.unified.unified_java_sdk.models.operations.CreateCdpEventResponse;
import to.unified.unified_java_sdk.models.shared.CdpEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCdpEventRequest req = CreateCdpEventRequest.builder()
                .cdpEvent(CdpEvent.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCdpEventResponse res = sdk.event().createCdpEvent()
                .request(req)
                .call();

        if (res.cdpEvent().isPresent()) {
            System.out.println(res.cdpEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateCdpEventRequest](../../models/operations/CreateCdpEventRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateCdpEventResponse](../../models/operations/CreateCdpEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCrmEvent

Create an event

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmEvent" method="post" path="/crm/{connection_id}/event" example="crm_event" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmEventRequest;
import to.unified.unified_java_sdk.models.operations.CreateCrmEventResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmEventRequest req = CreateCrmEventRequest.builder()
                .crmEvent(CrmEvent.builder()
                    .call(PropertyCrmEventCall.builder()
                        .description("Arbitro aptus.")
                        .duration(64d)
                        .startAt(OffsetDateTime.parse("2024-12-10T04:23:26.129Z"))
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-07-14T04:53:23.784Z"))
                    .id("007dbc50-0981-4467-94be-36d3cd65c1ea")
                    .metadata(List.of())
                    .type(CrmEventType.CALL)
                    .updatedAt(OffsetDateTime.parse("2026-10-10T08:01:43.931Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmEventResponse res = sdk.event().createCrmEvent()
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
| `request`                                                                 | [CreateCrmEventRequest](../../models/operations/CreateCrmEventRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateCrmEventResponse](../../models/operations/CreateCrmEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAnalyticsEvent

Retrieve an event

### Example Usage

<!-- UsageSnippet language="java" operationID="getAnalyticsEvent" method="get" path="/analytics/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsEventRequest;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsEventResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAnalyticsEventRequest req = GetAnalyticsEventRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAnalyticsEventResponse res = sdk.event().getAnalyticsEvent()
                .request(req)
                .call();

        if (res.analyticsEvent().isPresent()) {
            System.out.println(res.analyticsEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetAnalyticsEventRequest](../../models/operations/GetAnalyticsEventRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetAnalyticsEventResponse](../../models/operations/GetAnalyticsEventResponse.md)**

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

        GetCalendarEventResponse res = sdk.event().getCalendarEvent()
                .request(req)
                .call();

        if (res.calendarEvent().isPresent()) {
            System.out.println(res.calendarEvent().get());
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

## getCdpEvent

Retrieve an event

### Example Usage

<!-- UsageSnippet language="java" operationID="getCdpEvent" method="get" path="/cdp/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCdpEventRequest;
import to.unified.unified_java_sdk.models.operations.GetCdpEventResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCdpEventRequest req = GetCdpEventRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCdpEventResponse res = sdk.event().getCdpEvent()
                .request(req)
                .call();

        if (res.cdpEvent().isPresent()) {
            System.out.println(res.cdpEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetCdpEventRequest](../../models/operations/GetCdpEventRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetCdpEventResponse](../../models/operations/GetCdpEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getClubsEvent

Retrieve an event

### Example Usage

<!-- UsageSnippet language="java" operationID="getClubsEvent" method="get" path="/clubs/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetClubsEventRequest;
import to.unified.unified_java_sdk.models.operations.GetClubsEventResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetClubsEventRequest req = GetClubsEventRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetClubsEventResponse res = sdk.event().getClubsEvent()
                .request(req)
                .call();

        if (res.clubsEvent().isPresent()) {
            System.out.println(res.clubsEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetClubsEventRequest](../../models/operations/GetClubsEventRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetClubsEventResponse](../../models/operations/GetClubsEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmEvent

Retrieve an event

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmEvent" method="get" path="/crm/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmEventRequest;
import to.unified.unified_java_sdk.models.operations.GetCrmEventResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmEventRequest req = GetCrmEventRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmEventResponse res = sdk.event().getCrmEvent()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetCrmEventRequest](../../models/operations/GetCrmEventRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetCrmEventResponse](../../models/operations/GetCrmEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAnalyticsEvents

List all events

### Example Usage

<!-- UsageSnippet language="java" operationID="listAnalyticsEvents" method="get" path="/analytics/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsEventsRequest;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsEventsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAnalyticsEventsRequest req = ListAnalyticsEventsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAnalyticsEventsResponse res = sdk.event().listAnalyticsEvents()
                .request(req)
                .call();

        if (res.analyticsEvents().isPresent()) {
            System.out.println(res.analyticsEvents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListAnalyticsEventsRequest](../../models/operations/ListAnalyticsEventsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListAnalyticsEventsResponse](../../models/operations/ListAnalyticsEventsResponse.md)**

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

        ListCalendarEventsResponse res = sdk.event().listCalendarEvents()
                .request(req)
                .call();

        if (res.calendarEvents().isPresent()) {
            System.out.println(res.calendarEvents().get());
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

## listCdpEvents

List all events

### Example Usage

<!-- UsageSnippet language="java" operationID="listCdpEvents" method="get" path="/cdp/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCdpEventsRequest;
import to.unified.unified_java_sdk.models.operations.ListCdpEventsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCdpEventsRequest req = ListCdpEventsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCdpEventsResponse res = sdk.event().listCdpEvents()
                .request(req)
                .call();

        if (res.cdpEvents().isPresent()) {
            System.out.println(res.cdpEvents().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListCdpEventsRequest](../../models/operations/ListCdpEventsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListCdpEventsResponse](../../models/operations/ListCdpEventsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listClubsEvents

List all events

### Example Usage

<!-- UsageSnippet language="java" operationID="listClubsEvents" method="get" path="/clubs/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListClubsEventsRequest;
import to.unified.unified_java_sdk.models.operations.ListClubsEventsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListClubsEventsRequest req = ListClubsEventsRequest.builder()
                .connectionId("<id>")
                .build();

        ListClubsEventsResponse res = sdk.event().listClubsEvents()
                .request(req)
                .call();

        if (res.clubsEvents().isPresent()) {
            System.out.println(res.clubsEvents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListClubsEventsRequest](../../models/operations/ListClubsEventsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListClubsEventsResponse](../../models/operations/ListClubsEventsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmEvents

List all events

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmEvents" method="get" path="/crm/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmEventsRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmEventsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmEventsRequest req = ListCrmEventsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmEventsResponse res = sdk.event().listCrmEvents()
                .request(req)
                .call();

        if (res.crmEvents().isPresent()) {
            System.out.println(res.crmEvents().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListCrmEventsRequest](../../models/operations/ListCrmEventsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListCrmEventsResponse](../../models/operations/ListCrmEventsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCalendarEvent

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarEvent" method="patch" path="/calendar/{connection_id}/event/{id}" example="calendar_event" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCalendarEventRequest;
import to.unified.unified_java_sdk.models.operations.PatchCalendarEventResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCalendarEventRequest req = PatchCalendarEventRequest.builder()
                .calendarEvent(CalendarEvent.builder()
                    .attachments(List.of())
                    .conference(List.of())
                    .createdAt("2019-08-04T14:33:51.814Z")
                    .endAt("2020-05-24T03:47:02.484Z")
                    .hasConference(false)
                    .id("6c102b53-2d33-417d-851f-56457ddabd50")
                    .isAllDay(false)
                    .isFree(false)
                    .isPrivate(false)
                    .location("621 Boehm Prairie")
                    .metadata(List.of())
                    .notes("Aegre traho.")
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(4d)
                            .endAt(OffsetDateTime.parse("2025-03-23T17:00:09.038Z"))
                            .excludedDates(List.of(
                                "2024-02-02T00:39:33.524Z"))
                            .frequency(CalendarEventRecurrenceFrequency.YEARLY)
                            .includedDates(List.of(
                                "2023-07-06T09:41:22.766Z",
                                "2025-01-22T23:38:59.308Z",
                                "2024-04-01T04:56:01.410Z"))
                            .interval(7d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.TU,
                                PropertyCalendarEventRecurrenceOnDays.TH,
                                PropertyCalendarEventRecurrenceOnDays.MO,
                                PropertyCalendarEventRecurrenceOnDays.TH,
                                PropertyCalendarEventRecurrenceOnDays.SA,
                                PropertyCalendarEventRecurrenceOnDays.SA,
                                PropertyCalendarEventRecurrenceOnDays.SA))
                            .onMonthDays(List.of(
                                -3d))
                            .onMonths(List.of(
                                0d,
                                1d,
                                6d,
                                -10d,
                                9d,
                                0d))
                            .onWeeks(List.of(
                                -8d,
                                3d,
                                -7d,
                                51d,
                                -3d,
                                -41d,
                                15d,
                                46d,
                                -1d,
                                46d,
                                42d,
                                11d,
                                12d,
                                -35d,
                                -15d,
                                -3d,
                                -42d,
                                50d,
                                3d,
                                -15d,
                                -10d,
                                6d,
                                -53d,
                                5d,
                                -32d,
                                -22d,
                                43d,
                                -44d,
                                -23d,
                                -21d,
                                -18d,
                                13d,
                                -5d,
                                2d,
                                -49d))
                            .onYearDays(List.of(
                                -87d,
                                339d,
                                341d,
                                287d,
                                -17d,
                                319d,
                                -3d,
                                238d,
                                -115d,
                                -116d,
                                283d,
                                -61d,
                                -254d,
                                86d,
                                -163d,
                                5d,
                                -171d,
                                -99d,
                                279d,
                                19d,
                                303d,
                                -106d,
                                90d,
                                109d,
                                -185d,
                                -285d,
                                -83d,
                                -236d,
                                66d,
                                -215d,
                                178d,
                                64d,
                                78d,
                                5d,
                                -251d,
                                -79d,
                                -271d,
                                33d,
                                320d,
                                67d,
                                -84d,
                                -355d,
                                -364d,
                                348d,
                                271d,
                                -304d,
                                -199d,
                                106d,
                                -345d,
                                24d,
                                -89d,
                                -109d,
                                -314d,
                                365d,
                                38d,
                                -42d,
                                123d,
                                56d,
                                -3d,
                                31d,
                                101d,
                                326d,
                                -160d,
                                -101d,
                                -267d,
                                -309d,
                                -363d,
                                125d,
                                -182d,
                                363d,
                                324d,
                                36d,
                                -269d,
                                -79d,
                                -60d,
                                272d,
                                -254d,
                                -160d,
                                -82d,
                                19d,
                                42d,
                                69d,
                                -104d,
                                333d,
                                236d,
                                -287d,
                                296d,
                                261d,
                                241d,
                                348d,
                                -72d,
                                159d,
                                -127d,
                                229d,
                                -158d,
                                190d,
                                -173d,
                                -84d,
                                -96d,
                                176d,
                                339d,
                                -48d,
                                287d,
                                -46d,
                                -101d,
                                246d,
                                -8d,
                                -74d,
                                338d,
                                -51d,
                                -42d,
                                -128d,
                                -169d,
                                -174d,
                                168d,
                                -85d,
                                37d,
                                169d,
                                -105d,
                                231d,
                                -250d,
                                -286d,
                                -7d,
                                -121d,
                                321d,
                                278d,
                                -120d,
                                -96d,
                                360d,
                                337d,
                                -258d,
                                -179d,
                                324d,
                                -204d,
                                327d,
                                15d,
                                365d,
                                191d,
                                -345d,
                                -345d,
                                56d,
                                217d,
                                60d,
                                -264d,
                                -248d,
                                -316d,
                                191d,
                                -189d,
                                -152d,
                                -296d,
                                194d,
                                -42d,
                                -21d,
                                -218d,
                                171d,
                                -15d,
                                301d,
                                37d,
                                -167d,
                                18d,
                                248d,
                                -263d,
                                27d,
                                14d,
                                59d,
                                219d,
                                -284d,
                                221d,
                                -76d,
                                277d,
                                183d,
                                200d,
                                -12d,
                                -28d,
                                -79d,
                                150d,
                                320d,
                                -152d,
                                -15d,
                                -42d,
                                -125d,
                                -4d,
                                269d,
                                290d,
                                52d,
                                320d,
                                344d,
                                13d,
                                -69d,
                                255d,
                                -154d,
                                -281d,
                                158d,
                                25d,
                                240d,
                                -339d,
                                96d,
                                204d,
                                324d,
                                221d,
                                37d,
                                -333d,
                                87d,
                                354d,
                                -365d,
                                -203d,
                                -341d,
                                -79d,
                                -208d,
                                135d,
                                132d,
                                -351d,
                                39d,
                                -87d,
                                -297d,
                                -66d,
                                346d,
                                69d,
                                -177d,
                                235d,
                                295d,
                                -366d,
                                -55d,
                                -297d,
                                -308d,
                                -294d,
                                -208d,
                                141d,
                                267d,
                                64d,
                                100d,
                                -355d,
                                -335d,
                                280d,
                                224d,
                                259d,
                                1d,
                                -146d,
                                48d,
                                335d,
                                363d,
                                308d,
                                -224d,
                                109d,
                                -10d,
                                -89d,
                                -211d,
                                -47d,
                                -130d,
                                341d,
                                -250d,
                                295d,
                                -329d,
                                -205d,
                                231d,
                                247d,
                                -228d,
                                166d,
                                -28d,
                                36d,
                                277d,
                                -115d,
                                100d,
                                2d,
                                81d,
                                -66d,
                                31d,
                                -39d,
                                -319d,
                                -251d,
                                -254d))
                            .timezone("Asia/Ho_Chi_Minh")
                            .weekStart(WeekStart.TU)
                            .build()))
                    .startAt("2020-05-23T18:33:40.503Z")
                    .status(CalendarEventStatus.CONFIRMED)
                    .subject("Sunt spargo tepidus bestia vigor credo coadunatio appello.")
                    .timezone("Asia/Bangkok")
                    .updatedAt("2020-06-30T01:45:14.353Z")
                    .webUrl("https://another-pinstripe.com")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCalendarEventResponse res = sdk.event().patchCalendarEvent()
                .request(req)
                .call();

        if (res.calendarEvent().isPresent()) {
            System.out.println(res.calendarEvent().get());
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

## patchCdpEvent

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCdpEvent" method="patch" path="/cdp/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCdpEventRequest;
import to.unified.unified_java_sdk.models.operations.PatchCdpEventResponse;
import to.unified.unified_java_sdk.models.shared.CdpEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCdpEventRequest req = PatchCdpEventRequest.builder()
                .cdpEvent(CdpEvent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCdpEventResponse res = sdk.event().patchCdpEvent()
                .request(req)
                .call();

        if (res.cdpEvent().isPresent()) {
            System.out.println(res.cdpEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchCdpEventRequest](../../models/operations/PatchCdpEventRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchCdpEventResponse](../../models/operations/PatchCdpEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmEvent

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmEvent" method="patch" path="/crm/{connection_id}/event/{id}" example="crm_event" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmEventRequest;
import to.unified.unified_java_sdk.models.operations.PatchCrmEventResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmEventRequest req = PatchCrmEventRequest.builder()
                .crmEvent(CrmEvent.builder()
                    .call(PropertyCrmEventCall.builder()
                        .description("Arbitro aptus.")
                        .duration(64d)
                        .startAt(OffsetDateTime.parse("2024-12-10T04:23:26.176Z"))
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-07-14T04:53:23.784Z"))
                    .id("1e37c4ca-805c-4ac6-a935-d9235a179c75")
                    .metadata(List.of())
                    .type(CrmEventType.CALL)
                    .updatedAt(OffsetDateTime.parse("2026-10-10T08:01:43.997Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmEventResponse res = sdk.event().patchCrmEvent()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchCrmEventRequest](../../models/operations/PatchCrmEventRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchCrmEventResponse](../../models/operations/PatchCrmEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMessagingEvent

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMessagingEvent" method="patch" path="/messaging/{connection_id}/event/{id}" example="messaging_event" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMessagingEventRequest;
import to.unified.unified_java_sdk.models.operations.PatchMessagingEventResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMessagingEventRequest req = PatchMessagingEventRequest.builder()
                .messagingEvent(MessagingEvent.builder()
                    .channel(PropertyMessagingEventChannel.builder()
                        .id("")
                        .name("")
                        .build())
                    .createdAt(OffsetDateTime.parse("2019-05-30T19:44:46.461Z"))
                    .id("e20be20d-d152-4cb9-8138-1a3a3cd2619a")
                    .isReplacingOriginal(false)
                    .metadata(List.of())
                    .type(MessagingEventType.BUTTON_CLICK)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMessagingEventResponse res = sdk.event().patchMessagingEvent()
                .request(req)
                .call();

        if (res.messagingEvent().isPresent()) {
            System.out.println(res.messagingEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchMessagingEventRequest](../../models/operations/PatchMessagingEventRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchMessagingEventResponse](../../models/operations/PatchMessagingEventResponse.md)**

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

        RemoveCalendarEventResponse res = sdk.event().removeCalendarEvent()
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

## removeCdpEvent

Remove an event

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCdpEvent" method="delete" path="/cdp/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCdpEventRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCdpEventResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCdpEventRequest req = RemoveCdpEventRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCdpEventResponse res = sdk.event().removeCdpEvent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveCdpEventRequest](../../models/operations/RemoveCdpEventRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveCdpEventResponse](../../models/operations/RemoveCdpEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmEvent

Remove an event

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmEvent" method="delete" path="/crm/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmEventRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCrmEventResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmEventRequest req = RemoveCrmEventRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmEventResponse res = sdk.event().removeCrmEvent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveCrmEventRequest](../../models/operations/RemoveCrmEventRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveCrmEventResponse](../../models/operations/RemoveCrmEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCalendarEvent

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCalendarEvent" method="put" path="/calendar/{connection_id}/event/{id}" example="calendar_event" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarEventRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarEventResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCalendarEventRequest req = UpdateCalendarEventRequest.builder()
                .calendarEvent(CalendarEvent.builder()
                    .attachments(List.of())
                    .conference(List.of())
                    .createdAt("2019-08-04T14:33:51.814Z")
                    .endAt("2020-05-24T03:47:02.484Z")
                    .hasConference(false)
                    .id("6c102b53-2d33-417d-851f-56457ddabd50")
                    .isAllDay(false)
                    .isFree(false)
                    .isPrivate(false)
                    .location("621 Boehm Prairie")
                    .metadata(List.of())
                    .notes("Aegre traho.")
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(4d)
                            .endAt(OffsetDateTime.parse("2025-03-23T17:00:09.038Z"))
                            .excludedDates(List.of(
                                "2024-02-02T00:39:33.524Z"))
                            .frequency(CalendarEventRecurrenceFrequency.YEARLY)
                            .includedDates(List.of(
                                "2023-07-06T09:41:22.766Z",
                                "2025-01-22T23:38:59.308Z",
                                "2024-04-01T04:56:01.410Z"))
                            .interval(7d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.TU,
                                PropertyCalendarEventRecurrenceOnDays.TH,
                                PropertyCalendarEventRecurrenceOnDays.MO,
                                PropertyCalendarEventRecurrenceOnDays.TH,
                                PropertyCalendarEventRecurrenceOnDays.SA,
                                PropertyCalendarEventRecurrenceOnDays.SA,
                                PropertyCalendarEventRecurrenceOnDays.SA))
                            .onMonthDays(List.of(
                                -3d))
                            .onMonths(List.of(
                                0d,
                                1d,
                                6d,
                                -10d,
                                9d,
                                0d))
                            .onWeeks(List.of(
                                -8d,
                                3d,
                                -7d,
                                51d,
                                -3d,
                                -41d,
                                15d,
                                46d,
                                -1d,
                                46d,
                                42d,
                                11d,
                                12d,
                                -35d,
                                -15d,
                                -3d,
                                -42d,
                                50d,
                                3d,
                                -15d,
                                -10d,
                                6d,
                                -53d,
                                5d,
                                -32d,
                                -22d,
                                43d,
                                -44d,
                                -23d,
                                -21d,
                                -18d,
                                13d,
                                -5d,
                                2d,
                                -49d))
                            .onYearDays(List.of(
                                -87d,
                                339d,
                                341d,
                                287d,
                                -17d,
                                319d,
                                -3d,
                                238d,
                                -115d,
                                -116d,
                                283d,
                                -61d,
                                -254d,
                                86d,
                                -163d,
                                5d,
                                -171d,
                                -99d,
                                279d,
                                19d,
                                303d,
                                -106d,
                                90d,
                                109d,
                                -185d,
                                -285d,
                                -83d,
                                -236d,
                                66d,
                                -215d,
                                178d,
                                64d,
                                78d,
                                5d,
                                -251d,
                                -79d,
                                -271d,
                                33d,
                                320d,
                                67d,
                                -84d,
                                -355d,
                                -364d,
                                348d,
                                271d,
                                -304d,
                                -199d,
                                106d,
                                -345d,
                                24d,
                                -89d,
                                -109d,
                                -314d,
                                365d,
                                38d,
                                -42d,
                                123d,
                                56d,
                                -3d,
                                31d,
                                101d,
                                326d,
                                -160d,
                                -101d,
                                -267d,
                                -309d,
                                -363d,
                                125d,
                                -182d,
                                363d,
                                324d,
                                36d,
                                -269d,
                                -79d,
                                -60d,
                                272d,
                                -254d,
                                -160d,
                                -82d,
                                19d,
                                42d,
                                69d,
                                -104d,
                                333d,
                                236d,
                                -287d,
                                296d,
                                261d,
                                241d,
                                348d,
                                -72d,
                                159d,
                                -127d,
                                229d,
                                -158d,
                                190d,
                                -173d,
                                -84d,
                                -96d,
                                176d,
                                339d,
                                -48d,
                                287d,
                                -46d,
                                -101d,
                                246d,
                                -8d,
                                -74d,
                                338d,
                                -51d,
                                -42d,
                                -128d,
                                -169d,
                                -174d,
                                168d,
                                -85d,
                                37d,
                                169d,
                                -105d,
                                231d,
                                -250d,
                                -286d,
                                -7d,
                                -121d,
                                321d,
                                278d,
                                -120d,
                                -96d,
                                360d,
                                337d,
                                -258d,
                                -179d,
                                324d,
                                -204d,
                                327d,
                                15d,
                                365d,
                                191d,
                                -345d,
                                -345d,
                                56d,
                                217d,
                                60d,
                                -264d,
                                -248d,
                                -316d,
                                191d,
                                -189d,
                                -152d,
                                -296d,
                                194d,
                                -42d,
                                -21d,
                                -218d,
                                171d,
                                -15d,
                                301d,
                                37d,
                                -167d,
                                18d,
                                248d,
                                -263d,
                                27d,
                                14d,
                                59d,
                                219d,
                                -284d,
                                221d,
                                -76d,
                                277d,
                                183d,
                                200d,
                                -12d,
                                -28d,
                                -79d,
                                150d,
                                320d,
                                -152d,
                                -15d,
                                -42d,
                                -125d,
                                -4d,
                                269d,
                                290d,
                                52d,
                                320d,
                                344d,
                                13d,
                                -69d,
                                255d,
                                -154d,
                                -281d,
                                158d,
                                25d,
                                240d,
                                -339d,
                                96d,
                                204d,
                                324d,
                                221d,
                                37d,
                                -333d,
                                87d,
                                354d,
                                -365d,
                                -203d,
                                -341d,
                                -79d,
                                -208d,
                                135d,
                                132d,
                                -351d,
                                39d,
                                -87d,
                                -297d,
                                -66d,
                                346d,
                                69d,
                                -177d,
                                235d,
                                295d,
                                -366d,
                                -55d,
                                -297d,
                                -308d,
                                -294d,
                                -208d,
                                141d,
                                267d,
                                64d,
                                100d,
                                -355d,
                                -335d,
                                280d,
                                224d,
                                259d,
                                1d,
                                -146d,
                                48d,
                                335d,
                                363d,
                                308d,
                                -224d,
                                109d,
                                -10d,
                                -89d,
                                -211d,
                                -47d,
                                -130d,
                                341d,
                                -250d,
                                295d,
                                -329d,
                                -205d,
                                231d,
                                247d,
                                -228d,
                                166d,
                                -28d,
                                36d,
                                277d,
                                -115d,
                                100d,
                                2d,
                                81d,
                                -66d,
                                31d,
                                -39d,
                                -319d,
                                -251d,
                                -254d))
                            .timezone("Asia/Ho_Chi_Minh")
                            .weekStart(WeekStart.TU)
                            .build()))
                    .startAt("2020-05-23T18:33:40.503Z")
                    .status(CalendarEventStatus.CONFIRMED)
                    .subject("Sunt spargo tepidus bestia vigor credo coadunatio appello.")
                    .timezone("Asia/Bangkok")
                    .updatedAt("2020-06-30T01:45:14.353Z")
                    .webUrl("https://another-pinstripe.com")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCalendarEventResponse res = sdk.event().updateCalendarEvent()
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
| `request`                                                                           | [UpdateCalendarEventRequest](../../models/operations/UpdateCalendarEventRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateCalendarEventResponse](../../models/operations/UpdateCalendarEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCdpEvent

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCdpEvent" method="put" path="/cdp/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCdpEventRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCdpEventResponse;
import to.unified.unified_java_sdk.models.shared.CdpEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCdpEventRequest req = UpdateCdpEventRequest.builder()
                .cdpEvent(CdpEvent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCdpEventResponse res = sdk.event().updateCdpEvent()
                .request(req)
                .call();

        if (res.cdpEvent().isPresent()) {
            System.out.println(res.cdpEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateCdpEventRequest](../../models/operations/UpdateCdpEventRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateCdpEventResponse](../../models/operations/UpdateCdpEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmEvent

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmEvent" method="put" path="/crm/{connection_id}/event/{id}" example="crm_event" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmEventRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCrmEventResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmEventRequest req = UpdateCrmEventRequest.builder()
                .crmEvent(CrmEvent.builder()
                    .call(PropertyCrmEventCall.builder()
                        .description("Arbitro aptus.")
                        .duration(64d)
                        .startAt(OffsetDateTime.parse("2024-12-10T04:23:26.176Z"))
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-07-14T04:53:23.784Z"))
                    .id("1e37c4ca-805c-4ac6-a935-d9235a179c75")
                    .metadata(List.of())
                    .type(CrmEventType.CALL)
                    .updatedAt(OffsetDateTime.parse("2026-10-10T08:01:43.997Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmEventResponse res = sdk.event().updateCrmEvent()
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
| `request`                                                                 | [UpdateCrmEventRequest](../../models/operations/UpdateCrmEventRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateCrmEventResponse](../../models/operations/UpdateCrmEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMessagingEvent

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMessagingEvent" method="put" path="/messaging/{connection_id}/event/{id}" example="messaging_event" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMessagingEventRequest;
import to.unified.unified_java_sdk.models.operations.UpdateMessagingEventResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMessagingEventRequest req = UpdateMessagingEventRequest.builder()
                .messagingEvent(MessagingEvent.builder()
                    .channel(PropertyMessagingEventChannel.builder()
                        .id("")
                        .name("")
                        .build())
                    .createdAt(OffsetDateTime.parse("2019-05-30T19:44:46.461Z"))
                    .id("e20be20d-d152-4cb9-8138-1a3a3cd2619a")
                    .isReplacingOriginal(false)
                    .metadata(List.of())
                    .type(MessagingEventType.BUTTON_CLICK)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMessagingEventResponse res = sdk.event().updateMessagingEvent()
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
| `request`                                                                             | [UpdateMessagingEventRequest](../../models/operations/UpdateMessagingEventRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateMessagingEventResponse](../../models/operations/UpdateMessagingEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |