# Opcode

## Overview

### Available Operations

* [createDmsOpcode](#createdmsopcode) - Create an opcode
* [getDmsOpcode](#getdmsopcode) - Retrieve an opcode
* [listDmsOpcodes](#listdmsopcodes) - List all opcodes
* [patchDmsOpcode](#patchdmsopcode) - Update an opcode
* [updateDmsOpcode](#updatedmsopcode) - Update an opcode

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

        CreateDmsOpcodeResponse res = sdk.opcode().createDmsOpcode()
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

        GetDmsOpcodeResponse res = sdk.opcode().getDmsOpcode()
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

        ListDmsOpcodesResponse res = sdk.opcode().listDmsOpcodes()
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

        PatchDmsOpcodeResponse res = sdk.opcode().patchDmsOpcode()
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

        UpdateDmsOpcodeResponse res = sdk.opcode().updateDmsOpcode()
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