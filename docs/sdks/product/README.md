# Product

## Overview

### Available Operations

* [getPrintingProduct](#getprintingproduct) - Retrieve a product
* [listPrintingProducts](#listprintingproducts) - List all products

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

        GetPrintingProductResponse res = sdk.product().getPrintingProduct()
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

        ListPrintingProductsResponse res = sdk.product().listPrintingProducts()
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