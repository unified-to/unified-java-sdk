# Environment

## Overview

### Available Operations

* [createUnifiedEnvironment](#createunifiedenvironment) - Create new environments
* [listUnifiedEnvironments](#listunifiedenvironments) - Returns all environments
* [removeUnifiedEnvironment](#removeunifiedenvironment) - Remove an environment

## createUnifiedEnvironment

Create new environments

### Example Usage

<!-- UsageSnippet language="java" operationID="createUnifiedEnvironment" method="post" path="/unified/environment" -->
```java
package hello.world;

import java.lang.Exception;
import java.lang.String;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUnifiedEnvironmentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        List<String> req = List.of();

        CreateUnifiedEnvironmentResponse res = sdk.environment().createUnifiedEnvironment()
                .request(req)
                .call();

        if (res.environments().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [List<String>](../../models//.md)          | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[CreateUnifiedEnvironmentResponse](../../models/operations/CreateUnifiedEnvironmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUnifiedEnvironments

Returns all environments

### Example Usage

<!-- UsageSnippet language="java" operationID="listUnifiedEnvironments" method="get" path="/unified/environment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUnifiedEnvironmentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUnifiedEnvironmentsResponse res = sdk.environment().listUnifiedEnvironments()
                .call();

        if (res.environments().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ListUnifiedEnvironmentsResponse](../../models/operations/ListUnifiedEnvironmentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeUnifiedEnvironment

Remove an environment

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUnifiedEnvironment" method="delete" path="/unified/environment/{env}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUnifiedEnvironmentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveUnifiedEnvironmentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUnifiedEnvironmentRequest req = RemoveUnifiedEnvironmentRequest.builder()
                .env("<value>")
                .build();

        RemoveUnifiedEnvironmentResponse res = sdk.environment().removeUnifiedEnvironment()
                .request(req)
                .call();

        if (res.environments().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveUnifiedEnvironmentRequest](../../models/operations/RemoveUnifiedEnvironmentRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveUnifiedEnvironmentResponse](../../models/operations/RemoveUnifiedEnvironmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |