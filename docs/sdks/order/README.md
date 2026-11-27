# Order

## Overview

### Available Operations

* [~~createAccountingOrder~~](#createaccountingorder) - Create an order :warning: **Deprecated**
* [createAssessmentOrder](#createassessmentorder) - Create an order
* [createPrintingOrder](#createprintingorder) - Create an order
* [~~getAccountingOrder~~](#getaccountingorder) - Retrieve an order :warning: **Deprecated**
* [getAssessmentOrder](#getassessmentorder) - Retrieve an order
* [getPrintingOrder](#getprintingorder) - Retrieve an order
* [~~listAccountingOrders~~](#listaccountingorders) - List all orders :warning: **Deprecated**
* [listPrintingOrders](#listprintingorders) - List all orders
* [~~patchAccountingOrder~~](#patchaccountingorder) - Update an order :warning: **Deprecated**
* [patchAssessmentOrder](#patchassessmentorder) - Update an order
* [patchPrintingOrder](#patchprintingorder) - Update an order
* [~~removeAccountingOrder~~](#removeaccountingorder) - Remove an order :warning: **Deprecated**
* [removePrintingOrder](#removeprintingorder) - Remove an order
* [~~updateAccountingOrder~~](#updateaccountingorder) - Update an order :warning: **Deprecated**
* [updateAssessmentOrder](#updateassessmentorder) - Update an order
* [updatePrintingOrder](#updateprintingorder) - Update an order

## ~~createAccountingOrder~~

Creates a AccountingOrder. Provide the unified AccountingOrder fields in the request body; they are mapped to the provider's API. Returns the created AccountingOrder.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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
                        .address1("125 Hayden Highway")
                        .city("Altoona")
                        .countryCode("US")
                        .postalCode("94706-7691")
                        .region("Louisiana")
                        .regionCode("VT")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .currency("GBP")
                    .id("e01047a5-6d85-4e81-981a-dfeec66bb5cb")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .shippingAddress(PropertyAccountingOrderShippingAddress.builder()
                        .address1("450 Garett Mall")
                        .city("New Kamronburgh")
                        .countryCode("US")
                        .postalCode("76546")
                        .region("Oregon")
                        .regionCode("VA")
                        .build())
                    .status(AccountingOrderStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .type(AccountingOrderType.SALES)
                    .updatedAt(OffsetDateTime.parse("2022-02-15T22:20:28.857Z"))
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

Creates a AssessmentOrder. Provide the unified AssessmentOrder fields in the request body; they are mapped to the provider's API. Returns the created AssessmentOrder.

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
                    .connectionId("")
                    .workspaceId("<id>")
                    .createdAt(OffsetDateTime.parse("2021-09-18T10:33:57.803Z"))
                    .id("798a1ea8-5b48-4200-88a6-66708fb03379")
                    .metadata(List.of())
                    .parameters(List.of())
                    .profileAddresses(List.of())
                    .profileDateOfBirth("1989-07-22T16:18:37.650Z")
                    .profileEmails(List.of(
                        "jordan.braun@icloud.com"))
                    .profileFirstName("Jordan")
                    .profileGender(ProfileGender.NON_BINARY)
                    .profileLastName("Braun")
                    .profileName("Jordan Braun")
                    .profileResumeUrl("https://astonishing-bug.com/")
                    .profileSocialMediaUrls(List.of())
                    .profileTelephones(List.of(
                        "322.658.2806 x3159"))
                    .reference("calcar")
                    .responseAttributes(List.of())
                    .responseDetails(List.of())
                    .responseDownloadUrls(List.of())
                    .responseMaxScore(84d)
                    .responseScore(82d)
                    .responseStatus(ResponseStatus.REJECTED)
                    .responseUrl("https://nervous-daughter.info/")
                    .status(AssessmentOrderStatus.REJECTED)
                    .targetUrl("https://idolized-suv.info")
                    .updatedAt(OffsetDateTime.parse("2023-02-04T16:55:37.901Z"))
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

## createPrintingOrder

Creates a PrintingOrder. Provide the unified PrintingOrder fields in the request body; they are mapped to the provider's API. Returns the created PrintingOrder.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPrintingOrder" method="post" path="/printing/{connection_id}/order" example="printing_order" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePrintingOrderRequest;
import to.unified.unified_java_sdk.models.operations.CreatePrintingOrderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePrintingOrderRequest req = CreatePrintingOrderRequest.builder()
                .printingOrder(PrintingOrder.builder()
                    .createdAt(OffsetDateTime.parse("2022-03-14T11:16:15.147Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .id("062ea5f3-9b65-4ef4-ad12-c5457fc968e9")
                    .lineitems(List.of(
                        PrintingLineitem.builder()
                            .files(List.of(
                                PrintingLineitemFile.builder()
                                    .placement("default")
                                    .url("https://picsum.photos/seed/y54e6o9hYi/191/3357")
                                    .build()))
                            .id("1")
                            .name("Bespoke Marble Chair")
                            .quantity(2d)
                            .retailPriceAmount(54.89)
                            .sku("IBDIE3XR")
                            .unitPriceAmount(26.37)
                            .build(),
                        PrintingLineitem.builder()
                            .files(List.of(
                                PrintingLineitemFile.builder()
                                    .placement("default")
                                    .url("https://picsum.photos/seed/T7S5xf/3521/1221")
                                    .build()))
                            .id("2")
                            .name("Electronic Cotton Hat")
                            .quantity(1d)
                            .retailPriceAmount(23.94)
                            .unitPriceAmount(10.04)
                            .build()))
                    .metadata(List.of())
                    .shipments(List.of())
                    .shippingAddress(PropertyPrintingOrderShippingAddress.builder()
                        .address1("651 Main Street")
                        .city("Euclid")
                        .country("United States")
                        .countryCode("US")
                        .email("gary_leffler28@gmail.com")
                        .name("Angelita Denesik")
                        .postalCode("80301")
                        .region("Colorado")
                        .regionCode("AR")
                        .telephone("808-831-6489 x62979")
                        .build())
                    .shippingAmount(4.69)
                    .shippingMethod("STANDARD")
                    .status(PrintingOrderStatus.OTHER)
                    .subtotalAmount(62.78)
                    .taxAmount(5.02)
                    .totalAmount(72.49)
                    .updatedAt(OffsetDateTime.parse("2025-01-23T15:59:59.207Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreatePrintingOrderResponse res = sdk.order().createPrintingOrder()
                .request(req)
                .call();

        if (res.printingOrder().isPresent()) {
            System.out.println(res.printingOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreatePrintingOrderRequest](../../models/operations/CreatePrintingOrderRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreatePrintingOrderResponse](../../models/operations/CreatePrintingOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~getAccountingOrder~~

Retrieves a single AccountingOrder by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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

Retrieves a single AssessmentOrder by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

## getPrintingOrder

Retrieves a single PrintingOrder by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPrintingOrder" method="get" path="/printing/{connection_id}/order/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPrintingOrderRequest;
import to.unified.unified_java_sdk.models.operations.GetPrintingOrderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPrintingOrderRequest req = GetPrintingOrderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPrintingOrderResponse res = sdk.order().getPrintingOrder()
                .request(req)
                .call();

        if (res.printingOrder().isPresent()) {
            System.out.println(res.printingOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetPrintingOrderRequest](../../models/operations/GetPrintingOrderRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetPrintingOrderResponse](../../models/operations/GetPrintingOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~listAccountingOrders~~

Returns a list of AccountingOrders. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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

## listPrintingOrders

Returns a list of PrintingOrders. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPrintingOrders" method="get" path="/printing/{connection_id}/order" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPrintingOrdersRequest;
import to.unified.unified_java_sdk.models.operations.ListPrintingOrdersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPrintingOrdersRequest req = ListPrintingOrdersRequest.builder()
                .connectionId("<id>")
                .build();

        ListPrintingOrdersResponse res = sdk.order().listPrintingOrders()
                .request(req)
                .call();

        if (res.printingOrders().isPresent()) {
            System.out.println(res.printingOrders().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListPrintingOrdersRequest](../../models/operations/ListPrintingOrdersRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListPrintingOrdersResponse](../../models/operations/ListPrintingOrdersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~patchAccountingOrder~~

Updates the AccountingOrder identified by `id`. Provide the unified AccountingOrder fields to change in the request body.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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
                        .address1("125 Hayden Highway")
                        .city("Altoona")
                        .countryCode("US")
                        .postalCode("94706-7691")
                        .region("Louisiana")
                        .regionCode("VT")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .currency("GBP")
                    .id("5def7119-f436-411b-b12f-2ec6d4502bde")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .shippingAddress(PropertyAccountingOrderShippingAddress.builder()
                        .address1("450 Garett Mall")
                        .city("New Kamronburgh")
                        .countryCode("US")
                        .postalCode("76546")
                        .region("Oregon")
                        .regionCode("VA")
                        .build())
                    .status(AccountingOrderStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .type(AccountingOrderType.SALES)
                    .updatedAt(OffsetDateTime.parse("2022-02-15T22:20:28.864Z"))
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

Updates the AssessmentOrder identified by `id`. Provide the unified AssessmentOrder fields to change in the request body.

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
                    .connectionId("")
                    .workspaceId("<id>")
                    .createdAt(OffsetDateTime.parse("2021-09-18T10:33:57.803Z"))
                    .id("3924cfa3-a745-4384-8ed0-ab95ec9a2caf")
                    .metadata(List.of())
                    .parameters(List.of())
                    .profileAddresses(List.of())
                    .profileDateOfBirth("1989-07-22T16:18:37.650Z")
                    .profileEmails(List.of(
                        "jordan.braun@icloud.com"))
                    .profileFirstName("Jordan")
                    .profileGender(ProfileGender.NON_BINARY)
                    .profileLastName("Braun")
                    .profileName("Jordan Braun")
                    .profileResumeUrl("https://astonishing-bug.com/")
                    .profileSocialMediaUrls(List.of())
                    .profileTelephones(List.of(
                        "322.658.2806 x3159"))
                    .reference("calcar")
                    .responseAttributes(List.of())
                    .responseDetails(List.of())
                    .responseDownloadUrls(List.of())
                    .responseMaxScore(84d)
                    .responseScore(82d)
                    .responseStatus(ResponseStatus.REJECTED)
                    .responseUrl("https://nervous-daughter.info/")
                    .status(AssessmentOrderStatus.REJECTED)
                    .targetUrl("https://idolized-suv.info")
                    .updatedAt(OffsetDateTime.parse("2023-02-04T16:55:37.913Z"))
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

## patchPrintingOrder

Updates the PrintingOrder identified by `id`. Provide the unified PrintingOrder fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPrintingOrder" method="patch" path="/printing/{connection_id}/order/{id}" example="printing_order" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPrintingOrderRequest;
import to.unified.unified_java_sdk.models.operations.PatchPrintingOrderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPrintingOrderRequest req = PatchPrintingOrderRequest.builder()
                .printingOrder(PrintingOrder.builder()
                    .createdAt(OffsetDateTime.parse("2022-03-14T11:16:15.147Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .id("26effdf1-6b9f-4fb4-95a6-79f958598334")
                    .lineitems(List.of(
                        PrintingLineitem.builder()
                            .files(List.of(
                                PrintingLineitemFile.builder()
                                    .placement("default")
                                    .url("https://picsum.photos/seed/y54e6o9hYi/191/3357")
                                    .build()))
                            .id("1")
                            .name("Bespoke Marble Chair")
                            .quantity(2d)
                            .retailPriceAmount(54.89)
                            .sku("IBDIE3XR")
                            .unitPriceAmount(26.37)
                            .build(),
                        PrintingLineitem.builder()
                            .files(List.of(
                                PrintingLineitemFile.builder()
                                    .placement("default")
                                    .url("https://picsum.photos/seed/T7S5xf/3521/1221")
                                    .build()))
                            .id("2")
                            .name("Electronic Cotton Hat")
                            .quantity(1d)
                            .retailPriceAmount(23.94)
                            .unitPriceAmount(10.04)
                            .build()))
                    .metadata(List.of())
                    .shipments(List.of())
                    .shippingAddress(PropertyPrintingOrderShippingAddress.builder()
                        .address1("651 Main Street")
                        .city("Euclid")
                        .country("United States")
                        .countryCode("US")
                        .email("gary_leffler28@gmail.com")
                        .name("Angelita Denesik")
                        .postalCode("80301")
                        .region("Colorado")
                        .regionCode("AR")
                        .telephone("808-831-6489 x62979")
                        .build())
                    .shippingAmount(4.69)
                    .shippingMethod("STANDARD")
                    .status(PrintingOrderStatus.OTHER)
                    .subtotalAmount(62.78)
                    .taxAmount(5.02)
                    .totalAmount(72.49)
                    .updatedAt(OffsetDateTime.parse("2025-01-23T15:59:59.226Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPrintingOrderResponse res = sdk.order().patchPrintingOrder()
                .request(req)
                .call();

        if (res.printingOrder().isPresent()) {
            System.out.println(res.printingOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchPrintingOrderRequest](../../models/operations/PatchPrintingOrderRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchPrintingOrderResponse](../../models/operations/PatchPrintingOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~removeAccountingOrder~~

Deletes the AccountingOrder identified by `id`.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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

## removePrintingOrder

Deletes the PrintingOrder identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removePrintingOrder" method="delete" path="/printing/{connection_id}/order/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemovePrintingOrderRequest;
import to.unified.unified_java_sdk.models.operations.RemovePrintingOrderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemovePrintingOrderRequest req = RemovePrintingOrderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemovePrintingOrderResponse res = sdk.order().removePrintingOrder()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemovePrintingOrderRequest](../../models/operations/RemovePrintingOrderRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemovePrintingOrderResponse](../../models/operations/RemovePrintingOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~updateAccountingOrder~~

Updates the AccountingOrder identified by `id`. Provide the unified AccountingOrder fields to change in the request body.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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
                        .address1("125 Hayden Highway")
                        .city("Altoona")
                        .countryCode("US")
                        .postalCode("94706-7691")
                        .region("Louisiana")
                        .regionCode("VT")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .currency("GBP")
                    .id("5def7119-f436-411b-b12f-2ec6d4502bde")
                    .lineitems(List.of())
                    .metadata(List.of())
                    .postedAt(OffsetDateTime.parse("2020-11-20T03:46:49.837Z"))
                    .shippingAddress(PropertyAccountingOrderShippingAddress.builder()
                        .address1("450 Garett Mall")
                        .city("New Kamronburgh")
                        .countryCode("US")
                        .postalCode("76546")
                        .region("Oregon")
                        .regionCode("VA")
                        .build())
                    .status(AccountingOrderStatus.AUTHORIZED)
                    .totalAmount(0d)
                    .type(AccountingOrderType.SALES)
                    .updatedAt(OffsetDateTime.parse("2022-02-15T22:20:28.864Z"))
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

Updates the AssessmentOrder identified by `id`. Provide the unified AssessmentOrder fields to change in the request body.

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
                    .connectionId("")
                    .workspaceId("<id>")
                    .createdAt(OffsetDateTime.parse("2021-09-18T10:33:57.803Z"))
                    .id("3924cfa3-a745-4384-8ed0-ab95ec9a2caf")
                    .metadata(List.of())
                    .parameters(List.of())
                    .profileAddresses(List.of())
                    .profileDateOfBirth("1989-07-22T16:18:37.650Z")
                    .profileEmails(List.of(
                        "jordan.braun@icloud.com"))
                    .profileFirstName("Jordan")
                    .profileGender(ProfileGender.NON_BINARY)
                    .profileLastName("Braun")
                    .profileName("Jordan Braun")
                    .profileResumeUrl("https://astonishing-bug.com/")
                    .profileSocialMediaUrls(List.of())
                    .profileTelephones(List.of(
                        "322.658.2806 x3159"))
                    .reference("calcar")
                    .responseAttributes(List.of())
                    .responseDetails(List.of())
                    .responseDownloadUrls(List.of())
                    .responseMaxScore(84d)
                    .responseScore(82d)
                    .responseStatus(ResponseStatus.REJECTED)
                    .responseUrl("https://nervous-daughter.info/")
                    .status(AssessmentOrderStatus.REJECTED)
                    .targetUrl("https://idolized-suv.info")
                    .updatedAt(OffsetDateTime.parse("2023-02-04T16:55:37.913Z"))
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

## updatePrintingOrder

Updates the PrintingOrder identified by `id`. Provide the unified PrintingOrder fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePrintingOrder" method="put" path="/printing/{connection_id}/order/{id}" example="printing_order" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePrintingOrderRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePrintingOrderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePrintingOrderRequest req = UpdatePrintingOrderRequest.builder()
                .printingOrder(PrintingOrder.builder()
                    .createdAt(OffsetDateTime.parse("2022-03-14T11:16:15.147Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .id("26effdf1-6b9f-4fb4-95a6-79f958598334")
                    .lineitems(List.of(
                        PrintingLineitem.builder()
                            .files(List.of(
                                PrintingLineitemFile.builder()
                                    .placement("default")
                                    .url("https://picsum.photos/seed/y54e6o9hYi/191/3357")
                                    .build()))
                            .id("1")
                            .name("Bespoke Marble Chair")
                            .quantity(2d)
                            .retailPriceAmount(54.89)
                            .sku("IBDIE3XR")
                            .unitPriceAmount(26.37)
                            .build(),
                        PrintingLineitem.builder()
                            .files(List.of(
                                PrintingLineitemFile.builder()
                                    .placement("default")
                                    .url("https://picsum.photos/seed/T7S5xf/3521/1221")
                                    .build()))
                            .id("2")
                            .name("Electronic Cotton Hat")
                            .quantity(1d)
                            .retailPriceAmount(23.94)
                            .unitPriceAmount(10.04)
                            .build()))
                    .metadata(List.of())
                    .shipments(List.of())
                    .shippingAddress(PropertyPrintingOrderShippingAddress.builder()
                        .address1("651 Main Street")
                        .city("Euclid")
                        .country("United States")
                        .countryCode("US")
                        .email("gary_leffler28@gmail.com")
                        .name("Angelita Denesik")
                        .postalCode("80301")
                        .region("Colorado")
                        .regionCode("AR")
                        .telephone("808-831-6489 x62979")
                        .build())
                    .shippingAmount(4.69)
                    .shippingMethod("STANDARD")
                    .status(PrintingOrderStatus.OTHER)
                    .subtotalAmount(62.78)
                    .taxAmount(5.02)
                    .totalAmount(72.49)
                    .updatedAt(OffsetDateTime.parse("2025-01-23T15:59:59.226Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePrintingOrderResponse res = sdk.order().updatePrintingOrder()
                .request(req)
                .call();

        if (res.printingOrder().isPresent()) {
            System.out.println(res.printingOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdatePrintingOrderRequest](../../models/operations/UpdatePrintingOrderRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdatePrintingOrderResponse](../../models/operations/UpdatePrintingOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |