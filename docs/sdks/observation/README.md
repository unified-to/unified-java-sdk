# Observation

## Overview

### Available Operations

* [createHealthcareObservation](#createhealthcareobservation) - Create an observation
* [getHealthcareObservation](#gethealthcareobservation) - Retrieve an observation
* [listHealthcareObservations](#listhealthcareobservations) - List all observations

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
                    .id("4e0f7a0d-cad4-4c7d-a822-8d0edcbe0702")
                    .interpretation(Interpretation.CRITICAL_HIGH)
                    .issuedAt(OffsetDateTime.parse("2025-05-09T12:28:22.879Z"))
                    .metadata(List.of())
                    .name("Blood pressure panel")
                    .observedAt(OffsetDateTime.parse("2025-01-18T11:45:43.858Z"))
                    .status(HealthcareObservationStatus.CORRECTED)
                    .type(HealthcareObservationType.VITAL_SIGNS)
                    .updatedAt(OffsetDateTime.parse("2026-03-21T15:56:46.959Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHealthcareObservationResponse res = sdk.observation().createHealthcareObservation()
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

        GetHealthcareObservationResponse res = sdk.observation().getHealthcareObservation()
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

        ListHealthcareObservationsResponse res = sdk.observation().listHealthcareObservations()
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