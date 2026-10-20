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

Create an attendance

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
                    .endAt(OffsetDateTime.parse("2024-04-22T16:42:47.469Z"))
                    .startAt(OffsetDateTime.parse("2021-11-10T23:31:23.656Z"))
                    .address(PropertyHrisAttendanceAddress.builder()
                        .address1("14108 Allie Flats")
                        .city("Kearaborough")
                        .countryCode("US")
                        .postalCode("23844-2344")
                        .region("Tennessee")
                        .regionCode("CA")
                        .build())
                    .approvedAt(OffsetDateTime.parse("2021-09-19T13:30:00.800Z"))
                    .breaks(List.of(
                        HrisAttendanceBreak.builder()
                            .durationMinutes(51d)
                            .endAt(OffsetDateTime.parse("2024-02-13T23:13:43.290Z"))
                            .id("39602a29-deaa-4297-98e3-6b3be818b9b8")
                            .isPaid(false)
                            .name("Lunch")
                            .startAt(OffsetDateTime.parse("2023-10-29T10:39:28.011Z"))
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-08-10T19:43:18.452Z"))
                    .currency("EUR")
                    .declaredTipsAmount(54d)
                    .hourlyRate(16d)
                    .hours(10d)
                    .id("dde200c6-8e6e-4b32-ba10-b3d4f0acae49")
                    .jobName("Human Accountability Administrator")
                    .metadata(List.of())
                    .nonCashTipsAmount(167d)
                    .status(HrisAttendanceStatus.OPEN)
                    .timezone("America/Atikokan")
                    .updatedAt(OffsetDateTime.parse("2022-01-19T18:35:50.750Z"))
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

Retrieve an attendance

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

List all attendances

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

Update an attendance

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
                    .endAt(OffsetDateTime.parse("2024-04-22T16:42:47.481Z"))
                    .startAt(OffsetDateTime.parse("2021-11-10T23:31:23.657Z"))
                    .address(PropertyHrisAttendanceAddress.builder()
                        .address1("14108 Allie Flats")
                        .city("Kearaborough")
                        .countryCode("US")
                        .postalCode("23844-2344")
                        .region("Tennessee")
                        .regionCode("CA")
                        .build())
                    .approvedAt(OffsetDateTime.parse("2021-09-19T13:30:00.800Z"))
                    .breaks(List.of(
                        HrisAttendanceBreak.builder()
                            .durationMinutes(51d)
                            .endAt(OffsetDateTime.parse("2024-02-13T23:13:43.301Z"))
                            .id("4e91765c-ab0d-46cf-8ad2-a8de27909ce5")
                            .isPaid(false)
                            .name("Lunch")
                            .startAt(OffsetDateTime.parse("2023-10-29T10:39:28.021Z"))
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-08-10T19:43:18.452Z"))
                    .currency("EUR")
                    .declaredTipsAmount(54d)
                    .hourlyRate(16d)
                    .hours(10d)
                    .id("764bc9f8-af37-417d-acd8-49db7c2b0efe")
                    .jobName("Human Accountability Administrator")
                    .metadata(List.of())
                    .nonCashTipsAmount(167d)
                    .status(HrisAttendanceStatus.OPEN)
                    .timezone("America/Atikokan")
                    .updatedAt(OffsetDateTime.parse("2022-01-19T18:35:50.752Z"))
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

Remove an attendance

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

Update an attendance

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
                    .endAt(OffsetDateTime.parse("2024-04-22T16:42:47.481Z"))
                    .startAt(OffsetDateTime.parse("2021-11-10T23:31:23.657Z"))
                    .address(PropertyHrisAttendanceAddress.builder()
                        .address1("14108 Allie Flats")
                        .city("Kearaborough")
                        .countryCode("US")
                        .postalCode("23844-2344")
                        .region("Tennessee")
                        .regionCode("CA")
                        .build())
                    .approvedAt(OffsetDateTime.parse("2021-09-19T13:30:00.800Z"))
                    .breaks(List.of(
                        HrisAttendanceBreak.builder()
                            .durationMinutes(51d)
                            .endAt(OffsetDateTime.parse("2024-02-13T23:13:43.301Z"))
                            .id("4e91765c-ab0d-46cf-8ad2-a8de27909ce5")
                            .isPaid(false)
                            .name("Lunch")
                            .startAt(OffsetDateTime.parse("2023-10-29T10:39:28.021Z"))
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-08-10T19:43:18.452Z"))
                    .currency("EUR")
                    .declaredTipsAmount(54d)
                    .hourlyRate(16d)
                    .hours(10d)
                    .id("764bc9f8-af37-417d-acd8-49db7c2b0efe")
                    .jobName("Human Accountability Administrator")
                    .metadata(List.of())
                    .nonCashTipsAmount(167d)
                    .status(HrisAttendanceStatus.OPEN)
                    .timezone("America/Atikokan")
                    .updatedAt(OffsetDateTime.parse("2022-01-19T18:35:50.752Z"))
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