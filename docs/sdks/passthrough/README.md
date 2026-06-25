# Passthrough

## Overview

### Available Operations

* [createPassthrough2Json](#createpassthrough2json) - Passthrough POST
* [createPassthrough2Raw](#createpassthrough2raw) - Passthrough POST
* [listPassthroughs2](#listpassthroughs2) - Passthrough GET
* [patchPassthrough2Json](#patchpassthrough2json) - Passthrough PUT
* [patchPassthrough2Raw](#patchpassthrough2raw) - Passthrough PUT
* [removePassthrough2](#removepassthrough2) - Passthrough DELETE
* [updatePassthrough2Json](#updatepassthrough2json) - Passthrough PUT
* [updatePassthrough2Raw](#updatepassthrough2raw) - Passthrough PUT

## createPassthrough2Json

Passthrough POST

### Example Usage

<!-- UsageSnippet language="java" operationID="createPassthrough2_json" method="post" path="/passthrough/{connection_id}/{path}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePassthrough2JsonRequest;
import to.unified.unified_java_sdk.models.operations.CreatePassthrough2JsonResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePassthrough2JsonRequest req = CreatePassthrough2JsonRequest.builder()
                .connectionId("<id>")
                .path("/net")
                .build();

        CreatePassthrough2JsonResponse res = sdk.passthrough().createPassthrough2Json()
                .request(req)
                .call();

        if (res.defaultApplicationJsonAny().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreatePassthrough2JsonRequest](../../models/operations/CreatePassthrough2JsonRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreatePassthrough2JsonResponse](../../models/operations/CreatePassthrough2JsonResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createPassthrough2Raw

Passthrough POST

### Example Usage

<!-- UsageSnippet language="java" operationID="createPassthrough2_raw" method="post" path="/passthrough/{connection_id}/{path}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePassthrough2RawRequest;
import to.unified.unified_java_sdk.models.operations.CreatePassthrough2RawResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePassthrough2RawRequest req = CreatePassthrough2RawRequest.builder()
                .connectionId("<id>")
                .path("/net")
                .build();

        CreatePassthrough2RawResponse res = sdk.passthrough().createPassthrough2Raw()
                .request(req)
                .call();

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreatePassthrough2RawRequest](../../models/operations/CreatePassthrough2RawRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreatePassthrough2RawResponse](../../models/operations/CreatePassthrough2RawResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPassthroughs2

Passthrough GET

### Example Usage

<!-- UsageSnippet language="java" operationID="listPassthroughs2" method="get" path="/passthrough/{connection_id}/{path}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPassthroughs2Request;
import to.unified.unified_java_sdk.models.operations.ListPassthroughs2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPassthroughs2Request req = ListPassthroughs2Request.builder()
                .connectionId("<id>")
                .path("/usr/local/src")
                .build();

        ListPassthroughs2Response res = sdk.passthrough().listPassthroughs2()
                .request(req)
                .call();

        if (res.defaultApplicationJsonAny().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListPassthroughs2Request](../../models/operations/ListPassthroughs2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListPassthroughs2Response](../../models/operations/ListPassthroughs2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPassthrough2Json

Passthrough PUT

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPassthrough2_json" method="patch" path="/passthrough/{connection_id}/{path}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPassthrough2JsonRequest;
import to.unified.unified_java_sdk.models.operations.PatchPassthrough2JsonResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPassthrough2JsonRequest req = PatchPassthrough2JsonRequest.builder()
                .connectionId("<id>")
                .path("/usr/X11R6")
                .build();

        PatchPassthrough2JsonResponse res = sdk.passthrough().patchPassthrough2Json()
                .request(req)
                .call();

        if (res.defaultApplicationJsonAny().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchPassthrough2JsonRequest](../../models/operations/PatchPassthrough2JsonRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchPassthrough2JsonResponse](../../models/operations/PatchPassthrough2JsonResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPassthrough2Raw

Passthrough PUT

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPassthrough2_raw" method="patch" path="/passthrough/{connection_id}/{path}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPassthrough2RawRequest;
import to.unified.unified_java_sdk.models.operations.PatchPassthrough2RawResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPassthrough2RawRequest req = PatchPassthrough2RawRequest.builder()
                .connectionId("<id>")
                .path("/usr/X11R6")
                .build();

        PatchPassthrough2RawResponse res = sdk.passthrough().patchPassthrough2Raw()
                .request(req)
                .call();

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchPassthrough2RawRequest](../../models/operations/PatchPassthrough2RawRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchPassthrough2RawResponse](../../models/operations/PatchPassthrough2RawResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removePassthrough2

Passthrough DELETE

### Example Usage

<!-- UsageSnippet language="java" operationID="removePassthrough2" method="delete" path="/passthrough/{connection_id}/{path}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemovePassthrough2Request;
import to.unified.unified_java_sdk.models.operations.RemovePassthrough2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemovePassthrough2Request req = RemovePassthrough2Request.builder()
                .connectionId("<id>")
                .path("/usr/include")
                .build();

        RemovePassthrough2Response res = sdk.passthrough().removePassthrough2()
                .request(req)
                .call();

        if (res.defaultApplicationJsonAny().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemovePassthrough2Request](../../models/operations/RemovePassthrough2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemovePassthrough2Response](../../models/operations/RemovePassthrough2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePassthrough2Json

Passthrough PUT

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePassthrough2_json" method="put" path="/passthrough/{connection_id}/{path}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePassthrough2JsonRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePassthrough2JsonResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePassthrough2JsonRequest req = UpdatePassthrough2JsonRequest.builder()
                .connectionId("<id>")
                .path("/home/user/dir")
                .build();

        UpdatePassthrough2JsonResponse res = sdk.passthrough().updatePassthrough2Json()
                .request(req)
                .call();

        if (res.defaultApplicationJsonAny().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdatePassthrough2JsonRequest](../../models/operations/UpdatePassthrough2JsonRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdatePassthrough2JsonResponse](../../models/operations/UpdatePassthrough2JsonResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePassthrough2Raw

Passthrough PUT

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePassthrough2_raw" method="put" path="/passthrough/{connection_id}/{path}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePassthrough2RawRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePassthrough2RawResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePassthrough2RawRequest req = UpdatePassthrough2RawRequest.builder()
                .connectionId("<id>")
                .path("/home/user/dir")
                .build();

        UpdatePassthrough2RawResponse res = sdk.passthrough().updatePassthrough2Raw()
                .request(req)
                .call();

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdatePassthrough2RawRequest](../../models/operations/UpdatePassthrough2RawRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdatePassthrough2RawResponse](../../models/operations/UpdatePassthrough2RawResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |