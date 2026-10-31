# Project

## Overview

### Available Operations

* [createAccountingProject](#createaccountingproject) - Create a project
* [createTaskProject](#createtaskproject) - Create a project
* [getAccountingProject](#getaccountingproject) - Retrieve a project
* [getTaskProject](#gettaskproject) - Retrieve a project
* [listAccountingProjects](#listaccountingprojects) - List all projects
* [listTaskProjects](#listtaskprojects) - List all projects
* [patchAccountingProject](#patchaccountingproject) - Update a project
* [patchTaskProject](#patchtaskproject) - Update a project
* [removeAccountingProject](#removeaccountingproject) - Remove a project
* [removeTaskProject](#removetaskproject) - Remove a project
* [updateAccountingProject](#updateaccountingproject) - Update a project
* [updateTaskProject](#updatetaskproject) - Update a project

## createAccountingProject

Creates a AccountingProject. Provide the unified AccountingProject fields in the request body; they are mapped to the provider's API. Returns the created AccountingProject.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingProject" method="post" path="/accounting/{connection_id}/project" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingProjectRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingProjectResponse;
import to.unified.unified_java_sdk.models.shared.AccountingProject;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingProjectRequest req = CreateAccountingProjectRequest.builder()
                .accountingProject(AccountingProject.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingProjectResponse res = sdk.project().createAccountingProject()
                .request(req)
                .call();

        if (res.accountingProject().isPresent()) {
            System.out.println(res.accountingProject().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAccountingProjectRequest](../../models/operations/CreateAccountingProjectRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAccountingProjectResponse](../../models/operations/CreateAccountingProjectResponse.md)**

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
                    .description("Valetudo aggredior accommodo curiositas vox.")
                    .hasChildren(false)
                    .hasTasks(false)
                    .id("545513ca-f18a-41d4-aad0-bf3b1ea8d499")
                    .metadata(List.of(
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("2be22759-eb83-4dc4-9703-c9852e2c79f0")
                            .namespace("custom")
                            .slug("decens")
                            .value(TaskMetadataValue.of("uterque"))
                            .build(),
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("15dcf884-835c-4f59-bd1d-0f87a3deaeb1")
                            .namespace("custom")
                            .slug("benevolentia")
                            .value(TaskMetadataValue.of("pariatur"))
                            .build()))
                    .name("Garden")
                    .updatedAt(OffsetDateTime.parse("2023-10-12T11:59:54.014Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateTaskProjectResponse res = sdk.project().createTaskProject()
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

## getAccountingProject

Retrieves a single AccountingProject by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingProject" method="get" path="/accounting/{connection_id}/project/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingProjectRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingProjectResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingProjectRequest req = GetAccountingProjectRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingProjectResponse res = sdk.project().getAccountingProject()
                .request(req)
                .call();

        if (res.accountingProject().isPresent()) {
            System.out.println(res.accountingProject().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAccountingProjectRequest](../../models/operations/GetAccountingProjectRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAccountingProjectResponse](../../models/operations/GetAccountingProjectResponse.md)**

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

        GetTaskProjectResponse res = sdk.project().getTaskProject()
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

## listAccountingProjects

Returns a list of AccountingProjects. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingProjects" method="get" path="/accounting/{connection_id}/project" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingProjectsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingProjectsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingProjectsRequest req = ListAccountingProjectsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingProjectsResponse res = sdk.project().listAccountingProjects()
                .request(req)
                .call();

        if (res.accountingProjects().isPresent()) {
            System.out.println(res.accountingProjects().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAccountingProjectsRequest](../../models/operations/ListAccountingProjectsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAccountingProjectsResponse](../../models/operations/ListAccountingProjectsResponse.md)**

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

        ListTaskProjectsResponse res = sdk.project().listTaskProjects()
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

## patchAccountingProject

Updates the AccountingProject identified by `id`. Provide the unified AccountingProject fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingProject" method="patch" path="/accounting/{connection_id}/project/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingProjectRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingProjectResponse;
import to.unified.unified_java_sdk.models.shared.AccountingProject;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingProjectRequest req = PatchAccountingProjectRequest.builder()
                .accountingProject(AccountingProject.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingProjectResponse res = sdk.project().patchAccountingProject()
                .request(req)
                .call();

        if (res.accountingProject().isPresent()) {
            System.out.println(res.accountingProject().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAccountingProjectRequest](../../models/operations/PatchAccountingProjectRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAccountingProjectResponse](../../models/operations/PatchAccountingProjectResponse.md)**

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
                    .description("Valetudo aggredior accommodo curiositas vox.")
                    .hasChildren(false)
                    .hasTasks(false)
                    .id("eeea1c17-8924-45d6-a548-c63f3f2b707d")
                    .metadata(List.of(
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("f65d2a41-14b2-4716-9a0e-9726205d38ab")
                            .namespace("custom")
                            .slug("decens")
                            .value(TaskMetadataValue.of("uterque"))
                            .build(),
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("08cfadb3-8b63-4288-a503-8f67eafadcfe")
                            .namespace("custom")
                            .slug("benevolentia")
                            .value(TaskMetadataValue.of("pariatur"))
                            .build()))
                    .name("Garden")
                    .updatedAt(OffsetDateTime.parse("2023-10-12T11:59:54.015Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTaskProjectResponse res = sdk.project().patchTaskProject()
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

## removeAccountingProject

Deletes the AccountingProject identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingProject" method="delete" path="/accounting/{connection_id}/project/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingProjectRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingProjectResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingProjectRequest req = RemoveAccountingProjectRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingProjectResponse res = sdk.project().removeAccountingProject()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAccountingProjectRequest](../../models/operations/RemoveAccountingProjectRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAccountingProjectResponse](../../models/operations/RemoveAccountingProjectResponse.md)**

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

        RemoveTaskProjectResponse res = sdk.project().removeTaskProject()
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

## updateAccountingProject

Updates the AccountingProject identified by `id`. Provide the unified AccountingProject fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingProject" method="put" path="/accounting/{connection_id}/project/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingProjectRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingProjectResponse;
import to.unified.unified_java_sdk.models.shared.AccountingProject;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingProjectRequest req = UpdateAccountingProjectRequest.builder()
                .accountingProject(AccountingProject.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingProjectResponse res = sdk.project().updateAccountingProject()
                .request(req)
                .call();

        if (res.accountingProject().isPresent()) {
            System.out.println(res.accountingProject().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAccountingProjectRequest](../../models/operations/UpdateAccountingProjectRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAccountingProjectResponse](../../models/operations/UpdateAccountingProjectResponse.md)**

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
                    .description("Valetudo aggredior accommodo curiositas vox.")
                    .hasChildren(false)
                    .hasTasks(false)
                    .id("eeea1c17-8924-45d6-a548-c63f3f2b707d")
                    .metadata(List.of(
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("f65d2a41-14b2-4716-9a0e-9726205d38ab")
                            .namespace("custom")
                            .slug("decens")
                            .value(TaskMetadataValue.of("uterque"))
                            .build(),
                        TaskMetadata.builder()
                            .extraData(TaskMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(TaskMetadataFormat.TEXT)
                            .id("08cfadb3-8b63-4288-a503-8f67eafadcfe")
                            .namespace("custom")
                            .slug("benevolentia")
                            .value(TaskMetadataValue.of("pariatur"))
                            .build()))
                    .name("Garden")
                    .updatedAt(OffsetDateTime.parse("2023-10-12T11:59:54.015Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTaskProjectResponse res = sdk.project().updateTaskProject()
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