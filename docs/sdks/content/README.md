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

Create a content

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
                    .externalReference("0d230e31-a9c4-4a35-a5b9-9168e91ffff5")
                    .id("962858e4-42df-4b1d-b1b2-498605eb4d61")
                    .instructors(List.of(
                        LmsReference.builder()
                            .id("91a23b20-a7a3-4323-9548-0897c09eb49e")
                            .name("Winston Ferry")
                            .build()))
                    .isActive(true)
                    .languages(List.of(
                        "despecto",
                        "suppellex"))
                    .localizations(List.of(
                        LmsContentLocalization.builder()
                            .description("Numquam.")
                            .language("es")
                            .name("validus")
                            .build(),
                        LmsContentLocalization.builder()
                            .description("Callide.")
                            .language("fr")
                            .name("crux")
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
                    .name("ut")
                    .providerName("Berge LLC")
                    .publishedAt(OffsetDateTime.parse("2023-11-08T11:32:09.080Z"))
                    .shortDescription("Commemoro.")
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
                    .updatedAt(OffsetDateTime.parse("2022-09-24T03:11:30.007Z"))
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

Retrieve a content

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

List all contents

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

Update a content

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
                    .externalReference("0d230e31-a9c4-4a35-a5b9-9168e91ffff5")
                    .id("00dc6830-9b78-422e-9e27-7b3eabaa8c70")
                    .instructors(List.of(
                        LmsReference.builder()
                            .id("91a23b20-a7a3-4323-9548-0897c09eb49e")
                            .name("Winston Ferry")
                            .build()))
                    .isActive(true)
                    .languages(List.of(
                        "despecto",
                        "suppellex"))
                    .localizations(List.of(
                        LmsContentLocalization.builder()
                            .description("Numquam.")
                            .language("es")
                            .name("validus")
                            .build(),
                        LmsContentLocalization.builder()
                            .description("Callide.")
                            .language("fr")
                            .name("crux")
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
                    .name("ut")
                    .providerName("Berge LLC")
                    .publishedAt(OffsetDateTime.parse("2023-11-08T11:32:09.080Z"))
                    .shortDescription("Commemoro.")
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
                    .updatedAt(OffsetDateTime.parse("2022-09-24T03:11:30.015Z"))
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

Remove a content

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

Update a content

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
                    .externalReference("0d230e31-a9c4-4a35-a5b9-9168e91ffff5")
                    .id("00dc6830-9b78-422e-9e27-7b3eabaa8c70")
                    .instructors(List.of(
                        LmsReference.builder()
                            .id("91a23b20-a7a3-4323-9548-0897c09eb49e")
                            .name("Winston Ferry")
                            .build()))
                    .isActive(true)
                    .languages(List.of(
                        "despecto",
                        "suppellex"))
                    .localizations(List.of(
                        LmsContentLocalization.builder()
                            .description("Numquam.")
                            .language("es")
                            .name("validus")
                            .build(),
                        LmsContentLocalization.builder()
                            .description("Callide.")
                            .language("fr")
                            .name("crux")
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
                    .name("ut")
                    .providerName("Berge LLC")
                    .publishedAt(OffsetDateTime.parse("2023-11-08T11:32:09.080Z"))
                    .shortDescription("Commemoro.")
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
                    .updatedAt(OffsetDateTime.parse("2022-09-24T03:11:30.015Z"))
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