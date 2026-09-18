# Reservation

## Overview

### Available Operations

* [createCommerceReservation](#createcommercereservation) - Create a reservation
* [getCommerceReservation](#getcommercereservation) - Retrieve a reservation
* [listCommerceReservations](#listcommercereservations) - List all reservations
* [patchCommerceReservation](#patchcommercereservation) - Update a reservation
* [removeCommerceReservation](#removecommercereservation) - Remove a reservation
* [updateCommerceReservation](#updatecommercereservation) - Update a reservation

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
                    .id("b1514204-b55f-4d24-9c48-521dda801623")
                    .itemName("Practical Ceramic Shoes")
                    .notes("Adsum textilis ipsum despecto.")
                    .size(10d)
                    .staffName("Vickie Fahey")
                    .startAt(OffsetDateTime.parse("2021-12-18T00:40:25.125Z"))
                    .status(CommerceReservationStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2022-12-27T17:11:51.030Z"))
                    .url("https://cluttered-pine.info/")
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
                    .id("ff096c0b-9130-4e0d-ba80-e903199080ed")
                    .itemName("Practical Ceramic Shoes")
                    .notes("Adsum textilis ipsum despecto.")
                    .size(10d)
                    .staffName("Vickie Fahey")
                    .startAt(OffsetDateTime.parse("2021-12-18T00:40:25.125Z"))
                    .status(CommerceReservationStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2022-12-27T17:11:51.033Z"))
                    .url("https://cluttered-pine.info/")
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
                    .id("ff096c0b-9130-4e0d-ba80-e903199080ed")
                    .itemName("Practical Ceramic Shoes")
                    .notes("Adsum textilis ipsum despecto.")
                    .size(10d)
                    .staffName("Vickie Fahey")
                    .startAt(OffsetDateTime.parse("2021-12-18T00:40:25.125Z"))
                    .status(CommerceReservationStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2022-12-27T17:11:51.033Z"))
                    .url("https://cluttered-pine.info/")
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