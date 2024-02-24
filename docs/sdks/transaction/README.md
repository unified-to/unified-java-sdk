# Transaction
(*transaction*)

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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingTransactionRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingTransactionResponse;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingTransactionSecurity;
import com.unifiedapi.unifiedto.models.shared.AccountingTransaction;
import com.unifiedapi.unifiedto.models.shared.AccountingTransactionLineitem;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateAccountingTransactionRequest req = new CreateAccountingTransactionRequest(
                "<value>"){{
                accountingTransaction = new AccountingTransaction(
                    "<value>"){{
                    createdAt = "<value>";
                    currency = "Libyan Dinar";
                    description = "Pre-emptive multimedia benchmark";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingTransactionLineitem[]{{
                        add(new AccountingTransactionLineitem(
                        "<value>",
                        7389.88d){{
                            accountId = "<value>";
                            totalAmount = 2477.45d;
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    reference = "<value>";
                    taxAmount = 8276.07d;
                    taxrateId = "<value>";
                    updatedAt = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingTransactionResponse res = sdk.transaction.createAccountingTransaction(req, new CreateAccountingTransactionSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.accountingTransaction != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.CreateAccountingTransactionRequest](../../models/operations/CreateAccountingTransactionRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.CreateAccountingTransactionSecurity](../../models/operations/CreateAccountingTransactionSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAccountingTransactionResponse](../../models/operations/CreateAccountingTransactionResponse.md)**


## getAccountingTransaction

Retrieve a transaction

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingTransactionRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingTransactionResponse;
import com.unifiedapi.unifiedto.models.operations.GetAccountingTransactionSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetAccountingTransactionRequest req = new GetAccountingTransactionRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingTransactionResponse res = sdk.transaction.getAccountingTransaction(req, new GetAccountingTransactionSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.accountingTransaction != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetAccountingTransactionRequest](../../models/operations/GetAccountingTransactionRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.GetAccountingTransactionSecurity](../../models/operations/GetAccountingTransactionSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingTransactionResponse](../../models/operations/GetAccountingTransactionResponse.md)**


## listAccountingTransactions

List all transactions

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingTransactionsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingTransactionsResponse;
import com.unifiedapi.unifiedto.models.operations.ListAccountingTransactionsSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListAccountingTransactionsRequest req = new ListAccountingTransactionsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 7894.5d;
                offset = 4597.84d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2024-12-02T12:20:43.572Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingTransactionsResponse res = sdk.transaction.listAccountingTransactions(req, new ListAccountingTransactionsSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.accountingTransactions != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListAccountingTransactionsRequest](../../models/operations/ListAccountingTransactionsRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.ListAccountingTransactionsSecurity](../../models/operations/ListAccountingTransactionsSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingTransactionsResponse](../../models/operations/ListAccountingTransactionsResponse.md)**


## patchAccountingTransaction

Update a transaction

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingTransactionRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingTransactionResponse;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingTransactionSecurity;
import com.unifiedapi.unifiedto.models.shared.AccountingTransaction;
import com.unifiedapi.unifiedto.models.shared.AccountingTransactionLineitem;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchAccountingTransactionRequest req = new PatchAccountingTransactionRequest(
                "<value>",
                "<value>"){{
                accountingTransaction = new AccountingTransaction(
                    "<value>"){{
                    createdAt = "<value>";
                    currency = "Kwacha";
                    description = "Multi-channelled transitional function";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingTransactionLineitem[]{{
                        add(new AccountingTransactionLineitem(
                        "<value>",
                        3153.09d){{
                            accountId = "<value>";
                            totalAmount = 535.65d;
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    reference = "<value>";
                    taxAmount = 259.82d;
                    taxrateId = "<value>";
                    updatedAt = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingTransactionResponse res = sdk.transaction.patchAccountingTransaction(req, new PatchAccountingTransactionSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.accountingTransaction != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchAccountingTransactionRequest](../../models/operations/PatchAccountingTransactionRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PatchAccountingTransactionSecurity](../../models/operations/PatchAccountingTransactionSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAccountingTransactionResponse](../../models/operations/PatchAccountingTransactionResponse.md)**


## removeAccountingTransaction

Remove a transaction

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingTransactionRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingTransactionResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingTransactionSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingTransactionRequest req = new RemoveAccountingTransactionRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingTransactionResponse res = sdk.transaction.removeAccountingTransaction(req, new RemoveAccountingTransactionSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingTransactionRequest](../../models/operations/RemoveAccountingTransactionRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingTransactionSecurity](../../models/operations/RemoveAccountingTransactionSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAccountingTransactionResponse](../../models/operations/RemoveAccountingTransactionResponse.md)**


## updateAccountingTransaction

Update a transaction

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingTransactionRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingTransactionResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingTransactionSecurity;
import com.unifiedapi.unifiedto.models.shared.AccountingTransaction;
import com.unifiedapi.unifiedto.models.shared.AccountingTransactionLineitem;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingTransactionRequest req = new UpdateAccountingTransactionRequest(
                "<value>",
                "<value>"){{
                accountingTransaction = new AccountingTransaction(
                    "<value>"){{
                    createdAt = "<value>";
                    currency = "Zloty";
                    description = "Organic web-enabled orchestration";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingTransactionLineitem[]{{
                        add(new AccountingTransactionLineitem(
                        "<value>",
                        1897.48d){{
                            accountId = "<value>";
                            totalAmount = 2397.73d;
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    reference = "<value>";
                    taxAmount = 421.84d;
                    taxrateId = "<value>";
                    updatedAt = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingTransactionResponse res = sdk.transaction.updateAccountingTransaction(req, new UpdateAccountingTransactionSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.accountingTransaction != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingTransactionRequest](../../models/operations/UpdateAccountingTransactionRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingTransactionSecurity](../../models/operations/UpdateAccountingTransactionSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAccountingTransactionResponse](../../models/operations/UpdateAccountingTransactionResponse.md)**

