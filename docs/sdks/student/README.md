# Student

## Overview

### Available Operations

* [createLmsStudent2](#createlmsstudent2) - Create a student
* [getLmsStudent2](#getlmsstudent2) - Retrieve a student
* [listLmsStudents2](#listlmsstudents2) - List all students
* [patchLmsStudent2](#patchlmsstudent2) - Update a student
* [removeLmsStudent2](#removelmsstudent2) - Remove a student
* [updateLmsStudent2](#updatelmsstudent2) - Update a student

## createLmsStudent2

Create a student

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsStudent2" method="post" path="/lms/{connection_id}/student" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsStudent2Request;
import to.unified.unified_java_sdk.models.operations.CreateLmsStudent2Response;
import to.unified.unified_java_sdk.models.shared.LmsStudent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsStudent2Request req = CreateLmsStudent2Request.builder()
                .lmsStudent(LmsStudent.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsStudent2Response res = sdk.student().createLmsStudent2()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            System.out.println(res.lmsStudent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateLmsStudent2Request](../../models/operations/CreateLmsStudent2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateLmsStudent2Response](../../models/operations/CreateLmsStudent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsStudent2

Retrieve a student

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsStudent2" method="get" path="/lms/{connection_id}/student/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsStudent2Request;
import to.unified.unified_java_sdk.models.operations.GetLmsStudent2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsStudent2Request req = GetLmsStudent2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsStudent2Response res = sdk.student().getLmsStudent2()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            System.out.println(res.lmsStudent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetLmsStudent2Request](../../models/operations/GetLmsStudent2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetLmsStudent2Response](../../models/operations/GetLmsStudent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsStudents2

List all students

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsStudents2" method="get" path="/lms/{connection_id}/student" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsStudents2Request;
import to.unified.unified_java_sdk.models.operations.ListLmsStudents2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsStudents2Request req = ListLmsStudents2Request.builder()
                .connectionId("<id>")
                .build();

        ListLmsStudents2Response res = sdk.student().listLmsStudents2()
                .request(req)
                .call();

        if (res.lmsStudents().isPresent()) {
            System.out.println(res.lmsStudents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListLmsStudents2Request](../../models/operations/ListLmsStudents2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListLmsStudents2Response](../../models/operations/ListLmsStudents2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsStudent2

Update a student

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsStudent2" method="patch" path="/lms/{connection_id}/student/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsStudent2Request;
import to.unified.unified_java_sdk.models.operations.PatchLmsStudent2Response;
import to.unified.unified_java_sdk.models.shared.LmsStudent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsStudent2Request req = PatchLmsStudent2Request.builder()
                .lmsStudent(LmsStudent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsStudent2Response res = sdk.student().patchLmsStudent2()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            System.out.println(res.lmsStudent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchLmsStudent2Request](../../models/operations/PatchLmsStudent2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchLmsStudent2Response](../../models/operations/PatchLmsStudent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsStudent2

Remove a student

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsStudent2" method="delete" path="/lms/{connection_id}/student/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsStudent2Request;
import to.unified.unified_java_sdk.models.operations.RemoveLmsStudent2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsStudent2Request req = RemoveLmsStudent2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsStudent2Response res = sdk.student().removeLmsStudent2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveLmsStudent2Request](../../models/operations/RemoveLmsStudent2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveLmsStudent2Response](../../models/operations/RemoveLmsStudent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsStudent2

Update a student

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsStudent2" method="put" path="/lms/{connection_id}/student/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsStudent2Request;
import to.unified.unified_java_sdk.models.operations.UpdateLmsStudent2Response;
import to.unified.unified_java_sdk.models.shared.LmsStudent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsStudent2Request req = UpdateLmsStudent2Request.builder()
                .lmsStudent(LmsStudent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsStudent2Response res = sdk.student().updateLmsStudent2()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            System.out.println(res.lmsStudent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateLmsStudent2Request](../../models/operations/UpdateLmsStudent2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateLmsStudent2Response](../../models/operations/UpdateLmsStudent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |