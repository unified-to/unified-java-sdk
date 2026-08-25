# Post

## Overview

### Available Operations

* [createSocialPost](#createsocialpost) - Create a post
* [getSocialPost](#getsocialpost) - Retrieve a post
* [listSocialPosts](#listsocialposts) - List all posts
* [patchSocialPost](#patchsocialpost) - Update a post
* [removeSocialPost](#removesocialpost) - Remove a post
* [updateSocialPost](#updatesocialpost) - Update a post

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

        CreateSocialPostResponse res = sdk.post().createSocialPost()
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

        GetSocialPostResponse res = sdk.post().getSocialPost()
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

        ListSocialPostsResponse res = sdk.post().listSocialPosts()
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

        PatchSocialPostResponse res = sdk.post().patchSocialPost()
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

        RemoveSocialPostResponse res = sdk.post().removeSocialPost()
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

        UpdateSocialPostResponse res = sdk.post().updateSocialPost()
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