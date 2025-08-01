# Report
(*report()*)

## Overview

### Available Operations

* [getAccountingReport](#getaccountingreport) - Retrieve a report
* [listAccountingReports](#listaccountingreports) - List all reports

## getAccountingReport

Retrieve a report

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingReport" method="get" path="/accounting/{connection_id}/report/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingReportRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingReportResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingReportRequest req = GetAccountingReportRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingReportResponse res = sdk.report().getAccountingReport()
                .request(req)
                .call();

        if (res.accountingReport().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetAccountingReportRequest](../../models/operations/GetAccountingReportRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetAccountingReportResponse](../../models/operations/GetAccountingReportResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingReports

List all reports

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingReports" method="get" path="/accounting/{connection_id}/report" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingReportsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingReportsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingReportsRequest req = ListAccountingReportsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingReportsResponse res = sdk.report().listAccountingReports()
                .request(req)
                .call();

        if (res.accountingReports().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListAccountingReportsRequest](../../models/operations/ListAccountingReportsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListAccountingReportsResponse](../../models/operations/ListAccountingReportsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |