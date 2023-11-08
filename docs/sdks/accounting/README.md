# Accounting
(*accounting*)

### Available Operations

* [createAccountingCustomer](#createaccountingcustomer) - Create a customer
* [createAccountingInvoice](#createaccountinginvoice) - Create a invoice
* [createAccountingPayment](#createaccountingpayment) - Create a payment
* [getAccountingCustomer](#getaccountingcustomer) - Retrieve a customer
* [getAccountingInvoice](#getaccountinginvoice) - Retrieve a invoice
* [getAccountingPayment](#getaccountingpayment) - Retrieve a payment
* [listAccountingCustomers](#listaccountingcustomers) - List all customers
* [listAccountingInvoices](#listaccountinginvoices) - List all invoices
* [listAccountingPayments](#listaccountingpayments) - List all payments
* [patchAccountingCustomer](#patchaccountingcustomer) - Update a customer
* [patchAccountingInvoice](#patchaccountinginvoice) - Update a invoice
* [patchAccountingPayment](#patchaccountingpayment) - Update a payment
* [removeAccountingCustomer](#removeaccountingcustomer) - Remove a customer
* [removeAccountingInvoice](#removeaccountinginvoice) - Remove a invoice
* [removeAccountingPayment](#removeaccountingpayment) - Remove a payment
* [updateAccountingCustomer](#updateaccountingcustomer) - Update a customer
* [updateAccountingInvoice](#updateaccountinginvoice) - Update a invoice
* [updateAccountingPayment](#updateaccountingpayment) - Update a payment

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
import com.unifiedapi.unifiedto.models.shared.AccountingTelephone;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerBillingAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerShippingAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TaxExemption;
import com.unifiedapi.unifiedto.models.shared.Type;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            CreateAccountingCustomerRequest req = new CreateAccountingCustomerRequest("string"){{
                accountingCustomer = new AccountingCustomer(){{
                    billingAddress = new PropertyAccountingCustomerBillingAddress(){{
                        address1 = "string";
                        address2 = "string";
                        city = "New Raulfield";
                        country = "Libyan Arab Jamahiriya";
                        countryCode = "IN";
                        postalCode = "22232";
                        region = "string";
                        regionCode = "string";
                    }};
                    createdAt = OffsetDateTime.parse("2021-07-22T19:16:48.798Z");
                    currency = "Dalasi";
                    emails = new com.unifiedapi.unifiedto.models.shared.AccountingEmail[]{{
                        add(new AccountingEmail("string"){{
                            email = "Loren78@gmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new PropertyAccountingCustomerRaw();
                    shippingAddress = new PropertyAccountingCustomerShippingAddress(){{
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
                    telephones = new com.unifiedapi.unifiedto.models.shared.AccountingTelephone[]{{
                        add(new AccountingTelephone("string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-12-07T14:42:11.734Z");
                }};
            }};            

            CreateAccountingCustomerResponse res = sdk.accounting.createAccountingCustomer(req);

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

            CreateAccountingInvoiceResponse res = sdk.accounting.createAccountingInvoice(req);

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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            CreateAccountingPaymentRequest req = new CreateAccountingPaymentRequest("string"){{
                accountingPayment = new AccountingPayment(){{
                    createdAt = OffsetDateTime.parse("2023-01-27T20:38:27.181Z");
                    currency = "Lari";
                    customerId = "string";
                    id = "<ID>";
                    invoiceIds = new String[]{{
                        add("string"),
                    }};
                    notes = "string";
                    paymentMethod = "string";
                    raw = new PropertyAccountingPaymentRaw();
                    reference = "string";
                    totalAmount = 291.36d;
                    updatedAt = OffsetDateTime.parse("2022-09-30T13:35:20.411Z");
                }};
            }};            

            CreateAccountingPaymentResponse res = sdk.accounting.createAccountingPayment(req);

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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            GetAccountingCustomerRequest req = new GetAccountingCustomerRequest("string", "string"){{
                fields = new String[]{{
                    add("string"),
                }};
            }};            

            GetAccountingCustomerResponse res = sdk.accounting.getAccountingCustomer(req);

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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            GetAccountingInvoiceRequest req = new GetAccountingInvoiceRequest("string", "string"){{
                fields = new String[]{{
                    add("string"),
                }};
            }};            

            GetAccountingInvoiceResponse res = sdk.accounting.getAccountingInvoice(req);

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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            GetAccountingPaymentRequest req = new GetAccountingPaymentRequest("string", "string"){{
                fields = new String[]{{
                    add("string"),
                }};
            }};            

            GetAccountingPaymentResponse res = sdk.accounting.getAccountingPayment(req);

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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            ListAccountingCustomersRequest req = new ListAccountingCustomersRequest("string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 7844.09d;
                offset = 4439.53d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2021-08-23T13:14:33.970Z");
            }};            

            ListAccountingCustomersResponse res = sdk.accounting.listAccountingCustomers(req);

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

            ListAccountingInvoicesResponse res = sdk.accounting.listAccountingInvoices(req);

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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            ListAccountingPaymentsRequest req = new ListAccountingPaymentsRequest("string"){{
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
                updatedGte = OffsetDateTime.parse("2023-02-25T01:03:12.222Z");
            }};            

            ListAccountingPaymentsResponse res = sdk.accounting.listAccountingPayments(req);

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
import com.unifiedapi.unifiedto.models.shared.AccountingTelephone;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerBillingAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerShippingAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TaxExemption;
import com.unifiedapi.unifiedto.models.shared.Type;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            PatchAccountingCustomerRequest req = new PatchAccountingCustomerRequest("string", "string"){{
                accountingCustomer = new AccountingCustomer(){{
                    billingAddress = new PropertyAccountingCustomerBillingAddress(){{
                        address1 = "string";
                        address2 = "string";
                        city = "Visalia";
                        country = "Norway";
                        countryCode = "LY";
                        postalCode = "50996-7347";
                        region = "string";
                        regionCode = "string";
                    }};
                    createdAt = OffsetDateTime.parse("2023-08-27T01:00:12.169Z");
                    currency = "Kina";
                    emails = new com.unifiedapi.unifiedto.models.shared.AccountingEmail[]{{
                        add(new AccountingEmail("string"){{
                            email = "Imani57@yahoo.com";
                        }}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new PropertyAccountingCustomerRaw();
                    shippingAddress = new PropertyAccountingCustomerShippingAddress(){{
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
                    telephones = new com.unifiedapi.unifiedto.models.shared.AccountingTelephone[]{{
                        add(new AccountingTelephone("string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-02-08T06:05:59.693Z");
                }};
            }};            

            PatchAccountingCustomerResponse res = sdk.accounting.patchAccountingCustomer(req);

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

            PatchAccountingInvoiceResponse res = sdk.accounting.patchAccountingInvoice(req);

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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            PatchAccountingPaymentRequest req = new PatchAccountingPaymentRequest("string", "string"){{
                accountingPayment = new AccountingPayment(){{
                    createdAt = OffsetDateTime.parse("2021-02-25T01:44:17.944Z");
                    currency = "Boliviano boliviano";
                    customerId = "string";
                    id = "<ID>";
                    invoiceIds = new String[]{{
                        add("string"),
                    }};
                    notes = "string";
                    paymentMethod = "string";
                    raw = new PropertyAccountingPaymentRaw();
                    reference = "string";
                    totalAmount = 8698.74d;
                    updatedAt = OffsetDateTime.parse("2022-11-07T21:51:56.510Z");
                }};
            }};            

            PatchAccountingPaymentResponse res = sdk.accounting.patchAccountingPayment(req);

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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            RemoveAccountingCustomerRequest req = new RemoveAccountingCustomerRequest("string", "string");            

            RemoveAccountingCustomerResponse res = sdk.accounting.removeAccountingCustomer(req);

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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            RemoveAccountingInvoiceRequest req = new RemoveAccountingInvoiceRequest("string", "string");            

            RemoveAccountingInvoiceResponse res = sdk.accounting.removeAccountingInvoice(req);

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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            RemoveAccountingPaymentRequest req = new RemoveAccountingPaymentRequest("string", "string");            

            RemoveAccountingPaymentResponse res = sdk.accounting.removeAccountingPayment(req);

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
import com.unifiedapi.unifiedto.models.shared.AccountingTelephone;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerBillingAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerShippingAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TaxExemption;
import com.unifiedapi.unifiedto.models.shared.Type;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            UpdateAccountingCustomerRequest req = new UpdateAccountingCustomerRequest("string", "string"){{
                accountingCustomer = new AccountingCustomer(){{
                    billingAddress = new PropertyAccountingCustomerBillingAddress(){{
                        address1 = "string";
                        address2 = "string";
                        city = "Renton";
                        country = "Iceland";
                        countryCode = "VN";
                        postalCode = "77223-4340";
                        region = "string";
                        regionCode = "string";
                    }};
                    createdAt = OffsetDateTime.parse("2023-05-08T08:34:01.295Z");
                    currency = "Guinea Franc";
                    emails = new com.unifiedapi.unifiedto.models.shared.AccountingEmail[]{{
                        add(new AccountingEmail("string"){{
                            email = "Johnson53@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new PropertyAccountingCustomerRaw();
                    shippingAddress = new PropertyAccountingCustomerShippingAddress(){{
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
                    telephones = new com.unifiedapi.unifiedto.models.shared.AccountingTelephone[]{{
                        add(new AccountingTelephone("string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-07-26T10:11:07.824Z");
                }};
            }};            

            UpdateAccountingCustomerResponse res = sdk.accounting.updateAccountingCustomer(req);

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

            UpdateAccountingInvoiceResponse res = sdk.accounting.updateAccountingInvoice(req);

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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            UpdateAccountingPaymentRequest req = new UpdateAccountingPaymentRequest("string", "string"){{
                accountingPayment = new AccountingPayment(){{
                    createdAt = OffsetDateTime.parse("2021-01-04T17:25:22.482Z");
                    currency = "Sudanese Pound";
                    customerId = "string";
                    id = "<ID>";
                    invoiceIds = new String[]{{
                        add("string"),
                    }};
                    notes = "string";
                    paymentMethod = "string";
                    raw = new PropertyAccountingPaymentRaw();
                    reference = "string";
                    totalAmount = 1869.63d;
                    updatedAt = OffsetDateTime.parse("2021-05-14T15:37:22.784Z");
                }};
            }};            

            UpdateAccountingPaymentResponse res = sdk.accounting.updateAccountingPayment(req);

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
