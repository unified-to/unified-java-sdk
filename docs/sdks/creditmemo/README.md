# Creditmemo

## Overview

### Available Operations

* [createAccountingCreditmemo2](#createaccountingcreditmemo2) - Create a creditmemo
* [getAccountingCreditmemo2](#getaccountingcreditmemo2) - Retrieve a creditmemo
* [listAccountingCreditmemoes2](#listaccountingcreditmemoes2) - List all creditmemoes
* [patchAccountingCreditmemo2](#patchaccountingcreditmemo2) - Update a creditmemo
* [removeAccountingCreditmemo2](#removeaccountingcreditmemo2) - Remove a creditmemo
* [updateAccountingCreditmemo2](#updateaccountingcreditmemo2) - Update a creditmemo

## createAccountingCreditmemo2

Create a creditmemo

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingCreditmemo2" method="post" path="/accounting/{connection_id}/creditmemo" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingCreditmemo2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingCreditmemo2Response;
import to.unified.unified_java_sdk.models.shared.AccountingCreditmemo;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingCreditmemo2Request req = CreateAccountingCreditmemo2Request.builder()
                .accountingCreditmemo(AccountingCreditmemo.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingCreditmemo2Response res = sdk.creditmemo().createAccountingCreditmemo2()
                .request(req)
                .call();

        if (res.accountingCreditmemo().isPresent()) {
            System.out.println(res.accountingCreditmemo().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [CreateAccountingCreditmemo2Request](../../models/operations/CreateAccountingCreditmemo2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[CreateAccountingCreditmemo2Response](../../models/operations/CreateAccountingCreditmemo2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingCreditmemo2

Retrieve a creditmemo

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingCreditmemo2" method="get" path="/accounting/{connection_id}/creditmemo/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingCreditmemo2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingCreditmemo2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingCreditmemo2Request req = GetAccountingCreditmemo2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingCreditmemo2Response res = sdk.creditmemo().getAccountingCreditmemo2()
                .request(req)
                .call();

        if (res.accountingCreditmemo().isPresent()) {
            System.out.println(res.accountingCreditmemo().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetAccountingCreditmemo2Request](../../models/operations/GetAccountingCreditmemo2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetAccountingCreditmemo2Response](../../models/operations/GetAccountingCreditmemo2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingCreditmemoes2

List all creditmemoes

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingCreditmemoes2" method="get" path="/accounting/{connection_id}/creditmemo" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingCreditmemoes2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingCreditmemoes2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingCreditmemoes2Request req = ListAccountingCreditmemoes2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingCreditmemoes2Response res = sdk.creditmemo().listAccountingCreditmemoes2()
                .request(req)
                .call();

        if (res.accountingCreditmemoes().isPresent()) {
            System.out.println(res.accountingCreditmemoes().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListAccountingCreditmemoes2Request](../../models/operations/ListAccountingCreditmemoes2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListAccountingCreditmemoes2Response](../../models/operations/ListAccountingCreditmemoes2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingCreditmemo2

Update a creditmemo

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingCreditmemo2" method="patch" path="/accounting/{connection_id}/creditmemo/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingCreditmemo2Request;
import to.unified.unified_java_sdk.models.operations.PatchAccountingCreditmemo2Response;
import to.unified.unified_java_sdk.models.shared.AccountingCreditmemo;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingCreditmemo2Request req = PatchAccountingCreditmemo2Request.builder()
                .accountingCreditmemo(AccountingCreditmemo.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingCreditmemo2Response res = sdk.creditmemo().patchAccountingCreditmemo2()
                .request(req)
                .call();

        if (res.accountingCreditmemo().isPresent()) {
            System.out.println(res.accountingCreditmemo().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [PatchAccountingCreditmemo2Request](../../models/operations/PatchAccountingCreditmemo2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[PatchAccountingCreditmemo2Response](../../models/operations/PatchAccountingCreditmemo2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingCreditmemo2

Remove a creditmemo

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingCreditmemo2" method="delete" path="/accounting/{connection_id}/creditmemo/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingCreditmemo2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingCreditmemo2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingCreditmemo2Request req = RemoveAccountingCreditmemo2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingCreditmemo2Response res = sdk.creditmemo().removeAccountingCreditmemo2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [RemoveAccountingCreditmemo2Request](../../models/operations/RemoveAccountingCreditmemo2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[RemoveAccountingCreditmemo2Response](../../models/operations/RemoveAccountingCreditmemo2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingCreditmemo2

Update a creditmemo

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingCreditmemo2" method="put" path="/accounting/{connection_id}/creditmemo/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingCreditmemo2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingCreditmemo2Response;
import to.unified.unified_java_sdk.models.shared.AccountingCreditmemo;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingCreditmemo2Request req = UpdateAccountingCreditmemo2Request.builder()
                .accountingCreditmemo(AccountingCreditmemo.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingCreditmemo2Response res = sdk.creditmemo().updateAccountingCreditmemo2()
                .request(req)
                .call();

        if (res.accountingCreditmemo().isPresent()) {
            System.out.println(res.accountingCreditmemo().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UpdateAccountingCreditmemo2Request](../../models/operations/UpdateAccountingCreditmemo2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateAccountingCreditmemo2Response](../../models/operations/UpdateAccountingCreditmemo2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |