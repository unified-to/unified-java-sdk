# Creative

## Overview

### Available Operations

* [createAdsCreative2](#createadscreative2) - Create a creative
* [getAdsCreative2](#getadscreative2) - Retrieve a creative
* [listAdsCreatives2](#listadscreatives2) - List all creatives
* [patchAdsCreative2](#patchadscreative2) - Update a creative
* [removeAdsCreative2](#removeadscreative2) - Remove a creative
* [updateAdsCreative2](#updateadscreative2) - Update a creative

## createAdsCreative2

Create a creative

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsCreative2" method="post" path="/ads/{connection_id}/creative" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsCreative2Request;
import to.unified.unified_java_sdk.models.operations.CreateAdsCreative2Response;
import to.unified.unified_java_sdk.models.shared.AdsCreative;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsCreative2Request req = CreateAdsCreative2Request.builder()
                .adsCreative(AdsCreative.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsCreative2Response res = sdk.creative().createAdsCreative2()
                .request(req)
                .call();

        if (res.adsCreative().isPresent()) {
            System.out.println(res.adsCreative().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateAdsCreative2Request](../../models/operations/CreateAdsCreative2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateAdsCreative2Response](../../models/operations/CreateAdsCreative2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsCreative2

Retrieve a creative

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsCreative2" method="get" path="/ads/{connection_id}/creative/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsCreative2Request;
import to.unified.unified_java_sdk.models.operations.GetAdsCreative2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsCreative2Request req = GetAdsCreative2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsCreative2Response res = sdk.creative().getAdsCreative2()
                .request(req)
                .call();

        if (res.adsCreative().isPresent()) {
            System.out.println(res.adsCreative().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetAdsCreative2Request](../../models/operations/GetAdsCreative2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetAdsCreative2Response](../../models/operations/GetAdsCreative2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsCreatives2

List all creatives

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsCreatives2" method="get" path="/ads/{connection_id}/creative" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsCreatives2Request;
import to.unified.unified_java_sdk.models.operations.ListAdsCreatives2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsCreatives2Request req = ListAdsCreatives2Request.builder()
                .connectionId("<id>")
                .build();

        ListAdsCreatives2Response res = sdk.creative().listAdsCreatives2()
                .request(req)
                .call();

        if (res.adsCreatives().isPresent()) {
            System.out.println(res.adsCreatives().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAdsCreatives2Request](../../models/operations/ListAdsCreatives2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAdsCreatives2Response](../../models/operations/ListAdsCreatives2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAdsCreative2

Update a creative

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsCreative2" method="patch" path="/ads/{connection_id}/creative/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsCreative2Request;
import to.unified.unified_java_sdk.models.operations.PatchAdsCreative2Response;
import to.unified.unified_java_sdk.models.shared.AdsCreative;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsCreative2Request req = PatchAdsCreative2Request.builder()
                .adsCreative(AdsCreative.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsCreative2Response res = sdk.creative().patchAdsCreative2()
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
| `request`                                                                       | [PatchAdsCreative2Request](../../models/operations/PatchAdsCreative2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchAdsCreative2Response](../../models/operations/PatchAdsCreative2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAdsCreative2

Remove a creative

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsCreative2" method="delete" path="/ads/{connection_id}/creative/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsCreative2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAdsCreative2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsCreative2Request req = RemoveAdsCreative2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsCreative2Response res = sdk.creative().removeAdsCreative2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveAdsCreative2Request](../../models/operations/RemoveAdsCreative2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveAdsCreative2Response](../../models/operations/RemoveAdsCreative2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAdsCreative2

Update a creative

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsCreative2" method="put" path="/ads/{connection_id}/creative/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsCreative2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAdsCreative2Response;
import to.unified.unified_java_sdk.models.shared.AdsCreative;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsCreative2Request req = UpdateAdsCreative2Request.builder()
                .adsCreative(AdsCreative.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsCreative2Response res = sdk.creative().updateAdsCreative2()
                .request(req)
                .call();

        if (res.adsCreative().isPresent()) {
            System.out.println(res.adsCreative().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateAdsCreative2Request](../../models/operations/UpdateAdsCreative2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateAdsCreative2Response](../../models/operations/UpdateAdsCreative2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |