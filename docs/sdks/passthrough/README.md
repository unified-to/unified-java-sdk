# Passthrough
(*passthrough()*)

## Overview

### Available Operations

* [createPassthroughJson](#createpassthroughjson) - Passthrough POST
* [createPassthroughRaw](#createpassthroughraw) - Passthrough POST
* [listPassthroughs](#listpassthroughs) - Passthrough GET
* [patchPassthroughJson](#patchpassthroughjson) - Passthrough PUT
* [patchPassthroughRaw](#patchpassthroughraw) - Passthrough PUT
* [removePassthrough](#removepassthrough) - Passthrough DELETE
* [updatePassthroughJson](#updatepassthroughjson) - Passthrough PUT
* [updatePassthroughRaw](#updatepassthroughraw) - Passthrough PUT

## createPassthroughJson

Passthrough POST

### Example Usage

<!-- UsageSnippet language="java" operationID="createPassthrough_json" method="post" path="/passthrough/{connection_id}/{path}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePassthroughJsonRequest;
import to.unified.unified_java_sdk.models.operations.CreatePassthroughJsonResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePassthroughJsonRequest req = CreatePassthroughJsonRequest.builder()
                .connectionId("<id>")
                .path("/var/log")
                .build();

        CreatePassthroughJsonResponse res = sdk.passthrough().createPassthroughJson()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreatePassthroughJsonRequest](../../models/operations/CreatePassthroughJsonRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreatePassthroughJsonResponse](../../models/operations/CreatePassthroughJsonResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createPassthroughRaw

Passthrough POST

### Example Usage

<!-- UsageSnippet language="java" operationID="createPassthrough_raw" method="post" path="/passthrough/{connection_id}/{path}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePassthroughRawRequest;
import to.unified.unified_java_sdk.models.operations.CreatePassthroughRawResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePassthroughRawRequest req = CreatePassthroughRawRequest.builder()
                .connectionId("<id>")
                .path("/var/log")
                .build();

        CreatePassthroughRawResponse res = sdk.passthrough().createPassthroughRaw()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreatePassthroughRawRequest](../../models/operations/CreatePassthroughRawRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreatePassthroughRawResponse](../../models/operations/CreatePassthroughRawResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPassthroughs

Passthrough GET

### Example Usage

<!-- UsageSnippet language="java" operationID="listPassthroughs" method="get" path="/passthrough/{connection_id}/{path}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPassthroughsRequest;
import to.unified.unified_java_sdk.models.operations.ListPassthroughsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPassthroughsRequest req = ListPassthroughsRequest.builder()
                .connectionId("<id>")
                .path("/System")
                .build();

        ListPassthroughsResponse res = sdk.passthrough().listPassthroughs()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListPassthroughsRequest](../../models/operations/ListPassthroughsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListPassthroughsResponse](../../models/operations/ListPassthroughsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPassthroughJson

Passthrough PUT

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPassthrough_json" method="patch" path="/passthrough/{connection_id}/{path}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPassthroughJsonRequest;
import to.unified.unified_java_sdk.models.operations.PatchPassthroughJsonResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPassthroughJsonRequest req = PatchPassthroughJsonRequest.builder()
                .connectionId("<id>")
                .path("/System")
                .build();

        PatchPassthroughJsonResponse res = sdk.passthrough().patchPassthroughJson()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchPassthroughJsonRequest](../../models/operations/PatchPassthroughJsonRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchPassthroughJsonResponse](../../models/operations/PatchPassthroughJsonResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPassthroughRaw

Passthrough PUT

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPassthrough_raw" method="patch" path="/passthrough/{connection_id}/{path}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPassthroughRawRequest;
import to.unified.unified_java_sdk.models.operations.PatchPassthroughRawResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPassthroughRawRequest req = PatchPassthroughRawRequest.builder()
                .connectionId("<id>")
                .path("/System")
                .build();

        PatchPassthroughRawResponse res = sdk.passthrough().patchPassthroughRaw()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchPassthroughRawRequest](../../models/operations/PatchPassthroughRawRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchPassthroughRawResponse](../../models/operations/PatchPassthroughRawResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removePassthrough

Passthrough DELETE

### Example Usage

<!-- UsageSnippet language="java" operationID="removePassthrough" method="delete" path="/passthrough/{connection_id}/{path}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemovePassthroughRequest;
import to.unified.unified_java_sdk.models.operations.RemovePassthroughResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemovePassthroughRequest req = RemovePassthroughRequest.builder()
                .connectionId("<id>")
                .path("/bin")
                .build();

        RemovePassthroughResponse res = sdk.passthrough().removePassthrough()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemovePassthroughRequest](../../models/operations/RemovePassthroughRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemovePassthroughResponse](../../models/operations/RemovePassthroughResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePassthroughJson

Passthrough PUT

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePassthrough_json" method="put" path="/passthrough/{connection_id}/{path}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePassthroughJsonRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePassthroughJsonResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePassthroughJsonRequest req = UpdatePassthroughJsonRequest.builder()
                .connectionId("<id>")
                .path("/var/tmp")
                .build();

        UpdatePassthroughJsonResponse res = sdk.passthrough().updatePassthroughJson()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdatePassthroughJsonRequest](../../models/operations/UpdatePassthroughJsonRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdatePassthroughJsonResponse](../../models/operations/UpdatePassthroughJsonResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePassthroughRaw

Passthrough PUT

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePassthrough_raw" method="put" path="/passthrough/{connection_id}/{path}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePassthroughRawRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePassthroughRawResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePassthroughRawRequest req = UpdatePassthroughRawRequest.builder()
                .connectionId("<id>")
                .path("/var/tmp")
                .build();

        UpdatePassthroughRawResponse res = sdk.passthrough().updatePassthroughRaw()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdatePassthroughRawRequest](../../models/operations/UpdatePassthroughRawRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdatePassthroughRawResponse](../../models/operations/UpdatePassthroughRawResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |