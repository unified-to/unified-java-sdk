# Agent

### Available Operations

* [deleteTicketingConnectionIdAgentId](#deleteticketingconnectionidagentid) - Remove a agent
* [getTicketingConnectionIdAgent](#getticketingconnectionidagent) - List all agents
* [getTicketingConnectionIdAgentId](#getticketingconnectionidagentid) - Retrieve a agent
* [getUcConnectionIdAgent](#getucconnectionidagent) - List all agents
* [patchTicketingConnectionIdAgentId](#patchticketingconnectionidagentid) - Update a agent
* [postTicketingConnectionIdAgent](#postticketingconnectionidagent) - Create a agent
* [putTicketingConnectionIdAgentId](#putticketingconnectionidagentid) - Update a agent

## deleteTicketingConnectionIdAgentId

Remove a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("corrupti") {{
                    jwt = "";
                }})
                .build();

            DeleteTicketingConnectionIdAgentIdRequest req = new DeleteTicketingConnectionIdAgentIdRequest("illum", "vel");            

            DeleteTicketingConnectionIdAgentIdResponse res = sdk.agent.deleteTicketingConnectionIdAgentId(req);

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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdRequest](../../models/operations/DeleteTicketingConnectionIdAgentIdRequest.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdResponse](../../models/operations/DeleteTicketingConnectionIdAgentIdResponse.md)**


## getTicketingConnectionIdAgent

List all agents

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("error") {{
                    jwt = "";
                }})
                .build();

            GetTicketingConnectionIdAgentRequest req = new GetTicketingConnectionIdAgentRequest("deserunt") {{
                limit = 3843.82d;
                offset = 4375.87d;
                order = "magnam";
                query = "debitis";
                sort = "ipsa";
                updatedGte = OffsetDateTime.parse("2022-03-08T10:35:32.561Z");
            }};            

            GetTicketingConnectionIdAgentResponse res = sdk.agent.getTicketingConnectionIdAgent(req);

            if (res.ticketingAgents != null) {
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
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentRequest](../../models/operations/GetTicketingConnectionIdAgentRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentResponse](../../models/operations/GetTicketingConnectionIdAgentResponse.md)**


## getTicketingConnectionIdAgentId

Retrieve a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("suscipit") {{
                    jwt = "";
                }})
                .build();

            GetTicketingConnectionIdAgentIdRequest req = new GetTicketingConnectionIdAgentIdRequest("molestiae", "minus");            

            GetTicketingConnectionIdAgentIdResponse res = sdk.agent.getTicketingConnectionIdAgentId(req);

            if (res.ticketingAgent != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentIdRequest](../../models/operations/GetTicketingConnectionIdAgentIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentIdResponse](../../models/operations/GetTicketingConnectionIdAgentIdResponse.md)**


## getUcConnectionIdAgent

List all agents

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdAgentRequest;
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdAgentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("placeat") {{
                    jwt = "";
                }})
                .build();

            GetUcConnectionIdAgentRequest req = new GetUcConnectionIdAgentRequest("voluptatum") {{
                contactId = "iusto";
                limit = 5680.45d;
                offset = 3927.85d;
                order = "recusandae";
                query = "temporibus";
                sort = "ab";
                updatedGte = OffsetDateTime.parse("2022-11-30T04:44:49.578Z");
            }};            

            GetUcConnectionIdAgentResponse res = sdk.agent.getUcConnectionIdAgent(req);

            if (res.ucAgents != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdAgentRequest](../../models/operations/GetUcConnectionIdAgentRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdAgentResponse](../../models/operations/GetUcConnectionIdAgentResponse.md)**


## patchTicketingConnectionIdAgentId

Update a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdAgentIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdAgentIdResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingAgentRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingAgent;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("deserunt") {{
                    jwt = "";
                }})
                .build();

            PatchTicketingConnectionIdAgentIdRequest req = new PatchTicketingConnectionIdAgentIdRequest("perferendis", "ipsam") {{
                ticketingAgent = new TicketingAgent(                new PropertyTicketingAgentRaw();) {{
                    createdAt = OffsetDateTime.parse("2020-02-17T21:57:45.117Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("quod") {{
                            email = "Brooke_Strosin47@hotmail.com";
                            type = TicketingEmailType.OTHER;
                        }}),
                    }};
                    id = "78ca1ba9-28fc-4816-b42c-b73920592939";
                    name = "May Turcotte";
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("iure") {{
                            telephone = "corporis";
                            type = TicketingTelephoneType.FAX;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2020-11-28T02:15:07.561Z");
                }};;
            }};            

            PatchTicketingConnectionIdAgentIdResponse res = sdk.agent.patchTicketingConnectionIdAgentId(req);

            if (res.ticketingAgent != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdAgentIdRequest](../../models/operations/PatchTicketingConnectionIdAgentIdRequest.md) | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdAgentIdResponse](../../models/operations/PatchTicketingConnectionIdAgentIdResponse.md)**


## postTicketingConnectionIdAgent

Create a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdAgentRequest;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdAgentResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingAgentRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingAgent;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("architecto") {{
                    jwt = "";
                }})
                .build();

            PostTicketingConnectionIdAgentRequest req = new PostTicketingConnectionIdAgentRequest("ipsa") {{
                ticketingAgent = new TicketingAgent(                new PropertyTicketingAgentRaw();) {{
                    createdAt = OffsetDateTime.parse("2020-12-31T21:22:14.646Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("nobis") {{
                            email = "Marcos35@yahoo.com";
                            type = TicketingEmailType.WORK;
                        }}),
                    }};
                    id = "5955907a-ff1a-43a2-ba94-67739251aa52";
                    name = "Jimmy Wiegand";
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("quasi") {{
                            telephone = "possimus";
                            type = TicketingTelephoneType.WORK;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-04-29T07:12:18.684Z");
                }};;
            }};            

            PostTicketingConnectionIdAgentResponse res = sdk.agent.postTicketingConnectionIdAgent(req);

            if (res.ticketingAgent != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdAgentRequest](../../models/operations/PostTicketingConnectionIdAgentRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdAgentResponse](../../models/operations/PostTicketingConnectionIdAgentResponse.md)**


## putTicketingConnectionIdAgentId

Update a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdAgentIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdAgentIdResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingAgentRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingAgent;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("laborum") {{
                    jwt = "";
                }})
                .build();

            PutTicketingConnectionIdAgentIdRequest req = new PutTicketingConnectionIdAgentIdRequest("quasi", "reiciendis") {{
                ticketingAgent = new TicketingAgent(                new PropertyTicketingAgentRaw();) {{
                    createdAt = OffsetDateTime.parse("2020-05-14T09:04:32.205Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("cum") {{
                            email = "John60@yahoo.com";
                            type = TicketingEmailType.HOME;
                        }}),
                    }};
                    id = "0074f154-71b5-4e6e-93b9-9d488e1e91e4";
                    name = "Elizabeth Orn";
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("quibusdam") {{
                            telephone = "deserunt";
                            type = TicketingTelephoneType.FAX;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-09-26T08:57:48.803Z");
                }};;
            }};            

            PutTicketingConnectionIdAgentIdResponse res = sdk.agent.putTicketingConnectionIdAgentId(req);

            if (res.ticketingAgent != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdAgentIdRequest](../../models/operations/PutTicketingConnectionIdAgentIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdAgentIdResponse](../../models/operations/PutTicketingConnectionIdAgentIdResponse.md)**

