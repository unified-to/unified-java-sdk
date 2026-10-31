# Appointment

## Overview

### Available Operations

* [createHealthcareAppointment](#createhealthcareappointment) - Create an appointment
* [getHealthcareAppointment](#gethealthcareappointment) - Retrieve an appointment
* [listHealthcareAppointments](#listhealthcareappointments) - List all appointments
* [patchHealthcareAppointment](#patchhealthcareappointment) - Update an appointment
* [removeHealthcareAppointment](#removehealthcareappointment) - Remove an appointment
* [updateHealthcareAppointment](#updatehealthcareappointment) - Update an appointment

## createHealthcareAppointment

Creates a HealthcareAppointment. Provide the unified HealthcareAppointment fields in the request body; they are mapped to the provider's API. Returns the created HealthcareAppointment.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHealthcareAppointment" method="post" path="/healthcare/{connection_id}/appointment" example="healthcare_appointment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHealthcareAppointmentRequest;
import to.unified.unified_java_sdk.models.operations.CreateHealthcareAppointmentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHealthcareAppointmentRequest req = CreateHealthcareAppointmentRequest.builder()
                .healthcareAppointment(HealthcareAppointment.builder()
                    .createdAt(OffsetDateTime.parse("2023-04-11T08:16:20.874Z"))
                    .description("clarus aptus cetera")
                    .endAt(OffsetDateTime.parse("2023-12-12T13:04:41.451Z"))
                    .id("fc2f5417-c080-4bbe-976a-02b868f1e6e1")
                    .isVirtual(true)
                    .meetingUrl("https://expensive-slipper.name/")
                    .metadata(List.of())
                    .notes("Stabilis triduana colo casus anser ver alo beatus contabesco amiculum.")
                    .practitionerIds(List.of())
                    .serviceTypes(List.of(
                        HealthcareCode.builder()
                            .code("12762740")
                            .display("New patient visit")
                            .system("http://snomed.info/sct")
                            .build()))
                    .slotIds(List.of())
                    .startAt(OffsetDateTime.parse("2023-12-12T12:34:41.451Z"))
                    .status(HealthcareAppointmentStatus.BOOKED)
                    .updatedAt(OffsetDateTime.parse("2026-10-01T21:49:49.024Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHealthcareAppointmentResponse res = sdk.appointment().createHealthcareAppointment()
                .request(req)
                .call();

        if (res.healthcareAppointment().isPresent()) {
            System.out.println(res.healthcareAppointment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [CreateHealthcareAppointmentRequest](../../models/operations/CreateHealthcareAppointmentRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[CreateHealthcareAppointmentResponse](../../models/operations/CreateHealthcareAppointmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHealthcareAppointment

Retrieves a single HealthcareAppointment by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareAppointment" method="get" path="/healthcare/{connection_id}/appointment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareAppointmentRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareAppointmentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareAppointmentRequest req = GetHealthcareAppointmentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareAppointmentResponse res = sdk.appointment().getHealthcareAppointment()
                .request(req)
                .call();

        if (res.healthcareAppointment().isPresent()) {
            System.out.println(res.healthcareAppointment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetHealthcareAppointmentRequest](../../models/operations/GetHealthcareAppointmentRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetHealthcareAppointmentResponse](../../models/operations/GetHealthcareAppointmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareAppointments

Returns a list of HealthcareAppointments. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareAppointments" method="get" path="/healthcare/{connection_id}/appointment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareAppointmentsRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareAppointmentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareAppointmentsRequest req = ListHealthcareAppointmentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareAppointmentsResponse res = sdk.appointment().listHealthcareAppointments()
                .request(req)
                .call();

        if (res.healthcareAppointments().isPresent()) {
            System.out.println(res.healthcareAppointments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListHealthcareAppointmentsRequest](../../models/operations/ListHealthcareAppointmentsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListHealthcareAppointmentsResponse](../../models/operations/ListHealthcareAppointmentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHealthcareAppointment

Updates the HealthcareAppointment identified by `id`. Provide the unified HealthcareAppointment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHealthcareAppointment" method="patch" path="/healthcare/{connection_id}/appointment/{id}" example="healthcare_appointment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHealthcareAppointmentRequest;
import to.unified.unified_java_sdk.models.operations.PatchHealthcareAppointmentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHealthcareAppointmentRequest req = PatchHealthcareAppointmentRequest.builder()
                .healthcareAppointment(HealthcareAppointment.builder()
                    .createdAt(OffsetDateTime.parse("2023-04-11T08:16:20.874Z"))
                    .description("clarus aptus cetera")
                    .endAt(OffsetDateTime.parse("2023-12-12T13:04:41.451Z"))
                    .id("c4105e1f-041c-4a8e-9d19-a71b18b98bec")
                    .isVirtual(true)
                    .meetingUrl("https://expensive-slipper.name/")
                    .metadata(List.of())
                    .notes("Stabilis triduana colo casus anser ver alo beatus contabesco amiculum.")
                    .practitionerIds(List.of())
                    .serviceTypes(List.of(
                        HealthcareCode.builder()
                            .code("12762740")
                            .display("New patient visit")
                            .system("http://snomed.info/sct")
                            .build()))
                    .slotIds(List.of())
                    .startAt(OffsetDateTime.parse("2023-12-12T12:34:41.451Z"))
                    .status(HealthcareAppointmentStatus.BOOKED)
                    .updatedAt(OffsetDateTime.parse("2026-10-01T21:49:49.046Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHealthcareAppointmentResponse res = sdk.appointment().patchHealthcareAppointment()
                .request(req)
                .call();

        if (res.healthcareAppointment().isPresent()) {
            System.out.println(res.healthcareAppointment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [PatchHealthcareAppointmentRequest](../../models/operations/PatchHealthcareAppointmentRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[PatchHealthcareAppointmentResponse](../../models/operations/PatchHealthcareAppointmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHealthcareAppointment

Deletes the HealthcareAppointment identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHealthcareAppointment" method="delete" path="/healthcare/{connection_id}/appointment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHealthcareAppointmentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHealthcareAppointmentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHealthcareAppointmentRequest req = RemoveHealthcareAppointmentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHealthcareAppointmentResponse res = sdk.appointment().removeHealthcareAppointment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [RemoveHealthcareAppointmentRequest](../../models/operations/RemoveHealthcareAppointmentRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[RemoveHealthcareAppointmentResponse](../../models/operations/RemoveHealthcareAppointmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHealthcareAppointment

Updates the HealthcareAppointment identified by `id`. Provide the unified HealthcareAppointment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHealthcareAppointment" method="put" path="/healthcare/{connection_id}/appointment/{id}" example="healthcare_appointment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHealthcareAppointmentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHealthcareAppointmentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHealthcareAppointmentRequest req = UpdateHealthcareAppointmentRequest.builder()
                .healthcareAppointment(HealthcareAppointment.builder()
                    .createdAt(OffsetDateTime.parse("2023-04-11T08:16:20.874Z"))
                    .description("clarus aptus cetera")
                    .endAt(OffsetDateTime.parse("2023-12-12T13:04:41.451Z"))
                    .id("c4105e1f-041c-4a8e-9d19-a71b18b98bec")
                    .isVirtual(true)
                    .meetingUrl("https://expensive-slipper.name/")
                    .metadata(List.of())
                    .notes("Stabilis triduana colo casus anser ver alo beatus contabesco amiculum.")
                    .practitionerIds(List.of())
                    .serviceTypes(List.of(
                        HealthcareCode.builder()
                            .code("12762740")
                            .display("New patient visit")
                            .system("http://snomed.info/sct")
                            .build()))
                    .slotIds(List.of())
                    .startAt(OffsetDateTime.parse("2023-12-12T12:34:41.451Z"))
                    .status(HealthcareAppointmentStatus.BOOKED)
                    .updatedAt(OffsetDateTime.parse("2026-10-01T21:49:49.046Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHealthcareAppointmentResponse res = sdk.appointment().updateHealthcareAppointment()
                .request(req)
                .call();

        if (res.healthcareAppointment().isPresent()) {
            System.out.println(res.healthcareAppointment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UpdateHealthcareAppointmentRequest](../../models/operations/UpdateHealthcareAppointmentRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateHealthcareAppointmentResponse](../../models/operations/UpdateHealthcareAppointmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |