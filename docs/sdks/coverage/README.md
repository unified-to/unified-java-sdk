# Coverage

## Overview

### Available Operations

* [getHealthcareCoverage](#gethealthcarecoverage) - Retrieve a coverage
* [listHealthcareCoverages](#listhealthcarecoverages) - List all coverages

## getHealthcareCoverage

Retrieves a single HealthcareCoverage by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareCoverage" method="get" path="/healthcare/{connection_id}/coverage/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareCoverageRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareCoverageResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareCoverageRequest req = GetHealthcareCoverageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareCoverageResponse res = sdk.coverage().getHealthcareCoverage()
                .request(req)
                .call();

        if (res.healthcareCoverage().isPresent()) {
            System.out.println(res.healthcareCoverage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetHealthcareCoverageRequest](../../models/operations/GetHealthcareCoverageRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetHealthcareCoverageResponse](../../models/operations/GetHealthcareCoverageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareCoverages

Returns a list of HealthcareCoverages. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareCoverages" method="get" path="/healthcare/{connection_id}/coverage" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareCoveragesRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareCoveragesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareCoveragesRequest req = ListHealthcareCoveragesRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareCoveragesResponse res = sdk.coverage().listHealthcareCoverages()
                .request(req)
                .call();

        if (res.healthcareCoverages().isPresent()) {
            System.out.println(res.healthcareCoverages().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListHealthcareCoveragesRequest](../../models/operations/ListHealthcareCoveragesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListHealthcareCoveragesResponse](../../models/operations/ListHealthcareCoveragesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |