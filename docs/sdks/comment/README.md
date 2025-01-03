# Comment
(*comment()*)

## Overview

### Available Operations

* [createTaskComment](#createtaskcomment) - Create a comment
* [getTaskComment](#gettaskcomment) - Retrieve a comment
* [listTaskComments](#listtaskcomments) - List all comments
* [patchTaskComment](#patchtaskcomment) - Update a comment
* [removeTaskComment](#removetaskcomment) - Remove a comment
* [updateTaskComment](#updatetaskcomment) - Update a comment

## createTaskComment

Create a comment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateTaskCommentRequest;
import com.unifiedapi.unifiedto.models.operations.CreateTaskCommentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateTaskCommentRequest req = CreateTaskCommentRequest.builder()
                .connectionId("<id>")
                .build();

        CreateTaskCommentResponse res = sdk.comment().createTaskComment()
                .request(req)
                .call();

        if (res.taskComment().isPresent()) {
            // handle response
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

## getTaskComment

Retrieve a comment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTaskCommentRequest;
import com.unifiedapi.unifiedto.models.operations.GetTaskCommentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetTaskCommentRequest req = GetTaskCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTaskCommentResponse res = sdk.comment().getTaskComment()
                .request(req)
                .call();

        if (res.taskComment().isPresent()) {
            // handle response
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

## listTaskComments

List all comments

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListTaskCommentsRequest;
import com.unifiedapi.unifiedto.models.operations.ListTaskCommentsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListTaskCommentsRequest req = ListTaskCommentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListTaskCommentsResponse res = sdk.comment().listTaskComments()
                .request(req)
                .call();

        if (res.taskComments().isPresent()) {
            // handle response
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

## patchTaskComment

Update a comment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTaskCommentRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTaskCommentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchTaskCommentRequest req = PatchTaskCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTaskCommentResponse res = sdk.comment().patchTaskComment()
                .request(req)
                .call();

        if (res.taskComment().isPresent()) {
            // handle response
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

## removeTaskComment

Remove a comment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveTaskCommentRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveTaskCommentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveTaskCommentRequest req = RemoveTaskCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTaskCommentResponse res = sdk.comment().removeTaskComment()
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

## updateTaskComment

Update a comment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateTaskCommentRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateTaskCommentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateTaskCommentRequest req = UpdateTaskCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTaskCommentResponse res = sdk.comment().updateTaskComment()
                .request(req)
                .call();

        if (res.taskComment().isPresent()) {
            // handle response
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