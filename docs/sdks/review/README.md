# Review

## Overview

### Available Operations

* [createCommerceReview](#createcommercereview) - Create a review
* [getCommerceReview](#getcommercereview) - Retrieve a review
* [getPerformanceReview](#getperformancereview) - Retrieve a review
* [getSocialReview](#getsocialreview) - Retrieve a review
* [listCommerceReviews](#listcommercereviews) - List all reviews
* [listPerformanceReviews](#listperformancereviews) - List all reviews
* [listSocialReviews](#listsocialreviews) - List all reviews
* [patchCommerceReview](#patchcommercereview) - Update a review
* [patchSocialReview](#patchsocialreview) - Update a review
* [removeCommerceReview](#removecommercereview) - Remove a review
* [updateCommerceReview](#updatecommercereview) - Update a review
* [updateSocialReview](#updatesocialreview) - Update a review

## createCommerceReview

Create a review

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceReview" method="post" path="/commerce/{connection_id}/review" example="commerce_review" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceReviewRequest;
import to.unified.unified_java_sdk.models.operations.CreateCommerceReviewResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceReviewRequest req = CreateCommerceReviewRequest.builder()
                .commerceReview(CommerceReview.builder()
                    .authorAvatarUrl("https://picsum.photos/seed/ix4Br3LA/2245/1245")
                    .authorEmail("Cleve_Yundt@hotmail.com")
                    .authorLocation("ipsum")
                    .authorName("Marsha Krajcik")
                    .comments(List.of())
                    .content("Taedium thymum adipiscor amicitia cui.")
                    .createdAt(OffsetDateTime.parse("2019-12-12T18:10:22.988Z"))
                    .helpfulVotes(26d)
                    .id("9c5b7e6f-0f4b-4750-8f10-b86d80073fd4")
                    .isFeatured(true)
                    .isPublic(true)
                    .isVerified(false)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/882/1004?lock=7448492654002422")
                            .alt("Adulescens.")
                            .height(519d)
                            .id("816efc1a-4423-4d51-a391-83385253bc8f")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("a6ebfdaa-8dfe-407d-b0d6-346a84dad5ca")
                                    .slug("aggero")
                                    .value(CommerceMetadataValue.of("tero"))
                                    .build()))
                            .position(72d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(75d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/3QDZ8/1208/2171")
                            .alt("Pauci timidus sol comburo thema.")
                            .height(297d)
                            .id("12020720-c152-456e-80bf-005ca92e532d")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("4ede0b6b-5898-4c43-93eb-87357417ecee")
                                    .slug("vito")
                                    .value(CommerceMetadataValue.of("cuppedia"))
                                    .build()))
                            .position(61d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(96d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/ytybC/2616/710")
                            .alt("Cuppedia vestrum patruus.")
                            .height(6d)
                            .id("c6d2eb71-13f9-4cda-a26e-4bd7a3e27f52")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("6ad69a11-2786-4752-a369-6f863517d900")
                                    .slug("arbitro")
                                    .value(CommerceMetadataValue.of("villa"))
                                    .build()))
                            .position(60d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(74d)
                            .build()))
                    .metadata(List.of())
                    .rating(3d)
                    .status(CommerceReviewStatus.APPROVED)
                    .title("Coepi adamo amicitia auxilium toties.")
                    .unhelpfulVotes(49d)
                    .updatedAt(OffsetDateTime.parse("2025-07-24T23:16:21.947Z"))
                    .url("https://excitable-underneath.com")
                    .verifiedPurchase(false)
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceReviewResponse res = sdk.review().createCommerceReview()
                .request(req)
                .call();

        if (res.commerceReview().isPresent()) {
            System.out.println(res.commerceReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateCommerceReviewRequest](../../models/operations/CreateCommerceReviewRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateCommerceReviewResponse](../../models/operations/CreateCommerceReviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceReview

Retrieve a review

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceReview" method="get" path="/commerce/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceReviewRequest;
import to.unified.unified_java_sdk.models.operations.GetCommerceReviewResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceReviewRequest req = GetCommerceReviewRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceReviewResponse res = sdk.review().getCommerceReview()
                .request(req)
                .call();

        if (res.commerceReview().isPresent()) {
            System.out.println(res.commerceReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetCommerceReviewRequest](../../models/operations/GetCommerceReviewRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetCommerceReviewResponse](../../models/operations/GetCommerceReviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPerformanceReview

Retrieve a review

### Example Usage

<!-- UsageSnippet language="java" operationID="getPerformanceReview" method="get" path="/performance/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPerformanceReviewRequest;
import to.unified.unified_java_sdk.models.operations.GetPerformanceReviewResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPerformanceReviewRequest req = GetPerformanceReviewRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPerformanceReviewResponse res = sdk.review().getPerformanceReview()
                .request(req)
                .call();

        if (res.performanceReview().isPresent()) {
            System.out.println(res.performanceReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetPerformanceReviewRequest](../../models/operations/GetPerformanceReviewRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetPerformanceReviewResponse](../../models/operations/GetPerformanceReviewResponse.md)**

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

        GetSocialReviewResponse res = sdk.review().getSocialReview()
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

## listCommerceReviews

List all reviews

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceReviews" method="get" path="/commerce/{connection_id}/review" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceReviewsRequest;
import to.unified.unified_java_sdk.models.operations.ListCommerceReviewsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceReviewsRequest req = ListCommerceReviewsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCommerceReviewsResponse res = sdk.review().listCommerceReviews()
                .request(req)
                .call();

        if (res.commerceReviews().isPresent()) {
            System.out.println(res.commerceReviews().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListCommerceReviewsRequest](../../models/operations/ListCommerceReviewsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListCommerceReviewsResponse](../../models/operations/ListCommerceReviewsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPerformanceReviews

List all reviews

### Example Usage

<!-- UsageSnippet language="java" operationID="listPerformanceReviews" method="get" path="/performance/{connection_id}/review" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPerformanceReviewsRequest;
import to.unified.unified_java_sdk.models.operations.ListPerformanceReviewsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPerformanceReviewsRequest req = ListPerformanceReviewsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPerformanceReviewsResponse res = sdk.review().listPerformanceReviews()
                .request(req)
                .call();

        if (res.performanceReviews().isPresent()) {
            System.out.println(res.performanceReviews().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListPerformanceReviewsRequest](../../models/operations/ListPerformanceReviewsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListPerformanceReviewsResponse](../../models/operations/ListPerformanceReviewsResponse.md)**

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

        ListSocialReviewsResponse res = sdk.review().listSocialReviews()
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

## patchCommerceReview

Update a review

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceReview" method="patch" path="/commerce/{connection_id}/review/{id}" example="commerce_review" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceReviewRequest;
import to.unified.unified_java_sdk.models.operations.PatchCommerceReviewResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceReviewRequest req = PatchCommerceReviewRequest.builder()
                .commerceReview(CommerceReview.builder()
                    .authorAvatarUrl("https://picsum.photos/seed/ix4Br3LA/2245/1245")
                    .authorEmail("Cleve_Yundt@hotmail.com")
                    .authorLocation("ipsum")
                    .authorName("Marsha Krajcik")
                    .comments(List.of())
                    .content("Taedium thymum adipiscor amicitia cui.")
                    .createdAt(OffsetDateTime.parse("2019-12-12T18:10:22.988Z"))
                    .helpfulVotes(26d)
                    .id("fd0e9457-5554-4f0f-9f5e-eafddd7d0e37")
                    .isFeatured(true)
                    .isPublic(true)
                    .isVerified(false)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/882/1004?lock=7448492654002422")
                            .alt("Adulescens.")
                            .height(519d)
                            .id("146b7d74-0d7e-4beb-941b-44c501241294")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("cc4f6bd9-6784-4fd2-bed6-73d1869efb90")
                                    .slug("aggero")
                                    .value(CommerceMetadataValue.of("tero"))
                                    .build()))
                            .position(72d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(75d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/3QDZ8/1208/2171")
                            .alt("Pauci timidus sol comburo thema.")
                            .height(297d)
                            .id("87af2377-5bc7-415f-994c-28d4bcb0c263")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("b0e23d56-6ea0-41f8-83ef-ffcf3e614638")
                                    .slug("vito")
                                    .value(CommerceMetadataValue.of("cuppedia"))
                                    .build()))
                            .position(61d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(96d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/ytybC/2616/710")
                            .alt("Cuppedia vestrum patruus.")
                            .height(6d)
                            .id("d5697010-23e7-4425-b385-99c308679379")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("9ae001db-e9e0-4412-9c1f-9946f9c3559a")
                                    .slug("arbitro")
                                    .value(CommerceMetadataValue.of("villa"))
                                    .build()))
                            .position(60d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(74d)
                            .build()))
                    .metadata(List.of())
                    .rating(3d)
                    .status(CommerceReviewStatus.APPROVED)
                    .title("Coepi adamo amicitia auxilium toties.")
                    .unhelpfulVotes(49d)
                    .updatedAt(OffsetDateTime.parse("2025-07-24T23:16:21.986Z"))
                    .url("https://excitable-underneath.com")
                    .verifiedPurchase(false)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceReviewResponse res = sdk.review().patchCommerceReview()
                .request(req)
                .call();

        if (res.commerceReview().isPresent()) {
            System.out.println(res.commerceReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchCommerceReviewRequest](../../models/operations/PatchCommerceReviewRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchCommerceReviewResponse](../../models/operations/PatchCommerceReviewResponse.md)**

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

        PatchSocialReviewResponse res = sdk.review().patchSocialReview()
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

## removeCommerceReview

Remove a review

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceReview" method="delete" path="/commerce/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceReviewRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceReviewResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceReviewRequest req = RemoveCommerceReviewRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceReviewResponse res = sdk.review().removeCommerceReview()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveCommerceReviewRequest](../../models/operations/RemoveCommerceReviewRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveCommerceReviewResponse](../../models/operations/RemoveCommerceReviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceReview

Update a review

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceReview" method="put" path="/commerce/{connection_id}/review/{id}" example="commerce_review" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceReviewRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceReviewResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceReviewRequest req = UpdateCommerceReviewRequest.builder()
                .commerceReview(CommerceReview.builder()
                    .authorAvatarUrl("https://picsum.photos/seed/ix4Br3LA/2245/1245")
                    .authorEmail("Cleve_Yundt@hotmail.com")
                    .authorLocation("ipsum")
                    .authorName("Marsha Krajcik")
                    .comments(List.of())
                    .content("Taedium thymum adipiscor amicitia cui.")
                    .createdAt(OffsetDateTime.parse("2019-12-12T18:10:22.988Z"))
                    .helpfulVotes(26d)
                    .id("fd0e9457-5554-4f0f-9f5e-eafddd7d0e37")
                    .isFeatured(true)
                    .isPublic(true)
                    .isVerified(false)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/882/1004?lock=7448492654002422")
                            .alt("Adulescens.")
                            .height(519d)
                            .id("146b7d74-0d7e-4beb-941b-44c501241294")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("cc4f6bd9-6784-4fd2-bed6-73d1869efb90")
                                    .slug("aggero")
                                    .value(CommerceMetadataValue.of("tero"))
                                    .build()))
                            .position(72d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(75d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/3QDZ8/1208/2171")
                            .alt("Pauci timidus sol comburo thema.")
                            .height(297d)
                            .id("87af2377-5bc7-415f-994c-28d4bcb0c263")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("b0e23d56-6ea0-41f8-83ef-ffcf3e614638")
                                    .slug("vito")
                                    .value(CommerceMetadataValue.of("cuppedia"))
                                    .build()))
                            .position(61d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(96d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/ytybC/2616/710")
                            .alt("Cuppedia vestrum patruus.")
                            .height(6d)
                            .id("d5697010-23e7-4425-b385-99c308679379")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("9ae001db-e9e0-4412-9c1f-9946f9c3559a")
                                    .slug("arbitro")
                                    .value(CommerceMetadataValue.of("villa"))
                                    .build()))
                            .position(60d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(74d)
                            .build()))
                    .metadata(List.of())
                    .rating(3d)
                    .status(CommerceReviewStatus.APPROVED)
                    .title("Coepi adamo amicitia auxilium toties.")
                    .unhelpfulVotes(49d)
                    .updatedAt(OffsetDateTime.parse("2025-07-24T23:16:21.986Z"))
                    .url("https://excitable-underneath.com")
                    .verifiedPurchase(false)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceReviewResponse res = sdk.review().updateCommerceReview()
                .request(req)
                .call();

        if (res.commerceReview().isPresent()) {
            System.out.println(res.commerceReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateCommerceReviewRequest](../../models/operations/UpdateCommerceReviewRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateCommerceReviewResponse](../../models/operations/UpdateCommerceReviewResponse.md)**

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

        UpdateSocialReviewResponse res = sdk.review().updateSocialReview()
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