# Activation

## Overview

### Available Operations

* [createCdpActivation](#createcdpactivation) - Create an activation
* [getCdpActivation](#getcdpactivation) - Retrieve an activation
* [listCdpActivations](#listcdpactivations) - List all activations
* [patchCdpActivation](#patchcdpactivation) - Update an activation
* [removeCdpActivation](#removecdpactivation) - Remove an activation
* [updateCdpActivation](#updatecdpactivation) - Update an activation

## createCdpActivation

Create an activation

### Example Usage

<!-- UsageSnippet language="java" operationID="createCdpActivation" method="post" path="/cdp/{connection_id}/activation" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCdpActivationRequest;
import to.unified.unified_java_sdk.models.operations.CreateCdpActivationResponse;
import to.unified.unified_java_sdk.models.shared.CdpActivation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCdpActivationRequest req = CreateCdpActivationRequest.builder()
                .cdpActivation(CdpActivation.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCdpActivationResponse res = sdk.activation().createCdpActivation()
                .request(req)
                .call();

        if (res.cdpActivation().isPresent()) {
            System.out.println(res.cdpActivation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateCdpActivationRequest](../../models/operations/CreateCdpActivationRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateCdpActivationResponse](../../models/operations/CreateCdpActivationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCdpActivation

Retrieve an activation

### Example Usage

<!-- UsageSnippet language="java" operationID="getCdpActivation" method="get" path="/cdp/{connection_id}/activation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCdpActivationRequest;
import to.unified.unified_java_sdk.models.operations.GetCdpActivationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCdpActivationRequest req = GetCdpActivationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCdpActivationResponse res = sdk.activation().getCdpActivation()
                .request(req)
                .call();

        if (res.cdpActivation().isPresent()) {
            System.out.println(res.cdpActivation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetCdpActivationRequest](../../models/operations/GetCdpActivationRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetCdpActivationResponse](../../models/operations/GetCdpActivationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCdpActivations

List all activations

### Example Usage

<!-- UsageSnippet language="java" operationID="listCdpActivations" method="get" path="/cdp/{connection_id}/activation" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCdpActivationsRequest;
import to.unified.unified_java_sdk.models.operations.ListCdpActivationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCdpActivationsRequest req = ListCdpActivationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCdpActivationsResponse res = sdk.activation().listCdpActivations()
                .request(req)
                .call();

        if (res.cdpActivations().isPresent()) {
            System.out.println(res.cdpActivations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListCdpActivationsRequest](../../models/operations/ListCdpActivationsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListCdpActivationsResponse](../../models/operations/ListCdpActivationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCdpActivation

Update an activation

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCdpActivation" method="patch" path="/cdp/{connection_id}/activation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCdpActivationRequest;
import to.unified.unified_java_sdk.models.operations.PatchCdpActivationResponse;
import to.unified.unified_java_sdk.models.shared.CdpActivation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCdpActivationRequest req = PatchCdpActivationRequest.builder()
                .cdpActivation(CdpActivation.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCdpActivationResponse res = sdk.activation().patchCdpActivation()
                .request(req)
                .call();

        if (res.cdpActivation().isPresent()) {
            System.out.println(res.cdpActivation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchCdpActivationRequest](../../models/operations/PatchCdpActivationRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchCdpActivationResponse](../../models/operations/PatchCdpActivationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCdpActivation

Remove an activation

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCdpActivation" method="delete" path="/cdp/{connection_id}/activation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCdpActivationRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCdpActivationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCdpActivationRequest req = RemoveCdpActivationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCdpActivationResponse res = sdk.activation().removeCdpActivation()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveCdpActivationRequest](../../models/operations/RemoveCdpActivationRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveCdpActivationResponse](../../models/operations/RemoveCdpActivationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCdpActivation

Update an activation

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCdpActivation" method="put" path="/cdp/{connection_id}/activation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCdpActivationRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCdpActivationResponse;
import to.unified.unified_java_sdk.models.shared.CdpActivation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCdpActivationRequest req = UpdateCdpActivationRequest.builder()
                .cdpActivation(CdpActivation.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCdpActivationResponse res = sdk.activation().updateCdpActivation()
                .request(req)
                .call();

        if (res.cdpActivation().isPresent()) {
            System.out.println(res.cdpActivation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateCdpActivationRequest](../../models/operations/UpdateCdpActivationRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateCdpActivationResponse](../../models/operations/UpdateCdpActivationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |