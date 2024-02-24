# Invoice
(*invoice*)

### Available Operations

* [createAccountingInvoice](#createaccountinginvoice) - Create a invoice
* [getAccountingInvoice](#getaccountinginvoice) - Retrieve a invoice
* [listAccountingInvoices](#listaccountinginvoices) - List all invoices
* [patchAccountingInvoice](#patchaccountinginvoice) - Update a invoice
* [removeAccountingInvoice](#removeaccountinginvoice) - Remove a invoice
* [updateAccountingInvoice](#updateaccountinginvoice) - Update a invoice

## createAccountingInvoice

Create a invoice

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingInvoiceRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingInvoiceResponse;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingInvoiceSecurity;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoice;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoiceStatus;
import com.unifiedapi.unifiedto.models.shared.AccountingLineitem;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

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
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    refundAmount = 1578.89d;
                    refundReason = "<value>";
                    refundedAt = OffsetDateTime.parse("2023-08-27T04:22:20.182Z");
                    status = AccountingInvoiceStatus.AUTHORIZED;
                    taxAmount = 6864d;
                    totalAmount = 6873.46d;
                    updatedAt = OffsetDateTime.parse("2023-11-19T22:49:02.835Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingInvoiceResponse res = sdk.invoice.createAccountingInvoice(req, new CreateAccountingInvoiceSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.CreateAccountingInvoiceRequest](../../models/operations/CreateAccountingInvoiceRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.CreateAccountingInvoiceSecurity](../../models/operations/CreateAccountingInvoiceSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAccountingInvoiceResponse](../../models/operations/CreateAccountingInvoiceResponse.md)**


## getAccountingInvoice

Retrieve a invoice

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingInvoiceRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingInvoiceResponse;
import com.unifiedapi.unifiedto.models.operations.GetAccountingInvoiceSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetAccountingInvoiceRequest req = new GetAccountingInvoiceRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingInvoiceResponse res = sdk.invoice.getAccountingInvoice(req, new GetAccountingInvoiceSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetAccountingInvoiceRequest](../../models/operations/GetAccountingInvoiceRequest.md)   | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `security`                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.GetAccountingInvoiceSecurity](../../models/operations/GetAccountingInvoiceSecurity.md) | :heavy_check_mark:                                                                                                                 | The security requirements to use for the request.                                                                                  |


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
import com.unifiedapi.unifiedto.models.operations.ListAccountingInvoicesSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

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

            com.unifiedapi.unifiedto.models.operations.ListAccountingInvoicesResponse res = sdk.invoice.listAccountingInvoices(req, new ListAccountingInvoicesSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.ListAccountingInvoicesRequest](../../models/operations/ListAccountingInvoicesRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.ListAccountingInvoicesSecurity](../../models/operations/ListAccountingInvoicesSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingInvoicesResponse](../../models/operations/ListAccountingInvoicesResponse.md)**


## patchAccountingInvoice

Update a invoice

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceResponse;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceSecurity;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoice;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoiceStatus;
import com.unifiedapi.unifiedto.models.shared.AccountingLineitem;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

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
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    refundAmount = 6443.77d;
                    refundReason = "<value>";
                    refundedAt = OffsetDateTime.parse("2022-08-21T01:13:52.344Z");
                    status = AccountingInvoiceStatus.DRAFT;
                    taxAmount = 1140.08d;
                    totalAmount = 4543.48d;
                    updatedAt = OffsetDateTime.parse("2024-02-02T12:10:13.037Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceResponse res = sdk.invoice.patchAccountingInvoice(req, new PatchAccountingInvoiceSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceRequest](../../models/operations/PatchAccountingInvoiceRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceSecurity](../../models/operations/PatchAccountingInvoiceSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceResponse](../../models/operations/PatchAccountingInvoiceResponse.md)**


## removeAccountingInvoice

Remove a invoice

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingInvoiceRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingInvoiceResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingInvoiceSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingInvoiceRequest req = new RemoveAccountingInvoiceRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingInvoiceResponse res = sdk.invoice.removeAccountingInvoice(req, new RemoveAccountingInvoiceSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingInvoiceRequest](../../models/operations/RemoveAccountingInvoiceRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingInvoiceSecurity](../../models/operations/RemoveAccountingInvoiceSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAccountingInvoiceResponse](../../models/operations/RemoveAccountingInvoiceResponse.md)**


## updateAccountingInvoice

Update a invoice

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceSecurity;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoice;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoiceStatus;
import com.unifiedapi.unifiedto.models.shared.AccountingLineitem;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

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
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    refundAmount = 3314.72d;
                    refundReason = "<value>";
                    refundedAt = OffsetDateTime.parse("2024-04-05T20:13:33.419Z");
                    status = AccountingInvoiceStatus.AUTHORIZED;
                    taxAmount = 3824.24d;
                    totalAmount = 2939.97d;
                    updatedAt = OffsetDateTime.parse("2022-08-13T18:41:11.569Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceResponse res = sdk.invoice.updateAccountingInvoice(req, new UpdateAccountingInvoiceSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceRequest](../../models/operations/UpdateAccountingInvoiceRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceSecurity](../../models/operations/UpdateAccountingInvoiceSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceResponse](../../models/operations/UpdateAccountingInvoiceResponse.md)**

