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
                "<value>"){{
                crmEvent = new CrmEvent(
){{
                    call = new PropertyCrmEventCall(
){{
                        description = "Grass-roots intangible superstructure";
                        duration = 6684.26d;
                        startAt = OffsetDateTime.parse("2024-07-14T22:05:40.365Z");

                    }};
                    companyIds = new String[]{{
                        add("<value>"),
                    }};
                    contactIds = new String[]{{
                        add("<value>"),
                    }};
                    createdAt = OffsetDateTime.parse("2024-08-20T19:58:06.686Z");
                    dealIds = new String[]{{
                        add("<value>"),
                    }};
                    email = new PropertyCrmEventEmail(
){{
                        attachmentFileIds = new String[]{{
                            add("<value>"),
                        }};
                        body = "<value>";
                        cc = new String[]{{
                            add("<value>"),
                        }};
                        from = "<value>";
                        subject = "<value>";
                        to = new String[]{{
                            add("<value>"),
                        }};

                    }};
                    id = "<id>";
                    leadIds = new String[]{{
                        add("<value>"),
                    }};
                    meeting = new PropertyCrmEventMeeting(
){{
                        description = "Synergistic 3rd generation capacity";
                        endAt = OffsetDateTime.parse("2023-08-07T03:26:53.520Z");
                        startAt = OffsetDateTime.parse("2023-02-09T03:55:08.657Z");
                        title = "<value>";

                    }};
                    note = new PropertyCrmEventNote(
){{
                        description = "Virtual asymmetric definition";
                        title = "<value>";

                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    task = new PropertyCrmEventTask(
){{
                        description = "Automated attitude-oriented info-mediaries";
                        dueAt = OffsetDateTime.parse("2023-07-15T02:47:03.388Z");
                        name = "<value>";
                        status = PropertyCrmEventTaskStatus.COMPLETED;

                    }};
                    type = CrmEventType.TASK;
                    updatedAt = OffsetDateTime.parse("2022-07-19T04:33:06.810Z");
                    userId = "<value>";

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
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
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
                "<value>"){{
                companyId = "<value>";
                contactId = "<value>";
                dealId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 4453.11d;
                offset = 4555.2d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                type = "<value>";
                updatedGte = OffsetDateTime.parse("2024-04-30T03:39:38.103Z");
                userId = "<value>";

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
                "<value>",
                "<value>"){{
                crmEvent = new CrmEvent(
){{
                    call = new PropertyCrmEventCall(
){{
                        description = "Multi-layered well-modulated middleware";
                        duration = 8718.07d;
                        startAt = OffsetDateTime.parse("2023-07-21T08:28:33.501Z");

                    }};
                    companyIds = new String[]{{
                        add("<value>"),
                    }};
                    contactIds = new String[]{{
                        add("<value>"),
                    }};
                    createdAt = OffsetDateTime.parse("2023-02-08T06:50:13.439Z");
                    dealIds = new String[]{{
                        add("<value>"),
                    }};
                    email = new PropertyCrmEventEmail(
){{
                        attachmentFileIds = new String[]{{
                            add("<value>"),
                        }};
                        body = "<value>";
                        cc = new String[]{{
                            add("<value>"),
                        }};
                        from = "<value>";
                        subject = "<value>";
                        to = new String[]{{
                            add("<value>"),
                        }};

                    }};
                    id = "<id>";
                    leadIds = new String[]{{
                        add("<value>"),
                    }};
                    meeting = new PropertyCrmEventMeeting(
){{
                        description = "Universal 24/7 migration";
                        endAt = OffsetDateTime.parse("2022-05-11T23:48:02.911Z");
                        startAt = OffsetDateTime.parse("2022-10-11T02:15:24.355Z");
                        title = "<value>";

                    }};
                    note = new PropertyCrmEventNote(
){{
                        description = "Realigned composite benchmark";
                        title = "<value>";

                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    task = new PropertyCrmEventTask(
){{
                        description = "Customer-focused needs-based groupware";
                        dueAt = OffsetDateTime.parse("2024-11-30T20:05:52.386Z");
                        name = "<value>";
                        status = PropertyCrmEventTaskStatus.COMPLETED;

                    }};
                    type = CrmEventType.EMAIL;
                    updatedAt = OffsetDateTime.parse("2022-07-15T05:10:26.446Z");
                    userId = "<value>";

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
                "<value>",
                "<value>");

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
                "<value>",
                "<value>"){{
                crmEvent = new CrmEvent(
){{
                    call = new PropertyCrmEventCall(
){{
                        description = "Intuitive incremental orchestration";
                        duration = 4665.81d;
                        startAt = OffsetDateTime.parse("2022-09-01T05:59:54.461Z");

                    }};
                    companyIds = new String[]{{
                        add("<value>"),
                    }};
                    contactIds = new String[]{{
                        add("<value>"),
                    }};
                    createdAt = OffsetDateTime.parse("2023-09-01T08:44:00.944Z");
                    dealIds = new String[]{{
                        add("<value>"),
                    }};
                    email = new PropertyCrmEventEmail(
){{
                        attachmentFileIds = new String[]{{
                            add("<value>"),
                        }};
                        body = "<value>";
                        cc = new String[]{{
                            add("<value>"),
                        }};
                        from = "<value>";
                        subject = "<value>";
                        to = new String[]{{
                            add("<value>"),
                        }};

                    }};
                    id = "<id>";
                    leadIds = new String[]{{
                        add("<value>"),
                    }};
                    meeting = new PropertyCrmEventMeeting(
){{
                        description = "Robust radical task-force";
                        endAt = OffsetDateTime.parse("2024-01-04T13:11:49.866Z");
                        startAt = OffsetDateTime.parse("2024-07-14T19:40:01.934Z");
                        title = "<value>";

                    }};
                    note = new PropertyCrmEventNote(
){{
                        description = "Visionary actuating migration";
                        title = "<value>";

                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    task = new PropertyCrmEventTask(
){{
                        description = "Synergized neutral complexity";
                        dueAt = OffsetDateTime.parse("2022-06-26T11:53:18.745Z");
                        name = "<value>";
                        status = PropertyCrmEventTaskStatus.DEFERRED;

                    }};
                    type = CrmEventType.CALL;
                    updatedAt = OffsetDateTime.parse("2023-02-13T22:59:19.685Z");
                    userId = "<value>";

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

