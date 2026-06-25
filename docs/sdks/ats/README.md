# Ats

## Overview

### Available Operations

* [createAtsActivity2](#createatsactivity2) - Create an activity
* [createAtsApplication2](#createatsapplication2) - Create an application
* [createAtsCandidate2](#createatscandidate2) - Create a candidate
* [createAtsCompany2](#createatscompany2) - Create a company
* [createAtsDocument2](#createatsdocument2) - Create a document
* [createAtsInterview2](#createatsinterview2) - Create an interview
* [createAtsJob2](#createatsjob2) - Create a job
* [createAtsScorecard2](#createatsscorecard2) - Create a scorecard
* [getAtsActivity2](#getatsactivity2) - Retrieve an activity
* [getAtsApplication2](#getatsapplication2) - Retrieve an application
* [getAtsCandidate2](#getatscandidate2) - Retrieve a candidate
* [getAtsCompany2](#getatscompany2) - Retrieve a company
* [getAtsDocument2](#getatsdocument2) - Retrieve a document
* [getAtsInterview2](#getatsinterview2) - Retrieve an interview
* [getAtsJob2](#getatsjob2) - Retrieve a job
* [getAtsScorecard2](#getatsscorecard2) - Retrieve a scorecard
* [listAtsActivities2](#listatsactivities2) - List all activities
* [listAtsApplications2](#listatsapplications2) - List all applications
* [listAtsApplicationstatuses2](#listatsapplicationstatuses2) - List all applicationstatuses
* [listAtsCandidates2](#listatscandidates2) - List all candidates
* [listAtsCompanies2](#listatscompanies2) - List all companies
* [listAtsDocuments2](#listatsdocuments2) - List all documents
* [listAtsInterviews2](#listatsinterviews2) - List all interviews
* [listAtsJobs2](#listatsjobs2) - List all jobs
* [listAtsScorecards2](#listatsscorecards2) - List all scorecards
* [patchAtsActivity2](#patchatsactivity2) - Update an activity
* [patchAtsApplication2](#patchatsapplication2) - Update an application
* [patchAtsCandidate2](#patchatscandidate2) - Update a candidate
* [patchAtsCompany2](#patchatscompany2) - Update a company
* [patchAtsDocument2](#patchatsdocument2) - Update a document
* [patchAtsInterview2](#patchatsinterview2) - Update an interview
* [patchAtsJob2](#patchatsjob2) - Update a job
* [patchAtsScorecard2](#patchatsscorecard2) - Update a scorecard
* [removeAtsActivity2](#removeatsactivity2) - Remove an activity
* [removeAtsApplication2](#removeatsapplication2) - Remove an application
* [removeAtsCandidate2](#removeatscandidate2) - Remove a candidate
* [removeAtsCompany2](#removeatscompany2) - Remove a company
* [removeAtsDocument2](#removeatsdocument2) - Remove a document
* [removeAtsInterview2](#removeatsinterview2) - Remove an interview
* [removeAtsJob2](#removeatsjob2) - Remove a job
* [removeAtsScorecard2](#removeatsscorecard2) - Remove a scorecard
* [updateAtsActivity2](#updateatsactivity2) - Update an activity
* [updateAtsApplication2](#updateatsapplication2) - Update an application
* [updateAtsCandidate2](#updateatscandidate2) - Update a candidate
* [updateAtsCompany2](#updateatscompany2) - Update a company
* [updateAtsDocument2](#updateatsdocument2) - Update a document
* [updateAtsInterview2](#updateatsinterview2) - Update an interview
* [updateAtsJob2](#updateatsjob2) - Update a job
* [updateAtsScorecard2](#updateatsscorecard2) - Update a scorecard

## createAtsActivity2

Create an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsActivity2" method="post" path="/ats/{connection_id}/activity" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsActivity2Request;
import to.unified.unified_java_sdk.models.operations.CreateAtsActivity2Response;
import to.unified.unified_java_sdk.models.shared.AtsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsActivity2Request req = CreateAtsActivity2Request.builder()
                .atsActivity(AtsActivity.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsActivity2Response res = sdk.ats().createAtsActivity2()
                .request(req)
                .call();

        if (res.atsActivity().isPresent()) {
            System.out.println(res.atsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateAtsActivity2Request](../../models/operations/CreateAtsActivity2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateAtsActivity2Response](../../models/operations/CreateAtsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAtsApplication2

Create an application

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsApplication2" method="post" path="/ats/{connection_id}/application" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsApplication2Request;
import to.unified.unified_java_sdk.models.operations.CreateAtsApplication2Response;
import to.unified.unified_java_sdk.models.shared.AtsApplication;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsApplication2Request req = CreateAtsApplication2Request.builder()
                .atsApplication(AtsApplication.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsApplication2Response res = sdk.ats().createAtsApplication2()
                .request(req)
                .call();

        if (res.atsApplication().isPresent()) {
            System.out.println(res.atsApplication().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateAtsApplication2Request](../../models/operations/CreateAtsApplication2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateAtsApplication2Response](../../models/operations/CreateAtsApplication2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAtsCandidate2

Create a candidate

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsCandidate2" method="post" path="/ats/{connection_id}/candidate" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsCandidate2Request;
import to.unified.unified_java_sdk.models.operations.CreateAtsCandidate2Response;
import to.unified.unified_java_sdk.models.shared.AtsCandidate;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsCandidate2Request req = CreateAtsCandidate2Request.builder()
                .atsCandidate(AtsCandidate.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsCandidate2Response res = sdk.ats().createAtsCandidate2()
                .request(req)
                .call();

        if (res.atsCandidate().isPresent()) {
            System.out.println(res.atsCandidate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateAtsCandidate2Request](../../models/operations/CreateAtsCandidate2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateAtsCandidate2Response](../../models/operations/CreateAtsCandidate2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAtsCompany2

Create a company

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsCompany2" method="post" path="/ats/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsCompany2Request;
import to.unified.unified_java_sdk.models.operations.CreateAtsCompany2Response;
import to.unified.unified_java_sdk.models.shared.AtsCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsCompany2Request req = CreateAtsCompany2Request.builder()
                .atsCompany(AtsCompany.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsCompany2Response res = sdk.ats().createAtsCompany2()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            System.out.println(res.atsCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateAtsCompany2Request](../../models/operations/CreateAtsCompany2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateAtsCompany2Response](../../models/operations/CreateAtsCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAtsDocument2

Create a document

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsDocument2" method="post" path="/ats/{connection_id}/document" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsDocument2Request;
import to.unified.unified_java_sdk.models.operations.CreateAtsDocument2Response;
import to.unified.unified_java_sdk.models.shared.AtsDocument;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsDocument2Request req = CreateAtsDocument2Request.builder()
                .atsDocument(AtsDocument.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsDocument2Response res = sdk.ats().createAtsDocument2()
                .request(req)
                .call();

        if (res.atsDocument().isPresent()) {
            System.out.println(res.atsDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateAtsDocument2Request](../../models/operations/CreateAtsDocument2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateAtsDocument2Response](../../models/operations/CreateAtsDocument2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAtsInterview2

Create an interview

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsInterview2" method="post" path="/ats/{connection_id}/interview" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsInterview2Request;
import to.unified.unified_java_sdk.models.operations.CreateAtsInterview2Response;
import to.unified.unified_java_sdk.models.shared.AtsInterview;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsInterview2Request req = CreateAtsInterview2Request.builder()
                .atsInterview(AtsInterview.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsInterview2Response res = sdk.ats().createAtsInterview2()
                .request(req)
                .call();

        if (res.atsInterview().isPresent()) {
            System.out.println(res.atsInterview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateAtsInterview2Request](../../models/operations/CreateAtsInterview2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateAtsInterview2Response](../../models/operations/CreateAtsInterview2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAtsJob2

Create a job

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsJob2" method="post" path="/ats/{connection_id}/job" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsJob2Request;
import to.unified.unified_java_sdk.models.operations.CreateAtsJob2Response;
import to.unified.unified_java_sdk.models.shared.AtsJob;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsJob2Request req = CreateAtsJob2Request.builder()
                .atsJob(AtsJob.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsJob2Response res = sdk.ats().createAtsJob2()
                .request(req)
                .call();

        if (res.atsJob().isPresent()) {
            System.out.println(res.atsJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreateAtsJob2Request](../../models/operations/CreateAtsJob2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateAtsJob2Response](../../models/operations/CreateAtsJob2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAtsScorecard2

Create a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsScorecard2" method="post" path="/ats/{connection_id}/scorecard" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsScorecard2Request;
import to.unified.unified_java_sdk.models.operations.CreateAtsScorecard2Response;
import to.unified.unified_java_sdk.models.shared.AtsScorecard;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsScorecard2Request req = CreateAtsScorecard2Request.builder()
                .atsScorecard(AtsScorecard.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsScorecard2Response res = sdk.ats().createAtsScorecard2()
                .request(req)
                .call();

        if (res.atsScorecard().isPresent()) {
            System.out.println(res.atsScorecard().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateAtsScorecard2Request](../../models/operations/CreateAtsScorecard2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateAtsScorecard2Response](../../models/operations/CreateAtsScorecard2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsActivity2

Retrieve an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsActivity2" method="get" path="/ats/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsActivity2Request;
import to.unified.unified_java_sdk.models.operations.GetAtsActivity2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsActivity2Request req = GetAtsActivity2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsActivity2Response res = sdk.ats().getAtsActivity2()
                .request(req)
                .call();

        if (res.atsActivity().isPresent()) {
            System.out.println(res.atsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetAtsActivity2Request](../../models/operations/GetAtsActivity2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetAtsActivity2Response](../../models/operations/GetAtsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsApplication2

Retrieve an application

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsApplication2" method="get" path="/ats/{connection_id}/application/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsApplication2Request;
import to.unified.unified_java_sdk.models.operations.GetAtsApplication2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsApplication2Request req = GetAtsApplication2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsApplication2Response res = sdk.ats().getAtsApplication2()
                .request(req)
                .call();

        if (res.atsApplication().isPresent()) {
            System.out.println(res.atsApplication().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAtsApplication2Request](../../models/operations/GetAtsApplication2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAtsApplication2Response](../../models/operations/GetAtsApplication2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsCandidate2

Retrieve a candidate

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsCandidate2" method="get" path="/ats/{connection_id}/candidate/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsCandidate2Request;
import to.unified.unified_java_sdk.models.operations.GetAtsCandidate2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsCandidate2Request req = GetAtsCandidate2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsCandidate2Response res = sdk.ats().getAtsCandidate2()
                .request(req)
                .call();

        if (res.atsCandidate().isPresent()) {
            System.out.println(res.atsCandidate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetAtsCandidate2Request](../../models/operations/GetAtsCandidate2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetAtsCandidate2Response](../../models/operations/GetAtsCandidate2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsCompany2

Retrieve a company

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsCompany2" method="get" path="/ats/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsCompany2Request;
import to.unified.unified_java_sdk.models.operations.GetAtsCompany2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsCompany2Request req = GetAtsCompany2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsCompany2Response res = sdk.ats().getAtsCompany2()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            System.out.println(res.atsCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetAtsCompany2Request](../../models/operations/GetAtsCompany2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetAtsCompany2Response](../../models/operations/GetAtsCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsDocument2

Retrieve a document

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsDocument2" method="get" path="/ats/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsDocument2Request;
import to.unified.unified_java_sdk.models.operations.GetAtsDocument2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsDocument2Request req = GetAtsDocument2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsDocument2Response res = sdk.ats().getAtsDocument2()
                .request(req)
                .call();

        if (res.atsDocument().isPresent()) {
            System.out.println(res.atsDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetAtsDocument2Request](../../models/operations/GetAtsDocument2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetAtsDocument2Response](../../models/operations/GetAtsDocument2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsInterview2

Retrieve an interview

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsInterview2" method="get" path="/ats/{connection_id}/interview/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsInterview2Request;
import to.unified.unified_java_sdk.models.operations.GetAtsInterview2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsInterview2Request req = GetAtsInterview2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsInterview2Response res = sdk.ats().getAtsInterview2()
                .request(req)
                .call();

        if (res.atsInterview().isPresent()) {
            System.out.println(res.atsInterview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetAtsInterview2Request](../../models/operations/GetAtsInterview2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetAtsInterview2Response](../../models/operations/GetAtsInterview2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsJob2

Retrieve a job

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsJob2" method="get" path="/ats/{connection_id}/job/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsJob2Request;
import to.unified.unified_java_sdk.models.operations.GetAtsJob2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsJob2Request req = GetAtsJob2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsJob2Response res = sdk.ats().getAtsJob2()
                .request(req)
                .call();

        if (res.atsJob().isPresent()) {
            System.out.println(res.atsJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetAtsJob2Request](../../models/operations/GetAtsJob2Request.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetAtsJob2Response](../../models/operations/GetAtsJob2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsScorecard2

Retrieve a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsScorecard2" method="get" path="/ats/{connection_id}/scorecard/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsScorecard2Request;
import to.unified.unified_java_sdk.models.operations.GetAtsScorecard2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsScorecard2Request req = GetAtsScorecard2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsScorecard2Response res = sdk.ats().getAtsScorecard2()
                .request(req)
                .call();

        if (res.atsScorecard().isPresent()) {
            System.out.println(res.atsScorecard().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetAtsScorecard2Request](../../models/operations/GetAtsScorecard2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetAtsScorecard2Response](../../models/operations/GetAtsScorecard2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsActivities2

List all activities

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsActivities2" method="get" path="/ats/{connection_id}/activity" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsActivities2Request;
import to.unified.unified_java_sdk.models.operations.ListAtsActivities2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsActivities2Request req = ListAtsActivities2Request.builder()
                .connectionId("<id>")
                .build();

        ListAtsActivities2Response res = sdk.ats().listAtsActivities2()
                .request(req)
                .call();

        if (res.atsActivities().isPresent()) {
            System.out.println(res.atsActivities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListAtsActivities2Request](../../models/operations/ListAtsActivities2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListAtsActivities2Response](../../models/operations/ListAtsActivities2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsApplications2

List all applications

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsApplications2" method="get" path="/ats/{connection_id}/application" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsApplications2Request;
import to.unified.unified_java_sdk.models.operations.ListAtsApplications2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsApplications2Request req = ListAtsApplications2Request.builder()
                .connectionId("<id>")
                .build();

        ListAtsApplications2Response res = sdk.ats().listAtsApplications2()
                .request(req)
                .call();

        if (res.atsApplications().isPresent()) {
            System.out.println(res.atsApplications().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListAtsApplications2Request](../../models/operations/ListAtsApplications2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListAtsApplications2Response](../../models/operations/ListAtsApplications2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsApplicationstatuses2

List all applicationstatuses

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsApplicationstatuses2" method="get" path="/ats/{connection_id}/applicationstatus" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsApplicationstatuses2Request;
import to.unified.unified_java_sdk.models.operations.ListAtsApplicationstatuses2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsApplicationstatuses2Request req = ListAtsApplicationstatuses2Request.builder()
                .connectionId("<id>")
                .build();

        ListAtsApplicationstatuses2Response res = sdk.ats().listAtsApplicationstatuses2()
                .request(req)
                .call();

        if (res.atsStatuses().isPresent()) {
            System.out.println(res.atsStatuses().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListAtsApplicationstatuses2Request](../../models/operations/ListAtsApplicationstatuses2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListAtsApplicationstatuses2Response](../../models/operations/ListAtsApplicationstatuses2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsCandidates2

List all candidates

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsCandidates2" method="get" path="/ats/{connection_id}/candidate" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsCandidates2Request;
import to.unified.unified_java_sdk.models.operations.ListAtsCandidates2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsCandidates2Request req = ListAtsCandidates2Request.builder()
                .connectionId("<id>")
                .build();

        ListAtsCandidates2Response res = sdk.ats().listAtsCandidates2()
                .request(req)
                .call();

        if (res.atsCandidates().isPresent()) {
            System.out.println(res.atsCandidates().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListAtsCandidates2Request](../../models/operations/ListAtsCandidates2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListAtsCandidates2Response](../../models/operations/ListAtsCandidates2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsCompanies2

List all companies

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsCompanies2" method="get" path="/ats/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsCompanies2Request;
import to.unified.unified_java_sdk.models.operations.ListAtsCompanies2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsCompanies2Request req = ListAtsCompanies2Request.builder()
                .connectionId("<id>")
                .build();

        ListAtsCompanies2Response res = sdk.ats().listAtsCompanies2()
                .request(req)
                .call();

        if (res.atsCompanies().isPresent()) {
            System.out.println(res.atsCompanies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAtsCompanies2Request](../../models/operations/ListAtsCompanies2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAtsCompanies2Response](../../models/operations/ListAtsCompanies2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsDocuments2

List all documents

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsDocuments2" method="get" path="/ats/{connection_id}/document" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsDocuments2Request;
import to.unified.unified_java_sdk.models.operations.ListAtsDocuments2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsDocuments2Request req = ListAtsDocuments2Request.builder()
                .connectionId("<id>")
                .build();

        ListAtsDocuments2Response res = sdk.ats().listAtsDocuments2()
                .request(req)
                .call();

        if (res.atsDocuments().isPresent()) {
            System.out.println(res.atsDocuments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAtsDocuments2Request](../../models/operations/ListAtsDocuments2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAtsDocuments2Response](../../models/operations/ListAtsDocuments2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsInterviews2

List all interviews

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsInterviews2" method="get" path="/ats/{connection_id}/interview" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsInterviews2Request;
import to.unified.unified_java_sdk.models.operations.ListAtsInterviews2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsInterviews2Request req = ListAtsInterviews2Request.builder()
                .connectionId("<id>")
                .build();

        ListAtsInterviews2Response res = sdk.ats().listAtsInterviews2()
                .request(req)
                .call();

        if (res.atsInterviews().isPresent()) {
            System.out.println(res.atsInterviews().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListAtsInterviews2Request](../../models/operations/ListAtsInterviews2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListAtsInterviews2Response](../../models/operations/ListAtsInterviews2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsJobs2

List all jobs

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsJobs2" method="get" path="/ats/{connection_id}/job" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsJobs2Request;
import to.unified.unified_java_sdk.models.operations.ListAtsJobs2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsJobs2Request req = ListAtsJobs2Request.builder()
                .connectionId("<id>")
                .build();

        ListAtsJobs2Response res = sdk.ats().listAtsJobs2()
                .request(req)
                .call();

        if (res.atsJobs().isPresent()) {
            System.out.println(res.atsJobs().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListAtsJobs2Request](../../models/operations/ListAtsJobs2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListAtsJobs2Response](../../models/operations/ListAtsJobs2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsScorecards2

List all scorecards

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsScorecards2" method="get" path="/ats/{connection_id}/scorecard" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsScorecards2Request;
import to.unified.unified_java_sdk.models.operations.ListAtsScorecards2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsScorecards2Request req = ListAtsScorecards2Request.builder()
                .connectionId("<id>")
                .build();

        ListAtsScorecards2Response res = sdk.ats().listAtsScorecards2()
                .request(req)
                .call();

        if (res.atsScorecards().isPresent()) {
            System.out.println(res.atsScorecards().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListAtsScorecards2Request](../../models/operations/ListAtsScorecards2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListAtsScorecards2Response](../../models/operations/ListAtsScorecards2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsActivity2

Update an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsActivity2" method="patch" path="/ats/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsActivity2Request;
import to.unified.unified_java_sdk.models.operations.PatchAtsActivity2Response;
import to.unified.unified_java_sdk.models.shared.AtsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsActivity2Request req = PatchAtsActivity2Request.builder()
                .atsActivity(AtsActivity.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsActivity2Response res = sdk.ats().patchAtsActivity2()
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
| `request`                                                                       | [PatchAtsActivity2Request](../../models/operations/PatchAtsActivity2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchAtsActivity2Response](../../models/operations/PatchAtsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsApplication2

Update an application

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsApplication2" method="patch" path="/ats/{connection_id}/application/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsApplication2Request;
import to.unified.unified_java_sdk.models.operations.PatchAtsApplication2Response;
import to.unified.unified_java_sdk.models.shared.AtsApplication;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsApplication2Request req = PatchAtsApplication2Request.builder()
                .atsApplication(AtsApplication.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsApplication2Response res = sdk.ats().patchAtsApplication2()
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
| `request`                                                                             | [PatchAtsApplication2Request](../../models/operations/PatchAtsApplication2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchAtsApplication2Response](../../models/operations/PatchAtsApplication2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsCandidate2

Update a candidate

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsCandidate2" method="patch" path="/ats/{connection_id}/candidate/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsCandidate2Request;
import to.unified.unified_java_sdk.models.operations.PatchAtsCandidate2Response;
import to.unified.unified_java_sdk.models.shared.AtsCandidate;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsCandidate2Request req = PatchAtsCandidate2Request.builder()
                .atsCandidate(AtsCandidate.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsCandidate2Response res = sdk.ats().patchAtsCandidate2()
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
| `request`                                                                         | [PatchAtsCandidate2Request](../../models/operations/PatchAtsCandidate2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchAtsCandidate2Response](../../models/operations/PatchAtsCandidate2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsCompany2

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsCompany2" method="patch" path="/ats/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsCompany2Request;
import to.unified.unified_java_sdk.models.operations.PatchAtsCompany2Response;
import to.unified.unified_java_sdk.models.shared.AtsCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsCompany2Request req = PatchAtsCompany2Request.builder()
                .atsCompany(AtsCompany.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsCompany2Response res = sdk.ats().patchAtsCompany2()
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
| `request`                                                                     | [PatchAtsCompany2Request](../../models/operations/PatchAtsCompany2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchAtsCompany2Response](../../models/operations/PatchAtsCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsDocument2

Update a document

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsDocument2" method="patch" path="/ats/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsDocument2Request;
import to.unified.unified_java_sdk.models.operations.PatchAtsDocument2Response;
import to.unified.unified_java_sdk.models.shared.AtsDocument;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsDocument2Request req = PatchAtsDocument2Request.builder()
                .atsDocument(AtsDocument.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsDocument2Response res = sdk.ats().patchAtsDocument2()
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
| `request`                                                                       | [PatchAtsDocument2Request](../../models/operations/PatchAtsDocument2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchAtsDocument2Response](../../models/operations/PatchAtsDocument2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsInterview2

Update an interview

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsInterview2" method="patch" path="/ats/{connection_id}/interview/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsInterview2Request;
import to.unified.unified_java_sdk.models.operations.PatchAtsInterview2Response;
import to.unified.unified_java_sdk.models.shared.AtsInterview;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsInterview2Request req = PatchAtsInterview2Request.builder()
                .atsInterview(AtsInterview.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsInterview2Response res = sdk.ats().patchAtsInterview2()
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
| `request`                                                                         | [PatchAtsInterview2Request](../../models/operations/PatchAtsInterview2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchAtsInterview2Response](../../models/operations/PatchAtsInterview2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsJob2

Update a job

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsJob2" method="patch" path="/ats/{connection_id}/job/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsJob2Request;
import to.unified.unified_java_sdk.models.operations.PatchAtsJob2Response;
import to.unified.unified_java_sdk.models.shared.AtsJob;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsJob2Request req = PatchAtsJob2Request.builder()
                .atsJob(AtsJob.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsJob2Response res = sdk.ats().patchAtsJob2()
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
| `request`                                                             | [PatchAtsJob2Request](../../models/operations/PatchAtsJob2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PatchAtsJob2Response](../../models/operations/PatchAtsJob2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsScorecard2

Update a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsScorecard2" method="patch" path="/ats/{connection_id}/scorecard/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsScorecard2Request;
import to.unified.unified_java_sdk.models.operations.PatchAtsScorecard2Response;
import to.unified.unified_java_sdk.models.shared.AtsScorecard;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsScorecard2Request req = PatchAtsScorecard2Request.builder()
                .atsScorecard(AtsScorecard.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsScorecard2Response res = sdk.ats().patchAtsScorecard2()
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
| `request`                                                                         | [PatchAtsScorecard2Request](../../models/operations/PatchAtsScorecard2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchAtsScorecard2Response](../../models/operations/PatchAtsScorecard2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsActivity2

Remove an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsActivity2" method="delete" path="/ats/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsActivity2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAtsActivity2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsActivity2Request req = RemoveAtsActivity2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsActivity2Response res = sdk.ats().removeAtsActivity2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveAtsActivity2Request](../../models/operations/RemoveAtsActivity2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveAtsActivity2Response](../../models/operations/RemoveAtsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsApplication2

Remove an application

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsApplication2" method="delete" path="/ats/{connection_id}/application/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsApplication2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAtsApplication2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsApplication2Request req = RemoveAtsApplication2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsApplication2Response res = sdk.ats().removeAtsApplication2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveAtsApplication2Request](../../models/operations/RemoveAtsApplication2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveAtsApplication2Response](../../models/operations/RemoveAtsApplication2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsCandidate2

Remove a candidate

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsCandidate2" method="delete" path="/ats/{connection_id}/candidate/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsCandidate2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAtsCandidate2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsCandidate2Request req = RemoveAtsCandidate2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsCandidate2Response res = sdk.ats().removeAtsCandidate2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveAtsCandidate2Request](../../models/operations/RemoveAtsCandidate2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveAtsCandidate2Response](../../models/operations/RemoveAtsCandidate2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsCompany2

Remove a company

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsCompany2" method="delete" path="/ats/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsCompany2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAtsCompany2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsCompany2Request req = RemoveAtsCompany2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsCompany2Response res = sdk.ats().removeAtsCompany2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveAtsCompany2Request](../../models/operations/RemoveAtsCompany2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveAtsCompany2Response](../../models/operations/RemoveAtsCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsDocument2

Remove a document

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsDocument2" method="delete" path="/ats/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsDocument2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAtsDocument2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsDocument2Request req = RemoveAtsDocument2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsDocument2Response res = sdk.ats().removeAtsDocument2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveAtsDocument2Request](../../models/operations/RemoveAtsDocument2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveAtsDocument2Response](../../models/operations/RemoveAtsDocument2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsInterview2

Remove an interview

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsInterview2" method="delete" path="/ats/{connection_id}/interview/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsInterview2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAtsInterview2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsInterview2Request req = RemoveAtsInterview2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsInterview2Response res = sdk.ats().removeAtsInterview2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveAtsInterview2Request](../../models/operations/RemoveAtsInterview2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveAtsInterview2Response](../../models/operations/RemoveAtsInterview2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsJob2

Remove a job

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsJob2" method="delete" path="/ats/{connection_id}/job/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsJob2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAtsJob2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsJob2Request req = RemoveAtsJob2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsJob2Response res = sdk.ats().removeAtsJob2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [RemoveAtsJob2Request](../../models/operations/RemoveAtsJob2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[RemoveAtsJob2Response](../../models/operations/RemoveAtsJob2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsScorecard2

Remove a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsScorecard2" method="delete" path="/ats/{connection_id}/scorecard/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsScorecard2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAtsScorecard2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsScorecard2Request req = RemoveAtsScorecard2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsScorecard2Response res = sdk.ats().removeAtsScorecard2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveAtsScorecard2Request](../../models/operations/RemoveAtsScorecard2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveAtsScorecard2Response](../../models/operations/RemoveAtsScorecard2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsActivity2

Update an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsActivity2" method="put" path="/ats/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsActivity2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAtsActivity2Response;
import to.unified.unified_java_sdk.models.shared.AtsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsActivity2Request req = UpdateAtsActivity2Request.builder()
                .atsActivity(AtsActivity.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsActivity2Response res = sdk.ats().updateAtsActivity2()
                .request(req)
                .call();

        if (res.atsActivity().isPresent()) {
            System.out.println(res.atsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateAtsActivity2Request](../../models/operations/UpdateAtsActivity2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateAtsActivity2Response](../../models/operations/UpdateAtsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsApplication2

Update an application

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsApplication2" method="put" path="/ats/{connection_id}/application/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsApplication2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAtsApplication2Response;
import to.unified.unified_java_sdk.models.shared.AtsApplication;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsApplication2Request req = UpdateAtsApplication2Request.builder()
                .atsApplication(AtsApplication.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsApplication2Response res = sdk.ats().updateAtsApplication2()
                .request(req)
                .call();

        if (res.atsApplication().isPresent()) {
            System.out.println(res.atsApplication().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateAtsApplication2Request](../../models/operations/UpdateAtsApplication2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateAtsApplication2Response](../../models/operations/UpdateAtsApplication2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsCandidate2

Update a candidate

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsCandidate2" method="put" path="/ats/{connection_id}/candidate/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsCandidate2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAtsCandidate2Response;
import to.unified.unified_java_sdk.models.shared.AtsCandidate;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsCandidate2Request req = UpdateAtsCandidate2Request.builder()
                .atsCandidate(AtsCandidate.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsCandidate2Response res = sdk.ats().updateAtsCandidate2()
                .request(req)
                .call();

        if (res.atsCandidate().isPresent()) {
            System.out.println(res.atsCandidate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateAtsCandidate2Request](../../models/operations/UpdateAtsCandidate2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateAtsCandidate2Response](../../models/operations/UpdateAtsCandidate2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsCompany2

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsCompany2" method="put" path="/ats/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsCompany2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAtsCompany2Response;
import to.unified.unified_java_sdk.models.shared.AtsCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsCompany2Request req = UpdateAtsCompany2Request.builder()
                .atsCompany(AtsCompany.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsCompany2Response res = sdk.ats().updateAtsCompany2()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            System.out.println(res.atsCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateAtsCompany2Request](../../models/operations/UpdateAtsCompany2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateAtsCompany2Response](../../models/operations/UpdateAtsCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsDocument2

Update a document

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsDocument2" method="put" path="/ats/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsDocument2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAtsDocument2Response;
import to.unified.unified_java_sdk.models.shared.AtsDocument;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsDocument2Request req = UpdateAtsDocument2Request.builder()
                .atsDocument(AtsDocument.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsDocument2Response res = sdk.ats().updateAtsDocument2()
                .request(req)
                .call();

        if (res.atsDocument().isPresent()) {
            System.out.println(res.atsDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateAtsDocument2Request](../../models/operations/UpdateAtsDocument2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateAtsDocument2Response](../../models/operations/UpdateAtsDocument2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsInterview2

Update an interview

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsInterview2" method="put" path="/ats/{connection_id}/interview/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsInterview2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAtsInterview2Response;
import to.unified.unified_java_sdk.models.shared.AtsInterview;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsInterview2Request req = UpdateAtsInterview2Request.builder()
                .atsInterview(AtsInterview.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsInterview2Response res = sdk.ats().updateAtsInterview2()
                .request(req)
                .call();

        if (res.atsInterview().isPresent()) {
            System.out.println(res.atsInterview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateAtsInterview2Request](../../models/operations/UpdateAtsInterview2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateAtsInterview2Response](../../models/operations/UpdateAtsInterview2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsJob2

Update a job

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsJob2" method="put" path="/ats/{connection_id}/job/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsJob2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAtsJob2Response;
import to.unified.unified_java_sdk.models.shared.AtsJob;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsJob2Request req = UpdateAtsJob2Request.builder()
                .atsJob(AtsJob.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsJob2Response res = sdk.ats().updateAtsJob2()
                .request(req)
                .call();

        if (res.atsJob().isPresent()) {
            System.out.println(res.atsJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdateAtsJob2Request](../../models/operations/UpdateAtsJob2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdateAtsJob2Response](../../models/operations/UpdateAtsJob2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsScorecard2

Update a scorecard

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsScorecard2" method="put" path="/ats/{connection_id}/scorecard/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsScorecard2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAtsScorecard2Response;
import to.unified.unified_java_sdk.models.shared.AtsScorecard;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsScorecard2Request req = UpdateAtsScorecard2Request.builder()
                .atsScorecard(AtsScorecard.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsScorecard2Response res = sdk.ats().updateAtsScorecard2()
                .request(req)
                .call();

        if (res.atsScorecard().isPresent()) {
            System.out.println(res.atsScorecard().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateAtsScorecard2Request](../../models/operations/UpdateAtsScorecard2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateAtsScorecard2Response](../../models/operations/UpdateAtsScorecard2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |