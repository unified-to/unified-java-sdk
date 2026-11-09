# Workspaceintegration

## Overview

### Available Operations

* [createUnifiedWorkspaceintegration](#createunifiedworkspaceintegration) - Create workspace integration
* [getUnifiedWorkspaceintegration](#getunifiedworkspaceintegration) - Retrieve workspace integration
* [listUnifiedWorkspaceintegrations](#listunifiedworkspaceintegrations) - List workspace integrations
* [patchUnifiedWorkspaceintegration](#patchunifiedworkspaceintegration) - Update workspace integration
* [removeUnifiedWorkspaceintegration](#removeunifiedworkspaceintegration) - Remove workspace integration
* [updateUnifiedWorkspaceintegration](#updateunifiedworkspaceintegration) - Update workspace integration

## createUnifiedWorkspaceintegration

Create workspace integration

### Example Usage

<!-- UsageSnippet language="java" operationID="createUnifiedWorkspaceintegration" method="post" path="/unified/workspaceintegration" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUnifiedWorkspaceintegrationResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.WorkspaceIntegration;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        WorkspaceIntegration req = WorkspaceIntegration.builder()
                .integrationType("<value>")
                .isActive(true)
                .build();

        CreateUnifiedWorkspaceintegrationResponse res = sdk.workspaceintegration().createUnifiedWorkspaceintegration()
                .request(req)
                .call();

        if (res.workspaceIntegration().isPresent()) {
            System.out.println(res.workspaceIntegration().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [WorkspaceIntegration](../../models/shared/WorkspaceIntegration.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[CreateUnifiedWorkspaceintegrationResponse](../../models/operations/CreateUnifiedWorkspaceintegrationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUnifiedWorkspaceintegration

Retrieve workspace integration

### Example Usage

<!-- UsageSnippet language="java" operationID="getUnifiedWorkspaceintegration" method="get" path="/unified/workspaceintegration/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUnifiedWorkspaceintegrationRequest;
import to.unified.unified_java_sdk.models.operations.GetUnifiedWorkspaceintegrationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUnifiedWorkspaceintegrationRequest req = GetUnifiedWorkspaceintegrationRequest.builder()
                .id("<id>")
                .build();

        GetUnifiedWorkspaceintegrationResponse res = sdk.workspaceintegration().getUnifiedWorkspaceintegration()
                .request(req)
                .call();

        if (res.workspaceIntegration().isPresent()) {
            System.out.println(res.workspaceIntegration().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [GetUnifiedWorkspaceintegrationRequest](../../models/operations/GetUnifiedWorkspaceintegrationRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[GetUnifiedWorkspaceintegrationResponse](../../models/operations/GetUnifiedWorkspaceintegrationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUnifiedWorkspaceintegrations

List workspace integrations

### Example Usage

<!-- UsageSnippet language="java" operationID="listUnifiedWorkspaceintegrations" method="get" path="/unified/workspaceintegration" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUnifiedWorkspaceintegrationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUnifiedWorkspaceintegrationsResponse res = sdk.workspaceintegration().listUnifiedWorkspaceintegrations()
                .call();

        if (res.workspaceIntegrations().isPresent()) {
            System.out.println(res.workspaceIntegrations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [ListUnifiedWorkspaceintegrationsRequest](../../models/operations/ListUnifiedWorkspaceintegrationsRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[ListUnifiedWorkspaceintegrationsResponse](../../models/operations/ListUnifiedWorkspaceintegrationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchUnifiedWorkspaceintegration

Update workspace integration

### Example Usage

<!-- UsageSnippet language="java" operationID="patchUnifiedWorkspaceintegration" method="patch" path="/unified/workspaceintegration/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUnifiedWorkspaceintegrationRequest;
import to.unified.unified_java_sdk.models.operations.PatchUnifiedWorkspaceintegrationResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.WorkspaceIntegrationPatch;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUnifiedWorkspaceintegrationRequest req = PatchUnifiedWorkspaceintegrationRequest.builder()
                .workspaceIntegrationPatch(WorkspaceIntegrationPatch.builder()
                    .build())
                .id("<id>")
                .build();

        PatchUnifiedWorkspaceintegrationResponse res = sdk.workspaceintegration().patchUnifiedWorkspaceintegration()
                .request(req)
                .call();

        if (res.workspaceIntegration().isPresent()) {
            System.out.println(res.workspaceIntegration().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [PatchUnifiedWorkspaceintegrationRequest](../../models/operations/PatchUnifiedWorkspaceintegrationRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[PatchUnifiedWorkspaceintegrationResponse](../../models/operations/PatchUnifiedWorkspaceintegrationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeUnifiedWorkspaceintegration

Remove workspace integration

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUnifiedWorkspaceintegration" method="delete" path="/unified/workspaceintegration/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUnifiedWorkspaceintegrationRequest;
import to.unified.unified_java_sdk.models.operations.RemoveUnifiedWorkspaceintegrationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUnifiedWorkspaceintegrationRequest req = RemoveUnifiedWorkspaceintegrationRequest.builder()
                .id("<id>")
                .build();

        RemoveUnifiedWorkspaceintegrationResponse res = sdk.workspaceintegration().removeUnifiedWorkspaceintegration()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [RemoveUnifiedWorkspaceintegrationRequest](../../models/operations/RemoveUnifiedWorkspaceintegrationRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[RemoveUnifiedWorkspaceintegrationResponse](../../models/operations/RemoveUnifiedWorkspaceintegrationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateUnifiedWorkspaceintegration

Update workspace integration

### Example Usage

<!-- UsageSnippet language="java" operationID="updateUnifiedWorkspaceintegration" method="put" path="/unified/workspaceintegration/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUnifiedWorkspaceintegrationRequest;
import to.unified.unified_java_sdk.models.operations.UpdateUnifiedWorkspaceintegrationResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.WorkspaceIntegration;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUnifiedWorkspaceintegrationRequest req = UpdateUnifiedWorkspaceintegrationRequest.builder()
                .workspaceIntegration(WorkspaceIntegration.builder()
                    .integrationType("<value>")
                    .isActive(false)
                    .build())
                .id("<id>")
                .build();

        UpdateUnifiedWorkspaceintegrationResponse res = sdk.workspaceintegration().updateUnifiedWorkspaceintegration()
                .request(req)
                .call();

        if (res.workspaceIntegration().isPresent()) {
            System.out.println(res.workspaceIntegration().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [UpdateUnifiedWorkspaceintegrationRequest](../../models/operations/UpdateUnifiedWorkspaceintegrationRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[UpdateUnifiedWorkspaceintegrationResponse](../../models/operations/UpdateUnifiedWorkspaceintegrationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |