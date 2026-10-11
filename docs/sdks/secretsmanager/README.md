# Secretsmanager

## Overview

### Available Operations

* [createUnifiedSecretsmanager](#createunifiedsecretsmanager) - Create secrets manager
* [getUnifiedSecretsmanager](#getunifiedsecretsmanager) - Retrieve secrets manager
* [listUnifiedSecretsmanagerInstructions](#listunifiedsecretsmanagerinstructions) - List secrets manager setup instructions
* [listUnifiedSecretsmanagerSecrets](#listunifiedsecretsmanagersecrets) - List secrets in a secrets manager
* [listUnifiedSecretsmanagers](#listunifiedsecretsmanagers) - List secrets managers
* [removeUnifiedSecretsmanager](#removeunifiedsecretsmanager) - Remove secrets manager

## createUnifiedSecretsmanager

Create secrets manager

### Example Usage

<!-- UsageSnippet language="java" operationID="createUnifiedSecretsmanager" method="post" path="/unified/secretsmanager" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUnifiedSecretsmanagerResponse;
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
                    Map.entry("key", "<value>"),
                    Map.entry("key1", "<value>")))
                .name("<value>")
                .type(SecretsManagerType.AKEYLESS)
                .build();

        CreateUnifiedSecretsmanagerResponse res = sdk.secretsmanager().createUnifiedSecretsmanager()
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

**[CreateUnifiedSecretsmanagerResponse](../../models/operations/CreateUnifiedSecretsmanagerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUnifiedSecretsmanager

Retrieve secrets manager

### Example Usage

<!-- UsageSnippet language="java" operationID="getUnifiedSecretsmanager" method="get" path="/unified/secretsmanager/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUnifiedSecretsmanagerRequest;
import to.unified.unified_java_sdk.models.operations.GetUnifiedSecretsmanagerResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUnifiedSecretsmanagerRequest req = GetUnifiedSecretsmanagerRequest.builder()
                .id("<id>")
                .build();

        GetUnifiedSecretsmanagerResponse res = sdk.secretsmanager().getUnifiedSecretsmanager()
                .request(req)
                .call();

        if (res.secretsManager().isPresent()) {
            System.out.println(res.secretsManager().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetUnifiedSecretsmanagerRequest](../../models/operations/GetUnifiedSecretsmanagerRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetUnifiedSecretsmanagerResponse](../../models/operations/GetUnifiedSecretsmanagerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUnifiedSecretsmanagerInstructions

List secrets manager setup instructions

### Example Usage

<!-- UsageSnippet language="java" operationID="listUnifiedSecretsmanagerInstructions" method="get" path="/unified/secretsmanager/instructions" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUnifiedSecretsmanagerInstructionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUnifiedSecretsmanagerInstructionsResponse res = sdk.secretsmanager().listUnifiedSecretsmanagerInstructions()
                .call();

        if (res.secretsManagerInstructionsList().isPresent()) {
            System.out.println(res.secretsManagerInstructionsList().get());
        }
    }
}
```

### Response

**[ListUnifiedSecretsmanagerInstructionsResponse](../../models/operations/ListUnifiedSecretsmanagerInstructionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUnifiedSecretsmanagerSecrets

List secrets in a secrets manager

### Example Usage

<!-- UsageSnippet language="java" operationID="listUnifiedSecretsmanagerSecrets" method="get" path="/unified/secretsmanager/secrets" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUnifiedSecretsmanagerSecretsRequest;
import to.unified.unified_java_sdk.models.operations.ListUnifiedSecretsmanagerSecretsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUnifiedSecretsmanagerSecretsRequest req = ListUnifiedSecretsmanagerSecretsRequest.builder()
                .secretsmanagerId("<id>")
                .build();

        ListUnifiedSecretsmanagerSecretsResponse res = sdk.secretsmanager().listUnifiedSecretsmanagerSecrets()
                .request(req)
                .call();

        if (res.secretsManagerSecrets().isPresent()) {
            System.out.println(res.secretsManagerSecrets().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [ListUnifiedSecretsmanagerSecretsRequest](../../models/operations/ListUnifiedSecretsmanagerSecretsRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[ListUnifiedSecretsmanagerSecretsResponse](../../models/operations/ListUnifiedSecretsmanagerSecretsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUnifiedSecretsmanagers

List secrets managers

### Example Usage

<!-- UsageSnippet language="java" operationID="listUnifiedSecretsmanagers" method="get" path="/unified/secretsmanager" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUnifiedSecretsmanagersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUnifiedSecretsmanagersResponse res = sdk.secretsmanager().listUnifiedSecretsmanagers()
                .call();

        if (res.secretsManagers().isPresent()) {
            System.out.println(res.secretsManagers().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListUnifiedSecretsmanagersRequest](../../models/operations/ListUnifiedSecretsmanagersRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListUnifiedSecretsmanagersResponse](../../models/operations/ListUnifiedSecretsmanagersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeUnifiedSecretsmanager

Remove secrets manager

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUnifiedSecretsmanager" method="delete" path="/unified/secretsmanager/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUnifiedSecretsmanagerRequest;
import to.unified.unified_java_sdk.models.operations.RemoveUnifiedSecretsmanagerResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUnifiedSecretsmanagerRequest req = RemoveUnifiedSecretsmanagerRequest.builder()
                .id("<id>")
                .build();

        RemoveUnifiedSecretsmanagerResponse res = sdk.secretsmanager().removeUnifiedSecretsmanager()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [RemoveUnifiedSecretsmanagerRequest](../../models/operations/RemoveUnifiedSecretsmanagerRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[RemoveUnifiedSecretsmanagerResponse](../../models/operations/RemoveUnifiedSecretsmanagerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |