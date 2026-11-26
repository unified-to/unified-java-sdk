# Allergyintolerance

## Overview

### Available Operations

* [getFhirAllergyintolerance](#getfhirallergyintolerance) - Read a AllergyIntolerance
* [listFhirAllergyintolerances](#listfhirallergyintolerances) - Search AllergyIntolerance resources

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

        GetFhirAllergyintoleranceResponse res = sdk.allergyintolerance().getFhirAllergyintolerance()
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

        ListFhirAllergyintolerancesResponse res = sdk.allergyintolerance().listFhirAllergyintolerances()
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