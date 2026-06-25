# Timeoff

## Overview

### Available Operations

* [createHrisTimeoff2](#createhristimeoff2) - Create a timeoff
* [getHrisTimeoff2](#gethristimeoff2) - Retrieve a timeoff
* [listHrisTimeoffs2](#listhristimeoffs2) - List all timeoffs
* [patchHrisTimeoff2](#patchhristimeoff2) - Update a timeoff
* [removeHrisTimeoff2](#removehristimeoff2) - Remove a timeoff
* [updateHrisTimeoff2](#updatehristimeoff2) - Update a timeoff

## createHrisTimeoff2

Create a timeoff

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisTimeoff2" method="post" path="/hris/{connection_id}/timeoff" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisTimeoff2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisTimeoff2Response;
import to.unified.unified_java_sdk.models.shared.HrisTimeoff;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisTimeoff2Request req = CreateHrisTimeoff2Request.builder()
                .hrisTimeoff(HrisTimeoff.builder()
                    .userId("<id>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisTimeoff2Response res = sdk.timeoff().createHrisTimeoff2()
                .request(req)
                .call();

        if (res.hrisTimeoff().isPresent()) {
            System.out.println(res.hrisTimeoff().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateHrisTimeoff2Request](../../models/operations/CreateHrisTimeoff2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateHrisTimeoff2Response](../../models/operations/CreateHrisTimeoff2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisTimeoff2

Retrieve a timeoff

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisTimeoff2" method="get" path="/hris/{connection_id}/timeoff/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisTimeoff2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisTimeoff2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisTimeoff2Request req = GetHrisTimeoff2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisTimeoff2Response res = sdk.timeoff().getHrisTimeoff2()
                .request(req)
                .call();

        if (res.hrisTimeoff().isPresent()) {
            System.out.println(res.hrisTimeoff().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetHrisTimeoff2Request](../../models/operations/GetHrisTimeoff2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetHrisTimeoff2Response](../../models/operations/GetHrisTimeoff2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisTimeoffs2

List all timeoffs

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisTimeoffs2" method="get" path="/hris/{connection_id}/timeoff" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisTimeoffs2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisTimeoffs2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisTimeoffs2Request req = ListHrisTimeoffs2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisTimeoffs2Response res = sdk.timeoff().listHrisTimeoffs2()
                .request(req)
                .call();

        if (res.hrisTimeoffs().isPresent()) {
            System.out.println(res.hrisTimeoffs().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListHrisTimeoffs2Request](../../models/operations/ListHrisTimeoffs2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListHrisTimeoffs2Response](../../models/operations/ListHrisTimeoffs2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisTimeoff2

Update a timeoff

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisTimeoff2" method="patch" path="/hris/{connection_id}/timeoff/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisTimeoff2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisTimeoff2Response;
import to.unified.unified_java_sdk.models.shared.HrisTimeoff;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisTimeoff2Request req = PatchHrisTimeoff2Request.builder()
                .hrisTimeoff(HrisTimeoff.builder()
                    .userId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisTimeoff2Response res = sdk.timeoff().patchHrisTimeoff2()
                .request(req)
                .call();

        if (res.hrisTimeoff().isPresent()) {
            System.out.println(res.hrisTimeoff().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchHrisTimeoff2Request](../../models/operations/PatchHrisTimeoff2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchHrisTimeoff2Response](../../models/operations/PatchHrisTimeoff2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisTimeoff2

Remove a timeoff

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisTimeoff2" method="delete" path="/hris/{connection_id}/timeoff/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTimeoff2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTimeoff2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisTimeoff2Request req = RemoveHrisTimeoff2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisTimeoff2Response res = sdk.timeoff().removeHrisTimeoff2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveHrisTimeoff2Request](../../models/operations/RemoveHrisTimeoff2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveHrisTimeoff2Response](../../models/operations/RemoveHrisTimeoff2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisTimeoff2

Update a timeoff

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisTimeoff2" method="put" path="/hris/{connection_id}/timeoff/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTimeoff2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTimeoff2Response;
import to.unified.unified_java_sdk.models.shared.HrisTimeoff;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisTimeoff2Request req = UpdateHrisTimeoff2Request.builder()
                .hrisTimeoff(HrisTimeoff.builder()
                    .userId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisTimeoff2Response res = sdk.timeoff().updateHrisTimeoff2()
                .request(req)
                .call();

        if (res.hrisTimeoff().isPresent()) {
            System.out.println(res.hrisTimeoff().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateHrisTimeoff2Request](../../models/operations/UpdateHrisTimeoff2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateHrisTimeoff2Response](../../models/operations/UpdateHrisTimeoff2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |