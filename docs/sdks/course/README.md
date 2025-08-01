# Course
(*course()*)

## Overview

### Available Operations

* [createLmsCourse](#createlmscourse) - Create a course
* [getLmsCourse](#getlmscourse) - Retrieve a course
* [listLmsCourses](#listlmscourses) - List all courses
* [patchLmsCourse](#patchlmscourse) - Update a course
* [removeLmsCourse](#removelmscourse) - Remove a course
* [updateLmsCourse](#updatelmscourse) - Update a course

## createLmsCourse

Create a course

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsCourse" method="post" path="/lms/{connection_id}/course" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.LmsCourse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsCourseRequest req = CreateLmsCourseRequest.builder()
                .lmsCourse(LmsCourse.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsCourseResponse res = sdk.course().createLmsCourse()
                .request(req)
                .call();

        if (res.lmsCourse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateLmsCourseRequest](../../models/operations/CreateLmsCourseRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateLmsCourseResponse](../../models/operations/CreateLmsCourseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsCourse

Retrieve a course

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsCourse" method="get" path="/lms/{connection_id}/course/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsCourseRequest req = GetLmsCourseRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsCourseResponse res = sdk.course().getLmsCourse()
                .request(req)
                .call();

        if (res.lmsCourse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetLmsCourseRequest](../../models/operations/GetLmsCourseRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetLmsCourseResponse](../../models/operations/GetLmsCourseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsCourses

List all courses

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsCourses" method="get" path="/lms/{connection_id}/course" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsCoursesRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsCoursesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsCoursesRequest req = ListLmsCoursesRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsCoursesResponse res = sdk.course().listLmsCourses()
                .request(req)
                .call();

        if (res.lmsCourses().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListLmsCoursesRequest](../../models/operations/ListLmsCoursesRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListLmsCoursesResponse](../../models/operations/ListLmsCoursesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsCourse

Update a course

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsCourse" method="patch" path="/lms/{connection_id}/course/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.LmsCourse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsCourseRequest req = PatchLmsCourseRequest.builder()
                .lmsCourse(LmsCourse.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsCourseResponse res = sdk.course().patchLmsCourse()
                .request(req)
                .call();

        if (res.lmsCourse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchLmsCourseRequest](../../models/operations/PatchLmsCourseRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchLmsCourseResponse](../../models/operations/PatchLmsCourseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsCourse

Remove a course

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsCourse" method="delete" path="/lms/{connection_id}/course/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsCourseRequest req = RemoveLmsCourseRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsCourseResponse res = sdk.course().removeLmsCourse()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveLmsCourseRequest](../../models/operations/RemoveLmsCourseRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveLmsCourseResponse](../../models/operations/RemoveLmsCourseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsCourse

Update a course

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsCourse" method="put" path="/lms/{connection_id}/course/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.LmsCourse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsCourseRequest req = UpdateLmsCourseRequest.builder()
                .lmsCourse(LmsCourse.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsCourseResponse res = sdk.course().updateLmsCourse()
                .request(req)
                .call();

        if (res.lmsCourse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateLmsCourseRequest](../../models/operations/UpdateLmsCourseRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateLmsCourseResponse](../../models/operations/UpdateLmsCourseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |