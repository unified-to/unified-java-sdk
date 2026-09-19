# Order

## Overview

### Available Operations

* [createAccountingOrder](#createaccountingorder) - Create an order
* [createAssessmentOrder](#createassessmentorder) - Create an order
* [getAccountingOrder](#getaccountingorder) - Retrieve an order
* [getAssessmentOrder](#getassessmentorder) - Retrieve an order
* [listAccountingOrders](#listaccountingorders) - List all orders
* [patchAccountingOrder](#patchaccountingorder) - Update an order
* [patchAssessmentOrder](#patchassessmentorder) - Update an order
* [removeAccountingOrder](#removeaccountingorder) - Remove an order
* [updateAccountingOrder](#updateaccountingorder) - Update an order
* [updateAssessmentOrder](#updateassessmentorder) - Update an order

## createAccountingOrder

Create an order

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingOrder" method="post" path="/accounting/{connection_id}/order" example="accounting_order" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingOrderRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingOrderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingOrderRequest req = CreateAccountingOrderRequest.builder()
                .accountingOrder(AccountingOrder.builder()
                    .billingAddress(PropertyAccountingOrderBillingAddress.builder()
                        .address1("802 Bechtelar Park")
                        .address2("Apt. 436")
                        .city("Daniellaville")
                        .countryCode("US")
                        .postalCode("36947")
                        .region("Wisconsin")
                        .regionCode("NY")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .currency("USD")
                    .id("ce463da4-6363-4424-8d5b-0f731a37ae1d")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2022-04-05T05:50:26.641Z"))
                    .shippingAddress(PropertyAccountingOrderShippingAddress.builder()
                        .address1("9745 Betty Shore")
                        .city("South Alainaland")
                        .countryCode("US")
                        .postalCode("25274-7654")
                        .region("New Hampshire")
                        .regionCode("LA")
                        .build())
                    .status(AccountingOrderStatus.SUBMITTED)
                    .totalAmount(0d)
                    .type(AccountingOrderType.PURCHASE)
                    .updatedAt(OffsetDateTime.parse("2021-06-18T01:01:21.905Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingOrderResponse res = sdk.order().createAccountingOrder()
                .request(req)
                .call();

        if (res.accountingOrder().isPresent()) {
            System.out.println(res.accountingOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateAccountingOrderRequest](../../models/operations/CreateAccountingOrderRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateAccountingOrderResponse](../../models/operations/CreateAccountingOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAssessmentOrder

Create an order

### Example Usage

<!-- UsageSnippet language="java" operationID="createAssessmentOrder" method="post" path="/assessment/{connection_id}/order" example="assessment_order" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAssessmentOrderRequest;
import to.unified.unified_java_sdk.models.operations.CreateAssessmentOrderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAssessmentOrderRequest req = CreateAssessmentOrderRequest.builder()
                .assessmentOrder(AssessmentOrder.builder()
                    .connectionId("<id>")
                    .workspaceId("<id>")
                    .createdAt(OffsetDateTime.parse("2021-09-18T10:33:57.803Z"))
                    .id("74723067-c617-44f7-997b-c4d146118d2c")
                    .parameters(List.of())
                    .profileAddresses(List.of())
                    .profileDateOfBirth("1989-07-22T16:18:37.650Z")
                    .profileEmails(List.of(
                        "Cleta.Daugherty@gmail.com"))
                    .profileFirstName("Amy")
                    .profileGender(ProfileGender.NON_BINARY)
                    .profileLastName("Kris-Windler")
                    .profileName("Amy Kris-Windler")
                    .profileResumeUrl("https://enchanted-cycle.biz/")
                    .profileSocialMediaUrls(List.of())
                    .profileTelephones(List.of(
                        "(828) 263-1594 x5248"))
                    .reference("ab")
                    .responseAttributes(List.of())
                    .responseDetails(List.of())
                    .responseDownloadUrls(List.of())
                    .responseMaxScore(82d)
                    .responseScore(92d)
                    .responseStatus(ResponseStatus.FAILED)
                    .responseUrl("https://irresponsible-trench.info/")
                    .status(AssessmentOrderStatus.REJECTED)
                    .targetUrl("https://cautious-turret.info")
                    .updatedAt(OffsetDateTime.parse("2023-01-17T08:11:55.725Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAssessmentOrderResponse res = sdk.order().createAssessmentOrder()
                .request(req)
                .call();

        if (res.assessmentOrder().isPresent()) {
            System.out.println(res.assessmentOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateAssessmentOrderRequest](../../models/operations/CreateAssessmentOrderRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateAssessmentOrderResponse](../../models/operations/CreateAssessmentOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingOrder

Retrieve an order

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingOrder" method="get" path="/accounting/{connection_id}/order/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingOrderRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingOrderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingOrderRequest req = GetAccountingOrderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingOrderResponse res = sdk.order().getAccountingOrder()
                .request(req)
                .call();

        if (res.accountingOrder().isPresent()) {
            System.out.println(res.accountingOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAccountingOrderRequest](../../models/operations/GetAccountingOrderRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAccountingOrderResponse](../../models/operations/GetAccountingOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAssessmentOrder

Retrieve an order

### Example Usage

<!-- UsageSnippet language="java" operationID="getAssessmentOrder" method="get" path="/assessment/{connection_id}/order/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAssessmentOrderRequest;
import to.unified.unified_java_sdk.models.operations.GetAssessmentOrderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAssessmentOrderRequest req = GetAssessmentOrderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAssessmentOrderResponse res = sdk.order().getAssessmentOrder()
                .request(req)
                .call();

        if (res.assessmentOrder().isPresent()) {
            System.out.println(res.assessmentOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAssessmentOrderRequest](../../models/operations/GetAssessmentOrderRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAssessmentOrderResponse](../../models/operations/GetAssessmentOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingOrders

List all orders

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingOrders" method="get" path="/accounting/{connection_id}/order" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingOrdersRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingOrdersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingOrdersRequest req = ListAccountingOrdersRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingOrdersResponse res = sdk.order().listAccountingOrders()
                .request(req)
                .call();

        if (res.accountingOrders().isPresent()) {
            System.out.println(res.accountingOrders().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListAccountingOrdersRequest](../../models/operations/ListAccountingOrdersRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListAccountingOrdersResponse](../../models/operations/ListAccountingOrdersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingOrder

Update an order

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingOrder" method="patch" path="/accounting/{connection_id}/order/{id}" example="accounting_order" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingOrderRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingOrderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingOrderRequest req = PatchAccountingOrderRequest.builder()
                .accountingOrder(AccountingOrder.builder()
                    .billingAddress(PropertyAccountingOrderBillingAddress.builder()
                        .address1("802 Bechtelar Park")
                        .address2("Apt. 436")
                        .city("Daniellaville")
                        .countryCode("US")
                        .postalCode("36947")
                        .region("Wisconsin")
                        .regionCode("NY")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .currency("USD")
                    .id("8ebcbf0f-541e-4852-aa2c-8182ef960448")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2022-04-05T05:50:26.654Z"))
                    .shippingAddress(PropertyAccountingOrderShippingAddress.builder()
                        .address1("9745 Betty Shore")
                        .city("South Alainaland")
                        .countryCode("US")
                        .postalCode("25274-7654")
                        .region("New Hampshire")
                        .regionCode("LA")
                        .build())
                    .status(AccountingOrderStatus.SUBMITTED)
                    .totalAmount(0d)
                    .type(AccountingOrderType.PURCHASE)
                    .updatedAt(OffsetDateTime.parse("2021-06-18T01:01:21.911Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingOrderResponse res = sdk.order().patchAccountingOrder()
                .request(req)
                .call();

        if (res.accountingOrder().isPresent()) {
            System.out.println(res.accountingOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchAccountingOrderRequest](../../models/operations/PatchAccountingOrderRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchAccountingOrderResponse](../../models/operations/PatchAccountingOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAssessmentOrder

Update an order

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAssessmentOrder" method="patch" path="/assessment/{connection_id}/order/{id}" example="assessment_order" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAssessmentOrderRequest;
import to.unified.unified_java_sdk.models.operations.PatchAssessmentOrderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAssessmentOrderRequest req = PatchAssessmentOrderRequest.builder()
                .assessmentOrder(AssessmentOrder.builder()
                    .connectionId("<id>")
                    .workspaceId("<id>")
                    .createdAt(OffsetDateTime.parse("2021-09-18T10:33:57.803Z"))
                    .id("5df5c6c0-0078-49ec-b135-bf4f8a0ed0ae")
                    .parameters(List.of())
                    .profileAddresses(List.of())
                    .profileDateOfBirth("1989-07-22T16:18:37.650Z")
                    .profileEmails(List.of(
                        "Cleta.Daugherty@gmail.com"))
                    .profileFirstName("Amy")
                    .profileGender(ProfileGender.NON_BINARY)
                    .profileLastName("Kris-Windler")
                    .profileName("Amy Kris-Windler")
                    .profileResumeUrl("https://enchanted-cycle.biz/")
                    .profileSocialMediaUrls(List.of())
                    .profileTelephones(List.of(
                        "(828) 263-1594 x5248"))
                    .reference("ab")
                    .responseAttributes(List.of())
                    .responseDetails(List.of())
                    .responseDownloadUrls(List.of())
                    .responseMaxScore(82d)
                    .responseScore(92d)
                    .responseStatus(ResponseStatus.FAILED)
                    .responseUrl("https://irresponsible-trench.info/")
                    .status(AssessmentOrderStatus.REJECTED)
                    .targetUrl("https://cautious-turret.info")
                    .updatedAt(OffsetDateTime.parse("2023-01-17T08:11:55.739Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAssessmentOrderResponse res = sdk.order().patchAssessmentOrder()
                .request(req)
                .call();

        if (res.assessmentOrder().isPresent()) {
            System.out.println(res.assessmentOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchAssessmentOrderRequest](../../models/operations/PatchAssessmentOrderRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchAssessmentOrderResponse](../../models/operations/PatchAssessmentOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingOrder

Remove an order

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingOrder" method="delete" path="/accounting/{connection_id}/order/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingOrderRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingOrderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingOrderRequest req = RemoveAccountingOrderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingOrderResponse res = sdk.order().removeAccountingOrder()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveAccountingOrderRequest](../../models/operations/RemoveAccountingOrderRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveAccountingOrderResponse](../../models/operations/RemoveAccountingOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingOrder

Update an order

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingOrder" method="put" path="/accounting/{connection_id}/order/{id}" example="accounting_order" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingOrderRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingOrderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingOrderRequest req = UpdateAccountingOrderRequest.builder()
                .accountingOrder(AccountingOrder.builder()
                    .billingAddress(PropertyAccountingOrderBillingAddress.builder()
                        .address1("802 Bechtelar Park")
                        .address2("Apt. 436")
                        .city("Daniellaville")
                        .countryCode("US")
                        .postalCode("36947")
                        .region("Wisconsin")
                        .regionCode("NY")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .currency("USD")
                    .id("8ebcbf0f-541e-4852-aa2c-8182ef960448")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2022-04-05T05:50:26.654Z"))
                    .shippingAddress(PropertyAccountingOrderShippingAddress.builder()
                        .address1("9745 Betty Shore")
                        .city("South Alainaland")
                        .countryCode("US")
                        .postalCode("25274-7654")
                        .region("New Hampshire")
                        .regionCode("LA")
                        .build())
                    .status(AccountingOrderStatus.SUBMITTED)
                    .totalAmount(0d)
                    .type(AccountingOrderType.PURCHASE)
                    .updatedAt(OffsetDateTime.parse("2021-06-18T01:01:21.911Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingOrderResponse res = sdk.order().updateAccountingOrder()
                .request(req)
                .call();

        if (res.accountingOrder().isPresent()) {
            System.out.println(res.accountingOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateAccountingOrderRequest](../../models/operations/UpdateAccountingOrderRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateAccountingOrderResponse](../../models/operations/UpdateAccountingOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAssessmentOrder

Update an order

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAssessmentOrder" method="put" path="/assessment/{connection_id}/order/{id}" example="assessment_order" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAssessmentOrderRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAssessmentOrderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAssessmentOrderRequest req = UpdateAssessmentOrderRequest.builder()
                .assessmentOrder(AssessmentOrder.builder()
                    .connectionId("<id>")
                    .workspaceId("<id>")
                    .createdAt(OffsetDateTime.parse("2021-09-18T10:33:57.803Z"))
                    .id("5df5c6c0-0078-49ec-b135-bf4f8a0ed0ae")
                    .parameters(List.of())
                    .profileAddresses(List.of())
                    .profileDateOfBirth("1989-07-22T16:18:37.650Z")
                    .profileEmails(List.of(
                        "Cleta.Daugherty@gmail.com"))
                    .profileFirstName("Amy")
                    .profileGender(ProfileGender.NON_BINARY)
                    .profileLastName("Kris-Windler")
                    .profileName("Amy Kris-Windler")
                    .profileResumeUrl("https://enchanted-cycle.biz/")
                    .profileSocialMediaUrls(List.of())
                    .profileTelephones(List.of(
                        "(828) 263-1594 x5248"))
                    .reference("ab")
                    .responseAttributes(List.of())
                    .responseDetails(List.of())
                    .responseDownloadUrls(List.of())
                    .responseMaxScore(82d)
                    .responseScore(92d)
                    .responseStatus(ResponseStatus.FAILED)
                    .responseUrl("https://irresponsible-trench.info/")
                    .status(AssessmentOrderStatus.REJECTED)
                    .targetUrl("https://cautious-turret.info")
                    .updatedAt(OffsetDateTime.parse("2023-01-17T08:11:55.739Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAssessmentOrderResponse res = sdk.order().updateAssessmentOrder()
                .request(req)
                .call();

        if (res.assessmentOrder().isPresent()) {
            System.out.println(res.assessmentOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateAssessmentOrderRequest](../../models/operations/UpdateAssessmentOrderRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateAssessmentOrderResponse](../../models/operations/UpdateAssessmentOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |