# Service

## Overview

### Available Operations

* [createComputeService](#createcomputeservice) - Create a service
* [getComputeService](#getcomputeservice) - Retrieve a service
* [listComputeServices](#listcomputeservices) - List all services
* [patchComputeService](#patchcomputeservice) - Update a service
* [removeComputeService](#removecomputeservice) - Remove a service
* [updateComputeService](#updatecomputeservice) - Update a service

## createComputeService

Create a service

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeService" method="post" path="/compute/{connection_id}/service" example="compute_service" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeServiceRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeServiceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeServiceRequest req = CreateComputeServiceRequest.builder()
                .computeService(ComputeService.builder()
                    .branch("main")
                    .buildCommand("npm run build")
                    .createdAt(OffsetDateTime.parse("2023-10-04T02:06:29.391Z"))
                    .id("da9735ae-de47-4029-9293-55285b1d6422")
                    .instanceCount(6d)
                    .maxInstanceCount(6d)
                    .metadata(List.of())
                    .minInstanceCount(1d)
                    .name("tame-sideboard")
                    .projectIdentifier("4nyWICvPfi")
                    .repoUrl("https://github.com/Kimberly_Muller95/tame-sideboard")
                    .runtime("python")
                    .status(ComputeServiceStatus.SUSPENDED)
                    .type(ComputeServiceType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2025-04-02T03:50:15.053Z"))
                    .url("https://tame-sideboard.rotating-shoulder.biz")
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeServiceResponse res = sdk.service().createComputeService()
                .request(req)
                .call();

        if (res.computeService().isPresent()) {
            System.out.println(res.computeService().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateComputeServiceRequest](../../models/operations/CreateComputeServiceRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateComputeServiceResponse](../../models/operations/CreateComputeServiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeService

Retrieve a service

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeService" method="get" path="/compute/{connection_id}/service/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeServiceRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeServiceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeServiceRequest req = GetComputeServiceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeServiceResponse res = sdk.service().getComputeService()
                .request(req)
                .call();

        if (res.computeService().isPresent()) {
            System.out.println(res.computeService().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetComputeServiceRequest](../../models/operations/GetComputeServiceRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetComputeServiceResponse](../../models/operations/GetComputeServiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeServices

List all services

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeServices" method="get" path="/compute/{connection_id}/service" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeServicesRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeServicesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeServicesRequest req = ListComputeServicesRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeServicesResponse res = sdk.service().listComputeServices()
                .request(req)
                .call();

        if (res.computeServices().isPresent()) {
            System.out.println(res.computeServices().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListComputeServicesRequest](../../models/operations/ListComputeServicesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListComputeServicesResponse](../../models/operations/ListComputeServicesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchComputeService

Update a service

### Example Usage

<!-- UsageSnippet language="java" operationID="patchComputeService" method="patch" path="/compute/{connection_id}/service/{id}" example="compute_service" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchComputeServiceRequest;
import to.unified.unified_java_sdk.models.operations.PatchComputeServiceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchComputeServiceRequest req = PatchComputeServiceRequest.builder()
                .computeService(ComputeService.builder()
                    .branch("main")
                    .buildCommand("npm run build")
                    .createdAt(OffsetDateTime.parse("2023-10-04T02:06:29.391Z"))
                    .id("1367b809-5ef9-413a-ac6a-74330b227d55")
                    .instanceCount(6d)
                    .maxInstanceCount(6d)
                    .metadata(List.of())
                    .minInstanceCount(1d)
                    .name("tame-sideboard")
                    .projectIdentifier("4nyWICvPfi")
                    .repoUrl("https://github.com/Kimberly_Muller95/tame-sideboard")
                    .runtime("python")
                    .status(ComputeServiceStatus.SUSPENDED)
                    .type(ComputeServiceType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2025-04-02T03:50:15.061Z"))
                    .url("https://tame-sideboard.rotating-shoulder.biz")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchComputeServiceResponse res = sdk.service().patchComputeService()
                .request(req)
                .call();

        if (res.computeService().isPresent()) {
            System.out.println(res.computeService().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchComputeServiceRequest](../../models/operations/PatchComputeServiceRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchComputeServiceResponse](../../models/operations/PatchComputeServiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeService

Remove a service

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeService" method="delete" path="/compute/{connection_id}/service/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeServiceRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeServiceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeServiceRequest req = RemoveComputeServiceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeServiceResponse res = sdk.service().removeComputeService()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveComputeServiceRequest](../../models/operations/RemoveComputeServiceRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveComputeServiceResponse](../../models/operations/RemoveComputeServiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateComputeService

Update a service

### Example Usage

<!-- UsageSnippet language="java" operationID="updateComputeService" method="put" path="/compute/{connection_id}/service/{id}" example="compute_service" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateComputeServiceRequest;
import to.unified.unified_java_sdk.models.operations.UpdateComputeServiceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateComputeServiceRequest req = UpdateComputeServiceRequest.builder()
                .computeService(ComputeService.builder()
                    .branch("main")
                    .buildCommand("npm run build")
                    .createdAt(OffsetDateTime.parse("2023-10-04T02:06:29.391Z"))
                    .id("1367b809-5ef9-413a-ac6a-74330b227d55")
                    .instanceCount(6d)
                    .maxInstanceCount(6d)
                    .metadata(List.of())
                    .minInstanceCount(1d)
                    .name("tame-sideboard")
                    .projectIdentifier("4nyWICvPfi")
                    .repoUrl("https://github.com/Kimberly_Muller95/tame-sideboard")
                    .runtime("python")
                    .status(ComputeServiceStatus.SUSPENDED)
                    .type(ComputeServiceType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2025-04-02T03:50:15.061Z"))
                    .url("https://tame-sideboard.rotating-shoulder.biz")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateComputeServiceResponse res = sdk.service().updateComputeService()
                .request(req)
                .call();

        if (res.computeService().isPresent()) {
            System.out.println(res.computeService().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateComputeServiceRequest](../../models/operations/UpdateComputeServiceRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateComputeServiceResponse](../../models/operations/UpdateComputeServiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |