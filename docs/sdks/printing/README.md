# Printing

## Overview

### Available Operations

* [createPrintingFile](#createprintingfile) - Create a file
* [createPrintingOrder](#createprintingorder) - Create an order
* [createPrintingQuote](#createprintingquote) - Create a quote
* [getPrintingFile](#getprintingfile) - Retrieve a file
* [getPrintingOrder](#getprintingorder) - Retrieve an order
* [getPrintingProduct](#getprintingproduct) - Retrieve a product
* [getPrintingTemplate](#getprintingtemplate) - Retrieve a template
* [listPrintingFiles](#listprintingfiles) - List all files
* [listPrintingOrders](#listprintingorders) - List all orders
* [listPrintingProducts](#listprintingproducts) - List all products
* [listPrintingTemplates](#listprintingtemplates) - List all templates
* [patchPrintingOrder](#patchprintingorder) - Update an order
* [removePrintingOrder](#removeprintingorder) - Remove an order
* [updatePrintingOrder](#updateprintingorder) - Update an order

## createPrintingFile

Creates a PrintingFile. Provide the unified PrintingFile fields in the request body; they are mapped to the provider's API. Returns the created PrintingFile.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPrintingFile" method="post" path="/printing/{connection_id}/file" example="printing_file" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePrintingFileRequest;
import to.unified.unified_java_sdk.models.operations.CreatePrintingFileResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePrintingFileRequest req = CreatePrintingFileRequest.builder()
                .printingFile(PrintingFile.builder()
                    .createdAt(OffsetDateTime.parse("2020-10-22T04:25:39.825Z"))
                    .dpi(300d)
                    .height(5400d)
                    .id("eb474cea-2538-4912-939d-be744537e9b1")
                    .metadata(List.of())
                    .mimeType("image/jpeg")
                    .name("blond-ecliptic.jpg")
                    .previewUrl("https://picsum.photos/seed/aATvhmNA/400/400")
                    .size(1956654d)
                    .status(PrintingFileStatus.READY)
                    .updatedAt(OffsetDateTime.parse("2020-10-22T04:25:39.825Z"))
                    .url("https://picsum.photos/seed/XBj97B/2783/172")
                    .width(4500d)
                    .build())
                .connectionId("<id>")
                .build();

        CreatePrintingFileResponse res = sdk.printing().createPrintingFile()
                .request(req)
                .call();

        if (res.printingFile().isPresent()) {
            System.out.println(res.printingFile().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreatePrintingFileRequest](../../models/operations/CreatePrintingFileRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreatePrintingFileResponse](../../models/operations/CreatePrintingFileResponse.md)**

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
                    .id("237132fa-7b97-4c13-a37b-6b4a470489b9")
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
                    .updatedAt(OffsetDateTime.parse("2025-01-23T00:25:00.455Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreatePrintingOrderResponse res = sdk.printing().createPrintingOrder()
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

## createPrintingQuote

Creates a PrintingQuote. Provide the unified PrintingQuote fields in the request body; they are mapped to the provider's API. Returns the created PrintingQuote.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPrintingQuote" method="post" path="/printing/{connection_id}/quote" example="printing_quote" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePrintingQuoteRequest;
import to.unified.unified_java_sdk.models.operations.CreatePrintingQuoteResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePrintingQuoteRequest req = CreatePrintingQuoteRequest.builder()
                .printingQuote(PrintingQuote.builder()
                    .createdAt(OffsetDateTime.parse("2019-01-02T03:42:06.944Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .id("3cb5cad5-b6bc-4fbd-9e30-851d688cd9d8")
                    .lineitems(List.of(
                        PrintingLineitem.builder()
                            .files(List.of(
                                PrintingLineitemFile.builder()
                                    .placement("default")
                                    .url("https://picsum.photos/seed/0Y5Bjnoiwx/3057/3113")
                                    .build()))
                            .id("1")
                            .name("Practical Wooden Salad")
                            .quantity(2d)
                            .retailPriceAmount(50.83)
                            .unitPriceAmount(21.72)
                            .build(),
                        PrintingLineitem.builder()
                            .files(List.of(
                                PrintingLineitemFile.builder()
                                    .placement("default")
                                    .url("https://picsum.photos/seed/rcPUF/2295/1801")
                                    .build()))
                            .id("2")
                            .name("Handmade Gold Car")
                            .quantity(4d)
                            .retailPriceAmount(35.47)
                            .sku("I79GIBCK")
                            .unitPriceAmount(17.64)
                            .build()))
                    .metadata(List.of())
                    .shippingAddress(PropertyPrintingQuoteShippingAddress.builder()
                        .address1("4290 Garden Street")
                        .address2("Suite 874")
                        .city("Cartwrightshire")
                        .companyName("Kris and Sons")
                        .country("United States")
                        .countryCode("US")
                        .email("jada73@hotmail.com")
                        .name("Heaven Crist")
                        .postalCode("92871")
                        .region("North Carolina")
                        .regionCode("KY")
                        .telephone("653.412.8900 x9387")
                        .build())
                    .shippingAmount(4.69)
                    .shippingMethod("STANDARD")
                    .shippingOptions(List.of(
                        PrintingShippingoption.builder()
                            .amount(4.69)
                            .code("STANDARD")
                            .currency("USD")
                            .maxDeliveryDays(5d)
                            .minDeliveryDays(3d)
                            .name("Flat Rate (3-5 business days after fulfillment)")
                            .build(),
                        PrintingShippingoption.builder()
                            .amount(12.99)
                            .code("EXPRESS")
                            .currency("USD")
                            .maxDeliveryDays(3d)
                            .minDeliveryDays(1d)
                            .name("Express (1-3 business days after fulfillment)")
                            .build()))
                    .subtotalAmount(114d)
                    .taxAmount(9.12)
                    .totalAmount(127.81)
                    .updatedAt(OffsetDateTime.parse("2019-01-02T03:42:06.944Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreatePrintingQuoteResponse res = sdk.printing().createPrintingQuote()
                .request(req)
                .call();

        if (res.printingQuote().isPresent()) {
            System.out.println(res.printingQuote().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreatePrintingQuoteRequest](../../models/operations/CreatePrintingQuoteRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreatePrintingQuoteResponse](../../models/operations/CreatePrintingQuoteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPrintingFile

Retrieves a single PrintingFile by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPrintingFile" method="get" path="/printing/{connection_id}/file/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPrintingFileRequest;
import to.unified.unified_java_sdk.models.operations.GetPrintingFileResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPrintingFileRequest req = GetPrintingFileRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPrintingFileResponse res = sdk.printing().getPrintingFile()
                .request(req)
                .call();

        if (res.printingFile().isPresent()) {
            System.out.println(res.printingFile().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetPrintingFileRequest](../../models/operations/GetPrintingFileRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetPrintingFileResponse](../../models/operations/GetPrintingFileResponse.md)**

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

        GetPrintingOrderResponse res = sdk.printing().getPrintingOrder()
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

## getPrintingProduct

Retrieves a single PrintingProduct by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPrintingProduct" method="get" path="/printing/{connection_id}/product/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPrintingProductRequest;
import to.unified.unified_java_sdk.models.operations.GetPrintingProductResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPrintingProductRequest req = GetPrintingProductRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPrintingProductResponse res = sdk.printing().getPrintingProduct()
                .request(req)
                .call();

        if (res.printingProduct().isPresent()) {
            System.out.println(res.printingProduct().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetPrintingProductRequest](../../models/operations/GetPrintingProductRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetPrintingProductResponse](../../models/operations/GetPrintingProductResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPrintingTemplate

Retrieves a single PrintingTemplate by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPrintingTemplate" method="get" path="/printing/{connection_id}/template/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPrintingTemplateRequest;
import to.unified.unified_java_sdk.models.operations.GetPrintingTemplateResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPrintingTemplateRequest req = GetPrintingTemplateRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPrintingTemplateResponse res = sdk.printing().getPrintingTemplate()
                .request(req)
                .call();

        if (res.printingTemplate().isPresent()) {
            System.out.println(res.printingTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetPrintingTemplateRequest](../../models/operations/GetPrintingTemplateRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetPrintingTemplateResponse](../../models/operations/GetPrintingTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPrintingFiles

Returns a list of PrintingFiles. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPrintingFiles" method="get" path="/printing/{connection_id}/file" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPrintingFilesRequest;
import to.unified.unified_java_sdk.models.operations.ListPrintingFilesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPrintingFilesRequest req = ListPrintingFilesRequest.builder()
                .connectionId("<id>")
                .build();

        ListPrintingFilesResponse res = sdk.printing().listPrintingFiles()
                .request(req)
                .call();

        if (res.printingFiles().isPresent()) {
            System.out.println(res.printingFiles().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListPrintingFilesRequest](../../models/operations/ListPrintingFilesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListPrintingFilesResponse](../../models/operations/ListPrintingFilesResponse.md)**

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

        ListPrintingOrdersResponse res = sdk.printing().listPrintingOrders()
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

## listPrintingProducts

Returns a list of PrintingProducts. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPrintingProducts" method="get" path="/printing/{connection_id}/product" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPrintingProductsRequest;
import to.unified.unified_java_sdk.models.operations.ListPrintingProductsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPrintingProductsRequest req = ListPrintingProductsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPrintingProductsResponse res = sdk.printing().listPrintingProducts()
                .request(req)
                .call();

        if (res.printingProducts().isPresent()) {
            System.out.println(res.printingProducts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListPrintingProductsRequest](../../models/operations/ListPrintingProductsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListPrintingProductsResponse](../../models/operations/ListPrintingProductsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPrintingTemplates

Returns a list of PrintingTemplates. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPrintingTemplates" method="get" path="/printing/{connection_id}/template" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPrintingTemplatesRequest;
import to.unified.unified_java_sdk.models.operations.ListPrintingTemplatesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPrintingTemplatesRequest req = ListPrintingTemplatesRequest.builder()
                .connectionId("<id>")
                .build();

        ListPrintingTemplatesResponse res = sdk.printing().listPrintingTemplates()
                .request(req)
                .call();

        if (res.printingTemplates().isPresent()) {
            System.out.println(res.printingTemplates().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListPrintingTemplatesRequest](../../models/operations/ListPrintingTemplatesRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListPrintingTemplatesResponse](../../models/operations/ListPrintingTemplatesResponse.md)**

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
                    .id("f21117c8-409c-4eb1-acd0-f555c27faee7")
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
                    .updatedAt(OffsetDateTime.parse("2025-01-23T00:25:00.475Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPrintingOrderResponse res = sdk.printing().patchPrintingOrder()
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

        RemovePrintingOrderResponse res = sdk.printing().removePrintingOrder()
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
                    .id("f21117c8-409c-4eb1-acd0-f555c27faee7")
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
                    .updatedAt(OffsetDateTime.parse("2025-01-23T00:25:00.475Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePrintingOrderResponse res = sdk.printing().updatePrintingOrder()
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