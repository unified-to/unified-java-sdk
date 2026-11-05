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
                    .id("5050df49-9fe7-4bf1-aee4-781e9d1ee1a5")
                    .isVisible(true)
                    .message("Tabernus corpus voluptate aestus.")
                    .metadata(List.of())
                    .tags(List.of(
                        "well-to-do",
                        "hexagon"))
                    .type(PerformanceFeedbackType.PRAISE)
                    .updatedAt(OffsetDateTime.parse("2025-09-14T04:54:53.075Z"))
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
                    .dueAt(OffsetDateTime.parse("2026-08-13T02:49:23.721Z"))
                    .id("bda4f0ec-515a-4702-a82b-a31a3e4f7e53")
                    .metadata(List.of())
                    .milestones(List.of(
                        PerformanceGoalMilestone.builder()
                            .name("Team-oriented secondary matrix")
                            .currentValue(10d)
                            .dueAt(OffsetDateTime.parse("2026-06-17T21:28:36.219Z"))
                            .id("17ad334f-0bbe-4ab3-b731-b2def7b55ff3")
                            .isCompleted(true)
                            .targetValue(32d)
                            .unit("%")
                            .weight(7d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Exclusive client-server conglomeration")
                            .currentValue(0d)
                            .dueAt(OffsetDateTime.parse("2026-08-22T21:03:59.014Z"))
                            .id("93e5c3ab-fd62-44e8-a851-788527196992")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Synchronised immersive success")
                            .currentValue(31d)
                            .description("Hic explicabo odit.")
                            .dueAt(OffsetDateTime.parse("2026-10-25T04:57:37.280Z"))
                            .id("52053099-df79-4240-b345-96e81e5c6ef1")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build()))
                    .name("Proactive national protocol")
                    .progress(3d)
                    .startAt(OffsetDateTime.parse("2025-08-04T12:09:18.964Z"))
                    .status(PerformanceGoalStatus.CLOSED)
                    .type(PerformanceGoalSchemasType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2022-09-18T22:07:58.353Z"))
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
                    .dueAt(OffsetDateTime.parse("2026-08-13T02:49:23.744Z"))
                    .id("1546ede2-fb0c-448f-bc69-92f0ce3021f3")
                    .metadata(List.of())
                    .milestones(List.of(
                        PerformanceGoalMilestone.builder()
                            .name("Team-oriented secondary matrix")
                            .currentValue(10d)
                            .dueAt(OffsetDateTime.parse("2026-06-17T21:28:36.241Z"))
                            .id("d9a0a1fd-2483-4a39-98bb-dc999820dd97")
                            .isCompleted(true)
                            .targetValue(32d)
                            .unit("%")
                            .weight(7d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Exclusive client-server conglomeration")
                            .currentValue(0d)
                            .dueAt(OffsetDateTime.parse("2026-08-22T21:03:59.038Z"))
                            .id("dd4dcc48-59eb-4584-aaba-45c84d76c03e")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Synchronised immersive success")
                            .currentValue(31d)
                            .description("Hic explicabo odit.")
                            .dueAt(OffsetDateTime.parse("2026-10-25T04:57:37.304Z"))
                            .id("15fe5dd5-ed1a-43f7-90dc-64d359949a42")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build()))
                    .name("Proactive national protocol")
                    .progress(3d)
                    .startAt(OffsetDateTime.parse("2025-08-04T12:09:18.983Z"))
                    .status(PerformanceGoalStatus.CLOSED)
                    .type(PerformanceGoalSchemasType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2022-09-18T22:07:58.362Z"))
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
                    .dueAt(OffsetDateTime.parse("2026-08-13T02:49:23.744Z"))
                    .id("1546ede2-fb0c-448f-bc69-92f0ce3021f3")
                    .metadata(List.of())
                    .milestones(List.of(
                        PerformanceGoalMilestone.builder()
                            .name("Team-oriented secondary matrix")
                            .currentValue(10d)
                            .dueAt(OffsetDateTime.parse("2026-06-17T21:28:36.241Z"))
                            .id("d9a0a1fd-2483-4a39-98bb-dc999820dd97")
                            .isCompleted(true)
                            .targetValue(32d)
                            .unit("%")
                            .weight(7d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Exclusive client-server conglomeration")
                            .currentValue(0d)
                            .dueAt(OffsetDateTime.parse("2026-08-22T21:03:59.038Z"))
                            .id("dd4dcc48-59eb-4584-aaba-45c84d76c03e")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build(),
                        PerformanceGoalMilestone.builder()
                            .name("Synchronised immersive success")
                            .currentValue(31d)
                            .description("Hic explicabo odit.")
                            .dueAt(OffsetDateTime.parse("2026-10-25T04:57:37.304Z"))
                            .id("15fe5dd5-ed1a-43f7-90dc-64d359949a42")
                            .isCompleted(true)
                            .targetValue(32d)
                            .weight(5d)
                            .build()))
                    .name("Proactive national protocol")
                    .progress(3d)
                    .startAt(OffsetDateTime.parse("2025-08-04T12:09:18.983Z"))
                    .status(PerformanceGoalStatus.CLOSED)
                    .type(PerformanceGoalSchemasType.COMPANY)
                    .updatedAt(OffsetDateTime.parse("2022-09-18T22:07:58.362Z"))
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