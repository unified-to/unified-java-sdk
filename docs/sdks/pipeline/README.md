# Pipeline

## Overview

### Available Operations

* [createCrmPipeline2](#createcrmpipeline2) - Create a pipeline
* [getCrmPipeline2](#getcrmpipeline2) - Retrieve a pipeline
* [listCrmPipelines2](#listcrmpipelines2) - List all pipelines
* [patchCrmPipeline2](#patchcrmpipeline2) - Update a pipeline
* [removeCrmPipeline2](#removecrmpipeline2) - Remove a pipeline
* [updateCrmPipeline2](#updatecrmpipeline2) - Update a pipeline

## createCrmPipeline2

Create a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmPipeline2" method="post" path="/crm/{connection_id}/pipeline" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmPipeline2Request;
import to.unified.unified_java_sdk.models.operations.CreateCrmPipeline2Response;
import to.unified.unified_java_sdk.models.shared.CrmPipeline;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmPipeline2Request req = CreateCrmPipeline2Request.builder()
                .crmPipeline(CrmPipeline.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmPipeline2Response res = sdk.pipeline().createCrmPipeline2()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateCrmPipeline2Request](../../models/operations/CreateCrmPipeline2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateCrmPipeline2Response](../../models/operations/CreateCrmPipeline2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmPipeline2

Retrieve a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmPipeline2" method="get" path="/crm/{connection_id}/pipeline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmPipeline2Request;
import to.unified.unified_java_sdk.models.operations.GetCrmPipeline2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmPipeline2Request req = GetCrmPipeline2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmPipeline2Response res = sdk.pipeline().getCrmPipeline2()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetCrmPipeline2Request](../../models/operations/GetCrmPipeline2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetCrmPipeline2Response](../../models/operations/GetCrmPipeline2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmPipelines2

List all pipelines

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmPipelines2" method="get" path="/crm/{connection_id}/pipeline" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmPipelines2Request;
import to.unified.unified_java_sdk.models.operations.ListCrmPipelines2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmPipelines2Request req = ListCrmPipelines2Request.builder()
                .connectionId("<id>")
                .build();

        ListCrmPipelines2Response res = sdk.pipeline().listCrmPipelines2()
                .request(req)
                .call();

        if (res.crmPipelines().isPresent()) {
            System.out.println(res.crmPipelines().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListCrmPipelines2Request](../../models/operations/ListCrmPipelines2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListCrmPipelines2Response](../../models/operations/ListCrmPipelines2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmPipeline2

Update a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmPipeline2" method="patch" path="/crm/{connection_id}/pipeline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmPipeline2Request;
import to.unified.unified_java_sdk.models.operations.PatchCrmPipeline2Response;
import to.unified.unified_java_sdk.models.shared.CrmPipeline;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmPipeline2Request req = PatchCrmPipeline2Request.builder()
                .crmPipeline(CrmPipeline.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmPipeline2Response res = sdk.pipeline().patchCrmPipeline2()
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
| `request`                                                                       | [PatchCrmPipeline2Request](../../models/operations/PatchCrmPipeline2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchCrmPipeline2Response](../../models/operations/PatchCrmPipeline2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmPipeline2

Remove a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmPipeline2" method="delete" path="/crm/{connection_id}/pipeline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmPipeline2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCrmPipeline2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmPipeline2Request req = RemoveCrmPipeline2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmPipeline2Response res = sdk.pipeline().removeCrmPipeline2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveCrmPipeline2Request](../../models/operations/RemoveCrmPipeline2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveCrmPipeline2Response](../../models/operations/RemoveCrmPipeline2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmPipeline2

Update a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmPipeline2" method="put" path="/crm/{connection_id}/pipeline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmPipeline2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCrmPipeline2Response;
import to.unified.unified_java_sdk.models.shared.CrmPipeline;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmPipeline2Request req = UpdateCrmPipeline2Request.builder()
                .crmPipeline(CrmPipeline.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmPipeline2Response res = sdk.pipeline().updateCrmPipeline2()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateCrmPipeline2Request](../../models/operations/UpdateCrmPipeline2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateCrmPipeline2Response](../../models/operations/UpdateCrmPipeline2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |