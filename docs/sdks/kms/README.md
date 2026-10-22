# Kms

## Overview

### Available Operations

* [createKmsComment](#createkmscomment) - Create a comment
* [createKmsPage](#createkmspage) - Create a page
* [createKmsSpace](#createkmsspace) - Create a space
* [getKmsComment](#getkmscomment) - Retrieve a comment
* [getKmsPage](#getkmspage) - Retrieve a page
* [getKmsSpace](#getkmsspace) - Retrieve a space
* [listKmsComments](#listkmscomments) - List all comments
* [listKmsPages](#listkmspages) - List all pages
* [listKmsSpaces](#listkmsspaces) - List all spaces
* [patchKmsComment](#patchkmscomment) - Update a comment
* [patchKmsPage](#patchkmspage) - Update a page
* [patchKmsSpace](#patchkmsspace) - Update a space
* [removeKmsComment](#removekmscomment) - Remove a comment
* [removeKmsPage](#removekmspage) - Remove a page
* [removeKmsSpace](#removekmsspace) - Remove a space
* [updateKmsComment](#updatekmscomment) - Update a comment
* [updateKmsPage](#updatekmspage) - Update a page
* [updateKmsSpace](#updatekmsspace) - Update a space

## createKmsComment

Creates a KmsComment. Provide the unified KmsComment fields in the request body; they are mapped to the provider's API. Returns the created KmsComment.

### Example Usage

<!-- UsageSnippet language="java" operationID="createKmsComment" method="post" path="/kms/{connection_id}/comment" example="kms_comment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateKmsCommentRequest;
import to.unified.unified_java_sdk.models.operations.CreateKmsCommentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateKmsCommentRequest req = CreateKmsCommentRequest.builder()
                .kmsComment(KmsComment.builder()
                    .content("Decimus tolero viriliter usque.")
                    .contentType(ContentType.HTML)
                    .createdAt(OffsetDateTime.parse("2022-08-26T14:40:49.732Z"))
                    .id("0c4d060a-a6fd-41c4-9f46-3e6854432d7b")
                    .metadata(List.of())
                    .type(KmsCommentType.PAGE)
                    .updatedAt(OffsetDateTime.parse("2023-11-26T14:18:53.659Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateKmsCommentResponse res = sdk.kms().createKmsComment()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            System.out.println(res.kmsComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateKmsCommentRequest](../../models/operations/CreateKmsCommentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateKmsCommentResponse](../../models/operations/CreateKmsCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createKmsPage

Creates a KmsPage. Provide the unified KmsPage fields in the request body; they are mapped to the provider's API. Returns the created KmsPage.

### Example Usage

<!-- UsageSnippet language="java" operationID="createKmsPage" method="post" path="/kms/{connection_id}/page" example="kms_page" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateKmsPageRequest;
import to.unified.unified_java_sdk.models.operations.CreateKmsPageResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateKmsPageRequest req = CreateKmsPageRequest.builder()
                .kmsPage(KmsPage.builder()
                    .type(KmsPageType.HTML)
                    .createdAt(OffsetDateTime.parse("2019-05-20T18:06:50.749Z"))
                    .downloadUrl("https://agitated-validity.info")
                    .hasChildren(true)
                    .id("a6ff4274-4d1a-4e56-b740-133f523f823e")
                    .isActive(true)
                    .metadata(List.of())
                    .title("even minister extract")
                    .updatedAt(OffsetDateTime.parse("2025-10-10T01:52:36.528Z"))
                    .webUrl("https://another-petticoat.info")
                    .build())
                .connectionId("<id>")
                .build();

        CreateKmsPageResponse res = sdk.kms().createKmsPage()
                .request(req)
                .call();

        if (res.kmsPage().isPresent()) {
            System.out.println(res.kmsPage().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreateKmsPageRequest](../../models/operations/CreateKmsPageRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateKmsPageResponse](../../models/operations/CreateKmsPageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createKmsSpace

Creates a KmsSpace. Provide the unified KmsSpace fields in the request body; they are mapped to the provider's API. Returns the created KmsSpace.

### Example Usage

<!-- UsageSnippet language="java" operationID="createKmsSpace" method="post" path="/kms/{connection_id}/space" example="kms_space" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateKmsSpaceRequest;
import to.unified.unified_java_sdk.models.operations.CreateKmsSpaceResponse;
import to.unified.unified_java_sdk.models.shared.KmsSpace;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateKmsSpaceRequest req = CreateKmsSpaceRequest.builder()
                .kmsSpace(KmsSpace.builder()
                    .createdAt(OffsetDateTime.parse("2022-10-31T00:56:54.246Z"))
                    .description("Acer.")
                    .id("f5074c93-8b04-4ee0-bfda-4325e50c035a")
                    .isActive(false)
                    .metadata(List.of())
                    .name("into nor afore")
                    .updatedAt(OffsetDateTime.parse("2025-12-30T18:46:11.507Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateKmsSpaceResponse res = sdk.kms().createKmsSpace()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            System.out.println(res.kmsSpace().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateKmsSpaceRequest](../../models/operations/CreateKmsSpaceRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateKmsSpaceResponse](../../models/operations/CreateKmsSpaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getKmsComment

Retrieves a single KmsComment by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getKmsComment" method="get" path="/kms/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetKmsCommentRequest;
import to.unified.unified_java_sdk.models.operations.GetKmsCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetKmsCommentRequest req = GetKmsCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetKmsCommentResponse res = sdk.kms().getKmsComment()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            System.out.println(res.kmsComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetKmsCommentRequest](../../models/operations/GetKmsCommentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetKmsCommentResponse](../../models/operations/GetKmsCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getKmsPage

Retrieves a single KmsPage by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getKmsPage" method="get" path="/kms/{connection_id}/page/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetKmsPageRequest;
import to.unified.unified_java_sdk.models.operations.GetKmsPageResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetKmsPageRequest req = GetKmsPageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetKmsPageResponse res = sdk.kms().getKmsPage()
                .request(req)
                .call();

        if (res.kmsPage().isPresent()) {
            System.out.println(res.kmsPage().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetKmsPageRequest](../../models/operations/GetKmsPageRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetKmsPageResponse](../../models/operations/GetKmsPageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getKmsSpace

Retrieves a single KmsSpace by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getKmsSpace" method="get" path="/kms/{connection_id}/space/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetKmsSpaceRequest;
import to.unified.unified_java_sdk.models.operations.GetKmsSpaceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetKmsSpaceRequest req = GetKmsSpaceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetKmsSpaceResponse res = sdk.kms().getKmsSpace()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            System.out.println(res.kmsSpace().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetKmsSpaceRequest](../../models/operations/GetKmsSpaceRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetKmsSpaceResponse](../../models/operations/GetKmsSpaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listKmsComments

Returns a list of KmsComments. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listKmsComments" method="get" path="/kms/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListKmsCommentsRequest;
import to.unified.unified_java_sdk.models.operations.ListKmsCommentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListKmsCommentsRequest req = ListKmsCommentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListKmsCommentsResponse res = sdk.kms().listKmsComments()
                .request(req)
                .call();

        if (res.kmsComments().isPresent()) {
            System.out.println(res.kmsComments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListKmsCommentsRequest](../../models/operations/ListKmsCommentsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListKmsCommentsResponse](../../models/operations/ListKmsCommentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listKmsPages

Returns a list of KmsPages. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listKmsPages" method="get" path="/kms/{connection_id}/page" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListKmsPagesRequest;
import to.unified.unified_java_sdk.models.operations.ListKmsPagesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListKmsPagesRequest req = ListKmsPagesRequest.builder()
                .connectionId("<id>")
                .build();

        ListKmsPagesResponse res = sdk.kms().listKmsPages()
                .request(req)
                .call();

        if (res.kmsPages().isPresent()) {
            System.out.println(res.kmsPages().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListKmsPagesRequest](../../models/operations/ListKmsPagesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListKmsPagesResponse](../../models/operations/ListKmsPagesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listKmsSpaces

Returns a list of KmsSpaces. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listKmsSpaces" method="get" path="/kms/{connection_id}/space" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListKmsSpacesRequest;
import to.unified.unified_java_sdk.models.operations.ListKmsSpacesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListKmsSpacesRequest req = ListKmsSpacesRequest.builder()
                .connectionId("<id>")
                .build();

        ListKmsSpacesResponse res = sdk.kms().listKmsSpaces()
                .request(req)
                .call();

        if (res.kmsSpaces().isPresent()) {
            System.out.println(res.kmsSpaces().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListKmsSpacesRequest](../../models/operations/ListKmsSpacesRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListKmsSpacesResponse](../../models/operations/ListKmsSpacesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchKmsComment

Updates the KmsComment identified by `id`. Provide the unified KmsComment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchKmsComment" method="patch" path="/kms/{connection_id}/comment/{id}" example="kms_comment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchKmsCommentRequest;
import to.unified.unified_java_sdk.models.operations.PatchKmsCommentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchKmsCommentRequest req = PatchKmsCommentRequest.builder()
                .kmsComment(KmsComment.builder()
                    .content("Decimus tolero viriliter usque.")
                    .contentType(ContentType.HTML)
                    .createdAt(OffsetDateTime.parse("2022-08-26T14:40:49.732Z"))
                    .id("a0c00574-4d80-4722-a7fc-d05d6460581d")
                    .metadata(List.of())
                    .type(KmsCommentType.PAGE)
                    .updatedAt(OffsetDateTime.parse("2023-11-26T14:18:53.664Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchKmsCommentResponse res = sdk.kms().patchKmsComment()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            System.out.println(res.kmsComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchKmsCommentRequest](../../models/operations/PatchKmsCommentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchKmsCommentResponse](../../models/operations/PatchKmsCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchKmsPage

Updates the KmsPage identified by `id`. Provide the unified KmsPage fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchKmsPage" method="patch" path="/kms/{connection_id}/page/{id}" example="kms_page" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchKmsPageRequest;
import to.unified.unified_java_sdk.models.operations.PatchKmsPageResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchKmsPageRequest req = PatchKmsPageRequest.builder()
                .kmsPage(KmsPage.builder()
                    .type(KmsPageType.HTML)
                    .createdAt(OffsetDateTime.parse("2019-05-20T18:06:50.749Z"))
                    .downloadUrl("https://agitated-validity.info")
                    .hasChildren(true)
                    .id("2a0782ab-b74b-4dcd-935f-d7e5de537c0c")
                    .isActive(true)
                    .metadata(List.of())
                    .title("even minister extract")
                    .updatedAt(OffsetDateTime.parse("2025-10-10T01:52:36.541Z"))
                    .webUrl("https://another-petticoat.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchKmsPageResponse res = sdk.kms().patchKmsPage()
                .request(req)
                .call();

        if (res.kmsPage().isPresent()) {
            System.out.println(res.kmsPage().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [PatchKmsPageRequest](../../models/operations/PatchKmsPageRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PatchKmsPageResponse](../../models/operations/PatchKmsPageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchKmsSpace

Updates the KmsSpace identified by `id`. Provide the unified KmsSpace fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchKmsSpace" method="patch" path="/kms/{connection_id}/space/{id}" example="kms_space" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchKmsSpaceRequest;
import to.unified.unified_java_sdk.models.operations.PatchKmsSpaceResponse;
import to.unified.unified_java_sdk.models.shared.KmsSpace;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchKmsSpaceRequest req = PatchKmsSpaceRequest.builder()
                .kmsSpace(KmsSpace.builder()
                    .createdAt(OffsetDateTime.parse("2022-10-31T00:56:54.246Z"))
                    .description("Acer.")
                    .id("3cc76599-4490-4cbb-9b75-1056af9ed76d")
                    .isActive(false)
                    .metadata(List.of())
                    .name("into nor afore")
                    .updatedAt(OffsetDateTime.parse("2025-12-30T18:46:11.516Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchKmsSpaceResponse res = sdk.kms().patchKmsSpace()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            System.out.println(res.kmsSpace().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchKmsSpaceRequest](../../models/operations/PatchKmsSpaceRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchKmsSpaceResponse](../../models/operations/PatchKmsSpaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeKmsComment

Deletes the KmsComment identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeKmsComment" method="delete" path="/kms/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveKmsCommentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveKmsCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveKmsCommentRequest req = RemoveKmsCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveKmsCommentResponse res = sdk.kms().removeKmsComment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveKmsCommentRequest](../../models/operations/RemoveKmsCommentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveKmsCommentResponse](../../models/operations/RemoveKmsCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeKmsPage

Deletes the KmsPage identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeKmsPage" method="delete" path="/kms/{connection_id}/page/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveKmsPageRequest;
import to.unified.unified_java_sdk.models.operations.RemoveKmsPageResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveKmsPageRequest req = RemoveKmsPageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveKmsPageResponse res = sdk.kms().removeKmsPage()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [RemoveKmsPageRequest](../../models/operations/RemoveKmsPageRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[RemoveKmsPageResponse](../../models/operations/RemoveKmsPageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeKmsSpace

Deletes the KmsSpace identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeKmsSpace" method="delete" path="/kms/{connection_id}/space/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveKmsSpaceRequest;
import to.unified.unified_java_sdk.models.operations.RemoveKmsSpaceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveKmsSpaceRequest req = RemoveKmsSpaceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveKmsSpaceResponse res = sdk.kms().removeKmsSpace()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveKmsSpaceRequest](../../models/operations/RemoveKmsSpaceRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveKmsSpaceResponse](../../models/operations/RemoveKmsSpaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateKmsComment

Updates the KmsComment identified by `id`. Provide the unified KmsComment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateKmsComment" method="put" path="/kms/{connection_id}/comment/{id}" example="kms_comment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateKmsCommentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateKmsCommentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateKmsCommentRequest req = UpdateKmsCommentRequest.builder()
                .kmsComment(KmsComment.builder()
                    .content("Decimus tolero viriliter usque.")
                    .contentType(ContentType.HTML)
                    .createdAt(OffsetDateTime.parse("2022-08-26T14:40:49.732Z"))
                    .id("a0c00574-4d80-4722-a7fc-d05d6460581d")
                    .metadata(List.of())
                    .type(KmsCommentType.PAGE)
                    .updatedAt(OffsetDateTime.parse("2023-11-26T14:18:53.664Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateKmsCommentResponse res = sdk.kms().updateKmsComment()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            System.out.println(res.kmsComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateKmsCommentRequest](../../models/operations/UpdateKmsCommentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateKmsCommentResponse](../../models/operations/UpdateKmsCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateKmsPage

Updates the KmsPage identified by `id`. Provide the unified KmsPage fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateKmsPage" method="put" path="/kms/{connection_id}/page/{id}" example="kms_page" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateKmsPageRequest;
import to.unified.unified_java_sdk.models.operations.UpdateKmsPageResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateKmsPageRequest req = UpdateKmsPageRequest.builder()
                .kmsPage(KmsPage.builder()
                    .type(KmsPageType.HTML)
                    .createdAt(OffsetDateTime.parse("2019-05-20T18:06:50.749Z"))
                    .downloadUrl("https://agitated-validity.info")
                    .hasChildren(true)
                    .id("2a0782ab-b74b-4dcd-935f-d7e5de537c0c")
                    .isActive(true)
                    .metadata(List.of())
                    .title("even minister extract")
                    .updatedAt(OffsetDateTime.parse("2025-10-10T01:52:36.541Z"))
                    .webUrl("https://another-petticoat.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateKmsPageResponse res = sdk.kms().updateKmsPage()
                .request(req)
                .call();

        if (res.kmsPage().isPresent()) {
            System.out.println(res.kmsPage().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdateKmsPageRequest](../../models/operations/UpdateKmsPageRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdateKmsPageResponse](../../models/operations/UpdateKmsPageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateKmsSpace

Updates the KmsSpace identified by `id`. Provide the unified KmsSpace fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateKmsSpace" method="put" path="/kms/{connection_id}/space/{id}" example="kms_space" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateKmsSpaceRequest;
import to.unified.unified_java_sdk.models.operations.UpdateKmsSpaceResponse;
import to.unified.unified_java_sdk.models.shared.KmsSpace;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateKmsSpaceRequest req = UpdateKmsSpaceRequest.builder()
                .kmsSpace(KmsSpace.builder()
                    .createdAt(OffsetDateTime.parse("2022-10-31T00:56:54.246Z"))
                    .description("Acer.")
                    .id("3cc76599-4490-4cbb-9b75-1056af9ed76d")
                    .isActive(false)
                    .metadata(List.of())
                    .name("into nor afore")
                    .updatedAt(OffsetDateTime.parse("2025-12-30T18:46:11.516Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateKmsSpaceResponse res = sdk.kms().updateKmsSpace()
                .request(req)
                .call();

        if (res.kmsSpace().isPresent()) {
            System.out.println(res.kmsSpace().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateKmsSpaceRequest](../../models/operations/UpdateKmsSpaceRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateKmsSpaceResponse](../../models/operations/UpdateKmsSpaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |