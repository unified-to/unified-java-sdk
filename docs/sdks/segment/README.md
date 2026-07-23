# Segment

## Overview

### Available Operations

* [createCdpSegment](#createcdpsegment) - Create a segment
* [getCdpSegment](#getcdpsegment) - Retrieve a segment
* [listCdpSegments](#listcdpsegments) - List all segments
* [patchCdpSegment](#patchcdpsegment) - Update a segment
* [removeCdpSegment](#removecdpsegment) - Remove a segment
* [updateCdpSegment](#updatecdpsegment) - Update a segment

## createCdpSegment

Create a segment

### Example Usage

<!-- UsageSnippet language="java" operationID="createCdpSegment" method="post" path="/cdp/{connection_id}/segment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCdpSegmentRequest;
import to.unified.unified_java_sdk.models.operations.CreateCdpSegmentResponse;
import to.unified.unified_java_sdk.models.shared.CdpSegment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCdpSegmentRequest req = CreateCdpSegmentRequest.builder()
                .cdpSegment(CdpSegment.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCdpSegmentResponse res = sdk.segment().createCdpSegment()
                .request(req)
                .call();

        if (res.cdpSegment().isPresent()) {
            System.out.println(res.cdpSegment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateCdpSegmentRequest](../../models/operations/CreateCdpSegmentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateCdpSegmentResponse](../../models/operations/CreateCdpSegmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCdpSegment

Retrieve a segment

### Example Usage

<!-- UsageSnippet language="java" operationID="getCdpSegment" method="get" path="/cdp/{connection_id}/segment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCdpSegmentRequest;
import to.unified.unified_java_sdk.models.operations.GetCdpSegmentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCdpSegmentRequest req = GetCdpSegmentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCdpSegmentResponse res = sdk.segment().getCdpSegment()
                .request(req)
                .call();

        if (res.cdpSegment().isPresent()) {
            System.out.println(res.cdpSegment().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetCdpSegmentRequest](../../models/operations/GetCdpSegmentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetCdpSegmentResponse](../../models/operations/GetCdpSegmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCdpSegments

List all segments

### Example Usage

<!-- UsageSnippet language="java" operationID="listCdpSegments" method="get" path="/cdp/{connection_id}/segment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCdpSegmentsRequest;
import to.unified.unified_java_sdk.models.operations.ListCdpSegmentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCdpSegmentsRequest req = ListCdpSegmentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCdpSegmentsResponse res = sdk.segment().listCdpSegments()
                .request(req)
                .call();

        if (res.cdpSegments().isPresent()) {
            System.out.println(res.cdpSegments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListCdpSegmentsRequest](../../models/operations/ListCdpSegmentsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListCdpSegmentsResponse](../../models/operations/ListCdpSegmentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCdpSegment

Update a segment

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCdpSegment" method="patch" path="/cdp/{connection_id}/segment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCdpSegmentRequest;
import to.unified.unified_java_sdk.models.operations.PatchCdpSegmentResponse;
import to.unified.unified_java_sdk.models.shared.CdpSegment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCdpSegmentRequest req = PatchCdpSegmentRequest.builder()
                .cdpSegment(CdpSegment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCdpSegmentResponse res = sdk.segment().patchCdpSegment()
                .request(req)
                .call();

        if (res.cdpSegment().isPresent()) {
            System.out.println(res.cdpSegment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchCdpSegmentRequest](../../models/operations/PatchCdpSegmentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchCdpSegmentResponse](../../models/operations/PatchCdpSegmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCdpSegment

Remove a segment

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCdpSegment" method="delete" path="/cdp/{connection_id}/segment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCdpSegmentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCdpSegmentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCdpSegmentRequest req = RemoveCdpSegmentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCdpSegmentResponse res = sdk.segment().removeCdpSegment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveCdpSegmentRequest](../../models/operations/RemoveCdpSegmentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveCdpSegmentResponse](../../models/operations/RemoveCdpSegmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCdpSegment

Update a segment

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCdpSegment" method="put" path="/cdp/{connection_id}/segment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCdpSegmentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCdpSegmentResponse;
import to.unified.unified_java_sdk.models.shared.CdpSegment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCdpSegmentRequest req = UpdateCdpSegmentRequest.builder()
                .cdpSegment(CdpSegment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCdpSegmentResponse res = sdk.segment().updateCdpSegment()
                .request(req)
                .call();

        if (res.cdpSegment().isPresent()) {
            System.out.println(res.cdpSegment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateCdpSegmentRequest](../../models/operations/UpdateCdpSegmentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateCdpSegmentResponse](../../models/operations/UpdateCdpSegmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |