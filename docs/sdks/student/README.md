# Student

## Overview

### Available Operations

* [createLmsStudent](#createlmsstudent) - Create a student
* [getLmsStudent](#getlmsstudent) - Retrieve a student
* [listLmsStudents](#listlmsstudents) - List all students
* [patchLmsStudent](#patchlmsstudent) - Update a student
* [removeLmsStudent](#removelmsstudent) - Remove a student
* [updateLmsStudent](#updatelmsstudent) - Update a student

## createLmsStudent

Creates a LmsStudent. Provide the unified LmsStudent fields in the request body; they are mapped to the provider's API. Returns the created LmsStudent.

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsStudent" method="post" path="/lms/{connection_id}/student" example="lms_student" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsStudentRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsStudentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsStudentRequest req = CreateLmsStudentRequest.builder()
                .lmsStudent(LmsStudent.builder()
                    .address(PropertyLmsStudentAddress.builder()
                        .address1("15033 Corwin Circles")
                        .city("New Craigside")
                        .countryCode("US")
                        .postalCode("73966")
                        .region("New Jersey")
                        .regionCode("TX")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-03-23T06:59:29.777Z"))
                    .emails(List.of(
                        LmsEmail.builder()
                            .build()))
                    .firstName("Marcella")
                    .id("bd4b130d-2c16-4ee1-a454-2ae09852eef4")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/male/512/56.jpg")
                    .lastName("Murazik")
                    .metadata(List.of())
                    .name("Marcella Murazik")
                    .telephones(List.of(
                        LmsTelephone.builder()
                            .telephone("(899) 827-6400")
                            .type(LmsTelephoneType.WORK)
                            .build(),
                        LmsTelephone.builder()
                            .telephone("(487) 213-8236")
                            .type(LmsTelephoneType.FAX)
                            .build(),
                        LmsTelephone.builder()
                            .telephone("(980) 775-2940")
                            .type(LmsTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-07-02T00:33:35.140Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsStudentResponse res = sdk.student().createLmsStudent()
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
| `request`                                                                     | [CreateLmsStudentRequest](../../models/operations/CreateLmsStudentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateLmsStudentResponse](../../models/operations/CreateLmsStudentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsStudent

Retrieves a single LmsStudent by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsStudent" method="get" path="/lms/{connection_id}/student/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsStudentRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsStudentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsStudentRequest req = GetLmsStudentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsStudentResponse res = sdk.student().getLmsStudent()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            System.out.println(res.lmsStudent().get());
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

## listLmsStudents

Returns a list of LmsStudents. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsStudents" method="get" path="/lms/{connection_id}/student" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsStudentsRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsStudentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsStudentsRequest req = ListLmsStudentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsStudentsResponse res = sdk.student().listLmsStudents()
                .request(req)
                .call();

        if (res.lmsStudents().isPresent()) {
            System.out.println(res.lmsStudents().get());
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

## patchLmsStudent

Updates the LmsStudent identified by `id`. Provide the unified LmsStudent fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsStudent" method="patch" path="/lms/{connection_id}/student/{id}" example="lms_student" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsStudentRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsStudentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsStudentRequest req = PatchLmsStudentRequest.builder()
                .lmsStudent(LmsStudent.builder()
                    .address(PropertyLmsStudentAddress.builder()
                        .address1("15033 Corwin Circles")
                        .city("New Craigside")
                        .countryCode("US")
                        .postalCode("73966")
                        .region("New Jersey")
                        .regionCode("TX")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-03-23T06:59:29.777Z"))
                    .emails(List.of(
                        LmsEmail.builder()
                            .build()))
                    .firstName("Marcella")
                    .id("419e6366-f5a4-449f-a387-731e8aaedfd3")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/male/512/56.jpg")
                    .lastName("Murazik")
                    .metadata(List.of())
                    .name("Marcella Murazik")
                    .telephones(List.of(
                        LmsTelephone.builder()
                            .telephone("(899) 827-6400")
                            .type(LmsTelephoneType.WORK)
                            .build(),
                        LmsTelephone.builder()
                            .telephone("(487) 213-8236")
                            .type(LmsTelephoneType.FAX)
                            .build(),
                        LmsTelephone.builder()
                            .telephone("(980) 775-2940")
                            .type(LmsTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-07-02T00:33:35.148Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsStudentResponse res = sdk.student().patchLmsStudent()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            System.out.println(res.lmsStudent().get());
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

## removeLmsStudent

Deletes the LmsStudent identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsStudent" method="delete" path="/lms/{connection_id}/student/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsStudentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsStudentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsStudentRequest req = RemoveLmsStudentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsStudentResponse res = sdk.student().removeLmsStudent()
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

## updateLmsStudent

Updates the LmsStudent identified by `id`. Provide the unified LmsStudent fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsStudent" method="put" path="/lms/{connection_id}/student/{id}" example="lms_student" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsStudentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsStudentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsStudentRequest req = UpdateLmsStudentRequest.builder()
                .lmsStudent(LmsStudent.builder()
                    .address(PropertyLmsStudentAddress.builder()
                        .address1("15033 Corwin Circles")
                        .city("New Craigside")
                        .countryCode("US")
                        .postalCode("73966")
                        .region("New Jersey")
                        .regionCode("TX")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-03-23T06:59:29.777Z"))
                    .emails(List.of(
                        LmsEmail.builder()
                            .build()))
                    .firstName("Marcella")
                    .id("419e6366-f5a4-449f-a387-731e8aaedfd3")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/male/512/56.jpg")
                    .lastName("Murazik")
                    .metadata(List.of())
                    .name("Marcella Murazik")
                    .telephones(List.of(
                        LmsTelephone.builder()
                            .telephone("(899) 827-6400")
                            .type(LmsTelephoneType.WORK)
                            .build(),
                        LmsTelephone.builder()
                            .telephone("(487) 213-8236")
                            .type(LmsTelephoneType.FAX)
                            .build(),
                        LmsTelephone.builder()
                            .telephone("(980) 775-2940")
                            .type(LmsTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-07-02T00:33:35.148Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsStudentResponse res = sdk.student().updateLmsStudent()
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
| `request`                                                                     | [UpdateLmsStudentRequest](../../models/operations/UpdateLmsStudentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateLmsStudentResponse](../../models/operations/UpdateLmsStudentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |