# Ticket
(*ticket()*)

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

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.CreateTicketingTicketRequest;
import to.unified.unifiedto.models.operations.CreateTicketingTicketResponse;
import to.unified.unifiedto.models.shared.Security;
import to.unified.unifiedto.models.shared.TicketingTicket;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateTicketingTicketRequest req = CreateTicketingTicketRequest.builder()
                .ticketingTicket(TicketingTicket.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateTicketingTicketResponse res = sdk.ticket().createTicketingTicket()
                .request(req)
                .call();

        if (res.ticketingTicket().isPresent()) {
            // handle response
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

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.GetTicketingTicketRequest;
import to.unified.unifiedto.models.operations.GetTicketingTicketResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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
            // handle response
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

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListTicketingTicketsRequest;
import to.unified.unifiedto.models.operations.ListTicketingTicketsResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListTicketingTicketsRequest req = ListTicketingTicketsRequest.builder()
                .connectionId("<id>")
                .build();

        ListTicketingTicketsResponse res = sdk.ticket().listTicketingTickets()
                .request(req)
                .call();

        if (res.ticketingTickets().isPresent()) {
            // handle response
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

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.PatchTicketingTicketRequest;
import to.unified.unifiedto.models.operations.PatchTicketingTicketResponse;
import to.unified.unifiedto.models.shared.Security;
import to.unified.unifiedto.models.shared.TicketingTicket;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchTicketingTicketRequest req = PatchTicketingTicketRequest.builder()
                .ticketingTicket(TicketingTicket.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTicketingTicketResponse res = sdk.ticket().patchTicketingTicket()
                .request(req)
                .call();

        if (res.ticketingTicket().isPresent()) {
            // handle response
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

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.RemoveTicketingTicketRequest;
import to.unified.unifiedto.models.operations.RemoveTicketingTicketResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.UpdateTicketingTicketRequest;
import to.unified.unifiedto.models.operations.UpdateTicketingTicketResponse;
import to.unified.unifiedto.models.shared.Security;
import to.unified.unifiedto.models.shared.TicketingTicket;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateTicketingTicketRequest req = UpdateTicketingTicketRequest.builder()
                .ticketingTicket(TicketingTicket.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTicketingTicketResponse res = sdk.ticket().updateTicketingTicket()
                .request(req)
                .call();

        if (res.ticketingTicket().isPresent()) {
            // handle response
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