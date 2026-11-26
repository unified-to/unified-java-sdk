# Appointment

## Overview

### Available Operations

* [createDmsAppointment](#createdmsappointment) - Create an appointment
* [createHealthcareAppointment](#createhealthcareappointment) - Create an appointment
* [getDmsAppointment](#getdmsappointment) - Retrieve an appointment
* [getHealthcareAppointment](#gethealthcareappointment) - Retrieve an appointment
* [listDmsAppointments](#listdmsappointments) - List all appointments
* [listHealthcareAppointments](#listhealthcareappointments) - List all appointments
* [patchDmsAppointment](#patchdmsappointment) - Update an appointment
* [patchHealthcareAppointment](#patchhealthcareappointment) - Update an appointment
* [removeDmsAppointment](#removedmsappointment) - Remove an appointment
* [removeHealthcareAppointment](#removehealthcareappointment) - Remove an appointment
* [updateDmsAppointment](#updatedmsappointment) - Update an appointment
* [updateHealthcareAppointment](#updatehealthcareappointment) - Update an appointment

## createDmsAppointment

Creates a DmsAppointment. Provide the unified DmsAppointment fields in the request body; they are mapped to the provider's API. Returns the created DmsAppointment.

### Example Usage

<!-- UsageSnippet language="java" operationID="createDmsAppointment" method="post" path="/dms/{connection_id}/appointment" example="dms_appointment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDmsAppointmentRequest;
import to.unified.unified_java_sdk.models.operations.CreateDmsAppointmentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDmsAppointmentRequest req = CreateDmsAppointmentRequest.builder()
                .dmsAppointment(DmsAppointment.builder()
                    .createdAt(OffsetDateTime.parse("2023-10-16T02:56:45.127Z"))
                    .endAt(OffsetDateTime.parse("2026-05-07T05:40:17.756Z"))
                    .id("c92f476f-2260-477b-beb8-316bc5b80242")
                    .metadata(List.of())
                    .notes("Soluta conitor timidus confero.")
                    .number("A541909")
                    .services(List.of(
                        DmsAppointmentService.builder()
                            .id("7efbb82e-3e7e-419d-b40e-7791bd8c7c80")
                            .name("Customer concern")
                            .payType(PayType.WARRANTY)
                            .technicianUserIds(List.of())
                            .build(),
                        DmsAppointmentService.builder()
                            .complaint("Check engine light on")
                            .id("59a76327-b15c-4865-a6e3-9eeb50b88eb1")
                            .name("Customer concern")
                            .payType(PayType.CUSTOMER)
                            .technicianUserIds(List.of())
                            .build(),
                        DmsAppointmentService.builder()
                            .complaint("Due for service")
                            .id("6da55cee-c2f1-4f79-a371-201baef91f12")
                            .name("Customer concern")
                            .payType(PayType.CUSTOMER)
                            .technicianUserIds(List.of())
                            .build()))
                    .startAt(OffsetDateTime.parse("2026-05-06T22:40:17.756Z"))
                    .status(DmsAppointmentStatus.CANCELLED)
                    .transportType(TransportType.LOANER)
                    .updatedAt(OffsetDateTime.parse("2025-04-06T04:24:35.485Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateDmsAppointmentResponse res = sdk.appointment().createDmsAppointment()
                .request(req)
                .call();

        if (res.dmsAppointment().isPresent()) {
            System.out.println(res.dmsAppointment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateDmsAppointmentRequest](../../models/operations/CreateDmsAppointmentRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateDmsAppointmentResponse](../../models/operations/CreateDmsAppointmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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
                    .description("cubicularis caput viriliter")
                    .endAt(OffsetDateTime.parse("2023-12-12T13:04:41.451Z"))
                    .id("0e96c02e-9be8-4ca3-b032-cccbf1f9844b")
                    .isVirtual(true)
                    .meetingUrl("https://cautious-cannon.com/")
                    .metadata(List.of())
                    .notes("Casus anser ver alo beatus.")
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
                    .updatedAt(OffsetDateTime.parse("2026-10-27T09:07:08.802Z"))
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

## getDmsAppointment

Retrieves a single DmsAppointment by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getDmsAppointment" method="get" path="/dms/{connection_id}/appointment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetDmsAppointmentRequest;
import to.unified.unified_java_sdk.models.operations.GetDmsAppointmentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetDmsAppointmentRequest req = GetDmsAppointmentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetDmsAppointmentResponse res = sdk.appointment().getDmsAppointment()
                .request(req)
                .call();

        if (res.dmsAppointment().isPresent()) {
            System.out.println(res.dmsAppointment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetDmsAppointmentRequest](../../models/operations/GetDmsAppointmentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetDmsAppointmentResponse](../../models/operations/GetDmsAppointmentResponse.md)**

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

## listDmsAppointments

Returns a list of DmsAppointments. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listDmsAppointments" method="get" path="/dms/{connection_id}/appointment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListDmsAppointmentsRequest;
import to.unified.unified_java_sdk.models.operations.ListDmsAppointmentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListDmsAppointmentsRequest req = ListDmsAppointmentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListDmsAppointmentsResponse res = sdk.appointment().listDmsAppointments()
                .request(req)
                .call();

        if (res.dmsAppointments().isPresent()) {
            System.out.println(res.dmsAppointments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListDmsAppointmentsRequest](../../models/operations/ListDmsAppointmentsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListDmsAppointmentsResponse](../../models/operations/ListDmsAppointmentsResponse.md)**

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

## patchDmsAppointment

Updates the DmsAppointment identified by `id`. Provide the unified DmsAppointment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchDmsAppointment" method="patch" path="/dms/{connection_id}/appointment/{id}" example="dms_appointment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchDmsAppointmentRequest;
import to.unified.unified_java_sdk.models.operations.PatchDmsAppointmentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchDmsAppointmentRequest req = PatchDmsAppointmentRequest.builder()
                .dmsAppointment(DmsAppointment.builder()
                    .createdAt(OffsetDateTime.parse("2023-10-16T02:56:45.127Z"))
                    .endAt(OffsetDateTime.parse("2026-05-07T05:40:17.772Z"))
                    .id("42f40e5c-7c5f-4a1e-82b2-f64e9a254421")
                    .metadata(List.of())
                    .notes("Soluta conitor timidus confero.")
                    .number("A541909")
                    .services(List.of(
                        DmsAppointmentService.builder()
                            .id("72e1eaed-c18d-4f1f-a2d4-0dc1ff6a43c7")
                            .name("Customer concern")
                            .payType(PayType.WARRANTY)
                            .technicianUserIds(List.of())
                            .build(),
                        DmsAppointmentService.builder()
                            .complaint("Check engine light on")
                            .id("16a97e58-0dd0-4eac-909c-c032f5e5c578")
                            .name("Customer concern")
                            .payType(PayType.CUSTOMER)
                            .technicianUserIds(List.of())
                            .build(),
                        DmsAppointmentService.builder()
                            .complaint("Due for service")
                            .id("c438b9be-c014-4440-a531-c4c09cf47421")
                            .name("Customer concern")
                            .payType(PayType.CUSTOMER)
                            .technicianUserIds(List.of())
                            .build()))
                    .startAt(OffsetDateTime.parse("2026-05-06T22:40:17.772Z"))
                    .status(DmsAppointmentStatus.CANCELLED)
                    .transportType(TransportType.LOANER)
                    .updatedAt(OffsetDateTime.parse("2025-04-06T04:24:35.494Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDmsAppointmentResponse res = sdk.appointment().patchDmsAppointment()
                .request(req)
                .call();

        if (res.dmsAppointment().isPresent()) {
            System.out.println(res.dmsAppointment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchDmsAppointmentRequest](../../models/operations/PatchDmsAppointmentRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchDmsAppointmentResponse](../../models/operations/PatchDmsAppointmentResponse.md)**

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
                    .description("cubicularis caput viriliter")
                    .endAt(OffsetDateTime.parse("2023-12-12T13:04:41.451Z"))
                    .id("f30e3944-1bb7-45c6-9a1a-459fbdbbef14")
                    .isVirtual(true)
                    .meetingUrl("https://cautious-cannon.com/")
                    .metadata(List.of())
                    .notes("Casus anser ver alo beatus.")
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
                    .updatedAt(OffsetDateTime.parse("2026-10-27T09:07:08.814Z"))
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

## removeDmsAppointment

Deletes the DmsAppointment identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeDmsAppointment" method="delete" path="/dms/{connection_id}/appointment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveDmsAppointmentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveDmsAppointmentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveDmsAppointmentRequest req = RemoveDmsAppointmentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveDmsAppointmentResponse res = sdk.appointment().removeDmsAppointment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveDmsAppointmentRequest](../../models/operations/RemoveDmsAppointmentRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveDmsAppointmentResponse](../../models/operations/RemoveDmsAppointmentResponse.md)**

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

## updateDmsAppointment

Updates the DmsAppointment identified by `id`. Provide the unified DmsAppointment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateDmsAppointment" method="put" path="/dms/{connection_id}/appointment/{id}" example="dms_appointment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateDmsAppointmentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateDmsAppointmentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateDmsAppointmentRequest req = UpdateDmsAppointmentRequest.builder()
                .dmsAppointment(DmsAppointment.builder()
                    .createdAt(OffsetDateTime.parse("2023-10-16T02:56:45.127Z"))
                    .endAt(OffsetDateTime.parse("2026-05-07T05:40:17.772Z"))
                    .id("42f40e5c-7c5f-4a1e-82b2-f64e9a254421")
                    .metadata(List.of())
                    .notes("Soluta conitor timidus confero.")
                    .number("A541909")
                    .services(List.of(
                        DmsAppointmentService.builder()
                            .id("72e1eaed-c18d-4f1f-a2d4-0dc1ff6a43c7")
                            .name("Customer concern")
                            .payType(PayType.WARRANTY)
                            .technicianUserIds(List.of())
                            .build(),
                        DmsAppointmentService.builder()
                            .complaint("Check engine light on")
                            .id("16a97e58-0dd0-4eac-909c-c032f5e5c578")
                            .name("Customer concern")
                            .payType(PayType.CUSTOMER)
                            .technicianUserIds(List.of())
                            .build(),
                        DmsAppointmentService.builder()
                            .complaint("Due for service")
                            .id("c438b9be-c014-4440-a531-c4c09cf47421")
                            .name("Customer concern")
                            .payType(PayType.CUSTOMER)
                            .technicianUserIds(List.of())
                            .build()))
                    .startAt(OffsetDateTime.parse("2026-05-06T22:40:17.772Z"))
                    .status(DmsAppointmentStatus.CANCELLED)
                    .transportType(TransportType.LOANER)
                    .updatedAt(OffsetDateTime.parse("2025-04-06T04:24:35.494Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDmsAppointmentResponse res = sdk.appointment().updateDmsAppointment()
                .request(req)
                .call();

        if (res.dmsAppointment().isPresent()) {
            System.out.println(res.dmsAppointment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateDmsAppointmentRequest](../../models/operations/UpdateDmsAppointmentRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateDmsAppointmentResponse](../../models/operations/UpdateDmsAppointmentResponse.md)**

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
                    .description("cubicularis caput viriliter")
                    .endAt(OffsetDateTime.parse("2023-12-12T13:04:41.451Z"))
                    .id("f30e3944-1bb7-45c6-9a1a-459fbdbbef14")
                    .isVirtual(true)
                    .meetingUrl("https://cautious-cannon.com/")
                    .metadata(List.of())
                    .notes("Casus anser ver alo beatus.")
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
                    .updatedAt(OffsetDateTime.parse("2026-10-27T09:07:08.814Z"))
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