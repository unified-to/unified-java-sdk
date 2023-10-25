# Ats
(*ats*)

### Available Operations

* [createAtsApplication](#createatsapplication) - Create an application
* [createAtsCandidate](#createatscandidate) - Create a candidate
* [createAtsDocument](#createatsdocument) - Create a document
* [createAtsInterview](#createatsinterview) - Create a interview
* [createAtsJob](#createatsjob) - Create a job
* [createAtsScorecard](#createatsscorecard) - Create a scorecard
* [getAtsApplication](#getatsapplication) - Retrieve an application
* [getAtsCandidate](#getatscandidate) - Retrieve a candidate
* [getAtsDocument](#getatsdocument) - Retrieve a document
* [getAtsInterview](#getatsinterview) - Retrieve a interview
* [getAtsJob](#getatsjob) - Retrieve a job
* [getAtsScorecard](#getatsscorecard) - Retrieve a scorecard
* [listAtsApplications](#listatsapplications) - List all applications
* [listAtsCandidates](#listatscandidates) - List all candidates
* [listAtsDocuments](#listatsdocuments) - List all documents
* [listAtsInterviews](#listatsinterviews) - List all interviews
* [listAtsJobs](#listatsjobs) - List all jobs
* [listAtsScorecards](#listatsscorecards) - List all scorecards
* [patchAtsApplication](#patchatsapplication) - Update an application
* [patchAtsCandidate](#patchatscandidate) - Update a candidate
* [patchAtsDocument](#patchatsdocument) - Update a document
* [patchAtsInterview](#patchatsinterview) - Update a interview
* [patchAtsJob](#patchatsjob) - Update a job
* [patchAtsScorecard](#patchatsscorecard) - Update a scorecard
* [removeAtsApplication](#removeatsapplication) - Remove an application
* [removeAtsCandidate](#removeatscandidate) - Remove a candidate
* [removeAtsDocument](#removeatsdocument) - Remove a document
* [removeAtsInterview](#removeatsinterview) - Remove a interview
* [removeAtsJob](#removeatsjob) - Remove a job
* [removeAtsScorecard](#removeatsscorecard) - Remove a scorecard
* [updateAtsApplication](#updateatsapplication) - Update an application
* [updateAtsCandidate](#updateatscandidate) - Update a candidate
* [updateAtsDocument](#updateatsdocument) - Update a document
* [updateAtsInterview](#updateatsinterview) - Update a interview
* [updateAtsJob](#updateatsjob) - Update a job
* [updateAtsScorecard](#updateatsscorecard) - Update a scorecard

## createAtsApplication

Create an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationResponse;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsApplicationRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            CreateAtsApplicationRequest req = new CreateAtsApplicationRequest("string"){{
                atsApplication = new AtsApplication(){{
                    appliedAt = OffsetDateTime.parse("2023-03-09T11:35:08.252Z");
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2023-09-22T15:02:56.144Z");
                    id = "<ID>";
                    jobId = "string";
                    raw = new PropertyAtsApplicationRaw();
                    rejectedAt = OffsetDateTime.parse("2022-01-18T22:03:17.799Z");
                    rejectedReason = "string";
                    source = "string";
                    status = AtsApplicationStatus.FIRST_INTERVIEW;
                    updatedAt = OffsetDateTime.parse("2022-04-22T10:02:31.440Z");
                }};
            }};            

            CreateAtsApplicationResponse res = sdk.ats.createAtsApplication(req);

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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationRequest](../../models/operations/CreateAtsApplicationRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            CreateAtsCandidateRequest req = new CreateAtsCandidateRequest("string"){{
                atsCandidate = new AtsCandidate(){{
                    address = new PropertyAtsCandidateAddress(){{
                        address1 = "string";
                        address2 = "string";
                        city = "South Hill";
                        country = "Denmark";
                        countryCode = "KM";
                        postalCode = "72991-5163";
                        region = "string";
                        regionCode = "string";
                    }};
                    companyName = "Pollich - Lubowitz";
                    createdAt = OffsetDateTime.parse("2021-03-05T23:23:31.487Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("string"){{
                            email = "Ransom.OReilly99@yahoo.com";
                        }}),
                    }};
                    externalId = "string";
                    id = "<ID>";
                    imageUrl = "string";
                    name = "string";
                    raw = new PropertyAtsCandidateRaw();
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("string"){{
                            telephone = "string";
                        }}),
                    }};
                    title = "string";
                    updatedAt = OffsetDateTime.parse("2021-03-23T22:20:02.861Z");
                }};
            }};            

            CreateAtsCandidateResponse res = sdk.ats.createAtsCandidate(req);

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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateRequest](../../models/operations/CreateAtsCandidateRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


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
import com.unifiedapi.unifiedto.models.shared.AtsDocument;
import com.unifiedapi.unifiedto.models.shared.AtsDocumentType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsDocumentRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            CreateAtsDocumentRequest req = new CreateAtsDocumentRequest("string"){{
                atsDocument = new AtsDocument(){{
                    applicationId = "string";
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2021-04-24T22:30:56.289Z");
                    documentUrl = "string";
                    filename = "mouse_per_missouri.mp4";
                    id = "<ID>";
                    jobId = "string";
                    raw = new PropertyAtsDocumentRaw();
                    type = AtsDocumentType.OFFER_PACKET;
                    updatedAt = OffsetDateTime.parse("2021-12-28T09:27:32.859Z");
                    userId = "string";
                }};
            }};            

            CreateAtsDocumentResponse res = sdk.ats.createAtsDocument(req);

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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentRequest](../../models/operations/CreateAtsDocumentRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


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
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsInterviewRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            CreateAtsInterviewRequest req = new CreateAtsInterviewRequest("string"){{
                atsInterview = new AtsInterview(){{
                    applicationId = "string";
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2022-01-10T19:55:26.926Z");
                    endAt = OffsetDateTime.parse("2023-12-21T09:01:54.390Z");
                    externalEventXref = "string";
                    id = "<ID>";
                    jobId = "string";
                    location = "string";
                    raw = new PropertyAtsInterviewRaw();
                    startAt = OffsetDateTime.parse("2022-11-19T09:10:03.014Z");
                    status = AtsInterviewStatus.COMPLETE;
                    updatedAt = OffsetDateTime.parse("2021-02-07T14:25:56.954Z");
                    userIds = new String[]{{
                        add("string"),
                    }};
                }};
            }};            

            CreateAtsInterviewResponse res = sdk.ats.createAtsInterview(req);

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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.CreateAtsInterviewRequest](../../models/operations/CreateAtsInterviewRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


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
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationFrequency;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobEmploymentType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsJobRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            CreateAtsJobRequest req = new CreateAtsJobRequest("string"){{
                atsJob = new AtsJob(){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2021-01-14T18:13:00.731Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.EQUITY){{
                            type = AtsCompensationType.STOCK_OPTIONS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2022-03-05T06:41:41.152Z");
                    departments = new String[]{{
                        add("string"),
                    }};
                    description = "Operative 24 hour methodology";
                    employmentType = AtsJobEmploymentType.OTHER;
                    hiringManagerIds = new String[]{{
                        add("string"),
                    }};
                    id = "<ID>";
                    languageLocale = "string";
                    name = "string";
                    publicJobUrls = new String[]{{
                        add("string"),
                    }};
                    raw = new PropertyAtsJobRaw();
                    recruiterIds = new String[]{{
                        add("string"),
                    }};
                    remote = false;
                    status = AtsJobStatus.CLOSED;
                    updatedAt = OffsetDateTime.parse("2023-01-24T10:09:39.331Z");
                }};
            }};            

            CreateAtsJobResponse res = sdk.ats.createAtsJob(req);

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
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.CreateAtsJobRequest](../../models/operations/CreateAtsJobRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardRecommendation;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            CreateAtsScorecardRequest req = new CreateAtsScorecardRequest("string"){{
                atsScorecard = new AtsScorecard(new PropertyAtsScorecardRaw()){{
                    applicationId = "string";
                    candidateId = "string";
                    comment = "The Nagasaki Lander is the trademarked name of several series of Nagasaki sport bikes, that started with the 1984 ABC800J";
                    createdAt = OffsetDateTime.parse("2021-04-24T07:49:32.768Z");
                    id = "<ID>";
                    interviewId = "string";
                    interviewerId = "string";
                    jobId = "string";
                    recommendation = AtsScorecardRecommendation.NO;
                    updatedAt = OffsetDateTime.parse("2022-04-01T17:31:47.454Z");
                }};
            }};            

            CreateAtsScorecardResponse res = sdk.ats.createAtsScorecard(req);

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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardRequest](../../models/operations/CreateAtsScorecardRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardResponse](../../models/operations/CreateAtsScorecardResponse.md)**


## getAtsApplication

Retrieve an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsApplicationResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            GetAtsApplicationRequest req = new GetAtsApplicationRequest("string", "string"){{
                fields = new String[]{{
                    add("string"),
                }};
            }};            

            GetAtsApplicationResponse res = sdk.ats.getAtsApplication(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetAtsApplicationRequest](../../models/operations/GetAtsApplicationRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            GetAtsCandidateRequest req = new GetAtsCandidateRequest("string", "string"){{
                fields = new String[]{{
                    add("string"),
                }};
            }};            

            GetAtsCandidateResponse res = sdk.ats.getAtsCandidate(req);

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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetAtsCandidateRequest](../../models/operations/GetAtsCandidateRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsCandidateResponse](../../models/operations/GetAtsCandidateResponse.md)**


## getAtsDocument

Retrieve a document

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsDocumentRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsDocumentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            GetAtsDocumentRequest req = new GetAtsDocumentRequest("string", "string"){{
                fields = new String[]{{
                    add("string"),
                }};
            }};            

            GetAtsDocumentResponse res = sdk.ats.getAtsDocument(req);

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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetAtsDocumentRequest](../../models/operations/GetAtsDocumentRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            GetAtsInterviewRequest req = new GetAtsInterviewRequest("string", "string"){{
                fields = new String[]{{
                    add("string"),
                }};
            }};            

            GetAtsInterviewResponse res = sdk.ats.getAtsInterview(req);

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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetAtsInterviewRequest](../../models/operations/GetAtsInterviewRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            GetAtsJobRequest req = new GetAtsJobRequest("string", "string"){{
                fields = new String[]{{
                    add("string"),
                }};
            }};            

            GetAtsJobResponse res = sdk.ats.getAtsJob(req);

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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetAtsJobRequest](../../models/operations/GetAtsJobRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            GetAtsScorecardRequest req = new GetAtsScorecardRequest("string", "string"){{
                fields = new String[]{{
                    add("string"),
                }};
            }};            

            GetAtsScorecardResponse res = sdk.ats.getAtsScorecard(req);

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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetAtsScorecardRequest](../../models/operations/GetAtsScorecardRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsScorecardResponse](../../models/operations/GetAtsScorecardResponse.md)**


## listAtsApplications

List all applications

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            ListAtsApplicationsRequest req = new ListAtsApplicationsRequest("string"){{
                candidateId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                jobId = "string";
                limit = 441.56d;
                offset = 1448.74d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2021-12-21T12:43:47.690Z");
            }};            

            ListAtsApplicationsResponse res = sdk.ats.listAtsApplications(req);

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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsRequest](../../models/operations/ListAtsApplicationsRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsResponse](../../models/operations/ListAtsApplicationsResponse.md)**


## listAtsCandidates

List all candidates

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            ListAtsCandidatesRequest req = new ListAtsCandidatesRequest("string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 6384.09d;
                offset = 7452.94d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2021-03-17T23:18:31.102Z");
            }};            

            ListAtsCandidatesResponse res = sdk.ats.listAtsCandidates(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesRequest](../../models/operations/ListAtsCandidatesRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesResponse](../../models/operations/ListAtsCandidatesResponse.md)**


## listAtsDocuments

List all documents

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            ListAtsDocumentsRequest req = new ListAtsDocumentsRequest("string"){{
                applicationId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 9635.37d;
                offset = 8402.77d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2022-08-30T11:38:20.739Z");
            }};            

            ListAtsDocumentsResponse res = sdk.ats.listAtsDocuments(req);

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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsRequest](../../models/operations/ListAtsDocumentsRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            ListAtsInterviewsRequest req = new ListAtsInterviewsRequest("string"){{
                applicationId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 2562.12d;
                offset = 1185.02d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2021-09-28T09:19:25.744Z");
            }};            

            ListAtsInterviewsResponse res = sdk.ats.listAtsInterviews(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.ListAtsInterviewsRequest](../../models/operations/ListAtsInterviewsRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            ListAtsJobsRequest req = new ListAtsJobsRequest("string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 3958.99d;
                offset = 3223.84d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2022-03-03T15:53:00.086Z");
            }};            

            ListAtsJobsResponse res = sdk.ats.listAtsJobs(req);

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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListAtsJobsRequest](../../models/operations/ListAtsJobsRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            ListAtsScorecardsRequest req = new ListAtsScorecardsRequest("string"){{
                applicationId = "string";
                candidateId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                interviewId = "string";
                jobId = "string";
                limit = 5126.98d;
                offset = 8077.44d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2023-08-19T17:42:56.145Z");
            }};            

            ListAtsScorecardsResponse res = sdk.ats.listAtsScorecards(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsRequest](../../models/operations/ListAtsScorecardsRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsResponse](../../models/operations/ListAtsScorecardsResponse.md)**


## patchAtsApplication

Update an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationResponse;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsApplicationRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            PatchAtsApplicationRequest req = new PatchAtsApplicationRequest("string", "string"){{
                atsApplication = new AtsApplication(){{
                    appliedAt = OffsetDateTime.parse("2022-12-15T04:58:14.527Z");
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2021-01-06T05:50:03.360Z");
                    id = "<ID>";
                    jobId = "string";
                    raw = new PropertyAtsApplicationRaw();
                    rejectedAt = OffsetDateTime.parse("2022-12-04T13:56:12.670Z");
                    rejectedReason = "string";
                    source = "string";
                    status = AtsApplicationStatus.SCREENING;
                    updatedAt = OffsetDateTime.parse("2022-02-02T14:46:44.919Z");
                }};
            }};            

            PatchAtsApplicationResponse res = sdk.ats.patchAtsApplication(req);

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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationRequest](../../models/operations/PatchAtsApplicationRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


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
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            PatchAtsCandidateRequest req = new PatchAtsCandidateRequest("string", "string"){{
                atsCandidate = new AtsCandidate(){{
                    address = new PropertyAtsCandidateAddress(){{
                        address1 = "string";
                        address2 = "string";
                        city = "Fort Bridget";
                        country = "Sri Lanka";
                        countryCode = "GI";
                        postalCode = "46054";
                        region = "string";
                        regionCode = "string";
                    }};
                    companyName = "Donnelly - Bartell";
                    createdAt = OffsetDateTime.parse("2023-01-06T12:13:20.908Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("string"){{
                            email = "Elissa62@yahoo.com";
                        }}),
                    }};
                    externalId = "string";
                    id = "<ID>";
                    imageUrl = "string";
                    name = "string";
                    raw = new PropertyAtsCandidateRaw();
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("string"){{
                            telephone = "string";
                        }}),
                    }};
                    title = "string";
                    updatedAt = OffsetDateTime.parse("2022-01-30T06:27:20.051Z");
                }};
            }};            

            PatchAtsCandidateResponse res = sdk.ats.patchAtsCandidate(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateRequest](../../models/operations/PatchAtsCandidateRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


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
import com.unifiedapi.unifiedto.models.shared.AtsDocument;
import com.unifiedapi.unifiedto.models.shared.AtsDocumentType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsDocumentRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            PatchAtsDocumentRequest req = new PatchAtsDocumentRequest("string", "string"){{
                atsDocument = new AtsDocument(){{
                    applicationId = "string";
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2021-04-01T09:34:15.248Z");
                    documentUrl = "string";
                    filename = "future_underpin.mp4v";
                    id = "<ID>";
                    jobId = "string";
                    raw = new PropertyAtsDocumentRaw();
                    type = AtsDocumentType.OFFER_LETTER;
                    updatedAt = OffsetDateTime.parse("2022-02-14T01:39:21.030Z");
                    userId = "string";
                }};
            }};            

            PatchAtsDocumentResponse res = sdk.ats.patchAtsDocument(req);

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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentRequest](../../models/operations/PatchAtsDocumentRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


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
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsInterviewRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            PatchAtsInterviewRequest req = new PatchAtsInterviewRequest("string", "string"){{
                atsInterview = new AtsInterview(){{
                    applicationId = "string";
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2023-09-11T21:35:40.790Z");
                    endAt = OffsetDateTime.parse("2021-05-28T19:11:29.616Z");
                    externalEventXref = "string";
                    id = "<ID>";
                    jobId = "string";
                    location = "string";
                    raw = new PropertyAtsInterviewRaw();
                    startAt = OffsetDateTime.parse("2021-09-10T02:01:13.488Z");
                    status = AtsInterviewStatus.COMPLETE;
                    updatedAt = OffsetDateTime.parse("2023-03-18T09:12:18.749Z");
                    userIds = new String[]{{
                        add("string"),
                    }};
                }};
            }};            

            PatchAtsInterviewResponse res = sdk.ats.patchAtsInterview(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchAtsInterviewRequest](../../models/operations/PatchAtsInterviewRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


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
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationFrequency;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobEmploymentType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsJobRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            PatchAtsJobRequest req = new PatchAtsJobRequest("string", "string"){{
                atsJob = new AtsJob(){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2021-08-09T12:54:15.288Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.EQUITY){{
                            type = AtsCompensationType.SALARY;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2021-03-27T19:07:06.669Z");
                    departments = new String[]{{
                        add("string"),
                    }};
                    description = "Extended empowering middleware";
                    employmentType = AtsJobEmploymentType.FULL_TIME;
                    hiringManagerIds = new String[]{{
                        add("string"),
                    }};
                    id = "<ID>";
                    languageLocale = "string";
                    name = "string";
                    publicJobUrls = new String[]{{
                        add("string"),
                    }};
                    raw = new PropertyAtsJobRaw();
                    recruiterIds = new String[]{{
                        add("string"),
                    }};
                    remote = false;
                    status = AtsJobStatus.ARCHIVED;
                    updatedAt = OffsetDateTime.parse("2023-10-30T02:05:51.064Z");
                }};
            }};            

            PatchAtsJobResponse res = sdk.ats.patchAtsJob(req);

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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchAtsJobRequest](../../models/operations/PatchAtsJobRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


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
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardRecommendation;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            PatchAtsScorecardRequest req = new PatchAtsScorecardRequest("string", "string"){{
                atsScorecard = new AtsScorecard(new PropertyAtsScorecardRaw()){{
                    applicationId = "string";
                    candidateId = "string";
                    comment = "Ergonomic executive chair upholstered in bonded black leather and PVC padded seat and back for all-day comfort and support";
                    createdAt = OffsetDateTime.parse("2023-10-06T15:26:03.447Z");
                    id = "<ID>";
                    interviewId = "string";
                    interviewerId = "string";
                    jobId = "string";
                    recommendation = AtsScorecardRecommendation.YES;
                    updatedAt = OffsetDateTime.parse("2021-11-28T07:58:12.100Z");
                }};
            }};            

            PatchAtsScorecardResponse res = sdk.ats.patchAtsScorecard(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardRequest](../../models/operations/PatchAtsScorecardRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardResponse](../../models/operations/PatchAtsScorecardResponse.md)**


## removeAtsApplication

Remove an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            RemoveAtsApplicationRequest req = new RemoveAtsApplicationRequest("string", "string");            

            RemoveAtsApplicationResponse res = sdk.ats.removeAtsApplication(req);

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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationRequest](../../models/operations/RemoveAtsApplicationRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            RemoveAtsCandidateRequest req = new RemoveAtsCandidateRequest("string", "string");            

            RemoveAtsCandidateResponse res = sdk.ats.removeAtsCandidate(req);

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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateRequest](../../models/operations/RemoveAtsCandidateRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            RemoveAtsDocumentRequest req = new RemoveAtsDocumentRequest("string", "string");            

            RemoveAtsDocumentResponse res = sdk.ats.removeAtsDocument(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentRequest](../../models/operations/RemoveAtsDocumentRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            RemoveAtsInterviewRequest req = new RemoveAtsInterviewRequest("string", "string");            

            RemoveAtsInterviewResponse res = sdk.ats.removeAtsInterview(req);

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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewRequest](../../models/operations/RemoveAtsInterviewRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            RemoveAtsJobRequest req = new RemoveAtsJobRequest("string", "string");            

            RemoveAtsJobResponse res = sdk.ats.removeAtsJob(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.RemoveAtsJobRequest](../../models/operations/RemoveAtsJobRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            RemoveAtsScorecardRequest req = new RemoveAtsScorecardRequest("string", "string");            

            RemoveAtsScorecardResponse res = sdk.ats.removeAtsScorecard(req);

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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardRequest](../../models/operations/RemoveAtsScorecardRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardResponse](../../models/operations/RemoveAtsScorecardResponse.md)**


## updateAtsApplication

Update an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationResponse;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsApplicationRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            UpdateAtsApplicationRequest req = new UpdateAtsApplicationRequest("string", "string"){{
                atsApplication = new AtsApplication(){{
                    appliedAt = OffsetDateTime.parse("2021-08-22T07:14:38.941Z");
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2021-06-04T09:23:07.789Z");
                    id = "<ID>";
                    jobId = "string";
                    raw = new PropertyAtsApplicationRaw();
                    rejectedAt = OffsetDateTime.parse("2021-02-09T08:05:18.054Z");
                    rejectedReason = "string";
                    source = "string";
                    status = AtsApplicationStatus.REJECTED;
                    updatedAt = OffsetDateTime.parse("2022-11-28T16:36:33.801Z");
                }};
            }};            

            UpdateAtsApplicationResponse res = sdk.ats.updateAtsApplication(req);

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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationRequest](../../models/operations/UpdateAtsApplicationRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            UpdateAtsCandidateRequest req = new UpdateAtsCandidateRequest("string", "string"){{
                atsCandidate = new AtsCandidate(){{
                    address = new PropertyAtsCandidateAddress(){{
                        address1 = "string";
                        address2 = "string";
                        city = "Hintzborough";
                        country = "Afghanistan";
                        countryCode = "TF";
                        postalCode = "39423";
                        region = "string";
                        regionCode = "string";
                    }};
                    companyName = "O'Reilly Inc";
                    createdAt = OffsetDateTime.parse("2022-08-30T14:37:21.726Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("string"){{
                            email = "Cary37@yahoo.com";
                        }}),
                    }};
                    externalId = "string";
                    id = "<ID>";
                    imageUrl = "string";
                    name = "string";
                    raw = new PropertyAtsCandidateRaw();
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("string"){{
                            telephone = "string";
                        }}),
                    }};
                    title = "string";
                    updatedAt = OffsetDateTime.parse("2023-12-25T01:08:38.353Z");
                }};
            }};            

            UpdateAtsCandidateResponse res = sdk.ats.updateAtsCandidate(req);

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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateRequest](../../models/operations/UpdateAtsCandidateRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


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
import com.unifiedapi.unifiedto.models.shared.AtsDocument;
import com.unifiedapi.unifiedto.models.shared.AtsDocumentType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsDocumentRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            UpdateAtsDocumentRequest req = new UpdateAtsDocumentRequest("string", "string"){{
                atsDocument = new AtsDocument(){{
                    applicationId = "string";
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2021-07-05T13:01:49.006Z");
                    documentUrl = "string";
                    filename = "unbranded_reprehenderit.jpg";
                    id = "<ID>";
                    jobId = "string";
                    raw = new PropertyAtsDocumentRaw();
                    type = AtsDocumentType.OFFER_PACKET;
                    updatedAt = OffsetDateTime.parse("2021-12-02T17:00:21.700Z");
                    userId = "string";
                }};
            }};            

            UpdateAtsDocumentResponse res = sdk.ats.updateAtsDocument(req);

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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentRequest](../../models/operations/UpdateAtsDocumentRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


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
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsInterviewRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            UpdateAtsInterviewRequest req = new UpdateAtsInterviewRequest("string", "string"){{
                atsInterview = new AtsInterview(){{
                    applicationId = "string";
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2023-05-06T10:37:46.574Z");
                    endAt = OffsetDateTime.parse("2022-03-29T10:34:23.230Z");
                    externalEventXref = "string";
                    id = "<ID>";
                    jobId = "string";
                    location = "string";
                    raw = new PropertyAtsInterviewRaw();
                    startAt = OffsetDateTime.parse("2023-05-05T12:38:13.018Z");
                    status = AtsInterviewStatus.AWAITING_FEEDBACK;
                    updatedAt = OffsetDateTime.parse("2021-05-01T14:26:12.006Z");
                    userIds = new String[]{{
                        add("string"),
                    }};
                }};
            }};            

            UpdateAtsInterviewResponse res = sdk.ats.updateAtsInterview(req);

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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.UpdateAtsInterviewRequest](../../models/operations/UpdateAtsInterviewRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


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
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationFrequency;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobEmploymentType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsJobRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            UpdateAtsJobRequest req = new UpdateAtsJobRequest("string", "string"){{
                atsJob = new AtsJob(){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2022-10-20T17:16:11.353Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.BONUS){{
                            type = AtsCompensationType.BONUS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2022-01-19T09:16:59.292Z");
                    departments = new String[]{{
                        add("string"),
                    }};
                    description = "Re-contextualized 24 hour support";
                    employmentType = AtsJobEmploymentType.CASUAL;
                    hiringManagerIds = new String[]{{
                        add("string"),
                    }};
                    id = "<ID>";
                    languageLocale = "string";
                    name = "string";
                    publicJobUrls = new String[]{{
                        add("string"),
                    }};
                    raw = new PropertyAtsJobRaw();
                    recruiterIds = new String[]{{
                        add("string"),
                    }};
                    remote = false;
                    status = AtsJobStatus.ARCHIVED;
                    updatedAt = OffsetDateTime.parse("2022-05-26T20:04:55.537Z");
                }};
            }};            

            UpdateAtsJobResponse res = sdk.ats.updateAtsJob(req);

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
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.UpdateAtsJobRequest](../../models/operations/UpdateAtsJobRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardRecommendation;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            UpdateAtsScorecardRequest req = new UpdateAtsScorecardRequest("string", "string"){{
                atsScorecard = new AtsScorecard(new PropertyAtsScorecardRaw()){{
                    applicationId = "string";
                    candidateId = "string";
                    comment = "The automobile layout consists of a front-engine design, with transaxle-type transmissions mounted at the rear of the engine and four wheel drive";
                    createdAt = OffsetDateTime.parse("2021-07-10T12:08:12.226Z");
                    id = "<ID>";
                    interviewId = "string";
                    interviewerId = "string";
                    jobId = "string";
                    recommendation = AtsScorecardRecommendation.NO;
                    updatedAt = OffsetDateTime.parse("2021-07-26T04:45:45.856Z");
                }};
            }};            

            UpdateAtsScorecardResponse res = sdk.ats.updateAtsScorecard(req);

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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardRequest](../../models/operations/UpdateAtsScorecardRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardResponse](../../models/operations/UpdateAtsScorecardResponse.md)**

