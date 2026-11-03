# Attendance

## Overview

### Available Operations

* [createHrisAttendance](#createhrisattendance) - Create an attendance
* [getHrisAttendance](#gethrisattendance) - Retrieve an attendance
* [listHrisAttendances](#listhrisattendances) - List all attendances
* [patchHrisAttendance](#patchhrisattendance) - Update an attendance
* [removeHrisAttendance](#removehrisattendance) - Remove an attendance
* [updateHrisAttendance](#updatehrisattendance) - Update an attendance

## createHrisAttendance

Creates a HrisAttendance. Provide the unified HrisAttendance fields in the request body; they are mapped to the provider's API. Returns the created HrisAttendance.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisAttendance" method="post" path="/hris/{connection_id}/attendance" example="hris_attendance" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisAttendanceRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisAttendanceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisAttendanceRequest req = CreateHrisAttendanceRequest.builder()
                .hrisAttendance(HrisAttendance.builder()
                    .employeeUserId("<id>")
                    .endAt(OffsetDateTime.parse("2024-04-30T02:16:58.258Z"))
                    .startAt(OffsetDateTime.parse("2021-11-11T16:07:20.063Z"))
                    .address(PropertyHrisAttendanceAddress.builder()
                        .address1("14108 Allie Flats")
                        .city("Kearaborough")
                        .countryCode("US")
                        .postalCode("23844-2344")
                        .region("Tennessee")
                        .regionCode("CA")
                        .build())
                    .approvedAt(OffsetDateTime.parse("2021-09-19T20:39:29.104Z"))
                    .breaks(List.of(
                        HrisAttendanceBreak.builder()
                            .durationMinutes(51d)
                            .endAt(OffsetDateTime.parse("2024-02-20T20:25:09.832Z"))
                            .id("be7a6cd7-1605-428d-9056-47add4bc0532")
                            .isPaid(false)
                            .name("Lunch")
                            .startAt(OffsetDateTime.parse("2023-11-04T12:28:55.074Z"))
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-08-10T19:43:18.452Z"))
                    .currency("EUR")
                    .declaredTipsAmount(54d)
                    .hourlyRate(16d)
                    .hours(10d)
                    .id("2c1e92ac-c269-42ea-a50d-beb3c7c69eed")
                    .jobName("Human Accountability Administrator")
                    .metadata(List.of())
                    .nonCashTipsAmount(167d)
                    .status(HrisAttendanceStatus.OPEN)
                    .timezone("America/Atikokan")
                    .updatedAt(OffsetDateTime.parse("2022-01-20T23:46:02.762Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisAttendanceResponse res = sdk.attendance().createHrisAttendance()
                .request(req)
                .call();

        if (res.hrisAttendance().isPresent()) {
            System.out.println(res.hrisAttendance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateHrisAttendanceRequest](../../models/operations/CreateHrisAttendanceRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateHrisAttendanceResponse](../../models/operations/CreateHrisAttendanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisAttendance

Retrieves a single HrisAttendance by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisAttendance" method="get" path="/hris/{connection_id}/attendance/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisAttendanceRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisAttendanceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisAttendanceRequest req = GetHrisAttendanceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisAttendanceResponse res = sdk.attendance().getHrisAttendance()
                .request(req)
                .call();

        if (res.hrisAttendance().isPresent()) {
            System.out.println(res.hrisAttendance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetHrisAttendanceRequest](../../models/operations/GetHrisAttendanceRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetHrisAttendanceResponse](../../models/operations/GetHrisAttendanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisAttendances

Returns a list of HrisAttendances. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisAttendances" method="get" path="/hris/{connection_id}/attendance" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisAttendancesRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisAttendancesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisAttendancesRequest req = ListHrisAttendancesRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisAttendancesResponse res = sdk.attendance().listHrisAttendances()
                .request(req)
                .call();

        if (res.hrisAttendances().isPresent()) {
            System.out.println(res.hrisAttendances().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListHrisAttendancesRequest](../../models/operations/ListHrisAttendancesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListHrisAttendancesResponse](../../models/operations/ListHrisAttendancesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisAttendance

Updates the HrisAttendance identified by `id`. Provide the unified HrisAttendance fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisAttendance" method="patch" path="/hris/{connection_id}/attendance/{id}" example="hris_attendance" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisAttendanceRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisAttendanceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisAttendanceRequest req = PatchHrisAttendanceRequest.builder()
                .hrisAttendance(HrisAttendance.builder()
                    .employeeUserId("<id>")
                    .endAt(OffsetDateTime.parse("2024-04-30T02:16:58.268Z"))
                    .startAt(OffsetDateTime.parse("2021-11-11T16:07:20.063Z"))
                    .address(PropertyHrisAttendanceAddress.builder()
                        .address1("14108 Allie Flats")
                        .city("Kearaborough")
                        .countryCode("US")
                        .postalCode("23844-2344")
                        .region("Tennessee")
                        .regionCode("CA")
                        .build())
                    .approvedAt(OffsetDateTime.parse("2021-09-19T20:39:29.104Z"))
                    .breaks(List.of(
                        HrisAttendanceBreak.builder()
                            .durationMinutes(51d)
                            .endAt(OffsetDateTime.parse("2024-02-20T20:25:09.841Z"))
                            .id("800f823a-cf5e-4d85-a687-6c98fa51af0a")
                            .isPaid(false)
                            .name("Lunch")
                            .startAt(OffsetDateTime.parse("2023-11-04T12:28:55.082Z"))
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-08-10T19:43:18.452Z"))
                    .currency("EUR")
                    .declaredTipsAmount(54d)
                    .hourlyRate(16d)
                    .hours(10d)
                    .id("c3cce3c4-cb18-43b5-b7e7-4a529824c3e8")
                    .jobName("Human Accountability Administrator")
                    .metadata(List.of())
                    .nonCashTipsAmount(167d)
                    .status(HrisAttendanceStatus.OPEN)
                    .timezone("America/Atikokan")
                    .updatedAt(OffsetDateTime.parse("2022-01-20T23:46:02.764Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisAttendanceResponse res = sdk.attendance().patchHrisAttendance()
                .request(req)
                .call();

        if (res.hrisAttendance().isPresent()) {
            System.out.println(res.hrisAttendance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchHrisAttendanceRequest](../../models/operations/PatchHrisAttendanceRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchHrisAttendanceResponse](../../models/operations/PatchHrisAttendanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisAttendance

Deletes the HrisAttendance identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisAttendance" method="delete" path="/hris/{connection_id}/attendance/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisAttendanceRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisAttendanceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisAttendanceRequest req = RemoveHrisAttendanceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisAttendanceResponse res = sdk.attendance().removeHrisAttendance()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveHrisAttendanceRequest](../../models/operations/RemoveHrisAttendanceRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveHrisAttendanceResponse](../../models/operations/RemoveHrisAttendanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisAttendance

Updates the HrisAttendance identified by `id`. Provide the unified HrisAttendance fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisAttendance" method="put" path="/hris/{connection_id}/attendance/{id}" example="hris_attendance" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisAttendanceRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisAttendanceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisAttendanceRequest req = UpdateHrisAttendanceRequest.builder()
                .hrisAttendance(HrisAttendance.builder()
                    .employeeUserId("<id>")
                    .endAt(OffsetDateTime.parse("2024-04-30T02:16:58.268Z"))
                    .startAt(OffsetDateTime.parse("2021-11-11T16:07:20.063Z"))
                    .address(PropertyHrisAttendanceAddress.builder()
                        .address1("14108 Allie Flats")
                        .city("Kearaborough")
                        .countryCode("US")
                        .postalCode("23844-2344")
                        .region("Tennessee")
                        .regionCode("CA")
                        .build())
                    .approvedAt(OffsetDateTime.parse("2021-09-19T20:39:29.104Z"))
                    .breaks(List.of(
                        HrisAttendanceBreak.builder()
                            .durationMinutes(51d)
                            .endAt(OffsetDateTime.parse("2024-02-20T20:25:09.841Z"))
                            .id("800f823a-cf5e-4d85-a687-6c98fa51af0a")
                            .isPaid(false)
                            .name("Lunch")
                            .startAt(OffsetDateTime.parse("2023-11-04T12:28:55.082Z"))
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-08-10T19:43:18.452Z"))
                    .currency("EUR")
                    .declaredTipsAmount(54d)
                    .hourlyRate(16d)
                    .hours(10d)
                    .id("c3cce3c4-cb18-43b5-b7e7-4a529824c3e8")
                    .jobName("Human Accountability Administrator")
                    .metadata(List.of())
                    .nonCashTipsAmount(167d)
                    .status(HrisAttendanceStatus.OPEN)
                    .timezone("America/Atikokan")
                    .updatedAt(OffsetDateTime.parse("2022-01-20T23:46:02.764Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisAttendanceResponse res = sdk.attendance().updateHrisAttendance()
                .request(req)
                .call();

        if (res.hrisAttendance().isPresent()) {
            System.out.println(res.hrisAttendance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateHrisAttendanceRequest](../../models/operations/UpdateHrisAttendanceRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateHrisAttendanceResponse](../../models/operations/UpdateHrisAttendanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |