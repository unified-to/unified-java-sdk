# Lms
(*lms()*)

## Overview

### Available Operations

* [createLmsClass](#createlmsclass) - Create a class
* [createLmsCourse](#createlmscourse) - Create a course
* [createLmsInstructor](#createlmsinstructor) - Create an instructor
* [createLmsStudent](#createlmsstudent) - Create a student
* [getLmsClass](#getlmsclass) - Retrieve a class
* [getLmsCourse](#getlmscourse) - Retrieve a course
* [getLmsInstructor](#getlmsinstructor) - Retrieve an instructor
* [getLmsStudent](#getlmsstudent) - Retrieve a student
* [listLmsClasses](#listlmsclasses) - List all classes
* [listLmsCourses](#listlmscourses) - List all courses
* [listLmsInstructors](#listlmsinstructors) - List all instructors
* [listLmsStudents](#listlmsstudents) - List all students
* [patchLmsClass](#patchlmsclass) - Update a class
* [patchLmsCourse](#patchlmscourse) - Update a course
* [patchLmsInstructor](#patchlmsinstructor) - Update an instructor
* [patchLmsStudent](#patchlmsstudent) - Update a student
* [removeLmsClass](#removelmsclass) - Remove a class
* [removeLmsCourse](#removelmscourse) - Remove a course
* [removeLmsInstructor](#removelmsinstructor) - Remove an instructor
* [removeLmsStudent](#removelmsstudent) - Remove a student
* [updateLmsClass](#updatelmsclass) - Update a class
* [updateLmsCourse](#updatelmscourse) - Update a course
* [updateLmsInstructor](#updatelmsinstructor) - Update an instructor
* [updateLmsStudent](#updatelmsstudent) - Update a student

## createLmsClass

Create a class

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.CreateLmsClassRequest;
import to.unified.unifiedto.models.operations.CreateLmsClassResponse;
import to.unified.unifiedto.models.shared.LmsClass;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateLmsClassRequest req = CreateLmsClassRequest.builder()
                .lmsClass(LmsClass.builder()
                    .courseId("<id>")
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsClassResponse res = sdk.lms().createLmsClass()
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

## createLmsCourse

Create a course

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.CreateLmsCourseRequest;
import to.unified.unifiedto.models.operations.CreateLmsCourseResponse;
import to.unified.unifiedto.models.shared.LmsCourse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateLmsCourseRequest req = CreateLmsCourseRequest.builder()
                .lmsCourse(LmsCourse.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsCourseResponse res = sdk.lms().createLmsCourse()
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

## createLmsInstructor

Create an instructor

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.CreateLmsInstructorRequest;
import to.unified.unifiedto.models.operations.CreateLmsInstructorResponse;
import to.unified.unifiedto.models.shared.LmsInstructor;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateLmsInstructorRequest req = CreateLmsInstructorRequest.builder()
                .lmsInstructor(LmsInstructor.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsInstructorResponse res = sdk.lms().createLmsInstructor()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateLmsInstructorRequest](../../models/operations/CreateLmsInstructorRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateLmsInstructorResponse](../../models/operations/CreateLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsStudent

Create a student

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.CreateLmsStudentRequest;
import to.unified.unifiedto.models.operations.CreateLmsStudentResponse;
import to.unified.unifiedto.models.shared.LmsStudent;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateLmsStudentRequest req = CreateLmsStudentRequest.builder()
                .lmsStudent(LmsStudent.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsStudentResponse res = sdk.lms().createLmsStudent()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateLmsStudentRequest](../../models/operations/CreateLmsStudentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateLmsStudentResponse](../../models/operations/CreateLmsStudentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsClass

Retrieve a class

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.GetLmsClassRequest;
import to.unified.unifiedto.models.operations.GetLmsClassResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetLmsClassRequest req = GetLmsClassRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsClassResponse res = sdk.lms().getLmsClass()
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

## getLmsCourse

Retrieve a course

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.GetLmsCourseRequest;
import to.unified.unifiedto.models.operations.GetLmsCourseResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetLmsCourseRequest req = GetLmsCourseRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsCourseResponse res = sdk.lms().getLmsCourse()
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

## getLmsInstructor

Retrieve an instructor

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.GetLmsInstructorRequest;
import to.unified.unifiedto.models.operations.GetLmsInstructorResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetLmsInstructorRequest req = GetLmsInstructorRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsInstructorResponse res = sdk.lms().getLmsInstructor()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetLmsInstructorRequest](../../models/operations/GetLmsInstructorRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetLmsInstructorResponse](../../models/operations/GetLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsStudent

Retrieve a student

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.GetLmsStudentRequest;
import to.unified.unifiedto.models.operations.GetLmsStudentResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetLmsStudentRequest req = GetLmsStudentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsStudentResponse res = sdk.lms().getLmsStudent()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetLmsStudentRequest](../../models/operations/GetLmsStudentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetLmsStudentResponse](../../models/operations/GetLmsStudentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsClasses

List all classes

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListLmsClassesRequest;
import to.unified.unifiedto.models.operations.ListLmsClassesResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListLmsClassesRequest req = ListLmsClassesRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsClassesResponse res = sdk.lms().listLmsClasses()
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

## listLmsCourses

List all courses

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListLmsCoursesRequest;
import to.unified.unifiedto.models.operations.ListLmsCoursesResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListLmsCoursesRequest req = ListLmsCoursesRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsCoursesResponse res = sdk.lms().listLmsCourses()
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

## listLmsInstructors

List all instructors

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListLmsInstructorsRequest;
import to.unified.unifiedto.models.operations.ListLmsInstructorsResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListLmsInstructorsRequest req = ListLmsInstructorsRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsInstructorsResponse res = sdk.lms().listLmsInstructors()
                .request(req)
                .call();

        if (res.lmsInstructors().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListLmsInstructorsRequest](../../models/operations/ListLmsInstructorsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListLmsInstructorsResponse](../../models/operations/ListLmsInstructorsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsStudents

List all students

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListLmsStudentsRequest;
import to.unified.unifiedto.models.operations.ListLmsStudentsResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListLmsStudentsRequest req = ListLmsStudentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsStudentsResponse res = sdk.lms().listLmsStudents()
                .request(req)
                .call();

        if (res.lmsStudents().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListLmsStudentsRequest](../../models/operations/ListLmsStudentsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListLmsStudentsResponse](../../models/operations/ListLmsStudentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsClass

Update a class

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.PatchLmsClassRequest;
import to.unified.unifiedto.models.operations.PatchLmsClassResponse;
import to.unified.unifiedto.models.shared.LmsClass;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

        PatchLmsClassResponse res = sdk.lms().patchLmsClass()
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

## patchLmsCourse

Update a course

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.PatchLmsCourseRequest;
import to.unified.unifiedto.models.operations.PatchLmsCourseResponse;
import to.unified.unifiedto.models.shared.LmsCourse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchLmsCourseRequest req = PatchLmsCourseRequest.builder()
                .lmsCourse(LmsCourse.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsCourseResponse res = sdk.lms().patchLmsCourse()
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

## patchLmsInstructor

Update an instructor

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.PatchLmsInstructorRequest;
import to.unified.unifiedto.models.operations.PatchLmsInstructorResponse;
import to.unified.unifiedto.models.shared.LmsInstructor;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchLmsInstructorRequest req = PatchLmsInstructorRequest.builder()
                .lmsInstructor(LmsInstructor.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsInstructorResponse res = sdk.lms().patchLmsInstructor()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchLmsInstructorRequest](../../models/operations/PatchLmsInstructorRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchLmsInstructorResponse](../../models/operations/PatchLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsStudent

Update a student

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.PatchLmsStudentRequest;
import to.unified.unifiedto.models.operations.PatchLmsStudentResponse;
import to.unified.unifiedto.models.shared.LmsStudent;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchLmsStudentRequest req = PatchLmsStudentRequest.builder()
                .lmsStudent(LmsStudent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsStudentResponse res = sdk.lms().patchLmsStudent()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchLmsStudentRequest](../../models/operations/PatchLmsStudentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchLmsStudentResponse](../../models/operations/PatchLmsStudentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsClass

Remove a class

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.RemoveLmsClassRequest;
import to.unified.unifiedto.models.operations.RemoveLmsClassResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveLmsClassRequest req = RemoveLmsClassRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsClassResponse res = sdk.lms().removeLmsClass()
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

## removeLmsCourse

Remove a course

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.RemoveLmsCourseRequest;
import to.unified.unifiedto.models.operations.RemoveLmsCourseResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveLmsCourseRequest req = RemoveLmsCourseRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsCourseResponse res = sdk.lms().removeLmsCourse()
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

## removeLmsInstructor

Remove an instructor

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.RemoveLmsInstructorRequest;
import to.unified.unifiedto.models.operations.RemoveLmsInstructorResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveLmsInstructorRequest req = RemoveLmsInstructorRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsInstructorResponse res = sdk.lms().removeLmsInstructor()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveLmsInstructorRequest](../../models/operations/RemoveLmsInstructorRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveLmsInstructorResponse](../../models/operations/RemoveLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsStudent

Remove a student

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.RemoveLmsStudentRequest;
import to.unified.unifiedto.models.operations.RemoveLmsStudentResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveLmsStudentRequest req = RemoveLmsStudentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsStudentResponse res = sdk.lms().removeLmsStudent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveLmsStudentRequest](../../models/operations/RemoveLmsStudentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveLmsStudentResponse](../../models/operations/RemoveLmsStudentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsClass

Update a class

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.UpdateLmsClassRequest;
import to.unified.unifiedto.models.operations.UpdateLmsClassResponse;
import to.unified.unifiedto.models.shared.LmsClass;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

        UpdateLmsClassResponse res = sdk.lms().updateLmsClass()
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

## updateLmsCourse

Update a course

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.UpdateLmsCourseRequest;
import to.unified.unifiedto.models.operations.UpdateLmsCourseResponse;
import to.unified.unifiedto.models.shared.LmsCourse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateLmsCourseRequest req = UpdateLmsCourseRequest.builder()
                .lmsCourse(LmsCourse.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsCourseResponse res = sdk.lms().updateLmsCourse()
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

## updateLmsInstructor

Update an instructor

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.UpdateLmsInstructorRequest;
import to.unified.unifiedto.models.operations.UpdateLmsInstructorResponse;
import to.unified.unifiedto.models.shared.LmsInstructor;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateLmsInstructorRequest req = UpdateLmsInstructorRequest.builder()
                .lmsInstructor(LmsInstructor.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsInstructorResponse res = sdk.lms().updateLmsInstructor()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateLmsInstructorRequest](../../models/operations/UpdateLmsInstructorRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateLmsInstructorResponse](../../models/operations/UpdateLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsStudent

Update a student

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.UpdateLmsStudentRequest;
import to.unified.unifiedto.models.operations.UpdateLmsStudentResponse;
import to.unified.unifiedto.models.shared.LmsStudent;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateLmsStudentRequest req = UpdateLmsStudentRequest.builder()
                .lmsStudent(LmsStudent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsStudentResponse res = sdk.lms().updateLmsStudent()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateLmsStudentRequest](../../models/operations/UpdateLmsStudentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateLmsStudentResponse](../../models/operations/UpdateLmsStudentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |