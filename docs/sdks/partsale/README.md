# Partsale

## Overview

### Available Operations

* [createDmsPartsale](#createdmspartsale) - Create a partsale
* [getDmsPartsale](#getdmspartsale) - Retrieve a partsale
* [listDmsPartsales](#listdmspartsales) - List all partsales
* [patchDmsPartsale](#patchdmspartsale) - Update a partsale
* [updateDmsPartsale](#updatedmspartsale) - Update a partsale

## createDmsPartsale

Creates a DmsPartsale. Provide the unified DmsPartsale fields in the request body; they are mapped to the provider's API. Returns the created DmsPartsale.

### Example Usage

<!-- UsageSnippet language="java" operationID="createDmsPartsale" method="post" path="/dms/{connection_id}/partsale" example="dms_partsale" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDmsPartsaleRequest;
import to.unified.unified_java_sdk.models.operations.CreateDmsPartsaleResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDmsPartsaleRequest req = CreateDmsPartsaleRequest.builder()
                .dmsPartsale(DmsPartsale.builder()
                    .costAmount(0d)
                    .createdAt(OffsetDateTime.parse("2023-05-22T03:39:30.335Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .freightAmount(0d)
                    .id("834b62b6-5736-47a2-836f-7da1eb8a1d63")
                    .lines(List.of(
                        DmsPartline.builder()
                            .id("c5820579-bc3b-4c71-8f7a-774de46ee7d2")
                            .payType(DmsPartlinePayType.CUSTOMER)
                            .quantity(5d)
                            .quantityOrdered(5d)
                            .totalAmount(491.45)
                            .unitPriceAmount(98.29)
                            .build(),
                        DmsPartline.builder()
                            .id("05239adc-66e9-493d-b9ae-58b432492e41")
                            .payType(DmsPartlinePayType.CUSTOMER)
                            .quantity(2d)
                            .quantityOrdered(2d)
                            .totalAmount(240.9)
                            .unitPriceAmount(120.45)
                            .build(),
                        DmsPartline.builder()
                            .id("ad6e4077-e25b-477a-8a0c-b7be3c6f6c3c")
                            .payType(DmsPartlinePayType.CUSTOMER)
                            .quantity(3d)
                            .quantityOrdered(3d)
                            .totalAmount(249.54)
                            .unitPriceAmount(83.18)
                            .build()))
                    .metadata(List.of())
                    .number("P292867")
                    .payType(DmsPartsalePayType.CUSTOMER)
                    .status(DmsPartsaleStatus.VOIDED)
                    .subtotalAmount(981.89)
                    .taxAmount(68.73)
                    .totalAmount(1050.62)
                    .type(DmsPartsaleType.SALE)
                    .updatedAt(OffsetDateTime.parse("2026-04-18T13:18:43.891Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateDmsPartsaleResponse res = sdk.partsale().createDmsPartsale()
                .request(req)
                .call();

        if (res.dmsPartsale().isPresent()) {
            System.out.println(res.dmsPartsale().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateDmsPartsaleRequest](../../models/operations/CreateDmsPartsaleRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateDmsPartsaleResponse](../../models/operations/CreateDmsPartsaleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDmsPartsale

Retrieves a single DmsPartsale by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getDmsPartsale" method="get" path="/dms/{connection_id}/partsale/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetDmsPartsaleRequest;
import to.unified.unified_java_sdk.models.operations.GetDmsPartsaleResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetDmsPartsaleRequest req = GetDmsPartsaleRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetDmsPartsaleResponse res = sdk.partsale().getDmsPartsale()
                .request(req)
                .call();

        if (res.dmsPartsale().isPresent()) {
            System.out.println(res.dmsPartsale().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetDmsPartsaleRequest](../../models/operations/GetDmsPartsaleRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetDmsPartsaleResponse](../../models/operations/GetDmsPartsaleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listDmsPartsales

Returns a list of DmsPartsales. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listDmsPartsales" method="get" path="/dms/{connection_id}/partsale" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListDmsPartsalesRequest;
import to.unified.unified_java_sdk.models.operations.ListDmsPartsalesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListDmsPartsalesRequest req = ListDmsPartsalesRequest.builder()
                .connectionId("<id>")
                .build();

        ListDmsPartsalesResponse res = sdk.partsale().listDmsPartsales()
                .request(req)
                .call();

        if (res.dmsPartsales().isPresent()) {
            System.out.println(res.dmsPartsales().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListDmsPartsalesRequest](../../models/operations/ListDmsPartsalesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListDmsPartsalesResponse](../../models/operations/ListDmsPartsalesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchDmsPartsale

Updates the DmsPartsale identified by `id`. Provide the unified DmsPartsale fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchDmsPartsale" method="patch" path="/dms/{connection_id}/partsale/{id}" example="dms_partsale" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchDmsPartsaleRequest;
import to.unified.unified_java_sdk.models.operations.PatchDmsPartsaleResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchDmsPartsaleRequest req = PatchDmsPartsaleRequest.builder()
                .dmsPartsale(DmsPartsale.builder()
                    .costAmount(0d)
                    .createdAt(OffsetDateTime.parse("2023-05-22T03:39:30.335Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .freightAmount(0d)
                    .id("73461ce7-3e75-4a6c-b8a9-ca20a45e2f8f")
                    .lines(List.of(
                        DmsPartline.builder()
                            .id("64206528-da75-40d9-b936-5acc30f317b0")
                            .payType(DmsPartlinePayType.CUSTOMER)
                            .quantity(5d)
                            .quantityOrdered(5d)
                            .totalAmount(491.45)
                            .unitPriceAmount(98.29)
                            .build(),
                        DmsPartline.builder()
                            .id("2128fe82-f689-4acf-a553-23b2ff8b4bf3")
                            .payType(DmsPartlinePayType.CUSTOMER)
                            .quantity(2d)
                            .quantityOrdered(2d)
                            .totalAmount(240.9)
                            .unitPriceAmount(120.45)
                            .build(),
                        DmsPartline.builder()
                            .id("42a50637-ffaa-44f5-973e-4066f6505ff7")
                            .payType(DmsPartlinePayType.CUSTOMER)
                            .quantity(3d)
                            .quantityOrdered(3d)
                            .totalAmount(249.54)
                            .unitPriceAmount(83.18)
                            .build()))
                    .metadata(List.of())
                    .number("P292867")
                    .payType(DmsPartsalePayType.CUSTOMER)
                    .status(DmsPartsaleStatus.VOIDED)
                    .subtotalAmount(981.89)
                    .taxAmount(68.73)
                    .totalAmount(1050.62)
                    .type(DmsPartsaleType.SALE)
                    .updatedAt(OffsetDateTime.parse("2026-04-18T13:18:43.913Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDmsPartsaleResponse res = sdk.partsale().patchDmsPartsale()
                .request(req)
                .call();

        if (res.dmsPartsale().isPresent()) {
            System.out.println(res.dmsPartsale().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchDmsPartsaleRequest](../../models/operations/PatchDmsPartsaleRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchDmsPartsaleResponse](../../models/operations/PatchDmsPartsaleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateDmsPartsale

Updates the DmsPartsale identified by `id`. Provide the unified DmsPartsale fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateDmsPartsale" method="put" path="/dms/{connection_id}/partsale/{id}" example="dms_partsale" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateDmsPartsaleRequest;
import to.unified.unified_java_sdk.models.operations.UpdateDmsPartsaleResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateDmsPartsaleRequest req = UpdateDmsPartsaleRequest.builder()
                .dmsPartsale(DmsPartsale.builder()
                    .costAmount(0d)
                    .createdAt(OffsetDateTime.parse("2023-05-22T03:39:30.335Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .freightAmount(0d)
                    .id("73461ce7-3e75-4a6c-b8a9-ca20a45e2f8f")
                    .lines(List.of(
                        DmsPartline.builder()
                            .id("64206528-da75-40d9-b936-5acc30f317b0")
                            .payType(DmsPartlinePayType.CUSTOMER)
                            .quantity(5d)
                            .quantityOrdered(5d)
                            .totalAmount(491.45)
                            .unitPriceAmount(98.29)
                            .build(),
                        DmsPartline.builder()
                            .id("2128fe82-f689-4acf-a553-23b2ff8b4bf3")
                            .payType(DmsPartlinePayType.CUSTOMER)
                            .quantity(2d)
                            .quantityOrdered(2d)
                            .totalAmount(240.9)
                            .unitPriceAmount(120.45)
                            .build(),
                        DmsPartline.builder()
                            .id("42a50637-ffaa-44f5-973e-4066f6505ff7")
                            .payType(DmsPartlinePayType.CUSTOMER)
                            .quantity(3d)
                            .quantityOrdered(3d)
                            .totalAmount(249.54)
                            .unitPriceAmount(83.18)
                            .build()))
                    .metadata(List.of())
                    .number("P292867")
                    .payType(DmsPartsalePayType.CUSTOMER)
                    .status(DmsPartsaleStatus.VOIDED)
                    .subtotalAmount(981.89)
                    .taxAmount(68.73)
                    .totalAmount(1050.62)
                    .type(DmsPartsaleType.SALE)
                    .updatedAt(OffsetDateTime.parse("2026-04-18T13:18:43.913Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDmsPartsaleResponse res = sdk.partsale().updateDmsPartsale()
                .request(req)
                .call();

        if (res.dmsPartsale().isPresent()) {
            System.out.println(res.dmsPartsale().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateDmsPartsaleRequest](../../models/operations/UpdateDmsPartsaleRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateDmsPartsaleResponse](../../models/operations/UpdateDmsPartsaleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |