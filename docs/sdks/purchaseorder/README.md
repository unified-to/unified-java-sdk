# Purchaseorder
(*purchaseorder()*)

## Overview

### Available Operations

* [createAccountingPurchaseorder](#createaccountingpurchaseorder) - Create a purchaseorder
* [getAccountingPurchaseorder](#getaccountingpurchaseorder) - Retrieve a purchaseorder
* [listAccountingPurchaseorders](#listaccountingpurchaseorders) - List all purchaseorders
* [patchAccountingPurchaseorder](#patchaccountingpurchaseorder) - Update a purchaseorder
* [removeAccountingPurchaseorder](#removeaccountingpurchaseorder) - Remove a purchaseorder
* [updateAccountingPurchaseorder](#updateaccountingpurchaseorder) - Update a purchaseorder

## createAccountingPurchaseorder

Create a purchaseorder

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingPurchaseorder" method="post" path="/accounting/{connection_id}/purchaseorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingPurchaseorderRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingPurchaseorderResponse;
import to.unified.unified_java_sdk.models.shared.AccountingPurchaseorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingPurchaseorderRequest req = CreateAccountingPurchaseorderRequest.builder()
                .accountingPurchaseorder(AccountingPurchaseorder.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingPurchaseorderResponse res = sdk.purchaseorder().createAccountingPurchaseorder()
                .request(req)
                .call();

        if (res.accountingPurchaseorder().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [CreateAccountingPurchaseorderRequest](../../models/operations/CreateAccountingPurchaseorderRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[CreateAccountingPurchaseorderResponse](../../models/operations/CreateAccountingPurchaseorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingPurchaseorder

Retrieve a purchaseorder

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingPurchaseorder" method="get" path="/accounting/{connection_id}/purchaseorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingPurchaseorderRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingPurchaseorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingPurchaseorderRequest req = GetAccountingPurchaseorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingPurchaseorderResponse res = sdk.purchaseorder().getAccountingPurchaseorder()
                .request(req)
                .call();

        if (res.accountingPurchaseorder().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetAccountingPurchaseorderRequest](../../models/operations/GetAccountingPurchaseorderRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetAccountingPurchaseorderResponse](../../models/operations/GetAccountingPurchaseorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingPurchaseorders

List all purchaseorders

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingPurchaseorders" method="get" path="/accounting/{connection_id}/purchaseorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingPurchaseordersRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingPurchaseordersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingPurchaseordersRequest req = ListAccountingPurchaseordersRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingPurchaseordersResponse res = sdk.purchaseorder().listAccountingPurchaseorders()
                .request(req)
                .call();

        if (res.accountingPurchaseorders().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [ListAccountingPurchaseordersRequest](../../models/operations/ListAccountingPurchaseordersRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[ListAccountingPurchaseordersResponse](../../models/operations/ListAccountingPurchaseordersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingPurchaseorder

Update a purchaseorder

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingPurchaseorder" method="patch" path="/accounting/{connection_id}/purchaseorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingPurchaseorderRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingPurchaseorderResponse;
import to.unified.unified_java_sdk.models.shared.AccountingPurchaseorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingPurchaseorderRequest req = PatchAccountingPurchaseorderRequest.builder()
                .accountingPurchaseorder(AccountingPurchaseorder.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingPurchaseorderResponse res = sdk.purchaseorder().patchAccountingPurchaseorder()
                .request(req)
                .call();

        if (res.accountingPurchaseorder().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [PatchAccountingPurchaseorderRequest](../../models/operations/PatchAccountingPurchaseorderRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[PatchAccountingPurchaseorderResponse](../../models/operations/PatchAccountingPurchaseorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingPurchaseorder

Remove a purchaseorder

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingPurchaseorder" method="delete" path="/accounting/{connection_id}/purchaseorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingPurchaseorderRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingPurchaseorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingPurchaseorderRequest req = RemoveAccountingPurchaseorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingPurchaseorderResponse res = sdk.purchaseorder().removeAccountingPurchaseorder()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [RemoveAccountingPurchaseorderRequest](../../models/operations/RemoveAccountingPurchaseorderRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[RemoveAccountingPurchaseorderResponse](../../models/operations/RemoveAccountingPurchaseorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingPurchaseorder

Update a purchaseorder

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingPurchaseorder" method="put" path="/accounting/{connection_id}/purchaseorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingPurchaseorderRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingPurchaseorderResponse;
import to.unified.unified_java_sdk.models.shared.AccountingPurchaseorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingPurchaseorderRequest req = UpdateAccountingPurchaseorderRequest.builder()
                .accountingPurchaseorder(AccountingPurchaseorder.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingPurchaseorderResponse res = sdk.purchaseorder().updateAccountingPurchaseorder()
                .request(req)
                .call();

        if (res.accountingPurchaseorder().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [UpdateAccountingPurchaseorderRequest](../../models/operations/UpdateAccountingPurchaseorderRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[UpdateAccountingPurchaseorderResponse](../../models/operations/UpdateAccountingPurchaseorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |