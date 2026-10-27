# Timeoff

## Overview

### Available Operations

* [createHrisTimeoff](#createhristimeoff) - Create a timeoff
* [getHrisTimeoff](#gethristimeoff) - Retrieve a timeoff
* [listHrisTimeoffs](#listhristimeoffs) - List all timeoffs
* [patchHrisTimeoff](#patchhristimeoff) - Update a timeoff
* [removeHrisTimeoff](#removehristimeoff) - Remove a timeoff
* [updateHrisTimeoff](#updatehristimeoff) - Update a timeoff

## createHrisTimeoff

Creates a HrisTimeoff. Provide the unified HrisTimeoff fields in the request body; they are mapped to the provider's API. Returns the created HrisTimeoff.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisTimeoff" method="post" path="/hris/{connection_id}/timeoff" example="hris_timeoff" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisTimeoffRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisTimeoffResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisTimeoffRequest req = CreateHrisTimeoffRequest.builder()
                .hrisTimeoff(HrisTimeoff.builder()
                    .userId("<id>")
                    .approvedAt(OffsetDateTime.parse("2022-02-23T19:55:34.668Z"))
                    .comments("Blandior ventus curiositas amplitudo.")
                    .createdAt(OffsetDateTime.parse("2021-10-06T18:00:20.615Z"))
                    .duration(4d)
                    .durationType(DurationType.DAY)
                    .endAt(OffsetDateTime.parse("2025-01-01T12:20:39.349Z"))
                    .id("f0ab03ff-68c2-41ef-ae35-004d91159a9b")
                    .isPaid(true)
                    .metadata(List.of())
                    .originalType("acerbitas ut")
                    .reason("verto")
                    .startAt(OffsetDateTime.parse("2023-09-07T01:18:35.135Z"))
                    .status(HrisTimeoffStatus.DENIED)
                    .type(HrisTimeoffType.IN_LIEU)
                    .updatedAt(OffsetDateTime.parse("2022-07-13T17:14:59.266Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisTimeoffResponse res = sdk.timeoff().createHrisTimeoff()
                .request(req)
                .call();

        if (res.hrisTimeoff().isPresent()) {
            System.out.println(res.hrisTimeoff().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateHrisTimeoffRequest](../../models/operations/CreateHrisTimeoffRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateHrisTimeoffResponse](../../models/operations/CreateHrisTimeoffResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisTimeoff

Retrieves a single HrisTimeoff by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisTimeoff" method="get" path="/hris/{connection_id}/timeoff/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisTimeoffRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisTimeoffResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisTimeoffRequest req = GetHrisTimeoffRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisTimeoffResponse res = sdk.timeoff().getHrisTimeoff()
                .request(req)
                .call();

        if (res.hrisTimeoff().isPresent()) {
            System.out.println(res.hrisTimeoff().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHrisTimeoffRequest](../../models/operations/GetHrisTimeoffRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHrisTimeoffResponse](../../models/operations/GetHrisTimeoffResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisTimeoffs

Returns a list of HrisTimeoffs. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisTimeoffs" method="get" path="/hris/{connection_id}/timeoff" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisTimeoffsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisTimeoffsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisTimeoffsRequest req = ListHrisTimeoffsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisTimeoffsResponse res = sdk.timeoff().listHrisTimeoffs()
                .request(req)
                .call();

        if (res.hrisTimeoffs().isPresent()) {
            System.out.println(res.hrisTimeoffs().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListHrisTimeoffsRequest](../../models/operations/ListHrisTimeoffsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListHrisTimeoffsResponse](../../models/operations/ListHrisTimeoffsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisTimeoff

Updates the HrisTimeoff identified by `id`. Provide the unified HrisTimeoff fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisTimeoff" method="patch" path="/hris/{connection_id}/timeoff/{id}" example="hris_timeoff" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisTimeoffRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisTimeoffResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisTimeoffRequest req = PatchHrisTimeoffRequest.builder()
                .hrisTimeoff(HrisTimeoff.builder()
                    .userId("<id>")
                    .approvedAt(OffsetDateTime.parse("2022-02-23T19:55:34.669Z"))
                    .comments("Blandior ventus curiositas amplitudo.")
                    .createdAt(OffsetDateTime.parse("2021-10-06T18:00:20.615Z"))
                    .duration(4d)
                    .durationType(DurationType.DAY)
                    .endAt(OffsetDateTime.parse("2025-01-01T12:20:39.362Z"))
                    .id("6432018a-cadc-4e33-9eb7-43533f830da5")
                    .isPaid(true)
                    .metadata(List.of())
                    .originalType("acerbitas ut")
                    .reason("verto")
                    .startAt(OffsetDateTime.parse("2023-09-07T01:18:35.143Z"))
                    .status(HrisTimeoffStatus.DENIED)
                    .type(HrisTimeoffType.IN_LIEU)
                    .updatedAt(OffsetDateTime.parse("2022-07-13T17:14:59.269Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisTimeoffResponse res = sdk.timeoff().patchHrisTimeoff()
                .request(req)
                .call();

        if (res.hrisTimeoff().isPresent()) {
            System.out.println(res.hrisTimeoff().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchHrisTimeoffRequest](../../models/operations/PatchHrisTimeoffRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchHrisTimeoffResponse](../../models/operations/PatchHrisTimeoffResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisTimeoff

Deletes the HrisTimeoff identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisTimeoff" method="delete" path="/hris/{connection_id}/timeoff/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTimeoffRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTimeoffResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisTimeoffRequest req = RemoveHrisTimeoffRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisTimeoffResponse res = sdk.timeoff().removeHrisTimeoff()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveHrisTimeoffRequest](../../models/operations/RemoveHrisTimeoffRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveHrisTimeoffResponse](../../models/operations/RemoveHrisTimeoffResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisTimeoff

Updates the HrisTimeoff identified by `id`. Provide the unified HrisTimeoff fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisTimeoff" method="put" path="/hris/{connection_id}/timeoff/{id}" example="hris_timeoff" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTimeoffRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTimeoffResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisTimeoffRequest req = UpdateHrisTimeoffRequest.builder()
                .hrisTimeoff(HrisTimeoff.builder()
                    .userId("<id>")
                    .approvedAt(OffsetDateTime.parse("2022-02-23T19:55:34.669Z"))
                    .comments("Blandior ventus curiositas amplitudo.")
                    .createdAt(OffsetDateTime.parse("2021-10-06T18:00:20.615Z"))
                    .duration(4d)
                    .durationType(DurationType.DAY)
                    .endAt(OffsetDateTime.parse("2025-01-01T12:20:39.362Z"))
                    .id("6432018a-cadc-4e33-9eb7-43533f830da5")
                    .isPaid(true)
                    .metadata(List.of())
                    .originalType("acerbitas ut")
                    .reason("verto")
                    .startAt(OffsetDateTime.parse("2023-09-07T01:18:35.143Z"))
                    .status(HrisTimeoffStatus.DENIED)
                    .type(HrisTimeoffType.IN_LIEU)
                    .updatedAt(OffsetDateTime.parse("2022-07-13T17:14:59.269Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisTimeoffResponse res = sdk.timeoff().updateHrisTimeoff()
                .request(req)
                .call();

        if (res.hrisTimeoff().isPresent()) {
            System.out.println(res.hrisTimeoff().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateHrisTimeoffRequest](../../models/operations/UpdateHrisTimeoffRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateHrisTimeoffResponse](../../models/operations/UpdateHrisTimeoffResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |