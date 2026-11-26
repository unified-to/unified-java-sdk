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
                    .id("2fd4c572-c8b5-4675-ae60-71f266b30dc0")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(92d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/u0YdHqlRu/3208/3394")
                            .alt("Calcar delibero cursim summisse.")
                            .height(961d)
                            .id("c9d05937-d03d-4b30-b493-b64a9c977e39")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("f36b73aa-f1dc-44d6-9bbd-c27690a73736")
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
                            .id("d3d24422-bcb6-4d78-bc55-67ff885f8240")
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
                            .id("a7bc2065-edbc-4196-8a3c-62cfd4831764")
                            .position(1d)
                            .build(),
                        CommerceItemOption.builder()
                            .name("Size")
                            .values(List.of(
                                "S"))
                            .id("3dfc95ed-51dc-4f1a-91e4-61a9a4312b53")
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
                    .updatedAt(OffsetDateTime.parse("2026-04-09T23:06:27.672Z"))
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
                    .id("11afec8e-80f4-41d6-bfe7-df4150870201")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(92d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/u0YdHqlRu/3208/3394")
                            .alt("Calcar delibero cursim summisse.")
                            .height(961d)
                            .id("5e1b578d-25cc-4e1d-9efb-ea09c92def6f")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("63538046-f0a4-4e3c-b740-35bcf9f55e42")
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
                            .id("3b4f28b4-95a4-44f7-9c47-986a90c42def")
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
                            .id("6984df65-3661-4006-a566-abfffda5481b")
                            .position(1d)
                            .build(),
                        CommerceItemOption.builder()
                            .name("Size")
                            .values(List.of(
                                "S"))
                            .id("dcb95bd3-40b8-48fc-98b4-c35c47d86f1c")
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
                    .updatedAt(OffsetDateTime.parse("2026-04-09T23:06:27.704Z"))
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
                    .id("11afec8e-80f4-41d6-bfe7-df4150870201")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(92d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/u0YdHqlRu/3208/3394")
                            .alt("Calcar delibero cursim summisse.")
                            .height(961d)
                            .id("5e1b578d-25cc-4e1d-9efb-ea09c92def6f")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("63538046-f0a4-4e3c-b740-35bcf9f55e42")
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
                            .id("3b4f28b4-95a4-44f7-9c47-986a90c42def")
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
                            .id("6984df65-3661-4006-a566-abfffda5481b")
                            .position(1d)
                            .build(),
                        CommerceItemOption.builder()
                            .name("Size")
                            .values(List.of(
                                "S"))
                            .id("dcb95bd3-40b8-48fc-98b4-c35c47d86f1c")
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
                    .updatedAt(OffsetDateTime.parse("2026-04-09T23:06:27.704Z"))
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