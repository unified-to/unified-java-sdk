# Goal

## Overview

### Available Operations

* [createPerformanceGoal](#createperformancegoal) - Create a goal
* [getHealthcareGoal](#gethealthcaregoal) - Retrieve a goal
* [getPerformanceGoal](#getperformancegoal) - Retrieve a goal
* [listHealthcareGoals](#listhealthcaregoals) - List all goals
* [listPerformanceGoals](#listperformancegoals) - List all goals
* [patchPerformanceGoal](#patchperformancegoal) - Update a goal
* [removePerformanceGoal](#removeperformancegoal) - Remove a goal
* [updatePerformanceGoal](#updateperformancegoal) - Update a goal

## createPerformanceGoal

Creates a PerformanceGoal. Provide the unified PerformanceGoal fields in the request body; they are mapped to the provider's API. Returns the created PerformanceGoal.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPerformanceGoal" method="post" path="/performance/{connection_id}/goal" example="performance_goal" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePerformanceGoalRequest;
import to.unified.unified_java_sdk.models.operations.CreatePerformanceGoalResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePerformanceGoalRequest req = CreatePerformanceGoalRequest.builder()
                .performanceGoal(PerformanceGoal.builder()
                    .createdAt(OffsetDateTime.parse("2020-01-09T20:43:07.380Z"))
                    .description("Vel facere valeo vallum degero vado thymum patruus.")
                    .dueAt(OffsetDateTime.parse("2026-09-03T12:59:59.002Z"))
                    .id("fddb90a7-ac37-4e4b-95e4-ba63c5ee97d9")
                    .metadata(List.of())
                    .milestones(List.of(
                        PerformanceGoalMilestone.builder()
                            .name("Balanced system-worthy collaboration")
                            .currentValue(10d)
                            .dueAt(OffsetDateTime.parse("2026-07-08T19:38:39.536Z"))
                            .id("d971d348-83e4-47bd-b872-8cd0be5e7078")
                            .isCompleted(true)
                            .targetValue(32d)
                            .unit("%")
                            .weight(7d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Persevering zero tolerance forecast")
                            .currentValue(0d)
                            .dueAt(OffsetDateTime.parse("2026-09-13T09:19:39.255Z"))
                            .id("62f583fa-f932-4a15-a025-4d61a2e9437f")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Networked logistical toolset")
                            .currentValue(31d)
                            .description("Adiuvo ullus magnam eos cohors.")
                            .dueAt(OffsetDateTime.parse("2026-11-16T06:44:53.686Z"))
                            .id("44f4217c-6592-4327-9db7-f9b7205f9eb5")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build()))
                    .name("User-centric radical parallelism")
                    .progress(3d)
                    .startAt(OffsetDateTime.parse("2025-08-22T14:31:49.502Z"))
                    .status(PerformanceGoalStatus.CLOSED)
                    .type(PerformanceGoalSchemasType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2022-09-27T16:06:32.137Z"))
                    .weight(5d)
                    .build())
                .connectionId("<id>")
                .build();

        CreatePerformanceGoalResponse res = sdk.goal().createPerformanceGoal()
                .request(req)
                .call();

        if (res.performanceGoal().isPresent()) {
            System.out.println(res.performanceGoal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreatePerformanceGoalRequest](../../models/operations/CreatePerformanceGoalRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreatePerformanceGoalResponse](../../models/operations/CreatePerformanceGoalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHealthcareGoal

Retrieves a single HealthcareGoal by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareGoal" method="get" path="/healthcare/{connection_id}/goal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareGoalRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareGoalResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareGoalRequest req = GetHealthcareGoalRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareGoalResponse res = sdk.goal().getHealthcareGoal()
                .request(req)
                .call();

        if (res.healthcareGoal().isPresent()) {
            System.out.println(res.healthcareGoal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetHealthcareGoalRequest](../../models/operations/GetHealthcareGoalRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetHealthcareGoalResponse](../../models/operations/GetHealthcareGoalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPerformanceGoal

Retrieves a single PerformanceGoal by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPerformanceGoal" method="get" path="/performance/{connection_id}/goal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPerformanceGoalRequest;
import to.unified.unified_java_sdk.models.operations.GetPerformanceGoalResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPerformanceGoalRequest req = GetPerformanceGoalRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPerformanceGoalResponse res = sdk.goal().getPerformanceGoal()
                .request(req)
                .call();

        if (res.performanceGoal().isPresent()) {
            System.out.println(res.performanceGoal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetPerformanceGoalRequest](../../models/operations/GetPerformanceGoalRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetPerformanceGoalResponse](../../models/operations/GetPerformanceGoalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareGoals

Returns a list of HealthcareGoals. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareGoals" method="get" path="/healthcare/{connection_id}/goal" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareGoalsRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareGoalsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareGoalsRequest req = ListHealthcareGoalsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareGoalsResponse res = sdk.goal().listHealthcareGoals()
                .request(req)
                .call();

        if (res.healthcareGoals().isPresent()) {
            System.out.println(res.healthcareGoals().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListHealthcareGoalsRequest](../../models/operations/ListHealthcareGoalsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListHealthcareGoalsResponse](../../models/operations/ListHealthcareGoalsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPerformanceGoals

Returns a list of PerformanceGoals. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPerformanceGoals" method="get" path="/performance/{connection_id}/goal" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPerformanceGoalsRequest;
import to.unified.unified_java_sdk.models.operations.ListPerformanceGoalsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPerformanceGoalsRequest req = ListPerformanceGoalsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPerformanceGoalsResponse res = sdk.goal().listPerformanceGoals()
                .request(req)
                .call();

        if (res.performanceGoals().isPresent()) {
            System.out.println(res.performanceGoals().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListPerformanceGoalsRequest](../../models/operations/ListPerformanceGoalsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListPerformanceGoalsResponse](../../models/operations/ListPerformanceGoalsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPerformanceGoal

Updates the PerformanceGoal identified by `id`. Provide the unified PerformanceGoal fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPerformanceGoal" method="patch" path="/performance/{connection_id}/goal/{id}" example="performance_goal" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPerformanceGoalRequest;
import to.unified.unified_java_sdk.models.operations.PatchPerformanceGoalResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPerformanceGoalRequest req = PatchPerformanceGoalRequest.builder()
                .performanceGoal(PerformanceGoal.builder()
                    .createdAt(OffsetDateTime.parse("2020-01-09T20:43:07.380Z"))
                    .description("Vel facere valeo vallum degero vado thymum patruus.")
                    .dueAt(OffsetDateTime.parse("2026-09-03T12:59:59.019Z"))
                    .id("24cb294e-ca57-4b15-b9cb-6f1a06e8d3b7")
                    .metadata(List.of())
                    .milestones(List.of(
                        PerformanceGoalMilestone.builder()
                            .name("Balanced system-worthy collaboration")
                            .currentValue(10d)
                            .dueAt(OffsetDateTime.parse("2026-07-08T19:38:39.552Z"))
                            .id("e4de403d-ffc7-45dc-be08-bf8b454ac29e")
                            .isCompleted(true)
                            .targetValue(32d)
                            .unit("%")
                            .weight(7d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Persevering zero tolerance forecast")
                            .currentValue(0d)
                            .dueAt(OffsetDateTime.parse("2026-09-13T09:19:39.272Z"))
                            .id("0a182ec4-4b10-43af-9eb2-03f74b8f033b")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Networked logistical toolset")
                            .currentValue(31d)
                            .description("Adiuvo ullus magnam eos cohors.")
                            .dueAt(OffsetDateTime.parse("2026-11-16T06:44:53.704Z"))
                            .id("124eb631-e87c-453a-8a95-f34660f25616")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build()))
                    .name("User-centric radical parallelism")
                    .progress(3d)
                    .startAt(OffsetDateTime.parse("2025-08-22T14:31:49.515Z"))
                    .status(PerformanceGoalStatus.CLOSED)
                    .type(PerformanceGoalSchemasType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2022-09-27T16:06:32.144Z"))
                    .weight(5d)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPerformanceGoalResponse res = sdk.goal().patchPerformanceGoal()
                .request(req)
                .call();

        if (res.performanceGoal().isPresent()) {
            System.out.println(res.performanceGoal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchPerformanceGoalRequest](../../models/operations/PatchPerformanceGoalRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchPerformanceGoalResponse](../../models/operations/PatchPerformanceGoalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removePerformanceGoal

Deletes the PerformanceGoal identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removePerformanceGoal" method="delete" path="/performance/{connection_id}/goal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemovePerformanceGoalRequest;
import to.unified.unified_java_sdk.models.operations.RemovePerformanceGoalResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemovePerformanceGoalRequest req = RemovePerformanceGoalRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemovePerformanceGoalResponse res = sdk.goal().removePerformanceGoal()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemovePerformanceGoalRequest](../../models/operations/RemovePerformanceGoalRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemovePerformanceGoalResponse](../../models/operations/RemovePerformanceGoalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePerformanceGoal

Updates the PerformanceGoal identified by `id`. Provide the unified PerformanceGoal fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePerformanceGoal" method="put" path="/performance/{connection_id}/goal/{id}" example="performance_goal" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePerformanceGoalRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePerformanceGoalResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePerformanceGoalRequest req = UpdatePerformanceGoalRequest.builder()
                .performanceGoal(PerformanceGoal.builder()
                    .createdAt(OffsetDateTime.parse("2020-01-09T20:43:07.380Z"))
                    .description("Vel facere valeo vallum degero vado thymum patruus.")
                    .dueAt(OffsetDateTime.parse("2026-09-03T12:59:59.019Z"))
                    .id("24cb294e-ca57-4b15-b9cb-6f1a06e8d3b7")
                    .metadata(List.of())
                    .milestones(List.of(
                        PerformanceGoalMilestone.builder()
                            .name("Balanced system-worthy collaboration")
                            .currentValue(10d)
                            .dueAt(OffsetDateTime.parse("2026-07-08T19:38:39.552Z"))
                            .id("e4de403d-ffc7-45dc-be08-bf8b454ac29e")
                            .isCompleted(true)
                            .targetValue(32d)
                            .unit("%")
                            .weight(7d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Persevering zero tolerance forecast")
                            .currentValue(0d)
                            .dueAt(OffsetDateTime.parse("2026-09-13T09:19:39.272Z"))
                            .id("0a182ec4-4b10-43af-9eb2-03f74b8f033b")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Networked logistical toolset")
                            .currentValue(31d)
                            .description("Adiuvo ullus magnam eos cohors.")
                            .dueAt(OffsetDateTime.parse("2026-11-16T06:44:53.704Z"))
                            .id("124eb631-e87c-453a-8a95-f34660f25616")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build()))
                    .name("User-centric radical parallelism")
                    .progress(3d)
                    .startAt(OffsetDateTime.parse("2025-08-22T14:31:49.515Z"))
                    .status(PerformanceGoalStatus.CLOSED)
                    .type(PerformanceGoalSchemasType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2022-09-27T16:06:32.144Z"))
                    .weight(5d)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePerformanceGoalResponse res = sdk.goal().updatePerformanceGoal()
                .request(req)
                .call();

        if (res.performanceGoal().isPresent()) {
            System.out.println(res.performanceGoal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdatePerformanceGoalRequest](../../models/operations/UpdatePerformanceGoalRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdatePerformanceGoalResponse](../../models/operations/UpdatePerformanceGoalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |