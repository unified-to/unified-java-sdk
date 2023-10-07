# Ticket
(*ticket*)

### Available Operations

* [deleteTicketingConnectionIdTicketId](#deleteticketingconnectionidticketid) - Remove a ticket
* [getTicketingConnectionIdTicket](#getticketingconnectionidticket) - List all tickets
* [getTicketingConnectionIdTicketId](#getticketingconnectionidticketid) - Retrieve a ticket
* [patchTicketingConnectionIdTicketId](#patchticketingconnectionidticketid) - Update a ticket
* [postTicketingConnectionIdTicket](#postticketingconnectionidticket) - Create a ticket
* [putTicketingConnectionIdTicketId](#putticketingconnectionidticketid) - Update a ticket

## deleteTicketingConnectionIdTicketId

Remove a ticket

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdTicketIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdTicketIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("lavender"){{
                    jwt = "";
                }})
                .build();

            DeleteTicketingConnectionIdTicketIdRequest req = new DeleteTicketingConnectionIdTicketIdRequest("Southwest", "meanwhile");            

            DeleteTicketingConnectionIdTicketIdResponse res = sdk.ticket.deleteTicketingConnectionIdTicketId(req);

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

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdTicketIdRequest](../../models/operations/DeleteTicketingConnectionIdTicketIdRequest.md) | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdTicketIdResponse](../../models/operations/DeleteTicketingConnectionIdTicketIdResponse.md)**


## getTicketingConnectionIdTicket

List all tickets

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdTicketRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdTicketResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Bronze"){{
                    jwt = "";
                }})
                .build();

            GetTicketingConnectionIdTicketRequest req = new GetTicketingConnectionIdTicketRequest("Funk"){{
                agentId = "hertz Savings Steel";
                customerId = "payment biopsy Kids";
                limit = 7673.64d;
                offset = 5134.74d;
                order = "quantifying orange";
                query = "male dynamic";
                sort = "Sedan Tricycle Honda";
                updatedGte = OffsetDateTime.parse("2022-08-06T21:30:52.879Z");
            }};            

            GetTicketingConnectionIdTicketResponse res = sdk.ticket.getTicketingConnectionIdTicket(req);

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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdTicketRequest](../../models/operations/GetTicketingConnectionIdTicketRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdTicketResponse](../../models/operations/GetTicketingConnectionIdTicketResponse.md)**


## getTicketingConnectionIdTicketId

Retrieve a ticket

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdTicketIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdTicketIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Florida"){{
                    jwt = "";
                }})
                .build();

            GetTicketingConnectionIdTicketIdRequest req = new GetTicketingConnectionIdTicketIdRequest("Ohio", "scalable");            

            GetTicketingConnectionIdTicketIdResponse res = sdk.ticket.getTicketingConnectionIdTicketId(req);

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdTicketIdRequest](../../models/operations/GetTicketingConnectionIdTicketIdRequest.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdTicketIdResponse](../../models/operations/GetTicketingConnectionIdTicketIdResponse.md)**


## patchTicketingConnectionIdTicketId

Update a ticket

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdTicketIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdTicketIdResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingTicketRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingTicket;
import com.unifiedapi.unifiedto.models.shared.TicketingTicketStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Polygender"){{
                    jwt = "";
                }})
                .build();

            PatchTicketingConnectionIdTicketIdRequest req = new PatchTicketingConnectionIdTicketIdRequest("messenger", "Principal"){{
                ticketingTicket = new TicketingTicket(new PropertyTicketingTicketRaw()){{
                    category = "extend given Investor";
                    closedAt = OffsetDateTime.parse("2023-12-07T18:07:23.872Z");
                    createdAt = OffsetDateTime.parse("2022-10-21T07:37:31.857Z");
                    customerId = "Serbia";
                    description = "Persistent grid-enabled secured line";
                    id = "<ID>";
                    priority = "Bicycle";
                    source = "Northeast Americium Hybrid";
                    sourceRef = "Implementation";
                    status = TicketingTicketStatus.ACTIVE;
                    subject = "Reggae";
                    tags = new String[]{{
                        add("yahoo"),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-03-02T21:08:11.761Z");
                }};
            }};            

            PatchTicketingConnectionIdTicketIdResponse res = sdk.ticket.patchTicketingConnectionIdTicketId(req);

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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdTicketIdRequest](../../models/operations/PatchTicketingConnectionIdTicketIdRequest.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdTicketIdResponse](../../models/operations/PatchTicketingConnectionIdTicketIdResponse.md)**


## postTicketingConnectionIdTicket

Create a ticket

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdTicketRequest;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdTicketResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingTicketRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingTicket;
import com.unifiedapi.unifiedto.models.shared.TicketingTicketStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Alabama"){{
                    jwt = "";
                }})
                .build();

            PostTicketingConnectionIdTicketRequest req = new PostTicketingConnectionIdTicketRequest("Electronics"){{
                ticketingTicket = new TicketingTicket(new PropertyTicketingTicketRaw()){{
                    category = "mobile parse Jeep";
                    closedAt = OffsetDateTime.parse("2022-11-15T22:23:01.161Z");
                    createdAt = OffsetDateTime.parse("2022-10-28T10:15:53.503Z");
                    customerId = "Cisgender Sedan Southwest";
                    description = "Seamless intangible open architecture";
                    id = "<ID>";
                    priority = "solid Electric Bespoke";
                    source = "Customer repellat carrot";
                    sourceRef = "Oriental";
                    status = TicketingTicketStatus.CLOSED;
                    subject = "Zambia chunter";
                    tags = new String[]{{
                        add("Coupe"),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-11-20T07:08:03.818Z");
                }};
            }};            

            PostTicketingConnectionIdTicketResponse res = sdk.ticket.postTicketingConnectionIdTicket(req);

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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdTicketRequest](../../models/operations/PostTicketingConnectionIdTicketRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdTicketResponse](../../models/operations/PostTicketingConnectionIdTicketResponse.md)**


## putTicketingConnectionIdTicketId

Update a ticket

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdTicketIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdTicketIdResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingTicketRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingTicket;
import com.unifiedapi.unifiedto.models.shared.TicketingTicketStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("driver"){{
                    jwt = "";
                }})
                .build();

            PutTicketingConnectionIdTicketIdRequest req = new PutTicketingConnectionIdTicketIdRequest("North", "holistic"){{
                ticketingTicket = new TicketingTicket(new PropertyTicketingTicketRaw()){{
                    category = "Rubber Jadyn drat";
                    closedAt = OffsetDateTime.parse("2023-09-11T23:18:33.662Z");
                    createdAt = OffsetDateTime.parse("2022-04-03T16:02:49.250Z");
                    customerId = "Upgradable knuckle";
                    description = "Front-line well-modulated challenge";
                    id = "<ID>";
                    priority = "manifest";
                    source = "Wooden Crew";
                    sourceRef = "fuchsia iusto Ferrari";
                    status = TicketingTicketStatus.ACTIVE;
                    subject = "South female Pants";
                    tags = new String[]{{
                        add("Cis"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-09-18T19:21:55.137Z");
                }};
            }};            

            PutTicketingConnectionIdTicketIdResponse res = sdk.ticket.putTicketingConnectionIdTicketId(req);

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdTicketIdRequest](../../models/operations/PutTicketingConnectionIdTicketIdRequest.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdTicketIdResponse](../../models/operations/PutTicketingConnectionIdTicketIdResponse.md)**

