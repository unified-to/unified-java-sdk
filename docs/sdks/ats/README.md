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
* [getAtsCompany](#getatscompany) - Retrieve a company
* [getAtsDocument](#getatsdocument) - Retrieve a document
* [getAtsInterview](#getatsinterview) - Retrieve a interview
* [getAtsJob](#getatsjob) - Retrieve a job
* [getAtsScorecard](#getatsscorecard) - Retrieve a scorecard
* [listAtsApplications](#listatsapplications) - List all applications
* [listAtsApplicationstatuses](#listatsapplicationstatuses) - List all application statuses
* [listAtsCandidates](#listatscandidates) - List all candidates
* [listAtsCompanies](#listatscompanies) - List all companies
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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationRequest req = new CreateAtsApplicationRequest(
                "string"){{
                atsApplication = new AtsApplication(
){{
                    appliedAt = OffsetDateTime.parse("2024-03-09T05:03:52.917Z");
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2024-09-22T12:50:56.305Z");
                    hiredAt = OffsetDateTime.parse("2023-01-19T06:26:51.678Z");
                    id = "<ID>";
                    jobId = "string";
                    originalStatus = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    rejectedAt = OffsetDateTime.parse("2023-01-30T06:58:14.500Z");
                    rejectedReason = "string";
                    source = "string";
                    status = AtsApplicationStatus.SECOND_INTERVIEW;
                    updatedAt = OffsetDateTime.parse("2024-09-21T21:31:42.360Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationResponse res = sdk.ats.createAtsApplication(req);

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
import com.unifiedapi.unifiedto.models.shared.Origin;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateRequest req = new CreateAtsCandidateRequest(
                "string"){{
                atsCandidate = new AtsCandidate(
){{
                    address = new PropertyAtsCandidateAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "South Hill";
                        country = "Denmark";
                        countryCode = "KM";
                        postalCode = "72991-5163";
                        region = "string";
                        regionCode = "string";

                    }};
                    companyId = "string";
                    companyName = "Pollich - Lubowitz";
                    createdAt = OffsetDateTime.parse("2022-03-06T00:47:39.352Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail(
                        "string"){{
                            email = "Ransom.OReilly99@yahoo.com";
                        }}),
                    }};
                    externalId = "string";
                    id = "<ID>";
                    imageUrl = "string";
                    linkUrls = new String[]{{
                        add("string"),
                    }};
                    name = "string";
                    origin = Origin.AGENCY;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    title = "string";
                    updatedAt = OffsetDateTime.parse("2022-09-27T06:32:21.998Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateResponse res = sdk.ats.createAtsCandidate(req);

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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentRequest req = new CreateAtsDocumentRequest(
                "string"){{
                atsDocument = new AtsDocument(
){{
                    applicationId = "string";
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2022-04-25T01:00:46.478Z");
                    documentData = "string";
                    documentUrl = "string";
                    filename = "mouse_per_missouri.mp4";
                    id = "<ID>";
                    jobId = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    type = AtsDocumentType.OFFER_PACKET;
                    updatedAt = OffsetDateTime.parse("2022-12-28T17:22:48.342Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentResponse res = sdk.ats.createAtsDocument(req);

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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsInterviewRequest req = new CreateAtsInterviewRequest(
                "string"){{
                atsInterview = new AtsInterview(
){{
                    applicationId = "string";
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2023-01-11T04:08:22.567Z");
                    endAt = OffsetDateTime.parse("2024-12-21T08:47:56.138Z");
                    externalEventXref = "string";
                    id = "<ID>";
                    jobId = "string";
                    location = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    startAt = OffsetDateTime.parse("2023-11-20T00:14:00.277Z");
                    status = AtsInterviewStatus.COMPLETE;
                    updatedAt = OffsetDateTime.parse("2022-02-07T15:15:23.855Z");
                    userIds = new String[]{{
                        add("string"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsInterviewResponse res = sdk.ats.createAtsInterview(req);

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
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.EmploymentType;
import com.unifiedapi.unifiedto.models.shared.Frequency;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsJobRequest req = new CreateAtsJobRequest(
                "string"){{
                atsJob = new AtsJob(
){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(
                        ){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2022-01-14T18:31:06.376Z");
                    companyId = "string";
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(
                        AtsCompensationType.EQUITY){{
                            type = AtsCompensationType.STOCK_OPTIONS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2023-03-05T16:04:54.121Z");
                    departments = new String[]{{
                        add("string"),
                    }};
                    description = "Operative 24 hour methodology";
                    employmentType = EmploymentType.OTHER;
                    hiringManagerIds = new String[]{{
                        add("string"),
                    }};
                    id = "<ID>";
                    languageLocale = "string";
                    name = "string";
                    numberOfOpenings = 8330.69d;
                    publicJobUrls = new String[]{{
                        add("string"),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    recruiterIds = new String[]{{
                        add("string"),
                    }};
                    remote = false;
                    status = AtsJobStatus.OPEN;
                    updatedAt = OffsetDateTime.parse("2024-11-18T02:03:06.250Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsJobResponse res = sdk.ats.createAtsJob(req);

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
import com.unifiedapi.unifiedto.models.shared.Recommendation;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardRequest req = new CreateAtsScorecardRequest(
                "string"){{
                atsScorecard = new AtsScorecard(
){{
                    applicationId = "string";
                    candidateId = "string";
                    comment = "The Nagasaki Lander is the trademarked name of several series of Nagasaki sport bikes, that started with the 1984 ABC800J";
                    createdAt = OffsetDateTime.parse("2022-04-24T10:18:34.661Z");
                    id = "<ID>";
                    interviewId = "string";
                    interviewerId = "string";
                    jobId = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    recommendation = Recommendation.NO;
                    updatedAt = OffsetDateTime.parse("2023-04-02T03:31:06.456Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardResponse res = sdk.ats.createAtsScorecard(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsApplicationRequest req = new GetAtsApplicationRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsApplicationResponse res = sdk.ats.getAtsApplication(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsCandidateRequest req = new GetAtsCandidateRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsCandidateResponse res = sdk.ats.getAtsCandidate(req);

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


## getAtsCompany

Retrieve a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsCompanyResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsCompanyRequest req = new GetAtsCompanyRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsCompanyResponse res = sdk.ats.getAtsCompany(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetAtsCompanyRequest](../../models/operations/GetAtsCompanyRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsDocumentRequest req = new GetAtsDocumentRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsDocumentResponse res = sdk.ats.getAtsDocument(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsInterviewRequest req = new GetAtsInterviewRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsInterviewResponse res = sdk.ats.getAtsInterview(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsJobRequest req = new GetAtsJobRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsJobResponse res = sdk.ats.getAtsJob(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsScorecardRequest req = new GetAtsScorecardRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsScorecardResponse res = sdk.ats.getAtsScorecard(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsRequest req = new ListAtsApplicationsRequest(
                "string"){{
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
                updatedGte = OffsetDateTime.parse("2022-12-21T20:30:01.596Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsResponse res = sdk.ats.listAtsApplications(req);

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


## listAtsApplicationstatuses

List all application statuses

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesRequest req = new ListAtsApplicationstatusesRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 5199.96d;
                offset = 7673.65d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2024-03-25T18:11:33.180Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesResponse res = sdk.ats.listAtsApplicationstatuses(req);

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesRequest](../../models/operations/ListAtsApplicationstatusesRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesRequest req = new ListAtsCandidatesRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 6384.09d;
                offset = 7452.94d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2022-03-18T00:58:25.541Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesResponse res = sdk.ats.listAtsCandidates(req);

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


## listAtsCompanies

List all companies

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesRequest req = new ListAtsCompaniesRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 6933.84d;
                offset = 7946.52d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2024-10-01T21:39:38.971Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesResponse res = sdk.ats.listAtsCompanies(req);

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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesRequest](../../models/operations/ListAtsCompaniesRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsRequest req = new ListAtsDocumentsRequest(
                "string"){{
                applicationId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 9635.37d;
                offset = 8402.77d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2023-08-31T00:55:54.895Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsResponse res = sdk.ats.listAtsDocuments(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsInterviewsRequest req = new ListAtsInterviewsRequest(
                "string"){{
                applicationId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 2562.12d;
                offset = 1185.02d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2022-09-28T15:15:00.508Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsInterviewsResponse res = sdk.ats.listAtsInterviews(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsJobsRequest req = new ListAtsJobsRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 3958.99d;
                offset = 3223.84d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2023-03-04T01:14:05.456Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsJobsResponse res = sdk.ats.listAtsJobs(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsRequest req = new ListAtsScorecardsRequest(
                "string"){{
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
                updatedGte = OffsetDateTime.parse("2024-08-19T14:46:22.333Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsResponse res = sdk.ats.listAtsScorecards(req);

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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationRequest req = new PatchAtsApplicationRequest(
                "string",
                "string"){{
                atsApplication = new AtsApplication(
){{
                    appliedAt = OffsetDateTime.parse("2023-12-15T20:36:09.499Z");
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2022-01-06T05:56:57.062Z");
                    hiredAt = OffsetDateTime.parse("2023-12-05T05:20:09.174Z");
                    id = "<ID>";
                    jobId = "string";
                    originalStatus = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    rejectedAt = OffsetDateTime.parse("2022-07-13T02:34:40.392Z");
                    rejectedReason = "string";
                    source = "string";
                    status = AtsApplicationStatus.FIRST_INTERVIEW;
                    updatedAt = OffsetDateTime.parse("2024-01-24T17:35:54.628Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationResponse res = sdk.ats.patchAtsApplication(req);

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
import com.unifiedapi.unifiedto.models.shared.Origin;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateRequest req = new PatchAtsCandidateRequest(
                "string",
                "string"){{
                atsCandidate = new AtsCandidate(
){{
                    address = new PropertyAtsCandidateAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Fort Bridget";
                        country = "Sri Lanka";
                        countryCode = "GI";
                        postalCode = "46054";
                        region = "string";
                        regionCode = "string";

                    }};
                    companyId = "string";
                    companyName = "Donnelly - Bartell";
                    createdAt = OffsetDateTime.parse("2024-01-07T04:20:35.612Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail(
                        "string"){{
                            email = "Elissa62@yahoo.com";
                        }}),
                    }};
                    externalId = "string";
                    id = "<ID>";
                    imageUrl = "string";
                    linkUrls = new String[]{{
                        add("string"),
                    }};
                    name = "string";
                    origin = Origin.INTERNAL;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    title = "string";
                    updatedAt = OffsetDateTime.parse("2024-09-22T18:26:07.211Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateResponse res = sdk.ats.patchAtsCandidate(req);

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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentRequest req = new PatchAtsDocumentRequest(
                "string",
                "string"){{
                atsDocument = new AtsDocument(
){{
                    applicationId = "string";
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2022-04-01T11:33:08.084Z");
                    documentData = "string";
                    documentUrl = "string";
                    filename = "future_underpin.mp4v";
                    id = "<ID>";
                    jobId = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    type = AtsDocumentType.OFFER_LETTER;
                    updatedAt = OffsetDateTime.parse("2023-02-14T10:37:18.255Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentResponse res = sdk.ats.patchAtsDocument(req);

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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsInterviewRequest req = new PatchAtsInterviewRequest(
                "string",
                "string"){{
                atsInterview = new AtsInterview(
){{
                    applicationId = "string";
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2024-09-11T19:09:34.526Z");
                    endAt = OffsetDateTime.parse("2022-05-28T22:25:51.616Z");
                    externalEventXref = "string";
                    id = "<ID>";
                    jobId = "string";
                    location = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    startAt = OffsetDateTime.parse("2022-09-10T07:32:43.966Z");
                    status = AtsInterviewStatus.COMPLETE;
                    updatedAt = OffsetDateTime.parse("2024-03-18T02:52:45.725Z");
                    userIds = new String[]{{
                        add("string"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsInterviewResponse res = sdk.ats.patchAtsInterview(req);

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
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.EmploymentType;
import com.unifiedapi.unifiedto.models.shared.Frequency;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsJobRequest req = new PatchAtsJobRequest(
                "string",
                "string"){{
                atsJob = new AtsJob(
){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(
                        ){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2022-08-09T17:44:16.617Z");
                    companyId = "string";
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(
                        AtsCompensationType.EQUITY){{
                            type = AtsCompensationType.SALARY;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2022-03-27T20:59:56.374Z");
                    departments = new String[]{{
                        add("string"),
                    }};
                    description = "Extended empowering middleware";
                    employmentType = EmploymentType.FULL_TIME;
                    hiringManagerIds = new String[]{{
                        add("string"),
                    }};
                    id = "<ID>";
                    languageLocale = "string";
                    name = "string";
                    numberOfOpenings = 238.34d;
                    publicJobUrls = new String[]{{
                        add("string"),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    recruiterIds = new String[]{{
                        add("string"),
                    }};
                    remote = false;
                    status = AtsJobStatus.CLOSED;
                    updatedAt = OffsetDateTime.parse("2023-08-08T17:34:59.133Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsJobResponse res = sdk.ats.patchAtsJob(req);

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
import com.unifiedapi.unifiedto.models.shared.Recommendation;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardRequest req = new PatchAtsScorecardRequest(
                "string",
                "string"){{
                atsScorecard = new AtsScorecard(
){{
                    applicationId = "string";
                    candidateId = "string";
                    comment = "Ergonomic executive chair upholstered in bonded black leather and PVC padded seat and back for all-day comfort and support";
                    createdAt = OffsetDateTime.parse("2024-10-06T13:32:29.533Z");
                    id = "<ID>";
                    interviewId = "string";
                    interviewerId = "string";
                    jobId = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    recommendation = Recommendation.YES;
                    updatedAt = OffsetDateTime.parse("2022-11-28T15:13:55.563Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardResponse res = sdk.ats.patchAtsScorecard(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationRequest req = new RemoveAtsApplicationRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationResponse res = sdk.ats.removeAtsApplication(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateRequest req = new RemoveAtsCandidateRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateResponse res = sdk.ats.removeAtsCandidate(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentRequest req = new RemoveAtsDocumentRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentResponse res = sdk.ats.removeAtsDocument(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewRequest req = new RemoveAtsInterviewRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewResponse res = sdk.ats.removeAtsInterview(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsJobRequest req = new RemoveAtsJobRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsJobResponse res = sdk.ats.removeAtsJob(req);

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardRequest req = new RemoveAtsScorecardRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardResponse res = sdk.ats.removeAtsScorecard(req);

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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationRequest req = new UpdateAtsApplicationRequest(
                "string",
                "string"){{
                atsApplication = new AtsApplication(
){{
                    appliedAt = OffsetDateTime.parse("2022-08-22T12:21:27.415Z");
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2022-06-04T12:46:09.878Z");
                    hiredAt = OffsetDateTime.parse("2022-02-09T08:57:01.906Z");
                    id = "<ID>";
                    jobId = "string";
                    originalStatus = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    rejectedAt = OffsetDateTime.parse("2024-07-19T04:47:20.215Z");
                    rejectedReason = "string";
                    source = "string";
                    status = AtsApplicationStatus.OFFERED;
                    updatedAt = OffsetDateTime.parse("2023-03-17T03:12:00.865Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationResponse res = sdk.ats.updateAtsApplication(req);

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
import com.unifiedapi.unifiedto.models.shared.Origin;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateRequest req = new UpdateAtsCandidateRequest(
                "string",
                "string"){{
                atsCandidate = new AtsCandidate(
){{
                    address = new PropertyAtsCandidateAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Hintzborough";
                        country = "Afghanistan";
                        countryCode = "TF";
                        postalCode = "39423";
                        region = "string";
                        regionCode = "string";

                    }};
                    companyId = "string";
                    companyName = "O'Reilly Inc";
                    createdAt = OffsetDateTime.parse("2023-08-31T03:55:05.691Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail(
                        "string"){{
                            email = "Cary37@yahoo.com";
                        }}),
                    }};
                    externalId = "string";
                    id = "<ID>";
                    imageUrl = "string";
                    linkUrls = new String[]{{
                        add("string"),
                    }};
                    name = "string";
                    origin = Origin.UNIVERSITY;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    title = "string";
                    updatedAt = OffsetDateTime.parse("2024-04-15T00:30:17.967Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateResponse res = sdk.ats.updateAtsCandidate(req);

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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentRequest req = new UpdateAtsDocumentRequest(
                "string",
                "string"){{
                atsDocument = new AtsDocument(
){{
                    applicationId = "string";
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2022-07-05T17:05:49.106Z");
                    documentData = "string";
                    documentUrl = "string";
                    filename = "unbranded_reprehenderit.jpg";
                    id = "<ID>";
                    jobId = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    type = AtsDocumentType.OFFER_PACKET;
                    updatedAt = OffsetDateTime.parse("2022-12-03T00:21:50.487Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentResponse res = sdk.ats.updateAtsDocument(req);

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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsInterviewRequest req = new UpdateAtsInterviewRequest(
                "string",
                "string"){{
                atsInterview = new AtsInterview(
){{
                    applicationId = "string";
                    candidateId = "string";
                    createdAt = OffsetDateTime.parse("2024-05-06T05:22:44.534Z");
                    endAt = OffsetDateTime.parse("2023-03-29T20:29:22.648Z");
                    externalEventXref = "string";
                    id = "<ID>";
                    jobId = "string";
                    location = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    startAt = OffsetDateTime.parse("2024-05-05T07:21:58.674Z");
                    status = AtsInterviewStatus.AWAITING_FEEDBACK;
                    updatedAt = OffsetDateTime.parse("2022-05-01T17:04:47.962Z");
                    userIds = new String[]{{
                        add("string"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsInterviewResponse res = sdk.ats.updateAtsInterview(req);

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
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.EmploymentType;
import com.unifiedapi.unifiedto.models.shared.Frequency;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsJobRequest req = new UpdateAtsJobRequest(
                "string",
                "string"){{
                atsJob = new AtsJob(
){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(
                        ){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2023-10-21T07:41:08.131Z");
                    companyId = "string";
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(
                        AtsCompensationType.BONUS){{
                            type = AtsCompensationType.BONUS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2023-01-19T17:41:10.086Z");
                    departments = new String[]{{
                        add("string"),
                    }};
                    description = "Re-contextualized 24 hour support";
                    employmentType = EmploymentType.CASUAL;
                    hiringManagerIds = new String[]{{
                        add("string"),
                    }};
                    id = "<ID>";
                    languageLocale = "string";
                    name = "string";
                    numberOfOpenings = 983.08d;
                    publicJobUrls = new String[]{{
                        add("string"),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    recruiterIds = new String[]{{
                        add("string"),
                    }};
                    remote = false;
                    status = AtsJobStatus.DRAFT;
                    updatedAt = OffsetDateTime.parse("2024-01-04T04:44:52.139Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsJobResponse res = sdk.ats.updateAtsJob(req);

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
import com.unifiedapi.unifiedto.models.shared.Recommendation;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardRequest req = new UpdateAtsScorecardRequest(
                "string",
                "string"){{
                atsScorecard = new AtsScorecard(
){{
                    applicationId = "string";
                    candidateId = "string";
                    comment = "The automobile layout consists of a front-engine design, with transaxle-type transmissions mounted at the rear of the engine and four wheel drive";
                    createdAt = OffsetDateTime.parse("2022-07-10T16:18:43.908Z");
                    id = "<ID>";
                    interviewId = "string";
                    interviewerId = "string";
                    jobId = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    recommendation = Recommendation.NO;
                    updatedAt = OffsetDateTime.parse("2022-07-26T09:16:55.761Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardResponse res = sdk.ats.updateAtsScorecard(req);

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

