# Report

## Overview

### Available Operations

* [listAdsReports](#listadsreports) - List all reports
* [listAnalyticsReports](#listanalyticsreports) - List all reports
* [listMartechReports](#listmartechreports) - List all reports

## listAdsReports

List all reports

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsReports" method="get" path="/ads/{connection_id}/report" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsReportsRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsReportsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsReportsRequest req = ListAdsReportsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsReportsResponse res = sdk.report().listAdsReports()
                .request(req)
                .call();

        if (res.adsReports().isPresent()) {
            System.out.println(res.adsReports().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListAdsReportsRequest](../../models/operations/ListAdsReportsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListAdsReportsResponse](../../models/operations/ListAdsReportsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAnalyticsReports

List all reports

### Example Usage

<!-- UsageSnippet language="java" operationID="listAnalyticsReports" method="get" path="/analytics/{connection_id}/report" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsReportsRequest;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsReportsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAnalyticsReportsRequest req = ListAnalyticsReportsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAnalyticsReportsResponse res = sdk.report().listAnalyticsReports()
                .request(req)
                .call();

        if (res.analyticsReports().isPresent()) {
            System.out.println(res.analyticsReports().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListAnalyticsReportsRequest](../../models/operations/ListAnalyticsReportsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListAnalyticsReportsResponse](../../models/operations/ListAnalyticsReportsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMartechReports

List all reports

### Example Usage

<!-- UsageSnippet language="java" operationID="listMartechReports" method="get" path="/martech/{connection_id}/report" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMartechReportsRequest;
import to.unified.unified_java_sdk.models.operations.ListMartechReportsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMartechReportsRequest req = ListMartechReportsRequest.builder()
                .connectionId("<id>")
                .build();

        ListMartechReportsResponse res = sdk.report().listMartechReports()
                .request(req)
                .call();

        if (res.marketingReports().isPresent()) {
            System.out.println(res.marketingReports().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListMartechReportsRequest](../../models/operations/ListMartechReportsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListMartechReportsResponse](../../models/operations/ListMartechReportsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |