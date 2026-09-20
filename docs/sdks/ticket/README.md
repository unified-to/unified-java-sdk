# Ticket

## Overview

### Available Operations

* [createTicketingTicket](#createticketingticket) - Create a ticket
* [getTicketingTicket](#getticketingticket) - Retrieve a ticket
* [listTicketingTickets](#listticketingtickets) - List all tickets
* [patchTicketingTicket](#patchticketingticket) - Update a ticket
* [removeTicketingTicket](#removeticketingticket) - Remove a ticket
* [updateTicketingTicket](#updateticketingticket) - Update a ticket

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
                        "ce31b5a8-4c51-4afb-a1a1-f442ceac7aaa",
                        "8e41ee05-18d0-41e9-af45-5c19957589f4"))
                    .categoryId("vilicus")
                    .createdAt(OffsetDateTime.parse("2021-06-25T19:19:31.279Z"))
                    .description("Cura dignissimos aut clibanus vulgaris patrocinor. Laborum acies curiositas antepono coniuratio. Correptius curiositas sono censura coma. Bestia suus tot cotidie terror subito coniecto beneficium.")
                    .dueAt(OffsetDateTime.parse("2025-07-21T18:09:54.156Z"))
                    .id("fbb8f879-1af5-4261-b30c-385fa263825b")
                    .priority("LOW")
                    .source("atavus")
                    .sourceRef("963da9f8-a79c-4c51-bbdc-8d7c1262b929")
                    .status(TicketingTicketStatus.ACTIVE)
                    .subject("Thymbra ratione minus arbitro tricesimus cetera validus.")
                    .tags(List.of(
                        "tamen",
                        "vitae",
                        "torrens"))
                    .updatedAt(OffsetDateTime.parse("2023-05-29T01:28:13.675Z"))
                    .url("https://yellowish-testimonial.biz")
                    .build())
                .connectionId("<id>")
                .build();

        CreateTicketingTicketResponse res = sdk.ticket().createTicketingTicket()
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

        GetTicketingTicketResponse res = sdk.ticket().getTicketingTicket()
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

        ListTicketingTicketsResponse res = sdk.ticket().listTicketingTickets()
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
                        "8947b10d-f53e-49d6-a80e-fe8a7b6067ee",
                        "3c8a4cbb-7b61-45d9-a845-cc910ee5a0ff"))
                    .categoryId("vilicus")
                    .createdAt(OffsetDateTime.parse("2021-06-25T19:19:31.279Z"))
                    .description("Cura dignissimos aut clibanus vulgaris patrocinor. Laborum acies curiositas antepono coniuratio. Correptius curiositas sono censura coma. Bestia suus tot cotidie terror subito coniecto beneficium.")
                    .dueAt(OffsetDateTime.parse("2025-07-21T18:09:54.163Z"))
                    .id("035cf295-8bf6-4b98-8f6f-b45f66498341")
                    .priority("LOW")
                    .source("atavus")
                    .sourceRef("fd8ff2ec-4edc-42cf-92e8-d351c20bf502")
                    .status(TicketingTicketStatus.ACTIVE)
                    .subject("Thymbra ratione minus arbitro tricesimus cetera validus.")
                    .tags(List.of(
                        "tamen",
                        "vitae",
                        "torrens"))
                    .updatedAt(OffsetDateTime.parse("2023-05-29T01:28:13.678Z"))
                    .url("https://yellowish-testimonial.biz")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTicketingTicketResponse res = sdk.ticket().patchTicketingTicket()
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

        RemoveTicketingTicketResponse res = sdk.ticket().removeTicketingTicket()
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
                        "8947b10d-f53e-49d6-a80e-fe8a7b6067ee",
                        "3c8a4cbb-7b61-45d9-a845-cc910ee5a0ff"))
                    .categoryId("vilicus")
                    .createdAt(OffsetDateTime.parse("2021-06-25T19:19:31.279Z"))
                    .description("Cura dignissimos aut clibanus vulgaris patrocinor. Laborum acies curiositas antepono coniuratio. Correptius curiositas sono censura coma. Bestia suus tot cotidie terror subito coniecto beneficium.")
                    .dueAt(OffsetDateTime.parse("2025-07-21T18:09:54.163Z"))
                    .id("035cf295-8bf6-4b98-8f6f-b45f66498341")
                    .priority("LOW")
                    .source("atavus")
                    .sourceRef("fd8ff2ec-4edc-42cf-92e8-d351c20bf502")
                    .status(TicketingTicketStatus.ACTIVE)
                    .subject("Thymbra ratione minus arbitro tricesimus cetera validus.")
                    .tags(List.of(
                        "tamen",
                        "vitae",
                        "torrens"))
                    .updatedAt(OffsetDateTime.parse("2023-05-29T01:28:13.678Z"))
                    .url("https://yellowish-testimonial.biz")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTicketingTicketResponse res = sdk.ticket().updateTicketingTicket()
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