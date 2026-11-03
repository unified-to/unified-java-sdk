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
                    .name("Small Marble Chips")
                    .createdAt(OffsetDateTime.parse("2023-07-14T00:42:54.742Z"))
                    .description("The Integrated leading edge website Cheese offers reliable performance and productive design")
                    .id("0374ff7f-301b-4307-b813-3b7d0173455a")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .itemMetadata(List.of())
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/1319/1257?lock=7280448425732025")
                            .alt("Defungo adopto thorax.")
                            .height(759d)
                            .id("b9a59ca0-18f8-44df-9967-a61766e3bfd3")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("3bae3cd1-c221-4e59-832f-60f141e100d8")
                                    .slug("censura")
                                    .value(CommerceMetadataValue.of("toties"))
                                    .build()))
                            .position(80d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(40d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .id("66a38206-a689-4e98-b1b2-f2cd5b3a0b9f")
                            .slug("aetas")
                            .value(CommerceMetadataValue.of("consuasor"))
                            .build()))
                    .publicDescription("Generic Gloves designed with Cotton for miserable performance")
                    .publicName("Small Marble Chips")
                    .tags(List.of(
                        "ambulo",
                        "adeptio",
                        "contego"))
                    .type(CommerceCollectionType.COLLECTION)
                    .updatedAt(OffsetDateTime.parse("2025-03-21T16:49:13.827Z"))
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
                    .description("Ab.")
                    .id("89f1f5eb-3d8e-43a6-a609-1483b8804507")
                    .isActive(true)
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Accusamus earum sulum libero adficio testimonium vitae. Calcar contra vergo curis sollers. Caste brevis denuo. Tam amita ducimus capillus. Vulgaris temporibus arbustum solium id. Suppono commodo fuga surculus tripudio doloribus.")
                            .description("Aliquam tardus careo hic umbra.")
                            .languages(List.of(
                                "gl"))
                            .name("thymum")
                            .thumbnailUrl("https://picsum.photos/seed/15O5EfV/2982/752")
                            .type(LmsMediaType.HEADSHOT)
                            .url("https://loremflickr.com/2679/70?lock=6078357625960554")
                            .build()))
                    .metadata(List.of())
                    .name("ara")
                    .updatedAt(OffsetDateTime.parse("2026-08-11T21:41:10.244Z"))
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
                    .name("Small Marble Chips")
                    .createdAt(OffsetDateTime.parse("2023-07-14T00:42:54.742Z"))
                    .description("The Integrated leading edge website Cheese offers reliable performance and productive design")
                    .id("7b6c45f6-9076-4caf-87d2-cb0cf14e11db")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .itemMetadata(List.of())
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/1319/1257?lock=7280448425732025")
                            .alt("Defungo adopto thorax.")
                            .height(759d)
                            .id("49bcbe4b-be89-4def-ae56-f893e8e3a91b")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("5e52297c-0293-4e20-953f-e2aa757a521a")
                                    .slug("censura")
                                    .value(CommerceMetadataValue.of("toties"))
                                    .build()))
                            .position(80d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(40d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .id("4f8604e3-beee-4424-8f70-d23c82c92dcf")
                            .slug("aetas")
                            .value(CommerceMetadataValue.of("consuasor"))
                            .build()))
                    .publicDescription("Generic Gloves designed with Cotton for miserable performance")
                    .publicName("Small Marble Chips")
                    .tags(List.of(
                        "ambulo",
                        "adeptio",
                        "contego"))
                    .type(CommerceCollectionType.COLLECTION)
                    .updatedAt(OffsetDateTime.parse("2025-03-21T16:49:13.839Z"))
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
                    .description("Ab.")
                    .id("3001874f-7597-4451-bf44-6364ad241c0d")
                    .isActive(true)
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Accusamus earum sulum libero adficio testimonium vitae. Calcar contra vergo curis sollers. Caste brevis denuo. Tam amita ducimus capillus. Vulgaris temporibus arbustum solium id. Suppono commodo fuga surculus tripudio doloribus.")
                            .description("Aliquam tardus careo hic umbra.")
                            .languages(List.of(
                                "gl"))
                            .name("thymum")
                            .thumbnailUrl("https://picsum.photos/seed/15O5EfV/2982/752")
                            .type(LmsMediaType.HEADSHOT)
                            .url("https://loremflickr.com/2679/70?lock=6078357625960554")
                            .build()))
                    .metadata(List.of())
                    .name("ara")
                    .updatedAt(OffsetDateTime.parse("2026-08-11T21:41:10.261Z"))
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
                    .name("Small Marble Chips")
                    .createdAt(OffsetDateTime.parse("2023-07-14T00:42:54.742Z"))
                    .description("The Integrated leading edge website Cheese offers reliable performance and productive design")
                    .id("7b6c45f6-9076-4caf-87d2-cb0cf14e11db")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .itemMetadata(List.of())
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/1319/1257?lock=7280448425732025")
                            .alt("Defungo adopto thorax.")
                            .height(759d)
                            .id("49bcbe4b-be89-4def-ae56-f893e8e3a91b")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("5e52297c-0293-4e20-953f-e2aa757a521a")
                                    .slug("censura")
                                    .value(CommerceMetadataValue.of("toties"))
                                    .build()))
                            .position(80d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(40d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .id("4f8604e3-beee-4424-8f70-d23c82c92dcf")
                            .slug("aetas")
                            .value(CommerceMetadataValue.of("consuasor"))
                            .build()))
                    .publicDescription("Generic Gloves designed with Cotton for miserable performance")
                    .publicName("Small Marble Chips")
                    .tags(List.of(
                        "ambulo",
                        "adeptio",
                        "contego"))
                    .type(CommerceCollectionType.COLLECTION)
                    .updatedAt(OffsetDateTime.parse("2025-03-21T16:49:13.839Z"))
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
                    .description("Ab.")
                    .id("3001874f-7597-4451-bf44-6364ad241c0d")
                    .isActive(true)
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Accusamus earum sulum libero adficio testimonium vitae. Calcar contra vergo curis sollers. Caste brevis denuo. Tam amita ducimus capillus. Vulgaris temporibus arbustum solium id. Suppono commodo fuga surculus tripudio doloribus.")
                            .description("Aliquam tardus careo hic umbra.")
                            .languages(List.of(
                                "gl"))
                            .name("thymum")
                            .thumbnailUrl("https://picsum.photos/seed/15O5EfV/2982/752")
                            .type(LmsMediaType.HEADSHOT)
                            .url("https://loremflickr.com/2679/70?lock=6078357625960554")
                            .build()))
                    .metadata(List.of())
                    .name("ara")
                    .updatedAt(OffsetDateTime.parse("2026-08-11T21:41:10.261Z"))
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