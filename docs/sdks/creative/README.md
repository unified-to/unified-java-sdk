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

Create a creative

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsCreative" method="post" path="/ads/{connection_id}/creative" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsCreativeRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsCreativeResponse;
import to.unified.unified_java_sdk.models.shared.AdsCreative;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsCreativeRequest req = CreateAdsCreativeRequest.builder()
                .adsCreative(AdsCreative.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsCreativeResponse res = sdk.creative().createAdsCreative()
                .request(req)
                .call();

        if (res.adsCreative().isPresent()) {
            // handle response
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

Retrieve a creative

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
            // handle response
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

List all creatives

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
            // handle response
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

Update a creative

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsCreative" method="patch" path="/ads/{connection_id}/creative/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsCreativeRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsCreativeResponse;
import to.unified.unified_java_sdk.models.shared.AdsCreative;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsCreativeRequest req = PatchAdsCreativeRequest.builder()
                .adsCreative(AdsCreative.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsCreativeResponse res = sdk.creative().patchAdsCreative()
                .request(req)
                .call();

        if (res.adsCreative().isPresent()) {
            // handle response
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

Remove a creative

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

Update a creative

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsCreative" method="put" path="/ads/{connection_id}/creative/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsCreativeRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsCreativeResponse;
import to.unified.unified_java_sdk.models.shared.AdsCreative;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsCreativeRequest req = UpdateAdsCreativeRequest.builder()
                .adsCreative(AdsCreative.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsCreativeResponse res = sdk.creative().updateAdsCreative()
                .request(req)
                .call();

        if (res.adsCreative().isPresent()) {
            // handle response
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