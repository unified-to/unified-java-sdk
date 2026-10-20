# Template

## Overview

### Available Operations

* [createComputeTemplate](#createcomputetemplate) - Create a template
* [getComputeTemplate](#getcomputetemplate) - Retrieve a template
* [getSigningTemplate](#getsigningtemplate) - Retrieve a template
* [listComputeTemplates](#listcomputetemplates) - List all templates
* [listSigningTemplates](#listsigningtemplates) - List all templates
* [patchComputeTemplate](#patchcomputetemplate) - Update a template
* [removeComputeTemplate](#removecomputetemplate) - Remove a template
* [updateComputeTemplate](#updatecomputetemplate) - Update a template

## createComputeTemplate

Create a template

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeTemplate" method="post" path="/compute/{connection_id}/template" example="compute_template" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeTemplateRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeTemplateResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeTemplateRequest req = CreateComputeTemplateRequest.builder()
                .computeTemplate(ComputeTemplate.builder()
                    .cpuCount(4d)
                    .createdAt(OffsetDateTime.parse("2023-02-23T03:28:59.864Z"))
                    .diskMb(10240d)
                    .dockerfile("FROM ubuntu:24.04\nRUN apt-get update")
                    .gpuCount(2d)
                    .gpuModel(ComputeTemplateGpuModel.NVIDIA_GH200)
                    .id("80b42d01-d399-4ca1-80c9-bea46c591e54")
                    .image("perfumed-molasses/cohibeo:5.2")
                    .isPublic(false)
                    .lastUsedAt(OffsetDateTime.parse("2026-03-22T20:01:16.136Z"))
                    .memoryMb(8192d)
                    .metadata(List.of())
                    .name("multi-byte-card")
                    .ports(List.of(
                        8080d))
                    .status(ComputeTemplateStatus.OTHER)
                    .updatedAt(OffsetDateTime.parse("2025-02-12T02:59:32.975Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeTemplateResponse res = sdk.template().createComputeTemplate()
                .request(req)
                .call();

        if (res.computeTemplate().isPresent()) {
            System.out.println(res.computeTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateComputeTemplateRequest](../../models/operations/CreateComputeTemplateRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateComputeTemplateResponse](../../models/operations/CreateComputeTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeTemplate

Retrieve a template

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeTemplate" method="get" path="/compute/{connection_id}/template/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeTemplateRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeTemplateResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeTemplateRequest req = GetComputeTemplateRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeTemplateResponse res = sdk.template().getComputeTemplate()
                .request(req)
                .call();

        if (res.computeTemplate().isPresent()) {
            System.out.println(res.computeTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetComputeTemplateRequest](../../models/operations/GetComputeTemplateRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetComputeTemplateResponse](../../models/operations/GetComputeTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSigningTemplate

Retrieve a template

### Example Usage

<!-- UsageSnippet language="java" operationID="getSigningTemplate" method="get" path="/signing/{connection_id}/template/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetSigningTemplateRequest;
import to.unified.unified_java_sdk.models.operations.GetSigningTemplateResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetSigningTemplateRequest req = GetSigningTemplateRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetSigningTemplateResponse res = sdk.template().getSigningTemplate()
                .request(req)
                .call();

        if (res.signingTemplate().isPresent()) {
            System.out.println(res.signingTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetSigningTemplateRequest](../../models/operations/GetSigningTemplateRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetSigningTemplateResponse](../../models/operations/GetSigningTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeTemplates

List all templates

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeTemplates" method="get" path="/compute/{connection_id}/template" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeTemplatesRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeTemplatesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeTemplatesRequest req = ListComputeTemplatesRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeTemplatesResponse res = sdk.template().listComputeTemplates()
                .request(req)
                .call();

        if (res.computeTemplates().isPresent()) {
            System.out.println(res.computeTemplates().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListComputeTemplatesRequest](../../models/operations/ListComputeTemplatesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListComputeTemplatesResponse](../../models/operations/ListComputeTemplatesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSigningTemplates

List all templates

### Example Usage

<!-- UsageSnippet language="java" operationID="listSigningTemplates" method="get" path="/signing/{connection_id}/template" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListSigningTemplatesRequest;
import to.unified.unified_java_sdk.models.operations.ListSigningTemplatesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListSigningTemplatesRequest req = ListSigningTemplatesRequest.builder()
                .connectionId("<id>")
                .build();

        ListSigningTemplatesResponse res = sdk.template().listSigningTemplates()
                .request(req)
                .call();

        if (res.signingTemplates().isPresent()) {
            System.out.println(res.signingTemplates().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListSigningTemplatesRequest](../../models/operations/ListSigningTemplatesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListSigningTemplatesResponse](../../models/operations/ListSigningTemplatesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchComputeTemplate

Update a template

### Example Usage

<!-- UsageSnippet language="java" operationID="patchComputeTemplate" method="patch" path="/compute/{connection_id}/template/{id}" example="compute_template" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchComputeTemplateRequest;
import to.unified.unified_java_sdk.models.operations.PatchComputeTemplateResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchComputeTemplateRequest req = PatchComputeTemplateRequest.builder()
                .computeTemplate(ComputeTemplate.builder()
                    .cpuCount(4d)
                    .createdAt(OffsetDateTime.parse("2023-02-23T03:28:59.864Z"))
                    .diskMb(10240d)
                    .dockerfile("FROM ubuntu:24.04\nRUN apt-get update")
                    .gpuCount(2d)
                    .gpuModel(ComputeTemplateGpuModel.NVIDIA_GH200)
                    .id("dc3e2a75-209b-40ae-949c-8e04b108598e")
                    .image("perfumed-molasses/cohibeo:5.2")
                    .isPublic(false)
                    .lastUsedAt(OffsetDateTime.parse("2026-03-22T20:01:16.151Z"))
                    .memoryMb(8192d)
                    .metadata(List.of())
                    .name("multi-byte-card")
                    .ports(List.of(
                        8080d))
                    .status(ComputeTemplateStatus.OTHER)
                    .updatedAt(OffsetDateTime.parse("2025-02-12T02:59:32.985Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchComputeTemplateResponse res = sdk.template().patchComputeTemplate()
                .request(req)
                .call();

        if (res.computeTemplate().isPresent()) {
            System.out.println(res.computeTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchComputeTemplateRequest](../../models/operations/PatchComputeTemplateRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchComputeTemplateResponse](../../models/operations/PatchComputeTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeTemplate

Remove a template

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeTemplate" method="delete" path="/compute/{connection_id}/template/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeTemplateRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeTemplateResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeTemplateRequest req = RemoveComputeTemplateRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeTemplateResponse res = sdk.template().removeComputeTemplate()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveComputeTemplateRequest](../../models/operations/RemoveComputeTemplateRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveComputeTemplateResponse](../../models/operations/RemoveComputeTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateComputeTemplate

Update a template

### Example Usage

<!-- UsageSnippet language="java" operationID="updateComputeTemplate" method="put" path="/compute/{connection_id}/template/{id}" example="compute_template" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateComputeTemplateRequest;
import to.unified.unified_java_sdk.models.operations.UpdateComputeTemplateResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateComputeTemplateRequest req = UpdateComputeTemplateRequest.builder()
                .computeTemplate(ComputeTemplate.builder()
                    .cpuCount(4d)
                    .createdAt(OffsetDateTime.parse("2023-02-23T03:28:59.864Z"))
                    .diskMb(10240d)
                    .dockerfile("FROM ubuntu:24.04\nRUN apt-get update")
                    .gpuCount(2d)
                    .gpuModel(ComputeTemplateGpuModel.NVIDIA_GH200)
                    .id("dc3e2a75-209b-40ae-949c-8e04b108598e")
                    .image("perfumed-molasses/cohibeo:5.2")
                    .isPublic(false)
                    .lastUsedAt(OffsetDateTime.parse("2026-03-22T20:01:16.151Z"))
                    .memoryMb(8192d)
                    .metadata(List.of())
                    .name("multi-byte-card")
                    .ports(List.of(
                        8080d))
                    .status(ComputeTemplateStatus.OTHER)
                    .updatedAt(OffsetDateTime.parse("2025-02-12T02:59:32.985Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateComputeTemplateResponse res = sdk.template().updateComputeTemplate()
                .request(req)
                .call();

        if (res.computeTemplate().isPresent()) {
            System.out.println(res.computeTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateComputeTemplateRequest](../../models/operations/UpdateComputeTemplateRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateComputeTemplateResponse](../../models/operations/UpdateComputeTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |