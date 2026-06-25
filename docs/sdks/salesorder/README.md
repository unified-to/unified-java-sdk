# Salesorder

## Overview

### Available Operations

* [createAccountingSalesorder2](#createaccountingsalesorder2) - Create a salesorder
* [getAccountingSalesorder2](#getaccountingsalesorder2) - Retrieve a salesorder
* [listAccountingSalesorders2](#listaccountingsalesorders2) - List all salesorders
* [patchAccountingSalesorder2](#patchaccountingsalesorder2) - Update a salesorder
* [removeAccountingSalesorder2](#removeaccountingsalesorder2) - Remove a salesorder
* [updateAccountingSalesorder2](#updateaccountingsalesorder2) - Update a salesorder

## createAccountingSalesorder2

Create a salesorder

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingSalesorder2" method="post" path="/accounting/{connection_id}/salesorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingSalesorder2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingSalesorder2Response;
import to.unified.unified_java_sdk.models.shared.AccountingSalesorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingSalesorder2Request req = CreateAccountingSalesorder2Request.builder()
                .accountingSalesorder(AccountingSalesorder.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingSalesorder2Response res = sdk.salesorder().createAccountingSalesorder2()
                .request(req)
                .call();

        if (res.accountingSalesorder().isPresent()) {
            System.out.println(res.accountingSalesorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [CreateAccountingSalesorder2Request](../../models/operations/CreateAccountingSalesorder2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[CreateAccountingSalesorder2Response](../../models/operations/CreateAccountingSalesorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingSalesorder2

Retrieve a salesorder

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingSalesorder2" method="get" path="/accounting/{connection_id}/salesorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingSalesorder2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingSalesorder2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingSalesorder2Request req = GetAccountingSalesorder2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingSalesorder2Response res = sdk.salesorder().getAccountingSalesorder2()
                .request(req)
                .call();

        if (res.accountingSalesorder().isPresent()) {
            System.out.println(res.accountingSalesorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetAccountingSalesorder2Request](../../models/operations/GetAccountingSalesorder2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetAccountingSalesorder2Response](../../models/operations/GetAccountingSalesorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingSalesorders2

List all salesorders

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingSalesorders2" method="get" path="/accounting/{connection_id}/salesorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingSalesorders2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingSalesorders2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingSalesorders2Request req = ListAccountingSalesorders2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingSalesorders2Response res = sdk.salesorder().listAccountingSalesorders2()
                .request(req)
                .call();

        if (res.accountingSalesorders().isPresent()) {
            System.out.println(res.accountingSalesorders().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListAccountingSalesorders2Request](../../models/operations/ListAccountingSalesorders2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListAccountingSalesorders2Response](../../models/operations/ListAccountingSalesorders2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingSalesorder2

Update a salesorder

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingSalesorder2" method="patch" path="/accounting/{connection_id}/salesorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingSalesorder2Request;
import to.unified.unified_java_sdk.models.operations.PatchAccountingSalesorder2Response;
import to.unified.unified_java_sdk.models.shared.AccountingSalesorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingSalesorder2Request req = PatchAccountingSalesorder2Request.builder()
                .accountingSalesorder(AccountingSalesorder.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingSalesorder2Response res = sdk.salesorder().patchAccountingSalesorder2()
                .request(req)
                .call();

        if (res.accountingSalesorder().isPresent()) {
            System.out.println(res.accountingSalesorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [PatchAccountingSalesorder2Request](../../models/operations/PatchAccountingSalesorder2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[PatchAccountingSalesorder2Response](../../models/operations/PatchAccountingSalesorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingSalesorder2

Remove a salesorder

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingSalesorder2" method="delete" path="/accounting/{connection_id}/salesorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingSalesorder2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingSalesorder2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingSalesorder2Request req = RemoveAccountingSalesorder2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingSalesorder2Response res = sdk.salesorder().removeAccountingSalesorder2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [RemoveAccountingSalesorder2Request](../../models/operations/RemoveAccountingSalesorder2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[RemoveAccountingSalesorder2Response](../../models/operations/RemoveAccountingSalesorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingSalesorder2

Update a salesorder

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingSalesorder2" method="put" path="/accounting/{connection_id}/salesorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingSalesorder2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingSalesorder2Response;
import to.unified.unified_java_sdk.models.shared.AccountingSalesorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingSalesorder2Request req = UpdateAccountingSalesorder2Request.builder()
                .accountingSalesorder(AccountingSalesorder.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingSalesorder2Response res = sdk.salesorder().updateAccountingSalesorder2()
                .request(req)
                .call();

        if (res.accountingSalesorder().isPresent()) {
            System.out.println(res.accountingSalesorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UpdateAccountingSalesorder2Request](../../models/operations/UpdateAccountingSalesorder2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateAccountingSalesorder2Response](../../models/operations/UpdateAccountingSalesorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |