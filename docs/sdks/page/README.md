# Page

## Overview

### Available Operations

* [createKmsPage](#createkmspage) - Create a page
* [getKmsPage](#getkmspage) - Retrieve a page
* [listKmsPages](#listkmspages) - List all pages
* [patchKmsPage](#patchkmspage) - Update a page
* [removeKmsPage](#removekmspage) - Remove a page
* [updateKmsPage](#updatekmspage) - Update a page

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
                    .id("dd3b08ad-f869-4579-9edd-3b888507aa42")
                    .isActive(true)
                    .metadata(List.of())
                    .title("even minister extract")
                    .updatedAt(OffsetDateTime.parse("2025-10-15T18:40:34.522Z"))
                    .webUrl("https://another-petticoat.info")
                    .build())
                .connectionId("<id>")
                .build();

        CreateKmsPageResponse res = sdk.page().createKmsPage()
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

        GetKmsPageResponse res = sdk.page().getKmsPage()
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

        ListKmsPagesResponse res = sdk.page().listKmsPages()
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
                    .id("3f730c4e-8905-4ebe-81c4-69045b03454d")
                    .isActive(true)
                    .metadata(List.of())
                    .title("even minister extract")
                    .updatedAt(OffsetDateTime.parse("2025-10-15T18:40:34.531Z"))
                    .webUrl("https://another-petticoat.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchKmsPageResponse res = sdk.page().patchKmsPage()
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

        RemoveKmsPageResponse res = sdk.page().removeKmsPage()
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
                    .id("3f730c4e-8905-4ebe-81c4-69045b03454d")
                    .isActive(true)
                    .metadata(List.of())
                    .title("even minister extract")
                    .updatedAt(OffsetDateTime.parse("2025-10-15T18:40:34.531Z"))
                    .webUrl("https://another-petticoat.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateKmsPageResponse res = sdk.page().updateKmsPage()
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