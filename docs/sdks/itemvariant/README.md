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
                    .description("Stylish Salad designed to make you stand out with little looks")
                    .height(54d)
                    .id("eee93938-a57e-4a73-9977-ee03bd0aba24")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(92d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/2126/721?lock=8820088623807162")
                            .alt("Hic desipio thorax.")
                            .height(961d)
                            .id("21c26713-eb11-4834-be0d-d7d100d8b4d4")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("86b0f9d2-a91f-4873-8ed9-923d759690fe")
                                    .slug("ubi")
                                    .value(CommerceMetadataValue.of("textus"))
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
                            .id("a217ea55-6dea-4ab2-bab1-05767eca6565")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("absens"))
                            .build()))
                    .name("Chair")
                    .options(List.of(
                        CommerceItemOption.builder()
                            .name("Color")
                            .values(List.of(
                                "olive"))
                            .id("f953bf0b-d919-47a7-a2dd-13ada8b7444e")
                            .position(1d)
                            .build(),
                        CommerceItemOption.builder()
                            .name("Size")
                            .values(List.of(
                                "S"))
                            .id("d0bd2b2d-3d4a-41a0-9dfa-96339f2f1fd1")
                            .position(2d)
                            .build()))
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(382.23)
                            .currency("USD")
                            .build()))
                    .publicDescription("Stylish Cheese designed to make you stand out with grave looks")
                    .publicName("Chair")
                    .requiresShipping(false)
                    .sizeUnit(SizeUnit.CM)
                    .sku("978-1-368-44270-1")
                    .tags(List.of(
                        "deserunt"))
                    .totalStock(436d)
                    .updatedAt(OffsetDateTime.parse("2026-04-02T03:18:23.747Z"))
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
                    .description("Stylish Salad designed to make you stand out with little looks")
                    .height(54d)
                    .id("6dfd10a2-2046-49a1-969c-918aad7d5325")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(92d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/2126/721?lock=8820088623807162")
                            .alt("Hic desipio thorax.")
                            .height(961d)
                            .id("7f0e8466-1569-43d4-90d6-ed570f747267")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("239dbc9e-135e-432a-af36-f22080b5155b")
                                    .slug("ubi")
                                    .value(CommerceMetadataValue.of("textus"))
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
                            .id("b9bb395a-19be-4f5b-aeda-d8e60c9acfca")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("absens"))
                            .build()))
                    .name("Chair")
                    .options(List.of(
                        CommerceItemOption.builder()
                            .name("Color")
                            .values(List.of(
                                "olive"))
                            .id("a7fbe068-0171-4a75-add3-74fcd4e661fd")
                            .position(1d)
                            .build(),
                        CommerceItemOption.builder()
                            .name("Size")
                            .values(List.of(
                                "S"))
                            .id("c5ed066a-4b04-4a2a-9771-203fb6ddda90")
                            .position(2d)
                            .build()))
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(382.23)
                            .currency("USD")
                            .build()))
                    .publicDescription("Stylish Cheese designed to make you stand out with grave looks")
                    .publicName("Chair")
                    .requiresShipping(false)
                    .sizeUnit(SizeUnit.CM)
                    .sku("978-1-368-44270-1")
                    .tags(List.of(
                        "deserunt"))
                    .totalStock(436d)
                    .updatedAt(OffsetDateTime.parse("2026-04-02T03:18:23.776Z"))
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
                    .description("Stylish Salad designed to make you stand out with little looks")
                    .height(54d)
                    .id("6dfd10a2-2046-49a1-969c-918aad7d5325")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(92d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/2126/721?lock=8820088623807162")
                            .alt("Hic desipio thorax.")
                            .height(961d)
                            .id("7f0e8466-1569-43d4-90d6-ed570f747267")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("239dbc9e-135e-432a-af36-f22080b5155b")
                                    .slug("ubi")
                                    .value(CommerceMetadataValue.of("textus"))
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
                            .id("b9bb395a-19be-4f5b-aeda-d8e60c9acfca")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("absens"))
                            .build()))
                    .name("Chair")
                    .options(List.of(
                        CommerceItemOption.builder()
                            .name("Color")
                            .values(List.of(
                                "olive"))
                            .id("a7fbe068-0171-4a75-add3-74fcd4e661fd")
                            .position(1d)
                            .build(),
                        CommerceItemOption.builder()
                            .name("Size")
                            .values(List.of(
                                "S"))
                            .id("c5ed066a-4b04-4a2a-9771-203fb6ddda90")
                            .position(2d)
                            .build()))
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(382.23)
                            .currency("USD")
                            .build()))
                    .publicDescription("Stylish Cheese designed to make you stand out with grave looks")
                    .publicName("Chair")
                    .requiresShipping(false)
                    .sizeUnit(SizeUnit.CM)
                    .sku("978-1-368-44270-1")
                    .tags(List.of(
                        "deserunt"))
                    .totalStock(436d)
                    .updatedAt(OffsetDateTime.parse("2026-04-02T03:18:23.776Z"))
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