# Ad

## Overview

### Available Operations

* [createAdsAd2](#createadsad2) - Create an ad
* [getAdsAd2](#getadsad2) - Retrieve an ad
* [listAdsAds2](#listadsads2) - List all ads
* [patchAdsAd2](#patchadsad2) - Update an ad
* [removeAdsAd2](#removeadsad2) - Remove an ad
* [updateAdsAd2](#updateadsad2) - Update an ad

## createAdsAd2

Create an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsAd2" method="post" path="/ads/{connection_id}/ad" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsAd2Request;
import to.unified.unified_java_sdk.models.operations.CreateAdsAd2Response;
import to.unified.unified_java_sdk.models.shared.AdsAd;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsAd2Request req = CreateAdsAd2Request.builder()
                .adsAd(AdsAd.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsAd2Response res = sdk.ad().createAdsAd2()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            System.out.println(res.adsAd().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CreateAdsAd2Request](../../models/operations/CreateAdsAd2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CreateAdsAd2Response](../../models/operations/CreateAdsAd2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsAd2

Retrieve an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsAd2" method="get" path="/ads/{connection_id}/ad/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsAd2Request;
import to.unified.unified_java_sdk.models.operations.GetAdsAd2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsAd2Request req = GetAdsAd2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsAd2Response res = sdk.ad().getAdsAd2()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            System.out.println(res.adsAd().get());
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetAdsAd2Request](../../models/operations/GetAdsAd2Request.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetAdsAd2Response](../../models/operations/GetAdsAd2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsAds2

List all ads

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsAds2" method="get" path="/ads/{connection_id}/ad" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsAds2Request;
import to.unified.unified_java_sdk.models.operations.ListAdsAds2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsAds2Request req = ListAdsAds2Request.builder()
                .connectionId("<id>")
                .build();

        ListAdsAds2Response res = sdk.ad().listAdsAds2()
                .request(req)
                .call();

        if (res.adsAds().isPresent()) {
            System.out.println(res.adsAds().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListAdsAds2Request](../../models/operations/ListAdsAds2Request.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListAdsAds2Response](../../models/operations/ListAdsAds2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAdsAd2

Update an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsAd2" method="patch" path="/ads/{connection_id}/ad/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsAd2Request;
import to.unified.unified_java_sdk.models.operations.PatchAdsAd2Response;
import to.unified.unified_java_sdk.models.shared.AdsAd;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsAd2Request req = PatchAdsAd2Request.builder()
                .adsAd(AdsAd.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsAd2Response res = sdk.ad().patchAdsAd2()
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
| `request`                                                           | [PatchAdsAd2Request](../../models/operations/PatchAdsAd2Request.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[PatchAdsAd2Response](../../models/operations/PatchAdsAd2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAdsAd2

Remove an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsAd2" method="delete" path="/ads/{connection_id}/ad/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsAd2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAdsAd2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsAd2Request req = RemoveAdsAd2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsAd2Response res = sdk.ad().removeAdsAd2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [RemoveAdsAd2Request](../../models/operations/RemoveAdsAd2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[RemoveAdsAd2Response](../../models/operations/RemoveAdsAd2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAdsAd2

Update an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsAd2" method="put" path="/ads/{connection_id}/ad/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsAd2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAdsAd2Response;
import to.unified.unified_java_sdk.models.shared.AdsAd;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsAd2Request req = UpdateAdsAd2Request.builder()
                .adsAd(AdsAd.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsAd2Response res = sdk.ad().updateAdsAd2()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            System.out.println(res.adsAd().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [UpdateAdsAd2Request](../../models/operations/UpdateAdsAd2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[UpdateAdsAd2Response](../../models/operations/UpdateAdsAd2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |