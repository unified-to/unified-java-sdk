# Insight

## Overview

### Available Operations

* [getSocialInsight](#getsocialinsight) - Retrieve an insight
* [listSocialInsights](#listsocialinsights) - List all insights

## getSocialInsight

Retrieve an insight

### Example Usage

<!-- UsageSnippet language="java" operationID="getSocialInsight" method="get" path="/social/{connection_id}/insight/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetSocialInsightRequest;
import to.unified.unified_java_sdk.models.operations.GetSocialInsightResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetSocialInsightRequest req = GetSocialInsightRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetSocialInsightResponse res = sdk.insight().getSocialInsight()
                .request(req)
                .call();

        if (res.socialInsight().isPresent()) {
            System.out.println(res.socialInsight().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetSocialInsightRequest](../../models/operations/GetSocialInsightRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetSocialInsightResponse](../../models/operations/GetSocialInsightResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSocialInsights

List all insights

### Example Usage

<!-- UsageSnippet language="java" operationID="listSocialInsights" method="get" path="/social/{connection_id}/insight" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListSocialInsightsRequest;
import to.unified.unified_java_sdk.models.operations.ListSocialInsightsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListSocialInsightsRequest req = ListSocialInsightsRequest.builder()
                .connectionId("<id>")
                .build();

        ListSocialInsightsResponse res = sdk.insight().listSocialInsights()
                .request(req)
                .call();

        if (res.socialInsights().isPresent()) {
            System.out.println(res.socialInsights().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListSocialInsightsRequest](../../models/operations/ListSocialInsightsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListSocialInsightsResponse](../../models/operations/ListSocialInsightsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |