# Encounter

## Overview

### Available Operations

* [getFhirEncounter](#getfhirencounter) - Read a Encounter
* [getHealthcareEncounter](#gethealthcareencounter) - Retrieve an encounter
* [listFhirEncounters](#listfhirencounters) - Search Encounter resources
* [listHealthcareEncounters](#listhealthcareencounters) - List all encounters

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

        GetFhirEncounterResponse res = sdk.encounter().getFhirEncounter()
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

        GetHealthcareEncounterResponse res = sdk.encounter().getHealthcareEncounter()
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

        ListFhirEncountersResponse res = sdk.encounter().listFhirEncounters()
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

        ListHealthcareEncountersResponse res = sdk.encounter().listHealthcareEncounters()
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