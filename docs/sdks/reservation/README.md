# Reservation

## Overview

### Available Operations

* [createCommerceReservation](#createcommercereservation) - Create a reservation
* [createPropertyReservation](#createpropertyreservation) - Create a reservation
* [getCommerceReservation](#getcommercereservation) - Retrieve a reservation
* [getPropertyReservation](#getpropertyreservation) - Retrieve a reservation
* [listCommerceReservations](#listcommercereservations) - List all reservations
* [listPropertyReservations](#listpropertyreservations) - List all reservations
* [patchCommerceReservation](#patchcommercereservation) - Update a reservation
* [patchPropertyReservation](#patchpropertyreservation) - Update a reservation
* [removeCommerceReservation](#removecommercereservation) - Remove a reservation
* [updateCommerceReservation](#updatecommercereservation) - Update a reservation
* [updatePropertyReservation](#updatepropertyreservation) - Update a reservation

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
                    .id("62e192e8-cdd4-48db-ae72-84e7594e7b10")
                    .metadata(List.of())
                    .notes("Adsum textilis ipsum despecto.")
                    .size(10d)
                    .startAt(OffsetDateTime.parse("2021-12-18T00:40:25.125Z"))
                    .status(CommerceReservationStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2023-01-05T19:40:52.623Z"))
                    .url("https://expensive-gift.org")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceReservationResponse res = sdk.reservation().createCommerceReservation()
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
                    .id("fd3b6b70-11dd-4fb0-a347-75ccbe1133bd")
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
                    .updatedAt(OffsetDateTime.parse("2022-11-16T10:24:26.016Z"))
                    .webUrl("https://antique-tennis.biz/")
                    .build())
                .connectionId("<id>")
                .build();

        CreatePropertyReservationResponse res = sdk.reservation().createPropertyReservation()
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

        GetCommerceReservationResponse res = sdk.reservation().getCommerceReservation()
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

        GetPropertyReservationResponse res = sdk.reservation().getPropertyReservation()
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

        ListCommerceReservationsResponse res = sdk.reservation().listCommerceReservations()
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

        ListPropertyReservationsResponse res = sdk.reservation().listPropertyReservations()
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
                    .id("743e16e6-6aee-43d2-851c-bd1793023bb8")
                    .metadata(List.of())
                    .notes("Adsum textilis ipsum despecto.")
                    .size(10d)
                    .startAt(OffsetDateTime.parse("2021-12-18T00:40:25.125Z"))
                    .status(CommerceReservationStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2023-01-05T19:40:52.627Z"))
                    .url("https://expensive-gift.org")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceReservationResponse res = sdk.reservation().patchCommerceReservation()
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
                    .id("e5a6a693-2aec-4739-90b6-edd0d7e64f7b")
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
                    .updatedAt(OffsetDateTime.parse("2022-11-16T10:24:26.019Z"))
                    .webUrl("https://antique-tennis.biz/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPropertyReservationResponse res = sdk.reservation().patchPropertyReservation()
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

        RemoveCommerceReservationResponse res = sdk.reservation().removeCommerceReservation()
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
                    .id("743e16e6-6aee-43d2-851c-bd1793023bb8")
                    .metadata(List.of())
                    .notes("Adsum textilis ipsum despecto.")
                    .size(10d)
                    .startAt(OffsetDateTime.parse("2021-12-18T00:40:25.125Z"))
                    .status(CommerceReservationStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2023-01-05T19:40:52.627Z"))
                    .url("https://expensive-gift.org")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceReservationResponse res = sdk.reservation().updateCommerceReservation()
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
                    .id("e5a6a693-2aec-4739-90b6-edd0d7e64f7b")
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
                    .updatedAt(OffsetDateTime.parse("2022-11-16T10:24:26.019Z"))
                    .webUrl("https://antique-tennis.biz/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePropertyReservationResponse res = sdk.reservation().updatePropertyReservation()
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