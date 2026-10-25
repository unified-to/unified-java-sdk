# Healthcare

## Overview

### Available Operations

* [createHealthcareAppointment](#createhealthcareappointment) - Create an appointment
* [createHealthcareDocument](#createhealthcaredocument) - Create a document
* [createHealthcareObservation](#createhealthcareobservation) - Create an observation
* [createHealthcarePatient](#createhealthcarepatient) - Create a patient
* [getHealthcareAllergy](#gethealthcareallergy) - Retrieve an allergy
* [getHealthcareAppointment](#gethealthcareappointment) - Retrieve an appointment
* [getHealthcareCareplan](#gethealthcarecareplan) - Retrieve a careplan
* [getHealthcareCondition](#gethealthcarecondition) - Retrieve a condition
* [getHealthcareCoverage](#gethealthcarecoverage) - Retrieve a coverage
* [getHealthcareDocument](#gethealthcaredocument) - Retrieve a document
* [getHealthcareEncounter](#gethealthcareencounter) - Retrieve an encounter
* [getHealthcareGoal](#gethealthcaregoal) - Retrieve a goal
* [getHealthcareImmunization](#gethealthcareimmunization) - Retrieve an immunization
* [getHealthcareLocation](#gethealthcarelocation) - Retrieve a location
* [getHealthcareMedication](#gethealthcaremedication) - Retrieve a medication
* [getHealthcareObservation](#gethealthcareobservation) - Retrieve an observation
* [getHealthcarePatient](#gethealthcarepatient) - Retrieve a patient
* [getHealthcarePractitioner](#gethealthcarepractitioner) - Retrieve a practitioner
* [getHealthcareProcedure](#gethealthcareprocedure) - Retrieve a procedure
* [getHealthcareReport](#gethealthcarereport) - Retrieve a report
* [getHealthcareSlot](#gethealthcareslot) - Retrieve a slot
* [listHealthcareAllergies](#listhealthcareallergies) - List all allergies
* [listHealthcareAppointments](#listhealthcareappointments) - List all appointments
* [listHealthcareCareplans](#listhealthcarecareplans) - List all careplans
* [listHealthcareConditions](#listhealthcareconditions) - List all conditions
* [listHealthcareCoverages](#listhealthcarecoverages) - List all coverages
* [listHealthcareDocuments](#listhealthcaredocuments) - List all documents
* [listHealthcareEncounters](#listhealthcareencounters) - List all encounters
* [listHealthcareGoals](#listhealthcaregoals) - List all goals
* [listHealthcareImmunizations](#listhealthcareimmunizations) - List all immunizations
* [listHealthcareLocations](#listhealthcarelocations) - List all locations
* [listHealthcareMedications](#listhealthcaremedications) - List all medications
* [listHealthcareObservations](#listhealthcareobservations) - List all observations
* [listHealthcarePatients](#listhealthcarepatients) - List all patients
* [listHealthcarePractitioners](#listhealthcarepractitioners) - List all practitioners
* [listHealthcareProcedures](#listhealthcareprocedures) - List all procedures
* [listHealthcareReports](#listhealthcarereports) - List all reports
* [listHealthcareSlots](#listhealthcareslots) - List all slots
* [patchHealthcareAppointment](#patchhealthcareappointment) - Update an appointment
* [patchHealthcarePatient](#patchhealthcarepatient) - Update a patient
* [removeHealthcareAppointment](#removehealthcareappointment) - Remove an appointment
* [updateHealthcareAppointment](#updatehealthcareappointment) - Update an appointment
* [updateHealthcarePatient](#updatehealthcarepatient) - Update a patient

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
                    .id("7693c382-e157-486c-b981-26bc70047846")
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
                    .updatedAt(OffsetDateTime.parse("2026-09-26T00:08:45.146Z"))
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

## createHealthcareDocument

Creates a HealthcareDocument. Provide the unified HealthcareDocument fields in the request body; they are mapped to the provider's API. Returns the created HealthcareDocument.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHealthcareDocument" method="post" path="/healthcare/{connection_id}/document" example="healthcare_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHealthcareDocumentRequest;
import to.unified.unified_java_sdk.models.operations.CreateHealthcareDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHealthcareDocumentRequest req = CreateHealthcareDocumentRequest.builder()
                .healthcareDocument(HealthcareDocument.builder()
                    .authoredAt(OffsetDateTime.parse("2023-07-16T04:00:25.853Z"))
                    .codes(List.of(
                        HealthcareCode.builder()
                            .code("23671711")
                            .display("History and physical")
                            .system("http://loinc.org")
                            .build()))
                    .createdAt(OffsetDateTime.parse("2023-07-16T04:00:25.853Z"))
                    .documentUrl("https://overcooked-yogurt.org")
                    .filename("ugh_after.elc")
                    .id("944b8395-80c9-4ec1-9096-4c1634e2f1af")
                    .metadata(List.of())
                    .mimeType("application/pdf")
                    .name("History and physical")
                    .status(HealthcareDocumentStatus.SUPERSEDED)
                    .type(HealthcareDocumentType.CONSULTATION_NOTE)
                    .updatedAt(OffsetDateTime.parse("2024-12-28T11:40:08.793Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHealthcareDocumentResponse res = sdk.healthcare().createHealthcareDocument()
                .request(req)
                .call();

        if (res.healthcareDocument().isPresent()) {
            System.out.println(res.healthcareDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateHealthcareDocumentRequest](../../models/operations/CreateHealthcareDocumentRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateHealthcareDocumentResponse](../../models/operations/CreateHealthcareDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHealthcareObservation

Creates a HealthcareObservation. Provide the unified HealthcareObservation fields in the request body; they are mapped to the provider's API. Returns the created HealthcareObservation.

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
                    .id("50733398-2523-4d96-a2e4-37c9f358953c")
                    .interpretation(Interpretation.CRITICAL_HIGH)
                    .issuedAt(OffsetDateTime.parse("2025-05-13T20:36:08.190Z"))
                    .metadata(List.of())
                    .name("Blood pressure panel")
                    .observedAt(OffsetDateTime.parse("2025-01-22T06:49:19.472Z"))
                    .status(HealthcareObservationStatus.CORRECTED)
                    .type(HealthcareObservationType.VITAL_SIGNS)
                    .updatedAt(OffsetDateTime.parse("2026-03-27T13:17:21.150Z"))
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

Creates a HealthcarePatient. Provide the unified HealthcarePatient fields in the request body; they are mapped to the provider's API. Returns the created HealthcarePatient.

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
                    .birthdate("2025-02-15")
                    .contacts(List.of(
                        HealthcarePatientContact.builder()
                            .emails(List.of())
                            .name("Antonia Lebsack")
                            .relationship("Spouse")
                            .telephones(List.of(
                                HealthcareTelephone.builder()
                                    .telephone("(695) 328-7029 x4412")
                                    .type(HealthcareTelephoneType.MOBILE)
                                    .build()))
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-06-05T21:08:04.917Z"))
                    .emails(List.of(
                        HealthcareEmail.builder()
                            .email("alejandrin.parker@icloud.com")
                            .type(HealthcareEmailType.HOME)
                            .build()))
                    .firstName("Alejandrin")
                    .gender(HealthcarePatientGender.FEMALE)
                    .id("cfc5529c-d78c-4d43-be5c-ae45fea5616f")
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
                    .updatedAt(OffsetDateTime.parse("2026-06-26T11:19:34.305Z"))
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

Retrieves a single HealthcareAllergy by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

## getHealthcareCareplan

Retrieves a single HealthcareCareplan by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareCareplan" method="get" path="/healthcare/{connection_id}/careplan/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareCareplanRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareCareplanResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareCareplanRequest req = GetHealthcareCareplanRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareCareplanResponse res = sdk.healthcare().getHealthcareCareplan()
                .request(req)
                .call();

        if (res.healthcareCareplan().isPresent()) {
            System.out.println(res.healthcareCareplan().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetHealthcareCareplanRequest](../../models/operations/GetHealthcareCareplanRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetHealthcareCareplanResponse](../../models/operations/GetHealthcareCareplanResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHealthcareCondition

Retrieves a single HealthcareCondition by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

## getHealthcareCoverage

Retrieves a single HealthcareCoverage by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareCoverage" method="get" path="/healthcare/{connection_id}/coverage/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareCoverageRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareCoverageResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareCoverageRequest req = GetHealthcareCoverageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareCoverageResponse res = sdk.healthcare().getHealthcareCoverage()
                .request(req)
                .call();

        if (res.healthcareCoverage().isPresent()) {
            System.out.println(res.healthcareCoverage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetHealthcareCoverageRequest](../../models/operations/GetHealthcareCoverageRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetHealthcareCoverageResponse](../../models/operations/GetHealthcareCoverageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHealthcareDocument

Retrieves a single HealthcareDocument by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareDocument" method="get" path="/healthcare/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareDocumentRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareDocumentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareDocumentRequest req = GetHealthcareDocumentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareDocumentResponse res = sdk.healthcare().getHealthcareDocument()
                .request(req)
                .call();

        if (res.healthcareDocument().isPresent()) {
            System.out.println(res.healthcareDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetHealthcareDocumentRequest](../../models/operations/GetHealthcareDocumentRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetHealthcareDocumentResponse](../../models/operations/GetHealthcareDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHealthcareEncounter

Retrieves a single HealthcareEncounter by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

## getHealthcareGoal

Retrieves a single HealthcareGoal by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareGoal" method="get" path="/healthcare/{connection_id}/goal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareGoalRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareGoalResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareGoalRequest req = GetHealthcareGoalRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareGoalResponse res = sdk.healthcare().getHealthcareGoal()
                .request(req)
                .call();

        if (res.healthcareGoal().isPresent()) {
            System.out.println(res.healthcareGoal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetHealthcareGoalRequest](../../models/operations/GetHealthcareGoalRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetHealthcareGoalResponse](../../models/operations/GetHealthcareGoalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHealthcareImmunization

Retrieves a single HealthcareImmunization by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single HealthcareLocation by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single HealthcareMedication by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single HealthcareObservation by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single HealthcarePatient by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single HealthcarePractitioner by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

## getHealthcareProcedure

Retrieves a single HealthcareProcedure by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareProcedure" method="get" path="/healthcare/{connection_id}/procedure/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareProcedureRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareProcedureResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareProcedureRequest req = GetHealthcareProcedureRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareProcedureResponse res = sdk.healthcare().getHealthcareProcedure()
                .request(req)
                .call();

        if (res.healthcareProcedure().isPresent()) {
            System.out.println(res.healthcareProcedure().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetHealthcareProcedureRequest](../../models/operations/GetHealthcareProcedureRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetHealthcareProcedureResponse](../../models/operations/GetHealthcareProcedureResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHealthcareReport

Retrieves a single HealthcareReport by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareReport" method="get" path="/healthcare/{connection_id}/report/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareReportRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareReportResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareReportRequest req = GetHealthcareReportRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareReportResponse res = sdk.healthcare().getHealthcareReport()
                .request(req)
                .call();

        if (res.healthcareReport().isPresent()) {
            System.out.println(res.healthcareReport().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetHealthcareReportRequest](../../models/operations/GetHealthcareReportRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetHealthcareReportResponse](../../models/operations/GetHealthcareReportResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHealthcareSlot

Retrieves a single HealthcareSlot by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Returns a list of HealthcareAllergies. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

## listHealthcareCareplans

Returns a list of HealthcareCareplans. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareCareplans" method="get" path="/healthcare/{connection_id}/careplan" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareCareplansRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareCareplansResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareCareplansRequest req = ListHealthcareCareplansRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareCareplansResponse res = sdk.healthcare().listHealthcareCareplans()
                .request(req)
                .call();

        if (res.healthcareCareplans().isPresent()) {
            System.out.println(res.healthcareCareplans().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListHealthcareCareplansRequest](../../models/operations/ListHealthcareCareplansRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListHealthcareCareplansResponse](../../models/operations/ListHealthcareCareplansResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareConditions

Returns a list of HealthcareConditions. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

## listHealthcareCoverages

Returns a list of HealthcareCoverages. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareCoverages" method="get" path="/healthcare/{connection_id}/coverage" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareCoveragesRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareCoveragesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareCoveragesRequest req = ListHealthcareCoveragesRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareCoveragesResponse res = sdk.healthcare().listHealthcareCoverages()
                .request(req)
                .call();

        if (res.healthcareCoverages().isPresent()) {
            System.out.println(res.healthcareCoverages().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListHealthcareCoveragesRequest](../../models/operations/ListHealthcareCoveragesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListHealthcareCoveragesResponse](../../models/operations/ListHealthcareCoveragesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareDocuments

Returns a list of HealthcareDocuments. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareDocuments" method="get" path="/healthcare/{connection_id}/document" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareDocumentsRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareDocumentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareDocumentsRequest req = ListHealthcareDocumentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareDocumentsResponse res = sdk.healthcare().listHealthcareDocuments()
                .request(req)
                .call();

        if (res.healthcareDocuments().isPresent()) {
            System.out.println(res.healthcareDocuments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListHealthcareDocumentsRequest](../../models/operations/ListHealthcareDocumentsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListHealthcareDocumentsResponse](../../models/operations/ListHealthcareDocumentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareEncounters

Returns a list of HealthcareEncounters. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

## listHealthcareGoals

Returns a list of HealthcareGoals. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareGoals" method="get" path="/healthcare/{connection_id}/goal" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareGoalsRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareGoalsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareGoalsRequest req = ListHealthcareGoalsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareGoalsResponse res = sdk.healthcare().listHealthcareGoals()
                .request(req)
                .call();

        if (res.healthcareGoals().isPresent()) {
            System.out.println(res.healthcareGoals().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListHealthcareGoalsRequest](../../models/operations/ListHealthcareGoalsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListHealthcareGoalsResponse](../../models/operations/ListHealthcareGoalsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareImmunizations

Returns a list of HealthcareImmunizations. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of HealthcareLocations. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of HealthcareMedications. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of HealthcareObservations. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of HealthcarePatients. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of HealthcarePractitioners. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

## listHealthcareProcedures

Returns a list of HealthcareProcedures. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareProcedures" method="get" path="/healthcare/{connection_id}/procedure" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareProceduresRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareProceduresResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareProceduresRequest req = ListHealthcareProceduresRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareProceduresResponse res = sdk.healthcare().listHealthcareProcedures()
                .request(req)
                .call();

        if (res.healthcareProcedures().isPresent()) {
            System.out.println(res.healthcareProcedures().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListHealthcareProceduresRequest](../../models/operations/ListHealthcareProceduresRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListHealthcareProceduresResponse](../../models/operations/ListHealthcareProceduresResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareReports

Returns a list of HealthcareReports. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareReports" method="get" path="/healthcare/{connection_id}/report" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareReportsRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareReportsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareReportsRequest req = ListHealthcareReportsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareReportsResponse res = sdk.healthcare().listHealthcareReports()
                .request(req)
                .call();

        if (res.healthcareReports().isPresent()) {
            System.out.println(res.healthcareReports().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListHealthcareReportsRequest](../../models/operations/ListHealthcareReportsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListHealthcareReportsResponse](../../models/operations/ListHealthcareReportsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareSlots

Returns a list of HealthcareSlots. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
                    .id("c0833e06-7b06-4bf2-844f-2673c9d03834")
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
                    .updatedAt(OffsetDateTime.parse("2026-09-26T00:08:45.164Z"))
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

Updates the HealthcarePatient identified by `id`. Provide the unified HealthcarePatient fields to change in the request body.

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
                    .birthdate("2025-02-15")
                    .contacts(List.of(
                        HealthcarePatientContact.builder()
                            .emails(List.of())
                            .name("Antonia Lebsack")
                            .relationship("Spouse")
                            .telephones(List.of(
                                HealthcareTelephone.builder()
                                    .telephone("(695) 328-7029 x4412")
                                    .type(HealthcareTelephoneType.MOBILE)
                                    .build()))
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-06-05T21:08:04.917Z"))
                    .emails(List.of(
                        HealthcareEmail.builder()
                            .email("alejandrin.parker@icloud.com")
                            .type(HealthcareEmailType.HOME)
                            .build()))
                    .firstName("Alejandrin")
                    .gender(HealthcarePatientGender.FEMALE)
                    .id("f74311fc-2420-4077-8af3-fab68bc37b57")
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
                    .updatedAt(OffsetDateTime.parse("2026-06-26T11:19:34.352Z"))
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
                    .id("c0833e06-7b06-4bf2-844f-2673c9d03834")
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
                    .updatedAt(OffsetDateTime.parse("2026-09-26T00:08:45.164Z"))
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

Updates the HealthcarePatient identified by `id`. Provide the unified HealthcarePatient fields to change in the request body.

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
                    .birthdate("2025-02-15")
                    .contacts(List.of(
                        HealthcarePatientContact.builder()
                            .emails(List.of())
                            .name("Antonia Lebsack")
                            .relationship("Spouse")
                            .telephones(List.of(
                                HealthcareTelephone.builder()
                                    .telephone("(695) 328-7029 x4412")
                                    .type(HealthcareTelephoneType.MOBILE)
                                    .build()))
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-06-05T21:08:04.917Z"))
                    .emails(List.of(
                        HealthcareEmail.builder()
                            .email("alejandrin.parker@icloud.com")
                            .type(HealthcareEmailType.HOME)
                            .build()))
                    .firstName("Alejandrin")
                    .gender(HealthcarePatientGender.FEMALE)
                    .id("f74311fc-2420-4077-8af3-fab68bc37b57")
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
                    .updatedAt(OffsetDateTime.parse("2026-06-26T11:19:34.352Z"))
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