# Part

## Overview

### Available Operations

* [createDmsPart](#createdmspart) - Create a part
* [createPlmPart](#createplmpart) - Create a part
* [getDmsPart](#getdmspart) - Retrieve a part
* [getPlmPart](#getplmpart) - Retrieve a part
* [listDmsParts](#listdmsparts) - List all parts
* [listPlmParts](#listplmparts) - List all parts
* [patchDmsPart](#patchdmspart) - Update a part
* [patchPlmPart](#patchplmpart) - Update a part
* [removePlmPart](#removeplmpart) - Remove a part
* [updateDmsPart](#updatedmspart) - Update a part
* [updatePlmPart](#updateplmpart) - Update a part

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

        CreateDmsPartResponse res = sdk.part().createDmsPart()
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
                    .description("Aestivus talis tero ullam cruciamentum voluptatibus cumque degusto cui.")
                    .documentIds(List.of())
                    .fileIds(List.of())
                    .id("635c371d-e21e-48ff-8f74-45d87a0a4377")
                    .isAssembly(false)
                    .lifecycleState("Design")
                    .masterIdentifier("53497781-ad27-42f0-97b5-6b4d27f149b3")
                    .metadata(List.of())
                    .name("speedy PCB")
                    .number("PRT-009154")
                    .originalType("Software")
                    .revision("B")
                    .source(Source.MAKE)
                    .status(PlmPartStatus.IN_WORK)
                    .type(PlmPartType.SOFTWARE)
                    .unitOfMeasure("EA")
                    .updatedAt(OffsetDateTime.parse("2021-04-15T20:33:23.707Z"))
                    .url("https://digital-pop.com")
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

        GetDmsPartResponse res = sdk.part().getDmsPart()
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

        ListDmsPartsResponse res = sdk.part().listDmsParts()
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

        PatchDmsPartResponse res = sdk.part().patchDmsPart()
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
                    .description("Aestivus talis tero ullam cruciamentum voluptatibus cumque degusto cui.")
                    .documentIds(List.of())
                    .fileIds(List.of())
                    .id("a13fa67f-b464-4fa9-885f-8fdce7e82d8e")
                    .isAssembly(false)
                    .lifecycleState("Design")
                    .masterIdentifier("2e9a7c24-921d-43e7-ab3d-e01659f736de")
                    .metadata(List.of())
                    .name("speedy PCB")
                    .number("PRT-009154")
                    .originalType("Software")
                    .revision("B")
                    .source(Source.MAKE)
                    .status(PlmPartStatus.IN_WORK)
                    .type(PlmPartType.SOFTWARE)
                    .unitOfMeasure("EA")
                    .updatedAt(OffsetDateTime.parse("2021-04-15T20:33:23.712Z"))
                    .url("https://digital-pop.com")
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

## removePlmPart

Deletes the PlmPart identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removePlmPart" method="delete" path="/plm/{connection_id}/part/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemovePlmPartRequest;
import to.unified.unified_java_sdk.models.operations.RemovePlmPartResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemovePlmPartRequest req = RemovePlmPartRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemovePlmPartResponse res = sdk.part().removePlmPart()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [RemovePlmPartRequest](../../models/operations/RemovePlmPartRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[RemovePlmPartResponse](../../models/operations/RemovePlmPartResponse.md)**

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

        UpdateDmsPartResponse res = sdk.part().updateDmsPart()
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
                    .description("Aestivus talis tero ullam cruciamentum voluptatibus cumque degusto cui.")
                    .documentIds(List.of())
                    .fileIds(List.of())
                    .id("a13fa67f-b464-4fa9-885f-8fdce7e82d8e")
                    .isAssembly(false)
                    .lifecycleState("Design")
                    .masterIdentifier("2e9a7c24-921d-43e7-ab3d-e01659f736de")
                    .metadata(List.of())
                    .name("speedy PCB")
                    .number("PRT-009154")
                    .originalType("Software")
                    .revision("B")
                    .source(Source.MAKE)
                    .status(PlmPartStatus.IN_WORK)
                    .type(PlmPartType.SOFTWARE)
                    .unitOfMeasure("EA")
                    .updatedAt(OffsetDateTime.parse("2021-04-15T20:33:23.712Z"))
                    .url("https://digital-pop.com")
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