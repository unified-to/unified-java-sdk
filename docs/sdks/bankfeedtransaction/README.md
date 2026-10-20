# Bankfeedtransaction

## Overview

### Available Operations

* [createAccountingBankfeedtransaction](#createaccountingbankfeedtransaction) - Create a bankfeedtransaction
* [getAccountingBankfeedtransaction](#getaccountingbankfeedtransaction) - Retrieve a bankfeedtransaction
* [listAccountingBankfeedtransactions](#listaccountingbankfeedtransactions) - List all bankfeedtransactions
* [patchAccountingBankfeedtransaction](#patchaccountingbankfeedtransaction) - Update a bankfeedtransaction
* [removeAccountingBankfeedtransaction](#removeaccountingbankfeedtransaction) - Remove a bankfeedtransaction
* [updateAccountingBankfeedtransaction](#updateaccountingbankfeedtransaction) - Update a bankfeedtransaction

## createAccountingBankfeedtransaction

Create a bankfeedtransaction

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingBankfeedtransaction" method="post" path="/accounting/{connection_id}/bankfeedtransaction" example="accounting_bankfeedtransaction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingBankfeedtransactionRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingBankfeedtransactionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingBankfeedtransactionRequest req = CreateAccountingBankfeedtransactionRequest.builder()
                .accountingBankfeedtransaction(AccountingBankfeedtransaction.builder()
                    .amount(60889d)
                    .bankCategory("Clothing")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-03-24T23:41:08.374Z"))
                    .currency("CAD")
                    .description("Payment of SRD 92.72 for withdrawal at Halvorson - Ziemann, processed with card ending ****3731 linked to account ***7781.")
                    .id("4accf641-e3ef-4774-9084-6728a2d60223")
                    .isPending(true)
                    .merchantName("Buckridge - Feest")
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2025-04-14T00:34:14.074Z"))
                    .reference("79574105")
                    .transactionAt(OffsetDateTime.parse("2022-07-30T05:57:29.892Z"))
                    .type(AccountingBankfeedtransactionType.CREDIT)
                    .updatedAt(OffsetDateTime.parse("2022-05-25T00:40:59.883Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingBankfeedtransactionResponse res = sdk.bankfeedtransaction().createAccountingBankfeedtransaction()
                .request(req)
                .call();

        if (res.accountingBankfeedtransaction().isPresent()) {
            System.out.println(res.accountingBankfeedtransaction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [CreateAccountingBankfeedtransactionRequest](../../models/operations/CreateAccountingBankfeedtransactionRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[CreateAccountingBankfeedtransactionResponse](../../models/operations/CreateAccountingBankfeedtransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingBankfeedtransaction

Retrieve a bankfeedtransaction

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingBankfeedtransaction" method="get" path="/accounting/{connection_id}/bankfeedtransaction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingBankfeedtransactionRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingBankfeedtransactionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingBankfeedtransactionRequest req = GetAccountingBankfeedtransactionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingBankfeedtransactionResponse res = sdk.bankfeedtransaction().getAccountingBankfeedtransaction()
                .request(req)
                .call();

        if (res.accountingBankfeedtransaction().isPresent()) {
            System.out.println(res.accountingBankfeedtransaction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [GetAccountingBankfeedtransactionRequest](../../models/operations/GetAccountingBankfeedtransactionRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[GetAccountingBankfeedtransactionResponse](../../models/operations/GetAccountingBankfeedtransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingBankfeedtransactions

List all bankfeedtransactions

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingBankfeedtransactions" method="get" path="/accounting/{connection_id}/bankfeedtransaction" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingBankfeedtransactionsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingBankfeedtransactionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingBankfeedtransactionsRequest req = ListAccountingBankfeedtransactionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingBankfeedtransactionsResponse res = sdk.bankfeedtransaction().listAccountingBankfeedtransactions()
                .request(req)
                .call();

        if (res.accountingBankfeedtransactions().isPresent()) {
            System.out.println(res.accountingBankfeedtransactions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [ListAccountingBankfeedtransactionsRequest](../../models/operations/ListAccountingBankfeedtransactionsRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |

### Response

**[ListAccountingBankfeedtransactionsResponse](../../models/operations/ListAccountingBankfeedtransactionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingBankfeedtransaction

Update a bankfeedtransaction

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingBankfeedtransaction" method="patch" path="/accounting/{connection_id}/bankfeedtransaction/{id}" example="accounting_bankfeedtransaction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingBankfeedtransactionRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingBankfeedtransactionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingBankfeedtransactionRequest req = PatchAccountingBankfeedtransactionRequest.builder()
                .accountingBankfeedtransaction(AccountingBankfeedtransaction.builder()
                    .amount(60889d)
                    .bankCategory("Clothing")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-03-24T23:41:08.374Z"))
                    .currency("CAD")
                    .description("Payment of SRD 92.72 for withdrawal at Halvorson - Ziemann, processed with card ending ****3731 linked to account ***7781.")
                    .id("493ce2cd-7f9e-411d-b462-b3e5816d97cc")
                    .isPending(true)
                    .merchantName("Buckridge - Feest")
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2025-04-14T00:34:14.086Z"))
                    .reference("79574105")
                    .transactionAt(OffsetDateTime.parse("2022-07-30T05:57:29.893Z"))
                    .type(AccountingBankfeedtransactionType.CREDIT)
                    .updatedAt(OffsetDateTime.parse("2022-05-25T00:40:59.883Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingBankfeedtransactionResponse res = sdk.bankfeedtransaction().patchAccountingBankfeedtransaction()
                .request(req)
                .call();

        if (res.accountingBankfeedtransaction().isPresent()) {
            System.out.println(res.accountingBankfeedtransaction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [PatchAccountingBankfeedtransactionRequest](../../models/operations/PatchAccountingBankfeedtransactionRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |

### Response

**[PatchAccountingBankfeedtransactionResponse](../../models/operations/PatchAccountingBankfeedtransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingBankfeedtransaction

Remove a bankfeedtransaction

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingBankfeedtransaction" method="delete" path="/accounting/{connection_id}/bankfeedtransaction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingBankfeedtransactionRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingBankfeedtransactionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingBankfeedtransactionRequest req = RemoveAccountingBankfeedtransactionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingBankfeedtransactionResponse res = sdk.bankfeedtransaction().removeAccountingBankfeedtransaction()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [RemoveAccountingBankfeedtransactionRequest](../../models/operations/RemoveAccountingBankfeedtransactionRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[RemoveAccountingBankfeedtransactionResponse](../../models/operations/RemoveAccountingBankfeedtransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingBankfeedtransaction

Update a bankfeedtransaction

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingBankfeedtransaction" method="put" path="/accounting/{connection_id}/bankfeedtransaction/{id}" example="accounting_bankfeedtransaction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingBankfeedtransactionRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingBankfeedtransactionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingBankfeedtransactionRequest req = UpdateAccountingBankfeedtransactionRequest.builder()
                .accountingBankfeedtransaction(AccountingBankfeedtransaction.builder()
                    .amount(60889d)
                    .bankCategory("Clothing")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-03-24T23:41:08.374Z"))
                    .currency("CAD")
                    .description("Payment of SRD 92.72 for withdrawal at Halvorson - Ziemann, processed with card ending ****3731 linked to account ***7781.")
                    .id("493ce2cd-7f9e-411d-b462-b3e5816d97cc")
                    .isPending(true)
                    .merchantName("Buckridge - Feest")
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2025-04-14T00:34:14.086Z"))
                    .reference("79574105")
                    .transactionAt(OffsetDateTime.parse("2022-07-30T05:57:29.893Z"))
                    .type(AccountingBankfeedtransactionType.CREDIT)
                    .updatedAt(OffsetDateTime.parse("2022-05-25T00:40:59.883Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingBankfeedtransactionResponse res = sdk.bankfeedtransaction().updateAccountingBankfeedtransaction()
                .request(req)
                .call();

        if (res.accountingBankfeedtransaction().isPresent()) {
            System.out.println(res.accountingBankfeedtransaction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [UpdateAccountingBankfeedtransactionRequest](../../models/operations/UpdateAccountingBankfeedtransactionRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[UpdateAccountingBankfeedtransactionResponse](../../models/operations/UpdateAccountingBankfeedtransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |