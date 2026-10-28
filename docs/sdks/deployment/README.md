# Deployment

## Overview

### Available Operations

* [createComputeDeployment](#createcomputedeployment) - Create a deployment
* [getComputeDeployment](#getcomputedeployment) - Retrieve a deployment
* [listComputeDeployments](#listcomputedeployments) - List all deployments
* [patchComputeDeployment](#patchcomputedeployment) - Update a deployment
* [removeComputeDeployment](#removecomputedeployment) - Remove a deployment
* [updateComputeDeployment](#updatecomputedeployment) - Update a deployment

## createComputeDeployment

Creates a ComputeDeployment. Provide the unified ComputeDeployment fields in the request body; they are mapped to the provider's API. Returns the created ComputeDeployment.

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeDeployment" method="post" path="/compute/{connection_id}/deployment" example="compute_deployment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeDeploymentRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeDeploymentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeDeploymentRequest req = CreateComputeDeploymentRequest.builder()
                .computeDeployment(ComputeDeployment.builder()
                    .branch("develop")
                    .commitIdentifier("fadfe54eefd8fea670bea6d58b4b15d406c4b02b")
                    .commitMessage("copy primary pixel")
                    .createdAt(OffsetDateTime.parse("2022-06-07T03:52:04.613Z"))
                    .environment(Environment.PREVIEW)
                    .finishedAt(OffsetDateTime.parse("2025-09-03T19:46:15.685Z"))
                    .id("a27ded49-c9c4-4f45-8d75-4bc233f76ab3")
                    .metadata(List.of())
                    .startedAt(OffsetDateTime.parse("2025-04-14T21:14:21.359Z"))
                    .status(ComputeDeploymentStatus.LIVE)
                    .trigger(Trigger.API)
                    .updatedAt(OffsetDateTime.parse("2026-03-06T18:05:01.504Z"))
                    .url("https://comfortable-petal.name")
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeDeploymentResponse res = sdk.deployment().createComputeDeployment()
                .request(req)
                .call();

        if (res.computeDeployment().isPresent()) {
            System.out.println(res.computeDeployment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateComputeDeploymentRequest](../../models/operations/CreateComputeDeploymentRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateComputeDeploymentResponse](../../models/operations/CreateComputeDeploymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeDeployment

Retrieves a single ComputeDeployment by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeDeployment" method="get" path="/compute/{connection_id}/deployment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeDeploymentRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeDeploymentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeDeploymentRequest req = GetComputeDeploymentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeDeploymentResponse res = sdk.deployment().getComputeDeployment()
                .request(req)
                .call();

        if (res.computeDeployment().isPresent()) {
            System.out.println(res.computeDeployment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetComputeDeploymentRequest](../../models/operations/GetComputeDeploymentRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetComputeDeploymentResponse](../../models/operations/GetComputeDeploymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeDeployments

Returns a list of ComputeDeployments. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeDeployments" method="get" path="/compute/{connection_id}/deployment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeDeploymentsRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeDeploymentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeDeploymentsRequest req = ListComputeDeploymentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeDeploymentsResponse res = sdk.deployment().listComputeDeployments()
                .request(req)
                .call();

        if (res.computeDeployments().isPresent()) {
            System.out.println(res.computeDeployments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListComputeDeploymentsRequest](../../models/operations/ListComputeDeploymentsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListComputeDeploymentsResponse](../../models/operations/ListComputeDeploymentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchComputeDeployment

Updates the ComputeDeployment identified by `id`. Provide the unified ComputeDeployment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchComputeDeployment" method="patch" path="/compute/{connection_id}/deployment/{id}" example="compute_deployment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchComputeDeploymentRequest;
import to.unified.unified_java_sdk.models.operations.PatchComputeDeploymentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchComputeDeploymentRequest req = PatchComputeDeploymentRequest.builder()
                .computeDeployment(ComputeDeployment.builder()
                    .branch("develop")
                    .commitIdentifier("fadfe54eefd8fea670bea6d58b4b15d406c4b02b")
                    .commitMessage("copy primary pixel")
                    .createdAt(OffsetDateTime.parse("2022-06-07T03:52:04.613Z"))
                    .environment(Environment.PREVIEW)
                    .finishedAt(OffsetDateTime.parse("2025-09-03T19:46:15.700Z"))
                    .id("1e6b040e-5e39-4a7e-9a90-caf6ec351289")
                    .metadata(List.of())
                    .startedAt(OffsetDateTime.parse("2025-04-14T21:14:21.372Z"))
                    .status(ComputeDeploymentStatus.LIVE)
                    .trigger(Trigger.API)
                    .updatedAt(OffsetDateTime.parse("2026-03-06T18:05:01.522Z"))
                    .url("https://comfortable-petal.name")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchComputeDeploymentResponse res = sdk.deployment().patchComputeDeployment()
                .request(req)
                .call();

        if (res.computeDeployment().isPresent()) {
            System.out.println(res.computeDeployment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchComputeDeploymentRequest](../../models/operations/PatchComputeDeploymentRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchComputeDeploymentResponse](../../models/operations/PatchComputeDeploymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeDeployment

Deletes the ComputeDeployment identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeDeployment" method="delete" path="/compute/{connection_id}/deployment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeDeploymentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeDeploymentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeDeploymentRequest req = RemoveComputeDeploymentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeDeploymentResponse res = sdk.deployment().removeComputeDeployment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveComputeDeploymentRequest](../../models/operations/RemoveComputeDeploymentRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveComputeDeploymentResponse](../../models/operations/RemoveComputeDeploymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateComputeDeployment

Updates the ComputeDeployment identified by `id`. Provide the unified ComputeDeployment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateComputeDeployment" method="put" path="/compute/{connection_id}/deployment/{id}" example="compute_deployment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateComputeDeploymentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateComputeDeploymentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateComputeDeploymentRequest req = UpdateComputeDeploymentRequest.builder()
                .computeDeployment(ComputeDeployment.builder()
                    .branch("develop")
                    .commitIdentifier("fadfe54eefd8fea670bea6d58b4b15d406c4b02b")
                    .commitMessage("copy primary pixel")
                    .createdAt(OffsetDateTime.parse("2022-06-07T03:52:04.613Z"))
                    .environment(Environment.PREVIEW)
                    .finishedAt(OffsetDateTime.parse("2025-09-03T19:46:15.700Z"))
                    .id("1e6b040e-5e39-4a7e-9a90-caf6ec351289")
                    .metadata(List.of())
                    .startedAt(OffsetDateTime.parse("2025-04-14T21:14:21.372Z"))
                    .status(ComputeDeploymentStatus.LIVE)
                    .trigger(Trigger.API)
                    .updatedAt(OffsetDateTime.parse("2026-03-06T18:05:01.522Z"))
                    .url("https://comfortable-petal.name")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateComputeDeploymentResponse res = sdk.deployment().updateComputeDeployment()
                .request(req)
                .call();

        if (res.computeDeployment().isPresent()) {
            System.out.println(res.computeDeployment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateComputeDeploymentRequest](../../models/operations/UpdateComputeDeploymentRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateComputeDeploymentResponse](../../models/operations/UpdateComputeDeploymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |