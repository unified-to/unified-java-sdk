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
                    .completedAt(OffsetDateTime.parse("2026-11-13T20:46:36.899Z"))
                    .createdAt(OffsetDateTime.parse("2022-10-25T15:50:48.007Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .estimateAmount(3264d)
                    .id("2dbd3442-652f-4c8e-bedb-7c046f53f8e6")
                    .jobs(List.of(
                        DmsRepairorderJob.builder()
                            .actualHours(3.6)
                            .cause("Scheduled maintenance")
                            .complaint("Due for service")
                            .correction("Aufero cumque vicinus aptus assumenda quis aptus.")
                            .id("04e44476-af06-4e06-90bf-2004ed987bf9")
                            .laborAmount(681.6)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("4c5b7595-a23b-4135-8892-ec08cdd170e4")
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
                            .id("2ab88935-7740-4fe1-82e3-a03b03e948b9")
                            .laborAmount(446.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("90f1d435-d9c9-4870-95ba-af0618cb9f2d")
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
                                    .id("2b52094a-f63d-4423-8fb2-c272e7165827")
                                    .payType(DmsPartlinePayType.WARRANTY)
                                    .quantity(4d)
                                    .quantityOrdered(4d)
                                    .totalAmount(890.44)
                                    .unitPriceAmount(222.61)
                                    .build(),
                                DmsPartline.builder()
                                    .id("62a02a04-d631-49d8-bc75-66024bd8d069")
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
                            .id("a7ab4336-9b66-4f5c-915d-dcb687a08ebf")
                            .laborAmount(232.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("253cac94-f6c7-4415-a3d7-37f93e93fd70")
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
                                    .id("572cdff0-aa4c-4312-9ef7-957738982d0c")
                                    .payType(DmsPartlinePayType.CUSTOMER)
                                    .quantity(1d)
                                    .quantityOrdered(1d)
                                    .totalAmount(216.02)
                                    .unitPriceAmount(216.02)
                                    .build(),
                                DmsPartline.builder()
                                    .id("de1323ce-e8c3-4835-b72b-3d12fa4265bb")
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
                    .openedAt(OffsetDateTime.parse("2025-02-08T09:37:32.720Z"))
                    .partsAmount(1680.8000000000002)
                    .payType(DmsRepairorderPayType.WARRANTY)
                    .promisedAt(OffsetDateTime.parse("2025-02-09T17:37:32.720Z"))
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
                    .updatedAt(OffsetDateTime.parse("2025-11-28T17:32:57.070Z"))
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
                    .completedAt(OffsetDateTime.parse("2026-11-13T20:46:36.941Z"))
                    .createdAt(OffsetDateTime.parse("2022-10-25T15:50:48.007Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .estimateAmount(3264d)
                    .id("b720759e-11f4-4eb2-ad18-7a1d74a22d36")
                    .jobs(List.of(
                        DmsRepairorderJob.builder()
                            .actualHours(3.6)
                            .cause("Scheduled maintenance")
                            .complaint("Due for service")
                            .correction("Aufero cumque vicinus aptus assumenda quis aptus.")
                            .id("670ca467-7702-4acb-869b-7d1e8ce28266")
                            .laborAmount(681.6)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("bcaa6d56-8514-4178-adca-c20a6ce1f587")
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
                            .id("9f6fd07a-bf0a-4b8e-8d58-cb14fc6cf5bf")
                            .laborAmount(446.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("5c6e84bb-2bad-420c-9d8a-26651be27b4a")
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
                                    .id("ed031a7f-b7f2-4fbb-a329-593472b5b96e")
                                    .payType(DmsPartlinePayType.WARRANTY)
                                    .quantity(4d)
                                    .quantityOrdered(4d)
                                    .totalAmount(890.44)
                                    .unitPriceAmount(222.61)
                                    .build(),
                                DmsPartline.builder()
                                    .id("833e60aa-69fc-4de7-b1f8-ee482ae2a91a")
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
                            .id("fa12bb24-e759-42c9-8a0b-295aa78c127f")
                            .laborAmount(232.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("1b80abd2-5045-4b05-a22b-e34917caedee")
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
                                    .id("39cc5561-9bf9-4ece-acbb-88a70fbac770")
                                    .payType(DmsPartlinePayType.CUSTOMER)
                                    .quantity(1d)
                                    .quantityOrdered(1d)
                                    .totalAmount(216.02)
                                    .unitPriceAmount(216.02)
                                    .build(),
                                DmsPartline.builder()
                                    .id("ddfe075d-c64e-44ba-9016-0bc506dfa5d4")
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
                    .openedAt(OffsetDateTime.parse("2025-02-08T09:37:32.744Z"))
                    .partsAmount(1680.8000000000002)
                    .payType(DmsRepairorderPayType.WARRANTY)
                    .promisedAt(OffsetDateTime.parse("2025-02-09T17:37:32.744Z"))
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
                    .updatedAt(OffsetDateTime.parse("2025-11-28T17:32:57.101Z"))
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
                    .completedAt(OffsetDateTime.parse("2026-11-13T20:46:36.941Z"))
                    .createdAt(OffsetDateTime.parse("2022-10-25T15:50:48.007Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .estimateAmount(3264d)
                    .id("b720759e-11f4-4eb2-ad18-7a1d74a22d36")
                    .jobs(List.of(
                        DmsRepairorderJob.builder()
                            .actualHours(3.6)
                            .cause("Scheduled maintenance")
                            .complaint("Due for service")
                            .correction("Aufero cumque vicinus aptus assumenda quis aptus.")
                            .id("670ca467-7702-4acb-869b-7d1e8ce28266")
                            .laborAmount(681.6)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("bcaa6d56-8514-4178-adca-c20a6ce1f587")
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
                            .id("9f6fd07a-bf0a-4b8e-8d58-cb14fc6cf5bf")
                            .laborAmount(446.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("5c6e84bb-2bad-420c-9d8a-26651be27b4a")
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
                                    .id("ed031a7f-b7f2-4fbb-a329-593472b5b96e")
                                    .payType(DmsPartlinePayType.WARRANTY)
                                    .quantity(4d)
                                    .quantityOrdered(4d)
                                    .totalAmount(890.44)
                                    .unitPriceAmount(222.61)
                                    .build(),
                                DmsPartline.builder()
                                    .id("833e60aa-69fc-4de7-b1f8-ee482ae2a91a")
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
                            .id("fa12bb24-e759-42c9-8a0b-295aa78c127f")
                            .laborAmount(232.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("1b80abd2-5045-4b05-a22b-e34917caedee")
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
                                    .id("39cc5561-9bf9-4ece-acbb-88a70fbac770")
                                    .payType(DmsPartlinePayType.CUSTOMER)
                                    .quantity(1d)
                                    .quantityOrdered(1d)
                                    .totalAmount(216.02)
                                    .unitPriceAmount(216.02)
                                    .build(),
                                DmsPartline.builder()
                                    .id("ddfe075d-c64e-44ba-9016-0bc506dfa5d4")
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
                    .openedAt(OffsetDateTime.parse("2025-02-08T09:37:32.744Z"))
                    .partsAmount(1680.8000000000002)
                    .payType(DmsRepairorderPayType.WARRANTY)
                    .promisedAt(OffsetDateTime.parse("2025-02-09T17:37:32.744Z"))
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
                    .updatedAt(OffsetDateTime.parse("2025-11-28T17:32:57.101Z"))
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