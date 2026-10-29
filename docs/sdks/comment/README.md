# Comment

## Overview

### Available Operations

* [createKmsComment](#createkmscomment) - Create a comment
* [createTaskComment](#createtaskcomment) - Create a comment
* [createUcComment](#createuccomment) - Create a comment
* [getKmsComment](#getkmscomment) - Retrieve a comment
* [getTaskComment](#gettaskcomment) - Retrieve a comment
* [getUcComment](#getuccomment) - Retrieve a comment
* [listKmsComments](#listkmscomments) - List all comments
* [listTaskComments](#listtaskcomments) - List all comments
* [listUcComments](#listuccomments) - List all comments
* [patchKmsComment](#patchkmscomment) - Update a comment
* [patchTaskComment](#patchtaskcomment) - Update a comment
* [patchUcComment](#patchuccomment) - Update a comment
* [removeKmsComment](#removekmscomment) - Remove a comment
* [removeTaskComment](#removetaskcomment) - Remove a comment
* [removeUcComment](#removeuccomment) - Remove a comment
* [updateKmsComment](#updatekmscomment) - Update a comment
* [updateTaskComment](#updatetaskcomment) - Update a comment
* [updateUcComment](#updateuccomment) - Update a comment

## createKmsComment

Creates a KmsComment. Provide the unified KmsComment fields in the request body; they are mapped to the provider's API. Returns the created KmsComment.

### Example Usage

<!-- UsageSnippet language="java" operationID="createKmsComment" method="post" path="/kms/{connection_id}/comment" example="kms_comment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateKmsCommentRequest;
import to.unified.unified_java_sdk.models.operations.CreateKmsCommentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateKmsCommentRequest req = CreateKmsCommentRequest.builder()
                .kmsComment(KmsComment.builder()
                    .content("Decimus tolero viriliter usque.")
                    .contentType(ContentType.HTML)
                    .createdAt(OffsetDateTime.parse("2022-08-26T14:40:49.732Z"))
                    .id("6a38abce-e5ec-4126-834a-ddbcce82435e")
                    .metadata(List.of())
                    .type(KmsCommentType.PAGE)
                    .updatedAt(OffsetDateTime.parse("2023-11-28T14:09:58.330Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateKmsCommentResponse res = sdk.comment().createKmsComment()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            System.out.println(res.kmsComment().get());
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
                    .hasChildren(true)
                    .id("42204582-1744-4558-b542-e55f61b8742e")
                    .metadata(List.of())
                    .text("Colo ulciscor sublime tabernus.")
                    .updatedAt(OffsetDateTime.parse("2021-10-05T11:42:24.197Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateTaskCommentResponse res = sdk.comment().createTaskComment()
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

## createUcComment

Creates a UcComment. Provide the unified UcComment fields in the request body; they are mapped to the provider's API. Returns the created UcComment.

### Example Usage

<!-- UsageSnippet language="java" operationID="createUcComment" method="post" path="/uc/{connection_id}/comment" example="uc_comment" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUcCommentRequest;
import to.unified.unified_java_sdk.models.operations.CreateUcCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateUcCommentRequest req = CreateUcCommentRequest.builder()
                .ucComment(UcComment.builder()
                    .content("Vociferor vitiosus.")
                    .createdAt("2023-04-02T23:42:31.571Z")
                    .id("8dcec3b8-ca39-4aac-a650-7ccf778e621b")
                    .metadata(List.of())
                    .updatedAt("2024-02-11T14:50:27.495Z")
                    .build())
                .connectionId("<id>")
                .build();

        CreateUcCommentResponse res = sdk.comment().createUcComment()
                .request(req)
                .call();

        if (res.ucComment().isPresent()) {
            System.out.println(res.ucComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateUcCommentRequest](../../models/operations/CreateUcCommentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateUcCommentResponse](../../models/operations/CreateUcCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getKmsComment

Retrieves a single KmsComment by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getKmsComment" method="get" path="/kms/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetKmsCommentRequest;
import to.unified.unified_java_sdk.models.operations.GetKmsCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
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
            System.out.println(res.kmsComment().get());
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

        GetTaskCommentResponse res = sdk.comment().getTaskComment()
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

## getUcComment

Retrieves a single UcComment by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcComment" method="get" path="/uc/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcCommentRequest;
import to.unified.unified_java_sdk.models.operations.GetUcCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcCommentRequest req = GetUcCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcCommentResponse res = sdk.comment().getUcComment()
                .request(req)
                .call();

        if (res.ucComment().isPresent()) {
            System.out.println(res.ucComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetUcCommentRequest](../../models/operations/GetUcCommentRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetUcCommentResponse](../../models/operations/GetUcCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listKmsComments

Returns a list of KmsComments. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listKmsComments" method="get" path="/kms/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListKmsCommentsRequest;
import to.unified.unified_java_sdk.models.operations.ListKmsCommentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListKmsCommentsRequest req = ListKmsCommentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListKmsCommentsResponse res = sdk.comment().listKmsComments()
                .request(req)
                .call();

        if (res.kmsComments().isPresent()) {
            System.out.println(res.kmsComments().get());
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

        ListTaskCommentsResponse res = sdk.comment().listTaskComments()
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

## listUcComments

Returns a list of UcComments. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcComments" method="get" path="/uc/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcCommentsRequest;
import to.unified.unified_java_sdk.models.operations.ListUcCommentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcCommentsRequest req = ListUcCommentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListUcCommentsResponse res = sdk.comment().listUcComments()
                .request(req)
                .call();

        if (res.ucComments().isPresent()) {
            System.out.println(res.ucComments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListUcCommentsRequest](../../models/operations/ListUcCommentsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListUcCommentsResponse](../../models/operations/ListUcCommentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchKmsComment

Updates the KmsComment identified by `id`. Provide the unified KmsComment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchKmsComment" method="patch" path="/kms/{connection_id}/comment/{id}" example="kms_comment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchKmsCommentRequest;
import to.unified.unified_java_sdk.models.operations.PatchKmsCommentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchKmsCommentRequest req = PatchKmsCommentRequest.builder()
                .kmsComment(KmsComment.builder()
                    .content("Decimus tolero viriliter usque.")
                    .contentType(ContentType.HTML)
                    .createdAt(OffsetDateTime.parse("2022-08-26T14:40:49.732Z"))
                    .id("2174c20f-1887-466f-9b26-6fbaea154d1f")
                    .metadata(List.of())
                    .type(KmsCommentType.PAGE)
                    .updatedAt(OffsetDateTime.parse("2023-11-28T14:09:58.334Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchKmsCommentResponse res = sdk.comment().patchKmsComment()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            System.out.println(res.kmsComment().get());
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
                    .hasChildren(true)
                    .id("a71090f8-ccb7-4b03-818c-0cfe4be09110")
                    .metadata(List.of())
                    .text("Colo ulciscor sublime tabernus.")
                    .updatedAt(OffsetDateTime.parse("2021-10-05T11:42:24.199Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTaskCommentResponse res = sdk.comment().patchTaskComment()
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

## patchUcComment

Updates the UcComment identified by `id`. Provide the unified UcComment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchUcComment" method="patch" path="/uc/{connection_id}/comment/{id}" example="uc_comment" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUcCommentRequest;
import to.unified.unified_java_sdk.models.operations.PatchUcCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUcCommentRequest req = PatchUcCommentRequest.builder()
                .ucComment(UcComment.builder()
                    .content("Vociferor vitiosus.")
                    .createdAt("2023-04-02T23:42:31.571Z")
                    .id("0534bbc8-94cd-429e-bcca-6fdde8020021")
                    .metadata(List.of())
                    .updatedAt("2024-02-11T14:50:27.498Z")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchUcCommentResponse res = sdk.comment().patchUcComment()
                .request(req)
                .call();

        if (res.ucComment().isPresent()) {
            System.out.println(res.ucComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchUcCommentRequest](../../models/operations/PatchUcCommentRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchUcCommentResponse](../../models/operations/PatchUcCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeKmsComment

Deletes the KmsComment identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeKmsComment" method="delete" path="/kms/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveKmsCommentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveKmsCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
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

## removeUcComment

Deletes the UcComment identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUcComment" method="delete" path="/uc/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUcCommentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveUcCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUcCommentRequest req = RemoveUcCommentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveUcCommentResponse res = sdk.comment().removeUcComment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveUcCommentRequest](../../models/operations/RemoveUcCommentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveUcCommentResponse](../../models/operations/RemoveUcCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateKmsComment

Updates the KmsComment identified by `id`. Provide the unified KmsComment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateKmsComment" method="put" path="/kms/{connection_id}/comment/{id}" example="kms_comment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateKmsCommentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateKmsCommentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateKmsCommentRequest req = UpdateKmsCommentRequest.builder()
                .kmsComment(KmsComment.builder()
                    .content("Decimus tolero viriliter usque.")
                    .contentType(ContentType.HTML)
                    .createdAt(OffsetDateTime.parse("2022-08-26T14:40:49.732Z"))
                    .id("2174c20f-1887-466f-9b26-6fbaea154d1f")
                    .metadata(List.of())
                    .type(KmsCommentType.PAGE)
                    .updatedAt(OffsetDateTime.parse("2023-11-28T14:09:58.334Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateKmsCommentResponse res = sdk.comment().updateKmsComment()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            System.out.println(res.kmsComment().get());
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
                    .hasChildren(true)
                    .id("a71090f8-ccb7-4b03-818c-0cfe4be09110")
                    .metadata(List.of())
                    .text("Colo ulciscor sublime tabernus.")
                    .updatedAt(OffsetDateTime.parse("2021-10-05T11:42:24.199Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTaskCommentResponse res = sdk.comment().updateTaskComment()
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

## updateUcComment

Updates the UcComment identified by `id`. Provide the unified UcComment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateUcComment" method="put" path="/uc/{connection_id}/comment/{id}" example="uc_comment" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUcCommentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateUcCommentResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUcCommentRequest req = UpdateUcCommentRequest.builder()
                .ucComment(UcComment.builder()
                    .content("Vociferor vitiosus.")
                    .createdAt("2023-04-02T23:42:31.571Z")
                    .id("0534bbc8-94cd-429e-bcca-6fdde8020021")
                    .metadata(List.of())
                    .updatedAt("2024-02-11T14:50:27.498Z")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateUcCommentResponse res = sdk.comment().updateUcComment()
                .request(req)
                .call();

        if (res.ucComment().isPresent()) {
            System.out.println(res.ucComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateUcCommentRequest](../../models/operations/UpdateUcCommentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateUcCommentResponse](../../models/operations/UpdateUcCommentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |