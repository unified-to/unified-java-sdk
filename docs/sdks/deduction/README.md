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

Create a deduction

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisDeduction" method="post" path="/hris/{connection_id}/deduction" example="hris_deduction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .amount(139655d)
                    .coverageLevel(HrisDeductionCoverageLevel.EMPLOYEE_ONLY)
                    .createdAt(OffsetDateTime.parse("2020-02-05T01:46:31.384Z"))
                    .employerAmount(22611d)
                    .employerType(EmployerType.FIXED)
                    .endAt(OffsetDateTime.parse("2026-06-21T09:07:26.639Z"))
                    .frequency(HrisDeductionFrequency.BIWEEKLY)
                    .garnishmentType(GarnishmentType.OTHER)
                    .id("4518b0ad-a5a7-4b24-bce3-5c685f9a7662")
                    .isActive(false)
                    .notes("Carmen desidero.")
                    .startAt(OffsetDateTime.parse("2025-03-13T17:57:00.587Z"))
                    .type(HrisDeductionType.FIXED)
                    .updatedAt(OffsetDateTime.parse("2024-03-21T00:30:17.803Z"))
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

Retrieve a deduction

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

List all deductions

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

Update a deduction

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisDeduction" method="patch" path="/hris/{connection_id}/deduction/{id}" example="hris_deduction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .amount(139655d)
                    .coverageLevel(HrisDeductionCoverageLevel.EMPLOYEE_ONLY)
                    .createdAt(OffsetDateTime.parse("2020-02-05T01:46:31.384Z"))
                    .employerAmount(22611d)
                    .employerType(EmployerType.FIXED)
                    .endAt(OffsetDateTime.parse("2026-06-21T09:07:26.666Z"))
                    .frequency(HrisDeductionFrequency.BIWEEKLY)
                    .garnishmentType(GarnishmentType.OTHER)
                    .id("bcbc8c58-678c-40b7-b4f3-ae75587a65ef")
                    .isActive(false)
                    .notes("Carmen desidero.")
                    .startAt(OffsetDateTime.parse("2025-03-13T17:57:00.608Z"))
                    .type(HrisDeductionType.FIXED)
                    .updatedAt(OffsetDateTime.parse("2024-03-21T00:30:17.820Z"))
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

Remove a deduction

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

Update a deduction

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisDeduction" method="put" path="/hris/{connection_id}/deduction/{id}" example="hris_deduction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .amount(139655d)
                    .coverageLevel(HrisDeductionCoverageLevel.EMPLOYEE_ONLY)
                    .createdAt(OffsetDateTime.parse("2020-02-05T01:46:31.384Z"))
                    .employerAmount(22611d)
                    .employerType(EmployerType.FIXED)
                    .endAt(OffsetDateTime.parse("2026-06-21T09:07:26.666Z"))
                    .frequency(HrisDeductionFrequency.BIWEEKLY)
                    .garnishmentType(GarnishmentType.OTHER)
                    .id("bcbc8c58-678c-40b7-b4f3-ae75587a65ef")
                    .isActive(false)
                    .notes("Carmen desidero.")
                    .startAt(OffsetDateTime.parse("2025-03-13T17:57:00.608Z"))
                    .type(HrisDeductionType.FIXED)
                    .updatedAt(OffsetDateTime.parse("2024-03-21T00:30:17.820Z"))
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