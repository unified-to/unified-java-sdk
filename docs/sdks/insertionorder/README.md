# Insertionorder

## Overview

### Available Operations

* [createAdsInsertionorder](#createadsinsertionorder) - Create an insertionorder
* [getAdsInsertionorder](#getadsinsertionorder) - Retrieve an insertionorder
* [listAdsInsertionorders](#listadsinsertionorders) - List all insertionorders
* [patchAdsInsertionorder](#patchadsinsertionorder) - Update an insertionorder
* [removeAdsInsertionorder](#removeadsinsertionorder) - Remove an insertionorder
* [updateAdsInsertionorder](#updateadsinsertionorder) - Update an insertionorder

## createAdsInsertionorder

Creates a AdsInsertionorder. Provide the unified AdsInsertionorder fields in the request body; they are mapped to the provider's API. Returns the created AdsInsertionorder.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsInsertionorder" method="post" path="/ads/{connection_id}/insertionorder" example="ads_insertionorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsInsertionorderRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsInsertionorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsInsertionorderRequest req = CreateAdsInsertionorderRequest.builder()
                .adsInsertionorder(AdsInsertionorder.builder()
                    .createdAt(OffsetDateTime.parse("2021-04-10T06:57:36.611Z"))
                    .id("5b100592-2dd8-4bb8-b94a-28002e27ef82")
                    .metadata(List.of())
                    .name("Kunde, Smith and Reinger")
                    .status(AdsInsertionorderStatus.UNSPECIFIED)
                    .updatedAt(OffsetDateTime.parse("2021-04-28T20:01:14.622Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsInsertionorderResponse res = sdk.insertionorder().createAdsInsertionorder()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            System.out.println(res.adsInsertionorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAdsInsertionorderRequest](../../models/operations/CreateAdsInsertionorderRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAdsInsertionorderResponse](../../models/operations/CreateAdsInsertionorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsInsertionorder

Retrieves a single AdsInsertionorder by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsInsertionorder" method="get" path="/ads/{connection_id}/insertionorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsInsertionorderRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsInsertionorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsInsertionorderRequest req = GetAdsInsertionorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsInsertionorderResponse res = sdk.insertionorder().getAdsInsertionorder()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            System.out.println(res.adsInsertionorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAdsInsertionorderRequest](../../models/operations/GetAdsInsertionorderRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAdsInsertionorderResponse](../../models/operations/GetAdsInsertionorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsInsertionorders

Returns a list of AdsInsertionorders. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsInsertionorders" method="get" path="/ads/{connection_id}/insertionorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsInsertionordersRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsInsertionordersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsInsertionordersRequest req = ListAdsInsertionordersRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsInsertionordersResponse res = sdk.insertionorder().listAdsInsertionorders()
                .request(req)
                .call();

        if (res.adsInsertionorders().isPresent()) {
            System.out.println(res.adsInsertionorders().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAdsInsertionordersRequest](../../models/operations/ListAdsInsertionordersRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAdsInsertionordersResponse](../../models/operations/ListAdsInsertionordersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAdsInsertionorder

Updates the AdsInsertionorder identified by `id`. Provide the unified AdsInsertionorder fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsInsertionorder" method="patch" path="/ads/{connection_id}/insertionorder/{id}" example="ads_insertionorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsInsertionorderRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsInsertionorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsInsertionorderRequest req = PatchAdsInsertionorderRequest.builder()
                .adsInsertionorder(AdsInsertionorder.builder()
                    .createdAt(OffsetDateTime.parse("2021-04-10T06:57:36.611Z"))
                    .id("3e96314c-d9b2-4a4a-a076-670bb319cd67")
                    .metadata(List.of())
                    .name("Kunde, Smith and Reinger")
                    .status(AdsInsertionorderStatus.UNSPECIFIED)
                    .updatedAt(OffsetDateTime.parse("2021-04-28T20:01:14.623Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsInsertionorderResponse res = sdk.insertionorder().patchAdsInsertionorder()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            System.out.println(res.adsInsertionorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAdsInsertionorderRequest](../../models/operations/PatchAdsInsertionorderRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAdsInsertionorderResponse](../../models/operations/PatchAdsInsertionorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAdsInsertionorder

Deletes the AdsInsertionorder identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsInsertionorder" method="delete" path="/ads/{connection_id}/insertionorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsInsertionorderRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAdsInsertionorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsInsertionorderRequest req = RemoveAdsInsertionorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsInsertionorderResponse res = sdk.insertionorder().removeAdsInsertionorder()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAdsInsertionorderRequest](../../models/operations/RemoveAdsInsertionorderRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAdsInsertionorderResponse](../../models/operations/RemoveAdsInsertionorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAdsInsertionorder

Updates the AdsInsertionorder identified by `id`. Provide the unified AdsInsertionorder fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsInsertionorder" method="put" path="/ads/{connection_id}/insertionorder/{id}" example="ads_insertionorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsInsertionorderRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsInsertionorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsInsertionorderRequest req = UpdateAdsInsertionorderRequest.builder()
                .adsInsertionorder(AdsInsertionorder.builder()
                    .createdAt(OffsetDateTime.parse("2021-04-10T06:57:36.611Z"))
                    .id("3e96314c-d9b2-4a4a-a076-670bb319cd67")
                    .metadata(List.of())
                    .name("Kunde, Smith and Reinger")
                    .status(AdsInsertionorderStatus.UNSPECIFIED)
                    .updatedAt(OffsetDateTime.parse("2021-04-28T20:01:14.623Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsInsertionorderResponse res = sdk.insertionorder().updateAdsInsertionorder()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            System.out.println(res.adsInsertionorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAdsInsertionorderRequest](../../models/operations/UpdateAdsInsertionorderRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAdsInsertionorderResponse](../../models/operations/UpdateAdsInsertionorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |