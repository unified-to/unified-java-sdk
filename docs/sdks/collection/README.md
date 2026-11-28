# Collection

## Overview

### Available Operations

* [createCommerceCollection](#createcommercecollection) - Create a collection
* [createLmsCollection](#createlmscollection) - Create a collection
* [getCommerceCollection](#getcommercecollection) - Retrieve a collection
* [getLmsCollection](#getlmscollection) - Retrieve a collection
* [listCommerceCollections](#listcommercecollections) - List all collections
* [listLmsCollections](#listlmscollections) - List all collections
* [patchCommerceCollection](#patchcommercecollection) - Update a collection
* [patchLmsCollection](#patchlmscollection) - Update a collection
* [removeCommerceCollection](#removecommercecollection) - Remove a collection
* [removeLmsCollection](#removelmscollection) - Remove a collection
* [updateCommerceCollection](#updatecommercecollection) - Update a collection
* [updateLmsCollection](#updatelmscollection) - Update a collection

## createCommerceCollection

Creates a CommerceCollection. Provide the unified CommerceCollection fields in the request body; they are mapped to the provider's API. Returns the created CommerceCollection.

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceCollection" method="post" path="/commerce/{connection_id}/collection" example="commerce_collection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceCollectionRequest;
import to.unified.unified_java_sdk.models.operations.CreateCommerceCollectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceCollectionRequest req = CreateCommerceCollectionRequest.builder()
                .commerceCollection(CommerceCollection.builder()
                    .name("Rustic Gold Mouse")
                    .createdAt(OffsetDateTime.parse("2023-07-14T00:42:54.742Z"))
                    .description("Ward - Hudson's most advanced Computer technology increases graceful capabilities")
                    .id("d7c3459a-a771-49d1-8e80-8a89b8926def")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .itemMetadata(List.of())
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/62m4msPNw/3209/1074")
                            .alt("Armarium amiculum amet defendo.")
                            .height(759d)
                            .id("6e77dbc8-8d50-43d5-8a07-87af2b56ba9b")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("19c7e608-c887-4d25-b069-9ebadf16860e")
                                    .slug("cernuus")
                                    .value(CommerceMetadataValue.of("torrens"))
                                    .build()))
                            .position(80d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(40d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .id("145d1dd0-d426-46d1-b583-c43e699a34ee")
                            .slug("velit")
                            .value(CommerceMetadataValue.of("aureus"))
                            .build()))
                    .publicDescription("Introducing the Sint Maarten-inspired Gloves, blending awful style with local craftsmanship")
                    .publicName("Rustic Gold Mouse")
                    .tags(List.of(
                        "viridis",
                        "deserunt",
                        "comparo"))
                    .type(CommerceCollectionType.COLLECTION)
                    .updatedAt(OffsetDateTime.parse("2025-04-03T10:53:38.632Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceCollectionResponse res = sdk.collection().createCommerceCollection()
                .request(req)
                .call();

        if (res.commerceCollection().isPresent()) {
            System.out.println(res.commerceCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateCommerceCollectionRequest](../../models/operations/CreateCommerceCollectionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateCommerceCollectionResponse](../../models/operations/CreateCommerceCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsCollection

Creates a LmsCollection. Provide the unified LmsCollection fields in the request body; they are mapped to the provider's API. Returns the created LmsCollection.

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsCollection" method="post" path="/lms/{connection_id}/collection" example="lms_collection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsCollectionRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsCollectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsCollectionRequest req = CreateLmsCollectionRequest.builder()
                .lmsCollection(LmsCollection.builder()
                    .createdAt(OffsetDateTime.parse("2019-08-19T14:40:29.227Z"))
                    .description("Defluo.")
                    .id("997cbaa0-8475-41b9-9aae-1ac8b62273c9")
                    .isActive(true)
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Sollers adeo caste brevis denuo attonbitus. Amita ducimus capillus claudeo vulgaris temporibus arbustum solium. Degusto suppono commodo fuga surculus tripudio doloribus. Quaerat cauda civitas carcer alveus alienus sperno vetus. Adulescens conspergo appositus arguo. Fugiat cimentarius depono angustus somniculosus tubineus terra beatae sui.")
                            .description("Alias sit careo vesco tollo.")
                            .languages(List.of(
                                "eo"))
                            .name("aiunt")
                            .thumbnailUrl("https://picsum.photos/seed/Iy2MXlem/2398/73")
                            .type(LmsMediaType.HEADSHOT)
                            .url("https://picsum.photos/seed/5KfxRKbzo1/2699/3216")
                            .build()))
                    .metadata(List.of())
                    .name("spargo")
                    .updatedAt(OffsetDateTime.parse("2026-09-05T02:18:56.324Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsCollectionResponse res = sdk.collection().createLmsCollection()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateLmsCollectionRequest](../../models/operations/CreateLmsCollectionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateLmsCollectionResponse](../../models/operations/CreateLmsCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceCollection

Retrieves a single CommerceCollection by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceCollection" method="get" path="/commerce/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceCollectionRequest;
import to.unified.unified_java_sdk.models.operations.GetCommerceCollectionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceCollectionRequest req = GetCommerceCollectionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceCollectionResponse res = sdk.collection().getCommerceCollection()
                .request(req)
                .call();

        if (res.commerceCollection().isPresent()) {
            System.out.println(res.commerceCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetCommerceCollectionRequest](../../models/operations/GetCommerceCollectionRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetCommerceCollectionResponse](../../models/operations/GetCommerceCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsCollection

Retrieves a single LmsCollection by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsCollection" method="get" path="/lms/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsCollectionRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsCollectionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsCollectionRequest req = GetLmsCollectionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsCollectionResponse res = sdk.collection().getLmsCollection()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetLmsCollectionRequest](../../models/operations/GetLmsCollectionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetLmsCollectionResponse](../../models/operations/GetLmsCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceCollections

Returns a list of CommerceCollections. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceCollections" method="get" path="/commerce/{connection_id}/collection" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceCollectionsRequest;
import to.unified.unified_java_sdk.models.operations.ListCommerceCollectionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceCollectionsRequest req = ListCommerceCollectionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCommerceCollectionsResponse res = sdk.collection().listCommerceCollections()
                .request(req)
                .call();

        if (res.commerceCollections().isPresent()) {
            System.out.println(res.commerceCollections().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListCommerceCollectionsRequest](../../models/operations/ListCommerceCollectionsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListCommerceCollectionsResponse](../../models/operations/ListCommerceCollectionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsCollections

Returns a list of LmsCollections. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsCollections" method="get" path="/lms/{connection_id}/collection" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsCollectionsRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsCollectionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsCollectionsRequest req = ListLmsCollectionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsCollectionsResponse res = sdk.collection().listLmsCollections()
                .request(req)
                .call();

        if (res.lmsCollections().isPresent()) {
            System.out.println(res.lmsCollections().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListLmsCollectionsRequest](../../models/operations/ListLmsCollectionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListLmsCollectionsResponse](../../models/operations/ListLmsCollectionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceCollection

Updates the CommerceCollection identified by `id`. Provide the unified CommerceCollection fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceCollection" method="patch" path="/commerce/{connection_id}/collection/{id}" example="commerce_collection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceCollectionRequest;
import to.unified.unified_java_sdk.models.operations.PatchCommerceCollectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceCollectionRequest req = PatchCommerceCollectionRequest.builder()
                .commerceCollection(CommerceCollection.builder()
                    .name("Rustic Gold Mouse")
                    .createdAt(OffsetDateTime.parse("2023-07-14T00:42:54.742Z"))
                    .description("Ward - Hudson's most advanced Computer technology increases graceful capabilities")
                    .id("7b1f831f-547b-4546-b4bf-5c3663927c82")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .itemMetadata(List.of())
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/62m4msPNw/3209/1074")
                            .alt("Armarium amiculum amet defendo.")
                            .height(759d)
                            .id("544b9b29-ea74-41a4-bf3a-4df9831da785")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("236a4ced-17bf-4475-ab49-69e7b705e7b9")
                                    .slug("cernuus")
                                    .value(CommerceMetadataValue.of("torrens"))
                                    .build()))
                            .position(80d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(40d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .id("07440df0-5cf4-4103-a23d-3cd3cacff0bb")
                            .slug("velit")
                            .value(CommerceMetadataValue.of("aureus"))
                            .build()))
                    .publicDescription("Introducing the Sint Maarten-inspired Gloves, blending awful style with local craftsmanship")
                    .publicName("Rustic Gold Mouse")
                    .tags(List.of(
                        "viridis",
                        "deserunt",
                        "comparo"))
                    .type(CommerceCollectionType.COLLECTION)
                    .updatedAt(OffsetDateTime.parse("2025-04-03T10:53:38.647Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceCollectionResponse res = sdk.collection().patchCommerceCollection()
                .request(req)
                .call();

        if (res.commerceCollection().isPresent()) {
            System.out.println(res.commerceCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchCommerceCollectionRequest](../../models/operations/PatchCommerceCollectionRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchCommerceCollectionResponse](../../models/operations/PatchCommerceCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsCollection

Updates the LmsCollection identified by `id`. Provide the unified LmsCollection fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsCollection" method="patch" path="/lms/{connection_id}/collection/{id}" example="lms_collection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsCollectionRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsCollectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsCollectionRequest req = PatchLmsCollectionRequest.builder()
                .lmsCollection(LmsCollection.builder()
                    .createdAt(OffsetDateTime.parse("2019-08-19T14:40:29.227Z"))
                    .description("Defluo.")
                    .id("5f8a6736-04bf-4894-880f-053b2eb5b3b4")
                    .isActive(true)
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Sollers adeo caste brevis denuo attonbitus. Amita ducimus capillus claudeo vulgaris temporibus arbustum solium. Degusto suppono commodo fuga surculus tripudio doloribus. Quaerat cauda civitas carcer alveus alienus sperno vetus. Adulescens conspergo appositus arguo. Fugiat cimentarius depono angustus somniculosus tubineus terra beatae sui.")
                            .description("Alias sit careo vesco tollo.")
                            .languages(List.of(
                                "eo"))
                            .name("aiunt")
                            .thumbnailUrl("https://picsum.photos/seed/Iy2MXlem/2398/73")
                            .type(LmsMediaType.HEADSHOT)
                            .url("https://picsum.photos/seed/5KfxRKbzo1/2699/3216")
                            .build()))
                    .metadata(List.of())
                    .name("spargo")
                    .updatedAt(OffsetDateTime.parse("2026-09-05T02:18:56.334Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsCollectionResponse res = sdk.collection().patchLmsCollection()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchLmsCollectionRequest](../../models/operations/PatchLmsCollectionRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchLmsCollectionResponse](../../models/operations/PatchLmsCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceCollection

Deletes the CommerceCollection identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceCollection" method="delete" path="/commerce/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceCollectionRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceCollectionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceCollectionRequest req = RemoveCommerceCollectionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceCollectionResponse res = sdk.collection().removeCommerceCollection()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveCommerceCollectionRequest](../../models/operations/RemoveCommerceCollectionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveCommerceCollectionResponse](../../models/operations/RemoveCommerceCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsCollection

Deletes the LmsCollection identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsCollection" method="delete" path="/lms/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCollectionRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCollectionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsCollectionRequest req = RemoveLmsCollectionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsCollectionResponse res = sdk.collection().removeLmsCollection()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveLmsCollectionRequest](../../models/operations/RemoveLmsCollectionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveLmsCollectionResponse](../../models/operations/RemoveLmsCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceCollection

Updates the CommerceCollection identified by `id`. Provide the unified CommerceCollection fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceCollection" method="put" path="/commerce/{connection_id}/collection/{id}" example="commerce_collection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceCollectionRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceCollectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceCollectionRequest req = UpdateCommerceCollectionRequest.builder()
                .commerceCollection(CommerceCollection.builder()
                    .name("Rustic Gold Mouse")
                    .createdAt(OffsetDateTime.parse("2023-07-14T00:42:54.742Z"))
                    .description("Ward - Hudson's most advanced Computer technology increases graceful capabilities")
                    .id("7b1f831f-547b-4546-b4bf-5c3663927c82")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .itemMetadata(List.of())
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/62m4msPNw/3209/1074")
                            .alt("Armarium amiculum amet defendo.")
                            .height(759d)
                            .id("544b9b29-ea74-41a4-bf3a-4df9831da785")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("236a4ced-17bf-4475-ab49-69e7b705e7b9")
                                    .slug("cernuus")
                                    .value(CommerceMetadataValue.of("torrens"))
                                    .build()))
                            .position(80d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(40d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .id("07440df0-5cf4-4103-a23d-3cd3cacff0bb")
                            .slug("velit")
                            .value(CommerceMetadataValue.of("aureus"))
                            .build()))
                    .publicDescription("Introducing the Sint Maarten-inspired Gloves, blending awful style with local craftsmanship")
                    .publicName("Rustic Gold Mouse")
                    .tags(List.of(
                        "viridis",
                        "deserunt",
                        "comparo"))
                    .type(CommerceCollectionType.COLLECTION)
                    .updatedAt(OffsetDateTime.parse("2025-04-03T10:53:38.647Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceCollectionResponse res = sdk.collection().updateCommerceCollection()
                .request(req)
                .call();

        if (res.commerceCollection().isPresent()) {
            System.out.println(res.commerceCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateCommerceCollectionRequest](../../models/operations/UpdateCommerceCollectionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateCommerceCollectionResponse](../../models/operations/UpdateCommerceCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsCollection

Updates the LmsCollection identified by `id`. Provide the unified LmsCollection fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsCollection" method="put" path="/lms/{connection_id}/collection/{id}" example="lms_collection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCollectionRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCollectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsCollectionRequest req = UpdateLmsCollectionRequest.builder()
                .lmsCollection(LmsCollection.builder()
                    .createdAt(OffsetDateTime.parse("2019-08-19T14:40:29.227Z"))
                    .description("Defluo.")
                    .id("5f8a6736-04bf-4894-880f-053b2eb5b3b4")
                    .isActive(true)
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Sollers adeo caste brevis denuo attonbitus. Amita ducimus capillus claudeo vulgaris temporibus arbustum solium. Degusto suppono commodo fuga surculus tripudio doloribus. Quaerat cauda civitas carcer alveus alienus sperno vetus. Adulescens conspergo appositus arguo. Fugiat cimentarius depono angustus somniculosus tubineus terra beatae sui.")
                            .description("Alias sit careo vesco tollo.")
                            .languages(List.of(
                                "eo"))
                            .name("aiunt")
                            .thumbnailUrl("https://picsum.photos/seed/Iy2MXlem/2398/73")
                            .type(LmsMediaType.HEADSHOT)
                            .url("https://picsum.photos/seed/5KfxRKbzo1/2699/3216")
                            .build()))
                    .metadata(List.of())
                    .name("spargo")
                    .updatedAt(OffsetDateTime.parse("2026-09-05T02:18:56.334Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsCollectionResponse res = sdk.collection().updateLmsCollection()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateLmsCollectionRequest](../../models/operations/UpdateLmsCollectionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateLmsCollectionResponse](../../models/operations/UpdateLmsCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |