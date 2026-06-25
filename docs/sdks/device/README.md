# Device

## Overview

### Available Operations

* [createHrisDevice2](#createhrisdevice2) - Create a device
* [getHrisDevice2](#gethrisdevice2) - Retrieve a device
* [listHrisDevices2](#listhrisdevices2) - List all devices
* [patchHrisDevice2](#patchhrisdevice2) - Update a device
* [removeHrisDevice2](#removehrisdevice2) - Remove a device
* [updateHrisDevice2](#updatehrisdevice2) - Update a device

## createHrisDevice2

Create a device

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisDevice2" method="post" path="/hris/{connection_id}/device" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisDevice2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisDevice2Response;
import to.unified.unified_java_sdk.models.shared.HrisDevice;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisDevice2Request req = CreateHrisDevice2Request.builder()
                .hrisDevice(HrisDevice.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisDevice2Response res = sdk.device().createHrisDevice2()
                .request(req)
                .call();

        if (res.hrisDevice().isPresent()) {
            System.out.println(res.hrisDevice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateHrisDevice2Request](../../models/operations/CreateHrisDevice2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateHrisDevice2Response](../../models/operations/CreateHrisDevice2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisDevice2

Retrieve a device

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisDevice2" method="get" path="/hris/{connection_id}/device/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisDevice2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisDevice2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisDevice2Request req = GetHrisDevice2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisDevice2Response res = sdk.device().getHrisDevice2()
                .request(req)
                .call();

        if (res.hrisDevice().isPresent()) {
            System.out.println(res.hrisDevice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHrisDevice2Request](../../models/operations/GetHrisDevice2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHrisDevice2Response](../../models/operations/GetHrisDevice2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisDevices2

List all devices

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisDevices2" method="get" path="/hris/{connection_id}/device" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisDevices2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisDevices2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisDevices2Request req = ListHrisDevices2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisDevices2Response res = sdk.device().listHrisDevices2()
                .request(req)
                .call();

        if (res.hrisDevices().isPresent()) {
            System.out.println(res.hrisDevices().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListHrisDevices2Request](../../models/operations/ListHrisDevices2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListHrisDevices2Response](../../models/operations/ListHrisDevices2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisDevice2

Update a device

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisDevice2" method="patch" path="/hris/{connection_id}/device/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisDevice2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisDevice2Response;
import to.unified.unified_java_sdk.models.shared.HrisDevice;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisDevice2Request req = PatchHrisDevice2Request.builder()
                .hrisDevice(HrisDevice.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisDevice2Response res = sdk.device().patchHrisDevice2()
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
| `request`                                                                     | [PatchHrisDevice2Request](../../models/operations/PatchHrisDevice2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchHrisDevice2Response](../../models/operations/PatchHrisDevice2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisDevice2

Remove a device

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisDevice2" method="delete" path="/hris/{connection_id}/device/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDevice2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDevice2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisDevice2Request req = RemoveHrisDevice2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisDevice2Response res = sdk.device().removeHrisDevice2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveHrisDevice2Request](../../models/operations/RemoveHrisDevice2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveHrisDevice2Response](../../models/operations/RemoveHrisDevice2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisDevice2

Update a device

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisDevice2" method="put" path="/hris/{connection_id}/device/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDevice2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDevice2Response;
import to.unified.unified_java_sdk.models.shared.HrisDevice;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisDevice2Request req = UpdateHrisDevice2Request.builder()
                .hrisDevice(HrisDevice.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisDevice2Response res = sdk.device().updateHrisDevice2()
                .request(req)
                .call();

        if (res.hrisDevice().isPresent()) {
            System.out.println(res.hrisDevice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateHrisDevice2Request](../../models/operations/UpdateHrisDevice2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateHrisDevice2Response](../../models/operations/UpdateHrisDevice2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |