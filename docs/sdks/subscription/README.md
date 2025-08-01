# Subscription
(*subscription()*)

## Overview

### Available Operations

* [createPaymentSubscription](#createpaymentsubscription) - Create a subscription
* [getPaymentSubscription](#getpaymentsubscription) - Retrieve a subscription
* [listPaymentSubscriptions](#listpaymentsubscriptions) - List all subscriptions
* [patchPaymentSubscription](#patchpaymentsubscription) - Update a subscription
* [removePaymentSubscription](#removepaymentsubscription) - Remove a subscription
* [updatePaymentSubscription](#updatepaymentsubscription) - Update a subscription

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

        CreatePaymentSubscriptionResponse res = sdk.subscription().createPaymentSubscription()
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

        GetPaymentSubscriptionResponse res = sdk.subscription().getPaymentSubscription()
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

        ListPaymentSubscriptionsResponse res = sdk.subscription().listPaymentSubscriptions()
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

        PatchPaymentSubscriptionResponse res = sdk.subscription().patchPaymentSubscription()
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

        RemovePaymentSubscriptionResponse res = sdk.subscription().removePaymentSubscription()
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

        UpdatePaymentSubscriptionResponse res = sdk.subscription().updatePaymentSubscription()
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