# Ticket
(*ticket*)

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

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateTicketingTicketRequest;
import com.unifiedapi.unifiedto.models.operations.CreateTicketingTicketResponse;
import com.unifiedapi.unifiedto.models.operations.CreateTicketingTicketSecurity;
import com.unifiedapi.unifiedto.models.shared.TicketingTicket;
import com.unifiedapi.unifiedto.models.shared.TicketingTicketStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateTicketingTicketRequest req = new CreateTicketingTicketRequest(
                "<value>"){{
                ticketingTicket = new TicketingTicket(
){{
                    category = "<value>";
                    closedAt = OffsetDateTime.parse("2022-06-28T15:15:03.216Z");
                    createdAt = OffsetDateTime.parse("2023-08-20T11:30:17.210Z");
                    customerId = "<value>";
                    description = "Automated composite productivity";
                    id = "<id>";
                    priority = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    source = "<value>";
                    sourceRef = "<value>";
                    status = TicketingTicketStatus.CLOSED;
                    subject = "<value>";
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    updatedAt = OffsetDateTime.parse("2024-05-06T20:46:58.372Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateTicketingTicketResponse res = sdk.ticket.createTicketingTicket(req, new CreateTicketingTicketSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.ticketingTicket != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.CreateTicketingTicketRequest](../../models/operations/CreateTicketingTicketRequest.md)   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.CreateTicketingTicketSecurity](../../models/operations/CreateTicketingTicketSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateTicketingTicketResponse](../../models/operations/CreateTicketingTicketResponse.md)**


## getTicketingTicket

Retrieve a ticket

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingTicketRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingTicketResponse;
import com.unifiedapi.unifiedto.models.operations.GetTicketingTicketSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetTicketingTicketRequest req = new GetTicketingTicketRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetTicketingTicketResponse res = sdk.ticket.getTicketingTicket(req, new GetTicketingTicketSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.ticketingTicket != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetTicketingTicketRequest](../../models/operations/GetTicketingTicketRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.GetTicketingTicketSecurity](../../models/operations/GetTicketingTicketSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingTicketResponse](../../models/operations/GetTicketingTicketResponse.md)**


## listTicketingTickets

List all tickets

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListTicketingTicketsRequest;
import com.unifiedapi.unifiedto.models.operations.ListTicketingTicketsResponse;
import com.unifiedapi.unifiedto.models.operations.ListTicketingTicketsSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListTicketingTicketsRequest req = new ListTicketingTicketsRequest(
                "<value>"){{
                customerId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 6139.39d;
                offset = 1839.22d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2023-02-28T23:31:15.090Z");
                userId = "<value>";

            }};

            com.unifiedapi.unifiedto.models.operations.ListTicketingTicketsResponse res = sdk.ticket.listTicketingTickets(req, new ListTicketingTicketsSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.ticketingTickets != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.ListTicketingTicketsRequest](../../models/operations/ListTicketingTicketsRequest.md)   | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.ListTicketingTicketsSecurity](../../models/operations/ListTicketingTicketsSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListTicketingTicketsResponse](../../models/operations/ListTicketingTicketsResponse.md)**


## patchTicketingTicket

Update a ticket

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingTicketRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingTicketResponse;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingTicketSecurity;
import com.unifiedapi.unifiedto.models.shared.TicketingTicket;
import com.unifiedapi.unifiedto.models.shared.TicketingTicketStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchTicketingTicketRequest req = new PatchTicketingTicketRequest(
                "<value>",
                "<value>"){{
                ticketingTicket = new TicketingTicket(
){{
                    category = "<value>";
                    closedAt = OffsetDateTime.parse("2022-09-14T17:48:05.161Z");
                    createdAt = OffsetDateTime.parse("2023-09-30T13:19:53.416Z");
                    customerId = "<value>";
                    description = "Operative composite strategy";
                    id = "<id>";
                    priority = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    source = "<value>";
                    sourceRef = "<value>";
                    status = TicketingTicketStatus.CLOSED;
                    subject = "<value>";
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    updatedAt = OffsetDateTime.parse("2024-07-06T12:10:37.068Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchTicketingTicketResponse res = sdk.ticket.patchTicketingTicket(req, new PatchTicketingTicketSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.ticketingTicket != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PatchTicketingTicketRequest](../../models/operations/PatchTicketingTicketRequest.md)   | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PatchTicketingTicketSecurity](../../models/operations/PatchTicketingTicketSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchTicketingTicketResponse](../../models/operations/PatchTicketingTicketResponse.md)**


## removeTicketingTicket

Remove a ticket

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveTicketingTicketRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveTicketingTicketResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveTicketingTicketSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveTicketingTicketRequest req = new RemoveTicketingTicketRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveTicketingTicketResponse res = sdk.ticket.removeTicketingTicket(req, new RemoveTicketingTicketSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.RemoveTicketingTicketRequest](../../models/operations/RemoveTicketingTicketRequest.md)   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.RemoveTicketingTicketSecurity](../../models/operations/RemoveTicketingTicketSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveTicketingTicketResponse](../../models/operations/RemoveTicketingTicketResponse.md)**


## updateTicketingTicket

Update a ticket

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateTicketingTicketRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateTicketingTicketResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateTicketingTicketSecurity;
import com.unifiedapi.unifiedto.models.shared.TicketingTicket;
import com.unifiedapi.unifiedto.models.shared.TicketingTicketStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateTicketingTicketRequest req = new UpdateTicketingTicketRequest(
                "<value>",
                "<value>"){{
                ticketingTicket = new TicketingTicket(
){{
                    category = "<value>";
                    closedAt = OffsetDateTime.parse("2022-05-31T01:36:42.106Z");
                    createdAt = OffsetDateTime.parse("2024-04-29T13:04:08.966Z");
                    customerId = "<value>";
                    description = "Configurable user-facing middleware";
                    id = "<id>";
                    priority = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    source = "<value>";
                    sourceRef = "<value>";
                    status = TicketingTicketStatus.ACTIVE;
                    subject = "<value>";
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-01-17T01:38:48.188Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateTicketingTicketResponse res = sdk.ticket.updateTicketingTicket(req, new UpdateTicketingTicketSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.ticketingTicket != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.UpdateTicketingTicketRequest](../../models/operations/UpdateTicketingTicketRequest.md)   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.UpdateTicketingTicketSecurity](../../models/operations/UpdateTicketingTicketSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateTicketingTicketResponse](../../models/operations/UpdateTicketingTicketResponse.md)**

