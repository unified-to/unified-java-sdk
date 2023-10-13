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
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingNoteRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Cruiser"){{
                    jwt = "";
                }})
                .build();

            CreateTicketingNoteRequest req = new CreateTicketingNoteRequest("kilogram", "hmph"){{
                ticketingNote = new TicketingNote(new PropertyTicketingNoteRaw()){{
                    agentId = "Dakota function interface";
                    createdAt = OffsetDateTime.parse("2023-06-27T08:45:10.338Z");
                    customerId = "Folk Outdoors";
                    description = "Open-source secondary toolset";
                    id = "<ID>";
                    updatedAt = "Underpass Cambridgeshire";
                }};
            }};            

            CreateTicketingNoteResponse res = sdk.note.createTicketingNote(req);

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
                .setSecurity(new Security("SSD"){{
                    jwt = "";
                }})
                .build();

            GetTicketingNoteRequest req = new GetTicketingNoteRequest("intranet", "Fresh", "Fitness");            

            GetTicketingNoteResponse res = sdk.note.getTicketingNote(req);

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
                .setSecurity(new Security("Data"){{
                    jwt = "";
                }})
                .build();

            ListTicketingNotesRequest req = new ListTicketingNotesRequest("because", "Zimbabwe"){{
                limit = 4262.61d;
                offset = 2323.04d;
                order = "Bicycle";
                query = "Ford";
                sort = "henry loudly complexity";
                updatedGte = OffsetDateTime.parse("2022-11-30T16:54:06.786Z");
            }};            

            ListTicketingNotesResponse res = sdk.note.listTicketingNotes(req);

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
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingNoteRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("soon"){{
                    jwt = "";
                }})
                .build();

            PatchTicketingNoteRequest req = new PatchTicketingNoteRequest("Strategist", "ew", "index"){{
                ticketingNote = new TicketingNote(new PropertyTicketingNoteRaw()){{
                    agentId = "woman Infrastructure";
                    createdAt = OffsetDateTime.parse("2021-04-25T13:14:35.457Z");
                    customerId = "Metal Hybrid";
                    description = "Networked multi-state matrix";
                    id = "<ID>";
                    updatedAt = "Cadillac Credit";
                }};
            }};            

            PatchTicketingNoteResponse res = sdk.note.patchTicketingNote(req);

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
                .setSecurity(new Security("Bicycle"){{
                    jwt = "";
                }})
                .build();

            RemoveTicketingNoteRequest req = new RemoveTicketingNoteRequest("hm", "West", "Borders");            

            RemoveTicketingNoteResponse res = sdk.note.removeTicketingNote(req);

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
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingNoteRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("lavender"){{
                    jwt = "";
                }})
                .build();

            UpdateTicketingNoteRequest req = new UpdateTicketingNoteRequest("waterspout", "York", "bluetooth"){{
                ticketingNote = new TicketingNote(new PropertyTicketingNoteRaw()){{
                    agentId = "when";
                    createdAt = OffsetDateTime.parse("2023-04-15T07:00:21.250Z");
                    customerId = "Cotton lesbian";
                    description = "Programmable contextually-based ability";
                    id = "<ID>";
                    updatedAt = "Dynamic nemo sievert";
                }};
            }};            

            UpdateTicketingNoteResponse res = sdk.note.updateTicketingNote(req);

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

