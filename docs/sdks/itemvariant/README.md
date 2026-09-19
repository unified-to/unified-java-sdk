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
                    .id("51bf8bb9-328e-4d2e-b271-7af17b4e8ccf")
                    .isActive(false)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(94d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/u0YdHqlRu/2007/3208")
                            .alt("Calcar delibero cursim summisse.")
                            .height(394d)
                            .id("b393884b-ca2f-402a-a2ed-2cf770c1c96c")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("68b648cd-d843-4b33-bd92-df9a6e37074b")
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
                            .id("656aa8ae-d8c9-4b97-8b79-be1fee2fec34")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("08a5c34e-5d49-46f8-a8d9-106f1929e51c")
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
                            .id("e2dfa878-dae9-4913-9b5c-83617181476f")
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
                            .id("747bd800-3b91-43ba-899a-eb5eff89b109")
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
                    .updatedAt(OffsetDateTime.parse("2025-05-25T02:47:33.082Z"))
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
                    .id("d10365e2-f19a-42b6-af06-f2a2a30c80a8")
                    .isActive(false)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(94d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/u0YdHqlRu/2007/3208")
                            .alt("Calcar delibero cursim summisse.")
                            .height(394d)
                            .id("3f75dc05-8958-4714-ad43-38e37026fc56")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("a748a847-fe8e-4bd4-8dde-6aa2eec12696")
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
                            .id("78955c44-c6c3-4df6-b6fd-f055cb545eb4")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("2bfd059d-6cd3-4048-a312-9f51c5dc4153")
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
                            .id("6b4c8f54-9b04-48b2-b24e-53ca8dfbd8ab")
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
                            .id("00e718ed-a4a7-46d2-8611-69eb7dab7893")
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
                    .updatedAt(OffsetDateTime.parse("2025-05-25T02:47:33.113Z"))
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
                    .id("d10365e2-f19a-42b6-af06-f2a2a30c80a8")
                    .isActive(false)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(94d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/u0YdHqlRu/2007/3208")
                            .alt("Calcar delibero cursim summisse.")
                            .height(394d)
                            .id("3f75dc05-8958-4714-ad43-38e37026fc56")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("a748a847-fe8e-4bd4-8dde-6aa2eec12696")
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
                            .id("78955c44-c6c3-4df6-b6fd-f055cb545eb4")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("2bfd059d-6cd3-4048-a312-9f51c5dc4153")
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
                            .id("6b4c8f54-9b04-48b2-b24e-53ca8dfbd8ab")
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
                            .id("00e718ed-a4a7-46d2-8611-69eb7dab7893")
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
                    .updatedAt(OffsetDateTime.parse("2025-05-25T02:47:33.113Z"))
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