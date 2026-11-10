# Social

## Overview

### Available Operations

* [createSocialComment](#createsocialcomment) - Create a comment
* [createSocialPost](#createsocialpost) - Create a post
* [getSocialComment](#getsocialcomment) - Retrieve a comment
* [getSocialInsight](#getsocialinsight) - Retrieve an insight
* [getSocialPost](#getsocialpost) - Retrieve a post
* [getSocialProfile](#getsocialprofile) - Retrieve a profile
* [getSocialReview](#getsocialreview) - Retrieve a review
* [listSocialComments](#listsocialcomments) - List all comments
* [listSocialInsights](#listsocialinsights) - List all insights
* [listSocialPosts](#listsocialposts) - List all posts
* [listSocialProfiles](#listsocialprofiles) - List all profiles
* [listSocialReviews](#listsocialreviews) - List all reviews
* [patchSocialComment](#patchsocialcomment) - Update a comment
* [patchSocialPost](#patchsocialpost) - Update a post
* [patchSocialReview](#patchsocialreview) - Update a review
* [removeSocialComment](#removesocialcomment) - Remove a comment
* [removeSocialPost](#removesocialpost) - Remove a post
* [updateSocialComment](#updatesocialcomment) - Update a comment
* [updateSocialPost](#updatesocialpost) - Update a post
* [updateSocialReview](#updatesocialreview) - Update a review

## createSocialComment

Creates a SocialComment. Provide the unified SocialComment fields in the request body; they are mapped to the provider's API. Returns the created SocialComment.

### Example Usage

<!-- UsageSnippet language="java" operationID="createSocialComment" method="post" path="/social/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateSocialCommentRequest;
import to.unified.unified_java_sdk.models.operations.CreateSocialCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SocialComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateSocialCommentRequest req = CreateSocialCommentRequest.builder()
                .socialComment(SocialComment.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateSocialCommentResponse res = sdk.social().createSocialComment()
                .request(req)
                .call();

        if (res.socialComment().isPresent()) {
            System.out.println(res.socialComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateSocialCommentRequest](../../models/operations/CreateSocialCommentRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateSocialCommentResponse](../../models/operations/CreateSocialCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createSocialPost

Creates a SocialPost. Provide the unified SocialPost fields in the request body; they are mapped to the provider's API. Returns the created SocialPost.

### Example Usage

<!-- UsageSnippet language="java" operationID="createSocialPost" method="post" path="/social/{connection_id}/post" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateSocialPostRequest;
import to.unified.unified_java_sdk.models.operations.CreateSocialPostResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SocialPost;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateSocialPostRequest req = CreateSocialPostRequest.builder()
                .socialPost(SocialPost.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateSocialPostResponse res = sdk.social().createSocialPost()
                .request(req)
                .call();

        if (res.socialPost().isPresent()) {
            System.out.println(res.socialPost().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateSocialPostRequest](../../models/operations/CreateSocialPostRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateSocialPostResponse](../../models/operations/CreateSocialPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSocialComment

Retrieves a single SocialComment by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getSocialComment" method="get" path="/social/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetSocialCommentRequest;
import to.unified.unified_java_sdk.models.operations.GetSocialCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetSocialCommentRequest req = GetSocialCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetSocialCommentResponse res = sdk.social().getSocialComment()
                .request(req)
                .call();

        if (res.socialComment().isPresent()) {
            System.out.println(res.socialComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetSocialCommentRequest](../../models/operations/GetSocialCommentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetSocialCommentResponse](../../models/operations/GetSocialCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        GetSocialInsightResponse res = sdk.social().getSocialInsight()
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

## getSocialPost

Retrieves a single SocialPost by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getSocialPost" method="get" path="/social/{connection_id}/post/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetSocialPostRequest;
import to.unified.unified_java_sdk.models.operations.GetSocialPostResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetSocialPostRequest req = GetSocialPostRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetSocialPostResponse res = sdk.social().getSocialPost()
                .request(req)
                .call();

        if (res.socialPost().isPresent()) {
            System.out.println(res.socialPost().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetSocialPostRequest](../../models/operations/GetSocialPostRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetSocialPostResponse](../../models/operations/GetSocialPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSocialProfile

Retrieves a single SocialProfile by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getSocialProfile" method="get" path="/social/{connection_id}/profile/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetSocialProfileRequest;
import to.unified.unified_java_sdk.models.operations.GetSocialProfileResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetSocialProfileRequest req = GetSocialProfileRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetSocialProfileResponse res = sdk.social().getSocialProfile()
                .request(req)
                .call();

        if (res.socialProfile().isPresent()) {
            System.out.println(res.socialProfile().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetSocialProfileRequest](../../models/operations/GetSocialProfileRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetSocialProfileResponse](../../models/operations/GetSocialProfileResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSocialReview

Retrieves a single SocialReview by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getSocialReview" method="get" path="/social/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetSocialReviewRequest;
import to.unified.unified_java_sdk.models.operations.GetSocialReviewResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetSocialReviewRequest req = GetSocialReviewRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetSocialReviewResponse res = sdk.social().getSocialReview()
                .request(req)
                .call();

        if (res.socialReview().isPresent()) {
            System.out.println(res.socialReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetSocialReviewRequest](../../models/operations/GetSocialReviewRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetSocialReviewResponse](../../models/operations/GetSocialReviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSocialComments

Returns a list of SocialComments. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listSocialComments" method="get" path="/social/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListSocialCommentsRequest;
import to.unified.unified_java_sdk.models.operations.ListSocialCommentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListSocialCommentsRequest req = ListSocialCommentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListSocialCommentsResponse res = sdk.social().listSocialComments()
                .request(req)
                .call();

        if (res.socialComments().isPresent()) {
            System.out.println(res.socialComments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListSocialCommentsRequest](../../models/operations/ListSocialCommentsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListSocialCommentsResponse](../../models/operations/ListSocialCommentsResponse.md)**

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

        ListSocialInsightsResponse res = sdk.social().listSocialInsights()
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

## listSocialPosts

Returns a list of SocialPosts. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listSocialPosts" method="get" path="/social/{connection_id}/post" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListSocialPostsRequest;
import to.unified.unified_java_sdk.models.operations.ListSocialPostsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListSocialPostsRequest req = ListSocialPostsRequest.builder()
                .connectionId("<id>")
                .build();

        ListSocialPostsResponse res = sdk.social().listSocialPosts()
                .request(req)
                .call();

        if (res.socialPosts().isPresent()) {
            System.out.println(res.socialPosts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListSocialPostsRequest](../../models/operations/ListSocialPostsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListSocialPostsResponse](../../models/operations/ListSocialPostsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSocialProfiles

Returns a list of SocialProfiles. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listSocialProfiles" method="get" path="/social/{connection_id}/profile" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListSocialProfilesRequest;
import to.unified.unified_java_sdk.models.operations.ListSocialProfilesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListSocialProfilesRequest req = ListSocialProfilesRequest.builder()
                .connectionId("<id>")
                .build();

        ListSocialProfilesResponse res = sdk.social().listSocialProfiles()
                .request(req)
                .call();

        if (res.socialProfiles().isPresent()) {
            System.out.println(res.socialProfiles().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListSocialProfilesRequest](../../models/operations/ListSocialProfilesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListSocialProfilesResponse](../../models/operations/ListSocialProfilesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSocialReviews

Returns a list of SocialReviews. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listSocialReviews" method="get" path="/social/{connection_id}/review" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListSocialReviewsRequest;
import to.unified.unified_java_sdk.models.operations.ListSocialReviewsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListSocialReviewsRequest req = ListSocialReviewsRequest.builder()
                .connectionId("<id>")
                .build();

        ListSocialReviewsResponse res = sdk.social().listSocialReviews()
                .request(req)
                .call();

        if (res.socialReviews().isPresent()) {
            System.out.println(res.socialReviews().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListSocialReviewsRequest](../../models/operations/ListSocialReviewsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListSocialReviewsResponse](../../models/operations/ListSocialReviewsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchSocialComment

Updates the SocialComment identified by `id`. Provide the unified SocialComment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchSocialComment" method="patch" path="/social/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchSocialCommentRequest;
import to.unified.unified_java_sdk.models.operations.PatchSocialCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SocialComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchSocialCommentRequest req = PatchSocialCommentRequest.builder()
                .socialComment(SocialComment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchSocialCommentResponse res = sdk.social().patchSocialComment()
                .request(req)
                .call();

        if (res.socialComment().isPresent()) {
            System.out.println(res.socialComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchSocialCommentRequest](../../models/operations/PatchSocialCommentRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchSocialCommentResponse](../../models/operations/PatchSocialCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchSocialPost

Updates the SocialPost identified by `id`. Provide the unified SocialPost fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchSocialPost" method="patch" path="/social/{connection_id}/post/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchSocialPostRequest;
import to.unified.unified_java_sdk.models.operations.PatchSocialPostResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SocialPost;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchSocialPostRequest req = PatchSocialPostRequest.builder()
                .socialPost(SocialPost.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchSocialPostResponse res = sdk.social().patchSocialPost()
                .request(req)
                .call();

        if (res.socialPost().isPresent()) {
            System.out.println(res.socialPost().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchSocialPostRequest](../../models/operations/PatchSocialPostRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchSocialPostResponse](../../models/operations/PatchSocialPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchSocialReview

Updates the SocialReview identified by `id`. Provide the unified SocialReview fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchSocialReview" method="patch" path="/social/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchSocialReviewRequest;
import to.unified.unified_java_sdk.models.operations.PatchSocialReviewResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SocialReview;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchSocialReviewRequest req = PatchSocialReviewRequest.builder()
                .socialReview(SocialReview.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchSocialReviewResponse res = sdk.social().patchSocialReview()
                .request(req)
                .call();

        if (res.socialReview().isPresent()) {
            System.out.println(res.socialReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchSocialReviewRequest](../../models/operations/PatchSocialReviewRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchSocialReviewResponse](../../models/operations/PatchSocialReviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeSocialComment

Deletes the SocialComment identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeSocialComment" method="delete" path="/social/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveSocialCommentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveSocialCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveSocialCommentRequest req = RemoveSocialCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveSocialCommentResponse res = sdk.social().removeSocialComment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveSocialCommentRequest](../../models/operations/RemoveSocialCommentRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveSocialCommentResponse](../../models/operations/RemoveSocialCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeSocialPost

Deletes the SocialPost identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeSocialPost" method="delete" path="/social/{connection_id}/post/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveSocialPostRequest;
import to.unified.unified_java_sdk.models.operations.RemoveSocialPostResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveSocialPostRequest req = RemoveSocialPostRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveSocialPostResponse res = sdk.social().removeSocialPost()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveSocialPostRequest](../../models/operations/RemoveSocialPostRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveSocialPostResponse](../../models/operations/RemoveSocialPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateSocialComment

Updates the SocialComment identified by `id`. Provide the unified SocialComment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateSocialComment" method="put" path="/social/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateSocialCommentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateSocialCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SocialComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateSocialCommentRequest req = UpdateSocialCommentRequest.builder()
                .socialComment(SocialComment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateSocialCommentResponse res = sdk.social().updateSocialComment()
                .request(req)
                .call();

        if (res.socialComment().isPresent()) {
            System.out.println(res.socialComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateSocialCommentRequest](../../models/operations/UpdateSocialCommentRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateSocialCommentResponse](../../models/operations/UpdateSocialCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateSocialPost

Updates the SocialPost identified by `id`. Provide the unified SocialPost fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateSocialPost" method="put" path="/social/{connection_id}/post/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateSocialPostRequest;
import to.unified.unified_java_sdk.models.operations.UpdateSocialPostResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SocialPost;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateSocialPostRequest req = UpdateSocialPostRequest.builder()
                .socialPost(SocialPost.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateSocialPostResponse res = sdk.social().updateSocialPost()
                .request(req)
                .call();

        if (res.socialPost().isPresent()) {
            System.out.println(res.socialPost().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateSocialPostRequest](../../models/operations/UpdateSocialPostRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateSocialPostResponse](../../models/operations/UpdateSocialPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateSocialReview

Updates the SocialReview identified by `id`. Provide the unified SocialReview fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateSocialReview" method="put" path="/social/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateSocialReviewRequest;
import to.unified.unified_java_sdk.models.operations.UpdateSocialReviewResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SocialReview;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateSocialReviewRequest req = UpdateSocialReviewRequest.builder()
                .socialReview(SocialReview.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateSocialReviewResponse res = sdk.social().updateSocialReview()
                .request(req)
                .call();

        if (res.socialReview().isPresent()) {
            System.out.println(res.socialReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateSocialReviewRequest](../../models/operations/UpdateSocialReviewRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateSocialReviewResponse](../../models/operations/UpdateSocialReviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |