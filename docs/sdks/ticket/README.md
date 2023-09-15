# Ticket

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
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdTicketIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteTicketingConnectionIdTicketIdRequest req = new DeleteTicketingConnectionIdTicketIdRequest("maiores", "et");            

            DeleteTicketingConnectionIdTicketIdResponse res = sdk.ticket.deleteTicketingConnectionIdTicketId(req, new DeleteTicketingConnectionIdTicketIdSecurity("harum") {{
                jwt = "";
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

| Parameter                                                                                                                                                        | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdTicketIdRequest](../../models/operations/DeleteTicketingConnectionIdTicketIdRequest.md)   | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |
| `security`                                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdTicketIdSecurity](../../models/operations/DeleteTicketingConnectionIdTicketIdSecurity.md) | :heavy_check_mark:                                                                                                                                               | The security requirements to use for the request.                                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdTicketSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetTicketingConnectionIdTicketRequest req = new GetTicketingConnectionIdTicketRequest("a") {{
                agentId = "alias";
                customerId = "tempore";
                limit = 8005.09d;
                offset = 5187.28d;
                order = "officiis";
                query = "dicta";
                sort = "maiores";
                updatedGte = OffsetDateTime.parse("2022-12-24T20:43:33.357Z");
            }};            

            GetTicketingConnectionIdTicketResponse res = sdk.ticket.getTicketingConnectionIdTicket(req, new GetTicketingConnectionIdTicketSecurity("eum") {{
                jwt = "";
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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdTicketRequest](../../models/operations/GetTicketingConnectionIdTicketRequest.md)   | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |
| `security`                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdTicketSecurity](../../models/operations/GetTicketingConnectionIdTicketSecurity.md) | :heavy_check_mark:                                                                                                                                     | The security requirements to use for the request.                                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdTicketIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetTicketingConnectionIdTicketIdRequest req = new GetTicketingConnectionIdTicketIdRequest("nulla", "corporis");            

            GetTicketingConnectionIdTicketIdResponse res = sdk.ticket.getTicketingConnectionIdTicketId(req, new GetTicketingConnectionIdTicketIdSecurity("pariatur") {{
                jwt = "";
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

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdTicketIdRequest](../../models/operations/GetTicketingConnectionIdTicketIdRequest.md)   | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |
| `security`                                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdTicketIdSecurity](../../models/operations/GetTicketingConnectionIdTicketIdSecurity.md) | :heavy_check_mark:                                                                                                                                         | The security requirements to use for the request.                                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdTicketIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingTicketRaw;
import com.unifiedapi.unifiedto.models.shared.TicketingTicket;
import com.unifiedapi.unifiedto.models.shared.TicketingTicketStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchTicketingConnectionIdTicketIdRequest req = new PatchTicketingConnectionIdTicketIdRequest("quas", "sequi") {{
                ticketingTicket = new TicketingTicket(                new PropertyTicketingTicketRaw();) {{
                    category = "illo";
                    closedAt = OffsetDateTime.parse("2022-11-17T19:42:22.856Z");
                    createdAt = OffsetDateTime.parse("2022-06-28T10:44:12.453Z");
                    customerId = "ab";
                    description = "voluptatem";
                    id = "90f67066-73f3-4a68-9c57-68dce742409a";
                    priority = "odit";
                    source = "beatae";
                    sourceRef = "exercitationem";
                    status = TicketingTicketStatus.CLOSED;
                    subject = "eaque";
                    tags = new String[]{{
                        add("blanditiis"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-12-26T07:12:59.937Z");
                }};;
            }};            

            PatchTicketingConnectionIdTicketIdResponse res = sdk.ticket.patchTicketingConnectionIdTicketId(req, new PatchTicketingConnectionIdTicketIdSecurity("vitae") {{
                jwt = "";
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

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdTicketIdRequest](../../models/operations/PatchTicketingConnectionIdTicketIdRequest.md)   | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |
| `security`                                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdTicketIdSecurity](../../models/operations/PatchTicketingConnectionIdTicketIdSecurity.md) | :heavy_check_mark:                                                                                                                                             | The security requirements to use for the request.                                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdTicketSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingTicketRaw;
import com.unifiedapi.unifiedto.models.shared.TicketingTicket;
import com.unifiedapi.unifiedto.models.shared.TicketingTicketStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostTicketingConnectionIdTicketRequest req = new PostTicketingConnectionIdTicketRequest("tempora") {{
                ticketingTicket = new TicketingTicket(                new PropertyTicketingTicketRaw();) {{
                    category = "molestias";
                    closedAt = OffsetDateTime.parse("2021-09-19T15:16:39.355Z");
                    createdAt = OffsetDateTime.parse("2022-01-05T17:04:41.295Z");
                    customerId = "suscipit";
                    description = "sequi";
                    id = "e3af3dd9-dda3-43dc-9634-83e4a7a98e4d";
                    priority = "maiores";
                    source = "neque";
                    sourceRef = "in";
                    status = TicketingTicketStatus.CLOSED;
                    subject = "quaerat";
                    tags = new String[]{{
                        add("nostrum"),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-12-18T18:36:43.695Z");
                }};;
            }};            

            PostTicketingConnectionIdTicketResponse res = sdk.ticket.postTicketingConnectionIdTicket(req, new PostTicketingConnectionIdTicketSecurity("omnis") {{
                jwt = "";
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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdTicketRequest](../../models/operations/PostTicketingConnectionIdTicketRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdTicketSecurity](../../models/operations/PostTicketingConnectionIdTicketSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdTicketIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingTicketRaw;
import com.unifiedapi.unifiedto.models.shared.TicketingTicket;
import com.unifiedapi.unifiedto.models.shared.TicketingTicketStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutTicketingConnectionIdTicketIdRequest req = new PutTicketingConnectionIdTicketIdRequest("veniam", "nostrum") {{
                ticketingTicket = new TicketingTicket(                new PropertyTicketingTicketRaw();) {{
                    category = "facere";
                    closedAt = OffsetDateTime.parse("2022-11-21T17:26:47.496Z");
                    createdAt = OffsetDateTime.parse("2022-01-28T23:39:38.106Z");
                    customerId = "inventore";
                    description = "ipsum";
                    id = "a4823109-07bd-4354-8092-bd734f02449d";
                    priority = "voluptatum";
                    source = "vel";
                    sourceRef = "delectus";
                    status = TicketingTicketStatus.ACTIVE;
                    subject = "expedita";
                    tags = new String[]{{
                        add("quidem"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-12-13T07:14:20.285Z");
                }};;
            }};            

            PutTicketingConnectionIdTicketIdResponse res = sdk.ticket.putTicketingConnectionIdTicketId(req, new PutTicketingConnectionIdTicketIdSecurity("asperiores") {{
                jwt = "";
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

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdTicketIdRequest](../../models/operations/PutTicketingConnectionIdTicketIdRequest.md)   | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |
| `security`                                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdTicketIdSecurity](../../models/operations/PutTicketingConnectionIdTicketIdSecurity.md) | :heavy_check_mark:                                                                                                                                         | The security requirements to use for the request.                                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdTicketIdResponse](../../models/operations/PutTicketingConnectionIdTicketIdResponse.md)**

