# Ticket

## Overview

### Available Operations

* [createTicketingTicket2](#createticketingticket2) - Create a ticket
* [getTicketingTicket2](#getticketingticket2) - Retrieve a ticket
* [listTicketingTickets2](#listticketingtickets2) - List all tickets
* [patchTicketingTicket2](#patchticketingticket2) - Update a ticket
* [removeTicketingTicket2](#removeticketingticket2) - Remove a ticket
* [updateTicketingTicket2](#updateticketingticket2) - Update a ticket

## createTicketingTicket2

Create a ticket

### Example Usage

<!-- UsageSnippet language="java" operationID="createTicketingTicket2" method="post" path="/ticketing/{connection_id}/ticket" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateTicketingTicket2Request;
import to.unified.unified_java_sdk.models.operations.CreateTicketingTicket2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingTicket;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateTicketingTicket2Request req = CreateTicketingTicket2Request.builder()
                .ticketingTicket(TicketingTicket.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateTicketingTicket2Response res = sdk.ticket().createTicketingTicket2()
                .request(req)
                .call();

        if (res.ticketingTicket().isPresent()) {
            System.out.println(res.ticketingTicket().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateTicketingTicket2Request](../../models/operations/CreateTicketingTicket2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateTicketingTicket2Response](../../models/operations/CreateTicketingTicket2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTicketingTicket2

Retrieve a ticket

### Example Usage

<!-- UsageSnippet language="java" operationID="getTicketingTicket2" method="get" path="/ticketing/{connection_id}/ticket/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTicketingTicket2Request;
import to.unified.unified_java_sdk.models.operations.GetTicketingTicket2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTicketingTicket2Request req = GetTicketingTicket2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTicketingTicket2Response res = sdk.ticket().getTicketingTicket2()
                .request(req)
                .call();

        if (res.ticketingTicket().isPresent()) {
            System.out.println(res.ticketingTicket().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetTicketingTicket2Request](../../models/operations/GetTicketingTicket2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetTicketingTicket2Response](../../models/operations/GetTicketingTicket2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTicketingTickets2

List all tickets

### Example Usage

<!-- UsageSnippet language="java" operationID="listTicketingTickets2" method="get" path="/ticketing/{connection_id}/ticket" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTicketingTickets2Request;
import to.unified.unified_java_sdk.models.operations.ListTicketingTickets2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTicketingTickets2Request req = ListTicketingTickets2Request.builder()
                .connectionId("<id>")
                .build();

        ListTicketingTickets2Response res = sdk.ticket().listTicketingTickets2()
                .request(req)
                .call();

        if (res.ticketingTickets().isPresent()) {
            System.out.println(res.ticketingTickets().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListTicketingTickets2Request](../../models/operations/ListTicketingTickets2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListTicketingTickets2Response](../../models/operations/ListTicketingTickets2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchTicketingTicket2

Update a ticket

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTicketingTicket2" method="patch" path="/ticketing/{connection_id}/ticket/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchTicketingTicket2Request;
import to.unified.unified_java_sdk.models.operations.PatchTicketingTicket2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingTicket;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchTicketingTicket2Request req = PatchTicketingTicket2Request.builder()
                .ticketingTicket(TicketingTicket.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTicketingTicket2Response res = sdk.ticket().patchTicketingTicket2()
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
| `request`                                                                               | [PatchTicketingTicket2Request](../../models/operations/PatchTicketingTicket2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchTicketingTicket2Response](../../models/operations/PatchTicketingTicket2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeTicketingTicket2

Remove a ticket

### Example Usage

<!-- UsageSnippet language="java" operationID="removeTicketingTicket2" method="delete" path="/ticketing/{connection_id}/ticket/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingTicket2Request;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingTicket2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveTicketingTicket2Request req = RemoveTicketingTicket2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTicketingTicket2Response res = sdk.ticket().removeTicketingTicket2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveTicketingTicket2Request](../../models/operations/RemoveTicketingTicket2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveTicketingTicket2Response](../../models/operations/RemoveTicketingTicket2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTicketingTicket2

Update a ticket

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTicketingTicket2" method="put" path="/ticketing/{connection_id}/ticket/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingTicket2Request;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingTicket2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingTicket;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateTicketingTicket2Request req = UpdateTicketingTicket2Request.builder()
                .ticketingTicket(TicketingTicket.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTicketingTicket2Response res = sdk.ticket().updateTicketingTicket2()
                .request(req)
                .call();

        if (res.ticketingTicket().isPresent()) {
            System.out.println(res.ticketingTicket().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateTicketingTicket2Request](../../models/operations/UpdateTicketingTicket2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateTicketingTicket2Response](../../models/operations/UpdateTicketingTicket2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |