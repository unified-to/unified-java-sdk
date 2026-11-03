# Bill

## Overview

### Available Operations

* [createAccountingBill](#createaccountingbill) - Create a bill
* [getAccountingBill](#getaccountingbill) - Retrieve a bill
* [listAccountingBills](#listaccountingbills) - List all bills
* [patchAccountingBill](#patchaccountingbill) - Update a bill
* [removeAccountingBill](#removeaccountingbill) - Remove a bill
* [updateAccountingBill](#updateaccountingbill) - Update a bill

## createAccountingBill

Creates a AccountingBill. Provide the unified AccountingBill fields in the request body; they are mapped to the provider's API. Returns the created AccountingBill.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingBill" method="post" path="/accounting/{connection_id}/bill" example="accounting_bill" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingBillRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingBillResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingBillRequest req = CreateAccountingBillRequest.builder()
                .accountingBill(AccountingBill.builder()
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://puny-foodstuffs.name")
                            .id("09719343-ca38-4881-9a72-0bdd2eaa8741")
                            .mimeType("application/pdf")
                            .name("BILL-2466.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://grimy-characterization.net")
                            .id("a7ac7bef-7775-4b41-b183-5ce1f32fc9a4")
                            .mimeType("application/pdf")
                            .name("BILL-2466-1.pdf")
                            .build()))
                    .balanceAmount(0d)
                    .billNumber("BILL-2466")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2019-08-08T23:03:14.104Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .dueAt(OffsetDateTime.parse("2019-09-07T23:03:14.104Z"))
                    .extendedNotes(List.of())
                    .id("aacd3a64-5ef6-4d5e-8c5d-9c9ee519be02")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Admiratio deporto tutamen cilicium infit amissio ante demulceo.")
                    .paidAmount(0d)
                    .paidAt(OffsetDateTime.parse("2019-08-15T17:24:28.313Z"))
                    .paymentCollectionMethod(PaymentCollectionMethod.CHARGE_AUTOMATICALLY)
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2019-08-08T23:03:14.104Z"))
                    .purchaseorderIds(List.of())
                    .send(true)
                    .status(AccountingBillStatus.PARTIALLY_PAID)
                    .subTotalAmount(0d)
                    .taxAmount(0d)
                    .term(Term.NET90)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2020-06-02T16:24:27.326Z"))
                    .url("https://cluttered-importance.org/bills/BILL-2466")
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingBillResponse res = sdk.bill().createAccountingBill()
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
| `request`                                                                             | [CreateAccountingBillRequest](../../models/operations/CreateAccountingBillRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateAccountingBillResponse](../../models/operations/CreateAccountingBillResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingBill

Retrieves a single AccountingBill by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingBill" method="get" path="/accounting/{connection_id}/bill/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingBillRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingBillResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingBillRequest req = GetAccountingBillRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingBillResponse res = sdk.bill().getAccountingBill()
                .request(req)
                .call();

        if (res.accountingBill().isPresent()) {
            System.out.println(res.accountingBill().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetAccountingBillRequest](../../models/operations/GetAccountingBillRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetAccountingBillResponse](../../models/operations/GetAccountingBillResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingBills

Returns a list of AccountingBills. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingBills" method="get" path="/accounting/{connection_id}/bill" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingBillsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingBillsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingBillsRequest req = ListAccountingBillsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingBillsResponse res = sdk.bill().listAccountingBills()
                .request(req)
                .call();

        if (res.accountingBills().isPresent()) {
            System.out.println(res.accountingBills().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListAccountingBillsRequest](../../models/operations/ListAccountingBillsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListAccountingBillsResponse](../../models/operations/ListAccountingBillsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingBill

Updates the AccountingBill identified by `id`. Provide the unified AccountingBill fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingBill" method="patch" path="/accounting/{connection_id}/bill/{id}" example="accounting_bill" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingBillRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingBillResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingBillRequest req = PatchAccountingBillRequest.builder()
                .accountingBill(AccountingBill.builder()
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://puny-foodstuffs.name")
                            .id("332194b6-111f-4f6a-8216-0bbf492e84a7")
                            .mimeType("application/pdf")
                            .name("BILL-2466.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://grimy-characterization.net")
                            .id("1daf51c5-9b4a-4206-8791-598efc77b369")
                            .mimeType("application/pdf")
                            .name("BILL-2466-1.pdf")
                            .build()))
                    .balanceAmount(0d)
                    .billNumber("BILL-2466")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2019-08-08T23:03:14.104Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .dueAt(OffsetDateTime.parse("2019-09-07T23:03:14.104Z"))
                    .extendedNotes(List.of())
                    .id("84dbc53a-54a2-4699-813d-38eda01a9750")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Admiratio deporto tutamen cilicium infit amissio ante demulceo.")
                    .paidAmount(0d)
                    .paidAt(OffsetDateTime.parse("2019-08-15T17:24:28.313Z"))
                    .paymentCollectionMethod(PaymentCollectionMethod.CHARGE_AUTOMATICALLY)
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2019-08-08T23:03:14.104Z"))
                    .purchaseorderIds(List.of())
                    .send(true)
                    .status(AccountingBillStatus.PARTIALLY_PAID)
                    .subTotalAmount(0d)
                    .taxAmount(0d)
                    .term(Term.NET90)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2020-06-02T16:24:27.332Z"))
                    .url("https://cluttered-importance.org/bills/BILL-2466")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingBillResponse res = sdk.bill().patchAccountingBill()
                .request(req)
                .call();

        if (res.accountingBill().isPresent()) {
            System.out.println(res.accountingBill().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchAccountingBillRequest](../../models/operations/PatchAccountingBillRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchAccountingBillResponse](../../models/operations/PatchAccountingBillResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingBill

Deletes the AccountingBill identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingBill" method="delete" path="/accounting/{connection_id}/bill/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingBillRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingBillResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingBillRequest req = RemoveAccountingBillRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingBillResponse res = sdk.bill().removeAccountingBill()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveAccountingBillRequest](../../models/operations/RemoveAccountingBillRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveAccountingBillResponse](../../models/operations/RemoveAccountingBillResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingBill

Updates the AccountingBill identified by `id`. Provide the unified AccountingBill fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingBill" method="put" path="/accounting/{connection_id}/bill/{id}" example="accounting_bill" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingBillRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingBillResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingBillRequest req = UpdateAccountingBillRequest.builder()
                .accountingBill(AccountingBill.builder()
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://puny-foodstuffs.name")
                            .id("332194b6-111f-4f6a-8216-0bbf492e84a7")
                            .mimeType("application/pdf")
                            .name("BILL-2466.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://grimy-characterization.net")
                            .id("1daf51c5-9b4a-4206-8791-598efc77b369")
                            .mimeType("application/pdf")
                            .name("BILL-2466-1.pdf")
                            .build()))
                    .balanceAmount(0d)
                    .billNumber("BILL-2466")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2019-08-08T23:03:14.104Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .dueAt(OffsetDateTime.parse("2019-09-07T23:03:14.104Z"))
                    .extendedNotes(List.of())
                    .id("84dbc53a-54a2-4699-813d-38eda01a9750")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Admiratio deporto tutamen cilicium infit amissio ante demulceo.")
                    .paidAmount(0d)
                    .paidAt(OffsetDateTime.parse("2019-08-15T17:24:28.313Z"))
                    .paymentCollectionMethod(PaymentCollectionMethod.CHARGE_AUTOMATICALLY)
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2019-08-08T23:03:14.104Z"))
                    .purchaseorderIds(List.of())
                    .send(true)
                    .status(AccountingBillStatus.PARTIALLY_PAID)
                    .subTotalAmount(0d)
                    .taxAmount(0d)
                    .term(Term.NET90)
                    .totalAmount(0d)
                    .updatedAt(OffsetDateTime.parse("2020-06-02T16:24:27.332Z"))
                    .url("https://cluttered-importance.org/bills/BILL-2466")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingBillResponse res = sdk.bill().updateAccountingBill()
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
| `request`                                                                             | [UpdateAccountingBillRequest](../../models/operations/UpdateAccountingBillRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateAccountingBillResponse](../../models/operations/UpdateAccountingBillResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |