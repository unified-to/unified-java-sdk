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

Creates a GenaiAgent. Provide the unified GenaiAgent fields in the request body; they are mapped to the provider's API. Returns the created GenaiAgent.

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
                    .id("3b4f0c27-1763-4397-b90e-1205070d7dfd")
                    .instructions("Delicate tabella addo vita ver auctus corrumpo. Conscendo auctus maiores astrum sulum aufero bis stella. Non varius sto solus admitto vado suggero theatrum.")
                    .isActive(false)
                    .name("daughter with")
                    .updatedAt(OffsetDateTime.parse("2025-10-21T06:15:46.954Z"))
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

Retrieves a single GenaiAgent by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Returns a list of GenaiAgents. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Updates the GenaiAgent identified by `id`. Provide the unified GenaiAgent fields to change in the request body.

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
                    .id("e45368fa-eb9a-4542-9e0c-30fdab3cea2b")
                    .instructions("Delicate tabella addo vita ver auctus corrumpo. Conscendo auctus maiores astrum sulum aufero bis stella. Non varius sto solus admitto vado suggero theatrum.")
                    .isActive(false)
                    .name("daughter with")
                    .updatedAt(OffsetDateTime.parse("2025-10-21T06:15:46.959Z"))
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

Deletes the GenaiAgent identified by `id`.

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

Updates the GenaiAgent identified by `id`. Provide the unified GenaiAgent fields to change in the request body.

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
                    .id("e45368fa-eb9a-4542-9e0c-30fdab3cea2b")
                    .instructions("Delicate tabella addo vita ver auctus corrumpo. Conscendo auctus maiores astrum sulum aufero bis stella. Non varius sto solus admitto vado suggero theatrum.")
                    .isActive(false)
                    .name("daughter with")
                    .updatedAt(OffsetDateTime.parse("2025-10-21T06:15:46.959Z"))
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