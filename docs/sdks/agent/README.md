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
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteTicketingConnectionIdAgentIdRequest req = new DeleteTicketingConnectionIdAgentIdRequest("quibusdam", "unde");            

            DeleteTicketingConnectionIdAgentIdResponse res = sdk.agent.deleteTicketingConnectionIdAgentId(req, new DeleteTicketingConnectionIdAgentIdSecurity("nulla") {{
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

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdRequest](../../models/operations/DeleteTicketingConnectionIdAgentIdRequest.md)   | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |
| `security`                                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdSecurity](../../models/operations/DeleteTicketingConnectionIdAgentIdSecurity.md) | :heavy_check_mark:                                                                                                                                             | The security requirements to use for the request.                                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetTicketingConnectionIdAgentRequest req = new GetTicketingConnectionIdAgentRequest("corrupti") {{
                limit = 8472.52d;
                offset = 4236.55d;
                order = "error";
                query = "deserunt";
                sort = "suscipit";
                updatedGte = OffsetDateTime.parse("2022-09-14T09:35:47.986Z");
            }};            

            GetTicketingConnectionIdAgentResponse res = sdk.agent.getTicketingConnectionIdAgent(req, new GetTicketingConnectionIdAgentSecurity("debitis") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentRequest](../../models/operations/GetTicketingConnectionIdAgentRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentSecurity](../../models/operations/GetTicketingConnectionIdAgentSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


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
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetTicketingConnectionIdAgentIdRequest req = new GetTicketingConnectionIdAgentIdRequest("ipsa", "delectus");            

            GetTicketingConnectionIdAgentIdResponse res = sdk.agent.getTicketingConnectionIdAgentId(req, new GetTicketingConnectionIdAgentIdSecurity("tempora") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentIdRequest](../../models/operations/GetTicketingConnectionIdAgentIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdAgentIdSecurity](../../models/operations/GetTicketingConnectionIdAgentIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdAgentSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUcConnectionIdAgentRequest req = new GetUcConnectionIdAgentRequest("suscipit") {{
                contactId = "molestiae";
                limit = 7917.25d;
                offset = 8121.69d;
                order = "voluptatum";
                query = "iusto";
                sort = "excepturi";
                updatedGte = OffsetDateTime.parse("2022-01-28T03:46:24.500Z");
            }};            

            GetUcConnectionIdAgentResponse res = sdk.agent.getUcConnectionIdAgent(req, new GetUcConnectionIdAgentSecurity("temporibus") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdAgentRequest](../../models/operations/GetUcConnectionIdAgentRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdAgentSecurity](../../models/operations/GetUcConnectionIdAgentSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdAgentIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingAgentRaw;
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
                .build();

            PatchTicketingConnectionIdAgentIdRequest req = new PatchTicketingConnectionIdAgentIdRequest("ab", "quis") {{
                ticketingAgent = new TicketingAgent(                new PropertyTicketingAgentRaw();) {{
                    createdAt = OffsetDateTime.parse("2022-05-09T10:00:51.349Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("at") {{
                            email = "Freeda_Sipes14@gmail.com";
                            type = TicketingEmailType.OTHER;
                        }}),
                    }};
                    id = "f7cc78ca-1ba9-428f-8816-742cb7392059";
                    name = "Sheryl Fadel";
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("fuga") {{
                            telephone = "hic";
                            type = TicketingTelephoneType.MOBILE;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-08-22T18:42:38.160Z");
                }};;
            }};            

            PatchTicketingConnectionIdAgentIdResponse res = sdk.agent.patchTicketingConnectionIdAgentId(req, new PatchTicketingConnectionIdAgentIdSecurity("iste") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdAgentIdRequest](../../models/operations/PatchTicketingConnectionIdAgentIdRequest.md)   | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |
| `security`                                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdAgentIdSecurity](../../models/operations/PatchTicketingConnectionIdAgentIdSecurity.md) | :heavy_check_mark:                                                                                                                                           | The security requirements to use for the request.                                                                                                            |


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
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdAgentSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingAgentRaw;
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
                .build();

            PostTicketingConnectionIdAgentRequest req = new PostTicketingConnectionIdAgentRequest("iure") {{
                ticketingAgent = new TicketingAgent(                new PropertyTicketingAgentRaw();) {{
                    createdAt = OffsetDateTime.parse("2020-11-28T02:15:07.561Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("dolorem") {{
                            email = "Andy_Wisozk67@gmail.com";
                            type = TicketingEmailType.WORK;
                        }}),
                    }};
                    id = "52c59559-07af-4f1a-ba2f-a9467739251a";
                    name = "Bill Conn";
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("id") {{
                            telephone = "tenetur";
                            type = TicketingTelephoneType.HOME;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-12-17T03:20:13.120Z");
                }};;
            }};            

            PostTicketingConnectionIdAgentResponse res = sdk.agent.postTicketingConnectionIdAgent(req, new PostTicketingConnectionIdAgentSecurity("quasi") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdAgentRequest](../../models/operations/PostTicketingConnectionIdAgentRequest.md)   | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |
| `security`                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdAgentSecurity](../../models/operations/PostTicketingConnectionIdAgentSecurity.md) | :heavy_check_mark:                                                                                                                                     | The security requirements to use for the request.                                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdAgentIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingAgentRaw;
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
                .build();

            PutTicketingConnectionIdAgentIdRequest req = new PutTicketingConnectionIdAgentIdRequest("error", "temporibus") {{
                ticketingAgent = new TicketingAgent(                new PropertyTicketingAgentRaw();) {{
                    createdAt = OffsetDateTime.parse("2022-10-22T20:21:20.741Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("ipsa") {{
                            email = "Weston_Thiel@hotmail.com";
                            type = TicketingEmailType.OTHER;
                        }}),
                    }};
                    id = "97b0074f-1547-41b5-a6e1-3b99d488e1e9";
                    name = "Patti Gottlieb MD";
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("deserunt") {{
                            telephone = "quibusdam";
                            type = TicketingTelephoneType.WORK;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-04-26T18:54:54.344Z");
                }};;
            }};            

            PutTicketingConnectionIdAgentIdResponse res = sdk.agent.putTicketingConnectionIdAgentId(req, new PutTicketingConnectionIdAgentIdSecurity("labore") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdAgentIdRequest](../../models/operations/PutTicketingConnectionIdAgentIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdAgentIdSecurity](../../models/operations/PutTicketingConnectionIdAgentIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdAgentIdResponse](../../models/operations/PutTicketingConnectionIdAgentIdResponse.md)**

