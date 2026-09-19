# Commerce

## Overview

### Available Operations

* [createCommerceCollection](#createcommercecollection) - Create a collection
* [createCommerceInventory](#createcommerceinventory) - Create an inventory
* [createCommerceItem](#createcommerceitem) - Create an item
* [createCommerceItemvariant](#createcommerceitemvariant) - Create an itemvariant
* [createCommerceLocation](#createcommercelocation) - Create a location
* [createCommerceReservation](#createcommercereservation) - Create a reservation
* [createCommerceReview](#createcommercereview) - Create a review
* [createCommerceSaleschannel](#createcommercesaleschannel) - Create a saleschannel
* [getCommerceCollection](#getcommercecollection) - Retrieve a collection
* [getCommerceInventory](#getcommerceinventory) - Retrieve an inventory
* [getCommerceItem](#getcommerceitem) - Retrieve an item
* [getCommerceItemvariant](#getcommerceitemvariant) - Retrieve an itemvariant
* [getCommerceLocation](#getcommercelocation) - Retrieve a location
* [getCommerceReservation](#getcommercereservation) - Retrieve a reservation
* [getCommerceReview](#getcommercereview) - Retrieve a review
* [getCommerceSaleschannel](#getcommercesaleschannel) - Retrieve a saleschannel
* [listCommerceAvailabilities](#listcommerceavailabilities) - List all availabilities
* [listCommerceCollections](#listcommercecollections) - List all collections
* [listCommerceInventories](#listcommerceinventories) - List all inventories
* [listCommerceItems](#listcommerceitems) - List all items
* [listCommerceItemvariants](#listcommerceitemvariants) - List all itemvariants
* [listCommerceLocations](#listcommercelocations) - List all locations
* [listCommerceReservations](#listcommercereservations) - List all reservations
* [listCommerceReviews](#listcommercereviews) - List all reviews
* [listCommerceSaleschannels](#listcommercesaleschannels) - List all saleschannels
* [patchCommerceCollection](#patchcommercecollection) - Update a collection
* [patchCommerceInventory](#patchcommerceinventory) - Update an inventory
* [patchCommerceItem](#patchcommerceitem) - Update an item
* [patchCommerceItemvariant](#patchcommerceitemvariant) - Update an itemvariant
* [patchCommerceLocation](#patchcommercelocation) - Update a location
* [patchCommerceReservation](#patchcommercereservation) - Update a reservation
* [patchCommerceReview](#patchcommercereview) - Update a review
* [patchCommerceSaleschannel](#patchcommercesaleschannel) - Update a saleschannel
* [removeCommerceCollection](#removecommercecollection) - Remove a collection
* [removeCommerceInventory](#removecommerceinventory) - Remove an inventory
* [removeCommerceItem](#removecommerceitem) - Remove an item
* [removeCommerceItemvariant](#removecommerceitemvariant) - Remove an itemvariant
* [removeCommerceLocation](#removecommercelocation) - Remove a location
* [removeCommerceReservation](#removecommercereservation) - Remove a reservation
* [removeCommerceReview](#removecommercereview) - Remove a review
* [removeCommerceSaleschannel](#removecommercesaleschannel) - Remove a saleschannel
* [updateCommerceCollection](#updatecommercecollection) - Update a collection
* [updateCommerceInventory](#updatecommerceinventory) - Update an inventory
* [updateCommerceItem](#updatecommerceitem) - Update an item
* [updateCommerceItemvariant](#updatecommerceitemvariant) - Update an itemvariant
* [updateCommerceLocation](#updatecommercelocation) - Update a location
* [updateCommerceReservation](#updatecommercereservation) - Update a reservation
* [updateCommerceReview](#updatecommercereview) - Update a review
* [updateCommerceSaleschannel](#updatecommercesaleschannel) - Update a saleschannel

## createCommerceCollection

Create a collection

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
                    .id("d159ba1e-6ed3-49a7-92c1-c098751bb034")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .itemMetadata(List.of())
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/1319/1257?lock=7280448425732025")
                            .alt("Defungo adopto thorax.")
                            .height(759d)
                            .id("0ba022f3-c74b-4e31-a853-c8b07cf23425")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("f37c9152-3516-4de3-8a33-00dc1fecb47a")
                                    .slug("censura")
                                    .value(CommerceMetadataValue.of("toties"))
                                    .build()))
                            .position(80d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(40d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .id("19fab9d6-2a62-4216-81db-f671b44ba77c")
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
                    .updatedAt(OffsetDateTime.parse("2025-02-26T17:05:57.907Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceCollectionResponse res = sdk.commerce().createCommerceCollection()
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

## createCommerceInventory

Create an inventory

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceInventory" method="post" path="/commerce/{connection_id}/inventory" example="commerce_inventory" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceInventoryRequest;
import to.unified.unified_java_sdk.models.operations.CreateCommerceInventoryResponse;
import to.unified.unified_java_sdk.models.shared.CommerceInventory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceInventoryRequest req = CreateCommerceInventoryRequest.builder()
                .commerceInventory(CommerceInventory.builder()
                    .available(337d)
                    .updatedAt(OffsetDateTime.parse("2025-10-25T14:46:38.387Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceInventoryResponse res = sdk.commerce().createCommerceInventory()
                .request(req)
                .call();

        if (res.commerceInventory().isPresent()) {
            System.out.println(res.commerceInventory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateCommerceInventoryRequest](../../models/operations/CreateCommerceInventoryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateCommerceInventoryResponse](../../models/operations/CreateCommerceInventoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCommerceItem

Create an item

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
                    .description("Vulnero ustulo abeo.")
                    .duration(87d)
                    .globalCode("calamitas")
                    .id("146c2cdf-e243-4b36-9888-5e43a0199754")
                    .isActive(false)
                    .isFeatured(true)
                    .isTaxable(true)
                    .isVisible(true)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/73y0uzyK/972/3753")
                            .alt("Caterva eveniet acies candidus.")
                            .height(663d)
                            .id("5f68555a-068a-4bb4-921a-080dfa538919")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("383f6a48-2bc8-4b92-82bd-3f7a33f60a7b")
                                    .slug("doloremque")
                                    .value(CommerceMetadataValue.of("allatus"))
                                    .build()))
                            .position(67d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(88d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/Ao4iatfO/771/3906")
                            .alt("Comedo.")
                            .height(189d)
                            .id("91eaf7b4-cbff-4846-81f1-0500b32f04e3")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("e8f1c65e-775e-440a-91c2-53408e55c884")
                                    .slug("bis")
                                    .value(CommerceMetadataValue.of("somniculosus"))
                                    .build()))
                            .position(3d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(66d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .extraData(CommerceMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CommerceMetadataFormat.TEXT)
                            .id("5a37576e-16f3-4156-9289-e4a22a56567c")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("terebro"))
                            .build()))
                    .name("Handcrafted Rubber Tuna")
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(1438d)
                            .compareAtPrice(474d)
                            .currency("OMR")
                            .build()))
                    .publicDescription("Custodia ventus solio compono.")
                    .publicName("Handcrafted Rubber Tuna")
                    .requiresShipping(true)
                    .slug("cohors-turba-optio")
                    .tags(List.of(
                        "blanditiis",
                        "tandem"))
                    .totalStock(579d)
                    .type("beatae")
                    .updatedAt(OffsetDateTime.parse("2022-04-07T03:47:13.663Z"))
                    .vendorName("Mayer - Flatley")
                    .weight(22d)
                    .weightUnit(WeightUnit.KG)
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceItemResponse res = sdk.commerce().createCommerceItem()
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

        CreateCommerceItemvariantResponse res = sdk.commerce().createCommerceItemvariant()
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

## createCommerceLocation

Create a location

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceLocation" method="post" path="/commerce/{connection_id}/location" example="commerce_location" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceLocationRequest;
import to.unified.unified_java_sdk.models.operations.CreateCommerceLocationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceLocationRequest req = CreateCommerceLocationRequest.builder()
                .commerceLocation(CommerceLocation.builder()
                    .address(PropertyCommerceLocationAddress.builder()
                        .address1("29896 The Limes")
                        .city("New Kenny")
                        .countryCode("US")
                        .postalCode("14490-0609")
                        .region("Virginia")
                        .regionCode("MS")
                        .build())
                    .categories(List.of())
                    .createdAt(OffsetDateTime.parse("2022-12-29T04:15:21.195Z"))
                    .currency("XCD")
                    .description("Adsidue audentia.")
                    .id("0ec210bc-bdbf-487b-ae26-eacad7cdd06e")
                    .imageUrl("https://picsum.photos/seed/hjFt1/1036/2220")
                    .isActive(false)
                    .languageLocale("vulgaris")
                    .latitude(0d)
                    .locationType(LocationType.RESTAURANT)
                    .longitude(0d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/QVh7ViTV/3964/1567")
                            .alt("Addo.")
                            .height(283d)
                            .id("cf839187-c900-4f80-b47f-9abbf93a0c29")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("cd338120-e9e0-47f8-9be7-e303e1e54829")
                                    .slug("abutor")
                                    .value(CommerceMetadataValue.of("damno"))
                                    .build()))
                            .position(40d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(1d)
                            .build()))
                    .name("Olson - Mraz")
                    .priceLevel("")
                    .rating(0d)
                    .reviewCount(0d)
                    .telephones(List.of(
                        CommerceTelephone.builder()
                            .telephone("(872) 522-3201")
                            .type(CommerceTelephoneType.OTHER)
                            .build(),
                        CommerceTelephone.builder()
                            .telephone("(236) 274-2445")
                            .type(CommerceTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2024-04-09T17:46:33.562Z"))
                    .webUrl("https://chilly-edge.info")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceLocationResponse res = sdk.commerce().createCommerceLocation()
                .request(req)
                .call();

        if (res.commerceLocation().isPresent()) {
            System.out.println(res.commerceLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateCommerceLocationRequest](../../models/operations/CreateCommerceLocationRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateCommerceLocationResponse](../../models/operations/CreateCommerceLocationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCommerceReservation

Create a reservation

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceReservation" method="post" path="/commerce/{connection_id}/reservation" example="commerce_reservation" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceReservationRequest;
import to.unified.unified_java_sdk.models.operations.CreateCommerceReservationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceReservationRequest req = CreateCommerceReservationRequest.builder()
                .commerceReservation(CommerceReservation.builder()
                    .createdAt(OffsetDateTime.parse("2021-12-14T19:50:31.151Z"))
                    .endAt(OffsetDateTime.parse("2022-01-01T22:00:17.868Z"))
                    .guestEmail("Sunny.Strosin77@yahoo.com")
                    .guestName("Annette Franecki")
                    .guestPhone("(990) 317-6213")
                    .id("284cec46-72ea-49fa-bf8f-2be7a9f263b2")
                    .itemName("Practical Ceramic Shoes")
                    .notes("Adsum textilis ipsum despecto.")
                    .size(10d)
                    .staffName("Vickie Fahey")
                    .startAt(OffsetDateTime.parse("2021-12-18T00:40:25.125Z"))
                    .status(CommerceReservationStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2022-12-27T22:22:00.446Z"))
                    .url("https://cluttered-pine.info/")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceReservationResponse res = sdk.commerce().createCommerceReservation()
                .request(req)
                .call();

        if (res.commerceReservation().isPresent()) {
            System.out.println(res.commerceReservation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [CreateCommerceReservationRequest](../../models/operations/CreateCommerceReservationRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[CreateCommerceReservationResponse](../../models/operations/CreateCommerceReservationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCommerceReview

Create a review

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceReview" method="post" path="/commerce/{connection_id}/review" example="commerce_review" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceReviewRequest;
import to.unified.unified_java_sdk.models.operations.CreateCommerceReviewResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceReviewRequest req = CreateCommerceReviewRequest.builder()
                .commerceReview(CommerceReview.builder()
                    .authorAvatarUrl("https://picsum.photos/seed/ix4Br3LA/2245/1245")
                    .authorEmail("Cleve_Yundt@hotmail.com")
                    .authorLocation("ipsum")
                    .authorName("Marsha Krajcik")
                    .comments(List.of())
                    .content("Taedium thymum adipiscor amicitia cui.")
                    .createdAt(OffsetDateTime.parse("2019-12-12T18:10:22.988Z"))
                    .helpfulVotes(26d)
                    .id("973cdcaf-02c0-4f91-8c92-e0b409bd72f2")
                    .isFeatured(true)
                    .isPublic(true)
                    .isVerified(false)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/882/1004?lock=7448492654002422")
                            .alt("Adulescens.")
                            .height(519d)
                            .id("f5ce80da-e66b-4fe5-8675-eafed4c5674e")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("4c3108b4-a23a-447f-a099-d91b3f5417a7")
                                    .slug("aggero")
                                    .value(CommerceMetadataValue.of("tero"))
                                    .build()))
                            .position(72d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(75d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/3QDZ8/1208/2171")
                            .alt("Pauci timidus sol comburo thema.")
                            .height(297d)
                            .id("7c1e08ed-29e6-4ff7-9132-b286f3d0b0cc")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("908bb2c7-c0b4-405a-b083-a2a2b485ca04")
                                    .slug("vito")
                                    .value(CommerceMetadataValue.of("cuppedia"))
                                    .build()))
                            .position(61d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(96d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/ytybC/2616/710")
                            .alt("Cuppedia vestrum patruus.")
                            .height(6d)
                            .id("827469bd-7b4f-4025-975b-f08c03f78715")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("63fb37cb-8ecf-4cd8-8008-157a15869447")
                                    .slug("arbitro")
                                    .value(CommerceMetadataValue.of("villa"))
                                    .build()))
                            .position(60d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(74d)
                            .build()))
                    .metadata(List.of())
                    .rating(3d)
                    .status(CommerceReviewStatus.APPROVED)
                    .title("Coepi adamo amicitia auxilium toties.")
                    .unhelpfulVotes(49d)
                    .updatedAt(OffsetDateTime.parse("2025-07-25T19:00:30.405Z"))
                    .url("https://excitable-underneath.com")
                    .verifiedPurchase(false)
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceReviewResponse res = sdk.commerce().createCommerceReview()
                .request(req)
                .call();

        if (res.commerceReview().isPresent()) {
            System.out.println(res.commerceReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateCommerceReviewRequest](../../models/operations/CreateCommerceReviewRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateCommerceReviewResponse](../../models/operations/CreateCommerceReviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCommerceSaleschannel

Create a saleschannel

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceSaleschannel" method="post" path="/commerce/{connection_id}/saleschannel" example="commerce_saleschannel" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceSaleschannelRequest;
import to.unified.unified_java_sdk.models.operations.CreateCommerceSaleschannelResponse;
import to.unified.unified_java_sdk.models.shared.CommerceSaleschannel;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceSaleschannelRequest req = CreateCommerceSaleschannelRequest.builder()
                .commerceSaleschannel(CommerceSaleschannel.builder()
                    .collections(List.of())
                    .createdAt(OffsetDateTime.parse("2021-12-12T06:19:55.421Z"))
                    .description("Utroque denuncio solutio.")
                    .id("d7f2464e-c981-4d09-a94b-5e1db07a8822")
                    .isActive(false)
                    .slug("amiculum-congregatio-suspendo")
                    .updatedAt(OffsetDateTime.parse("2025-01-07T09:03:36.465Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceSaleschannelResponse res = sdk.commerce().createCommerceSaleschannel()
                .request(req)
                .call();

        if (res.commerceSaleschannel().isPresent()) {
            System.out.println(res.commerceSaleschannel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [CreateCommerceSaleschannelRequest](../../models/operations/CreateCommerceSaleschannelRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[CreateCommerceSaleschannelResponse](../../models/operations/CreateCommerceSaleschannelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceCollection

Retrieve a collection

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

        GetCommerceCollectionResponse res = sdk.commerce().getCommerceCollection()
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

## getCommerceInventory

Retrieve an inventory

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceInventory" method="get" path="/commerce/{connection_id}/inventory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceInventoryRequest;
import to.unified.unified_java_sdk.models.operations.GetCommerceInventoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceInventoryRequest req = GetCommerceInventoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceInventoryResponse res = sdk.commerce().getCommerceInventory()
                .request(req)
                .call();

        if (res.commerceInventory().isPresent()) {
            System.out.println(res.commerceInventory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetCommerceInventoryRequest](../../models/operations/GetCommerceInventoryRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetCommerceInventoryResponse](../../models/operations/GetCommerceInventoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceItem

Retrieve an item

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

        GetCommerceItemResponse res = sdk.commerce().getCommerceItem()
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

        GetCommerceItemvariantResponse res = sdk.commerce().getCommerceItemvariant()
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

## getCommerceLocation

Retrieve a location

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceLocation" method="get" path="/commerce/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceLocationRequest;
import to.unified.unified_java_sdk.models.operations.GetCommerceLocationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceLocationRequest req = GetCommerceLocationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceLocationResponse res = sdk.commerce().getCommerceLocation()
                .request(req)
                .call();

        if (res.commerceLocation().isPresent()) {
            System.out.println(res.commerceLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetCommerceLocationRequest](../../models/operations/GetCommerceLocationRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetCommerceLocationResponse](../../models/operations/GetCommerceLocationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceReservation

Retrieve a reservation

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceReservation" method="get" path="/commerce/{connection_id}/reservation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceReservationRequest;
import to.unified.unified_java_sdk.models.operations.GetCommerceReservationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceReservationRequest req = GetCommerceReservationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceReservationResponse res = sdk.commerce().getCommerceReservation()
                .request(req)
                .call();

        if (res.commerceReservation().isPresent()) {
            System.out.println(res.commerceReservation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetCommerceReservationRequest](../../models/operations/GetCommerceReservationRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetCommerceReservationResponse](../../models/operations/GetCommerceReservationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceReview

Retrieve a review

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceReview" method="get" path="/commerce/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceReviewRequest;
import to.unified.unified_java_sdk.models.operations.GetCommerceReviewResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceReviewRequest req = GetCommerceReviewRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceReviewResponse res = sdk.commerce().getCommerceReview()
                .request(req)
                .call();

        if (res.commerceReview().isPresent()) {
            System.out.println(res.commerceReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetCommerceReviewRequest](../../models/operations/GetCommerceReviewRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetCommerceReviewResponse](../../models/operations/GetCommerceReviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceSaleschannel

Retrieve a saleschannel

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceSaleschannel" method="get" path="/commerce/{connection_id}/saleschannel/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceSaleschannelRequest;
import to.unified.unified_java_sdk.models.operations.GetCommerceSaleschannelResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceSaleschannelRequest req = GetCommerceSaleschannelRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceSaleschannelResponse res = sdk.commerce().getCommerceSaleschannel()
                .request(req)
                .call();

        if (res.commerceSaleschannel().isPresent()) {
            System.out.println(res.commerceSaleschannel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetCommerceSaleschannelRequest](../../models/operations/GetCommerceSaleschannelRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetCommerceSaleschannelResponse](../../models/operations/GetCommerceSaleschannelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceAvailabilities

List all availabilities

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceAvailabilities" method="get" path="/commerce/{connection_id}/availability" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceAvailabilitiesRequest;
import to.unified.unified_java_sdk.models.operations.ListCommerceAvailabilitiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceAvailabilitiesRequest req = ListCommerceAvailabilitiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListCommerceAvailabilitiesResponse res = sdk.commerce().listCommerceAvailabilities()
                .request(req)
                .call();

        if (res.commerceAvailabilities().isPresent()) {
            System.out.println(res.commerceAvailabilities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListCommerceAvailabilitiesRequest](../../models/operations/ListCommerceAvailabilitiesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListCommerceAvailabilitiesResponse](../../models/operations/ListCommerceAvailabilitiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceCollections

List all collections

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

        ListCommerceCollectionsResponse res = sdk.commerce().listCommerceCollections()
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

## listCommerceInventories

List all inventories

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceInventories" method="get" path="/commerce/{connection_id}/inventory" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceInventoriesRequest;
import to.unified.unified_java_sdk.models.operations.ListCommerceInventoriesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceInventoriesRequest req = ListCommerceInventoriesRequest.builder()
                .connectionId("<id>")
                .build();

        ListCommerceInventoriesResponse res = sdk.commerce().listCommerceInventories()
                .request(req)
                .call();

        if (res.commerceInventories().isPresent()) {
            System.out.println(res.commerceInventories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListCommerceInventoriesRequest](../../models/operations/ListCommerceInventoriesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListCommerceInventoriesResponse](../../models/operations/ListCommerceInventoriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceItems

List all items

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

        ListCommerceItemsResponse res = sdk.commerce().listCommerceItems()
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

        ListCommerceItemvariantsResponse res = sdk.commerce().listCommerceItemvariants()
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

## listCommerceLocations

List all locations

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceLocations" method="get" path="/commerce/{connection_id}/location" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceLocationsRequest;
import to.unified.unified_java_sdk.models.operations.ListCommerceLocationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceLocationsRequest req = ListCommerceLocationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCommerceLocationsResponse res = sdk.commerce().listCommerceLocations()
                .request(req)
                .call();

        if (res.commerceLocations().isPresent()) {
            System.out.println(res.commerceLocations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListCommerceLocationsRequest](../../models/operations/ListCommerceLocationsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListCommerceLocationsResponse](../../models/operations/ListCommerceLocationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceReservations

List all reservations

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceReservations" method="get" path="/commerce/{connection_id}/reservation" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceReservationsRequest;
import to.unified.unified_java_sdk.models.operations.ListCommerceReservationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceReservationsRequest req = ListCommerceReservationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCommerceReservationsResponse res = sdk.commerce().listCommerceReservations()
                .request(req)
                .call();

        if (res.commerceReservations().isPresent()) {
            System.out.println(res.commerceReservations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListCommerceReservationsRequest](../../models/operations/ListCommerceReservationsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListCommerceReservationsResponse](../../models/operations/ListCommerceReservationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceReviews

List all reviews

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceReviews" method="get" path="/commerce/{connection_id}/review" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceReviewsRequest;
import to.unified.unified_java_sdk.models.operations.ListCommerceReviewsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceReviewsRequest req = ListCommerceReviewsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCommerceReviewsResponse res = sdk.commerce().listCommerceReviews()
                .request(req)
                .call();

        if (res.commerceReviews().isPresent()) {
            System.out.println(res.commerceReviews().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListCommerceReviewsRequest](../../models/operations/ListCommerceReviewsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListCommerceReviewsResponse](../../models/operations/ListCommerceReviewsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceSaleschannels

List all saleschannels

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceSaleschannels" method="get" path="/commerce/{connection_id}/saleschannel" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceSaleschannelsRequest;
import to.unified.unified_java_sdk.models.operations.ListCommerceSaleschannelsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceSaleschannelsRequest req = ListCommerceSaleschannelsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCommerceSaleschannelsResponse res = sdk.commerce().listCommerceSaleschannels()
                .request(req)
                .call();

        if (res.commerceSaleschannels().isPresent()) {
            System.out.println(res.commerceSaleschannels().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListCommerceSaleschannelsRequest](../../models/operations/ListCommerceSaleschannelsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListCommerceSaleschannelsResponse](../../models/operations/ListCommerceSaleschannelsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceCollection

Update a collection

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
                    .id("6052cdbc-4d54-4cf7-8a84-0aabb844bc9d")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .itemMetadata(List.of())
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/1319/1257?lock=7280448425732025")
                            .alt("Defungo adopto thorax.")
                            .height(759d)
                            .id("f0594a9b-5086-4341-a268-3255fd2a54ba")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("7a883a0f-22cc-4b29-ae06-97de38cb2741")
                                    .slug("censura")
                                    .value(CommerceMetadataValue.of("toties"))
                                    .build()))
                            .position(80d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(40d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .id("b4f0054c-fe8f-4bf6-95b3-3d8bcd110266")
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
                    .updatedAt(OffsetDateTime.parse("2025-02-26T17:05:57.927Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceCollectionResponse res = sdk.commerce().patchCommerceCollection()
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

## patchCommerceInventory

Update an inventory

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceInventory" method="patch" path="/commerce/{connection_id}/inventory/{id}" example="commerce_inventory" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceInventoryRequest;
import to.unified.unified_java_sdk.models.operations.PatchCommerceInventoryResponse;
import to.unified.unified_java_sdk.models.shared.CommerceInventory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceInventoryRequest req = PatchCommerceInventoryRequest.builder()
                .commerceInventory(CommerceInventory.builder()
                    .available(337d)
                    .updatedAt(OffsetDateTime.parse("2025-10-25T14:46:38.393Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceInventoryResponse res = sdk.commerce().patchCommerceInventory()
                .request(req)
                .call();

        if (res.commerceInventory().isPresent()) {
            System.out.println(res.commerceInventory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchCommerceInventoryRequest](../../models/operations/PatchCommerceInventoryRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchCommerceInventoryResponse](../../models/operations/PatchCommerceInventoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceItem

Update an item

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
                    .description("Vulnero ustulo abeo.")
                    .duration(87d)
                    .globalCode("calamitas")
                    .id("399fd14a-5f21-40b5-9abb-101a51aee587")
                    .isActive(false)
                    .isFeatured(true)
                    .isTaxable(true)
                    .isVisible(true)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/73y0uzyK/972/3753")
                            .alt("Caterva eveniet acies candidus.")
                            .height(663d)
                            .id("3aa78ee5-b4c3-4059-b6de-e95503742508")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("445cacc5-3af3-40fe-80a0-6d7cdd7a440e")
                                    .slug("doloremque")
                                    .value(CommerceMetadataValue.of("allatus"))
                                    .build()))
                            .position(67d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(88d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/Ao4iatfO/771/3906")
                            .alt("Comedo.")
                            .height(189d)
                            .id("2d24a5d6-7113-4276-8dc8-6501ab87a1dd")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("a4e9d3ef-8da9-435f-99b6-2143d9051550")
                                    .slug("bis")
                                    .value(CommerceMetadataValue.of("somniculosus"))
                                    .build()))
                            .position(3d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(66d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .extraData(CommerceMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CommerceMetadataFormat.TEXT)
                            .id("35346548-81cf-47ee-9b47-1c26b8704eae")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("terebro"))
                            .build()))
                    .name("Handcrafted Rubber Tuna")
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(1438d)
                            .compareAtPrice(474d)
                            .currency("OMR")
                            .build()))
                    .publicDescription("Custodia ventus solio compono.")
                    .publicName("Handcrafted Rubber Tuna")
                    .requiresShipping(true)
                    .slug("cohors-turba-optio")
                    .tags(List.of(
                        "blanditiis",
                        "tandem"))
                    .totalStock(579d)
                    .type("beatae")
                    .updatedAt(OffsetDateTime.parse("2022-04-07T03:47:13.679Z"))
                    .vendorName("Mayer - Flatley")
                    .weight(22d)
                    .weightUnit(WeightUnit.KG)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceItemResponse res = sdk.commerce().patchCommerceItem()
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

        PatchCommerceItemvariantResponse res = sdk.commerce().patchCommerceItemvariant()
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

## patchCommerceLocation

Update a location

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceLocation" method="patch" path="/commerce/{connection_id}/location/{id}" example="commerce_location" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceLocationRequest;
import to.unified.unified_java_sdk.models.operations.PatchCommerceLocationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceLocationRequest req = PatchCommerceLocationRequest.builder()
                .commerceLocation(CommerceLocation.builder()
                    .address(PropertyCommerceLocationAddress.builder()
                        .address1("29896 The Limes")
                        .city("New Kenny")
                        .countryCode("US")
                        .postalCode("14490-0609")
                        .region("Virginia")
                        .regionCode("MS")
                        .build())
                    .categories(List.of())
                    .createdAt(OffsetDateTime.parse("2022-12-29T04:15:21.195Z"))
                    .currency("XCD")
                    .description("Adsidue audentia.")
                    .id("07100492-63c7-45d9-98fa-9ae5ce440515")
                    .imageUrl("https://picsum.photos/seed/hjFt1/1036/2220")
                    .isActive(false)
                    .languageLocale("vulgaris")
                    .latitude(0d)
                    .locationType(LocationType.RESTAURANT)
                    .longitude(0d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/QVh7ViTV/3964/1567")
                            .alt("Addo.")
                            .height(283d)
                            .id("df7e08f5-a107-4f95-bcf8-beea16891b87")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("3a32d88a-5f7b-40db-b04f-07beddd998be")
                                    .slug("abutor")
                                    .value(CommerceMetadataValue.of("damno"))
                                    .build()))
                            .position(40d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(1d)
                            .build()))
                    .name("Olson - Mraz")
                    .priceLevel("")
                    .rating(0d)
                    .reviewCount(0d)
                    .telephones(List.of(
                        CommerceTelephone.builder()
                            .telephone("(872) 522-3201")
                            .type(CommerceTelephoneType.OTHER)
                            .build(),
                        CommerceTelephone.builder()
                            .telephone("(236) 274-2445")
                            .type(CommerceTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2024-04-09T17:46:33.576Z"))
                    .webUrl("https://chilly-edge.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceLocationResponse res = sdk.commerce().patchCommerceLocation()
                .request(req)
                .call();

        if (res.commerceLocation().isPresent()) {
            System.out.println(res.commerceLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchCommerceLocationRequest](../../models/operations/PatchCommerceLocationRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchCommerceLocationResponse](../../models/operations/PatchCommerceLocationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceReservation

Update a reservation

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceReservation" method="patch" path="/commerce/{connection_id}/reservation/{id}" example="commerce_reservation" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceReservationRequest;
import to.unified.unified_java_sdk.models.operations.PatchCommerceReservationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceReservationRequest req = PatchCommerceReservationRequest.builder()
                .commerceReservation(CommerceReservation.builder()
                    .createdAt(OffsetDateTime.parse("2021-12-14T19:50:31.151Z"))
                    .endAt(OffsetDateTime.parse("2022-01-01T22:00:17.868Z"))
                    .guestEmail("Sunny.Strosin77@yahoo.com")
                    .guestName("Annette Franecki")
                    .guestPhone("(990) 317-6213")
                    .id("8fa2b4d4-5825-4e0c-bb7c-d32baa9b9ab4")
                    .itemName("Practical Ceramic Shoes")
                    .notes("Adsum textilis ipsum despecto.")
                    .size(10d)
                    .staffName("Vickie Fahey")
                    .startAt(OffsetDateTime.parse("2021-12-18T00:40:25.125Z"))
                    .status(CommerceReservationStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2022-12-27T22:22:00.449Z"))
                    .url("https://cluttered-pine.info/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceReservationResponse res = sdk.commerce().patchCommerceReservation()
                .request(req)
                .call();

        if (res.commerceReservation().isPresent()) {
            System.out.println(res.commerceReservation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [PatchCommerceReservationRequest](../../models/operations/PatchCommerceReservationRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[PatchCommerceReservationResponse](../../models/operations/PatchCommerceReservationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceReview

Update a review

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceReview" method="patch" path="/commerce/{connection_id}/review/{id}" example="commerce_review" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceReviewRequest;
import to.unified.unified_java_sdk.models.operations.PatchCommerceReviewResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceReviewRequest req = PatchCommerceReviewRequest.builder()
                .commerceReview(CommerceReview.builder()
                    .authorAvatarUrl("https://picsum.photos/seed/ix4Br3LA/2245/1245")
                    .authorEmail("Cleve_Yundt@hotmail.com")
                    .authorLocation("ipsum")
                    .authorName("Marsha Krajcik")
                    .comments(List.of())
                    .content("Taedium thymum adipiscor amicitia cui.")
                    .createdAt(OffsetDateTime.parse("2019-12-12T18:10:22.988Z"))
                    .helpfulVotes(26d)
                    .id("d62785fe-25e1-453c-beac-30b346596bbe")
                    .isFeatured(true)
                    .isPublic(true)
                    .isVerified(false)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/882/1004?lock=7448492654002422")
                            .alt("Adulescens.")
                            .height(519d)
                            .id("bf17da5d-4b32-4ba6-96bf-7b7d21e7569d")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("da4aa00e-dc50-4fc2-bc87-fa3c2c6c562c")
                                    .slug("aggero")
                                    .value(CommerceMetadataValue.of("tero"))
                                    .build()))
                            .position(72d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(75d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/3QDZ8/1208/2171")
                            .alt("Pauci timidus sol comburo thema.")
                            .height(297d)
                            .id("9f671299-d662-4931-9bd9-4402cfc2b586")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("87b365fc-4284-417c-9995-8fc3257a7ec2")
                                    .slug("vito")
                                    .value(CommerceMetadataValue.of("cuppedia"))
                                    .build()))
                            .position(61d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(96d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/ytybC/2616/710")
                            .alt("Cuppedia vestrum patruus.")
                            .height(6d)
                            .id("791388aa-593c-4c12-8ad4-11ec3b63d717")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("dfd8fd5b-1e0d-40fd-8714-cb70f18edd96")
                                    .slug("arbitro")
                                    .value(CommerceMetadataValue.of("villa"))
                                    .build()))
                            .position(60d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(74d)
                            .build()))
                    .metadata(List.of())
                    .rating(3d)
                    .status(CommerceReviewStatus.APPROVED)
                    .title("Coepi adamo amicitia auxilium toties.")
                    .unhelpfulVotes(49d)
                    .updatedAt(OffsetDateTime.parse("2025-07-25T19:00:30.444Z"))
                    .url("https://excitable-underneath.com")
                    .verifiedPurchase(false)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceReviewResponse res = sdk.commerce().patchCommerceReview()
                .request(req)
                .call();

        if (res.commerceReview().isPresent()) {
            System.out.println(res.commerceReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchCommerceReviewRequest](../../models/operations/PatchCommerceReviewRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchCommerceReviewResponse](../../models/operations/PatchCommerceReviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceSaleschannel

Update a saleschannel

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceSaleschannel" method="patch" path="/commerce/{connection_id}/saleschannel/{id}" example="commerce_saleschannel" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceSaleschannelRequest;
import to.unified.unified_java_sdk.models.operations.PatchCommerceSaleschannelResponse;
import to.unified.unified_java_sdk.models.shared.CommerceSaleschannel;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceSaleschannelRequest req = PatchCommerceSaleschannelRequest.builder()
                .commerceSaleschannel(CommerceSaleschannel.builder()
                    .collections(List.of())
                    .createdAt(OffsetDateTime.parse("2021-12-12T06:19:55.421Z"))
                    .description("Utroque denuncio solutio.")
                    .id("0af22bc1-1278-4b53-80df-7cbb1fc0f8ec")
                    .isActive(false)
                    .slug("amiculum-congregatio-suspendo")
                    .updatedAt(OffsetDateTime.parse("2025-01-07T09:03:36.471Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceSaleschannelResponse res = sdk.commerce().patchCommerceSaleschannel()
                .request(req)
                .call();

        if (res.commerceSaleschannel().isPresent()) {
            System.out.println(res.commerceSaleschannel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [PatchCommerceSaleschannelRequest](../../models/operations/PatchCommerceSaleschannelRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[PatchCommerceSaleschannelResponse](../../models/operations/PatchCommerceSaleschannelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceCollection

Remove a collection

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

        RemoveCommerceCollectionResponse res = sdk.commerce().removeCommerceCollection()
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

## removeCommerceInventory

Remove an inventory

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceInventory" method="delete" path="/commerce/{connection_id}/inventory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceInventoryRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceInventoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceInventoryRequest req = RemoveCommerceInventoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceInventoryResponse res = sdk.commerce().removeCommerceInventory()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveCommerceInventoryRequest](../../models/operations/RemoveCommerceInventoryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveCommerceInventoryResponse](../../models/operations/RemoveCommerceInventoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceItem

Remove an item

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

        RemoveCommerceItemResponse res = sdk.commerce().removeCommerceItem()
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

        RemoveCommerceItemvariantResponse res = sdk.commerce().removeCommerceItemvariant()
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

## removeCommerceLocation

Remove a location

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceLocation" method="delete" path="/commerce/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceLocationRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceLocationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceLocationRequest req = RemoveCommerceLocationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceLocationResponse res = sdk.commerce().removeCommerceLocation()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveCommerceLocationRequest](../../models/operations/RemoveCommerceLocationRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveCommerceLocationResponse](../../models/operations/RemoveCommerceLocationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceReservation

Remove a reservation

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceReservation" method="delete" path="/commerce/{connection_id}/reservation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceReservationRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceReservationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceReservationRequest req = RemoveCommerceReservationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceReservationResponse res = sdk.commerce().removeCommerceReservation()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [RemoveCommerceReservationRequest](../../models/operations/RemoveCommerceReservationRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[RemoveCommerceReservationResponse](../../models/operations/RemoveCommerceReservationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceReview

Remove a review

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceReview" method="delete" path="/commerce/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceReviewRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceReviewResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceReviewRequest req = RemoveCommerceReviewRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceReviewResponse res = sdk.commerce().removeCommerceReview()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveCommerceReviewRequest](../../models/operations/RemoveCommerceReviewRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveCommerceReviewResponse](../../models/operations/RemoveCommerceReviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceSaleschannel

Remove a saleschannel

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceSaleschannel" method="delete" path="/commerce/{connection_id}/saleschannel/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceSaleschannelRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceSaleschannelResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceSaleschannelRequest req = RemoveCommerceSaleschannelRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceSaleschannelResponse res = sdk.commerce().removeCommerceSaleschannel()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [RemoveCommerceSaleschannelRequest](../../models/operations/RemoveCommerceSaleschannelRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[RemoveCommerceSaleschannelResponse](../../models/operations/RemoveCommerceSaleschannelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceCollection

Update a collection

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
                    .id("6052cdbc-4d54-4cf7-8a84-0aabb844bc9d")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .itemMetadata(List.of())
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/1319/1257?lock=7280448425732025")
                            .alt("Defungo adopto thorax.")
                            .height(759d)
                            .id("f0594a9b-5086-4341-a268-3255fd2a54ba")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("7a883a0f-22cc-4b29-ae06-97de38cb2741")
                                    .slug("censura")
                                    .value(CommerceMetadataValue.of("toties"))
                                    .build()))
                            .position(80d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(40d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .id("b4f0054c-fe8f-4bf6-95b3-3d8bcd110266")
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
                    .updatedAt(OffsetDateTime.parse("2025-02-26T17:05:57.927Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceCollectionResponse res = sdk.commerce().updateCommerceCollection()
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

## updateCommerceInventory

Update an inventory

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceInventory" method="put" path="/commerce/{connection_id}/inventory/{id}" example="commerce_inventory" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceInventoryRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceInventoryResponse;
import to.unified.unified_java_sdk.models.shared.CommerceInventory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceInventoryRequest req = UpdateCommerceInventoryRequest.builder()
                .commerceInventory(CommerceInventory.builder()
                    .available(337d)
                    .updatedAt(OffsetDateTime.parse("2025-10-25T14:46:38.393Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceInventoryResponse res = sdk.commerce().updateCommerceInventory()
                .request(req)
                .call();

        if (res.commerceInventory().isPresent()) {
            System.out.println(res.commerceInventory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateCommerceInventoryRequest](../../models/operations/UpdateCommerceInventoryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateCommerceInventoryResponse](../../models/operations/UpdateCommerceInventoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceItem

Update an item

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
                    .description("Vulnero ustulo abeo.")
                    .duration(87d)
                    .globalCode("calamitas")
                    .id("399fd14a-5f21-40b5-9abb-101a51aee587")
                    .isActive(false)
                    .isFeatured(true)
                    .isTaxable(true)
                    .isVisible(true)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/73y0uzyK/972/3753")
                            .alt("Caterva eveniet acies candidus.")
                            .height(663d)
                            .id("3aa78ee5-b4c3-4059-b6de-e95503742508")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("445cacc5-3af3-40fe-80a0-6d7cdd7a440e")
                                    .slug("doloremque")
                                    .value(CommerceMetadataValue.of("allatus"))
                                    .build()))
                            .position(67d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(88d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/Ao4iatfO/771/3906")
                            .alt("Comedo.")
                            .height(189d)
                            .id("2d24a5d6-7113-4276-8dc8-6501ab87a1dd")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("a4e9d3ef-8da9-435f-99b6-2143d9051550")
                                    .slug("bis")
                                    .value(CommerceMetadataValue.of("somniculosus"))
                                    .build()))
                            .position(3d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(66d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .extraData(CommerceMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CommerceMetadataFormat.TEXT)
                            .id("35346548-81cf-47ee-9b47-1c26b8704eae")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CommerceMetadataValue.of("terebro"))
                            .build()))
                    .name("Handcrafted Rubber Tuna")
                    .prices(List.of(
                        CommerceItemPrice.builder()
                            .price(1438d)
                            .compareAtPrice(474d)
                            .currency("OMR")
                            .build()))
                    .publicDescription("Custodia ventus solio compono.")
                    .publicName("Handcrafted Rubber Tuna")
                    .requiresShipping(true)
                    .slug("cohors-turba-optio")
                    .tags(List.of(
                        "blanditiis",
                        "tandem"))
                    .totalStock(579d)
                    .type("beatae")
                    .updatedAt(OffsetDateTime.parse("2022-04-07T03:47:13.679Z"))
                    .vendorName("Mayer - Flatley")
                    .weight(22d)
                    .weightUnit(WeightUnit.KG)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceItemResponse res = sdk.commerce().updateCommerceItem()
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

        UpdateCommerceItemvariantResponse res = sdk.commerce().updateCommerceItemvariant()
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

## updateCommerceLocation

Update a location

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceLocation" method="put" path="/commerce/{connection_id}/location/{id}" example="commerce_location" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceLocationRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceLocationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceLocationRequest req = UpdateCommerceLocationRequest.builder()
                .commerceLocation(CommerceLocation.builder()
                    .address(PropertyCommerceLocationAddress.builder()
                        .address1("29896 The Limes")
                        .city("New Kenny")
                        .countryCode("US")
                        .postalCode("14490-0609")
                        .region("Virginia")
                        .regionCode("MS")
                        .build())
                    .categories(List.of())
                    .createdAt(OffsetDateTime.parse("2022-12-29T04:15:21.195Z"))
                    .currency("XCD")
                    .description("Adsidue audentia.")
                    .id("07100492-63c7-45d9-98fa-9ae5ce440515")
                    .imageUrl("https://picsum.photos/seed/hjFt1/1036/2220")
                    .isActive(false)
                    .languageLocale("vulgaris")
                    .latitude(0d)
                    .locationType(LocationType.RESTAURANT)
                    .longitude(0d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/QVh7ViTV/3964/1567")
                            .alt("Addo.")
                            .height(283d)
                            .id("df7e08f5-a107-4f95-bcf8-beea16891b87")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("3a32d88a-5f7b-40db-b04f-07beddd998be")
                                    .slug("abutor")
                                    .value(CommerceMetadataValue.of("damno"))
                                    .build()))
                            .position(40d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(1d)
                            .build()))
                    .name("Olson - Mraz")
                    .priceLevel("")
                    .rating(0d)
                    .reviewCount(0d)
                    .telephones(List.of(
                        CommerceTelephone.builder()
                            .telephone("(872) 522-3201")
                            .type(CommerceTelephoneType.OTHER)
                            .build(),
                        CommerceTelephone.builder()
                            .telephone("(236) 274-2445")
                            .type(CommerceTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2024-04-09T17:46:33.576Z"))
                    .webUrl("https://chilly-edge.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceLocationResponse res = sdk.commerce().updateCommerceLocation()
                .request(req)
                .call();

        if (res.commerceLocation().isPresent()) {
            System.out.println(res.commerceLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateCommerceLocationRequest](../../models/operations/UpdateCommerceLocationRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateCommerceLocationResponse](../../models/operations/UpdateCommerceLocationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceReservation

Update a reservation

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceReservation" method="put" path="/commerce/{connection_id}/reservation/{id}" example="commerce_reservation" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceReservationRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceReservationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceReservationRequest req = UpdateCommerceReservationRequest.builder()
                .commerceReservation(CommerceReservation.builder()
                    .createdAt(OffsetDateTime.parse("2021-12-14T19:50:31.151Z"))
                    .endAt(OffsetDateTime.parse("2022-01-01T22:00:17.868Z"))
                    .guestEmail("Sunny.Strosin77@yahoo.com")
                    .guestName("Annette Franecki")
                    .guestPhone("(990) 317-6213")
                    .id("8fa2b4d4-5825-4e0c-bb7c-d32baa9b9ab4")
                    .itemName("Practical Ceramic Shoes")
                    .notes("Adsum textilis ipsum despecto.")
                    .size(10d)
                    .staffName("Vickie Fahey")
                    .startAt(OffsetDateTime.parse("2021-12-18T00:40:25.125Z"))
                    .status(CommerceReservationStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2022-12-27T22:22:00.449Z"))
                    .url("https://cluttered-pine.info/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceReservationResponse res = sdk.commerce().updateCommerceReservation()
                .request(req)
                .call();

        if (res.commerceReservation().isPresent()) {
            System.out.println(res.commerceReservation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [UpdateCommerceReservationRequest](../../models/operations/UpdateCommerceReservationRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[UpdateCommerceReservationResponse](../../models/operations/UpdateCommerceReservationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceReview

Update a review

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceReview" method="put" path="/commerce/{connection_id}/review/{id}" example="commerce_review" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceReviewRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceReviewResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceReviewRequest req = UpdateCommerceReviewRequest.builder()
                .commerceReview(CommerceReview.builder()
                    .authorAvatarUrl("https://picsum.photos/seed/ix4Br3LA/2245/1245")
                    .authorEmail("Cleve_Yundt@hotmail.com")
                    .authorLocation("ipsum")
                    .authorName("Marsha Krajcik")
                    .comments(List.of())
                    .content("Taedium thymum adipiscor amicitia cui.")
                    .createdAt(OffsetDateTime.parse("2019-12-12T18:10:22.988Z"))
                    .helpfulVotes(26d)
                    .id("d62785fe-25e1-453c-beac-30b346596bbe")
                    .isFeatured(true)
                    .isPublic(true)
                    .isVerified(false)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/882/1004?lock=7448492654002422")
                            .alt("Adulescens.")
                            .height(519d)
                            .id("bf17da5d-4b32-4ba6-96bf-7b7d21e7569d")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("da4aa00e-dc50-4fc2-bc87-fa3c2c6c562c")
                                    .slug("aggero")
                                    .value(CommerceMetadataValue.of("tero"))
                                    .build()))
                            .position(72d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(75d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/3QDZ8/1208/2171")
                            .alt("Pauci timidus sol comburo thema.")
                            .height(297d)
                            .id("9f671299-d662-4931-9bd9-4402cfc2b586")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("87b365fc-4284-417c-9995-8fc3257a7ec2")
                                    .slug("vito")
                                    .value(CommerceMetadataValue.of("cuppedia"))
                                    .build()))
                            .position(61d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(96d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://picsum.photos/seed/ytybC/2616/710")
                            .alt("Cuppedia vestrum patruus.")
                            .height(6d)
                            .id("791388aa-593c-4c12-8ad4-11ec3b63d717")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("dfd8fd5b-1e0d-40fd-8714-cb70f18edd96")
                                    .slug("arbitro")
                                    .value(CommerceMetadataValue.of("villa"))
                                    .build()))
                            .position(60d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(74d)
                            .build()))
                    .metadata(List.of())
                    .rating(3d)
                    .status(CommerceReviewStatus.APPROVED)
                    .title("Coepi adamo amicitia auxilium toties.")
                    .unhelpfulVotes(49d)
                    .updatedAt(OffsetDateTime.parse("2025-07-25T19:00:30.444Z"))
                    .url("https://excitable-underneath.com")
                    .verifiedPurchase(false)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceReviewResponse res = sdk.commerce().updateCommerceReview()
                .request(req)
                .call();

        if (res.commerceReview().isPresent()) {
            System.out.println(res.commerceReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateCommerceReviewRequest](../../models/operations/UpdateCommerceReviewRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateCommerceReviewResponse](../../models/operations/UpdateCommerceReviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceSaleschannel

Update a saleschannel

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceSaleschannel" method="put" path="/commerce/{connection_id}/saleschannel/{id}" example="commerce_saleschannel" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceSaleschannelRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceSaleschannelResponse;
import to.unified.unified_java_sdk.models.shared.CommerceSaleschannel;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceSaleschannelRequest req = UpdateCommerceSaleschannelRequest.builder()
                .commerceSaleschannel(CommerceSaleschannel.builder()
                    .collections(List.of())
                    .createdAt(OffsetDateTime.parse("2021-12-12T06:19:55.421Z"))
                    .description("Utroque denuncio solutio.")
                    .id("0af22bc1-1278-4b53-80df-7cbb1fc0f8ec")
                    .isActive(false)
                    .slug("amiculum-congregatio-suspendo")
                    .updatedAt(OffsetDateTime.parse("2025-01-07T09:03:36.471Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceSaleschannelResponse res = sdk.commerce().updateCommerceSaleschannel()
                .request(req)
                .call();

        if (res.commerceSaleschannel().isPresent()) {
            System.out.println(res.commerceSaleschannel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [UpdateCommerceSaleschannelRequest](../../models/operations/UpdateCommerceSaleschannelRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[UpdateCommerceSaleschannelResponse](../../models/operations/UpdateCommerceSaleschannelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |