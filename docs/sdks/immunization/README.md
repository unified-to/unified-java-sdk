# Immunization

## Overview

### Available Operations

* [getFhirImmunization](#getfhirimmunization) - Read a Immunization
* [getHealthcareImmunization](#gethealthcareimmunization) - Retrieve an immunization
* [listFhirImmunizations](#listfhirimmunizations) - Search Immunization resources
* [listHealthcareImmunizations](#listhealthcareimmunizations) - List all immunizations

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

        GetFhirImmunizationResponse res = sdk.immunization().getFhirImmunization()
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

        GetHealthcareImmunizationResponse res = sdk.immunization().getHealthcareImmunization()
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

        ListFhirImmunizationsResponse res = sdk.immunization().listFhirImmunizations()
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

        ListHealthcareImmunizationsResponse res = sdk.immunization().listHealthcareImmunizations()
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