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
                    .id("5acddcab-79a8-4047-bbfe-b3a7d1029880")
                    .industry("Refined Ceramic Keyboard")
                    .languageLocale("en")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(AtsMetadataFormat.TEXT)
                            .id("69bb0a80-be1f-47dd-9baf-c6d7005a17fe")
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
                            .openedAt(OffsetDateTime.parse("2026-07-11T16:42:24.760Z"))
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
                            .createdAt(OffsetDateTime.parse("2026-09-06T12:51:21.715Z"))
                            .description("Sublime.")
                            .id("8ea24e7a-de2e-4dc1-a170-030d5880cbf8")
                            .isActive(false)
                            .location("5699 Purdy Motorway")
                            .name("Legacy Implementation Orchestrator")
                            .postingUrl("https://elementary-privilege.com/")
                            .updatedAt(OffsetDateTime.parse("2026-10-03T15:51:58.980Z"))
                            .build()))
                    .publicJobUrls(List.of(
                        "https://parched-dash.info",
                        "https://mild-midwife.org/"))
                    .questions(List.of(
                        AtsJobQuestion.builder()
                            .question("Deporto tolero.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Capitulus.")
                            .id("b39b5ef7-0c54-4b58-ad8f-37b4e1334eb7")
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
                            .id("db00fdd5-80f5-402f-b49b-b3f08f2fdcc4")
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
                            .id("2127348e-7bc1-4a7c-a48b-01c86b5e562a")
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
                    .updatedAt(OffsetDateTime.parse("2026-03-30T02:03:25.158Z"))
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
                    .id("6c1f2989-6c73-44e1-a2fa-a98ab52fd856")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Customer Security Assistant")
                    .updatedAt(OffsetDateTime.parse("2023-02-13T13:29:23.782Z"))
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
                    .id("a85401c7-80a4-41bf-9695-8dc0e59ee305")
                    .industry("Refined Ceramic Keyboard")
                    .languageLocale("en")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(AtsMetadataFormat.TEXT)
                            .id("65a35313-81d4-4452-9722-734ed893c78e")
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
                            .openedAt(OffsetDateTime.parse("2026-07-11T16:42:24.796Z"))
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
                            .createdAt(OffsetDateTime.parse("2026-09-06T12:51:21.753Z"))
                            .description("Sublime.")
                            .id("9c5debd1-ed70-4d7e-9f7a-bf591fd5cec5")
                            .isActive(false)
                            .location("5699 Purdy Motorway")
                            .name("Legacy Implementation Orchestrator")
                            .postingUrl("https://elementary-privilege.com/")
                            .updatedAt(OffsetDateTime.parse("2026-10-03T15:51:59.019Z"))
                            .build()))
                    .publicJobUrls(List.of(
                        "https://parched-dash.info",
                        "https://mild-midwife.org/"))
                    .questions(List.of(
                        AtsJobQuestion.builder()
                            .question("Deporto tolero.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Capitulus.")
                            .id("c1673074-60bb-47f3-a917-a832b2a4cdc4")
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
                            .id("8a7a8fba-13c3-4287-8721-0afa38a45e39")
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
                            .id("9a452615-e0fd-48e2-892f-ae4cf9921c0c")
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
                    .updatedAt(OffsetDateTime.parse("2026-03-30T02:03:25.191Z"))
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
                    .id("b4ec7089-3423-4ff8-ab00-a4297c929949")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Customer Security Assistant")
                    .updatedAt(OffsetDateTime.parse("2023-02-13T13:29:23.831Z"))
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
                    .id("a85401c7-80a4-41bf-9695-8dc0e59ee305")
                    .industry("Refined Ceramic Keyboard")
                    .languageLocale("en")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(AtsMetadataFormat.TEXT)
                            .id("65a35313-81d4-4452-9722-734ed893c78e")
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
                            .openedAt(OffsetDateTime.parse("2026-07-11T16:42:24.796Z"))
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
                            .createdAt(OffsetDateTime.parse("2026-09-06T12:51:21.753Z"))
                            .description("Sublime.")
                            .id("9c5debd1-ed70-4d7e-9f7a-bf591fd5cec5")
                            .isActive(false)
                            .location("5699 Purdy Motorway")
                            .name("Legacy Implementation Orchestrator")
                            .postingUrl("https://elementary-privilege.com/")
                            .updatedAt(OffsetDateTime.parse("2026-10-03T15:51:59.019Z"))
                            .build()))
                    .publicJobUrls(List.of(
                        "https://parched-dash.info",
                        "https://mild-midwife.org/"))
                    .questions(List.of(
                        AtsJobQuestion.builder()
                            .question("Deporto tolero.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Capitulus.")
                            .id("c1673074-60bb-47f3-a917-a832b2a4cdc4")
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
                            .id("8a7a8fba-13c3-4287-8721-0afa38a45e39")
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
                            .id("9a452615-e0fd-48e2-892f-ae4cf9921c0c")
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
                    .updatedAt(OffsetDateTime.parse("2026-03-30T02:03:25.191Z"))
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
                    .id("b4ec7089-3423-4ff8-ab00-a4297c929949")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Customer Security Assistant")
                    .updatedAt(OffsetDateTime.parse("2023-02-13T13:29:23.831Z"))
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