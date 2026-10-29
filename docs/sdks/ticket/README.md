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

Creates a TicketingTicket. Provide the unified TicketingTicket fields in the request body; they are mapped to the provider's API. Returns the created TicketingTicket.

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
                    .attachmentIds(List.of())
                    .createdAt(OffsetDateTime.parse("2021-06-25T19:19:31.279Z"))
                    .description("Cura dignissimos aut clibanus vulgaris patrocinor. Laborum acies curiositas antepono coniuratio. Correptius curiositas sono censura coma. Bestia suus tot cotidie terror subito coniecto beneficium.")
                    .dueAt(OffsetDateTime.parse("2021-07-07T17:39:49.813Z"))
                    .id("612d81fe-b00b-40ba-90a1-9b3187f6eb01")
                    .metadata(List.of())
                    .priority("MEDIUM")
                    .source("email")
                    .status(TicketingTicketStatus.ACTIVE)
                    .subject("Thymbra ratione minus arbitro tricesimus cetera validus.")
                    .tags(List.of(
                        "vilicus"))
                    .updatedAt(OffsetDateTime.parse("2021-07-03T19:14:09.818Z"))
                    .url("https://similar-velocity.net/")
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

Retrieves a single TicketingTicket by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Returns a list of TicketingTickets. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Updates the TicketingTicket identified by `id`. Provide the unified TicketingTicket fields to change in the request body.

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
                    .attachmentIds(List.of())
                    .createdAt(OffsetDateTime.parse("2021-06-25T19:19:31.279Z"))
                    .description("Cura dignissimos aut clibanus vulgaris patrocinor. Laborum acies curiositas antepono coniuratio. Correptius curiositas sono censura coma. Bestia suus tot cotidie terror subito coniecto beneficium.")
                    .dueAt(OffsetDateTime.parse("2021-07-07T17:39:49.813Z"))
                    .id("20414f19-083b-46cf-89e4-3c683041a5c4")
                    .metadata(List.of())
                    .priority("MEDIUM")
                    .source("email")
                    .status(TicketingTicketStatus.ACTIVE)
                    .subject("Thymbra ratione minus arbitro tricesimus cetera validus.")
                    .tags(List.of(
                        "vilicus"))
                    .updatedAt(OffsetDateTime.parse("2021-07-03T19:14:09.819Z"))
                    .url("https://similar-velocity.net/")
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

Deletes the TicketingTicket identified by `id`.

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

Updates the TicketingTicket identified by `id`. Provide the unified TicketingTicket fields to change in the request body.

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
                    .attachmentIds(List.of())
                    .createdAt(OffsetDateTime.parse("2021-06-25T19:19:31.279Z"))
                    .description("Cura dignissimos aut clibanus vulgaris patrocinor. Laborum acies curiositas antepono coniuratio. Correptius curiositas sono censura coma. Bestia suus tot cotidie terror subito coniecto beneficium.")
                    .dueAt(OffsetDateTime.parse("2021-07-07T17:39:49.813Z"))
                    .id("20414f19-083b-46cf-89e4-3c683041a5c4")
                    .metadata(List.of())
                    .priority("MEDIUM")
                    .source("email")
                    .status(TicketingTicketStatus.ACTIVE)
                    .subject("Thymbra ratione minus arbitro tricesimus cetera validus.")
                    .tags(List.of(
                        "vilicus"))
                    .updatedAt(OffsetDateTime.parse("2021-07-03T19:14:09.819Z"))
                    .url("https://similar-velocity.net/")
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