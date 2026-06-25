# Payment

## Overview

### Available Operations

* [createPaymentLink2](#createpaymentlink2) - Create a link
* [createPaymentPayment2](#createpaymentpayment2) - Create a payment
* [createPaymentSubscription2](#createpaymentsubscription2) - Create a subscription
* [getPaymentLink2](#getpaymentlink2) - Retrieve a link
* [getPaymentPayment2](#getpaymentpayment2) - Retrieve a payment
* [getPaymentPayout2](#getpaymentpayout2) - Retrieve a payout
* [getPaymentRefund2](#getpaymentrefund2) - Retrieve a refund
* [getPaymentSubscription2](#getpaymentsubscription2) - Retrieve a subscription
* [listPaymentLinks2](#listpaymentlinks2) - List all links
* [listPaymentPayments2](#listpaymentpayments2) - List all payments
* [listPaymentPayouts2](#listpaymentpayouts2) - List all payouts
* [listPaymentRefunds2](#listpaymentrefunds2) - List all refunds
* [listPaymentSubscriptions2](#listpaymentsubscriptions2) - List all subscriptions
* [patchPaymentLink2](#patchpaymentlink2) - Update a link
* [patchPaymentPayment2](#patchpaymentpayment2) - Update a payment
* [patchPaymentSubscription2](#patchpaymentsubscription2) - Update a subscription
* [removePaymentLink2](#removepaymentlink2) - Remove a link
* [removePaymentPayment2](#removepaymentpayment2) - Remove a payment
* [removePaymentSubscription2](#removepaymentsubscription2) - Remove a subscription
* [updatePaymentLink2](#updatepaymentlink2) - Update a link
* [updatePaymentPayment2](#updatepaymentpayment2) - Update a payment
* [updatePaymentSubscription2](#updatepaymentsubscription2) - Update a subscription

## createPaymentLink2

Create a link

### Example Usage

<!-- UsageSnippet language="java" operationID="createPaymentLink2" method="post" path="/payment/{connection_id}/link" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePaymentLink2Request;
import to.unified.unified_java_sdk.models.operations.CreatePaymentLink2Response;
import to.unified.unified_java_sdk.models.shared.PaymentLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePaymentLink2Request req = CreatePaymentLink2Request.builder()
                .paymentLink(PaymentLink.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreatePaymentLink2Response res = sdk.payment().createPaymentLink2()
                .request(req)
                .call();

        if (res.paymentLink().isPresent()) {
            System.out.println(res.paymentLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreatePaymentLink2Request](../../models/operations/CreatePaymentLink2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreatePaymentLink2Response](../../models/operations/CreatePaymentLink2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createPaymentPayment2

Create a payment

### Example Usage

<!-- UsageSnippet language="java" operationID="createPaymentPayment2" method="post" path="/payment/{connection_id}/payment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePaymentPayment2Request;
import to.unified.unified_java_sdk.models.operations.CreatePaymentPayment2Response;
import to.unified.unified_java_sdk.models.shared.PaymentPayment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePaymentPayment2Request req = CreatePaymentPayment2Request.builder()
                .paymentPayment(PaymentPayment.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreatePaymentPayment2Response res = sdk.payment().createPaymentPayment2()
                .request(req)
                .call();

        if (res.paymentPayment().isPresent()) {
            System.out.println(res.paymentPayment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreatePaymentPayment2Request](../../models/operations/CreatePaymentPayment2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreatePaymentPayment2Response](../../models/operations/CreatePaymentPayment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createPaymentSubscription2

Create a subscription

### Example Usage

<!-- UsageSnippet language="java" operationID="createPaymentSubscription2" method="post" path="/payment/{connection_id}/subscription" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePaymentSubscription2Request;
import to.unified.unified_java_sdk.models.operations.CreatePaymentSubscription2Response;
import to.unified.unified_java_sdk.models.shared.PaymentSubscription;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePaymentSubscription2Request req = CreatePaymentSubscription2Request.builder()
                .paymentSubscription(PaymentSubscription.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreatePaymentSubscription2Response res = sdk.payment().createPaymentSubscription2()
                .request(req)
                .call();

        if (res.paymentSubscription().isPresent()) {
            System.out.println(res.paymentSubscription().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [CreatePaymentSubscription2Request](../../models/operations/CreatePaymentSubscription2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[CreatePaymentSubscription2Response](../../models/operations/CreatePaymentSubscription2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPaymentLink2

Retrieve a link

### Example Usage

<!-- UsageSnippet language="java" operationID="getPaymentLink2" method="get" path="/payment/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPaymentLink2Request;
import to.unified.unified_java_sdk.models.operations.GetPaymentLink2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPaymentLink2Request req = GetPaymentLink2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPaymentLink2Response res = sdk.payment().getPaymentLink2()
                .request(req)
                .call();

        if (res.paymentLink().isPresent()) {
            System.out.println(res.paymentLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetPaymentLink2Request](../../models/operations/GetPaymentLink2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetPaymentLink2Response](../../models/operations/GetPaymentLink2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPaymentPayment2

Retrieve a payment

### Example Usage

<!-- UsageSnippet language="java" operationID="getPaymentPayment2" method="get" path="/payment/{connection_id}/payment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPaymentPayment2Request;
import to.unified.unified_java_sdk.models.operations.GetPaymentPayment2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPaymentPayment2Request req = GetPaymentPayment2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPaymentPayment2Response res = sdk.payment().getPaymentPayment2()
                .request(req)
                .call();

        if (res.paymentPayment().isPresent()) {
            System.out.println(res.paymentPayment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetPaymentPayment2Request](../../models/operations/GetPaymentPayment2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetPaymentPayment2Response](../../models/operations/GetPaymentPayment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPaymentPayout2

Retrieve a payout

### Example Usage

<!-- UsageSnippet language="java" operationID="getPaymentPayout2" method="get" path="/payment/{connection_id}/payout/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPaymentPayout2Request;
import to.unified.unified_java_sdk.models.operations.GetPaymentPayout2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPaymentPayout2Request req = GetPaymentPayout2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPaymentPayout2Response res = sdk.payment().getPaymentPayout2()
                .request(req)
                .call();

        if (res.paymentPayout().isPresent()) {
            System.out.println(res.paymentPayout().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetPaymentPayout2Request](../../models/operations/GetPaymentPayout2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetPaymentPayout2Response](../../models/operations/GetPaymentPayout2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPaymentRefund2

Retrieve a refund

### Example Usage

<!-- UsageSnippet language="java" operationID="getPaymentRefund2" method="get" path="/payment/{connection_id}/refund/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPaymentRefund2Request;
import to.unified.unified_java_sdk.models.operations.GetPaymentRefund2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPaymentRefund2Request req = GetPaymentRefund2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPaymentRefund2Response res = sdk.payment().getPaymentRefund2()
                .request(req)
                .call();

        if (res.paymentRefund().isPresent()) {
            System.out.println(res.paymentRefund().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetPaymentRefund2Request](../../models/operations/GetPaymentRefund2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetPaymentRefund2Response](../../models/operations/GetPaymentRefund2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPaymentSubscription2

Retrieve a subscription

### Example Usage

<!-- UsageSnippet language="java" operationID="getPaymentSubscription2" method="get" path="/payment/{connection_id}/subscription/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPaymentSubscription2Request;
import to.unified.unified_java_sdk.models.operations.GetPaymentSubscription2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPaymentSubscription2Request req = GetPaymentSubscription2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPaymentSubscription2Response res = sdk.payment().getPaymentSubscription2()
                .request(req)
                .call();

        if (res.paymentSubscription().isPresent()) {
            System.out.println(res.paymentSubscription().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetPaymentSubscription2Request](../../models/operations/GetPaymentSubscription2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetPaymentSubscription2Response](../../models/operations/GetPaymentSubscription2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPaymentLinks2

List all links

### Example Usage

<!-- UsageSnippet language="java" operationID="listPaymentLinks2" method="get" path="/payment/{connection_id}/link" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPaymentLinks2Request;
import to.unified.unified_java_sdk.models.operations.ListPaymentLinks2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPaymentLinks2Request req = ListPaymentLinks2Request.builder()
                .connectionId("<id>")
                .build();

        ListPaymentLinks2Response res = sdk.payment().listPaymentLinks2()
                .request(req)
                .call();

        if (res.paymentLinks().isPresent()) {
            System.out.println(res.paymentLinks().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListPaymentLinks2Request](../../models/operations/ListPaymentLinks2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListPaymentLinks2Response](../../models/operations/ListPaymentLinks2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPaymentPayments2

List all payments

### Example Usage

<!-- UsageSnippet language="java" operationID="listPaymentPayments2" method="get" path="/payment/{connection_id}/payment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPaymentPayments2Request;
import to.unified.unified_java_sdk.models.operations.ListPaymentPayments2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPaymentPayments2Request req = ListPaymentPayments2Request.builder()
                .connectionId("<id>")
                .build();

        ListPaymentPayments2Response res = sdk.payment().listPaymentPayments2()
                .request(req)
                .call();

        if (res.paymentPayments().isPresent()) {
            System.out.println(res.paymentPayments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListPaymentPayments2Request](../../models/operations/ListPaymentPayments2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListPaymentPayments2Response](../../models/operations/ListPaymentPayments2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPaymentPayouts2

List all payouts

### Example Usage

<!-- UsageSnippet language="java" operationID="listPaymentPayouts2" method="get" path="/payment/{connection_id}/payout" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPaymentPayouts2Request;
import to.unified.unified_java_sdk.models.operations.ListPaymentPayouts2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPaymentPayouts2Request req = ListPaymentPayouts2Request.builder()
                .connectionId("<id>")
                .build();

        ListPaymentPayouts2Response res = sdk.payment().listPaymentPayouts2()
                .request(req)
                .call();

        if (res.paymentPayouts().isPresent()) {
            System.out.println(res.paymentPayouts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListPaymentPayouts2Request](../../models/operations/ListPaymentPayouts2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListPaymentPayouts2Response](../../models/operations/ListPaymentPayouts2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPaymentRefunds2

List all refunds

### Example Usage

<!-- UsageSnippet language="java" operationID="listPaymentRefunds2" method="get" path="/payment/{connection_id}/refund" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPaymentRefunds2Request;
import to.unified.unified_java_sdk.models.operations.ListPaymentRefunds2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPaymentRefunds2Request req = ListPaymentRefunds2Request.builder()
                .connectionId("<id>")
                .build();

        ListPaymentRefunds2Response res = sdk.payment().listPaymentRefunds2()
                .request(req)
                .call();

        if (res.paymentRefunds().isPresent()) {
            System.out.println(res.paymentRefunds().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListPaymentRefunds2Request](../../models/operations/ListPaymentRefunds2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListPaymentRefunds2Response](../../models/operations/ListPaymentRefunds2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPaymentSubscriptions2

List all subscriptions

### Example Usage

<!-- UsageSnippet language="java" operationID="listPaymentSubscriptions2" method="get" path="/payment/{connection_id}/subscription" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPaymentSubscriptions2Request;
import to.unified.unified_java_sdk.models.operations.ListPaymentSubscriptions2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPaymentSubscriptions2Request req = ListPaymentSubscriptions2Request.builder()
                .connectionId("<id>")
                .build();

        ListPaymentSubscriptions2Response res = sdk.payment().listPaymentSubscriptions2()
                .request(req)
                .call();

        if (res.paymentSubscriptions().isPresent()) {
            System.out.println(res.paymentSubscriptions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListPaymentSubscriptions2Request](../../models/operations/ListPaymentSubscriptions2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListPaymentSubscriptions2Response](../../models/operations/ListPaymentSubscriptions2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPaymentLink2

Update a link

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPaymentLink2" method="patch" path="/payment/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPaymentLink2Request;
import to.unified.unified_java_sdk.models.operations.PatchPaymentLink2Response;
import to.unified.unified_java_sdk.models.shared.PaymentLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPaymentLink2Request req = PatchPaymentLink2Request.builder()
                .paymentLink(PaymentLink.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPaymentLink2Response res = sdk.payment().patchPaymentLink2()
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
| `request`                                                                       | [PatchPaymentLink2Request](../../models/operations/PatchPaymentLink2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchPaymentLink2Response](../../models/operations/PatchPaymentLink2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPaymentPayment2

Update a payment

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPaymentPayment2" method="patch" path="/payment/{connection_id}/payment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPaymentPayment2Request;
import to.unified.unified_java_sdk.models.operations.PatchPaymentPayment2Response;
import to.unified.unified_java_sdk.models.shared.PaymentPayment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPaymentPayment2Request req = PatchPaymentPayment2Request.builder()
                .paymentPayment(PaymentPayment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPaymentPayment2Response res = sdk.payment().patchPaymentPayment2()
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
| `request`                                                                             | [PatchPaymentPayment2Request](../../models/operations/PatchPaymentPayment2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchPaymentPayment2Response](../../models/operations/PatchPaymentPayment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPaymentSubscription2

Update a subscription

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPaymentSubscription2" method="patch" path="/payment/{connection_id}/subscription/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPaymentSubscription2Request;
import to.unified.unified_java_sdk.models.operations.PatchPaymentSubscription2Response;
import to.unified.unified_java_sdk.models.shared.PaymentSubscription;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPaymentSubscription2Request req = PatchPaymentSubscription2Request.builder()
                .paymentSubscription(PaymentSubscription.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPaymentSubscription2Response res = sdk.payment().patchPaymentSubscription2()
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
| `request`                                                                                       | [PatchPaymentSubscription2Request](../../models/operations/PatchPaymentSubscription2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[PatchPaymentSubscription2Response](../../models/operations/PatchPaymentSubscription2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removePaymentLink2

Remove a link

### Example Usage

<!-- UsageSnippet language="java" operationID="removePaymentLink2" method="delete" path="/payment/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemovePaymentLink2Request;
import to.unified.unified_java_sdk.models.operations.RemovePaymentLink2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemovePaymentLink2Request req = RemovePaymentLink2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemovePaymentLink2Response res = sdk.payment().removePaymentLink2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemovePaymentLink2Request](../../models/operations/RemovePaymentLink2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemovePaymentLink2Response](../../models/operations/RemovePaymentLink2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removePaymentPayment2

Remove a payment

### Example Usage

<!-- UsageSnippet language="java" operationID="removePaymentPayment2" method="delete" path="/payment/{connection_id}/payment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemovePaymentPayment2Request;
import to.unified.unified_java_sdk.models.operations.RemovePaymentPayment2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemovePaymentPayment2Request req = RemovePaymentPayment2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemovePaymentPayment2Response res = sdk.payment().removePaymentPayment2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemovePaymentPayment2Request](../../models/operations/RemovePaymentPayment2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemovePaymentPayment2Response](../../models/operations/RemovePaymentPayment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removePaymentSubscription2

Remove a subscription

### Example Usage

<!-- UsageSnippet language="java" operationID="removePaymentSubscription2" method="delete" path="/payment/{connection_id}/subscription/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemovePaymentSubscription2Request;
import to.unified.unified_java_sdk.models.operations.RemovePaymentSubscription2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemovePaymentSubscription2Request req = RemovePaymentSubscription2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemovePaymentSubscription2Response res = sdk.payment().removePaymentSubscription2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [RemovePaymentSubscription2Request](../../models/operations/RemovePaymentSubscription2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[RemovePaymentSubscription2Response](../../models/operations/RemovePaymentSubscription2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePaymentLink2

Update a link

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePaymentLink2" method="put" path="/payment/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentLink2Request;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentLink2Response;
import to.unified.unified_java_sdk.models.shared.PaymentLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePaymentLink2Request req = UpdatePaymentLink2Request.builder()
                .paymentLink(PaymentLink.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePaymentLink2Response res = sdk.payment().updatePaymentLink2()
                .request(req)
                .call();

        if (res.paymentLink().isPresent()) {
            System.out.println(res.paymentLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdatePaymentLink2Request](../../models/operations/UpdatePaymentLink2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdatePaymentLink2Response](../../models/operations/UpdatePaymentLink2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePaymentPayment2

Update a payment

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePaymentPayment2" method="put" path="/payment/{connection_id}/payment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentPayment2Request;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentPayment2Response;
import to.unified.unified_java_sdk.models.shared.PaymentPayment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePaymentPayment2Request req = UpdatePaymentPayment2Request.builder()
                .paymentPayment(PaymentPayment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePaymentPayment2Response res = sdk.payment().updatePaymentPayment2()
                .request(req)
                .call();

        if (res.paymentPayment().isPresent()) {
            System.out.println(res.paymentPayment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdatePaymentPayment2Request](../../models/operations/UpdatePaymentPayment2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdatePaymentPayment2Response](../../models/operations/UpdatePaymentPayment2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePaymentSubscription2

Update a subscription

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePaymentSubscription2" method="put" path="/payment/{connection_id}/subscription/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentSubscription2Request;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentSubscription2Response;
import to.unified.unified_java_sdk.models.shared.PaymentSubscription;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePaymentSubscription2Request req = UpdatePaymentSubscription2Request.builder()
                .paymentSubscription(PaymentSubscription.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePaymentSubscription2Response res = sdk.payment().updatePaymentSubscription2()
                .request(req)
                .call();

        if (res.paymentSubscription().isPresent()) {
            System.out.println(res.paymentSubscription().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [UpdatePaymentSubscription2Request](../../models/operations/UpdatePaymentSubscription2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[UpdatePaymentSubscription2Response](../../models/operations/UpdatePaymentSubscription2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |