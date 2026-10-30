# Listing

## Overview

### Available Operations

* [createPropertyListing](#createpropertylisting) - Create a listing
* [getPropertyListing](#getpropertylisting) - Retrieve a listing
* [listPropertyListings](#listpropertylistings) - List all listings
* [patchPropertyListing](#patchpropertylisting) - Update a listing
* [removePropertyListing](#removepropertylisting) - Remove a listing
* [updatePropertyListing](#updatepropertylisting) - Update a listing

## createPropertyListing

Creates a PropertyListing. Provide the unified PropertyListing fields in the request body; they are mapped to the provider's API. Returns the created PropertyListing.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPropertyListing" method="post" path="/property/{connection_id}/listing" example="property_listing" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePropertyListingRequest;
import to.unified.unified_java_sdk.models.operations.CreatePropertyListingResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePropertyListingRequest req = CreatePropertyListingRequest.builder()
                .propertyListing(PropertyListing.builder()
                    .address(PropertyPropertyListingAddress.builder()
                        .address1("9262 Bramley Close")
                        .city("New Andrewshire")
                        .country("United States")
                        .countryCode("US")
                        .postalCode("53615-4664")
                        .region("Nebraska")
                        .regionCode("IL")
                        .build())
                    .amenities(List.of(
                        "Wifi",
                        "Kitchen",
                        "Free parking"))
                    .bathrooms(1d)
                    .bedrooms(4d)
                    .beds(8d)
                    .channels(List.of(
                        PropertyChannel.builder()
                            .name("Booking.com")
                            .webUrl("https://frightened-hyphenation.net/")
                            .build()))
                    .checkInEndTime("22:00")
                    .checkInStartTime("15:00")
                    .checkOutTime("11:00")
                    .cleaningFeeAmount(134d)
                    .createdAt(OffsetDateTime.parse("2021-01-08T09:27:35.485Z"))
                    .currency("USD")
                    .description("Cuius deputo cruentus demoror censura caveo sponte statim vespillo cursim. Arbitro barba summopere. Curto vulticulus comparo surgo vociferor carmen deputo defluo.")
                    .houseRules("No smoking. No parties or events.")
                    .id("94e2961e-a3fe-4d82-96cd-4df43e1eea3e")
                    .imageUrls(List.of(
                        "https://loremflickr.com/23/1328?lock=5798241296161663",
                        "https://loremflickr.com/12/1312?lock=6354590363728966"))
                    .latitude(-5.4327)
                    .longitude(98.9045)
                    .maxNights(15d)
                    .maxOccupancy(5d)
                    .metadata(List.of())
                    .minNights(1d)
                    .name("accurate Loft")
                    .rating(4.9)
                    .reviewCount(343d)
                    .startPriceAmount(470d)
                    .timezone("America/Los_Angeles")
                    .type(PropertyListingType.ROOM)
                    .updatedAt(OffsetDateTime.parse("2026-09-06T17:43:20.898Z"))
                    .webUrl("https://tight-pronoun.info/")
                    .build())
                .connectionId("<id>")
                .build();

        CreatePropertyListingResponse res = sdk.listing().createPropertyListing()
                .request(req)
                .call();

        if (res.propertyListing().isPresent()) {
            System.out.println(res.propertyListing().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreatePropertyListingRequest](../../models/operations/CreatePropertyListingRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreatePropertyListingResponse](../../models/operations/CreatePropertyListingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPropertyListing

Retrieves a single PropertyListing by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPropertyListing" method="get" path="/property/{connection_id}/listing/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPropertyListingRequest;
import to.unified.unified_java_sdk.models.operations.GetPropertyListingResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPropertyListingRequest req = GetPropertyListingRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPropertyListingResponse res = sdk.listing().getPropertyListing()
                .request(req)
                .call();

        if (res.propertyListing().isPresent()) {
            System.out.println(res.propertyListing().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetPropertyListingRequest](../../models/operations/GetPropertyListingRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetPropertyListingResponse](../../models/operations/GetPropertyListingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPropertyListings

Returns a list of PropertyListings. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPropertyListings" method="get" path="/property/{connection_id}/listing" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPropertyListingsRequest;
import to.unified.unified_java_sdk.models.operations.ListPropertyListingsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPropertyListingsRequest req = ListPropertyListingsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPropertyListingsResponse res = sdk.listing().listPropertyListings()
                .request(req)
                .call();

        if (res.propertyListings().isPresent()) {
            System.out.println(res.propertyListings().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListPropertyListingsRequest](../../models/operations/ListPropertyListingsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListPropertyListingsResponse](../../models/operations/ListPropertyListingsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPropertyListing

Updates the PropertyListing identified by `id`. Provide the unified PropertyListing fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPropertyListing" method="patch" path="/property/{connection_id}/listing/{id}" example="property_listing" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPropertyListingRequest;
import to.unified.unified_java_sdk.models.operations.PatchPropertyListingResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPropertyListingRequest req = PatchPropertyListingRequest.builder()
                .propertyListing(PropertyListing.builder()
                    .address(PropertyPropertyListingAddress.builder()
                        .address1("9262 Bramley Close")
                        .city("New Andrewshire")
                        .country("United States")
                        .countryCode("US")
                        .postalCode("53615-4664")
                        .region("Nebraska")
                        .regionCode("IL")
                        .build())
                    .amenities(List.of(
                        "Wifi",
                        "Kitchen",
                        "Free parking"))
                    .bathrooms(1d)
                    .bedrooms(4d)
                    .beds(8d)
                    .channels(List.of(
                        PropertyChannel.builder()
                            .name("Booking.com")
                            .webUrl("https://frightened-hyphenation.net/")
                            .build()))
                    .checkInEndTime("22:00")
                    .checkInStartTime("15:00")
                    .checkOutTime("11:00")
                    .cleaningFeeAmount(134d)
                    .createdAt(OffsetDateTime.parse("2021-01-08T09:27:35.485Z"))
                    .currency("USD")
                    .description("Cuius deputo cruentus demoror censura caveo sponte statim vespillo cursim. Arbitro barba summopere. Curto vulticulus comparo surgo vociferor carmen deputo defluo.")
                    .houseRules("No smoking. No parties or events.")
                    .id("88f55e43-fb76-4f9e-bdfa-a296eff71b60")
                    .imageUrls(List.of(
                        "https://loremflickr.com/23/1328?lock=5798241296161663",
                        "https://loremflickr.com/12/1312?lock=6354590363728966"))
                    .latitude(-5.4327)
                    .longitude(98.9045)
                    .maxNights(15d)
                    .maxOccupancy(5d)
                    .metadata(List.of())
                    .minNights(1d)
                    .name("accurate Loft")
                    .rating(4.9)
                    .reviewCount(343d)
                    .startPriceAmount(470d)
                    .timezone("America/Los_Angeles")
                    .type(PropertyListingType.ROOM)
                    .updatedAt(OffsetDateTime.parse("2026-09-06T17:43:20.941Z"))
                    .webUrl("https://tight-pronoun.info/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPropertyListingResponse res = sdk.listing().patchPropertyListing()
                .request(req)
                .call();

        if (res.propertyListing().isPresent()) {
            System.out.println(res.propertyListing().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchPropertyListingRequest](../../models/operations/PatchPropertyListingRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchPropertyListingResponse](../../models/operations/PatchPropertyListingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removePropertyListing

Deletes the PropertyListing identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removePropertyListing" method="delete" path="/property/{connection_id}/listing/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemovePropertyListingRequest;
import to.unified.unified_java_sdk.models.operations.RemovePropertyListingResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemovePropertyListingRequest req = RemovePropertyListingRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemovePropertyListingResponse res = sdk.listing().removePropertyListing()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemovePropertyListingRequest](../../models/operations/RemovePropertyListingRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemovePropertyListingResponse](../../models/operations/RemovePropertyListingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePropertyListing

Updates the PropertyListing identified by `id`. Provide the unified PropertyListing fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePropertyListing" method="put" path="/property/{connection_id}/listing/{id}" example="property_listing" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePropertyListingRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePropertyListingResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePropertyListingRequest req = UpdatePropertyListingRequest.builder()
                .propertyListing(PropertyListing.builder()
                    .address(PropertyPropertyListingAddress.builder()
                        .address1("9262 Bramley Close")
                        .city("New Andrewshire")
                        .country("United States")
                        .countryCode("US")
                        .postalCode("53615-4664")
                        .region("Nebraska")
                        .regionCode("IL")
                        .build())
                    .amenities(List.of(
                        "Wifi",
                        "Kitchen",
                        "Free parking"))
                    .bathrooms(1d)
                    .bedrooms(4d)
                    .beds(8d)
                    .channels(List.of(
                        PropertyChannel.builder()
                            .name("Booking.com")
                            .webUrl("https://frightened-hyphenation.net/")
                            .build()))
                    .checkInEndTime("22:00")
                    .checkInStartTime("15:00")
                    .checkOutTime("11:00")
                    .cleaningFeeAmount(134d)
                    .createdAt(OffsetDateTime.parse("2021-01-08T09:27:35.485Z"))
                    .currency("USD")
                    .description("Cuius deputo cruentus demoror censura caveo sponte statim vespillo cursim. Arbitro barba summopere. Curto vulticulus comparo surgo vociferor carmen deputo defluo.")
                    .houseRules("No smoking. No parties or events.")
                    .id("88f55e43-fb76-4f9e-bdfa-a296eff71b60")
                    .imageUrls(List.of(
                        "https://loremflickr.com/23/1328?lock=5798241296161663",
                        "https://loremflickr.com/12/1312?lock=6354590363728966"))
                    .latitude(-5.4327)
                    .longitude(98.9045)
                    .maxNights(15d)
                    .maxOccupancy(5d)
                    .metadata(List.of())
                    .minNights(1d)
                    .name("accurate Loft")
                    .rating(4.9)
                    .reviewCount(343d)
                    .startPriceAmount(470d)
                    .timezone("America/Los_Angeles")
                    .type(PropertyListingType.ROOM)
                    .updatedAt(OffsetDateTime.parse("2026-09-06T17:43:20.941Z"))
                    .webUrl("https://tight-pronoun.info/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePropertyListingResponse res = sdk.listing().updatePropertyListing()
                .request(req)
                .call();

        if (res.propertyListing().isPresent()) {
            System.out.println(res.propertyListing().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdatePropertyListingRequest](../../models/operations/UpdatePropertyListingRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdatePropertyListingResponse](../../models/operations/UpdatePropertyListingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |