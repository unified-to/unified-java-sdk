# Feedback

## Overview

### Available Operations

* [createPerformanceFeedback](#createperformancefeedback) - Create a feedback
* [getPerformanceFeedback](#getperformancefeedback) - Retrieve a feedback
* [listPerformanceFeedbacks](#listperformancefeedbacks) - List all feedbacks

## createPerformanceFeedback

Create a feedback

### Example Usage

<!-- UsageSnippet language="java" operationID="createPerformanceFeedback" method="post" path="/performance/{connection_id}/feedback" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePerformanceFeedbackRequest;
import to.unified.unified_java_sdk.models.operations.CreatePerformanceFeedbackResponse;
import to.unified.unified_java_sdk.models.shared.PerformanceFeedback;
import to.unified.unified_java_sdk.models.shared.Security;

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

Retrieve a feedback

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

List all feedbacks

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