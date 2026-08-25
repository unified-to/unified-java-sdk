# Social

## Overview

### Available Operations

* [createSocialPost](#createsocialpost) - Create a post
* [getSocialInsight](#getsocialinsight) - Retrieve an insight
* [getSocialPost](#getsocialpost) - Retrieve a post
* [getSocialProfile](#getsocialprofile) - Retrieve a profile
* [getSocialReview](#getsocialreview) - Retrieve a review
* [listSocialInsights](#listsocialinsights) - List all insights
* [listSocialPosts](#listsocialposts) - List all posts
* [listSocialProfiles](#listsocialprofiles) - List all profiles
* [listSocialReviews](#listsocialreviews) - List all reviews
* [patchSocialPost](#patchsocialpost) - Update a post
* [patchSocialReview](#patchsocialreview) - Update a review
* [removeSocialPost](#removesocialpost) - Remove a post
* [updateSocialPost](#updatesocialpost) - Update a post
* [updateSocialReview](#updatesocialreview) - Update a review

## createSocialPost

Create a post

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

Retrieve a post

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

Retrieve a profile

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

Retrieve a review

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

List all posts

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

List all profiles

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

List all reviews

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

## patchSocialPost

Update a post

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

Update a review

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

## removeSocialPost

Remove a post

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

## updateSocialPost

Update a post

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

Update a review

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