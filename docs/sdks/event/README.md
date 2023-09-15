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
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdEventIdRequest req = new DeleteCrmConnectionIdEventIdRequest("quam", "ea");            

            DeleteCrmConnectionIdEventIdResponse res = sdk.event.deleteCrmConnectionIdEventId(req, new DeleteCrmConnectionIdEventIdSecurity("numquam") {{
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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdRequest](../../models/operations/DeleteCrmConnectionIdEventIdRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdSecurity](../../models/operations/DeleteCrmConnectionIdEventIdSecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


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
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdCompanyCompanyIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdEventIdCompanyCompanyIdRequest req = new DeleteCrmConnectionIdEventIdCompanyCompanyIdRequest("architecto", "fuga", "totam");            

            DeleteCrmConnectionIdEventIdCompanyCompanyIdResponse res = sdk.event.deleteCrmConnectionIdEventIdCompanyCompanyId(req, new DeleteCrmConnectionIdEventIdCompanyCompanyIdSecurity("velit") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                          | Type                                                                                                                                                                               | Required                                                                                                                                                                           | Description                                                                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdCompanyCompanyIdRequest](../../models/operations/DeleteCrmConnectionIdEventIdCompanyCompanyIdRequest.md)   | :heavy_check_mark:                                                                                                                                                                 | The request object to use for the request.                                                                                                                                         |
| `security`                                                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdCompanyCompanyIdSecurity](../../models/operations/DeleteCrmConnectionIdEventIdCompanyCompanyIdSecurity.md) | :heavy_check_mark:                                                                                                                                                                 | The security requirements to use for the request.                                                                                                                                  |


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
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdContactContactIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdEventIdContactContactIdRequest req = new DeleteCrmConnectionIdEventIdContactContactIdRequest("quasi", "sed", "officiis");            

            DeleteCrmConnectionIdEventIdContactContactIdResponse res = sdk.event.deleteCrmConnectionIdEventIdContactContactId(req, new DeleteCrmConnectionIdEventIdContactContactIdSecurity("veniam") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                          | Type                                                                                                                                                                               | Required                                                                                                                                                                           | Description                                                                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdContactContactIdRequest](../../models/operations/DeleteCrmConnectionIdEventIdContactContactIdRequest.md)   | :heavy_check_mark:                                                                                                                                                                 | The request object to use for the request.                                                                                                                                         |
| `security`                                                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdContactContactIdSecurity](../../models/operations/DeleteCrmConnectionIdEventIdContactContactIdSecurity.md) | :heavy_check_mark:                                                                                                                                                                 | The security requirements to use for the request.                                                                                                                                  |


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
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdDealDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdEventIdDealDealIdRequest req = new DeleteCrmConnectionIdEventIdDealDealIdRequest("quae", "dolore", "in");            

            DeleteCrmConnectionIdEventIdDealDealIdResponse res = sdk.event.deleteCrmConnectionIdEventIdDealDealId(req, new DeleteCrmConnectionIdEventIdDealDealIdSecurity("libero") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdDealDealIdRequest](../../models/operations/DeleteCrmConnectionIdEventIdDealDealIdRequest.md)   | :heavy_check_mark:                                                                                                                                                     | The request object to use for the request.                                                                                                                             |
| `security`                                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdDealDealIdSecurity](../../models/operations/DeleteCrmConnectionIdEventIdDealDealIdSecurity.md) | :heavy_check_mark:                                                                                                                                                     | The security requirements to use for the request.                                                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdEventRequest req = new GetCrmConnectionIdEventRequest("ut") {{
                companyId = "cumque";
                contactId = "quia";
                dealId = "beatae";
                limit = 7838.37d;
                offset = 7678.8d;
                order = "distinctio";
                query = "numquam";
                sort = "fugit";
                updatedGte = OffsetDateTime.parse("2022-05-15T00:58:22.386Z");
            }};            

            GetCrmConnectionIdEventResponse res = sdk.event.getCrmConnectionIdEvent(req, new GetCrmConnectionIdEventSecurity("facilis") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventRequest](../../models/operations/GetCrmConnectionIdEventRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventSecurity](../../models/operations/GetCrmConnectionIdEventSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdEventIdRequest req = new GetCrmConnectionIdEventIdRequest("minus", "vero");            

            GetCrmConnectionIdEventIdResponse res = sdk.event.getCrmConnectionIdEventId(req, new GetCrmConnectionIdEventIdSecurity("impedit") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventIdRequest](../../models/operations/GetCrmConnectionIdEventIdRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventIdSecurity](../../models/operations/GetCrmConnectionIdEventIdSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


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
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdEventIdRequest req = new PatchCrmConnectionIdEventIdRequest("omnis", "et") {{
                crmEvent = new CrmEvent() {{
                    call = new PropertyCrmEventCall() {{
                        description = "earum";
                        duration = 6855.13d;
                    }};;
                    companyIds = new String[]{{
                        add("est"),
                    }};
                    contactIds = new String[]{{
                        add("distinctio"),
                    }};
                    createdAt = OffsetDateTime.parse("2020-05-31T22:16:13.970Z");
                    dealIds = new String[]{{
                        add("totam"),
                    }};
                    email = new PropertyCrmEventEmail() {{
                        body = "praesentium";
                        cc = new String[]{{
                            add("officiis"),
                        }};
                        from = "esse";
                        subject = "vitae";
                        to = new String[]{{
                            add("delectus"),
                        }};
                    }};;
                    id = "6c48252d-7771-4e7f-9074-009ef8d29de1";
                    meeting = new PropertyCrmEventMeeting() {{
                        description = "facere";
                        endAt = OffsetDateTime.parse("2021-07-03T23:45:27.582Z");
                        startAt = OffsetDateTime.parse("2022-05-30T04:54:36.719Z");
                        title = "Ms.";
                    }};;
                    note = new PropertyCrmEventNote() {{
                        description = "tempore";
                    }};;
                    raw = new PropertyCrmEventRaw();;
                    task = new PropertyCrmEventTask() {{
                        description = "ullam";
                        name = "Hubert Beer";
                        status = "ullam";
                    }};;
                    type = CrmEventType.TASK;
                    updatedAt = OffsetDateTime.parse("2021-01-07T10:12:49.638Z");
                }};;
            }};            

            PatchCrmConnectionIdEventIdResponse res = sdk.event.patchCrmConnectionIdEventId(req, new PatchCrmConnectionIdEventIdSecurity("eum") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdRequest](../../models/operations/PatchCrmConnectionIdEventIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdSecurity](../../models/operations/PatchCrmConnectionIdEventIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdCompanyCompanyIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdEventIdCompanyCompanyIdRequest req = new PatchCrmConnectionIdEventIdCompanyCompanyIdRequest("cumque", "odio", "atque");            

            PatchCrmConnectionIdEventIdCompanyCompanyIdResponse res = sdk.event.patchCrmConnectionIdEventIdCompanyCompanyId(req, new PatchCrmConnectionIdEventIdCompanyCompanyIdSecurity("similique") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdCompanyCompanyIdRequest](../../models/operations/PatchCrmConnectionIdEventIdCompanyCompanyIdRequest.md)   | :heavy_check_mark:                                                                                                                                                               | The request object to use for the request.                                                                                                                                       |
| `security`                                                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdCompanyCompanyIdSecurity](../../models/operations/PatchCrmConnectionIdEventIdCompanyCompanyIdSecurity.md) | :heavy_check_mark:                                                                                                                                                               | The security requirements to use for the request.                                                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdContactContactIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdEventIdContactContactIdRequest req = new PatchCrmConnectionIdEventIdContactContactIdRequest("quia", "architecto", "ea");            

            PatchCrmConnectionIdEventIdContactContactIdResponse res = sdk.event.patchCrmConnectionIdEventIdContactContactId(req, new PatchCrmConnectionIdEventIdContactContactIdSecurity("accusamus") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdContactContactIdRequest](../../models/operations/PatchCrmConnectionIdEventIdContactContactIdRequest.md)   | :heavy_check_mark:                                                                                                                                                               | The request object to use for the request.                                                                                                                                       |
| `security`                                                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdContactContactIdSecurity](../../models/operations/PatchCrmConnectionIdEventIdContactContactIdSecurity.md) | :heavy_check_mark:                                                                                                                                                               | The security requirements to use for the request.                                                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdDealDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdEventIdDealDealIdRequest req = new PatchCrmConnectionIdEventIdDealDealIdRequest("illo", "excepturi", "harum");            

            PatchCrmConnectionIdEventIdDealDealIdResponse res = sdk.event.patchCrmConnectionIdEventIdDealDealId(req, new PatchCrmConnectionIdEventIdDealDealIdSecurity("laborum") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdDealDealIdRequest](../../models/operations/PatchCrmConnectionIdEventIdDealDealIdRequest.md)   | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |
| `security`                                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdDealDealIdSecurity](../../models/operations/PatchCrmConnectionIdEventIdDealDealIdSecurity.md) | :heavy_check_mark:                                                                                                                                                   | The security requirements to use for the request.                                                                                                                    |


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
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdEventSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostCrmConnectionIdEventRequest req = new PostCrmConnectionIdEventRequest("a") {{
                crmEvent = new CrmEvent() {{
                    call = new PropertyCrmEventCall() {{
                        description = "repudiandae";
                        duration = 7952.53d;
                    }};;
                    companyIds = new String[]{{
                        add("officia"),
                    }};
                    contactIds = new String[]{{
                        add("laboriosam"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-06-01T17:36:22.824Z");
                    dealIds = new String[]{{
                        add("veritatis"),
                    }};
                    email = new PropertyCrmEventEmail() {{
                        body = "aliquam";
                        cc = new String[]{{
                            add("excepturi"),
                        }};
                        from = "atque";
                        subject = "dicta";
                        to = new String[]{{
                            add("magnam"),
                        }};
                    }};;
                    id = "0b64ff8a-e170-4ef0-bb5f-37e4aa868555";
                    meeting = new PropertyCrmEventMeeting() {{
                        description = "iste";
                        endAt = OffsetDateTime.parse("2022-07-31T20:18:02.398Z");
                        startAt = OffsetDateTime.parse("2022-10-20T06:45:40.369Z");
                        title = "Mr.";
                    }};;
                    note = new PropertyCrmEventNote() {{
                        description = "animi";
                    }};;
                    raw = new PropertyCrmEventRaw();;
                    task = new PropertyCrmEventTask() {{
                        description = "dolorum";
                        name = "Mona Schaden";
                        status = "autem";
                    }};;
                    type = CrmEventType.TASK;
                    updatedAt = OffsetDateTime.parse("2022-03-19T13:47:36.994Z");
                }};;
            }};            

            PostCrmConnectionIdEventResponse res = sdk.event.postCrmConnectionIdEvent(req, new PostCrmConnectionIdEventSecurity("expedita") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdEventRequest](../../models/operations/PostCrmConnectionIdEventRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdEventSecurity](../../models/operations/PostCrmConnectionIdEventSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdEventIdRequest req = new PutCrmConnectionIdEventIdRequest("in", "eaque") {{
                crmEvent = new CrmEvent() {{
                    call = new PropertyCrmEventCall() {{
                        description = "delectus";
                        duration = 5019.46d;
                    }};;
                    companyIds = new String[]{{
                        add("minus"),
                    }};
                    contactIds = new String[]{{
                        add("tenetur"),
                    }};
                    createdAt = OffsetDateTime.parse("2021-12-12T02:41:48.224Z");
                    dealIds = new String[]{{
                        add("a"),
                    }};
                    email = new PropertyCrmEventEmail() {{
                        body = "tempore";
                        cc = new String[]{{
                            add("laboriosam"),
                        }};
                        from = "earum";
                        subject = "occaecati";
                        to = new String[]{{
                            add("dicta"),
                        }};
                    }};;
                    id = "b9a9f748-46e2-4c33-89db-0536d9e75ca0";
                    meeting = new PropertyCrmEventMeeting() {{
                        description = "sit";
                        endAt = OffsetDateTime.parse("2022-01-23T09:14:18.952Z");
                        startAt = OffsetDateTime.parse("2022-10-15T17:00:49.512Z");
                        title = "Miss";
                    }};;
                    note = new PropertyCrmEventNote() {{
                        description = "sed";
                    }};;
                    raw = new PropertyCrmEventRaw();;
                    task = new PropertyCrmEventTask() {{
                        description = "quo";
                        name = "Debra Ortiz";
                        status = "est";
                    }};;
                    type = CrmEventType.TASK;
                    updatedAt = OffsetDateTime.parse("2021-01-13T14:20:15.635Z");
                }};;
            }};            

            PutCrmConnectionIdEventIdResponse res = sdk.event.putCrmConnectionIdEventId(req, new PutCrmConnectionIdEventIdSecurity("provident") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdRequest](../../models/operations/PutCrmConnectionIdEventIdRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdSecurity](../../models/operations/PutCrmConnectionIdEventIdSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


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
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdCompanyCompanyIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdEventIdCompanyCompanyIdRequest req = new PutCrmConnectionIdEventIdCompanyCompanyIdRequest("sunt", "maiores", "excepturi");            

            PutCrmConnectionIdEventIdCompanyCompanyIdResponse res = sdk.event.putCrmConnectionIdEventIdCompanyCompanyId(req, new PutCrmConnectionIdEventIdCompanyCompanyIdSecurity("ducimus") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                    | Type                                                                                                                                                                         | Required                                                                                                                                                                     | Description                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdCompanyCompanyIdRequest](../../models/operations/PutCrmConnectionIdEventIdCompanyCompanyIdRequest.md)   | :heavy_check_mark:                                                                                                                                                           | The request object to use for the request.                                                                                                                                   |
| `security`                                                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdCompanyCompanyIdSecurity](../../models/operations/PutCrmConnectionIdEventIdCompanyCompanyIdSecurity.md) | :heavy_check_mark:                                                                                                                                                           | The security requirements to use for the request.                                                                                                                            |


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
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdContactContactIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdEventIdContactContactIdRequest req = new PutCrmConnectionIdEventIdContactContactIdRequest("dolore", "aspernatur", "molestias");            

            PutCrmConnectionIdEventIdContactContactIdResponse res = sdk.event.putCrmConnectionIdEventIdContactContactId(req, new PutCrmConnectionIdEventIdContactContactIdSecurity("fuga") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                    | Type                                                                                                                                                                         | Required                                                                                                                                                                     | Description                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdContactContactIdRequest](../../models/operations/PutCrmConnectionIdEventIdContactContactIdRequest.md)   | :heavy_check_mark:                                                                                                                                                           | The request object to use for the request.                                                                                                                                   |
| `security`                                                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdContactContactIdSecurity](../../models/operations/PutCrmConnectionIdEventIdContactContactIdSecurity.md) | :heavy_check_mark:                                                                                                                                                           | The security requirements to use for the request.                                                                                                                            |


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
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdDealDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdEventIdDealDealIdRequest req = new PutCrmConnectionIdEventIdDealDealIdRequest("at", "unde", "laborum");            

            PutCrmConnectionIdEventIdDealDealIdResponse res = sdk.event.putCrmConnectionIdEventIdDealDealId(req, new PutCrmConnectionIdEventIdDealDealIdSecurity("provident") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                        | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdDealDealIdRequest](../../models/operations/PutCrmConnectionIdEventIdDealDealIdRequest.md)   | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |
| `security`                                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdDealDealIdSecurity](../../models/operations/PutCrmConnectionIdEventIdDealDealIdSecurity.md) | :heavy_check_mark:                                                                                                                                               | The security requirements to use for the request.                                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdDealDealIdResponse](../../models/operations/PutCrmConnectionIdEventIdDealDealIdResponse.md)**

