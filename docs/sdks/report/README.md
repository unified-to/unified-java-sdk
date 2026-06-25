# Report

## Overview

### Available Operations

* [getAccountingReport2](#getaccountingreport2) - Retrieve a report
* [listAccountingReports2](#listaccountingreports2) - List all reports
* [listAdsReports2](#listadsreports2) - List all reports
* [listAnalyticsReports2](#listanalyticsreports2) - List all reports
* [listMartechReports2](#listmartechreports2) - List all reports

## getAccountingReport2

Retrieve a report

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingReport2" method="get" path="/accounting/{connection_id}/report/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingReport2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingReport2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingReport2Request req = GetAccountingReport2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingReport2Response res = sdk.report().getAccountingReport2()
                .request(req)
                .call();

        if (res.accountingReport().isPresent()) {
            System.out.println(res.accountingReport().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAccountingReport2Request](../../models/operations/GetAccountingReport2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAccountingReport2Response](../../models/operations/GetAccountingReport2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingReports2

List all reports

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingReports2" method="get" path="/accounting/{connection_id}/report" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingReports2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingReports2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingReports2Request req = ListAccountingReports2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingReports2Response res = sdk.report().listAccountingReports2()
                .request(req)
                .call();

        if (res.accountingReports().isPresent()) {
            System.out.println(res.accountingReports().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAccountingReports2Request](../../models/operations/ListAccountingReports2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAccountingReports2Response](../../models/operations/ListAccountingReports2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsReports2

List all reports

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsReports2" method="get" path="/ads/{connection_id}/report" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsReports2Request;
import to.unified.unified_java_sdk.models.operations.ListAdsReports2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsReports2Request req = ListAdsReports2Request.builder()
                .connectionId("<id>")
                .build();

        ListAdsReports2Response res = sdk.report().listAdsReports2()
                .request(req)
                .call();

        if (res.adsReports().isPresent()) {
            System.out.println(res.adsReports().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListAdsReports2Request](../../models/operations/ListAdsReports2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListAdsReports2Response](../../models/operations/ListAdsReports2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAnalyticsReports2

List all reports

### Example Usage

<!-- UsageSnippet language="java" operationID="listAnalyticsReports2" method="get" path="/analytics/{connection_id}/report" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsReports2Request;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsReports2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAnalyticsReports2Request req = ListAnalyticsReports2Request.builder()
                .connectionId("<id>")
                .build();

        ListAnalyticsReports2Response res = sdk.report().listAnalyticsReports2()
                .request(req)
                .call();

        if (res.analyticsReports().isPresent()) {
            System.out.println(res.analyticsReports().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListAnalyticsReports2Request](../../models/operations/ListAnalyticsReports2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListAnalyticsReports2Response](../../models/operations/ListAnalyticsReports2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMartechReports2

List all reports

### Example Usage

<!-- UsageSnippet language="java" operationID="listMartechReports2" method="get" path="/martech/{connection_id}/report" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMartechReports2Request;
import to.unified.unified_java_sdk.models.operations.ListMartechReports2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMartechReports2Request req = ListMartechReports2Request.builder()
                .connectionId("<id>")
                .build();

        ListMartechReports2Response res = sdk.report().listMartechReports2()
                .request(req)
                .call();

        if (res.marketingReports().isPresent()) {
            System.out.println(res.marketingReports().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListMartechReports2Request](../../models/operations/ListMartechReports2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListMartechReports2Response](../../models/operations/ListMartechReports2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |