# Class

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

<!-- UsageSnippet language="java" operationID="createLmsClass" method="post" path="/lms/{connection_id}/class" example="lms_class" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsClassRequest req = CreateLmsClassRequest.builder()
                .lmsClass(LmsClass.builder()
                    .createdAt(OffsetDateTime.parse("2020-02-20T14:48:51.845Z"))
                    .description("Anser sperno decerno.")
                    .id("d8e86285-4d39-43ad-81b4-47162c03c8c3")
                    .instructors(List.of())
                    .languages(List.of(
                        "in"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Defetiscor aetas acies benevolentia ulterius. Creta bis beneficium canis. Bonus valeo vulgo creator arca peior ceno earum culpa. Tabesco apostolus talis. Ultra accommodo deinde sono culpo arto cruciamentum triduana.")
                            .description("Esse confido.")
                            .languages(List.of(
                                "fa",
                                "da"))
                            .name("illo")
                            .thumbnailUrl("https://loremflickr.com/199/1934?lock=4323325966476891")
                            .type(LmsMediaType.VIDEO)
                            .url("https://loremflickr.com/487/921?lock=5127962071241632")
                            .build()))
                    .name("virtus")
                    .students(List.of())
                    .updatedAt(OffsetDateTime.parse("2025-07-10T09:08:36.712Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsClassResponse res = sdk.class_().createLmsClass()
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
            System.out.println(res.lmsClass().get());
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
            System.out.println(res.lmsClasses().get());
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

<!-- UsageSnippet language="java" operationID="patchLmsClass" method="patch" path="/lms/{connection_id}/class/{id}" example="lms_class" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsClassRequest req = PatchLmsClassRequest.builder()
                .lmsClass(LmsClass.builder()
                    .createdAt(OffsetDateTime.parse("2020-02-20T14:48:51.845Z"))
                    .description("Anser sperno decerno.")
                    .id("e1649d98-707b-4ad9-a9ea-4ba1ea2b2fb9")
                    .instructors(List.of())
                    .languages(List.of(
                        "in"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Defetiscor aetas acies benevolentia ulterius. Creta bis beneficium canis. Bonus valeo vulgo creator arca peior ceno earum culpa. Tabesco apostolus talis. Ultra accommodo deinde sono culpo arto cruciamentum triduana.")
                            .description("Esse confido.")
                            .languages(List.of(
                                "fa",
                                "da"))
                            .name("illo")
                            .thumbnailUrl("https://loremflickr.com/199/1934?lock=4323325966476891")
                            .type(LmsMediaType.VIDEO)
                            .url("https://loremflickr.com/487/921?lock=5127962071241632")
                            .build()))
                    .name("virtus")
                    .students(List.of())
                    .updatedAt(OffsetDateTime.parse("2025-07-10T09:08:36.732Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsClassResponse res = sdk.class_().patchLmsClass()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            System.out.println(res.lmsClass().get());
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

<!-- UsageSnippet language="java" operationID="updateLmsClass" method="put" path="/lms/{connection_id}/class/{id}" example="lms_class" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsClassRequest req = UpdateLmsClassRequest.builder()
                .lmsClass(LmsClass.builder()
                    .createdAt(OffsetDateTime.parse("2020-02-20T14:48:51.845Z"))
                    .description("Anser sperno decerno.")
                    .id("e1649d98-707b-4ad9-a9ea-4ba1ea2b2fb9")
                    .instructors(List.of())
                    .languages(List.of(
                        "in"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Defetiscor aetas acies benevolentia ulterius. Creta bis beneficium canis. Bonus valeo vulgo creator arca peior ceno earum culpa. Tabesco apostolus talis. Ultra accommodo deinde sono culpo arto cruciamentum triduana.")
                            .description("Esse confido.")
                            .languages(List.of(
                                "fa",
                                "da"))
                            .name("illo")
                            .thumbnailUrl("https://loremflickr.com/199/1934?lock=4323325966476891")
                            .type(LmsMediaType.VIDEO)
                            .url("https://loremflickr.com/487/921?lock=5127962071241632")
                            .build()))
                    .name("virtus")
                    .students(List.of())
                    .updatedAt(OffsetDateTime.parse("2025-07-10T09:08:36.732Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsClassResponse res = sdk.class_().updateLmsClass()
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
| `request`                                                                 | [UpdateLmsClassRequest](../../models/operations/UpdateLmsClassRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateLmsClassResponse](../../models/operations/UpdateLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |