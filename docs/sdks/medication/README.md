# Medication

## Overview

### Available Operations

* [getHealthcareMedication](#gethealthcaremedication) - Retrieve a medication
* [listHealthcareMedications](#listhealthcaremedications) - List all medications

## getHealthcareMedication

Retrieve a medication

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareMedication" method="get" path="/healthcare/{connection_id}/medication/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareMedicationRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareMedicationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareMedicationRequest req = GetHealthcareMedicationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareMedicationResponse res = sdk.medication().getHealthcareMedication()
                .request(req)
                .call();

        if (res.healthcareMedication().isPresent()) {
            System.out.println(res.healthcareMedication().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetHealthcareMedicationRequest](../../models/operations/GetHealthcareMedicationRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetHealthcareMedicationResponse](../../models/operations/GetHealthcareMedicationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareMedications

List all medications

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareMedications" method="get" path="/healthcare/{connection_id}/medication" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareMedicationsRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareMedicationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareMedicationsRequest req = ListHealthcareMedicationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareMedicationsResponse res = sdk.medication().listHealthcareMedications()
                .request(req)
                .call();

        if (res.healthcareMedications().isPresent()) {
            System.out.println(res.healthcareMedications().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListHealthcareMedicationsRequest](../../models/operations/ListHealthcareMedicationsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListHealthcareMedicationsResponse](../../models/operations/ListHealthcareMedicationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |