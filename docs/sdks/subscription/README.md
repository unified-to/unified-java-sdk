# Subscription

## Overview

### Available Operations

* [createPaymentSubscription2](#createpaymentsubscription2) - Create a subscription
* [getPaymentSubscription2](#getpaymentsubscription2) - Retrieve a subscription
* [listPaymentSubscriptions2](#listpaymentsubscriptions2) - List all subscriptions
* [patchPaymentSubscription2](#patchpaymentsubscription2) - Update a subscription
* [removePaymentSubscription2](#removepaymentsubscription2) - Remove a subscription
* [updatePaymentSubscription2](#updatepaymentsubscription2) - Update a subscription

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

        CreatePaymentSubscription2Response res = sdk.subscription().createPaymentSubscription2()
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

        GetPaymentSubscription2Response res = sdk.subscription().getPaymentSubscription2()
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

        ListPaymentSubscriptions2Response res = sdk.subscription().listPaymentSubscriptions2()
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

        PatchPaymentSubscription2Response res = sdk.subscription().patchPaymentSubscription2()
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

        RemovePaymentSubscription2Response res = sdk.subscription().removePaymentSubscription2()
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

        UpdatePaymentSubscription2Response res = sdk.subscription().updatePaymentSubscription2()
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