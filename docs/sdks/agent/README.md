# Agent

## Overview

### Available Operations

* [createGenaiAgent](#creategenaiagent) - Create an agent
* [getGenaiAgent](#getgenaiagent) - Retrieve an agent
* [listGenaiAgents](#listgenaiagents) - List all agents
* [patchGenaiAgent](#patchgenaiagent) - Update an agent
* [removeGenaiAgent](#removegenaiagent) - Remove an agent
* [updateGenaiAgent](#updategenaiagent) - Update an agent

## createGenaiAgent

Create an agent

### Example Usage

<!-- UsageSnippet language="java" operationID="createGenaiAgent" method="post" path="/genai/{connection_id}/agent" example="genai_agent" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateGenaiAgentRequest;
import to.unified.unified_java_sdk.models.operations.CreateGenaiAgentResponse;
import to.unified.unified_java_sdk.models.shared.GenaiAgent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateGenaiAgentRequest req = CreateGenaiAgentRequest.builder()
                .genaiAgent(GenaiAgent.builder()
                    .createdAt(OffsetDateTime.parse("2020-12-18T02:23:33.723Z"))
                    .description("Assentator tero sequi.")
                    .id("eecd9967-8ffb-4fc8-9387-fe795c805bd3")
                    .instructions("Delicate tabella addo vita ver auctus corrumpo. Conscendo auctus maiores astrum sulum aufero bis stella. Non varius sto solus admitto vado suggero theatrum.")
                    .isActive(false)
                    .name("daughter with")
                    .updatedAt(OffsetDateTime.parse("2025-09-20T16:27:57.260Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateGenaiAgentResponse res = sdk.agent().createGenaiAgent()
                .request(req)
                .call();

        if (res.genaiAgent().isPresent()) {
            System.out.println(res.genaiAgent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateGenaiAgentRequest](../../models/operations/CreateGenaiAgentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateGenaiAgentResponse](../../models/operations/CreateGenaiAgentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getGenaiAgent

Retrieve an agent

### Example Usage

<!-- UsageSnippet language="java" operationID="getGenaiAgent" method="get" path="/genai/{connection_id}/agent/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetGenaiAgentRequest;
import to.unified.unified_java_sdk.models.operations.GetGenaiAgentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetGenaiAgentRequest req = GetGenaiAgentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetGenaiAgentResponse res = sdk.agent().getGenaiAgent()
                .request(req)
                .call();

        if (res.genaiAgent().isPresent()) {
            System.out.println(res.genaiAgent().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetGenaiAgentRequest](../../models/operations/GetGenaiAgentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetGenaiAgentResponse](../../models/operations/GetGenaiAgentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listGenaiAgents

List all agents

### Example Usage

<!-- UsageSnippet language="java" operationID="listGenaiAgents" method="get" path="/genai/{connection_id}/agent" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListGenaiAgentsRequest;
import to.unified.unified_java_sdk.models.operations.ListGenaiAgentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListGenaiAgentsRequest req = ListGenaiAgentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListGenaiAgentsResponse res = sdk.agent().listGenaiAgents()
                .request(req)
                .call();

        if (res.genaiAgents().isPresent()) {
            System.out.println(res.genaiAgents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListGenaiAgentsRequest](../../models/operations/ListGenaiAgentsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListGenaiAgentsResponse](../../models/operations/ListGenaiAgentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchGenaiAgent

Update an agent

### Example Usage

<!-- UsageSnippet language="java" operationID="patchGenaiAgent" method="patch" path="/genai/{connection_id}/agent/{id}" example="genai_agent" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchGenaiAgentRequest;
import to.unified.unified_java_sdk.models.operations.PatchGenaiAgentResponse;
import to.unified.unified_java_sdk.models.shared.GenaiAgent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchGenaiAgentRequest req = PatchGenaiAgentRequest.builder()
                .genaiAgent(GenaiAgent.builder()
                    .createdAt(OffsetDateTime.parse("2020-12-18T02:23:33.723Z"))
                    .description("Assentator tero sequi.")
                    .id("e9c89654-7de4-4cb3-9713-6a5249260a61")
                    .instructions("Delicate tabella addo vita ver auctus corrumpo. Conscendo auctus maiores astrum sulum aufero bis stella. Non varius sto solus admitto vado suggero theatrum.")
                    .isActive(false)
                    .name("daughter with")
                    .updatedAt(OffsetDateTime.parse("2025-09-20T16:27:57.270Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchGenaiAgentResponse res = sdk.agent().patchGenaiAgent()
                .request(req)
                .call();

        if (res.genaiAgent().isPresent()) {
            System.out.println(res.genaiAgent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchGenaiAgentRequest](../../models/operations/PatchGenaiAgentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchGenaiAgentResponse](../../models/operations/PatchGenaiAgentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeGenaiAgent

Remove an agent

### Example Usage

<!-- UsageSnippet language="java" operationID="removeGenaiAgent" method="delete" path="/genai/{connection_id}/agent/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveGenaiAgentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveGenaiAgentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveGenaiAgentRequest req = RemoveGenaiAgentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveGenaiAgentResponse res = sdk.agent().removeGenaiAgent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveGenaiAgentRequest](../../models/operations/RemoveGenaiAgentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveGenaiAgentResponse](../../models/operations/RemoveGenaiAgentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateGenaiAgent

Update an agent

### Example Usage

<!-- UsageSnippet language="java" operationID="updateGenaiAgent" method="put" path="/genai/{connection_id}/agent/{id}" example="genai_agent" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateGenaiAgentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateGenaiAgentResponse;
import to.unified.unified_java_sdk.models.shared.GenaiAgent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateGenaiAgentRequest req = UpdateGenaiAgentRequest.builder()
                .genaiAgent(GenaiAgent.builder()
                    .createdAt(OffsetDateTime.parse("2020-12-18T02:23:33.723Z"))
                    .description("Assentator tero sequi.")
                    .id("e9c89654-7de4-4cb3-9713-6a5249260a61")
                    .instructions("Delicate tabella addo vita ver auctus corrumpo. Conscendo auctus maiores astrum sulum aufero bis stella. Non varius sto solus admitto vado suggero theatrum.")
                    .isActive(false)
                    .name("daughter with")
                    .updatedAt(OffsetDateTime.parse("2025-09-20T16:27:57.270Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateGenaiAgentResponse res = sdk.agent().updateGenaiAgent()
                .request(req)
                .call();

        if (res.genaiAgent().isPresent()) {
            System.out.println(res.genaiAgent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateGenaiAgentRequest](../../models/operations/UpdateGenaiAgentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateGenaiAgentResponse](../../models/operations/UpdateGenaiAgentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |