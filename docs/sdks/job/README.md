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

Creates a AtsJob. Provide the unified AtsJob fields in the request body; they are mapped to the provider's API. Returns the created AtsJob.

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
                            .address1("458 E 8th Street")
                            .city("Visalia")
                            .countryCode("US")
                            .postalCode("60669-0678")
                            .region("Oregon")
                            .regionCode("DE")
                            .build()))
                    .compensation(List.of(
                        AtsCompensation.builder()
                            .currency("GBP")
                            .frequency(Frequency.DAY)
                            .max(174303d)
                            .min(174042d)
                            .type(AtsCompensationType.BONUS)
                            .build(),
                        AtsCompensation.builder()
                            .currency("KMF")
                            .frequency(Frequency.MONTH)
                            .max(171171d)
                            .min(151975d)
                            .type(AtsCompensationType.SALARY)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2023-06-16T12:51:44.518Z"))
                    .description("Senior")
                    .employmentType(EmploymentType.FREELANCE)
                    .fees(List.of(
                        AtsFee.builder()
                            .amount(35146d)
                            .currency("AFN")
                            .type(AtsFeeType.CONTINGENCY)
                            .build()))
                    .hiringManagers(List.of())
                    .id("daa7ab90-c775-49a3-b66a-7ac7d276c175")
                    .industry("Refined Ceramic Keyboard")
                    .languageLocale("en")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(AtsMetadataFormat.TEXT)
                            .id("5728b6a3-ca60-48e5-9e3c-97a7a1a0ff1d")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(AtsMetadataValue.of("cursus"))
                            .build()))
                    .minimumDegree("Bachelor")
                    .minimumExperienceYears(3d)
                    .name("Senior Interactions Developer")
                    .numberOfOpenings(1d)
                    .openings(List.of(
                        AtsJobOpening.builder()
                            .closeReason("Tolero aequus tamquam inflammatio asporto canis vinitor utrum.")
                            .openedAt(OffsetDateTime.parse("2026-07-09T20:57:55.054Z"))
                            .status(AtsJobOpeningStatus.OPEN)
                            .build()))
                    .postings(List.of(
                        AtsJobPosting.builder()
                            .address(PropertyAtsJobPostingAddress.builder()
                                .address1("295 First Street")
                                .city("East Agustinton")
                                .countryCode("US")
                                .postalCode("57059")
                                .region("Utah")
                                .regionCode("NE")
                                .build())
                            .createdAt(OffsetDateTime.parse("2026-09-04T14:53:48.754Z"))
                            .description("Sublime.")
                            .id("0cbbd6aa-f2bb-41d8-b55b-b918b682150f")
                            .isActive(false)
                            .location("5699 Purdy Motorway")
                            .name("Legacy Implementation Orchestrator")
                            .postingUrl("https://elementary-privilege.com/")
                            .updatedAt(OffsetDateTime.parse("2026-10-01T16:50:56.185Z"))
                            .build()))
                    .publicJobUrls(List.of(
                        "https://parched-dash.info",
                        "https://mild-midwife.org/"))
                    .questions(List.of(
                        AtsJobQuestion.builder()
                            .question("Deporto tolero.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Capitulus.")
                            .id("d8c60a1f-4347-4a36-aff3-894bb9a7ba7d")
                            .maxLength(214d)
                            .minLength(1d)
                            .options(List.of(
                                "aetas",
                                "vado"))
                            .prompt("Agnosco tendo.")
                            .required(true)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Maxime tres tergiversatio tactus vehemens architecto ab nam defetiscor.")
                            .type(AtsJobQuestionType.TEXT)
                            .id("8c588c63-610d-4bea-9abe-f25922a4034e")
                            .maxLength(309d)
                            .minLength(1d)
                            .options(List.of(
                                "sodalitas"))
                            .prompt("Supra veritatis.")
                            .required(false)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Attonbitus reprehenderit voro depono constans vehemens.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Confero trepide.")
                            .id("95bf4f8c-9a07-45e7-93d4-52d83e4f8430")
                            .maxLength(428d)
                            .minLength(1d)
                            .options(List.of(
                                "censura"))
                            .prompt("Taceo rem compello spectaculum mollitia arcus compello.")
                            .required(false)
                            .build()))
                    .skills(List.of(
                        "similique",
                        "absque"))
                    .status(AtsJobStatus.ARCHIVED)
                    .summary("Contra damno desolo suadeo utrimque cresco aetas turpis.")
                    .updatedAt(OffsetDateTime.parse("2026-03-28T10:21:27.790Z"))
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

Creates a HrisJob. Provide the unified HrisJob fields in the request body; they are mapped to the provider's API. Returns the created HrisJob.

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
                    .code("P-54753")
                    .createdAt(OffsetDateTime.parse("2020-10-28T01:13:19.491Z"))
                    .description("Bonus vobis creator tabella callide cavus triumphus caveo abbas patria.")
                    .employmentType(HrisJobEmploymentType.FREELANCE)
                    .id("e28eac7c-57bc-40e0-be08-81600e15544f")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Customer Security Assistant")
                    .updatedAt(OffsetDateTime.parse("2023-02-12T18:55:55.150Z"))
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

Retrieves a single AtsJob by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single HrisJob by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Returns a list of AtsJobs. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of HrisJobs. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Updates the AtsJob identified by `id`. Provide the unified AtsJob fields to change in the request body.

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
                            .address1("458 E 8th Street")
                            .city("Visalia")
                            .countryCode("US")
                            .postalCode("60669-0678")
                            .region("Oregon")
                            .regionCode("DE")
                            .build()))
                    .compensation(List.of(
                        AtsCompensation.builder()
                            .currency("GBP")
                            .frequency(Frequency.DAY)
                            .max(174303d)
                            .min(174042d)
                            .type(AtsCompensationType.BONUS)
                            .build(),
                        AtsCompensation.builder()
                            .currency("KMF")
                            .frequency(Frequency.MONTH)
                            .max(171171d)
                            .min(151975d)
                            .type(AtsCompensationType.SALARY)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2023-06-16T12:51:44.518Z"))
                    .description("Senior")
                    .employmentType(EmploymentType.FREELANCE)
                    .fees(List.of(
                        AtsFee.builder()
                            .amount(35146d)
                            .currency("AFN")
                            .type(AtsFeeType.CONTINGENCY)
                            .build()))
                    .hiringManagers(List.of())
                    .id("6328e86a-60fe-4008-a9f3-0976968c6a0e")
                    .industry("Refined Ceramic Keyboard")
                    .languageLocale("en")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(AtsMetadataFormat.TEXT)
                            .id("72a25d72-2479-4860-9a3b-2f3bb36dc016")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(AtsMetadataValue.of("cursus"))
                            .build()))
                    .minimumDegree("Bachelor")
                    .minimumExperienceYears(3d)
                    .name("Senior Interactions Developer")
                    .numberOfOpenings(1d)
                    .openings(List.of(
                        AtsJobOpening.builder()
                            .closeReason("Tolero aequus tamquam inflammatio asporto canis vinitor utrum.")
                            .openedAt(OffsetDateTime.parse("2026-07-09T20:57:55.087Z"))
                            .status(AtsJobOpeningStatus.OPEN)
                            .build()))
                    .postings(List.of(
                        AtsJobPosting.builder()
                            .address(PropertyAtsJobPostingAddress.builder()
                                .address1("295 First Street")
                                .city("East Agustinton")
                                .countryCode("US")
                                .postalCode("57059")
                                .region("Utah")
                                .regionCode("NE")
                                .build())
                            .createdAt(OffsetDateTime.parse("2026-09-04T14:53:48.788Z"))
                            .description("Sublime.")
                            .id("a5a45011-1d07-43c9-8a33-8052d900a31b")
                            .isActive(false)
                            .location("5699 Purdy Motorway")
                            .name("Legacy Implementation Orchestrator")
                            .postingUrl("https://elementary-privilege.com/")
                            .updatedAt(OffsetDateTime.parse("2026-10-01T16:50:56.221Z"))
                            .build()))
                    .publicJobUrls(List.of(
                        "https://parched-dash.info",
                        "https://mild-midwife.org/"))
                    .questions(List.of(
                        AtsJobQuestion.builder()
                            .question("Deporto tolero.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Capitulus.")
                            .id("0158e41d-91a8-4154-b0f3-4b8b36b748d0")
                            .maxLength(214d)
                            .minLength(1d)
                            .options(List.of(
                                "aetas",
                                "vado"))
                            .prompt("Agnosco tendo.")
                            .required(true)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Maxime tres tergiversatio tactus vehemens architecto ab nam defetiscor.")
                            .type(AtsJobQuestionType.TEXT)
                            .id("2ec52267-8db6-417e-8c5b-f5669cdf9cff")
                            .maxLength(309d)
                            .minLength(1d)
                            .options(List.of(
                                "sodalitas"))
                            .prompt("Supra veritatis.")
                            .required(false)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Attonbitus reprehenderit voro depono constans vehemens.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Confero trepide.")
                            .id("1863e135-77ae-470c-a038-fbebc596aa77")
                            .maxLength(428d)
                            .minLength(1d)
                            .options(List.of(
                                "censura"))
                            .prompt("Taceo rem compello spectaculum mollitia arcus compello.")
                            .required(false)
                            .build()))
                    .skills(List.of(
                        "similique",
                        "absque"))
                    .status(AtsJobStatus.ARCHIVED)
                    .summary("Contra damno desolo suadeo utrimque cresco aetas turpis.")
                    .updatedAt(OffsetDateTime.parse("2026-03-28T10:21:27.820Z"))
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

Updates the HrisJob identified by `id`. Provide the unified HrisJob fields to change in the request body.

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
                    .code("P-54753")
                    .createdAt(OffsetDateTime.parse("2020-10-28T01:13:19.491Z"))
                    .description("Bonus vobis creator tabella callide cavus triumphus caveo abbas patria.")
                    .employmentType(HrisJobEmploymentType.FREELANCE)
                    .id("8145f721-c98e-48f3-aadb-78d48f2493a4")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Customer Security Assistant")
                    .updatedAt(OffsetDateTime.parse("2023-02-12T18:55:55.192Z"))
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

Deletes the AtsJob identified by `id`.

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

Deletes the HrisJob identified by `id`.

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

Updates the AtsJob identified by `id`. Provide the unified AtsJob fields to change in the request body.

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
                            .address1("458 E 8th Street")
                            .city("Visalia")
                            .countryCode("US")
                            .postalCode("60669-0678")
                            .region("Oregon")
                            .regionCode("DE")
                            .build()))
                    .compensation(List.of(
                        AtsCompensation.builder()
                            .currency("GBP")
                            .frequency(Frequency.DAY)
                            .max(174303d)
                            .min(174042d)
                            .type(AtsCompensationType.BONUS)
                            .build(),
                        AtsCompensation.builder()
                            .currency("KMF")
                            .frequency(Frequency.MONTH)
                            .max(171171d)
                            .min(151975d)
                            .type(AtsCompensationType.SALARY)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2023-06-16T12:51:44.518Z"))
                    .description("Senior")
                    .employmentType(EmploymentType.FREELANCE)
                    .fees(List.of(
                        AtsFee.builder()
                            .amount(35146d)
                            .currency("AFN")
                            .type(AtsFeeType.CONTINGENCY)
                            .build()))
                    .hiringManagers(List.of())
                    .id("6328e86a-60fe-4008-a9f3-0976968c6a0e")
                    .industry("Refined Ceramic Keyboard")
                    .languageLocale("en")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(AtsMetadataFormat.TEXT)
                            .id("72a25d72-2479-4860-9a3b-2f3bb36dc016")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(AtsMetadataValue.of("cursus"))
                            .build()))
                    .minimumDegree("Bachelor")
                    .minimumExperienceYears(3d)
                    .name("Senior Interactions Developer")
                    .numberOfOpenings(1d)
                    .openings(List.of(
                        AtsJobOpening.builder()
                            .closeReason("Tolero aequus tamquam inflammatio asporto canis vinitor utrum.")
                            .openedAt(OffsetDateTime.parse("2026-07-09T20:57:55.087Z"))
                            .status(AtsJobOpeningStatus.OPEN)
                            .build()))
                    .postings(List.of(
                        AtsJobPosting.builder()
                            .address(PropertyAtsJobPostingAddress.builder()
                                .address1("295 First Street")
                                .city("East Agustinton")
                                .countryCode("US")
                                .postalCode("57059")
                                .region("Utah")
                                .regionCode("NE")
                                .build())
                            .createdAt(OffsetDateTime.parse("2026-09-04T14:53:48.788Z"))
                            .description("Sublime.")
                            .id("a5a45011-1d07-43c9-8a33-8052d900a31b")
                            .isActive(false)
                            .location("5699 Purdy Motorway")
                            .name("Legacy Implementation Orchestrator")
                            .postingUrl("https://elementary-privilege.com/")
                            .updatedAt(OffsetDateTime.parse("2026-10-01T16:50:56.221Z"))
                            .build()))
                    .publicJobUrls(List.of(
                        "https://parched-dash.info",
                        "https://mild-midwife.org/"))
                    .questions(List.of(
                        AtsJobQuestion.builder()
                            .question("Deporto tolero.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Capitulus.")
                            .id("0158e41d-91a8-4154-b0f3-4b8b36b748d0")
                            .maxLength(214d)
                            .minLength(1d)
                            .options(List.of(
                                "aetas",
                                "vado"))
                            .prompt("Agnosco tendo.")
                            .required(true)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Maxime tres tergiversatio tactus vehemens architecto ab nam defetiscor.")
                            .type(AtsJobQuestionType.TEXT)
                            .id("2ec52267-8db6-417e-8c5b-f5669cdf9cff")
                            .maxLength(309d)
                            .minLength(1d)
                            .options(List.of(
                                "sodalitas"))
                            .prompt("Supra veritatis.")
                            .required(false)
                            .build(),
                        AtsJobQuestion.builder()
                            .question("Attonbitus reprehenderit voro depono constans vehemens.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Confero trepide.")
                            .id("1863e135-77ae-470c-a038-fbebc596aa77")
                            .maxLength(428d)
                            .minLength(1d)
                            .options(List.of(
                                "censura"))
                            .prompt("Taceo rem compello spectaculum mollitia arcus compello.")
                            .required(false)
                            .build()))
                    .skills(List.of(
                        "similique",
                        "absque"))
                    .status(AtsJobStatus.ARCHIVED)
                    .summary("Contra damno desolo suadeo utrimque cresco aetas turpis.")
                    .updatedAt(OffsetDateTime.parse("2026-03-28T10:21:27.820Z"))
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

Updates the HrisJob identified by `id`. Provide the unified HrisJob fields to change in the request body.

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
                    .code("P-54753")
                    .createdAt(OffsetDateTime.parse("2020-10-28T01:13:19.491Z"))
                    .description("Bonus vobis creator tabella callide cavus triumphus caveo abbas patria.")
                    .employmentType(HrisJobEmploymentType.FREELANCE)
                    .id("8145f721-c98e-48f3-aadb-78d48f2493a4")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Customer Security Assistant")
                    .updatedAt(OffsetDateTime.parse("2023-02-12T18:55:55.192Z"))
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