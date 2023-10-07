# Ats
(*ats*)

### Available Operations

* [deleteAtsConnectionIdApplicationId](#deleteatsconnectionidapplicationid) - Remove an application
* [deleteAtsConnectionIdCandidateId](#deleteatsconnectionidcandidateid) - Remove a candidate
* [deleteAtsConnectionIdInterviewId](#deleteatsconnectionidinterviewid) - Remove a interview
* [deleteAtsConnectionIdJobId](#deleteatsconnectionidjobid) - Remove a job
* [deleteAtsConnectionIdScorecardId](#deleteatsconnectionidscorecardid) - Remove a scorecard
* [getAtsConnectionIdApplication](#getatsconnectionidapplication) - List all applications
* [getAtsConnectionIdApplicationId](#getatsconnectionidapplicationid) - Retrieve an application
* [getAtsConnectionIdCandidate](#getatsconnectionidcandidate) - List all candidates
* [getAtsConnectionIdCandidateId](#getatsconnectionidcandidateid) - Retrieve a candidate
* [getAtsConnectionIdInterview](#getatsconnectionidinterview) - List all interviews
* [getAtsConnectionIdInterviewId](#getatsconnectionidinterviewid) - Retrieve a interview
* [getAtsConnectionIdJob](#getatsconnectionidjob) - List all jobs
* [getAtsConnectionIdJobId](#getatsconnectionidjobid) - Retrieve a job
* [getAtsConnectionIdScorecard](#getatsconnectionidscorecard) - List all scorecards
* [getAtsConnectionIdScorecardId](#getatsconnectionidscorecardid) - Retrieve a scorecard
* [patchAtsConnectionIdApplicationId](#patchatsconnectionidapplicationid) - Update an application
* [patchAtsConnectionIdCandidateId](#patchatsconnectionidcandidateid) - Update a candidate
* [patchAtsConnectionIdInterviewId](#patchatsconnectionidinterviewid) - Update a interview
* [patchAtsConnectionIdJobId](#patchatsconnectionidjobid) - Update a job
* [patchAtsConnectionIdScorecardId](#patchatsconnectionidscorecardid) - Update a scorecard
* [postAtsConnectionIdApplication](#postatsconnectionidapplication) - Create an application
* [postAtsConnectionIdCandidate](#postatsconnectionidcandidate) - Create a candidate
* [postAtsConnectionIdInterview](#postatsconnectionidinterview) - Create a interview
* [postAtsConnectionIdJob](#postatsconnectionidjob) - Create a job
* [postAtsConnectionIdScorecard](#postatsconnectionidscorecard) - Create a scorecard
* [putAtsConnectionIdApplicationId](#putatsconnectionidapplicationid) - Update an application
* [putAtsConnectionIdCandidateId](#putatsconnectionidcandidateid) - Update a candidate
* [putAtsConnectionIdInterviewId](#putatsconnectionidinterviewid) - Update a interview
* [putAtsConnectionIdJobId](#putatsconnectionidjobid) - Update a job
* [putAtsConnectionIdScorecardId](#putatsconnectionidscorecardid) - Update a scorecard

## deleteAtsConnectionIdApplicationId

Remove an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdApplicationIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdApplicationIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("female"){{
                    jwt = "";
                }})
                .build();

            DeleteAtsConnectionIdApplicationIdRequest req = new DeleteAtsConnectionIdApplicationIdRequest("Southeast", "Darmstadtium");            

            DeleteAtsConnectionIdApplicationIdResponse res = sdk.ats.deleteAtsConnectionIdApplicationId(req);

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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdApplicationIdRequest](../../models/operations/DeleteAtsConnectionIdApplicationIdRequest.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdApplicationIdResponse](../../models/operations/DeleteAtsConnectionIdApplicationIdResponse.md)**


## deleteAtsConnectionIdCandidateId

Remove a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdCandidateIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdCandidateIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Shirt"){{
                    jwt = "";
                }})
                .build();

            DeleteAtsConnectionIdCandidateIdRequest req = new DeleteAtsConnectionIdCandidateIdRequest("Central", "transmitting");            

            DeleteAtsConnectionIdCandidateIdResponse res = sdk.ats.deleteAtsConnectionIdCandidateId(req);

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdCandidateIdRequest](../../models/operations/DeleteAtsConnectionIdCandidateIdRequest.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdCandidateIdResponse](../../models/operations/DeleteAtsConnectionIdCandidateIdResponse.md)**


## deleteAtsConnectionIdInterviewId

Remove a interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdInterviewIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdInterviewIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("coulomb"){{
                    jwt = "";
                }})
                .build();

            DeleteAtsConnectionIdInterviewIdRequest req = new DeleteAtsConnectionIdInterviewIdRequest("Verde", "Hayes");            

            DeleteAtsConnectionIdInterviewIdResponse res = sdk.ats.deleteAtsConnectionIdInterviewId(req);

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdInterviewIdRequest](../../models/operations/DeleteAtsConnectionIdInterviewIdRequest.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdInterviewIdResponse](../../models/operations/DeleteAtsConnectionIdInterviewIdResponse.md)**


## deleteAtsConnectionIdJobId

Remove a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdJobIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdJobIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Facilitator"){{
                    jwt = "";
                }})
                .build();

            DeleteAtsConnectionIdJobIdRequest req = new DeleteAtsConnectionIdJobIdRequest("Cargo", "Hybrid");            

            DeleteAtsConnectionIdJobIdResponse res = sdk.ats.deleteAtsConnectionIdJobId(req);

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdJobIdRequest](../../models/operations/DeleteAtsConnectionIdJobIdRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdJobIdResponse](../../models/operations/DeleteAtsConnectionIdJobIdResponse.md)**


## deleteAtsConnectionIdScorecardId

Remove a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdScorecardIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdScorecardIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Account"){{
                    jwt = "";
                }})
                .build();

            DeleteAtsConnectionIdScorecardIdRequest req = new DeleteAtsConnectionIdScorecardIdRequest("intrepid", "Faroe");            

            DeleteAtsConnectionIdScorecardIdResponse res = sdk.ats.deleteAtsConnectionIdScorecardId(req);

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdScorecardIdRequest](../../models/operations/DeleteAtsConnectionIdScorecardIdRequest.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdScorecardIdResponse](../../models/operations/DeleteAtsConnectionIdScorecardIdResponse.md)**


## getAtsConnectionIdApplication

List all applications

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Bacon"){{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdApplicationRequest req = new GetAtsConnectionIdApplicationRequest("withdrawal"){{
                candidateId = "approach Bacon";
                jobId = "Mobility";
                limit = 576.8d;
                offset = 7467.13d;
                order = "Architect";
                query = "loosely contingency";
                sort = "female";
                updatedGte = OffsetDateTime.parse("2023-09-05T13:59:23.348Z");
            }};            

            GetAtsConnectionIdApplicationResponse res = sdk.ats.getAtsConnectionIdApplication(req);

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationRequest](../../models/operations/GetAtsConnectionIdApplicationRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationResponse](../../models/operations/GetAtsConnectionIdApplicationResponse.md)**


## getAtsConnectionIdApplicationId

Retrieve an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Brand"){{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdApplicationIdRequest req = new GetAtsConnectionIdApplicationIdRequest("Bicycle", "North");            

            GetAtsConnectionIdApplicationIdResponse res = sdk.ats.getAtsConnectionIdApplicationId(req);

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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationIdRequest](../../models/operations/GetAtsConnectionIdApplicationIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationIdResponse](../../models/operations/GetAtsConnectionIdApplicationIdResponse.md)**


## getAtsConnectionIdCandidate

List all candidates

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Executive"){{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdCandidateRequest req = new GetAtsConnectionIdCandidateRequest("optical"){{
                limit = 3001.75d;
                offset = 251d;
                order = "Oriental whether";
                query = "Kroon";
                sort = "content huzzah thistle";
                updatedGte = OffsetDateTime.parse("2022-03-13T15:14:03.645Z");
            }};            

            GetAtsConnectionIdCandidateResponse res = sdk.ats.getAtsConnectionIdCandidate(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateRequest](../../models/operations/GetAtsConnectionIdCandidateRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateResponse](../../models/operations/GetAtsConnectionIdCandidateResponse.md)**


## getAtsConnectionIdCandidateId

Retrieve a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("itaque"){{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdCandidateIdRequest req = new GetAtsConnectionIdCandidateIdRequest("female", "olive");            

            GetAtsConnectionIdCandidateIdResponse res = sdk.ats.getAtsConnectionIdCandidateId(req);

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateIdRequest](../../models/operations/GetAtsConnectionIdCandidateIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateIdResponse](../../models/operations/GetAtsConnectionIdCandidateIdResponse.md)**


## getAtsConnectionIdInterview

List all interviews

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("disinter"){{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdInterviewRequest req = new GetAtsConnectionIdInterviewRequest("Smart"){{
                applicationId = "Strategist blue";
                limit = 3279.77d;
                offset = 4526.93d;
                order = "Customer Oregon";
                query = "ivory";
                sort = "Corporate Account";
                updatedGte = OffsetDateTime.parse("2021-04-20T14:34:40.760Z");
            }};            

            GetAtsConnectionIdInterviewResponse res = sdk.ats.getAtsConnectionIdInterview(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewRequest](../../models/operations/GetAtsConnectionIdInterviewRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewResponse](../../models/operations/GetAtsConnectionIdInterviewResponse.md)**


## getAtsConnectionIdInterviewId

Retrieve a interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("haemorrhage"){{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdInterviewIdRequest req = new GetAtsConnectionIdInterviewIdRequest("Funk", "Gorgeous");            

            GetAtsConnectionIdInterviewIdResponse res = sdk.ats.getAtsConnectionIdInterviewId(req);

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewIdRequest](../../models/operations/GetAtsConnectionIdInterviewIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewIdResponse](../../models/operations/GetAtsConnectionIdInterviewIdResponse.md)**


## getAtsConnectionIdJob

List all jobs

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("process"){{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdJobRequest req = new GetAtsConnectionIdJobRequest("Harbor"){{
                limit = 975.14d;
                offset = 9506.38d;
                order = "Rhode national Kip";
                query = "oversleep Baby transmitter";
                sort = "East Electronic proactive";
                updatedGte = OffsetDateTime.parse("2022-03-22T04:18:28.025Z");
            }};            

            GetAtsConnectionIdJobResponse res = sdk.ats.getAtsConnectionIdJob(req);

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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobRequest](../../models/operations/GetAtsConnectionIdJobRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobResponse](../../models/operations/GetAtsConnectionIdJobResponse.md)**


## getAtsConnectionIdJobId

Retrieve a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("plum"){{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdJobIdRequest req = new GetAtsConnectionIdJobIdRequest("Gold", "bypass");            

            GetAtsConnectionIdJobIdResponse res = sdk.ats.getAtsConnectionIdJobId(req);

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobIdRequest](../../models/operations/GetAtsConnectionIdJobIdRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobIdResponse](../../models/operations/GetAtsConnectionIdJobIdResponse.md)**


## getAtsConnectionIdScorecard

List all scorecards

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("FTP"){{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdScorecardRequest req = new GetAtsConnectionIdScorecardRequest("Gasoline"){{
                applicationId = "Southeast";
                candidateId = "deep Tamarac maximize";
                interviewId = "drive vibrate USB";
                limit = 2304.86d;
                offset = 1149.65d;
                order = "Northeast Northwest Table";
                query = "musty";
                sort = "Bronze";
                updatedGte = OffsetDateTime.parse("2023-02-18T10:02:20.781Z");
            }};            

            GetAtsConnectionIdScorecardResponse res = sdk.ats.getAtsConnectionIdScorecard(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardRequest](../../models/operations/GetAtsConnectionIdScorecardRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardResponse](../../models/operations/GetAtsConnectionIdScorecardResponse.md)**


## getAtsConnectionIdScorecardId

Retrieve a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Aston"){{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdScorecardIdRequest req = new GetAtsConnectionIdScorecardIdRequest("mobile", "Mini");            

            GetAtsConnectionIdScorecardIdResponse res = sdk.ats.getAtsConnectionIdScorecardId(req);

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardIdRequest](../../models/operations/GetAtsConnectionIdScorecardIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardIdResponse](../../models/operations/GetAtsConnectionIdScorecardIdResponse.md)**


## patchAtsConnectionIdApplicationId

Update an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdApplicationIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdApplicationIdResponse;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsApplicationRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("ouch"){{
                    jwt = "";
                }})
                .build();

            PatchAtsConnectionIdApplicationIdRequest req = new PatchAtsConnectionIdApplicationIdRequest("North", "et"){{
                atsApplication = new AtsApplication(){{
                    appliedAt = OffsetDateTime.parse("2023-12-06T09:54:21.775Z");
                    candidateId = "Human";
                    createdAt = OffsetDateTime.parse("2023-10-31T19:54:06.290Z");
                    id = "<ID>";
                    jobId = "Washington";
                    raw = new PropertyAtsApplicationRaw();
                    rejectedAt = OffsetDateTime.parse("2023-07-30T09:27:03.900Z");
                    rejectedReason = "Northwest";
                    source = "quantify models Carolina";
                    status = AtsApplicationStatus.SUBMITTED;
                    updatedAt = OffsetDateTime.parse("2021-05-11T22:36:02.527Z");
                }};
            }};            

            PatchAtsConnectionIdApplicationIdResponse res = sdk.ats.patchAtsConnectionIdApplicationId(req);

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

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdApplicationIdRequest](../../models/operations/PatchAtsConnectionIdApplicationIdRequest.md) | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdApplicationIdResponse](../../models/operations/PatchAtsConnectionIdApplicationIdResponse.md)**


## patchAtsConnectionIdCandidateId

Update a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdCandidateIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdCandidateIdResponse;
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
                .setSecurity(new Security("Hybrid"){{
                    jwt = "";
                }})
                .build();

            PatchAtsConnectionIdCandidateIdRequest req = new PatchAtsConnectionIdCandidateIdRequest("Northeast", "incidunt"){{
                atsCandidate = new AtsCandidate(){{
                    address = new PropertyAtsCandidateAddress(){{
                        address1 = "utilisation female";
                        address2 = "Optimization Unbranded";
                        city = "Gabrielletown";
                        country = "American Samoa";
                        countryCode = "ML";
                        postalCode = "75348";
                        region = "katal up";
                        regionCode = "Senger Electric Direct";
                    }};
                    companyName = "Moen - Gerlach";
                    createdAt = OffsetDateTime.parse("2022-11-23T18:06:40.151Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("Account"){{
                            email = "Carroll65@hotmail.com";
                        }}),
                    }};
                    externalId = "phew qua";
                    id = "<ID>";
                    imageUrl = "Hybrid";
                    name = "ornery whether";
                    raw = new PropertyAtsCandidateRaw();
                    tags = new String[]{{
                        add("Cadillac"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("6th"){{
                            telephone = "Marketing Cotton";
                        }}),
                    }};
                    title = "wad";
                    updatedAt = OffsetDateTime.parse("2022-06-30T03:38:25.993Z");
                }};
            }};            

            PatchAtsConnectionIdCandidateIdResponse res = sdk.ats.patchAtsConnectionIdCandidateId(req);

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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdCandidateIdRequest](../../models/operations/PatchAtsConnectionIdCandidateIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdCandidateIdResponse](../../models/operations/PatchAtsConnectionIdCandidateIdResponse.md)**


## patchAtsConnectionIdInterviewId

Update a interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdInterviewIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdInterviewIdResponse;
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsInterviewRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("coulomb"){{
                    jwt = "";
                }})
                .build();

            PatchAtsConnectionIdInterviewIdRequest req = new PatchAtsConnectionIdInterviewIdRequest("Cruiser", "pascal"){{
                atsInterview = new AtsInterview(){{
                    applicationId = "Buckinghamshire example";
                    candidateId = "salmon";
                    createdAt = OffsetDateTime.parse("2023-12-02T13:16:53.615Z");
                    endAt = OffsetDateTime.parse("2021-07-14T21:18:57.758Z");
                    externalEventXref = "drive input transmitting";
                    id = "<ID>";
                    jobId = "Investor synthesizing";
                    location = "Identity";
                    raw = new PropertyAtsInterviewRaw();
                    startAt = OffsetDateTime.parse("2023-06-29T20:36:38.891Z");
                    status = AtsInterviewStatus.AWAITING_FEEDBACK;
                    updatedAt = OffsetDateTime.parse("2023-01-27T15:59:11.216Z");
                    userIds = new String[]{{
                        add("Myrl"),
                    }};
                }};
            }};            

            PatchAtsConnectionIdInterviewIdResponse res = sdk.ats.patchAtsConnectionIdInterviewId(req);

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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdInterviewIdRequest](../../models/operations/PatchAtsConnectionIdInterviewIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdInterviewIdResponse](../../models/operations/PatchAtsConnectionIdInterviewIdResponse.md)**


## patchAtsConnectionIdJobId

Update a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdJobIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdJobIdResponse;
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
                .setSecurity(new Security("Soap"){{
                    jwt = "";
                }})
                .build();

            PatchAtsConnectionIdJobIdRequest req = new PatchAtsConnectionIdJobIdRequest("jaunty", "leach"){{
                atsJob = new AtsJob(){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2022-02-09T22:20:35.711Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.OTHER){{
                            type = AtsCompensationType.EQUITY;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2022-07-20T18:20:52.596Z");
                    departments = new String[]{{
                        add("temporibus"),
                    }};
                    description = "Face to face needs-based strategy";
                    employmentType = AtsJobEmploymentType.OTHER;
                    hiringManagerIds = new String[]{{
                        add("redundant"),
                    }};
                    id = "<ID>";
                    languageLocale = "tempore";
                    name = "Manager Grand Cambridgeshire";
                    publicJobUrls = new String[]{{
                        add("Hyundai"),
                    }};
                    raw = new PropertyAtsJobRaw();
                    recruiterIds = new String[]{{
                        add("why"),
                    }};
                    remote = false;
                    status = AtsJobStatus.OPEN;
                    updatedAt = OffsetDateTime.parse("2023-10-29T19:21:43.388Z");
                }};
            }};            

            PatchAtsConnectionIdJobIdResponse res = sdk.ats.patchAtsConnectionIdJobId(req);

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdJobIdRequest](../../models/operations/PatchAtsConnectionIdJobIdRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdJobIdResponse](../../models/operations/PatchAtsConnectionIdJobIdResponse.md)**


## patchAtsConnectionIdScorecardId

Update a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdScorecardIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdScorecardIdResponse;
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardRecommendation;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("conventional"){{
                    jwt = "";
                }})
                .build();

            PatchAtsConnectionIdScorecardIdRequest req = new PatchAtsConnectionIdScorecardIdRequest("Cisgender", "Cambridgeshire"){{
                atsScorecard = new AtsScorecard(new PropertyAtsScorecardRaw()){{
                    applicationId = "functionalities Hybrid";
                    candidateId = "gold";
                    createdAt = OffsetDateTime.parse("2022-04-13T14:51:20.146Z");
                    id = "<ID>";
                    interviewId = "Soft target";
                    interviewerId = "blue against";
                    jobId = "Buckinghamshire";
                    recommendation = AtsScorecardRecommendation.STRONG_YES;
                    updatedAt = OffsetDateTime.parse("2021-04-03T02:42:12.059Z");
                }};
            }};            

            PatchAtsConnectionIdScorecardIdResponse res = sdk.ats.patchAtsConnectionIdScorecardId(req);

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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdScorecardIdRequest](../../models/operations/PatchAtsConnectionIdScorecardIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdScorecardIdResponse](../../models/operations/PatchAtsConnectionIdScorecardIdResponse.md)**


## postAtsConnectionIdApplication

Create an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdApplicationResponse;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsApplicationRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Cotton"){{
                    jwt = "";
                }})
                .build();

            PostAtsConnectionIdApplicationRequest req = new PostAtsConnectionIdApplicationRequest("impedit"){{
                atsApplication = new AtsApplication(){{
                    appliedAt = OffsetDateTime.parse("2021-08-17T19:51:25.858Z");
                    candidateId = "Pizza";
                    createdAt = OffsetDateTime.parse("2022-06-18T11:59:47.948Z");
                    id = "<ID>";
                    jobId = "globalize";
                    raw = new PropertyAtsApplicationRaw();
                    rejectedAt = OffsetDateTime.parse("2021-04-05T14:19:56.779Z");
                    rejectedReason = "Kids Van Tasty";
                    source = "Electric Norfolk";
                    status = AtsApplicationStatus.SCREENING;
                    updatedAt = OffsetDateTime.parse("2022-09-29T00:44:25.415Z");
                }};
            }};            

            PostAtsConnectionIdApplicationResponse res = sdk.ats.postAtsConnectionIdApplication(req);

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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdApplicationRequest](../../models/operations/PostAtsConnectionIdApplicationRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdApplicationResponse](../../models/operations/PostAtsConnectionIdApplicationResponse.md)**


## postAtsConnectionIdCandidate

Create a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdCandidateResponse;
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
                .setSecurity(new Security("Elegant"){{
                    jwt = "";
                }})
                .build();

            PostAtsConnectionIdCandidateRequest req = new PostAtsConnectionIdCandidateRequest("iste"){{
                atsCandidate = new AtsCandidate(){{
                    address = new PropertyAtsCandidateAddress(){{
                        address1 = "than";
                        address2 = "Wooden siemens Wooden";
                        city = "Lavonneview";
                        country = "Croatia";
                        countryCode = "FJ";
                        postalCode = "02355";
                        region = "Unbranded Architect";
                        regionCode = "incidunt so candela";
                    }};
                    companyName = "Strosin, Grimes and Rogahn";
                    createdAt = OffsetDateTime.parse("2023-09-26T23:27:03.284Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("reboot"){{
                            email = "Ima.Johns@yahoo.com";
                        }}),
                    }};
                    externalId = "North Compatible";
                    id = "<ID>";
                    imageUrl = "Jewelery";
                    name = "disintermediate Sausages opulent";
                    raw = new PropertyAtsCandidateRaw();
                    tags = new String[]{{
                        add("Rubber"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("Ngultrum"){{
                            telephone = "Savings panel";
                        }}),
                    }};
                    title = "Worcester";
                    updatedAt = OffsetDateTime.parse("2022-03-01T18:35:38.819Z");
                }};
            }};            

            PostAtsConnectionIdCandidateResponse res = sdk.ats.postAtsConnectionIdCandidate(req);

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdCandidateRequest](../../models/operations/PostAtsConnectionIdCandidateRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdCandidateResponse](../../models/operations/PostAtsConnectionIdCandidateResponse.md)**


## postAtsConnectionIdInterview

Create a interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdInterviewRequest;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdInterviewResponse;
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsInterviewRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Tricycle"){{
                    jwt = "";
                }})
                .build();

            PostAtsConnectionIdInterviewRequest req = new PostAtsConnectionIdInterviewRequest("hertz"){{
                atsInterview = new AtsInterview(){{
                    applicationId = "Stokes North Northeast";
                    candidateId = "vertical platforms";
                    createdAt = OffsetDateTime.parse("2023-03-16T18:42:23.230Z");
                    endAt = OffsetDateTime.parse("2022-05-12T23:51:49.123Z");
                    externalEventXref = "panel Identity";
                    id = "<ID>";
                    jobId = "Northwest Buckinghamshire";
                    location = "ultimately Chevrolet";
                    raw = new PropertyAtsInterviewRaw();
                    startAt = OffsetDateTime.parse("2023-12-01T23:03:25.142Z");
                    status = AtsInterviewStatus.SCHEDULED;
                    updatedAt = OffsetDateTime.parse("2022-05-19T12:56:14.783Z");
                    userIds = new String[]{{
                        add("Northeast"),
                    }};
                }};
            }};            

            PostAtsConnectionIdInterviewResponse res = sdk.ats.postAtsConnectionIdInterview(req);

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdInterviewRequest](../../models/operations/PostAtsConnectionIdInterviewRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdInterviewResponse](../../models/operations/PostAtsConnectionIdInterviewResponse.md)**


## postAtsConnectionIdJob

Create a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdJobRequest;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdJobResponse;
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
                .setSecurity(new Security("Niger"){{
                    jwt = "";
                }})
                .build();

            PostAtsConnectionIdJobRequest req = new PostAtsConnectionIdJobRequest("Gasoline"){{
                atsJob = new AtsJob(){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2023-05-31T23:44:36.015Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.SALARY){{
                            type = AtsCompensationType.STOCK_OPTIONS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2023-08-05T11:53:41.093Z");
                    departments = new String[]{{
                        add("kelvin"),
                    }};
                    description = "Cross-group tertiary success";
                    employmentType = AtsJobEmploymentType.VOLUNTEER;
                    hiringManagerIds = new String[]{{
                        add("Diesel"),
                    }};
                    id = "<ID>";
                    languageLocale = "web scale";
                    name = "Rockford";
                    publicJobUrls = new String[]{{
                        add("crossly"),
                    }};
                    raw = new PropertyAtsJobRaw();
                    recruiterIds = new String[]{{
                        add("Krona"),
                    }};
                    remote = false;
                    status = AtsJobStatus.CLOSED;
                    updatedAt = OffsetDateTime.parse("2022-09-23T22:03:01.333Z");
                }};
            }};            

            PostAtsConnectionIdJobResponse res = sdk.ats.postAtsConnectionIdJob(req);

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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdJobRequest](../../models/operations/PostAtsConnectionIdJobRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdJobResponse](../../models/operations/PostAtsConnectionIdJobResponse.md)**


## postAtsConnectionIdScorecard

Create a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdScorecardRequest;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdScorecardResponse;
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardRecommendation;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("cultivate"){{
                    jwt = "";
                }})
                .build();

            PostAtsConnectionIdScorecardRequest req = new PostAtsConnectionIdScorecardRequest("Infrastructure"){{
                atsScorecard = new AtsScorecard(new PropertyAtsScorecardRaw()){{
                    applicationId = "compelling grey Cotton";
                    candidateId = "Granite uniform now";
                    createdAt = OffsetDateTime.parse("2022-03-02T00:20:35.044Z");
                    id = "<ID>";
                    interviewId = "Legacy tan";
                    interviewerId = "programming And Southeast";
                    jobId = "Frozen";
                    recommendation = AtsScorecardRecommendation.DEFINITELY_NO;
                    updatedAt = OffsetDateTime.parse("2023-05-04T04:13:26.389Z");
                }};
            }};            

            PostAtsConnectionIdScorecardResponse res = sdk.ats.postAtsConnectionIdScorecard(req);

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdScorecardRequest](../../models/operations/PostAtsConnectionIdScorecardRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdScorecardResponse](../../models/operations/PostAtsConnectionIdScorecardResponse.md)**


## putAtsConnectionIdApplicationId

Update an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdApplicationIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdApplicationIdResponse;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsApplicationRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("farad"){{
                    jwt = "";
                }})
                .build();

            PutAtsConnectionIdApplicationIdRequest req = new PutAtsConnectionIdApplicationIdRequest("Indianapolis", "Credit"){{
                atsApplication = new AtsApplication(){{
                    appliedAt = OffsetDateTime.parse("2021-06-01T03:05:28.938Z");
                    candidateId = "middleware Jeep";
                    createdAt = OffsetDateTime.parse("2021-12-14T14:50:12.070Z");
                    id = "<ID>";
                    jobId = "North";
                    raw = new PropertyAtsApplicationRaw();
                    rejectedAt = OffsetDateTime.parse("2022-10-28T04:38:47.547Z");
                    rejectedReason = "Fort solid";
                    source = "Ghana";
                    status = AtsApplicationStatus.REVIEWING;
                    updatedAt = OffsetDateTime.parse("2023-03-12T05:49:54.060Z");
                }};
            }};            

            PutAtsConnectionIdApplicationIdResponse res = sdk.ats.putAtsConnectionIdApplicationId(req);

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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdApplicationIdRequest](../../models/operations/PutAtsConnectionIdApplicationIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdApplicationIdResponse](../../models/operations/PutAtsConnectionIdApplicationIdResponse.md)**


## putAtsConnectionIdCandidateId

Update a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdCandidateIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdCandidateIdResponse;
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
                .setSecurity(new Security("East"){{
                    jwt = "";
                }})
                .build();

            PutAtsConnectionIdCandidateIdRequest req = new PutAtsConnectionIdCandidateIdRequest("Northwest", "Specialist"){{
                atsCandidate = new AtsCandidate(){{
                    address = new PropertyAtsCandidateAddress(){{
                        address1 = "interface compress";
                        address2 = "nicely Personal";
                        city = "New Vicenteshire";
                        country = "Algeria";
                        countryCode = "VN";
                        postalCode = "52769";
                        region = "Account person";
                        regionCode = "redundant";
                    }};
                    companyName = "Barton - Kautzer";
                    createdAt = OffsetDateTime.parse("2022-03-27T16:22:41.297Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("copying"){{
                            email = "Allison.Jakubowski@yahoo.com";
                        }}),
                    }};
                    externalId = "Concrete homogeneous";
                    id = "<ID>";
                    imageUrl = "Triathlon/Time aha";
                    name = "sternly";
                    raw = new PropertyAtsCandidateRaw();
                    tags = new String[]{{
                        add("empower"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("Account"){{
                            telephone = "Chief anenst Electronic";
                        }}),
                    }};
                    title = "azure West Ann";
                    updatedAt = OffsetDateTime.parse("2021-03-04T23:48:18.784Z");
                }};
            }};            

            PutAtsConnectionIdCandidateIdResponse res = sdk.ats.putAtsConnectionIdCandidateId(req);

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdCandidateIdRequest](../../models/operations/PutAtsConnectionIdCandidateIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdCandidateIdResponse](../../models/operations/PutAtsConnectionIdCandidateIdResponse.md)**


## putAtsConnectionIdInterviewId

Update a interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdInterviewIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdInterviewIdResponse;
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsInterviewRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("amet"){{
                    jwt = "";
                }})
                .build();

            PutAtsConnectionIdInterviewIdRequest req = new PutAtsConnectionIdInterviewIdRequest("Global", "greatness"){{
                atsInterview = new AtsInterview(){{
                    applicationId = "Meriden disbelieve online";
                    candidateId = "architectures";
                    createdAt = OffsetDateTime.parse("2023-07-30T10:46:54.075Z");
                    endAt = OffsetDateTime.parse("2021-02-05T22:53:23.541Z");
                    externalEventXref = "1080p";
                    id = "<ID>";
                    jobId = "Quality";
                    location = "Metal Ferrari";
                    raw = new PropertyAtsInterviewRaw();
                    startAt = OffsetDateTime.parse("2021-05-02T03:07:23.809Z");
                    status = AtsInterviewStatus.AWAITING_FEEDBACK;
                    updatedAt = OffsetDateTime.parse("2023-11-10T18:42:28.617Z");
                    userIds = new String[]{{
                        add("Cis"),
                    }};
                }};
            }};            

            PutAtsConnectionIdInterviewIdResponse res = sdk.ats.putAtsConnectionIdInterviewId(req);

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdInterviewIdRequest](../../models/operations/PutAtsConnectionIdInterviewIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdInterviewIdResponse](../../models/operations/PutAtsConnectionIdInterviewIdResponse.md)**


## putAtsConnectionIdJobId

Update a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdJobIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdJobIdResponse;
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
                .setSecurity(new Security("invoice"){{
                    jwt = "";
                }})
                .build();

            PutAtsConnectionIdJobIdRequest req = new PutAtsConnectionIdJobIdRequest("Keyboard", "rosin"){{
                atsJob = new AtsJob(){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2023-09-25T12:33:30.812Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.EQUITY){{
                            type = AtsCompensationType.STOCK_OPTIONS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2023-06-27T17:12:53.112Z");
                    departments = new String[]{{
                        add("Intelligent"),
                    }};
                    description = "Total multi-tasking firmware";
                    employmentType = AtsJobEmploymentType.CONSULTANT;
                    hiringManagerIds = new String[]{{
                        add("male"),
                    }};
                    id = "<ID>";
                    languageLocale = "Home generation online";
                    name = "Bicycle empower";
                    publicJobUrls = new String[]{{
                        add("Avon"),
                    }};
                    raw = new PropertyAtsJobRaw();
                    recruiterIds = new String[]{{
                        add("installation"),
                    }};
                    remote = false;
                    status = AtsJobStatus.DRAFT;
                    updatedAt = OffsetDateTime.parse("2022-08-01T11:34:29.941Z");
                }};
            }};            

            PutAtsConnectionIdJobIdResponse res = sdk.ats.putAtsConnectionIdJobId(req);

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdJobIdRequest](../../models/operations/PutAtsConnectionIdJobIdRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdJobIdResponse](../../models/operations/PutAtsConnectionIdJobIdResponse.md)**


## putAtsConnectionIdScorecardId

Update a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdScorecardIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdScorecardIdResponse;
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardRecommendation;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("primary"){{
                    jwt = "";
                }})
                .build();

            PutAtsConnectionIdScorecardIdRequest req = new PutAtsConnectionIdScorecardIdRequest("Incredible", "Draper"){{
                atsScorecard = new AtsScorecard(new PropertyAtsScorecardRaw()){{
                    applicationId = "Computer Electric";
                    candidateId = "Bugatti Minivan";
                    createdAt = OffsetDateTime.parse("2021-08-13T02:19:12.551Z");
                    id = "<ID>";
                    interviewId = "Optional Oregon Adventure";
                    interviewerId = "AI";
                    jobId = "eveniet Home";
                    recommendation = AtsScorecardRecommendation.YES;
                    updatedAt = OffsetDateTime.parse("2021-08-24T23:05:01.366Z");
                }};
            }};            

            PutAtsConnectionIdScorecardIdResponse res = sdk.ats.putAtsConnectionIdScorecardId(req);

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdScorecardIdRequest](../../models/operations/PutAtsConnectionIdScorecardIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdScorecardIdResponse](../../models/operations/PutAtsConnectionIdScorecardIdResponse.md)**

