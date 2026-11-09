# Bomline

## Overview

### Available Operations

* [createPlmBomline](#createplmbomline) - Create a bomline
* [getPlmBomline](#getplmbomline) - Retrieve a bomline
* [listPlmBomlines](#listplmbomlines) - List all bomlines
* [patchPlmBomline](#patchplmbomline) - Update a bomline
* [removePlmBomline](#removeplmbomline) - Remove a bomline
* [updatePlmBomline](#updateplmbomline) - Update a bomline

## createPlmBomline

Creates a PlmBomline. Provide the unified PlmBomline fields in the request body; they are mapped to the provider's API. Returns the created PlmBomline.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPlmBomline" method="post" path="/plm/{connection_id}/bomline" example="plm_bomline" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePlmBomlineRequest;
import to.unified.unified_java_sdk.models.operations.CreatePlmBomlineResponse;
import to.unified.unified_java_sdk.models.shared.PlmBomline;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePlmBomlineRequest req = CreatePlmBomlineRequest.builder()
                .plmBomline(PlmBomline.builder()
                    .createdAt(OffsetDateTime.parse("2022-04-02T07:09:29.598Z"))
                    .effectiveAt(OffsetDateTime.parse("2022-04-02T07:09:29.598Z"))
                    .id("4f16184b-5bf8-4b75-b70a-04aff1620260")
                    .quantity(7d)
                    .referenceDesignators(List.of())
                    .unitOfMeasure("EA")
                    .updatedAt(OffsetDateTime.parse("2023-04-18T20:15:41.430Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreatePlmBomlineResponse res = sdk.bomline().createPlmBomline()
                .request(req)
                .call();

        if (res.plmBomline().isPresent()) {
            System.out.println(res.plmBomline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreatePlmBomlineRequest](../../models/operations/CreatePlmBomlineRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreatePlmBomlineResponse](../../models/operations/CreatePlmBomlineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPlmBomline

Retrieves a single PlmBomline by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPlmBomline" method="get" path="/plm/{connection_id}/bomline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPlmBomlineRequest;
import to.unified.unified_java_sdk.models.operations.GetPlmBomlineResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPlmBomlineRequest req = GetPlmBomlineRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPlmBomlineResponse res = sdk.bomline().getPlmBomline()
                .request(req)
                .call();

        if (res.plmBomline().isPresent()) {
            System.out.println(res.plmBomline().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetPlmBomlineRequest](../../models/operations/GetPlmBomlineRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetPlmBomlineResponse](../../models/operations/GetPlmBomlineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPlmBomlines

Returns a list of PlmBomlines. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPlmBomlines" method="get" path="/plm/{connection_id}/bomline" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPlmBomlinesRequest;
import to.unified.unified_java_sdk.models.operations.ListPlmBomlinesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPlmBomlinesRequest req = ListPlmBomlinesRequest.builder()
                .connectionId("<id>")
                .build();

        ListPlmBomlinesResponse res = sdk.bomline().listPlmBomlines()
                .request(req)
                .call();

        if (res.plmBomlines().isPresent()) {
            System.out.println(res.plmBomlines().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListPlmBomlinesRequest](../../models/operations/ListPlmBomlinesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListPlmBomlinesResponse](../../models/operations/ListPlmBomlinesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPlmBomline

Updates the PlmBomline identified by `id`. Provide the unified PlmBomline fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPlmBomline" method="patch" path="/plm/{connection_id}/bomline/{id}" example="plm_bomline" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPlmBomlineRequest;
import to.unified.unified_java_sdk.models.operations.PatchPlmBomlineResponse;
import to.unified.unified_java_sdk.models.shared.PlmBomline;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPlmBomlineRequest req = PatchPlmBomlineRequest.builder()
                .plmBomline(PlmBomline.builder()
                    .createdAt(OffsetDateTime.parse("2022-04-02T07:09:29.598Z"))
                    .effectiveAt(OffsetDateTime.parse("2022-04-02T07:09:29.598Z"))
                    .id("56bbdf12-c18b-4195-b9bd-6a5be35d64fd")
                    .quantity(7d)
                    .referenceDesignators(List.of())
                    .unitOfMeasure("EA")
                    .updatedAt(OffsetDateTime.parse("2023-04-18T20:15:41.432Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPlmBomlineResponse res = sdk.bomline().patchPlmBomline()
                .request(req)
                .call();

        if (res.plmBomline().isPresent()) {
            System.out.println(res.plmBomline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchPlmBomlineRequest](../../models/operations/PatchPlmBomlineRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchPlmBomlineResponse](../../models/operations/PatchPlmBomlineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removePlmBomline

Deletes the PlmBomline identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removePlmBomline" method="delete" path="/plm/{connection_id}/bomline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemovePlmBomlineRequest;
import to.unified.unified_java_sdk.models.operations.RemovePlmBomlineResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemovePlmBomlineRequest req = RemovePlmBomlineRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemovePlmBomlineResponse res = sdk.bomline().removePlmBomline()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemovePlmBomlineRequest](../../models/operations/RemovePlmBomlineRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemovePlmBomlineResponse](../../models/operations/RemovePlmBomlineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePlmBomline

Updates the PlmBomline identified by `id`. Provide the unified PlmBomline fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePlmBomline" method="put" path="/plm/{connection_id}/bomline/{id}" example="plm_bomline" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePlmBomlineRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePlmBomlineResponse;
import to.unified.unified_java_sdk.models.shared.PlmBomline;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePlmBomlineRequest req = UpdatePlmBomlineRequest.builder()
                .plmBomline(PlmBomline.builder()
                    .createdAt(OffsetDateTime.parse("2022-04-02T07:09:29.598Z"))
                    .effectiveAt(OffsetDateTime.parse("2022-04-02T07:09:29.598Z"))
                    .id("56bbdf12-c18b-4195-b9bd-6a5be35d64fd")
                    .quantity(7d)
                    .referenceDesignators(List.of())
                    .unitOfMeasure("EA")
                    .updatedAt(OffsetDateTime.parse("2023-04-18T20:15:41.432Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePlmBomlineResponse res = sdk.bomline().updatePlmBomline()
                .request(req)
                .call();

        if (res.plmBomline().isPresent()) {
            System.out.println(res.plmBomline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdatePlmBomlineRequest](../../models/operations/UpdatePlmBomlineRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdatePlmBomlineResponse](../../models/operations/UpdatePlmBomlineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |