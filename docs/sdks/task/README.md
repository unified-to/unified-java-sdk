# Task

## Overview

### Available Operations

* [createTaskComment2](#createtaskcomment2) - Create a comment
* [createTaskProject2](#createtaskproject2) - Create a project
* [createTaskTask2](#createtasktask2) - Create a task
* [getTaskChange2](#gettaskchange2) - Retrieve a change
* [getTaskComment2](#gettaskcomment2) - Retrieve a comment
* [getTaskProject2](#gettaskproject2) - Retrieve a project
* [getTaskTask2](#gettasktask2) - Retrieve a task
* [listTaskChanges2](#listtaskchanges2) - List all changes
* [listTaskComments2](#listtaskcomments2) - List all comments
* [listTaskProjects2](#listtaskprojects2) - List all projects
* [listTaskTasks2](#listtasktasks2) - List all tasks
* [patchTaskComment2](#patchtaskcomment2) - Update a comment
* [patchTaskProject2](#patchtaskproject2) - Update a project
* [patchTaskTask2](#patchtasktask2) - Update a task
* [removeTaskComment2](#removetaskcomment2) - Remove a comment
* [removeTaskProject2](#removetaskproject2) - Remove a project
* [removeTaskTask2](#removetasktask2) - Remove a task
* [updateTaskComment2](#updatetaskcomment2) - Update a comment
* [updateTaskProject2](#updatetaskproject2) - Update a project
* [updateTaskTask2](#updatetasktask2) - Update a task

## createTaskComment2

Create a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="createTaskComment2" method="post" path="/task/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateTaskComment2Request;
import to.unified.unified_java_sdk.models.operations.CreateTaskComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TaskComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateTaskComment2Request req = CreateTaskComment2Request.builder()
                .taskComment(TaskComment.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateTaskComment2Response res = sdk.task().createTaskComment2()
                .request(req)
                .call();

        if (res.taskComment().isPresent()) {
            System.out.println(res.taskComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateTaskComment2Request](../../models/operations/CreateTaskComment2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateTaskComment2Response](../../models/operations/CreateTaskComment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createTaskProject2

Create a project

### Example Usage

<!-- UsageSnippet language="java" operationID="createTaskProject2" method="post" path="/task/{connection_id}/project" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateTaskProject2Request;
import to.unified.unified_java_sdk.models.operations.CreateTaskProject2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TaskProject;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateTaskProject2Request req = CreateTaskProject2Request.builder()
                .taskProject(TaskProject.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateTaskProject2Response res = sdk.task().createTaskProject2()
                .request(req)
                .call();

        if (res.taskProject().isPresent()) {
            System.out.println(res.taskProject().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateTaskProject2Request](../../models/operations/CreateTaskProject2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateTaskProject2Response](../../models/operations/CreateTaskProject2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createTaskTask2

Create a task

### Example Usage

<!-- UsageSnippet language="java" operationID="createTaskTask2" method="post" path="/task/{connection_id}/task" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateTaskTask2Request;
import to.unified.unified_java_sdk.models.operations.CreateTaskTask2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TaskTask;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateTaskTask2Request req = CreateTaskTask2Request.builder()
                .taskTask(TaskTask.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateTaskTask2Response res = sdk.task().createTaskTask2()
                .request(req)
                .call();

        if (res.taskTask().isPresent()) {
            System.out.println(res.taskTask().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateTaskTask2Request](../../models/operations/CreateTaskTask2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateTaskTask2Response](../../models/operations/CreateTaskTask2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTaskChange2

Retrieve a change

### Example Usage

<!-- UsageSnippet language="java" operationID="getTaskChange2" method="get" path="/task/{connection_id}/change/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTaskChange2Request;
import to.unified.unified_java_sdk.models.operations.GetTaskChange2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTaskChange2Request req = GetTaskChange2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTaskChange2Response res = sdk.task().getTaskChange2()
                .request(req)
                .call();

        if (res.taskChange().isPresent()) {
            System.out.println(res.taskChange().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetTaskChange2Request](../../models/operations/GetTaskChange2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetTaskChange2Response](../../models/operations/GetTaskChange2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTaskComment2

Retrieve a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="getTaskComment2" method="get" path="/task/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTaskComment2Request;
import to.unified.unified_java_sdk.models.operations.GetTaskComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTaskComment2Request req = GetTaskComment2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTaskComment2Response res = sdk.task().getTaskComment2()
                .request(req)
                .call();

        if (res.taskComment().isPresent()) {
            System.out.println(res.taskComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetTaskComment2Request](../../models/operations/GetTaskComment2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetTaskComment2Response](../../models/operations/GetTaskComment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTaskProject2

Retrieve a project

### Example Usage

<!-- UsageSnippet language="java" operationID="getTaskProject2" method="get" path="/task/{connection_id}/project/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTaskProject2Request;
import to.unified.unified_java_sdk.models.operations.GetTaskProject2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTaskProject2Request req = GetTaskProject2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTaskProject2Response res = sdk.task().getTaskProject2()
                .request(req)
                .call();

        if (res.taskProject().isPresent()) {
            System.out.println(res.taskProject().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetTaskProject2Request](../../models/operations/GetTaskProject2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetTaskProject2Response](../../models/operations/GetTaskProject2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTaskTask2

Retrieve a task

### Example Usage

<!-- UsageSnippet language="java" operationID="getTaskTask2" method="get" path="/task/{connection_id}/task/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTaskTask2Request;
import to.unified.unified_java_sdk.models.operations.GetTaskTask2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTaskTask2Request req = GetTaskTask2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTaskTask2Response res = sdk.task().getTaskTask2()
                .request(req)
                .call();

        if (res.taskTask().isPresent()) {
            System.out.println(res.taskTask().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetTaskTask2Request](../../models/operations/GetTaskTask2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetTaskTask2Response](../../models/operations/GetTaskTask2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTaskChanges2

List all changes

### Example Usage

<!-- UsageSnippet language="java" operationID="listTaskChanges2" method="get" path="/task/{connection_id}/change" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTaskChanges2Request;
import to.unified.unified_java_sdk.models.operations.ListTaskChanges2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTaskChanges2Request req = ListTaskChanges2Request.builder()
                .connectionId("<id>")
                .build();

        ListTaskChanges2Response res = sdk.task().listTaskChanges2()
                .request(req)
                .call();

        if (res.taskChanges().isPresent()) {
            System.out.println(res.taskChanges().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListTaskChanges2Request](../../models/operations/ListTaskChanges2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListTaskChanges2Response](../../models/operations/ListTaskChanges2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTaskComments2

List all comments

### Example Usage

<!-- UsageSnippet language="java" operationID="listTaskComments2" method="get" path="/task/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTaskComments2Request;
import to.unified.unified_java_sdk.models.operations.ListTaskComments2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTaskComments2Request req = ListTaskComments2Request.builder()
                .connectionId("<id>")
                .build();

        ListTaskComments2Response res = sdk.task().listTaskComments2()
                .request(req)
                .call();

        if (res.taskComments().isPresent()) {
            System.out.println(res.taskComments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListTaskComments2Request](../../models/operations/ListTaskComments2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListTaskComments2Response](../../models/operations/ListTaskComments2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTaskProjects2

List all projects

### Example Usage

<!-- UsageSnippet language="java" operationID="listTaskProjects2" method="get" path="/task/{connection_id}/project" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTaskProjects2Request;
import to.unified.unified_java_sdk.models.operations.ListTaskProjects2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTaskProjects2Request req = ListTaskProjects2Request.builder()
                .connectionId("<id>")
                .build();

        ListTaskProjects2Response res = sdk.task().listTaskProjects2()
                .request(req)
                .call();

        if (res.taskProjects().isPresent()) {
            System.out.println(res.taskProjects().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListTaskProjects2Request](../../models/operations/ListTaskProjects2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListTaskProjects2Response](../../models/operations/ListTaskProjects2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTaskTasks2

List all tasks

### Example Usage

<!-- UsageSnippet language="java" operationID="listTaskTasks2" method="get" path="/task/{connection_id}/task" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTaskTasks2Request;
import to.unified.unified_java_sdk.models.operations.ListTaskTasks2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTaskTasks2Request req = ListTaskTasks2Request.builder()
                .connectionId("<id>")
                .build();

        ListTaskTasks2Response res = sdk.task().listTaskTasks2()
                .request(req)
                .call();

        if (res.taskTasks().isPresent()) {
            System.out.println(res.taskTasks().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListTaskTasks2Request](../../models/operations/ListTaskTasks2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListTaskTasks2Response](../../models/operations/ListTaskTasks2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchTaskComment2

Update a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTaskComment2" method="patch" path="/task/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchTaskComment2Request;
import to.unified.unified_java_sdk.models.operations.PatchTaskComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TaskComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchTaskComment2Request req = PatchTaskComment2Request.builder()
                .taskComment(TaskComment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTaskComment2Response res = sdk.task().patchTaskComment2()
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
| `request`                                                                       | [PatchTaskComment2Request](../../models/operations/PatchTaskComment2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchTaskComment2Response](../../models/operations/PatchTaskComment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchTaskProject2

Update a project

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTaskProject2" method="patch" path="/task/{connection_id}/project/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchTaskProject2Request;
import to.unified.unified_java_sdk.models.operations.PatchTaskProject2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TaskProject;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchTaskProject2Request req = PatchTaskProject2Request.builder()
                .taskProject(TaskProject.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTaskProject2Response res = sdk.task().patchTaskProject2()
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
| `request`                                                                       | [PatchTaskProject2Request](../../models/operations/PatchTaskProject2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchTaskProject2Response](../../models/operations/PatchTaskProject2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchTaskTask2

Update a task

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTaskTask2" method="patch" path="/task/{connection_id}/task/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchTaskTask2Request;
import to.unified.unified_java_sdk.models.operations.PatchTaskTask2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TaskTask;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchTaskTask2Request req = PatchTaskTask2Request.builder()
                .taskTask(TaskTask.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTaskTask2Response res = sdk.task().patchTaskTask2()
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
| `request`                                                                 | [PatchTaskTask2Request](../../models/operations/PatchTaskTask2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchTaskTask2Response](../../models/operations/PatchTaskTask2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeTaskComment2

Remove a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="removeTaskComment2" method="delete" path="/task/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveTaskComment2Request;
import to.unified.unified_java_sdk.models.operations.RemoveTaskComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveTaskComment2Request req = RemoveTaskComment2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTaskComment2Response res = sdk.task().removeTaskComment2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveTaskComment2Request](../../models/operations/RemoveTaskComment2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveTaskComment2Response](../../models/operations/RemoveTaskComment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeTaskProject2

Remove a project

### Example Usage

<!-- UsageSnippet language="java" operationID="removeTaskProject2" method="delete" path="/task/{connection_id}/project/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveTaskProject2Request;
import to.unified.unified_java_sdk.models.operations.RemoveTaskProject2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveTaskProject2Request req = RemoveTaskProject2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTaskProject2Response res = sdk.task().removeTaskProject2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveTaskProject2Request](../../models/operations/RemoveTaskProject2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveTaskProject2Response](../../models/operations/RemoveTaskProject2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeTaskTask2

Remove a task

### Example Usage

<!-- UsageSnippet language="java" operationID="removeTaskTask2" method="delete" path="/task/{connection_id}/task/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveTaskTask2Request;
import to.unified.unified_java_sdk.models.operations.RemoveTaskTask2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveTaskTask2Request req = RemoveTaskTask2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTaskTask2Response res = sdk.task().removeTaskTask2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveTaskTask2Request](../../models/operations/RemoveTaskTask2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveTaskTask2Response](../../models/operations/RemoveTaskTask2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTaskComment2

Update a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTaskComment2" method="put" path="/task/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateTaskComment2Request;
import to.unified.unified_java_sdk.models.operations.UpdateTaskComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TaskComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateTaskComment2Request req = UpdateTaskComment2Request.builder()
                .taskComment(TaskComment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTaskComment2Response res = sdk.task().updateTaskComment2()
                .request(req)
                .call();

        if (res.taskComment().isPresent()) {
            System.out.println(res.taskComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateTaskComment2Request](../../models/operations/UpdateTaskComment2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateTaskComment2Response](../../models/operations/UpdateTaskComment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTaskProject2

Update a project

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTaskProject2" method="put" path="/task/{connection_id}/project/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateTaskProject2Request;
import to.unified.unified_java_sdk.models.operations.UpdateTaskProject2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TaskProject;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateTaskProject2Request req = UpdateTaskProject2Request.builder()
                .taskProject(TaskProject.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTaskProject2Response res = sdk.task().updateTaskProject2()
                .request(req)
                .call();

        if (res.taskProject().isPresent()) {
            System.out.println(res.taskProject().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateTaskProject2Request](../../models/operations/UpdateTaskProject2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateTaskProject2Response](../../models/operations/UpdateTaskProject2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTaskTask2

Update a task

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTaskTask2" method="put" path="/task/{connection_id}/task/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateTaskTask2Request;
import to.unified.unified_java_sdk.models.operations.UpdateTaskTask2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TaskTask;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateTaskTask2Request req = UpdateTaskTask2Request.builder()
                .taskTask(TaskTask.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTaskTask2Response res = sdk.task().updateTaskTask2()
                .request(req)
                .call();

        if (res.taskTask().isPresent()) {
            System.out.println(res.taskTask().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateTaskTask2Request](../../models/operations/UpdateTaskTask2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateTaskTask2Response](../../models/operations/UpdateTaskTask2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |