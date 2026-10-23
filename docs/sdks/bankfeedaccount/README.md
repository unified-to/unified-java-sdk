# Bankfeedaccount

## Overview

### Available Operations

* [createAccountingBankfeedaccount](#createaccountingbankfeedaccount) - Create a bankfeedaccount
* [getAccountingBankfeedaccount](#getaccountingbankfeedaccount) - Retrieve a bankfeedaccount
* [listAccountingBankfeedaccounts](#listaccountingbankfeedaccounts) - List all bankfeedaccounts
* [patchAccountingBankfeedaccount](#patchaccountingbankfeedaccount) - Update a bankfeedaccount
* [removeAccountingBankfeedaccount](#removeaccountingbankfeedaccount) - Remove a bankfeedaccount
* [updateAccountingBankfeedaccount](#updateaccountingbankfeedaccount) - Update a bankfeedaccount

## createAccountingBankfeedaccount

Creates a AccountingBankfeedaccount. Provide the unified AccountingBankfeedaccount fields in the request body; they are mapped to the provider's API. Returns the created AccountingBankfeedaccount.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingBankfeedaccount" method="post" path="/accounting/{connection_id}/bankfeedaccount" example="accounting_bankfeedaccount" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingBankfeedaccountRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingBankfeedaccountResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingBankfeedaccountRequest req = CreateAccountingBankfeedaccountRequest.builder()
                .accountingBankfeedaccount(AccountingBankfeedaccount.builder()
                    .accountNumber("30369722")
                    .accountNumberLast4("9722")
                    .accountType(AccountType.LOAN)
                    .balance(49437d)
                    .bankName("Wells Fargo")
                    .createdAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .currency("AUD")
                    .feedStartAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .id("7a75e9bc-de76-4aa7-ac48-1d94745a678a")
                    .metadata(List.of())
                    .name("Corwin, Donnelly and Connelly Checking")
                    .routingNumber("694667752")
                    .status(AccountingBankfeedaccountStatus.ACTIVE)
                    .updatedAt(OffsetDateTime.parse("2024-04-24T13:42:27.043Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingBankfeedaccountResponse res = sdk.bankfeedaccount().createAccountingBankfeedaccount()
                .request(req)
                .call();

        if (res.accountingBankfeedaccount().isPresent()) {
            System.out.println(res.accountingBankfeedaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [CreateAccountingBankfeedaccountRequest](../../models/operations/CreateAccountingBankfeedaccountRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[CreateAccountingBankfeedaccountResponse](../../models/operations/CreateAccountingBankfeedaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingBankfeedaccount

Retrieves a single AccountingBankfeedaccount by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingBankfeedaccount" method="get" path="/accounting/{connection_id}/bankfeedaccount/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingBankfeedaccountRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingBankfeedaccountResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingBankfeedaccountRequest req = GetAccountingBankfeedaccountRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingBankfeedaccountResponse res = sdk.bankfeedaccount().getAccountingBankfeedaccount()
                .request(req)
                .call();

        if (res.accountingBankfeedaccount().isPresent()) {
            System.out.println(res.accountingBankfeedaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [GetAccountingBankfeedaccountRequest](../../models/operations/GetAccountingBankfeedaccountRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[GetAccountingBankfeedaccountResponse](../../models/operations/GetAccountingBankfeedaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingBankfeedaccounts

Returns a list of AccountingBankfeedaccounts. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingBankfeedaccounts" method="get" path="/accounting/{connection_id}/bankfeedaccount" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingBankfeedaccountsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingBankfeedaccountsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingBankfeedaccountsRequest req = ListAccountingBankfeedaccountsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingBankfeedaccountsResponse res = sdk.bankfeedaccount().listAccountingBankfeedaccounts()
                .request(req)
                .call();

        if (res.accountingBankfeedaccounts().isPresent()) {
            System.out.println(res.accountingBankfeedaccounts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [ListAccountingBankfeedaccountsRequest](../../models/operations/ListAccountingBankfeedaccountsRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[ListAccountingBankfeedaccountsResponse](../../models/operations/ListAccountingBankfeedaccountsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingBankfeedaccount

Updates the AccountingBankfeedaccount identified by `id`. Provide the unified AccountingBankfeedaccount fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingBankfeedaccount" method="patch" path="/accounting/{connection_id}/bankfeedaccount/{id}" example="accounting_bankfeedaccount" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingBankfeedaccountRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingBankfeedaccountResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingBankfeedaccountRequest req = PatchAccountingBankfeedaccountRequest.builder()
                .accountingBankfeedaccount(AccountingBankfeedaccount.builder()
                    .accountNumber("30369722")
                    .accountNumberLast4("9722")
                    .accountType(AccountType.LOAN)
                    .balance(49437d)
                    .bankName("Wells Fargo")
                    .createdAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .currency("AUD")
                    .feedStartAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .id("54caa285-29f8-4de1-8512-edc70053fccf")
                    .metadata(List.of())
                    .name("Corwin, Donnelly and Connelly Checking")
                    .routingNumber("694667752")
                    .status(AccountingBankfeedaccountStatus.ACTIVE)
                    .updatedAt(OffsetDateTime.parse("2024-04-24T13:42:27.048Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingBankfeedaccountResponse res = sdk.bankfeedaccount().patchAccountingBankfeedaccount()
                .request(req)
                .call();

        if (res.accountingBankfeedaccount().isPresent()) {
            System.out.println(res.accountingBankfeedaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [PatchAccountingBankfeedaccountRequest](../../models/operations/PatchAccountingBankfeedaccountRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[PatchAccountingBankfeedaccountResponse](../../models/operations/PatchAccountingBankfeedaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingBankfeedaccount

Deletes the AccountingBankfeedaccount identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingBankfeedaccount" method="delete" path="/accounting/{connection_id}/bankfeedaccount/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingBankfeedaccountRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingBankfeedaccountResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingBankfeedaccountRequest req = RemoveAccountingBankfeedaccountRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingBankfeedaccountResponse res = sdk.bankfeedaccount().removeAccountingBankfeedaccount()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [RemoveAccountingBankfeedaccountRequest](../../models/operations/RemoveAccountingBankfeedaccountRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[RemoveAccountingBankfeedaccountResponse](../../models/operations/RemoveAccountingBankfeedaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingBankfeedaccount

Updates the AccountingBankfeedaccount identified by `id`. Provide the unified AccountingBankfeedaccount fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingBankfeedaccount" method="put" path="/accounting/{connection_id}/bankfeedaccount/{id}" example="accounting_bankfeedaccount" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingBankfeedaccountRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingBankfeedaccountResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingBankfeedaccountRequest req = UpdateAccountingBankfeedaccountRequest.builder()
                .accountingBankfeedaccount(AccountingBankfeedaccount.builder()
                    .accountNumber("30369722")
                    .accountNumberLast4("9722")
                    .accountType(AccountType.LOAN)
                    .balance(49437d)
                    .bankName("Wells Fargo")
                    .createdAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .currency("AUD")
                    .feedStartAt(OffsetDateTime.parse("2022-10-31T16:42:19.277Z"))
                    .id("54caa285-29f8-4de1-8512-edc70053fccf")
                    .metadata(List.of())
                    .name("Corwin, Donnelly and Connelly Checking")
                    .routingNumber("694667752")
                    .status(AccountingBankfeedaccountStatus.ACTIVE)
                    .updatedAt(OffsetDateTime.parse("2024-04-24T13:42:27.048Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingBankfeedaccountResponse res = sdk.bankfeedaccount().updateAccountingBankfeedaccount()
                .request(req)
                .call();

        if (res.accountingBankfeedaccount().isPresent()) {
            System.out.println(res.accountingBankfeedaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [UpdateAccountingBankfeedaccountRequest](../../models/operations/UpdateAccountingBankfeedaccountRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[UpdateAccountingBankfeedaccountResponse](../../models/operations/UpdateAccountingBankfeedaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |