# Ad

## Overview

### Available Operations

* [createAdsAd](#createadsad) - Create an ad
* [getAdsAd](#getadsad) - Retrieve an ad
* [listAdsAds](#listadsads) - List all ads
* [patchAdsAd](#patchadsad) - Update an ad
* [removeAdsAd](#removeadsad) - Remove an ad
* [updateAdsAd](#updateadsad) - Update an ad

## createAdsAd

Creates a AdsAd. Provide the unified AdsAd fields in the request body; they are mapped to the provider's API. Returns the created AdsAd.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsAd" method="post" path="/ads/{connection_id}/ad" example="ads_ad" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsAdRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsAdResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsAdRequest req = CreateAdsAdRequest.builder()
                .adsAd(AdsAd.builder()
                    .adCopy("Ascisco tolero caute sapiente. Valens unde comedo cursus crinis nobis thema. Cohaero nisi ullam tum unde ultio vilicus auditor capio.")
                    .adType(AdType.SOCIAL)
                    .advertiserName("Robel, Nader and Rau")
                    .createdAt(OffsetDateTime.parse("2022-11-08T03:38:20.978Z"))
                    .creativeAssetUrl("https://picsum.photos/seed/LwOzrpr9/948/2793")
                    .description("Accedo vespillo carpo dolor decet stillicidium comptus tenuis.")
                    .finalUrl("https://improbable-sanity.com")
                    .id("0214fa95-d80f-485f-a5f4-68ca0678e260")
                    .metadata(List.of())
                    .name("Hermiston Group")
                    .status(AdsAdStatus.ARCHIVED)
                    .updatedAt(OffsetDateTime.parse("2024-06-22T14:33:42.267Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsAdResponse res = sdk.ad().createAdsAd()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            System.out.println(res.adsAd().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [CreateAdsAdRequest](../../models/operations/CreateAdsAdRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[CreateAdsAdResponse](../../models/operations/CreateAdsAdResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsAd

Retrieves a single AdsAd by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsAd" method="get" path="/ads/{connection_id}/ad/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsAdRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsAdResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsAdRequest req = GetAdsAdRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsAdResponse res = sdk.ad().getAdsAd()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            System.out.println(res.adsAd().get());
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetAdsAdRequest](../../models/operations/GetAdsAdRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetAdsAdResponse](../../models/operations/GetAdsAdResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsAds

Returns a list of AdsAds. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsAds" method="get" path="/ads/{connection_id}/ad" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsAdsRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsAdsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsAdsRequest req = ListAdsAdsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsAdsResponse res = sdk.ad().listAdsAds()
                .request(req)
                .call();

        if (res.adsAds().isPresent()) {
            System.out.println(res.adsAds().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [ListAdsAdsRequest](../../models/operations/ListAdsAdsRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[ListAdsAdsResponse](../../models/operations/ListAdsAdsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAdsAd

Updates the AdsAd identified by `id`. Provide the unified AdsAd fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsAd" method="patch" path="/ads/{connection_id}/ad/{id}" example="ads_ad" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsAdRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsAdResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsAdRequest req = PatchAdsAdRequest.builder()
                .adsAd(AdsAd.builder()
                    .adCopy("Ascisco tolero caute sapiente. Valens unde comedo cursus crinis nobis thema. Cohaero nisi ullam tum unde ultio vilicus auditor capio.")
                    .adType(AdType.SOCIAL)
                    .advertiserName("Robel, Nader and Rau")
                    .createdAt(OffsetDateTime.parse("2022-11-08T03:38:20.978Z"))
                    .creativeAssetUrl("https://picsum.photos/seed/LwOzrpr9/948/2793")
                    .description("Accedo vespillo carpo dolor decet stillicidium comptus tenuis.")
                    .finalUrl("https://improbable-sanity.com")
                    .id("a81fce02-2cb2-45d8-ad43-954ab64afcfa")
                    .metadata(List.of())
                    .name("Hermiston Group")
                    .status(AdsAdStatus.ARCHIVED)
                    .updatedAt(OffsetDateTime.parse("2024-06-22T14:33:42.275Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsAdResponse res = sdk.ad().patchAdsAd()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            System.out.println(res.adsAd().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [PatchAdsAdRequest](../../models/operations/PatchAdsAdRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[PatchAdsAdResponse](../../models/operations/PatchAdsAdResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAdsAd

Deletes the AdsAd identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsAd" method="delete" path="/ads/{connection_id}/ad/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsAdRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAdsAdResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsAdRequest req = RemoveAdsAdRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsAdResponse res = sdk.ad().removeAdsAd()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [RemoveAdsAdRequest](../../models/operations/RemoveAdsAdRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[RemoveAdsAdResponse](../../models/operations/RemoveAdsAdResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAdsAd

Updates the AdsAd identified by `id`. Provide the unified AdsAd fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsAd" method="put" path="/ads/{connection_id}/ad/{id}" example="ads_ad" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsAdRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsAdResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsAdRequest req = UpdateAdsAdRequest.builder()
                .adsAd(AdsAd.builder()
                    .adCopy("Ascisco tolero caute sapiente. Valens unde comedo cursus crinis nobis thema. Cohaero nisi ullam tum unde ultio vilicus auditor capio.")
                    .adType(AdType.SOCIAL)
                    .advertiserName("Robel, Nader and Rau")
                    .createdAt(OffsetDateTime.parse("2022-11-08T03:38:20.978Z"))
                    .creativeAssetUrl("https://picsum.photos/seed/LwOzrpr9/948/2793")
                    .description("Accedo vespillo carpo dolor decet stillicidium comptus tenuis.")
                    .finalUrl("https://improbable-sanity.com")
                    .id("a81fce02-2cb2-45d8-ad43-954ab64afcfa")
                    .metadata(List.of())
                    .name("Hermiston Group")
                    .status(AdsAdStatus.ARCHIVED)
                    .updatedAt(OffsetDateTime.parse("2024-06-22T14:33:42.275Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsAdResponse res = sdk.ad().updateAdsAd()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            System.out.println(res.adsAd().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [UpdateAdsAdRequest](../../models/operations/UpdateAdsAdRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[UpdateAdsAdResponse](../../models/operations/UpdateAdsAdResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |