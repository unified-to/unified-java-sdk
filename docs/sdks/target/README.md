# Target

## Overview

### Available Operations

* [getAdsTarget2](#getadstarget2) - Retrieve a target
* [listAdsTargets2](#listadstargets2) - List all targets

## getAdsTarget2

Retrieve a target

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsTarget2" method="get" path="/ads/{connection_id}/target/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsTarget2Request;
import to.unified.unified_java_sdk.models.operations.GetAdsTarget2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsTarget2Request req = GetAdsTarget2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsTarget2Response res = sdk.target().getAdsTarget2()
                .request(req)
                .call();

        if (res.adsTarget().isPresent()) {
            System.out.println(res.adsTarget().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetAdsTarget2Request](../../models/operations/GetAdsTarget2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetAdsTarget2Response](../../models/operations/GetAdsTarget2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsTargets2

List all targets

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsTargets2" method="get" path="/ads/{connection_id}/target" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsTargets2Request;
import to.unified.unified_java_sdk.models.operations.ListAdsTargets2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsTargets2Request req = ListAdsTargets2Request.builder()
                .connectionId("<id>")
                .build();

        ListAdsTargets2Response res = sdk.target().listAdsTargets2()
                .request(req)
                .call();

        if (res.adsTargets().isPresent()) {
            System.out.println(res.adsTargets().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListAdsTargets2Request](../../models/operations/ListAdsTargets2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListAdsTargets2Response](../../models/operations/ListAdsTargets2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |