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

            CreateAccountingPaymentResponse res = sdk.payment.createAccountingPayment(req);

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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            GetAccountingPaymentRequest req = new GetAccountingPaymentRequest("string", "string"){{
                fields = new String[]{{
                    add("string"),
                }};
            }};            

            GetAccountingPaymentResponse res = sdk.payment.getAccountingPayment(req);

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

            ListAccountingPaymentsResponse res = sdk.payment.listAccountingPayments(req);

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

            PatchAccountingPaymentResponse res = sdk.payment.patchAccountingPayment(req);

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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            RemoveAccountingPaymentRequest req = new RemoveAccountingPaymentRequest("string", "string");            

            RemoveAccountingPaymentResponse res = sdk.payment.removeAccountingPayment(req);

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

            UpdateAccountingPaymentResponse res = sdk.payment.updateAccountingPayment(req);

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

