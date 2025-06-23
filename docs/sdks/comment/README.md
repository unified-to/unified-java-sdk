# Comment
(*comment()*)

## Overview

### Available Operations

* [createKmsComment](#createkmscomment) - Create a comment
* [createTaskComment](#createtaskcomment) - Create a comment
* [getKmsComment](#getkmscomment) - Retrieve a comment
* [getTaskComment](#gettaskcomment) - Retrieve a comment
* [listKmsComments](#listkmscomments) - List all comments
* [listTaskComments](#listtaskcomments) - List all comments
* [patchKmsComment](#patchkmscomment) - Update a comment
* [patchTaskComment](#patchtaskcomment) - Update a comment
* [removeKmsComment](#removekmscomment) - Remove a comment
* [removeTaskComment](#removetaskcomment) - Remove a comment
* [updateKmsComment](#updatekmscomment) - Update a comment
* [updateTaskComment](#updatetaskcomment) - Update a comment

## createKmsComment

Create a comment

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.CreateKmsCommentRequest;
import to.unified.unifiedto.models.operations.CreateKmsCommentResponse;
import to.unified.unifiedto.models.shared.KmsComment;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateKmsCommentRequest req = CreateKmsCommentRequest.builder()
                .kmsComment(KmsComment.builder()
                    .content("<value>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateKmsCommentResponse res = sdk.comment().createKmsComment()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateKmsCommentRequest](../../models/operations/CreateKmsCommentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateKmsCommentResponse](../../models/operations/CreateKmsCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createTaskComment

Create a comment

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.CreateTaskCommentRequest;
import to.unified.unifiedto.models.operations.CreateTaskCommentResponse;
import to.unified.unifiedto.models.shared.Security;
import to.unified.unifiedto.models.shared.TaskComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateTaskCommentRequest req = CreateTaskCommentRequest.builder()
                .taskComment(TaskComment.builder()
                    .taskId("<id>")
                    .text("<value>")
                    .build())
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

## getKmsComment

Retrieve a comment

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.GetKmsCommentRequest;
import to.unified.unifiedto.models.operations.GetKmsCommentResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetKmsCommentRequest req = GetKmsCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetKmsCommentResponse res = sdk.comment().getKmsComment()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetKmsCommentRequest](../../models/operations/GetKmsCommentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetKmsCommentResponse](../../models/operations/GetKmsCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTaskComment

Retrieve a comment

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.GetTaskCommentRequest;
import to.unified.unifiedto.models.operations.GetTaskCommentResponse;
import to.unified.unifiedto.models.shared.Security;

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

## listKmsComments

List all comments

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListKmsCommentsRequest;
import to.unified.unifiedto.models.operations.ListKmsCommentsResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListKmsCommentsRequest req = ListKmsCommentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListKmsCommentsResponse res = sdk.comment().listKmsComments()
                .request(req)
                .call();

        if (res.kmsComments().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListKmsCommentsRequest](../../models/operations/ListKmsCommentsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListKmsCommentsResponse](../../models/operations/ListKmsCommentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTaskComments

List all comments

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListTaskCommentsRequest;
import to.unified.unifiedto.models.operations.ListTaskCommentsResponse;
import to.unified.unifiedto.models.shared.Security;

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

## patchKmsComment

Update a comment

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.PatchKmsCommentRequest;
import to.unified.unifiedto.models.operations.PatchKmsCommentResponse;
import to.unified.unifiedto.models.shared.KmsComment;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchKmsCommentRequest req = PatchKmsCommentRequest.builder()
                .kmsComment(KmsComment.builder()
                    .content("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchKmsCommentResponse res = sdk.comment().patchKmsComment()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchKmsCommentRequest](../../models/operations/PatchKmsCommentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchKmsCommentResponse](../../models/operations/PatchKmsCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchTaskComment

Update a comment

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.PatchTaskCommentRequest;
import to.unified.unifiedto.models.operations.PatchTaskCommentResponse;
import to.unified.unifiedto.models.shared.Security;
import to.unified.unifiedto.models.shared.TaskComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchTaskCommentRequest req = PatchTaskCommentRequest.builder()
                .taskComment(TaskComment.builder()
                    .taskId("<id>")
                    .text("<value>")
                    .build())
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

## removeKmsComment

Remove a comment

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.RemoveKmsCommentRequest;
import to.unified.unifiedto.models.operations.RemoveKmsCommentResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveKmsCommentRequest req = RemoveKmsCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveKmsCommentResponse res = sdk.comment().removeKmsComment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveKmsCommentRequest](../../models/operations/RemoveKmsCommentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveKmsCommentResponse](../../models/operations/RemoveKmsCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeTaskComment

Remove a comment

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.RemoveTaskCommentRequest;
import to.unified.unifiedto.models.operations.RemoveTaskCommentResponse;
import to.unified.unifiedto.models.shared.Security;

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

## updateKmsComment

Update a comment

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.UpdateKmsCommentRequest;
import to.unified.unifiedto.models.operations.UpdateKmsCommentResponse;
import to.unified.unifiedto.models.shared.KmsComment;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateKmsCommentRequest req = UpdateKmsCommentRequest.builder()
                .kmsComment(KmsComment.builder()
                    .content("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateKmsCommentResponse res = sdk.comment().updateKmsComment()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateKmsCommentRequest](../../models/operations/UpdateKmsCommentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateKmsCommentResponse](../../models/operations/UpdateKmsCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTaskComment

Update a comment

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.UpdateTaskCommentRequest;
import to.unified.unifiedto.models.operations.UpdateTaskCommentResponse;
import to.unified.unifiedto.models.shared.Security;
import to.unified.unifiedto.models.shared.TaskComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateTaskCommentRequest req = UpdateTaskCommentRequest.builder()
                .taskComment(TaskComment.builder()
                    .taskId("<id>")
                    .text("<value>")
                    .build())
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