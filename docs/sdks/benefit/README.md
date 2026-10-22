# Benefit

## Overview

### Available Operations

* [createHrisBenefit](#createhrisbenefit) - Create a benefit
* [getHrisBenefit](#gethrisbenefit) - Retrieve a benefit
* [listHrisBenefits](#listhrisbenefits) - List all benefits
* [patchHrisBenefit](#patchhrisbenefit) - Update a benefit
* [removeHrisBenefit](#removehrisbenefit) - Remove a benefit
* [updateHrisBenefit](#updatehrisbenefit) - Update a benefit

## createHrisBenefit

Creates a HrisBenefit. Provide the unified HrisBenefit fields in the request body; they are mapped to the provider's API. Returns the created HrisBenefit.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisBenefit" method="post" path="/hris/{connection_id}/benefit" example="hris_benefit" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisBenefitRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisBenefitResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisBenefitRequest req = CreateHrisBenefitRequest.builder()
                .hrisBenefit(HrisBenefit.builder()
                    .coverageLevel(CoverageLevel.EMPLOYEE_SPOUSE)
                    .createdAt(OffsetDateTime.parse("2020-06-11T01:24:05.654Z"))
                    .currency("GBP")
                    .description("Vomito voluptas dolor sed.")
                    .employerContributionAmount(185006d)
                    .employerContributionMaxAmount(179093d)
                    .employerContributionType(EmployerContributionType.PERCENTAGE)
                    .frequency(HrisBenefitFrequency.MONTH)
                    .id("d784f8fe-b082-43c2-8d50-2c14180ce0cf")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Frozen Wooden Ball")
                    .tax(Tax.PRE_TAX)
                    .type(HrisBenefitType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2023-03-21T07:14:16.549Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisBenefitResponse res = sdk.benefit().createHrisBenefit()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            System.out.println(res.hrisBenefit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateHrisBenefitRequest](../../models/operations/CreateHrisBenefitRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateHrisBenefitResponse](../../models/operations/CreateHrisBenefitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisBenefit

Retrieves a single HrisBenefit by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisBenefit" method="get" path="/hris/{connection_id}/benefit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisBenefitRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisBenefitResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisBenefitRequest req = GetHrisBenefitRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisBenefitResponse res = sdk.benefit().getHrisBenefit()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            System.out.println(res.hrisBenefit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHrisBenefitRequest](../../models/operations/GetHrisBenefitRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHrisBenefitResponse](../../models/operations/GetHrisBenefitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisBenefits

Returns a list of HrisBenefits. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisBenefits" method="get" path="/hris/{connection_id}/benefit" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisBenefitsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisBenefitsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisBenefitsRequest req = ListHrisBenefitsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisBenefitsResponse res = sdk.benefit().listHrisBenefits()
                .request(req)
                .call();

        if (res.hrisBenefits().isPresent()) {
            System.out.println(res.hrisBenefits().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListHrisBenefitsRequest](../../models/operations/ListHrisBenefitsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListHrisBenefitsResponse](../../models/operations/ListHrisBenefitsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisBenefit

Updates the HrisBenefit identified by `id`. Provide the unified HrisBenefit fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisBenefit" method="patch" path="/hris/{connection_id}/benefit/{id}" example="hris_benefit" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisBenefitRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisBenefitResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisBenefitRequest req = PatchHrisBenefitRequest.builder()
                .hrisBenefit(HrisBenefit.builder()
                    .coverageLevel(CoverageLevel.EMPLOYEE_SPOUSE)
                    .createdAt(OffsetDateTime.parse("2020-06-11T01:24:05.654Z"))
                    .currency("GBP")
                    .description("Vomito voluptas dolor sed.")
                    .employerContributionAmount(185006d)
                    .employerContributionMaxAmount(179093d)
                    .employerContributionType(EmployerContributionType.PERCENTAGE)
                    .frequency(HrisBenefitFrequency.MONTH)
                    .id("7bad80a5-2a97-4c1c-8c30-7d26eabda80b")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Frozen Wooden Ball")
                    .tax(Tax.PRE_TAX)
                    .type(HrisBenefitType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2023-03-21T07:14:16.558Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisBenefitResponse res = sdk.benefit().patchHrisBenefit()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            System.out.println(res.hrisBenefit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchHrisBenefitRequest](../../models/operations/PatchHrisBenefitRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchHrisBenefitResponse](../../models/operations/PatchHrisBenefitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisBenefit

Deletes the HrisBenefit identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisBenefit" method="delete" path="/hris/{connection_id}/benefit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBenefitRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBenefitResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisBenefitRequest req = RemoveHrisBenefitRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisBenefitResponse res = sdk.benefit().removeHrisBenefit()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveHrisBenefitRequest](../../models/operations/RemoveHrisBenefitRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveHrisBenefitResponse](../../models/operations/RemoveHrisBenefitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisBenefit

Updates the HrisBenefit identified by `id`. Provide the unified HrisBenefit fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisBenefit" method="put" path="/hris/{connection_id}/benefit/{id}" example="hris_benefit" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBenefitRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBenefitResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisBenefitRequest req = UpdateHrisBenefitRequest.builder()
                .hrisBenefit(HrisBenefit.builder()
                    .coverageLevel(CoverageLevel.EMPLOYEE_SPOUSE)
                    .createdAt(OffsetDateTime.parse("2020-06-11T01:24:05.654Z"))
                    .currency("GBP")
                    .description("Vomito voluptas dolor sed.")
                    .employerContributionAmount(185006d)
                    .employerContributionMaxAmount(179093d)
                    .employerContributionType(EmployerContributionType.PERCENTAGE)
                    .frequency(HrisBenefitFrequency.MONTH)
                    .id("7bad80a5-2a97-4c1c-8c30-7d26eabda80b")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Frozen Wooden Ball")
                    .tax(Tax.PRE_TAX)
                    .type(HrisBenefitType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2023-03-21T07:14:16.558Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisBenefitResponse res = sdk.benefit().updateHrisBenefit()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            System.out.println(res.hrisBenefit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateHrisBenefitRequest](../../models/operations/UpdateHrisBenefitRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateHrisBenefitResponse](../../models/operations/UpdateHrisBenefitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |