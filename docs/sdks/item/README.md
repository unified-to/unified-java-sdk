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
                    .id("5db49e3f-2450-44d3-9f62-8dd0f4f6a195")
                    .isActive(false)
                    .isFeatured(false)
                    .isTaxable(true)
                    .isVisible(true)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/v73y0uzyK/3001/972")
                            .alt("Caterva eveniet acies candidus.")
                            .height(876d)
                            .id("69bdf5be-932e-4686-a405-3fb7cdf19bb0")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("bed28002-b8a1-497d-b4e5-49a332ff8049")
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
                            .id("fe2cbd3c-a49f-4ce7-9cc6-a88f8eeeeaf4")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("d04c18d1-e0b4-40a3-9e70-284bdc91303b")
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
                            .id("6b0fee14-bf6f-4f21-ac08-216d9022e77a")
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
                    .updatedAt(OffsetDateTime.parse("2022-04-24T20:46:28.393Z"))
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
                    .id("b4974379-f81f-46d9-a96a-9b54131fca66")
                    .isActive(false)
                    .isFeatured(false)
                    .isTaxable(true)
                    .isVisible(true)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/v73y0uzyK/3001/972")
                            .alt("Caterva eveniet acies candidus.")
                            .height(876d)
                            .id("f9ea8dbf-cee5-45bc-b97a-d8d07e0f3474")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("8aef3ed7-9a2d-42de-af1a-4b298b4f6a63")
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
                            .id("06afdc05-e40e-4ec1-a43c-914a16efb6bc")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("84220552-d353-4e94-bf46-19607d012deb")
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
                            .id("0deb854b-1878-4ada-bd0a-b809f7f51f2d")
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
                    .updatedAt(OffsetDateTime.parse("2022-04-24T20:46:28.405Z"))
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
                    .id("b4974379-f81f-46d9-a96a-9b54131fca66")
                    .isActive(false)
                    .isFeatured(false)
                    .isTaxable(true)
                    .isVisible(true)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/v73y0uzyK/3001/972")
                            .alt("Caterva eveniet acies candidus.")
                            .height(876d)
                            .id("f9ea8dbf-cee5-45bc-b97a-d8d07e0f3474")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("8aef3ed7-9a2d-42de-af1a-4b298b4f6a63")
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
                            .id("06afdc05-e40e-4ec1-a43c-914a16efb6bc")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("84220552-d353-4e94-bf46-19607d012deb")
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
                            .id("0deb854b-1878-4ada-bd0a-b809f7f51f2d")
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
                    .updatedAt(OffsetDateTime.parse("2022-04-24T20:46:28.405Z"))
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