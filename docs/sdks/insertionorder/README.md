# Insertionorder

## Overview

### Available Operations

* [createAdsInsertionorder](#createadsinsertionorder) - Create an insertionorder
* [getAdsInsertionorder](#getadsinsertionorder) - Retrieve an insertionorder
* [listAdsInsertionorders](#listadsinsertionorders) - List all insertionorders
* [patchAdsInsertionorder](#patchadsinsertionorder) - Update an insertionorder
* [removeAdsInsertionorder](#removeadsinsertionorder) - Remove an insertionorder
* [updateAdsInsertionorder](#updateadsinsertionorder) - Update an insertionorder

## createAdsInsertionorder

Create an insertionorder

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsInsertionorder" method="post" path="/ads/{connection_id}/insertionorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsInsertionorderRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsInsertionorderResponse;
import to.unified.unified_java_sdk.models.shared.AdsInsertionorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsInsertionorderRequest req = CreateAdsInsertionorderRequest.builder()
                .adsInsertionorder(AdsInsertionorder.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsInsertionorderResponse res = sdk.insertionorder().createAdsInsertionorder()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAdsInsertionorderRequest](../../models/operations/CreateAdsInsertionorderRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAdsInsertionorderResponse](../../models/operations/CreateAdsInsertionorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsInsertionorder

Retrieve an insertionorder

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsInsertionorder" method="get" path="/ads/{connection_id}/insertionorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsInsertionorderRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsInsertionorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsInsertionorderRequest req = GetAdsInsertionorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsInsertionorderResponse res = sdk.insertionorder().getAdsInsertionorder()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAdsInsertionorderRequest](../../models/operations/GetAdsInsertionorderRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAdsInsertionorderResponse](../../models/operations/GetAdsInsertionorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsInsertionorders

List all insertionorders

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsInsertionorders" method="get" path="/ads/{connection_id}/insertionorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsInsertionordersRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsInsertionordersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsInsertionordersRequest req = ListAdsInsertionordersRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsInsertionordersResponse res = sdk.insertionorder().listAdsInsertionorders()
                .request(req)
                .call();

        if (res.adsInsertionorders().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAdsInsertionordersRequest](../../models/operations/ListAdsInsertionordersRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAdsInsertionordersResponse](../../models/operations/ListAdsInsertionordersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAdsInsertionorder

Update an insertionorder

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsInsertionorder" method="patch" path="/ads/{connection_id}/insertionorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsInsertionorderRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsInsertionorderResponse;
import to.unified.unified_java_sdk.models.shared.AdsInsertionorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsInsertionorderRequest req = PatchAdsInsertionorderRequest.builder()
                .adsInsertionorder(AdsInsertionorder.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsInsertionorderResponse res = sdk.insertionorder().patchAdsInsertionorder()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAdsInsertionorderRequest](../../models/operations/PatchAdsInsertionorderRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAdsInsertionorderResponse](../../models/operations/PatchAdsInsertionorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAdsInsertionorder

Remove an insertionorder

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsInsertionorder" method="delete" path="/ads/{connection_id}/insertionorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsInsertionorderRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAdsInsertionorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsInsertionorderRequest req = RemoveAdsInsertionorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsInsertionorderResponse res = sdk.insertionorder().removeAdsInsertionorder()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAdsInsertionorderRequest](../../models/operations/RemoveAdsInsertionorderRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAdsInsertionorderResponse](../../models/operations/RemoveAdsInsertionorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAdsInsertionorder

Update an insertionorder

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsInsertionorder" method="put" path="/ads/{connection_id}/insertionorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsInsertionorderRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsInsertionorderResponse;
import to.unified.unified_java_sdk.models.shared.AdsInsertionorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsInsertionorderRequest req = UpdateAdsInsertionorderRequest.builder()
                .adsInsertionorder(AdsInsertionorder.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsInsertionorderResponse res = sdk.insertionorder().updateAdsInsertionorder()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAdsInsertionorderRequest](../../models/operations/UpdateAdsInsertionorderRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAdsInsertionorderResponse](../../models/operations/UpdateAdsInsertionorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |