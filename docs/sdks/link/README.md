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
                    .url("https://whirlwind-entry.name")
                    .createdAt("2023-03-07T13:34:11.959Z")
                    .description("Vito confero utilis.")
                    .duration(74d)
                    .id("15d1f49b-220c-426b-a814-3f07f260cf08")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Animus anser.")
                    .priceAmount(44d)
                    .priceCurrency("USD")
                    .updatedAt("2024-03-25T16:51:35.959Z")
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
                    .contactEmail("Clovis8@yahoo.com")
                    .contactName("Lilliana Dibbert")
                    .contactPhone("963-764-0961")
                    .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                    .currency("CAD")
                    .description("The Daron Sausages is the latest in a series of informal products from Dach, Beatty and Moen")
                    .id("42ac43b0-938a-4b8a-b90a-4e418969d24c")
                    .isActive(true)
                    .isChargeableNow(true)
                    .lineitems(List.of(
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .id("7f3cad3c-c335-45bc-8444-cd8511eea007")
                            .itemDescription("Introducing the Syrian Arab Republic-inspired Chips, blending neat style with local craftsmanship")
                            .itemName("Electronic Metal Tuna")
                            .taxAmount(0d)
                            .totalAmount(9342d)
                            .unitAmount(519d)
                            .unitQuantity(18d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .discountAmount(424.32)
                            .id("faa1abe7-9d40-4170-831e-057b0f89db80")
                            .itemDescription("Soft Computer designed with Bronze for junior performance")
                            .itemName("Rustic Concrete Shoes")
                            .notes("Doloremque appositus cito cursim bellicus rerum ubi voluptatibus.")
                            .taxAmount(0d)
                            .totalAmount(6647.68)
                            .unitAmount(884d)
                            .unitQuantity(8d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .id("aa9501f0-d6d0-4f0e-b38b-4c03174a8446")
                            .itemDescription("The Donnie Shirt is the latest in a series of tinted products from Nitzsche and Sons")
                            .itemName("Intelligent Marble Keyboard")
                            .notes("Damnatio aut bene.")
                            .taxAmount(0d)
                            .totalAmount(1012d)
                            .unitAmount(506d)
                            .unitQuantity(2d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build()))
                    .metadata(List.of())
                    .successUrl("https://finished-retention.com")
                    .updatedAt(OffsetDateTime.parse("2024-04-22T12:49:56.441Z"))
                    .url("https://pay.example.com/42ac43b0-938a-4b8a-b90a-4e418969d24c")
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
                    .url("https://whirlwind-entry.name")
                    .createdAt("2023-03-07T13:34:11.959Z")
                    .description("Vito confero utilis.")
                    .duration(74d)
                    .id("aa4a2940-ec55-4275-aaa8-24d2829bc58d")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Animus anser.")
                    .priceAmount(44d)
                    .priceCurrency("USD")
                    .updatedAt("2024-03-25T16:51:35.961Z")
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
                    .contactEmail("Clovis8@yahoo.com")
                    .contactName("Lilliana Dibbert")
                    .contactPhone("963-764-0961")
                    .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                    .currency("CAD")
                    .description("The Daron Sausages is the latest in a series of informal products from Dach, Beatty and Moen")
                    .id("2368494c-f7e6-4691-aa54-5622bb2f2b99")
                    .isActive(true)
                    .isChargeableNow(true)
                    .lineitems(List.of(
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .id("0a8c0046-4853-4018-a172-16a8b043c100")
                            .itemDescription("Introducing the Syrian Arab Republic-inspired Chips, blending neat style with local craftsmanship")
                            .itemName("Electronic Metal Tuna")
                            .taxAmount(0d)
                            .totalAmount(9342d)
                            .unitAmount(519d)
                            .unitQuantity(18d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .discountAmount(424.32)
                            .id("04c813f9-45bd-40e4-a90f-5c0ed8178127")
                            .itemDescription("Soft Computer designed with Bronze for junior performance")
                            .itemName("Rustic Concrete Shoes")
                            .notes("Doloremque appositus cito cursim bellicus rerum ubi voluptatibus.")
                            .taxAmount(0d)
                            .totalAmount(6647.68)
                            .unitAmount(884d)
                            .unitQuantity(8d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .id("f994dc8e-daa7-4436-8ffa-5a9b65516701")
                            .itemDescription("The Donnie Shirt is the latest in a series of tinted products from Nitzsche and Sons")
                            .itemName("Intelligent Marble Keyboard")
                            .notes("Damnatio aut bene.")
                            .taxAmount(0d)
                            .totalAmount(1012d)
                            .unitAmount(506d)
                            .unitQuantity(2d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build()))
                    .metadata(List.of())
                    .successUrl("https://finished-retention.com")
                    .updatedAt(OffsetDateTime.parse("2024-04-22T12:49:56.447Z"))
                    .url("https://pay.example.com/2368494c-f7e6-4691-aa54-5622bb2f2b99")
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
                    .url("https://whirlwind-entry.name")
                    .createdAt("2023-03-07T13:34:11.959Z")
                    .description("Vito confero utilis.")
                    .duration(74d)
                    .id("aa4a2940-ec55-4275-aaa8-24d2829bc58d")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Animus anser.")
                    .priceAmount(44d)
                    .priceCurrency("USD")
                    .updatedAt("2024-03-25T16:51:35.961Z")
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
                    .contactEmail("Clovis8@yahoo.com")
                    .contactName("Lilliana Dibbert")
                    .contactPhone("963-764-0961")
                    .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                    .currency("CAD")
                    .description("The Daron Sausages is the latest in a series of informal products from Dach, Beatty and Moen")
                    .id("2368494c-f7e6-4691-aa54-5622bb2f2b99")
                    .isActive(true)
                    .isChargeableNow(true)
                    .lineitems(List.of(
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .id("0a8c0046-4853-4018-a172-16a8b043c100")
                            .itemDescription("Introducing the Syrian Arab Republic-inspired Chips, blending neat style with local craftsmanship")
                            .itemName("Electronic Metal Tuna")
                            .taxAmount(0d)
                            .totalAmount(9342d)
                            .unitAmount(519d)
                            .unitQuantity(18d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .discountAmount(424.32)
                            .id("04c813f9-45bd-40e4-a90f-5c0ed8178127")
                            .itemDescription("Soft Computer designed with Bronze for junior performance")
                            .itemName("Rustic Concrete Shoes")
                            .notes("Doloremque appositus cito cursim bellicus rerum ubi voluptatibus.")
                            .taxAmount(0d)
                            .totalAmount(6647.68)
                            .unitAmount(884d)
                            .unitQuantity(8d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build(),
                        PaymentLineitem.builder()
                            .createdAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .id("f994dc8e-daa7-4436-8ffa-5a9b65516701")
                            .itemDescription("The Donnie Shirt is the latest in a series of tinted products from Nitzsche and Sons")
                            .itemName("Intelligent Marble Keyboard")
                            .notes("Damnatio aut bene.")
                            .taxAmount(0d)
                            .totalAmount(1012d)
                            .unitAmount(506d)
                            .unitQuantity(2d)
                            .updatedAt(OffsetDateTime.parse("2023-06-04T16:11:45.685Z"))
                            .build()))
                    .metadata(List.of())
                    .successUrl("https://finished-retention.com")
                    .updatedAt(OffsetDateTime.parse("2024-04-22T12:49:56.447Z"))
                    .url("https://pay.example.com/2368494c-f7e6-4691-aa54-5622bb2f2b99")
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