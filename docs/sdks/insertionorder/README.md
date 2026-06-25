# Insertionorder

## Overview

### Available Operations

* [createAdsInsertionorder2](#createadsinsertionorder2) - Create an insertionorder
* [getAdsInsertionorder2](#getadsinsertionorder2) - Retrieve an insertionorder
* [listAdsInsertionorders2](#listadsinsertionorders2) - List all insertionorders
* [patchAdsInsertionorder2](#patchadsinsertionorder2) - Update an insertionorder
* [removeAdsInsertionorder2](#removeadsinsertionorder2) - Remove an insertionorder
* [updateAdsInsertionorder2](#updateadsinsertionorder2) - Update an insertionorder

## createAdsInsertionorder2

Create an insertionorder

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsInsertionorder2" method="post" path="/ads/{connection_id}/insertionorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsInsertionorder2Request;
import to.unified.unified_java_sdk.models.operations.CreateAdsInsertionorder2Response;
import to.unified.unified_java_sdk.models.shared.AdsInsertionorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsInsertionorder2Request req = CreateAdsInsertionorder2Request.builder()
                .adsInsertionorder(AdsInsertionorder.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsInsertionorder2Response res = sdk.insertionorder().createAdsInsertionorder2()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            System.out.println(res.adsInsertionorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateAdsInsertionorder2Request](../../models/operations/CreateAdsInsertionorder2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateAdsInsertionorder2Response](../../models/operations/CreateAdsInsertionorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsInsertionorder2

Retrieve an insertionorder

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsInsertionorder2" method="get" path="/ads/{connection_id}/insertionorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsInsertionorder2Request;
import to.unified.unified_java_sdk.models.operations.GetAdsInsertionorder2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsInsertionorder2Request req = GetAdsInsertionorder2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsInsertionorder2Response res = sdk.insertionorder().getAdsInsertionorder2()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            System.out.println(res.adsInsertionorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAdsInsertionorder2Request](../../models/operations/GetAdsInsertionorder2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAdsInsertionorder2Response](../../models/operations/GetAdsInsertionorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsInsertionorders2

List all insertionorders

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsInsertionorders2" method="get" path="/ads/{connection_id}/insertionorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsInsertionorders2Request;
import to.unified.unified_java_sdk.models.operations.ListAdsInsertionorders2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsInsertionorders2Request req = ListAdsInsertionorders2Request.builder()
                .connectionId("<id>")
                .build();

        ListAdsInsertionorders2Response res = sdk.insertionorder().listAdsInsertionorders2()
                .request(req)
                .call();

        if (res.adsInsertionorders().isPresent()) {
            System.out.println(res.adsInsertionorders().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListAdsInsertionorders2Request](../../models/operations/ListAdsInsertionorders2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListAdsInsertionorders2Response](../../models/operations/ListAdsInsertionorders2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAdsInsertionorder2

Update an insertionorder

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsInsertionorder2" method="patch" path="/ads/{connection_id}/insertionorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsInsertionorder2Request;
import to.unified.unified_java_sdk.models.operations.PatchAdsInsertionorder2Response;
import to.unified.unified_java_sdk.models.shared.AdsInsertionorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsInsertionorder2Request req = PatchAdsInsertionorder2Request.builder()
                .adsInsertionorder(AdsInsertionorder.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsInsertionorder2Response res = sdk.insertionorder().patchAdsInsertionorder2()
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
| `request`                                                                                   | [PatchAdsInsertionorder2Request](../../models/operations/PatchAdsInsertionorder2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchAdsInsertionorder2Response](../../models/operations/PatchAdsInsertionorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAdsInsertionorder2

Remove an insertionorder

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsInsertionorder2" method="delete" path="/ads/{connection_id}/insertionorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsInsertionorder2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAdsInsertionorder2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsInsertionorder2Request req = RemoveAdsInsertionorder2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsInsertionorder2Response res = sdk.insertionorder().removeAdsInsertionorder2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveAdsInsertionorder2Request](../../models/operations/RemoveAdsInsertionorder2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveAdsInsertionorder2Response](../../models/operations/RemoveAdsInsertionorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAdsInsertionorder2

Update an insertionorder

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsInsertionorder2" method="put" path="/ads/{connection_id}/insertionorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsInsertionorder2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAdsInsertionorder2Response;
import to.unified.unified_java_sdk.models.shared.AdsInsertionorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsInsertionorder2Request req = UpdateAdsInsertionorder2Request.builder()
                .adsInsertionorder(AdsInsertionorder.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsInsertionorder2Response res = sdk.insertionorder().updateAdsInsertionorder2()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            System.out.println(res.adsInsertionorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateAdsInsertionorder2Request](../../models/operations/UpdateAdsInsertionorder2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateAdsInsertionorder2Response](../../models/operations/UpdateAdsInsertionorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |