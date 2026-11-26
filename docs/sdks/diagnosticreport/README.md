# Diagnosticreport

## Overview

### Available Operations

* [getFhirDiagnosticreport](#getfhirdiagnosticreport) - Read a DiagnosticReport
* [listFhirDiagnosticreports](#listfhirdiagnosticreports) - Search DiagnosticReport resources

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

        GetFhirDiagnosticreportResponse res = sdk.diagnosticreport().getFhirDiagnosticreport()
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

        ListFhirDiagnosticreportsResponse res = sdk.diagnosticreport().listFhirDiagnosticreports()
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