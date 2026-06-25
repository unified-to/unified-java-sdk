# Review

## Overview

### Available Operations

* [createCommerceReview2](#createcommercereview2) - Create a review
* [getCommerceReview2](#getcommercereview2) - Retrieve a review
* [listCommerceReviews2](#listcommercereviews2) - List all reviews
* [patchCommerceReview2](#patchcommercereview2) - Update a review
* [removeCommerceReview2](#removecommercereview2) - Remove a review
* [updateCommerceReview2](#updatecommercereview2) - Update a review

## createCommerceReview2

Create a review

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceReview2" method="post" path="/commerce/{connection_id}/review" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceReview2Request;
import to.unified.unified_java_sdk.models.operations.CreateCommerceReview2Response;
import to.unified.unified_java_sdk.models.shared.CommerceReview;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceReview2Request req = CreateCommerceReview2Request.builder()
                .commerceReview(CommerceReview.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceReview2Response res = sdk.review().createCommerceReview2()
                .request(req)
                .call();

        if (res.commerceReview().isPresent()) {
            System.out.println(res.commerceReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateCommerceReview2Request](../../models/operations/CreateCommerceReview2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateCommerceReview2Response](../../models/operations/CreateCommerceReview2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceReview2

Retrieve a review

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceReview2" method="get" path="/commerce/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceReview2Request;
import to.unified.unified_java_sdk.models.operations.GetCommerceReview2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceReview2Request req = GetCommerceReview2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceReview2Response res = sdk.review().getCommerceReview2()
                .request(req)
                .call();

        if (res.commerceReview().isPresent()) {
            System.out.println(res.commerceReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetCommerceReview2Request](../../models/operations/GetCommerceReview2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetCommerceReview2Response](../../models/operations/GetCommerceReview2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceReviews2

List all reviews

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceReviews2" method="get" path="/commerce/{connection_id}/review" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceReviews2Request;
import to.unified.unified_java_sdk.models.operations.ListCommerceReviews2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceReviews2Request req = ListCommerceReviews2Request.builder()
                .connectionId("<id>")
                .build();

        ListCommerceReviews2Response res = sdk.review().listCommerceReviews2()
                .request(req)
                .call();

        if (res.commerceReviews().isPresent()) {
            System.out.println(res.commerceReviews().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListCommerceReviews2Request](../../models/operations/ListCommerceReviews2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListCommerceReviews2Response](../../models/operations/ListCommerceReviews2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceReview2

Update a review

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceReview2" method="patch" path="/commerce/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceReview2Request;
import to.unified.unified_java_sdk.models.operations.PatchCommerceReview2Response;
import to.unified.unified_java_sdk.models.shared.CommerceReview;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceReview2Request req = PatchCommerceReview2Request.builder()
                .commerceReview(CommerceReview.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceReview2Response res = sdk.review().patchCommerceReview2()
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
| `request`                                                                             | [PatchCommerceReview2Request](../../models/operations/PatchCommerceReview2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchCommerceReview2Response](../../models/operations/PatchCommerceReview2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceReview2

Remove a review

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceReview2" method="delete" path="/commerce/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceReview2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceReview2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceReview2Request req = RemoveCommerceReview2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceReview2Response res = sdk.review().removeCommerceReview2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveCommerceReview2Request](../../models/operations/RemoveCommerceReview2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveCommerceReview2Response](../../models/operations/RemoveCommerceReview2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceReview2

Update a review

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceReview2" method="put" path="/commerce/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceReview2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceReview2Response;
import to.unified.unified_java_sdk.models.shared.CommerceReview;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceReview2Request req = UpdateCommerceReview2Request.builder()
                .commerceReview(CommerceReview.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceReview2Response res = sdk.review().updateCommerceReview2()
                .request(req)
                .call();

        if (res.commerceReview().isPresent()) {
            System.out.println(res.commerceReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateCommerceReview2Request](../../models/operations/UpdateCommerceReview2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateCommerceReview2Response](../../models/operations/UpdateCommerceReview2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |