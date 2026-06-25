# Purchaseorder

## Overview

### Available Operations

* [createAccountingPurchaseorder2](#createaccountingpurchaseorder2) - Create a purchaseorder
* [getAccountingPurchaseorder2](#getaccountingpurchaseorder2) - Retrieve a purchaseorder
* [listAccountingPurchaseorders2](#listaccountingpurchaseorders2) - List all purchaseorders
* [patchAccountingPurchaseorder2](#patchaccountingpurchaseorder2) - Update a purchaseorder
* [removeAccountingPurchaseorder2](#removeaccountingpurchaseorder2) - Remove a purchaseorder
* [updateAccountingPurchaseorder2](#updateaccountingpurchaseorder2) - Update a purchaseorder

## createAccountingPurchaseorder2

Create a purchaseorder

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingPurchaseorder2" method="post" path="/accounting/{connection_id}/purchaseorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingPurchaseorder2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingPurchaseorder2Response;
import to.unified.unified_java_sdk.models.shared.AccountingPurchaseorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingPurchaseorder2Request req = CreateAccountingPurchaseorder2Request.builder()
                .accountingPurchaseorder(AccountingPurchaseorder.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingPurchaseorder2Response res = sdk.purchaseorder().createAccountingPurchaseorder2()
                .request(req)
                .call();

        if (res.accountingPurchaseorder().isPresent()) {
            System.out.println(res.accountingPurchaseorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [CreateAccountingPurchaseorder2Request](../../models/operations/CreateAccountingPurchaseorder2Request.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[CreateAccountingPurchaseorder2Response](../../models/operations/CreateAccountingPurchaseorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingPurchaseorder2

Retrieve a purchaseorder

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingPurchaseorder2" method="get" path="/accounting/{connection_id}/purchaseorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingPurchaseorder2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingPurchaseorder2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingPurchaseorder2Request req = GetAccountingPurchaseorder2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingPurchaseorder2Response res = sdk.purchaseorder().getAccountingPurchaseorder2()
                .request(req)
                .call();

        if (res.accountingPurchaseorder().isPresent()) {
            System.out.println(res.accountingPurchaseorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [GetAccountingPurchaseorder2Request](../../models/operations/GetAccountingPurchaseorder2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[GetAccountingPurchaseorder2Response](../../models/operations/GetAccountingPurchaseorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingPurchaseorders2

List all purchaseorders

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingPurchaseorders2" method="get" path="/accounting/{connection_id}/purchaseorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingPurchaseorders2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingPurchaseorders2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingPurchaseorders2Request req = ListAccountingPurchaseorders2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingPurchaseorders2Response res = sdk.purchaseorder().listAccountingPurchaseorders2()
                .request(req)
                .call();

        if (res.accountingPurchaseorders().isPresent()) {
            System.out.println(res.accountingPurchaseorders().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [ListAccountingPurchaseorders2Request](../../models/operations/ListAccountingPurchaseorders2Request.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[ListAccountingPurchaseorders2Response](../../models/operations/ListAccountingPurchaseorders2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingPurchaseorder2

Update a purchaseorder

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingPurchaseorder2" method="patch" path="/accounting/{connection_id}/purchaseorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingPurchaseorder2Request;
import to.unified.unified_java_sdk.models.operations.PatchAccountingPurchaseorder2Response;
import to.unified.unified_java_sdk.models.shared.AccountingPurchaseorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingPurchaseorder2Request req = PatchAccountingPurchaseorder2Request.builder()
                .accountingPurchaseorder(AccountingPurchaseorder.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingPurchaseorder2Response res = sdk.purchaseorder().patchAccountingPurchaseorder2()
                .request(req)
                .call();

        if (res.accountingPurchaseorder().isPresent()) {
            System.out.println(res.accountingPurchaseorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [PatchAccountingPurchaseorder2Request](../../models/operations/PatchAccountingPurchaseorder2Request.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[PatchAccountingPurchaseorder2Response](../../models/operations/PatchAccountingPurchaseorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingPurchaseorder2

Remove a purchaseorder

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingPurchaseorder2" method="delete" path="/accounting/{connection_id}/purchaseorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingPurchaseorder2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingPurchaseorder2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingPurchaseorder2Request req = RemoveAccountingPurchaseorder2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingPurchaseorder2Response res = sdk.purchaseorder().removeAccountingPurchaseorder2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [RemoveAccountingPurchaseorder2Request](../../models/operations/RemoveAccountingPurchaseorder2Request.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[RemoveAccountingPurchaseorder2Response](../../models/operations/RemoveAccountingPurchaseorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingPurchaseorder2

Update a purchaseorder

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingPurchaseorder2" method="put" path="/accounting/{connection_id}/purchaseorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingPurchaseorder2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingPurchaseorder2Response;
import to.unified.unified_java_sdk.models.shared.AccountingPurchaseorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingPurchaseorder2Request req = UpdateAccountingPurchaseorder2Request.builder()
                .accountingPurchaseorder(AccountingPurchaseorder.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingPurchaseorder2Response res = sdk.purchaseorder().updateAccountingPurchaseorder2()
                .request(req)
                .call();

        if (res.accountingPurchaseorder().isPresent()) {
            System.out.println(res.accountingPurchaseorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [UpdateAccountingPurchaseorder2Request](../../models/operations/UpdateAccountingPurchaseorder2Request.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[UpdateAccountingPurchaseorder2Response](../../models/operations/UpdateAccountingPurchaseorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |