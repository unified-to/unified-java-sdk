# Commerce

## Overview

### Available Operations

* [createCommerceCollection2](#createcommercecollection2) - Create a collection
* [createCommerceInventory2](#createcommerceinventory2) - Create an inventory
* [createCommerceItem2](#createcommerceitem2) - Create an item
* [createCommerceItemvariant2](#createcommerceitemvariant2) - Create an itemvariant
* [createCommerceLocation2](#createcommercelocation2) - Create a location
* [createCommerceReservation2](#createcommercereservation2) - Create a reservation
* [createCommerceReview2](#createcommercereview2) - Create a review
* [createCommerceSaleschannel2](#createcommercesaleschannel2) - Create a saleschannel
* [getCommerceCollection2](#getcommercecollection2) - Retrieve a collection
* [getCommerceInventory2](#getcommerceinventory2) - Retrieve an inventory
* [getCommerceItem2](#getcommerceitem2) - Retrieve an item
* [getCommerceItemvariant2](#getcommerceitemvariant2) - Retrieve an itemvariant
* [getCommerceLocation2](#getcommercelocation2) - Retrieve a location
* [getCommerceReservation2](#getcommercereservation2) - Retrieve a reservation
* [getCommerceReview2](#getcommercereview2) - Retrieve a review
* [getCommerceSaleschannel2](#getcommercesaleschannel2) - Retrieve a saleschannel
* [listCommerceAvailabilities2](#listcommerceavailabilities2) - List all availabilities
* [listCommerceCollections2](#listcommercecollections2) - List all collections
* [listCommerceInventories2](#listcommerceinventories2) - List all inventories
* [listCommerceItems2](#listcommerceitems2) - List all items
* [listCommerceItemvariants2](#listcommerceitemvariants2) - List all itemvariants
* [listCommerceLocations2](#listcommercelocations2) - List all locations
* [listCommerceReservations2](#listcommercereservations2) - List all reservations
* [listCommerceReviews2](#listcommercereviews2) - List all reviews
* [listCommerceSaleschannels2](#listcommercesaleschannels2) - List all saleschannels
* [patchCommerceCollection2](#patchcommercecollection2) - Update a collection
* [patchCommerceInventory2](#patchcommerceinventory2) - Update an inventory
* [patchCommerceItem2](#patchcommerceitem2) - Update an item
* [patchCommerceItemvariant2](#patchcommerceitemvariant2) - Update an itemvariant
* [patchCommerceLocation2](#patchcommercelocation2) - Update a location
* [patchCommerceReservation2](#patchcommercereservation2) - Update a reservation
* [patchCommerceReview2](#patchcommercereview2) - Update a review
* [patchCommerceSaleschannel2](#patchcommercesaleschannel2) - Update a saleschannel
* [removeCommerceCollection2](#removecommercecollection2) - Remove a collection
* [removeCommerceInventory2](#removecommerceinventory2) - Remove an inventory
* [removeCommerceItem2](#removecommerceitem2) - Remove an item
* [removeCommerceItemvariant2](#removecommerceitemvariant2) - Remove an itemvariant
* [removeCommerceLocation2](#removecommercelocation2) - Remove a location
* [removeCommerceReservation2](#removecommercereservation2) - Remove a reservation
* [removeCommerceReview2](#removecommercereview2) - Remove a review
* [removeCommerceSaleschannel2](#removecommercesaleschannel2) - Remove a saleschannel
* [updateCommerceCollection2](#updatecommercecollection2) - Update a collection
* [updateCommerceInventory2](#updatecommerceinventory2) - Update an inventory
* [updateCommerceItem2](#updatecommerceitem2) - Update an item
* [updateCommerceItemvariant2](#updatecommerceitemvariant2) - Update an itemvariant
* [updateCommerceLocation2](#updatecommercelocation2) - Update a location
* [updateCommerceReservation2](#updatecommercereservation2) - Update a reservation
* [updateCommerceReview2](#updatecommercereview2) - Update a review
* [updateCommerceSaleschannel2](#updatecommercesaleschannel2) - Update a saleschannel

## createCommerceCollection2

Create a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceCollection2" method="post" path="/commerce/{connection_id}/collection" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceCollection2Request;
import to.unified.unified_java_sdk.models.operations.CreateCommerceCollection2Response;
import to.unified.unified_java_sdk.models.shared.CommerceCollection;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceCollection2Request req = CreateCommerceCollection2Request.builder()
                .commerceCollection(CommerceCollection.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceCollection2Response res = sdk.commerce().createCommerceCollection2()
                .request(req)
                .call();

        if (res.commerceCollection().isPresent()) {
            System.out.println(res.commerceCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [CreateCommerceCollection2Request](../../models/operations/CreateCommerceCollection2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[CreateCommerceCollection2Response](../../models/operations/CreateCommerceCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCommerceInventory2

Create an inventory

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceInventory2" method="post" path="/commerce/{connection_id}/inventory" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceInventory2Request;
import to.unified.unified_java_sdk.models.operations.CreateCommerceInventory2Response;
import to.unified.unified_java_sdk.models.shared.CommerceInventory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceInventory2Request req = CreateCommerceInventory2Request.builder()
                .commerceInventory(CommerceInventory.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceInventory2Response res = sdk.commerce().createCommerceInventory2()
                .request(req)
                .call();

        if (res.commerceInventory().isPresent()) {
            System.out.println(res.commerceInventory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateCommerceInventory2Request](../../models/operations/CreateCommerceInventory2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateCommerceInventory2Response](../../models/operations/CreateCommerceInventory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCommerceItem2

Create an item

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceItem2" method="post" path="/commerce/{connection_id}/item" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceItem2Request;
import to.unified.unified_java_sdk.models.operations.CreateCommerceItem2Response;
import to.unified.unified_java_sdk.models.shared.CommerceItem;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceItem2Request req = CreateCommerceItem2Request.builder()
                .commerceItem(CommerceItem.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceItem2Response res = sdk.commerce().createCommerceItem2()
                .request(req)
                .call();

        if (res.commerceItem().isPresent()) {
            System.out.println(res.commerceItem().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateCommerceItem2Request](../../models/operations/CreateCommerceItem2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateCommerceItem2Response](../../models/operations/CreateCommerceItem2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCommerceItemvariant2

Create an itemvariant

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceItemvariant2" method="post" path="/commerce/{connection_id}/itemvariant" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceItemvariant2Request;
import to.unified.unified_java_sdk.models.operations.CreateCommerceItemvariant2Response;
import to.unified.unified_java_sdk.models.shared.CommerceItemvariant;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceItemvariant2Request req = CreateCommerceItemvariant2Request.builder()
                .commerceItemvariant(CommerceItemvariant.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceItemvariant2Response res = sdk.commerce().createCommerceItemvariant2()
                .request(req)
                .call();

        if (res.commerceItemvariant().isPresent()) {
            System.out.println(res.commerceItemvariant().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [CreateCommerceItemvariant2Request](../../models/operations/CreateCommerceItemvariant2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[CreateCommerceItemvariant2Response](../../models/operations/CreateCommerceItemvariant2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCommerceLocation2

Create a location

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceLocation2" method="post" path="/commerce/{connection_id}/location" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceLocation2Request;
import to.unified.unified_java_sdk.models.operations.CreateCommerceLocation2Response;
import to.unified.unified_java_sdk.models.shared.CommerceLocation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceLocation2Request req = CreateCommerceLocation2Request.builder()
                .commerceLocation(CommerceLocation.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceLocation2Response res = sdk.commerce().createCommerceLocation2()
                .request(req)
                .call();

        if (res.commerceLocation().isPresent()) {
            System.out.println(res.commerceLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateCommerceLocation2Request](../../models/operations/CreateCommerceLocation2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateCommerceLocation2Response](../../models/operations/CreateCommerceLocation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateCommerceReservation2Response res = sdk.commerce().createCommerceReservation2()
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

## createCommerceReview2

Create a review

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceReview2" method="post" path="/commerce/{connection_id}/review" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceReview2Request;
import to.unified.unified_java_sdk.models.operations.CreateCommerceReview2Response;
import to.unified.unified_java_sdk.models.shared.CommerceReview;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceReview2Request req = CreateCommerceReview2Request.builder()
                .commerceReview(CommerceReview.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceReview2Response res = sdk.commerce().createCommerceReview2()
                .request(req)
                .call();

        if (res.commerceReview().isPresent()) {
            System.out.println(res.commerceReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateCommerceReview2Request](../../models/operations/CreateCommerceReview2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateCommerceReview2Response](../../models/operations/CreateCommerceReview2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCommerceSaleschannel2

Create a saleschannel

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceSaleschannel2" method="post" path="/commerce/{connection_id}/saleschannel" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceSaleschannel2Request;
import to.unified.unified_java_sdk.models.operations.CreateCommerceSaleschannel2Response;
import to.unified.unified_java_sdk.models.shared.CommerceSaleschannel;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceSaleschannel2Request req = CreateCommerceSaleschannel2Request.builder()
                .commerceSaleschannel(CommerceSaleschannel.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceSaleschannel2Response res = sdk.commerce().createCommerceSaleschannel2()
                .request(req)
                .call();

        if (res.commerceSaleschannel().isPresent()) {
            System.out.println(res.commerceSaleschannel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [CreateCommerceSaleschannel2Request](../../models/operations/CreateCommerceSaleschannel2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[CreateCommerceSaleschannel2Response](../../models/operations/CreateCommerceSaleschannel2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceCollection2

Retrieve a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceCollection2" method="get" path="/commerce/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceCollection2Request;
import to.unified.unified_java_sdk.models.operations.GetCommerceCollection2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceCollection2Request req = GetCommerceCollection2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceCollection2Response res = sdk.commerce().getCommerceCollection2()
                .request(req)
                .call();

        if (res.commerceCollection().isPresent()) {
            System.out.println(res.commerceCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetCommerceCollection2Request](../../models/operations/GetCommerceCollection2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetCommerceCollection2Response](../../models/operations/GetCommerceCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceInventory2

Retrieve an inventory

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceInventory2" method="get" path="/commerce/{connection_id}/inventory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceInventory2Request;
import to.unified.unified_java_sdk.models.operations.GetCommerceInventory2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceInventory2Request req = GetCommerceInventory2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceInventory2Response res = sdk.commerce().getCommerceInventory2()
                .request(req)
                .call();

        if (res.commerceInventory().isPresent()) {
            System.out.println(res.commerceInventory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetCommerceInventory2Request](../../models/operations/GetCommerceInventory2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetCommerceInventory2Response](../../models/operations/GetCommerceInventory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceItem2

Retrieve an item

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceItem2" method="get" path="/commerce/{connection_id}/item/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceItem2Request;
import to.unified.unified_java_sdk.models.operations.GetCommerceItem2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceItem2Request req = GetCommerceItem2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceItem2Response res = sdk.commerce().getCommerceItem2()
                .request(req)
                .call();

        if (res.commerceItem().isPresent()) {
            System.out.println(res.commerceItem().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetCommerceItem2Request](../../models/operations/GetCommerceItem2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetCommerceItem2Response](../../models/operations/GetCommerceItem2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceItemvariant2

Retrieve an itemvariant

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceItemvariant2" method="get" path="/commerce/{connection_id}/itemvariant/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceItemvariant2Request;
import to.unified.unified_java_sdk.models.operations.GetCommerceItemvariant2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceItemvariant2Request req = GetCommerceItemvariant2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceItemvariant2Response res = sdk.commerce().getCommerceItemvariant2()
                .request(req)
                .call();

        if (res.commerceItemvariant().isPresent()) {
            System.out.println(res.commerceItemvariant().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetCommerceItemvariant2Request](../../models/operations/GetCommerceItemvariant2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetCommerceItemvariant2Response](../../models/operations/GetCommerceItemvariant2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceLocation2

Retrieve a location

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceLocation2" method="get" path="/commerce/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceLocation2Request;
import to.unified.unified_java_sdk.models.operations.GetCommerceLocation2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceLocation2Request req = GetCommerceLocation2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceLocation2Response res = sdk.commerce().getCommerceLocation2()
                .request(req)
                .call();

        if (res.commerceLocation().isPresent()) {
            System.out.println(res.commerceLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetCommerceLocation2Request](../../models/operations/GetCommerceLocation2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetCommerceLocation2Response](../../models/operations/GetCommerceLocation2Response.md)**

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

        GetCommerceReservation2Response res = sdk.commerce().getCommerceReservation2()
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

## getCommerceReview2

Retrieve a review

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceReview2" method="get" path="/commerce/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceReview2Request;
import to.unified.unified_java_sdk.models.operations.GetCommerceReview2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceReview2Request req = GetCommerceReview2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceReview2Response res = sdk.commerce().getCommerceReview2()
                .request(req)
                .call();

        if (res.commerceReview().isPresent()) {
            System.out.println(res.commerceReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetCommerceReview2Request](../../models/operations/GetCommerceReview2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetCommerceReview2Response](../../models/operations/GetCommerceReview2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceSaleschannel2

Retrieve a saleschannel

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceSaleschannel2" method="get" path="/commerce/{connection_id}/saleschannel/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceSaleschannel2Request;
import to.unified.unified_java_sdk.models.operations.GetCommerceSaleschannel2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceSaleschannel2Request req = GetCommerceSaleschannel2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceSaleschannel2Response res = sdk.commerce().getCommerceSaleschannel2()
                .request(req)
                .call();

        if (res.commerceSaleschannel().isPresent()) {
            System.out.println(res.commerceSaleschannel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetCommerceSaleschannel2Request](../../models/operations/GetCommerceSaleschannel2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetCommerceSaleschannel2Response](../../models/operations/GetCommerceSaleschannel2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceAvailabilities2

List all availabilities

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceAvailabilities2" method="get" path="/commerce/{connection_id}/availability" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceAvailabilities2Request;
import to.unified.unified_java_sdk.models.operations.ListCommerceAvailabilities2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceAvailabilities2Request req = ListCommerceAvailabilities2Request.builder()
                .connectionId("<id>")
                .build();

        ListCommerceAvailabilities2Response res = sdk.commerce().listCommerceAvailabilities2()
                .request(req)
                .call();

        if (res.commerceAvailabilities().isPresent()) {
            System.out.println(res.commerceAvailabilities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListCommerceAvailabilities2Request](../../models/operations/ListCommerceAvailabilities2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListCommerceAvailabilities2Response](../../models/operations/ListCommerceAvailabilities2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceCollections2

List all collections

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceCollections2" method="get" path="/commerce/{connection_id}/collection" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceCollections2Request;
import to.unified.unified_java_sdk.models.operations.ListCommerceCollections2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceCollections2Request req = ListCommerceCollections2Request.builder()
                .connectionId("<id>")
                .build();

        ListCommerceCollections2Response res = sdk.commerce().listCommerceCollections2()
                .request(req)
                .call();

        if (res.commerceCollections().isPresent()) {
            System.out.println(res.commerceCollections().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListCommerceCollections2Request](../../models/operations/ListCommerceCollections2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListCommerceCollections2Response](../../models/operations/ListCommerceCollections2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceInventories2

List all inventories

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceInventories2" method="get" path="/commerce/{connection_id}/inventory" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceInventories2Request;
import to.unified.unified_java_sdk.models.operations.ListCommerceInventories2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceInventories2Request req = ListCommerceInventories2Request.builder()
                .connectionId("<id>")
                .build();

        ListCommerceInventories2Response res = sdk.commerce().listCommerceInventories2()
                .request(req)
                .call();

        if (res.commerceInventories().isPresent()) {
            System.out.println(res.commerceInventories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListCommerceInventories2Request](../../models/operations/ListCommerceInventories2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListCommerceInventories2Response](../../models/operations/ListCommerceInventories2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceItems2

List all items

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceItems2" method="get" path="/commerce/{connection_id}/item" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceItems2Request;
import to.unified.unified_java_sdk.models.operations.ListCommerceItems2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceItems2Request req = ListCommerceItems2Request.builder()
                .connectionId("<id>")
                .build();

        ListCommerceItems2Response res = sdk.commerce().listCommerceItems2()
                .request(req)
                .call();

        if (res.commerceItems().isPresent()) {
            System.out.println(res.commerceItems().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListCommerceItems2Request](../../models/operations/ListCommerceItems2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListCommerceItems2Response](../../models/operations/ListCommerceItems2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceItemvariants2

List all itemvariants

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceItemvariants2" method="get" path="/commerce/{connection_id}/itemvariant" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceItemvariants2Request;
import to.unified.unified_java_sdk.models.operations.ListCommerceItemvariants2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceItemvariants2Request req = ListCommerceItemvariants2Request.builder()
                .connectionId("<id>")
                .build();

        ListCommerceItemvariants2Response res = sdk.commerce().listCommerceItemvariants2()
                .request(req)
                .call();

        if (res.commerceItemvariants().isPresent()) {
            System.out.println(res.commerceItemvariants().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListCommerceItemvariants2Request](../../models/operations/ListCommerceItemvariants2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListCommerceItemvariants2Response](../../models/operations/ListCommerceItemvariants2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceLocations2

List all locations

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceLocations2" method="get" path="/commerce/{connection_id}/location" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceLocations2Request;
import to.unified.unified_java_sdk.models.operations.ListCommerceLocations2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceLocations2Request req = ListCommerceLocations2Request.builder()
                .connectionId("<id>")
                .build();

        ListCommerceLocations2Response res = sdk.commerce().listCommerceLocations2()
                .request(req)
                .call();

        if (res.commerceLocations().isPresent()) {
            System.out.println(res.commerceLocations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListCommerceLocations2Request](../../models/operations/ListCommerceLocations2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListCommerceLocations2Response](../../models/operations/ListCommerceLocations2Response.md)**

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

        ListCommerceReservations2Response res = sdk.commerce().listCommerceReservations2()
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

## listCommerceReviews2

List all reviews

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceReviews2" method="get" path="/commerce/{connection_id}/review" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceReviews2Request;
import to.unified.unified_java_sdk.models.operations.ListCommerceReviews2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceReviews2Request req = ListCommerceReviews2Request.builder()
                .connectionId("<id>")
                .build();

        ListCommerceReviews2Response res = sdk.commerce().listCommerceReviews2()
                .request(req)
                .call();

        if (res.commerceReviews().isPresent()) {
            System.out.println(res.commerceReviews().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListCommerceReviews2Request](../../models/operations/ListCommerceReviews2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListCommerceReviews2Response](../../models/operations/ListCommerceReviews2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceSaleschannels2

List all saleschannels

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceSaleschannels2" method="get" path="/commerce/{connection_id}/saleschannel" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceSaleschannels2Request;
import to.unified.unified_java_sdk.models.operations.ListCommerceSaleschannels2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceSaleschannels2Request req = ListCommerceSaleschannels2Request.builder()
                .connectionId("<id>")
                .build();

        ListCommerceSaleschannels2Response res = sdk.commerce().listCommerceSaleschannels2()
                .request(req)
                .call();

        if (res.commerceSaleschannels().isPresent()) {
            System.out.println(res.commerceSaleschannels().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListCommerceSaleschannels2Request](../../models/operations/ListCommerceSaleschannels2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListCommerceSaleschannels2Response](../../models/operations/ListCommerceSaleschannels2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceCollection2

Update a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceCollection2" method="patch" path="/commerce/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceCollection2Request;
import to.unified.unified_java_sdk.models.operations.PatchCommerceCollection2Response;
import to.unified.unified_java_sdk.models.shared.CommerceCollection;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceCollection2Request req = PatchCommerceCollection2Request.builder()
                .commerceCollection(CommerceCollection.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceCollection2Response res = sdk.commerce().patchCommerceCollection2()
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
| `request`                                                                                     | [PatchCommerceCollection2Request](../../models/operations/PatchCommerceCollection2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[PatchCommerceCollection2Response](../../models/operations/PatchCommerceCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceInventory2

Update an inventory

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceInventory2" method="patch" path="/commerce/{connection_id}/inventory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceInventory2Request;
import to.unified.unified_java_sdk.models.operations.PatchCommerceInventory2Response;
import to.unified.unified_java_sdk.models.shared.CommerceInventory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceInventory2Request req = PatchCommerceInventory2Request.builder()
                .commerceInventory(CommerceInventory.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceInventory2Response res = sdk.commerce().patchCommerceInventory2()
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
| `request`                                                                                   | [PatchCommerceInventory2Request](../../models/operations/PatchCommerceInventory2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchCommerceInventory2Response](../../models/operations/PatchCommerceInventory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceItem2

Update an item

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceItem2" method="patch" path="/commerce/{connection_id}/item/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceItem2Request;
import to.unified.unified_java_sdk.models.operations.PatchCommerceItem2Response;
import to.unified.unified_java_sdk.models.shared.CommerceItem;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceItem2Request req = PatchCommerceItem2Request.builder()
                .commerceItem(CommerceItem.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceItem2Response res = sdk.commerce().patchCommerceItem2()
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
| `request`                                                                         | [PatchCommerceItem2Request](../../models/operations/PatchCommerceItem2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchCommerceItem2Response](../../models/operations/PatchCommerceItem2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceItemvariant2

Update an itemvariant

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceItemvariant2" method="patch" path="/commerce/{connection_id}/itemvariant/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceItemvariant2Request;
import to.unified.unified_java_sdk.models.operations.PatchCommerceItemvariant2Response;
import to.unified.unified_java_sdk.models.shared.CommerceItemvariant;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceItemvariant2Request req = PatchCommerceItemvariant2Request.builder()
                .commerceItemvariant(CommerceItemvariant.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceItemvariant2Response res = sdk.commerce().patchCommerceItemvariant2()
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
| `request`                                                                                       | [PatchCommerceItemvariant2Request](../../models/operations/PatchCommerceItemvariant2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[PatchCommerceItemvariant2Response](../../models/operations/PatchCommerceItemvariant2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceLocation2

Update a location

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceLocation2" method="patch" path="/commerce/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceLocation2Request;
import to.unified.unified_java_sdk.models.operations.PatchCommerceLocation2Response;
import to.unified.unified_java_sdk.models.shared.CommerceLocation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceLocation2Request req = PatchCommerceLocation2Request.builder()
                .commerceLocation(CommerceLocation.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceLocation2Response res = sdk.commerce().patchCommerceLocation2()
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
| `request`                                                                                 | [PatchCommerceLocation2Request](../../models/operations/PatchCommerceLocation2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchCommerceLocation2Response](../../models/operations/PatchCommerceLocation2Response.md)**

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

        PatchCommerceReservation2Response res = sdk.commerce().patchCommerceReservation2()
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

## patchCommerceReview2

Update a review

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceReview2" method="patch" path="/commerce/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceReview2Request;
import to.unified.unified_java_sdk.models.operations.PatchCommerceReview2Response;
import to.unified.unified_java_sdk.models.shared.CommerceReview;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceReview2Request req = PatchCommerceReview2Request.builder()
                .commerceReview(CommerceReview.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceReview2Response res = sdk.commerce().patchCommerceReview2()
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
| `request`                                                                             | [PatchCommerceReview2Request](../../models/operations/PatchCommerceReview2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchCommerceReview2Response](../../models/operations/PatchCommerceReview2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceSaleschannel2

Update a saleschannel

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceSaleschannel2" method="patch" path="/commerce/{connection_id}/saleschannel/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceSaleschannel2Request;
import to.unified.unified_java_sdk.models.operations.PatchCommerceSaleschannel2Response;
import to.unified.unified_java_sdk.models.shared.CommerceSaleschannel;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceSaleschannel2Request req = PatchCommerceSaleschannel2Request.builder()
                .commerceSaleschannel(CommerceSaleschannel.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceSaleschannel2Response res = sdk.commerce().patchCommerceSaleschannel2()
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
| `request`                                                                                         | [PatchCommerceSaleschannel2Request](../../models/operations/PatchCommerceSaleschannel2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[PatchCommerceSaleschannel2Response](../../models/operations/PatchCommerceSaleschannel2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceCollection2

Remove a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceCollection2" method="delete" path="/commerce/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceCollection2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceCollection2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceCollection2Request req = RemoveCommerceCollection2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceCollection2Response res = sdk.commerce().removeCommerceCollection2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [RemoveCommerceCollection2Request](../../models/operations/RemoveCommerceCollection2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[RemoveCommerceCollection2Response](../../models/operations/RemoveCommerceCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceInventory2

Remove an inventory

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceInventory2" method="delete" path="/commerce/{connection_id}/inventory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceInventory2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceInventory2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceInventory2Request req = RemoveCommerceInventory2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceInventory2Response res = sdk.commerce().removeCommerceInventory2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveCommerceInventory2Request](../../models/operations/RemoveCommerceInventory2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveCommerceInventory2Response](../../models/operations/RemoveCommerceInventory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceItem2

Remove an item

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceItem2" method="delete" path="/commerce/{connection_id}/item/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceItem2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceItem2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceItem2Request req = RemoveCommerceItem2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceItem2Response res = sdk.commerce().removeCommerceItem2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveCommerceItem2Request](../../models/operations/RemoveCommerceItem2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveCommerceItem2Response](../../models/operations/RemoveCommerceItem2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceItemvariant2

Remove an itemvariant

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceItemvariant2" method="delete" path="/commerce/{connection_id}/itemvariant/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceItemvariant2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceItemvariant2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceItemvariant2Request req = RemoveCommerceItemvariant2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceItemvariant2Response res = sdk.commerce().removeCommerceItemvariant2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [RemoveCommerceItemvariant2Request](../../models/operations/RemoveCommerceItemvariant2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[RemoveCommerceItemvariant2Response](../../models/operations/RemoveCommerceItemvariant2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceLocation2

Remove a location

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceLocation2" method="delete" path="/commerce/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceLocation2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceLocation2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceLocation2Request req = RemoveCommerceLocation2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceLocation2Response res = sdk.commerce().removeCommerceLocation2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveCommerceLocation2Request](../../models/operations/RemoveCommerceLocation2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveCommerceLocation2Response](../../models/operations/RemoveCommerceLocation2Response.md)**

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

        RemoveCommerceReservation2Response res = sdk.commerce().removeCommerceReservation2()
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

## removeCommerceReview2

Remove a review

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceReview2" method="delete" path="/commerce/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceReview2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceReview2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceReview2Request req = RemoveCommerceReview2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceReview2Response res = sdk.commerce().removeCommerceReview2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveCommerceReview2Request](../../models/operations/RemoveCommerceReview2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveCommerceReview2Response](../../models/operations/RemoveCommerceReview2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceSaleschannel2

Remove a saleschannel

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceSaleschannel2" method="delete" path="/commerce/{connection_id}/saleschannel/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceSaleschannel2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceSaleschannel2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceSaleschannel2Request req = RemoveCommerceSaleschannel2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceSaleschannel2Response res = sdk.commerce().removeCommerceSaleschannel2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [RemoveCommerceSaleschannel2Request](../../models/operations/RemoveCommerceSaleschannel2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[RemoveCommerceSaleschannel2Response](../../models/operations/RemoveCommerceSaleschannel2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceCollection2

Update a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceCollection2" method="put" path="/commerce/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceCollection2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceCollection2Response;
import to.unified.unified_java_sdk.models.shared.CommerceCollection;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceCollection2Request req = UpdateCommerceCollection2Request.builder()
                .commerceCollection(CommerceCollection.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceCollection2Response res = sdk.commerce().updateCommerceCollection2()
                .request(req)
                .call();

        if (res.commerceCollection().isPresent()) {
            System.out.println(res.commerceCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [UpdateCommerceCollection2Request](../../models/operations/UpdateCommerceCollection2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[UpdateCommerceCollection2Response](../../models/operations/UpdateCommerceCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceInventory2

Update an inventory

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceInventory2" method="put" path="/commerce/{connection_id}/inventory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceInventory2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceInventory2Response;
import to.unified.unified_java_sdk.models.shared.CommerceInventory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceInventory2Request req = UpdateCommerceInventory2Request.builder()
                .commerceInventory(CommerceInventory.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceInventory2Response res = sdk.commerce().updateCommerceInventory2()
                .request(req)
                .call();

        if (res.commerceInventory().isPresent()) {
            System.out.println(res.commerceInventory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateCommerceInventory2Request](../../models/operations/UpdateCommerceInventory2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateCommerceInventory2Response](../../models/operations/UpdateCommerceInventory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceItem2

Update an item

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceItem2" method="put" path="/commerce/{connection_id}/item/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceItem2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceItem2Response;
import to.unified.unified_java_sdk.models.shared.CommerceItem;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceItem2Request req = UpdateCommerceItem2Request.builder()
                .commerceItem(CommerceItem.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceItem2Response res = sdk.commerce().updateCommerceItem2()
                .request(req)
                .call();

        if (res.commerceItem().isPresent()) {
            System.out.println(res.commerceItem().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateCommerceItem2Request](../../models/operations/UpdateCommerceItem2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateCommerceItem2Response](../../models/operations/UpdateCommerceItem2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceItemvariant2

Update an itemvariant

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceItemvariant2" method="put" path="/commerce/{connection_id}/itemvariant/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceItemvariant2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceItemvariant2Response;
import to.unified.unified_java_sdk.models.shared.CommerceItemvariant;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceItemvariant2Request req = UpdateCommerceItemvariant2Request.builder()
                .commerceItemvariant(CommerceItemvariant.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceItemvariant2Response res = sdk.commerce().updateCommerceItemvariant2()
                .request(req)
                .call();

        if (res.commerceItemvariant().isPresent()) {
            System.out.println(res.commerceItemvariant().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [UpdateCommerceItemvariant2Request](../../models/operations/UpdateCommerceItemvariant2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[UpdateCommerceItemvariant2Response](../../models/operations/UpdateCommerceItemvariant2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceLocation2

Update a location

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceLocation2" method="put" path="/commerce/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceLocation2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceLocation2Response;
import to.unified.unified_java_sdk.models.shared.CommerceLocation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceLocation2Request req = UpdateCommerceLocation2Request.builder()
                .commerceLocation(CommerceLocation.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceLocation2Response res = sdk.commerce().updateCommerceLocation2()
                .request(req)
                .call();

        if (res.commerceLocation().isPresent()) {
            System.out.println(res.commerceLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateCommerceLocation2Request](../../models/operations/UpdateCommerceLocation2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateCommerceLocation2Response](../../models/operations/UpdateCommerceLocation2Response.md)**

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

        UpdateCommerceReservation2Response res = sdk.commerce().updateCommerceReservation2()
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

## updateCommerceReview2

Update a review

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceReview2" method="put" path="/commerce/{connection_id}/review/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceReview2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceReview2Response;
import to.unified.unified_java_sdk.models.shared.CommerceReview;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceReview2Request req = UpdateCommerceReview2Request.builder()
                .commerceReview(CommerceReview.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceReview2Response res = sdk.commerce().updateCommerceReview2()
                .request(req)
                .call();

        if (res.commerceReview().isPresent()) {
            System.out.println(res.commerceReview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateCommerceReview2Request](../../models/operations/UpdateCommerceReview2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateCommerceReview2Response](../../models/operations/UpdateCommerceReview2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceSaleschannel2

Update a saleschannel

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceSaleschannel2" method="put" path="/commerce/{connection_id}/saleschannel/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceSaleschannel2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceSaleschannel2Response;
import to.unified.unified_java_sdk.models.shared.CommerceSaleschannel;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceSaleschannel2Request req = UpdateCommerceSaleschannel2Request.builder()
                .commerceSaleschannel(CommerceSaleschannel.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceSaleschannel2Response res = sdk.commerce().updateCommerceSaleschannel2()
                .request(req)
                .call();

        if (res.commerceSaleschannel().isPresent()) {
            System.out.println(res.commerceSaleschannel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UpdateCommerceSaleschannel2Request](../../models/operations/UpdateCommerceSaleschannel2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateCommerceSaleschannel2Response](../../models/operations/UpdateCommerceSaleschannel2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |