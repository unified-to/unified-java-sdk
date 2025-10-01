# Issue
(*issue()*)

## Overview

### Available Operations

* [getUnifiedIssue](#getunifiedissue) - Retrieve support issue
* [listUnifiedIssues](#listunifiedissues) - List support issues

## getUnifiedIssue

Retrieve support issue

### Example Usage

<!-- UsageSnippet language="java" operationID="getUnifiedIssue" method="get" path="/unified/issue/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUnifiedIssueRequest;
import to.unified.unified_java_sdk.models.operations.GetUnifiedIssueResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUnifiedIssueRequest req = GetUnifiedIssueRequest.builder()
                .id("<id>")
                .build();

        GetUnifiedIssueResponse res = sdk.issue().getUnifiedIssue()
                .request(req)
                .call();

        if (res.issue().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetUnifiedIssueRequest](../../models/operations/GetUnifiedIssueRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetUnifiedIssueResponse](../../models/operations/GetUnifiedIssueResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUnifiedIssues

List support issues

### Example Usage

<!-- UsageSnippet language="java" operationID="listUnifiedIssues" method="get" path="/unified/issue" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUnifiedIssuesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUnifiedIssuesResponse res = sdk.issue().listUnifiedIssues()
                .call();

        if (res.issues().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListUnifiedIssuesRequest](../../models/operations/ListUnifiedIssuesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListUnifiedIssuesResponse](../../models/operations/ListUnifiedIssuesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |