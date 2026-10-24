# Location

## Overview

### Available Operations

* [createCommerceLocation](#createcommercelocation) - Create a location
* [createHrisLocation](#createhrislocation) - Create a location
* [getClubsLocation](#getclubslocation) - Retrieve a location
* [getCommerceLocation](#getcommercelocation) - Retrieve a location
* [getHealthcareLocation](#gethealthcarelocation) - Retrieve a location
* [getHrisLocation](#gethrislocation) - Retrieve a location
* [listClubsLocations](#listclubslocations) - List all locations
* [listCommerceLocations](#listcommercelocations) - List all locations
* [listHealthcareLocations](#listhealthcarelocations) - List all locations
* [listHrisLocations](#listhrislocations) - List all locations
* [patchCommerceLocation](#patchcommercelocation) - Update a location
* [patchHrisLocation](#patchhrislocation) - Update a location
* [removeCommerceLocation](#removecommercelocation) - Remove a location
* [removeHrisLocation](#removehrislocation) - Remove a location
* [updateCommerceLocation](#updatecommercelocation) - Update a location
* [updateHrisLocation](#updatehrislocation) - Update a location

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
                    .id("def5f02b-4d20-47ec-9f7d-627cc270fd94")
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
                            .id("8dbbcf1e-de47-4a62-9e16-b96163689222")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("fe1de34d-f490-4b6c-81b6-1bccbe10946a")
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
                    .updatedAt(OffsetDateTime.parse("2024-04-21T18:57:13.515Z"))
                    .webUrl("https://chilly-edge.info")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceLocationResponse res = sdk.location().createCommerceLocation()
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

## createHrisLocation

Creates a HrisLocation. Provide the unified HrisLocation fields in the request body; they are mapped to the provider's API. Returns the created HrisLocation.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisLocation" method="post" path="/hris/{connection_id}/location" example="hris_location" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisLocationRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisLocationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisLocationRequest req = CreateHrisLocationRequest.builder()
                .hrisLocation(HrisLocation.builder()
                    .address(PropertyHrisLocationAddress.builder()
                        .address1("4418 Daniella Mall")
                        .address2("Apt. 997")
                        .city("Burke")
                        .countryCode("US")
                        .postalCode("54109")
                        .region("Ohio")
                        .regionCode("OR")
                        .build())
                    .createdAt(OffsetDateTime.parse("2021-07-18T10:32:01.414Z"))
                    .currency("MNT")
                    .description("Commemoro acervus.")
                    .id("eea30a04-b986-42fe-afcf-68aaa2c7a16a")
                    .isActive(false)
                    .isHq(true)
                    .languageLocale("it")
                    .metadata(List.of())
                    .name("North Kimberlyland Office")
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(371) 245-0699")
                            .type(HrisTelephoneType.FAX)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(700) 845-5854")
                            .type(HrisTelephoneType.FAX)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(461) 437-3548")
                            .type(HrisTelephoneType.HOME)
                            .build()))
                    .timezone("Asia/Jerusalem")
                    .updatedAt(OffsetDateTime.parse("2023-06-22T05:04:02.357Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisLocationResponse res = sdk.location().createHrisLocation()
                .request(req)
                .call();

        if (res.hrisLocation().isPresent()) {
            System.out.println(res.hrisLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateHrisLocationRequest](../../models/operations/CreateHrisLocationRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateHrisLocationResponse](../../models/operations/CreateHrisLocationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getClubsLocation

Retrieves a single ClubsLocation by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getClubsLocation" method="get" path="/clubs/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetClubsLocationRequest;
import to.unified.unified_java_sdk.models.operations.GetClubsLocationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetClubsLocationRequest req = GetClubsLocationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetClubsLocationResponse res = sdk.location().getClubsLocation()
                .request(req)
                .call();

        if (res.clubsLocation().isPresent()) {
            System.out.println(res.clubsLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetClubsLocationRequest](../../models/operations/GetClubsLocationRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetClubsLocationResponse](../../models/operations/GetClubsLocationResponse.md)**

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

        GetCommerceLocationResponse res = sdk.location().getCommerceLocation()
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

## getHealthcareLocation

Retrieves a single HealthcareLocation by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareLocation" method="get" path="/healthcare/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareLocationRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareLocationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareLocationRequest req = GetHealthcareLocationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareLocationResponse res = sdk.location().getHealthcareLocation()
                .request(req)
                .call();

        if (res.healthcareLocation().isPresent()) {
            System.out.println(res.healthcareLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetHealthcareLocationRequest](../../models/operations/GetHealthcareLocationRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetHealthcareLocationResponse](../../models/operations/GetHealthcareLocationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisLocation

Retrieves a single HrisLocation by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisLocation" method="get" path="/hris/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisLocationRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisLocationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisLocationRequest req = GetHrisLocationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisLocationResponse res = sdk.location().getHrisLocation()
                .request(req)
                .call();

        if (res.hrisLocation().isPresent()) {
            System.out.println(res.hrisLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetHrisLocationRequest](../../models/operations/GetHrisLocationRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetHrisLocationResponse](../../models/operations/GetHrisLocationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listClubsLocations

Returns a list of ClubsLocations. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listClubsLocations" method="get" path="/clubs/{connection_id}/location" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListClubsLocationsRequest;
import to.unified.unified_java_sdk.models.operations.ListClubsLocationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListClubsLocationsRequest req = ListClubsLocationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListClubsLocationsResponse res = sdk.location().listClubsLocations()
                .request(req)
                .call();

        if (res.clubsLocations().isPresent()) {
            System.out.println(res.clubsLocations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListClubsLocationsRequest](../../models/operations/ListClubsLocationsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListClubsLocationsResponse](../../models/operations/ListClubsLocationsResponse.md)**

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

        ListCommerceLocationsResponse res = sdk.location().listCommerceLocations()
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

## listHealthcareLocations

Returns a list of HealthcareLocations. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareLocations" method="get" path="/healthcare/{connection_id}/location" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareLocationsRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareLocationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareLocationsRequest req = ListHealthcareLocationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareLocationsResponse res = sdk.location().listHealthcareLocations()
                .request(req)
                .call();

        if (res.healthcareLocations().isPresent()) {
            System.out.println(res.healthcareLocations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListHealthcareLocationsRequest](../../models/operations/ListHealthcareLocationsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListHealthcareLocationsResponse](../../models/operations/ListHealthcareLocationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisLocations

Returns a list of HrisLocations. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisLocations" method="get" path="/hris/{connection_id}/location" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisLocationsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisLocationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisLocationsRequest req = ListHrisLocationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisLocationsResponse res = sdk.location().listHrisLocations()
                .request(req)
                .call();

        if (res.hrisLocations().isPresent()) {
            System.out.println(res.hrisLocations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListHrisLocationsRequest](../../models/operations/ListHrisLocationsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListHrisLocationsResponse](../../models/operations/ListHrisLocationsResponse.md)**

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
                    .id("7bb4bb9c-090b-4543-8ad2-d06be1070fff")
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
                            .id("17f53c27-e8ed-4072-b521-93f2dc431804")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("1142ec37-2867-43b9-84c1-1ca2b981b4d5")
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
                    .updatedAt(OffsetDateTime.parse("2024-04-21T18:57:13.527Z"))
                    .webUrl("https://chilly-edge.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceLocationResponse res = sdk.location().patchCommerceLocation()
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

## patchHrisLocation

Updates the HrisLocation identified by `id`. Provide the unified HrisLocation fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisLocation" method="patch" path="/hris/{connection_id}/location/{id}" example="hris_location" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisLocationRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisLocationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisLocationRequest req = PatchHrisLocationRequest.builder()
                .hrisLocation(HrisLocation.builder()
                    .address(PropertyHrisLocationAddress.builder()
                        .address1("4418 Daniella Mall")
                        .address2("Apt. 997")
                        .city("Burke")
                        .countryCode("US")
                        .postalCode("54109")
                        .region("Ohio")
                        .regionCode("OR")
                        .build())
                    .createdAt(OffsetDateTime.parse("2021-07-18T10:32:01.414Z"))
                    .currency("MNT")
                    .description("Commemoro acervus.")
                    .id("24d544c2-b6cc-45c1-8fe3-f2036eed5e7a")
                    .isActive(false)
                    .isHq(true)
                    .languageLocale("it")
                    .metadata(List.of())
                    .name("North Kimberlyland Office")
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(371) 245-0699")
                            .type(HrisTelephoneType.FAX)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(700) 845-5854")
                            .type(HrisTelephoneType.FAX)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(461) 437-3548")
                            .type(HrisTelephoneType.HOME)
                            .build()))
                    .timezone("Asia/Jerusalem")
                    .updatedAt(OffsetDateTime.parse("2023-06-22T05:04:02.364Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisLocationResponse res = sdk.location().patchHrisLocation()
                .request(req)
                .call();

        if (res.hrisLocation().isPresent()) {
            System.out.println(res.hrisLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchHrisLocationRequest](../../models/operations/PatchHrisLocationRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchHrisLocationResponse](../../models/operations/PatchHrisLocationResponse.md)**

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

        RemoveCommerceLocationResponse res = sdk.location().removeCommerceLocation()
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

## removeHrisLocation

Deletes the HrisLocation identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisLocation" method="delete" path="/hris/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisLocationRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisLocationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisLocationRequest req = RemoveHrisLocationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisLocationResponse res = sdk.location().removeHrisLocation()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveHrisLocationRequest](../../models/operations/RemoveHrisLocationRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveHrisLocationResponse](../../models/operations/RemoveHrisLocationResponse.md)**

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
                    .id("7bb4bb9c-090b-4543-8ad2-d06be1070fff")
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
                            .id("17f53c27-e8ed-4072-b521-93f2dc431804")
                            .metadata(List.of(
                                CommerceMetadata.builder()
                                    .id("1142ec37-2867-43b9-84c1-1ca2b981b4d5")
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
                    .updatedAt(OffsetDateTime.parse("2024-04-21T18:57:13.527Z"))
                    .webUrl("https://chilly-edge.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceLocationResponse res = sdk.location().updateCommerceLocation()
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

## updateHrisLocation

Updates the HrisLocation identified by `id`. Provide the unified HrisLocation fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisLocation" method="put" path="/hris/{connection_id}/location/{id}" example="hris_location" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisLocationRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisLocationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisLocationRequest req = UpdateHrisLocationRequest.builder()
                .hrisLocation(HrisLocation.builder()
                    .address(PropertyHrisLocationAddress.builder()
                        .address1("4418 Daniella Mall")
                        .address2("Apt. 997")
                        .city("Burke")
                        .countryCode("US")
                        .postalCode("54109")
                        .region("Ohio")
                        .regionCode("OR")
                        .build())
                    .createdAt(OffsetDateTime.parse("2021-07-18T10:32:01.414Z"))
                    .currency("MNT")
                    .description("Commemoro acervus.")
                    .id("24d544c2-b6cc-45c1-8fe3-f2036eed5e7a")
                    .isActive(false)
                    .isHq(true)
                    .languageLocale("it")
                    .metadata(List.of())
                    .name("North Kimberlyland Office")
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(371) 245-0699")
                            .type(HrisTelephoneType.FAX)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(700) 845-5854")
                            .type(HrisTelephoneType.FAX)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(461) 437-3548")
                            .type(HrisTelephoneType.HOME)
                            .build()))
                    .timezone("Asia/Jerusalem")
                    .updatedAt(OffsetDateTime.parse("2023-06-22T05:04:02.364Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisLocationResponse res = sdk.location().updateHrisLocation()
                .request(req)
                .call();

        if (res.hrisLocation().isPresent()) {
            System.out.println(res.hrisLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateHrisLocationRequest](../../models/operations/UpdateHrisLocationRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateHrisLocationResponse](../../models/operations/UpdateHrisLocationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |