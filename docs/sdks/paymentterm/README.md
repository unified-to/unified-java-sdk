# Paymentterm

## Overview

### Available Operations

* [createAccountingPaymentterm](#createaccountingpaymentterm) - Create a paymentterm
* [getAccountingPaymentterm](#getaccountingpaymentterm) - Retrieve a paymentterm
* [listAccountingPaymentterms](#listaccountingpaymentterms) - List all paymentterms
* [patchAccountingPaymentterm](#patchaccountingpaymentterm) - Update a paymentterm
* [removeAccountingPaymentterm](#removeaccountingpaymentterm) - Remove a paymentterm
* [updateAccountingPaymentterm](#updateaccountingpaymentterm) - Update a paymentterm

## createAccountingPaymentterm

Creates a AccountingPaymentterm. Provide the unified AccountingPaymentterm fields in the request body; they are mapped to the provider's API. Returns the created AccountingPaymentterm.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingPaymentterm" method="post" path="/accounting/{connection_id}/paymentterm" example="accounting_paymentterm" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingPaymenttermRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingPaymenttermResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingPaymenttermRequest req = CreateAccountingPaymenttermRequest.builder()
                .accountingPaymentterm(AccountingPaymentterm.builder()
                    .category(Category.STANDARD)
                    .createdAt(OffsetDateTime.parse("2021-08-22T22:42:42.265Z"))
                    .dayOfMonthDue(4d)
                    .description("Cogito pecco eos cultura.")
                    .discountDayOfMonth(13d)
                    .discountDays(4d)
                    .discountPercent(5d)
                    .dueDays(57d)
                    .dueNextMonthDays(9d)
                    .id("7c29eff5-7713-4c85-9a46-cf91cda71cf5")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Net 30")
                    .type(AccountingPaymenttermType.NET15)
                    .updatedAt(OffsetDateTime.parse("2026-01-13T11:47:27.973Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingPaymenttermResponse res = sdk.paymentterm().createAccountingPaymentterm()
                .request(req)
                .call();

        if (res.accountingPaymentterm().isPresent()) {
            System.out.println(res.accountingPaymentterm().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [CreateAccountingPaymenttermRequest](../../models/operations/CreateAccountingPaymenttermRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[CreateAccountingPaymenttermResponse](../../models/operations/CreateAccountingPaymenttermResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingPaymentterm

Retrieves a single AccountingPaymentterm by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingPaymentterm" method="get" path="/accounting/{connection_id}/paymentterm/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingPaymenttermRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingPaymenttermResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingPaymenttermRequest req = GetAccountingPaymenttermRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingPaymenttermResponse res = sdk.paymentterm().getAccountingPaymentterm()
                .request(req)
                .call();

        if (res.accountingPaymentterm().isPresent()) {
            System.out.println(res.accountingPaymentterm().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetAccountingPaymenttermRequest](../../models/operations/GetAccountingPaymenttermRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetAccountingPaymenttermResponse](../../models/operations/GetAccountingPaymenttermResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingPaymentterms

Returns a list of AccountingPaymentterms. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingPaymentterms" method="get" path="/accounting/{connection_id}/paymentterm" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingPaymenttermsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingPaymenttermsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingPaymenttermsRequest req = ListAccountingPaymenttermsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingPaymenttermsResponse res = sdk.paymentterm().listAccountingPaymentterms()
                .request(req)
                .call();

        if (res.accountingPaymentterms().isPresent()) {
            System.out.println(res.accountingPaymentterms().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListAccountingPaymenttermsRequest](../../models/operations/ListAccountingPaymenttermsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListAccountingPaymenttermsResponse](../../models/operations/ListAccountingPaymenttermsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingPaymentterm

Updates the AccountingPaymentterm identified by `id`. Provide the unified AccountingPaymentterm fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingPaymentterm" method="patch" path="/accounting/{connection_id}/paymentterm/{id}" example="accounting_paymentterm" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingPaymenttermRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingPaymenttermResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingPaymenttermRequest req = PatchAccountingPaymenttermRequest.builder()
                .accountingPaymentterm(AccountingPaymentterm.builder()
                    .category(Category.STANDARD)
                    .createdAt(OffsetDateTime.parse("2021-08-22T22:42:42.265Z"))
                    .dayOfMonthDue(4d)
                    .description("Cogito pecco eos cultura.")
                    .discountDayOfMonth(13d)
                    .discountDays(4d)
                    .discountPercent(5d)
                    .dueDays(57d)
                    .dueNextMonthDays(9d)
                    .id("a8f42d55-7f3d-4967-8d1c-62939b9e20f7")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Net 30")
                    .type(AccountingPaymenttermType.NET15)
                    .updatedAt(OffsetDateTime.parse("2026-01-13T11:47:27.985Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingPaymenttermResponse res = sdk.paymentterm().patchAccountingPaymentterm()
                .request(req)
                .call();

        if (res.accountingPaymentterm().isPresent()) {
            System.out.println(res.accountingPaymentterm().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [PatchAccountingPaymenttermRequest](../../models/operations/PatchAccountingPaymenttermRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[PatchAccountingPaymenttermResponse](../../models/operations/PatchAccountingPaymenttermResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingPaymentterm

Deletes the AccountingPaymentterm identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingPaymentterm" method="delete" path="/accounting/{connection_id}/paymentterm/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingPaymenttermRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingPaymenttermResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingPaymenttermRequest req = RemoveAccountingPaymenttermRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingPaymenttermResponse res = sdk.paymentterm().removeAccountingPaymentterm()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [RemoveAccountingPaymenttermRequest](../../models/operations/RemoveAccountingPaymenttermRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[RemoveAccountingPaymenttermResponse](../../models/operations/RemoveAccountingPaymenttermResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingPaymentterm

Updates the AccountingPaymentterm identified by `id`. Provide the unified AccountingPaymentterm fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingPaymentterm" method="put" path="/accounting/{connection_id}/paymentterm/{id}" example="accounting_paymentterm" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingPaymenttermRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingPaymenttermResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingPaymenttermRequest req = UpdateAccountingPaymenttermRequest.builder()
                .accountingPaymentterm(AccountingPaymentterm.builder()
                    .category(Category.STANDARD)
                    .createdAt(OffsetDateTime.parse("2021-08-22T22:42:42.265Z"))
                    .dayOfMonthDue(4d)
                    .description("Cogito pecco eos cultura.")
                    .discountDayOfMonth(13d)
                    .discountDays(4d)
                    .discountPercent(5d)
                    .dueDays(57d)
                    .dueNextMonthDays(9d)
                    .id("a8f42d55-7f3d-4967-8d1c-62939b9e20f7")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Net 30")
                    .type(AccountingPaymenttermType.NET15)
                    .updatedAt(OffsetDateTime.parse("2026-01-13T11:47:27.985Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingPaymenttermResponse res = sdk.paymentterm().updateAccountingPaymentterm()
                .request(req)
                .call();

        if (res.accountingPaymentterm().isPresent()) {
            System.out.println(res.accountingPaymentterm().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UpdateAccountingPaymenttermRequest](../../models/operations/UpdateAccountingPaymenttermRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateAccountingPaymenttermResponse](../../models/operations/UpdateAccountingPaymenttermResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |