# Dms

## Overview

### Available Operations

* [createDmsAppointment](#createdmsappointment) - Create an appointment
* [createDmsOpcode](#createdmsopcode) - Create an opcode
* [createDmsPart](#createdmspart) - Create a part
* [createDmsPartsale](#createdmspartsale) - Create a partsale
* [createDmsRepairorder](#createdmsrepairorder) - Create a repairorder
* [createDmsVehicle](#createdmsvehicle) - Create a vehicle
* [createDmsVehiclesale](#createdmsvehiclesale) - Create a vehiclesale
* [getDmsAppointment](#getdmsappointment) - Retrieve an appointment
* [getDmsOpcode](#getdmsopcode) - Retrieve an opcode
* [getDmsPart](#getdmspart) - Retrieve a part
* [getDmsPartsale](#getdmspartsale) - Retrieve a partsale
* [getDmsRepairorder](#getdmsrepairorder) - Retrieve a repairorder
* [getDmsVehicle](#getdmsvehicle) - Retrieve a vehicle
* [getDmsVehiclesale](#getdmsvehiclesale) - Retrieve a vehiclesale
* [listDmsAppointments](#listdmsappointments) - List all appointments
* [listDmsOpcodes](#listdmsopcodes) - List all opcodes
* [listDmsParts](#listdmsparts) - List all parts
* [listDmsPartsales](#listdmspartsales) - List all partsales
* [listDmsRepairorders](#listdmsrepairorders) - List all repairorders
* [listDmsVehicles](#listdmsvehicles) - List all vehicles
* [listDmsVehiclesales](#listdmsvehiclesales) - List all vehiclesales
* [patchDmsAppointment](#patchdmsappointment) - Update an appointment
* [patchDmsOpcode](#patchdmsopcode) - Update an opcode
* [patchDmsPart](#patchdmspart) - Update a part
* [patchDmsPartsale](#patchdmspartsale) - Update a partsale
* [patchDmsRepairorder](#patchdmsrepairorder) - Update a repairorder
* [patchDmsVehicle](#patchdmsvehicle) - Update a vehicle
* [patchDmsVehiclesale](#patchdmsvehiclesale) - Update a vehiclesale
* [removeDmsAppointment](#removedmsappointment) - Remove an appointment
* [updateDmsAppointment](#updatedmsappointment) - Update an appointment
* [updateDmsOpcode](#updatedmsopcode) - Update an opcode
* [updateDmsPart](#updatedmspart) - Update a part
* [updateDmsPartsale](#updatedmspartsale) - Update a partsale
* [updateDmsRepairorder](#updatedmsrepairorder) - Update a repairorder
* [updateDmsVehicle](#updatedmsvehicle) - Update a vehicle
* [updateDmsVehiclesale](#updatedmsvehiclesale) - Update a vehiclesale

## createDmsAppointment

Creates a DmsAppointment. Provide the unified DmsAppointment fields in the request body; they are mapped to the provider's API. Returns the created DmsAppointment.

### Example Usage

<!-- UsageSnippet language="java" operationID="createDmsAppointment" method="post" path="/dms/{connection_id}/appointment" example="dms_appointment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDmsAppointmentRequest;
import to.unified.unified_java_sdk.models.operations.CreateDmsAppointmentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDmsAppointmentRequest req = CreateDmsAppointmentRequest.builder()
                .dmsAppointment(DmsAppointment.builder()
                    .createdAt(OffsetDateTime.parse("2023-10-16T02:56:45.127Z"))
                    .endAt(OffsetDateTime.parse("2026-05-08T02:41:53.672Z"))
                    .id("d6c8819f-7706-4575-8f69-fbf6c7f367a1")
                    .metadata(List.of())
                    .notes("Soluta conitor timidus confero.")
                    .number("A541909")
                    .services(List.of(
                        DmsAppointmentService.builder()
                            .id("2eca6ee0-3d95-414d-83d1-5a5cdb27360b")
                            .name("Customer concern")
                            .payType(PayType.WARRANTY)
                            .technicianUserIds(List.of())
                            .build(),
                        DmsAppointmentService.builder()
                            .complaint("Check engine light on")
                            .id("b432d998-e455-4472-973b-7e860f3677e5")
                            .name("Customer concern")
                            .payType(PayType.CUSTOMER)
                            .technicianUserIds(List.of())
                            .build(),
                        DmsAppointmentService.builder()
                            .complaint("Due for service")
                            .id("a02296da-58c1-494d-b5bc-caddc43906f2")
                            .name("Customer concern")
                            .payType(PayType.CUSTOMER)
                            .technicianUserIds(List.of())
                            .build()))
                    .startAt(OffsetDateTime.parse("2026-05-07T19:41:53.672Z"))
                    .status(DmsAppointmentStatus.CANCELLED)
                    .transportType(TransportType.LOANER)
                    .updatedAt(OffsetDateTime.parse("2025-04-06T16:31:30.890Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateDmsAppointmentResponse res = sdk.dms().createDmsAppointment()
                .request(req)
                .call();

        if (res.dmsAppointment().isPresent()) {
            System.out.println(res.dmsAppointment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateDmsAppointmentRequest](../../models/operations/CreateDmsAppointmentRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateDmsAppointmentResponse](../../models/operations/CreateDmsAppointmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createDmsOpcode

Creates a DmsOpcode. Provide the unified DmsOpcode fields in the request body; they are mapped to the provider's API. Returns the created DmsOpcode.

### Example Usage

<!-- UsageSnippet language="java" operationID="createDmsOpcode" method="post" path="/dms/{connection_id}/opcode" example="dms_opcode" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDmsOpcodeRequest;
import to.unified.unified_java_sdk.models.operations.CreateDmsOpcodeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDmsOpcodeRequest req = CreateDmsOpcodeRequest.builder()
                .dmsOpcode(DmsOpcode.builder()
                    .category("Electrical")
                    .code("02AUS")
                    .createdAt(OffsetDateTime.parse("2021-01-12T19:03:17.545Z"))
                    .currency("USD")
                    .description("Oil and filter change")
                    .estimatedHours(3.2)
                    .flatRateHours(3.5)
                    .id("9e975701-e465-47eb-9dae-2f610033be4f")
                    .isActive(true)
                    .laborRateAmount(216d)
                    .metadata(List.of())
                    .oemCode("05604A3")
                    .parts(List.of())
                    .payType(DmsOpcodePayType.CUSTOMER)
                    .skillCode("A")
                    .type(DmsOpcodeType.LABOR)
                    .updatedAt(OffsetDateTime.parse("2021-11-03T15:49:20.090Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateDmsOpcodeResponse res = sdk.dms().createDmsOpcode()
                .request(req)
                .call();

        if (res.dmsOpcode().isPresent()) {
            System.out.println(res.dmsOpcode().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateDmsOpcodeRequest](../../models/operations/CreateDmsOpcodeRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateDmsOpcodeResponse](../../models/operations/CreateDmsOpcodeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createDmsPart

Creates a DmsPart. Provide the unified DmsPart fields in the request body; they are mapped to the provider's API. Returns the created DmsPart.

### Example Usage

<!-- UsageSnippet language="java" operationID="createDmsPart" method="post" path="/dms/{connection_id}/part" example="dms_part" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDmsPartRequest;
import to.unified.unified_java_sdk.models.operations.CreateDmsPartResponse;
import to.unified.unified_java_sdk.models.shared.DmsPart;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDmsPartRequest req = CreateDmsPartRequest.builder()
                .dmsPart(DmsPart.builder()
                    .binLocations(List.of(
                        "S18-6"))
                    .category("Ignition")
                    .costAmount(25.26)
                    .createdAt(OffsetDateTime.parse("2020-07-02T08:18:03.858Z"))
                    .currency("USD")
                    .description("Cabin filter")
                    .id("74d63020-9f96-4197-b37d-8698d2aafb22")
                    .lastSoldAt(OffsetDateTime.parse("2020-11-23T04:33:23.296Z"))
                    .listPriceAmount(39.61)
                    .manufacturerCode("TOY")
                    .maxStockQuantity(21d)
                    .metadata(List.of())
                    .minStockQuantity(3d)
                    .packQuantity(1d)
                    .partNumber("73992-IM3FI")
                    .quantityAvailable(13d)
                    .quantityOnHand(15d)
                    .quantityOnOrder(14d)
                    .sourceCode("30")
                    .tradePriceAmount(29.05)
                    .updatedAt(OffsetDateTime.parse("2023-11-23T07:07:21.098Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateDmsPartResponse res = sdk.dms().createDmsPart()
                .request(req)
                .call();

        if (res.dmsPart().isPresent()) {
            System.out.println(res.dmsPart().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreateDmsPartRequest](../../models/operations/CreateDmsPartRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateDmsPartResponse](../../models/operations/CreateDmsPartResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateDmsPartsaleResponse res = sdk.dms().createDmsPartsale()
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

        CreateDmsRepairorderResponse res = sdk.dms().createDmsRepairorder()
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
                    .id("ae2d5da5-6181-4b92-9d93-7be429ece665")
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
                    .updatedAt(OffsetDateTime.parse("2023-11-03T13:51:45.381Z"))
                    .vin("C29ZDU474DDR70955")
                    .warrantyExpiresAt(OffsetDateTime.parse("2022-03-28T09:10:09.889Z"))
                    .year(2023d)
                    .build())
                .connectionId("<id>")
                .build();

        CreateDmsVehicleResponse res = sdk.dms().createDmsVehicle()
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
                        .firstPaymentAt(OffsetDateTime.parse("2022-08-16T11:37:29.878Z"))
                        .interestRate(6.68)
                        .lenderName("Mueller, Yundt and Murray Financial")
                        .paymentAmount(339d)
                        .paymentFrequency(PaymentFrequency.MONTHLY)
                        .termMonths(72d)
                        .build())
                    .financeType(FinanceType.FINANCE)
                    .id("b91e3f9c-0180-42c5-9d38-83e2362d9c50")
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
                    .soldAt(OffsetDateTime.parse("2022-08-14T20:21:55.591Z"))
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
                    .updatedAt(OffsetDateTime.parse("2025-04-16T21:53:33.456Z"))
                    .vehicles(List.of())
                    .build())
                .connectionId("<id>")
                .build();

        CreateDmsVehiclesaleResponse res = sdk.dms().createDmsVehiclesale()
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

## getDmsAppointment

Retrieves a single DmsAppointment by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getDmsAppointment" method="get" path="/dms/{connection_id}/appointment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetDmsAppointmentRequest;
import to.unified.unified_java_sdk.models.operations.GetDmsAppointmentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetDmsAppointmentRequest req = GetDmsAppointmentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetDmsAppointmentResponse res = sdk.dms().getDmsAppointment()
                .request(req)
                .call();

        if (res.dmsAppointment().isPresent()) {
            System.out.println(res.dmsAppointment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetDmsAppointmentRequest](../../models/operations/GetDmsAppointmentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetDmsAppointmentResponse](../../models/operations/GetDmsAppointmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDmsOpcode

Retrieves a single DmsOpcode by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getDmsOpcode" method="get" path="/dms/{connection_id}/opcode/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetDmsOpcodeRequest;
import to.unified.unified_java_sdk.models.operations.GetDmsOpcodeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetDmsOpcodeRequest req = GetDmsOpcodeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetDmsOpcodeResponse res = sdk.dms().getDmsOpcode()
                .request(req)
                .call();

        if (res.dmsOpcode().isPresent()) {
            System.out.println(res.dmsOpcode().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetDmsOpcodeRequest](../../models/operations/GetDmsOpcodeRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetDmsOpcodeResponse](../../models/operations/GetDmsOpcodeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDmsPart

Retrieves a single DmsPart by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getDmsPart" method="get" path="/dms/{connection_id}/part/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetDmsPartRequest;
import to.unified.unified_java_sdk.models.operations.GetDmsPartResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetDmsPartRequest req = GetDmsPartRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetDmsPartResponse res = sdk.dms().getDmsPart()
                .request(req)
                .call();

        if (res.dmsPart().isPresent()) {
            System.out.println(res.dmsPart().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetDmsPartRequest](../../models/operations/GetDmsPartRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetDmsPartResponse](../../models/operations/GetDmsPartResponse.md)**

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

        GetDmsPartsaleResponse res = sdk.dms().getDmsPartsale()
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

        GetDmsRepairorderResponse res = sdk.dms().getDmsRepairorder()
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

        GetDmsVehicleResponse res = sdk.dms().getDmsVehicle()
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

        GetDmsVehiclesaleResponse res = sdk.dms().getDmsVehiclesale()
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

## listDmsAppointments

Returns a list of DmsAppointments. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listDmsAppointments" method="get" path="/dms/{connection_id}/appointment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListDmsAppointmentsRequest;
import to.unified.unified_java_sdk.models.operations.ListDmsAppointmentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListDmsAppointmentsRequest req = ListDmsAppointmentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListDmsAppointmentsResponse res = sdk.dms().listDmsAppointments()
                .request(req)
                .call();

        if (res.dmsAppointments().isPresent()) {
            System.out.println(res.dmsAppointments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListDmsAppointmentsRequest](../../models/operations/ListDmsAppointmentsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListDmsAppointmentsResponse](../../models/operations/ListDmsAppointmentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listDmsOpcodes

Returns a list of DmsOpcodes. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listDmsOpcodes" method="get" path="/dms/{connection_id}/opcode" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListDmsOpcodesRequest;
import to.unified.unified_java_sdk.models.operations.ListDmsOpcodesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListDmsOpcodesRequest req = ListDmsOpcodesRequest.builder()
                .connectionId("<id>")
                .build();

        ListDmsOpcodesResponse res = sdk.dms().listDmsOpcodes()
                .request(req)
                .call();

        if (res.dmsOpcodes().isPresent()) {
            System.out.println(res.dmsOpcodes().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListDmsOpcodesRequest](../../models/operations/ListDmsOpcodesRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListDmsOpcodesResponse](../../models/operations/ListDmsOpcodesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listDmsParts

Returns a list of DmsParts. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listDmsParts" method="get" path="/dms/{connection_id}/part" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListDmsPartsRequest;
import to.unified.unified_java_sdk.models.operations.ListDmsPartsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListDmsPartsRequest req = ListDmsPartsRequest.builder()
                .connectionId("<id>")
                .build();

        ListDmsPartsResponse res = sdk.dms().listDmsParts()
                .request(req)
                .call();

        if (res.dmsParts().isPresent()) {
            System.out.println(res.dmsParts().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListDmsPartsRequest](../../models/operations/ListDmsPartsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListDmsPartsResponse](../../models/operations/ListDmsPartsResponse.md)**

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

        ListDmsPartsalesResponse res = sdk.dms().listDmsPartsales()
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

        ListDmsRepairordersResponse res = sdk.dms().listDmsRepairorders()
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

        ListDmsVehiclesResponse res = sdk.dms().listDmsVehicles()
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

        ListDmsVehiclesalesResponse res = sdk.dms().listDmsVehiclesales()
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

## patchDmsAppointment

Updates the DmsAppointment identified by `id`. Provide the unified DmsAppointment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchDmsAppointment" method="patch" path="/dms/{connection_id}/appointment/{id}" example="dms_appointment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchDmsAppointmentRequest;
import to.unified.unified_java_sdk.models.operations.PatchDmsAppointmentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchDmsAppointmentRequest req = PatchDmsAppointmentRequest.builder()
                .dmsAppointment(DmsAppointment.builder()
                    .createdAt(OffsetDateTime.parse("2023-10-16T02:56:45.127Z"))
                    .endAt(OffsetDateTime.parse("2026-05-08T02:41:53.686Z"))
                    .id("5a47c683-e8a4-4933-9119-d7ad05bcf24b")
                    .metadata(List.of())
                    .notes("Soluta conitor timidus confero.")
                    .number("A541909")
                    .services(List.of(
                        DmsAppointmentService.builder()
                            .id("bcc95f56-1ce6-486f-a905-540527e4e254")
                            .name("Customer concern")
                            .payType(PayType.WARRANTY)
                            .technicianUserIds(List.of())
                            .build(),
                        DmsAppointmentService.builder()
                            .complaint("Check engine light on")
                            .id("2d1d40f9-a6c0-40ae-b104-7717687702fa")
                            .name("Customer concern")
                            .payType(PayType.CUSTOMER)
                            .technicianUserIds(List.of())
                            .build(),
                        DmsAppointmentService.builder()
                            .complaint("Due for service")
                            .id("aa78fbfc-88be-4cd3-9cfb-4ec090bd3711")
                            .name("Customer concern")
                            .payType(PayType.CUSTOMER)
                            .technicianUserIds(List.of())
                            .build()))
                    .startAt(OffsetDateTime.parse("2026-05-07T19:41:53.686Z"))
                    .status(DmsAppointmentStatus.CANCELLED)
                    .transportType(TransportType.LOANER)
                    .updatedAt(OffsetDateTime.parse("2025-04-06T16:31:30.897Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDmsAppointmentResponse res = sdk.dms().patchDmsAppointment()
                .request(req)
                .call();

        if (res.dmsAppointment().isPresent()) {
            System.out.println(res.dmsAppointment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchDmsAppointmentRequest](../../models/operations/PatchDmsAppointmentRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchDmsAppointmentResponse](../../models/operations/PatchDmsAppointmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchDmsOpcode

Updates the DmsOpcode identified by `id`. Provide the unified DmsOpcode fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchDmsOpcode" method="patch" path="/dms/{connection_id}/opcode/{id}" example="dms_opcode" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchDmsOpcodeRequest;
import to.unified.unified_java_sdk.models.operations.PatchDmsOpcodeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchDmsOpcodeRequest req = PatchDmsOpcodeRequest.builder()
                .dmsOpcode(DmsOpcode.builder()
                    .category("Electrical")
                    .code("02AUS")
                    .createdAt(OffsetDateTime.parse("2021-01-12T19:03:17.545Z"))
                    .currency("USD")
                    .description("Oil and filter change")
                    .estimatedHours(3.2)
                    .flatRateHours(3.5)
                    .id("02963f4e-2712-4766-aacf-ea6459458bb1")
                    .isActive(true)
                    .laborRateAmount(216d)
                    .metadata(List.of())
                    .oemCode("05604A3")
                    .parts(List.of())
                    .payType(DmsOpcodePayType.CUSTOMER)
                    .skillCode("A")
                    .type(DmsOpcodeType.LABOR)
                    .updatedAt(OffsetDateTime.parse("2021-11-03T15:49:20.093Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDmsOpcodeResponse res = sdk.dms().patchDmsOpcode()
                .request(req)
                .call();

        if (res.dmsOpcode().isPresent()) {
            System.out.println(res.dmsOpcode().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchDmsOpcodeRequest](../../models/operations/PatchDmsOpcodeRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchDmsOpcodeResponse](../../models/operations/PatchDmsOpcodeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchDmsPart

Updates the DmsPart identified by `id`. Provide the unified DmsPart fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchDmsPart" method="patch" path="/dms/{connection_id}/part/{id}" example="dms_part" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchDmsPartRequest;
import to.unified.unified_java_sdk.models.operations.PatchDmsPartResponse;
import to.unified.unified_java_sdk.models.shared.DmsPart;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchDmsPartRequest req = PatchDmsPartRequest.builder()
                .dmsPart(DmsPart.builder()
                    .binLocations(List.of(
                        "S18-6"))
                    .category("Ignition")
                    .costAmount(25.26)
                    .createdAt(OffsetDateTime.parse("2020-07-02T08:18:03.858Z"))
                    .currency("USD")
                    .description("Cabin filter")
                    .id("97295eb5-60e5-43fb-92e3-c5b73a2000cd")
                    .lastSoldAt(OffsetDateTime.parse("2020-11-23T04:33:23.297Z"))
                    .listPriceAmount(39.61)
                    .manufacturerCode("TOY")
                    .maxStockQuantity(21d)
                    .metadata(List.of())
                    .minStockQuantity(3d)
                    .packQuantity(1d)
                    .partNumber("73992-IM3FI")
                    .quantityAvailable(13d)
                    .quantityOnHand(15d)
                    .quantityOnOrder(14d)
                    .sourceCode("30")
                    .tradePriceAmount(29.05)
                    .updatedAt(OffsetDateTime.parse("2023-11-23T07:07:21.106Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDmsPartResponse res = sdk.dms().patchDmsPart()
                .request(req)
                .call();

        if (res.dmsPart().isPresent()) {
            System.out.println(res.dmsPart().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [PatchDmsPartRequest](../../models/operations/PatchDmsPartRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PatchDmsPartResponse](../../models/operations/PatchDmsPartResponse.md)**

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

        PatchDmsPartsaleResponse res = sdk.dms().patchDmsPartsale()
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

        PatchDmsRepairorderResponse res = sdk.dms().patchDmsRepairorder()
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
                    .id("efdfb740-0c86-4c38-aa92-d8d17f8d20b4")
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
                    .updatedAt(OffsetDateTime.parse("2023-11-03T13:51:45.393Z"))
                    .vin("C29ZDU474DDR70955")
                    .warrantyExpiresAt(OffsetDateTime.parse("2022-03-28T09:10:09.889Z"))
                    .year(2023d)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDmsVehicleResponse res = sdk.dms().patchDmsVehicle()
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
                        .firstPaymentAt(OffsetDateTime.parse("2022-08-16T11:37:29.897Z"))
                        .interestRate(6.68)
                        .lenderName("Mueller, Yundt and Murray Financial")
                        .paymentAmount(339d)
                        .paymentFrequency(PaymentFrequency.MONTHLY)
                        .termMonths(72d)
                        .build())
                    .financeType(FinanceType.FINANCE)
                    .id("3f89399e-041f-4ed9-a414-18674421f1b5")
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
                    .soldAt(OffsetDateTime.parse("2022-08-14T20:21:55.610Z"))
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
                    .updatedAt(OffsetDateTime.parse("2025-04-16T21:53:33.496Z"))
                    .vehicles(List.of())
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchDmsVehiclesaleResponse res = sdk.dms().patchDmsVehiclesale()
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

## removeDmsAppointment

Deletes the DmsAppointment identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeDmsAppointment" method="delete" path="/dms/{connection_id}/appointment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveDmsAppointmentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveDmsAppointmentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveDmsAppointmentRequest req = RemoveDmsAppointmentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveDmsAppointmentResponse res = sdk.dms().removeDmsAppointment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveDmsAppointmentRequest](../../models/operations/RemoveDmsAppointmentRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveDmsAppointmentResponse](../../models/operations/RemoveDmsAppointmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateDmsAppointment

Updates the DmsAppointment identified by `id`. Provide the unified DmsAppointment fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateDmsAppointment" method="put" path="/dms/{connection_id}/appointment/{id}" example="dms_appointment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateDmsAppointmentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateDmsAppointmentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateDmsAppointmentRequest req = UpdateDmsAppointmentRequest.builder()
                .dmsAppointment(DmsAppointment.builder()
                    .createdAt(OffsetDateTime.parse("2023-10-16T02:56:45.127Z"))
                    .endAt(OffsetDateTime.parse("2026-05-08T02:41:53.686Z"))
                    .id("5a47c683-e8a4-4933-9119-d7ad05bcf24b")
                    .metadata(List.of())
                    .notes("Soluta conitor timidus confero.")
                    .number("A541909")
                    .services(List.of(
                        DmsAppointmentService.builder()
                            .id("bcc95f56-1ce6-486f-a905-540527e4e254")
                            .name("Customer concern")
                            .payType(PayType.WARRANTY)
                            .technicianUserIds(List.of())
                            .build(),
                        DmsAppointmentService.builder()
                            .complaint("Check engine light on")
                            .id("2d1d40f9-a6c0-40ae-b104-7717687702fa")
                            .name("Customer concern")
                            .payType(PayType.CUSTOMER)
                            .technicianUserIds(List.of())
                            .build(),
                        DmsAppointmentService.builder()
                            .complaint("Due for service")
                            .id("aa78fbfc-88be-4cd3-9cfb-4ec090bd3711")
                            .name("Customer concern")
                            .payType(PayType.CUSTOMER)
                            .technicianUserIds(List.of())
                            .build()))
                    .startAt(OffsetDateTime.parse("2026-05-07T19:41:53.686Z"))
                    .status(DmsAppointmentStatus.CANCELLED)
                    .transportType(TransportType.LOANER)
                    .updatedAt(OffsetDateTime.parse("2025-04-06T16:31:30.897Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDmsAppointmentResponse res = sdk.dms().updateDmsAppointment()
                .request(req)
                .call();

        if (res.dmsAppointment().isPresent()) {
            System.out.println(res.dmsAppointment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateDmsAppointmentRequest](../../models/operations/UpdateDmsAppointmentRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateDmsAppointmentResponse](../../models/operations/UpdateDmsAppointmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateDmsOpcode

Updates the DmsOpcode identified by `id`. Provide the unified DmsOpcode fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateDmsOpcode" method="put" path="/dms/{connection_id}/opcode/{id}" example="dms_opcode" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateDmsOpcodeRequest;
import to.unified.unified_java_sdk.models.operations.UpdateDmsOpcodeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateDmsOpcodeRequest req = UpdateDmsOpcodeRequest.builder()
                .dmsOpcode(DmsOpcode.builder()
                    .category("Electrical")
                    .code("02AUS")
                    .createdAt(OffsetDateTime.parse("2021-01-12T19:03:17.545Z"))
                    .currency("USD")
                    .description("Oil and filter change")
                    .estimatedHours(3.2)
                    .flatRateHours(3.5)
                    .id("02963f4e-2712-4766-aacf-ea6459458bb1")
                    .isActive(true)
                    .laborRateAmount(216d)
                    .metadata(List.of())
                    .oemCode("05604A3")
                    .parts(List.of())
                    .payType(DmsOpcodePayType.CUSTOMER)
                    .skillCode("A")
                    .type(DmsOpcodeType.LABOR)
                    .updatedAt(OffsetDateTime.parse("2021-11-03T15:49:20.093Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDmsOpcodeResponse res = sdk.dms().updateDmsOpcode()
                .request(req)
                .call();

        if (res.dmsOpcode().isPresent()) {
            System.out.println(res.dmsOpcode().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateDmsOpcodeRequest](../../models/operations/UpdateDmsOpcodeRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateDmsOpcodeResponse](../../models/operations/UpdateDmsOpcodeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateDmsPart

Updates the DmsPart identified by `id`. Provide the unified DmsPart fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateDmsPart" method="put" path="/dms/{connection_id}/part/{id}" example="dms_part" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateDmsPartRequest;
import to.unified.unified_java_sdk.models.operations.UpdateDmsPartResponse;
import to.unified.unified_java_sdk.models.shared.DmsPart;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateDmsPartRequest req = UpdateDmsPartRequest.builder()
                .dmsPart(DmsPart.builder()
                    .binLocations(List.of(
                        "S18-6"))
                    .category("Ignition")
                    .costAmount(25.26)
                    .createdAt(OffsetDateTime.parse("2020-07-02T08:18:03.858Z"))
                    .currency("USD")
                    .description("Cabin filter")
                    .id("97295eb5-60e5-43fb-92e3-c5b73a2000cd")
                    .lastSoldAt(OffsetDateTime.parse("2020-11-23T04:33:23.297Z"))
                    .listPriceAmount(39.61)
                    .manufacturerCode("TOY")
                    .maxStockQuantity(21d)
                    .metadata(List.of())
                    .minStockQuantity(3d)
                    .packQuantity(1d)
                    .partNumber("73992-IM3FI")
                    .quantityAvailable(13d)
                    .quantityOnHand(15d)
                    .quantityOnOrder(14d)
                    .sourceCode("30")
                    .tradePriceAmount(29.05)
                    .updatedAt(OffsetDateTime.parse("2023-11-23T07:07:21.106Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDmsPartResponse res = sdk.dms().updateDmsPart()
                .request(req)
                .call();

        if (res.dmsPart().isPresent()) {
            System.out.println(res.dmsPart().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdateDmsPartRequest](../../models/operations/UpdateDmsPartRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdateDmsPartResponse](../../models/operations/UpdateDmsPartResponse.md)**

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

        UpdateDmsPartsaleResponse res = sdk.dms().updateDmsPartsale()
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

        UpdateDmsRepairorderResponse res = sdk.dms().updateDmsRepairorder()
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
                    .id("efdfb740-0c86-4c38-aa92-d8d17f8d20b4")
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
                    .updatedAt(OffsetDateTime.parse("2023-11-03T13:51:45.393Z"))
                    .vin("C29ZDU474DDR70955")
                    .warrantyExpiresAt(OffsetDateTime.parse("2022-03-28T09:10:09.889Z"))
                    .year(2023d)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDmsVehicleResponse res = sdk.dms().updateDmsVehicle()
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
                        .firstPaymentAt(OffsetDateTime.parse("2022-08-16T11:37:29.897Z"))
                        .interestRate(6.68)
                        .lenderName("Mueller, Yundt and Murray Financial")
                        .paymentAmount(339d)
                        .paymentFrequency(PaymentFrequency.MONTHLY)
                        .termMonths(72d)
                        .build())
                    .financeType(FinanceType.FINANCE)
                    .id("3f89399e-041f-4ed9-a414-18674421f1b5")
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
                    .soldAt(OffsetDateTime.parse("2022-08-14T20:21:55.610Z"))
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
                    .updatedAt(OffsetDateTime.parse("2025-04-16T21:53:33.496Z"))
                    .vehicles(List.of())
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateDmsVehiclesaleResponse res = sdk.dms().updateDmsVehiclesale()
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