# Class
(*class_()*)

## Overview

### Available Operations

* [createLmsClass](#createlmsclass) - Create a class
* [getLmsClass](#getlmsclass) - Retrieve a class
* [listLmsClasses](#listlmsclasses) - List all classes
* [patchLmsClass](#patchlmsclass) - Update a class
* [removeLmsClass](#removelmsclass) - Remove a class
* [updateLmsClass](#updatelmsclass) - Update a class

## createLmsClass

Create a class

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsClass" method="post" path="/lms/{connection_id}/class" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.LmsClass;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsClassRequest req = CreateLmsClassRequest.builder()
                .lmsClass(LmsClass.builder()
                    .courseId("<id>")
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsClassResponse res = sdk.class_().createLmsClass()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateLmsClassRequest](../../models/operations/CreateLmsClassRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateLmsClassResponse](../../models/operations/CreateLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsClass

Retrieve a class

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsClass" method="get" path="/lms/{connection_id}/class/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsClassRequest req = GetLmsClassRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsClassResponse res = sdk.class_().getLmsClass()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetLmsClassRequest](../../models/operations/GetLmsClassRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetLmsClassResponse](../../models/operations/GetLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsClasses

List all classes

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsClasses" method="get" path="/lms/{connection_id}/class" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsClassesRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsClassesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsClassesRequest req = ListLmsClassesRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsClassesResponse res = sdk.class_().listLmsClasses()
                .request(req)
                .call();

        if (res.lmsClasses().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListLmsClassesRequest](../../models/operations/ListLmsClassesRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListLmsClassesResponse](../../models/operations/ListLmsClassesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsClass

Update a class

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsClass" method="patch" path="/lms/{connection_id}/class/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.LmsClass;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsClassRequest req = PatchLmsClassRequest.builder()
                .lmsClass(LmsClass.builder()
                    .courseId("<id>")
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsClassResponse res = sdk.class_().patchLmsClass()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchLmsClassRequest](../../models/operations/PatchLmsClassRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchLmsClassResponse](../../models/operations/PatchLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsClass

Remove a class

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsClass" method="delete" path="/lms/{connection_id}/class/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsClassRequest req = RemoveLmsClassRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsClassResponse res = sdk.class_().removeLmsClass()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveLmsClassRequest](../../models/operations/RemoveLmsClassRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveLmsClassResponse](../../models/operations/RemoveLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsClass

Update a class

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsClass" method="put" path="/lms/{connection_id}/class/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.LmsClass;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsClassRequest req = UpdateLmsClassRequest.builder()
                .lmsClass(LmsClass.builder()
                    .courseId("<id>")
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsClassResponse res = sdk.class_().updateLmsClass()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateLmsClassRequest](../../models/operations/UpdateLmsClassRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateLmsClassResponse](../../models/operations/UpdateLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |