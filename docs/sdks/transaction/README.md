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

Creates a AccountingTransaction. Provide the unified AccountingTransaction fields in the request body; they are mapped to the provider's API. Returns the created AccountingTransaction.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingTransaction" method="post" path="/accounting/{connection_id}/transaction" example="accounting_transaction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingTransactionRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingTransactionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingTransactionRequest req = CreateAccountingTransactionRequest.builder()
                .accountingTransaction(AccountingTransaction.builder()
                    .createdAt(OffsetDateTime.parse("2019-09-25T11:40:42.574Z"))
                    .id("7d84db37-d5b9-4098-adac-7dd406208d43")
                    .lineitems(List.of(
                        AccountingTransactionLineItem.builder()
                            .categoryIds(List.of())
                            .description("The turquoise Hat combines Wallis and Futuna aesthetics with Potassium-based durability")
                            .id("e572460b-57c9-45bd-bfcc-4c6e92e11c57")
                            .name("Shirt")
                            .totalAmount(10184d)
                            .unitAmount(536d)
                            .unitQuantity(19d)
                            .build()))
                    .memo("deposit of ISK 792.81 at Fritsch - Dooley charged to account ending in 7879 using card ending in ****3230.")
                    .status(AccountingTransactionStatus.PENDING)
                    .taxAmount(0d)
                    .totalAmount(10184d)
                    .transactionAt(OffsetDateTime.parse("2019-09-25T11:40:42.574Z"))
                    .updatedAt(OffsetDateTime.parse("2019-10-14T06:19:22.778Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingTransactionResponse res = sdk.transaction().createAccountingTransaction()
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
| `request`                                                                                           | [CreateAccountingTransactionRequest](../../models/operations/CreateAccountingTransactionRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[CreateAccountingTransactionResponse](../../models/operations/CreateAccountingTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingTransaction

Retrieves a single AccountingTransaction by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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
            System.out.println(res.accountingTransaction().get());
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

Returns a list of AccountingTransactions. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
            System.out.println(res.accountingTransactions().get());
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

Updates the AccountingTransaction identified by `id`. Provide the unified AccountingTransaction fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingTransaction" method="patch" path="/accounting/{connection_id}/transaction/{id}" example="accounting_transaction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingTransactionRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingTransactionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingTransactionRequest req = PatchAccountingTransactionRequest.builder()
                .accountingTransaction(AccountingTransaction.builder()
                    .createdAt(OffsetDateTime.parse("2019-09-25T11:40:42.574Z"))
                    .id("0f076efa-8474-42d3-81a8-571670229456")
                    .lineitems(List.of(
                        AccountingTransactionLineItem.builder()
                            .categoryIds(List.of())
                            .description("The turquoise Hat combines Wallis and Futuna aesthetics with Potassium-based durability")
                            .id("4610f9a3-2400-442d-85a9-4067c82998c8")
                            .name("Shirt")
                            .totalAmount(10184d)
                            .unitAmount(536d)
                            .unitQuantity(19d)
                            .build()))
                    .memo("deposit of ISK 792.81 at Fritsch - Dooley charged to account ending in 7879 using card ending in ****3230.")
                    .status(AccountingTransactionStatus.PENDING)
                    .taxAmount(0d)
                    .totalAmount(10184d)
                    .transactionAt(OffsetDateTime.parse("2019-09-25T11:40:42.574Z"))
                    .updatedAt(OffsetDateTime.parse("2019-10-14T06:19:22.778Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingTransactionResponse res = sdk.transaction().patchAccountingTransaction()
                .request(req)
                .call();

        if (res.accountingTransaction().isPresent()) {
            System.out.println(res.accountingTransaction().get());
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

Deletes the AccountingTransaction identified by `id`.

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

Updates the AccountingTransaction identified by `id`. Provide the unified AccountingTransaction fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingTransaction" method="put" path="/accounting/{connection_id}/transaction/{id}" example="accounting_transaction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingTransactionRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingTransactionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingTransactionRequest req = UpdateAccountingTransactionRequest.builder()
                .accountingTransaction(AccountingTransaction.builder()
                    .createdAt(OffsetDateTime.parse("2019-09-25T11:40:42.574Z"))
                    .id("0f076efa-8474-42d3-81a8-571670229456")
                    .lineitems(List.of(
                        AccountingTransactionLineItem.builder()
                            .categoryIds(List.of())
                            .description("The turquoise Hat combines Wallis and Futuna aesthetics with Potassium-based durability")
                            .id("4610f9a3-2400-442d-85a9-4067c82998c8")
                            .name("Shirt")
                            .totalAmount(10184d)
                            .unitAmount(536d)
                            .unitQuantity(19d)
                            .build()))
                    .memo("deposit of ISK 792.81 at Fritsch - Dooley charged to account ending in 7879 using card ending in ****3230.")
                    .status(AccountingTransactionStatus.PENDING)
                    .taxAmount(0d)
                    .totalAmount(10184d)
                    .transactionAt(OffsetDateTime.parse("2019-09-25T11:40:42.574Z"))
                    .updatedAt(OffsetDateTime.parse("2019-10-14T06:19:22.778Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingTransactionResponse res = sdk.transaction().updateAccountingTransaction()
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
| `request`                                                                                           | [UpdateAccountingTransactionRequest](../../models/operations/UpdateAccountingTransactionRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateAccountingTransactionResponse](../../models/operations/UpdateAccountingTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |