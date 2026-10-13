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

Create an itemvariant

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
                    .availableAt(OffsetDateTime.parse("2022-02-02T16:10:33.503Z"))
                    .createdAt(OffsetDateTime.parse("2022-01-20T13:49:12.968Z"))
                    .description("Featuring Helium-enhanced technology, our Chips offers unparalleled helpful performance")
                    .height(52d)
                    .id("ec772c6b-acac-48e1-bc8c-c6c9b4ec26ad")
                    .isActive(false)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(94d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/u0YdHqlRu/2007/3208")
                            .alt("Calcar delibero cursim summisse.")
                            .height(394d)
                            .id("271221a4-2d74-4b56-b888-148722530f06")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("ba9464aa-7fc6-462b-ac4b-64a5ad7712cc")
                                    .slug("illo")
                                    .value(CommerceMetadataValue.of("quia"))
                                    .build()))
                            .position(92d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(54d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/2230/1237?lock=8628070842159966")
                            .alt("Civitas acies substantia tergo.")
                            .height(351d)
                            .id("272d1630-25ec-4d0e-994c-be530997df2c")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("a76e22ec-c5db-4a2d-aefe-75bfd773b01a")
                                    .slug("libero")
                                    .value(CommerceMetadataValue.of("capitulus"))
                                    .build()))
                            .position(44d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(55d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .extraData(CommerceMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CommerceMetadataFormat.TEXT)
                            .id("c606b404-ac3e-42bc-86f5-bf65b2cb6f0d")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("nihil"))
                            .build()))
                    .name("Keyboard")
                    .options(List.of(
                        CommerceItemOption.builder()
                            .name("Steel")
                            .values(List.of(
                                "Granite",
                                "Plastic"))
                            .id("d87b6be3-4a36-4deb-bb4a-85e934a72bd3")
                            .position(97d)
                            .build()))
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(4913d)
                            .compareAtPrice(3745d)
                            .currency("COP")
                            .build(),
                        CommerceItemPrice.builder()
                            .price(1378d)
                            .compareAtPrice(438d)
                            .currency("PHP")
                            .build(),
                        CommerceItemPrice.builder()
                            .price(8702d)
                            .compareAtPrice(1614d)
                            .currency("PHP")
                            .build()))
                    .publicDescription("Stylish Soap designed to make you stand out with insistent looks")
                    .publicName("Keyboard")
                    .requiresShipping(false)
                    .sizeUnit(SizeUnit.CM)
                    .sku("978-0-7051-0955-0")
                    .tags(List.of(
                        "vomito",
                        "custodia"))
                    .totalStock(929d)
                    .updatedAt(OffsetDateTime.parse("2025-06-11T02:16:59.706Z"))
                    .weight(61d)
                    .weightUnit(CommerceItemvariantWeightUnit.OZ)
                    .width(26d)
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

Retrieve an itemvariant

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

List all itemvariants

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

Update an itemvariant

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
                    .availableAt(OffsetDateTime.parse("2022-02-02T16:10:33.503Z"))
                    .createdAt(OffsetDateTime.parse("2022-01-20T13:49:12.968Z"))
                    .description("Featuring Helium-enhanced technology, our Chips offers unparalleled helpful performance")
                    .height(52d)
                    .id("0b800cf3-9e5b-4a2b-9c4f-ea742e88b149")
                    .isActive(false)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(94d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/u0YdHqlRu/2007/3208")
                            .alt("Calcar delibero cursim summisse.")
                            .height(394d)
                            .id("9d252aa2-95c7-41e8-9c41-7bad9dee38dc")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("b68c4fd9-f2f5-4817-a918-628368adc83f")
                                    .slug("illo")
                                    .value(CommerceMetadataValue.of("quia"))
                                    .build()))
                            .position(92d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(54d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/2230/1237?lock=8628070842159966")
                            .alt("Civitas acies substantia tergo.")
                            .height(351d)
                            .id("99e72f66-703a-4c2e-a9b2-5dbc43137195")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("f153efb5-486f-4435-aa5b-06d3f2bdfba8")
                                    .slug("libero")
                                    .value(CommerceMetadataValue.of("capitulus"))
                                    .build()))
                            .position(44d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(55d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .extraData(CommerceMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CommerceMetadataFormat.TEXT)
                            .id("d8b3f302-3131-4bce-b346-9113063afa22")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("nihil"))
                            .build()))
                    .name("Keyboard")
                    .options(List.of(
                        CommerceItemOption.builder()
                            .name("Steel")
                            .values(List.of(
                                "Granite",
                                "Plastic"))
                            .id("9ddb9b60-0f28-4d03-9400-780a522e52d5")
                            .position(97d)
                            .build()))
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(4913d)
                            .compareAtPrice(3745d)
                            .currency("COP")
                            .build(),
                        CommerceItemPrice.builder()
                            .price(1378d)
                            .compareAtPrice(438d)
                            .currency("PHP")
                            .build(),
                        CommerceItemPrice.builder()
                            .price(8702d)
                            .compareAtPrice(1614d)
                            .currency("PHP")
                            .build()))
                    .publicDescription("Stylish Soap designed to make you stand out with insistent looks")
                    .publicName("Keyboard")
                    .requiresShipping(false)
                    .sizeUnit(SizeUnit.CM)
                    .sku("978-0-7051-0955-0")
                    .tags(List.of(
                        "vomito",
                        "custodia"))
                    .totalStock(929d)
                    .updatedAt(OffsetDateTime.parse("2025-06-11T02:16:59.732Z"))
                    .weight(61d)
                    .weightUnit(CommerceItemvariantWeightUnit.OZ)
                    .width(26d)
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

Remove an itemvariant

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

Update an itemvariant

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
                    .availableAt(OffsetDateTime.parse("2022-02-02T16:10:33.503Z"))
                    .createdAt(OffsetDateTime.parse("2022-01-20T13:49:12.968Z"))
                    .description("Featuring Helium-enhanced technology, our Chips offers unparalleled helpful performance")
                    .height(52d)
                    .id("0b800cf3-9e5b-4a2b-9c4f-ea742e88b149")
                    .isActive(false)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(94d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/u0YdHqlRu/2007/3208")
                            .alt("Calcar delibero cursim summisse.")
                            .height(394d)
                            .id("9d252aa2-95c7-41e8-9c41-7bad9dee38dc")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("b68c4fd9-f2f5-4817-a918-628368adc83f")
                                    .slug("illo")
                                    .value(CommerceMetadataValue.of("quia"))
                                    .build()))
                            .position(92d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(54d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/2230/1237?lock=8628070842159966")
                            .alt("Civitas acies substantia tergo.")
                            .height(351d)
                            .id("99e72f66-703a-4c2e-a9b2-5dbc43137195")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("f153efb5-486f-4435-aa5b-06d3f2bdfba8")
                                    .slug("libero")
                                    .value(CommerceMetadataValue.of("capitulus"))
                                    .build()))
                            .position(44d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(55d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .extraData(CommerceMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CommerceMetadataFormat.TEXT)
                            .id("d8b3f302-3131-4bce-b346-9113063afa22")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("nihil"))
                            .build()))
                    .name("Keyboard")
                    .options(List.of(
                        CommerceItemOption.builder()
                            .name("Steel")
                            .values(List.of(
                                "Granite",
                                "Plastic"))
                            .id("9ddb9b60-0f28-4d03-9400-780a522e52d5")
                            .position(97d)
                            .build()))
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(4913d)
                            .compareAtPrice(3745d)
                            .currency("COP")
                            .build(),
                        CommerceItemPrice.builder()
                            .price(1378d)
                            .compareAtPrice(438d)
                            .currency("PHP")
                            .build(),
                        CommerceItemPrice.builder()
                            .price(8702d)
                            .compareAtPrice(1614d)
                            .currency("PHP")
                            .build()))
                    .publicDescription("Stylish Soap designed to make you stand out with insistent looks")
                    .publicName("Keyboard")
                    .requiresShipping(false)
                    .sizeUnit(SizeUnit.CM)
                    .sku("978-0-7051-0955-0")
                    .tags(List.of(
                        "vomito",
                        "custodia"))
                    .totalStock(929d)
                    .updatedAt(OffsetDateTime.parse("2025-06-11T02:16:59.732Z"))
                    .weight(61d)
                    .weightUnit(CommerceItemvariantWeightUnit.OZ)
                    .width(26d)
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