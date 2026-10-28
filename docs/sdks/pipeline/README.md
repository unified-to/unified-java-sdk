# Pipeline

## Overview

### Available Operations

* [createCrmPipeline](#createcrmpipeline) - Create a pipeline
* [getCrmPipeline](#getcrmpipeline) - Retrieve a pipeline
* [listCrmPipelines](#listcrmpipelines) - List all pipelines
* [patchCrmPipeline](#patchcrmpipeline) - Update a pipeline
* [removeCrmPipeline](#removecrmpipeline) - Remove a pipeline
* [updateCrmPipeline](#updatecrmpipeline) - Update a pipeline

## createCrmPipeline

Creates a CrmPipeline. Provide the unified CrmPipeline fields in the request body; they are mapped to the provider's API. Returns the created CrmPipeline.

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmPipeline" method="post" path="/crm/{connection_id}/pipeline" example="crm_pipeline" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmPipelineRequest;
import to.unified.unified_java_sdk.models.operations.CreateCrmPipelineResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmPipelineRequest req = CreateCrmPipelineRequest.builder()
                .crmPipeline(CrmPipeline.builder()
                    .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                    .dealProbability(99d)
                    .displayOrder(8d)
                    .id("a15ba2e5-45c0-48e6-a9a5-a2dfd0f23556")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Small Steel Bacon")
                    .stages(List.of(
                        CrmStage.builder()
                            .active(false)
                            .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                            .dealProbability(84d)
                            .displayOrder(72d)
                            .id("a72f112e-e6d8-44a3-9e1e-83a5fbe3f277")
                            .isClosed(true)
                            .name("Veniam.")
                            .updatedAt(OffsetDateTime.parse("2025-10-15T15:45:01.689Z"))
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2025-11-06T11:49:22.693Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmPipelineResponse res = sdk.pipeline().createCrmPipeline()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateCrmPipelineRequest](../../models/operations/CreateCrmPipelineRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateCrmPipelineResponse](../../models/operations/CreateCrmPipelineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmPipeline

Retrieves a single CrmPipeline by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmPipeline" method="get" path="/crm/{connection_id}/pipeline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmPipelineRequest;
import to.unified.unified_java_sdk.models.operations.GetCrmPipelineResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmPipelineRequest req = GetCrmPipelineRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmPipelineResponse res = sdk.pipeline().getCrmPipeline()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetCrmPipelineRequest](../../models/operations/GetCrmPipelineRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetCrmPipelineResponse](../../models/operations/GetCrmPipelineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmPipelines

Returns a list of CrmPipelines. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmPipelines" method="get" path="/crm/{connection_id}/pipeline" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmPipelinesRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmPipelinesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmPipelinesRequest req = ListCrmPipelinesRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmPipelinesResponse res = sdk.pipeline().listCrmPipelines()
                .request(req)
                .call();

        if (res.crmPipelines().isPresent()) {
            System.out.println(res.crmPipelines().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListCrmPipelinesRequest](../../models/operations/ListCrmPipelinesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListCrmPipelinesResponse](../../models/operations/ListCrmPipelinesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmPipeline

Updates the CrmPipeline identified by `id`. Provide the unified CrmPipeline fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmPipeline" method="patch" path="/crm/{connection_id}/pipeline/{id}" example="crm_pipeline" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmPipelineRequest;
import to.unified.unified_java_sdk.models.operations.PatchCrmPipelineResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmPipelineRequest req = PatchCrmPipelineRequest.builder()
                .crmPipeline(CrmPipeline.builder()
                    .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                    .dealProbability(99d)
                    .displayOrder(8d)
                    .id("dde1f2a5-97eb-4002-9da9-53488b1b74ad")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Small Steel Bacon")
                    .stages(List.of(
                        CrmStage.builder()
                            .active(false)
                            .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                            .dealProbability(84d)
                            .displayOrder(72d)
                            .id("01b876e4-0da3-4d12-a05f-842bc7909a0e")
                            .isClosed(true)
                            .name("Veniam.")
                            .updatedAt(OffsetDateTime.parse("2025-10-15T15:45:01.704Z"))
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2025-11-06T11:49:22.708Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmPipelineResponse res = sdk.pipeline().patchCrmPipeline()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchCrmPipelineRequest](../../models/operations/PatchCrmPipelineRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchCrmPipelineResponse](../../models/operations/PatchCrmPipelineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmPipeline

Deletes the CrmPipeline identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmPipeline" method="delete" path="/crm/{connection_id}/pipeline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmPipelineRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCrmPipelineResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmPipelineRequest req = RemoveCrmPipelineRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmPipelineResponse res = sdk.pipeline().removeCrmPipeline()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveCrmPipelineRequest](../../models/operations/RemoveCrmPipelineRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveCrmPipelineResponse](../../models/operations/RemoveCrmPipelineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmPipeline

Updates the CrmPipeline identified by `id`. Provide the unified CrmPipeline fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmPipeline" method="put" path="/crm/{connection_id}/pipeline/{id}" example="crm_pipeline" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmPipelineRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCrmPipelineResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmPipelineRequest req = UpdateCrmPipelineRequest.builder()
                .crmPipeline(CrmPipeline.builder()
                    .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                    .dealProbability(99d)
                    .displayOrder(8d)
                    .id("dde1f2a5-97eb-4002-9da9-53488b1b74ad")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Small Steel Bacon")
                    .stages(List.of(
                        CrmStage.builder()
                            .active(false)
                            .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                            .dealProbability(84d)
                            .displayOrder(72d)
                            .id("01b876e4-0da3-4d12-a05f-842bc7909a0e")
                            .isClosed(true)
                            .name("Veniam.")
                            .updatedAt(OffsetDateTime.parse("2025-10-15T15:45:01.704Z"))
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2025-11-06T11:49:22.708Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmPipelineResponse res = sdk.pipeline().updateCrmPipeline()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateCrmPipelineRequest](../../models/operations/UpdateCrmPipelineRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateCrmPipelineResponse](../../models/operations/UpdateCrmPipelineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |