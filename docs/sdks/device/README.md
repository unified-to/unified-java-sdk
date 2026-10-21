# Device

## Overview

### Available Operations

* [createHrisDevice](#createhrisdevice) - Create a device
* [getHrisDevice](#gethrisdevice) - Retrieve a device
* [listHrisDevices](#listhrisdevices) - List all devices
* [patchHrisDevice](#patchhrisdevice) - Update a device
* [removeHrisDevice](#removehrisdevice) - Remove a device
* [updateHrisDevice](#updatehrisdevice) - Update a device

## createHrisDevice

Create a device

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisDevice" method="post" path="/hris/{connection_id}/device" example="hris_device" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisDeviceRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisDeviceResponse;
import to.unified.unified_java_sdk.models.shared.HrisDevice;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisDeviceRequest req = CreateHrisDeviceRequest.builder()
                .hrisDevice(HrisDevice.builder()
                    .adminUserIds(List.of())
                    .assetTag("fJNacaaoWi")
                    .createdAt(OffsetDateTime.parse("2019-04-04T17:11:40.322Z"))
                    .hasAntivirus(true)
                    .hasFirewall(true)
                    .hasHdEncrypted(true)
                    .hasPasswordManager(true)
                    .hasScreenlock(false)
                    .id("49b5d703-8a3e-4737-b1bc-7a3fdcf1605c")
                    .isMissing(false)
                    .manufacturer("Hackett Inc")
                    .metadata(List.of())
                    .model("Fantastic")
                    .name("august-laptop")
                    .os("transmitter")
                    .osVersion("8.4.8")
                    .updatedAt(OffsetDateTime.parse("2023-06-08T07:22:04.617Z"))
                    .version("4.15.7")
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisDeviceResponse res = sdk.device().createHrisDevice()
                .request(req)
                .call();

        if (res.hrisDevice().isPresent()) {
            System.out.println(res.hrisDevice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateHrisDeviceRequest](../../models/operations/CreateHrisDeviceRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateHrisDeviceResponse](../../models/operations/CreateHrisDeviceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisDevice

Retrieve a device

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisDevice" method="get" path="/hris/{connection_id}/device/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisDeviceRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisDeviceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisDeviceRequest req = GetHrisDeviceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisDeviceResponse res = sdk.device().getHrisDevice()
                .request(req)
                .call();

        if (res.hrisDevice().isPresent()) {
            System.out.println(res.hrisDevice().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetHrisDeviceRequest](../../models/operations/GetHrisDeviceRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetHrisDeviceResponse](../../models/operations/GetHrisDeviceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisDevices

List all devices

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisDevices" method="get" path="/hris/{connection_id}/device" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisDevicesRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisDevicesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisDevicesRequest req = ListHrisDevicesRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisDevicesResponse res = sdk.device().listHrisDevices()
                .request(req)
                .call();

        if (res.hrisDevices().isPresent()) {
            System.out.println(res.hrisDevices().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListHrisDevicesRequest](../../models/operations/ListHrisDevicesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListHrisDevicesResponse](../../models/operations/ListHrisDevicesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisDevice

Update a device

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisDevice" method="patch" path="/hris/{connection_id}/device/{id}" example="hris_device" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisDeviceRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisDeviceResponse;
import to.unified.unified_java_sdk.models.shared.HrisDevice;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisDeviceRequest req = PatchHrisDeviceRequest.builder()
                .hrisDevice(HrisDevice.builder()
                    .adminUserIds(List.of())
                    .assetTag("fJNacaaoWi")
                    .createdAt(OffsetDateTime.parse("2019-04-04T17:11:40.322Z"))
                    .hasAntivirus(true)
                    .hasFirewall(true)
                    .hasHdEncrypted(true)
                    .hasPasswordManager(true)
                    .hasScreenlock(false)
                    .id("daf3d5af-82dc-4e79-8fca-d45df35f91e5")
                    .isMissing(false)
                    .manufacturer("Hackett Inc")
                    .metadata(List.of())
                    .model("Fantastic")
                    .name("august-laptop")
                    .os("transmitter")
                    .osVersion("8.4.8")
                    .updatedAt(OffsetDateTime.parse("2023-06-08T07:22:04.626Z"))
                    .version("4.15.7")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisDeviceResponse res = sdk.device().patchHrisDevice()
                .request(req)
                .call();

        if (res.hrisDevice().isPresent()) {
            System.out.println(res.hrisDevice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchHrisDeviceRequest](../../models/operations/PatchHrisDeviceRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchHrisDeviceResponse](../../models/operations/PatchHrisDeviceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisDevice

Remove a device

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisDevice" method="delete" path="/hris/{connection_id}/device/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDeviceRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDeviceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisDeviceRequest req = RemoveHrisDeviceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisDeviceResponse res = sdk.device().removeHrisDevice()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveHrisDeviceRequest](../../models/operations/RemoveHrisDeviceRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveHrisDeviceResponse](../../models/operations/RemoveHrisDeviceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisDevice

Update a device

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisDevice" method="put" path="/hris/{connection_id}/device/{id}" example="hris_device" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDeviceRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDeviceResponse;
import to.unified.unified_java_sdk.models.shared.HrisDevice;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisDeviceRequest req = UpdateHrisDeviceRequest.builder()
                .hrisDevice(HrisDevice.builder()
                    .adminUserIds(List.of())
                    .assetTag("fJNacaaoWi")
                    .createdAt(OffsetDateTime.parse("2019-04-04T17:11:40.322Z"))
                    .hasAntivirus(true)
                    .hasFirewall(true)
                    .hasHdEncrypted(true)
                    .hasPasswordManager(true)
                    .hasScreenlock(false)
                    .id("daf3d5af-82dc-4e79-8fca-d45df35f91e5")
                    .isMissing(false)
                    .manufacturer("Hackett Inc")
                    .metadata(List.of())
                    .model("Fantastic")
                    .name("august-laptop")
                    .os("transmitter")
                    .osVersion("8.4.8")
                    .updatedAt(OffsetDateTime.parse("2023-06-08T07:22:04.626Z"))
                    .version("4.15.7")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisDeviceResponse res = sdk.device().updateHrisDevice()
                .request(req)
                .call();

        if (res.hrisDevice().isPresent()) {
            System.out.println(res.hrisDevice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateHrisDeviceRequest](../../models/operations/UpdateHrisDeviceRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateHrisDeviceResponse](../../models/operations/UpdateHrisDeviceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |