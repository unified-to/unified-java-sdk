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
                        body = "within";
                        cc = new String[]{{
                            add("PNG"),
                        }};
                        from = "generation";
                        subject = "Underpass";
                        to = new String[]{{
                            add("astrakhan"),
                        }};
                    }};
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting(){{
                        description = "Exclusive optimal matrix";
                        endAt = OffsetDateTime.parse("2023-07-15T12:28:49.883Z");
                        startAt = OffsetDateTime.parse("2023-03-21T07:12:55.587Z");
                        title = "supposing";
                    }};
                    note = new PropertyCrmEventNote(){{
                        description = "Ameliorated homogeneous utilisation";
                    }};
                    raw = new PropertyCrmEventRaw();
                    task = new PropertyCrmEventTask(){{
                        description = "Switchable directional productivity";
                        name = "Fresh";
                        status = "Southeast";
                    }};
                    type = CrmEventType.EMAIL;
                    updatedAt = OffsetDateTime.parse("2023-04-17T00:16:04.496Z");
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

            GetCrmEventRequest req = new GetCrmEventRequest("Ergonomic", "Director"){{
                fields = new String[]{{
                    add("comics"),
                }};
            }};            

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
                companyId = "violet";
                contactId = "generating";
                dealId = "paradigms";
                fields = new String[]{{
                    add("Checking"),
                }};
                limit = 2512.65d;
                offset = 3220.29d;
                order = "Saint";
                query = "gadzooks";
                sort = "Borders";
                updatedGte = OffsetDateTime.parse("2023-10-24T12:08:20.855Z");
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
                        body = "around";
                        cc = new String[]{{
                            add("Wooden"),
                        }};
                        from = "Gasoline";
                        subject = "neural";
                        to = new String[]{{
                            add("mole"),
                        }};
                    }};
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting(){{
                        description = "Total homogeneous policy";
                        endAt = OffsetDateTime.parse("2023-11-15T04:26:14.346Z");
                        startAt = OffsetDateTime.parse("2023-11-08T07:39:26.236Z");
                        title = "Idaho";
                    }};
                    note = new PropertyCrmEventNote(){{
                        description = "Up-sized asymmetric open architecture";
                    }};
                    raw = new PropertyCrmEventRaw();
                    task = new PropertyCrmEventTask(){{
                        description = "Profound holistic interface";
                        name = "DNS";
                        status = "Shoes";
                    }};
                    type = CrmEventType.EMAIL;
                    updatedAt = OffsetDateTime.parse("2021-11-11T23:29:31.701Z");
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
                        body = "thoroughly";
                        cc = new String[]{{
                            add("impactful"),
                        }};
                        from = "arse";
                        subject = "Jazz";
                        to = new String[]{{
                            add("Global"),
                        }};
                    }};
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting(){{
                        description = "Organized full-range productivity";
                        endAt = OffsetDateTime.parse("2021-07-12T17:04:07.207Z");
                        startAt = OffsetDateTime.parse("2021-07-28T12:59:49.441Z");
                        title = "Industrial";
                    }};
                    note = new PropertyCrmEventNote(){{
                        description = "Pre-emptive tertiary Graphic Interface";
                    }};
                    raw = new PropertyCrmEventRaw();
                    task = new PropertyCrmEventTask(){{
                        description = "Grass-roots responsive local area network";
                        name = "Baby";
                        status = "Rial";
                    }};
                    type = CrmEventType.NOTE;
                    updatedAt = OffsetDateTime.parse("2021-04-13T01:04:45.491Z");
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

