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
                    .completedAt(OffsetDateTime.parse("2025-09-30T06:45:33.960Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-25T20:19:33.247Z"))
                    .filesChanged(19d)
                    .id("6599ee62-f68d-4af4-9401-9a20fa767411")
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
                    .startedAt(OffsetDateTime.parse("2024-05-20T17:11:38.714Z"))
                    .status(GenaiTaskStatus.BLOCKED)
                    .summary("Cur aeternus cogito vesper.")
                    .targetBranchIdentifier("agent/joshingly-ignorance")
                    .tokensUsed(2165d)
                    .updatedAt(OffsetDateTime.parse("2023-02-25T19:55:26.296Z"))
                    .webUrl("https://inexperienced-adrenalin.biz/")
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

Create a comment

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
                    .hasChildren(true)
                    .id("ecc84e47-8776-4c9e-a58e-6bfaa0a2250b")
                    .metadata(List.of())
                    .text("Colo ulciscor sublime tabernus.")
                    .updatedAt(OffsetDateTime.parse("2021-10-02T23:49:51.413Z"))
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

Create a project

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
                    .description("Valetudo aggredior accommodo curiositas vox.")
                    .hasChildren(false)
                    .hasTasks(false)
                    .id("dbd65bef-f72b-43ca-8f34-e4d6093e4d78")
                    .metadata(List.of(
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("327cf0c8-3a7d-4c8c-8712-ee2f6290f006")
                            .namespace("custom")
                            .slug("decens")
                            .value(TaskMetadataValue.of("uterque"))
                            .build(),
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("f6b10d61-197b-457e-bb81-5407f859f664")
                            .namespace("custom")
                            .slug("benevolentia")
                            .value(TaskMetadataValue.of("pariatur"))
                            .build()))
                    .name("Garden")
                    .updatedAt(OffsetDateTime.parse("2023-10-11T11:53:04.761Z"))
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

Create a task

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
                    .dueAt(OffsetDateTime.parse("2025-09-10T17:33:46.629Z"))
                    .hasChildren(true)
                    .id("b50f5468-93fe-4660-9d3a-6e4f27c22fde")
                    .metadata(List.of())
                    .name("I'll compress the optical IB interface, that should capacitor the JBOD system!")
                    .notes("Argentum ventosus rem talis neque thymbra. Absconditus peccatus crustulum tollo cometes volva vacuus eos cedo. Somnus utpote coadunatio denuncio adopto autus sono atrocitas. Concido rerum cura aveho torqueo tempore tubineus vomer tempore suscipit. Clibanus valetudo vulnero pauper caput absorbeo correptius vir deduco.")
                    .priority("MEDIUM")
                    .progress(33d)
                    .startAt(OffsetDateTime.parse("2025-08-13T07:42:17.667Z"))
                    .status(TaskTaskStatus.OPENED)
                    .storyPoints(0d)
                    .tags(List.of(
                        "curis",
                        "crinis"))
                    .timeSpent(5359d)
                    .timeSpentUnit("SECONDS")
                    .type("magni")
                    .updatedAt(OffsetDateTime.parse("2022-04-06T14:14:34.369Z"))
                    .url("https://elementary-utilization.net/")
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

Retrieve a change

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

Retrieve a comment

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

Retrieve a project

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

Retrieve a task

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

List all changes

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

List all comments

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

List all projects

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

List all tasks

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
                    .completedAt(OffsetDateTime.parse("2025-09-30T06:45:33.974Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-25T20:19:33.247Z"))
                    .filesChanged(19d)
                    .id("cebad502-b835-4187-9429-67df7a8dfee7")
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
                    .startedAt(OffsetDateTime.parse("2024-05-20T17:11:38.722Z"))
                    .status(GenaiTaskStatus.BLOCKED)
                    .summary("Cur aeternus cogito vesper.")
                    .targetBranchIdentifier("agent/joshingly-ignorance")
                    .tokensUsed(2165d)
                    .updatedAt(OffsetDateTime.parse("2023-02-25T19:55:26.303Z"))
                    .webUrl("https://inexperienced-adrenalin.biz/")
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

Update a comment

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
                    .hasChildren(true)
                    .id("1a5cbd95-43ee-4bf6-bbe1-99303f86baa8")
                    .metadata(List.of())
                    .text("Colo ulciscor sublime tabernus.")
                    .updatedAt(OffsetDateTime.parse("2021-10-02T23:49:51.417Z"))
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

Update a project

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
                    .description("Valetudo aggredior accommodo curiositas vox.")
                    .hasChildren(false)
                    .hasTasks(false)
                    .id("3aa80d34-516c-48fc-954f-d3df544cc6e8")
                    .metadata(List.of(
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("df846ced-db32-4d22-91bd-08b852afb3a3")
                            .namespace("custom")
                            .slug("decens")
                            .value(TaskMetadataValue.of("uterque"))
                            .build(),
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("850ed326-d08d-46e8-9e1f-8875a1a1c7b6")
                            .namespace("custom")
                            .slug("benevolentia")
                            .value(TaskMetadataValue.of("pariatur"))
                            .build()))
                    .name("Garden")
                    .updatedAt(OffsetDateTime.parse("2023-10-11T11:53:04.762Z"))
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

Update a task

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
                    .dueAt(OffsetDateTime.parse("2025-09-10T17:33:46.644Z"))
                    .hasChildren(true)
                    .id("538e9231-67e0-4089-a8f5-39bb35dac520")
                    .metadata(List.of())
                    .name("I'll compress the optical IB interface, that should capacitor the JBOD system!")
                    .notes("Argentum ventosus rem talis neque thymbra. Absconditus peccatus crustulum tollo cometes volva vacuus eos cedo. Somnus utpote coadunatio denuncio adopto autus sono atrocitas. Concido rerum cura aveho torqueo tempore tubineus vomer tempore suscipit. Clibanus valetudo vulnero pauper caput absorbeo correptius vir deduco.")
                    .priority("MEDIUM")
                    .progress(33d)
                    .startAt(OffsetDateTime.parse("2025-08-13T07:42:17.682Z"))
                    .status(TaskTaskStatus.OPENED)
                    .storyPoints(0d)
                    .tags(List.of(
                        "curis",
                        "crinis"))
                    .timeSpent(5359d)
                    .timeSpentUnit("SECONDS")
                    .type("magni")
                    .updatedAt(OffsetDateTime.parse("2022-04-06T14:14:34.376Z"))
                    .url("https://elementary-utilization.net/")
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

Remove a comment

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

Remove a project

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

Remove a task

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
                    .completedAt(OffsetDateTime.parse("2025-09-30T06:45:33.974Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-25T20:19:33.247Z"))
                    .filesChanged(19d)
                    .id("cebad502-b835-4187-9429-67df7a8dfee7")
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
                    .startedAt(OffsetDateTime.parse("2024-05-20T17:11:38.722Z"))
                    .status(GenaiTaskStatus.BLOCKED)
                    .summary("Cur aeternus cogito vesper.")
                    .targetBranchIdentifier("agent/joshingly-ignorance")
                    .tokensUsed(2165d)
                    .updatedAt(OffsetDateTime.parse("2023-02-25T19:55:26.303Z"))
                    .webUrl("https://inexperienced-adrenalin.biz/")
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

Update a comment

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
                    .hasChildren(true)
                    .id("1a5cbd95-43ee-4bf6-bbe1-99303f86baa8")
                    .metadata(List.of())
                    .text("Colo ulciscor sublime tabernus.")
                    .updatedAt(OffsetDateTime.parse("2021-10-02T23:49:51.417Z"))
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

Update a project

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
                    .description("Valetudo aggredior accommodo curiositas vox.")
                    .hasChildren(false)
                    .hasTasks(false)
                    .id("3aa80d34-516c-48fc-954f-d3df544cc6e8")
                    .metadata(List.of(
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("df846ced-db32-4d22-91bd-08b852afb3a3")
                            .namespace("custom")
                            .slug("decens")
                            .value(TaskMetadataValue.of("uterque"))
                            .build(),
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("850ed326-d08d-46e8-9e1f-8875a1a1c7b6")
                            .namespace("custom")
                            .slug("benevolentia")
                            .value(TaskMetadataValue.of("pariatur"))
                            .build()))
                    .name("Garden")
                    .updatedAt(OffsetDateTime.parse("2023-10-11T11:53:04.762Z"))
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

Update a task

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
                    .dueAt(OffsetDateTime.parse("2025-09-10T17:33:46.644Z"))
                    .hasChildren(true)
                    .id("538e9231-67e0-4089-a8f5-39bb35dac520")
                    .metadata(List.of())
                    .name("I'll compress the optical IB interface, that should capacitor the JBOD system!")
                    .notes("Argentum ventosus rem talis neque thymbra. Absconditus peccatus crustulum tollo cometes volva vacuus eos cedo. Somnus utpote coadunatio denuncio adopto autus sono atrocitas. Concido rerum cura aveho torqueo tempore tubineus vomer tempore suscipit. Clibanus valetudo vulnero pauper caput absorbeo correptius vir deduco.")
                    .priority("MEDIUM")
                    .progress(33d)
                    .startAt(OffsetDateTime.parse("2025-08-13T07:42:17.682Z"))
                    .status(TaskTaskStatus.OPENED)
                    .storyPoints(0d)
                    .tags(List.of(
                        "curis",
                        "crinis"))
                    .timeSpent(5359d)
                    .timeSpentUnit("SECONDS")
                    .type("magni")
                    .updatedAt(OffsetDateTime.parse("2022-04-06T14:14:34.376Z"))
                    .url("https://elementary-utilization.net/")
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