# Goal

## Overview

### Available Operations

* [createPerformanceGoal](#createperformancegoal) - Create a goal
* [getPerformanceGoal](#getperformancegoal) - Retrieve a goal
* [listPerformanceGoals](#listperformancegoals) - List all goals
* [patchPerformanceGoal](#patchperformancegoal) - Update a goal
* [removePerformanceGoal](#removeperformancegoal) - Remove a goal
* [updatePerformanceGoal](#updateperformancegoal) - Update a goal

## createPerformanceGoal

Create a goal

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
                    .dueAt(OffsetDateTime.parse("2026-07-29T18:26:44.498Z"))
                    .id("a9caf1a6-5e29-4b93-b2a9-57eb49fb65ae")
                    .metadata(List.of())
                    .milestones(List.of(
                        PerformanceGoalMilestone.builder()
                            .name("Team-oriented secondary matrix")
                            .currentValue(10d)
                            .dueAt(OffsetDateTime.parse("2026-06-03T21:08:32.265Z"))
                            .id("ed8c9f29-dccd-4cfd-a52e-52c1366ea0b1")
                            .isCompleted(true)
                            .targetValue(32d)
                            .unit("%")
                            .weight(7d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Exclusive client-server conglomeration")
                            .currentValue(0d)
                            .dueAt(OffsetDateTime.parse("2026-08-08T11:17:33.230Z"))
                            .id("6890e3f1-ecc2-46a2-964e-9375aac880d7")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Synchronised immersive success")
                            .currentValue(31d)
                            .description("Hic explicabo odit.")
                            .dueAt(OffsetDateTime.parse("2026-10-10T10:07:36.493Z"))
                            .id("632ec6f8-66c0-4970-a1b6-896f9ae91b0d")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build()))
                    .name("Proactive national protocol")
                    .progress(3d)
                    .startAt(OffsetDateTime.parse("2025-07-23T09:13:33.096Z"))
                    .status(PerformanceGoalStatus.CLOSED)
                    .type(PerformanceGoalSchemasType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2022-09-13T01:29:53.520Z"))
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

## getPerformanceGoal

Retrieve a goal

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

## listPerformanceGoals

List all goals

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

Update a goal

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
                    .dueAt(OffsetDateTime.parse("2026-07-29T18:26:44.524Z"))
                    .id("a6bdd2aa-509e-4498-bca2-b492a1f4b5e1")
                    .metadata(List.of())
                    .milestones(List.of(
                        PerformanceGoalMilestone.builder()
                            .name("Team-oriented secondary matrix")
                            .currentValue(10d)
                            .dueAt(OffsetDateTime.parse("2026-06-03T21:08:32.291Z"))
                            .id("c6d044e4-3b42-4334-9305-d8457e0f9db8")
                            .isCompleted(true)
                            .targetValue(32d)
                            .unit("%")
                            .weight(7d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Exclusive client-server conglomeration")
                            .currentValue(0d)
                            .dueAt(OffsetDateTime.parse("2026-08-08T11:17:33.256Z"))
                            .id("00b07a0f-843a-4770-83e8-7be60ff95f55")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Synchronised immersive success")
                            .currentValue(31d)
                            .description("Hic explicabo odit.")
                            .dueAt(OffsetDateTime.parse("2026-10-10T10:07:36.520Z"))
                            .id("874784d6-ca5f-4ce2-8261-0768b4cf9fc5")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build()))
                    .name("Proactive national protocol")
                    .progress(3d)
                    .startAt(OffsetDateTime.parse("2025-07-23T09:13:33.118Z"))
                    .status(PerformanceGoalStatus.CLOSED)
                    .type(PerformanceGoalSchemasType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2022-09-13T01:29:53.531Z"))
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

Remove a goal

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

Update a goal

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
                    .dueAt(OffsetDateTime.parse("2026-07-29T18:26:44.524Z"))
                    .id("a6bdd2aa-509e-4498-bca2-b492a1f4b5e1")
                    .metadata(List.of())
                    .milestones(List.of(
                        PerformanceGoalMilestone.builder()
                            .name("Team-oriented secondary matrix")
                            .currentValue(10d)
                            .dueAt(OffsetDateTime.parse("2026-06-03T21:08:32.291Z"))
                            .id("c6d044e4-3b42-4334-9305-d8457e0f9db8")
                            .isCompleted(true)
                            .targetValue(32d)
                            .unit("%")
                            .weight(7d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Exclusive client-server conglomeration")
                            .currentValue(0d)
                            .dueAt(OffsetDateTime.parse("2026-08-08T11:17:33.256Z"))
                            .id("00b07a0f-843a-4770-83e8-7be60ff95f55")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Synchronised immersive success")
                            .currentValue(31d)
                            .description("Hic explicabo odit.")
                            .dueAt(OffsetDateTime.parse("2026-10-10T10:07:36.520Z"))
                            .id("874784d6-ca5f-4ce2-8261-0768b4cf9fc5")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build()))
                    .name("Proactive national protocol")
                    .progress(3d)
                    .startAt(OffsetDateTime.parse("2025-07-23T09:13:33.118Z"))
                    .status(PerformanceGoalStatus.CLOSED)
                    .type(PerformanceGoalSchemasType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2022-09-13T01:29:53.531Z"))
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