# Bill

## Overview

### Available Operations

* [createAccountingBill2](#createaccountingbill2) - Create a bill
* [getAccountingBill2](#getaccountingbill2) - Retrieve a bill
* [listAccountingBills2](#listaccountingbills2) - List all bills
* [patchAccountingBill2](#patchaccountingbill2) - Update a bill
* [removeAccountingBill2](#removeaccountingbill2) - Remove a bill
* [updateAccountingBill2](#updateaccountingbill2) - Update a bill

## createAccountingBill2

Create a bill

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingBill2" method="post" path="/accounting/{connection_id}/bill" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingBill2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingBill2Response;
import to.unified.unified_java_sdk.models.shared.AccountingBill;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingBill2Request req = CreateAccountingBill2Request.builder()
                .accountingBill(AccountingBill.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingBill2Response res = sdk.bill().createAccountingBill2()
                .request(req)
                .call();

        if (res.accountingBill().isPresent()) {
            System.out.println(res.accountingBill().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateAccountingBill2Request](../../models/operations/CreateAccountingBill2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateAccountingBill2Response](../../models/operations/CreateAccountingBill2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingBill2

Retrieve a bill

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingBill2" method="get" path="/accounting/{connection_id}/bill/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingBill2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingBill2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingBill2Request req = GetAccountingBill2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingBill2Response res = sdk.bill().getAccountingBill2()
                .request(req)
                .call();

        if (res.accountingBill().isPresent()) {
            System.out.println(res.accountingBill().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAccountingBill2Request](../../models/operations/GetAccountingBill2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAccountingBill2Response](../../models/operations/GetAccountingBill2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingBills2

List all bills

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingBills2" method="get" path="/accounting/{connection_id}/bill" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingBills2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingBills2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingBills2Request req = ListAccountingBills2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingBills2Response res = sdk.bill().listAccountingBills2()
                .request(req)
                .call();

        if (res.accountingBills().isPresent()) {
            System.out.println(res.accountingBills().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListAccountingBills2Request](../../models/operations/ListAccountingBills2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListAccountingBills2Response](../../models/operations/ListAccountingBills2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingBill2

Update a bill

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingBill2" method="patch" path="/accounting/{connection_id}/bill/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingBill2Request;
import to.unified.unified_java_sdk.models.operations.PatchAccountingBill2Response;
import to.unified.unified_java_sdk.models.shared.AccountingBill;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingBill2Request req = PatchAccountingBill2Request.builder()
                .accountingBill(AccountingBill.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingBill2Response res = sdk.bill().patchAccountingBill2()
                .request(req)
                .call();

        if (res.accountingBill().isPresent()) {
            System.out.println(res.accountingBill().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchAccountingBill2Request](../../models/operations/PatchAccountingBill2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchAccountingBill2Response](../../models/operations/PatchAccountingBill2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingBill2

Remove a bill

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingBill2" method="delete" path="/accounting/{connection_id}/bill/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingBill2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingBill2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingBill2Request req = RemoveAccountingBill2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingBill2Response res = sdk.bill().removeAccountingBill2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveAccountingBill2Request](../../models/operations/RemoveAccountingBill2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveAccountingBill2Response](../../models/operations/RemoveAccountingBill2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingBill2

Update a bill

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingBill2" method="put" path="/accounting/{connection_id}/bill/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingBill2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingBill2Response;
import to.unified.unified_java_sdk.models.shared.AccountingBill;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingBill2Request req = UpdateAccountingBill2Request.builder()
                .accountingBill(AccountingBill.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingBill2Response res = sdk.bill().updateAccountingBill2()
                .request(req)
                .call();

        if (res.accountingBill().isPresent()) {
            System.out.println(res.accountingBill().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateAccountingBill2Request](../../models/operations/UpdateAccountingBill2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateAccountingBill2Response](../../models/operations/UpdateAccountingBill2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |