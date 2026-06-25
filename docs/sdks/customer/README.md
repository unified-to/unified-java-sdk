# Customer

## Overview

### Available Operations

* [createTicketingCustomer2](#createticketingcustomer2) - Create a customer
* [getTicketingCustomer2](#getticketingcustomer2) - Retrieve a customer
* [listTicketingCustomers2](#listticketingcustomers2) - List all customers
* [patchTicketingCustomer2](#patchticketingcustomer2) - Update a customer
* [removeTicketingCustomer2](#removeticketingcustomer2) - Remove a customer
* [updateTicketingCustomer2](#updateticketingcustomer2) - Update a customer

## createTicketingCustomer2

Create a customer

### Example Usage

<!-- UsageSnippet language="java" operationID="createTicketingCustomer2" method="post" path="/ticketing/{connection_id}/customer" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateTicketingCustomer2Request;
import to.unified.unified_java_sdk.models.operations.CreateTicketingCustomer2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCustomer;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateTicketingCustomer2Request req = CreateTicketingCustomer2Request.builder()
                .ticketingCustomer(TicketingCustomer.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateTicketingCustomer2Response res = sdk.customer().createTicketingCustomer2()
                .request(req)
                .call();

        if (res.ticketingCustomer().isPresent()) {
            System.out.println(res.ticketingCustomer().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateTicketingCustomer2Request](../../models/operations/CreateTicketingCustomer2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateTicketingCustomer2Response](../../models/operations/CreateTicketingCustomer2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTicketingCustomer2

Retrieve a customer

### Example Usage

<!-- UsageSnippet language="java" operationID="getTicketingCustomer2" method="get" path="/ticketing/{connection_id}/customer/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTicketingCustomer2Request;
import to.unified.unified_java_sdk.models.operations.GetTicketingCustomer2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTicketingCustomer2Request req = GetTicketingCustomer2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTicketingCustomer2Response res = sdk.customer().getTicketingCustomer2()
                .request(req)
                .call();

        if (res.ticketingCustomer().isPresent()) {
            System.out.println(res.ticketingCustomer().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetTicketingCustomer2Request](../../models/operations/GetTicketingCustomer2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetTicketingCustomer2Response](../../models/operations/GetTicketingCustomer2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTicketingCustomers2

List all customers

### Example Usage

<!-- UsageSnippet language="java" operationID="listTicketingCustomers2" method="get" path="/ticketing/{connection_id}/customer" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTicketingCustomers2Request;
import to.unified.unified_java_sdk.models.operations.ListTicketingCustomers2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTicketingCustomers2Request req = ListTicketingCustomers2Request.builder()
                .connectionId("<id>")
                .build();

        ListTicketingCustomers2Response res = sdk.customer().listTicketingCustomers2()
                .request(req)
                .call();

        if (res.ticketingCustomers().isPresent()) {
            System.out.println(res.ticketingCustomers().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListTicketingCustomers2Request](../../models/operations/ListTicketingCustomers2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListTicketingCustomers2Response](../../models/operations/ListTicketingCustomers2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchTicketingCustomer2

Update a customer

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTicketingCustomer2" method="patch" path="/ticketing/{connection_id}/customer/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchTicketingCustomer2Request;
import to.unified.unified_java_sdk.models.operations.PatchTicketingCustomer2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCustomer;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchTicketingCustomer2Request req = PatchTicketingCustomer2Request.builder()
                .ticketingCustomer(TicketingCustomer.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTicketingCustomer2Response res = sdk.customer().patchTicketingCustomer2()
                .request(req)
                .call();

        if (res.ticketingCustomer().isPresent()) {
            System.out.println(res.ticketingCustomer().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchTicketingCustomer2Request](../../models/operations/PatchTicketingCustomer2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchTicketingCustomer2Response](../../models/operations/PatchTicketingCustomer2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeTicketingCustomer2

Remove a customer

### Example Usage

<!-- UsageSnippet language="java" operationID="removeTicketingCustomer2" method="delete" path="/ticketing/{connection_id}/customer/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingCustomer2Request;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingCustomer2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveTicketingCustomer2Request req = RemoveTicketingCustomer2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTicketingCustomer2Response res = sdk.customer().removeTicketingCustomer2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveTicketingCustomer2Request](../../models/operations/RemoveTicketingCustomer2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveTicketingCustomer2Response](../../models/operations/RemoveTicketingCustomer2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTicketingCustomer2

Update a customer

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTicketingCustomer2" method="put" path="/ticketing/{connection_id}/customer/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingCustomer2Request;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingCustomer2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCustomer;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateTicketingCustomer2Request req = UpdateTicketingCustomer2Request.builder()
                .ticketingCustomer(TicketingCustomer.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTicketingCustomer2Response res = sdk.customer().updateTicketingCustomer2()
                .request(req)
                .call();

        if (res.ticketingCustomer().isPresent()) {
            System.out.println(res.ticketingCustomer().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateTicketingCustomer2Request](../../models/operations/UpdateTicketingCustomer2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateTicketingCustomer2Response](../../models/operations/UpdateTicketingCustomer2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |