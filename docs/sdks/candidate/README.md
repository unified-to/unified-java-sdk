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
                        .address1("6790 S 1st Street")
                        .city("Ferrystad")
                        .countryCode("US")
                        .postalCode("91605")
                        .region("Idaho")
                        .regionCode("HI")
                        .build())
                    .companyName("Lehner and Sons")
                    .createdAt(OffsetDateTime.parse("2023-10-16T05:42:56.049Z"))
                    .dateOfBirth(OffsetDateTime.parse("1994-07-05T19:48:57.631Z"))
                    .education(List.of(
                        AtsCandidateEducation.builder()
                            .degree("emphasize tricky")
                            .endAt(OffsetDateTime.parse("1978-04-14T07:58:36.326Z"))
                            .fieldOfStudy("curtus")
                            .institution("Abbott - Batz")
                            .level("phd")
                            .startAt(OffsetDateTime.parse("1994-06-09T13:31:39.059Z"))
                            .build(),
                        AtsCandidateEducation.builder()
                            .degree("blah cappelletti")
                            .endAt(OffsetDateTime.parse("1989-09-06T03:32:39.901Z"))
                            .fieldOfStudy("crustulum")
                            .institution("Herman, Franey and Lebsack")
                            .level("highschool")
                            .startAt(OffsetDateTime.parse("1992-11-28T20:23:20.311Z"))
                            .build()))
                    .emails(List.of(
                        AtsEmail.builder()
                            .email("ardith.beatty@outlook.com")
                            .name("Ardith Beatty")
                            .type(AtsEmailType.HOME)
                            .build()))
                    .experiences(List.of(
                        AtsCandidateExperience.builder()
                            .companyName("Kutch, Lind and Marks")
                            .endAt(OffsetDateTime.parse("1974-03-01T17:02:58.824Z"))
                            .startAt(OffsetDateTime.parse("1999-09-21T22:12:51.663Z"))
                            .title("Lead Security Technician")
                            .build(),
                        AtsCandidateExperience.builder()
                            .companyName("Trantow, Sipes and Witting")
                            .endAt(OffsetDateTime.parse("2004-10-14T14:01:00.717Z"))
                            .startAt(OffsetDateTime.parse("1996-12-15T04:12:04.582Z"))
                            .title("Regional Applications Planner")
                            .build()))
                    .firstName("Ardith")
                    .id("a07a1a46-2ecc-4928-9c8e-28b8781fa18b")
                    .imageUrl("https://avatars.githubusercontent.com/u/27464445")
                    .jobIds(List.of())
                    .lastName("Beatty")
                    .linkUrls(List.of(
                        "https://www.linkedin.com/in/ardith-beatty"))
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("1863944c-81c0-4cfd-b022-8bc94e3de78c")
                            .namespace("custom")
                            .slug("custom_field")
                            .value(AtsMetadataValue.of("officia"))
                            .build()))
                    .name("Ardith Beatty")
                    .origin(Origin.AGENCY)
                    .skills(List.of(
                        "trepide",
                        "voveo"))
                    .sources(List.of(
                        "vesper",
                        "utroque"))
                    .summary("Laborum trado carcer delibero patruus totam. Vita cohors cariosus trans denego barba rerum similique. Templum totam suus voluptatem cui depraedor virgo cui comminor commodi.")
                    .tags(List.of(
                        "voro"))
                    .telephones(List.of(
                        AtsTelephone.builder()
                            .telephone("(837) 251-3896")
                            .type(AtsTelephoneType.MOBILE)
                            .build()))
                    .title("Customer Division Producer")
                    .updatedAt(OffsetDateTime.parse("2024-04-28T17:47:53.874Z"))
                    .webUrl("https://fragrant-husband.net/")
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
                        .address1("6790 S 1st Street")
                        .city("Ferrystad")
                        .countryCode("US")
                        .postalCode("91605")
                        .region("Idaho")
                        .regionCode("HI")
                        .build())
                    .companyName("Lehner and Sons")
                    .createdAt(OffsetDateTime.parse("2023-10-16T05:42:56.049Z"))
                    .dateOfBirth(OffsetDateTime.parse("1994-07-05T19:48:57.631Z"))
                    .education(List.of(
                        AtsCandidateEducation.builder()
                            .degree("emphasize tricky")
                            .endAt(OffsetDateTime.parse("1978-04-14T07:58:36.326Z"))
                            .fieldOfStudy("curtus")
                            .institution("Abbott - Batz")
                            .level("phd")
                            .startAt(OffsetDateTime.parse("1994-06-09T13:31:39.059Z"))
                            .build(),
                        AtsCandidateEducation.builder()
                            .degree("blah cappelletti")
                            .endAt(OffsetDateTime.parse("1989-09-06T03:32:39.901Z"))
                            .fieldOfStudy("crustulum")
                            .institution("Herman, Franey and Lebsack")
                            .level("highschool")
                            .startAt(OffsetDateTime.parse("1992-11-28T20:23:20.311Z"))
                            .build()))
                    .emails(List.of(
                        AtsEmail.builder()
                            .email("ardith.beatty@outlook.com")
                            .name("Ardith Beatty")
                            .type(AtsEmailType.HOME)
                            .build()))
                    .experiences(List.of(
                        AtsCandidateExperience.builder()
                            .companyName("Kutch, Lind and Marks")
                            .endAt(OffsetDateTime.parse("1974-03-01T17:02:58.824Z"))
                            .startAt(OffsetDateTime.parse("1999-09-21T22:12:51.663Z"))
                            .title("Lead Security Technician")
                            .build(),
                        AtsCandidateExperience.builder()
                            .companyName("Trantow, Sipes and Witting")
                            .endAt(OffsetDateTime.parse("2004-10-14T14:01:00.717Z"))
                            .startAt(OffsetDateTime.parse("1996-12-15T04:12:04.582Z"))
                            .title("Regional Applications Planner")
                            .build()))
                    .firstName("Ardith")
                    .id("fce9aa30-b3fc-4f5c-bd4e-25a951f557ae")
                    .imageUrl("https://avatars.githubusercontent.com/u/27464445")
                    .jobIds(List.of())
                    .lastName("Beatty")
                    .linkUrls(List.of(
                        "https://www.linkedin.com/in/ardith-beatty"))
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("3940c875-a6c1-4c1e-9533-79370e17c17c")
                            .namespace("custom")
                            .slug("custom_field")
                            .value(AtsMetadataValue.of("officia"))
                            .build()))
                    .name("Ardith Beatty")
                    .origin(Origin.AGENCY)
                    .skills(List.of(
                        "trepide",
                        "voveo"))
                    .sources(List.of(
                        "vesper",
                        "utroque"))
                    .summary("Laborum trado carcer delibero patruus totam. Vita cohors cariosus trans denego barba rerum similique. Templum totam suus voluptatem cui depraedor virgo cui comminor commodi.")
                    .tags(List.of(
                        "voro"))
                    .telephones(List.of(
                        AtsTelephone.builder()
                            .telephone("(837) 251-3896")
                            .type(AtsTelephoneType.MOBILE)
                            .build()))
                    .title("Customer Division Producer")
                    .updatedAt(OffsetDateTime.parse("2024-04-28T17:47:53.883Z"))
                    .webUrl("https://fragrant-husband.net/")
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
                        .address1("6790 S 1st Street")
                        .city("Ferrystad")
                        .countryCode("US")
                        .postalCode("91605")
                        .region("Idaho")
                        .regionCode("HI")
                        .build())
                    .companyName("Lehner and Sons")
                    .createdAt(OffsetDateTime.parse("2023-10-16T05:42:56.049Z"))
                    .dateOfBirth(OffsetDateTime.parse("1994-07-05T19:48:57.631Z"))
                    .education(List.of(
                        AtsCandidateEducation.builder()
                            .degree("emphasize tricky")
                            .endAt(OffsetDateTime.parse("1978-04-14T07:58:36.326Z"))
                            .fieldOfStudy("curtus")
                            .institution("Abbott - Batz")
                            .level("phd")
                            .startAt(OffsetDateTime.parse("1994-06-09T13:31:39.059Z"))
                            .build(),
                        AtsCandidateEducation.builder()
                            .degree("blah cappelletti")
                            .endAt(OffsetDateTime.parse("1989-09-06T03:32:39.901Z"))
                            .fieldOfStudy("crustulum")
                            .institution("Herman, Franey and Lebsack")
                            .level("highschool")
                            .startAt(OffsetDateTime.parse("1992-11-28T20:23:20.311Z"))
                            .build()))
                    .emails(List.of(
                        AtsEmail.builder()
                            .email("ardith.beatty@outlook.com")
                            .name("Ardith Beatty")
                            .type(AtsEmailType.HOME)
                            .build()))
                    .experiences(List.of(
                        AtsCandidateExperience.builder()
                            .companyName("Kutch, Lind and Marks")
                            .endAt(OffsetDateTime.parse("1974-03-01T17:02:58.824Z"))
                            .startAt(OffsetDateTime.parse("1999-09-21T22:12:51.663Z"))
                            .title("Lead Security Technician")
                            .build(),
                        AtsCandidateExperience.builder()
                            .companyName("Trantow, Sipes and Witting")
                            .endAt(OffsetDateTime.parse("2004-10-14T14:01:00.717Z"))
                            .startAt(OffsetDateTime.parse("1996-12-15T04:12:04.582Z"))
                            .title("Regional Applications Planner")
                            .build()))
                    .firstName("Ardith")
                    .id("fce9aa30-b3fc-4f5c-bd4e-25a951f557ae")
                    .imageUrl("https://avatars.githubusercontent.com/u/27464445")
                    .jobIds(List.of())
                    .lastName("Beatty")
                    .linkUrls(List.of(
                        "https://www.linkedin.com/in/ardith-beatty"))
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("3940c875-a6c1-4c1e-9533-79370e17c17c")
                            .namespace("custom")
                            .slug("custom_field")
                            .value(AtsMetadataValue.of("officia"))
                            .build()))
                    .name("Ardith Beatty")
                    .origin(Origin.AGENCY)
                    .skills(List.of(
                        "trepide",
                        "voveo"))
                    .sources(List.of(
                        "vesper",
                        "utroque"))
                    .summary("Laborum trado carcer delibero patruus totam. Vita cohors cariosus trans denego barba rerum similique. Templum totam suus voluptatem cui depraedor virgo cui comminor commodi.")
                    .tags(List.of(
                        "voro"))
                    .telephones(List.of(
                        AtsTelephone.builder()
                            .telephone("(837) 251-3896")
                            .type(AtsTelephoneType.MOBILE)
                            .build()))
                    .title("Customer Division Producer")
                    .updatedAt(OffsetDateTime.parse("2024-04-28T17:47:53.883Z"))
                    .webUrl("https://fragrant-husband.net/")
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