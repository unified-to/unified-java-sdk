# Fhir

## Overview

### Available Operations

* [getFhirAllergyintolerance](#getfhirallergyintolerance) - Read a AllergyIntolerance
* [getFhirCondition](#getfhircondition) - Read a Condition
* [getFhirDiagnosticreport](#getfhirdiagnosticreport) - Read a DiagnosticReport
* [getFhirEncounter](#getfhirencounter) - Read a Encounter
* [getFhirImmunization](#getfhirimmunization) - Read a Immunization
* [getFhirMedicationrequest](#getfhirmedicationrequest) - Read a MedicationRequest
* [getFhirObservation](#getfhirobservation) - Read a Observation
* [getFhirPatient](#getfhirpatient) - Read a Patient
* [getFhirPractitioner](#getfhirpractitioner) - Read a Practitioner
* [listFhirAllergyintolerances](#listfhirallergyintolerances) - Search AllergyIntolerance resources
* [listFhirConditions](#listfhirconditions) - Search Condition resources
* [listFhirDiagnosticreports](#listfhirdiagnosticreports) - Search DiagnosticReport resources
* [listFhirEncounters](#listfhirencounters) - Search Encounter resources
* [listFhirImmunizations](#listfhirimmunizations) - Search Immunization resources
* [listFhirMedicationrequests](#listfhirmedicationrequests) - Search MedicationRequest resources
* [listFhirMetadatas](#listfhirmetadatas) - Get the CapabilityStatement
* [listFhirObservations](#listfhirobservations) - Search Observation resources
* [listFhirPatients](#listfhirpatients) - Search Patient resources
* [listFhirPractitioners](#listfhirpractitioners) - Search Practitioner resources

## getFhirAllergyintolerance

Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="getFhirAllergyintolerance" method="get" path="/fhir/{connection_id}/AllergyIntolerance/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetFhirAllergyintoleranceRequest;
import to.unified.unified_java_sdk.models.operations.GetFhirAllergyintoleranceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetFhirAllergyintoleranceRequest req = GetFhirAllergyintoleranceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetFhirAllergyintoleranceResponse res = sdk.fhir().getFhirAllergyintolerance()
                .request(req)
                .call();

        if (res.fhirAllergyIntolerance().isPresent()) {
            System.out.println(res.fhirAllergyIntolerance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetFhirAllergyintoleranceRequest](../../models/operations/GetFhirAllergyintoleranceRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetFhirAllergyintoleranceResponse](../../models/operations/GetFhirAllergyintoleranceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getFhirCondition

Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="getFhirCondition" method="get" path="/fhir/{connection_id}/Condition/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetFhirConditionRequest;
import to.unified.unified_java_sdk.models.operations.GetFhirConditionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetFhirConditionRequest req = GetFhirConditionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetFhirConditionResponse res = sdk.fhir().getFhirCondition()
                .request(req)
                .call();

        if (res.fhirCondition().isPresent()) {
            System.out.println(res.fhirCondition().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetFhirConditionRequest](../../models/operations/GetFhirConditionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetFhirConditionResponse](../../models/operations/GetFhirConditionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getFhirDiagnosticreport

Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="getFhirDiagnosticreport" method="get" path="/fhir/{connection_id}/DiagnosticReport/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetFhirDiagnosticreportRequest;
import to.unified.unified_java_sdk.models.operations.GetFhirDiagnosticreportResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetFhirDiagnosticreportRequest req = GetFhirDiagnosticreportRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetFhirDiagnosticreportResponse res = sdk.fhir().getFhirDiagnosticreport()
                .request(req)
                .call();

        if (res.fhirDiagnosticReport().isPresent()) {
            System.out.println(res.fhirDiagnosticReport().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetFhirDiagnosticreportRequest](../../models/operations/GetFhirDiagnosticreportRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetFhirDiagnosticreportResponse](../../models/operations/GetFhirDiagnosticreportResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getFhirEncounter

Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="getFhirEncounter" method="get" path="/fhir/{connection_id}/Encounter/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetFhirEncounterRequest;
import to.unified.unified_java_sdk.models.operations.GetFhirEncounterResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetFhirEncounterRequest req = GetFhirEncounterRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetFhirEncounterResponse res = sdk.fhir().getFhirEncounter()
                .request(req)
                .call();

        if (res.fhirEncounter().isPresent()) {
            System.out.println(res.fhirEncounter().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetFhirEncounterRequest](../../models/operations/GetFhirEncounterRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetFhirEncounterResponse](../../models/operations/GetFhirEncounterResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getFhirImmunization

Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="getFhirImmunization" method="get" path="/fhir/{connection_id}/Immunization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetFhirImmunizationRequest;
import to.unified.unified_java_sdk.models.operations.GetFhirImmunizationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetFhirImmunizationRequest req = GetFhirImmunizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetFhirImmunizationResponse res = sdk.fhir().getFhirImmunization()
                .request(req)
                .call();

        if (res.fhirImmunization().isPresent()) {
            System.out.println(res.fhirImmunization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetFhirImmunizationRequest](../../models/operations/GetFhirImmunizationRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetFhirImmunizationResponse](../../models/operations/GetFhirImmunizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getFhirMedicationrequest

Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="getFhirMedicationrequest" method="get" path="/fhir/{connection_id}/MedicationRequest/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetFhirMedicationrequestRequest;
import to.unified.unified_java_sdk.models.operations.GetFhirMedicationrequestResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetFhirMedicationrequestRequest req = GetFhirMedicationrequestRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetFhirMedicationrequestResponse res = sdk.fhir().getFhirMedicationrequest()
                .request(req)
                .call();

        if (res.fhirMedicationRequest().isPresent()) {
            System.out.println(res.fhirMedicationRequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetFhirMedicationrequestRequest](../../models/operations/GetFhirMedicationrequestRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetFhirMedicationrequestResponse](../../models/operations/GetFhirMedicationrequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getFhirObservation

Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="getFhirObservation" method="get" path="/fhir/{connection_id}/Observation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetFhirObservationRequest;
import to.unified.unified_java_sdk.models.operations.GetFhirObservationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetFhirObservationRequest req = GetFhirObservationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetFhirObservationResponse res = sdk.fhir().getFhirObservation()
                .request(req)
                .call();

        if (res.fhirObservation().isPresent()) {
            System.out.println(res.fhirObservation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetFhirObservationRequest](../../models/operations/GetFhirObservationRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetFhirObservationResponse](../../models/operations/GetFhirObservationResponse.md)**

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

        GetFhirPatientResponse res = sdk.fhir().getFhirPatient()
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

## getFhirPractitioner

Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="getFhirPractitioner" method="get" path="/fhir/{connection_id}/Practitioner/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetFhirPractitionerRequest;
import to.unified.unified_java_sdk.models.operations.GetFhirPractitionerResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetFhirPractitionerRequest req = GetFhirPractitionerRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetFhirPractitionerResponse res = sdk.fhir().getFhirPractitioner()
                .request(req)
                .call();

        if (res.fhirPractitioner().isPresent()) {
            System.out.println(res.fhirPractitioner().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetFhirPractitionerRequest](../../models/operations/GetFhirPractitionerRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetFhirPractitionerResponse](../../models/operations/GetFhirPractitionerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listFhirAllergyintolerances

Returns a searchset Bundle; follow its next link for more pages. Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="listFhirAllergyintolerances" method="get" path="/fhir/{connection_id}/AllergyIntolerance" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListFhirAllergyintolerancesRequest;
import to.unified.unified_java_sdk.models.operations.ListFhirAllergyintolerancesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListFhirAllergyintolerancesRequest req = ListFhirAllergyintolerancesRequest.builder()
                .connectionId("<id>")
                .build();

        ListFhirAllergyintolerancesResponse res = sdk.fhir().listFhirAllergyintolerances()
                .request(req)
                .call();

        if (res.fhirBundle().isPresent()) {
            System.out.println(res.fhirBundle().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListFhirAllergyintolerancesRequest](../../models/operations/ListFhirAllergyintolerancesRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListFhirAllergyintolerancesResponse](../../models/operations/ListFhirAllergyintolerancesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listFhirConditions

Returns a searchset Bundle; follow its next link for more pages. Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="listFhirConditions" method="get" path="/fhir/{connection_id}/Condition" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListFhirConditionsRequest;
import to.unified.unified_java_sdk.models.operations.ListFhirConditionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListFhirConditionsRequest req = ListFhirConditionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListFhirConditionsResponse res = sdk.fhir().listFhirConditions()
                .request(req)
                .call();

        if (res.fhirBundle().isPresent()) {
            System.out.println(res.fhirBundle().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListFhirConditionsRequest](../../models/operations/ListFhirConditionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListFhirConditionsResponse](../../models/operations/ListFhirConditionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listFhirDiagnosticreports

Returns a searchset Bundle; follow its next link for more pages. Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="listFhirDiagnosticreports" method="get" path="/fhir/{connection_id}/DiagnosticReport" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListFhirDiagnosticreportsRequest;
import to.unified.unified_java_sdk.models.operations.ListFhirDiagnosticreportsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListFhirDiagnosticreportsRequest req = ListFhirDiagnosticreportsRequest.builder()
                .connectionId("<id>")
                .build();

        ListFhirDiagnosticreportsResponse res = sdk.fhir().listFhirDiagnosticreports()
                .request(req)
                .call();

        if (res.fhirBundle().isPresent()) {
            System.out.println(res.fhirBundle().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListFhirDiagnosticreportsRequest](../../models/operations/ListFhirDiagnosticreportsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListFhirDiagnosticreportsResponse](../../models/operations/ListFhirDiagnosticreportsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listFhirEncounters

Returns a searchset Bundle; follow its next link for more pages. Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="listFhirEncounters" method="get" path="/fhir/{connection_id}/Encounter" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListFhirEncountersRequest;
import to.unified.unified_java_sdk.models.operations.ListFhirEncountersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListFhirEncountersRequest req = ListFhirEncountersRequest.builder()
                .connectionId("<id>")
                .build();

        ListFhirEncountersResponse res = sdk.fhir().listFhirEncounters()
                .request(req)
                .call();

        if (res.fhirBundle().isPresent()) {
            System.out.println(res.fhirBundle().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListFhirEncountersRequest](../../models/operations/ListFhirEncountersRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListFhirEncountersResponse](../../models/operations/ListFhirEncountersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listFhirImmunizations

Returns a searchset Bundle; follow its next link for more pages. Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="listFhirImmunizations" method="get" path="/fhir/{connection_id}/Immunization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListFhirImmunizationsRequest;
import to.unified.unified_java_sdk.models.operations.ListFhirImmunizationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListFhirImmunizationsRequest req = ListFhirImmunizationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListFhirImmunizationsResponse res = sdk.fhir().listFhirImmunizations()
                .request(req)
                .call();

        if (res.fhirBundle().isPresent()) {
            System.out.println(res.fhirBundle().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListFhirImmunizationsRequest](../../models/operations/ListFhirImmunizationsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListFhirImmunizationsResponse](../../models/operations/ListFhirImmunizationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listFhirMedicationrequests

Returns a searchset Bundle; follow its next link for more pages. Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="listFhirMedicationrequests" method="get" path="/fhir/{connection_id}/MedicationRequest" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListFhirMedicationrequestsRequest;
import to.unified.unified_java_sdk.models.operations.ListFhirMedicationrequestsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListFhirMedicationrequestsRequest req = ListFhirMedicationrequestsRequest.builder()
                .connectionId("<id>")
                .build();

        ListFhirMedicationrequestsResponse res = sdk.fhir().listFhirMedicationrequests()
                .request(req)
                .call();

        if (res.fhirBundle().isPresent()) {
            System.out.println(res.fhirBundle().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListFhirMedicationrequestsRequest](../../models/operations/ListFhirMedicationrequestsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListFhirMedicationrequestsResponse](../../models/operations/ListFhirMedicationrequestsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listFhirMetadatas

The resources, interactions and search parameters this connection's integration supports. Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="listFhirMetadatas" method="get" path="/fhir/{connection_id}/metadata" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListFhirMetadatasRequest;
import to.unified.unified_java_sdk.models.operations.ListFhirMetadatasResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListFhirMetadatasRequest req = ListFhirMetadatasRequest.builder()
                .connectionId("<id>")
                .build();

        ListFhirMetadatasResponse res = sdk.fhir().listFhirMetadatas()
                .request(req)
                .call();

        if (res.fhirCapabilityStatement().isPresent()) {
            System.out.println(res.fhirCapabilityStatement().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListFhirMetadatasRequest](../../models/operations/ListFhirMetadatasRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListFhirMetadatasResponse](../../models/operations/ListFhirMetadatasResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listFhirObservations

Returns a searchset Bundle; follow its next link for more pages. Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="listFhirObservations" method="get" path="/fhir/{connection_id}/Observation" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListFhirObservationsRequest;
import to.unified.unified_java_sdk.models.operations.ListFhirObservationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListFhirObservationsRequest req = ListFhirObservationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListFhirObservationsResponse res = sdk.fhir().listFhirObservations()
                .request(req)
                .call();

        if (res.fhirBundle().isPresent()) {
            System.out.println(res.fhirBundle().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListFhirObservationsRequest](../../models/operations/ListFhirObservationsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListFhirObservationsResponse](../../models/operations/ListFhirObservationsResponse.md)**

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

        ListFhirPatientsResponse res = sdk.fhir().listFhirPatients()
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

## listFhirPractitioners

Returns a searchset Bundle; follow its next link for more pages. Responses use the application/fhir+json media type; errors are OperationOutcome resources. Read-only (FHIR R4 4.0.1).

### Example Usage

<!-- UsageSnippet language="java" operationID="listFhirPractitioners" method="get" path="/fhir/{connection_id}/Practitioner" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListFhirPractitionersRequest;
import to.unified.unified_java_sdk.models.operations.ListFhirPractitionersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListFhirPractitionersRequest req = ListFhirPractitionersRequest.builder()
                .connectionId("<id>")
                .build();

        ListFhirPractitionersResponse res = sdk.fhir().listFhirPractitioners()
                .request(req)
                .call();

        if (res.fhirBundle().isPresent()) {
            System.out.println(res.fhirBundle().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListFhirPractitionersRequest](../../models/operations/ListFhirPractitionersRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListFhirPractitionersResponse](../../models/operations/ListFhirPractitionersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |