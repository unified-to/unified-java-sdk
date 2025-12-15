# Transaction

## Overview

### Available Operations

* [createAccountingTransaction](#createaccountingtransaction) - Create a transaction
* [getAccountingTransaction](#getaccountingtransaction) - Retrieve a transaction
* [listAccountingTransactions](#listaccountingtransactions) - List all transactions
* [patchAccountingTransaction](#patchaccountingtransaction) - Update a transaction
* [removeAccountingTransaction](#removeaccountingtransaction) - Remove a transaction
* [updateAccountingTransaction](#updateaccountingtransaction) - Update a transaction

## createAccountingTransaction

Create a transaction

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingTransaction" method="post" path="/accounting/{connection_id}/transaction" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingTransactionRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingTransactionResponse;
import to.unified.unified_java_sdk.models.shared.AccountingTransaction;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingTransactionRequest req = CreateAccountingTransactionRequest.builder()
                .accountingTransaction(AccountingTransaction.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingTransactionResponse res = sdk.transaction().createAccountingTransaction()
                .request(req)
                .call();

        if (res.accountingTransaction().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [CreateAccountingTransactionRequest](../../models/operations/CreateAccountingTransactionRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[CreateAccountingTransactionResponse](../../models/operations/CreateAccountingTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingTransaction

Retrieve a transaction

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingTransaction" method="get" path="/accounting/{connection_id}/transaction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingTransactionRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingTransactionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingTransactionRequest req = GetAccountingTransactionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingTransactionResponse res = sdk.transaction().getAccountingTransaction()
                .request(req)
                .call();

        if (res.accountingTransaction().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetAccountingTransactionRequest](../../models/operations/GetAccountingTransactionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetAccountingTransactionResponse](../../models/operations/GetAccountingTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingTransactions

List all transactions

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingTransactions" method="get" path="/accounting/{connection_id}/transaction" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingTransactionsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingTransactionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingTransactionsRequest req = ListAccountingTransactionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingTransactionsResponse res = sdk.transaction().listAccountingTransactions()
                .request(req)
                .call();

        if (res.accountingTransactions().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListAccountingTransactionsRequest](../../models/operations/ListAccountingTransactionsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListAccountingTransactionsResponse](../../models/operations/ListAccountingTransactionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingTransaction

Update a transaction

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingTransaction" method="patch" path="/accounting/{connection_id}/transaction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingTransactionRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingTransactionResponse;
import to.unified.unified_java_sdk.models.shared.AccountingTransaction;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingTransactionRequest req = PatchAccountingTransactionRequest.builder()
                .accountingTransaction(AccountingTransaction.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingTransactionResponse res = sdk.transaction().patchAccountingTransaction()
                .request(req)
                .call();

        if (res.accountingTransaction().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [PatchAccountingTransactionRequest](../../models/operations/PatchAccountingTransactionRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[PatchAccountingTransactionResponse](../../models/operations/PatchAccountingTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingTransaction

Remove a transaction

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingTransaction" method="delete" path="/accounting/{connection_id}/transaction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingTransactionRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingTransactionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingTransactionRequest req = RemoveAccountingTransactionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingTransactionResponse res = sdk.transaction().removeAccountingTransaction()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [RemoveAccountingTransactionRequest](../../models/operations/RemoveAccountingTransactionRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[RemoveAccountingTransactionResponse](../../models/operations/RemoveAccountingTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingTransaction

Update a transaction

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingTransaction" method="put" path="/accounting/{connection_id}/transaction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingTransactionRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingTransactionResponse;
import to.unified.unified_java_sdk.models.shared.AccountingTransaction;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingTransactionRequest req = UpdateAccountingTransactionRequest.builder()
                .accountingTransaction(AccountingTransaction.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingTransactionResponse res = sdk.transaction().updateAccountingTransaction()
                .request(req)
                .call();

        if (res.accountingTransaction().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UpdateAccountingTransactionRequest](../../models/operations/UpdateAccountingTransactionRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateAccountingTransactionResponse](../../models/operations/UpdateAccountingTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |