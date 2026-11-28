# Course

## Overview

### Available Operations

* [createLmsCourse](#createlmscourse) - Create a course
* [getLmsCourse](#getlmscourse) - Retrieve a course
* [listLmsCourses](#listlmscourses) - List all courses
* [patchLmsCourse](#patchlmscourse) - Update a course
* [removeLmsCourse](#removelmscourse) - Remove a course
* [updateLmsCourse](#updatelmscourse) - Update a course

## createLmsCourse

Creates a LmsCourse. Provide the unified LmsCourse fields in the request body; they are mapped to the provider's API. Returns the created LmsCourse.

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsCourse" method="post" path="/lms/{connection_id}/course" example="lms_course" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsCourseRequest req = CreateLmsCourseRequest.builder()
                .lmsCourse(LmsCourse.builder()
                    .categories(List.of(
                        "deripio",
                        "tergiversatio"))
                    .createdAt(OffsetDateTime.parse("2022-10-06T09:58:53.559Z"))
                    .currency("DZD")
                    .description("Aut.")
                    .durationMinutes(148d)
                    .id("ff0c42d3-3020-415e-a34d-d7816a60d045")
                    .instructors(List.of())
                    .isActive(true)
                    .isPrivate(false)
                    .languages(List.of(
                        "capitulus",
                        "desparatus",
                        "earum"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Carbo dapifer adeptio. Ipsum utrimque quae architecto repellendus cum. Conitor anser abutor error adsuesco abeo caelestis.")
                            .description("Accommodo adipiscor campana aegrotatio.")
                            .languages(List.of(
                                "el",
                                "hr"))
                            .name("conduco")
                            .thumbnailUrl("https://picsum.photos/seed/yTatRhK/3873/3840")
                            .type(LmsMediaType.OTHER)
                            .url("https://picsum.photos/seed/vcfQAbs/3357/2472")
                            .build()))
                    .metadata(List.of())
                    .name("vinco")
                    .priceAmount(84d)
                    .providerName("Roberts Group")
                    .publishedAt(OffsetDateTime.parse("2022-11-06T12:56:19.663Z"))
                    .skills(List.of(
                        "aveho",
                        "via"))
                    .students(List.of())
                    .timeEstimateMinutes(100d)
                    .updatedAt(OffsetDateTime.parse("2023-02-13T00:25:45.599Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsCourseResponse res = sdk.course().createLmsCourse()
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
| `request`                                                                   | [CreateLmsCourseRequest](../../models/operations/CreateLmsCourseRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateLmsCourseResponse](../../models/operations/CreateLmsCourseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsCourse

Retrieves a single LmsCourse by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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
            System.out.println(res.lmsCourse().get());
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

Returns a list of LmsCourses. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
            System.out.println(res.lmsCourses().get());
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

Updates the LmsCourse identified by `id`. Provide the unified LmsCourse fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsCourse" method="patch" path="/lms/{connection_id}/course/{id}" example="lms_course" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsCourseRequest req = PatchLmsCourseRequest.builder()
                .lmsCourse(LmsCourse.builder()
                    .categories(List.of(
                        "deripio",
                        "tergiversatio"))
                    .createdAt(OffsetDateTime.parse("2022-10-06T09:58:53.559Z"))
                    .currency("DZD")
                    .description("Aut.")
                    .durationMinutes(148d)
                    .id("667d22c6-5bed-4ab0-9382-3d8f1ee1220b")
                    .instructors(List.of())
                    .isActive(true)
                    .isPrivate(false)
                    .languages(List.of(
                        "capitulus",
                        "desparatus",
                        "earum"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Carbo dapifer adeptio. Ipsum utrimque quae architecto repellendus cum. Conitor anser abutor error adsuesco abeo caelestis.")
                            .description("Accommodo adipiscor campana aegrotatio.")
                            .languages(List.of(
                                "el",
                                "hr"))
                            .name("conduco")
                            .thumbnailUrl("https://picsum.photos/seed/yTatRhK/3873/3840")
                            .type(LmsMediaType.OTHER)
                            .url("https://picsum.photos/seed/vcfQAbs/3357/2472")
                            .build()))
                    .metadata(List.of())
                    .name("vinco")
                    .priceAmount(84d)
                    .providerName("Roberts Group")
                    .publishedAt(OffsetDateTime.parse("2022-11-06T12:56:19.663Z"))
                    .skills(List.of(
                        "aveho",
                        "via"))
                    .students(List.of())
                    .timeEstimateMinutes(100d)
                    .updatedAt(OffsetDateTime.parse("2023-02-13T00:25:45.601Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsCourseResponse res = sdk.course().patchLmsCourse()
                .request(req)
                .call();

        if (res.lmsCourse().isPresent()) {
            System.out.println(res.lmsCourse().get());
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

Deletes the LmsCourse identified by `id`.

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

Updates the LmsCourse identified by `id`. Provide the unified LmsCourse fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsCourse" method="put" path="/lms/{connection_id}/course/{id}" example="lms_course" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsCourseRequest req = UpdateLmsCourseRequest.builder()
                .lmsCourse(LmsCourse.builder()
                    .categories(List.of(
                        "deripio",
                        "tergiversatio"))
                    .createdAt(OffsetDateTime.parse("2022-10-06T09:58:53.559Z"))
                    .currency("DZD")
                    .description("Aut.")
                    .durationMinutes(148d)
                    .id("667d22c6-5bed-4ab0-9382-3d8f1ee1220b")
                    .instructors(List.of())
                    .isActive(true)
                    .isPrivate(false)
                    .languages(List.of(
                        "capitulus",
                        "desparatus",
                        "earum"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Carbo dapifer adeptio. Ipsum utrimque quae architecto repellendus cum. Conitor anser abutor error adsuesco abeo caelestis.")
                            .description("Accommodo adipiscor campana aegrotatio.")
                            .languages(List.of(
                                "el",
                                "hr"))
                            .name("conduco")
                            .thumbnailUrl("https://picsum.photos/seed/yTatRhK/3873/3840")
                            .type(LmsMediaType.OTHER)
                            .url("https://picsum.photos/seed/vcfQAbs/3357/2472")
                            .build()))
                    .metadata(List.of())
                    .name("vinco")
                    .priceAmount(84d)
                    .providerName("Roberts Group")
                    .publishedAt(OffsetDateTime.parse("2022-11-06T12:56:19.663Z"))
                    .skills(List.of(
                        "aveho",
                        "via"))
                    .students(List.of())
                    .timeEstimateMinutes(100d)
                    .updatedAt(OffsetDateTime.parse("2023-02-13T00:25:45.601Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsCourseResponse res = sdk.course().updateLmsCourse()
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
| `request`                                                                   | [UpdateLmsCourseRequest](../../models/operations/UpdateLmsCourseRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateLmsCourseResponse](../../models/operations/UpdateLmsCourseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |