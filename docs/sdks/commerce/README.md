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
* [getCommerceReturn](#getcommercereturn) - Retrieve a return
* [getCommerceReview](#getcommercereview) - Retrieve a review
* [getCommerceSaleschannel](#getcommercesaleschannel) - Retrieve a saleschannel
* [listCommerceAvailabilities](#listcommerceavailabilities) - List all availabilities
* [listCommerceCollections](#listcommercecollections) - List all collections
* [listCommerceInventories](#listcommerceinventories) - List all inventories
* [listCommerceItems](#listcommerceitems) - List all items
* [listCommerceItemvariants](#listcommerceitemvariants) - List all itemvariants
* [listCommerceLocations](#listcommercelocations) - List all locations
* [listCommerceReservations](#listcommercereservations) - List all reservations
* [listCommerceReturns](#listcommercereturns) - List all returns
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
                    .id("8bb2567d-e2cb-4a2b-addb-483c69624305")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .itemMetadata(List.of())
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/1319/1257?lock=7280448425732025")
                            .alt("Defungo adopto thorax.")
                            .height(759d)
                            .id("25186d3e-f0dd-400f-a77b-fc61965b0558")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("640909f4-2aeb-4614-a389-783ed2f54386")
                                    .slug("censura")
                                    .value(CommerceMetadataValue.of("toties"))
                                    .build()))
                            .position(80d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(40d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .id("a1fd8e17-de56-483e-908c-20a23f17d05f")
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
                    .updatedAt(OffsetDateTime.parse("2025-03-22T03:45:47.983Z"))
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

Creates a CommerceInventory. Provide the unified CommerceInventory fields in the request body; they are mapped to the provider's API. Returns the created CommerceInventory.

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceInventory" method="post" path="/commerce/{connection_id}/inventory" example="commerce_inventory" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .id("ae2abbdd-4cd2-4423-98fd-bee189313ed0")
                    .metadata(List.of())
                    .updatedAt(OffsetDateTime.parse("2025-12-01T14:50:59.306Z"))
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
                    .id("eafb8ba8-d831-4b2d-8c6a-573526217fa7")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(92d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/2126/721?lock=8820088623807162")
                            .alt("Hic desipio thorax.")
                            .height(961d)
                            .id("0533ab4b-58df-4c09-8d5d-04029edcc1fc")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("a70b3409-ab11-4ec0-8fe7-2f40eada29ab")
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
                            .id("04e96ede-a83b-4466-a765-f45fffd73849")
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
                            .id("72c68b05-5518-4364-8183-b60b31274b78")
                            .position(1d)
                            .build(),
                        CommerceItemOption.builder()
                            .name("Size")
                            .values(List.of(
                                "S"))
                            .id("ae7a2cde-1b1f-4211-b0f1-777d6966e08f")
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
                    .updatedAt(OffsetDateTime.parse("2026-03-21T18:52:25.296Z"))
                    .weight(46d)
                    .weightUnit(CommerceItemvariantWeightUnit.OZ)
                    .width(40d)
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

Creates a CommerceLocation. Provide the unified CommerceLocation fields in the request body; they are mapped to the provider's API. Returns the created CommerceLocation.

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
                    .id("d174326e-7520-4f03-b976-561765b436ab")
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
                            .id("44ed0f47-0948-4d52-b93a-9884e5395027")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("2059d750-2f9e-4c1b-9a17-6fc164086815")
                                    .slug("abutor")
                                    .value(CommerceMetadataValue.of("damno"))
                                    .build()))
                            .position(40d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(1d)
                            .build()))
                    .metadata(List.of())
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
                    .updatedAt(OffsetDateTime.parse("2024-04-25T12:45:33.417Z"))
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

Creates a CommerceReservation. Provide the unified CommerceReservation fields in the request body; they are mapped to the provider's API. Returns the created CommerceReservation.

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceReservation" method="post" path="/commerce/{connection_id}/reservation" example="commerce_reservation" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .guestEmail("julien.bartoletti@icloud.com")
                    .guestName("Julien Bartoletti")
                    .guestPhone("(728) 596-2620")
                    .id("ab347a9e-42f1-4221-915d-9fe556260802")
                    .metadata(List.of())
                    .notes("Adsum textilis ipsum despecto.")
                    .size(10d)
                    .startAt(OffsetDateTime.parse("2021-12-18T00:40:25.125Z"))
                    .status(CommerceReservationStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2023-01-06T21:59:26.063Z"))
                    .url("https://expensive-gift.org")
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

Creates a CommerceReview. Provide the unified CommerceReview fields in the request body; they are mapped to the provider's API. Returns the created CommerceReview.

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
                    .authorAvatarUrl("https://loremflickr.com/7/2660?lock=4279109054086693")
                    .authorEmail("nyasia.macgyver@hotmail.com")
                    .authorLocation("denique")
                    .authorName("Nyasia MacGyver")
                    .comments(List.of())
                    .content("Taedium thymum adipiscor amicitia cui.")
                    .createdAt(OffsetDateTime.parse("2019-12-12T18:10:22.988Z"))
                    .helpfulVotes(66d)
                    .id("3e2f28ed-6f8b-4a22-b57e-1bbffca0ad36")
                    .isFeatured(false)
                    .isPublic(true)
                    .isVerified(false)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/196/2041?lock=5845524773114807")
                            .alt("Desipio carpo sol laudantium colo.")
                            .height(749d)
                            .id("b80ccab0-bf89-48dc-bad6-fd7a0ad88278")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("27ed2333-5d03-4656-9dea-2b7feb56f629")
                                    .slug("textor")
                                    .value(CommerceMetadataValue.of("quos"))
                                    .build()))
                            .position(29d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(72d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/1178/2175?lock=5466640101053206")
                            .alt("Adopto teneo numquam.")
                            .height(957d)
                            .id("bf223100-f2a1-4b88-86dc-8f94d58e4f6a")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("96521d66-4b36-4fc3-8108-fbc3d34b06bd")
                                    .slug("bos")
                                    .value(CommerceMetadataValue.of("casso"))
                                    .build()))
                            .position(69d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(61d)
                            .build()))
                    .metadata(List.of())
                    .rating(3d)
                    .status(CommerceReviewStatus.APPROVED)
                    .title("Coepi adamo amicitia auxilium toties.")
                    .unhelpfulVotes(88d)
                    .updatedAt(OffsetDateTime.parse("2025-09-01T21:51:45.131Z"))
                    .url("https://diligent-bandwidth.biz")
                    .verifiedPurchase(true)
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

Creates a CommerceSaleschannel. Provide the unified CommerceSaleschannel fields in the request body; they are mapped to the provider's API. Returns the created CommerceSaleschannel.

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
                    .id("936f7bc7-1076-4958-9199-dd0fd30d633d")
                    .isActive(false)
                    .metadata(List.of())
                    .slug("amiculum-congregatio-suspendo")
                    .updatedAt(OffsetDateTime.parse("2025-02-05T23:09:07.496Z"))
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

Retrieves a single CommerceInventory by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single CommerceLocation by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single CommerceReservation by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

## getCommerceReturn

Retrieves a single CommerceReturn by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceReturn" method="get" path="/commerce/{connection_id}/return/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceReturnRequest;
import to.unified.unified_java_sdk.models.operations.GetCommerceReturnResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceReturnRequest req = GetCommerceReturnRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceReturnResponse res = sdk.commerce().getCommerceReturn()
                .request(req)
                .call();

        if (res.commerceReturn().isPresent()) {
            System.out.println(res.commerceReturn().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetCommerceReturnRequest](../../models/operations/GetCommerceReturnRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetCommerceReturnResponse](../../models/operations/GetCommerceReturnResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceReview

Retrieves a single CommerceReview by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single CommerceSaleschannel by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Returns a list of CommerceAvailabilities. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of CommerceInventories. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of CommerceLocations. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of CommerceReservations. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

## listCommerceReturns

Returns a list of CommerceReturns. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceReturns" method="get" path="/commerce/{connection_id}/return" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceReturnsRequest;
import to.unified.unified_java_sdk.models.operations.ListCommerceReturnsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceReturnsRequest req = ListCommerceReturnsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCommerceReturnsResponse res = sdk.commerce().listCommerceReturns()
                .request(req)
                .call();

        if (res.commerceReturns().isPresent()) {
            System.out.println(res.commerceReturns().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListCommerceReturnsRequest](../../models/operations/ListCommerceReturnsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListCommerceReturnsResponse](../../models/operations/ListCommerceReturnsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceReviews

Returns a list of CommerceReviews. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of CommerceSaleschannels. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
                    .id("bd838b56-9a11-4844-9cdd-70e41289e9ff")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .itemMetadata(List.of())
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/1319/1257?lock=7280448425732025")
                            .alt("Defungo adopto thorax.")
                            .height(759d)
                            .id("70fd1710-129f-4895-b447-9ede919f5d38")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("d386170f-bd1f-4745-b351-a2913f539e7a")
                                    .slug("censura")
                                    .value(CommerceMetadataValue.of("toties"))
                                    .build()))
                            .position(80d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(40d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .id("b2830d11-f894-4fec-98a0-f07a059929eb")
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
                    .updatedAt(OffsetDateTime.parse("2025-03-22T03:45:47.998Z"))
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

Updates the CommerceInventory identified by `id`. Provide the unified CommerceInventory fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceInventory" method="patch" path="/commerce/{connection_id}/inventory/{id}" example="commerce_inventory" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .id("ea02339d-f6b6-42c7-a267-97434f980d7c")
                    .metadata(List.of())
                    .updatedAt(OffsetDateTime.parse("2025-12-01T14:50:59.315Z"))
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
                    .id("9c8ea1a0-3731-49eb-b8f4-167981b0b59d")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(92d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/2126/721?lock=8820088623807162")
                            .alt("Hic desipio thorax.")
                            .height(961d)
                            .id("579b89cc-c682-4b3c-86c5-7149206aed78")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("9370e5e0-d5b4-41e9-908f-45bfba39a8df")
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
                            .id("5f5e71c8-800f-4afb-b1c9-aa5cbd7cc188")
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
                            .id("a81af408-9a4a-4f1e-9289-f0d0f0908e2b")
                            .position(1d)
                            .build(),
                        CommerceItemOption.builder()
                            .name("Size")
                            .values(List.of(
                                "S"))
                            .id("96325f83-c11f-4ef0-a5a9-6327fc843aad")
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
                    .updatedAt(OffsetDateTime.parse("2026-03-21T18:52:25.321Z"))
                    .weight(46d)
                    .weightUnit(CommerceItemvariantWeightUnit.OZ)
                    .width(40d)
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

Updates the CommerceLocation identified by `id`. Provide the unified CommerceLocation fields to change in the request body.

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
                    .id("2dfcce87-5e25-45a4-b584-c6b119f4b388")
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
                            .id("4211b57e-d966-46f8-817b-ad0dd142eae0")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("513d20af-bda0-4b4b-9981-5b9355085927")
                                    .slug("abutor")
                                    .value(CommerceMetadataValue.of("damno"))
                                    .build()))
                            .position(40d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(1d)
                            .build()))
                    .metadata(List.of())
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
                    .updatedAt(OffsetDateTime.parse("2024-04-25T12:45:33.431Z"))
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

Updates the CommerceReservation identified by `id`. Provide the unified CommerceReservation fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceReservation" method="patch" path="/commerce/{connection_id}/reservation/{id}" example="commerce_reservation" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .guestEmail("julien.bartoletti@icloud.com")
                    .guestName("Julien Bartoletti")
                    .guestPhone("(728) 596-2620")
                    .id("f00277e2-b0e7-4690-b248-8707a91d4ce1")
                    .metadata(List.of())
                    .notes("Adsum textilis ipsum despecto.")
                    .size(10d)
                    .startAt(OffsetDateTime.parse("2021-12-18T00:40:25.125Z"))
                    .status(CommerceReservationStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2023-01-06T21:59:26.066Z"))
                    .url("https://expensive-gift.org")
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

Updates the CommerceReview identified by `id`. Provide the unified CommerceReview fields to change in the request body.

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
                    .authorAvatarUrl("https://loremflickr.com/7/2660?lock=4279109054086693")
                    .authorEmail("nyasia.macgyver@hotmail.com")
                    .authorLocation("denique")
                    .authorName("Nyasia MacGyver")
                    .comments(List.of())
                    .content("Taedium thymum adipiscor amicitia cui.")
                    .createdAt(OffsetDateTime.parse("2019-12-12T18:10:22.988Z"))
                    .helpfulVotes(66d)
                    .id("c59b2522-a3de-4f0b-9839-2993238864a7")
                    .isFeatured(false)
                    .isPublic(true)
                    .isVerified(false)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/196/2041?lock=5845524773114807")
                            .alt("Desipio carpo sol laudantium colo.")
                            .height(749d)
                            .id("f59077e7-74a8-4dd6-8b2e-5121aa17677a")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("db2ddab3-9e5d-444b-aab9-7f8d3080fe99")
                                    .slug("textor")
                                    .value(CommerceMetadataValue.of("quos"))
                                    .build()))
                            .position(29d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(72d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/1178/2175?lock=5466640101053206")
                            .alt("Adopto teneo numquam.")
                            .height(957d)
                            .id("07c1b6de-279b-47ed-b470-a4ea91a1f43e")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("8f76b9fe-518d-4e9f-bc18-0eb042a7cbce")
                                    .slug("bos")
                                    .value(CommerceMetadataValue.of("casso"))
                                    .build()))
                            .position(69d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(61d)
                            .build()))
                    .metadata(List.of())
                    .rating(3d)
                    .status(CommerceReviewStatus.APPROVED)
                    .title("Coepi adamo amicitia auxilium toties.")
                    .unhelpfulVotes(88d)
                    .updatedAt(OffsetDateTime.parse("2025-09-01T21:51:45.167Z"))
                    .url("https://diligent-bandwidth.biz")
                    .verifiedPurchase(true)
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

Updates the CommerceSaleschannel identified by `id`. Provide the unified CommerceSaleschannel fields to change in the request body.

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
                    .id("516f2568-df13-4088-8738-9cc109b12c60")
                    .isActive(false)
                    .metadata(List.of())
                    .slug("amiculum-congregatio-suspendo")
                    .updatedAt(OffsetDateTime.parse("2025-02-05T23:09:07.501Z"))
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

Deletes the CommerceInventory identified by `id`.

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

Deletes the CommerceLocation identified by `id`.

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

Deletes the CommerceReservation identified by `id`.

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

Deletes the CommerceReview identified by `id`.

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

Deletes the CommerceSaleschannel identified by `id`.

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
                    .id("bd838b56-9a11-4844-9cdd-70e41289e9ff")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .itemMetadata(List.of())
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/1319/1257?lock=7280448425732025")
                            .alt("Defungo adopto thorax.")
                            .height(759d)
                            .id("70fd1710-129f-4895-b447-9ede919f5d38")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("d386170f-bd1f-4745-b351-a2913f539e7a")
                                    .slug("censura")
                                    .value(CommerceMetadataValue.of("toties"))
                                    .build()))
                            .position(80d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(40d)
                            .build()))
                    .metadata(List.of(
                        CommerceMetadata.builder()
                            .id("b2830d11-f894-4fec-98a0-f07a059929eb")
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
                    .updatedAt(OffsetDateTime.parse("2025-03-22T03:45:47.998Z"))
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

Updates the CommerceInventory identified by `id`. Provide the unified CommerceInventory fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceInventory" method="put" path="/commerce/{connection_id}/inventory/{id}" example="commerce_inventory" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .id("ea02339d-f6b6-42c7-a267-97434f980d7c")
                    .metadata(List.of())
                    .updatedAt(OffsetDateTime.parse("2025-12-01T14:50:59.315Z"))
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
                    .id("9c8ea1a0-3731-49eb-b8f4-167981b0b59d")
                    .isActive(true)
                    .isFeatured(false)
                    .isVisible(false)
                    .length(92d)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/2126/721?lock=8820088623807162")
                            .alt("Hic desipio thorax.")
                            .height(961d)
                            .id("579b89cc-c682-4b3c-86c5-7149206aed78")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("9370e5e0-d5b4-41e9-908f-45bfba39a8df")
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
                            .id("5f5e71c8-800f-4afb-b1c9-aa5cbd7cc188")
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
                            .id("a81af408-9a4a-4f1e-9289-f0d0f0908e2b")
                            .position(1d)
                            .build(),
                        CommerceItemOption.builder()
                            .name("Size")
                            .values(List.of(
                                "S"))
                            .id("96325f83-c11f-4ef0-a5a9-6327fc843aad")
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
                    .updatedAt(OffsetDateTime.parse("2026-03-21T18:52:25.321Z"))
                    .weight(46d)
                    .weightUnit(CommerceItemvariantWeightUnit.OZ)
                    .width(40d)
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

Updates the CommerceLocation identified by `id`. Provide the unified CommerceLocation fields to change in the request body.

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
                    .id("2dfcce87-5e25-45a4-b584-c6b119f4b388")
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
                            .id("4211b57e-d966-46f8-817b-ad0dd142eae0")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("513d20af-bda0-4b4b-9981-5b9355085927")
                                    .slug("abutor")
                                    .value(CommerceMetadataValue.of("damno"))
                                    .build()))
                            .position(40d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(1d)
                            .build()))
                    .metadata(List.of())
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
                    .updatedAt(OffsetDateTime.parse("2024-04-25T12:45:33.431Z"))
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

Updates the CommerceReservation identified by `id`. Provide the unified CommerceReservation fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceReservation" method="put" path="/commerce/{connection_id}/reservation/{id}" example="commerce_reservation" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .guestEmail("julien.bartoletti@icloud.com")
                    .guestName("Julien Bartoletti")
                    .guestPhone("(728) 596-2620")
                    .id("f00277e2-b0e7-4690-b248-8707a91d4ce1")
                    .metadata(List.of())
                    .notes("Adsum textilis ipsum despecto.")
                    .size(10d)
                    .startAt(OffsetDateTime.parse("2021-12-18T00:40:25.125Z"))
                    .status(CommerceReservationStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2023-01-06T21:59:26.066Z"))
                    .url("https://expensive-gift.org")
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

Updates the CommerceReview identified by `id`. Provide the unified CommerceReview fields to change in the request body.

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
                    .authorAvatarUrl("https://loremflickr.com/7/2660?lock=4279109054086693")
                    .authorEmail("nyasia.macgyver@hotmail.com")
                    .authorLocation("denique")
                    .authorName("Nyasia MacGyver")
                    .comments(List.of())
                    .content("Taedium thymum adipiscor amicitia cui.")
                    .createdAt(OffsetDateTime.parse("2019-12-12T18:10:22.988Z"))
                    .helpfulVotes(66d)
                    .id("c59b2522-a3de-4f0b-9839-2993238864a7")
                    .isFeatured(false)
                    .isPublic(true)
                    .isVerified(false)
                    .media(List.of(
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/196/2041?lock=5845524773114807")
                            .alt("Desipio carpo sol laudantium colo.")
                            .height(749d)
                            .id("f59077e7-74a8-4dd6-8b2e-5121aa17677a")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("db2ddab3-9e5d-444b-aab9-7f8d3080fe99")
                                    .slug("textor")
                                    .value(CommerceMetadataValue.of("quos"))
                                    .build()))
                            .position(29d)
                            .type(CommerceItemMediaType.VIDEO)
                            .width(72d)
                            .build(),
                        CommerceItemMedia.builder()
                            .url("https://loremflickr.com/1178/2175?lock=5466640101053206")
                            .alt("Adopto teneo numquam.")
                            .height(957d)
                            .id("07c1b6de-279b-47ed-b470-a4ea91a1f43e")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("8f76b9fe-518d-4e9f-bc18-0eb042a7cbce")
                                    .slug("bos")
                                    .value(CommerceMetadataValue.of("casso"))
                                    .build()))
                            .position(69d)
                            .type(CommerceItemMediaType.IMAGE)
                            .width(61d)
                            .build()))
                    .metadata(List.of())
                    .rating(3d)
                    .status(CommerceReviewStatus.APPROVED)
                    .title("Coepi adamo amicitia auxilium toties.")
                    .unhelpfulVotes(88d)
                    .updatedAt(OffsetDateTime.parse("2025-09-01T21:51:45.167Z"))
                    .url("https://diligent-bandwidth.biz")
                    .verifiedPurchase(true)
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

Updates the CommerceSaleschannel identified by `id`. Provide the unified CommerceSaleschannel fields to change in the request body.

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
                    .id("516f2568-df13-4088-8738-9cc109b12c60")
                    .isActive(false)
                    .metadata(List.of())
                    .slug("amiculum-congregatio-suspendo")
                    .updatedAt(OffsetDateTime.parse("2025-02-05T23:09:07.501Z"))
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