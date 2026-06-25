# Interview

## Overview

### Available Operations

* [createAtsInterview2](#createatsinterview2) - Create an interview
* [getAtsInterview2](#getatsinterview2) - Retrieve an interview
* [listAtsInterviews2](#listatsinterviews2) - List all interviews
* [patchAtsInterview2](#patchatsinterview2) - Update an interview
* [removeAtsInterview2](#removeatsinterview2) - Remove an interview
* [updateAtsInterview2](#updateatsinterview2) - Update an interview

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

        CreateAtsInterview2Response res = sdk.interview().createAtsInterview2()
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

        GetAtsInterview2Response res = sdk.interview().getAtsInterview2()
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

        ListAtsInterviews2Response res = sdk.interview().listAtsInterviews2()
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

        PatchAtsInterview2Response res = sdk.interview().patchAtsInterview2()
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

        RemoveAtsInterview2Response res = sdk.interview().removeAtsInterview2()
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

        UpdateAtsInterview2Response res = sdk.interview().updateAtsInterview2()
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