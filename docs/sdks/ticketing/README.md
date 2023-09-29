# Ticketing
(*ticketing*)

### Available Operations

* [deleteTicketingConnectionIdAgentId](#deleteticketingconnectionidagentid) - Remove a agent
* [deleteTicketingConnectionIdCustomerId](#deleteticketingconnectionidcustomerid) - Remove a customer
* [deleteTicketingConnectionIdNoteTicketIdId](#deleteticketingconnectionidnoteticketidid) - Remove a note
* [deleteTicketingConnectionIdTicketId](#deleteticketingconnectionidticketid) - Remove a ticket
* [getTicketingConnectionIdAgent](#getticketingconnectionidagent) - List all agents
* [getTicketingConnectionIdAgentId](#getticketingconnectionidagentid) - Retrieve a agent
* [getTicketingConnectionIdCustomer](#getticketingconnectionidcustomer) - List all customers
* [getTicketingConnectionIdCustomerId](#getticketingconnectionidcustomerid) - Retrieve a customer
* [getTicketingConnectionIdNoteTicketId](#getticketingconnectionidnoteticketid) - List all notes
* [getTicketingConnectionIdNoteTicketIdId](#getticketingconnectionidnoteticketidid) - Retrieve a note
* [getTicketingConnectionIdTicket](#getticketingconnectionidticket) - List all tickets
* [getTicketingConnectionIdTicketId](#getticketingconnectionidticketid) - Retrieve a ticket
* [patchTicketingConnectionIdAgentId](#patchticketingconnectionidagentid) - Update a agent
* [patchTicketingConnectionIdCustomerId](#patchticketingconnectionidcustomerid) - Update a customer
* [patchTicketingConnectionIdNoteTicketIdId](#patchticketingconnectionidnoteticketidid) - Update a note
* [patchTicketingConnectionIdTicketId](#patchticketingconnectionidticketid) - Update a ticket
* [postTicketingConnectionIdAgent](#postticketingconnectionidagent) - Create a agent
* [postTicketingConnectionIdCustomer](#postticketingconnectionidcustomer) - Create a customer
* [postTicketingConnectionIdNoteTicketId](#postticketingconnectionidnoteticketid) - Create a note
* [postTicketingConnectionIdTicket](#postticketingconnectionidticket) - Create a ticket
* [putTicketingConnectionIdAgentId](#putticketingconnectionidagentid) - Update a agent
* [putTicketingConnectionIdCustomerId](#putticketingconnectionidcustomerid) - Update a customer
* [putTicketingConnectionIdNoteTicketIdId](#putticketingconnectionidnoteticketidid) - Update a note
* [putTicketingConnectionIdTicketId](#putticketingconnectionidticketid) - Update a ticket

## deleteTicketingConnectionIdAgentId

Remove a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("South") {{
                    jwt = "";
                }})
                .build();

            DeleteTicketingConnectionIdAgentIdRequest req = new DeleteTicketingConnectionIdAgentIdRequest("background", "navigating");            

            DeleteTicketingConnectionIdAgentIdResponse res = sdk.ticketing.deleteTicketingConnectionIdAgentId(req);

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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdRequest](../../models/operations/DeleteTicketingConnectionIdAgentIdRequest.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdResponse](../../models/operations/DeleteTicketingConnectionIdAgentIdResponse.md)**


## deleteTicketingConnectionIdCustomerId

Remove a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdCustomerIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdCustomerIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Curium") {{
                    jwt = "";
                }})
                .build();

            DeleteTicketingConnectionIdCustomerIdRequest req = new DeleteTicketingConnectionIdCustomerIdRequest("DNS", "gladly");            

            DeleteTicketingConnectionIdCustomerIdResponse res = sdk.ticketing.deleteTicketingConnectionIdCustomerId(req);

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

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdCustomerIdRequest](../../models/operations/DeleteTicketingConnectionIdCustomerIdRequest.md) | :heavy_check_mark:                                                                                                                                                 | The request object to use for the request.                                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdCustomerIdResponse](../../models/operations/DeleteTicketingConnectionIdCustomerIdResponse.md)**


## deleteTicketingConnectionIdNoteTicketIdId

Remove a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNoteTicketIdIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNoteTicketIdIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Intersex") {{
                    jwt = "";
                }})
                .build();

            DeleteTicketingConnectionIdNoteTicketIdIdRequest req = new DeleteTicketingConnectionIdNoteTicketIdIdRequest("Liaison", "deposit", "besides");            

            DeleteTicketingConnectionIdNoteTicketIdIdResponse res = sdk.ticketing.deleteTicketingConnectionIdNoteTicketIdId(req);

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

| Parameter                                                                                                                                                                  | Type                                                                                                                                                                       | Required                                                                                                                                                                   | Description                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNoteTicketIdIdRequest](../../models/operations/DeleteTicketingConnectionIdNoteTicketIdIdRequest.md) | :heavy_check_mark:                                                                                                                                                         | The request object to use for the request.                                                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNoteTicketIdIdResponse](../../models/operations/DeleteTicketingConnectionIdNoteTicketIdIdResponse.md)**


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
                .setSecurity(new Security("lavender") {{
                    jwt = "";
                }})
                .build();

            DeleteTicketingConnectionIdTicketIdRequest req = new DeleteTicketingConnectionIdTicketIdRequest("Southwest", "meanwhile");            

            DeleteTicketingConnectionIdTicketIdResponse res = sdk.ticketing.deleteTicketingConnectionIdTicketId(req);

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


## getTicketingConnectionIdAgent

List all agents

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Supervisor") {{
                    jwt = "";
                }})
                .build();

            GetTicketingConnectionIdAgentRequest req = new GetTicketingConnectionIdAgentRequest("EXE") {{
                limit = 619.4d;
                offset = 2793.16d;
                order = "compensate reboot Korea";
                query = "yowza";
                sort = "West invoice coulomb";
                updatedGte = OffsetDateTime.parse("2022-09-17T00:07:58.219Z");
            }};            

            GetTicketingConnectionIdAgentResponse res = sdk.ticketing.getTicketingConnectionIdAgent(req);

            if (res.ticketingAgents != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentRequest](../../models/operations/GetTicketingConnectionIdAgentRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentResponse](../../models/operations/GetTicketingConnectionIdAgentResponse.md)**


## getTicketingConnectionIdAgentId

Retrieve a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Manganese") {{
                    jwt = "";
                }})
                .build();

            GetTicketingConnectionIdAgentIdRequest req = new GetTicketingConnectionIdAgentIdRequest("matrix", "matrix");            

            GetTicketingConnectionIdAgentIdResponse res = sdk.ticketing.getTicketingConnectionIdAgentId(req);

            if (res.ticketingAgent != null) {
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
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentIdRequest](../../models/operations/GetTicketingConnectionIdAgentIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentIdResponse](../../models/operations/GetTicketingConnectionIdAgentIdResponse.md)**


## getTicketingConnectionIdCustomer

List all customers

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("merrily") {{
                    jwt = "";
                }})
                .build();

            GetTicketingConnectionIdCustomerRequest req = new GetTicketingConnectionIdCustomerRequest("Human") {{
                limit = 843.49d;
                offset = 2082.44d;
                order = "Electric Southeast Shirt";
                query = "Jeep 1080p Hatchback";
                sort = "Southeast Kansas";
                updatedGte = OffsetDateTime.parse("2023-12-20T19:18:39.254Z");
            }};            

            GetTicketingConnectionIdCustomerResponse res = sdk.ticketing.getTicketingConnectionIdCustomer(req);

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerRequest](../../models/operations/GetTicketingConnectionIdCustomerRequest.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerResponse](../../models/operations/GetTicketingConnectionIdCustomerResponse.md)**


## getTicketingConnectionIdCustomerId

Retrieve a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Principal") {{
                    jwt = "";
                }})
                .build();

            GetTicketingConnectionIdCustomerIdRequest req = new GetTicketingConnectionIdCustomerIdRequest("for", "Pines");            

            GetTicketingConnectionIdCustomerIdResponse res = sdk.ticketing.getTicketingConnectionIdCustomerId(req);

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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerIdRequest](../../models/operations/GetTicketingConnectionIdCustomerIdRequest.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerIdResponse](../../models/operations/GetTicketingConnectionIdCustomerIdResponse.md)**


## getTicketingConnectionIdNoteTicketId

List all notes

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNoteTicketIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNoteTicketIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Genderflux") {{
                    jwt = "";
                }})
                .build();

            GetTicketingConnectionIdNoteTicketIdRequest req = new GetTicketingConnectionIdNoteTicketIdRequest("synergy", "revolutionary") {{
                limit = 2310.88d;
                offset = 6688.82d;
                order = "AI";
                query = "stanch Investor attitude";
                sort = "Cotton";
                updatedGte = OffsetDateTime.parse("2022-05-07T04:47:47.948Z");
            }};            

            GetTicketingConnectionIdNoteTicketIdResponse res = sdk.ticketing.getTicketingConnectionIdNoteTicketId(req);

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

| Parameter                                                                                                                                                        | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNoteTicketIdRequest](../../models/operations/GetTicketingConnectionIdNoteTicketIdRequest.md) | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNoteTicketIdResponse](../../models/operations/GetTicketingConnectionIdNoteTicketIdResponse.md)**


## getTicketingConnectionIdNoteTicketIdId

Retrieve a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNoteTicketIdIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNoteTicketIdIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Table") {{
                    jwt = "";
                }})
                .build();

            GetTicketingConnectionIdNoteTicketIdIdRequest req = new GetTicketingConnectionIdNoteTicketIdIdRequest("in", "Fords", "North");            

            GetTicketingConnectionIdNoteTicketIdIdResponse res = sdk.ticketing.getTicketingConnectionIdNoteTicketIdId(req);

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

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNoteTicketIdIdRequest](../../models/operations/GetTicketingConnectionIdNoteTicketIdIdRequest.md) | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNoteTicketIdIdResponse](../../models/operations/GetTicketingConnectionIdNoteTicketIdIdResponse.md)**


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
                .setSecurity(new Security("Bronze") {{
                    jwt = "";
                }})
                .build();

            GetTicketingConnectionIdTicketRequest req = new GetTicketingConnectionIdTicketRequest("Funk") {{
                agentId = "hertz Savings Steel";
                customerId = "payment biopsy Kids";
                limit = 7673.64d;
                offset = 5134.74d;
                order = "quantifying orange";
                query = "male dynamic";
                sort = "Sedan Tricycle Honda";
                updatedGte = OffsetDateTime.parse("2022-08-06T21:30:52.879Z");
            }};            

            GetTicketingConnectionIdTicketResponse res = sdk.ticketing.getTicketingConnectionIdTicket(req);

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
                .setSecurity(new Security("Florida") {{
                    jwt = "";
                }})
                .build();

            GetTicketingConnectionIdTicketIdRequest req = new GetTicketingConnectionIdTicketIdRequest("Ohio", "scalable");            

            GetTicketingConnectionIdTicketIdResponse res = sdk.ticketing.getTicketingConnectionIdTicketId(req);

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


## patchTicketingConnectionIdAgentId

Update a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdAgentIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdAgentIdResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingAgentRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingAgent;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("AGP") {{
                    jwt = "";
                }})
                .build();

            PatchTicketingConnectionIdAgentIdRequest req = new PatchTicketingConnectionIdAgentIdRequest("Cambridgeshire", "Circle") {{
                ticketingAgent = new TicketingAgent(                new PropertyTicketingAgentRaw();) {{
                    createdAt = OffsetDateTime.parse("2022-09-04T07:08:00.976Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("Engineer") {{
                            email = "Braulio15@hotmail.com";
                            type = TicketingEmailType.HOME;
                        }}),
                    }};
                    id = "<ID>";
                    name = "Diesel Springs North";
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("Danville") {{
                            telephone = "Awesome backing niches";
                            type = TicketingTelephoneType.MOBILE;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-11-15T22:58:08.296Z");
                }};;
            }};            

            PatchTicketingConnectionIdAgentIdResponse res = sdk.ticketing.patchTicketingConnectionIdAgentId(req);

            if (res.ticketingAgent != null) {
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
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdAgentIdRequest](../../models/operations/PatchTicketingConnectionIdAgentIdRequest.md) | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdAgentIdResponse](../../models/operations/PatchTicketingConnectionIdAgentIdResponse.md)**


## patchTicketingConnectionIdCustomerId

Update a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdCustomerIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdCustomerIdResponse;
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
                .setSecurity(new Security("Architect") {{
                    jwt = "";
                }})
                .build();

            PatchTicketingConnectionIdCustomerIdRequest req = new PatchTicketingConnectionIdCustomerIdRequest("Bicycle", "Waco") {{
                ticketingCustomer = new TicketingCustomer(                new PropertyTicketingCustomerRaw();) {{
                    createdAt = OffsetDateTime.parse("2022-02-08T21:12:15.300Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("Polestar") {{
                            email = "Zoila67@hotmail.com";
                            type = TicketingEmailType.WORK;
                        }}),
                    }};
                    id = "<ID>";
                    name = "Hialeah";
                    tags = new String[]{{
                        add("auxiliary"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("Bicycle") {{
                            telephone = "Oregon demur Central";
                            type = TicketingTelephoneType.FAX;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-02-15T23:57:55.260Z");
                }};;
            }};            

            PatchTicketingConnectionIdCustomerIdResponse res = sdk.ticketing.patchTicketingConnectionIdCustomerId(req);

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

| Parameter                                                                                                                                                        | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdCustomerIdRequest](../../models/operations/PatchTicketingConnectionIdCustomerIdRequest.md) | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdCustomerIdResponse](../../models/operations/PatchTicketingConnectionIdCustomerIdResponse.md)**


## patchTicketingConnectionIdNoteTicketIdId

Update a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNoteTicketIdIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNoteTicketIdIdResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingNoteRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("quos") {{
                    jwt = "";
                }})
                .build();

            PatchTicketingConnectionIdNoteTicketIdIdRequest req = new PatchTicketingConnectionIdNoteTicketIdIdRequest("Metal", "furrow", "York") {{
                ticketingNote = new TicketingNote(                new PropertyTicketingNoteRaw();) {{
                    agentId = "ROI";
                    createdAt = OffsetDateTime.parse("2023-12-26T03:25:45.709Z");
                    customerId = "Nissan";
                    description = "Focused composite open system";
                    id = "<ID>";
                    updatedAt = "frictionless convergence officia";
                }};;
            }};            

            PatchTicketingConnectionIdNoteTicketIdIdResponse res = sdk.ticketing.patchTicketingConnectionIdNoteTicketIdId(req);

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

| Parameter                                                                                                                                                                | Type                                                                                                                                                                     | Required                                                                                                                                                                 | Description                                                                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNoteTicketIdIdRequest](../../models/operations/PatchTicketingConnectionIdNoteTicketIdIdRequest.md) | :heavy_check_mark:                                                                                                                                                       | The request object to use for the request.                                                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNoteTicketIdIdResponse](../../models/operations/PatchTicketingConnectionIdNoteTicketIdIdResponse.md)**


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
                .setSecurity(new Security("Polygender") {{
                    jwt = "";
                }})
                .build();

            PatchTicketingConnectionIdTicketIdRequest req = new PatchTicketingConnectionIdTicketIdRequest("messenger", "Principal") {{
                ticketingTicket = new TicketingTicket(                new PropertyTicketingTicketRaw();) {{
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
                }};;
            }};            

            PatchTicketingConnectionIdTicketIdResponse res = sdk.ticketing.patchTicketingConnectionIdTicketId(req);

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


## postTicketingConnectionIdAgent

Create a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdAgentRequest;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdAgentResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingAgentRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingAgent;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Lead") {{
                    jwt = "";
                }})
                .build();

            PostTicketingConnectionIdAgentRequest req = new PostTicketingConnectionIdAgentRequest("proactive") {{
                ticketingAgent = new TicketingAgent(                new PropertyTicketingAgentRaw();) {{
                    createdAt = OffsetDateTime.parse("2023-06-05T05:37:22.282Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("Funk") {{
                            email = "Dale.Weissnat85@yahoo.com";
                            type = TicketingEmailType.OTHER;
                        }}),
                    }};
                    id = "<ID>";
                    name = "absent TCP wireless";
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("engage") {{
                            telephone = "incentivize Tala capacity";
                            type = TicketingTelephoneType.OTHER;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-07-20T19:40:58.756Z");
                }};;
            }};            

            PostTicketingConnectionIdAgentResponse res = sdk.ticketing.postTicketingConnectionIdAgent(req);

            if (res.ticketingAgent != null) {
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
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdAgentRequest](../../models/operations/PostTicketingConnectionIdAgentRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdAgentResponse](../../models/operations/PostTicketingConnectionIdAgentResponse.md)**


## postTicketingConnectionIdCustomer

Create a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdCustomerResponse;
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
                .setSecurity(new Security("JSON") {{
                    jwt = "";
                }})
                .build();

            PostTicketingConnectionIdCustomerRequest req = new PostTicketingConnectionIdCustomerRequest("Northeast") {{
                ticketingCustomer = new TicketingCustomer(                new PropertyTicketingCustomerRaw();) {{
                    createdAt = OffsetDateTime.parse("2021-04-02T13:32:21.285Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("Electric") {{
                            email = "Destiney_Huels@yahoo.com";
                            type = TicketingEmailType.HOME;
                        }}),
                    }};
                    id = "<ID>";
                    name = "engineer gold";
                    tags = new String[]{{
                        add("Research"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("East") {{
                            telephone = "Progressive Classical";
                            type = TicketingTelephoneType.FAX;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-06-03T12:33:45.566Z");
                }};;
            }};            

            PostTicketingConnectionIdCustomerResponse res = sdk.ticketing.postTicketingConnectionIdCustomer(req);

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

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdCustomerRequest](../../models/operations/PostTicketingConnectionIdCustomerRequest.md) | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdCustomerResponse](../../models/operations/PostTicketingConnectionIdCustomerResponse.md)**


## postTicketingConnectionIdNoteTicketId

Create a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNoteTicketIdRequest;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNoteTicketIdResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingNoteRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("virtual") {{
                    jwt = "";
                }})
                .build();

            PostTicketingConnectionIdNoteTicketIdRequest req = new PostTicketingConnectionIdNoteTicketIdRequest("vertical", "Officer") {{
                ticketingNote = new TicketingNote(                new PropertyTicketingNoteRaw();) {{
                    agentId = "Freeman";
                    createdAt = OffsetDateTime.parse("2022-08-22T15:22:13.118Z");
                    customerId = "functionalities";
                    description = "Object-based mobile standardization";
                    id = "<ID>";
                    updatedAt = "Sulfur Berkshire gold";
                }};;
            }};            

            PostTicketingConnectionIdNoteTicketIdResponse res = sdk.ticketing.postTicketingConnectionIdNoteTicketId(req);

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

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNoteTicketIdRequest](../../models/operations/PostTicketingConnectionIdNoteTicketIdRequest.md) | :heavy_check_mark:                                                                                                                                                 | The request object to use for the request.                                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNoteTicketIdResponse](../../models/operations/PostTicketingConnectionIdNoteTicketIdResponse.md)**


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
                .setSecurity(new Security("Alabama") {{
                    jwt = "";
                }})
                .build();

            PostTicketingConnectionIdTicketRequest req = new PostTicketingConnectionIdTicketRequest("Electronics") {{
                ticketingTicket = new TicketingTicket(                new PropertyTicketingTicketRaw();) {{
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
                }};;
            }};            

            PostTicketingConnectionIdTicketResponse res = sdk.ticketing.postTicketingConnectionIdTicket(req);

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


## putTicketingConnectionIdAgentId

Update a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdAgentIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdAgentIdResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingAgentRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingAgent;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Human") {{
                    jwt = "";
                }})
                .build();

            PutTicketingConnectionIdAgentIdRequest req = new PutTicketingConnectionIdAgentIdRequest("West", "whose") {{
                ticketingAgent = new TicketingAgent(                new PropertyTicketingAgentRaw();) {{
                    createdAt = OffsetDateTime.parse("2022-01-17T04:10:02.116Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("Refined") {{
                            email = "Nat_Halvorson@hotmail.com";
                            type = TicketingEmailType.HOME;
                        }}),
                    }};
                    id = "<ID>";
                    name = "asynchronous";
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("Honduras") {{
                            telephone = "Southwest synergistic Uzbekistan";
                            type = TicketingTelephoneType.WORK;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-09-13T15:49:27.238Z");
                }};;
            }};            

            PutTicketingConnectionIdAgentIdResponse res = sdk.ticketing.putTicketingConnectionIdAgentId(req);

            if (res.ticketingAgent != null) {
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
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdAgentIdRequest](../../models/operations/PutTicketingConnectionIdAgentIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdAgentIdResponse](../../models/operations/PutTicketingConnectionIdAgentIdResponse.md)**


## putTicketingConnectionIdCustomerId

Update a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdCustomerIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdCustomerIdResponse;
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
                .setSecurity(new Security("Southwest") {{
                    jwt = "";
                }})
                .build();

            PutTicketingConnectionIdCustomerIdRequest req = new PutTicketingConnectionIdCustomerIdRequest("scarcely", "Grocery") {{
                ticketingCustomer = new TicketingCustomer(                new PropertyTicketingCustomerRaw();) {{
                    createdAt = OffsetDateTime.parse("2022-09-04T05:01:50.120Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("boohoo") {{
                            email = "Nicholaus.Pollich71@gmail.com";
                            type = TicketingEmailType.WORK;
                        }}),
                    }};
                    id = "<ID>";
                    name = "Small optimistically Usability";
                    tags = new String[]{{
                        add("fruitful"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("sharply") {{
                            telephone = "and";
                            type = TicketingTelephoneType.MOBILE;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-12-11T20:09:11.294Z");
                }};;
            }};            

            PutTicketingConnectionIdCustomerIdResponse res = sdk.ticketing.putTicketingConnectionIdCustomerId(req);

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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdCustomerIdRequest](../../models/operations/PutTicketingConnectionIdCustomerIdRequest.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdCustomerIdResponse](../../models/operations/PutTicketingConnectionIdCustomerIdResponse.md)**


## putTicketingConnectionIdNoteTicketIdId

Update a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNoteTicketIdIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNoteTicketIdIdResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingNoteRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Applications") {{
                    jwt = "";
                }})
                .build();

            PutTicketingConnectionIdNoteTicketIdIdRequest req = new PutTicketingConnectionIdNoteTicketIdIdRequest("male", "Southeast", "East") {{
                ticketingNote = new TicketingNote(                new PropertyTicketingNoteRaw();) {{
                    agentId = "Carolina architecture";
                    createdAt = OffsetDateTime.parse("2023-08-15T08:45:29.335Z");
                    customerId = "Northeast Morocco supposing";
                    description = "Grass-roots holistic conglomeration";
                    id = "<ID>";
                    updatedAt = "Hatchback Southwest round";
                }};;
            }};            

            PutTicketingConnectionIdNoteTicketIdIdResponse res = sdk.ticketing.putTicketingConnectionIdNoteTicketIdId(req);

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

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNoteTicketIdIdRequest](../../models/operations/PutTicketingConnectionIdNoteTicketIdIdRequest.md) | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNoteTicketIdIdResponse](../../models/operations/PutTicketingConnectionIdNoteTicketIdIdResponse.md)**


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
                .setSecurity(new Security("driver") {{
                    jwt = "";
                }})
                .build();

            PutTicketingConnectionIdTicketIdRequest req = new PutTicketingConnectionIdTicketIdRequest("North", "holistic") {{
                ticketingTicket = new TicketingTicket(                new PropertyTicketingTicketRaw();) {{
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
                }};;
            }};            

            PutTicketingConnectionIdTicketIdResponse res = sdk.ticketing.putTicketingConnectionIdTicketId(req);

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

