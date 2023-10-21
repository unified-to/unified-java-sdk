# Ticketing
(*ticketing*)

### Available Operations

* [createTicketingCustomer](#createticketingcustomer) - Create a customer
* [createTicketingNote](#createticketingnote) - Create a note
* [createTicketingTicket](#createticketingticket) - Create a ticket
* [getTicketingCustomer](#getticketingcustomer) - Retrieve a customer
* [getTicketingNote](#getticketingnote) - Retrieve a note
* [getTicketingTicket](#getticketingticket) - Retrieve a ticket
* [listTicketingCustomers](#listticketingcustomers) - List all customers
* [listTicketingNotes](#listticketingnotes) - List all notes
* [listTicketingTickets](#listticketingtickets) - List all tickets
* [patchTicketingCustomer](#patchticketingcustomer) - Update a customer
* [patchTicketingNote](#patchticketingnote) - Update a note
* [patchTicketingTicket](#patchticketingticket) - Update a ticket
* [removeTicketingCustomer](#removeticketingcustomer) - Remove a customer
* [removeTicketingNote](#removeticketingnote) - Remove a note
* [removeTicketingTicket](#removeticketingticket) - Remove a ticket
* [updateTicketingCustomer](#updateticketingcustomer) - Update a customer
* [updateTicketingNote](#updateticketingnote) - Update a note
* [updateTicketingTicket](#updateticketingticket) - Update a ticket

## createTicketingCustomer

Create a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateTicketingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.CreateTicketingCustomerResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingCustomer;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            CreateTicketingCustomerRequest req = new CreateTicketingCustomerRequest("string"){{
                ticketingCustomer = new TicketingCustomer(new PropertyTicketingCustomerRaw()){{
                    createdAt = OffsetDateTime.parse("2022-06-19T07:03:19.095Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("string"){{
                            email = "Jenifer.Friesen50@yahoo.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "string";
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-08-22T11:52:38.346Z");
                }};
            }};            

            CreateTicketingCustomerResponse res = sdk.ticketing.createTicketingCustomer(req);

            if (res.ticketingCustomer != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.CreateTicketingCustomerRequest](../../models/operations/CreateTicketingCustomerRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateTicketingCustomerResponse](../../models/operations/CreateTicketingCustomerResponse.md)**


## createTicketingNote

Create a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateTicketingNoteRequest;
import com.unifiedapi.unifiedto.models.operations.CreateTicketingNoteResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingNoteRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            CreateTicketingNoteRequest req = new CreateTicketingNoteRequest("string", "string"){{
                ticketingNote = new TicketingNote(new PropertyTicketingNoteRaw()){{
                    agentId = "string";
                    createdAt = OffsetDateTime.parse("2023-04-20T19:05:27.564Z");
                    customerId = "string";
                    description = "Distributed 4th generation portal";
                    id = "<ID>";
                    updatedAt = "string";
                }};
            }};            

            CreateTicketingNoteResponse res = sdk.ticketing.createTicketingNote(req);

            if (res.ticketingNote != null) {
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
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.CreateTicketingNoteRequest](../../models/operations/CreateTicketingNoteRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateTicketingNoteResponse](../../models/operations/CreateTicketingNoteResponse.md)**


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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            CreateTicketingTicketRequest req = new CreateTicketingTicketRequest("string"){{
                ticketingTicket = new TicketingTicket(new PropertyTicketingTicketRaw()){{
                    category = "string";
                    closedAt = OffsetDateTime.parse("2021-06-28T11:20:21.005Z");
                    createdAt = OffsetDateTime.parse("2022-08-19T22:26:35.479Z");
                    customerId = "string";
                    description = "Automated composite productivity";
                    id = "<ID>";
                    priority = "string";
                    source = "string";
                    sourceRef = "string";
                    status = TicketingTicketStatus.CLOSED;
                    subject = "string";
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-05-07T02:01:09.815Z");
                }};
            }};            

            CreateTicketingTicketResponse res = sdk.ticketing.createTicketingTicket(req);

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


## getTicketingCustomer

Retrieve a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingCustomerResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            GetTicketingCustomerRequest req = new GetTicketingCustomerRequest("string", "string"){{
                fields = new String[]{{
                    add("string"),
                }};
            }};            

            GetTicketingCustomerResponse res = sdk.ticketing.getTicketingCustomer(req);

            if (res.ticketingCustomer != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetTicketingCustomerRequest](../../models/operations/GetTicketingCustomerRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingCustomerResponse](../../models/operations/GetTicketingCustomerResponse.md)**


## getTicketingNote

Retrieve a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingNoteRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingNoteResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            GetTicketingNoteRequest req = new GetTicketingNoteRequest("string", "string", "string"){{
                fields = new String[]{{
                    add("string"),
                }};
            }};            

            GetTicketingNoteResponse res = sdk.ticketing.getTicketingNote(req);

            if (res.ticketingNote != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetTicketingNoteRequest](../../models/operations/GetTicketingNoteRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingNoteResponse](../../models/operations/GetTicketingNoteResponse.md)**


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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            GetTicketingTicketRequest req = new GetTicketingTicketRequest("string", "string"){{
                fields = new String[]{{
                    add("string"),
                }};
            }};            

            GetTicketingTicketResponse res = sdk.ticketing.getTicketingTicket(req);

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


## listTicketingCustomers

List all customers

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListTicketingCustomersRequest;
import com.unifiedapi.unifiedto.models.operations.ListTicketingCustomersResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            ListTicketingCustomersRequest req = new ListTicketingCustomersRequest("string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 3917.11d;
                offset = 274.81d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2021-06-05T16:20:32.808Z");
            }};            

            ListTicketingCustomersResponse res = sdk.ticketing.listTicketingCustomers(req);

            if (res.ticketingCustomers != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListTicketingCustomersRequest](../../models/operations/ListTicketingCustomersRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListTicketingCustomersResponse](../../models/operations/ListTicketingCustomersResponse.md)**


## listTicketingNotes

List all notes

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListTicketingNotesRequest;
import com.unifiedapi.unifiedto.models.operations.ListTicketingNotesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            ListTicketingNotesRequest req = new ListTicketingNotesRequest("string", "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 6345.23d;
                offset = 8100.5d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2023-09-20T18:22:08.785Z");
            }};            

            ListTicketingNotesResponse res = sdk.ticketing.listTicketingNotes(req);

            if (res.ticketingNotes != null) {
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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.ListTicketingNotesRequest](../../models/operations/ListTicketingNotesRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListTicketingNotesResponse](../../models/operations/ListTicketingNotesResponse.md)**


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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            ListTicketingTicketsRequest req = new ListTicketingTicketsRequest("string"){{
                agentId = "string";
                customerId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 6139.39d;
                offset = 1839.22d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2022-02-28T14:14:11.846Z");
            }};            

            ListTicketingTicketsResponse res = sdk.ticketing.listTicketingTickets(req);

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


## patchTicketingCustomer

Update a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingCustomerResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingCustomer;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            PatchTicketingCustomerRequest req = new PatchTicketingCustomerRequest("string", "string"){{
                ticketingCustomer = new TicketingCustomer(new PropertyTicketingCustomerRaw()){{
                    createdAt = OffsetDateTime.parse("2023-06-30T19:19:15.782Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("string"){{
                            email = "Rosalinda.Abshire11@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "string";
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-10-01T03:16:10.656Z");
                }};
            }};            

            PatchTicketingCustomerResponse res = sdk.ticketing.patchTicketingCustomer(req);

            if (res.ticketingCustomer != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchTicketingCustomerRequest](../../models/operations/PatchTicketingCustomerRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchTicketingCustomerResponse](../../models/operations/PatchTicketingCustomerResponse.md)**


## patchTicketingNote

Update a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingNoteRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingNoteResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingNoteRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            PatchTicketingNoteRequest req = new PatchTicketingNoteRequest("string", "string", "string"){{
                ticketingNote = new TicketingNote(new PropertyTicketingNoteRaw()){{
                    agentId = "string";
                    createdAt = OffsetDateTime.parse("2023-09-04T23:33:24.591Z");
                    customerId = "string";
                    description = "Right-sized national productivity";
                    id = "<ID>";
                    updatedAt = "string";
                }};
            }};            

            PatchTicketingNoteResponse res = sdk.ticketing.patchTicketingNote(req);

            if (res.ticketingNote != null) {
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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchTicketingNoteRequest](../../models/operations/PatchTicketingNoteRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchTicketingNoteResponse](../../models/operations/PatchTicketingNoteResponse.md)**


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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            PatchTicketingTicketRequest req = new PatchTicketingTicketRequest("string", "string"){{
                ticketingTicket = new TicketingTicket(new PropertyTicketingTicketRaw()){{
                    category = "string";
                    closedAt = OffsetDateTime.parse("2021-09-14T12:10:45.667Z");
                    createdAt = OffsetDateTime.parse("2022-09-29T23:22:13.568Z");
                    customerId = "string";
                    description = "Operative composite strategy";
                    id = "<ID>";
                    priority = "string";
                    source = "string";
                    sourceRef = "string";
                    status = TicketingTicketStatus.CLOSED;
                    subject = "string";
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-07-06T16:05:08.020Z");
                }};
            }};            

            PatchTicketingTicketResponse res = sdk.ticketing.patchTicketingTicket(req);

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


## removeTicketingCustomer

Remove a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveTicketingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveTicketingCustomerResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            RemoveTicketingCustomerRequest req = new RemoveTicketingCustomerRequest("string", "string");            

            RemoveTicketingCustomerResponse res = sdk.ticketing.removeTicketingCustomer(req);

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveTicketingCustomerRequest](../../models/operations/RemoveTicketingCustomerRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveTicketingCustomerResponse](../../models/operations/RemoveTicketingCustomerResponse.md)**


## removeTicketingNote

Remove a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveTicketingNoteRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveTicketingNoteResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            RemoveTicketingNoteRequest req = new RemoveTicketingNoteRequest("string", "string", "string");            

            RemoveTicketingNoteResponse res = sdk.ticketing.removeTicketingNote(req);

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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.RemoveTicketingNoteRequest](../../models/operations/RemoveTicketingNoteRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveTicketingNoteResponse](../../models/operations/RemoveTicketingNoteResponse.md)**


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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            RemoveTicketingTicketRequest req = new RemoveTicketingTicketRequest("string", "string");            

            RemoveTicketingTicketResponse res = sdk.ticketing.removeTicketingTicket(req);

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


## updateTicketingCustomer

Update a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateTicketingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateTicketingCustomerResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingCustomer;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            UpdateTicketingCustomerRequest req = new UpdateTicketingCustomerRequest("string", "string"){{
                ticketingCustomer = new TicketingCustomer(new PropertyTicketingCustomerRaw()){{
                    createdAt = OffsetDateTime.parse("2023-10-13T13:29:08.944Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("string"){{
                            email = "Demetris72@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "string";
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-06-02T10:57:20.628Z");
                }};
            }};            

            UpdateTicketingCustomerResponse res = sdk.ticketing.updateTicketingCustomer(req);

            if (res.ticketingCustomer != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateTicketingCustomerRequest](../../models/operations/UpdateTicketingCustomerRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateTicketingCustomerResponse](../../models/operations/UpdateTicketingCustomerResponse.md)**


## updateTicketingNote

Update a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateTicketingNoteRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateTicketingNoteResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingNoteRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            UpdateTicketingNoteRequest req = new UpdateTicketingNoteRequest("string", "string", "string"){{
                ticketingNote = new TicketingNote(new PropertyTicketingNoteRaw()){{
                    agentId = "string";
                    createdAt = OffsetDateTime.parse("2023-05-15T06:19:14.487Z");
                    customerId = "string";
                    description = "Versatile value-added utilisation";
                    id = "<ID>";
                    updatedAt = "string";
                }};
            }};            

            UpdateTicketingNoteResponse res = sdk.ticketing.updateTicketingNote(req);

            if (res.ticketingNote != null) {
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
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.UpdateTicketingNoteRequest](../../models/operations/UpdateTicketingNoteRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateTicketingNoteResponse](../../models/operations/UpdateTicketingNoteResponse.md)**


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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            UpdateTicketingTicketRequest req = new UpdateTicketingTicketRequest("string", "string"){{
                ticketingTicket = new TicketingTicket(new PropertyTicketingTicketRaw()){{
                    category = "string";
                    closedAt = OffsetDateTime.parse("2021-05-30T22:19:31.995Z");
                    createdAt = OffsetDateTime.parse("2023-04-29T18:27:57.571Z");
                    customerId = "string";
                    description = "Configurable user-facing middleware";
                    id = "<ID>";
                    priority = "string";
                    source = "string";
                    sourceRef = "string";
                    status = TicketingTicketStatus.ACTIVE;
                    subject = "string";
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-01-16T17:18:07.743Z");
                }};
            }};            

            UpdateTicketingTicketResponse res = sdk.ticketing.updateTicketingTicket(req);

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

