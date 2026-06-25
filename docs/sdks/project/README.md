# Project

## Overview

### Available Operations

* [createTaskProject2](#createtaskproject2) - Create a project
* [getTaskProject2](#gettaskproject2) - Retrieve a project
* [listTaskProjects2](#listtaskprojects2) - List all projects
* [patchTaskProject2](#patchtaskproject2) - Update a project
* [removeTaskProject2](#removetaskproject2) - Remove a project
* [updateTaskProject2](#updatetaskproject2) - Update a project

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

        CreateTaskProject2Response res = sdk.project().createTaskProject2()
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

        GetTaskProject2Response res = sdk.project().getTaskProject2()
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

        ListTaskProjects2Response res = sdk.project().listTaskProjects2()
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

        PatchTaskProject2Response res = sdk.project().patchTaskProject2()
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

        RemoveTaskProject2Response res = sdk.project().removeTaskProject2()
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

        UpdateTaskProject2Response res = sdk.project().updateTaskProject2()
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