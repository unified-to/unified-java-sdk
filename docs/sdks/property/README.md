# Property

## Overview

### Available Operations

* [createAnalyticsProperty](#createanalyticsproperty) - Create a property
* [createPropertyConversation](#createpropertyconversation) - Create a conversation
* [createPropertyGuest](#createpropertyguest) - Create a guest
* [createPropertyListing](#createpropertylisting) - Create a listing
* [createPropertyQuote](#createpropertyquote) - Create a quote
* [createPropertyReservation](#createpropertyreservation) - Create a reservation
* [getAnalyticsProperty](#getanalyticsproperty) - Retrieve a property
* [getPropertyConversation](#getpropertyconversation) - Retrieve a conversation
* [getPropertyGuest](#getpropertyguest) - Retrieve a guest
* [getPropertyListing](#getpropertylisting) - Retrieve a listing
* [getPropertyReservation](#getpropertyreservation) - Retrieve a reservation
* [getPropertyReview](#getpropertyreview) - Retrieve a review
* [getPropertyUnittype](#getpropertyunittype) - Retrieve an unittype
* [listAnalyticsProperties](#listanalyticsproperties) - List all properties
* [listPropertyAvailabilities](#listpropertyavailabilities) - List all availabilities
* [listPropertyConversations](#listpropertyconversations) - List all conversations
* [listPropertyGuests](#listpropertyguests) - List all guests
* [listPropertyListings](#listpropertylistings) - List all listings
* [listPropertyReservations](#listpropertyreservations) - List all reservations
* [listPropertyReviews](#listpropertyreviews) - List all reviews
* [listPropertyUnittypes](#listpropertyunittypes) - List all unittypes
* [patchAnalyticsProperty](#patchanalyticsproperty) - Update a property
* [patchPropertyGuest](#patchpropertyguest) - Update a guest
* [patchPropertyListing](#patchpropertylisting) - Update a listing
* [patchPropertyReservation](#patchpropertyreservation) - Update a reservation
* [patchPropertyReview](#patchpropertyreview) - Update a review
* [removeAnalyticsProperty](#removeanalyticsproperty) - Remove a property
* [removePropertyListing](#removepropertylisting) - Remove a listing
* [updateAnalyticsProperty](#updateanalyticsproperty) - Update a property
* [updatePropertyGuest](#updatepropertyguest) - Update a guest
* [updatePropertyListing](#updatepropertylisting) - Update a listing
* [updatePropertyReservation](#updatepropertyreservation) - Update a reservation
* [updatePropertyReview](#updatepropertyreview) - Update a review

## createAnalyticsProperty

Creates a AnalyticsProperty. Provide the unified AnalyticsProperty fields in the request body; they are mapped to the provider's API. Returns the created AnalyticsProperty.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAnalyticsProperty" method="post" path="/analytics/{connection_id}/property" example="analytics_property" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsPropertyRequest;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsPropertyResponse;
import to.unified.unified_java_sdk.models.shared.AnalyticsProperty;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAnalyticsPropertyRequest req = CreateAnalyticsPropertyRequest.builder()
                .analyticsProperty(AnalyticsProperty.builder()
                    .createdAt(OffsetDateTime.parse("2021-09-05T19:04:58.430Z"))
                    .currency("USD")
                    .id("fdb2b5d8-04c7-4c5a-97ad-7500e9489e7a")
                    .name("Daniel, Goldner and Dickinson")
                    .timezone("UTC")
                    .updatedAt(OffsetDateTime.parse("2021-09-14T21:35:18.344Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAnalyticsPropertyResponse res = sdk.property().createAnalyticsProperty()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAnalyticsPropertyRequest](../../models/operations/CreateAnalyticsPropertyRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAnalyticsPropertyResponse](../../models/operations/CreateAnalyticsPropertyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createPropertyConversation

Creates a PropertyConversation. Provide the unified PropertyConversation fields in the request body; they are mapped to the provider's API. Returns the created PropertyConversation.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPropertyConversation" method="post" path="/property/{connection_id}/conversation" example="property_conversation" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePropertyConversationRequest;
import to.unified.unified_java_sdk.models.operations.CreatePropertyConversationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePropertyConversationRequest req = CreatePropertyConversationRequest.builder()
                .propertyConversation(PropertyConversation.builder()
                    .createdAt(OffsetDateTime.parse("2022-06-20T00:02:46.530Z"))
                    .guestName("Evie Okuneva")
                    .id("5c6b01e7-85f7-4750-92d9-bebc565d193c")
                    .isUnread(false)
                    .messages(List.of(
                        PropertyMessage.builder()
                            .attachments(List.of())
                            .createdAt(OffsetDateTime.parse("2025-04-22T23:32:34.193Z"))
                            .id("9c2830a9-73bd-41ec-bc60-b7a9389f8da9")
                            .isAutomatic(false)
                            .message("Vinitor caterva amor sophismata admitto colo tempore aufero torrens.")
                            .senderName("Evie Okuneva")
                            .senderType(SenderType.GUEST)
                            .build(),
                        PropertyMessage.builder()
                            .attachments(List.of())
                            .createdAt(OffsetDateTime.parse("2026-05-06T11:00:16.962Z"))
                            .id("e801a7f0-021c-416e-89fa-4e1d212763cf")
                            .message("Aequitas torqueo curiositas cimentarius repellendus auditor degero ademptio adnuo.")
                            .senderName("Ms. Patti Lynch")
                            .senderType(SenderType.HOST)
                            .build()))
                    .metadata(List.of())
                    .source("Airbnb")
                    .updatedAt(OffsetDateTime.parse("2026-05-06T11:00:16.962Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreatePropertyConversationResponse res = sdk.property().createPropertyConversation()
                .request(req)
                .call();

        if (res.propertyConversation().isPresent()) {
            System.out.println(res.propertyConversation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [CreatePropertyConversationRequest](../../models/operations/CreatePropertyConversationRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[CreatePropertyConversationResponse](../../models/operations/CreatePropertyConversationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createPropertyGuest

Creates a PropertyGuest. Provide the unified PropertyGuest fields in the request body; they are mapped to the provider's API. Returns the created PropertyGuest.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPropertyGuest" method="post" path="/property/{connection_id}/guest" example="property_guest" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePropertyGuestRequest;
import to.unified.unified_java_sdk.models.operations.CreatePropertyGuestResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePropertyGuestRequest req = CreatePropertyGuestRequest.builder()
                .propertyGuest(PropertyGuest.builder()
                    .address(PropertyPropertyGuestAddress.builder()
                        .address1("874 Rice Trafficway")
                        .city("East Dollyside")
                        .country("Cameroon")
                        .countryCode("MX")
                        .postalCode("51113-4329")
                        .region("Missouri")
                        .build())
                    .companyName("Kertzmann, Bednar and Bashirian")
                    .createdAt(OffsetDateTime.parse("2021-10-17T05:59:05.070Z"))
                    .emails(List.of(
                        PropertyEmail.builder()
                            .email("melissa.green@icloud.com")
                            .type(PropertyEmailType.HOME)
                            .build()))
                    .firstName("Melissa")
                    .id("229617b9-b966-4171-8db7-5e90ea9e70b6")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/male/512/36.jpg")
                    .language("es")
                    .lastName("Green")
                    .metadata(List.of())
                    .name("Melissa Green")
                    .nationality("SI")
                    .notes("Minus incidunt corporis.")
                    .telephones(List.of(
                        PropertyTelephone.builder()
                            .telephone("+14564841285")
                            .type(PropertyTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2025-07-04T05:03:07.300Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreatePropertyGuestResponse res = sdk.property().createPropertyGuest()
                .request(req)
                .call();

        if (res.propertyGuest().isPresent()) {
            System.out.println(res.propertyGuest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreatePropertyGuestRequest](../../models/operations/CreatePropertyGuestRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreatePropertyGuestResponse](../../models/operations/CreatePropertyGuestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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
                    .id("ebd332d8-04d1-433a-ab87-94c38f640d1f")
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
                    .updatedAt(OffsetDateTime.parse("2026-09-07T17:49:14.384Z"))
                    .webUrl("https://tight-pronoun.info/")
                    .build())
                .connectionId("<id>")
                .build();

        CreatePropertyListingResponse res = sdk.property().createPropertyListing()
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

## createPropertyQuote

Creates a PropertyQuote. Provide the unified PropertyQuote fields in the request body; they are mapped to the provider's API. Returns the created PropertyQuote.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPropertyQuote" method="post" path="/property/{connection_id}/quote" example="property_quote" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePropertyQuoteRequest;
import to.unified.unified_java_sdk.models.operations.CreatePropertyQuoteResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePropertyQuoteRequest req = CreatePropertyQuoteRequest.builder()
                .propertyQuote(PropertyQuote.builder()
                    .adults(1d)
                    .children(1d)
                    .createdAt(OffsetDateTime.parse("2020-12-18T19:14:11.415Z"))
                    .currency("USD")
                    .depositAmount(594.54)
                    .endAt(OffsetDateTime.parse("2026-11-14"))
                    .guests(2d)
                    .id("e3c53161-4ebd-4ed1-a30f-76e21be47747")
                    .lineItems(List.of(
                        PropertyLineitem.builder()
                            .amount(1665d)
                            .description("9 nights")
                            .isMandatory(true)
                            .name("Accommodation")
                            .type(PropertyLineitemType.BASE)
                            .build(),
                        PropertyLineitem.builder()
                            .amount(117d)
                            .isMandatory(true)
                            .name("Cleaning fee")
                            .type(PropertyLineitemType.FEE)
                            .build(),
                        PropertyLineitem.builder()
                            .amount(199.8)
                            .isMandatory(true)
                            .name("Lodging tax")
                            .type(PropertyLineitemType.TAX)
                            .build()))
                    .startAt(OffsetDateTime.parse("2026-11-05"))
                    .totalAmount(1981.8)
                    .build())
                .connectionId("<id>")
                .build();

        CreatePropertyQuoteResponse res = sdk.property().createPropertyQuote()
                .request(req)
                .call();

        if (res.propertyQuote().isPresent()) {
            System.out.println(res.propertyQuote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreatePropertyQuoteRequest](../../models/operations/CreatePropertyQuoteRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreatePropertyQuoteResponse](../../models/operations/CreatePropertyQuoteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createPropertyReservation

Creates a PropertyReservation. Provide the unified PropertyReservation fields in the request body; they are mapped to the provider's API. Returns the created PropertyReservation.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPropertyReservation" method="post" path="/property/{connection_id}/reservation" example="property_reservation" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePropertyReservationRequest;
import to.unified.unified_java_sdk.models.operations.CreatePropertyReservationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePropertyReservationRequest req = CreatePropertyReservationRequest.builder()
                .propertyReservation(PropertyReservation.builder()
                    .adults(4d)
                    .balanceAmount(2181.6)
                    .children(2d)
                    .confirmationCode("GNLTDDQ88Z")
                    .createdAt(OffsetDateTime.parse("2022-06-03T01:40:03.655Z"))
                    .currency("USD")
                    .endAt(OffsetDateTime.parse("2022-10-06T17:17:08.838Z"))
                    .estimatedDepartureTime("10:00")
                    .guestEmail("anya.parisian@hotmail.com")
                    .guestName("Anya Parisian")
                    .guests(6d)
                    .id("b2db7ece-5be9-4081-8191-4d6fdefc3ab0")
                    .lineItems(List.of(
                        PropertyLineitem.builder()
                            .amount(1980d)
                            .description("11 nights")
                            .isMandatory(true)
                            .name("Accommodation")
                            .type(PropertyLineitemType.BASE)
                            .build(),
                        PropertyLineitem.builder()
                            .amount(162d)
                            .isMandatory(true)
                            .name("Cleaning fee")
                            .type(PropertyLineitemType.FEE)
                            .build(),
                        PropertyLineitem.builder()
                            .amount(237.6)
                            .isMandatory(true)
                            .name("Lodging tax")
                            .type(PropertyLineitemType.TAX)
                            .build(),
                        PropertyLineitem.builder()
                            .amount(-198d)
                            .isMandatory(false)
                            .name("Weekly discount")
                            .type(PropertyLineitemType.DISCOUNT)
                            .build()))
                    .metadata(List.of())
                    .nights(11d)
                    .notes("Conculco volaticus vis volva quas trepide vae earum temptatio tertius.")
                    .paidAmount(0d)
                    .pets(1d)
                    .source("Vrbo")
                    .startAt(OffsetDateTime.parse("2022-09-25T17:17:08.838Z"))
                    .status(PropertyReservationStatus.PENDING)
                    .totalAmount(2181.6)
                    .updatedAt(OffsetDateTime.parse("2022-11-16T12:57:41.946Z"))
                    .webUrl("https://antique-tennis.biz/")
                    .build())
                .connectionId("<id>")
                .build();

        CreatePropertyReservationResponse res = sdk.property().createPropertyReservation()
                .request(req)
                .call();

        if (res.propertyReservation().isPresent()) {
            System.out.println(res.propertyReservation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [CreatePropertyReservationRequest](../../models/operations/CreatePropertyReservationRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[CreatePropertyReservationResponse](../../models/operations/CreatePropertyReservationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAnalyticsProperty

Retrieves a single AnalyticsProperty by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAnalyticsProperty" method="get" path="/analytics/{connection_id}/property/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsPropertyRequest;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsPropertyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAnalyticsPropertyRequest req = GetAnalyticsPropertyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAnalyticsPropertyResponse res = sdk.property().getAnalyticsProperty()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAnalyticsPropertyRequest](../../models/operations/GetAnalyticsPropertyRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAnalyticsPropertyResponse](../../models/operations/GetAnalyticsPropertyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPropertyConversation

Retrieves a single PropertyConversation by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPropertyConversation" method="get" path="/property/{connection_id}/conversation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPropertyConversationRequest;
import to.unified.unified_java_sdk.models.operations.GetPropertyConversationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPropertyConversationRequest req = GetPropertyConversationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPropertyConversationResponse res = sdk.property().getPropertyConversation()
                .request(req)
                .call();

        if (res.propertyConversation().isPresent()) {
            System.out.println(res.propertyConversation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetPropertyConversationRequest](../../models/operations/GetPropertyConversationRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetPropertyConversationResponse](../../models/operations/GetPropertyConversationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPropertyGuest

Retrieves a single PropertyGuest by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPropertyGuest" method="get" path="/property/{connection_id}/guest/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPropertyGuestRequest;
import to.unified.unified_java_sdk.models.operations.GetPropertyGuestResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPropertyGuestRequest req = GetPropertyGuestRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPropertyGuestResponse res = sdk.property().getPropertyGuest()
                .request(req)
                .call();

        if (res.propertyGuest().isPresent()) {
            System.out.println(res.propertyGuest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetPropertyGuestRequest](../../models/operations/GetPropertyGuestRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetPropertyGuestResponse](../../models/operations/GetPropertyGuestResponse.md)**

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

        GetPropertyListingResponse res = sdk.property().getPropertyListing()
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

## getPropertyReservation

Retrieves a single PropertyReservation by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPropertyReservation" method="get" path="/property/{connection_id}/reservation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPropertyReservationRequest;
import to.unified.unified_java_sdk.models.operations.GetPropertyReservationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPropertyReservationRequest req = GetPropertyReservationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPropertyReservationResponse res = sdk.property().getPropertyReservation()
                .request(req)
                .call();

        if (res.propertyReservation().isPresent()) {
            System.out.println(res.propertyReservation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetPropertyReservationRequest](../../models/operations/GetPropertyReservationRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetPropertyReservationResponse](../../models/operations/GetPropertyReservationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPropertyReview

Retrieves a single PropertyReview by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPropertyReview" method="get" path="/property/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPropertyReviewRequest;
import to.unified.unified_java_sdk.models.operations.GetPropertyReviewResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPropertyReviewRequest req = GetPropertyReviewRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPropertyReviewResponse res = sdk.property().getPropertyReview()
                .request(req)
                .call();

        if (res.propertyReview().isPresent()) {
            System.out.println(res.propertyReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetPropertyReviewRequest](../../models/operations/GetPropertyReviewRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetPropertyReviewResponse](../../models/operations/GetPropertyReviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPropertyUnittype

Retrieves a single PropertyUnittype by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPropertyUnittype" method="get" path="/property/{connection_id}/unittype/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPropertyUnittypeRequest;
import to.unified.unified_java_sdk.models.operations.GetPropertyUnittypeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPropertyUnittypeRequest req = GetPropertyUnittypeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPropertyUnittypeResponse res = sdk.property().getPropertyUnittype()
                .request(req)
                .call();

        if (res.propertyUnittype().isPresent()) {
            System.out.println(res.propertyUnittype().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetPropertyUnittypeRequest](../../models/operations/GetPropertyUnittypeRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetPropertyUnittypeResponse](../../models/operations/GetPropertyUnittypeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAnalyticsProperties

Returns a list of AnalyticsProperties. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAnalyticsProperties" method="get" path="/analytics/{connection_id}/property" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsPropertiesRequest;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsPropertiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAnalyticsPropertiesRequest req = ListAnalyticsPropertiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAnalyticsPropertiesResponse res = sdk.property().listAnalyticsProperties()
                .request(req)
                .call();

        if (res.analyticsProperties().isPresent()) {
            System.out.println(res.analyticsProperties().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListAnalyticsPropertiesRequest](../../models/operations/ListAnalyticsPropertiesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListAnalyticsPropertiesResponse](../../models/operations/ListAnalyticsPropertiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPropertyAvailabilities

Returns a list of PropertyAvailabilities. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPropertyAvailabilities" method="get" path="/property/{connection_id}/availability" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPropertyAvailabilitiesRequest;
import to.unified.unified_java_sdk.models.operations.ListPropertyAvailabilitiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPropertyAvailabilitiesRequest req = ListPropertyAvailabilitiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListPropertyAvailabilitiesResponse res = sdk.property().listPropertyAvailabilities()
                .request(req)
                .call();

        if (res.propertyAvailabilities().isPresent()) {
            System.out.println(res.propertyAvailabilities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListPropertyAvailabilitiesRequest](../../models/operations/ListPropertyAvailabilitiesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListPropertyAvailabilitiesResponse](../../models/operations/ListPropertyAvailabilitiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPropertyConversations

Returns a list of PropertyConversations. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPropertyConversations" method="get" path="/property/{connection_id}/conversation" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPropertyConversationsRequest;
import to.unified.unified_java_sdk.models.operations.ListPropertyConversationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPropertyConversationsRequest req = ListPropertyConversationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPropertyConversationsResponse res = sdk.property().listPropertyConversations()
                .request(req)
                .call();

        if (res.propertyConversations().isPresent()) {
            System.out.println(res.propertyConversations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListPropertyConversationsRequest](../../models/operations/ListPropertyConversationsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListPropertyConversationsResponse](../../models/operations/ListPropertyConversationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPropertyGuests

Returns a list of PropertyGuests. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPropertyGuests" method="get" path="/property/{connection_id}/guest" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPropertyGuestsRequest;
import to.unified.unified_java_sdk.models.operations.ListPropertyGuestsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPropertyGuestsRequest req = ListPropertyGuestsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPropertyGuestsResponse res = sdk.property().listPropertyGuests()
                .request(req)
                .call();

        if (res.propertyGuests().isPresent()) {
            System.out.println(res.propertyGuests().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListPropertyGuestsRequest](../../models/operations/ListPropertyGuestsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListPropertyGuestsResponse](../../models/operations/ListPropertyGuestsResponse.md)**

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

        ListPropertyListingsResponse res = sdk.property().listPropertyListings()
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

## listPropertyReservations

Returns a list of PropertyReservations. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPropertyReservations" method="get" path="/property/{connection_id}/reservation" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPropertyReservationsRequest;
import to.unified.unified_java_sdk.models.operations.ListPropertyReservationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPropertyReservationsRequest req = ListPropertyReservationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPropertyReservationsResponse res = sdk.property().listPropertyReservations()
                .request(req)
                .call();

        if (res.propertyReservations().isPresent()) {
            System.out.println(res.propertyReservations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListPropertyReservationsRequest](../../models/operations/ListPropertyReservationsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListPropertyReservationsResponse](../../models/operations/ListPropertyReservationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPropertyReviews

Returns a list of PropertyReviews. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPropertyReviews" method="get" path="/property/{connection_id}/review" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPropertyReviewsRequest;
import to.unified.unified_java_sdk.models.operations.ListPropertyReviewsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPropertyReviewsRequest req = ListPropertyReviewsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPropertyReviewsResponse res = sdk.property().listPropertyReviews()
                .request(req)
                .call();

        if (res.propertyReviews().isPresent()) {
            System.out.println(res.propertyReviews().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListPropertyReviewsRequest](../../models/operations/ListPropertyReviewsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListPropertyReviewsResponse](../../models/operations/ListPropertyReviewsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPropertyUnittypes

Returns a list of PropertyUnittypes. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPropertyUnittypes" method="get" path="/property/{connection_id}/unittype" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPropertyUnittypesRequest;
import to.unified.unified_java_sdk.models.operations.ListPropertyUnittypesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPropertyUnittypesRequest req = ListPropertyUnittypesRequest.builder()
                .connectionId("<id>")
                .build();

        ListPropertyUnittypesResponse res = sdk.property().listPropertyUnittypes()
                .request(req)
                .call();

        if (res.propertyUnittypes().isPresent()) {
            System.out.println(res.propertyUnittypes().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListPropertyUnittypesRequest](../../models/operations/ListPropertyUnittypesRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListPropertyUnittypesResponse](../../models/operations/ListPropertyUnittypesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAnalyticsProperty

Updates the AnalyticsProperty identified by `id`. Provide the unified AnalyticsProperty fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAnalyticsProperty" method="patch" path="/analytics/{connection_id}/property/{id}" example="analytics_property" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsPropertyRequest;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsPropertyResponse;
import to.unified.unified_java_sdk.models.shared.AnalyticsProperty;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAnalyticsPropertyRequest req = PatchAnalyticsPropertyRequest.builder()
                .analyticsProperty(AnalyticsProperty.builder()
                    .createdAt(OffsetDateTime.parse("2021-09-05T19:04:58.430Z"))
                    .currency("USD")
                    .id("f6fd283f-e51c-445e-b98b-81464977e5d8")
                    .name("Daniel, Goldner and Dickinson")
                    .timezone("UTC")
                    .updatedAt(OffsetDateTime.parse("2021-09-14T21:35:18.344Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAnalyticsPropertyResponse res = sdk.property().patchAnalyticsProperty()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAnalyticsPropertyRequest](../../models/operations/PatchAnalyticsPropertyRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAnalyticsPropertyResponse](../../models/operations/PatchAnalyticsPropertyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPropertyGuest

Updates the PropertyGuest identified by `id`. Provide the unified PropertyGuest fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPropertyGuest" method="patch" path="/property/{connection_id}/guest/{id}" example="property_guest" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPropertyGuestRequest;
import to.unified.unified_java_sdk.models.operations.PatchPropertyGuestResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPropertyGuestRequest req = PatchPropertyGuestRequest.builder()
                .propertyGuest(PropertyGuest.builder()
                    .address(PropertyPropertyGuestAddress.builder()
                        .address1("874 Rice Trafficway")
                        .city("East Dollyside")
                        .country("Cameroon")
                        .countryCode("MX")
                        .postalCode("51113-4329")
                        .region("Missouri")
                        .build())
                    .companyName("Kertzmann, Bednar and Bashirian")
                    .createdAt(OffsetDateTime.parse("2021-10-17T05:59:05.070Z"))
                    .emails(List.of(
                        PropertyEmail.builder()
                            .email("melissa.green@icloud.com")
                            .type(PropertyEmailType.HOME)
                            .build()))
                    .firstName("Melissa")
                    .id("c69227dc-f51b-4503-9c39-afbd92f745fd")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/male/512/36.jpg")
                    .language("es")
                    .lastName("Green")
                    .metadata(List.of())
                    .name("Melissa Green")
                    .nationality("SI")
                    .notes("Minus incidunt corporis.")
                    .telephones(List.of(
                        PropertyTelephone.builder()
                            .telephone("+14564841285")
                            .type(PropertyTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2025-07-04T05:03:07.313Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPropertyGuestResponse res = sdk.property().patchPropertyGuest()
                .request(req)
                .call();

        if (res.propertyGuest().isPresent()) {
            System.out.println(res.propertyGuest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchPropertyGuestRequest](../../models/operations/PatchPropertyGuestRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchPropertyGuestResponse](../../models/operations/PatchPropertyGuestResponse.md)**

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
                    .id("87855155-d431-4cfb-a06f-86aed6e79d49")
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
                    .updatedAt(OffsetDateTime.parse("2026-09-07T17:49:14.408Z"))
                    .webUrl("https://tight-pronoun.info/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPropertyListingResponse res = sdk.property().patchPropertyListing()
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

## patchPropertyReservation

Updates the PropertyReservation identified by `id`. Provide the unified PropertyReservation fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPropertyReservation" method="patch" path="/property/{connection_id}/reservation/{id}" example="property_reservation" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPropertyReservationRequest;
import to.unified.unified_java_sdk.models.operations.PatchPropertyReservationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPropertyReservationRequest req = PatchPropertyReservationRequest.builder()
                .propertyReservation(PropertyReservation.builder()
                    .adults(4d)
                    .balanceAmount(2181.6)
                    .children(2d)
                    .confirmationCode("GNLTDDQ88Z")
                    .createdAt(OffsetDateTime.parse("2022-06-03T01:40:03.655Z"))
                    .currency("USD")
                    .endAt(OffsetDateTime.parse("2022-10-06T17:17:08.838Z"))
                    .estimatedDepartureTime("10:00")
                    .guestEmail("anya.parisian@hotmail.com")
                    .guestName("Anya Parisian")
                    .guests(6d)
                    .id("2137cd54-c758-4915-8979-b6cf6f28f4c2")
                    .lineItems(List.of(
                        PropertyLineitem.builder()
                            .amount(1980d)
                            .description("11 nights")
                            .isMandatory(true)
                            .name("Accommodation")
                            .type(PropertyLineitemType.BASE)
                            .build(),
                        PropertyLineitem.builder()
                            .amount(162d)
                            .isMandatory(true)
                            .name("Cleaning fee")
                            .type(PropertyLineitemType.FEE)
                            .build(),
                        PropertyLineitem.builder()
                            .amount(237.6)
                            .isMandatory(true)
                            .name("Lodging tax")
                            .type(PropertyLineitemType.TAX)
                            .build(),
                        PropertyLineitem.builder()
                            .amount(-198d)
                            .isMandatory(false)
                            .name("Weekly discount")
                            .type(PropertyLineitemType.DISCOUNT)
                            .build()))
                    .metadata(List.of())
                    .nights(11d)
                    .notes("Conculco volaticus vis volva quas trepide vae earum temptatio tertius.")
                    .paidAmount(0d)
                    .pets(1d)
                    .source("Vrbo")
                    .startAt(OffsetDateTime.parse("2022-09-25T17:17:08.838Z"))
                    .status(PropertyReservationStatus.PENDING)
                    .totalAmount(2181.6)
                    .updatedAt(OffsetDateTime.parse("2022-11-16T12:57:41.949Z"))
                    .webUrl("https://antique-tennis.biz/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPropertyReservationResponse res = sdk.property().patchPropertyReservation()
                .request(req)
                .call();

        if (res.propertyReservation().isPresent()) {
            System.out.println(res.propertyReservation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [PatchPropertyReservationRequest](../../models/operations/PatchPropertyReservationRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[PatchPropertyReservationResponse](../../models/operations/PatchPropertyReservationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPropertyReview

Updates the PropertyReview identified by `id`. Provide the unified PropertyReview fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPropertyReview" method="patch" path="/property/{connection_id}/review/{id}" example="property_review" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPropertyReviewRequest;
import to.unified.unified_java_sdk.models.operations.PatchPropertyReviewResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPropertyReviewRequest req = PatchPropertyReviewRequest.builder()
                .propertyReview(PropertyReview.builder()
                    .authorName("Benton Jast")
                    .categoryRatings(List.of(
                        PropertyCategoryrating.builder()
                            .category(PropertyCategoryratingCategory.CLEANLINESS)
                            .comment("Umquam perferendis amitto voluptas sum blanditiis terreo.")
                            .rating(5d)
                            .build(),
                        PropertyCategoryrating.builder()
                            .category(PropertyCategoryratingCategory.ACCURACY)
                            .comment("Capitulus dolorem verus.")
                            .rating(4d)
                            .build(),
                        PropertyCategoryrating.builder()
                            .category(PropertyCategoryratingCategory.COMMUNICATION)
                            .rating(1d)
                            .build(),
                        PropertyCategoryrating.builder()
                            .category(PropertyCategoryratingCategory.CHECKIN)
                            .rating(1d)
                            .build(),
                        PropertyCategoryrating.builder()
                            .category(PropertyCategoryratingCategory.LOCATION)
                            .rating(2d)
                            .build(),
                        PropertyCategoryrating.builder()
                            .category(PropertyCategoryratingCategory.VALUE)
                            .comment("Quos constans aperte tero sollers.")
                            .rating(5d)
                            .build()))
                    .content("Delectus conscendo communis custodia statim. Tutis adsuesco attonbitus comitatus auditor ea tergo nostrum deleo. Comprehendo tertius summopere vaco apparatus incidunt tabula pauci confido colo.")
                    .createdAt(OffsetDateTime.parse("2022-10-17T11:17:07.682Z"))
                    .id("97517f4a-4f45-48d4-a0e4-b7cc05a67731")
                    .isPublic(true)
                    .metadata(List.of())
                    .privateFeedback("Tripudio neque communis.")
                    .rating(3d)
                    .source("Airbnb")
                    .updatedAt(OffsetDateTime.parse("2026-02-19T02:57:26.081Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPropertyReviewResponse res = sdk.property().patchPropertyReview()
                .request(req)
                .call();

        if (res.propertyReview().isPresent()) {
            System.out.println(res.propertyReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchPropertyReviewRequest](../../models/operations/PatchPropertyReviewRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchPropertyReviewResponse](../../models/operations/PatchPropertyReviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAnalyticsProperty

Deletes the AnalyticsProperty identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAnalyticsProperty" method="delete" path="/analytics/{connection_id}/property/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAnalyticsPropertyRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAnalyticsPropertyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAnalyticsPropertyRequest req = RemoveAnalyticsPropertyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAnalyticsPropertyResponse res = sdk.property().removeAnalyticsProperty()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAnalyticsPropertyRequest](../../models/operations/RemoveAnalyticsPropertyRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAnalyticsPropertyResponse](../../models/operations/RemoveAnalyticsPropertyResponse.md)**

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

        RemovePropertyListingResponse res = sdk.property().removePropertyListing()
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

## updateAnalyticsProperty

Updates the AnalyticsProperty identified by `id`. Provide the unified AnalyticsProperty fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAnalyticsProperty" method="put" path="/analytics/{connection_id}/property/{id}" example="analytics_property" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsPropertyRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsPropertyResponse;
import to.unified.unified_java_sdk.models.shared.AnalyticsProperty;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAnalyticsPropertyRequest req = UpdateAnalyticsPropertyRequest.builder()
                .analyticsProperty(AnalyticsProperty.builder()
                    .createdAt(OffsetDateTime.parse("2021-09-05T19:04:58.430Z"))
                    .currency("USD")
                    .id("f6fd283f-e51c-445e-b98b-81464977e5d8")
                    .name("Daniel, Goldner and Dickinson")
                    .timezone("UTC")
                    .updatedAt(OffsetDateTime.parse("2021-09-14T21:35:18.344Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAnalyticsPropertyResponse res = sdk.property().updateAnalyticsProperty()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAnalyticsPropertyRequest](../../models/operations/UpdateAnalyticsPropertyRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAnalyticsPropertyResponse](../../models/operations/UpdateAnalyticsPropertyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePropertyGuest

Updates the PropertyGuest identified by `id`. Provide the unified PropertyGuest fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePropertyGuest" method="put" path="/property/{connection_id}/guest/{id}" example="property_guest" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePropertyGuestRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePropertyGuestResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePropertyGuestRequest req = UpdatePropertyGuestRequest.builder()
                .propertyGuest(PropertyGuest.builder()
                    .address(PropertyPropertyGuestAddress.builder()
                        .address1("874 Rice Trafficway")
                        .city("East Dollyside")
                        .country("Cameroon")
                        .countryCode("MX")
                        .postalCode("51113-4329")
                        .region("Missouri")
                        .build())
                    .companyName("Kertzmann, Bednar and Bashirian")
                    .createdAt(OffsetDateTime.parse("2021-10-17T05:59:05.070Z"))
                    .emails(List.of(
                        PropertyEmail.builder()
                            .email("melissa.green@icloud.com")
                            .type(PropertyEmailType.HOME)
                            .build()))
                    .firstName("Melissa")
                    .id("c69227dc-f51b-4503-9c39-afbd92f745fd")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/male/512/36.jpg")
                    .language("es")
                    .lastName("Green")
                    .metadata(List.of())
                    .name("Melissa Green")
                    .nationality("SI")
                    .notes("Minus incidunt corporis.")
                    .telephones(List.of(
                        PropertyTelephone.builder()
                            .telephone("+14564841285")
                            .type(PropertyTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2025-07-04T05:03:07.313Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePropertyGuestResponse res = sdk.property().updatePropertyGuest()
                .request(req)
                .call();

        if (res.propertyGuest().isPresent()) {
            System.out.println(res.propertyGuest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdatePropertyGuestRequest](../../models/operations/UpdatePropertyGuestRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdatePropertyGuestResponse](../../models/operations/UpdatePropertyGuestResponse.md)**

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
                    .id("87855155-d431-4cfb-a06f-86aed6e79d49")
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
                    .updatedAt(OffsetDateTime.parse("2026-09-07T17:49:14.408Z"))
                    .webUrl("https://tight-pronoun.info/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePropertyListingResponse res = sdk.property().updatePropertyListing()
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

## updatePropertyReservation

Updates the PropertyReservation identified by `id`. Provide the unified PropertyReservation fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePropertyReservation" method="put" path="/property/{connection_id}/reservation/{id}" example="property_reservation" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePropertyReservationRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePropertyReservationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePropertyReservationRequest req = UpdatePropertyReservationRequest.builder()
                .propertyReservation(PropertyReservation.builder()
                    .adults(4d)
                    .balanceAmount(2181.6)
                    .children(2d)
                    .confirmationCode("GNLTDDQ88Z")
                    .createdAt(OffsetDateTime.parse("2022-06-03T01:40:03.655Z"))
                    .currency("USD")
                    .endAt(OffsetDateTime.parse("2022-10-06T17:17:08.838Z"))
                    .estimatedDepartureTime("10:00")
                    .guestEmail("anya.parisian@hotmail.com")
                    .guestName("Anya Parisian")
                    .guests(6d)
                    .id("2137cd54-c758-4915-8979-b6cf6f28f4c2")
                    .lineItems(List.of(
                        PropertyLineitem.builder()
                            .amount(1980d)
                            .description("11 nights")
                            .isMandatory(true)
                            .name("Accommodation")
                            .type(PropertyLineitemType.BASE)
                            .build(),
                        PropertyLineitem.builder()
                            .amount(162d)
                            .isMandatory(true)
                            .name("Cleaning fee")
                            .type(PropertyLineitemType.FEE)
                            .build(),
                        PropertyLineitem.builder()
                            .amount(237.6)
                            .isMandatory(true)
                            .name("Lodging tax")
                            .type(PropertyLineitemType.TAX)
                            .build(),
                        PropertyLineitem.builder()
                            .amount(-198d)
                            .isMandatory(false)
                            .name("Weekly discount")
                            .type(PropertyLineitemType.DISCOUNT)
                            .build()))
                    .metadata(List.of())
                    .nights(11d)
                    .notes("Conculco volaticus vis volva quas trepide vae earum temptatio tertius.")
                    .paidAmount(0d)
                    .pets(1d)
                    .source("Vrbo")
                    .startAt(OffsetDateTime.parse("2022-09-25T17:17:08.838Z"))
                    .status(PropertyReservationStatus.PENDING)
                    .totalAmount(2181.6)
                    .updatedAt(OffsetDateTime.parse("2022-11-16T12:57:41.949Z"))
                    .webUrl("https://antique-tennis.biz/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePropertyReservationResponse res = sdk.property().updatePropertyReservation()
                .request(req)
                .call();

        if (res.propertyReservation().isPresent()) {
            System.out.println(res.propertyReservation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [UpdatePropertyReservationRequest](../../models/operations/UpdatePropertyReservationRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[UpdatePropertyReservationResponse](../../models/operations/UpdatePropertyReservationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePropertyReview

Updates the PropertyReview identified by `id`. Provide the unified PropertyReview fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePropertyReview" method="put" path="/property/{connection_id}/review/{id}" example="property_review" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePropertyReviewRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePropertyReviewResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePropertyReviewRequest req = UpdatePropertyReviewRequest.builder()
                .propertyReview(PropertyReview.builder()
                    .authorName("Benton Jast")
                    .categoryRatings(List.of(
                        PropertyCategoryrating.builder()
                            .category(PropertyCategoryratingCategory.CLEANLINESS)
                            .comment("Umquam perferendis amitto voluptas sum blanditiis terreo.")
                            .rating(5d)
                            .build(),
                        PropertyCategoryrating.builder()
                            .category(PropertyCategoryratingCategory.ACCURACY)
                            .comment("Capitulus dolorem verus.")
                            .rating(4d)
                            .build(),
                        PropertyCategoryrating.builder()
                            .category(PropertyCategoryratingCategory.COMMUNICATION)
                            .rating(1d)
                            .build(),
                        PropertyCategoryrating.builder()
                            .category(PropertyCategoryratingCategory.CHECKIN)
                            .rating(1d)
                            .build(),
                        PropertyCategoryrating.builder()
                            .category(PropertyCategoryratingCategory.LOCATION)
                            .rating(2d)
                            .build(),
                        PropertyCategoryrating.builder()
                            .category(PropertyCategoryratingCategory.VALUE)
                            .comment("Quos constans aperte tero sollers.")
                            .rating(5d)
                            .build()))
                    .content("Delectus conscendo communis custodia statim. Tutis adsuesco attonbitus comitatus auditor ea tergo nostrum deleo. Comprehendo tertius summopere vaco apparatus incidunt tabula pauci confido colo.")
                    .createdAt(OffsetDateTime.parse("2022-10-17T11:17:07.682Z"))
                    .id("97517f4a-4f45-48d4-a0e4-b7cc05a67731")
                    .isPublic(true)
                    .metadata(List.of())
                    .privateFeedback("Tripudio neque communis.")
                    .rating(3d)
                    .source("Airbnb")
                    .updatedAt(OffsetDateTime.parse("2026-02-19T02:57:26.081Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePropertyReviewResponse res = sdk.property().updatePropertyReview()
                .request(req)
                .call();

        if (res.propertyReview().isPresent()) {
            System.out.println(res.propertyReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdatePropertyReviewRequest](../../models/operations/UpdatePropertyReviewRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdatePropertyReviewResponse](../../models/operations/UpdatePropertyReviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |