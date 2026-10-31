# Feedback

## Overview

### Available Operations

* [createPerformanceFeedback](#createperformancefeedback) - Create a feedback
* [getPerformanceFeedback](#getperformancefeedback) - Retrieve a feedback
* [listPerformanceFeedbacks](#listperformancefeedbacks) - List all feedbacks

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
                    .id("025c7137-33e5-4690-888e-93d4ed415672")
                    .isVisible(true)
                    .message("Tabernus corpus voluptate aestus.")
                    .metadata(List.of())
                    .tags(List.of(
                        "well-to-do",
                        "hexagon"))
                    .type(PerformanceFeedbackType.PRAISE)
                    .updatedAt(OffsetDateTime.parse("2025-09-10T20:06:34.979Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreatePerformanceFeedbackResponse res = sdk.feedback().createPerformanceFeedback()
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

        GetPerformanceFeedbackResponse res = sdk.feedback().getPerformanceFeedback()
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

        ListPerformanceFeedbacksResponse res = sdk.feedback().listPerformanceFeedbacks()
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