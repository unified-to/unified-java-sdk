# Practitioner

## Overview

### Available Operations

* [getHealthcarePractitioner](#gethealthcarepractitioner) - Retrieve a practitioner
* [listHealthcarePractitioners](#listhealthcarepractitioners) - List all practitioners

## getHealthcarePractitioner

Retrieve a practitioner

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcarePractitioner" method="get" path="/healthcare/{connection_id}/practitioner/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcarePractitionerRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcarePractitionerResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcarePractitionerRequest req = GetHealthcarePractitionerRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcarePractitionerResponse res = sdk.practitioner().getHealthcarePractitioner()
                .request(req)
                .call();

        if (res.healthcarePractitioner().isPresent()) {
            System.out.println(res.healthcarePractitioner().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetHealthcarePractitionerRequest](../../models/operations/GetHealthcarePractitionerRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetHealthcarePractitionerResponse](../../models/operations/GetHealthcarePractitionerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcarePractitioners

List all practitioners

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcarePractitioners" method="get" path="/healthcare/{connection_id}/practitioner" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcarePractitionersRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcarePractitionersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcarePractitionersRequest req = ListHealthcarePractitionersRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcarePractitionersResponse res = sdk.practitioner().listHealthcarePractitioners()
                .request(req)
                .call();

        if (res.healthcarePractitioners().isPresent()) {
            System.out.println(res.healthcarePractitioners().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListHealthcarePractitionersRequest](../../models/operations/ListHealthcarePractitionersRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListHealthcarePractitionersResponse](../../models/operations/ListHealthcarePractitionersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |