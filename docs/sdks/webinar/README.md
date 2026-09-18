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
                    .endAt(OffsetDateTime.parse("2025-10-03T05:49:51.521Z"))
                    .hasPolls(false)
                    .hasRecording(false)
                    .id("c792c6a7-1449-4f10-a71f-0f5edcc168a0")
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
                            .endAt(OffsetDateTime.parse("2023-08-22T18:00:43.837Z"))
                            .excludedDates(List.of(
                                "2025-01-23T23:17:02.226Z"))
                            .frequency(CalendarEventRecurrenceFrequency.MONTHLY)
                            .includedDates(List.of(
                                "2024-04-14T08:23:07.840Z"))
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
                            .endAt(OffsetDateTime.parse("2022-09-28T20:40:39.446Z"))
                            .excludedDates(List.of(
                                "2024-08-16T03:47:42.507Z",
                                "2024-07-31T22:40:49.340Z"))
                            .frequency(CalendarEventRecurrenceFrequency.DAILY)
                            .includedDates(List.of(
                                "2024-03-11T23:02:06.061Z",
                                "2025-12-17T07:24:18.363Z",
                                "2023-08-05T18:20:39.016Z"))
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
                            .endAt(OffsetDateTime.parse("2026-06-25T08:27:05.448Z"))
                            .excludedDates(List.of(
                                "2023-06-11T07:05:41.236Z",
                                "2023-05-31T13:28:36.359Z"))
                            .frequency(CalendarEventRecurrenceFrequency.WEEKLY)
                            .includedDates(List.of(
                                "2024-03-19T19:50:46.230Z",
                                "2023-08-11T10:50:08.824Z",
                                "2024-09-09T19:50:39.063Z"))
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
                    .startAt(OffsetDateTime.parse("2025-04-08T21:49:01.812Z"))
                    .status(CalendarWebinarStatus.TENTATIVE)
                    .subject("Harum culpa decipio ex cubo ancilla cresco.")
                    .timezone("Europe/Kaliningrad")
                    .updatedAt(OffsetDateTime.parse("2026-08-28T22:23:12.295Z"))
                    .webUrl("https://classic-recovery.biz")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCalendarWebinarResponse res = sdk.webinar().createCalendarWebinar()
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
                    .endAt(OffsetDateTime.parse("2025-10-03T05:49:51.559Z"))
                    .hasPolls(false)
                    .hasRecording(false)
                    .id("fa0c43f3-d5cc-4ab7-a219-e6b1583dd5d0")
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
                            .endAt(OffsetDateTime.parse("2023-08-22T18:00:43.850Z"))
                            .excludedDates(List.of(
                                "2025-01-23T23:17:02.256Z"))
                            .frequency(CalendarEventRecurrenceFrequency.MONTHLY)
                            .includedDates(List.of(
                                "2024-04-14T08:23:07.860Z"))
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
                            .endAt(OffsetDateTime.parse("2022-09-28T20:40:39.448Z"))
                            .excludedDates(List.of(
                                "2024-08-16T03:47:42.531Z",
                                "2024-07-31T22:40:49.363Z"))
                            .frequency(CalendarEventRecurrenceFrequency.DAILY)
                            .includedDates(List.of(
                                "2024-03-11T23:02:06.081Z",
                                "2025-12-17T07:24:18.402Z",
                                "2023-08-05T18:20:39.029Z"))
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
                            .endAt(OffsetDateTime.parse("2026-06-25T08:27:05.493Z"))
                            .excludedDates(List.of(
                                "2023-06-11T07:05:41.247Z",
                                "2023-05-31T13:28:36.370Z"))
                            .frequency(CalendarEventRecurrenceFrequency.WEEKLY)
                            .includedDates(List.of(
                                "2024-03-19T19:50:46.250Z",
                                "2023-08-11T10:50:08.837Z",
                                "2024-09-09T19:50:39.088Z"))
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
                    .startAt(OffsetDateTime.parse("2025-04-08T21:49:01.844Z"))
                    .status(CalendarWebinarStatus.TENTATIVE)
                    .subject("Harum culpa decipio ex cubo ancilla cresco.")
                    .timezone("Europe/Kaliningrad")
                    .updatedAt(OffsetDateTime.parse("2026-08-28T22:23:12.342Z"))
                    .webUrl("https://classic-recovery.biz")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCalendarWebinarResponse res = sdk.webinar().patchCalendarWebinar()
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
                    .endAt(OffsetDateTime.parse("2025-10-03T05:49:51.559Z"))
                    .hasPolls(false)
                    .hasRecording(false)
                    .id("fa0c43f3-d5cc-4ab7-a219-e6b1583dd5d0")
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
                            .endAt(OffsetDateTime.parse("2023-08-22T18:00:43.850Z"))
                            .excludedDates(List.of(
                                "2025-01-23T23:17:02.256Z"))
                            .frequency(CalendarEventRecurrenceFrequency.MONTHLY)
                            .includedDates(List.of(
                                "2024-04-14T08:23:07.860Z"))
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
                            .endAt(OffsetDateTime.parse("2022-09-28T20:40:39.448Z"))
                            .excludedDates(List.of(
                                "2024-08-16T03:47:42.531Z",
                                "2024-07-31T22:40:49.363Z"))
                            .frequency(CalendarEventRecurrenceFrequency.DAILY)
                            .includedDates(List.of(
                                "2024-03-11T23:02:06.081Z",
                                "2025-12-17T07:24:18.402Z",
                                "2023-08-05T18:20:39.029Z"))
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
                            .endAt(OffsetDateTime.parse("2026-06-25T08:27:05.493Z"))
                            .excludedDates(List.of(
                                "2023-06-11T07:05:41.247Z",
                                "2023-05-31T13:28:36.370Z"))
                            .frequency(CalendarEventRecurrenceFrequency.WEEKLY)
                            .includedDates(List.of(
                                "2024-03-19T19:50:46.250Z",
                                "2023-08-11T10:50:08.837Z",
                                "2024-09-09T19:50:39.088Z"))
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
                    .startAt(OffsetDateTime.parse("2025-04-08T21:49:01.844Z"))
                    .status(CalendarWebinarStatus.TENTATIVE)
                    .subject("Harum culpa decipio ex cubo ancilla cresco.")
                    .timezone("Europe/Kaliningrad")
                    .updatedAt(OffsetDateTime.parse("2026-08-28T22:23:12.342Z"))
                    .webUrl("https://classic-recovery.biz")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCalendarWebinarResponse res = sdk.webinar().updateCalendarWebinar()
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