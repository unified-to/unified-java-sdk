# Patient

## Overview

### Available Operations

* [createHealthcarePatient](#createhealthcarepatient) - Create a patient
* [getFhirPatient](#getfhirpatient) - Read a Patient
* [getHealthcarePatient](#gethealthcarepatient) - Retrieve a patient
* [listFhirPatients](#listfhirpatients) - Search Patient resources
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
                        .address1("3645 Leonardo Place")
                        .city("Estelleland")
                        .country("US")
                        .postalCode("99263-6004")
                        .region("New Jersey")
                        .build())
                    .birthdate("1941-12-25")
                    .contacts(List.of(
                        HealthcarePatientContact.builder()
                            .emails(List.of())
                            .name("Ambrose Welch")
                            .relationship("Spouse")
                            .telephones(List.of(
                                HealthcareTelephone.builder()
                                    .telephone("323.524.3947 x89014")
                                    .type(HealthcareTelephoneType.MOBILE)
                                    .build()))
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-06-05T21:08:04.917Z"))
                    .emails(List.of(
                        HealthcareEmail.builder()
                            .email("monroe.bauch@icloud.com")
                            .type(HealthcareEmailType.HOME)
                            .build()))
                    .firstName("Monroe")
                    .gender(HealthcarePatientGender.FEMALE)
                    .id("8f66ecaa-d758-4f8d-a537-bdea3dddf9b4")
                    .identifiers(List.of(
                        HealthcareIdentifier.builder()
                            .value("51559512")
                            .type(HealthcareIdentifierType.MRN)
                            .build()))
                    .isActive(true)
                    .isDeceased(false)
                    .language("zh")
                    .lastName("Bauch")
                    .metadata(List.of())
                    .name("Monroe Bauch")
                    .practitionerIds(List.of())
                    .telephones(List.of(
                        HealthcareTelephone.builder()
                            .telephone("1-555-902-3082 x9590")
                            .type(HealthcareTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2026-07-26T14:21:09.328Z"))
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

## getFhirPatient

Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="getFhirPatient" method="get" path="/fhir/{connection_id}/Patient/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetFhirPatientRequest;
import to.unified.unified_java_sdk.models.operations.GetFhirPatientResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetFhirPatientRequest req = GetFhirPatientRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetFhirPatientResponse res = sdk.patient().getFhirPatient()
                .request(req)
                .call();

        if (res.fhirPatient().isPresent()) {
            System.out.println(res.fhirPatient().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetFhirPatientRequest](../../models/operations/GetFhirPatientRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetFhirPatientResponse](../../models/operations/GetFhirPatientResponse.md)**

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

## listFhirPatients

Returns a searchset Bundle; follow its next link for more pages. Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="listFhirPatients" method="get" path="/fhir/{connection_id}/Patient" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListFhirPatientsRequest;
import to.unified.unified_java_sdk.models.operations.ListFhirPatientsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListFhirPatientsRequest req = ListFhirPatientsRequest.builder()
                .connectionId("<id>")
                .build();

        ListFhirPatientsResponse res = sdk.patient().listFhirPatients()
                .request(req)
                .call();

        if (res.fhirBundle().isPresent()) {
            System.out.println(res.fhirBundle().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListFhirPatientsRequest](../../models/operations/ListFhirPatientsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListFhirPatientsResponse](../../models/operations/ListFhirPatientsResponse.md)**

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
                        .address1("3645 Leonardo Place")
                        .city("Estelleland")
                        .country("US")
                        .postalCode("99263-6004")
                        .region("New Jersey")
                        .build())
                    .birthdate("1941-12-25")
                    .contacts(List.of(
                        HealthcarePatientContact.builder()
                            .emails(List.of())
                            .name("Ambrose Welch")
                            .relationship("Spouse")
                            .telephones(List.of(
                                HealthcareTelephone.builder()
                                    .telephone("323.524.3947 x89014")
                                    .type(HealthcareTelephoneType.MOBILE)
                                    .build()))
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-06-05T21:08:04.917Z"))
                    .emails(List.of(
                        HealthcareEmail.builder()
                            .email("monroe.bauch@icloud.com")
                            .type(HealthcareEmailType.HOME)
                            .build()))
                    .firstName("Monroe")
                    .gender(HealthcarePatientGender.FEMALE)
                    .id("aae69851-4ec6-4102-916c-1290769e7606")
                    .identifiers(List.of(
                        HealthcareIdentifier.builder()
                            .value("51559512")
                            .type(HealthcareIdentifierType.MRN)
                            .build()))
                    .isActive(true)
                    .isDeceased(false)
                    .language("zh")
                    .lastName("Bauch")
                    .metadata(List.of())
                    .name("Monroe Bauch")
                    .practitionerIds(List.of())
                    .telephones(List.of(
                        HealthcareTelephone.builder()
                            .telephone("1-555-902-3082 x9590")
                            .type(HealthcareTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2026-07-26T14:21:09.364Z"))
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
                        .address1("3645 Leonardo Place")
                        .city("Estelleland")
                        .country("US")
                        .postalCode("99263-6004")
                        .region("New Jersey")
                        .build())
                    .birthdate("1941-12-25")
                    .contacts(List.of(
                        HealthcarePatientContact.builder()
                            .emails(List.of())
                            .name("Ambrose Welch")
                            .relationship("Spouse")
                            .telephones(List.of(
                                HealthcareTelephone.builder()
                                    .telephone("323.524.3947 x89014")
                                    .type(HealthcareTelephoneType.MOBILE)
                                    .build()))
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-06-05T21:08:04.917Z"))
                    .emails(List.of(
                        HealthcareEmail.builder()
                            .email("monroe.bauch@icloud.com")
                            .type(HealthcareEmailType.HOME)
                            .build()))
                    .firstName("Monroe")
                    .gender(HealthcarePatientGender.FEMALE)
                    .id("aae69851-4ec6-4102-916c-1290769e7606")
                    .identifiers(List.of(
                        HealthcareIdentifier.builder()
                            .value("51559512")
                            .type(HealthcareIdentifierType.MRN)
                            .build()))
                    .isActive(true)
                    .isDeceased(false)
                    .language("zh")
                    .lastName("Bauch")
                    .metadata(List.of())
                    .name("Monroe Bauch")
                    .practitionerIds(List.of())
                    .telephones(List.of(
                        HealthcareTelephone.builder()
                            .telephone("1-555-902-3082 x9590")
                            .type(HealthcareTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2026-07-26T14:21:09.364Z"))
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