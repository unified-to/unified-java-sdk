# Invoice
(*invoice*)

### Available Operations

* [createAccountingInvoice](#createaccountinginvoice) - Create an invoice
* [getAccountingInvoice](#getaccountinginvoice) - Retrieve an invoice
* [listAccountingInvoices](#listaccountinginvoices) - List all invoices
* [patchAccountingInvoice](#patchaccountinginvoice) - Update an invoice
* [removeAccountingInvoice](#removeaccountinginvoice) - Remove an invoice
* [updateAccountingInvoice](#updateaccountinginvoice) - Update an invoice

## createAccountingInvoice

Create an invoice

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingInvoiceRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingInvoiceResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoice;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoiceStatus;
import com.unifiedapi.unifiedto.models.shared.AccountingLineitem;
import com.unifiedapi.unifiedto.models.shared.PaymentCollectionMethod;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateAccountingInvoiceRequest req = new CreateAccountingInvoiceRequest(
                "<value>"){{
                accountingInvoice = new AccountingInvoice(
){{
                    balanceAmount = 6736.06d;
                    cancelledAt = OffsetDateTime.parse("2022-06-27T09:14:42.959Z");
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2022-07-05T18:32:52.109Z");
                    currency = "Uzbekistan Sum";
                    discountAmount = 259.66d;
                    dueAt = OffsetDateTime.parse("2023-04-30T15:54:59.455Z");
                    id = "<id>";
                    invoiceNumber = "<value>";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingLineitem[]{{
                        add(new AccountingLineitem(
                        5685.15d){{
                            totalAmount = 7142.37d;
                        }}),
                    }};
                    notes = "<value>";
                    paidAmount = 6572.32d;
                    paidAt = OffsetDateTime.parse("2023-07-10T18:36:49.807Z");
                    paymentCollectionMethod = PaymentCollectionMethod.SEND_INVOICE;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    refundAmount = 5503.49d;
                    refundReason = "<value>";
                    refundedAt = OffsetDateTime.parse("2024-06-02T02:10:22.972Z");
                    status = AccountingInvoiceStatus.AUTHORIZED;
                    taxAmount = 6873.46d;
                    totalAmount = 6276.92d;
                    updatedAt = OffsetDateTime.parse("2023-05-31T14:28:49.824Z");
                    url = "http://irresponsible-elite.biz";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingInvoiceResponse res = sdk.invoice.createAccountingInvoice(req);

            if (res.accountingInvoice != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.CreateAccountingInvoiceRequest](../../models/operations/CreateAccountingInvoiceRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAccountingInvoiceResponse](../../models/operations/CreateAccountingInvoiceResponse.md)**


## getAccountingInvoice

Retrieve an invoice

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingInvoiceRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingInvoiceResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetAccountingInvoiceRequest req = new GetAccountingInvoiceRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingInvoiceResponse res = sdk.invoice.getAccountingInvoice(req);

            if (res.accountingInvoice != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetAccountingInvoiceRequest](../../models/operations/GetAccountingInvoiceRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingInvoiceResponse](../../models/operations/GetAccountingInvoiceResponse.md)**


## listAccountingInvoices

List all invoices

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingInvoicesRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingInvoicesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListAccountingInvoicesRequest req = new ListAccountingInvoicesRequest(
                "<value>"){{
                contactId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 6788.11d;
                offset = 5122.49d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-05-23T19:02:52.454Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingInvoicesResponse res = sdk.invoice.listAccountingInvoices(req);

            if (res.accountingInvoices != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListAccountingInvoicesRequest](../../models/operations/ListAccountingInvoicesRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingInvoicesResponse](../../models/operations/ListAccountingInvoicesResponse.md)**


## patchAccountingInvoice

Update an invoice

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoice;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoiceStatus;
import com.unifiedapi.unifiedto.models.shared.AccountingLineitem;
import com.unifiedapi.unifiedto.models.shared.PaymentCollectionMethod;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceRequest req = new PatchAccountingInvoiceRequest(
                "<value>",
                "<value>"){{
                accountingInvoice = new AccountingInvoice(
){{
                    balanceAmount = 7374.1d;
                    cancelledAt = OffsetDateTime.parse("2024-12-18T11:25:21.140Z");
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2023-06-14T05:39:15.854Z");
                    currency = "Gold";
                    discountAmount = 9127.96d;
                    dueAt = OffsetDateTime.parse("2024-07-05T05:55:55.560Z");
                    id = "<id>";
                    invoiceNumber = "<value>";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingLineitem[]{{
                        add(new AccountingLineitem(
                        3886.02d){{
                            totalAmount = 7810.81d;
                        }}),
                    }};
                    notes = "<value>";
                    paidAmount = 1152.38d;
                    paidAt = OffsetDateTime.parse("2023-03-23T14:30:18.013Z");
                    paymentCollectionMethod = PaymentCollectionMethod.CHARGE_AUTOMATICALLY;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    refundAmount = 2117.25d;
                    refundReason = "<value>";
                    refundedAt = OffsetDateTime.parse("2022-11-28T21:20:47.449Z");
                    status = AccountingInvoiceStatus.DRAFT;
                    taxAmount = 4543.48d;
                    totalAmount = 6957.18d;
                    updatedAt = OffsetDateTime.parse("2022-10-04T07:00:14.156Z");
                    url = "http://envious-speech.info";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceResponse res = sdk.invoice.patchAccountingInvoice(req);

            if (res.accountingInvoice != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceRequest](../../models/operations/PatchAccountingInvoiceRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceResponse](../../models/operations/PatchAccountingInvoiceResponse.md)**


## removeAccountingInvoice

Remove an invoice

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingInvoiceRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingInvoiceResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingInvoiceRequest req = new RemoveAccountingInvoiceRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingInvoiceResponse res = sdk.invoice.removeAccountingInvoice(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingInvoiceRequest](../../models/operations/RemoveAccountingInvoiceRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAccountingInvoiceResponse](../../models/operations/RemoveAccountingInvoiceResponse.md)**


## updateAccountingInvoice

Update an invoice

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoice;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoiceStatus;
import com.unifiedapi.unifiedto.models.shared.AccountingLineitem;
import com.unifiedapi.unifiedto.models.shared.PaymentCollectionMethod;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceRequest req = new UpdateAccountingInvoiceRequest(
                "<value>",
                "<value>"){{
                accountingInvoice = new AccountingInvoice(
){{
                    balanceAmount = 6974.28d;
                    cancelledAt = OffsetDateTime.parse("2023-06-03T06:46:26.704Z");
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2022-07-10T23:29:44.275Z");
                    currency = "Forint";
                    discountAmount = 2579.09d;
                    dueAt = OffsetDateTime.parse("2023-12-25T16:24:30.030Z");
                    id = "<id>";
                    invoiceNumber = "<value>";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingLineitem[]{{
                        add(new AccountingLineitem(
                        9127.85d){{
                            totalAmount = 3682.14d;
                        }}),
                    }};
                    notes = "<value>";
                    paidAmount = 2842.49d;
                    paidAt = OffsetDateTime.parse("2022-06-05T15:45:06.127Z");
                    paymentCollectionMethod = PaymentCollectionMethod.SEND_INVOICE;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    refundAmount = 7535.06d;
                    refundReason = "<value>";
                    refundedAt = OffsetDateTime.parse("2024-04-25T17:14:49.861Z");
                    status = AccountingInvoiceStatus.VOIDED;
                    taxAmount = 2939.97d;
                    totalAmount = 2050.9d;
                    updatedAt = OffsetDateTime.parse("2024-09-20T05:36:54.012Z");
                    url = "http://tubby-switchboard.name";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceResponse res = sdk.invoice.updateAccountingInvoice(req);

            if (res.accountingInvoice != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceRequest](../../models/operations/UpdateAccountingInvoiceRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceResponse](../../models/operations/UpdateAccountingInvoiceResponse.md)**

