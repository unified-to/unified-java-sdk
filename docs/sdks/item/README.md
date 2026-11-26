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
                    .description("Abeo surculus custodia ventus solio.")
                    .duration(104d)
                    .globalCode("978-0-85270-680-0")
                    .id("0c0eed07-bb81-4511-a662-02d0125fee5d")
                    .isActive(false)
                    .isFeatured(false)
                    .isTaxable(true)
                    .isVisible(true)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/uzyKI/235/2194")
                            .alt("Eveniet acies.")
                            .height(876d)
                            .id("3a3835d9-fb3a-4c63-9544-0c711748467d")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("c9d2eeb3-0287-44af-b39b-8b397930d878")
                                    .slug("candidus")
                                    .value(CommerceMetadataValue.of("doloremque"))
                                    .build()))
                            .position(21d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(67d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/NFAo4iatfO/383/771")
                            .alt("Comedo.")
                            .height(651d)
                            .id("56adb3df-b0af-4987-b2a8-223fa39ce639")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("b2b7064c-99a6-496e-bf9e-5176790903de")
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
                            .id("c886e6a4-bf4b-45e3-838f-59c85c949470")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("abstergo"))
                            .build()))
                    .name("Oriental Gold Tuna")
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(78.11)
                            .currency("USD")
                            .build()))
                    .publicDescription("Adfero neque.")
                    .publicName("Oriental Gold Tuna")
                    .requiresShipping(true)
                    .slug("oriental-gold-tuna")
                    .tags(List.of(
                        "dolores",
                        "amplus"))
                    .totalStock(682d)
                    .type("SERVICE")
                    .updatedAt(OffsetDateTime.parse("2022-05-03T08:43:44.685Z"))
                    .vendorName("Rohan - Pouros")
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
                    .description("Abeo surculus custodia ventus solio.")
                    .duration(104d)
                    .globalCode("978-0-85270-680-0")
                    .id("a3782667-b179-4add-95e6-2ebc75732d44")
                    .isActive(false)
                    .isFeatured(false)
                    .isTaxable(true)
                    .isVisible(true)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/uzyKI/235/2194")
                            .alt("Eveniet acies.")
                            .height(876d)
                            .id("b22e09fa-3226-4771-95bc-9b05b347e790")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("a8524413-1f2d-495f-8fc9-8f515c28079a")
                                    .slug("candidus")
                                    .value(CommerceMetadataValue.of("doloremque"))
                                    .build()))
                            .position(21d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(67d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/NFAo4iatfO/383/771")
                            .alt("Comedo.")
                            .height(651d)
                            .id("34c80feb-1179-4136-8af7-3632d5550ef4")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("450dc3c6-ca20-43c9-b863-7c0b2549f9d8")
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
                            .id("9f4e5643-1a26-42ad-8b45-8f3953849ff6")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("abstergo"))
                            .build()))
                    .name("Oriental Gold Tuna")
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(78.11)
                            .currency("USD")
                            .build()))
                    .publicDescription("Adfero neque.")
                    .publicName("Oriental Gold Tuna")
                    .requiresShipping(true)
                    .slug("oriental-gold-tuna")
                    .tags(List.of(
                        "dolores",
                        "amplus"))
                    .totalStock(682d)
                    .type("SERVICE")
                    .updatedAt(OffsetDateTime.parse("2022-05-03T08:43:44.702Z"))
                    .vendorName("Rohan - Pouros")
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
                    .description("Abeo surculus custodia ventus solio.")
                    .duration(104d)
                    .globalCode("978-0-85270-680-0")
                    .id("a3782667-b179-4add-95e6-2ebc75732d44")
                    .isActive(false)
                    .isFeatured(false)
                    .isTaxable(true)
                    .isVisible(true)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/uzyKI/235/2194")
                            .alt("Eveniet acies.")
                            .height(876d)
                            .id("b22e09fa-3226-4771-95bc-9b05b347e790")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("a8524413-1f2d-495f-8fc9-8f515c28079a")
                                    .slug("candidus")
                                    .value(CommerceMetadataValue.of("doloremque"))
                                    .build()))
                            .position(21d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(67d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/NFAo4iatfO/383/771")
                            .alt("Comedo.")
                            .height(651d)
                            .id("34c80feb-1179-4136-8af7-3632d5550ef4")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("450dc3c6-ca20-43c9-b863-7c0b2549f9d8")
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
                            .id("9f4e5643-1a26-42ad-8b45-8f3953849ff6")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("abstergo"))
                            .build()))
                    .name("Oriental Gold Tuna")
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(78.11)
                            .currency("USD")
                            .build()))
                    .publicDescription("Adfero neque.")
                    .publicName("Oriental Gold Tuna")
                    .requiresShipping(true)
                    .slug("oriental-gold-tuna")
                    .tags(List.of(
                        "dolores",
                        "amplus"))
                    .totalStock(682d)
                    .type("SERVICE")
                    .updatedAt(OffsetDateTime.parse("2022-05-03T08:43:44.702Z"))
                    .vendorName("Rohan - Pouros")
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