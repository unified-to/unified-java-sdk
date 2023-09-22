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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("provident") {{
                    jwt = "";
                }})
                .build();

            DeleteTicketingConnectionIdTicketIdRequest req = new DeleteTicketingConnectionIdTicketIdRequest("ipsa", "delectus");            

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
                .setSecurity(new Security("voluptas") {{
                    jwt = "";
                }})
                .build();

            GetTicketingConnectionIdTicketRequest req = new GetTicketingConnectionIdTicketRequest("nihil") {{
                agentId = "quae";
                customerId = "voluptas";
                limit = 3854.7d;
                offset = 4974.55d;
                order = "adipisci";
                query = "doloribus";
                sort = "ratione";
                updatedGte = OffsetDateTime.parse("2022-03-11T14:00:33.052Z");
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
                .setSecurity(new Security("quos") {{
                    jwt = "";
                }})
                .build();

            GetTicketingConnectionIdTicketIdRequest req = new GetTicketingConnectionIdTicketIdRequest("dicta", "minus");            

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
                .setSecurity(new Security("exercitationem") {{
                    jwt = "";
                }})
                .build();

            PatchTicketingConnectionIdTicketIdRequest req = new PatchTicketingConnectionIdTicketIdRequest("molestiae", "iure") {{
                ticketingTicket = new TicketingTicket(                new PropertyTicketingTicketRaw();) {{
                    category = "blanditiis";
                    closedAt = OffsetDateTime.parse("2020-09-05T03:32:51.886Z");
                    createdAt = OffsetDateTime.parse("2021-07-27T13:21:27.520Z");
                    customerId = "quaerat";
                    description = "explicabo";
                    id = "409a215e-0860-4148-9a5f-63e3af3dd9dd";
                    priority = "officia";
                    source = "dolorem";
                    sourceRef = "velit";
                    status = TicketingTicketStatus.CLOSED;
                    subject = "placeat";
                    tags = new String[]{{
                        add("pariatur"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-10-02T10:32:11.446Z");
                }};;
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
                .setSecurity(new Security("incidunt") {{
                    jwt = "";
                }})
                .build();

            PostTicketingConnectionIdTicketRequest req = new PostTicketingConnectionIdTicketRequest("praesentium") {{
                ticketingTicket = new TicketingTicket(                new PropertyTicketingTicketRaw();) {{
                    category = "ipsum";
                    closedAt = OffsetDateTime.parse("2022-03-30T16:56:59.979Z");
                    createdAt = OffsetDateTime.parse("2022-02-01T12:42:49.487Z");
                    customerId = "id";
                    description = "natus";
                    id = "8e4df37e-45b8-4955-9413-e13a48231090";
                    priority = "iure";
                    source = "cum";
                    sourceRef = "facere";
                    status = TicketingTicketStatus.ACTIVE;
                    subject = "quis";
                    tags = new String[]{{
                        add("modi"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-12-16T13:07:52.756Z");
                }};;
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
                .setSecurity(new Security("cupiditate") {{
                    jwt = "";
                }})
                .build();

            PutTicketingConnectionIdTicketIdRequest req = new PutTicketingConnectionIdTicketIdRequest("sed", "harum") {{
                ticketingTicket = new TicketingTicket(                new PropertyTicketingTicketRaw();) {{
                    category = "vero";
                    closedAt = OffsetDateTime.parse("2022-10-04T15:32:48.639Z");
                    createdAt = OffsetDateTime.parse("2022-01-17T19:19:34.032Z");
                    customerId = "consequatur";
                    description = "consequuntur";
                    id = "449d86f4-bb20-4fe5-9911-cbfe749caf45";
                    priority = "mollitia";
                    source = "sed";
                    sourceRef = "molestiae";
                    status = TicketingTicketStatus.CLOSED;
                    subject = "ex";
                    tags = new String[]{{
                        add("error"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-07-06T20:27:59.216Z");
                }};;
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

