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
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingTicketRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingTicket;
import com.unifiedapi.unifiedto.models.shared.TicketingTicketStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("sky"){{
                    jwt = "";
                }})
                .build();

            CreateTicketingTicketRequest req = new CreateTicketingTicketRequest("Cheese"){{
                ticketingTicket = new TicketingTicket(new PropertyTicketingTicketRaw()){{
                    category = "silver Outdoors Global";
                    closedAt = OffsetDateTime.parse("2021-01-07T00:32:47.478Z");
                    createdAt = OffsetDateTime.parse("2023-08-10T16:44:56.220Z");
                    customerId = "repellendus";
                    description = "Managed cohesive customer loyalty";
                    id = "<ID>";
                    priority = "withdrawal excluding kilogram";
                    source = "ah Latin";
                    sourceRef = "vacantly South Tunisian";
                    status = TicketingTicketStatus.CLOSED;
                    subject = "hackwork";
                    tags = new String[]{{
                        add("mmm"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-01-02T22:21:38.124Z");
                }};
            }};            

            CreateTicketingTicketResponse res = sdk.ticket.createTicketingTicket(req);

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
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.CreateTicketingTicketRequest](../../models/operations/CreateTicketingTicketRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Marks"){{
                    jwt = "";
                }})
                .build();

            GetTicketingTicketRequest req = new GetTicketingTicketRequest("Dollar", "Alaska"){{
                fields = new String[]{{
                    add("Planner"),
                }};
            }};            

            GetTicketingTicketResponse res = sdk.ticket.getTicketingTicket(req);

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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetTicketingTicketRequest](../../models/operations/GetTicketingTicketRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Cisgender"){{
                    jwt = "";
                }})
                .build();

            ListTicketingTicketsRequest req = new ListTicketingTicketsRequest("archive"){{
                agentId = "invoice shyly Awesome";
                customerId = "Orchestrator Unbranded";
                fields = new String[]{{
                    add("Table"),
                }};
                limit = 8170.02d;
                offset = 3853.32d;
                order = "enshroud";
                query = "Health";
                sort = "Rial";
                updatedGte = OffsetDateTime.parse("2021-05-31T04:01:57.661Z");
            }};            

            ListTicketingTicketsResponse res = sdk.ticket.listTicketingTickets(req);

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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.ListTicketingTicketsRequest](../../models/operations/ListTicketingTicketsRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingTicketRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingTicket;
import com.unifiedapi.unifiedto.models.shared.TicketingTicketStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Bespoke"){{
                    jwt = "";
                }})
                .build();

            PatchTicketingTicketRequest req = new PatchTicketingTicketRequest("program", "smooth"){{
                ticketingTicket = new TicketingTicket(new PropertyTicketingTicketRaw()){{
                    category = "Concrete redefine Licensed";
                    closedAt = OffsetDateTime.parse("2021-11-20T17:05:11.248Z");
                    createdAt = OffsetDateTime.parse("2022-08-22T06:41:57.593Z");
                    customerId = "Neither Dinar Strategist";
                    description = "Synergized reciprocal matrix";
                    id = "<ID>";
                    priority = "Industrial Pants";
                    source = "functionalities questioning";
                    sourceRef = "Planner Steel";
                    status = TicketingTicketStatus.ACTIVE;
                    subject = "encompassing Engineer Alabama";
                    tags = new String[]{{
                        add("aha"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-05-21T12:19:00.995Z");
                }};
            }};            

            PatchTicketingTicketResponse res = sdk.ticket.patchTicketingTicket(req);

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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchTicketingTicketRequest](../../models/operations/PatchTicketingTicketRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("communities"){{
                    jwt = "";
                }})
                .build();

            RemoveTicketingTicketRequest req = new RemoveTicketingTicketRequest("Technetium", "Avon");            

            RemoveTicketingTicketResponse res = sdk.ticket.removeTicketingTicket(req);

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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.RemoveTicketingTicketRequest](../../models/operations/RemoveTicketingTicketRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


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
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingTicketRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingTicket;
import com.unifiedapi.unifiedto.models.shared.TicketingTicketStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Rhode"){{
                    jwt = "";
                }})
                .build();

            UpdateTicketingTicketRequest req = new UpdateTicketingTicketRequest("gee", "East"){{
                ticketingTicket = new TicketingTicket(new PropertyTicketingTicketRaw()){{
                    category = "caring optimal";
                    closedAt = OffsetDateTime.parse("2021-06-26T06:18:17.061Z");
                    createdAt = OffsetDateTime.parse("2022-06-27T20:32:42.434Z");
                    customerId = "Integration North array";
                    description = "Ergonomic zero tolerance open system";
                    id = "<ID>";
                    priority = "Music Investor";
                    source = "Bedfordshire vertical what";
                    sourceRef = "Bicycle";
                    status = TicketingTicketStatus.CLOSED;
                    subject = "program";
                    tags = new String[]{{
                        add("static"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-12-26T18:35:36.989Z");
                }};
            }};            

            UpdateTicketingTicketResponse res = sdk.ticket.updateTicketingTicket(req);

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
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.UpdateTicketingTicketRequest](../../models/operations/UpdateTicketingTicketRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateTicketingTicketResponse](../../models/operations/UpdateTicketingTicketResponse.md)**

