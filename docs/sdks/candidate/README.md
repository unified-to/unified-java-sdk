# Candidate

## Overview

### Available Operations

* [createAtsCandidate](#createatscandidate) - Create a candidate
* [getAtsCandidate](#getatscandidate) - Retrieve a candidate
* [listAtsCandidates](#listatscandidates) - List all candidates
* [patchAtsCandidate](#patchatscandidate) - Update a candidate
* [removeAtsCandidate](#removeatscandidate) - Remove a candidate
* [updateAtsCandidate](#updateatscandidate) - Update a candidate

## createAtsCandidate

Create a candidate

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsCandidate" method="post" path="/ats/{connection_id}/candidate" example="ats_candidate" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsCandidateRequest;
import to.unified.unified_java_sdk.models.operations.CreateAtsCandidateResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsCandidateRequest req = CreateAtsCandidateRequest.builder()
                .atsCandidate(AtsCandidate.builder()
                    .address(PropertyAtsCandidateAddress.builder()
                        .address1("802 Roberts Squares")
                        .address2("Suite 550")
                        .city("Lake Raeganside")
                        .countryCode("US")
                        .postalCode("44530-0054")
                        .region("Tennessee")
                        .regionCode("NV")
                        .build())
                    .companyName("Ferry, Legros and Feest")
                    .createdAt(OffsetDateTime.parse("2023-10-16T05:42:56.049Z"))
                    .education(List.of(
                        AtsCandidateEducation.builder()
                            .degree("mouser throughout")
                            .endAt(OffsetDateTime.parse("1992-11-28T20:23:20.311Z"))
                            .fieldOfStudy("solutio")
                            .institution("Heller - Lubowitz")
                            .level("phd")
                            .startAt(OffsetDateTime.parse("2001-03-26T08:12:11.510Z"))
                            .build()))
                    .emails(List.of(
                        AtsEmail.builder()
                            .email("Ardith.Beatty@hotmail.com")
                            .name("Opal Lindgren")
                            .type(AtsEmailType.WORK)
                            .build(),
                        AtsEmail.builder()
                            .email("Ardith_Beatty@gmail.com")
                            .name("Kristi Nader")
                            .type(AtsEmailType.OTHER)
                            .build()))
                    .experiences(List.of(
                        AtsCandidateExperience.builder()
                            .companyName("Donnelly, Buckridge and Steuber")
                            .endAt(OffsetDateTime.parse("1978-06-20T02:53:48.383Z"))
                            .startAt(OffsetDateTime.parse("1980-02-06T17:16:53.798Z"))
                            .title("Principal Brand Strategist")
                            .build()))
                    .firstName("Ardith")
                    .id("59cebc0f-3274-48fe-b456-efe66f9ff211")
                    .imageUrl("https://loremflickr.com/40/3693?lock=5634712403880328")
                    .jobIds(List.of())
                    .lastName("Beatty")
                    .linkUrls(List.of(
                        "https://sizzling-legislature.com",
                        "https://soupy-interchange.net",
                        "https://troubled-substitution.info"))
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("6b842011-54cc-4549-9976-9af27f096a6d")
                            .namespace("custom")
                            .slug("custom_field")
                            .value(AtsMetadataValue.of("cariosus"))
                            .build()))
                    .name("Ardith Beatty")
                    .origin(Origin.SOURCED)
                    .skills(List.of(
                        "vita",
                        "cohors"))
                    .sources(List.of(
                        "tactus"))
                    .tags(List.of(
                        "aliquid"))
                    .telephones(List.of(
                        AtsTelephone.builder()
                            .telephone("(779) 296-5994")
                            .type(AtsTelephoneType.HOME)
                            .build()))
                    .title("Principal Implementation Analyst")
                    .updatedAt(OffsetDateTime.parse("2024-04-22T21:06:56.351Z"))
                    .webUrl("https://expert-lender.name/")
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsCandidateResponse res = sdk.candidate().createAtsCandidate()
                .request(req)
                .call();

        if (res.atsCandidate().isPresent()) {
            System.out.println(res.atsCandidate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateAtsCandidateRequest](../../models/operations/CreateAtsCandidateRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateAtsCandidateResponse](../../models/operations/CreateAtsCandidateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsCandidate

Retrieve a candidate

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsCandidate" method="get" path="/ats/{connection_id}/candidate/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsCandidateRequest;
import to.unified.unified_java_sdk.models.operations.GetAtsCandidateResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsCandidateRequest req = GetAtsCandidateRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsCandidateResponse res = sdk.candidate().getAtsCandidate()
                .request(req)
                .call();

        if (res.atsCandidate().isPresent()) {
            System.out.println(res.atsCandidate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetAtsCandidateRequest](../../models/operations/GetAtsCandidateRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetAtsCandidateResponse](../../models/operations/GetAtsCandidateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsCandidates

List all candidates

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsCandidates" method="get" path="/ats/{connection_id}/candidate" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsCandidatesRequest;
import to.unified.unified_java_sdk.models.operations.ListAtsCandidatesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsCandidatesRequest req = ListAtsCandidatesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAtsCandidatesResponse res = sdk.candidate().listAtsCandidates()
                .request(req)
                .call();

        if (res.atsCandidates().isPresent()) {
            System.out.println(res.atsCandidates().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAtsCandidatesRequest](../../models/operations/ListAtsCandidatesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAtsCandidatesResponse](../../models/operations/ListAtsCandidatesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsCandidate

Update a candidate

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsCandidate" method="patch" path="/ats/{connection_id}/candidate/{id}" example="ats_candidate" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsCandidateRequest;
import to.unified.unified_java_sdk.models.operations.PatchAtsCandidateResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsCandidateRequest req = PatchAtsCandidateRequest.builder()
                .atsCandidate(AtsCandidate.builder()
                    .address(PropertyAtsCandidateAddress.builder()
                        .address1("802 Roberts Squares")
                        .address2("Suite 550")
                        .city("Lake Raeganside")
                        .countryCode("US")
                        .postalCode("44530-0054")
                        .region("Tennessee")
                        .regionCode("NV")
                        .build())
                    .companyName("Ferry, Legros and Feest")
                    .createdAt(OffsetDateTime.parse("2023-10-16T05:42:56.049Z"))
                    .education(List.of(
                        AtsCandidateEducation.builder()
                            .degree("mouser throughout")
                            .endAt(OffsetDateTime.parse("1992-11-28T20:23:20.311Z"))
                            .fieldOfStudy("solutio")
                            .institution("Heller - Lubowitz")
                            .level("phd")
                            .startAt(OffsetDateTime.parse("2001-03-26T08:12:11.510Z"))
                            .build()))
                    .emails(List.of(
                        AtsEmail.builder()
                            .email("Ardith.Beatty@hotmail.com")
                            .name("Opal Lindgren")
                            .type(AtsEmailType.WORK)
                            .build(),
                        AtsEmail.builder()
                            .email("Ardith_Beatty@gmail.com")
                            .name("Kristi Nader")
                            .type(AtsEmailType.OTHER)
                            .build()))
                    .experiences(List.of(
                        AtsCandidateExperience.builder()
                            .companyName("Donnelly, Buckridge and Steuber")
                            .endAt(OffsetDateTime.parse("1978-06-20T02:53:48.383Z"))
                            .startAt(OffsetDateTime.parse("1980-02-06T17:16:53.798Z"))
                            .title("Principal Brand Strategist")
                            .build()))
                    .firstName("Ardith")
                    .id("367e2ce4-a89b-4076-a673-be58f32632cd")
                    .imageUrl("https://loremflickr.com/40/3693?lock=5634712403880328")
                    .jobIds(List.of())
                    .lastName("Beatty")
                    .linkUrls(List.of(
                        "https://sizzling-legislature.com",
                        "https://soupy-interchange.net",
                        "https://troubled-substitution.info"))
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("e2322a08-cbd8-4098-ad0d-5fc62c5f6334")
                            .namespace("custom")
                            .slug("custom_field")
                            .value(AtsMetadataValue.of("cariosus"))
                            .build()))
                    .name("Ardith Beatty")
                    .origin(Origin.SOURCED)
                    .skills(List.of(
                        "vita",
                        "cohors"))
                    .sources(List.of(
                        "tactus"))
                    .tags(List.of(
                        "aliquid"))
                    .telephones(List.of(
                        AtsTelephone.builder()
                            .telephone("(779) 296-5994")
                            .type(AtsTelephoneType.HOME)
                            .build()))
                    .title("Principal Implementation Analyst")
                    .updatedAt(OffsetDateTime.parse("2024-04-22T21:06:56.360Z"))
                    .webUrl("https://expert-lender.name/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsCandidateResponse res = sdk.candidate().patchAtsCandidate()
                .request(req)
                .call();

        if (res.atsCandidate().isPresent()) {
            System.out.println(res.atsCandidate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchAtsCandidateRequest](../../models/operations/PatchAtsCandidateRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchAtsCandidateResponse](../../models/operations/PatchAtsCandidateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsCandidate

Remove a candidate

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsCandidate" method="delete" path="/ats/{connection_id}/candidate/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsCandidateRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAtsCandidateResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsCandidateRequest req = RemoveAtsCandidateRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsCandidateResponse res = sdk.candidate().removeAtsCandidate()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveAtsCandidateRequest](../../models/operations/RemoveAtsCandidateRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveAtsCandidateResponse](../../models/operations/RemoveAtsCandidateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsCandidate

Update a candidate

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsCandidate" method="put" path="/ats/{connection_id}/candidate/{id}" example="ats_candidate" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsCandidateRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAtsCandidateResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsCandidateRequest req = UpdateAtsCandidateRequest.builder()
                .atsCandidate(AtsCandidate.builder()
                    .address(PropertyAtsCandidateAddress.builder()
                        .address1("802 Roberts Squares")
                        .address2("Suite 550")
                        .city("Lake Raeganside")
                        .countryCode("US")
                        .postalCode("44530-0054")
                        .region("Tennessee")
                        .regionCode("NV")
                        .build())
                    .companyName("Ferry, Legros and Feest")
                    .createdAt(OffsetDateTime.parse("2023-10-16T05:42:56.049Z"))
                    .education(List.of(
                        AtsCandidateEducation.builder()
                            .degree("mouser throughout")
                            .endAt(OffsetDateTime.parse("1992-11-28T20:23:20.311Z"))
                            .fieldOfStudy("solutio")
                            .institution("Heller - Lubowitz")
                            .level("phd")
                            .startAt(OffsetDateTime.parse("2001-03-26T08:12:11.510Z"))
                            .build()))
                    .emails(List.of(
                        AtsEmail.builder()
                            .email("Ardith.Beatty@hotmail.com")
                            .name("Opal Lindgren")
                            .type(AtsEmailType.WORK)
                            .build(),
                        AtsEmail.builder()
                            .email("Ardith_Beatty@gmail.com")
                            .name("Kristi Nader")
                            .type(AtsEmailType.OTHER)
                            .build()))
                    .experiences(List.of(
                        AtsCandidateExperience.builder()
                            .companyName("Donnelly, Buckridge and Steuber")
                            .endAt(OffsetDateTime.parse("1978-06-20T02:53:48.383Z"))
                            .startAt(OffsetDateTime.parse("1980-02-06T17:16:53.798Z"))
                            .title("Principal Brand Strategist")
                            .build()))
                    .firstName("Ardith")
                    .id("367e2ce4-a89b-4076-a673-be58f32632cd")
                    .imageUrl("https://loremflickr.com/40/3693?lock=5634712403880328")
                    .jobIds(List.of())
                    .lastName("Beatty")
                    .linkUrls(List.of(
                        "https://sizzling-legislature.com",
                        "https://soupy-interchange.net",
                        "https://troubled-substitution.info"))
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("e2322a08-cbd8-4098-ad0d-5fc62c5f6334")
                            .namespace("custom")
                            .slug("custom_field")
                            .value(AtsMetadataValue.of("cariosus"))
                            .build()))
                    .name("Ardith Beatty")
                    .origin(Origin.SOURCED)
                    .skills(List.of(
                        "vita",
                        "cohors"))
                    .sources(List.of(
                        "tactus"))
                    .tags(List.of(
                        "aliquid"))
                    .telephones(List.of(
                        AtsTelephone.builder()
                            .telephone("(779) 296-5994")
                            .type(AtsTelephoneType.HOME)
                            .build()))
                    .title("Principal Implementation Analyst")
                    .updatedAt(OffsetDateTime.parse("2024-04-22T21:06:56.360Z"))
                    .webUrl("https://expert-lender.name/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsCandidateResponse res = sdk.candidate().updateAtsCandidate()
                .request(req)
                .call();

        if (res.atsCandidate().isPresent()) {
            System.out.println(res.atsCandidate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateAtsCandidateRequest](../../models/operations/UpdateAtsCandidateRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateAtsCandidateResponse](../../models/operations/UpdateAtsCandidateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |