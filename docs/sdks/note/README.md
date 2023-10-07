# Note
(*note*)

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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Intersex"){{
                    jwt = "";
                }})
                .build();

            DeleteTicketingConnectionIdNoteTicketIdIdRequest req = new DeleteTicketingConnectionIdNoteTicketIdIdRequest("Liaison", "deposit", "besides");            

            DeleteTicketingConnectionIdNoteTicketIdIdResponse res = sdk.note.deleteTicketingConnectionIdNoteTicketIdId(req);

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
                .setSecurity(new Security("Genderflux"){{
                    jwt = "";
                }})
                .build();

            GetTicketingConnectionIdNoteTicketIdRequest req = new GetTicketingConnectionIdNoteTicketIdRequest("synergy", "revolutionary"){{
                limit = 2310.88d;
                offset = 6688.82d;
                order = "AI";
                query = "stanch Investor attitude";
                sort = "Cotton";
                updatedGte = OffsetDateTime.parse("2022-05-07T04:47:47.948Z");
            }};            

            GetTicketingConnectionIdNoteTicketIdResponse res = sdk.note.getTicketingConnectionIdNoteTicketId(req);

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
                .setSecurity(new Security("Table"){{
                    jwt = "";
                }})
                .build();

            GetTicketingConnectionIdNoteTicketIdIdRequest req = new GetTicketingConnectionIdNoteTicketIdIdRequest("in", "Fords", "North");            

            GetTicketingConnectionIdNoteTicketIdIdResponse res = sdk.note.getTicketingConnectionIdNoteTicketIdId(req);

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
                .setSecurity(new Security("quos"){{
                    jwt = "";
                }})
                .build();

            PatchTicketingConnectionIdNoteTicketIdIdRequest req = new PatchTicketingConnectionIdNoteTicketIdIdRequest("Metal", "furrow", "York"){{
                ticketingNote = new TicketingNote(new PropertyTicketingNoteRaw()){{
                    agentId = "ROI";
                    createdAt = OffsetDateTime.parse("2023-12-26T03:25:45.709Z");
                    customerId = "Nissan";
                    description = "Focused composite open system";
                    id = "<ID>";
                    updatedAt = "frictionless convergence officia";
                }};
            }};            

            PatchTicketingConnectionIdNoteTicketIdIdResponse res = sdk.note.patchTicketingConnectionIdNoteTicketIdId(req);

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
                .setSecurity(new Security("virtual"){{
                    jwt = "";
                }})
                .build();

            PostTicketingConnectionIdNoteTicketIdRequest req = new PostTicketingConnectionIdNoteTicketIdRequest("vertical", "Officer"){{
                ticketingNote = new TicketingNote(new PropertyTicketingNoteRaw()){{
                    agentId = "Freeman";
                    createdAt = OffsetDateTime.parse("2022-08-22T15:22:13.118Z");
                    customerId = "functionalities";
                    description = "Object-based mobile standardization";
                    id = "<ID>";
                    updatedAt = "Sulfur Berkshire gold";
                }};
            }};            

            PostTicketingConnectionIdNoteTicketIdResponse res = sdk.note.postTicketingConnectionIdNoteTicketId(req);

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
                .setSecurity(new Security("Applications"){{
                    jwt = "";
                }})
                .build();

            PutTicketingConnectionIdNoteTicketIdIdRequest req = new PutTicketingConnectionIdNoteTicketIdIdRequest("male", "Southeast", "East"){{
                ticketingNote = new TicketingNote(new PropertyTicketingNoteRaw()){{
                    agentId = "Carolina architecture";
                    createdAt = OffsetDateTime.parse("2023-08-15T08:45:29.335Z");
                    customerId = "Northeast Morocco supposing";
                    description = "Grass-roots holistic conglomeration";
                    id = "<ID>";
                    updatedAt = "Hatchback Southwest round";
                }};
            }};            

            PutTicketingConnectionIdNoteTicketIdIdResponse res = sdk.note.putTicketingConnectionIdNoteTicketIdId(req);

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

