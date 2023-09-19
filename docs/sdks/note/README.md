# Note

### Available Operations

* [deleteTicketingConnectionIdNoteTicketIdId](#deleteticketingconnectionidnoteticketidid) - Remove a note
* [getTicketingConnectionIdNoteTicketId](#getticketingconnectionidnoteticketid) - List all notes
* [getTicketingConnectionIdNoteTicketIdId](#getticketingconnectionidnoteticketidid) - Retrieve a note
* [patchTicketingConnectionIdNoteTicketIdId](#patchticketingconnectionidnoteticketidid) - Update a note
* [postTicketingConnectionIdNoteTicketId](#postticketingconnectionidnoteticketid) - Create a note
* [putTicketingConnectionIdNoteTicketIdId](#putticketingconnectionidnoteticketidid) - Update a note

## deleteTicketingConnectionIdNoteTicketIdId

Remove a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNoteTicketIdIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNoteTicketIdIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNoteTicketIdIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteTicketingConnectionIdNoteTicketIdIdRequest req = new DeleteTicketingConnectionIdNoteTicketIdIdRequest("nisi", "quis", "perferendis");            

            DeleteTicketingConnectionIdNoteTicketIdIdResponse res = sdk.note.deleteTicketingConnectionIdNoteTicketIdId(req, new DeleteTicketingConnectionIdNoteTicketIdIdSecurity("itaque") {{
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

| Parameter                                                                                                                                                                    | Type                                                                                                                                                                         | Required                                                                                                                                                                     | Description                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNoteTicketIdIdRequest](../../models/operations/DeleteTicketingConnectionIdNoteTicketIdIdRequest.md)   | :heavy_check_mark:                                                                                                                                                           | The request object to use for the request.                                                                                                                                   |
| `security`                                                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNoteTicketIdIdSecurity](../../models/operations/DeleteTicketingConnectionIdNoteTicketIdIdSecurity.md) | :heavy_check_mark:                                                                                                                                                           | The security requirements to use for the request.                                                                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNoteTicketIdIdResponse](../../models/operations/DeleteTicketingConnectionIdNoteTicketIdIdResponse.md)**


## getTicketingConnectionIdNoteTicketId

List all notes

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNoteTicketIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNoteTicketIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNoteTicketIdSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetTicketingConnectionIdNoteTicketIdRequest req = new GetTicketingConnectionIdNoteTicketIdRequest("facere", "asperiores") {{
                limit = 1869.67d;
                offset = 1794.45d;
                order = "laborum";
                query = "sint";
                sort = "incidunt";
                updatedGte = OffsetDateTime.parse("2022-08-05T18:58:20.416Z");
            }};            

            GetTicketingConnectionIdNoteTicketIdResponse res = sdk.note.getTicketingConnectionIdNoteTicketId(req, new GetTicketingConnectionIdNoteTicketIdSecurity("aperiam") {{
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

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNoteTicketIdRequest](../../models/operations/GetTicketingConnectionIdNoteTicketIdRequest.md)   | :heavy_check_mark:                                                                                                                                                 | The request object to use for the request.                                                                                                                         |
| `security`                                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNoteTicketIdSecurity](../../models/operations/GetTicketingConnectionIdNoteTicketIdSecurity.md) | :heavy_check_mark:                                                                                                                                                 | The security requirements to use for the request.                                                                                                                  |


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
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNoteTicketIdIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetTicketingConnectionIdNoteTicketIdIdRequest req = new GetTicketingConnectionIdNoteTicketIdIdRequest("itaque", "quo", "perspiciatis");            

            GetTicketingConnectionIdNoteTicketIdIdResponse res = sdk.note.getTicketingConnectionIdNoteTicketIdId(req, new GetTicketingConnectionIdNoteTicketIdIdSecurity("accusantium") {{
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
| `request`                                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNoteTicketIdIdRequest](../../models/operations/GetTicketingConnectionIdNoteTicketIdIdRequest.md)   | :heavy_check_mark:                                                                                                                                                     | The request object to use for the request.                                                                                                                             |
| `security`                                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNoteTicketIdIdSecurity](../../models/operations/GetTicketingConnectionIdNoteTicketIdIdSecurity.md) | :heavy_check_mark:                                                                                                                                                     | The security requirements to use for the request.                                                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNoteTicketIdIdResponse](../../models/operations/GetTicketingConnectionIdNoteTicketIdIdResponse.md)**


## patchTicketingConnectionIdNoteTicketIdId

Update a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNoteTicketIdIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNoteTicketIdIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNoteTicketIdIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingNoteRaw;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchTicketingConnectionIdNoteTicketIdIdRequest req = new PatchTicketingConnectionIdNoteTicketIdIdRequest("debitis", "animi", "aliquam") {{
                ticketingNote = new TicketingNote(                new PropertyTicketingNoteRaw();) {{
                    agentId = "quasi";
                    createdAt = OffsetDateTime.parse("2022-09-13T00:32:30.813Z");
                    customerId = "hic";
                    description = "labore";
                    id = "65e85156-fff7-43fd-b54f-dd5ea9543398";
                    updatedAt = "illum";
                }};;
            }};            

            PatchTicketingConnectionIdNoteTicketIdIdResponse res = sdk.note.patchTicketingConnectionIdNoteTicketIdId(req, new PatchTicketingConnectionIdNoteTicketIdIdSecurity("laborum") {{
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

| Parameter                                                                                                                                                                  | Type                                                                                                                                                                       | Required                                                                                                                                                                   | Description                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNoteTicketIdIdRequest](../../models/operations/PatchTicketingConnectionIdNoteTicketIdIdRequest.md)   | :heavy_check_mark:                                                                                                                                                         | The request object to use for the request.                                                                                                                                 |
| `security`                                                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNoteTicketIdIdSecurity](../../models/operations/PatchTicketingConnectionIdNoteTicketIdIdSecurity.md) | :heavy_check_mark:                                                                                                                                                         | The security requirements to use for the request.                                                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNoteTicketIdIdResponse](../../models/operations/PatchTicketingConnectionIdNoteTicketIdIdResponse.md)**


## postTicketingConnectionIdNoteTicketId

Create a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNoteTicketIdRequest;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNoteTicketIdResponse;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNoteTicketIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingNoteRaw;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostTicketingConnectionIdNoteTicketIdRequest req = new PostTicketingConnectionIdNoteTicketIdRequest("sapiente", "soluta") {{
                ticketingNote = new TicketingNote(                new PropertyTicketingNoteRaw();) {{
                    agentId = "eius";
                    createdAt = OffsetDateTime.parse("2022-04-27T23:12:45.343Z");
                    customerId = "deleniti";
                    description = "assumenda";
                    id = "63388e4d-8039-4ea5-b9b1-8a244fd61903";
                    updatedAt = "iste";
                }};;
            }};            

            PostTicketingConnectionIdNoteTicketIdResponse res = sdk.note.postTicketingConnectionIdNoteTicketId(req, new PostTicketingConnectionIdNoteTicketIdSecurity("nulla") {{
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

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNoteTicketIdRequest](../../models/operations/PostTicketingConnectionIdNoteTicketIdRequest.md)   | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |
| `security`                                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNoteTicketIdSecurity](../../models/operations/PostTicketingConnectionIdNoteTicketIdSecurity.md) | :heavy_check_mark:                                                                                                                                                   | The security requirements to use for the request.                                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNoteTicketIdResponse](../../models/operations/PostTicketingConnectionIdNoteTicketIdResponse.md)**


## putTicketingConnectionIdNoteTicketIdId

Update a note

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNoteTicketIdIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNoteTicketIdIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNoteTicketIdIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingNoteRaw;
import com.unifiedapi.unifiedto.models.shared.TicketingNote;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutTicketingConnectionIdNoteTicketIdIdRequest req = new PutTicketingConnectionIdNoteTicketIdIdRequest("dolorum", "maxime", "assumenda") {{
                ticketingNote = new TicketingNote(                new PropertyTicketingNoteRaw();) {{
                    agentId = "velit";
                    createdAt = OffsetDateTime.parse("2021-03-06T22:25:48.428Z");
                    customerId = "quibusdam";
                    description = "doloremque";
                    id = "dc671dc7-f1e3-4af1-9920-c90d1b4901f2";
                    updatedAt = "harum";
                }};;
            }};            

            PutTicketingConnectionIdNoteTicketIdIdResponse res = sdk.note.putTicketingConnectionIdNoteTicketIdId(req, new PutTicketingConnectionIdNoteTicketIdIdSecurity("quibusdam") {{
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
| `request`                                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNoteTicketIdIdRequest](../../models/operations/PutTicketingConnectionIdNoteTicketIdIdRequest.md)   | :heavy_check_mark:                                                                                                                                                     | The request object to use for the request.                                                                                                                             |
| `security`                                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNoteTicketIdIdSecurity](../../models/operations/PutTicketingConnectionIdNoteTicketIdIdSecurity.md) | :heavy_check_mark:                                                                                                                                                     | The security requirements to use for the request.                                                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNoteTicketIdIdResponse](../../models/operations/PutTicketingConnectionIdNoteTicketIdIdResponse.md)**

