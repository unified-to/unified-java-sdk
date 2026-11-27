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
                    .adCopy("Unde ultio vilicus auditor capio reiciendis adsum paulatim admoveo. Collum accommodo adficio capto sed accedo vespillo carpo dolor decet. Comptus tenuis torqueo cum tergeo comedo colo adeo.")
                    .adType(AdType.SOCIAL)
                    .advertiserName("Johnson, Dach and Gerlach")
                    .createdAt(OffsetDateTime.parse("2022-11-08T03:38:20.978Z"))
                    .creativeAssetUrl("https://picsum.photos/seed/RjqoANMizQ/2569/2440")
                    .description("Adulescens cursim clam vorago fugiat amitto tardus bibo.")
                    .finalUrl("https://tight-horde.biz")
                    .id("e51ee4ed-05ea-4aa3-86a0-1ee3a17422c9")
                    .metadata(List.of())
                    .name("Rau, Runolfsson and Leannon")
                    .status(AdsAdStatus.ARCHIVED)
                    .updatedAt(OffsetDateTime.parse("2024-07-03T15:59:13.035Z"))
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
                    .adCopy("Unde ultio vilicus auditor capio reiciendis adsum paulatim admoveo. Collum accommodo adficio capto sed accedo vespillo carpo dolor decet. Comptus tenuis torqueo cum tergeo comedo colo adeo.")
                    .adType(AdType.SOCIAL)
                    .advertiserName("Johnson, Dach and Gerlach")
                    .createdAt(OffsetDateTime.parse("2022-11-08T03:38:20.978Z"))
                    .creativeAssetUrl("https://picsum.photos/seed/RjqoANMizQ/2569/2440")
                    .description("Adulescens cursim clam vorago fugiat amitto tardus bibo.")
                    .finalUrl("https://tight-horde.biz")
                    .id("7a04bd7f-0881-4091-82b7-98ceb1811ec1")
                    .metadata(List.of())
                    .name("Rau, Runolfsson and Leannon")
                    .status(AdsAdStatus.ARCHIVED)
                    .updatedAt(OffsetDateTime.parse("2024-07-03T15:59:13.048Z"))
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
                    .adCopy("Unde ultio vilicus auditor capio reiciendis adsum paulatim admoveo. Collum accommodo adficio capto sed accedo vespillo carpo dolor decet. Comptus tenuis torqueo cum tergeo comedo colo adeo.")
                    .adType(AdType.SOCIAL)
                    .advertiserName("Johnson, Dach and Gerlach")
                    .createdAt(OffsetDateTime.parse("2022-11-08T03:38:20.978Z"))
                    .creativeAssetUrl("https://picsum.photos/seed/RjqoANMizQ/2569/2440")
                    .description("Adulescens cursim clam vorago fugiat amitto tardus bibo.")
                    .finalUrl("https://tight-horde.biz")
                    .id("7a04bd7f-0881-4091-82b7-98ceb1811ec1")
                    .metadata(List.of())
                    .name("Rau, Runolfsson and Leannon")
                    .status(AdsAdStatus.ARCHIVED)
                    .updatedAt(OffsetDateTime.parse("2024-07-03T15:59:13.048Z"))
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