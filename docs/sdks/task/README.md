# Task

## Overview

### Available Operations

* [createGenaiTask](#creategenaitask) - Create a task
* [createTaskComment](#createtaskcomment) - Create a comment
* [createTaskProject](#createtaskproject) - Create a project
* [createTaskTask](#createtasktask) - Create a task
* [getGenaiTask](#getgenaitask) - Retrieve a task
* [getTaskChange](#gettaskchange) - Retrieve a change
* [getTaskComment](#gettaskcomment) - Retrieve a comment
* [getTaskProject](#gettaskproject) - Retrieve a project
* [getTaskTask](#gettasktask) - Retrieve a task
* [listGenaiTasks](#listgenaitasks) - List all tasks
* [listTaskChanges](#listtaskchanges) - List all changes
* [listTaskComments](#listtaskcomments) - List all comments
* [listTaskProjects](#listtaskprojects) - List all projects
* [listTaskTasks](#listtasktasks) - List all tasks
* [patchGenaiTask](#patchgenaitask) - Update a task
* [patchTaskComment](#patchtaskcomment) - Update a comment
* [patchTaskProject](#patchtaskproject) - Update a project
* [patchTaskTask](#patchtasktask) - Update a task
* [removeGenaiTask](#removegenaitask) - Remove a task
* [removeTaskComment](#removetaskcomment) - Remove a comment
* [removeTaskProject](#removetaskproject) - Remove a project
* [removeTaskTask](#removetasktask) - Remove a task
* [updateGenaiTask](#updategenaitask) - Update a task
* [updateTaskComment](#updatetaskcomment) - Update a comment
* [updateTaskProject](#updatetaskproject) - Update a project
* [updateTaskTask](#updatetasktask) - Update a task

## createGenaiTask

Creates a GenaiTask. Provide the unified GenaiTask fields in the request body; they are mapped to the provider's API. Returns the created GenaiTask.

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
                    .completedAt(OffsetDateTime.parse("2025-10-30T21:40:50.485Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-25T20:19:33.247Z"))
                    .filesChanged(19d)
                    .id("d7dc1b30-797f-4da7-b83e-f55a15dda918")
                    .instructions("Angustus cubo cupio abundans admoveo sumptus.")
                    .linesAdded(244d)
                    .linesDeleted(118d)
                    .messages(List.of(
                        GenaiContent.builder()
                            .content("Amet contigo tristis deripio auxilium cur aeternus cogito.")
                            .images(List.of())
                            .role(Role.ASSISTANT)
                            .build()))
                    .name("connect online monitor")
                    .pullrequestUrl("https://github.com/felicity.rowe61/eek-save/pull/383")
                    .repoUrl("https://github.com/felicity.rowe61/eek-save")
                    .sourceBranchIdentifier("main")
                    .startedAt(OffsetDateTime.parse("2024-06-11T21:00:49.310Z"))
                    .status(GenaiTaskStatus.BLOCKED)
                    .summary("Tenus via tamisium denego teres adsidue cura crur. Coma defungo magnam delicate confero amaritudo varius.")
                    .targetBranchIdentifier("agent/eek-save")
                    .tokensUsed(2165d)
                    .updatedAt(OffsetDateTime.parse("2023-03-12T08:06:14.616Z"))
                    .webUrl("https://monstrous-honesty.net")
                    .build())
                .connectionId("<id>")
                .build();

        CreateGenaiTaskResponse res = sdk.task().createGenaiTask()
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

## createTaskComment

Creates a TaskComment. Provide the unified TaskComment fields in the request body; they are mapped to the provider's API. Returns the created TaskComment.

### Example Usage

<!-- UsageSnippet language="java" operationID="createTaskComment" method="post" path="/task/{connection_id}/comment" example="task_comment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateTaskCommentRequest;
import to.unified.unified_java_sdk.models.operations.CreateTaskCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TaskComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateTaskCommentRequest req = CreateTaskCommentRequest.builder()
                .taskComment(TaskComment.builder()
                    .createdAt(OffsetDateTime.parse("2019-10-12T20:33:37.879Z"))
                    .hasChildren(false)
                    .id("29dcc653-2096-42f0-b02c-2983b30cd1a7")
                    .metadata(List.of())
                    .text("Tabernus circumvenio demens placeat.")
                    .updatedAt(OffsetDateTime.parse("2021-10-13T10:40:50.749Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateTaskCommentResponse res = sdk.task().createTaskComment()
                .request(req)
                .call();

        if (res.taskComment().isPresent()) {
            System.out.println(res.taskComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateTaskCommentRequest](../../models/operations/CreateTaskCommentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateTaskCommentResponse](../../models/operations/CreateTaskCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createTaskProject

Creates a TaskProject. Provide the unified TaskProject fields in the request body; they are mapped to the provider's API. Returns the created TaskProject.

### Example Usage

<!-- UsageSnippet language="java" operationID="createTaskProject" method="post" path="/task/{connection_id}/project" example="task_project" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateTaskProjectRequest;
import to.unified.unified_java_sdk.models.operations.CreateTaskProjectResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateTaskProjectRequest req = CreateTaskProjectRequest.builder()
                .taskProject(TaskProject.builder()
                    .createdAt(OffsetDateTime.parse("2023-06-23T16:39:40.446Z"))
                    .description("Curiositas.")
                    .hasChildren(false)
                    .hasTasks(false)
                    .id("b828cc04-3b8b-4555-ace2-11b678f1a67a")
                    .metadata(List.of(
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("00529aca-756d-4143-90b9-ab55457d7440")
                            .namespace("custom")
                            .slug("vox")
                            .value(TaskMetadataValue.of("decens"))
                            .build(),
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("bd5cbefd-95cd-4d10-b7e5-19a4e1d45dc9")
                            .namespace("custom")
                            .slug("uterque")
                            .value(TaskMetadataValue.of("benevolentia"))
                            .build()))
                    .name("Baby")
                    .updatedAt(OffsetDateTime.parse("2023-10-14T20:32:41.196Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateTaskProjectResponse res = sdk.task().createTaskProject()
                .request(req)
                .call();

        if (res.taskProject().isPresent()) {
            System.out.println(res.taskProject().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateTaskProjectRequest](../../models/operations/CreateTaskProjectRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateTaskProjectResponse](../../models/operations/CreateTaskProjectResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createTaskTask

Creates a TaskTask. Provide the unified TaskTask fields in the request body; they are mapped to the provider's API. Returns the created TaskTask.

### Example Usage

<!-- UsageSnippet language="java" operationID="createTaskTask" method="post" path="/task/{connection_id}/task" example="task_task" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateTaskTaskRequest;
import to.unified.unified_java_sdk.models.operations.CreateTaskTaskResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateTaskTaskRequest req = CreateTaskTaskRequest.builder()
                .taskTask(TaskTask.builder()
                    .attachmentIds(List.of())
                    .createdAt(OffsetDateTime.parse("2019-01-31T08:34:55.626Z"))
                    .dueAt(OffsetDateTime.parse("2025-10-12T04:35:02.894Z"))
                    .hasChildren(true)
                    .id("977c0227-f8d9-421e-b192-221e4336d343")
                    .metadata(List.of())
                    .name("We need to connect the bluetooth IP sensor!")
                    .notes("Neque thymbra titulus absconditus peccatus crustulum tollo cometes. Vacuus eos cedo spero somnus utpote coadunatio denuncio adopto autus. Atrocitas vulnero concido rerum cura aveho torqueo tempore. Vomer tempore suscipit tutis clibanus valetudo vulnero pauper caput.")
                    .priority("MEDIUM")
                    .progress(33d)
                    .startAt(OffsetDateTime.parse("2025-09-13T18:43:33.932Z"))
                    .status(TaskTaskStatus.OPENED)
                    .storyPoints(0d)
                    .tags(List.of(
                        "absorbeo",
                        "correptius"))
                    .timeSpent(5359d)
                    .timeSpentUnit("SECONDS")
                    .type("antiquus")
                    .updatedAt(OffsetDateTime.parse("2022-04-21T21:42:27.795Z"))
                    .url("https://knotty-heroine.info")
                    .build())
                .connectionId("<id>")
                .build();

        CreateTaskTaskResponse res = sdk.task().createTaskTask()
                .request(req)
                .call();

        if (res.taskTask().isPresent()) {
            System.out.println(res.taskTask().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateTaskTaskRequest](../../models/operations/CreateTaskTaskRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateTaskTaskResponse](../../models/operations/CreateTaskTaskResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getGenaiTask

Retrieves a single GenaiTask by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

        GetGenaiTaskResponse res = sdk.task().getGenaiTask()
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

## getTaskChange

Retrieves a single TaskChange by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getTaskChange" method="get" path="/task/{connection_id}/change/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTaskChangeRequest;
import to.unified.unified_java_sdk.models.operations.GetTaskChangeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTaskChangeRequest req = GetTaskChangeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTaskChangeResponse res = sdk.task().getTaskChange()
                .request(req)
                .call();

        if (res.taskChange().isPresent()) {
            System.out.println(res.taskChange().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetTaskChangeRequest](../../models/operations/GetTaskChangeRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetTaskChangeResponse](../../models/operations/GetTaskChangeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTaskComment

Retrieves a single TaskComment by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getTaskComment" method="get" path="/task/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTaskCommentRequest;
import to.unified.unified_java_sdk.models.operations.GetTaskCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTaskCommentRequest req = GetTaskCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTaskCommentResponse res = sdk.task().getTaskComment()
                .request(req)
                .call();

        if (res.taskComment().isPresent()) {
            System.out.println(res.taskComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetTaskCommentRequest](../../models/operations/GetTaskCommentRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetTaskCommentResponse](../../models/operations/GetTaskCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTaskProject

Retrieves a single TaskProject by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getTaskProject" method="get" path="/task/{connection_id}/project/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTaskProjectRequest;
import to.unified.unified_java_sdk.models.operations.GetTaskProjectResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTaskProjectRequest req = GetTaskProjectRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTaskProjectResponse res = sdk.task().getTaskProject()
                .request(req)
                .call();

        if (res.taskProject().isPresent()) {
            System.out.println(res.taskProject().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetTaskProjectRequest](../../models/operations/GetTaskProjectRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetTaskProjectResponse](../../models/operations/GetTaskProjectResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTaskTask

Retrieves a single TaskTask by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getTaskTask" method="get" path="/task/{connection_id}/task/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTaskTaskRequest;
import to.unified.unified_java_sdk.models.operations.GetTaskTaskResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTaskTaskRequest req = GetTaskTaskRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTaskTaskResponse res = sdk.task().getTaskTask()
                .request(req)
                .call();

        if (res.taskTask().isPresent()) {
            System.out.println(res.taskTask().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetTaskTaskRequest](../../models/operations/GetTaskTaskRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetTaskTaskResponse](../../models/operations/GetTaskTaskResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listGenaiTasks

Returns a list of GenaiTasks. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

        ListGenaiTasksResponse res = sdk.task().listGenaiTasks()
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

## listTaskChanges

Returns a list of TaskChanges. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listTaskChanges" method="get" path="/task/{connection_id}/change" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTaskChangesRequest;
import to.unified.unified_java_sdk.models.operations.ListTaskChangesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTaskChangesRequest req = ListTaskChangesRequest.builder()
                .connectionId("<id>")
                .build();

        ListTaskChangesResponse res = sdk.task().listTaskChanges()
                .request(req)
                .call();

        if (res.taskChanges().isPresent()) {
            System.out.println(res.taskChanges().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListTaskChangesRequest](../../models/operations/ListTaskChangesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListTaskChangesResponse](../../models/operations/ListTaskChangesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTaskComments

Returns a list of TaskComments. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listTaskComments" method="get" path="/task/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTaskCommentsRequest;
import to.unified.unified_java_sdk.models.operations.ListTaskCommentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTaskCommentsRequest req = ListTaskCommentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListTaskCommentsResponse res = sdk.task().listTaskComments()
                .request(req)
                .call();

        if (res.taskComments().isPresent()) {
            System.out.println(res.taskComments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListTaskCommentsRequest](../../models/operations/ListTaskCommentsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListTaskCommentsResponse](../../models/operations/ListTaskCommentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTaskProjects

Returns a list of TaskProjects. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listTaskProjects" method="get" path="/task/{connection_id}/project" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTaskProjectsRequest;
import to.unified.unified_java_sdk.models.operations.ListTaskProjectsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTaskProjectsRequest req = ListTaskProjectsRequest.builder()
                .connectionId("<id>")
                .build();

        ListTaskProjectsResponse res = sdk.task().listTaskProjects()
                .request(req)
                .call();

        if (res.taskProjects().isPresent()) {
            System.out.println(res.taskProjects().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListTaskProjectsRequest](../../models/operations/ListTaskProjectsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListTaskProjectsResponse](../../models/operations/ListTaskProjectsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTaskTasks

Returns a list of TaskTasks. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listTaskTasks" method="get" path="/task/{connection_id}/task" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTaskTasksRequest;
import to.unified.unified_java_sdk.models.operations.ListTaskTasksResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTaskTasksRequest req = ListTaskTasksRequest.builder()
                .connectionId("<id>")
                .build();

        ListTaskTasksResponse res = sdk.task().listTaskTasks()
                .request(req)
                .call();

        if (res.taskTasks().isPresent()) {
            System.out.println(res.taskTasks().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListTaskTasksRequest](../../models/operations/ListTaskTasksRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListTaskTasksResponse](../../models/operations/ListTaskTasksResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchGenaiTask

Updates the GenaiTask identified by `id`. Provide the unified GenaiTask fields to change in the request body.

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
                    .completedAt(OffsetDateTime.parse("2025-10-30T21:40:50.501Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-25T20:19:33.247Z"))
                    .filesChanged(19d)
                    .id("8693e581-192b-40f0-a666-99f21b1f49ae")
                    .instructions("Angustus cubo cupio abundans admoveo sumptus.")
                    .linesAdded(244d)
                    .linesDeleted(118d)
                    .messages(List.of(
                        GenaiContent.builder()
                            .content("Amet contigo tristis deripio auxilium cur aeternus cogito.")
                            .images(List.of())
                            .role(Role.ASSISTANT)
                            .build()))
                    .name("connect online monitor")
                    .pullrequestUrl("https://github.com/felicity.rowe61/eek-save/pull/383")
                    .repoUrl("https://github.com/felicity.rowe61/eek-save")
                    .sourceBranchIdentifier("main")
                    .startedAt(OffsetDateTime.parse("2024-06-11T21:00:49.322Z"))
                    .status(GenaiTaskStatus.BLOCKED)
                    .summary("Tenus via tamisium denego teres adsidue cura crur. Coma defungo magnam delicate confero amaritudo varius.")
                    .targetBranchIdentifier("agent/eek-save")
                    .tokensUsed(2165d)
                    .updatedAt(OffsetDateTime.parse("2023-03-12T08:06:14.624Z"))
                    .webUrl("https://monstrous-honesty.net")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchGenaiTaskResponse res = sdk.task().patchGenaiTask()
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

## patchTaskComment

Updates the TaskComment identified by `id`. Provide the unified TaskComment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTaskComment" method="patch" path="/task/{connection_id}/comment/{id}" example="task_comment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchTaskCommentRequest;
import to.unified.unified_java_sdk.models.operations.PatchTaskCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TaskComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchTaskCommentRequest req = PatchTaskCommentRequest.builder()
                .taskComment(TaskComment.builder()
                    .createdAt(OffsetDateTime.parse("2019-10-12T20:33:37.879Z"))
                    .hasChildren(false)
                    .id("8ae855ef-20ca-49fd-910b-91cb2ca55783")
                    .metadata(List.of())
                    .text("Tabernus circumvenio demens placeat.")
                    .updatedAt(OffsetDateTime.parse("2021-10-13T10:40:50.751Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTaskCommentResponse res = sdk.task().patchTaskComment()
                .request(req)
                .call();

        if (res.taskComment().isPresent()) {
            System.out.println(res.taskComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchTaskCommentRequest](../../models/operations/PatchTaskCommentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchTaskCommentResponse](../../models/operations/PatchTaskCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchTaskProject

Updates the TaskProject identified by `id`. Provide the unified TaskProject fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTaskProject" method="patch" path="/task/{connection_id}/project/{id}" example="task_project" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchTaskProjectRequest;
import to.unified.unified_java_sdk.models.operations.PatchTaskProjectResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchTaskProjectRequest req = PatchTaskProjectRequest.builder()
                .taskProject(TaskProject.builder()
                    .createdAt(OffsetDateTime.parse("2023-06-23T16:39:40.446Z"))
                    .description("Curiositas.")
                    .hasChildren(false)
                    .hasTasks(false)
                    .id("8c97dcc8-2f17-451c-9c7d-1ac3eb27bf31")
                    .metadata(List.of(
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("4d47479f-2f26-4743-b9b9-5dc8df74284f")
                            .namespace("custom")
                            .slug("vox")
                            .value(TaskMetadataValue.of("decens"))
                            .build(),
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("bb47fa83-41dc-41cc-9df9-cec949a56124")
                            .namespace("custom")
                            .slug("uterque")
                            .value(TaskMetadataValue.of("benevolentia"))
                            .build()))
                    .name("Baby")
                    .updatedAt(OffsetDateTime.parse("2023-10-14T20:32:41.198Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTaskProjectResponse res = sdk.task().patchTaskProject()
                .request(req)
                .call();

        if (res.taskProject().isPresent()) {
            System.out.println(res.taskProject().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchTaskProjectRequest](../../models/operations/PatchTaskProjectRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchTaskProjectResponse](../../models/operations/PatchTaskProjectResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchTaskTask

Updates the TaskTask identified by `id`. Provide the unified TaskTask fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTaskTask" method="patch" path="/task/{connection_id}/task/{id}" example="task_task" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchTaskTaskRequest;
import to.unified.unified_java_sdk.models.operations.PatchTaskTaskResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchTaskTaskRequest req = PatchTaskTaskRequest.builder()
                .taskTask(TaskTask.builder()
                    .attachmentIds(List.of())
                    .createdAt(OffsetDateTime.parse("2019-01-31T08:34:55.626Z"))
                    .dueAt(OffsetDateTime.parse("2025-10-12T04:35:02.908Z"))
                    .hasChildren(true)
                    .id("1679fa8b-203a-495b-8aa5-9d181ba97910")
                    .metadata(List.of())
                    .name("We need to connect the bluetooth IP sensor!")
                    .notes("Neque thymbra titulus absconditus peccatus crustulum tollo cometes. Vacuus eos cedo spero somnus utpote coadunatio denuncio adopto autus. Atrocitas vulnero concido rerum cura aveho torqueo tempore. Vomer tempore suscipit tutis clibanus valetudo vulnero pauper caput.")
                    .priority("MEDIUM")
                    .progress(33d)
                    .startAt(OffsetDateTime.parse("2025-09-13T18:43:33.946Z"))
                    .status(TaskTaskStatus.OPENED)
                    .storyPoints(0d)
                    .tags(List.of(
                        "absorbeo",
                        "correptius"))
                    .timeSpent(5359d)
                    .timeSpentUnit("SECONDS")
                    .type("antiquus")
                    .updatedAt(OffsetDateTime.parse("2022-04-21T21:42:27.803Z"))
                    .url("https://knotty-heroine.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTaskTaskResponse res = sdk.task().patchTaskTask()
                .request(req)
                .call();

        if (res.taskTask().isPresent()) {
            System.out.println(res.taskTask().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchTaskTaskRequest](../../models/operations/PatchTaskTaskRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchTaskTaskResponse](../../models/operations/PatchTaskTaskResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeGenaiTask

Deletes the GenaiTask identified by `id`.

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

        RemoveGenaiTaskResponse res = sdk.task().removeGenaiTask()
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

## removeTaskComment

Deletes the TaskComment identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeTaskComment" method="delete" path="/task/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveTaskCommentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveTaskCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveTaskCommentRequest req = RemoveTaskCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTaskCommentResponse res = sdk.task().removeTaskComment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveTaskCommentRequest](../../models/operations/RemoveTaskCommentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveTaskCommentResponse](../../models/operations/RemoveTaskCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeTaskProject

Deletes the TaskProject identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeTaskProject" method="delete" path="/task/{connection_id}/project/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveTaskProjectRequest;
import to.unified.unified_java_sdk.models.operations.RemoveTaskProjectResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveTaskProjectRequest req = RemoveTaskProjectRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTaskProjectResponse res = sdk.task().removeTaskProject()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveTaskProjectRequest](../../models/operations/RemoveTaskProjectRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveTaskProjectResponse](../../models/operations/RemoveTaskProjectResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeTaskTask

Deletes the TaskTask identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeTaskTask" method="delete" path="/task/{connection_id}/task/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveTaskTaskRequest;
import to.unified.unified_java_sdk.models.operations.RemoveTaskTaskResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveTaskTaskRequest req = RemoveTaskTaskRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTaskTaskResponse res = sdk.task().removeTaskTask()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveTaskTaskRequest](../../models/operations/RemoveTaskTaskRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveTaskTaskResponse](../../models/operations/RemoveTaskTaskResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateGenaiTask

Updates the GenaiTask identified by `id`. Provide the unified GenaiTask fields to change in the request body.

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
                    .completedAt(OffsetDateTime.parse("2025-10-30T21:40:50.501Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-25T20:19:33.247Z"))
                    .filesChanged(19d)
                    .id("8693e581-192b-40f0-a666-99f21b1f49ae")
                    .instructions("Angustus cubo cupio abundans admoveo sumptus.")
                    .linesAdded(244d)
                    .linesDeleted(118d)
                    .messages(List.of(
                        GenaiContent.builder()
                            .content("Amet contigo tristis deripio auxilium cur aeternus cogito.")
                            .images(List.of())
                            .role(Role.ASSISTANT)
                            .build()))
                    .name("connect online monitor")
                    .pullrequestUrl("https://github.com/felicity.rowe61/eek-save/pull/383")
                    .repoUrl("https://github.com/felicity.rowe61/eek-save")
                    .sourceBranchIdentifier("main")
                    .startedAt(OffsetDateTime.parse("2024-06-11T21:00:49.322Z"))
                    .status(GenaiTaskStatus.BLOCKED)
                    .summary("Tenus via tamisium denego teres adsidue cura crur. Coma defungo magnam delicate confero amaritudo varius.")
                    .targetBranchIdentifier("agent/eek-save")
                    .tokensUsed(2165d)
                    .updatedAt(OffsetDateTime.parse("2023-03-12T08:06:14.624Z"))
                    .webUrl("https://monstrous-honesty.net")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateGenaiTaskResponse res = sdk.task().updateGenaiTask()
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

## updateTaskComment

Updates the TaskComment identified by `id`. Provide the unified TaskComment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTaskComment" method="put" path="/task/{connection_id}/comment/{id}" example="task_comment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateTaskCommentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateTaskCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TaskComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateTaskCommentRequest req = UpdateTaskCommentRequest.builder()
                .taskComment(TaskComment.builder()
                    .createdAt(OffsetDateTime.parse("2019-10-12T20:33:37.879Z"))
                    .hasChildren(false)
                    .id("8ae855ef-20ca-49fd-910b-91cb2ca55783")
                    .metadata(List.of())
                    .text("Tabernus circumvenio demens placeat.")
                    .updatedAt(OffsetDateTime.parse("2021-10-13T10:40:50.751Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTaskCommentResponse res = sdk.task().updateTaskComment()
                .request(req)
                .call();

        if (res.taskComment().isPresent()) {
            System.out.println(res.taskComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateTaskCommentRequest](../../models/operations/UpdateTaskCommentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateTaskCommentResponse](../../models/operations/UpdateTaskCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTaskProject

Updates the TaskProject identified by `id`. Provide the unified TaskProject fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTaskProject" method="put" path="/task/{connection_id}/project/{id}" example="task_project" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateTaskProjectRequest;
import to.unified.unified_java_sdk.models.operations.UpdateTaskProjectResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateTaskProjectRequest req = UpdateTaskProjectRequest.builder()
                .taskProject(TaskProject.builder()
                    .createdAt(OffsetDateTime.parse("2023-06-23T16:39:40.446Z"))
                    .description("Curiositas.")
                    .hasChildren(false)
                    .hasTasks(false)
                    .id("8c97dcc8-2f17-451c-9c7d-1ac3eb27bf31")
                    .metadata(List.of(
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("4d47479f-2f26-4743-b9b9-5dc8df74284f")
                            .namespace("custom")
                            .slug("vox")
                            .value(TaskMetadataValue.of("decens"))
                            .build(),
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("bb47fa83-41dc-41cc-9df9-cec949a56124")
                            .namespace("custom")
                            .slug("uterque")
                            .value(TaskMetadataValue.of("benevolentia"))
                            .build()))
                    .name("Baby")
                    .updatedAt(OffsetDateTime.parse("2023-10-14T20:32:41.198Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTaskProjectResponse res = sdk.task().updateTaskProject()
                .request(req)
                .call();

        if (res.taskProject().isPresent()) {
            System.out.println(res.taskProject().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateTaskProjectRequest](../../models/operations/UpdateTaskProjectRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateTaskProjectResponse](../../models/operations/UpdateTaskProjectResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTaskTask

Updates the TaskTask identified by `id`. Provide the unified TaskTask fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTaskTask" method="put" path="/task/{connection_id}/task/{id}" example="task_task" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateTaskTaskRequest;
import to.unified.unified_java_sdk.models.operations.UpdateTaskTaskResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateTaskTaskRequest req = UpdateTaskTaskRequest.builder()
                .taskTask(TaskTask.builder()
                    .attachmentIds(List.of())
                    .createdAt(OffsetDateTime.parse("2019-01-31T08:34:55.626Z"))
                    .dueAt(OffsetDateTime.parse("2025-10-12T04:35:02.908Z"))
                    .hasChildren(true)
                    .id("1679fa8b-203a-495b-8aa5-9d181ba97910")
                    .metadata(List.of())
                    .name("We need to connect the bluetooth IP sensor!")
                    .notes("Neque thymbra titulus absconditus peccatus crustulum tollo cometes. Vacuus eos cedo spero somnus utpote coadunatio denuncio adopto autus. Atrocitas vulnero concido rerum cura aveho torqueo tempore. Vomer tempore suscipit tutis clibanus valetudo vulnero pauper caput.")
                    .priority("MEDIUM")
                    .progress(33d)
                    .startAt(OffsetDateTime.parse("2025-09-13T18:43:33.946Z"))
                    .status(TaskTaskStatus.OPENED)
                    .storyPoints(0d)
                    .tags(List.of(
                        "absorbeo",
                        "correptius"))
                    .timeSpent(5359d)
                    .timeSpentUnit("SECONDS")
                    .type("antiquus")
                    .updatedAt(OffsetDateTime.parse("2022-04-21T21:42:27.803Z"))
                    .url("https://knotty-heroine.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTaskTaskResponse res = sdk.task().updateTaskTask()
                .request(req)
                .call();

        if (res.taskTask().isPresent()) {
            System.out.println(res.taskTask().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateTaskTaskRequest](../../models/operations/UpdateTaskTaskRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateTaskTaskResponse](../../models/operations/UpdateTaskTaskResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |