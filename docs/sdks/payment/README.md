# Payment
(*payment()*)

## Overview

### Available Operations

* [createPaymentLink](#createpaymentlink) - Create a link
* [createPaymentPayment](#createpaymentpayment) - Create a payment
* [createPaymentSubscription](#createpaymentsubscription) - Create a subscription
* [getPaymentLink](#getpaymentlink) - Retrieve a link
* [getPaymentPayment](#getpaymentpayment) - Retrieve a payment
* [getPaymentPayout](#getpaymentpayout) - Retrieve a payout
* [getPaymentRefund](#getpaymentrefund) - Retrieve a refund
* [getPaymentSubscription](#getpaymentsubscription) - Retrieve a subscription
* [listPaymentLinks](#listpaymentlinks) - List all links
* [listPaymentPayments](#listpaymentpayments) - List all payments
* [listPaymentPayouts](#listpaymentpayouts) - List all payouts
* [listPaymentRefunds](#listpaymentrefunds) - List all refunds
* [listPaymentSubscriptions](#listpaymentsubscriptions) - List all subscriptions
* [patchPaymentLink](#patchpaymentlink) - Update a link
* [patchPaymentPayment](#patchpaymentpayment) - Update a payment
* [patchPaymentSubscription](#patchpaymentsubscription) - Update a subscription
* [removePaymentLink](#removepaymentlink) - Remove a link
* [removePaymentPayment](#removepaymentpayment) - Remove a payment
* [removePaymentSubscription](#removepaymentsubscription) - Remove a subscription
* [updatePaymentLink](#updatepaymentlink) - Update a link
* [updatePaymentPayment](#updatepaymentpayment) - Update a payment
* [updatePaymentSubscription](#updatepaymentsubscription) - Update a subscription

## createPaymentLink

Create a link

### Example Usage

<!-- UsageSnippet language="java" operationID="createPaymentLink" method="post" path="/payment/{connection_id}/link" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePaymentLinkRequest;
import to.unified.unified_java_sdk.models.operations.CreatePaymentLinkResponse;
import to.unified.unified_java_sdk.models.shared.PaymentLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePaymentLinkRequest req = CreatePaymentLinkRequest.builder()
                .paymentLink(PaymentLink.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreatePaymentLinkResponse res = sdk.payment().createPaymentLink()
                .request(req)
                .call();

        if (res.paymentLink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreatePaymentLinkRequest](../../models/operations/CreatePaymentLinkRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreatePaymentLinkResponse](../../models/operations/CreatePaymentLinkResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createPaymentPayment

Create a payment

### Example Usage

<!-- UsageSnippet language="java" operationID="createPaymentPayment" method="post" path="/payment/{connection_id}/payment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePaymentPaymentRequest;
import to.unified.unified_java_sdk.models.operations.CreatePaymentPaymentResponse;
import to.unified.unified_java_sdk.models.shared.PaymentPayment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePaymentPaymentRequest req = CreatePaymentPaymentRequest.builder()
                .paymentPayment(PaymentPayment.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreatePaymentPaymentResponse res = sdk.payment().createPaymentPayment()
                .request(req)
                .call();

        if (res.paymentPayment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreatePaymentPaymentRequest](../../models/operations/CreatePaymentPaymentRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreatePaymentPaymentResponse](../../models/operations/CreatePaymentPaymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createPaymentSubscription

Create a subscription

### Example Usage

<!-- UsageSnippet language="java" operationID="createPaymentSubscription" method="post" path="/payment/{connection_id}/subscription" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePaymentSubscriptionRequest;
import to.unified.unified_java_sdk.models.operations.CreatePaymentSubscriptionResponse;
import to.unified.unified_java_sdk.models.shared.PaymentSubscription;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePaymentSubscriptionRequest req = CreatePaymentSubscriptionRequest.builder()
                .paymentSubscription(PaymentSubscription.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreatePaymentSubscriptionResponse res = sdk.payment().createPaymentSubscription()
                .request(req)
                .call();

        if (res.paymentSubscription().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [CreatePaymentSubscriptionRequest](../../models/operations/CreatePaymentSubscriptionRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[CreatePaymentSubscriptionResponse](../../models/operations/CreatePaymentSubscriptionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPaymentLink

Retrieve a link

### Example Usage

<!-- UsageSnippet language="java" operationID="getPaymentLink" method="get" path="/payment/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPaymentLinkRequest;
import to.unified.unified_java_sdk.models.operations.GetPaymentLinkResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPaymentLinkRequest req = GetPaymentLinkRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPaymentLinkResponse res = sdk.payment().getPaymentLink()
                .request(req)
                .call();

        if (res.paymentLink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetPaymentLinkRequest](../../models/operations/GetPaymentLinkRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetPaymentLinkResponse](../../models/operations/GetPaymentLinkResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPaymentPayment

Retrieve a payment

### Example Usage

<!-- UsageSnippet language="java" operationID="getPaymentPayment" method="get" path="/payment/{connection_id}/payment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPaymentPaymentRequest;
import to.unified.unified_java_sdk.models.operations.GetPaymentPaymentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPaymentPaymentRequest req = GetPaymentPaymentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPaymentPaymentResponse res = sdk.payment().getPaymentPayment()
                .request(req)
                .call();

        if (res.paymentPayment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetPaymentPaymentRequest](../../models/operations/GetPaymentPaymentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetPaymentPaymentResponse](../../models/operations/GetPaymentPaymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPaymentPayout

Retrieve a payout

### Example Usage

<!-- UsageSnippet language="java" operationID="getPaymentPayout" method="get" path="/payment/{connection_id}/payout/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPaymentPayoutRequest;
import to.unified.unified_java_sdk.models.operations.GetPaymentPayoutResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPaymentPayoutRequest req = GetPaymentPayoutRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPaymentPayoutResponse res = sdk.payment().getPaymentPayout()
                .request(req)
                .call();

        if (res.paymentPayout().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetPaymentPayoutRequest](../../models/operations/GetPaymentPayoutRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetPaymentPayoutResponse](../../models/operations/GetPaymentPayoutResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPaymentRefund

Retrieve a refund

### Example Usage

<!-- UsageSnippet language="java" operationID="getPaymentRefund" method="get" path="/payment/{connection_id}/refund/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPaymentRefundRequest;
import to.unified.unified_java_sdk.models.operations.GetPaymentRefundResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPaymentRefundRequest req = GetPaymentRefundRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPaymentRefundResponse res = sdk.payment().getPaymentRefund()
                .request(req)
                .call();

        if (res.paymentRefund().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetPaymentRefundRequest](../../models/operations/GetPaymentRefundRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetPaymentRefundResponse](../../models/operations/GetPaymentRefundResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPaymentSubscription

Retrieve a subscription

### Example Usage

<!-- UsageSnippet language="java" operationID="getPaymentSubscription" method="get" path="/payment/{connection_id}/subscription/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPaymentSubscriptionRequest;
import to.unified.unified_java_sdk.models.operations.GetPaymentSubscriptionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPaymentSubscriptionRequest req = GetPaymentSubscriptionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPaymentSubscriptionResponse res = sdk.payment().getPaymentSubscription()
                .request(req)
                .call();

        if (res.paymentSubscription().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetPaymentSubscriptionRequest](../../models/operations/GetPaymentSubscriptionRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetPaymentSubscriptionResponse](../../models/operations/GetPaymentSubscriptionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPaymentLinks

List all links

### Example Usage

<!-- UsageSnippet language="java" operationID="listPaymentLinks" method="get" path="/payment/{connection_id}/link" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPaymentLinksRequest;
import to.unified.unified_java_sdk.models.operations.ListPaymentLinksResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPaymentLinksRequest req = ListPaymentLinksRequest.builder()
                .connectionId("<id>")
                .build();

        ListPaymentLinksResponse res = sdk.payment().listPaymentLinks()
                .request(req)
                .call();

        if (res.paymentLinks().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListPaymentLinksRequest](../../models/operations/ListPaymentLinksRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListPaymentLinksResponse](../../models/operations/ListPaymentLinksResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPaymentPayments

List all payments

### Example Usage

<!-- UsageSnippet language="java" operationID="listPaymentPayments" method="get" path="/payment/{connection_id}/payment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPaymentPaymentsRequest;
import to.unified.unified_java_sdk.models.operations.ListPaymentPaymentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPaymentPaymentsRequest req = ListPaymentPaymentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPaymentPaymentsResponse res = sdk.payment().listPaymentPayments()
                .request(req)
                .call();

        if (res.paymentPayments().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListPaymentPaymentsRequest](../../models/operations/ListPaymentPaymentsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListPaymentPaymentsResponse](../../models/operations/ListPaymentPaymentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPaymentPayouts

List all payouts

### Example Usage

<!-- UsageSnippet language="java" operationID="listPaymentPayouts" method="get" path="/payment/{connection_id}/payout" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPaymentPayoutsRequest;
import to.unified.unified_java_sdk.models.operations.ListPaymentPayoutsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPaymentPayoutsRequest req = ListPaymentPayoutsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPaymentPayoutsResponse res = sdk.payment().listPaymentPayouts()
                .request(req)
                .call();

        if (res.paymentPayouts().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListPaymentPayoutsRequest](../../models/operations/ListPaymentPayoutsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListPaymentPayoutsResponse](../../models/operations/ListPaymentPayoutsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPaymentRefunds

List all refunds

### Example Usage

<!-- UsageSnippet language="java" operationID="listPaymentRefunds" method="get" path="/payment/{connection_id}/refund" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPaymentRefundsRequest;
import to.unified.unified_java_sdk.models.operations.ListPaymentRefundsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPaymentRefundsRequest req = ListPaymentRefundsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPaymentRefundsResponse res = sdk.payment().listPaymentRefunds()
                .request(req)
                .call();

        if (res.paymentRefunds().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListPaymentRefundsRequest](../../models/operations/ListPaymentRefundsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListPaymentRefundsResponse](../../models/operations/ListPaymentRefundsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPaymentSubscriptions

List all subscriptions

### Example Usage

<!-- UsageSnippet language="java" operationID="listPaymentSubscriptions" method="get" path="/payment/{connection_id}/subscription" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPaymentSubscriptionsRequest;
import to.unified.unified_java_sdk.models.operations.ListPaymentSubscriptionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPaymentSubscriptionsRequest req = ListPaymentSubscriptionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPaymentSubscriptionsResponse res = sdk.payment().listPaymentSubscriptions()
                .request(req)
                .call();

        if (res.paymentSubscriptions().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListPaymentSubscriptionsRequest](../../models/operations/ListPaymentSubscriptionsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListPaymentSubscriptionsResponse](../../models/operations/ListPaymentSubscriptionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPaymentLink

Update a link

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPaymentLink" method="patch" path="/payment/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPaymentLinkRequest;
import to.unified.unified_java_sdk.models.operations.PatchPaymentLinkResponse;
import to.unified.unified_java_sdk.models.shared.PaymentLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPaymentLinkRequest req = PatchPaymentLinkRequest.builder()
                .paymentLink(PaymentLink.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPaymentLinkResponse res = sdk.payment().patchPaymentLink()
                .request(req)
                .call();

        if (res.paymentLink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchPaymentLinkRequest](../../models/operations/PatchPaymentLinkRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchPaymentLinkResponse](../../models/operations/PatchPaymentLinkResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPaymentPayment

Update a payment

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPaymentPayment" method="patch" path="/payment/{connection_id}/payment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPaymentPaymentRequest;
import to.unified.unified_java_sdk.models.operations.PatchPaymentPaymentResponse;
import to.unified.unified_java_sdk.models.shared.PaymentPayment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPaymentPaymentRequest req = PatchPaymentPaymentRequest.builder()
                .paymentPayment(PaymentPayment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPaymentPaymentResponse res = sdk.payment().patchPaymentPayment()
                .request(req)
                .call();

        if (res.paymentPayment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchPaymentPaymentRequest](../../models/operations/PatchPaymentPaymentRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchPaymentPaymentResponse](../../models/operations/PatchPaymentPaymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPaymentSubscription

Update a subscription

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPaymentSubscription" method="patch" path="/payment/{connection_id}/subscription/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPaymentSubscriptionRequest;
import to.unified.unified_java_sdk.models.operations.PatchPaymentSubscriptionResponse;
import to.unified.unified_java_sdk.models.shared.PaymentSubscription;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPaymentSubscriptionRequest req = PatchPaymentSubscriptionRequest.builder()
                .paymentSubscription(PaymentSubscription.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPaymentSubscriptionResponse res = sdk.payment().patchPaymentSubscription()
                .request(req)
                .call();

        if (res.paymentSubscription().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [PatchPaymentSubscriptionRequest](../../models/operations/PatchPaymentSubscriptionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[PatchPaymentSubscriptionResponse](../../models/operations/PatchPaymentSubscriptionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removePaymentLink

Remove a link

### Example Usage

<!-- UsageSnippet language="java" operationID="removePaymentLink" method="delete" path="/payment/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemovePaymentLinkRequest;
import to.unified.unified_java_sdk.models.operations.RemovePaymentLinkResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemovePaymentLinkRequest req = RemovePaymentLinkRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemovePaymentLinkResponse res = sdk.payment().removePaymentLink()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemovePaymentLinkRequest](../../models/operations/RemovePaymentLinkRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemovePaymentLinkResponse](../../models/operations/RemovePaymentLinkResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removePaymentPayment

Remove a payment

### Example Usage

<!-- UsageSnippet language="java" operationID="removePaymentPayment" method="delete" path="/payment/{connection_id}/payment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemovePaymentPaymentRequest;
import to.unified.unified_java_sdk.models.operations.RemovePaymentPaymentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemovePaymentPaymentRequest req = RemovePaymentPaymentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemovePaymentPaymentResponse res = sdk.payment().removePaymentPayment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemovePaymentPaymentRequest](../../models/operations/RemovePaymentPaymentRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemovePaymentPaymentResponse](../../models/operations/RemovePaymentPaymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removePaymentSubscription

Remove a subscription

### Example Usage

<!-- UsageSnippet language="java" operationID="removePaymentSubscription" method="delete" path="/payment/{connection_id}/subscription/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemovePaymentSubscriptionRequest;
import to.unified.unified_java_sdk.models.operations.RemovePaymentSubscriptionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemovePaymentSubscriptionRequest req = RemovePaymentSubscriptionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemovePaymentSubscriptionResponse res = sdk.payment().removePaymentSubscription()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [RemovePaymentSubscriptionRequest](../../models/operations/RemovePaymentSubscriptionRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[RemovePaymentSubscriptionResponse](../../models/operations/RemovePaymentSubscriptionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePaymentLink

Update a link

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePaymentLink" method="put" path="/payment/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentLinkRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentLinkResponse;
import to.unified.unified_java_sdk.models.shared.PaymentLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePaymentLinkRequest req = UpdatePaymentLinkRequest.builder()
                .paymentLink(PaymentLink.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePaymentLinkResponse res = sdk.payment().updatePaymentLink()
                .request(req)
                .call();

        if (res.paymentLink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdatePaymentLinkRequest](../../models/operations/UpdatePaymentLinkRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdatePaymentLinkResponse](../../models/operations/UpdatePaymentLinkResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePaymentPayment

Update a payment

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePaymentPayment" method="put" path="/payment/{connection_id}/payment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentPaymentRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentPaymentResponse;
import to.unified.unified_java_sdk.models.shared.PaymentPayment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePaymentPaymentRequest req = UpdatePaymentPaymentRequest.builder()
                .paymentPayment(PaymentPayment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePaymentPaymentResponse res = sdk.payment().updatePaymentPayment()
                .request(req)
                .call();

        if (res.paymentPayment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdatePaymentPaymentRequest](../../models/operations/UpdatePaymentPaymentRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdatePaymentPaymentResponse](../../models/operations/UpdatePaymentPaymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePaymentSubscription

Update a subscription

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePaymentSubscription" method="put" path="/payment/{connection_id}/subscription/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentSubscriptionRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentSubscriptionResponse;
import to.unified.unified_java_sdk.models.shared.PaymentSubscription;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePaymentSubscriptionRequest req = UpdatePaymentSubscriptionRequest.builder()
                .paymentSubscription(PaymentSubscription.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePaymentSubscriptionResponse res = sdk.payment().updatePaymentSubscription()
                .request(req)
                .call();

        if (res.paymentSubscription().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [UpdatePaymentSubscriptionRequest](../../models/operations/UpdatePaymentSubscriptionRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[UpdatePaymentSubscriptionResponse](../../models/operations/UpdatePaymentSubscriptionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |