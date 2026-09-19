# Task

## Overview

### Available Operations

* [createTaskComment](#createtaskcomment) - Create a comment
* [createTaskProject](#createtaskproject) - Create a project
* [createTaskTask](#createtasktask) - Create a task
* [getTaskChange](#gettaskchange) - Retrieve a change
* [getTaskComment](#gettaskcomment) - Retrieve a comment
* [getTaskProject](#gettaskproject) - Retrieve a project
* [getTaskTask](#gettasktask) - Retrieve a task
* [listTaskChanges](#listtaskchanges) - List all changes
* [listTaskComments](#listtaskcomments) - List all comments
* [listTaskProjects](#listtaskprojects) - List all projects
* [listTaskTasks](#listtasktasks) - List all tasks
* [patchTaskComment](#patchtaskcomment) - Update a comment
* [patchTaskProject](#patchtaskproject) - Update a project
* [patchTaskTask](#patchtasktask) - Update a task
* [removeTaskComment](#removetaskcomment) - Remove a comment
* [removeTaskProject](#removetaskproject) - Remove a project
* [removeTaskTask](#removetasktask) - Remove a task
* [updateTaskComment](#updatetaskcomment) - Update a comment
* [updateTaskProject](#updatetaskproject) - Update a project
* [updateTaskTask](#updatetasktask) - Update a task

## createTaskComment

Create a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="createTaskComment" method="post" path="/task/{connection_id}/comment" example="task_comment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .id("11617c92-8f45-4d9a-b0e6-714f940f8baf")
                    .text("Colo ulciscor sublime tabernus.")
                    .updatedAt(OffsetDateTime.parse("2021-09-24T07:54:15.760Z"))
                    .userName("Santina Abbott")
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
                    .id("88eb41b0-cedf-40b9-87af-8644dc17a321")
                    .metadata(List.of(
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("3abf000c-490a-49bf-8625-9ce68b3fef88")
                            .namespace("custom")
                            .slug("decens")
                            .value(TaskMetadataValue.of("uterque"))
                            .build(),
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("8d8c2113-0a80-48c8-8fc1-11d060ab969e")
                            .namespace("custom")
                            .slug("benevolentia")
                            .value(TaskMetadataValue.of("pariatur"))
                            .build()))
                    .name("Garden")
                    .updatedAt(OffsetDateTime.parse("2023-10-08T17:01:35.023Z"))
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
                    .completedAt(OffsetDateTime.parse("2022-03-24T21:39:19.573Z"))
                    .createdAt(OffsetDateTime.parse("2019-01-31T08:34:55.626Z"))
                    .dueAt(OffsetDateTime.parse("2026-04-24T07:12:59.235Z"))
                    .endAt(OffsetDateTime.parse("2022-10-14T04:54:17.890Z"))
                    .hasChildren(true)
                    .id("6db0d51a-200b-48f7-a707-4a430cbe1195")
                    .metadata(List.of())
                    .name("Direct Markets Architect")
                    .notes("Calcar vilicus audacia ut cultura argentum ventosus. Talis neque thymbra titulus absconditus peccatus crustulum tollo. Volva vacuus eos cedo spero. Utpote coadunatio denuncio adopto autus sono atrocitas vulnero.")
                    .priority("LOW")
                    .progress(2d)
                    .startAt(OffsetDateTime.parse("2022-01-19T20:38:52.270Z"))
                    .status(TaskTaskStatus.IN_PROGRESS)
                    .storyPoints(0d)
                    .tags(List.of(
                        "concido",
                        "rerum"))
                    .timeSpent(957d)
                    .timeSpentUnit("SECONDS")
                    .type("tubineus")
                    .updatedAt(OffsetDateTime.parse("2019-07-13T12:12:40.880Z"))
                    .url("https://dismal-silk.net/")
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

## patchTaskComment

Update a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTaskComment" method="patch" path="/task/{connection_id}/comment/{id}" example="task_comment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .id("c76233d8-d5df-4cb0-aa19-a748349d0dd5")
                    .text("Colo ulciscor sublime tabernus.")
                    .updatedAt(OffsetDateTime.parse("2021-09-24T07:54:15.762Z"))
                    .userName("Santina Abbott")
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
                    .id("7853bca1-d21a-4388-9d35-22d5e7c8a9a8")
                    .metadata(List.of(
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("9101571a-92aa-427e-a67f-2b155bc3ef31")
                            .namespace("custom")
                            .slug("decens")
                            .value(TaskMetadataValue.of("uterque"))
                            .build(),
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("ebaaeee7-76b1-484f-9348-2a6fb30d0652")
                            .namespace("custom")
                            .slug("benevolentia")
                            .value(TaskMetadataValue.of("pariatur"))
                            .build()))
                    .name("Garden")
                    .updatedAt(OffsetDateTime.parse("2023-10-08T17:01:35.025Z"))
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
                    .completedAt(OffsetDateTime.parse("2022-03-24T21:39:19.583Z"))
                    .createdAt(OffsetDateTime.parse("2019-01-31T08:34:55.626Z"))
                    .dueAt(OffsetDateTime.parse("2026-04-24T07:12:59.258Z"))
                    .endAt(OffsetDateTime.parse("2022-10-14T04:54:17.902Z"))
                    .hasChildren(true)
                    .id("487957df-1566-4c39-a2b2-2d48d87393b1")
                    .metadata(List.of())
                    .name("Direct Markets Architect")
                    .notes("Calcar vilicus audacia ut cultura argentum ventosus. Talis neque thymbra titulus absconditus peccatus crustulum tollo. Volva vacuus eos cedo spero. Utpote coadunatio denuncio adopto autus sono atrocitas vulnero.")
                    .priority("LOW")
                    .progress(2d)
                    .startAt(OffsetDateTime.parse("2022-01-19T20:38:52.279Z"))
                    .status(TaskTaskStatus.IN_PROGRESS)
                    .storyPoints(0d)
                    .tags(List.of(
                        "concido",
                        "rerum"))
                    .timeSpent(957d)
                    .timeSpentUnit("SECONDS")
                    .type("tubineus")
                    .updatedAt(OffsetDateTime.parse("2019-07-13T12:12:40.882Z"))
                    .url("https://dismal-silk.net/")
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

## updateTaskComment

Update a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTaskComment" method="put" path="/task/{connection_id}/comment/{id}" example="task_comment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    .id("c76233d8-d5df-4cb0-aa19-a748349d0dd5")
                    .text("Colo ulciscor sublime tabernus.")
                    .updatedAt(OffsetDateTime.parse("2021-09-24T07:54:15.762Z"))
                    .userName("Santina Abbott")
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
                    .id("7853bca1-d21a-4388-9d35-22d5e7c8a9a8")
                    .metadata(List.of(
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("9101571a-92aa-427e-a67f-2b155bc3ef31")
                            .namespace("custom")
                            .slug("decens")
                            .value(TaskMetadataValue.of("uterque"))
                            .build(),
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("ebaaeee7-76b1-484f-9348-2a6fb30d0652")
                            .namespace("custom")
                            .slug("benevolentia")
                            .value(TaskMetadataValue.of("pariatur"))
                            .build()))
                    .name("Garden")
                    .updatedAt(OffsetDateTime.parse("2023-10-08T17:01:35.025Z"))
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
                    .completedAt(OffsetDateTime.parse("2022-03-24T21:39:19.583Z"))
                    .createdAt(OffsetDateTime.parse("2019-01-31T08:34:55.626Z"))
                    .dueAt(OffsetDateTime.parse("2026-04-24T07:12:59.258Z"))
                    .endAt(OffsetDateTime.parse("2022-10-14T04:54:17.902Z"))
                    .hasChildren(true)
                    .id("487957df-1566-4c39-a2b2-2d48d87393b1")
                    .metadata(List.of())
                    .name("Direct Markets Architect")
                    .notes("Calcar vilicus audacia ut cultura argentum ventosus. Talis neque thymbra titulus absconditus peccatus crustulum tollo. Volva vacuus eos cedo spero. Utpote coadunatio denuncio adopto autus sono atrocitas vulnero.")
                    .priority("LOW")
                    .progress(2d)
                    .startAt(OffsetDateTime.parse("2022-01-19T20:38:52.279Z"))
                    .status(TaskTaskStatus.IN_PROGRESS)
                    .storyPoints(0d)
                    .tags(List.of(
                        "concido",
                        "rerum"))
                    .timeSpent(957d)
                    .timeSpentUnit("SECONDS")
                    .type("tubineus")
                    .updatedAt(OffsetDateTime.parse("2019-07-13T12:12:40.882Z"))
                    .url("https://dismal-silk.net/")
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