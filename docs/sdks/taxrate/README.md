# Taxrate

## Overview

### Available Operations

* [createAccountingTaxrate2](#createaccountingtaxrate2) - Create a taxrate
* [getAccountingTaxrate2](#getaccountingtaxrate2) - Retrieve a taxrate
* [listAccountingTaxrates2](#listaccountingtaxrates2) - List all taxrates
* [patchAccountingTaxrate2](#patchaccountingtaxrate2) - Update a taxrate
* [removeAccountingTaxrate2](#removeaccountingtaxrate2) - Remove a taxrate
* [updateAccountingTaxrate2](#updateaccountingtaxrate2) - Update a taxrate

## createAccountingTaxrate2

Create a taxrate

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingTaxrate2" method="post" path="/accounting/{connection_id}/taxrate" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingTaxrate2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingTaxrate2Response;
import to.unified.unified_java_sdk.models.shared.AccountingTaxrate;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingTaxrate2Request req = CreateAccountingTaxrate2Request.builder()
                .accountingTaxrate(AccountingTaxrate.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingTaxrate2Response res = sdk.taxrate().createAccountingTaxrate2()
                .request(req)
                .call();

        if (res.accountingTaxrate().isPresent()) {
            System.out.println(res.accountingTaxrate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateAccountingTaxrate2Request](../../models/operations/CreateAccountingTaxrate2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateAccountingTaxrate2Response](../../models/operations/CreateAccountingTaxrate2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingTaxrate2

Retrieve a taxrate

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingTaxrate2" method="get" path="/accounting/{connection_id}/taxrate/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingTaxrate2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingTaxrate2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingTaxrate2Request req = GetAccountingTaxrate2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingTaxrate2Response res = sdk.taxrate().getAccountingTaxrate2()
                .request(req)
                .call();

        if (res.accountingTaxrate().isPresent()) {
            System.out.println(res.accountingTaxrate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAccountingTaxrate2Request](../../models/operations/GetAccountingTaxrate2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAccountingTaxrate2Response](../../models/operations/GetAccountingTaxrate2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingTaxrates2

List all taxrates

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingTaxrates2" method="get" path="/accounting/{connection_id}/taxrate" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingTaxrates2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingTaxrates2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingTaxrates2Request req = ListAccountingTaxrates2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingTaxrates2Response res = sdk.taxrate().listAccountingTaxrates2()
                .request(req)
                .call();

        if (res.accountingTaxrates().isPresent()) {
            System.out.println(res.accountingTaxrates().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListAccountingTaxrates2Request](../../models/operations/ListAccountingTaxrates2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListAccountingTaxrates2Response](../../models/operations/ListAccountingTaxrates2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingTaxrate2

Update a taxrate

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingTaxrate2" method="patch" path="/accounting/{connection_id}/taxrate/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingTaxrate2Request;
import to.unified.unified_java_sdk.models.operations.PatchAccountingTaxrate2Response;
import to.unified.unified_java_sdk.models.shared.AccountingTaxrate;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingTaxrate2Request req = PatchAccountingTaxrate2Request.builder()
                .accountingTaxrate(AccountingTaxrate.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingTaxrate2Response res = sdk.taxrate().patchAccountingTaxrate2()
                .request(req)
                .call();

        if (res.accountingTaxrate().isPresent()) {
            System.out.println(res.accountingTaxrate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchAccountingTaxrate2Request](../../models/operations/PatchAccountingTaxrate2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchAccountingTaxrate2Response](../../models/operations/PatchAccountingTaxrate2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingTaxrate2

Remove a taxrate

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingTaxrate2" method="delete" path="/accounting/{connection_id}/taxrate/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingTaxrate2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingTaxrate2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingTaxrate2Request req = RemoveAccountingTaxrate2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingTaxrate2Response res = sdk.taxrate().removeAccountingTaxrate2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveAccountingTaxrate2Request](../../models/operations/RemoveAccountingTaxrate2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveAccountingTaxrate2Response](../../models/operations/RemoveAccountingTaxrate2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingTaxrate2

Update a taxrate

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingTaxrate2" method="put" path="/accounting/{connection_id}/taxrate/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingTaxrate2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingTaxrate2Response;
import to.unified.unified_java_sdk.models.shared.AccountingTaxrate;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingTaxrate2Request req = UpdateAccountingTaxrate2Request.builder()
                .accountingTaxrate(AccountingTaxrate.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingTaxrate2Response res = sdk.taxrate().updateAccountingTaxrate2()
                .request(req)
                .call();

        if (res.accountingTaxrate().isPresent()) {
            System.out.println(res.accountingTaxrate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateAccountingTaxrate2Request](../../models/operations/UpdateAccountingTaxrate2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateAccountingTaxrate2Response](../../models/operations/UpdateAccountingTaxrate2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |