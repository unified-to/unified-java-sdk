# ticketing

### Available Operations

* [deleteTicketingConnectionIdAgentId](#deleteticketingconnectionidagentid) - Remove a agent
* [deleteTicketingConnectionIdCustomerId](#deleteticketingconnectionidcustomerid) - Remove a customer
* [deleteTicketingConnectionIdNotesTicketIdId](#deleteticketingconnectionidnotesticketidid) - Remove a note
* [deleteTicketingConnectionIdTicketId](#deleteticketingconnectionidticketid) - Remove a ticket
* [getTicketingConnectionIdAgent](#getticketingconnectionidagent) - List all agents
* [getTicketingConnectionIdAgentId](#getticketingconnectionidagentid) - Retrieve a agent
* [getTicketingConnectionIdCustomer](#getticketingconnectionidcustomer) - List all customers
* [getTicketingConnectionIdCustomerId](#getticketingconnectionidcustomerid) - Retrieve a customer
* [getTicketingConnectionIdNotesTicketId](#getticketingconnectionidnotesticketid) - List all notes
* [getTicketingConnectionIdNotesTicketIdId](#getticketingconnectionidnotesticketidid) - Retrieve a note
* [getTicketingConnectionIdTicket](#getticketingconnectionidticket) - List all tickets
* [getTicketingConnectionIdTicketId](#getticketingconnectionidticketid) - Retrieve a ticket
* [patchTicketingConnectionIdAgentId](#patchticketingconnectionidagentid) - Update a agent
* [patchTicketingConnectionIdCustomerId](#patchticketingconnectionidcustomerid) - Update a customer
* [patchTicketingConnectionIdNotesTicketIdId](#patchticketingconnectionidnotesticketidid) - Update a note
* [patchTicketingConnectionIdTicketId](#patchticketingconnectionidticketid) - Update a ticket
* [postTicketingConnectionIdAgent](#postticketingconnectionidagent) - Create a agent
* [postTicketingConnectionIdCustomer](#postticketingconnectionidcustomer) - Create a customer
* [postTicketingConnectionIdNotesTicketId](#postticketingconnectionidnotesticketid) - Create a note
* [postTicketingConnectionIdTicket](#postticketingconnectionidticket) - Create a ticket
* [putTicketingConnectionIdAgentId](#putticketingconnectionidagentid) - Update a agent
* [putTicketingConnectionIdCustomerId](#putticketingconnectionidcustomerid) - Update a customer
* [putTicketingConnectionIdNotesTicketIdId](#putticketingconnectionidnotesticketidid) - Update a note
* [putTicketingConnectionIdTicketId](#putticketingconnectionidticketid) - Update a ticket

## deleteTicketingConnectionIdAgentId

Remove a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteTicketingConnectionIdAgentIdRequest req = new DeleteTicketingConnectionIdAgentIdRequest("debitis", "nostrum");            

            DeleteTicketingConnectionIdAgentIdResponse res = sdk.ticketing.deleteTicketingConnectionIdAgentId(req, new DeleteTicketingConnectionIdAgentIdSecurity("quibusdam") {{
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

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdRequest](../../models/operations/DeleteTicketingConnectionIdAgentIdRequest.md)   | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |
| `security`                                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdSecurity](../../models/operations/DeleteTicketingConnectionIdAgentIdSecurity.md) | :heavy_check_mark:                                                                                                                                             | The security requirements to use for the request.                                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdCustomerIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteTicketingConnectionIdCustomerIdRequest req = new DeleteTicketingConnectionIdCustomerIdRequest("provident", "veritatis");            

            DeleteTicketingConnectionIdCustomerIdResponse res = sdk.ticketing.deleteTicketingConnectionIdCustomerId(req, new DeleteTicketingConnectionIdCustomerIdSecurity("sunt") {{
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

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdCustomerIdRequest](../../models/operations/DeleteTicketingConnectionIdCustomerIdRequest.md)   | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |
| `security`                                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdCustomerIdSecurity](../../models/operations/DeleteTicketingConnectionIdCustomerIdSecurity.md) | :heavy_check_mark:                                                                                                                                                   | The security requirements to use for the request.                                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdCustomerIdResponse](../../models/operations/DeleteTicketingConnectionIdCustomerIdResponse.md)**


## deleteTicketingConnectionIdNotesTicketIdId

Remove a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNotesTicketIdIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNotesTicketIdIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNotesTicketIdIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteTicketingConnectionIdNotesTicketIdIdRequest req = new DeleteTicketingConnectionIdNotesTicketIdIdRequest("quod", "expedita", "sapiente");            

            DeleteTicketingConnectionIdNotesTicketIdIdResponse res = sdk.ticketing.deleteTicketingConnectionIdNotesTicketIdId(req, new DeleteTicketingConnectionIdNotesTicketIdIdSecurity("itaque") {{
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

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNotesTicketIdIdRequest](../../models/operations/DeleteTicketingConnectionIdNotesTicketIdIdRequest.md)   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `security`                                                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNotesTicketIdIdSecurity](../../models/operations/DeleteTicketingConnectionIdNotesTicketIdIdSecurity.md) | :heavy_check_mark:                                                                                                                                                             | The security requirements to use for the request.                                                                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNotesTicketIdIdResponse](../../models/operations/DeleteTicketingConnectionIdNotesTicketIdIdResponse.md)**


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

            DeleteTicketingConnectionIdTicketIdRequest req = new DeleteTicketingConnectionIdTicketIdRequest("dignissimos", "magnam");            

            DeleteTicketingConnectionIdTicketIdResponse res = sdk.ticketing.deleteTicketingConnectionIdTicketId(req, new DeleteTicketingConnectionIdTicketIdSecurity("excepturi") {{
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


## getTicketingConnectionIdAgent

List all agents

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentResponse;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentSecurity;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetTicketingConnectionIdAgentRequest req = new GetTicketingConnectionIdAgentRequest("placeat") {{
                limit = 6797.97d;
                offset = 9749.31d;
                order = "modi";
                query = "enim";
                sort = "mollitia";
                updatedGte = LocalDate.parse("2022-07-11");
            }};            

            GetTicketingConnectionIdAgentResponse res = sdk.ticketing.getTicketingConnectionIdAgent(req, new GetTicketingConnectionIdAgentSecurity("delectus") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentRequest](../../models/operations/GetTicketingConnectionIdAgentRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentSecurity](../../models/operations/GetTicketingConnectionIdAgentSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


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
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetTicketingConnectionIdAgentIdRequest req = new GetTicketingConnectionIdAgentIdRequest("ex", "error");            

            GetTicketingConnectionIdAgentIdResponse res = sdk.ticketing.getTicketingConnectionIdAgentId(req, new GetTicketingConnectionIdAgentIdSecurity("saepe") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentIdRequest](../../models/operations/GetTicketingConnectionIdAgentIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentIdSecurity](../../models/operations/GetTicketingConnectionIdAgentIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerSecurity;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetTicketingConnectionIdCustomerRequest req = new GetTicketingConnectionIdCustomerRequest("consequuntur") {{
                limit = 7979.03d;
                offset = 5814.2d;
                order = "earum";
                query = "eum";
                sort = "temporibus";
                updatedGte = LocalDate.parse("2022-12-16");
            }};            

            GetTicketingConnectionIdCustomerResponse res = sdk.ticketing.getTicketingConnectionIdCustomer(req, new GetTicketingConnectionIdCustomerSecurity("debitis") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerRequest](../../models/operations/GetTicketingConnectionIdCustomerRequest.md)   | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |
| `security`                                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerSecurity](../../models/operations/GetTicketingConnectionIdCustomerSecurity.md) | :heavy_check_mark:                                                                                                                                         | The security requirements to use for the request.                                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetTicketingConnectionIdCustomerIdRequest req = new GetTicketingConnectionIdCustomerIdRequest("omnis", "temporibus");            

            GetTicketingConnectionIdCustomerIdResponse res = sdk.ticketing.getTicketingConnectionIdCustomerId(req, new GetTicketingConnectionIdCustomerIdSecurity("quidem") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerIdRequest](../../models/operations/GetTicketingConnectionIdCustomerIdRequest.md)   | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |
| `security`                                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerIdSecurity](../../models/operations/GetTicketingConnectionIdCustomerIdSecurity.md) | :heavy_check_mark:                                                                                                                                             | The security requirements to use for the request.                                                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerIdResponse](../../models/operations/GetTicketingConnectionIdCustomerIdResponse.md)**


## getTicketingConnectionIdNotesTicketId

List all notes

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdSecurity;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetTicketingConnectionIdNotesTicketIdRequest req = new GetTicketingConnectionIdNotesTicketIdRequest("neque", "est") {{
                limit = 8344.57d;
                offset = 2719.56d;
                order = "quisquam";
                query = "vel";
                sort = "cum";
                updatedGte = LocalDate.parse("2022-10-05");
            }};            

            GetTicketingConnectionIdNotesTicketIdResponse res = sdk.ticketing.getTicketingConnectionIdNotesTicketId(req, new GetTicketingConnectionIdNotesTicketIdSecurity("quasi") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdRequest](../../models/operations/GetTicketingConnectionIdNotesTicketIdRequest.md)   | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |
| `security`                                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdSecurity](../../models/operations/GetTicketingConnectionIdNotesTicketIdSecurity.md) | :heavy_check_mark:                                                                                                                                                   | The security requirements to use for the request.                                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdResponse](../../models/operations/GetTicketingConnectionIdNotesTicketIdResponse.md)**


## getTicketingConnectionIdNotesTicketIdId

Retrieve a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetTicketingConnectionIdNotesTicketIdIdRequest req = new GetTicketingConnectionIdNotesTicketIdIdRequest("accusantium", "molestias", "facere");            

            GetTicketingConnectionIdNotesTicketIdIdResponse res = sdk.ticketing.getTicketingConnectionIdNotesTicketIdId(req, new GetTicketingConnectionIdNotesTicketIdIdSecurity("occaecati") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdIdRequest](../../models/operations/GetTicketingConnectionIdNotesTicketIdIdRequest.md)   | :heavy_check_mark:                                                                                                                                                       | The request object to use for the request.                                                                                                                               |
| `security`                                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdIdSecurity](../../models/operations/GetTicketingConnectionIdNotesTicketIdIdSecurity.md) | :heavy_check_mark:                                                                                                                                                       | The security requirements to use for the request.                                                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdIdResponse](../../models/operations/GetTicketingConnectionIdNotesTicketIdIdResponse.md)**


## getTicketingConnectionIdTicket

List all tickets

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdTicketRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdTicketResponse;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdTicketSecurity;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetTicketingConnectionIdTicketRequest req = new GetTicketingConnectionIdTicketRequest("quisquam") {{
                agentId = "nesciunt";
                customerId = "sequi";
                limit = 4482.03d;
                offset = 2640.02d;
                order = "nihil";
                query = "velit";
                sort = "aut";
                updatedGte = LocalDate.parse("2022-09-18");
            }};            

            GetTicketingConnectionIdTicketResponse res = sdk.ticketing.getTicketingConnectionIdTicket(req, new GetTicketingConnectionIdTicketSecurity("libero") {{
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

            GetTicketingConnectionIdTicketIdRequest req = new GetTicketingConnectionIdTicketIdRequest("error", "incidunt");            

            GetTicketingConnectionIdTicketIdResponse res = sdk.ticketing.getTicketingConnectionIdTicketId(req, new GetTicketingConnectionIdTicketIdSecurity("asperiores") {{
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


## patchTicketingConnectionIdAgentId

Update a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdAgentIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdAgentIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdAgentIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingAgentRaw;
import com.unifiedapi.unifiedto.models.shared.TicketingAgent;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchTicketingConnectionIdAgentIdRequest req = new PatchTicketingConnectionIdAgentIdRequest("eos", "mollitia") {{
                ticketingAgent = new TicketingAgent(                new PropertyTicketingAgentRaw();) {{
                    createdAt = LocalDate.parse("2022-10-05");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("voluptates") {{
                            email = "Reilly.Hickle@hotmail.com";
                            type = TicketingEmailType.WORK;
                        }}),
                    }};
                    id = "9c326350-a467-4143-b89c-e0e991594d93";
                    name = "Kelly Gleichner Sr.";
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("a") {{
                            telephone = "ullam";
                            type = TicketingTelephoneType.WORK;
                        }}),
                    }};
                    updatedAt = LocalDate.parse("2022-04-30");
                }};;
            }};            

            PatchTicketingConnectionIdAgentIdResponse res = sdk.ticketing.patchTicketingConnectionIdAgentId(req, new PatchTicketingConnectionIdAgentIdSecurity("quidem") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdAgentIdRequest](../../models/operations/PatchTicketingConnectionIdAgentIdRequest.md)   | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |
| `security`                                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdAgentIdSecurity](../../models/operations/PatchTicketingConnectionIdAgentIdSecurity.md) | :heavy_check_mark:                                                                                                                                           | The security requirements to use for the request.                                                                                                            |


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
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdCustomerIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.TicketingCustomer;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchTicketingConnectionIdCustomerIdRequest req = new PatchTicketingConnectionIdCustomerIdRequest("quaerat", "cum") {{
                ticketingCustomer = new TicketingCustomer(                new PropertyTicketingCustomerRaw();) {{
                    createdAt = LocalDate.parse("2022-02-26");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("voluptates") {{
                            email = "Kameron.Rice@hotmail.com";
                            type = TicketingEmailType.HOME;
                        }}),
                    }};
                    id = "bb6e1d2c-f502-4baf-b2cb-c4635d5e65da";
                    name = "Bonnie Lubowitz";
                    tags = new String[]{{
                        add("accusamus"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("veritatis") {{
                            telephone = "sint";
                            type = TicketingTelephoneType.HOME;
                        }}),
                    }};
                    updatedAt = LocalDate.parse("2022-10-31");
                }};;
            }};            

            PatchTicketingConnectionIdCustomerIdResponse res = sdk.ticketing.patchTicketingConnectionIdCustomerId(req, new PatchTicketingConnectionIdCustomerIdSecurity("vero") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdCustomerIdRequest](../../models/operations/PatchTicketingConnectionIdCustomerIdRequest.md)   | :heavy_check_mark:                                                                                                                                                 | The request object to use for the request.                                                                                                                         |
| `security`                                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdCustomerIdSecurity](../../models/operations/PatchTicketingConnectionIdCustomerIdSecurity.md) | :heavy_check_mark:                                                                                                                                                 | The security requirements to use for the request.                                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdCustomerIdResponse](../../models/operations/PatchTicketingConnectionIdCustomerIdResponse.md)**


## patchTicketingConnectionIdNotesTicketIdId

Update a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNotesTicketIdIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNotesTicketIdIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNotesTicketIdIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingNoteRaw;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchTicketingConnectionIdNotesTicketIdIdRequest req = new PatchTicketingConnectionIdNotesTicketIdIdRequest("ratione", "aut", "doloribus") {{
                ticketingNote = new TicketingNote(                new PropertyTicketingNoteRaw();) {{
                    agentId = "fugiat";
                    createdAt = LocalDate.parse("2021-11-09");
                    customerId = "eum";
                    description = "commodi";
                    id = "489d7b78-673e-413a-92a6-b99249459448";
                    updatedAt = "ducimus";
                }};;
            }};            

            PatchTicketingConnectionIdNotesTicketIdIdResponse res = sdk.ticketing.patchTicketingConnectionIdNotesTicketIdId(req, new PatchTicketingConnectionIdNotesTicketIdIdSecurity("asperiores") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                    | Type                                                                                                                                                                         | Required                                                                                                                                                                     | Description                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNotesTicketIdIdRequest](../../models/operations/PatchTicketingConnectionIdNotesTicketIdIdRequest.md)   | :heavy_check_mark:                                                                                                                                                           | The request object to use for the request.                                                                                                                                   |
| `security`                                                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNotesTicketIdIdSecurity](../../models/operations/PatchTicketingConnectionIdNotesTicketIdIdSecurity.md) | :heavy_check_mark:                                                                                                                                                           | The security requirements to use for the request.                                                                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNotesTicketIdIdResponse](../../models/operations/PatchTicketingConnectionIdNotesTicketIdIdResponse.md)**


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
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchTicketingConnectionIdTicketIdRequest req = new PatchTicketingConnectionIdTicketIdRequest("veniam", "cumque") {{
                ticketingTicket = new TicketingTicket(                new PropertyTicketingTicketRaw();) {{
                    category = "praesentium";
                    closedAt = LocalDate.parse("2022-10-09");
                    createdAt = LocalDate.parse("2022-08-09");
                    customerId = "ex";
                    description = "tempore";
                    id = "86b3cdf6-415b-4044-9f9d-f13f4eedbe78";
                    priority = "tempore";
                    source = "reiciendis";
                    sourceRef = "commodi";
                    status = TicketingTicketStatus.ACTIVE;
                    subject = "ea";
                    tags = new String[]{{
                        add("molestias"),
                    }};
                    updatedAt = LocalDate.parse("2022-08-17");
                }};;
            }};            

            PatchTicketingConnectionIdTicketIdResponse res = sdk.ticketing.patchTicketingConnectionIdTicketId(req, new PatchTicketingConnectionIdTicketIdSecurity("rem") {{
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


## postTicketingConnectionIdAgent

Create a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdAgentRequest;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdAgentResponse;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdAgentSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingAgentRaw;
import com.unifiedapi.unifiedto.models.shared.TicketingAgent;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostTicketingConnectionIdAgentRequest req = new PostTicketingConnectionIdAgentRequest("molestias") {{
                ticketingAgent = new TicketingAgent(                new PropertyTicketingAgentRaw();) {{
                    createdAt = LocalDate.parse("2022-02-07");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("impedit") {{
                            email = "Isom85@yahoo.com";
                            type = TicketingEmailType.HOME;
                        }}),
                    }};
                    id = "72795b78-5148-4d6d-949e-5635b33bc0f9";
                    name = "Betty Schulist";
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("provident") {{
                            telephone = "voluptatibus";
                            type = TicketingTelephoneType.FAX;
                        }}),
                    }};
                    updatedAt = LocalDate.parse("2022-02-14");
                }};;
            }};            

            PostTicketingConnectionIdAgentResponse res = sdk.ticketing.postTicketingConnectionIdAgent(req, new PostTicketingConnectionIdAgentSecurity("totam") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdAgentRequest](../../models/operations/PostTicketingConnectionIdAgentRequest.md)   | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |
| `security`                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdAgentSecurity](../../models/operations/PostTicketingConnectionIdAgentSecurity.md) | :heavy_check_mark:                                                                                                                                     | The security requirements to use for the request.                                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdCustomerSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.TicketingCustomer;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostTicketingConnectionIdCustomerRequest req = new PostTicketingConnectionIdCustomerRequest("labore") {{
                ticketingCustomer = new TicketingCustomer(                new PropertyTicketingCustomerRaw();) {{
                    createdAt = LocalDate.parse("2022-11-16");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("ducimus") {{
                            email = "Erwin.Von@gmail.com";
                            type = TicketingEmailType.OTHER;
                        }}),
                    }};
                    id = "96065c0e-fa6f-493b-90a1-b8c95be1254b";
                    name = "Sylvia Medhurst";
                    tags = new String[]{{
                        add("voluptatibus"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("voluptate") {{
                            telephone = "eveniet";
                            type = TicketingTelephoneType.OTHER;
                        }}),
                    }};
                    updatedAt = LocalDate.parse("2022-11-25");
                }};;
            }};            

            PostTicketingConnectionIdCustomerResponse res = sdk.ticketing.postTicketingConnectionIdCustomer(req, new PostTicketingConnectionIdCustomerSecurity("perferendis") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdCustomerRequest](../../models/operations/PostTicketingConnectionIdCustomerRequest.md)   | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |
| `security`                                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdCustomerSecurity](../../models/operations/PostTicketingConnectionIdCustomerSecurity.md) | :heavy_check_mark:                                                                                                                                           | The security requirements to use for the request.                                                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdCustomerResponse](../../models/operations/PostTicketingConnectionIdCustomerResponse.md)**


## postTicketingConnectionIdNotesTicketId

Create a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNotesTicketIdRequest;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNotesTicketIdResponse;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNotesTicketIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingNoteRaw;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostTicketingConnectionIdNotesTicketIdRequest req = new PostTicketingConnectionIdNotesTicketIdRequest("possimus", "dicta") {{
                ticketingNote = new TicketingNote(                new PropertyTicketingNoteRaw();) {{
                    agentId = "delectus";
                    createdAt = LocalDate.parse("2022-08-27");
                    customerId = "quis";
                    description = "quos";
                    id = "c99c722d-2bc0-4f94-887d-9caae042dd7c";
                    updatedAt = "est";
                }};;
            }};            

            PostTicketingConnectionIdNotesTicketIdResponse res = sdk.ticketing.postTicketingConnectionIdNotesTicketId(req, new PostTicketingConnectionIdNotesTicketIdSecurity("est") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNotesTicketIdRequest](../../models/operations/PostTicketingConnectionIdNotesTicketIdRequest.md)   | :heavy_check_mark:                                                                                                                                                     | The request object to use for the request.                                                                                                                             |
| `security`                                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNotesTicketIdSecurity](../../models/operations/PostTicketingConnectionIdNotesTicketIdSecurity.md) | :heavy_check_mark:                                                                                                                                                     | The security requirements to use for the request.                                                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNotesTicketIdResponse](../../models/operations/PostTicketingConnectionIdNotesTicketIdResponse.md)**


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
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostTicketingConnectionIdTicketRequest req = new PostTicketingConnectionIdTicketRequest("placeat") {{
                ticketingTicket = new TicketingTicket(                new PropertyTicketingTicketRaw();) {{
                    category = "occaecati";
                    closedAt = LocalDate.parse("2022-06-20");
                    createdAt = LocalDate.parse("2021-01-04");
                    customerId = "culpa";
                    description = "beatae";
                    id = "cfe9e15d-f903-4907-b378-31983d42e54a";
                    priority = "voluptatum";
                    source = "corporis";
                    sourceRef = "dolore";
                    status = TicketingTicketStatus.ACTIVE;
                    subject = "commodi";
                    tags = new String[]{{
                        add("quis"),
                    }};
                    updatedAt = LocalDate.parse("2022-01-13");
                }};;
            }};            

            PostTicketingConnectionIdTicketResponse res = sdk.ticketing.postTicketingConnectionIdTicket(req, new PostTicketingConnectionIdTicketSecurity("optio") {{
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


## putTicketingConnectionIdAgentId

Update a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdAgentIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdAgentIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdAgentIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingAgentRaw;
import com.unifiedapi.unifiedto.models.shared.TicketingAgent;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutTicketingConnectionIdAgentIdRequest req = new PutTicketingConnectionIdAgentIdRequest("ipsam", "consequatur") {{
                ticketingAgent = new TicketingAgent(                new PropertyTicketingAgentRaw();) {{
                    createdAt = LocalDate.parse("2022-10-14");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("quibusdam") {{
                            email = "Prudence46@gmail.com";
                            type = TicketingEmailType.WORK;
                        }}),
                    }};
                    id = "51aaa6dd-f5ab-4d64-87c5-fc2b862a00be";
                    name = "Ben Mertz Jr.";
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("enim") {{
                            telephone = "quae";
                            type = TicketingTelephoneType.WORK;
                        }}),
                    }};
                    updatedAt = LocalDate.parse("2022-08-14");
                }};;
            }};            

            PutTicketingConnectionIdAgentIdResponse res = sdk.ticketing.putTicketingConnectionIdAgentId(req, new PutTicketingConnectionIdAgentIdSecurity("dolor") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdAgentIdRequest](../../models/operations/PutTicketingConnectionIdAgentIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdAgentIdSecurity](../../models/operations/PutTicketingConnectionIdAgentIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdCustomerIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.TicketingCustomer;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutTicketingConnectionIdCustomerIdRequest req = new PutTicketingConnectionIdCustomerIdRequest("alias", "libero") {{
                ticketingCustomer = new TicketingCustomer(                new PropertyTicketingCustomerRaw();) {{
                    createdAt = LocalDate.parse("2020-12-14");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("tempora") {{
                            email = "London_Ziemann84@yahoo.com";
                            type = TicketingEmailType.HOME;
                        }}),
                    }};
                    id = "a35a4123-8e1a-4735-ac26-ae33bef971a8";
                    name = "Edwin Jacobs";
                    tags = new String[]{{
                        add("mollitia"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("aut") {{
                            telephone = "architecto";
                            type = TicketingTelephoneType.WORK;
                        }}),
                    }};
                    updatedAt = LocalDate.parse("2022-01-13");
                }};;
            }};            

            PutTicketingConnectionIdCustomerIdResponse res = sdk.ticketing.putTicketingConnectionIdCustomerId(req, new PutTicketingConnectionIdCustomerIdSecurity("officiis") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdCustomerIdRequest](../../models/operations/PutTicketingConnectionIdCustomerIdRequest.md)   | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |
| `security`                                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdCustomerIdSecurity](../../models/operations/PutTicketingConnectionIdCustomerIdSecurity.md) | :heavy_check_mark:                                                                                                                                             | The security requirements to use for the request.                                                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdCustomerIdResponse](../../models/operations/PutTicketingConnectionIdCustomerIdResponse.md)**


## putTicketingConnectionIdNotesTicketIdId

Update a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNotesTicketIdIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNotesTicketIdIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNotesTicketIdIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingNoteRaw;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutTicketingConnectionIdNotesTicketIdIdRequest req = new PutTicketingConnectionIdNotesTicketIdIdRequest("omnis", "ea", "ipsam") {{
                ticketingNote = new TicketingNote(                new PropertyTicketingNoteRaw();) {{
                    agentId = "soluta";
                    createdAt = LocalDate.parse("2022-11-20");
                    customerId = "beatae";
                    description = "pariatur";
                    id = "08cf88ec-9f7b-499a-950a-656ed333bb0c";
                    updatedAt = "officiis";
                }};;
            }};            

            PutTicketingConnectionIdNotesTicketIdIdResponse res = sdk.ticketing.putTicketingConnectionIdNotesTicketIdId(req, new PutTicketingConnectionIdNotesTicketIdIdSecurity("laudantium") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNotesTicketIdIdRequest](../../models/operations/PutTicketingConnectionIdNotesTicketIdIdRequest.md)   | :heavy_check_mark:                                                                                                                                                       | The request object to use for the request.                                                                                                                               |
| `security`                                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNotesTicketIdIdSecurity](../../models/operations/PutTicketingConnectionIdNotesTicketIdIdSecurity.md) | :heavy_check_mark:                                                                                                                                                       | The security requirements to use for the request.                                                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNotesTicketIdIdResponse](../../models/operations/PutTicketingConnectionIdNotesTicketIdIdResponse.md)**


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
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutTicketingConnectionIdTicketIdRequest req = new PutTicketingConnectionIdTicketIdRequest("est", "fuga") {{
                ticketingTicket = new TicketingTicket(                new PropertyTicketingTicketRaw();) {{
                    category = "autem";
                    closedAt = LocalDate.parse("2022-09-26");
                    createdAt = LocalDate.parse("2022-10-25");
                    customerId = "officia";
                    description = "cupiditate";
                    id = "86eb7e14-ca56-4408-9150-097019a48f88";
                    priority = "earum";
                    source = "impedit";
                    sourceRef = "accusamus";
                    status = TicketingTicketStatus.ACTIVE;
                    subject = "expedita";
                    tags = new String[]{{
                        add("hic"),
                    }};
                    updatedAt = LocalDate.parse("2022-12-16");
                }};;
            }};            

            PutTicketingConnectionIdTicketIdResponse res = sdk.ticketing.putTicketingConnectionIdTicketId(req, new PutTicketingConnectionIdTicketIdSecurity("non") {{
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

