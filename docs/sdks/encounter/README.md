# Encounter

## Overview

### Available Operations

* [getHealthcareEncounter](#gethealthcareencounter) - Retrieve an encounter
* [listHealthcareEncounters](#listhealthcareencounters) - List all encounters

## getHealthcareEncounter

Retrieve an encounter

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

## listHealthcareEncounters

List all encounters

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