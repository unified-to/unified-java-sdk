# Secretsmanager

## Overview

### Available Operations

* [createUnifiedWorkspaceSecretsmanager](#createunifiedworkspacesecretsmanager) - Create secrets manager
* [getUnifiedWorkspaceSecretsmanager](#getunifiedworkspacesecretsmanager) - Retrieve secrets manager
* [listUnifiedWorkspaceSecretsmanagers](#listunifiedworkspacesecretsmanagers) - List secrets managers
* [removeUnifiedWorkspaceSecretsmanager](#removeunifiedworkspacesecretsmanager) - Remove secrets manager

## createUnifiedWorkspaceSecretsmanager

Create secrets manager

### Example Usage

<!-- UsageSnippet language="java" operationID="createUnifiedWorkspaceSecretsmanager" method="post" path="/unified/workspace/secretsmanager" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUnifiedWorkspaceSecretsmanagerResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        SecretsManager req = SecretsManager.builder()
                .auth(Map.ofEntries(
                ))
                .name("<value>")
                .type(SecretsManagerType.HASHICORP)
                .build();

        CreateUnifiedWorkspaceSecretsmanagerResponse res = sdk.secretsmanager().createUnifiedWorkspaceSecretsmanager()
                .request(req)
                .call();

        if (res.secretsManager().isPresent()) {
            System.out.println(res.secretsManager().get());
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [SecretsManager](../../models/shared/SecretsManager.md) | :heavy_check_mark:                                      | The request object to use for the request.              |

### Response

**[CreateUnifiedWorkspaceSecretsmanagerResponse](../../models/operations/CreateUnifiedWorkspaceSecretsmanagerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUnifiedWorkspaceSecretsmanager

Retrieve secrets manager

### Example Usage

<!-- UsageSnippet language="java" operationID="getUnifiedWorkspaceSecretsmanager" method="get" path="/unified/workspace/secretsmanager/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUnifiedWorkspaceSecretsmanagerRequest;
import to.unified.unified_java_sdk.models.operations.GetUnifiedWorkspaceSecretsmanagerResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUnifiedWorkspaceSecretsmanagerRequest req = GetUnifiedWorkspaceSecretsmanagerRequest.builder()
                .id("<id>")
                .build();

        GetUnifiedWorkspaceSecretsmanagerResponse res = sdk.secretsmanager().getUnifiedWorkspaceSecretsmanager()
                .request(req)
                .call();

        if (res.secretsManager().isPresent()) {
            System.out.println(res.secretsManager().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [GetUnifiedWorkspaceSecretsmanagerRequest](../../models/operations/GetUnifiedWorkspaceSecretsmanagerRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[GetUnifiedWorkspaceSecretsmanagerResponse](../../models/operations/GetUnifiedWorkspaceSecretsmanagerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUnifiedWorkspaceSecretsmanagers

List secrets managers

### Example Usage

<!-- UsageSnippet language="java" operationID="listUnifiedWorkspaceSecretsmanagers" method="get" path="/unified/workspace/secretsmanager" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUnifiedWorkspaceSecretsmanagersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUnifiedWorkspaceSecretsmanagersResponse res = sdk.secretsmanager().listUnifiedWorkspaceSecretsmanagers()
                .call();

        if (res.secretsManagers().isPresent()) {
            System.out.println(res.secretsManagers().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [ListUnifiedWorkspaceSecretsmanagersRequest](../../models/operations/ListUnifiedWorkspaceSecretsmanagersRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[ListUnifiedWorkspaceSecretsmanagersResponse](../../models/operations/ListUnifiedWorkspaceSecretsmanagersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeUnifiedWorkspaceSecretsmanager

Remove secrets manager

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUnifiedWorkspaceSecretsmanager" method="delete" path="/unified/workspace/secretsmanager/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUnifiedWorkspaceSecretsmanagerRequest;
import to.unified.unified_java_sdk.models.operations.RemoveUnifiedWorkspaceSecretsmanagerResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUnifiedWorkspaceSecretsmanagerRequest req = RemoveUnifiedWorkspaceSecretsmanagerRequest.builder()
                .id("<id>")
                .build();

        RemoveUnifiedWorkspaceSecretsmanagerResponse res = sdk.secretsmanager().removeUnifiedWorkspaceSecretsmanager()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [RemoveUnifiedWorkspaceSecretsmanagerRequest](../../models/operations/RemoveUnifiedWorkspaceSecretsmanagerRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[RemoveUnifiedWorkspaceSecretsmanagerResponse](../../models/operations/RemoveUnifiedWorkspaceSecretsmanagerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |