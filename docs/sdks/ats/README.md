# Ats
(*ats*)

### Available Operations

* [createAtsActivity](#createatsactivity) - Create an activity
* [createAtsApplication](#createatsapplication) - Create an application
* [createAtsCandidate](#createatscandidate) - Create a candidate
* [createAtsDocument](#createatsdocument) - Create a document
* [createAtsInterview](#createatsinterview) - Create a interview
* [createAtsJob](#createatsjob) - Create a job
* [createAtsScorecard](#createatsscorecard) - Create a scorecard
* [getAtsActivity](#getatsactivity) - Retrieve an activity
* [getAtsApplication](#getatsapplication) - Retrieve an application
* [getAtsCandidate](#getatscandidate) - Retrieve a candidate
* [getAtsCompany](#getatscompany) - Retrieve a company
* [getAtsDocument](#getatsdocument) - Retrieve a document
* [getAtsInterview](#getatsinterview) - Retrieve a interview
* [getAtsJob](#getatsjob) - Retrieve a job
* [getAtsScorecard](#getatsscorecard) - Retrieve a scorecard
* [listAtsActivities](#listatsactivities) - List all activities
* [listAtsApplications](#listatsapplications) - List all applications
* [listAtsApplicationstatuses](#listatsapplicationstatuses) - List all application statuses
* [listAtsCandidates](#listatscandidates) - List all candidates
* [listAtsCompanies](#listatscompanies) - List all companies
* [listAtsDocuments](#listatsdocuments) - List all documents
* [listAtsInterviews](#listatsinterviews) - List all interviews
* [listAtsJobs](#listatsjobs) - List all jobs
* [listAtsScorecards](#listatsscorecards) - List all scorecards
* [patchAtsActivity](#patchatsactivity) - Update an activity
* [patchAtsApplication](#patchatsapplication) - Update an application
* [patchAtsCandidate](#patchatscandidate) - Update a candidate
* [patchAtsDocument](#patchatsdocument) - Update a document
* [patchAtsInterview](#patchatsinterview) - Update a interview
* [patchAtsJob](#patchatsjob) - Update a job
* [patchAtsScorecard](#patchatsscorecard) - Update a scorecard
* [removeAtsActivity](#removeatsactivity) - Remove an activity
* [removeAtsApplication](#removeatsapplication) - Remove an application
* [removeAtsCandidate](#removeatscandidate) - Remove a candidate
* [removeAtsDocument](#removeatsdocument) - Remove a document
* [removeAtsInterview](#removeatsinterview) - Remove a interview
* [removeAtsJob](#removeatsjob) - Remove a job
* [removeAtsScorecard](#removeatsscorecard) - Remove a scorecard
* [updateAtsActivity](#updateatsactivity) - Update an activity
* [updateAtsApplication](#updateatsapplication) - Update an application
* [updateAtsCandidate](#updateatscandidate) - Update a candidate
* [updateAtsDocument](#updateatsdocument) - Update a document
* [updateAtsInterview](#updateatsinterview) - Update a interview
* [updateAtsJob](#updateatsjob) - Update a job
* [updateAtsScorecard](#updateatsscorecard) - Update a scorecard

## createAtsActivity

Create an activity

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAtsActivityRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAtsActivityResponse;
import com.unifiedapi.unifiedto.models.operations.CreateAtsActivitySecurity;
import com.unifiedapi.unifiedto.models.shared.AtsActivity;
import com.unifiedapi.unifiedto.models.shared.AtsActivityType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsActivityRequest req = new CreateAtsActivityRequest(
                "<value>"){{
                atsActivity = new AtsActivity(
                    "<value>"){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2022-11-03T02:06:02.932Z");
                    description = "Future-proofed non-volatile artificial intelligence";
                    documentId = "<value>";
                    id = "<id>";
                    interviewId = "<value>";
                    isPrivate = false;
                    jobId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    type = AtsActivityType.NOTE;
                    updatedAt = OffsetDateTime.parse("2023-01-22T20:04:14.417Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsActivityResponse res = sdk.ats.createAtsActivity(req, new CreateAtsActivitySecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsActivity != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.CreateAtsActivityRequest](../../models/operations/CreateAtsActivityRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.CreateAtsActivitySecurity](../../models/operations/CreateAtsActivitySecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAtsActivityResponse](../../models/operations/CreateAtsActivityResponse.md)**


## createAtsApplication

Create an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationResponse;
import com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationAnswer;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationRequest req = new CreateAtsApplicationRequest(
                "<value>"){{
                atsApplication = new AtsApplication(
){{
                    answers = new com.unifiedapi.unifiedto.models.shared.AtsApplicationAnswer[]{{
                        add(new AtsApplicationAnswer(
                        new String[]{{
                            add("<value>"),
                        }},
                        "<value>"){{
                            answers = new String[]{{
                                add("<value>"),
                            }};
                            questionId = "<value>";
                        }}),
                    }};
                    appliedAt = OffsetDateTime.parse("2024-03-09T05:03:52.917Z");
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2024-09-22T12:50:56.305Z");
                    hiredAt = OffsetDateTime.parse("2023-01-19T06:26:51.678Z");
                    id = "<id>";
                    jobId = "<value>";
                    originalStatus = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    rejectedAt = OffsetDateTime.parse("2023-01-30T06:58:14.500Z");
                    rejectedReason = "<value>";
                    source = "<value>";
                    status = AtsApplicationStatus.SECOND_INTERVIEW;
                    updatedAt = OffsetDateTime.parse("2024-09-21T21:31:42.360Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationResponse res = sdk.ats.createAtsApplication(req, new CreateAtsApplicationSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsApplication != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationRequest](../../models/operations/CreateAtsApplicationRequest.md)   | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationSecurity](../../models/operations/CreateAtsApplicationSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationResponse](../../models/operations/CreateAtsApplicationResponse.md)**


## createAtsCandidate

Create a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateResponse;
import com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.Origin;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateRequest req = new CreateAtsCandidateRequest(
                "<value>"){{
                atsCandidate = new AtsCandidate(
){{
                    address = new PropertyAtsCandidateAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "South Hill";
                        country = "Denmark";
                        countryCode = "KM";
                        postalCode = "72991-5163";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    companyId = "<value>";
                    companyName = "Pollich - Lubowitz";
                    createdAt = OffsetDateTime.parse("2022-03-06T00:47:39.352Z");
                    dateOfBirth = OffsetDateTime.parse("2023-11-19T09:25:00.753Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail(
                        "<value>"){{
                            email = "Mallory99@hotmail.com";
                        }}),
                    }};
                    externalId = "<value>";
                    id = "<id>";
                    imageUrl = "<value>";
                    linkUrls = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    origin = Origin.AGENCY;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    sources = new String[]{{
                        add("<value>"),
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2022-09-27T06:32:21.998Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateResponse res = sdk.ats.createAtsCandidate(req, new CreateAtsCandidateSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsCandidate != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateRequest](../../models/operations/CreateAtsCandidateRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateSecurity](../../models/operations/CreateAtsCandidateSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateResponse](../../models/operations/CreateAtsCandidateResponse.md)**


## createAtsDocument

Create a document

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentResponse;
import com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsDocument;
import com.unifiedapi.unifiedto.models.shared.AtsDocumentType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentRequest req = new CreateAtsDocumentRequest(
                "<value>"){{
                atsDocument = new AtsDocument(
){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2022-04-25T01:00:46.478Z");
                    documentData = "<value>";
                    documentUrl = "<value>";
                    filename = "mouse_per_missouri.mp4";
                    id = "<id>";
                    jobId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    type = AtsDocumentType.OFFER_PACKET;
                    updatedAt = OffsetDateTime.parse("2022-12-28T17:22:48.342Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentResponse res = sdk.ats.createAtsDocument(req, new CreateAtsDocumentSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsDocument != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentRequest](../../models/operations/CreateAtsDocumentRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentSecurity](../../models/operations/CreateAtsDocumentSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentResponse](../../models/operations/CreateAtsDocumentResponse.md)**


## createAtsInterview

Create a interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAtsInterviewRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAtsInterviewResponse;
import com.unifiedapi.unifiedto.models.operations.CreateAtsInterviewSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsInterviewRequest req = new CreateAtsInterviewRequest(
                "<value>"){{
                atsInterview = new AtsInterview(
){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2023-01-11T04:08:22.567Z");
                    endAt = OffsetDateTime.parse("2024-12-21T08:47:56.138Z");
                    externalEventXref = "<value>";
                    id = "<id>";
                    jobId = "<value>";
                    location = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    startAt = OffsetDateTime.parse("2023-11-20T00:14:00.277Z");
                    status = AtsInterviewStatus.NEEDS_SCHEDULING;
                    updatedAt = OffsetDateTime.parse("2022-02-07T15:15:23.855Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsInterviewResponse res = sdk.ats.createAtsInterview(req, new CreateAtsInterviewSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsInterview != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.CreateAtsInterviewRequest](../../models/operations/CreateAtsInterviewRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.CreateAtsInterviewSecurity](../../models/operations/CreateAtsInterviewSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAtsInterviewResponse](../../models/operations/CreateAtsInterviewResponse.md)**


## createAtsJob

Create a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAtsJobRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAtsJobResponse;
import com.unifiedapi.unifiedto.models.operations.CreateAtsJobSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobQuestion;
import com.unifiedapi.unifiedto.models.shared.AtsJobQuestionType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.EmploymentType;
import com.unifiedapi.unifiedto.models.shared.Frequency;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsJobRequest req = new CreateAtsJobRequest(
                "<value>"){{
                atsJob = new AtsJob(
){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(
                        ){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2022-01-14T18:31:06.376Z");
                    companyId = "<value>";
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(
                        AtsCompensationType.EQUITY){{
                            type = AtsCompensationType.STOCK_OPTIONS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2023-03-05T16:04:54.121Z");
                    departments = new String[]{{
                        add("<value>"),
                    }};
                    description = "Operative 24 hour methodology";
                    employmentType = EmploymentType.OTHER;
                    hiringManagerIds = new String[]{{
                        add("<value>"),
                    }};
                    id = "<id>";
                    languageLocale = "<value>";
                    name = "<value>";
                    numberOfOpenings = 8330.69d;
                    publicJobUrls = new String[]{{
                        add("<value>"),
                    }};
                    questions = new com.unifiedapi.unifiedto.models.shared.AtsJobQuestion[]{{
                        add(new AtsJobQuestion(
                        "<value>",
                        AtsJobQuestionType.URL){{
                            question = "<value>";
                            type = AtsJobQuestionType.UNIVERSITY;
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    recruiterIds = new String[]{{
                        add("<value>"),
                    }};
                    remote = false;
                    status = AtsJobStatus.DRAFT;
                    updatedAt = OffsetDateTime.parse("2022-09-14T17:37:48.375Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsJobResponse res = sdk.ats.createAtsJob(req, new CreateAtsJobSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsJob != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.CreateAtsJobRequest](../../models/operations/CreateAtsJobRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [com.unifiedapi.unifiedto.models.operations.CreateAtsJobSecurity](../../models/operations/CreateAtsJobSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAtsJobResponse](../../models/operations/CreateAtsJobResponse.md)**


## createAtsScorecard

Create a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardResponse;
import com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardQuestion;
import com.unifiedapi.unifiedto.models.shared.Recommendation;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardRequest req = new CreateAtsScorecardRequest(
                "<value>"){{
                atsScorecard = new AtsScorecard(
){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    comment = "The Nagasaki Lander is the trademarked name of several series of Nagasaki sport bikes, that started with the 1984 ABC800J";
                    createdAt = OffsetDateTime.parse("2022-04-24T10:18:34.661Z");
                    id = "<id>";
                    interviewId = "<value>";
                    interviewerId = "<value>";
                    jobId = "<value>";
                    questions = new com.unifiedapi.unifiedto.models.shared.AtsScorecardQuestion[]{{
                        add(new AtsScorecardQuestion(
                        "<value>"){{
                            text = "<value>";
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    recommendation = Recommendation.NO;
                    updatedAt = OffsetDateTime.parse("2023-04-02T03:31:06.456Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardResponse res = sdk.ats.createAtsScorecard(req, new CreateAtsScorecardSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsScorecard != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardRequest](../../models/operations/CreateAtsScorecardRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardSecurity](../../models/operations/CreateAtsScorecardSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardResponse](../../models/operations/CreateAtsScorecardResponse.md)**


## getAtsActivity

Retrieve an activity

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsActivityRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsActivityResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsActivitySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsActivityRequest req = new GetAtsActivityRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsActivityResponse res = sdk.ats.getAtsActivity(req, new GetAtsActivitySecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsActivity != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetAtsActivityRequest](../../models/operations/GetAtsActivityRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetAtsActivitySecurity](../../models/operations/GetAtsActivitySecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsActivityResponse](../../models/operations/GetAtsActivityResponse.md)**


## getAtsApplication

Retrieve an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsApplicationResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsApplicationSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsApplicationRequest req = new GetAtsApplicationRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsApplicationResponse res = sdk.ats.getAtsApplication(req, new GetAtsApplicationSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsApplication != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetAtsApplicationRequest](../../models/operations/GetAtsApplicationRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.GetAtsApplicationSecurity](../../models/operations/GetAtsApplicationSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsApplicationResponse](../../models/operations/GetAtsApplicationResponse.md)**


## getAtsCandidate

Retrieve a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsCandidateResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsCandidateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsCandidateRequest req = new GetAtsCandidateRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsCandidateResponse res = sdk.ats.getAtsCandidate(req, new GetAtsCandidateSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsCandidate != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetAtsCandidateRequest](../../models/operations/GetAtsCandidateRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [com.unifiedapi.unifiedto.models.operations.GetAtsCandidateSecurity](../../models/operations/GetAtsCandidateSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsCandidateResponse](../../models/operations/GetAtsCandidateResponse.md)**


## getAtsCompany

Retrieve a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsCompanyResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsCompanySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsCompanyRequest req = new GetAtsCompanyRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsCompanyResponse res = sdk.ats.getAtsCompany(req, new GetAtsCompanySecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsCompany != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetAtsCompanyRequest](../../models/operations/GetAtsCompanyRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetAtsCompanySecurity](../../models/operations/GetAtsCompanySecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsCompanyResponse](../../models/operations/GetAtsCompanyResponse.md)**


## getAtsDocument

Retrieve a document

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsDocumentRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsDocumentResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsDocumentSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsDocumentRequest req = new GetAtsDocumentRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsDocumentResponse res = sdk.ats.getAtsDocument(req, new GetAtsDocumentSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsDocument != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetAtsDocumentRequest](../../models/operations/GetAtsDocumentRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetAtsDocumentSecurity](../../models/operations/GetAtsDocumentSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsDocumentResponse](../../models/operations/GetAtsDocumentResponse.md)**


## getAtsInterview

Retrieve a interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsInterviewRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsInterviewResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsInterviewSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsInterviewRequest req = new GetAtsInterviewRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsInterviewResponse res = sdk.ats.getAtsInterview(req, new GetAtsInterviewSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsInterview != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetAtsInterviewRequest](../../models/operations/GetAtsInterviewRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [com.unifiedapi.unifiedto.models.operations.GetAtsInterviewSecurity](../../models/operations/GetAtsInterviewSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsInterviewResponse](../../models/operations/GetAtsInterviewResponse.md)**


## getAtsJob

Retrieve a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsJobRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsJobResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsJobSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsJobRequest req = new GetAtsJobRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsJobResponse res = sdk.ats.getAtsJob(req, new GetAtsJobSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsJob != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetAtsJobRequest](../../models/operations/GetAtsJobRequest.md)   | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [com.unifiedapi.unifiedto.models.operations.GetAtsJobSecurity](../../models/operations/GetAtsJobSecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsJobResponse](../../models/operations/GetAtsJobResponse.md)**


## getAtsScorecard

Retrieve a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsScorecardRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsScorecardResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsScorecardSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsScorecardRequest req = new GetAtsScorecardRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsScorecardResponse res = sdk.ats.getAtsScorecard(req, new GetAtsScorecardSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsScorecard != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetAtsScorecardRequest](../../models/operations/GetAtsScorecardRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [com.unifiedapi.unifiedto.models.operations.GetAtsScorecardSecurity](../../models/operations/GetAtsScorecardSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsScorecardResponse](../../models/operations/GetAtsScorecardResponse.md)**


## listAtsActivities

List all activities

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsActivitiesRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsActivitiesResponse;
import com.unifiedapi.unifiedto.models.operations.ListAtsActivitiesSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsActivitiesRequest req = new ListAtsActivitiesRequest(
                "<value>"){{
                applicationId = "<value>";
                candidateId = "<value>";
                documentId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                interviewId = "<value>";
                jobId = "<value>";
                limit = 2367.19d;
                offset = 8254.25d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-11-13T18:19:17.967Z");
                userId = "<value>";

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsActivitiesResponse res = sdk.ats.listAtsActivities(req, new ListAtsActivitiesSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsActivities != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.ListAtsActivitiesRequest](../../models/operations/ListAtsActivitiesRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.ListAtsActivitiesSecurity](../../models/operations/ListAtsActivitiesSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsActivitiesResponse](../../models/operations/ListAtsActivitiesResponse.md)**


## listAtsApplications

List all applications

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsResponse;
import com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsRequest req = new ListAtsApplicationsRequest(
                "<value>"){{
                candidateId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                jobId = "<value>";
                limit = 441.56d;
                offset = 1448.74d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-12-21T20:30:01.596Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsResponse res = sdk.ats.listAtsApplications(req, new ListAtsApplicationsSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsApplications != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsRequest](../../models/operations/ListAtsApplicationsRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsSecurity](../../models/operations/ListAtsApplicationsSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsResponse](../../models/operations/ListAtsApplicationsResponse.md)**


## listAtsApplicationstatuses

List all application statuses

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesResponse;
import com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesRequest req = new ListAtsApplicationstatusesRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 5199.96d;
                offset = 7673.65d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2024-03-25T18:11:33.180Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesResponse res = sdk.ats.listAtsApplicationstatuses(req, new ListAtsApplicationstatusesSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsStatuses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesRequest](../../models/operations/ListAtsApplicationstatusesRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesSecurity](../../models/operations/ListAtsApplicationstatusesSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesResponse](../../models/operations/ListAtsApplicationstatusesResponse.md)**


## listAtsCandidates

List all candidates

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesResponse;
import com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesRequest req = new ListAtsCandidatesRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 6384.09d;
                offset = 7452.94d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-03-18T00:58:25.541Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesResponse res = sdk.ats.listAtsCandidates(req, new ListAtsCandidatesSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsCandidates != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesRequest](../../models/operations/ListAtsCandidatesRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesSecurity](../../models/operations/ListAtsCandidatesSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesResponse](../../models/operations/ListAtsCandidatesResponse.md)**


## listAtsCompanies

List all companies

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesResponse;
import com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesRequest req = new ListAtsCompaniesRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 6933.84d;
                offset = 7946.52d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2024-10-01T21:39:38.971Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesResponse res = sdk.ats.listAtsCompanies(req, new ListAtsCompaniesSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsCompanies != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesRequest](../../models/operations/ListAtsCompaniesRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesSecurity](../../models/operations/ListAtsCompaniesSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesResponse](../../models/operations/ListAtsCompaniesResponse.md)**


## listAtsDocuments

List all documents

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsResponse;
import com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsRequest req = new ListAtsDocumentsRequest(
                "<value>"){{
                applicationId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 9635.37d;
                offset = 8402.77d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2023-08-31T00:55:54.895Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsResponse res = sdk.ats.listAtsDocuments(req, new ListAtsDocumentsSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsDocuments != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsRequest](../../models/operations/ListAtsDocumentsRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsSecurity](../../models/operations/ListAtsDocumentsSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsResponse](../../models/operations/ListAtsDocumentsResponse.md)**


## listAtsInterviews

List all interviews

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsInterviewsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsInterviewsResponse;
import com.unifiedapi.unifiedto.models.operations.ListAtsInterviewsSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsInterviewsRequest req = new ListAtsInterviewsRequest(
                "<value>"){{
                applicationId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 2562.12d;
                offset = 1185.02d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-09-28T15:15:00.508Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsInterviewsResponse res = sdk.ats.listAtsInterviews(req, new ListAtsInterviewsSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsInterviews != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.ListAtsInterviewsRequest](../../models/operations/ListAtsInterviewsRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.ListAtsInterviewsSecurity](../../models/operations/ListAtsInterviewsSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsInterviewsResponse](../../models/operations/ListAtsInterviewsResponse.md)**


## listAtsJobs

List all jobs

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsJobsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsJobsResponse;
import com.unifiedapi.unifiedto.models.operations.ListAtsJobsSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsJobsRequest req = new ListAtsJobsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 3958.99d;
                offset = 3223.84d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2023-03-04T01:14:05.456Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsJobsResponse res = sdk.ats.listAtsJobs(req, new ListAtsJobsSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsJobs != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.ListAtsJobsRequest](../../models/operations/ListAtsJobsRequest.md)   | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [com.unifiedapi.unifiedto.models.operations.ListAtsJobsSecurity](../../models/operations/ListAtsJobsSecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsJobsResponse](../../models/operations/ListAtsJobsResponse.md)**


## listAtsScorecards

List all scorecards

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsResponse;
import com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsRequest req = new ListAtsScorecardsRequest(
                "<value>"){{
                applicationId = "<value>";
                candidateId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                interviewId = "<value>";
                jobId = "<value>";
                limit = 5126.98d;
                offset = 8077.44d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2024-08-19T14:46:22.333Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsResponse res = sdk.ats.listAtsScorecards(req, new ListAtsScorecardsSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsScorecards != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsRequest](../../models/operations/ListAtsScorecardsRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsSecurity](../../models/operations/ListAtsScorecardsSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsResponse](../../models/operations/ListAtsScorecardsResponse.md)**


## patchAtsActivity

Update an activity

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsActivityRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsActivityResponse;
import com.unifiedapi.unifiedto.models.operations.PatchAtsActivitySecurity;
import com.unifiedapi.unifiedto.models.shared.AtsActivity;
import com.unifiedapi.unifiedto.models.shared.AtsActivityType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsActivityRequest req = new PatchAtsActivityRequest(
                "<value>",
                "<value>"){{
                atsActivity = new AtsActivity(
                    "<value>"){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2024-11-03T16:46:57.187Z");
                    description = "Compatible reciprocal archive";
                    documentId = "<value>";
                    id = "<id>";
                    interviewId = "<value>";
                    isPrivate = false;
                    jobId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    type = AtsActivityType.NOTE;
                    updatedAt = OffsetDateTime.parse("2022-05-17T01:47:31.125Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsActivityResponse res = sdk.ats.patchAtsActivity(req, new PatchAtsActivitySecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsActivity != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchAtsActivityRequest](../../models/operations/PatchAtsActivityRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PatchAtsActivitySecurity](../../models/operations/PatchAtsActivitySecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsActivityResponse](../../models/operations/PatchAtsActivityResponse.md)**


## patchAtsApplication

Update an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationResponse;
import com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationAnswer;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationRequest req = new PatchAtsApplicationRequest(
                "<value>",
                "<value>"){{
                atsApplication = new AtsApplication(
){{
                    answers = new com.unifiedapi.unifiedto.models.shared.AtsApplicationAnswer[]{{
                        add(new AtsApplicationAnswer(
                        new String[]{{
                            add("<value>"),
                        }},
                        "<value>"){{
                            answers = new String[]{{
                                add("<value>"),
                            }};
                            questionId = "<value>";
                        }}),
                    }};
                    appliedAt = OffsetDateTime.parse("2023-12-15T20:36:09.499Z");
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2022-01-06T05:56:57.062Z");
                    hiredAt = OffsetDateTime.parse("2023-12-05T05:20:09.174Z");
                    id = "<id>";
                    jobId = "<value>";
                    originalStatus = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    rejectedAt = OffsetDateTime.parse("2022-07-13T02:34:40.392Z");
                    rejectedReason = "<value>";
                    source = "<value>";
                    status = AtsApplicationStatus.FIRST_INTERVIEW;
                    updatedAt = OffsetDateTime.parse("2024-01-24T17:35:54.628Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationResponse res = sdk.ats.patchAtsApplication(req, new PatchAtsApplicationSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsApplication != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationRequest](../../models/operations/PatchAtsApplicationRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationSecurity](../../models/operations/PatchAtsApplicationSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationResponse](../../models/operations/PatchAtsApplicationResponse.md)**


## patchAtsCandidate

Update a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateResponse;
import com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.Origin;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateRequest req = new PatchAtsCandidateRequest(
                "<value>",
                "<value>"){{
                atsCandidate = new AtsCandidate(
){{
                    address = new PropertyAtsCandidateAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Fort Bridget";
                        country = "Sri Lanka";
                        countryCode = "GI";
                        postalCode = "46054";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    companyId = "<value>";
                    companyName = "Donnelly - Bartell";
                    createdAt = OffsetDateTime.parse("2024-01-07T04:20:35.612Z");
                    dateOfBirth = OffsetDateTime.parse("2023-10-20T03:10:26.424Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail(
                        "<value>"){{
                            email = "Roslyn.Bergnaum@gmail.com";
                        }}),
                    }};
                    externalId = "<value>";
                    id = "<id>";
                    imageUrl = "<value>";
                    linkUrls = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    origin = Origin.UNIVERSITY;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    sources = new String[]{{
                        add("<value>"),
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2024-05-16T04:49:59.355Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateResponse res = sdk.ats.patchAtsCandidate(req, new PatchAtsCandidateSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsCandidate != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateRequest](../../models/operations/PatchAtsCandidateRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateSecurity](../../models/operations/PatchAtsCandidateSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateResponse](../../models/operations/PatchAtsCandidateResponse.md)**


## patchAtsDocument

Update a document

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentResponse;
import com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsDocument;
import com.unifiedapi.unifiedto.models.shared.AtsDocumentType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentRequest req = new PatchAtsDocumentRequest(
                "<value>",
                "<value>"){{
                atsDocument = new AtsDocument(
){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2022-04-01T11:33:08.084Z");
                    documentData = "<value>";
                    documentUrl = "<value>";
                    filename = "future_underpin.mp4v";
                    id = "<id>";
                    jobId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    type = AtsDocumentType.OFFER_LETTER;
                    updatedAt = OffsetDateTime.parse("2023-02-14T10:37:18.255Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentResponse res = sdk.ats.patchAtsDocument(req, new PatchAtsDocumentSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsDocument != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentRequest](../../models/operations/PatchAtsDocumentRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentSecurity](../../models/operations/PatchAtsDocumentSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentResponse](../../models/operations/PatchAtsDocumentResponse.md)**


## patchAtsInterview

Update a interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsInterviewRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsInterviewResponse;
import com.unifiedapi.unifiedto.models.operations.PatchAtsInterviewSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsInterviewRequest req = new PatchAtsInterviewRequest(
                "<value>",
                "<value>"){{
                atsInterview = new AtsInterview(
){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2024-09-11T19:09:34.526Z");
                    endAt = OffsetDateTime.parse("2022-05-28T22:25:51.616Z");
                    externalEventXref = "<value>";
                    id = "<id>";
                    jobId = "<value>";
                    location = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    startAt = OffsetDateTime.parse("2022-09-10T07:32:43.966Z");
                    status = AtsInterviewStatus.CANCELED;
                    updatedAt = OffsetDateTime.parse("2024-03-18T02:52:45.725Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsInterviewResponse res = sdk.ats.patchAtsInterview(req, new PatchAtsInterviewSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsInterview != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchAtsInterviewRequest](../../models/operations/PatchAtsInterviewRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PatchAtsInterviewSecurity](../../models/operations/PatchAtsInterviewSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsInterviewResponse](../../models/operations/PatchAtsInterviewResponse.md)**


## patchAtsJob

Update a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsJobRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsJobResponse;
import com.unifiedapi.unifiedto.models.operations.PatchAtsJobSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobQuestion;
import com.unifiedapi.unifiedto.models.shared.AtsJobQuestionType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.EmploymentType;
import com.unifiedapi.unifiedto.models.shared.Frequency;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsJobRequest req = new PatchAtsJobRequest(
                "<value>",
                "<value>"){{
                atsJob = new AtsJob(
){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(
                        ){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2022-08-09T17:44:16.617Z");
                    companyId = "<value>";
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(
                        AtsCompensationType.EQUITY){{
                            type = AtsCompensationType.SALARY;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2022-03-27T20:59:56.374Z");
                    departments = new String[]{{
                        add("<value>"),
                    }};
                    description = "Extended empowering middleware";
                    employmentType = EmploymentType.FULL_TIME;
                    hiringManagerIds = new String[]{{
                        add("<value>"),
                    }};
                    id = "<id>";
                    languageLocale = "<value>";
                    name = "<value>";
                    numberOfOpenings = 238.34d;
                    publicJobUrls = new String[]{{
                        add("<value>"),
                    }};
                    questions = new com.unifiedapi.unifiedto.models.shared.AtsJobQuestion[]{{
                        add(new AtsJobQuestion(
                        "<value>",
                        AtsJobQuestionType.TEXTAREA){{
                            question = "<value>";
                            type = AtsJobQuestionType.URL;
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    recruiterIds = new String[]{{
                        add("<value>"),
                    }};
                    remote = false;
                    status = AtsJobStatus.DRAFT;
                    updatedAt = OffsetDateTime.parse("2022-07-04T19:22:46.036Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsJobResponse res = sdk.ats.patchAtsJob(req, new PatchAtsJobSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsJob != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchAtsJobRequest](../../models/operations/PatchAtsJobRequest.md)   | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PatchAtsJobSecurity](../../models/operations/PatchAtsJobSecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsJobResponse](../../models/operations/PatchAtsJobResponse.md)**


## patchAtsScorecard

Update a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardResponse;
import com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardQuestion;
import com.unifiedapi.unifiedto.models.shared.Recommendation;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardRequest req = new PatchAtsScorecardRequest(
                "<value>",
                "<value>"){{
                atsScorecard = new AtsScorecard(
){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    comment = "Ergonomic executive chair upholstered in bonded black leather and PVC padded seat and back for all-day comfort and support";
                    createdAt = OffsetDateTime.parse("2024-10-06T13:32:29.533Z");
                    id = "<id>";
                    interviewId = "<value>";
                    interviewerId = "<value>";
                    jobId = "<value>";
                    questions = new com.unifiedapi.unifiedto.models.shared.AtsScorecardQuestion[]{{
                        add(new AtsScorecardQuestion(
                        "<value>"){{
                            text = "<value>";
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    recommendation = Recommendation.YES;
                    updatedAt = OffsetDateTime.parse("2022-11-28T15:13:55.563Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardResponse res = sdk.ats.patchAtsScorecard(req, new PatchAtsScorecardSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsScorecard != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardRequest](../../models/operations/PatchAtsScorecardRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardSecurity](../../models/operations/PatchAtsScorecardSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardResponse](../../models/operations/PatchAtsScorecardResponse.md)**


## removeAtsActivity

Remove an activity

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsActivityRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsActivityResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsActivitySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsActivityRequest req = new RemoveAtsActivityRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsActivityResponse res = sdk.ats.removeAtsActivity(req, new RemoveAtsActivitySecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.RemoveAtsActivityRequest](../../models/operations/RemoveAtsActivityRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.RemoveAtsActivitySecurity](../../models/operations/RemoveAtsActivitySecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAtsActivityResponse](../../models/operations/RemoveAtsActivityResponse.md)**


## removeAtsApplication

Remove an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationRequest req = new RemoveAtsApplicationRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationResponse res = sdk.ats.removeAtsApplication(req, new RemoveAtsApplicationSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationRequest](../../models/operations/RemoveAtsApplicationRequest.md)   | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationSecurity](../../models/operations/RemoveAtsApplicationSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationResponse](../../models/operations/RemoveAtsApplicationResponse.md)**


## removeAtsCandidate

Remove a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateRequest req = new RemoveAtsCandidateRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateResponse res = sdk.ats.removeAtsCandidate(req, new RemoveAtsCandidateSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateRequest](../../models/operations/RemoveAtsCandidateRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateSecurity](../../models/operations/RemoveAtsCandidateSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateResponse](../../models/operations/RemoveAtsCandidateResponse.md)**


## removeAtsDocument

Remove a document

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentRequest req = new RemoveAtsDocumentRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentResponse res = sdk.ats.removeAtsDocument(req, new RemoveAtsDocumentSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentRequest](../../models/operations/RemoveAtsDocumentRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentSecurity](../../models/operations/RemoveAtsDocumentSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentResponse](../../models/operations/RemoveAtsDocumentResponse.md)**


## removeAtsInterview

Remove a interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewRequest req = new RemoveAtsInterviewRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewResponse res = sdk.ats.removeAtsInterview(req, new RemoveAtsInterviewSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewRequest](../../models/operations/RemoveAtsInterviewRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewSecurity](../../models/operations/RemoveAtsInterviewSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewResponse](../../models/operations/RemoveAtsInterviewResponse.md)**


## removeAtsJob

Remove a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsJobRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsJobResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsJobSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsJobRequest req = new RemoveAtsJobRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsJobResponse res = sdk.ats.removeAtsJob(req, new RemoveAtsJobSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.RemoveAtsJobRequest](../../models/operations/RemoveAtsJobRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [com.unifiedapi.unifiedto.models.operations.RemoveAtsJobSecurity](../../models/operations/RemoveAtsJobSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAtsJobResponse](../../models/operations/RemoveAtsJobResponse.md)**


## removeAtsScorecard

Remove a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardRequest req = new RemoveAtsScorecardRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardResponse res = sdk.ats.removeAtsScorecard(req, new RemoveAtsScorecardSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardRequest](../../models/operations/RemoveAtsScorecardRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardSecurity](../../models/operations/RemoveAtsScorecardSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardResponse](../../models/operations/RemoveAtsScorecardResponse.md)**


## updateAtsActivity

Update an activity

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsActivityRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsActivityResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsActivitySecurity;
import com.unifiedapi.unifiedto.models.shared.AtsActivity;
import com.unifiedapi.unifiedto.models.shared.AtsActivityType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsActivityRequest req = new UpdateAtsActivityRequest(
                "<value>",
                "<value>"){{
                atsActivity = new AtsActivity(
                    "<value>"){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2024-06-06T07:57:58.715Z");
                    description = "Total fault-tolerant collaboration";
                    documentId = "<value>";
                    id = "<id>";
                    interviewId = "<value>";
                    isPrivate = false;
                    jobId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    type = AtsActivityType.NOTE;
                    updatedAt = OffsetDateTime.parse("2022-10-09T08:30:27.721Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsActivityResponse res = sdk.ats.updateAtsActivity(req, new UpdateAtsActivitySecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsActivity != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.UpdateAtsActivityRequest](../../models/operations/UpdateAtsActivityRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.UpdateAtsActivitySecurity](../../models/operations/UpdateAtsActivitySecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAtsActivityResponse](../../models/operations/UpdateAtsActivityResponse.md)**


## updateAtsApplication

Update an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationAnswer;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationRequest req = new UpdateAtsApplicationRequest(
                "<value>",
                "<value>"){{
                atsApplication = new AtsApplication(
){{
                    answers = new com.unifiedapi.unifiedto.models.shared.AtsApplicationAnswer[]{{
                        add(new AtsApplicationAnswer(
                        new String[]{{
                            add("<value>"),
                        }},
                        "<value>"){{
                            answers = new String[]{{
                                add("<value>"),
                            }};
                            questionId = "<value>";
                        }}),
                    }};
                    appliedAt = OffsetDateTime.parse("2022-08-22T12:21:27.415Z");
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2022-06-04T12:46:09.878Z");
                    hiredAt = OffsetDateTime.parse("2022-02-09T08:57:01.906Z");
                    id = "<id>";
                    jobId = "<value>";
                    originalStatus = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    rejectedAt = OffsetDateTime.parse("2024-07-19T04:47:20.215Z");
                    rejectedReason = "<value>";
                    source = "<value>";
                    status = AtsApplicationStatus.OFFERED;
                    updatedAt = OffsetDateTime.parse("2023-03-17T03:12:00.865Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationResponse res = sdk.ats.updateAtsApplication(req, new UpdateAtsApplicationSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsApplication != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationRequest](../../models/operations/UpdateAtsApplicationRequest.md)   | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationSecurity](../../models/operations/UpdateAtsApplicationSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationResponse](../../models/operations/UpdateAtsApplicationResponse.md)**


## updateAtsCandidate

Update a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.Origin;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateRequest req = new UpdateAtsCandidateRequest(
                "<value>",
                "<value>"){{
                atsCandidate = new AtsCandidate(
){{
                    address = new PropertyAtsCandidateAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Hintzborough";
                        country = "Afghanistan";
                        countryCode = "TF";
                        postalCode = "39423";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    companyId = "<value>";
                    companyName = "O'Reilly Inc";
                    createdAt = OffsetDateTime.parse("2023-08-31T03:55:05.691Z");
                    dateOfBirth = OffsetDateTime.parse("2023-12-18T17:01:22.026Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail(
                        "<value>"){{
                            email = "Mose_Cremin@gmail.com";
                        }}),
                    }};
                    externalId = "<value>";
                    id = "<id>";
                    imageUrl = "<value>";
                    linkUrls = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    origin = Origin.SOURCED;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    sources = new String[]{{
                        add("<value>"),
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2022-10-06T11:04:23.402Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateResponse res = sdk.ats.updateAtsCandidate(req, new UpdateAtsCandidateSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsCandidate != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateRequest](../../models/operations/UpdateAtsCandidateRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateSecurity](../../models/operations/UpdateAtsCandidateSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateResponse](../../models/operations/UpdateAtsCandidateResponse.md)**


## updateAtsDocument

Update a document

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsDocument;
import com.unifiedapi.unifiedto.models.shared.AtsDocumentType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentRequest req = new UpdateAtsDocumentRequest(
                "<value>",
                "<value>"){{
                atsDocument = new AtsDocument(
){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2022-07-05T17:05:49.106Z");
                    documentData = "<value>";
                    documentUrl = "<value>";
                    filename = "unbranded_reprehenderit.jpg";
                    id = "<id>";
                    jobId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    type = AtsDocumentType.OFFER_PACKET;
                    updatedAt = OffsetDateTime.parse("2022-12-03T00:21:50.487Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentResponse res = sdk.ats.updateAtsDocument(req, new UpdateAtsDocumentSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsDocument != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentRequest](../../models/operations/UpdateAtsDocumentRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentSecurity](../../models/operations/UpdateAtsDocumentSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentResponse](../../models/operations/UpdateAtsDocumentResponse.md)**


## updateAtsInterview

Update a interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsInterviewRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsInterviewResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsInterviewSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsInterviewRequest req = new UpdateAtsInterviewRequest(
                "<value>",
                "<value>"){{
                atsInterview = new AtsInterview(
){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2024-05-06T05:22:44.534Z");
                    endAt = OffsetDateTime.parse("2023-03-29T20:29:22.648Z");
                    externalEventXref = "<value>";
                    id = "<id>";
                    jobId = "<value>";
                    location = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    startAt = OffsetDateTime.parse("2024-05-05T07:21:58.674Z");
                    status = AtsInterviewStatus.COMPLETE;
                    updatedAt = OffsetDateTime.parse("2022-05-01T17:04:47.962Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsInterviewResponse res = sdk.ats.updateAtsInterview(req, new UpdateAtsInterviewSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsInterview != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.UpdateAtsInterviewRequest](../../models/operations/UpdateAtsInterviewRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.UpdateAtsInterviewSecurity](../../models/operations/UpdateAtsInterviewSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAtsInterviewResponse](../../models/operations/UpdateAtsInterviewResponse.md)**


## updateAtsJob

Update a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsJobRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsJobResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsJobSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobQuestion;
import com.unifiedapi.unifiedto.models.shared.AtsJobQuestionType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.EmploymentType;
import com.unifiedapi.unifiedto.models.shared.Frequency;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsJobRequest req = new UpdateAtsJobRequest(
                "<value>",
                "<value>"){{
                atsJob = new AtsJob(
){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(
                        ){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2023-10-21T07:41:08.131Z");
                    companyId = "<value>";
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(
                        AtsCompensationType.BONUS){{
                            type = AtsCompensationType.BONUS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2023-01-19T17:41:10.086Z");
                    departments = new String[]{{
                        add("<value>"),
                    }};
                    description = "Re-contextualized 24 hour support";
                    employmentType = EmploymentType.CASUAL;
                    hiringManagerIds = new String[]{{
                        add("<value>"),
                    }};
                    id = "<id>";
                    languageLocale = "<value>";
                    name = "<value>";
                    numberOfOpenings = 983.08d;
                    publicJobUrls = new String[]{{
                        add("<value>"),
                    }};
                    questions = new com.unifiedapi.unifiedto.models.shared.AtsJobQuestion[]{{
                        add(new AtsJobQuestion(
                        "<value>",
                        AtsJobQuestionType.UNIVERSITY){{
                            question = "<value>";
                            type = AtsJobQuestionType.FILE;
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    recruiterIds = new String[]{{
                        add("<value>"),
                    }};
                    remote = false;
                    status = AtsJobStatus.DRAFT;
                    updatedAt = OffsetDateTime.parse("2024-12-22T02:51:32.088Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsJobResponse res = sdk.ats.updateAtsJob(req, new UpdateAtsJobSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsJob != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.UpdateAtsJobRequest](../../models/operations/UpdateAtsJobRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [com.unifiedapi.unifiedto.models.operations.UpdateAtsJobSecurity](../../models/operations/UpdateAtsJobSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAtsJobResponse](../../models/operations/UpdateAtsJobResponse.md)**


## updateAtsScorecard

Update a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardQuestion;
import com.unifiedapi.unifiedto.models.shared.Recommendation;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardRequest req = new UpdateAtsScorecardRequest(
                "<value>",
                "<value>"){{
                atsScorecard = new AtsScorecard(
){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    comment = "The automobile layout consists of a front-engine design, with transaxle-type transmissions mounted at the rear of the engine and four wheel drive";
                    createdAt = OffsetDateTime.parse("2022-07-10T16:18:43.908Z");
                    id = "<id>";
                    interviewId = "<value>";
                    interviewerId = "<value>";
                    jobId = "<value>";
                    questions = new com.unifiedapi.unifiedto.models.shared.AtsScorecardQuestion[]{{
                        add(new AtsScorecardQuestion(
                        "<value>"){{
                            text = "<value>";
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    recommendation = Recommendation.NO;
                    updatedAt = OffsetDateTime.parse("2022-07-26T09:16:55.761Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardResponse res = sdk.ats.updateAtsScorecard(req, new UpdateAtsScorecardSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsScorecard != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardRequest](../../models/operations/UpdateAtsScorecardRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardSecurity](../../models/operations/UpdateAtsScorecardSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardResponse](../../models/operations/UpdateAtsScorecardResponse.md)**

