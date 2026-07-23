# Destination

## Overview

### Available Operations

* [createCdpDestination](#createcdpdestination) - Create a destination
* [getCdpDestination](#getcdpdestination) - Retrieve a destination
* [listCdpDestinations](#listcdpdestinations) - List all destinations
* [patchCdpDestination](#patchcdpdestination) - Update a destination
* [removeCdpDestination](#removecdpdestination) - Remove a destination
* [updateCdpDestination](#updatecdpdestination) - Update a destination

## createCdpDestination

Create a destination

### Example Usage

<!-- UsageSnippet language="java" operationID="createCdpDestination" method="post" path="/cdp/{connection_id}/destination" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCdpDestinationRequest;
import to.unified.unified_java_sdk.models.operations.CreateCdpDestinationResponse;
import to.unified.unified_java_sdk.models.shared.CdpDestination;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCdpDestinationRequest req = CreateCdpDestinationRequest.builder()
                .cdpDestination(CdpDestination.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCdpDestinationResponse res = sdk.destination().createCdpDestination()
                .request(req)
                .call();

        if (res.cdpDestination().isPresent()) {
            System.out.println(res.cdpDestination().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateCdpDestinationRequest](../../models/operations/CreateCdpDestinationRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateCdpDestinationResponse](../../models/operations/CreateCdpDestinationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCdpDestination

Retrieve a destination

### Example Usage

<!-- UsageSnippet language="java" operationID="getCdpDestination" method="get" path="/cdp/{connection_id}/destination/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCdpDestinationRequest;
import to.unified.unified_java_sdk.models.operations.GetCdpDestinationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCdpDestinationRequest req = GetCdpDestinationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCdpDestinationResponse res = sdk.destination().getCdpDestination()
                .request(req)
                .call();

        if (res.cdpDestination().isPresent()) {
            System.out.println(res.cdpDestination().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetCdpDestinationRequest](../../models/operations/GetCdpDestinationRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetCdpDestinationResponse](../../models/operations/GetCdpDestinationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCdpDestinations

List all destinations

### Example Usage

<!-- UsageSnippet language="java" operationID="listCdpDestinations" method="get" path="/cdp/{connection_id}/destination" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCdpDestinationsRequest;
import to.unified.unified_java_sdk.models.operations.ListCdpDestinationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCdpDestinationsRequest req = ListCdpDestinationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCdpDestinationsResponse res = sdk.destination().listCdpDestinations()
                .request(req)
                .call();

        if (res.cdpDestinations().isPresent()) {
            System.out.println(res.cdpDestinations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListCdpDestinationsRequest](../../models/operations/ListCdpDestinationsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListCdpDestinationsResponse](../../models/operations/ListCdpDestinationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCdpDestination

Update a destination

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCdpDestination" method="patch" path="/cdp/{connection_id}/destination/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCdpDestinationRequest;
import to.unified.unified_java_sdk.models.operations.PatchCdpDestinationResponse;
import to.unified.unified_java_sdk.models.shared.CdpDestination;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCdpDestinationRequest req = PatchCdpDestinationRequest.builder()
                .cdpDestination(CdpDestination.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCdpDestinationResponse res = sdk.destination().patchCdpDestination()
                .request(req)
                .call();

        if (res.cdpDestination().isPresent()) {
            System.out.println(res.cdpDestination().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchCdpDestinationRequest](../../models/operations/PatchCdpDestinationRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchCdpDestinationResponse](../../models/operations/PatchCdpDestinationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCdpDestination

Remove a destination

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCdpDestination" method="delete" path="/cdp/{connection_id}/destination/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCdpDestinationRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCdpDestinationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCdpDestinationRequest req = RemoveCdpDestinationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCdpDestinationResponse res = sdk.destination().removeCdpDestination()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveCdpDestinationRequest](../../models/operations/RemoveCdpDestinationRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveCdpDestinationResponse](../../models/operations/RemoveCdpDestinationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCdpDestination

Update a destination

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCdpDestination" method="put" path="/cdp/{connection_id}/destination/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCdpDestinationRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCdpDestinationResponse;
import to.unified.unified_java_sdk.models.shared.CdpDestination;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCdpDestinationRequest req = UpdateCdpDestinationRequest.builder()
                .cdpDestination(CdpDestination.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCdpDestinationResponse res = sdk.destination().updateCdpDestination()
                .request(req)
                .call();

        if (res.cdpDestination().isPresent()) {
            System.out.println(res.cdpDestination().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateCdpDestinationRequest](../../models/operations/UpdateCdpDestinationRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateCdpDestinationResponse](../../models/operations/UpdateCdpDestinationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |