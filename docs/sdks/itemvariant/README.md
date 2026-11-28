# Itemvariant

## Overview

### Available Operations

* [createCommerceItemvariant](#createcommerceitemvariant) - Create an itemvariant
* [getCommerceItemvariant](#getcommerceitemvariant) - Retrieve an itemvariant
* [listCommerceItemvariants](#listcommerceitemvariants) - List all itemvariants
* [patchCommerceItemvariant](#patchcommerceitemvariant) - Update an itemvariant
* [removeCommerceItemvariant](#removecommerceitemvariant) - Remove an itemvariant
* [updateCommerceItemvariant](#updatecommerceitemvariant) - Update an itemvariant

## createCommerceItemvariant

Creates a CommerceItemvariant. Provide the unified CommerceItemvariant fields in the request body; they are mapped to the provider's API. Returns the created CommerceItemvariant.

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceItemvariant" method="post" path="/commerce/{connection_id}/itemvariant" example="commerce_itemvariant" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceItemvariantRequest;
import to.unified.unified_java_sdk.models.operations.CreateCommerceItemvariantResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceItemvariantRequest req = CreateCommerceItemvariantRequest.builder()
                .commerceItemvariant(CommerceItemvariant.builder()
                    .availableAt(OffsetDateTime.parse("2022-02-06T18:14:41.644Z"))
                    .createdAt(OffsetDateTime.parse("2022-01-20T13:49:12.968Z"))
                    .description("Our dog-friendly Bacon ensures pessimistic comfort for your pets")
                    .height(54d)
                    .id("c2495dad-a219-4f0b-809e-0539e181f318")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(92d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/u0YdHqlRu/3208/3394")
                            .alt("Calcar delibero cursim summisse.")
                            .height(961d)
                            .id("44b84797-a53f-44f2-8351-166052c2a00d")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("8a5aba8a-d5b5-4778-b119-7095db8027db")
                                    .slug("illo")
                                    .value(CommerceMetadataValue.of("quia"))
                                    .build()))
                            .position(72d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(35d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .extraData(CommerceMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CommerceMetadataFormat.TEXT)
                            .id("86b3d5c4-07e0-409a-b9da-9ea32814fd0e")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("colligo"))
                            .build()))
                    .name("Table")
                    .options(List.of(
                        CommerceItemOption.builder()
                            .name("Color")
                            .values(List.of(
                                "purple"))
                            .id("7b81f9ef-d9ff-4c27-bbc9-9194c231f61a")
                            .position(1d)
                            .build(),
                        CommerceItemOption.builder()
                            .name("Size")
                            .values(List.of(
                                "S"))
                            .id("169b6a6a-8da9-4145-a3e4-755c3731f952")
                            .position(2d)
                            .build()))
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(382.23)
                            .currency("USD")
                            .build()))
                    .publicDescription("New teal Gloves with ergonomic design for favorite comfort")
                    .publicName("Table")
                    .requiresShipping(false)
                    .sizeUnit(SizeUnit.CM)
                    .sku("978-1-05-109555-9")
                    .tags(List.of(
                        "labore"))
                    .totalStock(436d)
                    .updatedAt(OffsetDateTime.parse("2026-04-11T17:53:43.673Z"))
                    .weight(46d)
                    .weightUnit(CommerceItemvariantWeightUnit.OZ)
                    .width(40d)
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceItemvariantResponse res = sdk.itemvariant().createCommerceItemvariant()
                .request(req)
                .call();

        if (res.commerceItemvariant().isPresent()) {
            System.out.println(res.commerceItemvariant().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [CreateCommerceItemvariantRequest](../../models/operations/CreateCommerceItemvariantRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[CreateCommerceItemvariantResponse](../../models/operations/CreateCommerceItemvariantResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceItemvariant

Retrieves a single CommerceItemvariant by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceItemvariant" method="get" path="/commerce/{connection_id}/itemvariant/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceItemvariantRequest;
import to.unified.unified_java_sdk.models.operations.GetCommerceItemvariantResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceItemvariantRequest req = GetCommerceItemvariantRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceItemvariantResponse res = sdk.itemvariant().getCommerceItemvariant()
                .request(req)
                .call();

        if (res.commerceItemvariant().isPresent()) {
            System.out.println(res.commerceItemvariant().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetCommerceItemvariantRequest](../../models/operations/GetCommerceItemvariantRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetCommerceItemvariantResponse](../../models/operations/GetCommerceItemvariantResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceItemvariants

Returns a list of CommerceItemvariants. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceItemvariants" method="get" path="/commerce/{connection_id}/itemvariant" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceItemvariantsRequest;
import to.unified.unified_java_sdk.models.operations.ListCommerceItemvariantsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceItemvariantsRequest req = ListCommerceItemvariantsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCommerceItemvariantsResponse res = sdk.itemvariant().listCommerceItemvariants()
                .request(req)
                .call();

        if (res.commerceItemvariants().isPresent()) {
            System.out.println(res.commerceItemvariants().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListCommerceItemvariantsRequest](../../models/operations/ListCommerceItemvariantsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListCommerceItemvariantsResponse](../../models/operations/ListCommerceItemvariantsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceItemvariant

Updates the CommerceItemvariant identified by `id`. Provide the unified CommerceItemvariant fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceItemvariant" method="patch" path="/commerce/{connection_id}/itemvariant/{id}" example="commerce_itemvariant" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceItemvariantRequest;
import to.unified.unified_java_sdk.models.operations.PatchCommerceItemvariantResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceItemvariantRequest req = PatchCommerceItemvariantRequest.builder()
                .commerceItemvariant(CommerceItemvariant.builder()
                    .availableAt(OffsetDateTime.parse("2022-02-06T18:14:41.644Z"))
                    .createdAt(OffsetDateTime.parse("2022-01-20T13:49:12.968Z"))
                    .description("Our dog-friendly Bacon ensures pessimistic comfort for your pets")
                    .height(54d)
                    .id("c73ec5e5-67e3-4c08-99da-7e8052229b21")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(92d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/u0YdHqlRu/3208/3394")
                            .alt("Calcar delibero cursim summisse.")
                            .height(961d)
                            .id("3f19c482-faa8-4df1-a1db-a49cf14c1a6d")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("a5456b31-b836-4cb6-aa5a-de5093d603a1")
                                    .slug("illo")
                                    .value(CommerceMetadataValue.of("quia"))
                                    .build()))
                            .position(72d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(35d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .extraData(CommerceMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CommerceMetadataFormat.TEXT)
                            .id("9594837b-e0ae-412a-b0de-b8ab976f62f3")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("colligo"))
                            .build()))
                    .name("Table")
                    .options(List.of(
                        CommerceItemOption.builder()
                            .name("Color")
                            .values(List.of(
                                "purple"))
                            .id("eec01b91-8f24-4eea-8834-222912ba8df2")
                            .position(1d)
                            .build(),
                        CommerceItemOption.builder()
                            .name("Size")
                            .values(List.of(
                                "S"))
                            .id("d9d5aa5c-ae24-4bf4-a144-d699011eaba5")
                            .position(2d)
                            .build()))
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(382.23)
                            .currency("USD")
                            .build()))
                    .publicDescription("New teal Gloves with ergonomic design for favorite comfort")
                    .publicName("Table")
                    .requiresShipping(false)
                    .sizeUnit(SizeUnit.CM)
                    .sku("978-1-05-109555-9")
                    .tags(List.of(
                        "labore"))
                    .totalStock(436d)
                    .updatedAt(OffsetDateTime.parse("2026-04-11T17:53:43.694Z"))
                    .weight(46d)
                    .weightUnit(CommerceItemvariantWeightUnit.OZ)
                    .width(40d)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceItemvariantResponse res = sdk.itemvariant().patchCommerceItemvariant()
                .request(req)
                .call();

        if (res.commerceItemvariant().isPresent()) {
            System.out.println(res.commerceItemvariant().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [PatchCommerceItemvariantRequest](../../models/operations/PatchCommerceItemvariantRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[PatchCommerceItemvariantResponse](../../models/operations/PatchCommerceItemvariantResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceItemvariant

Deletes the CommerceItemvariant identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceItemvariant" method="delete" path="/commerce/{connection_id}/itemvariant/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceItemvariantRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceItemvariantResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceItemvariantRequest req = RemoveCommerceItemvariantRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceItemvariantResponse res = sdk.itemvariant().removeCommerceItemvariant()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [RemoveCommerceItemvariantRequest](../../models/operations/RemoveCommerceItemvariantRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[RemoveCommerceItemvariantResponse](../../models/operations/RemoveCommerceItemvariantResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceItemvariant

Updates the CommerceItemvariant identified by `id`. Provide the unified CommerceItemvariant fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceItemvariant" method="put" path="/commerce/{connection_id}/itemvariant/{id}" example="commerce_itemvariant" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceItemvariantRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceItemvariantResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceItemvariantRequest req = UpdateCommerceItemvariantRequest.builder()
                .commerceItemvariant(CommerceItemvariant.builder()
                    .availableAt(OffsetDateTime.parse("2022-02-06T18:14:41.644Z"))
                    .createdAt(OffsetDateTime.parse("2022-01-20T13:49:12.968Z"))
                    .description("Our dog-friendly Bacon ensures pessimistic comfort for your pets")
                    .height(54d)
                    .id("c73ec5e5-67e3-4c08-99da-7e8052229b21")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(92d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/u0YdHqlRu/3208/3394")
                            .alt("Calcar delibero cursim summisse.")
                            .height(961d)
                            .id("3f19c482-faa8-4df1-a1db-a49cf14c1a6d")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("a5456b31-b836-4cb6-aa5a-de5093d603a1")
                                    .slug("illo")
                                    .value(CommerceMetadataValue.of("quia"))
                                    .build()))
                            .position(72d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(35d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .extraData(CommerceMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CommerceMetadataFormat.TEXT)
                            .id("9594837b-e0ae-412a-b0de-b8ab976f62f3")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("colligo"))
                            .build()))
                    .name("Table")
                    .options(List.of(
                        CommerceItemOption.builder()
                            .name("Color")
                            .values(List.of(
                                "purple"))
                            .id("eec01b91-8f24-4eea-8834-222912ba8df2")
                            .position(1d)
                            .build(),
                        CommerceItemOption.builder()
                            .name("Size")
                            .values(List.of(
                                "S"))
                            .id("d9d5aa5c-ae24-4bf4-a144-d699011eaba5")
                            .position(2d)
                            .build()))
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(382.23)
                            .currency("USD")
                            .build()))
                    .publicDescription("New teal Gloves with ergonomic design for favorite comfort")
                    .publicName("Table")
                    .requiresShipping(false)
                    .sizeUnit(SizeUnit.CM)
                    .sku("978-1-05-109555-9")
                    .tags(List.of(
                        "labore"))
                    .totalStock(436d)
                    .updatedAt(OffsetDateTime.parse("2026-04-11T17:53:43.694Z"))
                    .weight(46d)
                    .weightUnit(CommerceItemvariantWeightUnit.OZ)
                    .width(40d)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceItemvariantResponse res = sdk.itemvariant().updateCommerceItemvariant()
                .request(req)
                .call();

        if (res.commerceItemvariant().isPresent()) {
            System.out.println(res.commerceItemvariant().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [UpdateCommerceItemvariantRequest](../../models/operations/UpdateCommerceItemvariantRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[UpdateCommerceItemvariantResponse](../../models/operations/UpdateCommerceItemvariantResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |