# Practitioner

## Overview

### Available Operations

* [getHealthcarePractitioner](#gethealthcarepractitioner) - Retrieve a practitioner
* [listHealthcarePractitioners](#listhealthcarepractitioners) - List all practitioners

## getHealthcarePractitioner

Retrieves a single HealthcarePractitioner by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Returns a list of HealthcarePractitioners. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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