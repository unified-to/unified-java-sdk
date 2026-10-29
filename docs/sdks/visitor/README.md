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

Creates a AnalyticsVisitor. Provide the unified AnalyticsVisitor fields in the request body; they are mapped to the provider's API. Returns the created AnalyticsVisitor.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAnalyticsVisitor" method="post" path="/analytics/{connection_id}/visitor" example="analytics_visitor" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsVisitorRequest;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsVisitorResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAnalyticsVisitorRequest req = CreateAnalyticsVisitorRequest.builder()
                .analyticsVisitor(AnalyticsVisitor.builder()
                    .createdAt(OffsetDateTime.parse("2020-04-16T20:29:48.281Z"))
                    .email("desiree.o.hara@icloud.com")
                    .firstSeenAt(OffsetDateTime.parse("2020-04-16T20:29:48.281Z"))
                    .id("4d8e564b-0bc4-458c-a001-8c6daec9573f")
                    .lastSeenAt(OffsetDateTime.parse("2025-01-16T21:19:10.285Z"))
                    .metadata(Map.ofEntries(
                        Map.entry("segment", PropertyAnalyticsVisitorMetadata.builder()
                            .build())))
                    .totalEvents(2916d)
                    .updatedAt(OffsetDateTime.parse("2025-07-05T20:07:58.800Z"))
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

Retrieves a single AnalyticsVisitor by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Returns a list of AnalyticsVisitors. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Updates the AnalyticsVisitor identified by `id`. Provide the unified AnalyticsVisitor fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAnalyticsVisitor" method="patch" path="/analytics/{connection_id}/visitor/{id}" example="analytics_visitor" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsVisitorRequest;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsVisitorResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAnalyticsVisitorRequest req = PatchAnalyticsVisitorRequest.builder()
                .analyticsVisitor(AnalyticsVisitor.builder()
                    .createdAt(OffsetDateTime.parse("2020-04-16T20:29:48.281Z"))
                    .email("desiree.o.hara@icloud.com")
                    .firstSeenAt(OffsetDateTime.parse("2020-04-16T20:29:48.281Z"))
                    .id("f6f73573-a54c-433f-b313-b1addba0f945")
                    .lastSeenAt(OffsetDateTime.parse("2025-01-16T21:19:10.294Z"))
                    .metadata(Map.ofEntries(
                        Map.entry("segment", PropertyAnalyticsVisitorMetadata.builder()
                            .build())))
                    .totalEvents(2916d)
                    .updatedAt(OffsetDateTime.parse("2025-07-05T20:07:58.811Z"))
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

Deletes the AnalyticsVisitor identified by `id`.

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

Updates the AnalyticsVisitor identified by `id`. Provide the unified AnalyticsVisitor fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAnalyticsVisitor" method="put" path="/analytics/{connection_id}/visitor/{id}" example="analytics_visitor" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsVisitorRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsVisitorResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAnalyticsVisitorRequest req = UpdateAnalyticsVisitorRequest.builder()
                .analyticsVisitor(AnalyticsVisitor.builder()
                    .createdAt(OffsetDateTime.parse("2020-04-16T20:29:48.281Z"))
                    .email("desiree.o.hara@icloud.com")
                    .firstSeenAt(OffsetDateTime.parse("2020-04-16T20:29:48.281Z"))
                    .id("f6f73573-a54c-433f-b313-b1addba0f945")
                    .lastSeenAt(OffsetDateTime.parse("2025-01-16T21:19:10.294Z"))
                    .metadata(Map.ofEntries(
                        Map.entry("segment", PropertyAnalyticsVisitorMetadata.builder()
                            .build())))
                    .totalEvents(2916d)
                    .updatedAt(OffsetDateTime.parse("2025-07-05T20:07:58.811Z"))
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