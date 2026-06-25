# Candidate

## Overview

### Available Operations

* [createAtsCandidate2](#createatscandidate2) - Create a candidate
* [getAtsCandidate2](#getatscandidate2) - Retrieve a candidate
* [listAtsCandidates2](#listatscandidates2) - List all candidates
* [patchAtsCandidate2](#patchatscandidate2) - Update a candidate
* [removeAtsCandidate2](#removeatscandidate2) - Remove a candidate
* [updateAtsCandidate2](#updateatscandidate2) - Update a candidate

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

        CreateAtsCandidate2Response res = sdk.candidate().createAtsCandidate2()
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

        GetAtsCandidate2Response res = sdk.candidate().getAtsCandidate2()
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

        ListAtsCandidates2Response res = sdk.candidate().listAtsCandidates2()
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

        PatchAtsCandidate2Response res = sdk.candidate().patchAtsCandidate2()
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

        RemoveAtsCandidate2Response res = sdk.candidate().removeAtsCandidate2()
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

        UpdateAtsCandidate2Response res = sdk.candidate().updateAtsCandidate2()
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