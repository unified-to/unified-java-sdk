# Property

## Overview

### Available Operations

* [createAnalyticsProperty](#createanalyticsproperty) - Create a property
* [getAnalyticsProperty](#getanalyticsproperty) - Retrieve a property
* [listAnalyticsProperties](#listanalyticsproperties) - List all properties
* [patchAnalyticsProperty](#patchanalyticsproperty) - Update a property
* [removeAnalyticsProperty](#removeanalyticsproperty) - Remove a property
* [updateAnalyticsProperty](#updateanalyticsproperty) - Update a property

## createAnalyticsProperty

Creates a AnalyticsProperty. Provide the unified AnalyticsProperty fields in the request body; they are mapped to the provider's API. Returns the created AnalyticsProperty.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAnalyticsProperty" method="post" path="/analytics/{connection_id}/property" example="analytics_property" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsPropertyRequest;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsPropertyResponse;
import to.unified.unified_java_sdk.models.shared.AnalyticsProperty;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAnalyticsPropertyRequest req = CreateAnalyticsPropertyRequest.builder()
                .analyticsProperty(AnalyticsProperty.builder()
                    .createdAt(OffsetDateTime.parse("2021-09-05T19:04:58.430Z"))
                    .currency("USD")
                    .id("6a8b3dad-60ee-4266-a6bd-7d71f28ae842")
                    .name("Daniel, Goldner and Dickinson")
                    .timezone("UTC")
                    .updatedAt(OffsetDateTime.parse("2021-09-14T21:00:33.670Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAnalyticsPropertyResponse res = sdk.property().createAnalyticsProperty()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAnalyticsPropertyRequest](../../models/operations/CreateAnalyticsPropertyRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAnalyticsPropertyResponse](../../models/operations/CreateAnalyticsPropertyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAnalyticsProperty

Retrieves a single AnalyticsProperty by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAnalyticsProperty" method="get" path="/analytics/{connection_id}/property/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsPropertyRequest;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsPropertyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAnalyticsPropertyRequest req = GetAnalyticsPropertyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAnalyticsPropertyResponse res = sdk.property().getAnalyticsProperty()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAnalyticsPropertyRequest](../../models/operations/GetAnalyticsPropertyRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAnalyticsPropertyResponse](../../models/operations/GetAnalyticsPropertyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAnalyticsProperties

Returns a list of AnalyticsProperties. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAnalyticsProperties" method="get" path="/analytics/{connection_id}/property" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsPropertiesRequest;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsPropertiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAnalyticsPropertiesRequest req = ListAnalyticsPropertiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAnalyticsPropertiesResponse res = sdk.property().listAnalyticsProperties()
                .request(req)
                .call();

        if (res.analyticsProperties().isPresent()) {
            System.out.println(res.analyticsProperties().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListAnalyticsPropertiesRequest](../../models/operations/ListAnalyticsPropertiesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListAnalyticsPropertiesResponse](../../models/operations/ListAnalyticsPropertiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAnalyticsProperty

Updates the AnalyticsProperty identified by `id`. Provide the unified AnalyticsProperty fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAnalyticsProperty" method="patch" path="/analytics/{connection_id}/property/{id}" example="analytics_property" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsPropertyRequest;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsPropertyResponse;
import to.unified.unified_java_sdk.models.shared.AnalyticsProperty;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAnalyticsPropertyRequest req = PatchAnalyticsPropertyRequest.builder()
                .analyticsProperty(AnalyticsProperty.builder()
                    .createdAt(OffsetDateTime.parse("2021-09-05T19:04:58.430Z"))
                    .currency("USD")
                    .id("2a17605a-8f2f-4095-863f-1827d142a68e")
                    .name("Daniel, Goldner and Dickinson")
                    .timezone("UTC")
                    .updatedAt(OffsetDateTime.parse("2021-09-14T21:00:33.671Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAnalyticsPropertyResponse res = sdk.property().patchAnalyticsProperty()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAnalyticsPropertyRequest](../../models/operations/PatchAnalyticsPropertyRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAnalyticsPropertyResponse](../../models/operations/PatchAnalyticsPropertyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAnalyticsProperty

Deletes the AnalyticsProperty identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAnalyticsProperty" method="delete" path="/analytics/{connection_id}/property/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAnalyticsPropertyRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAnalyticsPropertyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAnalyticsPropertyRequest req = RemoveAnalyticsPropertyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAnalyticsPropertyResponse res = sdk.property().removeAnalyticsProperty()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAnalyticsPropertyRequest](../../models/operations/RemoveAnalyticsPropertyRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAnalyticsPropertyResponse](../../models/operations/RemoveAnalyticsPropertyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAnalyticsProperty

Updates the AnalyticsProperty identified by `id`. Provide the unified AnalyticsProperty fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAnalyticsProperty" method="put" path="/analytics/{connection_id}/property/{id}" example="analytics_property" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsPropertyRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsPropertyResponse;
import to.unified.unified_java_sdk.models.shared.AnalyticsProperty;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAnalyticsPropertyRequest req = UpdateAnalyticsPropertyRequest.builder()
                .analyticsProperty(AnalyticsProperty.builder()
                    .createdAt(OffsetDateTime.parse("2021-09-05T19:04:58.430Z"))
                    .currency("USD")
                    .id("2a17605a-8f2f-4095-863f-1827d142a68e")
                    .name("Daniel, Goldner and Dickinson")
                    .timezone("UTC")
                    .updatedAt(OffsetDateTime.parse("2021-09-14T21:00:33.671Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAnalyticsPropertyResponse res = sdk.property().updateAnalyticsProperty()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAnalyticsPropertyRequest](../../models/operations/UpdateAnalyticsPropertyRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAnalyticsPropertyResponse](../../models/operations/UpdateAnalyticsPropertyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |