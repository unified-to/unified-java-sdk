# Healthcare

## Overview

### Available Operations

* [createHealthcareAppointment](#createhealthcareappointment) - Create an appointment
* [createHealthcareObservation](#createhealthcareobservation) - Create an observation
* [createHealthcarePatient](#createhealthcarepatient) - Create a patient
* [getHealthcareAllergy](#gethealthcareallergy) - Retrieve an allergy
* [getHealthcareAppointment](#gethealthcareappointment) - Retrieve an appointment
* [getHealthcareCondition](#gethealthcarecondition) - Retrieve a condition
* [getHealthcareEncounter](#gethealthcareencounter) - Retrieve an encounter
* [getHealthcareImmunization](#gethealthcareimmunization) - Retrieve an immunization
* [getHealthcareLocation](#gethealthcarelocation) - Retrieve a location
* [getHealthcareMedication](#gethealthcaremedication) - Retrieve a medication
* [getHealthcareObservation](#gethealthcareobservation) - Retrieve an observation
* [getHealthcarePatient](#gethealthcarepatient) - Retrieve a patient
* [getHealthcarePractitioner](#gethealthcarepractitioner) - Retrieve a practitioner
* [getHealthcareSlot](#gethealthcareslot) - Retrieve a slot
* [listHealthcareAllergies](#listhealthcareallergies) - List all allergies
* [listHealthcareAppointments](#listhealthcareappointments) - List all appointments
* [listHealthcareConditions](#listhealthcareconditions) - List all conditions
* [listHealthcareEncounters](#listhealthcareencounters) - List all encounters
* [listHealthcareImmunizations](#listhealthcareimmunizations) - List all immunizations
* [listHealthcareLocations](#listhealthcarelocations) - List all locations
* [listHealthcareMedications](#listhealthcaremedications) - List all medications
* [listHealthcareObservations](#listhealthcareobservations) - List all observations
* [listHealthcarePatients](#listhealthcarepatients) - List all patients
* [listHealthcarePractitioners](#listhealthcarepractitioners) - List all practitioners
* [listHealthcareSlots](#listhealthcareslots) - List all slots
* [patchHealthcareAppointment](#patchhealthcareappointment) - Update an appointment
* [patchHealthcarePatient](#patchhealthcarepatient) - Update a patient
* [removeHealthcareAppointment](#removehealthcareappointment) - Remove an appointment
* [updateHealthcareAppointment](#updatehealthcareappointment) - Update an appointment
* [updateHealthcarePatient](#updatehealthcarepatient) - Update a patient

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
                    .id("fa2af286-94f0-4d68-98ef-143792930dd3")
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
                    .updatedAt(OffsetDateTime.parse("2025-11-19T10:42:49.589Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHealthcareAppointmentResponse res = sdk.healthcare().createHealthcareAppointment()
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

## createHealthcareObservation

Create an observation

### Example Usage

<!-- UsageSnippet language="java" operationID="createHealthcareObservation" method="post" path="/healthcare/{connection_id}/observation" example="healthcare_observation" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHealthcareObservationRequest;
import to.unified.unified_java_sdk.models.operations.CreateHealthcareObservationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHealthcareObservationRequest req = CreateHealthcareObservationRequest.builder()
                .healthcareObservation(HealthcareObservation.builder()
                    .codes(List.of(
                        HealthcareCode.builder()
                            .code("85354-9")
                            .display("Blood pressure panel")
                            .system("http://loinc.org")
                            .build()))
                    .components(List.of(
                        HealthcareObservationComponent.builder()
                            .codes(List.of(
                                HealthcareCode.builder()
                                    .code("8480-6")
                                    .system("http://loinc.org")
                                    .build()))
                            .name("Systolic blood pressure")
                            .valueNumber(103d)
                            .valueUnit("mm[Hg]")
                            .build(),
                        HealthcareObservationComponent.builder()
                            .codes(List.of(
                                HealthcareCode.builder()
                                    .code("8462-4")
                                    .system("http://loinc.org")
                                    .build()))
                            .name("Diastolic blood pressure")
                            .valueNumber(60d)
                            .valueUnit("mm[Hg]")
                            .build()))
                    .createdAt(OffsetDateTime.parse("2022-12-06T21:34:04.293Z"))
                    .id("794dab20-5698-4ab2-88b3-d69893661fe6")
                    .interpretation(Interpretation.CRITICAL_HIGH)
                    .issuedAt(OffsetDateTime.parse("2025-05-11T10:30:48.202Z"))
                    .metadata(List.of())
                    .name("Blood pressure panel")
                    .observedAt(OffsetDateTime.parse("2025-01-20T04:01:26.330Z"))
                    .status(HealthcareObservationStatus.CORRECTED)
                    .type(HealthcareObservationType.VITAL_SIGNS)
                    .updatedAt(OffsetDateTime.parse("2026-03-24T06:26:26.131Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHealthcareObservationResponse res = sdk.healthcare().createHealthcareObservation()
                .request(req)
                .call();

        if (res.healthcareObservation().isPresent()) {
            System.out.println(res.healthcareObservation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [CreateHealthcareObservationRequest](../../models/operations/CreateHealthcareObservationRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[CreateHealthcareObservationResponse](../../models/operations/CreateHealthcareObservationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHealthcarePatient

Create a patient

### Example Usage

<!-- UsageSnippet language="java" operationID="createHealthcarePatient" method="post" path="/healthcare/{connection_id}/patient" example="healthcare_patient" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHealthcarePatientRequest;
import to.unified.unified_java_sdk.models.operations.CreateHealthcarePatientResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHealthcarePatientRequest req = CreateHealthcarePatientRequest.builder()
                .healthcarePatient(HealthcarePatient.builder()
                    .address(PropertyHealthcarePatientAddress.builder()
                        .address1("162 Kirlin Mall")
                        .city("Dickinsonborough")
                        .country("US")
                        .postalCode("54031")
                        .region("Nebraska")
                        .build())
                    .birthdate("2025-02-12")
                    .createdAt(OffsetDateTime.parse("2021-06-05T21:08:04.917Z"))
                    .emails(List.of(
                        HealthcareEmail.builder()
                            .email("alejandrin.parker@icloud.com")
                            .type(HealthcareEmailType.HOME)
                            .build()))
                    .firstName("Alejandrin")
                    .gender(HealthcarePatientGender.FEMALE)
                    .id("4383aad9-fa06-4c66-bd8d-fd3c0afdc4cb")
                    .identifiers(List.of(
                        HealthcareIdentifier.builder()
                            .value("57992636")
                            .type(HealthcareIdentifierType.MRN)
                            .build()))
                    .isActive(true)
                    .isDeceased(false)
                    .language("zh")
                    .lastName("Parker")
                    .metadata(List.of())
                    .name("Alejandrin Parker")
                    .practitionerIds(List.of())
                    .telephones(List.of(
                        HealthcareTelephone.builder()
                            .telephone("1-219-555-9023 x08295")
                            .type(HealthcareTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2026-06-22T20:20:27.639Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHealthcarePatientResponse res = sdk.healthcare().createHealthcarePatient()
                .request(req)
                .call();

        if (res.healthcarePatient().isPresent()) {
            System.out.println(res.healthcarePatient().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateHealthcarePatientRequest](../../models/operations/CreateHealthcarePatientRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateHealthcarePatientResponse](../../models/operations/CreateHealthcarePatientResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHealthcareAllergy

Retrieve an allergy

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareAllergy" method="get" path="/healthcare/{connection_id}/allergy/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareAllergyRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareAllergyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareAllergyRequest req = GetHealthcareAllergyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareAllergyResponse res = sdk.healthcare().getHealthcareAllergy()
                .request(req)
                .call();

        if (res.healthcareAllergy().isPresent()) {
            System.out.println(res.healthcareAllergy().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetHealthcareAllergyRequest](../../models/operations/GetHealthcareAllergyRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetHealthcareAllergyResponse](../../models/operations/GetHealthcareAllergyResponse.md)**

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

        GetHealthcareAppointmentResponse res = sdk.healthcare().getHealthcareAppointment()
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

## getHealthcareCondition

Retrieve a condition

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareCondition" method="get" path="/healthcare/{connection_id}/condition/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareConditionRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareConditionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareConditionRequest req = GetHealthcareConditionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareConditionResponse res = sdk.healthcare().getHealthcareCondition()
                .request(req)
                .call();

        if (res.healthcareCondition().isPresent()) {
            System.out.println(res.healthcareCondition().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetHealthcareConditionRequest](../../models/operations/GetHealthcareConditionRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetHealthcareConditionResponse](../../models/operations/GetHealthcareConditionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHealthcareEncounter

Retrieve an encounter

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareEncounter" method="get" path="/healthcare/{connection_id}/encounter/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareEncounterRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareEncounterResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareEncounterRequest req = GetHealthcareEncounterRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareEncounterResponse res = sdk.healthcare().getHealthcareEncounter()
                .request(req)
                .call();

        if (res.healthcareEncounter().isPresent()) {
            System.out.println(res.healthcareEncounter().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetHealthcareEncounterRequest](../../models/operations/GetHealthcareEncounterRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetHealthcareEncounterResponse](../../models/operations/GetHealthcareEncounterResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHealthcareImmunization

Retrieve an immunization

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareImmunization" method="get" path="/healthcare/{connection_id}/immunization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareImmunizationRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareImmunizationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareImmunizationRequest req = GetHealthcareImmunizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareImmunizationResponse res = sdk.healthcare().getHealthcareImmunization()
                .request(req)
                .call();

        if (res.healthcareImmunization().isPresent()) {
            System.out.println(res.healthcareImmunization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetHealthcareImmunizationRequest](../../models/operations/GetHealthcareImmunizationRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetHealthcareImmunizationResponse](../../models/operations/GetHealthcareImmunizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHealthcareLocation

Retrieve a location

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareLocation" method="get" path="/healthcare/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareLocationRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareLocationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareLocationRequest req = GetHealthcareLocationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareLocationResponse res = sdk.healthcare().getHealthcareLocation()
                .request(req)
                .call();

        if (res.healthcareLocation().isPresent()) {
            System.out.println(res.healthcareLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetHealthcareLocationRequest](../../models/operations/GetHealthcareLocationRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetHealthcareLocationResponse](../../models/operations/GetHealthcareLocationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHealthcareMedication

Retrieve a medication

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareMedication" method="get" path="/healthcare/{connection_id}/medication/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareMedicationRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareMedicationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareMedicationRequest req = GetHealthcareMedicationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareMedicationResponse res = sdk.healthcare().getHealthcareMedication()
                .request(req)
                .call();

        if (res.healthcareMedication().isPresent()) {
            System.out.println(res.healthcareMedication().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetHealthcareMedicationRequest](../../models/operations/GetHealthcareMedicationRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetHealthcareMedicationResponse](../../models/operations/GetHealthcareMedicationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHealthcareObservation

Retrieve an observation

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareObservation" method="get" path="/healthcare/{connection_id}/observation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareObservationRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareObservationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareObservationRequest req = GetHealthcareObservationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareObservationResponse res = sdk.healthcare().getHealthcareObservation()
                .request(req)
                .call();

        if (res.healthcareObservation().isPresent()) {
            System.out.println(res.healthcareObservation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetHealthcareObservationRequest](../../models/operations/GetHealthcareObservationRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetHealthcareObservationResponse](../../models/operations/GetHealthcareObservationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHealthcarePatient

Retrieve a patient

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcarePatient" method="get" path="/healthcare/{connection_id}/patient/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcarePatientRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcarePatientResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcarePatientRequest req = GetHealthcarePatientRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcarePatientResponse res = sdk.healthcare().getHealthcarePatient()
                .request(req)
                .call();

        if (res.healthcarePatient().isPresent()) {
            System.out.println(res.healthcarePatient().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetHealthcarePatientRequest](../../models/operations/GetHealthcarePatientRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetHealthcarePatientResponse](../../models/operations/GetHealthcarePatientResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHealthcarePractitioner

Retrieve a practitioner

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcarePractitioner" method="get" path="/healthcare/{connection_id}/practitioner/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcarePractitionerRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcarePractitionerResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcarePractitionerRequest req = GetHealthcarePractitionerRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcarePractitionerResponse res = sdk.healthcare().getHealthcarePractitioner()
                .request(req)
                .call();

        if (res.healthcarePractitioner().isPresent()) {
            System.out.println(res.healthcarePractitioner().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetHealthcarePractitionerRequest](../../models/operations/GetHealthcarePractitionerRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetHealthcarePractitionerResponse](../../models/operations/GetHealthcarePractitionerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHealthcareSlot

Retrieve a slot

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareSlot" method="get" path="/healthcare/{connection_id}/slot/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareSlotRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareSlotResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareSlotRequest req = GetHealthcareSlotRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareSlotResponse res = sdk.healthcare().getHealthcareSlot()
                .request(req)
                .call();

        if (res.healthcareSlot().isPresent()) {
            System.out.println(res.healthcareSlot().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetHealthcareSlotRequest](../../models/operations/GetHealthcareSlotRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetHealthcareSlotResponse](../../models/operations/GetHealthcareSlotResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareAllergies

List all allergies

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareAllergies" method="get" path="/healthcare/{connection_id}/allergy" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareAllergiesRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareAllergiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareAllergiesRequest req = ListHealthcareAllergiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareAllergiesResponse res = sdk.healthcare().listHealthcareAllergies()
                .request(req)
                .call();

        if (res.healthcareAllergies().isPresent()) {
            System.out.println(res.healthcareAllergies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListHealthcareAllergiesRequest](../../models/operations/ListHealthcareAllergiesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListHealthcareAllergiesResponse](../../models/operations/ListHealthcareAllergiesResponse.md)**

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

        ListHealthcareAppointmentsResponse res = sdk.healthcare().listHealthcareAppointments()
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

## listHealthcareConditions

List all conditions

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareConditions" method="get" path="/healthcare/{connection_id}/condition" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareConditionsRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareConditionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareConditionsRequest req = ListHealthcareConditionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareConditionsResponse res = sdk.healthcare().listHealthcareConditions()
                .request(req)
                .call();

        if (res.healthcareConditions().isPresent()) {
            System.out.println(res.healthcareConditions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListHealthcareConditionsRequest](../../models/operations/ListHealthcareConditionsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListHealthcareConditionsResponse](../../models/operations/ListHealthcareConditionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareEncounters

List all encounters

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareEncounters" method="get" path="/healthcare/{connection_id}/encounter" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareEncountersRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareEncountersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareEncountersRequest req = ListHealthcareEncountersRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareEncountersResponse res = sdk.healthcare().listHealthcareEncounters()
                .request(req)
                .call();

        if (res.healthcareEncounters().isPresent()) {
            System.out.println(res.healthcareEncounters().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListHealthcareEncountersRequest](../../models/operations/ListHealthcareEncountersRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListHealthcareEncountersResponse](../../models/operations/ListHealthcareEncountersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareImmunizations

List all immunizations

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareImmunizations" method="get" path="/healthcare/{connection_id}/immunization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareImmunizationsRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareImmunizationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareImmunizationsRequest req = ListHealthcareImmunizationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareImmunizationsResponse res = sdk.healthcare().listHealthcareImmunizations()
                .request(req)
                .call();

        if (res.healthcareImmunizations().isPresent()) {
            System.out.println(res.healthcareImmunizations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListHealthcareImmunizationsRequest](../../models/operations/ListHealthcareImmunizationsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListHealthcareImmunizationsResponse](../../models/operations/ListHealthcareImmunizationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareLocations

List all locations

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareLocations" method="get" path="/healthcare/{connection_id}/location" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareLocationsRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareLocationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareLocationsRequest req = ListHealthcareLocationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareLocationsResponse res = sdk.healthcare().listHealthcareLocations()
                .request(req)
                .call();

        if (res.healthcareLocations().isPresent()) {
            System.out.println(res.healthcareLocations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListHealthcareLocationsRequest](../../models/operations/ListHealthcareLocationsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListHealthcareLocationsResponse](../../models/operations/ListHealthcareLocationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareMedications

List all medications

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareMedications" method="get" path="/healthcare/{connection_id}/medication" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareMedicationsRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareMedicationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareMedicationsRequest req = ListHealthcareMedicationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareMedicationsResponse res = sdk.healthcare().listHealthcareMedications()
                .request(req)
                .call();

        if (res.healthcareMedications().isPresent()) {
            System.out.println(res.healthcareMedications().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListHealthcareMedicationsRequest](../../models/operations/ListHealthcareMedicationsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListHealthcareMedicationsResponse](../../models/operations/ListHealthcareMedicationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareObservations

List all observations

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareObservations" method="get" path="/healthcare/{connection_id}/observation" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareObservationsRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareObservationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareObservationsRequest req = ListHealthcareObservationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareObservationsResponse res = sdk.healthcare().listHealthcareObservations()
                .request(req)
                .call();

        if (res.healthcareObservations().isPresent()) {
            System.out.println(res.healthcareObservations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListHealthcareObservationsRequest](../../models/operations/ListHealthcareObservationsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListHealthcareObservationsResponse](../../models/operations/ListHealthcareObservationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcarePatients

List all patients

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcarePatients" method="get" path="/healthcare/{connection_id}/patient" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcarePatientsRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcarePatientsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcarePatientsRequest req = ListHealthcarePatientsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcarePatientsResponse res = sdk.healthcare().listHealthcarePatients()
                .request(req)
                .call();

        if (res.healthcarePatients().isPresent()) {
            System.out.println(res.healthcarePatients().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListHealthcarePatientsRequest](../../models/operations/ListHealthcarePatientsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListHealthcarePatientsResponse](../../models/operations/ListHealthcarePatientsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcarePractitioners

List all practitioners

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcarePractitioners" method="get" path="/healthcare/{connection_id}/practitioner" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcarePractitionersRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcarePractitionersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcarePractitionersRequest req = ListHealthcarePractitionersRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcarePractitionersResponse res = sdk.healthcare().listHealthcarePractitioners()
                .request(req)
                .call();

        if (res.healthcarePractitioners().isPresent()) {
            System.out.println(res.healthcarePractitioners().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListHealthcarePractitionersRequest](../../models/operations/ListHealthcarePractitionersRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListHealthcarePractitionersResponse](../../models/operations/ListHealthcarePractitionersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareSlots

List all slots

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareSlots" method="get" path="/healthcare/{connection_id}/slot" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareSlotsRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareSlotsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareSlotsRequest req = ListHealthcareSlotsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareSlotsResponse res = sdk.healthcare().listHealthcareSlots()
                .request(req)
                .call();

        if (res.healthcareSlots().isPresent()) {
            System.out.println(res.healthcareSlots().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListHealthcareSlotsRequest](../../models/operations/ListHealthcareSlotsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListHealthcareSlotsResponse](../../models/operations/ListHealthcareSlotsResponse.md)**

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
                    .id("0b3b2cec-78f9-4e8e-8b63-19c6acabe6dd")
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
                    .updatedAt(OffsetDateTime.parse("2025-11-19T10:42:49.603Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHealthcareAppointmentResponse res = sdk.healthcare().patchHealthcareAppointment()
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

## patchHealthcarePatient

Update a patient

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHealthcarePatient" method="patch" path="/healthcare/{connection_id}/patient/{id}" example="healthcare_patient" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHealthcarePatientRequest;
import to.unified.unified_java_sdk.models.operations.PatchHealthcarePatientResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHealthcarePatientRequest req = PatchHealthcarePatientRequest.builder()
                .healthcarePatient(HealthcarePatient.builder()
                    .address(PropertyHealthcarePatientAddress.builder()
                        .address1("162 Kirlin Mall")
                        .city("Dickinsonborough")
                        .country("US")
                        .postalCode("54031")
                        .region("Nebraska")
                        .build())
                    .birthdate("2025-02-12")
                    .createdAt(OffsetDateTime.parse("2021-06-05T21:08:04.917Z"))
                    .emails(List.of(
                        HealthcareEmail.builder()
                            .email("alejandrin.parker@icloud.com")
                            .type(HealthcareEmailType.HOME)
                            .build()))
                    .firstName("Alejandrin")
                    .gender(HealthcarePatientGender.FEMALE)
                    .id("11aa78ec-bb89-455d-a5f3-2c7575a99444")
                    .identifiers(List.of(
                        HealthcareIdentifier.builder()
                            .value("57992636")
                            .type(HealthcareIdentifierType.MRN)
                            .build()))
                    .isActive(true)
                    .isDeceased(false)
                    .language("zh")
                    .lastName("Parker")
                    .metadata(List.of())
                    .name("Alejandrin Parker")
                    .practitionerIds(List.of())
                    .telephones(List.of(
                        HealthcareTelephone.builder()
                            .telephone("1-219-555-9023 x08295")
                            .type(HealthcareTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2026-06-22T20:20:27.658Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHealthcarePatientResponse res = sdk.healthcare().patchHealthcarePatient()
                .request(req)
                .call();

        if (res.healthcarePatient().isPresent()) {
            System.out.println(res.healthcarePatient().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchHealthcarePatientRequest](../../models/operations/PatchHealthcarePatientRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchHealthcarePatientResponse](../../models/operations/PatchHealthcarePatientResponse.md)**

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

        RemoveHealthcareAppointmentResponse res = sdk.healthcare().removeHealthcareAppointment()
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
                    .id("0b3b2cec-78f9-4e8e-8b63-19c6acabe6dd")
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
                    .updatedAt(OffsetDateTime.parse("2025-11-19T10:42:49.603Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHealthcareAppointmentResponse res = sdk.healthcare().updateHealthcareAppointment()
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

## updateHealthcarePatient

Update a patient

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHealthcarePatient" method="put" path="/healthcare/{connection_id}/patient/{id}" example="healthcare_patient" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHealthcarePatientRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHealthcarePatientResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHealthcarePatientRequest req = UpdateHealthcarePatientRequest.builder()
                .healthcarePatient(HealthcarePatient.builder()
                    .address(PropertyHealthcarePatientAddress.builder()
                        .address1("162 Kirlin Mall")
                        .city("Dickinsonborough")
                        .country("US")
                        .postalCode("54031")
                        .region("Nebraska")
                        .build())
                    .birthdate("2025-02-12")
                    .createdAt(OffsetDateTime.parse("2021-06-05T21:08:04.917Z"))
                    .emails(List.of(
                        HealthcareEmail.builder()
                            .email("alejandrin.parker@icloud.com")
                            .type(HealthcareEmailType.HOME)
                            .build()))
                    .firstName("Alejandrin")
                    .gender(HealthcarePatientGender.FEMALE)
                    .id("11aa78ec-bb89-455d-a5f3-2c7575a99444")
                    .identifiers(List.of(
                        HealthcareIdentifier.builder()
                            .value("57992636")
                            .type(HealthcareIdentifierType.MRN)
                            .build()))
                    .isActive(true)
                    .isDeceased(false)
                    .language("zh")
                    .lastName("Parker")
                    .metadata(List.of())
                    .name("Alejandrin Parker")
                    .practitionerIds(List.of())
                    .telephones(List.of(
                        HealthcareTelephone.builder()
                            .telephone("1-219-555-9023 x08295")
                            .type(HealthcareTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2026-06-22T20:20:27.658Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHealthcarePatientResponse res = sdk.healthcare().updateHealthcarePatient()
                .request(req)
                .call();

        if (res.healthcarePatient().isPresent()) {
            System.out.println(res.healthcarePatient().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateHealthcarePatientRequest](../../models/operations/UpdateHealthcarePatientRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateHealthcarePatientResponse](../../models/operations/UpdateHealthcarePatientResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |