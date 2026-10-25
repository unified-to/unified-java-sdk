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
                        "territo"))
                    .createdAt(OffsetDateTime.parse("2020-10-22T22:30:50.963Z"))
                    .description("Usque laboriosam ventosus adflicto.")
                    .difficulty("Beginner")
                    .durationMinutes(19d)
                    .id("87531c62-dfb8-45ab-8cb4-96f070b9f2ab")
                    .instructors(List.of())
                    .isActive(true)
                    .languages(List.of(
                        "despecto",
                        "suppellex"))
                    .localizations(List.of(
                        LmsContentLocalization.builder()
                            .description("Acervus.")
                            .language("es")
                            .name("talis")
                            .build(),
                        LmsContentLocalization.builder()
                            .description("Ratione.")
                            .language("es")
                            .name("sint")
                            .build()))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Adnuo antepono vulticulus incidunt. Commemoro voro ocer arca velut vigor venustas una audeo. Consectetur totidem amor amo vigor. Patior ulciscor cohors necessitatibus beatae. Copiose cedo sub decens acer.")
                            .description("Venia aeternus tandem spargo.")
                            .languages(List.of(
                                "zu",
                                "ba"))
                            .name("subiungo")
                            .thumbnailUrl("https://loremflickr.com/2056/3712?lock=5644845642923518")
                            .type(LmsMediaType.OTHER)
                            .url("https://loremflickr.com/2593/1553?lock=8591263400111785")
                            .build(),
                        LmsMedia.builder()
                            .content("Terminatio acidus tripudio teres. Compono demum aut aestivus ambitus pecus tergum verumtamen vestrum. Absque adversus desino aut tabernus tollo vigor. Cur agnitio totidem consuasor bene doloribus. Vetus abundans curriculum curatio usitas.")
                            .description("Comedo valde caste combibo.")
                            .languages(List.of(
                                "it",
                                "hu"))
                            .name("beneficium")
                            .thumbnailUrl("https://picsum.photos/seed/pNFr1/2597/885")
                            .type(LmsMediaType.WEB)
                            .url("https://loremflickr.com/3597/239?lock=7142808124990633")
                            .build(),
                        LmsMedia.builder()
                            .content("Coepi demo adversus capillus aro unus templum. Aspicio alius vehemens terminatio varietas vomica. Apud thorax defero decet impedit verbera pauci laboriosam molestiae urbanus. Aveho vergo crux certus nulla caute sophismata. Caute voluptatibus patrocinor demo verumtamen adeo canis sapiente depraedor verus.")
                            .description("Tunc barba decens.")
                            .languages(List.of(
                                "bn",
                                "yo"))
                            .name("qui")
                            .thumbnailUrl("https://loremflickr.com/1375/3377?lock=6601832177607674")
                            .type(LmsMediaType.IMAGE)
                            .url("https://loremflickr.com/3927/2086?lock=5199784913821481")
                            .build()))
                    .metadata(List.of())
                    .name("ut")
                    .providerName("Bins LLC")
                    .publishedAt(OffsetDateTime.parse("2022-09-04T11:06:58.118Z"))
                    .shortDescription("Caritas.")
                    .skills(List.of(
                        "trucido"))
                    .sortOrder(3d)
                    .subjects(List.of(
                        LmsSubject.builder()
                            .name("tibi")
                            .rank(1d)
                            .build()))
                    .tags(List.of(
                        "dens"))
                    .updatedAt(OffsetDateTime.parse("2022-10-05T10:41:51.672Z"))
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
                        "territo"))
                    .createdAt(OffsetDateTime.parse("2020-10-22T22:30:50.963Z"))
                    .description("Usque laboriosam ventosus adflicto.")
                    .difficulty("Beginner")
                    .durationMinutes(19d)
                    .id("a3929f8e-91a5-49bf-a37c-b8cda04851f9")
                    .instructors(List.of())
                    .isActive(true)
                    .languages(List.of(
                        "despecto",
                        "suppellex"))
                    .localizations(List.of(
                        LmsContentLocalization.builder()
                            .description("Acervus.")
                            .language("es")
                            .name("talis")
                            .build(),
                        LmsContentLocalization.builder()
                            .description("Ratione.")
                            .language("es")
                            .name("sint")
                            .build()))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Adnuo antepono vulticulus incidunt. Commemoro voro ocer arca velut vigor venustas una audeo. Consectetur totidem amor amo vigor. Patior ulciscor cohors necessitatibus beatae. Copiose cedo sub decens acer.")
                            .description("Venia aeternus tandem spargo.")
                            .languages(List.of(
                                "zu",
                                "ba"))
                            .name("subiungo")
                            .thumbnailUrl("https://loremflickr.com/2056/3712?lock=5644845642923518")
                            .type(LmsMediaType.OTHER)
                            .url("https://loremflickr.com/2593/1553?lock=8591263400111785")
                            .build(),
                        LmsMedia.builder()
                            .content("Terminatio acidus tripudio teres. Compono demum aut aestivus ambitus pecus tergum verumtamen vestrum. Absque adversus desino aut tabernus tollo vigor. Cur agnitio totidem consuasor bene doloribus. Vetus abundans curriculum curatio usitas.")
                            .description("Comedo valde caste combibo.")
                            .languages(List.of(
                                "it",
                                "hu"))
                            .name("beneficium")
                            .thumbnailUrl("https://picsum.photos/seed/pNFr1/2597/885")
                            .type(LmsMediaType.WEB)
                            .url("https://loremflickr.com/3597/239?lock=7142808124990633")
                            .build(),
                        LmsMedia.builder()
                            .content("Coepi demo adversus capillus aro unus templum. Aspicio alius vehemens terminatio varietas vomica. Apud thorax defero decet impedit verbera pauci laboriosam molestiae urbanus. Aveho vergo crux certus nulla caute sophismata. Caute voluptatibus patrocinor demo verumtamen adeo canis sapiente depraedor verus.")
                            .description("Tunc barba decens.")
                            .languages(List.of(
                                "bn",
                                "yo"))
                            .name("qui")
                            .thumbnailUrl("https://loremflickr.com/1375/3377?lock=6601832177607674")
                            .type(LmsMediaType.IMAGE)
                            .url("https://loremflickr.com/3927/2086?lock=5199784913821481")
                            .build()))
                    .metadata(List.of())
                    .name("ut")
                    .providerName("Bins LLC")
                    .publishedAt(OffsetDateTime.parse("2022-09-04T11:06:58.128Z"))
                    .shortDescription("Caritas.")
                    .skills(List.of(
                        "trucido"))
                    .sortOrder(3d)
                    .subjects(List.of(
                        LmsSubject.builder()
                            .name("tibi")
                            .rank(1d)
                            .build()))
                    .tags(List.of(
                        "dens"))
                    .updatedAt(OffsetDateTime.parse("2022-10-05T10:41:51.682Z"))
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
                        "territo"))
                    .createdAt(OffsetDateTime.parse("2020-10-22T22:30:50.963Z"))
                    .description("Usque laboriosam ventosus adflicto.")
                    .difficulty("Beginner")
                    .durationMinutes(19d)
                    .id("a3929f8e-91a5-49bf-a37c-b8cda04851f9")
                    .instructors(List.of())
                    .isActive(true)
                    .languages(List.of(
                        "despecto",
                        "suppellex"))
                    .localizations(List.of(
                        LmsContentLocalization.builder()
                            .description("Acervus.")
                            .language("es")
                            .name("talis")
                            .build(),
                        LmsContentLocalization.builder()
                            .description("Ratione.")
                            .language("es")
                            .name("sint")
                            .build()))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Adnuo antepono vulticulus incidunt. Commemoro voro ocer arca velut vigor venustas una audeo. Consectetur totidem amor amo vigor. Patior ulciscor cohors necessitatibus beatae. Copiose cedo sub decens acer.")
                            .description("Venia aeternus tandem spargo.")
                            .languages(List.of(
                                "zu",
                                "ba"))
                            .name("subiungo")
                            .thumbnailUrl("https://loremflickr.com/2056/3712?lock=5644845642923518")
                            .type(LmsMediaType.OTHER)
                            .url("https://loremflickr.com/2593/1553?lock=8591263400111785")
                            .build(),
                        LmsMedia.builder()
                            .content("Terminatio acidus tripudio teres. Compono demum aut aestivus ambitus pecus tergum verumtamen vestrum. Absque adversus desino aut tabernus tollo vigor. Cur agnitio totidem consuasor bene doloribus. Vetus abundans curriculum curatio usitas.")
                            .description("Comedo valde caste combibo.")
                            .languages(List.of(
                                "it",
                                "hu"))
                            .name("beneficium")
                            .thumbnailUrl("https://picsum.photos/seed/pNFr1/2597/885")
                            .type(LmsMediaType.WEB)
                            .url("https://loremflickr.com/3597/239?lock=7142808124990633")
                            .build(),
                        LmsMedia.builder()
                            .content("Coepi demo adversus capillus aro unus templum. Aspicio alius vehemens terminatio varietas vomica. Apud thorax defero decet impedit verbera pauci laboriosam molestiae urbanus. Aveho vergo crux certus nulla caute sophismata. Caute voluptatibus patrocinor demo verumtamen adeo canis sapiente depraedor verus.")
                            .description("Tunc barba decens.")
                            .languages(List.of(
                                "bn",
                                "yo"))
                            .name("qui")
                            .thumbnailUrl("https://loremflickr.com/1375/3377?lock=6601832177607674")
                            .type(LmsMediaType.IMAGE)
                            .url("https://loremflickr.com/3927/2086?lock=5199784913821481")
                            .build()))
                    .metadata(List.of())
                    .name("ut")
                    .providerName("Bins LLC")
                    .publishedAt(OffsetDateTime.parse("2022-09-04T11:06:58.128Z"))
                    .shortDescription("Caritas.")
                    .skills(List.of(
                        "trucido"))
                    .sortOrder(3d)
                    .subjects(List.of(
                        LmsSubject.builder()
                            .name("tibi")
                            .rank(1d)
                            .build()))
                    .tags(List.of(
                        "dens"))
                    .updatedAt(OffsetDateTime.parse("2022-10-05T10:41:51.682Z"))
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