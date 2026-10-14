# Patient

## Overview

### Available Operations

* [createHealthcarePatient](#createhealthcarepatient) - Create a patient
* [getHealthcarePatient](#gethealthcarepatient) - Retrieve a patient
* [listHealthcarePatients](#listhealthcarepatients) - List all patients
* [patchHealthcarePatient](#patchhealthcarepatient) - Update a patient
* [updateHealthcarePatient](#updatehealthcarepatient) - Update a patient

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
                        .address1("3645 Zoila Isle")
                        .address2("Suite 613")
                        .city("Jacintostead")
                        .country("US")
                        .postalCode("31579")
                        .region("Minnesota")
                        .build())
                    .birthdate("2025-02-05")
                    .createdAt(OffsetDateTime.parse("2021-06-05T21:08:04.917Z"))
                    .emails(List.of(
                        HealthcareEmail.builder()
                            .email("alejandrin.parker@yahoo.com")
                            .type(HealthcareEmailType.HOME)
                            .build()))
                    .firstName("Alejandrin")
                    .gender(HealthcarePatientGender.FEMALE)
                    .id("cfc63d91-8ecf-4627-86a1-d6361f21e820")
                    .identifiers(List.of(
                        HealthcareIdentifier.builder()
                            .value("92636004")
                            .type(HealthcareIdentifierType.MRN)
                            .build()))
                    .isActive(true)
                    .isDeceased(false)
                    .language("en")
                    .lastName("Parker")
                    .metadata(List.of())
                    .name("Alejandrin Parker")
                    .practitionerIds(List.of())
                    .telephones(List.of(
                        HealthcareTelephone.builder()
                            .telephone("659.223.0829 x590")
                            .type(HealthcareTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2026-06-16T07:24:04.973Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHealthcarePatientResponse res = sdk.patient().createHealthcarePatient()
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

        GetHealthcarePatientResponse res = sdk.patient().getHealthcarePatient()
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

        ListHealthcarePatientsResponse res = sdk.patient().listHealthcarePatients()
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
                        .address1("3645 Zoila Isle")
                        .address2("Suite 613")
                        .city("Jacintostead")
                        .country("US")
                        .postalCode("31579")
                        .region("Minnesota")
                        .build())
                    .birthdate("2025-02-05")
                    .createdAt(OffsetDateTime.parse("2021-06-05T21:08:04.917Z"))
                    .emails(List.of(
                        HealthcareEmail.builder()
                            .email("alejandrin.parker@yahoo.com")
                            .type(HealthcareEmailType.HOME)
                            .build()))
                    .firstName("Alejandrin")
                    .gender(HealthcarePatientGender.FEMALE)
                    .id("fcf5d6cc-d21a-4218-a53a-8b0766e41b42")
                    .identifiers(List.of(
                        HealthcareIdentifier.builder()
                            .value("92636004")
                            .type(HealthcareIdentifierType.MRN)
                            .build()))
                    .isActive(true)
                    .isDeceased(false)
                    .language("en")
                    .lastName("Parker")
                    .metadata(List.of())
                    .name("Alejandrin Parker")
                    .practitionerIds(List.of())
                    .telephones(List.of(
                        HealthcareTelephone.builder()
                            .telephone("659.223.0829 x590")
                            .type(HealthcareTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2026-06-16T07:24:04.996Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHealthcarePatientResponse res = sdk.patient().patchHealthcarePatient()
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
                        .address1("3645 Zoila Isle")
                        .address2("Suite 613")
                        .city("Jacintostead")
                        .country("US")
                        .postalCode("31579")
                        .region("Minnesota")
                        .build())
                    .birthdate("2025-02-05")
                    .createdAt(OffsetDateTime.parse("2021-06-05T21:08:04.917Z"))
                    .emails(List.of(
                        HealthcareEmail.builder()
                            .email("alejandrin.parker@yahoo.com")
                            .type(HealthcareEmailType.HOME)
                            .build()))
                    .firstName("Alejandrin")
                    .gender(HealthcarePatientGender.FEMALE)
                    .id("fcf5d6cc-d21a-4218-a53a-8b0766e41b42")
                    .identifiers(List.of(
                        HealthcareIdentifier.builder()
                            .value("92636004")
                            .type(HealthcareIdentifierType.MRN)
                            .build()))
                    .isActive(true)
                    .isDeceased(false)
                    .language("en")
                    .lastName("Parker")
                    .metadata(List.of())
                    .name("Alejandrin Parker")
                    .practitionerIds(List.of())
                    .telephones(List.of(
                        HealthcareTelephone.builder()
                            .telephone("659.223.0829 x590")
                            .type(HealthcareTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2026-06-16T07:24:04.996Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHealthcarePatientResponse res = sdk.patient().updateHealthcarePatient()
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