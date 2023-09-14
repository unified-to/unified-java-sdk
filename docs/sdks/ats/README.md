# ats

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
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdApplicationIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteAtsConnectionIdApplicationIdRequest req = new DeleteAtsConnectionIdApplicationIdRequest("blanditiis", "error");            

            DeleteAtsConnectionIdApplicationIdResponse res = sdk.ats.deleteAtsConnectionIdApplicationId(req, new DeleteAtsConnectionIdApplicationIdSecurity("eaque") {{
                jwt = "";
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

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdApplicationIdRequest](../../models/operations/DeleteAtsConnectionIdApplicationIdRequest.md)   | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |
| `security`                                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdApplicationIdSecurity](../../models/operations/DeleteAtsConnectionIdApplicationIdSecurity.md) | :heavy_check_mark:                                                                                                                                             | The security requirements to use for the request.                                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdCandidateIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteAtsConnectionIdCandidateIdRequest req = new DeleteAtsConnectionIdCandidateIdRequest("occaecati", "rerum");            

            DeleteAtsConnectionIdCandidateIdResponse res = sdk.ats.deleteAtsConnectionIdCandidateId(req, new DeleteAtsConnectionIdCandidateIdSecurity("adipisci") {{
                jwt = "";
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

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdCandidateIdRequest](../../models/operations/DeleteAtsConnectionIdCandidateIdRequest.md)   | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |
| `security`                                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdCandidateIdSecurity](../../models/operations/DeleteAtsConnectionIdCandidateIdSecurity.md) | :heavy_check_mark:                                                                                                                                         | The security requirements to use for the request.                                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdInterviewIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteAtsConnectionIdInterviewIdRequest req = new DeleteAtsConnectionIdInterviewIdRequest("asperiores", "earum");            

            DeleteAtsConnectionIdInterviewIdResponse res = sdk.ats.deleteAtsConnectionIdInterviewId(req, new DeleteAtsConnectionIdInterviewIdSecurity("modi") {{
                jwt = "";
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

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdInterviewIdRequest](../../models/operations/DeleteAtsConnectionIdInterviewIdRequest.md)   | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |
| `security`                                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdInterviewIdSecurity](../../models/operations/DeleteAtsConnectionIdInterviewIdSecurity.md) | :heavy_check_mark:                                                                                                                                         | The security requirements to use for the request.                                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdJobIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteAtsConnectionIdJobIdRequest req = new DeleteAtsConnectionIdJobIdRequest("iste", "dolorum");            

            DeleteAtsConnectionIdJobIdResponse res = sdk.ats.deleteAtsConnectionIdJobId(req, new DeleteAtsConnectionIdJobIdSecurity("deleniti") {{
                jwt = "";
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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdJobIdRequest](../../models/operations/DeleteAtsConnectionIdJobIdRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdJobIdSecurity](../../models/operations/DeleteAtsConnectionIdJobIdSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdScorecardIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteAtsConnectionIdScorecardIdRequest req = new DeleteAtsConnectionIdScorecardIdRequest("pariatur", "provident");            

            DeleteAtsConnectionIdScorecardIdResponse res = sdk.ats.deleteAtsConnectionIdScorecardId(req, new DeleteAtsConnectionIdScorecardIdSecurity("nobis") {{
                jwt = "";
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

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdScorecardIdRequest](../../models/operations/DeleteAtsConnectionIdScorecardIdRequest.md)   | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |
| `security`                                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdScorecardIdSecurity](../../models/operations/DeleteAtsConnectionIdScorecardIdSecurity.md) | :heavy_check_mark:                                                                                                                                         | The security requirements to use for the request.                                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdApplicationRequest req = new GetAtsConnectionIdApplicationRequest("libero") {{
                candidateId = "delectus";
                jobId = "quaerat";
                limit = 5542.42d;
                offset = 3982.21d;
                order = "dolorem";
                query = "dolorem";
                sort = "dolor";
                updatedGte = OffsetDateTime.parse("2022-10-13T03:45:19.154Z");
            }};            

            GetAtsConnectionIdApplicationResponse res = sdk.ats.getAtsConnectionIdApplication(req, new GetAtsConnectionIdApplicationSecurity("hic") {{
                jwt = "";
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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationRequest](../../models/operations/GetAtsConnectionIdApplicationRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationSecurity](../../models/operations/GetAtsConnectionIdApplicationSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


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
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdApplicationIdRequest req = new GetAtsConnectionIdApplicationIdRequest("excepturi", "cum");            

            GetAtsConnectionIdApplicationIdResponse res = sdk.ats.getAtsConnectionIdApplicationId(req, new GetAtsConnectionIdApplicationIdSecurity("voluptate") {{
                jwt = "";
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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationIdRequest](../../models/operations/GetAtsConnectionIdApplicationIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationIdSecurity](../../models/operations/GetAtsConnectionIdApplicationIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdCandidateRequest req = new GetAtsConnectionIdCandidateRequest("dignissimos") {{
                limit = 9702.37d;
                offset = 2274.14d;
                order = "dolorum";
                query = "numquam";
                sort = "veritatis";
                updatedGte = OffsetDateTime.parse("2022-12-11T09:46:30.457Z");
            }};            

            GetAtsConnectionIdCandidateResponse res = sdk.ats.getAtsConnectionIdCandidate(req, new GetAtsConnectionIdCandidateSecurity("iure") {{
                jwt = "";
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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateRequest](../../models/operations/GetAtsConnectionIdCandidateRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateSecurity](../../models/operations/GetAtsConnectionIdCandidateSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdCandidateIdRequest req = new GetAtsConnectionIdCandidateIdRequest("odio", "quaerat");            

            GetAtsConnectionIdCandidateIdResponse res = sdk.ats.getAtsConnectionIdCandidateId(req, new GetAtsConnectionIdCandidateIdSecurity("accusamus") {{
                jwt = "";
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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateIdRequest](../../models/operations/GetAtsConnectionIdCandidateIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdCandidateIdSecurity](../../models/operations/GetAtsConnectionIdCandidateIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


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
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdInterviewRequest req = new GetAtsConnectionIdInterviewRequest("quidem") {{
                applicationId = "voluptatibus";
                limit = 3777.52d;
                offset = 6176.58d;
                order = "eos";
                query = "atque";
                sort = "sit";
                updatedGte = OffsetDateTime.parse("2022-10-19T08:40:45.996Z");
            }};            

            GetAtsConnectionIdInterviewResponse res = sdk.ats.getAtsConnectionIdInterview(req, new GetAtsConnectionIdInterviewSecurity("soluta") {{
                jwt = "";
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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewRequest](../../models/operations/GetAtsConnectionIdInterviewRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewSecurity](../../models/operations/GetAtsConnectionIdInterviewSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdInterviewIdRequest req = new GetAtsConnectionIdInterviewIdRequest("dolorum", "iusto");            

            GetAtsConnectionIdInterviewIdResponse res = sdk.ats.getAtsConnectionIdInterviewId(req, new GetAtsConnectionIdInterviewIdSecurity("voluptate") {{
                jwt = "";
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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewIdRequest](../../models/operations/GetAtsConnectionIdInterviewIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewIdSecurity](../../models/operations/GetAtsConnectionIdInterviewIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


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
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdJobRequest req = new GetAtsConnectionIdJobRequest("dolorum") {{
                limit = 5365.79d;
                offset = 6070.45d;
                order = "necessitatibus";
                query = "distinctio";
                sort = "asperiores";
                updatedGte = OffsetDateTime.parse("2022-10-13T19:58:56.024Z");
            }};            

            GetAtsConnectionIdJobResponse res = sdk.ats.getAtsConnectionIdJob(req, new GetAtsConnectionIdJobSecurity("voluptate") {{
                jwt = "";
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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobRequest](../../models/operations/GetAtsConnectionIdJobRequest.md)   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobSecurity](../../models/operations/GetAtsConnectionIdJobSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


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
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdJobIdRequest req = new GetAtsConnectionIdJobIdRequest("id", "saepe");            

            GetAtsConnectionIdJobIdResponse res = sdk.ats.getAtsConnectionIdJobId(req, new GetAtsConnectionIdJobIdSecurity("eius") {{
                jwt = "";
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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobIdRequest](../../models/operations/GetAtsConnectionIdJobIdRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobIdSecurity](../../models/operations/GetAtsConnectionIdJobIdSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdScorecardRequest req = new GetAtsConnectionIdScorecardRequest("aspernatur") {{
                applicationId = "perferendis";
                candidateId = "amet";
                interviewId = "optio";
                limit = 8815.86d;
                offset = 3200.17d;
                order = "saepe";
                query = "suscipit";
                sort = "deserunt";
                updatedGte = OffsetDateTime.parse("2022-05-08T23:33:14.875Z");
            }};            

            GetAtsConnectionIdScorecardResponse res = sdk.ats.getAtsConnectionIdScorecard(req, new GetAtsConnectionIdScorecardSecurity("repellendus") {{
                jwt = "";
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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardRequest](../../models/operations/GetAtsConnectionIdScorecardRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardSecurity](../../models/operations/GetAtsConnectionIdScorecardSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdScorecardIdRequest req = new GetAtsConnectionIdScorecardIdRequest("totam", "similique");            

            GetAtsConnectionIdScorecardIdResponse res = sdk.ats.getAtsConnectionIdScorecardId(req, new GetAtsConnectionIdScorecardIdSecurity("alias") {{
                jwt = "";
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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardIdRequest](../../models/operations/GetAtsConnectionIdScorecardIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardIdSecurity](../../models/operations/GetAtsConnectionIdScorecardIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


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
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdApplicationIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsApplicationRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchAtsConnectionIdApplicationIdRequest req = new PatchAtsConnectionIdApplicationIdRequest("at", "quaerat") {{
                atsApplication = new AtsApplication() {{
                    appliedAt = OffsetDateTime.parse("2022-07-29T17:02:39.743Z");
                    candidateId = "quod";
                    createdAt = OffsetDateTime.parse("2022-06-11T17:29:13.872Z");
                    id = "af7a73cf-3be4-453f-870b-326b5a73429c";
                    jobId = "pariatur";
                    raw = new PropertyAtsApplicationRaw();;
                    rejectedAt = OffsetDateTime.parse("2022-10-07T04:50:29.805Z");
                    rejectedReason = "laborum";
                    source = "totam";
                    status = AtsApplicationStatus.SUBMITTED;
                    updatedAt = OffsetDateTime.parse("2022-10-29T03:47:52.981Z");
                }};;
            }};            

            PatchAtsConnectionIdApplicationIdResponse res = sdk.ats.patchAtsConnectionIdApplicationId(req, new PatchAtsConnectionIdApplicationIdSecurity("distinctio") {{
                jwt = "";
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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdApplicationIdRequest](../../models/operations/PatchAtsConnectionIdApplicationIdRequest.md)   | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |
| `security`                                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdApplicationIdSecurity](../../models/operations/PatchAtsConnectionIdApplicationIdSecurity.md) | :heavy_check_mark:                                                                                                                                           | The security requirements to use for the request.                                                                                                            |


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
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdCandidateIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchAtsConnectionIdCandidateIdRequest req = new PatchAtsConnectionIdCandidateIdRequest("facilis", "aliquid") {{
                atsCandidate = new AtsCandidate() {{
                    address = new PropertyAtsCandidateAddress() {{
                        address1 = "quam";
                        address2 = "molestias";
                        city = "Citrus Heights";
                        country = "Cook Islands";
                        countryCode = "BZ";
                        postalCode = "41379";
                        region = "voluptatem";
                        regionCode = "cumque";
                    }};;
                    companyName = "soluta";
                    createdAt = OffsetDateTime.parse("2022-10-25T09:42:54.177Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("aperiam") {{
                            email = "Cydney_Boehm73@hotmail.com";
                            type = AtsEmailType.HOME;
                        }}),
                    }};
                    externalId = "delectus";
                    id = "3443a110-8e0a-4dcf-8b92-1879fce953f7";
                    imageUrl = "consectetur";
                    name = "Roman Kulas";
                    raw = new PropertyAtsCandidateRaw();;
                    tags = new String[]{{
                        add("quod"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("facilis") {{
                            telephone = "odio";
                            type = AtsTelephoneType.FAX;
                        }}),
                    }};
                    title = "Dr.";
                    updatedAt = OffsetDateTime.parse("2022-09-16T01:08:31.616Z");
                }};;
            }};            

            PatchAtsConnectionIdCandidateIdResponse res = sdk.ats.patchAtsConnectionIdCandidateId(req, new PatchAtsConnectionIdCandidateIdSecurity("quibusdam") {{
                jwt = "";
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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdCandidateIdRequest](../../models/operations/PatchAtsConnectionIdCandidateIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdCandidateIdSecurity](../../models/operations/PatchAtsConnectionIdCandidateIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdInterviewIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsInterviewRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchAtsConnectionIdInterviewIdRequest req = new PatchAtsConnectionIdInterviewIdRequest("illum", "sequi") {{
                atsInterview = new AtsInterview() {{
                    applicationId = "natus";
                    candidateId = "impedit";
                    createdAt = OffsetDateTime.parse("2022-01-10T09:29:38.619Z");
                    endAt = OffsetDateTime.parse("2022-02-20T06:09:58.619Z");
                    externalEventXref = "fugit";
                    id = "cff7c70a-4562-46d4-b681-3f16d9f5fce6";
                    jobId = "impedit";
                    location = "corporis";
                    raw = new PropertyAtsInterviewRaw();;
                    startAt = OffsetDateTime.parse("2022-08-08T04:23:21.555Z");
                    status = AtsInterviewStatus.SCHEDULED;
                    updatedAt = OffsetDateTime.parse("2022-08-05T08:34:01.942Z");
                    userIds = new String[]{{
                        add("quo"),
                    }};
                }};;
            }};            

            PatchAtsConnectionIdInterviewIdResponse res = sdk.ats.patchAtsConnectionIdInterviewId(req, new PatchAtsConnectionIdInterviewIdSecurity("consectetur") {{
                jwt = "";
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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdInterviewIdRequest](../../models/operations/PatchAtsConnectionIdInterviewIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdInterviewIdSecurity](../../models/operations/PatchAtsConnectionIdInterviewIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdJobIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationFrequency;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobEmploymentType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsJobRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchAtsConnectionIdJobIdRequest req = new PatchAtsConnectionIdJobIdRequest("recusandae", "aspernatur") {{
                atsJob = new AtsJob() {{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress() {{
                            address1 = "minima";
                            address2 = "eaque";
                            city = "Rancho Cordova";
                            country = "American Samoa";
                            countryCode = "AF";
                            postalCode = "73180-2066";
                            region = "placeat";
                            regionCode = "velit";
                        }}),
                    }};
                    closedAt = OffsetDateTime.parse("2022-07-31T12:04:26.954Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.EQUITY) {{
                            currency = "nobis";
                            frequency = AtsCompensationFrequency.YEAR;
                            max = 8296.03d;
                            min = 8605.52d;
                            type = AtsCompensationType.BONUS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2022-09-24T07:55:38.504Z");
                    departments = new String[]{{
                        add("numquam"),
                    }};
                    description = "explicabo";
                    employmentType = AtsJobEmploymentType.VOLUNTEER;
                    hiringManagerIds = new String[]{{
                        add("ipsa"),
                    }};
                    id = "7474778a-7bd4-466d-a8c1-0ab3cdca4251";
                    languageLocale = "cupiditate";
                    name = "Rhonda Toy";
                    publicJobUrls = new String[]{{
                        add("sequi"),
                    }};
                    raw = new PropertyAtsJobRaw();;
                    recruiterIds = new String[]{{
                        add("quo"),
                    }};
                    remote = false;
                    status = AtsJobStatus.DRAFT;
                    updatedAt = OffsetDateTime.parse("2022-11-13T03:35:18.820Z");
                }};;
            }};            

            PatchAtsConnectionIdJobIdResponse res = sdk.ats.patchAtsConnectionIdJobId(req, new PatchAtsConnectionIdJobIdSecurity("distinctio") {{
                jwt = "";
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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdJobIdRequest](../../models/operations/PatchAtsConnectionIdJobIdRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdJobIdSecurity](../../models/operations/PatchAtsConnectionIdJobIdSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


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
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdScorecardIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardRecommendation;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchAtsConnectionIdScorecardIdRequest req = new PatchAtsConnectionIdScorecardIdRequest("quod", "dignissimos") {{
                atsScorecard = new AtsScorecard(                new PropertyAtsScorecardRaw();) {{
                    applicationId = "inventore";
                    candidateId = "nihil";
                    createdAt = OffsetDateTime.parse("2021-03-27T14:55:59.726Z");
                    id = "4796f2a7-0c68-4828-aaa4-82562f222e98";
                    interviewId = "et";
                    interviewerId = "esse";
                    jobId = "eveniet";
                    recommendation = AtsScorecardRecommendation.STRONG_YES;
                    updatedAt = OffsetDateTime.parse("2022-07-17T14:37:45.086Z");
                }};;
            }};            

            PatchAtsConnectionIdScorecardIdResponse res = sdk.ats.patchAtsConnectionIdScorecardId(req, new PatchAtsConnectionIdScorecardIdSecurity("quod") {{
                jwt = "";
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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdScorecardIdRequest](../../models/operations/PatchAtsConnectionIdScorecardIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdScorecardIdSecurity](../../models/operations/PatchAtsConnectionIdScorecardIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdApplicationSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsApplicationRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostAtsConnectionIdApplicationRequest req = new PostAtsConnectionIdApplicationRequest("nam") {{
                atsApplication = new AtsApplication() {{
                    appliedAt = OffsetDateTime.parse("2021-10-21T01:36:51.257Z");
                    candidateId = "quasi";
                    createdAt = OffsetDateTime.parse("2021-09-21T04:40:52.923Z");
                    id = "b7b95bc0-ab3c-420c-8f37-89fd871f99dd";
                    jobId = "quia";
                    raw = new PropertyAtsApplicationRaw();;
                    rejectedAt = OffsetDateTime.parse("2020-01-10T06:57:07.831Z");
                    rejectedReason = "facere";
                    source = "veritatis";
                    status = AtsApplicationStatus.REVIEWING;
                    updatedAt = OffsetDateTime.parse("2022-05-16T10:50:58.442Z");
                }};;
            }};            

            PostAtsConnectionIdApplicationResponse res = sdk.ats.postAtsConnectionIdApplication(req, new PostAtsConnectionIdApplicationSecurity("culpa") {{
                jwt = "";
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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdApplicationRequest](../../models/operations/PostAtsConnectionIdApplicationRequest.md)   | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |
| `security`                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdApplicationSecurity](../../models/operations/PostAtsConnectionIdApplicationSecurity.md) | :heavy_check_mark:                                                                                                                                     | The security requirements to use for the request.                                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdCandidateSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostAtsConnectionIdCandidateRequest req = new PostAtsConnectionIdCandidateRequest("aliquid") {{
                atsCandidate = new AtsCandidate() {{
                    address = new PropertyAtsCandidateAddress() {{
                        address1 = "tenetur";
                        address2 = "quae";
                        city = "Jackson";
                        country = "Jordan";
                        countryCode = "EG";
                        postalCode = "87039-1343";
                        region = "nisi";
                        regionCode = "aut";
                    }};;
                    companyName = "voluptatum";
                    createdAt = OffsetDateTime.parse("2022-02-26T10:39:59.909Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("quasi") {{
                            email = "Kailyn.Ward60@yahoo.com";
                            type = AtsEmailType.OTHER;
                        }}),
                    }};
                    externalId = "at";
                    id = "17051339-d080-486a-9840-394c26071f93";
                    imageUrl = "voluptatibus";
                    name = "Tabitha Bayer";
                    raw = new PropertyAtsCandidateRaw();;
                    tags = new String[]{{
                        add("consequuntur"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("maxime") {{
                            telephone = "repellendus";
                            type = AtsTelephoneType.FAX;
                        }}),
                    }};
                    title = "Ms.";
                    updatedAt = OffsetDateTime.parse("2021-01-08T17:32:26.674Z");
                }};;
            }};            

            PostAtsConnectionIdCandidateResponse res = sdk.ats.postAtsConnectionIdCandidate(req, new PostAtsConnectionIdCandidateSecurity("nemo") {{
                jwt = "";
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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdCandidateRequest](../../models/operations/PostAtsConnectionIdCandidateRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdCandidateSecurity](../../models/operations/PostAtsConnectionIdCandidateSecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


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
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdInterviewSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsInterviewRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostAtsConnectionIdInterviewRequest req = new PostAtsConnectionIdInterviewRequest("quae") {{
                atsInterview = new AtsInterview() {{
                    applicationId = "quaerat";
                    candidateId = "porro";
                    createdAt = OffsetDateTime.parse("2022-02-19T04:53:13.708Z");
                    endAt = OffsetDateTime.parse("2022-10-04T21:10:21.697Z");
                    externalEventXref = "fuga";
                    id = "a63aae8d-6786-44db-b675-fd5e60b375ed";
                    jobId = "numquam";
                    location = "doloribus";
                    raw = new PropertyAtsInterviewRaw();;
                    startAt = OffsetDateTime.parse("2022-01-12T07:48:28.322Z");
                    status = AtsInterviewStatus.COMPLETE;
                    updatedAt = OffsetDateTime.parse("2020-04-23T16:59:51.275Z");
                    userIds = new String[]{{
                        add("dolore"),
                    }};
                }};;
            }};            

            PostAtsConnectionIdInterviewResponse res = sdk.ats.postAtsConnectionIdInterview(req, new PostAtsConnectionIdInterviewSecurity("sunt") {{
                jwt = "";
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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdInterviewRequest](../../models/operations/PostAtsConnectionIdInterviewRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdInterviewSecurity](../../models/operations/PostAtsConnectionIdInterviewSecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


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
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdJobSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationFrequency;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobEmploymentType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsJobRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostAtsConnectionIdJobRequest req = new PostAtsConnectionIdJobRequest("asperiores") {{
                atsJob = new AtsJob() {{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress() {{
                            address1 = "adipisci";
                            address2 = "non";
                            city = "North Jena";
                            country = "Uruguay";
                            countryCode = "TM";
                            postalCode = "36309";
                            region = "libero";
                            regionCode = "vitae";
                        }}),
                    }};
                    closedAt = OffsetDateTime.parse("2021-02-08T22:01:14.035Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.BONUS) {{
                            currency = "tempora";
                            frequency = AtsCompensationFrequency.ONE_TIME;
                            max = 3790.57d;
                            min = 3742.44d;
                            type = AtsCompensationType.BONUS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2021-08-22T12:22:32.426Z");
                    departments = new String[]{{
                        add("adipisci"),
                    }};
                    description = "minus";
                    employmentType = AtsJobEmploymentType.PART_TIME;
                    hiringManagerIds = new String[]{{
                        add("blanditiis"),
                    }};
                    id = "744ed53b-88f3-4a8d-8f5c-0b2f2fb7b194";
                    languageLocale = "laborum";
                    name = "Pearl Johnson";
                    publicJobUrls = new String[]{{
                        add("voluptas"),
                    }};
                    raw = new PropertyAtsJobRaw();;
                    recruiterIds = new String[]{{
                        add("unde"),
                    }};
                    remote = false;
                    status = AtsJobStatus.ARCHIVED;
                    updatedAt = OffsetDateTime.parse("2022-01-15T12:09:02.064Z");
                }};;
            }};            

            PostAtsConnectionIdJobResponse res = sdk.ats.postAtsConnectionIdJob(req, new PostAtsConnectionIdJobSecurity("debitis") {{
                jwt = "";
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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdJobRequest](../../models/operations/PostAtsConnectionIdJobRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdJobSecurity](../../models/operations/PostAtsConnectionIdJobSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdScorecardSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardRecommendation;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostAtsConnectionIdScorecardRequest req = new PostAtsConnectionIdScorecardRequest("illo") {{
                atsScorecard = new AtsScorecard(                new PropertyAtsScorecardRaw();) {{
                    applicationId = "reiciendis";
                    candidateId = "perferendis";
                    createdAt = OffsetDateTime.parse("2021-01-15T21:52:35.790Z");
                    id = "4294e369-8f44-47f6-83e8-b445e80ca55e";
                    interviewId = "reiciendis";
                    interviewerId = "nulla";
                    jobId = "magni";
                    recommendation = AtsScorecardRecommendation.DEFINITELY_NO;
                    updatedAt = OffsetDateTime.parse("2022-03-29T06:16:27.485Z");
                }};;
            }};            

            PostAtsConnectionIdScorecardResponse res = sdk.ats.postAtsConnectionIdScorecard(req, new PostAtsConnectionIdScorecardSecurity("veniam") {{
                jwt = "";
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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdScorecardRequest](../../models/operations/PostAtsConnectionIdScorecardRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdScorecardSecurity](../../models/operations/PostAtsConnectionIdScorecardSecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


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
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdApplicationIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsApplicationRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutAtsConnectionIdApplicationIdRequest req = new PutAtsConnectionIdApplicationIdRequest("in", "officiis") {{
                atsApplication = new AtsApplication() {{
                    appliedAt = OffsetDateTime.parse("2022-06-27T22:55:23.952Z");
                    candidateId = "exercitationem";
                    createdAt = OffsetDateTime.parse("2021-07-09T17:29:28.492Z");
                    id = "6a89fbe3-a5aa-48e4-824d-0ab4075088e5";
                    jobId = "et";
                    raw = new PropertyAtsApplicationRaw();;
                    rejectedAt = OffsetDateTime.parse("2022-03-10T15:53:25.215Z");
                    rejectedReason = "sed";
                    source = "sit";
                    status = AtsApplicationStatus.SECOND_INTERVIEW;
                    updatedAt = OffsetDateTime.parse("2022-02-04T05:56:04.733Z");
                }};;
            }};            

            PutAtsConnectionIdApplicationIdResponse res = sdk.ats.putAtsConnectionIdApplicationId(req, new PutAtsConnectionIdApplicationIdSecurity("error") {{
                jwt = "";
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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdApplicationIdRequest](../../models/operations/PutAtsConnectionIdApplicationIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdApplicationIdSecurity](../../models/operations/PutAtsConnectionIdApplicationIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdCandidateIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutAtsConnectionIdCandidateIdRequest req = new PutAtsConnectionIdCandidateIdRequest("consequatur", "incidunt") {{
                atsCandidate = new AtsCandidate() {{
                    address = new PropertyAtsCandidateAddress() {{
                        address1 = "reiciendis";
                        address2 = "dolorem";
                        city = "Buckridgeland";
                        country = "Micronesia";
                        countryCode = "FM";
                        postalCode = "56793-0264";
                        region = "unde";
                        regionCode = "reiciendis";
                    }};;
                    companyName = "provident";
                    createdAt = OffsetDateTime.parse("2020-02-11T18:23:46.078Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail("praesentium") {{
                            email = "Agustin.Orn81@hotmail.com";
                            type = AtsEmailType.OTHER;
                        }}),
                    }};
                    externalId = "mollitia";
                    id = "50ce187f-86bc-4173-9689-eee9526f8d98";
                    imageUrl = "suscipit";
                    name = "Dr. Ivan Littel";
                    raw = new PropertyAtsCandidateRaw();;
                    tags = new String[]{{
                        add("repellendus"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone("doloremque") {{
                            telephone = "labore";
                            type = AtsTelephoneType.MOBILE;
                        }}),
                    }};
                    title = "Dr.";
                    updatedAt = OffsetDateTime.parse("2022-12-18T20:20:36.419Z");
                }};;
            }};            

            PutAtsConnectionIdCandidateIdResponse res = sdk.ats.putAtsConnectionIdCandidateId(req, new PutAtsConnectionIdCandidateIdSecurity("beatae") {{
                jwt = "";
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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdCandidateIdRequest](../../models/operations/PutAtsConnectionIdCandidateIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdCandidateIdSecurity](../../models/operations/PutAtsConnectionIdCandidateIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


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
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdInterviewIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsInterviewRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutAtsConnectionIdInterviewIdRequest req = new PutAtsConnectionIdInterviewIdRequest("dolores", "enim") {{
                atsInterview = new AtsInterview() {{
                    applicationId = "laboriosam";
                    candidateId = "velit";
                    createdAt = OffsetDateTime.parse("2021-04-24T18:03:33.752Z");
                    endAt = OffsetDateTime.parse("2022-02-04T04:20:12.809Z");
                    externalEventXref = "consequuntur";
                    id = "9e973e92-2a57-4a15-be3e-060807e2b6e3";
                    jobId = "laborum";
                    location = "distinctio";
                    raw = new PropertyAtsInterviewRaw();;
                    startAt = OffsetDateTime.parse("2021-12-15T04:55:40.282Z");
                    status = AtsInterviewStatus.SCHEDULED;
                    updatedAt = OffsetDateTime.parse("2022-01-01T17:51:02.411Z");
                    userIds = new String[]{{
                        add("alias"),
                    }};
                }};;
            }};            

            PutAtsConnectionIdInterviewIdResponse res = sdk.ats.putAtsConnectionIdInterviewId(req, new PutAtsConnectionIdInterviewIdSecurity("corporis") {{
                jwt = "";
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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdInterviewIdRequest](../../models/operations/PutAtsConnectionIdInterviewIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdInterviewIdSecurity](../../models/operations/PutAtsConnectionIdInterviewIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


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
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdJobIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationFrequency;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobEmploymentType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsJobRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutAtsConnectionIdJobIdRequest req = new PutAtsConnectionIdJobIdRequest("perspiciatis", "nihil") {{
                atsJob = new AtsJob() {{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress() {{
                            address1 = "mollitia";
                            address2 = "voluptas";
                            city = "Fort Waldoberg";
                            country = "Northern Mariana Islands";
                            countryCode = "GH";
                            postalCode = "62096";
                            region = "quaerat";
                            regionCode = "molestiae";
                        }}),
                    }};
                    closedAt = OffsetDateTime.parse("2022-09-19T08:09:35.938Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.BONUS) {{
                            currency = "culpa";
                            frequency = AtsCompensationFrequency.DAY;
                            max = 8906.53d;
                            min = 5145.13d;
                            type = AtsCompensationType.STOCK_OPTIONS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2021-08-19T02:39:25.517Z");
                    departments = new String[]{{
                        add("provident"),
                    }};
                    description = "quis";
                    employmentType = AtsJobEmploymentType.CONSULTANT;
                    hiringManagerIds = new String[]{{
                        add("reiciendis"),
                    }};
                    id = "9251a5a9-da66-40ff-97bf-aad4f9efc1b4";
                    languageLocale = "quis";
                    name = "Mr. Denise Runolfsdottir";
                    publicJobUrls = new String[]{{
                        add("aspernatur"),
                    }};
                    raw = new PropertyAtsJobRaw();;
                    recruiterIds = new String[]{{
                        add("eum"),
                    }};
                    remote = false;
                    status = AtsJobStatus.PENDING;
                    updatedAt = OffsetDateTime.parse("2021-04-05T02:38:00.020Z");
                }};;
            }};            

            PutAtsConnectionIdJobIdResponse res = sdk.ats.putAtsConnectionIdJobId(req, new PutAtsConnectionIdJobIdSecurity("impedit") {{
                jwt = "";
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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdJobIdRequest](../../models/operations/PutAtsConnectionIdJobIdRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdJobIdSecurity](../../models/operations/PutAtsConnectionIdJobIdSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdScorecardIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardRecommendation;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutAtsConnectionIdScorecardIdRequest req = new PutAtsConnectionIdScorecardIdRequest("eos", "sapiente") {{
                atsScorecard = new AtsScorecard(                new PropertyAtsScorecardRaw();) {{
                    applicationId = "eum";
                    candidateId = "dicta";
                    createdAt = OffsetDateTime.parse("2022-11-22T22:38:36.599Z");
                    id = "99ebfd0e-9fe6-4c63-aca3-aed011799631";
                    interviewId = "magni";
                    interviewerId = "doloribus";
                    jobId = "nulla";
                    recommendation = AtsScorecardRecommendation.STRONG_YES;
                    updatedAt = OffsetDateTime.parse("2022-09-24T01:02:47.291Z");
                }};;
            }};            

            PutAtsConnectionIdScorecardIdResponse res = sdk.ats.putAtsConnectionIdScorecardId(req, new PutAtsConnectionIdScorecardIdSecurity("nihil") {{
                jwt = "";
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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdScorecardIdRequest](../../models/operations/PutAtsConnectionIdScorecardIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdScorecardIdSecurity](../../models/operations/PutAtsConnectionIdScorecardIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdScorecardIdResponse](../../models/operations/PutAtsConnectionIdScorecardIdResponse.md)**

