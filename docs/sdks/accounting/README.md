# Accounting
(*accounting*)

### Available Operations

* [createAccountingAccount](#createaccountingaccount) - Create an account
* [createAccountingCustomer](#createaccountingcustomer) - Create a customer
* [createAccountingInvoice](#createaccountinginvoice) - Create a invoice
* [createAccountingItem](#createaccountingitem) - Create an item
* [createAccountingPayment](#createaccountingpayment) - Create a payment
* [createAccountingTaxrate](#createaccountingtaxrate) - Create a taxrate
* [createAccountingTransaction](#createaccountingtransaction) - Create a transaction
* [getAccountingAccount](#getaccountingaccount) - Retrieve an account
* [getAccountingCustomer](#getaccountingcustomer) - Retrieve a customer
* [getAccountingInvoice](#getaccountinginvoice) - Retrieve a invoice
* [getAccountingItem](#getaccountingitem) - Retrieve an item
* [getAccountingOrganization](#getaccountingorganization) - Retrieve an organization
* [getAccountingPayment](#getaccountingpayment) - Retrieve a payment
* [getAccountingTaxrate](#getaccountingtaxrate) - Retrieve a taxrate
* [getAccountingTransaction](#getaccountingtransaction) - Retrieve a transaction
* [listAccountingAccounts](#listaccountingaccounts) - List all accounts
* [listAccountingCustomers](#listaccountingcustomers) - List all customers
* [listAccountingInvoices](#listaccountinginvoices) - List all invoices
* [listAccountingItems](#listaccountingitems) - List all items
* [listAccountingOrganizations](#listaccountingorganizations) - List all organizations
* [listAccountingPayments](#listaccountingpayments) - List all payments
* [listAccountingTaxrates](#listaccountingtaxrates) - List all taxrates
* [listAccountingTransactions](#listaccountingtransactions) - List all transactions
* [patchAccountingAccount](#patchaccountingaccount) - Update an account
* [patchAccountingCustomer](#patchaccountingcustomer) - Update a customer
* [patchAccountingInvoice](#patchaccountinginvoice) - Update a invoice
* [patchAccountingItem](#patchaccountingitem) - Update an item
* [patchAccountingPayment](#patchaccountingpayment) - Update a payment
* [patchAccountingTaxrate](#patchaccountingtaxrate) - Update a taxrate
* [patchAccountingTransaction](#patchaccountingtransaction) - Update a transaction
* [removeAccountingAccount](#removeaccountingaccount) - Remove an account
* [removeAccountingCustomer](#removeaccountingcustomer) - Remove a customer
* [removeAccountingInvoice](#removeaccountinginvoice) - Remove a invoice
* [removeAccountingItem](#removeaccountingitem) - Remove an item
* [removeAccountingPayment](#removeaccountingpayment) - Remove a payment
* [removeAccountingTaxrate](#removeaccountingtaxrate) - Remove a taxrate
* [removeAccountingTransaction](#removeaccountingtransaction) - Remove a transaction
* [updateAccountingAccount](#updateaccountingaccount) - Update an account
* [updateAccountingCustomer](#updateaccountingcustomer) - Update a customer
* [updateAccountingInvoice](#updateaccountinginvoice) - Update a invoice
* [updateAccountingItem](#updateaccountingitem) - Update an item
* [updateAccountingPayment](#updateaccountingpayment) - Update a payment
* [updateAccountingTaxrate](#updateaccountingtaxrate) - Update a taxrate
* [updateAccountingTransaction](#updateaccountingtransaction) - Update a transaction

## createAccountingAccount

Create an account

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingAccount;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingAccountRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Status;
import com.unifiedapi.unifiedto.models.shared.Type;
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

            com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountRequest req = new CreateAccountingAccountRequest(
                "string"){{
                accountingAccount = new AccountingAccount(
                    "string"){{
                    balance = 6602.56d;
                    bankAccountNumber = "string";
                    createdAt = OffsetDateTime.parse("2023-09-02T22:12:31.771Z");
                    currency = "Saint Helena Pound";
                    customerDefinedCode = "string";
                    description = "Cross-group zero defect task-force";
                    id = "<ID>";
                    raw = new PropertyAccountingAccountRaw(
);
                    status = Status.ACTIVE;
                    type = Type.EQUITY;
                    updatedAt = OffsetDateTime.parse("2023-09-09T23:41:51.681Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountResponse res = sdk.accounting.createAccountingAccount(req);

            if (res.accountingAccount != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountRequest](../../models/operations/CreateAccountingAccountRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountResponse](../../models/operations/CreateAccountingAccountResponse.md)**


## createAccountingCustomer

Create a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingCustomerResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingCustomer;
import com.unifiedapi.unifiedto.models.shared.AccountingEmail;
import com.unifiedapi.unifiedto.models.shared.AccountingEmailType;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephone;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerBillingAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerShippingAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TaxExemption;
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

            com.unifiedapi.unifiedto.models.operations.CreateAccountingCustomerRequest req = new CreateAccountingCustomerRequest(
                "string"){{
                accountingCustomer = new AccountingCustomer(
){{
                    billingAddress = new PropertyAccountingCustomerBillingAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "New Raulfield";
                        country = "Libyan Arab Jamahiriya";
                        countryCode = "IN";
                        postalCode = "22232";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2022-07-22T23:43:30.815Z");
                    currency = "Dalasi";
                    emails = new com.unifiedapi.unifiedto.models.shared.AccountingEmail[]{{
                        add(new AccountingEmail(
                        "string"){{
                            email = "Loren78@gmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new PropertyAccountingCustomerRaw(
);
                    shippingAddress = new PropertyAccountingCustomerShippingAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "North Stanford";
                        country = "Iceland";
                        countryCode = "AZ";
                        postalCode = "11906-2906";
                        region = "string";
                        regionCode = "string";

                    }};
                    taxExemption = TaxExemption.RESALE;
                    taxNumber = "string";
                    telephones = new com.unifiedapi.unifiedto.models.shared.AccountingTelephone[]{{
                        add(new AccountingTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-12-07T22:10:07.470Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingCustomerResponse res = sdk.accounting.createAccountingCustomer(req);

            if (res.accountingCustomer != null) {
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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.CreateAccountingCustomerRequest](../../models/operations/CreateAccountingCustomerRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAccountingCustomerResponse](../../models/operations/CreateAccountingCustomerResponse.md)**


## createAccountingInvoice

Create a invoice

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingInvoiceRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingInvoiceResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoice;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoiceStatus;
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
                    status = AccountingInvoiceStatus.AUTHORIZED;
                    taxAmount = 6864d;
                    totalAmount = 6873.46d;
                    updatedAt = OffsetDateTime.parse("2023-11-19T22:49:02.835Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingInvoiceResponse res = sdk.accounting.createAccountingInvoice(req);

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


## createAccountingItem

Create an item

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingItemRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingItemResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingItem;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingItemRaw;
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

            com.unifiedapi.unifiedto.models.operations.CreateAccountingItemRequest req = new CreateAccountingItemRequest(
                "string"){{
                accountingItem = new AccountingItem(
                    "string"){{
                    createdAt = OffsetDateTime.parse("2022-11-04T21:45:18.227Z");
                    description = "Team-oriented grid-enabled open system";
                    id = "<ID>";
                    isActive = false;
                    isTaxable = false;
                    price = 8182.36d;
                    publicDescription = "string";
                    quantityOnHand = 9042.97d;
                    raw = new PropertyAccountingItemRaw(
);
                    sku = "string";
                    updatedAt = OffsetDateTime.parse("2024-04-05T08:21:06.807Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingItemResponse res = sdk.accounting.createAccountingItem(req);

            if (res.accountingItem != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.CreateAccountingItemRequest](../../models/operations/CreateAccountingItemRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAccountingItemResponse](../../models/operations/CreateAccountingItemResponse.md)**


## createAccountingPayment

Create a payment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingPaymentRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingPaymentResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingPayment;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingPaymentRaw;
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

            com.unifiedapi.unifiedto.models.operations.CreateAccountingPaymentRequest req = new CreateAccountingPaymentRequest(
                "string"){{
                accountingPayment = new AccountingPayment(
){{
                    accountId = "string";
                    createdAt = OffsetDateTime.parse("2024-01-28T13:13:46.548Z");
                    currency = "Lari";
                    customerId = "string";
                    id = "<ID>";
                    invoiceId = "string";
                    notes = "string";
                    paymentMethod = "string";
                    raw = new PropertyAccountingPaymentRaw(
);
                    reference = "string";
                    totalAmount = 291.36d;
                    updatedAt = OffsetDateTime.parse("2023-10-01T03:33:47.004Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingPaymentResponse res = sdk.accounting.createAccountingPayment(req);

            if (res.accountingPayment != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.CreateAccountingPaymentRequest](../../models/operations/CreateAccountingPaymentRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAccountingPaymentResponse](../../models/operations/CreateAccountingPaymentResponse.md)**


## createAccountingTaxrate

Create a taxrate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingTaxrate;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingTaxrateRaw;
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

            com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateRequest req = new CreateAccountingTaxrateRequest(
                "string"){{
                accountingTaxrate = new AccountingTaxrate(
                    "string",
                    1719.1d){{
                    createdAt = OffsetDateTime.parse("2022-09-20T17:06:11.018Z");
                    description = "Ergonomic regional neural-net";
                    id = "<ID>";
                    isActive = false;
                    raw = new PropertyAccountingTaxrateRaw(
);
                    updatedAt = OffsetDateTime.parse("2023-12-27T23:06:27.112Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateResponse res = sdk.accounting.createAccountingTaxrate(req);

            if (res.accountingTaxrate != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateRequest](../../models/operations/CreateAccountingTaxrateRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateResponse](../../models/operations/CreateAccountingTaxrateResponse.md)**


## createAccountingTransaction

Create a transaction

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingTransactionRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingTransactionResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingTransaction;
import com.unifiedapi.unifiedto.models.shared.AccountingTransactionLineitem;
import com.unifiedapi.unifiedto.models.shared.AccountingTransactionType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingTransactionRaw;
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

            com.unifiedapi.unifiedto.models.operations.CreateAccountingTransactionRequest req = new CreateAccountingTransactionRequest(
                "string"){{
                accountingTransaction = new AccountingTransaction(
                    "string",
                    "string",
                    4969.62d,
                    AccountingTransactionType.SPEND){{
                    createdAt = "string";
                    currency = "Pakistan Rupee";
                    description = "Cross-platform dedicated policy";
                    lineItems = new com.unifiedapi.unifiedto.models.shared.AccountingTransactionLineitem[]{{
                        add(new AccountingTransactionLineitem(
                        4121.55d){{
                            totalAmount = 8276.07d;
                        }}),
                    }};
                    raw = new PropertyAccountingTransactionRaw(
);
                    reference = "string";
                    taxAmount = 9038.49d;
                    updatedAt = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingTransactionResponse res = sdk.accounting.createAccountingTransaction(req);

            if (res.accountingTransaction != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.CreateAccountingTransactionRequest](../../models/operations/CreateAccountingTransactionRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAccountingTransactionResponse](../../models/operations/CreateAccountingTransactionResponse.md)**


## getAccountingAccount

Retrieve an account

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingAccountRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingAccountResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetAccountingAccountRequest req = new GetAccountingAccountRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingAccountResponse res = sdk.accounting.getAccountingAccount(req);

            if (res.accountingAccount != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetAccountingAccountRequest](../../models/operations/GetAccountingAccountRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingAccountResponse](../../models/operations/GetAccountingAccountResponse.md)**


## getAccountingCustomer

Retrieve a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingCustomerResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetAccountingCustomerRequest req = new GetAccountingCustomerRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingCustomerResponse res = sdk.accounting.getAccountingCustomer(req);

            if (res.accountingCustomer != null) {
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
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetAccountingCustomerRequest](../../models/operations/GetAccountingCustomerRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingCustomerResponse](../../models/operations/GetAccountingCustomerResponse.md)**


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

            com.unifiedapi.unifiedto.models.operations.GetAccountingInvoiceResponse res = sdk.accounting.getAccountingInvoice(req);

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


## getAccountingItem

Retrieve an item

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingItemRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingItemResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetAccountingItemRequest req = new GetAccountingItemRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingItemResponse res = sdk.accounting.getAccountingItem(req);

            if (res.accountingItem != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetAccountingItemRequest](../../models/operations/GetAccountingItemRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingItemResponse](../../models/operations/GetAccountingItemResponse.md)**


## getAccountingOrganization

Retrieve an organization

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingOrganizationRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingOrganizationResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetAccountingOrganizationRequest req = new GetAccountingOrganizationRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingOrganizationResponse res = sdk.accounting.getAccountingOrganization(req);

            if (res.accountingOrganization != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetAccountingOrganizationRequest](../../models/operations/GetAccountingOrganizationRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingOrganizationResponse](../../models/operations/GetAccountingOrganizationResponse.md)**


## getAccountingPayment

Retrieve a payment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingPaymentRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingPaymentResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetAccountingPaymentRequest req = new GetAccountingPaymentRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingPaymentResponse res = sdk.accounting.getAccountingPayment(req);

            if (res.accountingPayment != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetAccountingPaymentRequest](../../models/operations/GetAccountingPaymentRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingPaymentResponse](../../models/operations/GetAccountingPaymentResponse.md)**


## getAccountingTaxrate

Retrieve a taxrate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateRequest req = new GetAccountingTaxrateRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateResponse res = sdk.accounting.getAccountingTaxrate(req);

            if (res.accountingTaxrate != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateRequest](../../models/operations/GetAccountingTaxrateRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateResponse](../../models/operations/GetAccountingTaxrateResponse.md)**


## getAccountingTransaction

Retrieve a transaction

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingTransactionRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingTransactionResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetAccountingTransactionRequest req = new GetAccountingTransactionRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingTransactionResponse res = sdk.accounting.getAccountingTransaction(req);

            if (res.accountingTransaction != null) {
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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetAccountingTransactionRequest](../../models/operations/GetAccountingTransactionRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingTransactionResponse](../../models/operations/GetAccountingTransactionResponse.md)**


## listAccountingAccounts

List all accounts

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingAccountsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingAccountsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListAccountingAccountsRequest req = new ListAccountingAccountsRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 9476.86d;
                offset = 5444.77d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2024-04-19T21:33:28.191Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingAccountsResponse res = sdk.accounting.listAccountingAccounts(req);

            if (res.accountingAccounts != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListAccountingAccountsRequest](../../models/operations/ListAccountingAccountsRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingAccountsResponse](../../models/operations/ListAccountingAccountsResponse.md)**


## listAccountingCustomers

List all customers

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingCustomersRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingCustomersResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListAccountingCustomersRequest req = new ListAccountingCustomersRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 7844.09d;
                offset = 4439.53d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2022-08-23T18:23:01.069Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingCustomersResponse res = sdk.accounting.listAccountingCustomers(req);

            if (res.accountingCustomers != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.ListAccountingCustomersRequest](../../models/operations/ListAccountingCustomersRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingCustomersResponse](../../models/operations/ListAccountingCustomersResponse.md)**


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

            com.unifiedapi.unifiedto.models.operations.ListAccountingInvoicesResponse res = sdk.accounting.listAccountingInvoices(req);

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


## listAccountingItems

List all items

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingItemsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingItemsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListAccountingItemsRequest req = new ListAccountingItemsRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 5739.49d;
                offset = 6744.69d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2023-11-10T17:07:55.262Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingItemsResponse res = sdk.accounting.listAccountingItems(req);

            if (res.accountingItems != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListAccountingItemsRequest](../../models/operations/ListAccountingItemsRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingItemsResponse](../../models/operations/ListAccountingItemsResponse.md)**


## listAccountingOrganizations

List all organizations

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingOrganizationsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingOrganizationsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListAccountingOrganizationsRequest req = new ListAccountingOrganizationsRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 4896.89d;
                offset = 9817.05d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2023-04-02T18:55:09.644Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingOrganizationsResponse res = sdk.accounting.listAccountingOrganizations(req);

            if (res.accountingOrganizations != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListAccountingOrganizationsRequest](../../models/operations/ListAccountingOrganizationsRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingOrganizationsResponse](../../models/operations/ListAccountingOrganizationsResponse.md)**


## listAccountingPayments

List all payments

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingPaymentsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingPaymentsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListAccountingPaymentsRequest req = new ListAccountingPaymentsRequest(
                "string"){{
                customerId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                invoiceId = "string";
                limit = 487.78d;
                offset = 9308.83d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2024-02-25T18:15:35.411Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingPaymentsResponse res = sdk.accounting.listAccountingPayments(req);

            if (res.accountingPayments != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListAccountingPaymentsRequest](../../models/operations/ListAccountingPaymentsRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingPaymentsResponse](../../models/operations/ListAccountingPaymentsResponse.md)**


## listAccountingTaxrates

List all taxrates

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesRequest req = new ListAccountingTaxratesRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 1599.19d;
                offset = 1097.48d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2023-06-14T14:31:13.247Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesResponse res = sdk.accounting.listAccountingTaxrates(req);

            if (res.accountingTaxrates != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesRequest](../../models/operations/ListAccountingTaxratesRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesResponse](../../models/operations/ListAccountingTaxratesResponse.md)**


## listAccountingTransactions

List all transactions

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingTransactionsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingTransactionsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListAccountingTransactionsRequest req = new ListAccountingTransactionsRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 7894.5d;
                offset = 4597.84d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2024-12-02T12:20:43.572Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingTransactionsResponse res = sdk.accounting.listAccountingTransactions(req);

            if (res.accountingTransactions != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.ListAccountingTransactionsRequest](../../models/operations/ListAccountingTransactionsRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingTransactionsResponse](../../models/operations/ListAccountingTransactionsResponse.md)**


## patchAccountingAccount

Update an account

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingAccountRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingAccountResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingAccount;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingAccountRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Status;
import com.unifiedapi.unifiedto.models.shared.Type;
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

            com.unifiedapi.unifiedto.models.operations.PatchAccountingAccountRequest req = new PatchAccountingAccountRequest(
                "string",
                "string"){{
                accountingAccount = new AccountingAccount(
                    "string"){{
                    balance = 1931.26d;
                    bankAccountNumber = "string";
                    createdAt = OffsetDateTime.parse("2023-01-09T13:35:06.969Z");
                    currency = "Won";
                    customerDefinedCode = "string";
                    description = "Quality-focused multimedia implementation";
                    id = "<ID>";
                    raw = new PropertyAccountingAccountRaw(
);
                    status = Status.ARCHIVED;
                    type = Type.REVENUE;
                    updatedAt = OffsetDateTime.parse("2024-12-10T10:46:36.474Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingAccountResponse res = sdk.accounting.patchAccountingAccount(req);

            if (res.accountingAccount != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchAccountingAccountRequest](../../models/operations/PatchAccountingAccountRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAccountingAccountResponse](../../models/operations/PatchAccountingAccountResponse.md)**


## patchAccountingCustomer

Update a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingCustomerResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingCustomer;
import com.unifiedapi.unifiedto.models.shared.AccountingEmail;
import com.unifiedapi.unifiedto.models.shared.AccountingEmailType;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephone;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerBillingAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerShippingAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TaxExemption;
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

            com.unifiedapi.unifiedto.models.operations.PatchAccountingCustomerRequest req = new PatchAccountingCustomerRequest(
                "string",
                "string"){{
                accountingCustomer = new AccountingCustomer(
){{
                    billingAddress = new PropertyAccountingCustomerBillingAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Visalia";
                        country = "Norway";
                        countryCode = "LY";
                        postalCode = "50996-7347";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2024-08-26T22:13:14.646Z");
                    currency = "Kina";
                    emails = new com.unifiedapi.unifiedto.models.shared.AccountingEmail[]{{
                        add(new AccountingEmail(
                        "string"){{
                            email = "Imani57@yahoo.com";
                        }}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new PropertyAccountingCustomerRaw(
);
                    shippingAddress = new PropertyAccountingCustomerShippingAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Haltom City";
                        country = "Uruguay";
                        countryCode = "ZA";
                        postalCode = "10354-8050";
                        region = "string";
                        regionCode = "string";

                    }};
                    taxExemption = TaxExemption.LOCAL_GOV;
                    taxNumber = "string";
                    telephones = new com.unifiedapi.unifiedto.models.shared.AccountingTelephone[]{{
                        add(new AccountingTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-02-08T14:56:18.103Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingCustomerResponse res = sdk.accounting.patchAccountingCustomer(req);

            if (res.accountingCustomer != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchAccountingCustomerRequest](../../models/operations/PatchAccountingCustomerRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAccountingCustomerResponse](../../models/operations/PatchAccountingCustomerResponse.md)**


## patchAccountingInvoice

Update a invoice

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoice;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoiceStatus;
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
                    status = AccountingInvoiceStatus.DRAFT;
                    taxAmount = 1140.08d;
                    totalAmount = 4543.48d;
                    updatedAt = OffsetDateTime.parse("2024-02-02T12:10:13.037Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingInvoiceResponse res = sdk.accounting.patchAccountingInvoice(req);

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


## patchAccountingItem

Update an item

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingItemRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingItemResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingItem;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingItemRaw;
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

            com.unifiedapi.unifiedto.models.operations.PatchAccountingItemRequest req = new PatchAccountingItemRequest(
                "string",
                "string"){{
                accountingItem = new AccountingItem(
                    "string"){{
                    createdAt = OffsetDateTime.parse("2022-09-12T01:22:35.181Z");
                    description = "Operative coherent forecast";
                    id = "<ID>";
                    isActive = false;
                    isTaxable = false;
                    price = 1007.53d;
                    publicDescription = "string";
                    quantityOnHand = 3510.34d;
                    raw = new PropertyAccountingItemRaw(
);
                    sku = "string";
                    updatedAt = OffsetDateTime.parse("2023-11-19T01:12:30.848Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingItemResponse res = sdk.accounting.patchAccountingItem(req);

            if (res.accountingItem != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchAccountingItemRequest](../../models/operations/PatchAccountingItemRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAccountingItemResponse](../../models/operations/PatchAccountingItemResponse.md)**


## patchAccountingPayment

Update a payment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingPaymentRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingPaymentResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingPayment;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingPaymentRaw;
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

            com.unifiedapi.unifiedto.models.operations.PatchAccountingPaymentRequest req = new PatchAccountingPaymentRequest(
                "string",
                "string"){{
                accountingPayment = new AccountingPayment(
){{
                    accountId = "string";
                    createdAt = OffsetDateTime.parse("2022-02-25T02:56:43.385Z");
                    currency = "Boliviano boliviano";
                    customerId = "string";
                    id = "<ID>";
                    invoiceId = "string";
                    notes = "string";
                    paymentMethod = "string";
                    raw = new PropertyAccountingPaymentRaw(
);
                    reference = "string";
                    totalAmount = 8698.74d;
                    updatedAt = OffsetDateTime.parse("2023-11-08T12:40:48.671Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingPaymentResponse res = sdk.accounting.patchAccountingPayment(req);

            if (res.accountingPayment != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchAccountingPaymentRequest](../../models/operations/PatchAccountingPaymentRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAccountingPaymentResponse](../../models/operations/PatchAccountingPaymentResponse.md)**


## patchAccountingTaxrate

Update a taxrate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingTaxrate;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingTaxrateRaw;
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

            com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateRequest req = new PatchAccountingTaxrateRequest(
                "string",
                "string"){{
                accountingTaxrate = new AccountingTaxrate(
                    "string",
                    5991.47d){{
                    createdAt = OffsetDateTime.parse("2024-01-29T22:02:36.650Z");
                    description = "Upgradable coherent adapter";
                    id = "<ID>";
                    isActive = false;
                    raw = new PropertyAccountingTaxrateRaw(
);
                    updatedAt = OffsetDateTime.parse("2024-01-17T10:44:31.599Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateResponse res = sdk.accounting.patchAccountingTaxrate(req);

            if (res.accountingTaxrate != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateRequest](../../models/operations/PatchAccountingTaxrateRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateResponse](../../models/operations/PatchAccountingTaxrateResponse.md)**


## patchAccountingTransaction

Update a transaction

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingTransactionRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingTransactionResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingTransaction;
import com.unifiedapi.unifiedto.models.shared.AccountingTransactionLineitem;
import com.unifiedapi.unifiedto.models.shared.AccountingTransactionType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingTransactionRaw;
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

            com.unifiedapi.unifiedto.models.operations.PatchAccountingTransactionRequest req = new PatchAccountingTransactionRequest(
                "string",
                "string"){{
                accountingTransaction = new AccountingTransaction(
                    "string",
                    "string",
                    5633.69d,
                    AccountingTransactionType.RECEIVE){{
                    createdAt = "string";
                    currency = "European Monetary Unit (E.M.U.-6)";
                    description = "Implemented 6th generation extranet";
                    lineItems = new com.unifiedapi.unifiedto.models.shared.AccountingTransactionLineitem[]{{
                        add(new AccountingTransactionLineitem(
                        8716.58d){{
                            totalAmount = 259.82d;
                        }}),
                    }};
                    raw = new PropertyAccountingTransactionRaw(
);
                    reference = "string";
                    taxAmount = 1651.43d;
                    updatedAt = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingTransactionResponse res = sdk.accounting.patchAccountingTransaction(req);

            if (res.accountingTransaction != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchAccountingTransactionRequest](../../models/operations/PatchAccountingTransactionRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAccountingTransactionResponse](../../models/operations/PatchAccountingTransactionResponse.md)**


## removeAccountingAccount

Remove an account

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingAccountRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingAccountResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingAccountRequest req = new RemoveAccountingAccountRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingAccountResponse res = sdk.accounting.removeAccountingAccount(req);

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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingAccountRequest](../../models/operations/RemoveAccountingAccountRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAccountingAccountResponse](../../models/operations/RemoveAccountingAccountResponse.md)**


## removeAccountingCustomer

Remove a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingCustomerResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingCustomerRequest req = new RemoveAccountingCustomerRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingCustomerResponse res = sdk.accounting.removeAccountingCustomer(req);

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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingCustomerRequest](../../models/operations/RemoveAccountingCustomerRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAccountingCustomerResponse](../../models/operations/RemoveAccountingCustomerResponse.md)**


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

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingInvoiceResponse res = sdk.accounting.removeAccountingInvoice(req);

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


## removeAccountingItem

Remove an item

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingItemRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingItemResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingItemRequest req = new RemoveAccountingItemRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingItemResponse res = sdk.accounting.removeAccountingItem(req);

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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingItemRequest](../../models/operations/RemoveAccountingItemRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAccountingItemResponse](../../models/operations/RemoveAccountingItemResponse.md)**


## removeAccountingPayment

Remove a payment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingPaymentRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingPaymentResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingPaymentRequest req = new RemoveAccountingPaymentRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingPaymentResponse res = sdk.accounting.removeAccountingPayment(req);

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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingPaymentRequest](../../models/operations/RemoveAccountingPaymentRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAccountingPaymentResponse](../../models/operations/RemoveAccountingPaymentResponse.md)**


## removeAccountingTaxrate

Remove a taxrate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingTaxrateRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingTaxrateResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingTaxrateRequest req = new RemoveAccountingTaxrateRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingTaxrateResponse res = sdk.accounting.removeAccountingTaxrate(req);

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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingTaxrateRequest](../../models/operations/RemoveAccountingTaxrateRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAccountingTaxrateResponse](../../models/operations/RemoveAccountingTaxrateResponse.md)**


## removeAccountingTransaction

Remove a transaction

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingTransactionRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingTransactionResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingTransactionRequest req = new RemoveAccountingTransactionRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingTransactionResponse res = sdk.accounting.removeAccountingTransaction(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingTransactionRequest](../../models/operations/RemoveAccountingTransactionRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAccountingTransactionResponse](../../models/operations/RemoveAccountingTransactionResponse.md)**


## updateAccountingAccount

Update an account

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingAccountRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingAccountResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingAccount;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingAccountRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Status;
import com.unifiedapi.unifiedto.models.shared.Type;
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

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingAccountRequest req = new UpdateAccountingAccountRequest(
                "string",
                "string"){{
                accountingAccount = new AccountingAccount(
                    "string"){{
                    balance = 5954.09d;
                    bankAccountNumber = "string";
                    createdAt = OffsetDateTime.parse("2022-05-21T23:41:25.152Z");
                    currency = "Tanzanian Shilling";
                    customerDefinedCode = "string";
                    description = "Stand-alone grid-enabled model";
                    id = "<ID>";
                    raw = new PropertyAccountingAccountRaw(
);
                    status = Status.ACTIVE;
                    type = Type.BANK;
                    updatedAt = OffsetDateTime.parse("2022-04-02T20:00:03.765Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingAccountResponse res = sdk.accounting.updateAccountingAccount(req);

            if (res.accountingAccount != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingAccountRequest](../../models/operations/UpdateAccountingAccountRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAccountingAccountResponse](../../models/operations/UpdateAccountingAccountResponse.md)**


## updateAccountingCustomer

Update a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingCustomerResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingCustomer;
import com.unifiedapi.unifiedto.models.shared.AccountingEmail;
import com.unifiedapi.unifiedto.models.shared.AccountingEmailType;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephone;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerBillingAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerShippingAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TaxExemption;
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

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingCustomerRequest req = new UpdateAccountingCustomerRequest(
                "string",
                "string"){{
                accountingCustomer = new AccountingCustomer(
){{
                    billingAddress = new PropertyAccountingCustomerBillingAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Renton";
                        country = "Iceland";
                        countryCode = "VN";
                        postalCode = "77223-4340";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2024-05-08T03:21:30.283Z");
                    currency = "Guinea Franc";
                    emails = new com.unifiedapi.unifiedto.models.shared.AccountingEmail[]{{
                        add(new AccountingEmail(
                        "string"){{
                            email = "Johnson53@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new PropertyAccountingCustomerRaw(
);
                    shippingAddress = new PropertyAccountingCustomerShippingAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Catalina Foothills";
                        country = "Eritrea";
                        countryCode = "MZ";
                        postalCode = "44150";
                        region = "string";
                        regionCode = "string";

                    }};
                    taxExemption = TaxExemption.CHARITABLE_ORG;
                    taxNumber = "string";
                    telephones = new com.unifiedapi.unifiedto.models.shared.AccountingTelephone[]{{
                        add(new AccountingTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-07-26T22:42:35.557Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingCustomerResponse res = sdk.accounting.updateAccountingCustomer(req);

            if (res.accountingCustomer != null) {
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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingCustomerRequest](../../models/operations/UpdateAccountingCustomerRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAccountingCustomerResponse](../../models/operations/UpdateAccountingCustomerResponse.md)**


## updateAccountingInvoice

Update a invoice

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoice;
import com.unifiedapi.unifiedto.models.shared.AccountingInvoiceStatus;
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
                    status = AccountingInvoiceStatus.AUTHORIZED;
                    taxAmount = 3824.24d;
                    totalAmount = 2939.97d;
                    updatedAt = OffsetDateTime.parse("2022-08-13T18:41:11.569Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingInvoiceResponse res = sdk.accounting.updateAccountingInvoice(req);

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


## updateAccountingItem

Update an item

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingItemRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingItemResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingItem;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingItemRaw;
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

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingItemRequest req = new UpdateAccountingItemRequest(
                "string",
                "string"){{
                accountingItem = new AccountingItem(
                    "string"){{
                    createdAt = OffsetDateTime.parse("2022-03-31T23:31:53.009Z");
                    description = "Programmable modular artificial intelligence";
                    id = "<ID>";
                    isActive = false;
                    isTaxable = false;
                    price = 3314.34d;
                    publicDescription = "string";
                    quantityOnHand = 9226.47d;
                    raw = new PropertyAccountingItemRaw(
);
                    sku = "string";
                    updatedAt = OffsetDateTime.parse("2022-12-09T06:37:51.326Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingItemResponse res = sdk.accounting.updateAccountingItem(req);

            if (res.accountingItem != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingItemRequest](../../models/operations/UpdateAccountingItemRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAccountingItemResponse](../../models/operations/UpdateAccountingItemResponse.md)**


## updateAccountingPayment

Update a payment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingPaymentRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingPaymentResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingPayment;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingPaymentRaw;
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

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingPaymentRequest req = new UpdateAccountingPaymentRequest(
                "string",
                "string"){{
                accountingPayment = new AccountingPayment(
){{
                    accountId = "string";
                    createdAt = OffsetDateTime.parse("2022-01-04T17:30:16.475Z");
                    currency = "Sudanese Pound";
                    customerId = "string";
                    id = "<ID>";
                    invoiceId = "string";
                    notes = "string";
                    paymentMethod = "string";
                    raw = new PropertyAccountingPaymentRaw(
);
                    reference = "string";
                    totalAmount = 1869.63d;
                    updatedAt = OffsetDateTime.parse("2022-05-14T18:33:08.394Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingPaymentResponse res = sdk.accounting.updateAccountingPayment(req);

            if (res.accountingPayment != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingPaymentRequest](../../models/operations/UpdateAccountingPaymentRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAccountingPaymentResponse](../../models/operations/UpdateAccountingPaymentResponse.md)**


## updateAccountingTaxrate

Update a taxrate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingTaxrate;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingTaxrateRaw;
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

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateRequest req = new UpdateAccountingTaxrateRequest(
                "string",
                "string"){{
                accountingTaxrate = new AccountingTaxrate(
                    "string",
                    3382.78d){{
                    createdAt = OffsetDateTime.parse("2024-07-16T01:24:36.188Z");
                    description = "Open-source human-resource database";
                    id = "<ID>";
                    isActive = false;
                    raw = new PropertyAccountingTaxrateRaw(
);
                    updatedAt = OffsetDateTime.parse("2022-03-21T10:57:59.053Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateResponse res = sdk.accounting.updateAccountingTaxrate(req);

            if (res.accountingTaxrate != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateRequest](../../models/operations/UpdateAccountingTaxrateRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateResponse](../../models/operations/UpdateAccountingTaxrateResponse.md)**


## updateAccountingTransaction

Update a transaction

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingTransactionRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingTransactionResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingTransaction;
import com.unifiedapi.unifiedto.models.shared.AccountingTransactionLineitem;
import com.unifiedapi.unifiedto.models.shared.AccountingTransactionType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingTransactionRaw;
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

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingTransactionRequest req = new UpdateAccountingTransactionRequest(
                "string",
                "string"){{
                accountingTransaction = new AccountingTransaction(
                    "string",
                    "string",
                    6498.37d,
                    AccountingTransactionType.SPEND){{
                    createdAt = "string";
                    currency = "CFP Franc";
                    description = "Reactive content-based collaboration";
                    lineItems = new com.unifiedapi.unifiedto.models.shared.AccountingTransactionLineitem[]{{
                        add(new AccountingTransactionLineitem(
                        8603.41d){{
                            totalAmount = 421.84d;
                        }}),
                    }};
                    raw = new PropertyAccountingTransactionRaw(
);
                    reference = "string";
                    taxAmount = 7972.27d;
                    updatedAt = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingTransactionResponse res = sdk.accounting.updateAccountingTransaction(req);

            if (res.accountingTransaction != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingTransactionRequest](../../models/operations/UpdateAccountingTransactionRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAccountingTransactionResponse](../../models/operations/UpdateAccountingTransactionResponse.md)**

