# Project
(*project*)

### Available Operations

* [createTaskProject](#createtaskproject) - Create a project
* [getTaskProject](#gettaskproject) - Retrieve a project
* [listTaskProjects](#listtaskprojects) - List all projects
* [patchTaskProject](#patchtaskproject) - Update a project
* [removeTaskProject](#removetaskproject) - Remove a project
* [updateTaskProject](#updatetaskproject) - Update a project

## createTaskProject

Create a project

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateTaskProjectRequest;
import com.unifiedapi.unifiedto.models.operations.CreateTaskProjectResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TaskProject;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateTaskProjectRequest req = new CreateTaskProjectRequest(
                "<value>"){{
                taskProject = new TaskProject(
){{
                    createdAt = OffsetDateTime.parse("2022-10-11T14:12:01.452Z");
                    description = "Proactive zero defect encryption";
                    id = "<id>";
                    name = "<value>";
                    parentId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2023-05-03T05:32:45.009Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateTaskProjectResponse res = sdk.project.createTaskProject(req);

            if (res.taskProject != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.CreateTaskProjectRequest](../../models/operations/CreateTaskProjectRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateTaskProjectResponse](../../models/operations/CreateTaskProjectResponse.md)**


## getTaskProject

Retrieve a project

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTaskProjectRequest;
import com.unifiedapi.unifiedto.models.operations.GetTaskProjectResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetTaskProjectRequest req = new GetTaskProjectRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetTaskProjectResponse res = sdk.project.getTaskProject(req);

            if (res.taskProject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetTaskProjectRequest](../../models/operations/GetTaskProjectRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTaskProjectResponse](../../models/operations/GetTaskProjectResponse.md)**


## listTaskProjects

List all projects

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListTaskProjectsRequest;
import com.unifiedapi.unifiedto.models.operations.ListTaskProjectsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListTaskProjectsRequest req = new ListTaskProjectsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 8217.75d;
                offset = 5158.61d;
                order = "<value>";
                parentId = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2024-08-11T05:04:28.347Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListTaskProjectsResponse res = sdk.project.listTaskProjects(req);

            if (res.taskProjects != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.ListTaskProjectsRequest](../../models/operations/ListTaskProjectsRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListTaskProjectsResponse](../../models/operations/ListTaskProjectsResponse.md)**


## patchTaskProject

Update a project

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTaskProjectRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTaskProjectResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TaskProject;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchTaskProjectRequest req = new PatchTaskProjectRequest(
                "<value>",
                "<value>"){{
                taskProject = new TaskProject(
){{
                    createdAt = OffsetDateTime.parse("2022-07-29T23:19:02.666Z");
                    description = "Horizontal responsive time-frame";
                    id = "<id>";
                    name = "<value>";
                    parentId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2023-12-06T04:41:05.723Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchTaskProjectResponse res = sdk.project.patchTaskProject(req);

            if (res.taskProject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchTaskProjectRequest](../../models/operations/PatchTaskProjectRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchTaskProjectResponse](../../models/operations/PatchTaskProjectResponse.md)**


## removeTaskProject

Remove a project

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveTaskProjectRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveTaskProjectResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveTaskProjectRequest req = new RemoveTaskProjectRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveTaskProjectResponse res = sdk.project.removeTaskProject(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.RemoveTaskProjectRequest](../../models/operations/RemoveTaskProjectRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveTaskProjectResponse](../../models/operations/RemoveTaskProjectResponse.md)**


## updateTaskProject

Update a project

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateTaskProjectRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateTaskProjectResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TaskProject;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateTaskProjectRequest req = new UpdateTaskProjectRequest(
                "<value>",
                "<value>"){{
                taskProject = new TaskProject(
){{
                    createdAt = OffsetDateTime.parse("2023-12-15T14:58:26.353Z");
                    description = "Seamless impactful circuit";
                    id = "<id>";
                    name = "<value>";
                    parentId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2022-05-06T04:18:01.172Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateTaskProjectResponse res = sdk.project.updateTaskProject(req);

            if (res.taskProject != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.UpdateTaskProjectRequest](../../models/operations/UpdateTaskProjectRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateTaskProjectResponse](../../models/operations/UpdateTaskProjectResponse.md)**

