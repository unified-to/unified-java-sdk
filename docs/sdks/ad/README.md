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

Create an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsAd" method="post" path="/ads/{connection_id}/ad" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsAdRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsAdResponse;
import to.unified.unified_java_sdk.models.shared.AdsAd;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsAdRequest req = CreateAdsAdRequest.builder()
                .adsAd(AdsAd.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsAdResponse res = sdk.ad().createAdsAd()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            // handle response
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

Retrieve an ad

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
            // handle response
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

List all ads

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
            // handle response
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

Update an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsAd" method="patch" path="/ads/{connection_id}/ad/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsAdRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsAdResponse;
import to.unified.unified_java_sdk.models.shared.AdsAd;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsAdRequest req = PatchAdsAdRequest.builder()
                .adsAd(AdsAd.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsAdResponse res = sdk.ad().patchAdsAd()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            // handle response
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

Remove an ad

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

Update an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsAd" method="put" path="/ads/{connection_id}/ad/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsAdRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsAdResponse;
import to.unified.unified_java_sdk.models.shared.AdsAd;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsAdRequest req = UpdateAdsAdRequest.builder()
                .adsAd(AdsAd.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsAdResponse res = sdk.ad().updateAdsAd()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            // handle response
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