# Source

## Overview

### Available Operations

* [createCdpSource](#createcdpsource) - Create a source
* [getCdpSource](#getcdpsource) - Retrieve a source
* [listCdpSources](#listcdpsources) - List all sources
* [patchCdpSource](#patchcdpsource) - Update a source
* [removeCdpSource](#removecdpsource) - Remove a source
* [updateCdpSource](#updatecdpsource) - Update a source

## createCdpSource

Create a source

### Example Usage

<!-- UsageSnippet language="java" operationID="createCdpSource" method="post" path="/cdp/{connection_id}/source" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCdpSourceRequest;
import to.unified.unified_java_sdk.models.operations.CreateCdpSourceResponse;
import to.unified.unified_java_sdk.models.shared.CdpSource;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCdpSourceRequest req = CreateCdpSourceRequest.builder()
                .cdpSource(CdpSource.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCdpSourceResponse res = sdk.source().createCdpSource()
                .request(req)
                .call();

        if (res.cdpSource().isPresent()) {
            System.out.println(res.cdpSource().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateCdpSourceRequest](../../models/operations/CreateCdpSourceRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateCdpSourceResponse](../../models/operations/CreateCdpSourceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCdpSource

Retrieve a source

### Example Usage

<!-- UsageSnippet language="java" operationID="getCdpSource" method="get" path="/cdp/{connection_id}/source/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCdpSourceRequest;
import to.unified.unified_java_sdk.models.operations.GetCdpSourceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCdpSourceRequest req = GetCdpSourceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCdpSourceResponse res = sdk.source().getCdpSource()
                .request(req)
                .call();

        if (res.cdpSource().isPresent()) {
            System.out.println(res.cdpSource().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetCdpSourceRequest](../../models/operations/GetCdpSourceRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetCdpSourceResponse](../../models/operations/GetCdpSourceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCdpSources

List all sources

### Example Usage

<!-- UsageSnippet language="java" operationID="listCdpSources" method="get" path="/cdp/{connection_id}/source" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCdpSourcesRequest;
import to.unified.unified_java_sdk.models.operations.ListCdpSourcesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCdpSourcesRequest req = ListCdpSourcesRequest.builder()
                .connectionId("<id>")
                .build();

        ListCdpSourcesResponse res = sdk.source().listCdpSources()
                .request(req)
                .call();

        if (res.cdpSources().isPresent()) {
            System.out.println(res.cdpSources().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListCdpSourcesRequest](../../models/operations/ListCdpSourcesRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListCdpSourcesResponse](../../models/operations/ListCdpSourcesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCdpSource

Update a source

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCdpSource" method="patch" path="/cdp/{connection_id}/source/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCdpSourceRequest;
import to.unified.unified_java_sdk.models.operations.PatchCdpSourceResponse;
import to.unified.unified_java_sdk.models.shared.CdpSource;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCdpSourceRequest req = PatchCdpSourceRequest.builder()
                .cdpSource(CdpSource.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCdpSourceResponse res = sdk.source().patchCdpSource()
                .request(req)
                .call();

        if (res.cdpSource().isPresent()) {
            System.out.println(res.cdpSource().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchCdpSourceRequest](../../models/operations/PatchCdpSourceRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchCdpSourceResponse](../../models/operations/PatchCdpSourceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCdpSource

Remove a source

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCdpSource" method="delete" path="/cdp/{connection_id}/source/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCdpSourceRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCdpSourceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCdpSourceRequest req = RemoveCdpSourceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCdpSourceResponse res = sdk.source().removeCdpSource()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveCdpSourceRequest](../../models/operations/RemoveCdpSourceRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveCdpSourceResponse](../../models/operations/RemoveCdpSourceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCdpSource

Update a source

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCdpSource" method="put" path="/cdp/{connection_id}/source/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCdpSourceRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCdpSourceResponse;
import to.unified.unified_java_sdk.models.shared.CdpSource;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCdpSourceRequest req = UpdateCdpSourceRequest.builder()
                .cdpSource(CdpSource.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCdpSourceResponse res = sdk.source().updateCdpSource()
                .request(req)
                .call();

        if (res.cdpSource().isPresent()) {
            System.out.println(res.cdpSource().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateCdpSourceRequest](../../models/operations/UpdateCdpSourceRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateCdpSourceResponse](../../models/operations/UpdateCdpSourceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |