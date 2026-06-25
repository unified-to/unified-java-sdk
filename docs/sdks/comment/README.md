# Comment

## Overview

### Available Operations

* [createKmsComment2](#createkmscomment2) - Create a comment
* [createTaskComment2](#createtaskcomment2) - Create a comment
* [createUcComment2](#createuccomment2) - Create a comment
* [getKmsComment2](#getkmscomment2) - Retrieve a comment
* [getTaskComment2](#gettaskcomment2) - Retrieve a comment
* [getUcComment2](#getuccomment2) - Retrieve a comment
* [listKmsComments2](#listkmscomments2) - List all comments
* [listTaskComments2](#listtaskcomments2) - List all comments
* [listUcComments2](#listuccomments2) - List all comments
* [patchKmsComment2](#patchkmscomment2) - Update a comment
* [patchTaskComment2](#patchtaskcomment2) - Update a comment
* [patchUcComment2](#patchuccomment2) - Update a comment
* [removeKmsComment2](#removekmscomment2) - Remove a comment
* [removeTaskComment2](#removetaskcomment2) - Remove a comment
* [removeUcComment2](#removeuccomment2) - Remove a comment
* [updateKmsComment2](#updatekmscomment2) - Update a comment
* [updateTaskComment2](#updatetaskcomment2) - Update a comment
* [updateUcComment2](#updateuccomment2) - Update a comment

## createKmsComment2

Create a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="createKmsComment2" method="post" path="/kms/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateKmsComment2Request;
import to.unified.unified_java_sdk.models.operations.CreateKmsComment2Response;
import to.unified.unified_java_sdk.models.shared.KmsComment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateKmsComment2Request req = CreateKmsComment2Request.builder()
                .kmsComment(KmsComment.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateKmsComment2Response res = sdk.comment().createKmsComment2()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            System.out.println(res.kmsComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateKmsComment2Request](../../models/operations/CreateKmsComment2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateKmsComment2Response](../../models/operations/CreateKmsComment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateTaskComment2Response res = sdk.comment().createTaskComment2()
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

## createUcComment2

Create a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="createUcComment2" method="post" path="/uc/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUcComment2Request;
import to.unified.unified_java_sdk.models.operations.CreateUcComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateUcComment2Request req = CreateUcComment2Request.builder()
                .ucComment(UcComment.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateUcComment2Response res = sdk.comment().createUcComment2()
                .request(req)
                .call();

        if (res.ucComment().isPresent()) {
            System.out.println(res.ucComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateUcComment2Request](../../models/operations/CreateUcComment2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateUcComment2Response](../../models/operations/CreateUcComment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getKmsComment2

Retrieve a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="getKmsComment2" method="get" path="/kms/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetKmsComment2Request;
import to.unified.unified_java_sdk.models.operations.GetKmsComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetKmsComment2Request req = GetKmsComment2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetKmsComment2Response res = sdk.comment().getKmsComment2()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            System.out.println(res.kmsComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetKmsComment2Request](../../models/operations/GetKmsComment2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetKmsComment2Response](../../models/operations/GetKmsComment2Response.md)**

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

        GetTaskComment2Response res = sdk.comment().getTaskComment2()
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

## getUcComment2

Retrieve a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcComment2" method="get" path="/uc/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcComment2Request;
import to.unified.unified_java_sdk.models.operations.GetUcComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcComment2Request req = GetUcComment2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcComment2Response res = sdk.comment().getUcComment2()
                .request(req)
                .call();

        if (res.ucComment().isPresent()) {
            System.out.println(res.ucComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetUcComment2Request](../../models/operations/GetUcComment2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetUcComment2Response](../../models/operations/GetUcComment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listKmsComments2

List all comments

### Example Usage

<!-- UsageSnippet language="java" operationID="listKmsComments2" method="get" path="/kms/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListKmsComments2Request;
import to.unified.unified_java_sdk.models.operations.ListKmsComments2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListKmsComments2Request req = ListKmsComments2Request.builder()
                .connectionId("<id>")
                .build();

        ListKmsComments2Response res = sdk.comment().listKmsComments2()
                .request(req)
                .call();

        if (res.kmsComments().isPresent()) {
            System.out.println(res.kmsComments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListKmsComments2Request](../../models/operations/ListKmsComments2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListKmsComments2Response](../../models/operations/ListKmsComments2Response.md)**

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

        ListTaskComments2Response res = sdk.comment().listTaskComments2()
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

## listUcComments2

List all comments

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcComments2" method="get" path="/uc/{connection_id}/comment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcComments2Request;
import to.unified.unified_java_sdk.models.operations.ListUcComments2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcComments2Request req = ListUcComments2Request.builder()
                .connectionId("<id>")
                .build();

        ListUcComments2Response res = sdk.comment().listUcComments2()
                .request(req)
                .call();

        if (res.ucComments().isPresent()) {
            System.out.println(res.ucComments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListUcComments2Request](../../models/operations/ListUcComments2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListUcComments2Response](../../models/operations/ListUcComments2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchKmsComment2

Update a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="patchKmsComment2" method="patch" path="/kms/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchKmsComment2Request;
import to.unified.unified_java_sdk.models.operations.PatchKmsComment2Response;
import to.unified.unified_java_sdk.models.shared.KmsComment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchKmsComment2Request req = PatchKmsComment2Request.builder()
                .kmsComment(KmsComment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchKmsComment2Response res = sdk.comment().patchKmsComment2()
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
| `request`                                                                     | [PatchKmsComment2Request](../../models/operations/PatchKmsComment2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchKmsComment2Response](../../models/operations/PatchKmsComment2Response.md)**

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

        PatchTaskComment2Response res = sdk.comment().patchTaskComment2()
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

## patchUcComment2

Update a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="patchUcComment2" method="patch" path="/uc/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUcComment2Request;
import to.unified.unified_java_sdk.models.operations.PatchUcComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUcComment2Request req = PatchUcComment2Request.builder()
                .ucComment(UcComment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchUcComment2Response res = sdk.comment().patchUcComment2()
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
| `request`                                                                   | [PatchUcComment2Request](../../models/operations/PatchUcComment2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchUcComment2Response](../../models/operations/PatchUcComment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeKmsComment2

Remove a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="removeKmsComment2" method="delete" path="/kms/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveKmsComment2Request;
import to.unified.unified_java_sdk.models.operations.RemoveKmsComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveKmsComment2Request req = RemoveKmsComment2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveKmsComment2Response res = sdk.comment().removeKmsComment2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveKmsComment2Request](../../models/operations/RemoveKmsComment2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveKmsComment2Response](../../models/operations/RemoveKmsComment2Response.md)**

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

        RemoveTaskComment2Response res = sdk.comment().removeTaskComment2()
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

## removeUcComment2

Remove a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUcComment2" method="delete" path="/uc/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUcComment2Request;
import to.unified.unified_java_sdk.models.operations.RemoveUcComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUcComment2Request req = RemoveUcComment2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveUcComment2Response res = sdk.comment().removeUcComment2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveUcComment2Request](../../models/operations/RemoveUcComment2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveUcComment2Response](../../models/operations/RemoveUcComment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateKmsComment2

Update a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="updateKmsComment2" method="put" path="/kms/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateKmsComment2Request;
import to.unified.unified_java_sdk.models.operations.UpdateKmsComment2Response;
import to.unified.unified_java_sdk.models.shared.KmsComment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateKmsComment2Request req = UpdateKmsComment2Request.builder()
                .kmsComment(KmsComment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateKmsComment2Response res = sdk.comment().updateKmsComment2()
                .request(req)
                .call();

        if (res.kmsComment().isPresent()) {
            System.out.println(res.kmsComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateKmsComment2Request](../../models/operations/UpdateKmsComment2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateKmsComment2Response](../../models/operations/UpdateKmsComment2Response.md)**

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

        UpdateTaskComment2Response res = sdk.comment().updateTaskComment2()
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

## updateUcComment2

Update a comment

### Example Usage

<!-- UsageSnippet language="java" operationID="updateUcComment2" method="put" path="/uc/{connection_id}/comment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUcComment2Request;
import to.unified.unified_java_sdk.models.operations.UpdateUcComment2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcComment;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUcComment2Request req = UpdateUcComment2Request.builder()
                .ucComment(UcComment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateUcComment2Response res = sdk.comment().updateUcComment2()
                .request(req)
                .call();

        if (res.ucComment().isPresent()) {
            System.out.println(res.ucComment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateUcComment2Request](../../models/operations/UpdateUcComment2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateUcComment2Response](../../models/operations/UpdateUcComment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |