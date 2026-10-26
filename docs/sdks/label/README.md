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

Creates a ShippingLabel. Provide the unified ShippingLabel fields in the request body; they are mapped to the provider's API. Returns the created ShippingLabel.

### Example Usage

<!-- UsageSnippet language="java" operationID="createShippingLabel" method="post" path="/shipping/{connection_id}/label" example="shipping_label" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateShippingLabelRequest;
import to.unified.unified_java_sdk.models.operations.CreateShippingLabelResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateShippingLabelRequest req = CreateShippingLabelRequest.builder()
                .shippingLabel(ShippingLabel.builder()
                    .createdAt(OffsetDateTime.parse("2022-11-18T16:45:38.067Z"))
                    .id("c44676d6-b5ab-4964-9673-72e725a8b0e6")
                    .isVoided(false)
                    .labelCost(40.83653403213248)
                    .labelCostCurrency("USD")
                    .labelFormat(LabelFormat.PNG)
                    .labelUrl("https://labels.example.com/c44676d6-b5ab-4964-9673-72e725a8b0e6.pdf")
                    .metadata(List.of())
                    .serviceCode("Dzy")
                    .status(ShippingLabelStatus.EXCEPTION)
                    .trackingNumber("ZYV60FOIBUJ6")
                    .updatedAt(OffsetDateTime.parse("2024-04-30T17:19:07.014Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateShippingLabelResponse res = sdk.label().createShippingLabel()
                .request(req)
                .call();

        if (res.shippingLabel().isPresent()) {
            System.out.println(res.shippingLabel().get());
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

Retrieves a single ShippingLabel by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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
            System.out.println(res.shippingLabel().get());
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

Returns a list of ShippingLabels. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
            System.out.println(res.shippingLabels().get());
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

Updates the ShippingLabel identified by `id`. Provide the unified ShippingLabel fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchShippingLabel" method="patch" path="/shipping/{connection_id}/label/{id}" example="shipping_label" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchShippingLabelRequest;
import to.unified.unified_java_sdk.models.operations.PatchShippingLabelResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchShippingLabelRequest req = PatchShippingLabelRequest.builder()
                .shippingLabel(ShippingLabel.builder()
                    .createdAt(OffsetDateTime.parse("2022-11-18T16:45:38.067Z"))
                    .id("5904aa88-8bec-4954-a724-f9fc05935eef")
                    .isVoided(false)
                    .labelCost(40.83653403213248)
                    .labelCostCurrency("USD")
                    .labelFormat(LabelFormat.PNG)
                    .labelUrl("https://labels.example.com/5904aa88-8bec-4954-a724-f9fc05935eef.pdf")
                    .metadata(List.of())
                    .serviceCode("Dzy")
                    .status(ShippingLabelStatus.EXCEPTION)
                    .trackingNumber("ZYV60FOIBUJ6")
                    .updatedAt(OffsetDateTime.parse("2024-04-30T17:19:07.022Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchShippingLabelResponse res = sdk.label().patchShippingLabel()
                .request(req)
                .call();

        if (res.shippingLabel().isPresent()) {
            System.out.println(res.shippingLabel().get());
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

Deletes the ShippingLabel identified by `id`.

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

Updates the ShippingLabel identified by `id`. Provide the unified ShippingLabel fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateShippingLabel" method="put" path="/shipping/{connection_id}/label/{id}" example="shipping_label" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateShippingLabelRequest;
import to.unified.unified_java_sdk.models.operations.UpdateShippingLabelResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateShippingLabelRequest req = UpdateShippingLabelRequest.builder()
                .shippingLabel(ShippingLabel.builder()
                    .createdAt(OffsetDateTime.parse("2022-11-18T16:45:38.067Z"))
                    .id("5904aa88-8bec-4954-a724-f9fc05935eef")
                    .isVoided(false)
                    .labelCost(40.83653403213248)
                    .labelCostCurrency("USD")
                    .labelFormat(LabelFormat.PNG)
                    .labelUrl("https://labels.example.com/5904aa88-8bec-4954-a724-f9fc05935eef.pdf")
                    .metadata(List.of())
                    .serviceCode("Dzy")
                    .status(ShippingLabelStatus.EXCEPTION)
                    .trackingNumber("ZYV60FOIBUJ6")
                    .updatedAt(OffsetDateTime.parse("2024-04-30T17:19:07.022Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateShippingLabelResponse res = sdk.label().updateShippingLabel()
                .request(req)
                .call();

        if (res.shippingLabel().isPresent()) {
            System.out.println(res.shippingLabel().get());
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