# Event
(*event*)

### Available Operations

* [deleteCrmConnectionIdEventId](#deletecrmconnectionideventid) - Remove a event
* [getCrmConnectionIdEvent](#getcrmconnectionidevent) - List all events
* [getCrmConnectionIdEventId](#getcrmconnectionideventid) - Retrieve a event
* [patchCrmConnectionIdEventId](#patchcrmconnectionideventid) - Update a event
* [postCrmConnectionIdEvent](#postcrmconnectionidevent) - Create a event
* [putCrmConnectionIdEventId](#putcrmconnectionideventid) - Update a event

## deleteCrmConnectionIdEventId

Remove a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("overriding"){{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdEventIdRequest req = new DeleteCrmConnectionIdEventIdRequest("Towels", "Moscovium");            

            DeleteCrmConnectionIdEventIdResponse res = sdk.event.deleteCrmConnectionIdEventId(req);

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdRequest](../../models/operations/DeleteCrmConnectionIdEventIdRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdResponse](../../models/operations/DeleteCrmConnectionIdEventIdResponse.md)**


## getCrmConnectionIdEvent

List all events

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("qua"){{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdEventRequest req = new GetCrmConnectionIdEventRequest("markets"){{
                companyId = "Bedfordshire";
                contactId = "Hybrid grey Ferrari";
                dealId = "Checking Southeast";
                limit = 7975.61d;
                offset = 1549.88d;
                order = "Salad Applications who";
                query = "Tricycle";
                sort = "Woman Recycled";
                updatedGte = OffsetDateTime.parse("2021-03-01T02:52:41.600Z");
            }};            

            GetCrmConnectionIdEventResponse res = sdk.event.getCrmConnectionIdEvent(req);

            if (res.crmEvents != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventRequest](../../models/operations/GetCrmConnectionIdEventRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventResponse](../../models/operations/GetCrmConnectionIdEventResponse.md)**


## getCrmConnectionIdEventId

Retrieve a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Credit"){{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdEventIdRequest req = new GetCrmConnectionIdEventIdRequest("equalise", "Diesel");            

            GetCrmConnectionIdEventIdResponse res = sdk.event.getCrmConnectionIdEventId(req);

            if (res.crmEvent != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventIdRequest](../../models/operations/GetCrmConnectionIdEventIdRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventIdResponse](../../models/operations/GetCrmConnectionIdEventIdResponse.md)**


## patchCrmConnectionIdEventId

Update a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("parse"){{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdEventIdRequest req = new PatchCrmConnectionIdEventIdRequest("intranet", "silver"){{
                crmEvent = new CrmEvent(){{
                    call = new PropertyCrmEventCall(){{
                        description = "Fully-configurable zero administration collaboration";
                        duration = 6394.52d;
                    }};
                    companyIds = new String[]{{
                        add("North"),
                    }};
                    contactIds = new String[]{{
                        add("French"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-04-03T00:59:00.853Z");
                    dealIds = new String[]{{
                        add("Avon"),
                    }};
                    email = new PropertyCrmEventEmail(){{
                        body = "SDD Toyota Northeast";
                        cc = new String[]{{
                            add("Sports"),
                        }};
                        from = "Electronics";
                        subject = "Demiflux impedit";
                        to = new String[]{{
                            add("Hyundai"),
                        }};
                    }};
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting(){{
                        description = "Multi-lateral 5th generation protocol";
                        endAt = OffsetDateTime.parse("2022-01-23T16:29:52.497Z");
                        startAt = OffsetDateTime.parse("2023-07-12T04:52:28.989Z");
                        title = "Executive";
                    }};
                    note = new PropertyCrmEventNote(){{
                        description = "Multi-lateral fault-tolerant framework";
                    }};
                    raw = new PropertyCrmEventRaw();
                    task = new PropertyCrmEventTask(){{
                        description = "Function-based even-keeled pricing structure";
                        name = "teethe Rustic";
                        status = "Investment male Electric";
                    }};
                    type = CrmEventType.EMAIL;
                    updatedAt = OffsetDateTime.parse("2021-09-28T03:55:44.303Z");
                }};
            }};            

            PatchCrmConnectionIdEventIdResponse res = sdk.event.patchCrmConnectionIdEventId(req);

            if (res.crmEvent != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdRequest](../../models/operations/PatchCrmConnectionIdEventIdRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdResponse](../../models/operations/PatchCrmConnectionIdEventIdResponse.md)**


## postCrmConnectionIdEvent

Create a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdEventRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdEventResponse;
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("carburize"){{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdEventRequest req = new PostCrmConnectionIdEventRequest("SDR"){{
                crmEvent = new CrmEvent(){{
                    call = new PropertyCrmEventCall(){{
                        description = "Customer-focused empowering conglomeration";
                        duration = 1255.4d;
                    }};
                    companyIds = new String[]{{
                        add("male"),
                    }};
                    contactIds = new String[]{{
                        add("Cupertino"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-07-24T22:18:30.290Z");
                    dealIds = new String[]{{
                        add("Cambodia"),
                    }};
                    email = new PropertyCrmEventEmail(){{
                        body = "male Games woman";
                        cc = new String[]{{
                            add("Rock"),
                        }};
                        from = "Soft Southeast";
                        subject = "capacitor Krone violet";
                        to = new String[]{{
                            add("Synergized"),
                        }};
                    }};
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting(){{
                        description = "Upgradable asymmetric hardware";
                        endAt = OffsetDateTime.parse("2021-12-19T09:09:38.264Z");
                        startAt = OffsetDateTime.parse("2023-11-21T21:46:08.139Z");
                        title = "harness Collierville payment";
                    }};
                    note = new PropertyCrmEventNote(){{
                        description = "Team-oriented context-sensitive definition";
                    }};
                    raw = new PropertyCrmEventRaw();
                    task = new PropertyCrmEventTask(){{
                        description = "Multi-layered radical projection";
                        name = "Gorgeous Louisiana Directives";
                        status = "indicate";
                    }};
                    type = CrmEventType.EMAIL;
                    updatedAt = OffsetDateTime.parse("2021-11-05T22:28:17.344Z");
                }};
            }};            

            PostCrmConnectionIdEventResponse res = sdk.event.postCrmConnectionIdEvent(req);

            if (res.crmEvent != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdEventRequest](../../models/operations/PostCrmConnectionIdEventRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdEventResponse](../../models/operations/PostCrmConnectionIdEventResponse.md)**


## putCrmConnectionIdEventId

Update a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Iron"){{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdEventIdRequest req = new PutCrmConnectionIdEventIdRequest("marshmallow", "DNS"){{
                crmEvent = new CrmEvent(){{
                    call = new PropertyCrmEventCall(){{
                        description = "Ameliorated solution-oriented installation";
                        duration = 7468.95d;
                    }};
                    companyIds = new String[]{{
                        add("naturalisation"),
                    }};
                    contactIds = new String[]{{
                        add("Hatchback"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-07-29T22:06:09.835Z");
                    dealIds = new String[]{{
                        add("engineer"),
                    }};
                    email = new PropertyCrmEventEmail(){{
                        body = "Modern provided";
                        cc = new String[]{{
                            add("Markets"),
                        }};
                        from = "Human Card";
                        subject = "Screen Reggae";
                        to = new String[]{{
                            add("frenetically"),
                        }};
                    }};
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting(){{
                        description = "Down-sized systematic installation";
                        endAt = OffsetDateTime.parse("2023-10-23T15:46:53.856Z");
                        startAt = OffsetDateTime.parse("2023-05-31T07:59:54.819Z");
                        title = "portal";
                    }};
                    note = new PropertyCrmEventNote(){{
                        description = "Assimilated 6th generation website";
                    }};
                    raw = new PropertyCrmEventRaw();
                    task = new PropertyCrmEventTask(){{
                        description = "Inverse client-server initiative";
                        name = "utilize nor";
                        status = "Customer sky";
                    }};
                    type = CrmEventType.NOTE;
                    updatedAt = OffsetDateTime.parse("2023-07-27T14:02:37.510Z");
                }};
            }};            

            PutCrmConnectionIdEventIdResponse res = sdk.event.putCrmConnectionIdEventId(req);

            if (res.crmEvent != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdRequest](../../models/operations/PutCrmConnectionIdEventIdRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdResponse](../../models/operations/PutCrmConnectionIdEventIdResponse.md)**

