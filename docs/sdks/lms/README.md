# Lms

## Overview

### Available Operations

* [createLmsActivity2](#createlmsactivity2) - Create an activity
* [createLmsClass2](#createlmsclass2) - Create a class
* [createLmsCollection2](#createlmscollection2) - Create a collection
* [createLmsContent2](#createlmscontent2) - Create a content
* [createLmsCourse2](#createlmscourse2) - Create a course
* [createLmsInstructor2](#createlmsinstructor2) - Create an instructor
* [createLmsStudent2](#createlmsstudent2) - Create a student
* [getLmsActivity2](#getlmsactivity2) - Retrieve an activity
* [getLmsClass2](#getlmsclass2) - Retrieve a class
* [getLmsCollection2](#getlmscollection2) - Retrieve a collection
* [getLmsContent2](#getlmscontent2) - Retrieve a content
* [getLmsCourse2](#getlmscourse2) - Retrieve a course
* [getLmsInstructor2](#getlmsinstructor2) - Retrieve an instructor
* [getLmsStudent2](#getlmsstudent2) - Retrieve a student
* [listLmsActivities2](#listlmsactivities2) - List all activities
* [listLmsClasses2](#listlmsclasses2) - List all classes
* [listLmsCollections2](#listlmscollections2) - List all collections
* [listLmsContents2](#listlmscontents2) - List all contents
* [listLmsCourses2](#listlmscourses2) - List all courses
* [listLmsInstructors2](#listlmsinstructors2) - List all instructors
* [listLmsStudents2](#listlmsstudents2) - List all students
* [patchLmsActivity2](#patchlmsactivity2) - Update an activity
* [patchLmsClass2](#patchlmsclass2) - Update a class
* [patchLmsCollection2](#patchlmscollection2) - Update a collection
* [patchLmsContent2](#patchlmscontent2) - Update a content
* [patchLmsCourse2](#patchlmscourse2) - Update a course
* [patchLmsInstructor2](#patchlmsinstructor2) - Update an instructor
* [patchLmsStudent2](#patchlmsstudent2) - Update a student
* [removeLmsActivity2](#removelmsactivity2) - Remove an activity
* [removeLmsClass2](#removelmsclass2) - Remove a class
* [removeLmsCollection2](#removelmscollection2) - Remove a collection
* [removeLmsContent2](#removelmscontent2) - Remove a content
* [removeLmsCourse2](#removelmscourse2) - Remove a course
* [removeLmsInstructor2](#removelmsinstructor2) - Remove an instructor
* [removeLmsStudent2](#removelmsstudent2) - Remove a student
* [updateLmsActivity2](#updatelmsactivity2) - Update an activity
* [updateLmsClass2](#updatelmsclass2) - Update a class
* [updateLmsCollection2](#updatelmscollection2) - Update a collection
* [updateLmsContent2](#updatelmscontent2) - Update a content
* [updateLmsCourse2](#updatelmscourse2) - Update a course
* [updateLmsInstructor2](#updatelmsinstructor2) - Update an instructor
* [updateLmsStudent2](#updatelmsstudent2) - Update a student

## createLmsActivity2

Create an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsActivity2" method="post" path="/lms/{connection_id}/activity" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsActivity2Request;
import to.unified.unified_java_sdk.models.operations.CreateLmsActivity2Response;
import to.unified.unified_java_sdk.models.shared.LmsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsActivity2Request req = CreateLmsActivity2Request.builder()
                .lmsActivity(LmsActivity.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsActivity2Response res = sdk.lms().createLmsActivity2()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateLmsActivity2Request](../../models/operations/CreateLmsActivity2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateLmsActivity2Response](../../models/operations/CreateLmsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsClass2

Create a class

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsClass2" method="post" path="/lms/{connection_id}/class" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsClass2Request;
import to.unified.unified_java_sdk.models.operations.CreateLmsClass2Response;
import to.unified.unified_java_sdk.models.shared.LmsClass;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsClass2Request req = CreateLmsClass2Request.builder()
                .lmsClass(LmsClass.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsClass2Response res = sdk.lms().createLmsClass2()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            System.out.println(res.lmsClass().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateLmsClass2Request](../../models/operations/CreateLmsClass2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateLmsClass2Response](../../models/operations/CreateLmsClass2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsCollection2

Create a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsCollection2" method="post" path="/lms/{connection_id}/collection" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsCollection2Request;
import to.unified.unified_java_sdk.models.operations.CreateLmsCollection2Response;
import to.unified.unified_java_sdk.models.shared.LmsCollection;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsCollection2Request req = CreateLmsCollection2Request.builder()
                .lmsCollection(LmsCollection.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsCollection2Response res = sdk.lms().createLmsCollection2()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateLmsCollection2Request](../../models/operations/CreateLmsCollection2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateLmsCollection2Response](../../models/operations/CreateLmsCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsContent2

Create a content

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsContent2" method="post" path="/lms/{connection_id}/content" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsContent2Request;
import to.unified.unified_java_sdk.models.operations.CreateLmsContent2Response;
import to.unified.unified_java_sdk.models.shared.LmsContent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsContent2Request req = CreateLmsContent2Request.builder()
                .lmsContent(LmsContent.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsContent2Response res = sdk.lms().createLmsContent2()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateLmsContent2Request](../../models/operations/CreateLmsContent2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateLmsContent2Response](../../models/operations/CreateLmsContent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateLmsCourse2Response res = sdk.lms().createLmsCourse2()
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

        CreateLmsInstructor2Response res = sdk.lms().createLmsInstructor2()
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

        CreateLmsStudent2Response res = sdk.lms().createLmsStudent2()
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

## getLmsActivity2

Retrieve an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsActivity2" method="get" path="/lms/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsActivity2Request;
import to.unified.unified_java_sdk.models.operations.GetLmsActivity2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsActivity2Request req = GetLmsActivity2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsActivity2Response res = sdk.lms().getLmsActivity2()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetLmsActivity2Request](../../models/operations/GetLmsActivity2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetLmsActivity2Response](../../models/operations/GetLmsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsClass2

Retrieve a class

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsClass2" method="get" path="/lms/{connection_id}/class/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsClass2Request;
import to.unified.unified_java_sdk.models.operations.GetLmsClass2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsClass2Request req = GetLmsClass2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsClass2Response res = sdk.lms().getLmsClass2()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            System.out.println(res.lmsClass().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetLmsClass2Request](../../models/operations/GetLmsClass2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetLmsClass2Response](../../models/operations/GetLmsClass2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsCollection2

Retrieve a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsCollection2" method="get" path="/lms/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsCollection2Request;
import to.unified.unified_java_sdk.models.operations.GetLmsCollection2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsCollection2Request req = GetLmsCollection2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsCollection2Response res = sdk.lms().getLmsCollection2()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetLmsCollection2Request](../../models/operations/GetLmsCollection2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetLmsCollection2Response](../../models/operations/GetLmsCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsContent2

Retrieve a content

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsContent2" method="get" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsContent2Request;
import to.unified.unified_java_sdk.models.operations.GetLmsContent2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsContent2Request req = GetLmsContent2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsContent2Response res = sdk.lms().getLmsContent2()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetLmsContent2Request](../../models/operations/GetLmsContent2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetLmsContent2Response](../../models/operations/GetLmsContent2Response.md)**

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

        GetLmsCourse2Response res = sdk.lms().getLmsCourse2()
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

        GetLmsInstructor2Response res = sdk.lms().getLmsInstructor2()
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

        GetLmsStudent2Response res = sdk.lms().getLmsStudent2()
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

## listLmsActivities2

List all activities

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsActivities2" method="get" path="/lms/{connection_id}/activity" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsActivities2Request;
import to.unified.unified_java_sdk.models.operations.ListLmsActivities2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsActivities2Request req = ListLmsActivities2Request.builder()
                .connectionId("<id>")
                .build();

        ListLmsActivities2Response res = sdk.lms().listLmsActivities2()
                .request(req)
                .call();

        if (res.lmsActivities().isPresent()) {
            System.out.println(res.lmsActivities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListLmsActivities2Request](../../models/operations/ListLmsActivities2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListLmsActivities2Response](../../models/operations/ListLmsActivities2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsClasses2

List all classes

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsClasses2" method="get" path="/lms/{connection_id}/class" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsClasses2Request;
import to.unified.unified_java_sdk.models.operations.ListLmsClasses2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsClasses2Request req = ListLmsClasses2Request.builder()
                .connectionId("<id>")
                .build();

        ListLmsClasses2Response res = sdk.lms().listLmsClasses2()
                .request(req)
                .call();

        if (res.lmsClasses().isPresent()) {
            System.out.println(res.lmsClasses().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListLmsClasses2Request](../../models/operations/ListLmsClasses2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListLmsClasses2Response](../../models/operations/ListLmsClasses2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsCollections2

List all collections

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsCollections2" method="get" path="/lms/{connection_id}/collection" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsCollections2Request;
import to.unified.unified_java_sdk.models.operations.ListLmsCollections2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsCollections2Request req = ListLmsCollections2Request.builder()
                .connectionId("<id>")
                .build();

        ListLmsCollections2Response res = sdk.lms().listLmsCollections2()
                .request(req)
                .call();

        if (res.lmsCollections().isPresent()) {
            System.out.println(res.lmsCollections().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListLmsCollections2Request](../../models/operations/ListLmsCollections2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListLmsCollections2Response](../../models/operations/ListLmsCollections2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsContents2

List all contents

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsContents2" method="get" path="/lms/{connection_id}/content" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsContents2Request;
import to.unified.unified_java_sdk.models.operations.ListLmsContents2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsContents2Request req = ListLmsContents2Request.builder()
                .connectionId("<id>")
                .build();

        ListLmsContents2Response res = sdk.lms().listLmsContents2()
                .request(req)
                .call();

        if (res.lmsContents().isPresent()) {
            System.out.println(res.lmsContents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListLmsContents2Request](../../models/operations/ListLmsContents2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListLmsContents2Response](../../models/operations/ListLmsContents2Response.md)**

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

        ListLmsCourses2Response res = sdk.lms().listLmsCourses2()
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

        ListLmsInstructors2Response res = sdk.lms().listLmsInstructors2()
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

        ListLmsStudents2Response res = sdk.lms().listLmsStudents2()
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

## patchLmsActivity2

Update an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsActivity2" method="patch" path="/lms/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsActivity2Request;
import to.unified.unified_java_sdk.models.operations.PatchLmsActivity2Response;
import to.unified.unified_java_sdk.models.shared.LmsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsActivity2Request req = PatchLmsActivity2Request.builder()
                .lmsActivity(LmsActivity.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsActivity2Response res = sdk.lms().patchLmsActivity2()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchLmsActivity2Request](../../models/operations/PatchLmsActivity2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchLmsActivity2Response](../../models/operations/PatchLmsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsClass2

Update a class

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsClass2" method="patch" path="/lms/{connection_id}/class/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsClass2Request;
import to.unified.unified_java_sdk.models.operations.PatchLmsClass2Response;
import to.unified.unified_java_sdk.models.shared.LmsClass;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsClass2Request req = PatchLmsClass2Request.builder()
                .lmsClass(LmsClass.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsClass2Response res = sdk.lms().patchLmsClass2()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            System.out.println(res.lmsClass().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchLmsClass2Request](../../models/operations/PatchLmsClass2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchLmsClass2Response](../../models/operations/PatchLmsClass2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsCollection2

Update a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsCollection2" method="patch" path="/lms/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsCollection2Request;
import to.unified.unified_java_sdk.models.operations.PatchLmsCollection2Response;
import to.unified.unified_java_sdk.models.shared.LmsCollection;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsCollection2Request req = PatchLmsCollection2Request.builder()
                .lmsCollection(LmsCollection.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsCollection2Response res = sdk.lms().patchLmsCollection2()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchLmsCollection2Request](../../models/operations/PatchLmsCollection2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchLmsCollection2Response](../../models/operations/PatchLmsCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsContent2

Update a content

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsContent2" method="patch" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsContent2Request;
import to.unified.unified_java_sdk.models.operations.PatchLmsContent2Response;
import to.unified.unified_java_sdk.models.shared.LmsContent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsContent2Request req = PatchLmsContent2Request.builder()
                .lmsContent(LmsContent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsContent2Response res = sdk.lms().patchLmsContent2()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchLmsContent2Request](../../models/operations/PatchLmsContent2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchLmsContent2Response](../../models/operations/PatchLmsContent2Response.md)**

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

        PatchLmsCourse2Response res = sdk.lms().patchLmsCourse2()
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

        PatchLmsInstructor2Response res = sdk.lms().patchLmsInstructor2()
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

        PatchLmsStudent2Response res = sdk.lms().patchLmsStudent2()
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

## removeLmsActivity2

Remove an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsActivity2" method="delete" path="/lms/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsActivity2Request;
import to.unified.unified_java_sdk.models.operations.RemoveLmsActivity2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsActivity2Request req = RemoveLmsActivity2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsActivity2Response res = sdk.lms().removeLmsActivity2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveLmsActivity2Request](../../models/operations/RemoveLmsActivity2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveLmsActivity2Response](../../models/operations/RemoveLmsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsClass2

Remove a class

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsClass2" method="delete" path="/lms/{connection_id}/class/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsClass2Request;
import to.unified.unified_java_sdk.models.operations.RemoveLmsClass2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsClass2Request req = RemoveLmsClass2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsClass2Response res = sdk.lms().removeLmsClass2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveLmsClass2Request](../../models/operations/RemoveLmsClass2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveLmsClass2Response](../../models/operations/RemoveLmsClass2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsCollection2

Remove a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsCollection2" method="delete" path="/lms/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCollection2Request;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCollection2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsCollection2Request req = RemoveLmsCollection2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsCollection2Response res = sdk.lms().removeLmsCollection2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveLmsCollection2Request](../../models/operations/RemoveLmsCollection2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveLmsCollection2Response](../../models/operations/RemoveLmsCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsContent2

Remove a content

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsContent2" method="delete" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsContent2Request;
import to.unified.unified_java_sdk.models.operations.RemoveLmsContent2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsContent2Request req = RemoveLmsContent2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsContent2Response res = sdk.lms().removeLmsContent2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveLmsContent2Request](../../models/operations/RemoveLmsContent2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveLmsContent2Response](../../models/operations/RemoveLmsContent2Response.md)**

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

        RemoveLmsCourse2Response res = sdk.lms().removeLmsCourse2()
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

        RemoveLmsInstructor2Response res = sdk.lms().removeLmsInstructor2()
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

        RemoveLmsStudent2Response res = sdk.lms().removeLmsStudent2()
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

## updateLmsActivity2

Update an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsActivity2" method="put" path="/lms/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsActivity2Request;
import to.unified.unified_java_sdk.models.operations.UpdateLmsActivity2Response;
import to.unified.unified_java_sdk.models.shared.LmsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsActivity2Request req = UpdateLmsActivity2Request.builder()
                .lmsActivity(LmsActivity.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsActivity2Response res = sdk.lms().updateLmsActivity2()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateLmsActivity2Request](../../models/operations/UpdateLmsActivity2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateLmsActivity2Response](../../models/operations/UpdateLmsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsClass2

Update a class

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsClass2" method="put" path="/lms/{connection_id}/class/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsClass2Request;
import to.unified.unified_java_sdk.models.operations.UpdateLmsClass2Response;
import to.unified.unified_java_sdk.models.shared.LmsClass;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsClass2Request req = UpdateLmsClass2Request.builder()
                .lmsClass(LmsClass.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsClass2Response res = sdk.lms().updateLmsClass2()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            System.out.println(res.lmsClass().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateLmsClass2Request](../../models/operations/UpdateLmsClass2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateLmsClass2Response](../../models/operations/UpdateLmsClass2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsCollection2

Update a collection

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsCollection2" method="put" path="/lms/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCollection2Request;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCollection2Response;
import to.unified.unified_java_sdk.models.shared.LmsCollection;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsCollection2Request req = UpdateLmsCollection2Request.builder()
                .lmsCollection(LmsCollection.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsCollection2Response res = sdk.lms().updateLmsCollection2()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateLmsCollection2Request](../../models/operations/UpdateLmsCollection2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateLmsCollection2Response](../../models/operations/UpdateLmsCollection2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsContent2

Update a content

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsContent2" method="put" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsContent2Request;
import to.unified.unified_java_sdk.models.operations.UpdateLmsContent2Response;
import to.unified.unified_java_sdk.models.shared.LmsContent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsContent2Request req = UpdateLmsContent2Request.builder()
                .lmsContent(LmsContent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsContent2Response res = sdk.lms().updateLmsContent2()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateLmsContent2Request](../../models/operations/UpdateLmsContent2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateLmsContent2Response](../../models/operations/UpdateLmsContent2Response.md)**

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

        UpdateLmsCourse2Response res = sdk.lms().updateLmsCourse2()
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

        UpdateLmsInstructor2Response res = sdk.lms().updateLmsInstructor2()
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

        UpdateLmsStudent2Response res = sdk.lms().updateLmsStudent2()
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