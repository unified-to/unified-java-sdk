# Note
(*note*)

### Available Operations

* [createTicketingNote](#createticketingnote) - Create a note
* [getTicketingNote](#getticketingnote) - Retrieve a note
* [listTicketingNotes](#listticketingnotes) - List all notes
* [patchTicketingNote](#patchticketingnote) - Update a note
* [removeTicketingNote](#removeticketingnote) - Remove a note
* [updateTicketingNote](#updateticketingnote) - Update a note

## createTicketingNote

Create a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateTicketingNoteRequest;
import com.unifiedapi.unifiedto.models.operations.CreateTicketingNoteResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateTicketingNoteRequest req = new CreateTicketingNoteRequest(
                "<value>"){{
                ticketingNote = new TicketingNote(
){{
                    createdAt = OffsetDateTime.parse("2024-04-20T13:29:50.877Z");
                    customerId = "<value>";
                    description = "Distributed 4th generation portal";
                    id = "<id>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    ticketId = "<value>";
                    updatedAt = "<value>";
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateTicketingNoteResponse res = sdk.note.createTicketingNote(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetTicketingNoteRequest req = new GetTicketingNoteRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetTicketingNoteResponse res = sdk.note.getTicketingNote(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListTicketingNotesRequest req = new ListTicketingNotesRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 6345.23d;
                offset = 8100.5d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                ticketId = "<value>";
                updatedGte = OffsetDateTime.parse("2024-09-20T16:07:42.054Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListTicketingNotesResponse res = sdk.note.listTicketingNotes(req);

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


## patchTicketingNote

Update a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingNoteRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingNoteResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchTicketingNoteRequest req = new PatchTicketingNoteRequest(
                "<value>",
                "<value>"){{
                ticketingNote = new TicketingNote(
){{
                    createdAt = OffsetDateTime.parse("2024-09-04T20:58:12.449Z");
                    customerId = "<value>";
                    description = "Right-sized national productivity";
                    id = "<id>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    ticketId = "<value>";
                    updatedAt = "<value>";
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchTicketingNoteResponse res = sdk.note.patchTicketingNote(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveTicketingNoteRequest req = new RemoveTicketingNoteRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveTicketingNoteResponse res = sdk.note.removeTicketingNote(req);

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


## updateTicketingNote

Update a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateTicketingNoteRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateTicketingNoteResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateTicketingNoteRequest req = new UpdateTicketingNoteRequest(
                "<value>",
                "<value>"){{
                ticketingNote = new TicketingNote(
){{
                    createdAt = OffsetDateTime.parse("2024-05-15T01:15:48.418Z");
                    customerId = "<value>";
                    description = "Versatile value-added utilisation";
                    id = "<id>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    ticketId = "<value>";
                    updatedAt = "<value>";
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateTicketingNoteResponse res = sdk.note.updateTicketingNote(req);

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

