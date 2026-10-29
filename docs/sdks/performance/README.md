# Performance

## Overview

### Available Operations

* [createPerformanceFeedback](#createperformancefeedback) - Create a feedback
* [createPerformanceGoal](#createperformancegoal) - Create a goal
* [getPerformanceCycle](#getperformancecycle) - Retrieve a cycle
* [getPerformanceFeedback](#getperformancefeedback) - Retrieve a feedback
* [getPerformanceGoal](#getperformancegoal) - Retrieve a goal
* [getPerformanceReview](#getperformancereview) - Retrieve a review
* [listPerformanceCycles](#listperformancecycles) - List all cycles
* [listPerformanceFeedbacks](#listperformancefeedbacks) - List all feedbacks
* [listPerformanceGoals](#listperformancegoals) - List all goals
* [listPerformanceReviews](#listperformancereviews) - List all reviews
* [patchPerformanceGoal](#patchperformancegoal) - Update a goal
* [removePerformanceGoal](#removeperformancegoal) - Remove a goal
* [updatePerformanceGoal](#updateperformancegoal) - Update a goal

## createPerformanceFeedback

Creates a PerformanceFeedback. Provide the unified PerformanceFeedback fields in the request body; they are mapped to the provider's API. Returns the created PerformanceFeedback.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPerformanceFeedback" method="post" path="/performance/{connection_id}/feedback" example="performance_feedback" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePerformanceFeedbackRequest;
import to.unified.unified_java_sdk.models.operations.CreatePerformanceFeedbackResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePerformanceFeedbackRequest req = CreatePerformanceFeedbackRequest.builder()
                .performanceFeedback(PerformanceFeedback.builder()
                    .userId("<id>")
                    .createdAt(OffsetDateTime.parse("2023-04-11T16:21:53.862Z"))
                    .id("487971da-9325-4562-8b4b-24956f138df9")
                    .isVisible(true)
                    .message("Tabernus corpus voluptate aestus.")
                    .metadata(List.of())
                    .tags(List.of(
                        "well-to-do",
                        "hexagon"))
                    .type(PerformanceFeedbackType.PRAISE)
                    .updatedAt(OffsetDateTime.parse("2025-09-09T07:32:48.657Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreatePerformanceFeedbackResponse res = sdk.performance().createPerformanceFeedback()
                .request(req)
                .call();

        if (res.performanceFeedback().isPresent()) {
            System.out.println(res.performanceFeedback().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [CreatePerformanceFeedbackRequest](../../models/operations/CreatePerformanceFeedbackRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[CreatePerformanceFeedbackResponse](../../models/operations/CreatePerformanceFeedbackResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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
                    .dueAt(OffsetDateTime.parse("2026-08-06T04:05:43.525Z"))
                    .id("4da7242b-223e-4e22-8b88-311a6937028b")
                    .metadata(List.of())
                    .milestones(List.of(
                        PerformanceGoalMilestone.builder()
                            .name("Team-oriented secondary matrix")
                            .currentValue(10d)
                            .dueAt(OffsetDateTime.parse("2026-06-11T02:38:34.501Z"))
                            .id("138c3045-2c0b-4261-bc1d-bd2479b8e68b")
                            .isCompleted(true)
                            .targetValue(32d)
                            .unit("%")
                            .weight(7d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Exclusive client-server conglomeration")
                            .currentValue(0d)
                            .dueAt(OffsetDateTime.parse("2026-08-15T21:39:45.246Z"))
                            .id("c04e6a2f-a796-409c-9917-db62feaa6382")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Synchronised immersive success")
                            .currentValue(31d)
                            .description("Hic explicabo odit.")
                            .dueAt(OffsetDateTime.parse("2026-10-18T01:10:13.201Z"))
                            .id("88ed2d2f-3321-4cee-bd12-57bb48d4cb56")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build()))
                    .name("Proactive national protocol")
                    .progress(3d)
                    .startAt(OffsetDateTime.parse("2025-07-29T15:18:14.261Z"))
                    .status(PerformanceGoalStatus.CLOSED)
                    .type(PerformanceGoalSchemasType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2022-09-16T02:02:44.321Z"))
                    .weight(5d)
                    .build())
                .connectionId("<id>")
                .build();

        CreatePerformanceGoalResponse res = sdk.performance().createPerformanceGoal()
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

## getPerformanceCycle

Retrieves a single PerformanceCycle by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPerformanceCycle" method="get" path="/performance/{connection_id}/cycle/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPerformanceCycleRequest;
import to.unified.unified_java_sdk.models.operations.GetPerformanceCycleResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPerformanceCycleRequest req = GetPerformanceCycleRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPerformanceCycleResponse res = sdk.performance().getPerformanceCycle()
                .request(req)
                .call();

        if (res.performanceCycle().isPresent()) {
            System.out.println(res.performanceCycle().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetPerformanceCycleRequest](../../models/operations/GetPerformanceCycleRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetPerformanceCycleResponse](../../models/operations/GetPerformanceCycleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPerformanceFeedback

Retrieves a single PerformanceFeedback by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPerformanceFeedback" method="get" path="/performance/{connection_id}/feedback/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPerformanceFeedbackRequest;
import to.unified.unified_java_sdk.models.operations.GetPerformanceFeedbackResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPerformanceFeedbackRequest req = GetPerformanceFeedbackRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPerformanceFeedbackResponse res = sdk.performance().getPerformanceFeedback()
                .request(req)
                .call();

        if (res.performanceFeedback().isPresent()) {
            System.out.println(res.performanceFeedback().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetPerformanceFeedbackRequest](../../models/operations/GetPerformanceFeedbackRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetPerformanceFeedbackResponse](../../models/operations/GetPerformanceFeedbackResponse.md)**

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

        GetPerformanceGoalResponse res = sdk.performance().getPerformanceGoal()
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

## getPerformanceReview

Retrieves a single PerformanceReview by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPerformanceReview" method="get" path="/performance/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPerformanceReviewRequest;
import to.unified.unified_java_sdk.models.operations.GetPerformanceReviewResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPerformanceReviewRequest req = GetPerformanceReviewRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPerformanceReviewResponse res = sdk.performance().getPerformanceReview()
                .request(req)
                .call();

        if (res.performanceReview().isPresent()) {
            System.out.println(res.performanceReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetPerformanceReviewRequest](../../models/operations/GetPerformanceReviewRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetPerformanceReviewResponse](../../models/operations/GetPerformanceReviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPerformanceCycles

Returns a list of PerformanceCycles. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPerformanceCycles" method="get" path="/performance/{connection_id}/cycle" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPerformanceCyclesRequest;
import to.unified.unified_java_sdk.models.operations.ListPerformanceCyclesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPerformanceCyclesRequest req = ListPerformanceCyclesRequest.builder()
                .connectionId("<id>")
                .build();

        ListPerformanceCyclesResponse res = sdk.performance().listPerformanceCycles()
                .request(req)
                .call();

        if (res.performanceCycles().isPresent()) {
            System.out.println(res.performanceCycles().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListPerformanceCyclesRequest](../../models/operations/ListPerformanceCyclesRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListPerformanceCyclesResponse](../../models/operations/ListPerformanceCyclesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPerformanceFeedbacks

Returns a list of PerformanceFeedbacks. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPerformanceFeedbacks" method="get" path="/performance/{connection_id}/feedback" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPerformanceFeedbacksRequest;
import to.unified.unified_java_sdk.models.operations.ListPerformanceFeedbacksResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPerformanceFeedbacksRequest req = ListPerformanceFeedbacksRequest.builder()
                .connectionId("<id>")
                .build();

        ListPerformanceFeedbacksResponse res = sdk.performance().listPerformanceFeedbacks()
                .request(req)
                .call();

        if (res.performanceFeedbacks().isPresent()) {
            System.out.println(res.performanceFeedbacks().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListPerformanceFeedbacksRequest](../../models/operations/ListPerformanceFeedbacksRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListPerformanceFeedbacksResponse](../../models/operations/ListPerformanceFeedbacksResponse.md)**

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

        ListPerformanceGoalsResponse res = sdk.performance().listPerformanceGoals()
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

## listPerformanceReviews

Returns a list of PerformanceReviews. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPerformanceReviews" method="get" path="/performance/{connection_id}/review" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPerformanceReviewsRequest;
import to.unified.unified_java_sdk.models.operations.ListPerformanceReviewsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPerformanceReviewsRequest req = ListPerformanceReviewsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPerformanceReviewsResponse res = sdk.performance().listPerformanceReviews()
                .request(req)
                .call();

        if (res.performanceReviews().isPresent()) {
            System.out.println(res.performanceReviews().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListPerformanceReviewsRequest](../../models/operations/ListPerformanceReviewsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListPerformanceReviewsResponse](../../models/operations/ListPerformanceReviewsResponse.md)**

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
                    .dueAt(OffsetDateTime.parse("2026-08-06T04:05:43.556Z"))
                    .id("7ddf4887-3b19-4b77-81bd-319202550b84")
                    .metadata(List.of())
                    .milestones(List.of(
                        PerformanceGoalMilestone.builder()
                            .name("Team-oriented secondary matrix")
                            .currentValue(10d)
                            .dueAt(OffsetDateTime.parse("2026-06-11T02:38:34.531Z"))
                            .id("e51af406-0ef8-46f7-912f-27500dbd5ba9")
                            .isCompleted(true)
                            .targetValue(32d)
                            .unit("%")
                            .weight(7d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Exclusive client-server conglomeration")
                            .currentValue(0d)
                            .dueAt(OffsetDateTime.parse("2026-08-15T21:39:45.277Z"))
                            .id("b1b7cfb7-076e-4947-8f46-41fb9a113a50")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Synchronised immersive success")
                            .currentValue(31d)
                            .description("Hic explicabo odit.")
                            .dueAt(OffsetDateTime.parse("2026-10-18T01:10:13.233Z"))
                            .id("9b96c6ca-15b1-4d9a-9de6-c5c75cb5cc74")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build()))
                    .name("Proactive national protocol")
                    .progress(3d)
                    .startAt(OffsetDateTime.parse("2025-07-29T15:18:14.287Z"))
                    .status(PerformanceGoalStatus.CLOSED)
                    .type(PerformanceGoalSchemasType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2022-09-16T02:02:44.334Z"))
                    .weight(5d)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPerformanceGoalResponse res = sdk.performance().patchPerformanceGoal()
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

        RemovePerformanceGoalResponse res = sdk.performance().removePerformanceGoal()
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
                    .dueAt(OffsetDateTime.parse("2026-08-06T04:05:43.556Z"))
                    .id("7ddf4887-3b19-4b77-81bd-319202550b84")
                    .metadata(List.of())
                    .milestones(List.of(
                        PerformanceGoalMilestone.builder()
                            .name("Team-oriented secondary matrix")
                            .currentValue(10d)
                            .dueAt(OffsetDateTime.parse("2026-06-11T02:38:34.531Z"))
                            .id("e51af406-0ef8-46f7-912f-27500dbd5ba9")
                            .isCompleted(true)
                            .targetValue(32d)
                            .unit("%")
                            .weight(7d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Exclusive client-server conglomeration")
                            .currentValue(0d)
                            .dueAt(OffsetDateTime.parse("2026-08-15T21:39:45.277Z"))
                            .id("b1b7cfb7-076e-4947-8f46-41fb9a113a50")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Synchronised immersive success")
                            .currentValue(31d)
                            .description("Hic explicabo odit.")
                            .dueAt(OffsetDateTime.parse("2026-10-18T01:10:13.233Z"))
                            .id("9b96c6ca-15b1-4d9a-9de6-c5c75cb5cc74")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build()))
                    .name("Proactive national protocol")
                    .progress(3d)
                    .startAt(OffsetDateTime.parse("2025-07-29T15:18:14.287Z"))
                    .status(PerformanceGoalStatus.CLOSED)
                    .type(PerformanceGoalSchemasType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2022-09-16T02:02:44.334Z"))
                    .weight(5d)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePerformanceGoalResponse res = sdk.performance().updatePerformanceGoal()
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