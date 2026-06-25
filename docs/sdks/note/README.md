# Note

## Overview

### Available Operations

* [createTicketingNote2](#createticketingnote2) - Create a note
* [getTicketingNote2](#getticketingnote2) - Retrieve a note
* [listTicketingNotes2](#listticketingnotes2) - List all notes
* [patchTicketingNote2](#patchticketingnote2) - Update a note
* [removeTicketingNote2](#removeticketingnote2) - Remove a note
* [updateTicketingNote2](#updateticketingnote2) - Update a note

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

        CreateTicketingNote2Response res = sdk.note().createTicketingNote2()
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

        GetTicketingNote2Response res = sdk.note().getTicketingNote2()
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

        ListTicketingNotes2Response res = sdk.note().listTicketingNotes2()
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

        PatchTicketingNote2Response res = sdk.note().patchTicketingNote2()
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

        RemoveTicketingNote2Response res = sdk.note().removeTicketingNote2()
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

        UpdateTicketingNote2Response res = sdk.note().updateTicketingNote2()
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