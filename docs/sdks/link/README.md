# Link

## Overview

### Available Operations

* [createCalendarLink](#createcalendarlink) - Create a link
* [createPaymentLink](#createpaymentlink) - Create a link
* [getCalendarLink](#getcalendarlink) - Retrieve a link
* [getPaymentLink](#getpaymentlink) - Retrieve a link
* [listCalendarLinks](#listcalendarlinks) - List all links
* [listPaymentLinks](#listpaymentlinks) - List all links
* [patchCalendarLink](#patchcalendarlink) - Update a link
* [patchPaymentLink](#patchpaymentlink) - Update a link
* [removeCalendarLink](#removecalendarlink) - Remove a link
* [removePaymentLink](#removepaymentlink) - Remove a link
* [updateCalendarLink](#updatecalendarlink) - Update a link
* [updatePaymentLink](#updatepaymentlink) - Update a link

## createCalendarLink

Create a link

### Example Usage

<!-- UsageSnippet language="java" operationID="createCalendarLink" method="post" path="/calendar/{connection_id}/link" example="calendar_link" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCalendarLinkRequest;
import to.unified.unified_java_sdk.models.operations.CreateCalendarLinkResponse;
import to.unified.unified_java_sdk.models.shared.CalendarLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCalendarLinkRequest req = CreateCalendarLinkRequest.builder()
                .calendarLink(CalendarLink.builder()
                    .url("https://annual-apricot.info/")
                    .createdAt("2023-03-07T13:34:11.959Z")
                    .description("Vitium clibanus laboriosam uxor denuncio.")
                    .duration(74d)
                    .id("822fdb46-ba27-4c7f-9edc-562ce52011a4")
                    .isActive(true)
                    .name("Sopor sopor ancilla animus anser dignissimos vito confero utilis.")
                    .priceAmount(44d)
                    .priceCurrency("USD")
                    .updatedAt("2024-03-14T23:01:44.061Z")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCalendarLinkResponse res = sdk.link().createCalendarLink()
                .request(req)
                .call();

        if (res.calendarLink().isPresent()) {
            System.out.println(res.calendarLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateCalendarLinkRequest](../../models/operations/CreateCalendarLinkRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateCalendarLinkResponse](../../models/operations/CreateCalendarLinkResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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
                    .id("75d8bcc7-71cb-47ff-80f5-56954c7ddd6d")
                    .isActive(true)
                    .isChargeableNow(false)
                    .lineitems(List.of(
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-08-21T00:45:53.202Z"))
                            .id("5cf6d639-2c82-4e53-971b-613776e8c5c4")
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
                            .id("44a342ed-aaa6-495f-a702-ec2509cbc2d7")
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
                            .id("5725c0ea-d6e7-4487-8958-12dc3f50d872")
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
                            .id("82ca6f3c-23df-4913-aa67-7fc3b074b2de")
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
                            .id("0fe163be-3196-48b2-9006-a423333d92cc")
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
                    .updatedAt(OffsetDateTime.parse("2026-01-03T11:44:47.844Z"))
                    .url("https://forceful-laughter.biz/")
                    .build())
                .connectionId("<id>")
                .build();

        CreatePaymentLinkResponse res = sdk.link().createPaymentLink()
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

## getCalendarLink

Retrieve a link

### Example Usage

<!-- UsageSnippet language="java" operationID="getCalendarLink" method="get" path="/calendar/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCalendarLinkRequest;
import to.unified.unified_java_sdk.models.operations.GetCalendarLinkResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCalendarLinkRequest req = GetCalendarLinkRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCalendarLinkResponse res = sdk.link().getCalendarLink()
                .request(req)
                .call();

        if (res.calendarLink().isPresent()) {
            System.out.println(res.calendarLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetCalendarLinkRequest](../../models/operations/GetCalendarLinkRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetCalendarLinkResponse](../../models/operations/GetCalendarLinkResponse.md)**

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

        GetPaymentLinkResponse res = sdk.link().getPaymentLink()
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

## listCalendarLinks

List all links

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarLinks" method="get" path="/calendar/{connection_id}/link" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarLinksRequest;
import to.unified.unified_java_sdk.models.operations.ListCalendarLinksResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarLinksRequest req = ListCalendarLinksRequest.builder()
                .connectionId("<id>")
                .build();

        ListCalendarLinksResponse res = sdk.link().listCalendarLinks()
                .request(req)
                .call();

        if (res.calendarLinks().isPresent()) {
            System.out.println(res.calendarLinks().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListCalendarLinksRequest](../../models/operations/ListCalendarLinksRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListCalendarLinksResponse](../../models/operations/ListCalendarLinksResponse.md)**

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

        ListPaymentLinksResponse res = sdk.link().listPaymentLinks()
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

## patchCalendarLink

Update a link

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarLink" method="patch" path="/calendar/{connection_id}/link/{id}" example="calendar_link" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCalendarLinkRequest;
import to.unified.unified_java_sdk.models.operations.PatchCalendarLinkResponse;
import to.unified.unified_java_sdk.models.shared.CalendarLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCalendarLinkRequest req = PatchCalendarLinkRequest.builder()
                .calendarLink(CalendarLink.builder()
                    .url("https://annual-apricot.info/")
                    .createdAt("2023-03-07T13:34:11.959Z")
                    .description("Vitium clibanus laboriosam uxor denuncio.")
                    .duration(74d)
                    .id("08af92e4-bf8b-49b7-8221-7bd3e954f5f8")
                    .isActive(true)
                    .name("Sopor sopor ancilla animus anser dignissimos vito confero utilis.")
                    .priceAmount(44d)
                    .priceCurrency("USD")
                    .updatedAt("2024-03-14T23:01:44.063Z")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCalendarLinkResponse res = sdk.link().patchCalendarLink()
                .request(req)
                .call();

        if (res.calendarLink().isPresent()) {
            System.out.println(res.calendarLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchCalendarLinkRequest](../../models/operations/PatchCalendarLinkRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchCalendarLinkResponse](../../models/operations/PatchCalendarLinkResponse.md)**

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
                    .id("c0bbd703-6103-4589-8dc0-702d4e7b262b")
                    .isActive(true)
                    .isChargeableNow(false)
                    .lineitems(List.of(
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-08-21T00:45:53.202Z"))
                            .id("988341dd-2b4e-4c9f-b6c8-b4e7ad6ea741")
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
                            .id("d53d3fda-687e-4c10-b4dc-c85d9c9ec9af")
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
                            .id("3c932cfa-27b3-4bd3-863e-1c6688f78ebe")
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
                            .id("f53f8ed4-5ec6-4b56-879b-0989da3748da")
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
                            .id("b9661366-cf7d-421c-b479-e65f2f7d99b8")
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
                    .updatedAt(OffsetDateTime.parse("2026-01-03T11:44:47.853Z"))
                    .url("https://forceful-laughter.biz/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPaymentLinkResponse res = sdk.link().patchPaymentLink()
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

## removeCalendarLink

Remove a link

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCalendarLink" method="delete" path="/calendar/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarLinkRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarLinkResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCalendarLinkRequest req = RemoveCalendarLinkRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCalendarLinkResponse res = sdk.link().removeCalendarLink()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveCalendarLinkRequest](../../models/operations/RemoveCalendarLinkRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveCalendarLinkResponse](../../models/operations/RemoveCalendarLinkResponse.md)**

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

        RemovePaymentLinkResponse res = sdk.link().removePaymentLink()
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

## updateCalendarLink

Update a link

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCalendarLink" method="put" path="/calendar/{connection_id}/link/{id}" example="calendar_link" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarLinkRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarLinkResponse;
import to.unified.unified_java_sdk.models.shared.CalendarLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCalendarLinkRequest req = UpdateCalendarLinkRequest.builder()
                .calendarLink(CalendarLink.builder()
                    .url("https://annual-apricot.info/")
                    .createdAt("2023-03-07T13:34:11.959Z")
                    .description("Vitium clibanus laboriosam uxor denuncio.")
                    .duration(74d)
                    .id("08af92e4-bf8b-49b7-8221-7bd3e954f5f8")
                    .isActive(true)
                    .name("Sopor sopor ancilla animus anser dignissimos vito confero utilis.")
                    .priceAmount(44d)
                    .priceCurrency("USD")
                    .updatedAt("2024-03-14T23:01:44.063Z")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCalendarLinkResponse res = sdk.link().updateCalendarLink()
                .request(req)
                .call();

        if (res.calendarLink().isPresent()) {
            System.out.println(res.calendarLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateCalendarLinkRequest](../../models/operations/UpdateCalendarLinkRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateCalendarLinkResponse](../../models/operations/UpdateCalendarLinkResponse.md)**

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
                    .id("c0bbd703-6103-4589-8dc0-702d4e7b262b")
                    .isActive(true)
                    .isChargeableNow(false)
                    .lineitems(List.of(
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-08-21T00:45:53.202Z"))
                            .id("988341dd-2b4e-4c9f-b6c8-b4e7ad6ea741")
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
                            .id("d53d3fda-687e-4c10-b4dc-c85d9c9ec9af")
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
                            .id("3c932cfa-27b3-4bd3-863e-1c6688f78ebe")
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
                            .id("f53f8ed4-5ec6-4b56-879b-0989da3748da")
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
                            .id("b9661366-cf7d-421c-b479-e65f2f7d99b8")
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
                    .updatedAt(OffsetDateTime.parse("2026-01-03T11:44:47.853Z"))
                    .url("https://forceful-laughter.biz/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePaymentLinkResponse res = sdk.link().updatePaymentLink()
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