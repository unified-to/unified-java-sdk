# Item

## Overview

### Available Operations

* [createCommerceItem](#createcommerceitem) - Create an item
* [getCommerceItem](#getcommerceitem) - Retrieve an item
* [listCommerceItems](#listcommerceitems) - List all items
* [patchCommerceItem](#patchcommerceitem) - Update an item
* [removeCommerceItem](#removecommerceitem) - Remove an item
* [updateCommerceItem](#updatecommerceitem) - Update an item

## createCommerceItem

Creates a CommerceItem. Provide the unified CommerceItem fields in the request body; they are mapped to the provider's API. Returns the created CommerceItem.

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceItem" method="post" path="/commerce/{connection_id}/item" example="commerce_item" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceItemRequest;
import to.unified.unified_java_sdk.models.operations.CreateCommerceItemResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceItemRequest req = CreateCommerceItemRequest.builder()
                .commerceItem(CommerceItem.builder()
                    .collections(List.of())
                    .createdAt(OffsetDateTime.parse("2019-06-21T20:16:18.628Z"))
                    .description("Decretum vulnero ustulo abeo.")
                    .duration(104d)
                    .globalCode("978-0-85270-680-0")
                    .id("437c76a0-bdd5-4db4-9a05-f08a9e5759cd")
                    .isActive(false)
                    .isFeatured(false)
                    .isTaxable(true)
                    .isVisible(true)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/v73y0uzyK/3001/972")
                            .alt("Caterva eveniet acies candidus.")
                            .height(876d)
                            .id("261a2a2c-38ee-4ac5-bde7-bf1cca5a63a5")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("ce6e082f-5815-4d21-a290-5e63bedc60d5")
                                    .slug("doloremque")
                                    .value(CommerceMetadataValue.of("allatus"))
                                    .build()))
                            .position(21d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(67d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/Ao4iatfO/771/3906")
                            .alt("Comedo.")
                            .height(651d)
                            .id("f11ffcef-9f15-41e9-b80f-e5d320995d15")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("f9ed7e80-8b77-4497-b761-19cc62badd48")
                                    .slug("bis")
                                    .value(CommerceMetadataValue.of("somniculosus"))
                                    .build()))
                            .position(51d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(3d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .extraData(CommerceMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CommerceMetadataFormat.TEXT)
                            .id("70e80a04-69b0-494c-9a67-e4b12e97a240")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("abstergo"))
                            .build()))
                    .name("Handcrafted Rubber Tuna")
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(78.11)
                            .currency("USD")
                            .build()))
                    .publicDescription("Custodia ventus solio compono.")
                    .publicName("Handcrafted Rubber Tuna")
                    .requiresShipping(true)
                    .slug("handcrafted-rubber-tuna")
                    .tags(List.of(
                        "beatae",
                        "blanditiis"))
                    .totalStock(682d)
                    .type("SERVICE")
                    .updatedAt(OffsetDateTime.parse("2022-04-27T14:35:31.946Z"))
                    .vendorName("Mayer - Flatley")
                    .weight(37d)
                    .weightUnit(WeightUnit.OZ)
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceItemResponse res = sdk.item().createCommerceItem()
                .request(req)
                .call();

        if (res.commerceItem().isPresent()) {
            System.out.println(res.commerceItem().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateCommerceItemRequest](../../models/operations/CreateCommerceItemRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateCommerceItemResponse](../../models/operations/CreateCommerceItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceItem

Retrieves a single CommerceItem by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceItem" method="get" path="/commerce/{connection_id}/item/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceItemRequest;
import to.unified.unified_java_sdk.models.operations.GetCommerceItemResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceItemRequest req = GetCommerceItemRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceItemResponse res = sdk.item().getCommerceItem()
                .request(req)
                .call();

        if (res.commerceItem().isPresent()) {
            System.out.println(res.commerceItem().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetCommerceItemRequest](../../models/operations/GetCommerceItemRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetCommerceItemResponse](../../models/operations/GetCommerceItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceItems

Returns a list of CommerceItems. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceItems" method="get" path="/commerce/{connection_id}/item" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceItemsRequest;
import to.unified.unified_java_sdk.models.operations.ListCommerceItemsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceItemsRequest req = ListCommerceItemsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCommerceItemsResponse res = sdk.item().listCommerceItems()
                .request(req)
                .call();

        if (res.commerceItems().isPresent()) {
            System.out.println(res.commerceItems().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListCommerceItemsRequest](../../models/operations/ListCommerceItemsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListCommerceItemsResponse](../../models/operations/ListCommerceItemsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceItem

Updates the CommerceItem identified by `id`. Provide the unified CommerceItem fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceItem" method="patch" path="/commerce/{connection_id}/item/{id}" example="commerce_item" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceItemRequest;
import to.unified.unified_java_sdk.models.operations.PatchCommerceItemResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceItemRequest req = PatchCommerceItemRequest.builder()
                .commerceItem(CommerceItem.builder()
                    .collections(List.of())
                    .createdAt(OffsetDateTime.parse("2019-06-21T20:16:18.628Z"))
                    .description("Decretum vulnero ustulo abeo.")
                    .duration(104d)
                    .globalCode("978-0-85270-680-0")
                    .id("64ebec5b-e68c-4940-875e-2a3b0b62d21d")
                    .isActive(false)
                    .isFeatured(false)
                    .isTaxable(true)
                    .isVisible(true)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/v73y0uzyK/3001/972")
                            .alt("Caterva eveniet acies candidus.")
                            .height(876d)
                            .id("31753e99-0494-4e5c-a028-bfb9fb2df21e")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("e25b4a54-087e-44f6-89a5-6e8f262025d2")
                                    .slug("doloremque")
                                    .value(CommerceMetadataValue.of("allatus"))
                                    .build()))
                            .position(21d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(67d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/Ao4iatfO/771/3906")
                            .alt("Comedo.")
                            .height(651d)
                            .id("4f9d72e1-2d31-4fa8-aa5e-048dce74f1f8")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("12dab5e4-5ebe-49f7-bbad-53988216651b")
                                    .slug("bis")
                                    .value(CommerceMetadataValue.of("somniculosus"))
                                    .build()))
                            .position(51d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(3d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .extraData(CommerceMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CommerceMetadataFormat.TEXT)
                            .id("3327eefb-3adc-4e26-b3c3-f969f163f1b1")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("abstergo"))
                            .build()))
                    .name("Handcrafted Rubber Tuna")
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(78.11)
                            .currency("USD")
                            .build()))
                    .publicDescription("Custodia ventus solio compono.")
                    .publicName("Handcrafted Rubber Tuna")
                    .requiresShipping(true)
                    .slug("handcrafted-rubber-tuna")
                    .tags(List.of(
                        "beatae",
                        "blanditiis"))
                    .totalStock(682d)
                    .type("SERVICE")
                    .updatedAt(OffsetDateTime.parse("2022-04-27T14:35:31.954Z"))
                    .vendorName("Mayer - Flatley")
                    .weight(37d)
                    .weightUnit(WeightUnit.OZ)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceItemResponse res = sdk.item().patchCommerceItem()
                .request(req)
                .call();

        if (res.commerceItem().isPresent()) {
            System.out.println(res.commerceItem().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchCommerceItemRequest](../../models/operations/PatchCommerceItemRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchCommerceItemResponse](../../models/operations/PatchCommerceItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceItem

Deletes the CommerceItem identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceItem" method="delete" path="/commerce/{connection_id}/item/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceItemRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceItemResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceItemRequest req = RemoveCommerceItemRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceItemResponse res = sdk.item().removeCommerceItem()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveCommerceItemRequest](../../models/operations/RemoveCommerceItemRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveCommerceItemResponse](../../models/operations/RemoveCommerceItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceItem

Updates the CommerceItem identified by `id`. Provide the unified CommerceItem fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceItem" method="put" path="/commerce/{connection_id}/item/{id}" example="commerce_item" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceItemRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceItemResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceItemRequest req = UpdateCommerceItemRequest.builder()
                .commerceItem(CommerceItem.builder()
                    .collections(List.of())
                    .createdAt(OffsetDateTime.parse("2019-06-21T20:16:18.628Z"))
                    .description("Decretum vulnero ustulo abeo.")
                    .duration(104d)
                    .globalCode("978-0-85270-680-0")
                    .id("64ebec5b-e68c-4940-875e-2a3b0b62d21d")
                    .isActive(false)
                    .isFeatured(false)
                    .isTaxable(true)
                    .isVisible(true)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/v73y0uzyK/3001/972")
                            .alt("Caterva eveniet acies candidus.")
                            .height(876d)
                            .id("31753e99-0494-4e5c-a028-bfb9fb2df21e")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("e25b4a54-087e-44f6-89a5-6e8f262025d2")
                                    .slug("doloremque")
                                    .value(CommerceMetadataValue.of("allatus"))
                                    .build()))
                            .position(21d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(67d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/Ao4iatfO/771/3906")
                            .alt("Comedo.")
                            .height(651d)
                            .id("4f9d72e1-2d31-4fa8-aa5e-048dce74f1f8")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("12dab5e4-5ebe-49f7-bbad-53988216651b")
                                    .slug("bis")
                                    .value(CommerceMetadataValue.of("somniculosus"))
                                    .build()))
                            .position(51d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(3d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .extraData(CommerceMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CommerceMetadataFormat.TEXT)
                            .id("3327eefb-3adc-4e26-b3c3-f969f163f1b1")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("abstergo"))
                            .build()))
                    .name("Handcrafted Rubber Tuna")
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(78.11)
                            .currency("USD")
                            .build()))
                    .publicDescription("Custodia ventus solio compono.")
                    .publicName("Handcrafted Rubber Tuna")
                    .requiresShipping(true)
                    .slug("handcrafted-rubber-tuna")
                    .tags(List.of(
                        "beatae",
                        "blanditiis"))
                    .totalStock(682d)
                    .type("SERVICE")
                    .updatedAt(OffsetDateTime.parse("2022-04-27T14:35:31.954Z"))
                    .vendorName("Mayer - Flatley")
                    .weight(37d)
                    .weightUnit(WeightUnit.OZ)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceItemResponse res = sdk.item().updateCommerceItem()
                .request(req)
                .call();

        if (res.commerceItem().isPresent()) {
            System.out.println(res.commerceItem().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateCommerceItemRequest](../../models/operations/UpdateCommerceItemRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateCommerceItemResponse](../../models/operations/UpdateCommerceItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |