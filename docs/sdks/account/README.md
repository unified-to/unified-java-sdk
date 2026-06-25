# Account

## Overview

### Available Operations

* [createAccountingAccount2](#createaccountingaccount2) - Create an account
* [getAccountingAccount2](#getaccountingaccount2) - Retrieve an account
* [listAccountingAccounts2](#listaccountingaccounts2) - List all accounts
* [patchAccountingAccount2](#patchaccountingaccount2) - Update an account
* [removeAccountingAccount2](#removeaccountingaccount2) - Remove an account
* [updateAccountingAccount2](#updateaccountingaccount2) - Update an account

## createAccountingAccount2

Create an account

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingAccount2" method="post" path="/accounting/{connection_id}/account" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccount2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccount2Response;
import to.unified.unified_java_sdk.models.shared.AccountingAccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingAccount2Request req = CreateAccountingAccount2Request.builder()
                .accountingAccount(AccountingAccount.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingAccount2Response res = sdk.account().createAccountingAccount2()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            System.out.println(res.accountingAccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateAccountingAccount2Request](../../models/operations/CreateAccountingAccount2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateAccountingAccount2Response](../../models/operations/CreateAccountingAccount2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingAccount2

Retrieve an account

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingAccount2" method="get" path="/accounting/{connection_id}/account/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingAccount2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingAccount2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingAccount2Request req = GetAccountingAccount2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingAccount2Response res = sdk.account().getAccountingAccount2()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            System.out.println(res.accountingAccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAccountingAccount2Request](../../models/operations/GetAccountingAccount2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAccountingAccount2Response](../../models/operations/GetAccountingAccount2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingAccounts2

List all accounts

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingAccounts2" method="get" path="/accounting/{connection_id}/account" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingAccounts2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingAccounts2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingAccounts2Request req = ListAccountingAccounts2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingAccounts2Response res = sdk.account().listAccountingAccounts2()
                .request(req)
                .call();

        if (res.accountingAccounts().isPresent()) {
            System.out.println(res.accountingAccounts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListAccountingAccounts2Request](../../models/operations/ListAccountingAccounts2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListAccountingAccounts2Response](../../models/operations/ListAccountingAccounts2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingAccount2

Update an account

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingAccount2" method="patch" path="/accounting/{connection_id}/account/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingAccount2Request;
import to.unified.unified_java_sdk.models.operations.PatchAccountingAccount2Response;
import to.unified.unified_java_sdk.models.shared.AccountingAccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingAccount2Request req = PatchAccountingAccount2Request.builder()
                .accountingAccount(AccountingAccount.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingAccount2Response res = sdk.account().patchAccountingAccount2()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            System.out.println(res.accountingAccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchAccountingAccount2Request](../../models/operations/PatchAccountingAccount2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchAccountingAccount2Response](../../models/operations/PatchAccountingAccount2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingAccount2

Remove an account

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingAccount2" method="delete" path="/accounting/{connection_id}/account/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingAccount2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingAccount2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingAccount2Request req = RemoveAccountingAccount2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingAccount2Response res = sdk.account().removeAccountingAccount2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveAccountingAccount2Request](../../models/operations/RemoveAccountingAccount2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveAccountingAccount2Response](../../models/operations/RemoveAccountingAccount2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingAccount2

Update an account

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingAccount2" method="put" path="/accounting/{connection_id}/account/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingAccount2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingAccount2Response;
import to.unified.unified_java_sdk.models.shared.AccountingAccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingAccount2Request req = UpdateAccountingAccount2Request.builder()
                .accountingAccount(AccountingAccount.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingAccount2Response res = sdk.account().updateAccountingAccount2()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            System.out.println(res.accountingAccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateAccountingAccount2Request](../../models/operations/UpdateAccountingAccount2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateAccountingAccount2Response](../../models/operations/UpdateAccountingAccount2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |