# Invoice

## Overview

### Available Operations

* [createAccountingInvoice2](#createaccountinginvoice2) - Create an invoice
* [getAccountingInvoice2](#getaccountinginvoice2) - Retrieve an invoice
* [listAccountingInvoices2](#listaccountinginvoices2) - List all invoices
* [patchAccountingInvoice2](#patchaccountinginvoice2) - Update an invoice
* [removeAccountingInvoice2](#removeaccountinginvoice2) - Remove an invoice
* [updateAccountingInvoice2](#updateaccountinginvoice2) - Update an invoice

## createAccountingInvoice2

Create an invoice

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingInvoice2" method="post" path="/accounting/{connection_id}/invoice" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingInvoice2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingInvoice2Response;
import to.unified.unified_java_sdk.models.shared.AccountingInvoice;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingInvoice2Request req = CreateAccountingInvoice2Request.builder()
                .accountingInvoice(AccountingInvoice.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingInvoice2Response res = sdk.invoice().createAccountingInvoice2()
                .request(req)
                .call();

        if (res.accountingInvoice().isPresent()) {
            System.out.println(res.accountingInvoice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateAccountingInvoice2Request](../../models/operations/CreateAccountingInvoice2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateAccountingInvoice2Response](../../models/operations/CreateAccountingInvoice2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingInvoice2

Retrieve an invoice

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingInvoice2" method="get" path="/accounting/{connection_id}/invoice/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingInvoice2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingInvoice2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingInvoice2Request req = GetAccountingInvoice2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingInvoice2Response res = sdk.invoice().getAccountingInvoice2()
                .request(req)
                .call();

        if (res.accountingInvoice().isPresent()) {
            System.out.println(res.accountingInvoice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAccountingInvoice2Request](../../models/operations/GetAccountingInvoice2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAccountingInvoice2Response](../../models/operations/GetAccountingInvoice2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingInvoices2

List all invoices

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingInvoices2" method="get" path="/accounting/{connection_id}/invoice" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingInvoices2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingInvoices2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingInvoices2Request req = ListAccountingInvoices2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingInvoices2Response res = sdk.invoice().listAccountingInvoices2()
                .request(req)
                .call();

        if (res.accountingInvoices().isPresent()) {
            System.out.println(res.accountingInvoices().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListAccountingInvoices2Request](../../models/operations/ListAccountingInvoices2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListAccountingInvoices2Response](../../models/operations/ListAccountingInvoices2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingInvoice2

Update an invoice

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingInvoice2" method="patch" path="/accounting/{connection_id}/invoice/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingInvoice2Request;
import to.unified.unified_java_sdk.models.operations.PatchAccountingInvoice2Response;
import to.unified.unified_java_sdk.models.shared.AccountingInvoice;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingInvoice2Request req = PatchAccountingInvoice2Request.builder()
                .accountingInvoice(AccountingInvoice.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingInvoice2Response res = sdk.invoice().patchAccountingInvoice2()
                .request(req)
                .call();

        if (res.accountingInvoice().isPresent()) {
            System.out.println(res.accountingInvoice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchAccountingInvoice2Request](../../models/operations/PatchAccountingInvoice2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchAccountingInvoice2Response](../../models/operations/PatchAccountingInvoice2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingInvoice2

Remove an invoice

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingInvoice2" method="delete" path="/accounting/{connection_id}/invoice/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingInvoice2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingInvoice2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingInvoice2Request req = RemoveAccountingInvoice2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingInvoice2Response res = sdk.invoice().removeAccountingInvoice2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveAccountingInvoice2Request](../../models/operations/RemoveAccountingInvoice2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveAccountingInvoice2Response](../../models/operations/RemoveAccountingInvoice2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingInvoice2

Update an invoice

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingInvoice2" method="put" path="/accounting/{connection_id}/invoice/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingInvoice2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingInvoice2Response;
import to.unified.unified_java_sdk.models.shared.AccountingInvoice;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingInvoice2Request req = UpdateAccountingInvoice2Request.builder()
                .accountingInvoice(AccountingInvoice.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingInvoice2Response res = sdk.invoice().updateAccountingInvoice2()
                .request(req)
                .call();

        if (res.accountingInvoice().isPresent()) {
            System.out.println(res.accountingInvoice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateAccountingInvoice2Request](../../models/operations/UpdateAccountingInvoice2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateAccountingInvoice2Response](../../models/operations/UpdateAccountingInvoice2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |