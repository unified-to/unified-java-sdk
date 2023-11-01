# Invoice
(*.invoice*)

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
import com.unifiedapi.unifiedto.models.shared.AccountingInvoice;
import com.unifiedapi.unifiedto.models.shared.AccountingLineitem;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingInvoiceRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            CreateAccountingInvoiceRequest req = new CreateAccountingInvoiceRequest("string"){{
                accountingInvoice = new AccountingInvoice(){{
                    balanceAmount = 6736.06d;
                    cancelledAt = OffsetDateTime.parse("2021-06-27T05:21:39.307Z");
                    createdAt = OffsetDateTime.parse("2021-07-05T14:28:47.244Z");
                    currency = "Uzbekistan Sum";
                    customerId = "string";
                    discountAmount = 259.66d;
                    dueAt = OffsetDateTime.parse("2022-04-30T05:18:12.430Z");
                    id = "<ID>";
                    invoiceNumber = "string";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingLineitem[]{{
                        add(new AccountingLineitem(5685.15d){{
                            totalAmount = 7142.37d;
                        }}),
                    }};
                    notes = "string";
                    paidAmount = 6572.32d;
                    paidAt = OffsetDateTime.parse("2022-07-10T06:26:36.842Z");
                    raw = new PropertyAccountingInvoiceRaw();
                    refundAmount = 1578.89d;
                    refundReason = "string";
                    refundedAt = OffsetDateTime.parse("2022-08-26T15:09:50.054Z");
                    taxAmount = 8057.4d;
                    totalAmount = 6864d;
                    updatedAt = OffsetDateTime.parse("2023-01-23T15:26:28.999Z");
                }};
            }};            

            CreateAccountingInvoiceResponse res = sdk.invoice.createAccountingInvoice(req);

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

Retrieve a invoice

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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            GetAccountingInvoiceRequest req = new GetAccountingInvoiceRequest("string", "string"){{
                fields = new String[]{{
                    add("string"),
                }};
            }};            

            GetAccountingInvoiceResponse res = sdk.invoice.getAccountingInvoice(req);

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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            ListAccountingInvoicesRequest req = new ListAccountingInvoicesRequest("string"){{
                customerId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 6788.11d;
                offset = 5122.49d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2021-05-23T15:55:15.727Z");
            }};            

            ListAccountingInvoicesResponse res = sdk.invoice.listAccountingInvoices(req);

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

Update a invoice

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoice;
import com.unifiedapi.unifiedto.models.shared.AccountingLineitem;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingInvoiceRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            PatchAccountingInvoiceRequest req = new PatchAccountingInvoiceRequest("string", "string"){{
                accountingInvoice = new AccountingInvoice(){{
                    balanceAmount = 7374.1d;
                    cancelledAt = OffsetDateTime.parse("2023-12-18T11:43:07.271Z");
                    createdAt = OffsetDateTime.parse("2022-06-13T18:03:55.091Z");
                    currency = "Gold";
                    customerId = "string";
                    discountAmount = 9127.96d;
                    dueAt = OffsetDateTime.parse("2023-07-05T09:52:05.856Z");
                    id = "<ID>";
                    invoiceNumber = "string";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingLineitem[]{{
                        add(new AccountingLineitem(3886.02d){{
                            totalAmount = 7810.81d;
                        }}),
                    }};
                    notes = "string";
                    paidAmount = 1152.38d;
                    paidAt = OffsetDateTime.parse("2022-03-23T04:43:31.245Z");
                    raw = new PropertyAccountingInvoiceRaw();
                    refundAmount = 6443.77d;
                    refundReason = "string";
                    refundedAt = OffsetDateTime.parse("2021-08-20T20:08:59.249Z");
                    taxAmount = 3028.19d;
                    totalAmount = 1140.08d;
                    updatedAt = OffsetDateTime.parse("2022-05-13T12:16:20.651Z");
                }};
            }};            

            PatchAccountingInvoiceResponse res = sdk.invoice.patchAccountingInvoice(req);

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

Remove a invoice

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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            RemoveAccountingInvoiceRequest req = new RemoveAccountingInvoiceRequest("string", "string");            

            RemoveAccountingInvoiceResponse res = sdk.invoice.removeAccountingInvoice(req);

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

Update a invoice

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoice;
import com.unifiedapi.unifiedto.models.shared.AccountingLineitem;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingInvoiceRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            UpdateAccountingInvoiceRequest req = new UpdateAccountingInvoiceRequest("string", "string"){{
                accountingInvoice = new AccountingInvoice(){{
                    balanceAmount = 6974.28d;
                    cancelledAt = OffsetDateTime.parse("2022-06-02T19:25:29.417Z");
                    createdAt = OffsetDateTime.parse("2021-07-10T19:18:48.997Z");
                    currency = "Forint";
                    customerId = "string";
                    discountAmount = 2579.09d;
                    dueAt = OffsetDateTime.parse("2022-12-25T00:33:40.514Z");
                    id = "<ID>";
                    invoiceNumber = "string";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingLineitem[]{{
                        add(new AccountingLineitem(9127.85d){{
                            totalAmount = 3682.14d;
                        }}),
                    }};
                    notes = "string";
                    paidAmount = 2842.49d;
                    paidAt = OffsetDateTime.parse("2021-06-05T12:20:35.409Z");
                    raw = new PropertyAccountingInvoiceRaw();
                    refundAmount = 3314.72d;
                    refundReason = "string";
                    refundedAt = OffsetDateTime.parse("2023-04-06T02:08:30.487Z");
                    taxAmount = 7716.41d;
                    totalAmount = 3824.24d;
                    updatedAt = OffsetDateTime.parse("2021-11-18T22:14:50.421Z");
                }};
            }};            

            UpdateAccountingInvoiceResponse res = sdk.invoice.updateAccountingInvoice(req);

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

