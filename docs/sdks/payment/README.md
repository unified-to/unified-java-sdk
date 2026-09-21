# Payment

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

<!-- UsageSnippet language="java" operationID="createPaymentLink" method="post" path="/payment/{connection_id}/link" example="payment_link" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePaymentLinkRequest;
import to.unified.unified_java_sdk.models.operations.CreatePaymentLinkResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePaymentLinkRequest req = CreatePaymentLinkRequest.builder()
                .paymentLink(PaymentLink.builder()
                    .amount(81211d)
                    .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                    .currency("GYD")
                    .description("Adfero ipsa terreo benevolentia utrum.")
                    .id("4f9a36b6-88f0-45e4-bfa2-8133bbfcfc13")
                    .isActive(true)
                    .isChargeableNow(false)
                    .lineitems(List.of(
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-08-21T00:45:53.202Z"))
                            .id("a9aff2d8-a192-46c6-8dbb-607b8001936e")
                            .itemDescription("Experience the white brilliance of our Hat, perfect for aggravating environments")
                            .itemName("Licensed Marble Mouse")
                            .itemSku("TAD4EYLVRI")
                            .notes("Charisma theca video verus conduco attollo cervus decretum viridis.")
                            .taxAmount(221d)
                            .totalAmount(1841d)
                            .unitAmount(270d)
                            .unitQuantity(6d)
                            .updatedAt(OffsetDateTime.parse("2023-02-12T17:31:25.507Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-09-30T05:29:29.258Z"))
                            .discountAmount(15d)
                            .id("8e21e867-cdf5-43bb-84c9-93787ad4488b")
                            .itemDescription("New Chicken model with 79 GB RAM, 846 GB storage, and lovely features")
                            .itemName("Intelligent Steel Table")
                            .itemSku("V8HQCDQYUZ")
                            .taxAmount(150d)
                            .totalAmount(2037d)
                            .unitAmount(317d)
                            .unitQuantity(6d)
                            .updatedAt(OffsetDateTime.parse("2023-05-31T11:10:09.190Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-12-16T13:52:52.341Z"))
                            .id("814b8dfb-aed7-405a-a9ea-504c01ad0737")
                            .itemDescription("Dach - Wolff's most advanced Car technology increases dense capabilities")
                            .itemName("Modern Gold Soap")
                            .itemSku("DYGKCTCLDJ")
                            .taxAmount(41d)
                            .totalAmount(281d)
                            .unitAmount(30d)
                            .unitQuantity(8d)
                            .updatedAt(OffsetDateTime.parse("2023-05-22T16:35:07.583Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-08-12T19:45:39.705Z"))
                            .id("f53e5bd2-9c4b-4a82-93d3-e1b20c8ddfdf")
                            .itemDescription("The sleek and unimportant Salad comes with salmon LED lighting for smart functionality")
                            .itemName("Generic Aluminum Ball")
                            .itemSku("BSBAXWAAFF")
                            .notes("Cubo adversus victus subito asperiores vereor cibo tabgo.")
                            .taxAmount(6d)
                            .totalAmount(78d)
                            .unitAmount(24d)
                            .unitQuantity(3d)
                            .updatedAt(OffsetDateTime.parse("2023-11-13T12:39:15.951Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-02-14T06:21:13.641Z"))
                            .discountAmount(171d)
                            .id("4773af83-1e85-497d-b1ef-f44fa2028d3f")
                            .itemDescription("New Bike model with 29 GB RAM, 271 GB storage, and minty features")
                            .itemName("Incredible Aluminum Chicken")
                            .itemSku("6ERMJK20HE")
                            .taxAmount(263d)
                            .totalAmount(3708d)
                            .unitAmount(452d)
                            .unitQuantity(8d)
                            .updatedAt(OffsetDateTime.parse("2023-01-31T21:39:30.894Z"))
                            .build()))
                    .successUrl("https://parched-kettledrum.com/")
                    .updatedAt(OffsetDateTime.parse("2025-12-13T02:46:38.771Z"))
                    .url("https://forceful-laughter.biz/")
                    .build())
                .connectionId("<id>")
                .build();

        CreatePaymentLinkResponse res = sdk.payment().createPaymentLink()
                .request(req)
                .call();

        if (res.paymentLink().isPresent()) {
            System.out.println(res.paymentLink().get());
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

<!-- UsageSnippet language="java" operationID="createPaymentPayment" method="post" path="/payment/{connection_id}/payment" example="payment_payment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePaymentPaymentRequest;
import to.unified.unified_java_sdk.models.operations.CreatePaymentPaymentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePaymentPaymentRequest req = CreatePaymentPaymentRequest.builder()
                .paymentPayment(PaymentPayment.builder()
                    .allocations(List.of())
                    .cardBrand("AMEX")
                    .cardLast4("0819")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-03-10T00:19:42.086Z"))
                    .currency("BIF")
                    .exchangeRate(1.203)
                    .feeAmount(3d)
                    .id("ebf5ae40-1edb-4476-9a62-f11f929e8bba")
                    .locationId("94f7c68e-07de-40d1-9d6f-a0896363913f")
                    .notes("Tactus vilicus.")
                    .paidAt(OffsetDateTime.parse("2022-03-10T00:19:42.086Z"))
                    .paymentMethod("BANK_TRANSFER")
                    .reference("auctus")
                    .status(PaymentPaymentStatus.SUCCEEDED)
                    .tenderType(TenderType.CHECK)
                    .tipAmount(2d)
                    .totalAmount(44219d)
                    .type(PaymentPaymentType.INVOICE)
                    .updatedAt(OffsetDateTime.parse("2025-05-26T18:45:40.107Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreatePaymentPaymentResponse res = sdk.payment().createPaymentPayment()
                .request(req)
                .call();

        if (res.paymentPayment().isPresent()) {
            System.out.println(res.paymentPayment().get());
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

<!-- UsageSnippet language="java" operationID="createPaymentSubscription" method="post" path="/payment/{connection_id}/subscription" example="payment_subscription" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePaymentSubscriptionRequest;
import to.unified.unified_java_sdk.models.operations.CreatePaymentSubscriptionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePaymentSubscriptionRequest req = CreatePaymentSubscriptionRequest.builder()
                .paymentSubscription(PaymentSubscription.builder()
                    .createdAt(OffsetDateTime.parse("2023-05-08T10:11:03.414Z"))
                    .currency("WST")
                    .currentPeriodEndAt(OffsetDateTime.parse("2023-06-03T04:20:29.157Z"))
                    .currentPeriodStartAt(OffsetDateTime.parse("2023-05-21T03:55:58.846Z"))
                    .dayOfMonth(1d)
                    .description("Innovative Mouse featuring important technology and Bamboo construction")
                    .endAt(OffsetDateTime.parse("2023-05-21T12:36:09.234Z"))
                    .id("474ee5bc-efa0-45e7-8d0d-7880e6a189c8")
                    .interval(1d)
                    .intervalUnit(IntervalUnit.MONTH)
                    .lineitems(List.of())
                    .startAt(OffsetDateTime.parse("2023-05-29T06:04:51.030Z"))
                    .status(PaymentSubscriptionStatus.ACTIVE)
                    .totalAmount(75616d)
                    .updatedAt(OffsetDateTime.parse("2023-12-16T11:40:39.964Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreatePaymentSubscriptionResponse res = sdk.payment().createPaymentSubscription()
                .request(req)
                .call();

        if (res.paymentSubscription().isPresent()) {
            System.out.println(res.paymentSubscription().get());
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
            System.out.println(res.paymentLink().get());
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
            System.out.println(res.paymentPayment().get());
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
            System.out.println(res.paymentPayout().get());
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
            System.out.println(res.paymentRefund().get());
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
            System.out.println(res.paymentSubscription().get());
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
            System.out.println(res.paymentLinks().get());
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
            System.out.println(res.paymentPayments().get());
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
            System.out.println(res.paymentPayouts().get());
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
            System.out.println(res.paymentRefunds().get());
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
            System.out.println(res.paymentSubscriptions().get());
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

<!-- UsageSnippet language="java" operationID="patchPaymentLink" method="patch" path="/payment/{connection_id}/link/{id}" example="payment_link" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPaymentLinkRequest;
import to.unified.unified_java_sdk.models.operations.PatchPaymentLinkResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPaymentLinkRequest req = PatchPaymentLinkRequest.builder()
                .paymentLink(PaymentLink.builder()
                    .amount(81211d)
                    .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                    .currency("GYD")
                    .description("Adfero ipsa terreo benevolentia utrum.")
                    .id("a0d0a16f-3206-41d6-b149-7d98a1890715")
                    .isActive(true)
                    .isChargeableNow(false)
                    .lineitems(List.of(
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-08-21T00:45:53.202Z"))
                            .id("cf4ac767-3d27-4148-81e3-64f000cb7b68")
                            .itemDescription("Experience the white brilliance of our Hat, perfect for aggravating environments")
                            .itemName("Licensed Marble Mouse")
                            .itemSku("TAD4EYLVRI")
                            .notes("Charisma theca video verus conduco attollo cervus decretum viridis.")
                            .taxAmount(221d)
                            .totalAmount(1841d)
                            .unitAmount(270d)
                            .unitQuantity(6d)
                            .updatedAt(OffsetDateTime.parse("2023-02-12T17:31:25.507Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-09-30T05:29:29.258Z"))
                            .discountAmount(15d)
                            .id("8886f8c0-4700-4699-bc2a-824424c85ce2")
                            .itemDescription("New Chicken model with 79 GB RAM, 846 GB storage, and lovely features")
                            .itemName("Intelligent Steel Table")
                            .itemSku("V8HQCDQYUZ")
                            .taxAmount(150d)
                            .totalAmount(2037d)
                            .unitAmount(317d)
                            .unitQuantity(6d)
                            .updatedAt(OffsetDateTime.parse("2023-05-31T11:10:09.190Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-12-16T13:52:52.341Z"))
                            .id("5bca260b-3698-4dd7-9ffd-701cdd34be1b")
                            .itemDescription("Dach - Wolff's most advanced Car technology increases dense capabilities")
                            .itemName("Modern Gold Soap")
                            .itemSku("DYGKCTCLDJ")
                            .taxAmount(41d)
                            .totalAmount(281d)
                            .unitAmount(30d)
                            .unitQuantity(8d)
                            .updatedAt(OffsetDateTime.parse("2023-05-22T16:35:07.583Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-08-12T19:45:39.705Z"))
                            .id("586c4099-5807-4681-8be4-7e87758c80e0")
                            .itemDescription("The sleek and unimportant Salad comes with salmon LED lighting for smart functionality")
                            .itemName("Generic Aluminum Ball")
                            .itemSku("BSBAXWAAFF")
                            .notes("Cubo adversus victus subito asperiores vereor cibo tabgo.")
                            .taxAmount(6d)
                            .totalAmount(78d)
                            .unitAmount(24d)
                            .unitQuantity(3d)
                            .updatedAt(OffsetDateTime.parse("2023-11-13T12:39:15.951Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-02-14T06:21:13.641Z"))
                            .discountAmount(171d)
                            .id("00fbbf59-b9cf-4413-a32b-18b58685fd7c")
                            .itemDescription("New Bike model with 29 GB RAM, 271 GB storage, and minty features")
                            .itemName("Incredible Aluminum Chicken")
                            .itemSku("6ERMJK20HE")
                            .taxAmount(263d)
                            .totalAmount(3708d)
                            .unitAmount(452d)
                            .unitQuantity(8d)
                            .updatedAt(OffsetDateTime.parse("2023-01-31T21:39:30.894Z"))
                            .build()))
                    .successUrl("https://parched-kettledrum.com/")
                    .updatedAt(OffsetDateTime.parse("2025-12-13T02:46:38.787Z"))
                    .url("https://forceful-laughter.biz/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPaymentLinkResponse res = sdk.payment().patchPaymentLink()
                .request(req)
                .call();

        if (res.paymentLink().isPresent()) {
            System.out.println(res.paymentLink().get());
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

<!-- UsageSnippet language="java" operationID="patchPaymentPayment" method="patch" path="/payment/{connection_id}/payment/{id}" example="payment_payment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPaymentPaymentRequest;
import to.unified.unified_java_sdk.models.operations.PatchPaymentPaymentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPaymentPaymentRequest req = PatchPaymentPaymentRequest.builder()
                .paymentPayment(PaymentPayment.builder()
                    .allocations(List.of())
                    .cardBrand("AMEX")
                    .cardLast4("0819")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-03-10T00:19:42.086Z"))
                    .currency("BIF")
                    .exchangeRate(1.203)
                    .feeAmount(3d)
                    .id("5695b349-6aa1-409a-8633-e30c5ca99647")
                    .locationId("94f7c68e-07de-40d1-9d6f-a0896363913f")
                    .notes("Tactus vilicus.")
                    .paidAt(OffsetDateTime.parse("2022-03-10T00:19:42.086Z"))
                    .paymentMethod("BANK_TRANSFER")
                    .reference("auctus")
                    .status(PaymentPaymentStatus.SUCCEEDED)
                    .tenderType(TenderType.CHECK)
                    .tipAmount(2d)
                    .totalAmount(44219d)
                    .type(PaymentPaymentType.INVOICE)
                    .updatedAt(OffsetDateTime.parse("2025-05-26T18:45:40.129Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPaymentPaymentResponse res = sdk.payment().patchPaymentPayment()
                .request(req)
                .call();

        if (res.paymentPayment().isPresent()) {
            System.out.println(res.paymentPayment().get());
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

<!-- UsageSnippet language="java" operationID="patchPaymentSubscription" method="patch" path="/payment/{connection_id}/subscription/{id}" example="payment_subscription" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPaymentSubscriptionRequest;
import to.unified.unified_java_sdk.models.operations.PatchPaymentSubscriptionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPaymentSubscriptionRequest req = PatchPaymentSubscriptionRequest.builder()
                .paymentSubscription(PaymentSubscription.builder()
                    .createdAt(OffsetDateTime.parse("2023-05-08T10:11:03.414Z"))
                    .currency("WST")
                    .currentPeriodEndAt(OffsetDateTime.parse("2023-06-03T04:20:29.157Z"))
                    .currentPeriodStartAt(OffsetDateTime.parse("2023-05-21T03:55:58.846Z"))
                    .dayOfMonth(1d)
                    .description("Innovative Mouse featuring important technology and Bamboo construction")
                    .endAt(OffsetDateTime.parse("2023-05-21T12:36:09.234Z"))
                    .id("00e5f826-7bb0-4714-bdd4-901be19b2dd7")
                    .interval(1d)
                    .intervalUnit(IntervalUnit.MONTH)
                    .lineitems(List.of())
                    .startAt(OffsetDateTime.parse("2023-05-29T06:04:51.030Z"))
                    .status(PaymentSubscriptionStatus.ACTIVE)
                    .totalAmount(75616d)
                    .updatedAt(OffsetDateTime.parse("2023-12-16T11:40:39.968Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPaymentSubscriptionResponse res = sdk.payment().patchPaymentSubscription()
                .request(req)
                .call();

        if (res.paymentSubscription().isPresent()) {
            System.out.println(res.paymentSubscription().get());
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

<!-- UsageSnippet language="java" operationID="updatePaymentLink" method="put" path="/payment/{connection_id}/link/{id}" example="payment_link" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentLinkRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentLinkResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePaymentLinkRequest req = UpdatePaymentLinkRequest.builder()
                .paymentLink(PaymentLink.builder()
                    .amount(81211d)
                    .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                    .currency("GYD")
                    .description("Adfero ipsa terreo benevolentia utrum.")
                    .id("a0d0a16f-3206-41d6-b149-7d98a1890715")
                    .isActive(true)
                    .isChargeableNow(false)
                    .lineitems(List.of(
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-08-21T00:45:53.202Z"))
                            .id("cf4ac767-3d27-4148-81e3-64f000cb7b68")
                            .itemDescription("Experience the white brilliance of our Hat, perfect for aggravating environments")
                            .itemName("Licensed Marble Mouse")
                            .itemSku("TAD4EYLVRI")
                            .notes("Charisma theca video verus conduco attollo cervus decretum viridis.")
                            .taxAmount(221d)
                            .totalAmount(1841d)
                            .unitAmount(270d)
                            .unitQuantity(6d)
                            .updatedAt(OffsetDateTime.parse("2023-02-12T17:31:25.507Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-09-30T05:29:29.258Z"))
                            .discountAmount(15d)
                            .id("8886f8c0-4700-4699-bc2a-824424c85ce2")
                            .itemDescription("New Chicken model with 79 GB RAM, 846 GB storage, and lovely features")
                            .itemName("Intelligent Steel Table")
                            .itemSku("V8HQCDQYUZ")
                            .taxAmount(150d)
                            .totalAmount(2037d)
                            .unitAmount(317d)
                            .unitQuantity(6d)
                            .updatedAt(OffsetDateTime.parse("2023-05-31T11:10:09.190Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-12-16T13:52:52.341Z"))
                            .id("5bca260b-3698-4dd7-9ffd-701cdd34be1b")
                            .itemDescription("Dach - Wolff's most advanced Car technology increases dense capabilities")
                            .itemName("Modern Gold Soap")
                            .itemSku("DYGKCTCLDJ")
                            .taxAmount(41d)
                            .totalAmount(281d)
                            .unitAmount(30d)
                            .unitQuantity(8d)
                            .updatedAt(OffsetDateTime.parse("2023-05-22T16:35:07.583Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-08-12T19:45:39.705Z"))
                            .id("586c4099-5807-4681-8be4-7e87758c80e0")
                            .itemDescription("The sleek and unimportant Salad comes with salmon LED lighting for smart functionality")
                            .itemName("Generic Aluminum Ball")
                            .itemSku("BSBAXWAAFF")
                            .notes("Cubo adversus victus subito asperiores vereor cibo tabgo.")
                            .taxAmount(6d)
                            .totalAmount(78d)
                            .unitAmount(24d)
                            .unitQuantity(3d)
                            .updatedAt(OffsetDateTime.parse("2023-11-13T12:39:15.951Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-02-14T06:21:13.641Z"))
                            .discountAmount(171d)
                            .id("00fbbf59-b9cf-4413-a32b-18b58685fd7c")
                            .itemDescription("New Bike model with 29 GB RAM, 271 GB storage, and minty features")
                            .itemName("Incredible Aluminum Chicken")
                            .itemSku("6ERMJK20HE")
                            .taxAmount(263d)
                            .totalAmount(3708d)
                            .unitAmount(452d)
                            .unitQuantity(8d)
                            .updatedAt(OffsetDateTime.parse("2023-01-31T21:39:30.894Z"))
                            .build()))
                    .successUrl("https://parched-kettledrum.com/")
                    .updatedAt(OffsetDateTime.parse("2025-12-13T02:46:38.787Z"))
                    .url("https://forceful-laughter.biz/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePaymentLinkResponse res = sdk.payment().updatePaymentLink()
                .request(req)
                .call();

        if (res.paymentLink().isPresent()) {
            System.out.println(res.paymentLink().get());
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

<!-- UsageSnippet language="java" operationID="updatePaymentPayment" method="put" path="/payment/{connection_id}/payment/{id}" example="payment_payment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentPaymentRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentPaymentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePaymentPaymentRequest req = UpdatePaymentPaymentRequest.builder()
                .paymentPayment(PaymentPayment.builder()
                    .allocations(List.of())
                    .cardBrand("AMEX")
                    .cardLast4("0819")
                    .categoryIds(List.of())
                    .createdAt(OffsetDateTime.parse("2022-03-10T00:19:42.086Z"))
                    .currency("BIF")
                    .exchangeRate(1.203)
                    .feeAmount(3d)
                    .id("5695b349-6aa1-409a-8633-e30c5ca99647")
                    .locationId("94f7c68e-07de-40d1-9d6f-a0896363913f")
                    .notes("Tactus vilicus.")
                    .paidAt(OffsetDateTime.parse("2022-03-10T00:19:42.086Z"))
                    .paymentMethod("BANK_TRANSFER")
                    .reference("auctus")
                    .status(PaymentPaymentStatus.SUCCEEDED)
                    .tenderType(TenderType.CHECK)
                    .tipAmount(2d)
                    .totalAmount(44219d)
                    .type(PaymentPaymentType.INVOICE)
                    .updatedAt(OffsetDateTime.parse("2025-05-26T18:45:40.129Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePaymentPaymentResponse res = sdk.payment().updatePaymentPayment()
                .request(req)
                .call();

        if (res.paymentPayment().isPresent()) {
            System.out.println(res.paymentPayment().get());
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

<!-- UsageSnippet language="java" operationID="updatePaymentSubscription" method="put" path="/payment/{connection_id}/subscription/{id}" example="payment_subscription" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentSubscriptionRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentSubscriptionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePaymentSubscriptionRequest req = UpdatePaymentSubscriptionRequest.builder()
                .paymentSubscription(PaymentSubscription.builder()
                    .createdAt(OffsetDateTime.parse("2023-05-08T10:11:03.414Z"))
                    .currency("WST")
                    .currentPeriodEndAt(OffsetDateTime.parse("2023-06-03T04:20:29.157Z"))
                    .currentPeriodStartAt(OffsetDateTime.parse("2023-05-21T03:55:58.846Z"))
                    .dayOfMonth(1d)
                    .description("Innovative Mouse featuring important technology and Bamboo construction")
                    .endAt(OffsetDateTime.parse("2023-05-21T12:36:09.234Z"))
                    .id("00e5f826-7bb0-4714-bdd4-901be19b2dd7")
                    .interval(1d)
                    .intervalUnit(IntervalUnit.MONTH)
                    .lineitems(List.of())
                    .startAt(OffsetDateTime.parse("2023-05-29T06:04:51.030Z"))
                    .status(PaymentSubscriptionStatus.ACTIVE)
                    .totalAmount(75616d)
                    .updatedAt(OffsetDateTime.parse("2023-12-16T11:40:39.968Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePaymentSubscriptionResponse res = sdk.payment().updatePaymentSubscription()
                .request(req)
                .call();

        if (res.paymentSubscription().isPresent()) {
            System.out.println(res.paymentSubscription().get());
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