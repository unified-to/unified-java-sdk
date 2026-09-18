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
                    .id("2b637adf-8f0f-4471-bb62-420f1a3df3ff")
                    .metadata(Map.ofEntries(
                        Map.entry("key", PropertyAnalyticsEventMetadata.builder()
                            .build())))
                    .name("Xk707ttsb51v")
                    .updatedAt(OffsetDateTime.parse("2023-09-22T02:14:32.504Z"))
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
                    .endAt("2020-05-20T14:43:09.217Z")
                    .id("b29abc0a-b7f1-41c1-822c-51120a83b026")
                    .isAllDay(false)
                    .isFree(false)
                    .isPrivate(false)
                    .location("621 Boehm Prairie")
                    .notes("Aegre traho.")
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(8d)
                            .endAt(OffsetDateTime.parse("2025-12-25T10:31:27.175Z"))
                            .excludedDates(List.of(
                                "2025-09-30T03:23:46.574Z",
                                "2023-10-08T23:07:17.101Z",
                                "2024-02-14T23:07:11.050Z"))
                            .frequency(CalendarEventRecurrenceFrequency.MONTHLY)
                            .includedDates(List.of(
                                "2021-02-16T17:14:18.564Z"))
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
                            .endAt(OffsetDateTime.parse("2025-04-29T11:52:53.213Z"))
                            .excludedDates(List.of(
                                "2020-04-28T22:25:03.237Z"))
                            .frequency(CalendarEventRecurrenceFrequency.DAILY)
                            .includedDates(List.of(
                                "2020-09-10T23:06:23.703Z",
                                "2021-11-28T18:11:14.189Z",
                                "2019-12-22T16:53:52.903Z"))
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
                            .endAt(OffsetDateTime.parse("2020-11-04T13:57:53.150Z"))
                            .excludedDates(List.of(
                                "2023-01-11T10:47:19.279Z",
                                "2021-09-07T06:47:33.698Z"))
                            .frequency(CalendarEventRecurrenceFrequency.WEEKLY)
                            .includedDates(List.of(
                                "2024-08-30T19:03:32.348Z"))
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
                    .recurringEventId("fce1cdc1-9034-4021-af8d-a5ce3079a860")
                    .sendNotifications(false)
                    .startAt("2020-05-20T05:36:28.121Z")
                    .status(CalendarEventStatus.CONFIRMED)
                    .subject("Sunt spargo tepidus bestia vigor credo coadunatio appello.")
                    .timezone("Asia/Bangkok")
                    .updatedAt("2020-06-26T01:59:30.793Z")
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
                        .startAt(OffsetDateTime.parse("2024-11-17T19:36:18.647Z"))
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-07-14T04:53:23.784Z"))
                    .id("bc6b1939-6879-4e6a-a90b-2a4f3acae555")
                    .type(CrmEventType.CALL)
                    .updatedAt(OffsetDateTime.parse("2026-09-08T16:08:26.484Z"))
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
                    .endAt("2020-05-20T14:43:09.220Z")
                    .id("793d9c3d-e03c-46a1-9b51-f3dc255713ac")
                    .isAllDay(false)
                    .isFree(false)
                    .isPrivate(false)
                    .location("621 Boehm Prairie")
                    .notes("Aegre traho.")
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(8d)
                            .endAt(OffsetDateTime.parse("2025-12-25T10:31:27.201Z"))
                            .excludedDates(List.of(
                                "2025-09-30T03:23:46.599Z",
                                "2023-10-08T23:07:17.118Z",
                                "2024-02-14T23:07:11.069Z"))
                            .frequency(CalendarEventRecurrenceFrequency.MONTHLY)
                            .includedDates(List.of(
                                "2021-02-16T17:14:18.571Z"))
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
                            .endAt(OffsetDateTime.parse("2025-04-29T11:52:53.237Z"))
                            .excludedDates(List.of(
                                "2020-04-28T22:25:03.240Z"))
                            .frequency(CalendarEventRecurrenceFrequency.DAILY)
                            .includedDates(List.of(
                                "2020-09-10T23:06:23.707Z",
                                "2021-11-28T18:11:14.199Z",
                                "2019-12-22T16:53:52.904Z"))
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
                            .endAt(OffsetDateTime.parse("2020-11-04T13:57:53.155Z"))
                            .excludedDates(List.of(
                                "2023-01-11T10:47:19.293Z",
                                "2021-09-07T06:47:33.707Z"))
                            .frequency(CalendarEventRecurrenceFrequency.WEEKLY)
                            .includedDates(List.of(
                                "2024-08-30T19:03:32.369Z"))
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
                    .recurringEventId("6b8656fb-cf1f-40a5-b627-0da8fd959995")
                    .sendNotifications(false)
                    .startAt("2020-05-20T05:36:28.124Z")
                    .status(CalendarEventStatus.CONFIRMED)
                    .subject("Sunt spargo tepidus bestia vigor credo coadunatio appello.")
                    .timezone("Asia/Bangkok")
                    .updatedAt("2020-06-26T01:59:30.797Z")
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
                        .startAt(OffsetDateTime.parse("2024-11-17T19:36:18.679Z"))
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-07-14T04:53:23.784Z"))
                    .id("17e150e0-763c-4553-8b13-2eb74d8d88fb")
                    .type(CrmEventType.CALL)
                    .updatedAt(OffsetDateTime.parse("2026-09-08T16:08:26.529Z"))
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
                    .id("edcbbf0d-0281-47f1-a49d-9cf2a55c7d48")
                    .isReplacingOriginal(false)
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
                    .endAt("2020-05-20T14:43:09.220Z")
                    .id("793d9c3d-e03c-46a1-9b51-f3dc255713ac")
                    .isAllDay(false)
                    .isFree(false)
                    .isPrivate(false)
                    .location("621 Boehm Prairie")
                    .notes("Aegre traho.")
                    .recurrence(List.of(
                        CalendarEventRecurrence.builder()
                            .count(8d)
                            .endAt(OffsetDateTime.parse("2025-12-25T10:31:27.201Z"))
                            .excludedDates(List.of(
                                "2025-09-30T03:23:46.599Z",
                                "2023-10-08T23:07:17.118Z",
                                "2024-02-14T23:07:11.069Z"))
                            .frequency(CalendarEventRecurrenceFrequency.MONTHLY)
                            .includedDates(List.of(
                                "2021-02-16T17:14:18.571Z"))
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
                            .endAt(OffsetDateTime.parse("2025-04-29T11:52:53.237Z"))
                            .excludedDates(List.of(
                                "2020-04-28T22:25:03.240Z"))
                            .frequency(CalendarEventRecurrenceFrequency.DAILY)
                            .includedDates(List.of(
                                "2020-09-10T23:06:23.707Z",
                                "2021-11-28T18:11:14.199Z",
                                "2019-12-22T16:53:52.904Z"))
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
                            .endAt(OffsetDateTime.parse("2020-11-04T13:57:53.155Z"))
                            .excludedDates(List.of(
                                "2023-01-11T10:47:19.293Z",
                                "2021-09-07T06:47:33.707Z"))
                            .frequency(CalendarEventRecurrenceFrequency.WEEKLY)
                            .includedDates(List.of(
                                "2024-08-30T19:03:32.369Z"))
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
                    .recurringEventId("6b8656fb-cf1f-40a5-b627-0da8fd959995")
                    .sendNotifications(false)
                    .startAt("2020-05-20T05:36:28.124Z")
                    .status(CalendarEventStatus.CONFIRMED)
                    .subject("Sunt spargo tepidus bestia vigor credo coadunatio appello.")
                    .timezone("Asia/Bangkok")
                    .updatedAt("2020-06-26T01:59:30.797Z")
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
                        .startAt(OffsetDateTime.parse("2024-11-17T19:36:18.679Z"))
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-07-14T04:53:23.784Z"))
                    .id("17e150e0-763c-4553-8b13-2eb74d8d88fb")
                    .type(CrmEventType.CALL)
                    .updatedAt(OffsetDateTime.parse("2026-09-08T16:08:26.529Z"))
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
                    .id("edcbbf0d-0281-47f1-a49d-9cf2a55c7d48")
                    .isReplacingOriginal(false)
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