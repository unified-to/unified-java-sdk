# Transaction

## Overview

### Available Operations

* [createAccountingTransaction2](#createaccountingtransaction2) - Create a transaction
* [getAccountingTransaction2](#getaccountingtransaction2) - Retrieve a transaction
* [listAccountingTransactions2](#listaccountingtransactions2) - List all transactions
* [patchAccountingTransaction2](#patchaccountingtransaction2) - Update a transaction
* [removeAccountingTransaction2](#removeaccountingtransaction2) - Remove a transaction
* [updateAccountingTransaction2](#updateaccountingtransaction2) - Update a transaction

## createAccountingTransaction2

Create a transaction

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingTransaction2" method="post" path="/accounting/{connection_id}/transaction" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingTransaction2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingTransaction2Response;
import to.unified.unified_java_sdk.models.shared.AccountingTransaction;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingTransaction2Request req = CreateAccountingTransaction2Request.builder()
                .accountingTransaction(AccountingTransaction.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingTransaction2Response res = sdk.transaction().createAccountingTransaction2()
                .request(req)
                .call();

        if (res.accountingTransaction().isPresent()) {
            System.out.println(res.accountingTransaction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [CreateAccountingTransaction2Request](../../models/operations/CreateAccountingTransaction2Request.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[CreateAccountingTransaction2Response](../../models/operations/CreateAccountingTransaction2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingTransaction2

Retrieve a transaction

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingTransaction2" method="get" path="/accounting/{connection_id}/transaction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingTransaction2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingTransaction2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingTransaction2Request req = GetAccountingTransaction2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingTransaction2Response res = sdk.transaction().getAccountingTransaction2()
                .request(req)
                .call();

        if (res.accountingTransaction().isPresent()) {
            System.out.println(res.accountingTransaction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetAccountingTransaction2Request](../../models/operations/GetAccountingTransaction2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetAccountingTransaction2Response](../../models/operations/GetAccountingTransaction2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingTransactions2

List all transactions

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingTransactions2" method="get" path="/accounting/{connection_id}/transaction" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingTransactions2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingTransactions2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingTransactions2Request req = ListAccountingTransactions2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingTransactions2Response res = sdk.transaction().listAccountingTransactions2()
                .request(req)
                .call();

        if (res.accountingTransactions().isPresent()) {
            System.out.println(res.accountingTransactions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListAccountingTransactions2Request](../../models/operations/ListAccountingTransactions2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListAccountingTransactions2Response](../../models/operations/ListAccountingTransactions2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingTransaction2

Update a transaction

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingTransaction2" method="patch" path="/accounting/{connection_id}/transaction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingTransaction2Request;
import to.unified.unified_java_sdk.models.operations.PatchAccountingTransaction2Response;
import to.unified.unified_java_sdk.models.shared.AccountingTransaction;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingTransaction2Request req = PatchAccountingTransaction2Request.builder()
                .accountingTransaction(AccountingTransaction.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingTransaction2Response res = sdk.transaction().patchAccountingTransaction2()
                .request(req)
                .call();

        if (res.accountingTransaction().isPresent()) {
            System.out.println(res.accountingTransaction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [PatchAccountingTransaction2Request](../../models/operations/PatchAccountingTransaction2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[PatchAccountingTransaction2Response](../../models/operations/PatchAccountingTransaction2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingTransaction2

Remove a transaction

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingTransaction2" method="delete" path="/accounting/{connection_id}/transaction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingTransaction2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingTransaction2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingTransaction2Request req = RemoveAccountingTransaction2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingTransaction2Response res = sdk.transaction().removeAccountingTransaction2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [RemoveAccountingTransaction2Request](../../models/operations/RemoveAccountingTransaction2Request.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[RemoveAccountingTransaction2Response](../../models/operations/RemoveAccountingTransaction2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingTransaction2

Update a transaction

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingTransaction2" method="put" path="/accounting/{connection_id}/transaction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingTransaction2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingTransaction2Response;
import to.unified.unified_java_sdk.models.shared.AccountingTransaction;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingTransaction2Request req = UpdateAccountingTransaction2Request.builder()
                .accountingTransaction(AccountingTransaction.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingTransaction2Response res = sdk.transaction().updateAccountingTransaction2()
                .request(req)
                .call();

        if (res.accountingTransaction().isPresent()) {
            System.out.println(res.accountingTransaction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [UpdateAccountingTransaction2Request](../../models/operations/UpdateAccountingTransaction2Request.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[UpdateAccountingTransaction2Response](../../models/operations/UpdateAccountingTransaction2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |