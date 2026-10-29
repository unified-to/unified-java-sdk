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

Creates a CalendarLink. Provide the unified CalendarLink fields in the request body; they are mapped to the provider's API. Returns the created CalendarLink.

### Example Usage

<!-- UsageSnippet language="java" operationID="createCalendarLink" method="post" path="/calendar/{connection_id}/link" example="calendar_link" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
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
                    .id("5966ac7b-a9c6-4db4-a7d4-c2448b16b6d8")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Sopor sopor ancilla animus anser dignissimos vito confero utilis.")
                    .priceAmount(44d)
                    .priceCurrency("USD")
                    .updatedAt("2024-03-17T16:59:20.605Z")
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

Creates a PaymentLink. Provide the unified PaymentLink fields in the request body; they are mapped to the provider's API. Returns the created PaymentLink.

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
                    .amount(17001.68)
                    .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                    .currency("CAD")
                    .description("Savor the tender essence in our Ball, designed for dim culinary adventures")
                    .id("8f671b3d-ad8d-4f4f-b826-591d5c4b5354")
                    .isActive(true)
                    .isChargeableNow(true)
                    .lineitems(List.of(
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .id("c482a991-ff88-4bc8-9156-ccee1c3ae542")
                            .itemDescription("Discover the worst new Computer with an exciting mix of Steel ingredients")
                            .itemName("Soft Marble Cheese")
                            .taxAmount(0d)
                            .totalAmount(9342d)
                            .unitAmount(519d)
                            .unitQuantity(18d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .discountAmount(424.32)
                            .id("d7526a34-71d0-4824-9a14-ebec7b1e0191")
                            .itemDescription("Innovative Shoes featuring utilized technology and Cotton construction")
                            .itemName("Sleek Aluminum Shoes")
                            .notes("Cervus decretum viridis doloremque.")
                            .taxAmount(0d)
                            .totalAmount(6647.68)
                            .unitAmount(884d)
                            .unitQuantity(8d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .id("9a74537e-24e1-4cfe-9fbb-8be3058c0780")
                            .itemDescription("Featuring Osmium-enhanced technology, our Soap offers unparalleled major performance")
                            .itemName("Elegant Concrete Gloves")
                            .notes("Desipio usque vacuus currus cetera testimonium.")
                            .taxAmount(0d)
                            .totalAmount(1012d)
                            .unitAmount(506d)
                            .unitQuantity(2d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build()))
                    .metadata(List.of())
                    .successUrl("https://tinted-jet.info")
                    .updatedAt(OffsetDateTime.parse("2024-04-15T08:15:20.864Z"))
                    .url("https://pay.example.com/8f671b3d-ad8d-4f4f-b826-591d5c4b5354")
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

Retrieves a single CalendarLink by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Retrieves a single PaymentLink by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

Returns a list of CalendarLinks. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Returns a list of PaymentLinks. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

Updates the CalendarLink identified by `id`. Provide the unified CalendarLink fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarLink" method="patch" path="/calendar/{connection_id}/link/{id}" example="calendar_link" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
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
                    .id("c52d115b-5690-4193-9175-d679aa00c6e0")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Sopor sopor ancilla animus anser dignissimos vito confero utilis.")
                    .priceAmount(44d)
                    .priceCurrency("USD")
                    .updatedAt("2024-03-17T16:59:20.607Z")
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

Updates the PaymentLink identified by `id`. Provide the unified PaymentLink fields to change in the request body.

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
                    .amount(17001.68)
                    .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                    .currency("CAD")
                    .description("Savor the tender essence in our Ball, designed for dim culinary adventures")
                    .id("adac8cbf-8d9e-4f68-b91b-c775e7573530")
                    .isActive(true)
                    .isChargeableNow(true)
                    .lineitems(List.of(
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .id("7d02ca3f-4cb5-4a26-b33f-e237610da582")
                            .itemDescription("Discover the worst new Computer with an exciting mix of Steel ingredients")
                            .itemName("Soft Marble Cheese")
                            .taxAmount(0d)
                            .totalAmount(9342d)
                            .unitAmount(519d)
                            .unitQuantity(18d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .discountAmount(424.32)
                            .id("c574a87e-ce9c-4462-8a2c-6e6fae9912b4")
                            .itemDescription("Innovative Shoes featuring utilized technology and Cotton construction")
                            .itemName("Sleek Aluminum Shoes")
                            .notes("Cervus decretum viridis doloremque.")
                            .taxAmount(0d)
                            .totalAmount(6647.68)
                            .unitAmount(884d)
                            .unitQuantity(8d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .id("7f495c8d-f2d3-483e-b8bf-5bf0796d5313")
                            .itemDescription("Featuring Osmium-enhanced technology, our Soap offers unparalleled major performance")
                            .itemName("Elegant Concrete Gloves")
                            .notes("Desipio usque vacuus currus cetera testimonium.")
                            .taxAmount(0d)
                            .totalAmount(1012d)
                            .unitAmount(506d)
                            .unitQuantity(2d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build()))
                    .metadata(List.of())
                    .successUrl("https://tinted-jet.info")
                    .updatedAt(OffsetDateTime.parse("2024-04-15T08:15:20.869Z"))
                    .url("https://pay.example.com/adac8cbf-8d9e-4f68-b91b-c775e7573530")
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

Deletes the CalendarLink identified by `id`.

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

Deletes the PaymentLink identified by `id`.

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

Updates the CalendarLink identified by `id`. Provide the unified CalendarLink fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCalendarLink" method="put" path="/calendar/{connection_id}/link/{id}" example="calendar_link" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
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
                    .id("c52d115b-5690-4193-9175-d679aa00c6e0")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Sopor sopor ancilla animus anser dignissimos vito confero utilis.")
                    .priceAmount(44d)
                    .priceCurrency("USD")
                    .updatedAt("2024-03-17T16:59:20.607Z")
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

Updates the PaymentLink identified by `id`. Provide the unified PaymentLink fields to change in the request body.

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
                    .amount(17001.68)
                    .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                    .currency("CAD")
                    .description("Savor the tender essence in our Ball, designed for dim culinary adventures")
                    .id("adac8cbf-8d9e-4f68-b91b-c775e7573530")
                    .isActive(true)
                    .isChargeableNow(true)
                    .lineitems(List.of(
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .id("7d02ca3f-4cb5-4a26-b33f-e237610da582")
                            .itemDescription("Discover the worst new Computer with an exciting mix of Steel ingredients")
                            .itemName("Soft Marble Cheese")
                            .taxAmount(0d)
                            .totalAmount(9342d)
                            .unitAmount(519d)
                            .unitQuantity(18d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .discountAmount(424.32)
                            .id("c574a87e-ce9c-4462-8a2c-6e6fae9912b4")
                            .itemDescription("Innovative Shoes featuring utilized technology and Cotton construction")
                            .itemName("Sleek Aluminum Shoes")
                            .notes("Cervus decretum viridis doloremque.")
                            .taxAmount(0d)
                            .totalAmount(6647.68)
                            .unitAmount(884d)
                            .unitQuantity(8d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .id("7f495c8d-f2d3-483e-b8bf-5bf0796d5313")
                            .itemDescription("Featuring Osmium-enhanced technology, our Soap offers unparalleled major performance")
                            .itemName("Elegant Concrete Gloves")
                            .notes("Desipio usque vacuus currus cetera testimonium.")
                            .taxAmount(0d)
                            .totalAmount(1012d)
                            .unitAmount(506d)
                            .unitQuantity(2d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build()))
                    .metadata(List.of())
                    .successUrl("https://tinted-jet.info")
                    .updatedAt(OffsetDateTime.parse("2024-04-15T08:15:20.869Z"))
                    .url("https://pay.example.com/adac8cbf-8d9e-4f68-b91b-c775e7573530")
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