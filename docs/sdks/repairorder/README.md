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
                    .completedAt(OffsetDateTime.parse("2026-11-12T19:24:17.021Z"))
                    .createdAt(OffsetDateTime.parse("2022-10-25T15:50:48.007Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .estimateAmount(3264d)
                    .id("8fea2b49-46ed-4ca7-8833-e4981a1a71e3")
                    .jobs(List.of(
                        DmsRepairorderJob.builder()
                            .actualHours(3.6)
                            .cause("Scheduled maintenance")
                            .complaint("Due for service")
                            .correction("Aufero cumque vicinus aptus assumenda quis aptus.")
                            .id("883c5849-ab18-43b8-8f79-2be79ee746ff")
                            .laborAmount(681.6)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("7ebc8486-761b-4d5b-9610-7ba703b21fe9")
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
                            .id("f1b194d8-0519-417e-91f9-f77f4c8b8615")
                            .laborAmount(446.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("d9b5157f-49c7-4db2-84b8-a467861cb9d1")
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
                                    .id("5eb5bfa9-da86-4826-aac8-c7fa9b67dfc5")
                                    .payType(DmsPartlinePayType.WARRANTY)
                                    .quantity(4d)
                                    .quantityOrdered(4d)
                                    .totalAmount(890.44)
                                    .unitPriceAmount(222.61)
                                    .build(),
                                DmsPartline.builder()
                                    .id("7a0ce90e-5d73-49eb-abff-5f1b303054d0")
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
                            .id("2b13bc32-0c38-495d-9ed9-b7a746872b52")
                            .laborAmount(232.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("69d13755-ba42-42f8-a2bd-48f6511a9d49")
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
                                    .id("68632a71-a58f-4b77-8bdb-d31b22814b01")
                                    .payType(DmsPartlinePayType.CUSTOMER)
                                    .quantity(1d)
                                    .quantityOrdered(1d)
                                    .totalAmount(216.02)
                                    .unitPriceAmount(216.02)
                                    .build(),
                                DmsPartline.builder()
                                    .id("121ef622-1057-401e-a618-5b0975aa76e2")
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
                    .openedAt(OffsetDateTime.parse("2025-02-07T19:16:59.480Z"))
                    .partsAmount(1680.8000000000002)
                    .payType(DmsRepairorderPayType.WARRANTY)
                    .promisedAt(OffsetDateTime.parse("2025-02-09T03:16:59.480Z"))
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
                    .updatedAt(OffsetDateTime.parse("2025-11-27T22:10:43.140Z"))
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
                    .completedAt(OffsetDateTime.parse("2026-11-12T19:24:17.061Z"))
                    .createdAt(OffsetDateTime.parse("2022-10-25T15:50:48.007Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .estimateAmount(3264d)
                    .id("845d0a3b-2948-474f-95a7-1e9cec8df95c")
                    .jobs(List.of(
                        DmsRepairorderJob.builder()
                            .actualHours(3.6)
                            .cause("Scheduled maintenance")
                            .complaint("Due for service")
                            .correction("Aufero cumque vicinus aptus assumenda quis aptus.")
                            .id("100b5bdd-404f-4741-8ea4-5e17b07b7a63")
                            .laborAmount(681.6)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("badac280-043b-48ff-a96f-8d808a1fa4ba")
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
                            .id("9396ba4a-2fed-4436-b80b-aa72229b0a57")
                            .laborAmount(446.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("a27eb09d-838f-4bdc-9e00-5c739df41151")
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
                                    .id("f29a28cc-9de8-40f0-9fd0-0f8063300687")
                                    .payType(DmsPartlinePayType.WARRANTY)
                                    .quantity(4d)
                                    .quantityOrdered(4d)
                                    .totalAmount(890.44)
                                    .unitPriceAmount(222.61)
                                    .build(),
                                DmsPartline.builder()
                                    .id("309c4a64-3997-4681-9a91-f8b4670727d9")
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
                            .id("c979d222-8c73-4fce-bace-ff4d38ba7acf")
                            .laborAmount(232.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("ae0314af-bbbd-46e8-9c99-afc7a5eb9ed7")
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
                                    .id("359b7527-73c2-43c0-a41b-9213acfba244")
                                    .payType(DmsPartlinePayType.CUSTOMER)
                                    .quantity(1d)
                                    .quantityOrdered(1d)
                                    .totalAmount(216.02)
                                    .unitPriceAmount(216.02)
                                    .build(),
                                DmsPartline.builder()
                                    .id("9e4fdbe0-c364-4b18-8280-acb19773d368")
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
                    .openedAt(OffsetDateTime.parse("2025-02-07T19:16:59.503Z"))
                    .partsAmount(1680.8000000000002)
                    .payType(DmsRepairorderPayType.WARRANTY)
                    .promisedAt(OffsetDateTime.parse("2025-02-09T03:16:59.503Z"))
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
                    .updatedAt(OffsetDateTime.parse("2025-11-27T22:10:43.171Z"))
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
                    .completedAt(OffsetDateTime.parse("2026-11-12T19:24:17.061Z"))
                    .createdAt(OffsetDateTime.parse("2022-10-25T15:50:48.007Z"))
                    .currency("USD")
                    .discountAmount(0d)
                    .estimateAmount(3264d)
                    .id("845d0a3b-2948-474f-95a7-1e9cec8df95c")
                    .jobs(List.of(
                        DmsRepairorderJob.builder()
                            .actualHours(3.6)
                            .cause("Scheduled maintenance")
                            .complaint("Due for service")
                            .correction("Aufero cumque vicinus aptus assumenda quis aptus.")
                            .id("100b5bdd-404f-4741-8ea4-5e17b07b7a63")
                            .laborAmount(681.6)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("badac280-043b-48ff-a96f-8d808a1fa4ba")
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
                            .id("9396ba4a-2fed-4436-b80b-aa72229b0a57")
                            .laborAmount(446.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("a27eb09d-838f-4bdc-9e00-5c739df41151")
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
                                    .id("f29a28cc-9de8-40f0-9fd0-0f8063300687")
                                    .payType(DmsPartlinePayType.WARRANTY)
                                    .quantity(4d)
                                    .quantityOrdered(4d)
                                    .totalAmount(890.44)
                                    .unitPriceAmount(222.61)
                                    .build(),
                                DmsPartline.builder()
                                    .id("309c4a64-3997-4681-9a91-f8b4670727d9")
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
                            .id("c979d222-8c73-4fce-bace-ff4d38ba7acf")
                            .laborAmount(232.4)
                            .labors(List.of(
                                DmsRepairorderLabor.builder()
                                    .id("ae0314af-bbbd-46e8-9c99-afc7a5eb9ed7")
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
                                    .id("359b7527-73c2-43c0-a41b-9213acfba244")
                                    .payType(DmsPartlinePayType.CUSTOMER)
                                    .quantity(1d)
                                    .quantityOrdered(1d)
                                    .totalAmount(216.02)
                                    .unitPriceAmount(216.02)
                                    .build(),
                                DmsPartline.builder()
                                    .id("9e4fdbe0-c364-4b18-8280-acb19773d368")
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
                    .openedAt(OffsetDateTime.parse("2025-02-07T19:16:59.503Z"))
                    .partsAmount(1680.8000000000002)
                    .payType(DmsRepairorderPayType.WARRANTY)
                    .promisedAt(OffsetDateTime.parse("2025-02-09T03:16:59.503Z"))
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
                    .updatedAt(OffsetDateTime.parse("2025-11-27T22:10:43.171Z"))
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