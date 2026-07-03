# Visitor

## Overview

### Available Operations

* [createAnalyticsVisitor](#createanalyticsvisitor) - Create a visitor
* [getAnalyticsVisitor](#getanalyticsvisitor) - Retrieve a visitor
* [listAnalyticsVisitors](#listanalyticsvisitors) - List all visitors
* [patchAnalyticsVisitor](#patchanalyticsvisitor) - Update a visitor
* [removeAnalyticsVisitor](#removeanalyticsvisitor) - Remove a visitor
* [updateAnalyticsVisitor](#updateanalyticsvisitor) - Update a visitor

## createAnalyticsVisitor

Create a visitor

### Example Usage

<!-- UsageSnippet language="java" operationID="createAnalyticsVisitor" method="post" path="/analytics/{connection_id}/visitor" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsVisitorRequest;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsVisitorResponse;
import to.unified.unified_java_sdk.models.shared.AnalyticsVisitor;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAnalyticsVisitorRequest req = CreateAnalyticsVisitorRequest.builder()
                .analyticsVisitor(AnalyticsVisitor.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAnalyticsVisitorResponse res = sdk.visitor().createAnalyticsVisitor()
                .request(req)
                .call();

        if (res.analyticsVisitor().isPresent()) {
            System.out.println(res.analyticsVisitor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateAnalyticsVisitorRequest](../../models/operations/CreateAnalyticsVisitorRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateAnalyticsVisitorResponse](../../models/operations/CreateAnalyticsVisitorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAnalyticsVisitor

Retrieve a visitor

### Example Usage

<!-- UsageSnippet language="java" operationID="getAnalyticsVisitor" method="get" path="/analytics/{connection_id}/visitor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsVisitorRequest;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsVisitorResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAnalyticsVisitorRequest req = GetAnalyticsVisitorRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAnalyticsVisitorResponse res = sdk.visitor().getAnalyticsVisitor()
                .request(req)
                .call();

        if (res.analyticsVisitor().isPresent()) {
            System.out.println(res.analyticsVisitor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetAnalyticsVisitorRequest](../../models/operations/GetAnalyticsVisitorRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetAnalyticsVisitorResponse](../../models/operations/GetAnalyticsVisitorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAnalyticsVisitors

List all visitors

### Example Usage

<!-- UsageSnippet language="java" operationID="listAnalyticsVisitors" method="get" path="/analytics/{connection_id}/visitor" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsVisitorsRequest;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsVisitorsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAnalyticsVisitorsRequest req = ListAnalyticsVisitorsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAnalyticsVisitorsResponse res = sdk.visitor().listAnalyticsVisitors()
                .request(req)
                .call();

        if (res.analyticsVisitors().isPresent()) {
            System.out.println(res.analyticsVisitors().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListAnalyticsVisitorsRequest](../../models/operations/ListAnalyticsVisitorsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListAnalyticsVisitorsResponse](../../models/operations/ListAnalyticsVisitorsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAnalyticsVisitor

Update a visitor

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAnalyticsVisitor" method="patch" path="/analytics/{connection_id}/visitor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsVisitorRequest;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsVisitorResponse;
import to.unified.unified_java_sdk.models.shared.AnalyticsVisitor;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAnalyticsVisitorRequest req = PatchAnalyticsVisitorRequest.builder()
                .analyticsVisitor(AnalyticsVisitor.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAnalyticsVisitorResponse res = sdk.visitor().patchAnalyticsVisitor()
                .request(req)
                .call();

        if (res.analyticsVisitor().isPresent()) {
            System.out.println(res.analyticsVisitor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchAnalyticsVisitorRequest](../../models/operations/PatchAnalyticsVisitorRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchAnalyticsVisitorResponse](../../models/operations/PatchAnalyticsVisitorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAnalyticsVisitor

Remove a visitor

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAnalyticsVisitor" method="delete" path="/analytics/{connection_id}/visitor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAnalyticsVisitorRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAnalyticsVisitorResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAnalyticsVisitorRequest req = RemoveAnalyticsVisitorRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAnalyticsVisitorResponse res = sdk.visitor().removeAnalyticsVisitor()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveAnalyticsVisitorRequest](../../models/operations/RemoveAnalyticsVisitorRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveAnalyticsVisitorResponse](../../models/operations/RemoveAnalyticsVisitorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAnalyticsVisitor

Update a visitor

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAnalyticsVisitor" method="put" path="/analytics/{connection_id}/visitor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsVisitorRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsVisitorResponse;
import to.unified.unified_java_sdk.models.shared.AnalyticsVisitor;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAnalyticsVisitorRequest req = UpdateAnalyticsVisitorRequest.builder()
                .analyticsVisitor(AnalyticsVisitor.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAnalyticsVisitorResponse res = sdk.visitor().updateAnalyticsVisitor()
                .request(req)
                .call();

        if (res.analyticsVisitor().isPresent()) {
            System.out.println(res.analyticsVisitor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateAnalyticsVisitorRequest](../../models/operations/UpdateAnalyticsVisitorRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateAnalyticsVisitorResponse](../../models/operations/UpdateAnalyticsVisitorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |