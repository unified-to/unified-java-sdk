# Account
(*account*)

### Available Operations

* [createAccountingAccount](#createaccountingaccount) - Create an account
* [getAccountingAccount](#getaccountingaccount) - Retrieve an account
* [listAccountingAccounts](#listaccountingaccounts) - List all accounts
* [patchAccountingAccount](#patchaccountingaccount) - Update an account
* [removeAccountingAccount](#removeaccountingaccount) - Remove an account
* [updateAccountingAccount](#updateaccountingaccount) - Update an account

## createAccountingAccount

Create an account

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingAccount;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingAccountRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Status;
import com.unifiedapi.unifiedto.models.shared.Type;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountRequest req = new CreateAccountingAccountRequest(
                "string"){{
                accountingAccount = new AccountingAccount(
                    "string"){{
                    balance = 6602.56d;
                    bankAccountNumber = "string";
                    createdAt = OffsetDateTime.parse("2023-09-02T22:12:31.771Z");
                    currency = "Saint Helena Pound";
                    customerDefinedCode = "string";
                    description = "Cross-group zero defect task-force";
                    id = "<ID>";
                    raw = new PropertyAccountingAccountRaw(
);
                    status = Status.ACTIVE;
                    type = Type.EQUITY;
                    updatedAt = OffsetDateTime.parse("2023-09-09T23:41:51.681Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountResponse res = sdk.account.createAccountingAccount(req);

            if (res.accountingAccount != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountRequest](../../models/operations/CreateAccountingAccountRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountResponse](../../models/operations/CreateAccountingAccountResponse.md)**


## getAccountingAccount

Retrieve an account

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingAccountRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingAccountResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetAccountingAccountRequest req = new GetAccountingAccountRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingAccountResponse res = sdk.account.getAccountingAccount(req);

            if (res.accountingAccount != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetAccountingAccountRequest](../../models/operations/GetAccountingAccountRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingAccountResponse](../../models/operations/GetAccountingAccountResponse.md)**


## listAccountingAccounts

List all accounts

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingAccountsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingAccountsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListAccountingAccountsRequest req = new ListAccountingAccountsRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 9476.86d;
                offset = 5444.77d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2024-04-19T21:33:28.191Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingAccountsResponse res = sdk.account.listAccountingAccounts(req);

            if (res.accountingAccounts != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListAccountingAccountsRequest](../../models/operations/ListAccountingAccountsRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingAccountsResponse](../../models/operations/ListAccountingAccountsResponse.md)**


## patchAccountingAccount

Update an account

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingAccountRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingAccountResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingAccount;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingAccountRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Status;
import com.unifiedapi.unifiedto.models.shared.Type;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchAccountingAccountRequest req = new PatchAccountingAccountRequest(
                "string",
                "string"){{
                accountingAccount = new AccountingAccount(
                    "string"){{
                    balance = 1931.26d;
                    bankAccountNumber = "string";
                    createdAt = OffsetDateTime.parse("2023-01-09T13:35:06.969Z");
                    currency = "Won";
                    customerDefinedCode = "string";
                    description = "Quality-focused multimedia implementation";
                    id = "<ID>";
                    raw = new PropertyAccountingAccountRaw(
);
                    status = Status.ARCHIVED;
                    type = Type.REVENUE;
                    updatedAt = OffsetDateTime.parse("2024-12-10T10:46:36.474Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingAccountResponse res = sdk.account.patchAccountingAccount(req);

            if (res.accountingAccount != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchAccountingAccountRequest](../../models/operations/PatchAccountingAccountRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAccountingAccountResponse](../../models/operations/PatchAccountingAccountResponse.md)**


## removeAccountingAccount

Remove an account

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingAccountRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingAccountResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingAccountRequest req = new RemoveAccountingAccountRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingAccountResponse res = sdk.account.removeAccountingAccount(req);

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingAccountRequest](../../models/operations/RemoveAccountingAccountRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAccountingAccountResponse](../../models/operations/RemoveAccountingAccountResponse.md)**


## updateAccountingAccount

Update an account

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingAccountRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingAccountResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingAccount;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingAccountRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Status;
import com.unifiedapi.unifiedto.models.shared.Type;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingAccountRequest req = new UpdateAccountingAccountRequest(
                "string",
                "string"){{
                accountingAccount = new AccountingAccount(
                    "string"){{
                    balance = 5954.09d;
                    bankAccountNumber = "string";
                    createdAt = OffsetDateTime.parse("2022-05-21T23:41:25.152Z");
                    currency = "Tanzanian Shilling";
                    customerDefinedCode = "string";
                    description = "Stand-alone grid-enabled model";
                    id = "<ID>";
                    raw = new PropertyAccountingAccountRaw(
);
                    status = Status.ACTIVE;
                    type = Type.BANK;
                    updatedAt = OffsetDateTime.parse("2022-04-02T20:00:03.765Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingAccountResponse res = sdk.account.updateAccountingAccount(req);

            if (res.accountingAccount != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingAccountRequest](../../models/operations/UpdateAccountingAccountRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAccountingAccountResponse](../../models/operations/UpdateAccountingAccountResponse.md)**

