# Ticketing

## Overview

### Available Operations

* [createTicketingCategory](#createticketingcategory) - Create a category
* [createTicketingCustomer](#createticketingcustomer) - Create a customer
* [createTicketingNote](#createticketingnote) - Create a note
* [createTicketingTicket](#createticketingticket) - Create a ticket
* [getTicketingCategory](#getticketingcategory) - Retrieve a category
* [getTicketingCustomer](#getticketingcustomer) - Retrieve a customer
* [getTicketingNote](#getticketingnote) - Retrieve a note
* [getTicketingTicket](#getticketingticket) - Retrieve a ticket
* [listTicketingCategories](#listticketingcategories) - List all categories
* [listTicketingCustomers](#listticketingcustomers) - List all customers
* [listTicketingNotes](#listticketingnotes) - List all notes
* [listTicketingTickets](#listticketingtickets) - List all tickets
* [patchTicketingCategory](#patchticketingcategory) - Update a category
* [patchTicketingCustomer](#patchticketingcustomer) - Update a customer
* [patchTicketingNote](#patchticketingnote) - Update a note
* [patchTicketingTicket](#patchticketingticket) - Update a ticket
* [removeTicketingCategory](#removeticketingcategory) - Remove a category
* [removeTicketingCustomer](#removeticketingcustomer) - Remove a customer
* [removeTicketingNote](#removeticketingnote) - Remove a note
* [removeTicketingTicket](#removeticketingticket) - Remove a ticket
* [updateTicketingCategory](#updateticketingcategory) - Update a category
* [updateTicketingCustomer](#updateticketingcustomer) - Update a customer
* [updateTicketingNote](#updateticketingnote) - Update a note
* [updateTicketingTicket](#updateticketingticket) - Update a ticket

## createTicketingCategory

Create a category

### Example Usage

<!-- UsageSnippet language="java" operationID="createTicketingCategory" method="post" path="/ticketing/{connection_id}/category" example="ticketing_category" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateTicketingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.CreateTicketingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCategory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateTicketingCategoryRequest req = CreateTicketingCategoryRequest.builder()
                .ticketingCategory(TicketingCategory.builder()
                    .createdAt(OffsetDateTime.parse("2019-10-19T22:02:51.067Z"))
                    .description("Tempus umbra cibus carpo depulso torqueo. Curtus aperiam nam optio tendo. Bardus tumultus delectus arbitro amplus tollo coerceo clam comprehendo vulnero.")
                    .id("f105db66-81f5-4fe1-bc51-33918f354917")
                    .isActive(true)
                    .name("amicitia")
                    .updatedAt(OffsetDateTime.parse("2025-12-15T15:11:45.224Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateTicketingCategoryResponse res = sdk.ticketing().createTicketingCategory()
                .request(req)
                .call();

        if (res.ticketingCategory().isPresent()) {
            System.out.println(res.ticketingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateTicketingCategoryRequest](../../models/operations/CreateTicketingCategoryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateTicketingCategoryResponse](../../models/operations/CreateTicketingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createTicketingCustomer

Create a customer

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
                            .email("Christian_Windler@gmail.com")
                            .type(TicketingEmailType.HOME)
                            .build()))
                    .id("e4eda98a-50de-46a3-969f-b9ed09d9be62")
                    .name("Christian Windler")
                    .tags(List.of(
                        "casso",
                        "peccatus"))
                    .telephones(List.of(
                        TicketingTelephone.builder()
                            .telephone("(532) 242-0482")
                            .type(TicketingTelephoneType.OTHER)
                            .build(),
                        TicketingTelephone.builder()
                            .telephone("(826) 283-7431")
                            .type(TicketingTelephoneType.MOBILE)
                            .build(),
                        TicketingTelephone.builder()
                            .telephone("(483) 314-6826")
                            .type(TicketingTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2026-05-04T07:40:10.066Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateTicketingCustomerResponse res = sdk.ticketing().createTicketingCustomer()
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

## createTicketingNote

Create a note

### Example Usage

<!-- UsageSnippet language="java" operationID="createTicketingNote" method="post" path="/ticketing/{connection_id}/note" example="ticketing_note" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateTicketingNoteRequest;
import to.unified.unified_java_sdk.models.operations.CreateTicketingNoteResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingNote;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateTicketingNoteRequest req = CreateTicketingNoteRequest.builder()
                .ticketingNote(TicketingNote.builder()
                    .createdAt(OffsetDateTime.parse("2019-07-23T15:05:03.241Z"))
                    .description("Civitas absum adipisci vitiosus recusandae tristis dedico libero comminor cena. Spes virgo absorbeo defluo nostrum.")
                    .id("4cee47af-266b-4309-8b76-7cebe1a0cd2c")
                    .updatedAt(OffsetDateTime.parse("2024-09-05T15:39:07.495Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateTicketingNoteResponse res = sdk.ticketing().createTicketingNote()
                .request(req)
                .call();

        if (res.ticketingNote().isPresent()) {
            System.out.println(res.ticketingNote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateTicketingNoteRequest](../../models/operations/CreateTicketingNoteRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateTicketingNoteResponse](../../models/operations/CreateTicketingNoteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createTicketingTicket

Create a ticket

### Example Usage

<!-- UsageSnippet language="java" operationID="createTicketingTicket" method="post" path="/ticketing/{connection_id}/ticket" example="ticketing_ticket" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateTicketingTicketRequest;
import to.unified.unified_java_sdk.models.operations.CreateTicketingTicketResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateTicketingTicketRequest req = CreateTicketingTicketRequest.builder()
                .ticketingTicket(TicketingTicket.builder()
                    .attachmentIds(List.of(
                        "54d062bd-6a74-4ef8-bc70-dc824a2e49fd",
                        "33196987-bf69-447f-b801-4dc7d0300c6e"))
                    .categoryId("vilicus")
                    .createdAt(OffsetDateTime.parse("2021-06-25T19:19:31.279Z"))
                    .description("Cura dignissimos aut clibanus vulgaris patrocinor. Laborum acies curiositas antepono coniuratio. Correptius curiositas sono censura coma. Bestia suus tot cotidie terror subito coniecto beneficium.")
                    .dueAt(OffsetDateTime.parse("2025-07-20T03:58:02.236Z"))
                    .id("d06273e9-21f7-41fb-af1f-e6e23ba3756a")
                    .priority("LOW")
                    .source("atavus")
                    .sourceRef("ca9c1ed1-8fbe-47fa-9a41-de23adbe14c3")
                    .status(TicketingTicketStatus.ACTIVE)
                    .subject("Thymbra ratione minus arbitro tricesimus cetera validus.")
                    .tags(List.of(
                        "tamen",
                        "vitae",
                        "torrens"))
                    .updatedAt(OffsetDateTime.parse("2023-05-28T07:25:49.682Z"))
                    .url("https://yellowish-testimonial.biz")
                    .build())
                .connectionId("<id>")
                .build();

        CreateTicketingTicketResponse res = sdk.ticketing().createTicketingTicket()
                .request(req)
                .call();

        if (res.ticketingTicket().isPresent()) {
            System.out.println(res.ticketingTicket().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateTicketingTicketRequest](../../models/operations/CreateTicketingTicketRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateTicketingTicketResponse](../../models/operations/CreateTicketingTicketResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTicketingCategory

Retrieve a category

### Example Usage

<!-- UsageSnippet language="java" operationID="getTicketingCategory" method="get" path="/ticketing/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTicketingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.GetTicketingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTicketingCategoryRequest req = GetTicketingCategoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTicketingCategoryResponse res = sdk.ticketing().getTicketingCategory()
                .request(req)
                .call();

        if (res.ticketingCategory().isPresent()) {
            System.out.println(res.ticketingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetTicketingCategoryRequest](../../models/operations/GetTicketingCategoryRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetTicketingCategoryResponse](../../models/operations/GetTicketingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTicketingCustomer

Retrieve a customer

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

        GetTicketingCustomerResponse res = sdk.ticketing().getTicketingCustomer()
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

## getTicketingNote

Retrieve a note

### Example Usage

<!-- UsageSnippet language="java" operationID="getTicketingNote" method="get" path="/ticketing/{connection_id}/note/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTicketingNoteRequest;
import to.unified.unified_java_sdk.models.operations.GetTicketingNoteResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTicketingNoteRequest req = GetTicketingNoteRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTicketingNoteResponse res = sdk.ticketing().getTicketingNote()
                .request(req)
                .call();

        if (res.ticketingNote().isPresent()) {
            System.out.println(res.ticketingNote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetTicketingNoteRequest](../../models/operations/GetTicketingNoteRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetTicketingNoteResponse](../../models/operations/GetTicketingNoteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTicketingTicket

Retrieve a ticket

### Example Usage

<!-- UsageSnippet language="java" operationID="getTicketingTicket" method="get" path="/ticketing/{connection_id}/ticket/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTicketingTicketRequest;
import to.unified.unified_java_sdk.models.operations.GetTicketingTicketResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTicketingTicketRequest req = GetTicketingTicketRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTicketingTicketResponse res = sdk.ticketing().getTicketingTicket()
                .request(req)
                .call();

        if (res.ticketingTicket().isPresent()) {
            System.out.println(res.ticketingTicket().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetTicketingTicketRequest](../../models/operations/GetTicketingTicketRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetTicketingTicketResponse](../../models/operations/GetTicketingTicketResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTicketingCategories

List all categories

### Example Usage

<!-- UsageSnippet language="java" operationID="listTicketingCategories" method="get" path="/ticketing/{connection_id}/category" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTicketingCategoriesRequest;
import to.unified.unified_java_sdk.models.operations.ListTicketingCategoriesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTicketingCategoriesRequest req = ListTicketingCategoriesRequest.builder()
                .connectionId("<id>")
                .build();

        ListTicketingCategoriesResponse res = sdk.ticketing().listTicketingCategories()
                .request(req)
                .call();

        if (res.ticketingCategories().isPresent()) {
            System.out.println(res.ticketingCategories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListTicketingCategoriesRequest](../../models/operations/ListTicketingCategoriesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListTicketingCategoriesResponse](../../models/operations/ListTicketingCategoriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTicketingCustomers

List all customers

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

        ListTicketingCustomersResponse res = sdk.ticketing().listTicketingCustomers()
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

## listTicketingNotes

List all notes

### Example Usage

<!-- UsageSnippet language="java" operationID="listTicketingNotes" method="get" path="/ticketing/{connection_id}/note" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTicketingNotesRequest;
import to.unified.unified_java_sdk.models.operations.ListTicketingNotesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTicketingNotesRequest req = ListTicketingNotesRequest.builder()
                .connectionId("<id>")
                .build();

        ListTicketingNotesResponse res = sdk.ticketing().listTicketingNotes()
                .request(req)
                .call();

        if (res.ticketingNotes().isPresent()) {
            System.out.println(res.ticketingNotes().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListTicketingNotesRequest](../../models/operations/ListTicketingNotesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListTicketingNotesResponse](../../models/operations/ListTicketingNotesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTicketingTickets

List all tickets

### Example Usage

<!-- UsageSnippet language="java" operationID="listTicketingTickets" method="get" path="/ticketing/{connection_id}/ticket" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTicketingTicketsRequest;
import to.unified.unified_java_sdk.models.operations.ListTicketingTicketsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTicketingTicketsRequest req = ListTicketingTicketsRequest.builder()
                .connectionId("<id>")
                .build();

        ListTicketingTicketsResponse res = sdk.ticketing().listTicketingTickets()
                .request(req)
                .call();

        if (res.ticketingTickets().isPresent()) {
            System.out.println(res.ticketingTickets().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListTicketingTicketsRequest](../../models/operations/ListTicketingTicketsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListTicketingTicketsResponse](../../models/operations/ListTicketingTicketsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchTicketingCategory

Update a category

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTicketingCategory" method="patch" path="/ticketing/{connection_id}/category/{id}" example="ticketing_category" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchTicketingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.PatchTicketingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCategory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchTicketingCategoryRequest req = PatchTicketingCategoryRequest.builder()
                .ticketingCategory(TicketingCategory.builder()
                    .createdAt(OffsetDateTime.parse("2019-10-19T22:02:51.067Z"))
                    .description("Tempus umbra cibus carpo depulso torqueo. Curtus aperiam nam optio tendo. Bardus tumultus delectus arbitro amplus tollo coerceo clam comprehendo vulnero.")
                    .id("607d0b35-27ed-4c77-9ff7-e384812051f9")
                    .isActive(true)
                    .name("amicitia")
                    .updatedAt(OffsetDateTime.parse("2025-12-15T15:11:45.243Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTicketingCategoryResponse res = sdk.ticketing().patchTicketingCategory()
                .request(req)
                .call();

        if (res.ticketingCategory().isPresent()) {
            System.out.println(res.ticketingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchTicketingCategoryRequest](../../models/operations/PatchTicketingCategoryRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchTicketingCategoryResponse](../../models/operations/PatchTicketingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchTicketingCustomer

Update a customer

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
                            .email("Christian_Windler@gmail.com")
                            .type(TicketingEmailType.HOME)
                            .build()))
                    .id("9693c0c0-2580-43e7-b5e8-50ed01af5e16")
                    .name("Christian Windler")
                    .tags(List.of(
                        "casso",
                        "peccatus"))
                    .telephones(List.of(
                        TicketingTelephone.builder()
                            .telephone("(532) 242-0482")
                            .type(TicketingTelephoneType.OTHER)
                            .build(),
                        TicketingTelephone.builder()
                            .telephone("(826) 283-7431")
                            .type(TicketingTelephoneType.MOBILE)
                            .build(),
                        TicketingTelephone.builder()
                            .telephone("(483) 314-6826")
                            .type(TicketingTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2026-05-04T07:40:10.076Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTicketingCustomerResponse res = sdk.ticketing().patchTicketingCustomer()
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

## patchTicketingNote

Update a note

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTicketingNote" method="patch" path="/ticketing/{connection_id}/note/{id}" example="ticketing_note" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchTicketingNoteRequest;
import to.unified.unified_java_sdk.models.operations.PatchTicketingNoteResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingNote;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchTicketingNoteRequest req = PatchTicketingNoteRequest.builder()
                .ticketingNote(TicketingNote.builder()
                    .createdAt(OffsetDateTime.parse("2019-07-23T15:05:03.241Z"))
                    .description("Civitas absum adipisci vitiosus recusandae tristis dedico libero comminor cena. Spes virgo absorbeo defluo nostrum.")
                    .id("4b86cac9-cf45-4def-83fb-f740e3de8c6e")
                    .updatedAt(OffsetDateTime.parse("2024-09-05T15:39:07.501Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTicketingNoteResponse res = sdk.ticketing().patchTicketingNote()
                .request(req)
                .call();

        if (res.ticketingNote().isPresent()) {
            System.out.println(res.ticketingNote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchTicketingNoteRequest](../../models/operations/PatchTicketingNoteRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchTicketingNoteResponse](../../models/operations/PatchTicketingNoteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchTicketingTicket

Update a ticket

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTicketingTicket" method="patch" path="/ticketing/{connection_id}/ticket/{id}" example="ticketing_ticket" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchTicketingTicketRequest;
import to.unified.unified_java_sdk.models.operations.PatchTicketingTicketResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchTicketingTicketRequest req = PatchTicketingTicketRequest.builder()
                .ticketingTicket(TicketingTicket.builder()
                    .attachmentIds(List.of(
                        "9197eddb-0952-47e3-9d92-bde276596617",
                        "ad106e8a-7e0f-438e-a59b-fe93218d4b16"))
                    .categoryId("vilicus")
                    .createdAt(OffsetDateTime.parse("2021-06-25T19:19:31.279Z"))
                    .description("Cura dignissimos aut clibanus vulgaris patrocinor. Laborum acies curiositas antepono coniuratio. Correptius curiositas sono censura coma. Bestia suus tot cotidie terror subito coniecto beneficium.")
                    .dueAt(OffsetDateTime.parse("2025-07-20T03:58:02.245Z"))
                    .id("df52c483-0b6f-4e68-80ae-8757d7df2d37")
                    .priority("LOW")
                    .source("atavus")
                    .sourceRef("f4065406-3997-493a-915a-e6e2f051cab8")
                    .status(TicketingTicketStatus.ACTIVE)
                    .subject("Thymbra ratione minus arbitro tricesimus cetera validus.")
                    .tags(List.of(
                        "tamen",
                        "vitae",
                        "torrens"))
                    .updatedAt(OffsetDateTime.parse("2023-05-28T07:25:49.687Z"))
                    .url("https://yellowish-testimonial.biz")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTicketingTicketResponse res = sdk.ticketing().patchTicketingTicket()
                .request(req)
                .call();

        if (res.ticketingTicket().isPresent()) {
            System.out.println(res.ticketingTicket().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchTicketingTicketRequest](../../models/operations/PatchTicketingTicketRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchTicketingTicketResponse](../../models/operations/PatchTicketingTicketResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeTicketingCategory

Remove a category

### Example Usage

<!-- UsageSnippet language="java" operationID="removeTicketingCategory" method="delete" path="/ticketing/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveTicketingCategoryRequest req = RemoveTicketingCategoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTicketingCategoryResponse res = sdk.ticketing().removeTicketingCategory()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveTicketingCategoryRequest](../../models/operations/RemoveTicketingCategoryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveTicketingCategoryResponse](../../models/operations/RemoveTicketingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeTicketingCustomer

Remove a customer

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

        RemoveTicketingCustomerResponse res = sdk.ticketing().removeTicketingCustomer()
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

## removeTicketingNote

Remove a note

### Example Usage

<!-- UsageSnippet language="java" operationID="removeTicketingNote" method="delete" path="/ticketing/{connection_id}/note/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingNoteRequest;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingNoteResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveTicketingNoteRequest req = RemoveTicketingNoteRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTicketingNoteResponse res = sdk.ticketing().removeTicketingNote()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveTicketingNoteRequest](../../models/operations/RemoveTicketingNoteRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveTicketingNoteResponse](../../models/operations/RemoveTicketingNoteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeTicketingTicket

Remove a ticket

### Example Usage

<!-- UsageSnippet language="java" operationID="removeTicketingTicket" method="delete" path="/ticketing/{connection_id}/ticket/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingTicketRequest;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingTicketResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveTicketingTicketRequest req = RemoveTicketingTicketRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTicketingTicketResponse res = sdk.ticketing().removeTicketingTicket()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveTicketingTicketRequest](../../models/operations/RemoveTicketingTicketRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveTicketingTicketResponse](../../models/operations/RemoveTicketingTicketResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTicketingCategory

Update a category

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTicketingCategory" method="put" path="/ticketing/{connection_id}/category/{id}" example="ticketing_category" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCategory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateTicketingCategoryRequest req = UpdateTicketingCategoryRequest.builder()
                .ticketingCategory(TicketingCategory.builder()
                    .createdAt(OffsetDateTime.parse("2019-10-19T22:02:51.067Z"))
                    .description("Tempus umbra cibus carpo depulso torqueo. Curtus aperiam nam optio tendo. Bardus tumultus delectus arbitro amplus tollo coerceo clam comprehendo vulnero.")
                    .id("607d0b35-27ed-4c77-9ff7-e384812051f9")
                    .isActive(true)
                    .name("amicitia")
                    .updatedAt(OffsetDateTime.parse("2025-12-15T15:11:45.243Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTicketingCategoryResponse res = sdk.ticketing().updateTicketingCategory()
                .request(req)
                .call();

        if (res.ticketingCategory().isPresent()) {
            System.out.println(res.ticketingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateTicketingCategoryRequest](../../models/operations/UpdateTicketingCategoryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateTicketingCategoryResponse](../../models/operations/UpdateTicketingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTicketingCustomer

Update a customer

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
                            .email("Christian_Windler@gmail.com")
                            .type(TicketingEmailType.HOME)
                            .build()))
                    .id("9693c0c0-2580-43e7-b5e8-50ed01af5e16")
                    .name("Christian Windler")
                    .tags(List.of(
                        "casso",
                        "peccatus"))
                    .telephones(List.of(
                        TicketingTelephone.builder()
                            .telephone("(532) 242-0482")
                            .type(TicketingTelephoneType.OTHER)
                            .build(),
                        TicketingTelephone.builder()
                            .telephone("(826) 283-7431")
                            .type(TicketingTelephoneType.MOBILE)
                            .build(),
                        TicketingTelephone.builder()
                            .telephone("(483) 314-6826")
                            .type(TicketingTelephoneType.MOBILE)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2026-05-04T07:40:10.076Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTicketingCustomerResponse res = sdk.ticketing().updateTicketingCustomer()
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

## updateTicketingNote

Update a note

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTicketingNote" method="put" path="/ticketing/{connection_id}/note/{id}" example="ticketing_note" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingNoteRequest;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingNoteResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingNote;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateTicketingNoteRequest req = UpdateTicketingNoteRequest.builder()
                .ticketingNote(TicketingNote.builder()
                    .createdAt(OffsetDateTime.parse("2019-07-23T15:05:03.241Z"))
                    .description("Civitas absum adipisci vitiosus recusandae tristis dedico libero comminor cena. Spes virgo absorbeo defluo nostrum.")
                    .id("4b86cac9-cf45-4def-83fb-f740e3de8c6e")
                    .updatedAt(OffsetDateTime.parse("2024-09-05T15:39:07.501Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTicketingNoteResponse res = sdk.ticketing().updateTicketingNote()
                .request(req)
                .call();

        if (res.ticketingNote().isPresent()) {
            System.out.println(res.ticketingNote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateTicketingNoteRequest](../../models/operations/UpdateTicketingNoteRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateTicketingNoteResponse](../../models/operations/UpdateTicketingNoteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTicketingTicket

Update a ticket

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTicketingTicket" method="put" path="/ticketing/{connection_id}/ticket/{id}" example="ticketing_ticket" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingTicketRequest;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingTicketResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateTicketingTicketRequest req = UpdateTicketingTicketRequest.builder()
                .ticketingTicket(TicketingTicket.builder()
                    .attachmentIds(List.of(
                        "9197eddb-0952-47e3-9d92-bde276596617",
                        "ad106e8a-7e0f-438e-a59b-fe93218d4b16"))
                    .categoryId("vilicus")
                    .createdAt(OffsetDateTime.parse("2021-06-25T19:19:31.279Z"))
                    .description("Cura dignissimos aut clibanus vulgaris patrocinor. Laborum acies curiositas antepono coniuratio. Correptius curiositas sono censura coma. Bestia suus tot cotidie terror subito coniecto beneficium.")
                    .dueAt(OffsetDateTime.parse("2025-07-20T03:58:02.245Z"))
                    .id("df52c483-0b6f-4e68-80ae-8757d7df2d37")
                    .priority("LOW")
                    .source("atavus")
                    .sourceRef("f4065406-3997-493a-915a-e6e2f051cab8")
                    .status(TicketingTicketStatus.ACTIVE)
                    .subject("Thymbra ratione minus arbitro tricesimus cetera validus.")
                    .tags(List.of(
                        "tamen",
                        "vitae",
                        "torrens"))
                    .updatedAt(OffsetDateTime.parse("2023-05-28T07:25:49.687Z"))
                    .url("https://yellowish-testimonial.biz")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTicketingTicketResponse res = sdk.ticketing().updateTicketingTicket()
                .request(req)
                .call();

        if (res.ticketingTicket().isPresent()) {
            System.out.println(res.ticketingTicket().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateTicketingTicketRequest](../../models/operations/UpdateTicketingTicketRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateTicketingTicketResponse](../../models/operations/UpdateTicketingTicketResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |