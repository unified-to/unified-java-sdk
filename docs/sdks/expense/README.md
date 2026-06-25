# Expense

## Overview

### Available Operations

* [createAccountingExpense2](#createaccountingexpense2) - Create an expense
* [getAccountingExpense2](#getaccountingexpense2) - Retrieve an expense
* [listAccountingExpenses2](#listaccountingexpenses2) - List all expenses
* [patchAccountingExpense2](#patchaccountingexpense2) - Update an expense
* [removeAccountingExpense2](#removeaccountingexpense2) - Remove an expense
* [updateAccountingExpense2](#updateaccountingexpense2) - Update an expense

## createAccountingExpense2

Create an expense

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingExpense2" method="post" path="/accounting/{connection_id}/expense" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingExpense2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingExpense2Response;
import to.unified.unified_java_sdk.models.shared.AccountingExpense;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingExpense2Request req = CreateAccountingExpense2Request.builder()
                .accountingExpense(AccountingExpense.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingExpense2Response res = sdk.expense().createAccountingExpense2()
                .request(req)
                .call();

        if (res.accountingExpense().isPresent()) {
            System.out.println(res.accountingExpense().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateAccountingExpense2Request](../../models/operations/CreateAccountingExpense2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateAccountingExpense2Response](../../models/operations/CreateAccountingExpense2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingExpense2

Retrieve an expense

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingExpense2" method="get" path="/accounting/{connection_id}/expense/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingExpense2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingExpense2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingExpense2Request req = GetAccountingExpense2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingExpense2Response res = sdk.expense().getAccountingExpense2()
                .request(req)
                .call();

        if (res.accountingExpense().isPresent()) {
            System.out.println(res.accountingExpense().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAccountingExpense2Request](../../models/operations/GetAccountingExpense2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAccountingExpense2Response](../../models/operations/GetAccountingExpense2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingExpenses2

List all expenses

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingExpenses2" method="get" path="/accounting/{connection_id}/expense" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingExpenses2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingExpenses2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingExpenses2Request req = ListAccountingExpenses2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingExpenses2Response res = sdk.expense().listAccountingExpenses2()
                .request(req)
                .call();

        if (res.accountingExpenses().isPresent()) {
            System.out.println(res.accountingExpenses().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListAccountingExpenses2Request](../../models/operations/ListAccountingExpenses2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListAccountingExpenses2Response](../../models/operations/ListAccountingExpenses2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingExpense2

Update an expense

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingExpense2" method="patch" path="/accounting/{connection_id}/expense/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingExpense2Request;
import to.unified.unified_java_sdk.models.operations.PatchAccountingExpense2Response;
import to.unified.unified_java_sdk.models.shared.AccountingExpense;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingExpense2Request req = PatchAccountingExpense2Request.builder()
                .accountingExpense(AccountingExpense.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingExpense2Response res = sdk.expense().patchAccountingExpense2()
                .request(req)
                .call();

        if (res.accountingExpense().isPresent()) {
            System.out.println(res.accountingExpense().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchAccountingExpense2Request](../../models/operations/PatchAccountingExpense2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchAccountingExpense2Response](../../models/operations/PatchAccountingExpense2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingExpense2

Remove an expense

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingExpense2" method="delete" path="/accounting/{connection_id}/expense/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingExpense2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingExpense2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingExpense2Request req = RemoveAccountingExpense2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingExpense2Response res = sdk.expense().removeAccountingExpense2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveAccountingExpense2Request](../../models/operations/RemoveAccountingExpense2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveAccountingExpense2Response](../../models/operations/RemoveAccountingExpense2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingExpense2

Update an expense

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingExpense2" method="put" path="/accounting/{connection_id}/expense/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingExpense2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingExpense2Response;
import to.unified.unified_java_sdk.models.shared.AccountingExpense;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingExpense2Request req = UpdateAccountingExpense2Request.builder()
                .accountingExpense(AccountingExpense.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingExpense2Response res = sdk.expense().updateAccountingExpense2()
                .request(req)
                .call();

        if (res.accountingExpense().isPresent()) {
            System.out.println(res.accountingExpense().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateAccountingExpense2Request](../../models/operations/UpdateAccountingExpense2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateAccountingExpense2Response](../../models/operations/UpdateAccountingExpense2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |