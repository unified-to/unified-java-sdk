# Repairorder

## Overview

### Available Operations

* [createDmsRepairorder](#createdmsrepairorder) - Create a repairorder
* [getDmsRepairorder](#getdmsrepairorder) - Retrieve a repairorder
* [listDmsRepairorders](#listdmsrepairorders) - List all repairorders
* [patchDmsRepairorder](#patchdmsrepairorder) - Update a repairorder
* [updateDmsRepairorder](#updatedmsrepairorder) - Update a repairorder

## createDmsRepairorder

Creates a DmsRepairorder. Provide the unified DmsRepairorder fields in the request body; they are mapped to the provider's API. Returns the created DmsRepairorder.

### Example Usage

<!-- UsageSnippet language="java" operationID="createDmsRepairorder" method="post" path="/dms/{connection_id}/repairorder" example="dms_repairorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDmsRepairorderRequest;
import to.unified.unified_java_sdk.models.operations.CreateDmsRepairorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDmsRepairorderRequest req = CreateDmsRepairorderRequest.builder()
                .dmsRepairorder(DmsRepairorder.builder()
                    .balanceAmount(3193.86)
                    .completedAt(OffsetDateTime.parse("2026-11-14T20:08:52.886Z"))
                    .createdAt(OffsetDateTime.parse("2022-10-25T15:50:48.007Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .estimateAmount(3264d)
                    .id("e499f4d9-616b-464b-a06d-33d6c3d73acc")
                    .jobs(List.of(
                        DmsRepairorderJob.builder()
                            .actualHours(3.6)
                            .cause("Scheduled maintenance")
                            .complaint("Due for service")
                            .correction("Aufero cumque vicinus aptus assumenda quis aptus.")
                            .id("950ff773-b04b-4b97-8831-b4213803dd80")
                            .laborAmount(681.6)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("5d23d689-f844-4a2c-ade8-3efaabdaa177")
                                    .payType(DmsRepairorderLaborPayType.WARRANTY)
                                    .rateAmount(213d)
                                    .soldHours(3.2)
                                    .technicianUserIds(List.of())
                                    .totalAmount(681.6)
                                    .build()))
                            .name("Customer concern")
                            .number("A")
                            .parts(List.of())
                            .partsAmount(0d)
                            .payType(DmsRepairorderJobPayType.WARRANTY)
                            .soldHours(3.2)
                            .status(DmsRepairorderJobStatus.COMPLETED)
                            .technicianUserIds(List.of())
                            .totalAmount(681.6)
                            .build(),
                        DmsRepairorderJob.builder()
                            .actualHours(3d)
                            .cause("Worn brake pads")
                            .complaint("Vibration at highway speed")
                            .correction("Somnus avaritia utroque vulnero ullam ancilla.")
                            .id("54886385-90c3-4de6-8184-25a85354a883")
                            .laborAmount(446.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("c95b98b5-a307-46b5-8342-16cff972dbed")
                                    .payType(DmsRepairorderLaborPayType.WARRANTY)
                                    .rateAmount(144d)
                                    .soldHours(3.1)
                                    .technicianUserIds(List.of())
                                    .totalAmount(446.4)
                                    .build()))
                            .name("Customer concern")
                            .number("B")
                            .parts(List.of(
                                DmsPartline.builder()
                                    .id("9aa77b2a-149e-4763-867c-92283abc13fd")
                                    .payType(DmsPartlinePayType.WARRANTY)
                                    .quantity(4d)
                                    .quantityOrdered(4d)
                                    .totalAmount(890.44)
                                    .unitPriceAmount(222.61)
                                    .build(),
                                DmsPartline.builder()
                                    .id("e732187b-448a-4980-998f-0e017d62f74d")
                                    .payType(DmsPartlinePayType.WARRANTY)
                                    .quantity(2d)
                                    .quantityOrdered(2d)
                                    .totalAmount(216.18)
                                    .unitPriceAmount(108.09)
                                    .build()))
                            .partsAmount(1106.6200000000001)
                            .payType(DmsRepairorderJobPayType.WARRANTY)
                            .soldHours(3.1)
                            .status(DmsRepairorderJobStatus.COMPLETED)
                            .technicianUserIds(List.of())
                            .totalAmount(1553.02)
                            .build(),
                        DmsRepairorderJob.builder()
                            .actualHours(1.5)
                            .cause("Scheduled maintenance")
                            .complaint("Noise when braking")
                            .correction("Degero theca natus.")
                            .id("ff1dbc53-6de5-4b14-acaf-83f9a6206bcb")
                            .laborAmount(232.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("770b04d0-6ec0-4a26-bf9d-93dd34e93261")
                                    .payType(DmsRepairorderLaborPayType.CUSTOMER)
                                    .rateAmount(166d)
                                    .soldHours(1.4)
                                    .technicianUserIds(List.of())
                                    .totalAmount(232.4)
                                    .build()))
                            .name("Customer concern")
                            .number("C")
                            .parts(List.of(
                                DmsPartline.builder()
                                    .id("383d81d0-ccde-44f8-812e-2419b92f0bee")
                                    .payType(DmsPartlinePayType.CUSTOMER)
                                    .quantity(1d)
                                    .quantityOrdered(1d)
                                    .totalAmount(216.02)
                                    .unitPriceAmount(216.02)
                                    .build(),
                                DmsPartline.builder()
                                    .id("68b0b9a1-f839-42fa-b516-a430057e9c24")
                                    .payType(DmsPartlinePayType.CUSTOMER)
                                    .quantity(2d)
                                    .quantityOrdered(2d)
                                    .totalAmount(358.16)
                                    .unitPriceAmount(179.08)
                                    .build()))
                            .partsAmount(574.1800000000001)
                            .payType(DmsRepairorderJobPayType.CUSTOMER)
                            .soldHours(1.4)
                            .status(DmsRepairorderJobStatus.COMPLETED)
                            .technicianUserIds(List.of())
                            .totalAmount(806.58)
                            .build()))
                    .laborAmount(1360.4)
                    .metadata(List.of())
                    .miscAmount(35d)
                    .number("143398")
                    .odometerIn(7776d)
                    .odometerOut(7776d)
                    .odometerUnit(DmsRepairorderOdometerUnit.MILES)
                    .openedAt(OffsetDateTime.parse("2025-02-08T22:50:13.695Z"))
                    .partsAmount(1680.8000000000002)
                    .payType(DmsRepairorderPayType.WARRANTY)
                    .promisedAt(OffsetDateTime.parse("2025-02-10T06:50:13.695Z"))
                    .purchaseOrderNumber("182743")
                    .status(DmsRepairorderStatus.COMPLETED)
                    .subletAmount(0d)
                    .tagNumber("758")
                    .taxAmount(117.66)
                    .technicianUserIds(List.of())
                    .totalAmount(3193.86)
                    .totals(List.of(
                        DmsRepairorderTotal.builder()
                            .discountAmount(0d)
                            .laborAmount(232.4)
                            .partsAmount(574.1800000000001)
                            .payType(DmsRepairorderTotalPayType.CUSTOMER)
                            .subletAmount(0d)
                            .totalAmount(806.58)
                            .build(),
                        DmsRepairorderTotal.builder()
                            .discountAmount(0d)
                            .laborAmount(1128d)
                            .partsAmount(1106.6200000000001)
                            .payType(DmsRepairorderTotalPayType.WARRANTY)
                            .subletAmount(0d)
                            .totalAmount(2234.62)
                            .build()))
                    .transportType(DmsRepairorderTransportType.LOANER)
                    .updatedAt(OffsetDateTime.parse("2025-11-29T11:23:31.149Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateDmsRepairorderResponse res = sdk.repairorder().createDmsRepairorder()
                .request(req)
                .call();

        if (res.dmsRepairorder().isPresent()) {
            System.out.println(res.dmsRepairorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateDmsRepairorderRequest](../../models/operations/CreateDmsRepairorderRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateDmsRepairorderResponse](../../models/operations/CreateDmsRepairorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDmsRepairorder

Retrieves a single DmsRepairorder by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getDmsRepairorder" method="get" path="/dms/{connection_id}/repairorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetDmsRepairorderRequest;
import to.unified.unified_java_sdk.models.operations.GetDmsRepairorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetDmsRepairorderRequest req = GetDmsRepairorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetDmsRepairorderResponse res = sdk.repairorder().getDmsRepairorder()
                .request(req)
                .call();

        if (res.dmsRepairorder().isPresent()) {
            System.out.println(res.dmsRepairorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetDmsRepairorderRequest](../../models/operations/GetDmsRepairorderRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetDmsRepairorderResponse](../../models/operations/GetDmsRepairorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listDmsRepairorders

Returns a list of DmsRepairorders. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listDmsRepairorders" method="get" path="/dms/{connection_id}/repairorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListDmsRepairordersRequest;
import to.unified.unified_java_sdk.models.operations.ListDmsRepairordersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListDmsRepairordersRequest req = ListDmsRepairordersRequest.builder()
                .connectionId("<id>")
                .build();

        ListDmsRepairordersResponse res = sdk.repairorder().listDmsRepairorders()
                .request(req)
                .call();

        if (res.dmsRepairorders().isPresent()) {
            System.out.println(res.dmsRepairorders().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListDmsRepairordersRequest](../../models/operations/ListDmsRepairordersRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListDmsRepairordersResponse](../../models/operations/ListDmsRepairordersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchDmsRepairorder

Updates the DmsRepairorder identified by `id`. Provide the unified DmsRepairorder fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchDmsRepairorder" method="patch" path="/dms/{connection_id}/repairorder/{id}" example="dms_repairorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchDmsRepairorderRequest;
import to.unified.unified_java_sdk.models.operations.PatchDmsRepairorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchDmsRepairorderRequest req = PatchDmsRepairorderRequest.builder()
                .dmsRepairorder(DmsRepairorder.builder()
                    .balanceAmount(3193.86)
                    .completedAt(OffsetDateTime.parse("2026-11-14T20:08:52.940Z"))
                    .createdAt(OffsetDateTime.parse("2022-10-25T15:50:48.007Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .estimateAmount(3264d)
                    .id("f9a1420f-e133-4c3f-8601-7bc371774ffc")
                    .jobs(List.of(
                        DmsRepairorderJob.builder()
                            .actualHours(3.6)
                            .cause("Scheduled maintenance")
                            .complaint("Due for service")
                            .correction("Aufero cumque vicinus aptus assumenda quis aptus.")
                            .id("8cc14108-9fb2-4811-9003-50e4ec8ffa04")
                            .laborAmount(681.6)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("759cbb29-51c3-422d-8510-043d92f1365c")
                                    .payType(DmsRepairorderLaborPayType.WARRANTY)
                                    .rateAmount(213d)
                                    .soldHours(3.2)
                                    .technicianUserIds(List.of())
                                    .totalAmount(681.6)
                                    .build()))
                            .name("Customer concern")
                            .number("A")
                            .parts(List.of())
                            .partsAmount(0d)
                            .payType(DmsRepairorderJobPayType.WARRANTY)
                            .soldHours(3.2)
                            .status(DmsRepairorderJobStatus.COMPLETED)
                            .technicianUserIds(List.of())
                            .totalAmount(681.6)
                            .build(),
                        DmsRepairorderJob.builder()
                            .actualHours(3d)
                            .cause("Worn brake pads")
                            .complaint("Vibration at highway speed")
                            .correction("Somnus avaritia utroque vulnero ullam ancilla.")
                            .id("b1477a7b-a93e-4a39-9d5e-fc5fe4aec86a")
                            .laborAmount(446.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("a6821f73-c65c-49e0-9521-65c1e4ccda2d")
                                    .payType(DmsRepairorderLaborPayType.WARRANTY)
                                    .rateAmount(144d)
                                    .soldHours(3.1)
                                    .technicianUserIds(List.of())
                                    .totalAmount(446.4)
                                    .build()))
                            .name("Customer concern")
                            .number("B")
                            .parts(List.of(
                                DmsPartline.builder()
                                    .id("51e26f31-6f14-4d83-acee-7cd2f61c6370")
                                    .payType(DmsPartlinePayType.WARRANTY)
                                    .quantity(4d)
                                    .quantityOrdered(4d)
                                    .totalAmount(890.44)
                                    .unitPriceAmount(222.61)
                                    .build(),
                                DmsPartline.builder()
                                    .id("7ed9777b-e5b6-46f9-be31-ff248cad1950")
                                    .payType(DmsPartlinePayType.WARRANTY)
                                    .quantity(2d)
                                    .quantityOrdered(2d)
                                    .totalAmount(216.18)
                                    .unitPriceAmount(108.09)
                                    .build()))
                            .partsAmount(1106.6200000000001)
                            .payType(DmsRepairorderJobPayType.WARRANTY)
                            .soldHours(3.1)
                            .status(DmsRepairorderJobStatus.COMPLETED)
                            .technicianUserIds(List.of())
                            .totalAmount(1553.02)
                            .build(),
                        DmsRepairorderJob.builder()
                            .actualHours(1.5)
                            .cause("Scheduled maintenance")
                            .complaint("Noise when braking")
                            .correction("Degero theca natus.")
                            .id("2dcc74cf-8818-4fef-b9c0-b93b5620729c")
                            .laborAmount(232.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("cb9b612f-9d3f-4aca-a230-1d94ed839ad3")
                                    .payType(DmsRepairorderLaborPayType.CUSTOMER)
                                    .rateAmount(166d)
                                    .soldHours(1.4)
                                    .technicianUserIds(List.of())
                                    .totalAmount(232.4)
                                    .build()))
                            .name("Customer concern")
                            .number("C")
                            .parts(List.of(
                                DmsPartline.builder()
                                    .id("9c58c458-ad5f-47a8-8bfa-0109d7fd49cb")
                                    .payType(DmsPartlinePayType.CUSTOMER)
                                    .quantity(1d)
                                    .quantityOrdered(1d)
                                    .totalAmount(216.02)
                                    .unitPriceAmount(216.02)
                                    .build(),
                                DmsPartline.builder()
                                    .id("68abe8f6-26c3-48e8-9f1e-2794a0da1e1c")
                                    .payType(DmsPartlinePayType.CUSTOMER)
                                    .quantity(2d)
                                    .quantityOrdered(2d)
                                    .totalAmount(358.16)
                                    .unitPriceAmount(179.08)
                                    .build()))
                            .partsAmount(574.1800000000001)
                            .payType(DmsRepairorderJobPayType.CUSTOMER)
                            .soldHours(1.4)
                            .status(DmsRepairorderJobStatus.COMPLETED)
                            .technicianUserIds(List.of())
                            .totalAmount(806.58)
                            .build()))
                    .laborAmount(1360.4)
                    .metadata(List.of())
                    .miscAmount(35d)
                    .number("143398")
                    .odometerIn(7776d)
                    .odometerOut(7776d)
                    .odometerUnit(DmsRepairorderOdometerUnit.MILES)
                    .openedAt(OffsetDateTime.parse("2025-02-08T22:50:13.726Z"))
                    .partsAmount(1680.8000000000002)
                    .payType(DmsRepairorderPayType.WARRANTY)
                    .promisedAt(OffsetDateTime.parse("2025-02-10T06:50:13.726Z"))
                    .purchaseOrderNumber("182743")
                    .status(DmsRepairorderStatus.COMPLETED)
                    .subletAmount(0d)
                    .tagNumber("758")
                    .taxAmount(117.66)
                    .technicianUserIds(List.of())
                    .totalAmount(3193.86)
                    .totals(List.of(
                        DmsRepairorderTotal.builder()
                            .discountAmount(0d)
                            .laborAmount(232.4)
                            .partsAmount(574.1800000000001)
                            .payType(DmsRepairorderTotalPayType.CUSTOMER)
                            .subletAmount(0d)
                            .totalAmount(806.58)
                            .build(),
                        DmsRepairorderTotal.builder()
                            .discountAmount(0d)
                            .laborAmount(1128d)
                            .partsAmount(1106.6200000000001)
                            .payType(DmsRepairorderTotalPayType.WARRANTY)
                            .subletAmount(0d)
                            .totalAmount(2234.62)
                            .build()))
                    .transportType(DmsRepairorderTransportType.LOANER)
                    .updatedAt(OffsetDateTime.parse("2025-11-29T11:23:31.191Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDmsRepairorderResponse res = sdk.repairorder().patchDmsRepairorder()
                .request(req)
                .call();

        if (res.dmsRepairorder().isPresent()) {
            System.out.println(res.dmsRepairorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchDmsRepairorderRequest](../../models/operations/PatchDmsRepairorderRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchDmsRepairorderResponse](../../models/operations/PatchDmsRepairorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateDmsRepairorder

Updates the DmsRepairorder identified by `id`. Provide the unified DmsRepairorder fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateDmsRepairorder" method="put" path="/dms/{connection_id}/repairorder/{id}" example="dms_repairorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateDmsRepairorderRequest;
import to.unified.unified_java_sdk.models.operations.UpdateDmsRepairorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateDmsRepairorderRequest req = UpdateDmsRepairorderRequest.builder()
                .dmsRepairorder(DmsRepairorder.builder()
                    .balanceAmount(3193.86)
                    .completedAt(OffsetDateTime.parse("2026-11-14T20:08:52.940Z"))
                    .createdAt(OffsetDateTime.parse("2022-10-25T15:50:48.007Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .estimateAmount(3264d)
                    .id("f9a1420f-e133-4c3f-8601-7bc371774ffc")
                    .jobs(List.of(
                        DmsRepairorderJob.builder()
                            .actualHours(3.6)
                            .cause("Scheduled maintenance")
                            .complaint("Due for service")
                            .correction("Aufero cumque vicinus aptus assumenda quis aptus.")
                            .id("8cc14108-9fb2-4811-9003-50e4ec8ffa04")
                            .laborAmount(681.6)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("759cbb29-51c3-422d-8510-043d92f1365c")
                                    .payType(DmsRepairorderLaborPayType.WARRANTY)
                                    .rateAmount(213d)
                                    .soldHours(3.2)
                                    .technicianUserIds(List.of())
                                    .totalAmount(681.6)
                                    .build()))
                            .name("Customer concern")
                            .number("A")
                            .parts(List.of())
                            .partsAmount(0d)
                            .payType(DmsRepairorderJobPayType.WARRANTY)
                            .soldHours(3.2)
                            .status(DmsRepairorderJobStatus.COMPLETED)
                            .technicianUserIds(List.of())
                            .totalAmount(681.6)
                            .build(),
                        DmsRepairorderJob.builder()
                            .actualHours(3d)
                            .cause("Worn brake pads")
                            .complaint("Vibration at highway speed")
                            .correction("Somnus avaritia utroque vulnero ullam ancilla.")
                            .id("b1477a7b-a93e-4a39-9d5e-fc5fe4aec86a")
                            .laborAmount(446.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("a6821f73-c65c-49e0-9521-65c1e4ccda2d")
                                    .payType(DmsRepairorderLaborPayType.WARRANTY)
                                    .rateAmount(144d)
                                    .soldHours(3.1)
                                    .technicianUserIds(List.of())
                                    .totalAmount(446.4)
                                    .build()))
                            .name("Customer concern")
                            .number("B")
                            .parts(List.of(
                                DmsPartline.builder()
                                    .id("51e26f31-6f14-4d83-acee-7cd2f61c6370")
                                    .payType(DmsPartlinePayType.WARRANTY)
                                    .quantity(4d)
                                    .quantityOrdered(4d)
                                    .totalAmount(890.44)
                                    .unitPriceAmount(222.61)
                                    .build(),
                                DmsPartline.builder()
                                    .id("7ed9777b-e5b6-46f9-be31-ff248cad1950")
                                    .payType(DmsPartlinePayType.WARRANTY)
                                    .quantity(2d)
                                    .quantityOrdered(2d)
                                    .totalAmount(216.18)
                                    .unitPriceAmount(108.09)
                                    .build()))
                            .partsAmount(1106.6200000000001)
                            .payType(DmsRepairorderJobPayType.WARRANTY)
                            .soldHours(3.1)
                            .status(DmsRepairorderJobStatus.COMPLETED)
                            .technicianUserIds(List.of())
                            .totalAmount(1553.02)
                            .build(),
                        DmsRepairorderJob.builder()
                            .actualHours(1.5)
                            .cause("Scheduled maintenance")
                            .complaint("Noise when braking")
                            .correction("Degero theca natus.")
                            .id("2dcc74cf-8818-4fef-b9c0-b93b5620729c")
                            .laborAmount(232.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("cb9b612f-9d3f-4aca-a230-1d94ed839ad3")
                                    .payType(DmsRepairorderLaborPayType.CUSTOMER)
                                    .rateAmount(166d)
                                    .soldHours(1.4)
                                    .technicianUserIds(List.of())
                                    .totalAmount(232.4)
                                    .build()))
                            .name("Customer concern")
                            .number("C")
                            .parts(List.of(
                                DmsPartline.builder()
                                    .id("9c58c458-ad5f-47a8-8bfa-0109d7fd49cb")
                                    .payType(DmsPartlinePayType.CUSTOMER)
                                    .quantity(1d)
                                    .quantityOrdered(1d)
                                    .totalAmount(216.02)
                                    .unitPriceAmount(216.02)
                                    .build(),
                                DmsPartline.builder()
                                    .id("68abe8f6-26c3-48e8-9f1e-2794a0da1e1c")
                                    .payType(DmsPartlinePayType.CUSTOMER)
                                    .quantity(2d)
                                    .quantityOrdered(2d)
                                    .totalAmount(358.16)
                                    .unitPriceAmount(179.08)
                                    .build()))
                            .partsAmount(574.1800000000001)
                            .payType(DmsRepairorderJobPayType.CUSTOMER)
                            .soldHours(1.4)
                            .status(DmsRepairorderJobStatus.COMPLETED)
                            .technicianUserIds(List.of())
                            .totalAmount(806.58)
                            .build()))
                    .laborAmount(1360.4)
                    .metadata(List.of())
                    .miscAmount(35d)
                    .number("143398")
                    .odometerIn(7776d)
                    .odometerOut(7776d)
                    .odometerUnit(DmsRepairorderOdometerUnit.MILES)
                    .openedAt(OffsetDateTime.parse("2025-02-08T22:50:13.726Z"))
                    .partsAmount(1680.8000000000002)
                    .payType(DmsRepairorderPayType.WARRANTY)
                    .promisedAt(OffsetDateTime.parse("2025-02-10T06:50:13.726Z"))
                    .purchaseOrderNumber("182743")
                    .status(DmsRepairorderStatus.COMPLETED)
                    .subletAmount(0d)
                    .tagNumber("758")
                    .taxAmount(117.66)
                    .technicianUserIds(List.of())
                    .totalAmount(3193.86)
                    .totals(List.of(
                        DmsRepairorderTotal.builder()
                            .discountAmount(0d)
                            .laborAmount(232.4)
                            .partsAmount(574.1800000000001)
                            .payType(DmsRepairorderTotalPayType.CUSTOMER)
                            .subletAmount(0d)
                            .totalAmount(806.58)
                            .build(),
                        DmsRepairorderTotal.builder()
                            .discountAmount(0d)
                            .laborAmount(1128d)
                            .partsAmount(1106.6200000000001)
                            .payType(DmsRepairorderTotalPayType.WARRANTY)
                            .subletAmount(0d)
                            .totalAmount(2234.62)
                            .build()))
                    .transportType(DmsRepairorderTransportType.LOANER)
                    .updatedAt(OffsetDateTime.parse("2025-11-29T11:23:31.191Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDmsRepairorderResponse res = sdk.repairorder().updateDmsRepairorder()
                .request(req)
                .call();

        if (res.dmsRepairorder().isPresent()) {
            System.out.println(res.dmsRepairorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateDmsRepairorderRequest](../../models/operations/UpdateDmsRepairorderRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateDmsRepairorderResponse](../../models/operations/UpdateDmsRepairorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |