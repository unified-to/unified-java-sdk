# Patient

## Overview

### Available Operations

* [createHealthcarePatient](#createhealthcarepatient) - Create a patient
* [getHealthcarePatient](#gethealthcarepatient) - Retrieve a patient
* [listHealthcarePatients](#listhealthcarepatients) - List all patients
* [patchHealthcarePatient](#patchhealthcarepatient) - Update a patient
* [updateHealthcarePatient](#updatehealthcarepatient) - Update a patient

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
                    .birthdate("2025-02-17")
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
                    .id("774758a2-4129-44ac-b947-2d169c88cbae")
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
                    .updatedAt(OffsetDateTime.parse("2026-06-27T11:03:11.021Z"))
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
                    .birthdate("2025-02-17")
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
                    .id("6d40c828-f460-4965-a034-e6272df41121")
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
                    .updatedAt(OffsetDateTime.parse("2026-06-27T11:03:11.116Z"))
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
                    .birthdate("2025-02-17")
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
                    .id("6d40c828-f460-4965-a034-e6272df41121")
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
                    .updatedAt(OffsetDateTime.parse("2026-06-27T11:03:11.116Z"))
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