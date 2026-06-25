# Course

## Overview

### Available Operations

* [createLmsCourse2](#createlmscourse2) - Create a course
* [getLmsCourse2](#getlmscourse2) - Retrieve a course
* [listLmsCourses2](#listlmscourses2) - List all courses
* [patchLmsCourse2](#patchlmscourse2) - Update a course
* [removeLmsCourse2](#removelmscourse2) - Remove a course
* [updateLmsCourse2](#updatelmscourse2) - Update a course

## createLmsCourse2

Create a course

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsCourse2" method="post" path="/lms/{connection_id}/course" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsCourse2Request;
import to.unified.unified_java_sdk.models.operations.CreateLmsCourse2Response;
import to.unified.unified_java_sdk.models.shared.LmsCourse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsCourse2Request req = CreateLmsCourse2Request.builder()
                .lmsCourse(LmsCourse.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsCourse2Response res = sdk.course().createLmsCourse2()
                .request(req)
                .call();

        if (res.lmsCourse().isPresent()) {
            System.out.println(res.lmsCourse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateLmsCourse2Request](../../models/operations/CreateLmsCourse2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateLmsCourse2Response](../../models/operations/CreateLmsCourse2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsCourse2

Retrieve a course

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsCourse2" method="get" path="/lms/{connection_id}/course/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsCourse2Request;
import to.unified.unified_java_sdk.models.operations.GetLmsCourse2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsCourse2Request req = GetLmsCourse2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsCourse2Response res = sdk.course().getLmsCourse2()
                .request(req)
                .call();

        if (res.lmsCourse().isPresent()) {
            System.out.println(res.lmsCourse().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetLmsCourse2Request](../../models/operations/GetLmsCourse2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetLmsCourse2Response](../../models/operations/GetLmsCourse2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsCourses2

List all courses

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsCourses2" method="get" path="/lms/{connection_id}/course" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsCourses2Request;
import to.unified.unified_java_sdk.models.operations.ListLmsCourses2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsCourses2Request req = ListLmsCourses2Request.builder()
                .connectionId("<id>")
                .build();

        ListLmsCourses2Response res = sdk.course().listLmsCourses2()
                .request(req)
                .call();

        if (res.lmsCourses().isPresent()) {
            System.out.println(res.lmsCourses().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListLmsCourses2Request](../../models/operations/ListLmsCourses2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListLmsCourses2Response](../../models/operations/ListLmsCourses2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsCourse2

Update a course

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsCourse2" method="patch" path="/lms/{connection_id}/course/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsCourse2Request;
import to.unified.unified_java_sdk.models.operations.PatchLmsCourse2Response;
import to.unified.unified_java_sdk.models.shared.LmsCourse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsCourse2Request req = PatchLmsCourse2Request.builder()
                .lmsCourse(LmsCourse.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsCourse2Response res = sdk.course().patchLmsCourse2()
                .request(req)
                .call();

        if (res.lmsCourse().isPresent()) {
            System.out.println(res.lmsCourse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchLmsCourse2Request](../../models/operations/PatchLmsCourse2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchLmsCourse2Response](../../models/operations/PatchLmsCourse2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsCourse2

Remove a course

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsCourse2" method="delete" path="/lms/{connection_id}/course/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCourse2Request;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCourse2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsCourse2Request req = RemoveLmsCourse2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsCourse2Response res = sdk.course().removeLmsCourse2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveLmsCourse2Request](../../models/operations/RemoveLmsCourse2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveLmsCourse2Response](../../models/operations/RemoveLmsCourse2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsCourse2

Update a course

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsCourse2" method="put" path="/lms/{connection_id}/course/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCourse2Request;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCourse2Response;
import to.unified.unified_java_sdk.models.shared.LmsCourse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsCourse2Request req = UpdateLmsCourse2Request.builder()
                .lmsCourse(LmsCourse.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsCourse2Response res = sdk.course().updateLmsCourse2()
                .request(req)
                .call();

        if (res.lmsCourse().isPresent()) {
            System.out.println(res.lmsCourse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateLmsCourse2Request](../../models/operations/UpdateLmsCourse2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateLmsCourse2Response](../../models/operations/UpdateLmsCourse2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |