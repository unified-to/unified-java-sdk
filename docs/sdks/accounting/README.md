# Accounting
(*accounting*)

### Available Operations

* [createAccountingAccount](#createaccountingaccount) - Create an account
* [createAccountingContact](#createaccountingcontact) - Create a contact
* [createAccountingInvoice](#createaccountinginvoice) - Create a invoice
* [createAccountingTaxrate](#createaccountingtaxrate) - Create a taxrate
* [createAccountingTransaction](#createaccountingtransaction) - Create a transaction
* [getAccountingAccount](#getaccountingaccount) - Retrieve an account
* [getAccountingContact](#getaccountingcontact) - Retrieve a contact
* [getAccountingInvoice](#getaccountinginvoice) - Retrieve a invoice
* [getAccountingOrganization](#getaccountingorganization) - Retrieve an organization
* [getAccountingTaxrate](#getaccountingtaxrate) - Retrieve a taxrate
* [getAccountingTransaction](#getaccountingtransaction) - Retrieve a transaction
* [listAccountingAccounts](#listaccountingaccounts) - List all accounts
* [listAccountingContacts](#listaccountingcontacts) - List all contacts
* [listAccountingInvoices](#listaccountinginvoices) - List all invoices
* [listAccountingOrganizations](#listaccountingorganizations) - List all organizations
* [listAccountingTaxrates](#listaccountingtaxrates) - List all taxrates
* [listAccountingTransactions](#listaccountingtransactions) - List all transactions
* [patchAccountingAccount](#patchaccountingaccount) - Update an account
* [patchAccountingContact](#patchaccountingcontact) - Update a contact
* [patchAccountingInvoice](#patchaccountinginvoice) - Update a invoice
* [patchAccountingTaxrate](#patchaccountingtaxrate) - Update a taxrate
* [patchAccountingTransaction](#patchaccountingtransaction) - Update a transaction
* [removeAccountingAccount](#removeaccountingaccount) - Remove an account
* [removeAccountingContact](#removeaccountingcontact) - Remove a contact
* [removeAccountingInvoice](#removeaccountinginvoice) - Remove a invoice
* [removeAccountingTaxrate](#removeaccountingtaxrate) - Remove a taxrate
* [removeAccountingTransaction](#removeaccountingtransaction) - Remove a transaction
* [updateAccountingAccount](#updateaccountingaccount) - Update an account
* [updateAccountingContact](#updateaccountingcontact) - Update a contact
* [updateAccountingInvoice](#updateaccountinginvoice) - Update a invoice
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
                "<value>"){{
                accountingAccount = new AccountingAccount(
                    "<value>"){{
                    balance = 6602.56d;
                    createdAt = OffsetDateTime.parse("2023-09-02T22:12:31.771Z");
                    currency = "Saint Helena Pound";
                    customerDefinedCode = "<value>";
                    description = "Cross-group zero defect task-force";
                    id = "<id>";
                    isPayable = false;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
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


## createAccountingContact

Create a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingContactRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingContactResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingContact;
import com.unifiedapi.unifiedto.models.shared.AccountingEmail;
import com.unifiedapi.unifiedto.models.shared.AccountingEmailType;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephone;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingContactBillingAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingContactShippingAddress;
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

            com.unifiedapi.unifiedto.models.operations.CreateAccountingContactRequest req = new CreateAccountingContactRequest(
                "<value>"){{
                accountingContact = new AccountingContact(
){{
                    billingAddress = new PropertyAccountingContactBillingAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Lake Benny";
                        country = "Azerbaijan";
                        countryCode = "GT";
                        postalCode = "48359-3238";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    createdAt = OffsetDateTime.parse("2024-02-19T03:22:44.048Z");
                    currency = "Peso Uruguayo";
                    emails = new com.unifiedapi.unifiedto.models.shared.AccountingEmail[]{{
                        add(new AccountingEmail(
                        "<value>"){{
                            email = "Ubaldo_Cruickshank82@hotmail.com";
                        }}),
                    }};
                    id = "<id>";
                    isActive = false;
                    isCustomer = false;
                    isSupplier = false;
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    shippingAddress = new PropertyAccountingContactShippingAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "North Jazmynefurt";
                        country = "France";
                        countryCode = "BE";
                        postalCode = "36835-6542";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    taxExemption = TaxExemption.FEDERAL_GOV;
                    taxNumber = "<value>";
                    telephones = new com.unifiedapi.unifiedto.models.shared.AccountingTelephone[]{{
                        add(new AccountingTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-09-05T13:56:20.676Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingContactResponse res = sdk.accounting.createAccountingContact(req);

            if (res.accountingContact != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.CreateAccountingContactRequest](../../models/operations/CreateAccountingContactRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAccountingContactResponse](../../models/operations/CreateAccountingContactResponse.md)**


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
                    url = "http://forked-idiom.biz";

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


## createAccountingTaxrate

Create a taxrate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingTaxrate;
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
                "<value>"){{
                accountingTaxrate = new AccountingTaxrate(
                    "<value>",
                    1719.1d){{
                    createdAt = OffsetDateTime.parse("2022-09-20T17:06:11.018Z");
                    description = "Ergonomic regional neural-net";
                    id = "<id>";
                    isActive = false;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
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
                "<value>"){{
                accountingTransaction = new AccountingTransaction(
                    "<value>"){{
                    createdAt = "<value>";
                    currency = "Libyan Dinar";
                    description = "Pre-emptive multimedia benchmark";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingTransactionLineitem[]{{
                        add(new AccountingTransactionLineitem(
                        "<value>",
                        7389.88d){{
                            accountId = "<value>";
                            totalAmount = 2477.45d;
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    reference = "<value>";
                    taxAmount = 8276.07d;
                    taxrateId = "<value>";
                    updatedAt = "<value>";

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
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
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


## getAccountingContact

Retrieve a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingContactRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingContactResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetAccountingContactRequest req = new GetAccountingContactRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingContactResponse res = sdk.accounting.getAccountingContact(req);

            if (res.accountingContact != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetAccountingContactRequest](../../models/operations/GetAccountingContactRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingContactResponse](../../models/operations/GetAccountingContactResponse.md)**


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
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
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
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
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
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
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
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
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
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 9476.86d;
                offset = 5444.77d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
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


## listAccountingContacts

List all contacts

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingContactsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingContactsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListAccountingContactsRequest req = new ListAccountingContactsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 4596.32d;
                offset = 8881.9d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                type = "<value>";
                updatedGte = OffsetDateTime.parse("2023-09-26T14:00:38.736Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingContactsResponse res = sdk.accounting.listAccountingContacts(req);

            if (res.accountingContacts != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListAccountingContactsRequest](../../models/operations/ListAccountingContactsRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingContactsResponse](../../models/operations/ListAccountingContactsResponse.md)**


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
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 4896.89d;
                offset = 9817.05d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
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
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 1599.19d;
                offset = 1097.48d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
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
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 7894.5d;
                offset = 4597.84d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
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
                "<value>",
                "<value>"){{
                accountingAccount = new AccountingAccount(
                    "<value>"){{
                    balance = 1931.26d;
                    createdAt = OffsetDateTime.parse("2023-01-09T13:35:06.969Z");
                    currency = "Won";
                    customerDefinedCode = "<value>";
                    description = "Quality-focused multimedia implementation";
                    id = "<id>";
                    isPayable = false;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
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


## patchAccountingContact

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingContactRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingContactResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingContact;
import com.unifiedapi.unifiedto.models.shared.AccountingEmail;
import com.unifiedapi.unifiedto.models.shared.AccountingEmailType;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephone;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingContactBillingAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingContactShippingAddress;
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

            com.unifiedapi.unifiedto.models.operations.PatchAccountingContactRequest req = new PatchAccountingContactRequest(
                "<value>",
                "<value>"){{
                accountingContact = new AccountingContact(
){{
                    billingAddress = new PropertyAccountingContactBillingAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Sylvestermouth";
                        country = "Norfolk Island";
                        countryCode = "BN";
                        postalCode = "34531-3519";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    createdAt = OffsetDateTime.parse("2024-02-14T18:48:39.369Z");
                    currency = "Singapore Dollar";
                    emails = new com.unifiedapi.unifiedto.models.shared.AccountingEmail[]{{
                        add(new AccountingEmail(
                        "<value>"){{
                            email = "Anya_Murphy@yahoo.com";
                        }}),
                    }};
                    id = "<id>";
                    isActive = false;
                    isCustomer = false;
                    isSupplier = false;
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    shippingAddress = new PropertyAccountingContactShippingAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "O'Connellburgh";
                        country = "Guinea-Bissau";
                        countryCode = "MV";
                        postalCode = "91251-4209";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    taxExemption = TaxExemption.EDUCATIONAL_ORG;
                    taxNumber = "<value>";
                    telephones = new com.unifiedapi.unifiedto.models.shared.AccountingTelephone[]{{
                        add(new AccountingTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-01-11T11:33:25.380Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingContactResponse res = sdk.accounting.patchAccountingContact(req);

            if (res.accountingContact != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchAccountingContactRequest](../../models/operations/PatchAccountingContactRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAccountingContactResponse](../../models/operations/PatchAccountingContactResponse.md)**


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
                    url = "http://creepy-dart.org";

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


## patchAccountingTaxrate

Update a taxrate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingTaxrate;
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
                "<value>",
                "<value>"){{
                accountingTaxrate = new AccountingTaxrate(
                    "<value>",
                    5991.47d){{
                    createdAt = OffsetDateTime.parse("2024-01-29T22:02:36.650Z");
                    description = "Upgradable coherent adapter";
                    id = "<id>";
                    isActive = false;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
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
                "<value>",
                "<value>"){{
                accountingTransaction = new AccountingTransaction(
                    "<value>"){{
                    createdAt = "<value>";
                    currency = "Kwacha";
                    description = "Multi-channelled transitional function";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingTransactionLineitem[]{{
                        add(new AccountingTransactionLineitem(
                        "<value>",
                        3153.09d){{
                            accountId = "<value>";
                            totalAmount = 535.65d;
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    reference = "<value>";
                    taxAmount = 259.82d;
                    taxrateId = "<value>";
                    updatedAt = "<value>";

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
                "<value>",
                "<value>");

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


## removeAccountingContact

Remove a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingContactRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingContactResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingContactRequest req = new RemoveAccountingContactRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingContactResponse res = sdk.accounting.removeAccountingContact(req);

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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingContactRequest](../../models/operations/RemoveAccountingContactRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAccountingContactResponse](../../models/operations/RemoveAccountingContactResponse.md)**


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
                "<value>",
                "<value>");

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
                "<value>",
                "<value>");

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
                "<value>",
                "<value>");

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
                "<value>",
                "<value>"){{
                accountingAccount = new AccountingAccount(
                    "<value>"){{
                    balance = 5954.09d;
                    createdAt = OffsetDateTime.parse("2022-05-21T23:41:25.152Z");
                    currency = "Tanzanian Shilling";
                    customerDefinedCode = "<value>";
                    description = "Stand-alone grid-enabled model";
                    id = "<id>";
                    isPayable = false;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
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


## updateAccountingContact

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingContactRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingContactResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingContact;
import com.unifiedapi.unifiedto.models.shared.AccountingEmail;
import com.unifiedapi.unifiedto.models.shared.AccountingEmailType;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephone;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingContactBillingAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingContactShippingAddress;
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

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingContactRequest req = new UpdateAccountingContactRequest(
                "<value>",
                "<value>"){{
                accountingContact = new AccountingContact(
){{
                    billingAddress = new PropertyAccountingContactBillingAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Mayaguez";
                        country = "Ghana";
                        countryCode = "JE";
                        postalCode = "16521-4269";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    createdAt = OffsetDateTime.parse("2023-02-14T04:27:23.372Z");
                    currency = "European Monetary Unit (E.M.U.-6)";
                    emails = new com.unifiedapi.unifiedto.models.shared.AccountingEmail[]{{
                        add(new AccountingEmail(
                        "<value>"){{
                            email = "Kevin.Leffler@gmail.com";
                        }}),
                    }};
                    id = "<id>";
                    isActive = false;
                    isCustomer = false;
                    isSupplier = false;
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    shippingAddress = new PropertyAccountingContactShippingAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Port Arely";
                        country = "Norway";
                        countryCode = "GP";
                        postalCode = "99093-9229";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    taxExemption = TaxExemption.MEDICAL_ORG;
                    taxNumber = "<value>";
                    telephones = new com.unifiedapi.unifiedto.models.shared.AccountingTelephone[]{{
                        add(new AccountingTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-08-30T07:55:45.909Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingContactResponse res = sdk.accounting.updateAccountingContact(req);

            if (res.accountingContact != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingContactRequest](../../models/operations/UpdateAccountingContactRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAccountingContactResponse](../../models/operations/UpdateAccountingContactResponse.md)**


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
                    url = "https://admirable-suspension.org";

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


## updateAccountingTaxrate

Update a taxrate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingTaxrate;
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
                "<value>",
                "<value>"){{
                accountingTaxrate = new AccountingTaxrate(
                    "<value>",
                    3382.78d){{
                    createdAt = OffsetDateTime.parse("2024-07-16T01:24:36.188Z");
                    description = "Open-source human-resource database";
                    id = "<id>";
                    isActive = false;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
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
                "<value>",
                "<value>"){{
                accountingTransaction = new AccountingTransaction(
                    "<value>"){{
                    createdAt = "<value>";
                    currency = "Zloty";
                    description = "Organic web-enabled orchestration";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingTransactionLineitem[]{{
                        add(new AccountingTransactionLineitem(
                        "<value>",
                        1897.48d){{
                            accountId = "<value>";
                            totalAmount = 2397.73d;
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    reference = "<value>";
                    taxAmount = 421.84d;
                    taxrateId = "<value>";
                    updatedAt = "<value>";

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

