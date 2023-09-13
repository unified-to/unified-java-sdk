# note

### Available Operations

* [deleteTicketingConnectionIdNotesTicketIdId](#deleteticketingconnectionidnotesticketidid) - Remove a note
* [getTicketingConnectionIdNotesTicketId](#getticketingconnectionidnotesticketid) - List all notes
* [getTicketingConnectionIdNotesTicketIdId](#getticketingconnectionidnotesticketidid) - Retrieve a note
* [patchTicketingConnectionIdNotesTicketIdId](#patchticketingconnectionidnotesticketidid) - Update a note
* [postTicketingConnectionIdNotesTicketId](#postticketingconnectionidnotesticketid) - Create a note
* [putTicketingConnectionIdNotesTicketIdId](#putticketingconnectionidnotesticketidid) - Update a note

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

            DeleteTicketingConnectionIdNotesTicketIdIdRequest req = new DeleteTicketingConnectionIdNotesTicketIdIdRequest("nisi", "quis", "perferendis");            

            DeleteTicketingConnectionIdNotesTicketIdIdResponse res = sdk.note.deleteTicketingConnectionIdNotesTicketIdId(req, new DeleteTicketingConnectionIdNotesTicketIdIdSecurity("itaque") {{
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

            GetTicketingConnectionIdNotesTicketIdRequest req = new GetTicketingConnectionIdNotesTicketIdRequest("facere", "asperiores") {{
                limit = 1869.67d;
                offset = 1794.45d;
                order = "laborum";
                query = "sint";
                sort = "incidunt";
                updatedGte = LocalDate.parse("2022-08-05");
            }};            

            GetTicketingConnectionIdNotesTicketIdResponse res = sdk.note.getTicketingConnectionIdNotesTicketId(req, new GetTicketingConnectionIdNotesTicketIdSecurity("aperiam") {{
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

            GetTicketingConnectionIdNotesTicketIdIdRequest req = new GetTicketingConnectionIdNotesTicketIdIdRequest("itaque", "quo", "perspiciatis");            

            GetTicketingConnectionIdNotesTicketIdIdResponse res = sdk.note.getTicketingConnectionIdNotesTicketIdId(req, new GetTicketingConnectionIdNotesTicketIdIdSecurity("accusantium") {{
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

            PatchTicketingConnectionIdNotesTicketIdIdRequest req = new PatchTicketingConnectionIdNotesTicketIdIdRequest("debitis", "animi", "aliquam") {{
                ticketingNote = new TicketingNote(                new PropertyTicketingNoteRaw();) {{
                    agentId = "quasi";
                    createdAt = LocalDate.parse("2022-09-13");
                    customerId = "hic";
                    description = "labore";
                    id = "65e85156-fff7-43fd-b54f-dd5ea9543398";
                    updatedAt = "illum";
                }};;
            }};            

            PatchTicketingConnectionIdNotesTicketIdIdResponse res = sdk.note.patchTicketingConnectionIdNotesTicketIdId(req, new PatchTicketingConnectionIdNotesTicketIdIdSecurity("laborum") {{
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

            PostTicketingConnectionIdNotesTicketIdRequest req = new PostTicketingConnectionIdNotesTicketIdRequest("sapiente", "soluta") {{
                ticketingNote = new TicketingNote(                new PropertyTicketingNoteRaw();) {{
                    agentId = "eius";
                    createdAt = LocalDate.parse("2022-04-27");
                    customerId = "deleniti";
                    description = "assumenda";
                    id = "63388e4d-8039-4ea5-b9b1-8a244fd61903";
                    updatedAt = "iste";
                }};;
            }};            

            PostTicketingConnectionIdNotesTicketIdResponse res = sdk.note.postTicketingConnectionIdNotesTicketId(req, new PostTicketingConnectionIdNotesTicketIdSecurity("nulla") {{
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

            PutTicketingConnectionIdNotesTicketIdIdRequest req = new PutTicketingConnectionIdNotesTicketIdIdRequest("dolorum", "maxime", "assumenda") {{
                ticketingNote = new TicketingNote(                new PropertyTicketingNoteRaw();) {{
                    agentId = "velit";
                    createdAt = LocalDate.parse("2021-03-06");
                    customerId = "quibusdam";
                    description = "doloremque";
                    id = "dc671dc7-f1e3-4af1-9920-c90d1b4901f2";
                    updatedAt = "harum";
                }};;
            }};            

            PutTicketingConnectionIdNotesTicketIdIdResponse res = sdk.note.putTicketingConnectionIdNotesTicketIdId(req, new PutTicketingConnectionIdNotesTicketIdIdSecurity("quibusdam") {{
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

