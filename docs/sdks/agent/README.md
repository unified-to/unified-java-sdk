# Agent
(*agent*)

### Available Operations

* [createTicketingAgent](#createticketingagent) - Create a agent
* [getTicketingAgent](#getticketingagent) - Retrieve a agent
* [listTicketingAgents](#listticketingagents) - List all agents
* [listUcAgents](#listucagents) - List all agents
* [patchTicketingAgent](#patchticketingagent) - Update a agent
* [removeTicketingAgent](#removeticketingagent) - Remove a agent
* [updateTicketingAgent](#updateticketingagent) - Update a agent

## createTicketingAgent

Create a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateTicketingAgentRequest;
import com.unifiedapi.unifiedto.models.operations.CreateTicketingAgentResponse;
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
                .setSecurity(new Security("Trans"){{
                    jwt = "";
                }})
                .build();

            CreateTicketingAgentRequest req = new CreateTicketingAgentRequest("bleakly"){{
                ticketingAgent = new TicketingAgent(new PropertyTicketingAgentRaw()){{
                    createdAt = OffsetDateTime.parse("2021-04-08T12:16:35.476Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("navigating"){{
                            email = "Sierra59@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "smoothly Algeria";
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("Africa"){{
                            telephone = "array lime";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-10-21T20:56:48.294Z");
                }};
                fields = new String[]{{
                    add("Electric"),
                }};
            }};            

            CreateTicketingAgentResponse res = sdk.agent.createTicketingAgent(req);

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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.CreateTicketingAgentRequest](../../models/operations/CreateTicketingAgentRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateTicketingAgentResponse](../../models/operations/CreateTicketingAgentResponse.md)**


## getTicketingAgent

Retrieve a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingAgentRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingAgentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Tennessee"){{
                    jwt = "";
                }})
                .build();

            GetTicketingAgentRequest req = new GetTicketingAgentRequest("connect", "Intersex"){{
                fields = new String[]{{
                    add("kindness"),
                }};
            }};            

            GetTicketingAgentResponse res = sdk.agent.getTicketingAgent(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetTicketingAgentRequest](../../models/operations/GetTicketingAgentRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingAgentResponse](../../models/operations/GetTicketingAgentResponse.md)**


## listTicketingAgents

List all agents

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListTicketingAgentsRequest;
import com.unifiedapi.unifiedto.models.operations.ListTicketingAgentsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("transparent"){{
                    jwt = "";
                }})
                .build();

            ListTicketingAgentsRequest req = new ListTicketingAgentsRequest("Corporate"){{
                fields = new String[]{{
                    add("monetize"),
                }};
                limit = 6003.65d;
                offset = 1931.45d;
                order = "South";
                query = "Investment World Small";
                sort = "kelvin";
                updatedGte = OffsetDateTime.parse("2023-09-24T13:03:50.991Z");
            }};            

            ListTicketingAgentsResponse res = sdk.agent.listTicketingAgents(req);

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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListTicketingAgentsRequest](../../models/operations/ListTicketingAgentsRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListTicketingAgentsResponse](../../models/operations/ListTicketingAgentsResponse.md)**


## listUcAgents

List all agents

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListUcAgentsRequest;
import com.unifiedapi.unifiedto.models.operations.ListUcAgentsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Ohio"){{
                    jwt = "";
                }})
                .build();

            ListUcAgentsRequest req = new ListUcAgentsRequest("huzzah"){{
                contactId = "hedgehog Awesome";
                fields = new String[]{{
                    add("Rock"),
                }};
                limit = 8708.31d;
                offset = 6888.79d;
                order = "Classical Electric aboard";
                query = "Analyst beside harmonious";
                sort = "Innovative male hierarchy";
                updatedGte = OffsetDateTime.parse("2021-02-24T03:25:44.788Z");
            }};            

            ListUcAgentsResponse res = sdk.agent.listUcAgents(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.ListUcAgentsRequest](../../models/operations/ListUcAgentsRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListUcAgentsResponse](../../models/operations/ListUcAgentsResponse.md)**


## patchTicketingAgent

Update a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingAgentRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingAgentResponse;
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
                .setSecurity(new Security("Bicycle"){{
                    jwt = "";
                }})
                .build();

            PatchTicketingAgentRequest req = new PatchTicketingAgentRequest("West", "fuchsia"){{
                ticketingAgent = new TicketingAgent(new PropertyTicketingAgentRaw()){{
                    createdAt = OffsetDateTime.parse("2021-09-19T17:28:38.459Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("female"){{
                            email = "Wava32@gmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "Borders Hybrid psst";
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("Electric"){{
                            telephone = "Web Som";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-06-19T13:45:09.457Z");
                }};
                fields = new String[]{{
                    add("reinvent"),
                }};
            }};            

            PatchTicketingAgentResponse res = sdk.agent.patchTicketingAgent(req);

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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchTicketingAgentRequest](../../models/operations/PatchTicketingAgentRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchTicketingAgentResponse](../../models/operations/PatchTicketingAgentResponse.md)**


## removeTicketingAgent

Remove a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveTicketingAgentRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveTicketingAgentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Northwest"){{
                    jwt = "";
                }})
                .build();

            RemoveTicketingAgentRequest req = new RemoveTicketingAgentRequest("mall", "male");            

            RemoveTicketingAgentResponse res = sdk.agent.removeTicketingAgent(req);

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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.RemoveTicketingAgentRequest](../../models/operations/RemoveTicketingAgentRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveTicketingAgentResponse](../../models/operations/RemoveTicketingAgentResponse.md)**


## updateTicketingAgent

Update a agent

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateTicketingAgentRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateTicketingAgentResponse;
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
                .setSecurity(new Security("Bicycle"){{
                    jwt = "";
                }})
                .build();

            UpdateTicketingAgentRequest req = new UpdateTicketingAgentRequest("niches", "Philippines"){{
                ticketingAgent = new TicketingAgent(new PropertyTicketingAgentRaw()){{
                    createdAt = OffsetDateTime.parse("2022-06-04T21:57:06.367Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("violet"){{
                            email = "Vincenzo.Haag97@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "Shoes";
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("Diesel"){{
                            telephone = "FTP Auto Road";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-03-23T14:40:54.013Z");
                }};
                fields = new String[]{{
                    add("near"),
                }};
            }};            

            UpdateTicketingAgentResponse res = sdk.agent.updateTicketingAgent(req);

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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.UpdateTicketingAgentRequest](../../models/operations/UpdateTicketingAgentRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateTicketingAgentResponse](../../models/operations/UpdateTicketingAgentResponse.md)**

