# Label

## Overview

### Available Operations

* [createShippingLabel](#createshippinglabel) - Create a label
* [getShippingLabel](#getshippinglabel) - Retrieve a label
* [listShippingLabels](#listshippinglabels) - List all labels
* [patchShippingLabel](#patchshippinglabel) - Update a label
* [removeShippingLabel](#removeshippinglabel) - Remove a label
* [updateShippingLabel](#updateshippinglabel) - Update a label

## createShippingLabel

Create a label

### Example Usage

<!-- UsageSnippet language="java" operationID="createShippingLabel" method="post" path="/shipping/{connection_id}/label" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateShippingLabelRequest;
import to.unified.unified_java_sdk.models.operations.CreateShippingLabelResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.ShippingLabel;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateShippingLabelRequest req = CreateShippingLabelRequest.builder()
                .shippingLabel(ShippingLabel.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateShippingLabelResponse res = sdk.label().createShippingLabel()
                .request(req)
                .call();

        if (res.shippingLabel().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateShippingLabelRequest](../../models/operations/CreateShippingLabelRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateShippingLabelResponse](../../models/operations/CreateShippingLabelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getShippingLabel

Retrieve a label

### Example Usage

<!-- UsageSnippet language="java" operationID="getShippingLabel" method="get" path="/shipping/{connection_id}/label/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetShippingLabelRequest;
import to.unified.unified_java_sdk.models.operations.GetShippingLabelResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetShippingLabelRequest req = GetShippingLabelRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetShippingLabelResponse res = sdk.label().getShippingLabel()
                .request(req)
                .call();

        if (res.shippingLabel().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetShippingLabelRequest](../../models/operations/GetShippingLabelRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetShippingLabelResponse](../../models/operations/GetShippingLabelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listShippingLabels

List all labels

### Example Usage

<!-- UsageSnippet language="java" operationID="listShippingLabels" method="get" path="/shipping/{connection_id}/label" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListShippingLabelsRequest;
import to.unified.unified_java_sdk.models.operations.ListShippingLabelsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListShippingLabelsRequest req = ListShippingLabelsRequest.builder()
                .connectionId("<id>")
                .build();

        ListShippingLabelsResponse res = sdk.label().listShippingLabels()
                .request(req)
                .call();

        if (res.shippingLabels().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListShippingLabelsRequest](../../models/operations/ListShippingLabelsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListShippingLabelsResponse](../../models/operations/ListShippingLabelsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchShippingLabel

Update a label

### Example Usage

<!-- UsageSnippet language="java" operationID="patchShippingLabel" method="patch" path="/shipping/{connection_id}/label/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchShippingLabelRequest;
import to.unified.unified_java_sdk.models.operations.PatchShippingLabelResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.ShippingLabel;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchShippingLabelRequest req = PatchShippingLabelRequest.builder()
                .shippingLabel(ShippingLabel.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchShippingLabelResponse res = sdk.label().patchShippingLabel()
                .request(req)
                .call();

        if (res.shippingLabel().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchShippingLabelRequest](../../models/operations/PatchShippingLabelRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchShippingLabelResponse](../../models/operations/PatchShippingLabelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeShippingLabel

Remove a label

### Example Usage

<!-- UsageSnippet language="java" operationID="removeShippingLabel" method="delete" path="/shipping/{connection_id}/label/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveShippingLabelRequest;
import to.unified.unified_java_sdk.models.operations.RemoveShippingLabelResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveShippingLabelRequest req = RemoveShippingLabelRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveShippingLabelResponse res = sdk.label().removeShippingLabel()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveShippingLabelRequest](../../models/operations/RemoveShippingLabelRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveShippingLabelResponse](../../models/operations/RemoveShippingLabelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateShippingLabel

Update a label

### Example Usage

<!-- UsageSnippet language="java" operationID="updateShippingLabel" method="put" path="/shipping/{connection_id}/label/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateShippingLabelRequest;
import to.unified.unified_java_sdk.models.operations.UpdateShippingLabelResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.ShippingLabel;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateShippingLabelRequest req = UpdateShippingLabelRequest.builder()
                .shippingLabel(ShippingLabel.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateShippingLabelResponse res = sdk.label().updateShippingLabel()
                .request(req)
                .call();

        if (res.shippingLabel().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateShippingLabelRequest](../../models/operations/UpdateShippingLabelRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateShippingLabelResponse](../../models/operations/UpdateShippingLabelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |