# Ticketing

## Overview

### Available Operations

* [createTicketingCategory2](#createticketingcategory2) - Create a category
* [createTicketingCustomer2](#createticketingcustomer2) - Create a customer
* [createTicketingNote2](#createticketingnote2) - Create a note
* [createTicketingTicket2](#createticketingticket2) - Create a ticket
* [getTicketingCategory2](#getticketingcategory2) - Retrieve a category
* [getTicketingCustomer2](#getticketingcustomer2) - Retrieve a customer
* [getTicketingNote2](#getticketingnote2) - Retrieve a note
* [getTicketingTicket2](#getticketingticket2) - Retrieve a ticket
* [listTicketingCategories2](#listticketingcategories2) - List all categories
* [listTicketingCustomers2](#listticketingcustomers2) - List all customers
* [listTicketingNotes2](#listticketingnotes2) - List all notes
* [listTicketingTickets2](#listticketingtickets2) - List all tickets
* [patchTicketingCategory2](#patchticketingcategory2) - Update a category
* [patchTicketingCustomer2](#patchticketingcustomer2) - Update a customer
* [patchTicketingNote2](#patchticketingnote2) - Update a note
* [patchTicketingTicket2](#patchticketingticket2) - Update a ticket
* [removeTicketingCategory2](#removeticketingcategory2) - Remove a category
* [removeTicketingCustomer2](#removeticketingcustomer2) - Remove a customer
* [removeTicketingNote2](#removeticketingnote2) - Remove a note
* [removeTicketingTicket2](#removeticketingticket2) - Remove a ticket
* [updateTicketingCategory2](#updateticketingcategory2) - Update a category
* [updateTicketingCustomer2](#updateticketingcustomer2) - Update a customer
* [updateTicketingNote2](#updateticketingnote2) - Update a note
* [updateTicketingTicket2](#updateticketingticket2) - Update a ticket

## createTicketingCategory2

Create a category

### Example Usage

<!-- UsageSnippet language="java" operationID="createTicketingCategory2" method="post" path="/ticketing/{connection_id}/category" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateTicketingCategory2Request;
import to.unified.unified_java_sdk.models.operations.CreateTicketingCategory2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCategory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateTicketingCategory2Request req = CreateTicketingCategory2Request.builder()
                .ticketingCategory(TicketingCategory.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateTicketingCategory2Response res = sdk.ticketing().createTicketingCategory2()
                .request(req)
                .call();

        if (res.ticketingCategory().isPresent()) {
            System.out.println(res.ticketingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateTicketingCategory2Request](../../models/operations/CreateTicketingCategory2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateTicketingCategory2Response](../../models/operations/CreateTicketingCategory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createTicketingCustomer2

Create a customer

### Example Usage

<!-- UsageSnippet language="java" operationID="createTicketingCustomer2" method="post" path="/ticketing/{connection_id}/customer" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateTicketingCustomer2Request;
import to.unified.unified_java_sdk.models.operations.CreateTicketingCustomer2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCustomer;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateTicketingCustomer2Request req = CreateTicketingCustomer2Request.builder()
                .ticketingCustomer(TicketingCustomer.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateTicketingCustomer2Response res = sdk.ticketing().createTicketingCustomer2()
                .request(req)
                .call();

        if (res.ticketingCustomer().isPresent()) {
            System.out.println(res.ticketingCustomer().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateTicketingCustomer2Request](../../models/operations/CreateTicketingCustomer2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateTicketingCustomer2Response](../../models/operations/CreateTicketingCustomer2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createTicketingNote2

Create a note

### Example Usage

<!-- UsageSnippet language="java" operationID="createTicketingNote2" method="post" path="/ticketing/{connection_id}/note" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateTicketingNote2Request;
import to.unified.unified_java_sdk.models.operations.CreateTicketingNote2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingNote;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateTicketingNote2Request req = CreateTicketingNote2Request.builder()
                .ticketingNote(TicketingNote.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateTicketingNote2Response res = sdk.ticketing().createTicketingNote2()
                .request(req)
                .call();

        if (res.ticketingNote().isPresent()) {
            System.out.println(res.ticketingNote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateTicketingNote2Request](../../models/operations/CreateTicketingNote2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateTicketingNote2Response](../../models/operations/CreateTicketingNote2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateTicketingTicket2Response res = sdk.ticketing().createTicketingTicket2()
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

## getTicketingCategory2

Retrieve a category

### Example Usage

<!-- UsageSnippet language="java" operationID="getTicketingCategory2" method="get" path="/ticketing/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTicketingCategory2Request;
import to.unified.unified_java_sdk.models.operations.GetTicketingCategory2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTicketingCategory2Request req = GetTicketingCategory2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTicketingCategory2Response res = sdk.ticketing().getTicketingCategory2()
                .request(req)
                .call();

        if (res.ticketingCategory().isPresent()) {
            System.out.println(res.ticketingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetTicketingCategory2Request](../../models/operations/GetTicketingCategory2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetTicketingCategory2Response](../../models/operations/GetTicketingCategory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTicketingCustomer2

Retrieve a customer

### Example Usage

<!-- UsageSnippet language="java" operationID="getTicketingCustomer2" method="get" path="/ticketing/{connection_id}/customer/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTicketingCustomer2Request;
import to.unified.unified_java_sdk.models.operations.GetTicketingCustomer2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTicketingCustomer2Request req = GetTicketingCustomer2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTicketingCustomer2Response res = sdk.ticketing().getTicketingCustomer2()
                .request(req)
                .call();

        if (res.ticketingCustomer().isPresent()) {
            System.out.println(res.ticketingCustomer().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetTicketingCustomer2Request](../../models/operations/GetTicketingCustomer2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetTicketingCustomer2Response](../../models/operations/GetTicketingCustomer2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTicketingNote2

Retrieve a note

### Example Usage

<!-- UsageSnippet language="java" operationID="getTicketingNote2" method="get" path="/ticketing/{connection_id}/note/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTicketingNote2Request;
import to.unified.unified_java_sdk.models.operations.GetTicketingNote2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTicketingNote2Request req = GetTicketingNote2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTicketingNote2Response res = sdk.ticketing().getTicketingNote2()
                .request(req)
                .call();

        if (res.ticketingNote().isPresent()) {
            System.out.println(res.ticketingNote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetTicketingNote2Request](../../models/operations/GetTicketingNote2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetTicketingNote2Response](../../models/operations/GetTicketingNote2Response.md)**

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

        GetTicketingTicket2Response res = sdk.ticketing().getTicketingTicket2()
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

## listTicketingCategories2

List all categories

### Example Usage

<!-- UsageSnippet language="java" operationID="listTicketingCategories2" method="get" path="/ticketing/{connection_id}/category" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTicketingCategories2Request;
import to.unified.unified_java_sdk.models.operations.ListTicketingCategories2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTicketingCategories2Request req = ListTicketingCategories2Request.builder()
                .connectionId("<id>")
                .build();

        ListTicketingCategories2Response res = sdk.ticketing().listTicketingCategories2()
                .request(req)
                .call();

        if (res.ticketingCategories().isPresent()) {
            System.out.println(res.ticketingCategories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListTicketingCategories2Request](../../models/operations/ListTicketingCategories2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListTicketingCategories2Response](../../models/operations/ListTicketingCategories2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTicketingCustomers2

List all customers

### Example Usage

<!-- UsageSnippet language="java" operationID="listTicketingCustomers2" method="get" path="/ticketing/{connection_id}/customer" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTicketingCustomers2Request;
import to.unified.unified_java_sdk.models.operations.ListTicketingCustomers2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTicketingCustomers2Request req = ListTicketingCustomers2Request.builder()
                .connectionId("<id>")
                .build();

        ListTicketingCustomers2Response res = sdk.ticketing().listTicketingCustomers2()
                .request(req)
                .call();

        if (res.ticketingCustomers().isPresent()) {
            System.out.println(res.ticketingCustomers().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListTicketingCustomers2Request](../../models/operations/ListTicketingCustomers2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListTicketingCustomers2Response](../../models/operations/ListTicketingCustomers2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTicketingNotes2

List all notes

### Example Usage

<!-- UsageSnippet language="java" operationID="listTicketingNotes2" method="get" path="/ticketing/{connection_id}/note" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTicketingNotes2Request;
import to.unified.unified_java_sdk.models.operations.ListTicketingNotes2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTicketingNotes2Request req = ListTicketingNotes2Request.builder()
                .connectionId("<id>")
                .build();

        ListTicketingNotes2Response res = sdk.ticketing().listTicketingNotes2()
                .request(req)
                .call();

        if (res.ticketingNotes().isPresent()) {
            System.out.println(res.ticketingNotes().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListTicketingNotes2Request](../../models/operations/ListTicketingNotes2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListTicketingNotes2Response](../../models/operations/ListTicketingNotes2Response.md)**

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

        ListTicketingTickets2Response res = sdk.ticketing().listTicketingTickets2()
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

## patchTicketingCategory2

Update a category

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTicketingCategory2" method="patch" path="/ticketing/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchTicketingCategory2Request;
import to.unified.unified_java_sdk.models.operations.PatchTicketingCategory2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCategory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchTicketingCategory2Request req = PatchTicketingCategory2Request.builder()
                .ticketingCategory(TicketingCategory.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTicketingCategory2Response res = sdk.ticketing().patchTicketingCategory2()
                .request(req)
                .call();

        if (res.ticketingCategory().isPresent()) {
            System.out.println(res.ticketingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchTicketingCategory2Request](../../models/operations/PatchTicketingCategory2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchTicketingCategory2Response](../../models/operations/PatchTicketingCategory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchTicketingCustomer2

Update a customer

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTicketingCustomer2" method="patch" path="/ticketing/{connection_id}/customer/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchTicketingCustomer2Request;
import to.unified.unified_java_sdk.models.operations.PatchTicketingCustomer2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCustomer;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchTicketingCustomer2Request req = PatchTicketingCustomer2Request.builder()
                .ticketingCustomer(TicketingCustomer.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTicketingCustomer2Response res = sdk.ticketing().patchTicketingCustomer2()
                .request(req)
                .call();

        if (res.ticketingCustomer().isPresent()) {
            System.out.println(res.ticketingCustomer().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchTicketingCustomer2Request](../../models/operations/PatchTicketingCustomer2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchTicketingCustomer2Response](../../models/operations/PatchTicketingCustomer2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchTicketingNote2

Update a note

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTicketingNote2" method="patch" path="/ticketing/{connection_id}/note/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchTicketingNote2Request;
import to.unified.unified_java_sdk.models.operations.PatchTicketingNote2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingNote;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchTicketingNote2Request req = PatchTicketingNote2Request.builder()
                .ticketingNote(TicketingNote.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTicketingNote2Response res = sdk.ticketing().patchTicketingNote2()
                .request(req)
                .call();

        if (res.ticketingNote().isPresent()) {
            System.out.println(res.ticketingNote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchTicketingNote2Request](../../models/operations/PatchTicketingNote2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchTicketingNote2Response](../../models/operations/PatchTicketingNote2Response.md)**

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

        PatchTicketingTicket2Response res = sdk.ticketing().patchTicketingTicket2()
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

## removeTicketingCategory2

Remove a category

### Example Usage

<!-- UsageSnippet language="java" operationID="removeTicketingCategory2" method="delete" path="/ticketing/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingCategory2Request;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingCategory2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveTicketingCategory2Request req = RemoveTicketingCategory2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTicketingCategory2Response res = sdk.ticketing().removeTicketingCategory2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveTicketingCategory2Request](../../models/operations/RemoveTicketingCategory2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveTicketingCategory2Response](../../models/operations/RemoveTicketingCategory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeTicketingCustomer2

Remove a customer

### Example Usage

<!-- UsageSnippet language="java" operationID="removeTicketingCustomer2" method="delete" path="/ticketing/{connection_id}/customer/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingCustomer2Request;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingCustomer2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveTicketingCustomer2Request req = RemoveTicketingCustomer2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTicketingCustomer2Response res = sdk.ticketing().removeTicketingCustomer2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveTicketingCustomer2Request](../../models/operations/RemoveTicketingCustomer2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveTicketingCustomer2Response](../../models/operations/RemoveTicketingCustomer2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeTicketingNote2

Remove a note

### Example Usage

<!-- UsageSnippet language="java" operationID="removeTicketingNote2" method="delete" path="/ticketing/{connection_id}/note/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingNote2Request;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingNote2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveTicketingNote2Request req = RemoveTicketingNote2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTicketingNote2Response res = sdk.ticketing().removeTicketingNote2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveTicketingNote2Request](../../models/operations/RemoveTicketingNote2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveTicketingNote2Response](../../models/operations/RemoveTicketingNote2Response.md)**

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

        RemoveTicketingTicket2Response res = sdk.ticketing().removeTicketingTicket2()
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

## updateTicketingCategory2

Update a category

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTicketingCategory2" method="put" path="/ticketing/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingCategory2Request;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingCategory2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCategory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateTicketingCategory2Request req = UpdateTicketingCategory2Request.builder()
                .ticketingCategory(TicketingCategory.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTicketingCategory2Response res = sdk.ticketing().updateTicketingCategory2()
                .request(req)
                .call();

        if (res.ticketingCategory().isPresent()) {
            System.out.println(res.ticketingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateTicketingCategory2Request](../../models/operations/UpdateTicketingCategory2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateTicketingCategory2Response](../../models/operations/UpdateTicketingCategory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTicketingCustomer2

Update a customer

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTicketingCustomer2" method="put" path="/ticketing/{connection_id}/customer/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingCustomer2Request;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingCustomer2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCustomer;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateTicketingCustomer2Request req = UpdateTicketingCustomer2Request.builder()
                .ticketingCustomer(TicketingCustomer.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTicketingCustomer2Response res = sdk.ticketing().updateTicketingCustomer2()
                .request(req)
                .call();

        if (res.ticketingCustomer().isPresent()) {
            System.out.println(res.ticketingCustomer().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateTicketingCustomer2Request](../../models/operations/UpdateTicketingCustomer2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateTicketingCustomer2Response](../../models/operations/UpdateTicketingCustomer2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTicketingNote2

Update a note

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTicketingNote2" method="put" path="/ticketing/{connection_id}/note/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingNote2Request;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingNote2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingNote;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateTicketingNote2Request req = UpdateTicketingNote2Request.builder()
                .ticketingNote(TicketingNote.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTicketingNote2Response res = sdk.ticketing().updateTicketingNote2()
                .request(req)
                .call();

        if (res.ticketingNote().isPresent()) {
            System.out.println(res.ticketingNote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateTicketingNote2Request](../../models/operations/UpdateTicketingNote2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateTicketingNote2Response](../../models/operations/UpdateTicketingNote2Response.md)**

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

        UpdateTicketingTicket2Response res = sdk.ticketing().updateTicketingTicket2()
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