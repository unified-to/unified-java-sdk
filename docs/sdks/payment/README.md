# Payment
(*payment*)

### Available Operations

* [createPaymentLink](#createpaymentlink) - Create a link
* [createPaymentPayment](#createpaymentpayment) - Create a payment
* [getPaymentLink](#getpaymentlink) - Retrieve a link
* [getPaymentPayment](#getpaymentpayment) - Retrieve a payment
* [getPaymentPayout](#getpaymentpayout) - Retrieve a payout
* [getPaymentRefund](#getpaymentrefund) - Retrieve a refund
* [listPaymentLinks](#listpaymentlinks) - List all links
* [listPaymentPayments](#listpaymentpayments) - List all payments
* [listPaymentPayouts](#listpaymentpayouts) - List all payouts
* [listPaymentRefunds](#listpaymentrefunds) - List all refunds
* [patchPaymentLink](#patchpaymentlink) - Update a link
* [patchPaymentPayment](#patchpaymentpayment) - Update a payment
* [removePaymentLink](#removepaymentlink) - Remove a link
* [removePaymentPayment](#removepaymentpayment) - Remove a payment
* [updatePaymentLink](#updatepaymentlink) - Update a link
* [updatePaymentPayment](#updatepaymentpayment) - Update a payment

## createPaymentLink

Create a link

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreatePaymentLinkRequest;
import com.unifiedapi.unifiedto.models.operations.CreatePaymentLinkResponse;
import com.unifiedapi.unifiedto.models.shared.PaymentLink;
import com.unifiedapi.unifiedto.models.shared.PaymentLinkLineitem;
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

            com.unifiedapi.unifiedto.models.operations.CreatePaymentLinkRequest req = new CreatePaymentLinkRequest(
                "<value>"){{
                paymentLink = new PaymentLink(
){{
                    amount = 8711.36d;
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2024-05-14T04:54:56.527Z");
                    currency = "Aruban Guilder";
                    id = "<id>";
                    isActive = false;
                    isChargeableNow = false;
                    lineitems = new com.unifiedapi.unifiedto.models.shared.PaymentLinkLineitem[]{{
                        add(new PaymentLinkLineitem(
                        ){{}}),
                    }};
                    paymentId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2024-10-29T06:52:39.809Z");
                    url = "https://luxurious-attenuation.com";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreatePaymentLinkResponse res = sdk.payment.createPaymentLink(req);

            if (res.paymentLink != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.CreatePaymentLinkRequest](../../models/operations/CreatePaymentLinkRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreatePaymentLinkResponse](../../models/operations/CreatePaymentLinkResponse.md)**


## createPaymentPayment

Create a payment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreatePaymentPaymentRequest;
import com.unifiedapi.unifiedto.models.operations.CreatePaymentPaymentResponse;
import com.unifiedapi.unifiedto.models.shared.PaymentPayment;
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

            com.unifiedapi.unifiedto.models.operations.CreatePaymentPaymentRequest req = new CreatePaymentPaymentRequest(
                "<value>"){{
                paymentPayment = new PaymentPayment(
){{
                    accountId = "<value>";
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2023-10-29T07:18:50.554Z");
                    currency = "Iceland Krona";
                    id = "<id>";
                    invoiceId = "<value>";
                    notes = "<value>";
                    paymentMethod = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    reference = "<value>";
                    totalAmount = 3959.04d;
                    updatedAt = OffsetDateTime.parse("2023-12-14T11:37:10.195Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreatePaymentPaymentResponse res = sdk.payment.createPaymentPayment(req);

            if (res.paymentPayment != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.CreatePaymentPaymentRequest](../../models/operations/CreatePaymentPaymentRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreatePaymentPaymentResponse](../../models/operations/CreatePaymentPaymentResponse.md)**


## getPaymentLink

Retrieve a link

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetPaymentLinkRequest;
import com.unifiedapi.unifiedto.models.operations.GetPaymentLinkResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetPaymentLinkRequest req = new GetPaymentLinkRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetPaymentLinkResponse res = sdk.payment.getPaymentLink(req);

            if (res.paymentLink != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetPaymentLinkRequest](../../models/operations/GetPaymentLinkRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetPaymentLinkResponse](../../models/operations/GetPaymentLinkResponse.md)**


## getPaymentPayment

Retrieve a payment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetPaymentPaymentRequest;
import com.unifiedapi.unifiedto.models.operations.GetPaymentPaymentResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetPaymentPaymentRequest req = new GetPaymentPaymentRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetPaymentPaymentResponse res = sdk.payment.getPaymentPayment(req);

            if (res.paymentPayment != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetPaymentPaymentRequest](../../models/operations/GetPaymentPaymentRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetPaymentPaymentResponse](../../models/operations/GetPaymentPaymentResponse.md)**


## getPaymentPayout

Retrieve a payout

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetPaymentPayoutRequest;
import com.unifiedapi.unifiedto.models.operations.GetPaymentPayoutResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetPaymentPayoutRequest req = new GetPaymentPayoutRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetPaymentPayoutResponse res = sdk.payment.getPaymentPayout(req);

            if (res.paymentPayout != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetPaymentPayoutRequest](../../models/operations/GetPaymentPayoutRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetPaymentPayoutResponse](../../models/operations/GetPaymentPayoutResponse.md)**


## getPaymentRefund

Retrieve a refund

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetPaymentRefundRequest;
import com.unifiedapi.unifiedto.models.operations.GetPaymentRefundResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetPaymentRefundRequest req = new GetPaymentRefundRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetPaymentRefundResponse res = sdk.payment.getPaymentRefund(req);

            if (res.paymentRefund != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetPaymentRefundRequest](../../models/operations/GetPaymentRefundRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetPaymentRefundResponse](../../models/operations/GetPaymentRefundResponse.md)**


## listPaymentLinks

List all links

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListPaymentLinksRequest;
import com.unifiedapi.unifiedto.models.operations.ListPaymentLinksResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListPaymentLinksRequest req = new ListPaymentLinksRequest(
                "<value>"){{
                contactId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 5840.47d;
                offset = 2505.87d;
                paymentId = "<value>";
                query = "<value>";
                updatedGte = OffsetDateTime.parse("2024-12-19T04:38:46.756Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListPaymentLinksResponse res = sdk.payment.listPaymentLinks(req);

            if (res.paymentLinks != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.ListPaymentLinksRequest](../../models/operations/ListPaymentLinksRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListPaymentLinksResponse](../../models/operations/ListPaymentLinksResponse.md)**


## listPaymentPayments

List all payments

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListPaymentPaymentsRequest;
import com.unifiedapi.unifiedto.models.operations.ListPaymentPaymentsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListPaymentPaymentsRequest req = new ListPaymentPaymentsRequest(
                "<value>"){{
                contactId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                invoiceId = "<value>";
                limit = 2381.17d;
                offset = 837.03d;
                query = "<value>";
                updatedGte = OffsetDateTime.parse("2022-06-25T04:38:11.791Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListPaymentPaymentsResponse res = sdk.payment.listPaymentPayments(req);

            if (res.paymentPayments != null) {
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
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListPaymentPaymentsRequest](../../models/operations/ListPaymentPaymentsRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListPaymentPaymentsResponse](../../models/operations/ListPaymentPaymentsResponse.md)**


## listPaymentPayouts

List all payouts

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListPaymentPayoutsRequest;
import com.unifiedapi.unifiedto.models.operations.ListPaymentPayoutsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListPaymentPayoutsRequest req = new ListPaymentPayoutsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 5474.75d;
                offset = 586.95d;
                query = "<value>";
                updatedGte = OffsetDateTime.parse("2023-12-05T08:15:58.034Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListPaymentPayoutsResponse res = sdk.payment.listPaymentPayouts(req);

            if (res.paymentPayouts != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.ListPaymentPayoutsRequest](../../models/operations/ListPaymentPayoutsRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListPaymentPayoutsResponse](../../models/operations/ListPaymentPayoutsResponse.md)**


## listPaymentRefunds

List all refunds

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListPaymentRefundsRequest;
import com.unifiedapi.unifiedto.models.operations.ListPaymentRefundsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListPaymentRefundsRequest req = new ListPaymentRefundsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 5820.28d;
                offset = 6141.19d;
                paymentId = "<value>";
                query = "<value>";
                updatedGte = OffsetDateTime.parse("2022-08-03T22:54:27.299Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListPaymentRefundsResponse res = sdk.payment.listPaymentRefunds(req);

            if (res.paymentRefunds != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.ListPaymentRefundsRequest](../../models/operations/ListPaymentRefundsRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListPaymentRefundsResponse](../../models/operations/ListPaymentRefundsResponse.md)**


## patchPaymentLink

Update a link

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchPaymentLinkRequest;
import com.unifiedapi.unifiedto.models.operations.PatchPaymentLinkResponse;
import com.unifiedapi.unifiedto.models.shared.PaymentLink;
import com.unifiedapi.unifiedto.models.shared.PaymentLinkLineitem;
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

            com.unifiedapi.unifiedto.models.operations.PatchPaymentLinkRequest req = new PatchPaymentLinkRequest(
                "<value>",
                "<value>"){{
                paymentLink = new PaymentLink(
){{
                    amount = 2219.73d;
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2023-05-20T18:32:48.667Z");
                    currency = "UIC-Franc";
                    id = "<id>";
                    isActive = false;
                    isChargeableNow = false;
                    lineitems = new com.unifiedapi.unifiedto.models.shared.PaymentLinkLineitem[]{{
                        add(new PaymentLinkLineitem(
                        ){{}}),
                    }};
                    paymentId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2024-03-01T20:55:52.998Z");
                    url = "http://mammoth-doggie.com";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchPaymentLinkResponse res = sdk.payment.patchPaymentLink(req);

            if (res.paymentLink != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchPaymentLinkRequest](../../models/operations/PatchPaymentLinkRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchPaymentLinkResponse](../../models/operations/PatchPaymentLinkResponse.md)**


## patchPaymentPayment

Update a payment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchPaymentPaymentRequest;
import com.unifiedapi.unifiedto.models.operations.PatchPaymentPaymentResponse;
import com.unifiedapi.unifiedto.models.shared.PaymentPayment;
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

            com.unifiedapi.unifiedto.models.operations.PatchPaymentPaymentRequest req = new PatchPaymentPaymentRequest(
                "<value>",
                "<value>"){{
                paymentPayment = new PaymentPayment(
){{
                    accountId = "<value>";
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2023-08-28T13:33:54.908Z");
                    currency = "Cape Verde Escudo";
                    id = "<id>";
                    invoiceId = "<value>";
                    notes = "<value>";
                    paymentMethod = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    reference = "<value>";
                    totalAmount = 8302.81d;
                    updatedAt = OffsetDateTime.parse("2022-10-19T00:50:51.403Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchPaymentPaymentResponse res = sdk.payment.patchPaymentPayment(req);

            if (res.paymentPayment != null) {
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
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchPaymentPaymentRequest](../../models/operations/PatchPaymentPaymentRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchPaymentPaymentResponse](../../models/operations/PatchPaymentPaymentResponse.md)**


## removePaymentLink

Remove a link

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemovePaymentLinkRequest;
import com.unifiedapi.unifiedto.models.operations.RemovePaymentLinkResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemovePaymentLinkRequest req = new RemovePaymentLinkRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemovePaymentLinkResponse res = sdk.payment.removePaymentLink(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.RemovePaymentLinkRequest](../../models/operations/RemovePaymentLinkRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemovePaymentLinkResponse](../../models/operations/RemovePaymentLinkResponse.md)**


## removePaymentPayment

Remove a payment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemovePaymentPaymentRequest;
import com.unifiedapi.unifiedto.models.operations.RemovePaymentPaymentResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemovePaymentPaymentRequest req = new RemovePaymentPaymentRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemovePaymentPaymentResponse res = sdk.payment.removePaymentPayment(req);

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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.RemovePaymentPaymentRequest](../../models/operations/RemovePaymentPaymentRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemovePaymentPaymentResponse](../../models/operations/RemovePaymentPaymentResponse.md)**


## updatePaymentLink

Update a link

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdatePaymentLinkRequest;
import com.unifiedapi.unifiedto.models.operations.UpdatePaymentLinkResponse;
import com.unifiedapi.unifiedto.models.shared.PaymentLink;
import com.unifiedapi.unifiedto.models.shared.PaymentLinkLineitem;
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

            com.unifiedapi.unifiedto.models.operations.UpdatePaymentLinkRequest req = new UpdatePaymentLinkRequest(
                "<value>",
                "<value>"){{
                paymentLink = new PaymentLink(
){{
                    amount = 6147.65d;
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2023-05-02T07:49:35.280Z");
                    currency = "Gibraltar Pound";
                    id = "<id>";
                    isActive = false;
                    isChargeableNow = false;
                    lineitems = new com.unifiedapi.unifiedto.models.shared.PaymentLinkLineitem[]{{
                        add(new PaymentLinkLineitem(
                        ){{}}),
                    }};
                    paymentId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2024-02-13T01:53:59.618Z");
                    url = "https://dramatic-trolley.com";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdatePaymentLinkResponse res = sdk.payment.updatePaymentLink(req);

            if (res.paymentLink != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.UpdatePaymentLinkRequest](../../models/operations/UpdatePaymentLinkRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdatePaymentLinkResponse](../../models/operations/UpdatePaymentLinkResponse.md)**


## updatePaymentPayment

Update a payment

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdatePaymentPaymentRequest;
import com.unifiedapi.unifiedto.models.operations.UpdatePaymentPaymentResponse;
import com.unifiedapi.unifiedto.models.shared.PaymentPayment;
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

            com.unifiedapi.unifiedto.models.operations.UpdatePaymentPaymentRequest req = new UpdatePaymentPaymentRequest(
                "<value>",
                "<value>"){{
                paymentPayment = new PaymentPayment(
){{
                    accountId = "<value>";
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2022-05-20T21:00:50.233Z");
                    currency = "Namibia Dollar";
                    id = "<id>";
                    invoiceId = "<value>";
                    notes = "<value>";
                    paymentMethod = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    reference = "<value>";
                    totalAmount = 8490.31d;
                    updatedAt = OffsetDateTime.parse("2024-10-24T15:08:32.749Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdatePaymentPaymentResponse res = sdk.payment.updatePaymentPayment(req);

            if (res.paymentPayment != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.UpdatePaymentPaymentRequest](../../models/operations/UpdatePaymentPaymentRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdatePaymentPaymentResponse](../../models/operations/UpdatePaymentPaymentResponse.md)**

