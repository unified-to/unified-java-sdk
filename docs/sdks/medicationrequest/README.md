# Medicationrequest

## Overview

### Available Operations

* [getFhirMedicationrequest](#getfhirmedicationrequest) - Read a MedicationRequest
* [listFhirMedicationrequests](#listfhirmedicationrequests) - Search MedicationRequest resources

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

        GetFhirMedicationrequestResponse res = sdk.medicationrequest().getFhirMedicationrequest()
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

        ListFhirMedicationrequestsResponse res = sdk.medicationrequest().listFhirMedicationrequests()
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