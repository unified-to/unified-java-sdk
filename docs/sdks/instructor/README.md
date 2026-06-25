# Instructor

## Overview

### Available Operations

* [createLmsInstructor2](#createlmsinstructor2) - Create an instructor
* [getLmsInstructor2](#getlmsinstructor2) - Retrieve an instructor
* [listLmsInstructors2](#listlmsinstructors2) - List all instructors
* [patchLmsInstructor2](#patchlmsinstructor2) - Update an instructor
* [removeLmsInstructor2](#removelmsinstructor2) - Remove an instructor
* [updateLmsInstructor2](#updatelmsinstructor2) - Update an instructor

## createLmsInstructor2

Create an instructor

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsInstructor2" method="post" path="/lms/{connection_id}/instructor" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsInstructor2Request;
import to.unified.unified_java_sdk.models.operations.CreateLmsInstructor2Response;
import to.unified.unified_java_sdk.models.shared.LmsInstructor;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsInstructor2Request req = CreateLmsInstructor2Request.builder()
                .lmsInstructor(LmsInstructor.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsInstructor2Response res = sdk.instructor().createLmsInstructor2()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            System.out.println(res.lmsInstructor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateLmsInstructor2Request](../../models/operations/CreateLmsInstructor2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateLmsInstructor2Response](../../models/operations/CreateLmsInstructor2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsInstructor2

Retrieve an instructor

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsInstructor2" method="get" path="/lms/{connection_id}/instructor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsInstructor2Request;
import to.unified.unified_java_sdk.models.operations.GetLmsInstructor2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsInstructor2Request req = GetLmsInstructor2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsInstructor2Response res = sdk.instructor().getLmsInstructor2()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            System.out.println(res.lmsInstructor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetLmsInstructor2Request](../../models/operations/GetLmsInstructor2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetLmsInstructor2Response](../../models/operations/GetLmsInstructor2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsInstructors2

List all instructors

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsInstructors2" method="get" path="/lms/{connection_id}/instructor" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsInstructors2Request;
import to.unified.unified_java_sdk.models.operations.ListLmsInstructors2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsInstructors2Request req = ListLmsInstructors2Request.builder()
                .connectionId("<id>")
                .build();

        ListLmsInstructors2Response res = sdk.instructor().listLmsInstructors2()
                .request(req)
                .call();

        if (res.lmsInstructors().isPresent()) {
            System.out.println(res.lmsInstructors().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListLmsInstructors2Request](../../models/operations/ListLmsInstructors2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListLmsInstructors2Response](../../models/operations/ListLmsInstructors2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsInstructor2

Update an instructor

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsInstructor2" method="patch" path="/lms/{connection_id}/instructor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsInstructor2Request;
import to.unified.unified_java_sdk.models.operations.PatchLmsInstructor2Response;
import to.unified.unified_java_sdk.models.shared.LmsInstructor;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsInstructor2Request req = PatchLmsInstructor2Request.builder()
                .lmsInstructor(LmsInstructor.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsInstructor2Response res = sdk.instructor().patchLmsInstructor2()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            System.out.println(res.lmsInstructor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchLmsInstructor2Request](../../models/operations/PatchLmsInstructor2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchLmsInstructor2Response](../../models/operations/PatchLmsInstructor2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsInstructor2

Remove an instructor

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsInstructor2" method="delete" path="/lms/{connection_id}/instructor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsInstructor2Request;
import to.unified.unified_java_sdk.models.operations.RemoveLmsInstructor2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsInstructor2Request req = RemoveLmsInstructor2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsInstructor2Response res = sdk.instructor().removeLmsInstructor2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveLmsInstructor2Request](../../models/operations/RemoveLmsInstructor2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveLmsInstructor2Response](../../models/operations/RemoveLmsInstructor2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsInstructor2

Update an instructor

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsInstructor2" method="put" path="/lms/{connection_id}/instructor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsInstructor2Request;
import to.unified.unified_java_sdk.models.operations.UpdateLmsInstructor2Response;
import to.unified.unified_java_sdk.models.shared.LmsInstructor;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsInstructor2Request req = UpdateLmsInstructor2Request.builder()
                .lmsInstructor(LmsInstructor.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsInstructor2Response res = sdk.instructor().updateLmsInstructor2()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            System.out.println(res.lmsInstructor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateLmsInstructor2Request](../../models/operations/UpdateLmsInstructor2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateLmsInstructor2Response](../../models/operations/UpdateLmsInstructor2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |