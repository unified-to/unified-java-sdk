# Vehiclesale

## Overview

### Available Operations

* [createDmsVehiclesale](#createdmsvehiclesale) - Create a vehiclesale
* [getDmsVehiclesale](#getdmsvehiclesale) - Retrieve a vehiclesale
* [listDmsVehiclesales](#listdmsvehiclesales) - List all vehiclesales
* [patchDmsVehiclesale](#patchdmsvehiclesale) - Update a vehiclesale
* [updateDmsVehiclesale](#updatedmsvehiclesale) - Update a vehiclesale

## createDmsVehiclesale

Creates a DmsVehiclesale. Provide the unified DmsVehiclesale fields in the request body; they are mapped to the provider's API. Returns the created DmsVehiclesale.

### Example Usage

<!-- UsageSnippet language="java" operationID="createDmsVehiclesale" method="post" path="/dms/{connection_id}/vehiclesale" example="dms_vehiclesale" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDmsVehiclesaleRequest;
import to.unified.unified_java_sdk.models.operations.CreateDmsVehiclesaleResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDmsVehiclesaleRequest req = CreateDmsVehiclesaleRequest.builder()
                .dmsVehiclesale(DmsVehiclesale.builder()
                    .backGrossAmount(4565d)
                    .createdAt(OffsetDateTime.parse("2020-04-02T08:14:56.150Z"))
                    .currency("USD")
                    .downPaymentAmount(6700d)
                    .fees(List.of(
                        DmsVehiclesaleFee.builder()
                            .costAmount(0d)
                            .isCapitalized(true)
                            .name("Documentation fee")
                            .priceAmount(499d)
                            .build(),
                        DmsVehiclesaleFee.builder()
                            .isCapitalized(false)
                            .name("Title and registration")
                            .priceAmount(392d)
                            .build()))
                    .finance(PropertyDmsVehiclesaleFinance.builder()
                        .financedAmount(0d)
                        .firstPaymentAt(OffsetDateTime.parse("2022-08-16T02:31:01.486Z"))
                        .interestRate(6.68)
                        .lenderName("Mueller, Yundt and Murray Financial")
                        .paymentAmount(339d)
                        .paymentFrequency(PaymentFrequency.MONTHLY)
                        .termMonths(72d)
                        .build())
                    .financeType(FinanceType.FINANCE)
                    .id("f14f17c3-4884-4022-b880-cdd2ef902f13")
                    .metadata(List.of())
                    .number("D84591")
                    .products(List.of(
                        DmsVehiclesaleProduct.builder()
                            .contractNumber("B7JN10GVB7")
                            .costAmount(1320d)
                            .name("Tire & Wheel")
                            .priceAmount(3300d)
                            .provider("Renner and Sons")
                            .termMonths(60d)
                            .type(DmsVehiclesaleProductType.PROTECTION)
                            .build(),
                        DmsVehiclesaleProduct.builder()
                            .contractNumber("VIZU7K3VRU")
                            .costAmount(1115d)
                            .deductibleAmount(100d)
                            .name("Platinum Vehicle Service Contract")
                            .priceAmount(3700d)
                            .provider("Frami, Wisozk and Gleichner")
                            .termMonths(72d)
                            .type(DmsVehiclesaleProductType.SERVICE_CONTRACT)
                            .build()))
                    .rebateAmount(500d)
                    .soldAt(OffsetDateTime.parse("2022-08-14T11:15:27.199Z"))
                    .source("Website")
                    .status(DmsVehiclesaleStatus.SOLD)
                    .taxAmount(0d)
                    .taxes(List.of(
                        DmsVehiclesaleTax.builder()
                            .name("State sales tax")
                            .rate(8.25)
                            .totalAmount(0d)
                            .build()))
                    .totalAmount(7891d)
                    .tradeIns(List.of())
                    .type(DmsVehiclesaleType.RETAIL)
                    .updatedAt(OffsetDateTime.parse("2025-04-16T02:30:05.540Z"))
                    .vehicles(List.of())
                    .build())
                .connectionId("<id>")
                .build();

        CreateDmsVehiclesaleResponse res = sdk.vehiclesale().createDmsVehiclesale()
                .request(req)
                .call();

        if (res.dmsVehiclesale().isPresent()) {
            System.out.println(res.dmsVehiclesale().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateDmsVehiclesaleRequest](../../models/operations/CreateDmsVehiclesaleRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateDmsVehiclesaleResponse](../../models/operations/CreateDmsVehiclesaleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDmsVehiclesale

Retrieves a single DmsVehiclesale by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getDmsVehiclesale" method="get" path="/dms/{connection_id}/vehiclesale/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetDmsVehiclesaleRequest;
import to.unified.unified_java_sdk.models.operations.GetDmsVehiclesaleResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetDmsVehiclesaleRequest req = GetDmsVehiclesaleRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetDmsVehiclesaleResponse res = sdk.vehiclesale().getDmsVehiclesale()
                .request(req)
                .call();

        if (res.dmsVehiclesale().isPresent()) {
            System.out.println(res.dmsVehiclesale().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetDmsVehiclesaleRequest](../../models/operations/GetDmsVehiclesaleRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetDmsVehiclesaleResponse](../../models/operations/GetDmsVehiclesaleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listDmsVehiclesales

Returns a list of DmsVehiclesales. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listDmsVehiclesales" method="get" path="/dms/{connection_id}/vehiclesale" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListDmsVehiclesalesRequest;
import to.unified.unified_java_sdk.models.operations.ListDmsVehiclesalesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListDmsVehiclesalesRequest req = ListDmsVehiclesalesRequest.builder()
                .connectionId("<id>")
                .build();

        ListDmsVehiclesalesResponse res = sdk.vehiclesale().listDmsVehiclesales()
                .request(req)
                .call();

        if (res.dmsVehiclesales().isPresent()) {
            System.out.println(res.dmsVehiclesales().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListDmsVehiclesalesRequest](../../models/operations/ListDmsVehiclesalesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListDmsVehiclesalesResponse](../../models/operations/ListDmsVehiclesalesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchDmsVehiclesale

Updates the DmsVehiclesale identified by `id`. Provide the unified DmsVehiclesale fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchDmsVehiclesale" method="patch" path="/dms/{connection_id}/vehiclesale/{id}" example="dms_vehiclesale" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchDmsVehiclesaleRequest;
import to.unified.unified_java_sdk.models.operations.PatchDmsVehiclesaleResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchDmsVehiclesaleRequest req = PatchDmsVehiclesaleRequest.builder()
                .dmsVehiclesale(DmsVehiclesale.builder()
                    .backGrossAmount(4565d)
                    .createdAt(OffsetDateTime.parse("2020-04-02T08:14:56.150Z"))
                    .currency("USD")
                    .downPaymentAmount(6700d)
                    .fees(List.of(
                        DmsVehiclesaleFee.builder()
                            .costAmount(0d)
                            .isCapitalized(true)
                            .name("Documentation fee")
                            .priceAmount(499d)
                            .build(),
                        DmsVehiclesaleFee.builder()
                            .isCapitalized(false)
                            .name("Title and registration")
                            .priceAmount(392d)
                            .build()))
                    .finance(PropertyDmsVehiclesaleFinance.builder()
                        .financedAmount(0d)
                        .firstPaymentAt(OffsetDateTime.parse("2022-08-16T02:31:01.500Z"))
                        .interestRate(6.68)
                        .lenderName("Mueller, Yundt and Murray Financial")
                        .paymentAmount(339d)
                        .paymentFrequency(PaymentFrequency.MONTHLY)
                        .termMonths(72d)
                        .build())
                    .financeType(FinanceType.FINANCE)
                    .id("8312b9d9-ddf0-454c-82ea-ff6427d6b271")
                    .metadata(List.of())
                    .number("D84591")
                    .products(List.of(
                        DmsVehiclesaleProduct.builder()
                            .contractNumber("B7JN10GVB7")
                            .costAmount(1320d)
                            .name("Tire & Wheel")
                            .priceAmount(3300d)
                            .provider("Renner and Sons")
                            .termMonths(60d)
                            .type(DmsVehiclesaleProductType.PROTECTION)
                            .build(),
                        DmsVehiclesaleProduct.builder()
                            .contractNumber("VIZU7K3VRU")
                            .costAmount(1115d)
                            .deductibleAmount(100d)
                            .name("Platinum Vehicle Service Contract")
                            .priceAmount(3700d)
                            .provider("Frami, Wisozk and Gleichner")
                            .termMonths(72d)
                            .type(DmsVehiclesaleProductType.SERVICE_CONTRACT)
                            .build()))
                    .rebateAmount(500d)
                    .soldAt(OffsetDateTime.parse("2022-08-14T11:15:27.213Z"))
                    .source("Website")
                    .status(DmsVehiclesaleStatus.SOLD)
                    .taxAmount(0d)
                    .taxes(List.of(
                        DmsVehiclesaleTax.builder()
                            .name("State sales tax")
                            .rate(8.25)
                            .totalAmount(0d)
                            .build()))
                    .totalAmount(7891d)
                    .tradeIns(List.of())
                    .type(DmsVehiclesaleType.RETAIL)
                    .updatedAt(OffsetDateTime.parse("2025-04-16T02:30:05.571Z"))
                    .vehicles(List.of())
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDmsVehiclesaleResponse res = sdk.vehiclesale().patchDmsVehiclesale()
                .request(req)
                .call();

        if (res.dmsVehiclesale().isPresent()) {
            System.out.println(res.dmsVehiclesale().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchDmsVehiclesaleRequest](../../models/operations/PatchDmsVehiclesaleRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchDmsVehiclesaleResponse](../../models/operations/PatchDmsVehiclesaleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateDmsVehiclesale

Updates the DmsVehiclesale identified by `id`. Provide the unified DmsVehiclesale fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateDmsVehiclesale" method="put" path="/dms/{connection_id}/vehiclesale/{id}" example="dms_vehiclesale" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateDmsVehiclesaleRequest;
import to.unified.unified_java_sdk.models.operations.UpdateDmsVehiclesaleResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateDmsVehiclesaleRequest req = UpdateDmsVehiclesaleRequest.builder()
                .dmsVehiclesale(DmsVehiclesale.builder()
                    .backGrossAmount(4565d)
                    .createdAt(OffsetDateTime.parse("2020-04-02T08:14:56.150Z"))
                    .currency("USD")
                    .downPaymentAmount(6700d)
                    .fees(List.of(
                        DmsVehiclesaleFee.builder()
                            .costAmount(0d)
                            .isCapitalized(true)
                            .name("Documentation fee")
                            .priceAmount(499d)
                            .build(),
                        DmsVehiclesaleFee.builder()
                            .isCapitalized(false)
                            .name("Title and registration")
                            .priceAmount(392d)
                            .build()))
                    .finance(PropertyDmsVehiclesaleFinance.builder()
                        .financedAmount(0d)
                        .firstPaymentAt(OffsetDateTime.parse("2022-08-16T02:31:01.500Z"))
                        .interestRate(6.68)
                        .lenderName("Mueller, Yundt and Murray Financial")
                        .paymentAmount(339d)
                        .paymentFrequency(PaymentFrequency.MONTHLY)
                        .termMonths(72d)
                        .build())
                    .financeType(FinanceType.FINANCE)
                    .id("8312b9d9-ddf0-454c-82ea-ff6427d6b271")
                    .metadata(List.of())
                    .number("D84591")
                    .products(List.of(
                        DmsVehiclesaleProduct.builder()
                            .contractNumber("B7JN10GVB7")
                            .costAmount(1320d)
                            .name("Tire & Wheel")
                            .priceAmount(3300d)
                            .provider("Renner and Sons")
                            .termMonths(60d)
                            .type(DmsVehiclesaleProductType.PROTECTION)
                            .build(),
                        DmsVehiclesaleProduct.builder()
                            .contractNumber("VIZU7K3VRU")
                            .costAmount(1115d)
                            .deductibleAmount(100d)
                            .name("Platinum Vehicle Service Contract")
                            .priceAmount(3700d)
                            .provider("Frami, Wisozk and Gleichner")
                            .termMonths(72d)
                            .type(DmsVehiclesaleProductType.SERVICE_CONTRACT)
                            .build()))
                    .rebateAmount(500d)
                    .soldAt(OffsetDateTime.parse("2022-08-14T11:15:27.213Z"))
                    .source("Website")
                    .status(DmsVehiclesaleStatus.SOLD)
                    .taxAmount(0d)
                    .taxes(List.of(
                        DmsVehiclesaleTax.builder()
                            .name("State sales tax")
                            .rate(8.25)
                            .totalAmount(0d)
                            .build()))
                    .totalAmount(7891d)
                    .tradeIns(List.of())
                    .type(DmsVehiclesaleType.RETAIL)
                    .updatedAt(OffsetDateTime.parse("2025-04-16T02:30:05.571Z"))
                    .vehicles(List.of())
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDmsVehiclesaleResponse res = sdk.vehiclesale().updateDmsVehiclesale()
                .request(req)
                .call();

        if (res.dmsVehiclesale().isPresent()) {
            System.out.println(res.dmsVehiclesale().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateDmsVehiclesaleRequest](../../models/operations/UpdateDmsVehiclesaleRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateDmsVehiclesaleResponse](../../models/operations/UpdateDmsVehiclesaleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |