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

Creates a AtsActivity. Provide the unified AtsActivity fields in the request body; they are mapped to the provider's API. Returns the created AtsActivity.

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
                    .description("Reprehenderit.")
                    .id("f9d17833-2ddb-4eee-ac19-1cc77bbaa082")
                    .isPrivate(false)
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("018903fe-751d-414c-9fb8-014ad2b22909")
                            .namespace("activity")
                            .slug("verto")
                            .value(AtsMetadataValue.of("Sint varietas officia aequus stillicidium vereor victus tricesimus vester."))
                            .build()))
                    .subType("TASK")
                    .title("Amplus sapiente cimentarius.")
                    .type(AtsActivityType.TASK)
                    .updatedAt(OffsetDateTime.parse("2026-05-05T13:17:18.759Z"))
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

Creates a AtsApplication. Provide the unified AtsApplication fields in the request body; they are mapped to the provider's API. Returns the created AtsApplication.

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
                    .appliedAt(OffsetDateTime.parse("2025-10-23T02:30:45.634Z"))
                    .createdAt(OffsetDateTime.parse("2023-10-17T07:19:48.787Z"))
                    .hiredAt(OffsetDateTime.parse("2026-06-12T10:51:49.470Z"))
                    .id("63dbc2fb-5375-41d6-8a84-83b569389919")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("8796ebde-60c8-4568-9697-d2af69a3a113")
                            .namespace("application")
                            .slug("arguo")
                            .value(AtsMetadataValue.of("Defessus occaecati adflicto caecus claustrum annus addo."))
                            .build()))
                    .offers(List.of())
                    .originalStatus("caput")
                    .originalSubstatus("admiratio")
                    .rejectedAt(OffsetDateTime.parse("2026-11-16T04:33:37.900Z"))
                    .rejectedReason("Talio credo vomica allatus stella.")
                    .source("alii")
                    .status(AtsApplicationStatus.REVIEWING)
                    .summary("Crebro nostrum alias sponte turbo sopor vergo surculus nam copiose. Enim casso cursus aestus deprecator. Despecto tabella argentum decretum cultellus aveho distinctio verecundia stella.")
                    .updatedAt(OffsetDateTime.parse("2026-11-23T06:10:04.261Z"))
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

Creates a AtsCandidate. Provide the unified AtsCandidate fields in the request body; they are mapped to the provider's API. Returns the created AtsCandidate.

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
                        .address1("699 Legros Falls")
                        .city("New Albertoboro")
                        .countryCode("US")
                        .postalCode("85550-0688")
                        .region("Minnesota")
                        .regionCode("WY")
                        .build())
                    .companyName("Doyle-Kutch LLC")
                    .createdAt(OffsetDateTime.parse("2023-10-16T05:42:56.049Z"))
                    .dateOfBirth(OffsetDateTime.parse("1994-07-05T19:48:57.631Z"))
                    .education(List.of(
                        AtsCandidateEducation.builder()
                            .degree("wilt powerfully")
                            .endAt(OffsetDateTime.parse("1978-04-14T07:58:36.326Z"))
                            .fieldOfStudy("totam")
                            .institution("Wunsch - Grimes-Heller")
                            .level("phd")
                            .startAt(OffsetDateTime.parse("1994-06-09T13:31:39.059Z"))
                            .build(),
                        AtsCandidateEducation.builder()
                            .degree("substantial yum")
                            .endAt(OffsetDateTime.parse("1989-09-06T03:32:39.901Z"))
                            .fieldOfStudy("commodi")
                            .institution("Franecki and Sons")
                            .level("highschool")
                            .startAt(OffsetDateTime.parse("1992-11-28T20:23:20.311Z"))
                            .build()))
                    .emails(List.of(
                        AtsEmail.builder()
                            .email("alyce.rempel@outlook.com")
                            .name("Alyce Rempel")
                            .type(AtsEmailType.HOME)
                            .build()))
                    .experiences(List.of(
                        AtsCandidateExperience.builder()
                            .companyName("Mayert - Rohan")
                            .endAt(OffsetDateTime.parse("1974-03-01T17:02:58.824Z"))
                            .startAt(OffsetDateTime.parse("1999-09-21T22:12:51.663Z"))
                            .title("Central Response Designer")
                            .build(),
                        AtsCandidateExperience.builder()
                            .companyName("Padberg, Keeling and Franey")
                            .endAt(OffsetDateTime.parse("2004-10-14T14:01:00.717Z"))
                            .startAt(OffsetDateTime.parse("1996-12-15T04:12:04.582Z"))
                            .title("Central Communications Producer")
                            .build()))
                    .firstName("Alyce")
                    .hasDoNotContact(false)
                    .id("db866c08-e5bb-40fc-aa04-e5a74f7322ca")
                    .imageUrl("https://avatars.githubusercontent.com/u/99913246")
                    .isPrivate(true)
                    .jobIds(List.of())
                    .lastName("Rempel")
                    .linkUrls(List.of(
                        "https://www.linkedin.com/in/alyce-rempel"))
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("60f27013-c27e-4a87-86ad-a4c932160b77")
                            .namespace("custom")
                            .slug("custom_field")
                            .value(AtsMetadataValue.of("chirographum"))
                            .build()))
                    .name("Alyce Rempel")
                    .origin(Origin.AGENCY)
                    .skills(List.of(
                        "curvo",
                        "voveo"))
                    .sources(List.of(
                        "tripudio",
                        "volup"))
                    .summary("Spero nostrum damnatio averto pecus cervus aspicio. Stabilis thesis admiratio. Acquiro sperno voluptate laboriosam comitatus teres doloribus canonicus considero tersus.")
                    .tags(List.of(
                        "alo"))
                    .telephones(List.of(
                        AtsTelephone.builder()
                            .telephone("(251) 489-6457")
                            .type(AtsTelephoneType.MOBILE)
                            .build()))
                    .title("Internal Paradigm Consultant")
                    .updatedAt(OffsetDateTime.parse("2024-05-05T03:02:32.746Z"))
                    .webUrl("https://light-meander.com/")
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

Creates a AtsCompany. Provide the unified AtsCompany fields in the request body; they are mapped to the provider's API. Returns the created AtsCompany.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsCompany" method="post" path="/ats/{connection_id}/company" example="ats_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.CreateAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.*;

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
                    .fees(List.of(
                        AtsFee.builder()
                            .percentage(23d)
                            .type(AtsFeeType.CONTINGENCY)
                            .build()))
                    .id("65519251-150b-442f-8977-16ec4bd7c957")
                    .name("Streich, Mohr and Barton")
                    .phone("245-586-5728 x0090")
                    .updatedAt(OffsetDateTime.parse("2020-10-08T02:33:15.600Z"))
                    .websiteUrl("https://www.streichmohr.com")
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

Creates a AtsDocument. Provide the unified AtsDocument fields in the request body; they are mapped to the provider's API. Returns the created AtsDocument.

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
                    .documentUrl("https://thin-video.org/")
                    .filename("reggie_langosh_resume.pdf")
                    .id("17116711-84be-48d6-90e7-8a61cfd9b039")
                    .metadata(List.of())
                    .type(AtsDocumentType.COVER_LETTER)
                    .updatedAt(OffsetDateTime.parse("2022-12-16T05:36:26.925Z"))
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

Creates a AtsInterview. Provide the unified AtsInterview fields in the request body; they are mapped to the provider's API. Returns the created AtsInterview.

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
                    .id("9eecf7f8-7ae2-440c-bf0f-dc4fe9256b0d")
                    .location("9604 S Pine Street")
                    .meetingUrl("https://gummy-battle.name/")
                    .metadata(List.of())
                    .startAt(OffsetDateTime.parse("2021-12-08T06:03:19.583Z"))
                    .status(AtsInterviewStatus.SCHEDULED)
                    .updatedAt(OffsetDateTime.parse("2023-10-07T01:22:52.175Z"))
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

Creates a AtsScorecard. Provide the unified AtsScorecard fields in the request body; they are mapped to the provider's API. Returns the created AtsScorecard.

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
                    .comment("Aliquam.")
                    .createdAt(OffsetDateTime.parse("2022-02-20T17:09:45.498Z"))
                    .id("32792a3b-e22c-4100-b7f7-2e74be0cc36c")
                    .metadata(List.of())
                    .questions(List.of(
                        AtsScorecardQuestion.builder()
                            .text("Desidero modi tamdiu auxilium defessus adimpleo clementia tero.")
                            .description("Pecto vulpes libero vomer comburo.")
                            .build(),
                        AtsScorecardQuestion.builder()
                            .text("Decretum.")
                            .answer("Conatus cicuta doloremque statua bonus.")
                            .description("Aduro viscus celebrer.")
                            .build()))
                    .recommendation(Recommendation.STRONG_YES)
                    .updatedAt(OffsetDateTime.parse("2023-06-15T11:41:18.009Z"))
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

Retrieves a single AtsActivity by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single AtsApplication by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single AtsStatus by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single AtsCandidate by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single AtsCompany by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single AtsDocument by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single AtsInterview by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single AtsScorecard by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Returns a list of AtsActivities. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of AtsApplications. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of AtsStatuses. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of AtsCandidates. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of AtsCompanies. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of AtsDocuments. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of AtsInterviews. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of AtsScorecards. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Updates the AtsActivity identified by `id`. Provide the unified AtsActivity fields to change in the request body.

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
                    .description("Reprehenderit.")
                    .id("c90114ac-b97f-46d4-82fb-b6022f1b7d5f")
                    .isPrivate(false)
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("ae46d6db-e9b3-4153-be35-cb790fe6b37a")
                            .namespace("activity")
                            .slug("verto")
                            .value(AtsMetadataValue.of("Sint varietas officia aequus stillicidium vereor victus tricesimus vester."))
                            .build()))
                    .subType("TASK")
                    .title("Amplus sapiente cimentarius.")
                    .type(AtsActivityType.TASK)
                    .updatedAt(OffsetDateTime.parse("2026-05-05T13:17:18.773Z"))
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

Updates the AtsApplication identified by `id`. Provide the unified AtsApplication fields to change in the request body.

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
                    .appliedAt(OffsetDateTime.parse("2025-10-23T02:30:45.647Z"))
                    .createdAt(OffsetDateTime.parse("2023-10-17T07:19:48.787Z"))
                    .hiredAt(OffsetDateTime.parse("2026-06-12T10:51:49.486Z"))
                    .id("49eb9907-ebaa-4961-a74b-556bd7f77a01")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("fc1bad16-5849-4eaf-a9b7-91c1bc0e0ea3")
                            .namespace("application")
                            .slug("arguo")
                            .value(AtsMetadataValue.of("Defessus occaecati adflicto caecus claustrum annus addo."))
                            .build()))
                    .offers(List.of())
                    .originalStatus("caput")
                    .originalSubstatus("admiratio")
                    .rejectedAt(OffsetDateTime.parse("2026-11-16T04:33:37.919Z"))
                    .rejectedReason("Talio credo vomica allatus stella.")
                    .source("alii")
                    .status(AtsApplicationStatus.REVIEWING)
                    .summary("Crebro nostrum alias sponte turbo sopor vergo surculus nam copiose. Enim casso cursus aestus deprecator. Despecto tabella argentum decretum cultellus aveho distinctio verecundia stella.")
                    .updatedAt(OffsetDateTime.parse("2026-11-23T06:10:04.280Z"))
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

Updates the AtsCandidate identified by `id`. Provide the unified AtsCandidate fields to change in the request body.

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
                        .address1("699 Legros Falls")
                        .city("New Albertoboro")
                        .countryCode("US")
                        .postalCode("85550-0688")
                        .region("Minnesota")
                        .regionCode("WY")
                        .build())
                    .companyName("Doyle-Kutch LLC")
                    .createdAt(OffsetDateTime.parse("2023-10-16T05:42:56.049Z"))
                    .dateOfBirth(OffsetDateTime.parse("1994-07-05T19:48:57.631Z"))
                    .education(List.of(
                        AtsCandidateEducation.builder()
                            .degree("wilt powerfully")
                            .endAt(OffsetDateTime.parse("1978-04-14T07:58:36.326Z"))
                            .fieldOfStudy("totam")
                            .institution("Wunsch - Grimes-Heller")
                            .level("phd")
                            .startAt(OffsetDateTime.parse("1994-06-09T13:31:39.059Z"))
                            .build(),
                        AtsCandidateEducation.builder()
                            .degree("substantial yum")
                            .endAt(OffsetDateTime.parse("1989-09-06T03:32:39.901Z"))
                            .fieldOfStudy("commodi")
                            .institution("Franecki and Sons")
                            .level("highschool")
                            .startAt(OffsetDateTime.parse("1992-11-28T20:23:20.311Z"))
                            .build()))
                    .emails(List.of(
                        AtsEmail.builder()
                            .email("alyce.rempel@outlook.com")
                            .name("Alyce Rempel")
                            .type(AtsEmailType.HOME)
                            .build()))
                    .experiences(List.of(
                        AtsCandidateExperience.builder()
                            .companyName("Mayert - Rohan")
                            .endAt(OffsetDateTime.parse("1974-03-01T17:02:58.824Z"))
                            .startAt(OffsetDateTime.parse("1999-09-21T22:12:51.663Z"))
                            .title("Central Response Designer")
                            .build(),
                        AtsCandidateExperience.builder()
                            .companyName("Padberg, Keeling and Franey")
                            .endAt(OffsetDateTime.parse("2004-10-14T14:01:00.717Z"))
                            .startAt(OffsetDateTime.parse("1996-12-15T04:12:04.582Z"))
                            .title("Central Communications Producer")
                            .build()))
                    .firstName("Alyce")
                    .hasDoNotContact(false)
                    .id("c5422b74-583c-4c2e-9ec8-23e5a1098fef")
                    .imageUrl("https://avatars.githubusercontent.com/u/99913246")
                    .isPrivate(true)
                    .jobIds(List.of())
                    .lastName("Rempel")
                    .linkUrls(List.of(
                        "https://www.linkedin.com/in/alyce-rempel"))
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("2b04da68-cf48-4f71-b6b1-2e10091b7bbf")
                            .namespace("custom")
                            .slug("custom_field")
                            .value(AtsMetadataValue.of("chirographum"))
                            .build()))
                    .name("Alyce Rempel")
                    .origin(Origin.AGENCY)
                    .skills(List.of(
                        "curvo",
                        "voveo"))
                    .sources(List.of(
                        "tripudio",
                        "volup"))
                    .summary("Spero nostrum damnatio averto pecus cervus aspicio. Stabilis thesis admiratio. Acquiro sperno voluptate laboriosam comitatus teres doloribus canonicus considero tersus.")
                    .tags(List.of(
                        "alo"))
                    .telephones(List.of(
                        AtsTelephone.builder()
                            .telephone("(251) 489-6457")
                            .type(AtsTelephoneType.MOBILE)
                            .build()))
                    .title("Internal Paradigm Consultant")
                    .updatedAt(OffsetDateTime.parse("2024-05-05T03:02:32.750Z"))
                    .webUrl("https://light-meander.com/")
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

Updates the AtsCompany identified by `id`. Provide the unified AtsCompany fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsCompany" method="patch" path="/ats/{connection_id}/company/{id}" example="ats_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.PatchAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.*;

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
                    .fees(List.of(
                        AtsFee.builder()
                            .percentage(23d)
                            .type(AtsFeeType.CONTINGENCY)
                            .build()))
                    .id("c8c2ad67-5974-492b-90ab-d715fac0df23")
                    .name("Streich, Mohr and Barton")
                    .phone("245-586-5728 x0090")
                    .updatedAt(OffsetDateTime.parse("2020-10-08T02:33:15.603Z"))
                    .websiteUrl("https://www.streichmohr.com")
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

Updates the AtsDocument identified by `id`. Provide the unified AtsDocument fields to change in the request body.

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
                    .documentUrl("https://thin-video.org/")
                    .filename("reggie_langosh_resume.pdf")
                    .id("06592e05-8879-4d55-b480-1b819a6fa673")
                    .metadata(List.of())
                    .type(AtsDocumentType.COVER_LETTER)
                    .updatedAt(OffsetDateTime.parse("2022-12-16T05:36:26.927Z"))
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

Updates the AtsInterview identified by `id`. Provide the unified AtsInterview fields to change in the request body.

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
                    .id("0fcc69b8-b494-4256-8ee2-22266d35f5c5")
                    .location("9604 S Pine Street")
                    .meetingUrl("https://gummy-battle.name/")
                    .metadata(List.of())
                    .startAt(OffsetDateTime.parse("2021-12-08T06:03:19.583Z"))
                    .status(AtsInterviewStatus.SCHEDULED)
                    .updatedAt(OffsetDateTime.parse("2023-10-07T01:22:52.179Z"))
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

Updates the AtsScorecard identified by `id`. Provide the unified AtsScorecard fields to change in the request body.

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
                    .comment("Aliquam.")
                    .createdAt(OffsetDateTime.parse("2022-02-20T17:09:45.498Z"))
                    .id("43824f79-40bb-4533-b87c-a148a6b38a98")
                    .metadata(List.of())
                    .questions(List.of(
                        AtsScorecardQuestion.builder()
                            .text("Desidero modi tamdiu auxilium defessus adimpleo clementia tero.")
                            .description("Pecto vulpes libero vomer comburo.")
                            .build(),
                        AtsScorecardQuestion.builder()
                            .text("Decretum.")
                            .answer("Conatus cicuta doloremque statua bonus.")
                            .description("Aduro viscus celebrer.")
                            .build()))
                    .recommendation(Recommendation.STRONG_YES)
                    .updatedAt(OffsetDateTime.parse("2023-06-15T11:41:18.013Z"))
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

Deletes the AtsActivity identified by `id`.

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

Deletes the AtsApplication identified by `id`.

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

Deletes the AtsCandidate identified by `id`.

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

Deletes the AtsCompany identified by `id`.

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

Deletes the AtsDocument identified by `id`.

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

Deletes the AtsInterview identified by `id`.

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

Deletes the AtsScorecard identified by `id`.

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

Updates the AtsActivity identified by `id`. Provide the unified AtsActivity fields to change in the request body.

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
                    .description("Reprehenderit.")
                    .id("c90114ac-b97f-46d4-82fb-b6022f1b7d5f")
                    .isPrivate(false)
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("ae46d6db-e9b3-4153-be35-cb790fe6b37a")
                            .namespace("activity")
                            .slug("verto")
                            .value(AtsMetadataValue.of("Sint varietas officia aequus stillicidium vereor victus tricesimus vester."))
                            .build()))
                    .subType("TASK")
                    .title("Amplus sapiente cimentarius.")
                    .type(AtsActivityType.TASK)
                    .updatedAt(OffsetDateTime.parse("2026-05-05T13:17:18.773Z"))
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

Updates the AtsApplication identified by `id`. Provide the unified AtsApplication fields to change in the request body.

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
                    .appliedAt(OffsetDateTime.parse("2025-10-23T02:30:45.647Z"))
                    .createdAt(OffsetDateTime.parse("2023-10-17T07:19:48.787Z"))
                    .hiredAt(OffsetDateTime.parse("2026-06-12T10:51:49.486Z"))
                    .id("49eb9907-ebaa-4961-a74b-556bd7f77a01")
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("fc1bad16-5849-4eaf-a9b7-91c1bc0e0ea3")
                            .namespace("application")
                            .slug("arguo")
                            .value(AtsMetadataValue.of("Defessus occaecati adflicto caecus claustrum annus addo."))
                            .build()))
                    .offers(List.of())
                    .originalStatus("caput")
                    .originalSubstatus("admiratio")
                    .rejectedAt(OffsetDateTime.parse("2026-11-16T04:33:37.919Z"))
                    .rejectedReason("Talio credo vomica allatus stella.")
                    .source("alii")
                    .status(AtsApplicationStatus.REVIEWING)
                    .summary("Crebro nostrum alias sponte turbo sopor vergo surculus nam copiose. Enim casso cursus aestus deprecator. Despecto tabella argentum decretum cultellus aveho distinctio verecundia stella.")
                    .updatedAt(OffsetDateTime.parse("2026-11-23T06:10:04.280Z"))
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

Updates the AtsCandidate identified by `id`. Provide the unified AtsCandidate fields to change in the request body.

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
                        .address1("699 Legros Falls")
                        .city("New Albertoboro")
                        .countryCode("US")
                        .postalCode("85550-0688")
                        .region("Minnesota")
                        .regionCode("WY")
                        .build())
                    .companyName("Doyle-Kutch LLC")
                    .createdAt(OffsetDateTime.parse("2023-10-16T05:42:56.049Z"))
                    .dateOfBirth(OffsetDateTime.parse("1994-07-05T19:48:57.631Z"))
                    .education(List.of(
                        AtsCandidateEducation.builder()
                            .degree("wilt powerfully")
                            .endAt(OffsetDateTime.parse("1978-04-14T07:58:36.326Z"))
                            .fieldOfStudy("totam")
                            .institution("Wunsch - Grimes-Heller")
                            .level("phd")
                            .startAt(OffsetDateTime.parse("1994-06-09T13:31:39.059Z"))
                            .build(),
                        AtsCandidateEducation.builder()
                            .degree("substantial yum")
                            .endAt(OffsetDateTime.parse("1989-09-06T03:32:39.901Z"))
                            .fieldOfStudy("commodi")
                            .institution("Franecki and Sons")
                            .level("highschool")
                            .startAt(OffsetDateTime.parse("1992-11-28T20:23:20.311Z"))
                            .build()))
                    .emails(List.of(
                        AtsEmail.builder()
                            .email("alyce.rempel@outlook.com")
                            .name("Alyce Rempel")
                            .type(AtsEmailType.HOME)
                            .build()))
                    .experiences(List.of(
                        AtsCandidateExperience.builder()
                            .companyName("Mayert - Rohan")
                            .endAt(OffsetDateTime.parse("1974-03-01T17:02:58.824Z"))
                            .startAt(OffsetDateTime.parse("1999-09-21T22:12:51.663Z"))
                            .title("Central Response Designer")
                            .build(),
                        AtsCandidateExperience.builder()
                            .companyName("Padberg, Keeling and Franey")
                            .endAt(OffsetDateTime.parse("2004-10-14T14:01:00.717Z"))
                            .startAt(OffsetDateTime.parse("1996-12-15T04:12:04.582Z"))
                            .title("Central Communications Producer")
                            .build()))
                    .firstName("Alyce")
                    .hasDoNotContact(false)
                    .id("c5422b74-583c-4c2e-9ec8-23e5a1098fef")
                    .imageUrl("https://avatars.githubusercontent.com/u/99913246")
                    .isPrivate(true)
                    .jobIds(List.of())
                    .lastName("Rempel")
                    .linkUrls(List.of(
                        "https://www.linkedin.com/in/alyce-rempel"))
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("2b04da68-cf48-4f71-b6b1-2e10091b7bbf")
                            .namespace("custom")
                            .slug("custom_field")
                            .value(AtsMetadataValue.of("chirographum"))
                            .build()))
                    .name("Alyce Rempel")
                    .origin(Origin.AGENCY)
                    .skills(List.of(
                        "curvo",
                        "voveo"))
                    .sources(List.of(
                        "tripudio",
                        "volup"))
                    .summary("Spero nostrum damnatio averto pecus cervus aspicio. Stabilis thesis admiratio. Acquiro sperno voluptate laboriosam comitatus teres doloribus canonicus considero tersus.")
                    .tags(List.of(
                        "alo"))
                    .telephones(List.of(
                        AtsTelephone.builder()
                            .telephone("(251) 489-6457")
                            .type(AtsTelephoneType.MOBILE)
                            .build()))
                    .title("Internal Paradigm Consultant")
                    .updatedAt(OffsetDateTime.parse("2024-05-05T03:02:32.750Z"))
                    .webUrl("https://light-meander.com/")
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

Updates the AtsCompany identified by `id`. Provide the unified AtsCompany fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsCompany" method="put" path="/ats/{connection_id}/company/{id}" example="ats_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.*;

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
                    .fees(List.of(
                        AtsFee.builder()
                            .percentage(23d)
                            .type(AtsFeeType.CONTINGENCY)
                            .build()))
                    .id("c8c2ad67-5974-492b-90ab-d715fac0df23")
                    .name("Streich, Mohr and Barton")
                    .phone("245-586-5728 x0090")
                    .updatedAt(OffsetDateTime.parse("2020-10-08T02:33:15.603Z"))
                    .websiteUrl("https://www.streichmohr.com")
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

Updates the AtsDocument identified by `id`. Provide the unified AtsDocument fields to change in the request body.

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
                    .documentUrl("https://thin-video.org/")
                    .filename("reggie_langosh_resume.pdf")
                    .id("06592e05-8879-4d55-b480-1b819a6fa673")
                    .metadata(List.of())
                    .type(AtsDocumentType.COVER_LETTER)
                    .updatedAt(OffsetDateTime.parse("2022-12-16T05:36:26.927Z"))
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

Updates the AtsInterview identified by `id`. Provide the unified AtsInterview fields to change in the request body.

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
                    .id("0fcc69b8-b494-4256-8ee2-22266d35f5c5")
                    .location("9604 S Pine Street")
                    .meetingUrl("https://gummy-battle.name/")
                    .metadata(List.of())
                    .startAt(OffsetDateTime.parse("2021-12-08T06:03:19.583Z"))
                    .status(AtsInterviewStatus.SCHEDULED)
                    .updatedAt(OffsetDateTime.parse("2023-10-07T01:22:52.179Z"))
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

Updates the AtsScorecard identified by `id`. Provide the unified AtsScorecard fields to change in the request body.

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
                    .comment("Aliquam.")
                    .createdAt(OffsetDateTime.parse("2022-02-20T17:09:45.498Z"))
                    .id("43824f79-40bb-4533-b87c-a148a6b38a98")
                    .metadata(List.of())
                    .questions(List.of(
                        AtsScorecardQuestion.builder()
                            .text("Desidero modi tamdiu auxilium defessus adimpleo clementia tero.")
                            .description("Pecto vulpes libero vomer comburo.")
                            .build(),
                        AtsScorecardQuestion.builder()
                            .text("Decretum.")
                            .answer("Conatus cicuta doloremque statua bonus.")
                            .description("Aduro viscus celebrer.")
                            .build()))
                    .recommendation(Recommendation.STRONG_YES)
                    .updatedAt(OffsetDateTime.parse("2023-06-15T11:41:18.013Z"))
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