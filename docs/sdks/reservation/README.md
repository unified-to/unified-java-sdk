# Reservation

## Overview

### Available Operations

* [createCommerceReservation2](#createcommercereservation2) - Create a reservation
* [getCommerceReservation2](#getcommercereservation2) - Retrieve a reservation
* [listCommerceReservations2](#listcommercereservations2) - List all reservations
* [patchCommerceReservation2](#patchcommercereservation2) - Update a reservation
* [removeCommerceReservation2](#removecommercereservation2) - Remove a reservation
* [updateCommerceReservation2](#updatecommercereservation2) - Update a reservation

## createCommerceReservation2

Create a reservation

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceReservation2" method="post" path="/commerce/{connection_id}/reservation" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceReservation2Request;
import to.unified.unified_java_sdk.models.operations.CreateCommerceReservation2Response;
import to.unified.unified_java_sdk.models.shared.CommerceReservation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceReservation2Request req = CreateCommerceReservation2Request.builder()
                .commerceReservation(CommerceReservation.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceReservation2Response res = sdk.reservation().createCommerceReservation2()
                .request(req)
                .call();

        if (res.commerceReservation().isPresent()) {
            System.out.println(res.commerceReservation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [CreateCommerceReservation2Request](../../models/operations/CreateCommerceReservation2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[CreateCommerceReservation2Response](../../models/operations/CreateCommerceReservation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceReservation2

Retrieve a reservation

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceReservation2" method="get" path="/commerce/{connection_id}/reservation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceReservation2Request;
import to.unified.unified_java_sdk.models.operations.GetCommerceReservation2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceReservation2Request req = GetCommerceReservation2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceReservation2Response res = sdk.reservation().getCommerceReservation2()
                .request(req)
                .call();

        if (res.commerceReservation().isPresent()) {
            System.out.println(res.commerceReservation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetCommerceReservation2Request](../../models/operations/GetCommerceReservation2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetCommerceReservation2Response](../../models/operations/GetCommerceReservation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceReservations2

List all reservations

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceReservations2" method="get" path="/commerce/{connection_id}/reservation" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceReservations2Request;
import to.unified.unified_java_sdk.models.operations.ListCommerceReservations2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceReservations2Request req = ListCommerceReservations2Request.builder()
                .connectionId("<id>")
                .build();

        ListCommerceReservations2Response res = sdk.reservation().listCommerceReservations2()
                .request(req)
                .call();

        if (res.commerceReservations().isPresent()) {
            System.out.println(res.commerceReservations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListCommerceReservations2Request](../../models/operations/ListCommerceReservations2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListCommerceReservations2Response](../../models/operations/ListCommerceReservations2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceReservation2

Update a reservation

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceReservation2" method="patch" path="/commerce/{connection_id}/reservation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceReservation2Request;
import to.unified.unified_java_sdk.models.operations.PatchCommerceReservation2Response;
import to.unified.unified_java_sdk.models.shared.CommerceReservation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceReservation2Request req = PatchCommerceReservation2Request.builder()
                .commerceReservation(CommerceReservation.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceReservation2Response res = sdk.reservation().patchCommerceReservation2()
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
| `request`                                                                                       | [PatchCommerceReservation2Request](../../models/operations/PatchCommerceReservation2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[PatchCommerceReservation2Response](../../models/operations/PatchCommerceReservation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceReservation2

Remove a reservation

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceReservation2" method="delete" path="/commerce/{connection_id}/reservation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceReservation2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceReservation2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceReservation2Request req = RemoveCommerceReservation2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceReservation2Response res = sdk.reservation().removeCommerceReservation2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [RemoveCommerceReservation2Request](../../models/operations/RemoveCommerceReservation2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[RemoveCommerceReservation2Response](../../models/operations/RemoveCommerceReservation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceReservation2

Update a reservation

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceReservation2" method="put" path="/commerce/{connection_id}/reservation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceReservation2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceReservation2Response;
import to.unified.unified_java_sdk.models.shared.CommerceReservation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceReservation2Request req = UpdateCommerceReservation2Request.builder()
                .commerceReservation(CommerceReservation.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceReservation2Response res = sdk.reservation().updateCommerceReservation2()
                .request(req)
                .call();

        if (res.commerceReservation().isPresent()) {
            System.out.println(res.commerceReservation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [UpdateCommerceReservation2Request](../../models/operations/UpdateCommerceReservation2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[UpdateCommerceReservation2Response](../../models/operations/UpdateCommerceReservation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |