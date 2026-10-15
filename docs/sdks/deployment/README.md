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

Create a deployment

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
                    .finishedAt(OffsetDateTime.parse("2025-08-25T05:22:52.971Z"))
                    .id("cfd21b37-1a3f-4051-bc07-c67fb4a5f161")
                    .metadata(List.of())
                    .startedAt(OffsetDateTime.parse("2025-04-06T10:27:12.460Z"))
                    .status(ComputeDeploymentStatus.LIVE)
                    .trigger(Trigger.API)
                    .updatedAt(OffsetDateTime.parse("2026-02-23T15:55:26.440Z"))
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

Retrieve a deployment

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

List all deployments

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

Update a deployment

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
                    .finishedAt(OffsetDateTime.parse("2025-08-25T05:22:52.982Z"))
                    .id("660d0a52-9097-4261-aff5-def2e32c8b11")
                    .metadata(List.of())
                    .startedAt(OffsetDateTime.parse("2025-04-06T10:27:12.470Z"))
                    .status(ComputeDeploymentStatus.LIVE)
                    .trigger(Trigger.API)
                    .updatedAt(OffsetDateTime.parse("2026-02-23T15:55:26.453Z"))
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

Remove a deployment

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

Update a deployment

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
                    .finishedAt(OffsetDateTime.parse("2025-08-25T05:22:52.982Z"))
                    .id("660d0a52-9097-4261-aff5-def2e32c8b11")
                    .metadata(List.of())
                    .startedAt(OffsetDateTime.parse("2025-04-06T10:27:12.470Z"))
                    .status(ComputeDeploymentStatus.LIVE)
                    .trigger(Trigger.API)
                    .updatedAt(OffsetDateTime.parse("2026-02-23T15:55:26.453Z"))
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