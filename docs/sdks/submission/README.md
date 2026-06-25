# Submission

## Overview

### Available Operations

* [getFormsSubmission2](#getformssubmission2) - Retrieve a submission
* [listFormsSubmissions2](#listformssubmissions2) - List all submissions

## getFormsSubmission2

Retrieve a submission

### Example Usage

<!-- UsageSnippet language="java" operationID="getFormsSubmission2" method="get" path="/forms/{connection_id}/submission/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetFormsSubmission2Request;
import to.unified.unified_java_sdk.models.operations.GetFormsSubmission2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetFormsSubmission2Request req = GetFormsSubmission2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetFormsSubmission2Response res = sdk.submission().getFormsSubmission2()
                .request(req)
                .call();

        if (res.formsSubmission().isPresent()) {
            System.out.println(res.formsSubmission().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetFormsSubmission2Request](../../models/operations/GetFormsSubmission2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetFormsSubmission2Response](../../models/operations/GetFormsSubmission2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listFormsSubmissions2

List all submissions

### Example Usage

<!-- UsageSnippet language="java" operationID="listFormsSubmissions2" method="get" path="/forms/{connection_id}/submission" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListFormsSubmissions2Request;
import to.unified.unified_java_sdk.models.operations.ListFormsSubmissions2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListFormsSubmissions2Request req = ListFormsSubmissions2Request.builder()
                .connectionId("<id>")
                .build();

        ListFormsSubmissions2Response res = sdk.submission().listFormsSubmissions2()
                .request(req)
                .call();

        if (res.formsSubmissions().isPresent()) {
            System.out.println(res.formsSubmissions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListFormsSubmissions2Request](../../models/operations/ListFormsSubmissions2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListFormsSubmissions2Response](../../models/operations/ListFormsSubmissions2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |