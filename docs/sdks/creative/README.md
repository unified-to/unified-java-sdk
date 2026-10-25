# Creative

## Overview

### Available Operations

* [createAdsCreative](#createadscreative) - Create a creative
* [getAdsCreative](#getadscreative) - Retrieve a creative
* [listAdsCreatives](#listadscreatives) - List all creatives
* [patchAdsCreative](#patchadscreative) - Update a creative
* [removeAdsCreative](#removeadscreative) - Remove a creative
* [updateAdsCreative](#updateadscreative) - Update a creative

## createAdsCreative

Creates a AdsCreative. Provide the unified AdsCreative fields in the request body; they are mapped to the provider's API. Returns the created AdsCreative.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsCreative" method="post" path="/ads/{connection_id}/creative" example="ads_creative" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsCreativeRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsCreativeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsCreativeRequest req = CreateAdsCreativeRequest.builder()
                .adsCreative(AdsCreative.builder()
                    .createdAt(OffsetDateTime.parse("2020-02-17T11:24:51.093Z"))
                    .id("58cd36e3-3aa0-456f-a421-3fd2adea34e6")
                    .labels(List.of(
                        "coma",
                        "accedo",
                        "termes"))
                    .metadata(List.of())
                    .name("Brekke, Bradtke and Robel")
                    .status(AdsCreativeStatus.PAUSED)
                    .updatedAt(OffsetDateTime.parse("2021-06-28T13:09:51.392Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsCreativeResponse res = sdk.creative().createAdsCreative()
                .request(req)
                .call();

        if (res.adsCreative().isPresent()) {
            System.out.println(res.adsCreative().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateAdsCreativeRequest](../../models/operations/CreateAdsCreativeRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateAdsCreativeResponse](../../models/operations/CreateAdsCreativeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsCreative

Retrieves a single AdsCreative by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsCreative" method="get" path="/ads/{connection_id}/creative/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsCreativeRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsCreativeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsCreativeRequest req = GetAdsCreativeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsCreativeResponse res = sdk.creative().getAdsCreative()
                .request(req)
                .call();

        if (res.adsCreative().isPresent()) {
            System.out.println(res.adsCreative().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetAdsCreativeRequest](../../models/operations/GetAdsCreativeRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetAdsCreativeResponse](../../models/operations/GetAdsCreativeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsCreatives

Returns a list of AdsCreatives. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsCreatives" method="get" path="/ads/{connection_id}/creative" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsCreativesRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsCreativesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsCreativesRequest req = ListAdsCreativesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsCreativesResponse res = sdk.creative().listAdsCreatives()
                .request(req)
                .call();

        if (res.adsCreatives().isPresent()) {
            System.out.println(res.adsCreatives().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListAdsCreativesRequest](../../models/operations/ListAdsCreativesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListAdsCreativesResponse](../../models/operations/ListAdsCreativesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAdsCreative

Updates the AdsCreative identified by `id`. Provide the unified AdsCreative fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsCreative" method="patch" path="/ads/{connection_id}/creative/{id}" example="ads_creative" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsCreativeRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsCreativeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsCreativeRequest req = PatchAdsCreativeRequest.builder()
                .adsCreative(AdsCreative.builder()
                    .createdAt(OffsetDateTime.parse("2020-02-17T11:24:51.093Z"))
                    .id("e2a426df-c19c-4515-b7bc-ea8783ecc336")
                    .labels(List.of(
                        "coma",
                        "accedo",
                        "termes"))
                    .metadata(List.of())
                    .name("Brekke, Bradtke and Robel")
                    .status(AdsCreativeStatus.PAUSED)
                    .updatedAt(OffsetDateTime.parse("2021-06-28T13:09:51.398Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsCreativeResponse res = sdk.creative().patchAdsCreative()
                .request(req)
                .call();

        if (res.adsCreative().isPresent()) {
            System.out.println(res.adsCreative().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchAdsCreativeRequest](../../models/operations/PatchAdsCreativeRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchAdsCreativeResponse](../../models/operations/PatchAdsCreativeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAdsCreative

Deletes the AdsCreative identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsCreative" method="delete" path="/ads/{connection_id}/creative/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsCreativeRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAdsCreativeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsCreativeRequest req = RemoveAdsCreativeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsCreativeResponse res = sdk.creative().removeAdsCreative()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveAdsCreativeRequest](../../models/operations/RemoveAdsCreativeRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveAdsCreativeResponse](../../models/operations/RemoveAdsCreativeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAdsCreative

Updates the AdsCreative identified by `id`. Provide the unified AdsCreative fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsCreative" method="put" path="/ads/{connection_id}/creative/{id}" example="ads_creative" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsCreativeRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsCreativeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsCreativeRequest req = UpdateAdsCreativeRequest.builder()
                .adsCreative(AdsCreative.builder()
                    .createdAt(OffsetDateTime.parse("2020-02-17T11:24:51.093Z"))
                    .id("e2a426df-c19c-4515-b7bc-ea8783ecc336")
                    .labels(List.of(
                        "coma",
                        "accedo",
                        "termes"))
                    .metadata(List.of())
                    .name("Brekke, Bradtke and Robel")
                    .status(AdsCreativeStatus.PAUSED)
                    .updatedAt(OffsetDateTime.parse("2021-06-28T13:09:51.398Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsCreativeResponse res = sdk.creative().updateAdsCreative()
                .request(req)
                .call();

        if (res.adsCreative().isPresent()) {
            System.out.println(res.adsCreative().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateAdsCreativeRequest](../../models/operations/UpdateAdsCreativeRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateAdsCreativeResponse](../../models/operations/UpdateAdsCreativeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |