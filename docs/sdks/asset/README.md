# Asset

## Overview

### Available Operations

* [createAdsAsset](#createadsasset) - Create an asset
* [getAdsAsset](#getadsasset) - Retrieve an asset
* [listAdsAssets](#listadsassets) - List all assets

## createAdsAsset

Create an asset

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsAsset" method="post" path="/ads/{connection_id}/asset" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsAssetRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsAssetResponse;
import to.unified.unified_java_sdk.models.shared.AdsAsset;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsAssetRequest req = CreateAdsAssetRequest.builder()
                .adsAsset(AdsAsset.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsAssetResponse res = sdk.asset().createAdsAsset()
                .request(req)
                .call();

        if (res.adsAsset().isPresent()) {
            System.out.println(res.adsAsset().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateAdsAssetRequest](../../models/operations/CreateAdsAssetRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateAdsAssetResponse](../../models/operations/CreateAdsAssetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsAsset

Retrieve an asset

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsAsset" method="get" path="/ads/{connection_id}/asset/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsAssetRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsAssetResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsAssetRequest req = GetAdsAssetRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsAssetResponse res = sdk.asset().getAdsAsset()
                .request(req)
                .call();

        if (res.adsAsset().isPresent()) {
            System.out.println(res.adsAsset().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetAdsAssetRequest](../../models/operations/GetAdsAssetRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetAdsAssetResponse](../../models/operations/GetAdsAssetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsAssets

List all assets

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsAssets" method="get" path="/ads/{connection_id}/asset" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsAssetsRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsAssetsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsAssetsRequest req = ListAdsAssetsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsAssetsResponse res = sdk.asset().listAdsAssets()
                .request(req)
                .call();

        if (res.adsAssets().isPresent()) {
            System.out.println(res.adsAssets().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListAdsAssetsRequest](../../models/operations/ListAdsAssetsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListAdsAssetsResponse](../../models/operations/ListAdsAssetsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |