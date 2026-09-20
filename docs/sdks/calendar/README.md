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

<!-- UsageSnippet language="java" operationID="createCalendarCalendar" method="post" path="/calendar/{connection_id}/calendar" example="calendar_calendar" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .description("Socius catena auxilium.")
                    .id("0eff5073-7bc6-45bd-a643-95ef3a6ed283")
                    .isPrimary(false)
                    .name("Acer supra vallum suasoria thesaurus omnis condico cognomen accendo vehemens.")
                    .timezone("America/Dawson_Creek")
                    .updatedAt(OffsetDateTime.parse("2023-03-13T11:25:56.522Z"))
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
                    .endAt("2020-05-20T20:11:43.816Z")
                    .id("4b3f339e-d7b2-4ac9-ad3c-24429c2593f1")
                    .isAllDay(false)
                    .isFree(false)
                    .isPrivate(false)
                    .location("621 Boehm Prairie")
                    .notes("Aegre traho.")
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(8d)
                            .endAt(OffsetDateTime.parse("2025-12-27T06:36:48.712Z"))
                            .excludedDates(List.of(
                                "2025-10-01T21:51:21.653Z",
                                "2023-10-10T03:56:38.610Z",
                                "2024-02-16T06:22:41.957Z"))
                            .frequency(CalendarEventRecurrenceFrequency.MONTHLY)
                            .includedDates(List.of(
                                "2021-02-17T03:51:10.822Z"))
                            .interval(4d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.TH,
                                PropertyCalendarEventRecurrenceOnDays.MO,
                                PropertyCalendarEventRecurrenceOnDays.TH))
                            .onMonthDays(List.of(
                                -26d))
                            .onMonths(List.of(
                                12d,
                                9d,
                                -1d,
                                0d,
                                1d,
                                6d,
                                -10d,
                                9d,
                                0d,
                                4d,
                                -2d))
                            .onWeeks(List.of(
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
                                -18d))
                            .onYearDays(List.of(
                                -35d,
                                14d,
                                -338d,
                                175d,
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
                                -55d))
                            .timezone("Asia/Ho_Chi_Minh")
                            .weekStart(WeekStart.SU)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(9d)
                            .endAt(OffsetDateTime.parse("2025-05-01T03:26:23.427Z"))
                            .excludedDates(List.of(
                                "2020-04-29T03:29:04.085Z"))
                            .frequency(CalendarEventRecurrenceFrequency.DAILY)
                            .includedDates(List.of(
                                "2020-09-11T06:43:23.783Z",
                                "2021-11-29T10:11:03.395Z",
                                "2019-12-22T19:32:36.694Z"))
                            .interval(1d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.WE,
                                PropertyCalendarEventRecurrenceOnDays.TU,
                                PropertyCalendarEventRecurrenceOnDays.WE,
                                PropertyCalendarEventRecurrenceOnDays.SA,
                                PropertyCalendarEventRecurrenceOnDays.SA,
                                PropertyCalendarEventRecurrenceOnDays.SA))
                            .onMonthDays(List.of(
                                1d))
                            .onMonths(List.of(
                                4d,
                                0d,
                                -3d))
                            .onWeeks(List.of(
                                -7d,
                                -19d,
                                50d,
                                -37d,
                                43d,
                                -48d,
                                -30d,
                                34d,
                                36d,
                                -33d,
                                24d,
                                -4d))
                            .onYearDays(List.of(
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
                                -254d,
                                -35d,
                                -121d,
                                262d,
                                32d,
                                190d,
                                107d,
                                -145d,
                                91d,
                                313d,
                                -48d,
                                277d,
                                104d,
                                342d,
                                297d,
                                -216d,
                                346d,
                                -257d,
                                307d,
                                -44d,
                                264d,
                                -153d,
                                -268d,
                                92d,
                                152d,
                                -182d,
                                -334d,
                                89d,
                                343d,
                                -320d,
                                -36d,
                                84d,
                                340d,
                                -88d,
                                -278d,
                                202d,
                                291d,
                                95d,
                                -234d,
                                -304d,
                                -157d,
                                -82d,
                                -339d,
                                83d,
                                2d,
                                -238d,
                                -204d,
                                206d,
                                -273d,
                                -78d,
                                -21d,
                                270d,
                                -266d,
                                -276d,
                                154d,
                                -97d,
                                -43d,
                                -3d,
                                191d,
                                -302d,
                                290d,
                                -118d,
                                -125d,
                                -294d,
                                115d,
                                -73d,
                                -244d,
                                127d,
                                26d,
                                251d,
                                47d,
                                -157d,
                                22d,
                                -361d,
                                318d,
                                352d,
                                358d,
                                167d,
                                210d,
                                -185d,
                                327d,
                                117d,
                                350d,
                                -170d,
                                -144d,
                                -14d,
                                -37d,
                                318d,
                                243d,
                                33d,
                                90d,
                                319d,
                                -270d,
                                229d,
                                122d,
                                287d,
                                -90d,
                                -69d,
                                -134d,
                                -184d,
                                25d,
                                -178d,
                                -89d,
                                -273d,
                                -49d,
                                -362d,
                                -9d,
                                -71d,
                                -347d,
                                353d,
                                342d,
                                133d,
                                -116d,
                                231d,
                                -231d,
                                51d,
                                288d,
                                186d,
                                -328d,
                                275d,
                                81d,
                                94d,
                                -263d,
                                114d,
                                13d,
                                -357d,
                                171d,
                                -242d,
                                -85d,
                                -362d,
                                108d,
                                164d,
                                69d,
                                15d,
                                57d,
                                -287d,
                                100d,
                                165d,
                                205d,
                                204d,
                                -78d,
                                360d,
                                -80d,
                                -120d,
                                -255d,
                                -77d,
                                110d,
                                -26d,
                                -149d,
                                -254d,
                                95d,
                                32d,
                                -57d,
                                -195d,
                                100d,
                                221d,
                                74d,
                                274d,
                                15d,
                                353d,
                                204d,
                                -365d,
                                315d,
                                344d,
                                199d,
                                -59d,
                                272d,
                                173d,
                                -40d,
                                -318d,
                                -330d,
                                -365d,
                                -272d,
                                -149d,
                                -27d,
                                -334d,
                                -277d,
                                344d,
                                351d,
                                -310d,
                                264d,
                                281d,
                                176d,
                                191d,
                                -183d,
                                288d,
                                -112d,
                                -55d,
                                -166d,
                                258d,
                                194d,
                                59d))
                            .timezone("America/Guadeloupe")
                            .weekStart(WeekStart.TU)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(1d)
                            .endAt(OffsetDateTime.parse("2020-11-04T22:36:46.229Z"))
                            .excludedDates(List.of(
                                "2023-01-12T10:30:11.293Z",
                                "2021-09-07T21:13:56.281Z"))
                            .frequency(CalendarEventRecurrenceFrequency.WEEKLY)
                            .includedDates(List.of(
                                "2024-09-01T06:03:11.766Z"))
                            .interval(9d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.TU,
                                PropertyCalendarEventRecurrenceOnDays.SA))
                            .onMonthDays(List.of(
                                -2d))
                            .onMonths(List.of(
                                -4d,
                                8d,
                                0d,
                                9d,
                                4d,
                                -11d,
                                7d,
                                1d,
                                -5d))
                            .onWeeks(List.of(
                                -36d,
                                -31d,
                                -16d,
                                -6d,
                                44d,
                                -37d,
                                14d,
                                38d,
                                -27d,
                                -22d,
                                -2d,
                                24d,
                                7d,
                                50d,
                                46d,
                                52d,
                                20d,
                                37d,
                                31d,
                                48d,
                                35d,
                                -46d,
                                13d,
                                22d,
                                53d,
                                20d,
                                -28d,
                                -2d,
                                39d,
                                13d,
                                4d,
                                0d,
                                7d,
                                -38d,
                                -35d,
                                41d,
                                49d,
                                12d,
                                17d,
                                8d,
                                49d,
                                -47d,
                                46d,
                                25d,
                                14d,
                                -26d,
                                -37d,
                                -25d,
                                -41d,
                                27d,
                                28d,
                                -19d))
                            .onYearDays(List.of(
                                -256d,
                                -328d,
                                -312d,
                                50d,
                                -251d,
                                -338d,
                                -315d,
                                214d,
                                129d,
                                -263d,
                                -108d,
                                -11d,
                                206d,
                                -29d,
                                -159d,
                                -29d,
                                -264d,
                                295d,
                                -231d,
                                53d,
                                34d,
                                -366d,
                                326d,
                                -202d,
                                151d,
                                79d,
                                -66d,
                                11d,
                                -42d,
                                73d,
                                338d,
                                -155d,
                                197d,
                                260d,
                                356d,
                                -323d,
                                -213d,
                                -332d,
                                -305d,
                                -182d,
                                -253d,
                                -276d,
                                -285d,
                                96d,
                                -336d,
                                269d,
                                -233d,
                                250d,
                                -112d,
                                -307d,
                                -96d,
                                54d,
                                267d,
                                318d,
                                -66d,
                                11d,
                                -303d,
                                231d,
                                165d,
                                -297d,
                                -348d,
                                -355d,
                                364d,
                                312d,
                                -26d,
                                111d,
                                162d,
                                280d,
                                312d,
                                337d,
                                235d,
                                68d,
                                -282d,
                                363d,
                                212d,
                                -328d,
                                9d,
                                -24d,
                                -163d,
                                -101d,
                                -79d,
                                -264d,
                                -157d,
                                188d,
                                290d,
                                51d,
                                -213d,
                                216d,
                                230d,
                                -270d,
                                -211d,
                                -156d,
                                -165d,
                                -305d,
                                -45d,
                                224d,
                                -248d,
                                65d,
                                9d,
                                274d,
                                -299d,
                                -228d,
                                33d,
                                -42d,
                                356d,
                                -311d,
                                241d,
                                261d,
                                -136d,
                                -252d,
                                166d,
                                208d,
                                -126d,
                                64d,
                                323d,
                                -104d,
                                -106d,
                                -248d,
                                -41d,
                                -109d,
                                245d,
                                47d,
                                205d,
                                358d,
                                -296d,
                                214d,
                                -157d,
                                -313d,
                                -303d,
                                -54d,
                                -229d,
                                231d,
                                -94d,
                                -198d,
                                338d,
                                199d,
                                5d,
                                42d,
                                309d,
                                73d,
                                56d,
                                -120d,
                                351d,
                                6d,
                                -193d,
                                21d,
                                78d,
                                57d,
                                -269d,
                                -76d,
                                -299d,
                                295d,
                                -278d,
                                11d,
                                121d,
                                -323d,
                                156d,
                                67d,
                                152d,
                                284d,
                                108d,
                                -7d,
                                329d,
                                -32d,
                                333d,
                                -338d,
                                148d,
                                -42d,
                                151d,
                                145d,
                                -34d,
                                -36d,
                                296d,
                                -198d,
                                -317d,
                                -161d,
                                -253d,
                                328d,
                                -57d,
                                134d,
                                -289d,
                                229d,
                                44d,
                                16d,
                                -256d,
                                289d,
                                -234d,
                                197d,
                                333d,
                                228d,
                                -143d,
                                -202d,
                                -172d,
                                -262d,
                                -203d,
                                -83d,
                                -242d,
                                -173d,
                                336d,
                                298d,
                                -319d,
                                66d,
                                254d,
                                214d,
                                -118d,
                                -216d,
                                -168d,
                                44d,
                                -243d,
                                207d,
                                -28d,
                                -4d,
                                -272d,
                                79d))
                            .timezone("Atlantic/Reykjavik")
                            .weekStart(WeekStart.TU)
                            .build()))
                    .recurringEventId("a9ca370f-74f3-4477-950c-7c453c94ec9e")
                    .sendNotifications(false)
                    .startAt("2020-05-20T11:04:36.912Z")
                    .status(CalendarEventStatus.CONFIRMED)
                    .subject("Sunt spargo tepidus bestia vigor credo coadunatio appello.")
                    .timezone("Asia/Bangkok")
                    .updatedAt("2020-06-26T08:09:24.597Z")
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

Create a link

### Example Usage

<!-- UsageSnippet language="java" operationID="createCalendarLink" method="post" path="/calendar/{connection_id}/link" example="calendar_link" -->
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
                    .url("https://annual-apricot.info/")
                    .createdAt("2023-03-07T13:34:11.959Z")
                    .description("Vitium clibanus laboriosam uxor denuncio.")
                    .duration(74d)
                    .id("f70aa902-f299-4e6c-837c-9626028b129a")
                    .isActive(true)
                    .name("Sopor sopor ancilla animus anser dignissimos vito confero utilis.")
                    .priceAmount(44d)
                    .priceCurrency("USD")
                    .updatedAt("2024-03-06T19:05:28.677Z")
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

Create a webinar

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
                    .endAt(OffsetDateTime.parse("2025-10-04T19:45:27.247Z"))
                    .hasPolls(false)
                    .hasRecording(false)
                    .id("d83acba0-1cc6-41ca-858d-00f343e2c97f")
                    .isAutoApprove(false)
                    .isEnabled(true)
                    .isWebcast(false)
                    .joinUrl("https://robust-bathhouse.biz")
                    .notes("Curriculum ducimus assentator aspernatur ait.")
                    .organizer(PropertyCalendarWebinarOrganizer.builder()
                        .email("Kelton_Dicki@yahoo.com")
                        .name("Walter Greenfelder")
                        .build())
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(10d)
                            .endAt(OffsetDateTime.parse("2023-08-23T07:12:34.425Z"))
                            .excludedDates(List.of(
                                "2025-01-25T05:08:05.020Z"))
                            .frequency(CalendarEventRecurrenceFrequency.MONTHLY)
                            .includedDates(List.of(
                                "2024-04-15T05:07:29.792Z"))
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
                            .timezone("Asia/Ust-Nera")
                            .weekStart(WeekStart.MO)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(3d)
                            .endAt(OffsetDateTime.parse("2022-09-28T23:22:42.793Z"))
                            .excludedDates(List.of(
                                "2024-08-17T04:29:52.675Z",
                                "2024-08-01T22:53:46.287Z"))
                            .frequency(CalendarEventRecurrenceFrequency.DAILY)
                            .includedDates(List.of(
                                "2024-03-12T18:42:20.061Z",
                                "2025-12-18T23:44:04.949Z",
                                "2023-08-06T06:59:52.050Z"))
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
                            .timezone("Pacific/Wake")
                            .weekStart(WeekStart.TU)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(8d)
                            .endAt(OffsetDateTime.parse("2026-06-27T06:51:53.423Z"))
                            .excludedDates(List.of(
                                "2023-06-11T17:58:21.831Z",
                                "2023-06-01T00:00:39.915Z"))
                            .frequency(CalendarEventRecurrenceFrequency.WEEKLY)
                            .includedDates(List.of(
                                "2024-03-20T15:46:06.870Z",
                                "2023-08-11T23:40:17.268Z",
                                "2024-09-10T21:20:12.153Z"))
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
                            .timezone("Africa/Bissau")
                            .weekStart(WeekStart.WE)
                            .build()))
                    .registrantPassword("OxwWzr0C")
                    .requireAddress(false)
                    .requireJobTitle(false)
                    .startAt(OffsetDateTime.parse("2025-04-10T06:04:00.865Z"))
                    .status(CalendarWebinarStatus.TENTATIVE)
                    .subject("Harum culpa decipio ex cubo ancilla cresco.")
                    .timezone("Europe/Kaliningrad")
                    .updatedAt(OffsetDateTime.parse("2026-08-30T22:52:02.801Z"))
                    .webUrl("https://classic-recovery.biz")
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

Update a calendar

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarCalendar" method="patch" path="/calendar/{connection_id}/calendar/{id}" example="calendar_calendar" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .description("Socius catena auxilium.")
                    .id("01ac9b96-01e8-46e7-b21d-063bc95e4af5")
                    .isPrimary(false)
                    .name("Acer supra vallum suasoria thesaurus omnis condico cognomen accendo vehemens.")
                    .timezone("America/Dawson_Creek")
                    .updatedAt(OffsetDateTime.parse("2023-03-13T11:25:56.524Z"))
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
                    .endAt("2020-05-20T20:11:43.820Z")
                    .id("47f372b9-e16a-4078-a0b7-3ff1201bfd86")
                    .isAllDay(false)
                    .isFree(false)
                    .isPrivate(false)
                    .location("621 Boehm Prairie")
                    .notes("Aegre traho.")
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(8d)
                            .endAt(OffsetDateTime.parse("2025-12-27T06:36:48.750Z"))
                            .excludedDates(List.of(
                                "2025-10-01T21:51:21.690Z",
                                "2023-10-10T03:56:38.636Z",
                                "2024-02-16T06:22:41.985Z"))
                            .frequency(CalendarEventRecurrenceFrequency.MONTHLY)
                            .includedDates(List.of(
                                "2021-02-17T03:51:10.831Z"))
                            .interval(4d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.TH,
                                PropertyCalendarEventRecurrenceOnDays.MO,
                                PropertyCalendarEventRecurrenceOnDays.TH))
                            .onMonthDays(List.of(
                                -26d))
                            .onMonths(List.of(
                                12d,
                                9d,
                                -1d,
                                0d,
                                1d,
                                6d,
                                -10d,
                                9d,
                                0d,
                                4d,
                                -2d))
                            .onWeeks(List.of(
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
                                -18d))
                            .onYearDays(List.of(
                                -35d,
                                14d,
                                -338d,
                                175d,
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
                                -55d))
                            .timezone("Asia/Ho_Chi_Minh")
                            .weekStart(WeekStart.SU)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(9d)
                            .endAt(OffsetDateTime.parse("2025-05-01T03:26:23.463Z"))
                            .excludedDates(List.of(
                                "2020-04-29T03:29:04.089Z"))
                            .frequency(CalendarEventRecurrenceFrequency.DAILY)
                            .includedDates(List.of(
                                "2020-09-11T06:43:23.790Z",
                                "2021-11-29T10:11:03.409Z",
                                "2019-12-22T19:32:36.696Z"))
                            .interval(1d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.WE,
                                PropertyCalendarEventRecurrenceOnDays.TU,
                                PropertyCalendarEventRecurrenceOnDays.WE,
                                PropertyCalendarEventRecurrenceOnDays.SA,
                                PropertyCalendarEventRecurrenceOnDays.SA,
                                PropertyCalendarEventRecurrenceOnDays.SA))
                            .onMonthDays(List.of(
                                1d))
                            .onMonths(List.of(
                                4d,
                                0d,
                                -3d))
                            .onWeeks(List.of(
                                -7d,
                                -19d,
                                50d,
                                -37d,
                                43d,
                                -48d,
                                -30d,
                                34d,
                                36d,
                                -33d,
                                24d,
                                -4d))
                            .onYearDays(List.of(
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
                                -254d,
                                -35d,
                                -121d,
                                262d,
                                32d,
                                190d,
                                107d,
                                -145d,
                                91d,
                                313d,
                                -48d,
                                277d,
                                104d,
                                342d,
                                297d,
                                -216d,
                                346d,
                                -257d,
                                307d,
                                -44d,
                                264d,
                                -153d,
                                -268d,
                                92d,
                                152d,
                                -182d,
                                -334d,
                                89d,
                                343d,
                                -320d,
                                -36d,
                                84d,
                                340d,
                                -88d,
                                -278d,
                                202d,
                                291d,
                                95d,
                                -234d,
                                -304d,
                                -157d,
                                -82d,
                                -339d,
                                83d,
                                2d,
                                -238d,
                                -204d,
                                206d,
                                -273d,
                                -78d,
                                -21d,
                                270d,
                                -266d,
                                -276d,
                                154d,
                                -97d,
                                -43d,
                                -3d,
                                191d,
                                -302d,
                                290d,
                                -118d,
                                -125d,
                                -294d,
                                115d,
                                -73d,
                                -244d,
                                127d,
                                26d,
                                251d,
                                47d,
                                -157d,
                                22d,
                                -361d,
                                318d,
                                352d,
                                358d,
                                167d,
                                210d,
                                -185d,
                                327d,
                                117d,
                                350d,
                                -170d,
                                -144d,
                                -14d,
                                -37d,
                                318d,
                                243d,
                                33d,
                                90d,
                                319d,
                                -270d,
                                229d,
                                122d,
                                287d,
                                -90d,
                                -69d,
                                -134d,
                                -184d,
                                25d,
                                -178d,
                                -89d,
                                -273d,
                                -49d,
                                -362d,
                                -9d,
                                -71d,
                                -347d,
                                353d,
                                342d,
                                133d,
                                -116d,
                                231d,
                                -231d,
                                51d,
                                288d,
                                186d,
                                -328d,
                                275d,
                                81d,
                                94d,
                                -263d,
                                114d,
                                13d,
                                -357d,
                                171d,
                                -242d,
                                -85d,
                                -362d,
                                108d,
                                164d,
                                69d,
                                15d,
                                57d,
                                -287d,
                                100d,
                                165d,
                                205d,
                                204d,
                                -78d,
                                360d,
                                -80d,
                                -120d,
                                -255d,
                                -77d,
                                110d,
                                -26d,
                                -149d,
                                -254d,
                                95d,
                                32d,
                                -57d,
                                -195d,
                                100d,
                                221d,
                                74d,
                                274d,
                                15d,
                                353d,
                                204d,
                                -365d,
                                315d,
                                344d,
                                199d,
                                -59d,
                                272d,
                                173d,
                                -40d,
                                -318d,
                                -330d,
                                -365d,
                                -272d,
                                -149d,
                                -27d,
                                -334d,
                                -277d,
                                344d,
                                351d,
                                -310d,
                                264d,
                                281d,
                                176d,
                                191d,
                                -183d,
                                288d,
                                -112d,
                                -55d,
                                -166d,
                                258d,
                                194d,
                                59d))
                            .timezone("America/Guadeloupe")
                            .weekStart(WeekStart.TU)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(1d)
                            .endAt(OffsetDateTime.parse("2020-11-04T22:36:46.236Z"))
                            .excludedDates(List.of(
                                "2023-01-12T10:30:11.314Z",
                                "2021-09-07T21:13:56.293Z"))
                            .frequency(CalendarEventRecurrenceFrequency.WEEKLY)
                            .includedDates(List.of(
                                "2024-09-01T06:03:11.797Z"))
                            .interval(9d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.TU,
                                PropertyCalendarEventRecurrenceOnDays.SA))
                            .onMonthDays(List.of(
                                -2d))
                            .onMonths(List.of(
                                -4d,
                                8d,
                                0d,
                                9d,
                                4d,
                                -11d,
                                7d,
                                1d,
                                -5d))
                            .onWeeks(List.of(
                                -36d,
                                -31d,
                                -16d,
                                -6d,
                                44d,
                                -37d,
                                14d,
                                38d,
                                -27d,
                                -22d,
                                -2d,
                                24d,
                                7d,
                                50d,
                                46d,
                                52d,
                                20d,
                                37d,
                                31d,
                                48d,
                                35d,
                                -46d,
                                13d,
                                22d,
                                53d,
                                20d,
                                -28d,
                                -2d,
                                39d,
                                13d,
                                4d,
                                0d,
                                7d,
                                -38d,
                                -35d,
                                41d,
                                49d,
                                12d,
                                17d,
                                8d,
                                49d,
                                -47d,
                                46d,
                                25d,
                                14d,
                                -26d,
                                -37d,
                                -25d,
                                -41d,
                                27d,
                                28d,
                                -19d))
                            .onYearDays(List.of(
                                -256d,
                                -328d,
                                -312d,
                                50d,
                                -251d,
                                -338d,
                                -315d,
                                214d,
                                129d,
                                -263d,
                                -108d,
                                -11d,
                                206d,
                                -29d,
                                -159d,
                                -29d,
                                -264d,
                                295d,
                                -231d,
                                53d,
                                34d,
                                -366d,
                                326d,
                                -202d,
                                151d,
                                79d,
                                -66d,
                                11d,
                                -42d,
                                73d,
                                338d,
                                -155d,
                                197d,
                                260d,
                                356d,
                                -323d,
                                -213d,
                                -332d,
                                -305d,
                                -182d,
                                -253d,
                                -276d,
                                -285d,
                                96d,
                                -336d,
                                269d,
                                -233d,
                                250d,
                                -112d,
                                -307d,
                                -96d,
                                54d,
                                267d,
                                318d,
                                -66d,
                                11d,
                                -303d,
                                231d,
                                165d,
                                -297d,
                                -348d,
                                -355d,
                                364d,
                                312d,
                                -26d,
                                111d,
                                162d,
                                280d,
                                312d,
                                337d,
                                235d,
                                68d,
                                -282d,
                                363d,
                                212d,
                                -328d,
                                9d,
                                -24d,
                                -163d,
                                -101d,
                                -79d,
                                -264d,
                                -157d,
                                188d,
                                290d,
                                51d,
                                -213d,
                                216d,
                                230d,
                                -270d,
                                -211d,
                                -156d,
                                -165d,
                                -305d,
                                -45d,
                                224d,
                                -248d,
                                65d,
                                9d,
                                274d,
                                -299d,
                                -228d,
                                33d,
                                -42d,
                                356d,
                                -311d,
                                241d,
                                261d,
                                -136d,
                                -252d,
                                166d,
                                208d,
                                -126d,
                                64d,
                                323d,
                                -104d,
                                -106d,
                                -248d,
                                -41d,
                                -109d,
                                245d,
                                47d,
                                205d,
                                358d,
                                -296d,
                                214d,
                                -157d,
                                -313d,
                                -303d,
                                -54d,
                                -229d,
                                231d,
                                -94d,
                                -198d,
                                338d,
                                199d,
                                5d,
                                42d,
                                309d,
                                73d,
                                56d,
                                -120d,
                                351d,
                                6d,
                                -193d,
                                21d,
                                78d,
                                57d,
                                -269d,
                                -76d,
                                -299d,
                                295d,
                                -278d,
                                11d,
                                121d,
                                -323d,
                                156d,
                                67d,
                                152d,
                                284d,
                                108d,
                                -7d,
                                329d,
                                -32d,
                                333d,
                                -338d,
                                148d,
                                -42d,
                                151d,
                                145d,
                                -34d,
                                -36d,
                                296d,
                                -198d,
                                -317d,
                                -161d,
                                -253d,
                                328d,
                                -57d,
                                134d,
                                -289d,
                                229d,
                                44d,
                                16d,
                                -256d,
                                289d,
                                -234d,
                                197d,
                                333d,
                                228d,
                                -143d,
                                -202d,
                                -172d,
                                -262d,
                                -203d,
                                -83d,
                                -242d,
                                -173d,
                                336d,
                                298d,
                                -319d,
                                66d,
                                254d,
                                214d,
                                -118d,
                                -216d,
                                -168d,
                                44d,
                                -243d,
                                207d,
                                -28d,
                                -4d,
                                -272d,
                                79d))
                            .timezone("Atlantic/Reykjavik")
                            .weekStart(WeekStart.TU)
                            .build()))
                    .recurringEventId("9da1b5cb-9e11-4234-a84f-990d6201b28e")
                    .sendNotifications(false)
                    .startAt("2020-05-20T11:04:36.916Z")
                    .status(CalendarEventStatus.CONFIRMED)
                    .subject("Sunt spargo tepidus bestia vigor credo coadunatio appello.")
                    .timezone("Asia/Bangkok")
                    .updatedAt("2020-06-26T08:09:24.602Z")
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

Update a link

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarLink" method="patch" path="/calendar/{connection_id}/link/{id}" example="calendar_link" -->
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
                    .url("https://annual-apricot.info/")
                    .createdAt("2023-03-07T13:34:11.959Z")
                    .description("Vitium clibanus laboriosam uxor denuncio.")
                    .duration(74d)
                    .id("05aa4934-8df3-43b2-8194-bc4ecd677ac1")
                    .isActive(true)
                    .name("Sopor sopor ancilla animus anser dignissimos vito confero utilis.")
                    .priceAmount(44d)
                    .priceCurrency("USD")
                    .updatedAt("2024-03-06T19:05:28.679Z")
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

Update a webinar

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
                    .endAt(OffsetDateTime.parse("2025-10-04T19:45:27.278Z"))
                    .hasPolls(false)
                    .hasRecording(false)
                    .id("f6c7f346-965d-47df-95ea-23bfbfc31f7e")
                    .isAutoApprove(false)
                    .isEnabled(true)
                    .isWebcast(false)
                    .joinUrl("https://robust-bathhouse.biz")
                    .notes("Curriculum ducimus assentator aspernatur ait.")
                    .organizer(PropertyCalendarWebinarOrganizer.builder()
                        .email("Kelton_Dicki@yahoo.com")
                        .name("Walter Greenfelder")
                        .build())
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(10d)
                            .endAt(OffsetDateTime.parse("2023-08-23T07:12:34.436Z"))
                            .excludedDates(List.of(
                                "2025-01-25T05:08:05.045Z"))
                            .frequency(CalendarEventRecurrenceFrequency.MONTHLY)
                            .includedDates(List.of(
                                "2024-04-15T05:07:29.809Z"))
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
                            .timezone("Asia/Ust-Nera")
                            .weekStart(WeekStart.MO)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(3d)
                            .endAt(OffsetDateTime.parse("2022-09-28T23:22:42.795Z"))
                            .excludedDates(List.of(
                                "2024-08-17T04:29:52.695Z",
                                "2024-08-01T22:53:46.307Z"))
                            .frequency(CalendarEventRecurrenceFrequency.DAILY)
                            .includedDates(List.of(
                                "2024-03-12T18:42:20.077Z",
                                "2025-12-18T23:44:04.981Z",
                                "2023-08-06T06:59:52.060Z"))
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
                            .timezone("Pacific/Wake")
                            .weekStart(WeekStart.TU)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(8d)
                            .endAt(OffsetDateTime.parse("2026-06-27T06:51:53.460Z"))
                            .excludedDates(List.of(
                                "2023-06-11T17:58:21.840Z",
                                "2023-06-01T00:00:39.923Z"))
                            .frequency(CalendarEventRecurrenceFrequency.WEEKLY)
                            .includedDates(List.of(
                                "2024-03-20T15:46:06.886Z",
                                "2023-08-11T23:40:17.278Z",
                                "2024-09-10T21:20:12.173Z"))
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
                            .timezone("Africa/Bissau")
                            .weekStart(WeekStart.WE)
                            .build()))
                    .registrantPassword("OxwWzr0C")
                    .requireAddress(false)
                    .requireJobTitle(false)
                    .startAt(OffsetDateTime.parse("2025-04-10T06:04:00.891Z"))
                    .status(CalendarWebinarStatus.TENTATIVE)
                    .subject("Harum culpa decipio ex cubo ancilla cresco.")
                    .timezone("Europe/Kaliningrad")
                    .updatedAt(OffsetDateTime.parse("2026-08-30T22:52:02.842Z"))
                    .webUrl("https://classic-recovery.biz")
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

<!-- UsageSnippet language="java" operationID="updateCalendarCalendar" method="put" path="/calendar/{connection_id}/calendar/{id}" example="calendar_calendar" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .description("Socius catena auxilium.")
                    .id("01ac9b96-01e8-46e7-b21d-063bc95e4af5")
                    .isPrimary(false)
                    .name("Acer supra vallum suasoria thesaurus omnis condico cognomen accendo vehemens.")
                    .timezone("America/Dawson_Creek")
                    .updatedAt(OffsetDateTime.parse("2023-03-13T11:25:56.524Z"))
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
                    .endAt("2020-05-20T20:11:43.820Z")
                    .id("47f372b9-e16a-4078-a0b7-3ff1201bfd86")
                    .isAllDay(false)
                    .isFree(false)
                    .isPrivate(false)
                    .location("621 Boehm Prairie")
                    .notes("Aegre traho.")
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(8d)
                            .endAt(OffsetDateTime.parse("2025-12-27T06:36:48.750Z"))
                            .excludedDates(List.of(
                                "2025-10-01T21:51:21.690Z",
                                "2023-10-10T03:56:38.636Z",
                                "2024-02-16T06:22:41.985Z"))
                            .frequency(CalendarEventRecurrenceFrequency.MONTHLY)
                            .includedDates(List.of(
                                "2021-02-17T03:51:10.831Z"))
                            .interval(4d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.TH,
                                PropertyCalendarEventRecurrenceOnDays.MO,
                                PropertyCalendarEventRecurrenceOnDays.TH))
                            .onMonthDays(List.of(
                                -26d))
                            .onMonths(List.of(
                                12d,
                                9d,
                                -1d,
                                0d,
                                1d,
                                6d,
                                -10d,
                                9d,
                                0d,
                                4d,
                                -2d))
                            .onWeeks(List.of(
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
                                -18d))
                            .onYearDays(List.of(
                                -35d,
                                14d,
                                -338d,
                                175d,
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
                                -55d))
                            .timezone("Asia/Ho_Chi_Minh")
                            .weekStart(WeekStart.SU)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(9d)
                            .endAt(OffsetDateTime.parse("2025-05-01T03:26:23.463Z"))
                            .excludedDates(List.of(
                                "2020-04-29T03:29:04.089Z"))
                            .frequency(CalendarEventRecurrenceFrequency.DAILY)
                            .includedDates(List.of(
                                "2020-09-11T06:43:23.790Z",
                                "2021-11-29T10:11:03.409Z",
                                "2019-12-22T19:32:36.696Z"))
                            .interval(1d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.WE,
                                PropertyCalendarEventRecurrenceOnDays.TU,
                                PropertyCalendarEventRecurrenceOnDays.WE,
                                PropertyCalendarEventRecurrenceOnDays.SA,
                                PropertyCalendarEventRecurrenceOnDays.SA,
                                PropertyCalendarEventRecurrenceOnDays.SA))
                            .onMonthDays(List.of(
                                1d))
                            .onMonths(List.of(
                                4d,
                                0d,
                                -3d))
                            .onWeeks(List.of(
                                -7d,
                                -19d,
                                50d,
                                -37d,
                                43d,
                                -48d,
                                -30d,
                                34d,
                                36d,
                                -33d,
                                24d,
                                -4d))
                            .onYearDays(List.of(
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
                                -254d,
                                -35d,
                                -121d,
                                262d,
                                32d,
                                190d,
                                107d,
                                -145d,
                                91d,
                                313d,
                                -48d,
                                277d,
                                104d,
                                342d,
                                297d,
                                -216d,
                                346d,
                                -257d,
                                307d,
                                -44d,
                                264d,
                                -153d,
                                -268d,
                                92d,
                                152d,
                                -182d,
                                -334d,
                                89d,
                                343d,
                                -320d,
                                -36d,
                                84d,
                                340d,
                                -88d,
                                -278d,
                                202d,
                                291d,
                                95d,
                                -234d,
                                -304d,
                                -157d,
                                -82d,
                                -339d,
                                83d,
                                2d,
                                -238d,
                                -204d,
                                206d,
                                -273d,
                                -78d,
                                -21d,
                                270d,
                                -266d,
                                -276d,
                                154d,
                                -97d,
                                -43d,
                                -3d,
                                191d,
                                -302d,
                                290d,
                                -118d,
                                -125d,
                                -294d,
                                115d,
                                -73d,
                                -244d,
                                127d,
                                26d,
                                251d,
                                47d,
                                -157d,
                                22d,
                                -361d,
                                318d,
                                352d,
                                358d,
                                167d,
                                210d,
                                -185d,
                                327d,
                                117d,
                                350d,
                                -170d,
                                -144d,
                                -14d,
                                -37d,
                                318d,
                                243d,
                                33d,
                                90d,
                                319d,
                                -270d,
                                229d,
                                122d,
                                287d,
                                -90d,
                                -69d,
                                -134d,
                                -184d,
                                25d,
                                -178d,
                                -89d,
                                -273d,
                                -49d,
                                -362d,
                                -9d,
                                -71d,
                                -347d,
                                353d,
                                342d,
                                133d,
                                -116d,
                                231d,
                                -231d,
                                51d,
                                288d,
                                186d,
                                -328d,
                                275d,
                                81d,
                                94d,
                                -263d,
                                114d,
                                13d,
                                -357d,
                                171d,
                                -242d,
                                -85d,
                                -362d,
                                108d,
                                164d,
                                69d,
                                15d,
                                57d,
                                -287d,
                                100d,
                                165d,
                                205d,
                                204d,
                                -78d,
                                360d,
                                -80d,
                                -120d,
                                -255d,
                                -77d,
                                110d,
                                -26d,
                                -149d,
                                -254d,
                                95d,
                                32d,
                                -57d,
                                -195d,
                                100d,
                                221d,
                                74d,
                                274d,
                                15d,
                                353d,
                                204d,
                                -365d,
                                315d,
                                344d,
                                199d,
                                -59d,
                                272d,
                                173d,
                                -40d,
                                -318d,
                                -330d,
                                -365d,
                                -272d,
                                -149d,
                                -27d,
                                -334d,
                                -277d,
                                344d,
                                351d,
                                -310d,
                                264d,
                                281d,
                                176d,
                                191d,
                                -183d,
                                288d,
                                -112d,
                                -55d,
                                -166d,
                                258d,
                                194d,
                                59d))
                            .timezone("America/Guadeloupe")
                            .weekStart(WeekStart.TU)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(1d)
                            .endAt(OffsetDateTime.parse("2020-11-04T22:36:46.236Z"))
                            .excludedDates(List.of(
                                "2023-01-12T10:30:11.314Z",
                                "2021-09-07T21:13:56.293Z"))
                            .frequency(CalendarEventRecurrenceFrequency.WEEKLY)
                            .includedDates(List.of(
                                "2024-09-01T06:03:11.797Z"))
                            .interval(9d)
                            .onDays(List.of(
                                PropertyCalendarEventRecurrenceOnDays.TU,
                                PropertyCalendarEventRecurrenceOnDays.SA))
                            .onMonthDays(List.of(
                                -2d))
                            .onMonths(List.of(
                                -4d,
                                8d,
                                0d,
                                9d,
                                4d,
                                -11d,
                                7d,
                                1d,
                                -5d))
                            .onWeeks(List.of(
                                -36d,
                                -31d,
                                -16d,
                                -6d,
                                44d,
                                -37d,
                                14d,
                                38d,
                                -27d,
                                -22d,
                                -2d,
                                24d,
                                7d,
                                50d,
                                46d,
                                52d,
                                20d,
                                37d,
                                31d,
                                48d,
                                35d,
                                -46d,
                                13d,
                                22d,
                                53d,
                                20d,
                                -28d,
                                -2d,
                                39d,
                                13d,
                                4d,
                                0d,
                                7d,
                                -38d,
                                -35d,
                                41d,
                                49d,
                                12d,
                                17d,
                                8d,
                                49d,
                                -47d,
                                46d,
                                25d,
                                14d,
                                -26d,
                                -37d,
                                -25d,
                                -41d,
                                27d,
                                28d,
                                -19d))
                            .onYearDays(List.of(
                                -256d,
                                -328d,
                                -312d,
                                50d,
                                -251d,
                                -338d,
                                -315d,
                                214d,
                                129d,
                                -263d,
                                -108d,
                                -11d,
                                206d,
                                -29d,
                                -159d,
                                -29d,
                                -264d,
                                295d,
                                -231d,
                                53d,
                                34d,
                                -366d,
                                326d,
                                -202d,
                                151d,
                                79d,
                                -66d,
                                11d,
                                -42d,
                                73d,
                                338d,
                                -155d,
                                197d,
                                260d,
                                356d,
                                -323d,
                                -213d,
                                -332d,
                                -305d,
                                -182d,
                                -253d,
                                -276d,
                                -285d,
                                96d,
                                -336d,
                                269d,
                                -233d,
                                250d,
                                -112d,
                                -307d,
                                -96d,
                                54d,
                                267d,
                                318d,
                                -66d,
                                11d,
                                -303d,
                                231d,
                                165d,
                                -297d,
                                -348d,
                                -355d,
                                364d,
                                312d,
                                -26d,
                                111d,
                                162d,
                                280d,
                                312d,
                                337d,
                                235d,
                                68d,
                                -282d,
                                363d,
                                212d,
                                -328d,
                                9d,
                                -24d,
                                -163d,
                                -101d,
                                -79d,
                                -264d,
                                -157d,
                                188d,
                                290d,
                                51d,
                                -213d,
                                216d,
                                230d,
                                -270d,
                                -211d,
                                -156d,
                                -165d,
                                -305d,
                                -45d,
                                224d,
                                -248d,
                                65d,
                                9d,
                                274d,
                                -299d,
                                -228d,
                                33d,
                                -42d,
                                356d,
                                -311d,
                                241d,
                                261d,
                                -136d,
                                -252d,
                                166d,
                                208d,
                                -126d,
                                64d,
                                323d,
                                -104d,
                                -106d,
                                -248d,
                                -41d,
                                -109d,
                                245d,
                                47d,
                                205d,
                                358d,
                                -296d,
                                214d,
                                -157d,
                                -313d,
                                -303d,
                                -54d,
                                -229d,
                                231d,
                                -94d,
                                -198d,
                                338d,
                                199d,
                                5d,
                                42d,
                                309d,
                                73d,
                                56d,
                                -120d,
                                351d,
                                6d,
                                -193d,
                                21d,
                                78d,
                                57d,
                                -269d,
                                -76d,
                                -299d,
                                295d,
                                -278d,
                                11d,
                                121d,
                                -323d,
                                156d,
                                67d,
                                152d,
                                284d,
                                108d,
                                -7d,
                                329d,
                                -32d,
                                333d,
                                -338d,
                                148d,
                                -42d,
                                151d,
                                145d,
                                -34d,
                                -36d,
                                296d,
                                -198d,
                                -317d,
                                -161d,
                                -253d,
                                328d,
                                -57d,
                                134d,
                                -289d,
                                229d,
                                44d,
                                16d,
                                -256d,
                                289d,
                                -234d,
                                197d,
                                333d,
                                228d,
                                -143d,
                                -202d,
                                -172d,
                                -262d,
                                -203d,
                                -83d,
                                -242d,
                                -173d,
                                336d,
                                298d,
                                -319d,
                                66d,
                                254d,
                                214d,
                                -118d,
                                -216d,
                                -168d,
                                44d,
                                -243d,
                                207d,
                                -28d,
                                -4d,
                                -272d,
                                79d))
                            .timezone("Atlantic/Reykjavik")
                            .weekStart(WeekStart.TU)
                            .build()))
                    .recurringEventId("9da1b5cb-9e11-4234-a84f-990d6201b28e")
                    .sendNotifications(false)
                    .startAt("2020-05-20T11:04:36.916Z")
                    .status(CalendarEventStatus.CONFIRMED)
                    .subject("Sunt spargo tepidus bestia vigor credo coadunatio appello.")
                    .timezone("Asia/Bangkok")
                    .updatedAt("2020-06-26T08:09:24.602Z")
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

Update a link

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCalendarLink" method="put" path="/calendar/{connection_id}/link/{id}" example="calendar_link" -->
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
                    .url("https://annual-apricot.info/")
                    .createdAt("2023-03-07T13:34:11.959Z")
                    .description("Vitium clibanus laboriosam uxor denuncio.")
                    .duration(74d)
                    .id("05aa4934-8df3-43b2-8194-bc4ecd677ac1")
                    .isActive(true)
                    .name("Sopor sopor ancilla animus anser dignissimos vito confero utilis.")
                    .priceAmount(44d)
                    .priceCurrency("USD")
                    .updatedAt("2024-03-06T19:05:28.679Z")
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

Update a webinar

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
                    .endAt(OffsetDateTime.parse("2025-10-04T19:45:27.278Z"))
                    .hasPolls(false)
                    .hasRecording(false)
                    .id("f6c7f346-965d-47df-95ea-23bfbfc31f7e")
                    .isAutoApprove(false)
                    .isEnabled(true)
                    .isWebcast(false)
                    .joinUrl("https://robust-bathhouse.biz")
                    .notes("Curriculum ducimus assentator aspernatur ait.")
                    .organizer(PropertyCalendarWebinarOrganizer.builder()
                        .email("Kelton_Dicki@yahoo.com")
                        .name("Walter Greenfelder")
                        .build())
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(10d)
                            .endAt(OffsetDateTime.parse("2023-08-23T07:12:34.436Z"))
                            .excludedDates(List.of(
                                "2025-01-25T05:08:05.045Z"))
                            .frequency(CalendarEventRecurrenceFrequency.MONTHLY)
                            .includedDates(List.of(
                                "2024-04-15T05:07:29.809Z"))
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
                            .timezone("Asia/Ust-Nera")
                            .weekStart(WeekStart.MO)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(3d)
                            .endAt(OffsetDateTime.parse("2022-09-28T23:22:42.795Z"))
                            .excludedDates(List.of(
                                "2024-08-17T04:29:52.695Z",
                                "2024-08-01T22:53:46.307Z"))
                            .frequency(CalendarEventRecurrenceFrequency.DAILY)
                            .includedDates(List.of(
                                "2024-03-12T18:42:20.077Z",
                                "2025-12-18T23:44:04.981Z",
                                "2023-08-06T06:59:52.060Z"))
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
                            .timezone("Pacific/Wake")
                            .weekStart(WeekStart.TU)
                            .build(),
                        CalendarEventRecurrence.builder()
                            .count(8d)
                            .endAt(OffsetDateTime.parse("2026-06-27T06:51:53.460Z"))
                            .excludedDates(List.of(
                                "2023-06-11T17:58:21.840Z",
                                "2023-06-01T00:00:39.923Z"))
                            .frequency(CalendarEventRecurrenceFrequency.WEEKLY)
                            .includedDates(List.of(
                                "2024-03-20T15:46:06.886Z",
                                "2023-08-11T23:40:17.278Z",
                                "2024-09-10T21:20:12.173Z"))
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
                            .timezone("Africa/Bissau")
                            .weekStart(WeekStart.WE)
                            .build()))
                    .registrantPassword("OxwWzr0C")
                    .requireAddress(false)
                    .requireJobTitle(false)
                    .startAt(OffsetDateTime.parse("2025-04-10T06:04:00.891Z"))
                    .status(CalendarWebinarStatus.TENTATIVE)
                    .subject("Harum culpa decipio ex cubo ancilla cresco.")
                    .timezone("Europe/Kaliningrad")
                    .updatedAt(OffsetDateTime.parse("2026-08-30T22:52:02.842Z"))
                    .webUrl("https://classic-recovery.biz")
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