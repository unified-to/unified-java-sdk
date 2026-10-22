# Session

## Overview

### Available Operations

* [getAnalyticsSession](#getanalyticssession) - Retrieve a session
* [listAnalyticsSessions](#listanalyticssessions) - List all sessions

## getAnalyticsSession

Retrieves a single AnalyticsSession by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAnalyticsSession" method="get" path="/analytics/{connection_id}/session/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsSessionRequest;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsSessionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAnalyticsSessionRequest req = GetAnalyticsSessionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAnalyticsSessionResponse res = sdk.session().getAnalyticsSession()
                .request(req)
                .call();

        if (res.analyticsSession().isPresent()) {
            System.out.println(res.analyticsSession().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetAnalyticsSessionRequest](../../models/operations/GetAnalyticsSessionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetAnalyticsSessionResponse](../../models/operations/GetAnalyticsSessionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAnalyticsSessions

Returns a list of AnalyticsSessions. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAnalyticsSessions" method="get" path="/analytics/{connection_id}/session" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsSessionsRequest;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsSessionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAnalyticsSessionsRequest req = ListAnalyticsSessionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAnalyticsSessionsResponse res = sdk.session().listAnalyticsSessions()
                .request(req)
                .call();

        if (res.analyticsSessions().isPresent()) {
            System.out.println(res.analyticsSessions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListAnalyticsSessionsRequest](../../models/operations/ListAnalyticsSessionsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListAnalyticsSessionsResponse](../../models/operations/ListAnalyticsSessionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |