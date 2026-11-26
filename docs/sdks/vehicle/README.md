# Vehicle

## Overview

### Available Operations

* [createDmsVehicle](#createdmsvehicle) - Create a vehicle
* [getDmsVehicle](#getdmsvehicle) - Retrieve a vehicle
* [listDmsVehicles](#listdmsvehicles) - List all vehicles
* [patchDmsVehicle](#patchdmsvehicle) - Update a vehicle
* [updateDmsVehicle](#updatedmsvehicle) - Update a vehicle

## createDmsVehicle

Creates a DmsVehicle. Provide the unified DmsVehicle fields in the request body; they are mapped to the provider's API. Returns the created DmsVehicle.

### Example Usage

<!-- UsageSnippet language="java" operationID="createDmsVehicle" method="post" path="/dms/{connection_id}/vehicle" example="dms_vehicle" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDmsVehicleRequest;
import to.unified.unified_java_sdk.models.operations.CreateDmsVehicleResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDmsVehicleRequest req = CreateDmsVehicleRequest.builder()
                .dmsVehicle(DmsVehicle.builder()
                    .bodyStyle("Pickup")
                    .condition(Condition.NEW)
                    .costAmount(26498d)
                    .createdAt(OffsetDateTime.parse("2021-02-03T08:01:58.559Z"))
                    .currency("USD")
                    .description("2023 Citroën Silverado")
                    .exteriorColor("lavender")
                    .fuelType(FuelType.ELECTRIC)
                    .id("7243f621-31e6-43cd-b6da-b5151d8b37db")
                    .imageUrls(List.of(
                        "https://picsum.photos/seed/tOUr5K/1358/1877"))
                    .interiorColor("Black")
                    .internetPriceAmount(29526d)
                    .isActive(true)
                    .isCertified(false)
                    .isInventory(true)
                    .isPublished(false)
                    .make("Citroën")
                    .metadata(List.of())
                    .model("Silverado")
                    .modelCode("PMU8KI")
                    .msrpAmount(33100d)
                    .odometer(1d)
                    .odometerUnit(DmsVehicleOdometerUnit.MILES)
                    .options(List.of(
                        DmsVehicleOption.builder()
                            .code("SXE")
                            .costAmount(250d)
                            .description("Tow package")
                            .priceAmount(1400d)
                            .type(DmsVehicleOptionType.DEALER)
                            .build(),
                        DmsVehicleOption.builder()
                            .code("458")
                            .costAmount(700d)
                            .description("Tow package")
                            .priceAmount(600d)
                            .type(DmsVehicleOptionType.DEALER)
                            .build()))
                    .priceAmount(29926d)
                    .receivedAt(OffsetDateTime.parse("2021-02-03T08:01:58.559Z"))
                    .status(DmsVehicleStatus.OTHER)
                    .stockNumber("N24959")
                    .transmission("Manual")
                    .trim("Base")
                    .type(DmsVehicleType.SUV)
                    .updatedAt(OffsetDateTime.parse("2023-11-03T01:45:51.990Z"))
                    .vin("C29ZDU474DDR70955")
                    .warrantyExpiresAt(OffsetDateTime.parse("2022-03-28T09:10:09.889Z"))
                    .year(2023d)
                    .build())
                .connectionId("<id>")
                .build();

        CreateDmsVehicleResponse res = sdk.vehicle().createDmsVehicle()
                .request(req)
                .call();

        if (res.dmsVehicle().isPresent()) {
            System.out.println(res.dmsVehicle().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateDmsVehicleRequest](../../models/operations/CreateDmsVehicleRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateDmsVehicleResponse](../../models/operations/CreateDmsVehicleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDmsVehicle

Retrieves a single DmsVehicle by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getDmsVehicle" method="get" path="/dms/{connection_id}/vehicle/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetDmsVehicleRequest;
import to.unified.unified_java_sdk.models.operations.GetDmsVehicleResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetDmsVehicleRequest req = GetDmsVehicleRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetDmsVehicleResponse res = sdk.vehicle().getDmsVehicle()
                .request(req)
                .call();

        if (res.dmsVehicle().isPresent()) {
            System.out.println(res.dmsVehicle().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetDmsVehicleRequest](../../models/operations/GetDmsVehicleRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetDmsVehicleResponse](../../models/operations/GetDmsVehicleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listDmsVehicles

Returns a list of DmsVehicles. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listDmsVehicles" method="get" path="/dms/{connection_id}/vehicle" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListDmsVehiclesRequest;
import to.unified.unified_java_sdk.models.operations.ListDmsVehiclesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListDmsVehiclesRequest req = ListDmsVehiclesRequest.builder()
                .connectionId("<id>")
                .build();

        ListDmsVehiclesResponse res = sdk.vehicle().listDmsVehicles()
                .request(req)
                .call();

        if (res.dmsVehicles().isPresent()) {
            System.out.println(res.dmsVehicles().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListDmsVehiclesRequest](../../models/operations/ListDmsVehiclesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListDmsVehiclesResponse](../../models/operations/ListDmsVehiclesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchDmsVehicle

Updates the DmsVehicle identified by `id`. Provide the unified DmsVehicle fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchDmsVehicle" method="patch" path="/dms/{connection_id}/vehicle/{id}" example="dms_vehicle" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchDmsVehicleRequest;
import to.unified.unified_java_sdk.models.operations.PatchDmsVehicleResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchDmsVehicleRequest req = PatchDmsVehicleRequest.builder()
                .dmsVehicle(DmsVehicle.builder()
                    .bodyStyle("Pickup")
                    .condition(Condition.NEW)
                    .costAmount(26498d)
                    .createdAt(OffsetDateTime.parse("2021-02-03T08:01:58.559Z"))
                    .currency("USD")
                    .description("2023 Citroën Silverado")
                    .exteriorColor("lavender")
                    .fuelType(FuelType.ELECTRIC)
                    .id("b75e7e34-b659-46b4-ac9d-caad7d47ffb4")
                    .imageUrls(List.of(
                        "https://picsum.photos/seed/tOUr5K/1358/1877"))
                    .interiorColor("Black")
                    .internetPriceAmount(29526d)
                    .isActive(true)
                    .isCertified(false)
                    .isInventory(true)
                    .isPublished(false)
                    .make("Citroën")
                    .metadata(List.of())
                    .model("Silverado")
                    .modelCode("PMU8KI")
                    .msrpAmount(33100d)
                    .odometer(1d)
                    .odometerUnit(DmsVehicleOdometerUnit.MILES)
                    .options(List.of(
                        DmsVehicleOption.builder()
                            .code("SXE")
                            .costAmount(250d)
                            .description("Tow package")
                            .priceAmount(1400d)
                            .type(DmsVehicleOptionType.DEALER)
                            .build(),
                        DmsVehicleOption.builder()
                            .code("458")
                            .costAmount(700d)
                            .description("Tow package")
                            .priceAmount(600d)
                            .type(DmsVehicleOptionType.DEALER)
                            .build()))
                    .priceAmount(29926d)
                    .receivedAt(OffsetDateTime.parse("2021-02-03T08:01:58.559Z"))
                    .status(DmsVehicleStatus.OTHER)
                    .stockNumber("N24959")
                    .transmission("Manual")
                    .trim("Base")
                    .type(DmsVehicleType.SUV)
                    .updatedAt(OffsetDateTime.parse("2023-11-03T01:45:52.002Z"))
                    .vin("C29ZDU474DDR70955")
                    .warrantyExpiresAt(OffsetDateTime.parse("2022-03-28T09:10:09.889Z"))
                    .year(2023d)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDmsVehicleResponse res = sdk.vehicle().patchDmsVehicle()
                .request(req)
                .call();

        if (res.dmsVehicle().isPresent()) {
            System.out.println(res.dmsVehicle().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchDmsVehicleRequest](../../models/operations/PatchDmsVehicleRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchDmsVehicleResponse](../../models/operations/PatchDmsVehicleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateDmsVehicle

Updates the DmsVehicle identified by `id`. Provide the unified DmsVehicle fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateDmsVehicle" method="put" path="/dms/{connection_id}/vehicle/{id}" example="dms_vehicle" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateDmsVehicleRequest;
import to.unified.unified_java_sdk.models.operations.UpdateDmsVehicleResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateDmsVehicleRequest req = UpdateDmsVehicleRequest.builder()
                .dmsVehicle(DmsVehicle.builder()
                    .bodyStyle("Pickup")
                    .condition(Condition.NEW)
                    .costAmount(26498d)
                    .createdAt(OffsetDateTime.parse("2021-02-03T08:01:58.559Z"))
                    .currency("USD")
                    .description("2023 Citroën Silverado")
                    .exteriorColor("lavender")
                    .fuelType(FuelType.ELECTRIC)
                    .id("b75e7e34-b659-46b4-ac9d-caad7d47ffb4")
                    .imageUrls(List.of(
                        "https://picsum.photos/seed/tOUr5K/1358/1877"))
                    .interiorColor("Black")
                    .internetPriceAmount(29526d)
                    .isActive(true)
                    .isCertified(false)
                    .isInventory(true)
                    .isPublished(false)
                    .make("Citroën")
                    .metadata(List.of())
                    .model("Silverado")
                    .modelCode("PMU8KI")
                    .msrpAmount(33100d)
                    .odometer(1d)
                    .odometerUnit(DmsVehicleOdometerUnit.MILES)
                    .options(List.of(
                        DmsVehicleOption.builder()
                            .code("SXE")
                            .costAmount(250d)
                            .description("Tow package")
                            .priceAmount(1400d)
                            .type(DmsVehicleOptionType.DEALER)
                            .build(),
                        DmsVehicleOption.builder()
                            .code("458")
                            .costAmount(700d)
                            .description("Tow package")
                            .priceAmount(600d)
                            .type(DmsVehicleOptionType.DEALER)
                            .build()))
                    .priceAmount(29926d)
                    .receivedAt(OffsetDateTime.parse("2021-02-03T08:01:58.559Z"))
                    .status(DmsVehicleStatus.OTHER)
                    .stockNumber("N24959")
                    .transmission("Manual")
                    .trim("Base")
                    .type(DmsVehicleType.SUV)
                    .updatedAt(OffsetDateTime.parse("2023-11-03T01:45:52.002Z"))
                    .vin("C29ZDU474DDR70955")
                    .warrantyExpiresAt(OffsetDateTime.parse("2022-03-28T09:10:09.889Z"))
                    .year(2023d)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDmsVehicleResponse res = sdk.vehicle().updateDmsVehicle()
                .request(req)
                .call();

        if (res.dmsVehicle().isPresent()) {
            System.out.println(res.dmsVehicle().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateDmsVehicleRequest](../../models/operations/UpdateDmsVehicleRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateDmsVehicleResponse](../../models/operations/UpdateDmsVehicleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |