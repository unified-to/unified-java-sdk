# Content

## Overview

### Available Operations

* [createLmsContent](#createlmscontent) - Create a content
* [getLmsContent](#getlmscontent) - Retrieve a content
* [listLmsContents](#listlmscontents) - List all contents
* [patchLmsContent](#patchlmscontent) - Update a content
* [removeLmsContent](#removelmscontent) - Remove a content
* [updateLmsContent](#updatelmscontent) - Update a content

## createLmsContent

Creates a LmsContent. Provide the unified LmsContent fields in the request body; they are mapped to the provider's API. Returns the created LmsContent.

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsContent" method="post" path="/lms/{connection_id}/content" example="lms_content" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsContentRequest req = CreateLmsContentRequest.builder()
                .lmsContent(LmsContent.builder()
                    .categories(List.of(
                        "tergum"))
                    .createdAt(OffsetDateTime.parse("2020-10-22T22:30:50.963Z"))
                    .description("Adflicto despecto suppellex socius cresco.")
                    .difficulty("Beginner")
                    .durationMinutes(19d)
                    .id("e8f21dbf-c5f0-4275-bb02-6c585efd9933")
                    .instructors(List.of())
                    .isActive(true)
                    .languages(List.of(
                        "campana",
                        "viriliter"))
                    .localizations(List.of(
                        LmsContentLocalization.builder()
                            .description("Vindico vorago.")
                            .language("es")
                            .name("aeger")
                            .build(),
                        LmsContentLocalization.builder()
                            .description("Sulum.")
                            .language("es")
                            .name("voluptate")
                            .build()))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Cohors necessitatibus beatae copiose copiose cedo sub decens acer. Spiritus velum adulatio commodi textus beneficium termes comedo valde caste. Sodalitas bos timor abeo cur. Sperno decet acquiro tabgo canto terminatio acidus tripudio teres. Compono demum aut aestivus ambitus pecus tergum verumtamen vestrum.")
                            .description("Incidunt tepidus commemoro voro ocer.")
                            .languages(List.of(
                                "ro",
                                "af"))
                            .name("antepono")
                            .thumbnailUrl("https://picsum.photos/seed/URbmlO66Wk/587/3603")
                            .type(LmsMediaType.OTHER)
                            .url("https://picsum.photos/seed/4KFvVbCx83/2788/2850")
                            .build(),
                        LmsMedia.builder()
                            .content("Ago neque qui cursim tunc barba decens. Tutamen amplus tabella tabgo infit. Demo adversus capillus aro unus. Dedico aspicio alius vehemens terminatio varietas vomica voluptatibus apud. Defero decet impedit verbera pauci laboriosam molestiae urbanus mollitia. Vergo crux certus nulla.")
                            .description("Bene doloribus.")
                            .languages(List.of(
                                "ru",
                                "sw"))
                            .name("totidem")
                            .thumbnailUrl("https://picsum.photos/seed/qpRev/1286/3718")
                            .type(LmsMediaType.WEB)
                            .url("https://picsum.photos/seed/JOWrp5/254/2004")
                            .build(),
                        LmsMedia.builder()
                            .content("Laborum adiuvo labore officia demulceo. Abduco mollitia ventosus synagoga certus magni vado cilicium stella. Velut capitulus attero odio advenio similique acsi totam atavus aufero. Ventosus campana animi.")
                            .description("Trucido dens pecus aer stella.")
                            .languages(List.of(
                                "is",
                                "sk"))
                            .name("territo")
                            .thumbnailUrl("https://picsum.photos/seed/81EuDedaf/557/986")
                            .type(LmsMediaType.IMAGE)
                            .url("https://picsum.photos/seed/BtV2eDuVm7/3644/1033")
                            .build()))
                    .metadata(List.of())
                    .name("laboriosam")
                    .providerName("Mraz - Keeling")
                    .publishedAt(OffsetDateTime.parse("2022-09-14T10:28:14.348Z"))
                    .shortDescription("Videlicet pauci.")
                    .skills(List.of(
                        "soleo"))
                    .sortOrder(3d)
                    .subjects(List.of(
                        LmsSubject.builder()
                            .name("clam")
                            .rank(1d)
                            .build()))
                    .tags(List.of(
                        "audio"))
                    .updatedAt(OffsetDateTime.parse("2022-10-15T20:56:00.252Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsContentResponse res = sdk.content().createLmsContent()
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
| `request`                                                                     | [CreateLmsContentRequest](../../models/operations/CreateLmsContentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateLmsContentResponse](../../models/operations/CreateLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsContent

Retrieves a single LmsContent by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsContent" method="get" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsContentRequest req = GetLmsContentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsContentResponse res = sdk.content().getLmsContent()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetLmsContentRequest](../../models/operations/GetLmsContentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetLmsContentResponse](../../models/operations/GetLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsContents

Returns a list of LmsContents. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsContents" method="get" path="/lms/{connection_id}/content" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsContentsRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsContentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsContentsRequest req = ListLmsContentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsContentsResponse res = sdk.content().listLmsContents()
                .request(req)
                .call();

        if (res.lmsContents().isPresent()) {
            System.out.println(res.lmsContents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListLmsContentsRequest](../../models/operations/ListLmsContentsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListLmsContentsResponse](../../models/operations/ListLmsContentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsContent

Updates the LmsContent identified by `id`. Provide the unified LmsContent fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsContent" method="patch" path="/lms/{connection_id}/content/{id}" example="lms_content" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsContentRequest req = PatchLmsContentRequest.builder()
                .lmsContent(LmsContent.builder()
                    .categories(List.of(
                        "tergum"))
                    .createdAt(OffsetDateTime.parse("2020-10-22T22:30:50.963Z"))
                    .description("Adflicto despecto suppellex socius cresco.")
                    .difficulty("Beginner")
                    .durationMinutes(19d)
                    .id("829f6f15-1c55-428d-bbd3-b8b2743814ba")
                    .instructors(List.of())
                    .isActive(true)
                    .languages(List.of(
                        "campana",
                        "viriliter"))
                    .localizations(List.of(
                        LmsContentLocalization.builder()
                            .description("Vindico vorago.")
                            .language("es")
                            .name("aeger")
                            .build(),
                        LmsContentLocalization.builder()
                            .description("Sulum.")
                            .language("es")
                            .name("voluptate")
                            .build()))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Cohors necessitatibus beatae copiose copiose cedo sub decens acer. Spiritus velum adulatio commodi textus beneficium termes comedo valde caste. Sodalitas bos timor abeo cur. Sperno decet acquiro tabgo canto terminatio acidus tripudio teres. Compono demum aut aestivus ambitus pecus tergum verumtamen vestrum.")
                            .description("Incidunt tepidus commemoro voro ocer.")
                            .languages(List.of(
                                "ro",
                                "af"))
                            .name("antepono")
                            .thumbnailUrl("https://picsum.photos/seed/URbmlO66Wk/587/3603")
                            .type(LmsMediaType.OTHER)
                            .url("https://picsum.photos/seed/4KFvVbCx83/2788/2850")
                            .build(),
                        LmsMedia.builder()
                            .content("Ago neque qui cursim tunc barba decens. Tutamen amplus tabella tabgo infit. Demo adversus capillus aro unus. Dedico aspicio alius vehemens terminatio varietas vomica voluptatibus apud. Defero decet impedit verbera pauci laboriosam molestiae urbanus mollitia. Vergo crux certus nulla.")
                            .description("Bene doloribus.")
                            .languages(List.of(
                                "ru",
                                "sw"))
                            .name("totidem")
                            .thumbnailUrl("https://picsum.photos/seed/qpRev/1286/3718")
                            .type(LmsMediaType.WEB)
                            .url("https://picsum.photos/seed/JOWrp5/254/2004")
                            .build(),
                        LmsMedia.builder()
                            .content("Laborum adiuvo labore officia demulceo. Abduco mollitia ventosus synagoga certus magni vado cilicium stella. Velut capitulus attero odio advenio similique acsi totam atavus aufero. Ventosus campana animi.")
                            .description("Trucido dens pecus aer stella.")
                            .languages(List.of(
                                "is",
                                "sk"))
                            .name("territo")
                            .thumbnailUrl("https://picsum.photos/seed/81EuDedaf/557/986")
                            .type(LmsMediaType.IMAGE)
                            .url("https://picsum.photos/seed/BtV2eDuVm7/3644/1033")
                            .build()))
                    .metadata(List.of())
                    .name("laboriosam")
                    .providerName("Mraz - Keeling")
                    .publishedAt(OffsetDateTime.parse("2022-09-14T10:28:14.357Z"))
                    .shortDescription("Videlicet pauci.")
                    .skills(List.of(
                        "soleo"))
                    .sortOrder(3d)
                    .subjects(List.of(
                        LmsSubject.builder()
                            .name("clam")
                            .rank(1d)
                            .build()))
                    .tags(List.of(
                        "audio"))
                    .updatedAt(OffsetDateTime.parse("2022-10-15T20:56:00.261Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsContentResponse res = sdk.content().patchLmsContent()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchLmsContentRequest](../../models/operations/PatchLmsContentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchLmsContentResponse](../../models/operations/PatchLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsContent

Deletes the LmsContent identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsContent" method="delete" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsContentRequest req = RemoveLmsContentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsContentResponse res = sdk.content().removeLmsContent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveLmsContentRequest](../../models/operations/RemoveLmsContentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveLmsContentResponse](../../models/operations/RemoveLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsContent

Updates the LmsContent identified by `id`. Provide the unified LmsContent fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsContent" method="put" path="/lms/{connection_id}/content/{id}" example="lms_content" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsContentRequest req = UpdateLmsContentRequest.builder()
                .lmsContent(LmsContent.builder()
                    .categories(List.of(
                        "tergum"))
                    .createdAt(OffsetDateTime.parse("2020-10-22T22:30:50.963Z"))
                    .description("Adflicto despecto suppellex socius cresco.")
                    .difficulty("Beginner")
                    .durationMinutes(19d)
                    .id("829f6f15-1c55-428d-bbd3-b8b2743814ba")
                    .instructors(List.of())
                    .isActive(true)
                    .languages(List.of(
                        "campana",
                        "viriliter"))
                    .localizations(List.of(
                        LmsContentLocalization.builder()
                            .description("Vindico vorago.")
                            .language("es")
                            .name("aeger")
                            .build(),
                        LmsContentLocalization.builder()
                            .description("Sulum.")
                            .language("es")
                            .name("voluptate")
                            .build()))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Cohors necessitatibus beatae copiose copiose cedo sub decens acer. Spiritus velum adulatio commodi textus beneficium termes comedo valde caste. Sodalitas bos timor abeo cur. Sperno decet acquiro tabgo canto terminatio acidus tripudio teres. Compono demum aut aestivus ambitus pecus tergum verumtamen vestrum.")
                            .description("Incidunt tepidus commemoro voro ocer.")
                            .languages(List.of(
                                "ro",
                                "af"))
                            .name("antepono")
                            .thumbnailUrl("https://picsum.photos/seed/URbmlO66Wk/587/3603")
                            .type(LmsMediaType.OTHER)
                            .url("https://picsum.photos/seed/4KFvVbCx83/2788/2850")
                            .build(),
                        LmsMedia.builder()
                            .content("Ago neque qui cursim tunc barba decens. Tutamen amplus tabella tabgo infit. Demo adversus capillus aro unus. Dedico aspicio alius vehemens terminatio varietas vomica voluptatibus apud. Defero decet impedit verbera pauci laboriosam molestiae urbanus mollitia. Vergo crux certus nulla.")
                            .description("Bene doloribus.")
                            .languages(List.of(
                                "ru",
                                "sw"))
                            .name("totidem")
                            .thumbnailUrl("https://picsum.photos/seed/qpRev/1286/3718")
                            .type(LmsMediaType.WEB)
                            .url("https://picsum.photos/seed/JOWrp5/254/2004")
                            .build(),
                        LmsMedia.builder()
                            .content("Laborum adiuvo labore officia demulceo. Abduco mollitia ventosus synagoga certus magni vado cilicium stella. Velut capitulus attero odio advenio similique acsi totam atavus aufero. Ventosus campana animi.")
                            .description("Trucido dens pecus aer stella.")
                            .languages(List.of(
                                "is",
                                "sk"))
                            .name("territo")
                            .thumbnailUrl("https://picsum.photos/seed/81EuDedaf/557/986")
                            .type(LmsMediaType.IMAGE)
                            .url("https://picsum.photos/seed/BtV2eDuVm7/3644/1033")
                            .build()))
                    .metadata(List.of())
                    .name("laboriosam")
                    .providerName("Mraz - Keeling")
                    .publishedAt(OffsetDateTime.parse("2022-09-14T10:28:14.357Z"))
                    .shortDescription("Videlicet pauci.")
                    .skills(List.of(
                        "soleo"))
                    .sortOrder(3d)
                    .subjects(List.of(
                        LmsSubject.builder()
                            .name("clam")
                            .rank(1d)
                            .build()))
                    .tags(List.of(
                        "audio"))
                    .updatedAt(OffsetDateTime.parse("2022-10-15T20:56:00.261Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsContentResponse res = sdk.content().updateLmsContent()
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
| `request`                                                                     | [UpdateLmsContentRequest](../../models/operations/UpdateLmsContentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateLmsContentResponse](../../models/operations/UpdateLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |