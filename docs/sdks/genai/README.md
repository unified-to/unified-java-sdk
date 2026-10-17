# Genai

## Overview

### Available Operations

* [createGenaiAgent](#creategenaiagent) - Create an agent
* [createGenaiEmbedding](#creategenaiembedding) - Create an embedding
* [createGenaiOrganization](#creategenaiorganization) - Create an organization
* [createGenaiPrompt](#creategenaiprompt) - Create a prompt
* [createGenaiTask](#creategenaitask) - Create a task
* [getGenaiAgent](#getgenaiagent) - Retrieve an agent
* [getGenaiModel](#getgenaimodel) - Retrieve a model
* [getGenaiOrganization](#getgenaiorganization) - Retrieve an organization
* [getGenaiSkill](#getgenaiskill) - Retrieve a skill
* [getGenaiTask](#getgenaitask) - Retrieve a task
* [listGenaiAgents](#listgenaiagents) - List all agents
* [listGenaiModels](#listgenaimodels) - List all models
* [listGenaiOrganizations](#listgenaiorganizations) - List all organizations
* [listGenaiSkills](#listgenaiskills) - List all skills
* [listGenaiTasks](#listgenaitasks) - List all tasks
* [patchGenaiAgent](#patchgenaiagent) - Update an agent
* [patchGenaiOrganization](#patchgenaiorganization) - Update an organization
* [patchGenaiTask](#patchgenaitask) - Update a task
* [removeGenaiAgent](#removegenaiagent) - Remove an agent
* [removeGenaiOrganization](#removegenaiorganization) - Remove an organization
* [removeGenaiSkill](#removegenaiskill) - Remove a skill
* [removeGenaiTask](#removegenaitask) - Remove a task
* [updateGenaiAgent](#updategenaiagent) - Update an agent
* [updateGenaiOrganization](#updategenaiorganization) - Update an organization
* [updateGenaiTask](#updategenaitask) - Update a task

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
                    .id("cab6099f-35d4-4222-8194-a6c0e9c4425d")
                    .instructions("Delicate tabella addo vita ver auctus corrumpo. Conscendo auctus maiores astrum sulum aufero bis stella. Non varius sto solus admitto vado suggero theatrum.")
                    .isActive(false)
                    .name("daughter with")
                    .updatedAt(OffsetDateTime.parse("2025-10-12T03:28:23.822Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateGenaiAgentResponse res = sdk.genai().createGenaiAgent()
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

## createGenaiEmbedding

Create an embedding

### Example Usage

<!-- UsageSnippet language="java" operationID="createGenaiEmbedding" method="post" path="/genai/{connection_id}/embedding" example="genai_embedding" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateGenaiEmbeddingRequest;
import to.unified.unified_java_sdk.models.operations.CreateGenaiEmbeddingResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateGenaiEmbeddingRequest req = CreateGenaiEmbeddingRequest.builder()
                .genaiEmbedding(GenaiEmbedding.builder()
                    .content(List.of(
                        GenaiEmbeddingContent.builder()
                            .text("Utrimque temptatio pecco demulceo.")
                            .build()))
                    .dimension(423d)
                    .embeddings("Est.")
                    .encondingFormat(EncondingFormat.FLOAT)
                    .id("1bc0ba27-82fa-4428-91e2-c03bf6817ec5")
                    .maxTokens(223d)
                    .tokensUsed(836d)
                    .type("classification")
                    .build())
                .connectionId("<id>")
                .build();

        CreateGenaiEmbeddingResponse res = sdk.genai().createGenaiEmbedding()
                .request(req)
                .call();

        if (res.genaiEmbedding().isPresent()) {
            System.out.println(res.genaiEmbedding().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateGenaiEmbeddingRequest](../../models/operations/CreateGenaiEmbeddingRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateGenaiEmbeddingResponse](../../models/operations/CreateGenaiEmbeddingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createGenaiOrganization

Create an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="createGenaiOrganization" method="post" path="/genai/{connection_id}/organization" example="genai_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateGenaiOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.CreateGenaiOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.GenaiOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateGenaiOrganizationRequest req = CreateGenaiOrganizationRequest.builder()
                .genaiOrganization(GenaiOrganization.builder()
                    .createdAt(OffsetDateTime.parse("2020-10-27T16:03:47.122Z"))
                    .description("Voluptates abeo subseco.")
                    .id("d260a77e-f455-4fca-90bc-971415546ce4")
                    .isActive(false)
                    .name("officially about")
                    .updatedAt(OffsetDateTime.parse("2023-01-24T22:34:10.875Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateGenaiOrganizationResponse res = sdk.genai().createGenaiOrganization()
                .request(req)
                .call();

        if (res.genaiOrganization().isPresent()) {
            System.out.println(res.genaiOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateGenaiOrganizationRequest](../../models/operations/CreateGenaiOrganizationRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateGenaiOrganizationResponse](../../models/operations/CreateGenaiOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createGenaiPrompt

Create a prompt

### Example Usage

<!-- UsageSnippet language="java" operationID="createGenaiPrompt" method="post" path="/genai/{connection_id}/prompt" example="genai_prompt" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateGenaiPromptRequest;
import to.unified.unified_java_sdk.models.operations.CreateGenaiPromptResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateGenaiPromptRequest req = CreateGenaiPromptRequest.builder()
                .genaiPrompt(GenaiPrompt.builder()
                    .answers(List.of(
                        GenaiAnswer.builder()
                            .id("TeZpueFB")
                            .type(GenaiAnswerType.CHOICE)
                            .confidence(0.5384309098590165)
                            .probabilities(List.of(
                                GenaiAnswerProbability.builder()
                                    .option("veniam")
                                    .probability(0.05683182482607663)
                                    .build(),
                                GenaiAnswerProbability.builder()
                                    .option("comes")
                                    .probability(0.1404057613108307)
                                    .build()))
                            .score(0.05974147981032729)
                            .value("summisse")
                            .build()))
                    .maxTokens(0.4677782787475735)
                    .mcpAuthorizationToken("f45a6e93-7bed-49b4-a5c8-37a2ed2d58f4")
                    .mcpDeferredTools(List.of())
                    .mcpUrl("https://unsung-dusk.info/")
                    .messages(List.of(
                        GenaiContent.builder()
                            .content("Aegre repudiandae verecundia facere statua.")
                            .images(List.of())
                            .role(Role.ASSISTANT)
                            .build(),
                        GenaiContent.builder()
                            .content("Speciosus xiphias soleo trepide crinis.")
                            .images(List.of())
                            .role(Role.SYSTEM)
                            .build()))
                    .questions(List.of(
                        GenaiQuestion.builder()
                            .id("KtvbYiEq")
                            .instructions("Admiratio cura contabesco subvenio venustas architecto vacuus summopere.")
                            .type(GenaiQuestionType.BOOLEAN)
                            .options(List.of(
                                "vulnero",
                                "quasi",
                                "tolero"))
                            .build(),
                        GenaiQuestion.builder()
                            .id("oV6IURtv")
                            .instructions("Celer deleniti ventus ipsam tendo odit.")
                            .type(GenaiQuestionType.CHOICE)
                            .options(List.of(
                                "nulla",
                                "aspicio",
                                "tero"))
                            .build(),
                        GenaiQuestion.builder()
                            .id("60dBZk2K")
                            .instructions("Decretum vesica amet repudiandae.")
                            .type(GenaiQuestionType.BOOLEAN)
                            .options(List.of(
                                "ducimus",
                                "civis",
                                "alter"))
                            .build()))
                    .responses(List.of(
                        "Balbus vobis circumvenio una."))
                    .temperature(0d)
                    .tokensUsed(975d)
                    .build())
                .connectionId("<id>")
                .build();

        CreateGenaiPromptResponse res = sdk.genai().createGenaiPrompt()
                .request(req)
                .call();

        if (res.genaiPrompt().isPresent()) {
            System.out.println(res.genaiPrompt().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateGenaiPromptRequest](../../models/operations/CreateGenaiPromptRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateGenaiPromptResponse](../../models/operations/CreateGenaiPromptResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createGenaiTask

Create a task

### Example Usage

<!-- UsageSnippet language="java" operationID="createGenaiTask" method="post" path="/genai/{connection_id}/task" example="genai_task" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateGenaiTaskRequest;
import to.unified.unified_java_sdk.models.operations.CreateGenaiTaskResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateGenaiTaskRequest req = CreateGenaiTaskRequest.builder()
                .genaiTask(GenaiTask.builder()
                    .completedAt(OffsetDateTime.parse("2025-09-27T23:33:54.288Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-25T20:19:33.247Z"))
                    .filesChanged(19d)
                    .id("81b6b13a-3798-4d38-b90e-a43db864a67d")
                    .instructions("Benigne canonicus officiis solvo adsidue deleo angustus.")
                    .linesAdded(244d)
                    .linesDeleted(118d)
                    .messages(List.of(
                        GenaiContent.builder()
                            .content("Stultus esse cursim stabilis tenetur amet contigo tristis.")
                            .images(List.of())
                            .role(Role.ASSISTANT)
                            .build()))
                    .name("connect multi-byte port")
                    .pullrequestUrl("https://github.com/berenice.satterfield/joshingly-ignorance/pull/383")
                    .repoUrl("https://github.com/berenice.satterfield/joshingly-ignorance")
                    .sourceBranchIdentifier("main")
                    .startedAt(OffsetDateTime.parse("2024-05-19T01:15:11.361Z"))
                    .status(GenaiTaskStatus.BLOCKED)
                    .summary("Cur aeternus cogito vesper.")
                    .targetBranchIdentifier("agent/joshingly-ignorance")
                    .tokensUsed(2165d)
                    .updatedAt(OffsetDateTime.parse("2023-02-24T17:46:29.314Z"))
                    .webUrl("https://inexperienced-adrenalin.biz/")
                    .build())
                .connectionId("<id>")
                .build();

        CreateGenaiTaskResponse res = sdk.genai().createGenaiTask()
                .request(req)
                .call();

        if (res.genaiTask().isPresent()) {
            System.out.println(res.genaiTask().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateGenaiTaskRequest](../../models/operations/CreateGenaiTaskRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateGenaiTaskResponse](../../models/operations/CreateGenaiTaskResponse.md)**

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

        GetGenaiAgentResponse res = sdk.genai().getGenaiAgent()
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

## getGenaiModel

Retrieve a model

### Example Usage

<!-- UsageSnippet language="java" operationID="getGenaiModel" method="get" path="/genai/{connection_id}/model/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetGenaiModelRequest;
import to.unified.unified_java_sdk.models.operations.GetGenaiModelResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetGenaiModelRequest req = GetGenaiModelRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetGenaiModelResponse res = sdk.genai().getGenaiModel()
                .request(req)
                .call();

        if (res.genaiModel().isPresent()) {
            System.out.println(res.genaiModel().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetGenaiModelRequest](../../models/operations/GetGenaiModelRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetGenaiModelResponse](../../models/operations/GetGenaiModelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getGenaiOrganization

Retrieve an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="getGenaiOrganization" method="get" path="/genai/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetGenaiOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.GetGenaiOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetGenaiOrganizationRequest req = GetGenaiOrganizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetGenaiOrganizationResponse res = sdk.genai().getGenaiOrganization()
                .request(req)
                .call();

        if (res.genaiOrganization().isPresent()) {
            System.out.println(res.genaiOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetGenaiOrganizationRequest](../../models/operations/GetGenaiOrganizationRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetGenaiOrganizationResponse](../../models/operations/GetGenaiOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getGenaiSkill

Retrieve a skill

### Example Usage

<!-- UsageSnippet language="java" operationID="getGenaiSkill" method="get" path="/genai/{connection_id}/skill/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetGenaiSkillRequest;
import to.unified.unified_java_sdk.models.operations.GetGenaiSkillResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetGenaiSkillRequest req = GetGenaiSkillRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetGenaiSkillResponse res = sdk.genai().getGenaiSkill()
                .request(req)
                .call();

        if (res.genaiSkill().isPresent()) {
            System.out.println(res.genaiSkill().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetGenaiSkillRequest](../../models/operations/GetGenaiSkillRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetGenaiSkillResponse](../../models/operations/GetGenaiSkillResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getGenaiTask

Retrieve a task

### Example Usage

<!-- UsageSnippet language="java" operationID="getGenaiTask" method="get" path="/genai/{connection_id}/task/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetGenaiTaskRequest;
import to.unified.unified_java_sdk.models.operations.GetGenaiTaskResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetGenaiTaskRequest req = GetGenaiTaskRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetGenaiTaskResponse res = sdk.genai().getGenaiTask()
                .request(req)
                .call();

        if (res.genaiTask().isPresent()) {
            System.out.println(res.genaiTask().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetGenaiTaskRequest](../../models/operations/GetGenaiTaskRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetGenaiTaskResponse](../../models/operations/GetGenaiTaskResponse.md)**

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

        ListGenaiAgentsResponse res = sdk.genai().listGenaiAgents()
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

## listGenaiModels

List all models

### Example Usage

<!-- UsageSnippet language="java" operationID="listGenaiModels" method="get" path="/genai/{connection_id}/model" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListGenaiModelsRequest;
import to.unified.unified_java_sdk.models.operations.ListGenaiModelsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListGenaiModelsRequest req = ListGenaiModelsRequest.builder()
                .connectionId("<id>")
                .build();

        ListGenaiModelsResponse res = sdk.genai().listGenaiModels()
                .request(req)
                .call();

        if (res.genaiModels().isPresent()) {
            System.out.println(res.genaiModels().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListGenaiModelsRequest](../../models/operations/ListGenaiModelsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListGenaiModelsResponse](../../models/operations/ListGenaiModelsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listGenaiOrganizations

List all organizations

### Example Usage

<!-- UsageSnippet language="java" operationID="listGenaiOrganizations" method="get" path="/genai/{connection_id}/organization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListGenaiOrganizationsRequest;
import to.unified.unified_java_sdk.models.operations.ListGenaiOrganizationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListGenaiOrganizationsRequest req = ListGenaiOrganizationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListGenaiOrganizationsResponse res = sdk.genai().listGenaiOrganizations()
                .request(req)
                .call();

        if (res.genaiOrganizations().isPresent()) {
            System.out.println(res.genaiOrganizations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListGenaiOrganizationsRequest](../../models/operations/ListGenaiOrganizationsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListGenaiOrganizationsResponse](../../models/operations/ListGenaiOrganizationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listGenaiSkills

List all skills

### Example Usage

<!-- UsageSnippet language="java" operationID="listGenaiSkills" method="get" path="/genai/{connection_id}/skill" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListGenaiSkillsRequest;
import to.unified.unified_java_sdk.models.operations.ListGenaiSkillsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListGenaiSkillsRequest req = ListGenaiSkillsRequest.builder()
                .connectionId("<id>")
                .build();

        ListGenaiSkillsResponse res = sdk.genai().listGenaiSkills()
                .request(req)
                .call();

        if (res.genaiSkills().isPresent()) {
            System.out.println(res.genaiSkills().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListGenaiSkillsRequest](../../models/operations/ListGenaiSkillsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListGenaiSkillsResponse](../../models/operations/ListGenaiSkillsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listGenaiTasks

List all tasks

### Example Usage

<!-- UsageSnippet language="java" operationID="listGenaiTasks" method="get" path="/genai/{connection_id}/task" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListGenaiTasksRequest;
import to.unified.unified_java_sdk.models.operations.ListGenaiTasksResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListGenaiTasksRequest req = ListGenaiTasksRequest.builder()
                .connectionId("<id>")
                .build();

        ListGenaiTasksResponse res = sdk.genai().listGenaiTasks()
                .request(req)
                .call();

        if (res.genaiTasks().isPresent()) {
            System.out.println(res.genaiTasks().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListGenaiTasksRequest](../../models/operations/ListGenaiTasksRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListGenaiTasksResponse](../../models/operations/ListGenaiTasksResponse.md)**

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
                    .id("7ccee43f-7a44-4fba-9285-687eb7b197b3")
                    .instructions("Delicate tabella addo vita ver auctus corrumpo. Conscendo auctus maiores astrum sulum aufero bis stella. Non varius sto solus admitto vado suggero theatrum.")
                    .isActive(false)
                    .name("daughter with")
                    .updatedAt(OffsetDateTime.parse("2025-10-12T03:28:23.826Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchGenaiAgentResponse res = sdk.genai().patchGenaiAgent()
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

## patchGenaiOrganization

Update an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="patchGenaiOrganization" method="patch" path="/genai/{connection_id}/organization/{id}" example="genai_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchGenaiOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.PatchGenaiOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.GenaiOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchGenaiOrganizationRequest req = PatchGenaiOrganizationRequest.builder()
                .genaiOrganization(GenaiOrganization.builder()
                    .createdAt(OffsetDateTime.parse("2020-10-27T16:03:47.122Z"))
                    .description("Voluptates abeo subseco.")
                    .id("f456b81c-ea86-421f-b329-e5d07ce06840")
                    .isActive(false)
                    .name("officially about")
                    .updatedAt(OffsetDateTime.parse("2023-01-24T22:34:10.876Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchGenaiOrganizationResponse res = sdk.genai().patchGenaiOrganization()
                .request(req)
                .call();

        if (res.genaiOrganization().isPresent()) {
            System.out.println(res.genaiOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchGenaiOrganizationRequest](../../models/operations/PatchGenaiOrganizationRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchGenaiOrganizationResponse](../../models/operations/PatchGenaiOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchGenaiTask

Update a task

### Example Usage

<!-- UsageSnippet language="java" operationID="patchGenaiTask" method="patch" path="/genai/{connection_id}/task/{id}" example="genai_task" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchGenaiTaskRequest;
import to.unified.unified_java_sdk.models.operations.PatchGenaiTaskResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchGenaiTaskRequest req = PatchGenaiTaskRequest.builder()
                .genaiTask(GenaiTask.builder()
                    .completedAt(OffsetDateTime.parse("2025-09-27T23:33:54.297Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-25T20:19:33.247Z"))
                    .filesChanged(19d)
                    .id("0353cc01-4a2f-4c8e-b8ee-94b5f28cee93")
                    .instructions("Benigne canonicus officiis solvo adsidue deleo angustus.")
                    .linesAdded(244d)
                    .linesDeleted(118d)
                    .messages(List.of(
                        GenaiContent.builder()
                            .content("Stultus esse cursim stabilis tenetur amet contigo tristis.")
                            .images(List.of())
                            .role(Role.ASSISTANT)
                            .build()))
                    .name("connect multi-byte port")
                    .pullrequestUrl("https://github.com/berenice.satterfield/joshingly-ignorance/pull/383")
                    .repoUrl("https://github.com/berenice.satterfield/joshingly-ignorance")
                    .sourceBranchIdentifier("main")
                    .startedAt(OffsetDateTime.parse("2024-05-19T01:15:11.368Z"))
                    .status(GenaiTaskStatus.BLOCKED)
                    .summary("Cur aeternus cogito vesper.")
                    .targetBranchIdentifier("agent/joshingly-ignorance")
                    .tokensUsed(2165d)
                    .updatedAt(OffsetDateTime.parse("2023-02-24T17:46:29.318Z"))
                    .webUrl("https://inexperienced-adrenalin.biz/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchGenaiTaskResponse res = sdk.genai().patchGenaiTask()
                .request(req)
                .call();

        if (res.genaiTask().isPresent()) {
            System.out.println(res.genaiTask().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchGenaiTaskRequest](../../models/operations/PatchGenaiTaskRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchGenaiTaskResponse](../../models/operations/PatchGenaiTaskResponse.md)**

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

        RemoveGenaiAgentResponse res = sdk.genai().removeGenaiAgent()
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

## removeGenaiOrganization

Remove an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="removeGenaiOrganization" method="delete" path="/genai/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveGenaiOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.RemoveGenaiOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveGenaiOrganizationRequest req = RemoveGenaiOrganizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveGenaiOrganizationResponse res = sdk.genai().removeGenaiOrganization()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveGenaiOrganizationRequest](../../models/operations/RemoveGenaiOrganizationRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveGenaiOrganizationResponse](../../models/operations/RemoveGenaiOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeGenaiSkill

Remove a skill

### Example Usage

<!-- UsageSnippet language="java" operationID="removeGenaiSkill" method="delete" path="/genai/{connection_id}/skill/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveGenaiSkillRequest;
import to.unified.unified_java_sdk.models.operations.RemoveGenaiSkillResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveGenaiSkillRequest req = RemoveGenaiSkillRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveGenaiSkillResponse res = sdk.genai().removeGenaiSkill()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveGenaiSkillRequest](../../models/operations/RemoveGenaiSkillRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveGenaiSkillResponse](../../models/operations/RemoveGenaiSkillResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeGenaiTask

Remove a task

### Example Usage

<!-- UsageSnippet language="java" operationID="removeGenaiTask" method="delete" path="/genai/{connection_id}/task/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveGenaiTaskRequest;
import to.unified.unified_java_sdk.models.operations.RemoveGenaiTaskResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveGenaiTaskRequest req = RemoveGenaiTaskRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveGenaiTaskResponse res = sdk.genai().removeGenaiTask()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveGenaiTaskRequest](../../models/operations/RemoveGenaiTaskRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveGenaiTaskResponse](../../models/operations/RemoveGenaiTaskResponse.md)**

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
                    .id("7ccee43f-7a44-4fba-9285-687eb7b197b3")
                    .instructions("Delicate tabella addo vita ver auctus corrumpo. Conscendo auctus maiores astrum sulum aufero bis stella. Non varius sto solus admitto vado suggero theatrum.")
                    .isActive(false)
                    .name("daughter with")
                    .updatedAt(OffsetDateTime.parse("2025-10-12T03:28:23.826Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateGenaiAgentResponse res = sdk.genai().updateGenaiAgent()
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

## updateGenaiOrganization

Update an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="updateGenaiOrganization" method="put" path="/genai/{connection_id}/organization/{id}" example="genai_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateGenaiOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.UpdateGenaiOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.GenaiOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateGenaiOrganizationRequest req = UpdateGenaiOrganizationRequest.builder()
                .genaiOrganization(GenaiOrganization.builder()
                    .createdAt(OffsetDateTime.parse("2020-10-27T16:03:47.122Z"))
                    .description("Voluptates abeo subseco.")
                    .id("f456b81c-ea86-421f-b329-e5d07ce06840")
                    .isActive(false)
                    .name("officially about")
                    .updatedAt(OffsetDateTime.parse("2023-01-24T22:34:10.876Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateGenaiOrganizationResponse res = sdk.genai().updateGenaiOrganization()
                .request(req)
                .call();

        if (res.genaiOrganization().isPresent()) {
            System.out.println(res.genaiOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateGenaiOrganizationRequest](../../models/operations/UpdateGenaiOrganizationRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateGenaiOrganizationResponse](../../models/operations/UpdateGenaiOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateGenaiTask

Update a task

### Example Usage

<!-- UsageSnippet language="java" operationID="updateGenaiTask" method="put" path="/genai/{connection_id}/task/{id}" example="genai_task" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateGenaiTaskRequest;
import to.unified.unified_java_sdk.models.operations.UpdateGenaiTaskResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateGenaiTaskRequest req = UpdateGenaiTaskRequest.builder()
                .genaiTask(GenaiTask.builder()
                    .completedAt(OffsetDateTime.parse("2025-09-27T23:33:54.297Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-25T20:19:33.247Z"))
                    .filesChanged(19d)
                    .id("0353cc01-4a2f-4c8e-b8ee-94b5f28cee93")
                    .instructions("Benigne canonicus officiis solvo adsidue deleo angustus.")
                    .linesAdded(244d)
                    .linesDeleted(118d)
                    .messages(List.of(
                        GenaiContent.builder()
                            .content("Stultus esse cursim stabilis tenetur amet contigo tristis.")
                            .images(List.of())
                            .role(Role.ASSISTANT)
                            .build()))
                    .name("connect multi-byte port")
                    .pullrequestUrl("https://github.com/berenice.satterfield/joshingly-ignorance/pull/383")
                    .repoUrl("https://github.com/berenice.satterfield/joshingly-ignorance")
                    .sourceBranchIdentifier("main")
                    .startedAt(OffsetDateTime.parse("2024-05-19T01:15:11.368Z"))
                    .status(GenaiTaskStatus.BLOCKED)
                    .summary("Cur aeternus cogito vesper.")
                    .targetBranchIdentifier("agent/joshingly-ignorance")
                    .tokensUsed(2165d)
                    .updatedAt(OffsetDateTime.parse("2023-02-24T17:46:29.318Z"))
                    .webUrl("https://inexperienced-adrenalin.biz/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateGenaiTaskResponse res = sdk.genai().updateGenaiTask()
                .request(req)
                .call();

        if (res.genaiTask().isPresent()) {
            System.out.println(res.genaiTask().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateGenaiTaskRequest](../../models/operations/UpdateGenaiTaskRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateGenaiTaskResponse](../../models/operations/UpdateGenaiTaskResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |