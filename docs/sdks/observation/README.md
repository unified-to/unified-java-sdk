# Observation

## Overview

### Available Operations

* [createHealthcareObservation](#createhealthcareobservation) - Create an observation
* [getFhirObservation](#getfhirobservation) - Read a Observation
* [getHealthcareObservation](#gethealthcareobservation) - Retrieve an observation
* [listFhirObservations](#listfhirobservations) - Search Observation resources
* [listHealthcareObservations](#listhealthcareobservations) - List all observations

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
                    .id("232fefad-9e10-46bf-9895-3dc95af1a8f0")
                    .interpretation(Interpretation.CRITICAL_HIGH)
                    .issuedAt(OffsetDateTime.parse("2025-06-04T06:16:14.787Z"))
                    .metadata(List.of())
                    .name("Blood pressure panel")
                    .observedAt(OffsetDateTime.parse("2025-02-10T00:01:10.413Z"))
                    .status(HealthcareObservationStatus.CORRECTED)
                    .type(HealthcareObservationType.VITAL_SIGNS)
                    .updatedAt(OffsetDateTime.parse("2026-04-25T14:31:54.802Z"))
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

        GetFhirObservationResponse res = sdk.observation().getFhirObservation()
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

        ListFhirObservationsResponse res = sdk.observation().listFhirObservations()
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