# Deduction

## Overview

### Available Operations

* [createHrisDeduction](#createhrisdeduction) - Create a deduction
* [getHrisDeduction](#gethrisdeduction) - Retrieve a deduction
* [listHrisDeductions](#listhrisdeductions) - List all deductions
* [patchHrisDeduction](#patchhrisdeduction) - Update a deduction
* [removeHrisDeduction](#removehrisdeduction) - Remove a deduction
* [updateHrisDeduction](#updatehrisdeduction) - Update a deduction

## createHrisDeduction

Creates a HrisDeduction. Provide the unified HrisDeduction fields in the request body; they are mapped to the provider's API. Returns the created HrisDeduction.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisDeduction" method="post" path="/hris/{connection_id}/deduction" example="hris_deduction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisDeductionRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisDeductionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisDeductionRequest req = CreateHrisDeductionRequest.builder()
                .hrisDeduction(HrisDeduction.builder()
                    .amount(564d)
                    .coverageLevel(HrisDeductionCoverageLevel.EMPLOYEE_CHILD)
                    .createdAt(OffsetDateTime.parse("2020-02-05T01:46:31.384Z"))
                    .employerAmount(80510d)
                    .employerType(EmployerType.PERCENTAGE)
                    .frequency(HrisDeductionFrequency.ONE_TIME)
                    .garnishmentType(GarnishmentType.CHILD_SUPPORT)
                    .id("b8972c2b-e104-4e53-b595-7c3948f1bd67")
                    .isActive(true)
                    .maxAmount(21794d)
                    .metadata(List.of())
                    .notes("Carmen desidero.")
                    .startAt(OffsetDateTime.parse("2025-03-19T19:52:09.936Z"))
                    .type(HrisDeductionType.FIXED)
                    .updatedAt(OffsetDateTime.parse("2024-03-25T22:24:55.526Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisDeductionResponse res = sdk.deduction().createHrisDeduction()
                .request(req)
                .call();

        if (res.hrisDeduction().isPresent()) {
            System.out.println(res.hrisDeduction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateHrisDeductionRequest](../../models/operations/CreateHrisDeductionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateHrisDeductionResponse](../../models/operations/CreateHrisDeductionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisDeduction

Retrieves a single HrisDeduction by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisDeduction" method="get" path="/hris/{connection_id}/deduction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisDeductionRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisDeductionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisDeductionRequest req = GetHrisDeductionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisDeductionResponse res = sdk.deduction().getHrisDeduction()
                .request(req)
                .call();

        if (res.hrisDeduction().isPresent()) {
            System.out.println(res.hrisDeduction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetHrisDeductionRequest](../../models/operations/GetHrisDeductionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetHrisDeductionResponse](../../models/operations/GetHrisDeductionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisDeductions

Returns a list of HrisDeductions. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisDeductions" method="get" path="/hris/{connection_id}/deduction" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisDeductionsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisDeductionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisDeductionsRequest req = ListHrisDeductionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisDeductionsResponse res = sdk.deduction().listHrisDeductions()
                .request(req)
                .call();

        if (res.hrisDeductions().isPresent()) {
            System.out.println(res.hrisDeductions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListHrisDeductionsRequest](../../models/operations/ListHrisDeductionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListHrisDeductionsResponse](../../models/operations/ListHrisDeductionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisDeduction

Updates the HrisDeduction identified by `id`. Provide the unified HrisDeduction fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisDeduction" method="patch" path="/hris/{connection_id}/deduction/{id}" example="hris_deduction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisDeductionRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisDeductionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisDeductionRequest req = PatchHrisDeductionRequest.builder()
                .hrisDeduction(HrisDeduction.builder()
                    .amount(564d)
                    .coverageLevel(HrisDeductionCoverageLevel.EMPLOYEE_CHILD)
                    .createdAt(OffsetDateTime.parse("2020-02-05T01:46:31.384Z"))
                    .employerAmount(80510d)
                    .employerType(EmployerType.PERCENTAGE)
                    .frequency(HrisDeductionFrequency.ONE_TIME)
                    .garnishmentType(GarnishmentType.CHILD_SUPPORT)
                    .id("447a1b2f-82c9-4973-a318-4292bc612879")
                    .isActive(true)
                    .maxAmount(21794d)
                    .metadata(List.of())
                    .notes("Carmen desidero.")
                    .startAt(OffsetDateTime.parse("2025-03-19T19:52:09.949Z"))
                    .type(HrisDeductionType.FIXED)
                    .updatedAt(OffsetDateTime.parse("2024-03-25T22:24:55.535Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisDeductionResponse res = sdk.deduction().patchHrisDeduction()
                .request(req)
                .call();

        if (res.hrisDeduction().isPresent()) {
            System.out.println(res.hrisDeduction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchHrisDeductionRequest](../../models/operations/PatchHrisDeductionRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchHrisDeductionResponse](../../models/operations/PatchHrisDeductionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisDeduction

Deletes the HrisDeduction identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisDeduction" method="delete" path="/hris/{connection_id}/deduction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDeductionRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDeductionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisDeductionRequest req = RemoveHrisDeductionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisDeductionResponse res = sdk.deduction().removeHrisDeduction()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveHrisDeductionRequest](../../models/operations/RemoveHrisDeductionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveHrisDeductionResponse](../../models/operations/RemoveHrisDeductionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisDeduction

Updates the HrisDeduction identified by `id`. Provide the unified HrisDeduction fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisDeduction" method="put" path="/hris/{connection_id}/deduction/{id}" example="hris_deduction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDeductionRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDeductionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisDeductionRequest req = UpdateHrisDeductionRequest.builder()
                .hrisDeduction(HrisDeduction.builder()
                    .amount(564d)
                    .coverageLevel(HrisDeductionCoverageLevel.EMPLOYEE_CHILD)
                    .createdAt(OffsetDateTime.parse("2020-02-05T01:46:31.384Z"))
                    .employerAmount(80510d)
                    .employerType(EmployerType.PERCENTAGE)
                    .frequency(HrisDeductionFrequency.ONE_TIME)
                    .garnishmentType(GarnishmentType.CHILD_SUPPORT)
                    .id("447a1b2f-82c9-4973-a318-4292bc612879")
                    .isActive(true)
                    .maxAmount(21794d)
                    .metadata(List.of())
                    .notes("Carmen desidero.")
                    .startAt(OffsetDateTime.parse("2025-03-19T19:52:09.949Z"))
                    .type(HrisDeductionType.FIXED)
                    .updatedAt(OffsetDateTime.parse("2024-03-25T22:24:55.535Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisDeductionResponse res = sdk.deduction().updateHrisDeduction()
                .request(req)
                .call();

        if (res.hrisDeduction().isPresent()) {
            System.out.println(res.hrisDeduction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateHrisDeductionRequest](../../models/operations/UpdateHrisDeductionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateHrisDeductionResponse](../../models/operations/UpdateHrisDeductionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |