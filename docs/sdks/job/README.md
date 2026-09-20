# Job

## Overview

### Available Operations

* [createAtsJob](#createatsjob) - Create a job
* [getAtsJob](#getatsjob) - Retrieve a job
* [listAtsJobs](#listatsjobs) - List all jobs
* [patchAtsJob](#patchatsjob) - Update a job
* [removeAtsJob](#removeatsjob) - Remove a job
* [updateAtsJob](#updateatsjob) - Update a job

## createAtsJob

Create a job

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsJob" method="post" path="/ats/{connection_id}/job" example="ats_job" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsJobRequest;
import to.unified.unified_java_sdk.models.operations.CreateAtsJobResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsJobRequest req = CreateAtsJobRequest.builder()
                .atsJob(AtsJob.builder()
                    .addresses(List.of(
                        AtsAddress.builder()
                            .address1("98097 Carlo Trail")
                            .city("South Judd")
                            .countryCode("US")
                            .postalCode("89776-0669")
                            .region("Mississippi")
                            .regionCode("FL")
                            .build()))
                    .compensation(List.of(
                        AtsCompensation.builder()
                            .currency("AUD")
                            .frequency(Frequency.DAY)
                            .max(174303d)
                            .min(174042d)
                            .type(AtsCompensationType.BONUS)
                            .build(),
                        AtsCompensation.builder()
                            .currency("MZN")
                            .frequency(Frequency.MONTH)
                            .max(171171d)
                            .min(151975d)
                            .type(AtsCompensationType.SALARY)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2023-06-16T12:51:44.518Z"))
                    .description("Global")
                    .employmentType(EmploymentType.FREELANCE)
                    .hiringManagers(List.of(
                        AtsReference.builder()
                            .id("fd9852e3-9035-4f42-beb3-bbf4e4022122")
                            .name("Eloise Mueller PhD")
                            .build()))
                    .id("9f710c4d-b0db-40ce-a514-29f4b47daf4f")
                    .industry("Gorgeous Plastic Computer")
                    .languageLocale("en")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(AtsMetadataFormat.TEXT)
                            .id("daf6c06f-3f1a-4dad-a86d-31d5787e27ad")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(AtsMetadataValue.of("acceptus"))
                            .build()))
                    .minimumDegree("Bachelor")
                    .minimumExperienceYears(3d)
                    .name("Forward Brand Producer")
                    .numberOfOpenings(1d)
                    .openings(List.of(
                        AtsJobOpening.builder()
                            .closeReason("Admoveo trado textilis.")
                            .openedAt(OffsetDateTime.parse("2026-05-11T08:38:07.983Z"))
                            .status(AtsJobOpeningStatus.OPEN)
                            .build()))
                    .postings(List.of(
                        AtsJobPosting.builder()
                            .address(PropertyAtsJobPostingAddress.builder()
                                .address1("8460 Nils Trace")
                                .city("West Mervinburgh")
                                .countryCode("US")
                                .postalCode("14162")
                                .region("Maine")
                                .regionCode("MO")
                                .build())
                            .createdAt(OffsetDateTime.parse("2026-07-04T02:09:17.952Z"))
                            .description("Deduco cultellus alii terebro depono thesaurus.")
                            .id("f6101769-deb3-4721-978c-d205638870ee")
                            .isActive(false)
                            .location("6788 Oxford Road")
                            .name("Forward Security Orchestrator")
                            .postingUrl("https://ajar-metabolite.net/")
                            .updatedAt(OffsetDateTime.parse("2026-07-29T17:32:59.773Z"))
                            .build()))
                    .publicJobUrls(List.of(
                        "https://trustworthy-elver.info",
                        "https://parched-dash.info"))
                    .questions(List.of(
                        AtsJobQuestion.builder()
                            .question("Sodalitas nemo natus attonbitus reprehenderit voro depono constans vehemens ante.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Trepide provident taceo rem.")
                            .id("289f27c0-311c-41e5-ad9d-cbe2097332c2")
                            .options(List.of(
                                "censura",
                                "tum"))
                            .prompt("Spectaculum mollitia arcus compello.")
                            .required(true)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Vinitor sodalitas desino sollers viduo volo.")
                            .type(AtsJobQuestionType.TEXT)
                            .id("b3a0b53b-38f3-4e8d-84b9-f413a900d79b")
                            .options(List.of(
                                "odit"))
                            .prompt("Similique absque temeritas celebrer enim.")
                            .required(false)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Subiungo ambitus neque talis amitto terreo alienus quae vulticulus.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Abstergo possimus quibusdam deinde amoveo.")
                            .id("568be61d-060e-4d8c-a8ab-8a17cb25edf3")
                            .options(List.of(
                                "vallum"))
                            .prompt("Ara thermae aetas vivo constans victoria volo carbo vehemens praesentium.")
                            .required(false)
                            .build()))
                    .skills(List.of(
                        "amiculum",
                        "crux"))
                    .status(AtsJobStatus.ARCHIVED)
                    .summary("Amicitia vergo hic.")
                    .updatedAt(OffsetDateTime.parse("2026-02-02T10:01:30.085Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsJobResponse res = sdk.job().createAtsJob()
                .request(req)
                .call();

        if (res.atsJob().isPresent()) {
            System.out.println(res.atsJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CreateAtsJobRequest](../../models/operations/CreateAtsJobRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CreateAtsJobResponse](../../models/operations/CreateAtsJobResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsJob

Retrieve a job

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsJob" method="get" path="/ats/{connection_id}/job/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsJobRequest;
import to.unified.unified_java_sdk.models.operations.GetAtsJobResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsJobRequest req = GetAtsJobRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsJobResponse res = sdk.job().getAtsJob()
                .request(req)
                .call();

        if (res.atsJob().isPresent()) {
            System.out.println(res.atsJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetAtsJobRequest](../../models/operations/GetAtsJobRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetAtsJobResponse](../../models/operations/GetAtsJobResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsJobs

List all jobs

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsJobs" method="get" path="/ats/{connection_id}/job" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsJobsRequest;
import to.unified.unified_java_sdk.models.operations.ListAtsJobsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsJobsRequest req = ListAtsJobsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAtsJobsResponse res = sdk.job().listAtsJobs()
                .request(req)
                .call();

        if (res.atsJobs().isPresent()) {
            System.out.println(res.atsJobs().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListAtsJobsRequest](../../models/operations/ListAtsJobsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListAtsJobsResponse](../../models/operations/ListAtsJobsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsJob

Update a job

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsJob" method="patch" path="/ats/{connection_id}/job/{id}" example="ats_job" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsJobRequest;
import to.unified.unified_java_sdk.models.operations.PatchAtsJobResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsJobRequest req = PatchAtsJobRequest.builder()
                .atsJob(AtsJob.builder()
                    .addresses(List.of(
                        AtsAddress.builder()
                            .address1("98097 Carlo Trail")
                            .city("South Judd")
                            .countryCode("US")
                            .postalCode("89776-0669")
                            .region("Mississippi")
                            .regionCode("FL")
                            .build()))
                    .compensation(List.of(
                        AtsCompensation.builder()
                            .currency("AUD")
                            .frequency(Frequency.DAY)
                            .max(174303d)
                            .min(174042d)
                            .type(AtsCompensationType.BONUS)
                            .build(),
                        AtsCompensation.builder()
                            .currency("MZN")
                            .frequency(Frequency.MONTH)
                            .max(171171d)
                            .min(151975d)
                            .type(AtsCompensationType.SALARY)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2023-06-16T12:51:44.518Z"))
                    .description("Global")
                    .employmentType(EmploymentType.FREELANCE)
                    .hiringManagers(List.of(
                        AtsReference.builder()
                            .id("fd9852e3-9035-4f42-beb3-bbf4e4022122")
                            .name("Eloise Mueller PhD")
                            .build()))
                    .id("dcf4c369-90ba-48cb-933b-dfb6712b283e")
                    .industry("Gorgeous Plastic Computer")
                    .languageLocale("en")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(AtsMetadataFormat.TEXT)
                            .id("e2c19e60-8ea1-48c7-8314-66dd683bd454")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(AtsMetadataValue.of("acceptus"))
                            .build()))
                    .minimumDegree("Bachelor")
                    .minimumExperienceYears(3d)
                    .name("Forward Brand Producer")
                    .numberOfOpenings(1d)
                    .openings(List.of(
                        AtsJobOpening.builder()
                            .closeReason("Admoveo trado textilis.")
                            .openedAt(OffsetDateTime.parse("2026-05-11T08:38:08.024Z"))
                            .status(AtsJobOpeningStatus.OPEN)
                            .build()))
                    .postings(List.of(
                        AtsJobPosting.builder()
                            .address(PropertyAtsJobPostingAddress.builder()
                                .address1("8460 Nils Trace")
                                .city("West Mervinburgh")
                                .countryCode("US")
                                .postalCode("14162")
                                .region("Maine")
                                .regionCode("MO")
                                .build())
                            .createdAt(OffsetDateTime.parse("2026-07-04T02:09:17.995Z"))
                            .description("Deduco cultellus alii terebro depono thesaurus.")
                            .id("f6101769-deb3-4721-978c-d205638870ee")
                            .isActive(false)
                            .location("6788 Oxford Road")
                            .name("Forward Security Orchestrator")
                            .postingUrl("https://ajar-metabolite.net/")
                            .updatedAt(OffsetDateTime.parse("2026-07-29T17:32:59.817Z"))
                            .build()))
                    .publicJobUrls(List.of(
                        "https://trustworthy-elver.info",
                        "https://parched-dash.info"))
                    .questions(List.of(
                        AtsJobQuestion.builder()
                            .question("Sodalitas nemo natus attonbitus reprehenderit voro depono constans vehemens ante.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Trepide provident taceo rem.")
                            .id("289f27c0-311c-41e5-ad9d-cbe2097332c2")
                            .options(List.of(
                                "censura",
                                "tum"))
                            .prompt("Spectaculum mollitia arcus compello.")
                            .required(true)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Vinitor sodalitas desino sollers viduo volo.")
                            .type(AtsJobQuestionType.TEXT)
                            .id("b3a0b53b-38f3-4e8d-84b9-f413a900d79b")
                            .options(List.of(
                                "odit"))
                            .prompt("Similique absque temeritas celebrer enim.")
                            .required(false)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Subiungo ambitus neque talis amitto terreo alienus quae vulticulus.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Abstergo possimus quibusdam deinde amoveo.")
                            .id("568be61d-060e-4d8c-a8ab-8a17cb25edf3")
                            .options(List.of(
                                "vallum"))
                            .prompt("Ara thermae aetas vivo constans victoria volo carbo vehemens praesentium.")
                            .required(false)
                            .build()))
                    .skills(List.of(
                        "amiculum",
                        "crux"))
                    .status(AtsJobStatus.ARCHIVED)
                    .summary("Amicitia vergo hic.")
                    .updatedAt(OffsetDateTime.parse("2026-02-02T10:01:30.122Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsJobResponse res = sdk.job().patchAtsJob()
                .request(req)
                .call();

        if (res.atsJob().isPresent()) {
            System.out.println(res.atsJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [PatchAtsJobRequest](../../models/operations/PatchAtsJobRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[PatchAtsJobResponse](../../models/operations/PatchAtsJobResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsJob

Remove a job

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsJob" method="delete" path="/ats/{connection_id}/job/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsJobRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAtsJobResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsJobRequest req = RemoveAtsJobRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsJobResponse res = sdk.job().removeAtsJob()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [RemoveAtsJobRequest](../../models/operations/RemoveAtsJobRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[RemoveAtsJobResponse](../../models/operations/RemoveAtsJobResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsJob

Update a job

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsJob" method="put" path="/ats/{connection_id}/job/{id}" example="ats_job" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsJobRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAtsJobResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsJobRequest req = UpdateAtsJobRequest.builder()
                .atsJob(AtsJob.builder()
                    .addresses(List.of(
                        AtsAddress.builder()
                            .address1("98097 Carlo Trail")
                            .city("South Judd")
                            .countryCode("US")
                            .postalCode("89776-0669")
                            .region("Mississippi")
                            .regionCode("FL")
                            .build()))
                    .compensation(List.of(
                        AtsCompensation.builder()
                            .currency("AUD")
                            .frequency(Frequency.DAY)
                            .max(174303d)
                            .min(174042d)
                            .type(AtsCompensationType.BONUS)
                            .build(),
                        AtsCompensation.builder()
                            .currency("MZN")
                            .frequency(Frequency.MONTH)
                            .max(171171d)
                            .min(151975d)
                            .type(AtsCompensationType.SALARY)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2023-06-16T12:51:44.518Z"))
                    .description("Global")
                    .employmentType(EmploymentType.FREELANCE)
                    .hiringManagers(List.of(
                        AtsReference.builder()
                            .id("fd9852e3-9035-4f42-beb3-bbf4e4022122")
                            .name("Eloise Mueller PhD")
                            .build()))
                    .id("dcf4c369-90ba-48cb-933b-dfb6712b283e")
                    .industry("Gorgeous Plastic Computer")
                    .languageLocale("en")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(AtsMetadataFormat.TEXT)
                            .id("e2c19e60-8ea1-48c7-8314-66dd683bd454")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(AtsMetadataValue.of("acceptus"))
                            .build()))
                    .minimumDegree("Bachelor")
                    .minimumExperienceYears(3d)
                    .name("Forward Brand Producer")
                    .numberOfOpenings(1d)
                    .openings(List.of(
                        AtsJobOpening.builder()
                            .closeReason("Admoveo trado textilis.")
                            .openedAt(OffsetDateTime.parse("2026-05-11T08:38:08.024Z"))
                            .status(AtsJobOpeningStatus.OPEN)
                            .build()))
                    .postings(List.of(
                        AtsJobPosting.builder()
                            .address(PropertyAtsJobPostingAddress.builder()
                                .address1("8460 Nils Trace")
                                .city("West Mervinburgh")
                                .countryCode("US")
                                .postalCode("14162")
                                .region("Maine")
                                .regionCode("MO")
                                .build())
                            .createdAt(OffsetDateTime.parse("2026-07-04T02:09:17.995Z"))
                            .description("Deduco cultellus alii terebro depono thesaurus.")
                            .id("f6101769-deb3-4721-978c-d205638870ee")
                            .isActive(false)
                            .location("6788 Oxford Road")
                            .name("Forward Security Orchestrator")
                            .postingUrl("https://ajar-metabolite.net/")
                            .updatedAt(OffsetDateTime.parse("2026-07-29T17:32:59.817Z"))
                            .build()))
                    .publicJobUrls(List.of(
                        "https://trustworthy-elver.info",
                        "https://parched-dash.info"))
                    .questions(List.of(
                        AtsJobQuestion.builder()
                            .question("Sodalitas nemo natus attonbitus reprehenderit voro depono constans vehemens ante.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Trepide provident taceo rem.")
                            .id("289f27c0-311c-41e5-ad9d-cbe2097332c2")
                            .options(List.of(
                                "censura",
                                "tum"))
                            .prompt("Spectaculum mollitia arcus compello.")
                            .required(true)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Vinitor sodalitas desino sollers viduo volo.")
                            .type(AtsJobQuestionType.TEXT)
                            .id("b3a0b53b-38f3-4e8d-84b9-f413a900d79b")
                            .options(List.of(
                                "odit"))
                            .prompt("Similique absque temeritas celebrer enim.")
                            .required(false)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Subiungo ambitus neque talis amitto terreo alienus quae vulticulus.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Abstergo possimus quibusdam deinde amoveo.")
                            .id("568be61d-060e-4d8c-a8ab-8a17cb25edf3")
                            .options(List.of(
                                "vallum"))
                            .prompt("Ara thermae aetas vivo constans victoria volo carbo vehemens praesentium.")
                            .required(false)
                            .build()))
                    .skills(List.of(
                        "amiculum",
                        "crux"))
                    .status(AtsJobStatus.ARCHIVED)
                    .summary("Amicitia vergo hic.")
                    .updatedAt(OffsetDateTime.parse("2026-02-02T10:01:30.122Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsJobResponse res = sdk.job().updateAtsJob()
                .request(req)
                .call();

        if (res.atsJob().isPresent()) {
            System.out.println(res.atsJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [UpdateAtsJobRequest](../../models/operations/UpdateAtsJobRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[UpdateAtsJobResponse](../../models/operations/UpdateAtsJobResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |