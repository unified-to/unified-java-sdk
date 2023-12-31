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
import com.unifiedapi.unifiedto.models.shared.AccountingInvoice;
import com.unifiedapi.unifiedto.models.shared.AccountingLineitem;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingInvoiceRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingLineitemRaw;
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
                "string"){{
                accountingInvoice = new AccountingInvoice(
){{
                    balanceAmount = 6736.06d;
                    cancelledAt = OffsetDateTime.parse("2022-06-27T09:14:42.959Z");
                    createdAt = OffsetDateTime.parse("2022-07-05T18:32:52.109Z");
                    currency = "Uzbekistan Sum";
                    customerId = "string";
                    discountAmount = 259.66d;
                    dueAt = OffsetDateTime.parse("2023-04-30T15:54:59.455Z");
                    id = "<ID>";
                    invoiceNumber = "string";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingLineitem[]{{
                        add(new AccountingLineitem(
                        5685.15d){{
                            raw = new PropertyAccountingLineitemRaw(
                            ){{}};
                            totalAmount = 7142.37d;
                        }}),
                    }};
                    notes = "string";
                    paidAmount = 6572.32d;
                    paidAt = OffsetDateTime.parse("2023-07-10T18:36:49.807Z");
                    raw = new PropertyAccountingInvoiceRaw(
);
                    refundAmount = 1578.89d;
                    refundReason = "string";
                    refundedAt = OffsetDateTime.parse("2023-08-27T04:22:20.182Z");
                    taxAmount = 8057.4d;
                    totalAmount = 6864d;
                    updatedAt = OffsetDateTime.parse("2024-01-24T07:56:15.656Z");

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetAccountingInvoiceRequest req = new GetAccountingInvoiceRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
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
                "string"){{
                customerId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 6788.11d;
                offset = 5122.49d;
                order = "string";
                query = "string";
                sort = "string";
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
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingLineitemRaw;
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
                "string",
                "string"){{
                accountingInvoice = new AccountingInvoice(
){{
                    balanceAmount = 7374.1d;
                    cancelledAt = OffsetDateTime.parse("2024-12-18T11:25:21.140Z");
                    createdAt = OffsetDateTime.parse("2023-06-14T05:39:15.854Z");
                    currency = "Gold";
                    customerId = "string";
                    discountAmount = 9127.96d;
                    dueAt = OffsetDateTime.parse("2024-07-05T05:55:55.560Z");
                    id = "<ID>";
                    invoiceNumber = "string";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingLineitem[]{{
                        add(new AccountingLineitem(
                        3886.02d){{
                            raw = new PropertyAccountingLineitemRaw(
                            ){{}};
                            totalAmount = 7810.81d;
                        }}),
                    }};
                    notes = "string";
                    paidAmount = 1152.38d;
                    paidAt = OffsetDateTime.parse("2023-03-23T14:30:18.013Z");
                    raw = new PropertyAccountingInvoiceRaw(
);
                    refundAmount = 6443.77d;
                    refundReason = "string";
                    refundedAt = OffsetDateTime.parse("2022-08-21T01:13:52.344Z");
                    taxAmount = 3028.19d;
                    totalAmount = 1140.08d;
                    updatedAt = OffsetDateTime.parse("2023-05-13T23:10:36.341Z");

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingInvoiceRequest req = new RemoveAccountingInvoiceRequest(
                "string",
                "string");

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
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingLineitemRaw;
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
                "string",
                "string"){{
                accountingInvoice = new AccountingInvoice(
){{
                    balanceAmount = 6974.28d;
                    cancelledAt = OffsetDateTime.parse("2023-06-03T06:46:26.704Z");
                    createdAt = OffsetDateTime.parse("2022-07-10T23:29:44.275Z");
                    currency = "Forint";
                    customerId = "string";
                    discountAmount = 2579.09d;
                    dueAt = OffsetDateTime.parse("2023-12-25T16:24:30.030Z");
                    id = "<ID>";
                    invoiceNumber = "string";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingLineitem[]{{
                        add(new AccountingLineitem(
                        9127.85d){{
                            raw = new PropertyAccountingLineitemRaw(
                            ){{}};
                            totalAmount = 3682.14d;
                        }}),
                    }};
                    notes = "string";
                    paidAmount = 2842.49d;
                    paidAt = OffsetDateTime.parse("2022-06-05T15:45:06.127Z");
                    raw = new PropertyAccountingInvoiceRaw(
);
                    refundAmount = 3314.72d;
                    refundReason = "string";
                    refundedAt = OffsetDateTime.parse("2024-04-05T20:13:33.419Z");
                    taxAmount = 7716.41d;
                    totalAmount = 3824.24d;
                    updatedAt = OffsetDateTime.parse("2022-11-19T05:18:11.782Z");

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

