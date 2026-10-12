# Immunization

## Overview

### Available Operations

* [getHealthcareImmunization](#gethealthcareimmunization) - Retrieve an immunization
* [listHealthcareImmunizations](#listhealthcareimmunizations) - List all immunizations

## getHealthcareImmunization

Retrieve an immunization

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

## listHealthcareImmunizations

List all immunizations

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