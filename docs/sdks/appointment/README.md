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

Create an appointment

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
                    .id("08420f98-625b-468c-8b52-292405e6614a")
                    .metadata(List.of())
                    .practitionerIds(List.of())
                    .reasons(List.of(
                        HealthcareCode.builder()
                            .code("12762740")
                            .display("cubicularis caput")
                            .system("http://snomed.info/sct")
                            .build()))
                    .serviceTypes(List.of(
                        HealthcareCode.builder()
                            .code("61128108")
                            .display("Annual physical")
                            .system("http://snomed.info/sct")
                            .build()))
                    .slotIds(List.of())
                    .startAt(OffsetDateTime.parse("2023-12-12T12:34:41.451Z"))
                    .status(HealthcareAppointmentStatus.BOOKED)
                    .updatedAt(OffsetDateTime.parse("2025-11-15T00:49:54.429Z"))
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

Retrieve an appointment

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

List all appointments

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

Update an appointment

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
                    .id("408da743-25e7-4143-abe1-bca47ca57f05")
                    .metadata(List.of())
                    .practitionerIds(List.of())
                    .reasons(List.of(
                        HealthcareCode.builder()
                            .code("12762740")
                            .display("cubicularis caput")
                            .system("http://snomed.info/sct")
                            .build()))
                    .serviceTypes(List.of(
                        HealthcareCode.builder()
                            .code("61128108")
                            .display("Annual physical")
                            .system("http://snomed.info/sct")
                            .build()))
                    .slotIds(List.of())
                    .startAt(OffsetDateTime.parse("2023-12-12T12:34:41.451Z"))
                    .status(HealthcareAppointmentStatus.BOOKED)
                    .updatedAt(OffsetDateTime.parse("2025-11-15T00:49:54.438Z"))
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

Remove an appointment

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

Update an appointment

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
                    .id("408da743-25e7-4143-abe1-bca47ca57f05")
                    .metadata(List.of())
                    .practitionerIds(List.of())
                    .reasons(List.of(
                        HealthcareCode.builder()
                            .code("12762740")
                            .display("cubicularis caput")
                            .system("http://snomed.info/sct")
                            .build()))
                    .serviceTypes(List.of(
                        HealthcareCode.builder()
                            .code("61128108")
                            .display("Annual physical")
                            .system("http://snomed.info/sct")
                            .build()))
                    .slotIds(List.of())
                    .startAt(OffsetDateTime.parse("2023-12-12T12:34:41.451Z"))
                    .status(HealthcareAppointmentStatus.BOOKED)
                    .updatedAt(OffsetDateTime.parse("2025-11-15T00:49:54.438Z"))
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