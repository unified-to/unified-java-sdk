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

Creates a CalendarCalendar. Provide the unified CalendarCalendar fields in the request body; they are mapped to the provider's API. Returns the created CalendarCalendar.

### Example Usage

<!-- UsageSnippet language="java" operationID="createCalendarCalendar" method="post" path="/calendar/{connection_id}/calendar" example="calendar_calendar" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .createdAt(OffsetDateTime.parse("2020-01-09T23:11:34.147Z"))
                    .description("Acer supra vallum suasoria thesaurus.")
                    .id("c666ef84-afe6-4909-804e-2b45135fa8c4")
                    .isPrimary(false)
                    .metadata(List.of())
                    .name("Interviews")
                    .timezone("Asia/Kolkata")
                    .updatedAt(OffsetDateTime.parse("2023-03-28T15:16:42.041Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCalendarCalendarResponse res = sdk.calendar().createCalendarCalendar()
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
| `request`                                                                                 | [CreateCalendarCalendarRequest](../../models/operations/CreateCalendarCalendarRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateCalendarCalendarResponse](../../models/operations/CreateCalendarCalendarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCalendarEvent

Creates a CalendarEvent. Provide the unified CalendarEvent fields in the request body; they are mapped to the provider's API. Returns the created CalendarEvent.

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
                    .endAt("2020-05-24T09:48:11.260Z")
                    .hasConference(false)
                    .id("ffe78a81-4e30-48bf-bc50-9887b7ef0982")
                    .isAllDay(false)
                    .isFree(false)
                    .isPrivate(false)
                    .location("621 Boehm Prairie")
                    .metadata(List.of())
                    .notes("Aegre traho.")
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(4d)
                            .endAt(OffsetDateTime.parse("2025-03-25T11:12:10.065Z"))
                            .excludedDates(List.of(
                                "2024-02-03T10:20:10.604Z"))
                            .frequency(CalendarEventRecurrenceFrequency.YEARLY)
                            .includedDates(List.of(
                                "2023-07-07T15:02:52.424Z",
                                "2025-01-24T16:37:31.814Z",
                                "2024-04-02T15:49:26.787Z"))
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
                    .startAt("2020-05-24T00:34:20.913Z")
                    .status(CalendarEventStatus.CONFIRMED)
                    .subject("Sunt spargo tepidus bestia vigor credo coadunatio appello.")
                    .timezone("Asia/Bangkok")
                    .updatedAt("2020-06-30T08:31:48.081Z")
                    .webUrl("https://another-pinstripe.com")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCalendarEventResponse res = sdk.calendar().createCalendarEvent()
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

## createCalendarLink

Creates a CalendarLink. Provide the unified CalendarLink fields in the request body; they are mapped to the provider's API. Returns the created CalendarLink.

### Example Usage

<!-- UsageSnippet language="java" operationID="createCalendarLink" method="post" path="/calendar/{connection_id}/link" example="calendar_link" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
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
                    .url("https://annual-apricot.info/")
                    .createdAt("2023-03-07T13:34:11.959Z")
                    .description("Vitium clibanus laboriosam uxor denuncio.")
                    .duration(74d)
                    .id("488c692c-8eea-435e-8c76-200396f276f0")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Sopor sopor ancilla animus anser dignissimos vito confero utilis.")
                    .priceAmount(44d)
                    .priceCurrency("USD")
                    .updatedAt("2024-03-15T20:05:21.480Z")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCalendarLinkResponse res = sdk.calendar().createCalendarLink()
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
| `request`                                                                         | [CreateCalendarLinkRequest](../../models/operations/CreateCalendarLinkRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateCalendarLinkResponse](../../models/operations/CreateCalendarLinkResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCalendarWebinar

Creates a CalendarWebinar. Provide the unified CalendarWebinar fields in the request body; they are mapped to the provider's API. Returns the created CalendarWebinar.

### Example Usage

<!-- UsageSnippet language="java" operationID="createCalendarWebinar" method="post" path="/calendar/{connection_id}/webinar" example="calendar_webinar" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCalendarWebinarRequest;
import to.unified.unified_java_sdk.models.operations.CreateCalendarWebinarResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCalendarWebinarRequest req = CreateCalendarWebinarRequest.builder()
                .calendarWebinar(CalendarWebinar.builder()
                    .conference(List.of())
                    .createdAt(OffsetDateTime.parse("2022-07-06T11:45:14.631Z"))
                    .endAt(OffsetDateTime.parse("2025-10-29T12:38:34.691Z"))
                    .hasPolls(false)
                    .hasRecording(false)
                    .id("70b05720-12c4-4475-8d9e-4d9952a0a5d6")
                    .isAutoApprove(false)
                    .isEnabled(true)
                    .isWebcast(false)
                    .joinUrl("https://nutritious-crocodile.com")
                    .metadata(List.of())
                    .notes("Curriculum ducimus assentator aspernatur ait.")
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(10d)
                            .endAt(OffsetDateTime.parse("2023-08-31T21:31:01.155Z"))
                            .excludedDates(List.of(
                                "2025-02-13T15:46:31.413Z"))
                            .frequency(CalendarEventRecurrenceFrequency.MONTHLY)
                            .includedDates(List.of(
                                "2024-04-28T17:19:58.766Z"))
                            .interval(8d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.SU,
                                PropertyCalendarEventRecurrenceOnDays.FR,
                                PropertyCalendarEventRecurrenceOnDays.SA,
                                PropertyCalendarEventRecurrenceOnDays.WE,
                                PropertyCalendarEventRecurrenceOnDays.MO))
                            .onMonthDays(List.of(
                                -10d))
                            .onMonths(List.of(
                                -9d))
                            .onWeeks(List.of(
                                10d,
                                30d,
                                -38d,
                                30d,
                                -22d,
                                37d,
                                -12d,
                                27d,
                                2d,
                                15d,
                                26d,
                                18d,
                                -43d,
                                -33d,
                                -27d,
                                38d,
                                28d,
                                47d,
                                -8d,
                                24d,
                                35d,
                                -2d,
                                7d,
                                49d,
                                38d,
                                -41d,
                                46d,
                                -11d,
                                -45d,
                                0d,
                                48d,
                                34d))
                            .onYearDays(List.of(
                                345d,
                                -207d,
                                230d,
                                -10d,
                                364d,
                                -256d,
                                -218d,
                                -295d,
                                290d,
                                -250d,
                                -315d,
                                60d,
                                205d,
                                -247d,
                                -318d,
                                -211d,
                                -13d,
                                256d,
                                -200d,
                                -313d,
                                336d,
                                -332d,
                                -90d,
                                287d,
                                -273d,
                                156d,
                                241d,
                                -138d,
                                -363d,
                                -37d,
                                -171d,
                                -62d,
                                -57d,
                                280d,
                                -322d,
                                -79d,
                                -364d,
                                -201d,
                                84d,
                                341d,
                                334d,
                                -75d,
                                332d,
                                207d,
                                337d,
                                -244d,
                                131d,
                                -191d,
                                164d,
                                -235d,
                                285d,
                                -309d,
                                -158d,
                                306d,
                                180d,
                                -130d,
                                -162d,
                                -155d,
                                3d,
                                198d,
                                26d,
                                -366d,
                                -191d,
                                127d,
                                -331d,
                                -11d,
                                -239d,
                                -189d,
                                243d,
                                118d,
                                346d,
                                -174d,
                                -146d,
                                -161d,
                                -330d,
                                327d,
                                192d,
                                310d,
                                316d,
                                313d,
                                -242d,
                                -51d,
                                -264d,
                                -180d,
                                -88d,
                                305d,
                                270d,
                                358d,
                                -173d,
                                -298d,
                                153d,
                                -89d,
                                155d,
                                -45d,
                                248d,
                                -46d,
                                -146d,
                                300d,
                                364d,
                                -335d,
                                356d,
                                -18d,
                                219d,
                                324d,
                                -239d,
                                -106d,
                                -298d,
                                328d,
                                362d,
                                344d,
                                -54d,
                                133d,
                                50d,
                                112d,
                                -212d,
                                -179d,
                                22d,
                                -201d,
                                -62d,
                                -293d,
                                9d,
                                30d,
                                -50d,
                                126d,
                                -72d,
                                264d,
                                28d,
                                -1d,
                                -207d,
                                160d,
                                -168d,
                                3d,
                                -176d,
                                -19d,
                                -157d,
                                349d,
                                100d,
                                -201d,
                                108d,
                                -180d,
                                51d,
                                -73d,
                                366d,
                                74d,
                                -226d,
                                238d,
                                121d,
                                -193d,
                                -125d,
                                -109d,
                                316d,
                                -177d,
                                -307d,
                                31d,
                                -76d,
                                217d,
                                -310d,
                                227d,
                                -360d,
                                71d,
                                255d,
                                -325d,
                                -214d,
                                40d,
                                42d,
                                17d,
                                -241d,
                                -84d,
                                -188d,
                                302d,
                                64d,
                                94d,
                                -362d,
                                23d,
                                166d,
                                85d,
                                71d,
                                -74d,
                                -47d,
                                -119d,
                                98d,
                                40d,
                                158d,
                                -64d,
                                175d,
                                269d,
                                127d,
                                -143d,
                                213d,
                                -196d,
                                121d,
                                81d,
                                -238d,
                                288d,
                                321d,
                                276d,
                                133d,
                                22d,
                                -213d,
                                -157d,
                                -280d,
                                -35d,
                                73d,
                                -194d,
                                65d,
                                -180d,
                                63d,
                                -242d,
                                -117d,
                                148d,
                                157d,
                                -320d,
                                318d,
                                8d,
                                210d,
                                -21d,
                                81d,
                                205d,
                                -258d,
                                -40d,
                                -114d,
                                -253d,
                                -263d,
                                65d,
                                185d,
                                -24d,
                                324d,
                                -172d,
                                25d,
                                260d,
                                211d,
                                342d,
                                -31d,
                                -288d,
                                -159d,
                                -4d,
                                -2d,
                                -107d,
                                -316d,
                                -276d,
                                331d,
                                -114d,
                                -20d,
                                -320d,
                                51d,
                                -176d,
                                -148d,
                                -50d,
                                -201d,
                                -104d,
                                153d,
                                -273d,
                                -189d,
                                67d,
                                209d,
                                149d,
                                49d,
                                -136d,
                                -125d,
                                -169d,
                                -324d,
                                309d,
                                -51d,
                                288d,
                                253d,
                                175d,
                                -146d,
                                171d,
                                -140d,
                                58d,
                                -212d,
                                164d,
                                270d,
                                102d,
                                70d,
                                299d,
                                89d,
                                -280d,
                                252d,
                                -342d,
                                240d,
                                226d,
                                68d,
                                -30d,
                                -232d,
                                -358d,
                                -166d,
                                60d,
                                140d,
                                275d,
                                13d,
                                250d,
                                -328d,
                                -189d,
                                -22d,
                                7d,
                                -235d,
                                -322d,
                                178d,
                                167d,
                                -104d,
                                -61d,
                                282d,
                                -80d,
                                -277d,
                                108d,
                                271d,
                                -237d,
                                297d,
                                -135d,
                                -135d,
                                -323d,
                                342d,
                                -267d,
                                -235d,
                                173d,
                                249d,
                                -288d,
                                257d,
                                139d,
                                -191d,
                                -217d,
                                10d,
                                -117d,
                                -297d,
                                -196d,
                                -206d,
                                341d,
                                166d,
                                181d,
                                129d,
                                -207d,
                                55d,
                                86d))
                            .timezone("Africa/Abidjan")
                            .weekStart(WeekStart.MO)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(3d)
                            .endAt(OffsetDateTime.parse("2022-09-30T17:36:02.502Z"))
                            .excludedDates(List.of(
                                "2024-09-02T06:39:48.785Z",
                                "2024-08-17T17:26:55.270Z"))
                            .frequency(CalendarEventRecurrenceFrequency.DAILY)
                            .includedDates(List.of(
                                "2024-03-25T14:12:16.127Z",
                                "2026-01-14T06:11:06.505Z",
                                "2023-08-14T12:48:17.418Z"))
                            .interval(1d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.WE,
                                PropertyCalendarEventRecurrenceOnDays.SU,
                                PropertyCalendarEventRecurrenceOnDays.MO,
                                PropertyCalendarEventRecurrenceOnDays.FR))
                            .onMonthDays(List.of(
                                -15d))
                            .onMonths(List.of(
                                5d,
                                12d,
                                3d,
                                12d,
                                8d))
                            .onWeeks(List.of(
                                -47d,
                                44d))
                            .onYearDays(List.of(
                                -117d,
                                59d,
                                -6d,
                                187d,
                                45d,
                                70d,
                                15d,
                                255d,
                                44d,
                                -2d,
                                25d,
                                -175d,
                                -240d,
                                171d,
                                -294d,
                                19d,
                                38d,
                                -351d,
                                170d,
                                -10d,
                                -269d,
                                18d,
                                -65d,
                                -266d,
                                -31d,
                                328d,
                                -361d,
                                358d,
                                -256d,
                                -4d,
                                -312d,
                                82d,
                                -2d,
                                -75d,
                                -281d,
                                -304d,
                                53d,
                                -295d,
                                366d,
                                322d,
                                -191d,
                                26d,
                                97d,
                                53d,
                                75d,
                                -62d,
                                -109d,
                                66d,
                                177d,
                                -68d,
                                175d,
                                -280d,
                                70d,
                                -238d,
                                109d,
                                -304d,
                                326d,
                                -8d,
                                -71d,
                                -236d,
                                225d,
                                358d,
                                20d,
                                -5d,
                                -102d,
                                -134d,
                                -204d,
                                -116d,
                                -353d,
                                -273d,
                                106d,
                                284d,
                                -137d,
                                -324d,
                                301d,
                                -42d,
                                -229d,
                                271d,
                                -293d,
                                -343d,
                                211d,
                                47d,
                                -254d,
                                -154d,
                                -182d,
                                264d,
                                120d,
                                -11d,
                                -307d,
                                99d,
                                227d,
                                190d,
                                -17d,
                                -77d,
                                -255d,
                                -61d,
                                -249d,
                                -102d,
                                70d,
                                345d,
                                -187d,
                                -308d,
                                194d,
                                221d,
                                268d,
                                -169d,
                                -190d,
                                88d,
                                10d,
                                262d,
                                177d,
                                -314d,
                                -151d,
                                -295d))
                            .timezone("Asia/Choibalsan")
                            .weekStart(WeekStart.TU)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(8d)
                            .endAt(OffsetDateTime.parse("2026-07-27T12:25:07.275Z"))
                            .excludedDates(List.of(
                                "2023-06-18T20:01:17.738Z",
                                "2023-06-07T20:41:17.875Z"))
                            .frequency(CalendarEventRecurrenceFrequency.WEEKLY)
                            .includedDates(List.of(
                                "2024-04-02T15:12:15.935Z",
                                "2023-08-20T08:19:28.299Z",
                                "2024-09-27T11:50:50.079Z"))
                            .interval(8d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.SU,
                                PropertyCalendarEventRecurrenceOnDays.MO,
                                PropertyCalendarEventRecurrenceOnDays.TU,
                                PropertyCalendarEventRecurrenceOnDays.FR,
                                PropertyCalendarEventRecurrenceOnDays.MO,
                                PropertyCalendarEventRecurrenceOnDays.TH))
                            .onMonthDays(List.of(
                                -23d))
                            .onMonths(List.of(
                                11d,
                                8d,
                                9d,
                                5d,
                                -12d,
                                -7d,
                                -5d,
                                10d,
                                10d,
                                -9d,
                                -10d))
                            .onWeeks(List.of(
                                -49d,
                                46d,
                                35d,
                                -26d,
                                2d,
                                15d,
                                15d,
                                -26d,
                                24d,
                                -53d,
                                36d,
                                -43d,
                                51d,
                                -19d,
                                -7d,
                                -12d,
                                28d,
                                27d,
                                35d,
                                12d,
                                -28d,
                                -8d,
                                -4d,
                                -45d))
                            .onYearDays(List.of(
                                84d,
                                -251d,
                                71d,
                                181d,
                                -163d,
                                158d,
                                301d,
                                -299d,
                                -184d,
                                -331d,
                                -152d,
                                -129d,
                                -237d,
                                -303d,
                                -24d,
                                126d,
                                -103d,
                                146d,
                                -346d,
                                86d,
                                -296d,
                                -337d,
                                -185d,
                                16d,
                                -270d,
                                -126d,
                                -295d,
                                -231d,
                                356d,
                                -293d,
                                115d,
                                -265d,
                                -293d,
                                -34d,
                                357d,
                                313d,
                                -343d,
                                180d,
                                -22d,
                                -161d,
                                350d,
                                177d,
                                190d,
                                223d,
                                -152d,
                                -360d,
                                -225d,
                                -60d,
                                -35d,
                                353d,
                                117d,
                                -171d,
                                -315d,
                                -321d,
                                -202d,
                                345d,
                                -1d,
                                -148d,
                                -168d,
                                181d,
                                -17d,
                                282d,
                                234d,
                                31d,
                                47d,
                                -236d,
                                366d,
                                -251d,
                                -232d,
                                -308d,
                                76d,
                                -199d,
                                184d,
                                198d,
                                225d,
                                75d,
                                6d,
                                227d,
                                -148d,
                                259d,
                                -146d,
                                49d,
                                -254d,
                                341d,
                                93d,
                                138d,
                                -164d,
                                237d,
                                4d,
                                -287d,
                                161d))
                            .timezone("Asia/Krasnoyarsk")
                            .weekStart(WeekStart.WE)
                            .build()))
                    .registrantPassword("W7J6DhkM")
                    .requireAddress(false)
                    .requireJobTitle(false)
                    .startAt(OffsetDateTime.parse("2025-05-01T06:12:33.108Z"))
                    .status(CalendarWebinarStatus.TENTATIVE)
                    .subject("Harum culpa decipio ex cubo ancilla cresco.")
                    .timezone("Europe/Kaliningrad")
                    .updatedAt(OffsetDateTime.parse("2026-10-01T12:44:21.642Z"))
                    .webUrl("https://quiet-permafrost.name")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCalendarWebinarResponse res = sdk.calendar().createCalendarWebinar()
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
| `request`                                                                               | [CreateCalendarWebinarRequest](../../models/operations/CreateCalendarWebinarRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateCalendarWebinarResponse](../../models/operations/CreateCalendarWebinarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCalendarCalendar

Retrieves a single CalendarCalendar by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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
            System.out.println(res.calendarCalendar().get());
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

Retrieves a single CalendarEvent by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

## getCalendarLink

Retrieves a single CalendarLink by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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
            System.out.println(res.calendarLink().get());
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

Retrieves a single CalendarRecording by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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
            System.out.println(res.calendarRecording().get());
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

Retrieves a single CalendarWebinar by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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
            System.out.println(res.calendarWebinar().get());
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

Returns a list of CalendarBusies. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
            System.out.println(res.calendarBusies().get());
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

Returns a list of CalendarCalendars. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
            System.out.println(res.calendarCalendars().get());
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

Returns a list of CalendarEvents. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

## listCalendarLinks

Returns a list of CalendarLinks. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
            System.out.println(res.calendarLinks().get());
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

Returns a list of CalendarRecordings. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
            System.out.println(res.calendarRecordings().get());
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

Returns a list of CalendarWebinars. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
            System.out.println(res.calendarWebinars().get());
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

Updates the CalendarCalendar identified by `id`. Provide the unified CalendarCalendar fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarCalendar" method="patch" path="/calendar/{connection_id}/calendar/{id}" example="calendar_calendar" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .createdAt(OffsetDateTime.parse("2020-01-09T23:11:34.147Z"))
                    .description("Acer supra vallum suasoria thesaurus.")
                    .id("dfdd0e45-e5d4-4af5-a512-7c2437ca822d")
                    .isPrimary(false)
                    .metadata(List.of())
                    .name("Interviews")
                    .timezone("Asia/Kolkata")
                    .updatedAt(OffsetDateTime.parse("2023-03-28T15:16:42.047Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCalendarCalendarResponse res = sdk.calendar().patchCalendarCalendar()
                .request(req)
                .call();

        if (res.calendarCalendar().isPresent()) {
            System.out.println(res.calendarCalendar().get());
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

Updates the CalendarEvent identified by `id`. Provide the unified CalendarEvent fields to change in the request body.

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
                    .endAt("2020-05-24T09:48:11.265Z")
                    .hasConference(false)
                    .id("dc738ad5-cac0-45d3-9e5b-4a941bbb2a3c")
                    .isAllDay(false)
                    .isFree(false)
                    .isPrivate(false)
                    .location("621 Boehm Prairie")
                    .metadata(List.of())
                    .notes("Aegre traho.")
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(4d)
                            .endAt(OffsetDateTime.parse("2025-03-25T11:12:10.101Z"))
                            .excludedDates(List.of(
                                "2024-02-03T10:20:10.634Z"))
                            .frequency(CalendarEventRecurrenceFrequency.YEARLY)
                            .includedDates(List.of(
                                "2023-07-07T15:02:52.449Z",
                                "2025-01-24T16:37:31.849Z",
                                "2024-04-02T15:49:26.817Z"))
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
                    .startAt("2020-05-24T00:34:20.918Z")
                    .status(CalendarEventStatus.CONFIRMED)
                    .subject("Sunt spargo tepidus bestia vigor credo coadunatio appello.")
                    .timezone("Asia/Bangkok")
                    .updatedAt("2020-06-30T08:31:48.087Z")
                    .webUrl("https://another-pinstripe.com")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCalendarEventResponse res = sdk.calendar().patchCalendarEvent()
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

## patchCalendarLink

Updates the CalendarLink identified by `id`. Provide the unified CalendarLink fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarLink" method="patch" path="/calendar/{connection_id}/link/{id}" example="calendar_link" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
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
                    .url("https://annual-apricot.info/")
                    .createdAt("2023-03-07T13:34:11.959Z")
                    .description("Vitium clibanus laboriosam uxor denuncio.")
                    .duration(74d)
                    .id("07fcd259-cd0f-457b-a9a7-ae4d40cc8c89")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Sopor sopor ancilla animus anser dignissimos vito confero utilis.")
                    .priceAmount(44d)
                    .priceCurrency("USD")
                    .updatedAt("2024-03-15T20:05:21.484Z")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCalendarLinkResponse res = sdk.calendar().patchCalendarLink()
                .request(req)
                .call();

        if (res.calendarLink().isPresent()) {
            System.out.println(res.calendarLink().get());
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

Updates the CalendarWebinar identified by `id`. Provide the unified CalendarWebinar fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarWebinar" method="patch" path="/calendar/{connection_id}/webinar/{id}" example="calendar_webinar" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCalendarWebinarRequest;
import to.unified.unified_java_sdk.models.operations.PatchCalendarWebinarResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCalendarWebinarRequest req = PatchCalendarWebinarRequest.builder()
                .calendarWebinar(CalendarWebinar.builder()
                    .conference(List.of())
                    .createdAt(OffsetDateTime.parse("2022-07-06T11:45:14.631Z"))
                    .endAt(OffsetDateTime.parse("2025-10-29T12:38:34.725Z"))
                    .hasPolls(false)
                    .hasRecording(false)
                    .id("d665caf6-d72d-4efe-943a-6ab653e8d4b2")
                    .isAutoApprove(false)
                    .isEnabled(true)
                    .isWebcast(false)
                    .joinUrl("https://nutritious-crocodile.com")
                    .metadata(List.of())
                    .notes("Curriculum ducimus assentator aspernatur ait.")
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(10d)
                            .endAt(OffsetDateTime.parse("2023-08-31T21:31:01.167Z"))
                            .excludedDates(List.of(
                                "2025-02-13T15:46:31.440Z"))
                            .frequency(CalendarEventRecurrenceFrequency.MONTHLY)
                            .includedDates(List.of(
                                "2024-04-28T17:19:58.785Z"))
                            .interval(8d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.SU,
                                PropertyCalendarEventRecurrenceOnDays.FR,
                                PropertyCalendarEventRecurrenceOnDays.SA,
                                PropertyCalendarEventRecurrenceOnDays.WE,
                                PropertyCalendarEventRecurrenceOnDays.MO))
                            .onMonthDays(List.of(
                                -10d))
                            .onMonths(List.of(
                                -9d))
                            .onWeeks(List.of(
                                10d,
                                30d,
                                -38d,
                                30d,
                                -22d,
                                37d,
                                -12d,
                                27d,
                                2d,
                                15d,
                                26d,
                                18d,
                                -43d,
                                -33d,
                                -27d,
                                38d,
                                28d,
                                47d,
                                -8d,
                                24d,
                                35d,
                                -2d,
                                7d,
                                49d,
                                38d,
                                -41d,
                                46d,
                                -11d,
                                -45d,
                                0d,
                                48d,
                                34d))
                            .onYearDays(List.of(
                                345d,
                                -207d,
                                230d,
                                -10d,
                                364d,
                                -256d,
                                -218d,
                                -295d,
                                290d,
                                -250d,
                                -315d,
                                60d,
                                205d,
                                -247d,
                                -318d,
                                -211d,
                                -13d,
                                256d,
                                -200d,
                                -313d,
                                336d,
                                -332d,
                                -90d,
                                287d,
                                -273d,
                                156d,
                                241d,
                                -138d,
                                -363d,
                                -37d,
                                -171d,
                                -62d,
                                -57d,
                                280d,
                                -322d,
                                -79d,
                                -364d,
                                -201d,
                                84d,
                                341d,
                                334d,
                                -75d,
                                332d,
                                207d,
                                337d,
                                -244d,
                                131d,
                                -191d,
                                164d,
                                -235d,
                                285d,
                                -309d,
                                -158d,
                                306d,
                                180d,
                                -130d,
                                -162d,
                                -155d,
                                3d,
                                198d,
                                26d,
                                -366d,
                                -191d,
                                127d,
                                -331d,
                                -11d,
                                -239d,
                                -189d,
                                243d,
                                118d,
                                346d,
                                -174d,
                                -146d,
                                -161d,
                                -330d,
                                327d,
                                192d,
                                310d,
                                316d,
                                313d,
                                -242d,
                                -51d,
                                -264d,
                                -180d,
                                -88d,
                                305d,
                                270d,
                                358d,
                                -173d,
                                -298d,
                                153d,
                                -89d,
                                155d,
                                -45d,
                                248d,
                                -46d,
                                -146d,
                                300d,
                                364d,
                                -335d,
                                356d,
                                -18d,
                                219d,
                                324d,
                                -239d,
                                -106d,
                                -298d,
                                328d,
                                362d,
                                344d,
                                -54d,
                                133d,
                                50d,
                                112d,
                                -212d,
                                -179d,
                                22d,
                                -201d,
                                -62d,
                                -293d,
                                9d,
                                30d,
                                -50d,
                                126d,
                                -72d,
                                264d,
                                28d,
                                -1d,
                                -207d,
                                160d,
                                -168d,
                                3d,
                                -176d,
                                -19d,
                                -157d,
                                349d,
                                100d,
                                -201d,
                                108d,
                                -180d,
                                51d,
                                -73d,
                                366d,
                                74d,
                                -226d,
                                238d,
                                121d,
                                -193d,
                                -125d,
                                -109d,
                                316d,
                                -177d,
                                -307d,
                                31d,
                                -76d,
                                217d,
                                -310d,
                                227d,
                                -360d,
                                71d,
                                255d,
                                -325d,
                                -214d,
                                40d,
                                42d,
                                17d,
                                -241d,
                                -84d,
                                -188d,
                                302d,
                                64d,
                                94d,
                                -362d,
                                23d,
                                166d,
                                85d,
                                71d,
                                -74d,
                                -47d,
                                -119d,
                                98d,
                                40d,
                                158d,
                                -64d,
                                175d,
                                269d,
                                127d,
                                -143d,
                                213d,
                                -196d,
                                121d,
                                81d,
                                -238d,
                                288d,
                                321d,
                                276d,
                                133d,
                                22d,
                                -213d,
                                -157d,
                                -280d,
                                -35d,
                                73d,
                                -194d,
                                65d,
                                -180d,
                                63d,
                                -242d,
                                -117d,
                                148d,
                                157d,
                                -320d,
                                318d,
                                8d,
                                210d,
                                -21d,
                                81d,
                                205d,
                                -258d,
                                -40d,
                                -114d,
                                -253d,
                                -263d,
                                65d,
                                185d,
                                -24d,
                                324d,
                                -172d,
                                25d,
                                260d,
                                211d,
                                342d,
                                -31d,
                                -288d,
                                -159d,
                                -4d,
                                -2d,
                                -107d,
                                -316d,
                                -276d,
                                331d,
                                -114d,
                                -20d,
                                -320d,
                                51d,
                                -176d,
                                -148d,
                                -50d,
                                -201d,
                                -104d,
                                153d,
                                -273d,
                                -189d,
                                67d,
                                209d,
                                149d,
                                49d,
                                -136d,
                                -125d,
                                -169d,
                                -324d,
                                309d,
                                -51d,
                                288d,
                                253d,
                                175d,
                                -146d,
                                171d,
                                -140d,
                                58d,
                                -212d,
                                164d,
                                270d,
                                102d,
                                70d,
                                299d,
                                89d,
                                -280d,
                                252d,
                                -342d,
                                240d,
                                226d,
                                68d,
                                -30d,
                                -232d,
                                -358d,
                                -166d,
                                60d,
                                140d,
                                275d,
                                13d,
                                250d,
                                -328d,
                                -189d,
                                -22d,
                                7d,
                                -235d,
                                -322d,
                                178d,
                                167d,
                                -104d,
                                -61d,
                                282d,
                                -80d,
                                -277d,
                                108d,
                                271d,
                                -237d,
                                297d,
                                -135d,
                                -135d,
                                -323d,
                                342d,
                                -267d,
                                -235d,
                                173d,
                                249d,
                                -288d,
                                257d,
                                139d,
                                -191d,
                                -217d,
                                10d,
                                -117d,
                                -297d,
                                -196d,
                                -206d,
                                341d,
                                166d,
                                181d,
                                129d,
                                -207d,
                                55d,
                                86d))
                            .timezone("Africa/Abidjan")
                            .weekStart(WeekStart.MO)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(3d)
                            .endAt(OffsetDateTime.parse("2022-09-30T17:36:02.505Z"))
                            .excludedDates(List.of(
                                "2024-09-02T06:39:48.808Z",
                                "2024-08-17T17:26:55.291Z"))
                            .frequency(CalendarEventRecurrenceFrequency.DAILY)
                            .includedDates(List.of(
                                "2024-03-25T14:12:16.145Z",
                                "2026-01-14T06:11:06.541Z",
                                "2023-08-14T12:48:17.429Z"))
                            .interval(1d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.WE,
                                PropertyCalendarEventRecurrenceOnDays.SU,
                                PropertyCalendarEventRecurrenceOnDays.MO,
                                PropertyCalendarEventRecurrenceOnDays.FR))
                            .onMonthDays(List.of(
                                -15d))
                            .onMonths(List.of(
                                5d,
                                12d,
                                3d,
                                12d,
                                8d))
                            .onWeeks(List.of(
                                -47d,
                                44d))
                            .onYearDays(List.of(
                                -117d,
                                59d,
                                -6d,
                                187d,
                                45d,
                                70d,
                                15d,
                                255d,
                                44d,
                                -2d,
                                25d,
                                -175d,
                                -240d,
                                171d,
                                -294d,
                                19d,
                                38d,
                                -351d,
                                170d,
                                -10d,
                                -269d,
                                18d,
                                -65d,
                                -266d,
                                -31d,
                                328d,
                                -361d,
                                358d,
                                -256d,
                                -4d,
                                -312d,
                                82d,
                                -2d,
                                -75d,
                                -281d,
                                -304d,
                                53d,
                                -295d,
                                366d,
                                322d,
                                -191d,
                                26d,
                                97d,
                                53d,
                                75d,
                                -62d,
                                -109d,
                                66d,
                                177d,
                                -68d,
                                175d,
                                -280d,
                                70d,
                                -238d,
                                109d,
                                -304d,
                                326d,
                                -8d,
                                -71d,
                                -236d,
                                225d,
                                358d,
                                20d,
                                -5d,
                                -102d,
                                -134d,
                                -204d,
                                -116d,
                                -353d,
                                -273d,
                                106d,
                                284d,
                                -137d,
                                -324d,
                                301d,
                                -42d,
                                -229d,
                                271d,
                                -293d,
                                -343d,
                                211d,
                                47d,
                                -254d,
                                -154d,
                                -182d,
                                264d,
                                120d,
                                -11d,
                                -307d,
                                99d,
                                227d,
                                190d,
                                -17d,
                                -77d,
                                -255d,
                                -61d,
                                -249d,
                                -102d,
                                70d,
                                345d,
                                -187d,
                                -308d,
                                194d,
                                221d,
                                268d,
                                -169d,
                                -190d,
                                88d,
                                10d,
                                262d,
                                177d,
                                -314d,
                                -151d,
                                -295d))
                            .timezone("Asia/Choibalsan")
                            .weekStart(WeekStart.TU)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(8d)
                            .endAt(OffsetDateTime.parse("2026-07-27T12:25:07.317Z"))
                            .excludedDates(List.of(
                                "2023-06-18T20:01:17.748Z",
                                "2023-06-07T20:41:17.885Z"))
                            .frequency(CalendarEventRecurrenceFrequency.WEEKLY)
                            .includedDates(List.of(
                                "2024-04-02T15:12:15.954Z",
                                "2023-08-20T08:19:28.311Z",
                                "2024-09-27T11:50:50.103Z"))
                            .interval(8d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.SU,
                                PropertyCalendarEventRecurrenceOnDays.MO,
                                PropertyCalendarEventRecurrenceOnDays.TU,
                                PropertyCalendarEventRecurrenceOnDays.FR,
                                PropertyCalendarEventRecurrenceOnDays.MO,
                                PropertyCalendarEventRecurrenceOnDays.TH))
                            .onMonthDays(List.of(
                                -23d))
                            .onMonths(List.of(
                                11d,
                                8d,
                                9d,
                                5d,
                                -12d,
                                -7d,
                                -5d,
                                10d,
                                10d,
                                -9d,
                                -10d))
                            .onWeeks(List.of(
                                -49d,
                                46d,
                                35d,
                                -26d,
                                2d,
                                15d,
                                15d,
                                -26d,
                                24d,
                                -53d,
                                36d,
                                -43d,
                                51d,
                                -19d,
                                -7d,
                                -12d,
                                28d,
                                27d,
                                35d,
                                12d,
                                -28d,
                                -8d,
                                -4d,
                                -45d))
                            .onYearDays(List.of(
                                84d,
                                -251d,
                                71d,
                                181d,
                                -163d,
                                158d,
                                301d,
                                -299d,
                                -184d,
                                -331d,
                                -152d,
                                -129d,
                                -237d,
                                -303d,
                                -24d,
                                126d,
                                -103d,
                                146d,
                                -346d,
                                86d,
                                -296d,
                                -337d,
                                -185d,
                                16d,
                                -270d,
                                -126d,
                                -295d,
                                -231d,
                                356d,
                                -293d,
                                115d,
                                -265d,
                                -293d,
                                -34d,
                                357d,
                                313d,
                                -343d,
                                180d,
                                -22d,
                                -161d,
                                350d,
                                177d,
                                190d,
                                223d,
                                -152d,
                                -360d,
                                -225d,
                                -60d,
                                -35d,
                                353d,
                                117d,
                                -171d,
                                -315d,
                                -321d,
                                -202d,
                                345d,
                                -1d,
                                -148d,
                                -168d,
                                181d,
                                -17d,
                                282d,
                                234d,
                                31d,
                                47d,
                                -236d,
                                366d,
                                -251d,
                                -232d,
                                -308d,
                                76d,
                                -199d,
                                184d,
                                198d,
                                225d,
                                75d,
                                6d,
                                227d,
                                -148d,
                                259d,
                                -146d,
                                49d,
                                -254d,
                                341d,
                                93d,
                                138d,
                                -164d,
                                237d,
                                4d,
                                -287d,
                                161d))
                            .timezone("Asia/Krasnoyarsk")
                            .weekStart(WeekStart.WE)
                            .build()))
                    .registrantPassword("W7J6DhkM")
                    .requireAddress(false)
                    .requireJobTitle(false)
                    .startAt(OffsetDateTime.parse("2025-05-01T06:12:33.137Z"))
                    .status(CalendarWebinarStatus.TENTATIVE)
                    .subject("Harum culpa decipio ex cubo ancilla cresco.")
                    .timezone("Europe/Kaliningrad")
                    .updatedAt(OffsetDateTime.parse("2026-10-01T12:44:21.685Z"))
                    .webUrl("https://quiet-permafrost.name")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCalendarWebinarResponse res = sdk.calendar().patchCalendarWebinar()
                .request(req)
                .call();

        if (res.calendarWebinar().isPresent()) {
            System.out.println(res.calendarWebinar().get());
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

Deletes the CalendarCalendar identified by `id`.

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

Deletes the CalendarEvent identified by `id`.

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

Deletes the CalendarLink identified by `id`.

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

Deletes the CalendarWebinar identified by `id`.

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

Updates the CalendarCalendar identified by `id`. Provide the unified CalendarCalendar fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCalendarCalendar" method="put" path="/calendar/{connection_id}/calendar/{id}" example="calendar_calendar" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .createdAt(OffsetDateTime.parse("2020-01-09T23:11:34.147Z"))
                    .description("Acer supra vallum suasoria thesaurus.")
                    .id("dfdd0e45-e5d4-4af5-a512-7c2437ca822d")
                    .isPrimary(false)
                    .metadata(List.of())
                    .name("Interviews")
                    .timezone("Asia/Kolkata")
                    .updatedAt(OffsetDateTime.parse("2023-03-28T15:16:42.047Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCalendarCalendarResponse res = sdk.calendar().updateCalendarCalendar()
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
| `request`                                                                                 | [UpdateCalendarCalendarRequest](../../models/operations/UpdateCalendarCalendarRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateCalendarCalendarResponse](../../models/operations/UpdateCalendarCalendarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCalendarEvent

Updates the CalendarEvent identified by `id`. Provide the unified CalendarEvent fields to change in the request body.

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
                    .endAt("2020-05-24T09:48:11.265Z")
                    .hasConference(false)
                    .id("dc738ad5-cac0-45d3-9e5b-4a941bbb2a3c")
                    .isAllDay(false)
                    .isFree(false)
                    .isPrivate(false)
                    .location("621 Boehm Prairie")
                    .metadata(List.of())
                    .notes("Aegre traho.")
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(4d)
                            .endAt(OffsetDateTime.parse("2025-03-25T11:12:10.101Z"))
                            .excludedDates(List.of(
                                "2024-02-03T10:20:10.634Z"))
                            .frequency(CalendarEventRecurrenceFrequency.YEARLY)
                            .includedDates(List.of(
                                "2023-07-07T15:02:52.449Z",
                                "2025-01-24T16:37:31.849Z",
                                "2024-04-02T15:49:26.817Z"))
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
                    .startAt("2020-05-24T00:34:20.918Z")
                    .status(CalendarEventStatus.CONFIRMED)
                    .subject("Sunt spargo tepidus bestia vigor credo coadunatio appello.")
                    .timezone("Asia/Bangkok")
                    .updatedAt("2020-06-30T08:31:48.087Z")
                    .webUrl("https://another-pinstripe.com")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCalendarEventResponse res = sdk.calendar().updateCalendarEvent()
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

## updateCalendarLink

Updates the CalendarLink identified by `id`. Provide the unified CalendarLink fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCalendarLink" method="put" path="/calendar/{connection_id}/link/{id}" example="calendar_link" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
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
                    .url("https://annual-apricot.info/")
                    .createdAt("2023-03-07T13:34:11.959Z")
                    .description("Vitium clibanus laboriosam uxor denuncio.")
                    .duration(74d)
                    .id("07fcd259-cd0f-457b-a9a7-ae4d40cc8c89")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Sopor sopor ancilla animus anser dignissimos vito confero utilis.")
                    .priceAmount(44d)
                    .priceCurrency("USD")
                    .updatedAt("2024-03-15T20:05:21.484Z")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCalendarLinkResponse res = sdk.calendar().updateCalendarLink()
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
| `request`                                                                         | [UpdateCalendarLinkRequest](../../models/operations/UpdateCalendarLinkRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateCalendarLinkResponse](../../models/operations/UpdateCalendarLinkResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCalendarWebinar

Updates the CalendarWebinar identified by `id`. Provide the unified CalendarWebinar fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCalendarWebinar" method="put" path="/calendar/{connection_id}/webinar/{id}" example="calendar_webinar" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarWebinarRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarWebinarResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCalendarWebinarRequest req = UpdateCalendarWebinarRequest.builder()
                .calendarWebinar(CalendarWebinar.builder()
                    .conference(List.of())
                    .createdAt(OffsetDateTime.parse("2022-07-06T11:45:14.631Z"))
                    .endAt(OffsetDateTime.parse("2025-10-29T12:38:34.725Z"))
                    .hasPolls(false)
                    .hasRecording(false)
                    .id("d665caf6-d72d-4efe-943a-6ab653e8d4b2")
                    .isAutoApprove(false)
                    .isEnabled(true)
                    .isWebcast(false)
                    .joinUrl("https://nutritious-crocodile.com")
                    .metadata(List.of())
                    .notes("Curriculum ducimus assentator aspernatur ait.")
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(10d)
                            .endAt(OffsetDateTime.parse("2023-08-31T21:31:01.167Z"))
                            .excludedDates(List.of(
                                "2025-02-13T15:46:31.440Z"))
                            .frequency(CalendarEventRecurrenceFrequency.MONTHLY)
                            .includedDates(List.of(
                                "2024-04-28T17:19:58.785Z"))
                            .interval(8d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.SU,
                                PropertyCalendarEventRecurrenceOnDays.FR,
                                PropertyCalendarEventRecurrenceOnDays.SA,
                                PropertyCalendarEventRecurrenceOnDays.WE,
                                PropertyCalendarEventRecurrenceOnDays.MO))
                            .onMonthDays(List.of(
                                -10d))
                            .onMonths(List.of(
                                -9d))
                            .onWeeks(List.of(
                                10d,
                                30d,
                                -38d,
                                30d,
                                -22d,
                                37d,
                                -12d,
                                27d,
                                2d,
                                15d,
                                26d,
                                18d,
                                -43d,
                                -33d,
                                -27d,
                                38d,
                                28d,
                                47d,
                                -8d,
                                24d,
                                35d,
                                -2d,
                                7d,
                                49d,
                                38d,
                                -41d,
                                46d,
                                -11d,
                                -45d,
                                0d,
                                48d,
                                34d))
                            .onYearDays(List.of(
                                345d,
                                -207d,
                                230d,
                                -10d,
                                364d,
                                -256d,
                                -218d,
                                -295d,
                                290d,
                                -250d,
                                -315d,
                                60d,
                                205d,
                                -247d,
                                -318d,
                                -211d,
                                -13d,
                                256d,
                                -200d,
                                -313d,
                                336d,
                                -332d,
                                -90d,
                                287d,
                                -273d,
                                156d,
                                241d,
                                -138d,
                                -363d,
                                -37d,
                                -171d,
                                -62d,
                                -57d,
                                280d,
                                -322d,
                                -79d,
                                -364d,
                                -201d,
                                84d,
                                341d,
                                334d,
                                -75d,
                                332d,
                                207d,
                                337d,
                                -244d,
                                131d,
                                -191d,
                                164d,
                                -235d,
                                285d,
                                -309d,
                                -158d,
                                306d,
                                180d,
                                -130d,
                                -162d,
                                -155d,
                                3d,
                                198d,
                                26d,
                                -366d,
                                -191d,
                                127d,
                                -331d,
                                -11d,
                                -239d,
                                -189d,
                                243d,
                                118d,
                                346d,
                                -174d,
                                -146d,
                                -161d,
                                -330d,
                                327d,
                                192d,
                                310d,
                                316d,
                                313d,
                                -242d,
                                -51d,
                                -264d,
                                -180d,
                                -88d,
                                305d,
                                270d,
                                358d,
                                -173d,
                                -298d,
                                153d,
                                -89d,
                                155d,
                                -45d,
                                248d,
                                -46d,
                                -146d,
                                300d,
                                364d,
                                -335d,
                                356d,
                                -18d,
                                219d,
                                324d,
                                -239d,
                                -106d,
                                -298d,
                                328d,
                                362d,
                                344d,
                                -54d,
                                133d,
                                50d,
                                112d,
                                -212d,
                                -179d,
                                22d,
                                -201d,
                                -62d,
                                -293d,
                                9d,
                                30d,
                                -50d,
                                126d,
                                -72d,
                                264d,
                                28d,
                                -1d,
                                -207d,
                                160d,
                                -168d,
                                3d,
                                -176d,
                                -19d,
                                -157d,
                                349d,
                                100d,
                                -201d,
                                108d,
                                -180d,
                                51d,
                                -73d,
                                366d,
                                74d,
                                -226d,
                                238d,
                                121d,
                                -193d,
                                -125d,
                                -109d,
                                316d,
                                -177d,
                                -307d,
                                31d,
                                -76d,
                                217d,
                                -310d,
                                227d,
                                -360d,
                                71d,
                                255d,
                                -325d,
                                -214d,
                                40d,
                                42d,
                                17d,
                                -241d,
                                -84d,
                                -188d,
                                302d,
                                64d,
                                94d,
                                -362d,
                                23d,
                                166d,
                                85d,
                                71d,
                                -74d,
                                -47d,
                                -119d,
                                98d,
                                40d,
                                158d,
                                -64d,
                                175d,
                                269d,
                                127d,
                                -143d,
                                213d,
                                -196d,
                                121d,
                                81d,
                                -238d,
                                288d,
                                321d,
                                276d,
                                133d,
                                22d,
                                -213d,
                                -157d,
                                -280d,
                                -35d,
                                73d,
                                -194d,
                                65d,
                                -180d,
                                63d,
                                -242d,
                                -117d,
                                148d,
                                157d,
                                -320d,
                                318d,
                                8d,
                                210d,
                                -21d,
                                81d,
                                205d,
                                -258d,
                                -40d,
                                -114d,
                                -253d,
                                -263d,
                                65d,
                                185d,
                                -24d,
                                324d,
                                -172d,
                                25d,
                                260d,
                                211d,
                                342d,
                                -31d,
                                -288d,
                                -159d,
                                -4d,
                                -2d,
                                -107d,
                                -316d,
                                -276d,
                                331d,
                                -114d,
                                -20d,
                                -320d,
                                51d,
                                -176d,
                                -148d,
                                -50d,
                                -201d,
                                -104d,
                                153d,
                                -273d,
                                -189d,
                                67d,
                                209d,
                                149d,
                                49d,
                                -136d,
                                -125d,
                                -169d,
                                -324d,
                                309d,
                                -51d,
                                288d,
                                253d,
                                175d,
                                -146d,
                                171d,
                                -140d,
                                58d,
                                -212d,
                                164d,
                                270d,
                                102d,
                                70d,
                                299d,
                                89d,
                                -280d,
                                252d,
                                -342d,
                                240d,
                                226d,
                                68d,
                                -30d,
                                -232d,
                                -358d,
                                -166d,
                                60d,
                                140d,
                                275d,
                                13d,
                                250d,
                                -328d,
                                -189d,
                                -22d,
                                7d,
                                -235d,
                                -322d,
                                178d,
                                167d,
                                -104d,
                                -61d,
                                282d,
                                -80d,
                                -277d,
                                108d,
                                271d,
                                -237d,
                                297d,
                                -135d,
                                -135d,
                                -323d,
                                342d,
                                -267d,
                                -235d,
                                173d,
                                249d,
                                -288d,
                                257d,
                                139d,
                                -191d,
                                -217d,
                                10d,
                                -117d,
                                -297d,
                                -196d,
                                -206d,
                                341d,
                                166d,
                                181d,
                                129d,
                                -207d,
                                55d,
                                86d))
                            .timezone("Africa/Abidjan")
                            .weekStart(WeekStart.MO)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(3d)
                            .endAt(OffsetDateTime.parse("2022-09-30T17:36:02.505Z"))
                            .excludedDates(List.of(
                                "2024-09-02T06:39:48.808Z",
                                "2024-08-17T17:26:55.291Z"))
                            .frequency(CalendarEventRecurrenceFrequency.DAILY)
                            .includedDates(List.of(
                                "2024-03-25T14:12:16.145Z",
                                "2026-01-14T06:11:06.541Z",
                                "2023-08-14T12:48:17.429Z"))
                            .interval(1d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.WE,
                                PropertyCalendarEventRecurrenceOnDays.SU,
                                PropertyCalendarEventRecurrenceOnDays.MO,
                                PropertyCalendarEventRecurrenceOnDays.FR))
                            .onMonthDays(List.of(
                                -15d))
                            .onMonths(List.of(
                                5d,
                                12d,
                                3d,
                                12d,
                                8d))
                            .onWeeks(List.of(
                                -47d,
                                44d))
                            .onYearDays(List.of(
                                -117d,
                                59d,
                                -6d,
                                187d,
                                45d,
                                70d,
                                15d,
                                255d,
                                44d,
                                -2d,
                                25d,
                                -175d,
                                -240d,
                                171d,
                                -294d,
                                19d,
                                38d,
                                -351d,
                                170d,
                                -10d,
                                -269d,
                                18d,
                                -65d,
                                -266d,
                                -31d,
                                328d,
                                -361d,
                                358d,
                                -256d,
                                -4d,
                                -312d,
                                82d,
                                -2d,
                                -75d,
                                -281d,
                                -304d,
                                53d,
                                -295d,
                                366d,
                                322d,
                                -191d,
                                26d,
                                97d,
                                53d,
                                75d,
                                -62d,
                                -109d,
                                66d,
                                177d,
                                -68d,
                                175d,
                                -280d,
                                70d,
                                -238d,
                                109d,
                                -304d,
                                326d,
                                -8d,
                                -71d,
                                -236d,
                                225d,
                                358d,
                                20d,
                                -5d,
                                -102d,
                                -134d,
                                -204d,
                                -116d,
                                -353d,
                                -273d,
                                106d,
                                284d,
                                -137d,
                                -324d,
                                301d,
                                -42d,
                                -229d,
                                271d,
                                -293d,
                                -343d,
                                211d,
                                47d,
                                -254d,
                                -154d,
                                -182d,
                                264d,
                                120d,
                                -11d,
                                -307d,
                                99d,
                                227d,
                                190d,
                                -17d,
                                -77d,
                                -255d,
                                -61d,
                                -249d,
                                -102d,
                                70d,
                                345d,
                                -187d,
                                -308d,
                                194d,
                                221d,
                                268d,
                                -169d,
                                -190d,
                                88d,
                                10d,
                                262d,
                                177d,
                                -314d,
                                -151d,
                                -295d))
                            .timezone("Asia/Choibalsan")
                            .weekStart(WeekStart.TU)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(8d)
                            .endAt(OffsetDateTime.parse("2026-07-27T12:25:07.317Z"))
                            .excludedDates(List.of(
                                "2023-06-18T20:01:17.748Z",
                                "2023-06-07T20:41:17.885Z"))
                            .frequency(CalendarEventRecurrenceFrequency.WEEKLY)
                            .includedDates(List.of(
                                "2024-04-02T15:12:15.954Z",
                                "2023-08-20T08:19:28.311Z",
                                "2024-09-27T11:50:50.103Z"))
                            .interval(8d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.SU,
                                PropertyCalendarEventRecurrenceOnDays.MO,
                                PropertyCalendarEventRecurrenceOnDays.TU,
                                PropertyCalendarEventRecurrenceOnDays.FR,
                                PropertyCalendarEventRecurrenceOnDays.MO,
                                PropertyCalendarEventRecurrenceOnDays.TH))
                            .onMonthDays(List.of(
                                -23d))
                            .onMonths(List.of(
                                11d,
                                8d,
                                9d,
                                5d,
                                -12d,
                                -7d,
                                -5d,
                                10d,
                                10d,
                                -9d,
                                -10d))
                            .onWeeks(List.of(
                                -49d,
                                46d,
                                35d,
                                -26d,
                                2d,
                                15d,
                                15d,
                                -26d,
                                24d,
                                -53d,
                                36d,
                                -43d,
                                51d,
                                -19d,
                                -7d,
                                -12d,
                                28d,
                                27d,
                                35d,
                                12d,
                                -28d,
                                -8d,
                                -4d,
                                -45d))
                            .onYearDays(List.of(
                                84d,
                                -251d,
                                71d,
                                181d,
                                -163d,
                                158d,
                                301d,
                                -299d,
                                -184d,
                                -331d,
                                -152d,
                                -129d,
                                -237d,
                                -303d,
                                -24d,
                                126d,
                                -103d,
                                146d,
                                -346d,
                                86d,
                                -296d,
                                -337d,
                                -185d,
                                16d,
                                -270d,
                                -126d,
                                -295d,
                                -231d,
                                356d,
                                -293d,
                                115d,
                                -265d,
                                -293d,
                                -34d,
                                357d,
                                313d,
                                -343d,
                                180d,
                                -22d,
                                -161d,
                                350d,
                                177d,
                                190d,
                                223d,
                                -152d,
                                -360d,
                                -225d,
                                -60d,
                                -35d,
                                353d,
                                117d,
                                -171d,
                                -315d,
                                -321d,
                                -202d,
                                345d,
                                -1d,
                                -148d,
                                -168d,
                                181d,
                                -17d,
                                282d,
                                234d,
                                31d,
                                47d,
                                -236d,
                                366d,
                                -251d,
                                -232d,
                                -308d,
                                76d,
                                -199d,
                                184d,
                                198d,
                                225d,
                                75d,
                                6d,
                                227d,
                                -148d,
                                259d,
                                -146d,
                                49d,
                                -254d,
                                341d,
                                93d,
                                138d,
                                -164d,
                                237d,
                                4d,
                                -287d,
                                161d))
                            .timezone("Asia/Krasnoyarsk")
                            .weekStart(WeekStart.WE)
                            .build()))
                    .registrantPassword("W7J6DhkM")
                    .requireAddress(false)
                    .requireJobTitle(false)
                    .startAt(OffsetDateTime.parse("2025-05-01T06:12:33.137Z"))
                    .status(CalendarWebinarStatus.TENTATIVE)
                    .subject("Harum culpa decipio ex cubo ancilla cresco.")
                    .timezone("Europe/Kaliningrad")
                    .updatedAt(OffsetDateTime.parse("2026-10-01T12:44:21.685Z"))
                    .webUrl("https://quiet-permafrost.name")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCalendarWebinarResponse res = sdk.calendar().updateCalendarWebinar()
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
| `request`                                                                               | [UpdateCalendarWebinarRequest](../../models/operations/UpdateCalendarWebinarRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateCalendarWebinarResponse](../../models/operations/UpdateCalendarWebinarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |