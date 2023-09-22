# Event

### Available Operations

* [deleteCrmConnectionIdEventId](#deletecrmconnectionideventid) - Remove a event
* [deleteCrmConnectionIdEventIdCompanyCompanyId](#deletecrmconnectionideventidcompanycompanyid) - Remove company association from an event
* [deleteCrmConnectionIdEventIdContactContactId](#deletecrmconnectionideventidcontactcontactid) - Remove contact association from an event
* [deleteCrmConnectionIdEventIdDealDealId](#deletecrmconnectionideventiddealdealid) - Remove deal association from an event
* [getCrmConnectionIdEvent](#getcrmconnectionidevent) - List all events
* [getCrmConnectionIdEventId](#getcrmconnectionideventid) - Retrieve a event
* [patchCrmConnectionIdEventId](#patchcrmconnectionideventid) - Update a event
* [patchCrmConnectionIdEventIdCompanyCompanyId](#patchcrmconnectionideventidcompanycompanyid) - Associate a company with an event
* [patchCrmConnectionIdEventIdContactContactId](#patchcrmconnectionideventidcontactcontactid) - Associate a contact with an event
* [patchCrmConnectionIdEventIdDealDealId](#patchcrmconnectionideventiddealdealid) - Associate a deal with an event
* [postCrmConnectionIdEvent](#postcrmconnectionidevent) - Create a event
* [putCrmConnectionIdEventId](#putcrmconnectionideventid) - Update a event
* [putCrmConnectionIdEventIdCompanyCompanyId](#putcrmconnectionideventidcompanycompanyid) - Associate a company with an event
* [putCrmConnectionIdEventIdContactContactId](#putcrmconnectionideventidcontactcontactid) - Associate a contact with an event
* [putCrmConnectionIdEventIdDealDealId](#putcrmconnectionideventiddealdealid) - Associate a deal with an event

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
                .setSecurity(new Security("numquam") {{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdEventIdRequest req = new DeleteCrmConnectionIdEventIdRequest("fugit", "amet");            

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


## deleteCrmConnectionIdEventIdCompanyCompanyId

Remove company association from an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdCompanyCompanyIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdCompanyCompanyIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("culpa") {{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdEventIdCompanyCompanyIdRequest req = new DeleteCrmConnectionIdEventIdCompanyCompanyIdRequest("facilis", "minus", "vero");            

            DeleteCrmConnectionIdEventIdCompanyCompanyIdResponse res = sdk.event.deleteCrmConnectionIdEventIdCompanyCompanyId(req);

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

| Parameter                                                                                                                                                                        | Type                                                                                                                                                                             | Required                                                                                                                                                                         | Description                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdCompanyCompanyIdRequest](../../models/operations/DeleteCrmConnectionIdEventIdCompanyCompanyIdRequest.md) | :heavy_check_mark:                                                                                                                                                               | The request object to use for the request.                                                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdCompanyCompanyIdResponse](../../models/operations/DeleteCrmConnectionIdEventIdCompanyCompanyIdResponse.md)**


## deleteCrmConnectionIdEventIdContactContactId

Remove contact association from an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdContactContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdContactContactIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("impedit") {{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdEventIdContactContactIdRequest req = new DeleteCrmConnectionIdEventIdContactContactIdRequest("omnis", "et", "earum");            

            DeleteCrmConnectionIdEventIdContactContactIdResponse res = sdk.event.deleteCrmConnectionIdEventIdContactContactId(req);

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

| Parameter                                                                                                                                                                        | Type                                                                                                                                                                             | Required                                                                                                                                                                         | Description                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdContactContactIdRequest](../../models/operations/DeleteCrmConnectionIdEventIdContactContactIdRequest.md) | :heavy_check_mark:                                                                                                                                                               | The request object to use for the request.                                                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdContactContactIdResponse](../../models/operations/DeleteCrmConnectionIdEventIdContactContactIdResponse.md)**


## deleteCrmConnectionIdEventIdDealDealId

Remove deal association from an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdDealDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdDealDealIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("fuga") {{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdEventIdDealDealIdRequest req = new DeleteCrmConnectionIdEventIdDealDealIdRequest("est", "distinctio", "fugiat");            

            DeleteCrmConnectionIdEventIdDealDealIdResponse res = sdk.event.deleteCrmConnectionIdEventIdDealDealId(req);

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

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdDealDealIdRequest](../../models/operations/DeleteCrmConnectionIdEventIdDealDealIdRequest.md) | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdDealDealIdResponse](../../models/operations/DeleteCrmConnectionIdEventIdDealDealIdResponse.md)**


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
                .setSecurity(new Security("nulla") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdEventRequest req = new GetCrmConnectionIdEventRequest("totam") {{
                companyId = "praesentium";
                contactId = "officiis";
                dealId = "esse";
                limit = 1151.48d;
                offset = 9651.17d;
                order = "laboriosam";
                query = "minus";
                sort = "labore";
                updatedGte = OffsetDateTime.parse("2022-09-14T01:23:15.914Z");
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
                .setSecurity(new Security("veniam") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdEventIdRequest req = new GetCrmConnectionIdEventIdRequest("sed", "quibusdam");            

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
                .setSecurity(new Security("reprehenderit") {{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdEventIdRequest req = new PatchCrmConnectionIdEventIdRequest("voluptate", "reprehenderit") {{
                crmEvent = new CrmEvent() {{
                    call = new PropertyCrmEventCall() {{
                        description = "et";
                        duration = 9107.12d;
                    }};;
                    companyIds = new String[]{{
                        add("voluptate"),
                    }};
                    contactIds = new String[]{{
                        add("hic"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-12-11T02:40:00.204Z");
                    dealIds = new String[]{{
                        add("in"),
                    }};
                    email = new PropertyCrmEventEmail() {{
                        body = "eius";
                        cc = new String[]{{
                            add("aut"),
                        }};
                        from = "consequatur";
                        subject = "iste";
                        to = new String[]{{
                            add("accusamus"),
                        }};
                    }};;
                    id = "f8d29de1-dd70-497b-9da0-8c57fa6c78a2";
                    meeting = new PropertyCrmEventMeeting() {{
                        description = "architecto";
                        endAt = OffsetDateTime.parse("2022-02-13T06:45:24.040Z");
                        startAt = OffsetDateTime.parse("2022-06-08T09:49:01.076Z");
                        title = "Miss";
                    }};;
                    note = new PropertyCrmEventNote() {{
                        description = "laborum";
                    }};;
                    raw = new PropertyCrmEventRaw();;
                    task = new PropertyCrmEventTask() {{
                        description = "a";
                        name = "Roosevelt Nitzsche V";
                        status = "veritatis";
                    }};;
                    type = CrmEventType.EMAIL;
                    updatedAt = OffsetDateTime.parse("2021-12-02T00:52:51.188Z");
                }};;
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


## patchCrmConnectionIdEventIdCompanyCompanyId

Associate a company with an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdCompanyCompanyIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdCompanyCompanyIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("dicta") {{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdEventIdCompanyCompanyIdRequest req = new PatchCrmConnectionIdEventIdCompanyCompanyIdRequest("magnam", "doloremque", "cum");            

            PatchCrmConnectionIdEventIdCompanyCompanyIdResponse res = sdk.event.patchCrmConnectionIdEventIdCompanyCompanyId(req);

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

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdCompanyCompanyIdRequest](../../models/operations/PatchCrmConnectionIdEventIdCompanyCompanyIdRequest.md) | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdCompanyCompanyIdResponse](../../models/operations/PatchCrmConnectionIdEventIdCompanyCompanyIdResponse.md)**


## patchCrmConnectionIdEventIdContactContactId

Associate a contact with an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdContactContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdContactContactIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("suscipit") {{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdEventIdContactContactIdRequest req = new PatchCrmConnectionIdEventIdContactContactIdRequest("eius", "maiores", "delectus");            

            PatchCrmConnectionIdEventIdContactContactIdResponse res = sdk.event.patchCrmConnectionIdEventIdContactContactId(req);

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

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdContactContactIdRequest](../../models/operations/PatchCrmConnectionIdEventIdContactContactIdRequest.md) | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdContactContactIdResponse](../../models/operations/PatchCrmConnectionIdEventIdContactContactIdResponse.md)**


## patchCrmConnectionIdEventIdDealDealId

Associate a deal with an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdDealDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdDealDealIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("quos") {{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdEventIdDealDealIdRequest req = new PatchCrmConnectionIdEventIdDealDealIdRequest("id", "officiis", "ab");            

            PatchCrmConnectionIdEventIdDealDealIdResponse res = sdk.event.patchCrmConnectionIdEventIdDealDealId(req);

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

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdDealDealIdRequest](../../models/operations/PatchCrmConnectionIdEventIdDealDealIdRequest.md) | :heavy_check_mark:                                                                                                                                                 | The request object to use for the request.                                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdDealDealIdResponse](../../models/operations/PatchCrmConnectionIdEventIdDealDealIdResponse.md)**


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
                .setSecurity(new Security("voluptate") {{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdEventRequest req = new PostCrmConnectionIdEventRequest("consequatur") {{
                crmEvent = new CrmEvent() {{
                    call = new PropertyCrmEventCall() {{
                        description = "itaque";
                        duration = 9970.47d;
                    }};;
                    companyIds = new String[]{{
                        add("voluptatem"),
                    }};
                    contactIds = new String[]{{
                        add("dolor"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-05-17T19:54:02.003Z");
                    dealIds = new String[]{{
                        add("a"),
                    }};
                    email = new PropertyCrmEventEmail() {{
                        body = "neque";
                        cc = new String[]{{
                            add("nihil"),
                        }};
                        from = "recusandae";
                        subject = "numquam";
                        to = new String[]{{
                            add("mollitia"),
                        }};
                    }};;
                    id = "a8685559-6673-42aa-9dcb-6682cb70f8cf";
                    meeting = new PropertyCrmEventMeeting() {{
                        description = "assumenda";
                        endAt = OffsetDateTime.parse("2022-01-17T19:39:24.214Z");
                        startAt = OffsetDateTime.parse("2022-03-23T03:20:12.848Z");
                        title = "Dr.";
                    }};;
                    note = new PropertyCrmEventNote() {{
                        description = "occaecati";
                    }};;
                    raw = new PropertyCrmEventRaw();;
                    task = new PropertyCrmEventTask() {{
                        description = "dicta";
                        name = "Alejandro Pacocha";
                        status = "dignissimos";
                    }};;
                    type = CrmEventType.EMAIL;
                    updatedAt = OffsetDateTime.parse("2022-06-02T07:20:44.734Z");
                }};;
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
                .setSecurity(new Security("aliquid") {{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdEventIdRequest req = new PutCrmConnectionIdEventIdRequest("repudiandae", "aspernatur") {{
                crmEvent = new CrmEvent() {{
                    call = new PropertyCrmEventCall() {{
                        description = "quod";
                        duration = 2101.21d;
                    }};;
                    companyIds = new String[]{{
                        add("neque"),
                    }};
                    contactIds = new String[]{{
                        add("ipsa"),
                    }};
                    createdAt = OffsetDateTime.parse("2021-05-04T07:03:12.007Z");
                    dealIds = new String[]{{
                        add("soluta"),
                    }};
                    email = new PropertyCrmEventEmail() {{
                        body = "aut";
                        cc = new String[]{{
                            add("ullam"),
                        }};
                        from = "amet";
                        subject = "iure";
                        to = new String[]{{
                            add("quibusdam"),
                        }};
                    }};;
                    id = "9e75ca00-6f53-492c-91a2-5a8bf92f9742";
                    meeting = new PropertyCrmEventMeeting() {{
                        description = "molestias";
                        endAt = OffsetDateTime.parse("2021-04-06T02:33:16.304Z");
                        startAt = OffsetDateTime.parse("2021-08-27T10:02:33.600Z");
                        title = "Ms.";
                    }};;
                    note = new PropertyCrmEventNote() {{
                        description = "hic";
                    }};;
                    raw = new PropertyCrmEventRaw();;
                    task = new PropertyCrmEventTask() {{
                        description = "corrupti";
                        name = "Amos Langosh";
                        status = "illo";
                    }};;
                    type = CrmEventType.NOTE;
                    updatedAt = OffsetDateTime.parse("2022-09-06T08:10:19.294Z");
                }};;
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


## putCrmConnectionIdEventIdCompanyCompanyId

Associate a company with an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdCompanyCompanyIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdCompanyCompanyIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("velit") {{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdEventIdCompanyCompanyIdRequest req = new PutCrmConnectionIdEventIdCompanyCompanyIdRequest("ullam", "provident", "possimus");            

            PutCrmConnectionIdEventIdCompanyCompanyIdResponse res = sdk.event.putCrmConnectionIdEventIdCompanyCompanyId(req);

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

| Parameter                                                                                                                                                                  | Type                                                                                                                                                                       | Required                                                                                                                                                                   | Description                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdCompanyCompanyIdRequest](../../models/operations/PutCrmConnectionIdEventIdCompanyCompanyIdRequest.md) | :heavy_check_mark:                                                                                                                                                         | The request object to use for the request.                                                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdCompanyCompanyIdResponse](../../models/operations/PutCrmConnectionIdEventIdCompanyCompanyIdResponse.md)**


## putCrmConnectionIdEventIdContactContactId

Associate a contact with an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdContactContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdContactContactIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("iste") {{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdEventIdContactContactIdRequest req = new PutCrmConnectionIdEventIdContactContactIdRequest("blanditiis", "consectetur", "totam");            

            PutCrmConnectionIdEventIdContactContactIdResponse res = sdk.event.putCrmConnectionIdEventIdContactContactId(req);

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

| Parameter                                                                                                                                                                  | Type                                                                                                                                                                       | Required                                                                                                                                                                   | Description                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdContactContactIdRequest](../../models/operations/PutCrmConnectionIdEventIdContactContactIdRequest.md) | :heavy_check_mark:                                                                                                                                                         | The request object to use for the request.                                                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdContactContactIdResponse](../../models/operations/PutCrmConnectionIdEventIdContactContactIdResponse.md)**


## putCrmConnectionIdEventIdDealDealId

Associate a deal with an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdDealDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdDealDealIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("dignissimos") {{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdEventIdDealDealIdRequest req = new PutCrmConnectionIdEventIdDealDealIdRequest("repellat", "iusto", "culpa");            

            PutCrmConnectionIdEventIdDealDealIdResponse res = sdk.event.putCrmConnectionIdEventIdDealDealId(req);

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

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdDealDealIdRequest](../../models/operations/PutCrmConnectionIdEventIdDealDealIdRequest.md) | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdDealDealIdResponse](../../models/operations/PutCrmConnectionIdEventIdDealDealIdResponse.md)**

