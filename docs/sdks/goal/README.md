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
                    .description("Suscipit suspendo vulnero vel facere valeo vallum degero.")
                    .dueAt(OffsetDateTime.parse("2026-08-23T21:14:53.876Z"))
                    .id("42ba9a5d-b1ba-4df7-aca5-9386ba9a9d1f")
                    .metadata(List.of())
                    .milestones(List.of(
                        PerformanceGoalMilestone.builder()
                            .name("Team-oriented secondary matrix")
                            .currentValue(10d)
                            .dueAt(OffsetDateTime.parse("2026-06-28T09:51:57.992Z"))
                            .id("4e5621de-d614-450d-8364-a9e82314881f")
                            .isCompleted(true)
                            .targetValue(32d)
                            .unit("%")
                            .weight(7d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Exclusive client-server conglomeration")
                            .currentValue(0d)
                            .dueAt(OffsetDateTime.parse("2026-09-02T16:32:21.161Z"))
                            .id("9293c199-349e-4840-b22e-d2fe64c5e6c7")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Synchronised immersive success")
                            .currentValue(31d)
                            .description("Hic explicabo odit.")
                            .dueAt(OffsetDateTime.parse("2026-11-05T07:13:54.114Z"))
                            .id("5d8527a8-1f2b-4332-8dda-6e73851428fd")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build()))
                    .name("Proactive national protocol")
                    .progress(3d)
                    .startAt(OffsetDateTime.parse("2025-08-13T14:28:19.834Z"))
                    .status(PerformanceGoalStatus.CLOSED)
                    .type(PerformanceGoalSchemasType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2022-09-23T07:40:00.548Z"))
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
                    .description("Suscipit suspendo vulnero vel facere valeo vallum degero.")
                    .dueAt(OffsetDateTime.parse("2026-08-23T21:14:53.887Z"))
                    .id("d08b4429-26f7-44f0-a183-463d2c5e2103")
                    .metadata(List.of())
                    .milestones(List.of(
                        PerformanceGoalMilestone.builder()
                            .name("Team-oriented secondary matrix")
                            .currentValue(10d)
                            .dueAt(OffsetDateTime.parse("2026-06-28T09:51:58.003Z"))
                            .id("c41e79a6-bf47-4ff7-a6ce-e3ff99c432ce")
                            .isCompleted(true)
                            .targetValue(32d)
                            .unit("%")
                            .weight(7d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Exclusive client-server conglomeration")
                            .currentValue(0d)
                            .dueAt(OffsetDateTime.parse("2026-09-02T16:32:21.172Z"))
                            .id("401738de-979a-4a26-801c-db867cc8e6ec")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Synchronised immersive success")
                            .currentValue(31d)
                            .description("Hic explicabo odit.")
                            .dueAt(OffsetDateTime.parse("2026-11-05T07:13:54.126Z"))
                            .id("6eea3b5d-65e0-4f72-a047-617bb7bf5ae0")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build()))
                    .name("Proactive national protocol")
                    .progress(3d)
                    .startAt(OffsetDateTime.parse("2025-08-13T14:28:19.843Z"))
                    .status(PerformanceGoalStatus.CLOSED)
                    .type(PerformanceGoalSchemasType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2022-09-23T07:40:00.553Z"))
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
                    .description("Suscipit suspendo vulnero vel facere valeo vallum degero.")
                    .dueAt(OffsetDateTime.parse("2026-08-23T21:14:53.887Z"))
                    .id("d08b4429-26f7-44f0-a183-463d2c5e2103")
                    .metadata(List.of())
                    .milestones(List.of(
                        PerformanceGoalMilestone.builder()
                            .name("Team-oriented secondary matrix")
                            .currentValue(10d)
                            .dueAt(OffsetDateTime.parse("2026-06-28T09:51:58.003Z"))
                            .id("c41e79a6-bf47-4ff7-a6ce-e3ff99c432ce")
                            .isCompleted(true)
                            .targetValue(32d)
                            .unit("%")
                            .weight(7d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Exclusive client-server conglomeration")
                            .currentValue(0d)
                            .dueAt(OffsetDateTime.parse("2026-09-02T16:32:21.172Z"))
                            .id("401738de-979a-4a26-801c-db867cc8e6ec")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Synchronised immersive success")
                            .currentValue(31d)
                            .description("Hic explicabo odit.")
                            .dueAt(OffsetDateTime.parse("2026-11-05T07:13:54.126Z"))
                            .id("6eea3b5d-65e0-4f72-a047-617bb7bf5ae0")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build()))
                    .name("Proactive national protocol")
                    .progress(3d)
                    .startAt(OffsetDateTime.parse("2025-08-13T14:28:19.843Z"))
                    .status(PerformanceGoalStatus.CLOSED)
                    .type(PerformanceGoalSchemasType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2022-09-23T07:40:00.553Z"))
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