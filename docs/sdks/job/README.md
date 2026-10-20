# Job

## Overview

### Available Operations

* [createAtsJob](#createatsjob) - Create a job
* [createHrisJob](#createhrisjob) - Create a job
* [getAtsJob](#getatsjob) - Retrieve a job
* [getHrisJob](#gethrisjob) - Retrieve a job
* [listAtsJobs](#listatsjobs) - List all jobs
* [listHrisJobs](#listhrisjobs) - List all jobs
* [patchAtsJob](#patchatsjob) - Update a job
* [patchHrisJob](#patchhrisjob) - Update a job
* [removeAtsJob](#removeatsjob) - Remove a job
* [removeHrisJob](#removehrisjob) - Remove a job
* [updateAtsJob](#updateatsjob) - Update a job
* [updateHrisJob](#updatehrisjob) - Update a job

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
                    .hiringManagers(List.of())
                    .id("342641ed-49e8-4524-9eb1-8fb32ff6efcb")
                    .industry("Handcrafted Bamboo Soap")
                    .languageLocale("en")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(AtsMetadataFormat.TEXT)
                            .id("fad399d2-f3c8-4dde-b0d6-a8dcb92dfb4f")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(AtsMetadataValue.of("desolo"))
                            .build()))
                    .minimumDegree("Bachelor")
                    .minimumExperienceYears(3d)
                    .name("Forward Brand Producer")
                    .numberOfOpenings(1d)
                    .openings(List.of(
                        AtsJobOpening.builder()
                            .closeReason("Admoveo trado textilis.")
                            .openedAt(OffsetDateTime.parse("2026-06-06T19:39:20.799Z"))
                            .status(AtsJobOpeningStatus.OPEN)
                            .build()))
                    .postings(List.of(
                        AtsJobPosting.builder()
                            .address(PropertyAtsJobPostingAddress.builder()
                                .address1("75008 Medhurst Road")
                                .city("Madelynnshire")
                                .countryCode("US")
                                .postalCode("98754")
                                .region("Wisconsin")
                                .regionCode("CO")
                                .build())
                            .createdAt(OffsetDateTime.parse("2026-07-31T21:22:07.985Z"))
                            .description("Beatus eum volutabrum balbus victus ipsa tubineus claustrum.")
                            .id("c9717b92-4baf-4889-bd14-8e4a20b37ffb")
                            .isActive(false)
                            .location("1725 Hessel Keys")
                            .name("International Identity Manager")
                            .postingUrl("https://obedient-yak.com")
                            .updatedAt(OffsetDateTime.parse("2026-08-27T04:07:39.219Z"))
                            .build()))
                    .publicJobUrls(List.of(
                        "https://trustworthy-elver.info",
                        "https://parched-dash.info"))
                    .questions(List.of(
                        AtsJobQuestion.builder()
                            .question("Doloribus mollitia.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Auctus deporto tolero administratio capitulus animi agnosco tendo aetas vado.")
                            .id("9d9edeba-64fc-402b-8ed5-1c57bc28c402")
                            .maxLength(117d)
                            .minLength(1d)
                            .options(List.of(
                                "tactus",
                                "vehemens"))
                            .prompt("Totam maxime tres tergiversatio.")
                            .required(true)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Nam.")
                            .type(AtsJobQuestionType.TEXT)
                            .id("96981708-ae65-40b9-b4ac-5b730b679dea")
                            .maxLength(453d)
                            .minLength(1d)
                            .options(List.of(
                                "constans"))
                            .prompt("Veritatis sodalitas nemo natus attonbitus reprehenderit voro depono.")
                            .required(false)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Confero trepide.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Taceo rem compello spectaculum mollitia arcus compello.")
                            .id("bfff098b-bd96-4ab5-b134-5e4890c29216")
                            .maxLength(66d)
                            .minLength(1d)
                            .options(List.of(
                                "repellendus"))
                            .prompt("Tum tamisium autus.")
                            .required(false)
                            .build()))
                    .skills(List.of(
                        "suadeo",
                        "utrimque"))
                    .status(AtsJobStatus.ARCHIVED)
                    .summary("Crepusculum adsuesco vere.")
                    .updatedAt(OffsetDateTime.parse("2026-02-26T10:21:38.758Z"))
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

## createHrisJob

Create a job

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisJob" method="post" path="/hris/{connection_id}/job" example="hris_job" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisJobRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisJobResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisJobRequest req = CreateHrisJobRequest.builder()
                .hrisJob(HrisJob.builder()
                    .code("P-05547")
                    .createdAt(OffsetDateTime.parse("2020-10-28T01:13:19.491Z"))
                    .description("Alienus timor depromo bonus vobis creator tabella callide cavus triumphus caveo.")
                    .employmentType(HrisJobEmploymentType.FREELANCE)
                    .id("8f48608d-59ed-444f-b906-57cc80ff5fbc")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Internal Integration Specialist")
                    .updatedAt(OffsetDateTime.parse("2023-01-29T18:21:35.120Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisJobResponse res = sdk.job().createHrisJob()
                .request(req)
                .call();

        if (res.hrisJob().isPresent()) {
            System.out.println(res.hrisJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreateHrisJobRequest](../../models/operations/CreateHrisJobRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateHrisJobResponse](../../models/operations/CreateHrisJobResponse.md)**

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

## getHrisJob

Retrieve a job

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisJob" method="get" path="/hris/{connection_id}/job/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisJobRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisJobResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisJobRequest req = GetHrisJobRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisJobResponse res = sdk.job().getHrisJob()
                .request(req)
                .call();

        if (res.hrisJob().isPresent()) {
            System.out.println(res.hrisJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetHrisJobRequest](../../models/operations/GetHrisJobRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetHrisJobResponse](../../models/operations/GetHrisJobResponse.md)**

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

## listHrisJobs

List all jobs

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisJobs" method="get" path="/hris/{connection_id}/job" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisJobsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisJobsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisJobsRequest req = ListHrisJobsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisJobsResponse res = sdk.job().listHrisJobs()
                .request(req)
                .call();

        if (res.hrisJobs().isPresent()) {
            System.out.println(res.hrisJobs().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListHrisJobsRequest](../../models/operations/ListHrisJobsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListHrisJobsResponse](../../models/operations/ListHrisJobsResponse.md)**

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
                    .hiringManagers(List.of())
                    .id("6ab75b1e-dacb-4ecd-aa81-c1ddfa778183")
                    .industry("Handcrafted Bamboo Soap")
                    .languageLocale("en")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(AtsMetadataFormat.TEXT)
                            .id("92e2c3f6-8f16-4cc6-9dd8-7f8b2813544f")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(AtsMetadataValue.of("desolo"))
                            .build()))
                    .minimumDegree("Bachelor")
                    .minimumExperienceYears(3d)
                    .name("Forward Brand Producer")
                    .numberOfOpenings(1d)
                    .openings(List.of(
                        AtsJobOpening.builder()
                            .closeReason("Admoveo trado textilis.")
                            .openedAt(OffsetDateTime.parse("2026-06-06T19:39:20.863Z"))
                            .status(AtsJobOpeningStatus.OPEN)
                            .build()))
                    .postings(List.of(
                        AtsJobPosting.builder()
                            .address(PropertyAtsJobPostingAddress.builder()
                                .address1("75008 Medhurst Road")
                                .city("Madelynnshire")
                                .countryCode("US")
                                .postalCode("98754")
                                .region("Wisconsin")
                                .regionCode("CO")
                                .build())
                            .createdAt(OffsetDateTime.parse("2026-07-31T21:22:08.053Z"))
                            .description("Beatus eum volutabrum balbus victus ipsa tubineus claustrum.")
                            .id("db679e44-7a87-4848-983a-6cc4b6ee529d")
                            .isActive(false)
                            .location("1725 Hessel Keys")
                            .name("International Identity Manager")
                            .postingUrl("https://obedient-yak.com")
                            .updatedAt(OffsetDateTime.parse("2026-08-27T04:07:39.288Z"))
                            .build()))
                    .publicJobUrls(List.of(
                        "https://trustworthy-elver.info",
                        "https://parched-dash.info"))
                    .questions(List.of(
                        AtsJobQuestion.builder()
                            .question("Doloribus mollitia.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Auctus deporto tolero administratio capitulus animi agnosco tendo aetas vado.")
                            .id("15049eac-98d8-4f64-adb8-45f72f8ca200")
                            .maxLength(117d)
                            .minLength(1d)
                            .options(List.of(
                                "tactus",
                                "vehemens"))
                            .prompt("Totam maxime tres tergiversatio.")
                            .required(true)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Nam.")
                            .type(AtsJobQuestionType.TEXT)
                            .id("065dada3-da98-4e37-81e8-49ac69108fbc")
                            .maxLength(453d)
                            .minLength(1d)
                            .options(List.of(
                                "constans"))
                            .prompt("Veritatis sodalitas nemo natus attonbitus reprehenderit voro depono.")
                            .required(false)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Confero trepide.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Taceo rem compello spectaculum mollitia arcus compello.")
                            .id("7dd9b0eb-36ef-4909-b656-fd8c04e95bcc")
                            .maxLength(66d)
                            .minLength(1d)
                            .options(List.of(
                                "repellendus"))
                            .prompt("Tum tamisium autus.")
                            .required(false)
                            .build()))
                    .skills(List.of(
                        "suadeo",
                        "utrimque"))
                    .status(AtsJobStatus.ARCHIVED)
                    .summary("Crepusculum adsuesco vere.")
                    .updatedAt(OffsetDateTime.parse("2026-02-26T10:21:38.816Z"))
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

## patchHrisJob

Update a job

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisJob" method="patch" path="/hris/{connection_id}/job/{id}" example="hris_job" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisJobRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisJobResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisJobRequest req = PatchHrisJobRequest.builder()
                .hrisJob(HrisJob.builder()
                    .code("P-05547")
                    .createdAt(OffsetDateTime.parse("2020-10-28T01:13:19.491Z"))
                    .description("Alienus timor depromo bonus vobis creator tabella callide cavus triumphus caveo.")
                    .employmentType(HrisJobEmploymentType.FREELANCE)
                    .id("4fcbf9ed-afc0-46ee-aee8-ed4f2f5787c6")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Internal Integration Specialist")
                    .updatedAt(OffsetDateTime.parse("2023-01-29T18:21:35.186Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisJobResponse res = sdk.job().patchHrisJob()
                .request(req)
                .call();

        if (res.hrisJob().isPresent()) {
            System.out.println(res.hrisJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [PatchHrisJobRequest](../../models/operations/PatchHrisJobRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PatchHrisJobResponse](../../models/operations/PatchHrisJobResponse.md)**

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

## removeHrisJob

Remove a job

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisJob" method="delete" path="/hris/{connection_id}/job/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisJobRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisJobResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisJobRequest req = RemoveHrisJobRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisJobResponse res = sdk.job().removeHrisJob()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [RemoveHrisJobRequest](../../models/operations/RemoveHrisJobRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[RemoveHrisJobResponse](../../models/operations/RemoveHrisJobResponse.md)**

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
                    .hiringManagers(List.of())
                    .id("6ab75b1e-dacb-4ecd-aa81-c1ddfa778183")
                    .industry("Handcrafted Bamboo Soap")
                    .languageLocale("en")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(AtsMetadataFormat.TEXT)
                            .id("92e2c3f6-8f16-4cc6-9dd8-7f8b2813544f")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(AtsMetadataValue.of("desolo"))
                            .build()))
                    .minimumDegree("Bachelor")
                    .minimumExperienceYears(3d)
                    .name("Forward Brand Producer")
                    .numberOfOpenings(1d)
                    .openings(List.of(
                        AtsJobOpening.builder()
                            .closeReason("Admoveo trado textilis.")
                            .openedAt(OffsetDateTime.parse("2026-06-06T19:39:20.863Z"))
                            .status(AtsJobOpeningStatus.OPEN)
                            .build()))
                    .postings(List.of(
                        AtsJobPosting.builder()
                            .address(PropertyAtsJobPostingAddress.builder()
                                .address1("75008 Medhurst Road")
                                .city("Madelynnshire")
                                .countryCode("US")
                                .postalCode("98754")
                                .region("Wisconsin")
                                .regionCode("CO")
                                .build())
                            .createdAt(OffsetDateTime.parse("2026-07-31T21:22:08.053Z"))
                            .description("Beatus eum volutabrum balbus victus ipsa tubineus claustrum.")
                            .id("db679e44-7a87-4848-983a-6cc4b6ee529d")
                            .isActive(false)
                            .location("1725 Hessel Keys")
                            .name("International Identity Manager")
                            .postingUrl("https://obedient-yak.com")
                            .updatedAt(OffsetDateTime.parse("2026-08-27T04:07:39.288Z"))
                            .build()))
                    .publicJobUrls(List.of(
                        "https://trustworthy-elver.info",
                        "https://parched-dash.info"))
                    .questions(List.of(
                        AtsJobQuestion.builder()
                            .question("Doloribus mollitia.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Auctus deporto tolero administratio capitulus animi agnosco tendo aetas vado.")
                            .id("15049eac-98d8-4f64-adb8-45f72f8ca200")
                            .maxLength(117d)
                            .minLength(1d)
                            .options(List.of(
                                "tactus",
                                "vehemens"))
                            .prompt("Totam maxime tres tergiversatio.")
                            .required(true)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Nam.")
                            .type(AtsJobQuestionType.TEXT)
                            .id("065dada3-da98-4e37-81e8-49ac69108fbc")
                            .maxLength(453d)
                            .minLength(1d)
                            .options(List.of(
                                "constans"))
                            .prompt("Veritatis sodalitas nemo natus attonbitus reprehenderit voro depono.")
                            .required(false)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Confero trepide.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Taceo rem compello spectaculum mollitia arcus compello.")
                            .id("7dd9b0eb-36ef-4909-b656-fd8c04e95bcc")
                            .maxLength(66d)
                            .minLength(1d)
                            .options(List.of(
                                "repellendus"))
                            .prompt("Tum tamisium autus.")
                            .required(false)
                            .build()))
                    .skills(List.of(
                        "suadeo",
                        "utrimque"))
                    .status(AtsJobStatus.ARCHIVED)
                    .summary("Crepusculum adsuesco vere.")
                    .updatedAt(OffsetDateTime.parse("2026-02-26T10:21:38.816Z"))
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

## updateHrisJob

Update a job

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisJob" method="put" path="/hris/{connection_id}/job/{id}" example="hris_job" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisJobRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisJobResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisJobRequest req = UpdateHrisJobRequest.builder()
                .hrisJob(HrisJob.builder()
                    .code("P-05547")
                    .createdAt(OffsetDateTime.parse("2020-10-28T01:13:19.491Z"))
                    .description("Alienus timor depromo bonus vobis creator tabella callide cavus triumphus caveo.")
                    .employmentType(HrisJobEmploymentType.FREELANCE)
                    .id("4fcbf9ed-afc0-46ee-aee8-ed4f2f5787c6")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Internal Integration Specialist")
                    .updatedAt(OffsetDateTime.parse("2023-01-29T18:21:35.186Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisJobResponse res = sdk.job().updateHrisJob()
                .request(req)
                .call();

        if (res.hrisJob().isPresent()) {
            System.out.println(res.hrisJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdateHrisJobRequest](../../models/operations/UpdateHrisJobRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdateHrisJobResponse](../../models/operations/UpdateHrisJobResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |