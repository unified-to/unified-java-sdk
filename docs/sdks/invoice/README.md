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
                            .id("202f1170-50e5-465b-b80f-56250a7d7024")
                            .mimeType("application/pdf")
                            .name("INV-77705.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://earnest-giggle.net")
                            .id("6638baac-8c8f-42e8-9afb-144101d85455")
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
                    .id("df142288-0f2b-4211-88d6-099aba626e99")
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
                    .updatedAt(OffsetDateTime.parse("2026-05-04T22:28:01.780Z"))
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
                            .id("5868e4cb-5276-4223-94a2-8854750b6151")
                            .mimeType("application/pdf")
                            .name("INV-77705.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://earnest-giggle.net")
                            .id("e4635dc0-eb1e-452b-b60c-72574d3a62e6")
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
                    .id("66037582-355b-4e1b-aa3e-f23ad49b27af")
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
                    .updatedAt(OffsetDateTime.parse("2026-05-04T22:28:01.814Z"))
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
                            .id("5868e4cb-5276-4223-94a2-8854750b6151")
                            .mimeType("application/pdf")
                            .name("INV-77705.pdf")
                            .build(),
                        AccountingAttachment.builder()
                            .downloadUrl("https://earnest-giggle.net")
                            .id("e4635dc0-eb1e-452b-b60c-72574d3a62e6")
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
                    .id("66037582-355b-4e1b-aa3e-f23ad49b27af")
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
                    .updatedAt(OffsetDateTime.parse("2026-05-04T22:28:01.814Z"))
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