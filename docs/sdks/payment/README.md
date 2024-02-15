# Payment
(*payment*)

### Available Operations

* [createAccountingPayment](#createaccountingpayment) - Create a payment
* [getAccountingPayment](#getaccountingpayment) - Retrieve a payment
* [listAccountingPayments](#listaccountingpayments) - List all payments
* [patchAccountingPayment](#patchaccountingpayment) - Update a payment
* [removeAccountingPayment](#removeaccountingpayment) - Remove a payment
* [updateAccountingPayment](#updateaccountingpayment) - Update a payment

## createAccountingPayment

Create a payment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingPaymentRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingPaymentResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingPayment;
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
                "<value>"){{
                accountingPayment = new AccountingPayment(
){{
                    accountId = "<value>";
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2024-01-28T13:13:46.548Z");
                    currency = "Lari";
                    id = "<id>";
                    invoiceId = "<value>";
                    notes = "<value>";
                    paymentMethod = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    reference = "<value>";
                    totalAmount = 291.36d;
                    updatedAt = OffsetDateTime.parse("2023-10-01T03:33:47.004Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingPaymentResponse res = sdk.payment.createAccountingPayment(req);

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
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingPaymentResponse res = sdk.payment.getAccountingPayment(req);

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
                "<value>"){{
                contactId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                invoiceId = "<value>";
                limit = 487.78d;
                offset = 9308.83d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2024-02-25T18:15:35.411Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingPaymentsResponse res = sdk.payment.listAccountingPayments(req);

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


## patchAccountingPayment

Update a payment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingPaymentRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingPaymentResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingPayment;
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
                "<value>",
                "<value>"){{
                accountingPayment = new AccountingPayment(
){{
                    accountId = "<value>";
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2022-02-25T02:56:43.385Z");
                    currency = "Boliviano boliviano";
                    id = "<id>";
                    invoiceId = "<value>";
                    notes = "<value>";
                    paymentMethod = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    reference = "<value>";
                    totalAmount = 8698.74d;
                    updatedAt = OffsetDateTime.parse("2023-11-08T12:40:48.671Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingPaymentResponse res = sdk.payment.patchAccountingPayment(req);

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
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingPaymentResponse res = sdk.payment.removeAccountingPayment(req);

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


## updateAccountingPayment

Update a payment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingPaymentRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingPaymentResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingPayment;
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
                "<value>",
                "<value>"){{
                accountingPayment = new AccountingPayment(
){{
                    accountId = "<value>";
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2022-01-04T17:30:16.475Z");
                    currency = "Sudanese Pound";
                    id = "<id>";
                    invoiceId = "<value>";
                    notes = "<value>";
                    paymentMethod = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    reference = "<value>";
                    totalAmount = 1869.63d;
                    updatedAt = OffsetDateTime.parse("2022-05-14T18:33:08.394Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingPaymentResponse res = sdk.payment.updateAccountingPayment(req);

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

