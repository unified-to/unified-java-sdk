# Insight

## Overview

### Available Operations

* [getSocialInsight](#getsocialinsight) - Retrieve an insight
* [listSocialInsights](#listsocialinsights) - List all insights

## getSocialInsight

Retrieves a single SocialInsight by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Returns a list of SocialInsights. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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