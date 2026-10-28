# Invoice

## Overview

### Available Operations

* [createAccountingInvoice](#createaccountinginvoice) - Create an invoice
* [getAccountingInvoice](#getaccountinginvoice) - Retrieve an invoice
* [listAccountingInvoices](#listaccountinginvoices) - List all invoices
* [patchAccountingInvoice](#patchaccountinginvoice) - Update an invoice
* [removeAccountingInvoice](#removeaccountinginvoice) - Remove an invoice
* [updateAccountingInvoice](#updateaccountinginvoice) - Update an invoice

## createAccountingInvoice

Creates a AccountingInvoice. Provide the unified AccountingInvoice fields in the request body; they are mapped to the provider's API. Returns the created AccountingInvoice.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingInvoice" method="post" path="/accounting/{connection_id}/invoice" example="accounting_invoice" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingInvoiceRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingInvoiceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingInvoiceRequest req = CreateAccountingInvoiceRequest.builder()
                .accountingInvoice(AccountingInvoice.builder()
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://glossy-markup.net/")
                            .id("6be934d0-f065-4905-9f7a-759f7d59d6c6")
                            .mimeType("application/pdf")
                            .name("INV-77705.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://earnest-giggle.net")
                            .id("59064e46-cac3-4b78-962d-0221d48cae92")
                            .mimeType("application/pdf")
                            .name("INV-77705-1.pdf")
                            .build()))
                    .balanceAmount(0d)
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-11-07T14:17:29.587Z"))
                    .currency("GBP")
                    .discountAmount(0d)
                    .dueAt(OffsetDateTime.parse("2022-12-07T14:17:29.587Z"))
                    .extendedNotes(List.of())
                    .id("9ec2e247-cadd-40a9-a3e2-864b1b953196")
                    .invoiceNumber("INV-77705")
                    .isInclusiveOfTax(false)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Adinventitias sursum temptatio auctus comburo clarus ubi deprimo.")
                    .paymentCollectionMethod(AccountingInvoicePaymentCollectionMethod.CHARGE_AUTOMATICALLY)
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2022-11-07T14:17:29.587Z"))
                    .reference("PO-2331")
                    .salesorderIds(List.of())
                    .send(true)
                    .status(AccountingInvoiceStatus.OVERDUE)
                    .subTotalAmount(0d)
                    .taxAmount(0d)
                    .term(AccountingInvoiceTerm.NET25)
                    .totalAmount(0d)
                    .type(AccountingInvoiceType.INVOICE)
                    .updatedAt(OffsetDateTime.parse("2026-04-29T16:45:00.214Z"))
                    .url("https://gifted-yarmulke.info/invoices/INV-77705")
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingInvoiceResponse res = sdk.invoice().createAccountingInvoice()
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
| `request`                                                                                   | [CreateAccountingInvoiceRequest](../../models/operations/CreateAccountingInvoiceRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAccountingInvoiceResponse](../../models/operations/CreateAccountingInvoiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingInvoice

Retrieves a single AccountingInvoice by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingInvoice" method="get" path="/accounting/{connection_id}/invoice/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingInvoiceRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingInvoiceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingInvoiceRequest req = GetAccountingInvoiceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingInvoiceResponse res = sdk.invoice().getAccountingInvoice()
                .request(req)
                .call();

        if (res.accountingInvoice().isPresent()) {
            System.out.println(res.accountingInvoice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAccountingInvoiceRequest](../../models/operations/GetAccountingInvoiceRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAccountingInvoiceResponse](../../models/operations/GetAccountingInvoiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingInvoices

Returns a list of AccountingInvoices. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingInvoices" method="get" path="/accounting/{connection_id}/invoice" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingInvoicesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingInvoicesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingInvoicesRequest req = ListAccountingInvoicesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingInvoicesResponse res = sdk.invoice().listAccountingInvoices()
                .request(req)
                .call();

        if (res.accountingInvoices().isPresent()) {
            System.out.println(res.accountingInvoices().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAccountingInvoicesRequest](../../models/operations/ListAccountingInvoicesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAccountingInvoicesResponse](../../models/operations/ListAccountingInvoicesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingInvoice

Updates the AccountingInvoice identified by `id`. Provide the unified AccountingInvoice fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingInvoice" method="patch" path="/accounting/{connection_id}/invoice/{id}" example="accounting_invoice" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingInvoiceRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingInvoiceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingInvoiceRequest req = PatchAccountingInvoiceRequest.builder()
                .accountingInvoice(AccountingInvoice.builder()
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://glossy-markup.net/")
                            .id("66e22b65-b4c0-4725-ac1f-65ea347af5a0")
                            .mimeType("application/pdf")
                            .name("INV-77705.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://earnest-giggle.net")
                            .id("8e151046-7c3a-435d-8474-b227be36c78e")
                            .mimeType("application/pdf")
                            .name("INV-77705-1.pdf")
                            .build()))
                    .balanceAmount(0d)
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-11-07T14:17:29.587Z"))
                    .currency("GBP")
                    .discountAmount(0d)
                    .dueAt(OffsetDateTime.parse("2022-12-07T14:17:29.587Z"))
                    .extendedNotes(List.of())
                    .id("0c473c1f-8a40-4789-b424-a60de655ca00")
                    .invoiceNumber("INV-77705")
                    .isInclusiveOfTax(false)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Adinventitias sursum temptatio auctus comburo clarus ubi deprimo.")
                    .paymentCollectionMethod(AccountingInvoicePaymentCollectionMethod.CHARGE_AUTOMATICALLY)
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2022-11-07T14:17:29.587Z"))
                    .reference("PO-2331")
                    .salesorderIds(List.of())
                    .send(true)
                    .status(AccountingInvoiceStatus.OVERDUE)
                    .subTotalAmount(0d)
                    .taxAmount(0d)
                    .term(AccountingInvoiceTerm.NET25)
                    .totalAmount(0d)
                    .type(AccountingInvoiceType.INVOICE)
                    .updatedAt(OffsetDateTime.parse("2026-04-29T16:45:00.274Z"))
                    .url("https://gifted-yarmulke.info/invoices/INV-77705")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingInvoiceResponse res = sdk.invoice().patchAccountingInvoice()
                .request(req)
                .call();

        if (res.accountingInvoice().isPresent()) {
            System.out.println(res.accountingInvoice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAccountingInvoiceRequest](../../models/operations/PatchAccountingInvoiceRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAccountingInvoiceResponse](../../models/operations/PatchAccountingInvoiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingInvoice

Deletes the AccountingInvoice identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingInvoice" method="delete" path="/accounting/{connection_id}/invoice/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingInvoiceRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingInvoiceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingInvoiceRequest req = RemoveAccountingInvoiceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingInvoiceResponse res = sdk.invoice().removeAccountingInvoice()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAccountingInvoiceRequest](../../models/operations/RemoveAccountingInvoiceRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAccountingInvoiceResponse](../../models/operations/RemoveAccountingInvoiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingInvoice

Updates the AccountingInvoice identified by `id`. Provide the unified AccountingInvoice fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingInvoice" method="put" path="/accounting/{connection_id}/invoice/{id}" example="accounting_invoice" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingInvoiceRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingInvoiceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingInvoiceRequest req = UpdateAccountingInvoiceRequest.builder()
                .accountingInvoice(AccountingInvoice.builder()
                    .attachments(List.of(
                        AccountingAttachment.builder()
                            .downloadUrl("https://glossy-markup.net/")
                            .id("66e22b65-b4c0-4725-ac1f-65ea347af5a0")
                            .mimeType("application/pdf")
                            .name("INV-77705.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://earnest-giggle.net")
                            .id("8e151046-7c3a-435d-8474-b227be36c78e")
                            .mimeType("application/pdf")
                            .name("INV-77705-1.pdf")
                            .build()))
                    .balanceAmount(0d)
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-11-07T14:17:29.587Z"))
                    .currency("GBP")
                    .discountAmount(0d)
                    .dueAt(OffsetDateTime.parse("2022-12-07T14:17:29.587Z"))
                    .extendedNotes(List.of())
                    .id("0c473c1f-8a40-4789-b424-a60de655ca00")
                    .invoiceNumber("INV-77705")
                    .isInclusiveOfTax(false)
                    .lineitems(List.of())
                    .metadata(List.of())
                    .notes("Adinventitias sursum temptatio auctus comburo clarus ubi deprimo.")
                    .paymentCollectionMethod(AccountingInvoicePaymentCollectionMethod.CHARGE_AUTOMATICALLY)
                    .payments(List.of())
                    .postedAt(OffsetDateTime.parse("2022-11-07T14:17:29.587Z"))
                    .reference("PO-2331")
                    .salesorderIds(List.of())
                    .send(true)
                    .status(AccountingInvoiceStatus.OVERDUE)
                    .subTotalAmount(0d)
                    .taxAmount(0d)
                    .term(AccountingInvoiceTerm.NET25)
                    .totalAmount(0d)
                    .type(AccountingInvoiceType.INVOICE)
                    .updatedAt(OffsetDateTime.parse("2026-04-29T16:45:00.274Z"))
                    .url("https://gifted-yarmulke.info/invoices/INV-77705")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingInvoiceResponse res = sdk.invoice().updateAccountingInvoice()
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
| `request`                                                                                   | [UpdateAccountingInvoiceRequest](../../models/operations/UpdateAccountingInvoiceRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAccountingInvoiceResponse](../../models/operations/UpdateAccountingInvoiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |