# Session

## Overview

### Available Operations

* [getAnalyticsSession2](#getanalyticssession2) - Retrieve a session
* [listAnalyticsSessions2](#listanalyticssessions2) - List all sessions

## getAnalyticsSession2

Retrieve a session

### Example Usage

<!-- UsageSnippet language="java" operationID="getAnalyticsSession2" method="get" path="/analytics/{connection_id}/session/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsSession2Request;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsSession2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAnalyticsSession2Request req = GetAnalyticsSession2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAnalyticsSession2Response res = sdk.session().getAnalyticsSession2()
                .request(req)
                .call();

        if (res.analyticsSession().isPresent()) {
            System.out.println(res.analyticsSession().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAnalyticsSession2Request](../../models/operations/GetAnalyticsSession2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAnalyticsSession2Response](../../models/operations/GetAnalyticsSession2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAnalyticsSessions2

List all sessions

### Example Usage

<!-- UsageSnippet language="java" operationID="listAnalyticsSessions2" method="get" path="/analytics/{connection_id}/session" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsSessions2Request;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsSessions2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAnalyticsSessions2Request req = ListAnalyticsSessions2Request.builder()
                .connectionId("<id>")
                .build();

        ListAnalyticsSessions2Response res = sdk.session().listAnalyticsSessions2()
                .request(req)
                .call();

        if (res.analyticsSessions().isPresent()) {
            System.out.println(res.analyticsSessions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAnalyticsSessions2Request](../../models/operations/ListAnalyticsSessions2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAnalyticsSessions2Response](../../models/operations/ListAnalyticsSessions2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |