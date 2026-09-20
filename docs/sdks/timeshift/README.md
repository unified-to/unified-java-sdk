# Timeshift

## Overview

### Available Operations

* [createHrisTimeshift](#createhristimeshift) - Create a timeshift
* [getHrisTimeshift](#gethristimeshift) - Retrieve a timeshift
* [listHrisTimeshifts](#listhristimeshifts) - List all timeshifts
* [patchHrisTimeshift](#patchhristimeshift) - Update a timeshift
* [removeHrisTimeshift](#removehristimeshift) - Remove a timeshift
* [updateHrisTimeshift](#updatehristimeshift) - Update a timeshift

## createHrisTimeshift

Create a timeshift

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisTimeshift" method="post" path="/hris/{connection_id}/timeshift" example="hris_timeshift" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisTimeshiftRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisTimeshiftResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisTimeshiftRequest req = CreateHrisTimeshiftRequest.builder()
                .hrisTimeshift(HrisTimeshift.builder()
                    .employeeUserId("<id>")
                    .approvedAt(OffsetDateTime.parse("2023-06-06T17:17:04.209Z"))
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(76761d)
                            .currency("JPY")
                            .frequency(HrisCompensationFrequency.HOUR)
                            .notes("Annus adficio suasoria architecto aggero.")
                            .type(HrisCompensationType.OTHER)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-07-01T23:53:15.738Z"))
                    .endAt(OffsetDateTime.parse("2026-08-27T09:10:29.398Z"))
                    .hours(8d)
                    .id("2a9e24a9-2333-4e3d-952b-fa2d3dccadbc")
                    .isApproved(true)
                    .startAt(OffsetDateTime.parse("2023-06-25T22:36:24.060Z"))
                    .updatedAt(OffsetDateTime.parse("2021-06-23T10:21:04.023Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisTimeshiftResponse res = sdk.timeshift().createHrisTimeshift()
                .request(req)
                .call();

        if (res.hrisTimeshift().isPresent()) {
            System.out.println(res.hrisTimeshift().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateHrisTimeshiftRequest](../../models/operations/CreateHrisTimeshiftRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateHrisTimeshiftResponse](../../models/operations/CreateHrisTimeshiftResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisTimeshift

Retrieve a timeshift

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisTimeshift" method="get" path="/hris/{connection_id}/timeshift/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisTimeshiftRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisTimeshiftResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisTimeshiftRequest req = GetHrisTimeshiftRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisTimeshiftResponse res = sdk.timeshift().getHrisTimeshift()
                .request(req)
                .call();

        if (res.hrisTimeshift().isPresent()) {
            System.out.println(res.hrisTimeshift().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetHrisTimeshiftRequest](../../models/operations/GetHrisTimeshiftRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetHrisTimeshiftResponse](../../models/operations/GetHrisTimeshiftResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisTimeshifts

List all timeshifts

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisTimeshifts" method="get" path="/hris/{connection_id}/timeshift" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisTimeshiftsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisTimeshiftsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisTimeshiftsRequest req = ListHrisTimeshiftsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisTimeshiftsResponse res = sdk.timeshift().listHrisTimeshifts()
                .request(req)
                .call();

        if (res.hrisTimeshifts().isPresent()) {
            System.out.println(res.hrisTimeshifts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListHrisTimeshiftsRequest](../../models/operations/ListHrisTimeshiftsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListHrisTimeshiftsResponse](../../models/operations/ListHrisTimeshiftsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisTimeshift

Update a timeshift

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisTimeshift" method="patch" path="/hris/{connection_id}/timeshift/{id}" example="hris_timeshift" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisTimeshiftRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisTimeshiftResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisTimeshiftRequest req = PatchHrisTimeshiftRequest.builder()
                .hrisTimeshift(HrisTimeshift.builder()
                    .employeeUserId("<id>")
                    .approvedAt(OffsetDateTime.parse("2023-06-06T17:17:04.217Z"))
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(76761d)
                            .currency("JPY")
                            .frequency(HrisCompensationFrequency.HOUR)
                            .notes("Annus adficio suasoria architecto aggero.")
                            .type(HrisCompensationType.OTHER)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-07-01T23:53:15.738Z"))
                    .endAt(OffsetDateTime.parse("2026-08-27T09:10:29.413Z"))
                    .hours(8d)
                    .id("070234fd-0d6a-43d6-8ceb-85737f23a113")
                    .isApproved(true)
                    .startAt(OffsetDateTime.parse("2023-06-25T22:36:24.068Z"))
                    .updatedAt(OffsetDateTime.parse("2021-06-23T10:21:04.027Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisTimeshiftResponse res = sdk.timeshift().patchHrisTimeshift()
                .request(req)
                .call();

        if (res.hrisTimeshift().isPresent()) {
            System.out.println(res.hrisTimeshift().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchHrisTimeshiftRequest](../../models/operations/PatchHrisTimeshiftRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchHrisTimeshiftResponse](../../models/operations/PatchHrisTimeshiftResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisTimeshift

Remove a timeshift

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisTimeshift" method="delete" path="/hris/{connection_id}/timeshift/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTimeshiftRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTimeshiftResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisTimeshiftRequest req = RemoveHrisTimeshiftRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisTimeshiftResponse res = sdk.timeshift().removeHrisTimeshift()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveHrisTimeshiftRequest](../../models/operations/RemoveHrisTimeshiftRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveHrisTimeshiftResponse](../../models/operations/RemoveHrisTimeshiftResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisTimeshift

Update a timeshift

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisTimeshift" method="put" path="/hris/{connection_id}/timeshift/{id}" example="hris_timeshift" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTimeshiftRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTimeshiftResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisTimeshiftRequest req = UpdateHrisTimeshiftRequest.builder()
                .hrisTimeshift(HrisTimeshift.builder()
                    .employeeUserId("<id>")
                    .approvedAt(OffsetDateTime.parse("2023-06-06T17:17:04.217Z"))
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(76761d)
                            .currency("JPY")
                            .frequency(HrisCompensationFrequency.HOUR)
                            .notes("Annus adficio suasoria architecto aggero.")
                            .type(HrisCompensationType.OTHER)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-07-01T23:53:15.738Z"))
                    .endAt(OffsetDateTime.parse("2026-08-27T09:10:29.413Z"))
                    .hours(8d)
                    .id("070234fd-0d6a-43d6-8ceb-85737f23a113")
                    .isApproved(true)
                    .startAt(OffsetDateTime.parse("2023-06-25T22:36:24.068Z"))
                    .updatedAt(OffsetDateTime.parse("2021-06-23T10:21:04.027Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisTimeshiftResponse res = sdk.timeshift().updateHrisTimeshift()
                .request(req)
                .call();

        if (res.hrisTimeshift().isPresent()) {
            System.out.println(res.hrisTimeshift().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateHrisTimeshiftRequest](../../models/operations/UpdateHrisTimeshiftRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateHrisTimeshiftResponse](../../models/operations/UpdateHrisTimeshiftResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |