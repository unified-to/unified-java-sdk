# Careplan

## Overview

### Available Operations

* [getHealthcareCareplan](#gethealthcarecareplan) - Retrieve a careplan
* [listHealthcareCareplans](#listhealthcarecareplans) - List all careplans

## getHealthcareCareplan

Retrieves a single HealthcareCareplan by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareCareplan" method="get" path="/healthcare/{connection_id}/careplan/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareCareplanRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareCareplanResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareCareplanRequest req = GetHealthcareCareplanRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareCareplanResponse res = sdk.careplan().getHealthcareCareplan()
                .request(req)
                .call();

        if (res.healthcareCareplan().isPresent()) {
            System.out.println(res.healthcareCareplan().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetHealthcareCareplanRequest](../../models/operations/GetHealthcareCareplanRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetHealthcareCareplanResponse](../../models/operations/GetHealthcareCareplanResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareCareplans

Returns a list of HealthcareCareplans. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareCareplans" method="get" path="/healthcare/{connection_id}/careplan" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareCareplansRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareCareplansResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareCareplansRequest req = ListHealthcareCareplansRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareCareplansResponse res = sdk.careplan().listHealthcareCareplans()
                .request(req)
                .call();

        if (res.healthcareCareplans().isPresent()) {
            System.out.println(res.healthcareCareplans().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListHealthcareCareplansRequest](../../models/operations/ListHealthcareCareplansRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListHealthcareCareplansResponse](../../models/operations/ListHealthcareCareplansResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |