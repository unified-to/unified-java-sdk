# Ats

## Overview

### Available Operations

* [createAtsActivity](#createatsactivity) - Create an activity
* [createAtsApplication](#createatsapplication) - Create an application
* [createAtsCandidate](#createatscandidate) - Create a candidate
* [createAtsCompany](#createatscompany) - Create a company
* [createAtsDocument](#createatsdocument) - Create a document
* [createAtsInterview](#createatsinterview) - Create an interview
* [createAtsJob](#createatsjob) - Create a job
* [createAtsScorecard](#createatsscorecard) - Create a scorecard
* [getAtsActivity](#getatsactivity) - Retrieve an activity
* [getAtsApplication](#getatsapplication) - Retrieve an application
* [getAtsApplicationstatus](#getatsapplicationstatus) - Retrieve an applicationstatus
* [getAtsCandidate](#getatscandidate) - Retrieve a candidate
* [getAtsCompany](#getatscompany) - Retrieve a company
* [getAtsDocument](#getatsdocument) - Retrieve a document
* [getAtsInterview](#getatsinterview) - Retrieve an interview
* [getAtsJob](#getatsjob) - Retrieve a job
* [getAtsScorecard](#getatsscorecard) - Retrieve a scorecard
* [listAtsActivities](#listatsactivities) - List all activities
* [listAtsApplications](#listatsapplications) - List all applications
* [listAtsApplicationstatuses](#listatsapplicationstatuses) - List all applicationstatuses
* [listAtsCandidates](#listatscandidates) - List all candidates
* [listAtsCompanies](#listatscompanies) - List all companies
* [listAtsDocuments](#listatsdocuments) - List all documents
* [listAtsInterviews](#listatsinterviews) - List all interviews
* [listAtsJobs](#listatsjobs) - List all jobs
* [listAtsScorecards](#listatsscorecards) - List all scorecards
* [patchAtsActivity](#patchatsactivity) - Update an activity
* [patchAtsApplication](#patchatsapplication) - Update an application
* [patchAtsCandidate](#patchatscandidate) - Update a candidate
* [patchAtsCompany](#patchatscompany) - Update a company
* [patchAtsDocument](#patchatsdocument) - Update a document
* [patchAtsInterview](#patchatsinterview) - Update an interview
* [patchAtsJob](#patchatsjob) - Update a job
* [patchAtsScorecard](#patchatsscorecard) - Update a scorecard
* [removeAtsActivity](#removeatsactivity) - Remove an activity
* [removeAtsApplication](#removeatsapplication) - Remove an application
* [removeAtsCandidate](#removeatscandidate) - Remove a candidate
* [removeAtsCompany](#removeatscompany) - Remove a company
* [removeAtsDocument](#removeatsdocument) - Remove a document
* [removeAtsInterview](#removeatsinterview) - Remove an interview
* [removeAtsJob](#removeatsjob) - Remove a job
* [removeAtsScorecard](#removeatsscorecard) - Remove a scorecard
* [updateAtsActivity](#updateatsactivity) - Update an activity
* [updateAtsApplication](#updateatsapplication) - Update an application
* [updateAtsCandidate](#updateatscandidate) - Update a candidate
* [updateAtsCompany](#updateatscompany) - Update a company
* [updateAtsDocument](#updateatsdocument) - Update a document
* [updateAtsInterview](#updateatsinterview) - Update an interview
* [updateAtsJob](#updateatsjob) - Update a job
* [updateAtsScorecard](#updateatsscorecard) - Update a scorecard

## createAtsActivity

Create an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsActivity" method="post" path="/ats/{connection_id}/activity" example="ats_activity" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsActivityRequest;
import to.unified.unified_java_sdk.models.operations.CreateAtsActivityResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsActivityRequest req = CreateAtsActivityRequest.builder()
                .atsActivity(AtsActivity.builder()
                    .createdAt(OffsetDateTime.parse("2022-08-07T03:16:43.865Z"))
                    .description("Sapiente.")
                    .id("3c14a299-3547-4e83-b99a-b57dc66403c4")
                    .isPrivate(false)
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("f3e491bf-7b0b-4cbe-957e-7eef210c4b8b")
                            .namespace("activity")
                            .slug("cimentarius")
                            .value(AtsMetadataValue.of("Reprehenderit verto."))
                            .build()))
                    .subType("TASK")
                    .title("Venio blandior aureus.")
                    .type(AtsActivityType.TASK)
                    .updatedAt(OffsetDateTime.parse("2026-04-04T06:40:00.298Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsActivityResponse res = sdk.ats().createAtsActivity()
                .request(req)
                .call();

        if (res.atsActivity().isPresent()) {
            System.out.println(res.atsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateAtsActivityRequest](../../models/operations/CreateAtsActivityRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateAtsActivityResponse](../../models/operations/CreateAtsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAtsApplication

Create an application

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsApplication" method="post" path="/ats/{connection_id}/application" example="ats_application" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsApplicationRequest;
import to.unified.unified_java_sdk.models.operations.CreateAtsApplicationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsApplicationRequest req = CreateAtsApplicationRequest.builder()
                .atsApplication(AtsApplication.builder()
                    .answers(List.of())
                    .appliedAt(OffsetDateTime.parse("2025-09-29T18:43:03.028Z"))
                    .createdAt(OffsetDateTime.parse("2023-10-17T07:19:48.787Z"))
                    .hiredAt(OffsetDateTime.parse("2026-05-12T18:32:18.419Z"))
                    .id("c96e3121-b613-4c3f-8943-47178a6e7814")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("d3ca9362-bae3-4abb-acbd-f1c06cda6220")
                            .namespace("application")
                            .slug("stella")
                            .value(AtsMetadataValue.of("Caput."))
                            .build()))
                    .offers(List.of())
                    .originalStatus("vomica")
                    .originalSubstatus("allatus")
                    .rejectedAt(OffsetDateTime.parse("2026-10-11T13:09:05.348Z"))
                    .rejectedReason("Cometes amplitudo videlicet talio.")
                    .source("credo")
                    .status(AtsApplicationStatus.REVIEWING)
                    .summary("Arguo repudiandae defessus. Adflicto caecus claustrum annus addo vere crebro. Alias sponte turbo sopor vergo surculus nam.")
                    .updatedAt(OffsetDateTime.parse("2026-10-18T09:23:22.423Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsApplicationResponse res = sdk.ats().createAtsApplication()
                .request(req)
                .call();

        if (res.atsApplication().isPresent()) {
            System.out.println(res.atsApplication().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateAtsApplicationRequest](../../models/operations/CreateAtsApplicationRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateAtsApplicationResponse](../../models/operations/CreateAtsApplicationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateAtsCandidateResponse res = sdk.ats().createAtsCandidate()
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

## createAtsCompany

Create a company

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsCompany" method="post" path="/ats/{connection_id}/company" example="ats_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.CreateAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.AtsCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsCompanyRequest req = CreateAtsCompanyRequest.builder()
                .atsCompany(AtsCompany.builder()
                    .createdAt(OffsetDateTime.parse("2019-04-22T03:50:02.920Z"))
                    .id("5a63304a-a1a3-43da-a11b-9c9dd4b034b7")
                    .name("Gulgowski, Dibbert and Wilderman")
                    .phone("1-882-360-2010")
                    .updatedAt(OffsetDateTime.parse("2020-10-01T04:12:46.981Z"))
                    .websiteUrl("https://www.gulgowskidibbert.com")
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsCompanyResponse res = sdk.ats().createAtsCompany()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            System.out.println(res.atsCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateAtsCompanyRequest](../../models/operations/CreateAtsCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateAtsCompanyResponse](../../models/operations/CreateAtsCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAtsDocument

Create a document

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsDocument" method="post" path="/ats/{connection_id}/document" example="ats_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsDocumentRequest;
import to.unified.unified_java_sdk.models.operations.CreateAtsDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsDocumentRequest req = CreateAtsDocumentRequest.builder()
                .atsDocument(AtsDocument.builder()
                    .createdAt(OffsetDateTime.parse("2021-08-20T08:00:27.437Z"))
                    .documentUrl("https://vengeful-lashes.biz")
                    .filename("lonzo_schowalter_resume.pdf")
                    .id("6ede5d86-a9b9-4048-82b1-6a1d2a50e6fb")
                    .metadata(List.of())
                    .type(AtsDocumentType.COVER_LETTER)
                    .updatedAt(OffsetDateTime.parse("2022-12-07T05:00:25.439Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsDocumentResponse res = sdk.ats().createAtsDocument()
                .request(req)
                .call();

        if (res.atsDocument().isPresent()) {
            System.out.println(res.atsDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateAtsDocumentRequest](../../models/operations/CreateAtsDocumentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateAtsDocumentResponse](../../models/operations/CreateAtsDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAtsInterview

Create an interview

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsInterview" method="post" path="/ats/{connection_id}/interview" example="ats_interview" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsInterviewRequest;
import to.unified.unified_java_sdk.models.operations.CreateAtsInterviewResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsInterviewRequest req = CreateAtsInterviewRequest.builder()
                .atsInterview(AtsInterview.builder()
                    .createdAt(OffsetDateTime.parse("2021-11-28T03:14:47.774Z"))
                    .endAt(OffsetDateTime.parse("2021-12-08T06:33:19.583Z"))
                    .id("bcf33989-03c5-44f0-a08b-10b02e1a1046")
                    .location("26596 Halle Trafficway")
                    .meetingUrl("https://immaculate-foodstuffs.biz")
                    .metadata(List.of())
                    .startAt(OffsetDateTime.parse("2021-12-08T06:03:19.583Z"))
                    .status(AtsInterviewStatus.SCHEDULED)
                    .updatedAt(OffsetDateTime.parse("2023-09-23T16:39:56.583Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsInterviewResponse res = sdk.ats().createAtsInterview()
                .request(req)
                .call();

        if (res.atsInterview().isPresent()) {
            System.out.println(res.atsInterview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateAtsInterviewRequest](../../models/operations/CreateAtsInterviewRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateAtsInterviewResponse](../../models/operations/CreateAtsInterviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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
                    .id("47bb9c75-6134-460c-b078-5ff70cc96838")
                    .industry("Handcrafted Bamboo Soap")
                    .languageLocale("en")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(AtsMetadataFormat.TEXT)
                            .id("0631621d-c219-4e98-a96a-f5a23966e3ef")
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
                            .openedAt(OffsetDateTime.parse("2026-06-07T21:29:55.238Z"))
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
                            .createdAt(OffsetDateTime.parse("2026-08-02T00:31:18.999Z"))
                            .description("Beatus eum volutabrum balbus victus ipsa tubineus claustrum.")
                            .id("a886376b-9566-45be-a78f-130ae93a8ba6")
                            .isActive(false)
                            .location("1725 Hessel Keys")
                            .name("International Identity Manager")
                            .postingUrl("https://obedient-yak.com")
                            .updatedAt(OffsetDateTime.parse("2026-08-28T07:54:21.114Z"))
                            .build()))
                    .publicJobUrls(List.of(
                        "https://trustworthy-elver.info",
                        "https://parched-dash.info"))
                    .questions(List.of(
                        AtsJobQuestion.builder()
                            .question("Doloribus mollitia.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Auctus deporto tolero administratio capitulus animi agnosco tendo aetas vado.")
                            .id("a7c17cdf-f5e3-4776-8b70-f4e93eee0567")
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
                            .id("711617fc-28fa-4c92-91d1-f6aef96a401b")
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
                            .id("eecfa3d2-0e05-4c85-9c11-08274cf73339")
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
                    .updatedAt(OffsetDateTime.parse("2026-02-27T09:48:55.552Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsJobResponse res = sdk.ats().createAtsJob()
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

## createAtsScorecard

Create a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsScorecard" method="post" path="/ats/{connection_id}/scorecard" example="ats_scorecard" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsScorecardRequest;
import to.unified.unified_java_sdk.models.operations.CreateAtsScorecardResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsScorecardRequest req = CreateAtsScorecardRequest.builder()
                .atsScorecard(AtsScorecard.builder()
                    .comment("Maiores enim.")
                    .createdAt(OffsetDateTime.parse("2022-02-20T17:09:45.498Z"))
                    .id("48061e33-93b1-4788-82bf-d958bd6c960f")
                    .metadata(List.of())
                    .questions(List.of(
                        AtsScorecardQuestion.builder()
                            .text("Aliquam.")
                            .description("Sulum textor eveniet facere vita.")
                            .build(),
                        AtsScorecardQuestion.builder()
                            .text("Pecto vulpes libero vomer comburo.")
                            .answer("Decretum.")
                            .description("Conatus cicuta doloremque statua bonus.")
                            .build()))
                    .recommendation(Recommendation.STRONG_YES)
                    .updatedAt(OffsetDateTime.parse("2023-06-05T13:40:37.696Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsScorecardResponse res = sdk.ats().createAtsScorecard()
                .request(req)
                .call();

        if (res.atsScorecard().isPresent()) {
            System.out.println(res.atsScorecard().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateAtsScorecardRequest](../../models/operations/CreateAtsScorecardRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateAtsScorecardResponse](../../models/operations/CreateAtsScorecardResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsActivity

Retrieve an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsActivity" method="get" path="/ats/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsActivityRequest;
import to.unified.unified_java_sdk.models.operations.GetAtsActivityResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsActivityRequest req = GetAtsActivityRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsActivityResponse res = sdk.ats().getAtsActivity()
                .request(req)
                .call();

        if (res.atsActivity().isPresent()) {
            System.out.println(res.atsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetAtsActivityRequest](../../models/operations/GetAtsActivityRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetAtsActivityResponse](../../models/operations/GetAtsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsApplication

Retrieve an application

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsApplication" method="get" path="/ats/{connection_id}/application/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsApplicationRequest;
import to.unified.unified_java_sdk.models.operations.GetAtsApplicationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsApplicationRequest req = GetAtsApplicationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsApplicationResponse res = sdk.ats().getAtsApplication()
                .request(req)
                .call();

        if (res.atsApplication().isPresent()) {
            System.out.println(res.atsApplication().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetAtsApplicationRequest](../../models/operations/GetAtsApplicationRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetAtsApplicationResponse](../../models/operations/GetAtsApplicationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsApplicationstatus

Retrieve an applicationstatus

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsApplicationstatus" method="get" path="/ats/{connection_id}/applicationstatus/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsApplicationstatusRequest;
import to.unified.unified_java_sdk.models.operations.GetAtsApplicationstatusResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsApplicationstatusRequest req = GetAtsApplicationstatusRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsApplicationstatusResponse res = sdk.ats().getAtsApplicationstatus()
                .request(req)
                .call();

        if (res.atsStatus().isPresent()) {
            System.out.println(res.atsStatus().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetAtsApplicationstatusRequest](../../models/operations/GetAtsApplicationstatusRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetAtsApplicationstatusResponse](../../models/operations/GetAtsApplicationstatusResponse.md)**

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

        GetAtsCandidateResponse res = sdk.ats().getAtsCandidate()
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

## getAtsCompany

Retrieve a company

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsCompany" method="get" path="/ats/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.GetAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsCompanyRequest req = GetAtsCompanyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsCompanyResponse res = sdk.ats().getAtsCompany()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            System.out.println(res.atsCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetAtsCompanyRequest](../../models/operations/GetAtsCompanyRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetAtsCompanyResponse](../../models/operations/GetAtsCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsDocument

Retrieve a document

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsDocument" method="get" path="/ats/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsDocumentRequest;
import to.unified.unified_java_sdk.models.operations.GetAtsDocumentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsDocumentRequest req = GetAtsDocumentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsDocumentResponse res = sdk.ats().getAtsDocument()
                .request(req)
                .call();

        if (res.atsDocument().isPresent()) {
            System.out.println(res.atsDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetAtsDocumentRequest](../../models/operations/GetAtsDocumentRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetAtsDocumentResponse](../../models/operations/GetAtsDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsInterview

Retrieve an interview

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsInterview" method="get" path="/ats/{connection_id}/interview/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsInterviewRequest;
import to.unified.unified_java_sdk.models.operations.GetAtsInterviewResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsInterviewRequest req = GetAtsInterviewRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsInterviewResponse res = sdk.ats().getAtsInterview()
                .request(req)
                .call();

        if (res.atsInterview().isPresent()) {
            System.out.println(res.atsInterview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetAtsInterviewRequest](../../models/operations/GetAtsInterviewRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetAtsInterviewResponse](../../models/operations/GetAtsInterviewResponse.md)**

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

        GetAtsJobResponse res = sdk.ats().getAtsJob()
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

## getAtsScorecard

Retrieve a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsScorecard" method="get" path="/ats/{connection_id}/scorecard/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsScorecardRequest;
import to.unified.unified_java_sdk.models.operations.GetAtsScorecardResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsScorecardRequest req = GetAtsScorecardRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsScorecardResponse res = sdk.ats().getAtsScorecard()
                .request(req)
                .call();

        if (res.atsScorecard().isPresent()) {
            System.out.println(res.atsScorecard().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetAtsScorecardRequest](../../models/operations/GetAtsScorecardRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetAtsScorecardResponse](../../models/operations/GetAtsScorecardResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsActivities

List all activities

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsActivities" method="get" path="/ats/{connection_id}/activity" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsActivitiesRequest;
import to.unified.unified_java_sdk.models.operations.ListAtsActivitiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsActivitiesRequest req = ListAtsActivitiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAtsActivitiesResponse res = sdk.ats().listAtsActivities()
                .request(req)
                .call();

        if (res.atsActivities().isPresent()) {
            System.out.println(res.atsActivities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAtsActivitiesRequest](../../models/operations/ListAtsActivitiesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAtsActivitiesResponse](../../models/operations/ListAtsActivitiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsApplications

List all applications

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsApplications" method="get" path="/ats/{connection_id}/application" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsApplicationsRequest;
import to.unified.unified_java_sdk.models.operations.ListAtsApplicationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsApplicationsRequest req = ListAtsApplicationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAtsApplicationsResponse res = sdk.ats().listAtsApplications()
                .request(req)
                .call();

        if (res.atsApplications().isPresent()) {
            System.out.println(res.atsApplications().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListAtsApplicationsRequest](../../models/operations/ListAtsApplicationsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListAtsApplicationsResponse](../../models/operations/ListAtsApplicationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsApplicationstatuses

List all applicationstatuses

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsApplicationstatuses" method="get" path="/ats/{connection_id}/applicationstatus" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsApplicationstatusesRequest;
import to.unified.unified_java_sdk.models.operations.ListAtsApplicationstatusesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsApplicationstatusesRequest req = ListAtsApplicationstatusesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAtsApplicationstatusesResponse res = sdk.ats().listAtsApplicationstatuses()
                .request(req)
                .call();

        if (res.atsStatuses().isPresent()) {
            System.out.println(res.atsStatuses().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListAtsApplicationstatusesRequest](../../models/operations/ListAtsApplicationstatusesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListAtsApplicationstatusesResponse](../../models/operations/ListAtsApplicationstatusesResponse.md)**

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

        ListAtsCandidatesResponse res = sdk.ats().listAtsCandidates()
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

## listAtsCompanies

List all companies

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsCompanies" method="get" path="/ats/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsCompaniesRequest;
import to.unified.unified_java_sdk.models.operations.ListAtsCompaniesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsCompaniesRequest req = ListAtsCompaniesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAtsCompaniesResponse res = sdk.ats().listAtsCompanies()
                .request(req)
                .call();

        if (res.atsCompanies().isPresent()) {
            System.out.println(res.atsCompanies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListAtsCompaniesRequest](../../models/operations/ListAtsCompaniesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListAtsCompaniesResponse](../../models/operations/ListAtsCompaniesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsDocuments

List all documents

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsDocuments" method="get" path="/ats/{connection_id}/document" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsDocumentsRequest;
import to.unified.unified_java_sdk.models.operations.ListAtsDocumentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsDocumentsRequest req = ListAtsDocumentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAtsDocumentsResponse res = sdk.ats().listAtsDocuments()
                .request(req)
                .call();

        if (res.atsDocuments().isPresent()) {
            System.out.println(res.atsDocuments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListAtsDocumentsRequest](../../models/operations/ListAtsDocumentsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListAtsDocumentsResponse](../../models/operations/ListAtsDocumentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsInterviews

List all interviews

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsInterviews" method="get" path="/ats/{connection_id}/interview" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsInterviewsRequest;
import to.unified.unified_java_sdk.models.operations.ListAtsInterviewsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsInterviewsRequest req = ListAtsInterviewsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAtsInterviewsResponse res = sdk.ats().listAtsInterviews()
                .request(req)
                .call();

        if (res.atsInterviews().isPresent()) {
            System.out.println(res.atsInterviews().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAtsInterviewsRequest](../../models/operations/ListAtsInterviewsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAtsInterviewsResponse](../../models/operations/ListAtsInterviewsResponse.md)**

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

        ListAtsJobsResponse res = sdk.ats().listAtsJobs()
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

## listAtsScorecards

List all scorecards

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsScorecards" method="get" path="/ats/{connection_id}/scorecard" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsScorecardsRequest;
import to.unified.unified_java_sdk.models.operations.ListAtsScorecardsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsScorecardsRequest req = ListAtsScorecardsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAtsScorecardsResponse res = sdk.ats().listAtsScorecards()
                .request(req)
                .call();

        if (res.atsScorecards().isPresent()) {
            System.out.println(res.atsScorecards().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAtsScorecardsRequest](../../models/operations/ListAtsScorecardsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAtsScorecardsResponse](../../models/operations/ListAtsScorecardsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsActivity

Update an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsActivity" method="patch" path="/ats/{connection_id}/activity/{id}" example="ats_activity" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsActivityRequest;
import to.unified.unified_java_sdk.models.operations.PatchAtsActivityResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsActivityRequest req = PatchAtsActivityRequest.builder()
                .atsActivity(AtsActivity.builder()
                    .createdAt(OffsetDateTime.parse("2022-08-07T03:16:43.865Z"))
                    .description("Sapiente.")
                    .id("e8a70891-5a59-4cf0-8ba1-c6b7bc5e559f")
                    .isPrivate(false)
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("7ebcf8cb-68d6-4497-876f-9749dcd46be6")
                            .namespace("activity")
                            .slug("cimentarius")
                            .value(AtsMetadataValue.of("Reprehenderit verto."))
                            .build()))
                    .subType("TASK")
                    .title("Venio blandior aureus.")
                    .type(AtsActivityType.TASK)
                    .updatedAt(OffsetDateTime.parse("2026-04-04T06:40:00.325Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsActivityResponse res = sdk.ats().patchAtsActivity()
                .request(req)
                .call();

        if (res.atsActivity().isPresent()) {
            System.out.println(res.atsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchAtsActivityRequest](../../models/operations/PatchAtsActivityRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchAtsActivityResponse](../../models/operations/PatchAtsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsApplication

Update an application

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsApplication" method="patch" path="/ats/{connection_id}/application/{id}" example="ats_application" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsApplicationRequest;
import to.unified.unified_java_sdk.models.operations.PatchAtsApplicationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsApplicationRequest req = PatchAtsApplicationRequest.builder()
                .atsApplication(AtsApplication.builder()
                    .answers(List.of())
                    .appliedAt(OffsetDateTime.parse("2025-09-29T18:43:03.044Z"))
                    .createdAt(OffsetDateTime.parse("2023-10-17T07:19:48.787Z"))
                    .hiredAt(OffsetDateTime.parse("2026-05-12T18:32:18.440Z"))
                    .id("cd68e010-ff31-4aea-8e82-4c6827f0765f")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("d429998d-2666-4b67-9ff3-64bc5abfabbd")
                            .namespace("application")
                            .slug("stella")
                            .value(AtsMetadataValue.of("Caput."))
                            .build()))
                    .offers(List.of())
                    .originalStatus("vomica")
                    .originalSubstatus("allatus")
                    .rejectedAt(OffsetDateTime.parse("2026-10-11T13:09:05.373Z"))
                    .rejectedReason("Cometes amplitudo videlicet talio.")
                    .source("credo")
                    .status(AtsApplicationStatus.REVIEWING)
                    .summary("Arguo repudiandae defessus. Adflicto caecus claustrum annus addo vere crebro. Alias sponte turbo sopor vergo surculus nam.")
                    .updatedAt(OffsetDateTime.parse("2026-10-18T09:23:22.448Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsApplicationResponse res = sdk.ats().patchAtsApplication()
                .request(req)
                .call();

        if (res.atsApplication().isPresent()) {
            System.out.println(res.atsApplication().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchAtsApplicationRequest](../../models/operations/PatchAtsApplicationRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchAtsApplicationResponse](../../models/operations/PatchAtsApplicationResponse.md)**

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

        PatchAtsCandidateResponse res = sdk.ats().patchAtsCandidate()
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

## patchAtsCompany

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsCompany" method="patch" path="/ats/{connection_id}/company/{id}" example="ats_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.PatchAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.AtsCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsCompanyRequest req = PatchAtsCompanyRequest.builder()
                .atsCompany(AtsCompany.builder()
                    .createdAt(OffsetDateTime.parse("2019-04-22T03:50:02.920Z"))
                    .id("e03f4e21-bb37-4272-aa49-5cfee71009f3")
                    .name("Gulgowski, Dibbert and Wilderman")
                    .phone("1-882-360-2010")
                    .updatedAt(OffsetDateTime.parse("2020-10-01T04:12:46.985Z"))
                    .websiteUrl("https://www.gulgowskidibbert.com")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsCompanyResponse res = sdk.ats().patchAtsCompany()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            System.out.println(res.atsCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchAtsCompanyRequest](../../models/operations/PatchAtsCompanyRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchAtsCompanyResponse](../../models/operations/PatchAtsCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsDocument

Update a document

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsDocument" method="patch" path="/ats/{connection_id}/document/{id}" example="ats_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsDocumentRequest;
import to.unified.unified_java_sdk.models.operations.PatchAtsDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsDocumentRequest req = PatchAtsDocumentRequest.builder()
                .atsDocument(AtsDocument.builder()
                    .createdAt(OffsetDateTime.parse("2021-08-20T08:00:27.437Z"))
                    .documentUrl("https://vengeful-lashes.biz")
                    .filename("lonzo_schowalter_resume.pdf")
                    .id("a214c743-edaf-4465-8097-647877814cb5")
                    .metadata(List.of())
                    .type(AtsDocumentType.COVER_LETTER)
                    .updatedAt(OffsetDateTime.parse("2022-12-07T05:00:25.443Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsDocumentResponse res = sdk.ats().patchAtsDocument()
                .request(req)
                .call();

        if (res.atsDocument().isPresent()) {
            System.out.println(res.atsDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchAtsDocumentRequest](../../models/operations/PatchAtsDocumentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchAtsDocumentResponse](../../models/operations/PatchAtsDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsInterview

Update an interview

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsInterview" method="patch" path="/ats/{connection_id}/interview/{id}" example="ats_interview" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsInterviewRequest;
import to.unified.unified_java_sdk.models.operations.PatchAtsInterviewResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsInterviewRequest req = PatchAtsInterviewRequest.builder()
                .atsInterview(AtsInterview.builder()
                    .createdAt(OffsetDateTime.parse("2021-11-28T03:14:47.774Z"))
                    .endAt(OffsetDateTime.parse("2021-12-08T06:33:19.583Z"))
                    .id("d52c2892-06f7-45f3-b162-356262609fd3")
                    .location("26596 Halle Trafficway")
                    .meetingUrl("https://immaculate-foodstuffs.biz")
                    .metadata(List.of())
                    .startAt(OffsetDateTime.parse("2021-12-08T06:03:19.583Z"))
                    .status(AtsInterviewStatus.SCHEDULED)
                    .updatedAt(OffsetDateTime.parse("2023-09-23T16:39:56.587Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsInterviewResponse res = sdk.ats().patchAtsInterview()
                .request(req)
                .call();

        if (res.atsInterview().isPresent()) {
            System.out.println(res.atsInterview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchAtsInterviewRequest](../../models/operations/PatchAtsInterviewRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchAtsInterviewResponse](../../models/operations/PatchAtsInterviewResponse.md)**

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
                    .id("56d8529e-a986-4116-97c0-83e59897d8f0")
                    .industry("Handcrafted Bamboo Soap")
                    .languageLocale("en")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(AtsMetadataFormat.TEXT)
                            .id("29d8ee67-39e3-41ea-9512-a611d055fc2e")
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
                            .openedAt(OffsetDateTime.parse("2026-06-07T21:29:55.289Z"))
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
                            .createdAt(OffsetDateTime.parse("2026-08-02T00:31:19.053Z"))
                            .description("Beatus eum volutabrum balbus victus ipsa tubineus claustrum.")
                            .id("4e69e14e-5db6-45d7-86cd-54094fc71bd6")
                            .isActive(false)
                            .location("1725 Hessel Keys")
                            .name("International Identity Manager")
                            .postingUrl("https://obedient-yak.com")
                            .updatedAt(OffsetDateTime.parse("2026-08-28T07:54:21.170Z"))
                            .build()))
                    .publicJobUrls(List.of(
                        "https://trustworthy-elver.info",
                        "https://parched-dash.info"))
                    .questions(List.of(
                        AtsJobQuestion.builder()
                            .question("Doloribus mollitia.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Auctus deporto tolero administratio capitulus animi agnosco tendo aetas vado.")
                            .id("7e7889dd-879d-44b6-9e8c-b7578ccfc95d")
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
                            .id("675edef9-19d3-4a52-813c-a103c038afc2")
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
                            .id("dda17d3d-8409-424b-a2a1-8408a4046de1")
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
                    .updatedAt(OffsetDateTime.parse("2026-02-27T09:48:55.598Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsJobResponse res = sdk.ats().patchAtsJob()
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

## patchAtsScorecard

Update a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsScorecard" method="patch" path="/ats/{connection_id}/scorecard/{id}" example="ats_scorecard" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsScorecardRequest;
import to.unified.unified_java_sdk.models.operations.PatchAtsScorecardResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsScorecardRequest req = PatchAtsScorecardRequest.builder()
                .atsScorecard(AtsScorecard.builder()
                    .comment("Maiores enim.")
                    .createdAt(OffsetDateTime.parse("2022-02-20T17:09:45.498Z"))
                    .id("68fcb38d-6798-4850-b328-fa67ebb06ade")
                    .metadata(List.of())
                    .questions(List.of(
                        AtsScorecardQuestion.builder()
                            .text("Aliquam.")
                            .description("Sulum textor eveniet facere vita.")
                            .build(),
                        AtsScorecardQuestion.builder()
                            .text("Pecto vulpes libero vomer comburo.")
                            .answer("Decretum.")
                            .description("Conatus cicuta doloremque statua bonus.")
                            .build()))
                    .recommendation(Recommendation.STRONG_YES)
                    .updatedAt(OffsetDateTime.parse("2023-06-05T13:40:37.700Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsScorecardResponse res = sdk.ats().patchAtsScorecard()
                .request(req)
                .call();

        if (res.atsScorecard().isPresent()) {
            System.out.println(res.atsScorecard().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchAtsScorecardRequest](../../models/operations/PatchAtsScorecardRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchAtsScorecardResponse](../../models/operations/PatchAtsScorecardResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsActivity

Remove an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsActivity" method="delete" path="/ats/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsActivityRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAtsActivityResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsActivityRequest req = RemoveAtsActivityRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsActivityResponse res = sdk.ats().removeAtsActivity()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveAtsActivityRequest](../../models/operations/RemoveAtsActivityRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveAtsActivityResponse](../../models/operations/RemoveAtsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsApplication

Remove an application

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsApplication" method="delete" path="/ats/{connection_id}/application/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsApplicationRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAtsApplicationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsApplicationRequest req = RemoveAtsApplicationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsApplicationResponse res = sdk.ats().removeAtsApplication()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveAtsApplicationRequest](../../models/operations/RemoveAtsApplicationRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveAtsApplicationResponse](../../models/operations/RemoveAtsApplicationResponse.md)**

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

        RemoveAtsCandidateResponse res = sdk.ats().removeAtsCandidate()
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

## removeAtsCompany

Remove a company

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsCompany" method="delete" path="/ats/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsCompanyRequest req = RemoveAtsCompanyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsCompanyResponse res = sdk.ats().removeAtsCompany()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveAtsCompanyRequest](../../models/operations/RemoveAtsCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveAtsCompanyResponse](../../models/operations/RemoveAtsCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsDocument

Remove a document

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsDocument" method="delete" path="/ats/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsDocumentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAtsDocumentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsDocumentRequest req = RemoveAtsDocumentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsDocumentResponse res = sdk.ats().removeAtsDocument()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveAtsDocumentRequest](../../models/operations/RemoveAtsDocumentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveAtsDocumentResponse](../../models/operations/RemoveAtsDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsInterview

Remove an interview

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsInterview" method="delete" path="/ats/{connection_id}/interview/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsInterviewRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAtsInterviewResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsInterviewRequest req = RemoveAtsInterviewRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsInterviewResponse res = sdk.ats().removeAtsInterview()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveAtsInterviewRequest](../../models/operations/RemoveAtsInterviewRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveAtsInterviewResponse](../../models/operations/RemoveAtsInterviewResponse.md)**

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

        RemoveAtsJobResponse res = sdk.ats().removeAtsJob()
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

## removeAtsScorecard

Remove a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsScorecard" method="delete" path="/ats/{connection_id}/scorecard/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsScorecardRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAtsScorecardResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsScorecardRequest req = RemoveAtsScorecardRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsScorecardResponse res = sdk.ats().removeAtsScorecard()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveAtsScorecardRequest](../../models/operations/RemoveAtsScorecardRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveAtsScorecardResponse](../../models/operations/RemoveAtsScorecardResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsActivity

Update an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsActivity" method="put" path="/ats/{connection_id}/activity/{id}" example="ats_activity" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsActivityRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAtsActivityResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsActivityRequest req = UpdateAtsActivityRequest.builder()
                .atsActivity(AtsActivity.builder()
                    .createdAt(OffsetDateTime.parse("2022-08-07T03:16:43.865Z"))
                    .description("Sapiente.")
                    .id("e8a70891-5a59-4cf0-8ba1-c6b7bc5e559f")
                    .isPrivate(false)
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("7ebcf8cb-68d6-4497-876f-9749dcd46be6")
                            .namespace("activity")
                            .slug("cimentarius")
                            .value(AtsMetadataValue.of("Reprehenderit verto."))
                            .build()))
                    .subType("TASK")
                    .title("Venio blandior aureus.")
                    .type(AtsActivityType.TASK)
                    .updatedAt(OffsetDateTime.parse("2026-04-04T06:40:00.325Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsActivityResponse res = sdk.ats().updateAtsActivity()
                .request(req)
                .call();

        if (res.atsActivity().isPresent()) {
            System.out.println(res.atsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateAtsActivityRequest](../../models/operations/UpdateAtsActivityRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateAtsActivityResponse](../../models/operations/UpdateAtsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsApplication

Update an application

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsApplication" method="put" path="/ats/{connection_id}/application/{id}" example="ats_application" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsApplicationRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAtsApplicationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsApplicationRequest req = UpdateAtsApplicationRequest.builder()
                .atsApplication(AtsApplication.builder()
                    .answers(List.of())
                    .appliedAt(OffsetDateTime.parse("2025-09-29T18:43:03.044Z"))
                    .createdAt(OffsetDateTime.parse("2023-10-17T07:19:48.787Z"))
                    .hiredAt(OffsetDateTime.parse("2026-05-12T18:32:18.440Z"))
                    .id("cd68e010-ff31-4aea-8e82-4c6827f0765f")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("d429998d-2666-4b67-9ff3-64bc5abfabbd")
                            .namespace("application")
                            .slug("stella")
                            .value(AtsMetadataValue.of("Caput."))
                            .build()))
                    .offers(List.of())
                    .originalStatus("vomica")
                    .originalSubstatus("allatus")
                    .rejectedAt(OffsetDateTime.parse("2026-10-11T13:09:05.373Z"))
                    .rejectedReason("Cometes amplitudo videlicet talio.")
                    .source("credo")
                    .status(AtsApplicationStatus.REVIEWING)
                    .summary("Arguo repudiandae defessus. Adflicto caecus claustrum annus addo vere crebro. Alias sponte turbo sopor vergo surculus nam.")
                    .updatedAt(OffsetDateTime.parse("2026-10-18T09:23:22.448Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsApplicationResponse res = sdk.ats().updateAtsApplication()
                .request(req)
                .call();

        if (res.atsApplication().isPresent()) {
            System.out.println(res.atsApplication().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateAtsApplicationRequest](../../models/operations/UpdateAtsApplicationRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateAtsApplicationResponse](../../models/operations/UpdateAtsApplicationResponse.md)**

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

        UpdateAtsCandidateResponse res = sdk.ats().updateAtsCandidate()
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

## updateAtsCompany

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsCompany" method="put" path="/ats/{connection_id}/company/{id}" example="ats_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.AtsCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsCompanyRequest req = UpdateAtsCompanyRequest.builder()
                .atsCompany(AtsCompany.builder()
                    .createdAt(OffsetDateTime.parse("2019-04-22T03:50:02.920Z"))
                    .id("e03f4e21-bb37-4272-aa49-5cfee71009f3")
                    .name("Gulgowski, Dibbert and Wilderman")
                    .phone("1-882-360-2010")
                    .updatedAt(OffsetDateTime.parse("2020-10-01T04:12:46.985Z"))
                    .websiteUrl("https://www.gulgowskidibbert.com")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsCompanyResponse res = sdk.ats().updateAtsCompany()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            System.out.println(res.atsCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateAtsCompanyRequest](../../models/operations/UpdateAtsCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateAtsCompanyResponse](../../models/operations/UpdateAtsCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsDocument

Update a document

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsDocument" method="put" path="/ats/{connection_id}/document/{id}" example="ats_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsDocumentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAtsDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsDocumentRequest req = UpdateAtsDocumentRequest.builder()
                .atsDocument(AtsDocument.builder()
                    .createdAt(OffsetDateTime.parse("2021-08-20T08:00:27.437Z"))
                    .documentUrl("https://vengeful-lashes.biz")
                    .filename("lonzo_schowalter_resume.pdf")
                    .id("a214c743-edaf-4465-8097-647877814cb5")
                    .metadata(List.of())
                    .type(AtsDocumentType.COVER_LETTER)
                    .updatedAt(OffsetDateTime.parse("2022-12-07T05:00:25.443Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsDocumentResponse res = sdk.ats().updateAtsDocument()
                .request(req)
                .call();

        if (res.atsDocument().isPresent()) {
            System.out.println(res.atsDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateAtsDocumentRequest](../../models/operations/UpdateAtsDocumentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateAtsDocumentResponse](../../models/operations/UpdateAtsDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsInterview

Update an interview

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsInterview" method="put" path="/ats/{connection_id}/interview/{id}" example="ats_interview" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsInterviewRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAtsInterviewResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsInterviewRequest req = UpdateAtsInterviewRequest.builder()
                .atsInterview(AtsInterview.builder()
                    .createdAt(OffsetDateTime.parse("2021-11-28T03:14:47.774Z"))
                    .endAt(OffsetDateTime.parse("2021-12-08T06:33:19.583Z"))
                    .id("d52c2892-06f7-45f3-b162-356262609fd3")
                    .location("26596 Halle Trafficway")
                    .meetingUrl("https://immaculate-foodstuffs.biz")
                    .metadata(List.of())
                    .startAt(OffsetDateTime.parse("2021-12-08T06:03:19.583Z"))
                    .status(AtsInterviewStatus.SCHEDULED)
                    .updatedAt(OffsetDateTime.parse("2023-09-23T16:39:56.587Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsInterviewResponse res = sdk.ats().updateAtsInterview()
                .request(req)
                .call();

        if (res.atsInterview().isPresent()) {
            System.out.println(res.atsInterview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateAtsInterviewRequest](../../models/operations/UpdateAtsInterviewRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateAtsInterviewResponse](../../models/operations/UpdateAtsInterviewResponse.md)**

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
                    .id("56d8529e-a986-4116-97c0-83e59897d8f0")
                    .industry("Handcrafted Bamboo Soap")
                    .languageLocale("en")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(AtsMetadataFormat.TEXT)
                            .id("29d8ee67-39e3-41ea-9512-a611d055fc2e")
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
                            .openedAt(OffsetDateTime.parse("2026-06-07T21:29:55.289Z"))
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
                            .createdAt(OffsetDateTime.parse("2026-08-02T00:31:19.053Z"))
                            .description("Beatus eum volutabrum balbus victus ipsa tubineus claustrum.")
                            .id("4e69e14e-5db6-45d7-86cd-54094fc71bd6")
                            .isActive(false)
                            .location("1725 Hessel Keys")
                            .name("International Identity Manager")
                            .postingUrl("https://obedient-yak.com")
                            .updatedAt(OffsetDateTime.parse("2026-08-28T07:54:21.170Z"))
                            .build()))
                    .publicJobUrls(List.of(
                        "https://trustworthy-elver.info",
                        "https://parched-dash.info"))
                    .questions(List.of(
                        AtsJobQuestion.builder()
                            .question("Doloribus mollitia.")
                            .type(AtsJobQuestionType.TEXT)
                            .description("Auctus deporto tolero administratio capitulus animi agnosco tendo aetas vado.")
                            .id("7e7889dd-879d-44b6-9e8c-b7578ccfc95d")
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
                            .id("675edef9-19d3-4a52-813c-a103c038afc2")
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
                            .id("dda17d3d-8409-424b-a2a1-8408a4046de1")
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
                    .updatedAt(OffsetDateTime.parse("2026-02-27T09:48:55.598Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsJobResponse res = sdk.ats().updateAtsJob()
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

## updateAtsScorecard

Update a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsScorecard" method="put" path="/ats/{connection_id}/scorecard/{id}" example="ats_scorecard" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsScorecardRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAtsScorecardResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsScorecardRequest req = UpdateAtsScorecardRequest.builder()
                .atsScorecard(AtsScorecard.builder()
                    .comment("Maiores enim.")
                    .createdAt(OffsetDateTime.parse("2022-02-20T17:09:45.498Z"))
                    .id("68fcb38d-6798-4850-b328-fa67ebb06ade")
                    .metadata(List.of())
                    .questions(List.of(
                        AtsScorecardQuestion.builder()
                            .text("Aliquam.")
                            .description("Sulum textor eveniet facere vita.")
                            .build(),
                        AtsScorecardQuestion.builder()
                            .text("Pecto vulpes libero vomer comburo.")
                            .answer("Decretum.")
                            .description("Conatus cicuta doloremque statua bonus.")
                            .build()))
                    .recommendation(Recommendation.STRONG_YES)
                    .updatedAt(OffsetDateTime.parse("2023-06-05T13:40:37.700Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsScorecardResponse res = sdk.ats().updateAtsScorecard()
                .request(req)
                .call();

        if (res.atsScorecard().isPresent()) {
            System.out.println(res.atsScorecard().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateAtsScorecardRequest](../../models/operations/UpdateAtsScorecardRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateAtsScorecardResponse](../../models/operations/UpdateAtsScorecardResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |