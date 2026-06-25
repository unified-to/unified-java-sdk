# Job

## Overview

### Available Operations

* [createAtsJob2](#createatsjob2) - Create a job
* [getAtsJob2](#getatsjob2) - Retrieve a job
* [listAtsJobs2](#listatsjobs2) - List all jobs
* [patchAtsJob2](#patchatsjob2) - Update a job
* [removeAtsJob2](#removeatsjob2) - Remove a job
* [updateAtsJob2](#updateatsjob2) - Update a job

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

        CreateAtsJob2Response res = sdk.job().createAtsJob2()
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

        GetAtsJob2Response res = sdk.job().getAtsJob2()
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

        ListAtsJobs2Response res = sdk.job().listAtsJobs2()
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

        PatchAtsJob2Response res = sdk.job().patchAtsJob2()
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

        RemoveAtsJob2Response res = sdk.job().removeAtsJob2()
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

        UpdateAtsJob2Response res = sdk.job().updateAtsJob2()
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