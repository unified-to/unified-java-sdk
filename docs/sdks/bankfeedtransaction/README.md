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
                    .accountId("b7dc4175-1368-4b89-a700-d621b6666648")
                    .amount(60889d)
                    .bankCategory("Games")
                    .bankfeedaccountId("34c1d05f-5b62-4bcd-9121-3be8b720941f")
                    .categoryIds(List.of())
                    .contactId("1ef58ebe-f9c9-46f6-9d9c-2df2658503be")
                    .createdAt(OffsetDateTime.parse("2022-03-24T23:41:08.374Z"))
                    .currency("SRD")
                    .description("payment transaction at McLaughlin - Schaden using card ending with ****8233 for DOP 574.03 in account ***9523.")
                    .id("068dc47b-9498-4fae-b399-9c793b4f4ca1")
                    .isPending(true)
                    .merchantName("Reichert, Erdman and Tillman")
                    .postedAt(OffsetDateTime.parse("2025-03-25T03:24:43.389Z"))
                    .reference("93642593")
                    .transactionAt(OffsetDateTime.parse("2022-07-27T23:32:53.000Z"))
                    .type(AccountingBankfeedtransactionType.CREDIT)
                    .updatedAt(OffsetDateTime.parse("2022-05-23T22:35:06.520Z"))
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
                    .accountId("b7dc4175-1368-4b89-a700-d621b6666648")
                    .amount(60889d)
                    .bankCategory("Games")
                    .bankfeedaccountId("34c1d05f-5b62-4bcd-9121-3be8b720941f")
                    .categoryIds(List.of())
                    .contactId("1ef58ebe-f9c9-46f6-9d9c-2df2658503be")
                    .createdAt(OffsetDateTime.parse("2022-03-24T23:41:08.374Z"))
                    .currency("SRD")
                    .description("payment transaction at McLaughlin - Schaden using card ending with ****8233 for DOP 574.03 in account ***9523.")
                    .id("6aa11557-d2bc-4d20-9b1f-1723ff2c48bb")
                    .isPending(true)
                    .merchantName("Reichert, Erdman and Tillman")
                    .postedAt(OffsetDateTime.parse("2025-03-25T03:24:43.401Z"))
                    .reference("93642593")
                    .transactionAt(OffsetDateTime.parse("2022-07-27T23:32:53.001Z"))
                    .type(AccountingBankfeedtransactionType.CREDIT)
                    .updatedAt(OffsetDateTime.parse("2022-05-23T22:35:06.521Z"))
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
                    .accountId("b7dc4175-1368-4b89-a700-d621b6666648")
                    .amount(60889d)
                    .bankCategory("Games")
                    .bankfeedaccountId("34c1d05f-5b62-4bcd-9121-3be8b720941f")
                    .categoryIds(List.of())
                    .contactId("1ef58ebe-f9c9-46f6-9d9c-2df2658503be")
                    .createdAt(OffsetDateTime.parse("2022-03-24T23:41:08.374Z"))
                    .currency("SRD")
                    .description("payment transaction at McLaughlin - Schaden using card ending with ****8233 for DOP 574.03 in account ***9523.")
                    .id("6aa11557-d2bc-4d20-9b1f-1723ff2c48bb")
                    .isPending(true)
                    .merchantName("Reichert, Erdman and Tillman")
                    .postedAt(OffsetDateTime.parse("2025-03-25T03:24:43.401Z"))
                    .reference("93642593")
                    .transactionAt(OffsetDateTime.parse("2022-07-27T23:32:53.001Z"))
                    .type(AccountingBankfeedtransactionType.CREDIT)
                    .updatedAt(OffsetDateTime.parse("2022-05-23T22:35:06.521Z"))
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