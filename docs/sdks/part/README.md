# Part

## Overview

### Available Operations

* [createPlmPart](#createplmpart) - Create a part
* [getPlmPart](#getplmpart) - Retrieve a part
* [listPlmParts](#listplmparts) - List all parts
* [patchPlmPart](#patchplmpart) - Update a part
* [updatePlmPart](#updateplmpart) - Update a part

## createPlmPart

Creates a PlmPart. Provide the unified PlmPart fields in the request body; they are mapped to the provider's API. Returns the created PlmPart.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPlmPart" method="post" path="/plm/{connection_id}/part" example="plm_part" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePlmPartRequest;
import to.unified.unified_java_sdk.models.operations.CreatePlmPartResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePlmPartRequest req = CreatePlmPartRequest.builder()
                .plmPart(PlmPart.builder()
                    .createdAt(OffsetDateTime.parse("2019-04-13T06:25:34.770Z"))
                    .description("Pectus tero ulterius aestivus talis tero ullam cruciamentum.")
                    .documentIds(List.of())
                    .fileIds(List.of())
                    .id("9826ab13-7246-4724-b919-35e6cb296834")
                    .isAssembly(false)
                    .lifecycleState("Design")
                    .masterIdentifier("a35a0847-50d1-4001-8c10-6075f018542a")
                    .metadata(List.of())
                    .name("grumpy PCB")
                    .number("PRT-009154")
                    .originalType("Software")
                    .revision("B")
                    .source(Source.MAKE)
                    .status(PlmPartStatus.IN_WORK)
                    .type(PlmPartType.SOFTWARE)
                    .unitOfMeasure("EA")
                    .updatedAt(OffsetDateTime.parse("2021-04-11T09:05:55.487Z"))
                    .url("https://inborn-independence.info")
                    .build())
                .connectionId("<id>")
                .build();

        CreatePlmPartResponse res = sdk.part().createPlmPart()
                .request(req)
                .call();

        if (res.plmPart().isPresent()) {
            System.out.println(res.plmPart().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreatePlmPartRequest](../../models/operations/CreatePlmPartRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreatePlmPartResponse](../../models/operations/CreatePlmPartResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPlmPart

Retrieves a single PlmPart by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPlmPart" method="get" path="/plm/{connection_id}/part/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPlmPartRequest;
import to.unified.unified_java_sdk.models.operations.GetPlmPartResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPlmPartRequest req = GetPlmPartRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPlmPartResponse res = sdk.part().getPlmPart()
                .request(req)
                .call();

        if (res.plmPart().isPresent()) {
            System.out.println(res.plmPart().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetPlmPartRequest](../../models/operations/GetPlmPartRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetPlmPartResponse](../../models/operations/GetPlmPartResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPlmParts

Returns a list of PlmParts. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPlmParts" method="get" path="/plm/{connection_id}/part" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPlmPartsRequest;
import to.unified.unified_java_sdk.models.operations.ListPlmPartsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPlmPartsRequest req = ListPlmPartsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPlmPartsResponse res = sdk.part().listPlmParts()
                .request(req)
                .call();

        if (res.plmParts().isPresent()) {
            System.out.println(res.plmParts().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListPlmPartsRequest](../../models/operations/ListPlmPartsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListPlmPartsResponse](../../models/operations/ListPlmPartsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPlmPart

Updates the PlmPart identified by `id`. Provide the unified PlmPart fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPlmPart" method="patch" path="/plm/{connection_id}/part/{id}" example="plm_part" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPlmPartRequest;
import to.unified.unified_java_sdk.models.operations.PatchPlmPartResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPlmPartRequest req = PatchPlmPartRequest.builder()
                .plmPart(PlmPart.builder()
                    .createdAt(OffsetDateTime.parse("2019-04-13T06:25:34.770Z"))
                    .description("Pectus tero ulterius aestivus talis tero ullam cruciamentum.")
                    .documentIds(List.of())
                    .fileIds(List.of())
                    .id("b569fbd7-4a27-406f-b427-06f32f7c23bf")
                    .isAssembly(false)
                    .lifecycleState("Design")
                    .masterIdentifier("54af9d15-c559-422a-9b1c-d5fc32d89644")
                    .metadata(List.of())
                    .name("grumpy PCB")
                    .number("PRT-009154")
                    .originalType("Software")
                    .revision("B")
                    .source(Source.MAKE)
                    .status(PlmPartStatus.IN_WORK)
                    .type(PlmPartType.SOFTWARE)
                    .unitOfMeasure("EA")
                    .updatedAt(OffsetDateTime.parse("2021-04-11T09:05:55.490Z"))
                    .url("https://inborn-independence.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPlmPartResponse res = sdk.part().patchPlmPart()
                .request(req)
                .call();

        if (res.plmPart().isPresent()) {
            System.out.println(res.plmPart().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [PatchPlmPartRequest](../../models/operations/PatchPlmPartRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PatchPlmPartResponse](../../models/operations/PatchPlmPartResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePlmPart

Updates the PlmPart identified by `id`. Provide the unified PlmPart fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePlmPart" method="put" path="/plm/{connection_id}/part/{id}" example="plm_part" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePlmPartRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePlmPartResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePlmPartRequest req = UpdatePlmPartRequest.builder()
                .plmPart(PlmPart.builder()
                    .createdAt(OffsetDateTime.parse("2019-04-13T06:25:34.770Z"))
                    .description("Pectus tero ulterius aestivus talis tero ullam cruciamentum.")
                    .documentIds(List.of())
                    .fileIds(List.of())
                    .id("b569fbd7-4a27-406f-b427-06f32f7c23bf")
                    .isAssembly(false)
                    .lifecycleState("Design")
                    .masterIdentifier("54af9d15-c559-422a-9b1c-d5fc32d89644")
                    .metadata(List.of())
                    .name("grumpy PCB")
                    .number("PRT-009154")
                    .originalType("Software")
                    .revision("B")
                    .source(Source.MAKE)
                    .status(PlmPartStatus.IN_WORK)
                    .type(PlmPartType.SOFTWARE)
                    .unitOfMeasure("EA")
                    .updatedAt(OffsetDateTime.parse("2021-04-11T09:05:55.490Z"))
                    .url("https://inborn-independence.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePlmPartResponse res = sdk.part().updatePlmPart()
                .request(req)
                .call();

        if (res.plmPart().isPresent()) {
            System.out.println(res.plmPart().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdatePlmPartRequest](../../models/operations/UpdatePlmPartRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdatePlmPartResponse](../../models/operations/UpdatePlmPartResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |