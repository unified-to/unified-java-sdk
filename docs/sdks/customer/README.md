# Customer

## Overview

### Available Operations

* [createTicketingCustomer](#createticketingcustomer) - Create a customer
* [getTicketingCustomer](#getticketingcustomer) - Retrieve a customer
* [listTicketingCustomers](#listticketingcustomers) - List all customers
* [patchTicketingCustomer](#patchticketingcustomer) - Update a customer
* [removeTicketingCustomer](#removeticketingcustomer) - Remove a customer
* [updateTicketingCustomer](#updateticketingcustomer) - Update a customer

## createTicketingCustomer

Creates a TicketingCustomer. Provide the unified TicketingCustomer fields in the request body; they are mapped to the provider's API. Returns the created TicketingCustomer.

### Example Usage

<!-- UsageSnippet language="java" operationID="createTicketingCustomer" method="post" path="/ticketing/{connection_id}/customer" example="ticketing_customer" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateTicketingCustomerRequest;
import to.unified.unified_java_sdk.models.operations.CreateTicketingCustomerResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateTicketingCustomerRequest req = CreateTicketingCustomerRequest.builder()
                .ticketingCustomer(TicketingCustomer.builder()
                    .createdAt(OffsetDateTime.parse("2021-03-15T12:33:14.875Z"))
                    .emails(List.of(
                        TicketingEmail.builder()
                            .email("christian.windler@gmail.com")
                            .type(TicketingEmailType.HOME)
                            .build()))
                    .id("09fda5a1-6a0a-4065-b88d-b8e4efd11326")
                    .metadata(List.of())
                    .name("Christian Windler")
                    .tags(List.of(
                        "quidem",
                        "una"))
                    .telephones(List.of(
                        TicketingTelephone.builder()
                            .telephone("(299) 843-2042")
                            .type(TicketingTelephoneType.OTHER)
                            .build(),
                        TicketingTelephone.builder()
                            .telephone("(248) 482-6083")
                            .type(TicketingTelephoneType.MOBILE)
                            .build(),
                        TicketingTelephone.builder()
                            .telephone("(743) 328-3214")
                            .type(TicketingTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2026-06-11T05:18:50.188Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateTicketingCustomerResponse res = sdk.customer().createTicketingCustomer()
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
| `request`                                                                                   | [CreateTicketingCustomerRequest](../../models/operations/CreateTicketingCustomerRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateTicketingCustomerResponse](../../models/operations/CreateTicketingCustomerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTicketingCustomer

Retrieves a single TicketingCustomer by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getTicketingCustomer" method="get" path="/ticketing/{connection_id}/customer/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTicketingCustomerRequest;
import to.unified.unified_java_sdk.models.operations.GetTicketingCustomerResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTicketingCustomerRequest req = GetTicketingCustomerRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTicketingCustomerResponse res = sdk.customer().getTicketingCustomer()
                .request(req)
                .call();

        if (res.ticketingCustomer().isPresent()) {
            System.out.println(res.ticketingCustomer().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetTicketingCustomerRequest](../../models/operations/GetTicketingCustomerRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetTicketingCustomerResponse](../../models/operations/GetTicketingCustomerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTicketingCustomers

Returns a list of TicketingCustomers. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listTicketingCustomers" method="get" path="/ticketing/{connection_id}/customer" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTicketingCustomersRequest;
import to.unified.unified_java_sdk.models.operations.ListTicketingCustomersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTicketingCustomersRequest req = ListTicketingCustomersRequest.builder()
                .connectionId("<id>")
                .build();

        ListTicketingCustomersResponse res = sdk.customer().listTicketingCustomers()
                .request(req)
                .call();

        if (res.ticketingCustomers().isPresent()) {
            System.out.println(res.ticketingCustomers().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListTicketingCustomersRequest](../../models/operations/ListTicketingCustomersRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListTicketingCustomersResponse](../../models/operations/ListTicketingCustomersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchTicketingCustomer

Updates the TicketingCustomer identified by `id`. Provide the unified TicketingCustomer fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTicketingCustomer" method="patch" path="/ticketing/{connection_id}/customer/{id}" example="ticketing_customer" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchTicketingCustomerRequest;
import to.unified.unified_java_sdk.models.operations.PatchTicketingCustomerResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchTicketingCustomerRequest req = PatchTicketingCustomerRequest.builder()
                .ticketingCustomer(TicketingCustomer.builder()
                    .createdAt(OffsetDateTime.parse("2021-03-15T12:33:14.875Z"))
                    .emails(List.of(
                        TicketingEmail.builder()
                            .email("christian.windler@gmail.com")
                            .type(TicketingEmailType.HOME)
                            .build()))
                    .id("c87c9e98-d8d8-4b67-8162-edd977df4783")
                    .metadata(List.of())
                    .name("Christian Windler")
                    .tags(List.of(
                        "quidem",
                        "una"))
                    .telephones(List.of(
                        TicketingTelephone.builder()
                            .telephone("(299) 843-2042")
                            .type(TicketingTelephoneType.OTHER)
                            .build(),
                        TicketingTelephone.builder()
                            .telephone("(248) 482-6083")
                            .type(TicketingTelephoneType.MOBILE)
                            .build(),
                        TicketingTelephone.builder()
                            .telephone("(743) 328-3214")
                            .type(TicketingTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2026-06-11T05:18:50.212Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTicketingCustomerResponse res = sdk.customer().patchTicketingCustomer()
                .request(req)
                .call();

        if (res.ticketingCustomer().isPresent()) {
            System.out.println(res.ticketingCustomer().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchTicketingCustomerRequest](../../models/operations/PatchTicketingCustomerRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchTicketingCustomerResponse](../../models/operations/PatchTicketingCustomerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeTicketingCustomer

Deletes the TicketingCustomer identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeTicketingCustomer" method="delete" path="/ticketing/{connection_id}/customer/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingCustomerRequest;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingCustomerResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveTicketingCustomerRequest req = RemoveTicketingCustomerRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTicketingCustomerResponse res = sdk.customer().removeTicketingCustomer()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveTicketingCustomerRequest](../../models/operations/RemoveTicketingCustomerRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveTicketingCustomerResponse](../../models/operations/RemoveTicketingCustomerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTicketingCustomer

Updates the TicketingCustomer identified by `id`. Provide the unified TicketingCustomer fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTicketingCustomer" method="put" path="/ticketing/{connection_id}/customer/{id}" example="ticketing_customer" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingCustomerRequest;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingCustomerResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateTicketingCustomerRequest req = UpdateTicketingCustomerRequest.builder()
                .ticketingCustomer(TicketingCustomer.builder()
                    .createdAt(OffsetDateTime.parse("2021-03-15T12:33:14.875Z"))
                    .emails(List.of(
                        TicketingEmail.builder()
                            .email("christian.windler@gmail.com")
                            .type(TicketingEmailType.HOME)
                            .build()))
                    .id("c87c9e98-d8d8-4b67-8162-edd977df4783")
                    .metadata(List.of())
                    .name("Christian Windler")
                    .tags(List.of(
                        "quidem",
                        "una"))
                    .telephones(List.of(
                        TicketingTelephone.builder()
                            .telephone("(299) 843-2042")
                            .type(TicketingTelephoneType.OTHER)
                            .build(),
                        TicketingTelephone.builder()
                            .telephone("(248) 482-6083")
                            .type(TicketingTelephoneType.MOBILE)
                            .build(),
                        TicketingTelephone.builder()
                            .telephone("(743) 328-3214")
                            .type(TicketingTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2026-06-11T05:18:50.212Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTicketingCustomerResponse res = sdk.customer().updateTicketingCustomer()
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
| `request`                                                                                   | [UpdateTicketingCustomerRequest](../../models/operations/UpdateTicketingCustomerRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateTicketingCustomerResponse](../../models/operations/UpdateTicketingCustomerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |