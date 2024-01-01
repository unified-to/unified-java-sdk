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
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTaskStatus;
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

            com.unifiedapi.unifiedto.models.operations.CreateCrmEventRequest req = new CreateCrmEventRequest(
                "string"){{
                crmEvent = new CrmEvent(
){{
                    call = new PropertyCrmEventCall(
){{
                        description = "Grass-roots intangible superstructure";
                        duration = 6684.26d;
                        startAt = OffsetDateTime.parse("2024-07-14T22:05:40.365Z");

                    }};
                    companyIds = new String[]{{
                        add("string"),
                    }};
                    contactIds = new String[]{{
                        add("string"),
                    }};
                    createdAt = OffsetDateTime.parse("2024-08-20T19:58:06.686Z");
                    dealIds = new String[]{{
                        add("string"),
                    }};
                    email = new PropertyCrmEventEmail(
){{
                        body = "string";
                        cc = new String[]{{
                            add("string"),
                        }};
                        createdAt = OffsetDateTime.parse("2024-08-07T07:41:34.472Z");
                        from = "string";
                        subject = "string";
                        to = new String[]{{
                            add("string"),
                        }};

                    }};
                    id = "<ID>";
                    leadIds = new String[]{{
                        add("string"),
                    }};
                    meeting = new PropertyCrmEventMeeting(
){{
                        description = "Ameliorated bottom-line internet solution";
                        endAt = OffsetDateTime.parse("2023-02-09T03:55:08.657Z");
                        startAt = OffsetDateTime.parse("2024-11-30T17:20:52.105Z");
                        title = "string";

                    }};
                    note = new PropertyCrmEventNote(
){{
                        createdAt = OffsetDateTime.parse("2022-03-29T07:09:52.923Z");
                        description = "Extended 5th generation artificial intelligence";

                    }};
                    raw = new PropertyCrmEventRaw(
);
                    task = new PropertyCrmEventTask(
){{
                        description = "Multi-tiered impactful attitude";
                        dueAt = OffsetDateTime.parse("2023-03-26T13:32:41.446Z");
                        name = "string";
                        status = PropertyCrmEventTaskStatus.COMPLETED;

                    }};
                    type = CrmEventType.NOTE;
                    updatedAt = OffsetDateTime.parse("2024-12-09T05:29:10.624Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmEventResponse res = sdk.event.createCrmEvent(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetCrmEventRequest req = new GetCrmEventRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmEventResponse res = sdk.event.getCrmEvent(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListCrmEventsRequest req = new ListCrmEventsRequest(
                "string"){{
                companyId = "string";
                contactId = "string";
                dealId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 4453.11d;
                offset = 4555.2d;
                order = "string";
                query = "string";
                sort = "string";
                type = "string";
                updatedGte = OffsetDateTime.parse("2024-04-30T03:39:38.103Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmEventsResponse res = sdk.event.listCrmEvents(req);

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
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTaskStatus;
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

            com.unifiedapi.unifiedto.models.operations.PatchCrmEventRequest req = new PatchCrmEventRequest(
                "string",
                "string"){{
                crmEvent = new CrmEvent(
){{
                    call = new PropertyCrmEventCall(
){{
                        description = "Multi-layered well-modulated middleware";
                        duration = 8718.07d;
                        startAt = OffsetDateTime.parse("2023-07-21T08:28:33.501Z");

                    }};
                    companyIds = new String[]{{
                        add("string"),
                    }};
                    contactIds = new String[]{{
                        add("string"),
                    }};
                    createdAt = OffsetDateTime.parse("2023-02-08T06:50:13.439Z");
                    dealIds = new String[]{{
                        add("string"),
                    }};
                    email = new PropertyCrmEventEmail(
){{
                        body = "string";
                        cc = new String[]{{
                            add("string"),
                        }};
                        createdAt = OffsetDateTime.parse("2024-09-27T20:19:13.205Z");
                        from = "string";
                        subject = "string";
                        to = new String[]{{
                            add("string"),
                        }};

                    }};
                    id = "<ID>";
                    leadIds = new String[]{{
                        add("string"),
                    }};
                    meeting = new PropertyCrmEventMeeting(
){{
                        description = "Advanced modular attitude";
                        endAt = OffsetDateTime.parse("2022-10-11T02:15:24.355Z");
                        startAt = OffsetDateTime.parse("2024-02-24T08:03:26.575Z");
                        title = "string";

                    }};
                    note = new PropertyCrmEventNote(
){{
                        createdAt = OffsetDateTime.parse("2022-08-26T02:54:49.814Z");
                        description = "Cross-platform bi-directional open architecture";

                    }};
                    raw = new PropertyCrmEventRaw(
);
                    task = new PropertyCrmEventTask(
){{
                        description = "Intuitive zero administration complexity";
                        dueAt = OffsetDateTime.parse("2022-09-27T21:56:51.556Z");
                        name = "string";
                        status = PropertyCrmEventTaskStatus.COMPLETED;

                    }};
                    type = CrmEventType.CALL;
                    updatedAt = OffsetDateTime.parse("2023-10-23T20:19:34.007Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmEventResponse res = sdk.event.patchCrmEvent(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCrmEventRequest req = new RemoveCrmEventRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmEventResponse res = sdk.event.removeCrmEvent(req);

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
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTaskStatus;
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

            com.unifiedapi.unifiedto.models.operations.UpdateCrmEventRequest req = new UpdateCrmEventRequest(
                "string",
                "string"){{
                crmEvent = new CrmEvent(
){{
                    call = new PropertyCrmEventCall(
){{
                        description = "Intuitive incremental orchestration";
                        duration = 4665.81d;
                        startAt = OffsetDateTime.parse("2022-09-01T05:59:54.461Z");

                    }};
                    companyIds = new String[]{{
                        add("string"),
                    }};
                    contactIds = new String[]{{
                        add("string"),
                    }};
                    createdAt = OffsetDateTime.parse("2023-09-01T08:44:00.944Z");
                    dealIds = new String[]{{
                        add("string"),
                    }};
                    email = new PropertyCrmEventEmail(
){{
                        body = "string";
                        cc = new String[]{{
                            add("string"),
                        }};
                        createdAt = OffsetDateTime.parse("2024-04-26T03:56:06.837Z");
                        from = "string";
                        subject = "string";
                        to = new String[]{{
                            add("string"),
                        }};

                    }};
                    id = "<ID>";
                    leadIds = new String[]{{
                        add("string"),
                    }};
                    meeting = new PropertyCrmEventMeeting(
){{
                        description = "Right-sized user-facing moratorium";
                        endAt = OffsetDateTime.parse("2024-07-14T19:40:01.934Z");
                        startAt = OffsetDateTime.parse("2024-12-12T17:15:09.122Z");
                        title = "string";

                    }};
                    note = new PropertyCrmEventNote(
){{
                        createdAt = OffsetDateTime.parse("2022-03-16T21:54:30.192Z");
                        description = "Pre-emptive system-worthy open system";

                    }};
                    raw = new PropertyCrmEventRaw(
);
                    task = new PropertyCrmEventTask(
){{
                        description = "Diverse clear-thinking success";
                        dueAt = OffsetDateTime.parse("2024-06-10T18:42:32.729Z");
                        name = "string";
                        status = PropertyCrmEventTaskStatus.NOT_STARTED;

                    }};
                    type = CrmEventType.TASK;
                    updatedAt = OffsetDateTime.parse("2024-12-12T06:25:41.650Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmEventResponse res = sdk.event.updateCrmEvent(req);

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

