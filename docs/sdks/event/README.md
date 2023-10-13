# Event
(*event*)

### Available Operations

* [createCrmEvent](#createcrmevent) - Create a event
* [getCrmEvent](#getcrmevent) - Retrieve a event
* [listCrmEvents](#listcrmevents) - List all events
* [patchCrmEvent](#patchcrmevent) - Update a event
* [removeCrmEvent](#removecrmevent) - Remove a event
* [updateCrmEvent](#updatecrmevent) - Update a event

## createCrmEvent

Create a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmEventRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmEventResponse;
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
                .setSecurity(new Security("repeatedly"){{
                    jwt = "";
                }})
                .build();

            CreateCrmEventRequest req = new CreateCrmEventRequest("Sedan"){{
                crmEvent = new CrmEvent(){{
                    call = new PropertyCrmEventCall(){{
                        description = "Synergistic 3rd generation capacity";
                        duration = 5320.65d;
                    }};
                    companyIds = new String[]{{
                        add("zero"),
                    }};
                    contactIds = new String[]{{
                        add("Bronze"),
                    }};
                    createdAt = OffsetDateTime.parse("2021-05-09T00:50:22.588Z");
                    dealIds = new String[]{{
                        add("Savings"),
                    }};
                    email = new PropertyCrmEventEmail(){{
                        body = "forenenst interface Switzerland";
                        cc = new String[]{{
                            add("Underpass"),
                        }};
                        from = "Egypt Lutetium SUV";
                        subject = "Rock XSS Pickup";
                        to = new String[]{{
                            add("Fresh"),
                        }};
                    }};
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting(){{
                        description = "Configurable needs-based forecast";
                        endAt = OffsetDateTime.parse("2023-04-17T00:16:04.496Z");
                        startAt = OffsetDateTime.parse("2022-08-12T07:03:56.644Z");
                        title = "Hip Loan";
                    }};
                    note = new PropertyCrmEventNote(){{
                        description = "Quality-focused upward-trending budgetary management";
                    }};
                    raw = new PropertyCrmEventRaw();
                    task = new PropertyCrmEventTask(){{
                        description = "Secured stable software";
                        name = "as interface United";
                        status = "meanwhile viral Marketing";
                    }};
                    type = CrmEventType.CALL;
                    updatedAt = OffsetDateTime.parse("2021-03-02T15:18:14.793Z");
                }};
            }};            

            CreateCrmEventResponse res = sdk.event.createCrmEvent(req);

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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.CreateCrmEventRequest](../../models/operations/CreateCrmEventRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmEventResponse](../../models/operations/CreateCrmEventResponse.md)**


## getCrmEvent

Retrieve a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmEventRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmEventResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Technetium"){{
                    jwt = "";
                }})
                .build();

            GetCrmEventRequest req = new GetCrmEventRequest("Ergonomic", "Director");            

            GetCrmEventResponse res = sdk.event.getCrmEvent(req);

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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetCrmEventRequest](../../models/operations/GetCrmEventRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmEventResponse](../../models/operations/GetCrmEventResponse.md)**


## listCrmEvents

List all events

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmEventsRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmEventsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("withdrawal"){{
                    jwt = "";
                }})
                .build();

            ListCrmEventsRequest req = new ListCrmEventsRequest("empower"){{
                companyId = "payment Female Checking";
                contactId = "pascal";
                dealId = "Senior Executive warmly";
                limit = 3159.73d;
                offset = 1427.26d;
                order = "Borders proffer";
                query = "Road";
                sort = "Tasty";
                updatedGte = OffsetDateTime.parse("2023-04-23T19:45:04.750Z");
            }};            

            ListCrmEventsResponse res = sdk.event.listCrmEvents(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.ListCrmEventsRequest](../../models/operations/ListCrmEventsRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmEventsResponse](../../models/operations/ListCrmEventsResponse.md)**


## patchCrmEvent

Update a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmEventRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmEventResponse;
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
                .setSecurity(new Security("XML"){{
                    jwt = "";
                }})
                .build();

            PatchCrmEventRequest req = new PatchCrmEventRequest("Accountability", "copying"){{
                crmEvent = new CrmEvent(){{
                    call = new PropertyCrmEventCall(){{
                        description = "Universal 24/7 migration";
                        duration = 1195.18d;
                    }};
                    companyIds = new String[]{{
                        add("Metal"),
                    }};
                    contactIds = new String[]{{
                        add("Keyboard"),
                    }};
                    createdAt = OffsetDateTime.parse("2021-05-24T04:28:38.959Z");
                    dealIds = new String[]{{
                        add("Administrator"),
                    }};
                    email = new PropertyCrmEventEmail(){{
                        body = "Bike gold Intersex";
                        cc = new String[]{{
                            add("Polestar"),
                        }};
                        from = "miserably";
                        subject = "vein Idaho boo";
                        to = new String[]{{
                            add("Technician"),
                        }};
                    }};
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting(){{
                        description = "Multi-lateral intangible implementation";
                        endAt = OffsetDateTime.parse("2021-08-21T02:50:26.982Z");
                        startAt = OffsetDateTime.parse("2021-10-12T21:23:43.046Z");
                        title = "jest down";
                    }};
                    note = new PropertyCrmEventNote(){{
                        description = "Face to face coherent flexibility";
                    }};
                    raw = new PropertyCrmEventRaw();
                    task = new PropertyCrmEventTask(){{
                        description = "Enhanced multimedia array";
                        name = "Extended zero compressing";
                        status = "hierarchy mostly communities";
                    }};
                    type = CrmEventType.CALL;
                    updatedAt = OffsetDateTime.parse("2021-06-15T11:47:58.504Z");
                }};
            }};            

            PatchCrmEventResponse res = sdk.event.patchCrmEvent(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PatchCrmEventRequest](../../models/operations/PatchCrmEventRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmEventResponse](../../models/operations/PatchCrmEventResponse.md)**


## removeCrmEvent

Remove a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmEventRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmEventResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("enterprise"){{
                    jwt = "";
                }})
                .build();

            RemoveCrmEventRequest req = new RemoveCrmEventRequest("Kyat", "integrate");            

            RemoveCrmEventResponse res = sdk.event.removeCrmEvent(req);

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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.RemoveCrmEventRequest](../../models/operations/RemoveCrmEventRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmEventResponse](../../models/operations/RemoveCrmEventResponse.md)**


## updateCrmEvent

Update a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmEventRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmEventResponse;
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
                .setSecurity(new Security("Account"){{
                    jwt = "";
                }})
                .build();

            UpdateCrmEventRequest req = new UpdateCrmEventRequest("DRAM", "input"){{
                crmEvent = new CrmEvent(){{
                    call = new PropertyCrmEventCall(){{
                        description = "Right-sized user-facing moratorium";
                        duration = 8447.26d;
                    }};
                    companyIds = new String[]{{
                        add("beset"),
                    }};
                    contactIds = new String[]{{
                        add("Accountability"),
                    }};
                    createdAt = OffsetDateTime.parse("2023-02-03T22:22:41.402Z");
                    dealIds = new String[]{{
                        add("Keyboard"),
                    }};
                    email = new PropertyCrmEventEmail(){{
                        body = "Electric parsing Morgan";
                        cc = new String[]{{
                            add("Global"),
                        }};
                        from = "Manat mint";
                        subject = "Interactions Account ratione";
                        to = new String[]{{
                            add("Group"),
                        }};
                    }};
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting(){{
                        description = "Polarised coherent circuit";
                        endAt = OffsetDateTime.parse("2021-04-13T01:04:45.491Z");
                        startAt = OffsetDateTime.parse("2022-03-05T22:42:07.974Z");
                        title = "pish Specialist";
                    }};
                    note = new PropertyCrmEventNote(){{
                        description = "Down-sized secondary success";
                    }};
                    raw = new PropertyCrmEventRaw();
                    task = new PropertyCrmEventTask(){{
                        description = "User-friendly background installation";
                        name = "Intranet monitor Washington";
                        status = "hard drat weber";
                    }};
                    type = CrmEventType.MEETING;
                    updatedAt = OffsetDateTime.parse("2023-10-23T02:58:57.471Z");
                }};
            }};            

            UpdateCrmEventResponse res = sdk.event.updateCrmEvent(req);

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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.UpdateCrmEventRequest](../../models/operations/UpdateCrmEventRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmEventResponse](../../models/operations/UpdateCrmEventResponse.md)**

